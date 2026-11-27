package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class x2a extends FrameLayout {
    public final vnb a;
    public final TextView b;

    public x2a(Context context, vnb vnbVar) {
        super(context);
        int i;
        this.a = vnbVar;
        yob.h(aob.e7, vnbVar, this);
        TextView textView = new TextView(getContext());
        this.b = textView;
        bs2.t(textView, 1, 14.0f);
        yob.X(textView, aob.f7, vnbVar);
        if (ob6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        textView.setGravity(i | 16);
        addView(textView, tre.d(-1, -1.0f, (ob6.a0 ? 5 : 3) | 48, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(32.0f), 1073741824));
    }

    public void setLetter(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    public void setTextColor(int i) {
        yob.X(this.b, i, this.a);
    }
}
