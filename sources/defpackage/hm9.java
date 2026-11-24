package defpackage;

import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_phone;
public final class hm9 implements NativeInstance.PayloadCallback, NativeInstance.VideoSourcesCallback {
    public final nm9 a;

    public hm9(nm9 nm9Var) {
        this.a = nm9Var;
    }

    @Override
    public final void run(long j, int[] iArr) {
        nm9 nm9Var = this.a;
        if (nm9Var.P == null) {
            return;
        }
        TL_phone.getGroupParticipants getgroupparticipants = new TL_phone.getGroupParticipants();
        getgroupparticipants.call = nm9Var.f;
        getgroupparticipants.offset = "";
        int i = 0;
        while (i < iArr.length) {
            i = tb4.g(iArr[i], i, 1, getgroupparticipants.sources);
        }
        ConnectionsManager.getInstance(nm9Var.e).sendRequest(getgroupparticipants, new w47(nm9Var, iArr, j, (byte) 14));
    }

    @Override
    public final void run(int i, String str) {
        this.a.s(i, str);
    }
}
