package hg;

import ai.c9;
import ai.n8;
import ai.p8;
import ai.t7;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
public final class b2 {
    public static volatile b2[] f10233g = new b2[4];
    public static final Object[] h = new Object[4];
    public final int f10234a;
    public final ArrayList f10235b = new ArrayList();
    public final ArrayList f10236c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public boolean e;
    public boolean f10237f;

    static {
        for (int i10 = 0; i10 < 4; i10++) {
            h[i10] = new Object();
        }
    }

    public b2(int i10) {
        this.f10234a = i10;
    }

    public static b2 f(int i10) {
        b2 b2Var;
        b2 b2Var2 = f10233g[i10];
        if (b2Var2 == null) {
            synchronized (h[i10]) {
                try {
                    b2Var = f10233g[i10];
                    if (b2Var == null) {
                        b2[] b2VarArr = f10233g;
                        b2 b2Var3 = new b2(i10);
                        b2VarArr[i10] = b2Var3;
                        b2Var = b2Var3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return b2Var;
        }
        return b2Var2;
    }

    public static boolean g(String str) {
        if (!"hello".equalsIgnoreCase(str) && !"away".equalsIgnoreCase(str)) {
            return false;
        }
        return true;
    }

    public final void a(String str) {
        a2 a2Var;
        ArrayList arrayList = this.f10236c;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                a2Var = (a2) obj;
                if (TextUtils.equals(str, a2Var.f10223b)) {
                    break;
                }
            } else {
                a2Var = null;
                break;
            }
        }
        if (a2Var != null) {
            arrayList.remove(a2Var);
            NotificationCenter.getInstance(this.f10234a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
        }
    }

    public final void b(Runnable runnable) {
        if (this.f10237f) {
            runnable.run();
        } else {
            i(runnable, true);
        }
    }

    public final a2 c(long j3) {
        ArrayList arrayList = this.f10235b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            a2 a2Var = (a2) obj;
            if (a2Var.f10222a == j3) {
                return a2Var;
            }
        }
        return null;
    }

    public final a2 d(String str) {
        ArrayList arrayList = this.f10235b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            a2 a2Var = (a2) obj;
            if (TextUtils.equals(str, a2Var.f10223b)) {
                return a2Var;
            }
        }
        return null;
    }

