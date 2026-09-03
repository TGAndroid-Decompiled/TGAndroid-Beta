package nh;

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
import org.telegram.ui.Components.xl0;
public final class t4 extends FrameLayout {
    public final LinearLayout f15885a;
    public final Paint f15886b;
    public final TextView f15887c;
    public final TextView d;
    public final RectF e;
    public float f15888f;
    public float h;
    public final RectF f15889n;
    public float f15890r;
    public int f15891s;
    public final xl0 v;
    public ValueAnimator f15892w;
    public final d5 f15893x;

    public t4(d5 d5Var, Context context) {
        super(context);
        this.f15893x = d5Var;
        Paint paint = new Paint(1);
        this.f15886b = paint;
        this.e = new RectF();
        this.f15889n = new RectF();
        this.f15890r = 1.0f;
        int i10 = org.telegram.ui.ActionBar.j6.f19971i6;
        b bVar = d5Var.f15251s;
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(i10, bVar));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        TextView textView = new TextView(context);
        this.f15887c = textView;
        textView.setText(LocaleController.getString(R.string.AllViewers));
        int i11 = org.telegram.ui.ActionBar.j6.f19987j5;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, bVar));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setText(LocaleController.getString(R.string.Contacts));
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, bVar));
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
        linearLayout.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        linearLayout.addView(textView, k7.b6.t(-2, -2, 0, 13, 0, 0, 0));
        linearLayout.addView(textView2, k7.b6.t(-2, -2, 0, 0, 0, 0, 0));
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.f15885a = linearLayout2;
        linearLayout2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        linearLayout2.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(26.0f), org.telegram.ui.ActionBar.j6.v0(i10, bVar)));
        linearLayout2.setOrientation(0);
        xl0 xl0Var = new xl0(getContext());
        this.v = xl0Var;
        xl0Var.f30664r = true;
        xl0Var.a(R.drawable.menu_views_reactions3, false);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageDrawable(xl0Var);
        imageView.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
        linearLayout2.addView(imageView, k7.b6.n(26, 26));
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setImageResource(R.drawable.arrow_more);
        linearLayout2.addView(imageView2, k7.b6.n(16, 26));
        addView(linearLayout, k7.b6.c(-2.0f, -2));
        addView(linearLayout2, k7.b6.d(-2, -2.0f, 5, 13.0f, 6.0f, 13.0f, 6.0f));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final t4 f15782b;

            {
                this.f15782b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        d5 d5Var2 = this.f15782b.f15893x;
                        p4 p4Var = d5Var2.L;
                        if (p4Var.f15727b) {
                            p4Var.f15727b = false;
                            d5Var2.h(true);
                            d5.b(d5Var2);
                            return;
                        }
                        return;
                    case 1:
                        d5 d5Var3 = this.f15782b.f15893x;
                        p4 p4Var2 = d5Var3.L;
                        if (!p4Var2.f15727b) {
                            p4Var2.f15727b = true;
                            d5Var3.h(true);
                            d5.b(d5Var3);
                            return;
                        }
                        return;
                    default:
                        t4 t4Var = this.f15782b;
                        d5 d5Var4 = t4Var.f15893x;
                        s4 s4Var = new s4(t4Var, t4Var.getContext(), d5Var4.f15251s);
                        d5Var4.f15248f = s4Var;
                        LinearLayout linearLayout3 = t4Var.f15885a;
                        s4Var.f29290b = true;
                        s4Var.f29289a.showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
                        return;
                }
            }
        });
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final t4 f15782b;

            {
                this.f15782b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        d5 d5Var2 = this.f15782b.f15893x;
                        p4 p4Var = d5Var2.L;
                        if (p4Var.f15727b) {
                            p4Var.f15727b = false;
                            d5Var2.h(true);
                            d5.b(d5Var2);
                            return;
                        }
                        return;
                    case 1:
                        d5 d5Var3 = this.f15782b.f15893x;
                        p4 p4Var2 = d5Var3.L;
                        if (!p4Var2.f15727b) {
                            p4Var2.f15727b = true;
                            d5Var3.h(true);
                            d5.b(d5Var3);
                            return;
                        }
                        return;
                    default:
                        t4 t4Var = this.f15782b;
                        d5 d5Var4 = t4Var.f15893x;
                        s4 s4Var = new s4(t4Var, t4Var.getContext(), d5Var4.f15251s);
                        d5Var4.f15248f = s4Var;
                        LinearLayout linearLayout3 = t4Var.f15885a;
                        s4Var.f29290b = true;
                        s4Var.f29289a.showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
                        return;
                }
            }
        });
        linearLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final t4 f15782b;

            {
                this.f15782b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        d5 d5Var2 = this.f15782b.f15893x;
                        p4 p4Var = d5Var2.L;
                        if (p4Var.f15727b) {
                            p4Var.f15727b = false;
                            d5Var2.h(true);
                            d5.b(d5Var2);
                            return;
                        }
                        return;
                    case 1:
                        d5 d5Var3 = this.f15782b.f15893x;
                        p4 p4Var2 = d5Var3.L;
                        if (!p4Var2.f15727b) {
                            p4Var2.f15727b = true;
                            d5Var3.h(true);
                            d5.b(d5Var3);
                            return;
                        }
                        return;
                    default:
                        t4 t4Var = this.f15782b;
                        d5 d5Var4 = t4Var.f15893x;
                        s4 s4Var = new s4(t4Var, t4Var.getContext(), d5Var4.f15251s);
                        d5Var4.f15248f = s4Var;
                        LinearLayout linearLayout3 = t4Var.f15885a;
                        s4Var.f29290b = true;
                        s4Var.f29289a.showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
                        return;
                }
            }
        });
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        if (this.f15893x.Q) {
            int i10 = this.f15891s;
            TextView textView = this.d;
            float f11 = 0.5f;
            TextView textView2 = this.f15887c;
            if (i10 == 0) {
                textView2.getHitRect(AndroidUtilities.rectTmp2);
                f10 = 0.5f;
                f11 = 1.0f;
            } else {
                textView.getHitRect(AndroidUtilities.rectTmp2);
                f10 = 1.0f;
            }
            Rect rect = AndroidUtilities.rectTmp2;
            RectF rectF = this.f15889n;
            rectF.set(rect);
            float f12 = this.f15890r;
            if (f12 != 1.0f) {
                f11 = AndroidUtilities.lerp(this.f15888f, f11, f12);
                f10 = AndroidUtilities.lerp(this.h, f10, this.f15890r);
                AndroidUtilities.lerp(this.e, rectF, this.f15890r, rectF);
            }
            textView2.setAlpha(f11);
            textView.setAlpha(f10);
            float height = rectF.height() / 2.0f;
            canvas.drawRoundRect(rectF, height, height, this.f15886b);
        }
        super.dispatchDraw(canvas);
    }
}
