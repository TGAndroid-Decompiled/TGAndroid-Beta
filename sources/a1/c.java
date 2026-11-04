package a1;

import ai.b3;
import ai.d6;
import ai.i1;
import ai.k0;
import ai.s;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.view.View;
import cg.o;
import ci.e9;
import ci.j1;
import ci.n6;
import ci.tb;
import ci.v;
import ci.w5;
import ci.wb;
import ci.x0;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import e5.l;
import ei.e8;
import ei.f8;
import ei.g1;
import ei.g8;
import ei.h7;
import ei.j5;
import ei.k2;
import ei.l9;
import ei.u;
import ei.u0;
import ei.v0;
import ei.w0;
import g2.k;
import g9.f0;
import j2.i;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.g0;
import org.telegram.messenger.n10;
import org.telegram.messenger.o10;
import org.telegram.messenger.q1;
import org.telegram.messenger.s10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.p1;
import org.telegram.ui.Cells.t0;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.r4;
import org.telegram.ui.Wallet.s1;
import org.telegram.ui.cl0;
import r0.k1;
import r0.m;
import u4.m0;
import yh.j;
public final class c implements OnSuccessListener, Continuation, o, p1, m, q1, k, i, s10, r4, qe.b, cl0, hj0, o10, gj0, h7, l9, j {
    public final int f38a;
    public final Object f39b;

    public c(Object obj, int i3) {
        this.f38a = i3;
        this.f39b = obj;
    }

    @Override
    public void L(int i3, int i10, boolean z10) {
        x0 x0Var = (x0) this.f39b;
        if (z10) {
            long j10 = i3;
            if (x0Var.A1 != j10) {
                x0Var.A1 = j10;
                x0Var.f6315q1.setText(x0.K0(j10));
            }
            x0Var.J0(true);
        }
    }

    @Override
    public k1 R0(View view, k1 k1Var) {
        ((i1) this.f39b).f696o1.j(k1Var);
        return k1.f54025b;
    }

    @Override
    public void Y(int i3, float f10, float f11, qe.c cVar) {
        View view = ((n6) this.f39b).f5610b;
        if (view instanceof t0) {
            ((t0) view).T();
        } else {
            view.invalidate();
        }
    }

    @Override
    public void a(j2.j jVar) {
        c4.i iVar = (c4.i) jVar;
        iVar.clear();
        ((c4.j) this.f39b).f4205b.add(iVar);
    }

    @Override
    public void accept(Object obj) {
        switch (this.f38a) {
            case 6:
                b4.h hVar = (b4.h) this.f39b;
                b4.a aVar = (b4.a) obj;
                b4.g gVar = new b4.g(aVar.f2353b, kb.a.q4(aVar.f2352a, aVar.f2354c));
                hVar.f2363c.add(gVar);
                long j10 = hVar.f2368j;
                if (j10 == -9223372036854775807L || aVar.d >= j10) {
                    hVar.g(gVar);
                    return;
                }
                return;
            default:
                ((f0) this.f39b).c((b4.a) obj);
                return;
        }
    }

