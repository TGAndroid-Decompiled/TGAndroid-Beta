package di;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
public final class t1 extends FrameLayout {
    public final FrameLayout f9178a;
    public final View f9179b;
    public final ImageView f9180c;
    public final s1 d;
    public boolean e;
    public ValueAnimator f9181f;
    public boolean h;
    public float f9182n;
    public ValueAnimator f9183r;

    public t1(Context context, fh.b bVar) {
        super(context);
        gb1.b(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f9178a = frameLayout;
        ch.i iVar = new ch.i();
        iVar.a(bVar);
        iVar.f6355g.setColor(-14670806);
        iVar.invalidateSelf();
        iVar.f6354f = AndroidUtilities.dp(1.0f);
        frameLayout.setBackground(iVar);
        addView(frameLayout, gb1.i(40, 40, 17));
        View view = new View(context);
        this.f9179b = view;
        view.setBackground(org.telegram.ui.ActionBar.y6.K(AndroidUtilities.dp(40.0f), -13522392));
        frameLayout.addView(view, gb1.i(38, 38, 17));
        view.setAlpha(0.0f);
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
        s1 s1Var = new s1(context);
        this.d = s1Var;
        addView(s1Var, gb1.i(42, 42, 17));
        ImageView imageView = new ImageView(context);
        this.f9180c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(0.75f);
        imageView.setScaleY(0.75f);
        imageView.setColorFilter(new PorterDuffColorFilter(-2960428, PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, gb1.i(40, 40, 17));
        b(false, false);
    }

    public final void a(boolean z10, boolean z11) {
        int i10;
        if (this.e == z10 && z11) {
            return;
        }
        this.e = z10;
        ValueAnimator valueAnimator = this.f9181f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f9181f = null;
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
            this.f9181f = ofFloat;
            ofFloat.addUpdateListener(new r1(this, 0));
            this.f9181f.setDuration(320L);
            this.f9181f.setInterpolator(ds.h);
            this.f9181f.start();
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
        ImageView imageView = this.f9180c;
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
        ValueAnimator valueAnimator = this.f9183r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f9183r = null;
        }
        float f7 = 0.0f;
        if (!z11) {
            if (z10) {
                f7 = 1.0f;
            }
            this.f9182n = f7;
            View view = this.f9179b;
            view.setAlpha(1.0f - f7);
            view.setScaleX(1.0f - this.f9182n);
            view.setScaleY(1.0f - this.f9182n);
            this.f9180c.setColorFilter(new PorterDuffColorFilter(i0.a.f(this.f9182n, -1, -2960428), PorterDuff.Mode.SRC_IN));
            this.f9178a.invalidate();
            return;
        }
        float f10 = this.f9182n;
        if (z10) {
            f7 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f9183r = ofFloat;
        ofFloat.addUpdateListener(new r1(this, 1));
        this.f9183r.setInterpolator(ds.h);
        this.f9183r.setDuration(420L);
        this.f9183r.start();
    }
}
