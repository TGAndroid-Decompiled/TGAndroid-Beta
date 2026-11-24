package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class f1a extends FrameLayout {
    public final ylb a;
    public final TextView b;

    public f1a(Context context, ylb ylbVar) {
        super(context);
        int i;
        this.a = ylbVar;
        anb.h(cmb.d7, ylbVar, this);
        TextView textView = new TextView(getContext());
        this.b = textView;
        ts2.s(textView, 1, 14.0f);
        anb.X(textView, cmb.e7, ylbVar);
        if (jb6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        textView.setGravity(i | 16);
        addView(textView, qoe.d(-1, -1.0f, (jb6.a0 ? 5 : 3) | 48, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(32.0f), 1073741824));
    }

    public void setLetter(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    public void setTextColor(int i) {
        anb.X(this.b, i, this.a);
    }
}
