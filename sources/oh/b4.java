package oh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.yh;
public final class b4 extends FrameLayout {
    public final a4 f16888a;
    public final jg.c f16889b;
    public final TextView[] f16890c;
    public lj0 d;
    public final d4 f16891e;
    public Paint f16892f;
    public float h;
    public boolean f16893n;
    public boolean f16894r;
    public ValueAnimator f16895s;

    public b4(Context context, d4 d4Var) {
        super(context);
        this.f16890c = new TextView[2];
        this.f16891e = d4Var;
        a4 a4Var = new a4(this, context, 0);
        this.f16888a = a4Var;
        a4Var.setRoundRadius(AndroidUtilities.dp(16.0f));
        addView(a4Var, k7.c6.d(32, 32.0f, 0, 12.0f, 2.0f, 0.0f, 0.0f));
        setClipChildren(false);
        jg.c cVar = new jg.c(context, 1);
        this.f16889b = cVar;
        cVar.setTextSize(14);
        cVar.setTypeface(AndroidUtilities.bold());
        cVar.setMaxLines(1);
        cVar.setEllipsizeByGradient(AndroidUtilities.dp(4.0f));
        cVar.setPivotX(0.0f);
        NotificationCenter.listenEmojiLoading(cVar);
        addView(cVar, k7.c6.d(-2, -2.0f, 0, 54.0f, 0.0f, 86.0f, 0.0f));
        for (int i10 = 0; i10 < 2; i10++) {
            this.f16890c[i10] = new TextView(context);
            this.f16890c[i10].setTextSize(1, 12.0f);
            this.f16890c[i10].setMaxLines(1);
            this.f16890c[i10].setSingleLine(true);
            this.f16890c[i10].setEllipsize(TextUtils.TruncateAt.MIDDLE);
            this.f16890c[i10].setTextColor(-1);
            this.f16890c[i10].setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(1.0f));
            addView(this.f16890c[i10], k7.c6.d(-2, -2.0f, 0, 51.0f, 18.0f, 83.0f, 0.0f));
        }
        this.f16889b.setTextColor(-1);
    }

    public final void b(float f10, Canvas canvas, RectF rectF, boolean z4) {
        float f11;
        boolean z10;
        boolean z11;
        float clamp;
        s6 s6Var;
        d4 d4Var = this.f16891e;
        if ((d4Var != null && d4Var.f16964b != null) || this.h != 0.0f) {
            if (d4Var != null && (s6Var = d4Var.f16964b) != null && !s6Var.F) {
                this.h = 1.0f;
                f11 = s6Var.h;
                if (!this.f16893n) {
                    this.f16893n = true;
                }
                z10 = false;
            } else {
                if (this.f16893n) {
                    this.f16893n = false;
                    if (this.d.f28780f < 0.2f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.f16894r = z11;
                }
                if (!this.f16894r) {
                    this.h = Utilities.clamp(this.h - ((1000.0f / AndroidUtilities.screenRefreshRate) / 300.0f), 1.0f, 0.0f);
                }
                f11 = 1.0f;
                z10 = true;
            }
            lj0 lj0Var = this.d;
            a4 a4Var = this.f16888a;
            if (lj0Var == null) {
                lj0 lj0Var2 = new lj0(a4Var);
                this.d = lj0Var2;
                lj0Var2.d(null, true, false);
            }
            this.d.f28790q = 0;
            ImageReceiver imageReceiver = a4Var.getImageReceiver();
            float c3 = yh.c(1.0f, this.h, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(3.0f));
            this.d.f((int) (rectF.left - c3), (int) (rectF.top - c3), (int) (rectF.right + c3), (int) (rectF.bottom + c3));
            lj0 lj0Var3 = this.d;
            if (z10) {
                clamp = 1.0f;
            } else {
                clamp = Utilities.clamp(f11, 1.0f, 0.0f);
            }
            lj0Var3.e(clamp, true);
            if (this.f16894r && z10 && this.d.f28780f >= 0.9f) {
                this.h = Utilities.clamp(this.h - ((1000.0f / AndroidUtilities.screenRefreshRate) / 300.0f), 1.0f, 0.0f);
            }
            if (z4) {
                if (f10 != 1.0f) {
                    Paint t6 = m7.t(imageReceiver, false);
                    t6.setAlpha((int) (this.h * 255.0f));
                    lj0 lj0Var4 = this.d;
                    lj0Var4.f28793t = t6;
                    lj0Var4.a(canvas);
                }
                if (this.f16892f == null) {
                    Paint paint = new Paint(1);
                    this.f16892f = paint;
                    paint.setColor(-1);
                    this.f16892f.setStrokeWidth(AndroidUtilities.dp(2.0f));
                    this.f16892f.setStyle(Paint.Style.STROKE);
                    this.f16892f.setStrokeCap(Paint.Cap.ROUND);
                }
                this.f16892f.setAlpha((int) (255.0f * f10 * this.h));
                lj0 lj0Var5 = this.d;
                lj0Var5.f28793t = this.f16892f;
                lj0Var5.a(canvas);
            }
        }
    }

    public final void c(CharSequence charSequence, boolean z4) {
        ValueAnimator valueAnimator = this.f16895s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f16895s = null;
        }
        TextView[] textViewArr = this.f16890c;
        if (z4) {
            textViewArr[1].setOnClickListener(null);
            textViewArr[1].setText(textViewArr[0].getText());
            textViewArr[1].setVisibility(0);
            textViewArr[1].setAlpha(1.0f);
            textViewArr[1].setTranslationY(0.0f);
            textViewArr[0].setText(charSequence);
            textViewArr[0].setVisibility(0);
            textViewArr[0].setAlpha(0.0f);
            textViewArr[0].setTranslationY(-AndroidUtilities.dp(4.0f));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f16895s = ofFloat;
            ofFloat.addUpdateListener(new eg.m1(this, 27));
            this.f16895s.addListener(new dg.l0(this, 20));
            this.f16895s.setInterpolator(pr.h);
            this.f16895s.setDuration(340L);
            this.f16895s.start();
            return;
        }
        textViewArr[0].setVisibility(0);
        textViewArr[0].setAlpha(1.0f);
        textViewArr[0].setText(charSequence);
        textViewArr[1].setVisibility(8);
        textViewArr[1].setAlpha(0.0f);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setOnSubtitleClick(View.OnClickListener onClickListener) {
        boolean z4;
        org.telegram.ui.Cells.z f02;
        TextView[] textViewArr = this.f16890c;
        textViewArr[0].setOnClickListener(onClickListener);
        TextView textView = textViewArr[0];
        if (onClickListener != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        textView.setClickable(z4);
        TextView textView2 = textViewArr[0];
        if (onClickListener == null) {
            f02 = null;
        } else {
            f02 = org.telegram.ui.ActionBar.k6.f0(822083583, 7, -1);
        }
        textView2.setBackground(f02);
    }

    public void setSubtitle(CharSequence charSequence) {
        c(charSequence, false);
    }
}
