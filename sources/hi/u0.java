package hi;

import android.app.Activity;
import android.net.Uri;
import android.os.Build;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.io.File;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.lp;
public final class u0 extends ImageView {
    public int f15168a;
    public FrameLayout f15169b;
    public boolean f15170c;
    public boolean d;
    public boolean f15171e;
    public lp f15172f;
    public t8 h;
    public t0 f15173n;
    public d7 f15174r;
    public r0 f15175s;
    public Uri f15176w;
    public boolean f15177x;
    public boolean f15178y;

    public static void a(u0 u0Var) {
        t8 t8Var = u0Var.h;
        int i7 = Build.VERSION.SDK_INT;
        if ((i7 <= 28 || org.telegram.messenger.r2.f26207b) && u0Var.getContext().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            Activity W = org.telegram.messenger.g0.W(u0Var.getContext());
            if (W != null) {
                W.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 113);
            }
        } else if (!u0Var.f15170c && u0Var.f15174r != null) {
            if (u0Var.f15176w != null) {
                if (i7 >= 30) {
                    u0Var.getContext().getContentResolver().delete(u0Var.f15176w, null);
                    u0Var.f15176w = null;
                } else if (i7 < 29) {
                    try {
                        new File(u0Var.f15176w.toString()).delete();
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                    u0Var.f15176w = null;
                }
            }
            u0Var.f15170c = true;
            t0 t0Var = u0Var.f15173n;
            if (t0Var != null) {
                t0Var.a();
                u0Var.f15173n = null;
            }
            r0 r0Var = u0Var.f15175s;
            if (r0Var != null) {
                r0Var.a(true);
                u0Var.f15175s = null;
            }
            if (t8Var != null) {
                u0Var.f15171e = true;
                t8Var.a(new o0(u0Var, 0));
            }
            u0Var.d();
            if (t8Var == null) {
                u0Var.b();
            }
        }
    }

    public final void b() {
        d7 d7Var;
        if (this.f15171e && (d7Var = this.f15174r) != null) {
            this.f15171e = false;
            if (d7Var.E()) {
                this.d = true;
                t0 t0Var = new t0(getContext());
                this.f15173n = t0Var;
                t0Var.setOnCancelListener(new o0(this, 1));
                this.f15169b.addView(this.f15173n);
                File s02 = org.telegram.messenger.g0.s0(false);
                this.f15175s = new r0(this.f15168a, this.f15174r, s02, new p0(this, s02, 0), new q0(this, 0), new o0(this, 2));
            } else {
                this.d = false;
                File q02 = org.telegram.messenger.g0.q0("png", false);
                if (q02 == null) {
                    this.f15173n.b(2131624012, 3500, hd.N0("UnknownError"));
                    this.f15170c = false;
                    d();
                    return;
                }
                Utilities.f22419i.c(new p0(this, q02, 1));
            }
            d();
        }
    }

    public final void c(String str) {
        t0 t0Var = this.f15173n;
        if (t0Var != null) {
            t0Var.a();
            this.f15173n = null;
        }
        t0 t0Var2 = new t0(getContext());
        this.f15173n = t0Var2;
        t0Var2.b(2131624012, 3500, str);
        this.f15169b.addView(this.f15173n);
    }

    public final void d() {
        boolean z10;
        boolean z11;
        float f10;
        boolean z12;
        boolean z13 = this.f15177x;
        boolean z14 = this.f15170c;
        boolean z15 = false;
        if (z14 && !this.d) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z13 != z10) {
            if (z14 && !this.d) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f15177x = z12;
            if (z12) {
                org.telegram.messenger.g0.R3(this, this.f15172f);
            } else {
                org.telegram.messenger.g0.Q3(this, 2131231738);
            }
        }
        boolean z16 = this.f15178y;
        if (this.f15170c && this.d) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z16 != z11) {
            clearAnimation();
            ViewPropertyAnimator animate = animate();
            if (this.f15170c && this.d) {
                z15 = true;
            }
            this.f15178y = z15;
            if (z15) {
                f10 = 0.4f;
            } else {
                f10 = 1.0f;
            }
            animate.alpha(f10).start();
        }
    }

    public void setEntry(d7 d7Var) {
        this.f15176w = null;
        this.f15174r = d7Var;
        r0 r0Var = this.f15175s;
        if (r0Var != null) {
            r0Var.a(true);
            this.f15175s = null;
        }
        t0 t0Var = this.f15173n;
        if (t0Var != null) {
            t0Var.a();
            this.f15173n = null;
        }
        if (d7Var == null) {
            this.f15170c = false;
            d();
        }
    }
}
