package defpackage;

import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.utils.twidget.z;
public final class nm9 extends dk9 implements u0d {
    public static final AtomicInteger t0 = new AtomicInteger();
    public final TL_iv.pageBlockEmbed X;
    public q0d Y;
    public final boolean Z;
    public int a0;
    public final Path b0;
    public final float[] c0;
    public final int d0;
    public v0d e0;
    public boolean f0;
    public long g0;
    public boolean h0;
    public final v59 i0;
    public int j0;
    public int k0;
    public String l0;
    public h1d m0;
    public kmb[] n0;
    public boolean o0;
    public long p0;
    public boolean q0;
    public boolean r0;
    public float s0;

    public nm9(defpackage.hl9 r4, android.graphics.Rect r5, int r6, org.telegram.tgnet.tl.TL_iv.pageBlockEmbed r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nm9.<init>(hl9, android.graphics.Rect, int, org.telegram.tgnet.tl.TL_iv$pageBlockEmbed, boolean):void");
    }

    public static int i0() {
        int i;
        int i2 = xea.U0;
        if (i2 >= 15) {
            i = hl.L(2.0f);
        } else if (i2 >= 11) {
            i = hl.L(1.0f);
        } else {
            i = 0;
        }
        return (hl.L(9.0f) + i) - hl.L(2.0f);
    }

    public static float k0(int i) {
        return (float) Math.ceil((i / hl.p) - 0.01f);
    }

    public static int s0(int i, boolean z) {
        int i2;
        float f = 6.0f;
        int L = hl.L(6.0f) + i;
        if (xea.U0 < 10) {
            f = 4.0f;
        }
        int L2 = L + (hl.L(f) << 1);
        if (z) {
            i2 = hl.L(20.0f);
        } else {
            i2 = 0;
        }
        return hl.L(4.0f) + L2 + i2;
    }

    @Override
    public final int H() {
        Rect rect = this.b;
        return rect.top + this.j0 + rect.bottom;
    }

    @Override
    public final kmb[] K() {
        return this.n0;
    }

