package kg;

import android.text.TextUtils;
import di.i2;
import fi.k5;
import java.util.ArrayList;
import org.telegram.messenger.gj;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.ur;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
public final class w1 {
    public static volatile w1[] f18517g = new w1[4];
    public static final Object[] h = new Object[4];
    public final int f18518a;
    public final ArrayList f18519b = new ArrayList();
    public final ArrayList f18520c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public boolean f18521e;
    public boolean f18522f;

    static {
        for (int i7 = 0; i7 < 4; i7++) {
            h[i7] = new Object();
        }
    }

    public w1(int i7) {
        this.f18518a = i7;
    }

    public static w1 f(int i7) {
        w1 w1Var;
        w1 w1Var2 = f18517g[i7];
        if (w1Var2 == null) {
            synchronized (h[i7]) {
                try {
                    w1Var = f18517g[i7];
                    if (w1Var == null) {
                        w1[] w1VarArr = f18517g;
                        w1 w1Var3 = new w1(i7);
                        w1VarArr[i7] = w1Var3;
                        w1Var = w1Var3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return w1Var;
        }
        return w1Var2;
    }

    public static boolean g(String str) {
        if (!"hello".equalsIgnoreCase(str) && !"away".equalsIgnoreCase(str)) {
            return false;
        }
        return true;
    }

    public final void a(String str) {
        v1 v1Var;
        ArrayList arrayList = this.f18520c;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                v1Var = (v1) obj;
                if (TextUtils.equals(str, v1Var.f18506b)) {
                    break;
                }
            } else {
                v1Var = null;
                break;
            }
        }
        if (v1Var != null) {
            arrayList.remove(v1Var);
            ls.f(this.f18518a).k(ls.F1, new Object[0]);
        }
    }

    public final void b(Runnable runnable) {
        if (this.f18522f) {
            runnable.run();
        } else {
            i(runnable, true);
        }
    }

    public final v1 c(long j3) {
        ArrayList arrayList = this.f18519b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            v1 v1Var = (v1) obj;
            if (v1Var.f18505a == j3) {
                return v1Var;
            }
        }
        return null;
    }

