package kh;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.tgnet.TLRPC;
import s4.c1;
import s4.h0;
public abstract class d extends h0 implements GroupCallMessagesController.CallMessageListener {
    public List f12515c;
    public boolean d;
    public int e;
    public TLRPC.InputGroupCall f12516f;

    @Override
    public final int h() {
        List list = this.f12515c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override
    public final void onNewGroupCallMessage(long j3, GroupCallMessage groupCallMessage) {
        if (this.f12515c == null) {
            this.f12515c = new ArrayList();
        }
        this.f12515c.add(0, groupCallMessage);
        o(0);
    }

    @Override
    public final void onPopGroupCallMessage() {
        List list = this.f12515c;
        if (list != null && !list.isEmpty()) {
            int size = this.f12515c.size() - 1;
            this.f12515c.remove(size);
            u(size);
        }
    }

    @Override
    public final void v(c1 c1Var, int i10) {
        b bVar = (b) c1Var;
        List list = this.f12515c;
        if (list != null && list.size() > i10) {
            ((c) bVar.f41610a).set((GroupCallMessage) this.f12515c.get(i10));
        }
    }
}
