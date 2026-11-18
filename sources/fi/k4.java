package fi;

import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.y60;
import org.telegram.ui.Components.y90;
public final class k4 implements qj0 {
    public final f9 f12184a;
    public final a5 f12185b;

    public k4(a5 a5Var, f9 f9Var) {
        this.f12185b = a5Var;
        this.f12184a = f9Var;
    }

    @Override
    public final boolean c(int i7, View view) {
        final TL_stories.StoryView storyView;
        final mp u12;
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
        a5 a5Var = this.f12185b;
        b bVar = a5Var.f11735s;
        int i10 = a5Var.f11736w;
        if (view instanceof org.telegram.ui.Cells.m6) {
            final org.telegram.ui.Cells.m6 m6Var = (org.telegram.ui.Cells.m6) view;
            f9 f9Var = this.f12184a;
            if (f9Var.f12004w != null && (storyView = ((r4) a5Var.f11737x.f12699c.get(i7)).f12503b) != null && (c22 = (u12 = mp.u1(i10)).c2(Long.valueOf(storyView.user_id))) != null) {
                if (u12.H0.indexOfKey(c22.f28554id) >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!c22.contact && org.telegram.messenger.i5.r(i10).f24571g0.get(Long.valueOf(c22.f28554id)) == null) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                boolean d = a5Var.d(storyView);
                boolean N = u12.R1().N(storyView);
                boolean C = o10.C(c22);
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
                y60 G = y60.G(f9Var.f12004w, bVar, view);
                G.f42356i = 3;
                G.f42358j = true;
                G.X(new ColorDrawable(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29469h5, bVar)));
                G.f42375s = 133;
                if (d && !N && !z10 && !C) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                final String str2 = str;
                G.l(2131232390, gd.a0(null, null, 2131744427, str), new Runnable(this) {
                    public final k4 f12097b;

                    {
                        this.f12097b = this;
                    }

                    @Override
                    public final void run() {
                        int i11 = r7;
                        float f10 = 0.5f;
                        TL_stories.StoryView storyView2 = storyView;
                        org.telegram.ui.Cells.m6 m6Var2 = m6Var;
                        String str3 = str2;
                        TLRPC.User user = c22;
                        mp mpVar = u12;
                        k4 k4Var = this.f12097b;
                        switch (i11) {
                            case 0:
                                mpVar.R1().m0(user.f28554id, true, true);
                                a5 a5Var2 = k4Var.f12185b;
                                new lc(a5Var2, a5Var2.f11735s).Q(2131624050, 36, gd.a0(null, null, 2131744428, str3)).j();
                                if (a5Var2.d(storyView2)) {
                                    f10 = 1.0f;
                                }
                                m6Var2.a(true, f10);
                                return;
                            default:
                                mpVar.R1().m0(user.f28554id, false, true);
                                a5 a5Var3 = k4Var.f12185b;
                                new lc(a5Var3, a5Var3.f11735s).Q(2131623990, 36, gd.a0(null, null, 2131744226, str3)).j();
                                if (a5Var3.d(storyView2)) {
                                    f10 = 1.0f;
                                }
                                m6Var2.a(true, f10);
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
                G.l(2131232225, gd.a0(null, null, 2131744227, str2), new Runnable(this) {
                    public final k4 f12097b;

                    {
                        this.f12097b = this;
                    }

                    @Override
                    public final void run() {
                        int i11 = r7;
                        float f10 = 0.5f;
                        TL_stories.StoryView storyView2 = storyView;
                        org.telegram.ui.Cells.m6 m6Var2 = m6Var;
                        String str3 = str2;
                        TLRPC.User user = c22;
                        mp mpVar = u12;
                        k4 k4Var = this.f12097b;
                        switch (i11) {
                            case 0:
                                mpVar.R1().m0(user.f28554id, true, true);
                                a5 a5Var2 = k4Var.f12185b;
                                new lc(a5Var2, a5Var2.f11735s).Q(2131624050, 36, gd.a0(null, null, 2131744428, str3)).j();
                                if (a5Var2.d(storyView2)) {
                                    f10 = 1.0f;
                                }
                                m6Var2.a(true, f10);
                                return;
                            default:
                                mpVar.R1().m0(user.f28554id, false, true);
                                a5 a5Var3 = k4Var.f12185b;
                                new lc(a5Var3, a5Var3.f11735s).Q(2131623990, 36, gd.a0(null, null, 2131744226, str3)).j();
                                if (a5Var3.d(storyView2)) {
                                    f10 = 1.0f;
                                }
                                m6Var2.a(true, f10);
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
                    public final k4 f12151b;

                    {
                        this.f12151b = this;
                    }

                    @Override
                    public final void run() {
                        float f10;
                        float f11;
                        switch (r6) {
                            case 0:
                                u12.w(c22.f28554id);
                                a5 a5Var2 = this.f12151b.f12185b;
                                new lc(a5Var2, a5Var2.f11735s).e(true).j();
                                if (a5Var2.d(storyView)) {
                                    f10 = 1.0f;
                                } else {
                                    f10 = 0.5f;
                                }
                                m6Var.a(true, f10);
                                return;
                            default:
                                mp mpVar = u12;
                                p6 R1 = mpVar.R1();
                                TLRPC.User user = c22;
                                R1.m0(user.f28554id, false, true);
                                mpVar.r5(null, user.f28554id);
                                a5 a5Var3 = this.f12151b.f12185b;
                                new lc(a5Var3, a5Var3.f11735s).e(false).j();
                                if (a5Var3.d(storyView)) {
                                    f11 = 1.0f;
                                } else {
                                    f11 = 0.5f;
                                }
                                m6Var.a(true, f11);
                                return;
                        }
                    }
                }, gd.M0(2131753690, null), z14, true);
                if (!z11 && z10 && !C) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                G.l(2131232069, gd.M0(2131743674, null), new Runnable(this) {
                    public final k4 f12151b;

                    {
                        this.f12151b = this;
                    }

                    @Override
                    public final void run() {
                        float f10;
                        float f11;
                        switch (r6) {
                            case 0:
                                u12.w(c22.f28554id);
                                a5 a5Var2 = this.f12151b.f12185b;
                                new lc(a5Var2, a5Var2.f11735s).e(true).j();
                                if (a5Var2.d(storyView)) {
                                    f10 = 1.0f;
                                } else {
                                    f10 = 0.5f;
                                }
                                m6Var.a(true, f10);
                                return;
                            default:
                                mp mpVar = u12;
                                p6 R1 = mpVar.R1();
                                TLRPC.User user = c22;
                                R1.m0(user.f28554id, false, true);
                                mpVar.r5(null, user.f28554id);
                                a5 a5Var3 = this.f12151b.f12185b;
                                new lc(a5Var3, a5Var3.f11735s).e(false).j();
                                if (a5Var3.d(storyView)) {
                                    f11 = 1.0f;
                                } else {
                                    f11 = 0.5f;
                                }
                                m6Var.a(true, f11);
                                return;
                        }
                    }
                }, z15);
                if (z11 && !C) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                G.m(2131232417, new ai.b(this, c22, str2, m6Var, storyView, 14), gd.M0(2131744452, null), z16, true);
                TLRPC.Reaction reaction = storyView.reaction;
                if ((reaction instanceof TLRPC.TL_reactionCustomEmoji) && (c10 = org.telegram.ui.Components.o5.g(i10).c(((TLRPC.TL_reactionCustomEmoji) reaction).document_id)) != null) {
                    G.k();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(c10);
                    y90 y90Var = new y90(a5Var.f11736w, 3, a5Var.getContext(), arrayList, bVar);
                    y90Var.setOnClickListener(new ah.h(this, arrayList, G, 12));
                    G.q(y90Var);
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (G.y() <= 0 && !z17) {
                    return false;
                }
                G.a0();
                try {
                    a5Var.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                return true;
            }
        }
        return false;
    }
}
