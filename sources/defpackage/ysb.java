package defpackage;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ysb extends n39 {
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public xsb e;
    public int f;
    public final zsb h;

    public ysb(zsb zsbVar) {
        this.h = zsbVar;
    }

    @Override
    public final boolean D(s49 s49Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.c.size();
    }

    @Override
    public final void t(s49 s49Var, int i) {
        ArrayList arrayList = this.c;
        TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i);
        String str = (String) this.d.get(i);
        za5 za5Var = (za5) s49Var.a;
        String str2 = chat.title;
        boolean z = true;
        if (i == arrayList.size() - 1) {
            z = false;
        }
        za5Var.e(chat, str2, str, z);
        za5Var.c(this.h.x.contains(Long.valueOf(chat.id)), false);
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        return new s49(new za5(viewGroup.getContext(), 1, 0, false));
    }
}
