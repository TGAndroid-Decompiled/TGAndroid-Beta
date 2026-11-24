package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class rz9 implements e39 {
    public final m8b a;
    public final g0a b;

    public rz9(g0a g0aVar, m8b m8bVar) {
        this.b = g0aVar;
        this.a = m8bVar;
    }

    @Override
    public final boolean d(int i, View view) {
        final TL_stories.StoryView storyView;
        final na7 q1;
        final TLRPC.User V1;
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
        g0a g0aVar = this.b;
        f53 f53Var = g0aVar.s;
        int i2 = g0aVar.w;
        if (view instanceof qz8) {
            final qz8 qz8Var = (qz8) view;
            m8b m8bVar = this.a;
            if (m8bVar.w != null && (storyView = ((yz9) g0aVar.x.c.get(i)).b) != null && (V1 = (q1 = na7.q1(i2)).V1(Long.valueOf(storyView.user_id))) != null) {
                if (q1.x0.indexOfKey(V1.id) >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!V1.contact && qu2.r(i2).g0.get(Long.valueOf(V1.id)) == null) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                boolean b = g0aVar.b(storyView);
                boolean M = q1.M1().M(storyView);
                boolean C = l7c.C(V1);
                if (TextUtils.isEmpty(V1.first_name)) {
                    if (TextUtils.isEmpty(V1.last_name)) {
                        str = "";
                    } else {
                        str = V1.last_name;
                    }
                } else {
                    str = V1.first_name;
                }
                int indexOf = str.indexOf(" ");
                if (indexOf > 2) {
                    str = str.substring(0, indexOf);
                }
                if (!C) {
                    cs5 G = cs5.G(m8bVar.w, f53Var, view);
                    G.i = (byte) 3;
                    G.j = true;
                    G.X(new ColorDrawable(bkb.v0(bkb.g5, f53Var)));
                    G.s = (short) 133;
                    if (b && !M && !z && !C) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    final String str2 = str;
                    G.k(2131232393, k96.a0(null, null, 2131744422, str), new Runnable(this) {
                        public final rz9 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void run() {
                            byte b2 = r7;
                            float f = 0.5f;
                            TL_stories.StoryView storyView2 = storyView;
                            qz8 qz8Var2 = qz8Var;
                            String str3 = str2;
                            TLRPC.User user = V1;
                            na7 na7Var = q1;
                            rz9 rz9Var = this.b;
                            switch (b2) {
                                case 0:
                                    na7Var.M1().m0(user.id, true, true);
                                    g0a g0aVar2 = rz9Var.b;
                                    new u21(g0aVar2, g0aVar2.s).Q(2131624050, 36, k96.a0(null, null, 2131744423, str3)).j();
                                    if (g0aVar2.b(storyView2)) {
                                        f = 1.0f;
                                    }
                                    qz8Var2.a(true, f);
                                    return;
                                default:
                                    na7Var.M1().m0(user.id, false, true);
                                    g0a g0aVar3 = rz9Var.b;
                                    new u21(g0aVar3, g0aVar3.s).Q(2131623990, 36, k96.a0(null, null, 2131744221, str3)).j();
                                    if (g0aVar3.b(storyView2)) {
                                        f = 1.0f;
                                    }
                                    qz8Var2.a(true, f);
                                    return;
                            }
                        }
                    }, z3);
                    G.F();
                    G.t();
                    if (M && !z && !C) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    G.k(2131232228, k96.a0(null, null, 2131744222, str2), new Runnable(this) {
                        public final rz9 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void run() {
                            byte b2 = r7;
                            float f = 0.5f;
                            TL_stories.StoryView storyView2 = storyView;
                            qz8 qz8Var2 = qz8Var;
                            String str3 = str2;
                            TLRPC.User user = V1;
                            na7 na7Var = q1;
                            rz9 rz9Var = this.b;
                            switch (b2) {
                                case 0:
                                    na7Var.M1().m0(user.id, true, true);
                                    g0a g0aVar2 = rz9Var.b;
                                    new u21(g0aVar2, g0aVar2.s).Q(2131624050, 36, k96.a0(null, null, 2131744423, str3)).j();
                                    if (g0aVar2.b(storyView2)) {
                                        f = 1.0f;
                                    }
                                    qz8Var2.a(true, f);
                                    return;
                                default:
                                    na7Var.M1().m0(user.id, false, true);
                                    g0a g0aVar3 = rz9Var.b;
                                    new u21(g0aVar3, g0aVar3.s).Q(2131623990, 36, k96.a0(null, null, 2131744221, str3)).j();
                                    if (g0aVar3.b(storyView2)) {
                                        f = 1.0f;
                                    }
                                    qz8Var2.a(true, f);
                                    return;
                            }
                        }
                    }, z4);
                    G.F();
                    G.t();
                    if (!z2 && !z && !C) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    G.l(2131232420, new Runnable(this) {
                        public final rz9 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void run() {
                            byte b2 = r6;
                            float f = 0.5f;
                            TL_stories.StoryView storyView2 = storyView;
                            qz8 qz8Var2 = qz8Var;
                            TLRPC.User user = V1;
                            na7 na7Var = q1;
                            rz9 rz9Var = this.b;
                            switch (b2) {
                                case 0:
                                    na7Var.t(user.id);
                                    g0a g0aVar2 = rz9Var.b;
                                    new u21(g0aVar2, g0aVar2.s).e(true).j();
                                    if (g0aVar2.b(storyView2)) {
                                        f = 1.0f;
                                    }
                                    qz8Var2.a(true, f);
                                    return;
                                default:
                                    na7Var.M1().m0(user.id, false, true);
                                    na7Var.k5(null, user.id);
                                    g0a g0aVar3 = rz9Var.b;
                                    new u21(g0aVar3, g0aVar3.s).e(false).j();
                                    if (g0aVar3.b(storyView2)) {
                                        f = 1.0f;
                                    }
                                    qz8Var2.a(true, f);
                                    return;
                            }
                        }
                    }, k96.M0(2131753689, null), z5, true);
                    if (!z2 && z && !C) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    G.k(2131232072, k96.M0(2131743672, null), new Runnable(this) {
                        public final rz9 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void run() {
                            byte b2 = r6;
                            float f = 0.5f;
                            TL_stories.StoryView storyView2 = storyView;
                            qz8 qz8Var2 = qz8Var;
                            TLRPC.User user = V1;
                            na7 na7Var = q1;
                            rz9 rz9Var = this.b;
                            switch (b2) {
                                case 0:
                                    na7Var.t(user.id);
                                    g0a g0aVar2 = rz9Var.b;
                                    new u21(g0aVar2, g0aVar2.s).e(true).j();
                                    if (g0aVar2.b(storyView2)) {
                                        f = 1.0f;
                                    }
                                    qz8Var2.a(true, f);
                                    return;
                                default:
                                    na7Var.M1().m0(user.id, false, true);
                                    na7Var.k5(null, user.id);
                                    g0a g0aVar3 = rz9Var.b;
                                    new u21(g0aVar3, g0aVar3.s).e(false).j();
                                    if (g0aVar3.b(storyView2)) {
                                        f = 1.0f;
                                    }
                                    qz8Var2.a(true, f);
                                    return;
                            }
                        }
                    }, z6);
                    if (z2 && !C) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    G.l(2131232420, new ex7(this, V1, str2, qz8Var, storyView, (byte) 19), k96.M0(2131744447, null), z7, true);
                    TLRPC.Reaction reaction = storyView.reaction;
                    if ((reaction instanceof TLRPC.TL_reactionCustomEmoji) && (c = vl.g(i2).c(((TLRPC.TL_reactionCustomEmoji) reaction).document_id)) != null) {
                        G.j();
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(c);
                        j17 j17Var = new j17(g0aVar.w, 3, f53Var, g0aVar.getContext(), arrayList);
                        j17Var.setOnClickListener(new hu4(this, arrayList, G, (byte) 21));
                        G.p(j17Var);
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (G.y() <= 0 && !z8) {
                        return false;
                    }
                    G.a0();
                    try {
                        g0aVar.performHapticFeedback(0, 1);
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
