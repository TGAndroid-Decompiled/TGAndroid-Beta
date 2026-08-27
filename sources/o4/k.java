package o4;

import android.net.Uri;
import android.text.TextUtils;
import d5.f0;
import d5.g0;
import d5.z;
import h3.s0;
import h3.t0;
import h7.d0;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.FileLog;
import p8.l0;
import p8.x;
import w3.c0;

public final class k extends l4.k {
    public static final AtomicInteger X = new AtomicInteger();
    public final int A;
    public final com.google.android.exoplayer2.upstream.m B;
    public final com.google.android.exoplayer2.upstream.q C;
    public final b D;
    public final boolean E;
    public final boolean F;
    public final f0 G;
    public final j H;
    public final List I;
    public final l3.d J;
    public final e4.i K;
    public final z L;
    public final boolean M;
    public final boolean N;
    public b O;
    public r P;
    public int Q;
    public boolean R;
    public volatile boolean S;
    public boolean T;
    public p8.z U;
    public boolean V;
    public boolean W;
    public final int v;

    public final int f19223w;

    public final Uri f19224x;

    public final boolean f19225y;

    public k(j jVar, com.google.android.exoplayer2.upstream.m mVar, com.google.android.exoplayer2.upstream.q qVar, t0 t0Var, boolean z10, com.google.android.exoplayer2.upstream.m mVar2, com.google.android.exoplayer2.upstream.q qVar2, boolean z11, Uri uri, List list, int i10, Object obj, long j10, long j11, long j12, int i11, boolean z12, int i12, boolean z13, boolean z14, f0 f0Var, l3.d dVar, b bVar, e4.i iVar, z zVar, boolean z15, i3.k kVar) {
        super(mVar, qVar, t0Var, i10, obj, j10, j11, j12);
        this.M = z10;
        this.A = i11;
        this.W = z12;
        this.f19223w = i12;
        this.C = qVar2;
        this.B = mVar2;
        this.R = qVar2 != null;
        this.N = z11;
        this.f19224x = uri;
        this.E = z14;
        this.G = f0Var;
        this.F = z13;
        this.H = jVar;
        this.I = list;
        this.J = dVar;
        this.D = bVar;
        this.K = iVar;
        this.L = zVar;
        this.f19225y = z15;
        x xVar = p8.z.f45604b;
        this.U = l0.f45555e;
        this.v = X.getAndIncrement();
    }

