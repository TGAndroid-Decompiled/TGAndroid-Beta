package defpackage;

import android.app.Activity;
import android.net.Uri;
import android.os.Build;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.io.File;
import org.telegram.messenger.Utilities;
public final class fq3 extends ImageView {
    public int a;
    public FrameLayout b;
    public boolean c;
    public boolean d;
    public boolean e;
    public di2 f;
    public dab h;
    public eq3 n;
    public c8b r;
    public cq3 s;
    public Uri w;
    public boolean x;
    public boolean y;

    public final void a() {
        dab dabVar = this.h;
        int i = Build.VERSION.SDK_INT;
        if ((i <= 28 || f11.b) && getContext().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            Activity W = hl.W(getContext());
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
                        cc4.g(e, true);
                    }
                    this.w = null;
                }
            }
            this.c = true;
            eq3 eq3Var = this.n;
            if (eq3Var != null) {
                eq3Var.a();
                this.n = null;
            }
            cq3 cq3Var = this.s;
            if (cq3Var != null) {
                cq3Var.a(true);
                this.s = null;
            }
            if (dabVar != null) {
                this.e = true;
                dabVar.a(new zp3(this, (byte) 0));
            }
            d();
            if (dabVar == null) {
                b();
            }
        }
    }

    public final void b() {
        c8b c8bVar;
        if (this.e && (c8bVar = this.r) != null) {
            this.e = false;
            if (c8bVar.D()) {
                this.d = true;
                eq3 eq3Var = new eq3(getContext());
                this.n = eq3Var;
                eq3Var.setOnCancelListener(new zp3(this, (byte) 1));
                this.b.addView(this.n);
                File s0 = hl.s0(false);
                this.s = new cq3(this.a, this.r, s0, new aq3(this, s0, (byte) 0), new bq3(this, (byte) 0), new zp3(this, (byte) 2));
            } else {
                this.d = false;
                File q0 = hl.q0("png", false);
                if (q0 == null) {
                    this.n.b(2131624012, 3500, ob6.N0("UnknownError"));
                    this.c = false;
                    d();
                    return;
                }
                Utilities.i.c(new aq3(this, q0, (byte) 1));
            }
            d();
        }
    }

    public final void c(String str) {
        eq3 eq3Var = this.n;
        if (eq3Var != null) {
            eq3Var.a();
            this.n = null;
        }
        eq3 eq3Var2 = new eq3(getContext());
        this.n = eq3Var2;
        eq3Var2.b(2131624012, 3500, str);
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
                hl.M3(this, this.f);
            } else {
                hl.L3(this, 2131231742);
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

    public void setEntry(c8b c8bVar) {
        this.w = null;
        this.r = c8bVar;
        cq3 cq3Var = this.s;
        if (cq3Var != null) {
            cq3Var.a(true);
            this.s = null;
        }
        eq3 eq3Var = this.n;
        if (eq3Var != null) {
            eq3Var.a();
            this.n = null;
        }
        if (c8bVar == null) {
            this.c = false;
            d();
        }
    }
}
