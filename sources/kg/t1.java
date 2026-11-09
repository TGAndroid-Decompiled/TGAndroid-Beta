package kg;

import android.text.TextUtils;
import bi.w2;
import di.v5;
import java.util.ArrayList;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
public final class t1 {
    public static volatile t1[] f17546g = new t1[4];
    public static final Object[] h = new Object[4];
    public final int f17547a;
    public final ArrayList f17548b = new ArrayList();
    public final ArrayList f17549c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public boolean f17550e;
    public boolean f17551f;

    static {
        for (int i7 = 0; i7 < 4; i7++) {
            h[i7] = new Object();
        }
    }

    public t1(int i7) {
        this.f17547a = i7;
    }

    public static t1 f(int i7) {
        t1 t1Var;
        t1 t1Var2 = f17546g[i7];
        if (t1Var2 == null) {
            synchronized (h[i7]) {
                try {
                    t1Var = f17546g[i7];
                    if (t1Var == null) {
                        t1[] t1VarArr = f17546g;
                        t1 t1Var3 = new t1(i7);
                        t1VarArr[i7] = t1Var3;
                        t1Var = t1Var3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return t1Var;
        }
        return t1Var2;
    }

    public static boolean g(String str) {
        if (!"hello".equalsIgnoreCase(str) && !"away".equalsIgnoreCase(str)) {
            return false;
        }
        return true;
    }

    public final void a(String str) {
        s1 s1Var;
        ArrayList arrayList = this.f17549c;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                s1Var = (s1) obj;
                if (TextUtils.equals(str, s1Var.f17533b)) {
                    break;
                }
            } else {
                s1Var = null;
                break;
            }
        }
        if (s1Var != null) {
            arrayList.remove(s1Var);
            qs.f(this.f17547a).k(qs.F1, new Object[0]);
        }
    }

    public final void b(Runnable runnable) {
        if (this.f17551f) {
            runnable.run();
        } else {
            i(runnable, true);
        }
    }

    public final s1 c(long j3) {
        ArrayList arrayList = this.f17548b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            s1 s1Var = (s1) obj;
            if (s1Var.f17532a == j3) {
                return s1Var;
            }
        }
        return null;
    }

