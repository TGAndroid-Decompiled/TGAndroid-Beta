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
public final class i5 extends FrameLayout {
    public final LinearLayout f5436a;
    public final Paint f5437b;
    public final TextView f5438c;
    public final TextView d;
    public final RectF e;
    public float f5439f;
    public float h;
    public final RectF f5440n;
    public float f5441r;
    public int f5442s;
    public final nm0 v;
    public ValueAnimator f5443w;
    public final t5 f5444x;

    public i5(t5 t5Var, Context context) {
        super(context);
        this.f5444x = t5Var;
        Paint paint = new Paint(1);
        this.f5437b = paint;
        this.e = new RectF();
        this.f5440n = new RectF();
        this.f5441r = 1.0f;
        int i10 = org.telegram.ui.ActionBar.h6.f21075i6;
        b bVar = t5Var.f5953s;
        paint.setColor(org.telegram.ui.ActionBar.h6.w0(i10, bVar));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        TextView textView = new TextView(context);
        this.f5438c = textView;
        textView.setText(LocaleController.getString(R.string.AllViewers));
        int i11 = org.telegram.ui.ActionBar.h6.f21092j5;
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
        this.f5436a = linearLayout2;
        linearLayout2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        linearLayout2.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(26.0f), org.telegram.ui.ActionBar.h6.w0(i10, bVar)));
        linearLayout2.setOrientation(0);
        nm0 nm0Var = new nm0(getContext());
        this.v = nm0Var;
        nm0Var.f28800r = true;
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
            public final i5 f5319b;

            {
                this.f5319b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        t5 t5Var2 = this.f5319b.f5444x;
                        e5 e5Var = t5Var2.O;
                        if (e5Var.f5287b) {
                            e5Var.f5287b = false;
                            t5Var2.h(true);
                            t5.b(t5Var2);
                            return;
                        }
                        return;
                    case 1:
                        t5 t5Var3 = this.f5319b.f5444x;
                        e5 e5Var2 = t5Var3.O;
                        if (!e5Var2.f5287b) {
                            e5Var2.f5287b = true;
                            t5Var3.h(true);
                            t5.b(t5Var3);
                            return;
                        }
                        return;
                    default:
                        i5 i5Var = this.f5319b;
                        t5 t5Var4 = i5Var.f5444x;
                        h5 h5Var = new h5(i5Var, i5Var.getContext(), t5Var4.f5953s);
                        t5Var4.f5950f = h5Var;
                        LinearLayout linearLayout3 = i5Var.f5436a;
                        h5Var.f26928b = true;
                        h5Var.f26927a.showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
                        return;
                }
            }
        });
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final i5 f5319b;

            {
                this.f5319b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        t5 t5Var2 = this.f5319b.f5444x;
                        e5 e5Var = t5Var2.O;
                        if (e5Var.f5287b) {
                            e5Var.f5287b = false;
                            t5Var2.h(true);
                            t5.b(t5Var2);
                            return;
                        }
                        return;
                    case 1:
                        t5 t5Var3 = this.f5319b.f5444x;
                        e5 e5Var2 = t5Var3.O;
                        if (!e5Var2.f5287b) {
                            e5Var2.f5287b = true;
                            t5Var3.h(true);
                            t5.b(t5Var3);
                            return;
                        }
                        return;
                    default:
                        i5 i5Var = this.f5319b;
                        t5 t5Var4 = i5Var.f5444x;
                        h5 h5Var = new h5(i5Var, i5Var.getContext(), t5Var4.f5953s);
                        t5Var4.f5950f = h5Var;
                        LinearLayout linearLayout3 = i5Var.f5436a;
                        h5Var.f26928b = true;
                        h5Var.f26927a.showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
                        return;
                }
            }
        });
        linearLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final i5 f5319b;

            {
                this.f5319b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        t5 t5Var2 = this.f5319b.f5444x;
                        e5 e5Var = t5Var2.O;
                        if (e5Var.f5287b) {
                            e5Var.f5287b = false;
                            t5Var2.h(true);
                            t5.b(t5Var2);
                            return;
                        }
                        return;
                    case 1:
                        t5 t5Var3 = this.f5319b.f5444x;
                        e5 e5Var2 = t5Var3.O;
                        if (!e5Var2.f5287b) {
                            e5Var2.f5287b = true;
                            t5Var3.h(true);
                            t5.b(t5Var3);
                            return;
                        }
                        return;
                    default:
                        i5 i5Var = this.f5319b;
                        t5 t5Var4 = i5Var.f5444x;
                        h5 h5Var = new h5(i5Var, i5Var.getContext(), t5Var4.f5953s);
                        t5Var4.f5950f = h5Var;
                        LinearLayout linearLayout3 = i5Var.f5436a;
                        h5Var.f26928b = true;
                        h5Var.f26927a.showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
                        return;
                }
            }
        });
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        if (this.f5444x.T) {
            int i10 = this.f5442s;
            TextView textView = this.d;
            float f10 = 0.5f;
            TextView textView2 = this.f5438c;
            if (i10 == 0) {
                textView2.getHitRect(AndroidUtilities.rectTmp2);
                f7 = 0.5f;
                f10 = 1.0f;
            } else {
                textView.getHitRect(AndroidUtilities.rectTmp2);
                f7 = 1.0f;
            }
            Rect rect = AndroidUtilities.rectTmp2;
            RectF rectF = this.f5440n;
            rectF.set(rect);
            float f11 = this.f5441r;
            if (f11 != 1.0f) {
                f10 = AndroidUtilities.lerp(this.f5439f, f10, f11);
                f7 = AndroidUtilities.lerp(this.h, f7, this.f5441r);
                AndroidUtilities.lerp(this.e, rectF, this.f5441r, rectF);
            }
            textView2.setAlpha(f10);
            textView.setAlpha(f7);
            float height = rectF.height() / 2.0f;
            canvas.drawRoundRect(rectF, height, height, this.f5437b);
        }
        super.dispatchDraw(canvas);
    }
}