    public static byte[] e(String str) {
        if (d0.b(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    @Override
    public final void a() {
        b bVar;
        this.P.getClass();
        if (this.O == null && (bVar = this.D) != null) {
            m3.k kVar = bVar.f19194a;
            if ((kVar instanceof c0) || (kVar instanceof u3.i)) {
                this.O = bVar;
                this.R = false;
            }
        }
        com.google.android.exoplayer2.upstream.q qVar = this.C;
        com.google.android.exoplayer2.upstream.m mVar = this.B;
        if (this.R) {
            mVar.getClass();
            qVar.getClass();
            d(mVar, qVar, this.N);
            this.Q = 0;
            this.R = false;
        }
        if (this.S) {
            return;
        }
        if (!this.F) {
            d(this.f15423r, this.f15418b, this.M);
        }
        this.T = !this.S;
    }

    @Override
    public final boolean c() {
        throw null;
    }

    public final void d(com.google.android.exoplayer2.upstream.m mVar, com.google.android.exoplayer2.upstream.q qVar, boolean z10) {
        com.google.android.exoplayer2.upstream.q qVarA;
        long j10;
        boolean z11 = false;
        if (z10) {
            z11 = this.Q != 0;
            qVarA = qVar;
        } else {
            qVarA = qVar.a(this.Q);
        }
        try {
            try {
                m3.h hVarG = g(mVar, qVarA);
                if (z11) {
                    hVarG.t(this.Q);
                }
                while (!this.S && this.O.f19194a.b(hVarG, b.d) == 0) {
                    try {
                        try {
                        } catch (EOFException e9) {
                            if ((this.d.f8187e & 16384) == 0) {
                                throw e9;
                            }
                            this.O.f19194a.g(0L, 0L);
                            j10 = hVarG.d;
                        }
                    } catch (Throwable th) {
                        this.Q = (int) (hVarG.d - qVar.f3025e);
                        throw th;
                    }
                }
                j10 = hVarG.d;
                this.Q = (int) (j10 - qVar.f3025e);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            g7.l0.a(mVar);
        } catch (Throwable th2) {
            g7.l0.a(mVar);
            throw th2;
        }
    }

    public final int f(int i10) {
        d5.a.i(!this.f19225y);
        if (i10 >= this.U.size()) {
            return 0;
        }
        return ((Integer) this.U.get(i10)).intValue();
    }

    public final m3.h g(com.google.android.exoplayer2.upstream.m mVar, com.google.android.exoplayer2.upstream.q qVar) throws Throwable {
        int i10;
        int i11;
        long jL;
        b bVar;
        b bVar2;
        ArrayList arrayList;
        m3.k aVar;
        boolean zF;
        boolean z10;
        List listSingletonList;
        int i12;
        m3.k dVar;
        long jOpen = mVar.open(qVar);
        try {
            f0 f0Var = this.G;
            boolean z11 = this.E;
            long j10 = this.h;
            synchronized (f0Var) {
                try {
                    i10 = 1;
                    i11 = 0;
                    d5.a.i(f0Var.f4791a == 9223372036854775806L);
                    if (f0Var.f4792b == -9223372036854775807L) {
                        if (z11) {
                            f0Var.d.set(Long.valueOf(j10));
                        } else {
                            while (f0Var.f4792b == -9223372036854775807L) {
                                f0Var.wait();
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            m3.h hVar = new m3.h(mVar, qVar.f3025e, jOpen);
            if (this.O == null) {
                z zVar = this.L;
                hVar.f17614f = 0;
                try {
                    zVar.z(10);
                    hVar.g(zVar.f4858a, 0, 10, false);
                    if (zVar.t() != 4801587) {
                        jL = -9223372036854775807L;
                        break;
                    }
                    zVar.D(3);
                    int iQ = zVar.q();
                    int i13 = iQ + 10;
                    byte[] bArr = zVar.f4858a;
                    if (i13 > bArr.length) {
                        zVar.z(i13);
                        System.arraycopy(bArr, 0, zVar.f4858a, 0, 10);
                    }
                    hVar.g(zVar.f4858a, 10, iQ, false);
                    z3.c cVarC = this.K.c(iQ, zVar.f4858a);
                    if (cVarC == null) {
                        jL = -9223372036854775807L;
                        break;
                    }
                    z3.b[] bVarArr = cVarC.f50188a;
                    int length = bVarArr.length;
                    int i14 = 0;
                    while (true) {
                        if (i14 >= length) {
                            jL = -9223372036854775807L;
                            break;
                        }
                        z3.b bVar3 = bVarArr[i14];
                        if (bVar3 instanceof e4.m) {
                            e4.m mVar2 = (e4.m) bVar3;
                            if ("com.apple.streaming.transportStreamTimestamp".equals(mVar2.f5216b)) {
                                System.arraycopy(mVar2.f5217c, 0, zVar.f4858a, 0, 8);
                                zVar.C(0);
                                zVar.B(8);
                                jL = zVar.l() & 8589934591L;
                                break;
                            }
                        }
                        i14++;
                    }
                } catch (EOFException unused) {
                }
                hVar.f17614f = 0;
                b bVar4 = this.D;
                if (bVar4 != null) {
                    f0 f0Var2 = bVar4.f19196c;
                    t0 t0Var = bVar4.f19195b;
                    m3.k kVar = bVar4.f19194a;
                    d5.a.i(!((kVar instanceof c0) || (kVar instanceof u3.i)));
                    m3.k kVar2 = bVar4.f19194a;
                    if (kVar2 instanceof v) {
                        dVar = new v(t0Var.f8186c, f0Var2);
                    } else if (kVar2 instanceof w3.d) {
                        dVar = new w3.d(0);
                    } else if (kVar2 instanceof w3.a) {
                        dVar = new w3.a();
                    } else if (kVar2 instanceof w3.c) {
                        dVar = new w3.c();
                    } else {
                        if (!(kVar2 instanceof t3.d)) {
                            throw new IllegalStateException("Unexpected extractor type for recreation: ".concat(kVar2.getClass().getSimpleName()));
                        }
                        dVar = new t3.d(0);
                    }
                    bVar2 = new b(dVar, t0Var, f0Var2);
                } else {
                    j jVar = this.H;
                    Uri uri = qVar.f3022a;
                    t0 t0Var2 = this.d;
                    List list = this.I;
                    f0 f0Var3 = this.G;
                    Map responseHeaders = mVar.getResponseHeaders();
                    ((c) jVar).getClass();
                    int iW = d5.a.w(t0Var2.B);
                    List list2 = (List) responseHeaders.get("Content-Type");
                    int iW2 = d5.a.w((list2 == null || list2.isEmpty()) ? null : (String) list2.get(0));
                    int iX = d5.a.x(uri);
                    int[] iArr = c.f19197b;
                    ArrayList arrayList2 = new ArrayList(7);
                    c.a(iW, arrayList2);
                    c.a(iW2, arrayList2);
                    c.a(iX, arrayList2);
                    int i15 = 0;
                    for (int i16 = 7; i15 < i16; i16 = 7) {
                        c.a(iArr[i15], arrayList2);
                        i15++;
                    }
                    hVar.f17614f = 0;
                    int i17 = 0;
                    m3.k kVar3 = null;
                    while (true) {
                        if (i17 >= arrayList2.size()) {
                            kVar3.getClass();
                            bVar = new b(kVar3, t0Var2, f0Var3);
                            break;
                        }
                        int iIntValue = ((Integer) arrayList2.get(i17)).intValue();
                        if (iIntValue == 0) {
                            i17 = i17;
                            arrayList = arrayList2;
                            aVar = new w3.a();
                        } else if (iIntValue == i10) {
                            i17 = i17;
                            arrayList = arrayList2;
                            aVar = new w3.c();
                        } else if (iIntValue == 2) {
                            i17 = i17;
                            arrayList = arrayList2;
                            aVar = new w3.d(0);
                        } else if (iIntValue == 7) {
                            i17 = i17;
                            arrayList = arrayList2;
                            aVar = new t3.d(0, 0L);
                        } else if (iIntValue == 8) {
                            arrayList = arrayList2;
                            z3.c cVar = t0Var2.f8191s;
                            if (cVar == null) {
                                z10 = false;
                                break;
                            }
                            int i18 = 0;
                            while (true) {
                                z3.b[] bVarArr2 = cVar.f50188a;
                                z3.c cVar2 = cVar;
                                if (i18 >= bVarArr2.length) {
                                    z10 = false;
                                    break;
                                }
                                z3.b bVar5 = bVarArr2[i18];
                                if (bVar5 instanceof u) {
                                    z10 = !((u) bVar5).f19290c.isEmpty();
                                    break;
                                }
                                i18++;
                                cVar = cVar2;
                            }
                            aVar = new u3.i(z10 ? 4 : 0, f0Var3, list != null ? list : Collections.EMPTY_LIST, null);
                        } else if (iIntValue == 11) {
                            if (list != null) {
                                i12 = 48;
                                listSingletonList = list;
                            } else {
                                s0 s0Var = new s0();
                                s0Var.f8135o = "application/cea-608";
                                listSingletonList = Collections.singletonList(new t0(s0Var));
                                i12 = 16;
                            }
                            String str = t0Var2.f8190r;
                            if (TextUtils.isEmpty(str)) {
                                arrayList = arrayList2;
                            } else {
                                arrayList = arrayList2;
                                if (d5.q.a(str, "audio/mp4a-latm") == null) {
                                    i12 |= 2;
                                }
                                if (d5.q.a(str, "video/avc") == null) {
                                    i12 |= 4;
                                }
                            }
                            aVar = new c0(2, f0Var3, new o0.i(i12, listSingletonList));
                        } else if (iIntValue != 13) {
                            i17 = i17;
                            arrayList = arrayList2;
                            aVar = null;
                        } else {
                            aVar = new v(t0Var2.f8186c, f0Var3);
                            arrayList = arrayList2;
                        }
                        aVar.getClass();
                        try {
                            zF = aVar.f(hVar);
                            i11 = 0;
                            hVar.f17614f = 0;
                        } catch (EOFException unused2) {
                            i11 = 0;
                            hVar.f17614f = 0;
                            zF = false;
                        } catch (Throwable th2) {
                            hVar.f17614f = 0;
                            throw th2;
                        }
                        if (zF) {
                            bVar = new b(aVar, t0Var2, f0Var3);
                            break;
                        }
                        if (kVar3 == null && (iIntValue == iW || iIntValue == iW2 || iIntValue == iX || iIntValue == 11)) {
                            kVar3 = aVar;
                        }
                        list = list;
                        i17++;
                        arrayList2 = arrayList;
                        i10 = 1;
                    }
                    bVar2 = bVar;
                }
                this.O = bVar2;
                m3.k kVar4 = bVar2.f19194a;
                if ((kVar4 instanceof w3.d) || (kVar4 instanceof w3.a) || (kVar4 instanceof w3.c) || (kVar4 instanceof t3.d)) {
                    r rVar = this.P;
                    long jB = jL != -9223372036854775807 ? this.G.b(jL) : this.h;
                    if (rVar.f19273h0 != jB) {
                        rVar.f19273h0 = jB;
                        for (q qVar2 : rVar.H) {
                            if (qVar2.F != jB) {
                                qVar2.F = jB;
                                qVar2.f12529z = true;
                            }
                        }
                    }
                } else {
                    r rVar2 = this.P;
                    if (rVar2.f19273h0 != 0) {
                        rVar2.f19273h0 = 0L;
                        for (q qVar3 : rVar2.H) {
                            if (qVar3.F != 0) {
                                qVar3.F = 0L;
                                qVar3.f12529z = true;
                            }
                        }
                    }
                }
                this.P.J.clear();
                this.O.f19194a.c(this.P);
            }
            r rVar3 = this.P;
            l3.d dVar2 = this.J;
            if (!g0.a(rVar3.f19274i0, dVar2)) {
                rVar3.f19274i0 = dVar2;
                while (true) {
                    q[] qVarArr = rVar3.H;
                    if (i11 >= qVarArr.length) {
                        break;
                    }
                    if (rVar3.f19262a0[i11]) {
                        q qVar4 = qVarArr[i11];
                        qVar4.I = dVar2;
                        qVar4.f12529z = true;
                    }
                    i11++;
                }
            }
            return hVar;
        } catch (InterruptedException unused3) {
            throw new InterruptedIOException();
        }
    }

    @Override
    public final void l() {
        this.S = true;
    }
}
