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
public final class k0 implements f59 {
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
        gn gnVar;
        String str;
        u17 u17Var = (u17) this.b;
        r17 r17Var = (r17) this.c;
        if (i != 0) {
            k17 adapter = u17Var.getAdapter();
            if (adapter.x0 != null && !adapter.i0) {
                return;
            }
            int i2 = i - 1;
            Object J = u17Var.getAdapter().J(i2);
            int i3 = u17Var.getAdapter().Y;
            int i4 = u17Var.getAdapter().Z;
            if (u17Var.getAdapter().G != null && i2 == 1) {
                TLRPC.Chat chat = u17Var.getAdapter().m0;
                if (chat == null && u17Var.getAdapter().H0 != null) {
                    chat = u17Var.getAdapter().H0.e;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(u17Var.getAdapter().G);
                if (chat != null) {
                    str = "@" + sd2.K(chat, false);
                } else {
                    str = "";
                }
                r17Var.Y0(i3, i4, b10.j(sb, str, " "), false);
                return;
            } else if (u17Var.getAdapter().G != null && i2 == 0) {
                r17Var.Y0(i3, i4, b10.j(new StringBuilder(), u17Var.getAdapter().G, " "), false);
                return;
            } else {
                if (J instanceof TLRPC.TL_document) {
                    if (view instanceof v0b) {
                        ((v0b) view).getSendAnimationData();
                    }
                    TLRPC.TL_document tL_document = (TLRPC.TL_document) J;
                    r17Var.w0(tL_document, k47.U(tL_document), u17Var.getAdapter().L(i2));
                } else if (J instanceof TLRPC.Chat) {
                    String K = sd2.K((TLRPC.Chat) J, false);
                    if (K != null) {
                        r17Var.Y0(i3, i4, kt6.o("@", K, " "), false);
                    }
                } else if (J instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) J;
                    if (m9c.p(user) != null) {
                        r17Var.Y0(i3, i4, "@" + m9c.p(user) + " ", false);
                    } else {
                        SpannableString spannableString = new SpannableString(td4.p(m9c.k(user, false), " "));
                        spannableString.setSpan(new j6c(String.valueOf(user.id), 3, null), 0, spannableString.length(), 33);
                        r17Var.Y0(i3, i4, spannableString, false);
                    }
                } else if (J instanceof String) {
                    r17Var.Y0(i3, i4, J + " ", false);
                } else if (J instanceof ds6) {
                    String str2 = ((ds6) J).a;
                    r17Var.c1(str2);
                    if (str2 != null) {
                        try {
                        } catch (Exception unused) {
                            r17Var.Y0(i3, i4, str2, true);
                        }
                        if (str2.startsWith("animated_")) {
                            try {
                                fontMetricsInt = r17Var.u0();
                            } catch (Exception e) {
                                fc4.g(e, false);
                                fontMetricsInt = null;
                            }
                            long parseLong = Long.parseLong(str2.substring(9));
                            TLRPC.Document e2 = vm.e(z8c.t0, parseLong);
                            SpannableString spannableString2 = new SpannableString(k47.U(e2));
                            if (e2 != null) {
                                gnVar = new gn(e2, fontMetricsInt);
                            } else {
                                gnVar = new gn(parseLong, fontMetricsInt);
                            }
                            spannableString2.setSpan(gnVar, 0, spannableString2.length(), 33);
                            r17Var.Y0(i3, i4, spannableString2, false);
                            u17Var.o(false);
                        }
                    }
                    r17Var.Y0(i3, i4, str2, true);
                    u17Var.o(false);
                }
                if (J instanceof TLRPC.BotInlineResult) {
                    TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
                    if ((botInlineResult.type.equals("photo") && (botInlineResult.photo != null || botInlineResult.content != null)) || ((botInlineResult.type.equals("gif") && (botInlineResult.document != null || botInlineResult.content != null)) || (botInlineResult.type.equals("video") && botInlineResult.document != null))) {
                        ArrayList arrayList = new ArrayList(u17Var.getAdapter().S);
                        u17Var.Q = arrayList;
                        PhotoViewer.r0().T1(null, u17Var.h, u17Var.a);
                        PhotoViewer.r0().o1(arrayList, u17Var.getAdapter().M(i2), 3, false, u17Var.R, null);
                        return;
                    }
                    r17Var.r(botInlineResult, true, 0);
                    return;
                }
                return;
            }
        }
        u17Var.getClass();
    }

    private final void b(int i, View view) {
        ih8 ih8Var = (ih8) this.b;
        HashSet hashSet = ih8Var.u1;
        eh8 eh8Var = ih8Var.m1;
        if (gm.C1((Context) this.c)) {
            ArrayList arrayList = ih8Var.z1;
            if (arrayList == null || arrayList.isEmpty()) {
                int i2 = 0;
                if (view instanceof xib) {
                    int S = eh8Var.S(i) - 1;
                    int Q = eh8Var.Q(i) - 1;
                    if (Q > 0 && S >= 0) {
                        hh8 hh8Var = (hh8) ih8Var.w1.get(S);
                        if (Q == hh8Var.b() && !hashSet.contains(hh8Var)) {
                            if (hh8Var.e && hh8Var.f < hh8Var.b.size()) {
                                int min = Math.min(hh8Var.f + 50, hh8Var.b.size());
                                hh8Var.f = min;
                                if (min == hh8Var.b.size()) {
                                    hh8Var.e = false;
                                }
                                ih8Var.D0(null);
                                eh8Var.X(true);
                                return;
                            }
                            hashSet.add(hh8Var);
                            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                            tL_messages_getPollVotes.peer = ih8Var.t1;
                            tL_messages_getPollVotes.id = ih8Var.r1.e1();
                            tL_messages_getPollVotes.limit = 50;
                            int i3 = tL_messages_getPollVotes.flags;
                            tL_messages_getPollVotes.option = hh8Var.d;
                            tL_messages_getPollVotes.flags = i3 | 3;
                            tL_messages_getPollVotes.offset = hh8Var.c;
                            ConnectionsManager.getInstance(ih8Var.a).sendRequest(tL_messages_getPollVotes, new jl7(ih8Var, hh8Var, (byte) 7));
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
                        ih8Var.dismiss();
                        d S2 = LaunchActivity.S();
                        if (S2 != null) {
                            ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                            if (S2 instanceof yv1) {
                                if (pollVotesAlert$UserCell.h != null) {
                                    TLRPC.User h = ((yv1) S2).h();
                                    ih8Var.l1.getChildAt(0);
                                    if (h != null && h.id == pollVotesAlert$UserCell.h.id) {
                                        i2 = 1;
                                    }
                                    profileActivity.B3(i2);
                                } else {
                                    TLRPC.Chat chat = ((yv1) S2).e;
                                    if (chat != null && chat.id == pollVotesAlert$UserCell.n.id) {
                                        i2 = 1;
                                    }
                                    profileActivity.B3(i2);
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
        i2a i2aVar = (i2a) this.b;
        oab oabVar = (oab) this.c;
        d dVar = oabVar.f;
        e2a e2aVar = i2aVar.x;
        q1a q1aVar = i2aVar.r;
        if (i >= 0 && i < e2aVar.c.size()) {
            a2a a2aVar = (a2a) e2aVar.c.get(i);
            TL_stories.StoryView storyView = a2aVar.b;
            TL_stories.StoryReaction storyReaction = a2aVar.c;
            if (storyView instanceof TL_stories.TL_storyView) {
                oabVar.L(ProfileActivity.S2(storyView.user_id));
            } else if (storyView instanceof TL_stories.TL_storyViewPublicRepost) {
                dVar.createOverlayStoryViewer().J(i2aVar.getContext(), ((TL_stories.TL_storyViewPublicRepost) a2aVar.b).story, q4b.a(q1aVar));
            } else if (storyReaction instanceof TL_stories.TL_storyReaction) {
                oabVar.L(ProfileActivity.S2(pg3.n(storyReaction.peer_id)));
            } else if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                ArrayList arrayList = new ArrayList();
                h2a h2aVar = i2aVar.F;
                int i2 = 0;
                int i3 = -1;
                if (h2aVar != null) {
                    int size = h2aVar.i.size();
                    while (i2 < i2aVar.F.i.size()) {
                        TL_stories.StoryReaction storyReaction2 = (TL_stories.StoryReaction) i2aVar.F.i.get(i2);
                        if ((storyReaction2 instanceof TL_stories.TL_storyReactionPublicRepost) && (storyItem = (tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction2).story) != null) {
                            storyItem.dialogId = pg3.n(tL_storyReactionPublicRepost.peer_id);
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
                    i2aVar.H = new b4b(i2aVar.w, arrayList);
                    i2aVar.I = i2;
                    h2a h2aVar2 = i2aVar.F;
                    oab createOverlayStoryViewer = dVar.createOverlayStoryViewer();
                    Context context = i2aVar.getContext();
                    b4b b4bVar = i2aVar.H;
                    q4b a = q4b.a(q1aVar);
                    a.e = new yf9(h2aVar2, (byte) 17);
                    createOverlayStoryViewer.G(context, i3, b4bVar, a);
                    return;
                }
                i2aVar.H = null;
                dVar.createOverlayStoryViewer().J(i2aVar.getContext(), ((TL_stories.TL_storyReactionPublicRepost) storyReaction).story, q4b.a(q1aVar));
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
                long n = pg3.n(message.peer_id);
                if (n >= 0) {
                    bundle.putLong("user_id", n);
                } else {
                    bundle.putLong("chat_id", -n);
                }
                bundle.putInt("message_id", message.id);
                oabVar.L(new yv1(bundle));
            }
        }
    }

    private final void d(int i, View view) {
        oyb oybVar = (oyb) this.b;
        EditText editText = oybVar.w;
        long a = ((kyb) oybVar.s.c.get(i)).a();
        yv1 yv1Var = ((bt1) this.c).a;
        if (yv1Var.d8()) {
            yv1Var.ya(a);
        } else {
            mzb mzbVar = yv1Var.g2;
            if (mzbVar != null) {
                mzbVar.k(a, false);
            }
        }
        boolean h = oybVar.h();
        oybVar.V = 0L;
        oybVar.W = null;
        if (editText.length() > 0) {
            editText.setText("");
        } else if (h) {
            oybVar.l(false);
            oybVar.n();
        }
        editText.clearFocus();
        oybVar.d();
    }

    private final void e(int i, View view) {
        c2c c2cVar = (c2c) this.b;
        ylb ylbVar = (ylb) this.c;
        c6c G = c2cVar.e2.G(i - 1);
        if (G != null) {
            int i2 = G.d;
            if (i2 == 1) {
                CharSequence charSequence = c2cVar.X1;
                if (charSequence != null && !c2cVar.W1) {
                    gm.g(charSequence);
                }
            } else if (i2 == 2) {
                if (!z8c.h(c2cVar.a).p()) {
                    if (LaunchActivity.S() != null) {
                        new kj8(13, ylbVar, c2cVar.getContext()).show();
                        return;
                    }
                    return;
                }
                b3c b3cVar = oc7.r1(c2cVar.a).i4;
                b3cVar.K(0L, !b3cVar.A(0L));
                c2cVar.dismiss();
            }
        }
    }

    @Override
    public final void g(int r40, android.view.View r41) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k0.g(int, android.view.View):void");
    }
}
