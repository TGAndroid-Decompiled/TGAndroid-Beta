package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public abstract class n2f {
    public static thc a(View view, vhc vhcVar) {
        thc thcVar = vhcVar.b;
        if (thcVar != null) {
            return thcVar;
        }
        View rootView = view.getRootView();
        if (view != rootView) {
            if (!(rootView instanceof ViewGroup)) {
                return null;
            }
            ViewGroup viewGroup = (ViewGroup) rootView;
            thc thcVar2 = (thc) viewGroup.getTag(2131296698);
            if (thcVar2 == null) {
                vl4 vl4Var = new vl4(viewGroup.getContext());
                thc thcVar3 = new thc(vl4Var);
                viewGroup.setTag(2131296698, thcVar3);
                if (viewGroup instanceof FrameLayout) {
                    viewGroup.addView(vl4Var, new FrameLayout.LayoutParams(1, 1, 17));
                } else {
                    viewGroup.addView(vl4Var, new ViewGroup.LayoutParams(1, 1));
                }
                thcVar2 = thcVar3;
            }
            vhcVar.b = thcVar2;
            return thcVar2;
        }
        lq5.j("Cannot add OnPostDrawListener to root view");
        return null;
    }
}
