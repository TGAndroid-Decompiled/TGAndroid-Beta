package ci;

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
import org.telegram.ui.Components.rm0;
public final class i5 extends FrameLayout {
    public final LinearLayout f5440a;
    public final Paint f5441b;
    public final TextView f5442c;
    public final TextView d;
    public final RectF e;
    public float f5443f;
    public float h;
    public final RectF f5444n;
    public float f5445r;
    public int f5446s;
    public final rm0 v;
    public ValueAnimator f5447w;
    public final t5 f5448x;

    public i5(t5 t5Var, Context context) {
        super(context);
        this.f5448x = t5Var;
        Paint paint = new Paint(1);
        this.f5441b = paint;
        this.e = new RectF();
        this.f5444n = new RectF();
        this.f5445r = 1.0f;
        int i10 = org.telegram.ui.ActionBar.k6.f21272i6;
        b bVar = t5Var.f5959s;
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(i10, bVar));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        TextView textView = new TextView(context);
        this.f5442c = textView;
        textView.setText(LocaleController.getString(R.string.AllViewers));
        int i11 = org.telegram.ui.ActionBar.k6.f21289j5;
        org.telegram.ui.ActionBar.r6.W(textView, i11, bVar);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setText(LocaleController.getString(R.string.Contacts));
        org.telegram.ui.ActionBar.r6.W(textView2, i11, bVar);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
        linearLayout.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        linearLayout.addView(textView, w7.z5.t(-2, -2, 0, 13, 0, 0, 0));
        linearLayout.addView(textView2, w7.z5.t(-2, -2, 0, 0, 0, 0, 0));
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.f5440a = linearLayout2;
        linearLayout2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        ShapeDrawable c02 = org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(26.0f), org.telegram.ui.ActionBar.k6.w0(i10, bVar));
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i10);
        linearLayout2.setBackground(c02);
        org.telegram.ui.ActionBar.r6.k(linearLayout2, c02, O, null, bVar);
        linearLayout2.setOrientation(0);
        rm0 rm0Var = new rm0(getContext());
        this.v = rm0Var;
        rm0Var.f30231r = true;
        rm0Var.a(R.drawable.menu_views_reactions3, false);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageDrawable(rm0Var);
        imageView.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
        linearLayout2.addView(imageView, w7.z5.n(26, 26));
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setImageResource(R.drawable.arrow_more);
        linearLayout2.addView(imageView2, w7.z5.n(16, 26));
        addView(linearLayout, w7.z5.c(-2.0f, -2));
        addView(linearLayout2, w7.z5.d(-2, -2.0f, 5, 13.0f, 6.0f, 13.0f, 6.0f));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final i5 f5321b;

            {
                this.f5321b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        t5 t5Var2 = this.f5321b.f5448x;
                        e5 e5Var = t5Var2.O;
                        if (e5Var.f5289b) {
                            e5Var.f5289b = false;
                            t5Var2.h(true);
                            t5.b(t5Var2);
                            return;
                        }
                        return;
                    case 1:
                        t5 t5Var3 = this.f5321b.f5448x;
                        e5 e5Var2 = t5Var3.O;
                        if (!e5Var2.f5289b) {
                            e5Var2.f5289b = true;
                            t5Var3.h(true);
                            t5.b(t5Var3);
                            return;
                        }
                        return;
                    default:
                        i5 i5Var = this.f5321b;
                        t5 t5Var4 = i5Var.f5448x;
                        h5 h5Var = new h5(i5Var, i5Var.getContext(), t5Var4.f5959s);
                        t5Var4.f5956f = h5Var;
                        LinearLayout linearLayout3 = i5Var.f5440a;
                        h5Var.f27043b = true;
                        h5Var.f27042a.showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
                        return;
                }
            }
        });
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final i5 f5321b;

            {
                this.f5321b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        t5 t5Var2 = this.f5321b.f5448x;
                        e5 e5Var = t5Var2.O;
                        if (e5Var.f5289b) {
                            e5Var.f5289b = false;
                            t5Var2.h(true);
                            t5.b(t5Var2);
                            return;
                        }
                        return;
                    case 1:
                        t5 t5Var3 = this.f5321b.f5448x;
                        e5 e5Var2 = t5Var3.O;
                        if (!e5Var2.f5289b) {
                            e5Var2.f5289b = true;
                            t5Var3.h(true);
                            t5.b(t5Var3);
                            return;
                        }
                        return;
                    default:
                        i5 i5Var = this.f5321b;
                        t5 t5Var4 = i5Var.f5448x;
                        h5 h5Var = new h5(i5Var, i5Var.getContext(), t5Var4.f5959s);
                        t5Var4.f5956f = h5Var;
                        LinearLayout linearLayout3 = i5Var.f5440a;
                        h5Var.f27043b = true;
                        h5Var.f27042a.showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
                        return;
                }
            }
        });
        linearLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final i5 f5321b;

            {
                this.f5321b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        t5 t5Var2 = this.f5321b.f5448x;
                        e5 e5Var = t5Var2.O;
                        if (e5Var.f5289b) {
                            e5Var.f5289b = false;
                            t5Var2.h(true);
                            t5.b(t5Var2);
                            return;
                        }
                        return;
                    case 1:
                        t5 t5Var3 = this.f5321b.f5448x;
                        e5 e5Var2 = t5Var3.O;
                        if (!e5Var2.f5289b) {
                            e5Var2.f5289b = true;
                            t5Var3.h(true);
                            t5.b(t5Var3);
                            return;
                        }
                        return;
                    default:
                        i5 i5Var = this.f5321b;
                        t5 t5Var4 = i5Var.f5448x;
                        h5 h5Var = new h5(i5Var, i5Var.getContext(), t5Var4.f5959s);
                        t5Var4.f5956f = h5Var;
                        LinearLayout linearLayout3 = i5Var.f5440a;
                        h5Var.f27043b = true;
                        h5Var.f27042a.showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
                        return;
                }
            }
        });
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        if (this.f5448x.T) {
            int i10 = this.f5446s;
            TextView textView = this.d;
            float f10 = 0.5f;
            TextView textView2 = this.f5442c;
            if (i10 == 0) {
                textView2.getHitRect(AndroidUtilities.rectTmp2);
                f7 = 0.5f;
                f10 = 1.0f;
            } else {
                textView.getHitRect(AndroidUtilities.rectTmp2);
                f7 = 1.0f;
            }
            Rect rect = AndroidUtilities.rectTmp2;
            RectF rectF = this.f5444n;
            rectF.set(rect);
            float f11 = this.f5445r;
            if (f11 != 1.0f) {
                f10 = AndroidUtilities.lerp(this.f5443f, f10, f11);
                f7 = AndroidUtilities.lerp(this.h, f7, this.f5445r);
                AndroidUtilities.lerp(this.e, rectF, this.f5445r, rectF);
            }
            textView2.setAlpha(f10);
            textView.setAlpha(f7);
            float height = rectF.height() / 2.0f;
            canvas.drawRoundRect(rectF, height, height, this.f5441b);
        }
        super.dispatchDraw(canvas);
    }
}
