package bi;

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
import org.telegram.ui.Components.zp;
public final class y0 extends ImageView {
    public int f3953a;
    public FrameLayout f3954b;
    public boolean f3955c;
    public boolean d;
    public boolean e;
    public zp f3956f;
    public ub h;
    public x0 f3957n;
    public r9 f3958r;
    public v0 f3959s;
    public Uri v;
    public boolean f3960w;
    public boolean f3961x;

    public static void a(y0 y0Var) {
        ub ubVar = y0Var.h;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23 && ((i10 <= 28 || BuildVars.NO_SCOPED_STORAGE) && y0Var.getContext().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
            Activity findActivity = AndroidUtilities.findActivity(y0Var.getContext());
            if (findActivity != null) {
                findActivity.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 113);
            }
        } else if (!y0Var.f3955c && y0Var.f3958r != null) {
            if (y0Var.v != null) {
                if (i10 >= 30) {
                    y0Var.getContext().getContentResolver().delete(y0Var.v, null);
                    y0Var.v = null;
                } else if (i10 < 29) {
                    try {
                        new File(y0Var.v.toString()).delete();
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    y0Var.v = null;
                }
            }
            y0Var.f3955c = true;
            x0 x0Var = y0Var.f3957n;
            if (x0Var != null) {
                x0Var.a();
                y0Var.f3957n = null;
            }
            v0 v0Var = y0Var.f3959s;
            if (v0Var != null) {
                v0Var.a(true);
                y0Var.f3959s = null;
            }
            if (ubVar != null) {
                y0Var.e = true;
                ubVar.run(new s0(y0Var, 0));
            }
            y0Var.d();
            if (ubVar == null) {
                y0Var.b();
            }
        }
    }

    public final void b() {
        r9 r9Var;
        if (this.e && (r9Var = this.f3958r) != null) {
            this.e = false;
            if (r9Var.E()) {
                this.d = true;
                x0 x0Var = new x0(getContext());
                this.f3957n = x0Var;
                x0Var.setOnCancelListener(new s0(this, 1));
                this.f3954b.addView(this.f3957n);
                File generateVideoPath = AndroidUtilities.generateVideoPath();
                this.f3959s = new v0(this.f3953a, this.f3958r, generateVideoPath, new t0(this, generateVideoPath, 0), new u0(this, 0), new s0(this, 2));
            } else {
                this.d = false;
                File generatePicturePath = AndroidUtilities.generatePicturePath(false, "png");
                if (generatePicturePath == null) {
                    this.f3957n.b(R.raw.error, 3500, LocaleController.getString("UnknownError"));
                    this.f3955c = false;
                    d();
                    return;
                }
                Utilities.themeQueue.postRunnable(new t0(this, generatePicturePath, 1));
            }
            d();
        }
    }

    public final void c(int i10, String str) {
        x0 x0Var = this.f3957n;
        if (x0Var != null) {
            x0Var.a();
            this.f3957n = null;
        }
        x0 x0Var2 = new x0(getContext());
        this.f3957n = x0Var2;
        x0Var2.b(i10, 3500, str);
        this.f3954b.addView(this.f3957n);
    }

    public final void d() {
        boolean z10;
        boolean z11;
        float f7;
        boolean z12;
        boolean z13 = this.f3960w;
        boolean z14 = this.f3955c;
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
            this.f3960w = z12;
            if (z12) {
                AndroidUtilities.updateImageViewImageAnimated(this, this.f3956f);
            } else {
                AndroidUtilities.updateImageViewImageAnimated(this, R.drawable.media_download);
            }
        }
        boolean z16 = this.f3961x;
        if (this.f3955c && this.d) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z16 != z11) {
            clearAnimation();
            ViewPropertyAnimator animate = animate();
            if (this.f3955c && this.d) {
                z15 = true;
            }
            this.f3961x = z15;
            if (z15) {
                f7 = 0.4f;
            } else {
                f7 = 1.0f;
            }
            animate.alpha(f7).start();
        }
    }

    public void setEntry(r9 r9Var) {
        this.v = null;
        this.f3958r = r9Var;
        v0 v0Var = this.f3959s;
        if (v0Var != null) {
            v0Var.a(true);
            this.f3959s = null;
        }
        x0 x0Var = this.f3957n;
        if (x0Var != null) {
            x0Var.a();
            this.f3957n = null;
        }
        if (r9Var == null) {
            this.f3955c = false;
            d();
        }
    }
}
