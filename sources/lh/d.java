package lh;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.tgnet.TLRPC;
import s4.c1;
import s4.h0;
public abstract class d extends h0 implements GroupCallMessagesController.CallMessageListener {
    public List f14328c;
    public boolean d;
    public int e;
    public TLRPC.InputGroupCall f14329f;

    @Override
    public final int h() {
        List list = this.f14328c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override
    public final void onNewGroupCallMessage(long j3, GroupCallMessage groupCallMessage) {
        if (this.f14328c == null) {
            this.f14328c = new ArrayList();
        }
        this.f14328c.add(0, groupCallMessage);
        o(0);
    }

    @Override
    public final void onPopGroupCallMessage() {
        List list = this.f14328c;
        if (list != null && !list.isEmpty()) {
            int size = this.f14328c.size() - 1;
            this.f14328c.remove(size);
            u(size);
        }
    }

    @Override
    public final void v(c1 c1Var, int i10) {
        b bVar = (b) c1Var;
        List list = this.f14328c;
        if (list != null && list.size() > i10) {
            ((c) bVar.f42946a).set((GroupCallMessage) this.f14328c.get(i10));
        }
    }
}
