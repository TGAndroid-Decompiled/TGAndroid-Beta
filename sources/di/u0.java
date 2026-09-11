package di;

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
import org.telegram.ui.Components.sp;
public final class u0 extends ImageView {
    public int f8212a;
    public FrameLayout f8213b;
    public boolean f8214c;
    public boolean d;
    public boolean f8215e;
    public sp f8216f;
    public la h;
    public t0 f8217n;
    public o8 f8218r;
    public r0 f8219s;
    public Uri v;
    public boolean f8220w;
    public boolean f8221x;

    public static void a(u0 u0Var) {
        la laVar = u0Var.h;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23 && ((i10 <= 28 || BuildVars.NO_SCOPED_STORAGE) && u0Var.getContext().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
            Activity findActivity = AndroidUtilities.findActivity(u0Var.getContext());
            if (findActivity != null) {
                findActivity.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 113);
            }
        } else if (!u0Var.f8214c && u0Var.f8218r != null) {
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
            u0Var.f8214c = true;
            t0 t0Var = u0Var.f8217n;
            if (t0Var != null) {
                t0Var.a();
                u0Var.f8217n = null;
            }
            r0 r0Var = u0Var.f8219s;
            if (r0Var != null) {
                r0Var.a(true);
                u0Var.f8219s = null;
            }
            if (laVar != null) {
                u0Var.f8215e = true;
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
        if (this.f8215e && (o8Var = this.f8218r) != null) {
            this.f8215e = false;
            if (o8Var.E()) {
                this.d = true;
                t0 t0Var = new t0(getContext());
                this.f8217n = t0Var;
                t0Var.setOnCancelListener(new o0(this, 1));
                this.f8213b.addView(this.f8217n);
                File generateVideoPath = AndroidUtilities.generateVideoPath();
                this.f8219s = new r0(this.f8212a, this.f8218r, generateVideoPath, new p0(this, generateVideoPath, 0), new q0(this, 0), new o0(this, 2));
            } else {
                this.d = false;
                File generatePicturePath = AndroidUtilities.generatePicturePath(false, "png");
                if (generatePicturePath == null) {
                    this.f8217n.b(R.raw.error, 3500, LocaleController.getString("UnknownError"));
                    this.f8214c = false;
                    d();
                    return;
                }
                Utilities.themeQueue.postRunnable(new p0(this, generatePicturePath, 1));
            }
            d();
        }
    }

    public final void c(int i10, String str) {
        t0 t0Var = this.f8217n;
        if (t0Var != null) {
            t0Var.a();
            this.f8217n = null;
        }
        t0 t0Var2 = new t0(getContext());
        this.f8217n = t0Var2;
        t0Var2.b(i10, 3500, str);
        this.f8213b.addView(this.f8217n);
    }

    public final void d() {
        boolean z10;
        boolean z11;
        float f7;
        boolean z12;
        boolean z13 = this.f8220w;
        boolean z14 = this.f8214c;
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
            this.f8220w = z12;
            if (z12) {
                AndroidUtilities.updateImageViewImageAnimated(this, this.f8216f);
            } else {
                AndroidUtilities.updateImageViewImageAnimated(this, R.drawable.media_download);
            }
        }
        boolean z16 = this.f8221x;
        if (this.f8214c && this.d) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z16 != z11) {
            clearAnimation();
            ViewPropertyAnimator animate = animate();
            if (this.f8214c && this.d) {
                z15 = true;
            }
            this.f8221x = z15;
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
        this.f8218r = o8Var;
        r0 r0Var = this.f8219s;
        if (r0Var != null) {
            r0Var.a(true);
            this.f8219s = null;
        }
        t0 t0Var = this.f8217n;
        if (t0Var != null) {
            t0Var.a();
            this.f8217n = null;
        }
        if (o8Var == null) {
            this.f8214c = false;
            d();
        }
    }
}
