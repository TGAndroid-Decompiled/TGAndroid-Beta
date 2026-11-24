package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
public final class g21 extends h11 {
    public final ry8 a;
    public final hn b;
    public final hn c;

    public g21(Context context, wjb wjbVar) {
        super(context, wjbVar);
        int i = bkb.xj;
        getThemedColor(i);
        setBackground(getThemedColor(bkb.vj));
        ?? imageView = new ImageView(context);
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, nme.h(56.0f, 48.0f, 8388627));
        getThemedColor(i);
        getThemedColor(bkb.wj);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, nme.i(-1.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        hn hnVar = new hn(context, true, true, true);
        this.b = hnVar;
        hnVar.setPadding(gl.L(4.0f), 0, gl.L(4.0f), 0);
        zkb.U(hnVar, i, wjbVar);
        hnVar.setTextSize(gl.L(14.0f));
        hnVar.setTypeface(gl.o());
        hnVar.setEllipsizeByGradient(true);
        linearLayout.addView(hnVar, nme.o(-1, 20));
        hn hnVar2 = new hn(context, true, true, true);
        this.c = hnVar2;
        hnVar2.setPadding(gl.L(4.0f), 0, gl.L(4.0f), 0);
        zkb.U(hnVar2, i, wjbVar);
        hnVar2.setTypeface(Typeface.SANS_SERIF);
        hnVar2.setTextSize(gl.L(13.0f));
        hnVar2.setEllipsizeByGradient(true);
        linearLayout.addView(hnVar2, nme.o(-1, 18));
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
