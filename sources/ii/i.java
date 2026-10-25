package ii;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.wc;
public final class i implements Utilities.Callback2 {
    public final int f14355a;
    public final o f14356b;

    public i(o oVar, int i10) {
        this.f14355a = i10;
        this.f14356b = oVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        ArrayList<TL_communities.CommunityPeer> arrayList;
        String str;
        String str2;
        int i10;
        switch (this.f14355a) {
            case 0:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                o oVar = this.f14356b;
                oVar.getClass();
                if (tL_error != null) {
                    wc.b0(oVar).g0(tL_error, false);
                    return;
                }
                return;
            default:
                ArrayList arrayList2 = (ArrayList) obj;
                j71 j71Var = (j71) obj2;
                o oVar2 = this.f14356b;
                arrayList2.add(t61.l(140, oVar2.f14396s));
                int i11 = 0;
                if (ChatObject.canUserDoAdminAction(oVar2.I, 1)) {
                    int i12 = R.drawable.outline_profile_photo;
                    if (ChatObject.hasPhoto(oVar2.I)) {
                        i10 = R.string.CommunitySettingsChangePhoto;
                    } else {
                        i10 = R.string.CommunitySettingsSetPhoto;
                    }
                    t61 c10 = t61.c(141, i12, LocaleController.getString(i10));
                    c10.f32877q = true;
                    arrayList2.add(c10);
                    arrayList2.add(t61.E(2, AndroidUtilities.dp(14.0f)));
                    arrayList2.add(t61.t(0, LocaleController.getString(R.string.CommunitySectionCommunityName)));
                    arrayList2.add(t61.j(7, oVar2.f14395r));
                    arrayList2.add(t61.E(1, AndroidUtilities.dp(14.0f)));
                }
                if (ChatObject.canBlockUsers(oVar2.I)) {
                    arrayList2.add(t61.t(3, LocaleController.getString(R.string.CommunitySectionWhoCanAddChats)));
                    t61 y3 = t61.y(150, LocaleController.getString(R.string.CommunityWhoCanAddChatsAllMembers), LocaleController.getString(R.string.CommunityWhoCanAddChatsAllMembersInfo));
                    y3.L(oVar2.f14394n);
                    arrayList2.add(y3);
                    t61 y10 = t61.y(151, LocaleController.getString(R.string.CommunityWhoCanAddChatsOnlyAdmins), LocaleController.getString(R.string.CommunityWhoCanAddChatsOnlyAdminsInfo));
                    y10.L(!oVar2.f14394n);
                    arrayList2.add(y10);
                    arrayList2.add(t61.E(4, AndroidUtilities.dp(14.0f)));
                }
                if (ChatObject.hasAdminRights(oVar2.I)) {
                    int i13 = R.drawable.msg_admins;
                    String string = LocaleController.getString(R.string.CommunityAdministrators);
                    TLRPC.ChatFull chatFull = oVar2.J;
                    String str3 = "";
                    if (chatFull == null) {
                        str = "";
                    } else {
                        str = Integer.toString(chatFull.admins_count);
                    }
                    arrayList2.add(t61.d(142, i13, string, str));
                    int i14 = R.drawable.community_requests_outline_24;
                    String string2 = LocaleController.getString(R.string.CommunityPendingRequests);
                    TLRPC.ChatFull chatFull2 = oVar2.J;
                    if (chatFull2 == null) {
                        str2 = "";
                    } else {
                        str2 = Integer.toString(chatFull2.requests_pending);
                    }
                    arrayList2.add(t61.d(143, i14, string2, str2));
                    int i15 = R.drawable.msg_user_remove;
                    String string3 = LocaleController.getString(R.string.CommunityRemovedUsers);
                    TLRPC.ChatFull chatFull3 = oVar2.J;
                    if (chatFull3 != null) {
                        str3 = Integer.toString(chatFull3.kicked_count);
                    }
                    arrayList2.add(t61.d(144, i15, string3, str3));
                }
                arrayList2.add(t61.E(5, AndroidUtilities.dp(14.0f)));
                t61 c11 = t61.c(146, R.drawable.msg_groups_create, LocaleController.getString(R.string.CommunityMenuAddChat));
                c11.f32877q = true;
                arrayList2.add(c11);
                TLRPC.ChatFull chatFull4 = oVar2.J;
                if (chatFull4 != null && (arrayList = chatFull4.linked_peers) != null) {
                    int size = arrayList.size();
                    while (i11 < size) {
                        TL_communities.CommunityPeer communityPeer = arrayList.get(i11);
                        i11++;
                        arrayList2.add(t61.w(oVar2.getMessagesController().getUserOrChat(DialogObject.getPeerDialogId(communityPeer.peer))));
                    }
                    return;
                }
                return;
        }
    }
}
