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
    public int f11732a;
    public FrameLayout f11733b;
    public boolean f11734c;
    public boolean d;
    public boolean e;
    public gq f11735f;
    public q9 h;
    public t0 f11736n;
    public w7 f11737r;
    public r0 f11738s;
    public Uri v;
    public boolean f11739w;
    public boolean f11740x;

    public static void a(u0 u0Var) {
        q9 q9Var = u0Var.h;
        int i10 = Build.VERSION.SDK_INT;
        if ((i10 <= 28 || BuildVars.NO_SCOPED_STORAGE) && u0Var.getContext().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            Activity findActivity = AndroidUtilities.findActivity(u0Var.getContext());
            if (findActivity != null) {
                findActivity.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 113);
            }
        } else if (!u0Var.f11734c && u0Var.f11737r != null) {
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
            u0Var.f11734c = true;
            t0 t0Var = u0Var.f11736n;
            if (t0Var != null) {
                t0Var.a();
                u0Var.f11736n = null;
            }
            r0 r0Var = u0Var.f11738s;
            if (r0Var != null) {
                r0Var.a(true);
                u0Var.f11738s = null;
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
        if (this.e && (w7Var = this.f11737r) != null) {
            this.e = false;
            if (w7Var.E()) {
                this.d = true;
                t0 t0Var = new t0(getContext());
                this.f11736n = t0Var;
                t0Var.setOnCancelListener(new o0(this, 1));
                this.f11733b.addView(this.f11736n);
                File generateVideoPath = AndroidUtilities.generateVideoPath();
                this.f11738s = new r0(this.f11732a, this.f11737r, generateVideoPath, new p0(this, generateVideoPath, 0), new q0(this, 0), new o0(this, 2));
            } else {
                this.d = false;
                File generatePicturePath = AndroidUtilities.generatePicturePath(false, "png");
                if (generatePicturePath == null) {
                    this.f11736n.b(R.raw.error, 3500, LocaleController.getString("UnknownError"));
                    this.f11734c = false;
                    d();
                    return;
                }
                Utilities.themeQueue.postRunnable(new p0(this, generatePicturePath, 1));
            }
            d();
        }
    }

    public final void c(int i10, String str) {
        t0 t0Var = this.f11736n;
        if (t0Var != null) {
            t0Var.a();
            this.f11736n = null;
        }
        t0 t0Var2 = new t0(getContext());
        this.f11736n = t0Var2;
        t0Var2.b(i10, 3500, str);
        this.f11733b.addView(this.f11736n);
    }

    public final void d() {
        boolean z10;
        boolean z11;
        float f7;
        boolean z12;
        boolean z13 = this.f11739w;
        boolean z14 = this.f11734c;
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
            this.f11739w = z12;
            if (z12) {
                AndroidUtilities.updateImageViewImageAnimated(this, this.f11735f);
            } else {
                AndroidUtilities.updateImageViewImageAnimated(this, R.drawable.media_download);
            }
        }
        boolean z16 = this.f11740x;
        if (this.f11734c && this.d) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z16 != z11) {
            clearAnimation();
            ViewPropertyAnimator animate = animate();
            if (this.f11734c && this.d) {
                z15 = true;
            }
            this.f11740x = z15;
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
        this.f11737r = w7Var;
        r0 r0Var = this.f11738s;
        if (r0Var != null) {
            r0Var.a(true);
            this.f11738s = null;
        }
        t0 t0Var = this.f11736n;
        if (t0Var != null) {
            t0Var.a();
            this.f11736n = null;
        }
        if (w7Var == null) {
            this.f11734c = false;
            d();
        }
    }
}
