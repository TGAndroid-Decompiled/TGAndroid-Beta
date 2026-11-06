package fi;

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
import org.telegram.messenger.hd;
import org.telegram.messenger.p10;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
public final class t5 extends FrameLayout {
    public final int f12854a;
    public int f12855b;
    public final bi.s1 f12856c;
    public final FrameLayout d;
    public final di.h8 f12857e;
    public boolean f12858f;
    public boolean h;

    public t5(Activity activity, int i7, di.b bVar) {
        super(activity);
        this.f12855b = 1;
        this.f12858f = false;
        this.h = false;
        this.f12854a = i7;
        TLRPC.User f10 = p10.i(i7).f();
        bi.s1 s1Var = new bi.s1(this, getContext());
        this.f12856c = s1Var;
        di.e4 e4Var = new di.e4(getContext(), null);
        di.c4 c4Var = e4Var.f8959a;
        c4Var.getAvatarDrawable().r(f10);
        c4Var.e(f10, c4Var.getAvatarDrawable());
        String p10 = t10.p(f10);
        di.d4 d4Var = e4Var.f8960b;
        d4Var.l(org.telegram.messenger.i6.m(p10, d4Var.getPaint().getFontMetricsInt(), false, null, 0), false);
        e4Var.c(hd.M0(2131745999, null), false);
        s1Var.addView(e4Var, c8.ha.d(-1, -2.0f, 55, 0.0f, 17.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(activity);
        imageView.setImageDrawable(getContext().getResources().getDrawable(2131231269).mutate());
        imageView.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        s1Var.addView(imageView, c8.ha.d(40, 40.0f, 53, 12.0f, 15.0f, 12.0f, 0.0f));
        addView(s1Var, c8.ha.c(-2.0f, -1));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.d = frameLayout;
        di.h8 h8Var = new di.h8(getContext(), bVar);
        this.f12857e = h8Var;
        h8Var.f9111s0 = true;
        h8Var.setTranslationY(org.telegram.messenger.g0.L(8.0f));
        frameLayout.addView(h8Var, c8.ha.d(-1, -1.0f, 87, 0.0f, 0.0f, 0.0f, 64.0f));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(2131232363);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        frameLayout.addView(imageView2, c8.ha.d(28, 28.0f, 85, 0.0f, 0.0f, 12.0f, 16.0f));
        FrameLayout frameLayout2 = new FrameLayout(activity);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(22.0f), i0.a.o(-16777216, 122)));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 18.0f);
        textView.setTextColor(1694498815);
        textView.setText(hd.M0(2131746256, null));
        frameLayout2.addView(textView, c8.ha.d(-2, -2.0f, 19, 24.0f, 0.0f, 24.0f, 0.0f));
        ImageView imageView3 = new ImageView(activity);
        imageView3.setImageResource(2131231495);
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        frameLayout2.addView(imageView3, c8.ha.d(28, 28.0f, 21, 0.0f, 0.0f, 9.0f, 0.0f));
        frameLayout.addView(frameLayout2, c8.ha.d(-1, 44.0f, 87, 9.0f, 8.0f, 55.0f, 8.0f));
        addView(frameLayout, c8.ha.c(-1.0f, -1));
        s1Var.setAlpha(0.0f);
        frameLayout.setAlpha(0.0f);
        setImportantForAccessibility(4);
    }

    public final void a(boolean z9, boolean z10, FrameLayout frameLayout) {
        View view;
        float f10;
        if (z9) {
            if (this.f12858f != z10) {
                this.f12858f = z10;
            } else {
                return;
            }
        } else if (this.h != z10) {
            this.h = z10;
        } else {
            return;
        }
        if (z9) {
            view = this.f12856c;
        } else {
            view = this.d;
        }
        view.clearAnimation();
        ViewPropertyAnimator animate = view.animate();
        float f11 = 0.0f;
        if (z10) {
            if (z9) {
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
            if (!z10) {
                f11 = 1.0f;
            }
            animate2.alpha(f11).start();
        }
    }

    public final void b(CharSequence charSequence) {
        this.f12857e.f9095b0.b(org.telegram.ui.Components.r5.cloneSpans(new SpannableString(charSequence)), null, null, false, false);
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
