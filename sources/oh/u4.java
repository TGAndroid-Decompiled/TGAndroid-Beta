package oh;

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
import org.telegram.ui.Components.zl0;
public final class u4 extends FrameLayout {
    public final LinearLayout f17809a;
    public final Paint f17810b;
    public final TextView f17811c;
    public final TextView d;
    public final RectF f17812e;
    public float f17813f;
    public float h;
    public final RectF f17814n;
    public float f17815r;
    public int f17816s;
    public final zl0 v;
    public ValueAnimator f17817w;
    public final e5 f17818x;

    public u4(e5 e5Var, Context context) {
        super(context);
        this.f17818x = e5Var;
        Paint paint = new Paint(1);
        this.f17810b = paint;
        this.f17812e = new RectF();
        this.f17814n = new RectF();
        this.f17815r = 1.0f;
        int i10 = org.telegram.ui.ActionBar.k6.f21750i6;
        b bVar = e5Var.f17032s;
        paint.setColor(org.telegram.ui.ActionBar.k6.v0(i10, bVar));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        TextView textView = new TextView(context);
        this.f17811c = textView;
        textView.setText(LocaleController.getString(R.string.AllViewers));
        int i11 = org.telegram.ui.ActionBar.k6.f21766j5;
        textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(i11, bVar));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setText(LocaleController.getString(R.string.Contacts));
        textView2.setTextColor(org.telegram.ui.ActionBar.k6.v0(i11, bVar));
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
        linearLayout.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        linearLayout.addView(textView, k7.c6.t(-2, -2, 0, 13, 0, 0, 0));
        linearLayout.addView(textView2, k7.c6.t(-2, -2, 0, 0, 0, 0, 0));
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.f17809a = linearLayout2;
        linearLayout2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        linearLayout2.setBackground(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(26.0f), org.telegram.ui.ActionBar.k6.v0(i10, bVar)));
        linearLayout2.setOrientation(0);
        zl0 zl0Var = new zl0(getContext());
        this.v = zl0Var;
        zl0Var.f33917r = true;
        zl0Var.a(R.drawable.menu_views_reactions3, false);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageDrawable(zl0Var);
        imageView.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
        linearLayout2.addView(imageView, k7.c6.n(26, 26));
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setImageResource(R.drawable.arrow_more);
        linearLayout2.addView(imageView2, k7.c6.n(16, 26));
        addView(linearLayout, k7.c6.c(-2.0f, -2));
        addView(linearLayout2, k7.c6.d(-2, -2.0f, 5, 13.0f, 6.0f, 13.0f, 6.0f));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final u4 f17686b;

            {
                this.f17686b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        e5 e5Var2 = this.f17686b.f17818x;
                        q4 q4Var = e5Var2.L;
                        if (q4Var.f17656b) {
                            q4Var.f17656b = false;
                            e5Var2.h(true);
                            e5.b(e5Var2);
                            return;
                        }
                        return;
                    case 1:
                        e5 e5Var3 = this.f17686b.f17818x;
                        q4 q4Var2 = e5Var3.L;
                        if (!q4Var2.f17656b) {
                            q4Var2.f17656b = true;
                            e5Var3.h(true);
                            e5.b(e5Var3);
                            return;
                        }
                        return;
                    default:
                        u4 u4Var = this.f17686b;
                        e5 e5Var4 = u4Var.f17818x;
                        t4 t4Var = new t4(u4Var, u4Var.getContext(), e5Var4.f17032s);
                        e5Var4.f17029f = t4Var;
                        LinearLayout linearLayout3 = u4Var.f17809a;
                        t4Var.f33167b = true;
                        t4Var.f33166a.showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
                        return;
                }
            }
        });
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final u4 f17686b;

            {
                this.f17686b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        e5 e5Var2 = this.f17686b.f17818x;
                        q4 q4Var = e5Var2.L;
                        if (q4Var.f17656b) {
                            q4Var.f17656b = false;
                            e5Var2.h(true);
                            e5.b(e5Var2);
                            return;
                        }
                        return;
                    case 1:
                        e5 e5Var3 = this.f17686b.f17818x;
                        q4 q4Var2 = e5Var3.L;
                        if (!q4Var2.f17656b) {
                            q4Var2.f17656b = true;
                            e5Var3.h(true);
                            e5.b(e5Var3);
                            return;
                        }
                        return;
                    default:
                        u4 u4Var = this.f17686b;
                        e5 e5Var4 = u4Var.f17818x;
                        t4 t4Var = new t4(u4Var, u4Var.getContext(), e5Var4.f17032s);
                        e5Var4.f17029f = t4Var;
                        LinearLayout linearLayout3 = u4Var.f17809a;
                        t4Var.f33167b = true;
                        t4Var.f33166a.showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
                        return;
                }
            }
        });
        linearLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final u4 f17686b;

            {
                this.f17686b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        e5 e5Var2 = this.f17686b.f17818x;
                        q4 q4Var = e5Var2.L;
                        if (q4Var.f17656b) {
                            q4Var.f17656b = false;
                            e5Var2.h(true);
                            e5.b(e5Var2);
                            return;
                        }
                        return;
                    case 1:
                        e5 e5Var3 = this.f17686b.f17818x;
                        q4 q4Var2 = e5Var3.L;
                        if (!q4Var2.f17656b) {
                            q4Var2.f17656b = true;
                            e5Var3.h(true);
                            e5.b(e5Var3);
                            return;
                        }
                        return;
                    default:
                        u4 u4Var = this.f17686b;
                        e5 e5Var4 = u4Var.f17818x;
                        t4 t4Var = new t4(u4Var, u4Var.getContext(), e5Var4.f17032s);
                        e5Var4.f17029f = t4Var;
                        LinearLayout linearLayout3 = u4Var.f17809a;
                        t4Var.f33167b = true;
                        t4Var.f33166a.showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
                        return;
                }
            }
        });
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        if (this.f17818x.Q) {
            int i10 = this.f17816s;
            TextView textView = this.d;
            float f11 = 0.5f;
            TextView textView2 = this.f17811c;
            if (i10 == 0) {
                textView2.getHitRect(AndroidUtilities.rectTmp2);
                f10 = 0.5f;
                f11 = 1.0f;
            } else {
                textView.getHitRect(AndroidUtilities.rectTmp2);
                f10 = 1.0f;
            }
            Rect rect = AndroidUtilities.rectTmp2;
            RectF rectF = this.f17814n;
            rectF.set(rect);
            float f12 = this.f17815r;
            if (f12 != 1.0f) {
                f11 = AndroidUtilities.lerp(this.f17813f, f11, f12);
                f10 = AndroidUtilities.lerp(this.h, f10, this.f17815r);
                AndroidUtilities.lerp(this.f17812e, rectF, this.f17815r, rectF);
            }
            textView2.setAlpha(f11);
            textView.setAlpha(f10);
            float height = rectF.height() / 2.0f;
            canvas.drawRoundRect(rectF, height, height, this.f17810b);
        }
        super.dispatchDraw(canvas);
    }
}
