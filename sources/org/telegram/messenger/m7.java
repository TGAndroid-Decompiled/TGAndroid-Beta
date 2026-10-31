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
public final class m7 {
    public static rf.x l1;
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
    public final b30 X;
    public final j8 X0;
    public volatile int Y;
    public volatile boolean Y0;
    public volatile boolean Z;
    public volatile boolean Z0;
    public boolean f16872a;
    public long f16873a0;
    public boolean f16874a1;
    public n7 f16875b;
    public long f16876b0;
    public final int f16877b1;
    public boolean f16878c;
    public final long f16879c0;
    public j4.w f16880c1;
    public long d;
    public long f16881d0;
    public long f16882d1;
    public boolean e;
    public long f16883e0;
    public bg.h f16884e1;
    public boolean f16885f;
    public l7 f16886f0;
    public final Runnable f16887f1;
    public int f16888g;
    public z7 f16889g0;
    public long f16890g1;
    public final Runnable h;
    public final byte[] f16891h0;
    public long f16892h1;
    public t6 f16893i;
    public final byte[] f16894i0;
    public long f16895i1;
    public boolean f16896j;
    public int f16897j0;
    public int f16898j1;
    public final boolean f16899k;
    public int f16900k0;
    public volatile boolean f16901l;
    public int f16902l0;
    public ArrayList f16903m;
    public int m0;
    public int f16904n;
    public boolean f16905n0;
    public int f16906o;
    public boolean f16907o0;
    public int f16908p;
    public Object f16909p0;
    public int f16910q;
    public HashMap f16911q0;
    public String f16912r;
    public final boolean f16913r0;
    public String f16914s;
    public byte[] f16915s0;
    public HashMap f16916t;
    public byte[] f16917t0;
    public HashMap f16918u;
    public boolean f16919u0;
    public RandomAccessFile v;
    public byte[] f16920v0;
    public int f16921w;
    public byte[] f16922w0;
    public int f16923x;
    public byte[] f16924x0;
    public boolean f16925y;
    public int f16926y0;
    public boolean f16927z;
    public boolean f16928z0;
    public static volatile r5 f16870k1 = new r5("writeFileQueue");
    public static final Object f16871m1 = new Object();

