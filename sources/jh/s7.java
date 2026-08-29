package jh;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.y80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.hz0;
import org.telegram.ui.oa0;
import org.telegram.ui.th;
import org.telegram.ui.tn;
public final class s7 {
    public static volatile s7[][] S = (s7[][]) Array.newInstance(s7.class, 2, 4);
    public static final Object[][] T = (Object[][]) Array.newInstance(Object.class, 2, 4);
    public boolean A;
    public r7 B;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public long G;
    public o7 N;
    public final int f12787a;
    public final boolean f12788b;
    public long f12789c;
    public boolean d;
    public boolean f12790e;
    public long f12792g;
    public boolean h;
    public boolean f12793i;
    public ArrayList f12794j;
    public boolean f12795k;
    public boolean f12796l;
    public ArrayList f12797m;
    public boolean f12798n;
    public boolean f12799o;
    public ArrayList f12800p;
    public String f12806w;
    public boolean f12807x;
    public boolean f12808y;
    public TL_stars.StarsAmount f12791f = TL_stars.StarsAmount.ofStars(0);
    public final ArrayList[] f12801q = {new ArrayList(), new ArrayList(), new ArrayList()};
    public final boolean[] f12802r = new boolean[3];
    public final String[] f12803s = new String[3];
    public final boolean[] f12804t = new boolean[3];
    public final boolean[] f12805u = new boolean[3];
    public final ArrayList v = new ArrayList();
    public final ArrayList f12809z = new ArrayList();
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

    public s7(int i10, boolean z10) {
        this.f12787a = i10;
        this.f12788b = z10;
    }

