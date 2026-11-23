package c8;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public abstract class yd {
    public static xf.a a(View view, xf.c cVar) {
        xf.a aVar = cVar.f60472b;
        if (aVar != null) {
            return aVar;
        }
        View rootView = view.getRootView();
        if (view != rootView) {
            if (!(rootView instanceof ViewGroup)) {
                return null;
            }
            ViewGroup viewGroup = (ViewGroup) rootView;
            xf.a aVar2 = (xf.a) viewGroup.getTag(2131296698);
            if (aVar2 == null) {
                fi.u2 u2Var = new fi.u2(viewGroup.getContext(), 8);
                xf.a aVar3 = new xf.a(u2Var);
                viewGroup.setTag(2131296698, aVar3);
                if (viewGroup instanceof FrameLayout) {
                    viewGroup.addView(u2Var, new FrameLayout.LayoutParams(1, 1, 17));
                } else {
                    viewGroup.addView(u2Var, new ViewGroup.LayoutParams(1, 1));
                }
                aVar2 = aVar3;
            }
            cVar.f60472b = aVar2;
            return aVar2;
        }
        throw new IllegalArgumentException("Cannot add OnPostDrawListener to root view");
    }
}
