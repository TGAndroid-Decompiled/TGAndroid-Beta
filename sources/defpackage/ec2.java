package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
public final class ec2 extends View implements snb {
    public final fac a;
    public final vnb b;
    public int c;
    public int d;
    public rb2 e;
    public float f;
    public int h;

    public ec2(Context context, vnb vnbVar) {
        super(context);
        this.b = vnbVar;
        fac facVar = new fac();
        this.a = facVar;
        facVar.setCallback(this);
        facVar.n = ob6.M0(2131743482, null);
        facVar.o = ob6.M0(2131743483, null);
        facVar.p = ob6.M0(2131743481, null);
        facVar.j = new go1(this, (byte) 27);
    }

    public final void a(Canvas canvas) {
        Paint paint;
        boolean b1;
        vnb vnbVar = this.b;
        if (vnbVar != null) {
            vnbVar.b(0.0f, this.f, getMeasuredWidth(), this.h);
        } else {
            aob.q(0.0f, this.f, getMeasuredWidth(), this.h);
        }
        float L = hl.L(18.0f);
        float L2 = hl.L(6.0f);
        float L3 = hl.L(18.0f) + this.c;
        float L4 = hl.L(6.0f) + this.d;
        float L5 = hl.L(18.0f);
        float L6 = hl.L(18.0f);
        if (vnbVar != null) {
            paint = vnbVar.d("paintChatActionBackground");
        } else {
            paint = null;
        }
        if (paint == null) {
            paint = aob.T0("paintChatActionBackground");
        }
        canvas.drawRoundRect(L, L2, L3, L4, L5, L6, paint);
        if (vnbVar != null) {
            b1 = vnbVar.g();
        } else {
            b1 = aob.b1();
        }
        if (b1) {
            canvas.drawRoundRect(hl.L(18.0f), hl.L(6.0f), hl.L(18.0f) + this.c, hl.L(6.0f) + this.d, hl.L(18.0f), hl.L(18.0f), aob.h2);
        }
    }

    public final void b(float f, int i) {
        this.f = f;
        this.h = i;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        fac facVar = this.a;
        facVar.setBounds(hl.L(18.0f), hl.L(6.0f), hl.L(18.0f) + this.c, hl.L(6.0f) + this.d);
        facVar.draw(canvas);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int L = size - hl.L(36.0f);
        this.c = L;
        int a = this.a.a(L);
        this.d = a;
        setMeasuredDimension(size, hl.L(12.0f) + a);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.a.i.a(this, motionEvent);
    }

    public void setDelegate(rb2 rb2Var) {
        this.e = rb2Var;
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
