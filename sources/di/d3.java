package di;

import android.view.View;
import bi.ab;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.c20;
import org.telegram.messenger.ez;
import org.telegram.messenger.gz;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.hc;
public final class d3 implements c20 {
    public final int f8919a = 1;
    public final boolean f8920b;
    public final Object f8921c;
    public final Object d;
    public final Object f8922e;

    public d3(e3 e3Var, boolean z9, ch.o0 o0Var, View view) {
        this.f8921c = e3Var;
        this.f8920b = z9;
        this.d = o0Var;
        this.f8922e = view;
    }

    @Override
    public final void a(Object obj) {
        int i7;
        ch.k0 k0Var;
        TLRPC.Document e10;
        hc hcVar;
        int i10;
        int i11;
        int i12;
        int i13 = this.f8919a;
        boolean z9 = this.f8920b;
        Object obj2 = this.f8922e;
        Object obj3 = this.d;
        Object obj4 = this.f8921c;
        switch (i13) {
            case 0:
                e3 e3Var = (e3) obj4;
                ch.o0 o0Var = (ch.o0) obj3;
                View view = (View) obj2;
                Long l10 = (Long) obj;
                j4 j4Var = e3Var.f8946a;
                if (z9 && o0Var.f6354f != null) {
                    try {
                        j4Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    i7 = 0;
                    k0Var = new ch.k0(view.getContext(), null, j4Var.O1, null, view, j4Var.getMeasuredWidth() / 2.0f, j4Var.getMeasuredHeight() / 2.0f, o0Var, j4Var.f9200l2, 0, true);
                } else {
                    i7 = 0;
                    k0Var = new ch.k0(view.getContext(), null, j4Var.O1, null, view, j4Var.getMeasuredWidth() / 2.0f, j4Var.getMeasuredHeight() / 2.0f, o0Var, j4Var.f9200l2, 2, true);
                    o0Var = o0Var;
                }
                ch.k0.B = k0Var;
                ch.h0 h0Var = k0Var.f6286i;
                h0Var.setTag(2131296591, 1);
                j4Var.addView(h0Var);
                h4 h4Var = j4Var.f9245x1;
                k0Var.f6296s = true;
                k0Var.f6301y = System.currentTimeMillis();
                if (o0Var.f6354f != null) {
                    e10 = ui.b0(j4Var.f9200l2).T(o0Var.f6354f);
                    ez a10 = ez.a(j4Var.f9196k1, o0Var.f6354f);
                    a10.H = h4Var.f9064a;
                    a10.Q = l10.longValue();
                    gz.C(j4Var.f9200l2).r0(a10);
                } else {
                    e10 = org.telegram.ui.Components.i5.e(j4Var.f9200l2, o0Var.f6355g);
                    String V = ij.V(e10, null, null);
                    if (V == null) {
                        if (j4Var.O1.getReactionsWindow() != null) {
                            j4Var.O1.getReactionsWindow().e();
                        }
                        j4Var.q0();
                        return;
                    }
                    ez a11 = ez.a(j4Var.f9196k1, V);
                    a11.f22331w = new ArrayList();
                    TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                    tL_messageEntityCustomEmoji.document_id = o0Var.f6355g;
                    tL_messageEntityCustomEmoji.offset = i7;
                    tL_messageEntityCustomEmoji.length = V.length();
                    a11.f22331w.add(tL_messageEntityCustomEmoji);
                    a11.H = h4Var.f9064a;
                    a11.Q = l10.longValue();
                    gz.C(j4Var.f9200l2).r0(a11);
                }
                if (l10.longValue() <= 0) {
                    cc r10 = new hc(j4Var.L0, j4Var.f9195k0).r(e10, id.M0(2131746389, null), id.M0(2131743552, null), new ab(e3Var, 19));
                    r10.f32627j = 5000;
                    r10.j();
                }
                if (j4Var.O1.getReactionsWindow() != null) {
                    j4Var.O1.getReactionsWindow().e();
                }
                j4Var.q0();
                return;
            case 1:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj2;
                j4 j4Var2 = ((a4) obj4).f8808x;
                j3 j3Var = j4Var2.L0;
                if (((Boolean) obj).booleanValue()) {
                    storyItem.pinned = z9;
                    boolean z10 = j4Var2.l1;
                    i10 = 2131623979;
                    if (z10) {
                        hc hcVar2 = new hc(j3Var, g6Var);
                        if (z9) {
                            i10 = 2131623989;
                        }
                        if (z9) {
                            i12 = 2131744582;
                        } else {
                            i12 = 2131744727;
                        }
                        hcVar2.Q(i10, 36, id.M0(i12, null)).j();
                        return;
                    } else if (z9) {
                        new hc(j3Var, g6Var).I(2131623989, id.M0(2131744584, null), id.M0(2131744583, null)).j();
                        return;
                    } else {
                        hcVar = new hc(j3Var, g6Var);
                        i11 = 2131744454;
                    }
                } else {
                    hcVar = new hc(j3Var, g6Var);
                    i10 = 2131624011;
                    i11 = 2131743879;
                }
                org.telegram.messenger.k5.o(null, i11, hcVar, i10, 36);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                int i14 = ChatActivityEnterView.s5;
                ((org.telegram.ui.ActionBar.u1) obj3).dismiss();
                zh.g1 g1Var = new zh.g1(chatActivityEnterView.getContext(), chatActivityEnterView.Q, ((TLRPC.User) obj2).f27105id, wg.r.c(wg.r.b(1, (List) obj)), null);
                g1Var.e1(z9);
                g1Var.show();
                return;
        }
    }

    public d3(a4 a4Var, TL_stories.StoryItem storyItem, boolean z9, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f8921c = a4Var;
        this.d = storyItem;
        this.f8920b = z9;
        this.f8922e = g6Var;
    }

    public d3(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.ActionBar.u1 u1Var, TLRPC.User user, boolean z9) {
        this.f8921c = chatActivityEnterView;
        this.d = u1Var;
        this.f8922e = user;
        this.f8920b = z9;
    }
}
