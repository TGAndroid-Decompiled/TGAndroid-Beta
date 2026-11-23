package org.telegram.messenger;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class i7 {
    public static bg.e0 l1;
    public File A;
    public boolean A0;
    public final boolean B;
    public boolean B0;
    public long C;
    public RandomAccessFile C0;
    public long D;
    public byte[] D0;
    public long E;
    public boolean E0;
    public long F;
    public final ArrayList F0;
    public int G;
    public ArrayList G0;
    public final byte[] H;
    public ArrayList H0;
    public int I;
    public ArrayList I0;
    public final int J;
    public File J0;
    public boolean K;
    public File K0;
    public long L;
    public File L0;
    public ArrayList M;
    public File M0;
    public volatile ArrayList N;
    public File N0;
    public ArrayList O;
    public boolean O0;
    public ArrayList P;
    public final String P0;
    public long Q;
    public RandomAccessFile Q0;
    public int R;
    public RandomAccessFile R0;
    public boolean S;
    public RandomAccessFile S0;
    public int T;
    public File T0;
    public final int U;
    public File U0;
    public TLRPC.InputFileLocation V;
    public boolean V0;
    public final TLRPC.InputWebFileLocation W;
    public int W0;
    public final i20 X;
    public final e8 X0;
    public volatile int Y;
    public volatile boolean Y0;
    public volatile boolean Z;
    public volatile boolean Z0;
    public boolean f24588a;
    public long f24589a0;
    public boolean f24590a1;
    public j7 f24591b;
    public long f24592b0;
    public final int f24593b1;
    public boolean f24594c;
    public final long f24595c0;
    public fi.j6 f24596c1;
    public long d;
    public long f24597d0;
    public long f24598d1;
    public boolean f24599e;
    public long f24600e0;
    public lg.f f24601e1;
    public boolean f24602f;
    public h7 f24603f0;
    public final Runnable f24604f1;
    public int f24605g;
    public u7 f24606g0;
    public long f24607g1;
    public final Runnable h;
    public final byte[] f24608h0;
    public long f24609h1;
    public z4 f24610i;
    public final byte[] f24611i0;
    public long f24612i1;
    public boolean f24613j;
    public int f24614j0;
    public int f24615j1;
    public final boolean f24616k;
    public int f24617k0;
    public volatile boolean f24618l;
    public int f24619l0;
    public ArrayList f24620m;
    public int m0;
    public int f24621n;
    public boolean f24622n0;
    public int f24623o;
    public boolean f24624o0;
    public int f24625p;
    public Object f24626p0;
    public int f24627q;
    public HashMap f24628q0;
    public String f24629r;
    public final boolean f24630r0;
    public String f24631s;
    public byte[] f24632s0;
    public HashMap f24633t;
    public byte[] f24634t0;
    public HashMap f24635u;
    public boolean f24636u0;
    public RandomAccessFile v;
    public byte[] f24637v0;
    public int f24638w;
    public byte[] f24639w0;
    public int f24640x;
    public byte[] f24641x0;
    public boolean f24642y;
    public int f24643y0;
    public boolean f24644z;
    public boolean f24645z0;
    public static volatile q5 f24586k1 = new q5("writeFileQueue");
    public static final Object f24587m1 = new Object();

    public i7(gc gcVar, Object obj, String str, long j3) {
        this.f24605g = 2;
        this.h = new y6(this, 0);
        this.f24621n = 131072;
        this.f24623o = 4;
        this.f24625p = 4;
        this.f24627q = (int) (2097152000 / 131072);
        this.H = new byte[24];
        boolean z10 = false;
        this.Y = 0;
        this.F0 = new ArrayList();
        this.f24604f1 = new y6(this, 5);
        u();
        this.f24626p0 = obj;
        this.f24613j = obj instanceof TL_stories.TL_storyItem;
        this.X0 = w7.E(obj);
        this.f24630r0 = gcVar.f24089p == 2;
        if (gcVar.f24078c != null) {
            TLRPC.TL_inputEncryptedFileLocation tL_inputEncryptedFileLocation = new TLRPC.TL_inputEncryptedFileLocation();
            this.V = tL_inputEncryptedFileLocation;
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = gcVar.f24080f;
            long j10 = tL_fileLocationToBeDeprecated.volume_id;
            tL_inputEncryptedFileLocation.f28413id = j10;
            tL_inputEncryptedFileLocation.volume_id = j10;
            tL_inputEncryptedFileLocation.local_id = tL_fileLocationToBeDeprecated.local_id;
            tL_inputEncryptedFileLocation.access_hash = gcVar.f24079e;
            byte[] bArr = new byte[32];
            this.f24611i0 = bArr;
            System.arraycopy(gcVar.d, 0, bArr, 0, 32);
            this.f24608h0 = gcVar.f24078c;
        } else if (gcVar.f24087n != null) {
            TLRPC.TL_inputPeerPhotoFileLocation tL_inputPeerPhotoFileLocation = new TLRPC.TL_inputPeerPhotoFileLocation();
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = gcVar.f24080f;
            long j11 = tL_fileLocationToBeDeprecated2.volume_id;
            tL_inputPeerPhotoFileLocation.f28413id = j11;
            tL_inputPeerPhotoFileLocation.volume_id = j11;
            tL_inputPeerPhotoFileLocation.local_id = tL_fileLocationToBeDeprecated2.local_id;
            tL_inputPeerPhotoFileLocation.photo_id = gcVar.f24092s;
            tL_inputPeerPhotoFileLocation.big = gcVar.f24086m == 0;
            tL_inputPeerPhotoFileLocation.peer = gcVar.f24087n;
            this.V = tL_inputPeerPhotoFileLocation;
        } else if (gcVar.f24088o != null) {
            TLRPC.TL_inputStickerSetThumb tL_inputStickerSetThumb = new TLRPC.TL_inputStickerSetThumb();
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated3 = gcVar.f24080f;
            long j12 = tL_fileLocationToBeDeprecated3.volume_id;
            tL_inputStickerSetThumb.f28413id = j12;
            tL_inputStickerSetThumb.volume_id = j12;
            tL_inputStickerSetThumb.local_id = tL_fileLocationToBeDeprecated3.local_id;
            tL_inputStickerSetThumb.thumb_version = gcVar.f24090q;
            tL_inputStickerSetThumb.stickerset = gcVar.f24088o;
            this.V = tL_inputStickerSetThumb;
        } else if (gcVar.f24094u != null) {
            if (gcVar.f24092s != 0) {
                TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation = new TLRPC.TL_inputPhotoFileLocation();
                this.V = tL_inputPhotoFileLocation;
                tL_inputPhotoFileLocation.f28413id = gcVar.f24092s;
                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated4 = gcVar.f24080f;
                tL_inputPhotoFileLocation.volume_id = tL_fileLocationToBeDeprecated4.volume_id;
                tL_inputPhotoFileLocation.local_id = tL_fileLocationToBeDeprecated4.local_id;
                tL_inputPhotoFileLocation.access_hash = gcVar.f24079e;
                tL_inputPhotoFileLocation.file_reference = gcVar.f24077b;
                tL_inputPhotoFileLocation.thumb_size = gcVar.f24094u;
                if (gcVar.f24089p == 2) {
                    this.f24624o0 = true;
                }
            } else {
                TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation = new TLRPC.TL_inputDocumentFileLocation();
                this.V = tL_inputDocumentFileLocation;
                tL_inputDocumentFileLocation.f28413id = gcVar.f24093t;
                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated5 = gcVar.f24080f;
                tL_inputDocumentFileLocation.volume_id = tL_fileLocationToBeDeprecated5.volume_id;
                tL_inputDocumentFileLocation.local_id = tL_fileLocationToBeDeprecated5.local_id;
                tL_inputDocumentFileLocation.access_hash = gcVar.f24079e;
                tL_inputDocumentFileLocation.file_reference = gcVar.f24077b;
                tL_inputDocumentFileLocation.thumb_size = gcVar.f24094u;
            }
            TLRPC.InputFileLocation inputFileLocation = this.V;
            if (inputFileLocation.file_reference == null) {
                inputFileLocation.file_reference = new byte[0];
            }
        } else {
            TLRPC.TL_inputFileLocation tL_inputFileLocation = new TLRPC.TL_inputFileLocation();
            this.V = tL_inputFileLocation;
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated6 = gcVar.f24080f;
            tL_inputFileLocation.volume_id = tL_fileLocationToBeDeprecated6.volume_id;
            tL_inputFileLocation.local_id = tL_fileLocationToBeDeprecated6.local_id;
            tL_inputFileLocation.secret = gcVar.f24079e;
            byte[] bArr2 = gcVar.f24077b;
            tL_inputFileLocation.file_reference = bArr2;
            if (bArr2 == null) {
                tL_inputFileLocation.file_reference = new byte[0];
            }
            this.f24624o0 = true;
        }
        int i7 = gcVar.f24089p;
        this.f24590a1 = (i7 == 1 || i7 == 3) ? true : z10;
        int i10 = gcVar.f24076a;
        this.T = i10;
        this.U = i10;
        this.f24593b1 = 16777216;
        this.f24592b0 = j3;
        this.P0 = str == null ? "jpg" : str;
    }

    public static void a(i7 i7Var) {
        if (i7Var.Y == 1 && !i7Var.Z) {
            i7Var.s(-1);
        }
    }

    public static void b(i7 i7Var) {
        i7Var.l();
        w7.G(i7Var.R).e(null, null, null, null, null, i7Var.f24629r);
    }

    public static void n(long j3, long j10, ArrayList arrayList) {
        boolean z10;
        if (arrayList != null && j10 >= j3) {
            int size = arrayList.size();
            int i7 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                g7 g7Var = (g7) arrayList.get(i10);
                if (j3 == g7Var.f24066b) {
                    g7Var.f24066b = j10;
                } else if (j10 == g7Var.f24065a) {
                    g7Var.f24065a = j3;
                }
                z10 = true;
            }
            z10 = false;
            Collections.sort(arrayList, new jg.w(15));
            while (i7 < arrayList.size() - 1) {
                g7 g7Var2 = (g7) arrayList.get(i7);
                int i11 = i7 + 1;
                g7 g7Var3 = (g7) arrayList.get(i11);
                if (g7Var2.f24066b == g7Var3.f24065a) {
                    g7Var2.f24066b = g7Var3.f24066b;
                    arrayList.remove(i11);
                    i7--;
                }
                i7++;
            }
            if (!z10) {
                arrayList.add(new g7(j3, j10));
            }
        }
    }

    public final void c(long j3, long j10, ArrayList arrayList, boolean z10) {
        if (arrayList != null && j10 >= j3) {
            int size = arrayList.size();
            boolean z11 = false;
            for (int i7 = 0; i7 < size; i7++) {
                g7 g7Var = (g7) arrayList.get(i7);
                long j11 = g7Var.f24065a;
                if (j3 <= j11) {
                    if (j10 >= g7Var.f24066b) {
                        arrayList.remove(i7);
                    } else if (j10 > j11) {
                        g7Var.f24065a = j10;
                    }
                    z11 = true;
                    break;
                }
                long j12 = g7Var.f24066b;
                if (j10 < j12) {
                    arrayList.add(0, new g7(j11, j3));
                    g7Var.f24065a = j10;
                } else if (j3 < j12) {
                    g7Var.f24066b = j3;
                }
                z11 = true;
                break;
            }
            if (z10) {
                if (z11) {
                    ArrayList arrayList2 = new ArrayList(arrayList);
                    if (this.f24610i != null) {
                        f24586k1.a(this.f24610i);
                    }
                    synchronized (this) {
                        this.Y0 = true;
                    }
                    q5 q5Var = f24586k1;
                    z4 z4Var = new z4(6, this, arrayList2);
                    this.f24610i = z4Var;
                    q5Var.c(z4Var);
                    i();
                } else if (s2.f26694a) {
                    a8.d(this.L0 + " downloaded duplicate file part " + j3 + " - " + j10);
                }
            }
        }
    }

    public final void d() {
        try {
            RandomAccessFile randomAccessFile = this.Q0;
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.getChannel().close();
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                this.Q0.close();
                this.Q0 = null;
            }
        } catch (Exception e11) {
            a8.g(e11, true);
        }
        try {
            RandomAccessFile randomAccessFile2 = this.v;
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.getChannel().close();
                } catch (Exception e12) {
                    a8.g(e12, true);
                }
                this.v.close();
                this.v = null;
            }
        } catch (Exception e13) {
            a8.g(e13, true);
        }
        try {
            RandomAccessFile randomAccessFile3 = this.C0;
            if (randomAccessFile3 != null) {
                try {
                    randomAccessFile3.getChannel().close();
                } catch (Exception e14) {
                    a8.g(e14, true);
                }
                this.C0.close();
                this.C0 = null;
            }
        } catch (Exception e15) {
            a8.g(e15, true);
        }
        try {
            if (this.S0 != null) {
                synchronized (this) {
                    if (!this.Y0) {
                        try {
                            this.S0.getChannel().close();
                        } catch (Exception e16) {
                            a8.g(e16, true);
                        }
                        this.S0.close();
                        this.S0 = null;
                    } else {
                        this.Z0 = true;
                    }
                }
            }
        } catch (Exception e17) {
            a8.g(e17, true);
        }
        try {
            RandomAccessFile randomAccessFile4 = this.R0;
            if (randomAccessFile4 != null) {
                randomAccessFile4.close();
                this.R0 = null;
            }
        } catch (Exception e18) {
            a8.g(e18, true);
        }
        if (this.I0 != null) {
            for (int i7 = 0; i7 < this.I0.size(); i7++) {
                h7 h7Var = (h7) this.I0.get(i7);
                TLRPC.TL_upload_file tL_upload_file = h7Var.f24371f;
                if (tL_upload_file != null) {
                    tL_upload_file.disableFree = false;
                    tL_upload_file.freeResources();
                } else {
                    TLRPC.TL_upload_webFile tL_upload_webFile = h7Var.f24372g;
                    if (tL_upload_webFile != null) {
                        tL_upload_webFile.disableFree = false;
                        tL_upload_webFile.freeResources();
                    } else {
                        TLRPC.TL_upload_cdnFile tL_upload_cdnFile = h7Var.h;
                        if (tL_upload_cdnFile != null) {
                            tL_upload_cdnFile.disableFree = false;
                            tL_upload_cdnFile.freeResources();
                        }
                    }
                }
            }
            this.I0.clear();
        }
    }

    public final void e(h7 h7Var, boolean z10, boolean z11) {
        int i7;
        int i10;
        int[] iArr = new int[8];
        long j3 = Long.MAX_VALUE;
        for (int i11 = 0; i11 < this.G0.size(); i11++) {
            h7 h7Var2 = (h7) this.G0.get(i11);
            j3 = Math.min(h7Var2.f24370e, j3);
            if (this.f24642y) {
                this.f24635u.remove(Long.valueOf(h7Var2.f24370e));
            } else {
                ArrayList arrayList = this.O;
                long j10 = h7Var2.f24370e;
                n(j10, h7Var2.f24369c + j10, arrayList);
            }
            if (h7Var != h7Var2 && h7Var2.f24367a != 0) {
                h7Var2.f24374j = true;
                if (z11) {
                    this.H0.add(h7Var2);
                    h7Var2.f24376l = new a7(this, h7Var2, 0);
                    ConnectionsManager.getInstance(this.R).cancelRequest(h7Var2.f24367a, true, new b7(h7Var2, 0));
                } else {
                    ConnectionsManager.getInstance(this.R).cancelRequest(h7Var2.f24367a, true);
                    h7Var2.f24375k = true;
                }
                if (!c6.h()) {
                    int i12 = h7Var2.d >>> 16;
                    iArr[i12] = iArr[i12] + h7Var2.f24369c;
                }
            }
        }
        for (int i13 = 0; i13 < 8; i13++) {
            int i14 = (i13 << 16) | 2;
            int i15 = iArr[i13];
            if (this.f24613j && !c6.h()) {
                i7 = 262144;
            } else {
                i7 = 1048576;
            }
            if (i15 > i7) {
                if (this.f24636u0) {
                    i10 = this.f24643y0;
                } else {
                    i10 = this.T;
                }
                ConnectionsManager.getInstance(this.R).discardConnection(i10, i14);
            }
        }
        this.G0.clear();
        g0.g3(new y6(this, 2));
        for (int i16 = 0; i16 < this.I0.size(); i16++) {
            h7 h7Var3 = (h7) this.I0.get(i16);
            if (this.f24642y) {
                this.f24635u.remove(Long.valueOf(h7Var3.f24370e));
            } else {
                ArrayList arrayList2 = this.O;
                long j11 = h7Var3.f24370e;
                n(j11, h7Var3.f24369c + j11, arrayList2);
            }
            TLRPC.TL_upload_file tL_upload_file = h7Var3.f24371f;
            if (tL_upload_file != null) {
                tL_upload_file.disableFree = false;
                tL_upload_file.freeResources();
            } else {
                TLRPC.TL_upload_webFile tL_upload_webFile = h7Var3.f24372g;
                if (tL_upload_webFile != null) {
                    tL_upload_webFile.disableFree = false;
                    tL_upload_webFile.freeResources();
                } else {
                    TLRPC.TL_upload_cdnFile tL_upload_cdnFile = h7Var3.h;
                    if (tL_upload_cdnFile != null) {
                        tL_upload_cdnFile.disableFree = false;
                        tL_upload_cdnFile.freeResources();
                    }
                }
            }
            j3 = Math.min(h7Var3.f24370e, j3);
        }
        this.I0.clear();
        this.f24619l0 = 0;
        if (!z10 && this.f24642y) {
            this.Q = this.f24640x;
        } else if (this.M == null) {
            this.f24589a0 = j3;
            this.Q = j3;
        }
    }

    public final long f(long j3, long j10, NativeByteBuffer nativeByteBuffer) {
        int limit = nativeByteBuffer.limit();
        long j11 = j3;
        while (j11 >= j10 - 16) {
            long j12 = j10 + limit;
            if (j11 < j12) {
                int i7 = (j11 > (j12 - 16) ? 1 : (j11 == (j12 - 16) ? 0 : -1));
                byte[] bArr = this.H;
                if (i7 >= 0) {
                    long j13 = j12 - j11;
                    if (j13 <= 2147483647L) {
                        this.I = (int) j13;
                        nativeByteBuffer.position(nativeByteBuffer.limit() - this.I);
                        nativeByteBuffer.readBytes(bArr, 0, this.I, false);
                        return j12;
                    }
                    throw new RuntimeException("!!!");
                }
                if (this.I != 0) {
                    nativeByteBuffer.position(0);
                    int i10 = this.I;
                    nativeByteBuffer.readBytes(bArr, i10, 16 - i10, false);
                    this.I = 0;
                } else {
                    long j14 = j11 - j10;
                    if (j14 <= 2147483647L) {
                        nativeByteBuffer.position((int) j14);
                        nativeByteBuffer.readBytes(bArr, 0, 16, false);
                    } else {
                        throw new RuntimeException("!!!");
                    }
                }
                int i11 = ((bArr[0] & 255) << 24) + ((bArr[1] & 255) << 16) + ((bArr[2] & 255) << 8) + (bArr[3] & 255);
                if (i11 != 0) {
                    if (i11 == 1) {
                        i11 = ((bArr[12] & 255) << 24) + ((bArr[13] & 255) << 16) + ((bArr[14] & 255) << 8) + (bArr[15] & 255);
                    }
                    if (bArr[4] == 109 && bArr[5] == 111 && bArr[6] == 111 && bArr[7] == 118) {
                        return -i11;
                    }
                    j11 += i11;
                    if (j11 >= j12) {
                        return j11;
                    }
                } else {
                    return 0L;
                }
            } else {
                return 0L;
            }
        }
        return 0L;
    }

    public final File g() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        File[] fileArr = new File[1];
        Utilities.d.c(new zf(this, fileArr, countDownLatch, 21));
        try {
            countDownLatch.await();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        return fileArr[0];
    }

    public final long h(long j3, long j10, ArrayList arrayList) {
        long j11;
        if (arrayList != null && this.Y != 3 && !arrayList.isEmpty()) {
            int size = arrayList.size();
            g7 g7Var = null;
            int i7 = 0;
            while (true) {
                if (i7 < size) {
                    g7 g7Var2 = (g7) arrayList.get(i7);
                    long j12 = g7Var2.f24065a;
                    if (j3 <= j12 && (g7Var == null || j12 < g7Var.f24065a)) {
                        g7Var = g7Var2;
                    }
                    if (j12 <= j3 && g7Var2.f24066b > j3) {
                        j11 = 0;
                        break;
                    }
                    i7++;
                } else {
                    j11 = j10;
                    break;
                }
            }
            if (j11 == 0) {
                return 0L;
            }
            if (g7Var != null) {
                return Math.min(j10, g7Var.f24065a - j3);
            }
            return Math.min(j10, Math.max(this.f24592b0 - j3, 0L));
        } else if (this.Y == 3) {
            return j10;
        } else {
            long j13 = this.f24589a0;
            if (j13 == 0) {
                return 0L;
            }
            return Math.min(j10, Math.max(j13 - j3, 0L));
        }
    }

    public final void i() {
        ArrayList arrayList = this.f24620m;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((j7) this.f24620m.get(i7)).a();
            }
        }
    }

    public final void j(int i7, boolean z10) {
        int i10;
        d();
        if (i7 == 1) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        this.Y = i10;
        if (this.f24606g0 != null && s2.f26694a) {
            long j3 = 0;
            if (this.f24598d1 != 0) {
                j3 = System.currentTimeMillis() - this.f24598d1;
            }
            if (i7 == 1) {
                a8.b("cancel downloading file to " + this.L0 + " time = " + j3 + " dc = " + this.T + " size = " + g0.i0(this.f24592b0, false, false));
            } else {
                a8.b("failed downloading file to " + this.L0 + " reason = " + i7 + " time = " + j3 + " dc = " + this.T + " size = " + g0.i0(this.f24592b0, false, false));
            }
        }
        if (z10) {
            Utilities.d.c(new z6(this, i7, 3));
            return;
        }
        u7 u7Var = this.f24606g0;
        if (u7Var != null) {
            u7Var.b(this, i7);
        }
        i();
    }

    public final void k(int i7, boolean z10, boolean z11) {
        if (this.Y != 1 && this.Y != 5) {
            return;
        }
        this.Y = 3;
        i();
        d();
        if (!this.f24642y && !z11) {
            f24586k1.c(new zx(2, this, this.M0, this.N0, this.A, this.J0, z10));
            this.M0 = null;
            this.N0 = null;
            this.A = null;
            this.f24606g0.getClass();
            w7.K.c(new z4(10, this, this.f24601e1));
            return;
        }
        this.f24644z = true;
        boolean z12 = s2.f26694a;
        if (i7 == 1) {
            a8.b("file already exist " + this.J0);
        } else {
            StringBuilder sb2 = new StringBuilder("finished preloading file to ");
            sb2.append(this.J0);
            sb2.append(" loaded ");
            sb2.append(this.f24589a0);
            sb2.append(" of ");
            sb2.append(this.f24592b0);
            sb2.append(" prefSize=");
            i5.c.t(this.J, sb2);
        }
        if (this.X0 != null) {
            if (this.J0 != null) {
                f8 f8Var = w7.G(this.R).d;
                List singletonList = Collections.singletonList(new ei.b(this.J0));
                f8Var.getClass();
                f8Var.h(new z4(12, f8Var, singletonList));
            }
            if (this.N0 != null) {
                f8 f8Var2 = w7.G(this.R).d;
                List singletonList2 = Collections.singletonList(new ei.b(this.N0));
                f8Var2.getClass();
                f8Var2.h(new z4(12, f8Var2, singletonList2));
            }
        }
        this.f24606g0.getClass();
        w7.K.c(new z4(10, this, this.f24601e1));
        this.f24606g0.c(this, this.L0);
    }

    public final void l() {
        if (this.Y != 1) {
            return;
        }
        this.Z = true;
        this.f24607g1 = 0L;
        Utilities.d.c(new y6(this, 4));
    }

    public final boolean m(org.telegram.messenger.h7 r46, org.telegram.tgnet.TLRPC.TL_error r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.i7.m(org.telegram.messenger.h7, org.telegram.tgnet.TLRPC$TL_error):boolean");
    }

    public final void o(long j3) {
        if (this.E0) {
            return;
        }
        this.E0 = true;
        TLRPC.TL_upload_getCdnFileHashes tL_upload_getCdnFileHashes = new TLRPC.TL_upload_getCdnFileHashes();
        tL_upload_getCdnFileHashes.file_token = this.f24641x0;
        tL_upload_getCdnFileHashes.offset = j3;
        ConnectionsManager.getInstance(this.R).sendRequest(tL_upload_getCdnFileHashes, new s1(this, 2), null, null, 0, this.T, 1, true);
    }

    public final void p(h7 h7Var) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        if (this.A0) {
            return;
        }
        e(null, false, false);
        this.A0 = true;
        this.B0 = true;
        Object obj = this.f24626p0;
        if (obj instanceof gj) {
            gj gjVar = (gj) obj;
            if (gjVar.e1() < 0 && (message = gjVar.f24177k) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null) {
                this.f24626p0 = webPage;
                this.f24613j = false;
            }
        }
        if (s2.f26694a) {
            a8.b("debug_loading: " + this.L0.getName() + " file reference expired ");
        }
        r8.n(this.R).u(new Object[]{this.V, this, h7Var}, this.f24626p0);
    }

    public final void q(boolean z10) {
        if (this.f24642y != z10) {
            if (!z10 || this.f24592b0 > 2097152) {
                a8.d("setIsPreloadVideoOperation " + z10 + " file=" + this.f24629r);
                if (!z10 && this.f24642y) {
                    if (this.Y == 3) {
                        this.f24642y = z10;
                        if (this.f24614j0 != 0 && !this.f24599e && !this.f24613j && !this.f24630r0) {
                            t();
                        }
                        this.Y = 0;
                        this.f24644z = false;
                        r();
                        return;
                    } else if (this.Y == 1) {
                        Utilities.d.c(new d7(this, z10, 1));
                        return;
                    } else {
                        this.f24642y = z10;
                        return;
                    }
                }
                this.f24642y = z10;
            }
        }
    }

    public final void r() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.i7.r():void");
    }

    public final void s(int r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.i7.s(int):void");
    }

    public final void t() {
        boolean z10;
        int i7;
        if (!np.u1(this.R).J3 && this.f24592b0 > 0 && this.f24608h0 == null && !this.f24622n0 && !this.f24642y && this.J == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f24602f = z10;
        if (z10) {
            boolean q10 = k10.i(this.R).q();
            int i10 = 2;
            if (q10) {
                i7 = 8;
            } else {
                i7 = 2;
            }
            this.f24605g = i7;
            if (q10) {
                i10 = 16;
            }
            this.f24617k0 = (i10 * 1048576) / this.f24614j0;
        }
    }

    public final void u() {
        if ((this.J > 0 || np.u1(this.R).I3) && !this.f24599e) {
            this.f24621n = 524288;
            this.f24623o = 8;
            this.f24625p = 8;
        } else {
            this.f24621n = 131072;
            this.f24623o = 4;
            this.f24625p = 4;
        }
        if (this.f24613j) {
            this.f24621n = 131072;
            this.f24625p = 8;
        }
        this.f24627q = (int) (2097152000 / this.f24621n);
    }

    public i7(zv zvVar) {
        this.f24605g = 2;
        this.h = new y6(this, 0);
        this.f24621n = 131072;
        this.f24623o = 4;
        this.f24625p = 4;
        this.f24627q = (int) (2097152000 / 131072);
        this.H = new byte[24];
        this.Y = 0;
        this.F0 = new ArrayList();
        this.f24604f1 = new y6(this, 5);
        u();
        TLRPC.TL_inputSecureFileLocation tL_inputSecureFileLocation = new TLRPC.TL_inputSecureFileLocation();
        this.V = tL_inputSecureFileLocation;
        TLRPC.TL_secureFile tL_secureFile = zvVar.f28348b;
        tL_inputSecureFileLocation.f28413id = tL_secureFile.f28535id;
        tL_inputSecureFileLocation.access_hash = tL_secureFile.access_hash;
        this.T = tL_secureFile.dc_id;
        this.f24592b0 = tL_secureFile.size;
        this.f24624o0 = true;
        this.f24593b1 = 67108864;
        this.P0 = ".jpg";
    }

    public i7(int i7, i20 i20Var) {
        this.f24605g = 2;
        this.h = new y6(this, 0);
        this.f24621n = 131072;
        this.f24623o = 4;
        this.f24625p = 4;
        this.f24627q = (int) (2097152000 / 131072);
        this.H = new byte[24];
        this.Y = 0;
        this.F0 = new ArrayList();
        this.f24604f1 = new y6(this, 5);
        u();
        this.R = i7;
        this.X = i20Var;
        this.W = i20Var.f24543b;
        this.f24592b0 = i20Var.d;
        int i10 = np.u1(i7).Q3;
        this.T = i10;
        this.U = i10;
        String H = w7.H(i20Var.f24545e);
        if (i20Var.f24545e.startsWith("image/")) {
            this.f24593b1 = 16777216;
        } else if (i20Var.f24545e.equals("audio/ogg")) {
            this.f24593b1 = 50331648;
        } else if (i20Var.f24545e.startsWith("video/")) {
            this.f24593b1 = 33554432;
        } else {
            this.f24593b1 = 67108864;
        }
        this.f24624o0 = true;
        this.P0 = fc.B(i20Var.f24542a, H);
    }

    public i7(java.lang.Object r13, org.telegram.tgnet.TLRPC.Document r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.i7.<init>(java.lang.Object, org.telegram.tgnet.TLRPC$Document):void");
    }
}
