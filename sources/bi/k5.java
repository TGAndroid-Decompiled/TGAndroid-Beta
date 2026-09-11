package bi;

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
import org.telegram.ui.Components.pr;
public final class k5 extends FrameLayout {
    public final i5 f3195a;
    public final j5 f3196b;
    public final TextView[] f3197c;
    public bj0 d;
    public final m5 f3198e;
    public Paint f3199f;
    public float h;
    public boolean f3200n;
    public boolean f3201r;
    public ValueAnimator f3202s;

    public k5(Context context, m5 m5Var) {
        super(context);
        this.f3197c = new TextView[2];
        this.f3198e = m5Var;
        i5 i5Var = new i5(this, context, 0);
        this.f3195a = i5Var;
        i5Var.setRoundRadius(AndroidUtilities.dp(16.0f));
        addView(i5Var, w7.x5.d(32, 32.0f, 0, 12.0f, 2.0f, 0.0f, 0.0f));
        setClipChildren(false);
        j5 j5Var = new j5(context, 0);
        this.f3196b = j5Var;
        j5Var.setTextSize(14);
        j5Var.setTypeface(AndroidUtilities.bold());
        j5Var.setMaxLines(1);
        j5Var.setEllipsizeByGradient(AndroidUtilities.dp(4.0f));
        j5Var.setPivotX(0.0f);
        NotificationCenter.listenEmojiLoading(j5Var);
        addView(j5Var, w7.x5.d(-2, -2.0f, 0, 54.0f, 0.0f, 86.0f, 0.0f));
        for (int i10 = 0; i10 < 2; i10++) {
            this.f3197c[i10] = new TextView(context);
            this.f3197c[i10].setTextSize(1, 12.0f);
            this.f3197c[i10].setMaxLines(1);
            this.f3197c[i10].setSingleLine(true);
            this.f3197c[i10].setEllipsize(TextUtils.TruncateAt.MIDDLE);
            this.f3197c[i10].setTextColor(-1);
            this.f3197c[i10].setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(1.0f));
            addView(this.f3197c[i10], w7.x5.d(-2, -2.0f, 0, 51.0f, 18.0f, 83.0f, 0.0f));
        }
        this.f3196b.setTextColor(-1);
    }

    public final void b(float f7, Canvas canvas, RectF rectF, boolean z10) {
        float f10;
        boolean z11;
        boolean z12;
        float clamp;
        t8 t8Var;
        m5 m5Var = this.f3198e;
        if ((m5Var != null && m5Var.f3311b != null) || this.h != 0.0f) {
            if (m5Var != null && (t8Var = m5Var.f3311b) != null && !t8Var.I) {
                this.h = 1.0f;
                f10 = t8Var.h;
                if (!this.f3200n) {
                    this.f3200n = true;
                }
                z11 = false;
            } else {
                if (this.f3200n) {
                    this.f3200n = false;
                    if (this.d.f24722f < 0.2f) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.f3201r = z12;
                }
                if (!this.f3201r) {
                    this.h = Utilities.clamp(this.h - ((1000.0f / AndroidUtilities.screenRefreshRate) / 300.0f), 1.0f, 0.0f);
                }
                f10 = 1.0f;
                z11 = true;
            }
            bj0 bj0Var = this.d;
            i5 i5Var = this.f3195a;
            if (bj0Var == null) {
                bj0 bj0Var2 = new bj0(i5Var);
                this.d = bj0Var2;
                bj0Var2.d(null, true, false);
            }
            this.d.f24732q = 0;
            ImageReceiver imageReceiver = i5Var.getImageReceiver();
            float b10 = com.google.android.gms.internal.vision.e2.b(1.0f, this.h, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(3.0f));
            this.d.f((int) (rectF.left - b10), (int) (rectF.top - b10), (int) (rectF.right + b10), (int) (rectF.bottom + b10));
            bj0 bj0Var3 = this.d;
            if (z11) {
                clamp = 1.0f;
            } else {
                clamp = Utilities.clamp(f10, 1.0f, 0.0f);
            }
            bj0Var3.e(clamp, true);
            if (this.f3201r && z11 && this.d.f24722f >= 0.9f) {
                this.h = Utilities.clamp(this.h - ((1000.0f / AndroidUtilities.screenRefreshRate) / 300.0f), 1.0f, 0.0f);
            }
            if (z10) {
                if (f7 != 1.0f) {
                    Paint t10 = p9.t(imageReceiver, false);
                    t10.setAlpha((int) (this.h * 255.0f));
                    bj0 bj0Var4 = this.d;
                    bj0Var4.f24735t = t10;
                    bj0Var4.a(canvas);
                }
                if (this.f3199f == null) {
                    Paint paint = new Paint(1);
                    this.f3199f = paint;
                    paint.setColor(-1);
                    this.f3199f.setStrokeWidth(AndroidUtilities.dp(2.0f));
                    this.f3199f.setStyle(Paint.Style.STROKE);
                    this.f3199f.setStrokeCap(Paint.Cap.ROUND);
                }
                this.f3199f.setAlpha((int) (255.0f * f7 * this.h));
                bj0 bj0Var5 = this.d;
                bj0Var5.f24735t = this.f3199f;
                bj0Var5.a(canvas);
            }
        }
    }

    public final void c(CharSequence charSequence, boolean z10) {
        ValueAnimator valueAnimator = this.f3202s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f3202s = null;
        }
        TextView[] textViewArr = this.f3197c;
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
            this.f3202s = ofFloat;
            ofFloat.addUpdateListener(new ah.d0(this, 9));
            this.f3202s.addListener(new ah.b(this, 8));
            this.f3202s.setInterpolator(pr.h);
            this.f3202s.setDuration(340L);
            this.f3202s.start();
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
        TextView[] textViewArr = this.f3197c;
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
            f02 = org.telegram.ui.ActionBar.j6.f0(822083583, 7, -1);
        }
        textView2.setBackground(f02);
    }

    public void setSubtitle(CharSequence charSequence) {
        c(charSequence, false);
    }
}
