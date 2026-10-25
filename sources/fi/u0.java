package fi;

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
import org.telegram.ui.Components.gq;
public final class u0 extends ImageView {
    public int f11733a;
    public FrameLayout f11734b;
    public boolean f11735c;
    public boolean d;
    public boolean e;
    public gq f11736f;
    public q9 h;
    public t0 f11737n;
    public w7 f11738r;
    public r0 f11739s;
    public Uri v;
    public boolean f11740w;
    public boolean f11741x;

    public static void a(u0 u0Var) {
        q9 q9Var = u0Var.h;
        int i10 = Build.VERSION.SDK_INT;
        if ((i10 <= 28 || BuildVars.NO_SCOPED_STORAGE) && u0Var.getContext().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            Activity findActivity = AndroidUtilities.findActivity(u0Var.getContext());
            if (findActivity != null) {
                findActivity.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 113);
            }
        } else if (!u0Var.f11735c && u0Var.f11738r != null) {
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
            u0Var.f11735c = true;
            t0 t0Var = u0Var.f11737n;
            if (t0Var != null) {
                t0Var.a();
                u0Var.f11737n = null;
            }
            r0 r0Var = u0Var.f11739s;
            if (r0Var != null) {
                r0Var.a(true);
                u0Var.f11739s = null;
            }
            if (q9Var != null) {
                u0Var.e = true;
                q9Var.run(new o0(u0Var, 0));
            }
            u0Var.d();
            if (q9Var == null) {
                u0Var.b();
            }
        }
    }

    public final void b() {
        w7 w7Var;
        if (this.e && (w7Var = this.f11738r) != null) {
            this.e = false;
            if (w7Var.E()) {
                this.d = true;
                t0 t0Var = new t0(getContext());
                this.f11737n = t0Var;
                t0Var.setOnCancelListener(new o0(this, 1));
                this.f11734b.addView(this.f11737n);
                File generateVideoPath = AndroidUtilities.generateVideoPath();
                this.f11739s = new r0(this.f11733a, this.f11738r, generateVideoPath, new p0(this, generateVideoPath, 0), new q0(this, 0), new o0(this, 2));
            } else {
                this.d = false;
                File generatePicturePath = AndroidUtilities.generatePicturePath(false, "png");
                if (generatePicturePath == null) {
                    this.f11737n.b(R.raw.error, 3500, LocaleController.getString("UnknownError"));
                    this.f11735c = false;
                    d();
                    return;
                }
                Utilities.themeQueue.postRunnable(new p0(this, generatePicturePath, 1));
            }
            d();
        }
    }

    public final void c(int i10, String str) {
        t0 t0Var = this.f11737n;
        if (t0Var != null) {
            t0Var.a();
            this.f11737n = null;
        }
        t0 t0Var2 = new t0(getContext());
        this.f11737n = t0Var2;
        t0Var2.b(i10, 3500, str);
        this.f11734b.addView(this.f11737n);
    }

    public final void d() {
        boolean z10;
        boolean z11;
        float f7;
        boolean z12;
        boolean z13 = this.f11740w;
        boolean z14 = this.f11735c;
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
            this.f11740w = z12;
            if (z12) {
                AndroidUtilities.updateImageViewImageAnimated(this, this.f11736f);
            } else {
                AndroidUtilities.updateImageViewImageAnimated(this, R.drawable.media_download);
            }
        }
        boolean z16 = this.f11741x;
        if (this.f11735c && this.d) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z16 != z11) {
            clearAnimation();
            ViewPropertyAnimator animate = animate();
            if (this.f11735c && this.d) {
                z15 = true;
            }
            this.f11741x = z15;
            if (z15) {
                f7 = 0.4f;
            } else {
                f7 = 1.0f;
            }
            animate.alpha(f7).start();
        }
    }

    public void setEntry(w7 w7Var) {
        this.v = null;
        this.f11738r = w7Var;
        r0 r0Var = this.f11739s;
        if (r0Var != null) {
            r0Var.a(true);
            this.f11739s = null;
        }
        t0 t0Var = this.f11737n;
        if (t0Var != null) {
            t0Var.a();
            this.f11737n = null;
        }
        if (w7Var == null) {
            this.f11735c = false;
            d();
        }
    }
}
