package nh;

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
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.mr;
import org.telegram.ui.ai;
public final class z3 extends FrameLayout {
    public final y3 f16092a;
    public final ig.c f16093b;
    public final TextView[] f16094c;
    public kj0 d;
    public final b4 e;
    public Paint f16095f;
    public float h;
    public boolean f16096n;
    public boolean f16097r;
    public ValueAnimator f16098s;

    public z3(Context context, b4 b4Var) {
        super(context);
        this.f16094c = new TextView[2];
        this.e = b4Var;
        y3 y3Var = new y3(this, context, 0);
        this.f16092a = y3Var;
        y3Var.setRoundRadius(AndroidUtilities.dp(16.0f));
        addView(y3Var, k7.b6.d(32, 32.0f, 0, 12.0f, 2.0f, 0.0f, 0.0f));
        setClipChildren(false);
        ig.c cVar = new ig.c(context, 1);
        this.f16093b = cVar;
        cVar.setTextSize(14);
        cVar.setTypeface(AndroidUtilities.bold());
        cVar.setMaxLines(1);
        cVar.setEllipsizeByGradient(AndroidUtilities.dp(4.0f));
        cVar.setPivotX(0.0f);
        NotificationCenter.listenEmojiLoading(cVar);
        addView(cVar, k7.b6.d(-2, -2.0f, 0, 54.0f, 0.0f, 86.0f, 0.0f));
        for (int i10 = 0; i10 < 2; i10++) {
            this.f16094c[i10] = new TextView(context);
            this.f16094c[i10].setTextSize(1, 12.0f);
            this.f16094c[i10].setMaxLines(1);
            this.f16094c[i10].setSingleLine(true);
            this.f16094c[i10].setEllipsize(TextUtils.TruncateAt.MIDDLE);
            this.f16094c[i10].setTextColor(-1);
            this.f16094c[i10].setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(1.0f));
            addView(this.f16094c[i10], k7.b6.d(-2, -2.0f, 0, 51.0f, 18.0f, 83.0f, 0.0f));
        }
        this.f16093b.setTextColor(-1);
    }

    public final void b(float f10, Canvas canvas, RectF rectF, boolean z4) {
        float f11;
        boolean z10;
        boolean z11;
        float clamp;
        s6 s6Var;
        b4 b4Var = this.e;
        if ((b4Var != null && b4Var.f15092b != null) || this.h != 0.0f) {
            if (b4Var != null && (s6Var = b4Var.f15092b) != null && !s6Var.F) {
                this.h = 1.0f;
                f11 = s6Var.h;
                if (!this.f16096n) {
                    this.f16096n = true;
                }
                z10 = false;
            } else {
                if (this.f16096n) {
                    this.f16096n = false;
                    if (this.d.f26304f < 0.2f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.f16097r = z11;
                }
                if (!this.f16097r) {
                    this.h = Utilities.clamp(this.h - ((1000.0f / AndroidUtilities.screenRefreshRate) / 300.0f), 1.0f, 0.0f);
                }
                f11 = 1.0f;
                z10 = true;
            }
            kj0 kj0Var = this.d;
            y3 y3Var = this.f16092a;
            if (kj0Var == null) {
                kj0 kj0Var2 = new kj0(y3Var);
                this.d = kj0Var2;
                kj0Var2.d(null, true, false);
            }
            this.d.f26314q = 0;
            ImageReceiver imageReceiver = y3Var.getImageReceiver();
            float c3 = ai.c(1.0f, this.h, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(3.0f));
            this.d.f((int) (rectF.left - c3), (int) (rectF.top - c3), (int) (rectF.right + c3), (int) (rectF.bottom + c3));
            kj0 kj0Var3 = this.d;
            if (z10) {
                clamp = 1.0f;
            } else {
                clamp = Utilities.clamp(f11, 1.0f, 0.0f);
            }
            kj0Var3.e(clamp, true);
            if (this.f16097r && z10 && this.d.f26304f >= 0.9f) {
                this.h = Utilities.clamp(this.h - ((1000.0f / AndroidUtilities.screenRefreshRate) / 300.0f), 1.0f, 0.0f);
            }
            if (z4) {
                if (f10 != 1.0f) {
                    Paint t6 = m7.t(imageReceiver, false);
                    t6.setAlpha((int) (this.h * 255.0f));
                    kj0 kj0Var4 = this.d;
                    kj0Var4.f26317t = t6;
                    kj0Var4.a(canvas);
                }
                if (this.f16095f == null) {
                    Paint paint = new Paint(1);
                    this.f16095f = paint;
                    paint.setColor(-1);
                    this.f16095f.setStrokeWidth(AndroidUtilities.dp(2.0f));
                    this.f16095f.setStyle(Paint.Style.STROKE);
                    this.f16095f.setStrokeCap(Paint.Cap.ROUND);
                }
                this.f16095f.setAlpha((int) (255.0f * f10 * this.h));
                kj0 kj0Var5 = this.d;
                kj0Var5.f26317t = this.f16095f;
                kj0Var5.a(canvas);
            }
        }
    }

    public final void c(CharSequence charSequence, boolean z4) {
        ValueAnimator valueAnimator = this.f16098s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f16098s = null;
        }
        TextView[] textViewArr = this.f16094c;
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
            this.f16098s = ofFloat;
            ofFloat.addUpdateListener(new dg.o1(this, 27));
            this.f16098s.addListener(new cg.l0(this, 20));
            this.f16098s.setInterpolator(mr.h);
            this.f16098s.setDuration(340L);
            this.f16098s.start();
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
        TextView[] textViewArr = this.f16094c;
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
            f02 = org.telegram.ui.ActionBar.j6.f0(822083583, 7, -1);
        }
        textView2.setBackground(f02);
    }

    public void setSubtitle(CharSequence charSequence) {
        c(charSequence, false);
    }
}
