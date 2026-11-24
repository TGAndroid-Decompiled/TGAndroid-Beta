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
public final class k8c extends my0 {
    public final Drawable l1;
    public final j8c m1;
    public AnimatorSet n1;
    public final View o1;
    public final LinearLayout p1;
    public int q1;
    public final int[] r1;

    public k8c(Context context, li0 li0Var) {
        super(context, false);
        this.r1 = new int[2];
        setCanceledOnTouchOutside(false);
        this.v0 = false;
        this.w0 = false;
        Drawable d = b10.d(context, 2131232745);
        this.l1 = d;
        d.setColorFilter(new PorterDuffColorFilter(cmb.w0(null, cmb.g5, false), PorterDuff.Mode.MULTIPLY));
        bdb bdbVar = new bdb((byte) 5, context, this);
        bdbVar.setWillNotDraw(false);
        this.b = bdbVar;
        j8c j8cVar = new j8c(this, context);
        this.m1 = j8cVar;
        j8cVar.setFillViewport(true);
        j8cVar.setWillNotDraw(false);
        j8cVar.setClipToPadding(false);
        j8cVar.setVerticalScrollBarEnabled(false);
        bdbVar.addView(j8cVar, qoe.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 130.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.p1 = linearLayout;
        linearLayout.setOrientation(1);
        j8cVar.addView(linearLayout, qoe.x(-1, -2, 51));
        TextView textView = new TextView(context);
        wi8.v(textView, 1, 20.0f);
        int i = cmb.i5;
        textView.setTextColor(cmb.w0(null, i, false));
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(jb6.M0(2131754194, null));
        linearLayout.addView(textView, qoe.t(-2, -2, 49, 23, 16, 23, 0));
        TextView textView2 = new TextView(getContext());
        textView2.setTextColor(cmb.w0(null, cmb.q5, false));
        textView2.setTextSize(1, 14.0f);
        textView2.setMovementMethod(new cm((byte) 0));
        int i2 = cmb.j5;
        textView2.setLinkTextColor(cmb.w0(null, i2, false));
        textView2.setText(jb6.a0(null, null, 2131754207, li0Var.b, Integer.valueOf(li0Var.a)));
        textView2.setGravity(49);
        linearLayout.addView(textView2, qoe.t(-2, -2, 49, 23, 0, 23, 5));
        String str = li0Var.c;
        if (!TextUtils.isEmpty(str)) {
            TextView textView3 = new TextView(getContext());
            textView3.setTextColor(cmb.w0(null, i, false));
            textView3.setTextSize(1, 14.0f);
            textView3.setMovementMethod(new cm((byte) 0));
            textView3.setLinkTextColor(cmb.w0(null, i2, false));
            textView3.setText(gw3.m(str, textView3.getPaint().getFontMetricsInt(), false, null, 0));
            nm7.i(textView3);
            textView3.setGravity(51);
            linearLayout.addView(textView3, qoe.t(-2, -2, 51, 23, 15, 23, 0));
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, gm.e1(), 83);
        layoutParams.bottomMargin = gm.L(130.0f);
        View view = new View(context);
        this.o1 = view;
        view.setBackgroundColor(cmb.w0(null, cmb.U5, false));
        view.setAlpha(0.0f);
        view.setTag(1);
        bdbVar.addView(view, layoutParams);
        b61 b61Var = new b61(null, context, true);
        File g = a.a.g();
        if (g != null) {
            b61Var.i(jb6.a0(null, null, 2131754190, new Object[0]), false, true);
            b61Var.setOnClickListener(new fyb(this, g, (byte) 6));
        } else {
            b61Var.i(jb6.a0(null, null, 2131754192, new Object[0]), false, true);
            b61Var.setOnClickListener(new View.OnClickListener(this) {
                public final k8c b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view2) {
                    byte b = r2;
                    k8c k8cVar = this.b;
                    switch (b) {
                        case 0:
                            ((ApplicationLoaderImpl) a.a).getClass();
                            oi0.e().b(false);
                            k8cVar.dismiss();
                            return;
                        default:
                            k8cVar.dismiss();
                            return;
                    }
                }
            });
        }
        bdbVar.addView(b61Var, qoe.d(-1, 48.0f, 87, 20.0f, 0.0f, 20.0f, 60.0f));
        b61 b61Var2 = new b61(null, context, false);
        b61Var2.i(jb6.M0(2131754189, null), false, true);
        b61Var2.setOnClickListener(new View.OnClickListener(this) {
            public final k8c b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                byte b = r2;
                k8c k8cVar = this.b;
                switch (b) {
                    case 0:
                        ((ApplicationLoaderImpl) a.a).getClass();
                        oi0.e().b(false);
                        k8cVar.dismiss();
                        return;
                    default:
                        k8cVar.dismiss();
                        return;
                }
            }
        });
        bdbVar.addView(b61Var2, qoe.d(-1, 48.0f, 87, 20.0f, 4.0f, 20.0f, 8.0f));
    }

    @Override
    public final boolean C() {
        return false;
    }

    public final void D0(boolean z) {
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
        this.n1.addListener(new sw9((byte) 14, this, z));
        this.n1.start();
    }

    public final void E0() {
        LinearLayout linearLayout = this.p1;
        View childAt = linearLayout.getChildAt(0);
        int[] iArr = this.r1;
        childAt.getLocationInWindow(iArr);
        int max = Math.max(iArr[1] - gm.L(24.0f), 0);
        if (linearLayout.getMeasuredHeight() + iArr[1] <= this.b.getTranslationY() + (this.c.getMeasuredHeight() - gm.L(113.0f))) {
            D0(false);
        } else {
            D0(true);
        }
        if (this.q1 != max) {
            this.q1 = max;
            this.m1.invalidate();
        }
    }
}
