package defpackage;

import android.os.Bundle;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.d;
public final class t81 extends qa5 {
    public final int w0;
    public final d x0;

    public t81(Bundle bundle, int i, d dVar) {
        super(bundle);
        this.w0 = i;
        this.x0 = dVar;
    }

    @Override
    public final void q0(HashSet hashSet) {
        int size = hashSet.size();
        int i = this.w0;
        if (size == 1) {
            TLRPC.User V1 = na7.q1(i).V1((Long) hashSet.iterator().next());
            TLRPC.UserFull W1 = na7.q1(i).W1(V1.id);
            if (W1 == null) {
                TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                tL_users_getFullUser.id = na7.q1(i).m1(V1.id);
                ConnectionsManager.getInstance(i).sendRequest(tL_users_getFullUser, new b97(this, i, V1, (byte) 2));
                return;
            }
            rgc.m(V1, false, W1.video_calls_available, getParentActivity(), W1, j5.a(i));
        } else {
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.b.nextInt();
            ConnectionsManager.getInstance(i).sendRequest(createconferencecall, new b97(i, hashSet, this.x0));
        }
        finishFragment();
    }
}
