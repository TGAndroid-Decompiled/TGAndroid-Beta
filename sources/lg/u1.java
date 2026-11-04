package lg;

import android.text.TextUtils;
import ci.l2;
import ei.u5;
import java.util.ArrayList;
import org.telegram.messenger.h10;
import org.telegram.messenger.hs;
import org.telegram.messenger.qr;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
public final class u1 {
    public static volatile u1[] f18483g = new u1[4];
    public static final Object[] h = new Object[4];
    public final int f18484a;
    public final ArrayList f18485b = new ArrayList();
    public final ArrayList f18486c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public boolean f18487e;
    public boolean f18488f;

    static {
        for (int i3 = 0; i3 < 4; i3++) {
            h[i3] = new Object();
        }
    }

    public u1(int i3) {
        this.f18484a = i3;
    }

    public static u1 f(int i3) {
        u1 u1Var;
        u1 u1Var2 = f18483g[i3];
        if (u1Var2 == null) {
            synchronized (h[i3]) {
                try {
                    u1Var = f18483g[i3];
                    if (u1Var == null) {
                        u1[] u1VarArr = f18483g;
                        u1 u1Var3 = new u1(i3);
                        u1VarArr[i3] = u1Var3;
                        u1Var = u1Var3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return u1Var;
        }
        return u1Var2;
    }

    public static boolean g(String str) {
        if (!"hello".equalsIgnoreCase(str) && !"away".equalsIgnoreCase(str)) {
            return false;
        }
        return true;
    }

    public final void a(String str) {
        t1 t1Var;
        ArrayList arrayList = this.f18486c;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                t1Var = (t1) obj;
                if (TextUtils.equals(str, t1Var.f18474b)) {
                    break;
                }
            } else {
                t1Var = null;
                break;
            }
        }
        if (t1Var != null) {
            arrayList.remove(t1Var);
            hs.f(this.f18484a).k(hs.F1, new Object[0]);
        }
    }

    public final void b(Runnable runnable) {
        if (this.f18488f) {
            runnable.run();
        } else {
            i(runnable, true);
        }
    }

    public final t1 c(long j10) {
        ArrayList arrayList = this.f18485b;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            t1 t1Var = (t1) obj;
            if (t1Var.f18473a == j10) {
                return t1Var;
            }
        }
        return null;
    }

