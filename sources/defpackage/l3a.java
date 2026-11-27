package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class l3a implements t69 {
    public final lcb a;
    public final z3a b;

    public l3a(z3a z3aVar, lcb lcbVar) {
        this.b = z3aVar;
        this.a = lcbVar;
    }

    @Override
    public final boolean e(int i, View view) {
        final TL_stories.StoryView storyView;
        final uc7 s1;
        final TLRPC.User X1;
        boolean z;
        boolean z2;
        String str;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        TLRPC.InputStickerSet c;
        z3a z3aVar = this.b;
        x53 x53Var = z3aVar.s;
        int i2 = z3aVar.w;
        if (view instanceof e39) {
            final e39 e39Var = (e39) view;
            lcb lcbVar = this.a;
            if (lcbVar.w != null && (storyView = ((s3a) z3aVar.x.c.get(i)).b) != null && (X1 = (s1 = uc7.s1(i2)).X1(Long.valueOf(storyView.user_id))) != null) {
                if (s1.x0.indexOfKey(X1.id) >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!X1.contact && lv2.r(i2).g0.get(Long.valueOf(X1.id)) == null) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                boolean b = z3aVar.b(storyView);
                boolean M = s1.O1().M(storyView);
                boolean D = lbc.D(X1);
                if (TextUtils.isEmpty(X1.first_name)) {
                    if (TextUtils.isEmpty(X1.last_name)) {
                        str = "";
                    } else {
                        str = X1.last_name;
                    }
                } else {
                    str = X1.first_name;
                }
                int indexOf = str.indexOf(" ");
                if (indexOf > 2) {
                    str = str.substring(0, indexOf);
                }
                if (!D) {
                    fu5 G = fu5.G(lcbVar.w, x53Var, view);
                    G.i = (byte) 3;
                    G.j = true;
                    G.X(new ColorDrawable(aob.v0(aob.h5, x53Var)));
                    G.s = (short) 133;
                    if (b && !M && !z && !D) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    final String str2 = str;
                    G.k(2131232393, ob6.a0(null, null, 2131744316, str), new Runnable(this) {
                        public final l3a b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void run() {
                            byte b2 = r7;
                            float f = 0.5f;
                            TL_stories.StoryView storyView2 = storyView;
                            e39 e39Var2 = e39Var;
                            String str3 = str2;
                            TLRPC.User user = X1;
                            uc7 uc7Var = s1;
                            l3a l3aVar = this.b;
                            switch (b2) {
                                case 0:
                                    uc7Var.O1().m0(user.id, true, true);
                                    z3a z3aVar2 = l3aVar.b;
                                    new d31(z3aVar2, z3aVar2.s).Q(2131624050, 36, ob6.a0(null, null, 2131744317, str3)).j();
                                    if (z3aVar2.b(storyView2)) {
                                        f = 1.0f;
                                    }
                                    e39Var2.a(true, f);
                                    return;
                                default:
                                    uc7Var.O1().m0(user.id, false, true);
                                    z3a z3aVar3 = l3aVar.b;
                                    new d31(z3aVar3, z3aVar3.s).Q(2131623990, 36, ob6.a0(null, null, 2131744115, str3)).j();
                                    if (z3aVar3.b(storyView2)) {
                                        f = 1.0f;
                                    }
                                    e39Var2.a(true, f);
                                    return;
                            }
                        }
                    }, z3);
                    G.F();
                    G.t();
                    if (M && !z && !D) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    G.k(2131232228, ob6.a0(null, null, 2131744116, str2), new Runnable(this) {
                        public final l3a b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void run() {
                            byte b2 = r7;
                            float f = 0.5f;
                            TL_stories.StoryView storyView2 = storyView;
                            e39 e39Var2 = e39Var;
                            String str3 = str2;
                            TLRPC.User user = X1;
                            uc7 uc7Var = s1;
                            l3a l3aVar = this.b;
                            switch (b2) {
                                case 0:
                                    uc7Var.O1().m0(user.id, true, true);
                                    z3a z3aVar2 = l3aVar.b;
                                    new d31(z3aVar2, z3aVar2.s).Q(2131624050, 36, ob6.a0(null, null, 2131744317, str3)).j();
                                    if (z3aVar2.b(storyView2)) {
                                        f = 1.0f;
                                    }
                                    e39Var2.a(true, f);
                                    return;
                                default:
                                    uc7Var.O1().m0(user.id, false, true);
                                    z3a z3aVar3 = l3aVar.b;
                                    new d31(z3aVar3, z3aVar3.s).Q(2131623990, 36, ob6.a0(null, null, 2131744115, str3)).j();
                                    if (z3aVar3.b(storyView2)) {
                                        f = 1.0f;
                                    }
                                    e39Var2.a(true, f);
                                    return;
                            }
                        }
                    }, z4);
                    G.F();
                    G.t();
                    if (!z2 && !z && !D) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    G.l(2131232420, new Runnable(this) {
                        public final l3a b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void run() {
                            byte b2 = r6;
                            float f = 0.5f;
                            TL_stories.StoryView storyView2 = storyView;
                            e39 e39Var2 = e39Var;
                            TLRPC.User user = X1;
                            uc7 uc7Var = s1;
                            l3a l3aVar = this.b;
                            switch (b2) {
                                case 0:
                                    uc7Var.u(user.id);
                                    z3a z3aVar2 = l3aVar.b;
                                    new d31(z3aVar2, z3aVar2.s).e(true).j();
                                    if (z3aVar2.b(storyView2)) {
                                        f = 1.0f;
                                    }
                                    e39Var2.a(true, f);
                                    return;
                                default:
                                    uc7Var.O1().m0(user.id, false, true);
                                    uc7Var.t5(null, user.id);
                                    z3a z3aVar3 = l3aVar.b;
                                    new d31(z3aVar3, z3aVar3.s).e(false).j();
                                    if (z3aVar3.b(storyView2)) {
                                        f = 1.0f;
                                    }
                                    e39Var2.a(true, f);
                                    return;
                            }
                        }
                    }, ob6.M0(2131753685, null), z5, true);
                    if (!z2 && z && !D) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    G.k(2131232072, ob6.M0(2131743566, null), new Runnable(this) {
                        public final l3a b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void run() {
                            byte b2 = r6;
                            float f = 0.5f;
                            TL_stories.StoryView storyView2 = storyView;
                            e39 e39Var2 = e39Var;
                            TLRPC.User user = X1;
                            uc7 uc7Var = s1;
                            l3a l3aVar = this.b;
                            switch (b2) {
                                case 0:
                                    uc7Var.u(user.id);
                                    z3a z3aVar2 = l3aVar.b;
                                    new d31(z3aVar2, z3aVar2.s).e(true).j();
                                    if (z3aVar2.b(storyView2)) {
                                        f = 1.0f;
                                    }
                                    e39Var2.a(true, f);
                                    return;
                                default:
                                    uc7Var.O1().m0(user.id, false, true);
                                    uc7Var.t5(null, user.id);
                                    z3a z3aVar3 = l3aVar.b;
                                    new d31(z3aVar3, z3aVar3.s).e(false).j();
                                    if (z3aVar3.b(storyView2)) {
                                        f = 1.0f;
                                    }
                                    e39Var2.a(true, f);
                                    return;
                            }
                        }
                    }, z6);
                    if (z2 && !D) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    G.l(2131232420, new cp7(this, X1, str2, e39Var, storyView, (byte) 20), ob6.M0(2131744341, null), z7, true);
                    TLRPC.Reaction reaction = storyView.reaction;
                    if ((reaction instanceof TLRPC.TL_reactionCustomEmoji) && (c = wl.g(i2).c(((TLRPC.TL_reactionCustomEmoji) reaction).document_id)) != null) {
                        G.j();
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(c);
                        q37 q37Var = new q37(z3aVar.w, 3, x53Var, z3aVar.getContext(), arrayList);
                        q37Var.setOnClickListener(new lw4(this, arrayList, G, (byte) 21));
                        G.p(q37Var);
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (G.y() <= 0 && !z8) {
                        return false;
                    }
                    G.a0();
                    try {
                        z3aVar.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
