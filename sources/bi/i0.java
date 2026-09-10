package bi;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.wr;
public final class i0 {
    public int f2825a;
    public final org.telegram.ui.Components.d6 f2826b;
    public final ImageReceiver f2827c;
    public h0 d;
    public TextureView e;
    public boolean f2828f;
    public w h;
    public boolean f2834m;
    public r9 f2835n;
    public ValueAnimator f2836o;
    public final j0 f2837p;
    public volatile long f2829g = -1;
    public boolean f2830i = false;
    public final RectF f2831j = new RectF();
    public final RectF f2832k = new RectF();
    public float f2833l = 1.0f;

    public i0(j0 j0Var) {
        this.f2837p = j0Var;
        this.f2826b = new org.telegram.ui.Components.d6(j0Var, 0L, 1200L, wr.f28820g);
        this.f2827c = new ImageReceiver(j0Var);
    }

    public final void a(r9 r9Var) {
        String str;
        float f7;
        h0 h0Var = this.d;
        if (h0Var != null) {
            h0Var.pause();
            this.d.release(null);
            this.d = null;
        }
        TextureView textureView = this.e;
        if (textureView != null) {
            AndroidUtilities.removeFromParent(textureView);
            this.e = null;
        }
        this.f2828f = false;
        this.f2835n = r9Var;
        StringBuilder sb2 = new StringBuilder();
        sb2.append((int) Math.ceil(AndroidUtilities.displaySize.x / AndroidUtilities.density));
        sb2.append("_");
        sb2.append((int) Math.ceil(AndroidUtilities.displaySize.y / AndroidUtilities.density));
        if (r9Var != null && r9Var.K) {
            str = "_g";
        } else {
            str = "";
        }
        String s10 = a4.a.s(sb2, str, "_exif");
        r9 r9Var2 = this.f2835n;
        j0 j0Var = this.f2837p;
        ImageReceiver imageReceiver = this.f2827c;
        if (r9Var2 == null) {
            imageReceiver.clearImage();
        } else if (r9Var2.K) {
            Bitmap bitmap = r9Var2.M0;
            if (bitmap != null) {
                imageReceiver.setImageBitmap(bitmap);
            } else {
                Bitmap bitmap2 = r9Var2.f3564b1;
                if (bitmap2 != null) {
                    imageReceiver.setImageBitmap(bitmap2);
                } else {
                    String str2 = r9Var2.N;
                    if (str2 != null) {
                        imageReceiver.setImage(str2, s10, null, null, 0L);
                    } else {
                        imageReceiver.clearImage();
                    }
                }
            }
            TextureView textureView2 = new TextureView(j0Var.getContext());
            this.e = textureView2;
            j0Var.addView(textureView2);
            h0 h0Var2 = new h0(this, 0);
            this.d = h0Var2;
            h0Var2.allowMultipleInstances(true);
            this.d.with(this.e);
            this.d.preparePlayer(Uri.fromFile(this.f2835n.L), false, 1.0f);
            h0 h0Var3 = this.d;
            if (!j0Var.f2931v0) {
                r9 r9Var3 = this.f2835n;
                if (!r9Var3.Y && j0Var.f2921n0) {
                    f7 = r9Var3.P;
                    h0Var3.setVolume(f7);
                    if (!j0Var.f2921n0 && !j0Var.f2924q0) {
                        this.d.pause();
                    } else {
                        this.d.play();
                    }
                }
            }
            f7 = 0.0f;
            h0Var3.setVolume(f7);
            if (!j0Var.f2921n0) {
            }
            this.d.play();
        } else {
            imageReceiver.setImage(r9Var2.L.getAbsolutePath(), s10, null, null, 0L);
        }
        j0Var.invalidate();
    }

    public final void b(w wVar, boolean z10) {
        w wVar2 = this.h;
        if (wVar != null) {
            this.h = wVar;
        }
        ValueAnimator valueAnimator = this.f2836o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f2836o = null;
        }
        RectF rectF = this.f2832k;
        j0 j0Var = this.f2837p;
        if (z10) {
            boolean z11 = this.f2830i;
            RectF rectF2 = this.f2831j;
            if (!z11) {
                j0.b(j0Var, rectF2, wVar);
            } else {
                AndroidUtilities.lerp(rectF2, rectF, this.f2833l, rectF2);
            }
            if (wVar == null) {
                j0.b(j0Var, rectF, wVar2);
            } else {
                j0Var.k(rectF, wVar);
            }
            this.f2833l = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f2836o = ofFloat;
            ofFloat.addUpdateListener(new ai.m(this, 1));
            this.f2836o.addListener(new h(this, 1));
            this.f2836o.setInterpolator(wr.h);
            this.f2836o.setDuration(360L);
            this.f2836o.start();
        } else {
            j0Var.k(rectF, wVar);
            this.f2833l = 1.0f;
        }
        j0Var.invalidate();
        this.f2830i = true;
    }
}
