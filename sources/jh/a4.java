package jh;

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
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.si0;

public final class a4 extends FrameLayout {

    public final z3 f13033a;

    public final eg.c f13034b;

    public final TextView[] f13035c;
    public si0 d;

    public final c4 f13036e;

    public Paint f13037f;
    public float h;

    public boolean f13038n;

    public boolean f13039r;

    public ValueAnimator f13040s;

    public a4(Context context, c4 c4Var) {
        super(context);
        this.f13035c = new TextView[2];
        this.f13036e = c4Var;
        z3 z3Var = new z3(this, context, 0);
        this.f13033a = z3Var;
        z3Var.setRoundRadius(AndroidUtilities.dp(16.0f));
        addView(z3Var, h7.z5.d(32, 32.0f, 0, 12.0f, 2.0f, 0.0f, 0.0f));
        setClipChildren(false);
        eg.c cVar = new eg.c(context, 1);
        this.f13034b = cVar;
        cVar.setTextSize(14);
        cVar.setTypeface(AndroidUtilities.bold());
        cVar.setMaxLines(1);
        cVar.setEllipsizeByGradient(AndroidUtilities.dp(4.0f));
        cVar.setPivotX(0.0f);
        NotificationCenter.listenEmojiLoading(cVar);
        addView(cVar, h7.z5.d(-2, -2.0f, 0, 54.0f, 0.0f, 86.0f, 0.0f));
        for (int i10 = 0; i10 < 2; i10++) {
            this.f13035c[i10] = new TextView(context);
            this.f13035c[i10].setTextSize(1, 12.0f);
            this.f13035c[i10].setMaxLines(1);
            this.f13035c[i10].setSingleLine(true);
            this.f13035c[i10].setEllipsize(TextUtils.TruncateAt.MIDDLE);
            this.f13035c[i10].setTextColor(-1);
            this.f13035c[i10].setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(1.0f));
            addView(this.f13035c[i10], h7.z5.d(-2, -2.0f, 0, 51.0f, 18.0f, 83.0f, 0.0f));
        }
        this.f13034b.setTextColor(-1);
    }

    public final void b(float f10, Canvas canvas, RectF rectF, boolean z10) {
        float f11;
        boolean z11;
        r6 r6Var;
        c4 c4Var = this.f13036e;
        if ((c4Var == null || c4Var.f13142b == null) && this.h == 0.0f) {
            return;
        }
        if (c4Var == null || (r6Var = c4Var.f13142b) == null || r6Var.E) {
            if (this.f13038n) {
                this.f13038n = false;
                this.f13039r = this.d.f32457f < 0.2f;
            }
            if (!this.f13039r) {
                this.h = Utilities.clamp(this.h - ((1000.0f / AndroidUtilities.screenRefreshRate) / 300.0f), 1.0f, 0.0f);
            }
            f11 = 1.0f;
            z11 = true;
        } else {
            this.h = 1.0f;
            f11 = r6Var.h;
            if (!this.f13038n) {
                this.f13038n = true;
            }
            z11 = false;
        }
        si0 si0Var = this.d;
        z3 z3Var = this.f13033a;
        if (si0Var == null) {
            si0 si0Var2 = new si0(z3Var);
            this.d = si0Var2;
            si0Var2.d(null, true, false);
        }
        this.d.f32467q = 0;
        ImageReceiver imageReceiver = z3Var.getImageReceiver();
        float fB = pa.b(1.0f, this.h, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(3.0f));
        this.d.f((int) (rectF.left - fB), (int) (rectF.top - fB), (int) (rectF.right + fB), (int) (rectF.bottom + fB));
        this.d.e(z11 ? 1.0f : Utilities.clamp(f11, 1.0f, 0.0f), true);
        if (this.f13039r && z11 && this.d.f32457f >= 0.9f) {
            this.h = Utilities.clamp(this.h - ((1000.0f / AndroidUtilities.screenRefreshRate) / 300.0f), 1.0f, 0.0f);
        }
        if (z10) {
            if (f10 != 1.0f) {
                Paint paintT = l7.t(imageReceiver, false);
                paintT.setAlpha((int) (this.h * 255.0f));
                si0 si0Var3 = this.d;
                si0Var3.f32470t = paintT;
                si0Var3.a(canvas);
            }
            if (this.f13037f == null) {
                Paint paint = new Paint(1);
                this.f13037f = paint;
                paint.setColor(-1);
                this.f13037f.setStrokeWidth(AndroidUtilities.dp(2.0f));
                this.f13037f.setStyle(Paint.Style.STROKE);
                this.f13037f.setStrokeCap(Paint.Cap.ROUND);
            }
            this.f13037f.setAlpha((int) (255.0f * f10 * this.h));
            si0 si0Var4 = this.d;
            si0Var4.f32470t = this.f13037f;
            si0Var4.a(canvas);
        }
    }

    public final void c(CharSequence charSequence, boolean z10) {
        ValueAnimator valueAnimator = this.f13040s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f13040s = null;
        }
        TextView[] textViewArr = this.f13035c;
        if (!z10) {
            textViewArr[0].setVisibility(0);
            textViewArr[0].setAlpha(1.0f);
            textViewArr[0].setText(charSequence);
            textViewArr[1].setVisibility(8);
            textViewArr[1].setAlpha(0.0f);
            return;
        }
        textViewArr[1].setOnClickListener(null);
        textViewArr[1].setText(textViewArr[0].getText());
        textViewArr[1].setVisibility(0);
        textViewArr[1].setAlpha(1.0f);
        textViewArr[1].setTranslationY(0.0f);
        textViewArr[0].setText(charSequence);
        textViewArr[0].setVisibility(0);
        textViewArr[0].setAlpha(0.0f);
        textViewArr[0].setTranslationY(-AndroidUtilities.dp(4.0f));
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f13040s = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ag.u(this, 21));
        this.f13040s.addListener(new ag.r1(this, 16));
        this.f13040s.setInterpolator(er.h);
        this.f13040s.setDuration(340L);
        this.f13040s.start();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    public void setOnSubtitleClick(View.OnClickListener onClickListener) {
        TextView[] textViewArr = this.f13035c;
        textViewArr[0].setOnClickListener(onClickListener);
        textViewArr[0].setClickable(onClickListener != null);
        textViewArr[0].setBackground(onClickListener == null ? null : org.telegram.ui.ActionBar.g6.f0(822083583, 7, -1));
    }

    public void setSubtitle(CharSequence charSequence) {
        c(charSequence, false);
    }
}
