package nh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.z41;
public final class i implements Utilities.Callback2 {
    public final int f18646a;
    public final o f18647b;

    public i(o oVar, int i9) {
        this.f18646a = i9;
        this.f18647b = oVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        ArrayList<TL_communities.CommunityPeer> arrayList;
        String str;
        String str2;
        int i9;
        switch (this.f18646a) {
            case 0:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                o oVar = this.f18647b;
                oVar.getClass();
                if (tL_error != null) {
                    oc.a0(oVar).d0(tL_error, false);
                    return;
                }
                return;
            default:
                ArrayList arrayList2 = (ArrayList) obj;
                z41 z41Var = (z41) obj2;
                o oVar2 = this.f18647b;
                n nVar = oVar2.f18688r;
                l41 l41Var = new l41(-4);
                l41Var.d = 140;
                l41Var.f30332c = nVar;
                l41Var.f30352z = -1;
                arrayList2.add(l41Var);
                int i10 = 0;
                if (ChatObject.canUserDoAdminAction(oVar2.D, 1)) {
                    int i11 = R.drawable.outline_profile_photo;
                    if (ChatObject.hasPhoto(oVar2.D)) {
                        i9 = R.string.CommunitySettingsChangePhoto;
                    } else {
                        i9 = R.string.CommunitySettingsSetPhoto;
                    }
                    l41 c10 = l41.c(141, i11, LocaleController.getString(i9));
                    c10.f30344q = true;
                    arrayList2.add(c10);
                    arrayList2.add(l41.D(2, AndroidUtilities.dp(14.0f)));
                    arrayList2.add(l41.s(0, LocaleController.getString(R.string.CommunitySectionCommunityName)));
                    arrayList2.add(l41.j(7, oVar2.f18687n));
                    arrayList2.add(l41.D(1, AndroidUtilities.dp(14.0f)));
                }
                if (ChatObject.canBlockUsers(oVar2.D)) {
                    arrayList2.add(l41.s(3, LocaleController.getString(R.string.CommunitySectionWhoCanAddChats)));
                    l41 x10 = l41.x(150, LocaleController.getString(R.string.CommunityWhoCanAddChatsAllMembers), LocaleController.getString(R.string.CommunityWhoCanAddChatsAllMembersInfo));
                    x10.K(oVar2.h);
                    arrayList2.add(x10);
                    l41 x11 = l41.x(151, LocaleController.getString(R.string.CommunityWhoCanAddChatsOnlyAdmins), LocaleController.getString(R.string.CommunityWhoCanAddChatsOnlyAdminsInfo));
                    x11.K(!oVar2.h);
                    arrayList2.add(x11);
                    arrayList2.add(l41.D(4, AndroidUtilities.dp(14.0f)));
                }
                if (ChatObject.hasAdminRights(oVar2.D)) {
                    int i12 = R.drawable.msg_admins;
                    String string = LocaleController.getString(R.string.CommunityAdministrators);
                    TLRPC.ChatFull chatFull = oVar2.E;
                    String str3 = "";
                    if (chatFull == null) {
                        str = "";
                    } else {
                        str = Integer.toString(chatFull.admins_count);
                    }
                    arrayList2.add(l41.d(142, i12, string, str));
                    int i13 = R.drawable.community_requests_outline_24;
                    String string2 = LocaleController.getString(R.string.CommunityPendingRequests);
                    TLRPC.ChatFull chatFull2 = oVar2.E;
                    if (chatFull2 == null) {
                        str2 = "";
                    } else {
                        str2 = Integer.toString(chatFull2.requests_pending);
                    }
                    arrayList2.add(l41.d(143, i13, string2, str2));
                    int i14 = R.drawable.msg_user_remove;
                    String string3 = LocaleController.getString(R.string.CommunityRemovedUsers);
                    TLRPC.ChatFull chatFull3 = oVar2.E;
                    if (chatFull3 != null) {
                        str3 = Integer.toString(chatFull3.kicked_count);
                    }
                    arrayList2.add(l41.d(144, i14, string3, str3));
                }
                arrayList2.add(l41.D(5, AndroidUtilities.dp(14.0f)));
                l41 c11 = l41.c(146, R.drawable.msg_groups_create, LocaleController.getString(R.string.CommunityMenuAddChat));
                c11.f30344q = true;
                arrayList2.add(c11);
                TLRPC.ChatFull chatFull4 = oVar2.E;
                if (chatFull4 != null && (arrayList = chatFull4.linked_peers) != null) {
                    int size = arrayList.size();
                    while (i10 < size) {
                        TL_communities.CommunityPeer communityPeer = arrayList.get(i10);
                        i10++;
                        arrayList2.add(l41.v(oVar2.getMessagesController().getUserOrChat(DialogObject.getPeerDialogId(communityPeer.peer))));
                    }
                    return;
                }
                return;
        }
    }
}
