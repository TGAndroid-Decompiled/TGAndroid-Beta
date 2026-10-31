package mg;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.m10;
import org.telegram.messenger.o5;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Components.PollVotesAlert$UserCell;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.c60;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.pf0;
import org.telegram.ui.Components.sf0;
import org.telegram.ui.Components.t20;
import org.telegram.ui.Components.tf0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.iy;
import org.telegram.ui.kg0;
import org.telegram.ui.ma0;
import org.telegram.ui.un;
import org.telegram.ui.v50;
import org.telegram.ui.wf0;
import org.telegram.ui.yi0;
import th.g3;
import th.n5;
import th.o7;
import th.q3;
import th.u3;
import th.x3;
import th.y3;
import th.z4;
public final class q0 implements gk0 {
    public final int f13209a;
    public final Object f13210b;
    public final Object f13211c;

    public q0(int i10, Object obj, Object obj2) {
        this.f13209a = i10;
        this.f13210b = obj;
        this.f13211c = obj2;
    }

    private final void a(int i10, View view) {
        tf0 tf0Var = (tf0) this.f13210b;
        HashSet hashSet = tf0Var.f30561r1;
        pf0 pf0Var = tf0Var.f30554j1;
        if (org.telegram.messenger.i0.E1((Context) this.f13211c)) {
            ArrayList arrayList = tf0Var.f30566w1;
            if (arrayList == null || arrayList.isEmpty()) {
                int i11 = 0;
                if (view instanceof p8) {
                    int S = pf0Var.S(i10) - 1;
                    int Q = pf0Var.Q(i10) - 1;
                    if (Q > 0 && S >= 0) {
                        sf0 sf0Var = (sf0) tf0Var.f30563t1.get(S);
                        if (Q == sf0Var.b() && !hashSet.contains(sf0Var)) {
                            if (sf0Var.e && sf0Var.f30236f < sf0Var.f30234b.size()) {
                                int min = Math.min(sf0Var.f30236f + 50, sf0Var.f30234b.size());
                                sf0Var.f30236f = min;
                                if (min == sf0Var.f30234b.size()) {
                                    sf0Var.e = false;
                                }
                                tf0Var.J0(null);
                                pf0Var.X(true);
                                return;
                            }
                            hashSet.add(sf0Var);
                            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                            tL_messages_getPollVotes.peer = tf0Var.f30560q1;
                            tL_messages_getPollVotes.f19892id = tf0Var.f30558o1.f1();
                            tL_messages_getPollVotes.limit = 50;
                            int i12 = tL_messages_getPollVotes.flags;
                            tL_messages_getPollVotes.option = sf0Var.d;
                            tL_messages_getPollVotes.flags = i12 | 3;
                            tL_messages_getPollVotes.offset = sf0Var.f30235c;
                            ConnectionsManager.getInstance(tf0Var.f21583a).sendRequest(tL_messages_getPollVotes, new t20(2, tf0Var, sf0Var));
                        }
                    }
                } else if (view instanceof PollVotesAlert$UserCell) {
                    PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) view;
                    if (pollVotesAlert$UserCell.h != null || pollVotesAlert$UserCell.f24090n != null) {
                        Bundle bundle = new Bundle();
                        TLRPC.User user = pollVotesAlert$UserCell.h;
                        if (user != null) {
                            bundle.putLong("user_id", user.f19942id);
                        } else {
                            bundle.putLong("chat_id", pollVotesAlert$UserCell.f24090n.f19793id);
                        }
                        tf0Var.dismiss();
                        k2 T = LaunchActivity.T();
                        if (T != null) {
                            ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                            if (T instanceof un) {
                                if (pollVotesAlert$UserCell.h != null) {
                                    TLRPC.User j10 = ((un) T).j();
                                    tf0Var.f30553i1.getChildAt(0);
                                    if (j10 != null && j10.f19942id == pollVotesAlert$UserCell.h.f19942id) {
                                        i11 = 1;
                                    }
                                    profileActivity.f5(i11);
                                } else {
                                    TLRPC.Chat chat = ((un) T).e;
                                    if (chat != null && chat.f19793id == pollVotesAlert$UserCell.f24090n.f19793id) {
                                        i11 = 1;
                                    }
                                    profileActivity.f5(i11);
                                }
                            }
                            T.presentFragment(profileActivity);
                        }
                    }
                }
            }
        }
    }

    private final void b(int r9, android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: mg.q0.b(int, android.view.View):void");
    }

    private final void c(int i10, View view) {
        iy.Y((iy) this.f13210b, (Context) this.f13211c, i10);
    }

    private final void d(int i10, View view) {
        v50.Y((v50) this.f13210b, (Context) this.f13211c, view, i10);
    }

    private final void e(int i10, View view) {
        kg0 kg0Var = (kg0) this.f13210b;
        Context context = (Context) this.f13211c;
        HashMap hashMap = kg0Var.f38808k0;
        if (i10 == kg0Var.Q) {
            TLRPC.User user = (TLRPC.User) hashMap.get(Long.valueOf(kg0Var.e.admin_id));
            if (user != null) {
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user.f19942id);
                vp.r1(d20.f15147s0).U3(user, false, false);
                kg0Var.presentFragment(new ProfileActivity(bundle, null));
            }
        } else if (i10 == kg0Var.f38822y) {
            ma0 ma0Var = new ma0(0, kg0Var.f38810n);
            ma0Var.S = kg0Var.f38818s0;
            kg0Var.presentFragment(ma0Var);
        } else {
            int i11 = kg0Var.D;
            if (i10 >= i11 && i10 < kg0Var.E) {
                c60 c60Var = new c60(context, (TLRPC.TL_chatInviteExported) kg0Var.f38806i0.get(i10 - i11), kg0Var.d, hashMap, kg0Var, kg0Var.f38810n, false, kg0Var.h);
                kg0Var.f38809l0 = c60Var;
                c60Var.f24990b2 = kg0Var.f38813p0;
                c60Var.show();
                return;
            }
            int i12 = kg0Var.H;
            if (i10 >= i12 && i10 < kg0Var.I) {
                c60 c60Var2 = new c60(context, (TLRPC.TL_chatInviteExported) kg0Var.f38807j0.get(i10 - i12), kg0Var.d, hashMap, kg0Var, kg0Var.f38810n, false, kg0Var.h);
                kg0Var.f38809l0 = c60Var2;
                c60Var2.show();
            } else if (i10 == kg0Var.N) {
                if (!kg0Var.f38799c0) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kg0Var.getParentActivity());
                    String L0 = cd.L0(2131751576, null);
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                    x1Var.R = L0;
                    x1Var.T = cd.L0(2131751577, null);
                    alertDialog$Builder.k(cd.L0(2131751599, null), new wf0(kg0Var));
                    alertDialog$Builder.h(cd.L0(2131752589, null), null);
                    kg0Var.showDialog(x1Var);
                }
            } else {
                int i13 = kg0Var.U;
                if (i10 >= i13 && i10 < kg0Var.V) {
                    TLRPC.TL_chatAdminWithInvites tL_chatAdminWithInvites = (TLRPC.TL_chatAdminWithInvites) kg0Var.m0.get(i10 - i13);
                    if (hashMap.containsKey(Long.valueOf(tL_chatAdminWithInvites.admin_id))) {
                        kg0Var.getMessagesController().U3((TLRPC.User) hashMap.get(Long.valueOf(tL_chatAdminWithInvites.admin_id)), false, false);
                    }
                    kg0 kg0Var2 = new kg0(kg0Var.f38810n, tL_chatAdminWithInvites.invites_count, tL_chatAdminWithInvites.admin_id);
                    kg0Var2.l0(kg0Var.d, null);
                    kg0Var.presentFragment(kg0Var2);
                }
            }
        }
    }

    private final void g(int i10, View view) {
        yi0.Y((yi0) this.f13210b, (Context) this.f13211c, view, i10);
    }

    private final void h(int i10, View view) {
        PrivacySettingsActivity.Z((PrivacySettingsActivity) this.f13210b, (Context) this.f13211c, view, i10);
    }

    private final void i(int i10, View view) {
        UsersSelectActivity.Y((UsersSelectActivity) this.f13210b, (Context) this.f13211c, view, i10);
    }

    private final void j(int i10, View view) {
        TLRPC.Message message;
        ArrayList arrayList;
        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost;
        TL_stories.StoryItem storyItem;
        y3 y3Var = (y3) this.f13210b;
        o7 o7Var = (o7) this.f13211c;
        k2 k2Var = o7Var.f49303f;
        u3 u3Var = y3Var.f49678x;
        g3 g3Var = y3Var.f49675r;
        if (i10 >= 0 && i10 < u3Var.f49513c.size()) {
            q3 q3Var = (q3) u3Var.f49513c.get(i10);
            TL_stories.StoryView storyView = q3Var.f49386b;
            TL_stories.StoryReaction storyReaction = q3Var.f49387c;
            if (storyView instanceof TL_stories.TL_storyView) {
                o7Var.V(ProfileActivity.z4(storyView.user_id));
            } else if (storyView instanceof TL_stories.TL_storyViewPublicRepost) {
                k2Var.createOverlayStoryViewer().U(y3Var.getContext(), ((TL_stories.TL_storyViewPublicRepost) q3Var.f49386b).story, n5.a(g3Var));
            } else if (storyReaction instanceof TL_stories.TL_storyReaction) {
                o7Var.V(ProfileActivity.z4(o5.o(storyReaction.peer_id)));
            } else if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                ArrayList arrayList2 = new ArrayList();
                x3 x3Var = y3Var.E;
                int i11 = 0;
                int i12 = -1;
                if (x3Var != null && (arrayList = x3Var.f49620i) != null) {
                    int size = arrayList.size();
                    while (i11 < y3Var.E.f49620i.size()) {
                        TL_stories.StoryReaction storyReaction2 = (TL_stories.StoryReaction) y3Var.E.f49620i.get(i11);
                        if ((storyReaction2 instanceof TL_stories.TL_storyReactionPublicRepost) && (storyItem = (tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction2).story) != null) {
                            storyItem.dialogId = o5.o(tL_storyReactionPublicRepost.peer_id);
                            if (storyReaction2 == storyReaction) {
                                i12 = arrayList2.size();
                            }
                            arrayList2.add(storyItem);
                        }
                        i11++;
                    }
                    i11 = size;
                }
                if (i12 >= 0 && arrayList2.size() > 1) {
                    y3Var.G = new z4(y3Var.f49677w, arrayList2);
                    y3Var.H = i11;
                    x3 x3Var2 = y3Var.E;
                    o7 createOverlayStoryViewer = k2Var.createOverlayStoryViewer();
                    Context context = y3Var.getContext();
                    z4 z4Var = y3Var.G;
                    n5 a2 = n5.a(g3Var);
                    a2.e = new rh.d0(x3Var2, 14);
                    createOverlayStoryViewer.Q(context, i12, z4Var, a2);
                    return;
                }
                y3Var.G = null;
                k2Var.createOverlayStoryViewer().U(y3Var.getContext(), ((TL_stories.TL_storyReactionPublicRepost) storyReaction).story, n5.a(g3Var));
            } else {
                boolean z10 = storyReaction instanceof TL_stories.TL_storyReactionPublicForward;
                if (z10 || (storyView instanceof TL_stories.TL_storyViewPublicForward)) {
                    if (z10) {
                        message = storyReaction.message;
                    } else {
                        message = storyView.message;
                    }
                    Bundle bundle = new Bundle();
                    long o10 = o5.o(message.peer_id);
                    if (o10 >= 0) {
                        bundle.putLong("user_id", o10);
                    } else {
                        bundle.putLong("chat_id", -o10);
                    }
                    bundle.putInt("message_id", message.f19814id);
                    o7Var.V(new un(bundle));
                }
            }
        }
    }

    private final void k(int i10, View view) {
        a51 G;
        uh.l lVar = (uh.l) this.f13210b;
        ph.h1 h1Var = (ph.h1) this.f13211c;
        p51 p51Var = lVar.R1;
        if (p51Var != null && (G = p51Var.G(i10 - 1)) != null) {
            Object obj = G.G;
            if (obj instanceof m10) {
                h1Var.a(((m10) obj).f16857a);
                lVar.dismiss();
            }
        }
    }

    @Override
    public final void f(int r40, android.view.View r41) {
        throw new UnsupportedOperationException("Method not decompiled: mg.q0.f(int, android.view.View):void");
    }
}
