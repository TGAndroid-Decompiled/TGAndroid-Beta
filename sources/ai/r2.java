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
import org.telegram.ui.Components.tr;
public final class r2 extends FrameLayout {
    public final FrameLayout f1580a;
    public final View f1581b;
    public final ImageView f1582c;
    public final q2 d;
    public boolean f1583e;
    public ValueAnimator f1584f;
    public boolean h;
    public float f1585n;
    public ValueAnimator f1586r;

    public r2(Context context, dh.b bVar) {
        super(context);
        w7.b6.a(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f1580a = frameLayout;
        ah.l lVar = new ah.l();
        lVar.a(bVar);
        lVar.f526g.setColor(-14670806);
        lVar.invalidateSelf();
        lVar.f525f = AndroidUtilities.dp(1.0f);
        frameLayout.setBackground(lVar);
        addView(frameLayout, w7.z5.e(40, 40, 17));
        View view = new View(context);
        this.f1581b = view;
        view.setBackground(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(40.0f), -13522392));
        frameLayout.addView(view, w7.z5.e(38, 38, 17));
        view.setAlpha(0.0f);
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
        q2 q2Var = new q2(context);
        this.d = q2Var;
        addView(q2Var, w7.z5.e(42, 42, 17));
        ImageView imageView = new ImageView(context);
        this.f1582c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(0.75f);
        imageView.setScaleY(0.75f);
        imageView.setColorFilter(new PorterDuffColorFilter(-2960428, PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, w7.z5.e(40, 40, 17));
        b(false, false);
    }

    public final void a(boolean z10, boolean z11) {
        int i10;
        if (this.f1583e == z10 && z11) {
            return;
        }
        this.f1583e = z10;
        ValueAnimator valueAnimator = this.f1584f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f1584f = null;
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
            this.f1584f = ofFloat;
            ofFloat.addUpdateListener(new p2(this, 0));
            this.f1584f.setDuration(320L);
            this.f1584f.setInterpolator(tr.h);
            this.f1584f.start();
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
        ImageView imageView = this.f1582c;
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
        if (!z10 && this.f1583e) {
            z12 = false;
        } else {
            z12 = true;
        }
        c(z12, z11);
    }

    public final void c(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.f1586r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f1586r = null;
        }
        float f7 = 0.0f;
        if (!z11) {
            if (z10) {
                f7 = 1.0f;
            }
            this.f1585n = f7;
            View view = this.f1581b;
            view.setAlpha(1.0f - f7);
            view.setScaleX(1.0f - this.f1585n);
            view.setScaleY(1.0f - this.f1585n);
            this.f1582c.setColorFilter(new PorterDuffColorFilter(i0.a.d(this.f1585n, -1, -2960428), PorterDuff.Mode.SRC_IN));
            this.f1580a.invalidate();
            return;
        }
        float f10 = this.f1585n;
        if (z10) {
            f7 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f1586r = ofFloat;
        ofFloat.addUpdateListener(new p2(this, 1));
        this.f1586r.setInterpolator(tr.h);
        this.f1586r.setDuration(420L);
        this.f1586r.start();
    }
}