    public final t1 d(String str) {
        ArrayList arrayList = this.f18485b;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            t1 t1Var = (t1) obj;
            if (TextUtils.equals(str, t1Var.f18474b)) {
                return t1Var;
            }
        }
        return null;
    }

    public final ArrayList e() {
        ArrayList arrayList = this.d;
        arrayList.clear();
        int i3 = 0;
        while (true) {
            ArrayList arrayList2 = this.f18485b;
            if (i3 < arrayList2.size()) {
                if (!g(((t1) arrayList2.get(i3)).f18474b)) {
                    arrayList.add((t1) arrayList2.get(i3));
                }
                i3++;
            } else {
                return arrayList;
            }
        }
    }

    public final void h() {
        i(null, true);
    }

    public final void i(java.lang.Runnable r37, boolean r38) {
        throw new UnsupportedOperationException("Method not decompiled: lg.u1.i(java.lang.Runnable, boolean):void");
    }

    public final boolean j(final TLRPC.Update update, String str, int i3) {
        if (update instanceof TL_update.TL_updateQuickReplyMessage) {
            b(new bi.q0(this, ((TL_update.TL_updateQuickReplyMessage) update).message, str, i3));
            return true;
        } else if (update instanceof TL_update.TL_updateQuickReplies) {
            b(new Runnable(this) {
                public final u1 f18457b;

                {
                    this.f18457b = this;
                }

                @Override
                public final void run() {
                    int i10;
                    t1 t1Var;
                    switch (r3) {
                        case 0:
                            u1 u1Var = this.f18457b;
                            ArrayList arrayList = u1Var.f18485b;
                            int i11 = u1Var.f18484a;
                            TLRPC.TL_quickReply tL_quickReply = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            t1 c2 = u1Var.c(tL_quickReply.shortcut_id);
                            if (c2 != null) {
                                c2.f18474b = tL_quickReply.shortcut;
                                c2.f18477f = tL_quickReply.count;
                                c2.d = tL_quickReply.top_message;
                                zi ziVar = c2.f18476e;
                                if (ziVar != null && ziVar.f1() != tL_quickReply.top_message) {
                                    c2.f18476e = null;
                                    long e10 = h10.i(i11).e();
                                    qr a02 = qr.a0(i11);
                                    a02.f24934a.c(new l2(u1Var, a02, c2, e10, 14));
                                    return;
                                }
                            } else {
                                t1 t1Var2 = new t1();
                                t1Var2.f18473a = tL_quickReply.shortcut_id;
                                t1Var2.f18474b = tL_quickReply.shortcut;
                                t1Var2.f18477f = tL_quickReply.count;
                                t1Var2.d = tL_quickReply.top_message;
                                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                    ((t1) arrayList.get(i12)).f18475c = i12;
                                }
                                arrayList.add(t1Var2);
                                u1Var.a(t1Var2.f18474b);
                            }
                            u1Var.l();
                            hs.f(i11).k(121, new Object[0]);
                            return;
                        case 1:
                            u1 u1Var2 = this.f18457b;
                            int i13 = u1Var2.f18484a;
                            t1 c10 = u1Var2.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c10 != null) {
                                u1Var2.f18485b.remove(c10);
                                u1Var2.a(c10.f18474b);
                                int i14 = c10.f18473a;
                                qr a03 = qr.a0(i13);
                                a03.f24934a.c(new cg.l0(a03, i14, 13));
                                u1Var2.l();
                                hs.f(i13).k(121, new Object[0]);
                                return;
                            }
                            return;
                        case 2:
                            u1 u1Var3 = this.f18457b;
                            int i15 = u1Var3.f18484a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            t1 c11 = u1Var3.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c11 != null) {
                                int size = c11.f18477f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c11.f18477f = size;
                                if (size <= 0) {
                                    u1Var3.f18485b.remove(c11);
                                }
                                ArrayList<Integer> arrayList2 = tL_updateDeleteQuickReplyMessages.messages;
                                zi ziVar2 = c11.f18476e;
                                if (ziVar2 != null) {
                                    i10 = ziVar2.f1();
                                } else {
                                    i10 = c11.d;
                                }
                                if (!arrayList2.contains(Integer.valueOf(i10)) && c11.f18476e != null) {
                                    u1Var3.l();
                                    hs.f(i15).k(121, new Object[0]);
                                    return;
                                }
                                c11.f18476e = null;
                                long e11 = h10.i(i15).e();
                                qr a04 = qr.a0(i15);
                                a04.f24934a.c(new l2(u1Var3, a04, c11, e11, 14));
                                return;
                            }
                            return;
                        default:
                            ArrayList<TLRPC.TL_quickReply> arrayList3 = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            u1 u1Var4 = this.f18457b;
                            ArrayList arrayList4 = u1Var4.f18485b;
                            ArrayList arrayList5 = new ArrayList(arrayList4);
                            arrayList4.clear();
                            for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                                TLRPC.TL_quickReply tL_quickReply2 = arrayList3.get(i16);
                                int i17 = 0;
                                while (true) {
                                    if (i17 < arrayList5.size()) {
                                        if (((t1) arrayList5.get(i17)).f18473a == tL_quickReply2.shortcut_id) {
                                            t1Var = (t1) arrayList5.get(i17);
                                        } else {
                                            i17++;
                                        }
                                    } else {
                                        t1Var = null;
                                    }
                                }
                                if (t1Var == null) {
                                    t1Var = new t1();
                                }
                                t1Var.f18473a = tL_quickReply2.shortcut_id;
                                t1Var.f18474b = tL_quickReply2.shortcut;
                                t1Var.f18477f = tL_quickReply2.count;
                                t1Var.f18475c = i16;
                                t1Var.d = tL_quickReply2.top_message;
                                zi ziVar3 = t1Var.f18476e;
                                if (ziVar3 != null && ziVar3.f1() != tL_quickReply2.top_message) {
                                    t1Var.f18476e = null;
                                }
                                arrayList4.add(t1Var);
                                u1Var4.a(t1Var.f18474b);
                            }
                            u1Var4.l();
                            hs.f(u1Var4.f18484a).k(121, new Object[0]);
                            return;
                    }
                }
            });
            return true;
        } else if (update instanceof TL_update.TL_updateNewQuickReply) {
            b(new Runnable(this) {
                public final u1 f18457b;

                {
                    this.f18457b = this;
                }

                @Override
                public final void run() {
                    int i10;
                    t1 t1Var;
                    switch (r3) {
                        case 0:
                            u1 u1Var = this.f18457b;
                            ArrayList arrayList = u1Var.f18485b;
                            int i11 = u1Var.f18484a;
                            TLRPC.TL_quickReply tL_quickReply = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            t1 c2 = u1Var.c(tL_quickReply.shortcut_id);
                            if (c2 != null) {
                                c2.f18474b = tL_quickReply.shortcut;
                                c2.f18477f = tL_quickReply.count;
                                c2.d = tL_quickReply.top_message;
                                zi ziVar = c2.f18476e;
                                if (ziVar != null && ziVar.f1() != tL_quickReply.top_message) {
                                    c2.f18476e = null;
                                    long e10 = h10.i(i11).e();
                                    qr a02 = qr.a0(i11);
                                    a02.f24934a.c(new l2(u1Var, a02, c2, e10, 14));
                                    return;
                                }
                            } else {
                                t1 t1Var2 = new t1();
                                t1Var2.f18473a = tL_quickReply.shortcut_id;
                                t1Var2.f18474b = tL_quickReply.shortcut;
                                t1Var2.f18477f = tL_quickReply.count;
                                t1Var2.d = tL_quickReply.top_message;
                                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                    ((t1) arrayList.get(i12)).f18475c = i12;
                                }
                                arrayList.add(t1Var2);
                                u1Var.a(t1Var2.f18474b);
                            }
                            u1Var.l();
                            hs.f(i11).k(121, new Object[0]);
                            return;
                        case 1:
                            u1 u1Var2 = this.f18457b;
                            int i13 = u1Var2.f18484a;
                            t1 c10 = u1Var2.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c10 != null) {
                                u1Var2.f18485b.remove(c10);
                                u1Var2.a(c10.f18474b);
                                int i14 = c10.f18473a;
                                qr a03 = qr.a0(i13);
                                a03.f24934a.c(new cg.l0(a03, i14, 13));
                                u1Var2.l();
                                hs.f(i13).k(121, new Object[0]);
                                return;
                            }
                            return;
                        case 2:
                            u1 u1Var3 = this.f18457b;
                            int i15 = u1Var3.f18484a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            t1 c11 = u1Var3.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c11 != null) {
                                int size = c11.f18477f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c11.f18477f = size;
                                if (size <= 0) {
                                    u1Var3.f18485b.remove(c11);
                                }
                                ArrayList<Integer> arrayList2 = tL_updateDeleteQuickReplyMessages.messages;
                                zi ziVar2 = c11.f18476e;
                                if (ziVar2 != null) {
                                    i10 = ziVar2.f1();
                                } else {
                                    i10 = c11.d;
                                }
                                if (!arrayList2.contains(Integer.valueOf(i10)) && c11.f18476e != null) {
                                    u1Var3.l();
                                    hs.f(i15).k(121, new Object[0]);
                                    return;
                                }
                                c11.f18476e = null;
                                long e11 = h10.i(i15).e();
                                qr a04 = qr.a0(i15);
                                a04.f24934a.c(new l2(u1Var3, a04, c11, e11, 14));
                                return;
                            }
                            return;
                        default:
                            ArrayList<TLRPC.TL_quickReply> arrayList3 = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            u1 u1Var4 = this.f18457b;
                            ArrayList arrayList4 = u1Var4.f18485b;
                            ArrayList arrayList5 = new ArrayList(arrayList4);
                            arrayList4.clear();
                            for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                                TLRPC.TL_quickReply tL_quickReply2 = arrayList3.get(i16);
                                int i17 = 0;
                                while (true) {
                                    if (i17 < arrayList5.size()) {
                                        if (((t1) arrayList5.get(i17)).f18473a == tL_quickReply2.shortcut_id) {
                                            t1Var = (t1) arrayList5.get(i17);
                                        } else {
                                            i17++;
                                        }
                                    } else {
                                        t1Var = null;
                                    }
                                }
                                if (t1Var == null) {
                                    t1Var = new t1();
                                }
                                t1Var.f18473a = tL_quickReply2.shortcut_id;
                                t1Var.f18474b = tL_quickReply2.shortcut;
                                t1Var.f18477f = tL_quickReply2.count;
                                t1Var.f18475c = i16;
                                t1Var.d = tL_quickReply2.top_message;
                                zi ziVar3 = t1Var.f18476e;
                                if (ziVar3 != null && ziVar3.f1() != tL_quickReply2.top_message) {
                                    t1Var.f18476e = null;
                                }
                                arrayList4.add(t1Var);
                                u1Var4.a(t1Var.f18474b);
                            }
                            u1Var4.l();
                            hs.f(u1Var4.f18484a).k(121, new Object[0]);
                            return;
                    }
                }
            });
            return true;
        } else if (update instanceof TL_update.TL_updateDeleteQuickReply) {
            b(new Runnable(this) {
                public final u1 f18457b;

                {
                    this.f18457b = this;
                }

                @Override
                public final void run() {
                    int i10;
                    t1 t1Var;
                    switch (r3) {
                        case 0:
                            u1 u1Var = this.f18457b;
                            ArrayList arrayList = u1Var.f18485b;
                            int i11 = u1Var.f18484a;
                            TLRPC.TL_quickReply tL_quickReply = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            t1 c2 = u1Var.c(tL_quickReply.shortcut_id);
                            if (c2 != null) {
                                c2.f18474b = tL_quickReply.shortcut;
                                c2.f18477f = tL_quickReply.count;
                                c2.d = tL_quickReply.top_message;
                                zi ziVar = c2.f18476e;
                                if (ziVar != null && ziVar.f1() != tL_quickReply.top_message) {
                                    c2.f18476e = null;
                                    long e10 = h10.i(i11).e();
                                    qr a02 = qr.a0(i11);
                                    a02.f24934a.c(new l2(u1Var, a02, c2, e10, 14));
                                    return;
                                }
                            } else {
                                t1 t1Var2 = new t1();
                                t1Var2.f18473a = tL_quickReply.shortcut_id;
                                t1Var2.f18474b = tL_quickReply.shortcut;
                                t1Var2.f18477f = tL_quickReply.count;
                                t1Var2.d = tL_quickReply.top_message;
                                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                    ((t1) arrayList.get(i12)).f18475c = i12;
                                }
                                arrayList.add(t1Var2);
                                u1Var.a(t1Var2.f18474b);
                            }
                            u1Var.l();
                            hs.f(i11).k(121, new Object[0]);
                            return;
                        case 1:
                            u1 u1Var2 = this.f18457b;
                            int i13 = u1Var2.f18484a;
                            t1 c10 = u1Var2.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c10 != null) {
                                u1Var2.f18485b.remove(c10);
                                u1Var2.a(c10.f18474b);
                                int i14 = c10.f18473a;
                                qr a03 = qr.a0(i13);
                                a03.f24934a.c(new cg.l0(a03, i14, 13));
                                u1Var2.l();
                                hs.f(i13).k(121, new Object[0]);
                                return;
                            }
                            return;
                        case 2:
                            u1 u1Var3 = this.f18457b;
                            int i15 = u1Var3.f18484a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            t1 c11 = u1Var3.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c11 != null) {
                                int size = c11.f18477f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c11.f18477f = size;
                                if (size <= 0) {
                                    u1Var3.f18485b.remove(c11);
                                }
                                ArrayList<Integer> arrayList2 = tL_updateDeleteQuickReplyMessages.messages;
                                zi ziVar2 = c11.f18476e;
                                if (ziVar2 != null) {
                                    i10 = ziVar2.f1();
                                } else {
                                    i10 = c11.d;
                                }
                                if (!arrayList2.contains(Integer.valueOf(i10)) && c11.f18476e != null) {
                                    u1Var3.l();
                                    hs.f(i15).k(121, new Object[0]);
                                    return;
                                }
                                c11.f18476e = null;
                                long e11 = h10.i(i15).e();
                                qr a04 = qr.a0(i15);
                                a04.f24934a.c(new l2(u1Var3, a04, c11, e11, 14));
                                return;
                            }
                            return;
                        default:
                            ArrayList<TLRPC.TL_quickReply> arrayList3 = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            u1 u1Var4 = this.f18457b;
                            ArrayList arrayList4 = u1Var4.f18485b;
                            ArrayList arrayList5 = new ArrayList(arrayList4);
                            arrayList4.clear();
                            for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                                TLRPC.TL_quickReply tL_quickReply2 = arrayList3.get(i16);
                                int i17 = 0;
                                while (true) {
                                    if (i17 < arrayList5.size()) {
                                        if (((t1) arrayList5.get(i17)).f18473a == tL_quickReply2.shortcut_id) {
                                            t1Var = (t1) arrayList5.get(i17);
                                        } else {
                                            i17++;
                                        }
                                    } else {
                                        t1Var = null;
                                    }
                                }
                                if (t1Var == null) {
                                    t1Var = new t1();
                                }
                                t1Var.f18473a = tL_quickReply2.shortcut_id;
                                t1Var.f18474b = tL_quickReply2.shortcut;
                                t1Var.f18477f = tL_quickReply2.count;
                                t1Var.f18475c = i16;
                                t1Var.d = tL_quickReply2.top_message;
                                zi ziVar3 = t1Var.f18476e;
                                if (ziVar3 != null && ziVar3.f1() != tL_quickReply2.top_message) {
                                    t1Var.f18476e = null;
                                }
                                arrayList4.add(t1Var);
                                u1Var4.a(t1Var.f18474b);
                            }
                            u1Var4.l();
                            hs.f(u1Var4.f18484a).k(121, new Object[0]);
                            return;
                    }
                }
            });
            return true;
        } else if (update instanceof TL_update.TL_updateDeleteQuickReplyMessages) {
            b(new Runnable(this) {
                public final u1 f18457b;

                {
                    this.f18457b = this;
                }

                @Override
                public final void run() {
                    int i10;
                    t1 t1Var;
                    switch (r3) {
                        case 0:
                            u1 u1Var = this.f18457b;
                            ArrayList arrayList = u1Var.f18485b;
                            int i11 = u1Var.f18484a;
                            TLRPC.TL_quickReply tL_quickReply = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            t1 c2 = u1Var.c(tL_quickReply.shortcut_id);
                            if (c2 != null) {
                                c2.f18474b = tL_quickReply.shortcut;
                                c2.f18477f = tL_quickReply.count;
                                c2.d = tL_quickReply.top_message;
                                zi ziVar = c2.f18476e;
                                if (ziVar != null && ziVar.f1() != tL_quickReply.top_message) {
                                    c2.f18476e = null;
                                    long e10 = h10.i(i11).e();
                                    qr a02 = qr.a0(i11);
                                    a02.f24934a.c(new l2(u1Var, a02, c2, e10, 14));
                                    return;
                                }
                            } else {
                                t1 t1Var2 = new t1();
                                t1Var2.f18473a = tL_quickReply.shortcut_id;
                                t1Var2.f18474b = tL_quickReply.shortcut;
                                t1Var2.f18477f = tL_quickReply.count;
                                t1Var2.d = tL_quickReply.top_message;
                                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                    ((t1) arrayList.get(i12)).f18475c = i12;
                                }
                                arrayList.add(t1Var2);
                                u1Var.a(t1Var2.f18474b);
                            }
                            u1Var.l();
                            hs.f(i11).k(121, new Object[0]);
                            return;
                        case 1:
                            u1 u1Var2 = this.f18457b;
                            int i13 = u1Var2.f18484a;
                            t1 c10 = u1Var2.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c10 != null) {
                                u1Var2.f18485b.remove(c10);
                                u1Var2.a(c10.f18474b);
                                int i14 = c10.f18473a;
                                qr a03 = qr.a0(i13);
                                a03.f24934a.c(new cg.l0(a03, i14, 13));
                                u1Var2.l();
                                hs.f(i13).k(121, new Object[0]);
                                return;
                            }
                            return;
                        case 2:
                            u1 u1Var3 = this.f18457b;
                            int i15 = u1Var3.f18484a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            t1 c11 = u1Var3.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c11 != null) {
                                int size = c11.f18477f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c11.f18477f = size;
                                if (size <= 0) {
                                    u1Var3.f18485b.remove(c11);
                                }
                                ArrayList<Integer> arrayList2 = tL_updateDeleteQuickReplyMessages.messages;
                                zi ziVar2 = c11.f18476e;
                                if (ziVar2 != null) {
                                    i10 = ziVar2.f1();
                                } else {
                                    i10 = c11.d;
                                }
                                if (!arrayList2.contains(Integer.valueOf(i10)) && c11.f18476e != null) {
                                    u1Var3.l();
                                    hs.f(i15).k(121, new Object[0]);
                                    return;
                                }
                                c11.f18476e = null;
                                long e11 = h10.i(i15).e();
                                qr a04 = qr.a0(i15);
                                a04.f24934a.c(new l2(u1Var3, a04, c11, e11, 14));
                                return;
                            }
                            return;
                        default:
                            ArrayList<TLRPC.TL_quickReply> arrayList3 = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            u1 u1Var4 = this.f18457b;
                            ArrayList arrayList4 = u1Var4.f18485b;
                            ArrayList arrayList5 = new ArrayList(arrayList4);
                            arrayList4.clear();
                            for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                                TLRPC.TL_quickReply tL_quickReply2 = arrayList3.get(i16);
                                int i17 = 0;
                                while (true) {
                                    if (i17 < arrayList5.size()) {
                                        if (((t1) arrayList5.get(i17)).f18473a == tL_quickReply2.shortcut_id) {
                                            t1Var = (t1) arrayList5.get(i17);
                                        } else {
                                            i17++;
                                        }
                                    } else {
                                        t1Var = null;
                                    }
                                }
                                if (t1Var == null) {
                                    t1Var = new t1();
                                }
                                t1Var.f18473a = tL_quickReply2.shortcut_id;
                                t1Var.f18474b = tL_quickReply2.shortcut;
                                t1Var.f18477f = tL_quickReply2.count;
                                t1Var.f18475c = i16;
                                t1Var.d = tL_quickReply2.top_message;
                                zi ziVar3 = t1Var.f18476e;
                                if (ziVar3 != null && ziVar3.f1() != tL_quickReply2.top_message) {
                                    t1Var.f18476e = null;
                                }
                                arrayList4.add(t1Var);
                                u1Var4.a(t1Var.f18474b);
                            }
                            u1Var4.l();
                            hs.f(u1Var4.f18484a).k(121, new Object[0]);
                            return;
                    }
                }
            });
            return true;
        } else {
            return false;
        }
    }

    public final void k(int i3, String str) {
        t1 c2 = c(i3);
        if (c2 == null) {
            return;
        }
        c2.f18474b = str;
        TLRPC.TL_messages_editQuickReplyShortcut tL_messages_editQuickReplyShortcut = new TLRPC.TL_messages_editQuickReplyShortcut();
        tL_messages_editQuickReplyShortcut.shortcut_id = i3;
        tL_messages_editQuickReplyShortcut.shortcut = str;
        int i10 = this.f18484a;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_editQuickReplyShortcut, new u5(7));
        l();
        hs.f(i10).k(hs.F1, new Object[0]);
    }

    public final void l() {
        qr a02 = qr.a0(this.f18484a);
        a02.f24934a.c(new ii.e(28, this, a02));
    }
}
