package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public abstract class wze {
    public static vfc a(View view, xfc xfcVar) {
        vfc vfcVar = xfcVar.b;
        if (vfcVar != null) {
            return vfcVar;
        }
        View rootView = view.getRootView();
        if (view != rootView) {
            if (!(rootView instanceof ViewGroup)) {
                return null;
            }
            ViewGroup viewGroup = (ViewGroup) rootView;
            vfc vfcVar2 = (vfc) viewGroup.getTag(2131296698);
            if (vfcVar2 == null) {
                yc ycVar = new yc(viewGroup.getContext());
                vfc vfcVar3 = new vfc(ycVar);
                viewGroup.setTag(2131296698, vfcVar3);
                if (viewGroup instanceof FrameLayout) {
                    viewGroup.addView(ycVar, new FrameLayout.LayoutParams(1, 1, 17));
                } else {
                    viewGroup.addView(ycVar, new ViewGroup.LayoutParams(1, 1));
                }
                vfcVar2 = vfcVar3;
            }
            xfcVar.b = vfcVar2;
            return vfcVar2;
        }
        u36.j("Cannot add OnPostDrawListener to root view");
        return null;
    }
}
