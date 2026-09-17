package mh;

import android.graphics.RenderNode;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import s4.c1;
public final class e extends d {
    public final h h;

    public e(h hVar) {
        this.h = hVar;
        this.f16353e = -1;
    }

    @Override
    public final c1 x(ViewGroup viewGroup, int i10) {
        c cVar = new c(viewGroup.getContext());
        cVar.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        b bVar = new b(cVar);
        h hVar = this.h;
        View view = hVar.Y0;
        RenderNode renderNode = hVar.W0;
        float f7 = hVar.X0;
        c cVar2 = bVar.v;
        cVar2.G = view;
        cVar2.E = renderNode;
        cVar2.F = f7;
        cVar2.setDelegate(hVar.f16355a1);
        return bVar;
    }
}
