package mh;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.tgnet.TLRPC;
import s4.c1;
import s4.h0;
public abstract class d extends h0 implements GroupCallMessagesController.CallMessageListener {
    public List f16325c;
    public boolean d;
    public int f16326e;
    public TLRPC.InputGroupCall f16327f;

    @Override
    public final int h() {
        List list = this.f16325c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override
    public final void onNewGroupCallMessage(long j3, GroupCallMessage groupCallMessage) {
        if (this.f16325c == null) {
            this.f16325c = new ArrayList();
        }
        this.f16325c.add(0, groupCallMessage);
        o(0);
    }

    @Override
    public final void onPopGroupCallMessage() {
        List list = this.f16325c;
        if (list != null && !list.isEmpty()) {
            int size = this.f16325c.size() - 1;
            this.f16325c.remove(size);
            u(size);
        }
    }

    @Override
    public final void v(c1 c1Var, int i10) {
        b bVar = (b) c1Var;
        List list = this.f16325c;
        if (list != null && list.size() > i10) {
            ((c) bVar.f45738a).set((GroupCallMessage) this.f16325c.get(i10));
        }
    }
}
