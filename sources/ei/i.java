package ei;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.wc;
public final class i implements Utilities.Callback2 {
    public final int f7558a;
    public final p f7559b;

    public i(p pVar, int i10) {
        this.f7558a = i10;
        this.f7559b = pVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        ArrayList<TL_communities.CommunityPeer> arrayList;
        String str;
        String str2;
        int i10;
        switch (this.f7558a) {
            case 0:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                p pVar = this.f7559b;
                pVar.getClass();
                if (tL_error != null) {
                    wc.a0(pVar).d0(tL_error, false);
                    return;
                }
                return;
            default:
                ArrayList arrayList2 = (ArrayList) obj;
                j61 j61Var = (j61) obj2;
                p pVar2 = this.f7559b;
                n nVar = pVar2.f7601r;
                v51 v51Var = new v51(-4);
                v51Var.d = 140;
                v51Var.f27823c = nVar;
                v51Var.f27842z = -1;
                arrayList2.add(v51Var);
                int i11 = 0;
                if (ChatObject.canUserDoAdminAction(pVar2.H, 1)) {
                    int i12 = R.drawable.outline_profile_photo;
                    if (ChatObject.hasPhoto(pVar2.H)) {
                        i10 = R.string.CommunitySettingsChangePhoto;
                    } else {
                        i10 = R.string.CommunitySettingsSetPhoto;
                    }
                    v51 c10 = v51.c(141, i12, LocaleController.getString(i10));
                    c10.f27834q = true;
                    arrayList2.add(c10);
                    arrayList2.add(v51.D(2, AndroidUtilities.dp(14.0f)));
                    arrayList2.add(v51.s(0, LocaleController.getString(R.string.CommunitySectionCommunityName)));
                    arrayList2.add(v51.j(7, pVar2.f7600n));
                    arrayList2.add(v51.D(1, AndroidUtilities.dp(14.0f)));
                }
                if (ChatObject.canBlockUsers(pVar2.H)) {
                    arrayList2.add(v51.s(3, LocaleController.getString(R.string.CommunitySectionWhoCanAddChats)));
                    v51 x10 = v51.x(150, LocaleController.getString(R.string.CommunityWhoCanAddChatsAllMembers), LocaleController.getString(R.string.CommunityWhoCanAddChatsAllMembersInfo));
                    x10.K(pVar2.h);
                    arrayList2.add(x10);
                    v51 x11 = v51.x(151, LocaleController.getString(R.string.CommunityWhoCanAddChatsOnlyAdmins), LocaleController.getString(R.string.CommunityWhoCanAddChatsOnlyAdminsInfo));
                    x11.K(!pVar2.h);
                    arrayList2.add(x11);
                    arrayList2.add(v51.D(4, AndroidUtilities.dp(14.0f)));
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
                    arrayList2.add(v51.d(142, i13, string, str));
                    int i14 = R.drawable.community_requests_outline_24;
                    String string2 = LocaleController.getString(R.string.CommunityPendingRequests);
                    TLRPC.ChatFull chatFull2 = pVar2.I;
                    if (chatFull2 == null) {
                        str2 = "";
                    } else {
                        str2 = Integer.toString(chatFull2.requests_pending);
                    }
                    arrayList2.add(v51.d(143, i14, string2, str2));
                    int i15 = R.drawable.msg_user_remove;
                    String string3 = LocaleController.getString(R.string.CommunityRemovedUsers);
                    TLRPC.ChatFull chatFull3 = pVar2.I;
                    if (chatFull3 != null) {
                        str3 = Integer.toString(chatFull3.kicked_count);
                    }
                    arrayList2.add(v51.d(144, i15, string3, str3));
                }
                arrayList2.add(v51.D(5, AndroidUtilities.dp(14.0f)));
                v51 c11 = v51.c(146, R.drawable.msg_groups_create, LocaleController.getString(R.string.CommunityMenuAddChat));
                c11.f27834q = true;
                arrayList2.add(c11);
                TLRPC.ChatFull chatFull4 = pVar2.I;
                if (chatFull4 != null && (arrayList = chatFull4.linked_peers) != null) {
                    int size = arrayList.size();
                    while (i11 < size) {
                        TL_communities.CommunityPeer communityPeer = arrayList.get(i11);
                        i11++;
                        arrayList2.add(v51.v(pVar2.getMessagesController().getUserOrChat(DialogObject.getPeerDialogId(communityPeer.peer))));
                    }
                    return;
                }
                return;
        }
    }
}
