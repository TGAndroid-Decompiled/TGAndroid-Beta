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
import org.telegram.ui.Components.mj0;
import org.telegram.ui.Components.rr;
public final class a6 extends FrameLayout {
    public final y5 f520a;
    public final z5 f521b;
    public final TextView[] f522c;
    public mj0 d;
    public final c6 e;
    public Paint f523f;
    public float h;
    public boolean f524n;
    public boolean f525r;
    public ValueAnimator f526s;

    public a6(Context context, c6 c6Var) {
        super(context);
        this.f522c = new TextView[2];
        this.e = c6Var;
        y5 y5Var = new y5(this, context, 0);
        this.f520a = y5Var;
        y5Var.setRoundRadius(AndroidUtilities.dp(16.0f));
        addView(y5Var, w7.y5.d(32, 32.0f, 0, 12.0f, 2.0f, 0.0f, 0.0f));
        setClipChildren(false);
        z5 z5Var = new z5(context, 0);
        this.f521b = z5Var;
        z5Var.setTextSize(14);
        z5Var.setTypeface(AndroidUtilities.bold());
        z5Var.setMaxLines(1);
        z5Var.setEllipsizeByGradient(AndroidUtilities.dp(4.0f));
        z5Var.setPivotX(0.0f);
        NotificationCenter.listenEmojiLoading(z5Var);
        addView(z5Var, w7.y5.d(-2, -2.0f, 0, 54.0f, 0.0f, 86.0f, 0.0f));
        for (int i10 = 0; i10 < 2; i10++) {
            this.f522c[i10] = new TextView(context);
            this.f522c[i10].setTextSize(1, 12.0f);
            this.f522c[i10].setMaxLines(1);
            this.f522c[i10].setSingleLine(true);
            this.f522c[i10].setEllipsize(TextUtils.TruncateAt.MIDDLE);
            this.f522c[i10].setTextColor(-1);
            this.f522c[i10].setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(1.0f));
            addView(this.f522c[i10], w7.y5.d(-2, -2.0f, 0, 51.0f, 18.0f, 83.0f, 0.0f));
        }
        this.f521b.setTextColor(-1);
    }

    public final void b(float f7, Canvas canvas, RectF rectF, boolean z10) {
        float f10;
        boolean z11;
        boolean z12;
        float clamp;
        k9 k9Var;
        c6 c6Var = this.e;
        if ((c6Var != null && c6Var.f643b != null) || this.h != 0.0f) {
            if (c6Var != null && (k9Var = c6Var.f643b) != null && !k9Var.I) {
                this.h = 1.0f;
                f10 = k9Var.h;
                if (!this.f524n) {
                    this.f524n = true;
                }
                z11 = false;
            } else {
                if (this.f524n) {
                    this.f524n = false;
                    if (this.d.f26515f < 0.2f) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.f525r = z12;
                }
                if (!this.f525r) {
                    this.h = Utilities.clamp(this.h - ((1000.0f / AndroidUtilities.screenRefreshRate) / 300.0f), 1.0f, 0.0f);
                }
                f10 = 1.0f;
                z11 = true;
            }
            mj0 mj0Var = this.d;
            y5 y5Var = this.f520a;
            if (mj0Var == null) {
                mj0 mj0Var2 = new mj0(y5Var);
                this.d = mj0Var2;
                mj0Var2.d(null, true, false);
            }
            this.d.f26525q = 0;
            ImageReceiver imageReceiver = y5Var.getImageReceiver();
            float b10 = com.google.android.gms.internal.vision.e2.b(1.0f, this.h, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(3.0f));
            this.d.f((int) (rectF.left - b10), (int) (rectF.top - b10), (int) (rectF.right + b10), (int) (rectF.bottom + b10));
            mj0 mj0Var3 = this.d;
            if (z11) {
                clamp = 1.0f;
            } else {
                clamp = Utilities.clamp(f10, 1.0f, 0.0f);
            }
            mj0Var3.e(clamp, true);
            if (this.f525r && z11 && this.d.f26515f >= 0.9f) {
                this.h = Utilities.clamp(this.h - ((1000.0f / AndroidUtilities.screenRefreshRate) / 300.0f), 1.0f, 0.0f);
            }
            if (z10) {
                if (f7 != 1.0f) {
                    Paint t10 = ia.t(imageReceiver, false);
                    t10.setAlpha((int) (this.h * 255.0f));
                    mj0 mj0Var4 = this.d;
                    mj0Var4.f26528t = t10;
                    mj0Var4.a(canvas);
                }
                if (this.f523f == null) {
                    Paint paint = new Paint(1);
                    this.f523f = paint;
                    paint.setColor(-1);
                    this.f523f.setStrokeWidth(AndroidUtilities.dp(2.0f));
                    this.f523f.setStyle(Paint.Style.STROKE);
                    this.f523f.setStrokeCap(Paint.Cap.ROUND);
                }
                this.f523f.setAlpha((int) (255.0f * f7 * this.h));
                mj0 mj0Var5 = this.d;
                mj0Var5.f26528t = this.f523f;
                mj0Var5.a(canvas);
            }
        }
    }

    public final void c(CharSequence charSequence, boolean z10) {
        ValueAnimator valueAnimator = this.f526s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f526s = null;
        }
        TextView[] textViewArr = this.f522c;
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
            this.f526s = ofFloat;
            ofFloat.addUpdateListener(new a(this, 8));
            this.f526s.addListener(new b(this, 5));
            this.f526s.setInterpolator(rr.h);
            this.f526s.setDuration(340L);
            this.f526s.start();
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
        TextView[] textViewArr = this.f522c;
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
            f02 = org.telegram.ui.ActionBar.h6.f0(822083583, 7, -1);
        }
        textView2.setBackground(f02);
    }

    public void setSubtitle(CharSequence charSequence) {
        c(charSequence, false);
    }
}
