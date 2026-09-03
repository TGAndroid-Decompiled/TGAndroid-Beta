package lh;

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
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.qc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ai;
import org.telegram.ui.ya0;
import org.telegram.ui.zn;
import org.telegram.ui.zz0;
public final class t7 {
    public static volatile t7[][] S = (t7[][]) Array.newInstance(t7.class, 2, 4);
    public static final Object[][] T = (Object[][]) Array.newInstance(Object.class, 2, 4);
    public boolean A;
    public s7 B;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public long G;
    public p7 N;
    public final int f13133a;
    public final boolean f13134b;
    public long f13135c;
    public boolean d;
    public boolean e;
    public long f13137g;
    public boolean h;
    public boolean f13138i;
    public ArrayList f13139j;
    public boolean f13140k;
    public boolean f13141l;
    public ArrayList f13142m;
    public boolean f13143n;
    public boolean f13144o;
    public ArrayList f13145p;
    public String f13151w;
    public boolean f13152x;
    public boolean f13153y;
    public TL_stars.StarsAmount f13136f = TL_stars.StarsAmount.ofStars(0);
    public final ArrayList[] f13146q = {new ArrayList(), new ArrayList(), new ArrayList()};
    public final boolean[] f13147r = new boolean[3];
    public final String[] f13148s = new String[3];
    public final boolean[] f13149t = new boolean[3];
    public final boolean[] f13150u = new boolean[3];
    public final ArrayList v = new ArrayList();
    public final ArrayList f13154z = new ArrayList();
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

    public t7(int i10, boolean z4) {
        this.f13133a = i10;
        this.f13134b = z4;
    }

    public static org.telegram.ui.ActionBar.f6 I() {
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (U != null) {
            return U.getResourceProvider();
        }
        return null;
    }

    public static t7 L(int i10) {
        return y(i10, true);
    }

    public static boolean U(int i10, lf.a aVar) {
        if (aVar == null || x(i10, aVar.f12054a).s().f12055b >= aVar.f12055b) {
            return true;
        }
        return false;
    }

