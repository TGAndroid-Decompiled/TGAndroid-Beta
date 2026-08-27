package oh;

import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.mc;
import org.telegram.ui.gy;
import org.telegram.ui.rn;

public abstract class r0 {
    public static SpannableStringBuilder a(MessageObject messageObject, String str, String str2, boolean z10, boolean z11) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        TLRPC.Message message = messageObject.messageOwner;
        TLRPC.TL_messageActionChangeCommunity tL_messageActionChangeCommunity = (TLRPC.TL_messageActionChangeCommunity) message.action;
        boolean z12 = DialogObject.getPeerDialogId(message.peer_id) == DialogObject.getPeerDialogId(message.from_id);
        boolean z13 = tL_messageActionChangeCommunity.community_id == 0;
        if (z12) {
            if (z13) {
                if (z11) {
                    i15 = R.string.CommunityServiceMessageBotRemovedUnknown;
                } else {
                    i15 = z10 ? R.string.CommunityServiceMessageChannelRemovedUnknown : R.string.CommunityServiceMessageGroupRemovedUnknown;
                }
                return AndroidUtilities.replaceTags(LocaleController.getString(i15));
            }
            if (z11) {
                i14 = R.string.CommunityServiceMessageBotAddedUnknown;
            } else {
                i14 = z10 ? R.string.CommunityServiceMessageChannelAddedUnknown : R.string.CommunityServiceMessageGroupAddedUnknown;
            }
            return AndroidUtilities.replaceTags(LocaleController.formatString(i14, str));
        }
        if (messageObject.isOut()) {
            if (z13) {
                if (z11) {
                    i13 = R.string.CommunityServiceMessageBotYouRemoved;
                } else {
                    i13 = z10 ? R.string.CommunityServiceMessageChannelYouRemoved : R.string.CommunityServiceMessageGroupYouRemoved;
                }
                return AndroidUtilities.replaceTags(LocaleController.getString(i13));
            }
            if (z11) {
                i12 = R.string.CommunityServiceMessageBotYouAdded;
            } else {
                i12 = z10 ? R.string.CommunityServiceMessageChannelYouAdded : R.string.CommunityServiceMessageGroupYouAdded;
            }
            return AndroidUtilities.replaceTags(LocaleController.formatString(i12, str));
        }
        if (z13) {
            if (z11) {
                i11 = R.string.CommunityServiceMessageBotRemoved;
            } else {
                i11 = z10 ? R.string.CommunityServiceMessageChannelRemoved : R.string.CommunityServiceMessageGroupRemoved;
            }
            return AndroidUtilities.replaceTags(LocaleController.formatString(i11, str2));
        }
        if (z11) {
            i10 = R.string.CommunityServiceMessageBotAdded;
        } else {
            i10 = z10 ? R.string.CommunityServiceMessageChannelAdded : R.string.CommunityServiceMessageGroupAdded;
        }
        return AndroidUtilities.replaceTags(LocaleController.formatString(i10, str2, str));
    }

    public static int b(int i10, long j10) {
        TLRPC.Chat chat;
        long j11;
        TLRPC.User user;
        TLRPC.ChatFull chatFull;
        ArrayList<TL_communities.CommunityPeer> arrayList;
        if (j10 > 0) {
            TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
            if (user2 == null) {
                return 0;
            }
            j11 = user2.linked_community_id;
            user = user2;
            chat = null;
        } else {
            chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
            if (chat == null) {
                return 0;
            }
            j11 = chat.linked_community_id;
            user = null;
        }
        if (j11 != 0 && (chatFull = MessagesController.getInstance(i10).getChatFull(j11)) != null && (arrayList = chatFull.linked_peers) != null) {
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                TL_communities.CommunityPeer communityPeer = arrayList.get(i11);
                i11++;
                TL_communities.CommunityPeer communityPeer2 = communityPeer;
                if (DialogObject.getPeerDialogId(communityPeer2.peer) == j10) {
                    return c(communityPeer2, chat, user, user != null ? MessagesController.getInstance(i10).getDialog(user.f22527id) : null);
                }
            }
        }
        return 0;
    }

    public static int c(TL_communities.CommunityPeer communityPeer, TLRPC.Chat chat, TLRPC.User user, TLRPC.Dialog dialog) {
        if (communityPeer == null) {
            return 0;
        }
        if (user != null) {
            return dialog != null ? 1 : 2;
        }
        if (chat == null) {
            return 0;
        }
        if (ChatObject.isInChat(chat)) {
            return 1;
        }
        if (ChatObject.isPublic(chat) || communityPeer.can_view_history) {
            return 2;
        }
        return ChatObject.isCommunityPeerHidden(communityPeer) ? 4 : 3;
    }

    public static void d(n2 n2Var, long j10, int i10) {
        b5 parentLayout;
        rn rnVar;
        int size;
        boolean zIsChannelAndNotMegaGroup;
        int size2;
        List list = null;
        if (AndroidUtilities.isTablet()) {
            parentLayout = null;
            rnVar = null;
        } else {
            parentLayout = n2Var.getParentLayout();
            if (parentLayout != null) {
                List fragmentStack = parentLayout.getFragmentStack();
                size = fragmentStack.size() - 2;
                while (true) {
                    if (size >= 0) {
                        n2 n2Var2 = (n2) fragmentStack.get(size);
                        if (n2Var2 instanceof rn) {
                            rnVar = (rn) n2Var2;
                            if (rnVar.a() == j10) {
                                list = fragmentStack;
                                break;
                            }
                        }
                        size--;
                    } else {
                        rnVar = null;
                        list = fragmentStack;
                    }
                }
                zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(j10, n2Var.getCurrentAccount());
                if (size != -1) {
                    if (!(n2Var instanceof gy)) {
                        n2Var.finishFragment();
                    }
                    f(mc.X(), i10, zIsChannelAndNotMegaGroup);
                    return;
                }
                for (size2 = list.size() - 2; size2 > size; size2--) {
                    ((ActionBarLayout) parentLayout).a0((n2) list.get(size2), false);
                }
                n2Var.finishFragment();
                AndroidUtilities.runOnUIThread(new m0(i10, rnVar, zIsChannelAndNotMegaGroup), 250L);
            }
            rnVar = null;
        }
        size = -1;
        zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(j10, n2Var.getCurrentAccount());
        if (size != -1) {
            if (!(n2Var instanceof gy)) {
                n2Var.finishFragment();
            }
            f(mc.X(), i10, zIsChannelAndNotMegaGroup);
            return;
        }
        while (size2 > size) {
            ((ActionBarLayout) parentLayout).a0((n2) list.get(size2), false);
        }
        n2Var.finishFragment();
        AndroidUtilities.runOnUIThread(new m0(i10, rnVar, zIsChannelAndNotMegaGroup), 250L);
    }

    public static void e(final b2[] b2VarArr, n2 n2Var, final int i10, TLRPC.Chat chat) {
        if (b2VarArr[0] != null) {
            return;
        }
        final int iFetchChatsToAddToCommunity = MessagesController.getInstance(i10).fetchChatsToAddToCommunity(new hh.j0(b2VarArr, n2Var, i10, chat));
        ConnectionsManager.getInstance(i10).bindRequestToGuid(iFetchChatsToAddToCommunity, n2Var.getClassGuid());
        b2 b2Var = new b2(n2Var.getContext(), 3, null);
        b2VarArr[0] = b2Var;
        b2Var.q(500L);
        b2VarArr[0].setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public final void onCancel(DialogInterface dialogInterface) {
                ConnectionsManager.getInstance(i10).cancelRequest(iFetchChatsToAddToCommunity, true);
                b2VarArr[0] = null;
            }
        });
    }

    public static void f(mc mcVar, int i10, boolean z10) {
        String string;
        int i11 = i10 == 2 ? R.raw.timer_toast : R.raw.contact_check;
        int i12 = i10 == 2 ? 24 : 36;
        if (i10 == 0) {
            string = LocaleController.getString(R.string.CommunityCommunityCreated);
        } else if (i10 == 1) {
            string = LocaleController.getString(z10 ? R.string.CommunityCommunityJoinedChannel : R.string.CommunityCommunityJoinedGroup);
        } else {
            string = LocaleController.getString(R.string.CommunityCommunityPending);
        }
        mcVar.G(i11, i12, string).j();
    }
}
