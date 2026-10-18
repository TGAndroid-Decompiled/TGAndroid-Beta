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
    public int f8866a;
    public final org.telegram.ui.Components.f6 f8867b;
    public final ImageReceiver f8868c;
    public c0 d;
    public TextureView e;
    public boolean f8869f;
    public s h;
    public boolean f8875m;
    public a8 f8876n;
    public ValueAnimator f8877o;
    public final e0 f8878p;
    public volatile long f8870g = -1;
    public boolean f8871i = false;
    public final RectF f8872j = new RectF();
    public final RectF f8873k = new RectF();
    public float f8874l = 1.0f;

    public d0(e0 e0Var) {
        this.f8878p = e0Var;
        this.f8867b = new org.telegram.ui.Components.f6(e0Var, 0L, 1200L, bs.f25031g);
        this.f8868c = new ImageReceiver(e0Var);
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
        this.f8869f = false;
        this.f8876n = a8Var;
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
        a8 a8Var2 = this.f8876n;
        e0 e0Var = this.f8878p;
        ImageReceiver imageReceiver = this.f8868c;
        if (a8Var2 == null) {
            imageReceiver.clearImage();
        } else if (a8Var2.K) {
            Bitmap bitmap = a8Var2.M0;
            if (bitmap != null) {
                imageReceiver.setImageBitmap(bitmap);
            } else {
                Bitmap bitmap2 = a8Var2.f8700b1;
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
            this.d.preparePlayer(Uri.fromFile(this.f8876n.L), false, 1.0f);
            c0 c0Var3 = this.d;
            if (!e0Var.f8944v0) {
                a8 a8Var3 = this.f8876n;
                if (!a8Var3.Y && e0Var.f8934n0) {
                    f7 = a8Var3.P;
                    c0Var3.setVolume(f7);
                    if (!e0Var.f8934n0 && !e0Var.f8937q0) {
                        this.d.pause();
                    } else {
                        this.d.play();
                    }
                }
            }
            f7 = 0.0f;
            c0Var3.setVolume(f7);
            if (!e0Var.f8934n0) {
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
        ValueAnimator valueAnimator = this.f8877o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f8877o = null;
        }
        RectF rectF = this.f8873k;
        e0 e0Var = this.f8878p;
        if (z10) {
            boolean z11 = this.f8871i;
            RectF rectF2 = this.f8872j;
            if (!z11) {
                e0.b(e0Var, rectF2, sVar);
            } else {
                AndroidUtilities.lerp(rectF2, rectF, this.f8874l, rectF2);
            }
            if (sVar == null) {
                e0.b(e0Var, rectF, sVar2);
            } else {
                e0Var.k(rectF, sVar);
            }
            this.f8874l = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f8877o = ofFloat;
            ofFloat.addUpdateListener(new ci.u4(this, 2));
            this.f8877o.addListener(new ah.b(this, 17));
            this.f8877o.setInterpolator(bs.h);
            this.f8877o.setDuration(360L);
            this.f8877o.start();
        } else {
            e0Var.k(rectF, sVar);
            this.f8874l = 1.0f;
        }
        e0Var.invalidate();
        this.f8871i = true;
    }
}
