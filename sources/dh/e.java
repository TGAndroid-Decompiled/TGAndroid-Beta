package dh;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.tgnet.TLRPC;
import s4.c1;
import s4.g0;
public abstract class e extends g0 implements GroupCallMessagesController.CallMessageListener {
    public List f5945c;
    public boolean d;
    public int e;
    public TLRPC.InputGroupCall f5946f;

    @Override
    public final int b() {
        List list = this.f5945c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override
    public final void onNewGroupCallMessage(long j10, GroupCallMessage groupCallMessage) {
        if (this.f5945c == null) {
            this.f5945c = new ArrayList();
        }
        this.f5945c.add(0, groupCallMessage);
        i(0);
    }

    @Override
    public final void onPopGroupCallMessage() {
        List list = this.f5945c;
        if (list != null && !list.isEmpty()) {
            int size = this.f5945c.size() - 1;
            this.f5945c.remove(size);
            s(size);
        }
    }

    @Override
    public final void t(c1 c1Var, int i10) {
        c cVar = (c) c1Var;
        List list = this.f5945c;
        if (list != null && list.size() > i10) {
            ((d) cVar.f47909a).set((GroupCallMessage) this.f5945c.get(i10));
        }
    }
}
