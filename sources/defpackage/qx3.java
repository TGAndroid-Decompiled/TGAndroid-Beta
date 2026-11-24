package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
public final class qx3 extends View {
    public final ylb E;
    public jac F;
    public int G;
    public boolean H;
    public long I;
    public boolean J;
    public final int a;
    public final Drawable[] b;
    public final Drawable c;
    public final Drawable d;
    public String e;
    public boolean f;
    public int h;
    public final int[] n;
    public final int[] r;
    public final Paint s;
    public final RectF w;
    public final ln x;
    public final ln y;

    public qx3(Context context, ylb ylbVar) {
        super(context);
        float f;
        if (gm.O1()) {
            f = 40.0f;
        } else {
            f = 32.0f;
        }
        this.a = gm.L(f);
        this.b = new Drawable[11];
        this.n = new int[]{0, 0};
        this.r = new int[]{0, 0};
        this.s = new Paint(1);
        this.w = new RectF();
        d53 d53Var = d53.h;
        this.x = new ln(125L, this, d53Var);
        this.y = new ln(125L, this, d53Var);
        this.G = -1;
        this.H = true;
        this.E = ylbVar;
        this.c = getResources().getDrawable(2131232773);
        this.d = getResources().getDrawable(2131232774);
        a();
    }

    public final void a() {
        int i = cmb.g5;
        ylb ylbVar = this.E;
        cmb.A1(cmb.v0(i, ylbVar), this.c);
        cmb.A1(cmb.v0(i, ylbVar), this.d);
        bs2.b.setColorFilter(new PorterDuffColorFilter(cmb.v0(cmb.Df, ylbVar), PorterDuff.Mode.SRC_IN));
    }

