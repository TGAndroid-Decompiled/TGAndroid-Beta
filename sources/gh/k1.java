package gh;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import hh.ea;
import hh.jb;
import hh.m7;
import hh.pa;
import hh.s7;
import hh.t7;
import hh.u7;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.k70;
import org.telegram.ui.Components.mc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.au0;
import org.telegram.ui.dq;
import org.telegram.ui.lr;
import org.telegram.ui.rn;
import org.telegram.ui.tq;
import org.telegram.ui.uq;
import org.telegram.ui.xr0;

public final class k1 implements Runnable {

    public final int f7375a;

    public final long f7376b;

    public final Object f7377c;
    public final Object d;

    public final Object f7378e;

    public final Object f7379f;

    public k1(hh.c0 c0Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, long j10, Utilities.Callback callback) {
        this.f7375a = 1;
        this.d = c0Var;
        this.f7378e = b2Var;
        this.f7379f = tLObject;
        this.f7376b = j10;
        this.f7377c = callback;
    }

    @Override
    public final void run() {
        String string;
        String str;
        TL_stars.StarGift starGift;
        TLRPC.Document document;
        String forcedFirstName;
        int i10 = 4;
        int i11 = 3;
        int i12 = 2;
        SQLitePreparedStatement sQLitePreparedStatementExecuteFast = null;
        int i13 = 1;
        int i14 = 0;
        switch (this.f7375a) {
            case 0:
                k2 k2Var = (k2) this.d;
                m7 m7Var = (m7) this.f7378e;
                long j10 = this.f7376b;
                Utilities.Callback callback = (Utilities.Callback) this.f7377c;
                Context context = (Context) this.f7379f;
                p1 p1Var = k2Var.f7388h0;
                int i15 = 0;
                while (i15 < i12) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (i15 == i13) {
                        string = LocaleController.getString(R.string.Gift2StarsCollectibleInfo);
                    } else {
                        int i16 = R.string.Gift2StarsInfo;
                        Object[] objArr = new Object[i13];
                        objArr[i14] = k2Var.f7381a0;
                        string = LocaleController.formatString(i16, objArr);
                    }
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(string));
                    String str2 = " ";
                    spannableStringBuilder.append((CharSequence) " ");
                    HashSet hashSet = new HashSet();
                    HashSet<TLRPC.Document> hashSet2 = new HashSet();
                    while (i14 < m7Var.f9753l.size() && hashSet.size() < i11) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) m7Var.f9753l.get(i14);
                        if (savedStarGift == null || (starGift = savedStarGift.gift) == null || (document = starGift.getDocument()) == null) {
                            str = str2;
                        } else {
                            str = str2;
                            if (!hashSet.contains(Long.valueOf(document.f22386id))) {
                                hashSet2.add(document);
                                hashSet.add(Long.valueOf(document.f22386id));
                            }
                        }
                        i14++;
                        str2 = str;
                        i11 = 3;
                    }
                    String str3 = str2;
                    if (hashSet2.size() > 0) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                        spannableStringBuilder2.append((CharSequence) LocaleController.formatString(R.string.Gift2StarsInfoProfileLink, DialogObject.getShortName(j10)).replaceAll(str3, " "));
                        spannableStringBuilder2.append((CharSequence) " ");
                        for (TLRPC.Document document2 : hashSet2) {
                            spannableStringBuilder2.append((CharSequence) "\u2060e");
                            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.t5(document2, p1Var.getPaint().getFontMetricsInt()), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
                        }
                        spannableStringBuilder2.append((CharSequence) " >");
                        spannableStringBuilder.append(AndroidUtilities.replaceArrows(AndroidUtilities.makeClickable(spannableStringBuilder2, new e5.u(k2Var, callback, j10, 1)), true));
                    } else {
                        spannableStringBuilder.append(AndroidUtilities.replaceArrows(AndroidUtilities.makeClickable(LocaleController.getString(R.string.Gift2StarsInfoLink), new e2.e(context, 3)), true));
                    }
                    TextView textView = i15 == 0 ? p1Var : k2Var.f7389i0;
                    textView.setText(spannableStringBuilder);
                    textView.setMaxWidth(lh.w3.a(textView.getText(), textView.getPaint()));
                    i15++;
                    i11 = 3;
                    i12 = 2;
                    i13 = 1;
                    i14 = 0;
                }
                return;
            case 1:
                hh.c0 c0Var = (hh.c0) this.d;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.f7378e;
                TLObject tLObject = (TLObject) this.f7379f;
                long j11 = this.f7376b;
                Utilities.Callback callback2 = (Utilities.Callback) this.f7377c;
                c0Var.getClass();
                b2Var.dismiss();
                if (tLObject instanceof TL_payments.connectedStarRefBots) {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
                    MessagesController.getInstance(c0Var.f9049a).putUsers(connectedstarrefbots.users, false);
                    while (i14 < connectedstarrefbots.connected_bots.size()) {
                        if (connectedstarrefbots.connected_bots.get(i14).bot_id == j11 && !connectedstarrefbots.connected_bots.get(i14).revoked) {
                            callback2.run(connectedstarrefbots.connected_bots.get(i14));
                            return;
                        }
                        i14++;
                    }
                }
                callback2.run(null);
                return;
            case 2:
                u7 u7Var = (u7) this.d;
                TLObject tLObject2 = (TLObject) this.f7378e;
                MessageObject messageObject = (MessageObject) this.f7377c;
                long j12 = this.f7376b;
                Runnable runnable = (Runnable) this.f7379f;
                int i17 = u7Var.f10151a;
                if (!(tLObject2 instanceof TLRPC.TL_messages_messages)) {
                    runnable.run();
                    return;
                }
                TLRPC.TL_messages_messages tL_messages_messages = (TLRPC.TL_messages_messages) tLObject2;
                MessagesController.getInstance(i17).putUsers(tL_messages_messages.users, false);
                MessagesController.getInstance(i17).putChats(tL_messages_messages.chats, false);
                if (tL_messages_messages.messages.size() != 1 || !(tL_messages_messages.messages.get(0) instanceof TLRPC.TL_message) || !(tL_messages_messages.messages.get(0).media instanceof TLRPC.TL_messageMediaPaidMedia)) {
                    runnable.run();
                    return;
                } else {
                    messageObject.messageOwner = tL_messages_messages.messages.get(0);
                    u7Var.l0(messageObject, j12, runnable, true);
                    return;
                }
            case 3:
                u7 u7Var2 = (u7) this.d;
                Utilities.Callback2 callback3 = (Utilities.Callback2) this.f7378e;
                long j13 = this.f7376b;
                TLObject tLObject3 = (TLObject) this.f7377c;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.f7379f;
                if (u7Var2.f10154e) {
                    u7Var2.g(j13, tLObject3, tL_textWithEntities, callback3);
                    return;
                } else {
                    u7.e("NO_BALANCE");
                    callback3.run(Boolean.FALSE, null);
                    return;
                }
            case 4:
                u7 u7Var3 = (u7) this.d;
                Utilities.Callback2 callback4 = (Utilities.Callback2) this.f7378e;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) this.f7377c;
                TL_stars.StarGift starGift2 = (TL_stars.StarGift) this.f7379f;
                long j14 = this.f7376b;
                if (u7Var3.f10154e) {
                    u7Var3.h(tL_payments_paymentFormStarGift, starGift2, j14, null, true, callback4);
                    return;
                } else {
                    u7.e("NO_BALANCE");
                    callback4.run(Boolean.FALSE, null);
                    return;
                }
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.d;
                TL_stars.StarGift starGift3 = (TL_stars.StarGift) this.f7378e;
                CharSequence charSequenceReplaceTags = (CharSequence) this.f7377c;
                long j15 = this.f7376b;
                String str4 = (String) this.f7379f;
                AndroidUtilities.runOnUIThread(new l2(profileActivity, i12), 200L);
                mc mcVarA0 = mc.a0(profileActivity);
                TLRPC.Document document3 = starGift3.sticker;
                String string2 = LocaleController.getString(R.string.StarsGiftCompleted);
                if (charSequenceReplaceTags == null) {
                    charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftCompletedChannelText", (int) j15, str4));
                }
                mcVarA0.s(document3, string2, charSequenceReplaceTags).k(false);
                return;
            case 6:
                t7 t7Var = (t7) this.d;
                TLObject tLObject4 = (TLObject) this.f7378e;
                MessagesController messagesController = (MessagesController) this.f7377c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f7379f;
                long j16 = this.f7376b;
                t7Var.getClass();
                if (tLObject4 != null) {
                    Utilities.stageQueue.postRunnable(new hh.m5(i10, messagesController, tLObject4));
                    return;
                }
                if (tL_error != null) {
                    t7Var.f10087b.addPaidReactions((int) (-t7Var.h), t7Var.f10091g, t7Var.c());
                    NotificationCenter.getInstance(t7Var.f10100q.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(t7Var.f10087b.getDialogId()), Integer.valueOf(t7Var.f10087b.getId()), t7Var.f10087b.messageOwner.reactions);
                    if ("BALANCE_TOO_LOW".equals(tL_error.text)) {
                        if (t7Var.f10086a.f9840a >= 0) {
                            forcedFirstName = UserObject.getForcedFirstName(t7Var.f10088c.getMessagesController().getUser(Long.valueOf(t7Var.f10086a.f9840a)));
                        } else {
                            TLRPC.Chat chat = t7Var.f10088c.getMessagesController().getChat(Long.valueOf(-t7Var.f10086a.f9840a));
                            forcedFirstName = chat == null ? "" : chat.title;
                        }
                        String str5 = forcedFirstName;
                        Context parentActivity = t7Var.f10088c.getParentActivity();
                        if (parentActivity == null) {
                            parentActivity = LaunchActivity.C1;
                        }
                        if (parentActivity == null) {
                            parentActivity = ApplicationLoader.applicationContext;
                        }
                        new ea(parentActivity, t7Var.f10088c.getResourceProvider(), j16, 5, str5, new s7(t7Var, j16, i13), 0L).show();
                    }
                    t7Var.f10100q.T(false);
                    t7Var.f10100q.P();
                    return;
                }
                return;
            case 7:
                jb jbVar = (jb) this.d;
                long j17 = this.f7376b;
                u7 u7Var4 = (u7) this.f7378e;
                MessageObject messageObject2 = (MessageObject) this.f7377c;
                rn rnVar = (rn) this.f7379f;
                h3.x xVar = jbVar.L;
                if (xVar == null) {
                    t7 t7VarD0 = u7Var4.d0(messageObject2, rnVar, j17, false, true, Long.valueOf(jbVar.A));
                    if (t7VarD0 == null) {
                        return;
                    }
                    AndroidUtilities.runOnUIThread(new hh.m5(6, jbVar, t7VarD0));
                    return;
                }
                int iIntValue = jh.u0.a((jh.u0) xVar.f8237b, Long.valueOf(j17)).intValue();
                jbVar.K = iIntValue;
                if (iIntValue == Integer.MIN_VALUE) {
                    jbVar.dismiss();
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new pa(jbVar, i14));
                    return;
                }
            case 8:
                ((ConferenceCall) this.d).lambda$requestLastBlock$2(this.f7376b, (TLObject) this.f7378e, (TLRPC.TL_error) this.f7377c, (Runnable) this.f7379f);
                return;
            case 9:
                lr lrVar = (lr) this.d;
                long j18 = this.f7376b;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.f7378e;
                String str6 = (String) this.f7377c;
                TLObject tLObject5 = (TLObject) this.f7379f;
                dq dqVar = new dq(j18, lrVar.J, null, lrVar.A, tL_chatBannedRights, str6, 1, true, false, null);
                dqVar.T0 = new tq(lrVar, tLObject5);
                lrVar.presentFragment(dqVar);
                return;
            case 10:
                lr lrVar2 = (lr) this.d;
                long j19 = this.f7376b;
                TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f7378e;
                String str7 = (String) this.f7377c;
                TLObject tLObject6 = (TLObject) this.f7379f;
                dq dqVar2 = new dq(j19, lrVar2.J, tL_chatAdminRights, null, null, str7, 0, true, false, null);
                dqVar2.T0 = new uq(lrVar2, tLObject6);
                lrVar2.presentFragment(dqVar2);
                return;
            case 11:
                es esVar = (es) this.d;
                MessagesStorage messagesStorage = (MessagesStorage) this.f7378e;
                ArrayList arrayList = (ArrayList) this.f7377c;
                long j20 = this.f7376b;
                String str8 = (String) this.f7379f;
                SQLiteDatabase database = messagesStorage.getDatabase();
                try {
                    try {
                        database.executeFast("DELETE FROM popular_bots").stepThis().dispose();
                        sQLitePreparedStatementExecuteFast = database.executeFast("REPLACE INTO popular_bots VALUES(?, ?, ?, ?)");
                        while (i14 < arrayList.size()) {
                            sQLitePreparedStatementExecuteFast.requery();
                            sQLitePreparedStatementExecuteFast.bindLong(1, ((Long) arrayList.get(i14)).longValue());
                            sQLitePreparedStatementExecuteFast.bindLong(2, j20);
                            sQLitePreparedStatementExecuteFast.bindString(3, str8);
                            sQLitePreparedStatementExecuteFast.bindInteger(4, i14);
                            sQLitePreparedStatementExecuteFast.step();
                            i14++;
                        }
                        if (sQLitePreparedStatementExecuteFast != null) {
                            sQLitePreparedStatementExecuteFast.dispose();
                        }
                    } catch (Exception e9) {
                        FileLog.e(e9);
                        if (sQLitePreparedStatementExecuteFast != null) {
                        }
                    }
                    AndroidUtilities.runOnUIThread(new ds(esVar, 1));
                    return;
                } catch (Throwable th) {
                    if (sQLitePreparedStatementExecuteFast != null) {
                        sQLitePreparedStatementExecuteFast.dispose();
                    }
                    throw th;
                }
            case 12:
                es esVar2 = (es) this.d;
                ArrayList<TLRPC.User> arrayList2 = (ArrayList) this.f7378e;
                long j21 = this.f7376b;
                String str9 = (String) this.f7377c;
                ds dsVar = (ds) this.f7379f;
                MessagesController.getInstance(esVar2.f28137a).putUsers(arrayList2, true);
                esVar2.h.addAll(arrayList2);
                esVar2.f28141f = j21;
                esVar2.f28142g = str9;
                esVar2.f28140e = TextUtils.isEmpty(str9);
                esVar2.d = true;
                dsVar.run();
                return;
            case 13:
                org.telegram.ui.ActionBar.b2 b2Var2 = (org.telegram.ui.ActionBar.b2) this.d;
                TLObject tLObject7 = (TLObject) this.f7378e;
                long j22 = this.f7376b;
                AccountInstance accountInstance = (AccountInstance) this.f7377c;
                MessagesStorage.BooleanCallback booleanCallback = (MessagesStorage.BooleanCallback) this.f7379f;
                try {
                    b2Var2.dismiss();
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                if (tLObject7 != null) {
                    TL_phone.joinAsPeers joinaspeers = (TL_phone.joinAsPeers) tLObject7;
                    k70.C = joinaspeers.peers;
                    k70.E = j22;
                    k70.D = SystemClock.elapsedRealtime();
                    k70.F = accountInstance.getCurrentAccount();
                    accountInstance.getMessagesController().putChats(joinaspeers.chats, false);
                    accountInstance.getMessagesController().putUsers(joinaspeers.users, false);
                    booleanCallback.run(joinaspeers.peers.size() == 1);
                    return;
                }
                return;
            case 14:
                PhotoViewer photoViewer = (PhotoViewer) this.d;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.f7378e;
                long j23 = this.f7376b;
                String str10 = (String) this.f7377c;
                Bitmap bitmap = (Bitmap) this.f7379f;
                Drawable[] drawableArr = PhotoViewer.P8;
                if (photoEntry.coverPath != null) {
                    try {
                        new File(photoEntry.coverPath).delete();
                    } catch (Exception e11) {
                        FileLog.e(e11);
                    }
                    break;
                }
                photoEntry.coverSavedPosition = j23;
                photoEntry.coverPath = str10;
                photoEntry.coverPhoto = null;
                photoEntry.coverPhotoParentObject = null;
                photoViewer.f35696m5.f34167b.setLoading(false);
                au0 au0Var = photoViewer.d;
                if (au0Var != null) {
                    au0Var.W(photoViewer.L4);
                }
                xr0 xr0Var = photoViewer.f35602c1;
                if (xr0Var != null) {
                    xr0Var.setImage(bitmap);
                }
                photoViewer.e3(0);
                CheckBox checkBox = photoViewer.J0;
                if (checkBox.f26293x) {
                    return;
                }
                checkBox.callOnClick();
                return;
            default:
                ProfileActivity profileActivity2 = (ProfileActivity) this.d;
                boolean[] zArr = (boolean[]) this.f7378e;
                ArrayList arrayList3 = (ArrayList) this.f7377c;
                boolean[] zArr2 = (boolean[]) this.f7379f;
                long j24 = this.f7376b;
                zArr[0] = true;
                AndroidUtilities.cancelRunOnUIThread(profileActivity2.f36060t5);
                for (int i18 = 0; i18 < arrayList3.size(); i18++) {
                    ((TL_stories.StoryItem) arrayList3.get(i18)).pinned = zArr2[i18];
                }
                profileActivity2.getMessagesController().getStoriesController().n0(j24, arrayList3, false);
                return;
        }
    }

    public k1(Object obj, long j10, Object obj2, Object obj3, Object obj4, int i10) {
        this.f7375a = i10;
        this.d = obj;
        this.f7376b = j10;
        this.f7378e = obj2;
        this.f7377c = obj3;
        this.f7379f = obj4;
    }

    public k1(Object obj, Object obj2, long j10, Object obj3, Object obj4, int i10) {
        this.f7375a = i10;
        this.d = obj;
        this.f7378e = obj2;
        this.f7376b = j10;
        this.f7377c = obj3;
        this.f7379f = obj4;
    }

    public k1(Object obj, Object obj2, Object obj3, long j10, Object obj4, int i10) {
        this.f7375a = i10;
        this.d = obj;
        this.f7378e = obj2;
        this.f7377c = obj3;
        this.f7376b = j10;
        this.f7379f = obj4;
    }

    public k1(Object obj, Object obj2, Object obj3, Object obj4, long j10, int i10) {
        this.f7375a = i10;
        this.d = obj;
        this.f7378e = obj2;
        this.f7377c = obj3;
        this.f7379f = obj4;
        this.f7376b = j10;
    }
}
