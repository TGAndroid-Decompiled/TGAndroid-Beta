package oh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.n41;

public final class i implements Utilities.Callback2 {

    public final int f19495a;

    public final o f19496b;

    public i(o oVar, int i10) {
        this.f19495a = i10;
        this.f19496b = oVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        ArrayList<TL_communities.CommunityPeer> arrayList;
        switch (this.f19495a) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                o oVar = this.f19496b;
                oVar.getClass();
                if (tL_error != null) {
                    mc.a0(oVar).d0(tL_error, false);
                }
                break;
            default:
                ArrayList arrayList2 = (ArrayList) obj;
                o oVar2 = this.f19496b;
                n nVar = oVar2.f19537r;
                n41 n41Var = new n41(-4);
                n41Var.d = 140;
                n41Var.f30837c = nVar;
                n41Var.f30857z = -1;
                arrayList2.add(n41Var);
                int i10 = 0;
                if (ChatObject.canUserDoAdminAction(oVar2.D, 1)) {
                    n41 n41VarC = n41.c(141, R.drawable.outline_profile_photo, LocaleController.getString(ChatObject.hasPhoto(oVar2.D) ? R.string.CommunitySettingsChangePhoto : R.string.CommunitySettingsSetPhoto));
                    n41VarC.f30849q = true;
                    arrayList2.add(n41VarC);
                    arrayList2.add(n41.D(2, AndroidUtilities.dp(14.0f)));
                    arrayList2.add(n41.s(0, LocaleController.getString(R.string.CommunitySectionCommunityName)));
                    arrayList2.add(n41.j(7, oVar2.f19536n));
                    arrayList2.add(n41.D(1, AndroidUtilities.dp(14.0f)));
                }
                if (ChatObject.canBlockUsers(oVar2.D)) {
                    arrayList2.add(n41.s(3, LocaleController.getString(R.string.CommunitySectionWhoCanAddChats)));
                    n41 n41VarX = n41.x(150, LocaleController.getString(R.string.CommunityWhoCanAddChatsAllMembers), LocaleController.getString(R.string.CommunityWhoCanAddChatsAllMembersInfo));
                    n41VarX.K(oVar2.h);
                    arrayList2.add(n41VarX);
                    n41 n41VarX2 = n41.x(151, LocaleController.getString(R.string.CommunityWhoCanAddChatsOnlyAdmins), LocaleController.getString(R.string.CommunityWhoCanAddChatsOnlyAdminsInfo));
                    n41VarX2.K(!oVar2.h);
                    arrayList2.add(n41VarX2);
                    arrayList2.add(n41.D(4, AndroidUtilities.dp(14.0f)));
                }
                if (ChatObject.hasAdminRights(oVar2.D)) {
                    int i11 = R.drawable.msg_admins;
                    String string = LocaleController.getString(R.string.CommunityAdministrators);
                    TLRPC.ChatFull chatFull = oVar2.E;
                    arrayList2.add(n41.d(142, i11, string, chatFull != null ? Integer.toString(chatFull.admins_count) : ""));
                    int i12 = R.drawable.community_requests_outline_24;
                    String string2 = LocaleController.getString(R.string.CommunityPendingRequests);
                    TLRPC.ChatFull chatFull2 = oVar2.E;
                    arrayList2.add(n41.d(143, i12, string2, chatFull2 != null ? Integer.toString(chatFull2.requests_pending) : ""));
                    int i13 = R.drawable.msg_user_remove;
                    String string3 = LocaleController.getString(R.string.CommunityRemovedUsers);
                    TLRPC.ChatFull chatFull3 = oVar2.E;
                    arrayList2.add(n41.d(144, i13, string3, chatFull3 != null ? Integer.toString(chatFull3.kicked_count) : ""));
                }
                arrayList2.add(n41.D(5, AndroidUtilities.dp(14.0f)));
                n41 n41VarC2 = n41.c(146, R.drawable.msg_groups_create, LocaleController.getString(R.string.CommunityMenuAddChat));
                n41VarC2.f30849q = true;
                arrayList2.add(n41VarC2);
                TLRPC.ChatFull chatFull4 = oVar2.E;
                if (chatFull4 != null && (arrayList = chatFull4.linked_peers) != null) {
                    int size = arrayList.size();
                    while (i10 < size) {
                        TL_communities.CommunityPeer communityPeer = arrayList.get(i10);
                        i10++;
                        arrayList2.add(n41.v(oVar2.getMessagesController().getUserOrChat(DialogObject.getPeerDialogId(communityPeer.peer))));
                    }
                    break;
                }
                break;
        }
    }
}
