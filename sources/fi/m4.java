package fi;

import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.n90;
public final class m4 implements ij0 {
    public final i9 f12029a;
    public final c5 f12030b;

    public m4(c5 c5Var, i9 i9Var) {
        this.f12030b = c5Var;
        this.f12029a = i9Var;
    }

    @Override
    public final boolean b(int i7, View view) {
        final TL_stories.StoryView storyView;
        final np s12;
        final TLRPC.User a22;
        boolean z10;
        boolean z11;
        String str;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        TLRPC.InputStickerSet c10;
        c5 c5Var = this.f12030b;
        b bVar = c5Var.f11604s;
        int i10 = c5Var.f11605w;
        if (view instanceof org.telegram.ui.Cells.l6) {
            final org.telegram.ui.Cells.l6 l6Var = (org.telegram.ui.Cells.l6) view;
            i9 i9Var = this.f12029a;
            if (i9Var.f11879w != null && (storyView = ((t4) c5Var.f11606x.f12546c.get(i7)).f12362b) != null && (a22 = (s12 = np.s1(i10)).a2(Long.valueOf(storyView.user_id))) != null) {
                if (s12.H0.indexOfKey(a22.f28200id) >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!a22.contact && org.telegram.messenger.g5.r(i10).f23680g0.get(Long.valueOf(a22.f28200id)) == null) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                boolean d = c5Var.d(storyView);
                boolean N = s12.P1().N(storyView);
                boolean B = q10.B(a22);
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
                m60 F = m60.F(i9Var.f11879w, bVar, view);
                F.f37093i = 3;
                F.f37095j = true;
                F.W(new ColorDrawable(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28922h5, bVar)));
                F.f37111s = 133;
                if (d && !N && !z10 && !B) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                final String str2 = str;
                F.l(2131232389, hd.a0(null, null, 2131744662, str), new Runnable(this) {
                    public final m4 f11923b;

                    {
                        this.f11923b = this;
                    }

                    @Override
                    public final void run() {
                        int i11 = r7;
                        float f10 = 0.5f;
                        TL_stories.StoryView storyView2 = storyView;
                        org.telegram.ui.Cells.l6 l6Var2 = l6Var;
                        String str3 = str2;
                        TLRPC.User user = a22;
                        np npVar = s12;
                        m4 m4Var = this.f11923b;
                        switch (i11) {
                            case 0:
                                npVar.P1().m0(user.f28200id, true, true);
                                c5 c5Var2 = m4Var.f12030b;
                                new cc(c5Var2, c5Var2.f11604s).Q(2131624050, 36, hd.a0(null, null, 2131744663, str3)).j();
                                if (c5Var2.d(storyView2)) {
                                    f10 = 1.0f;
                                }
                                l6Var2.a(true, f10);
                                return;
                            default:
                                npVar.P1().m0(user.f28200id, false, true);
                                c5 c5Var3 = m4Var.f12030b;
                                new cc(c5Var3, c5Var3.f11604s).Q(2131623990, 36, hd.a0(null, null, 2131744461, str3)).j();
                                if (c5Var3.d(storyView2)) {
                                    f10 = 1.0f;
                                }
                                l6Var2.a(true, f10);
                                return;
                        }
                    }
                }, z12);
                F.E();
                F.t();
                if (N && !z10 && !B) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                F.l(2131232224, hd.a0(null, null, 2131744462, str2), new Runnable(this) {
                    public final m4 f11923b;

                    {
                        this.f11923b = this;
                    }

                    @Override
                    public final void run() {
                        int i11 = r7;
                        float f10 = 0.5f;
                        TL_stories.StoryView storyView2 = storyView;
                        org.telegram.ui.Cells.l6 l6Var2 = l6Var;
                        String str3 = str2;
                        TLRPC.User user = a22;
                        np npVar = s12;
                        m4 m4Var = this.f11923b;
                        switch (i11) {
                            case 0:
                                npVar.P1().m0(user.f28200id, true, true);
                                c5 c5Var2 = m4Var.f12030b;
                                new cc(c5Var2, c5Var2.f11604s).Q(2131624050, 36, hd.a0(null, null, 2131744663, str3)).j();
                                if (c5Var2.d(storyView2)) {
                                    f10 = 1.0f;
                                }
                                l6Var2.a(true, f10);
                                return;
                            default:
                                npVar.P1().m0(user.f28200id, false, true);
                                c5 c5Var3 = m4Var.f12030b;
                                new cc(c5Var3, c5Var3.f11604s).Q(2131623990, 36, hd.a0(null, null, 2131744461, str3)).j();
                                if (c5Var3.d(storyView2)) {
                                    f10 = 1.0f;
                                }
                                l6Var2.a(true, f10);
                                return;
                        }
                    }
                }, z13);
                F.E();
                F.t();
                if (!z11 && !z10 && !B) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                F.m(2131232416, new Runnable(this) {
                    public final m4 f11990b;

                    {
                        this.f11990b = this;
                    }

                    @Override
                    public final void run() {
                        float f10;
                        float f11;
                        switch (r6) {
                            case 0:
                                s12.w(a22.f28200id);
                                c5 c5Var2 = this.f11990b.f12030b;
                                new cc(c5Var2, c5Var2.f11604s).e(true).j();
                                if (c5Var2.d(storyView)) {
                                    f10 = 1.0f;
                                } else {
                                    f10 = 0.5f;
                                }
                                l6Var.a(true, f10);
                                return;
                            default:
                                np npVar = s12;
                                s6 P1 = npVar.P1();
                                TLRPC.User user = a22;
                                P1.m0(user.f28200id, false, true);
                                npVar.g5(null, user.f28200id);
                                c5 c5Var3 = this.f11990b.f12030b;
                                new cc(c5Var3, c5Var3.f11604s).e(false).j();
                                if (c5Var3.d(storyView)) {
                                    f11 = 1.0f;
                                } else {
                                    f11 = 0.5f;
                                }
                                l6Var.a(true, f11);
                                return;
                        }
                    }
                }, hd.M0(2131753692, null), z14, true);
                if (!z11 && z10 && !B) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                F.l(2131232068, hd.M0(2131743911, null), new Runnable(this) {
                    public final m4 f11990b;

                    {
                        this.f11990b = this;
                    }

                    @Override
                    public final void run() {
                        float f10;
                        float f11;
                        switch (r6) {
                            case 0:
                                s12.w(a22.f28200id);
                                c5 c5Var2 = this.f11990b.f12030b;
                                new cc(c5Var2, c5Var2.f11604s).e(true).j();
                                if (c5Var2.d(storyView)) {
                                    f10 = 1.0f;
                                } else {
                                    f10 = 0.5f;
                                }
                                l6Var.a(true, f10);
                                return;
                            default:
                                np npVar = s12;
                                s6 P1 = npVar.P1();
                                TLRPC.User user = a22;
                                P1.m0(user.f28200id, false, true);
                                npVar.g5(null, user.f28200id);
                                c5 c5Var3 = this.f11990b.f12030b;
                                new cc(c5Var3, c5Var3.f11604s).e(false).j();
                                if (c5Var3.d(storyView)) {
                                    f11 = 1.0f;
                                } else {
                                    f11 = 0.5f;
                                }
                                l6Var.a(true, f11);
                                return;
                        }
                    }
                }, z15);
                if (z11 && !B) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                F.m(2131232416, new ai.b(this, a22, str2, l6Var, storyView, 13), hd.M0(2131744687, null), z16, true);
                TLRPC.Reaction reaction = storyView.reaction;
                if ((reaction instanceof TLRPC.TL_reactionCustomEmoji) && (c10 = org.telegram.ui.Components.g5.g(i10).c(((TLRPC.TL_reactionCustomEmoji) reaction).document_id)) != null) {
                    F.k();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(c10);
                    n90 n90Var = new n90(c5Var.f11605w, 3, c5Var.getContext(), arrayList, bVar);
                    n90Var.setOnClickListener(new ah.g(this, arrayList, F, 12));
                    F.q(n90Var);
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (F.x() <= 0 && !z17) {
                    return false;
                }
                F.Z();
                try {
                    c5Var.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                return true;
            }
        }
        return false;
    }
}
