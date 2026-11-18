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
import c8.ma;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.kk0;
public final class q4 extends FrameLayout {
    public final LinearLayout f12455a;
    public final Paint f12456b;
    public final TextView f12457c;
    public final TextView d;
    public final RectF f12458e;
    public float f12459f;
    public float h;
    public final RectF f12460n;
    public float f12461r;
    public int f12462s;
    public final kk0 f12463w;
    public ValueAnimator f12464x;
    public final a5 f12465y;

    public q4(a5 a5Var, Context context) {
        super(context);
        this.f12465y = a5Var;
        Paint paint = new Paint(1);
        this.f12456b = paint;
        this.f12458e = new RectF();
        this.f12460n = new RectF();
        this.f12461r = 1.0f;
        int i7 = org.telegram.ui.ActionBar.n6.f29488i6;
        b bVar = a5Var.f11735s;
        paint.setColor(org.telegram.ui.ActionBar.n6.w0(i7, bVar));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        TextView textView = new TextView(context);
        this.f12457c = textView;
        textView.setText(gd.M0(2131754284, null));
        int i10 = org.telegram.ui.ActionBar.n6.f29504j5;
        org.telegram.ui.ActionBar.u6.U(textView, i10, bVar);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setText(gd.M0(2131751769, null));
        org.telegram.ui.ActionBar.u6.U(textView2, i10, bVar);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f));
        linearLayout.setPadding(0, org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f));
        linearLayout.addView(textView, ma.t(-2, -2, 0, 13, 0, 0, 0));
        linearLayout.addView(textView2, ma.t(-2, -2, 0, 0, 0, 0, 0));
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.f12455a = linearLayout2;
        linearLayout2.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), 0);
        ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(26.0f), org.telegram.ui.ActionBar.n6.w0(i7, bVar));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
        linearLayout2.setBackground(d02);
        org.telegram.ui.ActionBar.u6.j(linearLayout2, d02, M, null, bVar);
        linearLayout2.setOrientation(0);
        kk0 kk0Var = new kk0(getContext());
        this.f12463w = kk0Var;
        kk0Var.f36792r = true;
        kk0Var.a(2131231919, false);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageDrawable(kk0Var);
        imageView.setPadding(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
        linearLayout2.addView(imageView, ma.o(26, 26));
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setImageResource(2131230871);
        linearLayout2.addView(imageView2, ma.o(16, 26));
        addView(linearLayout, ma.c(-2.0f, -2));
        addView(linearLayout2, ma.d(-2, -2.0f, 5, 13.0f, 6.0f, 13.0f, 6.0f));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final q4 f12303b;

            {
                this.f12303b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        a5 a5Var2 = this.f12303b.f12465y;
                        m4 m4Var = a5Var2.P;
                        if (m4Var.f12268b) {
                            m4Var.f12268b = false;
                            a5Var2.h(true);
                            a5.b(a5Var2);
                            return;
                        }
                        return;
                    case 1:
                        a5 a5Var3 = this.f12303b.f12465y;
                        m4 m4Var2 = a5Var3.P;
                        if (!m4Var2.f12268b) {
                            m4Var2.f12268b = true;
                            a5Var3.h(true);
                            a5.b(a5Var3);
                            return;
                        }
                        return;
                    default:
                        q4 q4Var = this.f12303b;
                        a5 a5Var4 = q4Var.f12465y;
                        p4 p4Var = new p4(q4Var, q4Var.getContext(), a5Var4.f11735s);
                        a5Var4.f11732f = p4Var;
                        LinearLayout linearLayout3 = q4Var.f12455a;
                        p4Var.f18058a = true;
                        ((org.telegram.ui.ActionBar.h1) p4Var.f18059b).showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - org.telegram.messenger.g0.L(8.0f));
                        return;
                }
            }
        });
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final q4 f12303b;

            {
                this.f12303b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        a5 a5Var2 = this.f12303b.f12465y;
                        m4 m4Var = a5Var2.P;
                        if (m4Var.f12268b) {
                            m4Var.f12268b = false;
                            a5Var2.h(true);
                            a5.b(a5Var2);
                            return;
                        }
                        return;
                    case 1:
                        a5 a5Var3 = this.f12303b.f12465y;
                        m4 m4Var2 = a5Var3.P;
                        if (!m4Var2.f12268b) {
                            m4Var2.f12268b = true;
                            a5Var3.h(true);
                            a5.b(a5Var3);
                            return;
                        }
                        return;
                    default:
                        q4 q4Var = this.f12303b;
                        a5 a5Var4 = q4Var.f12465y;
                        p4 p4Var = new p4(q4Var, q4Var.getContext(), a5Var4.f11735s);
                        a5Var4.f11732f = p4Var;
                        LinearLayout linearLayout3 = q4Var.f12455a;
                        p4Var.f18058a = true;
                        ((org.telegram.ui.ActionBar.h1) p4Var.f18059b).showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - org.telegram.messenger.g0.L(8.0f));
                        return;
                }
            }
        });
        linearLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final q4 f12303b;

            {
                this.f12303b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        a5 a5Var2 = this.f12303b.f12465y;
                        m4 m4Var = a5Var2.P;
                        if (m4Var.f12268b) {
                            m4Var.f12268b = false;
                            a5Var2.h(true);
                            a5.b(a5Var2);
                            return;
                        }
                        return;
                    case 1:
                        a5 a5Var3 = this.f12303b.f12465y;
                        m4 m4Var2 = a5Var3.P;
                        if (!m4Var2.f12268b) {
                            m4Var2.f12268b = true;
                            a5Var3.h(true);
                            a5.b(a5Var3);
                            return;
                        }
                        return;
                    default:
                        q4 q4Var = this.f12303b;
                        a5 a5Var4 = q4Var.f12465y;
                        p4 p4Var = new p4(q4Var, q4Var.getContext(), a5Var4.f11735s);
                        a5Var4.f11732f = p4Var;
                        LinearLayout linearLayout3 = q4Var.f12455a;
                        p4Var.f18058a = true;
                        ((org.telegram.ui.ActionBar.h1) p4Var.f18059b).showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - org.telegram.messenger.g0.L(8.0f));
                        return;
                }
            }
        });
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        if (this.f12465y.U) {
            int i7 = this.f12462s;
            TextView textView = this.d;
            float f11 = 0.5f;
            TextView textView2 = this.f12457c;
            if (i7 == 0) {
                textView2.getHitRect(org.telegram.messenger.g0.Q);
                f10 = 0.5f;
                f11 = 1.0f;
            } else {
                textView.getHitRect(org.telegram.messenger.g0.Q);
                f10 = 1.0f;
            }
            Rect rect = org.telegram.messenger.g0.Q;
            RectF rectF = this.f12460n;
            rectF.set(rect);
            float f12 = this.f12461r;
            if (f12 != 1.0f) {
                f11 = org.telegram.messenger.g0.T1(this.f12459f, f11, f12);
                f10 = org.telegram.messenger.g0.T1(this.h, f10, this.f12461r);
                org.telegram.messenger.g0.Z1(this.f12458e, rectF, this.f12461r, rectF);
            }
            textView2.setAlpha(f11);
            textView.setAlpha(f10);
            float height = rectF.height() / 2.0f;
            canvas.drawRoundRect(rectF, height, height, this.f12456b);
        }
        super.dispatchDraw(canvas);
    }
}
