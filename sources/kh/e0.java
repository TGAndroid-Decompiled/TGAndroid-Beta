package kh;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.gr;
public final class e0 {
    public int f15129a;
    public final org.telegram.ui.Components.y5 f15130b;
    public final ImageReceiver f15131c;
    public d0 d;
    public TextureView f15132e;
    public boolean f15133f;
    public t h;
    public boolean f15139m;
    public a8 f15140n;
    public ValueAnimator f15141o;
    public final f0 f15142p;
    public volatile long f15134g = -1;
    public boolean f15135i = false;
    public final RectF f15136j = new RectF();
    public final RectF f15137k = new RectF();
    public float f15138l = 1.0f;

    public e0(f0 f0Var) {
        this.f15142p = f0Var;
        this.f15130b = new org.telegram.ui.Components.y5(f0Var, 0L, 1200L, gr.f28845g);
        this.f15131c = new ImageReceiver(f0Var);
    }

    public final void a(a8 a8Var) {
        String str;
        float f10;
        d0 d0Var = this.d;
        if (d0Var != null) {
            d0Var.pause();
            this.d.release(null);
            this.d = null;
        }
        TextureView textureView = this.f15132e;
        if (textureView != null) {
            AndroidUtilities.removeFromParent(textureView);
            this.f15132e = null;
        }
        this.f15133f = false;
        this.f15140n = a8Var;
        StringBuilder sb2 = new StringBuilder();
        sb2.append((int) Math.ceil(AndroidUtilities.displaySize.x / AndroidUtilities.density));
        sb2.append("_");
        sb2.append((int) Math.ceil(AndroidUtilities.displaySize.y / AndroidUtilities.density));
        if (a8Var != null && a8Var.K) {
            str = "_g";
        } else {
            str = "";
        }
        String r10 = aa.d.r(sb2, str, "_exif");
        a8 a8Var2 = this.f15140n;
        f0 f0Var = this.f15142p;
        ImageReceiver imageReceiver = this.f15131c;
        if (a8Var2 == null) {
            imageReceiver.clearImage();
        } else if (a8Var2.K) {
            Bitmap bitmap = a8Var2.M0;
            if (bitmap != null) {
                imageReceiver.setImageBitmap(bitmap);
            } else {
                Bitmap bitmap2 = a8Var2.f14906b1;
                if (bitmap2 != null) {
                    imageReceiver.setImageBitmap(bitmap2);
                } else {
                    String str2 = a8Var2.N;
                    if (str2 != null) {
                        imageReceiver.setImage(str2, r10, null, null, 0L);
                    } else {
                        imageReceiver.clearImage();
                    }
                }
            }
            TextureView textureView2 = new TextureView(f0Var.getContext());
            this.f15132e = textureView2;
            f0Var.addView(textureView2);
            d0 d0Var2 = new d0(this, 0);
            this.d = d0Var2;
            d0Var2.allowMultipleInstances(true);
            this.d.with(this.f15132e);
            this.d.preparePlayer(Uri.fromFile(this.f15140n.L), false, 1.0f);
            d0 d0Var3 = this.d;
            if (!f0Var.f15217r0) {
                a8 a8Var3 = this.f15140n;
                if (!a8Var3.Y && f0Var.f15208j0) {
                    f10 = a8Var3.P;
                    d0Var3.setVolume(f10);
                    if (!f0Var.f15208j0 && !f0Var.m0) {
                        this.d.pause();
                    } else {
                        this.d.play();
                    }
                }
            }
            f10 = 0.0f;
            d0Var3.setVolume(f10);
            if (!f0Var.f15208j0) {
            }
            this.d.play();
        } else {
            imageReceiver.setImage(a8Var2.L.getAbsolutePath(), r10, null, null, 0L);
        }
        f0Var.invalidate();
    }

    public final void b(t tVar, boolean z10) {
        t tVar2 = this.h;
        if (tVar != null) {
            this.h = tVar;
        }
        ValueAnimator valueAnimator = this.f15141o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f15141o = null;
        }
        RectF rectF = this.f15137k;
        f0 f0Var = this.f15142p;
        if (z10) {
            boolean z11 = this.f15135i;
            RectF rectF2 = this.f15136j;
            if (!z11) {
                f0.c(f0Var, rectF2, tVar);
            } else {
                AndroidUtilities.lerp(rectF2, rectF, this.f15138l, rectF2);
            }
            if (tVar == null) {
                f0.c(f0Var, rectF, tVar2);
            } else {
                f0Var.k(rectF, tVar);
            }
            this.f15138l = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f15141o = ofFloat;
            ofFloat.addUpdateListener(new f2.f0(this, 3));
            this.f15141o.addListener(new ag.e(this, 21));
            this.f15141o.setInterpolator(gr.h);
            this.f15141o.setDuration(360L);
            this.f15141o.start();
        } else {
            f0Var.k(rectF, tVar);
            this.f15138l = 1.0f;
        }
        f0Var.invalidate();
        this.f15135i = true;
    }
}
