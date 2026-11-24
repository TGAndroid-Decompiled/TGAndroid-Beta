package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
public final class o31 extends p21 {
    public final s09 a;
    public final io b;
    public final io c;

    public o31(Context context, ylb ylbVar) {
        super(context, ylbVar);
        int i = cmb.xj;
        getThemedColor(i);
        setBackground(getThemedColor(cmb.vj));
        ?? imageView = new ImageView(context);
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, qoe.h(56.0f, 48.0f, 8388627));
        getThemedColor(i);
        getThemedColor(cmb.wj);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, qoe.i(-1.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        io ioVar = new io(context, true, true, true);
        this.b = ioVar;
        ioVar.setPadding(gm.L(4.0f), 0, gm.L(4.0f), 0);
        anb.U(ioVar, i, ylbVar);
        ioVar.setTextSize(gm.L(14.0f));
        ioVar.setTypeface(gm.o());
        ioVar.setEllipsizeByGradient(true);
        linearLayout.addView(ioVar, qoe.o(-1, 20));
        io ioVar2 = new io(context, true, true, true);
        this.c = ioVar2;
        ioVar2.setPadding(gm.L(4.0f), 0, gm.L(4.0f), 0);
        anb.U(ioVar2, i, ylbVar);
        ioVar2.setTypeface(Typeface.SANS_SERIF);
        ioVar2.setTextSize(gm.L(13.0f));
        ioVar2.setEllipsizeByGradient(true);
        linearLayout.addView(ioVar2, qoe.o(-1, 18));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.b.getText()) + ".\n" + ((Object) this.c.getText());
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.a.d();
    }
}
