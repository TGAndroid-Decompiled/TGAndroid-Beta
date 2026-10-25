package di;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.um0;
public final class i5 extends FrameLayout {
    public final LinearLayout f8672a;
    public final Paint f8673b;
    public final TextView f8674c;
    public final TextView d;
    public final RectF e;
    public float f8675f;
    public float h;
    public final RectF f8676n;
    public float f8677r;
    public int f8678s;
    public final um0 v;
    public ValueAnimator f8679w;
    public final t5 f8680x;

    public i5(t5 t5Var, Context context) {
        super(context);
        this.f8680x = t5Var;
        Paint paint = new Paint(1);
        this.f8673b = paint;
        this.e = new RectF();
        this.f8676n = new RectF();
        this.f8677r = 1.0f;
        int i10 = org.telegram.ui.ActionBar.y6.f23446i6;
        b bVar = t5Var.f9197s;
        paint.setColor(org.telegram.ui.ActionBar.y6.w0(i10, bVar));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        TextView textView = new TextView(context);
        this.f8674c = textView;
        textView.setText(LocaleController.getString(R.string.AllViewers));
        int i11 = org.telegram.ui.ActionBar.y6.f23462j5;
        org.telegram.ui.ActionBar.f7.V(textView, i11, bVar);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setText(LocaleController.getString(R.string.Contacts));
        org.telegram.ui.ActionBar.f7.V(textView2, i11, bVar);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
        linearLayout.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        linearLayout.addView(textView, gb1.x(-2, -2, 0, 13, 0, 0, 0));
        linearLayout.addView(textView2, gb1.x(-2, -2, 0, 0, 0, 0, 0));
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.f8672a = linearLayout2;
        linearLayout2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(26.0f), org.telegram.ui.ActionBar.y6.w0(i10, bVar));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i10);
        linearLayout2.setBackground(c02);
        org.telegram.ui.ActionBar.f7.k(linearLayout2, c02, N, null, bVar);
        linearLayout2.setOrientation(0);
        um0 um0Var = new um0(getContext());
        this.v = um0Var;
        um0Var.f33444r = true;
        um0Var.a(R.drawable.menu_views_reactions3, false);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageDrawable(um0Var);
        imageView.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
        linearLayout2.addView(imageView, gb1.r(26, 26));
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setImageResource(R.drawable.arrow_more);
        linearLayout2.addView(imageView2, gb1.r(16, 26));
        addView(linearLayout, gb1.g(-2.0f, -2));
        addView(linearLayout2, gb1.h(-2, -2.0f, 5, 13.0f, 6.0f, 13.0f, 6.0f));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final i5 f8557b;

            {
                this.f8557b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        t5 t5Var2 = this.f8557b.f8680x;
                        e5 e5Var = t5Var2.O;
                        if (e5Var.f8520b) {
                            e5Var.f8520b = false;
                            t5Var2.h(true);
                            t5.b(t5Var2);
                            return;
                        }
                        return;
                    case 1:
                        t5 t5Var3 = this.f8557b.f8680x;
                        e5 e5Var2 = t5Var3.O;
                        if (!e5Var2.f8520b) {
                            e5Var2.f8520b = true;
                            t5Var3.h(true);
                            t5.b(t5Var3);
                            return;
                        }
                        return;
                    default:
                        i5 i5Var = this.f8557b;
                        t5 t5Var4 = i5Var.f8680x;
                        h5 h5Var = new h5(i5Var, i5Var.getContext(), t5Var4.f9197s);
                        t5Var4.f9194f = h5Var;
                        LinearLayout linearLayout3 = i5Var.f8672a;
                        h5Var.f29711b = true;
                        h5Var.f29710a.showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
                        return;
                }
            }
        });
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final i5 f8557b;

            {
                this.f8557b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        t5 t5Var2 = this.f8557b.f8680x;
                        e5 e5Var = t5Var2.O;
                        if (e5Var.f8520b) {
                            e5Var.f8520b = false;
                            t5Var2.h(true);
                            t5.b(t5Var2);
                            return;
                        }
                        return;
                    case 1:
                        t5 t5Var3 = this.f8557b.f8680x;
                        e5 e5Var2 = t5Var3.O;
                        if (!e5Var2.f8520b) {
                            e5Var2.f8520b = true;
                            t5Var3.h(true);
                            t5.b(t5Var3);
                            return;
                        }
                        return;
                    default:
                        i5 i5Var = this.f8557b;
                        t5 t5Var4 = i5Var.f8680x;
                        h5 h5Var = new h5(i5Var, i5Var.getContext(), t5Var4.f9197s);
                        t5Var4.f9194f = h5Var;
                        LinearLayout linearLayout3 = i5Var.f8672a;
                        h5Var.f29711b = true;
                        h5Var.f29710a.showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
                        return;
                }
            }
        });
        linearLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final i5 f8557b;

            {
                this.f8557b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        t5 t5Var2 = this.f8557b.f8680x;
                        e5 e5Var = t5Var2.O;
                        if (e5Var.f8520b) {
                            e5Var.f8520b = false;
                            t5Var2.h(true);
                            t5.b(t5Var2);
                            return;
                        }
                        return;
                    case 1:
                        t5 t5Var3 = this.f8557b.f8680x;
                        e5 e5Var2 = t5Var3.O;
                        if (!e5Var2.f8520b) {
                            e5Var2.f8520b = true;
                            t5Var3.h(true);
                            t5.b(t5Var3);
                            return;
                        }
                        return;
                    default:
                        i5 i5Var = this.f8557b;
                        t5 t5Var4 = i5Var.f8680x;
                        h5 h5Var = new h5(i5Var, i5Var.getContext(), t5Var4.f9197s);
                        t5Var4.f9194f = h5Var;
                        LinearLayout linearLayout3 = i5Var.f8672a;
                        h5Var.f29711b = true;
                        h5Var.f29710a.showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
                        return;
                }
            }
        });
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        if (this.f8680x.T) {
            int i10 = this.f8678s;
            TextView textView = this.d;
            float f10 = 0.5f;
            TextView textView2 = this.f8674c;
            if (i10 == 0) {
                textView2.getHitRect(AndroidUtilities.rectTmp2);
                f7 = 0.5f;
                f10 = 1.0f;
            } else {
                textView.getHitRect(AndroidUtilities.rectTmp2);
                f7 = 1.0f;
            }
            Rect rect = AndroidUtilities.rectTmp2;
            RectF rectF = this.f8676n;
            rectF.set(rect);
            float f11 = this.f8677r;
            if (f11 != 1.0f) {
                f10 = AndroidUtilities.lerp(this.f8675f, f10, f11);
                f7 = AndroidUtilities.lerp(this.h, f7, this.f8677r);
                AndroidUtilities.lerp(this.e, rectF, this.f8677r, rectF);
            }
            textView2.setAlpha(f10);
            textView.setAlpha(f7);
            float height = rectF.height() / 2.0f;
            canvas.drawRoundRect(rectF, height, height, this.f8673b);
        }
        super.dispatchDraw(canvas);
    }
}
