package ig;

import ai.b3;
import ai.cb;
import android.text.TextUtils;
import ci.d6;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
public final class a2 {
    public static volatile a2[] f12824g = new a2[4];
    public static final Object[] h = new Object[4];
    public final int f12825a;
    public final ArrayList f12826b = new ArrayList();
    public final ArrayList f12827c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public boolean e;
    public boolean f12828f;

    static {
        for (int i10 = 0; i10 < 4; i10++) {
            h[i10] = new Object();
        }
    }

    public a2(int i10) {
        this.f12825a = i10;
    }

    public static a2 f(int i10) {
        a2 a2Var;
        a2 a2Var2 = f12824g[i10];
        if (a2Var2 == null) {
            synchronized (h[i10]) {
                try {
                    a2Var = f12824g[i10];
                    if (a2Var == null) {
                        a2[] a2VarArr = f12824g;
                        a2 a2Var3 = new a2(i10);
                        a2VarArr[i10] = a2Var3;
                        a2Var = a2Var3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return a2Var;
        }
        return a2Var2;
    }

    public static boolean g(String str) {
        if (!"hello".equalsIgnoreCase(str) && !"away".equalsIgnoreCase(str)) {
            return false;
        }
        return true;
    }

    public final void a(String str) {
        z1 z1Var;
        ArrayList arrayList = this.f12827c;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                z1Var = (z1) obj;
                if (TextUtils.equals(str, z1Var.f13099b)) {
                    break;
                }
            } else {
                z1Var = null;
                break;
            }
        }
        if (z1Var != null) {
            arrayList.remove(z1Var);
            NotificationCenter.getInstance(this.f12825a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
        }
    }

    public final void b(Runnable runnable) {
        if (this.f12828f) {
            runnable.run();
        } else {
            i(runnable, true);
        }
    }

    public final z1 c(long j10) {
        ArrayList arrayList = this.f12826b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            z1 z1Var = (z1) obj;
            if (z1Var.f13098a == j10) {
                return z1Var;
            }
        }
        return null;
    }

    public final z1 d(String str) {
        ArrayList arrayList = this.f12826b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            z1 z1Var = (z1) obj;
            if (TextUtils.equals(str, z1Var.f13099b)) {
                return z1Var;
            }
        }
        return null;
    }

