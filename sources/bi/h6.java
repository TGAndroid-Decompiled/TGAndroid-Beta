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
import org.telegram.ui.Components.ql0;
public final class h6 extends FrameLayout {
    public final LinearLayout f3055a;
    public final Paint f3056b;
    public final TextView f3057c;
    public final TextView d;
    public final RectF f3058e;
    public float f3059f;
    public float h;
    public final RectF f3060n;
    public float f3061r;
    public int f3062s;
    public final ql0 v;
    public ValueAnimator f3063w;
    public final s6 f3064x;

    public h6(s6 s6Var, Context context) {
        super(context);
        this.f3064x = s6Var;
        Paint paint = new Paint(1);
        this.f3056b = paint;
        this.f3058e = new RectF();
        this.f3060n = new RectF();
        this.f3061r = 1.0f;
        int i10 = org.telegram.ui.ActionBar.j6.f20753i6;
        b bVar = s6Var.f3697s;
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(i10, bVar));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        TextView textView = new TextView(context);
        this.f3057c = textView;
        textView.setText(LocaleController.getString(R.string.AllViewers));
        int i11 = org.telegram.ui.ActionBar.j6.f20770j5;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, bVar));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setText(LocaleController.getString(R.string.Contacts));
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, bVar));
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
        linearLayout.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        linearLayout.addView(textView, w7.x5.t(-2, -2, 0, 13, 0, 0, 0));
        linearLayout.addView(textView2, w7.x5.t(-2, -2, 0, 0, 0, 0, 0));
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.f3055a = linearLayout2;
        linearLayout2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        linearLayout2.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(26.0f), org.telegram.ui.ActionBar.j6.v0(i10, bVar)));
        linearLayout2.setOrientation(0);
        ql0 ql0Var = new ql0(getContext());
        this.v = ql0Var;
        ql0Var.f29767r = true;
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
            public final h6 f2913b;

            {
                this.f2913b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        s6 s6Var2 = this.f2913b.f3064x;
                        d6 d6Var = s6Var2.O;
                        if (d6Var.f2864b) {
                            d6Var.f2864b = false;
                            s6Var2.h(true);
                            s6.b(s6Var2);
                            return;
                        }
                        return;
                    case 1:
                        s6 s6Var3 = this.f2913b.f3064x;
                        d6 d6Var2 = s6Var3.O;
                        if (!d6Var2.f2864b) {
                            d6Var2.f2864b = true;
                            s6Var3.h(true);
                            s6.b(s6Var3);
                            return;
                        }
                        return;
                    default:
                        h6 h6Var = this.f2913b;
                        s6 s6Var4 = h6Var.f3064x;
                        g6 g6Var = new g6(h6Var, h6Var.getContext(), s6Var4.f3697s);
                        s6Var4.f3694f = g6Var;
                        LinearLayout linearLayout3 = h6Var.f3055a;
                        g6Var.f32323b = true;
                        g6Var.f32322a.showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
                        return;
                }
            }
        });
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final h6 f2913b;

            {
                this.f2913b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        s6 s6Var2 = this.f2913b.f3064x;
                        d6 d6Var = s6Var2.O;
                        if (d6Var.f2864b) {
                            d6Var.f2864b = false;
                            s6Var2.h(true);
                            s6.b(s6Var2);
                            return;
                        }
                        return;
                    case 1:
                        s6 s6Var3 = this.f2913b.f3064x;
                        d6 d6Var2 = s6Var3.O;
                        if (!d6Var2.f2864b) {
                            d6Var2.f2864b = true;
                            s6Var3.h(true);
                            s6.b(s6Var3);
                            return;
                        }
                        return;
                    default:
                        h6 h6Var = this.f2913b;
                        s6 s6Var4 = h6Var.f3064x;
                        g6 g6Var = new g6(h6Var, h6Var.getContext(), s6Var4.f3697s);
                        s6Var4.f3694f = g6Var;
                        LinearLayout linearLayout3 = h6Var.f3055a;
                        g6Var.f32323b = true;
                        g6Var.f32322a.showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
                        return;
                }
            }
        });
        linearLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final h6 f2913b;

            {
                this.f2913b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        s6 s6Var2 = this.f2913b.f3064x;
                        d6 d6Var = s6Var2.O;
                        if (d6Var.f2864b) {
                            d6Var.f2864b = false;
                            s6Var2.h(true);
                            s6.b(s6Var2);
                            return;
                        }
                        return;
                    case 1:
                        s6 s6Var3 = this.f2913b.f3064x;
                        d6 d6Var2 = s6Var3.O;
                        if (!d6Var2.f2864b) {
                            d6Var2.f2864b = true;
                            s6Var3.h(true);
                            s6.b(s6Var3);
                            return;
                        }
                        return;
                    default:
                        h6 h6Var = this.f2913b;
                        s6 s6Var4 = h6Var.f3064x;
                        g6 g6Var = new g6(h6Var, h6Var.getContext(), s6Var4.f3697s);
                        s6Var4.f3694f = g6Var;
                        LinearLayout linearLayout3 = h6Var.f3055a;
                        g6Var.f32323b = true;
                        g6Var.f32322a.showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
                        return;
                }
            }
        });
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        if (this.f3064x.T) {
            int i10 = this.f3062s;
            TextView textView = this.d;
            float f10 = 0.5f;
            TextView textView2 = this.f3057c;
            if (i10 == 0) {
                textView2.getHitRect(AndroidUtilities.rectTmp2);
                f7 = 0.5f;
                f10 = 1.0f;
            } else {
                textView.getHitRect(AndroidUtilities.rectTmp2);
                f7 = 1.0f;
            }
            Rect rect = AndroidUtilities.rectTmp2;
            RectF rectF = this.f3060n;
            rectF.set(rect);
            float f11 = this.f3061r;
            if (f11 != 1.0f) {
                f10 = AndroidUtilities.lerp(this.f3059f, f10, f11);
                f7 = AndroidUtilities.lerp(this.h, f7, this.f3061r);
                AndroidUtilities.lerp(this.f3058e, rectF, this.f3061r, rectF);
            }
            textView2.setAlpha(f10);
            textView.setAlpha(f7);
            float height = rectF.height() / 2.0f;
            canvas.drawRoundRect(rectF, height, height, this.f3056b);
        }
        super.dispatchDraw(canvas);
    }
}
