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
import org.telegram.ui.Components.sp;
public final class v0 extends ImageView {
    public int f15556a;
    public FrameLayout f15557b;
    public boolean f15558c;
    public boolean d;
    public boolean f15559e;
    public sp f15560f;
    public t8 h;
    public u0 f15561n;
    public d7 f15562r;
    public s0 f15563s;
    public Uri f15564w;
    public boolean f15565x;
    public boolean f15566y;

    public static void a(v0 v0Var) {
        t8 t8Var = v0Var.h;
        int i7 = Build.VERSION.SDK_INT;
        if ((i7 <= 28 || org.telegram.messenger.s2.f26722b) && v0Var.getContext().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            Activity W = org.telegram.messenger.g0.W(v0Var.getContext());
            if (W != null) {
                W.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 113);
            }
        } else if (!v0Var.f15558c && v0Var.f15562r != null) {
            if (v0Var.f15564w != null) {
                if (i7 >= 30) {
                    v0Var.getContext().getContentResolver().delete(v0Var.f15564w, null);
                    v0Var.f15564w = null;
                } else if (i7 < 29) {
                    try {
                        new File(v0Var.f15564w.toString()).delete();
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                    v0Var.f15564w = null;
                }
            }
            v0Var.f15558c = true;
            u0 u0Var = v0Var.f15561n;
            if (u0Var != null) {
                u0Var.a();
                v0Var.f15561n = null;
            }
            s0 s0Var = v0Var.f15563s;
            if (s0Var != null) {
                s0Var.a(true);
                v0Var.f15563s = null;
            }
            if (t8Var != null) {
                v0Var.f15559e = true;
                t8Var.a(new p0(v0Var, 0));
            }
            v0Var.d();
            if (t8Var == null) {
                v0Var.b();
            }
        }
    }

    public final void b() {
        d7 d7Var;
        if (this.f15559e && (d7Var = this.f15562r) != null) {
            this.f15559e = false;
            if (d7Var.E()) {
                this.d = true;
                u0 u0Var = new u0(getContext());
                this.f15561n = u0Var;
                u0Var.setOnCancelListener(new p0(this, 1));
                this.f15557b.addView(this.f15561n);
                File s02 = org.telegram.messenger.g0.s0(false);
                this.f15563s = new s0(this.f15556a, this.f15562r, s02, new q0(this, s02, 0), new r0(this, 0), new p0(this, 2));
            } else {
                this.d = false;
                File q02 = org.telegram.messenger.g0.q0("png", false);
                if (q02 == null) {
                    this.f15561n.b(2131624012, 3500, gd.N0("UnknownError"));
                    this.f15558c = false;
                    d();
                    return;
                }
                Utilities.f22782i.c(new q0(this, q02, 1));
            }
            d();
        }
    }

    public final void c(String str) {
        u0 u0Var = this.f15561n;
        if (u0Var != null) {
            u0Var.a();
            this.f15561n = null;
        }
        u0 u0Var2 = new u0(getContext());
        this.f15561n = u0Var2;
        u0Var2.b(2131624012, 3500, str);
        this.f15557b.addView(this.f15561n);
    }

    public final void d() {
        boolean z10;
        boolean z11;
        float f10;
        boolean z12;
        boolean z13 = this.f15565x;
        boolean z14 = this.f15558c;
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
            this.f15565x = z12;
            if (z12) {
                org.telegram.messenger.g0.Q3(this, this.f15560f);
            } else {
                org.telegram.messenger.g0.P3(this, 2131231739);
            }
        }
        boolean z16 = this.f15566y;
        if (this.f15558c && this.d) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z16 != z11) {
            clearAnimation();
            ViewPropertyAnimator animate = animate();
            if (this.f15558c && this.d) {
                z15 = true;
            }
            this.f15566y = z15;
            if (z15) {
                f10 = 0.4f;
            } else {
                f10 = 1.0f;
            }
            animate.alpha(f10).start();
        }
    }

    public void setEntry(d7 d7Var) {
        this.f15564w = null;
        this.f15562r = d7Var;
        s0 s0Var = this.f15563s;
        if (s0Var != null) {
            s0Var.a(true);
            this.f15563s = null;
        }
        u0 u0Var = this.f15561n;
        if (u0Var != null) {
            u0Var.a();
            this.f15561n = null;
        }
        if (d7Var == null) {
            this.f15558c = false;
            d();
        }
    }
}
