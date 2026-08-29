package nh;

import android.app.Activity;
import android.net.Uri;
import android.os.Build;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.np;
public final class u0 extends ImageView {
    public int f18702a;
    public FrameLayout f18703b;
    public boolean f18704c;
    public boolean d;
    public boolean f18705e;
    public np f18706f;
    public h9 h;
    public t0 f18707n;
    public o7 f18708r;
    public r0 f18709s;
    public Uri v;
    public boolean f18710w;
    public boolean f18711x;

    public static void a(u0 u0Var) {
        h9 h9Var = u0Var.h;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23 && ((i10 <= 28 || BuildVars.NO_SCOPED_STORAGE) && u0Var.getContext().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
            Activity findActivity = AndroidUtilities.findActivity(u0Var.getContext());
            if (findActivity != null) {
                findActivity.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 113);
            }
        } else if (!u0Var.f18704c && u0Var.f18708r != null) {
            if (u0Var.v != null) {
                if (i10 >= 30) {
                    u0Var.getContext().getContentResolver().delete(u0Var.v, null);
                    u0Var.v = null;
                } else if (i10 < 29) {
                    try {
                        new File(u0Var.v.toString()).delete();
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                    u0Var.v = null;
                }
            }
            u0Var.f18704c = true;
            t0 t0Var = u0Var.f18707n;
            if (t0Var != null) {
                t0Var.a();
                u0Var.f18707n = null;
            }
            r0 r0Var = u0Var.f18709s;
            if (r0Var != null) {
                r0Var.a(true);
                u0Var.f18709s = null;
            }
            if (h9Var != null) {
                u0Var.f18705e = true;
                h9Var.run(new o0(u0Var, 0));
            }
            u0Var.d();
            if (h9Var == null) {
                u0Var.b();
            }
        }
    }

    public final void b() {
        o7 o7Var;
        if (this.f18705e && (o7Var = this.f18708r) != null) {
            this.f18705e = false;
            if (o7Var.E()) {
                this.d = true;
                t0 t0Var = new t0(getContext());
                this.f18707n = t0Var;
                t0Var.setOnCancelListener(new o0(this, 1));
                this.f18703b.addView(this.f18707n);
                File generateVideoPath = AndroidUtilities.generateVideoPath();
                this.f18709s = new r0(this.f18702a, this.f18708r, generateVideoPath, new p0(this, generateVideoPath, 0), new q0(this, 0), new o0(this, 2));
            } else {
                this.d = false;
                File generatePicturePath = AndroidUtilities.generatePicturePath(false, "png");
                if (generatePicturePath == null) {
                    this.f18707n.b(R.raw.error, 3500, LocaleController.getString("UnknownError"));
                    this.f18704c = false;
                    d();
                    return;
                }
                Utilities.themeQueue.postRunnable(new p0(this, generatePicturePath, 1));
            }
            d();
        }
    }

    public final void c(int i10, String str) {
        t0 t0Var = this.f18707n;
        if (t0Var != null) {
            t0Var.a();
            this.f18707n = null;
        }
        t0 t0Var2 = new t0(getContext());
        this.f18707n = t0Var2;
        t0Var2.b(i10, 3500, str);
        this.f18703b.addView(this.f18707n);
    }

    public final void d() {
        boolean z10;
        boolean z11;
        float f9;
        boolean z12;
        boolean z13 = this.f18710w;
        boolean z14 = this.f18704c;
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
            this.f18710w = z12;
            if (z12) {
                AndroidUtilities.updateImageViewImageAnimated(this, this.f18706f);
            } else {
                AndroidUtilities.updateImageViewImageAnimated(this, R.drawable.media_download);
            }
        }
        boolean z16 = this.f18711x;
        if (this.f18704c && this.d) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z16 != z11) {
            clearAnimation();
            ViewPropertyAnimator animate = animate();
            if (this.f18704c && this.d) {
                z15 = true;
            }
            this.f18711x = z15;
            if (z15) {
                f9 = 0.4f;
            } else {
                f9 = 1.0f;
            }
            animate.alpha(f9).start();
        }
    }

    public void setEntry(o7 o7Var) {
        this.v = null;
        this.f18708r = o7Var;
        r0 r0Var = this.f18709s;
        if (r0Var != null) {
            r0Var.a(true);
            this.f18709s = null;
        }
        t0 t0Var = this.f18707n;
        if (t0Var != null) {
            t0Var.a();
            this.f18707n = null;
        }
        if (o7Var == null) {
            this.f18704c = false;
            d();
        }
    }
}
