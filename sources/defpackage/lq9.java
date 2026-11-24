package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class lq9 extends View {
    public boolean E;
    public kq9 F;
    public h7b G;
    public Object H;
    public t79 I;
    public String J;
    public final int[] K;
    public final int[] L;
    public boolean M;
    public final int a;
    public final d6b b;
    public e6b c;
    public final lm d;
    public final RectF e;
    public final RectF f;
    public final ImageReceiver h;
    public boolean n;
    public tgb r;
    public tgb s;
    public final Path w;
    public final Paint x;
    public final n41 y;

    public lq9(Context context, int i, d6b d6bVar) {
        super(context);
        this.d = new lm(this, 0L, 320L, s33.h);
        this.e = new RectF();
        this.f = new RectF();
        this.h = new ImageReceiver(this);
        this.w = new Path();
        this.x = new Paint(1);
        this.y = new n41(this);
        this.K = new int[2];
        this.L = new int[2];
        this.a = i;
        this.b = d6bVar;
    }

    public final void a() {
        kq9 kq9Var = this.F;
        if (kq9Var == null) {
            return;
        }
        this.r = new tgb(kq9Var.b(), 16.0f, gl.o());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.F.a());
        if (spannableStringBuilder.toString().contains(">")) {
            spannableStringBuilder.clear();
            spannableStringBuilder.append((CharSequence) gl.D2(this.F.a(), false));
        } else {
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) ">");
            cm2 cm2Var = new cm2(2131232702, 0);
            cm2Var.I = 1.25f;
            cm2Var.J = 1.25f;
            spannableStringBuilder.setSpan(cm2Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        this.s = new tgb(spannableStringBuilder, 14.0f, null);
        this.F.d(this.h);
        this.n = true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        Object obj;
        int[] iArr;
        int[] iArr2;
        float d = this.d.d(this.E);
        tgb tgbVar = this.r;
        if (tgbVar != null && this.s != null && d > 0.0f) {
            tgbVar.p = getWidth() * 0.7f;
            this.s.p = getWidth() * 0.7f;
            float L = gl.L(5.0f);
            float L2 = gl.L(10.0f);
            float L3 = gl.L(32.0f);
            float L4 = gl.L(2.0f);
            float L5 = gl.L(11.0f);
            float min = Math.min(gl.L(200.0f), getWidth() * 0.8f);
            if (this.n) {
                f = L5 + L3 + L5;
            } else {
                f = 0.0f;
            }
            float max = Math.max(min, Math.max(this.r.c, this.s.c) + f + L + gl.L(15.0f) + L);
            if (this.n) {
                f2 = L3;
            } else {
                f2 = 0.0f;
            }
            float max2 = Math.max(f2, this.s.h() + this.r.h() + L4) + L2 + L2;
            float R1 = gl.R1(0.6f, 1.0f, d) * this.y.a(0.05f);
            float L6 = (1.0f - d) * gl.L(15.0f);
            RectF rectF = this.e;
            rectF.set((getWidth() - max) / 2.0f, (getHeight() - max2) / 2.0f, (getWidth() + max) / 2.0f, (getHeight() + max2) / 2.0f);
            RectF rectF2 = this.f;
            rectF2.set(rectF);
            gl.e3(rectF2, R1, rectF2.centerX(), rectF2.centerY());
            rectF2.offset(0.0f, L6);
            int i = Build.VERSION.SDK_INT;
            Paint paint = this.x;
            if (i >= 29 && (obj = this.H) != null && this.G != null) {
                RenderNode e = qm0.e(obj);
                Path path = this.w;
                path.rewind();
                f4 = 2.0f;
                f3 = L;
                path.addRoundRect(rectF2, gl.L(12.0f), gl.L(12.0f), Path.Direction.CW);
                getLocationOnScreen(this.K);
                this.G.getLocationOnScreen(this.L);
                canvas.saveLayerAlpha(rectF2, (int) (255.0f * d), 31);
                canvas.clipPath(path);
                canvas.translate(iArr2[0] - iArr[0], iArr2[1] - iArr[1]);
                float max3 = Math.max(this.G.getWidth() / e.getWidth(), this.G.getHeight() / e.getHeight());
                canvas.scale(max3, max3);
                canvas.drawRenderNode(e);
                canvas.restore();
                paint.setColor(bkb.p1(d, 1879048192));
                canvas.drawRoundRect(rectF2, gl.L(12.0f), gl.L(12.0f), paint);
            } else {
                f3 = L;
                f4 = 2.0f;
                paint.setColor(bkb.p1(d, -587202560));
                canvas.drawRoundRect(rectF2, gl.L(12.0f), gl.L(12.0f), paint);
            }
            canvas.save();
            float f6 = 0.0f;
            canvas.translate(0.0f, L6);
            canvas.scale(R1, R1, rectF.centerX(), rectF.centerY());
            if (this.n) {
                float f7 = L3 / f4;
                ImageReceiver imageReceiver = this.h;
                imageReceiver.q0((int) f7);
                imageReceiver.i0(rectF.left + f3 + L5, rectF.centerY() - f7, L3, L3);
                imageReceiver.setAlpha(d);
                imageReceiver.h(canvas, null);
            }
            float centerY = rectF.centerY() - ((this.s.h() + (this.r.h() + L4)) / f4);
            tgb tgbVar2 = this.r;
            float f8 = rectF.left;
            if (this.n) {
                f5 = L5 + L3 + L5;
            } else {
                f5 = 0.0f;
            }
            tgbVar2.c(f8 + f5 + f3, (tgbVar2.h() / f4) + centerY, d, -1, canvas);
            tgb tgbVar3 = this.s;
            float f9 = rectF.left;
            if (this.n) {
                f6 = L3 + L5 + L5;
            }
            tgbVar3.c(f9 + f6 + f3, (this.s.h() / f4) + this.r.h() + centerY + L4, d, bkb.v(-16777216, -1610612737), canvas);
            canvas.restore();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        e6b e6bVar;
        boolean z = this.E;
        n41 n41Var = this.y;
        if (z && this.F != null) {
            int action = motionEvent.getAction();
            RectF rectF = this.e;
            if (action == 0) {
                if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.M = true;
                    n41Var.c(true);
                }
            } else if (motionEvent.getAction() == 2) {
                if (n41Var.i && !rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                    n41Var.c(false);
                }
            } else if (motionEvent.getAction() == 1) {
                if (n41Var.i && (e6bVar = this.c) != null && this.F != null) {
                    e6bVar.a(new hq9(this, (byte) 1));
                }
                n41Var.c(false);
                this.M = false;
            } else if (motionEvent.getAction() == 3) {
                n41Var.c(false);
                this.M = false;
            }
            if (!this.M && !n41Var.i) {
                return false;
            }
            return true;
        }
        this.M = false;
        n41Var.c(false);
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.h.I();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h.K();
    }

    public void setLink(java.lang.String r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lq9.setLink(java.lang.String):void");
    }
}
