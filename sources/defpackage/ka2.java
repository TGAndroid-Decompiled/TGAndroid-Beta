package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class ka2 extends njb {
    public final qa2 E;
    public ValueAnimator x;
    public int y;

    public ka2(qa2 qa2Var, Context context, ylb ylbVar) {
        super(12, ylbVar, context);
        this.E = qa2Var;
        this.y = -1;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.y != -1) {
            qa2 qa2Var = this.E;
            if (qa2Var.n != null) {
                ArrayList arrayList = new ArrayList();
                boolean z2 = false;
                for (int i5 = 0; i5 < qa2Var.n.getChildCount(); i5++) {
                    View childAt = qa2Var.n.getChildAt(i5);
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
                ofFloat.addUpdateListener(new go1(arrayList, height, (byte) 4));
                this.x.setInterpolator(d53.h);
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
            charSequence = gm.S2(charSequence.toString());
            int indexOf = charSequence.toString().indexOf(10);
            qa2 qa2Var = this.E;
            if (indexOf >= 0) {
                charSequence.replace(indexOf, indexOf + 1, " ");
                charSequence.setSpan(new do4(cmb.o7, qa2.Z(qa2Var)), 0, indexOf, 33);
            }
            z5c[] z5cVarArr = (z5c[]) charSequence.getSpans(0, charSequence.length(), z5c.class);
            l7 l7Var = qa2Var.b;
            if (l7Var != null && l7Var.getText() != null) {
                str = qa2Var.b.getText().toString();
            } else {
                str = "";
            }
            for (int i = 0; i < z5cVarArr.length; i++) {
                charSequence.setSpan(new q1((Object) this, str, (byte) 4), charSequence.getSpanStart(z5cVarArr[i]), charSequence.getSpanEnd(z5cVarArr[i]), 33);
                charSequence.removeSpan(z5cVarArr[i]);
            }
        }
        super.setText(charSequence);
    }
}
