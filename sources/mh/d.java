package mh;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.tgnet.TLRPC;
import s4.b1;
import s4.g0;
public abstract class d extends g0 implements GroupCallMessagesController.CallMessageListener {
    public List f16937c;
    public boolean d;
    public int e;
    public TLRPC.InputGroupCall f16938f;

    @Override
    public final int h() {
        List list = this.f16937c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override
    public final void onNewGroupCallMessage(long j10, GroupCallMessage groupCallMessage) {
        if (this.f16937c == null) {
            this.f16937c = new ArrayList();
        }
        this.f16937c.add(0, groupCallMessage);
        o(0);
    }

    @Override
    public final void onPopGroupCallMessage() {
        List list = this.f16937c;
        if (list != null && !list.isEmpty()) {
            int size = this.f16937c.size() - 1;
            this.f16937c.remove(size);
            u(size);
        }
    }

    @Override
    public final void v(b1 b1Var, int i10) {
        b bVar = (b) b1Var;
        List list = this.f16937c;
        if (list != null && list.size() > i10) {
            ((c) bVar.f45921a).set((GroupCallMessage) this.f16937c.get(i10));
        }
    }
}
