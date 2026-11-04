package oh;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.tgnet.TLRPC;
import u4.d1;
import u4.h0;
public abstract class d extends h0 implements GroupCallMessagesController.CallMessageListener {
    public List f21122c;
    public boolean d;
    public int f21123e;
    public TLRPC.InputGroupCall f21124f;

    @Override
    public final int b() {
        List list = this.f21122c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override
    public final void onNewGroupCallMessage(long j10, GroupCallMessage groupCallMessage) {
        if (this.f21122c == null) {
            this.f21122c = new ArrayList();
        }
        this.f21122c.add(0, groupCallMessage);
        i(0);
    }

    @Override
    public final void onPopGroupCallMessage() {
        List list = this.f21122c;
        if (list != null && !list.isEmpty()) {
            int size = this.f21122c.size() - 1;
            this.f21122c.remove(size);
            s(size);
        }
    }

    @Override
    public final void t(d1 d1Var, int i3) {
        b bVar = (b) d1Var;
        List list = this.f21122c;
        if (list != null && list.size() > i3) {
            ((c) bVar.f55540a).set((GroupCallMessage) this.f21122c.get(i3));
        }
    }
}
