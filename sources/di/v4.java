package di;

import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.id;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ej0;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.m90;
public final class v4 implements ej0 {
    public final q9 f9862a;
    public final l5 f9863b;

    public v4(l5 l5Var, q9 q9Var) {
        this.f9863b = l5Var;
        this.f9862a = q9Var;
    }

    @Override
    public final boolean c(int i7, View view) {
        final TL_stories.StoryView storyView;
        final qp s12;
        final TLRPC.User a22;
        boolean z9;
        boolean z10;
        String str;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        TLRPC.InputStickerSet c10;
        l5 l5Var = this.f9863b;
        b bVar = l5Var.f9330s;
        int i10 = l5Var.f9331w;
        if (view instanceof org.telegram.ui.Cells.m6) {
            final org.telegram.ui.Cells.m6 m6Var = (org.telegram.ui.Cells.m6) view;
            q9 q9Var = this.f9862a;
            if (q9Var.f9643w != null && (storyView = ((c5) l5Var.f9332x.f9073c.get(i7)).f8870b) != null && (a22 = (s12 = qp.s1(i10)).a2(Long.valueOf(storyView.user_id))) != null) {
                if (s12.G0.indexOfKey(a22.f27105id) >= 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (!a22.contact && org.telegram.messenger.g5.r(i10).f22610f0.get(Long.valueOf(a22.f27105id)) == null) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                boolean d = l5Var.d(storyView);
                boolean N = s12.P1().N(storyView);
                boolean B = t10.B(a22);
                if (TextUtils.isEmpty(a22.first_name)) {
                    if (TextUtils.isEmpty(a22.last_name)) {
                        str = "";
                    } else {
                        str = a22.last_name;
                    }
                } else {
                    str = a22.first_name;
                }
                int indexOf = str.indexOf(" ");
                if (indexOf > 2) {
                    str = str.substring(0, indexOf);
                }
                if (B) {
                    return false;
                }
                l60 F = l60.F(q9Var.f9643w, bVar, view);
                F.f35599i = 3;
                F.f35601j = true;
                F.W(new ColorDrawable(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27938h5, bVar)));
                F.f35617s = 133;
                if (d && !N && !z9 && !B) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                final String str2 = str;
                F.l(2131232388, id.a0(null, null, 2131744662, str), new Runnable(this) {
                    public final v4 f9780b;

                    {
                        this.f9780b = this;
                    }

                    @Override
                    public final void run() {
                        int i11 = r7;
                        float f10 = 0.5f;
                        TL_stories.StoryView storyView2 = storyView;
                        org.telegram.ui.Cells.m6 m6Var2 = m6Var;
                        String str3 = str2;
                        TLRPC.User user = a22;
                        qp qpVar = s12;
                        v4 v4Var = this.f9780b;
                        switch (i11) {
                            case 0:
                                qpVar.P1().m0(user.f27105id, true, true);
                                l5 l5Var2 = v4Var.f9863b;
                                new hc(l5Var2, l5Var2.f9330s).Q(2131624049, 36, id.a0(null, null, 2131744663, str3)).j();
                                if (l5Var2.d(storyView2)) {
                                    f10 = 1.0f;
                                }
                                m6Var2.a(true, f10);
                                return;
                            default:
                                qpVar.P1().m0(user.f27105id, false, true);
                                l5 l5Var3 = v4Var.f9863b;
                                new hc(l5Var3, l5Var3.f9330s).Q(2131623989, 36, id.a0(null, null, 2131744461, str3)).j();
                                if (l5Var3.d(storyView2)) {
                                    f10 = 1.0f;
                                }
                                m6Var2.a(true, f10);
                                return;
                        }
                    }
                }, z11);
                F.E();
                F.t();
                if (N && !z9 && !B) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                F.l(2131232223, id.a0(null, null, 2131744462, str2), new Runnable(this) {
                    public final v4 f9780b;

                    {
                        this.f9780b = this;
                    }

                    @Override
                    public final void run() {
                        int i11 = r7;
                        float f10 = 0.5f;
                        TL_stories.StoryView storyView2 = storyView;
                        org.telegram.ui.Cells.m6 m6Var2 = m6Var;
                        String str3 = str2;
                        TLRPC.User user = a22;
                        qp qpVar = s12;
                        v4 v4Var = this.f9780b;
                        switch (i11) {
                            case 0:
                                qpVar.P1().m0(user.f27105id, true, true);
                                l5 l5Var2 = v4Var.f9863b;
                                new hc(l5Var2, l5Var2.f9330s).Q(2131624049, 36, id.a0(null, null, 2131744663, str3)).j();
                                if (l5Var2.d(storyView2)) {
                                    f10 = 1.0f;
                                }
                                m6Var2.a(true, f10);
                                return;
                            default:
                                qpVar.P1().m0(user.f27105id, false, true);
                                l5 l5Var3 = v4Var.f9863b;
                                new hc(l5Var3, l5Var3.f9330s).Q(2131623989, 36, id.a0(null, null, 2131744461, str3)).j();
                                if (l5Var3.d(storyView2)) {
                                    f10 = 1.0f;
                                }
                                m6Var2.a(true, f10);
                                return;
                        }
                    }
                }, z12);
                F.E();
                F.t();
                if (!z10 && !z9 && !B) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                F.m(2131232415, new Runnable(this) {
                    public final v4 f9825b;

                    {
                        this.f9825b = this;
                    }

                    @Override
                    public final void run() {
                        float f10;
                        float f11;
                        switch (r6) {
                            case 0:
                                s12.w(a22.f27105id);
                                l5 l5Var2 = this.f9825b.f9863b;
                                new hc(l5Var2, l5Var2.f9330s).e(true).j();
                                if (l5Var2.d(storyView)) {
                                    f10 = 1.0f;
                                } else {
                                    f10 = 0.5f;
                                }
                                m6Var.a(true, f10);
                                return;
                            default:
                                qp qpVar = s12;
                                z6 P1 = qpVar.P1();
                                TLRPC.User user = a22;
                                P1.m0(user.f27105id, false, true);
                                qpVar.f5(null, user.f27105id);
                                l5 l5Var3 = this.f9825b.f9863b;
                                new hc(l5Var3, l5Var3.f9330s).e(false).j();
                                if (l5Var3.d(storyView)) {
                                    f11 = 1.0f;
                                } else {
                                    f11 = 0.5f;
                                }
                                m6Var.a(true, f11);
                                return;
                        }
                    }
                }, id.M0(2131753692, null), z13, true);
                if (!z10 && z9 && !B) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                F.l(2131232067, id.M0(2131743911, null), new Runnable(this) {
                    public final v4 f9825b;

                    {
                        this.f9825b = this;
                    }

                    @Override
                    public final void run() {
                        float f10;
                        float f11;
                        switch (r6) {
                            case 0:
                                s12.w(a22.f27105id);
                                l5 l5Var2 = this.f9825b.f9863b;
                                new hc(l5Var2, l5Var2.f9330s).e(true).j();
                                if (l5Var2.d(storyView)) {
                                    f10 = 1.0f;
                                } else {
                                    f10 = 0.5f;
                                }
                                m6Var.a(true, f10);
                                return;
                            default:
                                qp qpVar = s12;
                                z6 P1 = qpVar.P1();
                                TLRPC.User user = a22;
                                P1.m0(user.f27105id, false, true);
                                qpVar.f5(null, user.f27105id);
                                l5 l5Var3 = this.f9825b.f9863b;
                                new hc(l5Var3, l5Var3.f9330s).e(false).j();
                                if (l5Var3.d(storyView)) {
                                    f11 = 1.0f;
                                } else {
                                    f11 = 0.5f;
                                }
                                m6Var.a(true, f11);
                                return;
                        }
                    }
                }, z14);
                if (z10 && !B) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                F.m(2131232415, new bi.u0(this, a22, str2, m6Var, storyView, 11), id.M0(2131744687, null), z15, true);
                TLRPC.Reaction reaction = storyView.reaction;
                if ((reaction instanceof TLRPC.TL_reactionCustomEmoji) && (c10 = org.telegram.ui.Components.i5.g(i10).c(((TLRPC.TL_reactionCustomEmoji) reaction).document_id)) != null) {
                    F.k();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(c10);
                    m90 m90Var = new m90(l5Var.f9331w, 3, l5Var.getContext(), arrayList, bVar);
                    m90Var.setOnClickListener(new ah.g(this, arrayList, F, 7));
                    F.q(m90Var);
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (F.x() <= 0 && !z16) {
                    return false;
                }
                F.Z();
                try {
                    l5Var.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                return true;
            }
        }
        return false;
    }
}
