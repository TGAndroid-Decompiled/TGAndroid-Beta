package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class gv1 implements p8c {
    public final byte a = 1;
    public final boolean b;
    public final Object c;
    public final Object d;
    public final Object e;

    public gv1(a28 a28Var, boolean z, h19 h19Var, View view) {
        this.c = a28Var;
        this.b = z;
        this.d = h19Var;
        this.e = view;
    }

    @Override
    public final void a(Object obj) {
        d19 d19Var;
        TLRPC.Document e;
        u21 u21Var;
        int i;
        int i2;
        String M0;
        byte b = this.a;
        Object obj2 = this.e;
        boolean z = this.b;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                int i3 = ChatActivityEnterView.r7;
                ((hd) obj3).dismiss();
                tv4 tv4Var = new tv4(chatActivityEnterView.getContext(), chatActivityEnterView.R, ((TLRPC.User) obj2).id, on0.d(on0.c(1, (List) obj)), null);
                tv4Var.a1(z);
                tv4Var.show();
                return;
            case 1:
                a28 a28Var = (a28) obj4;
                h19 h19Var = (h19) obj3;
                View view = (View) obj2;
                Long l = (Long) obj;
                y28 y28Var = a28Var.a;
                if (z && h19Var.f != null) {
                    try {
                        y28Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    d19Var = new d19(view.getContext(), null, y28Var.V1, null, view, y28Var.getMeasuredWidth() / 2.0f, y28Var.getMeasuredHeight() / 2.0f, h19Var, y28Var.s2, 0, true);
                } else {
                    d19Var = new d19(view.getContext(), null, y28Var.V1, null, view, y28Var.getMeasuredWidth() / 2.0f, y28Var.getMeasuredHeight() / 2.0f, h19Var, y28Var.s2, 2, true);
                }
                d19.B = d19Var;
                a19 a19Var = d19Var.i;
                a19Var.setTag(2131296593, 1);
                y28Var.addView(a19Var);
                x28 x28Var = y28Var.E1;
                d19Var.s = true;
                d19Var.y = System.currentTimeMillis();
                String str = h19Var.f;
                int i4 = y28Var.s2;
                if (str != null) {
                    e = hq6.d0(i4).V(h19Var.f);
                    x3a a = x3a.a(y28Var.r1, h19Var.f);
                    a.H = x28Var.a;
                    a.Q = l.longValue();
                    z3a.B(y28Var.s2).q0(a);
                } else {
                    e = vl.e(i4, h19Var.g);
                    String V = k27.V(e, null, null);
                    if (V == null) {
                        if (y28Var.V1.getReactionsWindow() != null) {
                            y28Var.V1.getReactionsWindow().e();
                        }
                        y28Var.i0();
                        return;
                    }
                    x3a a2 = x3a.a(y28Var.r1, V);
                    a2.w = new ArrayList();
                    TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                    tL_messageEntityCustomEmoji.document_id = h19Var.g;
                    tL_messageEntityCustomEmoji.offset = 0;
                    tL_messageEntityCustomEmoji.length = V.length();
                    a2.w.add(tL_messageEntityCustomEmoji);
                    a2.H = x28Var.a;
                    a2.Q = l.longValue();
                    z3a.B(y28Var.s2).q0(a2);
                }
                if (l.longValue() <= 0) {
                    m21 r = new u21(y28Var.S0, y28Var.r0).r(e, k96.M0(2131746196, null), k96.M0(2131743310, null), new oq7(a28Var, (byte) 16));
                    r.j = 5000;
                    r.j();
                }
                if (y28Var.V1.getReactionsWindow() != null) {
                    y28Var.V1.getReactionsWindow().e();
                }
                y28Var.i0();
                return;
            default:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                f53 f53Var = (f53) obj2;
                y28 y28Var2 = ((s28) obj4).x;
                d28 d28Var = y28Var2.S0;
                if (((Boolean) obj).booleanValue()) {
                    storyItem.pinned = z;
                    i = 2131623980;
                    int i5 = 2131623990;
                    if (y28Var2.s1) {
                        u21 u21Var2 = new u21(d28Var, f53Var);
                        if (z) {
                            M0 = k96.M0(2131744342, null);
                        } else {
                            i5 = 2131623980;
                            M0 = k96.M0(2131744490, null);
                        }
                        u21Var2.Q(i5, 36, M0).j();
                        return;
                    } else if (z) {
                        new u21(d28Var, f53Var).I(2131623990, k96.M0(2131744344, null), k96.M0(2131744343, null)).j();
                        return;
                    } else {
                        u21Var = new u21(d28Var, f53Var);
                        i2 = 2131744214;
                    }
                } else {
                    u21Var = new u21(d28Var, f53Var);
                    i = 2131624012;
                    i2 = 2131743640;
                }
                ir2.v(null, i2, u21Var, i, 36);
                return;
        }
    }

    public gv1(s28 s28Var, TL_stories.StoryItem storyItem, boolean z, f53 f53Var) {
        this.c = s28Var;
        this.d = storyItem;
        this.b = z;
        this.e = f53Var;
    }

    public gv1(ChatActivityEnterView chatActivityEnterView, hd hdVar, TLRPC.User user, boolean z) {
        this.c = chatActivityEnterView;
        this.d = hdVar;
        this.e = user;
        this.b = z;
    }
}
