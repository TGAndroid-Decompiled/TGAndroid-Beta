package defpackage;

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
import org.telegram.tgnet.TLRPC;
public final class jm8 extends FrameLayout {
    public final int a;
    public int b;
    public final gb0 c;
    public final FrameLayout d;
    public final g7b e;
    public boolean f;
    public boolean h;

    public jm8(Activity activity, int i, x53 x53Var) {
        super(activity);
        this.b = 1;
        this.f = false;
        this.h = false;
        this.a = i;
        TLRPC.User f = yac.h(i).f();
        gb0 gb0Var = new gb0(this, getContext());
        this.c = gb0Var;
        l68 l68Var = new l68(getContext(), null);
        mb0 mb0Var = l68Var.a;
        mb0Var.getAvatarDrawable().q(f);
        mb0Var.f(f, mb0Var.getAvatarDrawable());
        String r = lbc.r(f);
        ff0 ff0Var = l68Var.b;
        ff0Var.l(pv3.m(r, ff0Var.getPaint().getFontMetricsInt(), false, null, 0), false);
        l68Var.b(ob6.M0(2131745725, null), false);
        gb0Var.addView(l68Var, tre.d(-1, -2.0f, 55, 0.0f, 17.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(activity);
        imageView.setImageDrawable(getContext().getResources().getDrawable(2131231272).mutate());
        imageView.setPadding(hl.L(8.0f), hl.L(8.0f), hl.L(8.0f), hl.L(8.0f));
        gb0Var.addView(imageView, tre.d(40, 40.0f, 53, 12.0f, 15.0f, 12.0f, 0.0f));
        addView(gb0Var, tre.c(-2.0f, -1));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.d = frameLayout;
        g7b g7bVar = new g7b(getContext(), x53Var);
        this.e = g7bVar;
        g7bVar.s0 = true;
        g7bVar.setTranslationY(hl.L(8.0f));
        frameLayout.addView(g7bVar, tre.d(-1, -1.0f, 87, 0.0f, 0.0f, 0.0f, 64.0f));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(2131232368);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        frameLayout.addView(imageView2, tre.d(28, 28.0f, 85, 0.0f, 0.0f, 12.0f, 16.0f));
        FrameLayout frameLayout2 = new FrameLayout(activity);
        frameLayout2.setBackground(aob.b0(hl.L(22.0f), vm2.o(-16777216, 122)));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 18.0f);
        textView.setTextColor(1694498815);
        textView.setText(ob6.M0(2131745982, null));
        frameLayout2.addView(textView, tre.d(-2, -2.0f, 19, 24.0f, 0.0f, 24.0f, 0.0f));
        ImageView imageView3 = new ImageView(activity);
        imageView3.setImageResource(2131231498);
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        frameLayout2.addView(imageView3, tre.d(28, 28.0f, 21, 0.0f, 0.0f, 9.0f, 0.0f));
        frameLayout.addView(frameLayout2, tre.d(-1, 44.0f, 87, 9.0f, 8.0f, 55.0f, 8.0f));
        addView(frameLayout, tre.c(-1.0f, -1));
        gb0Var.setAlpha(0.0f);
        frameLayout.setAlpha(0.0f);
        setImportantForAccessibility(4);
    }

    public final void a(boolean z, boolean z2, FrameLayout frameLayout) {
        View view;
        float f;
        if (z) {
            if (this.f != z2) {
                this.f = z2;
                view = this.c;
            } else {
                return;
            }
        } else if (this.h != z2) {
            this.h = z2;
            view = this.d;
        } else {
            return;
        }
        view.clearAnimation();
        ViewPropertyAnimator animate = view.animate();
        float f2 = 0.0f;
        if (z2) {
            if (z) {
                f = 0.5f;
            } else {
                f = 0.2f;
            }
        } else {
            f = 0.0f;
        }
        animate.alpha(f).start();
        if (frameLayout != null) {
            frameLayout.clearAnimation();
            ViewPropertyAnimator animate2 = frameLayout.animate();
            if (!z2) {
                f2 = 1.0f;
            }
            animate2.alpha(f2).start();
        }
    }

    public final void b(CharSequence charSequence) {
        this.e.b0.b(hm.cloneSpans(new SpannableString(charSequence)), null, null, false, false);
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
