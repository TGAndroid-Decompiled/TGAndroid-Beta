package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import org.telegram.messenger.ApplicationLoaderImpl;
import org.telegram.messenger.a;
public final class jac extends nx0 {
    public final Drawable l1;
    public final iac m1;
    public AnimatorSet n1;
    public final View o1;
    public final LinearLayout p1;
    public int q1;
    public final int[] r1;

    public jac(Context context, mh0 mh0Var) {
        super(context, false);
        this.r1 = new int[2];
        setCanceledOnTouchOutside(false);
        this.v0 = false;
        this.w0 = false;
        Drawable e = c00.e(context, 2131232744);
        this.l1 = e;
        e.setColorFilter(new PorterDuffColorFilter(aob.w0(null, aob.h5, false), PorterDuff.Mode.MULTIPLY));
        h8b h8bVar = new h8b((byte) 7, context, this);
        h8bVar.setWillNotDraw(false);
        this.b = h8bVar;
        iac iacVar = new iac(this, context);
        this.m1 = iacVar;
        iacVar.setFillViewport(true);
        iacVar.setWillNotDraw(false);
        iacVar.setClipToPadding(false);
        iacVar.setVerticalScrollBarEnabled(false);
        h8bVar.addView(iacVar, tre.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 130.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.p1 = linearLayout;
        linearLayout.setOrientation(1);
        iacVar.addView(linearLayout, tre.x(-1, -2, 51));
        TextView textView = new TextView(context);
        ik8.v(textView, 1, 20.0f);
        int i = aob.j5;
        textView.setTextColor(aob.w0(null, i, false));
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(ob6.M0(2131754222, null));
        linearLayout.addView(textView, tre.t(-2, -2, 49, 23, 16, 23, 0));
        TextView textView2 = new TextView(getContext());
        textView2.setTextColor(aob.w0(null, aob.r5, false));
        textView2.setTextSize(1, 14.0f);
        textView2.setMovementMethod(new dl((byte) 0));
        int i2 = aob.k5;
        textView2.setLinkTextColor(aob.w0(null, i2, false));
        textView2.setText(ob6.a0(null, null, 2131754235, mh0Var.b, Integer.valueOf(mh0Var.a)));
        textView2.setGravity(49);
        linearLayout.addView(textView2, tre.t(-2, -2, 49, 23, 0, 23, 5));
        String str = mh0Var.c;
        if (!TextUtils.isEmpty(str)) {
            TextView textView3 = new TextView(getContext());
            textView3.setTextColor(aob.w0(null, i, false));
            textView3.setTextSize(1, 14.0f);
            textView3.setMovementMethod(new dl((byte) 0));
            textView3.setLinkTextColor(aob.w0(null, i2, false));
            textView3.setText(pv3.m(str, textView3.getPaint().getFontMetricsInt(), false, null, 0));
            jn7.i(textView3);
            textView3.setGravity(51);
            linearLayout.addView(textView3, tre.t(-2, -2, 51, 23, 15, 23, 0));
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, hl.e1(), 83);
        layoutParams.bottomMargin = hl.L(130.0f);
        View view = new View(context);
        this.o1 = view;
        view.setBackgroundColor(aob.w0(null, aob.V5, false));
        view.setAlpha(0.0f);
        view.setTag(1);
        h8bVar.addView(view, layoutParams);
        c51 c51Var = new c51(null, context, true);
        File g = a.a.g();
        if (g != null) {
            c51Var.i(ob6.a0(null, null, 2131754218, new Object[0]), false, true);
            c51Var.setOnClickListener(new jjb(this, g, (byte) 8));
        } else {
            c51Var.i(ob6.a0(null, null, 2131754220, new Object[0]), false, true);
            c51Var.setOnClickListener(new View.OnClickListener(this) {
                public final jac b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view2) {
                    byte b = r2;
                    jac jacVar = this.b;
                    switch (b) {
                        case 0:
                            ((ApplicationLoaderImpl) a.a).getClass();
                            ph0.e().b(false);
                            jacVar.dismiss();
                            return;
                        default:
                            jacVar.dismiss();
                            return;
                    }
                }
            });
        }
        h8bVar.addView(c51Var, tre.d(-1, 48.0f, 87, 20.0f, 0.0f, 20.0f, 60.0f));
        c51 c51Var2 = new c51(null, context, false);
        c51Var2.i(ob6.M0(2131754217, null), false, true);
        c51Var2.setOnClickListener(new View.OnClickListener(this) {
            public final jac b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                byte b = r2;
                jac jacVar = this.b;
                switch (b) {
                    case 0:
                        ((ApplicationLoaderImpl) a.a).getClass();
                        ph0.e().b(false);
                        jacVar.dismiss();
                        return;
                    default:
                        jacVar.dismiss();
                        return;
                }
            }
        });
        h8bVar.addView(c51Var2, tre.d(-1, 48.0f, 87, 20.0f, 4.0f, 20.0f, 8.0f));
    }

    @Override
    public final boolean D() {
        return false;
    }

    public final void E0(boolean z) {
        Integer num;
        float f;
        View view = this.o1;
        Object tag = view.getTag();
        if (z) {
            if (tag != null) {
                num = null;
            } else {
                return;
            }
        } else if (tag == null) {
            num = 1;
        } else {
            return;
        }
        view.setTag(num);
        if (z) {
            view.setVisibility(0);
        }
        AnimatorSet animatorSet = this.n1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.n1 = animatorSet2;
        Property property = View.ALPHA;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f));
        this.n1.setDuration(150L);
        this.n1.addListener(new i1a((byte) 13, this, z));
        this.n1.start();
    }

    public final void F0() {
        LinearLayout linearLayout = this.p1;
        View childAt = linearLayout.getChildAt(0);
        int[] iArr = this.r1;
        childAt.getLocationInWindow(iArr);
        int max = Math.max(iArr[1] - hl.L(24.0f), 0);
        if (linearLayout.getMeasuredHeight() + iArr[1] <= this.b.getTranslationY() + (this.c.getMeasuredHeight() - hl.L(113.0f))) {
            E0(false);
        } else {
            E0(true);
        }
        if (this.q1 != max) {
            this.q1 = max;
            this.m1.invalidate();
        }
    }
}