    @Override
    public final boolean P() {
        v0d v0dVar = this.e0;
        if (v0dVar != null && this.f0 && v0dVar.w && (v0dVar.L & 3) != 2) {
            if (v0dVar.z || v0dVar.o()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void S() {
        q0d q0dVar = this.Y;
        TL_iv.pageBlockEmbed pageblockembed = this.X;
        if (q0dVar == null) {
            q0dVar = k0d.h(pageblockembed.url);
            this.Y = q0dVar;
        }
        if (q0dVar == null) {
            return;
        }
        if (this.e0 == null) {
            this.e0 = new v0d(this, hl.p);
        }
        h0d h0dVar = (h0d) k0d.a.get(pageblockembed.url);
        if (h0dVar != null) {
            ArrayList arrayList = h0dVar.x;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            boolean z = false;
            if (k0d.p(arrayList) != this) {
                v0d v0dVar = this.e0;
                q0d q0dVar2 = this.Y;
                v0dVar.r();
                v0dVar.p = q0dVar2;
                if (q0dVar2 != null) {
                    z = true;
                }
                v0dVar.r = z;
                return;
            }
            nm9 nm9Var = h0dVar.y;
            h0dVar.y = this;
            if (nm9Var != null && nm9Var != this && nm9Var.f0 && nm9Var.e0 != null) {
                nm9Var.r0();
                v0d v0dVar2 = nm9Var.e0;
                q0d q0dVar3 = nm9Var.Y;
                v0dVar2.r();
                v0dVar2.p = q0dVar3;
                if (q0dVar3 != null) {
                    z = true;
                }
                v0dVar2.r = z;
                View view = nm9Var.W;
                if (view != null) {
                    view.invalidate();
                }
            }
        }
        q0();
    }

    @Override
    public final void U() {
        v0d v0dVar;
        if (this.e0 != null) {
            r0();
            this.e0.r();
            h0d h0dVar = (h0d) k0d.a.get(this.X.url);
            if (h0dVar != null) {
                ArrayList arrayList = h0dVar.x;
                arrayList.remove(this);
                if (h0dVar.y == this) {
                    nm9 p = k0d.p(arrayList);
                    h0dVar.y = p;
                    if (p != null && !p.f0 && p.W != null && (v0dVar = p.e0) != null && p.Y != null) {
                        v0dVar.r();
                        p.q0();
                        p.W.invalidate();
                    }
                }
            }
        }
    }

    @Override
    public final void V(android.graphics.Canvas r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nm9.V(android.graphics.Canvas):void");
    }

    @Override
    public final boolean X(MotionEvent motionEvent) {
        h0d h0dVar;
        if (this.e0 != null && this.f0) {
            String str = this.X.url;
            if (k0d.m(str)) {
                h0dVar = (h0d) k0d.a.get(str);
            } else {
                h0dVar = null;
            }
            if (h0dVar == null || !h0dVar.k) {
                motionEvent.offsetLocation(this.k0, 0.0f);
                try {
                    return this.e0.n(motionEvent);
                } finally {
                    motionEvent.offsetLocation(-this.k0, 0.0f);
                }
            }
            return false;
        }
        return false;
    }

    @Override
    public final void d() {
        wb2 wb2Var = this.a.E;
        if (wb2Var != null && wb2Var.eb != null) {
            try {
                wb2Var.performHapticFeedback(0);
            } catch (Exception unused) {
            }
            wb2Var.eb.v(wb2Var, wb2Var.h1, wb2Var.i1);
        }
    }

    @Override
    public final void f() {
        a1d d;
        h1d h1dVar;
        q0d q0dVar = this.Y;
        if (q0dVar == null) {
            d = null;
        } else {
            d = q0dVar.d();
        }
        if (d == null) {
            h1dVar = null;
        } else {
            h1dVar = d.g;
        }
        if (h1dVar != this.m0) {
            this.m0 = h1dVar;
            if (h1dVar == null) {
                this.n0 = null;
            } else {
                ArrayList arrayList = h1dVar.a;
                this.n0 = new kmb[arrayList.size()];
                int i = 0;
                while (true) {
                    kmb[] kmbVarArr = this.n0;
                    if (i >= kmbVarArr.length) {
                        break;
                    }
                    kmbVarArr[i] = new af9(this, (f1d) arrayList.get(i));
                    i++;
                }
            }
            this.a.P();
        }
        View view = this.W;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final void h() {
        v59 v59Var = this.i0;
        hl.r(v59Var);
        if (!this.h0) {
            if (!this.Y.e()) {
                hl.d3(v59Var, 1500L);
                return;
            }
            this.h0 = true;
            this.g0 = SystemClock.uptimeMillis();
            if (j0() != this.j0) {
                p0("on screen, loaded", true);
            }
        } else if (SystemClock.uptimeMillis() - this.g0 < 1500) {
            hl.d3(v59Var, 200L);
        } else if (j0() != this.j0) {
            p0("on screen", true);
        }
    }

    public final boolean h0() {
        h0d h0dVar;
        boolean z;
        String str = this.X.url;
        q0d q0dVar = this.Y;
        ConcurrentHashMap concurrentHashMap = k0d.a;
        if (q0dVar != null && q0dVar.h > 0) {
            return q0dVar.k;
        }
        i0d i0dVar = null;
        if (k0d.m(str)) {
            h0dVar = (h0d) k0d.a.get(str);
        } else {
            h0dVar = null;
        }
        if (h0dVar != null) {
            i0dVar = (i0d) k0d.b.get(h0dVar.a());
        }
        if (i0dVar != null) {
            synchronized (i0dVar) {
                if (!i0dVar.a.isEmpty() && ((int[]) i0dVar.a.get(0)).length > 2) {
                    if (((int[]) i0dVar.a.get(0))[2] != 0) {
                        z = true;
                    }
                }
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final int j0() {
        return k0d.c(this.X.url, this.Y, t0());
    }

    public final float l0() {
        return this.b.top + this.s0;
    }

    public final float m0() {
        return t0() + (this.b.left - this.k0);
    }

    public final void n0(int i, String str, String str2, boolean z) {
        long j;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        if (!f11.a) {
            return;
        }
        long j2 = -1;
        if (this.f0) {
            j = SystemClock.uptimeMillis() - this.g0;
        } else {
            j = -1;
        }
        v0d v0dVar = this.e0;
        if (v0dVar != null && v0dVar.s != 0) {
            j2 = SystemClock.uptimeMillis() - v0dVar.s;
        }
        StringBuilder sb = new StringBuilder("widget height ");
        sb.append(this.X.url.substring(10));
        sb.append(": ");
        sb.append(str);
        sb.append(", ");
        sb.append(Math.round(i / hl.p));
        sb.append(" (");
        sb.append(str2);
        sb.append(") -> ");
        sb.append(Math.round(this.j0 / hl.p));
        sb.append(" (");
        sb.append(this.l0);
        sb.append("), width ");
        sb.append(Math.round(t0() / hl.p));
        String str9 = "";
        if (!z) {
            str3 = "";
        } else {
            str3 = ", animated";
        }
        sb.append(str3);
        if (this.W != null) {
            str4 = ", on screen";
        } else {
            str4 = ", off screen";
        }
        sb.append(str4);
        if (j >= 0) {
            str5 = ik8.n(j, ", running ", " ms");
        } else {
            str5 = ", not running";
        }
        sb.append(str5);
        if (this.Y != null) {
            StringBuilder sb2 = new StringBuilder(", session ");
            sb2.append(this.Y.p);
            if (this.Y.f == null) {
                str7 = "";
            } else {
                str7 = " (snapshot)";
            }
            sb2.append(str7);
            z zVar = this.Y.e;
            if (zVar != null && zVar.I) {
                str8 = "";
            } else {
                str8 = ", scripts held";
            }
            sb2.append(str8);
            str6 = sb2.toString();
        } else {
            str6 = ", no widget yet";
        }
        sb.append(str6);
        if (j2 >= 0 && j2 < 5000) {
            str9 = ik8.n(j2, ", touched ", " ms ago");
        }
        uh9.s(str9, sb);
    }

    public final void o0(String str) {
        if (this.W != null) {
            q0d q0dVar = this.Y;
            if ((q0dVar == null || q0dVar.h <= 0) && j0() != this.j0) {
                p0("on screen: ".concat(str), false);
                return;
            }
            return;
        }
        int j0 = j0();
        int i = this.j0;
        if (j0 == i) {
            return;
        }
        String str2 = this.l0;
        this.j0 = j0;
        this.l0 = k0d.j(this.X.url, this.Y, t0());
        n0(i, "away: ".concat(str), str2, false);
        hl9 hl9Var = this.a;
        hl9Var.P();
        r47 r47Var = hl9Var.b;
        if (r47Var != null) {
            r47Var.M1 = true;
        }
        this.o0 = true;
    }

    public final void p0(String str, boolean z) {
        boolean z2;
        int j0 = j0();
        int i = this.j0;
        boolean z3 = false;
        if (j0 != i) {
            z2 = true;
        } else {
            z2 = false;
        }
        String str2 = this.l0;
        this.j0 = j0;
        this.l0 = k0d.j(this.X.url, this.Y, t0());
        hl9 hl9Var = this.a;
        if (z2) {
            n0(i, str, str2, z);
            hl9Var.P();
            if (z) {
                this.p0 = SystemClock.uptimeMillis();
                this.q0 = false;
            }
        }
        r47 r47Var = hl9Var.b;
        if (r47Var != null) {
            r47Var.M1 = true;
        }
        wb2 wb2Var = hl9Var.E;
        rb2 rb2Var = hl9Var.F;
        View view = this.W;
        if (view != null && wb2Var != null && rb2Var != null) {
            if (z2 && !h0() && (wb2Var.getParent() instanceof RecyclerView)) {
                View view2 = (View) wb2Var.getParent();
                if (wb2Var.getBottom() > view2.getPaddingTop() && wb2Var.getTop() < view2.getHeight() - view2.getPaddingBottom()) {
                    z3 = true;
                }
            }
            if (z) {
                rb2Var.r1(wb2Var, z3, z3);
            } else {
                rb2Var.h2(wb2Var, z3, z3);
            }
        } else if (view != null) {
            view.requestLayout();
        }
    }

    public final void q0() {
        vnb vnbVar;
        r47 r47Var;
        boolean z = true;
        this.f0 = true;
        this.g0 = SystemClock.uptimeMillis();
        this.h0 = this.Y.e();
        this.Y.m(t0());
        hl9 hl9Var = this.a;
        wb2 wb2Var = hl9Var.E;
        if (wb2Var != null) {
            vnbVar = wb2Var.getResourcesProvider();
        } else {
            vnbVar = null;
        }
        this.a0 = c1d.e(vnbVar, hl9Var.D());
        this.Y.k(c1d.a(vnbVar, hl9Var.D()));
        this.e0.b(this.Y);
        this.e0.q(true);
        h0d h0dVar = (h0d) k0d.a.get(this.X.url);
        if (h0dVar != null) {
            h0dVar.w = this;
        }
        k0d.u(this.Y);
        if (!this.o0 || (r47Var = hl9Var.b) == null || !r47Var.M1) {
            z = false;
        }
        this.o0 = false;
        if (!z && j0() == this.j0) {
            return;
        }
        hl.c3(new q38((byte) 6, this, z));
    }

    public final void r0() {
        if (this.f0) {
            this.f0 = false;
            hl.r(this.i0);
            this.e0.q(false);
            this.e0.r();
            q0d q0dVar = this.Y;
            if (q0dVar != null) {
                k0d.r(q0dVar);
            }
        }
    }

    @Override
    public final void setCursor(String str) {
        View view = this.W;
        if (view != null && Build.VERSION.SDK_INT >= 24) {
            lh0.k(view, str);
        }
    }

    public final int t0() {
        return this.c + (i0() << 1);
    }
}
