package nh;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.tgnet.TLRPC;
import v4.f1;
import v4.i0;
public abstract class d extends i0 implements GroupCallMessagesController.CallMessageListener {
    public List f21539c;
    public boolean d;
    public int f21540e;
    public TLRPC.InputGroupCall f21541f;

    @Override
    public final int b() {
        List list = this.f21539c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override
    public final void onNewGroupCallMessage(long j3, GroupCallMessage groupCallMessage) {
        if (this.f21539c == null) {
            this.f21539c = new ArrayList();
        }
        this.f21539c.add(0, groupCallMessage);
        i(0);
    }

    @Override
    public final void onPopGroupCallMessage() {
        List list = this.f21539c;
        if (list != null && !list.isEmpty()) {
            int size = this.f21539c.size() - 1;
            this.f21539c.remove(size);
            s(size);
        }
    }

    @Override
    public final void t(f1 f1Var, int i7) {
        b bVar = (b) f1Var;
        List list = this.f21539c;
        if (list != null && list.size() > i7) {
            ((c) bVar.f59122a).set((GroupCallMessage) this.f21539c.get(i7));
        }
    }
}
