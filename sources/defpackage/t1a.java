package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class t1a implements h59 {
    public final oab a;
    public final i2a b;

    public t1a(i2a i2aVar, oab oabVar) {
        this.b = i2aVar;
        this.a = oabVar;
    }

    @Override
    public final boolean g(int i, View view) {
        final TL_stories.StoryView storyView;
        final oc7 r1;
        final TLRPC.User W1;
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
        i2a i2aVar = this.b;
        r63 r63Var = i2aVar.s;
        int i2 = i2aVar.w;
        if (view instanceof r19) {
            final r19 r19Var = (r19) view;
            oab oabVar = this.a;
            if (oabVar.w != null && (storyView = ((a2a) i2aVar.x.c.get(i)).b) != null && (W1 = (r1 = oc7.r1(i2)).W1(Long.valueOf(storyView.user_id))) != null) {
                if (r1.x0.indexOfKey(W1.id) >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!W1.contact && bw2.r(i2).g0.get(Long.valueOf(W1.id)) == null) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                boolean b = i2aVar.b(storyView);
                boolean M = r1.N1().M(storyView);
                boolean D = m9c.D(W1);
                if (TextUtils.isEmpty(W1.first_name)) {
                    if (TextUtils.isEmpty(W1.last_name)) {
                        str = "";
                    } else {
                        str = W1.last_name;
                    }
                } else {
                    str = W1.first_name;
                }
                int indexOf = str.indexOf(" ");
                if (indexOf > 2) {
                    str = str.substring(0, indexOf);
                }
                if (!D) {
                    bu5 G = bu5.G(oabVar.w, r63Var, view);
                    G.i = (byte) 3;
                    G.j = true;
                    G.X(new ColorDrawable(cmb.v0(cmb.g5, r63Var)));
                    G.s = (short) 133;
                    if (b && !M && !z && !D) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    final String str2 = str;
                    G.k(2131232394, jb6.a0(null, null, 2131744348, str), new Runnable(this) {
                        public final t1a b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void run() {
                            byte b2 = r7;
                            float f = 0.5f;
                            TL_stories.StoryView storyView2 = storyView;
                            r19 r19Var2 = r19Var;
                            String str3 = str2;
                            TLRPC.User user = W1;
                            oc7 oc7Var = r1;
                            t1a t1aVar = this.b;
                            switch (b2) {
                                case 0:
                                    oc7Var.N1().m0(user.id, true, true);
                                    i2a i2aVar2 = t1aVar.b;
                                    new c41(i2aVar2, i2aVar2.s).Q(2131624050, 36, jb6.a0(null, null, 2131744349, str3)).j();
                                    if (i2aVar2.b(storyView2)) {
                                        f = 1.0f;
                                    }
                                    r19Var2.a(true, f);
                                    return;
                                default:
                                    oc7Var.N1().m0(user.id, false, true);
                                    i2a i2aVar3 = t1aVar.b;
                                    new c41(i2aVar3, i2aVar3.s).Q(2131623990, 36, jb6.a0(null, null, 2131744147, str3)).j();
                                    if (i2aVar3.b(storyView2)) {
                                        f = 1.0f;
                                    }
                                    r19Var2.a(true, f);
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
                    G.k(2131232229, jb6.a0(null, null, 2131744148, str2), new Runnable(this) {
                        public final t1a b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void run() {
                            byte b2 = r7;
                            float f = 0.5f;
                            TL_stories.StoryView storyView2 = storyView;
                            r19 r19Var2 = r19Var;
                            String str3 = str2;
                            TLRPC.User user = W1;
                            oc7 oc7Var = r1;
                            t1a t1aVar = this.b;
                            switch (b2) {
                                case 0:
                                    oc7Var.N1().m0(user.id, true, true);
                                    i2a i2aVar2 = t1aVar.b;
                                    new c41(i2aVar2, i2aVar2.s).Q(2131624050, 36, jb6.a0(null, null, 2131744349, str3)).j();
                                    if (i2aVar2.b(storyView2)) {
                                        f = 1.0f;
                                    }
                                    r19Var2.a(true, f);
                                    return;
                                default:
                                    oc7Var.N1().m0(user.id, false, true);
                                    i2a i2aVar3 = t1aVar.b;
                                    new c41(i2aVar3, i2aVar3.s).Q(2131623990, 36, jb6.a0(null, null, 2131744147, str3)).j();
                                    if (i2aVar3.b(storyView2)) {
                                        f = 1.0f;
                                    }
                                    r19Var2.a(true, f);
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
                    G.l(2131232421, new Runnable(this) {
                        public final t1a b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void run() {
                            byte b2 = r6;
                            float f = 0.5f;
                            TL_stories.StoryView storyView2 = storyView;
                            r19 r19Var2 = r19Var;
                            TLRPC.User user = W1;
                            oc7 oc7Var = r1;
                            t1a t1aVar = this.b;
                            switch (b2) {
                                case 0:
                                    oc7Var.t(user.id);
                                    i2a i2aVar2 = t1aVar.b;
                                    new c41(i2aVar2, i2aVar2.s).e(true).j();
                                    if (i2aVar2.b(storyView2)) {
                                        f = 1.0f;
                                    }
                                    r19Var2.a(true, f);
                                    return;
                                default:
                                    oc7Var.N1().m0(user.id, false, true);
                                    oc7Var.n5(null, user.id);
                                    i2a i2aVar3 = t1aVar.b;
                                    new c41(i2aVar3, i2aVar3.s).e(false).j();
                                    if (i2aVar3.b(storyView2)) {
                                        f = 1.0f;
                                    }
                                    r19Var2.a(true, f);
                                    return;
                            }
                        }
                    }, jb6.M0(2131753657, null), z5, true);
                    if (!z2 && z && !D) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    G.k(2131232073, jb6.M0(2131743598, null), new Runnable(this) {
                        public final t1a b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void run() {
                            byte b2 = r6;
                            float f = 0.5f;
                            TL_stories.StoryView storyView2 = storyView;
                            r19 r19Var2 = r19Var;
                            TLRPC.User user = W1;
                            oc7 oc7Var = r1;
                            t1a t1aVar = this.b;
                            switch (b2) {
                                case 0:
                                    oc7Var.t(user.id);
                                    i2a i2aVar2 = t1aVar.b;
                                    new c41(i2aVar2, i2aVar2.s).e(true).j();
                                    if (i2aVar2.b(storyView2)) {
                                        f = 1.0f;
                                    }
                                    r19Var2.a(true, f);
                                    return;
                                default:
                                    oc7Var.N1().m0(user.id, false, true);
                                    oc7Var.n5(null, user.id);
                                    i2a i2aVar3 = t1aVar.b;
                                    new c41(i2aVar3, i2aVar3.s).e(false).j();
                                    if (i2aVar3.b(storyView2)) {
                                        f = 1.0f;
                                    }
                                    r19Var2.a(true, f);
                                    return;
                            }
                        }
                    }, z6);
                    if (z2 && !D) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    G.l(2131232421, new hz7(this, W1, str2, r19Var, storyView, (byte) 19), jb6.M0(2131744373, null), z7, true);
                    TLRPC.Reaction reaction = storyView.reaction;
                    if ((reaction instanceof TLRPC.TL_reactionCustomEmoji) && (c = vm.g(i2).c(((TLRPC.TL_reactionCustomEmoji) reaction).document_id)) != null) {
                        G.j();
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(c);
                        j37 j37Var = new j37(i2aVar.w, 3, r63Var, i2aVar.getContext(), arrayList);
                        j37Var.setOnClickListener(new jw4(this, arrayList, G, (byte) 20));
                        G.p(j37Var);
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (G.y() <= 0 && !z8) {
                        return false;
                    }
                    G.a0();
                    try {
                        i2aVar.performHapticFeedback(0, 1);
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
