package lh;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.tgnet.TLRPC;
import s4.c1;
import s4.h0;
public abstract class d extends h0 implements GroupCallMessagesController.CallMessageListener {
    public List f14117c;
    public boolean d;
    public int e;
    public TLRPC.InputGroupCall f14118f;

    @Override
    public final int h() {
        List list = this.f14117c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override
    public final void onNewGroupCallMessage(long j3, GroupCallMessage groupCallMessage) {
        if (this.f14117c == null) {
            this.f14117c = new ArrayList();
        }
        this.f14117c.add(0, groupCallMessage);
        o(0);
    }

    @Override
    public final void onPopGroupCallMessage() {
        List list = this.f14117c;
        if (list != null && !list.isEmpty()) {
            int size = this.f14117c.size() - 1;
            this.f14117c.remove(size);
            u(size);
        }
    }

    @Override
    public final void v(c1 c1Var, int i10) {
        b bVar = (b) c1Var;
        List list = this.f14117c;
        if (list != null && list.size() > i10) {
            ((c) bVar.f42675a).set((GroupCallMessage) this.f14117c.get(i10));
        }
    }
}
