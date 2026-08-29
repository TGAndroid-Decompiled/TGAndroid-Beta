package lh;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class s1 implements org.telegram.ui.ActionBar.b2, ug.a {
    public final int f16200a;
    public final d4 f16201b;

    public s1(d4 d4Var, int i10) {
        this.f16200a = i10;
        this.f16201b = d4Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        long j10;
        TLRPC.ChatFull chatFull;
        TL_stories.PeerStories peerStories;
        TLRPC.UserFull userFull;
        boolean z10;
        boolean z11;
        TL_stories.StoryItem storyItem;
        int i11 = this.f16200a;
        d4 d4Var = this.f16201b;
        switch (i11) {
            case 0:
                n2 n2Var = d4Var.X1;
                if (n2Var != null) {
                    n2Var.B();
                    return;
                }
                return;
            default:
                b4 b4Var = d4Var.K1;
                boolean z12 = true;
                TLRPC.ChatFull chatFull2 = null;
                if (b4Var.f15378f && (storyItem = b4Var.f15374a) != null) {
                    TLRPC.MessageMedia messageMedia = storyItem.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        d1 d1Var = d1.S;
                        if (d1Var != null && d1Var.f(inputGroupCall)) {
                            d1.S.e();
                            if (d1.S != null) {
                                d1.S = null;
                                NotificationCenter.getInstance(d4Var.f15545y2).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(d1.S.g()));
                            }
                        }
                    }
                }
                TL_stories.StoryItem storyItem2 = b4Var.f15374a;
                if (storyItem2 instanceof b6) {
                    c6 c6Var = ((b6) storyItem2).f15400a;
                    TLRPC.MessageMedia messageMedia2 = storyItem2.media;
                    c6Var.getClass();
                    c6Var.F(new ArrayList(Arrays.asList(messageMedia2)));
                } else if (storyItem2 != null) {
                    d4 d4Var2 = b4Var.f15382k;
                    s6 s6Var = d4Var2.O1;
                    long j11 = d4Var2.f15540x1;
                    a0.h hVar = s6Var.f16224i;
                    int i12 = s6Var.f16218a;
                    if (!(storyItem2 instanceof TL_stories.TL_storyItemDeleted)) {
                        int i13 = 0;
                        while (i13 < 2) {
                            if (i13 == 0) {
                                j10 = 0;
                                TLRPC.ChatFull chatFull3 = chatFull2;
                                chatFull = chatFull3;
                                peerStories = (TL_stories.PeerStories) hVar.f(j11);
                                userFull = chatFull3;
                            } else if (j11 >= 0) {
                                TLRPC.UserFull userFull2 = MessagesController.getInstance(i12).getUserFull(j11);
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
                                TLRPC.ChatFull chatFull4 = MessagesController.getInstance(i12).getChatFull(-j11);
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
                                        if (peerStories.stories.get(i14).f22629id == storyItem2.f22629id) {
                                            peerStories.stories.remove(i14);
                                            if (peerStories.stories.size() == 0) {
                                                if (!s6Var.K(j11)) {
                                                    hVar.l(j11);
                                                    s6Var.f16223g.remove(peerStories);
                                                    s6Var.h.remove(peerStories);
                                                }
                                                if (j11 > j10) {
                                                    TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(j11));
                                                    if (user != null) {
                                                        user.stories_unavailable = z12;
                                                    }
                                                } else {
                                                    TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-j11));
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
                        tL_stories_deleteStories.peer = MessagesController.getInstance(i12).getInputPeer(j11);
                        tL_stories_deleteStories.f22632id.add(Integer.valueOf(storyItem2.f22629id));
                        ConnectionsManager.getInstance(i12).sendRequest(tL_stories_deleteStories, new r5(s6Var, 5));
                        f7 f7Var = s6Var.f16226k;
                        f7Var.f15600b.getStorageQueue().postRunnable(new d7(f7Var, j11, storyItem2.f22629id, 0));
                        NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                        MessagesController.getInstance(i12).checkArchiveFolder();
                        s6Var.k0(j11, Arrays.asList(storyItem2));
                    }
                } else {
                    r6 r6Var = b4Var.f15375b;
                    if (r6Var != null) {
                        r6Var.a();
                    }
                }
                d4Var.j1();
                if (d4Var.G1 && d4Var.f15536w1 == 0) {
                    ((z8) d4Var.M1).j();
                    return;
                }
                int i15 = d4Var.F1;
                int i16 = d4Var.f15536w1;
                if (i15 >= i16) {
                    d4Var.F1 = i16 - 1;
                    z11 = false;
                } else {
                    z11 = false;
                    if (i15 < 0) {
                        d4Var.F1 = 0;
                    }
                }
                d4Var.f1(z11);
                i9 i9Var = d4Var.F0;
                if (i9Var != null) {
                    i9Var.p();
                    return;
                }
                return;
        }
    }

    @Override
    public void k(int i10) {
        if (i10 == 0) {
            this.f16201b.P0();
        }
    }
}
