package ig;

import ai.c3;
import ai.db;
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
public final class z1 {
    public static volatile z1[] f13137g = new z1[4];
    public static final Object[] h = new Object[4];
    public final int f13138a;
    public final ArrayList f13139b = new ArrayList();
    public final ArrayList f13140c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public boolean e;
    public boolean f13141f;

    static {
        for (int i10 = 0; i10 < 4; i10++) {
            h[i10] = new Object();
        }
    }

    public z1(int i10) {
        this.f13138a = i10;
    }

    public static z1 f(int i10) {
        z1 z1Var;
        z1 z1Var2 = f13137g[i10];
        if (z1Var2 == null) {
            synchronized (h[i10]) {
                try {
                    z1Var = f13137g[i10];
                    if (z1Var == null) {
                        z1[] z1VarArr = f13137g;
                        z1 z1Var3 = new z1(i10);
                        z1VarArr[i10] = z1Var3;
                        z1Var = z1Var3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return z1Var;
        }
        return z1Var2;
    }

    public static boolean g(String str) {
        if (!"hello".equalsIgnoreCase(str) && !"away".equalsIgnoreCase(str)) {
            return false;
        }
        return true;
    }

    public final void a(String str) {
        y1 y1Var;
        ArrayList arrayList = this.f13140c;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                y1Var = (y1) obj;
                if (TextUtils.equals(str, y1Var.f13130b)) {
                    break;
                }
            } else {
                y1Var = null;
                break;
            }
        }
        if (y1Var != null) {
            arrayList.remove(y1Var);
            NotificationCenter.getInstance(this.f13138a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
        }
    }

    public final void b(Runnable runnable) {
        if (this.f13141f) {
            runnable.run();
        } else {
            i(runnable, true);
        }
    }

    public final y1 c(long j10) {
        ArrayList arrayList = this.f13139b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            y1 y1Var = (y1) obj;
            if (y1Var.f13129a == j10) {
                return y1Var;
            }
        }
        return null;
    }

    public final y1 d(String str) {
        ArrayList arrayList = this.f13139b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            y1 y1Var = (y1) obj;
            if (TextUtils.equals(str, y1Var.f13130b)) {
                return y1Var;
            }
        }
        return null;
    }

