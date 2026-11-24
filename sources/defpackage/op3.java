package defpackage;

import android.app.Activity;
import android.net.Uri;
import android.os.Build;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.io.File;
import org.telegram.messenger.Utilities;
public final class op3 extends ImageView {
    public int a;
    public FrameLayout b;
    public boolean c;
    public boolean d;
    public boolean e;
    public ih2 f;
    public e6b h;
    public np3 n;
    public f4b r;
    public lp3 s;
    public Uri w;
    public boolean x;
    public boolean y;

    public final void a() {
        e6b e6bVar = this.h;
        int i = Build.VERSION.SDK_INT;
        if ((i <= 28 || w01.b) && getContext().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            Activity W = gl.W(getContext());
            if (W != null) {
                W.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 113);
            }
        } else if (!this.c && this.r != null) {
            if (this.w != null) {
                if (i >= 30) {
                    getContext().getContentResolver().delete(this.w, null);
                    this.w = null;
                } else if (i < 29) {
                    try {
                        new File(this.w.toString()).delete();
                    } catch (Exception e) {
                        fa4.g(e, true);
                    }
                    this.w = null;
                }
            }
            this.c = true;
            np3 np3Var = this.n;
            if (np3Var != null) {
                np3Var.a();
                this.n = null;
            }
            lp3 lp3Var = this.s;
            if (lp3Var != null) {
                lp3Var.a(true);
                this.s = null;
            }
            if (e6bVar != null) {
                this.e = true;
                e6bVar.a(new ip3(this, (byte) 0));
            }
            d();
            if (e6bVar == null) {
                b();
            }
        }
    }

    public final void b() {
        f4b f4bVar;
        if (this.e && (f4bVar = this.r) != null) {
            this.e = false;
            if (f4bVar.D()) {
                this.d = true;
                np3 np3Var = new np3(getContext());
                this.n = np3Var;
                np3Var.setOnCancelListener(new ip3(this, (byte) 1));
                this.b.addView(this.n);
                File s0 = gl.s0(false);
                this.s = new lp3(this.a, this.r, s0, new jp3(this, s0, (byte) 0), new kp3(this, (byte) 0), new ip3(this, (byte) 2));
            } else {
                this.d = false;
                File q0 = gl.q0("png", false);
                if (q0 == null) {
                    this.n.b(2131624012, 3500, k96.N0("UnknownError"));
                    this.c = false;
                    d();
                    return;
                }
                Utilities.i.c(new jp3(this, q0, (byte) 1));
            }
            d();
        }
    }

    public final void c(String str) {
        np3 np3Var = this.n;
        if (np3Var != null) {
            np3Var.a();
            this.n = null;
        }
        np3 np3Var2 = new np3(getContext());
        this.n = np3Var2;
        np3Var2.b(2131624012, 3500, str);
        this.b.addView(this.n);
    }

    public final void d() {
        boolean z;
        boolean z2;
        float f;
        boolean z3;
        boolean z4 = this.x;
        boolean z5 = this.c;
        boolean z6 = false;
        if (z5 && !this.d) {
            z = true;
        } else {
            z = false;
        }
        if (z4 != z) {
            if (z5 && !this.d) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.x = z3;
            if (z3) {
                gl.M3(this, this.f);
            } else {
                gl.L3(this, 2131231742);
            }
        }
        boolean z7 = this.y;
        if (this.c && this.d) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z7 != z2) {
            clearAnimation();
            ViewPropertyAnimator animate = animate();
            if (this.c && this.d) {
                z6 = true;
            }
            this.y = z6;
            if (z6) {
                f = 0.4f;
            } else {
                f = 1.0f;
            }
            animate.alpha(f).start();
        }
    }

    public void setEntry(f4b f4bVar) {
        this.w = null;
        this.r = f4bVar;
        lp3 lp3Var = this.s;
        if (lp3Var != null) {
            lp3Var.a(true);
            this.s = null;
        }
        np3 np3Var = this.n;
        if (np3Var != null) {
            np3Var.a();
            this.n = null;
        }
        if (f4bVar == null) {
            this.c = false;
            d();
        }
    }
}