    public final ArrayList e() {
        ArrayList arrayList = this.d;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f10235b;
            if (i10 < arrayList2.size()) {
                if (!g(((a2) arrayList2.get(i10)).f10223b)) {
                    arrayList.add((a2) arrayList2.get(i10));
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
        throw new UnsupportedOperationException("Method not decompiled: hg.b2.i(java.lang.Runnable, boolean):void");
    }

    public final boolean j(final TLRPC.Update update, String str, int i10) {
        if (update instanceof TL_update.TL_updateQuickReplyMessage) {
            b(new c9(this, ((TL_update.TL_updateQuickReplyMessage) update).message, str, i10, 5));
            return true;
        } else if (update instanceof TL_update.TL_updateQuickReplies) {
            b(new Runnable(this) {
                public final b2 f10495b;

                {
                    this.f10495b = this;
                }

                @Override
                public final void run() {
                    a2 a2Var;
                    int i11;
                    switch (r3) {
                        case 0:
                            ArrayList<TLRPC.TL_quickReply> arrayList = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            b2 b2Var = this.f10495b;
                            ArrayList arrayList2 = b2Var.f10235b;
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            arrayList2.clear();
                            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList.get(i12);
                                int i13 = 0;
                                while (true) {
                                    if (i13 < arrayList3.size()) {
                                        if (((a2) arrayList3.get(i13)).f10222a == tL_quickReply.shortcut_id) {
                                            a2Var = (a2) arrayList3.get(i13);
                                        } else {
                                            i13++;
                                        }
                                    } else {
                                        a2Var = null;
                                    }
                                }
                                if (a2Var == null) {
                                    a2Var = new a2();
                                }
                                a2Var.f10222a = tL_quickReply.shortcut_id;
                                a2Var.f10223b = tL_quickReply.shortcut;
                                a2Var.f10225f = tL_quickReply.count;
                                a2Var.f10224c = i12;
                                a2Var.d = tL_quickReply.top_message;
                                MessageObject messageObject = a2Var.e;
                                if (messageObject != null && messageObject.getId() != tL_quickReply.top_message) {
                                    a2Var.e = null;
                                }
                                arrayList2.add(a2Var);
                                b2Var.a(a2Var.f10223b);
                            }
                            b2Var.l();
                            NotificationCenter.getInstance(b2Var.f10234a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 1:
                            b2 b2Var2 = this.f10495b;
                            ArrayList arrayList4 = b2Var2.f10235b;
                            int i14 = b2Var2.f10234a;
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            a2 c10 = b2Var2.c(tL_quickReply2.shortcut_id);
                            if (c10 != null) {
                                c10.f10223b = tL_quickReply2.shortcut;
                                c10.f10225f = tL_quickReply2.count;
                                c10.d = tL_quickReply2.top_message;
                                MessageObject messageObject2 = c10.e;
                                if (messageObject2 != null && messageObject2.getId() != tL_quickReply2.top_message) {
                                    c10.e = null;
                                    long clientUserId = UserConfig.getInstance(i14).getClientUserId();
                                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i14);
                                    messagesStorage.getStorageQueue().postRunnable(new p8(b2Var2, messagesStorage, c10, clientUserId, 6));
                                    return;
                                }
                            } else {
                                a2 a2Var2 = new a2();
                                a2Var2.f10222a = tL_quickReply2.shortcut_id;
                                a2Var2.f10223b = tL_quickReply2.shortcut;
                                a2Var2.f10225f = tL_quickReply2.count;
                                a2Var2.d = tL_quickReply2.top_message;
                                for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                                    ((a2) arrayList4.get(i15)).f10224c = i15;
                                }
                                arrayList4.add(a2Var2);
                                b2Var2.a(a2Var2.f10223b);
                            }
                            b2Var2.l();
                            NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 2:
                            b2 b2Var3 = this.f10495b;
                            int i16 = b2Var3.f10234a;
                            a2 c11 = b2Var3.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c11 != null) {
                                b2Var3.f10235b.remove(c11);
                                b2Var3.a(c11.f10223b);
                                int i17 = c11.f10222a;
                                MessagesStorage messagesStorage2 = MessagesStorage.getInstance(i16);
                                messagesStorage2.getStorageQueue().postRunnable(new n8(messagesStorage2, i17, 8));
                                b2Var3.l();
                                NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                return;
                            }
                            return;
                        default:
                            b2 b2Var4 = this.f10495b;
                            int i18 = b2Var4.f10234a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            a2 c12 = b2Var4.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c12 != null) {
                                int size = c12.f10225f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c12.f10225f = size;
                                if (size <= 0) {
                                    b2Var4.f10235b.remove(c12);
                                }
                                ArrayList<Integer> arrayList5 = tL_updateDeleteQuickReplyMessages.messages;
                                MessageObject messageObject3 = c12.e;
                                if (messageObject3 != null) {
                                    i11 = messageObject3.getId();
                                } else {
                                    i11 = c12.d;
                                }
                                if (!arrayList5.contains(Integer.valueOf(i11)) && c12.e != null) {
                                    b2Var4.l();
                                    NotificationCenter.getInstance(i18).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                    return;
                                }
                                c12.e = null;
                                long clientUserId2 = UserConfig.getInstance(i18).getClientUserId();
                                MessagesStorage messagesStorage3 = MessagesStorage.getInstance(i18);
                                messagesStorage3.getStorageQueue().postRunnable(new p8(b2Var4, messagesStorage3, c12, clientUserId2, 6));
                                return;
                            }
                            return;
                    }
                }
            });
            return true;
        } else if (update instanceof TL_update.TL_updateNewQuickReply) {
            b(new Runnable(this) {
                public final b2 f10495b;

                {
                    this.f10495b = this;
                }

                @Override
                public final void run() {
                    a2 a2Var;
                    int i11;
                    switch (r3) {
                        case 0:
                            ArrayList<TLRPC.TL_quickReply> arrayList = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            b2 b2Var = this.f10495b;
                            ArrayList arrayList2 = b2Var.f10235b;
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            arrayList2.clear();
                            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList.get(i12);
                                int i13 = 0;
                                while (true) {
                                    if (i13 < arrayList3.size()) {
                                        if (((a2) arrayList3.get(i13)).f10222a == tL_quickReply.shortcut_id) {
                                            a2Var = (a2) arrayList3.get(i13);
                                        } else {
                                            i13++;
                                        }
                                    } else {
                                        a2Var = null;
                                    }
                                }
                                if (a2Var == null) {
                                    a2Var = new a2();
                                }
                                a2Var.f10222a = tL_quickReply.shortcut_id;
                                a2Var.f10223b = tL_quickReply.shortcut;
                                a2Var.f10225f = tL_quickReply.count;
                                a2Var.f10224c = i12;
                                a2Var.d = tL_quickReply.top_message;
                                MessageObject messageObject = a2Var.e;
                                if (messageObject != null && messageObject.getId() != tL_quickReply.top_message) {
                                    a2Var.e = null;
                                }
                                arrayList2.add(a2Var);
                                b2Var.a(a2Var.f10223b);
                            }
                            b2Var.l();
                            NotificationCenter.getInstance(b2Var.f10234a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 1:
                            b2 b2Var2 = this.f10495b;
                            ArrayList arrayList4 = b2Var2.f10235b;
                            int i14 = b2Var2.f10234a;
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            a2 c10 = b2Var2.c(tL_quickReply2.shortcut_id);
                            if (c10 != null) {
                                c10.f10223b = tL_quickReply2.shortcut;
                                c10.f10225f = tL_quickReply2.count;
                                c10.d = tL_quickReply2.top_message;
                                MessageObject messageObject2 = c10.e;
                                if (messageObject2 != null && messageObject2.getId() != tL_quickReply2.top_message) {
                                    c10.e = null;
                                    long clientUserId = UserConfig.getInstance(i14).getClientUserId();
                                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i14);
                                    messagesStorage.getStorageQueue().postRunnable(new p8(b2Var2, messagesStorage, c10, clientUserId, 6));
                                    return;
                                }
                            } else {
                                a2 a2Var2 = new a2();
                                a2Var2.f10222a = tL_quickReply2.shortcut_id;
                                a2Var2.f10223b = tL_quickReply2.shortcut;
                                a2Var2.f10225f = tL_quickReply2.count;
                                a2Var2.d = tL_quickReply2.top_message;
                                for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                                    ((a2) arrayList4.get(i15)).f10224c = i15;
                                }
                                arrayList4.add(a2Var2);
                                b2Var2.a(a2Var2.f10223b);
                            }
                            b2Var2.l();
                            NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 2:
                            b2 b2Var3 = this.f10495b;
                            int i16 = b2Var3.f10234a;
                            a2 c11 = b2Var3.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c11 != null) {
                                b2Var3.f10235b.remove(c11);
                                b2Var3.a(c11.f10223b);
                                int i17 = c11.f10222a;
                                MessagesStorage messagesStorage2 = MessagesStorage.getInstance(i16);
                                messagesStorage2.getStorageQueue().postRunnable(new n8(messagesStorage2, i17, 8));
                                b2Var3.l();
                                NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                return;
                            }
                            return;
                        default:
                            b2 b2Var4 = this.f10495b;
                            int i18 = b2Var4.f10234a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            a2 c12 = b2Var4.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c12 != null) {
                                int size = c12.f10225f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c12.f10225f = size;
                                if (size <= 0) {
                                    b2Var4.f10235b.remove(c12);
                                }
                                ArrayList<Integer> arrayList5 = tL_updateDeleteQuickReplyMessages.messages;
                                MessageObject messageObject3 = c12.e;
                                if (messageObject3 != null) {
                                    i11 = messageObject3.getId();
                                } else {
                                    i11 = c12.d;
                                }
                                if (!arrayList5.contains(Integer.valueOf(i11)) && c12.e != null) {
                                    b2Var4.l();
                                    NotificationCenter.getInstance(i18).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                    return;
                                }
                                c12.e = null;
                                long clientUserId2 = UserConfig.getInstance(i18).getClientUserId();
                                MessagesStorage messagesStorage3 = MessagesStorage.getInstance(i18);
                                messagesStorage3.getStorageQueue().postRunnable(new p8(b2Var4, messagesStorage3, c12, clientUserId2, 6));
                                return;
                            }
                            return;
                    }
                }
            });
            return true;
        } else if (update instanceof TL_update.TL_updateDeleteQuickReply) {
            b(new Runnable(this) {
                public final b2 f10495b;

                {
                    this.f10495b = this;
                }

                @Override
                public final void run() {
                    a2 a2Var;
                    int i11;
                    switch (r3) {
                        case 0:
                            ArrayList<TLRPC.TL_quickReply> arrayList = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            b2 b2Var = this.f10495b;
                            ArrayList arrayList2 = b2Var.f10235b;
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            arrayList2.clear();
                            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList.get(i12);
                                int i13 = 0;
                                while (true) {
                                    if (i13 < arrayList3.size()) {
                                        if (((a2) arrayList3.get(i13)).f10222a == tL_quickReply.shortcut_id) {
                                            a2Var = (a2) arrayList3.get(i13);
                                        } else {
                                            i13++;
                                        }
                                    } else {
                                        a2Var = null;
                                    }
                                }
                                if (a2Var == null) {
                                    a2Var = new a2();
                                }
                                a2Var.f10222a = tL_quickReply.shortcut_id;
                                a2Var.f10223b = tL_quickReply.shortcut;
                                a2Var.f10225f = tL_quickReply.count;
                                a2Var.f10224c = i12;
                                a2Var.d = tL_quickReply.top_message;
                                MessageObject messageObject = a2Var.e;
                                if (messageObject != null && messageObject.getId() != tL_quickReply.top_message) {
                                    a2Var.e = null;
                                }
                                arrayList2.add(a2Var);
                                b2Var.a(a2Var.f10223b);
                            }
                            b2Var.l();
                            NotificationCenter.getInstance(b2Var.f10234a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 1:
                            b2 b2Var2 = this.f10495b;
                            ArrayList arrayList4 = b2Var2.f10235b;
                            int i14 = b2Var2.f10234a;
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            a2 c10 = b2Var2.c(tL_quickReply2.shortcut_id);
                            if (c10 != null) {
                                c10.f10223b = tL_quickReply2.shortcut;
                                c10.f10225f = tL_quickReply2.count;
                                c10.d = tL_quickReply2.top_message;
                                MessageObject messageObject2 = c10.e;
                                if (messageObject2 != null && messageObject2.getId() != tL_quickReply2.top_message) {
                                    c10.e = null;
                                    long clientUserId = UserConfig.getInstance(i14).getClientUserId();
                                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i14);
                                    messagesStorage.getStorageQueue().postRunnable(new p8(b2Var2, messagesStorage, c10, clientUserId, 6));
                                    return;
                                }
                            } else {
                                a2 a2Var2 = new a2();
                                a2Var2.f10222a = tL_quickReply2.shortcut_id;
                                a2Var2.f10223b = tL_quickReply2.shortcut;
                                a2Var2.f10225f = tL_quickReply2.count;
                                a2Var2.d = tL_quickReply2.top_message;
                                for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                                    ((a2) arrayList4.get(i15)).f10224c = i15;
                                }
                                arrayList4.add(a2Var2);
                                b2Var2.a(a2Var2.f10223b);
                            }
                            b2Var2.l();
                            NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 2:
                            b2 b2Var3 = this.f10495b;
                            int i16 = b2Var3.f10234a;
                            a2 c11 = b2Var3.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c11 != null) {
                                b2Var3.f10235b.remove(c11);
                                b2Var3.a(c11.f10223b);
                                int i17 = c11.f10222a;
                                MessagesStorage messagesStorage2 = MessagesStorage.getInstance(i16);
                                messagesStorage2.getStorageQueue().postRunnable(new n8(messagesStorage2, i17, 8));
                                b2Var3.l();
                                NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                return;
                            }
                            return;
                        default:
                            b2 b2Var4 = this.f10495b;
                            int i18 = b2Var4.f10234a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            a2 c12 = b2Var4.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c12 != null) {
                                int size = c12.f10225f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c12.f10225f = size;
                                if (size <= 0) {
                                    b2Var4.f10235b.remove(c12);
                                }
                                ArrayList<Integer> arrayList5 = tL_updateDeleteQuickReplyMessages.messages;
                                MessageObject messageObject3 = c12.e;
                                if (messageObject3 != null) {
                                    i11 = messageObject3.getId();
                                } else {
                                    i11 = c12.d;
                                }
                                if (!arrayList5.contains(Integer.valueOf(i11)) && c12.e != null) {
                                    b2Var4.l();
                                    NotificationCenter.getInstance(i18).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                    return;
                                }
                                c12.e = null;
                                long clientUserId2 = UserConfig.getInstance(i18).getClientUserId();
                                MessagesStorage messagesStorage3 = MessagesStorage.getInstance(i18);
                                messagesStorage3.getStorageQueue().postRunnable(new p8(b2Var4, messagesStorage3, c12, clientUserId2, 6));
                                return;
                            }
                            return;
                    }
                }
            });
            return true;
        } else if (update instanceof TL_update.TL_updateDeleteQuickReplyMessages) {
            b(new Runnable(this) {
                public final b2 f10495b;

                {
                    this.f10495b = this;
                }

                @Override
                public final void run() {
                    a2 a2Var;
                    int i11;
                    switch (r3) {
                        case 0:
                            ArrayList<TLRPC.TL_quickReply> arrayList = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            b2 b2Var = this.f10495b;
                            ArrayList arrayList2 = b2Var.f10235b;
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            arrayList2.clear();
                            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList.get(i12);
                                int i13 = 0;
                                while (true) {
                                    if (i13 < arrayList3.size()) {
                                        if (((a2) arrayList3.get(i13)).f10222a == tL_quickReply.shortcut_id) {
                                            a2Var = (a2) arrayList3.get(i13);
                                        } else {
                                            i13++;
                                        }
                                    } else {
                                        a2Var = null;
                                    }
                                }
                                if (a2Var == null) {
                                    a2Var = new a2();
                                }
                                a2Var.f10222a = tL_quickReply.shortcut_id;
                                a2Var.f10223b = tL_quickReply.shortcut;
                                a2Var.f10225f = tL_quickReply.count;
                                a2Var.f10224c = i12;
                                a2Var.d = tL_quickReply.top_message;
                                MessageObject messageObject = a2Var.e;
                                if (messageObject != null && messageObject.getId() != tL_quickReply.top_message) {
                                    a2Var.e = null;
                                }
                                arrayList2.add(a2Var);
                                b2Var.a(a2Var.f10223b);
                            }
                            b2Var.l();
                            NotificationCenter.getInstance(b2Var.f10234a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 1:
                            b2 b2Var2 = this.f10495b;
                            ArrayList arrayList4 = b2Var2.f10235b;
                            int i14 = b2Var2.f10234a;
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            a2 c10 = b2Var2.c(tL_quickReply2.shortcut_id);
                            if (c10 != null) {
                                c10.f10223b = tL_quickReply2.shortcut;
                                c10.f10225f = tL_quickReply2.count;
                                c10.d = tL_quickReply2.top_message;
                                MessageObject messageObject2 = c10.e;
                                if (messageObject2 != null && messageObject2.getId() != tL_quickReply2.top_message) {
                                    c10.e = null;
                                    long clientUserId = UserConfig.getInstance(i14).getClientUserId();
                                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i14);
                                    messagesStorage.getStorageQueue().postRunnable(new p8(b2Var2, messagesStorage, c10, clientUserId, 6));
                                    return;
                                }
                            } else {
                                a2 a2Var2 = new a2();
                                a2Var2.f10222a = tL_quickReply2.shortcut_id;
                                a2Var2.f10223b = tL_quickReply2.shortcut;
                                a2Var2.f10225f = tL_quickReply2.count;
                                a2Var2.d = tL_quickReply2.top_message;
                                for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                                    ((a2) arrayList4.get(i15)).f10224c = i15;
                                }
                                arrayList4.add(a2Var2);
                                b2Var2.a(a2Var2.f10223b);
                            }
                            b2Var2.l();
                            NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 2:
                            b2 b2Var3 = this.f10495b;
                            int i16 = b2Var3.f10234a;
                            a2 c11 = b2Var3.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c11 != null) {
                                b2Var3.f10235b.remove(c11);
                                b2Var3.a(c11.f10223b);
                                int i17 = c11.f10222a;
                                MessagesStorage messagesStorage2 = MessagesStorage.getInstance(i16);
                                messagesStorage2.getStorageQueue().postRunnable(new n8(messagesStorage2, i17, 8));
                                b2Var3.l();
                                NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                return;
                            }
                            return;
                        default:
                            b2 b2Var4 = this.f10495b;
                            int i18 = b2Var4.f10234a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            a2 c12 = b2Var4.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c12 != null) {
                                int size = c12.f10225f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c12.f10225f = size;
                                if (size <= 0) {
                                    b2Var4.f10235b.remove(c12);
                                }
                                ArrayList<Integer> arrayList5 = tL_updateDeleteQuickReplyMessages.messages;
                                MessageObject messageObject3 = c12.e;
                                if (messageObject3 != null) {
                                    i11 = messageObject3.getId();
                                } else {
                                    i11 = c12.d;
                                }
                                if (!arrayList5.contains(Integer.valueOf(i11)) && c12.e != null) {
                                    b2Var4.l();
                                    NotificationCenter.getInstance(i18).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                    return;
                                }
                                c12.e = null;
                                long clientUserId2 = UserConfig.getInstance(i18).getClientUserId();
                                MessagesStorage messagesStorage3 = MessagesStorage.getInstance(i18);
                                messagesStorage3.getStorageQueue().postRunnable(new p8(b2Var4, messagesStorage3, c12, clientUserId2, 6));
                                return;
                            }
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
        a2 c10 = c(i10);
        if (c10 == null) {
            return;
        }
        c10.f10223b = str;
        TLRPC.TL_messages_editQuickReplyShortcut tL_messages_editQuickReplyShortcut = new TLRPC.TL_messages_editQuickReplyShortcut();
        tL_messages_editQuickReplyShortcut.shortcut_id = i10;
        tL_messages_editQuickReplyShortcut.shortcut = str;
        int i11 = this.f10234a;
        ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editQuickReplyShortcut, new t7(7));
        l();
        NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
    }

    public final void l() {
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.f10234a);
        messagesStorage.getStorageQueue().postRunnable(new gg.x1(7, this, messagesStorage));
    }
}
