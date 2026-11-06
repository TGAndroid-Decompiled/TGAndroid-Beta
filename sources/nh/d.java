package nh;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.tgnet.TLRPC;
import v4.d1;
import v4.g0;
public abstract class d extends g0 implements GroupCallMessagesController.CallMessageListener {
    public List f20602c;
    public boolean d;
    public int f20603e;
    public TLRPC.InputGroupCall f20604f;

    @Override
    public final int b() {
        List list = this.f20602c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override
    public final void onNewGroupCallMessage(long j3, GroupCallMessage groupCallMessage) {
        if (this.f20602c == null) {
            this.f20602c = new ArrayList();
        }
        this.f20602c.add(0, groupCallMessage);
        i(0);
    }

    @Override
    public final void onPopGroupCallMessage() {
        List list = this.f20602c;
        if (list != null && !list.isEmpty()) {
            int size = this.f20602c.size() - 1;
            this.f20602c.remove(size);
            s(size);
        }
    }

    @Override
    public final void t(d1 d1Var, int i7) {
        b bVar = (b) d1Var;
        List list = this.f20602c;
        if (list != null && list.size() > i7) {
            ((c) bVar.f56927a).set((GroupCallMessage) this.f20602c.get(i7));
        }
    }
}
