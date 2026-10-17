package ig;

import ai.bb;
import ai.c3;
import android.text.TextUtils;
import ci.e6;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
public final class y1 {
    public static volatile y1[] f13092g = new y1[4];
    public static final Object[] h = new Object[4];
    public final int f13093a;
    public final ArrayList f13094b = new ArrayList();
    public final ArrayList f13095c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public boolean e;
    public boolean f13096f;

    static {
        for (int i10 = 0; i10 < 4; i10++) {
            h[i10] = new Object();
        }
    }

    public y1(int i10) {
        this.f13093a = i10;
    }

    public static y1 f(int i10) {
        y1 y1Var;
        y1 y1Var2 = f13092g[i10];
        if (y1Var2 == null) {
            synchronized (h[i10]) {
                try {
                    y1Var = f13092g[i10];
                    if (y1Var == null) {
                        y1[] y1VarArr = f13092g;
                        y1 y1Var3 = new y1(i10);
                        y1VarArr[i10] = y1Var3;
                        y1Var = y1Var3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return y1Var;
        }
        return y1Var2;
    }

    public static boolean g(String str) {
        if (!"hello".equalsIgnoreCase(str) && !"away".equalsIgnoreCase(str)) {
            return false;
        }
        return true;
    }

    public final void a(String str) {
        x1 x1Var;
        ArrayList arrayList = this.f13095c;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                x1Var = (x1) obj;
                if (TextUtils.equals(str, x1Var.f13081b)) {
                    break;
                }
            } else {
                x1Var = null;
                break;
            }
        }
        if (x1Var != null) {
            arrayList.remove(x1Var);
            NotificationCenter.getInstance(this.f13093a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
        }
    }

    public final void b(Runnable runnable) {
        if (this.f13096f) {
            runnable.run();
        } else {
            i(runnable, true);
        }
    }

    public final x1 c(long j10) {
        ArrayList arrayList = this.f13094b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            x1 x1Var = (x1) obj;
            if (x1Var.f13080a == j10) {
                return x1Var;
            }
        }
        return null;
    }

    public final x1 d(String str) {
        ArrayList arrayList = this.f13094b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            x1 x1Var = (x1) obj;
            if (TextUtils.equals(str, x1Var.f13081b)) {
                return x1Var;
            }
        }
        return null;
    }

