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
public final class j6c extends fx0 {
    public final Drawable l1;
    public final i6c m1;
    public AnimatorSet n1;
    public final View o1;
    public final LinearLayout p1;
    public int q1;
    public final int[] r1;

    public j6c(Context context, lh0 lh0Var) {
        super(context, false);
        this.r1 = new int[2];
        setCanceledOnTouchOutside(false);
        this.v0 = false;
        this.w0 = false;
        Drawable d = b00.d(context, 2131232733);
        this.l1 = d;
        d.setColorFilter(new PorterDuffColorFilter(bkb.w0(null, bkb.g5, false), PorterDuff.Mode.MULTIPLY));
        zab zabVar = new zab((byte) 5, context, this);
        zabVar.setWillNotDraw(false);
        this.b = zabVar;
        i6c i6cVar = new i6c(this, context);
        this.m1 = i6cVar;
        i6cVar.setFillViewport(true);
        i6cVar.setWillNotDraw(false);
        i6cVar.setClipToPadding(false);
        i6cVar.setVerticalScrollBarEnabled(false);
        zabVar.addView(i6cVar, nme.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 130.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.p1 = linearLayout;
        linearLayout.setOrientation(1);
        i6cVar.addView(linearLayout, nme.x(-1, -2, 51));
        TextView textView = new TextView(context);
        ug8.v(textView, 1, 20.0f);
        int i = bkb.i5;
        textView.setTextColor(bkb.w0(null, i, false));
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(k96.M0(2131754226, null));
        linearLayout.addView(textView, nme.t(-2, -2, 49, 23, 16, 23, 0));
        TextView textView2 = new TextView(getContext());
        textView2.setTextColor(bkb.w0(null, bkb.q5, false));
        textView2.setTextSize(1, 14.0f);
        textView2.setMovementMethod(new cl((byte) 0));
        int i2 = bkb.j5;
        textView2.setLinkTextColor(bkb.w0(null, i2, false));
        textView2.setText(k96.a0(null, null, 2131754239, lh0Var.b, Integer.valueOf(lh0Var.a)));
        textView2.setGravity(49);
        linearLayout.addView(textView2, nme.t(-2, -2, 49, 23, 0, 23, 5));
        String str = lh0Var.c;
        if (!TextUtils.isEmpty(str)) {
            TextView textView3 = new TextView(getContext());
            textView3.setTextColor(bkb.w0(null, i, false));
            textView3.setTextSize(1, 14.0f);
            textView3.setMovementMethod(new cl((byte) 0));
            textView3.setLinkTextColor(bkb.w0(null, i2, false));
            textView3.setText(vu3.m(str, textView3.getPaint().getFontMetricsInt(), false, null, 0));
            kk7.i(textView3);
            textView3.setGravity(51);
            linearLayout.addView(textView3, nme.t(-2, -2, 51, 23, 15, 23, 0));
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, gl.e1(), 83);
        layoutParams.bottomMargin = gl.L(130.0f);
        View view = new View(context);
        this.o1 = view;
        view.setBackgroundColor(bkb.w0(null, bkb.U5, false));
        view.setAlpha(0.0f);
        view.setTag(1);
        zabVar.addView(view, layoutParams);
        u41 u41Var = new u41(null, context, true);
        File g = a.a.g();
        if (g != null) {
            u41Var.i(k96.a0(null, null, 2131754222, new Object[0]), false, true);
            u41Var.setOnClickListener(new vzb(this, g, (byte) 5));
        } else {
            u41Var.i(k96.a0(null, null, 2131754224, new Object[0]), false, true);
            u41Var.setOnClickListener(new View.OnClickListener(this) {
                public final j6c b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view2) {
                    byte b = r2;
                    j6c j6cVar = this.b;
                    switch (b) {
                        case 0:
                            ((ApplicationLoaderImpl) a.a).getClass();
                            oh0.e().b(false);
                            j6cVar.dismiss();
                            return;
                        default:
                            j6cVar.dismiss();
                            return;
                    }
                }
            });
        }
        zabVar.addView(u41Var, nme.d(-1, 48.0f, 87, 20.0f, 0.0f, 20.0f, 60.0f));
        u41 u41Var2 = new u41(null, context, false);
        u41Var2.i(k96.M0(2131754221, null), false, true);
        u41Var2.setOnClickListener(new View.OnClickListener(this) {
            public final j6c b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                byte b = r2;
                j6c j6cVar = this.b;
                switch (b) {
                    case 0:
                        ((ApplicationLoaderImpl) a.a).getClass();
                        oh0.e().b(false);
                        j6cVar.dismiss();
                        return;
                    default:
                        j6cVar.dismiss();
                        return;
                }
            }
        });
        zabVar.addView(u41Var2, nme.d(-1, 48.0f, 87, 20.0f, 4.0f, 20.0f, 8.0f));
    }

    @Override
    public final boolean D() {
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
        this.n1.addListener(new pu9((byte) 14, this, z));
        this.n1.start();
    }

    public final void E0() {
        LinearLayout linearLayout = this.p1;
        View childAt = linearLayout.getChildAt(0);
        int[] iArr = this.r1;
        childAt.getLocationInWindow(iArr);
        int max = Math.max(iArr[1] - gl.L(24.0f), 0);
        if (linearLayout.getMeasuredHeight() + iArr[1] <= this.b.getTranslationY() + (this.c.getMeasuredHeight() - gl.L(113.0f))) {
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
