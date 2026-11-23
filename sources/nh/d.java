package nh;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.tgnet.TLRPC;
import v4.e1;
import v4.h0;
public abstract class d extends h0 implements GroupCallMessagesController.CallMessageListener {
    public List f21533c;
    public boolean d;
    public int f21534e;
    public TLRPC.InputGroupCall f21535f;

    @Override
    public final int b() {
        List list = this.f21533c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override
    public final void onNewGroupCallMessage(long j3, GroupCallMessage groupCallMessage) {
        if (this.f21533c == null) {
            this.f21533c = new ArrayList();
        }
        this.f21533c.add(0, groupCallMessage);
        i(0);
    }

    @Override
    public final void onPopGroupCallMessage() {
        List list = this.f21533c;
        if (list != null && !list.isEmpty()) {
            int size = this.f21533c.size() - 1;
            this.f21533c.remove(size);
            s(size);
        }
    }

    @Override
    public final void t(e1 e1Var, int i7) {
        b bVar = (b) e1Var;
        List list = this.f21533c;
        if (list != null && list.size() > i7) {
            ((c) bVar.f59111a).set((GroupCallMessage) this.f21533c.get(i7));
        }
    }
}
