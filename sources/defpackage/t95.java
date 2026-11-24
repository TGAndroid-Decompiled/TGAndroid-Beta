package defpackage;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.tgnet.TLRPC;
public abstract class t95 extends y59 implements GroupCallMessagesController.CallMessageListener {
    public List c;
    public boolean d;
    public int e;
    public TLRPC.InputGroupCall f;

    @Override
    public final int b() {
        List list = this.c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override
    public final void onNewGroupCallMessage(long j, GroupCallMessage groupCallMessage) {
        if (this.c == null) {
            this.c = new ArrayList();
        }
        this.c.add(0, groupCallMessage);
        i(0);
    }

    @Override
    public final void onPopGroupCallMessage() {
        List list = this.c;
        if (list != null && !list.isEmpty()) {
            int size = this.c.size() - 1;
            this.c.remove(size);
            s(size);
        }
    }

    @Override
    public final void t(u69 u69Var, int i) {
        r95 r95Var = (r95) u69Var;
        List list = this.c;
        if (list != null && list.size() > i) {
            ((s95) r95Var.a).set((GroupCallMessage) this.c.get(i));
        }
    }
}
