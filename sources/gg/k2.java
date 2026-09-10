package gg;

import android.text.TextUtils;
import bi.ua;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
public final class k2 {
    public static volatile k2[] f8936g = new k2[4];
    public static final Object[] h = new Object[4];
    public final int f8937a;
    public final ArrayList f8938b = new ArrayList();
    public final ArrayList f8939c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public boolean e;
    public boolean f8940f;

    static {
        for (int i10 = 0; i10 < 4; i10++) {
            h[i10] = new Object();
        }
    }

    public k2(int i10) {
        this.f8937a = i10;
    }

    public static k2 f(int i10) {
        k2 k2Var;
        k2 k2Var2 = f8936g[i10];
        if (k2Var2 == null) {
            synchronized (h[i10]) {
                try {
                    k2Var = f8936g[i10];
                    if (k2Var == null) {
                        k2[] k2VarArr = f8936g;
                        k2 k2Var3 = new k2(i10);
                        k2VarArr[i10] = k2Var3;
                        k2Var = k2Var3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return k2Var;
        }
        return k2Var2;
    }

    public static boolean g(String str) {
        if (!"hello".equalsIgnoreCase(str) && !"away".equalsIgnoreCase(str)) {
            return false;
        }
        return true;
    }

    public final void a(String str) {
        j2 j2Var;
        ArrayList arrayList = this.f8939c;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                j2Var = (j2) obj;
                if (TextUtils.equals(str, j2Var.f8918b)) {
                    break;
                }
            } else {
                j2Var = null;
                break;
            }
        }
        if (j2Var != null) {
            arrayList.remove(j2Var);
            NotificationCenter.getInstance(this.f8937a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
        }
    }

    public final void b(Runnable runnable) {
        if (this.f8940f) {
            runnable.run();
        } else {
            i(runnable, true);
        }
    }

    public final j2 c(long j3) {
        ArrayList arrayList = this.f8938b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            j2 j2Var = (j2) obj;
            if (j2Var.f8917a == j3) {
                return j2Var;
            }
        }
        return null;
    }

    public final j2 d(String str) {
        ArrayList arrayList = this.f8938b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            j2 j2Var = (j2) obj;
            if (TextUtils.equals(str, j2Var.f8918b)) {
                return j2Var;
            }
        }
        return null;
    }

