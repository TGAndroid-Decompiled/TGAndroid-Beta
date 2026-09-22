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
import org.telegram.ui.Components.ql0;
public final class y6 extends FrameLayout {
    public final LinearLayout f1750a;
    public final Paint f1751b;
    public final TextView f1752c;
    public final TextView d;
    public final RectF e;
    public float f1753f;
    public float h;
    public final RectF f1754n;
    public float f1755r;
    public int f1756s;
    public final ql0 v;
    public ValueAnimator f1757w;
    public final j7 f1758x;

    public y6(j7 j7Var, Context context) {
        super(context);
        this.f1758x = j7Var;
        Paint paint = new Paint(1);
        this.f1751b = paint;
        this.e = new RectF();
        this.f1754n = new RectF();
        this.f1755r = 1.0f;
        int i10 = org.telegram.ui.ActionBar.i6.f18923i6;
        d dVar = j7Var.f1050s;
        paint.setColor(org.telegram.ui.ActionBar.i6.v0(i10, dVar));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        TextView textView = new TextView(context);
        this.f1752c = textView;
        textView.setText(LocaleController.getString(R.string.AllViewers));
        int i11 = org.telegram.ui.ActionBar.i6.f18940j5;
        textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(i11, dVar));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setText(LocaleController.getString(R.string.Contacts));
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.v0(i11, dVar));
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
        linearLayout.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        linearLayout.addView(textView, w7.x5.t(-2, -2, 0, 13, 0, 0, 0));
        linearLayout.addView(textView2, w7.x5.t(-2, -2, 0, 0, 0, 0, 0));
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.f1750a = linearLayout2;
        linearLayout2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        linearLayout2.setBackground(org.telegram.ui.ActionBar.i6.b0(AndroidUtilities.dp(26.0f), org.telegram.ui.ActionBar.i6.v0(i10, dVar)));
        linearLayout2.setOrientation(0);
        ql0 ql0Var = new ql0(getContext());
        this.v = ql0Var;
        ql0Var.f27382r = true;
        ql0Var.a(R.drawable.menu_views_reactions3, false);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageDrawable(ql0Var);
        imageView.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
        linearLayout2.addView(imageView, w7.x5.n(26, 26));
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setImageResource(R.drawable.arrow_more);
        linearLayout2.addView(imageView2, w7.x5.n(16, 26));
        addView(linearLayout, w7.x5.c(-2.0f, -2));
        addView(linearLayout2, w7.x5.d(-2, -2.0f, 5, 13.0f, 6.0f, 13.0f, 6.0f));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final y6 f1609b;

            {
                this.f1609b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        j7 j7Var2 = this.f1609b.f1758x;
                        u6 u6Var = j7Var2.O;
                        if (u6Var.f1576b) {
                            u6Var.f1576b = false;
                            j7Var2.h(true);
                            j7.b(j7Var2);
                            return;
                        }
                        return;
                    case 1:
                        j7 j7Var3 = this.f1609b.f1758x;
                        u6 u6Var2 = j7Var3.O;
                        if (!u6Var2.f1576b) {
                            u6Var2.f1576b = true;
                            j7Var3.h(true);
                            j7.b(j7Var3);
                            return;
                        }
                        return;
                    default:
                        y6 y6Var = this.f1609b;
                        j7 j7Var4 = y6Var.f1758x;
                        x6 x6Var = new x6(y6Var, y6Var.getContext(), j7Var4.f1050s);
                        j7Var4.f1047f = x6Var;
                        LinearLayout linearLayout3 = y6Var.f1750a;
                        x6Var.f30043b = true;
                        x6Var.f30042a.showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
                        return;
                }
            }
        });
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final y6 f1609b;

            {
                this.f1609b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        j7 j7Var2 = this.f1609b.f1758x;
                        u6 u6Var = j7Var2.O;
                        if (u6Var.f1576b) {
                            u6Var.f1576b = false;
                            j7Var2.h(true);
                            j7.b(j7Var2);
                            return;
                        }
                        return;
                    case 1:
                        j7 j7Var3 = this.f1609b.f1758x;
                        u6 u6Var2 = j7Var3.O;
                        if (!u6Var2.f1576b) {
                            u6Var2.f1576b = true;
                            j7Var3.h(true);
                            j7.b(j7Var3);
                            return;
                        }
                        return;
                    default:
                        y6 y6Var = this.f1609b;
                        j7 j7Var4 = y6Var.f1758x;
                        x6 x6Var = new x6(y6Var, y6Var.getContext(), j7Var4.f1050s);
                        j7Var4.f1047f = x6Var;
                        LinearLayout linearLayout3 = y6Var.f1750a;
                        x6Var.f30043b = true;
                        x6Var.f30042a.showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
                        return;
                }
            }
        });
        linearLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final y6 f1609b;

            {
                this.f1609b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        j7 j7Var2 = this.f1609b.f1758x;
                        u6 u6Var = j7Var2.O;
                        if (u6Var.f1576b) {
                            u6Var.f1576b = false;
                            j7Var2.h(true);
                            j7.b(j7Var2);
                            return;
                        }
                        return;
                    case 1:
                        j7 j7Var3 = this.f1609b.f1758x;
                        u6 u6Var2 = j7Var3.O;
                        if (!u6Var2.f1576b) {
                            u6Var2.f1576b = true;
                            j7Var3.h(true);
                            j7.b(j7Var3);
                            return;
                        }
                        return;
                    default:
                        y6 y6Var = this.f1609b;
                        j7 j7Var4 = y6Var.f1758x;
                        x6 x6Var = new x6(y6Var, y6Var.getContext(), j7Var4.f1050s);
                        j7Var4.f1047f = x6Var;
                        LinearLayout linearLayout3 = y6Var.f1750a;
                        x6Var.f30043b = true;
                        x6Var.f30042a.showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
                        return;
                }
            }
        });
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        if (this.f1758x.T) {
            int i10 = this.f1756s;
            TextView textView = this.d;
            float f10 = 0.5f;
            TextView textView2 = this.f1752c;
            if (i10 == 0) {
                textView2.getHitRect(AndroidUtilities.rectTmp2);
                f7 = 0.5f;
                f10 = 1.0f;
            } else {
                textView.getHitRect(AndroidUtilities.rectTmp2);
                f7 = 1.0f;
            }
            Rect rect = AndroidUtilities.rectTmp2;
            RectF rectF = this.f1754n;
            rectF.set(rect);
            float f11 = this.f1755r;
            if (f11 != 1.0f) {
                f10 = AndroidUtilities.lerp(this.f1753f, f10, f11);
                f7 = AndroidUtilities.lerp(this.h, f7, this.f1755r);
                AndroidUtilities.lerp(this.e, rectF, this.f1755r, rectF);
            }
            textView2.setAlpha(f10);
            textView.setAlpha(f7);
            float height = rectF.height() / 2.0f;
            canvas.drawRoundRect(rectF, height, height, this.f1751b);
        }
        super.dispatchDraw(canvas);
    }
}
