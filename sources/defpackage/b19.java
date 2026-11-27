package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
public final class b19 {
    public static volatile b19[] g = new b19[4];
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

    public b19(int i) {
        this.a = i;
    }

    public static b19 f(int i) {
        b19 b19Var;
        b19 b19Var2 = g[i];
        if (b19Var2 == null) {
            synchronized (h[i]) {
                b19Var = g[i];
                if (b19Var == null) {
                    b19[] b19VarArr = g;
                    b19 b19Var3 = new b19(i);
                    b19VarArr[i] = b19Var3;
                    b19Var = b19Var3;
                }
            }
            return b19Var;
        }
        return b19Var2;
    }

    public static boolean g(String str) {
        if (!"hello".equalsIgnoreCase(str) && !"away".equalsIgnoreCase(str)) {
            return false;
        }
        return true;
    }

    public final void a(String str) {
        a19 a19Var;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i < size) {
                Object obj = arrayList.get(i);
                i++;
                a19Var = (a19) obj;
                if (TextUtils.equals(str, a19Var.b)) {
                    break;
                }
            } else {
                a19Var = null;
                break;
            }
        }
        if (a19Var != null) {
            arrayList.remove(a19Var);
            jn7.f(this.a).k(jn7.F1, new Object[0]);
        }
    }

    public final void b(Runnable runnable) {
        if (this.f) {
            runnable.run();
        } else {
            i(runnable, true);
        }
    }

    public final a19 c(long j) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            a19 a19Var = (a19) obj;
            if (a19Var.a == j) {
                return a19Var;
            }
        }
        return null;
    }

    public final a19 d(String str) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            a19 a19Var = (a19) obj;
            if (TextUtils.equals(str, a19Var.b)) {
                return a19Var;
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
                if (!g(((a19) arrayList2.get(i)).b)) {
                    arrayList.add((a19) arrayList2.get(i));
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b19.i(java.lang.Runnable, boolean):void");
    }

    public final boolean j(final TLRPC.Update update, String str, int i) {
        if (update instanceof TL_update.TL_updateQuickReplyMessage) {
            b(new y36(this, ((TL_update.TL_updateQuickReplyMessage) update).message, str, i, (byte) 24));
            return true;
        } else if (update instanceof TL_update.TL_updateQuickReplies) {
            b(new Runnable(this) {
                public final b19 b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    int i2;
                    a19 a19Var;
                    byte b = r3;
                    b19 b19Var = this.b;
                    TLRPC.Update update2 = update;
                    switch (b) {
                        case 0:
                            int i3 = b19Var.a;
                            a19 c = b19Var.c(((TL_update.TL_updateDeleteQuickReply) update2).shortcut_id);
                            if (c != null) {
                                b19Var.b.remove(c);
                                b19Var.a(c.b);
                                int i4 = c.a;
                                kf7 a0 = kf7.a0(i3);
                                a0.a.c(new bd7(a0, i4, (byte) 5));
                                b19Var.l();
                                jn7.f(i3).k(122, new Object[0]);
                                return;
                            }
                            return;
                        case 1:
                            b19 b19Var2 = this.b;
                            int i5 = b19Var2.a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update2;
                            a19 c2 = b19Var2.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c2 != null) {
                                int size = c2.f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c2.f = size;
                                if (size <= 0) {
                                    b19Var2.b.remove(c2);
                                }
                                ArrayList<Integer> arrayList = tL_updateDeleteQuickReplyMessages.messages;
                                r47 r47Var = c2.e;
                                if (r47Var != null) {
                                    i2 = r47Var.e1();
                                } else {
                                    i2 = c2.d;
                                }
                                if (!arrayList.contains(Integer.valueOf(i2)) && c2.e != null) {
                                    b19Var2.l();
                                    jn7.f(i5).k(122, new Object[0]);
                                    return;
                                }
                                c2.e = null;
                                long e = yac.h(i5).e();
                                kf7 a02 = kf7.a0(i5);
                                a02.a.c(new z09(b19Var2, a02, c2, e, (byte) 0));
                                return;
                            }
                            return;
                        case 2:
                            ArrayList<TLRPC.TL_quickReply> arrayList2 = ((TL_update.TL_updateQuickReplies) update2).quick_replies;
                            ArrayList arrayList3 = b19Var.b;
                            ArrayList arrayList4 = new ArrayList(arrayList3);
                            arrayList3.clear();
                            for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList2.get(i6);
                                int i7 = 0;
                                while (true) {
                                    if (i7 < arrayList4.size()) {
                                        if (((a19) arrayList4.get(i7)).a == tL_quickReply.shortcut_id) {
                                            a19Var = (a19) arrayList4.get(i7);
                                        } else {
                                            i7++;
                                        }
                                    } else {
                                        a19Var = null;
                                    }
                                }
                                if (a19Var == null) {
                                    a19Var = new a19();
                                }
                                a19Var.a = tL_quickReply.shortcut_id;
                                a19Var.b = tL_quickReply.shortcut;
                                a19Var.f = tL_quickReply.count;
                                a19Var.c = i6;
                                a19Var.d = tL_quickReply.top_message;
                                r47 r47Var2 = a19Var.e;
                                if (r47Var2 != null && r47Var2.e1() != tL_quickReply.top_message) {
                                    a19Var.e = null;
                                }
                                arrayList3.add(a19Var);
                                b19Var.a(a19Var.b);
                            }
                            b19Var.l();
                            jn7.f(b19Var.a).k(122, new Object[0]);
                            return;
                        default:
                            b19 b19Var3 = this.b;
                            ArrayList arrayList5 = b19Var3.b;
                            int i8 = b19Var3.a;
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update2).quick_reply;
                            a19 c3 = b19Var3.c(tL_quickReply2.shortcut_id);
                            if (c3 != null) {
                                c3.b = tL_quickReply2.shortcut;
                                c3.f = tL_quickReply2.count;
                                c3.d = tL_quickReply2.top_message;
                                r47 r47Var3 = c3.e;
                                if (r47Var3 != null && r47Var3.e1() != tL_quickReply2.top_message) {
                                    c3.e = null;
                                    long e2 = yac.h(i8).e();
                                    kf7 a03 = kf7.a0(i8);
                                    a03.a.c(new z09(b19Var3, a03, c3, e2, (byte) 0));
                                    return;
                                }
                            } else {
                                a19 a19Var2 = new a19();
                                a19Var2.a = tL_quickReply2.shortcut_id;
                                a19Var2.b = tL_quickReply2.shortcut;
                                a19Var2.f = tL_quickReply2.count;
                                a19Var2.d = tL_quickReply2.top_message;
                                for (int i9 = 0; i9 < arrayList5.size(); i9++) {
                                    ((a19) arrayList5.get(i9)).c = i9;
                                }
                                arrayList5.add(a19Var2);
                                b19Var3.a(a19Var2.b);
                            }
                            b19Var3.l();
                            jn7.f(i8).k(122, new Object[0]);
                            return;
                    }
                }
            });
            return true;
        } else if (update instanceof TL_update.TL_updateNewQuickReply) {
            b(new Runnable(this) {
                public final b19 b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    int i2;
                    a19 a19Var;
                    byte b = r3;
                    b19 b19Var = this.b;
                    TLRPC.Update update2 = update;
                    switch (b) {
                        case 0:
                            int i3 = b19Var.a;
                            a19 c = b19Var.c(((TL_update.TL_updateDeleteQuickReply) update2).shortcut_id);
                            if (c != null) {
                                b19Var.b.remove(c);
                                b19Var.a(c.b);
                                int i4 = c.a;
                                kf7 a0 = kf7.a0(i3);
                                a0.a.c(new bd7(a0, i4, (byte) 5));
                                b19Var.l();
                                jn7.f(i3).k(122, new Object[0]);
                                return;
                            }
                            return;
                        case 1:
                            b19 b19Var2 = this.b;
                            int i5 = b19Var2.a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update2;
                            a19 c2 = b19Var2.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c2 != null) {
                                int size = c2.f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c2.f = size;
                                if (size <= 0) {
                                    b19Var2.b.remove(c2);
                                }
                                ArrayList<Integer> arrayList = tL_updateDeleteQuickReplyMessages.messages;
                                r47 r47Var = c2.e;
                                if (r47Var != null) {
                                    i2 = r47Var.e1();
                                } else {
                                    i2 = c2.d;
                                }
                                if (!arrayList.contains(Integer.valueOf(i2)) && c2.e != null) {
                                    b19Var2.l();
                                    jn7.f(i5).k(122, new Object[0]);
                                    return;
                                }
                                c2.e = null;
                                long e = yac.h(i5).e();
                                kf7 a02 = kf7.a0(i5);
                                a02.a.c(new z09(b19Var2, a02, c2, e, (byte) 0));
                                return;
                            }
                            return;
                        case 2:
                            ArrayList<TLRPC.TL_quickReply> arrayList2 = ((TL_update.TL_updateQuickReplies) update2).quick_replies;
                            ArrayList arrayList3 = b19Var.b;
                            ArrayList arrayList4 = new ArrayList(arrayList3);
                            arrayList3.clear();
                            for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList2.get(i6);
                                int i7 = 0;
                                while (true) {
                                    if (i7 < arrayList4.size()) {
                                        if (((a19) arrayList4.get(i7)).a == tL_quickReply.shortcut_id) {
                                            a19Var = (a19) arrayList4.get(i7);
                                        } else {
                                            i7++;
                                        }
                                    } else {
                                        a19Var = null;
                                    }
                                }
                                if (a19Var == null) {
                                    a19Var = new a19();
                                }
                                a19Var.a = tL_quickReply.shortcut_id;
                                a19Var.b = tL_quickReply.shortcut;
                                a19Var.f = tL_quickReply.count;
                                a19Var.c = i6;
                                a19Var.d = tL_quickReply.top_message;
                                r47 r47Var2 = a19Var.e;
                                if (r47Var2 != null && r47Var2.e1() != tL_quickReply.top_message) {
                                    a19Var.e = null;
                                }
                                arrayList3.add(a19Var);
                                b19Var.a(a19Var.b);
                            }
                            b19Var.l();
                            jn7.f(b19Var.a).k(122, new Object[0]);
                            return;
                        default:
                            b19 b19Var3 = this.b;
                            ArrayList arrayList5 = b19Var3.b;
                            int i8 = b19Var3.a;
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update2).quick_reply;
                            a19 c3 = b19Var3.c(tL_quickReply2.shortcut_id);
                            if (c3 != null) {
                                c3.b = tL_quickReply2.shortcut;
                                c3.f = tL_quickReply2.count;
                                c3.d = tL_quickReply2.top_message;
                                r47 r47Var3 = c3.e;
                                if (r47Var3 != null && r47Var3.e1() != tL_quickReply2.top_message) {
                                    c3.e = null;
                                    long e2 = yac.h(i8).e();
                                    kf7 a03 = kf7.a0(i8);
                                    a03.a.c(new z09(b19Var3, a03, c3, e2, (byte) 0));
                                    return;
                                }
                            } else {
                                a19 a19Var2 = new a19();
                                a19Var2.a = tL_quickReply2.shortcut_id;
                                a19Var2.b = tL_quickReply2.shortcut;
                                a19Var2.f = tL_quickReply2.count;
                                a19Var2.d = tL_quickReply2.top_message;
                                for (int i9 = 0; i9 < arrayList5.size(); i9++) {
                                    ((a19) arrayList5.get(i9)).c = i9;
                                }
                                arrayList5.add(a19Var2);
                                b19Var3.a(a19Var2.b);
                            }
                            b19Var3.l();
                            jn7.f(i8).k(122, new Object[0]);
                            return;
                    }
                }
            });
            return true;
        } else if (update instanceof TL_update.TL_updateDeleteQuickReply) {
            b(new Runnable(this) {
                public final b19 b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    int i2;
                    a19 a19Var;
                    byte b = r3;
                    b19 b19Var = this.b;
                    TLRPC.Update update2 = update;
                    switch (b) {
                        case 0:
                            int i3 = b19Var.a;
                            a19 c = b19Var.c(((TL_update.TL_updateDeleteQuickReply) update2).shortcut_id);
                            if (c != null) {
                                b19Var.b.remove(c);
                                b19Var.a(c.b);
                                int i4 = c.a;
                                kf7 a0 = kf7.a0(i3);
                                a0.a.c(new bd7(a0, i4, (byte) 5));
                                b19Var.l();
                                jn7.f(i3).k(122, new Object[0]);
                                return;
                            }
                            return;
                        case 1:
                            b19 b19Var2 = this.b;
                            int i5 = b19Var2.a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update2;
                            a19 c2 = b19Var2.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c2 != null) {
                                int size = c2.f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c2.f = size;
                                if (size <= 0) {
                                    b19Var2.b.remove(c2);
                                }
                                ArrayList<Integer> arrayList = tL_updateDeleteQuickReplyMessages.messages;
                                r47 r47Var = c2.e;
                                if (r47Var != null) {
                                    i2 = r47Var.e1();
                                } else {
                                    i2 = c2.d;
                                }
                                if (!arrayList.contains(Integer.valueOf(i2)) && c2.e != null) {
                                    b19Var2.l();
                                    jn7.f(i5).k(122, new Object[0]);
                                    return;
                                }
                                c2.e = null;
                                long e = yac.h(i5).e();
                                kf7 a02 = kf7.a0(i5);
                                a02.a.c(new z09(b19Var2, a02, c2, e, (byte) 0));
                                return;
                            }
                            return;
                        case 2:
                            ArrayList<TLRPC.TL_quickReply> arrayList2 = ((TL_update.TL_updateQuickReplies) update2).quick_replies;
                            ArrayList arrayList3 = b19Var.b;
                            ArrayList arrayList4 = new ArrayList(arrayList3);
                            arrayList3.clear();
                            for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList2.get(i6);
                                int i7 = 0;
                                while (true) {
                                    if (i7 < arrayList4.size()) {
                                        if (((a19) arrayList4.get(i7)).a == tL_quickReply.shortcut_id) {
                                            a19Var = (a19) arrayList4.get(i7);
                                        } else {
                                            i7++;
                                        }
                                    } else {
                                        a19Var = null;
                                    }
                                }
                                if (a19Var == null) {
                                    a19Var = new a19();
                                }
                                a19Var.a = tL_quickReply.shortcut_id;
                                a19Var.b = tL_quickReply.shortcut;
                                a19Var.f = tL_quickReply.count;
                                a19Var.c = i6;
                                a19Var.d = tL_quickReply.top_message;
                                r47 r47Var2 = a19Var.e;
                                if (r47Var2 != null && r47Var2.e1() != tL_quickReply.top_message) {
                                    a19Var.e = null;
                                }
                                arrayList3.add(a19Var);
                                b19Var.a(a19Var.b);
                            }
                            b19Var.l();
                            jn7.f(b19Var.a).k(122, new Object[0]);
                            return;
                        default:
                            b19 b19Var3 = this.b;
                            ArrayList arrayList5 = b19Var3.b;
                            int i8 = b19Var3.a;
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update2).quick_reply;
                            a19 c3 = b19Var3.c(tL_quickReply2.shortcut_id);
                            if (c3 != null) {
                                c3.b = tL_quickReply2.shortcut;
                                c3.f = tL_quickReply2.count;
                                c3.d = tL_quickReply2.top_message;
                                r47 r47Var3 = c3.e;
                                if (r47Var3 != null && r47Var3.e1() != tL_quickReply2.top_message) {
                                    c3.e = null;
                                    long e2 = yac.h(i8).e();
                                    kf7 a03 = kf7.a0(i8);
                                    a03.a.c(new z09(b19Var3, a03, c3, e2, (byte) 0));
                                    return;
                                }
                            } else {
                                a19 a19Var2 = new a19();
                                a19Var2.a = tL_quickReply2.shortcut_id;
                                a19Var2.b = tL_quickReply2.shortcut;
                                a19Var2.f = tL_quickReply2.count;
                                a19Var2.d = tL_quickReply2.top_message;
                                for (int i9 = 0; i9 < arrayList5.size(); i9++) {
                                    ((a19) arrayList5.get(i9)).c = i9;
                                }
                                arrayList5.add(a19Var2);
                                b19Var3.a(a19Var2.b);
                            }
                            b19Var3.l();
                            jn7.f(i8).k(122, new Object[0]);
                            return;
                    }
                }
            });
            return true;
        } else if (!(update instanceof TL_update.TL_updateDeleteQuickReplyMessages)) {
            return false;
        } else {
            b(new Runnable(this) {
                public final b19 b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    int i2;
                    a19 a19Var;
                    byte b = r3;
                    b19 b19Var = this.b;
                    TLRPC.Update update2 = update;
                    switch (b) {
                        case 0:
                            int i3 = b19Var.a;
                            a19 c = b19Var.c(((TL_update.TL_updateDeleteQuickReply) update2).shortcut_id);
                            if (c != null) {
                                b19Var.b.remove(c);
                                b19Var.a(c.b);
                                int i4 = c.a;
                                kf7 a0 = kf7.a0(i3);
                                a0.a.c(new bd7(a0, i4, (byte) 5));
                                b19Var.l();
                                jn7.f(i3).k(122, new Object[0]);
                                return;
                            }
                            return;
                        case 1:
                            b19 b19Var2 = this.b;
                            int i5 = b19Var2.a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update2;
                            a19 c2 = b19Var2.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c2 != null) {
                                int size = c2.f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c2.f = size;
                                if (size <= 0) {
                                    b19Var2.b.remove(c2);
                                }
                                ArrayList<Integer> arrayList = tL_updateDeleteQuickReplyMessages.messages;
                                r47 r47Var = c2.e;
                                if (r47Var != null) {
                                    i2 = r47Var.e1();
                                } else {
                                    i2 = c2.d;
                                }
                                if (!arrayList.contains(Integer.valueOf(i2)) && c2.e != null) {
                                    b19Var2.l();
                                    jn7.f(i5).k(122, new Object[0]);
                                    return;
                                }
                                c2.e = null;
                                long e = yac.h(i5).e();
                                kf7 a02 = kf7.a0(i5);
                                a02.a.c(new z09(b19Var2, a02, c2, e, (byte) 0));
                                return;
                            }
                            return;
                        case 2:
                            ArrayList<TLRPC.TL_quickReply> arrayList2 = ((TL_update.TL_updateQuickReplies) update2).quick_replies;
                            ArrayList arrayList3 = b19Var.b;
                            ArrayList arrayList4 = new ArrayList(arrayList3);
                            arrayList3.clear();
                            for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList2.get(i6);
                                int i7 = 0;
                                while (true) {
                                    if (i7 < arrayList4.size()) {
                                        if (((a19) arrayList4.get(i7)).a == tL_quickReply.shortcut_id) {
                                            a19Var = (a19) arrayList4.get(i7);
                                        } else {
                                            i7++;
                                        }
                                    } else {
                                        a19Var = null;
                                    }
                                }
                                if (a19Var == null) {
                                    a19Var = new a19();
                                }
                                a19Var.a = tL_quickReply.shortcut_id;
                                a19Var.b = tL_quickReply.shortcut;
                                a19Var.f = tL_quickReply.count;
                                a19Var.c = i6;
                                a19Var.d = tL_quickReply.top_message;
                                r47 r47Var2 = a19Var.e;
                                if (r47Var2 != null && r47Var2.e1() != tL_quickReply.top_message) {
                                    a19Var.e = null;
                                }
                                arrayList3.add(a19Var);
                                b19Var.a(a19Var.b);
                            }
                            b19Var.l();
                            jn7.f(b19Var.a).k(122, new Object[0]);
                            return;
                        default:
                            b19 b19Var3 = this.b;
                            ArrayList arrayList5 = b19Var3.b;
                            int i8 = b19Var3.a;
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update2).quick_reply;
                            a19 c3 = b19Var3.c(tL_quickReply2.shortcut_id);
                            if (c3 != null) {
                                c3.b = tL_quickReply2.shortcut;
                                c3.f = tL_quickReply2.count;
                                c3.d = tL_quickReply2.top_message;
                                r47 r47Var3 = c3.e;
                                if (r47Var3 != null && r47Var3.e1() != tL_quickReply2.top_message) {
                                    c3.e = null;
                                    long e2 = yac.h(i8).e();
                                    kf7 a03 = kf7.a0(i8);
                                    a03.a.c(new z09(b19Var3, a03, c3, e2, (byte) 0));
                                    return;
                                }
                            } else {
                                a19 a19Var2 = new a19();
                                a19Var2.a = tL_quickReply2.shortcut_id;
                                a19Var2.b = tL_quickReply2.shortcut;
                                a19Var2.f = tL_quickReply2.count;
                                a19Var2.d = tL_quickReply2.top_message;
                                for (int i9 = 0; i9 < arrayList5.size(); i9++) {
                                    ((a19) arrayList5.get(i9)).c = i9;
                                }
                                arrayList5.add(a19Var2);
                                b19Var3.a(a19Var2.b);
                            }
                            b19Var3.l();
                            jn7.f(i8).k(122, new Object[0]);
                            return;
                    }
                }
            });
            return true;
        }
    }

    public final void k(int i, String str) {
        a19 c = c(i);
        if (c == null) {
            return;
        }
        c.b = str;
        TLRPC.TL_messages_editQuickReplyShortcut tL_messages_editQuickReplyShortcut = new TLRPC.TL_messages_editQuickReplyShortcut();
        tL_messages_editQuickReplyShortcut.shortcut_id = i;
        tL_messages_editQuickReplyShortcut.shortcut = str;
        int i2 = this.a;
        ConnectionsManager.getInstance(i2).sendRequest(tL_messages_editQuickReplyShortcut, new xe2((byte) 7));
        l();
        jn7.f(i2).k(jn7.F1, new Object[0]);
    }

    public final void l() {
        kf7 a0 = kf7.a0(this.a);
        a0.a.c(new yz8(this, a0, (byte) 3));
    }
}