    public static void a(t7 t7Var, TL_stars.StarGifts starGifts) {
        ArrayList arrayList = t7Var.I;
        ArrayList arrayList2 = t7Var.J;
        int i10 = t7Var.f13133a;
        ArrayList arrayList3 = t7Var.H;
        t7Var.C = false;
        t7Var.D = true;
        if (starGifts instanceof TL_stars.TL_starGifts) {
            TL_stars.TL_starGifts tL_starGifts = (TL_stars.TL_starGifts) starGifts;
            MessagesController.getInstance(i10).putUsers(tL_starGifts.users, false);
            MessagesController.getInstance(i10).putChats(tL_starGifts.chats, false);
            MessagesStorage.getInstance(i10).putUsersAndChats(tL_starGifts.users, tL_starGifts.chats, true, true);
            arrayList3.clear();
            arrayList3.addAll(tL_starGifts.gifts);
            arrayList2.clear();
            arrayList2.addAll(arrayList3);
            Collections.sort(arrayList2, Comparator$EL.thenComparingInt(Comparator$CC.comparingInt(new kf.d(4)), new kf.d(5)));
            arrayList.clear();
            arrayList.addAll(arrayList3);
            Collections.sort(arrayList, Comparator$CC.comparingInt(new kf.d(6)));
            t7Var.F = tL_starGifts.hash;
            t7Var.G = System.currentTimeMillis();
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftsLoaded, new Object[0]);
            t7Var.c0(t7Var.F, t7Var.G, tL_starGifts.gifts);
        } else if (starGifts instanceof TL_stars.TL_starGiftsNotModified) {
            int i11 = t7Var.F;
            long currentTimeMillis = System.currentTimeMillis();
            t7Var.G = currentTimeMillis;
            t7Var.c0(i11, currentTimeMillis, arrayList3);
        }
    }

    public static void b(t7 t7Var, ArrayList arrayList, Integer num, Long l10, ArrayList arrayList2, ArrayList arrayList3) {
        int i10 = t7Var.f13133a;
        MessagesController.getInstance(i10).putUsers(arrayList2, true);
        MessagesController.getInstance(i10).putChats(arrayList3, true);
        t7Var.E = true;
        ArrayList arrayList4 = t7Var.H;
        arrayList4.clear();
        arrayList4.addAll(arrayList);
        ArrayList arrayList5 = t7Var.J;
        arrayList5.clear();
        arrayList5.addAll(arrayList4);
        Collections.sort(arrayList5, Comparator$EL.thenComparingInt(Comparator$CC.comparingInt(new kf.d(1)), new kf.d(2)));
        ArrayList arrayList6 = t7Var.I;
        arrayList6.clear();
        arrayList6.addAll(arrayList4);
        Collections.sort(arrayList6, Comparator$CC.comparingInt(new kf.d(3)));
        t7Var.F = num.intValue();
        t7Var.G = l10.longValue();
        t7Var.C = false;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftsLoaded, new Object[0]);
        t7Var.V();
    }

    public static void e(String str) {
        qc X;
        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
        if (R != null && R.visibleDialog == null) {
            X = qc.a0(R);
        } else {
            X = qc.X();
        }
        ai.r(R.string.UnknownErrorCode, new Object[]{str}, X, R.raw.error, 36);
    }

    public static void e0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        alertDialog$Builder.f19478a.O = LocaleController.getString(R.string.StarsNotAvailableTitle);
        alertDialog$Builder.f19478a.Q = LocaleController.getString(R.string.StarsNotAvailableText);
        kf.k0.C(R.string.OK, alertDialog$Builder, null);
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
            return tL_messages_forwardMessages.allow_paid_stars / tL_messages_forwardMessages.f19245id.size();
        } else if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
            return ((TLRPC.TL_messages_sendMedia) tLObject).allow_paid_stars;
        } else {
            return 0L;
        }
    }

    public static Context t(org.telegram.ui.ActionBar.p2 p2Var) {
        if (p2Var != null && p2Var.getContext() != null) {
            return p2Var.getContext();
        }
        LaunchActivity launchActivity = LaunchActivity.D1;
        if (launchActivity != null && !launchActivity.isFinishing()) {
            return LaunchActivity.D1;
        }
        if (ApplicationLoader.applicationContext != null) {
            return ApplicationLoader.applicationContext;
        }
        return null;
    }

    public static t7 w(int i10) {
        return y(i10, false);
    }

    public static t7 x(int i10, lf.b bVar) {
        boolean z4;
        if (bVar == lf.b.f12057b) {
            z4 = true;
        } else {
            z4 = false;
        }
        return y(i10, z4);
    }

    public static t7 y(int i10, boolean z4) {
        t7 t7Var;
        t7 t7Var2 = S[z4 ? 1 : 0][i10];
        if (t7Var2 == null) {
            synchronized (T[z4 ? 1 : 0][i10]) {
                try {
                    t7Var = S[z4 ? 1 : 0][i10];
                    if (t7Var == null) {
                        t7[] t7VarArr = S[z4 ? 1 : 0];
                        t7 t7Var3 = new t7(i10, z4);
                        t7VarArr[i10] = t7Var3;
                        t7Var = t7Var3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return t7Var;
        }
        return t7Var2;
    }

    public final long A(n7 n7Var, TLRPC.TL_messageReactions tL_messageReactions) {
        Long l10;
        s7 s7Var = this.B;
        if (s7Var != null && s7Var.f13063a.equals(n7Var) && (l10 = this.B.f13073n) != null) {
            return l10.longValue();
        }
        Long myPaidReactionPeer = MessageObject.getMyPaidReactionPeer(tL_messageReactions);
        if (myPaidReactionPeer != null) {
            return myPaidReactionPeer.longValue();
        }
        Long paidReactionsDialogId = MessagesController.getInstance(this.f13133a).getPaidReactionsDialogId();
        if (paidReactionsDialogId != null) {
            return paidReactionsDialogId.longValue();
        }
        return 0L;
    }

    public final long B(MessageObject messageObject) {
        Long myPaidReactionPeer;
        Long l10;
        s7 s7Var = this.B;
        if (s7Var != null && s7Var.f13063a.equals(n7.b(messageObject)) && (l10 = this.B.f13073n) != null) {
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
        Long paidReactionsDialogId = MessagesController.getInstance(this.f13133a).getPaidReactionsDialogId();
        if (paidReactionsDialogId != null) {
            return paidReactionsDialogId.longValue();
        }
        return 0L;
    }

    public final void C(long j10, long j11, Utilities.Callback callback) {
        TL_account.getPaidMessagesRevenue getpaidmessagesrevenue = new TL_account.getPaidMessagesRevenue();
        int i10 = this.f13133a;
        getpaidmessagesrevenue.user_id = MessagesController.getInstance(i10).getInputUser(j10);
        if (j11 != 0) {
            getpaidmessagesrevenue.parent_peer = MessagesController.getInstance(i10).getInputPeer(j11);
        }
        ConnectionsManager.getInstance(i10).sendRequest(getpaidmessagesrevenue, new v6(0, callback));
    }

    public final long D(int i10, long j10) {
        s7 s7Var = this.B;
        if (s7Var != null) {
            n7 n7Var = s7Var.f13063a;
            if (n7Var.f12836a == j10 && n7Var.f12837b == i10 && s7Var.f13071l) {
                return s7Var.h;
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

    public final j7 F(long j10, boolean z4) {
        LongSparseArray longSparseArray = this.K;
        j7 j7Var = (j7) longSparseArray.get(j10);
        if (j7Var == null && z4) {
            j7 j7Var2 = new j7(this.f13133a, j10);
            longSparseArray.put(j10, j7Var2);
            return j7Var2;
        }
        return j7Var;
    }

    public final l7 G(long j10, boolean z4) {
        LongSparseArray longSparseArray = this.L;
        l7 l7Var = (l7) longSparseArray.get(j10);
        if (l7Var == null && z4) {
            l7 l7Var2 = new l7(this.f13133a, j10, true);
            longSparseArray.put(j10, l7Var2);
            return l7Var2;
        }
        return l7Var;
    }

    public final void H(TL_stars.StarGift starGift, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z4, Utilities.Callback callback) {
        Context context = LaunchActivity.D1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        org.telegram.ui.ActionBar.f6 I = I();
        if (starGift != null && context != null) {
            if (!this.e) {
                r(new c2(this, callback, starGift, j10));
                return;
            }
            TLRPC.TL_inputInvoiceStarGiftResale tL_inputInvoiceStarGiftResale = new TLRPC.TL_inputInvoiceStarGiftResale();
            tL_inputInvoiceStarGiftResale.slug = starGift.slug;
            tL_inputInvoiceStarGiftResale.to_id = MessagesController.getInstance(this.f13133a).getInputPeer(j10);
            tL_inputInvoiceStarGiftResale.ton = this.f13134b;
            tL_inputInvoiceStarGiftResale.message = tL_textWithEntities;
            tL_inputInvoiceStarGiftResale.show_name = !z4;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject p10 = rh.p2.p(I, false);
            if (p10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = p10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftResale;
            ConnectionsManager.getInstance(this.f13133a).sendRequest(tL_payments_getPaymentForm, new dg.d3(9, this, callback));
        }
    }

    public final TL_stars.StarGift J(long j10) {
        V();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i10 < arrayList.size()) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList.get(i10);
                if (starGift.f19384id == j10) {
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
        ConnectionsManager.getInstance(this.f13133a).sendRequest(getstargiftupgradepreview, new gg.c0(this, j10, callback, 1));
    }

    public final void M(TL_stars.InputSavedStarGift inputSavedStarGift, Utilities.Callback callback) {
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(ApplicationLoader.applicationContext, 3, null);
        d2Var.q(200L);
        TL_stars.getSavedStarGift getsavedstargift = new TL_stars.getSavedStarGift();
        getsavedstargift.stargift.add(inputSavedStarGift);
        ConnectionsManager.getInstance(this.f13133a).sendRequest(getsavedstargift, new kh.b1(this, d2Var, inputSavedStarGift, callback, 3));
    }

    public final boolean N() {
        return O(0);
    }

    public final boolean O(int i10) {
        if (this.e && !this.f13146q[i10].isEmpty()) {
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
        l7 G = G(j10, false);
        if (G != null) {
            G.i(false);
        }
        j7 j7Var = (j7) this.K.get(j10);
        if (j7Var != null) {
            j7Var.g();
        }
    }

    public final void R(TLRPC.UserFull userFull) {
        long j10 = userFull.f19307id;
        l7 G = G(j10, false);
        if (G != null && G.f12758n != userFull.stargifts_count) {
            G.i(false);
        }
        j7 j7Var = (j7) this.K.get(j10);
        if (j7Var != null) {
            j7Var.g();
        }
    }

    public final void S() {
        if (this.f13152x) {
            return;
        }
        this.v.clear();
        this.f13151w = null;
        this.f13152x = false;
        this.f13153y = false;
        W();
    }

    public final void T(boolean z4) {
        for (int i10 = 0; i10 < 3; i10++) {
            boolean[] zArr = this.f13149t;
            if (!zArr[i10]) {
                this.f13146q[i10].clear();
                this.f13148s[i10] = null;
                zArr[i10] = false;
                this.f13150u[i10] = false;
                if (z4) {
                    X(i10);
                }
            }
        }
    }

    public final void V() {
        if (!this.C) {
            if (!this.D || System.currentTimeMillis() - this.G >= 60000) {
                this.C = true;
                boolean z4 = this.E;
                int i10 = this.f13133a;
                if (!z4) {
                    m5 m5Var = new m5(this, 0);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
                    messagesStorage.getStorageQueue().postRunnable(new gg.j0(messagesStorage, arrayList3, arrayList2, arrayList, m5Var, 9));
                    return;
                }
                int i11 = this.F;
                cg.h0 h0Var = new cg.h0(this, 21);
                TL_stars.getStarGifts getstargifts = new TL_stars.getStarGifts();
                getstargifts.hash = i11;
                ConnectionsManager.getInstance(i10).sendRequest(getstargifts, new ff.a(h0Var, 8));
            }
        }
    }

    public final void W() {
        if (!this.f13134b && !this.f13152x && !this.f13153y) {
            this.f13152x = true;
            TL_stars.TL_getStarsSubscriptions tL_getStarsSubscriptions = new TL_stars.TL_getStarsSubscriptions();
            tL_getStarsSubscriptions.peer = new TLRPC.TL_inputPeerSelf();
            String str = this.f13151w;
            tL_getStarsSubscriptions.offset = str;
            if (str == null) {
                tL_getStarsSubscriptions.offset = "";
            }
            ConnectionsManager.getInstance(this.f13133a).sendRequest(tL_getStarsSubscriptions, new j6(this, 1));
        }
    }

    public final void X(int i10) {
        boolean z4;
        boolean[] zArr = this.f13149t;
        if (!zArr[i10] && !this.f13150u[i10]) {
            boolean z10 = true;
            zArr[i10] = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
            tL_payments_getStarsTransactions.ton = this.f13134b;
            tL_payments_getStarsTransactions.peer = new TLRPC.TL_inputPeerSelf();
            if (i10 == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            tL_payments_getStarsTransactions.inbound = z4;
            if (i10 != 2) {
                z10 = false;
            }
            tL_payments_getStarsTransactions.outbound = z10;
            String str = this.f13148s[i10];
            tL_payments_getStarsTransactions.offset = str;
            if (str == null) {
                tL_payments_getStarsTransactions.offset = "";
            }
            ConnectionsManager.getInstance(this.f13133a).sendRequest(tL_payments_getStarsTransactions, new s1(this, i10, 1));
        }
    }

    public final void Y(org.telegram.messenger.MessageObject r39, org.telegram.tgnet.TLRPC.InputInvoice r40, org.telegram.tgnet.TLRPC.TL_payments_paymentFormStars r41, java.lang.Runnable r42, org.telegram.messenger.Utilities.Callback r43) {
        throw new UnsupportedOperationException("Method not decompiled: lh.t7.Y(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$InputInvoice, org.telegram.tgnet.TLRPC$TL_payments_paymentFormStars, java.lang.Runnable, org.telegram.messenger.Utilities$Callback):void");
    }

    public final void Z(final String str, final TLRPC.ChatInvite chatInvite, final Utilities.Callback2 callback2) {
        if (chatInvite != null && chatInvite.subscription_pricing != null) {
            final Context context = ApplicationLoader.applicationContext;
            final org.telegram.ui.ActionBar.f6 I = I();
            if (context != null) {
                final long j10 = chatInvite.subscription_pricing.amount;
                final String str2 = chatInvite.title;
                TLRPC.TL_inputInvoiceChatInviteSubscription tL_inputInvoiceChatInviteSubscription = new TLRPC.TL_inputInvoiceChatInviteSubscription();
                tL_inputInvoiceChatInviteSubscription.hash = str;
                TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                tL_payments_sendStarsForm.form_id = chatInvite.subscription_form_id;
                tL_payments_sendStarsForm.invoice = tL_inputInvoiceChatInviteSubscription;
                ConnectionsManager.getInstance(this.f13133a).sendRequest(tL_payments_sendStarsForm, new RequestDelegate() {
                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        final t7 t7Var = t7.this;
                        final Utilities.Callback2 callback22 = callback2;
                        final long j11 = j10;
                        final String str3 = str2;
                        final Context context2 = context;
                        final org.telegram.ui.ActionBar.f6 f6Var = I;
                        final TLRPC.ChatInvite chatInvite2 = chatInvite;
                        final String str4 = str;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                qc X;
                                String str5;
                                long j12;
                                ya0 ya0Var;
                                t7 t7Var2 = t7.this;
                                TLObject tLObject2 = tLObject;
                                Utilities.Callback2 callback23 = callback22;
                                long j13 = j11;
                                String str6 = str3;
                                TLRPC.TL_error tL_error2 = tL_error;
                                Context context3 = context2;
                                org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                                TLRPC.ChatInvite chatInvite3 = chatInvite2;
                                String str7 = str4;
                                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                                if (!AndroidUtilities.hasDialogOnTop(R)) {
                                    X = qc.a0(R);
                                } else {
                                    X = qc.X();
                                }
                                if (tLObject2 instanceof TLRPC.TL_payments_paymentResult) {
                                    TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject2;
                                    Utilities.stageQueue.postRunnable(new f6(t7Var2, tL_payments_paymentResult, 0));
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
                                    LaunchActivity launchActivity = LaunchActivity.D1;
                                    if (launchActivity != null && (ya0Var = launchActivity.f31626u0) != null) {
                                        ya0Var.c(true);
                                    }
                                    t7Var2.T(true);
                                    t7Var2.S();
                                } else if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                                    if (!MessagesController.getInstance(t7Var2.f13133a).starsPurchaseAvailable()) {
                                        callback23.run(0L, Boolean.FALSE);
                                        t7.e0(context3, f6Var2);
                                        return;
                                    }
                                    boolean[] zArr = {false};
                                    z9 z9Var = new z9(context3, f6Var2, j13, 1, chatInvite3.title, new gg.j0(t7Var2, zArr, str7, chatInvite3, callback23, 8), 0L);
                                    z9Var.setOnDismissListener(new g6(callback23, zArr, 0));
                                    z9Var.show();
                                } else {
                                    callback23.run(0L, Boolean.FALSE);
                                    int i11 = R.raw.error;
                                    int i12 = R.string.UnknownErrorCode;
                                    if (tL_error2 != null) {
                                        str5 = tL_error2.text;
                                    } else {
                                        str5 = "FAILED_SEND_STARS";
                                    }
                                    ai.r(i12, new Object[]{str5}, X, i11, 36);
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
            final org.telegram.ui.ActionBar.f6 I = I();
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
                if (j10 < 0 && messageObject.getFromChatId() > 0 && (user = MessagesController.getInstance(this.f13133a).getUser(Long.valueOf(messageObject.getFromChatId()))) != null && user.bot) {
                    j10 = user.f19306id;
                }
            } else {
                j10 = tL_payments_paymentFormStars.bot_id;
            }
            final long j12 = j10;
            if (j12 >= 0) {
                str = UserObject.getUserName(MessagesController.getInstance(this.f13133a).getUser(Long.valueOf(j12)));
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(this.f13133a).getChat(Long.valueOf(-j12));
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
            ConnectionsManager.getInstance(this.f13133a).sendRequest(tL_payments_sendStarsForm, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    final t7 t7Var = t7.this;
                    final Utilities.Callback callback2 = callback;
                    final MessageObject messageObject2 = messageObject;
                    final Context context2 = context;
                    final long j13 = j11;
                    final String str4 = str2;
                    final int i12 = i11;
                    final String str5 = str3;
                    final TLRPC.InputInvoice inputInvoice2 = inputInvoice;
                    final long j14 = j12;
                    final org.telegram.ui.ActionBar.f6 f6Var = I;
                    final TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars2 = tL_payments_paymentFormStars;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            throw new UnsupportedOperationException("Method not decompiled: lh.e7.run():void");
                        }
                    });
                }
            });
        }
    }

    public final void b0(long j10, long j11, boolean z4) {
        int i10 = this.f13133a;
        TopicsController topicsController = MessagesController.getInstance(i10).getTopicsController();
        TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j10, j11);
        if (findTopic != null) {
            findTopic.nopaid_messages_exception = z4;
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
        boolean z4 = false;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            int id2 = ((MessageObject) obj).getId();
            hashSet.add(Integer.valueOf(id2));
            if (this.Q.remove(Integer.valueOf(id2))) {
                this.R.put(Integer.valueOf(id2), new p6(this, hashSet, runnable, 0));
                z4 = true;
            }
        }
        return !z4;
    }

    public final void c0(int i10, long j10, ArrayList arrayList) {
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.f13133a);
        messagesStorage.getStorageQueue().postRunnable(new w6(messagesStorage, j10, arrayList, i10));
    }

    public final void d(org.telegram.messenger.MessageObject r18) {
        throw new UnsupportedOperationException("Method not decompiled: lh.t7.d(org.telegram.messenger.MessageObject):void");
    }

    public final s7 d0(final MessageObject messageObject, final zn znVar, final long j10, boolean z4, boolean z10, final Long l10) {
        long j11;
        t7 t7Var;
        boolean z11;
        String str;
        n7 b10 = n7.b(messageObject);
        int i10 = this.f13133a;
        t7 y10 = y(i10, false);
        Context t6 = t(znVar);
        if (t6 == null) {
            return null;
        }
        String str2 = "";
        if (z10 && y10.e && y10.q(false, false, null).amount <= 0) {
            long a2 = znVar.a();
            if (a2 >= 0) {
                str2 = UserObject.getForcedFirstName(znVar.getMessagesController().getUser(Long.valueOf(a2)));
            } else {
                TLRPC.Chat chat = znVar.getMessagesController().getChat(Long.valueOf(-a2));
                if (chat != null) {
                    str2 = chat.title;
                }
            }
            new z9(t6, znVar.getResourceProvider(), j10, 5, str2, new Runnable(this) {
                public final t7 f12870b;

                {
                    this.f12870b = this;
                }

                @Override
                public final void run() {
                    switch (r7) {
                        case 0:
                            this.f12870b.d0(messageObject, znVar, j10, true, true, l10);
                            return;
                        default:
                            this.f12870b.d0(messageObject, znVar, j10, true, true, l10);
                            return;
                    }
                }
            }, 0L).show();
            return null;
        }
        s7 s7Var = this.B;
        if (s7Var != null && s7Var.f13063a.equals(b10)) {
            j11 = 0;
            t7Var = this;
        } else {
            s7 s7Var2 = this.B;
            if (s7Var2 != null) {
                s7Var2.b();
            }
            ConnectionsManager.getInstance(i10).getCurrentTime();
            j11 = 0;
            t7Var = this;
            s7 s7Var3 = new s7(t7Var, b10, messageObject, znVar, z4);
            t7Var.B = s7Var3;
            s7Var3.f13073n = l10;
        }
        if (t7Var.B.h + j10 > MessagesController.getInstance(i10).starsPaidReactionAmountMax) {
            t7Var.B.b();
            ConnectionsManager.getInstance(i10).getCurrentTime();
            t7Var.B = new s7(t7Var, b10, messageObject, znVar, z4);
        }
        final long j12 = t7Var.B.h + j10;
        if (z10 && y10.e && y10.q(false, false, null).amount < j12) {
            t7Var.B.a();
            long a10 = znVar.a();
            if (a10 >= j11) {
                str = UserObject.getForcedFirstName(znVar.getMessagesController().getUser(Long.valueOf(a10)));
            } else {
                TLRPC.Chat chat2 = znVar.getMessagesController().getChat(Long.valueOf(-a10));
                if (chat2 != null) {
                    str2 = chat2.title;
                }
                str = str2;
            }
            new z9(t6, znVar.getResourceProvider(), j12, 5, str, new Runnable(t7Var) {
                public final t7 f12870b;

                {
                    this.f12870b = t7Var;
                }

                @Override
                public final void run() {
                    switch (r7) {
                        case 0:
                            this.f12870b.d0(messageObject, znVar, j12, true, true, l10);
                            return;
                        default:
                            this.f12870b.d0(messageObject, znVar, j12, true, true, l10);
                            return;
                    }
                }
            }, 0L).show();
            return null;
        }
        s7 s7Var4 = t7Var.B;
        if ((messageObject != null && !messageObject.doesPaidReactionExist()) || z4) {
            z11 = true;
        } else {
            z11 = false;
        }
        q7 q7Var = s7Var4.f13075p;
        t7 t7Var2 = s7Var4.f13076q;
        int i11 = t7Var2.f13133a;
        cc ccVar = s7Var4.e;
        MessageObject messageObject2 = s7Var4.f13064b;
        if (!s7Var4.f13068i && !s7Var4.f13069j) {
            s7Var4.h += j10;
            System.currentTimeMillis();
            ccVar.f23922c.a();
            ccVar.f23922c.c(AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSentText", (int) s7Var4.h, new Object[0])), true, true);
            if (s7Var4.f13072m) {
                s7Var4.f13066f.f23614b = 5000L;
                AndroidUtilities.cancelRunOnUIThread(q7Var);
                AndroidUtilities.runOnUIThread(q7Var, 5000L);
            }
            if (z11) {
                s7Var4.f13071l = true;
                messageObject2.addPaidReactions((int) j10, true, s7Var4.c());
                t7Var2.f13137g += j10;
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject2.getDialogId()), Integer.valueOf(messageObject2.getId()), messageObject2.messageOwner.reactions);
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
            } else {
                s7Var4.f13071l = false;
                if (messageObject2.ensurePaidReactionsExist(true)) {
                    s7Var4.f13070k--;
                }
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject2.getDialogId()), Integer.valueOf(messageObject2.getId()), messageObject2.messageOwner.reactions);
                s7Var4.f13070k += j10;
            }
            ccVar.f23921b.setText(s7Var4.d());
        } else if (BuildVars.DEBUG_PRIVATE_VERSION) {
            throw new RuntimeException("adding more amount to committed reactions");
        }
        s7 s7Var5 = t7Var.B;
        s7Var5.f13073n = l10;
        return s7Var5;
    }

    public final void f(Activity activity, TL_stars.TL_starsTopupOption tL_starsTopupOption, Utilities.Callback2 callback2, TLRPC.InputPeer inputPeer) {
        boolean z4;
        if (activity == null) {
            return;
        }
        int i10 = this.f13133a;
        if (!MessagesController.getInstance(i10).starsPurchaseAvailable()) {
            org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
            if (R != null && R.getContext() != null) {
                e0(R.getContext(), R.getResourceProvider());
                return;
            } else {
                e0(activity, null);
                return;
            }
        }
        if (AppGlobalConfig.getInstance(i10).starsSpendTopUpInvoiceDisabled.get() && inputPeer != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if ((BuildVars.useInvoiceBilling() || !BillingController.getInstance().isReady()) && !z4) {
            TLRPC.TL_inputStorePaymentStarsTopup tL_inputStorePaymentStarsTopup = new TLRPC.TL_inputStorePaymentStarsTopup();
            tL_inputStorePaymentStarsTopup.stars = tL_starsTopupOption.stars;
            tL_inputStorePaymentStarsTopup.amount = tL_starsTopupOption.amount;
            tL_inputStorePaymentStarsTopup.currency = tL_starsTopupOption.currency;
            tL_inputStorePaymentStarsTopup.spend_purpose_peer = inputPeer;
            TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
            tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsTopup;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject p10 = rh.p2.p(I(), false);
            if (p10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = p10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
            ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getPaymentForm, new gg.y(this, callback2, tL_inputInvoiceStars, 9));
        } else if (!BillingController.getInstance().isReady()) {
            callback2.run(Boolean.FALSE, "INVOICE DISABLED");
        } else {
            TLRPC.TL_inputStorePaymentStarsTopup tL_inputStorePaymentStarsTopup2 = new TLRPC.TL_inputStorePaymentStarsTopup();
            tL_inputStorePaymentStarsTopup2.stars = tL_starsTopupOption.stars;
            tL_inputStorePaymentStarsTopup2.currency = tL_starsTopupOption.currency;
            tL_inputStorePaymentStarsTopup2.amount = tL_starsTopupOption.amount;
            b6.h hVar = new b6.h();
            hVar.f1610c = "inapp";
            hVar.f1609b = tL_starsTopupOption.store_product;
            p2.q a2 = hVar.a();
            FileLog.d("StarsController.buy starts queryProductDetails");
            BillingController.getInstance().queryProductDetails(Arrays.asList(a2), new a1.d(callback2, tL_inputStorePaymentStarsTopup2, tL_starsTopupOption, activity, 2));
        }
    }

    public final void f0(List list) {
        if (list != null && !list.isEmpty()) {
            MessageObject messageObject = (MessageObject) list.get(0);
            long dialogId = messageObject.getDialogId();
            int i10 = this.f13133a;
            if (dialogId >= 0) {
                MessagesController.getInstance(i10).loadFullUser(MessagesController.getInstance(i10).getUser(Long.valueOf(dialogId)), 0, true);
            } else {
                MessagesController.getInstance(i10).loadFullChat(-dialogId, 0, true);
            }
            qc.a0(LaunchActivity.U()).Q(R.raw.error, 36, ja.Q0(TextUtils.concat(LocaleController.formatPluralString("PaidMessagesSendErrorToast1", (int) messageObject.messageOwner.errorAllowedPriceStars, new Object[0]), " ", LocaleController.formatPluralString("PaidMessagesSendErrorToast2", (int) messageObject.messageOwner.errorNewPriceStars, new Object[0])))).j();
        }
    }

    public final void g(final long j10, final TLObject tLObject, final TLRPC.TL_textWithEntities tL_textWithEntities, final Utilities.Callback2 callback2) {
        int i10;
        Context context = LaunchActivity.D1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        final Context context2 = context;
        final org.telegram.ui.ActionBar.f6 I = I();
        boolean z4 = tLObject instanceof TLRPC.TL_premiumGiftOption;
        if ((z4 || (tLObject instanceof TLRPC.TL_premiumGiftCodeOption)) && context2 != null) {
            if (!this.e) {
                r(new kh.g1(this, callback2, j10, tLObject, tL_textWithEntities, 3));
                return;
            }
            if (z4) {
                i10 = ((TLRPC.TL_premiumGiftOption) tLObject).months;
            } else if (tLObject instanceof TLRPC.TL_premiumGiftCodeOption) {
                i10 = ((TLRPC.TL_premiumGiftCodeOption) tLObject).months;
            } else {
                return;
            }
            final String name = DialogObject.getName(this.f13133a, j10);
            final TLRPC.TL_inputInvoicePremiumGiftStars tL_inputInvoicePremiumGiftStars = new TLRPC.TL_inputInvoicePremiumGiftStars();
            tL_inputInvoicePremiumGiftStars.user_id = MessagesController.getInstance(this.f13133a).getInputUser(j10);
            tL_inputInvoicePremiumGiftStars.months = i10;
            if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                tL_inputInvoicePremiumGiftStars.flags |= 1;
                tL_inputInvoicePremiumGiftStars.message = tL_textWithEntities;
            }
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject p10 = rh.p2.p(I, false);
            if (p10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = p10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoicePremiumGiftStars;
            ConnectionsManager.getInstance(this.f13133a).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                    final t7 t7Var = t7.this;
                    final Utilities.Callback2 callback22 = callback2;
                    final TLRPC.TL_inputInvoicePremiumGiftStars tL_inputInvoicePremiumGiftStars2 = tL_inputInvoicePremiumGiftStars;
                    final Context context3 = context2;
                    final org.telegram.ui.ActionBar.f6 f6Var = I;
                    final String str = name;
                    final long j11 = j10;
                    final TLObject tLObject3 = tLObject;
                    final TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_textWithEntities;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            String str2;
                            TLObject tLObject4 = tLObject2;
                            boolean z10 = tLObject4 instanceof TLRPC.TL_payments_paymentFormStars;
                            Utilities.Callback2 callback23 = callback22;
                            if (!z10) {
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    str2 = "NO_PAYMENT_FORM";
                                } else {
                                    str2 = tL_error2.text;
                                }
                                t7.e(str2);
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
                            t7 t7Var2 = t7.this;
                            ConnectionsManager.getInstance(t7Var2.f13133a).sendRequest(tL_payments_sendStarsForm, new d6(t7Var2, callback23, context3, f6Var, j12, str, j11, tLObject3, tL_textWithEntities2));
                        }
                    });
                }
            });
        }
    }

    public final void g0(LaunchActivity launchActivity, long j10, String str) {
        if (!this.e) {
            r(new c2(this, (Object) launchActivity, j10, (Object) str, 7));
        } else {
            h0(launchActivity, j10, str);
        }
    }

    public final void h(TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z4, Utilities.Callback2 callback2) {
        Context context = LaunchActivity.D1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        Context context2 = context;
        org.telegram.ui.ActionBar.f6 I = I();
        if (starGift != null && context2 != null) {
            if (!this.e) {
                r(new kh.g1(this, callback2, tL_payments_paymentFormStarGift, starGift, j10, 4));
                return;
            }
            String name = DialogObject.getName(this.f13133a, j10);
            TLRPC.TL_inputInvoiceStarGiftResale tL_inputInvoiceStarGiftResale = new TLRPC.TL_inputInvoiceStarGiftResale();
            tL_inputInvoiceStarGiftResale.slug = starGift.slug;
            tL_inputInvoiceStarGiftResale.to_id = MessagesController.getInstance(this.f13133a).getInputPeer(j10);
            tL_inputInvoiceStarGiftResale.ton = this.f13134b;
            tL_inputInvoiceStarGiftResale.message = tL_textWithEntities;
            tL_inputInvoiceStarGiftResale.show_name = !z4;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            int i10 = 0;
            JSONObject p10 = rh.p2.p(I, false);
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
            ConnectionsManager.getInstance(this.f13133a).sendRequest(tL_payments_sendStarsForm, new d6(this, callback2, context2, I, j11, name, tL_payments_paymentFormStarGift, starGift, j10));
        }
    }

    public final void h0(LaunchActivity launchActivity, long j10, String str) {
        if (p().amount < j10 && j10 > 0) {
            new z9(launchActivity, null, j10, 4, str, new cg.n0(11), 0L).show();
            return;
        }
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        ic J = qc.a0(U).J(R.raw.stars_topup, LocaleController.getString(R.string.StarsTopupLinkEnough), LocaleController.getString(R.string.StarsTopupLinkTopupAnyway), new cg.n0(10));
        J.f25671j = 5000;
        J.k(true);
    }

    public final void i(final TL_stars.StarGift starGift, final boolean z4, final boolean z10, final long j10, final TLRPC.TL_textWithEntities tL_textWithEntities, final kh.r5 r5Var) {
        Context context = LaunchActivity.D1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        final Context context2 = context;
        final org.telegram.ui.ActionBar.f6 I = I();
        if (starGift != null && context2 != null) {
            if (!this.e) {
                r(new Runnable() {
                    @Override
                    public final void run() {
                        t7 t7Var = t7.this;
                        boolean z11 = t7Var.e;
                        kh.r5 r5Var2 = r5Var;
                        if (!z11) {
                            t7.e("NO_BALANCE");
                            r5Var2.run(Boolean.FALSE, null);
                            return;
                        }
                        t7Var.i(starGift, z4, z10, j10, tL_textWithEntities, r5Var2);
                    }
                });
                return;
            }
            final String name = DialogObject.getName(this.f13133a, j10);
            final TLRPC.TL_inputInvoiceStarGift tL_inputInvoiceStarGift = new TLRPC.TL_inputInvoiceStarGift();
            tL_inputInvoiceStarGift.hide_name = z4;
            tL_inputInvoiceStarGift.peer = MessagesController.getInstance(this.f13133a).getInputPeer(j10);
            tL_inputInvoiceStarGift.gift_id = starGift.f19384id;
            tL_inputInvoiceStarGift.include_upgrade = z10;
            if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                tL_inputInvoiceStarGift.flags |= 2;
                tL_inputInvoiceStarGift.message = tL_textWithEntities;
            }
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject p10 = rh.p2.p(I, false);
            if (p10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = p10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGift;
            ConnectionsManager.getInstance(this.f13133a).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    final t7 t7Var = t7.this;
                    final kh.r5 r5Var2 = r5Var;
                    final TLRPC.TL_inputInvoiceStarGift tL_inputInvoiceStarGift2 = tL_inputInvoiceStarGift;
                    final Context context3 = context2;
                    final org.telegram.ui.ActionBar.f6 f6Var = I;
                    final String str = name;
                    final TL_stars.StarGift starGift2 = starGift;
                    final boolean z11 = z4;
                    final boolean z12 = z10;
                    final long j11 = j10;
                    final TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_textWithEntities;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            String str2;
                            TLObject tLObject2 = tLObject;
                            boolean z13 = tLObject2 instanceof TLRPC.TL_payments_paymentFormStarGift;
                            final kh.r5 r5Var3 = r5Var2;
                            if (!z13) {
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    str2 = "NO_PAYMENT_FORM";
                                } else {
                                    str2 = tL_error2.text;
                                }
                                t7.e(str2);
                                r5Var3.run(Boolean.FALSE, null);
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
                            final t7 t7Var2 = t7.this;
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(t7Var2.f13133a);
                            final Context context4 = context3;
                            final org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                            final String str3 = str;
                            final TL_stars.StarGift starGift3 = starGift2;
                            final boolean z14 = z11;
                            final boolean z15 = z12;
                            final long j13 = j11;
                            final TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_textWithEntities2;
                            connectionsManager.sendRequest(tL_payments_sendStarsForm, new RequestDelegate() {
                                @Override
                                public final void run(final TLObject tLObject3, final TLRPC.TL_error tL_error3) {
                                    final t7 t7Var3 = t7.this;
                                    final kh.r5 r5Var4 = r5Var3;
                                    final Context context5 = context4;
                                    final org.telegram.ui.ActionBar.f6 f6Var3 = f6Var2;
                                    final long j14 = j12;
                                    final String str4 = str3;
                                    final TL_stars.StarGift starGift4 = starGift3;
                                    final boolean z16 = z14;
                                    final boolean z17 = z15;
                                    final long j15 = j13;
                                    final TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_textWithEntities3;
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            qc X;
                                            int i11;
                                            SpannableStringBuilder spannableStringBuilder;
                                            SpannableStringBuilder replaceTags;
                                            ya0 ya0Var;
                                            ?? r52;
                                            char c3;
                                            String str5;
                                            t7 t7Var4 = t7.this;
                                            TLObject tLObject4 = tLObject3;
                                            TLRPC.TL_error tL_error4 = tL_error3;
                                            kh.r5 r5Var5 = r5Var4;
                                            Context context6 = context5;
                                            org.telegram.ui.ActionBar.f6 f6Var4 = f6Var3;
                                            long j16 = j14;
                                            String str6 = str4;
                                            TL_stars.StarGift starGift5 = starGift4;
                                            boolean z18 = z16;
                                            boolean z19 = z17;
                                            long j17 = j15;
                                            TLRPC.TL_textWithEntities tL_textWithEntities5 = tL_textWithEntities4;
                                            org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                                            if (R != null && R.visibleDialog == null) {
                                                X = qc.a0(R);
                                            } else {
                                                X = qc.X();
                                            }
                                            if (!(tLObject4 instanceof TLRPC.TL_payments_paymentResult)) {
                                                if (tL_error4 != null) {
                                                    c3 = 0;
                                                    if ("BALANCE_TOO_LOW".equals(tL_error4.text)) {
                                                        if (!MessagesController.getInstance(t7Var4.f13133a).starsPurchaseAvailable()) {
                                                            r5Var5.run(Boolean.FALSE, null);
                                                            t7.e0(context6, f6Var4);
                                                            return;
                                                        }
                                                        boolean[] zArr = {false};
                                                        z9 z9Var = new z9(context6, f6Var4, j16, 6, str6, new i6(t7Var4, zArr, starGift5, z18, z19, j17, tL_textWithEntities5, r5Var5), 0L);
                                                        z9Var.setOnDismissListener(new gg.g(1, r5Var5, zArr));
                                                        z9Var.show();
                                                        return;
                                                    }
                                                } else {
                                                    c3 = 0;
                                                }
                                                if (tL_error4 != null && "STARGIFT_USAGE_LIMITED".equals(tL_error4.text)) {
                                                    r5Var5.run(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                                                    return;
                                                } else if (tL_error4 != null && "STARGIFT_USER_USAGE_LIMITED".equals(tL_error4.text)) {
                                                    r5Var5.run(Boolean.FALSE, "STARGIFT_USER_USAGE_LIMITED");
                                                    return;
                                                } else {
                                                    r5Var5.run(Boolean.FALSE, null);
                                                    int i12 = R.raw.error;
                                                    int i13 = R.string.UnknownErrorCode;
                                                    if (tL_error4 != null) {
                                                        str5 = tL_error4.text;
                                                    } else {
                                                        str5 = "FAILED_SEND_STARS";
                                                    }
                                                    Object[] objArr = new Object[1];
                                                    objArr[c3] = str5;
                                                    ai.r(i13, objArr, X, i12, 36);
                                                    return;
                                                }
                                            }
                                            Utilities.stageQueue.postRunnable(new f6(t7Var4, (TLRPC.TL_payments_paymentResult) tLObject4, 1));
                                            t7Var4.D = false;
                                            t7Var4.E = true;
                                            t7Var4.G = 0L;
                                            t7Var4.V();
                                            t7Var4.Q(j17);
                                            t7Var4.T(true);
                                            r5Var5.run(Boolean.TRUE, null);
                                            if (BirthdayController.getInstance(t7Var4.f13133a).contains(j17)) {
                                                i11 = 0;
                                                MessagesController.getInstance(t7Var4.f13133a).getMainSettings().edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j17, false).apply();
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
                                                TLRPC.ChatFull chatFull = MessagesController.getInstance(t7Var4.f13133a).getChatFull(j18);
                                                if (chatFull != null) {
                                                    chatFull.stargifts_count++;
                                                    chatFull.flags2 |= 262144;
                                                    MessagesController.getInstance(t7Var4.f13133a).putChatFull(chatFull);
                                                }
                                                if (R instanceof ProfileActivity) {
                                                    ProfileActivity profileActivity = (ProfileActivity) R;
                                                    if (profileActivity.a() == j17) {
                                                        zz0 zz0Var = profileActivity.L;
                                                        if (zz0Var != null) {
                                                            zz0Var.v1(true);
                                                            profileActivity.L.Y0(14);
                                                            r52 = 0;
                                                            profileActivity.G4(false);
                                                        } else {
                                                            r52 = 0;
                                                        }
                                                        qc a02 = qc.a0(R);
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
                                                profileActivity2.whenFullyVisible(new kh.g1(profileActivity2, starGift5, spannableStringBuilder, j16, str6, 5));
                                                R.presentFragment(profileActivity2);
                                            } else {
                                                SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
                                                if ((R instanceof zn) && ((zn) R).a() == j17) {
                                                    qc a03 = qc.a0(R);
                                                    TLRPC.Document document2 = starGift5.sticker;
                                                    String string2 = LocaleController.getString(R.string.StarsGiftCompleted);
                                                    if (spannableStringBuilder2 != null) {
                                                        replaceTags = spannableStringBuilder2;
                                                    } else {
                                                        replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftCompletedText", (int) j16, new Object[0]));
                                                    }
                                                    a03.s(document2, string2, replaceTags).k(true);
                                                } else {
                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(t7Var4.f13133a);
                                                    int i15 = NotificationCenter.closeProfileActivity;
                                                    Long valueOf = Long.valueOf(j17);
                                                    Boolean bool = Boolean.FALSE;
                                                    notificationCenter.lambda$postNotificationNameOnUIThread$1(i15, valueOf, bool);
                                                    NotificationCenter.getInstance(t7Var4.f13133a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChatActivity, Long.valueOf(j17), bool);
                                                    zn R9 = zn.R9(j17);
                                                    R9.whenFullyVisible(new c2(R9, starGift5, spannableStringBuilder2, j16, 6));
                                                    R.presentFragment(R9);
                                                }
                                            }
                                            MessagesController.getInstance(t7Var4.f13133a).getMainSettings().edit().putBoolean("show_gift_for_" + j17, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j17, true).apply();
                                            LaunchActivity launchActivity = LaunchActivity.D1;
                                            if (launchActivity != null && (ya0Var = launchActivity.f31626u0) != null) {
                                                ya0Var.c(true);
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

    public final void i0(final long j10, final long j11, boolean z4, final boolean z10) {
        TL_account.toggleNoPaidMessagesException togglenopaidmessagesexception = new TL_account.toggleNoPaidMessagesException();
        int i10 = this.f13133a;
        togglenopaidmessagesexception.user_id = MessagesController.getInstance(i10).getInputUser(j10);
        if (j11 != 0) {
            togglenopaidmessagesexception.parent_peer = MessagesController.getInstance(i10).getInputPeer(j11);
        }
        togglenopaidmessagesexception.refund_charged = z4;
        togglenopaidmessagesexception.require_payment = !z10;
        ConnectionsManager.getInstance(i10).sendRequest(togglenopaidmessagesexception, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                AndroidUtilities.runOnUIThread(new y6(t7.this, tLObject, j11, j10, z10));
            }
        });
    }

    public final boolean j() {
        if (!this.f13134b) {
            return false;
        }
        if (qh.g.B0()) {
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
            Context context = LaunchActivity.D1;
            if (context == null) {
                context = ApplicationLoader.applicationContext;
            }
            Context context2 = context;
            org.telegram.ui.ActionBar.f6 I = I();
            long j10 = chatInvite.subscription_pricing.amount;
            if (context2 != null) {
                int i11 = UserConfig.selectedAccount;
                boolean[] zArr = {false};
                d7 d7Var = new d7(this, j10, i11, zArr, callback2, context2, I, chatInvite, str);
                n2 n2Var = new n2(this, zArr, callback2);
                org.telegram.ui.ActionBar.g3 o10 = org.telegram.messenger.y3.o(context2, I, false, false);
                LinearLayout f10 = org.telegram.messenger.y3.f(context2, 1);
                f10.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
                FrameLayout frameLayout = new FrameLayout(context2);
                frameLayout.addView(new j9(context2, 40, 0), k7.b6.c(-1.0f, -1));
                org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context2);
                p9Var.setRoundRadius(AndroidUtilities.dp(80.0f));
                org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
                z8Var.s(chatInvite.color);
                String str3 = chatInvite.title;
                z8Var.A = true;
                z8Var.f31291n = 0;
                z8Var.f31290m = false;
                org.telegram.ui.Components.z8.a(str3, null, null, z8Var.f31294q);
                TLRPC.Photo photo = chatInvite.photo;
                if (photo != null) {
                    p9Var.h(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(80.0f)), chatInvite.photo), "80_80", z8Var, chatInvite);
                } else {
                    p9Var.setImageDrawable(z8Var);
                }
                frameLayout.addView(p9Var, k7.b6.e(80, 80, 17));
                Drawable drawable = context2.getResources().getDrawable(R.drawable.star_small_outline);
                int i12 = org.telegram.ui.ActionBar.j6.f19952h5;
                drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i12, I), PorterDuff.Mode.SRC_IN));
                Drawable drawable2 = context2.getResources().getDrawable(R.drawable.star_small_inner);
                ImageView imageView = new ImageView(context2);
                imageView.setImageDrawable(drawable);
                frameLayout.addView(imageView, k7.b6.e(26, 26, 17));
                imageView.setTranslationX(AndroidUtilities.dp(26.0f));
                imageView.setTranslationY(AndroidUtilities.dp(26.0f));
                imageView.setScaleX(1.2f);
                imageView.setScaleY(1.2f);
                ImageView imageView2 = new ImageView(context2);
                imageView2.setImageDrawable(drawable2);
                frameLayout.addView(imageView2, k7.b6.e(26, 26, 17));
                imageView2.setTranslationX(AndroidUtilities.dp(26.0f));
                imageView2.setTranslationY(AndroidUtilities.dp(26.0f));
                y9 y9Var = new y9(context2, i11, I);
                k7.d6.a(y9Var);
                y9Var.setOnClickListener(new j8(y9Var, 1));
                frameLayout.addView(y9Var, k7.b6.d(-2, -2.0f, 53, 0.0f, 0.0f, -8.0f, 0.0f));
                f10.addView(frameLayout, k7.b6.q(-1, 117, 7));
                TextView g10 = org.telegram.messenger.y3.g(context2, 1, 20.0f);
                g10.setTypeface(AndroidUtilities.bold());
                int i13 = org.telegram.ui.ActionBar.j6.f19987j5;
                g10.setTextColor(org.telegram.ui.ActionBar.j6.v0(i13, I));
                org.telegram.messenger.y3.r(R.string.StarsSubscribeTitle, g10, 17);
                TextView i14 = ai.i(f10, g10, k7.b6.t(-2, -2, 1, 0, 8, 0, 0), context2);
                i14.setTextSize(1, 14.0f);
                i14.setTextColor(org.telegram.ui.ActionBar.j6.v0(i13, I));
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
                i14.setMaxWidth(ph.f3.a(i14.getText(), i14.getPaint()));
                i14.setGravity(17);
                f10.addView(i14, k7.b6.t(-2, -2, 1, 0, 6, 0, 22));
                if (!TextUtils.isEmpty(chatInvite.about)) {
                    TextView g11 = org.telegram.messenger.y3.g(context2, 1, 14.0f);
                    g11.setTextColor(org.telegram.ui.ActionBar.j6.v0(i13, I));
                    g11.setText(Emoji.replaceEmoji(chatInvite.about, g11.getPaint().getFontMetricsInt(), false));
                    g11.setGravity(17);
                    f10.addView(g11, k7.b6.t(-2, -2, 1, 0, 6, 0, 22));
                }
                ph.d dVar = new ph.d(context2, I, true);
                dVar.g(LocaleController.getString(R.string.StarsSubscribeButton), false, true);
                f10.addView(dVar, k7.b6.n(-1, 48));
                f90 f90Var = new f90(context2, I);
                f90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsSubscribeInfo), new e2.f(context2, 9)));
                f90Var.setGravity(17);
                f90Var.setTextSize(1, 13.0f);
                f90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.B6, I));
                f90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19941gc, I));
                f10.addView(f90Var, k7.b6.t(-1, -2, 49, 14, 14, 14, 6));
                o10.customView = f10;
                dVar.setOnClickListener(new dg.p(d7Var, o10, dVar, 9));
                o10.setOnDismissListener(new eg.d0(n2Var, 5));
                o10.fixNavigationBar(org.telegram.ui.ActionBar.j6.v0(i10, I));
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (!AndroidUtilities.isTablet() && U != null && !AndroidUtilities.hasDialogOnTop(U)) {
                    o10.makeAttached(U);
                }
                o10.show();
            }
        }
    }

    public final void k0(TL_stars.StarsAmount starsAmount) {
        boolean equals = this.f13136f.equals(starsAmount);
        int i10 = this.f13133a;
        if (!equals) {
            this.f13136f = starsAmount;
            this.f13137g = 0L;
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        } else if (this.f13137g != 0) {
            this.f13137g = 0L;
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        }
    }

    public final void l0(final MessageObject messageObject, final long j10, final Runnable runnable, final boolean z4) {
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia;
        if (messageObject == null) {
            runnable.run();
            return;
        }
        final long dialogId = messageObject.getDialogId();
        final int id2 = messageObject.getId();
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia2 = (TLRPC.TL_messageMediaPaidMedia) messageObject.messageOwner.media;
        TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
        int i10 = this.f13133a;
        tL_messages_editMessage.peer = MessagesController.getInstance(i10).getInputPeer(dialogId);
        int i11 = tL_messages_editMessage.flags;
        tL_messages_editMessage.flags = 32768 | i11;
        tL_messages_editMessage.schedule_date = messageObject.messageOwner.date;
        tL_messages_editMessage.f19242id = id2;
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
                tL_inputPhoto.f19178id = photo.f19183id;
                tL_inputPhoto.access_hash = photo.access_hash;
                tL_inputPhoto.file_reference = photo.file_reference;
                tL_inputMediaPhoto.f19222id = tL_inputPhoto;
                tL_inputMediaPaidMedia.extended_media.add(tL_inputMediaPhoto);
            } else {
                tL_messageMediaPaidMedia = tL_messageMediaPaidMedia2;
                if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument = new TLRPC.TL_inputMediaDocument();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) messageMedia).document;
                    tL_inputDocument.f19171id = document.f19165id;
                    tL_inputDocument.access_hash = document.access_hash;
                    tL_inputDocument.file_reference = document.file_reference;
                    tL_inputMediaDocument.f19220id = tL_inputDocument;
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
                AndroidUtilities.runOnUIThread(new f7(t7.this, tLObject, runnable, tL_error, z4, dialogId, id2, messageObject, j10));
            }
        });
    }

    public final TL_stars.SavedStarGift n(long j10) {
        TL_stars.StarGift starGift;
        int i10 = 0;
        while (true) {
            LongSparseArray longSparseArray = this.L;
            if (i10 < longSparseArray.size()) {
                l7 l7Var = (l7) longSparseArray.valueAt(i10);
                for (int i11 = 0; i11 < l7Var.f12756l.size(); i11++) {
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) l7Var.f12756l.get(i11);
                    if (savedStarGift != null && (starGift = savedStarGift.gift) != null && starGift.f19384id == j10) {
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

    public final TL_stars.StarsAmount q(boolean z4, boolean z10, Runnable runnable) {
        if (((!this.e || System.currentTimeMillis() - this.f13135c > 60000) && !this.d) || z10) {
            this.d = true;
            TL_stars.TL_payments_getStarsStatus tL_payments_getStarsStatus = new TL_stars.TL_payments_getStarsStatus();
            tL_payments_getStarsStatus.ton = this.f13134b;
            tL_payments_getStarsStatus.peer = new TLRPC.TL_inputPeerSelf();
            ConnectionsManager.getInstance(this.f13133a).sendRequest(tL_payments_getStarsStatus, new dg.d3(10, this, runnable));
        }
        if (z4 && this.f13137g > 0) {
            lf.a m9 = lf.a.m(this.f13136f);
            return lf.a.g(Math.max(0L, m9.a() - this.f13137g), m9.f12054a).o();
        }
        return this.f13136f;
    }

    public final void r(Runnable runnable) {
        q(true, false, runnable);
    }

    public final lf.a s() {
        lf.b bVar;
        lf.a l10 = lf.a.l(p());
        if (l10 == null) {
            if (this.f13134b) {
                bVar = lf.b.f12057b;
            } else {
                bVar = lf.b.f12056a;
            }
            return lf.a.i(0L, bVar);
        }
        return l10;
    }

    public final ArrayList u() {
        if (!this.f13140k && !this.f13141l) {
            this.f13140k = true;
            ConnectionsManager.getInstance(this.f13133a).sendRequest(new TL_stars.TL_payments_getStarsGiftOptions(), new j6(this, 3));
            return this.f13142m;
        }
        return this.f13142m;
    }

    public final ArrayList v() {
        if (!this.f13143n && !this.f13144o) {
            this.f13143n = true;
            ConnectionsManager.getInstance(this.f13133a).sendRequest(new TL_stars.TL_payments_getStarsGiveawayOptions(), new j6(this, 4));
            return this.f13145p;
        }
        return this.f13145p;
    }

    public final ArrayList z() {
        if (!this.h && !this.f13138i) {
            this.h = true;
            ConnectionsManager.getInstance(this.f13133a).sendRequest(new TL_stars.TL_payments_getStarsTopupOptions(), new j6(this, 2));
            return this.f13139j;
        }
        return this.f13139j;
    }
}
