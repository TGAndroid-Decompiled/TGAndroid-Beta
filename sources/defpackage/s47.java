package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class s47 extends FrameLayout implements vlb {
    public final ylb a;
    public final ho b;
    public final ho c;

    public s47(Context context, ylb ylbVar) {
        super(context);
        this.a = ylbVar;
        ho hoVar = new ho(true, true, true);
        this.b = hoVar;
        d53 d53Var = d53.h;
        hoVar.n(0.3f, 430L, d53Var);
        hoVar.x(gm.o());
        hoVar.u(cmb.v0(cmb.z8, ylbVar));
        hoVar.w(gm.L(18.0f));
        hoVar.q(!jb6.a0);
        hoVar.setCallback(this);
        Point point = gm.q;
        hoVar.N = point.x;
        ho hoVar2 = new ho(true, true, true);
        this.c = hoVar2;
        hoVar2.n(0.3f, 430L, d53Var);
        hoVar2.u(cmb.v0(cmb.A8, ylbVar));
        hoVar2.w(gm.L(14.0f));
        hoVar2.q(!jb6.a0);
        hoVar2.setCallback(this);
        hoVar2.N = point.x;
    }

    public final void a(CharSequence charSequence, boolean z) {
        boolean z2;
        if (z && !jb6.a0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.c.t(charSequence, z2, true);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.z8));
        hashSet.add(Integer.valueOf(cmb.A8));
    }

    public final void b(CharSequence charSequence, boolean z) {
        boolean z2;
        if (z && !jb6.a0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.b.t(charSequence, z2, true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int L = gm.L(29.0f);
        int L2 = gm.L(18.83f);
        ho hoVar = this.c;
        int paddingLeft = getPaddingLeft();
        int L3 = r0 - gm.L(32.0f);
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        int L4 = gm.L(32.0f) + r0;
        ho hoVar2 = this.b;
        hoVar2.setBounds(paddingLeft, L3, measuredWidth, L4);
        hoVar2.draw(canvas);
        hoVar.setBounds(getPaddingLeft(), r0 - gm.L(32.0f), getMeasuredWidth() - getPaddingRight(), gm.L(32.0f) + r0);
        hoVar.draw(canvas);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(56.0f), 1073741824));
        setPadding(gm.L(18.0f), 0, gm.L(18.0f), 0);
    }

    @Override
    public final void updateColors() {
        try {
            ho hoVar = this.b;
            ylb ylbVar = this.a;
            if (hoVar != null) {
                hoVar.u(cmb.v0(cmb.z8, ylbVar));
            }
            ho hoVar2 = this.c;
            if (hoVar2 != null) {
                hoVar2.u(cmb.v0(cmb.A8, ylbVar));
            }
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
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
