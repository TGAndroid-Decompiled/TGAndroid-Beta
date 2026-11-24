package defpackage;

import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_phone;
public final class io9 implements NativeInstance.PayloadCallback, NativeInstance.VideoSourcesCallback {
    public final oo9 a;

    public io9(oo9 oo9Var) {
        this.a = oo9Var;
    }

    @Override
    public final void run(long j, int[] iArr) {
        oo9 oo9Var = this.a;
        if (oo9Var.P == null) {
            return;
        }
        TL_phone.getGroupParticipants getgroupparticipants = new TL_phone.getGroupParticipants();
        getgroupparticipants.call = oo9Var.f;
        getgroupparticipants.offset = "";
        int i = 0;
        while (i < iArr.length) {
            i = td4.g(iArr[i], i, 1, getgroupparticipants.sources);
        }
        ConnectionsManager.getInstance(oo9Var.e).sendRequest(getgroupparticipants, new jb7(oo9Var, iArr, j, (byte) 14));
    }

    @Override
    public final void run(int i, String str) {
        this.a.s(i, str);
    }
}