    public final s1 d(String str) {
        ArrayList arrayList = this.f17548b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            s1 s1Var = (s1) obj;
            if (TextUtils.equals(str, s1Var.f17533b)) {
                return s1Var;
            }
        }
        return null;
    }

    public final ArrayList e() {
        ArrayList arrayList = this.d;
        arrayList.clear();
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.f17548b;
            if (i7 < arrayList2.size()) {
                if (!g(((s1) arrayList2.get(i7)).f17533b)) {
                    arrayList.add((s1) arrayList2.get(i7));
                }
                i7++;
            } else {
                return arrayList;
            }
        }
    }

    public final void h() {
        i(null, true);
    }

    public final void i(java.lang.Runnable r37, boolean r38) {
        throw new UnsupportedOperationException("Method not decompiled: kg.t1.i(java.lang.Runnable, boolean):void");
    }

    public final boolean j(final TLRPC.Update update, String str, int i7) {
        if (update instanceof TL_update.TL_updateQuickReplyMessage) {
            b(new ai.a1(this, ((TL_update.TL_updateQuickReplyMessage) update).message, str, i7));
            return true;
        } else if (update instanceof TL_update.TL_updateQuickReplies) {
            b(new Runnable(this) {
                public final t1 f17521b;

                {
                    this.f17521b = this;
                }

                @Override
                public final void run() {
                    int i10;
                    s1 s1Var;
                    switch (r3) {
                        case 0:
                            t1 t1Var = this.f17521b;
                            ArrayList arrayList = t1Var.f17548b;
                            int i11 = t1Var.f17547a;
                            TLRPC.TL_quickReply tL_quickReply = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            s1 c10 = t1Var.c(tL_quickReply.shortcut_id);
                            if (c10 != null) {
                                c10.f17533b = tL_quickReply.shortcut;
                                c10.f17536f = tL_quickReply.count;
                                c10.d = tL_quickReply.top_message;
                                ij ijVar = c10.f17535e;
                                if (ijVar != null && ijVar.e1() != tL_quickReply.top_message) {
                                    c10.f17535e = null;
                                    long e10 = p10.i(i11).e();
                                    yr a02 = yr.a0(i11);
                                    a02.f26719a.c(new w2(t1Var, a02, c10, e10, 14));
                                    return;
                                }
                            } else {
                                s1 s1Var2 = new s1();
                                s1Var2.f17532a = tL_quickReply.shortcut_id;
                                s1Var2.f17533b = tL_quickReply.shortcut;
                                s1Var2.f17536f = tL_quickReply.count;
                                s1Var2.d = tL_quickReply.top_message;
                                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                    ((s1) arrayList.get(i12)).f17534c = i12;
                                }
                                arrayList.add(s1Var2);
                                t1Var.a(s1Var2.f17533b);
                            }
                            t1Var.l();
                            qs.f(i11).k(121, new Object[0]);
                            return;
                        case 1:
                            t1 t1Var2 = this.f17521b;
                            int i13 = t1Var2.f17547a;
                            s1 c11 = t1Var2.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c11 != null) {
                                t1Var2.f17548b.remove(c11);
                                t1Var2.a(c11.f17533b);
                                int i14 = c11.f17532a;
                                yr a03 = yr.a0(i13);
                                a03.f26719a.c(new bg.m0(a03, i14, 12));
                                t1Var2.l();
                                qs.f(i13).k(121, new Object[0]);
                                return;
                            }
                            return;
                        case 2:
                            t1 t1Var3 = this.f17521b;
                            int i15 = t1Var3.f17547a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            s1 c12 = t1Var3.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c12 != null) {
                                int size = c12.f17536f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c12.f17536f = size;
                                if (size <= 0) {
                                    t1Var3.f17548b.remove(c12);
                                }
                                ArrayList<Integer> arrayList2 = tL_updateDeleteQuickReplyMessages.messages;
                                ij ijVar2 = c12.f17535e;
                                if (ijVar2 != null) {
                                    i10 = ijVar2.e1();
                                } else {
                                    i10 = c12.d;
                                }
                                if (!arrayList2.contains(Integer.valueOf(i10)) && c12.f17535e != null) {
                                    t1Var3.l();
                                    qs.f(i15).k(121, new Object[0]);
                                    return;
                                }
                                c12.f17535e = null;
                                long e11 = p10.i(i15).e();
                                yr a04 = yr.a0(i15);
                                a04.f26719a.c(new w2(t1Var3, a04, c12, e11, 14));
                                return;
                            }
                            return;
                        default:
                            ArrayList<TLRPC.TL_quickReply> arrayList3 = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            t1 t1Var4 = this.f17521b;
                            ArrayList arrayList4 = t1Var4.f17548b;
                            ArrayList arrayList5 = new ArrayList(arrayList4);
                            arrayList4.clear();
                            for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                                TLRPC.TL_quickReply tL_quickReply2 = arrayList3.get(i16);
                                int i17 = 0;
                                while (true) {
                                    if (i17 < arrayList5.size()) {
                                        if (((s1) arrayList5.get(i17)).f17532a == tL_quickReply2.shortcut_id) {
                                            s1Var = (s1) arrayList5.get(i17);
                                        } else {
                                            i17++;
                                        }
                                    } else {
                                        s1Var = null;
                                    }
                                }
                                if (s1Var == null) {
                                    s1Var = new s1();
                                }
                                s1Var.f17532a = tL_quickReply2.shortcut_id;
                                s1Var.f17533b = tL_quickReply2.shortcut;
                                s1Var.f17536f = tL_quickReply2.count;
                                s1Var.f17534c = i16;
                                s1Var.d = tL_quickReply2.top_message;
                                ij ijVar3 = s1Var.f17535e;
                                if (ijVar3 != null && ijVar3.e1() != tL_quickReply2.top_message) {
                                    s1Var.f17535e = null;
                                }
                                arrayList4.add(s1Var);
                                t1Var4.a(s1Var.f17533b);
                            }
                            t1Var4.l();
                            qs.f(t1Var4.f17547a).k(121, new Object[0]);
                            return;
                    }
                }
            });
            return true;
        } else if (update instanceof TL_update.TL_updateNewQuickReply) {
            b(new Runnable(this) {
                public final t1 f17521b;

                {
                    this.f17521b = this;
                }

                @Override
                public final void run() {
                    int i10;
                    s1 s1Var;
                    switch (r3) {
                        case 0:
                            t1 t1Var = this.f17521b;
                            ArrayList arrayList = t1Var.f17548b;
                            int i11 = t1Var.f17547a;
                            TLRPC.TL_quickReply tL_quickReply = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            s1 c10 = t1Var.c(tL_quickReply.shortcut_id);
                            if (c10 != null) {
                                c10.f17533b = tL_quickReply.shortcut;
                                c10.f17536f = tL_quickReply.count;
                                c10.d = tL_quickReply.top_message;
                                ij ijVar = c10.f17535e;
                                if (ijVar != null && ijVar.e1() != tL_quickReply.top_message) {
                                    c10.f17535e = null;
                                    long e10 = p10.i(i11).e();
                                    yr a02 = yr.a0(i11);
                                    a02.f26719a.c(new w2(t1Var, a02, c10, e10, 14));
                                    return;
                                }
                            } else {
                                s1 s1Var2 = new s1();
                                s1Var2.f17532a = tL_quickReply.shortcut_id;
                                s1Var2.f17533b = tL_quickReply.shortcut;
                                s1Var2.f17536f = tL_quickReply.count;
                                s1Var2.d = tL_quickReply.top_message;
                                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                    ((s1) arrayList.get(i12)).f17534c = i12;
                                }
                                arrayList.add(s1Var2);
                                t1Var.a(s1Var2.f17533b);
                            }
                            t1Var.l();
                            qs.f(i11).k(121, new Object[0]);
                            return;
                        case 1:
                            t1 t1Var2 = this.f17521b;
                            int i13 = t1Var2.f17547a;
                            s1 c11 = t1Var2.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c11 != null) {
                                t1Var2.f17548b.remove(c11);
                                t1Var2.a(c11.f17533b);
                                int i14 = c11.f17532a;
                                yr a03 = yr.a0(i13);
                                a03.f26719a.c(new bg.m0(a03, i14, 12));
                                t1Var2.l();
                                qs.f(i13).k(121, new Object[0]);
                                return;
                            }
                            return;
                        case 2:
                            t1 t1Var3 = this.f17521b;
                            int i15 = t1Var3.f17547a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            s1 c12 = t1Var3.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c12 != null) {
                                int size = c12.f17536f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c12.f17536f = size;
                                if (size <= 0) {
                                    t1Var3.f17548b.remove(c12);
                                }
                                ArrayList<Integer> arrayList2 = tL_updateDeleteQuickReplyMessages.messages;
                                ij ijVar2 = c12.f17535e;
                                if (ijVar2 != null) {
                                    i10 = ijVar2.e1();
                                } else {
                                    i10 = c12.d;
                                }
                                if (!arrayList2.contains(Integer.valueOf(i10)) && c12.f17535e != null) {
                                    t1Var3.l();
                                    qs.f(i15).k(121, new Object[0]);
                                    return;
                                }
                                c12.f17535e = null;
                                long e11 = p10.i(i15).e();
                                yr a04 = yr.a0(i15);
                                a04.f26719a.c(new w2(t1Var3, a04, c12, e11, 14));
                                return;
                            }
                            return;
                        default:
                            ArrayList<TLRPC.TL_quickReply> arrayList3 = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            t1 t1Var4 = this.f17521b;
                            ArrayList arrayList4 = t1Var4.f17548b;
                            ArrayList arrayList5 = new ArrayList(arrayList4);
                            arrayList4.clear();
                            for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                                TLRPC.TL_quickReply tL_quickReply2 = arrayList3.get(i16);
                                int i17 = 0;
                                while (true) {
                                    if (i17 < arrayList5.size()) {
                                        if (((s1) arrayList5.get(i17)).f17532a == tL_quickReply2.shortcut_id) {
                                            s1Var = (s1) arrayList5.get(i17);
                                        } else {
                                            i17++;
                                        }
                                    } else {
                                        s1Var = null;
                                    }
                                }
                                if (s1Var == null) {
                                    s1Var = new s1();
                                }
                                s1Var.f17532a = tL_quickReply2.shortcut_id;
                                s1Var.f17533b = tL_quickReply2.shortcut;
                                s1Var.f17536f = tL_quickReply2.count;
                                s1Var.f17534c = i16;
                                s1Var.d = tL_quickReply2.top_message;
                                ij ijVar3 = s1Var.f17535e;
                                if (ijVar3 != null && ijVar3.e1() != tL_quickReply2.top_message) {
                                    s1Var.f17535e = null;
                                }
                                arrayList4.add(s1Var);
                                t1Var4.a(s1Var.f17533b);
                            }
                            t1Var4.l();
                            qs.f(t1Var4.f17547a).k(121, new Object[0]);
                            return;
                    }
                }
            });
            return true;
        } else if (update instanceof TL_update.TL_updateDeleteQuickReply) {
            b(new Runnable(this) {
                public final t1 f17521b;

                {
                    this.f17521b = this;
                }

                @Override
                public final void run() {
                    int i10;
                    s1 s1Var;
                    switch (r3) {
                        case 0:
                            t1 t1Var = this.f17521b;
                            ArrayList arrayList = t1Var.f17548b;
                            int i11 = t1Var.f17547a;
                            TLRPC.TL_quickReply tL_quickReply = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            s1 c10 = t1Var.c(tL_quickReply.shortcut_id);
                            if (c10 != null) {
                                c10.f17533b = tL_quickReply.shortcut;
                                c10.f17536f = tL_quickReply.count;
                                c10.d = tL_quickReply.top_message;
                                ij ijVar = c10.f17535e;
                                if (ijVar != null && ijVar.e1() != tL_quickReply.top_message) {
                                    c10.f17535e = null;
                                    long e10 = p10.i(i11).e();
                                    yr a02 = yr.a0(i11);
                                    a02.f26719a.c(new w2(t1Var, a02, c10, e10, 14));
                                    return;
                                }
                            } else {
                                s1 s1Var2 = new s1();
                                s1Var2.f17532a = tL_quickReply.shortcut_id;
                                s1Var2.f17533b = tL_quickReply.shortcut;
                                s1Var2.f17536f = tL_quickReply.count;
                                s1Var2.d = tL_quickReply.top_message;
                                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                    ((s1) arrayList.get(i12)).f17534c = i12;
                                }
                                arrayList.add(s1Var2);
                                t1Var.a(s1Var2.f17533b);
                            }
                            t1Var.l();
                            qs.f(i11).k(121, new Object[0]);
                            return;
                        case 1:
                            t1 t1Var2 = this.f17521b;
                            int i13 = t1Var2.f17547a;
                            s1 c11 = t1Var2.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c11 != null) {
                                t1Var2.f17548b.remove(c11);
                                t1Var2.a(c11.f17533b);
                                int i14 = c11.f17532a;
                                yr a03 = yr.a0(i13);
                                a03.f26719a.c(new bg.m0(a03, i14, 12));
                                t1Var2.l();
                                qs.f(i13).k(121, new Object[0]);
                                return;
                            }
                            return;
                        case 2:
                            t1 t1Var3 = this.f17521b;
                            int i15 = t1Var3.f17547a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            s1 c12 = t1Var3.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c12 != null) {
                                int size = c12.f17536f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c12.f17536f = size;
                                if (size <= 0) {
                                    t1Var3.f17548b.remove(c12);
                                }
                                ArrayList<Integer> arrayList2 = tL_updateDeleteQuickReplyMessages.messages;
                                ij ijVar2 = c12.f17535e;
                                if (ijVar2 != null) {
                                    i10 = ijVar2.e1();
                                } else {
                                    i10 = c12.d;
                                }
                                if (!arrayList2.contains(Integer.valueOf(i10)) && c12.f17535e != null) {
                                    t1Var3.l();
                                    qs.f(i15).k(121, new Object[0]);
                                    return;
                                }
                                c12.f17535e = null;
                                long e11 = p10.i(i15).e();
                                yr a04 = yr.a0(i15);
                                a04.f26719a.c(new w2(t1Var3, a04, c12, e11, 14));
                                return;
                            }
                            return;
                        default:
                            ArrayList<TLRPC.TL_quickReply> arrayList3 = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            t1 t1Var4 = this.f17521b;
                            ArrayList arrayList4 = t1Var4.f17548b;
                            ArrayList arrayList5 = new ArrayList(arrayList4);
                            arrayList4.clear();
                            for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                                TLRPC.TL_quickReply tL_quickReply2 = arrayList3.get(i16);
                                int i17 = 0;
                                while (true) {
                                    if (i17 < arrayList5.size()) {
                                        if (((s1) arrayList5.get(i17)).f17532a == tL_quickReply2.shortcut_id) {
                                            s1Var = (s1) arrayList5.get(i17);
                                        } else {
                                            i17++;
                                        }
                                    } else {
                                        s1Var = null;
                                    }
                                }
                                if (s1Var == null) {
                                    s1Var = new s1();
                                }
                                s1Var.f17532a = tL_quickReply2.shortcut_id;
                                s1Var.f17533b = tL_quickReply2.shortcut;
                                s1Var.f17536f = tL_quickReply2.count;
                                s1Var.f17534c = i16;
                                s1Var.d = tL_quickReply2.top_message;
                                ij ijVar3 = s1Var.f17535e;
                                if (ijVar3 != null && ijVar3.e1() != tL_quickReply2.top_message) {
                                    s1Var.f17535e = null;
                                }
                                arrayList4.add(s1Var);
                                t1Var4.a(s1Var.f17533b);
                            }
                            t1Var4.l();
                            qs.f(t1Var4.f17547a).k(121, new Object[0]);
                            return;
                    }
                }
            });
            return true;
        } else if (update instanceof TL_update.TL_updateDeleteQuickReplyMessages) {
            b(new Runnable(this) {
                public final t1 f17521b;

                {
                    this.f17521b = this;
                }

                @Override
                public final void run() {
                    int i10;
                    s1 s1Var;
                    switch (r3) {
                        case 0:
                            t1 t1Var = this.f17521b;
                            ArrayList arrayList = t1Var.f17548b;
                            int i11 = t1Var.f17547a;
                            TLRPC.TL_quickReply tL_quickReply = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            s1 c10 = t1Var.c(tL_quickReply.shortcut_id);
                            if (c10 != null) {
                                c10.f17533b = tL_quickReply.shortcut;
                                c10.f17536f = tL_quickReply.count;
                                c10.d = tL_quickReply.top_message;
                                ij ijVar = c10.f17535e;
                                if (ijVar != null && ijVar.e1() != tL_quickReply.top_message) {
                                    c10.f17535e = null;
                                    long e10 = p10.i(i11).e();
                                    yr a02 = yr.a0(i11);
                                    a02.f26719a.c(new w2(t1Var, a02, c10, e10, 14));
                                    return;
                                }
                            } else {
                                s1 s1Var2 = new s1();
                                s1Var2.f17532a = tL_quickReply.shortcut_id;
                                s1Var2.f17533b = tL_quickReply.shortcut;
                                s1Var2.f17536f = tL_quickReply.count;
                                s1Var2.d = tL_quickReply.top_message;
                                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                    ((s1) arrayList.get(i12)).f17534c = i12;
                                }
                                arrayList.add(s1Var2);
                                t1Var.a(s1Var2.f17533b);
                            }
                            t1Var.l();
                            qs.f(i11).k(121, new Object[0]);
                            return;
                        case 1:
                            t1 t1Var2 = this.f17521b;
                            int i13 = t1Var2.f17547a;
                            s1 c11 = t1Var2.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c11 != null) {
                                t1Var2.f17548b.remove(c11);
                                t1Var2.a(c11.f17533b);
                                int i14 = c11.f17532a;
                                yr a03 = yr.a0(i13);
                                a03.f26719a.c(new bg.m0(a03, i14, 12));
                                t1Var2.l();
                                qs.f(i13).k(121, new Object[0]);
                                return;
                            }
                            return;
                        case 2:
                            t1 t1Var3 = this.f17521b;
                            int i15 = t1Var3.f17547a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            s1 c12 = t1Var3.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c12 != null) {
                                int size = c12.f17536f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c12.f17536f = size;
                                if (size <= 0) {
                                    t1Var3.f17548b.remove(c12);
                                }
                                ArrayList<Integer> arrayList2 = tL_updateDeleteQuickReplyMessages.messages;
                                ij ijVar2 = c12.f17535e;
                                if (ijVar2 != null) {
                                    i10 = ijVar2.e1();
                                } else {
                                    i10 = c12.d;
                                }
                                if (!arrayList2.contains(Integer.valueOf(i10)) && c12.f17535e != null) {
                                    t1Var3.l();
                                    qs.f(i15).k(121, new Object[0]);
                                    return;
                                }
                                c12.f17535e = null;
                                long e11 = p10.i(i15).e();
                                yr a04 = yr.a0(i15);
                                a04.f26719a.c(new w2(t1Var3, a04, c12, e11, 14));
                                return;
                            }
                            return;
                        default:
                            ArrayList<TLRPC.TL_quickReply> arrayList3 = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            t1 t1Var4 = this.f17521b;
                            ArrayList arrayList4 = t1Var4.f17548b;
                            ArrayList arrayList5 = new ArrayList(arrayList4);
                            arrayList4.clear();
                            for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                                TLRPC.TL_quickReply tL_quickReply2 = arrayList3.get(i16);
                                int i17 = 0;
                                while (true) {
                                    if (i17 < arrayList5.size()) {
                                        if (((s1) arrayList5.get(i17)).f17532a == tL_quickReply2.shortcut_id) {
                                            s1Var = (s1) arrayList5.get(i17);
                                        } else {
                                            i17++;
                                        }
                                    } else {
                                        s1Var = null;
                                    }
                                }
                                if (s1Var == null) {
                                    s1Var = new s1();
                                }
                                s1Var.f17532a = tL_quickReply2.shortcut_id;
                                s1Var.f17533b = tL_quickReply2.shortcut;
                                s1Var.f17536f = tL_quickReply2.count;
                                s1Var.f17534c = i16;
                                s1Var.d = tL_quickReply2.top_message;
                                ij ijVar3 = s1Var.f17535e;
                                if (ijVar3 != null && ijVar3.e1() != tL_quickReply2.top_message) {
                                    s1Var.f17535e = null;
                                }
                                arrayList4.add(s1Var);
                                t1Var4.a(s1Var.f17533b);
                            }
                            t1Var4.l();
                            qs.f(t1Var4.f17547a).k(121, new Object[0]);
                            return;
                    }
                }
            });
            return true;
        } else {
            return false;
        }
    }

    public final void k(int i7, String str) {
        s1 c10 = c(i7);
        if (c10 == null) {
            return;
        }
        c10.f17533b = str;
        TLRPC.TL_messages_editQuickReplyShortcut tL_messages_editQuickReplyShortcut = new TLRPC.TL_messages_editQuickReplyShortcut();
        tL_messages_editQuickReplyShortcut.shortcut_id = i7;
        tL_messages_editQuickReplyShortcut.shortcut = str;
        int i10 = this.f17547a;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_editQuickReplyShortcut, new v5(7));
        l();
        qs.f(i10).k(qs.F1, new Object[0]);
    }

    public final void l() {
        yr a02 = yr.a0(this.f17547a);
        a02.f26719a.c(new ha.b(22, this, a02));
    }
}
