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
    public static bg.d0 l1;
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
    public final m20 X;
    public final e8 X0;
    public volatile int Y;
    public volatile boolean Y0;
    public volatile boolean Z;
    public volatile boolean Z0;
    public boolean f23071a;
    public long f23072a0;
    public boolean f23073a1;
    public j7 f23074b;
    public long f23075b0;
    public final int f23076b1;
    public boolean f23077c;
    public final long f23078c0;
    public di.t6 f23079c1;
    public long d;
    public long f23080d0;
    public long f23081d1;
    public boolean f23082e;
    public long f23083e0;
    public lg.f f23084e1;
    public boolean f23085f;
    public h7 f23086f0;
    public final Runnable f23087f1;
    public int f23088g;
    public u7 f23089g0;
    public long f23090g1;
    public final Runnable h;
    public final byte[] f23091h0;
    public long f23092h1;
    public x4 f23093i;
    public final byte[] f23094i0;
    public long f23095i1;
    public boolean f23096j;
    public int f23097j0;
    public int f23098j1;
    public final boolean f23099k;
    public int f23100k0;
    public volatile boolean f23101l;
    public int f23102l0;
    public ArrayList f23103m;
    public int m0;
    public int f23104n;
    public boolean f23105n0;
    public int f23106o;
    public boolean f23107o0;
    public int f23108p;
    public Object f23109p0;
    public int f23110q;
    public HashMap f23111q0;
    public String f23112r;
    public final boolean f23113r0;
    public String f23114s;
    public byte[] f23115s0;
    public HashMap f23116t;
    public byte[] f23117t0;
    public HashMap f23118u;
    public boolean f23119u0;
    public RandomAccessFile v;
    public byte[] f23120v0;
    public int f23121w;
    public byte[] f23122w0;
    public int f23123x;
    public byte[] f23124x0;
    public boolean f23125y;
    public int f23126y0;
    public boolean f23127z;
    public boolean f23128z0;
    public static volatile p5 f23069k1 = new p5("writeFileQueue");
    public static final Object f23070m1 = new Object();

    public i7(hc hcVar, Object obj, String str, long j3) {
        this.f23088g = 2;
        this.h = new y6(this, 0);
        this.f23104n = 131072;
        this.f23106o = 4;
        this.f23108p = 4;
        this.f23110q = (int) (2097152000 / 131072);
        this.H = new byte[24];
        boolean z9 = false;
        this.Y = 0;
        this.F0 = new ArrayList();
        this.f23087f1 = new y6(this, 5);
        u();
        this.f23109p0 = obj;
        this.f23096j = obj instanceof TL_stories.TL_storyItem;
        this.X0 = w7.E(obj);
        this.f23113r0 = hcVar.f22882p == 2;
        if (hcVar.f22871c != null) {
            TLRPC.TL_inputEncryptedFileLocation tL_inputEncryptedFileLocation = new TLRPC.TL_inputEncryptedFileLocation();
            this.V = tL_inputEncryptedFileLocation;
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = hcVar.f22873f;
            long j10 = tL_fileLocationToBeDeprecated.volume_id;
            tL_inputEncryptedFileLocation.f26975id = j10;
            tL_inputEncryptedFileLocation.volume_id = j10;
            tL_inputEncryptedFileLocation.local_id = tL_fileLocationToBeDeprecated.local_id;
            tL_inputEncryptedFileLocation.access_hash = hcVar.f22872e;
            byte[] bArr = new byte[32];
            this.f23094i0 = bArr;
            System.arraycopy(hcVar.d, 0, bArr, 0, 32);
            this.f23091h0 = hcVar.f22871c;
        } else if (hcVar.f22880n != null) {
            TLRPC.TL_inputPeerPhotoFileLocation tL_inputPeerPhotoFileLocation = new TLRPC.TL_inputPeerPhotoFileLocation();
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = hcVar.f22873f;
            long j11 = tL_fileLocationToBeDeprecated2.volume_id;
            tL_inputPeerPhotoFileLocation.f26975id = j11;
            tL_inputPeerPhotoFileLocation.volume_id = j11;
            tL_inputPeerPhotoFileLocation.local_id = tL_fileLocationToBeDeprecated2.local_id;
            tL_inputPeerPhotoFileLocation.photo_id = hcVar.f22885s;
            tL_inputPeerPhotoFileLocation.big = hcVar.f22879m == 0;
            tL_inputPeerPhotoFileLocation.peer = hcVar.f22880n;
            this.V = tL_inputPeerPhotoFileLocation;
        } else if (hcVar.f22881o != null) {
            TLRPC.TL_inputStickerSetThumb tL_inputStickerSetThumb = new TLRPC.TL_inputStickerSetThumb();
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated3 = hcVar.f22873f;
            long j12 = tL_fileLocationToBeDeprecated3.volume_id;
            tL_inputStickerSetThumb.f26975id = j12;
            tL_inputStickerSetThumb.volume_id = j12;
            tL_inputStickerSetThumb.local_id = tL_fileLocationToBeDeprecated3.local_id;
            tL_inputStickerSetThumb.thumb_version = hcVar.f22883q;
            tL_inputStickerSetThumb.stickerset = hcVar.f22881o;
            this.V = tL_inputStickerSetThumb;
        } else if (hcVar.f22887u != null) {
            if (hcVar.f22885s != 0) {
                TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation = new TLRPC.TL_inputPhotoFileLocation();
                this.V = tL_inputPhotoFileLocation;
                tL_inputPhotoFileLocation.f26975id = hcVar.f22885s;
                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated4 = hcVar.f22873f;
                tL_inputPhotoFileLocation.volume_id = tL_fileLocationToBeDeprecated4.volume_id;
                tL_inputPhotoFileLocation.local_id = tL_fileLocationToBeDeprecated4.local_id;
                tL_inputPhotoFileLocation.access_hash = hcVar.f22872e;
                tL_inputPhotoFileLocation.file_reference = hcVar.f22870b;
                tL_inputPhotoFileLocation.thumb_size = hcVar.f22887u;
                if (hcVar.f22882p == 2) {
                    this.f23107o0 = true;
                }
            } else {
                TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation = new TLRPC.TL_inputDocumentFileLocation();
                this.V = tL_inputDocumentFileLocation;
                tL_inputDocumentFileLocation.f26975id = hcVar.f22886t;
                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated5 = hcVar.f22873f;
                tL_inputDocumentFileLocation.volume_id = tL_fileLocationToBeDeprecated5.volume_id;
                tL_inputDocumentFileLocation.local_id = tL_fileLocationToBeDeprecated5.local_id;
                tL_inputDocumentFileLocation.access_hash = hcVar.f22872e;
                tL_inputDocumentFileLocation.file_reference = hcVar.f22870b;
                tL_inputDocumentFileLocation.thumb_size = hcVar.f22887u;
            }
            TLRPC.InputFileLocation inputFileLocation = this.V;
            if (inputFileLocation.file_reference == null) {
                inputFileLocation.file_reference = new byte[0];
            }
        } else {
            TLRPC.TL_inputFileLocation tL_inputFileLocation = new TLRPC.TL_inputFileLocation();
            this.V = tL_inputFileLocation;
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated6 = hcVar.f22873f;
            tL_inputFileLocation.volume_id = tL_fileLocationToBeDeprecated6.volume_id;
            tL_inputFileLocation.local_id = tL_fileLocationToBeDeprecated6.local_id;
            tL_inputFileLocation.secret = hcVar.f22872e;
            byte[] bArr2 = hcVar.f22870b;
            tL_inputFileLocation.file_reference = bArr2;
            if (bArr2 == null) {
                tL_inputFileLocation.file_reference = new byte[0];
            }
            this.f23107o0 = true;
        }
        int i7 = hcVar.f22882p;
        this.f23073a1 = (i7 == 1 || i7 == 3) ? true : z9;
        int i10 = hcVar.f22869a;
        this.T = i10;
        this.U = i10;
        this.f23076b1 = 16777216;
        this.f23075b0 = j3;
        this.P0 = str == null ? "jpg" : str;
    }

    public static void a(i7 i7Var) {
        if (i7Var.Y == 1 && !i7Var.Z) {
            i7Var.s(-1);
        }
    }

    public static void b(i7 i7Var) {
        i7Var.l();
        w7.G(i7Var.R).e(null, null, null, null, null, i7Var.f23112r);
    }

    public static void n(long j3, long j10, ArrayList arrayList) {
        boolean z9;
        if (arrayList != null && j10 >= j3) {
            int size = arrayList.size();
            int i7 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                g7 g7Var = (g7) arrayList.get(i10);
                if (j3 == g7Var.f22631b) {
                    g7Var.f22631b = j10;
                } else if (j10 == g7Var.f22630a) {
                    g7Var.f22630a = j3;
                }
                z9 = true;
            }
            z9 = false;
            Collections.sort(arrayList, new jg.x(16));
            while (i7 < arrayList.size() - 1) {
                g7 g7Var2 = (g7) arrayList.get(i7);
                int i11 = i7 + 1;
                g7 g7Var3 = (g7) arrayList.get(i11);
                if (g7Var2.f22631b == g7Var3.f22630a) {
                    g7Var2.f22631b = g7Var3.f22631b;
                    arrayList.remove(i11);
                    i7--;
                }
                i7++;
            }
            if (!z9) {
                arrayList.add(new g7(j3, j10));
            }
        }
    }

    public final void c(long j3, long j10, ArrayList arrayList, boolean z9) {
        if (arrayList != null && j10 >= j3) {
            int size = arrayList.size();
            boolean z10 = false;
            for (int i7 = 0; i7 < size; i7++) {
                g7 g7Var = (g7) arrayList.get(i7);
                long j11 = g7Var.f22630a;
                if (j3 <= j11) {
                    if (j10 >= g7Var.f22631b) {
                        arrayList.remove(i7);
                    } else if (j10 > j11) {
                        g7Var.f22630a = j10;
                    }
                    z10 = true;
                    break;
                }
                long j12 = g7Var.f22631b;
                if (j10 < j12) {
                    arrayList.add(0, new g7(j11, j3));
                    g7Var.f22630a = j10;
                } else if (j3 < j12) {
                    g7Var.f22631b = j3;
                }
                z10 = true;
                break;
            }
            if (z9) {
                if (z10) {
                    ArrayList arrayList2 = new ArrayList(arrayList);
                    if (this.f23093i != null) {
                        f23069k1.a(this.f23093i);
                    }
                    synchronized (this) {
                        this.Y0 = true;
                    }
                    p5 p5Var = f23069k1;
                    x4 x4Var = new x4(6, this, arrayList2);
                    this.f23093i = x4Var;
                    p5Var.c(x4Var);
                    i();
                } else if (r2.f25216a) {
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
                TLRPC.TL_upload_file tL_upload_file = h7Var.f22855f;
                if (tL_upload_file != null) {
                    tL_upload_file.disableFree = false;
                    tL_upload_file.freeResources();
                } else {
                    TLRPC.TL_upload_webFile tL_upload_webFile = h7Var.f22856g;
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

    public final void e(h7 h7Var, boolean z9, boolean z10) {
        int i7;
        int i10;
        int[] iArr = new int[8];
        long j3 = Long.MAX_VALUE;
        for (int i11 = 0; i11 < this.G0.size(); i11++) {
            h7 h7Var2 = (h7) this.G0.get(i11);
            j3 = Math.min(h7Var2.f22854e, j3);
            if (this.f23125y) {
                this.f23118u.remove(Long.valueOf(h7Var2.f22854e));
            } else {
                ArrayList arrayList = this.O;
                long j10 = h7Var2.f22854e;
                n(j10, h7Var2.f22853c + j10, arrayList);
            }
            if (h7Var != h7Var2 && h7Var2.f22851a != 0) {
                h7Var2.f22858j = true;
                if (z10) {
                    this.H0.add(h7Var2);
                    h7Var2.f22860l = new a7(this, h7Var2, 0);
                    ConnectionsManager.getInstance(this.R).cancelRequest(h7Var2.f22851a, true, new b7(h7Var2, 0));
                } else {
                    ConnectionsManager.getInstance(this.R).cancelRequest(h7Var2.f22851a, true);
                    h7Var2.f22859k = true;
                }
                if (!b6.g()) {
                    int i12 = h7Var2.d >>> 16;
                    iArr[i12] = iArr[i12] + h7Var2.f22853c;
                }
            }
        }
        for (int i13 = 0; i13 < 8; i13++) {
            int i14 = (i13 << 16) | 2;
            int i15 = iArr[i13];
            if (this.f23096j && !b6.g()) {
                i7 = 262144;
            } else {
                i7 = 1048576;
            }
            if (i15 > i7) {
                if (this.f23119u0) {
                    i10 = this.f23126y0;
                } else {
                    i10 = this.T;
                }
                ConnectionsManager.getInstance(this.R).discardConnection(i10, i14);
            }
        }
        this.G0.clear();
        g0.h3(new y6(this, 2));
        for (int i16 = 0; i16 < this.I0.size(); i16++) {
            h7 h7Var3 = (h7) this.I0.get(i16);
            if (this.f23125y) {
                this.f23118u.remove(Long.valueOf(h7Var3.f22854e));
            } else {
                ArrayList arrayList2 = this.O;
                long j11 = h7Var3.f22854e;
                n(j11, h7Var3.f22853c + j11, arrayList2);
            }
            TLRPC.TL_upload_file tL_upload_file = h7Var3.f22855f;
            if (tL_upload_file != null) {
                tL_upload_file.disableFree = false;
                tL_upload_file.freeResources();
            } else {
                TLRPC.TL_upload_webFile tL_upload_webFile = h7Var3.f22856g;
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
            j3 = Math.min(h7Var3.f22854e, j3);
        }
        this.I0.clear();
        this.f23102l0 = 0;
        if (!z9 && this.f23125y) {
            this.Q = this.f23123x;
        } else if (this.M == null) {
            this.f23072a0 = j3;
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
        Utilities.d.c(new ng(this, fileArr, countDownLatch, 21));
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
                    long j12 = g7Var2.f22630a;
                    if (j3 <= j12 && (g7Var == null || j12 < g7Var.f22630a)) {
                        g7Var = g7Var2;
                    }
                    if (j12 <= j3 && g7Var2.f22631b > j3) {
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
                return Math.min(j10, g7Var.f22630a - j3);
            }
            return Math.min(j10, Math.max(this.f23075b0 - j3, 0L));
        } else if (this.Y == 3) {
            return j10;
        } else {
            long j13 = this.f23072a0;
            if (j13 == 0) {
                return 0L;
            }
            return Math.min(j10, Math.max(j13 - j3, 0L));
        }
    }

    public final void i() {
        ArrayList arrayList = this.f23103m;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((j7) this.f23103m.get(i7)).a();
            }
        }
    }

    public final void j(int i7, boolean z9) {
        int i10;
        d();
        if (i7 == 1) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        this.Y = i10;
        if (this.f23089g0 != null && r2.f25216a) {
            long j3 = 0;
            if (this.f23081d1 != 0) {
                j3 = System.currentTimeMillis() - this.f23081d1;
            }
            if (i7 == 1) {
                a8.b("cancel downloading file to " + this.L0 + " time = " + j3 + " dc = " + this.T + " size = " + g0.i0(this.f23075b0, false, false));
            } else {
                a8.b("failed downloading file to " + this.L0 + " reason = " + i7 + " time = " + j3 + " dc = " + this.T + " size = " + g0.i0(this.f23075b0, false, false));
            }
        }
        if (z9) {
            Utilities.d.c(new z6(this, i7, 3));
            return;
        }
        u7 u7Var = this.f23089g0;
        if (u7Var != null) {
            u7Var.b(this, i7);
        }
        i();
    }

    public final void k(int i7, boolean z9, boolean z10) {
        if (this.Y != 1 && this.Y != 5) {
            return;
        }
        this.Y = 3;
        i();
        d();
        if (!this.f23125y && !z10) {
            f23069k1.c(new gy(2, this, this.M0, this.N0, this.A, this.J0, z9));
            this.M0 = null;
            this.N0 = null;
            this.A = null;
            this.f23089g0.getClass();
            w7.J.c(new x4(10, this, this.f23084e1));
            return;
        }
        this.f23127z = true;
        boolean z11 = r2.f25216a;
        if (i7 == 1) {
            a8.b("file already exist " + this.J0);
        } else {
            StringBuilder sb2 = new StringBuilder("finished preloading file to ");
            sb2.append(this.J0);
            sb2.append(" loaded ");
            sb2.append(this.f23072a0);
            sb2.append(" of ");
            sb2.append(this.f23075b0);
            sb2.append(" prefSize=");
            jg.g.s(this.J, sb2);
        }
        if (this.X0 != null) {
            if (this.J0 != null) {
                f8 f8Var = w7.G(this.R).d;
                List singletonList = Collections.singletonList(new ci.b(this.J0));
                f8Var.getClass();
                f8Var.h(new x4(12, f8Var, singletonList));
            }
            if (this.N0 != null) {
                f8 f8Var2 = w7.G(this.R).d;
                List singletonList2 = Collections.singletonList(new ci.b(this.N0));
                f8Var2.getClass();
                f8Var2.h(new x4(12, f8Var2, singletonList2));
            }
        }
        this.f23089g0.getClass();
        w7.J.c(new x4(10, this, this.f23084e1));
        this.f23089g0.c(this, this.L0);
    }

    public final void l() {
        if (this.Y != 1) {
            return;
        }
        this.Z = true;
        this.f23090g1 = 0L;
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
        tL_upload_getCdnFileHashes.file_token = this.f23124x0;
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
        Object obj = this.f23109p0;
        if (obj instanceof ij) {
            ij ijVar = (ij) obj;
            if (ijVar.e1() < 0 && (message = ijVar.f23266k) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null) {
                this.f23109p0 = webPage;
                this.f23096j = false;
            }
        }
        if (r2.f25216a) {
            a8.b("debug_loading: " + this.L0.getName() + " file reference expired ");
        }
        r8.n(this.R).u(new Object[]{this.V, this, h7Var}, this.f23109p0);
    }

    public final void q(boolean z9) {
        if (this.f23125y != z9) {
            if (!z9 || this.f23075b0 > 2097152) {
                a8.d("setIsPreloadVideoOperation " + z9 + " file=" + this.f23112r);
                if (!z9 && this.f23125y) {
                    if (this.Y == 3) {
                        this.f23125y = z9;
                        if (this.f23097j0 != 0 && !this.f23082e && !this.f23096j && !this.f23113r0) {
                            t();
                        }
                        this.Y = 0;
                        this.f23127z = false;
                        r();
                        return;
                    } else if (this.Y == 1) {
                        Utilities.d.c(new d7(this, z9, 1));
                        return;
                    } else {
                        this.f23125y = z9;
                        return;
                    }
                }
                this.f23125y = z9;
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
        boolean z9;
        int i7;
        if (!qp.s1(this.R).G3 && this.f23075b0 > 0 && this.f23091h0 == null && !this.f23105n0 && !this.f23125y && this.J == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f23085f = z9;
        if (z9) {
            boolean q10 = p10.i(this.R).q();
            int i10 = 2;
            if (q10) {
                i7 = 8;
            } else {
                i7 = 2;
            }
            this.f23088g = i7;
            if (q10) {
                i10 = 16;
            }
            this.f23100k0 = (i10 * 1048576) / this.f23097j0;
        }
    }

    public final void u() {
        if ((this.J > 0 || qp.s1(this.R).F3) && !this.f23082e) {
            this.f23104n = 524288;
            this.f23106o = 8;
            this.f23108p = 8;
        } else {
            this.f23104n = 131072;
            this.f23106o = 4;
            this.f23108p = 4;
        }
        if (this.f23096j) {
            this.f23104n = 131072;
            this.f23108p = 8;
        }
        this.f23110q = (int) (2097152000 / this.f23104n);
    }

    public i7(ew ewVar) {
        this.f23088g = 2;
        this.h = new y6(this, 0);
        this.f23104n = 131072;
        this.f23106o = 4;
        this.f23108p = 4;
        this.f23110q = (int) (2097152000 / 131072);
        this.H = new byte[24];
        this.Y = 0;
        this.F0 = new ArrayList();
        this.f23087f1 = new y6(this, 5);
        u();
        TLRPC.TL_inputSecureFileLocation tL_inputSecureFileLocation = new TLRPC.TL_inputSecureFileLocation();
        this.V = tL_inputSecureFileLocation;
        TLRPC.TL_secureFile tL_secureFile = ewVar.f22289b;
        tL_inputSecureFileLocation.f26975id = tL_secureFile.f27097id;
        tL_inputSecureFileLocation.access_hash = tL_secureFile.access_hash;
        this.T = tL_secureFile.dc_id;
        this.f23075b0 = tL_secureFile.size;
        this.f23107o0 = true;
        this.f23076b1 = 67108864;
        this.P0 = ".jpg";
    }

    public i7(int i7, m20 m20Var) {
        this.f23088g = 2;
        this.h = new y6(this, 0);
        this.f23104n = 131072;
        this.f23106o = 4;
        this.f23108p = 4;
        this.f23110q = (int) (2097152000 / 131072);
        this.H = new byte[24];
        this.Y = 0;
        this.F0 = new ArrayList();
        this.f23087f1 = new y6(this, 5);
        u();
        this.R = i7;
        this.X = m20Var;
        this.W = m20Var.f23981b;
        this.f23075b0 = m20Var.d;
        int i10 = qp.s1(i7).N3;
        this.T = i10;
        this.U = i10;
        String H = w7.H(m20Var.f23983e);
        if (m20Var.f23983e.startsWith("image/")) {
            this.f23076b1 = 16777216;
        } else if (m20Var.f23983e.equals("audio/ogg")) {
            this.f23076b1 = 50331648;
        } else if (m20Var.f23983e.startsWith("video/")) {
            this.f23076b1 = 33554432;
        } else {
            this.f23076b1 = 67108864;
        }
        this.f23107o0 = true;
        this.P0 = gc.B(m20Var.f23980a, H);
    }

    public i7(java.lang.Object r13, org.telegram.tgnet.TLRPC.Document r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.i7.<init>(java.lang.Object, org.telegram.tgnet.TLRPC$Document):void");
    }
}
