package ih;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.gr;
public final class p1 extends FrameLayout {
    public final FrameLayout f11932a;
    public final View f11933b;
    public final ImageView f11934c;
    public final o1 d;
    public boolean f11935e;
    public ValueAnimator f11936f;
    public boolean h;
    public float f11937n;
    public ValueAnimator f11938r;

    public p1(Context context, lg.b bVar) {
        super(context);
        g7.g6.a(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f11932a = frameLayout;
        ig.i iVar = new ig.i();
        iVar.a(bVar);
        iVar.f11194g.setColor(-14670806);
        iVar.invalidateSelf();
        iVar.f11193f = AndroidUtilities.dp(1.0f);
        frameLayout.setBackground(iVar);
        addView(frameLayout, g7.e6.e(40, 40, 17));
        View view = new View(context);
        this.f11933b = view;
        view.setBackground(org.telegram.ui.ActionBar.f6.K(AndroidUtilities.dp(40.0f), -13522392));
        frameLayout.addView(view, g7.e6.e(38, 38, 17));
        view.setAlpha(0.0f);
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
        o1 o1Var = new o1(context);
        this.d = o1Var;
        addView(o1Var, g7.e6.e(42, 42, 17));
        ImageView imageView = new ImageView(context);
        this.f11934c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(0.75f);
        imageView.setScaleY(0.75f);
        imageView.setColorFilter(new PorterDuffColorFilter(-2960428, PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, g7.e6.e(40, 40, 17));
        b(false, false);
    }

    public final void a(boolean z10, boolean z11) {
        int i9;
        if (this.f11935e == z10 && z11) {
            return;
        }
        this.f11935e = z10;
        ValueAnimator valueAnimator = this.f11936f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f11936f = null;
        }
        boolean z12 = true;
        float f10 = 1.0f;
        o1 o1Var = this.d;
        if (!z11) {
            if (z10) {
                f10 = 0.0f;
            }
            o1Var.setAlpha(f10);
            if (z10) {
                i9 = 8;
            } else {
                i9 = 0;
            }
            o1Var.setVisibility(i9);
        } else {
            o1Var.setVisibility(0);
            float alpha = o1Var.getAlpha();
            if (z10) {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f10);
            this.f11936f = ofFloat;
            ofFloat.addUpdateListener(new n1(this, 0));
            this.f11936f.setDuration(320L);
            this.f11936f.setInterpolator(gr.h);
            this.f11936f.start();
        }
        if (!this.h && z10) {
            z12 = false;
        }
        c(z12, z11);
    }

    public final void b(boolean z10, boolean z11) {
        int i9;
        boolean z12;
        int i10;
        this.h = z10;
        ImageView imageView = this.f11934c;
        if (!z11) {
            if (z10) {
                i10 = R.drawable.msg_voice_muted;
            } else {
                i10 = R.drawable.msg_voice_unmuted;
            }
            AndroidUtilities.updateImageViewImageAnimated(imageView, i10);
        } else {
            if (z10) {
                i9 = R.drawable.msg_voice_muted;
            } else {
                i9 = R.drawable.msg_voice_unmuted;
            }
            imageView.setImageResource(i9);
        }
        if (!z10 && this.f11935e) {
            z12 = false;
        } else {
            z12 = true;
        }
        c(z12, z11);
    }

    public final void c(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.f11938r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f11938r = null;
        }
        float f10 = 0.0f;
        if (!z11) {
            if (z10) {
                f10 = 1.0f;
            }
            this.f11937n = f10;
            View view = this.f11933b;
            view.setAlpha(1.0f - f10);
            view.setScaleX(1.0f - this.f11937n);
            view.setScaleY(1.0f - this.f11937n);
            this.f11934c.setColorFilter(new PorterDuffColorFilter(i0.a.d(this.f11937n, -1, -2960428), PorterDuff.Mode.SRC_IN));
            this.f11932a.invalidate();
            return;
        }
        float f11 = this.f11937n;
        if (z10) {
            f10 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f11938r = ofFloat;
        ofFloat.addUpdateListener(new n1(this, 1));
        this.f11938r.setInterpolator(gr.h);
        this.f11938r.setDuration(420L);
        this.f11938r.start();
    }
}
