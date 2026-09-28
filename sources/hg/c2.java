package hg;

import ai.c9;
import ai.o8;
import ai.q8;
import ai.u7;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
public final class c2 {
    public static volatile c2[] f10223g = new c2[4];
    public static final Object[] h = new Object[4];
    public final int f10224a;
    public final ArrayList f10225b = new ArrayList();
    public final ArrayList f10226c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public boolean e;
    public boolean f10227f;

    static {
        for (int i10 = 0; i10 < 4; i10++) {
            h[i10] = new Object();
        }
    }

    public c2(int i10) {
        this.f10224a = i10;
    }

    public static c2 f(int i10) {
        c2 c2Var;
        c2 c2Var2 = f10223g[i10];
        if (c2Var2 == null) {
            synchronized (h[i10]) {
                try {
                    c2Var = f10223g[i10];
                    if (c2Var == null) {
                        c2[] c2VarArr = f10223g;
                        c2 c2Var3 = new c2(i10);
                        c2VarArr[i10] = c2Var3;
                        c2Var = c2Var3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return c2Var;
        }
        return c2Var2;
    }

    public static boolean g(String str) {
        if (!"hello".equalsIgnoreCase(str) && !"away".equalsIgnoreCase(str)) {
            return false;
        }
        return true;
    }

    public final void a(String str) {
        b2 b2Var;
        ArrayList arrayList = this.f10226c;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                b2Var = (b2) obj;
                if (TextUtils.equals(str, b2Var.f10206b)) {
                    break;
                }
            } else {
                b2Var = null;
                break;
            }
        }
        if (b2Var != null) {
            arrayList.remove(b2Var);
            NotificationCenter.getInstance(this.f10224a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
        }
    }

    public final void b(Runnable runnable) {
        if (this.f10227f) {
            runnable.run();
        } else {
            i(runnable, true);
        }
    }

    public final b2 c(long j3) {
        ArrayList arrayList = this.f10225b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            b2 b2Var = (b2) obj;
            if (b2Var.f10205a == j3) {
                return b2Var;
            }
        }
        return null;
    }

    public final b2 d(String str) {
        ArrayList arrayList = this.f10225b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            b2 b2Var = (b2) obj;
            if (TextUtils.equals(str, b2Var.f10206b)) {
                return b2Var;
            }
        }
        return null;
    }

