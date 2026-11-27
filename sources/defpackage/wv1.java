package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class wv1 implements pcc {
    public final byte a = 2;
    public final boolean b;
    public final Object c;
    public final Object d;
    public final Object e;

    public wv1(r58 r58Var, boolean z, w49 w49Var, View view) {
        this.c = r58Var;
        this.b = z;
        this.d = w49Var;
        this.e = view;
    }

    @Override
    public final void a(Object obj) {
        s49 s49Var;
        TLRPC.Document document;
        d31 d31Var;
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
                int i3 = ChatActivityEnterView.X7;
                ((id) obj3).dismiss();
                yx4 yx4Var = new yx4(chatActivityEnterView.getContext(), chatActivityEnterView.R, ((TLRPC.User) obj2).id, on0.d(on0.c(1, (List) obj)), null);
                yx4Var.b1(z);
                yx4Var.show();
                return;
            case 1:
                r58 r58Var = (r58) obj4;
                w49 w49Var = (w49) obj3;
                View view = (View) obj2;
                Long l = (Long) obj;
                o68 o68Var = r58Var.a;
                if (z && w49Var.f != null) {
                    try {
                        o68Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    s49Var = new s49(view.getContext(), null, o68Var.P1, null, view, o68Var.getMeasuredWidth() / 2.0f, o68Var.getMeasuredHeight() / 2.0f, w49Var, o68Var.m2, 0, true);
                } else {
                    s49Var = new s49(view.getContext(), null, o68Var.P1, null, view, o68Var.getMeasuredWidth() / 2.0f, o68Var.getMeasuredHeight() / 2.0f, w49Var, o68Var.m2, 2, true);
                }
                s49.B = s49Var;
                p49 p49Var = s49Var.i;
                p49Var.setTag(2131296593, 1);
                o68Var.addView(p49Var);
                n68 n68Var = o68Var.y1;
                s49Var.s = true;
                s49Var.y = System.currentTimeMillis();
                String str = w49Var.f;
                int i4 = o68Var.m2;
                if (str != null) {
                    document = ls6.d0(i4).V(w49Var.f);
                    p7a a = p7a.a(o68Var.l1, w49Var.f);
                    a.H = n68Var.a;
                    a.Q = l.longValue();
                    r7a.B(o68Var.m2).q0(a);
                } else {
                    TLRPC.Document e = wl.e(i4, w49Var.g);
                    String V = r47.V(e, null, null);
                    if (V == null) {
                        if (o68Var.P1.getReactionsWindow() != null) {
                            o68Var.P1.getReactionsWindow().e();
                        }
                        o68Var.i0();
                        return;
                    }
                    p7a a2 = p7a.a(o68Var.l1, V);
                    a2.w = new ArrayList();
                    TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                    tL_messageEntityCustomEmoji.document_id = w49Var.g;
                    tL_messageEntityCustomEmoji.offset = 0;
                    tL_messageEntityCustomEmoji.length = V.length();
                    a2.w.add(tL_messageEntityCustomEmoji);
                    a2.H = n68Var.a;
                    a2.Q = l.longValue();
                    r7a.B(o68Var.m2).q0(a2);
                    document = e;
                }
                if (l.longValue() <= 0) {
                    v21 r = new d31(o68Var.M0, o68Var.l0).r(document, ob6.M0(2131746116, null), ob6.M0(2131743204, null), new x38(r58Var, (byte) 1));
                    r.j = 5000;
                    r.j();
                }
                if (o68Var.P1.getReactionsWindow() != null) {
                    o68Var.P1.getReactionsWindow().e();
                }
                o68Var.i0();
                return;
            default:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                x53 x53Var = (x53) obj2;
                o68 o68Var2 = ((j68) obj4).x;
                u58 u58Var = o68Var2.M0;
                if (((Boolean) obj).booleanValue()) {
                    storyItem.pinned = z;
                    i = 2131623980;
                    int i5 = 2131623990;
                    if (o68Var2.m1) {
                        d31 d31Var2 = new d31(u58Var, x53Var);
                        if (z) {
                            M0 = ob6.M0(2131744236, null);
                        } else {
                            i5 = 2131623980;
                            M0 = ob6.M0(2131744384, null);
                        }
                        d31Var2.Q(i5, 36, M0).j();
                        return;
                    } else if (z) {
                        new d31(u58Var, x53Var).I(2131623990, ob6.M0(2131744238, null), ob6.M0(2131744237, null)).j();
                        return;
                    } else {
                        d31Var = new d31(u58Var, x53Var);
                        i2 = 2131744108;
                    }
                } else {
                    d31Var = new d31(u58Var, x53Var);
                    i = 2131624012;
                    i2 = 2131743534;
                }
                bs2.v(null, i2, d31Var, i, 36);
                return;
        }
    }

    public wv1(j68 j68Var, TL_stories.StoryItem storyItem, boolean z, x53 x53Var) {
        this.c = j68Var;
        this.d = storyItem;
        this.b = z;
        this.e = x53Var;
    }

    public wv1(ChatActivityEnterView chatActivityEnterView, id idVar, TLRPC.User user, boolean z) {
        this.c = chatActivityEnterView;
        this.d = idVar;
        this.e = user;
        this.b = z;
    }
}
