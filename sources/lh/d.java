package lh;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.tgnet.TLRPC;
import s4.d1;
import s4.i0;
public abstract class d extends i0 implements GroupCallMessagesController.CallMessageListener {
    public List f15597c;
    public boolean d;
    public int f15598e;
    public TLRPC.InputGroupCall f15599f;

    @Override
    public final int h() {
        List list = this.f15597c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override
    public final void onNewGroupCallMessage(long j3, GroupCallMessage groupCallMessage) {
        if (this.f15597c == null) {
            this.f15597c = new ArrayList();
        }
        this.f15597c.add(0, groupCallMessage);
        o(0);
    }

    @Override
    public final void onPopGroupCallMessage() {
        List list = this.f15597c;
        if (list != null && !list.isEmpty()) {
            int size = this.f15597c.size() - 1;
            this.f15597c.remove(size);
            u(size);
        }
    }

    @Override
    public final void v(d1 d1Var, int i10) {
        b bVar = (b) d1Var;
        List list = this.f15597c;
        if (list != null && list.size() > i10) {
            ((c) bVar.f47748a).set((GroupCallMessage) this.f15597c.get(i10));
        }
    }
}
