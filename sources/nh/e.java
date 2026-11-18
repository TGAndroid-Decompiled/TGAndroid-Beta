package nh;

import android.graphics.RenderNode;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.g0;
import v4.f1;
public final class e extends d {
    public final h h;

    public e(h hVar) {
        this.h = hVar;
        this.f21540e = -1;
    }

    @Override
    public final f1 x(ViewGroup viewGroup, int i7) {
        c cVar = new c(viewGroup.getContext());
        cVar.setPadding(g0.L(22.0f), 0, g0.L(22.0f), 0);
        b bVar = new b(cVar);
        h hVar = this.h;
        View view = hVar.X0;
        RenderNode renderNode = hVar.V0;
        float f10 = hVar.W0;
        c cVar2 = bVar.v;
        cVar2.H = view;
        cVar2.F = renderNode;
        cVar2.G = f10;
        cVar2.setDelegate(hVar.Z0);
        return bVar;
    }
}
