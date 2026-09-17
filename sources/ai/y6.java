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
import org.telegram.ui.Components.rl0;
public final class y6 extends FrameLayout {
    public final LinearLayout f1753a;
    public final Paint f1754b;
    public final TextView f1755c;
    public final TextView d;
    public final RectF e;
    public float f1756f;
    public float h;
    public final RectF f1757n;
    public float f1758r;
    public int f1759s;
    public final rl0 v;
    public ValueAnimator f1760w;
    public final j7 f1761x;

    public y6(j7 j7Var, Context context) {
        super(context);
        this.f1761x = j7Var;
        Paint paint = new Paint(1);
        this.f1754b = paint;
        this.e = new RectF();
        this.f1757n = new RectF();
        this.f1758r = 1.0f;
        int i10 = org.telegram.ui.ActionBar.j6.f18952i6;
        d dVar = j7Var.f1053s;
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(i10, dVar));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        TextView textView = new TextView(context);
        this.f1755c = textView;
        textView.setText(LocaleController.getString(R.string.AllViewers));
        int i11 = org.telegram.ui.ActionBar.j6.f18969j5;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, dVar));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setText(LocaleController.getString(R.string.Contacts));
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, dVar));
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
        linearLayout.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        linearLayout.addView(textView, w7.x5.t(-2, -2, 0, 13, 0, 0, 0));
        linearLayout.addView(textView2, w7.x5.t(-2, -2, 0, 0, 0, 0, 0));
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.f1753a = linearLayout2;
        linearLayout2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        linearLayout2.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(26.0f), org.telegram.ui.ActionBar.j6.v0(i10, dVar)));
        linearLayout2.setOrientation(0);
        rl0 rl0Var = new rl0(getContext());
        this.v = rl0Var;
        rl0Var.f27646r = true;
        rl0Var.a(R.drawable.menu_views_reactions3, false);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageDrawable(rl0Var);
        imageView.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
        linearLayout2.addView(imageView, w7.x5.n(26, 26));
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setImageResource(R.drawable.arrow_more);
        linearLayout2.addView(imageView2, w7.x5.n(16, 26));
        addView(linearLayout, w7.x5.c(-2.0f, -2));
        addView(linearLayout2, w7.x5.d(-2, -2.0f, 5, 13.0f, 6.0f, 13.0f, 6.0f));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final y6 f1612b;

            {
                this.f1612b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        j7 j7Var2 = this.f1612b.f1761x;
                        u6 u6Var = j7Var2.O;
                        if (u6Var.f1579b) {
                            u6Var.f1579b = false;
                            j7Var2.h(true);
                            j7.b(j7Var2);
                            return;
                        }
                        return;
                    case 1:
                        j7 j7Var3 = this.f1612b.f1761x;
                        u6 u6Var2 = j7Var3.O;
                        if (!u6Var2.f1579b) {
                            u6Var2.f1579b = true;
                            j7Var3.h(true);
                            j7.b(j7Var3);
                            return;
                        }
                        return;
                    default:
                        y6 y6Var = this.f1612b;
                        j7 j7Var4 = y6Var.f1761x;
                        x6 x6Var = new x6(y6Var, y6Var.getContext(), j7Var4.f1053s);
                        j7Var4.f1050f = x6Var;
                        LinearLayout linearLayout3 = y6Var.f1753a;
                        x6Var.f29977b = true;
                        x6Var.f29976a.showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
                        return;
                }
            }
        });
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final y6 f1612b;

            {
                this.f1612b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        j7 j7Var2 = this.f1612b.f1761x;
                        u6 u6Var = j7Var2.O;
                        if (u6Var.f1579b) {
                            u6Var.f1579b = false;
                            j7Var2.h(true);
                            j7.b(j7Var2);
                            return;
                        }
                        return;
                    case 1:
                        j7 j7Var3 = this.f1612b.f1761x;
                        u6 u6Var2 = j7Var3.O;
                        if (!u6Var2.f1579b) {
                            u6Var2.f1579b = true;
                            j7Var3.h(true);
                            j7.b(j7Var3);
                            return;
                        }
                        return;
                    default:
                        y6 y6Var = this.f1612b;
                        j7 j7Var4 = y6Var.f1761x;
                        x6 x6Var = new x6(y6Var, y6Var.getContext(), j7Var4.f1053s);
                        j7Var4.f1050f = x6Var;
                        LinearLayout linearLayout3 = y6Var.f1753a;
                        x6Var.f29977b = true;
                        x6Var.f29976a.showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
                        return;
                }
            }
        });
        linearLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final y6 f1612b;

            {
                this.f1612b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        j7 j7Var2 = this.f1612b.f1761x;
                        u6 u6Var = j7Var2.O;
                        if (u6Var.f1579b) {
                            u6Var.f1579b = false;
                            j7Var2.h(true);
                            j7.b(j7Var2);
                            return;
                        }
                        return;
                    case 1:
                        j7 j7Var3 = this.f1612b.f1761x;
                        u6 u6Var2 = j7Var3.O;
                        if (!u6Var2.f1579b) {
                            u6Var2.f1579b = true;
                            j7Var3.h(true);
                            j7.b(j7Var3);
                            return;
                        }
                        return;
                    default:
                        y6 y6Var = this.f1612b;
                        j7 j7Var4 = y6Var.f1761x;
                        x6 x6Var = new x6(y6Var, y6Var.getContext(), j7Var4.f1053s);
                        j7Var4.f1050f = x6Var;
                        LinearLayout linearLayout3 = y6Var.f1753a;
                        x6Var.f29977b = true;
                        x6Var.f29976a.showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
                        return;
                }
            }
        });
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        if (this.f1761x.T) {
            int i10 = this.f1759s;
            TextView textView = this.d;
            float f10 = 0.5f;
            TextView textView2 = this.f1755c;
            if (i10 == 0) {
                textView2.getHitRect(AndroidUtilities.rectTmp2);
                f7 = 0.5f;
                f10 = 1.0f;
            } else {
                textView.getHitRect(AndroidUtilities.rectTmp2);
                f7 = 1.0f;
            }
            Rect rect = AndroidUtilities.rectTmp2;
            RectF rectF = this.f1757n;
            rectF.set(rect);
            float f11 = this.f1758r;
            if (f11 != 1.0f) {
                f10 = AndroidUtilities.lerp(this.f1756f, f10, f11);
                f7 = AndroidUtilities.lerp(this.h, f7, this.f1758r);
                AndroidUtilities.lerp(this.e, rectF, this.f1758r, rectF);
            }
            textView2.setAlpha(f10);
            textView.setAlpha(f7);
            float height = rectF.height() / 2.0f;
            canvas.drawRoundRect(rectF, height, height, this.f1754b);
        }
        super.dispatchDraw(canvas);
    }
}
