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
public final class zk8 extends FrameLayout {
    public final int a;
    public int b;
    public final ec0 c;
    public final FrameLayout d;
    public final l5b e;
    public boolean f;
    public boolean h;

    public zk8(Activity activity, int i, r63 r63Var) {
        super(activity);
        this.b = 1;
        this.f = false;
        this.h = false;
        this.a = i;
        TLRPC.User f = z8c.h(i).f();
        ec0 ec0Var = new ec0(this, getContext());
        this.c = ec0Var;
        x48 x48Var = new x48(getContext(), null);
        kc0 kc0Var = x48Var.a;
        kc0Var.getAvatarDrawable().q(f);
        kc0Var.f(f, kc0Var.getAvatarDrawable());
        String r = m9c.r(f);
        dg0 dg0Var = x48Var.b;
        dg0Var.l(gw3.m(r, dg0Var.getPaint().getFontMetricsInt(), false, null, 0), false);
        x48Var.b(jb6.M0(2131745731, null), false);
        ec0Var.addView(x48Var, qoe.d(-1, -2.0f, 55, 0.0f, 17.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(activity);
        imageView.setImageDrawable(getContext().getResources().getDrawable(2131231273).mutate());
        imageView.setPadding(gm.L(8.0f), gm.L(8.0f), gm.L(8.0f), gm.L(8.0f));
        ec0Var.addView(imageView, qoe.d(40, 40.0f, 53, 12.0f, 15.0f, 12.0f, 0.0f));
        addView(ec0Var, qoe.c(-2.0f, -1));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.d = frameLayout;
        l5b l5bVar = new l5b(getContext(), r63Var);
        this.e = l5bVar;
        l5bVar.s0 = true;
        l5bVar.setTranslationY(gm.L(8.0f));
        frameLayout.addView(l5bVar, qoe.d(-1, -1.0f, 87, 0.0f, 0.0f, 0.0f, 64.0f));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(2131232369);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        frameLayout.addView(imageView2, qoe.d(28, 28.0f, 85, 0.0f, 0.0f, 12.0f, 16.0f));
        FrameLayout frameLayout2 = new FrameLayout(activity);
        frameLayout2.setBackground(cmb.b0(gm.L(22.0f), on2.p(-16777216, 122)));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 18.0f);
        textView.setTextColor(1694498815);
        textView.setText(jb6.M0(2131745988, null));
        frameLayout2.addView(textView, qoe.d(-2, -2.0f, 19, 24.0f, 0.0f, 24.0f, 0.0f));
        ImageView imageView3 = new ImageView(activity);
        imageView3.setImageResource(2131231499);
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        frameLayout2.addView(imageView3, qoe.d(28, 28.0f, 21, 0.0f, 0.0f, 9.0f, 0.0f));
        frameLayout.addView(frameLayout2, qoe.d(-1, 44.0f, 87, 9.0f, 8.0f, 55.0f, 8.0f));
        addView(frameLayout, qoe.c(-1.0f, -1));
        ec0Var.setAlpha(0.0f);
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
        this.e.b0.b(gn.cloneSpans(new SpannableString(charSequence)), null, null, false, false);
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
