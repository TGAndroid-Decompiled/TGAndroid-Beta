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
public final class v0 extends ImageView {
    public int f15592a;
    public FrameLayout f15593b;
    public boolean f15594c;
    public boolean d;
    public boolean f15595e;
    public up f15596f;
    public s8 h;
    public u0 f15597n;
    public c7 f15598r;
    public s0 f15599s;
    public Uri f15600w;
    public boolean f15601x;
    public boolean f15602y;

    public static void a(v0 v0Var) {
        s8 s8Var = v0Var.h;
        int i7 = Build.VERSION.SDK_INT;
        if ((i7 <= 28 || org.telegram.messenger.s2.f26731b) && v0Var.getContext().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            Activity W = org.telegram.messenger.g0.W(v0Var.getContext());
            if (W != null) {
                W.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 113);
            }
        } else if (!v0Var.f15594c && v0Var.f15598r != null) {
            if (v0Var.f15600w != null) {
                if (i7 >= 30) {
                    v0Var.getContext().getContentResolver().delete(v0Var.f15600w, null);
                    v0Var.f15600w = null;
                } else if (i7 < 29) {
                    try {
                        new File(v0Var.f15600w.toString()).delete();
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                    v0Var.f15600w = null;
                }
            }
            v0Var.f15594c = true;
            u0 u0Var = v0Var.f15597n;
            if (u0Var != null) {
                u0Var.a();
                v0Var.f15597n = null;
            }
            s0 s0Var = v0Var.f15599s;
            if (s0Var != null) {
                s0Var.a(true);
                v0Var.f15599s = null;
            }
            if (s8Var != null) {
                v0Var.f15595e = true;
                s8Var.a(new p0(v0Var, 0));
            }
            v0Var.d();
            if (s8Var == null) {
                v0Var.b();
            }
        }
    }

    public final void b() {
        c7 c7Var;
        if (this.f15595e && (c7Var = this.f15598r) != null) {
            this.f15595e = false;
            if (c7Var.E()) {
                this.d = true;
                u0 u0Var = new u0(getContext());
                this.f15597n = u0Var;
                u0Var.setOnCancelListener(new p0(this, 1));
                this.f15593b.addView(this.f15597n);
                File s02 = org.telegram.messenger.g0.s0(false);
                this.f15599s = new s0(this.f15592a, this.f15598r, s02, new q0(this, s02, 0), new r0(this, 0), new p0(this, 2));
            } else {
                this.d = false;
                File q02 = org.telegram.messenger.g0.q0("png", false);
                if (q02 == null) {
                    this.f15597n.b(2131624012, 3500, hd.O0("UnknownError"));
                    this.f15594c = false;
                    d();
                    return;
                }
                Utilities.f22813i.c(new q0(this, q02, 1));
            }
            d();
        }
    }

    public final void c(String str) {
        u0 u0Var = this.f15597n;
        if (u0Var != null) {
            u0Var.a();
            this.f15597n = null;
        }
        u0 u0Var2 = new u0(getContext());
        this.f15597n = u0Var2;
        u0Var2.b(2131624012, 3500, str);
        this.f15593b.addView(this.f15597n);
    }

    public final void d() {
        boolean z10;
        boolean z11;
        float f10;
        boolean z12;
        boolean z13 = this.f15601x;
        boolean z14 = this.f15594c;
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
            this.f15601x = z12;
            if (z12) {
                org.telegram.messenger.g0.Q3(this, this.f15596f);
            } else {
                org.telegram.messenger.g0.P3(this, 2131231739);
            }
        }
        boolean z16 = this.f15602y;
        if (this.f15594c && this.d) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z16 != z11) {
            clearAnimation();
            ViewPropertyAnimator animate = animate();
            if (this.f15594c && this.d) {
                z15 = true;
            }
            this.f15602y = z15;
            if (z15) {
                f10 = 0.4f;
            } else {
                f10 = 1.0f;
            }
            animate.alpha(f10).start();
        }
    }

    public void setEntry(c7 c7Var) {
        this.f15600w = null;
        this.f15598r = c7Var;
        s0 s0Var = this.f15599s;
        if (s0Var != null) {
            s0Var.a(true);
            this.f15599s = null;
        }
        u0 u0Var = this.f15597n;
        if (u0Var != null) {
            u0Var.a();
            this.f15597n = null;
        }
        if (c7Var == null) {
            this.f15594c = false;
            d();
        }
    }
}
