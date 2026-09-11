package bi;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class m2 implements org.telegram.ui.ActionBar.a2, kh.a {
    public final int f3303a;
    public final o5 f3304b;

    public m2(o5 o5Var, int i10) {
        this.f3303a = i10;
        this.f3304b = o5Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        long j3;
        TLRPC.ChatFull chatFull;
        TL_stories.PeerStories peerStories;
        TLRPC.UserFull userFull;
        boolean z10;
        boolean z11;
        TL_stories.StoryItem storyItem;
        int i11 = this.f3303a;
        o5 o5Var = this.f3304b;
        switch (i11) {
            case 0:
                n3 n3Var = o5Var.f3406b2;
                if (n3Var != null) {
                    n3Var.B();
                    return;
                }
                return;
            default:
                m5 m5Var = o5Var.O1;
                boolean z12 = true;
                TLRPC.ChatFull chatFull2 = null;
                if (m5Var.f3314f && (storyItem = m5Var.f3310a) != null) {
                    TLRPC.MessageMedia messageMedia = storyItem.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        t1 t1Var = t1.W;
                        if (t1Var != null && t1Var.f(inputGroupCall)) {
                            t1.W.e();
                            if (t1.W != null) {
                                t1.W = null;
                                NotificationCenter.getInstance(o5Var.C2).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(t1.W.g()));
                            }
                        }
                    }
                }
                TL_stories.StoryItem storyItem2 = m5Var.f3310a;
                if (storyItem2 instanceof a8) {
                    b8 b8Var = ((a8) storyItem2).f2772a;
                    TLRPC.MessageMedia messageMedia2 = storyItem2.media;
                    b8Var.getClass();
                    b8Var.F(new ArrayList(Arrays.asList(messageMedia2)));
                } else if (storyItem2 != null) {
                    o5 o5Var2 = m5Var.f3318k;
                    u8 u8Var = o5Var2.S1;
                    long j10 = o5Var2.B1;
                    a0.i iVar = u8Var.f3811i;
                    int i12 = u8Var.f3805a;
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
                                        if (peerStories.stories.get(i14).f20107id == storyItem2.f20107id) {
                                            peerStories.stories.remove(i14);
                                            if (peerStories.stories.size() == 0) {
                                                if (!u8Var.K(j10)) {
                                                    iVar.l(j10);
                                                    u8Var.f3810g.remove(peerStories);
                                                    u8Var.h.remove(peerStories);
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
                        tL_stories_deleteStories.f20110id.add(Integer.valueOf(storyItem2.f20107id));
                        ConnectionsManager.getInstance(i12).sendRequest(tL_stories_deleteStories, new g7(u8Var, 5));
                        h9 h9Var = u8Var.f3813k;
                        h9Var.f3074b.getStorageQueue().postRunnable(new f9(h9Var, j10, storyItem2.f20107id, 0));
                        NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                        MessagesController.getInstance(i12).checkArchiveFolder();
                        u8Var.k0(j10, Arrays.asList(storyItem2));
                    }
                } else {
                    t8 t8Var = m5Var.f3311b;
                    if (t8Var != null) {
                        t8Var.a();
                    }
                }
                o5Var.j1();
                if (o5Var.K1 && o5Var.A1 == 0) {
                    ((gb) o5Var.Q1).j();
                    return;
                }
                int i15 = o5Var.J1;
                int i16 = o5Var.A1;
                if (i15 >= i16) {
                    o5Var.J1 = i16 - 1;
                    z11 = false;
                } else {
                    z11 = false;
                    if (i15 < 0) {
                        o5Var.J1 = 0;
                    }
                }
                o5Var.f1(z11);
                pb pbVar = o5Var.J0;
                if (pbVar != null) {
                    pbVar.p();
                    return;
                }
                return;
        }
    }

    @Override
    public void k(int i10) {
        if (i10 == 0) {
            this.f3304b.P0();
        }
    }
}
