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
    public int f15559a;
    public FrameLayout f15560b;
    public boolean f15561c;
    public boolean d;
    public boolean f15562e;
    public sp f15563f;
    public t8 h;
    public u0 f15564n;
    public d7 f15565r;
    public s0 f15566s;
    public Uri f15567w;
    public boolean f15568x;
    public boolean f15569y;

    public static void a(v0 v0Var) {
        t8 t8Var = v0Var.h;
        int i7 = Build.VERSION.SDK_INT;
        if ((i7 <= 28 || org.telegram.messenger.s2.f26724b) && v0Var.getContext().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            Activity W = org.telegram.messenger.g0.W(v0Var.getContext());
            if (W != null) {
                W.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 113);
            }
        } else if (!v0Var.f15561c && v0Var.f15565r != null) {
            if (v0Var.f15567w != null) {
                if (i7 >= 30) {
                    v0Var.getContext().getContentResolver().delete(v0Var.f15567w, null);
                    v0Var.f15567w = null;
                } else if (i7 < 29) {
                    try {
                        new File(v0Var.f15567w.toString()).delete();
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                    v0Var.f15567w = null;
                }
            }
            v0Var.f15561c = true;
            u0 u0Var = v0Var.f15564n;
            if (u0Var != null) {
                u0Var.a();
                v0Var.f15564n = null;
            }
            s0 s0Var = v0Var.f15566s;
            if (s0Var != null) {
                s0Var.a(true);
                v0Var.f15566s = null;
            }
            if (t8Var != null) {
                v0Var.f15562e = true;
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
        if (this.f15562e && (d7Var = this.f15565r) != null) {
            this.f15562e = false;
            if (d7Var.E()) {
                this.d = true;
                u0 u0Var = new u0(getContext());
                this.f15564n = u0Var;
                u0Var.setOnCancelListener(new p0(this, 1));
                this.f15560b.addView(this.f15564n);
                File s02 = org.telegram.messenger.g0.s0(false);
                this.f15566s = new s0(this.f15559a, this.f15565r, s02, new q0(this, s02, 0), new r0(this, 0), new p0(this, 2));
            } else {
                this.d = false;
                File q02 = org.telegram.messenger.g0.q0("png", false);
                if (q02 == null) {
                    this.f15564n.b(2131624012, 3500, gd.N0("UnknownError"));
                    this.f15561c = false;
                    d();
                    return;
                }
                Utilities.f22785i.c(new q0(this, q02, 1));
            }
            d();
        }
    }

    public final void c(String str) {
        u0 u0Var = this.f15564n;
        if (u0Var != null) {
            u0Var.a();
            this.f15564n = null;
        }
        u0 u0Var2 = new u0(getContext());
        this.f15564n = u0Var2;
        u0Var2.b(2131624012, 3500, str);
        this.f15560b.addView(this.f15564n);
    }

    public final void d() {
        boolean z10;
        boolean z11;
        float f10;
        boolean z12;
        boolean z13 = this.f15568x;
        boolean z14 = this.f15561c;
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
            this.f15568x = z12;
            if (z12) {
                org.telegram.messenger.g0.Q3(this, this.f15563f);
            } else {
                org.telegram.messenger.g0.P3(this, 2131231739);
            }
        }
        boolean z16 = this.f15569y;
        if (this.f15561c && this.d) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z16 != z11) {
            clearAnimation();
            ViewPropertyAnimator animate = animate();
            if (this.f15561c && this.d) {
                z15 = true;
            }
            this.f15569y = z15;
            if (z15) {
                f10 = 0.4f;
            } else {
                f10 = 1.0f;
            }
            animate.alpha(f10).start();
        }
    }

    public void setEntry(d7 d7Var) {
        this.f15567w = null;
        this.f15565r = d7Var;
        s0 s0Var = this.f15566s;
        if (s0Var != null) {
            s0Var.a(true);
            this.f15566s = null;
        }
        u0 u0Var = this.f15564n;
        if (u0Var != null) {
            u0Var.a();
            this.f15564n = null;
        }
        if (d7Var == null) {
            this.f15561c = false;
            d();
        }
    }
}
