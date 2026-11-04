package oh;

import android.graphics.RenderNode;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.g0;
import u4.d1;
public final class e extends d {
    public final h h;

    public e(h hVar) {
        this.h = hVar;
        this.f21123e = -1;
    }

    @Override
    public final d1 x(ViewGroup viewGroup, int i3) {
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
