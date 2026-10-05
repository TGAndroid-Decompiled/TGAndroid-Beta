package fi;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.yc;
public final class i implements Utilities.Callback2 {
    public final int f9903a;
    public final p f9904b;

    public i(p pVar, int i10) {
        this.f9903a = i10;
        this.f9904b = pVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        ArrayList<TL_communities.CommunityPeer> arrayList;
        String str;
        String str2;
        int i10;
        switch (this.f9903a) {
            case 0:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                p pVar = this.f9904b;
                pVar.getClass();
                if (tL_error != null) {
                    yc.a0(pVar).d0(tL_error, false);
                    return;
                }
                return;
            default:
                ArrayList arrayList2 = (ArrayList) obj;
                w61 w61Var = (w61) obj2;
                p pVar2 = this.f9904b;
                arrayList2.add(h61.l(140, pVar2.f9952r));
                int i11 = 0;
                if (ChatObject.canUserDoAdminAction(pVar2.H, 1)) {
                    int i12 = R.drawable.outline_profile_photo;
                    if (ChatObject.hasPhoto(pVar2.H)) {
                        i10 = R.string.CommunitySettingsChangePhoto;
                    } else {
                        i10 = R.string.CommunitySettingsSetPhoto;
                    }
                    h61 c10 = h61.c(141, i12, LocaleController.getString(i10));
                    c10.f27098q = true;
                    arrayList2.add(c10);
                    arrayList2.add(h61.E(2, AndroidUtilities.dp(14.0f)));
                    arrayList2.add(h61.t(0, LocaleController.getString(R.string.CommunitySectionCommunityName)));
                    arrayList2.add(h61.j(7, pVar2.f9951n));
                    arrayList2.add(h61.E(1, AndroidUtilities.dp(14.0f)));
                }
                if (ChatObject.canBlockUsers(pVar2.H)) {
                    arrayList2.add(h61.t(3, LocaleController.getString(R.string.CommunitySectionWhoCanAddChats)));
                    h61 y3 = h61.y(150, LocaleController.getString(R.string.CommunityWhoCanAddChatsAllMembers), LocaleController.getString(R.string.CommunityWhoCanAddChatsAllMembersInfo));
                    y3.L(pVar2.h);
                    arrayList2.add(y3);
                    h61 y10 = h61.y(151, LocaleController.getString(R.string.CommunityWhoCanAddChatsOnlyAdmins), LocaleController.getString(R.string.CommunityWhoCanAddChatsOnlyAdminsInfo));
                    y10.L(!pVar2.h);
                    arrayList2.add(y10);
                    arrayList2.add(h61.E(4, AndroidUtilities.dp(14.0f)));
                }
                if (ChatObject.hasAdminRights(pVar2.H)) {
                    int i13 = R.drawable.msg_admins;
                    String string = LocaleController.getString(R.string.CommunityAdministrators);
                    TLRPC.ChatFull chatFull = pVar2.I;
                    String str3 = "";
                    if (chatFull == null) {
                        str = "";
                    } else {
                        str = Integer.toString(chatFull.admins_count);
                    }
                    arrayList2.add(h61.d(142, i13, string, str));
                    int i14 = R.drawable.community_requests_outline_24;
                    String string2 = LocaleController.getString(R.string.CommunityPendingRequests);
                    TLRPC.ChatFull chatFull2 = pVar2.I;
                    if (chatFull2 == null) {
                        str2 = "";
                    } else {
                        str2 = Integer.toString(chatFull2.requests_pending);
                    }
                    arrayList2.add(h61.d(143, i14, string2, str2));
                    int i15 = R.drawable.msg_user_remove;
                    String string3 = LocaleController.getString(R.string.CommunityRemovedUsers);
                    TLRPC.ChatFull chatFull3 = pVar2.I;
                    if (chatFull3 != null) {
                        str3 = Integer.toString(chatFull3.kicked_count);
                    }
                    arrayList2.add(h61.d(144, i15, string3, str3));
                }
                arrayList2.add(h61.E(5, AndroidUtilities.dp(14.0f)));
                h61 c11 = h61.c(146, R.drawable.msg_groups_create, LocaleController.getString(R.string.CommunityMenuAddChat));
                c11.f27098q = true;
                arrayList2.add(c11);
                TLRPC.ChatFull chatFull4 = pVar2.I;
                if (chatFull4 != null && (arrayList = chatFull4.linked_peers) != null) {
                    int size = arrayList.size();
                    while (i11 < size) {
                        TL_communities.CommunityPeer communityPeer = arrayList.get(i11);
                        i11++;
                        arrayList2.add(h61.w(pVar2.getMessagesController().getUserOrChat(DialogObject.getPeerDialogId(communityPeer.peer))));
                    }
                    return;
                }
                return;
        }
    }
}
