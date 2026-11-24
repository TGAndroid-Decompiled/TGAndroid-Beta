package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
public final class dm2 extends FrameLayout {
    public final io a;
    public final View b;
    public final ylb c;

    public dm2(Context context, ylb ylbVar) {
        super(context);
        int i;
        this.c = ylbVar;
        io ioVar = new io(context, false, false, false);
        this.a = ioVar;
        int i2 = cmb.F6;
        anb.U(ioVar, i2, ylbVar);
        ioVar.setTextSize(gm.L(14.0f));
        if (jb6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        ioVar.setGravity(i);
        ioVar.setImportantForAccessibility(2);
        ioVar.setOnWidthUpdatedListener(new xf2(this, (byte) 6));
        addView(ioVar, qoe.i(-2.0f, -2.0f, 8388627, 21.0f, 0.0f, 38.0f, 3.0f));
        View view = new View(context);
        this.b = view;
        Drawable mutate = getContext().getResources().getDrawable(2131230872).mutate();
        anb.x(this, mutate, i2, ylbVar, PorterDuff.Mode.MULTIPLY);
        view.setBackground(mutate);
        addView(view, qoe.i(14.0f, 14.0f, 8388627, 21.0f, 1.0f, 0.0f, 3.0f));
    }

    public final void a() {
        float c = this.a.getDrawable().c() + gm.L(1.0f);
        boolean z = jb6.a0;
        View view = this.b;
        if (z) {
            view.setTranslationX(-c);
        } else {
            view.setTranslationX(c);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(46.0f), 1073741824));
        a();
    }

    public void setColor(int i) {
        ylb ylbVar = this.c;
        int v0 = cmb.v0(i, ylbVar);
        anb.U(this.a, i, ylbVar);
        this.b.getBackground().setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.MULTIPLY));
    }
}
