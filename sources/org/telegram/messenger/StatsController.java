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
    yf.a0 byteArrayOutputStream;
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

    private StatsController(int i10) {
        super(i10);
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
        this.byteArrayOutputStream = new yf.a0(32);
        this.saveRunnable = new Runnable() {
            @Override
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                if (Math.abs(currentTimeMillis - StatsController.this.lastInternalStatsSaveTime) >= 2000) {
                    StatsController.this.lastInternalStatsSaveTime = currentTimeMillis;
                    try {
                        StatsController.this.byteArrayOutputStream.b();
                        for (int i11 = 0; i11 < 3; i11++) {
                            for (int i12 = 0; i12 < 7; i12++) {
                                StatsController statsController = StatsController.this;
                                statsController.byteArrayOutputStream.write(statsController.longToBytes(statsController.sentBytes[i11][i12]), 0, 8);
                                StatsController statsController2 = StatsController.this;
                                statsController2.byteArrayOutputStream.write(statsController2.longToBytes(statsController2.receivedBytes[i11][i12]), 0, 8);
                                StatsController statsController3 = StatsController.this;
                                statsController3.byteArrayOutputStream.write(statsController3.intToBytes(statsController3.sentItems[i11][i12]), 0, 4);
                                StatsController statsController4 = StatsController.this;
                                statsController4.byteArrayOutputStream.write(statsController4.intToBytes(statsController4.receivedItems[i11][i12]), 0, 4);
                            }
                            StatsController statsController5 = StatsController.this;
                            statsController5.byteArrayOutputStream.write(statsController5.intToBytes(statsController5.callsTotalTime[i11]), 0, 4);
                            StatsController statsController6 = StatsController.this;
                            statsController6.byteArrayOutputStream.write(statsController6.longToBytes(statsController6.resetStatsDate[i11]), 0, 8);
                        }
                        for (int i13 = 0; i13 < 3; i13++) {
                            StatsController statsController7 = StatsController.this;
                            statsController7.byteArrayOutputStream.write(statsController7.longToBytes(statsController7.sentBytes[i13][7]), 0, 8);
                            StatsController statsController8 = StatsController.this;
                            statsController8.byteArrayOutputStream.write(statsController8.longToBytes(statsController8.receivedBytes[i13][7]), 0, 8);
                            StatsController statsController9 = StatsController.this;
                            statsController9.byteArrayOutputStream.write(statsController9.intToBytes(statsController9.sentItems[i13][7]), 0, 4);
                            StatsController statsController10 = StatsController.this;
                            statsController10.byteArrayOutputStream.write(statsController10.intToBytes(statsController10.receivedItems[i13][7]), 0, 4);
                        }
                        StatsController.this.statsFile.seek(0L);
                        RandomAccessFile randomAccessFile = StatsController.this.statsFile;
                        yf.a0 a0Var = StatsController.this.byteArrayOutputStream;
                        randomAccessFile.write(a0Var.f50078a, 0, a0Var.f50079b);
                        StatsController.this.statsFile.getFD().sync();
                    } catch (Exception unused) {
                    }
                }
            }
        };
        File filesDirFixed = ApplicationLoader.getFilesDirFixed();
        if (i10 != 0) {
            filesDirFixed = new File(ApplicationLoader.getFilesDirFixed(), i2.g.j(i10, "account", "/"));
            filesDirFixed.mkdirs();
        }
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(new File(filesDirFixed, "stats2.dat"), "rw");
            this.statsFile = randomAccessFile;
            if (randomAccessFile.length() > 0) {
                boolean z10 = false;
                for (int i11 = 0; i11 < 3; i11++) {
                    for (int i12 = 0; i12 < 7; i12++) {
                        this.statsFile.readFully(this.buffer, 0, 8);
                        this.sentBytes[i11][i12] = bytesToLong(this.buffer);
                        this.statsFile.readFully(this.buffer, 0, 8);
                        this.receivedBytes[i11][i12] = bytesToLong(this.buffer);
                        this.statsFile.readFully(this.buffer, 0, 4);
                        this.sentItems[i11][i12] = bytesToInt(this.buffer);
                        this.statsFile.readFully(this.buffer, 0, 4);
                        this.receivedItems[i11][i12] = bytesToInt(this.buffer);
                    }
                    this.statsFile.readFully(this.buffer, 0, 4);
                    this.callsTotalTime[i11] = bytesToInt(this.buffer);
                    this.statsFile.readFully(this.buffer, 0, 8);
                    this.resetStatsDate[i11] = bytesToLong(this.buffer);
                    long[] jArr = this.resetStatsDate;
                    if (jArr[i11] == 0) {
                        jArr[i11] = System.currentTimeMillis();
                        z10 = true;
                    }
                }
                for (int i13 = 0; i13 < 3; i13++) {
                    this.statsFile.readFully(this.buffer, 0, 8);
                    this.sentBytes[i13][7] = bytesToLong(this.buffer);
                    this.statsFile.readFully(this.buffer, 0, 8);
                    this.receivedBytes[i13][7] = bytesToLong(this.buffer);
                    this.statsFile.readFully(this.buffer, 0, 4);
                    this.sentItems[i13][7] = bytesToInt(this.buffer);
                    this.statsFile.readFully(this.buffer, 0, 4);
                    this.receivedItems[i13][7] = bytesToInt(this.buffer);
                }
                if (z10) {
                    saveStats();
                    return;
                }
                return;
            }
        } catch (Exception unused) {
        }
        if (i10 == 0) {
            sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("stats", 0);
        } else {
            Context context = ApplicationLoader.applicationContext;
            sharedPreferences = context.getSharedPreferences("stats" + i10, 0);
        }
        boolean z11 = false;
        for (int i14 = 0; i14 < 3; i14++) {
            int[] iArr = this.callsTotalTime;
            iArr[i14] = sharedPreferences.getInt("callsTotalTime" + i14, 0);
            long[] jArr2 = this.resetStatsDate;
            jArr2[i14] = sharedPreferences.getLong("resetStatsDate" + i14, 0L);
            for (int i15 = 0; i15 < 8; i15++) {
                this.sentBytes[i14][i15] = sharedPreferences.getLong(a4.a.l(i14, i15, "sentBytes", "_"), 0L);
                this.receivedBytes[i14][i15] = sharedPreferences.getLong(a4.a.l(i14, i15, "receivedBytes", "_"), 0L);
                this.sentItems[i14][i15] = sharedPreferences.getInt(a4.a.l(i14, i15, "sentItems", "_"), 0);
                this.receivedItems[i14][i15] = sharedPreferences.getInt(a4.a.l(i14, i15, "receivedItems", "_"), 0);
            }
            long[] jArr3 = this.resetStatsDate;
            if (jArr3[i14] == 0) {
                jArr3[i14] = System.currentTimeMillis();
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

    public static StatsController getInstance(int i10) {
        StatsController statsController;
        StatsController statsController2 = Instance[i10];
        if (statsController2 == null) {
            synchronized (StatsController.class) {
                try {
                    statsController = Instance[i10];
                    if (statsController == null) {
                        StatsController[] statsControllerArr = Instance;
                        StatsController statsController3 = new StatsController(i10);
                        statsControllerArr[i10] = statsController3;
                        statsController = statsController3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return statsController;
        }
        return statsController2;
    }

    public byte[] intToBytes(int i10) {
        byte[] bArr = this.buffer;
        bArr[0] = (byte) (i10 >>> 24);
        bArr[1] = (byte) (i10 >>> 16);
        bArr[2] = (byte) (i10 >>> 8);
        bArr[3] = (byte) i10;
        return bArr;
    }

    public byte[] longToBytes(long j3) {
        byte[] bArr = this.buffer;
        bArr[0] = (byte) (j3 >>> 56);
        bArr[1] = (byte) (j3 >>> 48);
        bArr[2] = (byte) (j3 >>> 40);
        bArr[3] = (byte) (j3 >>> 32);
        bArr[4] = (byte) (j3 >>> 24);
        bArr[5] = (byte) (j3 >>> 16);
        bArr[6] = (byte) (j3 >>> 8);
        bArr[7] = (byte) j3;
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

    public int getCallsTotalTime(int i10) {
        return this.callsTotalTime[i10];
    }

    public long getReceivedBytesCount(int i10, int i11) {
        if (i11 == 1) {
            long[] jArr = this.receivedBytes[i10];
            return ((((jArr[6] - jArr[5]) - jArr[3]) - jArr[2]) - jArr[4]) - jArr[7];
        }
        return this.receivedBytes[i10][i11];
    }

    public int getRecivedItemsCount(int i10, int i11) {
        return this.receivedItems[i10][i11];
    }

    public long getResetStatsDate(int i10) {
        return this.resetStatsDate[i10];
    }

    public long getSentBytesCount(int i10, int i11) {
        if (i11 == 1) {
            long[] jArr = this.sentBytes[i10];
            return ((((jArr[6] - jArr[5]) - jArr[3]) - jArr[2]) - jArr[4]) - jArr[7];
        }
        return this.sentBytes[i10][i11];
    }

    public int getSentItemsCount(int i10, int i11) {
        return this.sentItems[i10][i11];
    }

    public void incrementReceivedBytesCount(int i10, int i11, long j3) {
        long[] jArr = this.receivedBytes[i10];
        jArr[i11] = jArr[i11] + j3;
        saveStats();
    }

    public void incrementReceivedItemsCount(int i10, int i11, int i12) {
        int[] iArr = this.receivedItems[i10];
        iArr[i11] = iArr[i11] + i12;
        saveStats();
    }

    public void incrementSentBytesCount(int i10, int i11, long j3) {
        long[] jArr = this.sentBytes[i10];
        jArr[i11] = jArr[i11] + j3;
        saveStats();
    }

    public void incrementSentItemsCount(int i10, int i11, int i12) {
        int[] iArr = this.sentItems[i10];
        iArr[i11] = iArr[i11] + i12;
        saveStats();
    }

    public void incrementTotalCallsTime(int i10, int i11) {
        int[] iArr = this.callsTotalTime;
        iArr[i10] = iArr[i10] + i11;
        saveStats();
    }

    public void resetStats(int i10) {
        this.resetStatsDate[i10] = System.currentTimeMillis();
        for (int i11 = 0; i11 < 8; i11++) {
            this.sentBytes[i10][i11] = 0;
            this.receivedBytes[i10][i11] = 0;
            this.sentItems[i10][i11] = 0;
            this.receivedItems[i10][i11] = 0;
        }
        this.callsTotalTime[i10] = 0;
        saveStats();
    }
}
