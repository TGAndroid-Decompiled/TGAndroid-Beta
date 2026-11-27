package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class sv1 implements Runnable {
    public final byte a = 0;
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

    public sv1(qy1 qy1Var, Object obj, no6 no6Var, boolean z, int i, int i2, boolean z2, Long l, String str, Object obj2) {
        this.r = qy1Var;
        this.b = obj;
        this.s = no6Var;
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
        r47 threadMessage;
        r47 threadMessage2;
        oec oecVar;
        CharSequence charSequence;
        r47 threadMessage3;
        String str;
        r47 threadMessage4;
        String str2;
        byte b = this.a;
        Object obj = this.s;
        Object obj2 = this.r;
        switch (b) {
            case 0:
                n47 n47Var = (n47) this.w;
                int i = ChatActivityEnterView.X7;
                ((ChatActivityEnterView) obj2).b1((TLRPC.Document) obj, this.n, n47Var, this.c, this.d, this.e, this.b, this.h, this.f);
                return;
            default:
                no6 no6Var = (no6) obj;
                ChatActivityEnterView chatActivityEnterView = ((qy1) obj2).a;
                boolean z2 = chatActivityEnterView.o4;
                zu1 zu1Var = chatActivityEnterView.E3;
                boolean z3 = false;
                if (z2) {
                    if (chatActivityEnterView.G2 != 0) {
                        chatActivityEnterView.V0.z();
                    }
                    chatActivityEnterView.a2(false, true, false, true);
                }
                xy1 xy1Var = chatActivityEnterView.O3;
                c5a c5aVar = null;
                if (xy1Var != null) {
                    storyItem = xy1Var.F0();
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
                    if (no6Var != null) {
                        oecVar = no6Var.s;
                    } else {
                        oecVar = null;
                    }
                    if (oecVar != null && no6Var != null) {
                        oecVar.s = true;
                        boolean b2 = oecVar.b();
                        oecVar.s = false;
                        oecVar.t = true;
                        z3 = b2;
                    }
                    boolean z6 = this.f;
                    if (z3) {
                        ArrayList arrayList = new ArrayList();
                        ?? obj5 = new Object();
                        if (!no6Var.b && (str2 = no6Var.h) != null) {
                            obj5.c = str2;
                            if (no6Var.c()) {
                                obj5.y = no6Var.clone();
                            }
                        } else {
                            String str4 = no6Var.I;
                            if (str4 != null) {
                                obj5.c = str4;
                            }
                        }
                        obj5.e = no6Var.c;
                        obj5.f = no6Var.g;
                        obj5.g = no6Var.e;
                        obj5.p = no6Var.d();
                        obj5.o = no6Var.b;
                        obj5.q = no6Var.j();
                        obj5.z = no6Var.m;
                        obj5.A = no6Var.P;
                        CharSequence charSequence2 = no6Var.a;
                        if (charSequence2 != null) {
                            str = charSequence2.toString();
                        } else {
                            str = null;
                        }
                        obj5.d = str;
                        obj5.i = no6Var.n;
                        obj5.j = no6Var.r;
                        obj5.h = no6Var.x;
                        obj5.k = no6Var.s;
                        obj5.r = no6Var.L;
                        obj5.t = r7a.h(no6Var.a);
                        obj5.u = no6Var.M;
                        obj5.w = no6Var.N;
                        obj5.x = no6Var.c();
                        arrayList.add(obj5);
                        no6Var.e();
                        k5 a = k5.a(chatActivityEnterView.R);
                        long j = chatActivityEnterView.F3;
                        r47 r47Var = chatActivityEnterView.I3;
                        threadMessage4 = chatActivityEnterView.getThreadMessage();
                        ou1 ou1Var = chatActivityEnterView.K3;
                        r47 r47Var2 = chatActivityEnterView.O2;
                        if (zu1Var != null) {
                            c5aVar = zu1Var.X6();
                        }
                        r7a.W(a, arrayList, j, r47Var, threadMessage4, null, ou1Var, false, false, r47Var2, null, z5, i4, i3, false, null, c5aVar, chatActivityEnterView.o7, z6, l.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams(), null, false);
                        z = z5;
                        i4 = i4;
                    } else {
                        r7a B = r7a.B(chatActivityEnterView.R);
                        long j2 = chatActivityEnterView.F3;
                        if (no6Var != null) {
                            charSequence = no6Var.a;
                        } else {
                            charSequence = null;
                        }
                        TL_stories.StoryItem storyItem2 = storyItem;
                        r47 r47Var3 = chatActivityEnterView.I3;
                        threadMessage3 = chatActivityEnterView.getThreadMessage();
                        ou1 ou1Var2 = chatActivityEnterView.K3;
                        if (zu1Var != null) {
                            c5aVar = zu1Var.X6();
                        }
                        B.u0(document, str3, j2, charSequence, oecVar, r47Var3, threadMessage3, storyItem2, ou1Var2, null, z5, i4, i3, false, obj4, c5aVar, l.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams(), z6);
                        z = z5;
                        i4 = i4;
                        ls6.d0(chatActivityEnterView.R).c(document, (int) (System.currentTimeMillis() / 1000), true);
                        if (wf3.B(chatActivityEnterView.F3)) {
                            uc7.s1(chatActivityEnterView.S.a).E4(obj4, document);
                        }
                    }
                } else {
                    z = z5;
                    TL_stories.StoryItem storyItem3 = storyItem;
                    if (obj3 instanceof TLRPC.BotInlineResult) {
                        TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj3;
                        if (botInlineResult.document != null) {
                            ls6.d0(chatActivityEnterView.R).c(botInlineResult.document, (int) (System.currentTimeMillis() / 1000), false);
                            if (wf3.B(chatActivityEnterView.F3)) {
                                uc7.s1(chatActivityEnterView.S.a).E4(obj4, botInlineResult.document);
                            }
                        }
                        TLRPC.User user = (TLRPC.User) obj4;
                        HashMap hashMap = new HashMap();
                        hashMap.put("id", botInlineResult.id);
                        hashMap.put("query_id", String.valueOf(botInlineResult.query_id));
                        hashMap.put("force_gif", "1");
                        if (storyItem3 == null) {
                            zu1 zu1Var2 = chatActivityEnterView.E3;
                            k5 k5Var = chatActivityEnterView.S;
                            long j3 = chatActivityEnterView.F3;
                            r47 r47Var4 = chatActivityEnterView.I3;
                            threadMessage2 = chatActivityEnterView.getThreadMessage();
                            ou1 ou1Var3 = chatActivityEnterView.K3;
                            if (zu1Var != null) {
                                c5aVar = zu1Var.X6();
                            }
                            r7a.R(i4, j3, l.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), k5Var, ou1Var3, r47Var4, threadMessage2, c5aVar, hashMap, botInlineResult, null, zu1Var2, z);
                            i4 = i4;
                            z = z;
                        } else {
                            r7a B2 = r7a.B(chatActivityEnterView.R);
                            TLRPC.Document document2 = botInlineResult.document;
                            long j4 = chatActivityEnterView.F3;
                            r47 r47Var5 = chatActivityEnterView.I3;
                            threadMessage = chatActivityEnterView.getThreadMessage();
                            ou1 ou1Var4 = chatActivityEnterView.K3;
                            if (zu1Var != null) {
                                c5aVar = zu1Var.X6();
                            }
                            B2.t0(document2, str3, j4, r47Var5, threadMessage, storyItem3, ou1Var4, null, z, i4, i3, false, obj4, c5aVar, l.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
                        }
                        if (chatActivityEnterView.G2 != 0) {
                            chatActivityEnterView.Z1(0, true);
                            chatActivityEnterView.V0.r(true);
                            chatActivityEnterView.V0.z();
                        }
                    }
                }
                xy1 xy1Var2 = chatActivityEnterView.O3;
                if (xy1Var2 != null) {
                    xy1Var2.x(null, z, i4, 0, 0L);
                    return;
                }
                return;
        }
    }

    public sv1(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, n47 n47Var, boolean z, int i, int i2, Object obj, Long l, boolean z2) {
        this.r = chatActivityEnterView;
        this.s = document;
        this.n = str;
        this.w = n47Var;
        this.c = z;
        this.d = i;
        this.e = i2;
        this.b = obj;
        this.h = l;
        this.f = z2;
    }
}
