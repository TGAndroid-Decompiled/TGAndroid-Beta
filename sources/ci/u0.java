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
import org.telegram.ui.Components.tp;
public final class u0 extends ImageView {
    public int f5592a;
    public FrameLayout f5593b;
    public boolean f5594c;
    public boolean d;
    public boolean e;
    public tp f5595f;
    public la h;
    public t0 f5596n;
    public o8 f5597r;
    public r0 f5598s;
    public Uri v;
    public boolean f5599w;
    public boolean f5600x;

    public static void a(u0 u0Var) {
        la laVar = u0Var.h;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23 && ((i10 <= 28 || BuildVars.NO_SCOPED_STORAGE) && u0Var.getContext().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
            Activity findActivity = AndroidUtilities.findActivity(u0Var.getContext());
            if (findActivity != null) {
                findActivity.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 113);
            }
        } else if (!u0Var.f5594c && u0Var.f5597r != null) {
            if (u0Var.v != null) {
                if (i10 >= 30) {
                    u0Var.getContext().getContentResolver().delete(u0Var.v, null);
                    u0Var.v = null;
                } else if (i10 < 29) {
                    try {
                        new File(u0Var.v.toString()).delete();
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    u0Var.v = null;
                }
            }
            u0Var.f5594c = true;
            t0 t0Var = u0Var.f5596n;
            if (t0Var != null) {
                t0Var.a();
                u0Var.f5596n = null;
            }
            r0 r0Var = u0Var.f5598s;
            if (r0Var != null) {
                r0Var.a(true);
                u0Var.f5598s = null;
            }
            if (laVar != null) {
                u0Var.e = true;
                laVar.run(new o0(u0Var, 0));
            }
            u0Var.d();
            if (laVar == null) {
                u0Var.b();
            }
        }
    }

    public final void b() {
        o8 o8Var;
        if (this.e && (o8Var = this.f5597r) != null) {
            this.e = false;
            if (o8Var.E()) {
                this.d = true;
                t0 t0Var = new t0(getContext());
                this.f5596n = t0Var;
                t0Var.setOnCancelListener(new o0(this, 1));
                this.f5593b.addView(this.f5596n);
                File generateVideoPath = AndroidUtilities.generateVideoPath();
                this.f5598s = new r0(this.f5592a, this.f5597r, generateVideoPath, new p0(this, generateVideoPath, 0), new q0(this, 0), new o0(this, 2));
            } else {
                this.d = false;
                File generatePicturePath = AndroidUtilities.generatePicturePath(false, "png");
                if (generatePicturePath == null) {
                    this.f5596n.b(R.raw.error, 3500, LocaleController.getString("UnknownError"));
                    this.f5594c = false;
                    d();
                    return;
                }
                Utilities.themeQueue.postRunnable(new p0(this, generatePicturePath, 1));
            }
            d();
        }
    }

    public final void c(int i10, String str) {
        t0 t0Var = this.f5596n;
        if (t0Var != null) {
            t0Var.a();
            this.f5596n = null;
        }
        t0 t0Var2 = new t0(getContext());
        this.f5596n = t0Var2;
        t0Var2.b(i10, 3500, str);
        this.f5593b.addView(this.f5596n);
    }

    public final void d() {
        boolean z10;
        boolean z11;
        float f7;
        boolean z12;
        boolean z13 = this.f5599w;
        boolean z14 = this.f5594c;
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
            this.f5599w = z12;
            if (z12) {
                AndroidUtilities.updateImageViewImageAnimated(this, this.f5595f);
            } else {
                AndroidUtilities.updateImageViewImageAnimated(this, R.drawable.media_download);
            }
        }
        boolean z16 = this.f5600x;
        if (this.f5594c && this.d) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z16 != z11) {
            clearAnimation();
            ViewPropertyAnimator animate = animate();
            if (this.f5594c && this.d) {
                z15 = true;
            }
            this.f5600x = z15;
            if (z15) {
                f7 = 0.4f;
            } else {
                f7 = 1.0f;
            }
            animate.alpha(f7).start();
        }
    }

    public void setEntry(o8 o8Var) {
        this.v = null;
        this.f5597r = o8Var;
        r0 r0Var = this.f5598s;
        if (r0Var != null) {
            r0Var.a(true);
            this.f5598s = null;
        }
        t0 t0Var = this.f5596n;
        if (t0Var != null) {
            t0Var.a();
            this.f5596n = null;
        }
        if (o8Var == null) {
            this.f5594c = false;
            d();
        }
    }
}
