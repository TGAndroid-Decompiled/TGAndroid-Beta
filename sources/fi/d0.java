package fi;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.ds;
public final class d0 {
    public int f10702a;
    public final org.telegram.ui.Components.h6 f10703b;
    public final ImageReceiver f10704c;
    public c0 d;
    public TextureView e;
    public boolean f10705f;
    public s h;
    public boolean f10711m;
    public w7 f10712n;
    public ValueAnimator f10713o;
    public final e0 f10714p;
    public volatile long f10706g = -1;
    public boolean f10707i = false;
    public final RectF f10708j = new RectF();
    public final RectF f10709k = new RectF();
    public float f10710l = 1.0f;

    public d0(e0 e0Var) {
        this.f10714p = e0Var;
        this.f10703b = new org.telegram.ui.Components.h6(e0Var, 0L, 1200L, ds.f27587g);
        this.f10704c = new ImageReceiver(e0Var);
    }

    public final void a(w7 w7Var) {
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
        this.f10705f = false;
        this.f10712n = w7Var;
        StringBuilder sb2 = new StringBuilder();
        sb2.append((int) Math.ceil(AndroidUtilities.displaySize.x / AndroidUtilities.density));
        sb2.append("_");
        sb2.append((int) Math.ceil(AndroidUtilities.displaySize.y / AndroidUtilities.density));
        if (w7Var != null && w7Var.K) {
            str = "_g";
        } else {
            str = "";
        }
        String s10 = a1.g.s(sb2, str, "_exif");
        w7 w7Var2 = this.f10712n;
        e0 e0Var = this.f10714p;
        ImageReceiver imageReceiver = this.f10704c;
        if (w7Var2 == null) {
            imageReceiver.clearImage();
        } else if (w7Var2.K) {
            Bitmap bitmap = w7Var2.M0;
            if (bitmap != null) {
                imageReceiver.setImageBitmap(bitmap);
            } else {
                Bitmap bitmap2 = w7Var2.f11893b1;
                if (bitmap2 != null) {
                    imageReceiver.setImageBitmap(bitmap2);
                } else {
                    String str2 = w7Var2.N;
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
            this.d.preparePlayer(Uri.fromFile(this.f10712n.L), false, 1.0f);
            c0 c0Var3 = this.d;
            if (!e0Var.f10769v0) {
                w7 w7Var3 = this.f10712n;
                if (!w7Var3.Y && e0Var.f10759n0) {
                    f7 = w7Var3.P;
                    c0Var3.setVolume(f7);
                    if (!e0Var.f10759n0 && !e0Var.f10762q0) {
                        this.d.pause();
                    } else {
                        this.d.play();
                    }
                }
            }
            f7 = 0.0f;
            c0Var3.setVolume(f7);
            if (!e0Var.f10759n0) {
            }
            this.d.play();
        } else {
            imageReceiver.setImage(w7Var2.L.getAbsolutePath(), s10, null, null, 0L);
        }
        e0Var.invalidate();
    }

    public final void b(s sVar, boolean z10) {
        s sVar2 = this.h;
        if (sVar != null) {
            this.h = sVar;
        }
        ValueAnimator valueAnimator = this.f10713o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f10713o = null;
        }
        RectF rectF = this.f10709k;
        e0 e0Var = this.f10714p;
        if (z10) {
            boolean z11 = this.f10707i;
            RectF rectF2 = this.f10708j;
            if (!z11) {
                e0.c(e0Var, rectF2, sVar);
            } else {
                AndroidUtilities.lerp(rectF2, rectF, this.f10710l, rectF2);
            }
            if (sVar == null) {
                e0.c(e0Var, rectF, sVar2);
            } else {
                e0Var.k(rectF, sVar);
            }
            this.f10710l = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f10713o = ofFloat;
            ofFloat.addUpdateListener(new di.u4(this, 2));
            this.f10713o.addListener(new bh.b(this, 18));
            this.f10713o.setInterpolator(ds.h);
            this.f10713o.setDuration(360L);
            this.f10713o.start();
        } else {
            e0Var.k(rectF, sVar);
            this.f10710l = 1.0f;
        }
        e0Var.invalidate();
        this.f10707i = true;
    }
}
