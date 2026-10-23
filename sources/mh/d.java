package mh;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.tgnet.TLRPC;
import s4.b1;
import s4.g0;
public abstract class d extends g0 implements GroupCallMessagesController.CallMessageListener {
    public List f17000c;
    public boolean d;
    public int e;
    public TLRPC.InputGroupCall f17001f;

    @Override
    public final int h() {
        List list = this.f17000c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override
    public final void onNewGroupCallMessage(long j10, GroupCallMessage groupCallMessage) {
        if (this.f17000c == null) {
            this.f17000c = new ArrayList();
        }
        this.f17000c.add(0, groupCallMessage);
        o(0);
    }

    @Override
    public final void onPopGroupCallMessage() {
        List list = this.f17000c;
        if (list != null && !list.isEmpty()) {
            int size = this.f17000c.size() - 1;
            this.f17000c.remove(size);
            u(size);
        }
    }

    @Override
    public final void v(b1 b1Var, int i10) {
        b bVar = (b) b1Var;
        List list = this.f17000c;
        if (list != null && list.size() > i10) {
            ((c) bVar.f46343a).set((GroupCallMessage) this.f17000c.get(i10));
        }
    }
}
