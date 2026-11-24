package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
public final class zc2 extends View implements vlb {
    public final g8c a;
    public final ylb b;
    public int c;
    public int d;
    public mc2 e;
    public float f;
    public int h;

    public zc2(Context context, ylb ylbVar) {
        super(context);
        this.b = ylbVar;
        g8c g8cVar = new g8c();
        this.a = g8cVar;
        g8cVar.setCallback(this);
        g8cVar.n = jb6.M0(2131743514, null);
        g8cVar.o = jb6.M0(2131743515, null);
        g8cVar.p = jb6.M0(2131743513, null);
        g8cVar.j = new fo1(this, (byte) 26);
    }

    public final void a(Canvas canvas) {
        Paint paint;
        boolean b1;
        ylb ylbVar = this.b;
        if (ylbVar != null) {
            ylbVar.b(0.0f, this.f, getMeasuredWidth(), this.h);
        } else {
            cmb.q(0.0f, this.f, getMeasuredWidth(), this.h);
        }
        float L = gm.L(18.0f);
        float L2 = gm.L(6.0f);
        float L3 = gm.L(18.0f) + this.c;
        float L4 = gm.L(6.0f) + this.d;
        float L5 = gm.L(18.0f);
        float L6 = gm.L(18.0f);
        if (ylbVar != null) {
            paint = ylbVar.d("paintChatActionBackground");
        } else {
            paint = null;
        }
        if (paint == null) {
            paint = cmb.T0("paintChatActionBackground");
        }
        canvas.drawRoundRect(L, L2, L3, L4, L5, L6, paint);
        if (ylbVar != null) {
            b1 = ylbVar.g();
        } else {
            b1 = cmb.b1();
        }
        if (b1) {
            canvas.drawRoundRect(gm.L(18.0f), gm.L(6.0f), gm.L(18.0f) + this.c, gm.L(6.0f) + this.d, gm.L(18.0f), gm.L(18.0f), cmb.g2);
        }
    }

    public final void b(float f, int i) {
        this.f = f;
        this.h = i;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        g8c g8cVar = this.a;
        g8cVar.setBounds(gm.L(18.0f), gm.L(6.0f), gm.L(18.0f) + this.c, gm.L(6.0f) + this.d);
        g8cVar.draw(canvas);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int L = size - gm.L(36.0f);
        this.c = L;
        int a = this.a.a(L);
        this.d = a;
        setMeasuredDimension(size, gm.L(12.0f) + a);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.a.i.a(this, motionEvent);
    }

    public void setDelegate(mc2 mc2Var) {
        this.e = mc2Var;
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
