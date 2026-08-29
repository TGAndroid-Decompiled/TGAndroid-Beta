package lh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ol0;
public final class s4 extends FrameLayout {
    public final LinearLayout f16205a;
    public final Paint f16206b;
    public final TextView f16207c;
    public final TextView d;
    public final RectF f16208e;
    public float f16209f;
    public float h;
    public final RectF f16210n;
    public float f16211r;
    public int f16212s;
    public final ol0 v;
    public ValueAnimator f16213w;
    public final c5 f16214x;

    public s4(c5 c5Var, Context context) {
        super(context);
        this.f16214x = c5Var;
        Paint paint = new Paint(1);
        this.f16206b = paint;
        this.f16208e = new RectF();
        this.f16210n = new RectF();
        this.f16211r = 1.0f;
        int i10 = org.telegram.ui.ActionBar.g6.f23152i6;
        b bVar = c5Var.f15439s;
        paint.setColor(org.telegram.ui.ActionBar.g6.v0(i10, bVar));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        TextView textView = new TextView(context);
        this.f16207c = textView;
        textView.setText(LocaleController.getString(R.string.AllViewers));
        int i11 = org.telegram.ui.ActionBar.g6.f23169j5;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, bVar));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setText(LocaleController.getString(R.string.Contacts));
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, bVar));
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
        linearLayout.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        linearLayout.addView(textView, i7.f6.t(-2, -2, 0, 13, 0, 0, 0));
        linearLayout.addView(textView2, i7.f6.t(-2, -2, 0, 0, 0, 0, 0));
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.f16205a = linearLayout2;
        linearLayout2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        linearLayout2.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(26.0f), org.telegram.ui.ActionBar.g6.v0(i10, bVar)));
        linearLayout2.setOrientation(0);
        ol0 ol0Var = new ol0(getContext());
        this.v = ol0Var;
        ol0Var.f31389r = true;
        ol0Var.a(R.drawable.menu_views_reactions3, false);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageDrawable(ol0Var);
        imageView.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
        linearLayout2.addView(imageView, i7.f6.n(26, 26));
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setImageResource(R.drawable.arrow_more);
        linearLayout2.addView(imageView2, i7.f6.n(16, 26));
        addView(linearLayout, i7.f6.c(-2.0f, -2));
        addView(linearLayout2, i7.f6.d(-2, -2.0f, 5, 13.0f, 6.0f, 13.0f, 6.0f));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final s4 f16091b;

            {
                this.f16091b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        c5 c5Var2 = this.f16091b.f16214x;
                        o4 o4Var = c5Var2.K;
                        if (o4Var.f16018b) {
                            o4Var.f16018b = false;
                            c5Var2.h(true);
                            c5.b(c5Var2);
                            return;
                        }
                        return;
                    case 1:
                        c5 c5Var3 = this.f16091b.f16214x;
                        o4 o4Var2 = c5Var3.K;
                        if (!o4Var2.f16018b) {
                            o4Var2.f16018b = true;
                            c5Var3.h(true);
                            c5.b(c5Var3);
                            return;
                        }
                        return;
                    default:
                        s4 s4Var = this.f16091b;
                        c5 c5Var4 = s4Var.f16214x;
                        r4 r4Var = new r4(s4Var, s4Var.getContext(), c5Var4.f15439s);
                        c5Var4.f15436f = r4Var;
                        LinearLayout linearLayout3 = s4Var.f16205a;
                        r4Var.f32371b = true;
                        r4Var.f32370a.showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
                        return;
                }
            }
        });
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final s4 f16091b;

            {
                this.f16091b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        c5 c5Var2 = this.f16091b.f16214x;
                        o4 o4Var = c5Var2.K;
                        if (o4Var.f16018b) {
                            o4Var.f16018b = false;
                            c5Var2.h(true);
                            c5.b(c5Var2);
                            return;
                        }
                        return;
                    case 1:
                        c5 c5Var3 = this.f16091b.f16214x;
                        o4 o4Var2 = c5Var3.K;
                        if (!o4Var2.f16018b) {
                            o4Var2.f16018b = true;
                            c5Var3.h(true);
                            c5.b(c5Var3);
                            return;
                        }
                        return;
                    default:
                        s4 s4Var = this.f16091b;
                        c5 c5Var4 = s4Var.f16214x;
                        r4 r4Var = new r4(s4Var, s4Var.getContext(), c5Var4.f15439s);
                        c5Var4.f15436f = r4Var;
                        LinearLayout linearLayout3 = s4Var.f16205a;
                        r4Var.f32371b = true;
                        r4Var.f32370a.showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
                        return;
                }
            }
        });
        linearLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final s4 f16091b;

            {
                this.f16091b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        c5 c5Var2 = this.f16091b.f16214x;
                        o4 o4Var = c5Var2.K;
                        if (o4Var.f16018b) {
                            o4Var.f16018b = false;
                            c5Var2.h(true);
                            c5.b(c5Var2);
                            return;
                        }
                        return;
                    case 1:
                        c5 c5Var3 = this.f16091b.f16214x;
                        o4 o4Var2 = c5Var3.K;
                        if (!o4Var2.f16018b) {
                            o4Var2.f16018b = true;
                            c5Var3.h(true);
                            c5.b(c5Var3);
                            return;
                        }
                        return;
                    default:
                        s4 s4Var = this.f16091b;
                        c5 c5Var4 = s4Var.f16214x;
                        r4 r4Var = new r4(s4Var, s4Var.getContext(), c5Var4.f15439s);
                        c5Var4.f15436f = r4Var;
                        LinearLayout linearLayout3 = s4Var.f16205a;
                        r4Var.f32371b = true;
                        r4Var.f32370a.showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
                        return;
                }
            }
        });
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f9;
        if (this.f16214x.P) {
            int i10 = this.f16212s;
            TextView textView = this.d;
            float f10 = 0.5f;
            TextView textView2 = this.f16207c;
            if (i10 == 0) {
                textView2.getHitRect(AndroidUtilities.rectTmp2);
                f9 = 0.5f;
                f10 = 1.0f;
            } else {
                textView.getHitRect(AndroidUtilities.rectTmp2);
                f9 = 1.0f;
            }
            Rect rect = AndroidUtilities.rectTmp2;
            RectF rectF = this.f16210n;
            rectF.set(rect);
            float f11 = this.f16211r;
            if (f11 != 1.0f) {
                f10 = AndroidUtilities.lerp(this.f16209f, f10, f11);
                f9 = AndroidUtilities.lerp(this.h, f9, this.f16211r);
                AndroidUtilities.lerp(this.f16208e, rectF, this.f16211r, rectF);
            }
            textView2.setAlpha(f10);
            textView.setAlpha(f9);
            float height = rectF.height() / 2.0f;
            canvas.drawRoundRect(rectF, height, height, this.f16206b);
        }
        super.dispatchDraw(canvas);
    }
}
