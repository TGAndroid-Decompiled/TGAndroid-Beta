package j4;

import android.content.Context;
import android.net.Uri;
import com.google.android.exoplayer2.source.dash.DashMediaSource$Factory;
import com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory;
import java.lang.reflect.GenericDeclaration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class l implements b0 {

    public final af.h f12601a;

    public final xe.b f12602b;

    public final long f12603c;
    public final long d;

    public final long f12604e;

    public final float f12605f;

    public final float f12606g;

    public l(Context context, m3.i iVar) {
        xe.b bVar = new xe.b(context, 11);
        this.f12602b = bVar;
        af.h hVar = new af.h();
        hVar.f274a = iVar;
        hVar.f275b = new HashMap();
        hVar.f276c = new HashSet();
        hVar.d = new HashMap();
        this.f12601a = hVar;
        if (bVar != ((xe.b) hVar.f277e)) {
            hVar.f277e = bVar;
            ((HashMap) hVar.f275b).clear();
            ((HashMap) hVar.d).clear();
        }
        this.f12603c = -9223372036854775807L;
        this.d = -9223372036854775807L;
        this.f12604e = -9223372036854775807L;
        this.f12605f = -3.4028235E38f;
        this.f12606g = -3.4028235E38f;
    }

    public static b0 b(Class cls, com.google.android.exoplayer2.upstream.l lVar) {
        try {
            return (b0) cls.getConstructor(com.google.android.exoplayer2.upstream.l.class).newInstance(lVar);
        } catch (Exception e9) {
            throw new IllegalStateException(e9);
        }
    }

    @Override
    public final a a(h3.f1 f1Var) {
        o8.i oVar;
        o8.i iVar;
        o8.i iVar2;
        h3.f1 f1Var2 = f1Var;
        h3.c1 c1Var = f1Var2.f7830b;
        h3.b1 b1Var = f1Var2.f7831c;
        c1Var.getClass();
        h3.c1 c1Var2 = f1Var2.f7830b;
        String scheme = c1Var2.f7795a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        int iC = d5.g0.C(c1Var2.f7795a);
        final af.h hVar = this.f12601a;
        HashMap map = (HashMap) hVar.d;
        b0 b0Var = (b0) map.get(Integer.valueOf(iC));
        final int i10 = 0;
        final int i11 = 1;
        if (b0Var == null) {
            HashMap map2 = (HashMap) hVar.f275b;
            if (map2.containsKey(Integer.valueOf(iC))) {
                iVar = (o8.i) map2.get(Integer.valueOf(iC));
            } else {
                final xe.b bVar = (xe.b) hVar.f277e;
                bVar.getClass();
                try {
                    if (iC != 0) {
                        if (iC != 1) {
                            final int i12 = 2;
                            if (iC != 2) {
                                final int i13 = 3;
                                if (iC != 3) {
                                    oVar = iC != 4 ? null : new o8.i() {
                                        @Override
                                        public final Object get() {
                                            switch (i13) {
                                                case 0:
                                                    return l.b((Class) hVar, bVar);
                                                case 1:
                                                    return l.b((Class) hVar, bVar);
                                                case 2:
                                                    return l.b((Class) hVar, bVar);
                                                default:
                                                    return new s0(bVar, (m3.i) ((af.h) hVar).f274a);
                                            }
                                        }
                                    };
                                } else {
                                    oVar = new h3.o(q4.a.class.asSubclass(b0.class), 4);
                                }
                            } else {
                                final Class clsAsSubclass = HlsMediaSource$Factory.class.asSubclass(b0.class);
                                oVar = new o8.i() {
                                    @Override
                                    public final Object get() {
                                        switch (i12) {
                                            case 0:
                                                return l.b((Class) clsAsSubclass, bVar);
                                            case 1:
                                                return l.b((Class) clsAsSubclass, bVar);
                                            case 2:
                                                return l.b((Class) clsAsSubclass, bVar);
                                            default:
                                                return new s0(bVar, (m3.i) ((af.h) clsAsSubclass).f274a);
                                        }
                                    }
                                };
                            }
                        } else {
                            final GenericDeclaration genericDeclarationAsSubclass = Class.forName("com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource$Factory").asSubclass(b0.class);
                            iVar2 = new o8.i() {
                                @Override
                                public final Object get() {
                                    switch (i11) {
                                        case 0:
                                            return l.b((Class) genericDeclarationAsSubclass, bVar);
                                        case 1:
                                            return l.b((Class) genericDeclarationAsSubclass, bVar);
                                        case 2:
                                            return l.b((Class) genericDeclarationAsSubclass, bVar);
                                        default:
                                            return new s0(bVar, (m3.i) ((af.h) genericDeclarationAsSubclass).f274a);
                                    }
                                }
                            };
                        }
                        map2.put(Integer.valueOf(iC), oVar);
                        if (oVar != null) {
                            ((HashSet) hVar.f276c).add(Integer.valueOf(iC));
                        }
                        iVar = oVar;
                    } else {
                        final Class clsAsSubclass2 = DashMediaSource$Factory.class.asSubclass(b0.class);
                        iVar2 = new o8.i() {
                            @Override
                            public final Object get() {
                                switch (i10) {
                                    case 0:
                                        return l.b((Class) clsAsSubclass2, bVar);
                                    case 1:
                                        return l.b((Class) clsAsSubclass2, bVar);
                                    case 2:
                                        return l.b((Class) clsAsSubclass2, bVar);
                                    default:
                                        return new s0(bVar, (m3.i) ((af.h) clsAsSubclass2).f274a);
                                }
                            }
                        };
                    }
                    oVar = iVar2;
                } catch (ClassNotFoundException unused) {
                }
                map2.put(Integer.valueOf(iC), oVar);
                if (oVar != null) {
                    ((HashSet) hVar.f276c).add(Integer.valueOf(iC));
                }
                iVar = oVar;
            }
            if (iVar == null) {
                b0Var = null;
            } else {
                b0Var = (b0) iVar.get();
                map.put(Integer.valueOf(iC), b0Var);
            }
        }
        d5.a.k(b0Var, "No suitable media source factory found for content type: " + iC);
        h3.a1 a1VarA = b1Var.a();
        if (b1Var.f7782a == -9223372036854775807L) {
            a1VarA.f7767a = this.f12603c;
        }
        if (b1Var.d == -3.4028235E38f) {
            a1VarA.d = this.f12605f;
        }
        if (b1Var.f7785e == -3.4028235E38f) {
            a1VarA.f7770e = this.f12606g;
        }
        if (b1Var.f7783b == -9223372036854775807L) {
            a1VarA.f7768b = this.d;
        }
        if (b1Var.f7784c == -9223372036854775807L) {
            a1VarA.f7769c = this.f12604e;
        }
        h3.b1 b1VarA = a1VarA.a();
        if (!b1VarA.equals(b1Var)) {
            new e7.v();
            List list = Collections.EMPTY_LIST;
            p8.l0 l0Var = p8.l0.f45555e;
            h3.d1 d1Var = h3.d1.f7806c;
            h3.z0 z0Var = f1Var2.f7832e;
            h3.x0 x0Var = new h3.x0();
            x0Var.f8238a = z0Var.f8252a;
            x0Var.f8239b = z0Var.f8253b;
            x0Var.f8240c = z0Var.f8254c;
            x0Var.d = z0Var.d;
            x0Var.f8241e = z0Var.f8255e;
            String str = f1Var2.f7829a;
            h3.h1 h1Var = f1Var2.d;
            b1Var.a();
            h3.d1 d1Var2 = f1Var2.f7833f;
            Uri uri = c1Var2.f7795a;
            List list2 = c1Var2.f7796b;
            p8.z zVar = c1Var2.f7797c;
            new e7.v();
            h3.a1 a1VarA2 = b1VarA.a();
            h3.c1 c1Var3 = uri != null ? new h3.c1(uri, null, list2, zVar) : null;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            h3.z0 z0Var2 = new h3.z0(x0Var);
            h3.b1 b1VarA2 = a1VarA2.a();
            if (h1Var == null) {
                h1Var = h3.h1.U;
            }
            f1Var2 = new h3.f1(str2, z0Var2, c1Var3, b1VarA2, h1Var, d1Var2);
        }
        h3.c1 c1Var4 = f1Var2.f7830b;
        a aVarA = b0Var.a(f1Var2);
        p8.z zVar2 = c1Var4.f7797c;
        if (!zVar2.isEmpty()) {
            a[] aVarArr = new a[zVar2.size() + 1];
            aVarArr[0] = aVarA;
            if (zVar2.size() > 0) {
                this.f12602b.getClass();
                h3.e1 e1Var = (h3.e1) zVar2.get(0);
                new ArrayList(1);
                new HashSet(1);
                new CopyOnWriteArrayList();
                new CopyOnWriteArrayList();
                p8.x xVar = p8.z.f45604b;
                p8.l0 l0Var2 = p8.l0.f45555e;
                List list3 = Collections.EMPTY_LIST;
                p8.l0 l0Var3 = p8.l0.f45555e;
                h3.d1 d1Var3 = h3.d1.f7806c;
                Uri uri2 = Uri.EMPTY;
                e1Var.getClass();
                throw null;
            }
            aVarA = new m0(aVarArr);
        }
        a aVar = aVarA;
        h3.z0 z0Var3 = f1Var2.f7832e;
        long j10 = z0Var3.f8252a;
        long j11 = z0Var3.f8253b;
        return (j10 == 0 && j11 == Long.MIN_VALUE && !z0Var3.d) ? aVar : new g(aVar, d5.g0.H(j10), d5.g0.H(j11), !z0Var3.f8255e, z0Var3.f8254c, z0Var3.d);
    }
}
