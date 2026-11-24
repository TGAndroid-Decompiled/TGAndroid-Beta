package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.PollVotesAlert$UserCell;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
public final class k0 implements c39 {
    public final byte a;
    public final Object b;
    public final Object c;

    public k0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    private final void a(int i, View view) {
        Paint.FontMetricsInt fontMetricsInt;
        gm gmVar;
        String str;
        uz6 uz6Var = (uz6) this.b;
        rz6 rz6Var = (rz6) this.c;
        if (i != 0) {
            kz6 adapter = uz6Var.getAdapter();
            if (adapter.x0 != null && !adapter.i0) {
                return;
            }
            int i2 = i - 1;
            Object J = uz6Var.getAdapter().J(i2);
            int i3 = uz6Var.getAdapter().Y;
            int i4 = uz6Var.getAdapter().Z;
            if (uz6Var.getAdapter().G != null && i2 == 1) {
                TLRPC.Chat chat = uz6Var.getAdapter().m0;
                if (chat == null && uz6Var.getAdapter().H0 != null) {
                    chat = uz6Var.getAdapter().H0.e;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(uz6Var.getAdapter().G);
                if (chat != null) {
                    str = "@" + hc2.K(chat, false);
                } else {
                    str = "";
                }
                rz6Var.k(i3, i4, b00.j(sb, str, " "), false);
                return;
            } else if (uz6Var.getAdapter().G != null && i2 == 0) {
                rz6Var.k(i3, i4, b00.j(new StringBuilder(), uz6Var.getAdapter().G, " "), false);
                return;
            } else {
                if (J instanceof TLRPC.TL_document) {
                    if (view instanceof uya) {
                        ((uya) view).getSendAnimationData();
                    }
                    TLRPC.TL_document tL_document = (TLRPC.TL_document) J;
                    rz6Var.h(tL_document, k27.U(tL_document), uz6Var.getAdapter().L(i2));
                } else if (J instanceof TLRPC.Chat) {
                    String K = hc2.K((TLRPC.Chat) J, false);
                    if (K != null) {
                        rz6Var.k(i3, i4, tb4.y("@", K, " "), false);
                    }
                } else if (J instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) J;
                    if (l7c.p(user) != null) {
                        rz6Var.k(i3, i4, "@" + l7c.p(user) + " ", false);
                    } else {
                        SpannableString spannableString = new SpannableString(tb4.o(l7c.k(user, false), " "));
                        spannableString.setSpan(new j4c(String.valueOf(user.id), 3, null), 0, spannableString.length(), 33);
                        rz6Var.k(i3, i4, spannableString, false);
                    }
                } else if (J instanceof String) {
                    rz6Var.k(i3, i4, J + " ", false);
                } else if (J instanceof dq6) {
                    String str2 = ((dq6) J).a;
                    rz6Var.m(str2);
                    if (str2 != null) {
                        try {
                        } catch (Exception unused) {
                            rz6Var.k(i3, i4, str2, true);
                        }
                        if (str2.startsWith("animated_")) {
                            try {
                                fontMetricsInt = rz6Var.d();
                            } catch (Exception e) {
                                fa4.g(e, false);
                                fontMetricsInt = null;
                            }
                            long parseLong = Long.parseLong(str2.substring(9));
                            TLRPC.Document e2 = vl.e(y6c.t0, parseLong);
                            SpannableString spannableString2 = new SpannableString(k27.U(e2));
                            if (e2 != null) {
                                gmVar = new gm(e2, fontMetricsInt);
                            } else {
                                gmVar = new gm(parseLong, fontMetricsInt);
                            }
                            spannableString2.setSpan(gmVar, 0, spannableString2.length(), 33);
                            rz6Var.k(i3, i4, spannableString2, false);
                            uz6Var.o(false);
                        }
                    }
                    rz6Var.k(i3, i4, str2, true);
                    uz6Var.o(false);
                }
                if (J instanceof TLRPC.BotInlineResult) {
                    TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
                    if ((botInlineResult.type.equals("photo") && (botInlineResult.photo != null || botInlineResult.content != null)) || ((botInlineResult.type.equals("gif") && (botInlineResult.document != null || botInlineResult.content != null)) || (botInlineResult.type.equals("video") && botInlineResult.document != null))) {
                        ArrayList arrayList = new ArrayList(uz6Var.getAdapter().S);
                        uz6Var.Q = arrayList;
                        PhotoViewer.r0().T1(null, uz6Var.h, uz6Var.a);
                        PhotoViewer.r0().o1(arrayList, uz6Var.getAdapter().M(i2), 3, false, uz6Var.R, null);
                        return;
                    }
                    rz6Var.c(botInlineResult, true, 0);
                    return;
                }
                return;
            }
        }
        uz6Var.getClass();
    }

