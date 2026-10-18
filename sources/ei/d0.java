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
    public int f8868a;
    public final org.telegram.ui.Components.f6 f8869b;
    public final ImageReceiver f8870c;
    public c0 d;
    public TextureView e;
    public boolean f8871f;
    public s h;
    public boolean f8877m;
    public a8 f8878n;
    public ValueAnimator f8879o;
    public final e0 f8880p;
    public volatile long f8872g = -1;
    public boolean f8873i = false;
    public final RectF f8874j = new RectF();
    public final RectF f8875k = new RectF();
    public float f8876l = 1.0f;

    public d0(e0 e0Var) {
        this.f8880p = e0Var;
        this.f8869b = new org.telegram.ui.Components.f6(e0Var, 0L, 1200L, bs.f25038g);
        this.f8870c = new ImageReceiver(e0Var);
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
        this.f8871f = false;
        this.f8878n = a8Var;
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
        a8 a8Var2 = this.f8878n;
        e0 e0Var = this.f8880p;
        ImageReceiver imageReceiver = this.f8870c;
        if (a8Var2 == null) {
            imageReceiver.clearImage();
        } else if (a8Var2.K) {
            Bitmap bitmap = a8Var2.M0;
            if (bitmap != null) {
                imageReceiver.setImageBitmap(bitmap);
            } else {
                Bitmap bitmap2 = a8Var2.f8702b1;
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
            this.d.preparePlayer(Uri.fromFile(this.f8878n.L), false, 1.0f);
            c0 c0Var3 = this.d;
            if (!e0Var.f8946v0) {
                a8 a8Var3 = this.f8878n;
                if (!a8Var3.Y && e0Var.f8936n0) {
                    f7 = a8Var3.P;
                    c0Var3.setVolume(f7);
                    if (!e0Var.f8936n0 && !e0Var.f8939q0) {
                        this.d.pause();
                    } else {
                        this.d.play();
                    }
                }
            }
            f7 = 0.0f;
            c0Var3.setVolume(f7);
            if (!e0Var.f8936n0) {
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
        ValueAnimator valueAnimator = this.f8879o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f8879o = null;
        }
        RectF rectF = this.f8875k;
        e0 e0Var = this.f8880p;
        if (z10) {
            boolean z11 = this.f8873i;
            RectF rectF2 = this.f8874j;
            if (!z11) {
                e0.b(e0Var, rectF2, sVar);
            } else {
                AndroidUtilities.lerp(rectF2, rectF, this.f8876l, rectF2);
            }
            if (sVar == null) {
                e0.b(e0Var, rectF, sVar2);
            } else {
                e0Var.k(rectF, sVar);
            }
            this.f8876l = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f8879o = ofFloat;
            ofFloat.addUpdateListener(new ci.v4(this, 2));
            this.f8879o.addListener(new ah.b(this, 17));
            this.f8879o.setInterpolator(bs.h);
            this.f8879o.setDuration(360L);
            this.f8879o.start();
        } else {
            e0Var.k(rectF, sVar);
            this.f8876l = 1.0f;
        }
        e0Var.invalidate();
        this.f8873i = true;
    }
}
