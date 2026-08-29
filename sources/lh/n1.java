package lh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.jr;
public final class n1 extends FrameLayout {
    public final FrameLayout f15960a;
    public final View f15961b;
    public final ImageView f15962c;
    public final m1 d;
    public boolean f15963e;
    public ValueAnimator f15964f;
    public boolean h;
    public float f15965n;
    public ValueAnimator f15966r;

    public n1(Context context, og.b bVar) {
        super(context);
        i7.h6.a(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f15960a = frameLayout;
        lg.i iVar = new lg.i();
        iVar.a(bVar);
        iVar.f15287g.setColor(-14670806);
        iVar.invalidateSelf();
        iVar.f15286f = AndroidUtilities.dp(1.0f);
        frameLayout.setBackground(iVar);
        addView(frameLayout, i7.f6.e(40, 40, 17));
        View view = new View(context);
        this.f15961b = view;
        view.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(40.0f), -13522392));
        frameLayout.addView(view, i7.f6.e(38, 38, 17));
        view.setAlpha(0.0f);
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
        m1 m1Var = new m1(context);
        this.d = m1Var;
        addView(m1Var, i7.f6.e(42, 42, 17));
        ImageView imageView = new ImageView(context);
        this.f15962c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(0.75f);
        imageView.setScaleY(0.75f);
        imageView.setColorFilter(new PorterDuffColorFilter(-2960428, PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, i7.f6.e(40, 40, 17));
        b(false, false);
    }

    public final void a(boolean z10, boolean z11) {
        int i10;
        if (this.f15963e == z10 && z11) {
            return;
        }
        this.f15963e = z10;
        ValueAnimator valueAnimator = this.f15964f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f15964f = null;
        }
        boolean z12 = true;
        float f9 = 1.0f;
        m1 m1Var = this.d;
        if (!z11) {
            if (z10) {
                f9 = 0.0f;
            }
            m1Var.setAlpha(f9);
            if (z10) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            m1Var.setVisibility(i10);
        } else {
            m1Var.setVisibility(0);
            float alpha = m1Var.getAlpha();
            if (z10) {
                f9 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f9);
            this.f15964f = ofFloat;
            ofFloat.addUpdateListener(new l1(this, 0));
            this.f15964f.setDuration(320L);
            this.f15964f.setInterpolator(jr.h);
            this.f15964f.start();
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
        ImageView imageView = this.f15962c;
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
        if (!z10 && this.f15963e) {
            z12 = false;
        } else {
            z12 = true;
        }
        c(z12, z11);
    }

    public final void c(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.f15966r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f15966r = null;
        }
        float f9 = 0.0f;
        if (!z11) {
            if (z10) {
                f9 = 1.0f;
            }
            this.f15965n = f9;
            View view = this.f15961b;
            view.setAlpha(1.0f - f9);
            view.setScaleX(1.0f - this.f15965n);
            view.setScaleY(1.0f - this.f15965n);
            this.f15962c.setColorFilter(new PorterDuffColorFilter(i0.a.d(this.f15965n, -1, -2960428), PorterDuff.Mode.SRC_IN));
            this.f15960a.invalidate();
            return;
        }
        float f10 = this.f15965n;
        if (z10) {
            f9 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f9);
        this.f15966r = ofFloat;
        ofFloat.addUpdateListener(new l1(this, 1));
        this.f15966r.setInterpolator(jr.h);
        this.f15966r.setDuration(420L);
        this.f15966r.start();
    }
}
