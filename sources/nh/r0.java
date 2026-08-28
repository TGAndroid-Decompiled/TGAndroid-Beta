package nh;

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
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.oc;
import org.telegram.ui.dy;
import org.telegram.ui.qn;
public abstract class r0 {
    public static SpannableStringBuilder a(MessageObject messageObject, String str, String str2, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
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
                    i14 = R.string.CommunityServiceMessageBotRemovedUnknown;
                } else if (z10) {
                    i14 = R.string.CommunityServiceMessageChannelRemovedUnknown;
                } else {
                    i14 = R.string.CommunityServiceMessageGroupRemovedUnknown;
                }
                return AndroidUtilities.replaceTags(LocaleController.getString(i14));
            }
            if (z11) {
                i13 = R.string.CommunityServiceMessageBotAddedUnknown;
            } else if (z10) {
                i13 = R.string.CommunityServiceMessageChannelAddedUnknown;
            } else {
                i13 = R.string.CommunityServiceMessageGroupAddedUnknown;
            }
            return AndroidUtilities.replaceTags(LocaleController.formatString(i13, str));
        } else if (messageObject.isOut()) {
            if (z13) {
                if (z11) {
                    i12 = R.string.CommunityServiceMessageBotYouRemoved;
                } else if (z10) {
                    i12 = R.string.CommunityServiceMessageChannelYouRemoved;
                } else {
                    i12 = R.string.CommunityServiceMessageGroupYouRemoved;
                }
                return AndroidUtilities.replaceTags(LocaleController.getString(i12));
            }
            if (z11) {
                i11 = R.string.CommunityServiceMessageBotYouAdded;
            } else if (z10) {
                i11 = R.string.CommunityServiceMessageChannelYouAdded;
            } else {
                i11 = R.string.CommunityServiceMessageGroupYouAdded;
            }
            return AndroidUtilities.replaceTags(LocaleController.formatString(i11, str));
        } else if (z13) {
            if (z11) {
                i10 = R.string.CommunityServiceMessageBotRemoved;
            } else if (z10) {
                i10 = R.string.CommunityServiceMessageChannelRemoved;
            } else {
                i10 = R.string.CommunityServiceMessageGroupRemoved;
            }
            return AndroidUtilities.replaceTags(LocaleController.formatString(i10, str2));
        } else {
            if (z11) {
                i9 = R.string.CommunityServiceMessageBotAdded;
            } else if (z10) {
                i9 = R.string.CommunityServiceMessageChannelAdded;
            } else {
                i9 = R.string.CommunityServiceMessageGroupAdded;
            }
            return AndroidUtilities.replaceTags(LocaleController.formatString(i9, str2, str));
        }
    }

    public static int b(int i9, long j10) {
        TLRPC.Chat chat;
        long j11;
        TLRPC.User user;
        TLRPC.ChatFull chatFull;
        ArrayList<TL_communities.CommunityPeer> arrayList;
        TLRPC.Dialog dialog = null;
        if (j10 > 0) {
            TLRPC.User user2 = MessagesController.getInstance(i9).getUser(Long.valueOf(j10));
            if (user2 == null) {
                return 0;
            }
            j11 = user2.linked_community_id;
            user = user2;
            chat = null;
        } else {
            chat = MessagesController.getInstance(i9).getChat(Long.valueOf(-j10));
            if (chat == null) {
                return 0;
            }
            j11 = chat.linked_community_id;
            user = null;
        }
        if (j11 != 0 && (chatFull = MessagesController.getInstance(i9).getChatFull(j11)) != null && (arrayList = chatFull.linked_peers) != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                TL_communities.CommunityPeer communityPeer = arrayList.get(i10);
                i10++;
                TL_communities.CommunityPeer communityPeer2 = communityPeer;
                if (DialogObject.getPeerDialogId(communityPeer2.peer) == j10) {
                    if (user != null) {
                        dialog = MessagesController.getInstance(i9).getDialog(user.f22527id);
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

    public static void d(o2 o2Var, long j10, int i9) {
        b5 b5Var;
        qn qnVar;
        int i10;
        List list = null;
        if (!AndroidUtilities.isTablet()) {
            b5Var = o2Var.getParentLayout();
            if (b5Var != null) {
                List fragmentStack = b5Var.getFragmentStack();
                i10 = fragmentStack.size() - 2;
                while (i10 >= 0) {
                    o2 o2Var2 = (o2) fragmentStack.get(i10);
                    if (o2Var2 instanceof qn) {
                        qnVar = (qn) o2Var2;
                        if (qnVar.a() == j10) {
                            list = fragmentStack;
                            break;
                        }
                    }
                    i10--;
                }
                qnVar = null;
                list = fragmentStack;
            } else {
                qnVar = null;
            }
        } else {
            b5Var = null;
            qnVar = null;
        }
        i10 = -1;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(j10, o2Var.getCurrentAccount());
        if (i10 != -1) {
            for (int size = list.size() - 2; size > i10; size--) {
                ((ActionBarLayout) b5Var).a0((o2) list.get(size), false);
            }
            o2Var.finishFragment();
            AndroidUtilities.runOnUIThread(new m0(i9, qnVar, isChannelAndNotMegaGroup), 250L);
            return;
        }
        if (!(o2Var instanceof dy)) {
            o2Var.finishFragment();
        }
        f(oc.X(), i9, isChannelAndNotMegaGroup);
    }

    public static void e(final c2[] c2VarArr, o2 o2Var, final int i9, TLRPC.Chat chat) {
        if (c2VarArr[0] != null) {
            return;
        }
        final int fetchChatsToAddToCommunity = MessagesController.getInstance(i9).fetchChatsToAddToCommunity(new gh.j0(c2VarArr, o2Var, i9, chat));
        ConnectionsManager.getInstance(i9).bindRequestToGuid(fetchChatsToAddToCommunity, o2Var.getClassGuid());
        c2 c2Var = new c2(o2Var.getContext(), 3, null);
        c2VarArr[0] = c2Var;
        c2Var.q(500L);
        c2VarArr[0].setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public final void onCancel(DialogInterface dialogInterface) {
                ConnectionsManager.getInstance(i9).cancelRequest(fetchChatsToAddToCommunity, true);
                c2VarArr[0] = null;
            }
        });
    }

    public static void f(oc ocVar, int i9, boolean z10) {
        int i10;
        int i11;
        String string;
        int i12;
        if (i9 == 2) {
            i10 = R.raw.timer_toast;
        } else {
            i10 = R.raw.contact_check;
        }
        if (i9 == 2) {
            i11 = 24;
        } else {
            i11 = 36;
        }
        if (i9 == 0) {
            string = LocaleController.getString(R.string.CommunityCommunityCreated);
        } else if (i9 == 1) {
            if (z10) {
                i12 = R.string.CommunityCommunityJoinedChannel;
            } else {
                i12 = R.string.CommunityCommunityJoinedGroup;
            }
            string = LocaleController.getString(i12);
        } else {
            string = LocaleController.getString(R.string.CommunityCommunityPending);
        }
        ocVar.G(i10, i11, string).j();
    }
}
