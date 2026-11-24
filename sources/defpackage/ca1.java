package defpackage;

import android.os.Bundle;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.d;
public final class ca1 extends oc5 {
    public final int w0;
    public final d x0;

    public ca1(Bundle bundle, int i, d dVar) {
        super(bundle);
        this.w0 = i;
        this.x0 = dVar;
    }

    @Override
    public final void r0(HashSet hashSet) {
        int size = hashSet.size();
        int i = this.w0;
        if (size == 1) {
            TLRPC.User W1 = oc7.r1(i).W1((Long) hashSet.iterator().next());
            TLRPC.UserFull X1 = oc7.r1(i).X1(W1.id);
            if (X1 == null) {
                TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                tL_users_getFullUser.id = oc7.r1(i).n1(W1.id);
                ConnectionsManager.getInstance(i).sendRequest(tL_users_getFullUser, new cb7(this, i, W1, (byte) 2));
                return;
            }
            sic.m(W1, false, X1.video_calls_available, getParentActivity(), X1, j5.a(i));
        } else {
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.b.nextInt();
            ConnectionsManager.getInstance(i).sendRequest(createconferencecall, new cb7(i, hashSet, this.x0, (byte) 3));
        }
        finishFragment();
    }
}
