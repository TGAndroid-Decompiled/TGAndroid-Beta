package o2;

import android.net.Uri;
import android.text.TextUtils;
import b2.o0;
import b2.p0;
import b2.r0;
import e2.b0;
import e2.v;
import e9.a1;
import e9.g0;
import e9.i0;
import j$.util.Objects;
import j4.d0;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import v7.m7;
import v7.r6;
public final class j extends v2.k {
    public static final AtomicInteger f16896c0 = new AtomicInteger();
    public final int E;
    public final g2.h F;
    public final g2.m G;
    public final b H;
    public final boolean I;
    public final boolean J;
    public final b0 K;
    public final c L;
    public final List M;
    public final b2.o N;
    public final q3.i O;
    public final v P;
    public final boolean Q;
    public final boolean R;
    public b S;
    public q T;
    public int U;
    public boolean V;
    public volatile boolean W;
    public boolean X;
    public i0 Y;
    public boolean Z;
    public long f16897a0;
    public boolean f16898b0;
    public final int v;
    public final int f16899w;
    public final Uri f16900x;
    public final boolean f16901y;

    public j(c cVar, g2.h hVar, g2.m mVar, b2.s sVar, boolean z10, g2.h hVar2, g2.m mVar2, boolean z11, Uri uri, List list, int i10, Object obj, long j3, long j10, long j11, int i11, boolean z12, int i12, boolean z13, boolean z14, b0 b0Var, b2.o oVar, b bVar, q3.i iVar, v vVar, boolean z15, boolean z16, j2.k kVar) {
        super(hVar, mVar, sVar, i10, obj, j3, j10, j11);
        long j12;
        boolean z17;
        this.Q = z10;
        this.E = i11;
        if (z12) {
            j12 = j10 - j3;
        } else {
            j12 = -9223372036854775807L;
        }
        this.f16897a0 = j12;
        this.f16899w = i12;
        this.G = mVar2;
        this.F = hVar2;
        if (mVar2 != null) {
            z17 = true;
        } else {
            z17 = false;
        }
        this.V = z17;
        this.R = z11;
        this.f16900x = uri;
        this.I = z14;
        this.K = b0Var;
        this.J = z13;
        this.L = cVar;
        this.M = list;
        this.N = oVar;
        this.H = bVar;
        this.O = iVar;
        this.P = vVar;
        this.f16898b0 = z15;
        this.f16901y = z16;
        g0 g0Var = i0.f8985b;
        this.Y = a1.f8948e;
        this.v = f16896c0.getAndIncrement();
    }

