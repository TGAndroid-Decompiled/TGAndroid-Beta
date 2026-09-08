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
    public int f7053a;
    public final org.telegram.ui.Components.e6 f7054b;
    public final ImageReceiver f7055c;
    public c0 d;
    public TextureView f7056e;
    public boolean f7057f;
    public s h;
    public boolean f7063m;
    public o8 f7064n;
    public ValueAnimator f7065o;
    public final e0 f7066p;
    public volatile long f7058g = -1;
    public boolean f7059i = false;
    public final RectF f7060j = new RectF();
    public final RectF f7061k = new RectF();
    public float f7062l = 1.0f;

    public d0(e0 e0Var) {
        this.f7066p = e0Var;
        this.f7054b = new org.telegram.ui.Components.e6(e0Var, 0L, 1200L, pr.f29494g);
        this.f7055c = new ImageReceiver(e0Var);
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
        TextureView textureView = this.f7056e;
        if (textureView != null) {
            AndroidUtilities.removeFromParent(textureView);
            this.f7056e = null;
        }
        this.f7057f = false;
        this.f7064n = o8Var;
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
        o8 o8Var2 = this.f7064n;
        e0 e0Var = this.f7066p;
        ImageReceiver imageReceiver = this.f7055c;
        if (o8Var2 == null) {
            imageReceiver.clearImage();
        } else if (o8Var2.K) {
            Bitmap bitmap = o8Var2.M0;
            if (bitmap != null) {
                imageReceiver.setImageBitmap(bitmap);
            } else {
                Bitmap bitmap2 = o8Var2.f7773b1;
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
            this.f7056e = textureView2;
            e0Var.addView(textureView2);
            c0 c0Var2 = new c0(this, 0);
            this.d = c0Var2;
            c0Var2.allowMultipleInstances(true);
            this.d.with(this.f7056e);
            this.d.preparePlayer(Uri.fromFile(this.f7064n.L), false, 1.0f);
            c0 c0Var3 = this.d;
            if (!e0Var.f7175v0) {
                o8 o8Var3 = this.f7064n;
                if (!o8Var3.Y && e0Var.f7165n0) {
                    f7 = o8Var3.P;
                    c0Var3.setVolume(f7);
                    if (!e0Var.f7165n0 && !e0Var.f7168q0) {
                        this.d.pause();
                    } else {
                        this.d.play();
                    }
                }
            }
            f7 = 0.0f;
            c0Var3.setVolume(f7);
            if (!e0Var.f7165n0) {
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
        ValueAnimator valueAnimator = this.f7065o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f7065o = null;
        }
        RectF rectF = this.f7061k;
        e0 e0Var = this.f7066p;
        if (z10) {
            boolean z11 = this.f7059i;
            RectF rectF2 = this.f7060j;
            if (!z11) {
                e0.b(e0Var, rectF2, sVar);
            } else {
                AndroidUtilities.lerp(rectF2, rectF, this.f7062l, rectF2);
            }
            if (sVar == null) {
                e0.b(e0Var, rectF, sVar2);
            } else {
                e0Var.k(rectF, sVar);
            }
            this.f7062l = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f7065o = ofFloat;
            ofFloat.addUpdateListener(new bi.u5(this, 2));
            this.f7065o.addListener(new ah.b(this, 15));
            this.f7065o.setInterpolator(pr.h);
            this.f7065o.setDuration(360L);
            this.f7065o.start();
        } else {
            e0Var.k(rectF, sVar);
            this.f7062l = 1.0f;
        }
        e0Var.invalidate();
        this.f7059i = true;
    }
}
