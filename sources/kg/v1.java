package kg;

import android.text.TextUtils;
import di.j2;
import fi.l5;
import java.util.ArrayList;
import org.telegram.messenger.gj;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.ur;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
public final class v1 {
    public static volatile v1[] f18543g = new v1[4];
    public static final Object[] h = new Object[4];
    public final int f18544a;
    public final ArrayList f18545b = new ArrayList();
    public final ArrayList f18546c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public boolean f18547e;
    public boolean f18548f;

    static {
        for (int i7 = 0; i7 < 4; i7++) {
            h[i7] = new Object();
        }
    }

    public v1(int i7) {
        this.f18544a = i7;
    }

    public static v1 f(int i7) {
        v1 v1Var;
        v1 v1Var2 = f18543g[i7];
        if (v1Var2 == null) {
            synchronized (h[i7]) {
                try {
                    v1Var = f18543g[i7];
                    if (v1Var == null) {
                        v1[] v1VarArr = f18543g;
                        v1 v1Var3 = new v1(i7);
                        v1VarArr[i7] = v1Var3;
                        v1Var = v1Var3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return v1Var;
        }
        return v1Var2;
    }

    public static boolean g(String str) {
        if (!"hello".equalsIgnoreCase(str) && !"away".equalsIgnoreCase(str)) {
            return false;
        }
        return true;
    }

    public final void a(String str) {
        u1 u1Var;
        ArrayList arrayList = this.f18546c;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                u1Var = (u1) obj;
                if (TextUtils.equals(str, u1Var.f18534b)) {
                    break;
                }
            } else {
                u1Var = null;
                break;
            }
        }
        if (u1Var != null) {
            arrayList.remove(u1Var);
            ls.f(this.f18544a).k(ls.F1, new Object[0]);
        }
    }

    public final void b(Runnable runnable) {
        if (this.f18548f) {
            runnable.run();
        } else {
            i(runnable, true);
        }
    }

    public final u1 c(long j3) {
        ArrayList arrayList = this.f18545b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            u1 u1Var = (u1) obj;
            if (u1Var.f18533a == j3) {
                return u1Var;
            }
        }
        return null;
    }

