package defpackage;

import android.app.Activity;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class w0b extends n39 {
    public final Activity c;
    public final x0b d;

    public w0b(x0b x0bVar, Activity activity) {
        this.d = x0bVar;
        this.c = activity;
    }

    @Override
    public final boolean D(s49 s49Var) {
        return false;
    }

    @Override
    public final int b() {
        return this.d.c.size();
    }

    @Override
    public final void t(s49 s49Var, int i) {
        es esVar = (es) s49Var.a;
        ArrayList arrayList = this.d.c;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i);
        boolean z = true;
        if (i == arrayList.size() - 1) {
            z = false;
        }
        esVar.b(stickerSetCovered, z);
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        es esVar = new es(this.c, false);
        esVar.setLayoutParams(new e49(-1, gl.L(82.0f)));
        return new s49(esVar);
    }
}
