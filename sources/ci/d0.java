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
    public int f4461a;
    public final org.telegram.ui.Components.c6 f4462b;
    public final ImageReceiver f4463c;
    public c0 d;
    public TextureView e;
    public boolean f4464f;
    public s h;
    public boolean f4470m;
    public o8 f4471n;
    public ValueAnimator f4472o;
    public final e0 f4473p;
    public volatile long f4465g = -1;
    public boolean f4466i = false;
    public final RectF f4467j = new RectF();
    public final RectF f4468k = new RectF();
    public float f4469l = 1.0f;

    public d0(e0 e0Var) {
        this.f4473p = e0Var;
        this.f4462b = new org.telegram.ui.Components.c6(e0Var, 0L, 1200L, qr.f27421g);
        this.f4463c = new ImageReceiver(e0Var);
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
        this.f4464f = false;
        this.f4471n = o8Var;
        StringBuilder sb2 = new StringBuilder();
        sb2.append((int) Math.ceil(AndroidUtilities.displaySize.x / AndroidUtilities.density));
        sb2.append("_");
        sb2.append((int) Math.ceil(AndroidUtilities.displaySize.y / AndroidUtilities.density));
        if (o8Var != null && o8Var.K) {
            str = "_g";
        } else {
            str = "";
        }
        String t10 = a4.a.t(sb2, str, "_exif");
        o8 o8Var2 = this.f4471n;
        e0 e0Var = this.f4473p;
        ImageReceiver imageReceiver = this.f4463c;
        if (o8Var2 == null) {
            imageReceiver.clearImage();
        } else if (o8Var2.K) {
            Bitmap bitmap = o8Var2.M0;
            if (bitmap != null) {
                imageReceiver.setImageBitmap(bitmap);
            } else {
                Bitmap bitmap2 = o8Var2.f5144b1;
                if (bitmap2 != null) {
                    imageReceiver.setImageBitmap(bitmap2);
                } else {
                    String str2 = o8Var2.N;
                    if (str2 != null) {
                        imageReceiver.setImage(str2, t10, null, null, 0L);
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
            this.d.preparePlayer(Uri.fromFile(this.f4471n.L), false, 1.0f);
            c0 c0Var3 = this.d;
            if (!e0Var.f4578v0) {
                o8 o8Var3 = this.f4471n;
                if (!o8Var3.Y && e0Var.f4568n0) {
                    f7 = o8Var3.P;
                    c0Var3.setVolume(f7);
                    if (!e0Var.f4568n0 && !e0Var.f4571q0) {
                        this.d.pause();
                    } else {
                        this.d.play();
                    }
                }
            }
            f7 = 0.0f;
            c0Var3.setVolume(f7);
            if (!e0Var.f4568n0) {
            }
            this.d.play();
        } else {
            imageReceiver.setImage(o8Var2.L.getAbsolutePath(), t10, null, null, 0L);
        }
        e0Var.invalidate();
    }

    public final void b(s sVar, boolean z10) {
        s sVar2 = this.h;
        if (sVar != null) {
            this.h = sVar;
        }
        ValueAnimator valueAnimator = this.f4472o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f4472o = null;
        }
        RectF rectF = this.f4468k;
        e0 e0Var = this.f4473p;
        if (z10) {
            boolean z11 = this.f4466i;
            RectF rectF2 = this.f4467j;
            if (!z11) {
                e0.c(e0Var, rectF2, sVar);
            } else {
                AndroidUtilities.lerp(rectF2, rectF, this.f4469l, rectF2);
            }
            if (sVar == null) {
                e0.c(e0Var, rectF, sVar2);
            } else {
                e0Var.k(rectF, sVar);
            }
            this.f4469l = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f4472o = ofFloat;
            ofFloat.addUpdateListener(new ai.l6(this, 2));
            this.f4472o.addListener(new ai.b(this, 12));
            this.f4472o.setInterpolator(qr.h);
            this.f4472o.setDuration(360L);
            this.f4472o.start();
        } else {
            e0Var.k(rectF, sVar);
            this.f4469l = 1.0f;
        }
        e0Var.invalidate();
        this.f4466i = true;
    }
}
