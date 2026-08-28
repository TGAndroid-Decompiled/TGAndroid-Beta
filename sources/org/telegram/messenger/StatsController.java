package org.telegram.messenger;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.io.RandomAccessFile;
import java.lang.reflect.Array;
public class StatsController extends BaseController {
    private static final int OLD_TYPES_COUNT = 7;
    private static final int TYPES_COUNT = 8;
    public static final int TYPE_AUDIOS = 3;
    public static final int TYPE_CALLS = 0;
    public static final int TYPE_FILES = 5;
    public static final int TYPE_MESSAGES = 1;
    public static final int TYPE_MOBILE = 0;
    public static final int TYPE_MUSIC = 7;
    public static final int TYPE_PHOTOS = 4;
    public static final int TYPE_ROAMING = 2;
    public static final int TYPE_TOTAL = 6;
    public static final int TYPE_VIDEOS = 2;
    public static final int TYPE_WIFI = 1;
    private byte[] buffer;
    ff.d0 byteArrayOutputStream;
    private int[] callsTotalTime;
    private long lastInternalStatsSaveTime;
    private long[][] receivedBytes;
    private int[][] receivedItems;
    private long[] resetStatsDate;
    private Runnable saveRunnable;
    private long[][] sentBytes;
    private int[][] sentItems;
    private RandomAccessFile statsFile;
    private static DispatchQueue statsSaveQueue = new DispatchQueue("statsSaveQueue");
    private static final ThreadLocal<Long> lastStatsSaveTime = new ThreadLocal<Long>() {
        @Override
        public Long initialValue() {
            return Long.valueOf(System.currentTimeMillis() - 1000);
        }
    };
    private static volatile StatsController[] Instance = new StatsController[4];

