package bi;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class n2 implements org.telegram.ui.ActionBar.z1, kh.a {
    public final int f3360a;
    public final q5 f3361b;

    public n2(q5 q5Var, int i10) {
        this.f3360a = i10;
        this.f3361b = q5Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        long j10;
        TLRPC.ChatFull chatFull;
        TL_stories.PeerStories peerStories;
        TLRPC.UserFull userFull;
        boolean z10;
        boolean z11;
        TL_stories.StoryItem storyItem;
        int i11 = this.f3360a;
        q5 q5Var = this.f3361b;
        switch (i11) {
            case 0:
                q3 q3Var = q5Var.f3512b2;
                if (q3Var != null) {
                    q3Var.z();
                    return;
                }
                return;
            default:
                o5 o5Var = q5Var.O1;
                int i12 = 0;
                boolean z12 = true;
                TLRPC.ChatFull chatFull2 = null;
                if (o5Var.f3420f && (storyItem = o5Var.f3417a) != null) {
                    TLRPC.MessageMedia messageMedia = storyItem.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        t1 t1Var = t1.W;
                        if (t1Var != null && t1Var.f(inputGroupCall)) {
                            t1.W.e();
                            if (t1.W != null) {
                                t1.W = null;
                                NotificationCenter.getInstance(q5Var.C2).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(t1.W.g()));
                            }
                        }
                    }
                }
                TL_stories.StoryItem storyItem2 = o5Var.f3417a;
                if (storyItem2 instanceof e8) {
                    f8 f8Var = ((e8) storyItem2).f3002a;
                    TLRPC.MessageMedia messageMedia2 = storyItem2.media;
                    f8Var.getClass();
                    f8Var.F(new ArrayList(Arrays.asList(messageMedia2)));
                } else if (storyItem2 != null) {
                    q5 q5Var2 = o5Var.f3424k;
                    x8 x8Var = q5Var2.S1;
                    long j11 = q5Var2.B1;
                    a0.h hVar = x8Var.f3971i;
                    int i13 = x8Var.f3966a;
                    if (!(storyItem2 instanceof TL_stories.TL_storyItemDeleted)) {
                        int i14 = 0;
                        while (i14 < 2) {
                            if (i14 == 0) {
                                j10 = 0;
                                TLRPC.ChatFull chatFull3 = chatFull2;
                                chatFull = chatFull3;
                                peerStories = (TL_stories.PeerStories) hVar.f(j11);
                                userFull = chatFull3;
                            } else if (j11 >= 0) {
                                TLRPC.UserFull userFull2 = MessagesController.getInstance(i13).getUserFull(j11);
                                if (userFull2 != null) {
                                    j10 = 0;
                                    chatFull = chatFull2;
                                    userFull = userFull2;
                                    peerStories = userFull2.stories;
                                } else {
                                    j10 = 0;
                                    chatFull = chatFull2;
                                    userFull = userFull2;
                                    peerStories = chatFull;
                                }
                            } else {
                                j10 = 0;
                                TLRPC.ChatFull chatFull4 = MessagesController.getInstance(i13).getChatFull(-j11);
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
                                int i15 = i12;
                                while (true) {
                                    if (i15 < peerStories.stories.size()) {
                                        if (peerStories.stories.get(i15).f19151id == storyItem2.f19151id) {
                                            peerStories.stories.remove(i15);
                                            if (peerStories.stories.size() == 0) {
                                                if (!x8Var.K(j11)) {
                                                    hVar.l(j11);
                                                    x8Var.f3970g.remove(peerStories);
                                                    x8Var.h.remove(peerStories);
                                                }
                                                if (j11 > j10) {
                                                    TLRPC.User user = MessagesController.getInstance(i13).getUser(Long.valueOf(j11));
                                                    if (user != null) {
                                                        user.stories_unavailable = z12;
                                                    }
                                                } else {
                                                    TLRPC.Chat chat = MessagesController.getInstance(i13).getChat(Long.valueOf(-j11));
                                                    if (chat != null) {
                                                        chat.stories_unavailable = true;
                                                    }
                                                }
                                            }
                                        } else {
                                            i15++;
                                            z12 = true;
                                        }
                                    }
                                }
                            }
                            if (chatFull != null) {
                                z10 = false;
                                MessagesStorage.getInstance(i13).updateChatInfo(chatFull, false);
                            } else {
                                z10 = false;
                            }
                            if (userFull != 0) {
                                MessagesStorage.getInstance(i13).updateUserInfo(userFull, z10);
                            }
                            i14++;
                            i12 = 0;
                            z12 = true;
                            chatFull2 = null;
                        }
                        TL_stories.TL_stories_deleteStories tL_stories_deleteStories = new TL_stories.TL_stories_deleteStories();
                        tL_stories_deleteStories.peer = MessagesController.getInstance(i13).getInputPeer(j11);
                        tL_stories_deleteStories.f19154id.add(Integer.valueOf(storyItem2.f19151id));
                        ConnectionsManager.getInstance(i13).sendRequest(tL_stories_deleteStories, new k7(x8Var, 5));
                        k9 k9Var = x8Var.f3973k;
                        k9Var.f3256b.getStorageQueue().postRunnable(new h9(k9Var, j11, storyItem2.f19151id, 1));
                        NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                        MessagesController.getInstance(i13).checkArchiveFolder();
                        x8Var.k0(j11, Arrays.asList(storyItem2));
                    }
                } else {
                    w8 w8Var = o5Var.f3418b;
                    if (w8Var != null) {
                        w8Var.a();
                    }
                }
                q5Var.j1();
                if (q5Var.K1 && q5Var.A1 == 0) {
                    ((jb) q5Var.Q1).j();
                    return;
                }
                int i16 = q5Var.J1;
                int i17 = q5Var.A1;
                if (i16 >= i17) {
                    q5Var.J1 = i17 - 1;
                    z11 = false;
                } else {
                    z11 = false;
                    if (i16 < 0) {
                        q5Var.J1 = 0;
                    }
                }
                q5Var.f1(z11);
                sb sbVar = q5Var.J0;
                if (sbVar != null) {
                    sbVar.p();
                    return;
                }
                return;
        }
    }

    @Override
    public void j(int i10) {
        if (i10 == 0) {
            this.f3361b.P0();
        }
    }
}
