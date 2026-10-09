package ci;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.hs;
public final class d0 {
    public int f4879a;
    public final org.telegram.ui.Components.g6 f4880b;
    public final ImageReceiver f4881c;
    public c0 d;
    public TextureView f4882e;
    public boolean f4883f;
    public s h;
    public boolean f4889m;
    public l8 f4890n;
    public ValueAnimator f4891o;
    public final e0 f4892p;
    public volatile long f4884g = -1;
    public boolean f4885i = false;
    public final RectF f4886j = new RectF();
    public final RectF f4887k = new RectF();
    public float f4888l = 1.0f;

    public d0(e0 e0Var) {
        this.f4892p = e0Var;
        this.f4880b = new org.telegram.ui.Components.g6(e0Var, 0L, 1200L, hs.f27119g);
        this.f4881c = new ImageReceiver(e0Var);
    }

    public final void a(l8 l8Var) {
        String str;
        float f7;
        c0 c0Var = this.d;
        if (c0Var != null) {
            c0Var.pause();
            this.d.release(null);
            this.d = null;
        }
        TextureView textureView = this.f4882e;
        if (textureView != null) {
            AndroidUtilities.removeFromParent(textureView);
            this.f4882e = null;
        }
        this.f4883f = false;
        this.f4890n = l8Var;
        StringBuilder sb2 = new StringBuilder();
        sb2.append((int) Math.ceil(AndroidUtilities.displaySize.x / AndroidUtilities.density));
        sb2.append("_");
        sb2.append((int) Math.ceil(AndroidUtilities.displaySize.y / AndroidUtilities.density));
        if (l8Var != null && l8Var.K) {
            str = "_g";
        } else {
            str = "";
        }
        String t10 = a1.g.t(sb2, str, "_exif");
        l8 l8Var2 = this.f4890n;
        e0 e0Var = this.f4892p;
        ImageReceiver imageReceiver = this.f4881c;
        if (l8Var2 == null) {
            imageReceiver.clearImage();
        } else if (l8Var2.K) {
            Bitmap bitmap = l8Var2.M0;
            if (bitmap != null) {
                imageReceiver.setImageBitmap(bitmap);
            } else {
                Bitmap bitmap2 = l8Var2.f5399b1;
                if (bitmap2 != null) {
                    imageReceiver.setImageBitmap(bitmap2);
                } else {
                    String str2 = l8Var2.N;
                    if (str2 != null) {
                        imageReceiver.setImage(str2, t10, null, null, 0L);
                    } else {
                        imageReceiver.clearImage();
                    }
                }
            }
            TextureView textureView2 = new TextureView(e0Var.getContext());
            this.f4882e = textureView2;
            e0Var.addView(textureView2);
            c0 c0Var2 = new c0(this, 0);
            this.d = c0Var2;
            c0Var2.allowMultipleInstances(true);
            this.d.with(this.f4882e);
            this.d.preparePlayer(Uri.fromFile(this.f4890n.L), false, 1.0f);
            c0 c0Var3 = this.d;
            if (!e0Var.f5017v0) {
                l8 l8Var3 = this.f4890n;
                if (!l8Var3.Y && e0Var.f5007n0) {
                    f7 = l8Var3.P;
                    c0Var3.setVolume(f7);
                    if (!e0Var.f5007n0 && !e0Var.f5010q0) {
                        this.d.pause();
                    } else {
                        this.d.play();
                    }
                }
            }
            f7 = 0.0f;
            c0Var3.setVolume(f7);
            if (!e0Var.f5007n0) {
            }
            this.d.play();
        } else {
            imageReceiver.setImage(l8Var2.L.getAbsolutePath(), t10, null, null, 0L);
        }
        e0Var.invalidate();
    }

    public final void b(s sVar, boolean z10) {
        s sVar2 = this.h;
        if (sVar != null) {
            this.h = sVar;
        }
        ValueAnimator valueAnimator = this.f4891o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f4891o = null;
        }
        RectF rectF = this.f4887k;
        e0 e0Var = this.f4892p;
        if (z10) {
            boolean z11 = this.f4885i;
            RectF rectF2 = this.f4886j;
            if (!z11) {
                e0.c(e0Var, rectF2, sVar);
            } else {
                AndroidUtilities.lerp(rectF2, rectF, this.f4888l, rectF2);
            }
            if (sVar == null) {
                e0.c(e0Var, rectF, sVar2);
            } else {
                e0Var.k(rectF, sVar);
            }
            this.f4888l = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f4891o = ofFloat;
            ofFloat.addUpdateListener(new ai.l6(this, 2));
            this.f4891o.addListener(new ai.b(this, 12));
            this.f4891o.setInterpolator(hs.h);
            this.f4891o.setDuration(360L);
            this.f4891o.start();
        } else {
            e0Var.k(rectF, sVar);
            this.f4888l = 1.0f;
        }
        e0Var.invalidate();
        this.f4885i = true;
    }
}
