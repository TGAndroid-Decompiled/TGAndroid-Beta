package o4;

import android.net.Uri;
import android.text.TextUtils;
import d5.e0;
import d5.f0;
import d5.y;
import f7.f5;
import g7.b0;
import h3.s0;
import h3.t0;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import o8.l0;
import o8.x;
import o8.z;
import org.telegram.messenger.FileLog;
public final class k extends l4.k {
    public static final AtomicInteger X = new AtomicInteger();
    public final int A;
    public final com.google.android.exoplayer2.upstream.m B;
    public final com.google.android.exoplayer2.upstream.q C;
    public final b D;
    public final boolean E;
    public final boolean F;
    public final e0 G;
    public final j H;
    public final List I;
    public final l3.c J;
    public final e4.i K;
    public final y L;
    public final boolean M;
    public final boolean N;
    public b O;
    public r P;
    public int Q;
    public boolean R;
    public volatile boolean S;
    public boolean T;
    public z U;
    public boolean V;
    public boolean W;
    public final int v;
    public final int f18876w;
    public final Uri f18877x;
    public final boolean f18878y;

    public k(j jVar, com.google.android.exoplayer2.upstream.m mVar, com.google.android.exoplayer2.upstream.q qVar, t0 t0Var, boolean z10, com.google.android.exoplayer2.upstream.m mVar2, com.google.android.exoplayer2.upstream.q qVar2, boolean z11, Uri uri, List list, int i9, Object obj, long j10, long j11, long j12, int i10, boolean z12, int i11, boolean z13, boolean z14, e0 e0Var, l3.c cVar, b bVar, e4.i iVar, y yVar, boolean z15, i3.l lVar) {
        super(mVar, qVar, t0Var, i9, obj, j10, j11, j12);
        boolean z16;
        this.M = z10;
        this.A = i10;
        this.W = z12;
        this.f18876w = i11;
        this.C = qVar2;
        this.B = mVar2;
        if (qVar2 != null) {
            z16 = true;
        } else {
            z16 = false;
        }
        this.R = z16;
        this.N = z11;
        this.f18877x = uri;
        this.E = z14;
        this.G = e0Var;
        this.F = z13;
        this.H = jVar;
        this.I = list;
        this.J = cVar;
        this.D = bVar;
        this.K = iVar;
        this.L = yVar;
        this.f18878y = z15;
        x xVar = z.f19105b;
        this.U = l0.f19056e;
        this.v = X.getAndIncrement();
    }

