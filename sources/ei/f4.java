package ei;

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
import b8.mf;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hs;
import org.telegram.ui.Components.gh0;
import org.telegram.ui.Components.xq;
public final class f4 extends FrameLayout {
    public final d4 f10263a;
    public final e4 f10264b;
    public final TextView[] f10265c;
    public gh0 d;
    public final h4 f10266e;
    public Paint f10267f;
    public float h;
    public boolean f10268n;
    public boolean f10269r;
    public ValueAnimator f10270s;

    public f4(Context context, h4 h4Var) {
        super(context);
        this.f10265c = new TextView[2];
        this.f10266e = h4Var;
        d4 d4Var = new d4(0, context, this);
        this.f10263a = d4Var;
        d4Var.setRoundRadius(org.telegram.messenger.g0.L(16.0f));
        addView(d4Var, mf.d(32, 32.0f, 0, 12.0f, 2.0f, 0.0f, 0.0f));
        setClipChildren(false);
        e4 e4Var = new e4(context, 0);
        this.f10264b = e4Var;
        e4Var.setTextSize(14);
        e4Var.setTypeface(org.telegram.messenger.g0.o());
        e4Var.setMaxLines(1);
        e4Var.setEllipsizeByGradient(org.telegram.messenger.g0.L(4.0f));
        e4Var.setPivotX(0.0f);
        hs.i(e4Var);
        addView(e4Var, mf.d(-2, -2.0f, 0, 54.0f, 0.0f, 86.0f, 0.0f));
        for (int i3 = 0; i3 < 2; i3++) {
            this.f10265c[i3] = new TextView(context);
            this.f10265c[i3].setTextSize(1, 12.0f);
            this.f10265c[i3].setMaxLines(1);
            this.f10265c[i3].setSingleLine(true);
            this.f10265c[i3].setEllipsize(TextUtils.TruncateAt.MIDDLE);
            this.f10265c[i3].setTextColor(-1);
            this.f10265c[i3].setPadding(org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(1.0f));
            addView(this.f10265c[i3], mf.d(-2, -2.0f, 0, 51.0f, 18.0f, 83.0f, 0.0f));
        }
        this.f10264b.setTextColor(-1);
    }

    public final void b(float f10, Canvas canvas, RectF rectF, boolean z10) {
        boolean z11;
        float f11;
        boolean z12;
        float i3;
        y6 y6Var;
        h4 h4Var = this.f10266e;
        if ((h4Var != null && h4Var.f10359b != null) || this.h != 0.0f) {
            if (h4Var != null && (y6Var = h4Var.f10359b) != null && !y6Var.J) {
                this.h = 1.0f;
                f11 = y6Var.h;
                if (!this.f10268n) {
                    this.f10268n = true;
                }
                z11 = false;
            } else {
                if (this.f10268n) {
                    this.f10268n = false;
                    if (this.d.f34100f < 0.2f) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.f10269r = z12;
                }
                if (!this.f10269r) {
                    this.h = Utilities.i(this.h - ((1000.0f / org.telegram.messenger.g0.f22609r) / 300.0f), 1.0f, 0.0f);
                }
                z11 = true;
                f11 = 1.0f;
            }
            gh0 gh0Var = this.d;
            d4 d4Var = this.f10263a;
            if (gh0Var == null) {
                gh0 gh0Var2 = new gh0(d4Var);
                this.d = gh0Var2;
                gh0Var2.d(null, true, false);
            }
            this.d.f34110q = 0;
            ImageReceiver imageReceiver = d4Var.getImageReceiver();
            float D = a1.g.D(1.0f, this.h, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(3.0f));
            this.d.f((int) (rectF.left - D), (int) (rectF.top - D), (int) (rectF.right + D), (int) (rectF.bottom + D));
            gh0 gh0Var3 = this.d;
            if (z11) {
                i3 = 1.0f;
            } else {
                i3 = Utilities.i(f11, 1.0f, 0.0f);
            }
            gh0Var3.e(true, i3);
            if (this.f10269r && z11 && this.d.f34100f >= 0.9f) {
                this.h = Utilities.i(this.h - ((1000.0f / org.telegram.messenger.g0.f22609r) / 300.0f), 1.0f, 0.0f);
            }
            if (z10) {
                if (f10 != 1.0f) {
                    Paint t10 = s7.t(imageReceiver, false);
                    t10.setAlpha((int) (this.h * 255.0f));
                    gh0 gh0Var4 = this.d;
                    gh0Var4.f34113t = t10;
                    gh0Var4.a(canvas);
                }
                if (this.f10267f == null) {
                    Paint paint = new Paint(1);
                    this.f10267f = paint;
                    paint.setColor(-1);
                    this.f10267f.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
                    this.f10267f.setStyle(Paint.Style.STROKE);
                    this.f10267f.setStrokeCap(Paint.Cap.ROUND);
                }
                this.f10267f.setAlpha((int) (255.0f * f10 * this.h));
                gh0 gh0Var5 = this.d;
                gh0Var5.f34113t = this.f10267f;
                gh0Var5.a(canvas);
            }
        }
    }

    public final void c(CharSequence charSequence, boolean z10) {
        ValueAnimator valueAnimator = this.f10270s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f10270s = null;
        }
        TextView[] textViewArr = this.f10265c;
        if (z10) {
            textViewArr[1].setOnClickListener(null);
            textViewArr[1].setText(textViewArr[0].getText());
            textViewArr[1].setVisibility(0);
            textViewArr[1].setAlpha(1.0f);
            textViewArr[1].setTranslationY(0.0f);
            textViewArr[0].setText(charSequence);
            textViewArr[0].setVisibility(0);
            textViewArr[0].setAlpha(0.0f);
            textViewArr[0].setTranslationY(-org.telegram.messenger.g0.L(4.0f));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f10270s = ofFloat;
            ofFloat.addUpdateListener(new bh.f(this, 19));
            this.f10270s.addListener(new ai.e1(this, 12));
            this.f10270s.setInterpolator(xq.h);
            this.f10270s.setDuration(340L);
            this.f10270s.start();
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
        org.telegram.ui.Cells.y h02;
        TextView[] textViewArr = this.f10265c;
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
            h02 = null;
        } else {
            h02 = org.telegram.ui.ActionBar.k6.h0(822083583, 7, -1);
        }
        textView2.setBackground(h02);
    }

    public void setSubtitle(CharSequence charSequence) {
        c(charSequence, false);
    }
}
