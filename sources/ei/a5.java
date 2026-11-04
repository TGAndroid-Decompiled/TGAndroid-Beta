package ei;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.ui.Components.bk0;
public final class a5 extends FrameLayout {
    public final LinearLayout f10079a;
    public final Paint f10080b;
    public final TextView f10081c;
    public final TextView d;
    public final RectF f10082e;
    public float f10083f;
    public float h;
    public final RectF f10084n;
    public float f10085r;
    public int f10086s;
    public final bk0 f10087w;
    public ValueAnimator f10088x;
    public final k5 f10089y;

    public a5(k5 k5Var, Context context) {
        super(context);
        this.f10089y = k5Var;
        Paint paint = new Paint(1);
        this.f10080b = paint;
        this.f10082e = new RectF();
        this.f10084n = new RectF();
        this.f10085r = 1.0f;
        int i3 = org.telegram.ui.ActionBar.k6.f27972i6;
        b bVar = k5Var.f10578s;
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(i3, bVar));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        TextView textView = new TextView(context);
        this.f10081c = textView;
        textView.setText(bd.M0(2131754286, null));
        int i10 = org.telegram.ui.ActionBar.k6.f27988j5;
        org.telegram.ui.ActionBar.r6.V(textView, i10, bVar);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setText(bd.M0(2131751780, null));
        org.telegram.ui.ActionBar.r6.V(textView2, i10, bVar);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f));
        linearLayout.setPadding(0, org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f));
        linearLayout.addView(textView, mf.t(-2, -2, 0, 13, 0, 0, 0));
        linearLayout.addView(textView2, mf.t(-2, -2, 0, 0, 0, 0, 0));
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.f10079a = linearLayout2;
        linearLayout2.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), 0);
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(26.0f), org.telegram.ui.ActionBar.k6.w0(i3, bVar));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i3);
        linearLayout2.setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(linearLayout2, d02, N, null, bVar);
        linearLayout2.setOrientation(0);
        bk0 bk0Var = new bk0(getContext());
        this.f10087w = bk0Var;
        bk0Var.f32313r = true;
        bk0Var.a(2131231918, false);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageDrawable(bk0Var);
        imageView.setPadding(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
        linearLayout2.addView(imageView, mf.o(26, 26));
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setImageResource(2131230871);
        linearLayout2.addView(imageView2, mf.o(16, 26));
        addView(linearLayout, mf.c(-2.0f, -2));
        addView(linearLayout2, mf.d(-2, -2.0f, 5, 13.0f, 6.0f, 13.0f, 6.0f));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final a5 f11205b;

            {
                this.f11205b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        k5 k5Var2 = this.f11205b.f10089y;
                        w4 w4Var = k5Var2.P;
                        if (w4Var.f11181b) {
                            w4Var.f11181b = false;
                            k5Var2.h(true);
                            k5.b(k5Var2);
                            return;
                        }
                        return;
                    case 1:
                        k5 k5Var3 = this.f11205b.f10089y;
                        w4 w4Var2 = k5Var3.P;
                        if (!w4Var2.f11181b) {
                            w4Var2.f11181b = true;
                            k5Var3.h(true);
                            k5.b(k5Var3);
                            return;
                        }
                        return;
                    default:
                        a5 a5Var = this.f11205b;
                        k5 k5Var4 = a5Var.f10089y;
                        z4 z4Var = new z4(a5Var, a5Var.getContext(), k5Var4.f10578s);
                        k5Var4.f10575f = z4Var;
                        LinearLayout linearLayout3 = a5Var.f10079a;
                        z4Var.f16384a = true;
                        ((org.telegram.ui.ActionBar.f1) z4Var.f16385b).showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - org.telegram.messenger.g0.L(8.0f));
                        return;
                }
            }
        });
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final a5 f11205b;

            {
                this.f11205b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        k5 k5Var2 = this.f11205b.f10089y;
                        w4 w4Var = k5Var2.P;
                        if (w4Var.f11181b) {
                            w4Var.f11181b = false;
                            k5Var2.h(true);
                            k5.b(k5Var2);
                            return;
                        }
                        return;
                    case 1:
                        k5 k5Var3 = this.f11205b.f10089y;
                        w4 w4Var2 = k5Var3.P;
                        if (!w4Var2.f11181b) {
                            w4Var2.f11181b = true;
                            k5Var3.h(true);
                            k5.b(k5Var3);
                            return;
                        }
                        return;
                    default:
                        a5 a5Var = this.f11205b;
                        k5 k5Var4 = a5Var.f10089y;
                        z4 z4Var = new z4(a5Var, a5Var.getContext(), k5Var4.f10578s);
                        k5Var4.f10575f = z4Var;
                        LinearLayout linearLayout3 = a5Var.f10079a;
                        z4Var.f16384a = true;
                        ((org.telegram.ui.ActionBar.f1) z4Var.f16385b).showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - org.telegram.messenger.g0.L(8.0f));
                        return;
                }
            }
        });
        linearLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final a5 f11205b;

            {
                this.f11205b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        k5 k5Var2 = this.f11205b.f10089y;
                        w4 w4Var = k5Var2.P;
                        if (w4Var.f11181b) {
                            w4Var.f11181b = false;
                            k5Var2.h(true);
                            k5.b(k5Var2);
                            return;
                        }
                        return;
                    case 1:
                        k5 k5Var3 = this.f11205b.f10089y;
                        w4 w4Var2 = k5Var3.P;
                        if (!w4Var2.f11181b) {
                            w4Var2.f11181b = true;
                            k5Var3.h(true);
                            k5.b(k5Var3);
                            return;
                        }
                        return;
                    default:
                        a5 a5Var = this.f11205b;
                        k5 k5Var4 = a5Var.f10089y;
                        z4 z4Var = new z4(a5Var, a5Var.getContext(), k5Var4.f10578s);
                        k5Var4.f10575f = z4Var;
                        LinearLayout linearLayout3 = a5Var.f10079a;
                        z4Var.f16384a = true;
                        ((org.telegram.ui.ActionBar.f1) z4Var.f16385b).showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - org.telegram.messenger.g0.L(8.0f));
                        return;
                }
            }
        });
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        if (this.f10089y.U) {
            int i3 = this.f10086s;
            TextView textView = this.d;
            float f11 = 0.5f;
            TextView textView2 = this.f10081c;
            if (i3 == 0) {
                textView2.getHitRect(org.telegram.messenger.g0.Q);
                f10 = 0.5f;
                f11 = 1.0f;
            } else {
                textView.getHitRect(org.telegram.messenger.g0.Q);
                f10 = 1.0f;
            }
            Rect rect = org.telegram.messenger.g0.Q;
            RectF rectF = this.f10084n;
            rectF.set(rect);
            float f12 = this.f10085r;
            if (f12 != 1.0f) {
                f11 = org.telegram.messenger.g0.T1(this.f10083f, f11, f12);
                f10 = org.telegram.messenger.g0.T1(this.h, f10, this.f10085r);
                org.telegram.messenger.g0.Z1(this.f10082e, rectF, this.f10085r, rectF);
            }
            textView2.setAlpha(f11);
            textView.setAlpha(f10);
            float height = rectF.height() / 2.0f;
            canvas.drawRoundRect(rectF, height, height, this.f10080b);
        }
        super.dispatchDraw(canvas);
    }
}