    public String getEmoji() {
        return this.e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L;
        ln lnVar;
        float f;
        int L2;
        int U1;
        qx3 qx3Var = this;
        int measuredWidth = qx3Var.getMeasuredWidth();
        int measuredHeight = qx3Var.getMeasuredHeight() - gm.L(2.0f);
        Drawable drawable = qx3Var.c;
        boolean z = false;
        drawable.setBounds(0, 0, measuredWidth, measuredHeight);
        drawable.draw(canvas);
        int L3 = qx3Var.h - gm.L(9.0f);
        int measuredHeight2 = qx3Var.getMeasuredHeight() - gm.L(6.34f);
        int L4 = gm.L(9.0f) + qx3Var.h;
        int measuredHeight3 = qx3Var.getMeasuredHeight();
        Drawable drawable2 = qx3Var.d;
        drawable2.setBounds(L3, measuredHeight2, L4, measuredHeight3);
        drawable2.draw(canvas);
        if (qx3Var.e != null) {
            boolean z2 = qx3Var.f;
            ylb ylbVar = qx3Var.E;
            int[] iArr = qx3Var.n;
            ln lnVar2 = qx3Var.x;
            Paint paint = qx3Var.s;
            Drawable[] drawableArr = qx3Var.b;
            RectF rectF = qx3Var.w;
            float f2 = 1.0f;
            int i = qx3Var.a;
            if (z2) {
                int i2 = 0;
                while (i2 < 2) {
                    if (i2 == 0) {
                        lnVar = lnVar2;
                    } else {
                        lnVar = qx3Var.y;
                    }
                    float e = lnVar.e(z, iArr[i2]);
                    boolean z3 = z;
                    float max = Math.max(0.0f, Math.min(f2, -e));
                    rectF.set((int) ((i * (e + f2)) + gm.L((f * 4.0f) + (Math.max(0.0f, Math.min(f2, f)) * 3.0f) + 5.0f)), gm.U1(max, ((gm.L(f2) + i) * i2) + gm.L(3.0f), (qx3Var.getMeasuredHeight() - i) / 2), L2 + i, U1 + i);
                    rectF.inset(gm.L(-2.0f), gm.L(max * (-2.0f)));
                    paint.setColor(cmb.p1(gm.R1(f2, 0.5f, max), cmb.v0(cmb.h6, ylbVar)));
                    canvas.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint);
                    int i3 = z3;
                    while (i3 < 5) {
                        i3++;
                        int i4 = (i2 * 5) + i3;
                        int L5 = gm.L((i3 << 2) + 8) + (i * i3);
                        int L6 = ((gm.L(f2) + i) * i2) + gm.L(3.0f);
                        drawableArr[i4].setBounds(L5, L6, L5 + i, L6 + i);
                        drawableArr[i4].draw(canvas);
                        f2 = f2;
                    }
                    i2++;
                    qx3Var = this;
                    z = z3;
                }
                boolean z4 = z;
                drawableArr[z4 ? 1 : 0].setBounds(gm.L(5.0f), (getMeasuredHeight() - i) / 2, gm.L(5.0f) + i, (getMeasuredHeight() + i) / 2);
                drawableArr[z4 ? 1 : 0].draw(canvas);
                canvas.drawRect(gm.L(8.45f) + i, gm.L(2.0f), hg9.v(8.45f, i, 1), getMeasuredHeight() - gm.L(6.0f), cmb.j0);
                return;
            }
            float e2 = lnVar2.e(false, iArr[0]);
            float f3 = i;
            int L7 = gm.L(5.0f);
            float f4 = L7;
            int i5 = L7 + i;
            rectF.set((int) ((f3 * e2) + gm.L((e2 * 4.0f) + 5.0f)), f4, L + i, i5);
            rectF.inset(gm.L(-2.0f), gm.L(-2.0f));
            paint.setColor(cmb.v0(cmb.h6, ylbVar));
            canvas.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint);
            for (int i6 = 0; i6 < 6; i6++) {
                Drawable drawable3 = drawableArr[i6];
                if (drawable3 != null) {
                    int L8 = gm.L((i6 << 2) + 5) + (i * i6);
                    float min = ((1.0f - (Math.min(0.5f, Math.abs(i6 - e2)) * 2.0f)) * 0.1f) + 0.9f;
                    canvas.save();
                    float f5 = f3 / 2.0f;
                    canvas.scale(min, min, L8 + f5, f5 + f4);
                    drawable3.setBounds(L8, L7, L8 + i, i5);
                    drawable3.draw(canvas);
                    canvas.restore();
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int i;
        int i2;
        boolean z2;
        int i3;
        if (this.J) {
            this.J = false;
            return false;
        } else if (!this.f) {
            return super.onTouchEvent(motionEvent);
        } else {
            int i4 = 0;
            while (true) {
                Drawable[] drawableArr = this.b;
                if (i4 < drawableArr.length) {
                    if (drawableArr[i4].getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY()) || ((i3 = this.G) != -1 && ((i4 == 0 || ((i3 == 0 && i4 >= 1 && i4 <= 5) || (i3 == 1 && i4 >= 6 && i4 <= 10))) && ((int) motionEvent.getX()) >= drawableArr[i4].getBounds().left && ((int) motionEvent.getX()) <= drawableArr[i4].getBounds().right))) {
                        break;
                    }
                    i4++;
                } else {
                    i4 = -1;
                    break;
                }
            }
            if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2 && motionEvent.getAction() != 1) {
                return false;
            }
            int action = motionEvent.getAction();
            int[] iArr = this.n;
            if (action == 0) {
                this.G = -1;
                this.I = System.currentTimeMillis();
                if (iArr[0] == iArr[1]) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.H = z2;
            }
            int i5 = iArr[0];
            int[] iArr2 = this.r;
            iArr2[0] = i5;
            iArr2[1] = iArr[1];
            if (System.currentTimeMillis() - this.I > 300 && motionEvent.getAction() == 2) {
                z = true;
            } else {
                z = false;
            }
            if (i4 == 0) {
                iArr[0] = -1;
                iArr[1] = -1;
            } else if (i4 >= 1 && i4 <= 5 && ((i2 = this.G) == -1 || i2 == 0)) {
                this.G = 0;
                int i6 = i4 - 1;
                iArr[0] = i6;
                if (iArr[1] == -1 || (this.H && z)) {
                    iArr[1] = i6;
                }
            } else if (i4 >= 6 && i4 <= 10 && ((i = this.G) == -1 || i == 1)) {
                this.G = 1;
                int i7 = i4 - 6;
                iArr[1] = i7;
                if (iArr[0] == -1 || (this.H && z)) {
                    iArr[0] = i7;
                }
            }
            if (iArr2[0] != iArr[0] || iArr2[1] != iArr[1]) {
                gm.W3(this);
                jac jacVar = this.F;
                if (jacVar != null) {
                    jacVar.a(Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]));
                }
            }
            invalidate();
            if (motionEvent.getAction() == 1) {
                this.G = -1;
            }
            return true;
        }
    }

    public void setArrowX(int i) {
        this.h = i;
        invalidate();
    }

    public void setOnSelectionUpdateListener(jac jacVar) {
        this.F = jacVar;
    }
}
