package defpackage;

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
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
public final class x48 extends FrameLayout {
    public final kc0 a;
    public final dg0 b;
    public final TextView[] c;
    public u09 d;
    public final z48 e;
    public Paint f;
    public float h;
    public boolean n;
    public boolean r;
    public ValueAnimator s;

    public x48(Context context, z48 z48Var) {
        super(context);
        this.c = new TextView[2];
        this.e = z48Var;
        kc0 kc0Var = new kc0((byte) 8, context, this);
        this.a = kc0Var;
        kc0Var.setRoundRadius(gm.L(16.0f));
        addView(kc0Var, qoe.d(32, 32.0f, 0, 12.0f, 2.0f, 0.0f, 0.0f));
        setClipChildren(false);
        dg0 dg0Var = new dg0(context, (byte) 3);
        this.b = dg0Var;
        dg0Var.setTextSize(14);
        dg0Var.setTypeface(gm.o());
        dg0Var.setMaxLines(1);
        dg0Var.setEllipsizeByGradient(gm.L(4.0f));
        dg0Var.setPivotX(0.0f);
        nm7.i(dg0Var);
        addView(dg0Var, qoe.d(-2, -2.0f, 0, 54.0f, 0.0f, 86.0f, 0.0f));
        for (int i = 0; i < 2; i++) {
            this.c[i] = new TextView(context);
            this.c[i].setTextSize(1, 12.0f);
            this.c[i].setMaxLines(1);
            this.c[i].setSingleLine(true);
            this.c[i].setEllipsize(TextUtils.TruncateAt.MIDDLE);
            this.c[i].setTextColor(-1);
            this.c[i].setPadding(gm.L(3.0f), 0, gm.L(3.0f), gm.L(1.0f));
            addView(this.c[i], qoe.d(-2, -2.0f, 0, 51.0f, 18.0f, 83.0f, 0.0f));
        }
        this.b.setTextColor(-1);
    }

    public final void a(float f, Canvas canvas, RectF rectF, boolean z) {
        boolean z2;
        float f2;
        boolean z3;
        float i;
        g4b g4bVar;
        z48 z48Var = this.e;
        if ((z48Var != null && z48Var.b != null) || this.h != 0.0f) {
            if (z48Var != null && (g4bVar = z48Var.b) != null && !g4bVar.J) {
                this.h = 1.0f;
                f2 = g4bVar.h;
                if (!this.n) {
                    this.n = true;
                }
                z2 = false;
            } else {
                if (this.n) {
                    this.n = false;
                    if (this.d.f < 0.2f) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    this.r = z3;
                }
                if (!this.r) {
                    this.h = Utilities.i(this.h - ((1000.0f / gm.r) / 300.0f), 1.0f, 0.0f);
                }
                z2 = true;
                f2 = 1.0f;
            }
            u09 u09Var = this.d;
            kc0 kc0Var = this.a;
            if (u09Var == null) {
                u09 u09Var2 = new u09(kc0Var);
                this.d = u09Var2;
                u09Var2.d(null, true, false);
            }
            this.d.q = 0;
            ImageReceiver imageReceiver = kc0Var.getImageReceiver();
            float B = kt6.B(1.0f, this.h, gm.L(6.0f), gm.L(3.0f));
            this.d.f((int) (rectF.left - B), (int) (rectF.top - B), (int) (rectF.right + B), (int) (rectF.bottom + B));
            u09 u09Var3 = this.d;
            if (z2) {
                i = 1.0f;
            } else {
                i = Utilities.i(f2, 1.0f, 0.0f);
            }
            u09Var3.e(true, i);
            if (this.r && z2 && this.d.f >= 0.9f) {
                this.h = Utilities.i(this.h - ((1000.0f / gm.r) / 300.0f), 1.0f, 0.0f);
            }
            if (z) {
                if (f != 1.0f) {
                    Paint t = y4b.t(imageReceiver, false);
                    t.setAlpha((int) (this.h * 255.0f));
                    u09 u09Var4 = this.d;
                    u09Var4.r = t;
                    u09Var4.a(canvas);
                }
                if (this.f == null) {
                    Paint paint = new Paint(1);
                    this.f = paint;
                    paint.setColor(-1);
                    this.f.setStrokeWidth(gm.L(2.0f));
                    this.f.setStyle(Paint.Style.STROKE);
                    this.f.setStrokeCap(Paint.Cap.ROUND);
                }
                this.f.setAlpha((int) (255.0f * f * this.h));
                u09 u09Var5 = this.d;
                u09Var5.r = this.f;
                u09Var5.a(canvas);
            }
        }
    }

    public final void b(CharSequence charSequence, boolean z) {
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.s = null;
        }
        TextView[] textViewArr = this.c;
        if (z) {
            textViewArr[1].setOnClickListener(null);
            textViewArr[1].setText(textViewArr[0].getText());
            textViewArr[1].setVisibility(0);
            textViewArr[1].setAlpha(1.0f);
            textViewArr[1].setTranslationY(0.0f);
            textViewArr[0].setText(charSequence);
            textViewArr[0].setVisibility(0);
            textViewArr[0].setAlpha(0.0f);
            textViewArr[0].setTranslationY(-gm.L(4.0f));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.s = ofFloat;
            ofFloat.addUpdateListener(new fx7(this, (byte) 2));
            this.s.addListener(new s38(this, (byte) 1));
            this.s.setInterpolator(d53.h);
            this.s.setDuration(340L);
            this.s.start();
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
        boolean z;
        fg0 f0;
        TextView[] textViewArr = this.c;
        textViewArr[0].setOnClickListener(onClickListener);
        TextView textView = textViewArr[0];
        if (onClickListener != null) {
            z = true;
        } else {
            z = false;
        }
        textView.setClickable(z);
        TextView textView2 = textViewArr[0];
        if (onClickListener == null) {
            f0 = null;
        } else {
            f0 = cmb.f0(822083583, 7, -1);
        }
        textView2.setBackground(f0);
    }

    public void setSubtitle(CharSequence charSequence) {
        b(charSequence, false);
    }
}
