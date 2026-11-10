package nh;

import android.graphics.RenderNode;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.g0;
import v4.d1;
public final class e extends d {
    public final h h;

    public e(h hVar) {
        this.h = hVar;
        this.f20611e = -1;
    }

    @Override
    public final d1 x(ViewGroup viewGroup, int i7) {
        c cVar = new c(viewGroup.getContext());
        cVar.setPadding(g0.L(22.0f), 0, g0.L(22.0f), 0);
        b bVar = new b(cVar);
        h hVar = this.h;
        View view = hVar.W0;
        RenderNode renderNode = hVar.U0;
        float f10 = hVar.V0;
        c cVar2 = bVar.v;
        cVar2.G = view;
        cVar2.E = renderNode;
        cVar2.F = f10;
        cVar2.setDelegate(hVar.Y0);
        return bVar;
    }
}
