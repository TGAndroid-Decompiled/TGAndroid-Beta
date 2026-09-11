package di;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.pr;
public final class d0 {
    public int f7025a;
    public final org.telegram.ui.Components.e6 f7026b;
    public final ImageReceiver f7027c;
    public c0 d;
    public TextureView f7028e;
    public boolean f7029f;
    public s h;
    public boolean f7035m;
    public o8 f7036n;
    public ValueAnimator f7037o;
    public final e0 f7038p;
    public volatile long f7030g = -1;
    public boolean f7031i = false;
    public final RectF f7032j = new RectF();
    public final RectF f7033k = new RectF();
    public float f7034l = 1.0f;

    public d0(e0 e0Var) {
        this.f7038p = e0Var;
        this.f7026b = new org.telegram.ui.Components.e6(e0Var, 0L, 1200L, pr.f29467g);
        this.f7027c = new ImageReceiver(e0Var);
    }

    public final void a(o8 o8Var) {
        String str;
        float f7;
        c0 c0Var = this.d;
        if (c0Var != null) {
            c0Var.pause();
            this.d.release(null);
            this.d = null;
        }
        TextureView textureView = this.f7028e;
        if (textureView != null) {
            AndroidUtilities.removeFromParent(textureView);
            this.f7028e = null;
        }
        this.f7029f = false;
        this.f7036n = o8Var;
        StringBuilder sb2 = new StringBuilder();
        sb2.append((int) Math.ceil(AndroidUtilities.displaySize.x / AndroidUtilities.density));
        sb2.append("_");
        sb2.append((int) Math.ceil(AndroidUtilities.displaySize.y / AndroidUtilities.density));
        if (o8Var != null && o8Var.K) {
            str = "_g";
        } else {
            str = "";
        }
        String s10 = a4.a.s(sb2, str, "_exif");
        o8 o8Var2 = this.f7036n;
        e0 e0Var = this.f7038p;
        ImageReceiver imageReceiver = this.f7027c;
        if (o8Var2 == null) {
            imageReceiver.clearImage();
        } else if (o8Var2.K) {
            Bitmap bitmap = o8Var2.M0;
            if (bitmap != null) {
                imageReceiver.setImageBitmap(bitmap);
            } else {
                Bitmap bitmap2 = o8Var2.f7745b1;
                if (bitmap2 != null) {
                    imageReceiver.setImageBitmap(bitmap2);
                } else {
                    String str2 = o8Var2.N;
                    if (str2 != null) {
                        imageReceiver.setImage(str2, s10, null, null, 0L);
                    } else {
                        imageReceiver.clearImage();
                    }
                }
            }
            TextureView textureView2 = new TextureView(e0Var.getContext());
            this.f7028e = textureView2;
            e0Var.addView(textureView2);
            c0 c0Var2 = new c0(this, 0);
            this.d = c0Var2;
            c0Var2.allowMultipleInstances(true);
            this.d.with(this.f7028e);
            this.d.preparePlayer(Uri.fromFile(this.f7036n.L), false, 1.0f);
            c0 c0Var3 = this.d;
            if (!e0Var.f7147v0) {
                o8 o8Var3 = this.f7036n;
                if (!o8Var3.Y && e0Var.f7137n0) {
                    f7 = o8Var3.P;
                    c0Var3.setVolume(f7);
                    if (!e0Var.f7137n0 && !e0Var.f7140q0) {
                        this.d.pause();
                    } else {
                        this.d.play();
                    }
                }
            }
            f7 = 0.0f;
            c0Var3.setVolume(f7);
            if (!e0Var.f7137n0) {
            }
            this.d.play();
        } else {
            imageReceiver.setImage(o8Var2.L.getAbsolutePath(), s10, null, null, 0L);
        }
        e0Var.invalidate();
    }

    public final void b(s sVar, boolean z10) {
        s sVar2 = this.h;
        if (sVar != null) {
            this.h = sVar;
        }
        ValueAnimator valueAnimator = this.f7037o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f7037o = null;
        }
        RectF rectF = this.f7033k;
        e0 e0Var = this.f7038p;
        if (z10) {
            boolean z11 = this.f7031i;
            RectF rectF2 = this.f7032j;
            if (!z11) {
                e0.b(e0Var, rectF2, sVar);
            } else {
                AndroidUtilities.lerp(rectF2, rectF, this.f7034l, rectF2);
            }
            if (sVar == null) {
                e0.b(e0Var, rectF, sVar2);
            } else {
                e0Var.k(rectF, sVar);
            }
            this.f7034l = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f7037o = ofFloat;
            ofFloat.addUpdateListener(new bi.u5(this, 2));
            this.f7037o.addListener(new ah.b(this, 15));
            this.f7037o.setInterpolator(pr.h);
            this.f7037o.setDuration(360L);
            this.f7037o.start();
        } else {
            e0Var.k(rectF, sVar);
            this.f7034l = 1.0f;
        }
        e0Var.invalidate();
        this.f7031i = true;
    }
}
