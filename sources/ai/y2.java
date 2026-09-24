package ai;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class y2 implements org.telegram.ui.ActionBar.z1, jh.a {
    public final int f1741a;
    public final e6 f1742b;

    public y2(e6 e6Var, int i10) {
        this.f1741a = i10;
        this.f1742b = e6Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        long j3;
        TLRPC.ChatFull chatFull;
        TL_stories.PeerStories peerStories;
        TLRPC.UserFull userFull;
        boolean z10;
        boolean z11;
        TL_stories.StoryItem storyItem;
        int i11 = this.f1741a;
        e6 e6Var = this.f1742b;
        switch (i11) {
            case 0:
                a4 a4Var = e6Var.f773b2;
                if (a4Var != null) {
                    a4Var.A();
                    return;
                }
                return;
            default:
                c6 c6Var = e6Var.O1;
                boolean z12 = true;
                TLRPC.ChatFull chatFull2 = null;
                if (c6Var.f645f && (storyItem = c6Var.f642a) != null) {
                    TLRPC.MessageMedia messageMedia = storyItem.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        d2 d2Var = d2.W;
                        if (d2Var != null && d2Var.f(inputGroupCall)) {
                            d2.W.e();
                            if (d2.W != null) {
                                d2.W = null;
                                NotificationCenter.getInstance(e6Var.C2).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(d2.W.g()));
                            }
                        }
                    }
                }
                TL_stories.StoryItem storyItem2 = c6Var.f642a;
                if (storyItem2 instanceof t8) {
                    u8 u8Var = ((t8) storyItem2).f1559a;
                    TLRPC.MessageMedia messageMedia2 = storyItem2.media;
                    u8Var.getClass();
                    u8Var.F(new ArrayList(Arrays.asList(messageMedia2)));
                } else if (storyItem2 != null) {
                    e6 e6Var2 = c6Var.f649k;
                    l9 l9Var = e6Var2.S1;
                    long j10 = e6Var2.B1;
                    a0.i iVar = l9Var.f1197i;
                    int i12 = l9Var.f1192a;
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
                                        if (peerStories.stories.get(i14).f18556id == storyItem2.f18556id) {
                                            peerStories.stories.remove(i14);
                                            if (peerStories.stories.size() == 0) {
                                                if (!l9Var.K(j10)) {
                                                    iVar.l(j10);
                                                    l9Var.f1196g.remove(peerStories);
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
                        tL_stories_deleteStories.f18559id.add(Integer.valueOf(storyItem2.f18556id));
                        ConnectionsManager.getInstance(i12).sendRequest(tL_stories_deleteStories, new y7(l9Var, 5));
                        y9 y9Var = l9Var.f1199k;
                        y9Var.f1762b.getStorageQueue().postRunnable(new v9(y9Var, j10, storyItem2.f18556id, 1));
                        NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                        MessagesController.getInstance(i12).checkArchiveFolder();
                        l9Var.k0(j10, Arrays.asList(storyItem2));
                    }
                } else {
                    k9 k9Var = c6Var.f643b;
                    if (k9Var != null) {
                        k9Var.a();
                    }
                }
                e6Var.j1();
                if (e6Var.K1 && e6Var.A1 == 0) {
                    ((ac) e6Var.Q1).j();
                    return;
                }
                int i15 = e6Var.J1;
                int i16 = e6Var.A1;
                if (i15 >= i16) {
                    e6Var.J1 = i16 - 1;
                    z11 = false;
                } else {
                    z11 = false;
                    if (i15 < 0) {
                        e6Var.J1 = 0;
                    }
                }
                e6Var.f1(z11);
                jc jcVar = e6Var.J0;
                if (jcVar != null) {
                    jcVar.p();
                    return;
                }
                return;
        }
    }

    @Override
    public void j(int i10) {
        if (i10 == 0) {
            this.f1742b.P0();
        }
    }
}
