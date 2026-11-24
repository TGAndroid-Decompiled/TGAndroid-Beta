package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public abstract class uxe {
    public static udc a(View view, wdc wdcVar) {
        udc udcVar = wdcVar.b;
        if (udcVar != null) {
            return udcVar;
        }
        View rootView = view.getRootView();
        if (view != rootView) {
            if (!(rootView instanceof ViewGroup)) {
                return null;
            }
            ViewGroup viewGroup = (ViewGroup) rootView;
            udc udcVar2 = (udc) viewGroup.getTag(2131296698);
            if (udcVar2 == null) {
                rj4 rj4Var = new rj4(viewGroup.getContext());
                udc udcVar3 = new udc(rj4Var);
                viewGroup.setTag(2131296698, udcVar3);
                if (viewGroup instanceof FrameLayout) {
                    viewGroup.addView(rj4Var, new FrameLayout.LayoutParams(1, 1, 17));
                } else {
                    viewGroup.addView(rj4Var, new ViewGroup.LayoutParams(1, 1));
                }
                udcVar2 = udcVar3;
            }
            wdcVar.b = udcVar2;
            return udcVar2;
        }
        w26.j("Cannot add OnPostDrawListener to root view");
        return null;
    }
}
