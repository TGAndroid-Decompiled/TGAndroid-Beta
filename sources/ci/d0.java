package ci;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.qr;
public final class d0 {
    public int f4464a;
    public final org.telegram.ui.Components.e6 f4465b;
    public final ImageReceiver f4466c;
    public c0 d;
    public TextureView e;
    public boolean f4467f;
    public s h;
    public boolean f4473m;
    public o8 f4474n;
    public ValueAnimator f4475o;
    public final e0 f4476p;
    public volatile long f4468g = -1;
    public boolean f4469i = false;
    public final RectF f4470j = new RectF();
    public final RectF f4471k = new RectF();
    public float f4472l = 1.0f;

    public d0(e0 e0Var) {
        this.f4476p = e0Var;
        this.f4465b = new org.telegram.ui.Components.e6(e0Var, 0L, 1200L, qr.f27716g);
        this.f4466c = new ImageReceiver(e0Var);
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
        TextureView textureView = this.e;
        if (textureView != null) {
            AndroidUtilities.removeFromParent(textureView);
            this.e = null;
        }
        this.f4467f = false;
        this.f4474n = o8Var;
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
        o8 o8Var2 = this.f4474n;
        e0 e0Var = this.f4476p;
        ImageReceiver imageReceiver = this.f4466c;
        if (o8Var2 == null) {
            imageReceiver.clearImage();
        } else if (o8Var2.K) {
            Bitmap bitmap = o8Var2.M0;
            if (bitmap != null) {
                imageReceiver.setImageBitmap(bitmap);
            } else {
                Bitmap bitmap2 = o8Var2.f5147b1;
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
            this.e = textureView2;
            e0Var.addView(textureView2);
            c0 c0Var2 = new c0(this, 0);
            this.d = c0Var2;
            c0Var2.allowMultipleInstances(true);
            this.d.with(this.e);
            this.d.preparePlayer(Uri.fromFile(this.f4474n.L), false, 1.0f);
            c0 c0Var3 = this.d;
            if (!e0Var.f4581v0) {
                o8 o8Var3 = this.f4474n;
                if (!o8Var3.Y && e0Var.f4571n0) {
                    f7 = o8Var3.P;
                    c0Var3.setVolume(f7);
                    if (!e0Var.f4571n0 && !e0Var.f4574q0) {
                        this.d.pause();
                    } else {
                        this.d.play();
                    }
                }
            }
            f7 = 0.0f;
            c0Var3.setVolume(f7);
            if (!e0Var.f4571n0) {
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
        ValueAnimator valueAnimator = this.f4475o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f4475o = null;
        }
        RectF rectF = this.f4471k;
        e0 e0Var = this.f4476p;
        if (z10) {
            boolean z11 = this.f4469i;
            RectF rectF2 = this.f4470j;
            if (!z11) {
                e0.c(e0Var, rectF2, sVar);
            } else {
                AndroidUtilities.lerp(rectF2, rectF, this.f4472l, rectF2);
            }
            if (sVar == null) {
                e0.c(e0Var, rectF, sVar2);
            } else {
                e0Var.k(rectF, sVar);
            }
            this.f4472l = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f4475o = ofFloat;
            ofFloat.addUpdateListener(new ai.l6(this, 2));
            this.f4475o.addListener(new ai.b(this, 12));
            this.f4475o.setInterpolator(qr.h);
            this.f4475o.setDuration(360L);
            this.f4475o.start();
        } else {
            e0Var.k(rectF, sVar);
            this.f4472l = 1.0f;
        }
        e0Var.invalidate();
        this.f4469i = true;
    }
}
