package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class p92 extends ilb {
    public final v92 E;
    public ValueAnimator x;
    public int y;

    public p92(v92 v92Var, Context context, vnb vnbVar) {
        super(12, vnbVar, context);
        this.E = v92Var;
        this.y = -1;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.y != -1) {
            v92 v92Var = this.E;
            if (v92Var.n != null) {
                ArrayList arrayList = new ArrayList();
                boolean z2 = false;
                for (int i5 = 0; i5 < v92Var.n.getChildCount(); i5++) {
                    View childAt = v92Var.n.getChildAt(i5);
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
                ofFloat.addUpdateListener(new qm1(arrayList, height, (byte) 4));
                this.x.setInterpolator(k43.h);
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
            charSequence = hl.S2(charSequence.toString());
            int indexOf = charSequence.toString().indexOf(10);
            v92 v92Var = this.E;
            if (indexOf >= 0) {
                charSequence.replace(indexOf, indexOf + 1, " ");
                charSequence.setSpan(new ho4(aob.p7, v92.Y(v92Var)), 0, indexOf, 33);
            }
            y7c[] y7cVarArr = (y7c[]) charSequence.getSpans(0, charSequence.length(), y7c.class);
            m7 m7Var = v92Var.b;
            if (m7Var != null && m7Var.getText() != null) {
                str = v92Var.b.getText().toString();
            } else {
                str = "";
            }
            for (int i = 0; i < y7cVarArr.length; i++) {
                charSequence.setSpan(new r1((Object) this, str, (byte) 4), charSequence.getSpanStart(y7cVarArr[i]), charSequence.getSpanEnd(y7cVarArr[i]), 33);
                charSequence.removeSpan(y7cVarArr[i]);
            }
        }
        super.setText(charSequence);
    }
}
