package dh;

import android.graphics.RenderNode;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.i0;
import s4.c1;
public final class h extends e {
    public final k h;

    public h(k kVar) {
        this.h = kVar;
        this.e = -1;
    }

    @Override
    public final c1 w(ViewGroup viewGroup, int i10) {
        d dVar = new d(viewGroup.getContext());
        dVar.setPadding(i0.L(22.0f), 0, i0.L(22.0f), 0);
        c cVar = new c(dVar);
        k kVar = this.h;
        View view = kVar.W0;
        RenderNode renderNode = kVar.U0;
        float f7 = kVar.V0;
        d dVar2 = cVar.v;
        dVar2.G = view;
        dVar2.E = renderNode;
        dVar2.F = f7;
        dVar2.setDelegate(kVar.Y0);
        return cVar;
    }
}
