package defpackage;

import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.util.WeakHashMap;
import org.telegram.ui.ActionBar.d;
public class m21 {
    public static m21 w;
    public byte a;
    public int b;
    public a11 c;
    public yla d;
    public final q11 e;
    public final c11 f;
    public final d g;
    public final FrameLayout h;
    public final Runnable i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    public i11 p;
    public p11 q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public Runnable v;

    public m21(d dVar, FrameLayout frameLayout, q11 q11Var, int i) {
        this.i = new z01(this, (byte) 0);
        this.r = true;
        this.u = true;
        this.e = q11Var;
        this.n = !(q11Var instanceof r11);
        this.f = new c11(this, q11Var, frameLayout);
        this.g = dVar;
        this.h = frameLayout;
        this.j = i;
    }

    public static void a(FrameLayout frameLayout, i11 i11Var) {
        if (frameLayout != null) {
            frameLayout.setTag(2131296353, i11Var);
        }
    }

    public static void d(FrameLayout frameLayout) {
        m21 m21Var;
        int childCount = frameLayout.getChildCount();
        int i = 0;
        while (true) {
            if (i < childCount) {
                View childAt = frameLayout.getChildAt(i);
                if (childAt instanceof q11) {
                    m21Var = ((q11) childAt).bulletin;
                    break;
                }
                i++;
            } else {
                m21Var = null;
                break;
            }
        }
        if (m21Var != null) {
            m21Var.c(0L, na7.c1().getBoolean("view_animations", true));
        }
    }

    public static void e() {
        m21 m21Var = w;
        if (m21Var != null) {
            m21Var.b();
        }
    }

    public static m21 f(FrameLayout frameLayout, q11 q11Var, int i) {
        if (frameLayout == null) {
            return new m21();
        }
        return new m21(null, frameLayout, q11Var, i);
    }

    public static m21 g(d dVar, h11 h11Var, int i) {
        if (dVar == null) {
            return new m21();
        }
        if (dVar instanceof mu1) {
            q11.access$000(h11Var, -2, 1);
        } else if (dVar instanceof cj3) {
            q11.access$000(h11Var, -1, 0);
        }
        return new m21(dVar, dVar.getBulletinLayoutContainer(), h11Var, i);
    }

    public static void h(FrameLayout frameLayout) {
        if (frameLayout != null) {
            frameLayout.setTag(2131296353, null);
        }
    }

    public final void b() {
        c(0L, na7.c1().getBoolean("view_animations", true));
    }

    public final void c(long j, boolean z) {
        q11 q11Var = this.e;
        if (q11Var != null && this.l) {
            this.l = false;
            if (w == this) {
                w = null;
            }
            WeakHashMap weakHashMap = jdc.a;
            if (q11Var.isLaidOut() || this.t) {
                q11Var.removeCallbacks(this.i);
                if (z) {
                    q11Var.transitionRunningExit = true;
                    q11Var.delegate = this.p;
                    q11Var.invalidate();
                    if (j >= 0) {
                        ?? obj = new Object();
                        obj.a = j;
                        this.q = obj;
                    } else if (q11Var != null && this.q == null) {
                        this.q = q11Var.createTransition();
                    }
                    p11 p11Var = this.q;
                    Objects.requireNonNull(q11Var);
                    p11Var.g(q11Var, new b11(q11Var, (byte) 0), new z01(this, (byte) 1), new gw(this, (byte) 2));
                    return;
                }
            }
            i11 i11Var = this.p;
            if (i11Var != null && !q11Var.top) {
                i11Var.b(0.0f);
                this.p.c(this);
            }
            q11Var.onExitTransitionStart();
            q11Var.onExitTransitionEnd();
            q11Var.onHide();
            if (this.h != null) {
                gl.c3(new z01(this, (byte) 2));
            }
            q11Var.onDetach();
            Runnable runnable = this.v;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final void i(boolean z) {
        boolean z2;
        q11 q11Var;
        if (z && this.n) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.m != z2 && (q11Var = this.e) != null) {
            this.m = z2;
            Runnable runnable = this.i;
            if (z2) {
                int i = this.j;
                if (i >= 0) {
                    q11Var.postDelayed(runnable, i);
                    return;
                }
                return;
            }
            q11Var.removeCallbacks(runnable);
        }
    }

    public m21 j() {
        k(false);
        return this;
    }

    public final void k(final boolean z) {
        FrameLayout frameLayout;
        if (!this.l && (frameLayout = this.h) != 0) {
            this.l = true;
            q11 q11Var = this.e;
            q11Var.setTop(z);
            CharSequence accessibilityText = q11Var.getAccessibilityText();
            if (accessibilityText != null) {
                gl.g2(accessibilityText);
            }
            ViewParent parent = q11Var.getParent();
            c11 c11Var = this.f;
            if (parent == c11Var) {
                m21 m21Var = w;
                if (m21Var != null) {
                    m21Var.b();
                }
                w = this;
                q11Var.onAttach(this);
                ?? r2 = new View.OnLayoutChangeListener() {
                    @Override
                    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                        int i9;
                        m21 m21Var2 = m21.this;
                        i11 i11Var = m21Var2.p;
                        if ((i11Var == null || i11Var.a()) && !z) {
                            i11 i11Var2 = m21Var2.p;
                            if (i11Var2 != null) {
                                i9 = i11Var2.e(m21Var2.a);
                            } else {
                                i9 = 0;
                            }
                            int i10 = m21Var2.o;
                            if (i10 != i9) {
                                yla ylaVar = m21Var2.d;
                                if (ylaVar != null && ylaVar.f) {
                                    ylaVar.m.i = i9;
                                } else {
                                    yla ylaVar2 = new yla(new ti4(i10));
                                    zla zlaVar = new zla();
                                    zlaVar.i = i9;
                                    zlaVar.b(900.0f);
                                    zlaVar.a(1.0f);
                                    ylaVar2.m = zlaVar;
                                    m21Var2.d = ylaVar2;
                                    ylaVar2.b(new h10(m21Var2, (byte) 1));
                                    m21Var2.d.a(new zv0(m21Var2, (byte) 1));
                                }
                                m21Var2.d.h();
                            }
                        }
                    }
                };
                this.c = r2;
                frameLayout.addOnLayoutChangeListener(r2);
                q11Var.addOnLayoutChangeListener(new d11(this, z));
                if (!this.t) {
                    q11Var.addOnAttachStateChangeListener(new wc(this, (byte) 4));
                }
                frameLayout.addView(c11Var);
                return;
            }
            sc8.j("Layout has incorrect parent");
        }
    }

    public final void l() {
        q11 q11Var = this.e;
        if (q11Var != null) {
            q11Var.updatePosition();
        }
    }

    public m21() {
        this.i = new z01(this, (byte) 0);
        this.n = true;
        this.r = true;
        this.u = true;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
    }
}
