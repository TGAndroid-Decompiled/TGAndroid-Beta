package hi;

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
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLRPC;
public final class q5 extends FrameLayout {
    public final int f15270a;
    public int f15271b;
    public final di.d1 f15272c;
    public final FrameLayout d;
    public final fi.x7 f15273e;
    public boolean f15274f;
    public boolean h;

    public q5(Activity activity, int i7, fi.b bVar) {
        super(activity);
        this.f15271b = 1;
        this.f15274f = false;
        this.h = false;
        this.f15270a = i7;
        TLRPC.User f10 = j10.i(i7).f();
        di.d1 d1Var = new di.d1(this, getContext());
        this.f15272c = d1Var;
        fi.v3 v3Var = new fi.v3(getContext(), null);
        fi.t3 t3Var = v3Var.f12637a;
        t3Var.getAvatarDrawable().r(f10);
        t3Var.f(f10, t3Var.getAvatarDrawable());
        String q10 = o10.q(f10);
        fi.u3 u3Var = v3Var.f12638b;
        u3Var.l(org.telegram.messenger.j6.m(q10, u3Var.getPaint().getFontMetricsInt(), false, null, 0), false);
        v3Var.c(gd.M0(2131745803, null), false);
        d1Var.addView(v3Var, c8.ma.d(-1, -2.0f, 55, 0.0f, 17.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(activity);
        imageView.setImageDrawable(getContext().getResources().getDrawable(2131231269).mutate());
        imageView.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        d1Var.addView(imageView, c8.ma.d(40, 40.0f, 53, 12.0f, 15.0f, 12.0f, 0.0f));
        addView(d1Var, c8.ma.c(-2.0f, -1));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.d = frameLayout;
        fi.x7 x7Var = new fi.x7(getContext(), bVar);
        this.f15273e = x7Var;
        x7Var.f12753t0 = true;
        x7Var.setTranslationY(org.telegram.messenger.g0.L(8.0f));
        frameLayout.addView(x7Var, c8.ma.d(-1, -1.0f, 87, 0.0f, 0.0f, 0.0f, 64.0f));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(2131232365);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        frameLayout.addView(imageView2, c8.ma.d(28, 28.0f, 85, 0.0f, 0.0f, 12.0f, 16.0f));
        FrameLayout frameLayout2 = new FrameLayout(activity);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(22.0f), i0.a.o(-16777216, 122)));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 18.0f);
        textView.setTextColor(1694498815);
        textView.setText(gd.M0(2131746060, null));
        frameLayout2.addView(textView, c8.ma.d(-2, -2.0f, 19, 24.0f, 0.0f, 24.0f, 0.0f));
        ImageView imageView3 = new ImageView(activity);
        imageView3.setImageResource(2131231495);
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        frameLayout2.addView(imageView3, c8.ma.d(28, 28.0f, 21, 0.0f, 0.0f, 9.0f, 0.0f));
        frameLayout.addView(frameLayout2, c8.ma.d(-1, 44.0f, 87, 9.0f, 8.0f, 55.0f, 8.0f));
        addView(frameLayout, c8.ma.c(-1.0f, -1));
        d1Var.setAlpha(0.0f);
        frameLayout.setAlpha(0.0f);
        setImportantForAccessibility(4);
    }

    public final void a(boolean z10, boolean z11, FrameLayout frameLayout) {
        View view;
        float f10;
        if (z10) {
            if (this.f15274f != z11) {
                this.f15274f = z11;
            } else {
                return;
            }
        } else if (this.h != z11) {
            this.h = z11;
        } else {
            return;
        }
        if (z10) {
            view = this.f15272c;
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
        this.f15273e.f12737c0.b(org.telegram.ui.Components.x5.cloneSpans(new SpannableString(charSequence)), null, null, false, false);
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
