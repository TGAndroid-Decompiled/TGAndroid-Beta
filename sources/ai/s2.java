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
import org.telegram.ui.Components.is;
public final class s2 extends FrameLayout {
    public final FrameLayout f1691a;
    public final View f1692b;
    public final ImageView f1693c;
    public final r2 d;
    public boolean f1694e;
    public ValueAnimator f1695f;
    public boolean h;
    public float f1696n;
    public ValueAnimator f1697r;

    public s2(Context context, dh.b bVar) {
        super(context);
        w7.z5.a(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f1691a = frameLayout;
        ah.l lVar = new ah.l();
        lVar.a(bVar);
        lVar.f609g.setColor(-14670806);
        lVar.invalidateSelf();
        lVar.f608f = AndroidUtilities.dp(1.0f);
        frameLayout.setBackground(lVar);
        addView(frameLayout, w7.x5.e(40, 40, 17));
        View view = new View(context);
        this.f1692b = view;
        view.setBackground(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(40.0f), -13522392));
        frameLayout.addView(view, w7.x5.e(38, 38, 17));
        view.setAlpha(0.0f);
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
        r2 r2Var = new r2(context);
        this.d = r2Var;
        addView(r2Var, w7.x5.e(42, 42, 17));
        ImageView imageView = new ImageView(context);
        this.f1693c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(0.75f);
        imageView.setScaleY(0.75f);
        imageView.setColorFilter(new PorterDuffColorFilter(-2960428, PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, w7.x5.e(40, 40, 17));
        b(false, false);
    }

    public final void a(boolean z10, boolean z11) {
        int i10;
        if (this.f1694e == z10 && z11) {
            return;
        }
        this.f1694e = z10;
        ValueAnimator valueAnimator = this.f1695f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f1695f = null;
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
            this.f1695f = ofFloat;
            ofFloat.addUpdateListener(new q2(this, 0));
            this.f1695f.setDuration(320L);
            this.f1695f.setInterpolator(is.h);
            this.f1695f.start();
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
        ImageView imageView = this.f1693c;
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
        if (!z10 && this.f1694e) {
            z12 = false;
        } else {
            z12 = true;
        }
        c(z12, z11);
    }

    public final void c(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.f1697r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f1697r = null;
        }
        float f7 = 0.0f;
        if (!z11) {
            if (z10) {
                f7 = 1.0f;
            }
            this.f1696n = f7;
            View view = this.f1692b;
            view.setAlpha(1.0f - f7);
            view.setScaleX(1.0f - this.f1696n);
            view.setScaleY(1.0f - this.f1696n);
            this.f1693c.setColorFilter(new PorterDuffColorFilter(i0.a.d(this.f1696n, -1, -2960428), PorterDuff.Mode.SRC_IN));
            this.f1691a.invalidate();
            return;
        }
        float f10 = this.f1696n;
        if (z10) {
            f7 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f1697r = ofFloat;
        ofFloat.addUpdateListener(new q2(this, 1));
        this.f1697r.setInterpolator(is.h);
        this.f1697r.setDuration(420L);
        this.f1697r.start();
    }
}
