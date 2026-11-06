package fi;

import android.app.Activity;
import android.net.Uri;
import android.os.Build;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.io.File;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.cp;
public final class t0 extends ImageView {
    public int f12829a;
    public FrameLayout f12830b;
    public boolean f12831c;
    public boolean d;
    public boolean f12832e;
    public cp f12833f;
    public v8 h;
    public s0 f12834n;
    public e7 f12835r;
    public q0 f12836s;
    public Uri f12837w;
    public boolean f12838x;
    public boolean f12839y;

    public static void a(t0 t0Var) {
        v8 v8Var = t0Var.h;
        int i7 = Build.VERSION.SDK_INT;
        if ((i7 <= 28 || org.telegram.messenger.r2.f25200b) && t0Var.getContext().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            Activity W = org.telegram.messenger.g0.W(t0Var.getContext());
            if (W != null) {
                W.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 113);
            }
        } else if (!t0Var.f12831c && t0Var.f12835r != null) {
            if (t0Var.f12837w != null) {
                if (i7 >= 30) {
                    t0Var.getContext().getContentResolver().delete(t0Var.f12837w, null);
                    t0Var.f12837w = null;
                } else if (i7 < 29) {
                    try {
                        new File(t0Var.f12837w.toString()).delete();
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                    t0Var.f12837w = null;
                }
            }
            t0Var.f12831c = true;
            s0 s0Var = t0Var.f12834n;
            if (s0Var != null) {
                s0Var.a();
                t0Var.f12834n = null;
            }
            q0 q0Var = t0Var.f12836s;
            if (q0Var != null) {
                q0Var.a(true);
                t0Var.f12836s = null;
            }
            if (v8Var != null) {
                t0Var.f12832e = true;
                v8Var.a(new n0(t0Var, 0));
            }
            t0Var.d();
            if (v8Var == null) {
                t0Var.b();
            }
        }
    }

    public final void b() {
        e7 e7Var;
        if (this.f12832e && (e7Var = this.f12835r) != null) {
            this.f12832e = false;
            if (e7Var.E()) {
                this.d = true;
                s0 s0Var = new s0(getContext());
                this.f12834n = s0Var;
                s0Var.setOnCancelListener(new n0(this, 1));
                this.f12830b.addView(this.f12834n);
                File s02 = org.telegram.messenger.g0.s0(false);
                this.f12836s = new q0(this.f12829a, this.f12835r, s02, new o0(this, s02, 0), new p0(this, 0), new n0(this, 2));
            } else {
                this.d = false;
                File q02 = org.telegram.messenger.g0.q0("png", false);
                if (q02 == null) {
                    this.f12834n.b(2131624011, 3500, hd.N0("UnknownError"));
                    this.f12831c = false;
                    d();
                    return;
                }
                Utilities.f21336i.c(new o0(this, q02, 1));
            }
            d();
        }
    }

    public final void c(String str) {
        s0 s0Var = this.f12834n;
        if (s0Var != null) {
            s0Var.a();
            this.f12834n = null;
        }
        s0 s0Var2 = new s0(getContext());
        this.f12834n = s0Var2;
        s0Var2.b(2131624011, 3500, str);
        this.f12830b.addView(this.f12834n);
    }

    public final void d() {
        boolean z9;
        boolean z10;
        float f10;
        boolean z11;
        boolean z12 = this.f12838x;
        boolean z13 = this.f12831c;
        boolean z14 = false;
        if (z13 && !this.d) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z12 != z9) {
            if (z13 && !this.d) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f12838x = z11;
            if (z11) {
                org.telegram.messenger.g0.S3(this, this.f12833f);
            } else {
                org.telegram.messenger.g0.R3(this, 2131231738);
            }
        }
        boolean z15 = this.f12839y;
        if (this.f12831c && this.d) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z15 != z10) {
            clearAnimation();
            ViewPropertyAnimator animate = animate();
            if (this.f12831c && this.d) {
                z14 = true;
            }
            this.f12839y = z14;
            if (z14) {
                f10 = 0.4f;
            } else {
                f10 = 1.0f;
            }
            animate.alpha(f10).start();
        }
    }

    public void setEntry(e7 e7Var) {
        this.f12837w = null;
        this.f12835r = e7Var;
        q0 q0Var = this.f12836s;
        if (q0Var != null) {
            q0Var.a(true);
            this.f12836s = null;
        }
        s0 s0Var = this.f12834n;
        if (s0Var != null) {
            s0Var.a();
            this.f12834n = null;
        }
        if (e7Var == null) {
            this.f12831c = false;
            d();
        }
    }
}
