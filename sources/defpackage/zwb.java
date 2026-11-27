package defpackage;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class zwb extends c79 {
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public ywb e;
    public int f;
    public final axb h;

    public zwb(axb axbVar) {
        this.h = axbVar;
    }

    @Override
    public final boolean D(f89 f89Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.c.size();
    }

    @Override
    public final void t(f89 f89Var, int i) {
        ArrayList arrayList = this.c;
        TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i);
        String str = (String) this.d.get(i);
        bd5 bd5Var = (bd5) f89Var.a;
        String str2 = chat.title;
        boolean z = true;
        if (i == arrayList.size() - 1) {
            z = false;
        }
        bd5Var.e(chat, str2, str, z);
        bd5Var.c(this.h.x.contains(Long.valueOf(chat.id)), false);
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        return new f89(new bd5(viewGroup.getContext(), 1, 0, false));
    }
}
