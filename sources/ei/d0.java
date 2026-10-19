package ei;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.bs;
public final class d0 {
    public int f8867a;
    public final org.telegram.ui.Components.f6 f8868b;
    public final ImageReceiver f8869c;
    public c0 d;
    public TextureView e;
    public boolean f8870f;
    public s h;
    public boolean f8876m;
    public a8 f8877n;
    public ValueAnimator f8878o;
    public final e0 f8879p;
    public volatile long f8871g = -1;
    public boolean f8872i = false;
    public final RectF f8873j = new RectF();
    public final RectF f8874k = new RectF();
    public float f8875l = 1.0f;

    public d0(e0 e0Var) {
        this.f8879p = e0Var;
        this.f8868b = new org.telegram.ui.Components.f6(e0Var, 0L, 1200L, bs.f25015g);
        this.f8869c = new ImageReceiver(e0Var);
    }

    public final void a(a8 a8Var) {
        String str;
        float f7;
        c0 c0Var = this.d;
        if (c0Var != null) {
            c0Var.pause();
            this.d.release(null);
            this.d = null;
        }
        TextureView textureView = this.e;
        if (textureView != null) {
            AndroidUtilities.removeFromParent(textureView);
            this.e = null;
        }
        this.f8870f = false;
        this.f8877n = a8Var;
        StringBuilder sb2 = new StringBuilder();
        sb2.append((int) Math.ceil(AndroidUtilities.displaySize.x / AndroidUtilities.density));
        sb2.append("_");
        sb2.append((int) Math.ceil(AndroidUtilities.displaySize.y / AndroidUtilities.density));
        if (a8Var != null && a8Var.K) {
            str = "_g";
        } else {
            str = "";
        }
        String s10 = a1.g.s(sb2, str, "_exif");
        a8 a8Var2 = this.f8877n;
        e0 e0Var = this.f8879p;
        ImageReceiver imageReceiver = this.f8869c;
        if (a8Var2 == null) {
            imageReceiver.clearImage();
        } else if (a8Var2.K) {
            Bitmap bitmap = a8Var2.M0;
            if (bitmap != null) {
                imageReceiver.setImageBitmap(bitmap);
            } else {
                Bitmap bitmap2 = a8Var2.f8701b1;
                if (bitmap2 != null) {
                    imageReceiver.setImageBitmap(bitmap2);
                } else {
                    String str2 = a8Var2.N;
                    if (str2 != null) {
                        imageReceiver.setImage(str2, s10, null, null, 0L);
                    } else {
                        imageReceiver.clearImage();
                    }
                }
            }
            TextureView textureView2 = new TextureView(e0Var.getContext());
            this.e = textureView2;
            e0Var.addView(textureView2);
            c0 c0Var2 = new c0(this, 0);
            this.d = c0Var2;
            c0Var2.allowMultipleInstances(true);
            this.d.with(this.e);
            this.d.preparePlayer(Uri.fromFile(this.f8877n.L), false, 1.0f);
            c0 c0Var3 = this.d;
            if (!e0Var.f8945v0) {
                a8 a8Var3 = this.f8877n;
                if (!a8Var3.Y && e0Var.f8935n0) {
                    f7 = a8Var3.P;
                    c0Var3.setVolume(f7);
                    if (!e0Var.f8935n0 && !e0Var.f8938q0) {
                        this.d.pause();
                    } else {
                        this.d.play();
                    }
                }
            }
            f7 = 0.0f;
            c0Var3.setVolume(f7);
            if (!e0Var.f8935n0) {
            }
            this.d.play();
        } else {
            imageReceiver.setImage(a8Var2.L.getAbsolutePath(), s10, null, null, 0L);
        }
        e0Var.invalidate();
    }

    public final void b(s sVar, boolean z10) {
        s sVar2 = this.h;
        if (sVar != null) {
            this.h = sVar;
        }
        ValueAnimator valueAnimator = this.f8878o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f8878o = null;
        }
        RectF rectF = this.f8874k;
        e0 e0Var = this.f8879p;
        if (z10) {
            boolean z11 = this.f8872i;
            RectF rectF2 = this.f8873j;
            if (!z11) {
                e0.b(e0Var, rectF2, sVar);
            } else {
                AndroidUtilities.lerp(rectF2, rectF, this.f8875l, rectF2);
            }
            if (sVar == null) {
                e0.b(e0Var, rectF, sVar2);
            } else {
                e0Var.k(rectF, sVar);
            }
            this.f8875l = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f8878o = ofFloat;
            ofFloat.addUpdateListener(new ci.v4(this, 2));
            this.f8878o.addListener(new ah.b(this, 17));
            this.f8878o.setInterpolator(bs.h);
            this.f8878o.setDuration(360L);
            this.f8878o.start();
        } else {
            e0Var.k(rectF, sVar);
            this.f8875l = 1.0f;
        }
        e0Var.invalidate();
        this.f8872i = true;
    }
}
