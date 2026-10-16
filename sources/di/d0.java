package di;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.es;
public final class d0 {
    public int f6768a;
    public final org.telegram.ui.Components.g6 f6769b;
    public final ImageReceiver f6770c;
    public c0 d;
    public TextureView e;
    public boolean f6771f;
    public s h;
    public boolean f6777m;
    public k8 f6778n;
    public ValueAnimator f6779o;
    public final e0 f6780p;
    public volatile long f6772g = -1;
    public boolean f6773i = false;
    public final RectF f6774j = new RectF();
    public final RectF f6775k = new RectF();
    public float f6776l = 1.0f;

    public d0(e0 e0Var) {
        this.f6780p = e0Var;
        this.f6769b = new org.telegram.ui.Components.g6(e0Var, 0L, 1200L, es.f24466g);
        this.f6770c = new ImageReceiver(e0Var);
    }

    public final void a(k8 k8Var) {
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
        this.f6771f = false;
        this.f6778n = k8Var;
        StringBuilder sb2 = new StringBuilder();
        sb2.append((int) Math.ceil(AndroidUtilities.displaySize.x / AndroidUtilities.density));
        sb2.append("_");
        sb2.append((int) Math.ceil(AndroidUtilities.displaySize.y / AndroidUtilities.density));
        if (k8Var != null && k8Var.K) {
            str = "_g";
        } else {
            str = "";
        }
        String s10 = a1.g.s(sb2, str, "_exif");
        k8 k8Var2 = this.f6778n;
        e0 e0Var = this.f6780p;
        ImageReceiver imageReceiver = this.f6770c;
        if (k8Var2 == null) {
            imageReceiver.clearImage();
        } else if (k8Var2.K) {
            Bitmap bitmap = k8Var2.M0;
            if (bitmap != null) {
                imageReceiver.setImageBitmap(bitmap);
            } else {
                Bitmap bitmap2 = k8Var2.f7180b1;
                if (bitmap2 != null) {
                    imageReceiver.setImageBitmap(bitmap2);
                } else {
                    String str2 = k8Var2.N;
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
            this.d.preparePlayer(Uri.fromFile(this.f6778n.L), false, 1.0f);
            c0 c0Var3 = this.d;
            if (!e0Var.f6884v0) {
                k8 k8Var3 = this.f6778n;
                if (!k8Var3.Y && e0Var.f6874n0) {
                    f7 = k8Var3.P;
                    c0Var3.setVolume(f7);
                    if (!e0Var.f6874n0 && !e0Var.f6877q0) {
                        this.d.pause();
                    } else {
                        this.d.play();
                    }
                }
            }
            f7 = 0.0f;
            c0Var3.setVolume(f7);
            if (!e0Var.f6874n0) {
            }
            this.d.play();
        } else {
            imageReceiver.setImage(k8Var2.L.getAbsolutePath(), s10, null, null, 0L);
        }
        e0Var.invalidate();
    }

    public final void b(s sVar, boolean z10) {
        s sVar2 = this.h;
        if (sVar != null) {
            this.h = sVar;
        }
        ValueAnimator valueAnimator = this.f6779o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f6779o = null;
        }
        RectF rectF = this.f6775k;
        e0 e0Var = this.f6780p;
        if (z10) {
            boolean z11 = this.f6773i;
            RectF rectF2 = this.f6774j;
            if (!z11) {
                e0.b(e0Var, rectF2, sVar);
            } else {
                AndroidUtilities.lerp(rectF2, rectF, this.f6776l, rectF2);
            }
            if (sVar == null) {
                e0.b(e0Var, rectF, sVar2);
            } else {
                e0Var.k(rectF, sVar);
            }
            this.f6776l = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f6779o = ofFloat;
            ofFloat.addUpdateListener(new bi.w5(this, 2));
            this.f6779o.addListener(new ah.b(this, 15));
            this.f6779o.setInterpolator(es.h);
            this.f6779o.setDuration(360L);
            this.f6779o.start();
        } else {
            e0Var.k(rectF, sVar);
            this.f6776l = 1.0f;
        }
        e0Var.invalidate();
        this.f6773i = true;
    }
}
