package ai;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class y2 implements org.telegram.ui.ActionBar.a2, jh.a {
    public final int f1743a;
    public final f6 f1744b;

    public y2(f6 f6Var, int i10) {
        this.f1743a = i10;
        this.f1744b = f6Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        long j3;
        TLRPC.ChatFull chatFull;
        TL_stories.PeerStories peerStories;
        TLRPC.UserFull userFull;
        boolean z10;
        boolean z11;
        TL_stories.StoryItem storyItem;
        int i11 = this.f1743a;
        f6 f6Var = this.f1744b;
        switch (i11) {
            case 0:
                a4 a4Var = f6Var.f797b2;
                if (a4Var != null) {
                    a4Var.B();
                    return;
                }
                return;
            default:
                d6 d6Var = f6Var.O1;
                boolean z12 = true;
                TLRPC.ChatFull chatFull2 = null;
                if (d6Var.f706f && (storyItem = d6Var.f703a) != null) {
                    TLRPC.MessageMedia messageMedia = storyItem.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        d2 d2Var = d2.W;
                        if (d2Var != null && d2Var.f(inputGroupCall)) {
                            d2.W.e();
                            if (d2.W != null) {
                                d2.W = null;
                                NotificationCenter.getInstance(f6Var.C2).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(d2.W.g()));
                            }
                        }
                    }
                }
                TL_stories.StoryItem storyItem2 = d6Var.f703a;
                if (storyItem2 instanceof s8) {
                    t8 t8Var = ((s8) storyItem2).f1508a;
                    TLRPC.MessageMedia messageMedia2 = storyItem2.media;
                    t8Var.getClass();
                    t8Var.F(new ArrayList(Arrays.asList(messageMedia2)));
                } else if (storyItem2 != null) {
                    f6 f6Var2 = d6Var.f710k;
                    l9 l9Var = f6Var2.S1;
                    long j10 = f6Var2.B1;
                    a0.i iVar = l9Var.f1195i;
                    int i12 = l9Var.f1190a;
                    if (!(storyItem2 instanceof TL_stories.TL_storyItemDeleted)) {
                        int i13 = 0;
                        while (i13 < 2) {
                            if (i13 == 0) {
                                j3 = 0;
                                TLRPC.ChatFull chatFull3 = chatFull2;
                                chatFull = chatFull3;
                                peerStories = (TL_stories.PeerStories) iVar.f(j10);
                                userFull = chatFull3;
                            } else if (j10 >= 0) {
                                TLRPC.UserFull userFull2 = MessagesController.getInstance(i12).getUserFull(j10);
                                if (userFull2 != null) {
                                    j3 = 0;
                                    chatFull = chatFull2;
                                    userFull = userFull2;
                                    peerStories = userFull2.stories;
                                } else {
                                    j3 = 0;
                                    chatFull = chatFull2;
                                    userFull = userFull2;
                                    peerStories = chatFull;
                                }
                            } else {
                                j3 = 0;
                                TLRPC.ChatFull chatFull4 = MessagesController.getInstance(i12).getChatFull(-j10);
                                if (chatFull4 != null) {
                                    chatFull = chatFull4;
                                    peerStories = chatFull4.stories;
                                    userFull = chatFull2;
                                } else {
                                    TLRPC.ChatFull chatFull5 = chatFull2;
                                    chatFull = chatFull4;
                                    peerStories = chatFull5;
                                    userFull = chatFull5;
                                }
                            }
                            if (peerStories != null) {
                                int i14 = 0;
                                while (true) {
                                    if (i14 < peerStories.stories.size()) {
                                        if (peerStories.stories.get(i14).f18344id == storyItem2.f18344id) {
                                            peerStories.stories.remove(i14);
                                            if (peerStories.stories.size() == 0) {
                                                if (!l9Var.K(j10)) {
                                                    iVar.l(j10);
                                                    l9Var.f1194g.remove(peerStories);
                                                    l9Var.h.remove(peerStories);
                                                }
                                                if (j10 > j3) {
                                                    TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(j10));
                                                    if (user != null) {
                                                        user.stories_unavailable = z12;
                                                    }
                                                } else {
                                                    TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-j10));
                                                    if (chat != null) {
                                                        chat.stories_unavailable = true;
                                                    }
                                                }
                                            }
                                        } else {
                                            i14++;
                                            z12 = true;
                                        }
                                    }
                                }
                            }
                            if (chatFull != null) {
                                z10 = false;
                                MessagesStorage.getInstance(i12).updateChatInfo(chatFull, false);
                            } else {
                                z10 = false;
                            }
                            if (userFull != 0) {
                                MessagesStorage.getInstance(i12).updateUserInfo(userFull, z10);
                            }
                            i13++;
                            z12 = true;
                            chatFull2 = null;
                        }
                        TL_stories.TL_stories_deleteStories tL_stories_deleteStories = new TL_stories.TL_stories_deleteStories();
                        tL_stories_deleteStories.peer = MessagesController.getInstance(i12).getInputPeer(j10);
                        tL_stories_deleteStories.f18347id.add(Integer.valueOf(storyItem2.f18344id));
                        ConnectionsManager.getInstance(i12).sendRequest(tL_stories_deleteStories, new x7(l9Var, 5));
                        y9 y9Var = l9Var.f1197k;
                        y9Var.f1765b.getStorageQueue().postRunnable(new w9(y9Var, j10, storyItem2.f18344id, 0));
                        NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                        MessagesController.getInstance(i12).checkArchiveFolder();
                        l9Var.k0(j10, Arrays.asList(storyItem2));
                    }
                } else {
                    k9 k9Var = d6Var.f704b;
                    if (k9Var != null) {
                        k9Var.a();
                    }
                }
                f6Var.j1();
                if (f6Var.K1 && f6Var.A1 == 0) {
                    ((ac) f6Var.Q1).j();
                    return;
                }
                int i15 = f6Var.J1;
                int i16 = f6Var.A1;
                if (i15 >= i16) {
                    f6Var.J1 = i16 - 1;
                    z11 = false;
                } else {
                    z11 = false;
                    if (i15 < 0) {
                        f6Var.J1 = 0;
                    }
                }
                f6Var.f1(z11);
                jc jcVar = f6Var.J0;
                if (jcVar != null) {
                    jcVar.p();
                    return;
                }
                return;
        }
    }

    @Override
    public void k(int i10) {
        if (i10 == 0) {
            this.f1744b.P0();
        }
    }
}
