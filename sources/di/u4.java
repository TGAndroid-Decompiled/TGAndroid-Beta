package di;

import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.dj0;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.l90;
public final class u4 implements dj0 {
    public final p9 f9834a;
    public final k5 f9835b;

    public u4(k5 k5Var, p9 p9Var) {
        this.f9835b = k5Var;
        this.f9834a = p9Var;
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
        k5 k5Var = this.f9835b;
        b bVar = k5Var.f9306s;
        int i10 = k5Var.f9307w;
        if (view instanceof org.telegram.ui.Cells.m6) {
            final org.telegram.ui.Cells.m6 m6Var = (org.telegram.ui.Cells.m6) view;
            p9 p9Var = this.f9834a;
            if (p9Var.f9578w != null && (storyView = ((b5) k5Var.f9308x.f9047c.get(i7)).f8844b) != null && (a22 = (s12 = qp.s1(i10)).a2(Long.valueOf(storyView.user_id))) != null) {
                if (s12.G0.indexOfKey(a22.f27101id) >= 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (!a22.contact && org.telegram.messenger.g5.r(i10).f22584f0.get(Long.valueOf(a22.f27101id)) == null) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                boolean d = k5Var.d(storyView);
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
                k60 F = k60.F(p9Var.f9578w, bVar, view);
                F.f35162i = 3;
                F.f35164j = true;
                F.W(new ColorDrawable(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27921h5, bVar)));
                F.f35180s = 133;
                if (d && !N && !z9 && !B) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                final String str2 = str;
                F.l(2131232388, hd.a0(null, null, 2131744663, str), new Runnable(this) {
                    public final u4 f9751b;

                    {
                        this.f9751b = this;
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
                        u4 u4Var = this.f9751b;
                        switch (i11) {
                            case 0:
                                qpVar.P1().m0(user.f27101id, true, true);
                                k5 k5Var2 = u4Var.f9835b;
                                new hc(k5Var2, k5Var2.f9306s).Q(2131624049, 36, hd.a0(null, null, 2131744664, str3)).j();
                                if (k5Var2.d(storyView2)) {
                                    f10 = 1.0f;
                                }
                                m6Var2.a(true, f10);
                                return;
                            default:
                                qpVar.P1().m0(user.f27101id, false, true);
                                k5 k5Var3 = u4Var.f9835b;
                                new hc(k5Var3, k5Var3.f9306s).Q(2131623989, 36, hd.a0(null, null, 2131744462, str3)).j();
                                if (k5Var3.d(storyView2)) {
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
                F.l(2131232223, hd.a0(null, null, 2131744463, str2), new Runnable(this) {
                    public final u4 f9751b;

                    {
                        this.f9751b = this;
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
                        u4 u4Var = this.f9751b;
                        switch (i11) {
                            case 0:
                                qpVar.P1().m0(user.f27101id, true, true);
                                k5 k5Var2 = u4Var.f9835b;
                                new hc(k5Var2, k5Var2.f9306s).Q(2131624049, 36, hd.a0(null, null, 2131744664, str3)).j();
                                if (k5Var2.d(storyView2)) {
                                    f10 = 1.0f;
                                }
                                m6Var2.a(true, f10);
                                return;
                            default:
                                qpVar.P1().m0(user.f27101id, false, true);
                                k5 k5Var3 = u4Var.f9835b;
                                new hc(k5Var3, k5Var3.f9306s).Q(2131623989, 36, hd.a0(null, null, 2131744462, str3)).j();
                                if (k5Var3.d(storyView2)) {
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
                    public final u4 f9786b;

                    {
                        this.f9786b = this;
                    }

                    @Override
                    public final void run() {
                        float f10;
                        float f11;
                        switch (r6) {
                            case 0:
                                s12.w(a22.f27101id);
                                k5 k5Var2 = this.f9786b.f9835b;
                                new hc(k5Var2, k5Var2.f9306s).e(true).j();
                                if (k5Var2.d(storyView)) {
                                    f10 = 1.0f;
                                } else {
                                    f10 = 0.5f;
                                }
                                m6Var.a(true, f10);
                                return;
                            default:
                                qp qpVar = s12;
                                y6 P1 = qpVar.P1();
                                TLRPC.User user = a22;
                                P1.m0(user.f27101id, false, true);
                                qpVar.f5(null, user.f27101id);
                                k5 k5Var3 = this.f9786b.f9835b;
                                new hc(k5Var3, k5Var3.f9306s).e(false).j();
                                if (k5Var3.d(storyView)) {
                                    f11 = 1.0f;
                                } else {
                                    f11 = 0.5f;
                                }
                                m6Var.a(true, f11);
                                return;
                        }
                    }
                }, hd.M0(2131753692, null), z13, true);
                if (!z10 && z9 && !B) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                F.l(2131232067, hd.M0(2131743912, null), new Runnable(this) {
                    public final u4 f9786b;

                    {
                        this.f9786b = this;
                    }

                    @Override
                    public final void run() {
                        float f10;
                        float f11;
                        switch (r6) {
                            case 0:
                                s12.w(a22.f27101id);
                                k5 k5Var2 = this.f9786b.f9835b;
                                new hc(k5Var2, k5Var2.f9306s).e(true).j();
                                if (k5Var2.d(storyView)) {
                                    f10 = 1.0f;
                                } else {
                                    f10 = 0.5f;
                                }
                                m6Var.a(true, f10);
                                return;
                            default:
                                qp qpVar = s12;
                                y6 P1 = qpVar.P1();
                                TLRPC.User user = a22;
                                P1.m0(user.f27101id, false, true);
                                qpVar.f5(null, user.f27101id);
                                k5 k5Var3 = this.f9786b.f9835b;
                                new hc(k5Var3, k5Var3.f9306s).e(false).j();
                                if (k5Var3.d(storyView)) {
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
                F.m(2131232415, new bi.u0(this, a22, str2, m6Var, storyView, 11), hd.M0(2131744688, null), z15, true);
                TLRPC.Reaction reaction = storyView.reaction;
                if ((reaction instanceof TLRPC.TL_reactionCustomEmoji) && (c10 = org.telegram.ui.Components.i5.g(i10).c(((TLRPC.TL_reactionCustomEmoji) reaction).document_id)) != null) {
                    F.k();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(c10);
                    l90 l90Var = new l90(k5Var.f9307w, 3, k5Var.getContext(), arrayList, bVar);
                    l90Var.setOnClickListener(new ah.g(this, arrayList, F, 7));
                    F.q(l90Var);
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (F.x() <= 0 && !z16) {
                    return false;
                }
                F.Z();
                try {
                    k5Var.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                return true;
            }
        }
        return false;
    }
}
