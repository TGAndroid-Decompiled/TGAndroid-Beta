package lh;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.tgnet.TLRPC;
import s4.c1;
import s4.h0;
public abstract class d extends h0 implements GroupCallMessagesController.CallMessageListener {
    public List f14130c;
    public boolean d;
    public int e;
    public TLRPC.InputGroupCall f14131f;

    @Override
    public final int h() {
        List list = this.f14130c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override
    public final void onNewGroupCallMessage(long j3, GroupCallMessage groupCallMessage) {
        if (this.f14130c == null) {
            this.f14130c = new ArrayList();
        }
        this.f14130c.add(0, groupCallMessage);
        o(0);
    }

    @Override
    public final void onPopGroupCallMessage() {
        List list = this.f14130c;
        if (list != null && !list.isEmpty()) {
            int size = this.f14130c.size() - 1;
            this.f14130c.remove(size);
            u(size);
        }
    }

    @Override
    public final void v(c1 c1Var, int i10) {
        b bVar = (b) c1Var;
        List list = this.f14130c;
        if (list != null && list.size() > i10) {
            ((c) bVar.f42702a).set((GroupCallMessage) this.f14130c.get(i10));
        }
    }
}
