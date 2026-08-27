package lh;

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
import org.telegram.ui.Components.hp;

public final class u0 extends ImageView {

    public int f16886a;

    public FrameLayout f16887b;

    public boolean f16888c;
    public boolean d;

    public boolean f16889e;

    public hp f16890f;
    public t9 h;

    public t0 f16891n;

    public z7 f16892r;

    public r0 f16893s;
    public Uri v;

    public boolean f16894w;

    public boolean f16895x;

    public static void a(u0 u0Var) {
        t9 t9Var = u0Var.h;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23 && ((i10 <= 28 || BuildVars.NO_SCOPED_STORAGE) && u0Var.getContext().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
            Activity activityFindActivity = AndroidUtilities.findActivity(u0Var.getContext());
            if (activityFindActivity != null) {
                activityFindActivity.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 113);
                return;
            }
            return;
        }
        if (u0Var.f16888c || u0Var.f16892r == null) {
            return;
        }
        if (u0Var.v != null) {
            if (i10 >= 30) {
                u0Var.getContext().getContentResolver().delete(u0Var.v, null);
                u0Var.v = null;
            } else if (i10 < 29) {
                try {
                    new File(u0Var.v.toString()).delete();
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
                u0Var.v = null;
            }
        }
        u0Var.f16888c = true;
        t0 t0Var = u0Var.f16891n;
        if (t0Var != null) {
            t0Var.a();
            u0Var.f16891n = null;
        }
        r0 r0Var = u0Var.f16893s;
        if (r0Var != null) {
            r0Var.a(true);
            u0Var.f16893s = null;
        }
        if (t9Var != null) {
            u0Var.f16889e = true;
            t9Var.run(new o0(u0Var, 0));
        }
        u0Var.d();
        if (t9Var == null) {
            u0Var.b();
        }
    }

    public final void b() {
        z7 z7Var;
        if (!this.f16889e || (z7Var = this.f16892r) == null) {
            return;
        }
        this.f16889e = false;
        if (z7Var.E()) {
            this.d = true;
            t0 t0Var = new t0(getContext());
            this.f16891n = t0Var;
            t0Var.setOnCancelListener(new o0(this, 1));
            this.f16887b.addView(this.f16891n);
            File fileGenerateVideoPath = AndroidUtilities.generateVideoPath();
            this.f16893s = new r0(this.f16886a, this.f16892r, fileGenerateVideoPath, new p0(this, fileGenerateVideoPath, 0), new q0(this, 0), new o0(this, 2));
        } else {
            this.d = false;
            File fileGeneratePicturePath = AndroidUtilities.generatePicturePath(false, "png");
            if (fileGeneratePicturePath == null) {
                this.f16891n.b(R.raw.error, 3500, LocaleController.getString("UnknownError"));
                this.f16888c = false;
                d();
                return;
            }
            Utilities.themeQueue.postRunnable(new p0(this, fileGeneratePicturePath, 1));
        }
        d();
    }

    public final void c(int i10, String str) {
        t0 t0Var = this.f16891n;
        if (t0Var != null) {
            t0Var.a();
            this.f16891n = null;
        }
        t0 t0Var2 = new t0(getContext());
        this.f16891n = t0Var2;
        t0Var2.b(i10, 3500, str);
        this.f16887b.addView(this.f16891n);
    }

    public final void d() {
        boolean z10 = this.f16894w;
        boolean z11 = this.f16888c;
        boolean z12 = false;
        if (z10 != (z11 && !this.d)) {
            boolean z13 = z11 && !this.d;
            this.f16894w = z13;
            if (z13) {
                AndroidUtilities.updateImageViewImageAnimated(this, this.f16890f);
            } else {
                AndroidUtilities.updateImageViewImageAnimated(this, R.drawable.media_download);
            }
        }
        if (this.f16895x != (this.f16888c && this.d)) {
            clearAnimation();
            ViewPropertyAnimator viewPropertyAnimatorAnimate = animate();
            if (this.f16888c && this.d) {
                z12 = true;
            }
            this.f16895x = z12;
            viewPropertyAnimatorAnimate.alpha(z12 ? 0.4f : 1.0f).start();
        }
    }

    public void setEntry(z7 z7Var) {
        this.v = null;
        this.f16892r = z7Var;
        r0 r0Var = this.f16893s;
        if (r0Var != null) {
            r0Var.a(true);
            this.f16893s = null;
        }
        t0 t0Var = this.f16891n;
        if (t0Var != null) {
            t0Var.a();
            this.f16891n = null;
        }
        if (z7Var == null) {
            this.f16888c = false;
            d();
        }
    }
}
