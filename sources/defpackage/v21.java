package defpackage;

import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.util.WeakHashMap;
import org.telegram.ui.ActionBar.e;
public class v21 {
    public static v21 x;
    public int a;
    public int b;
    public i11 c;
    public vpa d;
    public final z11 e;
    public final l11 f;
    public final e g;
    public final FrameLayout h;
    public final Runnable i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public int p;
    public r11 q;
    public y11 r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public Runnable w;

    public v21(e eVar, FrameLayout frameLayout, z11 z11Var, int i) {
        this.i = new k11(this, (byte) 2);
        this.s = true;
        this.v = true;
        this.e = z11Var;
        this.o = !(z11Var instanceof a21);
        this.f = new l11(this, z11Var, frameLayout);
        this.g = eVar;
        this.h = frameLayout;
        this.j = i;
    }

    public static void a(FrameLayout frameLayout, r11 r11Var) {
        if (frameLayout != null) {
            frameLayout.setTag(2131296353, r11Var);
        }
    }

    public static void d(FrameLayout frameLayout) {
        v21 v21Var;
        int childCount = frameLayout.getChildCount();
        int i = 0;
        while (true) {
            if (i < childCount) {
                View childAt = frameLayout.getChildAt(i);
                if (childAt instanceof z11) {
                    v21Var = ((z11) childAt).bulletin;
                    break;
                }
                i++;
            } else {
                v21Var = null;
                break;
            }
        }
        if (v21Var != null) {
            v21Var.c(0L, uc7.e1().getBoolean("view_animations", true));
        }
    }

    public static void e() {
        v21 v21Var = x;
        if (v21Var != null) {
            v21Var.b();
        }
    }

    public static v21 f(FrameLayout frameLayout, z11 z11Var, int i) {
        if (frameLayout == null) {
            return new v21();
        }
        return new v21(null, frameLayout, z11Var, i);
    }

    public static v21 g(e eVar, z11 z11Var, int i) {
        if (eVar == null) {
            return new v21();
        }
        if (eVar instanceof zu1) {
            vk4 vk4Var = z11.IN_OUT_OFFSET_Y;
            z11Var.e(-2, 1);
        } else if (eVar instanceof uj3) {
            vk4 vk4Var2 = z11.IN_OUT_OFFSET_Y;
            z11Var.e(-1, 0);
        }
        return new v21(eVar, eVar.getBulletinLayoutContainer(), z11Var, i);
    }

    public static void h(FrameLayout frameLayout) {
        if (frameLayout != null) {
            frameLayout.setTag(2131296353, null);
        }
    }

    public final void b() {
        c(0L, uc7.e1().getBoolean("view_animations", true));
    }

    public final void c(long j, boolean z) {
        z11 z11Var = this.e;
        if (z11Var != null && this.m) {
            this.m = false;
            if (x == this) {
                x = null;
            }
            WeakHashMap weakHashMap = ihc.a;
            if (z11Var.isLaidOut() || this.u) {
                z11Var.removeCallbacks(this.i);
                if (z) {
                    z11Var.transitionRunningExit = true;
                    z11Var.delegate = this.q;
                    z11Var.invalidate();
                    if (j >= 0 && !this.l) {
                        ?? obj = new Object();
                        obj.a = j;
                        this.r = obj;
                    } else if (z11Var != null && this.r == null) {
                        this.r = z11Var.createTransition();
                    }
                    y11 y11Var = this.r;
                    Objects.requireNonNull(z11Var);
                    y11Var.q(z11Var, new j11(z11Var, (byte) 0), new k11(this, (byte) 0), new hw(this, (byte) 2));
                    return;
                }
            }
            r11 r11Var = this.q;
            if (r11Var != null && !z11Var.top) {
                r11Var.b(0.0f);
                this.q.c(this);
            }
            z11Var.onExitTransitionStart();
            z11Var.onExitTransitionEnd();
            z11Var.onHide();
            if (this.h != null) {
                hl.c3(new k11(this, (byte) 1));
            }
            z11Var.onDetach();
            Runnable runnable = this.w;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final void i(boolean z) {
        boolean z2;
        z11 z11Var;
        if (z && this.o) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.n != z2 && (z11Var = this.e) != null) {
            this.n = z2;
            Runnable runnable = this.i;
            if (z2) {
                int i = this.j;
                if (i >= 0) {
                    z11Var.postDelayed(runnable, i);
                    return;
                }
                return;
            }
            z11Var.removeCallbacks(runnable);
        }
    }

    public v21 j() {
        k(false);
        return this;
    }

    public final void k(final boolean z) {
        FrameLayout frameLayout;
        if (!this.m && (frameLayout = this.h) != 0) {
            this.m = true;
            z11 z11Var = this.e;
            z11Var.setTop(z);
            CharSequence accessibilityText = z11Var.getAccessibilityText();
            if (accessibilityText != null) {
                hl.g2(accessibilityText);
            }
            ViewParent parent = z11Var.getParent();
            l11 l11Var = this.f;
            if (parent == l11Var) {
                v21 v21Var = x;
                if (v21Var != null) {
                    v21Var.b();
                }
                x = this;
                z11Var.onAttach(this);
                ?? r2 = new View.OnLayoutChangeListener() {
                    @Override
                    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                        int i9;
                        v21 v21Var2 = v21.this;
                        r11 r11Var = v21Var2.q;
                        if ((r11Var == null || r11Var.a()) && !z) {
                            r11 r11Var2 = v21Var2.q;
                            if (r11Var2 != null) {
                                i9 = r11Var2.e(v21Var2.a);
                            } else {
                                i9 = 0;
                            }
                            int i10 = v21Var2.p;
                            if (i10 != i9) {
                                vpa vpaVar = v21Var2.d;
                                if (vpaVar != null && vpaVar.f) {
                                    vpaVar.m.i = i9;
                                } else {
                                    vpa vpaVar2 = new vpa(new xk4(i10));
                                    wpa wpaVar = new wpa();
                                    wpaVar.i = i9;
                                    wpaVar.b(900.0f);
                                    wpaVar.a(1.0f);
                                    vpaVar2.m = wpaVar;
                                    v21Var2.d = vpaVar2;
                                    vpaVar2.b(new i10(v21Var2, (byte) 1));
                                    v21Var2.d.a(new iw0(v21Var2, (byte) 1));
                                }
                                v21Var2.d.h();
                            }
                        }
                    }
                };
                this.c = r2;
                frameLayout.addOnLayoutChangeListener(r2);
                z11Var.addOnLayoutChangeListener(new m11(this, z));
                if (!this.u) {
                    z11Var.addOnAttachStateChangeListener(new xc(this, (byte) 4));
                }
                frameLayout.addView(l11Var);
                return;
            }
            grb.i("Layout has incorrect parent");
        }
    }

    public final void l() {
        z11 z11Var = this.e;
        if (z11Var != null) {
            z11Var.updatePosition();
        }
    }

    public v21() {
        this.i = new k11(this, (byte) 2);
        this.o = true;
        this.s = true;
        this.v = true;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
    }
}
