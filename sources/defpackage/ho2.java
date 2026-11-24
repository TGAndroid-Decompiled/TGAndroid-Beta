package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class ho2 extends FrameLayout implements vlb {
    public final bf0 a;
    public final ylb b;
    public final TextView c;
    public final TextView d;

    public ho2(Context context, ylb ylbVar) {
        super(context);
        this.b = ylbVar;
        bf0 bf0Var = new bf0(context);
        this.a = bf0Var;
        bf0Var.setRoundRadius(gm.L(20.0f));
        addView(bf0Var, qoe.d(72, 72.0f, 49, 0.0f, 36.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTypeface(gm.o());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(17);
        addView(textView, qoe.d(-1, -2.0f, 49, 24.0f, 123.0f, 24.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setLineSpacing(gm.L(2.0f), 1.0f);
        addView(textView2, qoe.d(-1, -2.0f, 49, 32.0f, 157.0f, 32.0f, 0.0f));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.y6));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Drawable drawable = cmb.R0;
        bf0 bf0Var = this.a;
        ur3.a(canvas, drawable, (bf0Var.getWidth() / 2.0f) + bf0Var.getLeft(), (bf0Var.getHeight() / 2.0f) + bf0Var.getTop(), bf0Var.getHeight());
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(218.0f), 1073741824));
    }

    public void setSubtitle(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.c.setText(charSequence);
    }

    @Override
    public final void updateColors() {
        int i = cmb.F6;
        ylb ylbVar = this.b;
        this.c.setTextColor(cmb.v0(i, ylbVar));
        this.d.setTextColor(cmb.v0(cmb.y6, ylbVar));
    }
}
