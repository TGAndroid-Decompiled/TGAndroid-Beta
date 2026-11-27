package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
public final class ll2 extends FrameLayout {
    public final in a;
    public final View b;
    public final vnb c;

    public ll2(Context context, vnb vnbVar) {
        super(context);
        int i;
        this.c = vnbVar;
        in inVar = new in(context, false, false, false);
        this.a = inVar;
        int i2 = aob.G6;
        yob.U(inVar, i2, vnbVar);
        inVar.setTextSize(hl.L(14.0f));
        if (ob6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        inVar.setGravity(i);
        inVar.setImportantForAccessibility(2);
        inVar.setOnWidthUpdatedListener(new vd2(this, (byte) 7));
        addView(inVar, tre.i(-2.0f, -2.0f, 8388627, 21.0f, 0.0f, 38.0f, 3.0f));
        View view = new View(context);
        this.b = view;
        Drawable mutate = getContext().getResources().getDrawable(2131230871).mutate();
        yob.x(this, mutate, i2, vnbVar, PorterDuff.Mode.MULTIPLY);
        view.setBackground(mutate);
        addView(view, tre.i(14.0f, 14.0f, 8388627, 21.0f, 1.0f, 0.0f, 3.0f));
    }

    public final void a() {
        float c = this.a.getDrawable().c() + hl.L(1.0f);
        boolean z = ob6.a0;
        View view = this.b;
        if (z) {
            view.setTranslationX(-c);
        } else {
            view.setTranslationX(c);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(46.0f), 1073741824));
        a();
    }

    public void setColor(int i) {
        vnb vnbVar = this.c;
        int v0 = aob.v0(i, vnbVar);
        yob.U(this.a, i, vnbVar);
        this.b.getBackground().setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.MULTIPLY));
    }
}
