package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class z82 extends mhb {
    public final f92 E;
    public ValueAnimator x;
    public int y;

    public z82(f92 f92Var, Context context, wjb wjbVar) {
        super(12, wjbVar, context);
        this.E = f92Var;
        this.y = -1;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.y != -1) {
            f92 f92Var = this.E;
            if (f92Var.n != null) {
                ArrayList arrayList = new ArrayList();
                boolean z2 = false;
                for (int i5 = 0; i5 < f92Var.n.getChildCount(); i5++) {
                    View childAt = f92Var.n.getChildAt(i5);
                    if (z2) {
                        arrayList.add(childAt);
                    } else if (childAt == this) {
                        z2 = true;
                    }
                }
                float height = this.y - getHeight();
                ValueAnimator valueAnimator = this.x;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.x = ofFloat;
                ofFloat.addUpdateListener(new rm1(arrayList, height, (byte) 4));
                this.x.setInterpolator(s33.h);
                this.x.setDuration(350L);
                this.x.start();
            }
        }
        this.y = getHeight();
    }

    @Override
    public final void setText(CharSequence charSequence) {
        String str;
        if (charSequence != 0) {
            charSequence = gl.S2(charSequence.toString());
            int indexOf = charSequence.toString().indexOf(10);
            f92 f92Var = this.E;
            if (indexOf >= 0) {
                charSequence.replace(indexOf, indexOf + 1, " ");
                charSequence.setSpan(new cm4(bkb.o7, f92.Y(f92Var)), 0, indexOf, 33);
            }
            z3c[] z3cVarArr = (z3c[]) charSequence.getSpans(0, charSequence.length(), z3c.class);
            l7 l7Var = f92Var.b;
            if (l7Var != null && l7Var.getText() != null) {
                str = f92Var.b.getText().toString();
            } else {
                str = "";
            }
            for (int i = 0; i < z3cVarArr.length; i++) {
                charSequence.setSpan(new q1((Object) this, str, (byte) 4), charSequence.getSpanStart(z3cVarArr[i]), charSequence.getSpanEnd(z3cVarArr[i]), 33);
                charSequence.removeSpan(z3cVarArr[i]);
            }
        }
        super.setText(charSequence);
    }
}
