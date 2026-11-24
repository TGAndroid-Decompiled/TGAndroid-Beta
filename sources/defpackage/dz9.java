package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class dz9 extends FrameLayout {
    public final wjb a;
    public final TextView b;

    public dz9(Context context, wjb wjbVar) {
        super(context);
        int i;
        this.a = wjbVar;
        zkb.h(bkb.d7, wjbVar, this);
        TextView textView = new TextView(getContext());
        this.b = textView;
        ir2.t(textView, 1, 14.0f);
        zkb.X(textView, bkb.e7, wjbVar);
        if (k96.a0) {
            i = 5;
        } else {
            i = 3;
        }
        textView.setGravity(i | 16);
        addView(textView, nme.d(-1, -1.0f, (k96.a0 ? 5 : 3) | 48, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(32.0f), 1073741824));
    }

    public void setLetter(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    public void setTextColor(int i) {
        zkb.X(this.b, i, this.a);
    }
}
