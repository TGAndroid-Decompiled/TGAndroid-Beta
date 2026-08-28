package ih;

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
import org.telegram.ui.Components.bl0;
public final class w4 extends FrameLayout {
    public final LinearLayout f12292a;
    public final Paint f12293b;
    public final TextView f12294c;
    public final TextView d;
    public final RectF f12295e;
    public float f12296f;
    public float h;
    public final RectF f12297n;
    public float f12298r;
    public int f12299s;
    public final bl0 v;
    public ValueAnimator f12300w;
    public final g5 f12301x;

    public w4(g5 g5Var, Context context) {
        super(context);
        this.f12301x = g5Var;
        Paint paint = new Paint(1);
        this.f12293b = paint;
        this.f12295e = new RectF();
        this.f12297n = new RectF();
        this.f12298r = 1.0f;
        int i9 = org.telegram.ui.ActionBar.f6.f23092i6;
        b bVar = g5Var.f11482s;
        paint.setColor(org.telegram.ui.ActionBar.f6.v0(i9, bVar));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        TextView textView = new TextView(context);
        this.f12294c = textView;
        textView.setText(LocaleController.getString(R.string.AllViewers));
        int i10 = org.telegram.ui.ActionBar.f6.f23108j5;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, bVar));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setText(LocaleController.getString(R.string.Contacts));
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, bVar));
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
        linearLayout.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        linearLayout.addView(textView, g7.e6.t(-2, -2, 0, 13, 0, 0, 0));
        linearLayout.addView(textView2, g7.e6.t(-2, -2, 0, 0, 0, 0, 0));
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.f12292a = linearLayout2;
        linearLayout2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        linearLayout2.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(26.0f), org.telegram.ui.ActionBar.f6.v0(i9, bVar)));
        linearLayout2.setOrientation(0);
        bl0 bl0Var = new bl0(getContext());
        this.v = bl0Var;
        bl0Var.f27242r = true;
        bl0Var.a(R.drawable.menu_views_reactions3, false);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageDrawable(bl0Var);
        imageView.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
        linearLayout2.addView(imageView, g7.e6.n(26, 26));
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setImageResource(R.drawable.arrow_more);
        linearLayout2.addView(imageView2, g7.e6.n(16, 26));
        addView(linearLayout, g7.e6.c(-2.0f, -2));
        addView(linearLayout2, g7.e6.d(-2, -2.0f, 5, 13.0f, 6.0f, 13.0f, 6.0f));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final w4 f12164b;

            {
                this.f12164b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        g5 g5Var2 = this.f12164b.f12301x;
                        s4 s4Var = g5Var2.K;
                        if (s4Var.f12116b) {
                            s4Var.f12116b = false;
                            g5Var2.h(true);
                            g5.b(g5Var2);
                            return;
                        }
                        return;
                    case 1:
                        g5 g5Var3 = this.f12164b.f12301x;
                        s4 s4Var2 = g5Var3.K;
                        if (!s4Var2.f12116b) {
                            s4Var2.f12116b = true;
                            g5Var3.h(true);
                            g5.b(g5Var3);
                            return;
                        }
                        return;
                    default:
                        w4 w4Var = this.f12164b;
                        g5 g5Var4 = w4Var.f12301x;
                        v4 v4Var = new v4(w4Var, w4Var.getContext(), g5Var4.f11482s);
                        g5Var4.f11479f = v4Var;
                        LinearLayout linearLayout3 = w4Var.f12292a;
                        v4Var.f31171b = true;
                        v4Var.f31170a.showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
                        return;
                }
            }
        });
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final w4 f12164b;

            {
                this.f12164b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        g5 g5Var2 = this.f12164b.f12301x;
                        s4 s4Var = g5Var2.K;
                        if (s4Var.f12116b) {
                            s4Var.f12116b = false;
                            g5Var2.h(true);
                            g5.b(g5Var2);
                            return;
                        }
                        return;
                    case 1:
                        g5 g5Var3 = this.f12164b.f12301x;
                        s4 s4Var2 = g5Var3.K;
                        if (!s4Var2.f12116b) {
                            s4Var2.f12116b = true;
                            g5Var3.h(true);
                            g5.b(g5Var3);
                            return;
                        }
                        return;
                    default:
                        w4 w4Var = this.f12164b;
                        g5 g5Var4 = w4Var.f12301x;
                        v4 v4Var = new v4(w4Var, w4Var.getContext(), g5Var4.f11482s);
                        g5Var4.f11479f = v4Var;
                        LinearLayout linearLayout3 = w4Var.f12292a;
                        v4Var.f31171b = true;
                        v4Var.f31170a.showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
                        return;
                }
            }
        });
        linearLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final w4 f12164b;

            {
                this.f12164b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        g5 g5Var2 = this.f12164b.f12301x;
                        s4 s4Var = g5Var2.K;
                        if (s4Var.f12116b) {
                            s4Var.f12116b = false;
                            g5Var2.h(true);
                            g5.b(g5Var2);
                            return;
                        }
                        return;
                    case 1:
                        g5 g5Var3 = this.f12164b.f12301x;
                        s4 s4Var2 = g5Var3.K;
                        if (!s4Var2.f12116b) {
                            s4Var2.f12116b = true;
                            g5Var3.h(true);
                            g5.b(g5Var3);
                            return;
                        }
                        return;
                    default:
                        w4 w4Var = this.f12164b;
                        g5 g5Var4 = w4Var.f12301x;
                        v4 v4Var = new v4(w4Var, w4Var.getContext(), g5Var4.f11482s);
                        g5Var4.f11479f = v4Var;
                        LinearLayout linearLayout3 = w4Var.f12292a;
                        v4Var.f31171b = true;
                        v4Var.f31170a.showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
                        return;
                }
            }
        });
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        if (this.f12301x.P) {
            int i9 = this.f12299s;
            TextView textView = this.d;
            float f11 = 0.5f;
            TextView textView2 = this.f12294c;
            if (i9 == 0) {
                textView2.getHitRect(AndroidUtilities.rectTmp2);
                f10 = 0.5f;
                f11 = 1.0f;
            } else {
                textView.getHitRect(AndroidUtilities.rectTmp2);
                f10 = 1.0f;
            }
            Rect rect = AndroidUtilities.rectTmp2;
            RectF rectF = this.f12297n;
            rectF.set(rect);
            float f12 = this.f12298r;
            if (f12 != 1.0f) {
                f11 = AndroidUtilities.lerp(this.f12296f, f11, f12);
                f10 = AndroidUtilities.lerp(this.h, f10, this.f12298r);
                AndroidUtilities.lerp(this.f12295e, rectF, this.f12298r, rectF);
            }
            textView2.setAlpha(f11);
            textView.setAlpha(f10);
            float height = rectF.height() / 2.0f;
            canvas.drawRoundRect(rectF, height, height, this.f12293b);
        }
        super.dispatchDraw(canvas);
    }
}
