package jh;

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
import org.telegram.ui.Components.el0;

public final class s4 extends FrameLayout {

    public final LinearLayout f13941a;

    public final Paint f13942b;

    public final TextView f13943c;
    public final TextView d;

    public final RectF f13944e;

    public float f13945f;
    public float h;

    public final RectF f13946n;

    public float f13947r;

    public int f13948s;
    public final el0 v;

    public ValueAnimator f13949w;

    public final c5 f13950x;

    public s4(c5 c5Var, Context context) {
        super(context);
        this.f13950x = c5Var;
        Paint paint = new Paint(1);
        this.f13942b = paint;
        this.f13944e = new RectF();
        this.f13946n = new RectF();
        this.f13947r = 1.0f;
        int i10 = org.telegram.ui.ActionBar.g6.f23144i6;
        b bVar = c5Var.f13157s;
        paint.setColor(org.telegram.ui.ActionBar.g6.v0(i10, bVar));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        TextView textView = new TextView(context);
        this.f13943c = textView;
        textView.setText(LocaleController.getString(R.string.AllViewers));
        int i11 = org.telegram.ui.ActionBar.g6.f23161j5;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, bVar));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setText(LocaleController.getString(R.string.Contacts));
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, bVar));
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
        linearLayout.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        linearLayout.addView(textView, h7.z5.t(-2, -2, 0, 13, 0, 0, 0));
        linearLayout.addView(textView2, h7.z5.t(-2, -2, 0, 0, 0, 0, 0));
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.f13941a = linearLayout2;
        linearLayout2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        linearLayout2.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(26.0f), org.telegram.ui.ActionBar.g6.v0(i10, bVar)));
        linearLayout2.setOrientation(0);
        el0 el0Var = new el0(getContext());
        this.v = el0Var;
        el0Var.f28085r = true;
        el0Var.a(R.drawable.menu_views_reactions3, false);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageDrawable(el0Var);
        imageView.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
        linearLayout2.addView(imageView, h7.z5.n(26, 26));
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setImageResource(R.drawable.arrow_more);
        linearLayout2.addView(imageView2, h7.z5.n(16, 26));
        addView(linearLayout, h7.z5.c(-2.0f, -2));
        addView(linearLayout2, h7.z5.d(-2, -2.0f, 5, 13.0f, 6.0f, 13.0f, 6.0f));
        final int i12 = 0;
        textView.setOnClickListener(new View.OnClickListener(this) {

            public final s4 f13822b;

            {
                this.f13822b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        c5 c5Var2 = this.f13822b.f13950x;
                        o4 o4Var = c5Var2.K;
                        if (o4Var.f13746b) {
                            o4Var.f13746b = false;
                            c5Var2.h(true);
                            c5.b(c5Var2);
                            break;
                        }
                        break;
                    case 1:
                        c5 c5Var3 = this.f13822b.f13950x;
                        o4 o4Var2 = c5Var3.K;
                        if (!o4Var2.f13746b) {
                            o4Var2.f13746b = true;
                            c5Var3.h(true);
                            c5.b(c5Var3);
                            break;
                        }
                        break;
                    default:
                        s4 s4Var = this.f13822b;
                        c5 c5Var4 = s4Var.f13950x;
                        r4 r4Var = new r4(s4Var, s4Var.getContext(), c5Var4.f13157s);
                        c5Var4.f13154f = r4Var;
                        LinearLayout linearLayout3 = s4Var.f13941a;
                        int iDp = (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f);
                        r4Var.f30454b = true;
                        r4Var.f30453a.showAsDropDown(linearLayout3, 0, iDp);
                        break;
                }
            }
        });
        final int i13 = 1;
        textView2.setOnClickListener(new View.OnClickListener(this) {

            public final s4 f13822b;

            {
                this.f13822b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        c5 c5Var2 = this.f13822b.f13950x;
                        o4 o4Var = c5Var2.K;
                        if (o4Var.f13746b) {
                            o4Var.f13746b = false;
                            c5Var2.h(true);
                            c5.b(c5Var2);
                            break;
                        }
                        break;
                    case 1:
                        c5 c5Var3 = this.f13822b.f13950x;
                        o4 o4Var2 = c5Var3.K;
                        if (!o4Var2.f13746b) {
                            o4Var2.f13746b = true;
                            c5Var3.h(true);
                            c5.b(c5Var3);
                            break;
                        }
                        break;
                    default:
                        s4 s4Var = this.f13822b;
                        c5 c5Var4 = s4Var.f13950x;
                        r4 r4Var = new r4(s4Var, s4Var.getContext(), c5Var4.f13157s);
                        c5Var4.f13154f = r4Var;
                        LinearLayout linearLayout3 = s4Var.f13941a;
                        int iDp = (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f);
                        r4Var.f30454b = true;
                        r4Var.f30453a.showAsDropDown(linearLayout3, 0, iDp);
                        break;
                }
            }
        });
        final int i14 = 2;
        linearLayout2.setOnClickListener(new View.OnClickListener(this) {

            public final s4 f13822b;

            {
                this.f13822b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        c5 c5Var2 = this.f13822b.f13950x;
                        o4 o4Var = c5Var2.K;
                        if (o4Var.f13746b) {
                            o4Var.f13746b = false;
                            c5Var2.h(true);
                            c5.b(c5Var2);
                            break;
                        }
                        break;
                    case 1:
                        c5 c5Var3 = this.f13822b.f13950x;
                        o4 o4Var2 = c5Var3.K;
                        if (!o4Var2.f13746b) {
                            o4Var2.f13746b = true;
                            c5Var3.h(true);
                            c5.b(c5Var3);
                            break;
                        }
                        break;
                    default:
                        s4 s4Var = this.f13822b;
                        c5 c5Var4 = s4Var.f13950x;
                        r4 r4Var = new r4(s4Var, s4Var.getContext(), c5Var4.f13157s);
                        c5Var4.f13154f = r4Var;
                        LinearLayout linearLayout3 = s4Var.f13941a;
                        int iDp = (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f);
                        r4Var.f30454b = true;
                        r4Var.f30453a.showAsDropDown(linearLayout3, 0, iDp);
                        break;
                }
            }
        });
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float fLerp;
        if (this.f13950x.P) {
            int i10 = this.f13948s;
            TextView textView = this.d;
            float fLerp2 = 0.5f;
            TextView textView2 = this.f13943c;
            if (i10 == 0) {
                textView2.getHitRect(AndroidUtilities.rectTmp2);
                fLerp = 0.5f;
                fLerp2 = 1.0f;
            } else {
                textView.getHitRect(AndroidUtilities.rectTmp2);
                fLerp = 1.0f;
            }
            Rect rect = AndroidUtilities.rectTmp2;
            RectF rectF = this.f13946n;
            rectF.set(rect);
            float f10 = this.f13947r;
            if (f10 != 1.0f) {
                fLerp2 = AndroidUtilities.lerp(this.f13945f, fLerp2, f10);
                fLerp = AndroidUtilities.lerp(this.h, fLerp, this.f13947r);
                AndroidUtilities.lerp(this.f13944e, rectF, this.f13947r, rectF);
            }
            textView2.setAlpha(fLerp2);
            textView.setAlpha(fLerp);
            float fHeight = rectF.height() / 2.0f;
            canvas.drawRoundRect(rectF, fHeight, fHeight, this.f13942b);
        }
        super.dispatchDraw(canvas);
    }
}