    public final u1 d(String str) {
        ArrayList arrayList = this.f18545b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            u1 u1Var = (u1) obj;
            if (TextUtils.equals(str, u1Var.f18534b)) {
                return u1Var;
            }
        }
        return null;
    }

    public final ArrayList e() {
        ArrayList arrayList = this.d;
        arrayList.clear();
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.f18545b;
            if (i7 < arrayList2.size()) {
                if (!g(((u1) arrayList2.get(i7)).f18534b)) {
                    arrayList.add((u1) arrayList2.get(i7));
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
        throw new UnsupportedOperationException("Method not decompiled: kg.v1.i(java.lang.Runnable, boolean):void");
    }

    public final boolean j(final TLRPC.Update update, String str, int i7) {
        if (update instanceof TL_update.TL_updateQuickReplyMessage) {
            b(new ai.b1(this, ((TL_update.TL_updateQuickReplyMessage) update).message, str, i7, 9));
            return true;
        } else if (update instanceof TL_update.TL_updateQuickReplies) {
            b(new Runnable(this) {
                public final v1 f18521b;

                {
                    this.f18521b = this;
                }

                @Override
                public final void run() {
                    int i10;
                    u1 u1Var;
                    switch (r3) {
                        case 0:
                            v1 v1Var = this.f18521b;
                            ArrayList arrayList = v1Var.f18545b;
                            int i11 = v1Var.f18544a;
                            TLRPC.TL_quickReply tL_quickReply = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            u1 c10 = v1Var.c(tL_quickReply.shortcut_id);
                            if (c10 != null) {
                                c10.f18534b = tL_quickReply.shortcut;
                                c10.f18537f = tL_quickReply.count;
                                c10.d = tL_quickReply.top_message;
                                gj gjVar = c10.f18536e;
                                if (gjVar != null && gjVar.e1() != tL_quickReply.top_message) {
                                    c10.f18536e = null;
                                    long e10 = k10.i(i11).e();
                                    ur a02 = ur.a0(i11);
                                    a02.f27250a.c(new j2(v1Var, a02, c10, e10, 13));
                                    return;
                                }
                            } else {
                                u1 u1Var2 = new u1();
                                u1Var2.f18533a = tL_quickReply.shortcut_id;
                                u1Var2.f18534b = tL_quickReply.shortcut;
                                u1Var2.f18537f = tL_quickReply.count;
                                u1Var2.d = tL_quickReply.top_message;
                                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                    ((u1) arrayList.get(i12)).f18535c = i12;
                                }
                                arrayList.add(u1Var2);
                                v1Var.a(u1Var2.f18534b);
                            }
                            v1Var.l();
                            ls.f(i11).k(121, new Object[0]);
                            return;
                        case 1:
                            v1 v1Var2 = this.f18521b;
                            int i13 = v1Var2.f18544a;
                            u1 c11 = v1Var2.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c11 != null) {
                                v1Var2.f18545b.remove(c11);
                                v1Var2.a(c11.f18534b);
                                int i14 = c11.f18533a;
                                ur a03 = ur.a0(i13);
                                a03.f27250a.c(new ai.c1(a03, i14, 16));
                                v1Var2.l();
                                ls.f(i13).k(121, new Object[0]);
                                return;
                            }
                            return;
                        case 2:
                            v1 v1Var3 = this.f18521b;
                            int i15 = v1Var3.f18544a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            u1 c12 = v1Var3.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c12 != null) {
                                int size = c12.f18537f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c12.f18537f = size;
                                if (size <= 0) {
                                    v1Var3.f18545b.remove(c12);
                                }
                                ArrayList<Integer> arrayList2 = tL_updateDeleteQuickReplyMessages.messages;
                                gj gjVar2 = c12.f18536e;
                                if (gjVar2 != null) {
                                    i10 = gjVar2.e1();
                                } else {
                                    i10 = c12.d;
                                }
                                if (!arrayList2.contains(Integer.valueOf(i10)) && c12.f18536e != null) {
                                    v1Var3.l();
                                    ls.f(i15).k(121, new Object[0]);
                                    return;
                                }
                                c12.f18536e = null;
                                long e11 = k10.i(i15).e();
                                ur a04 = ur.a0(i15);
                                a04.f27250a.c(new j2(v1Var3, a04, c12, e11, 13));
                                return;
                            }
                            return;
                        default:
                            ArrayList<TLRPC.TL_quickReply> arrayList3 = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            v1 v1Var4 = this.f18521b;
                            ArrayList arrayList4 = v1Var4.f18545b;
                            ArrayList arrayList5 = new ArrayList(arrayList4);
                            arrayList4.clear();
                            for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                                TLRPC.TL_quickReply tL_quickReply2 = arrayList3.get(i16);
                                int i17 = 0;
                                while (true) {
                                    if (i17 < arrayList5.size()) {
                                        if (((u1) arrayList5.get(i17)).f18533a == tL_quickReply2.shortcut_id) {
                                            u1Var = (u1) arrayList5.get(i17);
                                        } else {
                                            i17++;
                                        }
                                    } else {
                                        u1Var = null;
                                    }
                                }
                                if (u1Var == null) {
                                    u1Var = new u1();
                                }
                                u1Var.f18533a = tL_quickReply2.shortcut_id;
                                u1Var.f18534b = tL_quickReply2.shortcut;
                                u1Var.f18537f = tL_quickReply2.count;
                                u1Var.f18535c = i16;
                                u1Var.d = tL_quickReply2.top_message;
                                gj gjVar3 = u1Var.f18536e;
                                if (gjVar3 != null && gjVar3.e1() != tL_quickReply2.top_message) {
                                    u1Var.f18536e = null;
                                }
                                arrayList4.add(u1Var);
                                v1Var4.a(u1Var.f18534b);
                            }
                            v1Var4.l();
                            ls.f(v1Var4.f18544a).k(121, new Object[0]);
                            return;
                    }
                }
            });
            return true;
        } else if (update instanceof TL_update.TL_updateNewQuickReply) {
            b(new Runnable(this) {
                public final v1 f18521b;

                {
                    this.f18521b = this;
                }

                @Override
                public final void run() {
                    int i10;
                    u1 u1Var;
                    switch (r3) {
                        case 0:
                            v1 v1Var = this.f18521b;
                            ArrayList arrayList = v1Var.f18545b;
                            int i11 = v1Var.f18544a;
                            TLRPC.TL_quickReply tL_quickReply = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            u1 c10 = v1Var.c(tL_quickReply.shortcut_id);
                            if (c10 != null) {
                                c10.f18534b = tL_quickReply.shortcut;
                                c10.f18537f = tL_quickReply.count;
                                c10.d = tL_quickReply.top_message;
                                gj gjVar = c10.f18536e;
                                if (gjVar != null && gjVar.e1() != tL_quickReply.top_message) {
                                    c10.f18536e = null;
                                    long e10 = k10.i(i11).e();
                                    ur a02 = ur.a0(i11);
                                    a02.f27250a.c(new j2(v1Var, a02, c10, e10, 13));
                                    return;
                                }
                            } else {
                                u1 u1Var2 = new u1();
                                u1Var2.f18533a = tL_quickReply.shortcut_id;
                                u1Var2.f18534b = tL_quickReply.shortcut;
                                u1Var2.f18537f = tL_quickReply.count;
                                u1Var2.d = tL_quickReply.top_message;
                                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                    ((u1) arrayList.get(i12)).f18535c = i12;
                                }
                                arrayList.add(u1Var2);
                                v1Var.a(u1Var2.f18534b);
                            }
                            v1Var.l();
                            ls.f(i11).k(121, new Object[0]);
                            return;
                        case 1:
                            v1 v1Var2 = this.f18521b;
                            int i13 = v1Var2.f18544a;
                            u1 c11 = v1Var2.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c11 != null) {
                                v1Var2.f18545b.remove(c11);
                                v1Var2.a(c11.f18534b);
                                int i14 = c11.f18533a;
                                ur a03 = ur.a0(i13);
                                a03.f27250a.c(new ai.c1(a03, i14, 16));
                                v1Var2.l();
                                ls.f(i13).k(121, new Object[0]);
                                return;
                            }
                            return;
                        case 2:
                            v1 v1Var3 = this.f18521b;
                            int i15 = v1Var3.f18544a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            u1 c12 = v1Var3.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c12 != null) {
                                int size = c12.f18537f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c12.f18537f = size;
                                if (size <= 0) {
                                    v1Var3.f18545b.remove(c12);
                                }
                                ArrayList<Integer> arrayList2 = tL_updateDeleteQuickReplyMessages.messages;
                                gj gjVar2 = c12.f18536e;
                                if (gjVar2 != null) {
                                    i10 = gjVar2.e1();
                                } else {
                                    i10 = c12.d;
                                }
                                if (!arrayList2.contains(Integer.valueOf(i10)) && c12.f18536e != null) {
                                    v1Var3.l();
                                    ls.f(i15).k(121, new Object[0]);
                                    return;
                                }
                                c12.f18536e = null;
                                long e11 = k10.i(i15).e();
                                ur a04 = ur.a0(i15);
                                a04.f27250a.c(new j2(v1Var3, a04, c12, e11, 13));
                                return;
                            }
                            return;
                        default:
                            ArrayList<TLRPC.TL_quickReply> arrayList3 = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            v1 v1Var4 = this.f18521b;
                            ArrayList arrayList4 = v1Var4.f18545b;
                            ArrayList arrayList5 = new ArrayList(arrayList4);
                            arrayList4.clear();
                            for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                                TLRPC.TL_quickReply tL_quickReply2 = arrayList3.get(i16);
                                int i17 = 0;
                                while (true) {
                                    if (i17 < arrayList5.size()) {
                                        if (((u1) arrayList5.get(i17)).f18533a == tL_quickReply2.shortcut_id) {
                                            u1Var = (u1) arrayList5.get(i17);
                                        } else {
                                            i17++;
                                        }
                                    } else {
                                        u1Var = null;
                                    }
                                }
                                if (u1Var == null) {
                                    u1Var = new u1();
                                }
                                u1Var.f18533a = tL_quickReply2.shortcut_id;
                                u1Var.f18534b = tL_quickReply2.shortcut;
                                u1Var.f18537f = tL_quickReply2.count;
                                u1Var.f18535c = i16;
                                u1Var.d = tL_quickReply2.top_message;
                                gj gjVar3 = u1Var.f18536e;
                                if (gjVar3 != null && gjVar3.e1() != tL_quickReply2.top_message) {
                                    u1Var.f18536e = null;
                                }
                                arrayList4.add(u1Var);
                                v1Var4.a(u1Var.f18534b);
                            }
                            v1Var4.l();
                            ls.f(v1Var4.f18544a).k(121, new Object[0]);
                            return;
                    }
                }
            });
            return true;
        } else if (update instanceof TL_update.TL_updateDeleteQuickReply) {
            b(new Runnable(this) {
                public final v1 f18521b;

                {
                    this.f18521b = this;
                }

                @Override
                public final void run() {
                    int i10;
                    u1 u1Var;
                    switch (r3) {
                        case 0:
                            v1 v1Var = this.f18521b;
                            ArrayList arrayList = v1Var.f18545b;
                            int i11 = v1Var.f18544a;
                            TLRPC.TL_quickReply tL_quickReply = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            u1 c10 = v1Var.c(tL_quickReply.shortcut_id);
                            if (c10 != null) {
                                c10.f18534b = tL_quickReply.shortcut;
                                c10.f18537f = tL_quickReply.count;
                                c10.d = tL_quickReply.top_message;
                                gj gjVar = c10.f18536e;
                                if (gjVar != null && gjVar.e1() != tL_quickReply.top_message) {
                                    c10.f18536e = null;
                                    long e10 = k10.i(i11).e();
                                    ur a02 = ur.a0(i11);
                                    a02.f27250a.c(new j2(v1Var, a02, c10, e10, 13));
                                    return;
                                }
                            } else {
                                u1 u1Var2 = new u1();
                                u1Var2.f18533a = tL_quickReply.shortcut_id;
                                u1Var2.f18534b = tL_quickReply.shortcut;
                                u1Var2.f18537f = tL_quickReply.count;
                                u1Var2.d = tL_quickReply.top_message;
                                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                    ((u1) arrayList.get(i12)).f18535c = i12;
                                }
                                arrayList.add(u1Var2);
                                v1Var.a(u1Var2.f18534b);
                            }
                            v1Var.l();
                            ls.f(i11).k(121, new Object[0]);
                            return;
                        case 1:
                            v1 v1Var2 = this.f18521b;
                            int i13 = v1Var2.f18544a;
                            u1 c11 = v1Var2.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c11 != null) {
                                v1Var2.f18545b.remove(c11);
                                v1Var2.a(c11.f18534b);
                                int i14 = c11.f18533a;
                                ur a03 = ur.a0(i13);
                                a03.f27250a.c(new ai.c1(a03, i14, 16));
                                v1Var2.l();
                                ls.f(i13).k(121, new Object[0]);
                                return;
                            }
                            return;
                        case 2:
                            v1 v1Var3 = this.f18521b;
                            int i15 = v1Var3.f18544a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            u1 c12 = v1Var3.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c12 != null) {
                                int size = c12.f18537f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c12.f18537f = size;
                                if (size <= 0) {
                                    v1Var3.f18545b.remove(c12);
                                }
                                ArrayList<Integer> arrayList2 = tL_updateDeleteQuickReplyMessages.messages;
                                gj gjVar2 = c12.f18536e;
                                if (gjVar2 != null) {
                                    i10 = gjVar2.e1();
                                } else {
                                    i10 = c12.d;
                                }
                                if (!arrayList2.contains(Integer.valueOf(i10)) && c12.f18536e != null) {
                                    v1Var3.l();
                                    ls.f(i15).k(121, new Object[0]);
                                    return;
                                }
                                c12.f18536e = null;
                                long e11 = k10.i(i15).e();
                                ur a04 = ur.a0(i15);
                                a04.f27250a.c(new j2(v1Var3, a04, c12, e11, 13));
                                return;
                            }
                            return;
                        default:
                            ArrayList<TLRPC.TL_quickReply> arrayList3 = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            v1 v1Var4 = this.f18521b;
                            ArrayList arrayList4 = v1Var4.f18545b;
                            ArrayList arrayList5 = new ArrayList(arrayList4);
                            arrayList4.clear();
                            for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                                TLRPC.TL_quickReply tL_quickReply2 = arrayList3.get(i16);
                                int i17 = 0;
                                while (true) {
                                    if (i17 < arrayList5.size()) {
                                        if (((u1) arrayList5.get(i17)).f18533a == tL_quickReply2.shortcut_id) {
                                            u1Var = (u1) arrayList5.get(i17);
                                        } else {
                                            i17++;
                                        }
                                    } else {
                                        u1Var = null;
                                    }
                                }
                                if (u1Var == null) {
                                    u1Var = new u1();
                                }
                                u1Var.f18533a = tL_quickReply2.shortcut_id;
                                u1Var.f18534b = tL_quickReply2.shortcut;
                                u1Var.f18537f = tL_quickReply2.count;
                                u1Var.f18535c = i16;
                                u1Var.d = tL_quickReply2.top_message;
                                gj gjVar3 = u1Var.f18536e;
                                if (gjVar3 != null && gjVar3.e1() != tL_quickReply2.top_message) {
                                    u1Var.f18536e = null;
                                }
                                arrayList4.add(u1Var);
                                v1Var4.a(u1Var.f18534b);
                            }
                            v1Var4.l();
                            ls.f(v1Var4.f18544a).k(121, new Object[0]);
                            return;
                    }
                }
            });
            return true;
        } else if (update instanceof TL_update.TL_updateDeleteQuickReplyMessages) {
            b(new Runnable(this) {
                public final v1 f18521b;

                {
                    this.f18521b = this;
                }

                @Override
                public final void run() {
                    int i10;
                    u1 u1Var;
                    switch (r3) {
                        case 0:
                            v1 v1Var = this.f18521b;
                            ArrayList arrayList = v1Var.f18545b;
                            int i11 = v1Var.f18544a;
                            TLRPC.TL_quickReply tL_quickReply = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            u1 c10 = v1Var.c(tL_quickReply.shortcut_id);
                            if (c10 != null) {
                                c10.f18534b = tL_quickReply.shortcut;
                                c10.f18537f = tL_quickReply.count;
                                c10.d = tL_quickReply.top_message;
                                gj gjVar = c10.f18536e;
                                if (gjVar != null && gjVar.e1() != tL_quickReply.top_message) {
                                    c10.f18536e = null;
                                    long e10 = k10.i(i11).e();
                                    ur a02 = ur.a0(i11);
                                    a02.f27250a.c(new j2(v1Var, a02, c10, e10, 13));
                                    return;
                                }
                            } else {
                                u1 u1Var2 = new u1();
                                u1Var2.f18533a = tL_quickReply.shortcut_id;
                                u1Var2.f18534b = tL_quickReply.shortcut;
                                u1Var2.f18537f = tL_quickReply.count;
                                u1Var2.d = tL_quickReply.top_message;
                                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                    ((u1) arrayList.get(i12)).f18535c = i12;
                                }
                                arrayList.add(u1Var2);
                                v1Var.a(u1Var2.f18534b);
                            }
                            v1Var.l();
                            ls.f(i11).k(121, new Object[0]);
                            return;
                        case 1:
                            v1 v1Var2 = this.f18521b;
                            int i13 = v1Var2.f18544a;
                            u1 c11 = v1Var2.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c11 != null) {
                                v1Var2.f18545b.remove(c11);
                                v1Var2.a(c11.f18534b);
                                int i14 = c11.f18533a;
                                ur a03 = ur.a0(i13);
                                a03.f27250a.c(new ai.c1(a03, i14, 16));
                                v1Var2.l();
                                ls.f(i13).k(121, new Object[0]);
                                return;
                            }
                            return;
                        case 2:
                            v1 v1Var3 = this.f18521b;
                            int i15 = v1Var3.f18544a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            u1 c12 = v1Var3.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c12 != null) {
                                int size = c12.f18537f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c12.f18537f = size;
                                if (size <= 0) {
                                    v1Var3.f18545b.remove(c12);
                                }
                                ArrayList<Integer> arrayList2 = tL_updateDeleteQuickReplyMessages.messages;
                                gj gjVar2 = c12.f18536e;
                                if (gjVar2 != null) {
                                    i10 = gjVar2.e1();
                                } else {
                                    i10 = c12.d;
                                }
                                if (!arrayList2.contains(Integer.valueOf(i10)) && c12.f18536e != null) {
                                    v1Var3.l();
                                    ls.f(i15).k(121, new Object[0]);
                                    return;
                                }
                                c12.f18536e = null;
                                long e11 = k10.i(i15).e();
                                ur a04 = ur.a0(i15);
                                a04.f27250a.c(new j2(v1Var3, a04, c12, e11, 13));
                                return;
                            }
                            return;
                        default:
                            ArrayList<TLRPC.TL_quickReply> arrayList3 = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            v1 v1Var4 = this.f18521b;
                            ArrayList arrayList4 = v1Var4.f18545b;
                            ArrayList arrayList5 = new ArrayList(arrayList4);
                            arrayList4.clear();
                            for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                                TLRPC.TL_quickReply tL_quickReply2 = arrayList3.get(i16);
                                int i17 = 0;
                                while (true) {
                                    if (i17 < arrayList5.size()) {
                                        if (((u1) arrayList5.get(i17)).f18533a == tL_quickReply2.shortcut_id) {
                                            u1Var = (u1) arrayList5.get(i17);
                                        } else {
                                            i17++;
                                        }
                                    } else {
                                        u1Var = null;
                                    }
                                }
                                if (u1Var == null) {
                                    u1Var = new u1();
                                }
                                u1Var.f18533a = tL_quickReply2.shortcut_id;
                                u1Var.f18534b = tL_quickReply2.shortcut;
                                u1Var.f18537f = tL_quickReply2.count;
                                u1Var.f18535c = i16;
                                u1Var.d = tL_quickReply2.top_message;
                                gj gjVar3 = u1Var.f18536e;
                                if (gjVar3 != null && gjVar3.e1() != tL_quickReply2.top_message) {
                                    u1Var.f18536e = null;
                                }
                                arrayList4.add(u1Var);
                                v1Var4.a(u1Var.f18534b);
                            }
                            v1Var4.l();
                            ls.f(v1Var4.f18544a).k(121, new Object[0]);
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
        u1 c10 = c(i7);
        if (c10 == null) {
            return;
        }
        c10.f18534b = str;
        TLRPC.TL_messages_editQuickReplyShortcut tL_messages_editQuickReplyShortcut = new TLRPC.TL_messages_editQuickReplyShortcut();
        tL_messages_editQuickReplyShortcut.shortcut_id = i7;
        tL_messages_editQuickReplyShortcut.shortcut = str;
        int i10 = this.f18544a;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_editQuickReplyShortcut, new l5(7));
        l();
        ls.f(i10).k(ls.F1, new Object[0]);
    }

    public final void l() {
        ur a02 = ur.a0(this.f18544a);
        a02.f27250a.c(new ji.i(7, this, a02));
    }
}
