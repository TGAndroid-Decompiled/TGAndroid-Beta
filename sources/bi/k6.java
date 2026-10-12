package bi;

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
import org.telegram.ui.Components.rm0;
public final class k6 extends FrameLayout {
    public final LinearLayout f3236a;
    public final Paint f3237b;
    public final TextView f3238c;
    public final TextView d;
    public final RectF e;
    public float f3239f;
    public float h;
    public final RectF f3240n;
    public float f3241r;
    public int f3242s;
    public final rm0 v;
    public ValueAnimator f3243w;
    public final w6 f3244x;

    public k6(w6 w6Var, Context context) {
        super(context);
        this.f3244x = w6Var;
        Paint paint = new Paint(1);
        this.f3237b = paint;
        this.e = new RectF();
        this.f3240n = new RectF();
        this.f3241r = 1.0f;
        int i10 = org.telegram.ui.ActionBar.g6.f19990i6;
        b bVar = w6Var.f3906s;
        paint.setColor(org.telegram.ui.ActionBar.g6.w0(i10, bVar));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        TextView textView = new TextView(context);
        this.f3238c = textView;
        textView.setText(LocaleController.getString(R.string.AllViewers));
        int i11 = org.telegram.ui.ActionBar.g6.f20007j5;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(i11, bVar));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setText(LocaleController.getString(R.string.Contacts));
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(i11, bVar));
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
        linearLayout.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        linearLayout.addView(textView, w7.a6.t(-2, -2, 0, 13, 0, 0, 0));
        linearLayout.addView(textView2, w7.a6.t(-2, -2, 0, 0, 0, 0, 0));
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.f3236a = linearLayout2;
        linearLayout2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        linearLayout2.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(26.0f), org.telegram.ui.ActionBar.g6.w0(i10, bVar)));
        linearLayout2.setOrientation(0);
        rm0 rm0Var = new rm0(getContext());
        this.v = rm0Var;
        rm0Var.f28878r = true;
        rm0Var.a(R.drawable.menu_views_reactions3, false);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageDrawable(rm0Var);
        imageView.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
        linearLayout2.addView(imageView, w7.a6.n(26, 26));
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setImageResource(R.drawable.arrow_more);
        linearLayout2.addView(imageView2, w7.a6.n(16, 26));
        addView(linearLayout, w7.a6.d(-2.0f, -2));
        addView(linearLayout2, w7.a6.a(-2.0f, 13.0f, 6.0f, 13.0f, 6.0f, -2, 5));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final k6 f3124b;

            {
                this.f3124b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        w6 w6Var2 = this.f3124b.f3244x;
                        g6 g6Var = w6Var2.O;
                        if (g6Var.f3078b) {
                            g6Var.f3078b = false;
                            w6Var2.h(true);
                            w6.b(w6Var2);
                            return;
                        }
                        return;
                    case 1:
                        w6 w6Var3 = this.f3124b.f3244x;
                        g6 g6Var2 = w6Var3.O;
                        if (!g6Var2.f3078b) {
                            g6Var2.f3078b = true;
                            w6Var3.h(true);
                            w6.b(w6Var3);
                            return;
                        }
                        return;
                    default:
                        k6 k6Var = this.f3124b;
                        w6 w6Var4 = k6Var.f3244x;
                        j6 j6Var = new j6(k6Var, k6Var.getContext(), w6Var4.f3906s);
                        w6Var4.f3903f = j6Var;
                        LinearLayout linearLayout3 = k6Var.f3236a;
                        j6Var.f26797b = true;
                        j6Var.f26796a.showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
                        return;
                }
            }
        });
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final k6 f3124b;

            {
                this.f3124b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        w6 w6Var2 = this.f3124b.f3244x;
                        g6 g6Var = w6Var2.O;
                        if (g6Var.f3078b) {
                            g6Var.f3078b = false;
                            w6Var2.h(true);
                            w6.b(w6Var2);
                            return;
                        }
                        return;
                    case 1:
                        w6 w6Var3 = this.f3124b.f3244x;
                        g6 g6Var2 = w6Var3.O;
                        if (!g6Var2.f3078b) {
                            g6Var2.f3078b = true;
                            w6Var3.h(true);
                            w6.b(w6Var3);
                            return;
                        }
                        return;
                    default:
                        k6 k6Var = this.f3124b;
                        w6 w6Var4 = k6Var.f3244x;
                        j6 j6Var = new j6(k6Var, k6Var.getContext(), w6Var4.f3906s);
                        w6Var4.f3903f = j6Var;
                        LinearLayout linearLayout3 = k6Var.f3236a;
                        j6Var.f26797b = true;
                        j6Var.f26796a.showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
                        return;
                }
            }
        });
        linearLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final k6 f3124b;

            {
                this.f3124b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        w6 w6Var2 = this.f3124b.f3244x;
                        g6 g6Var = w6Var2.O;
                        if (g6Var.f3078b) {
                            g6Var.f3078b = false;
                            w6Var2.h(true);
                            w6.b(w6Var2);
                            return;
                        }
                        return;
                    case 1:
                        w6 w6Var3 = this.f3124b.f3244x;
                        g6 g6Var2 = w6Var3.O;
                        if (!g6Var2.f3078b) {
                            g6Var2.f3078b = true;
                            w6Var3.h(true);
                            w6.b(w6Var3);
                            return;
                        }
                        return;
                    default:
                        k6 k6Var = this.f3124b;
                        w6 w6Var4 = k6Var.f3244x;
                        j6 j6Var = new j6(k6Var, k6Var.getContext(), w6Var4.f3906s);
                        w6Var4.f3903f = j6Var;
                        LinearLayout linearLayout3 = k6Var.f3236a;
                        j6Var.f26797b = true;
                        j6Var.f26796a.showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
                        return;
                }
            }
        });
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        if (this.f3244x.T) {
            int i10 = this.f3242s;
            TextView textView = this.d;
            float f10 = 0.5f;
            TextView textView2 = this.f3238c;
            if (i10 == 0) {
                textView2.getHitRect(AndroidUtilities.rectTmp2);
                f7 = 0.5f;
                f10 = 1.0f;
            } else {
                textView.getHitRect(AndroidUtilities.rectTmp2);
                f7 = 1.0f;
            }
            Rect rect = AndroidUtilities.rectTmp2;
            RectF rectF = this.f3240n;
            rectF.set(rect);
            float f11 = this.f3241r;
            if (f11 != 1.0f) {
                f10 = AndroidUtilities.lerp(this.f3239f, f10, f11);
                f7 = AndroidUtilities.lerp(this.h, f7, this.f3241r);
                AndroidUtilities.lerp(this.e, rectF, this.f3241r, rectF);
            }
            textView2.setAlpha(f10);
            textView.setAlpha(f7);
            float height = rectF.height() / 2.0f;
            canvas.drawRoundRect(rectF, height, height, this.f3237b);
        }
        super.dispatchDraw(canvas);
    }
}
