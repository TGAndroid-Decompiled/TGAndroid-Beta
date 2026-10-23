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
import org.telegram.ui.Components.om0;
public final class j5 extends FrameLayout {
    public final LinearLayout f5532a;
    public final Paint f5533b;
    public final TextView f5534c;
    public final TextView d;
    public final RectF e;
    public float f5535f;
    public float h;
    public final RectF f5536n;
    public float f5537r;
    public int f5538s;
    public final om0 v;
    public ValueAnimator f5539w;
    public final u5 f5540x;

    public j5(u5 u5Var, Context context) {
        super(context);
        this.f5540x = u5Var;
        Paint paint = new Paint(1);
        this.f5533b = paint;
        this.e = new RectF();
        this.f5536n = new RectF();
        this.f5537r = 1.0f;
        int i10 = org.telegram.ui.ActionBar.h6.f21083i6;
        b bVar = u5Var.f6052s;
        paint.setColor(org.telegram.ui.ActionBar.h6.w0(i10, bVar));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        TextView textView = new TextView(context);
        this.f5534c = textView;
        textView.setText(LocaleController.getString(R.string.AllViewers));
        int i11 = org.telegram.ui.ActionBar.h6.f21100j5;
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
        this.f5532a = linearLayout2;
        linearLayout2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        linearLayout2.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(26.0f), org.telegram.ui.ActionBar.h6.w0(i10, bVar)));
        linearLayout2.setOrientation(0);
        om0 om0Var = new om0(getContext());
        this.v = om0Var;
        om0Var.f29082r = true;
        om0Var.a(R.drawable.menu_views_reactions3, false);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageDrawable(om0Var);
        imageView.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
        linearLayout2.addView(imageView, w7.z5.n(26, 26));
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setImageResource(R.drawable.arrow_more);
        linearLayout2.addView(imageView2, w7.z5.n(16, 26));
        addView(linearLayout, w7.z5.c(-2.0f, -2));
        addView(linearLayout2, w7.z5.d(-2, -2.0f, 5, 13.0f, 6.0f, 13.0f, 6.0f));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final j5 f5418b;

            {
                this.f5418b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        u5 u5Var2 = this.f5418b.f5540x;
                        f5 f5Var = u5Var2.O;
                        if (f5Var.f5386b) {
                            f5Var.f5386b = false;
                            u5Var2.h(true);
                            u5.b(u5Var2);
                            return;
                        }
                        return;
                    case 1:
                        u5 u5Var3 = this.f5418b.f5540x;
                        f5 f5Var2 = u5Var3.O;
                        if (!f5Var2.f5386b) {
                            f5Var2.f5386b = true;
                            u5Var3.h(true);
                            u5.b(u5Var3);
                            return;
                        }
                        return;
                    default:
                        j5 j5Var = this.f5418b;
                        u5 u5Var4 = j5Var.f5540x;
                        i5 i5Var = new i5(j5Var, j5Var.getContext(), u5Var4.f6052s);
                        u5Var4.f6049f = i5Var;
                        LinearLayout linearLayout3 = j5Var.f5532a;
                        i5Var.f26997b = true;
                        i5Var.f26996a.showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
                        return;
                }
            }
        });
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final j5 f5418b;

            {
                this.f5418b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        u5 u5Var2 = this.f5418b.f5540x;
                        f5 f5Var = u5Var2.O;
                        if (f5Var.f5386b) {
                            f5Var.f5386b = false;
                            u5Var2.h(true);
                            u5.b(u5Var2);
                            return;
                        }
                        return;
                    case 1:
                        u5 u5Var3 = this.f5418b.f5540x;
                        f5 f5Var2 = u5Var3.O;
                        if (!f5Var2.f5386b) {
                            f5Var2.f5386b = true;
                            u5Var3.h(true);
                            u5.b(u5Var3);
                            return;
                        }
                        return;
                    default:
                        j5 j5Var = this.f5418b;
                        u5 u5Var4 = j5Var.f5540x;
                        i5 i5Var = new i5(j5Var, j5Var.getContext(), u5Var4.f6052s);
                        u5Var4.f6049f = i5Var;
                        LinearLayout linearLayout3 = j5Var.f5532a;
                        i5Var.f26997b = true;
                        i5Var.f26996a.showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
                        return;
                }
            }
        });
        linearLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final j5 f5418b;

            {
                this.f5418b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        u5 u5Var2 = this.f5418b.f5540x;
                        f5 f5Var = u5Var2.O;
                        if (f5Var.f5386b) {
                            f5Var.f5386b = false;
                            u5Var2.h(true);
                            u5.b(u5Var2);
                            return;
                        }
                        return;
                    case 1:
                        u5 u5Var3 = this.f5418b.f5540x;
                        f5 f5Var2 = u5Var3.O;
                        if (!f5Var2.f5386b) {
                            f5Var2.f5386b = true;
                            u5Var3.h(true);
                            u5.b(u5Var3);
                            return;
                        }
                        return;
                    default:
                        j5 j5Var = this.f5418b;
                        u5 u5Var4 = j5Var.f5540x;
                        i5 i5Var = new i5(j5Var, j5Var.getContext(), u5Var4.f6052s);
                        u5Var4.f6049f = i5Var;
                        LinearLayout linearLayout3 = j5Var.f5532a;
                        i5Var.f26997b = true;
                        i5Var.f26996a.showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
                        return;
                }
            }
        });
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        if (this.f5540x.T) {
            int i10 = this.f5538s;
            TextView textView = this.d;
            float f10 = 0.5f;
            TextView textView2 = this.f5534c;
            if (i10 == 0) {
                textView2.getHitRect(AndroidUtilities.rectTmp2);
                f7 = 0.5f;
                f10 = 1.0f;
            } else {
                textView.getHitRect(AndroidUtilities.rectTmp2);
                f7 = 1.0f;
            }
            Rect rect = AndroidUtilities.rectTmp2;
            RectF rectF = this.f5536n;
            rectF.set(rect);
            float f11 = this.f5537r;
            if (f11 != 1.0f) {
                f10 = AndroidUtilities.lerp(this.f5535f, f10, f11);
                f7 = AndroidUtilities.lerp(this.h, f7, this.f5537r);
                AndroidUtilities.lerp(this.e, rectF, this.f5537r, rectF);
            }
            textView2.setAlpha(f10);
            textView.setAlpha(f7);
            float height = rectF.height() / 2.0f;
            canvas.drawRoundRect(rectF, height, height, this.f5533b);
        }
        super.dispatchDraw(canvas);
    }
}
