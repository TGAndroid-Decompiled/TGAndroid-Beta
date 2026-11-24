package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
public final class ox8 {
    public static volatile ox8[] g = new ox8[4];
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

    public ox8(int i) {
        this.a = i;
    }

    public static ox8 f(int i) {
        ox8 ox8Var;
        ox8 ox8Var2 = g[i];
        if (ox8Var2 == null) {
            synchronized (h[i]) {
                ox8Var = g[i];
                if (ox8Var == null) {
                    ox8[] ox8VarArr = g;
                    ox8 ox8Var3 = new ox8(i);
                    ox8VarArr[i] = ox8Var3;
                    ox8Var = ox8Var3;
                }
            }
            return ox8Var;
        }
        return ox8Var2;
    }

    public static boolean g(String str) {
        if (!"hello".equalsIgnoreCase(str) && !"away".equalsIgnoreCase(str)) {
            return false;
        }
        return true;
    }

    public final void a(String str) {
        nx8 nx8Var;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i < size) {
                Object obj = arrayList.get(i);
                i++;
                nx8Var = (nx8) obj;
                if (TextUtils.equals(str, nx8Var.b)) {
                    break;
                }
            } else {
                nx8Var = null;
                break;
            }
        }
        if (nx8Var != null) {
            arrayList.remove(nx8Var);
            kk7.f(this.a).k(kk7.E1, new Object[0]);
        }
    }

    public final void b(Runnable runnable) {
        if (this.f) {
            runnable.run();
        } else {
            i(runnable, true);
        }
    }

    public final nx8 c(long j) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            nx8 nx8Var = (nx8) obj;
            if (nx8Var.a == j) {
                return nx8Var;
            }
        }
        return null;
    }

    public final nx8 d(String str) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            nx8 nx8Var = (nx8) obj;
            if (TextUtils.equals(str, nx8Var.b)) {
                return nx8Var;
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
                if (!g(((nx8) arrayList2.get(i)).b)) {
                    arrayList.add((nx8) arrayList2.get(i));
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ox8.i(java.lang.Runnable, boolean):void");
    }

    public final boolean j(final TLRPC.Update update, String str, int i) {
        if (update instanceof TL_update.TL_updateQuickReplyMessage) {
            b(new q76(this, ((TL_update.TL_updateQuickReplyMessage) update).message, str, i, (byte) 22));
            return true;
        } else if (update instanceof TL_update.TL_updateQuickReplies) {
            b(new Runnable(this) {
                public final ox8 b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    int i2;
                    nx8 nx8Var;
                    byte b = r3;
                    ox8 ox8Var = this.b;
                    TLRPC.Update update2 = update;
                    switch (b) {
                        case 0:
                            int i3 = ox8Var.a;
                            nx8 c = ox8Var.c(((TL_update.TL_updateDeleteQuickReply) update2).shortcut_id);
                            if (c != null) {
                                ox8Var.b.remove(c);
                                ox8Var.a(c.b);
                                int i4 = c.a;
                                ad7 Y = ad7.Y(i3);
                                Y.a.c(new wa7(Y, i4, (byte) 5));
                                ox8Var.l();
                                kk7.f(i3).k(121, new Object[0]);
                                return;
                            }
                            return;
                        case 1:
                            ox8 ox8Var2 = this.b;
                            int i5 = ox8Var2.a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update2;
                            nx8 c2 = ox8Var2.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c2 != null) {
                                int size = c2.f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c2.f = size;
                                if (size <= 0) {
                                    ox8Var2.b.remove(c2);
                                }
                                ArrayList<Integer> arrayList = tL_updateDeleteQuickReplyMessages.messages;
                                k27 k27Var = c2.e;
                                if (k27Var != null) {
                                    i2 = k27Var.e1();
                                } else {
                                    i2 = c2.d;
                                }
                                if (!arrayList.contains(Integer.valueOf(i2)) && c2.e != null) {
                                    ox8Var2.l();
                                    kk7.f(i5).k(121, new Object[0]);
                                    return;
                                }
                                c2.e = null;
                                long e = y6c.h(i5).e();
                                ad7 Y2 = ad7.Y(i5);
                                Y2.a.c(new mx8(ox8Var2, Y2, c2, e, (byte) 0));
                                return;
                            }
                            return;
                        case 2:
                            ArrayList<TLRPC.TL_quickReply> arrayList2 = ((TL_update.TL_updateQuickReplies) update2).quick_replies;
                            ArrayList arrayList3 = ox8Var.b;
                            ArrayList arrayList4 = new ArrayList(arrayList3);
                            arrayList3.clear();
                            for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList2.get(i6);
                                int i7 = 0;
                                while (true) {
                                    if (i7 < arrayList4.size()) {
                                        if (((nx8) arrayList4.get(i7)).a == tL_quickReply.shortcut_id) {
                                            nx8Var = (nx8) arrayList4.get(i7);
                                        } else {
                                            i7++;
                                        }
                                    } else {
                                        nx8Var = null;
                                    }
                                }
                                if (nx8Var == null) {
                                    nx8Var = new nx8();
                                }
                                nx8Var.a = tL_quickReply.shortcut_id;
                                nx8Var.b = tL_quickReply.shortcut;
                                nx8Var.f = tL_quickReply.count;
                                nx8Var.c = i6;
                                nx8Var.d = tL_quickReply.top_message;
                                k27 k27Var2 = nx8Var.e;
                                if (k27Var2 != null && k27Var2.e1() != tL_quickReply.top_message) {
                                    nx8Var.e = null;
                                }
                                arrayList3.add(nx8Var);
                                ox8Var.a(nx8Var.b);
                            }
                            ox8Var.l();
                            kk7.f(ox8Var.a).k(121, new Object[0]);
                            return;
                        default:
                            ox8 ox8Var3 = this.b;
                            ArrayList arrayList5 = ox8Var3.b;
                            int i8 = ox8Var3.a;
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update2).quick_reply;
                            nx8 c3 = ox8Var3.c(tL_quickReply2.shortcut_id);
                            if (c3 != null) {
                                c3.b = tL_quickReply2.shortcut;
                                c3.f = tL_quickReply2.count;
                                c3.d = tL_quickReply2.top_message;
                                k27 k27Var3 = c3.e;
                                if (k27Var3 != null && k27Var3.e1() != tL_quickReply2.top_message) {
                                    c3.e = null;
                                    long e2 = y6c.h(i8).e();
                                    ad7 Y3 = ad7.Y(i8);
                                    Y3.a.c(new mx8(ox8Var3, Y3, c3, e2, (byte) 0));
                                    return;
                                }
                            } else {
                                nx8 nx8Var2 = new nx8();
                                nx8Var2.a = tL_quickReply2.shortcut_id;
                                nx8Var2.b = tL_quickReply2.shortcut;
                                nx8Var2.f = tL_quickReply2.count;
                                nx8Var2.d = tL_quickReply2.top_message;
                                for (int i9 = 0; i9 < arrayList5.size(); i9++) {
                                    ((nx8) arrayList5.get(i9)).c = i9;
                                }
                                arrayList5.add(nx8Var2);
                                ox8Var3.a(nx8Var2.b);
                            }
                            ox8Var3.l();
                            kk7.f(i8).k(121, new Object[0]);
                            return;
                    }
                }
            });
            return true;
        } else if (update instanceof TL_update.TL_updateNewQuickReply) {
            b(new Runnable(this) {
                public final ox8 b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    int i2;
                    nx8 nx8Var;
                    byte b = r3;
                    ox8 ox8Var = this.b;
                    TLRPC.Update update2 = update;
                    switch (b) {
                        case 0:
                            int i3 = ox8Var.a;
                            nx8 c = ox8Var.c(((TL_update.TL_updateDeleteQuickReply) update2).shortcut_id);
                            if (c != null) {
                                ox8Var.b.remove(c);
                                ox8Var.a(c.b);
                                int i4 = c.a;
                                ad7 Y = ad7.Y(i3);
                                Y.a.c(new wa7(Y, i4, (byte) 5));
                                ox8Var.l();
                                kk7.f(i3).k(121, new Object[0]);
                                return;
                            }
                            return;
                        case 1:
                            ox8 ox8Var2 = this.b;
                            int i5 = ox8Var2.a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update2;
                            nx8 c2 = ox8Var2.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c2 != null) {
                                int size = c2.f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c2.f = size;
                                if (size <= 0) {
                                    ox8Var2.b.remove(c2);
                                }
                                ArrayList<Integer> arrayList = tL_updateDeleteQuickReplyMessages.messages;
                                k27 k27Var = c2.e;
                                if (k27Var != null) {
                                    i2 = k27Var.e1();
                                } else {
                                    i2 = c2.d;
                                }
                                if (!arrayList.contains(Integer.valueOf(i2)) && c2.e != null) {
                                    ox8Var2.l();
                                    kk7.f(i5).k(121, new Object[0]);
                                    return;
                                }
                                c2.e = null;
                                long e = y6c.h(i5).e();
                                ad7 Y2 = ad7.Y(i5);
                                Y2.a.c(new mx8(ox8Var2, Y2, c2, e, (byte) 0));
                                return;
                            }
                            return;
                        case 2:
                            ArrayList<TLRPC.TL_quickReply> arrayList2 = ((TL_update.TL_updateQuickReplies) update2).quick_replies;
                            ArrayList arrayList3 = ox8Var.b;
                            ArrayList arrayList4 = new ArrayList(arrayList3);
                            arrayList3.clear();
                            for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList2.get(i6);
                                int i7 = 0;
                                while (true) {
                                    if (i7 < arrayList4.size()) {
                                        if (((nx8) arrayList4.get(i7)).a == tL_quickReply.shortcut_id) {
                                            nx8Var = (nx8) arrayList4.get(i7);
                                        } else {
                                            i7++;
                                        }
                                    } else {
                                        nx8Var = null;
                                    }
                                }
                                if (nx8Var == null) {
                                    nx8Var = new nx8();
                                }
                                nx8Var.a = tL_quickReply.shortcut_id;
                                nx8Var.b = tL_quickReply.shortcut;
                                nx8Var.f = tL_quickReply.count;
                                nx8Var.c = i6;
                                nx8Var.d = tL_quickReply.top_message;
                                k27 k27Var2 = nx8Var.e;
                                if (k27Var2 != null && k27Var2.e1() != tL_quickReply.top_message) {
                                    nx8Var.e = null;
                                }
                                arrayList3.add(nx8Var);
                                ox8Var.a(nx8Var.b);
                            }
                            ox8Var.l();
                            kk7.f(ox8Var.a).k(121, new Object[0]);
                            return;
                        default:
                            ox8 ox8Var3 = this.b;
                            ArrayList arrayList5 = ox8Var3.b;
                            int i8 = ox8Var3.a;
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update2).quick_reply;
                            nx8 c3 = ox8Var3.c(tL_quickReply2.shortcut_id);
                            if (c3 != null) {
                                c3.b = tL_quickReply2.shortcut;
                                c3.f = tL_quickReply2.count;
                                c3.d = tL_quickReply2.top_message;
                                k27 k27Var3 = c3.e;
                                if (k27Var3 != null && k27Var3.e1() != tL_quickReply2.top_message) {
                                    c3.e = null;
                                    long e2 = y6c.h(i8).e();
                                    ad7 Y3 = ad7.Y(i8);
                                    Y3.a.c(new mx8(ox8Var3, Y3, c3, e2, (byte) 0));
                                    return;
                                }
                            } else {
                                nx8 nx8Var2 = new nx8();
                                nx8Var2.a = tL_quickReply2.shortcut_id;
                                nx8Var2.b = tL_quickReply2.shortcut;
                                nx8Var2.f = tL_quickReply2.count;
                                nx8Var2.d = tL_quickReply2.top_message;
                                for (int i9 = 0; i9 < arrayList5.size(); i9++) {
                                    ((nx8) arrayList5.get(i9)).c = i9;
                                }
                                arrayList5.add(nx8Var2);
                                ox8Var3.a(nx8Var2.b);
                            }
                            ox8Var3.l();
                            kk7.f(i8).k(121, new Object[0]);
                            return;
                    }
                }
            });
            return true;
        } else if (update instanceof TL_update.TL_updateDeleteQuickReply) {
            b(new Runnable(this) {
                public final ox8 b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    int i2;
                    nx8 nx8Var;
                    byte b = r3;
                    ox8 ox8Var = this.b;
                    TLRPC.Update update2 = update;
                    switch (b) {
                        case 0:
                            int i3 = ox8Var.a;
                            nx8 c = ox8Var.c(((TL_update.TL_updateDeleteQuickReply) update2).shortcut_id);
                            if (c != null) {
                                ox8Var.b.remove(c);
                                ox8Var.a(c.b);
                                int i4 = c.a;
                                ad7 Y = ad7.Y(i3);
                                Y.a.c(new wa7(Y, i4, (byte) 5));
                                ox8Var.l();
                                kk7.f(i3).k(121, new Object[0]);
                                return;
                            }
                            return;
                        case 1:
                            ox8 ox8Var2 = this.b;
                            int i5 = ox8Var2.a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update2;
                            nx8 c2 = ox8Var2.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c2 != null) {
                                int size = c2.f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c2.f = size;
                                if (size <= 0) {
                                    ox8Var2.b.remove(c2);
                                }
                                ArrayList<Integer> arrayList = tL_updateDeleteQuickReplyMessages.messages;
                                k27 k27Var = c2.e;
                                if (k27Var != null) {
                                    i2 = k27Var.e1();
                                } else {
                                    i2 = c2.d;
                                }
                                if (!arrayList.contains(Integer.valueOf(i2)) && c2.e != null) {
                                    ox8Var2.l();
                                    kk7.f(i5).k(121, new Object[0]);
                                    return;
                                }
                                c2.e = null;
                                long e = y6c.h(i5).e();
                                ad7 Y2 = ad7.Y(i5);
                                Y2.a.c(new mx8(ox8Var2, Y2, c2, e, (byte) 0));
                                return;
                            }
                            return;
                        case 2:
                            ArrayList<TLRPC.TL_quickReply> arrayList2 = ((TL_update.TL_updateQuickReplies) update2).quick_replies;
                            ArrayList arrayList3 = ox8Var.b;
                            ArrayList arrayList4 = new ArrayList(arrayList3);
                            arrayList3.clear();
                            for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList2.get(i6);
                                int i7 = 0;
                                while (true) {
                                    if (i7 < arrayList4.size()) {
                                        if (((nx8) arrayList4.get(i7)).a == tL_quickReply.shortcut_id) {
                                            nx8Var = (nx8) arrayList4.get(i7);
                                        } else {
                                            i7++;
                                        }
                                    } else {
                                        nx8Var = null;
                                    }
                                }
                                if (nx8Var == null) {
                                    nx8Var = new nx8();
                                }
                                nx8Var.a = tL_quickReply.shortcut_id;
                                nx8Var.b = tL_quickReply.shortcut;
                                nx8Var.f = tL_quickReply.count;
                                nx8Var.c = i6;
                                nx8Var.d = tL_quickReply.top_message;
                                k27 k27Var2 = nx8Var.e;
                                if (k27Var2 != null && k27Var2.e1() != tL_quickReply.top_message) {
                                    nx8Var.e = null;
                                }
                                arrayList3.add(nx8Var);
                                ox8Var.a(nx8Var.b);
                            }
                            ox8Var.l();
                            kk7.f(ox8Var.a).k(121, new Object[0]);
                            return;
                        default:
                            ox8 ox8Var3 = this.b;
                            ArrayList arrayList5 = ox8Var3.b;
                            int i8 = ox8Var3.a;
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update2).quick_reply;
                            nx8 c3 = ox8Var3.c(tL_quickReply2.shortcut_id);
                            if (c3 != null) {
                                c3.b = tL_quickReply2.shortcut;
                                c3.f = tL_quickReply2.count;
                                c3.d = tL_quickReply2.top_message;
                                k27 k27Var3 = c3.e;
                                if (k27Var3 != null && k27Var3.e1() != tL_quickReply2.top_message) {
                                    c3.e = null;
                                    long e2 = y6c.h(i8).e();
                                    ad7 Y3 = ad7.Y(i8);
                                    Y3.a.c(new mx8(ox8Var3, Y3, c3, e2, (byte) 0));
                                    return;
                                }
                            } else {
                                nx8 nx8Var2 = new nx8();
                                nx8Var2.a = tL_quickReply2.shortcut_id;
                                nx8Var2.b = tL_quickReply2.shortcut;
                                nx8Var2.f = tL_quickReply2.count;
                                nx8Var2.d = tL_quickReply2.top_message;
                                for (int i9 = 0; i9 < arrayList5.size(); i9++) {
                                    ((nx8) arrayList5.get(i9)).c = i9;
                                }
                                arrayList5.add(nx8Var2);
                                ox8Var3.a(nx8Var2.b);
                            }
                            ox8Var3.l();
                            kk7.f(i8).k(121, new Object[0]);
                            return;
                    }
                }
            });
            return true;
        } else if (!(update instanceof TL_update.TL_updateDeleteQuickReplyMessages)) {
            return false;
        } else {
            b(new Runnable(this) {
                public final ox8 b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    int i2;
                    nx8 nx8Var;
                    byte b = r3;
                    ox8 ox8Var = this.b;
                    TLRPC.Update update2 = update;
                    switch (b) {
                        case 0:
                            int i3 = ox8Var.a;
                            nx8 c = ox8Var.c(((TL_update.TL_updateDeleteQuickReply) update2).shortcut_id);
                            if (c != null) {
                                ox8Var.b.remove(c);
                                ox8Var.a(c.b);
                                int i4 = c.a;
                                ad7 Y = ad7.Y(i3);
                                Y.a.c(new wa7(Y, i4, (byte) 5));
                                ox8Var.l();
                                kk7.f(i3).k(121, new Object[0]);
                                return;
                            }
                            return;
                        case 1:
                            ox8 ox8Var2 = this.b;
                            int i5 = ox8Var2.a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update2;
                            nx8 c2 = ox8Var2.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c2 != null) {
                                int size = c2.f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c2.f = size;
                                if (size <= 0) {
                                    ox8Var2.b.remove(c2);
                                }
                                ArrayList<Integer> arrayList = tL_updateDeleteQuickReplyMessages.messages;
                                k27 k27Var = c2.e;
                                if (k27Var != null) {
                                    i2 = k27Var.e1();
                                } else {
                                    i2 = c2.d;
                                }
                                if (!arrayList.contains(Integer.valueOf(i2)) && c2.e != null) {
                                    ox8Var2.l();
                                    kk7.f(i5).k(121, new Object[0]);
                                    return;
                                }
                                c2.e = null;
                                long e = y6c.h(i5).e();
                                ad7 Y2 = ad7.Y(i5);
                                Y2.a.c(new mx8(ox8Var2, Y2, c2, e, (byte) 0));
                                return;
                            }
                            return;
                        case 2:
                            ArrayList<TLRPC.TL_quickReply> arrayList2 = ((TL_update.TL_updateQuickReplies) update2).quick_replies;
                            ArrayList arrayList3 = ox8Var.b;
                            ArrayList arrayList4 = new ArrayList(arrayList3);
                            arrayList3.clear();
                            for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList2.get(i6);
                                int i7 = 0;
                                while (true) {
                                    if (i7 < arrayList4.size()) {
                                        if (((nx8) arrayList4.get(i7)).a == tL_quickReply.shortcut_id) {
                                            nx8Var = (nx8) arrayList4.get(i7);
                                        } else {
                                            i7++;
                                        }
                                    } else {
                                        nx8Var = null;
                                    }
                                }
                                if (nx8Var == null) {
                                    nx8Var = new nx8();
                                }
                                nx8Var.a = tL_quickReply.shortcut_id;
                                nx8Var.b = tL_quickReply.shortcut;
                                nx8Var.f = tL_quickReply.count;
                                nx8Var.c = i6;
                                nx8Var.d = tL_quickReply.top_message;
                                k27 k27Var2 = nx8Var.e;
                                if (k27Var2 != null && k27Var2.e1() != tL_quickReply.top_message) {
                                    nx8Var.e = null;
                                }
                                arrayList3.add(nx8Var);
                                ox8Var.a(nx8Var.b);
                            }
                            ox8Var.l();
                            kk7.f(ox8Var.a).k(121, new Object[0]);
                            return;
                        default:
                            ox8 ox8Var3 = this.b;
                            ArrayList arrayList5 = ox8Var3.b;
                            int i8 = ox8Var3.a;
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update2).quick_reply;
                            nx8 c3 = ox8Var3.c(tL_quickReply2.shortcut_id);
                            if (c3 != null) {
                                c3.b = tL_quickReply2.shortcut;
                                c3.f = tL_quickReply2.count;
                                c3.d = tL_quickReply2.top_message;
                                k27 k27Var3 = c3.e;
                                if (k27Var3 != null && k27Var3.e1() != tL_quickReply2.top_message) {
                                    c3.e = null;
                                    long e2 = y6c.h(i8).e();
                                    ad7 Y3 = ad7.Y(i8);
                                    Y3.a.c(new mx8(ox8Var3, Y3, c3, e2, (byte) 0));
                                    return;
                                }
                            } else {
                                nx8 nx8Var2 = new nx8();
                                nx8Var2.a = tL_quickReply2.shortcut_id;
                                nx8Var2.b = tL_quickReply2.shortcut;
                                nx8Var2.f = tL_quickReply2.count;
                                nx8Var2.d = tL_quickReply2.top_message;
                                for (int i9 = 0; i9 < arrayList5.size(); i9++) {
                                    ((nx8) arrayList5.get(i9)).c = i9;
                                }
                                arrayList5.add(nx8Var2);
                                ox8Var3.a(nx8Var2.b);
                            }
                            ox8Var3.l();
                            kk7.f(i8).k(121, new Object[0]);
                            return;
                    }
                }
            });
            return true;
        }
    }

    public final void k(int i, String str) {
        nx8 c = c(i);
        if (c == null) {
            return;
        }
        c.b = str;
        TLRPC.TL_messages_editQuickReplyShortcut tL_messages_editQuickReplyShortcut = new TLRPC.TL_messages_editQuickReplyShortcut();
        tL_messages_editQuickReplyShortcut.shortcut_id = i;
        tL_messages_editQuickReplyShortcut.shortcut = str;
        int i2 = this.a;
        ConnectionsManager.getInstance(i2).sendRequest(tL_messages_editQuickReplyShortcut, new ce2((byte) 7));
        l();
        kk7.f(i2).k(kk7.E1, new Object[0]);
    }

    public final void l() {
        ad7 Y = ad7.Y(this.a);
        Y.a.c(new lw8(this, Y, (byte) 4));
    }
}
