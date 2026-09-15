package ai;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.qr;
public final class r2 extends FrameLayout {
    public final FrameLayout f1450a;
    public final View f1451b;
    public final ImageView f1452c;
    public final q2 d;
    public boolean e;
    public ValueAnimator f1453f;
    public boolean h;
    public float f1454n;
    public ValueAnimator f1455r;

    public r2(Context context, dh.b bVar) {
        super(context);
        w7.z5.a(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f1450a = frameLayout;
        ah.l lVar = new ah.l();
        lVar.a(bVar);
        lVar.f480g.setColor(-14670806);
        lVar.invalidateSelf();
        lVar.f479f = AndroidUtilities.dp(1.0f);
        frameLayout.setBackground(lVar);
        addView(frameLayout, w7.x5.e(40, 40, 17));
        View view = new View(context);
        this.f1451b = view;
        view.setBackground(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(40.0f), -13522392));
        frameLayout.addView(view, w7.x5.e(38, 38, 17));
        view.setAlpha(0.0f);
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
        q2 q2Var = new q2(context);
        this.d = q2Var;
        addView(q2Var, w7.x5.e(42, 42, 17));
        ImageView imageView = new ImageView(context);
        this.f1452c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(0.75f);
        imageView.setScaleY(0.75f);
        imageView.setColorFilter(new PorterDuffColorFilter(-2960428, PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, w7.x5.e(40, 40, 17));
        b(false, false);
    }

    public final void a(boolean z10, boolean z11) {
        int i10;
        if (this.e == z10 && z11) {
            return;
        }
        this.e = z10;
        ValueAnimator valueAnimator = this.f1453f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f1453f = null;
        }
        boolean z12 = true;
        float f7 = 1.0f;
        q2 q2Var = this.d;
        if (!z11) {
            if (z10) {
                f7 = 0.0f;
            }
            q2Var.setAlpha(f7);
            if (z10) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            q2Var.setVisibility(i10);
        } else {
            q2Var.setVisibility(0);
            float alpha = q2Var.getAlpha();
            if (z10) {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f7);
            this.f1453f = ofFloat;
            ofFloat.addUpdateListener(new p2(this, 0));
            this.f1453f.setDuration(320L);
            this.f1453f.setInterpolator(qr.h);
            this.f1453f.start();
        }
        if (!this.h && z10) {
            z12 = false;
        }
        c(z12, z11);
    }

    public final void b(boolean z10, boolean z11) {
        int i10;
        boolean z12;
        int i11;
        this.h = z10;
        ImageView imageView = this.f1452c;
        if (!z11) {
            if (z10) {
                i11 = R.drawable.msg_voice_muted;
            } else {
                i11 = R.drawable.msg_voice_unmuted;
            }
            AndroidUtilities.updateImageViewImageAnimated(imageView, i11);
        } else {
            if (z10) {
                i10 = R.drawable.msg_voice_muted;
            } else {
                i10 = R.drawable.msg_voice_unmuted;
            }
            imageView.setImageResource(i10);
        }
        if (!z10 && this.e) {
            z12 = false;
        } else {
            z12 = true;
        }
        c(z12, z11);
    }

    public final void c(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.f1455r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f1455r = null;
        }
        float f7 = 0.0f;
        if (!z11) {
            if (z10) {
                f7 = 1.0f;
            }
            this.f1454n = f7;
            View view = this.f1451b;
            view.setAlpha(1.0f - f7);
            view.setScaleX(1.0f - this.f1454n);
            view.setScaleY(1.0f - this.f1454n);
            this.f1452c.setColorFilter(new PorterDuffColorFilter(i0.a.d(this.f1454n, -1, -2960428), PorterDuff.Mode.SRC_IN));
            this.f1450a.invalidate();
            return;
        }
        float f10 = this.f1454n;
        if (z10) {
            f7 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f1455r = ofFloat;
        ofFloat.addUpdateListener(new p2(this, 1));
        this.f1455r.setInterpolator(qr.h);
        this.f1455r.setDuration(420L);
        this.f1455r.start();
    }
}
