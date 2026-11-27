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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.PollVotesAlert$UserCell;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
public final class l0 implements r69 {
    public final byte a;
    public final Object b;
    public final Object c;

    public l0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    private final void a(int i, View view) {
        Paint.FontMetricsInt fontMetricsInt;
        hm hmVar;
        String str;
        b27 b27Var = (b27) this.b;
        y17 y17Var = (y17) this.c;
        if (i != 0) {
            r17 adapter = b27Var.getAdapter();
            if (adapter.x0 != null && !adapter.i0) {
                return;
            }
            int i2 = i - 1;
            Object J = b27Var.getAdapter().J(i2);
            int i3 = b27Var.getAdapter().Y;
            int i4 = b27Var.getAdapter().Z;
            if (b27Var.getAdapter().G != null && i2 == 1) {
                TLRPC.Chat chat = b27Var.getAdapter().m0;
                if (chat == null && b27Var.getAdapter().H0 != null) {
                    chat = b27Var.getAdapter().H0.e;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(b27Var.getAdapter().G);
                if (chat != null) {
                    str = "@" + xc2.K(chat, false);
                } else {
                    str = "";
                }
                y17Var.H0(i3, i4, c00.k(sb, str, " "), false);
                return;
            } else if (b27Var.getAdapter().G != null && i2 == 0) {
                y17Var.H0(i3, i4, c00.k(new StringBuilder(), b27Var.getAdapter().G, " "), false);
                return;
            } else {
                if (J instanceof TLRPC.TL_document) {
                    if (view instanceof u2b) {
                        ((u2b) view).getSendAnimationData();
                    }
                    TLRPC.TL_document tL_document = (TLRPC.TL_document) J;
                    y17Var.m0(tL_document, r47.U(tL_document), b27Var.getAdapter().L(i2));
                } else if (J instanceof TLRPC.Chat) {
                    String K = xc2.K((TLRPC.Chat) J, false);
                    if (K != null) {
                        y17Var.H0(i3, i4, qd4.y("@", K, " "), false);
                    }
                } else if (J instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) J;
                    if (lbc.p(user) != null) {
                        y17Var.H0(i3, i4, "@" + lbc.p(user) + " ", false);
                    } else {
                        SpannableString spannableString = new SpannableString(qd4.o(lbc.k(user, false), " "));
                        spannableString.setSpan(new i8c(String.valueOf(user.id), 3, null), 0, spannableString.length(), 33);
                        y17Var.H0(i3, i4, spannableString, false);
                    }
                } else if (J instanceof String) {
                    y17Var.H0(i3, i4, J + " ", false);
                } else if (J instanceof hs6) {
                    String str2 = ((hs6) J).a;
                    y17Var.T0(str2);
                    if (str2 != null) {
                        try {
                        } catch (Exception unused) {
                            y17Var.H0(i3, i4, str2, true);
                        }
                        if (str2.startsWith("animated_")) {
                            try {
                                fontMetricsInt = y17Var.w();
                            } catch (Exception e) {
                                cc4.g(e, false);
                                fontMetricsInt = null;
                            }
                            long parseLong = Long.parseLong(str2.substring(9));
                            TLRPC.Document e2 = wl.e(yac.t0, parseLong);
                            SpannableString spannableString2 = new SpannableString(r47.U(e2));
                            if (e2 != null) {
                                hmVar = new hm(e2, fontMetricsInt);
                            } else {
                                hmVar = new hm(parseLong, fontMetricsInt);
                            }
                            spannableString2.setSpan(hmVar, 0, spannableString2.length(), 33);
                            y17Var.H0(i3, i4, spannableString2, false);
                            b27Var.o(false);
                        }
                    }
                    y17Var.H0(i3, i4, str2, true);
                    b27Var.o(false);
                }
                if (J instanceof TLRPC.BotInlineResult) {
                    TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
                    if ((botInlineResult.type.equals("photo") && (botInlineResult.photo != null || botInlineResult.content != null)) || ((botInlineResult.type.equals("gif") && (botInlineResult.document != null || botInlineResult.content != null)) || (botInlineResult.type.equals("video") && botInlineResult.document != null))) {
                        ArrayList arrayList = new ArrayList(b27Var.getAdapter().S);
                        b27Var.Q = arrayList;
                        PhotoViewer.q0().T1(null, b27Var.h, b27Var.a);
                        PhotoViewer.q0().o1(arrayList, b27Var.getAdapter().M(i2), 3, false, b27Var.R, null);
                        return;
                    }
                    y17Var.s(botInlineResult, true, 0);
                    return;
                }
                return;
            }
        }
        b27Var.getClass();
    }

