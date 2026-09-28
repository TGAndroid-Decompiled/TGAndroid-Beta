package fi;

import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import ei.h1;
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
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.xc;
import org.telegram.ui.qy;
import org.telegram.ui.wn;
public abstract class u0 {
    public static SpannableStringBuilder a(MessageObject messageObject, String str, String str2, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        TLRPC.Message message = messageObject.messageOwner;
        TLRPC.TL_messageActionChangeCommunity tL_messageActionChangeCommunity = (TLRPC.TL_messageActionChangeCommunity) message.action;
        if (DialogObject.getPeerDialogId(message.peer_id) == DialogObject.getPeerDialogId(message.from_id)) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (tL_messageActionChangeCommunity.community_id == 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z12) {
            if (z13) {
                if (z11) {
                    i15 = R.string.CommunityServiceMessageBotRemovedUnknown;
                } else if (z10) {
                    i15 = R.string.CommunityServiceMessageChannelRemovedUnknown;
                } else {
                    i15 = R.string.CommunityServiceMessageGroupRemovedUnknown;
                }
                return AndroidUtilities.replaceTags(LocaleController.getString(i15));
            }
            if (z11) {
                i14 = R.string.CommunityServiceMessageBotAddedUnknown;
            } else if (z10) {
                i14 = R.string.CommunityServiceMessageChannelAddedUnknown;
            } else {
                i14 = R.string.CommunityServiceMessageGroupAddedUnknown;
            }
            return AndroidUtilities.replaceTags(LocaleController.formatString(i14, str));
        } else if (messageObject.isOut()) {
            if (z13) {
                if (z11) {
                    i13 = R.string.CommunityServiceMessageBotYouRemoved;
                } else if (z10) {
                    i13 = R.string.CommunityServiceMessageChannelYouRemoved;
                } else {
                    i13 = R.string.CommunityServiceMessageGroupYouRemoved;
                }
                return AndroidUtilities.replaceTags(LocaleController.getString(i13));
            }
            if (z11) {
                i12 = R.string.CommunityServiceMessageBotYouAdded;
            } else if (z10) {
                i12 = R.string.CommunityServiceMessageChannelYouAdded;
            } else {
                i12 = R.string.CommunityServiceMessageGroupYouAdded;
            }
            return AndroidUtilities.replaceTags(LocaleController.formatString(i12, str));
        } else if (z13) {
            if (z11) {
                i11 = R.string.CommunityServiceMessageBotRemoved;
            } else if (z10) {
                i11 = R.string.CommunityServiceMessageChannelRemoved;
            } else {
                i11 = R.string.CommunityServiceMessageGroupRemoved;
            }
            return AndroidUtilities.replaceTags(LocaleController.formatString(i11, str2));
        } else {
            if (z11) {
                i10 = R.string.CommunityServiceMessageBotAdded;
            } else if (z10) {
                i10 = R.string.CommunityServiceMessageChannelAdded;
            } else {
                i10 = R.string.CommunityServiceMessageGroupAdded;
            }
            return AndroidUtilities.replaceTags(LocaleController.formatString(i10, str2, str));
        }
    }

