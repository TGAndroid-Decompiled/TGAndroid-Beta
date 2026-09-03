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
import org.telegram.ui.Components.yl0;
public final class u4 extends FrameLayout {
    public final LinearLayout f17811a;
    public final Paint f17812b;
    public final TextView f17813c;
    public final TextView d;
    public final RectF f17814e;
    public float f17815f;
    public float h;
    public final RectF f17816n;
    public float f17817r;
    public int f17818s;
    public final yl0 v;
    public ValueAnimator f17819w;
    public final e5 f17820x;

    public u4(e5 e5Var, Context context) {
        super(context);
        this.f17820x = e5Var;
        Paint paint = new Paint(1);
        this.f17812b = paint;
        this.f17814e = new RectF();
        this.f17816n = new RectF();
        this.f17817r = 1.0f;
        int i10 = org.telegram.ui.ActionBar.k6.f21752i6;
        b bVar = e5Var.f17034s;
        paint.setColor(org.telegram.ui.ActionBar.k6.v0(i10, bVar));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        TextView textView = new TextView(context);
        this.f17813c = textView;
        textView.setText(LocaleController.getString(R.string.AllViewers));
        int i11 = org.telegram.ui.ActionBar.k6.f21768j5;
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
        this.f17811a = linearLayout2;
        linearLayout2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        linearLayout2.setBackground(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(26.0f), org.telegram.ui.ActionBar.k6.v0(i10, bVar)));
        linearLayout2.setOrientation(0);
        yl0 yl0Var = new yl0(getContext());
        this.v = yl0Var;
        yl0Var.f33561r = true;
        yl0Var.a(R.drawable.menu_views_reactions3, false);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageDrawable(yl0Var);
        imageView.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
        linearLayout2.addView(imageView, k7.c6.n(26, 26));
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setImageResource(R.drawable.arrow_more);
        linearLayout2.addView(imageView2, k7.c6.n(16, 26));
        addView(linearLayout, k7.c6.c(-2.0f, -2));
        addView(linearLayout2, k7.c6.d(-2, -2.0f, 5, 13.0f, 6.0f, 13.0f, 6.0f));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final u4 f17688b;

            {
                this.f17688b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        e5 e5Var2 = this.f17688b.f17820x;
                        q4 q4Var = e5Var2.L;
                        if (q4Var.f17658b) {
                            q4Var.f17658b = false;
                            e5Var2.h(true);
                            e5.b(e5Var2);
                            return;
                        }
                        return;
                    case 1:
                        e5 e5Var3 = this.f17688b.f17820x;
                        q4 q4Var2 = e5Var3.L;
                        if (!q4Var2.f17658b) {
                            q4Var2.f17658b = true;
                            e5Var3.h(true);
                            e5.b(e5Var3);
                            return;
                        }
                        return;
                    default:
                        u4 u4Var = this.f17688b;
                        e5 e5Var4 = u4Var.f17820x;
                        t4 t4Var = new t4(u4Var, u4Var.getContext(), e5Var4.f17034s);
                        e5Var4.f17031f = t4Var;
                        LinearLayout linearLayout3 = u4Var.f17811a;
                        t4Var.f33164b = true;
                        t4Var.f33163a.showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
                        return;
                }
            }
        });
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final u4 f17688b;

            {
                this.f17688b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        e5 e5Var2 = this.f17688b.f17820x;
                        q4 q4Var = e5Var2.L;
                        if (q4Var.f17658b) {
                            q4Var.f17658b = false;
                            e5Var2.h(true);
                            e5.b(e5Var2);
                            return;
                        }
                        return;
                    case 1:
                        e5 e5Var3 = this.f17688b.f17820x;
                        q4 q4Var2 = e5Var3.L;
                        if (!q4Var2.f17658b) {
                            q4Var2.f17658b = true;
                            e5Var3.h(true);
                            e5.b(e5Var3);
                            return;
                        }
                        return;
                    default:
                        u4 u4Var = this.f17688b;
                        e5 e5Var4 = u4Var.f17820x;
                        t4 t4Var = new t4(u4Var, u4Var.getContext(), e5Var4.f17034s);
                        e5Var4.f17031f = t4Var;
                        LinearLayout linearLayout3 = u4Var.f17811a;
                        t4Var.f33164b = true;
                        t4Var.f33163a.showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
                        return;
                }
            }
        });
        linearLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final u4 f17688b;

            {
                this.f17688b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        e5 e5Var2 = this.f17688b.f17820x;
                        q4 q4Var = e5Var2.L;
                        if (q4Var.f17658b) {
                            q4Var.f17658b = false;
                            e5Var2.h(true);
                            e5.b(e5Var2);
                            return;
                        }
                        return;
                    case 1:
                        e5 e5Var3 = this.f17688b.f17820x;
                        q4 q4Var2 = e5Var3.L;
                        if (!q4Var2.f17658b) {
                            q4Var2.f17658b = true;
                            e5Var3.h(true);
                            e5.b(e5Var3);
                            return;
                        }
                        return;
                    default:
                        u4 u4Var = this.f17688b;
                        e5 e5Var4 = u4Var.f17820x;
                        t4 t4Var = new t4(u4Var, u4Var.getContext(), e5Var4.f17034s);
                        e5Var4.f17031f = t4Var;
                        LinearLayout linearLayout3 = u4Var.f17811a;
                        t4Var.f33164b = true;
                        t4Var.f33163a.showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
                        return;
                }
            }
        });
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        if (this.f17820x.Q) {
            int i10 = this.f17818s;
            TextView textView = this.d;
            float f11 = 0.5f;
            TextView textView2 = this.f17813c;
            if (i10 == 0) {
                textView2.getHitRect(AndroidUtilities.rectTmp2);
                f10 = 0.5f;
                f11 = 1.0f;
            } else {
                textView.getHitRect(AndroidUtilities.rectTmp2);
                f10 = 1.0f;
            }
            Rect rect = AndroidUtilities.rectTmp2;
            RectF rectF = this.f17816n;
            rectF.set(rect);
            float f12 = this.f17817r;
            if (f12 != 1.0f) {
                f11 = AndroidUtilities.lerp(this.f17815f, f11, f12);
                f10 = AndroidUtilities.lerp(this.h, f10, this.f17817r);
                AndroidUtilities.lerp(this.f17814e, rectF, this.f17817r, rectF);
            }
            textView2.setAlpha(f11);
            textView.setAlpha(f10);
            float height = rectF.height() / 2.0f;
            canvas.drawRoundRect(rectF, height, height, this.f17812b);
        }
        super.dispatchDraw(canvas);
    }
}
