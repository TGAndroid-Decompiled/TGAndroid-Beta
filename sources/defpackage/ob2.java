package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
public final class ob2 extends View implements tjb {
    public final f6c a;
    public final wjb b;
    public int c;
    public int d;
    public bb2 e;
    public float f;
    public int h;

    public ob2(Context context, wjb wjbVar) {
        super(context);
        this.b = wjbVar;
        f6c f6cVar = new f6c();
        this.a = f6cVar;
        f6cVar.setCallback(this);
        f6cVar.n = k96.M0(2131743588, null);
        f6cVar.o = k96.M0(2131743589, null);
        f6cVar.p = k96.M0(2131743587, null);
        f6cVar.j = new hq1(this, (byte) 21);
    }

    public final void a(Canvas canvas) {
        Paint paint;
        boolean b1;
        wjb wjbVar = this.b;
        if (wjbVar != null) {
            wjbVar.b(0.0f, this.f, getMeasuredWidth(), this.h);
        } else {
            bkb.q(0.0f, this.f, getMeasuredWidth(), this.h);
        }
        float L = gl.L(18.0f);
        float L2 = gl.L(6.0f);
        float L3 = gl.L(18.0f) + this.c;
        float L4 = gl.L(6.0f) + this.d;
        float L5 = gl.L(18.0f);
        float L6 = gl.L(18.0f);
        if (wjbVar != null) {
            paint = wjbVar.d("paintChatActionBackground");
        } else {
            paint = null;
        }
        if (paint == null) {
            paint = bkb.T0("paintChatActionBackground");
        }
        canvas.drawRoundRect(L, L2, L3, L4, L5, L6, paint);
        if (wjbVar != null) {
            b1 = wjbVar.g();
        } else {
            b1 = bkb.b1();
        }
        if (b1) {
            canvas.drawRoundRect(gl.L(18.0f), gl.L(6.0f), gl.L(18.0f) + this.c, gl.L(6.0f) + this.d, gl.L(18.0f), gl.L(18.0f), bkb.g2);
        }
    }

    public final void b(float f, int i) {
        this.f = f;
        this.h = i;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        f6c f6cVar = this.a;
        f6cVar.setBounds(gl.L(18.0f), gl.L(6.0f), gl.L(18.0f) + this.c, gl.L(6.0f) + this.d);
        f6cVar.draw(canvas);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int L = size - gl.L(36.0f);
        this.c = L;
        int a = this.a.a(L);
        this.d = a;
        setMeasuredDimension(size, gl.L(12.0f) + a);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.a.i.a(this, motionEvent);
    }

    public void setDelegate(bb2 bb2Var) {
        this.e = bb2Var;
    }

    @Override
    public final void updateColors() {
        this.a.b();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.a) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