    public final ArrayList e() {
        ArrayList arrayList = this.d;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f13139b;
            if (i10 < arrayList2.size()) {
                if (!g(((y1) arrayList2.get(i10)).f13130b)) {
                    arrayList.add((y1) arrayList2.get(i10));
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
        throw new UnsupportedOperationException("Method not decompiled: ig.z1.i(java.lang.Runnable, boolean):void");
    }

    public final boolean j(final TLRPC.Update update, String str, int i10) {
        if (update instanceof TL_update.TL_updateQuickReplyMessage) {
            b(new db(this, ((TL_update.TL_updateQuickReplyMessage) update).message, str, i10, 6));
            return true;
        } else if (update instanceof TL_update.TL_updateQuickReplies) {
            b(new Runnable(this) {
                public final z1 f13121b;

                {
                    this.f13121b = this;
                }

                @Override
                public final void run() {
                    y1 y1Var;
                    int i11;
                    switch (r3) {
                        case 0:
                            ArrayList<TLRPC.TL_quickReply> arrayList = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            z1 z1Var = this.f13121b;
                            ArrayList arrayList2 = z1Var.f13139b;
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            arrayList2.clear();
                            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList.get(i12);
                                int i13 = 0;
                                while (true) {
                                    if (i13 < arrayList3.size()) {
                                        if (((y1) arrayList3.get(i13)).f13129a == tL_quickReply.shortcut_id) {
                                            y1Var = (y1) arrayList3.get(i13);
                                        } else {
                                            i13++;
                                        }
                                    } else {
                                        y1Var = null;
                                    }
                                }
                                if (y1Var == null) {
                                    y1Var = new y1();
                                }
                                y1Var.f13129a = tL_quickReply.shortcut_id;
                                y1Var.f13130b = tL_quickReply.shortcut;
                                y1Var.f13132f = tL_quickReply.count;
                                y1Var.f13131c = i12;
                                y1Var.d = tL_quickReply.top_message;
                                MessageObject messageObject = y1Var.e;
                                if (messageObject != null && messageObject.getId() != tL_quickReply.top_message) {
                                    y1Var.e = null;
                                }
                                arrayList2.add(y1Var);
                                z1Var.a(y1Var.f13130b);
                            }
                            z1Var.l();
                            NotificationCenter.getInstance(z1Var.f13138a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 1:
                            z1 z1Var2 = this.f13121b;
                            ArrayList arrayList4 = z1Var2.f13139b;
                            int i14 = z1Var2.f13138a;
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            y1 c10 = z1Var2.c(tL_quickReply2.shortcut_id);
                            if (c10 != null) {
                                c10.f13130b = tL_quickReply2.shortcut;
                                c10.f13132f = tL_quickReply2.count;
                                c10.d = tL_quickReply2.top_message;
                                MessageObject messageObject2 = c10.e;
                                if (messageObject2 != null && messageObject2.getId() != tL_quickReply2.top_message) {
                                    c10.e = null;
                                    long clientUserId = UserConfig.getInstance(i14).getClientUserId();
                                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i14);
                                    messagesStorage.getStorageQueue().postRunnable(new c3(z1Var2, messagesStorage, c10, clientUserId, 14));
                                    return;
                                }
                            } else {
                                y1 y1Var2 = new y1();
                                y1Var2.f13129a = tL_quickReply2.shortcut_id;
                                y1Var2.f13130b = tL_quickReply2.shortcut;
                                y1Var2.f13132f = tL_quickReply2.count;
                                y1Var2.d = tL_quickReply2.top_message;
                                for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                                    ((y1) arrayList4.get(i15)).f13131c = i15;
                                }
                                arrayList4.add(y1Var2);
                                z1Var2.a(y1Var2.f13130b);
                            }
                            z1Var2.l();
                            NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 2:
                            z1 z1Var3 = this.f13121b;
                            int i16 = z1Var3.f13138a;
                            y1 c11 = z1Var3.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c11 != null) {
                                z1Var3.f13139b.remove(c11);
                                z1Var3.a(c11.f13130b);
                                int i17 = c11.f13129a;
                                MessagesStorage messagesStorage2 = MessagesStorage.getInstance(i16);
                                messagesStorage2.getStorageQueue().postRunnable(new ah.g(messagesStorage2, i17, 12));
                                z1Var3.l();
                                NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                return;
                            }
                            return;
                        default:
                            z1 z1Var4 = this.f13121b;
                            int i18 = z1Var4.f13138a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            y1 c12 = z1Var4.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c12 != null) {
                                int size = c12.f13132f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c12.f13132f = size;
                                if (size <= 0) {
                                    z1Var4.f13139b.remove(c12);
                                }
                                ArrayList<Integer> arrayList5 = tL_updateDeleteQuickReplyMessages.messages;
                                MessageObject messageObject3 = c12.e;
                                if (messageObject3 != null) {
                                    i11 = messageObject3.getId();
                                } else {
                                    i11 = c12.d;
                                }
                                if (!arrayList5.contains(Integer.valueOf(i11)) && c12.e != null) {
                                    z1Var4.l();
                                    NotificationCenter.getInstance(i18).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                    return;
                                }
                                c12.e = null;
                                long clientUserId2 = UserConfig.getInstance(i18).getClientUserId();
                                MessagesStorage messagesStorage3 = MessagesStorage.getInstance(i18);
                                messagesStorage3.getStorageQueue().postRunnable(new c3(z1Var4, messagesStorage3, c12, clientUserId2, 14));
                                return;
                            }
                            return;
                    }
                }
            });
            return true;
        } else if (update instanceof TL_update.TL_updateNewQuickReply) {
            b(new Runnable(this) {
                public final z1 f13121b;

                {
                    this.f13121b = this;
                }

                @Override
                public final void run() {
                    y1 y1Var;
                    int i11;
                    switch (r3) {
                        case 0:
                            ArrayList<TLRPC.TL_quickReply> arrayList = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            z1 z1Var = this.f13121b;
                            ArrayList arrayList2 = z1Var.f13139b;
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            arrayList2.clear();
                            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList.get(i12);
                                int i13 = 0;
                                while (true) {
                                    if (i13 < arrayList3.size()) {
                                        if (((y1) arrayList3.get(i13)).f13129a == tL_quickReply.shortcut_id) {
                                            y1Var = (y1) arrayList3.get(i13);
                                        } else {
                                            i13++;
                                        }
                                    } else {
                                        y1Var = null;
                                    }
                                }
                                if (y1Var == null) {
                                    y1Var = new y1();
                                }
                                y1Var.f13129a = tL_quickReply.shortcut_id;
                                y1Var.f13130b = tL_quickReply.shortcut;
                                y1Var.f13132f = tL_quickReply.count;
                                y1Var.f13131c = i12;
                                y1Var.d = tL_quickReply.top_message;
                                MessageObject messageObject = y1Var.e;
                                if (messageObject != null && messageObject.getId() != tL_quickReply.top_message) {
                                    y1Var.e = null;
                                }
                                arrayList2.add(y1Var);
                                z1Var.a(y1Var.f13130b);
                            }
                            z1Var.l();
                            NotificationCenter.getInstance(z1Var.f13138a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 1:
                            z1 z1Var2 = this.f13121b;
                            ArrayList arrayList4 = z1Var2.f13139b;
                            int i14 = z1Var2.f13138a;
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            y1 c10 = z1Var2.c(tL_quickReply2.shortcut_id);
                            if (c10 != null) {
                                c10.f13130b = tL_quickReply2.shortcut;
                                c10.f13132f = tL_quickReply2.count;
                                c10.d = tL_quickReply2.top_message;
                                MessageObject messageObject2 = c10.e;
                                if (messageObject2 != null && messageObject2.getId() != tL_quickReply2.top_message) {
                                    c10.e = null;
                                    long clientUserId = UserConfig.getInstance(i14).getClientUserId();
                                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i14);
                                    messagesStorage.getStorageQueue().postRunnable(new c3(z1Var2, messagesStorage, c10, clientUserId, 14));
                                    return;
                                }
                            } else {
                                y1 y1Var2 = new y1();
                                y1Var2.f13129a = tL_quickReply2.shortcut_id;
                                y1Var2.f13130b = tL_quickReply2.shortcut;
                                y1Var2.f13132f = tL_quickReply2.count;
                                y1Var2.d = tL_quickReply2.top_message;
                                for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                                    ((y1) arrayList4.get(i15)).f13131c = i15;
                                }
                                arrayList4.add(y1Var2);
                                z1Var2.a(y1Var2.f13130b);
                            }
                            z1Var2.l();
                            NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 2:
                            z1 z1Var3 = this.f13121b;
                            int i16 = z1Var3.f13138a;
                            y1 c11 = z1Var3.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c11 != null) {
                                z1Var3.f13139b.remove(c11);
                                z1Var3.a(c11.f13130b);
                                int i17 = c11.f13129a;
                                MessagesStorage messagesStorage2 = MessagesStorage.getInstance(i16);
                                messagesStorage2.getStorageQueue().postRunnable(new ah.g(messagesStorage2, i17, 12));
                                z1Var3.l();
                                NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                return;
                            }
                            return;
                        default:
                            z1 z1Var4 = this.f13121b;
                            int i18 = z1Var4.f13138a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            y1 c12 = z1Var4.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c12 != null) {
                                int size = c12.f13132f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c12.f13132f = size;
                                if (size <= 0) {
                                    z1Var4.f13139b.remove(c12);
                                }
                                ArrayList<Integer> arrayList5 = tL_updateDeleteQuickReplyMessages.messages;
                                MessageObject messageObject3 = c12.e;
                                if (messageObject3 != null) {
                                    i11 = messageObject3.getId();
                                } else {
                                    i11 = c12.d;
                                }
                                if (!arrayList5.contains(Integer.valueOf(i11)) && c12.e != null) {
                                    z1Var4.l();
                                    NotificationCenter.getInstance(i18).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                    return;
                                }
                                c12.e = null;
                                long clientUserId2 = UserConfig.getInstance(i18).getClientUserId();
                                MessagesStorage messagesStorage3 = MessagesStorage.getInstance(i18);
                                messagesStorage3.getStorageQueue().postRunnable(new c3(z1Var4, messagesStorage3, c12, clientUserId2, 14));
                                return;
                            }
                            return;
                    }
                }
            });
            return true;
        } else if (update instanceof TL_update.TL_updateDeleteQuickReply) {
            b(new Runnable(this) {
                public final z1 f13121b;

                {
                    this.f13121b = this;
                }

                @Override
                public final void run() {
                    y1 y1Var;
                    int i11;
                    switch (r3) {
                        case 0:
                            ArrayList<TLRPC.TL_quickReply> arrayList = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            z1 z1Var = this.f13121b;
                            ArrayList arrayList2 = z1Var.f13139b;
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            arrayList2.clear();
                            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList.get(i12);
                                int i13 = 0;
                                while (true) {
                                    if (i13 < arrayList3.size()) {
                                        if (((y1) arrayList3.get(i13)).f13129a == tL_quickReply.shortcut_id) {
                                            y1Var = (y1) arrayList3.get(i13);
                                        } else {
                                            i13++;
                                        }
                                    } else {
                                        y1Var = null;
                                    }
                                }
                                if (y1Var == null) {
                                    y1Var = new y1();
                                }
                                y1Var.f13129a = tL_quickReply.shortcut_id;
                                y1Var.f13130b = tL_quickReply.shortcut;
                                y1Var.f13132f = tL_quickReply.count;
                                y1Var.f13131c = i12;
                                y1Var.d = tL_quickReply.top_message;
                                MessageObject messageObject = y1Var.e;
                                if (messageObject != null && messageObject.getId() != tL_quickReply.top_message) {
                                    y1Var.e = null;
                                }
                                arrayList2.add(y1Var);
                                z1Var.a(y1Var.f13130b);
                            }
                            z1Var.l();
                            NotificationCenter.getInstance(z1Var.f13138a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 1:
                            z1 z1Var2 = this.f13121b;
                            ArrayList arrayList4 = z1Var2.f13139b;
                            int i14 = z1Var2.f13138a;
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            y1 c10 = z1Var2.c(tL_quickReply2.shortcut_id);
                            if (c10 != null) {
                                c10.f13130b = tL_quickReply2.shortcut;
                                c10.f13132f = tL_quickReply2.count;
                                c10.d = tL_quickReply2.top_message;
                                MessageObject messageObject2 = c10.e;
                                if (messageObject2 != null && messageObject2.getId() != tL_quickReply2.top_message) {
                                    c10.e = null;
                                    long clientUserId = UserConfig.getInstance(i14).getClientUserId();
                                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i14);
                                    messagesStorage.getStorageQueue().postRunnable(new c3(z1Var2, messagesStorage, c10, clientUserId, 14));
                                    return;
                                }
                            } else {
                                y1 y1Var2 = new y1();
                                y1Var2.f13129a = tL_quickReply2.shortcut_id;
                                y1Var2.f13130b = tL_quickReply2.shortcut;
                                y1Var2.f13132f = tL_quickReply2.count;
                                y1Var2.d = tL_quickReply2.top_message;
                                for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                                    ((y1) arrayList4.get(i15)).f13131c = i15;
                                }
                                arrayList4.add(y1Var2);
                                z1Var2.a(y1Var2.f13130b);
                            }
                            z1Var2.l();
                            NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 2:
                            z1 z1Var3 = this.f13121b;
                            int i16 = z1Var3.f13138a;
                            y1 c11 = z1Var3.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c11 != null) {
                                z1Var3.f13139b.remove(c11);
                                z1Var3.a(c11.f13130b);
                                int i17 = c11.f13129a;
                                MessagesStorage messagesStorage2 = MessagesStorage.getInstance(i16);
                                messagesStorage2.getStorageQueue().postRunnable(new ah.g(messagesStorage2, i17, 12));
                                z1Var3.l();
                                NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                return;
                            }
                            return;
                        default:
                            z1 z1Var4 = this.f13121b;
                            int i18 = z1Var4.f13138a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            y1 c12 = z1Var4.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c12 != null) {
                                int size = c12.f13132f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c12.f13132f = size;
                                if (size <= 0) {
                                    z1Var4.f13139b.remove(c12);
                                }
                                ArrayList<Integer> arrayList5 = tL_updateDeleteQuickReplyMessages.messages;
                                MessageObject messageObject3 = c12.e;
                                if (messageObject3 != null) {
                                    i11 = messageObject3.getId();
                                } else {
                                    i11 = c12.d;
                                }
                                if (!arrayList5.contains(Integer.valueOf(i11)) && c12.e != null) {
                                    z1Var4.l();
                                    NotificationCenter.getInstance(i18).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                    return;
                                }
                                c12.e = null;
                                long clientUserId2 = UserConfig.getInstance(i18).getClientUserId();
                                MessagesStorage messagesStorage3 = MessagesStorage.getInstance(i18);
                                messagesStorage3.getStorageQueue().postRunnable(new c3(z1Var4, messagesStorage3, c12, clientUserId2, 14));
                                return;
                            }
                            return;
                    }
                }
            });
            return true;
        } else if (update instanceof TL_update.TL_updateDeleteQuickReplyMessages) {
            b(new Runnable(this) {
                public final z1 f13121b;

                {
                    this.f13121b = this;
                }

                @Override
                public final void run() {
                    y1 y1Var;
                    int i11;
                    switch (r3) {
                        case 0:
                            ArrayList<TLRPC.TL_quickReply> arrayList = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            z1 z1Var = this.f13121b;
                            ArrayList arrayList2 = z1Var.f13139b;
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            arrayList2.clear();
                            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList.get(i12);
                                int i13 = 0;
                                while (true) {
                                    if (i13 < arrayList3.size()) {
                                        if (((y1) arrayList3.get(i13)).f13129a == tL_quickReply.shortcut_id) {
                                            y1Var = (y1) arrayList3.get(i13);
                                        } else {
                                            i13++;
                                        }
                                    } else {
                                        y1Var = null;
                                    }
                                }
                                if (y1Var == null) {
                                    y1Var = new y1();
                                }
                                y1Var.f13129a = tL_quickReply.shortcut_id;
                                y1Var.f13130b = tL_quickReply.shortcut;
                                y1Var.f13132f = tL_quickReply.count;
                                y1Var.f13131c = i12;
                                y1Var.d = tL_quickReply.top_message;
                                MessageObject messageObject = y1Var.e;
                                if (messageObject != null && messageObject.getId() != tL_quickReply.top_message) {
                                    y1Var.e = null;
                                }
                                arrayList2.add(y1Var);
                                z1Var.a(y1Var.f13130b);
                            }
                            z1Var.l();
                            NotificationCenter.getInstance(z1Var.f13138a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 1:
                            z1 z1Var2 = this.f13121b;
                            ArrayList arrayList4 = z1Var2.f13139b;
                            int i14 = z1Var2.f13138a;
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            y1 c10 = z1Var2.c(tL_quickReply2.shortcut_id);
                            if (c10 != null) {
                                c10.f13130b = tL_quickReply2.shortcut;
                                c10.f13132f = tL_quickReply2.count;
                                c10.d = tL_quickReply2.top_message;
                                MessageObject messageObject2 = c10.e;
                                if (messageObject2 != null && messageObject2.getId() != tL_quickReply2.top_message) {
                                    c10.e = null;
                                    long clientUserId = UserConfig.getInstance(i14).getClientUserId();
                                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i14);
                                    messagesStorage.getStorageQueue().postRunnable(new c3(z1Var2, messagesStorage, c10, clientUserId, 14));
                                    return;
                                }
                            } else {
                                y1 y1Var2 = new y1();
                                y1Var2.f13129a = tL_quickReply2.shortcut_id;
                                y1Var2.f13130b = tL_quickReply2.shortcut;
                                y1Var2.f13132f = tL_quickReply2.count;
                                y1Var2.d = tL_quickReply2.top_message;
                                for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                                    ((y1) arrayList4.get(i15)).f13131c = i15;
                                }
                                arrayList4.add(y1Var2);
                                z1Var2.a(y1Var2.f13130b);
                            }
                            z1Var2.l();
                            NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 2:
                            z1 z1Var3 = this.f13121b;
                            int i16 = z1Var3.f13138a;
                            y1 c11 = z1Var3.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c11 != null) {
                                z1Var3.f13139b.remove(c11);
                                z1Var3.a(c11.f13130b);
                                int i17 = c11.f13129a;
                                MessagesStorage messagesStorage2 = MessagesStorage.getInstance(i16);
                                messagesStorage2.getStorageQueue().postRunnable(new ah.g(messagesStorage2, i17, 12));
                                z1Var3.l();
                                NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                return;
                            }
                            return;
                        default:
                            z1 z1Var4 = this.f13121b;
                            int i18 = z1Var4.f13138a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            y1 c12 = z1Var4.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c12 != null) {
                                int size = c12.f13132f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c12.f13132f = size;
                                if (size <= 0) {
                                    z1Var4.f13139b.remove(c12);
                                }
                                ArrayList<Integer> arrayList5 = tL_updateDeleteQuickReplyMessages.messages;
                                MessageObject messageObject3 = c12.e;
                                if (messageObject3 != null) {
                                    i11 = messageObject3.getId();
                                } else {
                                    i11 = c12.d;
                                }
                                if (!arrayList5.contains(Integer.valueOf(i11)) && c12.e != null) {
                                    z1Var4.l();
                                    NotificationCenter.getInstance(i18).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                    return;
                                }
                                c12.e = null;
                                long clientUserId2 = UserConfig.getInstance(i18).getClientUserId();
                                MessagesStorage messagesStorage3 = MessagesStorage.getInstance(i18);
                                messagesStorage3.getStorageQueue().postRunnable(new c3(z1Var4, messagesStorage3, c12, clientUserId2, 14));
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
        y1 c10 = c(i10);
        if (c10 == null) {
            return;
        }
        c10.f13130b = str;
        TLRPC.TL_messages_editQuickReplyShortcut tL_messages_editQuickReplyShortcut = new TLRPC.TL_messages_editQuickReplyShortcut();
        tL_messages_editQuickReplyShortcut.shortcut_id = i10;
        tL_messages_editQuickReplyShortcut.shortcut = str;
        int i11 = this.f13138a;
        ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editQuickReplyShortcut, new d6(7));
        l();
        NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
    }

    public final void l() {
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.f13138a);
        messagesStorage.getStorageQueue().postRunnable(new hi.t(8, this, messagesStorage));
    }
}
