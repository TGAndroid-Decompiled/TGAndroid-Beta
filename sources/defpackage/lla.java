package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
public final class lla extends FrameLayout {
    public final hla a;
    public final View b;

    public lla(Context context, ylb ylbVar) {
        super(context);
        View view = new View(context);
        this.b = view;
        addView(view, qoe.o(-1, -1));
        anb.h(cmb.g5, ylbVar, view);
        hla hlaVar = new hla(context, ylbVar);
        this.a = hlaVar;
        addView(hlaVar, qoe.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        anb.Z(this, getContext(), 2131231235, cmb.a7);
    }

    public void setCallBack(gla glaVar) {
        this.a.setCallback(glaVar);
    }
}
