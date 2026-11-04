package gi;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableString;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.l10;
import org.telegram.tgnet.TLRPC;
public final class r5 extends FrameLayout {
    public final int f13507a;
    public int f13508b;
    public final ci.l1 f13509c;
    public final FrameLayout d;
    public final ei.h8 f13510e;
    public boolean f13511f;
    public boolean h;

    public r5(Activity activity, int i3, ei.b bVar) {
        super(activity);
        this.f13508b = 1;
        this.f13511f = false;
        this.h = false;
        this.f13507a = i3;
        TLRPC.User f10 = h10.i(i3).f();
        ci.l1 l1Var = new ci.l1(this, getContext());
        this.f13509c = l1Var;
        ei.f4 f4Var = new ei.f4(getContext(), null);
        ei.d4 d4Var = f4Var.f10263a;
        d4Var.getAvatarDrawable().r(f10);
        d4Var.e(f10, d4Var.getAvatarDrawable());
        String p10 = l10.p(f10);
        ei.e4 e4Var = f4Var.f10264b;
        e4Var.l(org.telegram.messenger.i6.m(p10, e4Var.getPaint().getFontMetricsInt(), false, null, 0), false);
        f4Var.c(bd.M0(2131746008, null), false);
        l1Var.addView(f4Var, mf.d(-1, -2.0f, 55, 0.0f, 17.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(activity);
        imageView.setImageDrawable(getContext().getResources().getDrawable(2131231269).mutate());
        imageView.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        l1Var.addView(imageView, mf.d(40, 40.0f, 53, 12.0f, 15.0f, 12.0f, 0.0f));
        addView(l1Var, mf.c(-2.0f, -1));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.d = frameLayout;
        ei.h8 h8Var = new ei.h8(getContext(), bVar);
        this.f13510e = h8Var;
        h8Var.f10391t0 = true;
        h8Var.setTranslationY(org.telegram.messenger.g0.L(8.0f));
        frameLayout.addView(h8Var, mf.d(-1, -1.0f, 87, 0.0f, 0.0f, 0.0f, 64.0f));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(2131232363);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        frameLayout.addView(imageView2, mf.d(28, 28.0f, 85, 0.0f, 0.0f, 12.0f, 16.0f));
        FrameLayout frameLayout2 = new FrameLayout(activity);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(22.0f), i0.a.o(-16777216, 122)));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 18.0f);
        textView.setTextColor(1694498815);
        textView.setText(bd.M0(2131746265, null));
        frameLayout2.addView(textView, mf.d(-2, -2.0f, 19, 24.0f, 0.0f, 24.0f, 0.0f));
        ImageView imageView3 = new ImageView(activity);
        imageView3.setImageResource(2131231495);
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        frameLayout2.addView(imageView3, mf.d(28, 28.0f, 21, 0.0f, 0.0f, 9.0f, 0.0f));
        frameLayout.addView(frameLayout2, mf.d(-1, 44.0f, 87, 9.0f, 8.0f, 55.0f, 8.0f));
        addView(frameLayout, mf.c(-1.0f, -1));
        l1Var.setAlpha(0.0f);
        frameLayout.setAlpha(0.0f);
        setImportantForAccessibility(4);
    }

    public final void a(boolean z10, boolean z11, FrameLayout frameLayout) {
        View view;
        float f10;
        if (z10) {
            if (this.f13511f != z11) {
                this.f13511f = z11;
            } else {
                return;
            }
        } else if (this.h != z11) {
            this.h = z11;
        } else {
            return;
        }
        if (z10) {
            view = this.f13509c;
        } else {
            view = this.d;
        }
        view.clearAnimation();
        ViewPropertyAnimator animate = view.animate();
        float f11 = 0.0f;
        if (z11) {
            if (z10) {
                f10 = 0.5f;
            } else {
                f10 = 0.2f;
            }
        } else {
            f10 = 0.0f;
        }
        animate.alpha(f10).start();
        if (frameLayout != null) {
            frameLayout.clearAnimation();
            ViewPropertyAnimator animate2 = frameLayout.animate();
            if (!z11) {
                f11 = 1.0f;
            }
            animate2.alpha(f11).start();
        }
    }

    public final void b(CharSequence charSequence) {
        this.f13510e.f10375c0.b(org.telegram.ui.Components.p5.cloneSpans(new SpannableString(charSequence)), null, null, false, false);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
