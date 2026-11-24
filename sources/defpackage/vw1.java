package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class vw1 implements Runnable {
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

    public vw1(nz1 nz1Var, Object obj, jo6 jo6Var, boolean z, int i, int i2, boolean z2, Long l, String str, Object obj2) {
        this.r = nz1Var;
        this.b = obj;
        this.s = jo6Var;
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
        k47 threadMessage;
        k47 threadMessage2;
        rcc rccVar;
        CharSequence charSequence;
        k47 threadMessage3;
        String str;
        k47 threadMessage4;
        String str2;
        byte b = this.a;
        Object obj = this.s;
        Object obj2 = this.r;
        switch (b) {
            case 0:
                g47 g47Var = (g47) this.w;
                int i = ChatActivityEnterView.z7;
                ((ChatActivityEnterView) obj2).Z0((TLRPC.Document) obj, this.n, g47Var, this.c, this.d, this.e, this.b, this.h, this.f);
                return;
            default:
                jo6 jo6Var = (jo6) obj;
                ChatActivityEnterView chatActivityEnterView = ((nz1) obj2).a;
                boolean z2 = chatActivityEnterView.p4;
                yv1 yv1Var = chatActivityEnterView.F3;
                boolean z3 = false;
                if (z2) {
                    if (chatActivityEnterView.H2 != 0) {
                        chatActivityEnterView.V0.y();
                    }
                    chatActivityEnterView.S1(false, true, false, true);
                }
                uz1 uz1Var = chatActivityEnterView.P3;
                l3a l3aVar = null;
                if (uz1Var != null) {
                    storyItem = uz1Var.C0();
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
                    if (jo6Var != null) {
                        rccVar = jo6Var.s;
                    } else {
                        rccVar = null;
                    }
                    if (rccVar != null && jo6Var != null) {
                        rccVar.s = true;
                        boolean b2 = rccVar.b();
                        rccVar.s = false;
                        rccVar.t = true;
                        z3 = b2;
                    }
                    boolean z6 = this.f;
                    if (z3) {
                        ArrayList arrayList = new ArrayList();
                        ?? obj5 = new Object();
                        if (!jo6Var.b && (str2 = jo6Var.h) != null) {
                            obj5.c = str2;
                            if (jo6Var.c()) {
                                obj5.y = jo6Var.clone();
                            }
                        } else {
                            String str4 = jo6Var.I;
                            if (str4 != null) {
                                obj5.c = str4;
                            }
                        }
                        obj5.e = jo6Var.c;
                        obj5.f = jo6Var.g;
                        obj5.g = jo6Var.e;
                        obj5.p = jo6Var.d();
                        obj5.o = jo6Var.b;
                        obj5.q = jo6Var.j();
                        obj5.z = jo6Var.m;
                        obj5.A = jo6Var.P;
                        CharSequence charSequence2 = jo6Var.a;
                        if (charSequence2 != null) {
                            str = charSequence2.toString();
                        } else {
                            str = null;
                        }
                        obj5.d = str;
                        obj5.i = jo6Var.n;
                        obj5.j = jo6Var.r;
                        obj5.h = jo6Var.x;
                        obj5.k = jo6Var.s;
                        obj5.r = jo6Var.L;
                        obj5.t = a6a.h(jo6Var.a);
                        obj5.u = jo6Var.M;
                        obj5.w = jo6Var.N;
                        obj5.x = jo6Var.c();
                        arrayList.add(obj5);
                        jo6Var.e();
                        j5 a = j5.a(chatActivityEnterView.R);
                        long j = chatActivityEnterView.G3;
                        k47 k47Var = chatActivityEnterView.J3;
                        threadMessage4 = chatActivityEnterView.getThreadMessage();
                        nv1 nv1Var = chatActivityEnterView.L3;
                        k47 k47Var2 = chatActivityEnterView.P2;
                        if (yv1Var != null) {
                            l3aVar = yv1Var.X6();
                        }
                        a6a.W(a, arrayList, j, k47Var, threadMessage4, null, nv1Var, false, false, k47Var2, null, z5, i4, i3, false, null, l3aVar, chatActivityEnterView.W6, z6, l.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams(), null, false);
                        z = z5;
                        i4 = i4;
                    } else {
                        a6a B = a6a.B(chatActivityEnterView.R);
                        long j2 = chatActivityEnterView.G3;
                        if (jo6Var != null) {
                            charSequence = jo6Var.a;
                        } else {
                            charSequence = null;
                        }
                        TL_stories.StoryItem storyItem2 = storyItem;
                        k47 k47Var3 = chatActivityEnterView.J3;
                        threadMessage3 = chatActivityEnterView.getThreadMessage();
                        nv1 nv1Var2 = chatActivityEnterView.L3;
                        if (yv1Var != null) {
                            l3aVar = yv1Var.X6();
                        }
                        B.u0(document, str3, j2, charSequence, rccVar, k47Var3, threadMessage3, storyItem2, nv1Var2, null, z5, i4, i3, false, obj4, l3aVar, l.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams(), z6);
                        z = z5;
                        i4 = i4;
                        hs6.d0(chatActivityEnterView.R).c(document, (int) (System.currentTimeMillis() / 1000), true);
                        if (pg3.B(chatActivityEnterView.G3)) {
                            oc7.r1(chatActivityEnterView.S.a).y4(obj4, document);
                        }
                    }
                } else {
                    z = z5;
                    TL_stories.StoryItem storyItem3 = storyItem;
                    if (obj3 instanceof TLRPC.BotInlineResult) {
                        TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj3;
                        if (botInlineResult.document != null) {
                            hs6.d0(chatActivityEnterView.R).c(botInlineResult.document, (int) (System.currentTimeMillis() / 1000), false);
                            if (pg3.B(chatActivityEnterView.G3)) {
                                oc7.r1(chatActivityEnterView.S.a).y4(obj4, botInlineResult.document);
                            }
                        }
                        TLRPC.User user = (TLRPC.User) obj4;
                        HashMap hashMap = new HashMap();
                        hashMap.put("id", botInlineResult.id);
                        hashMap.put("query_id", String.valueOf(botInlineResult.query_id));
                        hashMap.put("force_gif", "1");
                        if (storyItem3 == null) {
                            yv1 yv1Var2 = chatActivityEnterView.F3;
                            j5 j5Var = chatActivityEnterView.S;
                            long j3 = chatActivityEnterView.G3;
                            k47 k47Var4 = chatActivityEnterView.J3;
                            threadMessage2 = chatActivityEnterView.getThreadMessage();
                            nv1 nv1Var3 = chatActivityEnterView.L3;
                            if (yv1Var != null) {
                                l3aVar = yv1Var.X6();
                            }
                            a6a.R(i4, j3, l.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), j5Var, nv1Var3, k47Var4, threadMessage2, l3aVar, hashMap, botInlineResult, null, yv1Var2, z);
                            i4 = i4;
                            z = z;
                        } else {
                            a6a B2 = a6a.B(chatActivityEnterView.R);
                            TLRPC.Document document2 = botInlineResult.document;
                            long j4 = chatActivityEnterView.G3;
                            k47 k47Var5 = chatActivityEnterView.J3;
                            threadMessage = chatActivityEnterView.getThreadMessage();
                            nv1 nv1Var4 = chatActivityEnterView.L3;
                            if (yv1Var != null) {
                                l3aVar = yv1Var.X6();
                            }
                            B2.t0(document2, str3, j4, k47Var5, threadMessage, storyItem3, nv1Var4, null, z, i4, i3, false, obj4, l3aVar, l.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
                        }
                        if (chatActivityEnterView.H2 != 0) {
                            chatActivityEnterView.R1(0, true);
                            chatActivityEnterView.V0.r(true);
                            chatActivityEnterView.V0.y();
                        }
                    }
                }
                uz1 uz1Var2 = chatActivityEnterView.P3;
                if (uz1Var2 != null) {
                    uz1Var2.w(null, z, i4, 0, 0L);
                    return;
                }
                return;
        }
    }

    public vw1(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, g47 g47Var, boolean z, int i, int i2, Object obj, Long l, boolean z2) {
        this.r = chatActivityEnterView;
        this.s = document;
        this.n = str;
        this.w = g47Var;
        this.c = z;
        this.d = i;
        this.e = i2;
        this.b = obj;
        this.h = l;
        this.f = z2;
    }
}
