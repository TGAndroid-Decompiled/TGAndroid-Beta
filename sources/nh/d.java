package nh;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.tgnet.TLRPC;
import v4.f1;
import v4.i0;
public abstract class d extends i0 implements GroupCallMessagesController.CallMessageListener {
    public List f21564c;
    public boolean d;
    public int f21565e;
    public TLRPC.InputGroupCall f21566f;

    @Override
    public final int b() {
        List list = this.f21564c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override
    public final void onNewGroupCallMessage(long j3, GroupCallMessage groupCallMessage) {
        if (this.f21564c == null) {
            this.f21564c = new ArrayList();
        }
        this.f21564c.add(0, groupCallMessage);
        i(0);
    }

    @Override
    public final void onPopGroupCallMessage() {
        List list = this.f21564c;
        if (list != null && !list.isEmpty()) {
            int size = this.f21564c.size() - 1;
            this.f21564c.remove(size);
            s(size);
        }
    }

    @Override
    public final void t(f1 f1Var, int i7) {
        b bVar = (b) f1Var;
        List list = this.f21564c;
        if (list != null && list.size() > i7) {
            ((c) bVar.f59161a).set((GroupCallMessage) this.f21564c.get(i7));
        }
    }
}
