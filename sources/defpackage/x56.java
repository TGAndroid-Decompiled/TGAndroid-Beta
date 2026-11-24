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
public final class x56 extends oc5 {
    public x56(a66 a66Var, Bundle bundle) {
        super(bundle);
    }

    @Override
    public final void r0(HashSet hashSet) {
        if (hashSet.size() == 1) {
            TLRPC.User W1 = getMessagesController().W1((Long) hashSet.iterator().next());
            TLRPC.UserFull X1 = getMessagesController().X1(W1.id);
            if (X1 == null) {
                TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                tL_users_getFullUser.id = getMessagesController().n1(W1.id);
                getConnectionsManager().sendRequest(tL_users_getFullUser, new cx3(this, W1, (byte) 17));
                return;
            }
            sic.m(W1, false, X1.video_calls_available, getParentActivity(), X1, getAccountInstance());
        } else {
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.b.nextInt();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(createconferencecall, new cx3(this, hashSet, (byte) 18));
        }
        finishFragment();
    }

    public final void z0(TLObject tLObject, HashSet hashSet, TLRPC.TL_error tL_error) {
        int i = 0;
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            oc7.r1(this.currentAccount).d4(updates.users, false);
            oc7.r1(this.currentAccount).X3(updates.chats, false);
            ArrayList x0 = oc7.x0(updates, TL_update.TL_updateGroupCall.class);
            int size = x0.size();
            TLRPC.GroupCall groupCall = null;
            while (i < size) {
                Object obj = x0.get(i);
                i++;
                groupCall = ((TL_update.TL_updateGroupCall) obj).call;
            }
            if (LaunchActivity.H1 != null && groupCall != null) {
                TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                tL_inputGroupCall.id = groupCall.id;
                tL_inputGroupCall.access_hash = groupCall.access_hash;
                sic.g(LaunchActivity.H1, this.currentAccount, tL_inputGroupCall, false, groupCall, hashSet);
            }
        } else if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            oc7.r1(this.currentAccount).d4(groupcall.users, false);
            oc7.r1(this.currentAccount).X3(groupcall.chats, false);
            if (LaunchActivity.H1 != null) {
                TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                TLRPC.GroupCall groupCall2 = groupcall.call;
                tL_inputGroupCall2.id = groupCall2.id;
                tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                sic.g(LaunchActivity.H1, this.currentAccount, tL_inputGroupCall2, false, groupCall2, hashSet);
            }
        } else if (tL_error != null) {
            a66.d().g0(tL_error, false);
        }
    }
}