    private final void b(int i, View view) {
        gf8 gf8Var = (gf8) this.b;
        HashSet hashSet = gf8Var.u1;
        cf8 cf8Var = gf8Var.m1;
        if (gl.C1((Context) this.c)) {
            ArrayList arrayList = gf8Var.z1;
            if (arrayList == null || arrayList.isEmpty()) {
                int i2 = 0;
                if (view instanceof wgb) {
                    int S = cf8Var.S(i) - 1;
                    int Q = cf8Var.Q(i) - 1;
                    if (Q > 0 && S >= 0) {
                        ff8 ff8Var = (ff8) gf8Var.w1.get(S);
                        if (Q == ff8Var.b() && !hashSet.contains(ff8Var)) {
                            if (ff8Var.e && ff8Var.f < ff8Var.b.size()) {
                                int min = Math.min(ff8Var.f + 50, ff8Var.b.size());
                                ff8Var.f = min;
                                if (min == ff8Var.b.size()) {
                                    ff8Var.e = false;
                                }
                                gf8Var.D0(null);
                                cf8Var.X(true);
                                return;
                            }
                            hashSet.add(ff8Var);
                            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                            tL_messages_getPollVotes.peer = gf8Var.t1;
                            tL_messages_getPollVotes.id = gf8Var.r1.e1();
                            tL_messages_getPollVotes.limit = 50;
                            int i3 = tL_messages_getPollVotes.flags;
                            tL_messages_getPollVotes.option = ff8Var.d;
                            tL_messages_getPollVotes.flags = i3 | 3;
                            tL_messages_getPollVotes.offset = ff8Var.c;
                            ConnectionsManager.getInstance(gf8Var.a).sendRequest(tL_messages_getPollVotes, new hj7(gf8Var, ff8Var, (byte) 7));
                        }
                    }
                } else if (view instanceof PollVotesAlert$UserCell) {
                    PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) view;
                    if (pollVotesAlert$UserCell.h != null || pollVotesAlert$UserCell.n != null) {
                        Bundle bundle = new Bundle();
                        TLRPC.User user = pollVotesAlert$UserCell.h;
                        if (user != null) {
                            bundle.putLong("user_id", user.id);
                        } else {
                            bundle.putLong("chat_id", pollVotesAlert$UserCell.n.id);
                        }
                        gf8Var.dismiss();
                        d S2 = LaunchActivity.S();
                        if (S2 != null) {
                            ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                            if (S2 instanceof mu1) {
                                if (pollVotesAlert$UserCell.h != null) {
                                    TLRPC.User h = ((mu1) S2).h();
                                    gf8Var.l1.getChildAt(0);
                                    if (h != null && h.id == pollVotesAlert$UserCell.h.id) {
                                        i2 = 1;
                                    }
                                    profileActivity.x3(i2);
                                } else {
                                    TLRPC.Chat chat = ((mu1) S2).e;
                                    if (chat != null && chat.id == pollVotesAlert$UserCell.n.id) {
                                        i2 = 1;
                                    }
                                    profileActivity.x3(i2);
                                }
                            }
                            S2.presentFragment(profileActivity);
                        }
                    }
                }
            }
        }
    }

    private final void c(int i, View view) {
        TLRPC.Message message;
        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost;
        TL_stories.StoryItem storyItem;
        g0a g0aVar = (g0a) this.b;
        m8b m8bVar = (m8b) this.c;
        d dVar = m8bVar.f;
        c0a c0aVar = g0aVar.x;
        oz9 oz9Var = g0aVar.r;
        if (i >= 0 && i < c0aVar.c.size()) {
            yz9 yz9Var = (yz9) c0aVar.c.get(i);
            TL_stories.StoryView storyView = yz9Var.b;
            TL_stories.StoryReaction storyReaction = yz9Var.c;
            if (storyView instanceof TL_stories.TL_storyView) {
                m8bVar.L(ProfileActivity.P2(storyView.user_id));
            } else if (storyView instanceof TL_stories.TL_storyViewPublicRepost) {
                dVar.createOverlayStoryViewer().J(g0aVar.getContext(), ((TL_stories.TL_storyViewPublicRepost) yz9Var.b).story, p2b.a(oz9Var));
            } else if (storyReaction instanceof TL_stories.TL_storyReaction) {
                m8bVar.L(ProfileActivity.P2(cf3.n(storyReaction.peer_id)));
            } else if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                ArrayList arrayList = new ArrayList();
                f0a f0aVar = g0aVar.F;
                int i2 = 0;
                int i3 = -1;
                if (f0aVar != null) {
                    int size = f0aVar.i.size();
                    while (i2 < g0aVar.F.i.size()) {
                        TL_stories.StoryReaction storyReaction2 = (TL_stories.StoryReaction) g0aVar.F.i.get(i2);
                        if ((storyReaction2 instanceof TL_stories.TL_storyReactionPublicRepost) && (storyItem = (tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction2).story) != null) {
                            storyItem.dialogId = cf3.n(tL_storyReactionPublicRepost.peer_id);
                            if (storyReaction2 == storyReaction) {
                                i3 = arrayList.size();
                            }
                            arrayList.add(storyItem);
                        }
                        i2++;
                    }
                    i2 = size;
                }
                if (i3 >= 0 && arrayList.size() > 1) {
                    g0aVar.H = new a2b(g0aVar.w, arrayList);
                    g0aVar.I = i2;
                    f0a f0aVar2 = g0aVar.F;
                    m8b createOverlayStoryViewer = dVar.createOverlayStoryViewer();
                    Context context = g0aVar.getContext();
                    a2b a2bVar = g0aVar.H;
                    p2b a = p2b.a(oz9Var);
                    a.e = new wh9(f0aVar2, (byte) 13);
                    createOverlayStoryViewer.G(context, i3, a2bVar, a);
                    return;
                }
                g0aVar.H = null;
                dVar.createOverlayStoryViewer().J(g0aVar.getContext(), ((TL_stories.TL_storyReactionPublicRepost) storyReaction).story, p2b.a(oz9Var));
            } else {
                if (!(storyReaction instanceof TL_stories.TL_storyReactionPublicForward)) {
                    if (storyView instanceof TL_stories.TL_storyViewPublicForward) {
                        message = storyView.message;
                    } else {
                        return;
                    }
                } else {
                    message = storyReaction.message;
                }
                Bundle bundle = new Bundle();
                long n = cf3.n(message.peer_id);
                if (n >= 0) {
                    bundle.putLong("user_id", n);
                } else {
                    bundle.putLong("chat_id", -n);
                }
                bundle.putInt("message_id", message.id);
                m8bVar.L(new mu1(bundle));
            }
        }
    }

    private final void e(int i, View view) {
        lwb lwbVar = (lwb) this.b;
        EditText editText = lwbVar.w;
        long a = ((hwb) lwbVar.s.c.get(i)).a();
        mu1 mu1Var = ((or1) this.c).a;
        if (mu1Var.U7()) {
            mu1Var.oa(a);
        } else {
            kxb kxbVar = mu1Var.g2;
            if (kxbVar != null) {
                kxbVar.k(a, false);
            }
        }
        boolean h = lwbVar.h();
        lwbVar.V = 0L;
        lwbVar.W = null;
        if (editText.length() > 0) {
            editText.setText("");
        } else if (h) {
            lwbVar.l(false);
            lwbVar.n();
        }
        editText.clearFocus();
        lwbVar.d();
    }

    private final void f(int i, View view) {
        c0c c0cVar = (c0c) this.b;
        wjb wjbVar = (wjb) this.c;
        c4c G = c0cVar.e2.G(i - 1);
        if (G != null) {
            int i2 = G.d;
            if (i2 == 1) {
                CharSequence charSequence = c0cVar.X1;
                if (charSequence != null && !c0cVar.W1) {
                    gl.g(charSequence);
                }
            } else if (i2 == 2) {
                if (!y6c.h(c0cVar.a).p()) {
                    if (LaunchActivity.S() != null) {
                        new jh8(13, wjbVar, c0cVar.getContext()).show();
                        return;
                    }
                    return;
                }
                b1c b1cVar = na7.q1(c0cVar.a).i4;
                b1cVar.K(0L, !b1cVar.A(0L));
                c0cVar.dismiss();
            }
        }
    }

    @Override
    public final void d(int r40, android.view.View r41) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k0.d(int, android.view.View):void");
    }
}
