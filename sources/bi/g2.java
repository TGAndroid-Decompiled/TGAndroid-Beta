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
import org.telegram.ui.Components.es;
public final class g2 extends FrameLayout {
    public final FrameLayout f3067a;
    public final View f3068b;
    public final ImageView f3069c;
    public final f2 d;
    public boolean e;
    public ValueAnimator f3070f;
    public boolean h;
    public float f3071n;
    public ValueAnimator f3072r;

    public g2(Context context, eh.b bVar) {
        super(context);
        w7.c6.a(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f3067a = frameLayout;
        bh.j jVar = new bh.j();
        jVar.a(bVar);
        jVar.f2802g.setColor(-14670806);
        jVar.invalidateSelf();
        jVar.f2801f = AndroidUtilities.dp(1.0f);
        frameLayout.setBackground(jVar);
        addView(frameLayout, w7.a6.e(40, 40, 17));
        View view = new View(context);
        this.f3068b = view;
        view.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(40.0f), -13522392));
        frameLayout.addView(view, w7.a6.e(38, 38, 17));
        view.setAlpha(0.0f);
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
        f2 f2Var = new f2(context);
        this.d = f2Var;
        addView(f2Var, w7.a6.e(42, 42, 17));
        ImageView imageView = new ImageView(context);
        this.f3069c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(0.75f);
        imageView.setScaleY(0.75f);
        imageView.setColorFilter(new PorterDuffColorFilter(-2960428, PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, w7.a6.e(40, 40, 17));
        b(false, false);
    }

    public final void a(boolean z10, boolean z11) {
        int i10;
        if (this.e == z10 && z11) {
            return;
        }
        this.e = z10;
        ValueAnimator valueAnimator = this.f3070f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f3070f = null;
        }
        boolean z12 = true;
        float f7 = 1.0f;
        f2 f2Var = this.d;
        if (!z11) {
            if (z10) {
                f7 = 0.0f;
            }
            f2Var.setAlpha(f7);
            if (z10) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            f2Var.setVisibility(i10);
        } else {
            f2Var.setVisibility(0);
            float alpha = f2Var.getAlpha();
            if (z10) {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f7);
            this.f3070f = ofFloat;
            ofFloat.addUpdateListener(new e2(this, 0));
            this.f3070f.setDuration(320L);
            this.f3070f.setInterpolator(es.h);
            this.f3070f.start();
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
        ImageView imageView = this.f3069c;
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
        ValueAnimator valueAnimator = this.f3072r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f3072r = null;
        }
        float f7 = 0.0f;
        if (!z11) {
            if (z10) {
                f7 = 1.0f;
            }
            this.f3071n = f7;
            View view = this.f3068b;
            view.setAlpha(1.0f - f7);
            view.setScaleX(1.0f - this.f3071n);
            view.setScaleY(1.0f - this.f3071n);
            this.f3069c.setColorFilter(new PorterDuffColorFilter(i0.a.d(this.f3071n, -1, -2960428), PorterDuff.Mode.SRC_IN));
            this.f3067a.invalidate();
            return;
        }
        float f10 = this.f3071n;
        if (z10) {
            f7 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f3072r = ofFloat;
        ofFloat.addUpdateListener(new e2(this, 1));
        this.f3072r.setInterpolator(es.h);
        this.f3072r.setDuration(420L);
        this.f3072r.start();
    }
}
