package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class hv1 implements Runnable {
    public final byte a = 1;
    public final Object b;
    public final boolean c;
    public final int d;
    public final int e;
    public final boolean f;
    public final Long h;
    public final String n;
    public final Object r;
    public final Object s;
    public final Object w;

    public hv1(ay1 ay1Var, Object obj, jm6 jm6Var, boolean z, int i, int i2, boolean z2, Long l, String str, Object obj2) {
        this.r = ay1Var;
        this.b = obj;
        this.s = jm6Var;
        this.c = z;
        this.d = i;
        this.e = i2;
        this.f = z2;
        this.h = l;
        this.n = str;
        this.w = obj2;
    }

    @Override
    public final void run() {
        TL_stories.StoryItem storyItem;
        boolean z;
        k27 threadMessage;
        k27 threadMessage2;
        oac oacVar;
        CharSequence charSequence;
        k27 threadMessage3;
        String str;
        k27 threadMessage4;
        String str2;
        byte b = this.a;
        Object obj = this.s;
        Object obj2 = this.r;
        switch (b) {
            case 0:
                g27 g27Var = (g27) this.w;
                int i = ChatActivityEnterView.r7;
                ((ChatActivityEnterView) obj2).X0((TLRPC.Document) obj, this.n, g27Var, this.c, this.d, this.e, this.b, this.h, this.f);
                return;
            default:
                jm6 jm6Var = (jm6) obj;
                ChatActivityEnterView chatActivityEnterView = ((ay1) obj2).a;
                boolean z2 = chatActivityEnterView.p4;
                mu1 mu1Var = chatActivityEnterView.F3;
                boolean z3 = false;
                if (z2) {
                    if (chatActivityEnterView.H2 != 0) {
                        chatActivityEnterView.V0.z();
                    }
                    chatActivityEnterView.P1(false, true, false, true);
                }
                hy1 hy1Var = chatActivityEnterView.P3;
                j1a j1aVar = null;
                if (hy1Var != null) {
                    storyItem = hy1Var.t0();
                } else {
                    storyItem = null;
                }
                Object obj3 = this.b;
                boolean z4 = obj3 instanceof TLRPC.Document;
                boolean z5 = this.c;
                int i2 = this.d;
                int i3 = this.e;
                Long l = this.h;
                int i4 = i2;
                String str3 = this.n;
                Object obj4 = this.w;
                if (z4) {
                    TLRPC.Document document = (TLRPC.Document) obj3;
                    if (jm6Var != null) {
                        oacVar = jm6Var.s;
                    } else {
                        oacVar = null;
                    }
                    if (oacVar != null && jm6Var != null) {
                        oacVar.s = true;
                        boolean b2 = oacVar.b();
                        oacVar.s = false;
                        oacVar.t = true;
                        z3 = b2;
                    }
                    boolean z6 = this.f;
                    if (z3) {
                        ArrayList arrayList = new ArrayList();
                        ?? obj5 = new Object();
                        if (!jm6Var.b && (str2 = jm6Var.h) != null) {
                            obj5.c = str2;
                            if (jm6Var.c()) {
                                obj5.y = jm6Var.clone();
                            }
                        } else {
                            String str4 = jm6Var.I;
                            if (str4 != null) {
                                obj5.c = str4;
                            }
                        }
                        obj5.e = jm6Var.c;
                        obj5.f = jm6Var.g;
                        obj5.g = jm6Var.e;
                        obj5.p = jm6Var.d();
                        obj5.o = jm6Var.b;
                        obj5.q = jm6Var.j();
                        obj5.z = jm6Var.m;
                        obj5.A = jm6Var.P;
                        CharSequence charSequence2 = jm6Var.a;
                        if (charSequence2 != null) {
                            str = charSequence2.toString();
                        } else {
                            str = null;
                        }
                        obj5.d = str;
                        obj5.i = jm6Var.n;
                        obj5.j = jm6Var.r;
                        obj5.h = jm6Var.x;
                        obj5.k = jm6Var.s;
                        obj5.r = jm6Var.L;
                        obj5.t = z3a.h(jm6Var.a);
                        obj5.u = jm6Var.M;
                        obj5.w = jm6Var.N;
                        obj5.x = jm6Var.c();
                        arrayList.add(obj5);
                        jm6Var.e();
                        j5 a = j5.a(chatActivityEnterView.R);
                        long j = chatActivityEnterView.G3;
                        k27 k27Var = chatActivityEnterView.J3;
                        threadMessage4 = chatActivityEnterView.getThreadMessage();
                        bu1 bu1Var = chatActivityEnterView.L3;
                        k27 k27Var2 = chatActivityEnterView.P2;
                        if (mu1Var != null) {
                            j1aVar = mu1Var.O6();
                        }
                        z3a.W(a, arrayList, j, k27Var, threadMessage4, null, bu1Var, false, false, k27Var2, null, z5, i4, i3, false, null, j1aVar, chatActivityEnterView.O6, z6, l.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams(), null, false);
                        z = z5;
                        i4 = i4;
                    } else {
                        z3a B = z3a.B(chatActivityEnterView.R);
                        long j2 = chatActivityEnterView.G3;
                        if (jm6Var != null) {
                            charSequence = jm6Var.a;
                        } else {
                            charSequence = null;
                        }
                        TL_stories.StoryItem storyItem2 = storyItem;
                        k27 k27Var3 = chatActivityEnterView.J3;
                        threadMessage3 = chatActivityEnterView.getThreadMessage();
                        bu1 bu1Var2 = chatActivityEnterView.L3;
                        if (mu1Var != null) {
                            j1aVar = mu1Var.O6();
                        }
                        B.u0(document, str3, j2, charSequence, oacVar, k27Var3, threadMessage3, storyItem2, bu1Var2, null, z5, i4, i3, false, obj4, j1aVar, l.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams(), z6);
                        z = z5;
                        i4 = i4;
                        hq6.d0(chatActivityEnterView.R).c(document, (int) (System.currentTimeMillis() / 1000), true);
                        if (cf3.B(chatActivityEnterView.G3)) {
                            na7.q1(chatActivityEnterView.S.a).v4(obj4, document);
                        }
                    }
                } else {
                    z = z5;
                    TL_stories.StoryItem storyItem3 = storyItem;
                    if (obj3 instanceof TLRPC.BotInlineResult) {
                        TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj3;
                        if (botInlineResult.document != null) {
                            hq6.d0(chatActivityEnterView.R).c(botInlineResult.document, (int) (System.currentTimeMillis() / 1000), false);
                            if (cf3.B(chatActivityEnterView.G3)) {
                                na7.q1(chatActivityEnterView.S.a).v4(obj4, botInlineResult.document);
                            }
                        }
                        TLRPC.User user = (TLRPC.User) obj4;
                        HashMap hashMap = new HashMap();
                        hashMap.put("id", botInlineResult.id);
                        hashMap.put("query_id", String.valueOf(botInlineResult.query_id));
                        hashMap.put("force_gif", "1");
                        if (storyItem3 == null) {
                            mu1 mu1Var2 = chatActivityEnterView.F3;
                            j5 j5Var = chatActivityEnterView.S;
                            long j3 = chatActivityEnterView.G3;
                            k27 k27Var4 = chatActivityEnterView.J3;
                            threadMessage2 = chatActivityEnterView.getThreadMessage();
                            bu1 bu1Var3 = chatActivityEnterView.L3;
                            if (mu1Var != null) {
                                j1aVar = mu1Var.O6();
                            }
                            z3a.R(i4, j3, l.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), j5Var, bu1Var3, k27Var4, threadMessage2, j1aVar, hashMap, botInlineResult, null, mu1Var2, z);
                            i4 = i4;
                            z = z;
                        } else {
                            z3a B2 = z3a.B(chatActivityEnterView.R);
                            TLRPC.Document document2 = botInlineResult.document;
                            long j4 = chatActivityEnterView.G3;
                            k27 k27Var5 = chatActivityEnterView.J3;
                            threadMessage = chatActivityEnterView.getThreadMessage();
                            bu1 bu1Var4 = chatActivityEnterView.L3;
                            if (mu1Var != null) {
                                j1aVar = mu1Var.O6();
                            }
                            B2.t0(document2, str3, j4, k27Var5, threadMessage, storyItem3, bu1Var4, null, z, i4, i3, false, obj4, j1aVar, l.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
                        }
                        if (chatActivityEnterView.H2 != 0) {
                            chatActivityEnterView.O1(0, true);
                            chatActivityEnterView.V0.s(true);
                            chatActivityEnterView.V0.z();
                        }
                    }
                }
                hy1 hy1Var2 = chatActivityEnterView.P3;
                if (hy1Var2 != null) {
                    hy1Var2.u(null, z, i4, 0, 0L);
                    return;
                }
                return;
        }
    }

    public hv1(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, g27 g27Var, boolean z, int i, int i2, Object obj, Long l, boolean z2) {
        this.r = chatActivityEnterView;
        this.s = document;
        this.n = str;
        this.w = g27Var;
        this.c = z;
        this.d = i;
        this.e = i2;
        this.b = obj;
        this.h = l;
        this.f = z2;
    }
}
