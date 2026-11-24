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
public final class fw3 extends View {
    public final wjb E;
    public i8c F;
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
    public final lm x;
    public final lm y;

    public fw3(Context context, wjb wjbVar) {
        super(context);
        float f;
        if (gl.O1()) {
            f = 40.0f;
        } else {
            f = 32.0f;
        }
        this.a = gl.L(f);
        this.b = new Drawable[11];
        this.n = new int[]{0, 0};
        this.r = new int[]{0, 0};
        this.s = new Paint(1);
        this.w = new RectF();
        s33 s33Var = s33.h;
        this.x = new lm(125L, this, s33Var);
        this.y = new lm(125L, this, s33Var);
        this.G = -1;
        this.H = true;
        this.E = wjbVar;
        this.c = getResources().getDrawable(2131232761);
        this.d = getResources().getDrawable(2131232762);
        a();
    }

    public final void a() {
        int i = bkb.g5;
        wjb wjbVar = this.E;
        bkb.A1(bkb.v0(i, wjbVar), this.c);
        bkb.A1(bkb.v0(i, wjbVar), this.d);
        qq2.b.setColorFilter(new PorterDuffColorFilter(bkb.v0(bkb.Df, wjbVar), PorterDuff.Mode.SRC_IN));
    }

    public String getEmoji() {
        return this.e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L;
        lm lmVar;
        float f;
        int L2;
        int U1;
        fw3 fw3Var = this;
        int measuredWidth = fw3Var.getMeasuredWidth();
        int measuredHeight = fw3Var.getMeasuredHeight() - gl.L(2.0f);
        Drawable drawable = fw3Var.c;
        boolean z = false;
        drawable.setBounds(0, 0, measuredWidth, measuredHeight);
        drawable.draw(canvas);
        int L3 = fw3Var.h - gl.L(9.0f);
        int measuredHeight2 = fw3Var.getMeasuredHeight() - gl.L(6.34f);
        int L4 = gl.L(9.0f) + fw3Var.h;
        int measuredHeight3 = fw3Var.getMeasuredHeight();
        Drawable drawable2 = fw3Var.d;
        drawable2.setBounds(L3, measuredHeight2, L4, measuredHeight3);
        drawable2.draw(canvas);
        if (fw3Var.e != null) {
            boolean z2 = fw3Var.f;
            wjb wjbVar = fw3Var.E;
            int[] iArr = fw3Var.n;
            lm lmVar2 = fw3Var.x;
            Paint paint = fw3Var.s;
            Drawable[] drawableArr = fw3Var.b;
            RectF rectF = fw3Var.w;
            float f2 = 1.0f;
            int i = fw3Var.a;
            if (z2) {
                int i2 = 0;
                while (i2 < 2) {
                    if (i2 == 0) {
                        lmVar = lmVar2;
                    } else {
                        lmVar = fw3Var.y;
                    }
                    float e = lmVar.e(z, iArr[i2]);
                    boolean z3 = z;
                    float max = Math.max(0.0f, Math.min(f2, -e));
                    rectF.set((int) ((i * (e + f2)) + gl.L((f * 4.0f) + (Math.max(0.0f, Math.min(f2, f)) * 3.0f) + 5.0f)), gl.U1(max, ((gl.L(f2) + i) * i2) + gl.L(3.0f), (fw3Var.getMeasuredHeight() - i) / 2), L2 + i, U1 + i);
                    rectF.inset(gl.L(-2.0f), gl.L(max * (-2.0f)));
                    paint.setColor(bkb.p1(gl.R1(f2, 0.5f, max), bkb.v0(bkb.h6, wjbVar)));
                    canvas.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint);
                    int i3 = z3;
                    while (i3 < 5) {
                        i3++;
                        int i4 = (i2 * 5) + i3;
                        int L5 = gl.L((i3 << 2) + 8) + (i * i3);
                        int L6 = ((gl.L(f2) + i) * i2) + gl.L(3.0f);
                        drawableArr[i4].setBounds(L5, L6, L5 + i, L6 + i);
                        drawableArr[i4].draw(canvas);
                        f2 = f2;
                    }
                    i2++;
                    fw3Var = this;
                    z = z3;
                }
                boolean z4 = z;
                drawableArr[z4 ? 1 : 0].setBounds(gl.L(5.0f), (getMeasuredHeight() - i) / 2, gl.L(5.0f) + i, (getMeasuredHeight() + i) / 2);
                drawableArr[z4 ? 1 : 0].draw(canvas);
                canvas.drawRect(gl.L(8.45f) + i, gl.L(2.0f), de9.w(8.45f, i, 1), getMeasuredHeight() - gl.L(6.0f), bkb.j0);
                return;
            }
            float e2 = lmVar2.e(false, iArr[0]);
            float f3 = i;
            int L7 = gl.L(5.0f);
            float f4 = L7;
            int i5 = L7 + i;
            rectF.set((int) ((f3 * e2) + gl.L((e2 * 4.0f) + 5.0f)), f4, L + i, i5);
            rectF.inset(gl.L(-2.0f), gl.L(-2.0f));
            paint.setColor(bkb.v0(bkb.h6, wjbVar));
            canvas.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint);
            for (int i6 = 0; i6 < 6; i6++) {
                Drawable drawable3 = drawableArr[i6];
                if (drawable3 != null) {
                    int L8 = gl.L((i6 << 2) + 5) + (i * i6);
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
                gl.X3(this);
                i8c i8cVar = this.F;
                if (i8cVar != null) {
                    i8cVar.a(Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]));
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

    public void setOnSelectionUpdateListener(i8c i8cVar) {
        this.F = i8cVar;
    }
}
