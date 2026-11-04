package ei;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.qr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class x1 implements org.telegram.ui.ActionBar.p1, mh.a {
    public final int f11199a;
    public final j4 f11200b;

    public x1(j4 j4Var, int i3) {
        this.f11199a = i3;
        this.f11200b = j4Var;
    }

    @Override
    public void d(int i3) {
        if (i3 == 0) {
            this.f11200b.N0();
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        long j10;
        TLRPC.ChatFull chatFull;
        TL_stories.PeerStories peerStories;
        TLRPC.UserFull userFull;
        boolean z10;
        boolean z11;
        TL_stories.StoryItem storyItem;
        int i10 = this.f11199a;
        j4 j4Var = this.f11200b;
        switch (i10) {
            case 0:
                s2 s2Var = j4Var.L1;
                if (s2Var != null) {
                    s2Var.x();
                    return;
                }
                return;
            default:
                h4 h4Var = j4Var.f10527y1;
                int i11 = 0;
                boolean z12 = true;
                TLRPC.ChatFull chatFull2 = null;
                if (h4Var.f10362f && (storyItem = h4Var.f10358a) != null) {
                    TLRPC.MessageMedia messageMedia = storyItem.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        g1 g1Var = g1.X;
                        if (g1Var != null && g1Var.f(inputGroupCall)) {
                            g1.X.e();
                            if (g1.X != null) {
                                g1.X = null;
                                hs.f(j4Var.f10480m2).k(176, Long.valueOf(g1.X.g()));
                            }
                        }
                    }
                }
                TL_stories.StoryItem storyItem2 = h4Var.f10358a;
                if (storyItem2 instanceof j6) {
                    k6 k6Var = ((j6) storyItem2).f10551a;
                    TLRPC.MessageMedia messageMedia2 = storyItem2.media;
                    k6Var.getClass();
                    k6Var.F(new ArrayList(Arrays.asList(messageMedia2)));
                } else if (storyItem2 != null) {
                    j4 j4Var2 = h4Var.f10366k;
                    z6 z6Var = j4Var2.C1;
                    long j11 = j4Var2.f10477l1;
                    a0.h hVar = z6Var.f11280i;
                    int i12 = z6Var.f11274a;
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
                                TLRPC.UserFull b22 = hp.s1(i12).b2(j11);
                                if (b22 != null) {
                                    j10 = 0;
                                    chatFull = chatFull2;
                                    userFull = b22;
                                    peerStories = b22.stories;
                                } else {
                                    j10 = 0;
                                    chatFull = chatFull2;
                                    userFull = b22;
                                    peerStories = chatFull;
                                }
                            } else {
                                j10 = 0;
                                TLRPC.ChatFull N0 = hp.s1(i12).N0(-j11);
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
                                        if (peerStories.stories.get(i14).f27240id == storyItem2.f27240id) {
                                            peerStories.stories.remove(i14);
                                            if (peerStories.stories.size() == 0) {
                                                if (!z6Var.M(j11)) {
                                                    hVar.l(j11);
                                                    z6Var.f11279g.remove(peerStories);
                                                    z6Var.h.remove(peerStories);
                                                }
                                                if (j11 > j10) {
                                                    TLRPC.User a22 = hp.s1(i12).a2(Long.valueOf(j11));
                                                    if (a22 != null) {
                                                        a22.stories_unavailable = z12;
                                                    }
                                                } else {
                                                    TLRPC.Chat M0 = hp.s1(i12).M0(Long.valueOf(-j11));
                                                    if (M0 != null) {
                                                        M0.stories_unavailable = true;
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
                                qr.a0(i12).N1(chatFull, false);
                            } else {
                                z10 = false;
                            }
                            if (userFull != 0) {
                                qr.a0(i12).j2(userFull, z10);
                            }
                            i13++;
                            i11 = 0;
                            z12 = true;
                            chatFull2 = null;
                        }
                        TL_stories.TL_stories_deleteStories tL_stories_deleteStories = new TL_stories.TL_stories_deleteStories();
                        tL_stories_deleteStories.peer = hp.s1(i12).j1(j11);
                        tL_stories_deleteStories.f27243id.add(Integer.valueOf(storyItem2.f27240id));
                        ConnectionsManager.getInstance(i12).sendRequest(tL_stories_deleteStories, new x5(z6Var, 4));
                        m7 m7Var = z6Var.f11282k;
                        m7Var.f10644b.f24934a.c(new j7(m7Var, j11, storyItem2.f27240id, 1));
                        hs.f(i12).k(324, new Object[0]);
                        hp.s1(i12).D();
                        z6Var.n0(j11, Arrays.asList(storyItem2));
                    }
                } else {
                    y6 y6Var = h4Var.f10359b;
                    if (y6Var != null) {
                        y6Var.a();
                    }
                }
                j4Var.h1();
                if (j4Var.f10511u1 && j4Var.k1 == 0) {
                    ((i9) j4Var.A1).j();
                    return;
                }
                int i15 = j4Var.f10507t1;
                int i16 = j4Var.k1;
                if (i15 >= i16) {
                    j4Var.f10507t1 = i16 - 1;
                    z11 = false;
                } else {
                    z11 = false;
                    if (i15 < 0) {
                        j4Var.f10507t1 = 0;
                    }
                }
                j4Var.d1(z11);
                r9 r9Var = j4Var.f10506t0;
                if (r9Var != null) {
                    r9Var.C();
                    return;
                }
                return;
        }
    }
}
