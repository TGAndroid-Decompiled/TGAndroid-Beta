package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class wm2 extends FrameLayout implements tjb {
    public final be0 a;
    public final wjb b;
    public final TextView c;
    public final TextView d;

    public wm2(Context context, wjb wjbVar) {
        super(context);
        this.b = wjbVar;
        be0 be0Var = new be0(context);
        this.a = be0Var;
        be0Var.setRoundRadius(gl.L(20.0f));
        addView(be0Var, nme.d(72, 72.0f, 49, 0.0f, 36.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTypeface(gl.o());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(17);
        addView(textView, nme.d(-1, -2.0f, 49, 24.0f, 123.0f, 24.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setLineSpacing(gl.L(2.0f), 1.0f);
        addView(textView2, nme.d(-1, -2.0f, 49, 32.0f, 157.0f, 32.0f, 0.0f));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.F6));
        hashSet.add(Integer.valueOf(bkb.y6));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Drawable drawable = bkb.R0;
        be0 be0Var = this.a;
        kq3.a(canvas, drawable, (be0Var.getWidth() / 2.0f) + be0Var.getLeft(), (be0Var.getHeight() / 2.0f) + be0Var.getTop(), be0Var.getHeight());
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(218.0f), 1073741824));
    }

    public void setSubtitle(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.c.setText(charSequence);
    }

    @Override
    public final void updateColors() {
        int i = bkb.F6;
        wjb wjbVar = this.b;
        this.c.setTextColor(bkb.v0(i, wjbVar));
        this.d.setTextColor(bkb.v0(bkb.y6, wjbVar));
    }
}
