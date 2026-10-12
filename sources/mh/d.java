package mh;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.tgnet.TLRPC;
import s4.b1;
import s4.g0;
public abstract class d extends g0 implements GroupCallMessagesController.CallMessageListener {
    public List f15844c;
    public boolean d;
    public int e;
    public TLRPC.InputGroupCall f15845f;

    @Override
    public final int h() {
        List list = this.f15844c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override
    public final void onNewGroupCallMessage(long j10, GroupCallMessage groupCallMessage) {
        if (this.f15844c == null) {
            this.f15844c = new ArrayList();
        }
        this.f15844c.add(0, groupCallMessage);
        o(0);
    }

    @Override
    public final void onPopGroupCallMessage() {
        List list = this.f15844c;
        if (list != null && !list.isEmpty()) {
            int size = this.f15844c.size() - 1;
            this.f15844c.remove(size);
            u(size);
        }
    }

    @Override
    public final void v(b1 b1Var, int i10) {
        b bVar = (b) b1Var;
        List list = this.f15844c;
        if (list != null && list.size() > i10) {
            ((c) bVar.f44838a).set((GroupCallMessage) this.f15844c.get(i10));
        }
    }
}
