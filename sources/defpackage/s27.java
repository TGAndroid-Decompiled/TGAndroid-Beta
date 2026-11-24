package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class s27 extends FrameLayout implements tjb {
    public final wjb a;
    public final gn b;
    public final gn c;

    public s27(Context context, wjb wjbVar) {
        super(context);
        this.a = wjbVar;
        gn gnVar = new gn(true, true, true);
        this.b = gnVar;
        s33 s33Var = s33.h;
        gnVar.n(0.3f, 430L, s33Var);
        gnVar.x(gl.o());
        gnVar.u(bkb.v0(bkb.z8, wjbVar));
        gnVar.w(gl.L(18.0f));
        gnVar.q(!k96.a0);
        gnVar.setCallback(this);
        Point point = gl.q;
        gnVar.N = point.x;
        gn gnVar2 = new gn(true, true, true);
        this.c = gnVar2;
        gnVar2.n(0.3f, 430L, s33Var);
        gnVar2.u(bkb.v0(bkb.A8, wjbVar));
        gnVar2.w(gl.L(14.0f));
        gnVar2.q(!k96.a0);
        gnVar2.setCallback(this);
        gnVar2.N = point.x;
    }

    public final void a(CharSequence charSequence, boolean z) {
        boolean z2;
        if (z && !k96.a0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.c.t(charSequence, z2, true);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.A8));
    }

    public final void b(CharSequence charSequence, boolean z) {
        boolean z2;
        if (z && !k96.a0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.b.t(charSequence, z2, true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int L = gl.L(29.0f);
        int L2 = gl.L(18.83f);
        gn gnVar = this.c;
        int paddingLeft = getPaddingLeft();
        int L3 = r0 - gl.L(32.0f);
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        int L4 = gl.L(32.0f) + r0;
        gn gnVar2 = this.b;
        gnVar2.setBounds(paddingLeft, L3, measuredWidth, L4);
        gnVar2.draw(canvas);
        gnVar.setBounds(getPaddingLeft(), r0 - gl.L(32.0f), getMeasuredWidth() - getPaddingRight(), gl.L(32.0f) + r0);
        gnVar.draw(canvas);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(56.0f), 1073741824));
        setPadding(gl.L(18.0f), 0, gl.L(18.0f), 0);
    }

    @Override
    public final void updateColors() {
        try {
            gn gnVar = this.b;
            wjb wjbVar = this.a;
            if (gnVar != null) {
                gnVar.u(bkb.v0(bkb.z8, wjbVar));
            }
            gn gnVar2 = this.c;
            if (gnVar2 != null) {
                gnVar2.u(bkb.v0(bkb.A8, wjbVar));
            }
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.b != drawable && this.c != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
