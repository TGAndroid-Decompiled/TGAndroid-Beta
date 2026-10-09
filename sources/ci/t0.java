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
import org.telegram.ui.Components.jq;
public final class t0 extends ImageView {
    public int f5978a;
    public FrameLayout f5979b;
    public boolean f5980c;
    public boolean d;
    public boolean f5981e;
    public jq f5982f;
    public ia h;
    public s0 f5983n;
    public l8 f5984r;
    public q0 f5985s;
    public Uri v;
    public boolean f5986w;
    public boolean f5987x;

    public static void a(t0 t0Var) {
        ia iaVar = t0Var.h;
        int i10 = Build.VERSION.SDK_INT;
        if ((i10 <= 28 || BuildVars.NO_SCOPED_STORAGE) && t0Var.getContext().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            Activity findActivity = AndroidUtilities.findActivity(t0Var.getContext());
            if (findActivity != null) {
                findActivity.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 113);
            }
        } else if (!t0Var.f5980c && t0Var.f5984r != null) {
            if (t0Var.v != null) {
                if (i10 >= 30) {
                    t0Var.getContext().getContentResolver().delete(t0Var.v, null);
                    t0Var.v = null;
                } else if (i10 < 29) {
                    try {
                        new File(t0Var.v.toString()).delete();
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                    t0Var.v = null;
                }
            }
            t0Var.f5980c = true;
            s0 s0Var = t0Var.f5983n;
            if (s0Var != null) {
                s0Var.a();
                t0Var.f5983n = null;
            }
            q0 q0Var = t0Var.f5985s;
            if (q0Var != null) {
                q0Var.a(true);
                t0Var.f5985s = null;
            }
            if (iaVar != null) {
                t0Var.f5981e = true;
                iaVar.run(new n0(t0Var, 0));
            }
            t0Var.d();
            if (iaVar == null) {
                t0Var.b();
            }
        }
    }

    public final void b() {
        l8 l8Var;
        if (this.f5981e && (l8Var = this.f5984r) != null) {
            this.f5981e = false;
            if (l8Var.E()) {
                this.d = true;
                s0 s0Var = new s0(getContext());
                this.f5983n = s0Var;
                s0Var.setOnCancelListener(new n0(this, 1));
                this.f5979b.addView(this.f5983n);
                File generateVideoPath = AndroidUtilities.generateVideoPath();
                this.f5985s = new q0(this.f5978a, this.f5984r, generateVideoPath, new o0(this, generateVideoPath, 0), new p0(this, 0), new n0(this, 2));
            } else {
                this.d = false;
                File generatePicturePath = AndroidUtilities.generatePicturePath(false, "png");
                if (generatePicturePath == null) {
                    this.f5983n.b(R.raw.error, 3500, LocaleController.getString("UnknownError"));
                    this.f5980c = false;
                    d();
                    return;
                }
                Utilities.themeQueue.postRunnable(new o0(this, generatePicturePath, 1));
            }
            d();
        }
    }

    public final void c(int i10, String str) {
        s0 s0Var = this.f5983n;
        if (s0Var != null) {
            s0Var.a();
            this.f5983n = null;
        }
        s0 s0Var2 = new s0(getContext());
        this.f5983n = s0Var2;
        s0Var2.b(i10, 3500, str);
        this.f5979b.addView(this.f5983n);
    }

    public final void d() {
        boolean z10;
        boolean z11;
        float f7;
        boolean z12;
        boolean z13 = this.f5986w;
        boolean z14 = this.f5980c;
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
            this.f5986w = z12;
            if (z12) {
                AndroidUtilities.updateImageViewImageAnimated(this, this.f5982f);
            } else {
                AndroidUtilities.updateImageViewImageAnimated(this, R.drawable.media_download);
            }
        }
        boolean z16 = this.f5987x;
        if (this.f5980c && this.d) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z16 != z11) {
            clearAnimation();
            ViewPropertyAnimator animate = animate();
            if (this.f5980c && this.d) {
                z15 = true;
            }
            this.f5987x = z15;
            if (z15) {
                f7 = 0.4f;
            } else {
                f7 = 1.0f;
            }
            animate.alpha(f7).start();
        }
    }

    public void setEntry(l8 l8Var) {
        this.v = null;
        this.f5984r = l8Var;
        q0 q0Var = this.f5985s;
        if (q0Var != null) {
            q0Var.a(true);
            this.f5985s = null;
        }
        s0 s0Var = this.f5983n;
        if (s0Var != null) {
            s0Var.a();
            this.f5983n = null;
        }
        if (l8Var == null) {
            this.f5980c = false;
            d();
        }
    }
}
