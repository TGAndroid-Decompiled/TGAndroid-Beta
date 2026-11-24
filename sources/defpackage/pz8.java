package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
public final class pz8 {
    public static volatile pz8[] g = new pz8[4];
    public static final Object[] h = new Object[4];
    public final int a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public boolean e;
    public boolean f;

    static {
        for (int i = 0; i < 4; i++) {
            h[i] = new Object();
        }
    }

    public pz8(int i) {
        this.a = i;
    }

    public static pz8 f(int i) {
        pz8 pz8Var;
        pz8 pz8Var2 = g[i];
        if (pz8Var2 == null) {
            synchronized (h[i]) {
                pz8Var = g[i];
                if (pz8Var == null) {
                    pz8[] pz8VarArr = g;
                    pz8 pz8Var3 = new pz8(i);
                    pz8VarArr[i] = pz8Var3;
                    pz8Var = pz8Var3;
                }
            }
            return pz8Var;
        }
        return pz8Var2;
    }

    public static boolean g(String str) {
        if (!"hello".equalsIgnoreCase(str) && !"away".equalsIgnoreCase(str)) {
            return false;
        }
        return true;
    }

    public final void a(String str) {
        oz8 oz8Var;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i < size) {
                Object obj = arrayList.get(i);
                i++;
                oz8Var = (oz8) obj;
                if (TextUtils.equals(str, oz8Var.b)) {
                    break;
                }
            } else {
                oz8Var = null;
                break;
            }
        }
        if (oz8Var != null) {
            arrayList.remove(oz8Var);
            nm7.f(this.a).k(nm7.F1, new Object[0]);
        }
    }

    public final void b(Runnable runnable) {
        if (this.f) {
            runnable.run();
        } else {
            i(runnable, true);
        }
    }

    public final oz8 c(long j) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            oz8 oz8Var = (oz8) obj;
            if (oz8Var.a == j) {
                return oz8Var;
            }
        }
        return null;
    }

    public final oz8 d(String str) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            oz8 oz8Var = (oz8) obj;
            if (TextUtils.equals(str, oz8Var.b)) {
                return oz8Var;
            }
        }
        return null;
    }

    public final ArrayList e() {
        ArrayList arrayList = this.d;
        arrayList.clear();
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.b;
            if (i < arrayList2.size()) {
                if (!g(((oz8) arrayList2.get(i)).b)) {
                    arrayList.add((oz8) arrayList2.get(i));
                }
                i++;
            } else {
                return arrayList;
            }
        }
    }

    public final void h() {
        i(null, true);
    }

    public final void i(java.lang.Runnable r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pz8.i(java.lang.Runnable, boolean):void");
    }

    public final boolean j(final TLRPC.Update update, String str, int i) {
        if (update instanceof TL_update.TL_updateQuickReplyMessage) {
            b(new v36(this, ((TL_update.TL_updateQuickReplyMessage) update).message, str, i, (byte) 23));
            return true;
        } else if (update instanceof TL_update.TL_updateQuickReplies) {
            b(new Runnable(this) {
                public final pz8 b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    int i2;
                    oz8 oz8Var;
                    byte b = r3;
                    pz8 pz8Var = this.b;
                    TLRPC.Update update2 = update;
                    switch (b) {
                        case 0:
                            int i3 = pz8Var.a;
                            oz8 c = pz8Var.c(((TL_update.TL_updateDeleteQuickReply) update2).shortcut_id);
                            if (c != null) {
                                pz8Var.b.remove(c);
                                pz8Var.a(c.b);
                                int i4 = c.a;
                                cf7 Y = cf7.Y(i3);
                                Y.a.c(new xc7(Y, i4, (byte) 5));
                                pz8Var.l();
                                nm7.f(i3).k(122, new Object[0]);
                                return;
                            }
                            return;
                        case 1:
                            pz8 pz8Var2 = this.b;
                            int i5 = pz8Var2.a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update2;
                            oz8 c2 = pz8Var2.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c2 != null) {
                                int size = c2.f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c2.f = size;
                                if (size <= 0) {
                                    pz8Var2.b.remove(c2);
                                }
                                ArrayList<Integer> arrayList = tL_updateDeleteQuickReplyMessages.messages;
                                k47 k47Var = c2.e;
                                if (k47Var != null) {
                                    i2 = k47Var.e1();
                                } else {
                                    i2 = c2.d;
                                }
                                if (!arrayList.contains(Integer.valueOf(i2)) && c2.e != null) {
                                    pz8Var2.l();
                                    nm7.f(i5).k(122, new Object[0]);
                                    return;
                                }
                                c2.e = null;
                                long e = z8c.h(i5).e();
                                cf7 Y2 = cf7.Y(i5);
                                Y2.a.c(new nz8(pz8Var2, Y2, c2, e, (byte) 0));
                                return;
                            }
                            return;
                        case 2:
                            ArrayList<TLRPC.TL_quickReply> arrayList2 = ((TL_update.TL_updateQuickReplies) update2).quick_replies;
                            ArrayList arrayList3 = pz8Var.b;
                            ArrayList arrayList4 = new ArrayList(arrayList3);
                            arrayList3.clear();
                            for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList2.get(i6);
                                int i7 = 0;
                                while (true) {
                                    if (i7 < arrayList4.size()) {
                                        if (((oz8) arrayList4.get(i7)).a == tL_quickReply.shortcut_id) {
                                            oz8Var = (oz8) arrayList4.get(i7);
                                        } else {
                                            i7++;
                                        }
                                    } else {
                                        oz8Var = null;
                                    }
                                }
                                if (oz8Var == null) {
                                    oz8Var = new oz8();
                                }
                                oz8Var.a = tL_quickReply.shortcut_id;
                                oz8Var.b = tL_quickReply.shortcut;
                                oz8Var.f = tL_quickReply.count;
                                oz8Var.c = i6;
                                oz8Var.d = tL_quickReply.top_message;
                                k47 k47Var2 = oz8Var.e;
                                if (k47Var2 != null && k47Var2.e1() != tL_quickReply.top_message) {
                                    oz8Var.e = null;
                                }
                                arrayList3.add(oz8Var);
                                pz8Var.a(oz8Var.b);
                            }
                            pz8Var.l();
                            nm7.f(pz8Var.a).k(122, new Object[0]);
                            return;
                        default:
                            pz8 pz8Var3 = this.b;
                            ArrayList arrayList5 = pz8Var3.b;
                            int i8 = pz8Var3.a;
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update2).quick_reply;
                            oz8 c3 = pz8Var3.c(tL_quickReply2.shortcut_id);
                            if (c3 != null) {
                                c3.b = tL_quickReply2.shortcut;
                                c3.f = tL_quickReply2.count;
                                c3.d = tL_quickReply2.top_message;
                                k47 k47Var3 = c3.e;
                                if (k47Var3 != null && k47Var3.e1() != tL_quickReply2.top_message) {
                                    c3.e = null;
                                    long e2 = z8c.h(i8).e();
                                    cf7 Y3 = cf7.Y(i8);
                                    Y3.a.c(new nz8(pz8Var3, Y3, c3, e2, (byte) 0));
                                    return;
                                }
                            } else {
                                oz8 oz8Var2 = new oz8();
                                oz8Var2.a = tL_quickReply2.shortcut_id;
                                oz8Var2.b = tL_quickReply2.shortcut;
                                oz8Var2.f = tL_quickReply2.count;
                                oz8Var2.d = tL_quickReply2.top_message;
                                for (int i9 = 0; i9 < arrayList5.size(); i9++) {
                                    ((oz8) arrayList5.get(i9)).c = i9;
                                }
                                arrayList5.add(oz8Var2);
                                pz8Var3.a(oz8Var2.b);
                            }
                            pz8Var3.l();
                            nm7.f(i8).k(122, new Object[0]);
                            return;
                    }
                }
            });
            return true;
        } else if (update instanceof TL_update.TL_updateNewQuickReply) {
            b(new Runnable(this) {
                public final pz8 b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    int i2;
                    oz8 oz8Var;
                    byte b = r3;
                    pz8 pz8Var = this.b;
                    TLRPC.Update update2 = update;
                    switch (b) {
                        case 0:
                            int i3 = pz8Var.a;
                            oz8 c = pz8Var.c(((TL_update.TL_updateDeleteQuickReply) update2).shortcut_id);
                            if (c != null) {
                                pz8Var.b.remove(c);
                                pz8Var.a(c.b);
                                int i4 = c.a;
                                cf7 Y = cf7.Y(i3);
                                Y.a.c(new xc7(Y, i4, (byte) 5));
                                pz8Var.l();
                                nm7.f(i3).k(122, new Object[0]);
                                return;
                            }
                            return;
                        case 1:
                            pz8 pz8Var2 = this.b;
                            int i5 = pz8Var2.a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update2;
                            oz8 c2 = pz8Var2.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c2 != null) {
                                int size = c2.f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c2.f = size;
                                if (size <= 0) {
                                    pz8Var2.b.remove(c2);
                                }
                                ArrayList<Integer> arrayList = tL_updateDeleteQuickReplyMessages.messages;
                                k47 k47Var = c2.e;
                                if (k47Var != null) {
                                    i2 = k47Var.e1();
                                } else {
                                    i2 = c2.d;
                                }
                                if (!arrayList.contains(Integer.valueOf(i2)) && c2.e != null) {
                                    pz8Var2.l();
                                    nm7.f(i5).k(122, new Object[0]);
                                    return;
                                }
                                c2.e = null;
                                long e = z8c.h(i5).e();
                                cf7 Y2 = cf7.Y(i5);
                                Y2.a.c(new nz8(pz8Var2, Y2, c2, e, (byte) 0));
                                return;
                            }
                            return;
                        case 2:
                            ArrayList<TLRPC.TL_quickReply> arrayList2 = ((TL_update.TL_updateQuickReplies) update2).quick_replies;
                            ArrayList arrayList3 = pz8Var.b;
                            ArrayList arrayList4 = new ArrayList(arrayList3);
                            arrayList3.clear();
                            for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList2.get(i6);
                                int i7 = 0;
                                while (true) {
                                    if (i7 < arrayList4.size()) {
                                        if (((oz8) arrayList4.get(i7)).a == tL_quickReply.shortcut_id) {
                                            oz8Var = (oz8) arrayList4.get(i7);
                                        } else {
                                            i7++;
                                        }
                                    } else {
                                        oz8Var = null;
                                    }
                                }
                                if (oz8Var == null) {
                                    oz8Var = new oz8();
                                }
                                oz8Var.a = tL_quickReply.shortcut_id;
                                oz8Var.b = tL_quickReply.shortcut;
                                oz8Var.f = tL_quickReply.count;
                                oz8Var.c = i6;
                                oz8Var.d = tL_quickReply.top_message;
                                k47 k47Var2 = oz8Var.e;
                                if (k47Var2 != null && k47Var2.e1() != tL_quickReply.top_message) {
                                    oz8Var.e = null;
                                }
                                arrayList3.add(oz8Var);
                                pz8Var.a(oz8Var.b);
                            }
                            pz8Var.l();
                            nm7.f(pz8Var.a).k(122, new Object[0]);
                            return;
                        default:
                            pz8 pz8Var3 = this.b;
                            ArrayList arrayList5 = pz8Var3.b;
                            int i8 = pz8Var3.a;
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update2).quick_reply;
                            oz8 c3 = pz8Var3.c(tL_quickReply2.shortcut_id);
                            if (c3 != null) {
                                c3.b = tL_quickReply2.shortcut;
                                c3.f = tL_quickReply2.count;
                                c3.d = tL_quickReply2.top_message;
                                k47 k47Var3 = c3.e;
                                if (k47Var3 != null && k47Var3.e1() != tL_quickReply2.top_message) {
                                    c3.e = null;
                                    long e2 = z8c.h(i8).e();
                                    cf7 Y3 = cf7.Y(i8);
                                    Y3.a.c(new nz8(pz8Var3, Y3, c3, e2, (byte) 0));
                                    return;
                                }
                            } else {
                                oz8 oz8Var2 = new oz8();
                                oz8Var2.a = tL_quickReply2.shortcut_id;
                                oz8Var2.b = tL_quickReply2.shortcut;
                                oz8Var2.f = tL_quickReply2.count;
                                oz8Var2.d = tL_quickReply2.top_message;
                                for (int i9 = 0; i9 < arrayList5.size(); i9++) {
                                    ((oz8) arrayList5.get(i9)).c = i9;
                                }
                                arrayList5.add(oz8Var2);
                                pz8Var3.a(oz8Var2.b);
                            }
                            pz8Var3.l();
                            nm7.f(i8).k(122, new Object[0]);
                            return;
                    }
                }
            });
            return true;
        } else if (update instanceof TL_update.TL_updateDeleteQuickReply) {
            b(new Runnable(this) {
                public final pz8 b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    int i2;
                    oz8 oz8Var;
                    byte b = r3;
                    pz8 pz8Var = this.b;
                    TLRPC.Update update2 = update;
                    switch (b) {
                        case 0:
                            int i3 = pz8Var.a;
                            oz8 c = pz8Var.c(((TL_update.TL_updateDeleteQuickReply) update2).shortcut_id);
                            if (c != null) {
                                pz8Var.b.remove(c);
                                pz8Var.a(c.b);
                                int i4 = c.a;
                                cf7 Y = cf7.Y(i3);
                                Y.a.c(new xc7(Y, i4, (byte) 5));
                                pz8Var.l();
                                nm7.f(i3).k(122, new Object[0]);
                                return;
                            }
                            return;
                        case 1:
                            pz8 pz8Var2 = this.b;
                            int i5 = pz8Var2.a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update2;
                            oz8 c2 = pz8Var2.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c2 != null) {
                                int size = c2.f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c2.f = size;
                                if (size <= 0) {
                                    pz8Var2.b.remove(c2);
                                }
                                ArrayList<Integer> arrayList = tL_updateDeleteQuickReplyMessages.messages;
                                k47 k47Var = c2.e;
                                if (k47Var != null) {
                                    i2 = k47Var.e1();
                                } else {
                                    i2 = c2.d;
                                }
                                if (!arrayList.contains(Integer.valueOf(i2)) && c2.e != null) {
                                    pz8Var2.l();
                                    nm7.f(i5).k(122, new Object[0]);
                                    return;
                                }
                                c2.e = null;
                                long e = z8c.h(i5).e();
                                cf7 Y2 = cf7.Y(i5);
                                Y2.a.c(new nz8(pz8Var2, Y2, c2, e, (byte) 0));
                                return;
                            }
                            return;
                        case 2:
                            ArrayList<TLRPC.TL_quickReply> arrayList2 = ((TL_update.TL_updateQuickReplies) update2).quick_replies;
                            ArrayList arrayList3 = pz8Var.b;
                            ArrayList arrayList4 = new ArrayList(arrayList3);
                            arrayList3.clear();
                            for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList2.get(i6);
                                int i7 = 0;
                                while (true) {
                                    if (i7 < arrayList4.size()) {
                                        if (((oz8) arrayList4.get(i7)).a == tL_quickReply.shortcut_id) {
                                            oz8Var = (oz8) arrayList4.get(i7);
                                        } else {
                                            i7++;
                                        }
                                    } else {
                                        oz8Var = null;
                                    }
                                }
                                if (oz8Var == null) {
                                    oz8Var = new oz8();
                                }
                                oz8Var.a = tL_quickReply.shortcut_id;
                                oz8Var.b = tL_quickReply.shortcut;
                                oz8Var.f = tL_quickReply.count;
                                oz8Var.c = i6;
                                oz8Var.d = tL_quickReply.top_message;
                                k47 k47Var2 = oz8Var.e;
                                if (k47Var2 != null && k47Var2.e1() != tL_quickReply.top_message) {
                                    oz8Var.e = null;
                                }
                                arrayList3.add(oz8Var);
                                pz8Var.a(oz8Var.b);
                            }
                            pz8Var.l();
                            nm7.f(pz8Var.a).k(122, new Object[0]);
                            return;
                        default:
                            pz8 pz8Var3 = this.b;
                            ArrayList arrayList5 = pz8Var3.b;
                            int i8 = pz8Var3.a;
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update2).quick_reply;
                            oz8 c3 = pz8Var3.c(tL_quickReply2.shortcut_id);
                            if (c3 != null) {
                                c3.b = tL_quickReply2.shortcut;
                                c3.f = tL_quickReply2.count;
                                c3.d = tL_quickReply2.top_message;
                                k47 k47Var3 = c3.e;
                                if (k47Var3 != null && k47Var3.e1() != tL_quickReply2.top_message) {
                                    c3.e = null;
                                    long e2 = z8c.h(i8).e();
                                    cf7 Y3 = cf7.Y(i8);
                                    Y3.a.c(new nz8(pz8Var3, Y3, c3, e2, (byte) 0));
                                    return;
                                }
                            } else {
                                oz8 oz8Var2 = new oz8();
                                oz8Var2.a = tL_quickReply2.shortcut_id;
                                oz8Var2.b = tL_quickReply2.shortcut;
                                oz8Var2.f = tL_quickReply2.count;
                                oz8Var2.d = tL_quickReply2.top_message;
                                for (int i9 = 0; i9 < arrayList5.size(); i9++) {
                                    ((oz8) arrayList5.get(i9)).c = i9;
                                }
                                arrayList5.add(oz8Var2);
                                pz8Var3.a(oz8Var2.b);
                            }
                            pz8Var3.l();
                            nm7.f(i8).k(122, new Object[0]);
                            return;
                    }
                }
            });
            return true;
        } else if (!(update instanceof TL_update.TL_updateDeleteQuickReplyMessages)) {
            return false;
        } else {
            b(new Runnable(this) {
                public final pz8 b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    int i2;
                    oz8 oz8Var;
                    byte b = r3;
                    pz8 pz8Var = this.b;
                    TLRPC.Update update2 = update;
                    switch (b) {
                        case 0:
                            int i3 = pz8Var.a;
                            oz8 c = pz8Var.c(((TL_update.TL_updateDeleteQuickReply) update2).shortcut_id);
                            if (c != null) {
                                pz8Var.b.remove(c);
                                pz8Var.a(c.b);
                                int i4 = c.a;
                                cf7 Y = cf7.Y(i3);
                                Y.a.c(new xc7(Y, i4, (byte) 5));
                                pz8Var.l();
                                nm7.f(i3).k(122, new Object[0]);
                                return;
                            }
                            return;
                        case 1:
                            pz8 pz8Var2 = this.b;
                            int i5 = pz8Var2.a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update2;
                            oz8 c2 = pz8Var2.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c2 != null) {
                                int size = c2.f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c2.f = size;
                                if (size <= 0) {
                                    pz8Var2.b.remove(c2);
                                }
                                ArrayList<Integer> arrayList = tL_updateDeleteQuickReplyMessages.messages;
                                k47 k47Var = c2.e;
                                if (k47Var != null) {
                                    i2 = k47Var.e1();
                                } else {
                                    i2 = c2.d;
                                }
                                if (!arrayList.contains(Integer.valueOf(i2)) && c2.e != null) {
                                    pz8Var2.l();
                                    nm7.f(i5).k(122, new Object[0]);
                                    return;
                                }
                                c2.e = null;
                                long e = z8c.h(i5).e();
                                cf7 Y2 = cf7.Y(i5);
                                Y2.a.c(new nz8(pz8Var2, Y2, c2, e, (byte) 0));
                                return;
                            }
                            return;
                        case 2:
                            ArrayList<TLRPC.TL_quickReply> arrayList2 = ((TL_update.TL_updateQuickReplies) update2).quick_replies;
                            ArrayList arrayList3 = pz8Var.b;
                            ArrayList arrayList4 = new ArrayList(arrayList3);
                            arrayList3.clear();
                            for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList2.get(i6);
                                int i7 = 0;
                                while (true) {
                                    if (i7 < arrayList4.size()) {
                                        if (((oz8) arrayList4.get(i7)).a == tL_quickReply.shortcut_id) {
                                            oz8Var = (oz8) arrayList4.get(i7);
                                        } else {
                                            i7++;
                                        }
                                    } else {
                                        oz8Var = null;
                                    }
                                }
                                if (oz8Var == null) {
                                    oz8Var = new oz8();
                                }
                                oz8Var.a = tL_quickReply.shortcut_id;
                                oz8Var.b = tL_quickReply.shortcut;
                                oz8Var.f = tL_quickReply.count;
                                oz8Var.c = i6;
                                oz8Var.d = tL_quickReply.top_message;
                                k47 k47Var2 = oz8Var.e;
                                if (k47Var2 != null && k47Var2.e1() != tL_quickReply.top_message) {
                                    oz8Var.e = null;
                                }
                                arrayList3.add(oz8Var);
                                pz8Var.a(oz8Var.b);
                            }
                            pz8Var.l();
                            nm7.f(pz8Var.a).k(122, new Object[0]);
                            return;
                        default:
                            pz8 pz8Var3 = this.b;
                            ArrayList arrayList5 = pz8Var3.b;
                            int i8 = pz8Var3.a;
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update2).quick_reply;
                            oz8 c3 = pz8Var3.c(tL_quickReply2.shortcut_id);
                            if (c3 != null) {
                                c3.b = tL_quickReply2.shortcut;
                                c3.f = tL_quickReply2.count;
                                c3.d = tL_quickReply2.top_message;
                                k47 k47Var3 = c3.e;
                                if (k47Var3 != null && k47Var3.e1() != tL_quickReply2.top_message) {
                                    c3.e = null;
                                    long e2 = z8c.h(i8).e();
                                    cf7 Y3 = cf7.Y(i8);
                                    Y3.a.c(new nz8(pz8Var3, Y3, c3, e2, (byte) 0));
                                    return;
                                }
                            } else {
                                oz8 oz8Var2 = new oz8();
                                oz8Var2.a = tL_quickReply2.shortcut_id;
                                oz8Var2.b = tL_quickReply2.shortcut;
                                oz8Var2.f = tL_quickReply2.count;
                                oz8Var2.d = tL_quickReply2.top_message;
                                for (int i9 = 0; i9 < arrayList5.size(); i9++) {
                                    ((oz8) arrayList5.get(i9)).c = i9;
                                }
                                arrayList5.add(oz8Var2);
                                pz8Var3.a(oz8Var2.b);
                            }
                            pz8Var3.l();
                            nm7.f(i8).k(122, new Object[0]);
                            return;
                    }
                }
            });
            return true;
        }
    }

    public final void k(int i, String str) {
        oz8 c = c(i);
        if (c == null) {
            return;
        }
        c.b = str;
        TLRPC.TL_messages_editQuickReplyShortcut tL_messages_editQuickReplyShortcut = new TLRPC.TL_messages_editQuickReplyShortcut();
        tL_messages_editQuickReplyShortcut.shortcut_id = i;
        tL_messages_editQuickReplyShortcut.shortcut = str;
        int i2 = this.a;
        ConnectionsManager.getInstance(i2).sendRequest(tL_messages_editQuickReplyShortcut, new nf2((byte) 7));
        l();
        nm7.f(i2).k(nm7.F1, new Object[0]);
    }

    public final void l() {
        cf7 Y = cf7.Y(this.a);
        Y.a.c(new ey8(this, Y, (byte) 6));
    }
}
