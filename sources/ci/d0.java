package ci;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.is;
public final class d0 {
    public int f4878a;
    public final org.telegram.ui.Components.g6 f4879b;
    public final ImageReceiver f4880c;
    public c0 d;
    public TextureView f4881e;
    public boolean f4882f;
    public s h;
    public boolean f4888m;
    public l8 f4889n;
    public ValueAnimator f4890o;
    public final e0 f4891p;
    public volatile long f4883g = -1;
    public boolean f4884i = false;
    public final RectF f4885j = new RectF();
    public final RectF f4886k = new RectF();
    public float f4887l = 1.0f;

    public d0(e0 e0Var) {
        this.f4891p = e0Var;
        this.f4879b = new org.telegram.ui.Components.g6(e0Var, 0L, 1200L, is.f27501g);
        this.f4880c = new ImageReceiver(e0Var);
    }

    public final void a(l8 l8Var) {
        String str;
        float f7;
        c0 c0Var = this.d;
        if (c0Var != null) {
            c0Var.pause();
            this.d.release(null);
            this.d = null;
        }
        TextureView textureView = this.f4881e;
        if (textureView != null) {
            AndroidUtilities.removeFromParent(textureView);
            this.f4881e = null;
        }
        this.f4882f = false;
        this.f4889n = l8Var;
        StringBuilder sb2 = new StringBuilder();
        sb2.append((int) Math.ceil(AndroidUtilities.displaySize.x / AndroidUtilities.density));
        sb2.append("_");
        sb2.append((int) Math.ceil(AndroidUtilities.displaySize.y / AndroidUtilities.density));
        if (l8Var != null && l8Var.K) {
            str = "_g";
        } else {
            str = "";
        }
        String t10 = a1.g.t(sb2, str, "_exif");
        l8 l8Var2 = this.f4889n;
        e0 e0Var = this.f4891p;
        ImageReceiver imageReceiver = this.f4880c;
        if (l8Var2 == null) {
            imageReceiver.clearImage();
        } else if (l8Var2.K) {
            Bitmap bitmap = l8Var2.M0;
            if (bitmap != null) {
                imageReceiver.setImageBitmap(bitmap);
            } else {
                Bitmap bitmap2 = l8Var2.f5398b1;
                if (bitmap2 != null) {
                    imageReceiver.setImageBitmap(bitmap2);
                } else {
                    String str2 = l8Var2.N;
                    if (str2 != null) {
                        imageReceiver.setImage(str2, t10, null, null, 0L);
                    } else {
                        imageReceiver.clearImage();
                    }
                }
            }
            TextureView textureView2 = new TextureView(e0Var.getContext());
            this.f4881e = textureView2;
            e0Var.addView(textureView2);
            c0 c0Var2 = new c0(this, 0);
            this.d = c0Var2;
            c0Var2.allowMultipleInstances(true);
            this.d.with(this.f4881e);
            this.d.preparePlayer(Uri.fromFile(this.f4889n.L), false, 1.0f);
            c0 c0Var3 = this.d;
            if (!e0Var.f5016v0) {
                l8 l8Var3 = this.f4889n;
                if (!l8Var3.Y && e0Var.f5006n0) {
                    f7 = l8Var3.P;
                    c0Var3.setVolume(f7);
                    if (!e0Var.f5006n0 && !e0Var.f5009q0) {
                        this.d.pause();
                    } else {
                        this.d.play();
                    }
                }
            }
            f7 = 0.0f;
            c0Var3.setVolume(f7);
            if (!e0Var.f5006n0) {
            }
            this.d.play();
        } else {
            imageReceiver.setImage(l8Var2.L.getAbsolutePath(), t10, null, null, 0L);
        }
        e0Var.invalidate();
    }

    public final void b(s sVar, boolean z10) {
        s sVar2 = this.h;
        if (sVar != null) {
            this.h = sVar;
        }
        ValueAnimator valueAnimator = this.f4890o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f4890o = null;
        }
        RectF rectF = this.f4886k;
        e0 e0Var = this.f4891p;
        if (z10) {
            boolean z11 = this.f4884i;
            RectF rectF2 = this.f4885j;
            if (!z11) {
                e0.c(e0Var, rectF2, sVar);
            } else {
                AndroidUtilities.lerp(rectF2, rectF, this.f4887l, rectF2);
            }
            if (sVar == null) {
                e0.c(e0Var, rectF, sVar2);
            } else {
                e0Var.k(rectF, sVar);
            }
            this.f4887l = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f4890o = ofFloat;
            ofFloat.addUpdateListener(new ai.l6(this, 2));
            this.f4890o.addListener(new ai.b(this, 12));
            this.f4890o.setInterpolator(is.h);
            this.f4890o.setDuration(360L);
            this.f4890o.start();
        } else {
            e0Var.k(rectF, sVar);
            this.f4887l = 1.0f;
        }
        e0Var.invalidate();
        this.f4884i = true;
    }
}
