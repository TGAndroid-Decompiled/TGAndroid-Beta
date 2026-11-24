package defpackage;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class lb4 {
    public static do5 l1;
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
    public byte G;
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
    public final vuc X;
    public final kc4 X0;
    public volatile byte Y;
    public volatile boolean Y0;
    public volatile boolean Z;
    public volatile boolean Z0;
    public boolean a;
    public long a0;
    public boolean a1;
    public mb4 b;
    public long b0;
    public final int b1;
    public boolean c;
    public final long c0;
    public xy c1;
    public long d;
    public long d0;
    public long d1;
    public boolean e;
    public long e0;
    public u30 e1;
    public boolean f;
    public kb4 f0;
    public final Runnable f1;
    public byte g;
    public zb4 g0;
    public long g1;
    public final Runnable h;
    public final byte[] h0;
    public long h1;
    public pv3 i;
    public final byte[] i0;
    public long i1;
    public boolean j;
    public int j0;
    public int j1;
    public final boolean k;
    public int k0;
    public volatile boolean l;
    public int l0;
    public ArrayList m;
    public int m0;
    public int n;
    public boolean n0;
    public byte o;
    public boolean o0;
    public byte p;
    public Object p0;
    public int q;
    public HashMap q0;
    public String r;
    public final boolean r0;
    public String s;
    public byte[] s0;
    public HashMap t;
    public byte[] t0;
    public HashMap u;
    public boolean u0;
    public RandomAccessFile v;
    public byte[] v0;
    public int w;
    public byte[] w0;
    public int x;
    public byte[] x0;
    public boolean y;
    public int y0;
    public boolean z;
    public boolean z0;
    public static volatile mp3 k1 = new mp3("writeFileQueue");
    public static final Object m1 = new Object();

    public lb4(Object obj, TLRPC.Document document) {
        boolean z;
        int lastIndexOf;
        this.g = (byte) 2;
        this.h = new bb4(this, (byte) 0);
        this.n = 131072;
        this.o = (byte) 4;
        this.p = (byte) 4;
        this.q = 16000;
        this.H = new byte[24];
        this.Y = (byte) 0;
        this.F0 = new ArrayList();
        this.f1 = new bb4(this, (byte) 5);
        this.k = k47.J4(document);
        if (document != null && !k47.N2(document)) {
            "application/x-tgwallpattern".equals(document.mime_type);
        }
        s();
        try {
            this.p0 = obj;
            this.j = obj instanceof TL_stories.TL_storyItem;
            this.X0 = bc4.E(obj);
            String str = "";
            if (document instanceof TLRPC.TL_documentEncrypted) {
                TLRPC.TL_inputEncryptedFileLocation tL_inputEncryptedFileLocation = new TLRPC.TL_inputEncryptedFileLocation();
                this.V = tL_inputEncryptedFileLocation;
                tL_inputEncryptedFileLocation.id = document.id;
                tL_inputEncryptedFileLocation.access_hash = document.access_hash;
                int i = document.dc_id;
                this.T = i;
                this.U = i;
                byte[] bArr = new byte[32];
                this.i0 = bArr;
                System.arraycopy(document.iv, 0, bArr, 0, 32);
                this.h0 = document.key;
            } else if (document instanceof TLRPC.TL_document) {
                TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation = new TLRPC.TL_inputDocumentFileLocation();
                this.V = tL_inputDocumentFileLocation;
                tL_inputDocumentFileLocation.id = document.id;
                tL_inputDocumentFileLocation.access_hash = document.access_hash;
                byte[] bArr2 = document.file_reference;
                tL_inputDocumentFileLocation.file_reference = bArr2;
                tL_inputDocumentFileLocation.thumb_size = "";
                if (bArr2 == null) {
                    tL_inputDocumentFileLocation.file_reference = new byte[0];
                }
                int i2 = document.dc_id;
                this.T = i2;
                this.U = i2;
                this.o0 = true;
                int size = document.attributes.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        break;
                    } else if (document.attributes.get(i3) instanceof TLRPC.TL_documentAttributeVideo) {
                        this.B = true;
                        this.J = document.attributes.get(i3).preload_prefix_size;
                        break;
                    } else {
                        i3++;
                    }
                }
                if (this.j && this.B && this.J <= 0) {
                    this.J = 524288;
                }
            }
            if (!"application/x-tgsticker".equals(document.mime_type) && !"application/x-tgwallpattern".equals(document.mime_type)) {
                z = false;
            } else {
                z = true;
            }
            this.a1 = z;
            long j = document.size;
            this.b0 = j;
            if (this.h0 != null && j % 16 != 0) {
                long j2 = 16 - (j % 16);
                this.c0 = j2;
                this.b0 = j + j2;
            }
            String B = bc4.B(document);
            this.P0 = B;
            if (B != null && (lastIndexOf = B.lastIndexOf(46)) != -1) {
                str = B.substring(lastIndexOf);
                this.P0 = str;
            } else {
                this.P0 = "";
            }
            if ("audio/ogg".equals(document.mime_type)) {
                this.b1 = 50331648;
            } else {
                String str2 = document.mime_type;
                if (!"video/mp4".equals(str2) && (!gda.z0 || !"video/x-matroska".equals(str2))) {
                    this.b1 = 67108864;
                } else {
                    this.b1 = 33554432;
                }
            }
            if (str.length() <= 1) {
                this.P0 = bc4.C(document.mime_type);
            }
        } catch (Exception e) {
            fc4.g(e, true);
            h(0, true);
        }
    }

    public static void l(long j, long j2, ArrayList arrayList) {
        boolean z;
        if (arrayList != null && j2 >= j) {
            int size = arrayList.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                jb4 jb4Var = (jb4) arrayList.get(i2);
                if (j == jb4Var.b) {
                    jb4Var.b = j2;
                } else if (j2 == jb4Var.a) {
                    jb4Var.a = j;
                }
                z = true;
            }
            z = false;
            Collections.sort(arrayList, new x03((byte) 17));
            while (i < arrayList.size() - 1) {
                jb4 jb4Var2 = (jb4) arrayList.get(i);
                int i3 = i + 1;
                jb4 jb4Var3 = (jb4) arrayList.get(i3);
                if (jb4Var2.b == jb4Var3.a) {
                    jb4Var2.b = jb4Var3.b;
                    arrayList.remove(i3);
                    i--;
                }
                i++;
            }
            if (!z) {
                arrayList.add(new jb4(j, j2));
            }
        }
    }

    public final void a(long j, long j2, ArrayList arrayList, boolean z) {
        if (arrayList != null && j2 >= j) {
            int size = arrayList.size();
            boolean z2 = false;
            for (int i = 0; i < size; i++) {
                jb4 jb4Var = (jb4) arrayList.get(i);
                long j3 = jb4Var.a;
                int i2 = (j > j3 ? 1 : (j == j3 ? 0 : -1));
                long j4 = jb4Var.b;
                if (i2 <= 0) {
                    if (j2 >= j4) {
                        arrayList.remove(i);
                    } else if (j2 > j3) {
                        jb4Var.a = j2;
                    }
                    z2 = true;
                    break;
                }
                if (j2 < j4) {
                    arrayList.add(0, new jb4(j3, j));
                    jb4Var.a = j2;
                } else if (j < j4) {
                    jb4Var.b = j;
                }
                z2 = true;
                break;
            }
            if (z) {
                if (z2) {
                    ArrayList arrayList2 = new ArrayList(arrayList);
                    if (this.i != null) {
                        k1.a(this.i);
                    }
                    synchronized (this) {
                        this.Y0 = true;
                    }
                    mp3 mp3Var = k1;
                    pv3 pv3Var = new pv3(this, arrayList2, (byte) 20);
                    this.i = pv3Var;
                    mp3Var.c(pv3Var);
                    g();
                } else if (e21.a) {
                    fc4.d(this.L0 + " downloaded duplicate file part " + j + " - " + j2);
                }
            }
        }
    }

    public final void b() {
        try {
            RandomAccessFile randomAccessFile = this.Q0;
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.getChannel().close();
                } catch (Exception e) {
                    fc4.g(e, true);
                }
                this.Q0.close();
                this.Q0 = null;
            }
        } catch (Exception e2) {
            fc4.g(e2, true);
        }
        try {
            RandomAccessFile randomAccessFile2 = this.v;
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.getChannel().close();
                } catch (Exception e3) {
                    fc4.g(e3, true);
                }
                this.v.close();
                this.v = null;
            }
        } catch (Exception e4) {
            fc4.g(e4, true);
        }
        try {
            RandomAccessFile randomAccessFile3 = this.C0;
            if (randomAccessFile3 != null) {
                try {
                    randomAccessFile3.getChannel().close();
                } catch (Exception e5) {
                    fc4.g(e5, true);
                }
                this.C0.close();
                this.C0 = null;
            }
        } catch (Exception e6) {
            fc4.g(e6, true);
        }
        try {
            if (this.S0 != null) {
                synchronized (this) {
                    if (!this.Y0) {
                        try {
                            this.S0.getChannel().close();
                        } catch (Exception e7) {
                            fc4.g(e7, true);
                        }
                        this.S0.close();
                        this.S0 = null;
                    } else {
                        this.Z0 = true;
                    }
                }
            }
        } catch (Exception e8) {
            fc4.g(e8, true);
        }
        try {
            RandomAccessFile randomAccessFile4 = this.R0;
            if (randomAccessFile4 != null) {
                randomAccessFile4.close();
                this.R0 = null;
            }
        } catch (Exception e9) {
            fc4.g(e9, true);
        }
        if (this.I0 != null) {
            int i = 0;
            while (true) {
                int size = this.I0.size();
                ArrayList arrayList = this.I0;
                if (i < size) {
                    kb4 kb4Var = (kb4) arrayList.get(i);
                    TLRPC.TL_upload_file tL_upload_file = kb4Var.f;
                    if (tL_upload_file != null) {
                        tL_upload_file.disableFree = false;
                        tL_upload_file.freeResources();
                    } else {
                        TLRPC.TL_upload_webFile tL_upload_webFile = kb4Var.g;
                        if (tL_upload_webFile != null) {
                            tL_upload_webFile.disableFree = false;
                            tL_upload_webFile.freeResources();
                        } else {
                            TLRPC.TL_upload_cdnFile tL_upload_cdnFile = kb4Var.h;
                            if (tL_upload_cdnFile != null) {
                                tL_upload_cdnFile.disableFree = false;
                                tL_upload_cdnFile.freeResources();
                            }
                        }
                    }
                    i++;
                } else {
                    arrayList.clear();
                    return;
                }
            }
        }
    }

    public final void c(kb4 kb4Var, boolean z, boolean z2) {
        ArrayList arrayList;
        int i;
        int i2;
        int[] iArr = new int[8];
        long j = Long.MAX_VALUE;
        for (int i3 = 0; i3 < this.G0.size(); i3++) {
            kb4 kb4Var2 = (kb4) this.G0.get(i3);
            j = Math.min(kb4Var2.e, j);
            if (this.y) {
                this.u.remove(Long.valueOf(kb4Var2.e));
            } else {
                ArrayList arrayList2 = this.O;
                long j2 = kb4Var2.e;
                l(j2, kb4Var2.c + j2, arrayList2);
            }
            if (kb4Var != kb4Var2 && kb4Var2.a != 0) {
                kb4Var2.j = true;
                if (z2) {
                    this.H0.add(kb4Var2);
                    kb4Var2.l = new db4(this, kb4Var2, (byte) 0);
                    ConnectionsManager.getInstance(this.R).cancelRequest(kb4Var2.a, true, new eb4(kb4Var2, (byte) 0));
                } else {
                    ConnectionsManager.getInstance(this.R).cancelRequest(kb4Var2.a, true);
                    kb4Var2.k = true;
                }
                if (!ir3.d()) {
                    int i4 = kb4Var2.d >>> 16;
                    iArr[i4] = iArr[i4] + kb4Var2.c;
                }
            }
        }
        for (int i5 = 0; i5 < 8; i5++) {
            int i6 = (i5 << 16) | 2;
            int i7 = iArr[i5];
            if (this.j && !ir3.d()) {
                i = 262144;
            } else {
                i = 1048576;
            }
            if (i7 > i) {
                if (this.u0) {
                    i2 = this.y0;
                } else {
                    i2 = this.T;
                }
                ConnectionsManager.getInstance(this.R).discardConnection(i2, i6);
            }
        }
        this.G0.clear();
        gm.c3(new bb4(this, (byte) 2));
        int i8 = 0;
        while (true) {
            int size = this.I0.size();
            arrayList = this.I0;
            if (i8 >= size) {
                break;
            }
            kb4 kb4Var3 = (kb4) arrayList.get(i8);
            if (this.y) {
                this.u.remove(Long.valueOf(kb4Var3.e));
            } else {
                ArrayList arrayList3 = this.O;
                long j3 = kb4Var3.e;
                l(j3, kb4Var3.c + j3, arrayList3);
            }
            TLRPC.TL_upload_file tL_upload_file = kb4Var3.f;
            if (tL_upload_file != null) {
                tL_upload_file.disableFree = false;
                tL_upload_file.freeResources();
            } else {
                TLRPC.TL_upload_webFile tL_upload_webFile = kb4Var3.g;
                if (tL_upload_webFile != null) {
                    tL_upload_webFile.disableFree = false;
                    tL_upload_webFile.freeResources();
                } else {
                    TLRPC.TL_upload_cdnFile tL_upload_cdnFile = kb4Var3.h;
                    if (tL_upload_cdnFile != null) {
                        tL_upload_cdnFile.disableFree = false;
                        tL_upload_cdnFile.freeResources();
                    }
                }
            }
            j = Math.min(kb4Var3.e, j);
            i8++;
        }
        arrayList.clear();
        this.l0 = 0;
        if (!z && this.y) {
            this.Q = this.x;
        } else if (this.M == null) {
            this.a0 = j;
            this.Q = j;
        }
    }

    public final long d(long j, long j2, NativeByteBuffer nativeByteBuffer) {
        long j3;
        int limit = nativeByteBuffer.limit();
        long j4 = j;
        while (j4 >= j2 - 16) {
            long j5 = j2 + limit;
            if (j4 >= j5) {
                break;
            }
            int i = (j4 > (j5 - 16) ? 1 : (j4 == (j5 - 16) ? 0 : -1));
            byte[] bArr = this.H;
            if (i >= 0) {
                long j6 = j5 - j4;
                if (j6 <= 2147483647L) {
                    this.I = (int) j6;
                    nativeByteBuffer.position(nativeByteBuffer.limit() - this.I);
                    nativeByteBuffer.readBytes(bArr, 0, this.I, false);
                    return j5;
                }
                zo4.k("!!!");
                return 0L;
            }
            if (this.I != 0) {
                nativeByteBuffer.position(0);
                int i2 = this.I;
                nativeByteBuffer.readBytes(bArr, i2, 16 - i2, false);
                this.I = 0;
                j3 = 0;
            } else {
                j3 = 0;
                long j7 = j4 - j2;
                if (j7 <= 2147483647L) {
                    nativeByteBuffer.position((int) j7);
                    nativeByteBuffer.readBytes(bArr, 0, 16, false);
                } else {
                    zo4.k("!!!");
                    return 0L;
                }
            }
            int i3 = ((bArr[0] & 255) << 24) + ((bArr[1] & 255) << 16) + ((bArr[2] & 255) << 8) + (bArr[3] & 255);
            if (i3 != 0) {
                if (i3 == 1) {
                    i3 = ((bArr[12] & 255) << 24) + ((bArr[13] & 255) << 16) + ((bArr[14] & 255) << 8) + (bArr[15] & 255);
                }
                if (bArr[4] == 109 && bArr[5] == 111 && bArr[6] == 111 && bArr[7] == 118) {
                    return -i3;
                }
                j4 += i3;
                if (j4 >= j5) {
                    return j4;
                }
            } else {
                return j3;
            }
        }
        return 0L;
    }

    public final File e() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        File[] fileArr = new File[1];
        Utilities.d.c(new pz2(this, fileArr, countDownLatch, (byte) 24));
        try {
            countDownLatch.await();
        } catch (Exception e) {
            fc4.g(e, true);
        }
        return fileArr[0];
    }

    public final long f(long j, long j2, ArrayList arrayList) {
        long j3;
        if (arrayList != null && this.Y != 3 && !arrayList.isEmpty()) {
            int size = arrayList.size();
            jb4 jb4Var = null;
            int i = 0;
            while (true) {
                if (i < size) {
                    jb4 jb4Var2 = (jb4) arrayList.get(i);
                    long j4 = jb4Var2.a;
                    if (j <= j4 && (jb4Var == null || j4 < jb4Var.a)) {
                        jb4Var = jb4Var2;
                    }
                    if (j4 <= j && jb4Var2.b > j) {
                        j3 = 0;
                        break;
                    }
                    i++;
                } else {
                    j3 = j2;
                    break;
                }
            }
            if (j3 != 0) {
                if (jb4Var != null) {
                    return Math.min(j2, jb4Var.a - j);
                }
                return Math.min(j2, Math.max(this.b0 - j, 0L));
            }
        } else if (this.Y == 3) {
            return j2;
        } else {
            long j5 = this.a0;
            if (j5 != 0) {
                return Math.min(j2, Math.max(j5 - j, 0L));
            }
        }
        return 0L;
    }

    public final void g() {
        ArrayList arrayList = this.m;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((mb4) this.m.get(i)).a();
            }
        }
    }

    public final void h(int i, boolean z) {
        byte b;
        b();
        if (i == 1) {
            b = 4;
        } else {
            b = 2;
        }
        this.Y = b;
        if (this.g0 != null && e21.a) {
            long j = 0;
            if (this.d1 != 0) {
                j = System.currentTimeMillis() - this.d1;
            }
            File file = this.L0;
            if (i == 1) {
                fc4.b("cancel downloading file to " + file + " time = " + j + " dc = " + this.T + " size = " + gm.i0(this.b0, false, false));
            } else {
                fc4.b("failed downloading file to " + file + " reason = " + i + " time = " + j + " dc = " + this.T + " size = " + gm.i0(this.b0, false, false));
            }
        }
        if (z) {
            Utilities.d.c(new cb4(this, i, (byte) 3));
            return;
        }
        zb4 zb4Var = this.g0;
        if (zb4Var != null) {
            zb4Var.b(this, i);
        }
        g();
    }

    public final void i(int i, boolean z, boolean z2) {
        if (this.Y != 1 && this.Y != 5) {
            return;
        }
        this.Y = (byte) 3;
        g();
        b();
        if (!this.y && !z2) {
            k1.c(new b5a(this, this.M0, this.N0, this.A, this.J0, z, (byte) 9));
            this.M0 = null;
            this.N0 = null;
            this.A = null;
            this.g0.getClass();
            bc4.K.c(new pv3(this, this.e1, (byte) 24));
            return;
        }
        this.z = true;
        boolean z3 = e21.a;
        File file = this.J0;
        if (i == 1) {
            fc4.b("file already exist " + file);
        } else {
            StringBuilder sb = new StringBuilder("finished preloading file to ");
            sb.append(file);
            sb.append(" loaded ");
            sb.append(this.a0);
            sb.append(" of ");
            sb.append(this.b0);
            sb.append(" prefSize=");
            b10.p(this.J, sb);
        }
        if (this.X0 != null) {
            if (this.J0 != null) {
                lc4 lc4Var = bc4.G(this.R).d;
                List singletonList = Collections.singletonList(new b81(this.J0));
                lc4Var.getClass();
                lc4Var.h(new pv3(lc4Var, singletonList, (byte) 26));
            }
            if (this.N0 != null) {
                lc4 lc4Var2 = bc4.G(this.R).d;
                List singletonList2 = Collections.singletonList(new b81(this.N0));
                lc4Var2.getClass();
                lc4Var2.h(new pv3(lc4Var2, singletonList2, (byte) 26));
            }
        }
        this.g0.getClass();
        bc4.K.c(new pv3(this, this.e1, (byte) 24));
        this.g0.c(this, this.L0);
    }

    public final void j() {
        if (this.Y != 1) {
            return;
        }
        this.Z = true;
        this.g1 = 0L;
        Utilities.d.c(new bb4(this, (byte) 4));
    }

    public final boolean k(defpackage.kb4 r45, org.telegram.tgnet.TLRPC.TL_error r46) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lb4.k(kb4, org.telegram.tgnet.TLRPC$TL_error):boolean");
    }

    public final void m(long j) {
        if (this.E0) {
            return;
        }
        this.E0 = true;
        TLRPC.TL_upload_getCdnFileHashes tL_upload_getCdnFileHashes = new TLRPC.TL_upload_getCdnFileHashes();
        tL_upload_getCdnFileHashes.file_token = this.x0;
        tL_upload_getCdnFileHashes.offset = j;
        ConnectionsManager.getInstance(this.R).sendRequest(tL_upload_getCdnFileHashes, new tg(this, (byte) 26), null, null, 0, this.T, 1, true);
    }

    public final void n(kb4 kb4Var) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        if (this.A0) {
            return;
        }
        c(null, false, false);
        this.A0 = true;
        this.B0 = true;
        Object obj = this.p0;
        if (obj instanceof k47) {
            k47 k47Var = (k47) obj;
            if (k47Var.e1() < 0 && (message = k47Var.k) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null) {
                this.p0 = webPage;
                this.j = false;
            }
        }
        if (e21.a) {
            fc4.b("debug_loading: " + this.L0.getName() + " file reference expired ");
        }
        ad4.n(this.R).u(new Object[]{this.V, this, kb4Var}, this.p0);
    }

    public final void o(boolean z) {
        if (this.y != z) {
            if (!z || this.b0 > 2097152) {
                fc4.d("setIsPreloadVideoOperation " + z + " file=" + this.r);
                if (!z && this.y) {
                    if (this.Y == 3) {
                        this.y = z;
                        if (this.j0 != 0 && !this.e && !this.j && !this.r0) {
                            r();
                        }
                        this.Y = (byte) 0;
                        this.z = false;
                        p();
                        return;
                    } else if (this.Y == 1) {
                        Utilities.d.c(new gb4(this, z, (byte) 1));
                        return;
                    } else {
                        this.y = z;
                        return;
                    }
                }
                this.y = z;
            }
        }
    }

    public final void p() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lb4.p():void");
    }

    public final void q(int r32) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lb4.q(int):void");
    }

    public final void r() {
        boolean z;
        byte b;
        if (!oc7.r1(this.R).l4.u0.f && this.b0 > 0 && this.h0 == null && !this.n0 && !this.y && this.J == 0) {
            z = true;
        } else {
            z = false;
        }
        this.f = z;
        if (z) {
            boolean p = z8c.h(this.R).p();
            int i = 2;
            if (p) {
                b = 8;
            } else {
                b = 2;
            }
            this.g = b;
            if (p) {
                i = 16;
            }
            this.k0 = (i << 20) / this.j0;
        }
    }

    public final void s() {
        int i;
        int i2 = 131072;
        if ((this.J > 0 || oc7.r1(this.R).l4.R2.f) && !this.e) {
            i = 524288;
            this.n = 524288;
            this.o = (byte) 8;
            this.p = (byte) 8;
        } else {
            this.n = 131072;
            this.o = (byte) 4;
            this.p = (byte) 4;
            i = 131072;
        }
        if (this.j) {
            this.n = 131072;
            this.p = (byte) 8;
        } else {
            i2 = i;
        }
        this.q = (int) (2097152000 / i2);
    }

    public lb4(xw9 xw9Var) {
        this.g = (byte) 2;
        this.h = new bb4(this, (byte) 0);
        this.n = 131072;
        this.o = (byte) 4;
        this.p = (byte) 4;
        this.q = 16000;
        this.H = new byte[24];
        this.Y = (byte) 0;
        this.F0 = new ArrayList();
        this.f1 = new bb4(this, (byte) 5);
        s();
        TLRPC.TL_inputSecureFileLocation tL_inputSecureFileLocation = new TLRPC.TL_inputSecureFileLocation();
        this.V = tL_inputSecureFileLocation;
        TLRPC.TL_secureFile tL_secureFile = xw9Var.b;
        tL_inputSecureFileLocation.id = tL_secureFile.id;
        tL_inputSecureFileLocation.access_hash = tL_secureFile.access_hash;
        this.T = tL_secureFile.dc_id;
        this.b0 = tL_secureFile.size;
        this.o0 = true;
        this.b1 = 67108864;
        this.P0 = ".jpg";
    }

    public lb4(int i, vuc vucVar) {
        this.g = (byte) 2;
        this.h = new bb4(this, (byte) 0);
        this.n = 131072;
        this.o = (byte) 4;
        this.p = (byte) 4;
        this.q = 16000;
        this.H = new byte[24];
        this.Y = (byte) 0;
        this.F0 = new ArrayList();
        this.f1 = new bb4(this, (byte) 5);
        s();
        this.R = i;
        this.X = vucVar;
        this.W = vucVar.b;
        this.b0 = vucVar.d;
        int i2 = oc7.r1(i).r3;
        this.T = i2;
        this.U = i2;
        String H = bc4.H(vucVar.e);
        if (vucVar.e.startsWith("image/")) {
            this.b1 = 16777216;
        } else if (vucVar.e.equals("audio/ogg")) {
            this.b1 = 50331648;
        } else if (vucVar.e.startsWith("video/")) {
            this.b1 = 33554432;
        } else {
            this.b1 = 67108864;
        }
        this.o0 = true;
        this.P0 = fn5.x(vucVar.a, H);
    }

    public lb4(gn5 gn5Var, Object obj, String str, long j) {
        TLRPC.InputFileLocation tL_inputDocumentFileLocation;
        this.g = (byte) 2;
        boolean z = false;
        this.h = new bb4(this, (byte) 0);
        this.n = 131072;
        this.o = (byte) 4;
        this.p = (byte) 4;
        this.q = 16000;
        this.H = new byte[24];
        this.Y = (byte) 0;
        this.F0 = new ArrayList();
        this.f1 = new bb4(this, (byte) 5);
        s();
        this.p0 = obj;
        this.j = obj instanceof TL_stories.TL_storyItem;
        this.X0 = bc4.E(obj);
        this.r0 = gn5Var.p == 2;
        if (gn5Var.c != null) {
            TLRPC.TL_inputEncryptedFileLocation tL_inputEncryptedFileLocation = new TLRPC.TL_inputEncryptedFileLocation();
            this.V = tL_inputEncryptedFileLocation;
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = gn5Var.f;
            long j2 = tL_fileLocationToBeDeprecated.volume_id;
            tL_inputEncryptedFileLocation.id = j2;
            tL_inputEncryptedFileLocation.volume_id = j2;
            tL_inputEncryptedFileLocation.local_id = tL_fileLocationToBeDeprecated.local_id;
            tL_inputEncryptedFileLocation.access_hash = gn5Var.e;
            byte[] bArr = new byte[32];
            this.i0 = bArr;
            System.arraycopy(gn5Var.d, 0, bArr, 0, 32);
            this.h0 = gn5Var.c;
        } else if (gn5Var.n != null) {
            TLRPC.TL_inputPeerPhotoFileLocation tL_inputPeerPhotoFileLocation = new TLRPC.TL_inputPeerPhotoFileLocation();
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = gn5Var.f;
            long j3 = tL_fileLocationToBeDeprecated2.volume_id;
            tL_inputPeerPhotoFileLocation.id = j3;
            tL_inputPeerPhotoFileLocation.volume_id = j3;
            tL_inputPeerPhotoFileLocation.local_id = tL_fileLocationToBeDeprecated2.local_id;
            tL_inputPeerPhotoFileLocation.photo_id = gn5Var.s;
            tL_inputPeerPhotoFileLocation.big = gn5Var.m == 0;
            tL_inputPeerPhotoFileLocation.peer = gn5Var.n;
            this.V = tL_inputPeerPhotoFileLocation;
        } else if (gn5Var.o != null) {
            TLRPC.TL_inputStickerSetThumb tL_inputStickerSetThumb = new TLRPC.TL_inputStickerSetThumb();
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated3 = gn5Var.f;
            long j4 = tL_fileLocationToBeDeprecated3.volume_id;
            tL_inputStickerSetThumb.id = j4;
            tL_inputStickerSetThumb.volume_id = j4;
            tL_inputStickerSetThumb.local_id = tL_fileLocationToBeDeprecated3.local_id;
            tL_inputStickerSetThumb.thumb_version = gn5Var.q;
            tL_inputStickerSetThumb.stickerset = gn5Var.o;
            this.V = tL_inputStickerSetThumb;
        } else if (gn5Var.u != null) {
            if (gn5Var.s != 0) {
                tL_inputDocumentFileLocation = new TLRPC.TL_inputPhotoFileLocation();
                this.V = tL_inputDocumentFileLocation;
                tL_inputDocumentFileLocation.id = gn5Var.s;
                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated4 = gn5Var.f;
                tL_inputDocumentFileLocation.volume_id = tL_fileLocationToBeDeprecated4.volume_id;
                tL_inputDocumentFileLocation.local_id = tL_fileLocationToBeDeprecated4.local_id;
                tL_inputDocumentFileLocation.access_hash = gn5Var.e;
                tL_inputDocumentFileLocation.file_reference = gn5Var.b;
                tL_inputDocumentFileLocation.thumb_size = gn5Var.u;
                if (gn5Var.p == 2) {
                    this.o0 = true;
                }
            } else {
                tL_inputDocumentFileLocation = new TLRPC.TL_inputDocumentFileLocation();
                this.V = tL_inputDocumentFileLocation;
                tL_inputDocumentFileLocation.id = gn5Var.t;
                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated5 = gn5Var.f;
                tL_inputDocumentFileLocation.volume_id = tL_fileLocationToBeDeprecated5.volume_id;
                tL_inputDocumentFileLocation.local_id = tL_fileLocationToBeDeprecated5.local_id;
                tL_inputDocumentFileLocation.access_hash = gn5Var.e;
                tL_inputDocumentFileLocation.file_reference = gn5Var.b;
                tL_inputDocumentFileLocation.thumb_size = gn5Var.u;
            }
            if (tL_inputDocumentFileLocation.file_reference == null) {
                tL_inputDocumentFileLocation.file_reference = new byte[0];
            }
        } else {
            TLRPC.TL_inputFileLocation tL_inputFileLocation = new TLRPC.TL_inputFileLocation();
            this.V = tL_inputFileLocation;
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated6 = gn5Var.f;
            tL_inputFileLocation.volume_id = tL_fileLocationToBeDeprecated6.volume_id;
            tL_inputFileLocation.local_id = tL_fileLocationToBeDeprecated6.local_id;
            tL_inputFileLocation.secret = gn5Var.e;
            byte[] bArr2 = gn5Var.b;
            tL_inputFileLocation.file_reference = bArr2;
            if (bArr2 == null) {
                tL_inputFileLocation.file_reference = new byte[0];
            }
            this.o0 = true;
        }
        byte b = gn5Var.p;
        this.a1 = (b == 1 || b == 3) ? true : z;
        int i = gn5Var.a;
        this.T = i;
        this.U = i;
        this.b1 = 16777216;
        this.b0 = j;
        this.P0 = str == null ? "jpg" : str;
    }
}