    public m7(ic icVar, Object obj, String str, long j10) {
        this.f16888g = 2;
        this.h = new b7(this, 0);
        this.f16904n = 131072;
        this.f16906o = 4;
        this.f16908p = 4;
        this.f16910q = (int) (2097152000 / 131072);
        this.H = new byte[24];
        boolean z10 = false;
        this.Y = 0;
        this.F0 = new ArrayList();
        this.f16887f1 = new b7(this, 5);
        u();
        this.f16909p0 = obj;
        this.f16896j = obj instanceof TL_stories.TL_storyItem;
        this.X0 = b8.E(obj);
        this.f16913r0 = icVar.f16109p == 2;
        if (icVar.f16099c != null) {
            TLRPC.TL_inputEncryptedFileLocation tL_inputEncryptedFileLocation = new TLRPC.TL_inputEncryptedFileLocation();
            this.V = tL_inputEncryptedFileLocation;
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = icVar.f16100f;
            long j11 = tL_fileLocationToBeDeprecated.volume_id;
            tL_inputEncryptedFileLocation.f19808id = j11;
            tL_inputEncryptedFileLocation.volume_id = j11;
            tL_inputEncryptedFileLocation.local_id = tL_fileLocationToBeDeprecated.local_id;
            tL_inputEncryptedFileLocation.access_hash = icVar.e;
            byte[] bArr = new byte[32];
            this.f16894i0 = bArr;
            System.arraycopy(icVar.d, 0, bArr, 0, 32);
            this.f16891h0 = icVar.f16099c;
        } else if (icVar.f16107n != null) {
            TLRPC.TL_inputPeerPhotoFileLocation tL_inputPeerPhotoFileLocation = new TLRPC.TL_inputPeerPhotoFileLocation();
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = icVar.f16100f;
            long j12 = tL_fileLocationToBeDeprecated2.volume_id;
            tL_inputPeerPhotoFileLocation.f19808id = j12;
            tL_inputPeerPhotoFileLocation.volume_id = j12;
            tL_inputPeerPhotoFileLocation.local_id = tL_fileLocationToBeDeprecated2.local_id;
            tL_inputPeerPhotoFileLocation.photo_id = icVar.f16112s;
            tL_inputPeerPhotoFileLocation.big = icVar.f16106m == 0;
            tL_inputPeerPhotoFileLocation.peer = icVar.f16107n;
            this.V = tL_inputPeerPhotoFileLocation;
        } else if (icVar.f16108o != null) {
            TLRPC.TL_inputStickerSetThumb tL_inputStickerSetThumb = new TLRPC.TL_inputStickerSetThumb();
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated3 = icVar.f16100f;
            long j13 = tL_fileLocationToBeDeprecated3.volume_id;
            tL_inputStickerSetThumb.f19808id = j13;
            tL_inputStickerSetThumb.volume_id = j13;
            tL_inputStickerSetThumb.local_id = tL_fileLocationToBeDeprecated3.local_id;
            tL_inputStickerSetThumb.thumb_version = icVar.f16110q;
            tL_inputStickerSetThumb.stickerset = icVar.f16108o;
            this.V = tL_inputStickerSetThumb;
        } else if (icVar.f16114u != null) {
            if (icVar.f16112s != 0) {
                TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation = new TLRPC.TL_inputPhotoFileLocation();
                this.V = tL_inputPhotoFileLocation;
                tL_inputPhotoFileLocation.f19808id = icVar.f16112s;
                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated4 = icVar.f16100f;
                tL_inputPhotoFileLocation.volume_id = tL_fileLocationToBeDeprecated4.volume_id;
                tL_inputPhotoFileLocation.local_id = tL_fileLocationToBeDeprecated4.local_id;
                tL_inputPhotoFileLocation.access_hash = icVar.e;
                tL_inputPhotoFileLocation.file_reference = icVar.f16098b;
                tL_inputPhotoFileLocation.thumb_size = icVar.f16114u;
                if (icVar.f16109p == 2) {
                    this.f16907o0 = true;
                }
            } else {
                TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation = new TLRPC.TL_inputDocumentFileLocation();
                this.V = tL_inputDocumentFileLocation;
                tL_inputDocumentFileLocation.f19808id = icVar.f16113t;
                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated5 = icVar.f16100f;
                tL_inputDocumentFileLocation.volume_id = tL_fileLocationToBeDeprecated5.volume_id;
                tL_inputDocumentFileLocation.local_id = tL_fileLocationToBeDeprecated5.local_id;
                tL_inputDocumentFileLocation.access_hash = icVar.e;
                tL_inputDocumentFileLocation.file_reference = icVar.f16098b;
                tL_inputDocumentFileLocation.thumb_size = icVar.f16114u;
            }
            TLRPC.InputFileLocation inputFileLocation = this.V;
            if (inputFileLocation.file_reference == null) {
                inputFileLocation.file_reference = new byte[0];
            }
        } else {
            TLRPC.TL_inputFileLocation tL_inputFileLocation = new TLRPC.TL_inputFileLocation();
            this.V = tL_inputFileLocation;
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated6 = icVar.f16100f;
            tL_inputFileLocation.volume_id = tL_fileLocationToBeDeprecated6.volume_id;
            tL_inputFileLocation.local_id = tL_fileLocationToBeDeprecated6.local_id;
            tL_inputFileLocation.secret = icVar.e;
            byte[] bArr2 = icVar.f16098b;
            tL_inputFileLocation.file_reference = bArr2;
            if (bArr2 == null) {
                tL_inputFileLocation.file_reference = new byte[0];
            }
            this.f16907o0 = true;
        }
        int i10 = icVar.f16109p;
        this.f16874a1 = (i10 == 1 || i10 == 3) ? true : z10;
        int i11 = icVar.f16097a;
        this.T = i11;
        this.U = i11;
        this.f16877b1 = 16777216;
        this.f16876b0 = j10;
        this.P0 = str == null ? "jpg" : str;
    }

