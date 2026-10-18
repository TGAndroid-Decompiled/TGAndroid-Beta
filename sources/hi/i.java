package hi;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.xc;
public final class i implements Utilities.Callback2 {
    public final int f12160a;
    public final o f12161b;

    public i(o oVar, int i10) {
        this.f12160a = i10;
        this.f12161b = oVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        ArrayList<TL_communities.CommunityPeer> arrayList;
        String str;
        String str2;
        int i10;
        switch (this.f12160a) {
            case 0:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                o oVar = this.f12161b;
                oVar.getClass();
                if (tL_error != null) {
                    xc.a0(oVar).f0(tL_error, false);
                    return;
                }
                return;
            default:
                ArrayList arrayList2 = (ArrayList) obj;
                s61 s61Var = (s61) obj2;
                o oVar2 = this.f12161b;
                n nVar = oVar2.f12199r;
                f61 f61Var = new f61(-4);
                f61Var.d = 140;
                f61Var.f26141c = nVar;
                f61Var.f26160z = -1;
                arrayList2.add(f61Var);
                int i11 = 0;
                if (ChatObject.canUserDoAdminAction(oVar2.H, 1)) {
                    int i12 = R.drawable.outline_profile_photo;
                    if (ChatObject.hasPhoto(oVar2.H)) {
                        i10 = R.string.CommunitySettingsChangePhoto;
                    } else {
                        i10 = R.string.CommunitySettingsSetPhoto;
                    }
                    f61 c10 = f61.c(141, i12, LocaleController.getString(i10));
                    c10.f26152q = true;
                    arrayList2.add(c10);
                    arrayList2.add(f61.D(2, AndroidUtilities.dp(14.0f)));
                    arrayList2.add(f61.s(0, LocaleController.getString(R.string.CommunitySectionCommunityName)));
                    arrayList2.add(f61.j(7, oVar2.f12198n));
                    arrayList2.add(f61.D(1, AndroidUtilities.dp(14.0f)));
                }
                if (ChatObject.canBlockUsers(oVar2.H)) {
                    arrayList2.add(f61.s(3, LocaleController.getString(R.string.CommunitySectionWhoCanAddChats)));
                    f61 x10 = f61.x(150, LocaleController.getString(R.string.CommunityWhoCanAddChatsAllMembers), LocaleController.getString(R.string.CommunityWhoCanAddChatsAllMembersInfo));
                    x10.K(oVar2.h);
                    arrayList2.add(x10);
                    f61 x11 = f61.x(151, LocaleController.getString(R.string.CommunityWhoCanAddChatsOnlyAdmins), LocaleController.getString(R.string.CommunityWhoCanAddChatsOnlyAdminsInfo));
                    x11.K(!oVar2.h);
                    arrayList2.add(x11);
                    arrayList2.add(f61.D(4, AndroidUtilities.dp(14.0f)));
                }
                if (ChatObject.hasAdminRights(oVar2.H)) {
                    int i13 = R.drawable.msg_admins;
                    String string = LocaleController.getString(R.string.CommunityAdministrators);
                    TLRPC.ChatFull chatFull = oVar2.I;
                    String str3 = "";
                    if (chatFull == null) {
                        str = "";
                    } else {
                        str = Integer.toString(chatFull.admins_count);
                    }
                    arrayList2.add(f61.d(142, i13, string, str));
                    int i14 = R.drawable.community_requests_outline_24;
                    String string2 = LocaleController.getString(R.string.CommunityPendingRequests);
                    TLRPC.ChatFull chatFull2 = oVar2.I;
                    if (chatFull2 == null) {
                        str2 = "";
                    } else {
                        str2 = Integer.toString(chatFull2.requests_pending);
                    }
                    arrayList2.add(f61.d(143, i14, string2, str2));
                    int i15 = R.drawable.msg_user_remove;
                    String string3 = LocaleController.getString(R.string.CommunityRemovedUsers);
                    TLRPC.ChatFull chatFull3 = oVar2.I;
                    if (chatFull3 != null) {
                        str3 = Integer.toString(chatFull3.kicked_count);
                    }
                    arrayList2.add(f61.d(144, i15, string3, str3));
                }
                arrayList2.add(f61.D(5, AndroidUtilities.dp(14.0f)));
                f61 c11 = f61.c(146, R.drawable.msg_groups_create, LocaleController.getString(R.string.CommunityMenuAddChat));
                c11.f26152q = true;
                arrayList2.add(c11);
                TLRPC.ChatFull chatFull4 = oVar2.I;
                if (chatFull4 != null && (arrayList = chatFull4.linked_peers) != null) {
                    int size = arrayList.size();
                    while (i11 < size) {
                        TL_communities.CommunityPeer communityPeer = arrayList.get(i11);
                        i11++;
                        arrayList2.add(f61.v(oVar2.getMessagesController().getUserOrChat(DialogObject.getPeerDialogId(communityPeer.peer))));
                    }
                    return;
                }
                return;
        }
    }
}
