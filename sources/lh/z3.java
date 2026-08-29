package lh;

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
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.th;
public final class z3 extends FrameLayout {
    public final y3 f16453a;
    public final gg.c f16454b;
    public final TextView[] f16455c;
    public bj0 d;
    public final b4 f16456e;
    public Paint f16457f;
    public float h;
    public boolean f16458n;
    public boolean f16459r;
    public ValueAnimator f16460s;

    public z3(Context context, b4 b4Var) {
        super(context);
        this.f16455c = new TextView[2];
        this.f16456e = b4Var;
        y3 y3Var = new y3(this, context, 0);
        this.f16453a = y3Var;
        y3Var.setRoundRadius(AndroidUtilities.dp(16.0f));
        addView(y3Var, i7.f6.d(32, 32.0f, 0, 12.0f, 2.0f, 0.0f, 0.0f));
        setClipChildren(false);
        gg.c cVar = new gg.c(context, 1);
        this.f16454b = cVar;
        cVar.setTextSize(14);
        cVar.setTypeface(AndroidUtilities.bold());
        cVar.setMaxLines(1);
        cVar.setEllipsizeByGradient(AndroidUtilities.dp(4.0f));
        cVar.setPivotX(0.0f);
        NotificationCenter.listenEmojiLoading(cVar);
        addView(cVar, i7.f6.d(-2, -2.0f, 0, 54.0f, 0.0f, 86.0f, 0.0f));
        for (int i10 = 0; i10 < 2; i10++) {
            this.f16455c[i10] = new TextView(context);
            this.f16455c[i10].setTextSize(1, 12.0f);
            this.f16455c[i10].setMaxLines(1);
            this.f16455c[i10].setSingleLine(true);
            this.f16455c[i10].setEllipsize(TextUtils.TruncateAt.MIDDLE);
            this.f16455c[i10].setTextColor(-1);
            this.f16455c[i10].setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(1.0f));
            addView(this.f16455c[i10], i7.f6.d(-2, -2.0f, 0, 51.0f, 18.0f, 83.0f, 0.0f));
        }
        this.f16454b.setTextColor(-1);
    }

    public final void b(float f9, Canvas canvas, RectF rectF, boolean z10) {
        float f10;
        boolean z11;
        boolean z12;
        float clamp;
        r6 r6Var;
        b4 b4Var = this.f16456e;
        if ((b4Var != null && b4Var.f15375b != null) || this.h != 0.0f) {
            if (b4Var != null && (r6Var = b4Var.f15375b) != null && !r6Var.E) {
                this.h = 1.0f;
                f10 = r6Var.h;
                if (!this.f16458n) {
                    this.f16458n = true;
                }
                z11 = false;
            } else {
                if (this.f16458n) {
                    this.f16458n = false;
                    if (this.d.f27129f < 0.2f) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.f16459r = z12;
                }
                if (!this.f16459r) {
                    this.h = Utilities.clamp(this.h - ((1000.0f / AndroidUtilities.screenRefreshRate) / 300.0f), 1.0f, 0.0f);
                }
                f10 = 1.0f;
                z11 = true;
            }
            bj0 bj0Var = this.d;
            y3 y3Var = this.f16453a;
            if (bj0Var == null) {
                bj0 bj0Var2 = new bj0(y3Var);
                this.d = bj0Var2;
                bj0Var2.d(null, true, false);
            }
            this.d.f27139q = 0;
            ImageReceiver imageReceiver = y3Var.getImageReceiver();
            float b10 = th.b(1.0f, this.h, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(3.0f));
            this.d.f((int) (rectF.left - b10), (int) (rectF.top - b10), (int) (rectF.right + b10), (int) (rectF.bottom + b10));
            bj0 bj0Var3 = this.d;
            if (z11) {
                clamp = 1.0f;
            } else {
                clamp = Utilities.clamp(f10, 1.0f, 0.0f);
            }
            bj0Var3.e(clamp, true);
            if (this.f16459r && z11 && this.d.f27129f >= 0.9f) {
                this.h = Utilities.clamp(this.h - ((1000.0f / AndroidUtilities.screenRefreshRate) / 300.0f), 1.0f, 0.0f);
            }
            if (z10) {
                if (f9 != 1.0f) {
                    Paint t10 = l7.t(imageReceiver, false);
                    t10.setAlpha((int) (this.h * 255.0f));
                    bj0 bj0Var4 = this.d;
                    bj0Var4.f27142t = t10;
                    bj0Var4.a(canvas);
                }
                if (this.f16457f == null) {
                    Paint paint = new Paint(1);
                    this.f16457f = paint;
                    paint.setColor(-1);
                    this.f16457f.setStrokeWidth(AndroidUtilities.dp(2.0f));
                    this.f16457f.setStyle(Paint.Style.STROKE);
                    this.f16457f.setStrokeCap(Paint.Cap.ROUND);
                }
                this.f16457f.setAlpha((int) (255.0f * f9 * this.h));
                bj0 bj0Var5 = this.d;
                bj0Var5.f27142t = this.f16457f;
                bj0Var5.a(canvas);
            }
        }
    }

    public final void c(CharSequence charSequence, boolean z10) {
        ValueAnimator valueAnimator = this.f16460s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f16460s = null;
        }
        TextView[] textViewArr = this.f16455c;
        if (z10) {
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
            this.f16460s = ofFloat;
            ofFloat.addUpdateListener(new bg.q1(this, 27));
            this.f16460s.addListener(new ag.m0(this, 19));
            this.f16460s.setInterpolator(jr.h);
            this.f16460s.setDuration(340L);
            this.f16460s.start();
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
        boolean z10;
        org.telegram.ui.Cells.z f02;
        TextView[] textViewArr = this.f16455c;
        textViewArr[0].setOnClickListener(onClickListener);
        TextView textView = textViewArr[0];
        if (onClickListener != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        textView.setClickable(z10);
        TextView textView2 = textViewArr[0];
        if (onClickListener == null) {
            f02 = null;
        } else {
            f02 = org.telegram.ui.ActionBar.g6.f0(822083583, 7, -1);
        }
        textView2.setBackground(f02);
    }

    public void setSubtitle(CharSequence charSequence) {
        c(charSequence, false);
    }
}