    public static org.telegram.ui.ActionBar.c6 I() {
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U != null) {
            return U.getResourceProvider();
        }
        return null;
    }

    public static s7 L(int i10) {
        return y(i10, true);
    }

    public static boolean U(int i10, kf.a aVar) {
        if (aVar == null || x(i10, aVar.f13633a).s().f13634b >= aVar.f13634b) {
            return true;
        }
        return false;
    }

    public static void a(s7 s7Var, TL_stars.StarGifts starGifts) {
        ArrayList arrayList = s7Var.I;
        ArrayList arrayList2 = s7Var.J;
        int i10 = s7Var.f12787a;
        ArrayList arrayList3 = s7Var.H;
        s7Var.C = false;
        s7Var.D = true;
        if (starGifts instanceof TL_stars.TL_starGifts) {
            TL_stars.TL_starGifts tL_starGifts = (TL_stars.TL_starGifts) starGifts;
            MessagesController.getInstance(i10).putUsers(tL_starGifts.users, false);
            MessagesController.getInstance(i10).putChats(tL_starGifts.chats, false);
            MessagesStorage.getInstance(i10).putUsersAndChats(tL_starGifts.users, tL_starGifts.chats, true, true);
            arrayList3.clear();
            arrayList3.addAll(tL_starGifts.gifts);
            arrayList2.clear();
            arrayList2.addAll(arrayList3);
            Collections.sort(arrayList2, Comparator$EL.thenComparingInt(Comparator$CC.comparingInt(new jf.d(4)), new jf.d(5)));
            arrayList.clear();
            arrayList.addAll(arrayList3);
            Collections.sort(arrayList, Comparator$CC.comparingInt(new jf.d(6)));
            s7Var.F = tL_starGifts.hash;
            s7Var.G = System.currentTimeMillis();
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftsLoaded, new Object[0]);
            s7Var.c0(s7Var.F, s7Var.G, tL_starGifts.gifts);
        } else if (starGifts instanceof TL_stars.TL_starGiftsNotModified) {
            int i11 = s7Var.F;
            long currentTimeMillis = System.currentTimeMillis();
            s7Var.G = currentTimeMillis;
            s7Var.c0(i11, currentTimeMillis, arrayList3);
        }
    }

    public static void b(s7 s7Var, ArrayList arrayList, Integer num, Long l10, ArrayList arrayList2, ArrayList arrayList3) {
        int i10 = s7Var.f12787a;
        MessagesController.getInstance(i10).putUsers(arrayList2, true);
        MessagesController.getInstance(i10).putChats(arrayList3, true);
        s7Var.E = true;
        ArrayList arrayList4 = s7Var.H;
        arrayList4.clear();
        arrayList4.addAll(arrayList);
        ArrayList arrayList5 = s7Var.J;
        arrayList5.clear();
        arrayList5.addAll(arrayList4);
        Collections.sort(arrayList5, Comparator$EL.thenComparingInt(Comparator$CC.comparingInt(new jf.d(1)), new jf.d(2)));
        ArrayList arrayList6 = s7Var.I;
        arrayList6.clear();
        arrayList6.addAll(arrayList4);
        Collections.sort(arrayList6, Comparator$CC.comparingInt(new jf.d(3)));
        s7Var.F = num.intValue();
        s7Var.G = l10.longValue();
        s7Var.C = false;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftsLoaded, new Object[0]);
        s7Var.V();
    }

    public static void e(String str) {
        tc X;
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        if (R != null && R.visibleDialog == null) {
            X = tc.a0(R);
        } else {
            X = tc.X();
        }
        th.r(R.string.UnknownErrorCode, new Object[]{str}, X, R.raw.error, 36);
    }

    public static void e0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.StarsNotAvailableTitle);
        alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.StarsNotAvailableText);
        j7.l1.C(R.string.OK, alertDialog$Builder, null);
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
            return tL_messages_forwardMessages.allow_paid_stars / tL_messages_forwardMessages.f22478id.size();
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
        LaunchActivity launchActivity = LaunchActivity.C1;
        if (launchActivity != null && !launchActivity.isFinishing()) {
            return LaunchActivity.C1;
        }
        if (ApplicationLoader.applicationContext != null) {
            return ApplicationLoader.applicationContext;
        }
        return null;
    }

    public static s7 w(int i10) {
        return y(i10, false);
    }

    public static s7 x(int i10, kf.b bVar) {
        boolean z10;
        if (bVar == kf.b.f13636b) {
            z10 = true;
        } else {
            z10 = false;
        }
        return y(i10, z10);
    }

    public static s7 y(int i10, boolean z10) {
        s7 s7Var;
        s7 s7Var2 = S[z10 ? 1 : 0][i10];
        if (s7Var2 == null) {
            synchronized (T[z10 ? 1 : 0][i10]) {
                try {
                    s7Var = S[z10 ? 1 : 0][i10];
                    if (s7Var == null) {
                        s7[] s7VarArr = S[z10 ? 1 : 0];
                        s7 s7Var3 = new s7(i10, z10);
                        s7VarArr[i10] = s7Var3;
                        s7Var = s7Var3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return s7Var;
        }
        return s7Var2;
    }

    public final long A(m7 m7Var, TLRPC.TL_messageReactions tL_messageReactions) {
        Long l10;
        r7 r7Var = this.B;
        if (r7Var != null && r7Var.f12716a.equals(m7Var) && (l10 = this.B.f12727n) != null) {
            return l10.longValue();
        }
        Long myPaidReactionPeer = MessageObject.getMyPaidReactionPeer(tL_messageReactions);
        if (myPaidReactionPeer != null) {
            return myPaidReactionPeer.longValue();
        }
        Long paidReactionsDialogId = MessagesController.getInstance(this.f12787a).getPaidReactionsDialogId();
        if (paidReactionsDialogId != null) {
            return paidReactionsDialogId.longValue();
        }
        return 0L;
    }

    public final long B(MessageObject messageObject) {
        Long myPaidReactionPeer;
        Long l10;
        r7 r7Var = this.B;
        if (r7Var != null && r7Var.f12716a.equals(m7.b(messageObject)) && (l10 = this.B.f12727n) != null) {
            return l10.longValue();
        }
        if (messageObject == null) {
            myPaidReactionPeer = null;
        } else {
            myPaidReactionPeer = messageObject.getMyPaidReactionPeer();
        }
        if (myPaidReactionPeer != null) {
            return myPaidReactionPeer.longValue();
        }
        Long paidReactionsDialogId = MessagesController.getInstance(this.f12787a).getPaidReactionsDialogId();
        if (paidReactionsDialogId != null) {
            return paidReactionsDialogId.longValue();
        }
        return 0L;
    }

    public final void C(long j10, long j11, Utilities.Callback callback) {
        TL_account.getPaidMessagesRevenue getpaidmessagesrevenue = new TL_account.getPaidMessagesRevenue();
        int i10 = this.f12787a;
        getpaidmessagesrevenue.user_id = MessagesController.getInstance(i10).getInputUser(j10);
        if (j11 != 0) {
            getpaidmessagesrevenue.parent_peer = MessagesController.getInstance(i10).getInputPeer(j11);
        }
        ConnectionsManager.getInstance(i10).sendRequest(getpaidmessagesrevenue, new u6(0, callback));
    }

    public final long D(int i10, long j10) {
        r7 r7Var = this.B;
        if (r7Var != null) {
            m7 m7Var = r7Var.f12716a;
            if (m7Var.f12468a == j10 && m7Var.f12469b == i10 && r7Var.f12725l) {
                return r7Var.h;
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

    public final i7 F(long j10, boolean z10) {
        LongSparseArray longSparseArray = this.K;
        i7 i7Var = (i7) longSparseArray.get(j10);
        if (i7Var == null && z10) {
            i7 i7Var2 = new i7(this.f12787a, j10);
            longSparseArray.put(j10, i7Var2);
            return i7Var2;
        }
        return i7Var;
    }

    public final k7 G(long j10, boolean z10) {
        LongSparseArray longSparseArray = this.L;
        k7 k7Var = (k7) longSparseArray.get(j10);
        if (k7Var == null && z10) {
            k7 k7Var2 = new k7(this.f12787a, j10, true);
            longSparseArray.put(j10, k7Var2);
            return k7Var2;
        }
        return k7Var;
    }

    public final void H(TL_stars.StarGift starGift, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, Utilities.Callback callback) {
        Context context = LaunchActivity.C1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        org.telegram.ui.ActionBar.c6 I = I();
        if (starGift != null && context != null) {
            if (!this.f12790e) {
                r(new c2(this, callback, starGift, j10));
                return;
            }
            TLRPC.TL_inputInvoiceStarGiftResale tL_inputInvoiceStarGiftResale = new TLRPC.TL_inputInvoiceStarGiftResale();
            tL_inputInvoiceStarGiftResale.slug = starGift.slug;
            tL_inputInvoiceStarGiftResale.to_id = MessagesController.getInstance(this.f12787a).getInputPeer(j10);
            tL_inputInvoiceStarGiftResale.ton = this.f12788b;
            tL_inputInvoiceStarGiftResale.message = tL_textWithEntities;
            tL_inputInvoiceStarGiftResale.show_name = !z10;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject p10 = ph.p2.p(I, false);
            if (p10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = p10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftResale;
            ConnectionsManager.getInstance(this.f12787a).sendRequest(tL_payments_getPaymentForm, new bg.h3(9, this, callback));
        }
    }

    public final TL_stars.StarGift J(long j10) {
        V();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i10 < arrayList.size()) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList.get(i10);
                if (starGift.f22619id == j10) {
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
        ConnectionsManager.getInstance(this.f12787a).sendRequest(getstargiftupgradepreview, new eg.d0(this, j10, callback, 1));
    }

    public final void M(TL_stars.InputSavedStarGift inputSavedStarGift, Utilities.Callback callback) {
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(ApplicationLoader.applicationContext, 3, null);
        c2Var.q(200L);
        TL_stars.getSavedStarGift getsavedstargift = new TL_stars.getSavedStarGift();
        getsavedstargift.stargift.add(inputSavedStarGift);
        ConnectionsManager.getInstance(this.f12787a).sendRequest(getsavedstargift, new ih.c1(this, c2Var, inputSavedStarGift, callback, 3));
    }

    public final boolean N() {
        return O(0);
    }

    public final boolean O(int i10) {
        if (this.f12790e && !this.f12801q[i10].isEmpty()) {
            return true;
        }
        return false;
    }

    public final void P() {
        this.f12790e = false;
        p();
        this.f12790e = true;
    }

    public final void Q(long j10) {
        k7 G = G(j10, false);
        if (G != null) {
            G.i(false);
        }
        i7 i7Var = (i7) this.K.get(j10);
        if (i7Var != null) {
            i7Var.g();
        }
    }

    public final void R(TLRPC.UserFull userFull) {
        long j10 = userFull.f22540id;
        k7 G = G(j10, false);
        if (G != null && G.f12389n != userFull.stargifts_count) {
            G.i(false);
        }
        i7 i7Var = (i7) this.K.get(j10);
        if (i7Var != null) {
            i7Var.g();
        }
    }

    public final void S() {
        if (this.f12807x) {
            return;
        }
        this.v.clear();
        this.f12806w = null;
        this.f12807x = false;
        this.f12808y = false;
        W();
    }

    public final void T(boolean z10) {
        for (int i10 = 0; i10 < 3; i10++) {
            boolean[] zArr = this.f12804t;
            if (!zArr[i10]) {
                this.f12801q[i10].clear();
                this.f12803s[i10] = null;
                zArr[i10] = false;
                this.f12805u[i10] = false;
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
                int i10 = this.f12787a;
                if (!z10) {
                    eg.n nVar = new eg.n(this, 22);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
                    messagesStorage.getStorageQueue().postRunnable(new eg.k0(messagesStorage, arrayList3, arrayList2, arrayList, nVar, 9));
                    return;
                }
                int i11 = this.F;
                ag.i0 i0Var = new ag.i0(this, 21);
                TL_stars.getStarGifts getstargifts = new TL_stars.getStarGifts();
                getstargifts.hash = i11;
                ConnectionsManager.getInstance(i10).sendRequest(getstargifts, new ef.a(i0Var, 8));
            }
        }
    }

    public final void W() {
        if (!this.f12788b && !this.f12807x && !this.f12808y) {
            this.f12807x = true;
            TL_stars.TL_getStarsSubscriptions tL_getStarsSubscriptions = new TL_stars.TL_getStarsSubscriptions();
            tL_getStarsSubscriptions.peer = new TLRPC.TL_inputPeerSelf();
            String str = this.f12806w;
            tL_getStarsSubscriptions.offset = str;
            if (str == null) {
                tL_getStarsSubscriptions.offset = "";
            }
            ConnectionsManager.getInstance(this.f12787a).sendRequest(tL_getStarsSubscriptions, new j6(this, 1));
        }
    }

    public final void X(int i10) {
        boolean z10;
        boolean[] zArr = this.f12804t;
        if (!zArr[i10] && !this.f12805u[i10]) {
            boolean z11 = true;
            zArr[i10] = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
            tL_payments_getStarsTransactions.ton = this.f12788b;
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
            String str = this.f12803s[i10];
            tL_payments_getStarsTransactions.offset = str;
            if (str == null) {
                tL_payments_getStarsTransactions.offset = "";
            }
            ConnectionsManager.getInstance(this.f12787a).sendRequest(tL_payments_getStarsTransactions, new s1(this, i10, 1));
        }
    }

    public final void Y(org.telegram.messenger.MessageObject r39, org.telegram.tgnet.TLRPC.InputInvoice r40, org.telegram.tgnet.TLRPC.TL_payments_paymentFormStars r41, java.lang.Runnable r42, org.telegram.messenger.Utilities.Callback r43) {
        throw new UnsupportedOperationException("Method not decompiled: jh.s7.Y(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$InputInvoice, org.telegram.tgnet.TLRPC$TL_payments_paymentFormStars, java.lang.Runnable, org.telegram.messenger.Utilities$Callback):void");
    }

    public final void Z(final String str, final TLRPC.ChatInvite chatInvite, final Utilities.Callback2 callback2) {
        if (chatInvite != null && chatInvite.subscription_pricing != null) {
            final Context context = ApplicationLoader.applicationContext;
            final org.telegram.ui.ActionBar.c6 I = I();
            if (context != null) {
                final long j10 = chatInvite.subscription_pricing.amount;
                final String str2 = chatInvite.title;
                TLRPC.TL_inputInvoiceChatInviteSubscription tL_inputInvoiceChatInviteSubscription = new TLRPC.TL_inputInvoiceChatInviteSubscription();
                tL_inputInvoiceChatInviteSubscription.hash = str;
                TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                tL_payments_sendStarsForm.form_id = chatInvite.subscription_form_id;
                tL_payments_sendStarsForm.invoice = tL_inputInvoiceChatInviteSubscription;
                ConnectionsManager.getInstance(this.f12787a).sendRequest(tL_payments_sendStarsForm, new RequestDelegate() {
                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        final s7 s7Var = s7.this;
                        final Utilities.Callback2 callback22 = callback2;
                        final long j11 = j10;
                        final String str3 = str2;
                        final Context context2 = context;
                        final org.telegram.ui.ActionBar.c6 c6Var = I;
                        final TLRPC.ChatInvite chatInvite2 = chatInvite;
                        final String str4 = str;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                tc X;
                                String str5;
                                long j12;
                                oa0 oa0Var;
                                s7 s7Var2 = s7.this;
                                TLObject tLObject2 = tLObject;
                                Utilities.Callback2 callback23 = callback22;
                                long j13 = j11;
                                String str6 = str3;
                                TLRPC.TL_error tL_error2 = tL_error;
                                Context context3 = context2;
                                org.telegram.ui.ActionBar.c6 c6Var2 = c6Var;
                                TLRPC.ChatInvite chatInvite3 = chatInvite2;
                                String str7 = str4;
                                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                                if (!AndroidUtilities.hasDialogOnTop(R)) {
                                    X = tc.a0(R);
                                } else {
                                    X = tc.X();
                                }
                                if (tLObject2 instanceof TLRPC.TL_payments_paymentResult) {
                                    TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject2;
                                    Utilities.stageQueue.postRunnable(new f6(s7Var2, tL_payments_paymentResult, 0));
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
                                    LaunchActivity launchActivity = LaunchActivity.C1;
                                    if (launchActivity != null && (oa0Var = launchActivity.f35599t0) != null) {
                                        oa0Var.c(true);
                                    }
                                    s7Var2.T(true);
                                    s7Var2.S();
                                } else if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                                    if (!MessagesController.getInstance(s7Var2.f12787a).starsPurchaseAvailable()) {
                                        callback23.run(0L, Boolean.FALSE);
                                        s7.e0(context3, c6Var2);
                                        return;
                                    }
                                    boolean[] zArr = {false};
                                    y9 y9Var = new y9(context3, c6Var2, j13, 1, chatInvite3.title, new eg.k0(s7Var2, zArr, str7, chatInvite3, callback23, 8), 0L);
                                    y9Var.setOnDismissListener(new g6(callback23, zArr, 0));
                                    y9Var.show();
                                } else {
                                    callback23.run(0L, Boolean.FALSE);
                                    int i11 = R.raw.error;
                                    int i12 = R.string.UnknownErrorCode;
                                    if (tL_error2 != null) {
                                        str5 = tL_error2.text;
                                    } else {
                                        str5 = "FAILED_SEND_STARS";
                                    }
                                    th.r(i12, new Object[]{str5}, X, i11, 36);
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
            final org.telegram.ui.ActionBar.c6 I = I();
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
                if (j10 < 0 && messageObject.getFromChatId() > 0 && (user = MessagesController.getInstance(this.f12787a).getUser(Long.valueOf(messageObject.getFromChatId()))) != null && user.bot) {
                    j10 = user.f22539id;
                }
            } else {
                j10 = tL_payments_paymentFormStars.bot_id;
            }
            final long j12 = j10;
            if (j12 >= 0) {
                str = UserObject.getUserName(MessagesController.getInstance(this.f12787a).getUser(Long.valueOf(j12)));
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(this.f12787a).getChat(Long.valueOf(-j12));
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
            ConnectionsManager.getInstance(this.f12787a).sendRequest(tL_payments_sendStarsForm, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    final s7 s7Var = s7.this;
                    final Utilities.Callback callback2 = callback;
                    final MessageObject messageObject2 = messageObject;
                    final Context context2 = context;
                    final long j13 = j11;
                    final String str4 = str2;
                    final int i12 = i11;
                    final String str5 = str3;
                    final TLRPC.InputInvoice inputInvoice2 = inputInvoice;
                    final long j14 = j12;
                    final org.telegram.ui.ActionBar.c6 c6Var = I;
                    final TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars2 = tL_payments_paymentFormStars;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            throw new UnsupportedOperationException("Method not decompiled: jh.d7.run():void");
                        }
                    });
                }
            });
        }
    }

    public final void b0(long j10, long j11, boolean z10) {
        int i10 = this.f12787a;
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
                this.R.put(Integer.valueOf(id2), new androidx.car.app.utils.b(this, hashSet, runnable, 28));
                z10 = true;
            }
        }
        return !z10;
    }

    public final void c0(int i10, long j10, ArrayList arrayList) {
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.f12787a);
        messagesStorage.getStorageQueue().postRunnable(new v6(messagesStorage, j10, arrayList, i10));
    }

    public final void d(org.telegram.messenger.MessageObject r18) {
        throw new UnsupportedOperationException("Method not decompiled: jh.s7.d(org.telegram.messenger.MessageObject):void");
    }

    public final r7 d0(final MessageObject messageObject, final tn tnVar, final long j10, boolean z10, boolean z11, final Long l10) {
        long j11;
        s7 s7Var;
        boolean z12;
        String str;
        m7 b10 = m7.b(messageObject);
        int i10 = this.f12787a;
        s7 y8 = y(i10, false);
        Context t10 = t(tnVar);
        if (t10 == null) {
            return null;
        }
        String str2 = "";
        if (z11 && y8.f12790e && y8.q(false, false, null).amount <= 0) {
            long a2 = tnVar.a();
            if (a2 >= 0) {
                str2 = UserObject.getForcedFirstName(tnVar.getMessagesController().getUser(Long.valueOf(a2)));
            } else {
                TLRPC.Chat chat = tnVar.getMessagesController().getChat(Long.valueOf(-a2));
                if (chat != null) {
                    str2 = chat.title;
                }
            }
            new y9(t10, tnVar.getResourceProvider(), j10, 5, str2, new Runnable(this) {
                public final s7 f12565b;

                {
                    this.f12565b = this;
                }

                @Override
                public final void run() {
                    switch (r7) {
                        case 0:
                            this.f12565b.d0(messageObject, tnVar, j10, true, true, l10);
                            return;
                        default:
                            this.f12565b.d0(messageObject, tnVar, j10, true, true, l10);
                            return;
                    }
                }
            }, 0L).show();
            return null;
        }
        r7 r7Var = this.B;
        if (r7Var != null && r7Var.f12716a.equals(b10)) {
            j11 = 0;
            s7Var = this;
        } else {
            r7 r7Var2 = this.B;
            if (r7Var2 != null) {
                r7Var2.b();
            }
            ConnectionsManager.getInstance(i10).getCurrentTime();
            j11 = 0;
            s7Var = this;
            r7 r7Var3 = new r7(s7Var, b10, messageObject, tnVar, z10);
            s7Var.B = r7Var3;
            r7Var3.f12727n = l10;
        }
        if (s7Var.B.h + j10 > MessagesController.getInstance(i10).starsPaidReactionAmountMax) {
            s7Var.B.b();
            ConnectionsManager.getInstance(i10).getCurrentTime();
            s7Var.B = new r7(s7Var, b10, messageObject, tnVar, z10);
        }
        final long j12 = s7Var.B.h + j10;
        if (z11 && y8.f12790e && y8.q(false, false, null).amount < j12) {
            s7Var.B.a();
            long a10 = tnVar.a();
            if (a10 >= j11) {
                str = UserObject.getForcedFirstName(tnVar.getMessagesController().getUser(Long.valueOf(a10)));
            } else {
                TLRPC.Chat chat2 = tnVar.getMessagesController().getChat(Long.valueOf(-a10));
                if (chat2 != null) {
                    str2 = chat2.title;
                }
                str = str2;
            }
            new y9(t10, tnVar.getResourceProvider(), j12, 5, str, new Runnable(s7Var) {
                public final s7 f12565b;

                {
                    this.f12565b = s7Var;
                }

                @Override
                public final void run() {
                    switch (r7) {
                        case 0:
                            this.f12565b.d0(messageObject, tnVar, j12, true, true, l10);
                            return;
                        default:
                            this.f12565b.d0(messageObject, tnVar, j12, true, true, l10);
                            return;
                    }
                }
            }, 0L).show();
            return null;
        }
        r7 r7Var4 = s7Var.B;
        if ((messageObject != null && !messageObject.doesPaidReactionExist()) || z10) {
            z12 = true;
        } else {
            z12 = false;
        }
        p7 p7Var = r7Var4.f12729p;
        s7 s7Var2 = r7Var4.f12730q;
        int i11 = s7Var2.f12787a;
        gc gcVar = r7Var4.f12719e;
        MessageObject messageObject2 = r7Var4.f12717b;
        if (!r7Var4.f12722i && !r7Var4.f12723j) {
            r7Var4.h += j10;
            System.currentTimeMillis();
            gcVar.f28866c.a();
            gcVar.f28866c.c(AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSentText", (int) r7Var4.h, new Object[0])), true, true);
            if (r7Var4.f12726m) {
                r7Var4.f12720f.f28371b = 5000L;
                AndroidUtilities.cancelRunOnUIThread(p7Var);
                AndroidUtilities.runOnUIThread(p7Var, 5000L);
            }
            if (z12) {
                r7Var4.f12725l = true;
                messageObject2.addPaidReactions((int) j10, true, r7Var4.c());
                s7Var2.f12792g += j10;
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject2.getDialogId()), Integer.valueOf(messageObject2.getId()), messageObject2.messageOwner.reactions);
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
            } else {
                r7Var4.f12725l = false;
                if (messageObject2.ensurePaidReactionsExist(true)) {
                    r7Var4.f12724k--;
                }
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject2.getDialogId()), Integer.valueOf(messageObject2.getId()), messageObject2.messageOwner.reactions);
                r7Var4.f12724k += j10;
            }
            gcVar.f28865b.setText(r7Var4.d());
        } else if (BuildVars.DEBUG_PRIVATE_VERSION) {
            throw new RuntimeException("adding more amount to committed reactions");
        }
        r7 r7Var5 = s7Var.B;
        r7Var5.f12727n = l10;
        return r7Var5;
    }

    public final void f(Activity activity, TL_stars.TL_starsTopupOption tL_starsTopupOption, Utilities.Callback2 callback2, TLRPC.InputPeer inputPeer) {
        boolean z10;
        if (activity == null) {
            return;
        }
        int i10 = this.f12787a;
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
            JSONObject p10 = ph.p2.p(I(), false);
            if (p10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = p10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
            ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getPaymentForm, new eg.z(this, callback2, tL_inputInvoiceStars, 9));
        } else if (!BillingController.getInstance().isReady()) {
            callback2.run(Boolean.FALSE, "INVOICE DISABLED");
        } else {
            TLRPC.TL_inputStorePaymentStarsTopup tL_inputStorePaymentStarsTopup2 = new TLRPC.TL_inputStorePaymentStarsTopup();
            tL_inputStorePaymentStarsTopup2.stars = tL_starsTopupOption.stars;
            tL_inputStorePaymentStarsTopup2.currency = tL_starsTopupOption.currency;
            tL_inputStorePaymentStarsTopup2.amount = tL_starsTopupOption.amount;
            d9.c cVar = new d9.c();
            cVar.f5537c = "inapp";
            cVar.f5536b = tL_starsTopupOption.store_product;
            p2.o a2 = cVar.a();
            FileLog.d("StarsController.buy starts queryProductDetails");
            BillingController.getInstance().queryProductDetails(Arrays.asList(a2), new a1.d(callback2, tL_inputStorePaymentStarsTopup2, tL_starsTopupOption, activity, 2));
        }
    }

    public final void f0(List list) {
        if (list != null && !list.isEmpty()) {
            MessageObject messageObject = (MessageObject) list.get(0);
            long dialogId = messageObject.getDialogId();
            int i10 = this.f12787a;
            if (dialogId >= 0) {
                MessagesController.getInstance(i10).loadFullUser(MessagesController.getInstance(i10).getUser(Long.valueOf(dialogId)), 0, true);
            } else {
                MessagesController.getInstance(i10).loadFullChat(-dialogId, 0, true);
            }
            tc.a0(LaunchActivity.U()).Q(R.raw.error, 36, ia.Q0(TextUtils.concat(LocaleController.formatPluralString("PaidMessagesSendErrorToast1", (int) messageObject.messageOwner.errorAllowedPriceStars, new Object[0]), " ", LocaleController.formatPluralString("PaidMessagesSendErrorToast2", (int) messageObject.messageOwner.errorNewPriceStars, new Object[0])))).j();
        }
    }

    public final void g(final long j10, final TLObject tLObject, final TLRPC.TL_textWithEntities tL_textWithEntities, final Utilities.Callback2 callback2) {
        int i10;
        Context context = LaunchActivity.C1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        final Context context2 = context;
        final org.telegram.ui.ActionBar.c6 I = I();
        boolean z10 = tLObject instanceof TLRPC.TL_premiumGiftOption;
        if ((z10 || (tLObject instanceof TLRPC.TL_premiumGiftCodeOption)) && context2 != null) {
            if (!this.f12790e) {
                r(new ih.h1(this, callback2, j10, tLObject, tL_textWithEntities, 3));
                return;
            }
            if (z10) {
                i10 = ((TLRPC.TL_premiumGiftOption) tLObject).months;
            } else if (tLObject instanceof TLRPC.TL_premiumGiftCodeOption) {
                i10 = ((TLRPC.TL_premiumGiftCodeOption) tLObject).months;
            } else {
                return;
            }
            final String name = DialogObject.getName(this.f12787a, j10);
            final TLRPC.TL_inputInvoicePremiumGiftStars tL_inputInvoicePremiumGiftStars = new TLRPC.TL_inputInvoicePremiumGiftStars();
            tL_inputInvoicePremiumGiftStars.user_id = MessagesController.getInstance(this.f12787a).getInputUser(j10);
            tL_inputInvoicePremiumGiftStars.months = i10;
            if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                tL_inputInvoicePremiumGiftStars.flags |= 1;
                tL_inputInvoicePremiumGiftStars.message = tL_textWithEntities;
            }
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject p10 = ph.p2.p(I, false);
            if (p10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = p10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoicePremiumGiftStars;
            ConnectionsManager.getInstance(this.f12787a).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                    final s7 s7Var = s7.this;
                    final Utilities.Callback2 callback22 = callback2;
                    final TLRPC.TL_inputInvoicePremiumGiftStars tL_inputInvoicePremiumGiftStars2 = tL_inputInvoicePremiumGiftStars;
                    final Context context3 = context2;
                    final org.telegram.ui.ActionBar.c6 c6Var = I;
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
                                s7.e(str2);
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
                            s7 s7Var2 = s7.this;
                            ConnectionsManager.getInstance(s7Var2.f12787a).sendRequest(tL_payments_sendStarsForm, new d6(s7Var2, callback23, context3, c6Var, j12, str, j11, tLObject3, tL_textWithEntities2));
                        }
                    });
                }
            });
        }
    }

    public final void g0(LaunchActivity launchActivity, long j10, String str) {
        if (!this.f12790e) {
            r(new c2(this, (Object) launchActivity, j10, (Object) str, 7));
        } else {
            h0(launchActivity, j10, str);
        }
    }

    public final void h(TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, Utilities.Callback2 callback2) {
        Context context = LaunchActivity.C1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        Context context2 = context;
        org.telegram.ui.ActionBar.c6 I = I();
        if (starGift != null && context2 != null) {
            if (!this.f12790e) {
                r(new ih.h1(this, callback2, tL_payments_paymentFormStarGift, starGift, j10, 4));
                return;
            }
            String name = DialogObject.getName(this.f12787a, j10);
            TLRPC.TL_inputInvoiceStarGiftResale tL_inputInvoiceStarGiftResale = new TLRPC.TL_inputInvoiceStarGiftResale();
            tL_inputInvoiceStarGiftResale.slug = starGift.slug;
            tL_inputInvoiceStarGiftResale.to_id = MessagesController.getInstance(this.f12787a).getInputPeer(j10);
            tL_inputInvoiceStarGiftResale.ton = this.f12788b;
            tL_inputInvoiceStarGiftResale.message = tL_textWithEntities;
            tL_inputInvoiceStarGiftResale.show_name = !z10;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            int i10 = 0;
            JSONObject p10 = ph.p2.p(I, false);
            if (p10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = p10.toString();
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
            ConnectionsManager.getInstance(this.f12787a).sendRequest(tL_payments_sendStarsForm, new d6(this, callback2, context2, I, j11, name, tL_payments_paymentFormStarGift, starGift, j10));
        }
    }

    public final void h0(LaunchActivity launchActivity, long j10, String str) {
        if (p().amount < j10 && j10 > 0) {
            new y9(launchActivity, null, j10, 4, str, new ag.o0(11), 0L).show();
            return;
        }
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        mc J = tc.a0(U).J(R.raw.stars_topup, LocaleController.getString(R.string.StarsTopupLinkEnough), LocaleController.getString(R.string.StarsTopupLinkTopupAnyway), new ag.o0(10));
        J.f30652j = 5000;
        J.k(true);
    }

    public final void i(final TL_stars.StarGift starGift, final boolean z10, final boolean z11, final long j10, final TLRPC.TL_textWithEntities tL_textWithEntities, final ih.s5 s5Var) {
        Context context = LaunchActivity.C1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        final Context context2 = context;
        final org.telegram.ui.ActionBar.c6 I = I();
        if (starGift != null && context2 != null) {
            if (!this.f12790e) {
                r(new Runnable() {
                    @Override
                    public final void run() {
                        s7 s7Var = s7.this;
                        boolean z12 = s7Var.f12790e;
                        ih.s5 s5Var2 = s5Var;
                        if (!z12) {
                            s7.e("NO_BALANCE");
                            s5Var2.run(Boolean.FALSE, null);
                            return;
                        }
                        s7Var.i(starGift, z10, z11, j10, tL_textWithEntities, s5Var2);
                    }
                });
                return;
            }
            final String name = DialogObject.getName(this.f12787a, j10);
            final TLRPC.TL_inputInvoiceStarGift tL_inputInvoiceStarGift = new TLRPC.TL_inputInvoiceStarGift();
            tL_inputInvoiceStarGift.hide_name = z10;
            tL_inputInvoiceStarGift.peer = MessagesController.getInstance(this.f12787a).getInputPeer(j10);
            tL_inputInvoiceStarGift.gift_id = starGift.f22619id;
            tL_inputInvoiceStarGift.include_upgrade = z11;
            if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                tL_inputInvoiceStarGift.flags |= 2;
                tL_inputInvoiceStarGift.message = tL_textWithEntities;
            }
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject p10 = ph.p2.p(I, false);
            if (p10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = p10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGift;
            ConnectionsManager.getInstance(this.f12787a).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    final s7 s7Var = s7.this;
                    final ih.s5 s5Var2 = s5Var;
                    final TLRPC.TL_inputInvoiceStarGift tL_inputInvoiceStarGift2 = tL_inputInvoiceStarGift;
                    final Context context3 = context2;
                    final org.telegram.ui.ActionBar.c6 c6Var = I;
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
                            final ih.s5 s5Var3 = s5Var2;
                            if (!z14) {
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    str2 = "NO_PAYMENT_FORM";
                                } else {
                                    str2 = tL_error2.text;
                                }
                                s7.e(str2);
                                s5Var3.run(Boolean.FALSE, null);
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
                            final s7 s7Var2 = s7.this;
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(s7Var2.f12787a);
                            final Context context4 = context3;
                            final org.telegram.ui.ActionBar.c6 c6Var2 = c6Var;
                            final String str3 = str;
                            final TL_stars.StarGift starGift3 = starGift2;
                            final boolean z15 = z12;
                            final boolean z16 = z13;
                            final long j13 = j11;
                            final TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_textWithEntities2;
                            connectionsManager.sendRequest(tL_payments_sendStarsForm, new RequestDelegate() {
                                @Override
                                public final void run(final TLObject tLObject3, final TLRPC.TL_error tL_error3) {
                                    final s7 s7Var3 = s7.this;
                                    final ih.s5 s5Var4 = s5Var3;
                                    final Context context5 = context4;
                                    final org.telegram.ui.ActionBar.c6 c6Var3 = c6Var2;
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
                                            tc X;
                                            int i11;
                                            SpannableStringBuilder spannableStringBuilder;
                                            SpannableStringBuilder replaceTags;
                                            oa0 oa0Var;
                                            ?? r52;
                                            char c3;
                                            String str5;
                                            s7 s7Var4 = s7.this;
                                            TLObject tLObject4 = tLObject3;
                                            TLRPC.TL_error tL_error4 = tL_error3;
                                            ih.s5 s5Var5 = s5Var4;
                                            Context context6 = context5;
                                            org.telegram.ui.ActionBar.c6 c6Var4 = c6Var3;
                                            long j16 = j14;
                                            String str6 = str4;
                                            TL_stars.StarGift starGift5 = starGift4;
                                            boolean z19 = z17;
                                            boolean z20 = z18;
                                            long j17 = j15;
                                            TLRPC.TL_textWithEntities tL_textWithEntities5 = tL_textWithEntities4;
                                            org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                                            if (R != null && R.visibleDialog == null) {
                                                X = tc.a0(R);
                                            } else {
                                                X = tc.X();
                                            }
                                            if (!(tLObject4 instanceof TLRPC.TL_payments_paymentResult)) {
                                                if (tL_error4 != null) {
                                                    c3 = 0;
                                                    if ("BALANCE_TOO_LOW".equals(tL_error4.text)) {
                                                        if (!MessagesController.getInstance(s7Var4.f12787a).starsPurchaseAvailable()) {
                                                            s5Var5.run(Boolean.FALSE, null);
                                                            s7.e0(context6, c6Var4);
                                                            return;
                                                        }
                                                        boolean[] zArr = {false};
                                                        y9 y9Var = new y9(context6, c6Var4, j16, 6, str6, new i6(s7Var4, zArr, starGift5, z19, z20, j17, tL_textWithEntities5, s5Var5), 0L);
                                                        y9Var.setOnDismissListener(new eg.g(1, s5Var5, zArr));
                                                        y9Var.show();
                                                        return;
                                                    }
                                                } else {
                                                    c3 = 0;
                                                }
                                                if (tL_error4 != null && "STARGIFT_USAGE_LIMITED".equals(tL_error4.text)) {
                                                    s5Var5.run(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                                                    return;
                                                } else if (tL_error4 != null && "STARGIFT_USER_USAGE_LIMITED".equals(tL_error4.text)) {
                                                    s5Var5.run(Boolean.FALSE, "STARGIFT_USER_USAGE_LIMITED");
                                                    return;
                                                } else {
                                                    s5Var5.run(Boolean.FALSE, null);
                                                    int i12 = R.raw.error;
                                                    int i13 = R.string.UnknownErrorCode;
                                                    if (tL_error4 != null) {
                                                        str5 = tL_error4.text;
                                                    } else {
                                                        str5 = "FAILED_SEND_STARS";
                                                    }
                                                    Object[] objArr = new Object[1];
                                                    objArr[c3] = str5;
                                                    th.r(i13, objArr, X, i12, 36);
                                                    return;
                                                }
                                            }
                                            Utilities.stageQueue.postRunnable(new f6(s7Var4, (TLRPC.TL_payments_paymentResult) tLObject4, 1));
                                            s7Var4.D = false;
                                            s7Var4.E = true;
                                            s7Var4.G = 0L;
                                            s7Var4.V();
                                            s7Var4.Q(j17);
                                            s7Var4.T(true);
                                            s5Var5.run(Boolean.TRUE, null);
                                            if (BirthdayController.getInstance(s7Var4.f12787a).contains(j17)) {
                                                i11 = 0;
                                                MessagesController.getInstance(s7Var4.f12787a).getMainSettings().edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j17, false).apply();
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
                                                TLRPC.ChatFull chatFull = MessagesController.getInstance(s7Var4.f12787a).getChatFull(j18);
                                                if (chatFull != null) {
                                                    chatFull.stargifts_count++;
                                                    chatFull.flags2 |= 262144;
                                                    MessagesController.getInstance(s7Var4.f12787a).putChatFull(chatFull);
                                                }
                                                if (R instanceof ProfileActivity) {
                                                    ProfileActivity profileActivity = (ProfileActivity) R;
                                                    if (profileActivity.a() == j17) {
                                                        hz0 hz0Var = profileActivity.K;
                                                        if (hz0Var != null) {
                                                            hz0Var.v1(true);
                                                            profileActivity.K.Y0(14);
                                                            r52 = 0;
                                                            profileActivity.G4(false);
                                                        } else {
                                                            r52 = 0;
                                                        }
                                                        tc a02 = tc.a0(R);
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
                                                profileActivity2.whenFullyVisible(new ih.h1(profileActivity2, starGift5, spannableStringBuilder, j16, str6, 5));
                                                R.presentFragment(profileActivity2);
                                            } else {
                                                SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
                                                if ((R instanceof tn) && ((tn) R).a() == j17) {
                                                    tc a03 = tc.a0(R);
                                                    TLRPC.Document document2 = starGift5.sticker;
                                                    String string2 = LocaleController.getString(R.string.StarsGiftCompleted);
                                                    if (spannableStringBuilder2 != null) {
                                                        replaceTags = spannableStringBuilder2;
                                                    } else {
                                                        replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftCompletedText", (int) j16, new Object[0]));
                                                    }
                                                    a03.s(document2, string2, replaceTags).k(true);
                                                } else {
                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(s7Var4.f12787a);
                                                    int i15 = NotificationCenter.closeProfileActivity;
                                                    Long valueOf = Long.valueOf(j17);
                                                    Boolean bool = Boolean.FALSE;
                                                    notificationCenter.lambda$postNotificationNameOnUIThread$1(i15, valueOf, bool);
                                                    NotificationCenter.getInstance(s7Var4.f12787a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChatActivity, Long.valueOf(j17), bool);
                                                    tn R9 = tn.R9(j17);
                                                    R9.whenFullyVisible(new c2(R9, starGift5, spannableStringBuilder2, j16, 6));
                                                    R.presentFragment(R9);
                                                }
                                            }
                                            MessagesController.getInstance(s7Var4.f12787a).getMainSettings().edit().putBoolean("show_gift_for_" + j17, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j17, true).apply();
                                            LaunchActivity launchActivity = LaunchActivity.C1;
                                            if (launchActivity != null && (oa0Var = launchActivity.f35599t0) != null) {
                                                oa0Var.c(true);
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
        int i10 = this.f12787a;
        togglenopaidmessagesexception.user_id = MessagesController.getInstance(i10).getInputUser(j10);
        if (j11 != 0) {
            togglenopaidmessagesexception.parent_peer = MessagesController.getInstance(i10).getInputPeer(j11);
        }
        togglenopaidmessagesexception.refund_charged = z10;
        togglenopaidmessagesexception.require_payment = !z11;
        ConnectionsManager.getInstance(i10).sendRequest(togglenopaidmessagesexception, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                AndroidUtilities.runOnUIThread(new x6(s7.this, tLObject, j11, j10, z11));
            }
        });
    }

    public final boolean j() {
        if (!this.f12788b) {
            return false;
        }
        if (oh.g.B0()) {
            return true;
        }
        TL_stars.StarsAmount p10 = p();
        if (p10.nanos == 0 && p10.amount == 0) {
            return false;
        }
        return true;
    }

    public final void j0(String str, TLRPC.ChatInvite chatInvite, Utilities.Callback2 callback2) {
        int i10;
        String str2;
        if (chatInvite != null && chatInvite.subscription_pricing != null) {
            Context context = LaunchActivity.C1;
            if (context == null) {
                context = ApplicationLoader.applicationContext;
            }
            Context context2 = context;
            org.telegram.ui.ActionBar.c6 I = I();
            long j10 = chatInvite.subscription_pricing.amount;
            if (context2 != null) {
                int i11 = UserConfig.selectedAccount;
                boolean[] zArr = {false};
                c7 c7Var = new c7(this, j10, i11, zArr, callback2, context2, I, chatInvite, str);
                w2 w2Var = new w2(this, zArr, callback2);
                org.telegram.ui.ActionBar.f3 q6 = org.telegram.messenger.x3.q(context2, I, false, false);
                LinearLayout g10 = org.telegram.messenger.x3.g(context2, 1);
                g10.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
                FrameLayout frameLayout = new FrameLayout(context2);
                frameLayout.addView(new i9(context2, 40, 0), i7.f6.c(-1.0f, -1));
                org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context2);
                t9Var.setRoundRadius(AndroidUtilities.dp(80.0f));
                org.telegram.ui.Components.e9 e9Var = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
                e9Var.s(chatInvite.color);
                String str3 = chatInvite.title;
                e9Var.A = true;
                e9Var.f27962n = 0;
                e9Var.f27961m = false;
                org.telegram.ui.Components.e9.a(str3, null, null, e9Var.f27965q);
                TLRPC.Photo photo = chatInvite.photo;
                if (photo != null) {
                    t9Var.h(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(80.0f)), chatInvite.photo), "80_80", e9Var, chatInvite);
                } else {
                    t9Var.setImageDrawable(e9Var);
                }
                frameLayout.addView(t9Var, i7.f6.e(80, 80, 17));
                Drawable drawable = context2.getResources().getDrawable(R.drawable.star_small_outline);
                int i12 = org.telegram.ui.ActionBar.g6.f23133h5;
                drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i12, I), PorterDuff.Mode.SRC_IN));
                Drawable drawable2 = context2.getResources().getDrawable(R.drawable.star_small_inner);
                ImageView imageView = new ImageView(context2);
                imageView.setImageDrawable(drawable);
                frameLayout.addView(imageView, i7.f6.e(26, 26, 17));
                imageView.setTranslationX(AndroidUtilities.dp(26.0f));
                imageView.setTranslationY(AndroidUtilities.dp(26.0f));
                imageView.setScaleX(1.2f);
                imageView.setScaleY(1.2f);
                ImageView imageView2 = new ImageView(context2);
                imageView2.setImageDrawable(drawable2);
                frameLayout.addView(imageView2, i7.f6.e(26, 26, 17));
                imageView2.setTranslationX(AndroidUtilities.dp(26.0f));
                imageView2.setTranslationY(AndroidUtilities.dp(26.0f));
                x9 x9Var = new x9(context2, i11, I);
                i7.h6.a(x9Var);
                x9Var.setOnClickListener(new i8(x9Var, 1));
                frameLayout.addView(x9Var, i7.f6.d(-2, -2.0f, 53, 0.0f, 0.0f, -8.0f, 0.0f));
                g10.addView(frameLayout, i7.f6.q(-1, 117, 7));
                TextView h = org.telegram.messenger.x3.h(context2, 1, 20.0f);
                h.setTypeface(AndroidUtilities.bold());
                int i13 = org.telegram.ui.ActionBar.g6.f23169j5;
                h.setTextColor(org.telegram.ui.ActionBar.g6.v0(i13, I));
                org.telegram.ui.b.i(R.string.StarsSubscribeTitle, h, 17);
                TextView i14 = th.i(g10, h, i7.f6.t(-2, -2, 1, 0, 8, 0, 0), context2);
                i14.setTextSize(1, 14.0f);
                i14.setTextColor(org.telegram.ui.ActionBar.g6.v0(i13, I));
                TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                int i15 = tL_starsSubscriptionPricing.period;
                if (i15 == 2592000) {
                    i10 = i12;
                    i14.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscribeText", (int) tL_starsSubscriptionPricing.amount, chatInvite.title)));
                } else {
                    i10 = i12;
                    if (i15 == 300) {
                        str2 = "5 minutes";
                    } else {
                        str2 = "a minute";
                    }
                    i14.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscribeTextTest", (int) tL_starsSubscriptionPricing.amount, chatInvite.title, str2)));
                }
                i14.setMaxWidth(nh.t3.a(i14.getText(), i14.getPaint()));
                i14.setGravity(17);
                g10.addView(i14, i7.f6.t(-2, -2, 1, 0, 6, 0, 22));
                if (!TextUtils.isEmpty(chatInvite.about)) {
                    TextView h10 = org.telegram.messenger.x3.h(context2, 1, 14.0f);
                    h10.setTextColor(org.telegram.ui.ActionBar.g6.v0(i13, I));
                    h10.setText(Emoji.replaceEmoji(chatInvite.about, h10.getPaint().getFontMetricsInt(), false));
                    h10.setGravity(17);
                    g10.addView(h10, i7.f6.t(-2, -2, 1, 0, 6, 0, 22));
                }
                nh.d dVar = new nh.d(context2, I, true);
                dVar.g(LocaleController.getString(R.string.StarsSubscribeButton), false, true);
                g10.addView(dVar, i7.f6.n(-1, 48));
                y80 y80Var = new y80(context2, I);
                y80Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsSubscribeInfo), new e2.e(context2, 9)));
                y80Var.setGravity(17);
                y80Var.setTextSize(1, 13.0f);
                y80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.B6, I));
                y80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, I));
                g10.addView(y80Var, i7.f6.t(-1, -2, 49, 14, 14, 14, 6));
                q6.customView = g10;
                dVar.setOnClickListener(new bg.q(c7Var, q6, dVar, 9));
                q6.setOnDismissListener(new cg.d0(w2Var, 5));
                q6.fixNavigationBar(org.telegram.ui.ActionBar.g6.v0(i10, I));
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (!AndroidUtilities.isTablet() && U != null && !AndroidUtilities.hasDialogOnTop(U)) {
                    q6.makeAttached(U);
                }
                q6.show();
            }
        }
    }

    public final void k0(TL_stars.StarsAmount starsAmount) {
        boolean equals = this.f12791f.equals(starsAmount);
        int i10 = this.f12787a;
        if (!equals) {
            this.f12791f = starsAmount;
            this.f12792g = 0L;
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        } else if (this.f12792g != 0) {
            this.f12792g = 0L;
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
        int i10 = this.f12787a;
        tL_messages_editMessage.peer = MessagesController.getInstance(i10).getInputPeer(dialogId);
        int i11 = tL_messages_editMessage.flags;
        tL_messages_editMessage.flags = 32768 | i11;
        tL_messages_editMessage.schedule_date = messageObject.messageOwner.date;
        tL_messages_editMessage.f22475id = id2;
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
                tL_inputPhoto.f22411id = photo.f22416id;
                tL_inputPhoto.access_hash = photo.access_hash;
                tL_inputPhoto.file_reference = photo.file_reference;
                tL_inputMediaPhoto.f22455id = tL_inputPhoto;
                tL_inputMediaPaidMedia.extended_media.add(tL_inputMediaPhoto);
            } else {
                tL_messageMediaPaidMedia = tL_messageMediaPaidMedia2;
                if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument = new TLRPC.TL_inputMediaDocument();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) messageMedia).document;
                    tL_inputDocument.f22404id = document.f22398id;
                    tL_inputDocument.access_hash = document.access_hash;
                    tL_inputDocument.file_reference = document.file_reference;
                    tL_inputMediaDocument.f22453id = tL_inputDocument;
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
                AndroidUtilities.runOnUIThread(new e7(s7.this, tLObject, runnable, tL_error, z10, dialogId, id2, messageObject, j10));
            }
        });
    }

    public final TL_stars.SavedStarGift n(long j10) {
        TL_stars.StarGift starGift;
        int i10 = 0;
        while (true) {
            LongSparseArray longSparseArray = this.L;
            if (i10 < longSparseArray.size()) {
                k7 k7Var = (k7) longSparseArray.valueAt(i10);
                for (int i11 = 0; i11 < k7Var.f12387l.size(); i11++) {
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) k7Var.f12387l.get(i11);
                    if (savedStarGift != null && (starGift = savedStarGift.gift) != null && starGift.f22619id == j10) {
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
        if (((!this.f12790e || System.currentTimeMillis() - this.f12789c > 60000) && !this.d) || z11) {
            this.d = true;
            TL_stars.TL_payments_getStarsStatus tL_payments_getStarsStatus = new TL_stars.TL_payments_getStarsStatus();
            tL_payments_getStarsStatus.ton = this.f12788b;
            tL_payments_getStarsStatus.peer = new TLRPC.TL_inputPeerSelf();
            ConnectionsManager.getInstance(this.f12787a).sendRequest(tL_payments_getStarsStatus, new bg.h3(10, this, runnable));
        }
        if (z10 && this.f12792g > 0) {
            kf.a m10 = kf.a.m(this.f12791f);
            return kf.a.g(Math.max(0L, m10.a() - this.f12792g), m10.f13633a).o();
        }
        return this.f12791f;
    }

    public final void r(Runnable runnable) {
        q(true, false, runnable);
    }

    public final kf.a s() {
        kf.b bVar;
        kf.a l10 = kf.a.l(p());
        if (l10 == null) {
            if (this.f12788b) {
                bVar = kf.b.f13636b;
            } else {
                bVar = kf.b.f13635a;
            }
            return kf.a.i(0L, bVar);
        }
        return l10;
    }

    public final ArrayList u() {
        if (!this.f12795k && !this.f12796l) {
            this.f12795k = true;
            ConnectionsManager.getInstance(this.f12787a).sendRequest(new TL_stars.TL_payments_getStarsGiftOptions(), new j6(this, 3));
            return this.f12797m;
        }
        return this.f12797m;
    }

    public final ArrayList v() {
        if (!this.f12798n && !this.f12799o) {
            this.f12798n = true;
            ConnectionsManager.getInstance(this.f12787a).sendRequest(new TL_stars.TL_payments_getStarsGiveawayOptions(), new j6(this, 4));
            return this.f12800p;
        }
        return this.f12800p;
    }

    public final ArrayList z() {
        if (!this.h && !this.f12793i) {
            this.h = true;
            ConnectionsManager.getInstance(this.f12787a).sendRequest(new TL_stars.TL_payments_getStarsTopupOptions(), new j6(this, 2));
            return this.f12794j;
        }
        return this.f12794j;
    }
}
