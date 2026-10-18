package ci;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.bs;
public final class t1 extends FrameLayout {
    public final FrameLayout f5935a;
    public final View f5936b;
    public final ImageView f5937c;
    public final s1 d;
    public boolean e;
    public ValueAnimator f5938f;
    public boolean h;
    public float f5939n;
    public ValueAnimator f5940r;

    public t1(Context context, eh.b bVar) {
        super(context);
        w7.b6.a(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f5935a = frameLayout;
        bh.j jVar = new bh.j();
        jVar.a(bVar);
        jVar.f4419g.setColor(-14670806);
        jVar.invalidateSelf();
        jVar.f4418f = AndroidUtilities.dp(1.0f);
        frameLayout.setBackground(jVar);
        addView(frameLayout, w7.z5.e(40, 40, 17));
        View view = new View(context);
        this.f5936b = view;
        view.setBackground(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(40.0f), -13522392));
        frameLayout.addView(view, w7.z5.e(38, 38, 17));
        view.setAlpha(0.0f);
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
        s1 s1Var = new s1(context);
        this.d = s1Var;
        addView(s1Var, w7.z5.e(42, 42, 17));
        ImageView imageView = new ImageView(context);
        this.f5937c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(0.75f);
        imageView.setScaleY(0.75f);
        imageView.setColorFilter(new PorterDuffColorFilter(-2960428, PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, w7.z5.e(40, 40, 17));
        b(false, false);
    }

    public final void a(boolean z10, boolean z11) {
        int i10;
        if (this.e == z10 && z11) {
            return;
        }
        this.e = z10;
        ValueAnimator valueAnimator = this.f5938f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f5938f = null;
        }
        boolean z12 = true;
        float f7 = 1.0f;
        s1 s1Var = this.d;
        if (!z11) {
            if (z10) {
                f7 = 0.0f;
            }
            s1Var.setAlpha(f7);
            if (z10) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            s1Var.setVisibility(i10);
        } else {
            s1Var.setVisibility(0);
            float alpha = s1Var.getAlpha();
            if (z10) {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f7);
            this.f5938f = ofFloat;
            ofFloat.addUpdateListener(new r1(this, 0));
            this.f5938f.setDuration(320L);
            this.f5938f.setInterpolator(bs.h);
            this.f5938f.start();
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
        ImageView imageView = this.f5937c;
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
        ValueAnimator valueAnimator = this.f5940r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f5940r = null;
        }
        float f7 = 0.0f;
        if (!z11) {
            if (z10) {
                f7 = 1.0f;
            }
            this.f5939n = f7;
            View view = this.f5936b;
            view.setAlpha(1.0f - f7);
            view.setScaleX(1.0f - this.f5939n);
            view.setScaleY(1.0f - this.f5939n);
            this.f5937c.setColorFilter(new PorterDuffColorFilter(i0.a.f(this.f5939n, -1, -2960428), PorterDuff.Mode.SRC_IN));
            this.f5935a.invalidate();
            return;
        }
        float f10 = this.f5939n;
        if (z10) {
            f7 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f5940r = ofFloat;
        ofFloat.addUpdateListener(new r1(this, 1));
        this.f5940r.setInterpolator(bs.h);
        this.f5940r.setDuration(420L);
        this.f5940r.start();
    }
}
