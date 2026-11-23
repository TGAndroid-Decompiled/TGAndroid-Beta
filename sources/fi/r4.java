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
import org.telegram.messenger.gd;
import org.telegram.ui.Components.mk0;
public final class r4 extends FrameLayout {
    public final LinearLayout f12495a;
    public final Paint f12496b;
    public final TextView f12497c;
    public final TextView d;
    public final RectF f12498e;
    public float f12499f;
    public float h;
    public final RectF f12500n;
    public float f12501r;
    public int f12502s;
    public final mk0 f12503w;
    public ValueAnimator f12504x;
    public final b5 f12505y;

    public r4(b5 b5Var, Context context) {
        super(context);
        this.f12505y = b5Var;
        Paint paint = new Paint(1);
        this.f12496b = paint;
        this.f12498e = new RectF();
        this.f12500n = new RectF();
        this.f12501r = 1.0f;
        int i7 = org.telegram.ui.ActionBar.n6.f29543i6;
        b bVar = b5Var.f11781s;
        paint.setColor(org.telegram.ui.ActionBar.n6.w0(i7, bVar));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        TextView textView = new TextView(context);
        this.f12497c = textView;
        textView.setText(gd.N0(2131754283, null));
        int i10 = org.telegram.ui.ActionBar.n6.f29559j5;
        org.telegram.ui.ActionBar.u6.U(textView, i10, bVar);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setText(gd.N0(2131751768, null));
        org.telegram.ui.ActionBar.u6.U(textView2, i10, bVar);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f));
        linearLayout.setPadding(0, org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f));
        linearLayout.addView(textView, na.t(-2, -2, 0, 13, 0, 0, 0));
        linearLayout.addView(textView2, na.t(-2, -2, 0, 0, 0, 0, 0));
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.f12495a = linearLayout2;
        linearLayout2.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), 0);
        ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(26.0f), org.telegram.ui.ActionBar.n6.w0(i7, bVar));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
        linearLayout2.setBackground(d02);
        org.telegram.ui.ActionBar.u6.j(linearLayout2, d02, M, null, bVar);
        linearLayout2.setOrientation(0);
        mk0 mk0Var = new mk0(getContext());
        this.f12503w = mk0Var;
        mk0Var.f37472r = true;
        mk0Var.a(2131231922, false);
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
            public final r4 f12332b;

            {
                this.f12332b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        b5 b5Var2 = this.f12332b.f12505y;
                        n4 n4Var = b5Var2.P;
                        if (n4Var.f12303b) {
                            n4Var.f12303b = false;
                            b5Var2.h(true);
                            b5.b(b5Var2);
                            return;
                        }
                        return;
                    case 1:
                        b5 b5Var3 = this.f12332b.f12505y;
                        n4 n4Var2 = b5Var3.P;
                        if (!n4Var2.f12303b) {
                            n4Var2.f12303b = true;
                            b5Var3.h(true);
                            b5.b(b5Var3);
                            return;
                        }
                        return;
                    default:
                        r4 r4Var = this.f12332b;
                        b5 b5Var4 = r4Var.f12505y;
                        q4 q4Var = new q4(r4Var, r4Var.getContext(), b5Var4.f11781s);
                        b5Var4.f11778f = q4Var;
                        LinearLayout linearLayout3 = r4Var.f12495a;
                        q4Var.f18154a = true;
                        ((org.telegram.ui.ActionBar.g1) q4Var.f18155b).showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - org.telegram.messenger.g0.L(8.0f));
                        return;
                }
            }
        });
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final r4 f12332b;

            {
                this.f12332b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        b5 b5Var2 = this.f12332b.f12505y;
                        n4 n4Var = b5Var2.P;
                        if (n4Var.f12303b) {
                            n4Var.f12303b = false;
                            b5Var2.h(true);
                            b5.b(b5Var2);
                            return;
                        }
                        return;
                    case 1:
                        b5 b5Var3 = this.f12332b.f12505y;
                        n4 n4Var2 = b5Var3.P;
                        if (!n4Var2.f12303b) {
                            n4Var2.f12303b = true;
                            b5Var3.h(true);
                            b5.b(b5Var3);
                            return;
                        }
                        return;
                    default:
                        r4 r4Var = this.f12332b;
                        b5 b5Var4 = r4Var.f12505y;
                        q4 q4Var = new q4(r4Var, r4Var.getContext(), b5Var4.f11781s);
                        b5Var4.f11778f = q4Var;
                        LinearLayout linearLayout3 = r4Var.f12495a;
                        q4Var.f18154a = true;
                        ((org.telegram.ui.ActionBar.g1) q4Var.f18155b).showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - org.telegram.messenger.g0.L(8.0f));
                        return;
                }
            }
        });
        linearLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final r4 f12332b;

            {
                this.f12332b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        b5 b5Var2 = this.f12332b.f12505y;
                        n4 n4Var = b5Var2.P;
                        if (n4Var.f12303b) {
                            n4Var.f12303b = false;
                            b5Var2.h(true);
                            b5.b(b5Var2);
                            return;
                        }
                        return;
                    case 1:
                        b5 b5Var3 = this.f12332b.f12505y;
                        n4 n4Var2 = b5Var3.P;
                        if (!n4Var2.f12303b) {
                            n4Var2.f12303b = true;
                            b5Var3.h(true);
                            b5.b(b5Var3);
                            return;
                        }
                        return;
                    default:
                        r4 r4Var = this.f12332b;
                        b5 b5Var4 = r4Var.f12505y;
                        q4 q4Var = new q4(r4Var, r4Var.getContext(), b5Var4.f11781s);
                        b5Var4.f11778f = q4Var;
                        LinearLayout linearLayout3 = r4Var.f12495a;
                        q4Var.f18154a = true;
                        ((org.telegram.ui.ActionBar.g1) q4Var.f18155b).showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - org.telegram.messenger.g0.L(8.0f));
                        return;
                }
            }
        });
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        if (this.f12505y.U) {
            int i7 = this.f12502s;
            TextView textView = this.d;
            float f11 = 0.5f;
            TextView textView2 = this.f12497c;
            if (i7 == 0) {
                textView2.getHitRect(org.telegram.messenger.g0.Q);
                f10 = 0.5f;
                f11 = 1.0f;
            } else {
                textView.getHitRect(org.telegram.messenger.g0.Q);
                f10 = 1.0f;
            }
            Rect rect = org.telegram.messenger.g0.Q;
            RectF rectF = this.f12500n;
            rectF.set(rect);
            float f12 = this.f12501r;
            if (f12 != 1.0f) {
                f11 = org.telegram.messenger.g0.T1(this.f12499f, f11, f12);
                f10 = org.telegram.messenger.g0.T1(this.h, f10, this.f12501r);
                org.telegram.messenger.g0.Z1(this.f12498e, rectF, this.f12501r, rectF);
            }
            textView2.setAlpha(f11);
            textView.setAlpha(f10);
            float height = rectF.height() / 2.0f;
            canvas.drawRoundRect(rectF, height, height, this.f12496b);
        }
        super.dispatchDraw(canvas);
    }
}
