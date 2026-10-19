package ci;

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
import org.telegram.ui.Components.nm0;
public final class j5 extends FrameLayout {
    public final LinearLayout f5534a;
    public final Paint f5535b;
    public final TextView f5536c;
    public final TextView d;
    public final RectF e;
    public float f5537f;
    public float h;
    public final RectF f5538n;
    public float f5539r;
    public int f5540s;
    public final nm0 v;
    public ValueAnimator f5541w;
    public final u5 f5542x;

    public j5(u5 u5Var, Context context) {
        super(context);
        this.f5542x = u5Var;
        Paint paint = new Paint(1);
        this.f5535b = paint;
        this.e = new RectF();
        this.f5538n = new RectF();
        this.f5539r = 1.0f;
        int i10 = org.telegram.ui.ActionBar.h6.f21078i6;
        b bVar = u5Var.f6054s;
        paint.setColor(org.telegram.ui.ActionBar.h6.w0(i10, bVar));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        TextView textView = new TextView(context);
        this.f5536c = textView;
        textView.setText(LocaleController.getString(R.string.AllViewers));
        int i11 = org.telegram.ui.ActionBar.h6.f21095j5;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, bVar));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setText(LocaleController.getString(R.string.Contacts));
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, bVar));
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
        linearLayout.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        linearLayout.addView(textView, w7.z5.t(-2, -2, 0, 13, 0, 0, 0));
        linearLayout.addView(textView2, w7.z5.t(-2, -2, 0, 0, 0, 0, 0));
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.f5534a = linearLayout2;
        linearLayout2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        linearLayout2.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(26.0f), org.telegram.ui.ActionBar.h6.w0(i10, bVar)));
        linearLayout2.setOrientation(0);
        nm0 nm0Var = new nm0(getContext());
        this.v = nm0Var;
        nm0Var.f28818r = true;
        nm0Var.a(R.drawable.menu_views_reactions3, false);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageDrawable(nm0Var);
        imageView.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
        linearLayout2.addView(imageView, w7.z5.n(26, 26));
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setImageResource(R.drawable.arrow_more);
        linearLayout2.addView(imageView2, w7.z5.n(16, 26));
        addView(linearLayout, w7.z5.c(-2.0f, -2));
        addView(linearLayout2, w7.z5.d(-2, -2.0f, 5, 13.0f, 6.0f, 13.0f, 6.0f));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final j5 f5420b;

            {
                this.f5420b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        u5 u5Var2 = this.f5420b.f5542x;
                        f5 f5Var = u5Var2.O;
                        if (f5Var.f5388b) {
                            f5Var.f5388b = false;
                            u5Var2.h(true);
                            u5.b(u5Var2);
                            return;
                        }
                        return;
                    case 1:
                        u5 u5Var3 = this.f5420b.f5542x;
                        f5 f5Var2 = u5Var3.O;
                        if (!f5Var2.f5388b) {
                            f5Var2.f5388b = true;
                            u5Var3.h(true);
                            u5.b(u5Var3);
                            return;
                        }
                        return;
                    default:
                        j5 j5Var = this.f5420b;
                        u5 u5Var4 = j5Var.f5542x;
                        i5 i5Var = new i5(j5Var, j5Var.getContext(), u5Var4.f6054s);
                        u5Var4.f6051f = i5Var;
                        LinearLayout linearLayout3 = j5Var.f5534a;
                        i5Var.f26930b = true;
                        i5Var.f26929a.showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
                        return;
                }
            }
        });
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final j5 f5420b;

            {
                this.f5420b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        u5 u5Var2 = this.f5420b.f5542x;
                        f5 f5Var = u5Var2.O;
                        if (f5Var.f5388b) {
                            f5Var.f5388b = false;
                            u5Var2.h(true);
                            u5.b(u5Var2);
                            return;
                        }
                        return;
                    case 1:
                        u5 u5Var3 = this.f5420b.f5542x;
                        f5 f5Var2 = u5Var3.O;
                        if (!f5Var2.f5388b) {
                            f5Var2.f5388b = true;
                            u5Var3.h(true);
                            u5.b(u5Var3);
                            return;
                        }
                        return;
                    default:
                        j5 j5Var = this.f5420b;
                        u5 u5Var4 = j5Var.f5542x;
                        i5 i5Var = new i5(j5Var, j5Var.getContext(), u5Var4.f6054s);
                        u5Var4.f6051f = i5Var;
                        LinearLayout linearLayout3 = j5Var.f5534a;
                        i5Var.f26930b = true;
                        i5Var.f26929a.showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
                        return;
                }
            }
        });
        linearLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final j5 f5420b;

            {
                this.f5420b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        u5 u5Var2 = this.f5420b.f5542x;
                        f5 f5Var = u5Var2.O;
                        if (f5Var.f5388b) {
                            f5Var.f5388b = false;
                            u5Var2.h(true);
                            u5.b(u5Var2);
                            return;
                        }
                        return;
                    case 1:
                        u5 u5Var3 = this.f5420b.f5542x;
                        f5 f5Var2 = u5Var3.O;
                        if (!f5Var2.f5388b) {
                            f5Var2.f5388b = true;
                            u5Var3.h(true);
                            u5.b(u5Var3);
                            return;
                        }
                        return;
                    default:
                        j5 j5Var = this.f5420b;
                        u5 u5Var4 = j5Var.f5542x;
                        i5 i5Var = new i5(j5Var, j5Var.getContext(), u5Var4.f6054s);
                        u5Var4.f6051f = i5Var;
                        LinearLayout linearLayout3 = j5Var.f5534a;
                        i5Var.f26930b = true;
                        i5Var.f26929a.showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
                        return;
                }
            }
        });
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        if (this.f5542x.T) {
            int i10 = this.f5540s;
            TextView textView = this.d;
            float f10 = 0.5f;
            TextView textView2 = this.f5536c;
            if (i10 == 0) {
                textView2.getHitRect(AndroidUtilities.rectTmp2);
                f7 = 0.5f;
                f10 = 1.0f;
            } else {
                textView.getHitRect(AndroidUtilities.rectTmp2);
                f7 = 1.0f;
            }
            Rect rect = AndroidUtilities.rectTmp2;
            RectF rectF = this.f5538n;
            rectF.set(rect);
            float f11 = this.f5539r;
            if (f11 != 1.0f) {
                f10 = AndroidUtilities.lerp(this.f5537f, f10, f11);
                f7 = AndroidUtilities.lerp(this.h, f7, this.f5539r);
                AndroidUtilities.lerp(this.e, rectF, this.f5539r, rectF);
            }
            textView2.setAlpha(f10);
            textView.setAlpha(f7);
            float height = rectF.height() / 2.0f;
            canvas.drawRoundRect(rectF, height, height, this.f5535b);
        }
        super.dispatchDraw(canvas);
    }
}
