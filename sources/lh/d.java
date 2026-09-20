package lh;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.tgnet.TLRPC;
import s4.c1;
import s4.h0;
public abstract class d extends h0 implements GroupCallMessagesController.CallMessageListener {
    public List f14312c;
    public boolean d;
    public int e;
    public TLRPC.InputGroupCall f14313f;

    @Override
    public final int h() {
        List list = this.f14312c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override
    public final void onNewGroupCallMessage(long j3, GroupCallMessage groupCallMessage) {
        if (this.f14312c == null) {
            this.f14312c = new ArrayList();
        }
        this.f14312c.add(0, groupCallMessage);
        o(0);
    }

    @Override
    public final void onPopGroupCallMessage() {
        List list = this.f14312c;
        if (list != null && !list.isEmpty()) {
            int size = this.f14312c.size() - 1;
            this.f14312c.remove(size);
            u(size);
        }
    }

    @Override
    public final void v(c1 c1Var, int i10) {
        b bVar = (b) c1Var;
        List list = this.f14312c;
        if (list != null && list.size() > i10) {
            ((c) bVar.f42974a).set((GroupCallMessage) this.f14312c.get(i10));
        }
    }
}
