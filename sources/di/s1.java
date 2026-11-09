package di;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class s1 implements org.telegram.ui.ActionBar.r1, lh.a {
    public final int f9720a;
    public final j4 f9721b;

    public s1(j4 j4Var, int i7) {
        this.f9720a = i7;
        this.f9721b = j4Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        long j3;
        TLRPC.ChatFull chatFull;
        TL_stories.PeerStories peerStories;
        TLRPC.UserFull userFull;
        boolean z9;
        boolean z10;
        TL_stories.StoryItem storyItem;
        int i10 = this.f9720a;
        j4 j4Var = this.f9721b;
        switch (i10) {
            case 0:
                o2 o2Var = j4Var.K1;
                if (o2Var != null) {
                    o2Var.x();
                    return;
                }
                return;
            default:
                h4 h4Var = j4Var.f9245x1;
                int i11 = 0;
                boolean z11 = true;
                TLRPC.ChatFull chatFull2 = null;
                if (h4Var.f9068f && (storyItem = h4Var.f9064a) != null) {
                    TLRPC.MessageMedia messageMedia = storyItem.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        g1 g1Var = g1.W;
                        if (g1Var != null && g1Var.f(inputGroupCall)) {
                            g1.W.e();
                            if (g1.W != null) {
                                g1.W = null;
                                qs.f(j4Var.f9200l2).k(176, Long.valueOf(g1.W.g()));
                            }
                        }
                    }
                }
                TL_stories.StoryItem storyItem2 = h4Var.f9064a;
                if (storyItem2 instanceof j6) {
                    k6 k6Var = ((j6) storyItem2).f9260a;
                    TLRPC.MessageMedia messageMedia2 = storyItem2.media;
                    k6Var.getClass();
                    k6Var.F(new ArrayList(Arrays.asList(messageMedia2)));
                } else if (storyItem2 != null) {
                    j4 j4Var2 = h4Var.f9072k;
                    z6 z6Var = j4Var2.B1;
                    long j10 = j4Var2.f9196k1;
                    a0.h hVar = z6Var.f9998i;
                    int i12 = z6Var.f9992a;
                    if (!(storyItem2 instanceof TL_stories.TL_storyItemDeleted)) {
                        int i13 = 0;
                        while (i13 < 2) {
                            if (i13 == 0) {
                                j3 = 0;
                                TLRPC.ChatFull chatFull3 = chatFull2;
                                chatFull = chatFull3;
                                peerStories = (TL_stories.PeerStories) hVar.f(j10);
                                userFull = chatFull3;
                            } else if (j10 >= 0) {
                                TLRPC.UserFull b22 = qp.s1(i12).b2(j10);
                                if (b22 != null) {
                                    j3 = 0;
                                    chatFull = chatFull2;
                                    userFull = b22;
                                    peerStories = b22.stories;
                                } else {
                                    j3 = 0;
                                    chatFull = chatFull2;
                                    userFull = b22;
                                    peerStories = chatFull;
                                }
                            } else {
                                j3 = 0;
                                TLRPC.ChatFull N0 = qp.s1(i12).N0(-j10);
                                if (N0 != null) {
                                    chatFull = N0;
                                    peerStories = N0.stories;
                                    userFull = chatFull2;
                                } else {
                                    TLRPC.ChatFull chatFull4 = chatFull2;
                                    chatFull = N0;
                                    peerStories = chatFull4;
                                    userFull = chatFull4;
                                }
                            }
                            if (peerStories != null) {
                                int i14 = i11;
                                while (true) {
                                    if (i14 < peerStories.stories.size()) {
                                        if (peerStories.stories.get(i14).f27195id == storyItem2.f27195id) {
                                            peerStories.stories.remove(i14);
                                            if (peerStories.stories.size() == 0) {
                                                if (!z6Var.M(j10)) {
                                                    hVar.l(j10);
                                                    z6Var.f9997g.remove(peerStories);
                                                    z6Var.h.remove(peerStories);
                                                }
                                                if (j10 > j3) {
                                                    TLRPC.User a22 = qp.s1(i12).a2(Long.valueOf(j10));
                                                    if (a22 != null) {
                                                        a22.stories_unavailable = z11;
                                                    }
                                                } else {
                                                    TLRPC.Chat M0 = qp.s1(i12).M0(Long.valueOf(-j10));
                                                    if (M0 != null) {
                                                        M0.stories_unavailable = true;
                                                    }
                                                }
                                            }
                                        } else {
                                            i14++;
                                            z11 = true;
                                        }
                                    }
                                }
                            }
                            if (chatFull != null) {
                                z9 = false;
                                yr.a0(i12).N1(chatFull, false);
                            } else {
                                z9 = false;
                            }
                            if (userFull != 0) {
                                yr.a0(i12).j2(userFull, z9);
                            }
                            i13++;
                            i11 = 0;
                            z11 = true;
                            chatFull2 = null;
                        }
                        TL_stories.TL_stories_deleteStories tL_stories_deleteStories = new TL_stories.TL_stories_deleteStories();
                        tL_stories_deleteStories.peer = qp.s1(i12).j1(j10);
                        tL_stories_deleteStories.f27198id.add(Integer.valueOf(storyItem2.f27195id));
                        ConnectionsManager.getInstance(i12).sendRequest(tL_stories_deleteStories, new y5(z6Var, 4));
                        m7 m7Var = z6Var.f10000k;
                        m7Var.f9363b.f26719a.c(new j7(m7Var, j10, storyItem2.f27195id, 1));
                        qs.f(i12).k(324, new Object[0]);
                        qp.s1(i12).D();
                        z6Var.n0(j10, Arrays.asList(storyItem2));
                    }
                } else {
                    y6 y6Var = h4Var.f9065b;
                    if (y6Var != null) {
                        y6Var.a();
                    }
                }
                j4Var.h1();
                if (j4Var.f9229t1 && j4Var.f9193j1 == 0) {
                    ((h9) j4Var.f9253z1).j();
                    return;
                }
                int i15 = j4Var.f9225s1;
                int i16 = j4Var.f9193j1;
                if (i15 >= i16) {
                    j4Var.f9225s1 = i16 - 1;
                    z10 = false;
                } else {
                    z10 = false;
                    if (i15 < 0) {
                        j4Var.f9225s1 = 0;
                    }
                }
                j4Var.d1(z10);
                q9 q9Var = j4Var.f9224s0;
                if (q9Var != null) {
                    q9Var.r();
                    return;
                }
                return;
        }
    }

    @Override
    public void h(int i7) {
        if (i7 == 0) {
            this.f9721b.N0();
        }
    }
}
