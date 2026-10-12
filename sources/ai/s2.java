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
import org.telegram.ui.Components.js;
public final class s2 extends FrameLayout {
    public final FrameLayout f1689a;
    public final View f1690b;
    public final ImageView f1691c;
    public final r2 d;
    public boolean f1692e;
    public ValueAnimator f1693f;
    public boolean h;
    public float f1694n;
    public ValueAnimator f1695r;

    public s2(Context context, dh.b bVar) {
        super(context);
        w7.y5.a(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f1689a = frameLayout;
        ah.l lVar = new ah.l();
        lVar.a(bVar);
        lVar.f611g.setColor(-14670806);
        lVar.invalidateSelf();
        lVar.f610f = AndroidUtilities.dp(1.0f);
        frameLayout.setBackground(lVar);
        addView(frameLayout, w7.w5.e(40, 40, 17));
        View view = new View(context);
        this.f1690b = view;
        view.setBackground(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(40.0f), -13522392));
        frameLayout.addView(view, w7.w5.e(38, 38, 17));
        view.setAlpha(0.0f);
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
        r2 r2Var = new r2(context);
        this.d = r2Var;
        addView(r2Var, w7.w5.e(42, 42, 17));
        ImageView imageView = new ImageView(context);
        this.f1691c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(0.75f);
        imageView.setScaleY(0.75f);
        imageView.setColorFilter(new PorterDuffColorFilter(-2960428, PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, w7.w5.e(40, 40, 17));
        b(false, false);
    }

    public final void a(boolean z10, boolean z11) {
        int i10;
        if (this.f1692e == z10 && z11) {
            return;
        }
        this.f1692e = z10;
        ValueAnimator valueAnimator = this.f1693f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f1693f = null;
        }
        boolean z12 = true;
        float f7 = 1.0f;
        r2 r2Var = this.d;
        if (!z11) {
            if (z10) {
                f7 = 0.0f;
            }
            r2Var.setAlpha(f7);
            if (z10) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            r2Var.setVisibility(i10);
        } else {
            r2Var.setVisibility(0);
            float alpha = r2Var.getAlpha();
            if (z10) {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f7);
            this.f1693f = ofFloat;
            ofFloat.addUpdateListener(new q2(this, 0));
            this.f1693f.setDuration(320L);
            this.f1693f.setInterpolator(js.h);
            this.f1693f.start();
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
        ImageView imageView = this.f1691c;
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
        if (!z10 && this.f1692e) {
            z12 = false;
        } else {
            z12 = true;
        }
        c(z12, z11);
    }

    public final void c(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.f1695r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f1695r = null;
        }
        float f7 = 0.0f;
        if (!z11) {
            if (z10) {
                f7 = 1.0f;
            }
            this.f1694n = f7;
            View view = this.f1690b;
            view.setAlpha(1.0f - f7);
            view.setScaleX(1.0f - this.f1694n);
            view.setScaleY(1.0f - this.f1694n);
            this.f1691c.setColorFilter(new PorterDuffColorFilter(i0.a.d(this.f1694n, -1, -2960428), PorterDuff.Mode.SRC_IN));
            this.f1689a.invalidate();
            return;
        }
        float f10 = this.f1694n;
        if (z10) {
            f7 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f1695r = ofFloat;
        ofFloat.addUpdateListener(new q2(this, 1));
        this.f1695r.setInterpolator(js.h);
        this.f1695r.setDuration(420L);
        this.f1695r.start();
    }
}
