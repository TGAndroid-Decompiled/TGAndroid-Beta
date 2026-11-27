package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.LaunchActivity;
public final class b66 extends rc5 {
    public b66(e66 e66Var, Bundle bundle) {
        super(bundle);
    }

    @Override
    public final void q0(HashSet hashSet) {
        if (hashSet.size() == 1) {
            TLRPC.User X1 = getMessagesController().X1((Long) hashSet.iterator().next());
            TLRPC.UserFull Y1 = getMessagesController().Y1(X1.id);
            if (Y1 == null) {
                TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                tL_users_getFullUser.id = getMessagesController().o1(X1.id);
                getConnectionsManager().sendRequest(tL_users_getFullUser, new mw3(this, X1, (byte) 17));
                return;
            }
            xkc.m(X1, false, Y1.video_calls_available, getParentActivity(), Y1, getAccountInstance());
        } else {
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.b.nextInt();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(createconferencecall, new mw3(this, hashSet, (byte) 18));
        }
        finishFragment();
    }

    public final void z0(TLObject tLObject, HashSet hashSet, TLRPC.TL_error tL_error) {
        int i = 0;
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            uc7.s1(this.currentAccount).j4(updates.users, false);
            uc7.s1(this.currentAccount).c4(updates.chats, false);
            ArrayList z0 = uc7.z0(updates, TL_update.TL_updateGroupCall.class);
            int size = z0.size();
            TLRPC.GroupCall groupCall = null;
            while (i < size) {
                Object obj = z0.get(i);
                i++;
                groupCall = ((TL_update.TL_updateGroupCall) obj).call;
            }
            if (LaunchActivity.H1 != null && groupCall != null) {
                TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                tL_inputGroupCall.id = groupCall.id;
                tL_inputGroupCall.access_hash = groupCall.access_hash;
                xkc.g(LaunchActivity.H1, this.currentAccount, tL_inputGroupCall, false, groupCall, hashSet);
            }
        } else if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            uc7.s1(this.currentAccount).j4(groupcall.users, false);
            uc7.s1(this.currentAccount).c4(groupcall.chats, false);
            if (LaunchActivity.H1 != null) {
                TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                TLRPC.GroupCall groupCall2 = groupcall.call;
                tL_inputGroupCall2.id = groupCall2.id;
                tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                xkc.g(LaunchActivity.H1, this.currentAccount, tL_inputGroupCall2, false, groupCall2, hashSet);
            }
        } else if (tL_error != null) {
            e66.d().g0(tL_error, false);
        }
    }
}
