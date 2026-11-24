package defpackage;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class zub extends q59 {
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public yub e;
    public int f;
    public final avb h;

    public zub(avb avbVar) {
        this.h = avbVar;
    }

    @Override
    public final boolean D(u69 u69Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.c.size();
    }

    @Override
    public final void t(u69 u69Var, int i) {
        ArrayList arrayList = this.c;
        TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i);
        String str = (String) this.d.get(i);
        xc5 xc5Var = (xc5) u69Var.a;
        String str2 = chat.title;
        boolean z = true;
        if (i == arrayList.size() - 1) {
            z = false;
        }
        xc5Var.e(chat, str2, str, z);
        xc5Var.c(this.h.x.contains(Long.valueOf(chat.id)), false);
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        return new u69(new xc5(viewGroup.getContext(), 1, 0, false));
    }
}
