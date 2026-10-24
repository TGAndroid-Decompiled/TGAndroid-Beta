package ai;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Comparator$CC;
import j$.util.Comparator$EL;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AppGlobalConfig;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.TopicsController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.tl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.w90;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.pa0;
import org.telegram.ui.qz0;
import org.telegram.ui.sn;
public final class ha {
    public static volatile ha[][] S = (ha[][]) Array.newInstance(ha.class, 2, 4);
    public static final Object[][] T = (Object[][]) Array.newInstance(Object.class, 2, 4);
    public boolean A;
    public fa B;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public long G;
    public ca N;
    public final int f1413a;
    public final boolean f1414b;
    public long f1415c;
    public boolean d;
    public boolean e;
    public long f1417g;
    public boolean h;
    public boolean f1418i;
    public ArrayList f1419j;
    public boolean f1420k;
    public boolean f1421l;
    public ArrayList f1422m;
    public boolean f1423n;
    public boolean f1424o;
    public ArrayList f1425p;
    public String f1431w;
    public boolean f1432x;
    public boolean f1433y;
    public TL_stars.StarsAmount f1416f = TL_stars.StarsAmount.ofStars(0);
    public final ArrayList[] f1426q = {new ArrayList(), new ArrayList(), new ArrayList()};
    public final boolean[] f1427r = new boolean[3];
    public final String[] f1428s = new String[3];
    public final boolean[] f1429t = new boolean[3];
    public final boolean[] f1430u = new boolean[3];
    public final ArrayList v = new ArrayList();
    public final ArrayList f1434z = new ArrayList();
    public final ArrayList H = new ArrayList();
    public final ArrayList I = new ArrayList();
    public final ArrayList J = new ArrayList();
    public final LongSparseArray K = new LongSparseArray();
    public final LongSparseArray L = new LongSparseArray();
    public final ConcurrentHashMap M = new ConcurrentHashMap();
    public final ConcurrentHashMap O = new ConcurrentHashMap();
    public final ConcurrentHashMap P = new ConcurrentHashMap();
    public final Set Q = Collections.newSetFromMap(new ConcurrentHashMap());
    public final ConcurrentHashMap R = new ConcurrentHashMap();

    static {
        for (int i10 = 0; i10 < 2; i10++) {
            for (int i11 = 0; i11 < 4; i11++) {
                T[i10][i11] = new Object();
            }
        }
    }

    public ha(int i10, boolean z10) {
        this.f1413a = i10;
        this.f1414b = z10;
    }

