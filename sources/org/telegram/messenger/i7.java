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
    public static cg.c0 f23459l1;
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
    public final e20 X;
    public final e8 X0;
    public volatile int Y;
    public volatile boolean Y0;
    public volatile boolean Z;
    public volatile boolean Z0;
    public boolean f23460a;
    public long f23461a0;
    public boolean f23462a1;
    public j7 f23463b;
    public long f23464b0;
    public final int f23465b1;
    public boolean f23466c;
    public final long f23467c0;
    public ei.t6 f23468c1;
    public long d;
    public long f23469d0;
    public long f23470d1;
    public boolean f23471e;
    public long f23472e0;
    public mg.f f23473e1;
    public boolean f23474f;
    public h7 f23475f0;
    public final Runnable f23476f1;
    public int f23477g;
    public u7 f23478g0;
    public long f23479g1;
    public final Runnable h;
    public final byte[] f23480h0;
    public long f23481h1;
    public y4 f23482i;
    public final byte[] f23483i0;
    public long f23484i1;
    public boolean f23485j;
    public int f23486j0;
    public int f23487j1;
    public final boolean f23488k;
    public int f23489k0;
    public volatile boolean f23490l;
    public int f23491l0;
    public ArrayList f23492m;
    public int m0;
    public int f23493n;
    public boolean f23494n0;
    public int f23495o;
    public boolean f23496o0;
    public int f23497p;
    public Object f23498p0;
    public int f23499q;
    public HashMap f23500q0;
    public String f23501r;
    public final boolean f23502r0;
    public String f23503s;
    public byte[] f23504s0;
    public HashMap f23505t;
    public byte[] f23506t0;
    public HashMap f23507u;
    public boolean f23508u0;
    public RandomAccessFile v;
    public byte[] f23509v0;
    public int f23510w;
    public byte[] f23511w0;
    public int f23512x;
    public byte[] f23513x0;
    public boolean f23514y;
    public int f23515y0;
    public boolean f23516z;
    public boolean f23517z0;
    public static volatile p5 k1 = new p5("writeFileQueue");
    public static final Object m1 = new Object();

    public i7(ac acVar, Object obj, String str, long j10) {
        this.f23477g = 2;
        this.h = new y6(this, 0);
        this.f23493n = 131072;
        this.f23495o = 4;
        this.f23497p = 4;
        this.f23499q = (int) (2097152000 / 131072);
        this.H = new byte[24];
        boolean z10 = false;
        this.Y = 0;
        this.F0 = new ArrayList();
        this.f23476f1 = new y6(this, 5);
        u();
        this.f23498p0 = obj;
        this.f23485j = obj instanceof TL_stories.TL_storyItem;
        this.X0 = w7.E(obj);
        this.f23502r0 = acVar.f21497p == 2;
        if (acVar.f21486c != null) {
            TLRPC.TL_inputEncryptedFileLocation tL_inputEncryptedFileLocation = new TLRPC.TL_inputEncryptedFileLocation();
            this.V = tL_inputEncryptedFileLocation;
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = acVar.f21488f;
            long j11 = tL_fileLocationToBeDeprecated.volume_id;
            tL_inputEncryptedFileLocation.f27016id = j11;
            tL_inputEncryptedFileLocation.volume_id = j11;
            tL_inputEncryptedFileLocation.local_id = tL_fileLocationToBeDeprecated.local_id;
            tL_inputEncryptedFileLocation.access_hash = acVar.f21487e;
            byte[] bArr = new byte[32];
            this.f23483i0 = bArr;
            System.arraycopy(acVar.d, 0, bArr, 0, 32);
            this.f23480h0 = acVar.f21486c;
        } else if (acVar.f21495n != null) {
            TLRPC.TL_inputPeerPhotoFileLocation tL_inputPeerPhotoFileLocation = new TLRPC.TL_inputPeerPhotoFileLocation();
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = acVar.f21488f;
            long j12 = tL_fileLocationToBeDeprecated2.volume_id;
            tL_inputPeerPhotoFileLocation.f27016id = j12;
            tL_inputPeerPhotoFileLocation.volume_id = j12;
            tL_inputPeerPhotoFileLocation.local_id = tL_fileLocationToBeDeprecated2.local_id;
            tL_inputPeerPhotoFileLocation.photo_id = acVar.f21500s;
            tL_inputPeerPhotoFileLocation.big = acVar.f21494m == 0;
            tL_inputPeerPhotoFileLocation.peer = acVar.f21495n;
            this.V = tL_inputPeerPhotoFileLocation;
        } else if (acVar.f21496o != null) {
            TLRPC.TL_inputStickerSetThumb tL_inputStickerSetThumb = new TLRPC.TL_inputStickerSetThumb();
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated3 = acVar.f21488f;
            long j13 = tL_fileLocationToBeDeprecated3.volume_id;
            tL_inputStickerSetThumb.f27016id = j13;
            tL_inputStickerSetThumb.volume_id = j13;
            tL_inputStickerSetThumb.local_id = tL_fileLocationToBeDeprecated3.local_id;
            tL_inputStickerSetThumb.thumb_version = acVar.f21498q;
            tL_inputStickerSetThumb.stickerset = acVar.f21496o;
            this.V = tL_inputStickerSetThumb;
        } else if (acVar.f21502u != null) {
            if (acVar.f21500s != 0) {
                TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation = new TLRPC.TL_inputPhotoFileLocation();
                this.V = tL_inputPhotoFileLocation;
                tL_inputPhotoFileLocation.f27016id = acVar.f21500s;
                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated4 = acVar.f21488f;
                tL_inputPhotoFileLocation.volume_id = tL_fileLocationToBeDeprecated4.volume_id;
                tL_inputPhotoFileLocation.local_id = tL_fileLocationToBeDeprecated4.local_id;
                tL_inputPhotoFileLocation.access_hash = acVar.f21487e;
                tL_inputPhotoFileLocation.file_reference = acVar.f21485b;
                tL_inputPhotoFileLocation.thumb_size = acVar.f21502u;
                if (acVar.f21497p == 2) {
                    this.f23496o0 = true;
                }
            } else {
                TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation = new TLRPC.TL_inputDocumentFileLocation();
                this.V = tL_inputDocumentFileLocation;
                tL_inputDocumentFileLocation.f27016id = acVar.f21501t;
                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated5 = acVar.f21488f;
                tL_inputDocumentFileLocation.volume_id = tL_fileLocationToBeDeprecated5.volume_id;
                tL_inputDocumentFileLocation.local_id = tL_fileLocationToBeDeprecated5.local_id;
                tL_inputDocumentFileLocation.access_hash = acVar.f21487e;
                tL_inputDocumentFileLocation.file_reference = acVar.f21485b;
                tL_inputDocumentFileLocation.thumb_size = acVar.f21502u;
            }
            TLRPC.InputFileLocation inputFileLocation = this.V;
            if (inputFileLocation.file_reference == null) {
                inputFileLocation.file_reference = new byte[0];
            }
        } else {
            TLRPC.TL_inputFileLocation tL_inputFileLocation = new TLRPC.TL_inputFileLocation();
            this.V = tL_inputFileLocation;
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated6 = acVar.f21488f;
            tL_inputFileLocation.volume_id = tL_fileLocationToBeDeprecated6.volume_id;
            tL_inputFileLocation.local_id = tL_fileLocationToBeDeprecated6.local_id;
            tL_inputFileLocation.secret = acVar.f21487e;
            byte[] bArr2 = acVar.f21485b;
            tL_inputFileLocation.file_reference = bArr2;
            if (bArr2 == null) {
                tL_inputFileLocation.file_reference = new byte[0];
            }
            this.f23496o0 = true;
        }
        int i3 = acVar.f21497p;
        this.f23462a1 = (i3 == 1 || i3 == 3) ? true : z10;
        int i10 = acVar.f21484a;
        this.T = i10;
        this.U = i10;
        this.f23465b1 = 16777216;
        this.f23464b0 = j10;
        this.P0 = str == null ? "jpg" : str;
    }

    public static void a(i7 i7Var) {
        if (i7Var.Y == 1 && !i7Var.Z) {
            i7Var.s(-1);
        }
    }

    public static void b(i7 i7Var) {
        i7Var.l();
        w7.G(i7Var.R).e(null, null, null, null, null, i7Var.f23501r);
    }

    public static void n(long j10, long j11, ArrayList arrayList) {
        boolean z10;
        if (arrayList != null && j11 >= j10) {
            int size = arrayList.size();
            int i3 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                g7 g7Var = (g7) arrayList.get(i10);
                if (j10 == g7Var.f22671b) {
                    g7Var.f22671b = j11;
                } else if (j11 == g7Var.f22670a) {
                    g7Var.f22670a = j10;
                }
                z10 = true;
            }
            z10 = false;
            Collections.sort(arrayList, new o0.a(6));
            while (i3 < arrayList.size() - 1) {
                g7 g7Var2 = (g7) arrayList.get(i3);
                int i11 = i3 + 1;
                g7 g7Var3 = (g7) arrayList.get(i11);
                if (g7Var2.f22671b == g7Var3.f22670a) {
                    g7Var2.f22671b = g7Var3.f22671b;
                    arrayList.remove(i11);
                    i3--;
                }
                i3++;
            }
            if (!z10) {
                arrayList.add(new g7(j10, j11));
            }
        }
    }

    public final void c(long j10, long j11, ArrayList arrayList, boolean z10) {
        if (arrayList != null && j11 >= j10) {
            int size = arrayList.size();
            boolean z11 = false;
            for (int i3 = 0; i3 < size; i3++) {
                g7 g7Var = (g7) arrayList.get(i3);
                long j12 = g7Var.f22670a;
                if (j10 <= j12) {
                    if (j11 >= g7Var.f22671b) {
                        arrayList.remove(i3);
                    } else if (j11 > j12) {
                        g7Var.f22670a = j11;
                    }
                    z11 = true;
                    break;
                }
                long j13 = g7Var.f22671b;
                if (j11 < j13) {
                    arrayList.add(0, new g7(j12, j10));
                    g7Var.f22670a = j11;
                } else if (j10 < j13) {
                    g7Var.f22671b = j10;
                }
                z11 = true;
                break;
            }
            if (z10) {
                if (z11) {
                    ArrayList arrayList2 = new ArrayList(arrayList);
                    if (this.f23482i != null) {
                        k1.a(this.f23482i);
                    }
                    synchronized (this) {
                        this.Y0 = true;
                    }
                    p5 p5Var = k1;
                    y4 y4Var = new y4(6, this, arrayList2);
                    this.f23482i = y4Var;
                    p5Var.c(y4Var);
                    i();
                } else if (r2.f25040a) {
                    a8.d(this.L0 + " downloaded duplicate file part " + j10 + " - " + j11);
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
            for (int i3 = 0; i3 < this.I0.size(); i3++) {
                h7 h7Var = (h7) this.I0.get(i3);
                TLRPC.TL_upload_file tL_upload_file = h7Var.f22894f;
                if (tL_upload_file != null) {
                    tL_upload_file.disableFree = false;
                    tL_upload_file.freeResources();
                } else {
                    TLRPC.TL_upload_webFile tL_upload_webFile = h7Var.f22895g;
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
        int i3;
        int i10;
        int[] iArr = new int[8];
        long j10 = Long.MAX_VALUE;
        for (int i11 = 0; i11 < this.G0.size(); i11++) {
            h7 h7Var2 = (h7) this.G0.get(i11);
            j10 = Math.min(h7Var2.f22893e, j10);
            if (this.f23514y) {
                this.f23507u.remove(Long.valueOf(h7Var2.f22893e));
            } else {
                ArrayList arrayList = this.O;
                long j11 = h7Var2.f22893e;
                n(j11, h7Var2.f22892c + j11, arrayList);
            }
            if (h7Var != h7Var2 && h7Var2.f22890a != 0) {
                h7Var2.f22897j = true;
                if (z11) {
                    this.H0.add(h7Var2);
                    h7Var2.f22899l = new a7(this, h7Var2, 0);
                    ConnectionsManager.getInstance(this.R).cancelRequest(h7Var2.f22890a, true, new b7(h7Var2, 0));
                } else {
                    ConnectionsManager.getInstance(this.R).cancelRequest(h7Var2.f22890a, true);
                    h7Var2.f22898k = true;
                }
                if (!b6.g()) {
                    int i12 = h7Var2.d >>> 16;
                    iArr[i12] = iArr[i12] + h7Var2.f22892c;
                }
            }
        }
        for (int i13 = 0; i13 < 8; i13++) {
            int i14 = (i13 << 16) | 2;
            int i15 = iArr[i13];
            if (this.f23485j && !b6.g()) {
                i3 = 262144;
            } else {
                i3 = 1048576;
            }
            if (i15 > i3) {
                if (this.f23508u0) {
                    i10 = this.f23515y0;
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
            if (this.f23514y) {
                this.f23507u.remove(Long.valueOf(h7Var3.f22893e));
            } else {
                ArrayList arrayList2 = this.O;
                long j12 = h7Var3.f22893e;
                n(j12, h7Var3.f22892c + j12, arrayList2);
            }
            TLRPC.TL_upload_file tL_upload_file = h7Var3.f22894f;
            if (tL_upload_file != null) {
                tL_upload_file.disableFree = false;
                tL_upload_file.freeResources();
            } else {
                TLRPC.TL_upload_webFile tL_upload_webFile = h7Var3.f22895g;
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
            j10 = Math.min(h7Var3.f22893e, j10);
        }
        this.I0.clear();
        this.f23491l0 = 0;
        if (!z10 && this.f23514y) {
            this.Q = this.f23512x;
        } else if (this.M == null) {
            this.f23461a0 = j10;
            this.Q = j10;
        }
    }

    public final long f(long j10, long j11, NativeByteBuffer nativeByteBuffer) {
        int limit = nativeByteBuffer.limit();
        long j12 = j10;
        while (j12 >= j11 - 16) {
            long j13 = j11 + limit;
            if (j12 < j13) {
                int i3 = (j12 > (j13 - 16) ? 1 : (j12 == (j13 - 16) ? 0 : -1));
                byte[] bArr = this.H;
                if (i3 >= 0) {
                    long j14 = j13 - j12;
                    if (j14 <= 2147483647L) {
                        this.I = (int) j14;
                        nativeByteBuffer.position(nativeByteBuffer.limit() - this.I);
                        nativeByteBuffer.readBytes(bArr, 0, this.I, false);
                        return j13;
                    }
                    throw new RuntimeException("!!!");
                }
                if (this.I != 0) {
                    nativeByteBuffer.position(0);
                    int i10 = this.I;
                    nativeByteBuffer.readBytes(bArr, i10, 16 - i10, false);
                    this.I = 0;
                } else {
                    long j15 = j12 - j11;
                    if (j15 <= 2147483647L) {
                        nativeByteBuffer.position((int) j15);
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
                    j12 += i11;
                    if (j12 >= j13) {
                        return j12;
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
        Utilities.d.c(new fg(this, fileArr, countDownLatch, 21));
        try {
            countDownLatch.await();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        return fileArr[0];
    }

    public final long h(long j10, long j11, ArrayList arrayList) {
        long j12;
        if (arrayList != null && this.Y != 3 && !arrayList.isEmpty()) {
            int size = arrayList.size();
            g7 g7Var = null;
            int i3 = 0;
            while (true) {
                if (i3 < size) {
                    g7 g7Var2 = (g7) arrayList.get(i3);
                    long j13 = g7Var2.f22670a;
                    if (j10 <= j13 && (g7Var == null || j13 < g7Var.f22670a)) {
                        g7Var = g7Var2;
                    }
                    if (j13 <= j10 && g7Var2.f22671b > j10) {
                        j12 = 0;
                        break;
                    }
                    i3++;
                } else {
                    j12 = j11;
                    break;
                }
            }
            if (j12 == 0) {
                return 0L;
            }
            if (g7Var != null) {
                return Math.min(j11, g7Var.f22670a - j10);
            }
            return Math.min(j11, Math.max(this.f23464b0 - j10, 0L));
        } else if (this.Y == 3) {
            return j11;
        } else {
            long j14 = this.f23461a0;
            if (j14 == 0) {
                return 0L;
            }
            return Math.min(j11, Math.max(j14 - j10, 0L));
        }
    }

    public final void i() {
        ArrayList arrayList = this.f23492m;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((j7) this.f23492m.get(i3)).a();
            }
        }
    }

    public final void j(int i3, boolean z10) {
        int i10;
        d();
        if (i3 == 1) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        this.Y = i10;
        if (this.f23478g0 != null && r2.f25040a) {
            long j10 = 0;
            if (this.f23470d1 != 0) {
                j10 = System.currentTimeMillis() - this.f23470d1;
            }
            if (i3 == 1) {
                a8.b("cancel downloading file to " + this.L0 + " time = " + j10 + " dc = " + this.T + " size = " + g0.i0(this.f23464b0, false, false));
            } else {
                a8.b("failed downloading file to " + this.L0 + " reason = " + i3 + " time = " + j10 + " dc = " + this.T + " size = " + g0.i0(this.f23464b0, false, false));
            }
        }
        if (z10) {
            Utilities.d.c(new z6(this, i3, 3));
            return;
        }
        u7 u7Var = this.f23478g0;
        if (u7Var != null) {
            u7Var.b(this, i3);
        }
        i();
    }

    public final void k(int i3, boolean z10, boolean z11) {
        if (this.Y != 1 && this.Y != 5) {
            return;
        }
        this.Y = 3;
        i();
        d();
        if (!this.f23514y && !z11) {
            k1.c(new zx(2, this, this.M0, this.N0, this.A, this.J0, z10));
            this.M0 = null;
            this.N0 = null;
            this.A = null;
            this.f23478g0.getClass();
            w7.K.c(new y4(10, this, this.f23473e1));
            return;
        }
        this.f23516z = true;
        boolean z12 = r2.f25040a;
        if (i3 == 1) {
            a8.b("file already exist " + this.J0);
        } else {
            StringBuilder sb2 = new StringBuilder("finished preloading file to ");
            sb2.append(this.J0);
            sb2.append(" loaded ");
            sb2.append(this.f23461a0);
            sb2.append(" of ");
            sb2.append(this.f23464b0);
            sb2.append(" prefSize=");
            k2.p1.q(this.J, sb2);
        }
        if (this.X0 != null) {
            if (this.J0 != null) {
                f8 f8Var = w7.G(this.R).d;
                List singletonList = Collections.singletonList(new di.b(this.J0));
                f8Var.getClass();
                f8Var.h(new y4(12, f8Var, singletonList));
            }
            if (this.N0 != null) {
                f8 f8Var2 = w7.G(this.R).d;
                List singletonList2 = Collections.singletonList(new di.b(this.N0));
                f8Var2.getClass();
                f8Var2.h(new y4(12, f8Var2, singletonList2));
            }
        }
        this.f23478g0.getClass();
        w7.K.c(new y4(10, this, this.f23473e1));
        this.f23478g0.c(this, this.L0);
    }

    public final void l() {
        if (this.Y != 1) {
            return;
        }
        this.Z = true;
        this.f23479g1 = 0L;
        Utilities.d.c(new y6(this, 4));
    }

    public final boolean m(org.telegram.messenger.h7 r46, org.telegram.tgnet.TLRPC.TL_error r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.i7.m(org.telegram.messenger.h7, org.telegram.tgnet.TLRPC$TL_error):boolean");
    }

    public final void o(long j10) {
        if (this.E0) {
            return;
        }
        this.E0 = true;
        TLRPC.TL_upload_getCdnFileHashes tL_upload_getCdnFileHashes = new TLRPC.TL_upload_getCdnFileHashes();
        tL_upload_getCdnFileHashes.file_token = this.f23513x0;
        tL_upload_getCdnFileHashes.offset = j10;
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
        Object obj = this.f23498p0;
        if (obj instanceof zi) {
            zi ziVar = (zi) obj;
            if (ziVar.f1() < 0 && (message = ziVar.f26868k) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null) {
                this.f23498p0 = webPage;
                this.f23485j = false;
            }
        }
        if (r2.f25040a) {
            a8.b("debug_loading: " + this.L0.getName() + " file reference expired ");
        }
        r8.n(this.R).u(new Object[]{this.V, this, h7Var}, this.f23498p0);
    }

    public final void q(boolean z10) {
        if (this.f23514y != z10) {
            if (!z10 || this.f23464b0 > 2097152) {
                a8.d("setIsPreloadVideoOperation " + z10 + " file=" + this.f23501r);
                if (!z10 && this.f23514y) {
                    if (this.Y == 3) {
                        this.f23514y = z10;
                        if (this.f23486j0 != 0 && !this.f23471e && !this.f23485j && !this.f23502r0) {
                            t();
                        }
                        this.Y = 0;
                        this.f23516z = false;
                        r();
                        return;
                    } else if (this.Y == 1) {
                        Utilities.d.c(new d7(this, z10, 1));
                        return;
                    } else {
                        this.f23514y = z10;
                        return;
                    }
                }
                this.f23514y = z10;
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
        int i3;
        if (!hp.s1(this.R).H3 && this.f23464b0 > 0 && this.f23480h0 == null && !this.f23494n0 && !this.f23514y && this.J == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f23474f = z10;
        if (z10) {
            boolean q10 = h10.i(this.R).q();
            int i10 = 2;
            if (q10) {
                i3 = 8;
            } else {
                i3 = 2;
            }
            this.f23477g = i3;
            if (q10) {
                i10 = 16;
            }
            this.f23489k0 = (i10 * 1048576) / this.f23486j0;
        }
    }

    public final void u() {
        if ((this.J > 0 || hp.s1(this.R).G3) && !this.f23471e) {
            this.f23493n = 524288;
            this.f23495o = 8;
            this.f23497p = 8;
        } else {
            this.f23493n = 131072;
            this.f23495o = 4;
            this.f23497p = 4;
        }
        if (this.f23485j) {
            this.f23493n = 131072;
            this.f23497p = 8;
        }
        this.f23499q = (int) (2097152000 / this.f23493n);
    }

    public i7(wv wvVar) {
        this.f23477g = 2;
        this.h = new y6(this, 0);
        this.f23493n = 131072;
        this.f23495o = 4;
        this.f23497p = 4;
        this.f23499q = (int) (2097152000 / 131072);
        this.H = new byte[24];
        this.Y = 0;
        this.F0 = new ArrayList();
        this.f23476f1 = new y6(this, 5);
        u();
        TLRPC.TL_inputSecureFileLocation tL_inputSecureFileLocation = new TLRPC.TL_inputSecureFileLocation();
        this.V = tL_inputSecureFileLocation;
        TLRPC.TL_secureFile tL_secureFile = wvVar.f26263b;
        tL_inputSecureFileLocation.f27016id = tL_secureFile.f27138id;
        tL_inputSecureFileLocation.access_hash = tL_secureFile.access_hash;
        this.T = tL_secureFile.dc_id;
        this.f23464b0 = tL_secureFile.size;
        this.f23496o0 = true;
        this.f23465b1 = 67108864;
        this.P0 = ".jpg";
    }

    public i7(int i3, e20 e20Var) {
        this.f23477g = 2;
        this.h = new y6(this, 0);
        this.f23493n = 131072;
        this.f23495o = 4;
        this.f23497p = 4;
        this.f23499q = (int) (2097152000 / 131072);
        this.H = new byte[24];
        this.Y = 0;
        this.F0 = new ArrayList();
        this.f23476f1 = new y6(this, 5);
        u();
        this.R = i3;
        this.X = e20Var;
        this.W = e20Var.f22295b;
        this.f23464b0 = e20Var.d;
        int i10 = hp.s1(i3).O3;
        this.T = i10;
        this.U = i10;
        String H = w7.H(e20Var.f22297e);
        if (e20Var.f22297e.startsWith("image/")) {
            this.f23465b1 = 16777216;
        } else if (e20Var.f22297e.equals("audio/ogg")) {
            this.f23465b1 = 50331648;
        } else if (e20Var.f22297e.startsWith("video/")) {
            this.f23465b1 = 33554432;
        } else {
            this.f23465b1 = 67108864;
        }
        this.f23496o0 = true;
        this.P0 = zb.B(e20Var.f22294a, H);
    }

    public i7(java.lang.Object r13, org.telegram.tgnet.TLRPC.Document r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.i7.<init>(java.lang.Object, org.telegram.tgnet.TLRPC$Document):void");
    }
}
