package hh;

import android.app.Activity;
import android.content.Context;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
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
import org.telegram.messenger.WebFile;
import org.telegram.messenger.rl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.xb;
import org.telegram.ui.Components.yb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.hz0;
import org.telegram.ui.pa0;
import org.telegram.ui.rn;

public final class u7 {
    public static volatile u7[][] S = (u7[][]) Array.newInstance((Class<?>) u7.class, 2, 4);
    public static final Object[][] T = (Object[][]) Array.newInstance((Class<?>) Object.class, 2, 4);
    public boolean A;
    public t7 B;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public long G;
    public q7 N;

    public final int f10151a;

    public final boolean f10152b;

    public long f10153c;
    public boolean d;

    public boolean f10154e;

    public long f10156g;
    public boolean h;

    public boolean f10157i;

    public ArrayList f10158j;

    public boolean f10159k;

    public boolean f10160l;

    public ArrayList f10161m;

    public boolean f10162n;

    public boolean f10163o;

    public ArrayList f10164p;

    public String f10170w;

    public boolean f10171x;

    public boolean f10172y;

    public TL_stars.StarsAmount f10155f = TL_stars.StarsAmount.ofStars(0);

    public final ArrayList[] f10165q = {new ArrayList(), new ArrayList(), new ArrayList()};

    public final boolean[] f10166r = new boolean[3];

    public final String[] f10167s = new String[3];

    public final boolean[] f10168t = new boolean[3];

    public final boolean[] f10169u = new boolean[3];
    public final ArrayList v = new ArrayList();

    public final ArrayList f10173z = new ArrayList();
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

    public u7(int i10, boolean z10) {
        this.f10151a = i10;
        this.f10152b = z10;
    }

    public static org.telegram.ui.ActionBar.c6 I() {
        org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
        if (n2VarU != null) {
            return n2VarU.getResourceProvider();
        }
        return null;
    }

    public static u7 L(int i10) {
        return y(i10, true);
    }

    public static boolean U(int i10, hf.a aVar) {
        return aVar == null || x(i10, aVar.f8919a).s().f8920b >= aVar.f8920b;
    }

