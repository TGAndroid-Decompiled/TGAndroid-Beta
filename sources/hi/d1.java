package hi;

import android.app.Activity;
import android.net.Uri;
import android.os.Build;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.io.File;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.rp;
public final class d1 extends ImageView {
    public int f14296a;
    public FrameLayout f14297b;
    public boolean f14298c;
    public boolean d;
    public boolean f14299e;
    public rp f14300f;
    public n9 h;
    public c1 f14301n;
    public x7 f14302r;
    public a1 f14303s;
    public Uri f14304w;
    public boolean f14305x;
    public boolean f14306y;

    public static void a(d1 d1Var) {
        n9 n9Var = d1Var.h;
        int i7 = Build.VERSION.SDK_INT;
        if ((i7 <= 28 || org.telegram.messenger.s2.f26830b) && d1Var.getContext().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            Activity W = org.telegram.messenger.g0.W(d1Var.getContext());
            if (W != null) {
                W.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 113);
            }
        } else if (!d1Var.f14298c && d1Var.f14302r != null) {
            if (d1Var.f14304w != null) {
                if (i7 >= 30) {
                    d1Var.getContext().getContentResolver().delete(d1Var.f14304w, null);
                    d1Var.f14304w = null;
                } else if (i7 < 29) {
                    try {
                        new File(d1Var.f14304w.toString()).delete();
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                    d1Var.f14304w = null;
                }
            }
            d1Var.f14298c = true;
            c1 c1Var = d1Var.f14301n;
            if (c1Var != null) {
                c1Var.a();
                d1Var.f14301n = null;
            }
            a1 a1Var = d1Var.f14303s;
            if (a1Var != null) {
                a1Var.a(true);
                d1Var.f14303s = null;
            }
            if (n9Var != null) {
                d1Var.f14299e = true;
                n9Var.a(new x0(d1Var, 0));
            }
            d1Var.d();
            if (n9Var == null) {
                d1Var.b();
            }
        }
    }

    public final void b() {
        x7 x7Var;
        if (this.f14299e && (x7Var = this.f14302r) != null) {
            this.f14299e = false;
            if (x7Var.E()) {
                this.d = true;
                c1 c1Var = new c1(getContext());
                this.f14301n = c1Var;
                c1Var.setOnCancelListener(new x0(this, 1));
                this.f14297b.addView(this.f14301n);
                File s02 = org.telegram.messenger.g0.s0(false);
                this.f14303s = new a1(this.f14296a, this.f14302r, s02, new y0(this, s02, 0), new z0(this, 0), new x0(this, 2));
            } else {
                this.d = false;
                File q02 = org.telegram.messenger.g0.q0("png", false);
                if (q02 == null) {
                    this.f14301n.b(2131624012, 3500, gd.O0("UnknownError"));
                    this.f14298c = false;
                    d();
                    return;
                }
                Utilities.f22880i.c(new y0(this, q02, 1));
            }
            d();
        }
    }

    public final void c(String str) {
        c1 c1Var = this.f14301n;
        if (c1Var != null) {
            c1Var.a();
            this.f14301n = null;
        }
        c1 c1Var2 = new c1(getContext());
        this.f14301n = c1Var2;
        c1Var2.b(2131624012, 3500, str);
        this.f14297b.addView(this.f14301n);
    }

    public final void d() {
        boolean z10;
        boolean z11;
        float f10;
        boolean z12;
        boolean z13 = this.f14305x;
        boolean z14 = this.f14298c;
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
            this.f14305x = z12;
            if (z12) {
                org.telegram.messenger.g0.Q3(this, this.f14300f);
            } else {
                org.telegram.messenger.g0.P3(this, 2131231742);
            }
        }
        boolean z16 = this.f14306y;
        if (this.f14298c && this.d) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z16 != z11) {
            clearAnimation();
            ViewPropertyAnimator animate = animate();
            if (this.f14298c && this.d) {
                z15 = true;
            }
            this.f14306y = z15;
            if (z15) {
                f10 = 0.4f;
            } else {
                f10 = 1.0f;
            }
            animate.alpha(f10).start();
        }
    }

    public void setEntry(x7 x7Var) {
        this.f14304w = null;
        this.f14302r = x7Var;
        a1 a1Var = this.f14303s;
        if (a1Var != null) {
            a1Var.a(true);
            this.f14303s = null;
        }
        c1 c1Var = this.f14301n;
        if (c1Var != null) {
            c1Var.a();
            this.f14301n = null;
        }
        if (x7Var == null) {
            this.f14298c = false;
            d();
        }
    }
}
