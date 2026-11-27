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
public final class l68 extends FrameLayout {
    public final mb0 a;
    public final ff0 b;
    public final TextView[] c;
    public g29 d;
    public final n68 e;
    public Paint f;
    public float h;
    public boolean n;
    public boolean r;
    public ValueAnimator s;

    public l68(Context context, n68 n68Var) {
        super(context);
        this.c = new TextView[2];
        this.e = n68Var;
        mb0 mb0Var = new mb0((byte) 8, context, this);
        this.a = mb0Var;
        mb0Var.setRoundRadius(hl.L(16.0f));
        addView(mb0Var, tre.d(32, 32.0f, 0, 12.0f, 2.0f, 0.0f, 0.0f));
        setClipChildren(false);
        ff0 ff0Var = new ff0(context, (byte) 3);
        this.b = ff0Var;
        ff0Var.setTextSize(14);
        ff0Var.setTypeface(hl.o());
        ff0Var.setMaxLines(1);
        ff0Var.setEllipsizeByGradient(hl.L(4.0f));
        ff0Var.setPivotX(0.0f);
        jn7.i(ff0Var);
        addView(ff0Var, tre.d(-2, -2.0f, 0, 54.0f, 0.0f, 86.0f, 0.0f));
        for (int i = 0; i < 2; i++) {
            this.c[i] = new TextView(context);
            this.c[i].setTextSize(1, 12.0f);
            this.c[i].setMaxLines(1);
            this.c[i].setSingleLine(true);
            this.c[i].setEllipsize(TextUtils.TruncateAt.MIDDLE);
            this.c[i].setTextColor(-1);
            this.c[i].setPadding(hl.L(3.0f), 0, hl.L(3.0f), hl.L(1.0f));
            addView(this.c[i], tre.d(-2, -2.0f, 0, 51.0f, 18.0f, 83.0f, 0.0f));
        }
        this.b.setTextColor(-1);
    }

    public final void a(float f, Canvas canvas, RectF rectF, boolean z) {
        boolean z2;
        float f2;
        boolean z3;
        float i;
        b6b b6bVar;
        n68 n68Var = this.e;
        if ((n68Var != null && n68Var.b != null) || this.h != 0.0f) {
            if (n68Var != null && (b6bVar = n68Var.b) != null && !b6bVar.J) {
                this.h = 1.0f;
                f2 = b6bVar.h;
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
                    this.h = Utilities.i(this.h - ((1000.0f / hl.r) / 300.0f), 1.0f, 0.0f);
                }
                z2 = true;
                f2 = 1.0f;
            }
            g29 g29Var = this.d;
            mb0 mb0Var = this.a;
            if (g29Var == null) {
                g29 g29Var2 = new g29(mb0Var);
                this.d = g29Var2;
                g29Var2.d(null, true, false);
            }
            this.d.q = 0;
            ImageReceiver imageReceiver = mb0Var.getImageReceiver();
            float B = qu6.B(1.0f, this.h, hl.L(6.0f), hl.L(3.0f));
            this.d.f((int) (rectF.left - B), (int) (rectF.top - B), (int) (rectF.right + B), (int) (rectF.bottom + B));
            g29 g29Var3 = this.d;
            if (z2) {
                i = 1.0f;
            } else {
                i = Utilities.i(f2, 1.0f, 0.0f);
            }
            g29Var3.e(true, i);
            if (this.r && z2 && this.d.f >= 0.9f) {
                this.h = Utilities.i(this.h - ((1000.0f / hl.r) / 300.0f), 1.0f, 0.0f);
            }
            if (z) {
                if (f != 1.0f) {
                    Paint t = t6b.t(imageReceiver, false);
                    t.setAlpha((int) (this.h * 255.0f));
                    g29 g29Var4 = this.d;
                    g29Var4.r = t;
                    g29Var4.a(canvas);
                }
                if (this.f == null) {
                    Paint paint = new Paint(1);
                    this.f = paint;
                    paint.setColor(-1);
                    this.f.setStrokeWidth(hl.L(2.0f));
                    this.f.setStyle(Paint.Style.STROKE);
                    this.f.setStrokeCap(Paint.Cap.ROUND);
                }
                this.f.setAlpha((int) (255.0f * f * this.h));
                g29 g29Var5 = this.d;
                g29Var5.r = this.f;
                g29Var5.a(canvas);
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
            textViewArr[0].setTranslationY(-hl.L(4.0f));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.s = ofFloat;
            ofFloat.addUpdateListener(new pv7(this, (byte) 3));
            this.s.addListener(new ad5(this, (byte) 28));
            this.s.setInterpolator(k43.h);
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
        hf0 f0;
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
            f0 = aob.f0(822083583, 7, -1);
        }
        textView2.setBackground(f0);
    }

    public void setSubtitle(CharSequence charSequence) {
        b(charSequence, false);
    }
}
