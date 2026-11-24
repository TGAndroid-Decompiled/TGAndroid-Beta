package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
public final class j37 extends View implements tjb {
    public final ArrayList a;
    public float b;
    public final wjb c;
    public final Paint d;
    public int e;
    public int f;
    public Drawable h;
    public float n;
    public float r;
    public final RectF s;
    public p8c w;

    public j37(Context context, wjb wjbVar) {
        super(context);
        this.a = new ArrayList();
        this.d = new Paint(1);
        this.n = gl.L(14.0f);
        this.r = gl.L(0.0f);
        this.s = new RectF();
        this.c = wjbVar;
        b();
    }

    public final void a(int i, String str) {
        this.a.add(new i37(i, str));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.De));
    }

    public final void b() {
        int[] iArr;
        boolean o = bkb.I.o();
        Paint paint = this.d;
        if (o) {
            this.e = -1862270977;
            this.f = -1325400065;
            paint.setColor(285212671);
            return;
        }
        int i = bkb.De;
        wjb wjbVar = this.c;
        int v0 = bkb.v0(i, wjbVar);
        if ((wjbVar instanceof ku1) && (((ku1) wjbVar).l() instanceof ye7) && (iArr = ((ye7) ((ku1) wjbVar).l()).a) != null) {
            v0 = gl.w0(gl.w0(iArr[0], iArr[1]), gl.w0(iArr[2], iArr[3]));
        }
        this.e = bkb.b(-1606201797, v0);
        this.f = bkb.b(-448573893, v0);
        paint.setColor(bkb.b(814980216, v0));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z;
        ArrayList arrayList = this.a;
        boolean z2 = true;
        if (arrayList.size() > 1) {
            float f = this.b;
            double d = f;
            int floor = (int) Math.floor(d);
            if (floor >= 0 && floor < arrayList.size()) {
                z = true;
            } else {
                z = false;
            }
            int ceil = (int) Math.ceil(d);
            z2 = (ceil < 0 || ceil >= arrayList.size()) ? false : false;
            RectF rectF = this.s;
            if (z) {
                if (z2) {
                    gl.X1(((i37) arrayList.get(floor)).c, ((i37) arrayList.get(ceil)).c, f - floor, rectF);
                } else {
                    rectF.set(((i37) arrayList.get(floor)).c);
                }
            } else if (z2) {
                rectF.set(((i37) arrayList.get(ceil)).c);
            }
            Drawable drawable = this.h;
            if (drawable != null) {
                drawable.draw(canvas);
            }
            if (z || z2) {
                canvas.drawRoundRect(rectF, gl.L(13.0f), gl.L(13.0f), this.d);
            }
            for (int i = 0; i < arrayList.size(); i++) {
                i37 i37Var = (i37) arrayList.get(i);
                i37Var.b.c(i37Var.c.left + this.n, getMeasuredHeight() / 2.0f, 1.0f, bm2.f(1.0f - Math.abs(f - i), this.e, this.f), canvas);
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        byte b;
        p8c p8cVar;
        ArrayList arrayList = this.a;
        if (arrayList.size() > 1) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int i = 0;
            while (true) {
                if (i < arrayList.size()) {
                    if (((i37) arrayList.get(i)).d.contains(x, y)) {
                        b = ((i37) arrayList.get(i)).a;
                        break;
                    }
                    i++;
                } else {
                    b = -1;
                    break;
                }
            }
            if (motionEvent.getAction() == 0) {
                if (b != -1) {
                    return true;
                }
            } else if (motionEvent.getAction() == 1 && b != -1 && (p8cVar = this.w) != null) {
                p8cVar.a(Integer.valueOf(b));
            }
        }
        return false;
    }

    public int getColor() {
        return this.e;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        ArrayList arrayList;
        super.onMeasure(i, i2);
        this.n = gl.L(14.0f);
        float f = 0.0f;
        this.r = gl.L(0.0f);
        int i3 = 0;
        while (true) {
            arrayList = this.a;
            if (i3 >= arrayList.size()) {
                break;
            }
            if (i3 > 0) {
                f += this.r;
            }
            f += ((i37) arrayList.get(i3)).b.j() + this.n + this.n;
            i3++;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float L = (measuredHeight - gl.L(26.0f)) / 2.0f;
        float L2 = (gl.L(26.0f) + measuredHeight) / 2.0f;
        float f2 = measuredWidth;
        float f3 = (f2 - f) / 2.0f;
        float f4 = f3;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            float j = ((i37) arrayList.get(i4)).b.j() + this.n + this.n;
            ((i37) arrayList.get(i4)).c.set(f4, L, f4 + j, L2);
            ((i37) arrayList.get(i4)).d.set(((i37) arrayList.get(i4)).c);
            ((i37) arrayList.get(i4)).d.inset((-this.r) / 2.0f, -L);
            f4 += j + this.r;
        }
        Drawable drawable = this.h;
        if (drawable != null) {
            Rect rect = gl.Q;
            drawable.getPadding(rect);
            int i5 = measuredHeight / 2;
            this.h.setBounds((((int) f3) - gl.L(3.0f)) - rect.left, (i5 - gl.L(16.0f)) - rect.top, gl.L(3.0f) + ((int) ((f2 + f) / 2.0f)) + rect.right, gl.L(16.0f) + i5 + rect.bottom);
        }
    }

    @Override
    public void setBackground(Drawable drawable) {
        this.h = drawable;
    }

    public void setOnTabClick(p8c p8cVar) {
        this.w = p8cVar;
    }

    public void setSelectedTab(float f) {
        this.b = f;
        invalidate();
    }

    @Override
    public final void updateColors() {
        try {
            b();
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