    @Override
    public void b(float f10, float f11, int i3, View view) {
        long j10;
        long j11;
        int i10;
        int i11;
        int i12;
        k2 k2Var = (k2) this.f39b;
        j1 j1Var = k2Var.f11150c;
        ArrayList arrayList = k2Var.f11160r;
        v0 v0Var = ((ei.t0) view).f11036f;
        int i13 = k2Var.O;
        int currentTime = ConnectionsManager.getInstance(i13).getCurrentTime();
        HashSet hashSet = new HashSet();
        int i14 = 0;
        int i15 = 0;
        while (true) {
            j10 = 0;
            if (i15 >= v0Var.f11109f.size()) {
                break;
            }
            u0 u0Var = (u0) v0Var.f11109f.get(i15);
            long j12 = u0Var.f11074g;
            if (j12 > 0 && currentTime - u0Var.d <= u.b(i13, (int) j12, 0)) {
                hashSet.add(Integer.valueOf(u0Var.f11069a));
            }
            i15++;
        }
        g1 g1Var = k2Var.Q;
        if (g1Var != null) {
            j10 = g1Var.j();
        }
        int i16 = 0;
        int i17 = 0;
        while (i16 < arrayList.size()) {
            u0 u0Var2 = (u0) arrayList.get(i16);
            if (!u0Var2.f11070b && u0Var2.f11072e && u0Var2.f11074g < j10) {
                j11 = j10;
            } else {
                if (hashSet.contains(Integer.valueOf(u0Var2.f11069a))) {
                    j11 = j10;
                    if (k2Var.f11163x != v0Var.f11106b || (i12 = k2Var.f11164y) == 0 || u0Var2.f11069a < i12) {
                        i10 = u0Var2.f11069a;
                        break;
                    }
                } else {
                    j11 = j10;
                }
                i17++;
            }
            i16++;
            j10 = j11;
        }
        j11 = j10;
        i10 = -1;
        if (i10 < 0) {
            int i18 = 0;
            while (true) {
                if (i14 < arrayList.size()) {
                    u0 u0Var3 = (u0) arrayList.get(i14);
                    if (u0Var3.f11070b || !u0Var3.f11072e || u0Var3.f11074g >= j11) {
                        if (hashSet.contains(Integer.valueOf(u0Var3.f11069a))) {
                            i11 = u0Var3.f11069a;
                            i17 = i18;
                            break;
                        }
                        i18++;
                    }
                    i14++;
                } else {
                    i17 = i18;
                    i11 = -1;
                    break;
                }
            }
        } else {
            i11 = i10;
        }
        if (i11 < 0) {
            return;
        }
        k2Var.f11163x = v0Var.f11106b;
        k2Var.f11164y = i11;
        k2Var.E = true;
        m0 itemAnimator = j1Var.getItemAnimator();
        j1Var.setItemAnimator(null);
        k2Var.d.i1(i17, j1Var.getHeight() / 2, true);
        k2Var.f11153e.g(i17);
        j1Var.setItemAnimator(itemAnimator);
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public void c(boolean z10) {
        j5 j5Var = (j5) this.f39b;
        if (j5Var != null) {
            j5Var.c();
        }
    }

    @Override
    public Object d(Number number, Object obj) {
        Long l10 = (Long) number;
        return w0.a((w0) this.f39b, (Long) obj);
    }

    @Override
    public void e(int i3) {
        switch (this.f38a) {
            case 17:
                n10 n10Var = (n10) this.f39b;
                if (i3 == 1) {
                    n10Var.a(Boolean.TRUE, null);
                    return;
                } else if (i3 != 3) {
                    n10Var.a(Boolean.FALSE, null);
                    return;
                } else {
                    return;
                }
            case 18:
                s1 s1Var = (s1) this.f39b;
                if (i3 == 1) {
                    s1Var.a(Boolean.TRUE, null);
                    return;
                } else if (i3 != 3) {
                    s1Var.a(Boolean.FALSE, null);
                    return;
                } else {
                    return;
                }
            default:
                d6 d6Var = (d6) this.f39b;
                if (i3 == 1) {
                    d6Var.a(Boolean.TRUE, null);
                    return;
                } else if (i3 != 3) {
                    d6Var.a(Boolean.FALSE, null);
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public boolean f(int r37, final android.view.View r38) {
        throw new UnsupportedOperationException("Method not decompiled: a1.c.f(int, android.view.View):boolean");
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.f38a) {
            case 3:
                ((k0) this.f39b).run();
                return;
            default:
                ((u10) this.f39b).a(s1Var.h(i3, true, true));
                return;
        }
    }

    @Override
    public void h(long j10) {
        switch (this.f38a) {
            case 2:
                ((ai.i) this.f39b).a(j10, true);
                return;
            default:
                ((w5) this.f39b).h();
                return;
        }
    }

    @Override
    public void i(float f10, Canvas canvas, RectF rectF, boolean z10) {
        Path path = (Path) this.f39b;
        if (z10) {
            return;
        }
        path.rewind();
        float pow = (float) Math.pow(f10, 2.0d);
        path.addCircle((rectF.right + g0.L(7.0f)) - (g0.L(14.0f) * pow), (rectF.bottom + g0.L(7.0f)) - (g0.L(14.0f) * pow), g0.L(11.0f), Path.Direction.CW);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
    }

    @Override
    public void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        switch (this.f38a) {
            case 11:
                ci.u uVar = (ci.u) this.f39b;
                r31 r31Var = (r31) obj;
                View view = (View) obj2;
                Integer num = (Integer) number;
                Float f10 = (Float) serializable;
                Float f11 = (Float) serializable2;
                v vVar = uVar.f6075r;
                if (r31Var.G instanceof TL_stars.StarsTransaction) {
                    wb.k1(uVar.getContext(), true, vVar.f6132b, v.p0(vVar), (TL_stars.StarsTransaction) r31Var.G, v.q0(vVar));
                    return;
                } else if (uVar.h) {
                    uVar.h = false;
                    uVar.a();
                    return;
                } else {
                    return;
                }
            case 16:
                e9.b((e9) this.f39b, (ArrayList) obj, (Integer) obj2, (Long) number, (ArrayList) serializable, (ArrayList) serializable2);
                return;
            default:
                tb tbVar = (tb) this.f39b;
                r31 r31Var2 = (r31) obj;
                View view2 = (View) obj2;
                Integer num2 = (Integer) number;
                Float f12 = (Float) serializable;
                Float f13 = (Float) serializable2;
                if (r31Var2.G instanceof TL_stars.StarsTransaction) {
                    wb.k1(tbVar.getContext(), false, 0L, tbVar.f6051c, (TL_stars.StarsTransaction) r31Var2.G, tbVar.f6050b);
                    return;
                }
                return;
        }
    }

    @Override
    public void k(e5.f fVar, List list) {
        int i3;
        b3 b3Var = (b3) this.f39b;
        ArrayList arrayList = b3Var.f513f2;
        Iterator it = list.iterator();
        long j10 = 0;
        while (true) {
            i3 = 0;
            if (!it.hasNext()) {
                break;
            }
            l lVar = (l) it.next();
            int size = arrayList.size();
            while (true) {
                if (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    vg.j jVar = (vg.j) obj;
                    if (jVar.h() != null && jVar.h().equals(lVar.f9611c)) {
                        jVar.h = lVar;
                        if (jVar.f() > j10) {
                            j10 = jVar.f();
                        }
                    }
                }
            }
        }
        int size2 = arrayList.size();
        while (i3 < size2) {
            Object obj2 = arrayList.get(i3);
            i3++;
            ((vg.j) obj2).f56682g = j10;
        }
        g0.h3(new s(b3Var, 2));
    }

    @Override
    public void l(yh.f fVar, float f10, float f11) {
        g8 g8Var;
        f8 f8Var = (f8) this.f39b;
        if (!f8Var.v.f10348y) {
            fVar.f59521q = new e8(f8Var, 2);
            float sqrt = (float) Math.sqrt(Math.pow(g8Var.getHeight(), 2.0d) + Math.pow(g8Var.getWidth(), 2.0d));
            ArrayList arrayList = f8Var.f10279i;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                ((yh.f) obj).j(f10, f11, sqrt, false);
            }
        }
    }

    @Override
    public void onSuccess(Object obj) {
        switch (this.f38a) {
            case 0:
                ((b) this.f39b).invoke(obj);
                return;
            case 8:
                ((b1.e) this.f39b).invoke(obj);
                return;
            case 21:
                ((b1.e) this.f39b).invoke(obj);
                return;
            default:
                ((e1.b) this.f39b).invoke(obj);
                return;
        }
    }

    @Override
    public Object then(Task task) {
        return (Task) ((z9.k) this.f39b).call();
    }

    @Override
    public void F(float f10, int i3) {
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