    public static org.telegram.ui.ActionBar.g6 I() {
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U != null) {
            return U.getResourceProvider();
        }
        return null;
    }

    public static ha L(int i10) {
        return y(i10, true);
    }

    public static boolean U(int i10, ag.a aVar) {
        if (aVar == null || x(i10, aVar.f631a).s().f632b >= aVar.f632b) {
            return true;
        }
        return false;
    }

    public static void a(ha haVar, TL_stars.StarGifts starGifts) {
        ArrayList arrayList = haVar.I;
        ArrayList arrayList2 = haVar.J;
        int i10 = haVar.f1413a;
        ArrayList arrayList3 = haVar.H;
        haVar.C = false;
        haVar.D = true;
        if (starGifts instanceof TL_stars.TL_starGifts) {
            TL_stars.TL_starGifts tL_starGifts = (TL_stars.TL_starGifts) starGifts;
            MessagesController.getInstance(i10).putUsers(tL_starGifts.users, false);
            MessagesController.getInstance(i10).putChats(tL_starGifts.chats, false);
            MessagesStorage.getInstance(i10).putUsersAndChats(tL_starGifts.users, tL_starGifts.chats, true, true);
            arrayList3.clear();
            arrayList3.addAll(tL_starGifts.gifts);
            arrayList2.clear();
            arrayList2.addAll(arrayList3);
            Collections.sort(arrayList2, Comparator$EL.thenComparingInt(Comparator$CC.comparingInt(new v8(3)), new v8(4)));
            arrayList.clear();
            arrayList.addAll(arrayList3);
            Collections.sort(arrayList, Comparator$CC.comparingInt(new v8(5)));
            haVar.F = tL_starGifts.hash;
            haVar.G = System.currentTimeMillis();
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftsLoaded, new Object[0]);
            haVar.c0(haVar.F, haVar.G, tL_starGifts.gifts);
        } else if (starGifts instanceof TL_stars.TL_starGiftsNotModified) {
            int i11 = haVar.F;
            long currentTimeMillis = System.currentTimeMillis();
            haVar.G = currentTimeMillis;
            haVar.c0(i11, currentTimeMillis, arrayList3);
        }
    }

    public static void b(ha haVar, ArrayList arrayList, Integer num, Long l4, ArrayList arrayList2, ArrayList arrayList3) {
        int i10 = haVar.f1413a;
        MessagesController.getInstance(i10).putUsers(arrayList2, true);
        MessagesController.getInstance(i10).putChats(arrayList3, true);
        haVar.E = true;
        ArrayList arrayList4 = haVar.H;
        arrayList4.clear();
        arrayList4.addAll(arrayList);
        ArrayList arrayList5 = haVar.J;
        arrayList5.clear();
        arrayList5.addAll(arrayList4);
        Collections.sort(arrayList5, Comparator$EL.thenComparingInt(Comparator$CC.comparingInt(new v8(0)), new v8(1)));
        ArrayList arrayList6 = haVar.I;
        arrayList6.clear();
        arrayList6.addAll(arrayList4);
        Collections.sort(arrayList6, Comparator$CC.comparingInt(new v8(2)));
        haVar.F = num.intValue();
        haVar.G = l4.longValue();
        haVar.C = false;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftsLoaded, new Object[0]);
        haVar.V();
    }

    public static void e(String str) {
        org.telegram.ui.Components.vc X;
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        if (R != null && R.visibleDialog == null) {
            X = org.telegram.ui.Components.vc.a0(R);
        } else {
            X = org.telegram.ui.Components.vc.X();
        }
        i2.o1.t(R.string.UnknownErrorCode, new Object[]{str}, X, R.raw.error, 36);
    }

    public static void e0(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
        alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.StarsNotAvailableTitle);
        alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.StarsNotAvailableText);
        org.telegram.messenger.v0.o(R.string.OK, alertDialog$Builder, null);
    }

    public static boolean k(TL_stars.SavedStarGift savedStarGift, TL_stars.SavedStarGift savedStarGift2) {
        int i10 = savedStarGift.flags;
        if ((i10 & 2048) == 0 || (savedStarGift2.flags & 2048) == 0 || savedStarGift.saved_id != savedStarGift2.saved_id) {
            if ((i10 & 8) != 0 && (savedStarGift2.flags & 8) != 0 && savedStarGift.msg_id == savedStarGift2.msg_id) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static TL_stars.StarGiftAttribute l(ArrayList arrayList, Class cls) {
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                TL_stars.StarGiftAttribute starGiftAttribute = (TL_stars.StarGiftAttribute) obj;
                if (cls.isInstance(starGiftAttribute)) {
                    return (TL_stars.StarGiftAttribute) cls.cast(starGiftAttribute);
                }
            }
            return null;
        }
        return null;
    }

    public static ArrayList m(ArrayList arrayList, Class cls) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            TL_stars.StarGiftAttribute starGiftAttribute = (TL_stars.StarGiftAttribute) obj;
            if (cls.isInstance(starGiftAttribute)) {
                arrayList2.add((TL_stars.StarGiftAttribute) cls.cast(starGiftAttribute));
            }
        }
        return arrayList2;
    }

    public static long o(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_sendMessage) {
            return ((TLRPC.TL_messages_sendMessage) tLObject).allow_paid_stars;
        }
        if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
            return ((TLRPC.TL_messages_sendMultiMedia) tLObject).allow_paid_stars;
        }
        if (tLObject instanceof TLRPC.TL_messages_sendInlineBotResult) {
            return ((TLRPC.TL_messages_sendInlineBotResult) tLObject).allow_paid_stars;
        }
        if (tLObject instanceof TLRPC.TL_messages_forwardMessages) {
            TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages = (TLRPC.TL_messages_forwardMessages) tLObject;
            return tL_messages_forwardMessages.allow_paid_stars / tL_messages_forwardMessages.f20430id.size();
        } else if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
            return ((TLRPC.TL_messages_sendMedia) tLObject).allow_paid_stars;
        } else {
            return 0L;
        }
    }

    public static Context t(org.telegram.ui.ActionBar.o2 o2Var) {
        if (o2Var != null && o2Var.getContext() != null) {
            return o2Var.getContext();
        }
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity != null && !launchActivity.isFinishing()) {
            return LaunchActivity.I1;
        }
        if (ApplicationLoader.applicationContext != null) {
            return ApplicationLoader.applicationContext;
        }
        return null;
    }

    public static ha w(int i10) {
        return y(i10, false);
    }

    public static ha x(int i10, ag.b bVar) {
        boolean z10;
        if (bVar == ag.b.f634b) {
            z10 = true;
        } else {
            z10 = false;
        }
        return y(i10, z10);
    }

    public static ha y(int i10, boolean z10) {
        ha haVar;
        ha haVar2 = S[z10 ? 1 : 0][i10];
        if (haVar2 == null) {
            synchronized (T[z10 ? 1 : 0][i10]) {
                try {
                    haVar = S[z10 ? 1 : 0][i10];
                    if (haVar == null) {
                        ha[] haVarArr = S[z10 ? 1 : 0];
                        ha haVar3 = new ha(i10, z10);
                        haVarArr[i10] = haVar3;
                        haVar = haVar3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return haVar;
        }
        return haVar2;
    }

    public final long A(aa aaVar, TLRPC.TL_messageReactions tL_messageReactions) {
        Long l4;
        fa faVar = this.B;
        if (faVar != null && faVar.f1308a.equals(aaVar) && (l4 = this.B.f1318n) != null) {
            return l4.longValue();
        }
        Long myPaidReactionPeer = MessageObject.getMyPaidReactionPeer(tL_messageReactions);
        if (myPaidReactionPeer != null) {
            return myPaidReactionPeer.longValue();
        }
        Long paidReactionsDialogId = MessagesController.getInstance(this.f1413a).getPaidReactionsDialogId();
        if (paidReactionsDialogId != null) {
            return paidReactionsDialogId.longValue();
        }
        return 0L;
    }

    public final long B(MessageObject messageObject) {
        Long myPaidReactionPeer;
        Long l4;
        fa faVar = this.B;
        if (faVar != null && faVar.f1308a.equals(aa.b(messageObject)) && (l4 = this.B.f1318n) != null) {
            return l4.longValue();
        }
        if (messageObject == null) {
            myPaidReactionPeer = null;
        } else {
            myPaidReactionPeer = messageObject.getMyPaidReactionPeer();
        }
        if (myPaidReactionPeer != null) {
            return myPaidReactionPeer.longValue();
        }
        Long paidReactionsDialogId = MessagesController.getInstance(this.f1413a).getPaidReactionsDialogId();
        if (paidReactionsDialogId != null) {
            return paidReactionsDialogId.longValue();
        }
        return 0L;
    }

    public final void C(long j10, long j11, Utilities.Callback callback) {
        TL_account.getPaidMessagesRevenue getpaidmessagesrevenue = new TL_account.getPaidMessagesRevenue();
        int i10 = this.f1413a;
        getpaidmessagesrevenue.user_id = MessagesController.getInstance(i10).getInputUser(j10);
        if (j11 != 0) {
            getpaidmessagesrevenue.parent_peer = MessagesController.getInstance(i10).getInputPeer(j11);
        }
        ConnectionsManager.getInstance(i10).sendRequest(getpaidmessagesrevenue, new g9(0, callback));
    }

    public final long D(int i10, long j10) {
        fa faVar = this.B;
        if (faVar != null) {
            aa aaVar = faVar.f1308a;
            if (aaVar.f980a == j10 && aaVar.f981b == i10 && faVar.f1316l) {
                return faVar.h;
            }
            return 0L;
        }
        return 0L;
    }

    public final long E(MessageObject messageObject) {
        TLRPC.Message message;
        if (messageObject != null && (message = messageObject.messageOwner) != null) {
            if ((message.isThreadMessage || messageObject.isForwardedChannelPost()) && messageObject.messageOwner.fwd_from != null) {
                return D(messageObject.messageOwner.fwd_from.saved_from_msg_id, messageObject.getFromChatId());
            }
            return D(messageObject.getId(), messageObject.getDialogId());
        }
        return 0L;
    }

    public final v9 F(long j10, boolean z10) {
        LongSparseArray longSparseArray = this.K;
        v9 v9Var = (v9) longSparseArray.get(j10);
        if (v9Var == null && z10) {
            v9 v9Var2 = new v9(this.f1413a, j10);
            longSparseArray.put(j10, v9Var2);
            return v9Var2;
        }
        return v9Var;
    }

    public final y9 G(long j10, boolean z10) {
        LongSparseArray longSparseArray = this.L;
        y9 y9Var = (y9) longSparseArray.get(j10);
        if (y9Var == null && z10) {
            y9 y9Var2 = new y9(this.f1413a, j10, true);
            longSparseArray.put(j10, y9Var2);
            return y9Var2;
        }
        return y9Var;
    }

    public final void H(TL_stars.StarGift starGift, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, Utilities.Callback callback) {
        Context context = LaunchActivity.I1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        org.telegram.ui.ActionBar.g6 I = I();
        if (starGift != null && context != null) {
            if (!this.e) {
                r(new c3(this, callback, starGift, j10));
                return;
            }
            TLRPC.TL_inputInvoiceStarGiftResale tL_inputInvoiceStarGiftResale = new TLRPC.TL_inputInvoiceStarGiftResale();
            tL_inputInvoiceStarGiftResale.slug = starGift.slug;
            tL_inputInvoiceStarGiftResale.to_id = MessagesController.getInstance(this.f1413a).getInputPeer(j10);
            tL_inputInvoiceStarGiftResale.ton = this.f1414b;
            tL_inputInvoiceStarGiftResale.message = tL_textWithEntities;
            tL_inputInvoiceStarGiftResale.show_name = !z10;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject q6 = gi.d3.q(I, false);
            if (q6 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = q6.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftResale;
            ConnectionsManager.getInstance(this.f1413a).sendRequest(tL_payments_getPaymentForm, new g(5, this, callback));
        }
    }

    public final TL_stars.StarGift J(long j10) {
        V();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i10 < arrayList.size()) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList.get(i10);
                if (starGift.f20568id == j10) {
                    return starGift;
                }
                i10++;
            } else {
                return null;
            }
        }
    }

    public final void K(long j10, Utilities.Callback callback) {
        TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) this.M.get(Long.valueOf(j10));
        if (stargiftupgradepreview != null) {
            callback.run(stargiftupgradepreview);
            return;
        }
        TL_stars.getStarGiftUpgradePreview getstargiftupgradepreview = new TL_stars.getStarGiftUpgradePreview();
        getstargiftupgradepreview.gift_id = j10;
        ConnectionsManager.getInstance(this.f1413a).sendRequest(getstargiftupgradepreview, new m3(this, j10, callback, 1));
    }

    public final void M(TL_stars.InputSavedStarGift inputSavedStarGift, Utilities.Callback callback) {
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(ApplicationLoader.applicationContext, 3, null);
        c2Var.r(200L);
        TL_stars.getSavedStarGift getsavedstargift = new TL_stars.getSavedStarGift();
        getsavedstargift.stargift.add(inputSavedStarGift);
        ConnectionsManager.getInstance(this.f1413a).sendRequest(getsavedstargift, new k2(this, c2Var, inputSavedStarGift, callback, 2));
    }

    public final boolean N() {
        return O(0);
    }

    public final boolean O(int i10) {
        if (this.e && !this.f1426q[i10].isEmpty()) {
            return true;
        }
        return false;
    }

    public final void P() {
        this.e = false;
        p();
        this.e = true;
    }

    public final void Q(long j10) {
        y9 G = G(j10, false);
        if (G != null) {
            G.j(false);
        }
        v9 v9Var = (v9) this.K.get(j10);
        if (v9Var != null) {
            v9Var.g();
        }
    }

    public final void R(TLRPC.UserFull userFull) {
        long j10 = userFull.f20492id;
        y9 G = G(j10, false);
        if (G != null && G.f2513n != userFull.stargifts_count) {
            G.j(false);
        }
        v9 v9Var = (v9) this.K.get(j10);
        if (v9Var != null) {
            v9Var.g();
        }
    }

    public final void S() {
        if (this.f1432x) {
            return;
        }
        this.v.clear();
        this.f1431w = null;
        this.f1432x = false;
        this.f1433y = false;
        W();
    }

    public final void T(boolean z10) {
        for (int i10 = 0; i10 < 3; i10++) {
            boolean[] zArr = this.f1429t;
            if (!zArr[i10]) {
                this.f1426q[i10].clear();
                this.f1428s[i10] = null;
                zArr[i10] = false;
                this.f1430u[i10] = false;
                if (z10) {
                    X(i10);
                }
            }
        }
    }

    public final void V() {
        if (!this.C) {
            if (!this.D || System.currentTimeMillis() - this.G >= 60000) {
                this.C = true;
                boolean z10 = this.E;
                int i10 = this.f1413a;
                if (!z10) {
                    a1.c cVar = new a1.c(this, 7);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
                    messagesStorage.getStorageQueue().postRunnable(new t0(messagesStorage, arrayList3, arrayList2, arrayList, cVar, 4));
                    return;
                }
                int i11 = this.F;
                r0 r0Var = new r0(this, 3);
                TL_stars.getStarGifts getstargifts = new TL_stars.getStarGifts();
                getstargifts.hash = i11;
                ConnectionsManager.getInstance(i10).sendRequest(getstargifts, new h(r0Var, 3));
            }
        }
    }

    public final void W() {
        if (!this.f1414b && !this.f1432x && !this.f1433y) {
            this.f1432x = true;
            TL_stars.TL_getStarsSubscriptions tL_getStarsSubscriptions = new TL_stars.TL_getStarsSubscriptions();
            tL_getStarsSubscriptions.peer = new TLRPC.TL_inputPeerSelf();
            String str = this.f1431w;
            tL_getStarsSubscriptions.offset = str;
            if (str == null) {
                tL_getStarsSubscriptions.offset = "";
            }
            ConnectionsManager.getInstance(this.f1413a).sendRequest(tL_getStarsSubscriptions, new u8(this, 1));
        }
    }

    public final void X(int i10) {
        boolean z10;
        boolean[] zArr = this.f1429t;
        if (!zArr[i10] && !this.f1430u[i10]) {
            boolean z11 = true;
            zArr[i10] = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
            tL_payments_getStarsTransactions.ton = this.f1414b;
            tL_payments_getStarsTransactions.peer = new TLRPC.TL_inputPeerSelf();
            if (i10 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            tL_payments_getStarsTransactions.inbound = z10;
            if (i10 != 2) {
                z11 = false;
            }
            tL_payments_getStarsTransactions.outbound = z11;
            String str = this.f1428s[i10];
            tL_payments_getStarsTransactions.offset = str;
            if (str == null) {
                tL_payments_getStarsTransactions.offset = "";
            }
            ConnectionsManager.getInstance(this.f1413a).sendRequest(tL_payments_getStarsTransactions, new n2(this, i10, 1));
        }
    }

    public final void Y(org.telegram.messenger.MessageObject r40, org.telegram.tgnet.TLRPC.InputInvoice r41, org.telegram.tgnet.TLRPC.TL_payments_paymentFormStars r42, java.lang.Runnable r43, org.telegram.messenger.Utilities.Callback r44) {
        throw new UnsupportedOperationException("Method not decompiled: ai.ha.Y(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$InputInvoice, org.telegram.tgnet.TLRPC$TL_payments_paymentFormStars, java.lang.Runnable, org.telegram.messenger.Utilities$Callback):void");
    }

    public final void Z(final String str, final TLRPC.ChatInvite chatInvite, final Utilities.Callback2 callback2) {
        if (chatInvite != null && chatInvite.subscription_pricing != null) {
            final Context context = ApplicationLoader.applicationContext;
            final org.telegram.ui.ActionBar.g6 I = I();
            if (context != null) {
                final long j10 = chatInvite.subscription_pricing.amount;
                final String str2 = chatInvite.title;
                TLRPC.TL_inputInvoiceChatInviteSubscription tL_inputInvoiceChatInviteSubscription = new TLRPC.TL_inputInvoiceChatInviteSubscription();
                tL_inputInvoiceChatInviteSubscription.hash = str;
                TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                tL_payments_sendStarsForm.form_id = chatInvite.subscription_form_id;
                tL_payments_sendStarsForm.invoice = tL_inputInvoiceChatInviteSubscription;
                ConnectionsManager.getInstance(this.f1413a).sendRequest(tL_payments_sendStarsForm, new RequestDelegate() {
                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        final ha haVar = ha.this;
                        final Utilities.Callback2 callback22 = callback2;
                        final long j11 = j10;
                        final String str3 = str2;
                        final Context context2 = context;
                        final org.telegram.ui.ActionBar.g6 g6Var = I;
                        final TLRPC.ChatInvite chatInvite2 = chatInvite;
                        final String str4 = str;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                org.telegram.ui.Components.vc X;
                                String str5;
                                long j12;
                                pa0 pa0Var;
                                ha haVar2 = ha.this;
                                TLObject tLObject2 = tLObject;
                                Utilities.Callback2 callback23 = callback22;
                                long j13 = j11;
                                String str6 = str3;
                                TLRPC.TL_error tL_error2 = tL_error;
                                Context context3 = context2;
                                org.telegram.ui.ActionBar.g6 g6Var2 = g6Var;
                                TLRPC.ChatInvite chatInvite3 = chatInvite2;
                                String str7 = str4;
                                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                                if (!AndroidUtilities.hasDialogOnTop(R)) {
                                    X = org.telegram.ui.Components.vc.a0(R);
                                } else {
                                    X = org.telegram.ui.Components.vc.X();
                                }
                                if (tLObject2 instanceof TLRPC.TL_payments_paymentResult) {
                                    TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject2;
                                    Utilities.stageQueue.postRunnable(new p8(haVar2, tL_payments_paymentResult, 0));
                                    TLRPC.Updates updates = tL_payments_paymentResult.updates;
                                    TLRPC.Update update = updates.update;
                                    if (update instanceof TL_update.TL_updateChannel) {
                                        j12 = -((TL_update.TL_updateChannel) update).channel_id;
                                    } else {
                                        j12 = 0;
                                    }
                                    if (updates.updates != null) {
                                        for (int i10 = 0; i10 < tL_payments_paymentResult.updates.updates.size(); i10++) {
                                            if (tL_payments_paymentResult.updates.updates.get(i10) instanceof TL_update.TL_updateChannel) {
                                                j12 = -((TL_update.TL_updateChannel) tL_payments_paymentResult.updates.updates.get(i10)).channel_id;
                                            }
                                        }
                                    }
                                    callback23.run(Long.valueOf(j12), Boolean.TRUE);
                                    if (j12 == 0) {
                                        X.M(LocaleController.getString(R.string.StarsSubscriptionCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscriptionCompletedText", (int) j13, str6)), R.raw.stars_send).j();
                                    }
                                    LaunchActivity launchActivity = LaunchActivity.I1;
                                    if (launchActivity != null && (pa0Var = launchActivity.f33503x0) != null) {
                                        pa0Var.c(true);
                                    }
                                    haVar2.T(true);
                                    haVar2.S();
                                } else if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                                    if (!MessagesController.getInstance(haVar2.f1413a).starsPurchaseAvailable()) {
                                        callback23.run(0L, Boolean.FALSE);
                                        ha.e0(context3, g6Var2);
                                        return;
                                    }
                                    boolean[] zArr = {false};
                                    dd ddVar = new dd(context3, g6Var2, j13, 1, chatInvite3.title, new t0(haVar2, zArr, str7, chatInvite3, callback23, 3), 0L);
                                    ddVar.setOnDismissListener(new q8(callback23, zArr, 0));
                                    ddVar.show();
                                } else {
                                    callback23.run(0L, Boolean.FALSE);
                                    int i11 = R.raw.error;
                                    int i12 = R.string.UnknownErrorCode;
                                    if (tL_error2 != null) {
                                        str5 = tL_error2.text;
                                    } else {
                                        str5 = "FAILED_SEND_STARS";
                                    }
                                    i2.o1.t(i12, new Object[]{str5}, X, i11, 36);
                                }
                            }
                        });
                    }
                });
            }
        }
    }

    public final void a0(final MessageObject messageObject, final TLRPC.InputInvoice inputInvoice, final TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, final Utilities.Callback callback) {
        long j10;
        String str;
        TLRPC.User user;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        if (tL_payments_paymentFormStars != null) {
            final Context context = ApplicationLoader.applicationContext;
            final org.telegram.ui.ActionBar.g6 I = I();
            if (context == null) {
                return;
            }
            ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStars.invoice.prices;
            int size = arrayList.size();
            final long j11 = 0;
            int i10 = 0;
            while (i10 < size) {
                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i10);
                i10++;
                j11 += tL_labeledPrice.amount;
            }
            if (messageObject != null) {
                TLRPC.Message message = messageObject.messageOwner;
                if (message != null && (messageFwdHeader = message.fwd_from) != null && (peer = messageFwdHeader.from_id) != null) {
                    j10 = DialogObject.getPeerDialogId(peer);
                } else {
                    j10 = messageObject.getDialogId();
                }
                if (j10 < 0 && messageObject.getFromChatId() > 0 && (user = MessagesController.getInstance(this.f1413a).getUser(Long.valueOf(messageObject.getFromChatId()))) != null && user.bot) {
                    j10 = user.f20491id;
                }
            } else {
                j10 = tL_payments_paymentFormStars.bot_id;
            }
            final long j12 = j10;
            if (j12 >= 0) {
                str = UserObject.getUserName(MessagesController.getInstance(this.f1413a).getUser(Long.valueOf(j12)));
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(this.f1413a).getChat(Long.valueOf(-j12));
                if (chat == null) {
                    str = "";
                } else {
                    str = chat.title;
                }
            }
            final String str2 = str;
            final String str3 = tL_payments_paymentFormStars.title;
            final int i11 = tL_payments_paymentFormStars.invoice.subscription_period;
            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
            tL_payments_sendStarsForm.form_id = tL_payments_paymentFormStars.form_id;
            tL_payments_sendStarsForm.invoice = inputInvoice;
            ConnectionsManager.getInstance(this.f1413a).sendRequest(tL_payments_sendStarsForm, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    final ha haVar = ha.this;
                    final Utilities.Callback callback2 = callback;
                    final MessageObject messageObject2 = messageObject;
                    final Context context2 = context;
                    final long j13 = j11;
                    final String str4 = str2;
                    final int i12 = i11;
                    final String str5 = str3;
                    final TLRPC.InputInvoice inputInvoice2 = inputInvoice;
                    final long j14 = j12;
                    final org.telegram.ui.ActionBar.g6 g6Var = I;
                    final TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars2 = tL_payments_paymentFormStars;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            throw new UnsupportedOperationException("Method not decompiled: ai.p9.run():void");
                        }
                    });
                }
            });
        }
    }

    public final void b0(long j10, long j11, boolean z10) {
        int i10 = this.f1413a;
        TopicsController topicsController = MessagesController.getInstance(i10).getTopicsController();
        TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j10, j11);
        if (findTopic != null) {
            findTopic.nopaid_messages_exception = z10;
            topicsController.saveTopics(j10);
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesFeeUpdated, Long.valueOf(j11));
        }
    }

    public final boolean c(TLObject tLObject, ArrayList arrayList, Runnable runnable) {
        if (arrayList.isEmpty() || o(tLObject) <= 0) {
            return true;
        }
        HashSet hashSet = new HashSet();
        int size = arrayList.size();
        boolean z10 = false;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            int id2 = ((MessageObject) obj).getId();
            hashSet.add(Integer.valueOf(id2));
            if (this.Q.remove(Integer.valueOf(id2))) {
                this.R.put(Integer.valueOf(id2), new a3.l0(this, hashSet, runnable, 14));
                z10 = true;
            }
        }
        return !z10;
    }

    public final void c0(int i10, long j10, ArrayList arrayList) {
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.f1413a);
        messagesStorage.getStorageQueue().postRunnable(new h9(messagesStorage, j10, arrayList, i10));
    }

    public final void d(org.telegram.messenger.MessageObject r15) {
        throw new UnsupportedOperationException("Method not decompiled: ai.ha.d(org.telegram.messenger.MessageObject):void");
    }

    public final fa d0(final MessageObject messageObject, final sn snVar, final long j10, boolean z10, boolean z11, final Long l4) {
        long j11;
        final ha haVar;
        boolean z12;
        String str;
        aa b10 = aa.b(messageObject);
        int i10 = this.f1413a;
        ha y3 = y(i10, false);
        Context t10 = t(snVar);
        if (t10 == null) {
            return null;
        }
        String str2 = "";
        if (z11 && y3.e && y3.q(false, false, null).amount <= 0) {
            long a2 = snVar.a();
            if (a2 >= 0) {
                str2 = UserObject.getForcedFirstName(snVar.getMessagesController().getUser(Long.valueOf(a2)));
            } else {
                TLRPC.Chat chat = snVar.getMessagesController().getChat(Long.valueOf(-a2));
                if (chat != null) {
                    str2 = chat.title;
                }
            }
            new dd(t10, snVar.getResourceProvider(), j10, 5, str2, new Runnable(this) {
                public final ha f977b;

                {
                    this.f977b = this;
                }

                @Override
                public final void run() {
                    switch (r7) {
                        case 0:
                            this.f977b.d0(messageObject, snVar, j10, true, true, l4);
                            return;
                        default:
                            this.f977b.d0(messageObject, snVar, j10, true, true, l4);
                            return;
                    }
                }
            }, 0L).show();
            return null;
        }
        fa faVar = this.B;
        if (faVar != null && faVar.f1308a.equals(b10)) {
            j11 = 0;
            haVar = this;
        } else {
            fa faVar2 = this.B;
            if (faVar2 != null) {
                faVar2.b();
            }
            ConnectionsManager.getInstance(i10).getCurrentTime();
            j11 = 0;
            haVar = this;
            fa faVar3 = new fa(haVar, b10, messageObject, snVar, z10);
            haVar.B = faVar3;
            faVar3.f1318n = l4;
        }
        if (haVar.B.h + j10 > MessagesController.getInstance(i10).starsPaidReactionAmountMax) {
            haVar.B.b();
            ConnectionsManager.getInstance(i10).getCurrentTime();
            haVar.B = new fa(haVar, b10, messageObject, snVar, z10);
        }
        final long j12 = haVar.B.h + j10;
        if (z11 && y3.e && y3.q(false, false, null).amount < j12) {
            haVar.B.a();
            long a10 = snVar.a();
            if (a10 >= j11) {
                str = UserObject.getForcedFirstName(snVar.getMessagesController().getUser(Long.valueOf(a10)));
            } else {
                TLRPC.Chat chat2 = snVar.getMessagesController().getChat(Long.valueOf(-a10));
                if (chat2 != null) {
                    str2 = chat2.title;
                }
                str = str2;
            }
            new dd(t10, snVar.getResourceProvider(), j12, 5, str, new Runnable(haVar) {
                public final ha f977b;

                {
                    this.f977b = haVar;
                }

                @Override
                public final void run() {
                    switch (r7) {
                        case 0:
                            this.f977b.d0(messageObject, snVar, j12, true, true, l4);
                            return;
                        default:
                            this.f977b.d0(messageObject, snVar, j12, true, true, l4);
                            return;
                    }
                }
            }, 0L).show();
            return null;
        }
        fa faVar4 = haVar.B;
        if ((messageObject != null && !messageObject.doesPaidReactionExist()) || z10) {
            z12 = true;
        } else {
            z12 = false;
        }
        da daVar = faVar4.f1320p;
        ha haVar2 = faVar4.f1321q;
        int i11 = haVar2.f1413a;
        org.telegram.ui.Components.ic icVar = faVar4.e;
        MessageObject messageObject2 = faVar4.f1309b;
        if (!faVar4.f1313i && !faVar4.f1314j) {
            faVar4.h += j10;
            System.currentTimeMillis();
            icVar.f27396c.a();
            icVar.f27396c.c(AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSentText", (int) faVar4.h, new Object[0])), true, true);
            if (faVar4.f1317m) {
                faVar4.f1311f.f27003b = 5000L;
                AndroidUtilities.cancelRunOnUIThread(daVar);
                AndroidUtilities.runOnUIThread(daVar, 5000L);
            }
            if (z12) {
                faVar4.f1316l = true;
                messageObject2.addPaidReactions((int) j10, true, faVar4.c());
                haVar2.f1417g += j10;
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject2.getDialogId()), Integer.valueOf(messageObject2.getId()), messageObject2.messageOwner.reactions);
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
            } else {
                faVar4.f1316l = false;
                if (messageObject2.ensurePaidReactionsExist(true)) {
                    faVar4.f1315k--;
                }
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject2.getDialogId()), Integer.valueOf(messageObject2.getId()), messageObject2.messageOwner.reactions);
                faVar4.f1315k += j10;
            }
            icVar.f27395b.setText(faVar4.d());
        } else if (BuildVars.DEBUG_PRIVATE_VERSION) {
            throw new RuntimeException("adding more amount to committed reactions");
        }
        fa faVar5 = haVar.B;
        faVar5.f1318n = l4;
        return faVar5;
    }

    public final void f(Activity activity, TL_stars.TL_starsTopupOption tL_starsTopupOption, Utilities.Callback2 callback2, TLRPC.InputPeer inputPeer) {
        boolean z10;
        if (activity == null) {
            return;
        }
        int i10 = this.f1413a;
        if (!MessagesController.getInstance(i10).starsPurchaseAvailable()) {
            org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
            if (R != null && R.getContext() != null) {
                e0(R.getContext(), R.getResourceProvider());
                return;
            } else {
                e0(activity, null);
                return;
            }
        }
        if (AppGlobalConfig.getInstance(i10).starsSpendTopUpInvoiceDisabled.get() && inputPeer != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((BuildVars.useInvoiceBilling() || !BillingController.getInstance().isReady()) && !z10) {
            TLRPC.TL_inputStorePaymentStarsTopup tL_inputStorePaymentStarsTopup = new TLRPC.TL_inputStorePaymentStarsTopup();
            tL_inputStorePaymentStarsTopup.stars = tL_starsTopupOption.stars;
            tL_inputStorePaymentStarsTopup.amount = tL_starsTopupOption.amount;
            tL_inputStorePaymentStarsTopup.currency = tL_starsTopupOption.currency;
            tL_inputStorePaymentStarsTopup.spend_purpose_peer = inputPeer;
            TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
            tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsTopup;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject q6 = gi.d3.q(I(), false);
            if (q6 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = q6.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
            ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getPaymentForm, new j2(this, callback2, tL_inputInvoiceStars, 3));
        } else if (!BillingController.getInstance().isReady()) {
            callback2.run(Boolean.FALSE, "INVOICE DISABLED");
        } else {
            TLRPC.TL_inputStorePaymentStarsTopup tL_inputStorePaymentStarsTopup2 = new TLRPC.TL_inputStorePaymentStarsTopup();
            tL_inputStorePaymentStarsTopup2.stars = tL_starsTopupOption.stars;
            tL_inputStorePaymentStarsTopup2.currency = tL_starsTopupOption.currency;
            tL_inputStorePaymentStarsTopup2.amount = tL_starsTopupOption.amount;
            ?? obj = new Object();
            obj.f4700b = "inapp";
            obj.f4699a = tL_starsTopupOption.store_product;
            c5.s a2 = obj.a();
            FileLog.d("StarsController.buy starts queryProductDetails");
            BillingController.getInstance().queryProductDetails(Arrays.asList(a2), new a1.d(callback2, tL_inputStorePaymentStarsTopup2, tL_starsTopupOption, activity, 1));
        }
    }

    public final void f0(List list) {
        if (list != null && !list.isEmpty()) {
            MessageObject messageObject = (MessageObject) list.get(0);
            long dialogId = messageObject.getDialogId();
            int i10 = (dialogId > 0L ? 1 : (dialogId == 0L ? 0 : -1));
            int i11 = this.f1413a;
            if (i10 >= 0) {
                MessagesController.getInstance(i11).loadFullUser(MessagesController.getInstance(i11).getUser(Long.valueOf(dialogId)), 0, true);
            } else {
                MessagesController.getInstance(i11).loadFullChat(-dialogId, 0, true);
            }
            org.telegram.ui.Components.vc.a0(LaunchActivity.U()).Q(R.raw.error, 36, nd.R0(TextUtils.concat(LocaleController.formatPluralString("PaidMessagesSendErrorToast1", (int) messageObject.messageOwner.errorAllowedPriceStars, new Object[0]), " ", LocaleController.formatPluralString("PaidMessagesSendErrorToast2", (int) messageObject.messageOwner.errorNewPriceStars, new Object[0])))).j();
        }
    }

    public final void g(final long j10, final TLObject tLObject, final TLRPC.TL_textWithEntities tL_textWithEntities, final Utilities.Callback2 callback2) {
        int i10;
        Context context = LaunchActivity.I1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        final Context context2 = context;
        final org.telegram.ui.ActionBar.g6 I = I();
        boolean z10 = tLObject instanceof TLRPC.TL_premiumGiftOption;
        if ((z10 || (tLObject instanceof TLRPC.TL_premiumGiftCodeOption)) && context2 != null) {
            if (!this.e) {
                r(new z(this, callback2, j10, tLObject, tL_textWithEntities, 3));
                return;
            }
            if (z10) {
                i10 = ((TLRPC.TL_premiumGiftOption) tLObject).months;
            } else if (tLObject instanceof TLRPC.TL_premiumGiftCodeOption) {
                i10 = ((TLRPC.TL_premiumGiftCodeOption) tLObject).months;
            } else {
                return;
            }
            final String name = DialogObject.getName(this.f1413a, j10);
            final TLRPC.TL_inputInvoicePremiumGiftStars tL_inputInvoicePremiumGiftStars = new TLRPC.TL_inputInvoicePremiumGiftStars();
            tL_inputInvoicePremiumGiftStars.user_id = MessagesController.getInstance(this.f1413a).getInputUser(j10);
            tL_inputInvoicePremiumGiftStars.months = i10;
            if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                tL_inputInvoicePremiumGiftStars.flags |= 1;
                tL_inputInvoicePremiumGiftStars.message = tL_textWithEntities;
            }
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject q6 = gi.d3.q(I, false);
            if (q6 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = q6.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoicePremiumGiftStars;
            ConnectionsManager.getInstance(this.f1413a).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                    final ha haVar = ha.this;
                    final Utilities.Callback2 callback22 = callback2;
                    final TLRPC.TL_inputInvoicePremiumGiftStars tL_inputInvoicePremiumGiftStars2 = tL_inputInvoicePremiumGiftStars;
                    final Context context3 = context2;
                    final org.telegram.ui.ActionBar.g6 g6Var = I;
                    final String str = name;
                    final long j11 = j10;
                    final TLObject tLObject3 = tLObject;
                    final TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_textWithEntities;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            String str2;
                            TLObject tLObject4 = tLObject2;
                            boolean z11 = tLObject4 instanceof TLRPC.TL_payments_paymentFormStars;
                            Utilities.Callback2 callback23 = callback22;
                            if (!z11) {
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    str2 = "NO_PAYMENT_FORM";
                                } else {
                                    str2 = tL_error2.text;
                                }
                                ha.e(str2);
                                callback23.run(Boolean.FALSE, null);
                                return;
                            }
                            TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = (TLRPC.TL_payments_paymentFormStars) tLObject4;
                            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                            tL_payments_sendStarsForm.form_id = tL_payments_paymentFormStars.form_id;
                            tL_payments_sendStarsForm.invoice = tL_inputInvoicePremiumGiftStars2;
                            ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStars.invoice.prices;
                            int size = arrayList.size();
                            int i11 = 0;
                            long j12 = 0;
                            while (i11 < size) {
                                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i11);
                                i11++;
                                j12 += tL_labeledPrice.amount;
                            }
                            ha haVar2 = ha.this;
                            ConnectionsManager.getInstance(haVar2.f1413a).sendRequest(tL_payments_sendStarsForm, new n8(haVar2, callback23, context3, g6Var, j12, str, j11, tLObject3, tL_textWithEntities2));
                        }
                    });
                }
            });
        }
    }

    public final void g0(LaunchActivity launchActivity, long j10, String str) {
        if (!this.e) {
            r(new c3(this, (Object) launchActivity, j10, (Object) str, 7));
        } else {
            h0(launchActivity, j10, str);
        }
    }

    public final void h(TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, Utilities.Callback2 callback2) {
        Context context = LaunchActivity.I1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        Context context2 = context;
        org.telegram.ui.ActionBar.g6 I = I();
        if (starGift != null && context2 != null) {
            if (!this.e) {
                r(new z(this, callback2, tL_payments_paymentFormStarGift, starGift, j10, 4));
                return;
            }
            String name = DialogObject.getName(this.f1413a, j10);
            TLRPC.TL_inputInvoiceStarGiftResale tL_inputInvoiceStarGiftResale = new TLRPC.TL_inputInvoiceStarGiftResale();
            tL_inputInvoiceStarGiftResale.slug = starGift.slug;
            tL_inputInvoiceStarGiftResale.to_id = MessagesController.getInstance(this.f1413a).getInputPeer(j10);
            tL_inputInvoiceStarGiftResale.ton = this.f1414b;
            tL_inputInvoiceStarGiftResale.message = tL_textWithEntities;
            tL_inputInvoiceStarGiftResale.show_name = !z10;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            int i10 = 0;
            JSONObject q6 = gi.d3.q(I, false);
            if (q6 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = q6.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftResale;
            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
            tL_payments_sendStarsForm.form_id = tL_payments_paymentFormStarGift.form_id;
            tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftResale;
            ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStarGift.invoice.prices;
            int size = arrayList.size();
            long j11 = 0;
            while (i10 < size) {
                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i10);
                i10++;
                j11 += tL_labeledPrice.amount;
                size = size;
                context2 = context2;
            }
            ConnectionsManager.getInstance(this.f1413a).sendRequest(tL_payments_sendStarsForm, new n8(this, callback2, context2, I, j11, name, tL_payments_paymentFormStarGift, starGift, j10));
        }
    }

    public final void h0(LaunchActivity launchActivity, long j10, String str) {
        if (p().amount < j10 && j10 > 0) {
            new dd(launchActivity, null, j10, 4, str, new ah.j(4), 0L).show();
            return;
        }
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        org.telegram.ui.Components.oc J = org.telegram.ui.Components.vc.a0(U).J(R.raw.stars_topup, LocaleController.getString(R.string.StarsTopupLinkEnough), LocaleController.getString(R.string.StarsTopupLinkTopupAnyway), new ah.j(3));
        J.f29203j = 5000;
        J.k(true);
    }

    public final void i(final TL_stars.StarGift starGift, final boolean z10, final boolean z11, final long j10, final TLRPC.TL_textWithEntities tL_textWithEntities, final yh.l4 l4Var) {
        Context context = LaunchActivity.I1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        final Context context2 = context;
        final org.telegram.ui.ActionBar.g6 I = I();
        if (starGift != null && context2 != null) {
            if (!this.e) {
                r(new Runnable() {
                    @Override
                    public final void run() {
                        ha haVar = ha.this;
                        boolean z12 = haVar.e;
                        yh.l4 l4Var2 = l4Var;
                        if (!z12) {
                            ha.e("NO_BALANCE");
                            l4Var2.run(Boolean.FALSE, null);
                            return;
                        }
                        haVar.i(starGift, z10, z11, j10, tL_textWithEntities, l4Var2);
                    }
                });
                return;
            }
            final String name = DialogObject.getName(this.f1413a, j10);
            final TLRPC.TL_inputInvoiceStarGift tL_inputInvoiceStarGift = new TLRPC.TL_inputInvoiceStarGift();
            tL_inputInvoiceStarGift.hide_name = z10;
            tL_inputInvoiceStarGift.peer = MessagesController.getInstance(this.f1413a).getInputPeer(j10);
            tL_inputInvoiceStarGift.gift_id = starGift.f20568id;
            tL_inputInvoiceStarGift.include_upgrade = z11;
            if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                tL_inputInvoiceStarGift.flags |= 2;
                tL_inputInvoiceStarGift.message = tL_textWithEntities;
            }
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject q6 = gi.d3.q(I, false);
            if (q6 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = q6.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGift;
            ConnectionsManager.getInstance(this.f1413a).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    final ha haVar = ha.this;
                    final yh.l4 l4Var2 = l4Var;
                    final TLRPC.TL_inputInvoiceStarGift tL_inputInvoiceStarGift2 = tL_inputInvoiceStarGift;
                    final Context context3 = context2;
                    final org.telegram.ui.ActionBar.g6 g6Var = I;
                    final String str = name;
                    final TL_stars.StarGift starGift2 = starGift;
                    final boolean z12 = z10;
                    final boolean z13 = z11;
                    final long j11 = j10;
                    final TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_textWithEntities;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            String str2;
                            TLObject tLObject2 = tLObject;
                            boolean z14 = tLObject2 instanceof TLRPC.TL_payments_paymentFormStarGift;
                            final yh.l4 l4Var3 = l4Var2;
                            if (!z14) {
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    str2 = "NO_PAYMENT_FORM";
                                } else {
                                    str2 = tL_error2.text;
                                }
                                ha.e(str2);
                                l4Var3.run(Boolean.FALSE, null);
                                return;
                            }
                            TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) tLObject2;
                            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                            tL_payments_sendStarsForm.form_id = tL_payments_paymentFormStarGift.form_id;
                            tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGift2;
                            ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStarGift.invoice.prices;
                            int size = arrayList.size();
                            int i10 = 0;
                            final long j12 = 0;
                            while (i10 < size) {
                                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i10);
                                i10++;
                                j12 += tL_labeledPrice.amount;
                            }
                            final ha haVar2 = ha.this;
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(haVar2.f1413a);
                            final Context context4 = context3;
                            final org.telegram.ui.ActionBar.g6 g6Var2 = g6Var;
                            final String str3 = str;
                            final TL_stars.StarGift starGift3 = starGift2;
                            final boolean z15 = z12;
                            final boolean z16 = z13;
                            final long j13 = j11;
                            final TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_textWithEntities2;
                            connectionsManager.sendRequest(tL_payments_sendStarsForm, new RequestDelegate() {
                                @Override
                                public final void run(final TLObject tLObject3, final TLRPC.TL_error tL_error3) {
                                    final ha haVar3 = ha.this;
                                    final yh.l4 l4Var4 = l4Var3;
                                    final Context context5 = context4;
                                    final org.telegram.ui.ActionBar.g6 g6Var3 = g6Var2;
                                    final long j14 = j12;
                                    final String str4 = str3;
                                    final TL_stars.StarGift starGift4 = starGift3;
                                    final boolean z17 = z15;
                                    final boolean z18 = z16;
                                    final long j15 = j13;
                                    final TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_textWithEntities3;
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            org.telegram.ui.Components.vc X;
                                            int i11;
                                            SpannableStringBuilder spannableStringBuilder;
                                            SpannableStringBuilder replaceTags;
                                            pa0 pa0Var;
                                            ?? r52;
                                            char c10;
                                            String str5;
                                            ha haVar4 = ha.this;
                                            TLObject tLObject4 = tLObject3;
                                            TLRPC.TL_error tL_error4 = tL_error3;
                                            yh.l4 l4Var5 = l4Var4;
                                            Context context6 = context5;
                                            org.telegram.ui.ActionBar.g6 g6Var4 = g6Var3;
                                            long j16 = j14;
                                            String str6 = str4;
                                            TL_stars.StarGift starGift5 = starGift4;
                                            boolean z19 = z17;
                                            boolean z20 = z18;
                                            long j17 = j15;
                                            TLRPC.TL_textWithEntities tL_textWithEntities5 = tL_textWithEntities4;
                                            org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                                            if (R != null && R.visibleDialog == null) {
                                                X = org.telegram.ui.Components.vc.a0(R);
                                            } else {
                                                X = org.telegram.ui.Components.vc.X();
                                            }
                                            if (!(tLObject4 instanceof TLRPC.TL_payments_paymentResult)) {
                                                if (tL_error4 != null) {
                                                    c10 = 0;
                                                    if ("BALANCE_TOO_LOW".equals(tL_error4.text)) {
                                                        if (!MessagesController.getInstance(haVar4.f1413a).starsPurchaseAvailable()) {
                                                            l4Var5.run(Boolean.FALSE, null);
                                                            ha.e0(context6, g6Var4);
                                                            return;
                                                        }
                                                        boolean[] zArr = {false};
                                                        dd ddVar = new dd(context6, g6Var4, j16, 6, str6, new s8(haVar4, zArr, starGift5, z19, z20, j17, tL_textWithEntities5, l4Var5), 0L);
                                                        ddVar.setOnDismissListener(new z3(l4Var5, zArr, 1));
                                                        ddVar.show();
                                                        return;
                                                    }
                                                } else {
                                                    c10 = 0;
                                                }
                                                if (tL_error4 != null && "STARGIFT_USAGE_LIMITED".equals(tL_error4.text)) {
                                                    l4Var5.run(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                                                    return;
                                                } else if (tL_error4 != null && "STARGIFT_USER_USAGE_LIMITED".equals(tL_error4.text)) {
                                                    l4Var5.run(Boolean.FALSE, "STARGIFT_USER_USAGE_LIMITED");
                                                    return;
                                                } else {
                                                    l4Var5.run(Boolean.FALSE, null);
                                                    int i12 = R.raw.error;
                                                    int i13 = R.string.UnknownErrorCode;
                                                    if (tL_error4 != null) {
                                                        str5 = tL_error4.text;
                                                    } else {
                                                        str5 = "FAILED_SEND_STARS";
                                                    }
                                                    Object[] objArr = new Object[1];
                                                    objArr[c10] = str5;
                                                    i2.o1.t(i13, objArr, X, i12, 36);
                                                    return;
                                                }
                                            }
                                            Utilities.stageQueue.postRunnable(new p8(haVar4, (TLRPC.TL_payments_paymentResult) tLObject4, 1));
                                            haVar4.D = false;
                                            haVar4.E = true;
                                            haVar4.G = 0L;
                                            haVar4.V();
                                            haVar4.Q(j17);
                                            haVar4.T(true);
                                            l4Var5.run(Boolean.TRUE, null);
                                            if (BirthdayController.getInstance(haVar4.f1413a).contains(j17)) {
                                                i11 = 0;
                                                MessagesController.getInstance(haVar4.f1413a).getMainSettings().edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j17, false).apply();
                                            } else {
                                                i11 = 0;
                                            }
                                            if (starGift5 != null && starGift5.limited_per_user) {
                                                int i14 = starGift5.per_user_remains - 1;
                                                starGift5.per_user_remains = i14;
                                                spannableStringBuilder = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2SentRemainsLimit", Math.max(i11, i14)));
                                            } else {
                                                spannableStringBuilder = null;
                                            }
                                            if (j17 < 0) {
                                                long j18 = -j17;
                                                TLRPC.ChatFull chatFull = MessagesController.getInstance(haVar4.f1413a).getChatFull(j18);
                                                if (chatFull != null) {
                                                    chatFull.stargifts_count++;
                                                    chatFull.flags2 |= 262144;
                                                    MessagesController.getInstance(haVar4.f1413a).putChatFull(chatFull);
                                                }
                                                if (R instanceof ProfileActivity) {
                                                    ProfileActivity profileActivity = (ProfileActivity) R;
                                                    if (profileActivity.a() == j17) {
                                                        qz0 qz0Var = profileActivity.O;
                                                        if (qz0Var != null) {
                                                            qz0Var.A1(true);
                                                            profileActivity.O.b1(14);
                                                            r52 = 0;
                                                            profileActivity.I4(false);
                                                        } else {
                                                            r52 = 0;
                                                        }
                                                        org.telegram.ui.Components.vc a02 = org.telegram.ui.Components.vc.a0(R);
                                                        TLRPC.Document document = starGift5.sticker;
                                                        String string = LocaleController.getString(R.string.StarsGiftCompleted);
                                                        if (spannableStringBuilder == null) {
                                                            Object[] objArr2 = new Object[1];
                                                            objArr2[r52] = str6;
                                                            spannableStringBuilder = AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftCompletedChannelText", (int) j16, objArr2));
                                                        }
                                                        a02.s(document, string, spannableStringBuilder).k(r52);
                                                    }
                                                }
                                                Bundle bundle = new Bundle();
                                                bundle.putLong("chat_id", j18);
                                                bundle.putBoolean("open_gifts", true);
                                                ProfileActivity profileActivity2 = new ProfileActivity(bundle, null);
                                                profileActivity2.whenFullyVisible(new z(profileActivity2, starGift5, spannableStringBuilder, j16, str6, 5));
                                                R.presentFragment(profileActivity2);
                                            } else {
                                                SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
                                                if ((R instanceof sn) && ((sn) R).a() == j17) {
                                                    org.telegram.ui.Components.vc a03 = org.telegram.ui.Components.vc.a0(R);
                                                    TLRPC.Document document2 = starGift5.sticker;
                                                    String string2 = LocaleController.getString(R.string.StarsGiftCompleted);
                                                    if (spannableStringBuilder2 != null) {
                                                        replaceTags = spannableStringBuilder2;
                                                    } else {
                                                        replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftCompletedText", (int) j16, new Object[0]));
                                                    }
                                                    a03.s(document2, string2, replaceTags).k(true);
                                                } else {
                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(haVar4.f1413a);
                                                    int i15 = NotificationCenter.closeProfileActivity;
                                                    Long valueOf = Long.valueOf(j17);
                                                    Boolean bool = Boolean.FALSE;
                                                    notificationCenter.lambda$postNotificationNameOnUIThread$1(i15, valueOf, bool);
                                                    NotificationCenter.getInstance(haVar4.f1413a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChatActivity, Long.valueOf(j17), bool);
                                                    sn W9 = sn.W9(j17);
                                                    W9.whenFullyVisible(new c3(W9, starGift5, spannableStringBuilder2, j16, 6));
                                                    R.presentFragment(W9);
                                                }
                                            }
                                            MessagesController.getInstance(haVar4.f1413a).getMainSettings().edit().putBoolean("show_gift_for_" + j17, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j17, true).apply();
                                            LaunchActivity launchActivity = LaunchActivity.I1;
                                            if (launchActivity != null && (pa0Var = launchActivity.f33503x0) != null) {
                                                pa0Var.c(true);
                                            }
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });
        }
    }

    public final void i0(final long j10, final long j11, boolean z10, final boolean z11) {
        TL_account.toggleNoPaidMessagesException togglenopaidmessagesexception = new TL_account.toggleNoPaidMessagesException();
        int i10 = this.f1413a;
        togglenopaidmessagesexception.user_id = MessagesController.getInstance(i10).getInputUser(j10);
        if (j11 != 0) {
            togglenopaidmessagesexception.parent_peer = MessagesController.getInstance(i10).getInputPeer(j11);
        }
        togglenopaidmessagesexception.refund_charged = z10;
        togglenopaidmessagesexception.require_payment = !z11;
        ConnectionsManager.getInstance(i10).sendRequest(togglenopaidmessagesexception, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                AndroidUtilities.runOnUIThread(new j9(ha.this, tLObject, j11, j10, z11));
            }
        });
    }

    public final boolean j() {
        if (!this.f1414b) {
            return false;
        }
        if (fi.g.C0()) {
            return true;
        }
        TL_stars.StarsAmount p5 = p();
        if (p5.nanos == 0 && p5.amount == 0) {
            return false;
        }
        return true;
    }

    public final void j0(String str, TLRPC.ChatInvite chatInvite, Utilities.Callback2 callback2) {
        String str2;
        if (chatInvite != null && chatInvite.subscription_pricing != null) {
            Context context = LaunchActivity.I1;
            if (context == null) {
                context = ApplicationLoader.applicationContext;
            }
            Context context2 = context;
            org.telegram.ui.ActionBar.g6 I = I();
            long j10 = chatInvite.subscription_pricing.amount;
            if (context2 != null) {
                int i10 = UserConfig.selectedAccount;
                boolean[] zArr = {false};
                o9 o9Var = new o9(this, j10, i10, zArr, callback2, context2, I, chatInvite, str);
                a1.f fVar = new a1.f(this, zArr, callback2);
                org.telegram.ui.ActionBar.h3 j11 = tl.j(1, context2, I, false);
                LinearLayout e = tl.e(context2, 1);
                e.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
                FrameLayout frameLayout = new FrameLayout(context2);
                frameLayout.addView(new lc(context2, 40, 0), w7.z5.c(-1.0f, -1));
                org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(context2);
                u9Var.setRoundRadius(AndroidUtilities.dp(80.0f));
                org.telegram.ui.Components.f9 f9Var = new org.telegram.ui.Components.f9((org.telegram.ui.ActionBar.g6) null);
                f9Var.s(chatInvite.color);
                String str3 = chatInvite.title;
                f9Var.A = true;
                f9Var.f26243n = 0;
                f9Var.f26242m = false;
                org.telegram.ui.Components.f9.a(str3, null, null, f9Var.f26246q);
                TLRPC.Photo photo = chatInvite.photo;
                if (photo != null) {
                    u9Var.h(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(80.0f)), chatInvite.photo), "80_80", f9Var, chatInvite);
                } else {
                    u9Var.setImageDrawable(f9Var);
                }
                frameLayout.addView(u9Var, w7.z5.e(80, 80, 17));
                Drawable drawable = context2.getResources().getDrawable(R.drawable.star_small_outline);
                int i11 = org.telegram.ui.ActionBar.k6.f21255h5;
                org.telegram.ui.ActionBar.r6.z(frameLayout, drawable, i11, I, PorterDuff.Mode.SRC_IN);
                Drawable drawable2 = context2.getResources().getDrawable(R.drawable.star_small_inner);
                ImageView imageView = new ImageView(context2);
                imageView.setImageDrawable(drawable);
                frameLayout.addView(imageView, w7.z5.e(26, 26, 17));
                imageView.setTranslationX(AndroidUtilities.dp(26.0f));
                imageView.setTranslationY(AndroidUtilities.dp(26.0f));
                imageView.setScaleX(1.2f);
                imageView.setScaleY(1.2f);
                ImageView imageView2 = new ImageView(context2);
                imageView2.setImageDrawable(drawable2);
                frameLayout.addView(imageView2, w7.z5.e(26, 26, 17));
                imageView2.setTranslationX(AndroidUtilities.dp(26.0f));
                imageView2.setTranslationY(AndroidUtilities.dp(26.0f));
                bd bdVar = new bd(context2, i10, I);
                w7.b6.a(bdVar);
                bdVar.setOnClickListener(new bb(bdVar, 1));
                frameLayout.addView(bdVar, w7.z5.d(-2, -2.0f, 53, 0.0f, 0.0f, -8.0f, 0.0f));
                e.addView(frameLayout, w7.z5.q(-1, 117, 7));
                TextView g10 = org.telegram.messenger.v0.g(context2, 1, 20.0f);
                g10.setTypeface(AndroidUtilities.bold());
                int i12 = org.telegram.ui.ActionBar.k6.f21290j5;
                org.telegram.ui.ActionBar.r6.W(g10, i12, I);
                tl.m(R.string.StarsSubscribeTitle, g10, 17);
                TextView f7 = tl.f(e, g10, w7.z5.t(-2, -2, 1, 0, 8, 0, 0), context2);
                f7.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.r6.W(f7, i12, I);
                TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                int i13 = tL_starsSubscriptionPricing.period;
                if (i13 == 2592000) {
                    f7.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscribeText", (int) tL_starsSubscriptionPricing.amount, chatInvite.title)));
                } else {
                    if (i13 == 300) {
                        str2 = "5 minutes";
                    } else {
                        str2 = "a minute";
                    }
                    f7.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscribeTextTest", (int) tL_starsSubscriptionPricing.amount, chatInvite.title, str2)));
                }
                f7.setMaxWidth(ei.x3.a(f7.getText(), f7.getPaint()));
                f7.setGravity(17);
                e.addView(f7, w7.z5.t(-2, -2, 1, 0, 6, 0, 22));
                if (!TextUtils.isEmpty(chatInvite.about)) {
                    TextView textView = new TextView(context2);
                    textView.setTextSize(1, 14.0f);
                    org.telegram.ui.ActionBar.r6.W(textView, i12, I);
                    textView.setText(Emoji.replaceEmoji(chatInvite.about, textView.getPaint().getFontMetricsInt(), false));
                    textView.setGravity(17);
                    e.addView(textView, w7.z5.t(-2, -2, 1, 0, 6, 0, 22));
                }
                ei.d dVar = new ei.d(context2, I, true);
                dVar.i(LocaleController.getString(R.string.StarsSubscribeButton), false, true);
                e.addView(dVar, w7.z5.n(-1, 48));
                w90 w90Var = new w90(context2, I);
                w90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsSubscribeInfo), new sa(context2, 5)));
                w90Var.setGravity(17);
                w90Var.setTextSize(1, 13.0f);
                org.telegram.ui.ActionBar.r6.W(w90Var, org.telegram.ui.ActionBar.k6.B6, I);
                org.telegram.ui.ActionBar.r6.I(w90Var, org.telegram.ui.ActionBar.k6.f21243gc, I);
                e.addView(w90Var, w7.z5.t(-1, -2, 49, 14, 14, 14, 6));
                j11.customView = e;
                dVar.setOnClickListener(new v0(o9Var, j11, dVar, 2));
                j11.setOnDismissListener(new cb(fVar, 2));
                j11.fixNavigationBarKey(i11);
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (!AndroidUtilities.isTablet() && U != null && !AndroidUtilities.hasDialogOnTop(U)) {
                    j11.makeAttached(U);
                }
                j11.show();
            }
        }
    }

    public final void k0(TL_stars.StarsAmount starsAmount) {
        boolean equals = this.f1416f.equals(starsAmount);
        int i10 = this.f1413a;
        if (!equals) {
            this.f1416f = starsAmount;
            this.f1417g = 0L;
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        } else if (this.f1417g != 0) {
            this.f1417g = 0L;
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        }
    }

    public final void l0(final MessageObject messageObject, final long j10, final Runnable runnable, final boolean z10) {
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia;
        if (messageObject == null) {
            runnable.run();
            return;
        }
        final long dialogId = messageObject.getDialogId();
        final int id2 = messageObject.getId();
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia2 = (TLRPC.TL_messageMediaPaidMedia) messageObject.messageOwner.media;
        TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
        int i10 = this.f1413a;
        tL_messages_editMessage.peer = MessagesController.getInstance(i10).getInputPeer(dialogId);
        int i11 = tL_messages_editMessage.flags;
        tL_messages_editMessage.flags = 32768 | i11;
        tL_messages_editMessage.schedule_date = messageObject.messageOwner.date;
        tL_messages_editMessage.f20427id = id2;
        tL_messages_editMessage.flags = i11 | 49152;
        TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia = new TLRPC.TL_inputMediaPaidMedia();
        tL_inputMediaPaidMedia.stars_amount = j10;
        int i12 = 0;
        while (i12 < tL_messageMediaPaidMedia2.extended_media.size()) {
            TLRPC.MessageExtendedMedia messageExtendedMedia = tL_messageMediaPaidMedia2.extended_media.get(i12);
            if (!(messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia)) {
                runnable.run();
                return;
            }
            TLRPC.MessageMedia messageMedia = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
            if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto = new TLRPC.TL_inputMediaPhoto();
                TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                TLRPC.Photo photo = ((TLRPC.TL_messageMediaPhoto) messageMedia).photo;
                tL_messageMediaPaidMedia = tL_messageMediaPaidMedia2;
                tL_inputPhoto.f20363id = photo.f20368id;
                tL_inputPhoto.access_hash = photo.access_hash;
                tL_inputPhoto.file_reference = photo.file_reference;
                tL_inputMediaPhoto.f20407id = tL_inputPhoto;
                tL_inputMediaPaidMedia.extended_media.add(tL_inputMediaPhoto);
            } else {
                tL_messageMediaPaidMedia = tL_messageMediaPaidMedia2;
                if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument = new TLRPC.TL_inputMediaDocument();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) messageMedia).document;
                    tL_inputDocument.f20356id = document.f20350id;
                    tL_inputDocument.access_hash = document.access_hash;
                    tL_inputDocument.file_reference = document.file_reference;
                    tL_inputMediaDocument.f20405id = tL_inputDocument;
                    tL_inputMediaPaidMedia.extended_media.add(tL_inputMediaDocument);
                }
            }
            i12++;
            tL_messageMediaPaidMedia2 = tL_messageMediaPaidMedia;
        }
        tL_messages_editMessage.media = tL_inputMediaPaidMedia;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_editMessage, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                AndroidUtilities.runOnUIThread(new q9(ha.this, tLObject, runnable, tL_error, z10, dialogId, id2, messageObject, j10));
            }
        });
    }

    public final TL_stars.SavedStarGift n(long j10) {
        TL_stars.StarGift starGift;
        int i10 = 0;
        while (true) {
            LongSparseArray longSparseArray = this.L;
            if (i10 < longSparseArray.size()) {
                y9 y9Var = (y9) longSparseArray.valueAt(i10);
                for (int i11 = 0; i11 < y9Var.f2511l.size(); i11++) {
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) y9Var.f2511l.get(i11);
                    if (savedStarGift != null && (starGift = savedStarGift.gift) != null && starGift.f20568id == j10) {
                        return savedStarGift;
                    }
                }
                i10++;
            } else {
                return null;
            }
        }
    }

    public final TL_stars.StarsAmount p() {
        return q(true, false, null);
    }

    public final TL_stars.StarsAmount q(boolean z10, boolean z11, Runnable runnable) {
        if (((!this.e || System.currentTimeMillis() - this.f1415c > 60000) && !this.d) || z11) {
            this.d = true;
            TL_stars.TL_payments_getStarsStatus tL_payments_getStarsStatus = new TL_stars.TL_payments_getStarsStatus();
            tL_payments_getStarsStatus.ton = this.f1414b;
            tL_payments_getStarsStatus.peer = new TLRPC.TL_inputPeerSelf();
            ConnectionsManager.getInstance(this.f1413a).sendRequest(tL_payments_getStarsStatus, new g(6, this, runnable));
        }
        if (z10 && this.f1417g > 0) {
            ag.a m10 = ag.a.m(this.f1416f);
            return ag.a.g(Math.max(0L, m10.a() - this.f1417g), m10.f631a).o();
        }
        return this.f1416f;
    }

    public final void r(Runnable runnable) {
        q(true, false, runnable);
    }

    public final ag.a s() {
        ag.b bVar;
        ag.a l4 = ag.a.l(p());
        if (l4 == null) {
            if (this.f1414b) {
                bVar = ag.b.f634b;
            } else {
                bVar = ag.b.f633a;
            }
            return ag.a.i(0L, bVar);
        }
        return l4;
    }

    public final ArrayList u() {
        if (!this.f1420k && !this.f1421l) {
            this.f1420k = true;
            ConnectionsManager.getInstance(this.f1413a).sendRequest(new TL_stars.TL_payments_getStarsGiftOptions(), new u8(this, 3));
            return this.f1422m;
        }
        return this.f1422m;
    }

    public final ArrayList v() {
        if (!this.f1423n && !this.f1424o) {
            this.f1423n = true;
            ConnectionsManager.getInstance(this.f1413a).sendRequest(new TL_stars.TL_payments_getStarsGiveawayOptions(), new u8(this, 4));
            return this.f1425p;
        }
        return this.f1425p;
    }

    public final ArrayList z() {
        if (!this.h && !this.f1418i) {
            this.h = true;
            ConnectionsManager.getInstance(this.f1413a).sendRequest(new TL_stars.TL_payments_getStarsTopupOptions(), new u8(this, 2));
            return this.f1419j;
        }
        return this.f1419j;
    }
}