    public final ArrayList e() {
        ArrayList arrayList = this.d;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f13094b;
            if (i10 < arrayList2.size()) {
                if (!g(((x1) arrayList2.get(i10)).f13081b)) {
                    arrayList.add((x1) arrayList2.get(i10));
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
        throw new UnsupportedOperationException("Method not decompiled: ig.y1.i(java.lang.Runnable, boolean):void");
    }

    public final boolean j(final TLRPC.Update update, String str, int i10) {
        if (update instanceof TL_update.TL_updateQuickReplyMessage) {
            b(new bb(this, ((TL_update.TL_updateQuickReplyMessage) update).message, str, i10, 6));
            return true;
        } else if (update instanceof TL_update.TL_updateQuickReplies) {
            b(new Runnable(this) {
                public final y1 f13074b;

                {
                    this.f13074b = this;
                }

                @Override
                public final void run() {
                    x1 x1Var;
                    int i11;
                    switch (r3) {
                        case 0:
                            ArrayList<TLRPC.TL_quickReply> arrayList = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            y1 y1Var = this.f13074b;
                            ArrayList arrayList2 = y1Var.f13094b;
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            arrayList2.clear();
                            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList.get(i12);
                                int i13 = 0;
                                while (true) {
                                    if (i13 < arrayList3.size()) {
                                        if (((x1) arrayList3.get(i13)).f13080a == tL_quickReply.shortcut_id) {
                                            x1Var = (x1) arrayList3.get(i13);
                                        } else {
                                            i13++;
                                        }
                                    } else {
                                        x1Var = null;
                                    }
                                }
                                if (x1Var == null) {
                                    x1Var = new x1();
                                }
                                x1Var.f13080a = tL_quickReply.shortcut_id;
                                x1Var.f13081b = tL_quickReply.shortcut;
                                x1Var.f13083f = tL_quickReply.count;
                                x1Var.f13082c = i12;
                                x1Var.d = tL_quickReply.top_message;
                                MessageObject messageObject = x1Var.e;
                                if (messageObject != null && messageObject.getId() != tL_quickReply.top_message) {
                                    x1Var.e = null;
                                }
                                arrayList2.add(x1Var);
                                y1Var.a(x1Var.f13081b);
                            }
                            y1Var.l();
                            NotificationCenter.getInstance(y1Var.f13093a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 1:
                            y1 y1Var2 = this.f13074b;
                            ArrayList arrayList4 = y1Var2.f13094b;
                            int i14 = y1Var2.f13093a;
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            x1 c10 = y1Var2.c(tL_quickReply2.shortcut_id);
                            if (c10 != null) {
                                c10.f13081b = tL_quickReply2.shortcut;
                                c10.f13083f = tL_quickReply2.count;
                                c10.d = tL_quickReply2.top_message;
                                MessageObject messageObject2 = c10.e;
                                if (messageObject2 != null && messageObject2.getId() != tL_quickReply2.top_message) {
                                    c10.e = null;
                                    long clientUserId = UserConfig.getInstance(i14).getClientUserId();
                                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i14);
                                    messagesStorage.getStorageQueue().postRunnable(new c3(y1Var2, messagesStorage, c10, clientUserId, 14));
                                    return;
                                }
                            } else {
                                x1 x1Var2 = new x1();
                                x1Var2.f13080a = tL_quickReply2.shortcut_id;
                                x1Var2.f13081b = tL_quickReply2.shortcut;
                                x1Var2.f13083f = tL_quickReply2.count;
                                x1Var2.d = tL_quickReply2.top_message;
                                for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                                    ((x1) arrayList4.get(i15)).f13082c = i15;
                                }
                                arrayList4.add(x1Var2);
                                y1Var2.a(x1Var2.f13081b);
                            }
                            y1Var2.l();
                            NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 2:
                            y1 y1Var3 = this.f13074b;
                            int i16 = y1Var3.f13093a;
                            x1 c11 = y1Var3.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c11 != null) {
                                y1Var3.f13094b.remove(c11);
                                y1Var3.a(c11.f13081b);
                                int i17 = c11.f13080a;
                                MessagesStorage messagesStorage2 = MessagesStorage.getInstance(i16);
                                messagesStorage2.getStorageQueue().postRunnable(new ah.g(messagesStorage2, i17, 12));
                                y1Var3.l();
                                NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                return;
                            }
                            return;
                        default:
                            y1 y1Var4 = this.f13074b;
                            int i18 = y1Var4.f13093a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            x1 c12 = y1Var4.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c12 != null) {
                                int size = c12.f13083f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c12.f13083f = size;
                                if (size <= 0) {
                                    y1Var4.f13094b.remove(c12);
                                }
                                ArrayList<Integer> arrayList5 = tL_updateDeleteQuickReplyMessages.messages;
                                MessageObject messageObject3 = c12.e;
                                if (messageObject3 != null) {
                                    i11 = messageObject3.getId();
                                } else {
                                    i11 = c12.d;
                                }
                                if (!arrayList5.contains(Integer.valueOf(i11)) && c12.e != null) {
                                    y1Var4.l();
                                    NotificationCenter.getInstance(i18).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                    return;
                                }
                                c12.e = null;
                                long clientUserId2 = UserConfig.getInstance(i18).getClientUserId();
                                MessagesStorage messagesStorage3 = MessagesStorage.getInstance(i18);
                                messagesStorage3.getStorageQueue().postRunnable(new c3(y1Var4, messagesStorage3, c12, clientUserId2, 14));
                                return;
                            }
                            return;
                    }
                }
            });
            return true;
        } else if (update instanceof TL_update.TL_updateNewQuickReply) {
            b(new Runnable(this) {
                public final y1 f13074b;

                {
                    this.f13074b = this;
                }

                @Override
                public final void run() {
                    x1 x1Var;
                    int i11;
                    switch (r3) {
                        case 0:
                            ArrayList<TLRPC.TL_quickReply> arrayList = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            y1 y1Var = this.f13074b;
                            ArrayList arrayList2 = y1Var.f13094b;
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            arrayList2.clear();
                            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList.get(i12);
                                int i13 = 0;
                                while (true) {
                                    if (i13 < arrayList3.size()) {
                                        if (((x1) arrayList3.get(i13)).f13080a == tL_quickReply.shortcut_id) {
                                            x1Var = (x1) arrayList3.get(i13);
                                        } else {
                                            i13++;
                                        }
                                    } else {
                                        x1Var = null;
                                    }
                                }
                                if (x1Var == null) {
                                    x1Var = new x1();
                                }
                                x1Var.f13080a = tL_quickReply.shortcut_id;
                                x1Var.f13081b = tL_quickReply.shortcut;
                                x1Var.f13083f = tL_quickReply.count;
                                x1Var.f13082c = i12;
                                x1Var.d = tL_quickReply.top_message;
                                MessageObject messageObject = x1Var.e;
                                if (messageObject != null && messageObject.getId() != tL_quickReply.top_message) {
                                    x1Var.e = null;
                                }
                                arrayList2.add(x1Var);
                                y1Var.a(x1Var.f13081b);
                            }
                            y1Var.l();
                            NotificationCenter.getInstance(y1Var.f13093a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 1:
                            y1 y1Var2 = this.f13074b;
                            ArrayList arrayList4 = y1Var2.f13094b;
                            int i14 = y1Var2.f13093a;
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            x1 c10 = y1Var2.c(tL_quickReply2.shortcut_id);
                            if (c10 != null) {
                                c10.f13081b = tL_quickReply2.shortcut;
                                c10.f13083f = tL_quickReply2.count;
                                c10.d = tL_quickReply2.top_message;
                                MessageObject messageObject2 = c10.e;
                                if (messageObject2 != null && messageObject2.getId() != tL_quickReply2.top_message) {
                                    c10.e = null;
                                    long clientUserId = UserConfig.getInstance(i14).getClientUserId();
                                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i14);
                                    messagesStorage.getStorageQueue().postRunnable(new c3(y1Var2, messagesStorage, c10, clientUserId, 14));
                                    return;
                                }
                            } else {
                                x1 x1Var2 = new x1();
                                x1Var2.f13080a = tL_quickReply2.shortcut_id;
                                x1Var2.f13081b = tL_quickReply2.shortcut;
                                x1Var2.f13083f = tL_quickReply2.count;
                                x1Var2.d = tL_quickReply2.top_message;
                                for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                                    ((x1) arrayList4.get(i15)).f13082c = i15;
                                }
                                arrayList4.add(x1Var2);
                                y1Var2.a(x1Var2.f13081b);
                            }
                            y1Var2.l();
                            NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 2:
                            y1 y1Var3 = this.f13074b;
                            int i16 = y1Var3.f13093a;
                            x1 c11 = y1Var3.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c11 != null) {
                                y1Var3.f13094b.remove(c11);
                                y1Var3.a(c11.f13081b);
                                int i17 = c11.f13080a;
                                MessagesStorage messagesStorage2 = MessagesStorage.getInstance(i16);
                                messagesStorage2.getStorageQueue().postRunnable(new ah.g(messagesStorage2, i17, 12));
                                y1Var3.l();
                                NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                return;
                            }
                            return;
                        default:
                            y1 y1Var4 = this.f13074b;
                            int i18 = y1Var4.f13093a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            x1 c12 = y1Var4.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c12 != null) {
                                int size = c12.f13083f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c12.f13083f = size;
                                if (size <= 0) {
                                    y1Var4.f13094b.remove(c12);
                                }
                                ArrayList<Integer> arrayList5 = tL_updateDeleteQuickReplyMessages.messages;
                                MessageObject messageObject3 = c12.e;
                                if (messageObject3 != null) {
                                    i11 = messageObject3.getId();
                                } else {
                                    i11 = c12.d;
                                }
                                if (!arrayList5.contains(Integer.valueOf(i11)) && c12.e != null) {
                                    y1Var4.l();
                                    NotificationCenter.getInstance(i18).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                    return;
                                }
                                c12.e = null;
                                long clientUserId2 = UserConfig.getInstance(i18).getClientUserId();
                                MessagesStorage messagesStorage3 = MessagesStorage.getInstance(i18);
                                messagesStorage3.getStorageQueue().postRunnable(new c3(y1Var4, messagesStorage3, c12, clientUserId2, 14));
                                return;
                            }
                            return;
                    }
                }
            });
            return true;
        } else if (update instanceof TL_update.TL_updateDeleteQuickReply) {
            b(new Runnable(this) {
                public final y1 f13074b;

                {
                    this.f13074b = this;
                }

                @Override
                public final void run() {
                    x1 x1Var;
                    int i11;
                    switch (r3) {
                        case 0:
                            ArrayList<TLRPC.TL_quickReply> arrayList = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            y1 y1Var = this.f13074b;
                            ArrayList arrayList2 = y1Var.f13094b;
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            arrayList2.clear();
                            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList.get(i12);
                                int i13 = 0;
                                while (true) {
                                    if (i13 < arrayList3.size()) {
                                        if (((x1) arrayList3.get(i13)).f13080a == tL_quickReply.shortcut_id) {
                                            x1Var = (x1) arrayList3.get(i13);
                                        } else {
                                            i13++;
                                        }
                                    } else {
                                        x1Var = null;
                                    }
                                }
                                if (x1Var == null) {
                                    x1Var = new x1();
                                }
                                x1Var.f13080a = tL_quickReply.shortcut_id;
                                x1Var.f13081b = tL_quickReply.shortcut;
                                x1Var.f13083f = tL_quickReply.count;
                                x1Var.f13082c = i12;
                                x1Var.d = tL_quickReply.top_message;
                                MessageObject messageObject = x1Var.e;
                                if (messageObject != null && messageObject.getId() != tL_quickReply.top_message) {
                                    x1Var.e = null;
                                }
                                arrayList2.add(x1Var);
                                y1Var.a(x1Var.f13081b);
                            }
                            y1Var.l();
                            NotificationCenter.getInstance(y1Var.f13093a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 1:
                            y1 y1Var2 = this.f13074b;
                            ArrayList arrayList4 = y1Var2.f13094b;
                            int i14 = y1Var2.f13093a;
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            x1 c10 = y1Var2.c(tL_quickReply2.shortcut_id);
                            if (c10 != null) {
                                c10.f13081b = tL_quickReply2.shortcut;
                                c10.f13083f = tL_quickReply2.count;
                                c10.d = tL_quickReply2.top_message;
                                MessageObject messageObject2 = c10.e;
                                if (messageObject2 != null && messageObject2.getId() != tL_quickReply2.top_message) {
                                    c10.e = null;
                                    long clientUserId = UserConfig.getInstance(i14).getClientUserId();
                                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i14);
                                    messagesStorage.getStorageQueue().postRunnable(new c3(y1Var2, messagesStorage, c10, clientUserId, 14));
                                    return;
                                }
                            } else {
                                x1 x1Var2 = new x1();
                                x1Var2.f13080a = tL_quickReply2.shortcut_id;
                                x1Var2.f13081b = tL_quickReply2.shortcut;
                                x1Var2.f13083f = tL_quickReply2.count;
                                x1Var2.d = tL_quickReply2.top_message;
                                for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                                    ((x1) arrayList4.get(i15)).f13082c = i15;
                                }
                                arrayList4.add(x1Var2);
                                y1Var2.a(x1Var2.f13081b);
                            }
                            y1Var2.l();
                            NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 2:
                            y1 y1Var3 = this.f13074b;
                            int i16 = y1Var3.f13093a;
                            x1 c11 = y1Var3.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c11 != null) {
                                y1Var3.f13094b.remove(c11);
                                y1Var3.a(c11.f13081b);
                                int i17 = c11.f13080a;
                                MessagesStorage messagesStorage2 = MessagesStorage.getInstance(i16);
                                messagesStorage2.getStorageQueue().postRunnable(new ah.g(messagesStorage2, i17, 12));
                                y1Var3.l();
                                NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                return;
                            }
                            return;
                        default:
                            y1 y1Var4 = this.f13074b;
                            int i18 = y1Var4.f13093a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            x1 c12 = y1Var4.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c12 != null) {
                                int size = c12.f13083f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c12.f13083f = size;
                                if (size <= 0) {
                                    y1Var4.f13094b.remove(c12);
                                }
                                ArrayList<Integer> arrayList5 = tL_updateDeleteQuickReplyMessages.messages;
                                MessageObject messageObject3 = c12.e;
                                if (messageObject3 != null) {
                                    i11 = messageObject3.getId();
                                } else {
                                    i11 = c12.d;
                                }
                                if (!arrayList5.contains(Integer.valueOf(i11)) && c12.e != null) {
                                    y1Var4.l();
                                    NotificationCenter.getInstance(i18).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                    return;
                                }
                                c12.e = null;
                                long clientUserId2 = UserConfig.getInstance(i18).getClientUserId();
                                MessagesStorage messagesStorage3 = MessagesStorage.getInstance(i18);
                                messagesStorage3.getStorageQueue().postRunnable(new c3(y1Var4, messagesStorage3, c12, clientUserId2, 14));
                                return;
                            }
                            return;
                    }
                }
            });
            return true;
        } else if (update instanceof TL_update.TL_updateDeleteQuickReplyMessages) {
            b(new Runnable(this) {
                public final y1 f13074b;

                {
                    this.f13074b = this;
                }

                @Override
                public final void run() {
                    x1 x1Var;
                    int i11;
                    switch (r3) {
                        case 0:
                            ArrayList<TLRPC.TL_quickReply> arrayList = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            y1 y1Var = this.f13074b;
                            ArrayList arrayList2 = y1Var.f13094b;
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            arrayList2.clear();
                            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList.get(i12);
                                int i13 = 0;
                                while (true) {
                                    if (i13 < arrayList3.size()) {
                                        if (((x1) arrayList3.get(i13)).f13080a == tL_quickReply.shortcut_id) {
                                            x1Var = (x1) arrayList3.get(i13);
                                        } else {
                                            i13++;
                                        }
                                    } else {
                                        x1Var = null;
                                    }
                                }
                                if (x1Var == null) {
                                    x1Var = new x1();
                                }
                                x1Var.f13080a = tL_quickReply.shortcut_id;
                                x1Var.f13081b = tL_quickReply.shortcut;
                                x1Var.f13083f = tL_quickReply.count;
                                x1Var.f13082c = i12;
                                x1Var.d = tL_quickReply.top_message;
                                MessageObject messageObject = x1Var.e;
                                if (messageObject != null && messageObject.getId() != tL_quickReply.top_message) {
                                    x1Var.e = null;
                                }
                                arrayList2.add(x1Var);
                                y1Var.a(x1Var.f13081b);
                            }
                            y1Var.l();
                            NotificationCenter.getInstance(y1Var.f13093a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 1:
                            y1 y1Var2 = this.f13074b;
                            ArrayList arrayList4 = y1Var2.f13094b;
                            int i14 = y1Var2.f13093a;
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            x1 c10 = y1Var2.c(tL_quickReply2.shortcut_id);
                            if (c10 != null) {
                                c10.f13081b = tL_quickReply2.shortcut;
                                c10.f13083f = tL_quickReply2.count;
                                c10.d = tL_quickReply2.top_message;
                                MessageObject messageObject2 = c10.e;
                                if (messageObject2 != null && messageObject2.getId() != tL_quickReply2.top_message) {
                                    c10.e = null;
                                    long clientUserId = UserConfig.getInstance(i14).getClientUserId();
                                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i14);
                                    messagesStorage.getStorageQueue().postRunnable(new c3(y1Var2, messagesStorage, c10, clientUserId, 14));
                                    return;
                                }
                            } else {
                                x1 x1Var2 = new x1();
                                x1Var2.f13080a = tL_quickReply2.shortcut_id;
                                x1Var2.f13081b = tL_quickReply2.shortcut;
                                x1Var2.f13083f = tL_quickReply2.count;
                                x1Var2.d = tL_quickReply2.top_message;
                                for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                                    ((x1) arrayList4.get(i15)).f13082c = i15;
                                }
                                arrayList4.add(x1Var2);
                                y1Var2.a(x1Var2.f13081b);
                            }
                            y1Var2.l();
                            NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 2:
                            y1 y1Var3 = this.f13074b;
                            int i16 = y1Var3.f13093a;
                            x1 c11 = y1Var3.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c11 != null) {
                                y1Var3.f13094b.remove(c11);
                                y1Var3.a(c11.f13081b);
                                int i17 = c11.f13080a;
                                MessagesStorage messagesStorage2 = MessagesStorage.getInstance(i16);
                                messagesStorage2.getStorageQueue().postRunnable(new ah.g(messagesStorage2, i17, 12));
                                y1Var3.l();
                                NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                return;
                            }
                            return;
                        default:
                            y1 y1Var4 = this.f13074b;
                            int i18 = y1Var4.f13093a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            x1 c12 = y1Var4.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c12 != null) {
                                int size = c12.f13083f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c12.f13083f = size;
                                if (size <= 0) {
                                    y1Var4.f13094b.remove(c12);
                                }
                                ArrayList<Integer> arrayList5 = tL_updateDeleteQuickReplyMessages.messages;
                                MessageObject messageObject3 = c12.e;
                                if (messageObject3 != null) {
                                    i11 = messageObject3.getId();
                                } else {
                                    i11 = c12.d;
                                }
                                if (!arrayList5.contains(Integer.valueOf(i11)) && c12.e != null) {
                                    y1Var4.l();
                                    NotificationCenter.getInstance(i18).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                    return;
                                }
                                c12.e = null;
                                long clientUserId2 = UserConfig.getInstance(i18).getClientUserId();
                                MessagesStorage messagesStorage3 = MessagesStorage.getInstance(i18);
                                messagesStorage3.getStorageQueue().postRunnable(new c3(y1Var4, messagesStorage3, c12, clientUserId2, 14));
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
        x1 c10 = c(i10);
        if (c10 == null) {
            return;
        }
        c10.f13081b = str;
        TLRPC.TL_messages_editQuickReplyShortcut tL_messages_editQuickReplyShortcut = new TLRPC.TL_messages_editQuickReplyShortcut();
        tL_messages_editQuickReplyShortcut.shortcut_id = i10;
        tL_messages_editQuickReplyShortcut.shortcut = str;
        int i11 = this.f13093a;
        ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editQuickReplyShortcut, new e6(7));
        l();
        NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
    }

    public final void l() {
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.f13093a);
        messagesStorage.getStorageQueue().postRunnable(new hi.t(8, this, messagesStorage));
    }
}
