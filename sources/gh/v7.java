package gh;

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
import org.telegram.messenger.ll;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.oc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.hz0;
import org.telegram.ui.la0;
import org.telegram.ui.qn;
public final class v7 {
    public static volatile v7[][] S = (v7[][]) Array.newInstance(v7.class, 2, 4);
    public static final Object[][] T = (Object[][]) Array.newInstance(Object.class, 2, 4);
    public boolean A;
    public u7 B;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public long G;
    public r7 N;
    public final int f9045a;
    public final boolean f9046b;
    public long f9047c;
    public boolean d;
    public boolean f9048e;
    public long f9050g;
    public boolean h;
    public boolean f9051i;
    public ArrayList f9052j;
    public boolean f9053k;
    public boolean f9054l;
    public ArrayList f9055m;
    public boolean f9056n;
    public boolean f9057o;
    public ArrayList f9058p;
    public String f9064w;
    public boolean f9065x;
    public boolean f9066y;
    public TL_stars.StarsAmount f9049f = TL_stars.StarsAmount.ofStars(0);
    public final ArrayList[] f9059q = {new ArrayList(), new ArrayList(), new ArrayList()};
    public final boolean[] f9060r = new boolean[3];
    public final String[] f9061s = new String[3];
    public final boolean[] f9062t = new boolean[3];
    public final boolean[] f9063u = new boolean[3];
    public final ArrayList v = new ArrayList();
    public final ArrayList f9067z = new ArrayList();
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
        for (int i9 = 0; i9 < 2; i9++) {
            for (int i10 = 0; i10 < 4; i10++) {
                T[i9][i10] = new Object();
            }
        }
    }

    public v7(int i9, boolean z10) {
        this.f9045a = i9;
        this.f9046b = z10;
    }

    public static org.telegram.ui.ActionBar.b6 I() {
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U != null) {
            return U.getResourceProvider();
        }
        return null;
    }

    public static v7 L(int i9) {
        return y(i9, true);
    }

    public static boolean U(int i9, gf.a aVar) {
        if (aVar == null || x(i9, aVar.f7747a).s().f7748b >= aVar.f7748b) {
            return true;
        }
        return false;
    }

    public static void a(v7 v7Var, TL_stars.StarGifts starGifts) {
        ArrayList arrayList = v7Var.I;
        ArrayList arrayList2 = v7Var.J;
        int i9 = v7Var.f9045a;
        ArrayList arrayList3 = v7Var.H;
        v7Var.C = false;
        v7Var.D = true;
        if (starGifts instanceof TL_stars.TL_starGifts) {
            TL_stars.TL_starGifts tL_starGifts = (TL_stars.TL_starGifts) starGifts;
            MessagesController.getInstance(i9).putUsers(tL_starGifts.users, false);
            MessagesController.getInstance(i9).putChats(tL_starGifts.chats, false);
            MessagesStorage.getInstance(i9).putUsersAndChats(tL_starGifts.users, tL_starGifts.chats, true, true);
            arrayList3.clear();
            arrayList3.addAll(tL_starGifts.gifts);
            arrayList2.clear();
            arrayList2.addAll(arrayList3);
            Collections.sort(arrayList2, Comparator$EL.thenComparingInt(Comparator$CC.comparingInt(new ff.d(4)), new ff.d(5)));
            arrayList.clear();
            arrayList.addAll(arrayList3);
            Collections.sort(arrayList, Comparator$CC.comparingInt(new ff.d(6)));
            v7Var.F = tL_starGifts.hash;
            v7Var.G = System.currentTimeMillis();
            NotificationCenter.getInstance(i9).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftsLoaded, new Object[0]);
            v7Var.c0(v7Var.F, v7Var.G, tL_starGifts.gifts);
        } else if (starGifts instanceof TL_stars.TL_starGiftsNotModified) {
            int i10 = v7Var.F;
            long currentTimeMillis = System.currentTimeMillis();
            v7Var.G = currentTimeMillis;
            v7Var.c0(i10, currentTimeMillis, arrayList3);
        }
    }

    public static void b(v7 v7Var, ArrayList arrayList, Integer num, Long l10, ArrayList arrayList2, ArrayList arrayList3) {
        int i9 = v7Var.f9045a;
        MessagesController.getInstance(i9).putUsers(arrayList2, true);
        MessagesController.getInstance(i9).putChats(arrayList3, true);
        v7Var.E = true;
        ArrayList arrayList4 = v7Var.H;
        arrayList4.clear();
        arrayList4.addAll(arrayList);
        ArrayList arrayList5 = v7Var.J;
        arrayList5.clear();
        arrayList5.addAll(arrayList4);
        Collections.sort(arrayList5, Comparator$EL.thenComparingInt(Comparator$CC.comparingInt(new ff.d(1)), new ff.d(2)));
        ArrayList arrayList6 = v7Var.I;
        arrayList6.clear();
        arrayList6.addAll(arrayList4);
        Collections.sort(arrayList6, Comparator$CC.comparingInt(new ff.d(3)));
        v7Var.F = num.intValue();
        v7Var.G = l10.longValue();
        v7Var.C = false;
        NotificationCenter.getInstance(i9).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftsLoaded, new Object[0]);
        v7Var.V();
    }

    public static void e(String str) {
        oc X;
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        if (R != null && R.visibleDialog == null) {
            X = oc.a0(R);
        } else {
            X = oc.X();
        }
        org.telegram.ui.Cells.j2.q(R.string.UnknownErrorCode, new Object[]{str}, X, R.raw.error, 36);
    }

    public static void e0(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, b6Var);
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.StarsNotAvailableTitle);
        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.StarsNotAvailableText);
        org.telegram.messenger.l0.o(R.string.OK, alertDialog$Builder, null);
    }

    public static boolean k(TL_stars.SavedStarGift savedStarGift, TL_stars.SavedStarGift savedStarGift2) {
        int i9 = savedStarGift.flags;
        if ((i9 & 2048) == 0 || (savedStarGift2.flags & 2048) == 0 || savedStarGift.saved_id != savedStarGift2.saved_id) {
            if ((i9 & 8) != 0 && (savedStarGift2.flags & 8) != 0 && savedStarGift.msg_id == savedStarGift2.msg_id) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static TL_stars.StarGiftAttribute l(ArrayList arrayList, Class cls) {
        if (arrayList != null) {
            int size = arrayList.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
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
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
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
            return tL_messages_forwardMessages.allow_paid_stars / tL_messages_forwardMessages.f22466id.size();
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

    public static v7 w(int i9) {
        return y(i9, false);
    }

    public static v7 x(int i9, gf.b bVar) {
        boolean z10;
        if (bVar == gf.b.f7750b) {
            z10 = true;
        } else {
            z10 = false;
        }
        return y(i9, z10);
    }

    public static v7 y(int i9, boolean z10) {
        v7 v7Var;
        v7 v7Var2 = S[z10 ? 1 : 0][i9];
        if (v7Var2 == null) {
            synchronized (T[z10 ? 1 : 0][i9]) {
                try {
                    v7Var = S[z10 ? 1 : 0][i9];
                    if (v7Var == null) {
                        v7[] v7VarArr = S[z10 ? 1 : 0];
                        v7 v7Var3 = new v7(i9, z10);
                        v7VarArr[i9] = v7Var3;
                        v7Var = v7Var3;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return v7Var;
        }
        return v7Var2;
    }

    public final long A(p7 p7Var, TLRPC.TL_messageReactions tL_messageReactions) {
        Long l10;
        u7 u7Var = this.B;
        if (u7Var != null && u7Var.f8963a.equals(p7Var) && (l10 = this.B.f8974n) != null) {
            return l10.longValue();
        }
        Long myPaidReactionPeer = MessageObject.getMyPaidReactionPeer(tL_messageReactions);
        if (myPaidReactionPeer != null) {
            return myPaidReactionPeer.longValue();
        }
        Long paidReactionsDialogId = MessagesController.getInstance(this.f9045a).getPaidReactionsDialogId();
        if (paidReactionsDialogId != null) {
            return paidReactionsDialogId.longValue();
        }
        return 0L;
    }

    public final long B(MessageObject messageObject) {
        Long myPaidReactionPeer;
        Long l10;
        u7 u7Var = this.B;
        if (u7Var != null && u7Var.f8963a.equals(p7.b(messageObject)) && (l10 = this.B.f8974n) != null) {
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
        Long paidReactionsDialogId = MessagesController.getInstance(this.f9045a).getPaidReactionsDialogId();
        if (paidReactionsDialogId != null) {
            return paidReactionsDialogId.longValue();
        }
        return 0L;
    }

    public final void C(long j10, long j11, Utilities.Callback callback) {
        TL_account.getPaidMessagesRevenue getpaidmessagesrevenue = new TL_account.getPaidMessagesRevenue();
        int i9 = this.f9045a;
        getpaidmessagesrevenue.user_id = MessagesController.getInstance(i9).getInputUser(j10);
        if (j11 != 0) {
            getpaidmessagesrevenue.parent_peer = MessagesController.getInstance(i9).getInputPeer(j11);
        }
        ConnectionsManager.getInstance(i9).sendRequest(getpaidmessagesrevenue, new x6(0, callback));
    }

    public final long D(int i9, long j10) {
        u7 u7Var = this.B;
        if (u7Var != null) {
            p7 p7Var = u7Var.f8963a;
            if (p7Var.f8727a == j10 && p7Var.f8728b == i9 && u7Var.f8972l) {
                return u7Var.h;
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

    public final l7 F(long j10, boolean z10) {
        LongSparseArray longSparseArray = this.K;
        l7 l7Var = (l7) longSparseArray.get(j10);
        if (l7Var == null && z10) {
            l7 l7Var2 = new l7(this.f9045a, j10);
            longSparseArray.put(j10, l7Var2);
            return l7Var2;
        }
        return l7Var;
    }

    public final n7 G(long j10, boolean z10) {
        LongSparseArray longSparseArray = this.L;
        n7 n7Var = (n7) longSparseArray.get(j10);
        if (n7Var == null && z10) {
            n7 n7Var2 = new n7(this.f9045a, j10, true);
            longSparseArray.put(j10, n7Var2);
            return n7Var2;
        }
        return n7Var;
    }

    public final void H(TL_stars.StarGift starGift, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, Utilities.Callback callback) {
        Context context = LaunchActivity.C1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        org.telegram.ui.ActionBar.b6 I = I();
        if (starGift != null && context != null) {
            if (!this.f9048e) {
                r(new e2(this, callback, starGift, j10));
                return;
            }
            TLRPC.TL_inputInvoiceStarGiftResale tL_inputInvoiceStarGiftResale = new TLRPC.TL_inputInvoiceStarGiftResale();
            tL_inputInvoiceStarGiftResale.slug = starGift.slug;
            tL_inputInvoiceStarGiftResale.to_id = MessagesController.getInstance(this.f9045a).getInputPeer(j10);
            tL_inputInvoiceStarGiftResale.ton = this.f9046b;
            tL_inputInvoiceStarGiftResale.message = tL_textWithEntities;
            tL_inputInvoiceStarGiftResale.show_name = !z10;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject p6 = mh.c3.p(I, false);
            if (p6 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = p6.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftResale;
            ConnectionsManager.getInstance(this.f9045a).sendRequest(tL_payments_getPaymentForm, new bg.j0(8, this, callback));
        }
    }

    public final TL_stars.StarGift J(long j10) {
        V();
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i9 < arrayList.size()) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList.get(i9);
                if (starGift.f22607id == j10) {
                    return starGift;
                }
                i9++;
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
        ConnectionsManager.getInstance(this.f9045a).sendRequest(getstargiftupgradepreview, new bg.f0(this, j10, callback, 1));
    }

    public final void M(TL_stars.InputSavedStarGift inputSavedStarGift, Utilities.Callback callback) {
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(ApplicationLoader.applicationContext, 3, null);
        c2Var.q(200L);
        TL_stars.getSavedStarGift getsavedstargift = new TL_stars.getSavedStarGift();
        getsavedstargift.stargift.add(inputSavedStarGift);
        ConnectionsManager.getInstance(this.f9045a).sendRequest(getsavedstargift, new fh.h1(this, c2Var, inputSavedStarGift, callback, 3));
    }

    public final boolean N() {
        return O(0);
    }

    public final boolean O(int i9) {
        if (this.f9048e && !this.f9059q[i9].isEmpty()) {
            return true;
        }
        return false;
    }

    public final void P() {
        this.f9048e = false;
        p();
        this.f9048e = true;
    }

    public final void Q(long j10) {
        n7 G = G(j10, false);
        if (G != null) {
            G.i(false);
        }
        l7 l7Var = (l7) this.K.get(j10);
        if (l7Var != null) {
            l7Var.g();
        }
    }

    public final void R(TLRPC.UserFull userFull) {
        long j10 = userFull.f22528id;
        n7 G = G(j10, false);
        if (G != null && G.f8627n != userFull.stargifts_count) {
            G.i(false);
        }
        l7 l7Var = (l7) this.K.get(j10);
        if (l7Var != null) {
            l7Var.g();
        }
    }

    public final void S() {
        if (this.f9065x) {
            return;
        }
        this.v.clear();
        this.f9064w = null;
        this.f9065x = false;
        this.f9066y = false;
        W();
    }

    public final void T(boolean z10) {
        for (int i9 = 0; i9 < 3; i9++) {
            boolean[] zArr = this.f9062t;
            if (!zArr[i9]) {
                this.f9059q[i9].clear();
                this.f9061s[i9] = null;
                zArr[i9] = false;
                this.f9063u[i9] = false;
                if (z10) {
                    X(i9);
                }
            }
        }
    }

    public final void V() {
        if (!this.C) {
            if (!this.D || System.currentTimeMillis() - this.G >= 60000) {
                this.C = true;
                boolean z10 = this.E;
                int i9 = this.f9045a;
                if (!z10) {
                    i3 i3Var = new i3(this, 3);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i9);
                    messagesStorage.getStorageQueue().postRunnable(new bg.o0(messagesStorage, arrayList3, arrayList2, arrayList, i3Var, 9));
                    return;
                }
                int i10 = this.F;
                bg.i iVar = new bg.i(this, 14);
                TL_stars.getStarGifts getstargifts = new TL_stars.getStarGifts();
                getstargifts.hash = i10;
                ConnectionsManager.getInstance(i9).sendRequest(getstargifts, new bf.a(iVar, 8));
            }
        }
    }

    public final void W() {
        if (!this.f9046b && !this.f9065x && !this.f9066y) {
            this.f9065x = true;
            TL_stars.TL_getStarsSubscriptions tL_getStarsSubscriptions = new TL_stars.TL_getStarsSubscriptions();
            tL_getStarsSubscriptions.peer = new TLRPC.TL_inputPeerSelf();
            String str = this.f9064w;
            tL_getStarsSubscriptions.offset = str;
            if (str == null) {
                tL_getStarsSubscriptions.offset = "";
            }
            ConnectionsManager.getInstance(this.f9045a).sendRequest(tL_getStarsSubscriptions, new m6(this, 1));
        }
    }

    public final void X(int i9) {
        boolean z10;
        boolean[] zArr = this.f9062t;
        if (!zArr[i9] && !this.f9063u[i9]) {
            boolean z11 = true;
            zArr[i9] = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
            tL_payments_getStarsTransactions.ton = this.f9046b;
            tL_payments_getStarsTransactions.peer = new TLRPC.TL_inputPeerSelf();
            if (i9 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            tL_payments_getStarsTransactions.inbound = z10;
            if (i9 != 2) {
                z11 = false;
            }
            tL_payments_getStarsTransactions.outbound = z11;
            String str = this.f9061s[i9];
            tL_payments_getStarsTransactions.offset = str;
            if (str == null) {
                tL_payments_getStarsTransactions.offset = "";
            }
            ConnectionsManager.getInstance(this.f9045a).sendRequest(tL_payments_getStarsTransactions, new u1(this, i9, 1));
        }
    }

    public final void Y(org.telegram.messenger.MessageObject r39, org.telegram.tgnet.TLRPC.InputInvoice r40, org.telegram.tgnet.TLRPC.TL_payments_paymentFormStars r41, java.lang.Runnable r42, org.telegram.messenger.Utilities.Callback r43) {
        throw new UnsupportedOperationException("Method not decompiled: gh.v7.Y(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$InputInvoice, org.telegram.tgnet.TLRPC$TL_payments_paymentFormStars, java.lang.Runnable, org.telegram.messenger.Utilities$Callback):void");
    }

    public final void Z(final String str, final TLRPC.ChatInvite chatInvite, final Utilities.Callback2 callback2) {
        if (chatInvite != null && chatInvite.subscription_pricing != null) {
            final Context context = ApplicationLoader.applicationContext;
            final org.telegram.ui.ActionBar.b6 I = I();
            if (context != null) {
                final long j10 = chatInvite.subscription_pricing.amount;
                final String str2 = chatInvite.title;
                TLRPC.TL_inputInvoiceChatInviteSubscription tL_inputInvoiceChatInviteSubscription = new TLRPC.TL_inputInvoiceChatInviteSubscription();
                tL_inputInvoiceChatInviteSubscription.hash = str;
                TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                tL_payments_sendStarsForm.form_id = chatInvite.subscription_form_id;
                tL_payments_sendStarsForm.invoice = tL_inputInvoiceChatInviteSubscription;
                ConnectionsManager.getInstance(this.f9045a).sendRequest(tL_payments_sendStarsForm, new RequestDelegate() {
                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        final v7 v7Var = v7.this;
                        final Utilities.Callback2 callback22 = callback2;
                        final long j11 = j10;
                        final String str3 = str2;
                        final Context context2 = context;
                        final org.telegram.ui.ActionBar.b6 b6Var = I;
                        final TLRPC.ChatInvite chatInvite2 = chatInvite;
                        final String str4 = str;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                oc X;
                                String str5;
                                long j12;
                                la0 la0Var;
                                v7 v7Var2 = v7.this;
                                TLObject tLObject2 = tLObject;
                                Utilities.Callback2 callback23 = callback22;
                                long j13 = j11;
                                String str6 = str3;
                                TLRPC.TL_error tL_error2 = tL_error;
                                Context context3 = context2;
                                org.telegram.ui.ActionBar.b6 b6Var2 = b6Var;
                                TLRPC.ChatInvite chatInvite3 = chatInvite2;
                                String str7 = str4;
                                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                                if (!AndroidUtilities.hasDialogOnTop(R)) {
                                    X = oc.a0(R);
                                } else {
                                    X = oc.X();
                                }
                                if (tLObject2 instanceof TLRPC.TL_payments_paymentResult) {
                                    TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject2;
                                    Utilities.stageQueue.postRunnable(new i6(v7Var2, tL_payments_paymentResult, 0));
                                    TLRPC.Updates updates = tL_payments_paymentResult.updates;
                                    TLRPC.Update update = updates.update;
                                    if (update instanceof TL_update.TL_updateChannel) {
                                        j12 = -((TL_update.TL_updateChannel) update).channel_id;
                                    } else {
                                        j12 = 0;
                                    }
                                    if (updates.updates != null) {
                                        for (int i9 = 0; i9 < tL_payments_paymentResult.updates.updates.size(); i9++) {
                                            if (tL_payments_paymentResult.updates.updates.get(i9) instanceof TL_update.TL_updateChannel) {
                                                j12 = -((TL_update.TL_updateChannel) tL_payments_paymentResult.updates.updates.get(i9)).channel_id;
                                            }
                                        }
                                    }
                                    callback23.run(Long.valueOf(j12), Boolean.TRUE);
                                    if (j12 == 0) {
                                        X.M(LocaleController.getString(R.string.StarsSubscriptionCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscriptionCompletedText", (int) j13, str6)), R.raw.stars_send).j();
                                    }
                                    LaunchActivity launchActivity = LaunchActivity.C1;
                                    if (launchActivity != null && (la0Var = launchActivity.f35532t0) != null) {
                                        la0Var.c(true);
                                    }
                                    v7Var2.T(true);
                                    v7Var2.S();
                                } else if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                                    if (!MessagesController.getInstance(v7Var2.f9045a).starsPurchaseAvailable()) {
                                        callback23.run(0L, Boolean.FALSE);
                                        v7.e0(context3, b6Var2);
                                        return;
                                    }
                                    boolean[] zArr = {false};
                                    ea eaVar = new ea(context3, b6Var2, j13, 1, chatInvite3.title, new bg.o0(v7Var2, zArr, str7, chatInvite3, callback23, 8), 0L);
                                    eaVar.setOnDismissListener(new j6(callback23, zArr, 0));
                                    eaVar.show();
                                } else {
                                    callback23.run(0L, Boolean.FALSE);
                                    int i10 = R.raw.error;
                                    int i11 = R.string.UnknownErrorCode;
                                    if (tL_error2 != null) {
                                        str5 = tL_error2.text;
                                    } else {
                                        str5 = "FAILED_SEND_STARS";
                                    }
                                    org.telegram.ui.Cells.j2.q(i11, new Object[]{str5}, X, i10, 36);
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
            final org.telegram.ui.ActionBar.b6 I = I();
            if (context == null) {
                return;
            }
            ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStars.invoice.prices;
            int size = arrayList.size();
            final long j11 = 0;
            int i9 = 0;
            while (i9 < size) {
                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i9);
                i9++;
                j11 += tL_labeledPrice.amount;
            }
            if (messageObject != null) {
                TLRPC.Message message = messageObject.messageOwner;
                if (message != null && (messageFwdHeader = message.fwd_from) != null && (peer = messageFwdHeader.from_id) != null) {
                    j10 = DialogObject.getPeerDialogId(peer);
                } else {
                    j10 = messageObject.getDialogId();
                }
                if (j10 < 0 && messageObject.getFromChatId() > 0 && (user = MessagesController.getInstance(this.f9045a).getUser(Long.valueOf(messageObject.getFromChatId()))) != null && user.bot) {
                    j10 = user.f22527id;
                }
            } else {
                j10 = tL_payments_paymentFormStars.bot_id;
            }
            final long j12 = j10;
            if (j12 >= 0) {
                str = UserObject.getUserName(MessagesController.getInstance(this.f9045a).getUser(Long.valueOf(j12)));
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(this.f9045a).getChat(Long.valueOf(-j12));
                if (chat == null) {
                    str = "";
                } else {
                    str = chat.title;
                }
            }
            final String str2 = str;
            final String str3 = tL_payments_paymentFormStars.title;
            final int i10 = tL_payments_paymentFormStars.invoice.subscription_period;
            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
            tL_payments_sendStarsForm.form_id = tL_payments_paymentFormStars.form_id;
            tL_payments_sendStarsForm.invoice = inputInvoice;
            ConnectionsManager.getInstance(this.f9045a).sendRequest(tL_payments_sendStarsForm, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    final v7 v7Var = v7.this;
                    final Utilities.Callback callback2 = callback;
                    final MessageObject messageObject2 = messageObject;
                    final Context context2 = context;
                    final long j13 = j11;
                    final String str4 = str2;
                    final int i11 = i10;
                    final String str5 = str3;
                    final TLRPC.InputInvoice inputInvoice2 = inputInvoice;
                    final long j14 = j12;
                    final org.telegram.ui.ActionBar.b6 b6Var = I;
                    final TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars2 = tL_payments_paymentFormStars;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            throw new UnsupportedOperationException("Method not decompiled: gh.g7.run():void");
                        }
                    });
                }
            });
        }
    }

    public final void b0(long j10, long j11, boolean z10) {
        int i9 = this.f9045a;
        TopicsController topicsController = MessagesController.getInstance(i9).getTopicsController();
        TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j10, j11);
        if (findTopic != null) {
            findTopic.nopaid_messages_exception = z10;
            topicsController.saveTopics(j10);
            NotificationCenter.getInstance(i9).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesFeeUpdated, Long.valueOf(j11));
        }
    }

    public final boolean c(TLObject tLObject, ArrayList arrayList, Runnable runnable) {
        if (arrayList.isEmpty() || o(tLObject) <= 0) {
            return true;
        }
        HashSet hashSet = new HashSet();
        int size = arrayList.size();
        boolean z10 = false;
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            int id2 = ((MessageObject) obj).getId();
            hashSet.add(Integer.valueOf(id2));
            if (this.Q.remove(Integer.valueOf(id2))) {
                this.R.put(Integer.valueOf(id2), new androidx.car.app.utils.b(this, hashSet, runnable, 27));
                z10 = true;
            }
        }
        return !z10;
    }

    public final void c0(int i9, long j10, ArrayList arrayList) {
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.f9045a);
        messagesStorage.getStorageQueue().postRunnable(new y6(messagesStorage, j10, arrayList, i9));
    }

    public final void d(org.telegram.messenger.MessageObject r18) {
        throw new UnsupportedOperationException("Method not decompiled: gh.v7.d(org.telegram.messenger.MessageObject):void");
    }

    public final u7 d0(final MessageObject messageObject, final qn qnVar, final long j10, boolean z10, boolean z11, final Long l10) {
        long j11;
        v7 v7Var;
        boolean z12;
        String str;
        p7 b10 = p7.b(messageObject);
        int i9 = this.f9045a;
        v7 y10 = y(i9, false);
        Context t10 = t(qnVar);
        if (t10 == null) {
            return null;
        }
        String str2 = "";
        if (z11 && y10.f9048e && y10.q(false, false, null).amount <= 0) {
            long a2 = qnVar.a();
            if (a2 >= 0) {
                str2 = UserObject.getForcedFirstName(qnVar.getMessagesController().getUser(Long.valueOf(a2)));
            } else {
                TLRPC.Chat chat = qnVar.getMessagesController().getChat(Long.valueOf(-a2));
                if (chat != null) {
                    str2 = chat.title;
                }
            }
            new ea(t10, qnVar.getResourceProvider(), j10, 5, str2, new Runnable(this) {
                public final v7 f8824b;

                {
                    this.f8824b = this;
                }

                @Override
                public final void run() {
                    switch (r7) {
                        case 0:
                            this.f8824b.d0(messageObject, qnVar, j10, true, true, l10);
                            return;
                        default:
                            this.f8824b.d0(messageObject, qnVar, j10, true, true, l10);
                            return;
                    }
                }
            }, 0L).show();
            return null;
        }
        u7 u7Var = this.B;
        if (u7Var != null && u7Var.f8963a.equals(b10)) {
            j11 = 0;
            v7Var = this;
        } else {
            u7 u7Var2 = this.B;
            if (u7Var2 != null) {
                u7Var2.b();
            }
            ConnectionsManager.getInstance(i9).getCurrentTime();
            j11 = 0;
            v7Var = this;
            u7 u7Var3 = new u7(v7Var, b10, messageObject, qnVar, z10);
            v7Var.B = u7Var3;
            u7Var3.f8974n = l10;
        }
        if (v7Var.B.h + j10 > MessagesController.getInstance(i9).starsPaidReactionAmountMax) {
            v7Var.B.b();
            ConnectionsManager.getInstance(i9).getCurrentTime();
            v7Var.B = new u7(v7Var, b10, messageObject, qnVar, z10);
        }
        final long j12 = v7Var.B.h + j10;
        if (z11 && y10.f9048e && y10.q(false, false, null).amount < j12) {
            v7Var.B.a();
            long a3 = qnVar.a();
            if (a3 >= j11) {
                str = UserObject.getForcedFirstName(qnVar.getMessagesController().getUser(Long.valueOf(a3)));
            } else {
                TLRPC.Chat chat2 = qnVar.getMessagesController().getChat(Long.valueOf(-a3));
                if (chat2 != null) {
                    str2 = chat2.title;
                }
                str = str2;
            }
            new ea(t10, qnVar.getResourceProvider(), j12, 5, str, new Runnable(v7Var) {
                public final v7 f8824b;

                {
                    this.f8824b = v7Var;
                }

                @Override
                public final void run() {
                    switch (r7) {
                        case 0:
                            this.f8824b.d0(messageObject, qnVar, j12, true, true, l10);
                            return;
                        default:
                            this.f8824b.d0(messageObject, qnVar, j12, true, true, l10);
                            return;
                    }
                }
            }, 0L).show();
            return null;
        }
        u7 u7Var4 = v7Var.B;
        if ((messageObject != null && !messageObject.doesPaidReactionExist()) || z10) {
            z12 = true;
        } else {
            z12 = false;
        }
        s7 s7Var = u7Var4.f8976p;
        v7 v7Var2 = u7Var4.f8977q;
        int i10 = v7Var2.f9045a;
        ac acVar = u7Var4.f8966e;
        MessageObject messageObject2 = u7Var4.f8964b;
        if (!u7Var4.f8969i && !u7Var4.f8970j) {
            u7Var4.h += j10;
            System.currentTimeMillis();
            acVar.f26756c.a();
            acVar.f26756c.c(AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSentText", (int) u7Var4.h, new Object[0])), true, true);
            if (u7Var4.f8973m) {
                u7Var4.f8967f.f35268b = 5000L;
                AndroidUtilities.cancelRunOnUIThread(s7Var);
                AndroidUtilities.runOnUIThread(s7Var, 5000L);
            }
            if (z12) {
                u7Var4.f8972l = true;
                messageObject2.addPaidReactions((int) j10, true, u7Var4.c());
                v7Var2.f9050g += j10;
                NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject2.getDialogId()), Integer.valueOf(messageObject2.getId()), messageObject2.messageOwner.reactions);
                NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
            } else {
                u7Var4.f8972l = false;
                if (messageObject2.ensurePaidReactionsExist(true)) {
                    u7Var4.f8971k--;
                }
                NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject2.getDialogId()), Integer.valueOf(messageObject2.getId()), messageObject2.messageOwner.reactions);
                u7Var4.f8971k += j10;
            }
            acVar.f26755b.setText(u7Var4.d());
        } else if (BuildVars.DEBUG_PRIVATE_VERSION) {
            throw new RuntimeException("adding more amount to committed reactions");
        }
        u7 u7Var5 = v7Var.B;
        u7Var5.f8974n = l10;
        return u7Var5;
    }

    public final void f(Activity activity, TL_stars.TL_starsTopupOption tL_starsTopupOption, Utilities.Callback2 callback2, TLRPC.InputPeer inputPeer) {
        boolean z10;
        if (activity == null) {
            return;
        }
        int i9 = this.f9045a;
        if (!MessagesController.getInstance(i9).starsPurchaseAvailable()) {
            org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
            if (R != null && R.getContext() != null) {
                e0(R.getContext(), R.getResourceProvider());
                return;
            } else {
                e0(activity, null);
                return;
            }
        }
        if (AppGlobalConfig.getInstance(i9).starsSpendTopUpInvoiceDisabled.get() && inputPeer != null) {
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
            JSONObject p6 = mh.c3.p(I(), false);
            if (p6 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = p6.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
            ConnectionsManager.getInstance(i9).sendRequest(tL_payments_getPaymentForm, new bg.b0(this, callback2, tL_inputInvoiceStars, 9));
        } else if (!BillingController.getInstance().isReady()) {
            callback2.run(Boolean.FALSE, "INVOICE DISABLED");
        } else {
            TLRPC.TL_inputStorePaymentStarsTopup tL_inputStorePaymentStarsTopup2 = new TLRPC.TL_inputStorePaymentStarsTopup();
            tL_inputStorePaymentStarsTopup2.stars = tL_starsTopupOption.stars;
            tL_inputStorePaymentStarsTopup2.currency = tL_starsTopupOption.currency;
            tL_inputStorePaymentStarsTopup2.amount = tL_starsTopupOption.amount;
            b9.c cVar = new b9.c();
            cVar.f1663c = "inapp";
            cVar.f1662b = tL_starsTopupOption.store_product;
            n2.o a2 = cVar.a();
            FileLog.d("StarsController.buy starts queryProductDetails");
            BillingController.getInstance().queryProductDetails(Arrays.asList(a2), new a1.d(callback2, tL_inputStorePaymentStarsTopup2, tL_starsTopupOption, activity, 2));
        }
    }

    public final void f0(List list) {
        if (list != null && !list.isEmpty()) {
            MessageObject messageObject = (MessageObject) list.get(0);
            long dialogId = messageObject.getDialogId();
            int i9 = this.f9045a;
            if (dialogId >= 0) {
                MessagesController.getInstance(i9).loadFullUser(MessagesController.getInstance(i9).getUser(Long.valueOf(dialogId)), 0, true);
            } else {
                MessagesController.getInstance(i9).loadFullChat(-dialogId, 0, true);
            }
            oc.a0(LaunchActivity.U()).Q(R.raw.error, 36, oa.Q0(TextUtils.concat(LocaleController.formatPluralString("PaidMessagesSendErrorToast1", (int) messageObject.messageOwner.errorAllowedPriceStars, new Object[0]), " ", LocaleController.formatPluralString("PaidMessagesSendErrorToast2", (int) messageObject.messageOwner.errorNewPriceStars, new Object[0])))).j();
        }
    }

    public final void g(final long j10, final TLObject tLObject, final TLRPC.TL_textWithEntities tL_textWithEntities, final Utilities.Callback2 callback2) {
        int i9;
        Context context = LaunchActivity.C1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        final Context context2 = context;
        final org.telegram.ui.ActionBar.b6 I = I();
        boolean z10 = tLObject instanceof TLRPC.TL_premiumGiftOption;
        if ((z10 || (tLObject instanceof TLRPC.TL_premiumGiftCodeOption)) && context2 != null) {
            if (!this.f9048e) {
                r(new fh.m1(this, callback2, j10, tLObject, tL_textWithEntities, 3));
                return;
            }
            if (z10) {
                i9 = ((TLRPC.TL_premiumGiftOption) tLObject).months;
            } else if (tLObject instanceof TLRPC.TL_premiumGiftCodeOption) {
                i9 = ((TLRPC.TL_premiumGiftCodeOption) tLObject).months;
            } else {
                return;
            }
            final String name = DialogObject.getName(this.f9045a, j10);
            final TLRPC.TL_inputInvoicePremiumGiftStars tL_inputInvoicePremiumGiftStars = new TLRPC.TL_inputInvoicePremiumGiftStars();
            tL_inputInvoicePremiumGiftStars.user_id = MessagesController.getInstance(this.f9045a).getInputUser(j10);
            tL_inputInvoicePremiumGiftStars.months = i9;
            if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                tL_inputInvoicePremiumGiftStars.flags |= 1;
                tL_inputInvoicePremiumGiftStars.message = tL_textWithEntities;
            }
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject p6 = mh.c3.p(I, false);
            if (p6 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = p6.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoicePremiumGiftStars;
            ConnectionsManager.getInstance(this.f9045a).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                    final v7 v7Var = v7.this;
                    final Utilities.Callback2 callback22 = callback2;
                    final TLRPC.TL_inputInvoicePremiumGiftStars tL_inputInvoicePremiumGiftStars2 = tL_inputInvoicePremiumGiftStars;
                    final Context context3 = context2;
                    final org.telegram.ui.ActionBar.b6 b6Var = I;
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
                                v7.e(str2);
                                callback23.run(Boolean.FALSE, null);
                                return;
                            }
                            TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = (TLRPC.TL_payments_paymentFormStars) tLObject4;
                            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                            tL_payments_sendStarsForm.form_id = tL_payments_paymentFormStars.form_id;
                            tL_payments_sendStarsForm.invoice = tL_inputInvoicePremiumGiftStars2;
                            ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStars.invoice.prices;
                            int size = arrayList.size();
                            int i10 = 0;
                            long j12 = 0;
                            while (i10 < size) {
                                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i10);
                                i10++;
                                j12 += tL_labeledPrice.amount;
                            }
                            v7 v7Var2 = v7.this;
                            ConnectionsManager.getInstance(v7Var2.f9045a).sendRequest(tL_payments_sendStarsForm, new g6(v7Var2, callback23, context3, b6Var, j12, str, j11, tLObject3, tL_textWithEntities2));
                        }
                    });
                }
            });
        }
    }

    public final void g0(LaunchActivity launchActivity, long j10, String str) {
        if (!this.f9048e) {
            r(new e2(this, (Object) launchActivity, j10, (Object) str, 7));
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
        org.telegram.ui.ActionBar.b6 I = I();
        if (starGift != null && context2 != null) {
            if (!this.f9048e) {
                r(new fh.m1(this, callback2, tL_payments_paymentFormStarGift, starGift, j10, 4));
                return;
            }
            String name = DialogObject.getName(this.f9045a, j10);
            TLRPC.TL_inputInvoiceStarGiftResale tL_inputInvoiceStarGiftResale = new TLRPC.TL_inputInvoiceStarGiftResale();
            tL_inputInvoiceStarGiftResale.slug = starGift.slug;
            tL_inputInvoiceStarGiftResale.to_id = MessagesController.getInstance(this.f9045a).getInputPeer(j10);
            tL_inputInvoiceStarGiftResale.ton = this.f9046b;
            tL_inputInvoiceStarGiftResale.message = tL_textWithEntities;
            tL_inputInvoiceStarGiftResale.show_name = !z10;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            int i9 = 0;
            JSONObject p6 = mh.c3.p(I, false);
            if (p6 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = p6.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftResale;
            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
            tL_payments_sendStarsForm.form_id = tL_payments_paymentFormStarGift.form_id;
            tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftResale;
            ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStarGift.invoice.prices;
            int size = arrayList.size();
            long j11 = 0;
            while (i9 < size) {
                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i9);
                i9++;
                j11 += tL_labeledPrice.amount;
                size = size;
                context2 = context2;
            }
            ConnectionsManager.getInstance(this.f9045a).sendRequest(tL_payments_sendStarsForm, new g6(this, callback2, context2, I, j11, name, tL_payments_paymentFormStarGift, starGift, j10));
        }
    }

    public final void h0(LaunchActivity launchActivity, long j10, String str) {
        if (p().amount < j10 && j10 > 0) {
            new ea(launchActivity, null, j10, 4, str, new bg.d2(6), 0L).show();
            return;
        }
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        gc J = oc.a0(U).J(R.raw.stars_topup, LocaleController.getString(R.string.StarsTopupLinkEnough), LocaleController.getString(R.string.StarsTopupLinkTopupAnyway), new bg.d2(5));
        J.f28737j = 5000;
        J.k(true);
    }

    public final void i(final TL_stars.StarGift starGift, final boolean z10, final boolean z11, final long j10, final TLRPC.TL_textWithEntities tL_textWithEntities, final fh.h6 h6Var) {
        Context context = LaunchActivity.C1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        final Context context2 = context;
        final org.telegram.ui.ActionBar.b6 I = I();
        if (starGift != null && context2 != null) {
            if (!this.f9048e) {
                r(new Runnable() {
                    @Override
                    public final void run() {
                        v7 v7Var = v7.this;
                        boolean z12 = v7Var.f9048e;
                        fh.h6 h6Var2 = h6Var;
                        if (!z12) {
                            v7.e("NO_BALANCE");
                            h6Var2.run(Boolean.FALSE, null);
                            return;
                        }
                        v7Var.i(starGift, z10, z11, j10, tL_textWithEntities, h6Var2);
                    }
                });
                return;
            }
            final String name = DialogObject.getName(this.f9045a, j10);
            final TLRPC.TL_inputInvoiceStarGift tL_inputInvoiceStarGift = new TLRPC.TL_inputInvoiceStarGift();
            tL_inputInvoiceStarGift.hide_name = z10;
            tL_inputInvoiceStarGift.peer = MessagesController.getInstance(this.f9045a).getInputPeer(j10);
            tL_inputInvoiceStarGift.gift_id = starGift.f22607id;
            tL_inputInvoiceStarGift.include_upgrade = z11;
            if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                tL_inputInvoiceStarGift.flags |= 2;
                tL_inputInvoiceStarGift.message = tL_textWithEntities;
            }
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject p6 = mh.c3.p(I, false);
            if (p6 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = p6.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGift;
            ConnectionsManager.getInstance(this.f9045a).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    final v7 v7Var = v7.this;
                    final fh.h6 h6Var2 = h6Var;
                    final TLRPC.TL_inputInvoiceStarGift tL_inputInvoiceStarGift2 = tL_inputInvoiceStarGift;
                    final Context context3 = context2;
                    final org.telegram.ui.ActionBar.b6 b6Var = I;
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
                            final fh.h6 h6Var3 = h6Var2;
                            if (!z14) {
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    str2 = "NO_PAYMENT_FORM";
                                } else {
                                    str2 = tL_error2.text;
                                }
                                v7.e(str2);
                                h6Var3.run(Boolean.FALSE, null);
                                return;
                            }
                            TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) tLObject2;
                            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                            tL_payments_sendStarsForm.form_id = tL_payments_paymentFormStarGift.form_id;
                            tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGift2;
                            ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStarGift.invoice.prices;
                            int size = arrayList.size();
                            int i9 = 0;
                            final long j12 = 0;
                            while (i9 < size) {
                                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i9);
                                i9++;
                                j12 += tL_labeledPrice.amount;
                            }
                            final v7 v7Var2 = v7.this;
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(v7Var2.f9045a);
                            final Context context4 = context3;
                            final org.telegram.ui.ActionBar.b6 b6Var2 = b6Var;
                            final String str3 = str;
                            final TL_stars.StarGift starGift3 = starGift2;
                            final boolean z15 = z12;
                            final boolean z16 = z13;
                            final long j13 = j11;
                            final TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_textWithEntities2;
                            connectionsManager.sendRequest(tL_payments_sendStarsForm, new RequestDelegate() {
                                @Override
                                public final void run(final TLObject tLObject3, final TLRPC.TL_error tL_error3) {
                                    final v7 v7Var3 = v7.this;
                                    final fh.h6 h6Var4 = h6Var3;
                                    final Context context5 = context4;
                                    final org.telegram.ui.ActionBar.b6 b6Var3 = b6Var2;
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
                                            oc X;
                                            int i10;
                                            SpannableStringBuilder spannableStringBuilder;
                                            SpannableStringBuilder replaceTags;
                                            la0 la0Var;
                                            ?? r52;
                                            char c10;
                                            String str5;
                                            v7 v7Var4 = v7.this;
                                            TLObject tLObject4 = tLObject3;
                                            TLRPC.TL_error tL_error4 = tL_error3;
                                            fh.h6 h6Var5 = h6Var4;
                                            Context context6 = context5;
                                            org.telegram.ui.ActionBar.b6 b6Var4 = b6Var3;
                                            long j16 = j14;
                                            String str6 = str4;
                                            TL_stars.StarGift starGift5 = starGift4;
                                            boolean z19 = z17;
                                            boolean z20 = z18;
                                            long j17 = j15;
                                            TLRPC.TL_textWithEntities tL_textWithEntities5 = tL_textWithEntities4;
                                            org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                                            if (R != null && R.visibleDialog == null) {
                                                X = oc.a0(R);
                                            } else {
                                                X = oc.X();
                                            }
                                            if (!(tLObject4 instanceof TLRPC.TL_payments_paymentResult)) {
                                                if (tL_error4 != null) {
                                                    c10 = 0;
                                                    if ("BALANCE_TOO_LOW".equals(tL_error4.text)) {
                                                        if (!MessagesController.getInstance(v7Var4.f9045a).starsPurchaseAvailable()) {
                                                            h6Var5.run(Boolean.FALSE, null);
                                                            v7.e0(context6, b6Var4);
                                                            return;
                                                        }
                                                        boolean[] zArr = {false};
                                                        ea eaVar = new ea(context6, b6Var4, j16, 6, str6, new l6(v7Var4, zArr, starGift5, z19, z20, j17, tL_textWithEntities5, h6Var5), 0L);
                                                        eaVar.setOnDismissListener(new bg.j(1, h6Var5, zArr));
                                                        eaVar.show();
                                                        return;
                                                    }
                                                } else {
                                                    c10 = 0;
                                                }
                                                if (tL_error4 != null && "STARGIFT_USAGE_LIMITED".equals(tL_error4.text)) {
                                                    h6Var5.run(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                                                    return;
                                                } else if (tL_error4 != null && "STARGIFT_USER_USAGE_LIMITED".equals(tL_error4.text)) {
                                                    h6Var5.run(Boolean.FALSE, "STARGIFT_USER_USAGE_LIMITED");
                                                    return;
                                                } else {
                                                    h6Var5.run(Boolean.FALSE, null);
                                                    int i11 = R.raw.error;
                                                    int i12 = R.string.UnknownErrorCode;
                                                    if (tL_error4 != null) {
                                                        str5 = tL_error4.text;
                                                    } else {
                                                        str5 = "FAILED_SEND_STARS";
                                                    }
                                                    Object[] objArr = new Object[1];
                                                    objArr[c10] = str5;
                                                    org.telegram.ui.Cells.j2.q(i12, objArr, X, i11, 36);
                                                    return;
                                                }
                                            }
                                            Utilities.stageQueue.postRunnable(new i6(v7Var4, (TLRPC.TL_payments_paymentResult) tLObject4, 1));
                                            v7Var4.D = false;
                                            v7Var4.E = true;
                                            v7Var4.G = 0L;
                                            v7Var4.V();
                                            v7Var4.Q(j17);
                                            v7Var4.T(true);
                                            h6Var5.run(Boolean.TRUE, null);
                                            if (BirthdayController.getInstance(v7Var4.f9045a).contains(j17)) {
                                                i10 = 0;
                                                MessagesController.getInstance(v7Var4.f9045a).getMainSettings().edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j17, false).apply();
                                            } else {
                                                i10 = 0;
                                            }
                                            if (starGift5 != null && starGift5.limited_per_user) {
                                                int i13 = starGift5.per_user_remains - 1;
                                                starGift5.per_user_remains = i13;
                                                spannableStringBuilder = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2SentRemainsLimit", Math.max(i10, i13)));
                                            } else {
                                                spannableStringBuilder = null;
                                            }
                                            if (j17 < 0) {
                                                long j18 = -j17;
                                                TLRPC.ChatFull chatFull = MessagesController.getInstance(v7Var4.f9045a).getChatFull(j18);
                                                if (chatFull != null) {
                                                    chatFull.stargifts_count++;
                                                    chatFull.flags2 |= 262144;
                                                    MessagesController.getInstance(v7Var4.f9045a).putChatFull(chatFull);
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
                                                        oc a02 = oc.a0(R);
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
                                                profileActivity2.whenFullyVisible(new fh.m1(profileActivity2, starGift5, spannableStringBuilder, j16, str6, 5));
                                                R.presentFragment(profileActivity2);
                                            } else {
                                                SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
                                                if ((R instanceof qn) && ((qn) R).a() == j17) {
                                                    oc a03 = oc.a0(R);
                                                    TLRPC.Document document2 = starGift5.sticker;
                                                    String string2 = LocaleController.getString(R.string.StarsGiftCompleted);
                                                    if (spannableStringBuilder2 != null) {
                                                        replaceTags = spannableStringBuilder2;
                                                    } else {
                                                        replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftCompletedText", (int) j16, new Object[0]));
                                                    }
                                                    a03.s(document2, string2, replaceTags).k(true);
                                                } else {
                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(v7Var4.f9045a);
                                                    int i14 = NotificationCenter.closeProfileActivity;
                                                    Long valueOf = Long.valueOf(j17);
                                                    Boolean bool = Boolean.FALSE;
                                                    notificationCenter.lambda$postNotificationNameOnUIThread$1(i14, valueOf, bool);
                                                    NotificationCenter.getInstance(v7Var4.f9045a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChatActivity, Long.valueOf(j17), bool);
                                                    qn R9 = qn.R9(j17);
                                                    R9.whenFullyVisible(new e2(R9, starGift5, spannableStringBuilder2, j16, 6));
                                                    R.presentFragment(R9);
                                                }
                                            }
                                            MessagesController.getInstance(v7Var4.f9045a).getMainSettings().edit().putBoolean("show_gift_for_" + j17, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j17, true).apply();
                                            LaunchActivity launchActivity = LaunchActivity.C1;
                                            if (launchActivity != null && (la0Var = launchActivity.f35532t0) != null) {
                                                la0Var.c(true);
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
        int i9 = this.f9045a;
        togglenopaidmessagesexception.user_id = MessagesController.getInstance(i9).getInputUser(j10);
        if (j11 != 0) {
            togglenopaidmessagesexception.parent_peer = MessagesController.getInstance(i9).getInputPeer(j11);
        }
        togglenopaidmessagesexception.refund_charged = z10;
        togglenopaidmessagesexception.require_payment = !z11;
        ConnectionsManager.getInstance(i9).sendRequest(togglenopaidmessagesexception, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                AndroidUtilities.runOnUIThread(new a7(v7.this, tLObject, j11, j10, z11));
            }
        });
    }

    public final boolean j() {
        if (!this.f9046b) {
            return false;
        }
        if (lh.g.A0()) {
            return true;
        }
        TL_stars.StarsAmount p6 = p();
        if (p6.nanos == 0 && p6.amount == 0) {
            return false;
        }
        return true;
    }

    public final void j0(String str, TLRPC.ChatInvite chatInvite, Utilities.Callback2 callback2) {
        int i9;
        String str2;
        if (chatInvite != null && chatInvite.subscription_pricing != null) {
            Context context = LaunchActivity.C1;
            if (context == null) {
                context = ApplicationLoader.applicationContext;
            }
            Context context2 = context;
            org.telegram.ui.ActionBar.b6 I = I();
            long j10 = chatInvite.subscription_pricing.amount;
            if (context2 != null) {
                int i10 = UserConfig.selectedAccount;
                boolean[] zArr = {false};
                f7 f7Var = new f7(this, j10, i10, zArr, callback2, context2, I, chatInvite, str);
                e5.u uVar = new e5.u(this, zArr, callback2);
                org.telegram.ui.ActionBar.f3 j11 = ll.j(context2, I, false, false);
                LinearLayout f10 = ll.f(context2, 1);
                f10.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
                FrameLayout frameLayout = new FrameLayout(context2);
                frameLayout.addView(new n9(context2, 40, 0), g7.e6.c(-1.0f, -1));
                org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context2);
                o9Var.setRoundRadius(AndroidUtilities.dp(80.0f));
                org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
                z8Var.s(chatInvite.color);
                String str3 = chatInvite.title;
                z8Var.A = true;
                z8Var.f35232n = 0;
                z8Var.f35231m = false;
                org.telegram.ui.Components.z8.a(str3, null, null, z8Var.f35235q);
                TLRPC.Photo photo = chatInvite.photo;
                if (photo != null) {
                    o9Var.h(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(80.0f)), chatInvite.photo), "80_80", z8Var, chatInvite);
                } else {
                    o9Var.setImageDrawable(z8Var);
                }
                frameLayout.addView(o9Var, g7.e6.e(80, 80, 17));
                Drawable drawable = context2.getResources().getDrawable(R.drawable.star_small_outline);
                int i11 = org.telegram.ui.ActionBar.f6.f23072h5;
                drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i11, I), PorterDuff.Mode.SRC_IN));
                Drawable drawable2 = context2.getResources().getDrawable(R.drawable.star_small_inner);
                ImageView imageView = new ImageView(context2);
                imageView.setImageDrawable(drawable);
                frameLayout.addView(imageView, g7.e6.e(26, 26, 17));
                imageView.setTranslationX(AndroidUtilities.dp(26.0f));
                imageView.setTranslationY(AndroidUtilities.dp(26.0f));
                imageView.setScaleX(1.2f);
                imageView.setScaleY(1.2f);
                ImageView imageView2 = new ImageView(context2);
                imageView2.setImageDrawable(drawable2);
                frameLayout.addView(imageView2, g7.e6.e(26, 26, 17));
                imageView2.setTranslationX(AndroidUtilities.dp(26.0f));
                imageView2.setTranslationY(AndroidUtilities.dp(26.0f));
                da daVar = new da(context2, i10, I);
                g7.g6.a(daVar);
                daVar.setOnClickListener(new l8(daVar, 1));
                frameLayout.addView(daVar, g7.e6.d(-2, -2.0f, 53, 0.0f, 0.0f, -8.0f, 0.0f));
                f10.addView(frameLayout, g7.e6.q(-1, 117, 7));
                TextView g10 = org.telegram.messenger.l0.g(context2, 1, 20.0f);
                g10.setTypeface(AndroidUtilities.bold());
                int i12 = org.telegram.ui.ActionBar.f6.f23108j5;
                g10.setTextColor(org.telegram.ui.ActionBar.f6.v0(i12, I));
                ll.l(R.string.StarsSubscribeTitle, g10, 17);
                TextView h = j3.r0.h(f10, g10, g7.e6.t(-2, -2, 1, 0, 8, 0, 0), context2);
                h.setTextSize(1, 14.0f);
                h.setTextColor(org.telegram.ui.ActionBar.f6.v0(i12, I));
                TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                int i13 = tL_starsSubscriptionPricing.period;
                if (i13 == 2592000) {
                    i9 = i11;
                    h.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscribeText", (int) tL_starsSubscriptionPricing.amount, chatInvite.title)));
                } else {
                    i9 = i11;
                    if (i13 == 300) {
                        str2 = "5 minutes";
                    } else {
                        str2 = "a minute";
                    }
                    h.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscribeTextTest", (int) tL_starsSubscriptionPricing.amount, chatInvite.title, str2)));
                }
                h.setMaxWidth(kh.x3.a(h.getText(), h.getPaint()));
                h.setGravity(17);
                f10.addView(h, g7.e6.t(-2, -2, 1, 0, 6, 0, 22));
                if (!TextUtils.isEmpty(chatInvite.about)) {
                    TextView g11 = org.telegram.messenger.l0.g(context2, 1, 14.0f);
                    g11.setTextColor(org.telegram.ui.ActionBar.f6.v0(i12, I));
                    g11.setText(Emoji.replaceEmoji(chatInvite.about, g11.getPaint().getFontMetricsInt(), false));
                    g11.setGravity(17);
                    f10.addView(g11, g7.e6.t(-2, -2, 1, 0, 6, 0, 22));
                }
                kh.d dVar = new kh.d(context2, I, true);
                dVar.g(LocaleController.getString(R.string.StarsSubscribeButton), false, true);
                f10.addView(dVar, g7.e6.n(-1, 48));
                l80 l80Var = new l80(context2, I);
                l80Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsSubscribeInfo), new e2.f(context2, 9)));
                l80Var.setGravity(17);
                l80Var.setTextSize(1, 13.0f);
                l80Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.B6, I));
                l80Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23061gc, I));
                f10.addView(l80Var, g7.e6.t(-1, -2, 49, 14, 14, 14, 6));
                j11.customView = f10;
                dVar.setOnClickListener(new fg.f(f7Var, j11, dVar, 8));
                j11.setOnDismissListener(new eh.l(uVar, 3));
                j11.fixNavigationBar(org.telegram.ui.ActionBar.f6.v0(i9, I));
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (!AndroidUtilities.isTablet() && U != null && !AndroidUtilities.hasDialogOnTop(U)) {
                    j11.makeAttached(U);
                }
                j11.show();
            }
        }
    }

    public final void k0(TL_stars.StarsAmount starsAmount) {
        boolean equals = this.f9049f.equals(starsAmount);
        int i9 = this.f9045a;
        if (!equals) {
            this.f9049f = starsAmount;
            this.f9050g = 0L;
            NotificationCenter.getInstance(i9).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        } else if (this.f9050g != 0) {
            this.f9050g = 0L;
            NotificationCenter.getInstance(i9).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
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
        int i9 = this.f9045a;
        tL_messages_editMessage.peer = MessagesController.getInstance(i9).getInputPeer(dialogId);
        int i10 = tL_messages_editMessage.flags;
        tL_messages_editMessage.flags = 32768 | i10;
        tL_messages_editMessage.schedule_date = messageObject.messageOwner.date;
        tL_messages_editMessage.f22463id = id2;
        tL_messages_editMessage.flags = i10 | 49152;
        TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia = new TLRPC.TL_inputMediaPaidMedia();
        tL_inputMediaPaidMedia.stars_amount = j10;
        int i11 = 0;
        while (i11 < tL_messageMediaPaidMedia2.extended_media.size()) {
            TLRPC.MessageExtendedMedia messageExtendedMedia = tL_messageMediaPaidMedia2.extended_media.get(i11);
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
            i11++;
            tL_messageMediaPaidMedia2 = tL_messageMediaPaidMedia;
        }
        tL_messages_editMessage.media = tL_inputMediaPaidMedia;
        ConnectionsManager.getInstance(i9).sendRequest(tL_messages_editMessage, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                AndroidUtilities.runOnUIThread(new h7(v7.this, tLObject, runnable, tL_error, z10, dialogId, id2, messageObject, j10));
            }
        });
    }

    public final TL_stars.SavedStarGift n(long j10) {
        TL_stars.StarGift starGift;
        int i9 = 0;
        while (true) {
            LongSparseArray longSparseArray = this.L;
            if (i9 < longSparseArray.size()) {
                n7 n7Var = (n7) longSparseArray.valueAt(i9);
                for (int i10 = 0; i10 < n7Var.f8625l.size(); i10++) {
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) n7Var.f8625l.get(i10);
                    if (savedStarGift != null && (starGift = savedStarGift.gift) != null && starGift.f22607id == j10) {
                        return savedStarGift;
                    }
                }
                i9++;
            } else {
                return null;
            }
        }
    }

    public final TL_stars.StarsAmount p() {
        return q(true, false, null);
    }

    public final TL_stars.StarsAmount q(boolean z10, boolean z11, Runnable runnable) {
        if (((!this.f9048e || System.currentTimeMillis() - this.f9047c > 60000) && !this.d) || z11) {
            this.d = true;
            TL_stars.TL_payments_getStarsStatus tL_payments_getStarsStatus = new TL_stars.TL_payments_getStarsStatus();
            tL_payments_getStarsStatus.ton = this.f9046b;
            tL_payments_getStarsStatus.peer = new TLRPC.TL_inputPeerSelf();
            ConnectionsManager.getInstance(this.f9045a).sendRequest(tL_payments_getStarsStatus, new bg.j0(9, this, runnable));
        }
        if (z10 && this.f9050g > 0) {
            gf.a m10 = gf.a.m(this.f9049f);
            return gf.a.g(Math.max(0L, m10.a() - this.f9050g), m10.f7747a).o();
        }
        return this.f9049f;
    }

    public final void r(Runnable runnable) {
        q(true, false, runnable);
    }

    public final gf.a s() {
        gf.b bVar;
        gf.a l10 = gf.a.l(p());
        if (l10 == null) {
            if (this.f9046b) {
                bVar = gf.b.f7750b;
            } else {
                bVar = gf.b.f7749a;
            }
            return gf.a.i(0L, bVar);
        }
        return l10;
    }

    public final ArrayList u() {
        if (!this.f9053k && !this.f9054l) {
            this.f9053k = true;
            ConnectionsManager.getInstance(this.f9045a).sendRequest(new TL_stars.TL_payments_getStarsGiftOptions(), new m6(this, 3));
            return this.f9055m;
        }
        return this.f9055m;
    }

    public final ArrayList v() {
        if (!this.f9056n && !this.f9057o) {
            this.f9056n = true;
            ConnectionsManager.getInstance(this.f9045a).sendRequest(new TL_stars.TL_payments_getStarsGiveawayOptions(), new m6(this, 4));
            return this.f9058p;
        }
        return this.f9058p;
    }

    public final ArrayList z() {
        if (!this.h && !this.f9051i) {
            this.h = true;
            ConnectionsManager.getInstance(this.f9045a).sendRequest(new TL_stars.TL_payments_getStarsTopupOptions(), new m6(this, 2));
            return this.f9052j;
        }
        return this.f9052j;
    }
}
