package lh;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.er;

public final class d0 {

    public int f15835a;

    public final org.telegram.ui.Components.y5 f15836b;

    public final ImageReceiver f15837c;
    public ag.o3 d;

    public TextureView f15838e;

    public boolean f15839f;
    public t h;

    public boolean f15845m;

    public z7 f15846n;

    public ValueAnimator f15847o;

    public final e0 f15848p;

    public volatile long f15840g = -1;

    public boolean f15841i = false;

    public final RectF f15842j = new RectF();

    public final RectF f15843k = new RectF();

    public float f15844l = 1.0f;

    public d0(e0 e0Var) {
        this.f15848p = e0Var;
        this.f15836b = new org.telegram.ui.Components.y5(e0Var, 0L, 1200L, er.f28123g);
        this.f15837c = new ImageReceiver(e0Var);
    }

    public final void a(z7 z7Var) {
        float f10;
        ag.o3 o3Var = this.d;
        if (o3Var != null) {
            o3Var.pause();
            this.d.release(null);
            this.d = null;
        }
        TextureView textureView = this.f15838e;
        if (textureView != null) {
            AndroidUtilities.removeFromParent(textureView);
            this.f15838e = null;
        }
        this.f15839f = false;
        this.f15846n = z7Var;
        StringBuilder sb2 = new StringBuilder();
        sb2.append((int) Math.ceil(AndroidUtilities.displaySize.x / AndroidUtilities.density));
        sb2.append("_");
        sb2.append((int) Math.ceil(AndroidUtilities.displaySize.y / AndroidUtilities.density));
        String strP = a9.p.p(sb2, (z7Var == null || !z7Var.K) ? "" : "_g", "_exif");
        z7 z7Var2 = this.f15846n;
        e0 e0Var = this.f15848p;
        ImageReceiver imageReceiver = this.f15837c;
        if (z7Var2 == null) {
            imageReceiver.clearImage();
        } else if (z7Var2.K) {
            Bitmap bitmap = z7Var2.M0;
            if (bitmap != null) {
                imageReceiver.setImageBitmap(bitmap);
            } else {
                Bitmap bitmap2 = z7Var2.f17198b1;
                if (bitmap2 != null) {
                    imageReceiver.setImageBitmap(bitmap2);
                } else {
                    String str = z7Var2.N;
                    if (str != null) {
                        imageReceiver.setImage(str, strP, null, null, 0L);
                    } else {
                        imageReceiver.clearImage();
                    }
                }
            }
            TextureView textureView2 = new TextureView(e0Var.getContext());
            this.f15838e = textureView2;
            e0Var.addView(textureView2);
            ag.o3 o3Var2 = new ag.o3(this, 1);
            this.d = o3Var2;
            o3Var2.allowMultipleInstances(true);
            this.d.with(this.f15838e);
            this.d.preparePlayer(Uri.fromFile(this.f15846n.L), false, 1.0f);
            ag.o3 o3Var3 = this.d;
            if (e0Var.f15912r0) {
                f10 = 0.0f;
            } else {
                z7 z7Var3 = this.f15846n;
                if (z7Var3.Y || !e0Var.f15903j0) {
                    f10 = 0.0f;
                } else {
                    f10 = z7Var3.P;
                }
            }
            o3Var3.setVolume(f10);
            if (!e0Var.f15903j0 || e0Var.m0) {
                this.d.play();
            } else {
                this.d.pause();
            }
        } else {
            imageReceiver.setImage(z7Var2.L.getAbsolutePath(), strP, null, null, 0L);
        }
        e0Var.invalidate();
    }

    public final void b(t tVar, boolean z10) {
        t tVar2 = this.h;
        if (tVar != null) {
            this.h = tVar;
        }
        ValueAnimator valueAnimator = this.f15847o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f15847o = null;
        }
        RectF rectF = this.f15843k;
        e0 e0Var = this.f15848p;
        if (z10) {
            boolean z11 = this.f15841i;
            RectF rectF2 = this.f15842j;
            if (z11) {
                AndroidUtilities.lerp(rectF2, rectF, this.f15844l, rectF2);
            } else {
                e0.b(e0Var, rectF2, tVar);
            }
            if (tVar == null) {
                e0.b(e0Var, rectF, tVar2);
            } else {
                e0Var.k(rectF, tVar);
            }
            this.f15844l = 0.0f;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f15847o = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ag.q1(this, 5));
            this.f15847o.addListener(new ag.r1(this, 23));
            this.f15847o.setInterpolator(er.h);
            this.f15847o.setDuration(360L);
            this.f15847o.start();
        } else {
            e0Var.k(rectF, tVar);
            this.f15844l = 1.0f;
        }
        e0Var.invalidate();
        this.f15841i = true;
    }
}
