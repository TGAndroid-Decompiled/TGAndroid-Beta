package ei;

import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.l10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.hj0;
public final class u4 implements hj0 {
    public final r9 f11087a;
    public final k5 f11088b;

    public u4(k5 k5Var, r9 r9Var) {
        this.f11088b = k5Var;
        this.f11087a = r9Var;
    }

    @Override
    public final boolean f(int i3, View view) {
        final TL_stories.StoryView storyView;
        final hp s12;
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
        TLRPC.InputStickerSet c2;
        k5 k5Var = this.f11088b;
        b bVar = k5Var.f10578s;
        int i10 = k5Var.f10579w;
        if (view instanceof org.telegram.ui.Cells.l6) {
            final org.telegram.ui.Cells.l6 l6Var = (org.telegram.ui.Cells.l6) view;
            r9 r9Var = this.f11087a;
            if (r9Var.f10957w != null && (storyView = ((b5) k5Var.f10580x.f10333c.get(i3)).f10128b) != null && (a22 = (s12 = hp.s1(i10)).a2(Long.valueOf(storyView.user_id))) != null) {
                if (s12.H0.indexOfKey(a22.f27150id) >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!a22.contact && org.telegram.messenger.g5.r(i10).f22654g0.get(Long.valueOf(a22.f27150id)) == null) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                boolean d = k5Var.d(storyView);
                boolean N = s12.P1().N(storyView);
                boolean B = l10.B(a22);
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
                f60 F = f60.F(r9Var.f10957w, bVar, view);
                F.f33729i = 3;
                F.f33731j = true;
                F.W(new ColorDrawable(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27954h5, bVar)));
                F.f33747s = 133;
                if (d && !N && !z10 && !B) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                final String str2 = str;
                F.l(2131232388, bd.a0(null, null, 2131744672, str), new Runnable(this) {
                    public final u4 f10993b;

                    {
                        this.f10993b = this;
                    }

                    @Override
                    public final void run() {
                        int i11 = r7;
                        float f10 = 0.5f;
                        TL_stories.StoryView storyView2 = storyView;
                        org.telegram.ui.Cells.l6 l6Var2 = l6Var;
                        String str3 = str2;
                        TLRPC.User user = a22;
                        hp hpVar = s12;
                        u4 u4Var = this.f10993b;
                        switch (i11) {
                            case 0:
                                hpVar.P1().m0(user.f27150id, true, true);
                                k5 k5Var2 = u4Var.f11088b;
                                new fc(k5Var2, k5Var2.f10578s).Q(2131624049, 36, bd.a0(null, null, 2131744673, str3)).j();
                                if (k5Var2.d(storyView2)) {
                                    f10 = 1.0f;
                                }
                                l6Var2.a(true, f10);
                                return;
                            default:
                                hpVar.P1().m0(user.f27150id, false, true);
                                k5 k5Var3 = u4Var.f11088b;
                                new fc(k5Var3, k5Var3.f10578s).Q(2131623989, 36, bd.a0(null, null, 2131744471, str3)).j();
                                if (k5Var3.d(storyView2)) {
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
                F.l(2131232223, bd.a0(null, null, 2131744472, str2), new Runnable(this) {
                    public final u4 f10993b;

                    {
                        this.f10993b = this;
                    }

                    @Override
                    public final void run() {
                        int i11 = r7;
                        float f10 = 0.5f;
                        TL_stories.StoryView storyView2 = storyView;
                        org.telegram.ui.Cells.l6 l6Var2 = l6Var;
                        String str3 = str2;
                        TLRPC.User user = a22;
                        hp hpVar = s12;
                        u4 u4Var = this.f10993b;
                        switch (i11) {
                            case 0:
                                hpVar.P1().m0(user.f27150id, true, true);
                                k5 k5Var2 = u4Var.f11088b;
                                new fc(k5Var2, k5Var2.f10578s).Q(2131624049, 36, bd.a0(null, null, 2131744673, str3)).j();
                                if (k5Var2.d(storyView2)) {
                                    f10 = 1.0f;
                                }
                                l6Var2.a(true, f10);
                                return;
                            default:
                                hpVar.P1().m0(user.f27150id, false, true);
                                k5 k5Var3 = u4Var.f11088b;
                                new fc(k5Var3, k5Var3.f10578s).Q(2131623989, 36, bd.a0(null, null, 2131744471, str3)).j();
                                if (k5Var3.d(storyView2)) {
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
                F.m(2131232415, new Runnable(this) {
                    public final u4 f11044b;

                    {
                        this.f11044b = this;
                    }

                    @Override
                    public final void run() {
                        float f10;
                        float f11;
                        switch (r6) {
                            case 0:
                                s12.w(a22.f27150id);
                                k5 k5Var2 = this.f11044b.f11088b;
                                new fc(k5Var2, k5Var2.f10578s).e(true).j();
                                if (k5Var2.d(storyView)) {
                                    f10 = 1.0f;
                                } else {
                                    f10 = 0.5f;
                                }
                                l6Var.a(true, f10);
                                return;
                            default:
                                hp hpVar = s12;
                                z6 P1 = hpVar.P1();
                                TLRPC.User user = a22;
                                P1.m0(user.f27150id, false, true);
                                hpVar.f5(null, user.f27150id);
                                k5 k5Var3 = this.f11044b.f11088b;
                                new fc(k5Var3, k5Var3.f10578s).e(false).j();
                                if (k5Var3.d(storyView)) {
                                    f11 = 1.0f;
                                } else {
                                    f11 = 0.5f;
                                }
                                l6Var.a(true, f11);
                                return;
                        }
                    }
                }, bd.M0(2131753692, null), z14, true);
                if (!z11 && z10 && !B) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                F.l(2131232067, bd.M0(2131743921, null), new Runnable(this) {
                    public final u4 f11044b;

                    {
                        this.f11044b = this;
                    }

                    @Override
                    public final void run() {
                        float f10;
                        float f11;
                        switch (r6) {
                            case 0:
                                s12.w(a22.f27150id);
                                k5 k5Var2 = this.f11044b.f11088b;
                                new fc(k5Var2, k5Var2.f10578s).e(true).j();
                                if (k5Var2.d(storyView)) {
                                    f10 = 1.0f;
                                } else {
                                    f10 = 0.5f;
                                }
                                l6Var.a(true, f10);
                                return;
                            default:
                                hp hpVar = s12;
                                z6 P1 = hpVar.P1();
                                TLRPC.User user = a22;
                                P1.m0(user.f27150id, false, true);
                                hpVar.f5(null, user.f27150id);
                                k5 k5Var3 = this.f11044b.f11088b;
                                new fc(k5Var3, k5Var3.f10578s).e(false).j();
                                if (k5Var3.d(storyView)) {
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
                F.m(2131232415, new ai.t6(this, a22, str2, l6Var, storyView, 12), bd.M0(2131744697, null), z16, true);
                TLRPC.Reaction reaction = storyView.reaction;
                if ((reaction instanceof TLRPC.TL_reactionCustomEmoji) && (c2 = org.telegram.ui.Components.g5.g(i10).c(((TLRPC.TL_reactionCustomEmoji) reaction).document_id)) != null) {
                    F.k();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(c2);
                    h90 h90Var = new h90(k5Var.f10579w, 3, k5Var.getContext(), arrayList, bVar);
                    h90Var.setOnClickListener(new ai.h(this, arrayList, F, 12));
                    F.q(h90Var);
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (F.x() <= 0 && !z17) {
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
