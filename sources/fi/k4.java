package fi;

import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.sj0;
public final class k4 implements sj0 {
    public final f9 f12223a;
    public final b5 f12224b;

    public k4(b5 b5Var, f9 f9Var) {
        this.f12224b = b5Var;
        this.f12223a = f9Var;
    }

    @Override
    public final boolean c(int i7, View view) {
        final TL_stories.StoryView storyView;
        final np u12;
        final TLRPC.User c22;
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
        b5 b5Var = this.f12224b;
        b bVar = b5Var.f11819s;
        int i10 = b5Var.f11820w;
        if (view instanceof org.telegram.ui.Cells.n6) {
            final org.telegram.ui.Cells.n6 n6Var = (org.telegram.ui.Cells.n6) view;
            f9 f9Var = this.f12223a;
            if (f9Var.f12045w != null && (storyView = ((s4) b5Var.f11821x.f12774c.get(i7)).f12562b) != null && (c22 = (u12 = np.u1(i10)).c2(Long.valueOf(storyView.user_id))) != null) {
                if (u12.H0.indexOfKey(c22.f28583id) >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!c22.contact && org.telegram.messenger.i5.r(i10).f24606g0.get(Long.valueOf(c22.f28583id)) == null) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                boolean d = b5Var.d(storyView);
                boolean N = u12.R1().N(storyView);
                boolean C = p10.C(c22);
                if (TextUtils.isEmpty(c22.first_name)) {
                    if (TextUtils.isEmpty(c22.last_name)) {
                        str = "";
                    } else {
                        str = c22.last_name;
                    }
                } else {
                    str = c22.first_name;
                }
                int indexOf = str.indexOf(" ");
                if (indexOf > 2) {
                    str = str.substring(0, indexOf);
                }
                if (C) {
                    return false;
                }
                a70 G = a70.G(f9Var.f12045w, bVar, view);
                G.f33378i = 3;
                G.f33380j = true;
                G.X(new ColorDrawable(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29454h5, bVar)));
                G.f33397s = 133;
                if (d && !N && !z10 && !C) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                final String str2 = str;
                G.l(2131232390, hd.a0(null, null, 2131744419, str), new Runnable(this) {
                    public final k4 f12138b;

                    {
                        this.f12138b = this;
                    }

                    @Override
                    public final void run() {
                        int i11 = r7;
                        float f10 = 0.5f;
                        TL_stories.StoryView storyView2 = storyView;
                        org.telegram.ui.Cells.n6 n6Var2 = n6Var;
                        String str3 = str2;
                        TLRPC.User user = c22;
                        np npVar = u12;
                        k4 k4Var = this.f12138b;
                        switch (i11) {
                            case 0:
                                npVar.R1().m0(user.f28583id, true, true);
                                b5 b5Var2 = k4Var.f12224b;
                                new lc(b5Var2, b5Var2.f11819s).Q(2131624050, 36, hd.a0(null, null, 2131744420, str3)).j();
                                if (b5Var2.d(storyView2)) {
                                    f10 = 1.0f;
                                }
                                n6Var2.a(true, f10);
                                return;
                            default:
                                npVar.R1().m0(user.f28583id, false, true);
                                b5 b5Var3 = k4Var.f12224b;
                                new lc(b5Var3, b5Var3.f11819s).Q(2131623990, 36, hd.a0(null, null, 2131744218, str3)).j();
                                if (b5Var3.d(storyView2)) {
                                    f10 = 1.0f;
                                }
                                n6Var2.a(true, f10);
                                return;
                        }
                    }
                }, z12);
                G.F();
                G.u();
                if (N && !z10 && !C) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                G.l(2131232225, hd.a0(null, null, 2131744219, str2), new Runnable(this) {
                    public final k4 f12138b;

                    {
                        this.f12138b = this;
                    }

                    @Override
                    public final void run() {
                        int i11 = r7;
                        float f10 = 0.5f;
                        TL_stories.StoryView storyView2 = storyView;
                        org.telegram.ui.Cells.n6 n6Var2 = n6Var;
                        String str3 = str2;
                        TLRPC.User user = c22;
                        np npVar = u12;
                        k4 k4Var = this.f12138b;
                        switch (i11) {
                            case 0:
                                npVar.R1().m0(user.f28583id, true, true);
                                b5 b5Var2 = k4Var.f12224b;
                                new lc(b5Var2, b5Var2.f11819s).Q(2131624050, 36, hd.a0(null, null, 2131744420, str3)).j();
                                if (b5Var2.d(storyView2)) {
                                    f10 = 1.0f;
                                }
                                n6Var2.a(true, f10);
                                return;
                            default:
                                npVar.R1().m0(user.f28583id, false, true);
                                b5 b5Var3 = k4Var.f12224b;
                                new lc(b5Var3, b5Var3.f11819s).Q(2131623990, 36, hd.a0(null, null, 2131744218, str3)).j();
                                if (b5Var3.d(storyView2)) {
                                    f10 = 1.0f;
                                }
                                n6Var2.a(true, f10);
                                return;
                        }
                    }
                }, z13);
                G.F();
                G.u();
                if (!z11 && !z10 && !C) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                G.m(2131232417, new Runnable(this) {
                    public final k4 f12183b;

                    {
                        this.f12183b = this;
                    }

                    @Override
                    public final void run() {
                        float f10;
                        float f11;
                        switch (r6) {
                            case 0:
                                u12.w(c22.f28583id);
                                b5 b5Var2 = this.f12183b.f12224b;
                                new lc(b5Var2, b5Var2.f11819s).e(true).j();
                                if (b5Var2.d(storyView)) {
                                    f10 = 1.0f;
                                } else {
                                    f10 = 0.5f;
                                }
                                n6Var.a(true, f10);
                                return;
                            default:
                                np npVar = u12;
                                p6 R1 = npVar.R1();
                                TLRPC.User user = c22;
                                R1.m0(user.f28583id, false, true);
                                npVar.r5(null, user.f28583id);
                                b5 b5Var3 = this.f12183b.f12224b;
                                new lc(b5Var3, b5Var3.f11819s).e(false).j();
                                if (b5Var3.d(storyView)) {
                                    f11 = 1.0f;
                                } else {
                                    f11 = 0.5f;
                                }
                                n6Var.a(true, f11);
                                return;
                        }
                    }
                }, hd.N0(2131753689, null), z14, true);
                if (!z11 && z10 && !C) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                G.l(2131232069, hd.N0(2131743666, null), new Runnable(this) {
                    public final k4 f12183b;

                    {
                        this.f12183b = this;
                    }

                    @Override
                    public final void run() {
                        float f10;
                        float f11;
                        switch (r6) {
                            case 0:
                                u12.w(c22.f28583id);
                                b5 b5Var2 = this.f12183b.f12224b;
                                new lc(b5Var2, b5Var2.f11819s).e(true).j();
                                if (b5Var2.d(storyView)) {
                                    f10 = 1.0f;
                                } else {
                                    f10 = 0.5f;
                                }
                                n6Var.a(true, f10);
                                return;
                            default:
                                np npVar = u12;
                                p6 R1 = npVar.R1();
                                TLRPC.User user = c22;
                                R1.m0(user.f28583id, false, true);
                                npVar.r5(null, user.f28583id);
                                b5 b5Var3 = this.f12183b.f12224b;
                                new lc(b5Var3, b5Var3.f11819s).e(false).j();
                                if (b5Var3.d(storyView)) {
                                    f11 = 1.0f;
                                } else {
                                    f11 = 0.5f;
                                }
                                n6Var.a(true, f11);
                                return;
                        }
                    }
                }, z15);
                if (z11 && !C) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                G.m(2131232417, new ai.b(this, c22, str2, n6Var, storyView, 14), hd.N0(2131744444, null), z16, true);
                TLRPC.Reaction reaction = storyView.reaction;
                if ((reaction instanceof TLRPC.TL_reactionCustomEmoji) && (c10 = org.telegram.ui.Components.p5.g(i10).c(((TLRPC.TL_reactionCustomEmoji) reaction).document_id)) != null) {
                    G.k();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(c10);
                    aa0 aa0Var = new aa0(b5Var.f11820w, 3, b5Var.getContext(), arrayList, bVar);
                    aa0Var.setOnClickListener(new ah.h(this, arrayList, G, 12));
                    G.q(aa0Var);
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (G.y() <= 0 && !z17) {
                    return false;
                }
                G.a0();
                try {
                    b5Var.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                return true;
            }
        }
        return false;
    }
}