    public static byte[] e(String str) {
        int i9;
        if (b0.b(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        if (byteArray.length > 16) {
            i9 = byteArray.length - 16;
        } else {
            i9 = 0;
        }
        System.arraycopy(byteArray, i9, bArr, (16 - byteArray.length) + i9, byteArray.length - i9);
        return bArr;
    }

    @Override
    public final void K() {
        this.S = true;
    }

    @Override
    public final void a() {
        b bVar;
        this.P.getClass();
        if (this.O == null && (bVar = this.D) != null) {
            m3.k kVar = bVar.f18847a;
            if ((kVar instanceof w3.b0) || (kVar instanceof u3.i)) {
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
        if (!this.S) {
            if (!this.F) {
                d(this.f16666r, this.f16661b, this.M);
            }
            this.T = !this.S;
        }
    }

    @Override
    public final boolean c() {
        throw null;
    }

    public final void d(com.google.android.exoplayer2.upstream.m mVar, com.google.android.exoplayer2.upstream.q qVar, boolean z10) {
        com.google.android.exoplayer2.upstream.q a2;
        long j10;
        boolean z11 = false;
        if (z10) {
            if (this.Q != 0) {
                z11 = true;
            }
            a2 = qVar;
        } else {
            a2 = qVar.a(this.Q);
        }
        try {
            try {
                m3.h g10 = g(mVar, a2);
                if (z11) {
                    g10.u(this.Q);
                }
                do {
                    try {
                        try {
                            if (this.S) {
                                break;
                            }
                        } catch (EOFException e10) {
                            if ((this.d.f9763e & 16384) != 0) {
                                this.O.f18847a.g(0L, 0L);
                                j10 = g10.d;
                            } else {
                                throw e10;
                            }
                        }
                    } catch (Throwable th) {
                        this.Q = (int) (g10.d - qVar.f2588e);
                        throw th;
                    }
                } while (this.O.f18847a.b(g10, b.d) == 0);
                j10 = g10.d;
                this.Q = (int) (j10 - qVar.f2588e);
            } catch (Exception e11) {
                FileLog.e(e11);
            }
        } finally {
            f5.a(mVar);
        }
    }

    public final int f(int i9) {
        d5.a.i(!this.f18878y);
        if (i9 >= this.U.size()) {
            return 0;
        }
        return ((Integer) this.U.get(i9)).intValue();
    }

    public final m3.h g(com.google.android.exoplayer2.upstream.m mVar, com.google.android.exoplayer2.upstream.q qVar) {
        int i9;
        int i10;
        boolean z10;
        long j10;
        long j11;
        String str;
        b bVar;
        b bVar2;
        int i11;
        ArrayList arrayList;
        List list;
        m3.k aVar;
        boolean z11;
        boolean z12;
        int i12;
        List list2;
        List singletonList;
        int i13;
        boolean z13;
        q[] qVarArr;
        long j12;
        q[] qVarArr2;
        boolean z14;
        m3.k dVar;
        z3.b[] bVarArr;
        long open = mVar.open(qVar);
        try {
            e0 e0Var = this.G;
            boolean z15 = this.E;
            long j13 = this.h;
            synchronized (e0Var) {
                i9 = 1;
                i10 = 0;
                if (e0Var.f4346a == 9223372036854775806L) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                d5.a.i(z10);
                if (e0Var.f4347b == -9223372036854775807L) {
                    if (z15) {
                        e0Var.d.set(Long.valueOf(j13));
                    } else {
                        while (e0Var.f4347b == -9223372036854775807L) {
                            e0Var.wait();
                        }
                    }
                }
            }
            m3.h hVar = new m3.h(mVar, qVar.f2588e, open);
            if (this.O == null) {
                y yVar = this.L;
                hVar.f17238f = 0;
                try {
                    yVar.z(10);
                    hVar.g(yVar.f4410a, 0, 10, false);
                    if (yVar.t() == 4801587) {
                        yVar.D(3);
                        int q10 = yVar.q();
                        int i14 = q10 + 10;
                        byte[] bArr = yVar.f4410a;
                        if (i14 > bArr.length) {
                            yVar.z(i14);
                            System.arraycopy(bArr, 0, yVar.f4410a, 0, 10);
                        }
                        hVar.g(yVar.f4410a, 10, q10, false);
                        z3.c c10 = this.K.c(q10, yVar.f4410a);
                        if (c10 != null) {
                            for (z3.b bVar3 : c10.f50288a) {
                                if (bVar3 instanceof e4.m) {
                                    e4.m mVar2 = (e4.m) bVar3;
                                    if ("com.apple.streaming.transportStreamTimestamp".equals(mVar2.f4857b)) {
                                        System.arraycopy(mVar2.f4858c, 0, yVar.f4410a, 0, 8);
                                        yVar.C(0);
                                        yVar.B(8);
                                        j10 = yVar.l() & 8589934591L;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                } catch (EOFException unused) {
                }
                j10 = -9223372036854775807L;
                hVar.f17238f = 0;
                b bVar4 = this.D;
                if (bVar4 != null) {
                    e0 e0Var2 = bVar4.f18849c;
                    t0 t0Var = bVar4.f18848b;
                    m3.k kVar = bVar4.f18847a;
                    if (!(kVar instanceof w3.b0) && !(kVar instanceof u3.i)) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    d5.a.i(!z14);
                    m3.k kVar2 = bVar4.f18847a;
                    if (kVar2 instanceof v) {
                        dVar = new v(t0Var.f9762c, e0Var2);
                    } else if (kVar2 instanceof w3.d) {
                        dVar = new w3.d(0);
                    } else if (kVar2 instanceof w3.a) {
                        dVar = new w3.a();
                    } else if (kVar2 instanceof w3.c) {
                        dVar = new w3.c();
                    } else if (kVar2 instanceof t3.d) {
                        dVar = new t3.d(0);
                    } else {
                        throw new IllegalStateException("Unexpected extractor type for recreation: ".concat(kVar2.getClass().getSimpleName()));
                    }
                    bVar2 = new b(dVar, t0Var, e0Var2);
                    j11 = -9223372036854775807L;
                } else {
                    j jVar = this.H;
                    Uri uri = qVar.f2585a;
                    t0 t0Var2 = this.d;
                    List list3 = this.I;
                    e0 e0Var3 = this.G;
                    j11 = -9223372036854775807L;
                    Map responseHeaders = mVar.getResponseHeaders();
                    ((c) jVar).getClass();
                    int w8 = d5.a.w(t0Var2.B);
                    List list4 = (List) responseHeaders.get("Content-Type");
                    if (list4 != null && !list4.isEmpty()) {
                        str = (String) list4.get(0);
                    } else {
                        str = null;
                    }
                    int w10 = d5.a.w(str);
                    int x10 = d5.a.x(uri);
                    int[] iArr = c.f18850b;
                    ArrayList arrayList2 = new ArrayList(7);
                    c.a(w8, arrayList2);
                    c.a(w10, arrayList2);
                    c.a(x10, arrayList2);
                    int i15 = 0;
                    for (int i16 = 7; i15 < i16; i16 = 7) {
                        c.a(iArr[i15], arrayList2);
                        i15++;
                    }
                    hVar.f17238f = 0;
                    int i17 = 0;
                    m3.k kVar3 = null;
                    while (true) {
                        if (i17 < arrayList2.size()) {
                            int intValue = ((Integer) arrayList2.get(i17)).intValue();
                            if (intValue != 0) {
                                if (intValue != i9) {
                                    if (intValue != 2) {
                                        if (intValue != 7) {
                                            if (intValue != 8) {
                                                if (intValue != 11) {
                                                    if (intValue != 13) {
                                                        i11 = i17;
                                                        arrayList = arrayList2;
                                                        list = list3;
                                                        aVar = null;
                                                    } else {
                                                        aVar = new v(t0Var2.f9762c, e0Var3);
                                                        i11 = i17;
                                                        arrayList = arrayList2;
                                                    }
                                                } else {
                                                    if (list3 != null) {
                                                        i13 = 48;
                                                        singletonList = list3;
                                                    } else {
                                                        s0 s0Var = new s0();
                                                        s0Var.f9705o = "application/cea-608";
                                                        singletonList = Collections.singletonList(new t0(s0Var));
                                                        i13 = 16;
                                                    }
                                                    i11 = i17;
                                                    String str2 = t0Var2.f9766r;
                                                    if (!TextUtils.isEmpty(str2)) {
                                                        arrayList = arrayList2;
                                                        if (d5.q.a(str2, "audio/mp4a-latm") == null) {
                                                            i13 |= 2;
                                                        }
                                                        if (d5.q.a(str2, "video/avc") == null) {
                                                            i13 |= 4;
                                                        }
                                                    } else {
                                                        arrayList = arrayList2;
                                                    }
                                                    aVar = new w3.b0(2, e0Var3, new o0.h(i13, singletonList));
                                                }
                                            } else {
                                                i11 = i17;
                                                arrayList = arrayList2;
                                                z3.c cVar = t0Var2.f9767s;
                                                if (cVar != null) {
                                                    int i18 = 0;
                                                    while (true) {
                                                        z3.b[] bVarArr2 = cVar.f50288a;
                                                        z3.c cVar2 = cVar;
                                                        if (i18 >= bVarArr2.length) {
                                                            break;
                                                        }
                                                        z3.b bVar5 = bVarArr2[i18];
                                                        if (bVar5 instanceof u) {
                                                            z12 = !((u) bVar5).f18943c.isEmpty();
                                                            break;
                                                        }
                                                        i18++;
                                                        cVar = cVar2;
                                                    }
                                                }
                                                z12 = false;
                                                if (z12) {
                                                    i12 = 4;
                                                } else {
                                                    i12 = 0;
                                                }
                                                if (list3 != null) {
                                                    list2 = list3;
                                                } else {
                                                    list2 = Collections.EMPTY_LIST;
                                                }
                                                aVar = new u3.i(i12, e0Var3, list2, null);
                                            }
                                            list = list3;
                                        } else {
                                            i11 = i17;
                                            arrayList = arrayList2;
                                            list = list3;
                                            aVar = new t3.d(0, 0L);
                                        }
                                    } else {
                                        i11 = i17;
                                        arrayList = arrayList2;
                                        list = list3;
                                        aVar = new w3.d(0);
                                    }
                                } else {
                                    i11 = i17;
                                    arrayList = arrayList2;
                                    list = list3;
                                    aVar = new w3.c();
                                }
                            } else {
                                i11 = i17;
                                arrayList = arrayList2;
                                list = list3;
                                aVar = new w3.a();
                            }
                            aVar.getClass();
                            try {
                                z11 = aVar.f(hVar);
                                i10 = 0;
                                hVar.f17238f = 0;
                            } catch (EOFException unused2) {
                                i10 = 0;
                                hVar.f17238f = 0;
                                z11 = false;
                            } catch (Throwable th) {
                                hVar.f17238f = 0;
                                throw th;
                            }
                            if (z11) {
                                bVar = new b(aVar, t0Var2, e0Var3);
                                break;
                            }
                            if (kVar3 == null && (intValue == w8 || intValue == w10 || intValue == x10 || intValue == 11)) {
                                kVar3 = aVar;
                            }
                            list3 = list;
                            i17 = i11 + 1;
                            arrayList2 = arrayList;
                            i9 = 1;
                        } else {
                            kVar3.getClass();
                            bVar = new b(kVar3, t0Var2, e0Var3);
                            break;
                        }
                    }
                    bVar2 = bVar;
                }
                this.O = bVar2;
                m3.k kVar4 = bVar2.f18847a;
                if (!(kVar4 instanceof w3.d) && !(kVar4 instanceof w3.a) && !(kVar4 instanceof w3.c) && !(kVar4 instanceof t3.d)) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                if (z13) {
                    r rVar = this.P;
                    if (j10 != j11) {
                        j12 = this.G.b(j10);
                    } else {
                        j12 = this.h;
                    }
                    if (rVar.f18926h0 != j12) {
                        rVar.f18926h0 = j12;
                        for (q qVar2 : rVar.H) {
                            if (qVar2.F != j12) {
                                qVar2.F = j12;
                                qVar2.f13425z = true;
                            }
                        }
                    }
                } else {
                    r rVar2 = this.P;
                    if (rVar2.f18926h0 != 0) {
                        rVar2.f18926h0 = 0L;
                        for (q qVar3 : rVar2.H) {
                            if (qVar3.F != 0) {
                                qVar3.F = 0L;
                                qVar3.f13425z = true;
                            }
                        }
                    }
                }
                this.P.J.clear();
                this.O.f18847a.c(this.P);
            }
            r rVar3 = this.P;
            l3.c cVar3 = this.J;
            if (!f0.a(rVar3.f18927i0, cVar3)) {
                rVar3.f18927i0 = cVar3;
                while (true) {
                    q[] qVarArr3 = rVar3.H;
                    if (i10 >= qVarArr3.length) {
                        break;
                    }
                    if (rVar3.f18915a0[i10]) {
                        q qVar4 = qVarArr3[i10];
                        qVar4.I = cVar3;
                        qVar4.f13425z = true;
                    }
                    i10++;
                }
            }
            return hVar;
        } catch (InterruptedException unused3) {
            throw new InterruptedIOException();
        }
    }
}