    public static void a(u7 u7Var, TL_stars.StarGifts starGifts) {
        ArrayList arrayList = u7Var.I;
        ArrayList arrayList2 = u7Var.J;
        int i10 = u7Var.f10151a;
        ArrayList arrayList3 = u7Var.H;
        u7Var.C = false;
        u7Var.D = true;
        if (!(starGifts instanceof TL_stars.TL_starGifts)) {
            if (starGifts instanceof TL_stars.TL_starGiftsNotModified) {
                int i11 = u7Var.F;
                long jCurrentTimeMillis = System.currentTimeMillis();
                u7Var.G = jCurrentTimeMillis;
                u7Var.c0(i11, jCurrentTimeMillis, arrayList3);
                return;
            }
            return;
        }
        TL_stars.TL_starGifts tL_starGifts = (TL_stars.TL_starGifts) starGifts;
        MessagesController.getInstance(i10).putUsers(tL_starGifts.users, false);
        MessagesController.getInstance(i10).putChats(tL_starGifts.chats, false);
        MessagesStorage.getInstance(i10).putUsersAndChats(tL_starGifts.users, tL_starGifts.chats, true, true);
        arrayList3.clear();
        arrayList3.addAll(tL_starGifts.gifts);
        arrayList2.clear();
        arrayList2.addAll(arrayList3);
        Collections.sort(arrayList2, Comparator$EL.thenComparingInt(Comparator$CC.comparingInt(new gf.d(4)), new gf.d(5)));
        arrayList.clear();
        arrayList.addAll(arrayList3);
        Collections.sort(arrayList, Comparator$CC.comparingInt(new gf.d(6)));
        u7Var.F = tL_starGifts.hash;
        u7Var.G = System.currentTimeMillis();
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftsLoaded, new Object[0]);
        u7Var.c0(u7Var.F, u7Var.G, tL_starGifts.gifts);
    }

    public static void b(u7 u7Var, ArrayList arrayList, Integer num, Long l10, ArrayList arrayList2, ArrayList arrayList3) {
        int i10 = u7Var.f10151a;
        MessagesController.getInstance(i10).putUsers(arrayList2, true);
        MessagesController.getInstance(i10).putChats(arrayList3, true);
        u7Var.E = true;
        ArrayList arrayList4 = u7Var.H;
        arrayList4.clear();
        arrayList4.addAll(arrayList);
        ArrayList arrayList5 = u7Var.J;
        arrayList5.clear();
        arrayList5.addAll(arrayList4);
        Collections.sort(arrayList5, Comparator$EL.thenComparingInt(Comparator$CC.comparingInt(new gf.d(1)), new gf.d(2)));
        ArrayList arrayList6 = u7Var.I;
        arrayList6.clear();
        arrayList6.addAll(arrayList4);
        Collections.sort(arrayList6, Comparator$CC.comparingInt(new gf.d(3)));
        u7Var.F = num.intValue();
        u7Var.G = l10.longValue();
        u7Var.C = false;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftsLoaded, new Object[0]);
        u7Var.V();
    }

    public static void e(String str) {
        org.telegram.ui.ActionBar.n2 n2VarR = LaunchActivity.R();
        org.telegram.ui.Cells.pa.r(R.string.UnknownErrorCode, new Object[]{str}, (n2VarR == null || n2VarR.visibleDialog != null) ? mc.X() : mc.a0(n2VarR), R.raw.error, 36);
    }

    public static void e0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.StarsNotAvailableTitle);
        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.StarsNotAvailableText);
        i0.a.C(R.string.OK, alertDialog$Builder, null);
    }

    public static boolean k(TL_stars.SavedStarGift savedStarGift, TL_stars.SavedStarGift savedStarGift2) {
        int i10 = savedStarGift.flags;
        if ((i10 & 2048) == 0 || (savedStarGift2.flags & 2048) == 0 || savedStarGift.saved_id != savedStarGift2.saved_id) {
            return ((i10 & 8) == 0 || (savedStarGift2.flags & 8) == 0 || savedStarGift.msg_id != savedStarGift2.msg_id) ? false : true;
        }
        return true;
    }

    public static TL_stars.StarGiftAttribute l(ArrayList arrayList, Class cls) {
        if (arrayList == null) {
            return null;
        }
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
            return tL_messages_forwardMessages.allow_paid_stars / ((long) tL_messages_forwardMessages.f22466id.size());
        }
        if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
            return ((TLRPC.TL_messages_sendMedia) tLObject).allow_paid_stars;
        }
        return 0L;
    }

    public static Context t(org.telegram.ui.ActionBar.n2 n2Var) {
        if (n2Var != null && n2Var.getContext() != null) {
            return n2Var.getContext();
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

    public static u7 w(int i10) {
        return y(i10, false);
    }

    public static u7 x(int i10, hf.b bVar) {
        return y(i10, bVar == hf.b.f8922b);
    }

    public static u7 y(int i10, boolean z10) {
        u7 u7Var;
        u7 u7Var2 = S[z10 ? 1 : 0][i10];
        if (u7Var2 != null) {
            return u7Var2;
        }
        synchronized (T[z10 ? 1 : 0][i10]) {
            try {
                u7Var = S[z10 ? 1 : 0][i10];
                if (u7Var == null) {
                    u7[] u7VarArr = S[z10 ? 1 : 0];
                    u7 u7Var3 = new u7(i10, z10);
                    u7VarArr[i10] = u7Var3;
                    u7Var = u7Var3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return u7Var;
    }

    public final long A(o7 o7Var, TLRPC.TL_messageReactions tL_messageReactions) {
        Long l10;
        t7 t7Var = this.B;
        if (t7Var != null && t7Var.f10086a.equals(o7Var) && (l10 = this.B.f10097n) != null) {
            return l10.longValue();
        }
        Long myPaidReactionPeer = MessageObject.getMyPaidReactionPeer(tL_messageReactions);
        if (myPaidReactionPeer != null) {
            return myPaidReactionPeer.longValue();
        }
        Long paidReactionsDialogId = MessagesController.getInstance(this.f10151a).getPaidReactionsDialogId();
        if (paidReactionsDialogId != null) {
            return paidReactionsDialogId.longValue();
        }
        return 0L;
    }

    public final long B(MessageObject messageObject) {
        Long l10;
        t7 t7Var = this.B;
        if (t7Var != null && t7Var.f10086a.equals(o7.b(messageObject)) && (l10 = this.B.f10097n) != null) {
            return l10.longValue();
        }
        Long myPaidReactionPeer = messageObject == null ? null : messageObject.getMyPaidReactionPeer();
        if (myPaidReactionPeer != null) {
            return myPaidReactionPeer.longValue();
        }
        Long paidReactionsDialogId = MessagesController.getInstance(this.f10151a).getPaidReactionsDialogId();
        if (paidReactionsDialogId != null) {
            return paidReactionsDialogId.longValue();
        }
        return 0L;
    }

    public final void C(long j10, long j11, Utilities.Callback callback) {
        TL_account.getPaidMessagesRevenue getpaidmessagesrevenue = new TL_account.getPaidMessagesRevenue();
        int i10 = this.f10151a;
        getpaidmessagesrevenue.user_id = MessagesController.getInstance(i10).getInputUser(j10);
        if (j11 != 0) {
            getpaidmessagesrevenue.parent_peer = MessagesController.getInstance(i10).getInputPeer(j11);
        }
        ConnectionsManager.getInstance(i10).sendRequest(getpaidmessagesrevenue, new w6(0, callback));
    }

    public final long D(int i10, long j10) {
        t7 t7Var = this.B;
        if (t7Var == null) {
            return 0L;
        }
        o7 o7Var = t7Var.f10086a;
        if (o7Var.f9840a == j10 && o7Var.f9841b == i10 && t7Var.f10095l) {
            return t7Var.h;
        }
        return 0L;
    }

    public final long E(MessageObject messageObject) {
        TLRPC.Message message;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return 0L;
        }
        return ((message.isThreadMessage || messageObject.isForwardedChannelPost()) && messageObject.messageOwner.fwd_from != null) ? D(messageObject.messageOwner.fwd_from.saved_from_msg_id, messageObject.getFromChatId()) : D(messageObject.getId(), messageObject.getDialogId());
    }

    public final k7 F(long j10, boolean z10) {
        LongSparseArray longSparseArray = this.K;
        k7 k7Var = (k7) longSparseArray.get(j10);
        if (k7Var != null || !z10) {
            return k7Var;
        }
        k7 k7Var2 = new k7(this.f10151a, j10);
        longSparseArray.put(j10, k7Var2);
        return k7Var2;
    }

    public final m7 G(long j10, boolean z10) {
        LongSparseArray longSparseArray = this.L;
        m7 m7Var = (m7) longSparseArray.get(j10);
        if (m7Var != null || !z10) {
            return m7Var;
        }
        m7 m7Var2 = new m7(this.f10151a, j10, true);
        longSparseArray.put(j10, m7Var2);
        return m7Var2;
    }

    public final void H(TL_stars.StarGift starGift, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, Utilities.Callback callback) {
        Context context = LaunchActivity.C1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        org.telegram.ui.ActionBar.c6 c6VarI = I();
        if (starGift == null || context == null) {
            return;
        }
        if (!this.f10154e) {
            r(new e2(this, callback, starGift, j10));
            return;
        }
        TLRPC.TL_inputInvoiceStarGiftResale tL_inputInvoiceStarGiftResale = new TLRPC.TL_inputInvoiceStarGiftResale();
        tL_inputInvoiceStarGiftResale.slug = starGift.slug;
        tL_inputInvoiceStarGiftResale.to_id = MessagesController.getInstance(this.f10151a).getInputPeer(j10);
        tL_inputInvoiceStarGiftResale.ton = this.f10152b;
        tL_inputInvoiceStarGiftResale.message = tL_textWithEntities;
        tL_inputInvoiceStarGiftResale.show_name = !z10;
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        JSONObject jSONObjectP = nh.b3.p(c6VarI, false);
        if (jSONObjectP != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = jSONObjectP.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftResale;
        ConnectionsManager.getInstance(this.f10151a).sendRequest(tL_payments_getPaymentForm, new cg.g0(8, this, callback));
    }

    public final TL_stars.StarGift J(long j10) {
        V();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i10 >= arrayList.size()) {
                return null;
            }
            TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList.get(i10);
            if (starGift.f22607id == j10) {
                return starGift;
            }
            i10++;
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
        ConnectionsManager.getInstance(this.f10151a).sendRequest(getstargiftupgradepreview, new cg.c0(this, j10, callback, 1));
    }

    public final void M(TL_stars.InputSavedStarGift inputSavedStarGift, Utilities.Callback callback) {
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(ApplicationLoader.applicationContext, 3, null);
        b2Var.q(200L);
        TL_stars.getSavedStarGift getsavedstargift = new TL_stars.getSavedStarGift();
        getsavedstargift.stargift.add(inputSavedStarGift);
        ConnectionsManager.getInstance(this.f10151a).sendRequest(getsavedstargift, new gh.f1(this, b2Var, inputSavedStarGift, callback, 3));
    }

    public final boolean N() {
        return O(0);
    }

    public final boolean O(int i10) {
        return this.f10154e && !this.f10165q[i10].isEmpty();
    }

    public final void P() {
        this.f10154e = false;
        p();
        this.f10154e = true;
    }

    public final void Q(long j10) {
        m7 m7VarG = G(j10, false);
        if (m7VarG != null) {
            m7VarG.i(false);
        }
        k7 k7Var = (k7) this.K.get(j10);
        if (k7Var != null) {
            k7Var.g();
        }
    }

    public final void R(TLRPC.UserFull userFull) {
        long j10 = userFull.f22528id;
        m7 m7VarG = G(j10, false);
        if (m7VarG != null && m7VarG.f9755n != userFull.stargifts_count) {
            m7VarG.i(false);
        }
        k7 k7Var = (k7) this.K.get(j10);
        if (k7Var != null) {
            k7Var.g();
        }
    }

    public final void S() {
        if (this.f10171x) {
            return;
        }
        this.v.clear();
        this.f10170w = null;
        this.f10171x = false;
        this.f10172y = false;
        W();
    }

    public final void T(boolean z10) {
        for (int i10 = 0; i10 < 3; i10++) {
            boolean[] zArr = this.f10168t;
            if (!zArr[i10]) {
                this.f10165q[i10].clear();
                this.f10167s[i10] = null;
                zArr[i10] = false;
                this.f10169u[i10] = false;
                if (z10) {
                    X(i10);
                }
            }
        }
    }

    public final void V() {
        if (this.C) {
            return;
        }
        if (!this.D || System.currentTimeMillis() - this.G >= 60000) {
            this.C = true;
            boolean z10 = this.E;
            int i10 = this.f10151a;
            if (z10) {
                int i11 = this.F;
                ag.n0 n0Var = new ag.n0(this, 16);
                TL_stars.getStarGifts getstargifts = new TL_stars.getStarGifts();
                getstargifts.hash = i11;
                ConnectionsManager.getInstance(i10).sendRequest(getstargifts, new cf.a(n0Var, 8));
                return;
            }
            h3.x xVar = new h3.x(this, 9);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
            messagesStorage.getStorageQueue().postRunnable(new cg.k0(messagesStorage, arrayList3, arrayList2, arrayList, xVar, 9));
        }
    }

    public final void W() {
        if (this.f10152b || this.f10171x || this.f10172y) {
            return;
        }
        this.f10171x = true;
        TL_stars.TL_getStarsSubscriptions tL_getStarsSubscriptions = new TL_stars.TL_getStarsSubscriptions();
        tL_getStarsSubscriptions.peer = new TLRPC.TL_inputPeerSelf();
        String str = this.f10170w;
        tL_getStarsSubscriptions.offset = str;
        if (str == null) {
            tL_getStarsSubscriptions.offset = "";
        }
        ConnectionsManager.getInstance(this.f10151a).sendRequest(tL_getStarsSubscriptions, new l6(this, 1));
    }

    public final void X(int i10) {
        boolean[] zArr = this.f10168t;
        if (zArr[i10] || this.f10169u[i10]) {
            return;
        }
        zArr[i10] = true;
        TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
        tL_payments_getStarsTransactions.ton = this.f10152b;
        tL_payments_getStarsTransactions.peer = new TLRPC.TL_inputPeerSelf();
        tL_payments_getStarsTransactions.inbound = i10 == 1;
        tL_payments_getStarsTransactions.outbound = i10 == 2;
        String str = this.f10167s[i10];
        tL_payments_getStarsTransactions.offset = str;
        if (str == null) {
            tL_payments_getStarsTransactions.offset = "";
        }
        ConnectionsManager.getInstance(this.f10151a).sendRequest(tL_payments_getStarsTransactions, new u1(this, i10, 1));
    }

    public final void Y(MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, Runnable runnable, Utilities.Callback callback) {
        long dialogId;
        String str;
        boolean z10;
        m6 m6Var;
        n6 n6Var;
        MessageObject messageObject2;
        float f10;
        int i10;
        int i11;
        TextView textViewH;
        String string;
        int i12;
        TextView textViewH2;
        long j10;
        lh.d dVar;
        int i13;
        TLRPC.Message message;
        String userName;
        boolean z11;
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia;
        int i14;
        int i15;
        int i16;
        String str2;
        char c10;
        String pluralString;
        String pluralString2;
        String pluralString3;
        String pluralString4;
        char c11;
        String pluralString5;
        TLRPC.MessageExtendedMedia messageExtendedMedia;
        boolean z12;
        TLRPC.User user;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        String string2;
        TLRPC.Message message2;
        int i17;
        int i18;
        o9 o9Var;
        ImageLocation forDocument;
        TLRPC.Peer peer2;
        if (tL_payments_paymentFormStars == null || tL_payments_paymentFormStars.invoice == null) {
            return;
        }
        MessagesController.getInstance(this.f10151a).putUsers(tL_payments_paymentFormStars.users, false);
        Context context = LaunchActivity.C1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        Context context2 = context;
        org.telegram.ui.ActionBar.c6 c6VarI = I();
        if (context2 == null) {
            return;
        }
        if (!this.f10154e) {
            r(new gh.i1(this, (Object) runnable, messageObject, inputInvoice, tL_payments_paymentFormStars, callback, 4));
            return;
        }
        ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStars.invoice.prices;
        int size = arrayList.size();
        long j11 = 0;
        int i19 = 0;
        while (i19 < size) {
            TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i19);
            i19++;
            j11 += tL_labeledPrice.amount;
        }
        if (messageObject == null || messageObject.type != 29) {
            dialogId = tL_payments_paymentFormStars.bot_id;
        } else {
            TLRPC.MessageFwdHeader messageFwdHeader2 = messageObject.messageOwner.fwd_from;
            dialogId = (messageFwdHeader2 == null || (peer2 = messageFwdHeader2.from_id) == null) ? messageObject.getDialogId() : DialogObject.getPeerDialogId(peer2);
        }
        long j12 = dialogId;
        if (j12 >= 0) {
            TLRPC.User user2 = MessagesController.getInstance(this.f10151a).getUser(Long.valueOf(j12));
            String userName2 = UserObject.getUserName(user2);
            UserObject.isBot(user2);
            str = userName2;
            z10 = !UserObject.isBot(user2);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(this.f10151a).getChat(Long.valueOf(-j12));
            str = chat == null ? "" : chat.title;
            z10 = false;
        }
        String str3 = tL_payments_paymentFormStars.title;
        runnable.run();
        int i20 = tL_payments_paymentFormStars.invoice.subscription_period;
        long j13 = j11;
        boolean[] zArr = {false};
        int i21 = this.f10151a;
        TLRPC.WebDocument webDocument = tL_payments_paymentFormStars.photo;
        m6 m6Var2 = new m6(this, j13, zArr, callback, context2, c6VarI, z10, str, messageObject, inputInvoice, tL_payments_paymentFormStars, i20, j12);
        n6 n6Var2 = new n6(this, zArr, callback);
        org.telegram.ui.ActionBar.e3 e3VarO = org.telegram.messenger.y1.o(context2, c6VarI, false, false);
        TLRPC.User user3 = MessagesController.getInstance(i21).getUser(Long.valueOf(j12));
        LinearLayout linearLayoutG = org.telegram.messenger.y1.g(context2, 1);
        linearLayoutG.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout = new FrameLayout(context2);
        org.telegram.ui.ActionBar.e3 e3Var = e3VarO;
        frameLayout.addView(new m9(context2, 40, 0), h7.z5.c(-1.0f, -1));
        if (messageObject == null || (message2 = messageObject.messageOwner) == null || !(message2.media instanceof TLRPC.TL_messageMediaPaidMedia)) {
            e3Var = e3Var;
            m6Var = m6Var2;
            n6Var = n6Var2;
            linearLayoutG = linearLayoutG;
            messageObject2 = messageObject;
            i20 = i20;
            if (webDocument == null) {
                org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context2);
                n9Var.setRoundRadius(AndroidUtilities.dp(80.0f));
                org.telegram.ui.Components.y8 y8Var = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
                y8Var.r(user3);
                n9Var.e(user3, y8Var);
                frameLayout.addView(n9Var, h7.z5.e(80, 80, 17));
            } else {
                FrameLayout frameLayout2 = new FrameLayout(context2);
                org.telegram.ui.Components.n9 n9Var2 = new org.telegram.ui.Components.n9(context2);
                n9Var2.setRoundRadius(AndroidUtilities.dp(18.0f));
                n9Var2.n(ImageLocation.getForWebFile(WebFile.createWithWebDocument(webDocument)), "80_80", null, null);
                frameLayout2.addView(n9Var2, h7.z5.e(80, 80, 48));
                frameLayout.addView(frameLayout2, h7.z5.e(80, 87, 17));
                TextView textView = new TextView(context2);
                textView.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
                f10 = 13.0f;
                textView.setTextSize(1, 13.0f);
                i10 = -1;
                textView.setTextColor(-1);
                textView.setText(oa.R0(i0.a.m((int) j13, ',', new StringBuilder("XTR ")), 0.85f, null));
                i11 = 0;
                textView.setPadding(AndroidUtilities.dp(5.33f), 0, AndroidUtilities.dp(5.33f), 0);
                textView.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(16.0f), -1133566));
                FrameLayout frameLayout3 = new FrameLayout(context2);
                frameLayout3.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(20.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23124h5, c6VarI)));
                frameLayout3.setPadding(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
                frameLayout3.addView(textView, h7.z5.q(-2, 16, 119));
                frameLayout2.addView(frameLayout3, h7.z5.a(-2.0f, 18.66f, 81));
            }
            da daVar = new da(context2, i21, c6VarI);
            h7.b6.a(daVar);
            daVar.setOnClickListener(new k8(daVar, i11));
            frameLayout.addView(daVar, h7.z5.d(-2, -2.0f, 53, 0.0f, 0.0f, -8.0f, 0.0f));
            linearLayoutG.addView(frameLayout, h7.z5.q(i10, 117, 7));
            textViewH = org.telegram.messenger.y1.h(context2, 1, 20.0f);
            textViewH.setTypeface(AndroidUtilities.bold());
            int i22 = org.telegram.ui.ActionBar.g6.f23161j5;
            textViewH.setTextColor(org.telegram.ui.ActionBar.g6.v0(i22, c6VarI));
            if (i20 > 0) {
                if (webDocument != null) {
                    string2 = str3;
                } else {
                    string2 = LocaleController.getString(R.string.StarsConfirmSubscriptionTitle);
                }
                textViewH.setText(Emoji.replaceEmoji(string2, textViewH.getPaint().getFontMetricsInt(), i11));
            } else {
                if (webDocument != null) {
                    string = str3;
                } else {
                    string = LocaleController.getString(R.string.StarsConfirmPurchaseTitle);
                }
                textViewH.setText(Emoji.replaceEmoji(string, textViewH.getPaint().getFontMetricsInt(), i11));
            }
            NotificationCenter.listenEmojiLoading(textViewH);
            textViewH.setGravity(17);
            if (webDocument != null) {
                i12 = -8;
            } else {
                i12 = 8;
            }
            linearLayoutG.addView(textViewH, h7.z5.t(-2, -2, 1, 0, i12, 0, 0));
            if (webDocument != null) {
                LinearLayout linearLayoutG2 = org.telegram.messenger.y1.g(context2, i11);
                linearLayoutG2.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(28.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f22999a7, c6VarI)));
                org.telegram.ui.Components.n9 n9Var3 = new org.telegram.ui.Components.n9(context2);
                n9Var3.setRoundRadius(AndroidUtilities.dp(14.0f));
                org.telegram.ui.Components.y8 y8Var2 = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
                y8Var2.r(user3);
                n9Var3.e(user3, y8Var2);
                linearLayoutG2.addView(n9Var3, h7.z5.n(28, 28));
                TextView textView2 = new TextView(context2);
                textView2.setTextSize(1, f10);
                textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6VarI));
                textView2.setText(UserObject.getUserName(user3));
                linearLayoutG2.addView(textView2, h7.z5.t(-2, -2, 16, 6, 0, 10, 0));
                linearLayoutG.addView(linearLayoutG2, h7.z5.t(-2, 28, 1, 0, 8, 0, 2));
            }
            textViewH2 = org.telegram.messenger.y1.h(context2, 1, 14.0f);
            textViewH2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i22, c6VarI));
            if (messageObject2 == null && (message = messageObject2.messageOwner) != null && (message.media instanceof TLRPC.TL_messageMediaPaidMedia)) {
                long dialogId2 = messageObject2.getDialogId();
                TLRPC.Message message3 = messageObject2.messageOwner;
                if (message3 != null && (messageFwdHeader = message3.fwd_from) != null && (peer = messageFwdHeader.from_id) != null) {
                    dialogId2 = DialogObject.getPeerDialogId(peer);
                }
                if (dialogId2 < 0 && messageObject2.getFromChatId() > 0 && (user = MessagesController.getInstance(i21).getUser(Long.valueOf(messageObject2.getFromChatId()))) != null && user.bot) {
                    dialogId2 = user.f22527id;
                }
                if (dialogId2 >= 0) {
                    TLRPC.User user4 = MessagesController.getInstance(i21).getUser(Long.valueOf(dialogId2));
                    userName = UserObject.getUserName(user4);
                    if (user4 != null && user4.bot) {
                        z11 = true;
                    }
                    tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageObject2.messageOwner.media;
                    i15 = 0;
                    i16 = 0;
                    for (i14 = 0; i14 < tL_messageMediaPaidMedia.extended_media.size(); i14++) {
                        messageExtendedMedia = tL_messageMediaPaidMedia.extended_media.get(i14);
                        if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
                            if ((((TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia).flags & 4) != 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                        } else if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                            z12 = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media instanceof TLRPC.TL_messageMediaDocument;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            i15++;
                        } else {
                            i16++;
                        }
                    }
                    if (i15 == 0) {
                        String str4 = z11 ? "StarsConfirmPurchaseMediaBotOne2" : "StarsConfirmPurchaseMediaOne2";
                        int i23 = (int) j13;
                        if (i16 == 1) {
                            pluralString5 = LocaleController.getString(R.string.StarsConfirmPurchaseMedia_SinglePhoto);
                            c11 = 1;
                        } else {
                            c11 = 1;
                            pluralString5 = LocaleController.formatPluralString("StarsConfirmPurchaseMedia_Photos", i16, new Object[i11]);
                        }
                        Object[] objArr = new Object[2];
                        objArr[i11] = pluralString5;
                        objArr[c11] = userName;
                        pluralString3 = LocaleController.formatPluralString(str4, i23, objArr);
                        j10 = j13;
                    } else {
                        j10 = r11;
                        if (i16 == 0) {
                            String str5 = z11 ? "StarsConfirmPurchaseMediaBotOne2" : "StarsConfirmPurchaseMediaOne2";
                            int i24 = (int) j10;
                            if (i15 == 1) {
                                pluralString4 = LocaleController.getString(R.string.StarsConfirmPurchaseMedia_SingleVideo);
                            } else {
                                pluralString4 = LocaleController.formatPluralString("StarsConfirmPurchaseMedia_Videos", i15, new Object[i11]);
                            }
                            Object[] objArr2 = new Object[2];
                            objArr2[i11] = pluralString4;
                            objArr2[1] = userName;
                            pluralString3 = LocaleController.formatPluralString(str5, i24, objArr2);
                        } else {
                            if (z11) {
                                str2 = "StarsConfirmPurchaseMediaBotTwo2";
                            } else {
                                str2 = "StarsConfirmPurchaseMediaTwo2";
                            }
                            int i25 = (int) j10;
                            if (i16 == 1) {
                                pluralString = LocaleController.getString(R.string.StarsConfirmPurchaseMedia_SinglePhoto);
                                c10 = 2;
                            } else {
                                c10 = 2;
                                pluralString = LocaleController.formatPluralString("StarsConfirmPurchaseMedia_Photos", i16, new Object[i11]);
                            }
                            if (i15 == 1) {
                                pluralString2 = LocaleController.getString(R.string.StarsConfirmPurchaseMedia_SingleVideo);
                            } else {
                                pluralString2 = LocaleController.formatPluralString("StarsConfirmPurchaseMedia_Videos", i15, new Object[i11]);
                            }
                            Object[] objArr3 = new Object[3];
                            objArr3[i11] = pluralString;
                            objArr3[1] = pluralString2;
                            objArr3[c10] = userName;
                            pluralString3 = LocaleController.formatPluralString(str2, i25, objArr3);
                        }
                    }
                    textViewH2.setText(AndroidUtilities.replaceTags(pluralString3));
                } else {
                    TLRPC.Chat chat2 = MessagesController.getInstance(i21).getChat(Long.valueOf(-dialogId2));
                    userName = chat2 != null ? chat2.title : "";
                }
                z11 = false;
                tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageObject2.messageOwner.media;
                i15 = 0;
                i16 = 0;
                while (i14 < tL_messageMediaPaidMedia.extended_media.size()) {
                    messageExtendedMedia = tL_messageMediaPaidMedia.extended_media.get(i14);
                    if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
                        if ((((TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia).flags & 4) != 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                    } else if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                        z12 = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media instanceof TLRPC.TL_messageMediaDocument;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        i15++;
                    } else {
                        i16++;
                    }
                }
                if (i15 == 0) {
                    if (z11) {
                    }
                    int i26 = (int) j13;
                    if (i16 == 1) {
                        pluralString5 = LocaleController.getString(R.string.StarsConfirmPurchaseMedia_SinglePhoto);
                        c11 = 1;
                    } else {
                        c11 = 1;
                        pluralString5 = LocaleController.formatPluralString("StarsConfirmPurchaseMedia_Photos", i16, new Object[i11]);
                    }
                    Object[] objArr4 = new Object[2];
                    objArr4[i11] = pluralString5;
                    objArr4[c11] = userName;
                    pluralString3 = LocaleController.formatPluralString(str4, i26, objArr4);
                    j10 = j13;
                } else {
                    j10 = r11;
                    if (i16 == 0) {
                        if (z11) {
                        }
                        int i27 = (int) j10;
                        if (i15 == 1) {
                            pluralString4 = LocaleController.getString(R.string.StarsConfirmPurchaseMedia_SingleVideo);
                        } else {
                            pluralString4 = LocaleController.formatPluralString("StarsConfirmPurchaseMedia_Videos", i15, new Object[i11]);
                        }
                        Object[] objArr5 = new Object[2];
                        objArr5[i11] = pluralString4;
                        objArr5[1] = userName;
                        pluralString3 = LocaleController.formatPluralString(str5, i27, objArr5);
                    } else {
                        if (z11) {
                            str2 = "StarsConfirmPurchaseMediaBotTwo2";
                        } else {
                            str2 = "StarsConfirmPurchaseMediaTwo2";
                        }
                        int i28 = (int) j10;
                        if (i16 == 1) {
                            pluralString = LocaleController.getString(R.string.StarsConfirmPurchaseMedia_SinglePhoto);
                            c10 = 2;
                        } else {
                            c10 = 2;
                            pluralString = LocaleController.formatPluralString("StarsConfirmPurchaseMedia_Photos", i16, new Object[i11]);
                        }
                        if (i15 == 1) {
                            pluralString2 = LocaleController.getString(R.string.StarsConfirmPurchaseMedia_SingleVideo);
                        } else {
                            pluralString2 = LocaleController.formatPluralString("StarsConfirmPurchaseMedia_Videos", i15, new Object[i11]);
                        }
                        Object[] objArr6 = new Object[3];
                        objArr6[i11] = pluralString;
                        objArr6[1] = pluralString2;
                        objArr6[c10] = userName;
                        pluralString3 = LocaleController.formatPluralString(str2, i28, objArr6);
                    }
                }
                textViewH2.setText(AndroidUtilities.replaceTags(pluralString3));
            } else {
                j10 = r11;
                if (i20 > 0) {
                    String userName3 = UserObject.getUserName(user3);
                    Object[] objArr7 = new Object[2];
                    objArr7[i11] = str3;
                    objArr7[1] = userName3;
                    textViewH2.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsConfirmSubscriptionText2", (int) j10, objArr7)));
                } else {
                    String userName4 = UserObject.getUserName(user3);
                    Object[] objArr8 = new Object[2];
                    objArr8[i11] = str3;
                    objArr8[1] = userName4;
                    textViewH2.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsConfirmPurchaseText2", (int) j10, objArr8)));
                }
            }
            textViewH2.setMaxWidth(lh.w3.a(textViewH2.getText(), textViewH2.getPaint()));
            textViewH2.setGravity(17);
            linearLayoutG.addView(textViewH2, h7.z5.t(-2, -2, 1, 0, 6, 0, 18));
            dVar = new lh.d(context2, c6VarI, true);
            if (i20 > 0) {
                dVar.g(oa.Q0(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsConfirmSubscriptionButton", (int) j10))), i11, true);
            } else {
                dVar.g(oa.Q0(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsConfirmPurchaseButton", (int) j10))), i11, true);
            }
            linearLayoutG.addView(dVar, h7.z5.c(48.0f, -1));
            p80 p80Var = new p80(context2, c6VarI);
            p80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23441z6, c6VarI));
            p80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, c6VarI));
            p80Var.setTextSize(1, 14.0f);
            if (i20 > 0) {
                i13 = R.string.StarsConfirmSubscriptionTOS;
            } else {
                i13 = R.string.StarsConfirmPurchaseTOS;
            }
            p80Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(i13), new e2.e(context2, 6)));
            p80Var.setGravity(17);
            linearLayoutG.addView(p80Var, h7.z5.k(0.0f, 12.0f, 0.0f, 2.0f, -1, -2));
            org.telegram.ui.ActionBar.e3 e3Var2 = e3Var;
            e3Var2.customView = linearLayoutG;
            dVar.setOnClickListener(new gg.f(m6Var, e3Var2, dVar, 7));
            e3Var2.setOnDismissListener(new ag.j0(n6Var, 3));
            e3Var2.fixNavigationBar();
            e3Var2.show();
        }
        o9 o9Var2 = new o9(context2);
        o9Var2.D = new Path();
        o9Var2.E = new RectF();
        o9Var2.F = context2.getResources().getDrawable(R.drawable.large_locked_post).mutate();
        o9Var2.setRoundRadius(AndroidUtilities.dp(24.0f));
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia2 = (TLRPC.TL_messageMediaPaidMedia) messageObject.messageOwner.media;
        if (tL_messageMediaPaidMedia2.extended_media.isEmpty()) {
            n6Var = n6Var2;
            m6Var = m6Var2;
            messageObject2 = messageObject;
            i17 = 17;
            i18 = 80;
        } else {
            TLRPC.MessageExtendedMedia messageExtendedMedia2 = tL_messageMediaPaidMedia2.extended_media.get(0);
            if (messageExtendedMedia2 instanceof TLRPC.TL_messageExtendedMediaPreview) {
                forDocument = ImageLocation.getForObject(((TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia2).thumb, messageObject.messageOwner);
                o9Var = o9Var2;
            } else {
                if (messageExtendedMedia2 instanceof TLRPC.TL_messageExtendedMedia) {
                    TLRPC.MessageMedia messageMedia = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia2).media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                        o9Var = o9Var2;
                        forDocument = ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(messageMedia.photo.sizes, AndroidUtilities.dp(80.0f), true), messageMedia.photo);
                    } else {
                        o9Var = o9Var2;
                        if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                            forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(messageMedia.document.thumbs, AndroidUtilities.dp(80.0f), true), messageMedia.document);
                        }
                        n6Var = n6Var2;
                        m6Var = m6Var2;
                        i17 = 17;
                        i18 = 80;
                        o9Var2 = o9Var;
                        o9Var2.l(forDocument, "80_80_b2", null, null, null, messageObject);
                        messageObject2 = messageObject;
                    }
                } else {
                    o9Var = o9Var2;
                }
                forDocument = null;
                n6Var = n6Var2;
                m6Var = m6Var2;
                i17 = 17;
                i18 = 80;
                o9Var2 = o9Var;
                o9Var2.l(forDocument, "80_80_b2", null, null, null, messageObject);
                messageObject2 = messageObject;
            }
            n6Var = n6Var2;
            m6Var = m6Var2;
            i17 = 17;
            i18 = 80;
            o9Var2 = o9Var;
            o9Var2.l(forDocument, "80_80_b2", null, null, null, messageObject);
            messageObject2 = messageObject;
        }
        frameLayout.addView(o9Var2, h7.z5.e(i18, i18, i17));
        i10 = -1;
        f10 = 13.0f;
        i11 = 0;
        da daVar2 = new da(context2, i21, c6VarI);
        h7.b6.a(daVar2);
        daVar2.setOnClickListener(new k8(daVar2, i11));
        frameLayout.addView(daVar2, h7.z5.d(-2, -2.0f, 53, 0.0f, 0.0f, -8.0f, 0.0f));
        linearLayoutG.addView(frameLayout, h7.z5.q(i10, 117, 7));
        textViewH = org.telegram.messenger.y1.h(context2, 1, 20.0f);
        textViewH.setTypeface(AndroidUtilities.bold());
        int i29 = org.telegram.ui.ActionBar.g6.f23161j5;
        textViewH.setTextColor(org.telegram.ui.ActionBar.g6.v0(i29, c6VarI));
        if (i20 > 0) {
            if (webDocument != null) {
                string2 = str3;
            } else {
                string2 = LocaleController.getString(R.string.StarsConfirmSubscriptionTitle);
            }
            textViewH.setText(Emoji.replaceEmoji(string2, textViewH.getPaint().getFontMetricsInt(), i11));
        } else {
            if (webDocument != null) {
                string = str3;
            } else {
                string = LocaleController.getString(R.string.StarsConfirmPurchaseTitle);
            }
            textViewH.setText(Emoji.replaceEmoji(string, textViewH.getPaint().getFontMetricsInt(), i11));
        }
        NotificationCenter.listenEmojiLoading(textViewH);
        textViewH.setGravity(17);
        if (webDocument != null) {
            i12 = -8;
        } else {
            i12 = 8;
        }
        linearLayoutG.addView(textViewH, h7.z5.t(-2, -2, 1, 0, i12, 0, 0));
        if (webDocument != null) {
            LinearLayout linearLayoutG3 = org.telegram.messenger.y1.g(context2, i11);
            linearLayoutG3.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(28.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f22999a7, c6VarI)));
            org.telegram.ui.Components.n9 n9Var4 = new org.telegram.ui.Components.n9(context2);
            n9Var4.setRoundRadius(AndroidUtilities.dp(14.0f));
            org.telegram.ui.Components.y8 y8Var3 = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
            y8Var3.r(user3);
            n9Var4.e(user3, y8Var3);
            linearLayoutG3.addView(n9Var4, h7.z5.n(28, 28));
            TextView textView3 = new TextView(context2);
            textView3.setTextSize(1, f10);
            textView3.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6VarI));
            textView3.setText(UserObject.getUserName(user3));
            linearLayoutG3.addView(textView3, h7.z5.t(-2, -2, 16, 6, 0, 10, 0));
            linearLayoutG.addView(linearLayoutG3, h7.z5.t(-2, 28, 1, 0, 8, 0, 2));
        }
        textViewH2 = org.telegram.messenger.y1.h(context2, 1, 14.0f);
        textViewH2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i29, c6VarI));
        if (messageObject2 == null) {
            j10 = r11;
            if (i20 > 0) {
                String userName5 = UserObject.getUserName(user3);
                Object[] objArr9 = new Object[2];
                objArr9[i11] = str3;
                objArr9[1] = userName5;
                textViewH2.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsConfirmSubscriptionText2", (int) j10, objArr9)));
            } else {
                String userName6 = UserObject.getUserName(user3);
                Object[] objArr10 = new Object[2];
                objArr10[i11] = str3;
                objArr10[1] = userName6;
                textViewH2.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsConfirmPurchaseText2", (int) j10, objArr10)));
            }
        } else {
            j10 = r11;
            if (i20 > 0) {
                String userName7 = UserObject.getUserName(user3);
                Object[] objArr11 = new Object[2];
                objArr11[i11] = str3;
                objArr11[1] = userName7;
                textViewH2.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsConfirmSubscriptionText2", (int) j10, objArr11)));
            } else {
                String userName8 = UserObject.getUserName(user3);
                Object[] objArr12 = new Object[2];
                objArr12[i11] = str3;
                objArr12[1] = userName8;
                textViewH2.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsConfirmPurchaseText2", (int) j10, objArr12)));
            }
        }
        textViewH2.setMaxWidth(lh.w3.a(textViewH2.getText(), textViewH2.getPaint()));
        textViewH2.setGravity(17);
        linearLayoutG.addView(textViewH2, h7.z5.t(-2, -2, 1, 0, 6, 0, 18));
        dVar = new lh.d(context2, c6VarI, true);
        if (i20 > 0) {
            dVar.g(oa.Q0(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsConfirmSubscriptionButton", (int) j10))), i11, true);
        } else {
            dVar.g(oa.Q0(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsConfirmPurchaseButton", (int) j10))), i11, true);
        }
        linearLayoutG.addView(dVar, h7.z5.c(48.0f, -1));
        p80 p80Var2 = new p80(context2, c6VarI);
        p80Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23441z6, c6VarI));
        p80Var2.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, c6VarI));
        p80Var2.setTextSize(1, 14.0f);
        if (i20 > 0) {
            i13 = R.string.StarsConfirmSubscriptionTOS;
        } else {
            i13 = R.string.StarsConfirmPurchaseTOS;
        }
        p80Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(i13), new e2.e(context2, 6)));
        p80Var2.setGravity(17);
        linearLayoutG.addView(p80Var2, h7.z5.k(0.0f, 12.0f, 0.0f, 2.0f, -1, -2));
        org.telegram.ui.ActionBar.e3 e3Var3 = e3Var;
        e3Var3.customView = linearLayoutG;
        dVar.setOnClickListener(new gg.f(m6Var, e3Var3, dVar, 7));
        e3Var3.setOnDismissListener(new ag.j0(n6Var, 3));
        e3Var3.fixNavigationBar();
        e3Var3.show();
    }

    public final void Z(final String str, final TLRPC.ChatInvite chatInvite, final Utilities.Callback2 callback2) {
        if (chatInvite == null || chatInvite.subscription_pricing == null) {
            return;
        }
        final Context context = ApplicationLoader.applicationContext;
        final org.telegram.ui.ActionBar.c6 c6VarI = I();
        if (context == null) {
            return;
        }
        final long j10 = chatInvite.subscription_pricing.amount;
        final String str2 = chatInvite.title;
        TLRPC.TL_inputInvoiceChatInviteSubscription tL_inputInvoiceChatInviteSubscription = new TLRPC.TL_inputInvoiceChatInviteSubscription();
        tL_inputInvoiceChatInviteSubscription.hash = str;
        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
        tL_payments_sendStarsForm.form_id = chatInvite.subscription_form_id;
        tL_payments_sendStarsForm.invoice = tL_inputInvoiceChatInviteSubscription;
        ConnectionsManager.getInstance(this.f10151a).sendRequest(tL_payments_sendStarsForm, new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final u7 u7Var = this.f10285a;
                final Utilities.Callback2 callback3 = callback2;
                final long j11 = j10;
                final String str3 = str2;
                final Context context2 = context;
                final org.telegram.ui.ActionBar.c6 c6Var = c6VarI;
                final TLRPC.ChatInvite chatInvite2 = chatInvite;
                final String str4 = str;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        pa0 pa0Var;
                        u7 u7Var2 = u7Var;
                        TLObject tLObject2 = tLObject;
                        Utilities.Callback2 callback4 = callback3;
                        long j12 = j11;
                        String str5 = str3;
                        TLRPC.TL_error tL_error2 = tL_error;
                        Context context3 = context2;
                        org.telegram.ui.ActionBar.c6 c6Var2 = c6Var;
                        TLRPC.ChatInvite chatInvite3 = chatInvite2;
                        String str6 = str4;
                        org.telegram.ui.ActionBar.n2 n2VarR = LaunchActivity.R();
                        mc mcVarA0 = !AndroidUtilities.hasDialogOnTop(n2VarR) ? mc.a0(n2VarR) : mc.X();
                        int i10 = 0;
                        if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                            if (tL_error2 == null || !"BALANCE_TOO_LOW".equals(tL_error2.text)) {
                                callback4.run(0L, Boolean.FALSE);
                                org.telegram.ui.Cells.pa.r(R.string.UnknownErrorCode, new Object[]{tL_error2 != null ? tL_error2.text : "FAILED_SEND_STARS"}, mcVarA0, R.raw.error, 36);
                                return;
                            } else if (!MessagesController.getInstance(u7Var2.f10151a).starsPurchaseAvailable()) {
                                callback4.run(0L, Boolean.FALSE);
                                u7.e0(context3, c6Var2);
                                return;
                            } else {
                                boolean[] zArr = {false};
                                ea eaVar = new ea(context3, c6Var2, j12, 1, chatInvite3.title, new cg.k0(u7Var2, zArr, str6, chatInvite3, callback4, 8), 0L);
                                eaVar.setOnDismissListener(new i6(callback4, zArr, 0));
                                eaVar.show();
                                return;
                            }
                        }
                        TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject2;
                        Utilities.stageQueue.postRunnable(new h6(u7Var2, tL_payments_paymentResult, i10));
                        TLRPC.Updates updates = tL_payments_paymentResult.updates;
                        TLRPC.Update update = updates.update;
                        long j13 = update instanceof TL_update.TL_updateChannel ? -((TL_update.TL_updateChannel) update).channel_id : 0L;
                        if (updates.updates != null) {
                            for (int i11 = 0; i11 < tL_payments_paymentResult.updates.updates.size(); i11++) {
                                if (tL_payments_paymentResult.updates.updates.get(i11) instanceof TL_update.TL_updateChannel) {
                                    j13 = -((TL_update.TL_updateChannel) tL_payments_paymentResult.updates.updates.get(i11)).channel_id;
                                }
                            }
                        }
                        callback4.run(Long.valueOf(j13), Boolean.TRUE);
                        if (j13 == 0) {
                            mcVarA0.M(LocaleController.getString(R.string.StarsSubscriptionCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscriptionCompletedText", (int) j12, str5)), R.raw.stars_send).j();
                        }
                        LaunchActivity launchActivity = LaunchActivity.C1;
                        if (launchActivity != null && (pa0Var = launchActivity.f35535t0) != null) {
                            pa0Var.c(true);
                        }
                        u7Var2.T(true);
                        u7Var2.S();
                    }
                });
            }
        });
    }

    public final void a0(final MessageObject messageObject, final TLRPC.InputInvoice inputInvoice, final TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, final Utilities.Callback callback) {
        long dialogId;
        String userName;
        TLRPC.User user;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        if (tL_payments_paymentFormStars == null) {
            return;
        }
        final Context context = ApplicationLoader.applicationContext;
        final org.telegram.ui.ActionBar.c6 c6VarI = I();
        if (context == null) {
            return;
        }
        ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStars.invoice.prices;
        int size = arrayList.size();
        final long j10 = 0;
        int i10 = 0;
        while (i10 < size) {
            TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i10);
            i10++;
            j10 += tL_labeledPrice.amount;
        }
        if (messageObject != null) {
            TLRPC.Message message = messageObject.messageOwner;
            dialogId = (message == null || (messageFwdHeader = message.fwd_from) == null || (peer = messageFwdHeader.from_id) == null) ? messageObject.getDialogId() : DialogObject.getPeerDialogId(peer);
            if (dialogId < 0 && messageObject.getFromChatId() > 0 && (user = MessagesController.getInstance(this.f10151a).getUser(Long.valueOf(messageObject.getFromChatId()))) != null && user.bot) {
                dialogId = user.f22527id;
            }
        } else {
            dialogId = tL_payments_paymentFormStars.bot_id;
        }
        final long j11 = dialogId;
        if (j11 >= 0) {
            userName = UserObject.getUserName(MessagesController.getInstance(this.f10151a).getUser(Long.valueOf(j11)));
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(this.f10151a).getChat(Long.valueOf(-j11));
            userName = chat == null ? "" : chat.title;
        }
        final String str = userName;
        final String str2 = tL_payments_paymentFormStars.title;
        final int i11 = tL_payments_paymentFormStars.invoice.subscription_period;
        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
        tL_payments_sendStarsForm.form_id = tL_payments_paymentFormStars.form_id;
        tL_payments_sendStarsForm.invoice = inputInvoice;
        ConnectionsManager.getInstance(this.f10151a).sendRequest(tL_payments_sendStarsForm, new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final u7 u7Var = this.f9088a;
                final Utilities.Callback callback2 = callback;
                final MessageObject messageObject2 = messageObject;
                final Context context2 = context;
                final long j12 = j10;
                final String str3 = str;
                final int i12 = i11;
                final String str4 = str2;
                final TLRPC.InputInvoice inputInvoice2 = inputInvoice;
                final long j13 = j11;
                final org.telegram.ui.ActionBar.c6 c6Var = c6VarI;
                final TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars2 = tL_payments_paymentFormStars;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        LaunchActivity launchActivity;
                        pa0 pa0Var;
                        TLRPC.Message message2;
                        u7 u7Var2 = u7Var;
                        TLObject tLObject2 = tLObject;
                        Utilities.Callback callback3 = callback2;
                        MessageObject messageObject3 = messageObject2;
                        Context context3 = context2;
                        long j14 = j12;
                        String str5 = str3;
                        int i13 = i12;
                        String str6 = str4;
                        TLRPC.InputInvoice inputInvoice3 = inputInvoice2;
                        long j15 = j13;
                        TLRPC.TL_error tL_error2 = tL_error;
                        org.telegram.ui.ActionBar.c6 c6Var2 = c6Var;
                        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars3 = tL_payments_paymentFormStars2;
                        org.telegram.ui.ActionBar.n2 n2VarR = LaunchActivity.R();
                        mc mcVarX = (n2VarR == null || n2VarR.visibleDialog != null) ? mc.X() : mc.a0(n2VarR);
                        if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                            if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                                if (!MessagesController.getInstance(u7Var2.f10151a).starsPurchaseAvailable()) {
                                    callback3.run(Boolean.FALSE);
                                    u7.e0(context3, c6Var2);
                                    return;
                                } else {
                                    boolean[] zArr = {false};
                                    ea eaVar = new ea(context3, c6Var2, j14, 0, str5, new gh.i1(u7Var2, (Object) zArr, messageObject3, inputInvoice3, tL_payments_paymentFormStars3, callback3, 6), j15);
                                    eaVar.setOnDismissListener(new h7(callback3, zArr));
                                    eaVar.show();
                                    return;
                                }
                            }
                            if (tL_error2 != null && "FORM_EXPIRED".equals(tL_error2.text)) {
                                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                                JSONObject jSONObjectP = nh.b3.p(c6Var2, false);
                                if (jSONObjectP != null) {
                                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                                    tL_dataJSON.data = jSONObjectP.toString();
                                    tL_payments_getPaymentForm.flags |= 1;
                                }
                                tL_payments_getPaymentForm.invoice = inputInvoice3;
                                ConnectionsManager.getInstance(u7Var2.f10151a).sendRequest(tL_payments_getPaymentForm, new cg.e0(u7Var2, messageObject3, inputInvoice3, callback3, mcVarX, 2));
                                return;
                            }
                            mc mcVar = mcVarX;
                            callback3.run(Boolean.FALSE);
                            org.telegram.ui.Cells.pa.r(R.string.UnknownErrorCode, new Object[]{tL_error2 != null ? tL_error2.text : "FAILED_SEND_STARS"}, mcVar, R.raw.error, 36);
                            if (messageObject3 != null) {
                                TLRPC.TL_messages_getExtendedMedia tL_messages_getExtendedMedia = new TLRPC.TL_messages_getExtendedMedia();
                                tL_messages_getExtendedMedia.peer = MessagesController.getInstance(u7Var2.f10151a).getInputPeer(j15);
                                tL_messages_getExtendedMedia.f22469id.add(Integer.valueOf(messageObject3.getId()));
                                ConnectionsManager.getInstance(u7Var2.f10151a).sendRequest(tL_messages_getExtendedMedia, null);
                                return;
                            }
                            return;
                        }
                        callback3.run(Boolean.TRUE);
                        Utilities.stageQueue.postRunnable(new h6(u7Var2, (TLRPC.TL_payments_paymentResult) tLObject2, 4));
                        if (messageObject3 == null || (message2 = messageObject3.messageOwner) == null || !(message2.media instanceof TLRPC.TL_messageMediaPaidMedia)) {
                            if (i13 > 0) {
                                mcVarX.M(LocaleController.getString(R.string.StarsBotSubscriptionCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsBotSubscriptionCompletedInfo", (int) j14, str6, str5)), R.raw.stars_send).j();
                            } else {
                                z10 = true;
                                mcVarX.M(LocaleController.getString(R.string.StarsPurchaseCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsPurchaseCompletedInfo", (int) j14, str6, str5)), R.raw.stars_send).j();
                            }
                            launchActivity = LaunchActivity.C1;
                            if (launchActivity != null && (pa0Var = launchActivity.f35535t0) != null) {
                                pa0Var.c(z10);
                            }
                            if ((inputInvoice3 instanceof TLRPC.TL_inputInvoiceStars) || !(((TLRPC.TL_inputInvoiceStars) inputInvoice3).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift)) {
                                u7Var2.T(true);
                            }
                            if (messageObject3 != null) {
                                TLRPC.TL_messages_getExtendedMedia tL_messages_getExtendedMedia2 = new TLRPC.TL_messages_getExtendedMedia();
                                tL_messages_getExtendedMedia2.peer = MessagesController.getInstance(u7Var2.f10151a).getInputPeer(j15);
                                tL_messages_getExtendedMedia2.f22469id.add(Integer.valueOf(messageObject3.getId()));
                                ConnectionsManager.getInstance(u7Var2.f10151a).sendRequest(tL_messages_getExtendedMedia2, null);
                            }
                        }
                        Drawable drawableMutate = context3.getResources().getDrawable(R.drawable.star_small_inner).mutate();
                        String string = LocaleController.getString(R.string.StarsMediaPurchaseCompleted);
                        SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsMediaPurchaseCompletedInfo", (int) j14, str5));
                        mcVarX.getClass();
                        bc bcVar = new bc(mcVarX.W(), mcVarX.f30645c);
                        bcVar.f27063a.setImageDrawable(drawableMutate);
                        bcVar.f27064b.setText(string);
                        bcVar.f27065c.setText(spannableStringBuilderReplaceTags);
                        mcVarX.b(bcVar, 2750).j();
                        z10 = true;
                        launchActivity = LaunchActivity.C1;
                        if (launchActivity != null) {
                            pa0Var.c(z10);
                        }
                        if (inputInvoice3 instanceof TLRPC.TL_inputInvoiceStars) {
                            u7Var2.T(true);
                        } else {
                            u7Var2.T(true);
                        }
                        if (messageObject3 != null) {
                            TLRPC.TL_messages_getExtendedMedia tL_messages_getExtendedMedia3 = new TLRPC.TL_messages_getExtendedMedia();
                            tL_messages_getExtendedMedia3.peer = MessagesController.getInstance(u7Var2.f10151a).getInputPeer(j15);
                            tL_messages_getExtendedMedia3.f22469id.add(Integer.valueOf(messageObject3.getId()));
                            ConnectionsManager.getInstance(u7Var2.f10151a).sendRequest(tL_messages_getExtendedMedia3, null);
                        }
                    }
                });
            }
        });
    }

    public final void b0(long j10, long j11, boolean z10) {
        int i10 = this.f10151a;
        TopicsController topicsController = MessagesController.getInstance(i10).getTopicsController();
        TLRPC.TL_forumTopic tL_forumTopicFindTopic = topicsController.findTopic(j10, j11);
        if (tL_forumTopicFindTopic != null) {
            tL_forumTopicFindTopic.nopaid_messages_exception = z10;
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
                this.R.put(Integer.valueOf(id2), new androidx.car.app.utils.a(this, hashSet, runnable, 28));
                z10 = true;
            }
        }
        return !z10;
    }

    public final void c0(int i10, long j10, ArrayList arrayList) {
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.f10151a);
        messagesStorage.getStorageQueue().postRunnable(new x6(messagesStorage, j10, arrayList, i10));
    }

    public final void d(MessageObject messageObject) {
        boolean z10;
        TLRPC.Message message = messageObject.messageOwner;
        if (message == null) {
            return;
        }
        long j10 = message.paid_message_stars;
        if (j10 <= 0 || messageObject.isEphemeral()) {
            return;
        }
        q7 q7Var = this.N;
        if (q7Var == null || q7Var.f9926g <= 0 || !q7Var.f9931m || q7Var.f9932n || q7Var.f9933o) {
            if (!org.telegram.ui.Components.y4.d0(this.f10151a, messageObject.getDialogId())) {
                Long l10 = (Long) this.O.get(Long.valueOf(messageObject.getDialogId()));
                if (l10 == null || System.currentTimeMillis() - l10.longValue() <= 5000) {
                    Integer num = (Integer) this.P.get(Long.valueOf(messageObject.getDialogId()));
                    if ((num != null && num.intValue() >= 3) || j10 >= 100) {
                        z10 = true;
                    }
                }
            }
            z10 = false;
        } else {
            z10 = true;
        }
        int id2 = messageObject.getId();
        if (z10) {
            this.Q.add(Integer.valueOf(id2));
        }
        long dialogId = messageObject.getDialogId();
        o6 o6Var = new o6(0, this, z10);
        p6 p6Var = new p6(this, z10, id2, 0);
        org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
        q7 q7Var2 = this.N;
        if (q7Var2 != null && (q7Var2.f9933o || q7Var2.f9932n)) {
            this.N = null;
        }
        if (this.N != null) {
            if (n2VarU == null || n2VarU.isRemovingFromStack()) {
                this.N.a();
                this.N = null;
            } else {
                q7 q7Var3 = this.N;
                if (q7Var3.f9922b != dialogId || q7Var3.f9921a != n2VarU) {
                    this.N.a();
                    this.N = null;
                }
            }
        }
        if (n2VarU == null || n2VarU.isRemovingFromStack()) {
            p6Var.run();
            return;
        }
        if (this.N == null) {
            this.N = new q7(n2VarU, dialogId);
        }
        q7 q7Var4 = this.N;
        yb ybVar = q7Var4.d;
        cc ccVar = q7Var4.f9924e;
        p7 p7Var = q7Var4.f9934p;
        if (q7Var4.f9932n || q7Var4.f9933o) {
            p6Var.run();
            return;
        }
        q7Var4.f9926g++;
        q7Var4.f9929k.add(messageObject);
        q7Var4.h += j10;
        q7Var4.f9927i = o6Var;
        q7Var4.f9928j.add(p6Var);
        if (q7Var4.f9931m && !z10) {
            q7Var4.f9931m = false;
            AndroidUtilities.cancelRunOnUIThread(p7Var);
            ec ecVar = q7Var4.f9923c;
            ecVar.f28020j = 5000;
            ecVar.i(true);
            if (System.currentTimeMillis() - q7Var4.f9930l > 500) {
                ccVar.animate().alpha(0.0f).scaleX(0.3f).scaleY(0.3f).start();
            } else {
                ccVar.setAlpha(0.0f);
                ccVar.setVisibility(8);
            }
        }
        xb xbVar = q7Var4.f9925f;
        if (xbVar != null && q7Var4.f9931m) {
            xbVar.f34571b = 3000L;
            AndroidUtilities.cancelRunOnUIThread(p7Var);
            AndroidUtilities.runOnUIThread(p7Var, 3000L);
        }
        org.telegram.ui.Components.j6 j6Var = ybVar.f34876b;
        int i10 = q7Var4.f9926g;
        j6Var.setText(i10 == 1 ? LocaleController.getString(R.string.PaidMessageSentTitleOne) : LocaleController.formatPluralString("PaidMessageSentTitle", i10, new Object[0]));
        ybVar.f34877c.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("PaidMessageSentSubtitle", Math.max(0, (int) q7Var4.h))));
        ybVar.f34875a.d();
    }

    public final t7 d0(final MessageObject messageObject, final rn rnVar, final long j10, boolean z10, boolean z11, final Long l10) {
        final u7 u7Var;
        String forcedFirstName;
        o7 o7VarB = o7.b(messageObject);
        int i10 = this.f10151a;
        u7 u7VarY = y(i10, false);
        Context contextT = t(rnVar);
        if (contextT == null) {
            return null;
        }
        String forcedFirstName2 = "";
        if (z11 && u7VarY.f10154e && u7VarY.q(false, false, null).amount <= 0) {
            long jA = rnVar.a();
            if (jA >= 0) {
                forcedFirstName2 = UserObject.getForcedFirstName(rnVar.getMessagesController().getUser(Long.valueOf(jA)));
            } else {
                TLRPC.Chat chat = rnVar.getMessagesController().getChat(Long.valueOf(-jA));
                if (chat != null) {
                    forcedFirstName2 = chat.title;
                }
            }
            final int i11 = 0;
            new ea(contextT, rnVar.getResourceProvider(), j10, 5, forcedFirstName2, new Runnable(this) {

                public final u7 f9917b;

                {
                    this.f9917b = this;
                }

                @Override
                public final void run() {
                    switch (i11) {
                        case 0:
                            this.f9917b.d0(messageObject, rnVar, j10, true, true, l10);
                            break;
                        default:
                            this.f9917b.d0(messageObject, rnVar, j10, true, true, l10);
                            break;
                    }
                }
            }, 0L).show();
            return null;
        }
        t7 t7Var = this.B;
        if (t7Var == null || !t7Var.f10086a.equals(o7VarB)) {
            t7 t7Var2 = this.B;
            if (t7Var2 != null) {
                t7Var2.b();
            }
            ConnectionsManager.getInstance(i10).getCurrentTime();
            u7Var = this;
            t7 t7Var3 = new t7(u7Var, o7VarB, messageObject, rnVar, z10);
            u7Var.B = t7Var3;
            t7Var3.f10097n = l10;
        } else {
            u7Var = this;
        }
        if (u7Var.B.h + j10 > MessagesController.getInstance(i10).starsPaidReactionAmountMax) {
            u7Var.B.b();
            ConnectionsManager.getInstance(i10).getCurrentTime();
            u7Var.B = new t7(u7Var, o7VarB, messageObject, rnVar, z10);
        }
        final long j11 = u7Var.B.h + j10;
        if (z11 && u7VarY.f10154e && u7VarY.q(false, false, null).amount < j11) {
            u7Var.B.a();
            long jA2 = rnVar.a();
            if (jA2 >= 0) {
                forcedFirstName = UserObject.getForcedFirstName(rnVar.getMessagesController().getUser(Long.valueOf(jA2)));
            } else {
                TLRPC.Chat chat2 = rnVar.getMessagesController().getChat(Long.valueOf(-jA2));
                forcedFirstName = chat2 != null ? chat2.title : "";
            }
            final int i12 = 1;
            new ea(contextT, rnVar.getResourceProvider(), j11, 5, forcedFirstName, new Runnable(u7Var) {

                public final u7 f9917b;

                {
                    this.f9917b = u7Var;
                }

                @Override
                public final void run() {
                    switch (i12) {
                        case 0:
                            this.f9917b.d0(messageObject, rnVar, j11, true, true, l10);
                            break;
                        default:
                            this.f9917b.d0(messageObject, rnVar, j11, true, true, l10);
                            break;
                    }
                }
            }, 0L).show();
            return null;
        }
        t7 t7Var4 = u7Var.B;
        boolean z12 = !(messageObject == null || messageObject.doesPaidReactionExist()) || z10;
        r7 r7Var = t7Var4.f10099p;
        u7 u7Var2 = t7Var4.f10100q;
        int i13 = u7Var2.f10151a;
        yb ybVar = t7Var4.f10089e;
        MessageObject messageObject2 = t7Var4.f10087b;
        if (!t7Var4.f10092i && !t7Var4.f10093j) {
            t7Var4.h += j10;
            System.currentTimeMillis();
            ybVar.f34877c.a();
            ybVar.f34877c.c(AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSentText", (int) t7Var4.h, new Object[0])), true, true);
            if (t7Var4.f10096m) {
                t7Var4.f10090f.f34571b = 5000L;
                AndroidUtilities.cancelRunOnUIThread(r7Var);
                AndroidUtilities.runOnUIThread(r7Var, 5000L);
            }
            if (z12) {
                t7Var4.f10095l = true;
                messageObject2.addPaidReactions((int) j10, true, t7Var4.c());
                u7Var2.f10156g += j10;
                NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject2.getDialogId()), Integer.valueOf(messageObject2.getId()), messageObject2.messageOwner.reactions);
                NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
            } else {
                t7Var4.f10095l = false;
                if (messageObject2.ensurePaidReactionsExist(true)) {
                    t7Var4.f10094k--;
                }
                NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject2.getDialogId()), Integer.valueOf(messageObject2.getId()), messageObject2.messageOwner.reactions);
                t7Var4.f10094k += j10;
            }
            ybVar.f34876b.setText(t7Var4.d());
        } else if (BuildVars.DEBUG_PRIVATE_VERSION) {
            throw new RuntimeException("adding more amount to committed reactions");
        }
        t7 t7Var5 = u7Var.B;
        t7Var5.f10097n = l10;
        return t7Var5;
    }

    public final void f(Activity activity, TL_stars.TL_starsTopupOption tL_starsTopupOption, Utilities.Callback2 callback2, TLRPC.InputPeer inputPeer) {
        if (activity == null) {
            return;
        }
        int i10 = this.f10151a;
        if (!MessagesController.getInstance(i10).starsPurchaseAvailable()) {
            org.telegram.ui.ActionBar.n2 n2VarR = LaunchActivity.R();
            if (n2VarR == null || n2VarR.getContext() == null) {
                e0(activity, null);
                return;
            } else {
                e0(n2VarR.getContext(), n2VarR.getResourceProvider());
                return;
            }
        }
        boolean z10 = AppGlobalConfig.getInstance(i10).starsSpendTopUpInvoiceDisabled.get() && inputPeer != null;
        if ((!BuildVars.useInvoiceBilling() && BillingController.getInstance().isReady()) || z10) {
            if (!BillingController.getInstance().isReady()) {
                callback2.run(Boolean.FALSE, "INVOICE DISABLED");
                return;
            }
            TLRPC.TL_inputStorePaymentStarsTopup tL_inputStorePaymentStarsTopup = new TLRPC.TL_inputStorePaymentStarsTopup();
            tL_inputStorePaymentStarsTopup.stars = tL_starsTopupOption.stars;
            tL_inputStorePaymentStarsTopup.currency = tL_starsTopupOption.currency;
            tL_inputStorePaymentStarsTopup.amount = tL_starsTopupOption.amount;
            c9.b bVar = new c9.b();
            bVar.f2567c = "inapp";
            bVar.f2566b = tL_starsTopupOption.store_product;
            n2.o oVarA = bVar.a();
            FileLog.d("StarsController.buy starts queryProductDetails");
            BillingController.getInstance().queryProductDetails(Arrays.asList(oVarA), new a1.d(callback2, tL_inputStorePaymentStarsTopup, tL_starsTopupOption, activity, 2));
            return;
        }
        TLRPC.TL_inputStorePaymentStarsTopup tL_inputStorePaymentStarsTopup2 = new TLRPC.TL_inputStorePaymentStarsTopup();
        tL_inputStorePaymentStarsTopup2.stars = tL_starsTopupOption.stars;
        tL_inputStorePaymentStarsTopup2.amount = tL_starsTopupOption.amount;
        tL_inputStorePaymentStarsTopup2.currency = tL_starsTopupOption.currency;
        tL_inputStorePaymentStarsTopup2.spend_purpose_peer = inputPeer;
        TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
        tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsTopup2;
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        JSONObject jSONObjectP = nh.b3.p(I(), false);
        if (jSONObjectP != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = jSONObjectP.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
        ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getPaymentForm, new cg.y(this, callback2, tL_inputInvoiceStars, 9));
    }

    public final void f0(List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        MessageObject messageObject = (MessageObject) list.get(0);
        long dialogId = messageObject.getDialogId();
        int i10 = this.f10151a;
        if (dialogId >= 0) {
            MessagesController.getInstance(i10).loadFullUser(MessagesController.getInstance(i10).getUser(Long.valueOf(dialogId)), 0, true);
        } else {
            MessagesController.getInstance(i10).loadFullChat(-dialogId, 0, true);
        }
        mc.a0(LaunchActivity.U()).Q(R.raw.error, 36, oa.Q0(TextUtils.concat(LocaleController.formatPluralString("PaidMessagesSendErrorToast1", (int) messageObject.messageOwner.errorAllowedPriceStars, new Object[0]), " ", LocaleController.formatPluralString("PaidMessagesSendErrorToast2", (int) messageObject.messageOwner.errorNewPriceStars, new Object[0])))).j();
    }

    public final void g(final long j10, final TLObject tLObject, final TLRPC.TL_textWithEntities tL_textWithEntities, final Utilities.Callback2 callback2) {
        int i10;
        Context context = LaunchActivity.C1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        final Context context2 = context;
        final org.telegram.ui.ActionBar.c6 c6VarI = I();
        boolean z10 = tLObject instanceof TLRPC.TL_premiumGiftOption;
        if ((z10 || (tLObject instanceof TLRPC.TL_premiumGiftCodeOption)) && context2 != null) {
            if (!this.f10154e) {
                r(new gh.k1(this, callback2, j10, tLObject, tL_textWithEntities, 3));
                return;
            }
            if (z10) {
                i10 = ((TLRPC.TL_premiumGiftOption) tLObject).months;
            } else if (!(tLObject instanceof TLRPC.TL_premiumGiftCodeOption)) {
                return;
            } else {
                i10 = ((TLRPC.TL_premiumGiftCodeOption) tLObject).months;
            }
            final String name = DialogObject.getName(this.f10151a, j10);
            final TLRPC.TL_inputInvoicePremiumGiftStars tL_inputInvoicePremiumGiftStars = new TLRPC.TL_inputInvoicePremiumGiftStars();
            tL_inputInvoicePremiumGiftStars.user_id = MessagesController.getInstance(this.f10151a).getInputUser(j10);
            tL_inputInvoicePremiumGiftStars.months = i10;
            if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                tL_inputInvoicePremiumGiftStars.flags |= 1;
                tL_inputInvoicePremiumGiftStars.message = tL_textWithEntities;
            }
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject jSONObjectP = nh.b3.p(c6VarI, false);
            if (jSONObjectP != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = jSONObjectP.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoicePremiumGiftStars;
            ConnectionsManager.getInstance(this.f10151a).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                    final u7 u7Var = this.f9004a;
                    final Utilities.Callback2 callback3 = callback2;
                    final TLRPC.TL_inputInvoicePremiumGiftStars tL_inputInvoicePremiumGiftStars2 = tL_inputInvoicePremiumGiftStars;
                    final Context context3 = context2;
                    final org.telegram.ui.ActionBar.c6 c6Var = c6VarI;
                    final String str = name;
                    final long j11 = j10;
                    final TLObject tLObject3 = tLObject;
                    final TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_textWithEntities;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            TLObject tLObject4 = tLObject2;
                            boolean z11 = tLObject4 instanceof TLRPC.TL_payments_paymentFormStars;
                            Utilities.Callback2 callback4 = callback3;
                            if (!z11) {
                                TLRPC.TL_error tL_error2 = tL_error;
                                u7.e(tL_error2 == null ? "NO_PAYMENT_FORM" : tL_error2.text);
                                callback4.run(Boolean.FALSE, null);
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
                            u7 u7Var2 = u7Var;
                            ConnectionsManager.getInstance(u7Var2.f10151a).sendRequest(tL_payments_sendStarsForm, new f6(u7Var2, callback4, context3, c6Var, j12, str, j11, tLObject3, tL_textWithEntities2));
                        }
                    });
                }
            });
        }
    }

    public final void g0(LaunchActivity launchActivity, long j10, String str) {
        if (this.f10154e) {
            h0(launchActivity, j10, str);
        } else {
            r(new e2(this, (Object) launchActivity, j10, (Object) str, 7));
        }
    }

    public final void h(TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, Utilities.Callback2 callback2) {
        Context context = LaunchActivity.C1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        Context context2 = context;
        org.telegram.ui.ActionBar.c6 c6VarI = I();
        if (starGift == null || context2 == null) {
            return;
        }
        if (!this.f10154e) {
            r(new gh.k1(this, callback2, tL_payments_paymentFormStarGift, starGift, j10, 4));
            return;
        }
        String name = DialogObject.getName(this.f10151a, j10);
        TLRPC.TL_inputInvoiceStarGiftResale tL_inputInvoiceStarGiftResale = new TLRPC.TL_inputInvoiceStarGiftResale();
        tL_inputInvoiceStarGiftResale.slug = starGift.slug;
        tL_inputInvoiceStarGiftResale.to_id = MessagesController.getInstance(this.f10151a).getInputPeer(j10);
        tL_inputInvoiceStarGiftResale.ton = this.f10152b;
        tL_inputInvoiceStarGiftResale.message = tL_textWithEntities;
        tL_inputInvoiceStarGiftResale.show_name = !z10;
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        int i10 = 0;
        JSONObject jSONObjectP = nh.b3.p(c6VarI, false);
        if (jSONObjectP != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = jSONObjectP.toString();
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
        ConnectionsManager.getInstance(this.f10151a).sendRequest(tL_payments_sendStarsForm, new f6(this, callback2, context2, c6VarI, j11, name, tL_payments_paymentFormStarGift, starGift, j10));
    }

    public final void h0(LaunchActivity launchActivity, long j10, String str) {
        if (p().amount < j10 && j10 > 0) {
            new ea(launchActivity, null, j10, 4, str, new ag.l3(7), 0L).show();
            return;
        }
        org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
        if (n2VarU == null) {
            return;
        }
        ec ecVarJ = mc.a0(n2VarU).J(R.raw.stars_topup, LocaleController.getString(R.string.StarsTopupLinkEnough), LocaleController.getString(R.string.StarsTopupLinkTopupAnyway), new ag.l3(6));
        ecVarJ.f28020j = 5000;
        ecVarJ.k(true);
    }

    public final void i(final TL_stars.StarGift starGift, final boolean z10, final boolean z11, final long j10, final TLRPC.TL_textWithEntities tL_textWithEntities, final gh.z5 z5Var) {
        Context context = LaunchActivity.C1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        final Context context2 = context;
        final org.telegram.ui.ActionBar.c6 c6VarI = I();
        if (starGift == null || context2 == null) {
            return;
        }
        if (!this.f10154e) {
            r(new Runnable() {
                @Override
                public final void run() {
                    u7 u7Var = this.f10141a;
                    boolean z12 = u7Var.f10154e;
                    gh.z5 z5Var2 = z5Var;
                    if (z12) {
                        u7Var.i(starGift, z10, z11, j10, tL_textWithEntities, z5Var2);
                    } else {
                        u7.e("NO_BALANCE");
                        z5Var2.run(Boolean.FALSE, null);
                    }
                }
            });
            return;
        }
        final String name = DialogObject.getName(this.f10151a, j10);
        final TLRPC.TL_inputInvoiceStarGift tL_inputInvoiceStarGift = new TLRPC.TL_inputInvoiceStarGift();
        tL_inputInvoiceStarGift.hide_name = z10;
        tL_inputInvoiceStarGift.peer = MessagesController.getInstance(this.f10151a).getInputPeer(j10);
        tL_inputInvoiceStarGift.gift_id = starGift.f22607id;
        tL_inputInvoiceStarGift.include_upgrade = z11;
        if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
            tL_inputInvoiceStarGift.flags |= 2;
            tL_inputInvoiceStarGift.message = tL_textWithEntities;
        }
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        JSONObject jSONObjectP = nh.b3.p(c6VarI, false);
        if (jSONObjectP != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = jSONObjectP.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGift;
        ConnectionsManager.getInstance(this.f10151a).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final u7 u7Var = this.f10228a;
                final gh.z5 z5Var2 = z5Var;
                final TLRPC.TL_inputInvoiceStarGift tL_inputInvoiceStarGift2 = tL_inputInvoiceStarGift;
                final Context context3 = context2;
                final org.telegram.ui.ActionBar.c6 c6Var = c6VarI;
                final String str = name;
                final TL_stars.StarGift starGift2 = starGift;
                final boolean z12 = z10;
                final boolean z13 = z11;
                final long j11 = j10;
                final TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_textWithEntities;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        TLObject tLObject2 = tLObject;
                        boolean z14 = tLObject2 instanceof TLRPC.TL_payments_paymentFormStarGift;
                        final gh.z5 z5Var3 = z5Var2;
                        if (!z14) {
                            TLRPC.TL_error tL_error2 = tL_error;
                            u7.e(tL_error2 == null ? "NO_PAYMENT_FORM" : tL_error2.text);
                            z5Var3.run(Boolean.FALSE, null);
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
                        final u7 u7Var2 = u7Var;
                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(u7Var2.f10151a);
                        final Context context4 = context3;
                        final org.telegram.ui.ActionBar.c6 c6Var2 = c6Var;
                        final String str2 = str;
                        final TL_stars.StarGift starGift3 = starGift2;
                        final boolean z15 = z12;
                        final boolean z16 = z13;
                        final long j13 = j11;
                        final TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_textWithEntities2;
                        connectionsManager.sendRequest(tL_payments_sendStarsForm, new RequestDelegate() {
                            @Override
                            public final void run(final TLObject tLObject3, final TLRPC.TL_error tL_error3) {
                                final u7 u7Var3 = u7Var2;
                                final gh.z5 z5Var4 = z5Var3;
                                final Context context5 = context4;
                                final org.telegram.ui.ActionBar.c6 c6Var3 = c6Var2;
                                final long j14 = j12;
                                final String str3 = str2;
                                final TL_stars.StarGift starGift4 = starGift3;
                                final boolean z17 = z15;
                                final boolean z18 = z16;
                                final long j15 = j13;
                                final TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_textWithEntities3;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        int i11;
                                        SpannableStringBuilder spannableStringBuilderReplaceTags;
                                        pa0 pa0Var;
                                        ?? r10;
                                        char c10;
                                        u7 u7Var4 = u7Var3;
                                        TLObject tLObject4 = tLObject3;
                                        TLRPC.TL_error tL_error4 = tL_error3;
                                        gh.z5 z5Var5 = z5Var4;
                                        Context context6 = context5;
                                        org.telegram.ui.ActionBar.c6 c6Var4 = c6Var3;
                                        long j16 = j14;
                                        String str4 = str3;
                                        TL_stars.StarGift starGift5 = starGift4;
                                        boolean z19 = z17;
                                        boolean z20 = z18;
                                        long j17 = j15;
                                        TLRPC.TL_textWithEntities tL_textWithEntities5 = tL_textWithEntities4;
                                        org.telegram.ui.ActionBar.n2 n2VarR = LaunchActivity.R();
                                        mc mcVarX = (n2VarR == null || n2VarR.visibleDialog != null) ? mc.X() : mc.a0(n2VarR);
                                        int i12 = 1;
                                        if (!(tLObject4 instanceof TLRPC.TL_payments_paymentResult)) {
                                            if (tL_error4 != null) {
                                                c10 = 0;
                                                if ("BALANCE_TOO_LOW".equals(tL_error4.text)) {
                                                    if (!MessagesController.getInstance(u7Var4.f10151a).starsPurchaseAvailable()) {
                                                        z5Var5.run(Boolean.FALSE, null);
                                                        u7.e0(context6, c6Var4);
                                                        return;
                                                    } else {
                                                        boolean[] zArr = {false};
                                                        ea eaVar = new ea(context6, c6Var4, j16, 6, str4, new k6(u7Var4, zArr, starGift5, z19, z20, j17, tL_textWithEntities5, z5Var5), 0L);
                                                        eaVar.setOnDismissListener(new cg.g(i12, z5Var5, zArr));
                                                        eaVar.show();
                                                        return;
                                                    }
                                                }
                                            } else {
                                                c10 = 0;
                                            }
                                            if (tL_error4 != null && "STARGIFT_USAGE_LIMITED".equals(tL_error4.text)) {
                                                z5Var5.run(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                                                return;
                                            }
                                            if (tL_error4 != null && "STARGIFT_USER_USAGE_LIMITED".equals(tL_error4.text)) {
                                                z5Var5.run(Boolean.FALSE, "STARGIFT_USER_USAGE_LIMITED");
                                                return;
                                            }
                                            z5Var5.run(Boolean.FALSE, null);
                                            int i13 = R.raw.error;
                                            int i14 = R.string.UnknownErrorCode;
                                            Object[] objArr = new Object[1];
                                            objArr[c10] = tL_error4 != null ? tL_error4.text : "FAILED_SEND_STARS";
                                            org.telegram.ui.Cells.pa.r(i14, objArr, mcVarX, i13, 36);
                                            return;
                                        }
                                        Utilities.stageQueue.postRunnable(new h6(u7Var4, (TLRPC.TL_payments_paymentResult) tLObject4, i12));
                                        u7Var4.D = false;
                                        u7Var4.E = true;
                                        u7Var4.G = 0L;
                                        u7Var4.V();
                                        u7Var4.Q(j17);
                                        u7Var4.T(true);
                                        z5Var5.run(Boolean.TRUE, null);
                                        if (BirthdayController.getInstance(u7Var4.f10151a).contains(j17)) {
                                            i11 = 0;
                                            MessagesController.getInstance(u7Var4.f10151a).getMainSettings().edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j17, false).apply();
                                        } else {
                                            i11 = 0;
                                        }
                                        if (starGift5 == null || !starGift5.limited_per_user) {
                                            spannableStringBuilderReplaceTags = null;
                                        } else {
                                            int i15 = starGift5.per_user_remains - 1;
                                            starGift5.per_user_remains = i15;
                                            spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2SentRemainsLimit", Math.max(i11, i15)));
                                        }
                                        if (j17 < 0) {
                                            long j18 = -j17;
                                            TLRPC.ChatFull chatFull = MessagesController.getInstance(u7Var4.f10151a).getChatFull(j18);
                                            if (chatFull != null) {
                                                chatFull.stargifts_count++;
                                                chatFull.flags2 |= 262144;
                                                MessagesController.getInstance(u7Var4.f10151a).putChatFull(chatFull);
                                            }
                                            if (n2VarR instanceof ProfileActivity) {
                                                ProfileActivity profileActivity = (ProfileActivity) n2VarR;
                                                if (profileActivity.a() == j17) {
                                                    hz0 hz0Var = profileActivity.K;
                                                    if (hz0Var != null) {
                                                        hz0Var.v1(true);
                                                        profileActivity.K.Y0(14);
                                                        r10 = 0;
                                                        profileActivity.G4(false);
                                                    } else {
                                                        r10 = 0;
                                                    }
                                                    mc mcVarA0 = mc.a0(n2VarR);
                                                    TLRPC.Document document = starGift5.sticker;
                                                    String string = LocaleController.getString(R.string.StarsGiftCompleted);
                                                    if (spannableStringBuilderReplaceTags == null) {
                                                        Object[] objArr2 = new Object[1];
                                                        objArr2[r10] = str4;
                                                        spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftCompletedChannelText", (int) j16, objArr2));
                                                    }
                                                    mcVarA0.s(document, string, spannableStringBuilderReplaceTags).k(r10);
                                                } else {
                                                    Bundle bundle = new Bundle();
                                                    bundle.putLong("chat_id", j18);
                                                    bundle.putBoolean("open_gifts", true);
                                                    ProfileActivity profileActivity2 = new ProfileActivity(bundle, null);
                                                    profileActivity2.whenFullyVisible(new gh.k1(profileActivity2, starGift5, spannableStringBuilderReplaceTags, j16, str4, 5));
                                                    n2VarR.presentFragment(profileActivity2);
                                                }
                                            } else {
                                                Bundle bundle2 = new Bundle();
                                                bundle2.putLong("chat_id", j18);
                                                bundle2.putBoolean("open_gifts", true);
                                                ProfileActivity profileActivity3 = new ProfileActivity(bundle2, null);
                                                profileActivity3.whenFullyVisible(new gh.k1(profileActivity3, starGift5, spannableStringBuilderReplaceTags, j16, str4, 5));
                                                n2VarR.presentFragment(profileActivity3);
                                            }
                                        } else {
                                            SpannableStringBuilder spannableStringBuilder = spannableStringBuilderReplaceTags;
                                            if ((n2VarR instanceof rn) && ((rn) n2VarR).a() == j17) {
                                                mc.a0(n2VarR).s(starGift5.sticker, LocaleController.getString(R.string.StarsGiftCompleted), spannableStringBuilder != null ? spannableStringBuilder : AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftCompletedText", (int) j16, new Object[0]))).k(true);
                                            } else {
                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(u7Var4.f10151a);
                                                int i16 = NotificationCenter.closeProfileActivity;
                                                Long lValueOf = Long.valueOf(j17);
                                                Boolean bool = Boolean.FALSE;
                                                notificationCenter.lambda$postNotificationNameOnUIThread$1(i16, lValueOf, bool);
                                                NotificationCenter.getInstance(u7Var4.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChatActivity, Long.valueOf(j17), bool);
                                                rn rnVarR9 = rn.R9(j17);
                                                rnVarR9.whenFullyVisible(new e2(rnVarR9, starGift5, spannableStringBuilder, j16, 6));
                                                n2VarR.presentFragment(rnVarR9);
                                            }
                                        }
                                        MessagesController.getInstance(u7Var4.f10151a).getMainSettings().edit().putBoolean("show_gift_for_" + j17, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j17, true).apply();
                                        LaunchActivity launchActivity = LaunchActivity.C1;
                                        if (launchActivity == null || (pa0Var = launchActivity.f35535t0) == null) {
                                            return;
                                        }
                                        pa0Var.c(true);
                                    }
                                });
                            }
                        });
                    }
                });
            }
        });
    }

    public final void i0(final long j10, final long j11, boolean z10, final boolean z11) {
        TL_account.toggleNoPaidMessagesException togglenopaidmessagesexception = new TL_account.toggleNoPaidMessagesException();
        int i10 = this.f10151a;
        togglenopaidmessagesexception.user_id = MessagesController.getInstance(i10).getInputUser(j10);
        if (j11 != 0) {
            togglenopaidmessagesexception.parent_peer = MessagesController.getInstance(i10).getInputPeer(j11);
        }
        togglenopaidmessagesexception.refund_charged = z10;
        togglenopaidmessagesexception.require_payment = !z11;
        ConnectionsManager.getInstance(i10).sendRequest(togglenopaidmessagesexception, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                AndroidUtilities.runOnUIThread(new z6(this.f9995a, tLObject, j11, j10, z11));
            }
        });
    }

    public final boolean j() {
        if (!this.f10152b) {
            return false;
        }
        if (mh.g.B0()) {
            return true;
        }
        TL_stars.StarsAmount starsAmountP = p();
        return (starsAmountP.nanos == 0 && starsAmountP.amount == 0) ? false : true;
    }

    public final void j0(String str, TLRPC.ChatInvite chatInvite, Utilities.Callback2 callback2) {
        if (chatInvite != null && chatInvite.subscription_pricing != null) {
            Context context = LaunchActivity.C1;
            if (context == null) {
                context = ApplicationLoader.applicationContext;
            }
            Context context2 = context;
            org.telegram.ui.ActionBar.c6 c6VarI = I();
            long j10 = chatInvite.subscription_pricing.amount;
            if (context2 != null) {
                int i10 = UserConfig.selectedAccount;
                boolean[] zArr = {false};
                e7 e7Var = new e7(this, j10, i10, zArr, callback2, context2, c6VarI, chatInvite, str);
                m5 m5Var = new m5(this, zArr, callback2);
                org.telegram.ui.ActionBar.e3 e3VarO = org.telegram.messenger.y1.o(context2, c6VarI, false, false);
                LinearLayout linearLayoutG = org.telegram.messenger.y1.g(context2, 1);
                linearLayoutG.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
                FrameLayout frameLayout = new FrameLayout(context2);
                frameLayout.addView(new m9(context2, 40, 0), h7.z5.c(-1.0f, -1));
                org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context2);
                n9Var.setRoundRadius(AndroidUtilities.dp(80.0f));
                org.telegram.ui.Components.y8 y8Var = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
                y8Var.s(chatInvite.color);
                String str2 = chatInvite.title;
                y8Var.A = true;
                y8Var.f34856n = 0;
                y8Var.f34855m = false;
                org.telegram.ui.Components.y8.a(str2, null, null, y8Var.f34859q);
                TLRPC.Photo photo = chatInvite.photo;
                if (photo != null) {
                    n9Var.h(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(80.0f)), chatInvite.photo), "80_80", y8Var, chatInvite);
                } else {
                    n9Var.setImageDrawable(y8Var);
                }
                frameLayout.addView(n9Var, h7.z5.e(80, 80, 17));
                Drawable drawable = context2.getResources().getDrawable(R.drawable.star_small_outline);
                int i11 = org.telegram.ui.ActionBar.g6.f23124h5;
                drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i11, c6VarI), PorterDuff.Mode.SRC_IN));
                Drawable drawable2 = context2.getResources().getDrawable(R.drawable.star_small_inner);
                ImageView imageView = new ImageView(context2);
                imageView.setImageDrawable(drawable);
                frameLayout.addView(imageView, h7.z5.e(26, 26, 17));
                imageView.setTranslationX(AndroidUtilities.dp(26.0f));
                imageView.setTranslationY(AndroidUtilities.dp(26.0f));
                imageView.setScaleX(1.2f);
                imageView.setScaleY(1.2f);
                ImageView imageView2 = new ImageView(context2);
                imageView2.setImageDrawable(drawable2);
                frameLayout.addView(imageView2, h7.z5.e(26, 26, 17));
                imageView2.setTranslationX(AndroidUtilities.dp(26.0f));
                imageView2.setTranslationY(AndroidUtilities.dp(26.0f));
                da daVar = new da(context2, i10, c6VarI);
                h7.b6.a(daVar);
                daVar.setOnClickListener(new k8(daVar, 1));
                frameLayout.addView(daVar, h7.z5.d(-2, -2.0f, 53, 0.0f, 0.0f, -8.0f, 0.0f));
                linearLayoutG.addView(frameLayout, h7.z5.q(-1, 117, 7));
                TextView textViewH = org.telegram.messenger.y1.h(context2, 1, 20.0f);
                textViewH.setTypeface(AndroidUtilities.bold());
                int i12 = org.telegram.ui.ActionBar.g6.f23161j5;
                textViewH.setTextColor(org.telegram.ui.ActionBar.g6.v0(i12, c6VarI));
                rl.i(R.string.StarsSubscribeTitle, textViewH, 17);
                TextView textViewI = org.telegram.ui.Cells.pa.i(linearLayoutG, textViewH, h7.z5.t(-2, -2, 1, 0, 8, 0, 0), context2);
                textViewI.setTextSize(1, 14.0f);
                textViewI.setTextColor(org.telegram.ui.ActionBar.g6.v0(i12, c6VarI));
                TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                int i13 = tL_starsSubscriptionPricing.period;
                if (i13 == 2592000) {
                    textViewI.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscribeText", (int) tL_starsSubscriptionPricing.amount, chatInvite.title)));
                } else {
                    textViewI.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscribeTextTest", (int) tL_starsSubscriptionPricing.amount, chatInvite.title, i13 == 300 ? "5 minutes" : "a minute")));
                }
                textViewI.setMaxWidth(lh.w3.a(textViewI.getText(), textViewI.getPaint()));
                textViewI.setGravity(17);
                linearLayoutG.addView(textViewI, h7.z5.t(-2, -2, 1, 0, 6, 0, 22));
                if (!TextUtils.isEmpty(chatInvite.about)) {
                    TextView textViewH2 = org.telegram.messenger.y1.h(context2, 1, 14.0f);
                    textViewH2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i12, c6VarI));
                    textViewH2.setText(Emoji.replaceEmoji(chatInvite.about, textViewH2.getPaint().getFontMetricsInt(), false));
                    textViewH2.setGravity(17);
                    linearLayoutG.addView(textViewH2, h7.z5.t(-2, -2, 1, 0, 6, 0, 22));
                }
                lh.d dVar = new lh.d(context2, c6VarI, true);
                dVar.g(LocaleController.getString(R.string.StarsSubscribeButton), false, true);
                linearLayoutG.addView(dVar, h7.z5.n(-1, 48));
                p80 p80Var = new p80(context2, c6VarI);
                p80Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsSubscribeInfo), new e2.e(context2, 9)));
                p80Var.setGravity(17);
                p80Var.setTextSize(1, 13.0f);
                p80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.B6, c6VarI));
                p80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, c6VarI));
                linearLayoutG.addView(p80Var, h7.z5.t(-1, -2, 49, 14, 14, 14, 6));
                e3VarO.customView = linearLayoutG;
                dVar.setOnClickListener(new gg.f(e7Var, e3VarO, dVar, 8));
                e3VarO.setOnDismissListener(new ag.j0(m5Var, 5));
                e3VarO.fixNavigationBar(org.telegram.ui.ActionBar.g6.v0(i11, c6VarI));
                org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                if (!AndroidUtilities.isTablet() && n2VarU != null && !AndroidUtilities.hasDialogOnTop(n2VarU)) {
                    e3VarO.makeAttached(n2VarU);
                }
                e3VarO.show();
            }
        }
    }

    public final void k0(TL_stars.StarsAmount starsAmount) {
        boolean zEquals = this.f10155f.equals(starsAmount);
        int i10 = this.f10151a;
        if (!zEquals) {
            this.f10155f = starsAmount;
            this.f10156g = 0L;
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        } else if (this.f10156g != 0) {
            this.f10156g = 0L;
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
        int i10 = this.f10151a;
        tL_messages_editMessage.peer = MessagesController.getInstance(i10).getInputPeer(dialogId);
        int i11 = tL_messages_editMessage.flags;
        tL_messages_editMessage.flags = 32768 | i11;
        tL_messages_editMessage.schedule_date = messageObject.messageOwner.date;
        tL_messages_editMessage.f22463id = id2;
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
                tL_inputPhoto.f22399id = photo.f22404id;
                tL_inputPhoto.access_hash = photo.access_hash;
                tL_inputPhoto.file_reference = photo.file_reference;
                tL_inputMediaPhoto.f22443id = tL_inputPhoto;
                tL_inputMediaPaidMedia.extended_media.add(tL_inputMediaPhoto);
            } else {
                tL_messageMediaPaidMedia = tL_messageMediaPaidMedia2;
                if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument = new TLRPC.TL_inputMediaDocument();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) messageMedia).document;
                    tL_inputDocument.f22392id = document.f22386id;
                    tL_inputDocument.access_hash = document.access_hash;
                    tL_inputDocument.file_reference = document.file_reference;
                    tL_inputMediaDocument.f22441id = tL_inputDocument;
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
                AndroidUtilities.runOnUIThread(new g7(this.f9011a, tLObject, runnable, tL_error, z10, dialogId, id2, messageObject, j10));
            }
        });
    }

    public final TL_stars.SavedStarGift n(long j10) {
        TL_stars.StarGift starGift;
        int i10 = 0;
        while (true) {
            LongSparseArray longSparseArray = this.L;
            if (i10 >= longSparseArray.size()) {
                return null;
            }
            m7 m7Var = (m7) longSparseArray.valueAt(i10);
            for (int i11 = 0; i11 < m7Var.f9753l.size(); i11++) {
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) m7Var.f9753l.get(i11);
                if (savedStarGift != null && (starGift = savedStarGift.gift) != null && starGift.f22607id == j10) {
                    return savedStarGift;
                }
            }
            i10++;
        }
    }

    public final TL_stars.StarsAmount p() {
        return q(true, false, null);
    }

    public final TL_stars.StarsAmount q(boolean z10, boolean z11, Runnable runnable) {
        if (((!this.f10154e || System.currentTimeMillis() - this.f10153c > 60000) && !this.d) || z11) {
            this.d = true;
            TL_stars.TL_payments_getStarsStatus tL_payments_getStarsStatus = new TL_stars.TL_payments_getStarsStatus();
            tL_payments_getStarsStatus.ton = this.f10152b;
            tL_payments_getStarsStatus.peer = new TLRPC.TL_inputPeerSelf();
            ConnectionsManager.getInstance(this.f10151a).sendRequest(tL_payments_getStarsStatus, new cg.g0(9, this, runnable));
        }
        if (!z10 || this.f10156g <= 0) {
            return this.f10155f;
        }
        hf.a aVarM = hf.a.m(this.f10155f);
        return hf.a.g(Math.max(0L, aVarM.a() - this.f10156g), aVarM.f8919a).o();
    }

    public final void r(Runnable runnable) {
        q(true, false, runnable);
    }

    public final hf.a s() {
        hf.a aVarL = hf.a.l(p());
        if (aVarL == null) {
            return hf.a.i(0L, this.f10152b ? hf.b.f8922b : hf.b.f8921a);
        }
        return aVarL;
    }

    public final ArrayList u() {
        if (this.f10159k || this.f10160l) {
            return this.f10161m;
        }
        this.f10159k = true;
        ConnectionsManager.getInstance(this.f10151a).sendRequest(new TL_stars.TL_payments_getStarsGiftOptions(), new l6(this, 3));
        return this.f10161m;
    }

    public final ArrayList v() {
        if (this.f10162n || this.f10163o) {
            return this.f10164p;
        }
        this.f10162n = true;
        ConnectionsManager.getInstance(this.f10151a).sendRequest(new TL_stars.TL_payments_getStarsGiveawayOptions(), new l6(this, 4));
        return this.f10164p;
    }

    public final ArrayList z() {
        if (this.h || this.f10157i) {
            return this.f10158j;
        }
        this.h = true;
        ConnectionsManager.getInstance(this.f10151a).sendRequest(new TL_stars.TL_payments_getStarsTopupOptions(), new l6(this, 2));
        return this.f10158j;
    }
}
