package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
public final class p21 extends q11 {
    public final e29 a;
    public final in b;
    public final in c;

    public p21(Context context, vnb vnbVar) {
        super(context, vnbVar);
        int i = aob.yj;
        getThemedColor(i);
        setBackground(getThemedColor(aob.wj));
        ?? imageView = new ImageView(context);
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, tre.h(56.0f, 48.0f, 8388627));
        getThemedColor(i);
        getThemedColor(aob.xj);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, tre.i(-1.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        in inVar = new in(context, true, true, true);
        this.b = inVar;
        inVar.setPadding(hl.L(4.0f), 0, hl.L(4.0f), 0);
        yob.U(inVar, i, vnbVar);
        inVar.setTextSize(hl.L(14.0f));
        inVar.setTypeface(hl.o());
        inVar.setEllipsizeByGradient(true);
        linearLayout.addView(inVar, tre.o(-1, 20));
        in inVar2 = new in(context, true, true, true);
        this.c = inVar2;
        inVar2.setPadding(hl.L(4.0f), 0, hl.L(4.0f), 0);
        yob.U(inVar2, i, vnbVar);
        inVar2.setTypeface(Typeface.SANS_SERIF);
        inVar2.setTextSize(hl.L(13.0f));
        inVar2.setEllipsizeByGradient(true);
        linearLayout.addView(inVar2, tre.o(-1, 18));
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
