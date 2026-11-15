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
import c8.ja;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.ck0;
public final class s4 extends FrameLayout {
    public final LinearLayout f12305a;
    public final Paint f12306b;
    public final TextView f12307c;
    public final TextView d;
    public final RectF f12308e;
    public float f12309f;
    public float h;
    public final RectF f12310n;
    public float f12311r;
    public int f12312s;
    public final ck0 f12313w;
    public ValueAnimator f12314x;
    public final c5 f12315y;

    public s4(c5 c5Var, Context context) {
        super(context);
        this.f12315y = c5Var;
        Paint paint = new Paint(1);
        this.f12306b = paint;
        this.f12308e = new RectF();
        this.f12310n = new RectF();
        this.f12311r = 1.0f;
        int i7 = org.telegram.ui.ActionBar.j6.f28941i6;
        b bVar = c5Var.f11604s;
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(i7, bVar));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        TextView textView = new TextView(context);
        this.f12307c = textView;
        textView.setText(hd.M0(2131754286, null));
        int i10 = org.telegram.ui.ActionBar.j6.f28957j5;
        org.telegram.ui.ActionBar.q6.U(textView, i10, bVar);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setText(hd.M0(2131751780, null));
        org.telegram.ui.ActionBar.q6.U(textView2, i10, bVar);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f));
        linearLayout.setPadding(0, org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f));
        linearLayout.addView(textView, ja.t(-2, -2, 0, 13, 0, 0, 0));
        linearLayout.addView(textView2, ja.t(-2, -2, 0, 0, 0, 0, 0));
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.f12305a = linearLayout2;
        linearLayout2.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), 0);
        ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(26.0f), org.telegram.ui.ActionBar.j6.w0(i7, bVar));
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i7);
        linearLayout2.setBackground(d02);
        org.telegram.ui.ActionBar.q6.j(linearLayout2, d02, M, null, bVar);
        linearLayout2.setOrientation(0);
        ck0 ck0Var = new ck0(getContext());
        this.f12313w = ck0Var;
        ck0Var.f33625r = true;
        ck0Var.a(2131231918, false);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageDrawable(ck0Var);
        imageView.setPadding(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
        linearLayout2.addView(imageView, ja.o(26, 26));
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setImageResource(2131230871);
        linearLayout2.addView(imageView2, ja.o(16, 26));
        addView(linearLayout, ja.c(-2.0f, -2));
        addView(linearLayout2, ja.d(-2, -2.0f, 5, 13.0f, 6.0f, 13.0f, 6.0f));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final s4 f12174b;

            {
                this.f12174b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        c5 c5Var2 = this.f12174b.f12315y;
                        o4 o4Var = c5Var2.P;
                        if (o4Var.f12116b) {
                            o4Var.f12116b = false;
                            c5Var2.h(true);
                            c5.b(c5Var2);
                            return;
                        }
                        return;
                    case 1:
                        c5 c5Var3 = this.f12174b.f12315y;
                        o4 o4Var2 = c5Var3.P;
                        if (!o4Var2.f12116b) {
                            o4Var2.f12116b = true;
                            c5Var3.h(true);
                            c5.b(c5Var3);
                            return;
                        }
                        return;
                    default:
                        s4 s4Var = this.f12174b;
                        c5 c5Var4 = s4Var.f12315y;
                        r4 r4Var = new r4(s4Var, s4Var.getContext(), c5Var4.f11604s);
                        c5Var4.f11601f = r4Var;
                        LinearLayout linearLayout3 = s4Var.f12305a;
                        r4Var.f17663a = true;
                        ((org.telegram.ui.ActionBar.g1) r4Var.f17664b).showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - org.telegram.messenger.g0.L(8.0f));
                        return;
                }
            }
        });
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final s4 f12174b;

            {
                this.f12174b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        c5 c5Var2 = this.f12174b.f12315y;
                        o4 o4Var = c5Var2.P;
                        if (o4Var.f12116b) {
                            o4Var.f12116b = false;
                            c5Var2.h(true);
                            c5.b(c5Var2);
                            return;
                        }
                        return;
                    case 1:
                        c5 c5Var3 = this.f12174b.f12315y;
                        o4 o4Var2 = c5Var3.P;
                        if (!o4Var2.f12116b) {
                            o4Var2.f12116b = true;
                            c5Var3.h(true);
                            c5.b(c5Var3);
                            return;
                        }
                        return;
                    default:
                        s4 s4Var = this.f12174b;
                        c5 c5Var4 = s4Var.f12315y;
                        r4 r4Var = new r4(s4Var, s4Var.getContext(), c5Var4.f11604s);
                        c5Var4.f11601f = r4Var;
                        LinearLayout linearLayout3 = s4Var.f12305a;
                        r4Var.f17663a = true;
                        ((org.telegram.ui.ActionBar.g1) r4Var.f17664b).showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - org.telegram.messenger.g0.L(8.0f));
                        return;
                }
            }
        });
        linearLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final s4 f12174b;

            {
                this.f12174b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        c5 c5Var2 = this.f12174b.f12315y;
                        o4 o4Var = c5Var2.P;
                        if (o4Var.f12116b) {
                            o4Var.f12116b = false;
                            c5Var2.h(true);
                            c5.b(c5Var2);
                            return;
                        }
                        return;
                    case 1:
                        c5 c5Var3 = this.f12174b.f12315y;
                        o4 o4Var2 = c5Var3.P;
                        if (!o4Var2.f12116b) {
                            o4Var2.f12116b = true;
                            c5Var3.h(true);
                            c5.b(c5Var3);
                            return;
                        }
                        return;
                    default:
                        s4 s4Var = this.f12174b;
                        c5 c5Var4 = s4Var.f12315y;
                        r4 r4Var = new r4(s4Var, s4Var.getContext(), c5Var4.f11604s);
                        c5Var4.f11601f = r4Var;
                        LinearLayout linearLayout3 = s4Var.f12305a;
                        r4Var.f17663a = true;
                        ((org.telegram.ui.ActionBar.g1) r4Var.f17664b).showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - org.telegram.messenger.g0.L(8.0f));
                        return;
                }
            }
        });
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        if (this.f12315y.U) {
            int i7 = this.f12312s;
            TextView textView = this.d;
            float f11 = 0.5f;
            TextView textView2 = this.f12307c;
            if (i7 == 0) {
                textView2.getHitRect(org.telegram.messenger.g0.Q);
                f10 = 0.5f;
                f11 = 1.0f;
            } else {
                textView.getHitRect(org.telegram.messenger.g0.Q);
                f10 = 1.0f;
            }
            Rect rect = org.telegram.messenger.g0.Q;
            RectF rectF = this.f12310n;
            rectF.set(rect);
            float f12 = this.f12311r;
            if (f12 != 1.0f) {
                f11 = org.telegram.messenger.g0.T1(this.f12309f, f11, f12);
                f10 = org.telegram.messenger.g0.T1(this.h, f10, this.f12311r);
                org.telegram.messenger.g0.Z1(this.f12308e, rectF, this.f12311r, rectF);
            }
            textView2.setAlpha(f11);
            textView.setAlpha(f10);
            float height = rectF.height() / 2.0f;
            canvas.drawRoundRect(rectF, height, height, this.f12306b);
        }
        super.dispatchDraw(canvas);
    }
}