    public final v1 d(String str) {
        ArrayList arrayList = this.f18519b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            v1 v1Var = (v1) obj;
            if (TextUtils.equals(str, v1Var.f18506b)) {
                return v1Var;
            }
        }
        return null;
    }

    public final ArrayList e() {
        ArrayList arrayList = this.d;
        arrayList.clear();
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.f18519b;
            if (i7 < arrayList2.size()) {
                if (!g(((v1) arrayList2.get(i7)).f18506b)) {
                    arrayList.add((v1) arrayList2.get(i7));
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
        throw new UnsupportedOperationException("Method not decompiled: kg.w1.i(java.lang.Runnable, boolean):void");
    }

    public final boolean j(final TLRPC.Update update, String str, int i7) {
        if (update instanceof TL_update.TL_updateQuickReplyMessage) {
            b(new ai.w0(this, ((TL_update.TL_updateQuickReplyMessage) update).message, str, i7, 9));
            return true;
        } else if (update instanceof TL_update.TL_updateQuickReplies) {
            b(new Runnable(this) {
                public final w1 f18493b;

                {
                    this.f18493b = this;
                }

                @Override
                public final void run() {
                    int i10;
                    v1 v1Var;
                    switch (r3) {
                        case 0:
                            w1 w1Var = this.f18493b;
                            ArrayList arrayList = w1Var.f18519b;
                            int i11 = w1Var.f18518a;
                            TLRPC.TL_quickReply tL_quickReply = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            v1 c10 = w1Var.c(tL_quickReply.shortcut_id);
                            if (c10 != null) {
                                c10.f18506b = tL_quickReply.shortcut;
                                c10.f18509f = tL_quickReply.count;
                                c10.d = tL_quickReply.top_message;
                                gj gjVar = c10.f18508e;
                                if (gjVar != null && gjVar.e1() != tL_quickReply.top_message) {
                                    c10.f18508e = null;
                                    long e10 = k10.i(i11).e();
                                    ur a02 = ur.a0(i11);
                                    a02.f27214a.c(new i2(w1Var, a02, c10, e10, 13));
                                    return;
                                }
                            } else {
                                v1 v1Var2 = new v1();
                                v1Var2.f18505a = tL_quickReply.shortcut_id;
                                v1Var2.f18506b = tL_quickReply.shortcut;
                                v1Var2.f18509f = tL_quickReply.count;
                                v1Var2.d = tL_quickReply.top_message;
                                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                    ((v1) arrayList.get(i12)).f18507c = i12;
                                }
                                arrayList.add(v1Var2);
                                w1Var.a(v1Var2.f18506b);
                            }
                            w1Var.l();
                            ls.f(i11).k(121, new Object[0]);
                            return;
                        case 1:
                            w1 w1Var2 = this.f18493b;
                            int i13 = w1Var2.f18518a;
                            v1 c11 = w1Var2.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c11 != null) {
                                w1Var2.f18519b.remove(c11);
                                w1Var2.a(c11.f18506b);
                                int i14 = c11.f18505a;
                                ur a03 = ur.a0(i13);
                                a03.f27214a.c(new ai.t0(a03, i14, 18));
                                w1Var2.l();
                                ls.f(i13).k(121, new Object[0]);
                                return;
                            }
                            return;
                        case 2:
                            w1 w1Var3 = this.f18493b;
                            int i15 = w1Var3.f18518a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            v1 c12 = w1Var3.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c12 != null) {
                                int size = c12.f18509f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c12.f18509f = size;
                                if (size <= 0) {
                                    w1Var3.f18519b.remove(c12);
                                }
                                ArrayList<Integer> arrayList2 = tL_updateDeleteQuickReplyMessages.messages;
                                gj gjVar2 = c12.f18508e;
                                if (gjVar2 != null) {
                                    i10 = gjVar2.e1();
                                } else {
                                    i10 = c12.d;
                                }
                                if (!arrayList2.contains(Integer.valueOf(i10)) && c12.f18508e != null) {
                                    w1Var3.l();
                                    ls.f(i15).k(121, new Object[0]);
                                    return;
                                }
                                c12.f18508e = null;
                                long e11 = k10.i(i15).e();
                                ur a04 = ur.a0(i15);
                                a04.f27214a.c(new i2(w1Var3, a04, c12, e11, 13));
                                return;
                            }
                            return;
                        default:
                            ArrayList<TLRPC.TL_quickReply> arrayList3 = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            w1 w1Var4 = this.f18493b;
                            ArrayList arrayList4 = w1Var4.f18519b;
                            ArrayList arrayList5 = new ArrayList(arrayList4);
                            arrayList4.clear();
                            for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                                TLRPC.TL_quickReply tL_quickReply2 = arrayList3.get(i16);
                                int i17 = 0;
                                while (true) {
                                    if (i17 < arrayList5.size()) {
                                        if (((v1) arrayList5.get(i17)).f18505a == tL_quickReply2.shortcut_id) {
                                            v1Var = (v1) arrayList5.get(i17);
                                        } else {
                                            i17++;
                                        }
                                    } else {
                                        v1Var = null;
                                    }
                                }
                                if (v1Var == null) {
                                    v1Var = new v1();
                                }
                                v1Var.f18505a = tL_quickReply2.shortcut_id;
                                v1Var.f18506b = tL_quickReply2.shortcut;
                                v1Var.f18509f = tL_quickReply2.count;
                                v1Var.f18507c = i16;
                                v1Var.d = tL_quickReply2.top_message;
                                gj gjVar3 = v1Var.f18508e;
                                if (gjVar3 != null && gjVar3.e1() != tL_quickReply2.top_message) {
                                    v1Var.f18508e = null;
                                }
                                arrayList4.add(v1Var);
                                w1Var4.a(v1Var.f18506b);
                            }
                            w1Var4.l();
                            ls.f(w1Var4.f18518a).k(121, new Object[0]);
                            return;
                    }
                }
            });
            return true;
        } else if (update instanceof TL_update.TL_updateNewQuickReply) {
            b(new Runnable(this) {
                public final w1 f18493b;

                {
                    this.f18493b = this;
                }

                @Override
                public final void run() {
                    int i10;
                    v1 v1Var;
                    switch (r3) {
                        case 0:
                            w1 w1Var = this.f18493b;
                            ArrayList arrayList = w1Var.f18519b;
                            int i11 = w1Var.f18518a;
                            TLRPC.TL_quickReply tL_quickReply = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            v1 c10 = w1Var.c(tL_quickReply.shortcut_id);
                            if (c10 != null) {
                                c10.f18506b = tL_quickReply.shortcut;
                                c10.f18509f = tL_quickReply.count;
                                c10.d = tL_quickReply.top_message;
                                gj gjVar = c10.f18508e;
                                if (gjVar != null && gjVar.e1() != tL_quickReply.top_message) {
                                    c10.f18508e = null;
                                    long e10 = k10.i(i11).e();
                                    ur a02 = ur.a0(i11);
                                    a02.f27214a.c(new i2(w1Var, a02, c10, e10, 13));
                                    return;
                                }
                            } else {
                                v1 v1Var2 = new v1();
                                v1Var2.f18505a = tL_quickReply.shortcut_id;
                                v1Var2.f18506b = tL_quickReply.shortcut;
                                v1Var2.f18509f = tL_quickReply.count;
                                v1Var2.d = tL_quickReply.top_message;
                                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                    ((v1) arrayList.get(i12)).f18507c = i12;
                                }
                                arrayList.add(v1Var2);
                                w1Var.a(v1Var2.f18506b);
                            }
                            w1Var.l();
                            ls.f(i11).k(121, new Object[0]);
                            return;
                        case 1:
                            w1 w1Var2 = this.f18493b;
                            int i13 = w1Var2.f18518a;
                            v1 c11 = w1Var2.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c11 != null) {
                                w1Var2.f18519b.remove(c11);
                                w1Var2.a(c11.f18506b);
                                int i14 = c11.f18505a;
                                ur a03 = ur.a0(i13);
                                a03.f27214a.c(new ai.t0(a03, i14, 18));
                                w1Var2.l();
                                ls.f(i13).k(121, new Object[0]);
                                return;
                            }
                            return;
                        case 2:
                            w1 w1Var3 = this.f18493b;
                            int i15 = w1Var3.f18518a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            v1 c12 = w1Var3.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c12 != null) {
                                int size = c12.f18509f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c12.f18509f = size;
                                if (size <= 0) {
                                    w1Var3.f18519b.remove(c12);
                                }
                                ArrayList<Integer> arrayList2 = tL_updateDeleteQuickReplyMessages.messages;
                                gj gjVar2 = c12.f18508e;
                                if (gjVar2 != null) {
                                    i10 = gjVar2.e1();
                                } else {
                                    i10 = c12.d;
                                }
                                if (!arrayList2.contains(Integer.valueOf(i10)) && c12.f18508e != null) {
                                    w1Var3.l();
                                    ls.f(i15).k(121, new Object[0]);
                                    return;
                                }
                                c12.f18508e = null;
                                long e11 = k10.i(i15).e();
                                ur a04 = ur.a0(i15);
                                a04.f27214a.c(new i2(w1Var3, a04, c12, e11, 13));
                                return;
                            }
                            return;
                        default:
                            ArrayList<TLRPC.TL_quickReply> arrayList3 = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            w1 w1Var4 = this.f18493b;
                            ArrayList arrayList4 = w1Var4.f18519b;
                            ArrayList arrayList5 = new ArrayList(arrayList4);
                            arrayList4.clear();
                            for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                                TLRPC.TL_quickReply tL_quickReply2 = arrayList3.get(i16);
                                int i17 = 0;
                                while (true) {
                                    if (i17 < arrayList5.size()) {
                                        if (((v1) arrayList5.get(i17)).f18505a == tL_quickReply2.shortcut_id) {
                                            v1Var = (v1) arrayList5.get(i17);
                                        } else {
                                            i17++;
                                        }
                                    } else {
                                        v1Var = null;
                                    }
                                }
                                if (v1Var == null) {
                                    v1Var = new v1();
                                }
                                v1Var.f18505a = tL_quickReply2.shortcut_id;
                                v1Var.f18506b = tL_quickReply2.shortcut;
                                v1Var.f18509f = tL_quickReply2.count;
                                v1Var.f18507c = i16;
                                v1Var.d = tL_quickReply2.top_message;
                                gj gjVar3 = v1Var.f18508e;
                                if (gjVar3 != null && gjVar3.e1() != tL_quickReply2.top_message) {
                                    v1Var.f18508e = null;
                                }
                                arrayList4.add(v1Var);
                                w1Var4.a(v1Var.f18506b);
                            }
                            w1Var4.l();
                            ls.f(w1Var4.f18518a).k(121, new Object[0]);
                            return;
                    }
                }
            });
            return true;
        } else if (update instanceof TL_update.TL_updateDeleteQuickReply) {
            b(new Runnable(this) {
                public final w1 f18493b;

                {
                    this.f18493b = this;
                }

                @Override
                public final void run() {
                    int i10;
                    v1 v1Var;
                    switch (r3) {
                        case 0:
                            w1 w1Var = this.f18493b;
                            ArrayList arrayList = w1Var.f18519b;
                            int i11 = w1Var.f18518a;
                            TLRPC.TL_quickReply tL_quickReply = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            v1 c10 = w1Var.c(tL_quickReply.shortcut_id);
                            if (c10 != null) {
                                c10.f18506b = tL_quickReply.shortcut;
                                c10.f18509f = tL_quickReply.count;
                                c10.d = tL_quickReply.top_message;
                                gj gjVar = c10.f18508e;
                                if (gjVar != null && gjVar.e1() != tL_quickReply.top_message) {
                                    c10.f18508e = null;
                                    long e10 = k10.i(i11).e();
                                    ur a02 = ur.a0(i11);
                                    a02.f27214a.c(new i2(w1Var, a02, c10, e10, 13));
                                    return;
                                }
                            } else {
                                v1 v1Var2 = new v1();
                                v1Var2.f18505a = tL_quickReply.shortcut_id;
                                v1Var2.f18506b = tL_quickReply.shortcut;
                                v1Var2.f18509f = tL_quickReply.count;
                                v1Var2.d = tL_quickReply.top_message;
                                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                    ((v1) arrayList.get(i12)).f18507c = i12;
                                }
                                arrayList.add(v1Var2);
                                w1Var.a(v1Var2.f18506b);
                            }
                            w1Var.l();
                            ls.f(i11).k(121, new Object[0]);
                            return;
                        case 1:
                            w1 w1Var2 = this.f18493b;
                            int i13 = w1Var2.f18518a;
                            v1 c11 = w1Var2.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c11 != null) {
                                w1Var2.f18519b.remove(c11);
                                w1Var2.a(c11.f18506b);
                                int i14 = c11.f18505a;
                                ur a03 = ur.a0(i13);
                                a03.f27214a.c(new ai.t0(a03, i14, 18));
                                w1Var2.l();
                                ls.f(i13).k(121, new Object[0]);
                                return;
                            }
                            return;
                        case 2:
                            w1 w1Var3 = this.f18493b;
                            int i15 = w1Var3.f18518a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            v1 c12 = w1Var3.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c12 != null) {
                                int size = c12.f18509f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c12.f18509f = size;
                                if (size <= 0) {
                                    w1Var3.f18519b.remove(c12);
                                }
                                ArrayList<Integer> arrayList2 = tL_updateDeleteQuickReplyMessages.messages;
                                gj gjVar2 = c12.f18508e;
                                if (gjVar2 != null) {
                                    i10 = gjVar2.e1();
                                } else {
                                    i10 = c12.d;
                                }
                                if (!arrayList2.contains(Integer.valueOf(i10)) && c12.f18508e != null) {
                                    w1Var3.l();
                                    ls.f(i15).k(121, new Object[0]);
                                    return;
                                }
                                c12.f18508e = null;
                                long e11 = k10.i(i15).e();
                                ur a04 = ur.a0(i15);
                                a04.f27214a.c(new i2(w1Var3, a04, c12, e11, 13));
                                return;
                            }
                            return;
                        default:
                            ArrayList<TLRPC.TL_quickReply> arrayList3 = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            w1 w1Var4 = this.f18493b;
                            ArrayList arrayList4 = w1Var4.f18519b;
                            ArrayList arrayList5 = new ArrayList(arrayList4);
                            arrayList4.clear();
                            for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                                TLRPC.TL_quickReply tL_quickReply2 = arrayList3.get(i16);
                                int i17 = 0;
                                while (true) {
                                    if (i17 < arrayList5.size()) {
                                        if (((v1) arrayList5.get(i17)).f18505a == tL_quickReply2.shortcut_id) {
                                            v1Var = (v1) arrayList5.get(i17);
                                        } else {
                                            i17++;
                                        }
                                    } else {
                                        v1Var = null;
                                    }
                                }
                                if (v1Var == null) {
                                    v1Var = new v1();
                                }
                                v1Var.f18505a = tL_quickReply2.shortcut_id;
                                v1Var.f18506b = tL_quickReply2.shortcut;
                                v1Var.f18509f = tL_quickReply2.count;
                                v1Var.f18507c = i16;
                                v1Var.d = tL_quickReply2.top_message;
                                gj gjVar3 = v1Var.f18508e;
                                if (gjVar3 != null && gjVar3.e1() != tL_quickReply2.top_message) {
                                    v1Var.f18508e = null;
                                }
                                arrayList4.add(v1Var);
                                w1Var4.a(v1Var.f18506b);
                            }
                            w1Var4.l();
                            ls.f(w1Var4.f18518a).k(121, new Object[0]);
                            return;
                    }
                }
            });
            return true;
        } else if (update instanceof TL_update.TL_updateDeleteQuickReplyMessages) {
            b(new Runnable(this) {
                public final w1 f18493b;

                {
                    this.f18493b = this;
                }

                @Override
                public final void run() {
                    int i10;
                    v1 v1Var;
                    switch (r3) {
                        case 0:
                            w1 w1Var = this.f18493b;
                            ArrayList arrayList = w1Var.f18519b;
                            int i11 = w1Var.f18518a;
                            TLRPC.TL_quickReply tL_quickReply = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            v1 c10 = w1Var.c(tL_quickReply.shortcut_id);
                            if (c10 != null) {
                                c10.f18506b = tL_quickReply.shortcut;
                                c10.f18509f = tL_quickReply.count;
                                c10.d = tL_quickReply.top_message;
                                gj gjVar = c10.f18508e;
                                if (gjVar != null && gjVar.e1() != tL_quickReply.top_message) {
                                    c10.f18508e = null;
                                    long e10 = k10.i(i11).e();
                                    ur a02 = ur.a0(i11);
                                    a02.f27214a.c(new i2(w1Var, a02, c10, e10, 13));
                                    return;
                                }
                            } else {
                                v1 v1Var2 = new v1();
                                v1Var2.f18505a = tL_quickReply.shortcut_id;
                                v1Var2.f18506b = tL_quickReply.shortcut;
                                v1Var2.f18509f = tL_quickReply.count;
                                v1Var2.d = tL_quickReply.top_message;
                                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                    ((v1) arrayList.get(i12)).f18507c = i12;
                                }
                                arrayList.add(v1Var2);
                                w1Var.a(v1Var2.f18506b);
                            }
                            w1Var.l();
                            ls.f(i11).k(121, new Object[0]);
                            return;
                        case 1:
                            w1 w1Var2 = this.f18493b;
                            int i13 = w1Var2.f18518a;
                            v1 c11 = w1Var2.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c11 != null) {
                                w1Var2.f18519b.remove(c11);
                                w1Var2.a(c11.f18506b);
                                int i14 = c11.f18505a;
                                ur a03 = ur.a0(i13);
                                a03.f27214a.c(new ai.t0(a03, i14, 18));
                                w1Var2.l();
                                ls.f(i13).k(121, new Object[0]);
                                return;
                            }
                            return;
                        case 2:
                            w1 w1Var3 = this.f18493b;
                            int i15 = w1Var3.f18518a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            v1 c12 = w1Var3.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c12 != null) {
                                int size = c12.f18509f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c12.f18509f = size;
                                if (size <= 0) {
                                    w1Var3.f18519b.remove(c12);
                                }
                                ArrayList<Integer> arrayList2 = tL_updateDeleteQuickReplyMessages.messages;
                                gj gjVar2 = c12.f18508e;
                                if (gjVar2 != null) {
                                    i10 = gjVar2.e1();
                                } else {
                                    i10 = c12.d;
                                }
                                if (!arrayList2.contains(Integer.valueOf(i10)) && c12.f18508e != null) {
                                    w1Var3.l();
                                    ls.f(i15).k(121, new Object[0]);
                                    return;
                                }
                                c12.f18508e = null;
                                long e11 = k10.i(i15).e();
                                ur a04 = ur.a0(i15);
                                a04.f27214a.c(new i2(w1Var3, a04, c12, e11, 13));
                                return;
                            }
                            return;
                        default:
                            ArrayList<TLRPC.TL_quickReply> arrayList3 = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            w1 w1Var4 = this.f18493b;
                            ArrayList arrayList4 = w1Var4.f18519b;
                            ArrayList arrayList5 = new ArrayList(arrayList4);
                            arrayList4.clear();
                            for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                                TLRPC.TL_quickReply tL_quickReply2 = arrayList3.get(i16);
                                int i17 = 0;
                                while (true) {
                                    if (i17 < arrayList5.size()) {
                                        if (((v1) arrayList5.get(i17)).f18505a == tL_quickReply2.shortcut_id) {
                                            v1Var = (v1) arrayList5.get(i17);
                                        } else {
                                            i17++;
                                        }
                                    } else {
                                        v1Var = null;
                                    }
                                }
                                if (v1Var == null) {
                                    v1Var = new v1();
                                }
                                v1Var.f18505a = tL_quickReply2.shortcut_id;
                                v1Var.f18506b = tL_quickReply2.shortcut;
                                v1Var.f18509f = tL_quickReply2.count;
                                v1Var.f18507c = i16;
                                v1Var.d = tL_quickReply2.top_message;
                                gj gjVar3 = v1Var.f18508e;
                                if (gjVar3 != null && gjVar3.e1() != tL_quickReply2.top_message) {
                                    v1Var.f18508e = null;
                                }
                                arrayList4.add(v1Var);
                                w1Var4.a(v1Var.f18506b);
                            }
                            w1Var4.l();
                            ls.f(w1Var4.f18518a).k(121, new Object[0]);
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
        v1 c10 = c(i7);
        if (c10 == null) {
            return;
        }
        c10.f18506b = str;
        TLRPC.TL_messages_editQuickReplyShortcut tL_messages_editQuickReplyShortcut = new TLRPC.TL_messages_editQuickReplyShortcut();
        tL_messages_editQuickReplyShortcut.shortcut_id = i7;
        tL_messages_editQuickReplyShortcut.shortcut = str;
        int i10 = this.f18518a;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_editQuickReplyShortcut, new k5(7));
        l();
        ls.f(i10).k(ls.F1, new Object[0]);
    }

    public final void l() {
        ur a02 = ur.a0(this.f18518a);
        a02.f27214a.c(new i0(5, this, a02));
    }
}
