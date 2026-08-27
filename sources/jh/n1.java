package jh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.er;

public final class n1 extends FrameLayout {

    public final FrameLayout f13685a;

    public final View f13686b;

    public final ImageView f13687c;
    public final m1 d;

    public boolean f13688e;

    public ValueAnimator f13689f;
    public boolean h;

    public float f13690n;

    public ValueAnimator f13691r;

    public n1(Context context, mg.b bVar) {
        super(context);
        h7.b6.a(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f13685a = frameLayout;
        jg.i iVar = new jg.i();
        iVar.a(bVar);
        iVar.f13006g.setColor(-14670806);
        iVar.invalidateSelf();
        iVar.f13005f = AndroidUtilities.dp(1.0f);
        frameLayout.setBackground(iVar);
        addView(frameLayout, h7.z5.e(40, 40, 17));
        View view = new View(context);
        this.f13686b = view;
        view.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(40.0f), -13522392));
        frameLayout.addView(view, h7.z5.e(38, 38, 17));
        view.setAlpha(0.0f);
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
        m1 m1Var = new m1(context);
        this.d = m1Var;
        addView(m1Var, h7.z5.e(42, 42, 17));
        ImageView imageView = new ImageView(context);
        this.f13687c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(0.75f);
        imageView.setScaleY(0.75f);
        imageView.setColorFilter(new PorterDuffColorFilter(-2960428, PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, h7.z5.e(40, 40, 17));
        b(false, false);
    }

    public final void a(boolean z10, boolean z11) {
        if (this.f13688e == z10 && z11) {
            return;
        }
        this.f13688e = z10;
        ValueAnimator valueAnimator = this.f13689f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f13689f = null;
        }
        boolean z12 = true;
        m1 m1Var = this.d;
        if (z11) {
            m1Var.setVisibility(0);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(m1Var.getAlpha(), z10 ? 0.0f : 1.0f);
            this.f13689f = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new l1(this, 0));
            this.f13689f.setDuration(320L);
            this.f13689f.setInterpolator(er.h);
            this.f13689f.start();
        } else {
            m1Var.setAlpha(z10 ? 0.0f : 1.0f);
            m1Var.setVisibility(z10 ? 8 : 0);
        }
        if (!this.h && z10) {
            z12 = false;
        }
        c(z12, z11);
    }

    public final void b(boolean z10, boolean z11) {
        this.h = z10;
        ImageView imageView = this.f13687c;
        if (z11) {
            imageView.setImageResource(z10 ? R.drawable.msg_voice_muted : R.drawable.msg_voice_unmuted);
        } else {
            AndroidUtilities.updateImageViewImageAnimated(imageView, z10 ? R.drawable.msg_voice_muted : R.drawable.msg_voice_unmuted);
        }
        c(z10 || !this.f13688e, z11);
    }

    public final void c(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.f13691r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f13691r = null;
        }
        if (z11) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f13690n, z10 ? 1.0f : 0.0f);
            this.f13691r = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new l1(this, 1));
            this.f13691r.setInterpolator(er.h);
            this.f13691r.setDuration(420L);
            this.f13691r.start();
            return;
        }
        float f10 = z10 ? 1.0f : 0.0f;
        this.f13690n = f10;
        View view = this.f13686b;
        view.setAlpha(1.0f - f10);
        view.setScaleX(1.0f - this.f13690n);
        view.setScaleY(1.0f - this.f13690n);
        this.f13687c.setColorFilter(new PorterDuffColorFilter(i0.b.d(this.f13690n, -1, -2960428), PorterDuff.Mode.SRC_IN));
        this.f13685a.invalidate();
    }
}
