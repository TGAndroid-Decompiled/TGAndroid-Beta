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
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
public final class t5 extends FrameLayout {
    public final int f12853a;
    public int f12854b;
    public final bi.s1 f12855c;
    public final FrameLayout d;
    public final di.i8 f12856e;
    public boolean f12857f;
    public boolean h;

    public t5(Activity activity, int i7, di.b bVar) {
        super(activity);
        this.f12854b = 1;
        this.f12857f = false;
        this.h = false;
        this.f12853a = i7;
        TLRPC.User f10 = p10.i(i7).f();
        bi.s1 s1Var = new bi.s1(this, getContext());
        this.f12855c = s1Var;
        di.f4 f4Var = new di.f4(getContext(), null);
        di.d4 d4Var = f4Var.f8985a;
        d4Var.getAvatarDrawable().r(f10);
        d4Var.e(f10, d4Var.getAvatarDrawable());
        String p10 = t10.p(f10);
        di.e4 e4Var = f4Var.f8986b;
        e4Var.l(org.telegram.messenger.i6.m(p10, e4Var.getPaint().getFontMetricsInt(), false, null, 0), false);
        f4Var.c(id.M0(2131745998, null), false);
        s1Var.addView(f4Var, c8.ha.d(-1, -2.0f, 55, 0.0f, 17.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(activity);
        imageView.setImageDrawable(getContext().getResources().getDrawable(2131231269).mutate());
        imageView.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        s1Var.addView(imageView, c8.ha.d(40, 40.0f, 53, 12.0f, 15.0f, 12.0f, 0.0f));
        addView(s1Var, c8.ha.c(-2.0f, -1));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.d = frameLayout;
        di.i8 i8Var = new di.i8(getContext(), bVar);
        this.f12856e = i8Var;
        i8Var.f9141s0 = true;
        i8Var.setTranslationY(org.telegram.messenger.g0.L(8.0f));
        frameLayout.addView(i8Var, c8.ha.d(-1, -1.0f, 87, 0.0f, 0.0f, 0.0f, 64.0f));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(2131232363);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        frameLayout.addView(imageView2, c8.ha.d(28, 28.0f, 85, 0.0f, 0.0f, 12.0f, 16.0f));
        FrameLayout frameLayout2 = new FrameLayout(activity);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.l6.d0(org.telegram.messenger.g0.L(22.0f), i0.a.o(-16777216, 122)));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 18.0f);
        textView.setTextColor(1694498815);
        textView.setText(id.M0(2131746255, null));
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
            if (this.f12857f != z10) {
                this.f12857f = z10;
            } else {
                return;
            }
        } else if (this.h != z10) {
            this.h = z10;
        } else {
            return;
        }
        if (z9) {
            view = this.f12855c;
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
        this.f12856e.f9125b0.b(org.telegram.ui.Components.r5.cloneSpans(new SpannableString(charSequence)), null, null, false, false);
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
