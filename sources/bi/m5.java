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
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.es;
public final class m5 extends FrameLayout {
    public final k5 f3309a;
    public final l5 f3310b;
    public final TextView[] f3311c;
    public ck0 d;
    public final o5 e;
    public Paint f3312f;
    public float h;
    public boolean f3313n;
    public boolean f3314r;
    public ValueAnimator f3315s;

    public m5(Context context, o5 o5Var) {
        super(context);
        this.f3311c = new TextView[2];
        this.e = o5Var;
        k5 k5Var = new k5(this, context, 0);
        this.f3309a = k5Var;
        k5Var.setRoundRadius(AndroidUtilities.dp(16.0f));
        addView(k5Var, w7.a6.a(32.0f, 12.0f, 2.0f, 0.0f, 0.0f, 32, 0));
        setClipChildren(false);
        l5 l5Var = new l5(context, 0);
        this.f3310b = l5Var;
        l5Var.setTextSize(14);
        l5Var.setTypeface(AndroidUtilities.bold());
        l5Var.setMaxLines(1);
        l5Var.setEllipsizeByGradient(AndroidUtilities.dp(4.0f));
        l5Var.setPivotX(0.0f);
        NotificationCenter.listenEmojiLoading(l5Var);
        addView(l5Var, w7.a6.a(-2.0f, 54.0f, 0.0f, 86.0f, 0.0f, -2, 0));
        for (int i10 = 0; i10 < 2; i10++) {
            this.f3311c[i10] = new TextView(context);
            this.f3311c[i10].setTextSize(1, 12.0f);
            this.f3311c[i10].setMaxLines(1);
            this.f3311c[i10].setSingleLine(true);
            this.f3311c[i10].setEllipsize(TextUtils.TruncateAt.MIDDLE);
            this.f3311c[i10].setTextColor(-1);
            this.f3311c[i10].setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(1.0f));
            addView(this.f3311c[i10], w7.a6.a(-2.0f, 51.0f, 18.0f, 83.0f, 0.0f, -2, 0));
        }
        this.f3310b.setTextColor(-1);
    }

    public final void b(float f7, Canvas canvas, RectF rectF, boolean z10) {
        boolean z11;
        float f10;
        boolean z12;
        float clamp;
        w8 w8Var;
        o5 o5Var = this.e;
        if ((o5Var != null && o5Var.f3414b != null) || this.h != 0.0f) {
            if (o5Var != null && (w8Var = o5Var.f3414b) != null && !w8Var.I) {
                this.h = 1.0f;
                f10 = w8Var.h;
                if (!this.f3313n) {
                    this.f3313n = true;
                }
                z11 = false;
            } else {
                if (this.f3313n) {
                    this.f3313n = false;
                    if (this.d.f24094f < 0.2f) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.f3314r = z12;
                }
                if (!this.f3314r) {
                    this.h = Utilities.clamp(this.h - ((1000.0f / AndroidUtilities.screenRefreshRate) / 300.0f), 1.0f, 0.0f);
                }
                z11 = true;
                f10 = 1.0f;
            }
            ck0 ck0Var = this.d;
            k5 k5Var = this.f3309a;
            if (ck0Var == null) {
                ck0 ck0Var2 = new ck0(k5Var);
                this.d = ck0Var2;
                ck0Var2.d(null, true, false);
            }
            this.d.f24104q = 0;
            ImageReceiver imageReceiver = k5Var.getImageReceiver();
            float D = com.google.android.gms.internal.play_billing.k3.D(1.0f, this.h, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(3.0f));
            this.d.f((int) (rectF.left - D), (int) (rectF.top - D), (int) (rectF.right + D), (int) (rectF.bottom + D));
            ck0 ck0Var3 = this.d;
            if (z11) {
                clamp = 1.0f;
            } else {
                clamp = Utilities.clamp(f10, 1.0f, 0.0f);
            }
            ck0Var3.e(clamp, true);
            if (this.f3314r && z11 && this.d.f24094f >= 0.9f) {
                this.h = Utilities.clamp(this.h - ((1000.0f / AndroidUtilities.screenRefreshRate) / 300.0f), 1.0f, 0.0f);
            }
            if (z10) {
                if (f7 != 1.0f) {
                    Paint t10 = s9.t(imageReceiver, false);
                    t10.setAlpha((int) (this.h * 255.0f));
                    ck0 ck0Var4 = this.d;
                    ck0Var4.f24107t = t10;
                    ck0Var4.a(canvas);
                }
                if (this.f3312f == null) {
                    Paint paint = new Paint(1);
                    this.f3312f = paint;
                    paint.setColor(-1);
                    this.f3312f.setStrokeWidth(AndroidUtilities.dp(2.0f));
                    this.f3312f.setStyle(Paint.Style.STROKE);
                    this.f3312f.setStrokeCap(Paint.Cap.ROUND);
                }
                this.f3312f.setAlpha((int) (255.0f * f7 * this.h));
                ck0 ck0Var5 = this.d;
                ck0Var5.f24107t = this.f3312f;
                ck0Var5.a(canvas);
            }
        }
    }

    public final void c(CharSequence charSequence, boolean z10) {
        ValueAnimator valueAnimator = this.f3315s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f3315s = null;
        }
        TextView[] textViewArr = this.f3311c;
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
            this.f3315s = ofFloat;
            ofFloat.addUpdateListener(new ah.c0(this, 9));
            this.f3315s.addListener(new ah.b(this, 8));
            this.f3315s.setInterpolator(es.h);
            this.f3315s.setDuration(340L);
            this.f3315s.start();
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
        org.telegram.ui.Cells.z g02;
        TextView[] textViewArr = this.f3311c;
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
            g02 = null;
        } else {
            g02 = org.telegram.ui.ActionBar.g6.g0(822083583, 7, -1);
        }
        textView2.setBackground(g02);
    }

    public void setSubtitle(CharSequence charSequence) {
        c(charSequence, false);
    }
}
