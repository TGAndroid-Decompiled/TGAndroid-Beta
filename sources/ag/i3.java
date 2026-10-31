package ag;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.d20;
import org.telegram.messenger.hs;
import org.telegram.messenger.jj;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
public final class i3 {
    public static volatile i3[] f565g = new i3[4];
    public static final Object[] h = new Object[4];
    public final int f566a;
    public final ArrayList f567b = new ArrayList();
    public final ArrayList f568c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public boolean e;
    public boolean f569f;

    static {
        for (int i10 = 0; i10 < 4; i10++) {
            h[i10] = new Object();
        }
    }

    public i3(int i10) {
        this.f566a = i10;
    }

    public static i3 f(int i10) {
        i3 i3Var;
        i3 i3Var2 = f565g[i10];
        if (i3Var2 == null) {
            synchronized (h[i10]) {
                try {
                    i3Var = f565g[i10];
                    if (i3Var == null) {
                        i3[] i3VarArr = f565g;
                        i3 i3Var3 = new i3(i10);
                        i3VarArr[i10] = i3Var3;
                        i3Var = i3Var3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return i3Var;
        }
        return i3Var2;
    }

    public static boolean g(String str) {
        if (!"hello".equalsIgnoreCase(str) && !"away".equalsIgnoreCase(str)) {
            return false;
        }
        return true;
    }

    public final void a(String str) {
        h3 h3Var;
        ArrayList arrayList = this.f568c;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                h3Var = (h3) obj;
                if (TextUtils.equals(str, h3Var.f552b)) {
                    break;
                }
            } else {
                h3Var = null;
                break;
            }
        }
        if (h3Var != null) {
            arrayList.remove(h3Var);
            zs.f(this.f566a).k(zs.F1, new Object[0]);
        }
    }

    public final void b(Runnable runnable) {
        if (this.f569f) {
            runnable.run();
        } else {
            i(runnable, true);
        }
    }

    public final h3 c(long j10) {
        ArrayList arrayList = this.f567b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            h3 h3Var = (h3) obj;
            if (h3Var.f551a == j10) {
                return h3Var;
            }
        }
        return null;
    }

