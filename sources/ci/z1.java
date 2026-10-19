package ci;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class z1 implements org.telegram.ui.ActionBar.a2, kh.a {
    public final int f6242a;
    public final q4 f6243b;

    public z1(q4 q4Var, int i10) {
        this.f6242a = i10;
        this.f6243b = q4Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        long j10;
        TLRPC.ChatFull chatFull;
        TL_stories.PeerStories peerStories;
        TLRPC.UserFull userFull;
        boolean z10;
        boolean z11;
        TL_stories.StoryItem storyItem;
        int i11 = this.f6242a;
        q4 q4Var = this.f6243b;
        switch (i11) {
            case 0:
                v2 v2Var = q4Var.f5766b2;
                if (v2Var != null) {
                    v2Var.z();
                    return;
                }
                return;
            default:
                o4 o4Var = q4Var.O1;
                int i12 = 0;
                boolean z12 = true;
                TLRPC.ChatFull chatFull2 = null;
                if (o4Var.f5691f && (storyItem = o4Var.f5688a) != null) {
                    TLRPC.MessageMedia messageMedia = storyItem.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        h1 h1Var = h1.W;
                        if (h1Var != null && h1Var.f(inputGroupCall)) {
                            h1.W.e();
                            if (h1.W != null) {
                                h1.W = null;
                                NotificationCenter.getInstance(q4Var.C2).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(h1.W.g()));
                            }
                        }
                    }
                }
                TL_stories.StoryItem storyItem2 = o4Var.f5688a;
                if (storyItem2 instanceof s6) {
                    t6 t6Var = ((s6) storyItem2).f5972a;
                    TLRPC.MessageMedia messageMedia2 = storyItem2.media;
                    t6Var.getClass();
                    t6Var.F(new ArrayList(Arrays.asList(messageMedia2)));
                } else if (storyItem2 != null) {
                    q4 q4Var2 = o4Var.f5695k;
                    i7 i7Var = q4Var2.S1;
                    long j11 = q4Var2.B1;
                    a0.h hVar = i7Var.f5496i;
                    int i13 = i7Var.f5491a;
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
                                        if (peerStories.stories.get(i15).f20507id == storyItem2.f20507id) {
                                            peerStories.stories.remove(i15);
                                            if (peerStories.stories.size() == 0) {
                                                if (!i7Var.K(j11)) {
                                                    hVar.l(j11);
                                                    i7Var.f5495g.remove(peerStories);
                                                    i7Var.h.remove(peerStories);
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
                        tL_stories_deleteStories.f20510id.add(Integer.valueOf(storyItem2.f20507id));
                        ConnectionsManager.getInstance(i13).sendRequest(tL_stories_deleteStories, new h6(i7Var, 5));
                        w7 w7Var = i7Var.f5498k;
                        w7Var.f6126b.getStorageQueue().postRunnable(new s7(w7Var, j11, storyItem2.f20507id, 1));
                        NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                        MessagesController.getInstance(i13).checkArchiveFolder();
                        i7Var.k0(j11, Arrays.asList(storyItem2));
                    }
                } else {
                    h7 h7Var = o4Var.f5689b;
                    if (h7Var != null) {
                        h7Var.a();
                    }
                }
                q4Var.j1();
                if (q4Var.K1 && q4Var.A1 == 0) {
                    ((r9) q4Var.Q1).j();
                    return;
                }
                int i16 = q4Var.J1;
                int i17 = q4Var.A1;
                if (i16 >= i17) {
                    q4Var.J1 = i17 - 1;
                    z11 = false;
                } else {
                    z11 = false;
                    if (i16 < 0) {
                        q4Var.J1 = 0;
                    }
                }
                q4Var.f1(z11);
                aa aaVar = q4Var.J0;
                if (aaVar != null) {
                    aaVar.p();
                    return;
                }
                return;
        }
    }

    @Override
    public void j(int i10) {
        if (i10 == 0) {
            this.f6243b.P0();
        }
    }
}