    public final ArrayList e() {
        ArrayList arrayList = this.d;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f10225b;
            if (i10 < arrayList2.size()) {
                if (!g(((b2) arrayList2.get(i10)).f10206b)) {
                    arrayList.add((b2) arrayList2.get(i10));
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
        throw new UnsupportedOperationException("Method not decompiled: hg.c2.i(java.lang.Runnable, boolean):void");
    }

    public final boolean j(final TLRPC.Update update, String str, int i10) {
        if (update instanceof TL_update.TL_updateQuickReplyMessage) {
            b(new c9(this, ((TL_update.TL_updateQuickReplyMessage) update).message, str, i10, 5));
            return true;
        } else if (update instanceof TL_update.TL_updateQuickReplies) {
            b(new Runnable(this) {
                public final c2 f10198b;

                {
                    this.f10198b = this;
                }

                @Override
                public final void run() {
                    b2 b2Var;
                    int i11;
                    switch (r3) {
                        case 0:
                            ArrayList<TLRPC.TL_quickReply> arrayList = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            c2 c2Var = this.f10198b;
                            ArrayList arrayList2 = c2Var.f10225b;
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            arrayList2.clear();
                            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList.get(i12);
                                int i13 = 0;
                                while (true) {
                                    if (i13 < arrayList3.size()) {
                                        if (((b2) arrayList3.get(i13)).f10205a == tL_quickReply.shortcut_id) {
                                            b2Var = (b2) arrayList3.get(i13);
                                        } else {
                                            i13++;
                                        }
                                    } else {
                                        b2Var = null;
                                    }
                                }
                                if (b2Var == null) {
                                    b2Var = new b2();
                                }
                                b2Var.f10205a = tL_quickReply.shortcut_id;
                                b2Var.f10206b = tL_quickReply.shortcut;
                                b2Var.f10208f = tL_quickReply.count;
                                b2Var.f10207c = i12;
                                b2Var.d = tL_quickReply.top_message;
                                MessageObject messageObject = b2Var.e;
                                if (messageObject != null && messageObject.getId() != tL_quickReply.top_message) {
                                    b2Var.e = null;
                                }
                                arrayList2.add(b2Var);
                                c2Var.a(b2Var.f10206b);
                            }
                            c2Var.l();
                            NotificationCenter.getInstance(c2Var.f10224a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 1:
                            c2 c2Var2 = this.f10198b;
                            ArrayList arrayList4 = c2Var2.f10225b;
                            int i14 = c2Var2.f10224a;
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            b2 c10 = c2Var2.c(tL_quickReply2.shortcut_id);
                            if (c10 != null) {
                                c10.f10206b = tL_quickReply2.shortcut;
                                c10.f10208f = tL_quickReply2.count;
                                c10.d = tL_quickReply2.top_message;
                                MessageObject messageObject2 = c10.e;
                                if (messageObject2 != null && messageObject2.getId() != tL_quickReply2.top_message) {
                                    c10.e = null;
                                    long clientUserId = UserConfig.getInstance(i14).getClientUserId();
                                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i14);
                                    messagesStorage.getStorageQueue().postRunnable(new q8(c2Var2, messagesStorage, c10, clientUserId, 6));
                                    return;
                                }
                            } else {
                                b2 b2Var2 = new b2();
                                b2Var2.f10205a = tL_quickReply2.shortcut_id;
                                b2Var2.f10206b = tL_quickReply2.shortcut;
                                b2Var2.f10208f = tL_quickReply2.count;
                                b2Var2.d = tL_quickReply2.top_message;
                                for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                                    ((b2) arrayList4.get(i15)).f10207c = i15;
                                }
                                arrayList4.add(b2Var2);
                                c2Var2.a(b2Var2.f10206b);
                            }
                            c2Var2.l();
                            NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 2:
                            c2 c2Var3 = this.f10198b;
                            int i16 = c2Var3.f10224a;
                            b2 c11 = c2Var3.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c11 != null) {
                                c2Var3.f10225b.remove(c11);
                                c2Var3.a(c11.f10206b);
                                int i17 = c11.f10205a;
                                MessagesStorage messagesStorage2 = MessagesStorage.getInstance(i16);
                                messagesStorage2.getStorageQueue().postRunnable(new o8(messagesStorage2, i17, 8));
                                c2Var3.l();
                                NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                return;
                            }
                            return;
                        default:
                            c2 c2Var4 = this.f10198b;
                            int i18 = c2Var4.f10224a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            b2 c12 = c2Var4.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c12 != null) {
                                int size = c12.f10208f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c12.f10208f = size;
                                if (size <= 0) {
                                    c2Var4.f10225b.remove(c12);
                                }
                                ArrayList<Integer> arrayList5 = tL_updateDeleteQuickReplyMessages.messages;
                                MessageObject messageObject3 = c12.e;
                                if (messageObject3 != null) {
                                    i11 = messageObject3.getId();
                                } else {
                                    i11 = c12.d;
                                }
                                if (!arrayList5.contains(Integer.valueOf(i11)) && c12.e != null) {
                                    c2Var4.l();
                                    NotificationCenter.getInstance(i18).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                    return;
                                }
                                c12.e = null;
                                long clientUserId2 = UserConfig.getInstance(i18).getClientUserId();
                                MessagesStorage messagesStorage3 = MessagesStorage.getInstance(i18);
                                messagesStorage3.getStorageQueue().postRunnable(new q8(c2Var4, messagesStorage3, c12, clientUserId2, 6));
                                return;
                            }
                            return;
                    }
                }
            });
            return true;
        } else if (update instanceof TL_update.TL_updateNewQuickReply) {
            b(new Runnable(this) {
                public final c2 f10198b;

                {
                    this.f10198b = this;
                }

                @Override
                public final void run() {
                    b2 b2Var;
                    int i11;
                    switch (r3) {
                        case 0:
                            ArrayList<TLRPC.TL_quickReply> arrayList = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            c2 c2Var = this.f10198b;
                            ArrayList arrayList2 = c2Var.f10225b;
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            arrayList2.clear();
                            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList.get(i12);
                                int i13 = 0;
                                while (true) {
                                    if (i13 < arrayList3.size()) {
                                        if (((b2) arrayList3.get(i13)).f10205a == tL_quickReply.shortcut_id) {
                                            b2Var = (b2) arrayList3.get(i13);
                                        } else {
                                            i13++;
                                        }
                                    } else {
                                        b2Var = null;
                                    }
                                }
                                if (b2Var == null) {
                                    b2Var = new b2();
                                }
                                b2Var.f10205a = tL_quickReply.shortcut_id;
                                b2Var.f10206b = tL_quickReply.shortcut;
                                b2Var.f10208f = tL_quickReply.count;
                                b2Var.f10207c = i12;
                                b2Var.d = tL_quickReply.top_message;
                                MessageObject messageObject = b2Var.e;
                                if (messageObject != null && messageObject.getId() != tL_quickReply.top_message) {
                                    b2Var.e = null;
                                }
                                arrayList2.add(b2Var);
                                c2Var.a(b2Var.f10206b);
                            }
                            c2Var.l();
                            NotificationCenter.getInstance(c2Var.f10224a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 1:
                            c2 c2Var2 = this.f10198b;
                            ArrayList arrayList4 = c2Var2.f10225b;
                            int i14 = c2Var2.f10224a;
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            b2 c10 = c2Var2.c(tL_quickReply2.shortcut_id);
                            if (c10 != null) {
                                c10.f10206b = tL_quickReply2.shortcut;
                                c10.f10208f = tL_quickReply2.count;
                                c10.d = tL_quickReply2.top_message;
                                MessageObject messageObject2 = c10.e;
                                if (messageObject2 != null && messageObject2.getId() != tL_quickReply2.top_message) {
                                    c10.e = null;
                                    long clientUserId = UserConfig.getInstance(i14).getClientUserId();
                                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i14);
                                    messagesStorage.getStorageQueue().postRunnable(new q8(c2Var2, messagesStorage, c10, clientUserId, 6));
                                    return;
                                }
                            } else {
                                b2 b2Var2 = new b2();
                                b2Var2.f10205a = tL_quickReply2.shortcut_id;
                                b2Var2.f10206b = tL_quickReply2.shortcut;
                                b2Var2.f10208f = tL_quickReply2.count;
                                b2Var2.d = tL_quickReply2.top_message;
                                for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                                    ((b2) arrayList4.get(i15)).f10207c = i15;
                                }
                                arrayList4.add(b2Var2);
                                c2Var2.a(b2Var2.f10206b);
                            }
                            c2Var2.l();
                            NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 2:
                            c2 c2Var3 = this.f10198b;
                            int i16 = c2Var3.f10224a;
                            b2 c11 = c2Var3.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c11 != null) {
                                c2Var3.f10225b.remove(c11);
                                c2Var3.a(c11.f10206b);
                                int i17 = c11.f10205a;
                                MessagesStorage messagesStorage2 = MessagesStorage.getInstance(i16);
                                messagesStorage2.getStorageQueue().postRunnable(new o8(messagesStorage2, i17, 8));
                                c2Var3.l();
                                NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                return;
                            }
                            return;
                        default:
                            c2 c2Var4 = this.f10198b;
                            int i18 = c2Var4.f10224a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            b2 c12 = c2Var4.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c12 != null) {
                                int size = c12.f10208f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c12.f10208f = size;
                                if (size <= 0) {
                                    c2Var4.f10225b.remove(c12);
                                }
                                ArrayList<Integer> arrayList5 = tL_updateDeleteQuickReplyMessages.messages;
                                MessageObject messageObject3 = c12.e;
                                if (messageObject3 != null) {
                                    i11 = messageObject3.getId();
                                } else {
                                    i11 = c12.d;
                                }
                                if (!arrayList5.contains(Integer.valueOf(i11)) && c12.e != null) {
                                    c2Var4.l();
                                    NotificationCenter.getInstance(i18).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                    return;
                                }
                                c12.e = null;
                                long clientUserId2 = UserConfig.getInstance(i18).getClientUserId();
                                MessagesStorage messagesStorage3 = MessagesStorage.getInstance(i18);
                                messagesStorage3.getStorageQueue().postRunnable(new q8(c2Var4, messagesStorage3, c12, clientUserId2, 6));
                                return;
                            }
                            return;
                    }
                }
            });
            return true;
        } else if (update instanceof TL_update.TL_updateDeleteQuickReply) {
            b(new Runnable(this) {
                public final c2 f10198b;

                {
                    this.f10198b = this;
                }

                @Override
                public final void run() {
                    b2 b2Var;
                    int i11;
                    switch (r3) {
                        case 0:
                            ArrayList<TLRPC.TL_quickReply> arrayList = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            c2 c2Var = this.f10198b;
                            ArrayList arrayList2 = c2Var.f10225b;
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            arrayList2.clear();
                            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList.get(i12);
                                int i13 = 0;
                                while (true) {
                                    if (i13 < arrayList3.size()) {
                                        if (((b2) arrayList3.get(i13)).f10205a == tL_quickReply.shortcut_id) {
                                            b2Var = (b2) arrayList3.get(i13);
                                        } else {
                                            i13++;
                                        }
                                    } else {
                                        b2Var = null;
                                    }
                                }
                                if (b2Var == null) {
                                    b2Var = new b2();
                                }
                                b2Var.f10205a = tL_quickReply.shortcut_id;
                                b2Var.f10206b = tL_quickReply.shortcut;
                                b2Var.f10208f = tL_quickReply.count;
                                b2Var.f10207c = i12;
                                b2Var.d = tL_quickReply.top_message;
                                MessageObject messageObject = b2Var.e;
                                if (messageObject != null && messageObject.getId() != tL_quickReply.top_message) {
                                    b2Var.e = null;
                                }
                                arrayList2.add(b2Var);
                                c2Var.a(b2Var.f10206b);
                            }
                            c2Var.l();
                            NotificationCenter.getInstance(c2Var.f10224a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 1:
                            c2 c2Var2 = this.f10198b;
                            ArrayList arrayList4 = c2Var2.f10225b;
                            int i14 = c2Var2.f10224a;
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            b2 c10 = c2Var2.c(tL_quickReply2.shortcut_id);
                            if (c10 != null) {
                                c10.f10206b = tL_quickReply2.shortcut;
                                c10.f10208f = tL_quickReply2.count;
                                c10.d = tL_quickReply2.top_message;
                                MessageObject messageObject2 = c10.e;
                                if (messageObject2 != null && messageObject2.getId() != tL_quickReply2.top_message) {
                                    c10.e = null;
                                    long clientUserId = UserConfig.getInstance(i14).getClientUserId();
                                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i14);
                                    messagesStorage.getStorageQueue().postRunnable(new q8(c2Var2, messagesStorage, c10, clientUserId, 6));
                                    return;
                                }
                            } else {
                                b2 b2Var2 = new b2();
                                b2Var2.f10205a = tL_quickReply2.shortcut_id;
                                b2Var2.f10206b = tL_quickReply2.shortcut;
                                b2Var2.f10208f = tL_quickReply2.count;
                                b2Var2.d = tL_quickReply2.top_message;
                                for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                                    ((b2) arrayList4.get(i15)).f10207c = i15;
                                }
                                arrayList4.add(b2Var2);
                                c2Var2.a(b2Var2.f10206b);
                            }
                            c2Var2.l();
                            NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 2:
                            c2 c2Var3 = this.f10198b;
                            int i16 = c2Var3.f10224a;
                            b2 c11 = c2Var3.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c11 != null) {
                                c2Var3.f10225b.remove(c11);
                                c2Var3.a(c11.f10206b);
                                int i17 = c11.f10205a;
                                MessagesStorage messagesStorage2 = MessagesStorage.getInstance(i16);
                                messagesStorage2.getStorageQueue().postRunnable(new o8(messagesStorage2, i17, 8));
                                c2Var3.l();
                                NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                return;
                            }
                            return;
                        default:
                            c2 c2Var4 = this.f10198b;
                            int i18 = c2Var4.f10224a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            b2 c12 = c2Var4.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c12 != null) {
                                int size = c12.f10208f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c12.f10208f = size;
                                if (size <= 0) {
                                    c2Var4.f10225b.remove(c12);
                                }
                                ArrayList<Integer> arrayList5 = tL_updateDeleteQuickReplyMessages.messages;
                                MessageObject messageObject3 = c12.e;
                                if (messageObject3 != null) {
                                    i11 = messageObject3.getId();
                                } else {
                                    i11 = c12.d;
                                }
                                if (!arrayList5.contains(Integer.valueOf(i11)) && c12.e != null) {
                                    c2Var4.l();
                                    NotificationCenter.getInstance(i18).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                    return;
                                }
                                c12.e = null;
                                long clientUserId2 = UserConfig.getInstance(i18).getClientUserId();
                                MessagesStorage messagesStorage3 = MessagesStorage.getInstance(i18);
                                messagesStorage3.getStorageQueue().postRunnable(new q8(c2Var4, messagesStorage3, c12, clientUserId2, 6));
                                return;
                            }
                            return;
                    }
                }
            });
            return true;
        } else if (update instanceof TL_update.TL_updateDeleteQuickReplyMessages) {
            b(new Runnable(this) {
                public final c2 f10198b;

                {
                    this.f10198b = this;
                }

                @Override
                public final void run() {
                    b2 b2Var;
                    int i11;
                    switch (r3) {
                        case 0:
                            ArrayList<TLRPC.TL_quickReply> arrayList = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            c2 c2Var = this.f10198b;
                            ArrayList arrayList2 = c2Var.f10225b;
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            arrayList2.clear();
                            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList.get(i12);
                                int i13 = 0;
                                while (true) {
                                    if (i13 < arrayList3.size()) {
                                        if (((b2) arrayList3.get(i13)).f10205a == tL_quickReply.shortcut_id) {
                                            b2Var = (b2) arrayList3.get(i13);
                                        } else {
                                            i13++;
                                        }
                                    } else {
                                        b2Var = null;
                                    }
                                }
                                if (b2Var == null) {
                                    b2Var = new b2();
                                }
                                b2Var.f10205a = tL_quickReply.shortcut_id;
                                b2Var.f10206b = tL_quickReply.shortcut;
                                b2Var.f10208f = tL_quickReply.count;
                                b2Var.f10207c = i12;
                                b2Var.d = tL_quickReply.top_message;
                                MessageObject messageObject = b2Var.e;
                                if (messageObject != null && messageObject.getId() != tL_quickReply.top_message) {
                                    b2Var.e = null;
                                }
                                arrayList2.add(b2Var);
                                c2Var.a(b2Var.f10206b);
                            }
                            c2Var.l();
                            NotificationCenter.getInstance(c2Var.f10224a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 1:
                            c2 c2Var2 = this.f10198b;
                            ArrayList arrayList4 = c2Var2.f10225b;
                            int i14 = c2Var2.f10224a;
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            b2 c10 = c2Var2.c(tL_quickReply2.shortcut_id);
                            if (c10 != null) {
                                c10.f10206b = tL_quickReply2.shortcut;
                                c10.f10208f = tL_quickReply2.count;
                                c10.d = tL_quickReply2.top_message;
                                MessageObject messageObject2 = c10.e;
                                if (messageObject2 != null && messageObject2.getId() != tL_quickReply2.top_message) {
                                    c10.e = null;
                                    long clientUserId = UserConfig.getInstance(i14).getClientUserId();
                                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i14);
                                    messagesStorage.getStorageQueue().postRunnable(new q8(c2Var2, messagesStorage, c10, clientUserId, 6));
                                    return;
                                }
                            } else {
                                b2 b2Var2 = new b2();
                                b2Var2.f10205a = tL_quickReply2.shortcut_id;
                                b2Var2.f10206b = tL_quickReply2.shortcut;
                                b2Var2.f10208f = tL_quickReply2.count;
                                b2Var2.d = tL_quickReply2.top_message;
                                for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                                    ((b2) arrayList4.get(i15)).f10207c = i15;
                                }
                                arrayList4.add(b2Var2);
                                c2Var2.a(b2Var2.f10206b);
                            }
                            c2Var2.l();
                            NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 2:
                            c2 c2Var3 = this.f10198b;
                            int i16 = c2Var3.f10224a;
                            b2 c11 = c2Var3.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c11 != null) {
                                c2Var3.f10225b.remove(c11);
                                c2Var3.a(c11.f10206b);
                                int i17 = c11.f10205a;
                                MessagesStorage messagesStorage2 = MessagesStorage.getInstance(i16);
                                messagesStorage2.getStorageQueue().postRunnable(new o8(messagesStorage2, i17, 8));
                                c2Var3.l();
                                NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                return;
                            }
                            return;
                        default:
                            c2 c2Var4 = this.f10198b;
                            int i18 = c2Var4.f10224a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            b2 c12 = c2Var4.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c12 != null) {
                                int size = c12.f10208f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c12.f10208f = size;
                                if (size <= 0) {
                                    c2Var4.f10225b.remove(c12);
                                }
                                ArrayList<Integer> arrayList5 = tL_updateDeleteQuickReplyMessages.messages;
                                MessageObject messageObject3 = c12.e;
                                if (messageObject3 != null) {
                                    i11 = messageObject3.getId();
                                } else {
                                    i11 = c12.d;
                                }
                                if (!arrayList5.contains(Integer.valueOf(i11)) && c12.e != null) {
                                    c2Var4.l();
                                    NotificationCenter.getInstance(i18).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                    return;
                                }
                                c12.e = null;
                                long clientUserId2 = UserConfig.getInstance(i18).getClientUserId();
                                MessagesStorage messagesStorage3 = MessagesStorage.getInstance(i18);
                                messagesStorage3.getStorageQueue().postRunnable(new q8(c2Var4, messagesStorage3, c12, clientUserId2, 6));
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
        b2 c10 = c(i10);
        if (c10 == null) {
            return;
        }
        c10.f10206b = str;
        TLRPC.TL_messages_editQuickReplyShortcut tL_messages_editQuickReplyShortcut = new TLRPC.TL_messages_editQuickReplyShortcut();
        tL_messages_editQuickReplyShortcut.shortcut_id = i10;
        tL_messages_editQuickReplyShortcut.shortcut = str;
        int i11 = this.f10224a;
        ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editQuickReplyShortcut, new u7(7));
        l();
        NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
    }

    public final void l() {
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.f10224a);
        messagesStorage.getStorageQueue().postRunnable(new gg.x1(7, this, messagesStorage));
    }
}
