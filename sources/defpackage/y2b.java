package defpackage;

import android.app.Activity;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class y2b extends q59 {
    public final Activity c;
    public final z2b d;

    public y2b(z2b z2bVar, Activity activity) {
        this.d = z2bVar;
        this.c = activity;
    }

    @Override
    public final boolean D(u69 u69Var) {
        return false;
    }

    @Override
    public final int b() {
        return this.d.c.size();
    }

    @Override
    public final void t(u69 u69Var, int i) {
        et etVar = (et) u69Var.a;
        ArrayList arrayList = this.d.c;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i);
        boolean z = true;
        if (i == arrayList.size() - 1) {
            z = false;
        }
        etVar.b(stickerSetCovered, z);
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        et etVar = new et(this.c, false);
        etVar.setLayoutParams(new g69(-1, gm.L(82.0f)));
        return new u69(etVar);
    }
}