    public static int b(int i10, long j3) {
        TLRPC.Chat chat;
        long j10;
        TLRPC.User user;
        TLRPC.ChatFull chatFull;
        ArrayList<TL_communities.CommunityPeer> arrayList;
        TLRPC.Dialog dialog = null;
        if (j3 > 0) {
            TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
            if (user2 == null) {
                return 0;
            }
            j10 = user2.linked_community_id;
            user = user2;
            chat = null;
        } else {
            chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
            if (chat == null) {
                return 0;
            }
            j10 = chat.linked_community_id;
            user = null;
        }
        if (j10 != 0 && (chatFull = MessagesController.getInstance(i10).getChatFull(j10)) != null && (arrayList = chatFull.linked_peers) != null) {
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                TL_communities.CommunityPeer communityPeer = arrayList.get(i11);
                i11++;
                TL_communities.CommunityPeer communityPeer2 = communityPeer;
                if (DialogObject.getPeerDialogId(communityPeer2.peer) == j3) {
                    if (user != null) {
                        dialog = MessagesController.getInstance(i10).getDialog(user.f18483id);
                    }
                    return c(communityPeer2, chat, user, dialog);
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
            if (dialog != null) {
                return 1;
            }
            return 2;
        } else if (chat == null) {
            return 0;
        } else {
            if (ChatObject.isInChat(chat)) {
                return 1;
            }
            if (!ChatObject.isPublic(chat) && !communityPeer.can_view_history) {
                if (ChatObject.isCommunityPeerHidden(communityPeer)) {
                    return 4;
                }
                return 3;
            }
            return 2;
        }
    }

    public static void d(m2 m2Var, long j3, int i10) {
        b5 b5Var;
        wn wnVar;
        int i11;
        List list = null;
        if (!AndroidUtilities.isTablet()) {
            b5Var = m2Var.getParentLayout();
            if (b5Var != null) {
                List fragmentStack = b5Var.getFragmentStack();
                i11 = fragmentStack.size() - 2;
                while (i11 >= 0) {
                    m2 m2Var2 = (m2) fragmentStack.get(i11);
                    if (m2Var2 instanceof wn) {
                        wnVar = (wn) m2Var2;
                        if (wnVar.a() == j3) {
                            list = fragmentStack;
                            break;
                        }
                    }
                    i11--;
                }
                wnVar = null;
                list = fragmentStack;
            } else {
                wnVar = null;
            }
        } else {
            b5Var = null;
            wnVar = null;
        }
        i11 = -1;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(j3, m2Var.getCurrentAccount());
        if (i11 != -1) {
            for (int size = list.size() - 2; size > i11; size--) {
                ((ActionBarLayout) b5Var).a0((m2) list.get(size), false);
            }
            m2Var.finishFragment();
            AndroidUtilities.runOnUIThread(new p0(i10, wnVar, isChannelAndNotMegaGroup), 250L);
            return;
        }
        if (!(m2Var instanceof qy)) {
            m2Var.finishFragment();
        }
        f(xc.X(), i10, isChannelAndNotMegaGroup);
    }

    public static void e(final a2[] a2VarArr, m2 m2Var, final int i10, TLRPC.Chat chat) {
        if (a2VarArr[0] != null) {
            return;
        }
        final int fetchChatsToAddToCommunity = MessagesController.getInstance(i10).fetchChatsToAddToCommunity(new h1(a2VarArr, m2Var, i10, chat, 1));
        ConnectionsManager.getInstance(i10).bindRequestToGuid(fetchChatsToAddToCommunity, m2Var.getClassGuid());
        a2 a2Var = new a2(m2Var.getContext(), 3, null);
        a2VarArr[0] = a2Var;
        a2Var.q(500L);
        a2VarArr[0].setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public final void onCancel(DialogInterface dialogInterface) {
                ConnectionsManager.getInstance(i10).cancelRequest(fetchChatsToAddToCommunity, true);
                a2VarArr[0] = null;
            }
        });
    }

    public static void f(xc xcVar, int i10, boolean z10) {
        int i11;
        int i12;
        String string;
        int i13;
        if (i10 == 2) {
            i11 = R.raw.timer_toast;
        } else {
            i11 = R.raw.contact_check;
        }
        if (i10 == 2) {
            i12 = 24;
        } else {
            i12 = 36;
        }
        if (i10 == 0) {
            string = LocaleController.getString(R.string.CommunityCommunityCreated);
        } else if (i10 == 1) {
            if (z10) {
                i13 = R.string.CommunityCommunityJoinedChannel;
            } else {
                i13 = R.string.CommunityCommunityJoinedGroup;
            }
            string = LocaleController.getString(i13);
        } else {
            string = LocaleController.getString(R.string.CommunityCommunityPending);
        }
        xcVar.G(i11, i12, string).j();
    }
}
