package di;

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
import c8.ha;
import org.telegram.messenger.id;
import org.telegram.ui.Components.xj0;
public final class b5 extends FrameLayout {
    public final LinearLayout f8843a;
    public final Paint f8844b;
    public final TextView f8845c;
    public final TextView d;
    public final RectF f8846e;
    public float f8847f;
    public float h;
    public final RectF f8848n;
    public float f8849r;
    public int f8850s;
    public final xj0 f8851w;
    public ValueAnimator f8852x;
    public final l5 f8853y;

    public b5(l5 l5Var, Context context) {
        super(context);
        this.f8853y = l5Var;
        Paint paint = new Paint(1);
        this.f8844b = paint;
        this.f8846e = new RectF();
        this.f8848n = new RectF();
        this.f8849r = 1.0f;
        int i7 = org.telegram.ui.ActionBar.m6.f27982i6;
        b bVar = l5Var.f9335s;
        paint.setColor(org.telegram.ui.ActionBar.m6.w0(i7, bVar));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        TextView textView = new TextView(context);
        this.f8845c = textView;
        textView.setText(id.M0(2131754286, null));
        int i10 = org.telegram.ui.ActionBar.m6.f27998j5;
        org.telegram.ui.ActionBar.t6.U(textView, i10, bVar);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setText(id.M0(2131751780, null));
        org.telegram.ui.ActionBar.t6.U(textView2, i10, bVar);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f));
        linearLayout.setPadding(0, org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f));
        linearLayout.addView(textView, ha.t(-2, -2, 0, 13, 0, 0, 0));
        linearLayout.addView(textView2, ha.t(-2, -2, 0, 0, 0, 0, 0));
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.f8843a = linearLayout2;
        linearLayout2.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), 0);
        ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(26.0f), org.telegram.ui.ActionBar.m6.w0(i7, bVar));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i7);
        linearLayout2.setBackground(d02);
        org.telegram.ui.ActionBar.t6.j(linearLayout2, d02, M, null, bVar);
        linearLayout2.setOrientation(0);
        xj0 xj0Var = new xj0(getContext());
        this.f8851w = xj0Var;
        xj0Var.f40320r = true;
        xj0Var.a(2131231918, false);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageDrawable(xj0Var);
        imageView.setPadding(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
        linearLayout2.addView(imageView, ha.o(26, 26));
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setImageResource(2131230871);
        linearLayout2.addView(imageView2, ha.o(16, 26));
        addView(linearLayout, ha.c(-2.0f, -2));
        addView(linearLayout2, ha.d(-2, -2.0f, 5, 13.0f, 6.0f, 13.0f, 6.0f));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final b5 f9960b;

            {
                this.f9960b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        l5 l5Var2 = this.f9960b.f8853y;
                        x4 x4Var = l5Var2.O;
                        if (x4Var.f9932b) {
                            x4Var.f9932b = false;
                            l5Var2.h(true);
                            l5.b(l5Var2);
                            return;
                        }
                        return;
                    case 1:
                        l5 l5Var3 = this.f9960b.f8853y;
                        x4 x4Var2 = l5Var3.O;
                        if (!x4Var2.f9932b) {
                            x4Var2.f9932b = true;
                            l5Var3.h(true);
                            l5.b(l5Var3);
                            return;
                        }
                        return;
                    default:
                        b5 b5Var = this.f9960b;
                        l5 l5Var4 = b5Var.f8853y;
                        a5 a5Var = new a5(b5Var, b5Var.getContext(), l5Var4.f9335s);
                        l5Var4.f9332f = a5Var;
                        LinearLayout linearLayout3 = b5Var.f8843a;
                        a5Var.f17105a = true;
                        ((org.telegram.ui.ActionBar.g1) a5Var.f17106b).showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - org.telegram.messenger.g0.L(8.0f));
                        return;
                }
            }
        });
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final b5 f9960b;

            {
                this.f9960b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        l5 l5Var2 = this.f9960b.f8853y;
                        x4 x4Var = l5Var2.O;
                        if (x4Var.f9932b) {
                            x4Var.f9932b = false;
                            l5Var2.h(true);
                            l5.b(l5Var2);
                            return;
                        }
                        return;
                    case 1:
                        l5 l5Var3 = this.f9960b.f8853y;
                        x4 x4Var2 = l5Var3.O;
                        if (!x4Var2.f9932b) {
                            x4Var2.f9932b = true;
                            l5Var3.h(true);
                            l5.b(l5Var3);
                            return;
                        }
                        return;
                    default:
                        b5 b5Var = this.f9960b;
                        l5 l5Var4 = b5Var.f8853y;
                        a5 a5Var = new a5(b5Var, b5Var.getContext(), l5Var4.f9335s);
                        l5Var4.f9332f = a5Var;
                        LinearLayout linearLayout3 = b5Var.f8843a;
                        a5Var.f17105a = true;
                        ((org.telegram.ui.ActionBar.g1) a5Var.f17106b).showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - org.telegram.messenger.g0.L(8.0f));
                        return;
                }
            }
        });
        linearLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final b5 f9960b;

            {
                this.f9960b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        l5 l5Var2 = this.f9960b.f8853y;
                        x4 x4Var = l5Var2.O;
                        if (x4Var.f9932b) {
                            x4Var.f9932b = false;
                            l5Var2.h(true);
                            l5.b(l5Var2);
                            return;
                        }
                        return;
                    case 1:
                        l5 l5Var3 = this.f9960b.f8853y;
                        x4 x4Var2 = l5Var3.O;
                        if (!x4Var2.f9932b) {
                            x4Var2.f9932b = true;
                            l5Var3.h(true);
                            l5.b(l5Var3);
                            return;
                        }
                        return;
                    default:
                        b5 b5Var = this.f9960b;
                        l5 l5Var4 = b5Var.f8853y;
                        a5 a5Var = new a5(b5Var, b5Var.getContext(), l5Var4.f9335s);
                        l5Var4.f9332f = a5Var;
                        LinearLayout linearLayout3 = b5Var.f8843a;
                        a5Var.f17105a = true;
                        ((org.telegram.ui.ActionBar.g1) a5Var.f17106b).showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - org.telegram.messenger.g0.L(8.0f));
                        return;
                }
            }
        });
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        if (this.f8853y.T) {
            int i7 = this.f8850s;
            TextView textView = this.d;
            float f11 = 0.5f;
            TextView textView2 = this.f8845c;
            if (i7 == 0) {
                textView2.getHitRect(org.telegram.messenger.g0.Q);
                f10 = 0.5f;
                f11 = 1.0f;
            } else {
                textView.getHitRect(org.telegram.messenger.g0.Q);
                f10 = 1.0f;
            }
            Rect rect = org.telegram.messenger.g0.Q;
            RectF rectF = this.f8848n;
            rectF.set(rect);
            float f12 = this.f8849r;
            if (f12 != 1.0f) {
                f11 = org.telegram.messenger.g0.T1(this.f8847f, f11, f12);
                f10 = org.telegram.messenger.g0.T1(this.h, f10, this.f8849r);
                org.telegram.messenger.g0.Z1(this.f8846e, rectF, this.f8849r, rectF);
            }
            textView2.setAlpha(f11);
            textView.setAlpha(f10);
            float height = rectF.height() / 2.0f;
            canvas.drawRoundRect(rectF, height, height, this.f8844b);
        }
        super.dispatchDraw(canvas);
    }
}