    public static byte[] e(String str) {
        int i10;
        if (r6.b(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        if (byteArray.length > 16) {
            i10 = byteArray.length - 16;
        } else {
            i10 = 0;
        }
        System.arraycopy(byteArray, i10, bArr, (16 - byteArray.length) + i10, byteArray.length - i10);
        return bArr;
    }

    @Override
    public final void W() {
        this.W = true;
    }

    @Override
    public final void a() {
        b bVar;
        this.T.getClass();
        if (this.S == null && (bVar = this.H) != null) {
            c3.o c10 = bVar.f16865a.c();
            if ((c10 instanceof d0) || (c10 instanceof w3.h)) {
                this.S = this.H;
                this.V = false;
            }
        }
        g2.m mVar = this.G;
        g2.h hVar = this.F;
        if (this.V) {
            hVar.getClass();
            mVar.getClass();
            d(hVar, mVar, this.R);
            this.U = 0;
            this.V = false;
        }
        if (!this.W) {
            if (!this.J) {
                d(this.f47332r, this.f47327b, this.Q);
            }
            this.X = !this.W;
        }
    }

    @Override
    public final boolean c() {
        throw null;
    }

    public final void d(g2.h hVar, g2.m mVar, boolean z10) {
        g2.m b10;
        boolean z11;
        long j3;
        boolean z12;
        if (z10) {
            if (this.U != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            z11 = z12;
            b10 = mVar;
        } else {
            b10 = mVar.b(this.U);
            z11 = false;
        }
        try {
            c3.l h = h(hVar, b10);
            if (z11) {
                h.i(this.U, false);
            }
            do {
                try {
                    if (this.W) {
                        break;
                    }
                } catch (EOFException e7) {
                    if ((this.d.f2386f & 16384) != 0) {
                        this.S.f16865a.h(0L, 0L);
                        j3 = h.d;
                    } else {
                        throw e7;
                    }
                }
            } while (this.S.f16865a.m(h, b.f16864f) == 0);
            j3 = h.d;
            this.U = (int) (j3 - mVar.f10361e);
        } catch (Exception unused) {
        } catch (Throwable th2) {
            m7.a(hVar);
            throw th2;
        }
        m7.a(hVar);
    }

    public final int f(int i10) {
        e2.d.g(!this.f16898b0);
        if (i10 >= this.Y.size()) {
            return 0;
        }
        return ((Integer) this.Y.get(i10)).intValue();
    }

    public final boolean g() {
        if (this.f16897a0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public final c3.l h(g2.h hVar, g2.m mVar) {
        long j3;
        long j10;
        String str;
        long j11;
        b bVar;
        int i10;
        b0 b0Var;
        ArrayList arrayList;
        c3.o aVar;
        boolean z10;
        z3.k kVar;
        boolean z11;
        int i11;
        z3.k kVar2;
        a1 a1Var;
        List singletonList;
        int i12;
        z3.k kVar3;
        boolean z12;
        p[] pVarArr;
        long j12;
        p[] pVarArr2;
        boolean z13;
        boolean z14;
        c3.o dVar;
        o0[] o0VarArr;
        long j13 = this.h;
        b0 b0Var2 = this.K;
        long open = hVar.open(mVar);
        try {
            b0Var2.h(j13, this.I);
            c3.l lVar = new c3.l(hVar, mVar.f10361e, open);
            if (this.S == null) {
                v vVar = this.P;
                lVar.f4313f = 0;
                try {
                    vVar.G(10);
                    lVar.j(vVar.f8817a, 0, 10, false);
                } catch (EOFException unused) {
                    j3 = -9223372036854775807L;
                }
                if (vVar.A() != 4801587) {
                    j10 = -9223372036854775807L;
                    j3 = -9223372036854775807L;
                } else {
                    vVar.K(3);
                    int w10 = vVar.w();
                    int i13 = w10 + 10;
                    byte[] bArr = vVar.f8817a;
                    j3 = -9223372036854775807L;
                    if (i13 > bArr.length) {
                        vVar.G(i13);
                        System.arraycopy(bArr, 0, vVar.f8817a, 0, 10);
                    }
                    lVar.j(vVar.f8817a, 10, w10, false);
                    p0 c10 = this.O.c(w10, vVar.f8817a);
                    if (c10 != null) {
                        for (o0 o0Var : c10.f2261a) {
                            if (o0Var instanceof q3.n) {
                                q3.n nVar = (q3.n) o0Var;
                                if ("com.apple.streaming.transportStreamTimestamp".equals(nVar.f44191b)) {
                                    System.arraycopy(nVar.f44192c, 0, vVar.f8817a, 0, 8);
                                    vVar.J(0);
                                    vVar.I(8);
                                    j10 = vVar.r() & 8589934591L;
                                    break;
                                }
                            }
                        }
                    }
                    j10 = j3;
                }
                lVar.f4313f = 0;
                b bVar2 = this.H;
                if (bVar2 != null) {
                    c3.o oVar = bVar2.f16865a;
                    c3.o c11 = oVar.c();
                    if (!(c11 instanceof d0) && !(c11 instanceof w3.h)) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    e2.d.g(!z13);
                    if (oVar.c() == oVar) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    e2.d.f("Can't recreate wrapped extractors. Outer type: " + oVar.getClass(), z14);
                    if (oVar instanceof t) {
                        dVar = new t(bVar2.f16866b.d, bVar2.f16867c, bVar2.d, bVar2.f16868e);
                    } else if (oVar instanceof j4.d) {
                        dVar = new j4.d(0);
                    } else if (oVar instanceof j4.a) {
                        dVar = new j4.a();
                    } else if (oVar instanceof j4.c) {
                        dVar = new j4.c();
                    } else if (oVar instanceof v3.d) {
                        dVar = new v3.d(0);
                    } else {
                        throw new IllegalStateException("Unexpected extractor type for recreation: ".concat(oVar.getClass().getSimpleName()));
                    }
                    bVar = new b(dVar, bVar2.f16866b, bVar2.f16867c, bVar2.d, bVar2.f16868e);
                    j11 = j13;
                } else {
                    Uri uri = mVar.f10358a;
                    Map responseHeaders = hVar.getResponseHeaders();
                    c cVar = this.L;
                    cVar.getClass();
                    b2.s sVar = this.d;
                    int a2 = v7.g0.a(sVar.f2397r);
                    List list = (List) responseHeaders.get("Content-Type");
                    if (list != null && !list.isEmpty()) {
                        str = (String) list.get(0);
                    } else {
                        str = null;
                    }
                    int a10 = v7.g0.a(str);
                    int b10 = v7.g0.b(uri);
                    ArrayList arrayList2 = new ArrayList(7);
                    c.a(a2, arrayList2);
                    c.a(a10, arrayList2);
                    c.a(b10, arrayList2);
                    int i14 = 0;
                    for (int i15 = 7; i14 < i15; i15 = 7) {
                        c.a(c.f16869c[i14], arrayList2);
                        i14++;
                    }
                    lVar.f4313f = 0;
                    int i16 = 0;
                    c3.o oVar2 = null;
                    while (true) {
                        int size = arrayList2.size();
                        b0 b0Var3 = this.K;
                        if (i16 < size) {
                            int intValue = ((Integer) arrayList2.get(i16)).intValue();
                            j11 = j13;
                            if (intValue != 0) {
                                if (intValue != 1) {
                                    if (intValue != 2) {
                                        if (intValue != 7) {
                                            List list2 = this.M;
                                            z3.k kVar4 = z3.k.D;
                                            if (intValue != 8) {
                                                if (intValue != 11) {
                                                    if (intValue != 13) {
                                                        i10 = i16;
                                                        b0Var = b0Var3;
                                                        arrayList = arrayList2;
                                                        aVar = null;
                                                    } else {
                                                        i10 = i16;
                                                        arrayList = arrayList2;
                                                        aVar = new t(sVar.d, b0Var3, cVar.f16870a, cVar.f16871b);
                                                        b0Var = b0Var3;
                                                    }
                                                } else {
                                                    i10 = i16;
                                                    arrayList = arrayList2;
                                                    z3.k kVar5 = cVar.f16870a;
                                                    boolean z15 = cVar.f16871b;
                                                    if (list2 != null) {
                                                        singletonList = list2;
                                                        i12 = 48;
                                                    } else {
                                                        b2.r rVar = new b2.r();
                                                        rVar.f2339q = r0.n("application/cea-608");
                                                        singletonList = Collections.singletonList(new b2.s(rVar));
                                                        i12 = 16;
                                                    }
                                                    String str2 = sVar.f2390k;
                                                    if (!TextUtils.isEmpty(str2)) {
                                                        if (r0.b(str2, "audio/mp4a-latm") == null) {
                                                            i12 |= 2;
                                                        }
                                                        if (r0.b(str2, "video/avc") == null) {
                                                            i12 |= 4;
                                                        }
                                                    }
                                                    if (!z15) {
                                                        kVar3 = kVar4;
                                                    } else {
                                                        kVar3 = kVar5;
                                                    }
                                                    aVar = new d0(2, !z15 ? 1 : 0, kVar3, b0Var3, new j4.f(i12, singletonList));
                                                    b0Var = b0Var3;
                                                }
                                            } else {
                                                i10 = i16;
                                                b0Var = b0Var3;
                                                arrayList = arrayList2;
                                                z3.k kVar6 = cVar.f16870a;
                                                boolean z16 = cVar.f16871b;
                                                p0 p0Var = sVar.f2391l;
                                                if (p0Var == null) {
                                                    kVar = kVar6;
                                                } else {
                                                    int i17 = 0;
                                                    z3.k kVar7 = kVar6;
                                                    while (true) {
                                                        o0[] o0VarArr2 = p0Var.f2261a;
                                                        kVar = kVar7;
                                                        if (i17 >= o0VarArr2.length) {
                                                            break;
                                                        }
                                                        o0 o0Var2 = o0VarArr2[i17];
                                                        if (o0Var2 instanceof s) {
                                                            z11 = !((s) o0Var2).f16967c.isEmpty();
                                                            break;
                                                        }
                                                        i17++;
                                                        kVar7 = kVar;
                                                    }
                                                }
                                                z11 = false;
                                                if (z11) {
                                                    i11 = 4;
                                                } else {
                                                    i11 = 0;
                                                }
                                                if (!z16) {
                                                    i11 |= 32;
                                                    kVar2 = kVar4;
                                                } else {
                                                    kVar2 = kVar;
                                                }
                                                int i18 = i11;
                                                if (list2 != null) {
                                                    a1Var = list2;
                                                } else {
                                                    a1Var = a1.f8948e;
                                                }
                                                aVar = new w3.h(kVar2, i18, b0Var, a1Var, null);
                                            }
                                        } else {
                                            i10 = i16;
                                            b0Var = b0Var3;
                                            arrayList = arrayList2;
                                            aVar = new v3.d(0, 0L);
                                        }
                                    } else {
                                        i10 = i16;
                                        b0Var = b0Var3;
                                        arrayList = arrayList2;
                                        aVar = new j4.d(0);
                                    }
                                } else {
                                    i10 = i16;
                                    b0Var = b0Var3;
                                    arrayList = arrayList2;
                                    aVar = new j4.c();
                                }
                            } else {
                                i10 = i16;
                                b0Var = b0Var3;
                                arrayList = arrayList2;
                                aVar = new j4.a();
                            }
                            aVar.getClass();
                            try {
                                z10 = aVar.b(lVar);
                                lVar.f4313f = 0;
                            } catch (EOFException unused2) {
                                lVar.f4313f = 0;
                                z10 = false;
                            } catch (Throwable th2) {
                                lVar.f4313f = 0;
                                throw th2;
                            }
                            if (z10) {
                                bVar = new b(aVar, sVar, b0Var, cVar.f16870a, cVar.f16871b);
                                break;
                            }
                            b2.s sVar2 = sVar;
                            if (oVar2 == null && (intValue == a2 || intValue == a10 || intValue == b10 || intValue == 11)) {
                                oVar2 = aVar;
                            }
                            i16 = i10 + 1;
                            sVar = sVar2;
                            j13 = j11;
                            arrayList2 = arrayList;
                        } else {
                            j11 = j13;
                            oVar2.getClass();
                            bVar = new b(oVar2, sVar, b0Var3, cVar.f16870a, cVar.f16871b);
                            break;
                        }
                    }
                }
                b bVar3 = bVar;
                this.S = bVar3;
                c3.o c12 = bVar3.f16865a.c();
                if (!(c12 instanceof j4.d) && !(c12 instanceof j4.a) && !(c12 instanceof j4.c) && !(c12 instanceof v3.d)) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (z12) {
                    q qVar = this.T;
                    if (j10 != j3) {
                        j12 = b0Var2.b(j10);
                    } else {
                        j12 = j11;
                    }
                    if (qVar.f16952l0 != j12) {
                        qVar.f16952l0 = j12;
                        for (p pVar : qVar.L) {
                            if (pVar.F != j12) {
                                pVar.F = j12;
                                pVar.f46668z = true;
                            }
                        }
                    }
                } else {
                    q qVar2 = this.T;
                    if (qVar2.f16952l0 != 0) {
                        qVar2.f16952l0 = 0L;
                        for (p pVar2 : qVar2.L) {
                            if (pVar2.F != 0) {
                                pVar2.F = 0L;
                                pVar2.f46668z = true;
                            }
                        }
                    }
                }
                this.T.N.clear();
                this.S.f16865a.g(this.T);
            }
            q qVar3 = this.T;
            b2.o oVar3 = qVar3.m0;
            b2.o oVar4 = this.N;
            if (!Objects.equals(oVar3, oVar4)) {
                qVar3.m0 = oVar4;
                int i19 = 0;
                while (true) {
                    p[] pVarArr3 = qVar3.L;
                    if (i19 >= pVarArr3.length) {
                        break;
                    }
                    if (qVar3.f16944e0[i19]) {
                        p pVar3 = pVarArr3[i19];
                        pVar3.I = oVar4;
                        pVar3.f46668z = true;
                    }
                    i19++;
                }
            }
            return lVar;
        } catch (InterruptedException unused3) {
            throw new InterruptedIOException();
        } catch (TimeoutException e7) {
            throw new IOException(e7);
        }
    }
}
