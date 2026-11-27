package defpackage;

import android.app.Activity;
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
public final class du9 extends View {
    public boolean E;
    public cu9 F;
    public gbb G;
    public Object H;
    public a39 I;
    public String J;
    public final int[] K;
    public final int[] L;
    public boolean M;
    public final int a;
    public final bab b;
    public dab c;
    public final mm d;
    public final RectF e;
    public final RectF f;
    public final ImageReceiver h;
    public boolean n;
    public pkb r;
    public pkb s;
    public final Path w;
    public final Paint x;
    public final v41 y;

    public du9(Activity activity, int i, bab babVar) {
        super(activity);
        this.d = new mm(this, 0L, 320L, k43.h);
        this.e = new RectF();
        this.f = new RectF();
        this.h = new ImageReceiver(this);
        this.w = new Path();
        this.x = new Paint(1);
        this.y = new v41(this);
        this.K = new int[2];
        this.L = new int[2];
        this.a = i;
        this.b = babVar;
    }

    public final void a() {
        cu9 cu9Var = this.F;
        if (cu9Var == null) {
            return;
        }
        this.r = new pkb(cu9Var.b(), 16.0f, hl.o());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.F.a());
        if (spannableStringBuilder.toString().contains(">")) {
            spannableStringBuilder.clear();
            spannableStringBuilder.append((CharSequence) hl.D2(this.F.a(), false));
        } else {
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) ">");
            wm2 wm2Var = new wm2(2131232713, 0);
            wm2Var.I = 1.25f;
            wm2Var.J = 1.25f;
            spannableStringBuilder.setSpan(wm2Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        this.s = new pkb(spannableStringBuilder, 14.0f, null);
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
        pkb pkbVar = this.r;
        if (pkbVar != null && this.s != null && d > 0.0f) {
            pkbVar.p = getWidth() * 0.7f;
            this.s.p = getWidth() * 0.7f;
            float L = hl.L(5.0f);
            float L2 = hl.L(10.0f);
            float L3 = hl.L(32.0f);
            float L4 = hl.L(2.0f);
            float L5 = hl.L(11.0f);
            float min = Math.min(hl.L(200.0f), getWidth() * 0.8f);
            if (this.n) {
                f = L5 + L3 + L5;
            } else {
                f = 0.0f;
            }
            float max = Math.max(min, Math.max(this.r.c, this.s.c) + f + L + hl.L(15.0f) + L);
            if (this.n) {
                f2 = L3;
            } else {
                f2 = 0.0f;
            }
            float max2 = Math.max(f2, this.s.h() + this.r.h() + L4) + L2 + L2;
            float R1 = hl.R1(0.6f, 1.0f, d) * this.y.a(0.05f);
            float L6 = (1.0f - d) * hl.L(15.0f);
            RectF rectF = this.e;
            rectF.set((getWidth() - max) / 2.0f, (getHeight() - max2) / 2.0f, (getWidth() + max) / 2.0f, (getHeight() + max2) / 2.0f);
            RectF rectF2 = this.f;
            rectF2.set(rectF);
            hl.e3(rectF2, R1, rectF2.centerX(), rectF2.centerY());
            rectF2.offset(0.0f, L6);
            int i = Build.VERSION.SDK_INT;
            Paint paint = this.x;
            if (i >= 29 && (obj = this.H) != null && this.G != null) {
                RenderNode g = rm0.g(obj);
                Path path = this.w;
                path.rewind();
                f4 = 2.0f;
                f3 = L;
                path.addRoundRect(rectF2, hl.L(12.0f), hl.L(12.0f), Path.Direction.CW);
                getLocationOnScreen(this.K);
                this.G.getLocationOnScreen(this.L);
                canvas.saveLayerAlpha(rectF2, (int) (255.0f * d), 31);
                canvas.clipPath(path);
                canvas.translate(iArr2[0] - iArr[0], iArr2[1] - iArr[1]);
                float max3 = Math.max(this.G.getWidth() / g.getWidth(), this.G.getHeight() / g.getHeight());
                canvas.scale(max3, max3);
                canvas.drawRenderNode(g);
                canvas.restore();
                paint.setColor(aob.p1(d, 1879048192));
                canvas.drawRoundRect(rectF2, hl.L(12.0f), hl.L(12.0f), paint);
            } else {
                f3 = L;
                f4 = 2.0f;
                paint.setColor(aob.p1(d, -587202560));
                canvas.drawRoundRect(rectF2, hl.L(12.0f), hl.L(12.0f), paint);
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
            pkb pkbVar2 = this.r;
            float f8 = rectF.left;
            if (this.n) {
                f5 = L5 + L3 + L5;
            } else {
                f5 = 0.0f;
            }
            pkbVar2.c(f8 + f5 + f3, (pkbVar2.h() / f4) + centerY, d, -1, canvas);
            pkb pkbVar3 = this.s;
            float f9 = rectF.left;
            if (this.n) {
                f6 = L3 + L5 + L5;
            }
            pkbVar3.c(f9 + f6 + f3, (this.s.h() / f4) + this.r.h() + centerY + L4, d, aob.v(-16777216, -1610612737), canvas);
            canvas.restore();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        dab dabVar;
        boolean z = this.E;
        v41 v41Var = this.y;
        if (z && this.F != null) {
            int action = motionEvent.getAction();
            RectF rectF = this.e;
            if (action == 0) {
                if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.M = true;
                    v41Var.c(true);
                }
            } else if (motionEvent.getAction() == 2) {
                if (v41Var.i && !rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                    v41Var.c(false);
                }
            } else if (motionEvent.getAction() == 1) {
                if (v41Var.i && (dabVar = this.c) != null && this.F != null) {
                    dabVar.a(new zt9(this, (byte) 1));
                }
                v41Var.c(false);
                this.M = false;
            } else if (motionEvent.getAction() == 3) {
                v41Var.c(false);
                this.M = false;
            }
            if (!this.M && !v41Var.i) {
                return false;
            }
            return true;
        }
        this.M = false;
        v41Var.c(false);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.du9.setLink(java.lang.String):void");
    }
}
