package org.telegram.messenger;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.TextureView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Pattern;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.d21;
import org.telegram.ui.Components.g30;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.a01;
import org.telegram.ui.ff0;
import org.telegram.ui.fy;
import org.telegram.ui.gy;
import org.telegram.ui.ia0;
import org.telegram.ui.ja0;
import org.telegram.ui.lq;
import org.telegram.ui.q00;
import org.telegram.ui.rn;
import org.telegram.ui.s50;

public final class pg implements Runnable {

    public final int f21277a;

    public final Object f21278b;

    public final Object f21279c;
    public final long d;

    public final Object f21280e;

    public pg(Object obj, long j10, Object obj2, Object obj3, int i10) {
        this.f21277a = i10;
        this.f21278b = obj;
        this.d = j10;
        this.f21279c = obj2;
        this.f21280e = obj3;
    }

    @Override
    public final void run() throws Throwable {
        int i10;
        SQLiteCursor sQLiteCursor;
        ArrayList arrayList;
        Runnable runnable;
        SQLiteDatabase sQLiteDatabase;
        SQLiteCursor sQLiteCursor2;
        MessageObject messageObject;
        NativeByteBuffer nativeByteBufferByteBufferValue;
        int i11 = this.f21277a;
        String str = "SELECT data, send_state, mid, date, topic_id, ttl FROM quick_replies_messages WHERE topic_id = ? ORDER BY mid ASC";
        int i12 = 0;
        long j10 = this.d;
        Object obj = this.f21280e;
        Object obj2 = this.f21278b;
        Object obj3 = this.f21279c;
        switch (i11) {
            case 0:
                ((MessagesStorage) obj2).lambda$getEncryptedChat$177(j10, (ArrayList) obj3, (CountDownLatch) obj);
                return;
            case 1:
                ((SavedMessagesController) obj).lambda$updateDialogsLastMessage$9((MessagesStorage) obj2, (ArrayList) obj3, j10);
                return;
            case 2:
                ((SavedMessagesController) obj3).lambda$loadCache$7((MessagesStorage) obj2, j10, (Runnable) obj);
                return;
            case 3:
                ((CameraController) obj2).lambda$finishRecordingVideo$15((File) obj3, (Bitmap) obj, j10);
                return;
            case 4:
                org.telegram.ui.Components.gi giVar = (org.telegram.ui.Components.gi) obj2;
                rn rnVar = (rn) obj3;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) obj;
                Context context = giVar.getContext();
                int i13 = giVar.F1;
                MessageSuggestionParams messageSuggestionParamsEmpty = rnVar.f42006c5;
                if (messageSuggestionParamsEmpty == null) {
                    messageSuggestionParamsEmpty = MessageSuggestionParams.empty();
                }
                new hh.t0(context, i13, this.d, messageSuggestionParamsEmpty, rnVar, c6Var, 0, new org.telegram.ui.df(giVar, rnVar)).show();
                return;
            case 5:
                d21 d21Var = (d21) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                ((b70) obj3).u();
                TLRPC.User user = MessagesController.getInstance(d21Var.f27625b).getUser(Long.valueOf(j10));
                if (user != null) {
                    rn rnVar2 = d21Var.h;
                    org.telegram.ui.Components.y4.r(rnVar2, -1, user, chat, true, new d3.e(d21Var, j10, 6), rnVar2.getResourceProvider());
                    return;
                }
                return;
            case 6:
                d21 d21Var2 = (d21) obj2;
                ArrayList arrayList2 = (ArrayList) obj3;
                d21Var2.f27624a0.removeAll((HashSet) obj);
                d21Var2.p();
                int size = arrayList2.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj4 = arrayList2.get(i14);
                    i14++;
                    long jIntValue = ((Integer) obj4).intValue();
                    if (j10 == jIntValue) {
                        d21Var2.m(jIntValue, false);
                        return;
                    }
                }
                return;
            case 7:
                gy gyVar = (gy) obj2;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj3;
                TLRPC.Dialog dialog = (TLRPC.Dialog) obj;
                int iMin = Integer.MAX_VALUE;
                if (dialogFilter == null || !gyVar.g4(dialog)) {
                    i10 = Integer.MAX_VALUE;
                } else {
                    int size2 = dialogFilter.pinnedDialogs.size();
                    for (int i15 = 0; i15 < size2; i15++) {
                        iMin = Math.min(iMin, dialogFilter.pinnedDialogs.valueAt(i15));
                    }
                    i10 = iMin - gyVar.J2;
                }
                long j11 = this.d;
                TLRPC.EncryptedChat encryptedChatN = DialogObject.isEncryptedDialog(j11) ? y1.n(gyVar.getMessagesController(), j11) : null;
                UndoView undoViewY3 = gyVar.Y3();
                if (undoViewY3 == null) {
                    return;
                }
                if (gyVar.g4(dialog)) {
                    gyVar.s4(j11, false, dialogFilter, i10, true);
                    undoViewY3.k(0L, 79, 1, 1600, null, null);
                } else {
                    gyVar.s4(j11, true, dialogFilter, i10, true);
                    undoViewY3.k(0L, 78, 1, 1600, null, null);
                    if (dialogFilter != null) {
                        if (encryptedChatN != null) {
                            if (!dialogFilter.alwaysShow.contains(Long.valueOf(encryptedChatN.user_id))) {
                                dialogFilter.alwaysShow.add(Long.valueOf(encryptedChatN.user_id));
                            }
                        } else if (!dialogFilter.alwaysShow.contains(Long.valueOf(j11))) {
                            dialogFilter.alwaysShow.add(Long.valueOf(j11));
                        }
                    }
                }
                if (dialogFilter != null) {
                    q00.t0(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, false, false, true, true, false, gyVar, null);
                }
                gyVar.getMessagesController().reorderPinnedDialogs(gyVar.R2, null, 0L);
                gyVar.T4(true);
                if (gyVar.f38498a0 != null) {
                    int i16 = 0;
                    while (true) {
                        fy[] fyVarArr = gyVar.f38498a0;
                        if (i16 < fyVarArr.length) {
                            fyVarArr[i16].d.D = false;
                            i16++;
                        }
                    }
                }
                gyVar.g5(MessagesController.UPDATE_MASK_REORDER | MessagesController.UPDATE_MASK_CHECK, true);
                return;
            case 8:
                s50 s50Var = (s50) obj2;
                org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) obj3;
                TLRPC.User user2 = (TLRPC.User) obj;
                ChatObject.Call call = s50Var.W0;
                if (call == null || s50Var.f42467o0) {
                    return;
                }
                call.addInvitedUser(j10);
                s50Var.O0(true);
                g30 g30Var = s50Var.A1;
                if (g30Var != null) {
                    g30Var.dismiss();
                }
                try {
                    b2VarArr[0].dismiss();
                    break;
                } catch (Throwable unused) {
                }
                b2VarArr[0] = null;
                s50Var.k1().k(0L, 34, user2, s50Var.V0, null, null);
                return;
            case 9:
                TLObject tLObject = (TLObject) obj2;
                MessagesController messagesController = (MessagesController) obj3;
                lq lqVar = (lq) obj;
                Pattern pattern = LaunchActivity.f35496x1;
                if (!(tLObject instanceof TL_stories.TL_stories_peerStories)) {
                    lqVar.run();
                    return;
                }
                TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject;
                messagesController.putUsers(tL_stories_peerStories.users, false);
                messagesController.getStoriesController().a0(j10, tL_stories_peerStories.stories);
                lqVar.run();
                return;
            case 10:
                ja0 ja0Var = (ja0) obj2;
                LaunchActivity launchActivity = ja0Var.f39320g;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                if (((String) obj3) != null) {
                    AccountInstance accountInstance = AccountInstance.getInstance(launchActivity.K);
                    MessagesController messagesController2 = accountInstance.getMessagesController();
                    long j12 = this.d;
                    long j13 = -j12;
                    ChatObject.Call groupCall = messagesController2.getGroupCall(j13, false);
                    if (groupCall != null) {
                        TLRPC.Chat chat2 = accountInstance.getMessagesController().getChat(Long.valueOf(j13));
                        accountInstance.getMessagesController().getInputPeer(j12);
                        org.telegram.ui.Components.voip.e2.m(chat2, null, false, Boolean.valueOf(!groupCall.call.rtmp_stream), launchActivity, n2Var, accountInstance);
                        return;
                    }
                    TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(j13);
                    if (chatFull != null) {
                        if (chatFull.call != null) {
                            accountInstance.getMessagesController().getGroupCall(j13, true, new ia0(ja0Var, accountInstance, j12, n2Var, 0));
                            return;
                        } else {
                            if (n2Var.getParentActivity() != null) {
                                y1.q(R.string.InviteExpired, org.telegram.ui.Components.mc.a0(n2Var), R.raw.linkbroken, 36);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            case 11:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                String str2 = (String) obj3;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                Drawable[] drawableArr = PhotoViewer.P8;
                long j14 = this.d;
                gh.b1 b1Var = new gh.b1(photoViewer, str2, photoEntry, j14, 5);
                if (photoViewer.f35812z2) {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(photoViewer.f35803y2.getWidth(), photoViewer.f35803y2.getHeight(), Bitmap.Config.ARGB_8888);
                    AndroidUtilities.getBitmapFromSurface(photoViewer.f35803y2, bitmapCreateBitmap, new ff0(24, b1Var, bitmapCreateBitmap));
                    return;
                }
                TextureView textureView = photoViewer.f35794x2;
                Bitmap bitmap = textureView.getBitmap(textureView.getWidth(), photoViewer.f35794x2.getHeight());
                if (bitmap == null) {
                    b1Var.run(SendMessagesHelper.createVideoThumbnailAtTime(photoEntry.path, j14, null, true));
                    return;
                } else {
                    b1Var.run(bitmap);
                    return;
                }
            case 12:
                qf.q1 q1Var = (qf.q1) obj3;
                MessagesStorage messagesStorage = (MessagesStorage) obj2;
                Runnable runnable2 = (Runnable) obj;
                ArrayList arrayList3 = new ArrayList();
                ArrayList<TLRPC.User> arrayList4 = new ArrayList<>();
                ArrayList<TLRPC.Chat> arrayList5 = new ArrayList<>();
                try {
                    SQLiteDatabase database = messagesStorage.getDatabase();
                    SQLiteCursor sQLiteCursorQueryFinalized = database.queryFinalized("SELECT topic_id, name, order_value, count FROM business_replies ORDER BY order_value ASC", new Object[0]);
                    while (sQLiteCursorQueryFinalized.next()) {
                        try {
                            try {
                                try {
                                    qf.p1 p1Var = new qf.p1();
                                    p1Var.f46418a = sQLiteCursorQueryFinalized.intValue(i12);
                                    p1Var.f46419b = sQLiteCursorQueryFinalized.stringValue(1);
                                    p1Var.f46420c = sQLiteCursorQueryFinalized.intValue(2);
                                    p1Var.f46422f = sQLiteCursorQueryFinalized.intValue(3);
                                    arrayList3.add(p1Var);
                                    i12 = 0;
                                } catch (Exception e9) {
                                    e = e9;
                                    q1Var = q1Var;
                                    arrayList = arrayList3;
                                    sQLiteCursor = sQLiteCursorQueryFinalized;
                                    runnable = runnable2;
                                    try {
                                        FileLog.e(e);
                                        if (sQLiteCursor != null) {
                                            sQLiteCursor.dispose();
                                        }
                                        AndroidUtilities.runOnUIThread(new a01(q1Var, arrayList4, arrayList5, arrayList, runnable));
                                        return;
                                    } catch (Throwable th) {
                                        th = th;
                                        if (sQLiteCursor != null) {
                                            sQLiteCursor.dispose();
                                        }
                                        throw th;
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                sQLiteCursor = sQLiteCursorQueryFinalized;
                            }
                        } catch (Exception e10) {
                            e = e10;
                            q1Var = q1Var;
                            arrayList = arrayList3;
                            runnable = runnable2;
                            sQLiteCursor = sQLiteCursorQueryFinalized;
                        }
                    }
                    char c10 = 0;
                    sQLiteCursorQueryFinalized.dispose();
                    ArrayList<Long> arrayList6 = new ArrayList<>();
                    ArrayList arrayList7 = new ArrayList();
                    SQLiteCursor sQLiteCursor3 = sQLiteCursorQueryFinalized;
                    int i17 = 0;
                    while (i17 < arrayList3.size()) {
                        try {
                            try {
                                qf.p1 p1Var2 = (qf.p1) arrayList3.get(i17);
                                arrayList = arrayList3;
                                try {
                                    int i18 = i17;
                                    try {
                                        Object[] objArr = new Object[1];
                                        objArr[c10] = Integer.valueOf(p1Var2.f46418a);
                                        SQLiteCursor sQLiteCursorQueryFinalized2 = database.queryFinalized(str, objArr);
                                        try {
                                            try {
                                                if (sQLiteCursorQueryFinalized2.next()) {
                                                    sQLiteDatabase = database;
                                                    NativeByteBuffer nativeByteBufferByteBufferValue2 = sQLiteCursorQueryFinalized2.byteBufferValue(0);
                                                    if (nativeByteBufferByteBufferValue2 != null) {
                                                        TLRPC.Message messageTLdeserialize = TLRPC.Message.TLdeserialize(nativeByteBufferByteBufferValue2, nativeByteBufferByteBufferValue2.readInt32(false), false);
                                                        runnable = runnable2;
                                                        try {
                                                            messageTLdeserialize.send_state = sQLiteCursorQueryFinalized2.intValue(1);
                                                            messageTLdeserialize.readAttachPath(nativeByteBufferByteBufferValue2, j10);
                                                            nativeByteBufferByteBufferValue2.reuse();
                                                            messageTLdeserialize.f22401id = sQLiteCursorQueryFinalized2.intValue(2);
                                                            messageTLdeserialize.date = sQLiteCursorQueryFinalized2.intValue(3);
                                                            messageTLdeserialize.flags |= 1073741824;
                                                            messageTLdeserialize.quick_reply_shortcut_id = sQLiteCursorQueryFinalized2.intValue(4);
                                                            messageTLdeserialize.ttl = sQLiteCursorQueryFinalized2.intValue(5);
                                                            MessagesStorage.addUsersAndChatsFromMessage(messageTLdeserialize, arrayList6, arrayList7, null);
                                                            q1Var = q1Var;
                                                            try {
                                                                MessageObject messageObject2 = new MessageObject(q1Var.f46433a, messageTLdeserialize, false, true);
                                                                p1Var2.f46421e = messageObject2;
                                                                p1Var2.d = messageTLdeserialize.f22401id;
                                                                messageObject2.generateThumbs(false);
                                                                p1Var2.f46421e.applyQuickReply(p1Var2.f46419b, p1Var2.f46418a);
                                                            } catch (Exception e11) {
                                                                e = e11;
                                                                sQLiteCursor = sQLiteCursorQueryFinalized2;
                                                                FileLog.e(e);
                                                                if (sQLiteCursor != null) {
                                                                    sQLiteCursor.dispose();
                                                                }
                                                                AndroidUtilities.runOnUIThread(new a01(q1Var, arrayList4, arrayList5, arrayList, runnable));
                                                                return;
                                                            }
                                                        } catch (Exception e12) {
                                                            e = e12;
                                                            q1Var = q1Var;
                                                        }
                                                    }
                                                    sQLiteCursorQueryFinalized2.dispose();
                                                    i17 = i18 + 1;
                                                    sQLiteCursor3 = sQLiteCursorQueryFinalized2;
                                                    arrayList3 = arrayList;
                                                    database = sQLiteDatabase;
                                                    str = str;
                                                    runnable2 = runnable;
                                                    q1Var = q1Var;
                                                    c10 = 0;
                                                } else {
                                                    sQLiteDatabase = database;
                                                }
                                                q1Var = q1Var;
                                                runnable = runnable2;
                                                sQLiteCursorQueryFinalized2.dispose();
                                                i17 = i18 + 1;
                                                sQLiteCursor3 = sQLiteCursorQueryFinalized2;
                                                arrayList3 = arrayList;
                                                database = sQLiteDatabase;
                                                str = str;
                                                runnable2 = runnable;
                                                q1Var = q1Var;
                                                c10 = 0;
                                            } catch (Exception e13) {
                                                e = e13;
                                                q1Var = q1Var;
                                                runnable = runnable2;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            sQLiteCursor = sQLiteCursorQueryFinalized2;
                                            if (sQLiteCursor != null) {
                                                sQLiteCursor.dispose();
                                            }
                                            throw th;
                                        }
                                    } catch (Exception e14) {
                                        e = e14;
                                        runnable = runnable2;
                                        sQLiteCursor = sQLiteCursor3;
                                        FileLog.e(e);
                                        if (sQLiteCursor != null) {
                                            sQLiteCursor.dispose();
                                        }
                                        AndroidUtilities.runOnUIThread(new a01(q1Var, arrayList4, arrayList5, arrayList, runnable));
                                        return;
                                    }
                                } catch (Exception e15) {
                                    e = e15;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                sQLiteCursor = sQLiteCursor3;
                            }
                        } catch (Exception e16) {
                            e = e16;
                            arrayList = arrayList3;
                        }
                        break;
                    }
                    q1Var = q1Var;
                    arrayList = arrayList3;
                    runnable = runnable2;
                    try {
                        if (!arrayList7.isEmpty()) {
                            messagesStorage.getChatsInternal(TextUtils.join(",", arrayList7), arrayList5);
                        }
                        if (!arrayList6.isEmpty()) {
                            messagesStorage.getUsersInternal(arrayList6, arrayList4);
                        }
                        sQLiteCursor3.dispose();
                    } catch (Exception e17) {
                        e = e17;
                        sQLiteCursor = sQLiteCursor3;
                        FileLog.e(e);
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                    }
                    break;
                } catch (Exception e18) {
                    e = e18;
                    q1Var = q1Var;
                    arrayList = arrayList3;
                    runnable = runnable2;
                    sQLiteCursor = null;
                } catch (Throwable th5) {
                    th = th5;
                    sQLiteCursor = null;
                }
                AndroidUtilities.runOnUIThread(new a01(q1Var, arrayList4, arrayList5, arrayList, runnable));
                return;
            default:
                qf.q1 q1Var2 = (qf.q1) obj3;
                MessagesStorage messagesStorage2 = (MessagesStorage) obj2;
                qf.p1 p1Var3 = (qf.p1) obj;
                try {
                    ArrayList<Long> arrayList8 = new ArrayList<>();
                    ArrayList arrayList9 = new ArrayList();
                    SQLiteCursor sQLiteCursorQueryFinalized3 = messagesStorage2.getDatabase().queryFinalized("SELECT data, send_state, mid, date, topic_id, ttl FROM quick_replies_messages WHERE topic_id = ? ORDER BY mid ASC", Integer.valueOf(p1Var3.f46418a));
                    try {
                        if (!sQLiteCursorQueryFinalized3.next() || (nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized3.byteBufferValue(0)) == null) {
                            messageObject = null;
                        } else {
                            TLRPC.Message messageTLdeserialize2 = TLRPC.Message.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false);
                            messageTLdeserialize2.send_state = sQLiteCursorQueryFinalized3.intValue(1);
                            messageTLdeserialize2.readAttachPath(nativeByteBufferByteBufferValue, j10);
                            nativeByteBufferByteBufferValue.reuse();
                            messageTLdeserialize2.f22401id = sQLiteCursorQueryFinalized3.intValue(2);
                            messageTLdeserialize2.date = sQLiteCursorQueryFinalized3.intValue(3);
                            messageTLdeserialize2.flags |= 1073741824;
                            messageTLdeserialize2.quick_reply_shortcut_id = sQLiteCursorQueryFinalized3.intValue(4);
                            messageTLdeserialize2.ttl = sQLiteCursorQueryFinalized3.intValue(5);
                            MessagesStorage.addUsersAndChatsFromMessage(messageTLdeserialize2, arrayList8, arrayList9, null);
                            messageObject = new MessageObject(q1Var2.f46433a, messageTLdeserialize2, false, true);
                        }
                        sQLiteCursorQueryFinalized3.dispose();
                        ArrayList<TLRPC.User> arrayList10 = new ArrayList<>();
                        ArrayList<TLRPC.Chat> arrayList11 = new ArrayList<>();
                        if (!arrayList9.isEmpty()) {
                            messagesStorage2.getChatsInternal(TextUtils.join(",", arrayList9), arrayList11);
                        }
                        if (!arrayList8.isEmpty()) {
                            messagesStorage2.getUsersInternal(arrayList8, arrayList10);
                        }
                        AndroidUtilities.runOnUIThread(new a01(q1Var2, arrayList10, arrayList11, p1Var3, messageObject));
                        sQLiteCursorQueryFinalized3.dispose();
                        return;
                    } catch (Exception e19) {
                        e = e19;
                        sQLiteCursor2 = sQLiteCursorQueryFinalized3;
                        try {
                            FileLog.e(e);
                            if (sQLiteCursor2 != null) {
                                sQLiteCursor2.dispose();
                                return;
                            }
                            return;
                        } catch (Throwable th6) {
                            th = th6;
                            if (sQLiteCursor2 != null) {
                                sQLiteCursor2.dispose();
                            }
                            throw th;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        sQLiteCursor2 = sQLiteCursorQueryFinalized3;
                        if (sQLiteCursor2 != null) {
                            sQLiteCursor2.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e20) {
                    e = e20;
                    sQLiteCursor2 = null;
                } catch (Throwable th8) {
                    th = th8;
                    sQLiteCursor2 = null;
                }
                break;
        }
    }

    public pg(Object obj, Object obj2, long j10, Object obj3, int i10) {
        this.f21277a = i10;
        this.f21278b = obj;
        this.f21279c = obj2;
        this.d = j10;
        this.f21280e = obj3;
    }

    public pg(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.f21277a = i10;
        this.f21278b = obj;
        this.f21279c = obj2;
        this.f21280e = obj3;
        this.d = j10;
    }

    public pg(Object obj, MessagesStorage messagesStorage, long j10, Runnable runnable, int i10) {
        this.f21277a = i10;
        this.f21279c = obj;
        this.f21278b = messagesStorage;
        this.d = j10;
        this.f21280e = runnable;
    }

    public pg(SavedMessagesController savedMessagesController, MessagesStorage messagesStorage, ArrayList arrayList, long j10) {
        this.f21277a = 1;
        this.f21280e = savedMessagesController;
        this.f21278b = messagesStorage;
        this.f21279c = arrayList;
        this.d = j10;
    }

    public pg(d21 d21Var, HashSet hashSet, ArrayList arrayList, long j10) {
        this.f21277a = 6;
        this.f21278b = d21Var;
        this.f21280e = hashSet;
        this.f21279c = arrayList;
        this.d = j10;
    }

    public pg(qf.q1 q1Var, MessagesStorage messagesStorage, qf.p1 p1Var, long j10) {
        this.f21277a = 13;
        this.f21279c = q1Var;
        this.f21278b = messagesStorage;
        this.f21280e = p1Var;
        this.d = j10;
    }
}
