package ei;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.bd;
import org.telegram.messenger.li;
import org.telegram.messenger.u10;
import org.telegram.messenger.wy;
import org.telegram.messenger.yy;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.fc;
public final class g3 implements u10 {
    public final int f10310a = 1;
    public final boolean f10311b;
    public final Object f10312c;
    public final Object d;
    public final Object f10313e;

    public g3(h3 h3Var, boolean z10, dh.n0 n0Var, View view) {
        this.f10312c = h3Var;
        this.f10311b = z10;
        this.d = n0Var;
        this.f10313e = view;
    }

    @Override
    public final void a(Object obj) {
        int i3;
        dh.j0 j0Var;
        TLRPC.Document e10;
        fc fcVar;
        int i10;
        int i11;
        int i12;
        int i13 = this.f10310a;
        boolean z10 = this.f10311b;
        Object obj2 = this.f10313e;
        Object obj3 = this.d;
        Object obj4 = this.f10312c;
        switch (i13) {
            case 0:
                h3 h3Var = (h3) obj4;
                dh.n0 n0Var = (dh.n0) obj3;
                View view = (View) obj2;
                Long l10 = (Long) obj;
                j4 j4Var = h3Var.f10357a;
                if (z10 && n0Var.f9097f != null) {
                    try {
                        j4Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    i3 = 0;
                    j0Var = new dh.j0(view.getContext(), null, j4Var.P1, null, view, j4Var.getMeasuredWidth() / 2.0f, j4Var.getMeasuredHeight() / 2.0f, n0Var, j4Var.f10480m2, 0, true);
                } else {
                    i3 = 0;
                    j0Var = new dh.j0(view.getContext(), null, j4Var.P1, null, view, j4Var.getMeasuredWidth() / 2.0f, j4Var.getMeasuredHeight() / 2.0f, n0Var, j4Var.f10480m2, 2, true);
                    n0Var = n0Var;
                }
                dh.j0.B = j0Var;
                dh.g0 g0Var = j0Var.f9040i;
                g0Var.setTag(2131296591, 1);
                j4Var.addView(g0Var);
                h4 h4Var = j4Var.f10527y1;
                j0Var.f9050s = true;
                j0Var.f9055y = System.currentTimeMillis();
                if (n0Var.f9097f != null) {
                    e10 = li.b0(j4Var.f10480m2).T(n0Var.f9097f);
                    wy a10 = wy.a(j4Var.f10477l1, n0Var.f9097f);
                    a10.H = h4Var.f10358a;
                    a10.Q = l10.longValue();
                    yy.C(j4Var.f10480m2).r0(a10);
                } else {
                    e10 = org.telegram.ui.Components.g5.e(j4Var.f10480m2, n0Var.f9098g);
                    String V = zi.V(e10, null, null);
                    if (V == null) {
                        if (j4Var.P1.getReactionsWindow() != null) {
                            j4Var.P1.getReactionsWindow().e();
                        }
                        j4Var.q0();
                        return;
                    }
                    wy a11 = wy.a(j4Var.f10477l1, V);
                    a11.f26309w = new ArrayList();
                    TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                    tL_messageEntityCustomEmoji.document_id = n0Var.f9098g;
                    tL_messageEntityCustomEmoji.offset = i3;
                    tL_messageEntityCustomEmoji.length = V.length();
                    a11.f26309w.add(tL_messageEntityCustomEmoji);
                    a11.H = h4Var.f10358a;
                    a11.Q = l10.longValue();
                    yy.C(j4Var.f10480m2).r0(a11);
                }
                if (l10.longValue() <= 0) {
                    ac r5 = new fc(j4Var.M0, j4Var.f10476l0).r(e10, bd.M0(2131746397, null), bd.M0(2131743562, null), new ci.d1(h3Var, 24));
                    r5.f31792j = 5000;
                    r5.j();
                }
                if (j4Var.P1.getReactionsWindow() != null) {
                    j4Var.P1.getReactionsWindow().e();
                }
                j4Var.q0();
                return;
            case 1:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj2;
                j4 j4Var2 = ((b4) obj4).f10126x;
                m3 m3Var = j4Var2.M0;
                if (((Boolean) obj).booleanValue()) {
                    storyItem.pinned = z10;
                    boolean z11 = j4Var2.m1;
                    i10 = 2131623979;
                    if (z11) {
                        fc fcVar2 = new fc(m3Var, e6Var);
                        if (z10) {
                            i10 = 2131623989;
                        }
                        if (z10) {
                            i12 = 2131744592;
                        } else {
                            i12 = 2131744737;
                        }
                        fcVar2.Q(i10, 36, bd.M0(i12, null)).j();
                        return;
                    } else if (z10) {
                        new fc(m3Var, e6Var).I(2131623989, bd.M0(2131744594, null), bd.M0(2131744593, null)).j();
                        return;
                    } else {
                        fcVar = new fc(m3Var, e6Var);
                        i11 = 2131744464;
                    }
                } else {
                    fcVar = new fc(m3Var, e6Var);
                    i10 = 2131624011;
                    i11 = 2131743889;
                }
                org.telegram.messenger.k5.o(null, i11, fcVar, i10, 36);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                int i14 = ChatActivityEnterView.f31082t5;
                ((org.telegram.ui.ActionBar.s1) obj3).dismiss();
                ai.b3 b3Var = new ai.b3(chatActivityEnterView.getContext(), chatActivityEnterView.R, ((TLRPC.User) obj2).f27150id, xg.s.c(xg.s.b(1, (List) obj)), null);
                b3Var.e1(z10);
                b3Var.show();
                return;
        }
    }

    public g3(b4 b4Var, TL_stories.StoryItem storyItem, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f10312c = b4Var;
        this.d = storyItem;
        this.f10311b = z10;
        this.f10313e = e6Var;
    }

    public g3(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.ActionBar.s1 s1Var, TLRPC.User user, boolean z10) {
        this.f10312c = chatActivityEnterView;
        this.d = s1Var;
        this.f10313e = user;
        this.f10311b = z10;
    }
}
