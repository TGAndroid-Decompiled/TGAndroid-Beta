package ci;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.sr;
public final class d0 {
    public int f4505a;
    public final org.telegram.ui.Components.e6 f4506b;
    public final ImageReceiver f4507c;
    public c0 d;
    public TextureView e;
    public boolean f4508f;
    public s h;
    public boolean f4514m;
    public k8 f4515n;
    public ValueAnimator f4516o;
    public final e0 f4517p;
    public volatile long f4509g = -1;
    public boolean f4510i = false;
    public final RectF f4511j = new RectF();
    public final RectF f4512k = new RectF();
    public float f4513l = 1.0f;

    public d0(e0 e0Var) {
        this.f4517p = e0Var;
        this.f4506b = new org.telegram.ui.Components.e6(e0Var, 0L, 1200L, sr.f28360g);
        this.f4507c = new ImageReceiver(e0Var);
    }

    public final void a(k8 k8Var) {
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
        this.f4508f = false;
        this.f4515n = k8Var;
        StringBuilder sb2 = new StringBuilder();
        sb2.append((int) Math.ceil(AndroidUtilities.displaySize.x / AndroidUtilities.density));
        sb2.append("_");
        sb2.append((int) Math.ceil(AndroidUtilities.displaySize.y / AndroidUtilities.density));
        if (k8Var != null && k8Var.K) {
            str = "_g";
        } else {
            str = "";
        }
        String s10 = a4.a.s(sb2, str, "_exif");
        k8 k8Var2 = this.f4515n;
        e0 e0Var = this.f4517p;
        ImageReceiver imageReceiver = this.f4507c;
        if (k8Var2 == null) {
            imageReceiver.clearImage();
        } else if (k8Var2.K) {
            Bitmap bitmap = k8Var2.M0;
            if (bitmap != null) {
                imageReceiver.setImageBitmap(bitmap);
            } else {
                Bitmap bitmap2 = k8Var2.f4925b1;
                if (bitmap2 != null) {
                    imageReceiver.setImageBitmap(bitmap2);
                } else {
                    String str2 = k8Var2.N;
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
            this.d.preparePlayer(Uri.fromFile(this.f4515n.L), false, 1.0f);
            c0 c0Var3 = this.d;
            if (!e0Var.f4597v0) {
                k8 k8Var3 = this.f4515n;
                if (!k8Var3.Y && e0Var.f4587n0) {
                    f7 = k8Var3.P;
                    c0Var3.setVolume(f7);
                    if (!e0Var.f4587n0 && !e0Var.f4590q0) {
                        this.d.pause();
                    } else {
                        this.d.play();
                    }
                }
            }
            f7 = 0.0f;
            c0Var3.setVolume(f7);
            if (!e0Var.f4587n0) {
            }
            this.d.play();
        } else {
            imageReceiver.setImage(k8Var2.L.getAbsolutePath(), s10, null, null, 0L);
        }
        e0Var.invalidate();
    }

    public final void b(s sVar, boolean z10) {
        s sVar2 = this.h;
        if (sVar != null) {
            this.h = sVar;
        }
        ValueAnimator valueAnimator = this.f4516o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f4516o = null;
        }
        RectF rectF = this.f4512k;
        e0 e0Var = this.f4517p;
        if (z10) {
            boolean z11 = this.f4510i;
            RectF rectF2 = this.f4511j;
            if (!z11) {
                e0.c(e0Var, rectF2, sVar);
            } else {
                AndroidUtilities.lerp(rectF2, rectF, this.f4513l, rectF2);
            }
            if (sVar == null) {
                e0.c(e0Var, rectF, sVar2);
            } else {
                e0Var.k(rectF, sVar);
            }
            this.f4513l = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f4516o = ofFloat;
            ofFloat.addUpdateListener(new ai.k6(this, 2));
            this.f4516o.addListener(new ai.b(this, 12));
            this.f4516o.setInterpolator(sr.h);
            this.f4516o.setDuration(360L);
            this.f4516o.start();
        } else {
            e0Var.k(rectF, sVar);
            this.f4513l = 1.0f;
        }
        e0Var.invalidate();
        this.f4510i = true;
    }
}