    public final h3 d(String str) {
        ArrayList arrayList = this.f567b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            h3 h3Var = (h3) obj;
            if (TextUtils.equals(str, h3Var.f552b)) {
                return h3Var;
            }
        }
        return null;
    }

    public final ArrayList e() {
        ArrayList arrayList = this.d;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f567b;
            if (i10 < arrayList2.size()) {
                if (!g(((h3) arrayList2.get(i10)).f552b)) {
                    arrayList.add((h3) arrayList2.get(i10));
                }
                i10++;
            } else {
                return arrayList;
            }
        }
    }

    public final void h() {
        i(null, true);
    }

    public final void i(java.lang.Runnable r37, boolean r38) {
        throw new UnsupportedOperationException("Method not decompiled: ag.i3.i(java.lang.Runnable, boolean):void");
    }

    public final boolean j(final TLRPC.Update update, String str, int i10) {
        if (update instanceof TL_update.TL_updateQuickReplyMessage) {
            b(new g3(this, ((TL_update.TL_updateQuickReplyMessage) update).message, str, i10, 0));
            return true;
        } else if (update instanceof TL_update.TL_updateQuickReplies) {
            b(new Runnable(this) {
                public final i3 f472b;

                {
                    this.f472b = this;
                }

                @Override
                public final void run() {
                    int i11;
                    h3 h3Var;
                    switch (r3) {
                        case 0:
                            i3 i3Var = this.f472b;
                            ArrayList arrayList = i3Var.f567b;
                            int i12 = i3Var.f566a;
                            TLRPC.TL_quickReply tL_quickReply = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            h3 c10 = i3Var.c(tL_quickReply.shortcut_id);
                            if (c10 != null) {
                                c10.f552b = tL_quickReply.shortcut;
                                c10.f554f = tL_quickReply.count;
                                c10.d = tL_quickReply.top_message;
                                jj jjVar = c10.e;
                                if (jjVar != null && jjVar.f1() != tL_quickReply.top_message) {
                                    c10.e = null;
                                    long e = d20.i(i12).e();
                                    hs a02 = hs.a0(i12);
                                    a02.f15938a.c(new a3(i3Var, a02, c10, e, 1));
                                    return;
                                }
                            } else {
                                h3 h3Var2 = new h3();
                                h3Var2.f551a = tL_quickReply.shortcut_id;
                                h3Var2.f552b = tL_quickReply.shortcut;
                                h3Var2.f554f = tL_quickReply.count;
                                h3Var2.d = tL_quickReply.top_message;
                                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                                    ((h3) arrayList.get(i13)).f553c = i13;
                                }
                                arrayList.add(h3Var2);
                                i3Var.a(h3Var2.f552b);
                            }
                            i3Var.l();
                            zs.f(i12).k(121, new Object[0]);
                            return;
                        case 1:
                            i3 i3Var2 = this.f472b;
                            int i14 = i3Var2.f566a;
                            h3 c11 = i3Var2.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c11 != null) {
                                i3Var2.f567b.remove(c11);
                                i3Var2.a(c11.f552b);
                                int i15 = c11.f551a;
                                hs a03 = hs.a0(i14);
                                a03.f15938a.c(new d3(a03, i15, 0));
                                i3Var2.l();
                                zs.f(i14).k(121, new Object[0]);
                                return;
                            }
                            return;
                        case 2:
                            i3 i3Var3 = this.f472b;
                            int i16 = i3Var3.f566a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            h3 c12 = i3Var3.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c12 != null) {
                                int size = c12.f554f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c12.f554f = size;
                                if (size <= 0) {
                                    i3Var3.f567b.remove(c12);
                                }
                                ArrayList<Integer> arrayList2 = tL_updateDeleteQuickReplyMessages.messages;
                                jj jjVar2 = c12.e;
                                if (jjVar2 != null) {
                                    i11 = jjVar2.f1();
                                } else {
                                    i11 = c12.d;
                                }
                                if (!arrayList2.contains(Integer.valueOf(i11)) && c12.e != null) {
                                    i3Var3.l();
                                    zs.f(i16).k(121, new Object[0]);
                                    return;
                                }
                                c12.e = null;
                                long e7 = d20.i(i16).e();
                                hs a04 = hs.a0(i16);
                                a04.f15938a.c(new a3(i3Var3, a04, c12, e7, 1));
                                return;
                            }
                            return;
                        default:
                            ArrayList<TLRPC.TL_quickReply> arrayList3 = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            i3 i3Var4 = this.f472b;
                            ArrayList arrayList4 = i3Var4.f567b;
                            ArrayList arrayList5 = new ArrayList(arrayList4);
                            arrayList4.clear();
                            for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                                TLRPC.TL_quickReply tL_quickReply2 = arrayList3.get(i17);
                                int i18 = 0;
                                while (true) {
                                    if (i18 < arrayList5.size()) {
                                        if (((h3) arrayList5.get(i18)).f551a == tL_quickReply2.shortcut_id) {
                                            h3Var = (h3) arrayList5.get(i18);
                                        } else {
                                            i18++;
                                        }
                                    } else {
                                        h3Var = null;
                                    }
                                }
                                if (h3Var == null) {
                                    h3Var = new h3();
                                }
                                h3Var.f551a = tL_quickReply2.shortcut_id;
                                h3Var.f552b = tL_quickReply2.shortcut;
                                h3Var.f554f = tL_quickReply2.count;
                                h3Var.f553c = i17;
                                h3Var.d = tL_quickReply2.top_message;
                                jj jjVar3 = h3Var.e;
                                if (jjVar3 != null && jjVar3.f1() != tL_quickReply2.top_message) {
                                    h3Var.e = null;
                                }
                                arrayList4.add(h3Var);
                                i3Var4.a(h3Var.f552b);
                            }
                            i3Var4.l();
                            zs.f(i3Var4.f566a).k(121, new Object[0]);
                            return;
                    }
                }
            });
            return true;
        } else if (update instanceof TL_update.TL_updateNewQuickReply) {
            b(new Runnable(this) {
                public final i3 f472b;

                {
                    this.f472b = this;
                }

                @Override
                public final void run() {
                    int i11;
                    h3 h3Var;
                    switch (r3) {
                        case 0:
                            i3 i3Var = this.f472b;
                            ArrayList arrayList = i3Var.f567b;
                            int i12 = i3Var.f566a;
                            TLRPC.TL_quickReply tL_quickReply = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            h3 c10 = i3Var.c(tL_quickReply.shortcut_id);
                            if (c10 != null) {
                                c10.f552b = tL_quickReply.shortcut;
                                c10.f554f = tL_quickReply.count;
                                c10.d = tL_quickReply.top_message;
                                jj jjVar = c10.e;
                                if (jjVar != null && jjVar.f1() != tL_quickReply.top_message) {
                                    c10.e = null;
                                    long e = d20.i(i12).e();
                                    hs a02 = hs.a0(i12);
                                    a02.f15938a.c(new a3(i3Var, a02, c10, e, 1));
                                    return;
                                }
                            } else {
                                h3 h3Var2 = new h3();
                                h3Var2.f551a = tL_quickReply.shortcut_id;
                                h3Var2.f552b = tL_quickReply.shortcut;
                                h3Var2.f554f = tL_quickReply.count;
                                h3Var2.d = tL_quickReply.top_message;
                                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                                    ((h3) arrayList.get(i13)).f553c = i13;
                                }
                                arrayList.add(h3Var2);
                                i3Var.a(h3Var2.f552b);
                            }
                            i3Var.l();
                            zs.f(i12).k(121, new Object[0]);
                            return;
                        case 1:
                            i3 i3Var2 = this.f472b;
                            int i14 = i3Var2.f566a;
                            h3 c11 = i3Var2.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c11 != null) {
                                i3Var2.f567b.remove(c11);
                                i3Var2.a(c11.f552b);
                                int i15 = c11.f551a;
                                hs a03 = hs.a0(i14);
                                a03.f15938a.c(new d3(a03, i15, 0));
                                i3Var2.l();
                                zs.f(i14).k(121, new Object[0]);
                                return;
                            }
                            return;
                        case 2:
                            i3 i3Var3 = this.f472b;
                            int i16 = i3Var3.f566a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            h3 c12 = i3Var3.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c12 != null) {
                                int size = c12.f554f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c12.f554f = size;
                                if (size <= 0) {
                                    i3Var3.f567b.remove(c12);
                                }
                                ArrayList<Integer> arrayList2 = tL_updateDeleteQuickReplyMessages.messages;
                                jj jjVar2 = c12.e;
                                if (jjVar2 != null) {
                                    i11 = jjVar2.f1();
                                } else {
                                    i11 = c12.d;
                                }
                                if (!arrayList2.contains(Integer.valueOf(i11)) && c12.e != null) {
                                    i3Var3.l();
                                    zs.f(i16).k(121, new Object[0]);
                                    return;
                                }
                                c12.e = null;
                                long e7 = d20.i(i16).e();
                                hs a04 = hs.a0(i16);
                                a04.f15938a.c(new a3(i3Var3, a04, c12, e7, 1));
                                return;
                            }
                            return;
                        default:
                            ArrayList<TLRPC.TL_quickReply> arrayList3 = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            i3 i3Var4 = this.f472b;
                            ArrayList arrayList4 = i3Var4.f567b;
                            ArrayList arrayList5 = new ArrayList(arrayList4);
                            arrayList4.clear();
                            for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                                TLRPC.TL_quickReply tL_quickReply2 = arrayList3.get(i17);
                                int i18 = 0;
                                while (true) {
                                    if (i18 < arrayList5.size()) {
                                        if (((h3) arrayList5.get(i18)).f551a == tL_quickReply2.shortcut_id) {
                                            h3Var = (h3) arrayList5.get(i18);
                                        } else {
                                            i18++;
                                        }
                                    } else {
                                        h3Var = null;
                                    }
                                }
                                if (h3Var == null) {
                                    h3Var = new h3();
                                }
                                h3Var.f551a = tL_quickReply2.shortcut_id;
                                h3Var.f552b = tL_quickReply2.shortcut;
                                h3Var.f554f = tL_quickReply2.count;
                                h3Var.f553c = i17;
                                h3Var.d = tL_quickReply2.top_message;
                                jj jjVar3 = h3Var.e;
                                if (jjVar3 != null && jjVar3.f1() != tL_quickReply2.top_message) {
                                    h3Var.e = null;
                                }
                                arrayList4.add(h3Var);
                                i3Var4.a(h3Var.f552b);
                            }
                            i3Var4.l();
                            zs.f(i3Var4.f566a).k(121, new Object[0]);
                            return;
                    }
                }
            });
            return true;
        } else if (update instanceof TL_update.TL_updateDeleteQuickReply) {
            b(new Runnable(this) {
                public final i3 f472b;

                {
                    this.f472b = this;
                }

                @Override
                public final void run() {
                    int i11;
                    h3 h3Var;
                    switch (r3) {
                        case 0:
                            i3 i3Var = this.f472b;
                            ArrayList arrayList = i3Var.f567b;
                            int i12 = i3Var.f566a;
                            TLRPC.TL_quickReply tL_quickReply = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            h3 c10 = i3Var.c(tL_quickReply.shortcut_id);
                            if (c10 != null) {
                                c10.f552b = tL_quickReply.shortcut;
                                c10.f554f = tL_quickReply.count;
                                c10.d = tL_quickReply.top_message;
                                jj jjVar = c10.e;
                                if (jjVar != null && jjVar.f1() != tL_quickReply.top_message) {
                                    c10.e = null;
                                    long e = d20.i(i12).e();
                                    hs a02 = hs.a0(i12);
                                    a02.f15938a.c(new a3(i3Var, a02, c10, e, 1));
                                    return;
                                }
                            } else {
                                h3 h3Var2 = new h3();
                                h3Var2.f551a = tL_quickReply.shortcut_id;
                                h3Var2.f552b = tL_quickReply.shortcut;
                                h3Var2.f554f = tL_quickReply.count;
                                h3Var2.d = tL_quickReply.top_message;
                                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                                    ((h3) arrayList.get(i13)).f553c = i13;
                                }
                                arrayList.add(h3Var2);
                                i3Var.a(h3Var2.f552b);
                            }
                            i3Var.l();
                            zs.f(i12).k(121, new Object[0]);
                            return;
                        case 1:
                            i3 i3Var2 = this.f472b;
                            int i14 = i3Var2.f566a;
                            h3 c11 = i3Var2.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c11 != null) {
                                i3Var2.f567b.remove(c11);
                                i3Var2.a(c11.f552b);
                                int i15 = c11.f551a;
                                hs a03 = hs.a0(i14);
                                a03.f15938a.c(new d3(a03, i15, 0));
                                i3Var2.l();
                                zs.f(i14).k(121, new Object[0]);
                                return;
                            }
                            return;
                        case 2:
                            i3 i3Var3 = this.f472b;
                            int i16 = i3Var3.f566a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            h3 c12 = i3Var3.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c12 != null) {
                                int size = c12.f554f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c12.f554f = size;
                                if (size <= 0) {
                                    i3Var3.f567b.remove(c12);
                                }
                                ArrayList<Integer> arrayList2 = tL_updateDeleteQuickReplyMessages.messages;
                                jj jjVar2 = c12.e;
                                if (jjVar2 != null) {
                                    i11 = jjVar2.f1();
                                } else {
                                    i11 = c12.d;
                                }
                                if (!arrayList2.contains(Integer.valueOf(i11)) && c12.e != null) {
                                    i3Var3.l();
                                    zs.f(i16).k(121, new Object[0]);
                                    return;
                                }
                                c12.e = null;
                                long e7 = d20.i(i16).e();
                                hs a04 = hs.a0(i16);
                                a04.f15938a.c(new a3(i3Var3, a04, c12, e7, 1));
                                return;
                            }
                            return;
                        default:
                            ArrayList<TLRPC.TL_quickReply> arrayList3 = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            i3 i3Var4 = this.f472b;
                            ArrayList arrayList4 = i3Var4.f567b;
                            ArrayList arrayList5 = new ArrayList(arrayList4);
                            arrayList4.clear();
                            for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                                TLRPC.TL_quickReply tL_quickReply2 = arrayList3.get(i17);
                                int i18 = 0;
                                while (true) {
                                    if (i18 < arrayList5.size()) {
                                        if (((h3) arrayList5.get(i18)).f551a == tL_quickReply2.shortcut_id) {
                                            h3Var = (h3) arrayList5.get(i18);
                                        } else {
                                            i18++;
                                        }
                                    } else {
                                        h3Var = null;
                                    }
                                }
                                if (h3Var == null) {
                                    h3Var = new h3();
                                }
                                h3Var.f551a = tL_quickReply2.shortcut_id;
                                h3Var.f552b = tL_quickReply2.shortcut;
                                h3Var.f554f = tL_quickReply2.count;
                                h3Var.f553c = i17;
                                h3Var.d = tL_quickReply2.top_message;
                                jj jjVar3 = h3Var.e;
                                if (jjVar3 != null && jjVar3.f1() != tL_quickReply2.top_message) {
                                    h3Var.e = null;
                                }
                                arrayList4.add(h3Var);
                                i3Var4.a(h3Var.f552b);
                            }
                            i3Var4.l();
                            zs.f(i3Var4.f566a).k(121, new Object[0]);
                            return;
                    }
                }
            });
            return true;
        } else if (update instanceof TL_update.TL_updateDeleteQuickReplyMessages) {
            b(new Runnable(this) {
                public final i3 f472b;

                {
                    this.f472b = this;
                }

                @Override
                public final void run() {
                    int i11;
                    h3 h3Var;
                    switch (r3) {
                        case 0:
                            i3 i3Var = this.f472b;
                            ArrayList arrayList = i3Var.f567b;
                            int i12 = i3Var.f566a;
                            TLRPC.TL_quickReply tL_quickReply = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            h3 c10 = i3Var.c(tL_quickReply.shortcut_id);
                            if (c10 != null) {
                                c10.f552b = tL_quickReply.shortcut;
                                c10.f554f = tL_quickReply.count;
                                c10.d = tL_quickReply.top_message;
                                jj jjVar = c10.e;
                                if (jjVar != null && jjVar.f1() != tL_quickReply.top_message) {
                                    c10.e = null;
                                    long e = d20.i(i12).e();
                                    hs a02 = hs.a0(i12);
                                    a02.f15938a.c(new a3(i3Var, a02, c10, e, 1));
                                    return;
                                }
                            } else {
                                h3 h3Var2 = new h3();
                                h3Var2.f551a = tL_quickReply.shortcut_id;
                                h3Var2.f552b = tL_quickReply.shortcut;
                                h3Var2.f554f = tL_quickReply.count;
                                h3Var2.d = tL_quickReply.top_message;
                                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                                    ((h3) arrayList.get(i13)).f553c = i13;
                                }
                                arrayList.add(h3Var2);
                                i3Var.a(h3Var2.f552b);
                            }
                            i3Var.l();
                            zs.f(i12).k(121, new Object[0]);
                            return;
                        case 1:
                            i3 i3Var2 = this.f472b;
                            int i14 = i3Var2.f566a;
                            h3 c11 = i3Var2.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c11 != null) {
                                i3Var2.f567b.remove(c11);
                                i3Var2.a(c11.f552b);
                                int i15 = c11.f551a;
                                hs a03 = hs.a0(i14);
                                a03.f15938a.c(new d3(a03, i15, 0));
                                i3Var2.l();
                                zs.f(i14).k(121, new Object[0]);
                                return;
                            }
                            return;
                        case 2:
                            i3 i3Var3 = this.f472b;
                            int i16 = i3Var3.f566a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            h3 c12 = i3Var3.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c12 != null) {
                                int size = c12.f554f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c12.f554f = size;
                                if (size <= 0) {
                                    i3Var3.f567b.remove(c12);
                                }
                                ArrayList<Integer> arrayList2 = tL_updateDeleteQuickReplyMessages.messages;
                                jj jjVar2 = c12.e;
                                if (jjVar2 != null) {
                                    i11 = jjVar2.f1();
                                } else {
                                    i11 = c12.d;
                                }
                                if (!arrayList2.contains(Integer.valueOf(i11)) && c12.e != null) {
                                    i3Var3.l();
                                    zs.f(i16).k(121, new Object[0]);
                                    return;
                                }
                                c12.e = null;
                                long e7 = d20.i(i16).e();
                                hs a04 = hs.a0(i16);
                                a04.f15938a.c(new a3(i3Var3, a04, c12, e7, 1));
                                return;
                            }
                            return;
                        default:
                            ArrayList<TLRPC.TL_quickReply> arrayList3 = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            i3 i3Var4 = this.f472b;
                            ArrayList arrayList4 = i3Var4.f567b;
                            ArrayList arrayList5 = new ArrayList(arrayList4);
                            arrayList4.clear();
                            for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                                TLRPC.TL_quickReply tL_quickReply2 = arrayList3.get(i17);
                                int i18 = 0;
                                while (true) {
                                    if (i18 < arrayList5.size()) {
                                        if (((h3) arrayList5.get(i18)).f551a == tL_quickReply2.shortcut_id) {
                                            h3Var = (h3) arrayList5.get(i18);
                                        } else {
                                            i18++;
                                        }
                                    } else {
                                        h3Var = null;
                                    }
                                }
                                if (h3Var == null) {
                                    h3Var = new h3();
                                }
                                h3Var.f551a = tL_quickReply2.shortcut_id;
                                h3Var.f552b = tL_quickReply2.shortcut;
                                h3Var.f554f = tL_quickReply2.count;
                                h3Var.f553c = i17;
                                h3Var.d = tL_quickReply2.top_message;
                                jj jjVar3 = h3Var.e;
                                if (jjVar3 != null && jjVar3.f1() != tL_quickReply2.top_message) {
                                    h3Var.e = null;
                                }
                                arrayList4.add(h3Var);
                                i3Var4.a(h3Var.f552b);
                            }
                            i3Var4.l();
                            zs.f(i3Var4.f566a).k(121, new Object[0]);
                            return;
                    }
                }
            });
            return true;
        } else {
            return false;
        }
    }

    public final void k(int i10, String str) {
        h3 c10 = c(i10);
        if (c10 == null) {
            return;
        }
        c10.f552b = str;
        TLRPC.TL_messages_editQuickReplyShortcut tL_messages_editQuickReplyShortcut = new TLRPC.TL_messages_editQuickReplyShortcut();
        tL_messages_editQuickReplyShortcut.shortcut_id = i10;
        tL_messages_editQuickReplyShortcut.shortcut = str;
        int i11 = this.f566a;
        ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editQuickReplyShortcut, new c3(2));
        l();
        zs.f(i11).k(zs.F1, new Object[0]);
    }

    public final void l() {
        hs a02 = hs.a0(this.f566a);
        a02.f15938a.c(new a1.f(13, this, a02));
    }
}
