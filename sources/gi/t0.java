package gi;

import android.app.Activity;
import android.net.Uri;
import android.os.Build;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.io.File;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.ui.Components.cp;
public final class t0 extends ImageView {
    public int f13590a;
    public FrameLayout f13591b;
    public boolean f13592c;
    public boolean d;
    public boolean f13593e;
    public cp f13594f;
    public w8 h;
    public s0 f13595n;
    public f7 f13596r;
    public q0 f13597s;
    public Uri f13598w;
    public boolean f13599x;
    public boolean f13600y;

    public static void a(t0 t0Var) {
        w8 w8Var = t0Var.h;
        int i3 = Build.VERSION.SDK_INT;
        if ((i3 <= 28 || org.telegram.messenger.r2.f25041b) && t0Var.getContext().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            Activity W = org.telegram.messenger.g0.W(t0Var.getContext());
            if (W != null) {
                W.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 113);
            }
        } else if (!t0Var.f13592c && t0Var.f13596r != null) {
            if (t0Var.f13598w != null) {
                if (i3 >= 30) {
                    t0Var.getContext().getContentResolver().delete(t0Var.f13598w, null);
                    t0Var.f13598w = null;
                } else if (i3 < 29) {
                    try {
                        new File(t0Var.f13598w.toString()).delete();
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                    t0Var.f13598w = null;
                }
            }
            t0Var.f13592c = true;
            s0 s0Var = t0Var.f13595n;
            if (s0Var != null) {
                s0Var.a();
                t0Var.f13595n = null;
            }
            q0 q0Var = t0Var.f13597s;
            if (q0Var != null) {
                q0Var.a(true);
                t0Var.f13597s = null;
            }
            if (w8Var != null) {
                t0Var.f13593e = true;
                w8Var.a(new n0(t0Var, 0));
            }
            t0Var.d();
            if (w8Var == null) {
                t0Var.b();
            }
        }
    }

    public final void b() {
        f7 f7Var;
        if (this.f13593e && (f7Var = this.f13596r) != null) {
            this.f13593e = false;
            if (f7Var.E()) {
                this.d = true;
                s0 s0Var = new s0(getContext());
                this.f13595n = s0Var;
                s0Var.setOnCancelListener(new n0(this, 1));
                this.f13591b.addView(this.f13595n);
                File s02 = org.telegram.messenger.g0.s0(false);
                this.f13597s = new q0(this.f13590a, this.f13596r, s02, new o0(this, s02, 0), new p0(this, 0), new n0(this, 2));
            } else {
                this.d = false;
                File q02 = org.telegram.messenger.g0.q0("png", false);
                if (q02 == null) {
                    this.f13595n.b(2131624011, 3500, bd.N0("UnknownError"));
                    this.f13592c = false;
                    d();
                    return;
                }
                Utilities.f21390i.c(new o0(this, q02, 1));
            }
            d();
        }
    }

    public final void c(String str) {
        s0 s0Var = this.f13595n;
        if (s0Var != null) {
            s0Var.a();
            this.f13595n = null;
        }
        s0 s0Var2 = new s0(getContext());
        this.f13595n = s0Var2;
        s0Var2.b(2131624011, 3500, str);
        this.f13591b.addView(this.f13595n);
    }

    public final void d() {
        boolean z10;
        boolean z11;
        float f10;
        boolean z12;
        boolean z13 = this.f13599x;
        boolean z14 = this.f13592c;
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
            this.f13599x = z12;
            if (z12) {
                org.telegram.messenger.g0.S3(this, this.f13594f);
            } else {
                org.telegram.messenger.g0.R3(this, 2131231738);
            }
        }
        boolean z16 = this.f13600y;
        if (this.f13592c && this.d) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z16 != z11) {
            clearAnimation();
            ViewPropertyAnimator animate = animate();
            if (this.f13592c && this.d) {
                z15 = true;
            }
            this.f13600y = z15;
            if (z15) {
                f10 = 0.4f;
            } else {
                f10 = 1.0f;
            }
            animate.alpha(f10).start();
        }
    }

    public void setEntry(f7 f7Var) {
        this.f13598w = null;
        this.f13596r = f7Var;
        q0 q0Var = this.f13597s;
        if (q0Var != null) {
            q0Var.a(true);
            this.f13597s = null;
        }
        s0 s0Var = this.f13595n;
        if (s0Var != null) {
            s0Var.a();
            this.f13595n = null;
        }
        if (f7Var == null) {
            this.f13592c = false;
            d();
        }
    }
}
