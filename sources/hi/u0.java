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
import org.telegram.ui.Components.up;
public final class u0 extends ImageView {
    public int f15478a;
    public FrameLayout f15479b;
    public boolean f15480c;
    public boolean d;
    public boolean f15481e;
    public up f15482f;
    public t8 h;
    public t0 f15483n;
    public d7 f15484r;
    public r0 f15485s;
    public Uri f15486w;
    public boolean f15487x;
    public boolean f15488y;

    public static void a(u0 u0Var) {
        t8 t8Var = u0Var.h;
        int i7 = Build.VERSION.SDK_INT;
        if ((i7 <= 28 || org.telegram.messenger.s2.f26695b) && u0Var.getContext().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            Activity W = org.telegram.messenger.g0.W(u0Var.getContext());
            if (W != null) {
                W.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 113);
            }
        } else if (!u0Var.f15480c && u0Var.f15484r != null) {
            if (u0Var.f15486w != null) {
                if (i7 >= 30) {
                    u0Var.getContext().getContentResolver().delete(u0Var.f15486w, null);
                    u0Var.f15486w = null;
                } else if (i7 < 29) {
                    try {
                        new File(u0Var.f15486w.toString()).delete();
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                    u0Var.f15486w = null;
                }
            }
            u0Var.f15480c = true;
            t0 t0Var = u0Var.f15483n;
            if (t0Var != null) {
                t0Var.a();
                u0Var.f15483n = null;
            }
            r0 r0Var = u0Var.f15485s;
            if (r0Var != null) {
                r0Var.a(true);
                u0Var.f15485s = null;
            }
            if (t8Var != null) {
                u0Var.f15481e = true;
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
        if (this.f15481e && (d7Var = this.f15484r) != null) {
            this.f15481e = false;
            if (d7Var.E()) {
                this.d = true;
                t0 t0Var = new t0(getContext());
                this.f15483n = t0Var;
                t0Var.setOnCancelListener(new o0(this, 1));
                this.f15479b.addView(this.f15483n);
                File s02 = org.telegram.messenger.g0.s0(false);
                this.f15485s = new r0(this.f15478a, this.f15484r, s02, new p0(this, s02, 0), new q0(this, 0), new o0(this, 2));
            } else {
                this.d = false;
                File q02 = org.telegram.messenger.g0.q0("png", false);
                if (q02 == null) {
                    this.f15483n.b(2131624012, 3500, hd.O0("UnknownError"));
                    this.f15480c = false;
                    d();
                    return;
                }
                Utilities.f22777i.c(new p0(this, q02, 1));
            }
            d();
        }
    }

    public final void c(String str) {
        t0 t0Var = this.f15483n;
        if (t0Var != null) {
            t0Var.a();
            this.f15483n = null;
        }
        t0 t0Var2 = new t0(getContext());
        this.f15483n = t0Var2;
        t0Var2.b(2131624012, 3500, str);
        this.f15479b.addView(this.f15483n);
    }

    public final void d() {
        boolean z10;
        boolean z11;
        float f10;
        boolean z12;
        boolean z13 = this.f15487x;
        boolean z14 = this.f15480c;
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
            this.f15487x = z12;
            if (z12) {
                org.telegram.messenger.g0.Q3(this, this.f15482f);
            } else {
                org.telegram.messenger.g0.P3(this, 2131231739);
            }
        }
        boolean z16 = this.f15488y;
        if (this.f15480c && this.d) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z16 != z11) {
            clearAnimation();
            ViewPropertyAnimator animate = animate();
            if (this.f15480c && this.d) {
                z15 = true;
            }
            this.f15488y = z15;
            if (z15) {
                f10 = 0.4f;
            } else {
                f10 = 1.0f;
            }
            animate.alpha(f10).start();
        }
    }

    public void setEntry(d7 d7Var) {
        this.f15486w = null;
        this.f15484r = d7Var;
        r0 r0Var = this.f15485s;
        if (r0Var != null) {
            r0Var.a(true);
            this.f15485s = null;
        }
        t0 t0Var = this.f15483n;
        if (t0Var != null) {
            t0Var.a();
            this.f15483n = null;
        }
        if (d7Var == null) {
            this.f15480c = false;
            d();
        }
    }
}
