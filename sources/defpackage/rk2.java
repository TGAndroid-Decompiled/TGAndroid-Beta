package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
public final class rk2 extends FrameLayout {
    public final hn a;
    public final View b;
    public final wjb c;

    public rk2(Context context, wjb wjbVar) {
        super(context);
        int i;
        this.c = wjbVar;
        hn hnVar = new hn(context, false, false, false);
        this.a = hnVar;
        int i2 = bkb.F6;
        zkb.U(hnVar, i2, wjbVar);
        hnVar.setTextSize(gl.L(14.0f));
        if (k96.a0) {
            i = 5;
        } else {
            i = 3;
        }
        hnVar.setGravity(i);
        hnVar.setImportantForAccessibility(2);
        hnVar.setOnWidthUpdatedListener(new mk2(this, (byte) 1));
        addView(hnVar, nme.i(-2.0f, -2.0f, 8388627, 21.0f, 0.0f, 38.0f, 3.0f));
        View view = new View(context);
        this.b = view;
        Drawable mutate = getContext().getResources().getDrawable(2131230871).mutate();
        zkb.x(this, mutate, i2, wjbVar, PorterDuff.Mode.MULTIPLY);
        view.setBackground(mutate);
        addView(view, nme.i(14.0f, 14.0f, 8388627, 21.0f, 1.0f, 0.0f, 3.0f));
    }

    public final void a() {
        float c = this.a.getDrawable().c() + gl.L(1.0f);
        boolean z = k96.a0;
        View view = this.b;
        if (z) {
            view.setTranslationX(-c);
        } else {
            view.setTranslationX(c);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(46.0f), 1073741824));
        a();
    }

    public void setColor(int i) {
        wjb wjbVar = this.c;
        int v0 = bkb.v0(i, wjbVar);
        zkb.U(this.a, i, wjbVar);
        this.b.getBackground().setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.MULTIPLY));
    }
}