    private final void b(int i, View view) {
        ui8 ui8Var = (ui8) this.b;
        HashSet hashSet = ui8Var.u1;
        qi8 qi8Var = ui8Var.m1;
        if (hl.C1((Context) this.c)) {
            ArrayList arrayList = ui8Var.z1;
            if (arrayList == null || arrayList.isEmpty()) {
                int i2 = 0;
                if (view instanceof skb) {
                    int S = qi8Var.S(i) - 1;
                    int Q = qi8Var.Q(i) - 1;
                    if (Q > 0 && S >= 0) {
                        ti8 ti8Var = (ti8) ui8Var.w1.get(S);
                        if (Q == ti8Var.b() && !hashSet.contains(ti8Var)) {
                            if (ti8Var.e && ti8Var.f < ti8Var.b.size()) {
                                int min = Math.min(ti8Var.f + 50, ti8Var.b.size());
                                ti8Var.f = min;
                                if (min == ti8Var.b.size()) {
                                    ti8Var.e = false;
                                }
                                ui8Var.E0(null);
                                qi8Var.X(true);
                                return;
                            }
                            hashSet.add(ti8Var);
                            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                            tL_messages_getPollVotes.peer = ui8Var.t1;
                            tL_messages_getPollVotes.id = ui8Var.r1.e1();
                            tL_messages_getPollVotes.limit = 50;
                            int i3 = tL_messages_getPollVotes.flags;
                            tL_messages_getPollVotes.option = ti8Var.d;
                            tL_messages_getPollVotes.flags = i3 | 3;
                            tL_messages_getPollVotes.offset = ti8Var.c;
                            ConnectionsManager.getInstance(ui8Var.a).sendRequest(tL_messages_getPollVotes, new pl7(ui8Var, ti8Var, (byte) 8));
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
                        ui8Var.dismiss();
                        e S2 = LaunchActivity.S();
                        if (S2 != null) {
                            ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                            if (S2 instanceof zu1) {
                                if (pollVotesAlert$UserCell.h != null) {
                                    TLRPC.User h = ((zu1) S2).h();
                                    ui8Var.l1.getChildAt(0);
                                    if (h != null && h.id == pollVotesAlert$UserCell.h.id) {
                                        i2 = 1;
                                    }
                                    profileActivity.y3(i2);
                                } else {
                                    TLRPC.Chat chat = ((zu1) S2).e;
                                    if (chat != null && chat.id == pollVotesAlert$UserCell.n.id) {
                                        i2 = 1;
                                    }
                                    profileActivity.y3(i2);
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
        z3a z3aVar = (z3a) this.b;
        lcb lcbVar = (lcb) this.c;
        e eVar = lcbVar.f;
        v3a v3aVar = z3aVar.x;
        i3a i3aVar = z3aVar.r;
        if (i >= 0 && i < v3aVar.c.size()) {
            s3a s3aVar = (s3a) v3aVar.c.get(i);
            TL_stories.StoryView storyView = s3aVar.b;
            TL_stories.StoryReaction storyReaction = s3aVar.c;
            if (storyView instanceof TL_stories.TL_storyView) {
                lcbVar.L(ProfileActivity.Q2(storyView.user_id));
            } else if (storyView instanceof TL_stories.TL_storyViewPublicRepost) {
                eVar.createOverlayStoryViewer().J(z3aVar.getContext(), ((TL_stories.TL_storyViewPublicRepost) s3aVar.b).story, l6b.a(i3aVar));
            } else if (storyReaction instanceof TL_stories.TL_storyReaction) {
                lcbVar.L(ProfileActivity.Q2(wf3.n(storyReaction.peer_id)));
            } else if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                ArrayList arrayList = new ArrayList();
                y3a y3aVar = z3aVar.F;
                int i2 = 0;
                int i3 = -1;
                if (y3aVar != null) {
                    int size = y3aVar.i.size();
                    while (i2 < z3aVar.F.i.size()) {
                        TL_stories.StoryReaction storyReaction2 = (TL_stories.StoryReaction) z3aVar.F.i.get(i2);
                        if ((storyReaction2 instanceof TL_stories.TL_storyReactionPublicRepost) && (storyItem = (tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction2).story) != null) {
                            storyItem.dialogId = wf3.n(tL_storyReactionPublicRepost.peer_id);
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
                    z3aVar.H = new x5b(z3aVar.w, arrayList);
                    z3aVar.I = i2;
                    y3a y3aVar2 = z3aVar.F;
                    lcb createOverlayStoryViewer = eVar.createOverlayStoryViewer();
                    Context context = z3aVar.getContext();
                    x5b x5bVar = z3aVar.H;
                    l6b a = l6b.a(i3aVar);
                    a.e = new ye9(y3aVar2, (byte) 26);
                    createOverlayStoryViewer.G(context, i3, x5bVar, a);
                    return;
                }
                z3aVar.H = null;
                eVar.createOverlayStoryViewer().J(z3aVar.getContext(), ((TL_stories.TL_storyReactionPublicRepost) storyReaction).story, l6b.a(i3aVar));
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
                long n = wf3.n(message.peer_id);
                if (n >= 0) {
                    bundle.putLong("user_id", n);
                } else {
                    bundle.putLong("chat_id", -n);
                }
                bundle.putInt("message_id", message.id);
                lcbVar.L(new zu1(bundle));
            }
        }
    }

    private final void d(int i, View view) {
        n0c n0cVar = (n0c) this.b;
        EditText editText = n0cVar.w;
        long a = ((j0c) n0cVar.s.c.get(i)).a();
        zu1 zu1Var = ((cs1) this.c).a;
        if (zu1Var.d8()) {
            zu1Var.za(a);
        } else {
            l1c l1cVar = zu1Var.g2;
            if (l1cVar != null) {
                l1cVar.k(a, false);
            }
        }
        boolean h = n0cVar.h();
        n0cVar.V = 0L;
        n0cVar.W = null;
        if (editText.length() > 0) {
            editText.setText("");
        } else if (h) {
            n0cVar.l(false);
            n0cVar.n();
        }
        editText.clearFocus();
        n0cVar.d();
    }

    private final void f(int i, View view) {
        b4c b4cVar = (b4c) this.b;
        vnb vnbVar = (vnb) this.c;
        b8c G = b4cVar.e2.G(i - 1);
        if (G != null) {
            int i2 = G.d;
            if (i2 == 1) {
                CharSequence charSequence = b4cVar.X1;
                if (charSequence != null && !b4cVar.W1) {
                    hl.g(charSequence);
                }
            } else if (i2 == 2) {
                if (!yac.h(b4cVar.a).p()) {
                    if (LaunchActivity.S() != null) {
                        new xk8(13, vnbVar, b4cVar.getContext()).show();
                        return;
                    }
                    return;
                }
                a5c a5cVar = uc7.s1(b4cVar.a).j4;
                a5cVar.K(0L, !a5cVar.A(0L));
                b4cVar.dismiss();
            }
        }
    }

    @Override
    public final void e(int r40, android.view.View r41) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l0.e(int, android.view.View):void");
    }
}
