package defpackage;

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
public final class z1a extends FrameLayout {
    public final LinearLayout a;
    public final Paint b;
    public final TextView c;
    public final TextView d;
    public final RectF e;
    public float f;
    public float h;
    public final RectF n;
    public float r;
    public boolean s;
    public final n99 w;
    public ValueAnimator x;
    public final i2a y;

    public z1a(i2a i2aVar, Context context) {
        super(context);
        this.y = i2aVar;
        Paint paint = new Paint(1);
        this.b = paint;
        this.e = new RectF();
        this.n = new RectF();
        this.r = 1.0f;
        int i = cmb.h6;
        r63 r63Var = i2aVar.s;
        paint.setColor(cmb.v0(i, r63Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setText(jb6.M0(2131754251, null));
        int i2 = cmb.i5;
        anb.X(textView, i2, r63Var);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(gm.o());
        textView.setPadding(gm.L(12.0f), gm.L(4.0f), gm.L(12.0f), gm.L(4.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setText(jb6.M0(2131751717, null));
        anb.X(textView2, i2, r63Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(gm.o());
        textView2.setPadding(gm.L(12.0f), gm.L(4.0f), gm.L(12.0f), gm.L(4.0f));
        linearLayout.setPadding(0, gm.L(6.0f), 0, gm.L(6.0f));
        linearLayout.addView(textView, qoe.t(-2, -2, 0, 13, 0, 0, 0));
        linearLayout.addView(textView2, qoe.t(-2, -2, 0, 0, 0, 0, 0));
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.a = linearLayout2;
        linearLayout2.setPadding(gm.L(6.0f), 0, gm.L(6.0f), 0);
        ShapeDrawable b0 = cmb.b0(gm.L(26.0f), cmb.v0(i, r63Var));
        wmb M = anb.M(i);
        linearLayout2.setBackground(b0);
        anb.j(linearLayout2, b0, M, null, r63Var);
        linearLayout2.setOrientation(0);
        n99 n99Var = new n99(getContext());
        this.w = n99Var;
        n99Var.r = true;
        n99Var.a(2131231923, false);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageDrawable(n99Var);
        imageView.setPadding(gm.L(1.0f), gm.L(1.0f), gm.L(1.0f), gm.L(1.0f));
        linearLayout2.addView(imageView, qoe.o(26, 26));
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setImageResource(2131230872);
        linearLayout2.addView(imageView2, qoe.o(16, 26));
        addView(linearLayout, qoe.c(-2.0f, -2));
        addView(linearLayout2, qoe.d(-2, -2.0f, 5, 13.0f, 6.0f, 13.0f, 6.0f));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final z1a b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                z1a z1aVar = this.b;
                switch (b) {
                    case 0:
                        i2a i2aVar2 = z1aVar.y;
                        v1a v1aVar = i2aVar2.P;
                        if (v1aVar.b) {
                            v1aVar.b = false;
                            i2aVar2.g(true);
                            i2aVar2.e();
                            return;
                        }
                        return;
                    case 1:
                        i2a i2aVar3 = z1aVar.y;
                        v1a v1aVar2 = i2aVar3.P;
                        if (!v1aVar2.b) {
                            v1aVar2.b = true;
                            i2aVar3.g(true);
                            i2aVar3.e();
                            return;
                        }
                        return;
                    default:
                        i2a i2aVar4 = z1aVar.y;
                        y1a y1aVar = new y1a(z1aVar, z1aVar.getContext(), i2aVar4.s);
                        i2aVar4.f = y1aVar;
                        LinearLayout linearLayout3 = z1aVar.a;
                        y1aVar.a = true;
                        ((m8) y1aVar.b).showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - gm.L(8.0f));
                        return;
                }
            }
        });
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final z1a b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                z1a z1aVar = this.b;
                switch (b) {
                    case 0:
                        i2a i2aVar2 = z1aVar.y;
                        v1a v1aVar = i2aVar2.P;
                        if (v1aVar.b) {
                            v1aVar.b = false;
                            i2aVar2.g(true);
                            i2aVar2.e();
                            return;
                        }
                        return;
                    case 1:
                        i2a i2aVar3 = z1aVar.y;
                        v1a v1aVar2 = i2aVar3.P;
                        if (!v1aVar2.b) {
                            v1aVar2.b = true;
                            i2aVar3.g(true);
                            i2aVar3.e();
                            return;
                        }
                        return;
                    default:
                        i2a i2aVar4 = z1aVar.y;
                        y1a y1aVar = new y1a(z1aVar, z1aVar.getContext(), i2aVar4.s);
                        i2aVar4.f = y1aVar;
                        LinearLayout linearLayout3 = z1aVar.a;
                        y1aVar.a = true;
                        ((m8) y1aVar.b).showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - gm.L(8.0f));
                        return;
                }
            }
        });
        linearLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final z1a b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                z1a z1aVar = this.b;
                switch (b) {
                    case 0:
                        i2a i2aVar2 = z1aVar.y;
                        v1a v1aVar = i2aVar2.P;
                        if (v1aVar.b) {
                            v1aVar.b = false;
                            i2aVar2.g(true);
                            i2aVar2.e();
                            return;
                        }
                        return;
                    case 1:
                        i2a i2aVar3 = z1aVar.y;
                        v1a v1aVar2 = i2aVar3.P;
                        if (!v1aVar2.b) {
                            v1aVar2.b = true;
                            i2aVar3.g(true);
                            i2aVar3.e();
                            return;
                        }
                        return;
                    default:
                        i2a i2aVar4 = z1aVar.y;
                        y1a y1aVar = new y1a(z1aVar, z1aVar.getContext(), i2aVar4.s);
                        i2aVar4.f = y1aVar;
                        LinearLayout linearLayout3 = z1aVar.a;
                        y1aVar.a = true;
                        ((m8) y1aVar.b).showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - gm.L(8.0f));
                        return;
                }
            }
        });
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Rect rect;
        float f;
        if (this.y.U) {
            boolean z = this.s;
            TextView textView = this.d;
            float f2 = 0.5f;
            TextView textView2 = this.c;
            if (!z) {
                rect = gm.Q;
                textView2.getHitRect(rect);
                f = 0.5f;
                f2 = 1.0f;
            } else {
                rect = gm.Q;
                textView.getHitRect(rect);
                f = 1.0f;
            }
            RectF rectF = this.n;
            rectF.set(rect);
            float f3 = this.r;
            if (f3 != 1.0f) {
                f2 = gm.R1(this.f, f2, f3);
                f = gm.R1(this.h, f, this.r);
                gm.X1(this.e, rectF, this.r, rectF);
            }
            textView2.setAlpha(f2);
            textView.setAlpha(f);
            float height = rectF.height() / 2.0f;
            canvas.drawRoundRect(rectF, height, height, this.b);
        }
        super.dispatchDraw(canvas);
    }
}
