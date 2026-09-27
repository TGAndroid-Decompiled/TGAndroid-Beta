package ai;

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
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.sr;
public final class a6 extends FrameLayout {
    public final y5 f523a;
    public final z5 f524b;
    public final TextView[] f525c;
    public oj0 d;
    public final c6 e;
    public Paint f526f;
    public float h;
    public boolean f527n;
    public boolean f528r;
    public ValueAnimator f529s;

    public a6(Context context, c6 c6Var) {
        super(context);
        this.f525c = new TextView[2];
        this.e = c6Var;
        y5 y5Var = new y5(this, context, 0);
        this.f523a = y5Var;
        y5Var.setRoundRadius(AndroidUtilities.dp(16.0f));
        addView(y5Var, w7.y5.d(32, 32.0f, 0, 12.0f, 2.0f, 0.0f, 0.0f));
        setClipChildren(false);
        z5 z5Var = new z5(context, 0);
        this.f524b = z5Var;
        z5Var.setTextSize(14);
        z5Var.setTypeface(AndroidUtilities.bold());
        z5Var.setMaxLines(1);
        z5Var.setEllipsizeByGradient(AndroidUtilities.dp(4.0f));
        z5Var.setPivotX(0.0f);
        NotificationCenter.listenEmojiLoading(z5Var);
        addView(z5Var, w7.y5.d(-2, -2.0f, 0, 54.0f, 0.0f, 86.0f, 0.0f));
        for (int i10 = 0; i10 < 2; i10++) {
            this.f525c[i10] = new TextView(context);
            this.f525c[i10].setTextSize(1, 12.0f);
            this.f525c[i10].setMaxLines(1);
            this.f525c[i10].setSingleLine(true);
            this.f525c[i10].setEllipsize(TextUtils.TruncateAt.MIDDLE);
            this.f525c[i10].setTextColor(-1);
            this.f525c[i10].setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(1.0f));
            addView(this.f525c[i10], w7.y5.d(-2, -2.0f, 0, 51.0f, 18.0f, 83.0f, 0.0f));
        }
        this.f524b.setTextColor(-1);
    }

    public final void b(float f7, Canvas canvas, RectF rectF, boolean z10) {
        float f10;
        boolean z11;
        boolean z12;
        float clamp;
        k9 k9Var;
        c6 c6Var = this.e;
        if ((c6Var != null && c6Var.f646b != null) || this.h != 0.0f) {
            if (c6Var != null && (k9Var = c6Var.f646b) != null && !k9Var.I) {
                this.h = 1.0f;
                f10 = k9Var.h;
                if (!this.f527n) {
                    this.f527n = true;
                }
                z11 = false;
            } else {
                if (this.f527n) {
                    this.f527n = false;
                    if (this.d.f27113f < 0.2f) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.f528r = z12;
                }
                if (!this.f528r) {
                    this.h = Utilities.clamp(this.h - ((1000.0f / AndroidUtilities.screenRefreshRate) / 300.0f), 1.0f, 0.0f);
                }
                f10 = 1.0f;
                z11 = true;
            }
            oj0 oj0Var = this.d;
            y5 y5Var = this.f523a;
            if (oj0Var == null) {
                oj0 oj0Var2 = new oj0(y5Var);
                this.d = oj0Var2;
                oj0Var2.d(null, true, false);
            }
            this.d.f27123q = 0;
            ImageReceiver imageReceiver = y5Var.getImageReceiver();
            float b10 = com.google.android.gms.internal.vision.e2.b(1.0f, this.h, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(3.0f));
            this.d.f((int) (rectF.left - b10), (int) (rectF.top - b10), (int) (rectF.right + b10), (int) (rectF.bottom + b10));
            oj0 oj0Var3 = this.d;
            if (z11) {
                clamp = 1.0f;
            } else {
                clamp = Utilities.clamp(f10, 1.0f, 0.0f);
            }
            oj0Var3.e(clamp, true);
            if (this.f528r && z11 && this.d.f27113f >= 0.9f) {
                this.h = Utilities.clamp(this.h - ((1000.0f / AndroidUtilities.screenRefreshRate) / 300.0f), 1.0f, 0.0f);
            }
            if (z10) {
                if (f7 != 1.0f) {
                    Paint t10 = ia.t(imageReceiver, false);
                    t10.setAlpha((int) (this.h * 255.0f));
                    oj0 oj0Var4 = this.d;
                    oj0Var4.f27126t = t10;
                    oj0Var4.a(canvas);
                }
                if (this.f526f == null) {
                    Paint paint = new Paint(1);
                    this.f526f = paint;
                    paint.setColor(-1);
                    this.f526f.setStrokeWidth(AndroidUtilities.dp(2.0f));
                    this.f526f.setStyle(Paint.Style.STROKE);
                    this.f526f.setStrokeCap(Paint.Cap.ROUND);
                }
                this.f526f.setAlpha((int) (255.0f * f7 * this.h));
                oj0 oj0Var5 = this.d;
                oj0Var5.f27126t = this.f526f;
                oj0Var5.a(canvas);
            }
        }
    }

    public final void c(CharSequence charSequence, boolean z10) {
        ValueAnimator valueAnimator = this.f529s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f529s = null;
        }
        TextView[] textViewArr = this.f525c;
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
            this.f529s = ofFloat;
            ofFloat.addUpdateListener(new a(this, 8));
            this.f529s.addListener(new b(this, 5));
            this.f529s.setInterpolator(sr.h);
            this.f529s.setDuration(340L);
            this.f529s.start();
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
        TextView[] textViewArr = this.f525c;
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
            f02 = org.telegram.ui.ActionBar.i6.f0(822083583, 7, -1);
        }
        textView2.setBackground(f02);
    }

    public void setSubtitle(CharSequence charSequence) {
        c(charSequence, false);
    }
}
