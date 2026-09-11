package bi;

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
public final class f2 extends FrameLayout {
    public final FrameLayout f2952a;
    public final View f2953b;
    public final ImageView f2954c;
    public final e2 d;
    public boolean f2955e;
    public ValueAnimator f2956f;
    public boolean h;
    public float f2957n;
    public ValueAnimator f2958r;

    public f2(Context context, eh.b bVar) {
        super(context);
        w7.z5.a(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f2952a = frameLayout;
        bh.j jVar = new bh.j();
        jVar.a(bVar);
        jVar.f2716g.setColor(-14670806);
        jVar.invalidateSelf();
        jVar.f2715f = AndroidUtilities.dp(1.0f);
        frameLayout.setBackground(jVar);
        addView(frameLayout, w7.x5.e(40, 40, 17));
        View view = new View(context);
        this.f2953b = view;
        view.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(40.0f), -13522392));
        frameLayout.addView(view, w7.x5.e(38, 38, 17));
        view.setAlpha(0.0f);
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
        e2 e2Var = new e2(context);
        this.d = e2Var;
        addView(e2Var, w7.x5.e(42, 42, 17));
        ImageView imageView = new ImageView(context);
        this.f2954c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(0.75f);
        imageView.setScaleY(0.75f);
        imageView.setColorFilter(new PorterDuffColorFilter(-2960428, PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, w7.x5.e(40, 40, 17));
        b(false, false);
    }

    public final void a(boolean z10, boolean z11) {
        int i10;
        if (this.f2955e == z10 && z11) {
            return;
        }
        this.f2955e = z10;
        ValueAnimator valueAnimator = this.f2956f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f2956f = null;
        }
        boolean z12 = true;
        float f7 = 1.0f;
        e2 e2Var = this.d;
        if (!z11) {
            if (z10) {
                f7 = 0.0f;
            }
            e2Var.setAlpha(f7);
            if (z10) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            e2Var.setVisibility(i10);
        } else {
            e2Var.setVisibility(0);
            float alpha = e2Var.getAlpha();
            if (z10) {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f7);
            this.f2956f = ofFloat;
            ofFloat.addUpdateListener(new d2(this, 0));
            this.f2956f.setDuration(320L);
            this.f2956f.setInterpolator(pr.h);
            this.f2956f.start();
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
        ImageView imageView = this.f2954c;
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
        if (!z10 && this.f2955e) {
            z12 = false;
        } else {
            z12 = true;
        }
        c(z12, z11);
    }

    public final void c(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.f2958r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f2958r = null;
        }
        float f7 = 0.0f;
        if (!z11) {
            if (z10) {
                f7 = 1.0f;
            }
            this.f2957n = f7;
            View view = this.f2953b;
            view.setAlpha(1.0f - f7);
            view.setScaleX(1.0f - this.f2957n);
            view.setScaleY(1.0f - this.f2957n);
            this.f2954c.setColorFilter(new PorterDuffColorFilter(i0.a.d(this.f2957n, -1, -2960428), PorterDuff.Mode.SRC_IN));
            this.f2952a.invalidate();
            return;
        }
        float f10 = this.f2957n;
        if (z10) {
            f7 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f2958r = ofFloat;
        ofFloat.addUpdateListener(new d2(this, 1));
        this.f2958r.setInterpolator(pr.h);
        this.f2958r.setDuration(420L);
        this.f2958r.start();
    }
}
