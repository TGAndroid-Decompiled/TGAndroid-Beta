package mh;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.tgnet.TLRPC;
import s4.c1;
import s4.h0;
public abstract class d extends h0 implements GroupCallMessagesController.CallMessageListener {
    public List f16352c;
    public boolean d;
    public int f16353e;
    public TLRPC.InputGroupCall f16354f;

    @Override
    public final int h() {
        List list = this.f16352c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override
    public final void onNewGroupCallMessage(long j3, GroupCallMessage groupCallMessage) {
        if (this.f16352c == null) {
            this.f16352c = new ArrayList();
        }
        this.f16352c.add(0, groupCallMessage);
        o(0);
    }

    @Override
    public final void onPopGroupCallMessage() {
        List list = this.f16352c;
        if (list != null && !list.isEmpty()) {
            int size = this.f16352c.size() - 1;
            this.f16352c.remove(size);
            u(size);
        }
    }

    @Override
    public final void v(c1 c1Var, int i10) {
        b bVar = (b) c1Var;
        List list = this.f16352c;
        if (list != null && list.size() > i10) {
            ((c) bVar.f45766a).set((GroupCallMessage) this.f16352c.get(i10));
        }
    }
}