    private StatsController(int i9) {
        super(i9);
        SharedPreferences sharedPreferences;
        this.buffer = new byte[8];
        Class cls = Long.TYPE;
        this.sentBytes = (long[][]) Array.newInstance(cls, 3, 8);
        this.receivedBytes = (long[][]) Array.newInstance(cls, 3, 8);
        Class cls2 = Integer.TYPE;
        this.sentItems = (int[][]) Array.newInstance(cls2, 3, 8);
        this.receivedItems = (int[][]) Array.newInstance(cls2, 3, 8);
        this.resetStatsDate = new long[3];
        this.callsTotalTime = new int[3];
        this.byteArrayOutputStream = new ff.d0(32);
        this.saveRunnable = new Runnable() {
            @Override
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                if (Math.abs(currentTimeMillis - StatsController.this.lastInternalStatsSaveTime) >= 2000) {
                    StatsController.this.lastInternalStatsSaveTime = currentTimeMillis;
                    try {
                        StatsController.this.byteArrayOutputStream.b();
                        for (int i10 = 0; i10 < 3; i10++) {
                            for (int i11 = 0; i11 < 7; i11++) {
                                StatsController statsController = StatsController.this;
                                statsController.byteArrayOutputStream.write(statsController.longToBytes(statsController.sentBytes[i10][i11]), 0, 8);
                                StatsController statsController2 = StatsController.this;
                                statsController2.byteArrayOutputStream.write(statsController2.longToBytes(statsController2.receivedBytes[i10][i11]), 0, 8);
                                StatsController statsController3 = StatsController.this;
                                statsController3.byteArrayOutputStream.write(statsController3.intToBytes(statsController3.sentItems[i10][i11]), 0, 4);
                                StatsController statsController4 = StatsController.this;
                                statsController4.byteArrayOutputStream.write(statsController4.intToBytes(statsController4.receivedItems[i10][i11]), 0, 4);
                            }
                            StatsController statsController5 = StatsController.this;
                            statsController5.byteArrayOutputStream.write(statsController5.intToBytes(statsController5.callsTotalTime[i10]), 0, 4);
                            StatsController statsController6 = StatsController.this;
                            statsController6.byteArrayOutputStream.write(statsController6.longToBytes(statsController6.resetStatsDate[i10]), 0, 8);
                        }
                        for (int i12 = 0; i12 < 3; i12++) {
                            StatsController statsController7 = StatsController.this;
                            statsController7.byteArrayOutputStream.write(statsController7.longToBytes(statsController7.sentBytes[i12][7]), 0, 8);
                            StatsController statsController8 = StatsController.this;
                            statsController8.byteArrayOutputStream.write(statsController8.longToBytes(statsController8.receivedBytes[i12][7]), 0, 8);
                            StatsController statsController9 = StatsController.this;
                            statsController9.byteArrayOutputStream.write(statsController9.intToBytes(statsController9.sentItems[i12][7]), 0, 4);
                            StatsController statsController10 = StatsController.this;
                            statsController10.byteArrayOutputStream.write(statsController10.intToBytes(statsController10.receivedItems[i12][7]), 0, 4);
                        }
                        StatsController.this.statsFile.seek(0L);
                        RandomAccessFile randomAccessFile = StatsController.this.statsFile;
                        ff.d0 d0Var = StatsController.this.byteArrayOutputStream;
                        randomAccessFile.write(d0Var.f6161a, 0, d0Var.f6162b);
                        StatsController.this.statsFile.getFD().sync();
                    } catch (Exception unused) {
                    }
                }
            }
        };
        File filesDirFixed = ApplicationLoader.getFilesDirFixed();
        if (i9 != 0) {
            filesDirFixed = new File(ApplicationLoader.getFilesDirFixed(), j3.r0.m(i9, "account", "/"));
            filesDirFixed.mkdirs();
        }
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(new File(filesDirFixed, "stats2.dat"), "rw");
            this.statsFile = randomAccessFile;
            if (randomAccessFile.length() > 0) {
                boolean z10 = false;
                for (int i10 = 0; i10 < 3; i10++) {
                    for (int i11 = 0; i11 < 7; i11++) {
                        this.statsFile.readFully(this.buffer, 0, 8);
                        this.sentBytes[i10][i11] = bytesToLong(this.buffer);
                        this.statsFile.readFully(this.buffer, 0, 8);
                        this.receivedBytes[i10][i11] = bytesToLong(this.buffer);
                        this.statsFile.readFully(this.buffer, 0, 4);
                        this.sentItems[i10][i11] = bytesToInt(this.buffer);
                        this.statsFile.readFully(this.buffer, 0, 4);
                        this.receivedItems[i10][i11] = bytesToInt(this.buffer);
                    }
                    this.statsFile.readFully(this.buffer, 0, 4);
                    this.callsTotalTime[i10] = bytesToInt(this.buffer);
                    this.statsFile.readFully(this.buffer, 0, 8);
                    this.resetStatsDate[i10] = bytesToLong(this.buffer);
                    long[] jArr = this.resetStatsDate;
                    if (jArr[i10] == 0) {
                        jArr[i10] = System.currentTimeMillis();
                        z10 = true;
                    }
                }
                for (int i12 = 0; i12 < 3; i12++) {
                    this.statsFile.readFully(this.buffer, 0, 8);
                    this.sentBytes[i12][7] = bytesToLong(this.buffer);
                    this.statsFile.readFully(this.buffer, 0, 8);
                    this.receivedBytes[i12][7] = bytesToLong(this.buffer);
                    this.statsFile.readFully(this.buffer, 0, 4);
                    this.sentItems[i12][7] = bytesToInt(this.buffer);
                    this.statsFile.readFully(this.buffer, 0, 4);
                    this.receivedItems[i12][7] = bytesToInt(this.buffer);
                }
                if (z10) {
                    saveStats();
                    return;
                }
                return;
            }
        } catch (Exception unused) {
        }
        if (i9 == 0) {
            sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("stats", 0);
        } else {
            Context context = ApplicationLoader.applicationContext;
            sharedPreferences = context.getSharedPreferences("stats" + i9, 0);
        }
        boolean z11 = false;
        for (int i13 = 0; i13 < 3; i13++) {
            int[] iArr = this.callsTotalTime;
            iArr[i13] = sharedPreferences.getInt("callsTotalTime" + i13, 0);
            long[] jArr2 = this.resetStatsDate;
            jArr2[i13] = sharedPreferences.getLong("resetStatsDate" + i13, 0L);
            for (int i14 = 0; i14 < 8; i14++) {
                this.sentBytes[i13][i14] = sharedPreferences.getLong(aa.d.k(i13, i14, "sentBytes", "_"), 0L);
                this.receivedBytes[i13][i14] = sharedPreferences.getLong(aa.d.k(i13, i14, "receivedBytes", "_"), 0L);
                this.sentItems[i13][i14] = sharedPreferences.getInt(aa.d.k(i13, i14, "sentItems", "_"), 0);
                this.receivedItems[i13][i14] = sharedPreferences.getInt(aa.d.k(i13, i14, "receivedItems", "_"), 0);
            }
            long[] jArr3 = this.resetStatsDate;
            if (jArr3[i13] == 0) {
                jArr3[i13] = System.currentTimeMillis();
                z11 = true;
            }
        }
        if (z11) {
            saveStats();
        }
    }

    private int bytesToInt(byte[] bArr) {
        return (bArr[3] & 255) | (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
    }

    private long bytesToLong(byte[] bArr) {
        return ((bArr[0] & 255) << 56) | ((bArr[1] & 255) << 48) | ((bArr[2] & 255) << 40) | ((bArr[3] & 255) << 32) | ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (255 & bArr[7]);
    }

    public static StatsController getInstance(int i9) {
        StatsController statsController;
        StatsController statsController2 = Instance[i9];
        if (statsController2 == null) {
            synchronized (StatsController.class) {
                try {
                    statsController = Instance[i9];
                    if (statsController == null) {
                        StatsController[] statsControllerArr = Instance;
                        StatsController statsController3 = new StatsController(i9);
                        statsControllerArr[i9] = statsController3;
                        statsController = statsController3;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return statsController;
        }
        return statsController2;
    }

    public byte[] intToBytes(int i9) {
        byte[] bArr = this.buffer;
        bArr[0] = (byte) (i9 >>> 24);
        bArr[1] = (byte) (i9 >>> 16);
        bArr[2] = (byte) (i9 >>> 8);
        bArr[3] = (byte) i9;
        return bArr;
    }

    public byte[] longToBytes(long j10) {
        byte[] bArr = this.buffer;
        bArr[0] = (byte) (j10 >>> 56);
        bArr[1] = (byte) (j10 >>> 48);
        bArr[2] = (byte) (j10 >>> 40);
        bArr[3] = (byte) (j10 >>> 32);
        bArr[4] = (byte) (j10 >>> 24);
        bArr[5] = (byte) (j10 >>> 16);
        bArr[6] = (byte) (j10 >>> 8);
        bArr[7] = (byte) j10;
        return bArr;
    }

    private void saveStats() {
        long currentTimeMillis = System.currentTimeMillis();
        ThreadLocal<Long> threadLocal = lastStatsSaveTime;
        if (Math.abs(currentTimeMillis - threadLocal.get().longValue()) >= 2000) {
            threadLocal.set(Long.valueOf(currentTimeMillis));
            statsSaveQueue.cancelRunnable(this.saveRunnable);
            statsSaveQueue.postRunnable(this.saveRunnable);
        }
    }

    public int getCallsTotalTime(int i9) {
        return this.callsTotalTime[i9];
    }

    public long getReceivedBytesCount(int i9, int i10) {
        if (i10 == 1) {
            long[] jArr = this.receivedBytes[i9];
            return ((((jArr[6] - jArr[5]) - jArr[3]) - jArr[2]) - jArr[4]) - jArr[7];
        }
        return this.receivedBytes[i9][i10];
    }

    public int getRecivedItemsCount(int i9, int i10) {
        return this.receivedItems[i9][i10];
    }

    public long getResetStatsDate(int i9) {
        return this.resetStatsDate[i9];
    }

    public long getSentBytesCount(int i9, int i10) {
        if (i10 == 1) {
            long[] jArr = this.sentBytes[i9];
            return ((((jArr[6] - jArr[5]) - jArr[3]) - jArr[2]) - jArr[4]) - jArr[7];
        }
        return this.sentBytes[i9][i10];
    }

    public int getSentItemsCount(int i9, int i10) {
        return this.sentItems[i9][i10];
    }

    public void incrementReceivedBytesCount(int i9, int i10, long j10) {
        long[] jArr = this.receivedBytes[i9];
        jArr[i10] = jArr[i10] + j10;
        saveStats();
    }

    public void incrementReceivedItemsCount(int i9, int i10, int i11) {
        int[] iArr = this.receivedItems[i9];
        iArr[i10] = iArr[i10] + i11;
        saveStats();
    }

    public void incrementSentBytesCount(int i9, int i10, long j10) {
        long[] jArr = this.sentBytes[i9];
        jArr[i10] = jArr[i10] + j10;
        saveStats();
    }

    public void incrementSentItemsCount(int i9, int i10, int i11) {
        int[] iArr = this.sentItems[i9];
        iArr[i10] = iArr[i10] + i11;
        saveStats();
    }

    public void incrementTotalCallsTime(int i9, int i10) {
        int[] iArr = this.callsTotalTime;
        iArr[i9] = iArr[i9] + i10;
        saveStats();
    }

    public void resetStats(int i9) {
        this.resetStatsDate[i9] = System.currentTimeMillis();
        for (int i10 = 0; i10 < 8; i10++) {
            this.sentBytes[i9][i10] = 0;
            this.receivedBytes[i9][i10] = 0;
            this.sentItems[i9][i10] = 0;
            this.receivedItems[i9][i10] = 0;
        }
        this.callsTotalTime[i9] = 0;
        saveStats();
    }
}
