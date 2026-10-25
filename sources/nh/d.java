package nh;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.tgnet.TLRPC;
import s4.e1;
import s4.h0;
public abstract class d extends h0 implements GroupCallMessagesController.CallMessageListener {
    public List f18863c;
    public boolean d;
    public int e;
    public TLRPC.InputGroupCall f18864f;

    @Override
    public final int h() {
        List list = this.f18863c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override
    public final void onNewGroupCallMessage(long j10, GroupCallMessage groupCallMessage) {
        if (this.f18863c == null) {
            this.f18863c = new ArrayList();
        }
        this.f18863c.add(0, groupCallMessage);
        o(0);
    }

    @Override
    public final void onPopGroupCallMessage() {
        List list = this.f18863c;
        if (list != null && !list.isEmpty()) {
            int size = this.f18863c.size() - 1;
            this.f18863c.remove(size);
            u(size);
        }
    }

    @Override
    public final void v(e1 e1Var, int i10) {
        b bVar = (b) e1Var;
        List list = this.f18863c;
        if (list != null && list.size() > i10) {
            ((c) bVar.f47735a).set((GroupCallMessage) this.f18863c.get(i10));
        }
    }
}
