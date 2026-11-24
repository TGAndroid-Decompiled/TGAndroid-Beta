package defpackage;

import android.app.Activity;
import android.net.Uri;
import android.os.Build;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.io.File;
import org.telegram.messenger.Utilities;
public final class yq3 extends ImageView {
    public int a;
    public FrameLayout b;
    public boolean c;
    public boolean d;
    public boolean e;
    public wi2 f;
    public g8b h;
    public xq3 n;
    public g6b r;
    public vq3 s;
    public Uri w;
    public boolean x;
    public boolean y;

    public final void a() {
        g8b g8bVar = this.h;
        int i = Build.VERSION.SDK_INT;
        if ((i <= 28 || e21.b) && getContext().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            Activity W = gm.W(getContext());
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
                        fc4.g(e, true);
                    }
                    this.w = null;
                }
            }
            this.c = true;
            xq3 xq3Var = this.n;
            if (xq3Var != null) {
                xq3Var.a();
                this.n = null;
            }
            vq3 vq3Var = this.s;
            if (vq3Var != null) {
                vq3Var.a(true);
                this.s = null;
            }
            if (g8bVar != null) {
                this.e = true;
                g8bVar.a(new sq3(this, (byte) 0));
            }
            d();
            if (g8bVar == null) {
                b();
            }
        }
    }

    public final void b() {
        g6b g6bVar;
        if (this.e && (g6bVar = this.r) != null) {
            this.e = false;
            if (g6bVar.D()) {
                this.d = true;
                xq3 xq3Var = new xq3(getContext());
                this.n = xq3Var;
                xq3Var.setOnCancelListener(new sq3(this, (byte) 1));
                this.b.addView(this.n);
                File s0 = gm.s0(false);
                this.s = new vq3(this.a, this.r, s0, new tq3(this, s0, (byte) 0), new uq3(this, (byte) 0), new sq3(this, (byte) 2));
            } else {
                this.d = false;
                File q0 = gm.q0("png", false);
                if (q0 == null) {
                    this.n.b(2131624012, 3500, jb6.N0("UnknownError"));
                    this.c = false;
                    d();
                    return;
                }
                Utilities.i.c(new tq3(this, q0, (byte) 1));
            }
            d();
        }
    }

    public final void c(String str) {
        xq3 xq3Var = this.n;
        if (xq3Var != null) {
            xq3Var.a();
            this.n = null;
        }
        xq3 xq3Var2 = new xq3(getContext());
        this.n = xq3Var2;
        xq3Var2.b(2131624012, 3500, str);
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
                gm.M3(this, this.f);
            } else {
                gm.L3(this, 2131231743);
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

    public void setEntry(g6b g6bVar) {
        this.w = null;
        this.r = g6bVar;
        vq3 vq3Var = this.s;
        if (vq3Var != null) {
            vq3Var.a(true);
            this.s = null;
        }
        xq3 xq3Var = this.n;
        if (xq3Var != null) {
            xq3Var.a();
            this.n = null;
        }
        if (g6bVar == null) {
            this.c = false;
            d();
        }
    }
}
