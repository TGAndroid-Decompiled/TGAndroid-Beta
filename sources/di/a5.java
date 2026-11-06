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
import org.telegram.messenger.hd;
import org.telegram.ui.Components.xj0;
public final class a5 extends FrameLayout {
    public final LinearLayout f8804a;
    public final Paint f8805b;
    public final TextView f8806c;
    public final TextView d;
    public final RectF f8807e;
    public float f8808f;
    public float h;
    public final RectF f8809n;
    public float f8810r;
    public int f8811s;
    public final xj0 f8812w;
    public ValueAnimator f8813x;
    public final k5 f8814y;

    public a5(k5 k5Var, Context context) {
        super(context);
        this.f8814y = k5Var;
        Paint paint = new Paint(1);
        this.f8805b = paint;
        this.f8807e = new RectF();
        this.f8809n = new RectF();
        this.f8810r = 1.0f;
        int i7 = org.telegram.ui.ActionBar.k6.f27941i6;
        b bVar = k5Var.f9306s;
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(i7, bVar));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        TextView textView = new TextView(context);
        this.f8806c = textView;
        textView.setText(hd.M0(2131754286, null));
        int i10 = org.telegram.ui.ActionBar.k6.f27957j5;
        org.telegram.ui.ActionBar.r6.V(textView, i10, bVar);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setText(hd.M0(2131751780, null));
        org.telegram.ui.ActionBar.r6.V(textView2, i10, bVar);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f));
        linearLayout.setPadding(0, org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f));
        linearLayout.addView(textView, ha.t(-2, -2, 0, 13, 0, 0, 0));
        linearLayout.addView(textView2, ha.t(-2, -2, 0, 0, 0, 0, 0));
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.f8804a = linearLayout2;
        linearLayout2.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), 0);
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(26.0f), org.telegram.ui.ActionBar.k6.w0(i7, bVar));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i7);
        linearLayout2.setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(linearLayout2, d02, N, null, bVar);
        linearLayout2.setOrientation(0);
        xj0 xj0Var = new xj0(getContext());
        this.f8812w = xj0Var;
        xj0Var.f40308r = true;
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
            public final a5 f9925b;

            {
                this.f9925b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        k5 k5Var2 = this.f9925b.f8814y;
                        w4 w4Var = k5Var2.O;
                        if (w4Var.f9902b) {
                            w4Var.f9902b = false;
                            k5Var2.h(true);
                            k5.b(k5Var2);
                            return;
                        }
                        return;
                    case 1:
                        k5 k5Var3 = this.f9925b.f8814y;
                        w4 w4Var2 = k5Var3.O;
                        if (!w4Var2.f9902b) {
                            w4Var2.f9902b = true;
                            k5Var3.h(true);
                            k5.b(k5Var3);
                            return;
                        }
                        return;
                    default:
                        a5 a5Var = this.f9925b;
                        k5 k5Var4 = a5Var.f8814y;
                        z4 z4Var = new z4(a5Var, a5Var.getContext(), k5Var4.f9306s);
                        k5Var4.f9303f = z4Var;
                        LinearLayout linearLayout3 = a5Var.f8804a;
                        z4Var.f17102a = true;
                        ((org.telegram.ui.ActionBar.g1) z4Var.f17103b).showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - org.telegram.messenger.g0.L(8.0f));
                        return;
                }
            }
        });
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final a5 f9925b;

            {
                this.f9925b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        k5 k5Var2 = this.f9925b.f8814y;
                        w4 w4Var = k5Var2.O;
                        if (w4Var.f9902b) {
                            w4Var.f9902b = false;
                            k5Var2.h(true);
                            k5.b(k5Var2);
                            return;
                        }
                        return;
                    case 1:
                        k5 k5Var3 = this.f9925b.f8814y;
                        w4 w4Var2 = k5Var3.O;
                        if (!w4Var2.f9902b) {
                            w4Var2.f9902b = true;
                            k5Var3.h(true);
                            k5.b(k5Var3);
                            return;
                        }
                        return;
                    default:
                        a5 a5Var = this.f9925b;
                        k5 k5Var4 = a5Var.f8814y;
                        z4 z4Var = new z4(a5Var, a5Var.getContext(), k5Var4.f9306s);
                        k5Var4.f9303f = z4Var;
                        LinearLayout linearLayout3 = a5Var.f8804a;
                        z4Var.f17102a = true;
                        ((org.telegram.ui.ActionBar.g1) z4Var.f17103b).showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - org.telegram.messenger.g0.L(8.0f));
                        return;
                }
            }
        });
        linearLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final a5 f9925b;

            {
                this.f9925b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        k5 k5Var2 = this.f9925b.f8814y;
                        w4 w4Var = k5Var2.O;
                        if (w4Var.f9902b) {
                            w4Var.f9902b = false;
                            k5Var2.h(true);
                            k5.b(k5Var2);
                            return;
                        }
                        return;
                    case 1:
                        k5 k5Var3 = this.f9925b.f8814y;
                        w4 w4Var2 = k5Var3.O;
                        if (!w4Var2.f9902b) {
                            w4Var2.f9902b = true;
                            k5Var3.h(true);
                            k5.b(k5Var3);
                            return;
                        }
                        return;
                    default:
                        a5 a5Var = this.f9925b;
                        k5 k5Var4 = a5Var.f8814y;
                        z4 z4Var = new z4(a5Var, a5Var.getContext(), k5Var4.f9306s);
                        k5Var4.f9303f = z4Var;
                        LinearLayout linearLayout3 = a5Var.f8804a;
                        z4Var.f17102a = true;
                        ((org.telegram.ui.ActionBar.g1) z4Var.f17103b).showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - org.telegram.messenger.g0.L(8.0f));
                        return;
                }
            }
        });
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        if (this.f8814y.T) {
            int i7 = this.f8811s;
            TextView textView = this.d;
            float f11 = 0.5f;
            TextView textView2 = this.f8806c;
            if (i7 == 0) {
                textView2.getHitRect(org.telegram.messenger.g0.Q);
                f10 = 0.5f;
                f11 = 1.0f;
            } else {
                textView.getHitRect(org.telegram.messenger.g0.Q);
                f10 = 1.0f;
            }
            Rect rect = org.telegram.messenger.g0.Q;
            RectF rectF = this.f8809n;
            rectF.set(rect);
            float f12 = this.f8810r;
            if (f12 != 1.0f) {
                f11 = org.telegram.messenger.g0.T1(this.f8808f, f11, f12);
                f10 = org.telegram.messenger.g0.T1(this.h, f10, this.f8810r);
                org.telegram.messenger.g0.Z1(this.f8807e, rectF, this.f8810r, rectF);
            }
            textView2.setAlpha(f11);
            textView.setAlpha(f10);
            float height = rectF.height() / 2.0f;
            canvas.drawRoundRect(rectF, height, height, this.f8805b);
        }
        super.dispatchDraw(canvas);
    }
}