    public final ArrayList e() {
        ArrayList arrayList = this.d;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f12826b;
            if (i10 < arrayList2.size()) {
                if (!g(((z1) arrayList2.get(i10)).f13099b)) {
                    arrayList.add((z1) arrayList2.get(i10));
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
        throw new UnsupportedOperationException("Method not decompiled: ig.a2.i(java.lang.Runnable, boolean):void");
    }

    public final boolean j(final TLRPC.Update update, String str, int i10) {
        if (update instanceof TL_update.TL_updateQuickReplyMessage) {
            b(new cb(this, ((TL_update.TL_updateQuickReplyMessage) update).message, str, i10, 6));
            return true;
        } else if (update instanceof TL_update.TL_updateQuickReplies) {
            b(new Runnable(this) {
                public final a2 f13094b;

                {
                    this.f13094b = this;
                }

                @Override
                public final void run() {
                    z1 z1Var;
                    int i11;
                    switch (r3) {
                        case 0:
                            ArrayList<TLRPC.TL_quickReply> arrayList = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            a2 a2Var = this.f13094b;
                            ArrayList arrayList2 = a2Var.f12826b;
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            arrayList2.clear();
                            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList.get(i12);
                                int i13 = 0;
                                while (true) {
                                    if (i13 < arrayList3.size()) {
                                        if (((z1) arrayList3.get(i13)).f13098a == tL_quickReply.shortcut_id) {
                                            z1Var = (z1) arrayList3.get(i13);
                                        } else {
                                            i13++;
                                        }
                                    } else {
                                        z1Var = null;
                                    }
                                }
                                if (z1Var == null) {
                                    z1Var = new z1();
                                }
                                z1Var.f13098a = tL_quickReply.shortcut_id;
                                z1Var.f13099b = tL_quickReply.shortcut;
                                z1Var.f13101f = tL_quickReply.count;
                                z1Var.f13100c = i12;
                                z1Var.d = tL_quickReply.top_message;
                                MessageObject messageObject = z1Var.e;
                                if (messageObject != null && messageObject.getId() != tL_quickReply.top_message) {
                                    z1Var.e = null;
                                }
                                arrayList2.add(z1Var);
                                a2Var.a(z1Var.f13099b);
                            }
                            a2Var.l();
                            NotificationCenter.getInstance(a2Var.f12825a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 1:
                            a2 a2Var2 = this.f13094b;
                            ArrayList arrayList4 = a2Var2.f12826b;
                            int i14 = a2Var2.f12825a;
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            z1 c10 = a2Var2.c(tL_quickReply2.shortcut_id);
                            if (c10 != null) {
                                c10.f13099b = tL_quickReply2.shortcut;
                                c10.f13101f = tL_quickReply2.count;
                                c10.d = tL_quickReply2.top_message;
                                MessageObject messageObject2 = c10.e;
                                if (messageObject2 != null && messageObject2.getId() != tL_quickReply2.top_message) {
                                    c10.e = null;
                                    long clientUserId = UserConfig.getInstance(i14).getClientUserId();
                                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i14);
                                    messagesStorage.getStorageQueue().postRunnable(new b3(a2Var2, messagesStorage, c10, clientUserId, 14));
                                    return;
                                }
                            } else {
                                z1 z1Var2 = new z1();
                                z1Var2.f13098a = tL_quickReply2.shortcut_id;
                                z1Var2.f13099b = tL_quickReply2.shortcut;
                                z1Var2.f13101f = tL_quickReply2.count;
                                z1Var2.d = tL_quickReply2.top_message;
                                for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                                    ((z1) arrayList4.get(i15)).f13100c = i15;
                                }
                                arrayList4.add(z1Var2);
                                a2Var2.a(z1Var2.f13099b);
                            }
                            a2Var2.l();
                            NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 2:
                            a2 a2Var3 = this.f13094b;
                            int i16 = a2Var3.f12825a;
                            z1 c11 = a2Var3.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c11 != null) {
                                a2Var3.f12826b.remove(c11);
                                a2Var3.a(c11.f13099b);
                                int i17 = c11.f13098a;
                                MessagesStorage messagesStorage2 = MessagesStorage.getInstance(i16);
                                messagesStorage2.getStorageQueue().postRunnable(new ah.g(messagesStorage2, i17, 12));
                                a2Var3.l();
                                NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                return;
                            }
                            return;
                        default:
                            a2 a2Var4 = this.f13094b;
                            int i18 = a2Var4.f12825a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            z1 c12 = a2Var4.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c12 != null) {
                                int size = c12.f13101f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c12.f13101f = size;
                                if (size <= 0) {
                                    a2Var4.f12826b.remove(c12);
                                }
                                ArrayList<Integer> arrayList5 = tL_updateDeleteQuickReplyMessages.messages;
                                MessageObject messageObject3 = c12.e;
                                if (messageObject3 != null) {
                                    i11 = messageObject3.getId();
                                } else {
                                    i11 = c12.d;
                                }
                                if (!arrayList5.contains(Integer.valueOf(i11)) && c12.e != null) {
                                    a2Var4.l();
                                    NotificationCenter.getInstance(i18).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                    return;
                                }
                                c12.e = null;
                                long clientUserId2 = UserConfig.getInstance(i18).getClientUserId();
                                MessagesStorage messagesStorage3 = MessagesStorage.getInstance(i18);
                                messagesStorage3.getStorageQueue().postRunnable(new b3(a2Var4, messagesStorage3, c12, clientUserId2, 14));
                                return;
                            }
                            return;
                    }
                }
            });
            return true;
        } else if (update instanceof TL_update.TL_updateNewQuickReply) {
            b(new Runnable(this) {
                public final a2 f13094b;

                {
                    this.f13094b = this;
                }

                @Override
                public final void run() {
                    z1 z1Var;
                    int i11;
                    switch (r3) {
                        case 0:
                            ArrayList<TLRPC.TL_quickReply> arrayList = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            a2 a2Var = this.f13094b;
                            ArrayList arrayList2 = a2Var.f12826b;
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            arrayList2.clear();
                            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList.get(i12);
                                int i13 = 0;
                                while (true) {
                                    if (i13 < arrayList3.size()) {
                                        if (((z1) arrayList3.get(i13)).f13098a == tL_quickReply.shortcut_id) {
                                            z1Var = (z1) arrayList3.get(i13);
                                        } else {
                                            i13++;
                                        }
                                    } else {
                                        z1Var = null;
                                    }
                                }
                                if (z1Var == null) {
                                    z1Var = new z1();
                                }
                                z1Var.f13098a = tL_quickReply.shortcut_id;
                                z1Var.f13099b = tL_quickReply.shortcut;
                                z1Var.f13101f = tL_quickReply.count;
                                z1Var.f13100c = i12;
                                z1Var.d = tL_quickReply.top_message;
                                MessageObject messageObject = z1Var.e;
                                if (messageObject != null && messageObject.getId() != tL_quickReply.top_message) {
                                    z1Var.e = null;
                                }
                                arrayList2.add(z1Var);
                                a2Var.a(z1Var.f13099b);
                            }
                            a2Var.l();
                            NotificationCenter.getInstance(a2Var.f12825a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 1:
                            a2 a2Var2 = this.f13094b;
                            ArrayList arrayList4 = a2Var2.f12826b;
                            int i14 = a2Var2.f12825a;
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            z1 c10 = a2Var2.c(tL_quickReply2.shortcut_id);
                            if (c10 != null) {
                                c10.f13099b = tL_quickReply2.shortcut;
                                c10.f13101f = tL_quickReply2.count;
                                c10.d = tL_quickReply2.top_message;
                                MessageObject messageObject2 = c10.e;
                                if (messageObject2 != null && messageObject2.getId() != tL_quickReply2.top_message) {
                                    c10.e = null;
                                    long clientUserId = UserConfig.getInstance(i14).getClientUserId();
                                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i14);
                                    messagesStorage.getStorageQueue().postRunnable(new b3(a2Var2, messagesStorage, c10, clientUserId, 14));
                                    return;
                                }
                            } else {
                                z1 z1Var2 = new z1();
                                z1Var2.f13098a = tL_quickReply2.shortcut_id;
                                z1Var2.f13099b = tL_quickReply2.shortcut;
                                z1Var2.f13101f = tL_quickReply2.count;
                                z1Var2.d = tL_quickReply2.top_message;
                                for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                                    ((z1) arrayList4.get(i15)).f13100c = i15;
                                }
                                arrayList4.add(z1Var2);
                                a2Var2.a(z1Var2.f13099b);
                            }
                            a2Var2.l();
                            NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 2:
                            a2 a2Var3 = this.f13094b;
                            int i16 = a2Var3.f12825a;
                            z1 c11 = a2Var3.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c11 != null) {
                                a2Var3.f12826b.remove(c11);
                                a2Var3.a(c11.f13099b);
                                int i17 = c11.f13098a;
                                MessagesStorage messagesStorage2 = MessagesStorage.getInstance(i16);
                                messagesStorage2.getStorageQueue().postRunnable(new ah.g(messagesStorage2, i17, 12));
                                a2Var3.l();
                                NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                return;
                            }
                            return;
                        default:
                            a2 a2Var4 = this.f13094b;
                            int i18 = a2Var4.f12825a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            z1 c12 = a2Var4.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c12 != null) {
                                int size = c12.f13101f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c12.f13101f = size;
                                if (size <= 0) {
                                    a2Var4.f12826b.remove(c12);
                                }
                                ArrayList<Integer> arrayList5 = tL_updateDeleteQuickReplyMessages.messages;
                                MessageObject messageObject3 = c12.e;
                                if (messageObject3 != null) {
                                    i11 = messageObject3.getId();
                                } else {
                                    i11 = c12.d;
                                }
                                if (!arrayList5.contains(Integer.valueOf(i11)) && c12.e != null) {
                                    a2Var4.l();
                                    NotificationCenter.getInstance(i18).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                    return;
                                }
                                c12.e = null;
                                long clientUserId2 = UserConfig.getInstance(i18).getClientUserId();
                                MessagesStorage messagesStorage3 = MessagesStorage.getInstance(i18);
                                messagesStorage3.getStorageQueue().postRunnable(new b3(a2Var4, messagesStorage3, c12, clientUserId2, 14));
                                return;
                            }
                            return;
                    }
                }
            });
            return true;
        } else if (update instanceof TL_update.TL_updateDeleteQuickReply) {
            b(new Runnable(this) {
                public final a2 f13094b;

                {
                    this.f13094b = this;
                }

                @Override
                public final void run() {
                    z1 z1Var;
                    int i11;
                    switch (r3) {
                        case 0:
                            ArrayList<TLRPC.TL_quickReply> arrayList = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            a2 a2Var = this.f13094b;
                            ArrayList arrayList2 = a2Var.f12826b;
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            arrayList2.clear();
                            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList.get(i12);
                                int i13 = 0;
                                while (true) {
                                    if (i13 < arrayList3.size()) {
                                        if (((z1) arrayList3.get(i13)).f13098a == tL_quickReply.shortcut_id) {
                                            z1Var = (z1) arrayList3.get(i13);
                                        } else {
                                            i13++;
                                        }
                                    } else {
                                        z1Var = null;
                                    }
                                }
                                if (z1Var == null) {
                                    z1Var = new z1();
                                }
                                z1Var.f13098a = tL_quickReply.shortcut_id;
                                z1Var.f13099b = tL_quickReply.shortcut;
                                z1Var.f13101f = tL_quickReply.count;
                                z1Var.f13100c = i12;
                                z1Var.d = tL_quickReply.top_message;
                                MessageObject messageObject = z1Var.e;
                                if (messageObject != null && messageObject.getId() != tL_quickReply.top_message) {
                                    z1Var.e = null;
                                }
                                arrayList2.add(z1Var);
                                a2Var.a(z1Var.f13099b);
                            }
                            a2Var.l();
                            NotificationCenter.getInstance(a2Var.f12825a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 1:
                            a2 a2Var2 = this.f13094b;
                            ArrayList arrayList4 = a2Var2.f12826b;
                            int i14 = a2Var2.f12825a;
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            z1 c10 = a2Var2.c(tL_quickReply2.shortcut_id);
                            if (c10 != null) {
                                c10.f13099b = tL_quickReply2.shortcut;
                                c10.f13101f = tL_quickReply2.count;
                                c10.d = tL_quickReply2.top_message;
                                MessageObject messageObject2 = c10.e;
                                if (messageObject2 != null && messageObject2.getId() != tL_quickReply2.top_message) {
                                    c10.e = null;
                                    long clientUserId = UserConfig.getInstance(i14).getClientUserId();
                                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i14);
                                    messagesStorage.getStorageQueue().postRunnable(new b3(a2Var2, messagesStorage, c10, clientUserId, 14));
                                    return;
                                }
                            } else {
                                z1 z1Var2 = new z1();
                                z1Var2.f13098a = tL_quickReply2.shortcut_id;
                                z1Var2.f13099b = tL_quickReply2.shortcut;
                                z1Var2.f13101f = tL_quickReply2.count;
                                z1Var2.d = tL_quickReply2.top_message;
                                for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                                    ((z1) arrayList4.get(i15)).f13100c = i15;
                                }
                                arrayList4.add(z1Var2);
                                a2Var2.a(z1Var2.f13099b);
                            }
                            a2Var2.l();
                            NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 2:
                            a2 a2Var3 = this.f13094b;
                            int i16 = a2Var3.f12825a;
                            z1 c11 = a2Var3.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c11 != null) {
                                a2Var3.f12826b.remove(c11);
                                a2Var3.a(c11.f13099b);
                                int i17 = c11.f13098a;
                                MessagesStorage messagesStorage2 = MessagesStorage.getInstance(i16);
                                messagesStorage2.getStorageQueue().postRunnable(new ah.g(messagesStorage2, i17, 12));
                                a2Var3.l();
                                NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                return;
                            }
                            return;
                        default:
                            a2 a2Var4 = this.f13094b;
                            int i18 = a2Var4.f12825a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            z1 c12 = a2Var4.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c12 != null) {
                                int size = c12.f13101f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c12.f13101f = size;
                                if (size <= 0) {
                                    a2Var4.f12826b.remove(c12);
                                }
                                ArrayList<Integer> arrayList5 = tL_updateDeleteQuickReplyMessages.messages;
                                MessageObject messageObject3 = c12.e;
                                if (messageObject3 != null) {
                                    i11 = messageObject3.getId();
                                } else {
                                    i11 = c12.d;
                                }
                                if (!arrayList5.contains(Integer.valueOf(i11)) && c12.e != null) {
                                    a2Var4.l();
                                    NotificationCenter.getInstance(i18).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                    return;
                                }
                                c12.e = null;
                                long clientUserId2 = UserConfig.getInstance(i18).getClientUserId();
                                MessagesStorage messagesStorage3 = MessagesStorage.getInstance(i18);
                                messagesStorage3.getStorageQueue().postRunnable(new b3(a2Var4, messagesStorage3, c12, clientUserId2, 14));
                                return;
                            }
                            return;
                    }
                }
            });
            return true;
        } else if (update instanceof TL_update.TL_updateDeleteQuickReplyMessages) {
            b(new Runnable(this) {
                public final a2 f13094b;

                {
                    this.f13094b = this;
                }

                @Override
                public final void run() {
                    z1 z1Var;
                    int i11;
                    switch (r3) {
                        case 0:
                            ArrayList<TLRPC.TL_quickReply> arrayList = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            a2 a2Var = this.f13094b;
                            ArrayList arrayList2 = a2Var.f12826b;
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            arrayList2.clear();
                            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList.get(i12);
                                int i13 = 0;
                                while (true) {
                                    if (i13 < arrayList3.size()) {
                                        if (((z1) arrayList3.get(i13)).f13098a == tL_quickReply.shortcut_id) {
                                            z1Var = (z1) arrayList3.get(i13);
                                        } else {
                                            i13++;
                                        }
                                    } else {
                                        z1Var = null;
                                    }
                                }
                                if (z1Var == null) {
                                    z1Var = new z1();
                                }
                                z1Var.f13098a = tL_quickReply.shortcut_id;
                                z1Var.f13099b = tL_quickReply.shortcut;
                                z1Var.f13101f = tL_quickReply.count;
                                z1Var.f13100c = i12;
                                z1Var.d = tL_quickReply.top_message;
                                MessageObject messageObject = z1Var.e;
                                if (messageObject != null && messageObject.getId() != tL_quickReply.top_message) {
                                    z1Var.e = null;
                                }
                                arrayList2.add(z1Var);
                                a2Var.a(z1Var.f13099b);
                            }
                            a2Var.l();
                            NotificationCenter.getInstance(a2Var.f12825a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 1:
                            a2 a2Var2 = this.f13094b;
                            ArrayList arrayList4 = a2Var2.f12826b;
                            int i14 = a2Var2.f12825a;
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            z1 c10 = a2Var2.c(tL_quickReply2.shortcut_id);
                            if (c10 != null) {
                                c10.f13099b = tL_quickReply2.shortcut;
                                c10.f13101f = tL_quickReply2.count;
                                c10.d = tL_quickReply2.top_message;
                                MessageObject messageObject2 = c10.e;
                                if (messageObject2 != null && messageObject2.getId() != tL_quickReply2.top_message) {
                                    c10.e = null;
                                    long clientUserId = UserConfig.getInstance(i14).getClientUserId();
                                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i14);
                                    messagesStorage.getStorageQueue().postRunnable(new b3(a2Var2, messagesStorage, c10, clientUserId, 14));
                                    return;
                                }
                            } else {
                                z1 z1Var2 = new z1();
                                z1Var2.f13098a = tL_quickReply2.shortcut_id;
                                z1Var2.f13099b = tL_quickReply2.shortcut;
                                z1Var2.f13101f = tL_quickReply2.count;
                                z1Var2.d = tL_quickReply2.top_message;
                                for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                                    ((z1) arrayList4.get(i15)).f13100c = i15;
                                }
                                arrayList4.add(z1Var2);
                                a2Var2.a(z1Var2.f13099b);
                            }
                            a2Var2.l();
                            NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 2:
                            a2 a2Var3 = this.f13094b;
                            int i16 = a2Var3.f12825a;
                            z1 c11 = a2Var3.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c11 != null) {
                                a2Var3.f12826b.remove(c11);
                                a2Var3.a(c11.f13099b);
                                int i17 = c11.f13098a;
                                MessagesStorage messagesStorage2 = MessagesStorage.getInstance(i16);
                                messagesStorage2.getStorageQueue().postRunnable(new ah.g(messagesStorage2, i17, 12));
                                a2Var3.l();
                                NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                return;
                            }
                            return;
                        default:
                            a2 a2Var4 = this.f13094b;
                            int i18 = a2Var4.f12825a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            z1 c12 = a2Var4.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c12 != null) {
                                int size = c12.f13101f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c12.f13101f = size;
                                if (size <= 0) {
                                    a2Var4.f12826b.remove(c12);
                                }
                                ArrayList<Integer> arrayList5 = tL_updateDeleteQuickReplyMessages.messages;
                                MessageObject messageObject3 = c12.e;
                                if (messageObject3 != null) {
                                    i11 = messageObject3.getId();
                                } else {
                                    i11 = c12.d;
                                }
                                if (!arrayList5.contains(Integer.valueOf(i11)) && c12.e != null) {
                                    a2Var4.l();
                                    NotificationCenter.getInstance(i18).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                    return;
                                }
                                c12.e = null;
                                long clientUserId2 = UserConfig.getInstance(i18).getClientUserId();
                                MessagesStorage messagesStorage3 = MessagesStorage.getInstance(i18);
                                messagesStorage3.getStorageQueue().postRunnable(new b3(a2Var4, messagesStorage3, c12, clientUserId2, 14));
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
        z1 c10 = c(i10);
        if (c10 == null) {
            return;
        }
        c10.f13099b = str;
        TLRPC.TL_messages_editQuickReplyShortcut tL_messages_editQuickReplyShortcut = new TLRPC.TL_messages_editQuickReplyShortcut();
        tL_messages_editQuickReplyShortcut.shortcut_id = i10;
        tL_messages_editQuickReplyShortcut.shortcut = str;
        int i11 = this.f12825a;
        ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editQuickReplyShortcut, new d6(7));
        l();
        NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
    }

    public final void l() {
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.f12825a);
        messagesStorage.getStorageQueue().postRunnable(new hi.t(8, this, messagesStorage));
    }
}
