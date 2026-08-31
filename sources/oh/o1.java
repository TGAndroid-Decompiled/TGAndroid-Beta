package oh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.pr;
public final class o1 extends FrameLayout {
    public final FrameLayout f17538a;
    public final View f17539b;
    public final ImageView f17540c;
    public final n1 d;
    public boolean f17541e;
    public ValueAnimator f17542f;
    public boolean h;
    public float f17543n;
    public ValueAnimator f17544r;

    public o1(Context context, rg.b bVar) {
        super(context);
        k7.e6.a(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f17538a = frameLayout;
        og.i iVar = new og.i();
        iVar.a(bVar);
        iVar.f16817g.setColor(-14670806);
        iVar.invalidateSelf();
        iVar.f16816f = AndroidUtilities.dp(1.0f);
        frameLayout.setBackground(iVar);
        addView(frameLayout, k7.c6.e(40, 40, 17));
        View view = new View(context);
        this.f17539b = view;
        view.setBackground(org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(40.0f), -13522392));
        frameLayout.addView(view, k7.c6.e(38, 38, 17));
        view.setAlpha(0.0f);
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
        n1 n1Var = new n1(context);
        this.d = n1Var;
        addView(n1Var, k7.c6.e(42, 42, 17));
        ImageView imageView = new ImageView(context);
        this.f17540c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(0.75f);
        imageView.setScaleY(0.75f);
        imageView.setColorFilter(new PorterDuffColorFilter(-2960428, PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, k7.c6.e(40, 40, 17));
        b(false, false);
    }

    public final void a(boolean z4, boolean z10) {
        int i10;
        if (this.f17541e == z4 && z10) {
            return;
        }
        this.f17541e = z4;
        ValueAnimator valueAnimator = this.f17542f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f17542f = null;
        }
        boolean z11 = true;
        float f10 = 1.0f;
        n1 n1Var = this.d;
        if (!z10) {
            if (z4) {
                f10 = 0.0f;
            }
            n1Var.setAlpha(f10);
            if (z4) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            n1Var.setVisibility(i10);
        } else {
            n1Var.setVisibility(0);
            float alpha = n1Var.getAlpha();
            if (z4) {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f10);
            this.f17542f = ofFloat;
            ofFloat.addUpdateListener(new m1(this, 0));
            this.f17542f.setDuration(320L);
            this.f17542f.setInterpolator(pr.h);
            this.f17542f.start();
        }
        if (!this.h && z4) {
            z11 = false;
        }
        c(z11, z10);
    }

    public final void b(boolean z4, boolean z10) {
        int i10;
        boolean z11;
        int i11;
        this.h = z4;
        ImageView imageView = this.f17540c;
        if (!z10) {
            if (z4) {
                i11 = R.drawable.msg_voice_muted;
            } else {
                i11 = R.drawable.msg_voice_unmuted;
            }
            AndroidUtilities.updateImageViewImageAnimated(imageView, i11);
        } else {
            if (z4) {
                i10 = R.drawable.msg_voice_muted;
            } else {
                i10 = R.drawable.msg_voice_unmuted;
            }
            imageView.setImageResource(i10);
        }
        if (!z4 && this.f17541e) {
            z11 = false;
        } else {
            z11 = true;
        }
        c(z11, z10);
    }

    public final void c(boolean z4, boolean z10) {
        ValueAnimator valueAnimator = this.f17544r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f17544r = null;
        }
        float f10 = 0.0f;
        if (!z10) {
            if (z4) {
                f10 = 1.0f;
            }
            this.f17543n = f10;
            View view = this.f17539b;
            view.setAlpha(1.0f - f10);
            view.setScaleX(1.0f - this.f17543n);
            view.setScaleY(1.0f - this.f17543n);
            this.f17540c.setColorFilter(new PorterDuffColorFilter(i0.a.d(this.f17543n, -1, -2960428), PorterDuff.Mode.SRC_IN));
            this.f17538a.invalidate();
            return;
        }
        float f11 = this.f17543n;
        if (z4) {
            f10 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f17544r = ofFloat;
        ofFloat.addUpdateListener(new m1(this, 1));
        this.f17544r.setInterpolator(pr.h);
        this.f17544r.setDuration(420L);
        this.f17544r.start();
    }
}