    public final ArrayList e() {
        ArrayList arrayList = this.d;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f8938b;
            if (i10 < arrayList2.size()) {
                if (!g(((j2) arrayList2.get(i10)).f8918b)) {
                    arrayList.add((j2) arrayList2.get(i10));
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
        throw new UnsupportedOperationException("Method not decompiled: gg.k2.i(java.lang.Runnable, boolean):void");
    }

    public final boolean j(final TLRPC.Update update, String str, int i10) {
        if (update instanceof TL_update.TL_updateQuickReplyMessage) {
            b(new di.q(this, ((TL_update.TL_updateQuickReplyMessage) update).message, str, i10, 4));
            return true;
        } else if (update instanceof TL_update.TL_updateQuickReplies) {
            b(new Runnable(this) {
                public final k2 f8910b;

                {
                    this.f8910b = this;
                }

                @Override
                public final void run() {
                    j2 j2Var;
                    int i11;
                    switch (r3) {
                        case 0:
                            ArrayList<TLRPC.TL_quickReply> arrayList = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            k2 k2Var = this.f8910b;
                            ArrayList arrayList2 = k2Var.f8938b;
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            arrayList2.clear();
                            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList.get(i12);
                                int i13 = 0;
                                while (true) {
                                    if (i13 < arrayList3.size()) {
                                        if (((j2) arrayList3.get(i13)).f8917a == tL_quickReply.shortcut_id) {
                                            j2Var = (j2) arrayList3.get(i13);
                                        } else {
                                            i13++;
                                        }
                                    } else {
                                        j2Var = null;
                                    }
                                }
                                if (j2Var == null) {
                                    j2Var = new j2();
                                }
                                j2Var.f8917a = tL_quickReply.shortcut_id;
                                j2Var.f8918b = tL_quickReply.shortcut;
                                j2Var.f8920f = tL_quickReply.count;
                                j2Var.f8919c = i12;
                                j2Var.d = tL_quickReply.top_message;
                                MessageObject messageObject = j2Var.e;
                                if (messageObject != null && messageObject.getId() != tL_quickReply.top_message) {
                                    j2Var.e = null;
                                }
                                arrayList2.add(j2Var);
                                k2Var.a(j2Var.f8918b);
                            }
                            k2Var.l();
                            NotificationCenter.getInstance(k2Var.f8937a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 1:
                            k2 k2Var2 = this.f8910b;
                            ArrayList arrayList4 = k2Var2.f8938b;
                            int i14 = k2Var2.f8937a;
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            j2 c10 = k2Var2.c(tL_quickReply2.shortcut_id);
                            if (c10 != null) {
                                c10.f8918b = tL_quickReply2.shortcut;
                                c10.f8920f = tL_quickReply2.count;
                                c10.d = tL_quickReply2.top_message;
                                MessageObject messageObject2 = c10.e;
                                if (messageObject2 != null && messageObject2.getId() != tL_quickReply2.top_message) {
                                    c10.e = null;
                                    long clientUserId = UserConfig.getInstance(i14).getClientUserId();
                                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i14);
                                    messagesStorage.getStorageQueue().postRunnable(new ua((Object) k2Var2, messagesStorage, (Object) c10, clientUserId, 2));
                                    return;
                                }
                            } else {
                                j2 j2Var2 = new j2();
                                j2Var2.f8917a = tL_quickReply2.shortcut_id;
                                j2Var2.f8918b = tL_quickReply2.shortcut;
                                j2Var2.f8920f = tL_quickReply2.count;
                                j2Var2.d = tL_quickReply2.top_message;
                                for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                                    ((j2) arrayList4.get(i15)).f8919c = i15;
                                }
                                arrayList4.add(j2Var2);
                                k2Var2.a(j2Var2.f8918b);
                            }
                            k2Var2.l();
                            NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 2:
                            k2 k2Var3 = this.f8910b;
                            int i16 = k2Var3.f8937a;
                            j2 c11 = k2Var3.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c11 != null) {
                                k2Var3.f8938b.remove(c11);
                                k2Var3.a(c11.f8918b);
                                int i17 = c11.f8917a;
                                MessagesStorage messagesStorage2 = MessagesStorage.getInstance(i16);
                                messagesStorage2.getStorageQueue().postRunnable(new bi.s(messagesStorage2, i17, 7));
                                k2Var3.l();
                                NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                return;
                            }
                            return;
                        default:
                            k2 k2Var4 = this.f8910b;
                            int i18 = k2Var4.f8937a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            j2 c12 = k2Var4.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c12 != null) {
                                int size = c12.f8920f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c12.f8920f = size;
                                if (size <= 0) {
                                    k2Var4.f8938b.remove(c12);
                                }
                                ArrayList<Integer> arrayList5 = tL_updateDeleteQuickReplyMessages.messages;
                                MessageObject messageObject3 = c12.e;
                                if (messageObject3 != null) {
                                    i11 = messageObject3.getId();
                                } else {
                                    i11 = c12.d;
                                }
                                if (!arrayList5.contains(Integer.valueOf(i11)) && c12.e != null) {
                                    k2Var4.l();
                                    NotificationCenter.getInstance(i18).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                    return;
                                }
                                c12.e = null;
                                long clientUserId2 = UserConfig.getInstance(i18).getClientUserId();
                                MessagesStorage messagesStorage3 = MessagesStorage.getInstance(i18);
                                messagesStorage3.getStorageQueue().postRunnable(new ua((Object) k2Var4, messagesStorage3, (Object) c12, clientUserId2, 2));
                                return;
                            }
                            return;
                    }
                }
            });
            return true;
        } else if (update instanceof TL_update.TL_updateNewQuickReply) {
            b(new Runnable(this) {
                public final k2 f8910b;

                {
                    this.f8910b = this;
                }

                @Override
                public final void run() {
                    j2 j2Var;
                    int i11;
                    switch (r3) {
                        case 0:
                            ArrayList<TLRPC.TL_quickReply> arrayList = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            k2 k2Var = this.f8910b;
                            ArrayList arrayList2 = k2Var.f8938b;
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            arrayList2.clear();
                            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList.get(i12);
                                int i13 = 0;
                                while (true) {
                                    if (i13 < arrayList3.size()) {
                                        if (((j2) arrayList3.get(i13)).f8917a == tL_quickReply.shortcut_id) {
                                            j2Var = (j2) arrayList3.get(i13);
                                        } else {
                                            i13++;
                                        }
                                    } else {
                                        j2Var = null;
                                    }
                                }
                                if (j2Var == null) {
                                    j2Var = new j2();
                                }
                                j2Var.f8917a = tL_quickReply.shortcut_id;
                                j2Var.f8918b = tL_quickReply.shortcut;
                                j2Var.f8920f = tL_quickReply.count;
                                j2Var.f8919c = i12;
                                j2Var.d = tL_quickReply.top_message;
                                MessageObject messageObject = j2Var.e;
                                if (messageObject != null && messageObject.getId() != tL_quickReply.top_message) {
                                    j2Var.e = null;
                                }
                                arrayList2.add(j2Var);
                                k2Var.a(j2Var.f8918b);
                            }
                            k2Var.l();
                            NotificationCenter.getInstance(k2Var.f8937a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 1:
                            k2 k2Var2 = this.f8910b;
                            ArrayList arrayList4 = k2Var2.f8938b;
                            int i14 = k2Var2.f8937a;
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            j2 c10 = k2Var2.c(tL_quickReply2.shortcut_id);
                            if (c10 != null) {
                                c10.f8918b = tL_quickReply2.shortcut;
                                c10.f8920f = tL_quickReply2.count;
                                c10.d = tL_quickReply2.top_message;
                                MessageObject messageObject2 = c10.e;
                                if (messageObject2 != null && messageObject2.getId() != tL_quickReply2.top_message) {
                                    c10.e = null;
                                    long clientUserId = UserConfig.getInstance(i14).getClientUserId();
                                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i14);
                                    messagesStorage.getStorageQueue().postRunnable(new ua((Object) k2Var2, messagesStorage, (Object) c10, clientUserId, 2));
                                    return;
                                }
                            } else {
                                j2 j2Var2 = new j2();
                                j2Var2.f8917a = tL_quickReply2.shortcut_id;
                                j2Var2.f8918b = tL_quickReply2.shortcut;
                                j2Var2.f8920f = tL_quickReply2.count;
                                j2Var2.d = tL_quickReply2.top_message;
                                for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                                    ((j2) arrayList4.get(i15)).f8919c = i15;
                                }
                                arrayList4.add(j2Var2);
                                k2Var2.a(j2Var2.f8918b);
                            }
                            k2Var2.l();
                            NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 2:
                            k2 k2Var3 = this.f8910b;
                            int i16 = k2Var3.f8937a;
                            j2 c11 = k2Var3.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c11 != null) {
                                k2Var3.f8938b.remove(c11);
                                k2Var3.a(c11.f8918b);
                                int i17 = c11.f8917a;
                                MessagesStorage messagesStorage2 = MessagesStorage.getInstance(i16);
                                messagesStorage2.getStorageQueue().postRunnable(new bi.s(messagesStorage2, i17, 7));
                                k2Var3.l();
                                NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                return;
                            }
                            return;
                        default:
                            k2 k2Var4 = this.f8910b;
                            int i18 = k2Var4.f8937a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            j2 c12 = k2Var4.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c12 != null) {
                                int size = c12.f8920f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c12.f8920f = size;
                                if (size <= 0) {
                                    k2Var4.f8938b.remove(c12);
                                }
                                ArrayList<Integer> arrayList5 = tL_updateDeleteQuickReplyMessages.messages;
                                MessageObject messageObject3 = c12.e;
                                if (messageObject3 != null) {
                                    i11 = messageObject3.getId();
                                } else {
                                    i11 = c12.d;
                                }
                                if (!arrayList5.contains(Integer.valueOf(i11)) && c12.e != null) {
                                    k2Var4.l();
                                    NotificationCenter.getInstance(i18).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                    return;
                                }
                                c12.e = null;
                                long clientUserId2 = UserConfig.getInstance(i18).getClientUserId();
                                MessagesStorage messagesStorage3 = MessagesStorage.getInstance(i18);
                                messagesStorage3.getStorageQueue().postRunnable(new ua((Object) k2Var4, messagesStorage3, (Object) c12, clientUserId2, 2));
                                return;
                            }
                            return;
                    }
                }
            });
            return true;
        } else if (update instanceof TL_update.TL_updateDeleteQuickReply) {
            b(new Runnable(this) {
                public final k2 f8910b;

                {
                    this.f8910b = this;
                }

                @Override
                public final void run() {
                    j2 j2Var;
                    int i11;
                    switch (r3) {
                        case 0:
                            ArrayList<TLRPC.TL_quickReply> arrayList = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            k2 k2Var = this.f8910b;
                            ArrayList arrayList2 = k2Var.f8938b;
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            arrayList2.clear();
                            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList.get(i12);
                                int i13 = 0;
                                while (true) {
                                    if (i13 < arrayList3.size()) {
                                        if (((j2) arrayList3.get(i13)).f8917a == tL_quickReply.shortcut_id) {
                                            j2Var = (j2) arrayList3.get(i13);
                                        } else {
                                            i13++;
                                        }
                                    } else {
                                        j2Var = null;
                                    }
                                }
                                if (j2Var == null) {
                                    j2Var = new j2();
                                }
                                j2Var.f8917a = tL_quickReply.shortcut_id;
                                j2Var.f8918b = tL_quickReply.shortcut;
                                j2Var.f8920f = tL_quickReply.count;
                                j2Var.f8919c = i12;
                                j2Var.d = tL_quickReply.top_message;
                                MessageObject messageObject = j2Var.e;
                                if (messageObject != null && messageObject.getId() != tL_quickReply.top_message) {
                                    j2Var.e = null;
                                }
                                arrayList2.add(j2Var);
                                k2Var.a(j2Var.f8918b);
                            }
                            k2Var.l();
                            NotificationCenter.getInstance(k2Var.f8937a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 1:
                            k2 k2Var2 = this.f8910b;
                            ArrayList arrayList4 = k2Var2.f8938b;
                            int i14 = k2Var2.f8937a;
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            j2 c10 = k2Var2.c(tL_quickReply2.shortcut_id);
                            if (c10 != null) {
                                c10.f8918b = tL_quickReply2.shortcut;
                                c10.f8920f = tL_quickReply2.count;
                                c10.d = tL_quickReply2.top_message;
                                MessageObject messageObject2 = c10.e;
                                if (messageObject2 != null && messageObject2.getId() != tL_quickReply2.top_message) {
                                    c10.e = null;
                                    long clientUserId = UserConfig.getInstance(i14).getClientUserId();
                                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i14);
                                    messagesStorage.getStorageQueue().postRunnable(new ua((Object) k2Var2, messagesStorage, (Object) c10, clientUserId, 2));
                                    return;
                                }
                            } else {
                                j2 j2Var2 = new j2();
                                j2Var2.f8917a = tL_quickReply2.shortcut_id;
                                j2Var2.f8918b = tL_quickReply2.shortcut;
                                j2Var2.f8920f = tL_quickReply2.count;
                                j2Var2.d = tL_quickReply2.top_message;
                                for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                                    ((j2) arrayList4.get(i15)).f8919c = i15;
                                }
                                arrayList4.add(j2Var2);
                                k2Var2.a(j2Var2.f8918b);
                            }
                            k2Var2.l();
                            NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 2:
                            k2 k2Var3 = this.f8910b;
                            int i16 = k2Var3.f8937a;
                            j2 c11 = k2Var3.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c11 != null) {
                                k2Var3.f8938b.remove(c11);
                                k2Var3.a(c11.f8918b);
                                int i17 = c11.f8917a;
                                MessagesStorage messagesStorage2 = MessagesStorage.getInstance(i16);
                                messagesStorage2.getStorageQueue().postRunnable(new bi.s(messagesStorage2, i17, 7));
                                k2Var3.l();
                                NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                return;
                            }
                            return;
                        default:
                            k2 k2Var4 = this.f8910b;
                            int i18 = k2Var4.f8937a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            j2 c12 = k2Var4.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c12 != null) {
                                int size = c12.f8920f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c12.f8920f = size;
                                if (size <= 0) {
                                    k2Var4.f8938b.remove(c12);
                                }
                                ArrayList<Integer> arrayList5 = tL_updateDeleteQuickReplyMessages.messages;
                                MessageObject messageObject3 = c12.e;
                                if (messageObject3 != null) {
                                    i11 = messageObject3.getId();
                                } else {
                                    i11 = c12.d;
                                }
                                if (!arrayList5.contains(Integer.valueOf(i11)) && c12.e != null) {
                                    k2Var4.l();
                                    NotificationCenter.getInstance(i18).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                    return;
                                }
                                c12.e = null;
                                long clientUserId2 = UserConfig.getInstance(i18).getClientUserId();
                                MessagesStorage messagesStorage3 = MessagesStorage.getInstance(i18);
                                messagesStorage3.getStorageQueue().postRunnable(new ua((Object) k2Var4, messagesStorage3, (Object) c12, clientUserId2, 2));
                                return;
                            }
                            return;
                    }
                }
            });
            return true;
        } else if (update instanceof TL_update.TL_updateDeleteQuickReplyMessages) {
            b(new Runnable(this) {
                public final k2 f8910b;

                {
                    this.f8910b = this;
                }

                @Override
                public final void run() {
                    j2 j2Var;
                    int i11;
                    switch (r3) {
                        case 0:
                            ArrayList<TLRPC.TL_quickReply> arrayList = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            k2 k2Var = this.f8910b;
                            ArrayList arrayList2 = k2Var.f8938b;
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            arrayList2.clear();
                            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList.get(i12);
                                int i13 = 0;
                                while (true) {
                                    if (i13 < arrayList3.size()) {
                                        if (((j2) arrayList3.get(i13)).f8917a == tL_quickReply.shortcut_id) {
                                            j2Var = (j2) arrayList3.get(i13);
                                        } else {
                                            i13++;
                                        }
                                    } else {
                                        j2Var = null;
                                    }
                                }
                                if (j2Var == null) {
                                    j2Var = new j2();
                                }
                                j2Var.f8917a = tL_quickReply.shortcut_id;
                                j2Var.f8918b = tL_quickReply.shortcut;
                                j2Var.f8920f = tL_quickReply.count;
                                j2Var.f8919c = i12;
                                j2Var.d = tL_quickReply.top_message;
                                MessageObject messageObject = j2Var.e;
                                if (messageObject != null && messageObject.getId() != tL_quickReply.top_message) {
                                    j2Var.e = null;
                                }
                                arrayList2.add(j2Var);
                                k2Var.a(j2Var.f8918b);
                            }
                            k2Var.l();
                            NotificationCenter.getInstance(k2Var.f8937a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 1:
                            k2 k2Var2 = this.f8910b;
                            ArrayList arrayList4 = k2Var2.f8938b;
                            int i14 = k2Var2.f8937a;
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            j2 c10 = k2Var2.c(tL_quickReply2.shortcut_id);
                            if (c10 != null) {
                                c10.f8918b = tL_quickReply2.shortcut;
                                c10.f8920f = tL_quickReply2.count;
                                c10.d = tL_quickReply2.top_message;
                                MessageObject messageObject2 = c10.e;
                                if (messageObject2 != null && messageObject2.getId() != tL_quickReply2.top_message) {
                                    c10.e = null;
                                    long clientUserId = UserConfig.getInstance(i14).getClientUserId();
                                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i14);
                                    messagesStorage.getStorageQueue().postRunnable(new ua((Object) k2Var2, messagesStorage, (Object) c10, clientUserId, 2));
                                    return;
                                }
                            } else {
                                j2 j2Var2 = new j2();
                                j2Var2.f8917a = tL_quickReply2.shortcut_id;
                                j2Var2.f8918b = tL_quickReply2.shortcut;
                                j2Var2.f8920f = tL_quickReply2.count;
                                j2Var2.d = tL_quickReply2.top_message;
                                for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                                    ((j2) arrayList4.get(i15)).f8919c = i15;
                                }
                                arrayList4.add(j2Var2);
                                k2Var2.a(j2Var2.f8918b);
                            }
                            k2Var2.l();
                            NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            return;
                        case 2:
                            k2 k2Var3 = this.f8910b;
                            int i16 = k2Var3.f8937a;
                            j2 c11 = k2Var3.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c11 != null) {
                                k2Var3.f8938b.remove(c11);
                                k2Var3.a(c11.f8918b);
                                int i17 = c11.f8917a;
                                MessagesStorage messagesStorage2 = MessagesStorage.getInstance(i16);
                                messagesStorage2.getStorageQueue().postRunnable(new bi.s(messagesStorage2, i17, 7));
                                k2Var3.l();
                                NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                return;
                            }
                            return;
                        default:
                            k2 k2Var4 = this.f8910b;
                            int i18 = k2Var4.f8937a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            j2 c12 = k2Var4.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c12 != null) {
                                int size = c12.f8920f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c12.f8920f = size;
                                if (size <= 0) {
                                    k2Var4.f8938b.remove(c12);
                                }
                                ArrayList<Integer> arrayList5 = tL_updateDeleteQuickReplyMessages.messages;
                                MessageObject messageObject3 = c12.e;
                                if (messageObject3 != null) {
                                    i11 = messageObject3.getId();
                                } else {
                                    i11 = c12.d;
                                }
                                if (!arrayList5.contains(Integer.valueOf(i11)) && c12.e != null) {
                                    k2Var4.l();
                                    NotificationCenter.getInstance(i18).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                    return;
                                }
                                c12.e = null;
                                long clientUserId2 = UserConfig.getInstance(i18).getClientUserId();
                                MessagesStorage messagesStorage3 = MessagesStorage.getInstance(i18);
                                messagesStorage3.getStorageQueue().postRunnable(new ua((Object) k2Var4, messagesStorage3, (Object) c12, clientUserId2, 2));
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
        j2 c10 = c(i10);
        if (c10 == null) {
            return;
        }
        c10.f8918b = str;
        TLRPC.TL_messages_editQuickReplyShortcut tL_messages_editQuickReplyShortcut = new TLRPC.TL_messages_editQuickReplyShortcut();
        tL_messages_editQuickReplyShortcut.shortcut_id = i10;
        tL_messages_editQuickReplyShortcut.shortcut = str;
        int i11 = this.f8937a;
        ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editQuickReplyShortcut, new bi.g1(3));
        l();
        NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
    }

    public final void l() {
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.f8937a);
        messagesStorage.getStorageQueue().postRunnable(new fg.s1(7, this, messagesStorage));
    }
}