    public static void a(m7 m7Var) {
        if (m7Var.Y == 1 && !m7Var.Z) {
            m7Var.s(-1);
        }
    }

    public static void b(m7 m7Var) {
        m7Var.l();
        b8.G(m7Var.R).e(null, null, null, null, null, m7Var.f16912r);
    }

    public static void n(long j10, long j11, ArrayList arrayList) {
        boolean z10;
        if (arrayList != null && j11 >= j10) {
            int size = arrayList.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                k7 k7Var = (k7) arrayList.get(i11);
                if (j10 == k7Var.f16543b) {
                    k7Var.f16543b = j11;
                } else if (j11 == k7Var.f16542a) {
                    k7Var.f16542a = j10;
                }
                z10 = true;
            }
            z10 = false;
            Collections.sort(arrayList, new a4.d(18));
            while (i10 < arrayList.size() - 1) {
                k7 k7Var2 = (k7) arrayList.get(i10);
                int i12 = i10 + 1;
                k7 k7Var3 = (k7) arrayList.get(i12);
                if (k7Var2.f16543b == k7Var3.f16542a) {
                    k7Var2.f16543b = k7Var3.f16543b;
                    arrayList.remove(i12);
                    i10--;
                }
                i10++;
            }
            if (!z10) {
                arrayList.add(new k7(j10, j11));
            }
        }
    }

    public final void c(long j10, long j11, ArrayList arrayList, boolean z10) {
        if (arrayList != null && j11 >= j10) {
            int size = arrayList.size();
            boolean z11 = false;
            for (int i10 = 0; i10 < size; i10++) {
                k7 k7Var = (k7) arrayList.get(i10);
                long j12 = k7Var.f16542a;
                if (j10 <= j12) {
                    if (j11 >= k7Var.f16543b) {
                        arrayList.remove(i10);
                    } else if (j11 > j12) {
                        k7Var.f16542a = j11;
                    }
                    z11 = true;
                    break;
                }
                long j13 = k7Var.f16543b;
                if (j11 < j13) {
                    arrayList.add(0, new k7(j12, j10));
                    k7Var.f16542a = j11;
                } else if (j10 < j13) {
                    k7Var.f16543b = j10;
                }
                z11 = true;
                break;
            }
            if (z10) {
                if (z11) {
                    ArrayList arrayList2 = new ArrayList(arrayList);
                    if (this.f16893i != null) {
                        f16870k1.a(this.f16893i);
                    }
                    synchronized (this) {
                        this.Y0 = true;
                    }
                    r5 r5Var = f16870k1;
                    t6 t6Var = new t6(4, this, arrayList2);
                    this.f16893i = t6Var;
                    r5Var.c(t6Var);
                    i();
                } else if (v2.f18448a) {
                    f8.d(this.L0 + " downloaded duplicate file part " + j10 + " - " + j11);
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
                } catch (Exception e) {
                    f8.g(e, true);
                }
                this.Q0.close();
                this.Q0 = null;
            }
        } catch (Exception e7) {
            f8.g(e7, true);
        }
        try {
            RandomAccessFile randomAccessFile2 = this.v;
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.getChannel().close();
                } catch (Exception e10) {
                    f8.g(e10, true);
                }
                this.v.close();
                this.v = null;
            }
        } catch (Exception e11) {
            f8.g(e11, true);
        }
        try {
            RandomAccessFile randomAccessFile3 = this.C0;
            if (randomAccessFile3 != null) {
                try {
                    randomAccessFile3.getChannel().close();
                } catch (Exception e12) {
                    f8.g(e12, true);
                }
                this.C0.close();
                this.C0 = null;
            }
        } catch (Exception e13) {
            f8.g(e13, true);
        }
        try {
            if (this.S0 != null) {
                synchronized (this) {
                    if (!this.Y0) {
                        try {
                            this.S0.getChannel().close();
                        } catch (Exception e14) {
                            f8.g(e14, true);
                        }
                        this.S0.close();
                        this.S0 = null;
                    } else {
                        this.Z0 = true;
                    }
                }
            }
        } catch (Exception e15) {
            f8.g(e15, true);
        }
        try {
            RandomAccessFile randomAccessFile4 = this.R0;
            if (randomAccessFile4 != null) {
                randomAccessFile4.close();
                this.R0 = null;
            }
        } catch (Exception e16) {
            f8.g(e16, true);
        }
        if (this.I0 != null) {
            for (int i10 = 0; i10 < this.I0.size(); i10++) {
                l7 l7Var = (l7) this.I0.get(i10);
                TLRPC.TL_upload_file tL_upload_file = l7Var.f16708f;
                if (tL_upload_file != null) {
                    tL_upload_file.disableFree = false;
                    tL_upload_file.freeResources();
                } else {
                    TLRPC.TL_upload_webFile tL_upload_webFile = l7Var.f16709g;
                    if (tL_upload_webFile != null) {
                        tL_upload_webFile.disableFree = false;
                        tL_upload_webFile.freeResources();
                    } else {
                        TLRPC.TL_upload_cdnFile tL_upload_cdnFile = l7Var.h;
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

    public final void e(l7 l7Var, boolean z10, boolean z11) {
        int i10;
        int i11;
        int[] iArr = new int[8];
        long j10 = Long.MAX_VALUE;
        for (int i12 = 0; i12 < this.G0.size(); i12++) {
            l7 l7Var2 = (l7) this.G0.get(i12);
            j10 = Math.min(l7Var2.e, j10);
            if (this.f16925y) {
                this.f16918u.remove(Long.valueOf(l7Var2.e));
            } else {
                ArrayList arrayList = this.O;
                long j11 = l7Var2.e;
                n(j11, l7Var2.f16707c + j11, arrayList);
            }
            if (l7Var != l7Var2 && l7Var2.f16705a != 0) {
                l7Var2.f16711j = true;
                if (z11) {
                    this.H0.add(l7Var2);
                    l7Var2.f16713l = new e7(this, l7Var2, 0);
                    ConnectionsManager.getInstance(this.R).cancelRequest(l7Var2.f16705a, true, new f7(l7Var2, 0));
                } else {
                    ConnectionsManager.getInstance(this.R).cancelRequest(l7Var2.f16705a, true);
                    l7Var2.f16712k = true;
                }
                if (!d6.g()) {
                    int i13 = l7Var2.d >>> 16;
                    iArr[i13] = iArr[i13] + l7Var2.f16707c;
                }
            }
        }
        for (int i14 = 0; i14 < 8; i14++) {
            int i15 = (i14 << 16) | 2;
            int i16 = iArr[i14];
            if (this.f16896j && !d6.g()) {
                i10 = 262144;
            } else {
                i10 = 1048576;
            }
            if (i16 > i10) {
                if (this.f16919u0) {
                    i11 = this.f16926y0;
                } else {
                    i11 = this.T;
                }
                ConnectionsManager.getInstance(this.R).discardConnection(i11, i15);
            }
        }
        this.G0.clear();
        i0.g3(new b7(this, 2));
        for (int i17 = 0; i17 < this.I0.size(); i17++) {
            l7 l7Var3 = (l7) this.I0.get(i17);
            if (this.f16925y) {
                this.f16918u.remove(Long.valueOf(l7Var3.e));
            } else {
                ArrayList arrayList2 = this.O;
                long j12 = l7Var3.e;
                n(j12, l7Var3.f16707c + j12, arrayList2);
            }
            TLRPC.TL_upload_file tL_upload_file = l7Var3.f16708f;
            if (tL_upload_file != null) {
                tL_upload_file.disableFree = false;
                tL_upload_file.freeResources();
            } else {
                TLRPC.TL_upload_webFile tL_upload_webFile = l7Var3.f16709g;
                if (tL_upload_webFile != null) {
                    tL_upload_webFile.disableFree = false;
                    tL_upload_webFile.freeResources();
                } else {
                    TLRPC.TL_upload_cdnFile tL_upload_cdnFile = l7Var3.h;
                    if (tL_upload_cdnFile != null) {
                        tL_upload_cdnFile.disableFree = false;
                        tL_upload_cdnFile.freeResources();
                    }
                }
            }
            j10 = Math.min(l7Var3.e, j10);
        }
        this.I0.clear();
        this.f16902l0 = 0;
        if (!z10 && this.f16925y) {
            this.Q = this.f16923x;
        } else if (this.M == null) {
            this.f16873a0 = j10;
            this.Q = j10;
        }
    }

    public final long f(long j10, long j11, NativeByteBuffer nativeByteBuffer) {
        int limit = nativeByteBuffer.limit();
        long j12 = j10;
        while (j12 >= j11 - 16) {
            long j13 = j11 + limit;
            if (j12 < j13) {
                int i10 = (j12 > (j13 - 16) ? 1 : (j12 == (j13 - 16) ? 0 : -1));
                byte[] bArr = this.H;
                if (i10 >= 0) {
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
                    int i11 = this.I;
                    nativeByteBuffer.readBytes(bArr, i11, 16 - i11, false);
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
                int i12 = ((bArr[0] & 255) << 24) + ((bArr[1] & 255) << 16) + ((bArr[2] & 255) << 8) + (bArr[3] & 255);
                if (i12 != 0) {
                    if (i12 == 1) {
                        i12 = ((bArr[12] & 255) << 24) + ((bArr[13] & 255) << 16) + ((bArr[14] & 255) << 8) + (bArr[15] & 255);
                    }
                    if (bArr[4] == 109 && bArr[5] == 111 && bArr[6] == 111 && bArr[7] == 118) {
                        return -i12;
                    }
                    j12 += i12;
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
        Utilities.d.c(new mg(this, fileArr, countDownLatch, 21));
        try {
            countDownLatch.await();
        } catch (Exception e) {
            f8.g(e, true);
        }
        return fileArr[0];
    }

    public final long h(long j10, long j11, ArrayList arrayList) {
        long j12;
        if (arrayList != null && this.Y != 3 && !arrayList.isEmpty()) {
            int size = arrayList.size();
            k7 k7Var = null;
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    k7 k7Var2 = (k7) arrayList.get(i10);
                    long j13 = k7Var2.f16542a;
                    if (j10 <= j13 && (k7Var == null || j13 < k7Var.f16542a)) {
                        k7Var = k7Var2;
                    }
                    if (j13 <= j10 && k7Var2.f16543b > j10) {
                        j12 = 0;
                        break;
                    }
                    i10++;
                } else {
                    j12 = j11;
                    break;
                }
            }
            if (j12 == 0) {
                return 0L;
            }
            if (k7Var != null) {
                return Math.min(j11, k7Var.f16542a - j10);
            }
            return Math.min(j11, Math.max(this.f16876b0 - j10, 0L));
        } else if (this.Y == 3) {
            return j11;
        } else {
            long j14 = this.f16873a0;
            if (j14 == 0) {
                return 0L;
            }
            return Math.min(j11, Math.max(j14 - j10, 0L));
        }
    }

    public final void i() {
        ArrayList arrayList = this.f16903m;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((n7) this.f16903m.get(i10)).a();
            }
        }
    }

    public final void j(int i10, boolean z10) {
        int i11;
        d();
        if (i10 == 1) {
            i11 = 4;
        } else {
            i11 = 2;
        }
        this.Y = i11;
        if (this.f16889g0 != null && v2.f18448a) {
            long j10 = 0;
            if (this.f16882d1 != 0) {
                j10 = System.currentTimeMillis() - this.f16882d1;
            }
            if (i10 == 1) {
                f8.b("cancel downloading file to " + this.L0 + " time = " + j10 + " dc = " + this.T + " size = " + i0.i0(this.f16876b0, false, false));
            } else {
                f8.b("failed downloading file to " + this.L0 + " reason = " + i10 + " time = " + j10 + " dc = " + this.T + " size = " + i0.i0(this.f16876b0, false, false));
            }
        }
        if (z10) {
            Utilities.d.c(new d7(this, i10, 3));
            return;
        }
        z7 z7Var = this.f16889g0;
        if (z7Var != null) {
            z7Var.b(this, i10);
        }
        i();
    }

    public final void k(int i10, boolean z10, boolean z11) {
        if (this.Y != 1 && this.Y != 5) {
            return;
        }
        this.Y = 3;
        i();
        d();
        if (!this.f16925y && !z11) {
            f16870k1.c(new sy(this, this.M0, this.N0, this.A, this.J0, z10, 2));
            this.M0 = null;
            this.N0 = null;
            this.A = null;
            this.f16889g0.getClass();
            b8.J.c(new t6(8, this, this.f16884e1));
            return;
        }
        this.f16927z = true;
        boolean z12 = v2.f18448a;
        if (i10 == 1) {
            f8.b("file already exist " + this.J0);
        } else {
            StringBuilder sb2 = new StringBuilder("finished preloading file to ");
            sb2.append(this.J0);
            sb2.append(" loaded ");
            sb2.append(this.f16873a0);
            sb2.append(" of ");
            sb2.append(this.f16876b0);
            sb2.append(" prefSize=");
            i0.a.p(this.J, sb2);
        }
        if (this.X0 != null) {
            if (this.J0 != null) {
                k8 k8Var = b8.G(this.R).d;
                List singletonList = Collections.singletonList(new sh.a(this.J0));
                k8Var.getClass();
                k8Var.h(new t6(10, k8Var, singletonList));
            }
            if (this.N0 != null) {
                k8 k8Var2 = b8.G(this.R).d;
                List singletonList2 = Collections.singletonList(new sh.a(this.N0));
                k8Var2.getClass();
                k8Var2.h(new t6(10, k8Var2, singletonList2));
            }
        }
        this.f16889g0.getClass();
        b8.J.c(new t6(8, this, this.f16884e1));
        this.f16889g0.c(this, this.L0);
    }

    public final void l() {
        if (this.Y != 1) {
            return;
        }
        this.Z = true;
        this.f16890g1 = 0L;
        Utilities.d.c(new b7(this, 4));
    }

    public final boolean m(org.telegram.messenger.l7 r46, org.telegram.tgnet.TLRPC.TL_error r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.m7.m(org.telegram.messenger.l7, org.telegram.tgnet.TLRPC$TL_error):boolean");
    }

    public final void o(long j10) {
        if (this.E0) {
            return;
        }
        this.E0 = true;
        TLRPC.TL_upload_getCdnFileHashes tL_upload_getCdnFileHashes = new TLRPC.TL_upload_getCdnFileHashes();
        tL_upload_getCdnFileHashes.file_token = this.f16924x0;
        tL_upload_getCdnFileHashes.offset = j10;
        ConnectionsManager.getInstance(this.R).sendRequest(tL_upload_getCdnFileHashes, new v1(this, 2), null, null, 0, this.T, 1, true);
    }

    public final void p(l7 l7Var) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        if (this.A0) {
            return;
        }
        e(null, false, false);
        this.A0 = true;
        this.B0 = true;
        Object obj = this.f16909p0;
        if (obj instanceof jj) {
            jj jjVar = (jj) obj;
            if (jjVar.f1() < 0 && (message = jjVar.f16337k) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null) {
                this.f16909p0 = webPage;
                this.f16896j = false;
            }
        }
        if (v2.f18448a) {
            f8.b("debug_loading: " + this.L0.getName() + " file reference expired ");
        }
        w8.n(this.R).u(new Object[]{this.V, this, l7Var}, this.f16909p0);
    }

    public final void q(boolean z10) {
        if (this.f16925y != z10) {
            if (!z10 || this.f16876b0 > 2097152) {
                f8.d("setIsPreloadVideoOperation " + z10 + " file=" + this.f16912r);
                if (!z10 && this.f16925y) {
                    if (this.Y == 3) {
                        this.f16925y = z10;
                        if (this.f16897j0 != 0 && !this.e && !this.f16896j && !this.f16913r0) {
                            t();
                        }
                        this.Y = 0;
                        this.f16927z = false;
                        r();
                        return;
                    } else if (this.Y == 1) {
                        Utilities.d.c(new h7(this, z10, 1));
                        return;
                    } else {
                        this.f16925y = z10;
                        return;
                    }
                }
                this.f16925y = z10;
            }
        }
    }

    public final void r() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.m7.r():void");
    }

    public final void s(int r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.m7.s(int):void");
    }

    public final void t() {
        boolean z10;
        int i10;
        if (!vp.r1(this.R).G3 && this.f16876b0 > 0 && this.f16891h0 == null && !this.f16905n0 && !this.f16925y && this.J == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f16885f = z10;
        if (z10) {
            boolean q6 = d20.i(this.R).q();
            int i11 = 2;
            if (q6) {
                i10 = 8;
            } else {
                i10 = 2;
            }
            this.f16888g = i10;
            if (q6) {
                i11 = 16;
            }
            this.f16900k0 = (i11 * 1048576) / this.f16897j0;
        }
    }

    public final void u() {
        if ((this.J > 0 || vp.r1(this.R).F3) && !this.e) {
            this.f16904n = 524288;
            this.f16906o = 8;
            this.f16908p = 8;
        } else {
            this.f16904n = 131072;
            this.f16906o = 4;
            this.f16908p = 4;
        }
        if (this.f16896j) {
            this.f16904n = 131072;
            this.f16908p = 8;
        }
        this.f16910q = (int) (2097152000 / this.f16904n);
    }

    public m7(pw pwVar) {
        this.f16888g = 2;
        this.h = new b7(this, 0);
        this.f16904n = 131072;
        this.f16906o = 4;
        this.f16908p = 4;
        this.f16910q = (int) (2097152000 / 131072);
        this.H = new byte[24];
        this.Y = 0;
        this.F0 = new ArrayList();
        this.f16887f1 = new b7(this, 5);
        u();
        TLRPC.TL_inputSecureFileLocation tL_inputSecureFileLocation = new TLRPC.TL_inputSecureFileLocation();
        this.V = tL_inputSecureFileLocation;
        TLRPC.TL_secureFile tL_secureFile = pwVar.f17489b;
        tL_inputSecureFileLocation.f19808id = tL_secureFile.f19930id;
        tL_inputSecureFileLocation.access_hash = tL_secureFile.access_hash;
        this.T = tL_secureFile.dc_id;
        this.f16876b0 = tL_secureFile.size;
        this.f16907o0 = true;
        this.f16877b1 = 67108864;
        this.P0 = ".jpg";
    }

    public m7(int i10, b30 b30Var) {
        this.f16888g = 2;
        this.h = new b7(this, 0);
        this.f16904n = 131072;
        this.f16906o = 4;
        this.f16908p = 4;
        this.f16910q = (int) (2097152000 / 131072);
        this.H = new byte[24];
        this.Y = 0;
        this.F0 = new ArrayList();
        this.f16887f1 = new b7(this, 5);
        u();
        this.R = i10;
        this.X = b30Var;
        this.W = b30Var.f14716b;
        this.f16876b0 = b30Var.d;
        int i11 = vp.r1(i10).P3;
        this.T = i11;
        this.U = i11;
        String H = b8.H(b30Var.e);
        if (b30Var.e.startsWith("image/")) {
            this.f16877b1 = 16777216;
        } else if (b30Var.e.equals("audio/ogg")) {
            this.f16877b1 = 50331648;
        } else if (b30Var.e.startsWith("video/")) {
            this.f16877b1 = 33554432;
        } else {
            this.f16877b1 = 67108864;
        }
        this.f16907o0 = true;
        this.P0 = hc.B(b30Var.f14715a, H);
    }

    public m7(java.lang.Object r13, org.telegram.tgnet.TLRPC.Document r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.m7.<init>(java.lang.Object, org.telegram.tgnet.TLRPC$Document):void");
    }
}
