package ai;

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
import org.telegram.ui.Components.wm0;
public final class z6 extends FrameLayout {
    public final LinearLayout f2007a;
    public final Paint f2008b;
    public final TextView f2009c;
    public final TextView d;
    public final RectF f2010e;
    public float f2011f;
    public float h;
    public final RectF f2012n;
    public float f2013r;
    public int f2014s;
    public final wm0 v;
    public ValueAnimator f2015w;
    public final l7 f2016x;

    public z6(l7 l7Var, Context context) {
        super(context);
        this.f2016x = l7Var;
        Paint paint = new Paint(1);
        this.f2008b = paint;
        this.f2010e = new RectF();
        this.f2012n = new RectF();
        this.f2013r = 1.0f;
        int i10 = org.telegram.ui.ActionBar.h6.f20913i6;
        d dVar = l7Var.f1341s;
        paint.setColor(org.telegram.ui.ActionBar.h6.w0(i10, dVar));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        TextView textView = new TextView(context);
        this.f2009c = textView;
        textView.setText(LocaleController.getString(R.string.AllViewers));
        int i11 = org.telegram.ui.ActionBar.h6.f20930j5;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, dVar));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setText(LocaleController.getString(R.string.Contacts));
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, dVar));
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
        linearLayout.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        linearLayout.addView(textView, w7.x5.t(-2, -2, 0, 13, 0, 0, 0));
        linearLayout.addView(textView2, w7.x5.t(-2, -2, 0, 0, 0, 0, 0));
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.f2007a = linearLayout2;
        linearLayout2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        linearLayout2.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(26.0f), org.telegram.ui.ActionBar.h6.w0(i10, dVar)));
        linearLayout2.setOrientation(0);
        wm0 wm0Var = new wm0(getContext());
        this.v = wm0Var;
        wm0Var.f32742r = true;
        wm0Var.a(R.drawable.menu_views_reactions3, false);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageDrawable(wm0Var);
        imageView.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
        linearLayout2.addView(imageView, w7.x5.n(26, 26));
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setImageResource(R.drawable.arrow_more);
        linearLayout2.addView(imageView2, w7.x5.n(16, 26));
        addView(linearLayout, w7.x5.d(-2.0f, -2));
        addView(linearLayout2, w7.x5.a(-2.0f, 13.0f, 6.0f, 13.0f, 6.0f, -2, 5));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final z6 f1862b;

            {
                this.f1862b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        l7 l7Var2 = this.f1862b.f2016x;
                        v6 v6Var = l7Var2.O;
                        if (v6Var.f1826b) {
                            v6Var.f1826b = false;
                            l7Var2.h(true);
                            l7.b(l7Var2);
                            return;
                        }
                        return;
                    case 1:
                        l7 l7Var3 = this.f1862b.f2016x;
                        v6 v6Var2 = l7Var3.O;
                        if (!v6Var2.f1826b) {
                            v6Var2.f1826b = true;
                            l7Var3.h(true);
                            l7.b(l7Var3);
                            return;
                        }
                        return;
                    default:
                        z6 z6Var = this.f1862b;
                        l7 l7Var4 = z6Var.f2016x;
                        y6 y6Var = new y6(z6Var, z6Var.getContext(), l7Var4.f1341s);
                        l7Var4.f1338f = y6Var;
                        LinearLayout linearLayout3 = z6Var.f2007a;
                        y6Var.f29626b = true;
                        y6Var.f29625a.showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
                        return;
                }
            }
        });
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final z6 f1862b;

            {
                this.f1862b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        l7 l7Var2 = this.f1862b.f2016x;
                        v6 v6Var = l7Var2.O;
                        if (v6Var.f1826b) {
                            v6Var.f1826b = false;
                            l7Var2.h(true);
                            l7.b(l7Var2);
                            return;
                        }
                        return;
                    case 1:
                        l7 l7Var3 = this.f1862b.f2016x;
                        v6 v6Var2 = l7Var3.O;
                        if (!v6Var2.f1826b) {
                            v6Var2.f1826b = true;
                            l7Var3.h(true);
                            l7.b(l7Var3);
                            return;
                        }
                        return;
                    default:
                        z6 z6Var = this.f1862b;
                        l7 l7Var4 = z6Var.f2016x;
                        y6 y6Var = new y6(z6Var, z6Var.getContext(), l7Var4.f1341s);
                        l7Var4.f1338f = y6Var;
                        LinearLayout linearLayout3 = z6Var.f2007a;
                        y6Var.f29626b = true;
                        y6Var.f29625a.showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
                        return;
                }
            }
        });
        linearLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final z6 f1862b;

            {
                this.f1862b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        l7 l7Var2 = this.f1862b.f2016x;
                        v6 v6Var = l7Var2.O;
                        if (v6Var.f1826b) {
                            v6Var.f1826b = false;
                            l7Var2.h(true);
                            l7.b(l7Var2);
                            return;
                        }
                        return;
                    case 1:
                        l7 l7Var3 = this.f1862b.f2016x;
                        v6 v6Var2 = l7Var3.O;
                        if (!v6Var2.f1826b) {
                            v6Var2.f1826b = true;
                            l7Var3.h(true);
                            l7.b(l7Var3);
                            return;
                        }
                        return;
                    default:
                        z6 z6Var = this.f1862b;
                        l7 l7Var4 = z6Var.f2016x;
                        y6 y6Var = new y6(z6Var, z6Var.getContext(), l7Var4.f1341s);
                        l7Var4.f1338f = y6Var;
                        LinearLayout linearLayout3 = z6Var.f2007a;
                        y6Var.f29626b = true;
                        y6Var.f29625a.showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
                        return;
                }
            }
        });
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        if (this.f2016x.T) {
            int i10 = this.f2014s;
            TextView textView = this.d;
            float f10 = 0.5f;
            TextView textView2 = this.f2009c;
            if (i10 == 0) {
                textView2.getHitRect(AndroidUtilities.rectTmp2);
                f7 = 0.5f;
                f10 = 1.0f;
            } else {
                textView.getHitRect(AndroidUtilities.rectTmp2);
                f7 = 1.0f;
            }
            Rect rect = AndroidUtilities.rectTmp2;
            RectF rectF = this.f2012n;
            rectF.set(rect);
            float f11 = this.f2013r;
            if (f11 != 1.0f) {
                f10 = AndroidUtilities.lerp(this.f2011f, f10, f11);
                f7 = AndroidUtilities.lerp(this.h, f7, this.f2013r);
                AndroidUtilities.lerp(this.f2010e, rectF, this.f2013r, rectF);
            }
            textView2.setAlpha(f10);
            textView.setAlpha(f7);
            float height = rectF.height() / 2.0f;
            canvas.drawRoundRect(rectF, height, height, this.f2008b);
        }
        super.dispatchDraw(canvas);
    }
}
