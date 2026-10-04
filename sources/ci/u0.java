package ci;

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
import org.telegram.ui.Components.wp;
public final class u0 extends ImageView {
    public int f6042a;
    public FrameLayout f6043b;
    public boolean f6044c;
    public boolean d;
    public boolean f6045e;
    public wp f6046f;
    public ha h;
    public t0 f6047n;
    public k8 f6048r;
    public r0 f6049s;
    public Uri v;
    public boolean f6050w;
    public boolean f6051x;

    public static void a(u0 u0Var) {
        ha haVar = u0Var.h;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23 && ((i10 <= 28 || BuildVars.NO_SCOPED_STORAGE) && u0Var.getContext().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
            Activity findActivity = AndroidUtilities.findActivity(u0Var.getContext());
            if (findActivity != null) {
                findActivity.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 113);
            }
        } else if (!u0Var.f6044c && u0Var.f6048r != null) {
            if (u0Var.v != null) {
                if (i10 >= 30) {
                    u0Var.getContext().getContentResolver().delete(u0Var.v, null);
                    u0Var.v = null;
                } else if (i10 < 29) {
                    try {
                        new File(u0Var.v.toString()).delete();
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                    u0Var.v = null;
                }
            }
            u0Var.f6044c = true;
            t0 t0Var = u0Var.f6047n;
            if (t0Var != null) {
                t0Var.a();
                u0Var.f6047n = null;
            }
            r0 r0Var = u0Var.f6049s;
            if (r0Var != null) {
                r0Var.a(true);
                u0Var.f6049s = null;
            }
            if (haVar != null) {
                u0Var.f6045e = true;
                haVar.run(new o0(u0Var, 0));
            }
            u0Var.d();
            if (haVar == null) {
                u0Var.b();
            }
        }
    }

    public final void b() {
        k8 k8Var;
        if (this.f6045e && (k8Var = this.f6048r) != null) {
            this.f6045e = false;
            if (k8Var.E()) {
                this.d = true;
                t0 t0Var = new t0(getContext());
                this.f6047n = t0Var;
                t0Var.setOnCancelListener(new o0(this, 1));
                this.f6043b.addView(this.f6047n);
                File generateVideoPath = AndroidUtilities.generateVideoPath();
                this.f6049s = new r0(this.f6042a, this.f6048r, generateVideoPath, new p0(this, generateVideoPath, 0), new q0(this, 0), new o0(this, 2));
            } else {
                this.d = false;
                File generatePicturePath = AndroidUtilities.generatePicturePath(false, "png");
                if (generatePicturePath == null) {
                    this.f6047n.b(R.raw.error, 3500, LocaleController.getString("UnknownError"));
                    this.f6044c = false;
                    d();
                    return;
                }
                Utilities.themeQueue.postRunnable(new p0(this, generatePicturePath, 1));
            }
            d();
        }
    }

    public final void c(int i10, String str) {
        t0 t0Var = this.f6047n;
        if (t0Var != null) {
            t0Var.a();
            this.f6047n = null;
        }
        t0 t0Var2 = new t0(getContext());
        this.f6047n = t0Var2;
        t0Var2.b(i10, 3500, str);
        this.f6043b.addView(this.f6047n);
    }

    public final void d() {
        boolean z10;
        boolean z11;
        float f7;
        boolean z12;
        boolean z13 = this.f6050w;
        boolean z14 = this.f6044c;
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
            this.f6050w = z12;
            if (z12) {
                AndroidUtilities.updateImageViewImageAnimated(this, this.f6046f);
            } else {
                AndroidUtilities.updateImageViewImageAnimated(this, R.drawable.media_download);
            }
        }
        boolean z16 = this.f6051x;
        if (this.f6044c && this.d) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z16 != z11) {
            clearAnimation();
            ViewPropertyAnimator animate = animate();
            if (this.f6044c && this.d) {
                z15 = true;
            }
            this.f6051x = z15;
            if (z15) {
                f7 = 0.4f;
            } else {
                f7 = 1.0f;
            }
            animate.alpha(f7).start();
        }
    }

    public void setEntry(k8 k8Var) {
        this.v = null;
        this.f6048r = k8Var;
        r0 r0Var = this.f6049s;
        if (r0Var != null) {
            r0Var.a(true);
            this.f6049s = null;
        }
        t0 t0Var = this.f6047n;
        if (t0Var != null) {
            t0Var.a();
            this.f6047n = null;
        }
        if (k8Var == null) {
            this.f6044c = false;
            d();
        }
    }
}
