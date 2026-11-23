package fi;

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
import c8.na;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.mk0;
public final class q4 extends FrameLayout {
    public final LinearLayout f12447a;
    public final Paint f12448b;
    public final TextView f12449c;
    public final TextView d;
    public final RectF f12450e;
    public float f12451f;
    public float h;
    public final RectF f12452n;
    public float f12453r;
    public int f12454s;
    public final mk0 f12455w;
    public ValueAnimator f12456x;
    public final a5 f12457y;

    public q4(a5 a5Var, Context context) {
        super(context);
        this.f12457y = a5Var;
        Paint paint = new Paint(1);
        this.f12448b = paint;
        this.f12450e = new RectF();
        this.f12452n = new RectF();
        this.f12453r = 1.0f;
        int i7 = org.telegram.ui.ActionBar.m6.f29439i6;
        b bVar = a5Var.f11727s;
        paint.setColor(org.telegram.ui.ActionBar.m6.w0(i7, bVar));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        TextView textView = new TextView(context);
        this.f12449c = textView;
        textView.setText(hd.N0(2131754283, null));
        int i10 = org.telegram.ui.ActionBar.m6.f29455j5;
        org.telegram.ui.ActionBar.t6.U(textView, i10, bVar);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setText(hd.N0(2131751768, null));
        org.telegram.ui.ActionBar.t6.U(textView2, i10, bVar);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f));
        linearLayout.setPadding(0, org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f));
        linearLayout.addView(textView, na.t(-2, -2, 0, 13, 0, 0, 0));
        linearLayout.addView(textView2, na.t(-2, -2, 0, 0, 0, 0, 0));
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.f12447a = linearLayout2;
        linearLayout2.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), 0);
        ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(26.0f), org.telegram.ui.ActionBar.m6.w0(i7, bVar));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i7);
        linearLayout2.setBackground(d02);
        org.telegram.ui.ActionBar.t6.j(linearLayout2, d02, M, null, bVar);
        linearLayout2.setOrientation(0);
        mk0 mk0Var = new mk0(getContext());
        this.f12455w = mk0Var;
        mk0Var.f37503r = true;
        mk0Var.a(2131231919, false);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageDrawable(mk0Var);
        imageView.setPadding(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
        linearLayout2.addView(imageView, na.o(26, 26));
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setImageResource(2131230871);
        linearLayout2.addView(imageView2, na.o(16, 26));
        addView(linearLayout, na.c(-2.0f, -2));
        addView(linearLayout2, na.d(-2, -2.0f, 5, 13.0f, 6.0f, 13.0f, 6.0f));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final q4 f12295b;

            {
                this.f12295b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        a5 a5Var2 = this.f12295b.f12457y;
                        m4 m4Var = a5Var2.P;
                        if (m4Var.f12260b) {
                            m4Var.f12260b = false;
                            a5Var2.h(true);
                            a5.b(a5Var2);
                            return;
                        }
                        return;
                    case 1:
                        a5 a5Var3 = this.f12295b.f12457y;
                        m4 m4Var2 = a5Var3.P;
                        if (!m4Var2.f12260b) {
                            m4Var2.f12260b = true;
                            a5Var3.h(true);
                            a5.b(a5Var3);
                            return;
                        }
                        return;
                    default:
                        q4 q4Var = this.f12295b;
                        a5 a5Var4 = q4Var.f12457y;
                        p4 p4Var = new p4(q4Var, q4Var.getContext(), a5Var4.f11727s);
                        a5Var4.f11724f = p4Var;
                        LinearLayout linearLayout3 = q4Var.f12447a;
                        p4Var.f18052a = true;
                        ((org.telegram.ui.ActionBar.g1) p4Var.f18053b).showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - org.telegram.messenger.g0.L(8.0f));
                        return;
                }
            }
        });
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final q4 f12295b;

            {
                this.f12295b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        a5 a5Var2 = this.f12295b.f12457y;
                        m4 m4Var = a5Var2.P;
                        if (m4Var.f12260b) {
                            m4Var.f12260b = false;
                            a5Var2.h(true);
                            a5.b(a5Var2);
                            return;
                        }
                        return;
                    case 1:
                        a5 a5Var3 = this.f12295b.f12457y;
                        m4 m4Var2 = a5Var3.P;
                        if (!m4Var2.f12260b) {
                            m4Var2.f12260b = true;
                            a5Var3.h(true);
                            a5.b(a5Var3);
                            return;
                        }
                        return;
                    default:
                        q4 q4Var = this.f12295b;
                        a5 a5Var4 = q4Var.f12457y;
                        p4 p4Var = new p4(q4Var, q4Var.getContext(), a5Var4.f11727s);
                        a5Var4.f11724f = p4Var;
                        LinearLayout linearLayout3 = q4Var.f12447a;
                        p4Var.f18052a = true;
                        ((org.telegram.ui.ActionBar.g1) p4Var.f18053b).showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - org.telegram.messenger.g0.L(8.0f));
                        return;
                }
            }
        });
        linearLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final q4 f12295b;

            {
                this.f12295b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        a5 a5Var2 = this.f12295b.f12457y;
                        m4 m4Var = a5Var2.P;
                        if (m4Var.f12260b) {
                            m4Var.f12260b = false;
                            a5Var2.h(true);
                            a5.b(a5Var2);
                            return;
                        }
                        return;
                    case 1:
                        a5 a5Var3 = this.f12295b.f12457y;
                        m4 m4Var2 = a5Var3.P;
                        if (!m4Var2.f12260b) {
                            m4Var2.f12260b = true;
                            a5Var3.h(true);
                            a5.b(a5Var3);
                            return;
                        }
                        return;
                    default:
                        q4 q4Var = this.f12295b;
                        a5 a5Var4 = q4Var.f12457y;
                        p4 p4Var = new p4(q4Var, q4Var.getContext(), a5Var4.f11727s);
                        a5Var4.f11724f = p4Var;
                        LinearLayout linearLayout3 = q4Var.f12447a;
                        p4Var.f18052a = true;
                        ((org.telegram.ui.ActionBar.g1) p4Var.f18053b).showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - org.telegram.messenger.g0.L(8.0f));
                        return;
                }
            }
        });
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        if (this.f12457y.U) {
            int i7 = this.f12454s;
            TextView textView = this.d;
            float f11 = 0.5f;
            TextView textView2 = this.f12449c;
            if (i7 == 0) {
                textView2.getHitRect(org.telegram.messenger.g0.Q);
                f10 = 0.5f;
                f11 = 1.0f;
            } else {
                textView.getHitRect(org.telegram.messenger.g0.Q);
                f10 = 1.0f;
            }
            Rect rect = org.telegram.messenger.g0.Q;
            RectF rectF = this.f12452n;
            rectF.set(rect);
            float f12 = this.f12453r;
            if (f12 != 1.0f) {
                f11 = org.telegram.messenger.g0.T1(this.f12451f, f11, f12);
                f10 = org.telegram.messenger.g0.T1(this.h, f10, this.f12453r);
                org.telegram.messenger.g0.Z1(this.f12450e, rectF, this.f12453r, rectF);
            }
            textView2.setAlpha(f11);
            textView.setAlpha(f10);
            float height = rectF.height() / 2.0f;
            canvas.drawRoundRect(rectF, height, height, this.f12448b);
        }
        super.dispatchDraw(canvas);
    }
}
