package defpackage;

import android.app.Activity;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class t4b extends c79 {
    public final Activity c;
    public final u4b d;

    public t4b(u4b u4bVar, Activity activity) {
        this.d = u4bVar;
        this.c = activity;
    }

    @Override
    public final boolean D(f89 f89Var) {
        return false;
    }

    @Override
    public final int b() {
        return this.d.c.size();
    }

    @Override
    public final void t(f89 f89Var, int i) {
        fs fsVar = (fs) f89Var.a;
        ArrayList arrayList = this.d.c;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i);
        boolean z = true;
        if (i == arrayList.size() - 1) {
            z = false;
        }
        fsVar.b(stickerSetCovered, z);
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        fs fsVar = new fs(this.c, false);
        fsVar.setLayoutParams(new r79(-1, hl.L(82.0f)));
        return new f89(fsVar);
    }
}
