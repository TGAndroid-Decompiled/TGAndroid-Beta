package lh;

import android.graphics.RenderNode;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import s4.d1;
public final class e extends d {
    public final h h;

    public e(h hVar) {
        this.h = hVar;
        this.f15598e = -1;
    }

    @Override
    public final d1 x(ViewGroup viewGroup, int i10) {
        c cVar = new c(viewGroup.getContext());
        cVar.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        b bVar = new b(cVar);
        h hVar = this.h;
        View view = hVar.W0;
        RenderNode renderNode = hVar.U0;
        float f7 = hVar.V0;
        c cVar2 = bVar.v;
        cVar2.G = view;
        cVar2.E = renderNode;
        cVar2.F = f7;
        cVar2.setDelegate(hVar.Y0);
        return bVar;
    }
}
