package nh;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.jr;
public final class d0 {
    public int f17504a;
    public final org.telegram.ui.Components.d6 f17505b;
    public final ImageReceiver f17506c;
    public cg.v2 d;
    public TextureView f17507e;
    public boolean f17508f;
    public s h;
    public boolean f17514m;
    public o7 f17515n;
    public ValueAnimator f17516o;
    public final e0 f17517p;
    public volatile long f17509g = -1;
    public boolean f17510i = false;
    public final RectF f17511j = new RectF();
    public final RectF f17512k = new RectF();
    public float f17513l = 1.0f;

    public d0(e0 e0Var) {
        this.f17517p = e0Var;
        this.f17505b = new org.telegram.ui.Components.d6(e0Var, 0L, 1200L, jr.f29801g);
        this.f17506c = new ImageReceiver(e0Var);
    }

    public final void a(o7 o7Var) {
        String str;
        float f9;
        cg.v2 v2Var = this.d;
        if (v2Var != null) {
            v2Var.pause();
            this.d.release(null);
            this.d = null;
        }
        TextureView textureView = this.f17507e;
        if (textureView != null) {
            AndroidUtilities.removeFromParent(textureView);
            this.f17507e = null;
        }
        this.f17508f = false;
        this.f17515n = o7Var;
        StringBuilder sb2 = new StringBuilder();
        sb2.append((int) Math.ceil(AndroidUtilities.displaySize.x / AndroidUtilities.density));
        sb2.append("_");
        sb2.append((int) Math.ceil(AndroidUtilities.displaySize.y / AndroidUtilities.density));
        if (o7Var != null && o7Var.K) {
            str = "_g";
        } else {
            str = "";
        }
        String q6 = a4.w.q(sb2, str, "_exif");
        o7 o7Var2 = this.f17515n;
        e0 e0Var = this.f17517p;
        ImageReceiver imageReceiver = this.f17506c;
        if (o7Var2 == null) {
            imageReceiver.clearImage();
        } else if (o7Var2.K) {
            Bitmap bitmap = o7Var2.M0;
            if (bitmap != null) {
                imageReceiver.setImageBitmap(bitmap);
            } else {
                Bitmap bitmap2 = o7Var2.f18259b1;
                if (bitmap2 != null) {
                    imageReceiver.setImageBitmap(bitmap2);
                } else {
                    String str2 = o7Var2.N;
                    if (str2 != null) {
                        imageReceiver.setImage(str2, q6, null, null, 0L);
                    } else {
                        imageReceiver.clearImage();
                    }
                }
            }
            TextureView textureView2 = new TextureView(e0Var.getContext());
            this.f17507e = textureView2;
            e0Var.addView(textureView2);
            cg.v2 v2Var2 = new cg.v2(this, 1);
            this.d = v2Var2;
            v2Var2.allowMultipleInstances(true);
            this.d.with(this.f17507e);
            this.d.preparePlayer(Uri.fromFile(this.f17515n.L), false, 1.0f);
            cg.v2 v2Var3 = this.d;
            if (!e0Var.f17579r0) {
                o7 o7Var3 = this.f17515n;
                if (!o7Var3.Y && e0Var.f17570j0) {
                    f9 = o7Var3.P;
                    v2Var3.setVolume(f9);
                    if (!e0Var.f17570j0 && !e0Var.m0) {
                        this.d.pause();
                    } else {
                        this.d.play();
                    }
                }
            }
            f9 = 0.0f;
            v2Var3.setVolume(f9);
            if (!e0Var.f17570j0) {
            }
            this.d.play();
        } else {
            imageReceiver.setImage(o7Var2.L.getAbsolutePath(), q6, null, null, 0L);
        }
        e0Var.invalidate();
    }

    public final void b(s sVar, boolean z10) {
        s sVar2 = this.h;
        if (sVar != null) {
            this.h = sVar;
        }
        ValueAnimator valueAnimator = this.f17516o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f17516o = null;
        }
        RectF rectF = this.f17512k;
        e0 e0Var = this.f17517p;
        if (z10) {
            boolean z11 = this.f17510i;
            RectF rectF2 = this.f17511j;
            if (!z11) {
                e0.c(e0Var, rectF2, sVar);
            } else {
                AndroidUtilities.lerp(rectF2, rectF, this.f17513l, rectF2);
            }
            if (sVar == null) {
                e0.c(e0Var, rectF, sVar2);
            } else {
                e0Var.k(rectF, sVar);
            }
            this.f17513l = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f17516o = ofFloat;
            ofFloat.addUpdateListener(new cg.c1(this, 5));
            this.f17516o.addListener(new ag.m0(this, 27));
            this.f17516o.setInterpolator(jr.h);
            this.f17516o.setDuration(360L);
            this.f17516o.start();
        } else {
            e0Var.k(rectF, sVar);
            this.f17513l = 1.0f;
        }
        e0Var.invalidate();
        this.f17510i = true;
    }
}
