package fi;

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
import c8.ja;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ns;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.gh0;
public final class x3 extends FrameLayout {
    public final v3 f12493a;
    public final w3 f12494b;
    public final TextView[] f12495c;
    public gh0 d;
    public final z3 f12496e;
    public Paint f12497f;
    public float h;
    public boolean f12498n;
    public boolean f12499r;
    public ValueAnimator f12500s;

    public x3(Context context, z3 z3Var) {
        super(context);
        this.f12495c = new TextView[2];
        this.f12496e = z3Var;
        v3 v3Var = new v3(0, context, this);
        this.f12493a = v3Var;
        v3Var.setRoundRadius(org.telegram.messenger.g0.L(16.0f));
        addView(v3Var, ja.d(32, 32.0f, 0, 12.0f, 2.0f, 0.0f, 0.0f));
        setClipChildren(false);
        w3 w3Var = new w3(context, 0);
        this.f12494b = w3Var;
        w3Var.setTextSize(14);
        w3Var.setTypeface(org.telegram.messenger.g0.o());
        w3Var.setMaxLines(1);
        w3Var.setEllipsizeByGradient(org.telegram.messenger.g0.L(4.0f));
        w3Var.setPivotX(0.0f);
        ns.i(w3Var);
        addView(w3Var, ja.d(-2, -2.0f, 0, 54.0f, 0.0f, 86.0f, 0.0f));
        for (int i7 = 0; i7 < 2; i7++) {
            this.f12495c[i7] = new TextView(context);
            this.f12495c[i7].setTextSize(1, 12.0f);
            this.f12495c[i7].setMaxLines(1);
            this.f12495c[i7].setSingleLine(true);
            this.f12495c[i7].setEllipsize(TextUtils.TruncateAt.MIDDLE);
            this.f12495c[i7].setTextColor(-1);
            this.f12495c[i7].setPadding(org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(1.0f));
            addView(this.f12495c[i7], ja.d(-2, -2.0f, 0, 51.0f, 18.0f, 83.0f, 0.0f));
        }
        this.f12494b.setTextColor(-1);
    }

    public final void b(float f10, Canvas canvas, RectF rectF, boolean z10) {
        boolean z11;
        float f11;
        boolean z12;
        float i7;
        r6 r6Var;
        z3 z3Var = this.f12496e;
        if ((z3Var != null && z3Var.f12580b != null) || this.h != 0.0f) {
            if (z3Var != null && (r6Var = z3Var.f12580b) != null && !r6Var.J) {
                this.h = 1.0f;
                f11 = r6Var.h;
                if (!this.f12498n) {
                    this.f12498n = true;
                }
                z11 = false;
            } else {
                if (this.f12498n) {
                    this.f12498n = false;
                    if (this.d.f34972f < 0.2f) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.f12499r = z12;
                }
                if (!this.f12499r) {
                    this.h = Utilities.i(this.h - ((1000.0f / org.telegram.messenger.g0.f23612r) / 300.0f), 1.0f, 0.0f);
                }
                z11 = true;
                f11 = 1.0f;
            }
            gh0 gh0Var = this.d;
            v3 v3Var = this.f12493a;
            if (gh0Var == null) {
                gh0 gh0Var2 = new gh0(v3Var);
                this.d = gh0Var2;
                gh0Var2.d(null, true, false);
            }
            this.d.f34982q = 0;
            ImageReceiver imageReceiver = v3Var.getImageReceiver();
            float t6 = com.google.android.gms.internal.vision.e2.t(1.0f, this.h, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(3.0f));
            this.d.f((int) (rectF.left - t6), (int) (rectF.top - t6), (int) (rectF.right + t6), (int) (rectF.bottom + t6));
            gh0 gh0Var3 = this.d;
            if (z11) {
                i7 = 1.0f;
            } else {
                i7 = Utilities.i(f11, 1.0f, 0.0f);
            }
            gh0Var3.e(true, i7);
            if (this.f12499r && z11 && this.d.f34972f >= 0.9f) {
                this.h = Utilities.i(this.h - ((1000.0f / org.telegram.messenger.g0.f23612r) / 300.0f), 1.0f, 0.0f);
            }
            if (z10) {
                if (f10 != 1.0f) {
                    Paint t10 = l7.t(imageReceiver, false);
                    t10.setAlpha((int) (this.h * 255.0f));
                    gh0 gh0Var4 = this.d;
                    gh0Var4.f34985t = t10;
                    gh0Var4.a(canvas);
                }
                if (this.f12497f == null) {
                    Paint paint = new Paint(1);
                    this.f12497f = paint;
                    paint.setColor(-1);
                    this.f12497f.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
                    this.f12497f.setStyle(Paint.Style.STROKE);
                    this.f12497f.setStrokeCap(Paint.Cap.ROUND);
                }
                this.f12497f.setAlpha((int) (255.0f * f10 * this.h));
                gh0 gh0Var5 = this.d;
                gh0Var5.f34985t = this.f12497f;
                gh0Var5.a(canvas);
            }
        }
    }

    public final void c(CharSequence charSequence, boolean z10) {
        ValueAnimator valueAnimator = this.f12500s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f12500s = null;
        }
        TextView[] textViewArr = this.f12495c;
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
            this.f12500s = ofFloat;
            ofFloat.addUpdateListener(new ah.h(this, 19));
            this.f12500s.addListener(new ai.j0(this, 12));
            this.f12500s.setInterpolator(er.h);
            this.f12500s.setDuration(340L);
            this.f12500s.start();
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
        TextView[] textViewArr = this.f12495c;
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
            h02 = org.telegram.ui.ActionBar.j6.h0(822083583, 7, -1);
        }
        textView2.setBackground(h02);
    }

    public void setSubtitle(CharSequence charSequence) {
        c(charSequence, false);
    }
}
