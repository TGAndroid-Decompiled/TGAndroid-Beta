package defpackage;

import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_phone;
public final class zp9 implements NativeInstance.PayloadCallback, NativeInstance.VideoSourcesCallback {
    public final dq9 a;

    public zp9(dq9 dq9Var) {
        this.a = dq9Var;
    }

    @Override
    public final void run(long j, int[] iArr) {
        dq9 dq9Var = this.a;
        if (dq9Var.P == null) {
            return;
        }
        TL_phone.getGroupParticipants getgroupparticipants = new TL_phone.getGroupParticipants();
        getgroupparticipants.call = dq9Var.f;
        getgroupparticipants.offset = "";
        int i = 0;
        while (i < iArr.length) {
            i = qd4.g(iArr[i], i, 1, getgroupparticipants.sources);
        }
        ConnectionsManager.getInstance(dq9Var.e).sendRequest(getgroupparticipants, new p87(dq9Var, iArr, j, (byte) 15));
    }

    @Override
    public final void run(int i, String str) {
        this.a.s(i, str);
    }
}
