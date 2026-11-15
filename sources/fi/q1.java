package fi;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.vr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class q1 implements org.telegram.ui.ActionBar.q1, lh.a {
    public final int f12221a;
    public final b4 f12222b;

    public q1(b4 b4Var, int i7) {
        this.f12221a = i7;
        this.f12222b = b4Var;
    }

    @Override
    public void g(int i7) {
        if (i7 == 0) {
            this.f12222b.N0();
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        long j3;
        TLRPC.ChatFull chatFull;
        TL_stories.PeerStories peerStories;
        TLRPC.UserFull userFull;
        boolean z10;
        boolean z11;
        TL_stories.StoryItem storyItem;
        int i10 = this.f12221a;
        b4 b4Var = this.f12222b;
        switch (i10) {
            case 0:
                k2 k2Var = b4Var.L1;
                if (k2Var != null) {
                    k2Var.D();
                    return;
                }
                return;
            default:
                z3 z3Var = b4Var.f11543y1;
                int i11 = 0;
                boolean z12 = true;
                TLRPC.ChatFull chatFull2 = null;
                if (z3Var.f12583f && (storyItem = z3Var.f12579a) != null) {
                    TLRPC.MessageMedia messageMedia = storyItem.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        e1 e1Var = e1.X;
                        if (e1Var != null && e1Var.f(inputGroupCall)) {
                            e1.X.e();
                            if (e1.X != null) {
                                e1.X = null;
                                ns.f(b4Var.f11497m2).k(176, Long.valueOf(e1.X.g()));
                            }
                        }
                    }
                }
                TL_stories.StoryItem storyItem2 = z3Var.f12579a;
                if (storyItem2 instanceof b6) {
                    c6 c6Var = ((b6) storyItem2).f11567a;
                    TLRPC.MessageMedia messageMedia2 = storyItem2.media;
                    c6Var.getClass();
                    c6Var.F(new ArrayList(Arrays.asList(messageMedia2)));
                } else if (storyItem2 != null) {
                    b4 b4Var2 = z3Var.f12587k;
                    s6 s6Var = b4Var2.C1;
                    long j10 = b4Var2.l1;
                    a0.h hVar = s6Var.f12325i;
                    int i12 = s6Var.f12319a;
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
                                TLRPC.UserFull b22 = np.s1(i12).b2(j10);
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
                                TLRPC.ChatFull N0 = np.s1(i12).N0(-j10);
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
                                        if (peerStories.stories.get(i14).f28290id == storyItem2.f28290id) {
                                            peerStories.stories.remove(i14);
                                            if (peerStories.stories.size() == 0) {
                                                if (!s6Var.M(j10)) {
                                                    hVar.l(j10);
                                                    s6Var.f12324g.remove(peerStories);
                                                    s6Var.h.remove(peerStories);
                                                }
                                                if (j10 > j3) {
                                                    TLRPC.User a22 = np.s1(i12).a2(Long.valueOf(j10));
                                                    if (a22 != null) {
                                                        a22.stories_unavailable = z12;
                                                    }
                                                } else {
                                                    TLRPC.Chat M0 = np.s1(i12).M0(Long.valueOf(-j10));
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
                                vr.a0(i12).N1(chatFull, false);
                            } else {
                                z10 = false;
                            }
                            if (userFull != 0) {
                                vr.a0(i12).j2(userFull, z10);
                            }
                            i13++;
                            i11 = 0;
                            z12 = true;
                            chatFull2 = null;
                        }
                        TL_stories.TL_stories_deleteStories tL_stories_deleteStories = new TL_stories.TL_stories_deleteStories();
                        tL_stories_deleteStories.peer = np.s1(i12).j1(j10);
                        tL_stories_deleteStories.f28293id.add(Integer.valueOf(storyItem2.f28290id));
                        ConnectionsManager.getInstance(i12).sendRequest(tL_stories_deleteStories, new p5(s6Var, 4));
                        f7 f7Var = s6Var.f12327k;
                        f7Var.f11709b.f27219a.c(new c7(f7Var, j10, storyItem2.f28290id, 1));
                        ns.f(i12).k(324, new Object[0]);
                        np.s1(i12).D();
                        s6Var.n0(j10, Arrays.asList(storyItem2));
                    }
                } else {
                    r6 r6Var = z3Var.f12580b;
                    if (r6Var != null) {
                        r6Var.a();
                    }
                }
                b4Var.h1();
                if (b4Var.f11527u1 && b4Var.f11490k1 == 0) {
                    ((z8) b4Var.A1).j();
                    return;
                }
                int i15 = b4Var.f11523t1;
                int i16 = b4Var.f11490k1;
                if (i15 >= i16) {
                    b4Var.f11523t1 = i16 - 1;
                    z11 = false;
                } else {
                    z11 = false;
                    if (i15 < 0) {
                        b4Var.f11523t1 = 0;
                    }
                }
                b4Var.d1(z11);
                i9 i9Var = b4Var.f11522t0;
                if (i9Var != null) {
                    i9Var.r();
                    return;
                }
                return;
        }
    }
}
