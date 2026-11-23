package di;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.f00;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.o10;
import org.telegram.messenger.p10;
import org.telegram.messenger.r10;
import org.telegram.messenger.ur;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.m80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bn;
import org.telegram.ui.u80;
import org.telegram.ui.vv0;
public final class y8 {
    public static volatile y8[][] S = (y8[][]) Array.newInstance(y8.class, 2, 4);
    public static final Object[][] T = (Object[][]) Array.newInstance(Object.class, 2, 4);
    public boolean A;
    public w8 B;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public long G;
    public t8 N;
    public final int f10085a;
    public final boolean f10086b;
    public long f10087c;
    public boolean d;
    public boolean f10088e;
    public long f10090g;
    public boolean h;
    public boolean f10091i;
    public ArrayList f10092j;
    public boolean f10093k;
    public boolean f10094l;
    public ArrayList f10095m;
    public boolean f10096n;
    public boolean f10097o;
    public ArrayList f10098p;
    public String f10104w;
    public boolean f10105x;
    public boolean f10106y;
    public TL_stars.StarsAmount f10089f = TL_stars.StarsAmount.ofStars(0);
    public final ArrayList[] f10099q = {new ArrayList(), new ArrayList(), new ArrayList()};
    public final boolean[] f10100r = new boolean[3];
    public final String[] f10101s = new String[3];
    public final boolean[] f10102t = new boolean[3];
    public final boolean[] f10103u = new boolean[3];
    public final ArrayList v = new ArrayList();
    public final ArrayList f10107z = new ArrayList();
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
        for (int i7 = 0; i7 < 2; i7++) {
            for (int i10 = 0; i10 < 4; i10++) {
                T[i7][i10] = new Object();
            }
        }
    }

    public y8(int i7, boolean z10) {
        this.f10085a = i7;
        this.f10086b = z10;
    }

    public static org.telegram.ui.ActionBar.h6 I() {
        org.telegram.ui.ActionBar.g2 T2 = LaunchActivity.T();
        if (T2 != null) {
            return T2.getResourceProvider();
        }
        return null;
    }

    public static boolean S(int i7, cg.a aVar) {
        if (aVar == null || x(i7, aVar.f5303a).s().f5304b >= aVar.f5304b) {
            return true;
        }
        return false;
    }

    public static void a(y8 y8Var, TL_stars.StarGifts starGifts) {
        ArrayList arrayList = y8Var.I;
        ArrayList arrayList2 = y8Var.J;
        int i7 = y8Var.f10085a;
        ArrayList arrayList3 = y8Var.H;
        y8Var.C = false;
        y8Var.D = true;
        if (starGifts instanceof TL_stars.TL_starGifts) {
            TL_stars.TL_starGifts tL_starGifts = (TL_stars.TL_starGifts) starGifts;
            np.u1(i7).f4(tL_starGifts.users, false);
            np.u1(i7).Z3(tL_starGifts.chats, false);
            ur.a0(i7).m1(tL_starGifts.users, tL_starGifts.chats, true, true);
            arrayList3.clear();
            arrayList3.addAll(tL_starGifts.gifts);
            arrayList2.clear();
            arrayList2.addAll(arrayList3);
            Collections.sort(arrayList2, Comparator$EL.thenComparingInt(Comparator$CC.comparingInt(new bg.d(4)), new bg.d(5)));
            arrayList.clear();
            arrayList.addAll(arrayList3);
            Collections.sort(arrayList, Comparator$CC.comparingInt(new bg.d(6)));
            y8Var.F = tL_starGifts.hash;
            y8Var.G = System.currentTimeMillis();
            ls.f(i7).k(ls.H3, new Object[0]);
            ArrayList<TL_stars.StarGift> arrayList4 = tL_starGifts.gifts;
            int i10 = y8Var.F;
            long j3 = y8Var.G;
            ur a02 = ur.a0(i7);
            a02.f27250a.c(new bi.u3(i10, 1, j3, a02, arrayList4));
        } else if (starGifts instanceof TL_stars.TL_starGiftsNotModified) {
            int i11 = y8Var.F;
            long currentTimeMillis = System.currentTimeMillis();
            y8Var.G = currentTimeMillis;
            ur a03 = ur.a0(i7);
            a03.f27250a.c(new bi.u3(i11, 1, currentTimeMillis, a03, arrayList3));
        }
    }

    public static void b(y8 y8Var, ArrayList arrayList, Integer num, Long l10, ArrayList arrayList2, ArrayList arrayList3) {
        int i7 = y8Var.f10085a;
        np.u1(i7).f4(arrayList2, true);
        np.u1(i7).Z3(arrayList3, true);
        y8Var.E = true;
        ArrayList arrayList4 = y8Var.H;
        arrayList4.clear();
        arrayList4.addAll(arrayList);
        ArrayList arrayList5 = y8Var.J;
        arrayList5.clear();
        arrayList5.addAll(arrayList4);
        Collections.sort(arrayList5, Comparator$EL.thenComparingInt(Comparator$CC.comparingInt(new bg.d(1)), new bg.d(2)));
        ArrayList arrayList6 = y8Var.I;
        arrayList6.clear();
        arrayList6.addAll(arrayList4);
        Collections.sort(arrayList6, Comparator$CC.comparingInt(new bg.d(3)));
        y8Var.F = num.intValue();
        y8Var.G = l10.longValue();
        y8Var.C = false;
        ls.f(i7).k(ls.H3, new Object[0]);
        y8Var.T();
    }

    public static void c0(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var);
        String N0 = hd.N0(2131744817, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
        t1Var.S = N0;
        t1Var.U = hd.N0(2131744818, null);
        org.telegram.messenger.f3.m(null, 2131747637, alertDialog$Builder, null);
    }

    public static void e(String str) {
        org.telegram.ui.Components.lc Y;
        org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
        if (Q != null && Q.visibleDialog == null) {
            Y = org.telegram.ui.Components.lc.b0(Q);
        } else {
            Y = org.telegram.ui.Components.lc.Y();
        }
        Y.Q(2131624012, 36, org.telegram.ui.Components.lc.W(str)).j();
    }

    public static boolean k(TL_stars.SavedStarGift savedStarGift, TL_stars.SavedStarGift savedStarGift2) {
        int i7 = savedStarGift.flags;
        if ((i7 & 2048) == 0 || (savedStarGift2.flags & 2048) == 0 || savedStarGift.saved_id != savedStarGift2.saved_id) {
            if ((i7 & 8) != 0 && (savedStarGift2.flags & 8) != 0 && savedStarGift.msg_id == savedStarGift2.msg_id) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static TL_stars.StarGiftAttribute l(ArrayList arrayList, Class cls) {
        if (arrayList != null) {
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
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
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
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
            return tL_messages_forwardMessages.allow_paid_stars / tL_messages_forwardMessages.f28522id.size();
        } else if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
            return ((TLRPC.TL_messages_sendMedia) tLObject).allow_paid_stars;
        } else {
            return 0L;
        }
    }

    public static Context t(org.telegram.ui.ActionBar.g2 g2Var) {
        if (g2Var != null && g2Var.getContext() != null) {
            return g2Var.getContext();
        }
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null && !launchActivity.isFinishing()) {
            return LaunchActivity.H1;
        }
        if (org.telegram.messenger.t0.f26931b != null) {
            return org.telegram.messenger.t0.f26931b;
        }
        return null;
    }

    public static y8 w(int i7) {
        return y(i7, false);
    }

    public static y8 x(int i7, cg.b bVar) {
        boolean z10;
        if (bVar == cg.b.f5306b) {
            z10 = true;
        } else {
            z10 = false;
        }
        return y(i7, z10);
    }

    public static y8 y(int i7, boolean z10) {
        y8 y8Var;
        y8 y8Var2 = S[z10 ? 1 : 0][i7];
        if (y8Var2 == null) {
            synchronized (T[z10 ? 1 : 0][i7]) {
                try {
                    y8Var = S[z10 ? 1 : 0][i7];
                    if (y8Var == null) {
                        y8[] y8VarArr = S[z10 ? 1 : 0];
                        y8 y8Var3 = new y8(i7, z10);
                        y8VarArr[i7] = y8Var3;
                        y8Var = y8Var3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return y8Var;
        }
        return y8Var2;
    }

    public final long A(r8 r8Var, TLRPC.TL_messageReactions tL_messageReactions) {
        ArrayList<TLRPC.MessageReactor> arrayList;
        Long l10;
        w8 w8Var = this.B;
        if (w8Var != null && w8Var.f9996a.equals(r8Var) && (l10 = this.B.f10007n) != null) {
            return l10.longValue();
        }
        Long l11 = null;
        if (tL_messageReactions != null && (arrayList = tL_messageReactions.top_reactors) != null) {
            int size = arrayList.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size) {
                    break;
                }
                TLRPC.MessageReactor messageReactor = arrayList.get(i7);
                i7++;
                TLRPC.MessageReactor messageReactor2 = messageReactor;
                if (messageReactor2 != null && messageReactor2.my) {
                    if (messageReactor2.anonymous) {
                        l11 = 2666000L;
                        break;
                    }
                    TLRPC.Peer peer = messageReactor2.peer_id;
                    if (peer != null) {
                        l11 = Long.valueOf(org.telegram.messenger.n5.o(peer));
                        break;
                    }
                }
            }
        }
        if (l11 != null) {
            return l11.longValue();
        }
        Long A1 = np.u1(this.f10085a).A1();
        if (A1 != null) {
            return A1.longValue();
        }
        return 0L;
    }

    public final long B(gj gjVar) {
        Long z12;
        Long l10;
        w8 w8Var = this.B;
        if (w8Var != null && w8Var.f9996a.equals(r8.b(gjVar)) && (l10 = this.B.f10007n) != null) {
            return l10.longValue();
        }
        if (gjVar == null) {
            z12 = null;
        } else {
            z12 = gjVar.z1();
        }
        if (z12 != null) {
            return z12.longValue();
        }
        Long A1 = np.u1(this.f10085a).A1();
        if (A1 != null) {
            return A1.longValue();
        }
        return 0L;
    }

    public final void C(long j3, long j10, y10 y10Var) {
        TL_account.getPaidMessagesRevenue getpaidmessagesrevenue = new TL_account.getPaidMessagesRevenue();
        int i7 = this.f10085a;
        getpaidmessagesrevenue.user_id = np.u1(i7).q1(j3);
        if (j10 != 0) {
            getpaidmessagesrevenue.parent_peer = np.u1(i7).l1(j10);
        }
        ConnectionsManager.getInstance(i7).sendRequest(getpaidmessagesrevenue, new y7(y10Var, 0));
    }

    public final long D(int i7, long j3) {
        w8 w8Var = this.B;
        if (w8Var != null) {
            r8 r8Var = w8Var.f9996a;
            if (r8Var.f9699a == j3 && r8Var.f9700b == i7 && w8Var.f10005l) {
                return w8Var.h;
            }
            return 0L;
        }
        return 0L;
    }

    public final long E(gj gjVar) {
        TLRPC.Message message;
        if (gjVar != null && (message = gjVar.f24213k) != null) {
            if ((message.isThreadMessage || gjVar.k3()) && gjVar.f24213k.fwd_from != null) {
                return D(gjVar.f24213k.fwd_from.saved_from_msg_id, gjVar.Z0());
            }
            return D(gjVar.e1(), gj.B0(gjVar.f24213k));
        }
        return 0L;
    }

    public final n8 F(long j3, boolean z10) {
        LongSparseArray longSparseArray = this.K;
        n8 n8Var = (n8) longSparseArray.get(j3);
        if (n8Var == null && z10) {
            n8 n8Var2 = new n8(this.f10085a, j3);
            longSparseArray.put(j3, n8Var2);
            return n8Var2;
        }
        return n8Var;
    }

    public final p8 G(long j3, boolean z10) {
        LongSparseArray longSparseArray = this.L;
        p8 p8Var = (p8) longSparseArray.get(j3);
        if (p8Var == null && z10) {
            p8 p8Var2 = new p8(this.f10085a, j3, true);
            longSparseArray.put(j3, p8Var2);
            return p8Var2;
        }
        return p8Var;
    }

    public final void H(TL_stars.StarGift starGift, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, y10 y10Var) {
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = org.telegram.messenger.t0.f26931b;
        }
        org.telegram.ui.ActionBar.h6 I = I();
        if (starGift != null && context != null) {
            if (!this.f10088e) {
                r(new m(this, y10Var, starGift, j3, tL_textWithEntities, z10));
                return;
            }
            TLRPC.TL_inputInvoiceStarGiftResale tL_inputInvoiceStarGiftResale = new TLRPC.TL_inputInvoiceStarGiftResale();
            tL_inputInvoiceStarGiftResale.slug = starGift.slug;
            tL_inputInvoiceStarGiftResale.to_id = np.u1(this.f10085a).l1(j3);
            tL_inputInvoiceStarGiftResale.ton = this.f10086b;
            tL_inputInvoiceStarGiftResale.message = tL_textWithEntities;
            tL_inputInvoiceStarGiftResale.show_name = !z10;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject u10 = ki.s2.u(I, false);
            if (u10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftResale;
            ConnectionsManager.getInstance(this.f10085a).sendRequest(tL_payments_getPaymentForm, new bi.o1(9, this, y10Var));
        }
    }

    public final TL_stars.StarGift J(long j3) {
        T();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i7 < arrayList.size()) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList.get(i7);
                if (starGift.f28663id == j3) {
                    return starGift;
                }
                i7++;
            } else {
                return null;
            }
        }
    }

    public final void K(long j3, y10 y10Var) {
        TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) this.M.get(Long.valueOf(j3));
        if (stargiftupgradepreview != null) {
            y10Var.a(stargiftupgradepreview);
            return;
        }
        TL_stars.getStarGiftUpgradePreview getstargiftupgradepreview = new TL_stars.getStarGiftUpgradePreview();
        getstargiftupgradepreview.gift_id = j3;
        ConnectionsManager.getInstance(this.f10085a).sendRequest(getstargiftupgradepreview, new q2(this, j3, y10Var, 1));
    }

    public final void L(TL_stars.InputSavedStarGift inputSavedStarGift, y10 y10Var) {
        org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, org.telegram.messenger.t0.f26931b, null);
        t1Var.r(200L);
        TL_stars.getSavedStarGift getsavedstargift = new TL_stars.getSavedStarGift();
        getsavedstargift.stargift.add(inputSavedStarGift);
        ConnectionsManager.getInstance(this.f10085a).sendRequest(getsavedstargift, new bi.k2(this, t1Var, inputSavedStarGift, y10Var, 4));
    }

    public final boolean M(int i7) {
        if (this.f10088e && !this.f10099q[i7].isEmpty()) {
            return true;
        }
        return false;
    }

    public final void N() {
        this.f10088e = false;
        p();
        this.f10088e = true;
    }

    public final void O(long j3) {
        p8 G = G(j3, false);
        if (G != null) {
            G.k(false);
        }
        n8 n8Var = (n8) this.K.get(j3);
        if (n8Var != null) {
            n8Var.g();
        }
    }

    public final void P(TLRPC.UserFull userFull) {
        if (userFull != null) {
            long j3 = userFull.f28584id;
            p8 G = G(j3, false);
            if (G != null && G.f9554n != userFull.stargifts_count) {
                G.k(false);
            }
            n8 n8Var = (n8) this.K.get(j3);
            if (n8Var != null) {
                n8Var.g();
            }
        }
    }

    public final void Q() {
        if (this.f10105x) {
            return;
        }
        this.v.clear();
        this.f10104w = null;
        this.f10105x = false;
        this.f10106y = false;
        U();
    }

    public final void R(boolean z10) {
        for (int i7 = 0; i7 < 3; i7++) {
            boolean[] zArr = this.f10102t;
            if (!zArr[i7]) {
                this.f10099q[i7].clear();
                this.f10101s[i7] = null;
                zArr[i7] = false;
                this.f10103u[i7] = false;
                if (z10) {
                    V(i7);
                }
            }
        }
    }

    public final void T() {
        if (!this.C) {
            if (!this.D || System.currentTimeMillis() - this.G >= 60000) {
                this.C = true;
                boolean z10 = this.E;
                int i7 = this.f10085a;
                if (!z10) {
                    a1.c cVar = new a1.c(this, 28);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    ur a02 = ur.a0(i7);
                    a02.f27250a.c(new ai.b(a02, arrayList3, arrayList2, arrayList, cVar, 6));
                    return;
                }
                int i10 = this.F;
                ai.h0 h0Var = new ai.h0(this, 12);
                TL_stars.getStarGifts getstargifts = new TL_stars.getStarGifts();
                getstargifts.hash = i10;
                ConnectionsManager.getInstance(i7).sendRequest(getstargifts, new ai.g1(h0Var, 3));
            }
        }
    }

    public final void U() {
        if (!this.f10086b && !this.f10105x && !this.f10106y) {
            this.f10105x = true;
            TL_stars.TL_getStarsSubscriptions tL_getStarsSubscriptions = new TL_stars.TL_getStarsSubscriptions();
            tL_getStarsSubscriptions.peer = new TLRPC.TL_inputPeerSelf();
            String str = this.f10104w;
            tL_getStarsSubscriptions.offset = str;
            if (str == null) {
                tL_getStarsSubscriptions.offset = "";
            }
            ConnectionsManager.getInstance(this.f10085a).sendRequest(tL_getStarsSubscriptions, new s7(this, 1));
        }
    }

    public final void V(int i7) {
        boolean z10;
        boolean[] zArr = this.f10102t;
        if (!zArr[i7] && !this.f10103u[i7]) {
            boolean z11 = true;
            zArr[i7] = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
            tL_payments_getStarsTransactions.ton = this.f10086b;
            tL_payments_getStarsTransactions.peer = new TLRPC.TL_inputPeerSelf();
            if (i7 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            tL_payments_getStarsTransactions.inbound = z10;
            if (i7 != 2) {
                z11 = false;
            }
            tL_payments_getStarsTransactions.outbound = z11;
            String str = this.f10101s[i7];
            tL_payments_getStarsTransactions.offset = str;
            if (str == null) {
                tL_payments_getStarsTransactions.offset = "";
            }
            ConnectionsManager.getInstance(this.f10085a).sendRequest(tL_payments_getStarsTransactions, new w1(this, i7, 1));
        }
    }

    public final void W(org.telegram.messenger.gj r39, org.telegram.tgnet.TLRPC.InputInvoice r40, org.telegram.tgnet.TLRPC.TL_payments_paymentFormStars r41, java.lang.Runnable r42, org.telegram.messenger.y10 r43) {
        throw new UnsupportedOperationException("Method not decompiled: di.y8.W(org.telegram.messenger.gj, org.telegram.tgnet.TLRPC$InputInvoice, org.telegram.tgnet.TLRPC$TL_payments_paymentFormStars, java.lang.Runnable, org.telegram.messenger.y10):void");
    }

    public final void X(String str, TLRPC.ChatInvite chatInvite, r10 r10Var) {
        if (chatInvite != null && chatInvite.subscription_pricing != null) {
            Context context = org.telegram.messenger.t0.f26931b;
            org.telegram.ui.ActionBar.h6 I = I();
            if (context != null) {
                long j3 = chatInvite.subscription_pricing.amount;
                String str2 = chatInvite.title;
                TLRPC.TL_inputInvoiceChatInviteSubscription tL_inputInvoiceChatInviteSubscription = new TLRPC.TL_inputInvoiceChatInviteSubscription();
                tL_inputInvoiceChatInviteSubscription.hash = str;
                TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                tL_payments_sendStarsForm.form_id = chatInvite.subscription_form_id;
                tL_payments_sendStarsForm.invoice = tL_inputInvoiceChatInviteSubscription;
                ConnectionsManager.getInstance(this.f10085a).sendRequest(tL_payments_sendStarsForm, new s6(this, r10Var, j3, str2, context, I, chatInvite, str));
            }
        }
    }

    public final void Y(final gj gjVar, final TLRPC.InputInvoice inputInvoice, final TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, final y10 y10Var) {
        long j3;
        String str;
        TLRPC.User c22;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        if (tL_payments_paymentFormStars != null) {
            final Context context = org.telegram.messenger.t0.f26931b;
            final org.telegram.ui.ActionBar.h6 I = I();
            if (context == null) {
                return;
            }
            ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStars.invoice.prices;
            int size = arrayList.size();
            final long j10 = 0;
            int i7 = 0;
            while (i7 < size) {
                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i7);
                i7++;
                j10 += tL_labeledPrice.amount;
            }
            if (gjVar != null) {
                TLRPC.Message message = gjVar.f24213k;
                if (message != null && (messageFwdHeader = message.fwd_from) != null && (peer = messageFwdHeader.from_id) != null) {
                    j3 = org.telegram.messenger.n5.o(peer);
                } else {
                    j3 = gj.B0(message);
                }
                if (j3 < 0 && gjVar.Z0() > 0 && (c22 = np.u1(this.f10085a).c2(Long.valueOf(gjVar.Z0()))) != null && c22.bot) {
                    j3 = c22.f28583id;
                }
            } else {
                j3 = tL_payments_paymentFormStars.bot_id;
            }
            final long j11 = j3;
            if (j11 >= 0) {
                str = p10.q(np.u1(this.f10085a).c2(Long.valueOf(j11)));
            } else {
                TLRPC.Chat O0 = np.u1(this.f10085a).O0(Long.valueOf(-j11));
                if (O0 == null) {
                    str = "";
                } else {
                    str = O0.title;
                }
            }
            final String str2 = str;
            final String str3 = tL_payments_paymentFormStars.title;
            final int i10 = tL_payments_paymentFormStars.invoice.subscription_period;
            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
            tL_payments_sendStarsForm.form_id = tL_payments_paymentFormStars.form_id;
            tL_payments_sendStarsForm.invoice = inputInvoice;
            ConnectionsManager.getInstance(this.f10085a).sendRequest(tL_payments_sendStarsForm, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    final y8 y8Var = y8.this;
                    final y10 y10Var2 = y10Var;
                    final gj gjVar2 = gjVar;
                    final Context context2 = context;
                    final long j12 = j10;
                    final String str4 = str2;
                    final int i11 = i10;
                    final String str5 = str3;
                    final TLRPC.InputInvoice inputInvoice2 = inputInvoice;
                    final long j13 = j11;
                    final org.telegram.ui.ActionBar.h6 h6Var = I;
                    final TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars2 = tL_payments_paymentFormStars;
                    org.telegram.messenger.g0.g3(new Runnable() {
                        @Override
                        public final void run() {
                            throw new UnsupportedOperationException("Method not decompiled: di.f7.run():void");
                        }
                    });
                }
            });
        }
    }

    public final void Z(long j3, long j10, boolean z10) {
        int i7 = this.f10085a;
        f00 f00Var = np.u1(i7).f25968t7;
        TLRPC.TL_forumTopic f10 = f00Var.f(j3, j10);
        if (f10 != null) {
            f10.nopaid_messages_exception = z10;
            a0.h hVar = f00Var.f23807a;
            if (((ArrayList) hVar.f(j3)) != null) {
                f00Var.getMessagesStorage().C1(f00Var.getConnectionsManager().getCurrentTime(), -j3, (List) hVar.f(j3), true);
            }
            ls.f(i7).k(ls.Q3, Long.valueOf(j10));
        }
    }

    public final void a0(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        if (tL_starGiftUnique != null && !TextUtils.isEmpty(tL_starGiftUnique.slug)) {
            int i7 = 0;
            int i10 = 0;
            while (true) {
                LongSparseArray longSparseArray = this.L;
                if (i10 >= longSparseArray.size()) {
                    break;
                }
                ((p8) longSparseArray.valueAt(i10)).o(tL_starGiftUnique);
                i10++;
            }
            while (true) {
                LongSparseArray longSparseArray2 = this.K;
                if (i7 < longSparseArray2.size()) {
                    n8 n8Var = (n8) longSparseArray2.valueAt(i7);
                    p8 p8Var = n8Var.f9411g;
                    if (p8Var != null) {
                        p8Var.o(tL_starGiftUnique);
                    }
                    for (p8 p8Var2 : n8Var.h.values()) {
                        p8Var2.o(tL_starGiftUnique);
                    }
                    i7++;
                } else {
                    return;
                }
            }
        }
    }

    public final di.w8 b0(final org.telegram.messenger.gj r21, final org.telegram.ui.bn r22, final long r23, boolean r25, boolean r26, final java.lang.Long r27) {
        throw new UnsupportedOperationException("Method not decompiled: di.y8.b0(org.telegram.messenger.gj, org.telegram.ui.bn, long, boolean, boolean, java.lang.Long):di.w8");
    }

    public final boolean c(TLObject tLObject, ArrayList arrayList, Runnable runnable) {
        if (arrayList == null || arrayList.isEmpty() || o(tLObject) <= 0) {
            return true;
        }
        HashSet hashSet = new HashSet();
        int size = arrayList.size();
        boolean z10 = false;
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            int e12 = ((gj) obj).e1();
            hashSet.add(Integer.valueOf(e12));
            if (this.Q.remove(Integer.valueOf(e12))) {
                this.R.put(Integer.valueOf(e12), new a8(this, hashSet, runnable, 0));
                z10 = true;
            }
        }
        return !z10;
    }

    public final void d(org.telegram.messenger.gj r15) {
        throw new UnsupportedOperationException("Method not decompiled: di.y8.d(org.telegram.messenger.gj):void");
    }

    public final void d0(List list) {
        if (list != null && !list.isEmpty()) {
            gj gjVar = (gj) list.get(0);
            long B0 = gj.B0(gjVar.f24213k);
            int i7 = (B0 > 0L ? 1 : (B0 == 0L ? 0 : -1));
            int i10 = this.f10085a;
            if (i7 >= 0) {
                np.u1(i10).c3(np.u1(i10).c2(Long.valueOf(B0)), 0, true, null);
            } else {
                np.u1(i10).b3(0, -B0, true);
            }
            org.telegram.ui.Components.lc.b0(LaunchActivity.T()).Q(2131624012, 36, pb.T0(TextUtils.concat(hd.G((int) gjVar.f24213k.errorAllowedPriceStars, "PaidMessagesSendErrorToast1", new Object[0]), " ", hd.G((int) gjVar.f24213k.errorNewPriceStars, "PaidMessagesSendErrorToast2", new Object[0])))).j();
        }
    }

    public final void e0(LaunchActivity launchActivity, long j3, String str) {
        if (!this.f10088e) {
            r(new j2(this, (Object) launchActivity, j3, (Object) str, 5));
        } else {
            f0(launchActivity, j3, str);
        }
    }

    public final void f(Activity activity, TL_stars.TL_starsTopupOption tL_starsTopupOption, r10 r10Var, TLRPC.InputPeer inputPeer) {
        boolean z10;
        if (activity == null) {
            return;
        }
        int i7 = this.f10085a;
        if (np.u1(i7).f25906m7) {
            org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
            if (Q != null && Q.getContext() != null) {
                c0(Q.getContext(), Q.getResourceProvider());
                return;
            } else {
                c0(activity, null);
                return;
            }
        }
        if (((org.telegram.messenger.h0) np.u1(i7).A7.f26235n0.f14030b).f24341c && inputPeer != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((org.telegram.messenger.s2.b() || !org.telegram.messenger.r1.i().k()) && !z10) {
            TLRPC.TL_inputStorePaymentStarsTopup tL_inputStorePaymentStarsTopup = new TLRPC.TL_inputStorePaymentStarsTopup();
            tL_inputStorePaymentStarsTopup.stars = tL_starsTopupOption.stars;
            tL_inputStorePaymentStarsTopup.amount = tL_starsTopupOption.amount;
            tL_inputStorePaymentStarsTopup.currency = tL_starsTopupOption.currency;
            tL_inputStorePaymentStarsTopup.spend_purpose_peer = inputPeer;
            TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
            tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsTopup;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject u10 = ki.s2.u(I(), false);
            if (u10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
            ConnectionsManager.getInstance(i7).sendRequest(tL_payments_getPaymentForm, new bi.q1(this, r10Var, tL_inputInvoiceStars, 5));
        } else if (!org.telegram.messenger.r1.i().k()) {
            r10Var.a(Boolean.FALSE, "INVOICE DISABLED");
        } else {
            TLRPC.TL_inputStorePaymentStarsTopup tL_inputStorePaymentStarsTopup2 = new TLRPC.TL_inputStorePaymentStarsTopup();
            tL_inputStorePaymentStarsTopup2.stars = tL_starsTopupOption.stars;
            tL_inputStorePaymentStarsTopup2.currency = tL_starsTopupOption.currency;
            tL_inputStorePaymentStarsTopup2.amount = tL_starsTopupOption.amount;
            f5.a aVar = new f5.a();
            aVar.f11277c = "inapp";
            aVar.f11276b = tL_starsTopupOption.store_product;
            f5.p a10 = aVar.a();
            org.telegram.messenger.a8.b("StarsController.buy starts queryProductDetails");
            org.telegram.messenger.r1.i().o(Arrays.asList(a10), new a1.d(r10Var, tL_inputStorePaymentStarsTopup2, tL_starsTopupOption, activity, 2));
        }
    }

    public final void f0(LaunchActivity launchActivity, long j3, String str) {
        if (p().amount < j3 && j3 > 0) {
            new fb(launchActivity, null, j3, 4, str, new ai.n(12), 0L).show();
            return;
        }
        org.telegram.ui.ActionBar.g2 T2 = LaunchActivity.T();
        if (T2 == null) {
            return;
        }
        org.telegram.ui.Components.gc K = org.telegram.ui.Components.lc.b0(T2).K(2131624227, hd.N0(2131744721, null), hd.N0(2131744720, null), new ai.n(11));
        K.f35527j = 5000;
        K.k(true);
    }

    public final void g(final long j3, final TLObject tLObject, final TLRPC.TL_textWithEntities tL_textWithEntities, final r10 r10Var) {
        int i7;
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = org.telegram.messenger.t0.f26931b;
        }
        final Context context2 = context;
        final org.telegram.ui.ActionBar.h6 I = I();
        boolean z10 = tLObject instanceof TLRPC.TL_premiumGiftOption;
        if ((z10 || (tLObject instanceof TLRPC.TL_premiumGiftCodeOption)) && context2 != null) {
            if (!this.f10088e) {
                r(new bi.o2(this, r10Var, j3, tLObject, tL_textWithEntities, 4));
                return;
            }
            if (z10) {
                i7 = ((TLRPC.TL_premiumGiftOption) tLObject).months;
            } else if (tLObject instanceof TLRPC.TL_premiumGiftCodeOption) {
                i7 = ((TLRPC.TL_premiumGiftCodeOption) tLObject).months;
            } else {
                return;
            }
            final String l10 = org.telegram.messenger.n5.l(this.f10085a, j3);
            final TLRPC.TL_inputInvoicePremiumGiftStars tL_inputInvoicePremiumGiftStars = new TLRPC.TL_inputInvoicePremiumGiftStars();
            tL_inputInvoicePremiumGiftStars.user_id = np.u1(this.f10085a).q1(j3);
            tL_inputInvoicePremiumGiftStars.months = i7;
            if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                tL_inputInvoicePremiumGiftStars.flags |= 1;
                tL_inputInvoicePremiumGiftStars.message = tL_textWithEntities;
            }
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject u10 = ki.s2.u(I, false);
            if (u10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoicePremiumGiftStars;
            ConnectionsManager.getInstance(this.f10085a).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                    final y8 y8Var = y8.this;
                    final r10 r10Var2 = r10Var;
                    final TLRPC.TL_inputInvoicePremiumGiftStars tL_inputInvoicePremiumGiftStars2 = tL_inputInvoicePremiumGiftStars;
                    final Context context3 = context2;
                    final org.telegram.ui.ActionBar.h6 h6Var = I;
                    final String str = l10;
                    final long j10 = j3;
                    final TLObject tLObject3 = tLObject;
                    final TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_textWithEntities;
                    org.telegram.messenger.g0.g3(new Runnable() {
                        @Override
                        public final void run() {
                            String str2;
                            TLObject tLObject4 = tLObject2;
                            boolean z11 = tLObject4 instanceof TLRPC.TL_payments_paymentFormStars;
                            final r10 r10Var3 = r10Var2;
                            if (!z11) {
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    str2 = "NO_PAYMENT_FORM";
                                } else {
                                    str2 = tL_error2.text;
                                }
                                y8.e(str2);
                                r10Var3.a(Boolean.FALSE, null);
                                return;
                            }
                            TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = (TLRPC.TL_payments_paymentFormStars) tLObject4;
                            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                            tL_payments_sendStarsForm.form_id = tL_payments_paymentFormStars.form_id;
                            tL_payments_sendStarsForm.invoice = tL_inputInvoicePremiumGiftStars2;
                            ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStars.invoice.prices;
                            int size = arrayList.size();
                            int i10 = 0;
                            final long j11 = 0;
                            while (i10 < size) {
                                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i10);
                                i10++;
                                j11 += tL_labeledPrice.amount;
                            }
                            final y8 y8Var2 = y8.this;
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(y8Var2.f10085a);
                            final Context context4 = context3;
                            final org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
                            final String str3 = str;
                            final long j12 = j10;
                            final TLObject tLObject5 = tLObject3;
                            final TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_textWithEntities2;
                            connectionsManager.sendRequest(tL_payments_sendStarsForm, new RequestDelegate() {
                                @Override
                                public final void run(final TLObject tLObject6, final TLRPC.TL_error tL_error3) {
                                    final y8 y8Var3 = y8.this;
                                    final r10 r10Var4 = r10Var3;
                                    final Context context5 = context4;
                                    final org.telegram.ui.ActionBar.h6 h6Var3 = h6Var2;
                                    final long j13 = j11;
                                    final String str4 = str3;
                                    final long j14 = j12;
                                    final TLObject tLObject7 = tLObject5;
                                    final TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_textWithEntities3;
                                    org.telegram.messenger.g0.g3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            org.telegram.ui.Components.lc Y;
                                            u80 u80Var;
                                            String str5;
                                            y8 y8Var4 = y8.this;
                                            TLObject tLObject8 = tLObject6;
                                            TLRPC.TL_error tL_error4 = tL_error3;
                                            r10 r10Var5 = r10Var4;
                                            Context context6 = context5;
                                            org.telegram.ui.ActionBar.h6 h6Var4 = h6Var3;
                                            long j15 = j13;
                                            String str6 = str4;
                                            long j16 = j14;
                                            TLObject tLObject9 = tLObject7;
                                            TLRPC.TL_textWithEntities tL_textWithEntities5 = tL_textWithEntities4;
                                            org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                                            if (Q != null && Q.visibleDialog == null) {
                                                Y = org.telegram.ui.Components.lc.b0(Q);
                                            } else {
                                                Y = org.telegram.ui.Components.lc.Y();
                                            }
                                            if (!(tLObject8 instanceof TLRPC.TL_payments_paymentResult)) {
                                                if (tL_error4 != null && "BALANCE_TOO_LOW".equals(tL_error4.text)) {
                                                    if (np.u1(y8Var4.f10085a).f25906m7) {
                                                        r10Var5.a(Boolean.FALSE, null);
                                                        y8.c0(context6, h6Var4);
                                                        return;
                                                    }
                                                    boolean[] zArr = {false};
                                                    fb fbVar = new fb(context6, h6Var4, j15, 6, str6, new a3(y8Var4, zArr, j16, tLObject9, tL_textWithEntities5, r10Var5), 0L);
                                                    fbVar.setOnDismissListener(new n7(1, r10Var5, zArr));
                                                    fbVar.show();
                                                    return;
                                                } else if (tL_error4 != null && "STARGIFT_USAGE_LIMITED".equals(tL_error4.text)) {
                                                    r10Var5.a(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                                                    return;
                                                } else {
                                                    r10Var5.a(Boolean.FALSE, null);
                                                    if (tL_error4 != null) {
                                                        str5 = tL_error4.text;
                                                    } else {
                                                        str5 = "FAILED_SEND_STARS";
                                                    }
                                                    Y.Q(2131624012, 36, hd.a0(null, null, 2131743633, str5)).j();
                                                    return;
                                                }
                                            }
                                            Utilities.d.c(new l7(y8Var4, (TLRPC.TL_payments_paymentResult) tLObject8, 3));
                                            y8Var4.R(true);
                                            r10Var5.a(Boolean.TRUE, null);
                                            org.telegram.messenger.t1 b10 = org.telegram.messenger.v1.a(y8Var4.f10085a).b();
                                            if (b10 != null && b10.a(j16)) {
                                                SharedPreferences.Editor edit = np.u1(y8Var4.f10085a).h7.edit();
                                                edit.putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j16, false).apply();
                                            }
                                            SharedPreferences.Editor edit2 = np.u1(y8Var4.f10085a).h7.edit();
                                            SharedPreferences.Editor putBoolean = edit2.putBoolean("show_gift_for_" + j16, true);
                                            putBoolean.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j16, true).apply();
                                            LaunchActivity launchActivity = LaunchActivity.H1;
                                            if (launchActivity != null && (u80Var = launchActivity.f43153w0) != null) {
                                                u80Var.c(true);
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

    public final void g0(final long j3, final long j10, boolean z10, final boolean z11) {
        TL_account.toggleNoPaidMessagesException togglenopaidmessagesexception = new TL_account.toggleNoPaidMessagesException();
        int i7 = this.f10085a;
        togglenopaidmessagesexception.user_id = np.u1(i7).q1(j3);
        if (j10 != 0) {
            togglenopaidmessagesexception.parent_peer = np.u1(i7).l1(j10);
        }
        togglenopaidmessagesexception.refund_charged = z10;
        togglenopaidmessagesexception.require_payment = !z11;
        ConnectionsManager.getInstance(i7).sendRequest(togglenopaidmessagesexception, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                org.telegram.messenger.g0.g3(new c8(y8.this, tLObject, j10, j3, z11));
            }
        });
    }

    public final void h(final TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, final TL_stars.StarGift starGift, final long j3, final TLRPC.TL_textWithEntities tL_textWithEntities, final boolean z10, final r10 r10Var) {
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = org.telegram.messenger.t0.f26931b;
        }
        final Context context2 = context;
        final org.telegram.ui.ActionBar.h6 I = I();
        if (starGift != null && context2 != null) {
            if (!this.f10088e) {
                r(new k(this, r10Var, tL_payments_paymentFormStarGift, starGift, j3, tL_textWithEntities, z10));
                return;
            }
            final String l10 = org.telegram.messenger.n5.l(this.f10085a, j3);
            TLRPC.TL_inputInvoiceStarGiftResale tL_inputInvoiceStarGiftResale = new TLRPC.TL_inputInvoiceStarGiftResale();
            tL_inputInvoiceStarGiftResale.slug = starGift.slug;
            tL_inputInvoiceStarGiftResale.to_id = np.u1(this.f10085a).l1(j3);
            tL_inputInvoiceStarGiftResale.ton = this.f10086b;
            tL_inputInvoiceStarGiftResale.message = tL_textWithEntities;
            tL_inputInvoiceStarGiftResale.show_name = !z10;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject u10 = ki.s2.u(I, false);
            if (u10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftResale;
            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
            tL_payments_sendStarsForm.form_id = tL_payments_paymentFormStarGift.form_id;
            tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftResale;
            ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStarGift.invoice.prices;
            int size = arrayList.size();
            long j10 = 0;
            for (int i7 = 0; i7 < size; i7++) {
                j10 += arrayList.get(i7).amount;
                context2 = context2;
            }
            final long j11 = j10;
            ConnectionsManager.getInstance(this.f10085a).sendRequest(tL_payments_sendStarsForm, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    final y8 y8Var = y8.this;
                    final r10 r10Var2 = r10Var;
                    final Context context3 = context2;
                    final org.telegram.ui.ActionBar.h6 h6Var = I;
                    final long j12 = j11;
                    final String str = l10;
                    final TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift2 = tL_payments_paymentFormStarGift;
                    final TL_stars.StarGift starGift2 = starGift;
                    final long j13 = j3;
                    final TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_textWithEntities;
                    final boolean z11 = z10;
                    org.telegram.messenger.g0.g3(new Runnable() {
                        @Override
                        public final void run() {
                            org.telegram.ui.Components.lc Y;
                            u80 u80Var;
                            String str2;
                            final y8 y8Var2 = y8.this;
                            TLObject tLObject2 = tLObject;
                            TLRPC.TL_error tL_error2 = tL_error;
                            final r10 r10Var3 = r10Var2;
                            Context context4 = context3;
                            org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
                            long j14 = j12;
                            String str3 = str;
                            final TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift3 = tL_payments_paymentFormStarGift2;
                            final TL_stars.StarGift starGift3 = starGift2;
                            final long j15 = j13;
                            final TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_textWithEntities2;
                            final boolean z12 = z11;
                            org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                            if (Q != null && Q.visibleDialog == null) {
                                Y = org.telegram.ui.Components.lc.b0(Q);
                            } else {
                                Y = org.telegram.ui.Components.lc.Y();
                            }
                            if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                                if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                                    if (np.u1(y8Var2.f10085a).f25906m7) {
                                        r10Var3.a(Boolean.FALSE, null);
                                        y8.c0(context4, h6Var2);
                                        return;
                                    }
                                    final boolean[] zArr = {false};
                                    fb fbVar = new fb(context4, h6Var2, j14, 6, str3, new Runnable() {
                                        @Override
                                        public final void run() {
                                            y8 y8Var3 = y8.this;
                                            y8Var3.getClass();
                                            zArr[0] = true;
                                            y8Var3.h(tL_payments_paymentFormStarGift3, starGift3, j15, tL_textWithEntities3, z12, r10Var3);
                                        }
                                    }, 0L);
                                    fbVar.setOnDismissListener(new n7(2, r10Var3, zArr));
                                    fbVar.show();
                                    return;
                                } else if (tL_error2 != null && "STARGIFT_USAGE_LIMITED".equals(tL_error2.text)) {
                                    r10Var3.a(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                                    return;
                                } else {
                                    r10Var3.a(Boolean.FALSE, null);
                                    if (tL_error2 != null) {
                                        str2 = tL_error2.text;
                                    } else {
                                        str2 = "FAILED_SEND_STARS";
                                    }
                                    Y.Q(2131624012, 36, hd.a0(null, null, 2131743633, str2)).j();
                                    return;
                                }
                            }
                            Utilities.d.c(new l7(y8Var2, (TLRPC.TL_payments_paymentResult) tLObject2, 4));
                            y8Var2.D = false;
                            y8Var2.E = true;
                            y8Var2.G = 0L;
                            y8Var2.T();
                            y8Var2.O(j15);
                            y8Var2.R(true);
                            r10Var3.a(Boolean.TRUE, null);
                            org.telegram.messenger.t1 b10 = org.telegram.messenger.v1.a(y8Var2.f10085a).b();
                            if (b10 != null && b10.a(j15)) {
                                SharedPreferences.Editor edit = np.u1(y8Var2.f10085a).h7.edit();
                                edit.putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j15, false).apply();
                            }
                            SharedPreferences.Editor edit2 = np.u1(y8Var2.f10085a).h7.edit();
                            SharedPreferences.Editor putBoolean = edit2.putBoolean("show_gift_for_" + j15, true);
                            putBoolean.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j15, true).apply();
                            LaunchActivity launchActivity = LaunchActivity.H1;
                            if (launchActivity != null && (u80Var = launchActivity.f43153w0) != null) {
                                u80Var.c(true);
                            }
                        }
                    });
                }
            });
        }
    }

    public final void h0(String str, TLRPC.ChatInvite chatInvite, r10 r10Var) {
        String str2;
        if (chatInvite != null && chatInvite.subscription_pricing != null) {
            Context context = LaunchActivity.H1;
            if (context == null) {
                context = org.telegram.messenger.t0.f26931b;
            }
            Context context2 = context;
            org.telegram.ui.ActionBar.h6 I = I();
            long j3 = chatInvite.subscription_pricing.amount;
            if (context2 != null) {
                int i7 = k10.f24968t0;
                boolean[] zArr = {false};
                i8 i8Var = new i8(this, j3, i7, zArr, r10Var, context2, I, chatInvite, str);
                f2 f2Var = new f2(this, zArr, r10Var);
                org.telegram.ui.ActionBar.w2 j10 = org.telegram.messenger.f3.j(1, context2, I, false);
                LinearLayout g10 = org.telegram.messenger.f3.g(context2, 1);
                g10.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
                FrameLayout frameLayout = new FrameLayout(context2);
                frameLayout.addView(new ua(context2, 40, 0, 0), c8.ma.c(-1.0f, -1));
                org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context2);
                q9Var.setRoundRadius(org.telegram.messenger.g0.L(80.0f));
                org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
                b9Var.s(chatInvite.color);
                String str3 = chatInvite.title;
                b9Var.A = true;
                b9Var.f33800n = 0;
                b9Var.f33799m = false;
                org.telegram.ui.Components.b9.a(str3, null, null, b9Var.f33803q);
                TLRPC.Photo photo = chatInvite.photo;
                if (photo != null) {
                    q9Var.j(org.telegram.messenger.gc.i(org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.g0.L(80.0f), false, null, false), chatInvite.photo), "80_80", b9Var, chatInvite);
                } else {
                    q9Var.setImageDrawable(b9Var);
                }
                frameLayout.addView(q9Var, c8.ma.e(80, 80, 17));
                Drawable drawable = context2.getResources().getDrawable(2131232755);
                int i10 = org.telegram.ui.ActionBar.m6.f29454h5;
                org.telegram.ui.ActionBar.t6.x(frameLayout, drawable, i10, I, PorterDuff.Mode.SRC_IN);
                Drawable drawable2 = context2.getResources().getDrawable(2131232754);
                ImageView imageView = new ImageView(context2);
                imageView.setImageDrawable(drawable);
                frameLayout.addView(imageView, c8.ma.e(26, 26, 17));
                imageView.setTranslationX(org.telegram.messenger.g0.L(26.0f));
                imageView.setTranslationY(org.telegram.messenger.g0.L(26.0f));
                imageView.setScaleX(1.2f);
                imageView.setScaleY(1.2f);
                ImageView imageView2 = new ImageView(context2);
                imageView2.setImageDrawable(drawable2);
                frameLayout.addView(imageView2, c8.ma.e(26, 26, 17));
                imageView2.setTranslationX(org.telegram.messenger.g0.L(26.0f));
                imageView2.setTranslationY(org.telegram.messenger.g0.L(26.0f));
                eb ebVar = new eb(i7, context2, I);
                c8.ra.a(ebVar);
                ebVar.setOnClickListener(new ja(ebVar, 0));
                frameLayout.addView(ebVar, c8.ma.d(-2, -2.0f, 53, 0.0f, 0.0f, -8.0f, 0.0f));
                g10.addView(frameLayout, c8.ma.r(-1, 117, 7));
                TextView textView = new TextView(context2);
                textView.setTextSize(1, 20.0f);
                textView.setTypeface(org.telegram.messenger.g0.o());
                int i11 = org.telegram.ui.ActionBar.m6.f29489j5;
                o10.r(textView, i11, I, null, 2131744769);
                textView.setGravity(17);
                TextView f10 = o10.f(g10, textView, c8.ma.t(-2, -2, 1, 0, 8, 0, 0), context2);
                f10.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.t6.U(f10, i11, I);
                TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                int i12 = tL_starsSubscriptionPricing.period;
                if (i12 == 2592000) {
                    f10.setText(org.telegram.messenger.g0.W2(hd.G((int) tL_starsSubscriptionPricing.amount, "StarsSubscribeText", chatInvite.title)));
                } else {
                    if (i12 == 300) {
                        str2 = "5 minutes";
                    } else {
                        str2 = "a minute";
                    }
                    f10.setText(org.telegram.messenger.g0.W2(hd.G((int) tL_starsSubscriptionPricing.amount, "StarsSubscribeTextTest", chatInvite.title, str2)));
                }
                f10.setMaxWidth(hi.l3.a(f10.getText(), f10.getPaint()));
                f10.setGravity(17);
                g10.addView(f10, c8.ma.t(-2, -2, 1, 0, 6, 0, 22));
                if (!TextUtils.isEmpty(chatInvite.about)) {
                    TextView textView2 = new TextView(context2);
                    textView2.setTextSize(1, 14.0f);
                    org.telegram.ui.ActionBar.t6.U(textView2, i11, I);
                    textView2.setText(org.telegram.messenger.j6.m(chatInvite.about, textView2.getPaint().getFontMetricsInt(), false, null, 0));
                    textView2.setGravity(17);
                    g10.addView(textView2, c8.ma.t(-2, -2, 1, 0, 6, 0, 22));
                }
                hi.e eVar = new hi.e(context2, I, true);
                eVar.i(hd.N0(2131744778, null), false, true);
                g10.addView(eVar, c8.ma.o(-1, 48));
                m80 m80Var = new m80(context2, I);
                m80Var.setText(org.telegram.messenger.g0.T2(hd.N0(2131744777, null), new ai.a(context2, 6)));
                m80Var.setGravity(17);
                m80Var.setTextSize(1, 13.0f);
                org.telegram.ui.ActionBar.t6.U(m80Var, org.telegram.ui.ActionBar.m6.B6, I);
                org.telegram.ui.ActionBar.t6.G(m80Var, org.telegram.ui.ActionBar.m6.Xc, I);
                g10.addView(m80Var, c8.ma.t(-1, -2, 49, 14, 14, 14, 6));
                j10.O = g10;
                eVar.setOnClickListener(new ah.h(i8Var, j10, eVar, 7));
                j10.setOnDismissListener(new u9(f2Var, 1));
                j10.Q(i10);
                org.telegram.ui.ActionBar.g2 T2 = LaunchActivity.T();
                if (!org.telegram.messenger.g0.Q1() && T2 != null && !org.telegram.messenger.g0.u1(T2)) {
                    j10.a0(T2);
                }
                j10.show();
            }
        }
    }

    public final void i(final TL_stars.StarGift starGift, final boolean z10, final boolean z11, final long j3, final TLRPC.TL_textWithEntities tL_textWithEntities, final bi.o8 o8Var) {
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = org.telegram.messenger.t0.f26931b;
        }
        final Context context2 = context;
        final org.telegram.ui.ActionBar.h6 I = I();
        if (starGift != null && context2 != null) {
            if (!this.f10088e) {
                r(new Runnable() {
                    @Override
                    public final void run() {
                        y8 y8Var = y8.this;
                        boolean z12 = y8Var.f10088e;
                        bi.o8 o8Var2 = o8Var;
                        if (!z12) {
                            y8.e("NO_BALANCE");
                            o8Var2.a(Boolean.FALSE, null);
                            return;
                        }
                        y8Var.i(starGift, z10, z11, j3, tL_textWithEntities, o8Var2);
                    }
                });
                return;
            }
            final String l10 = org.telegram.messenger.n5.l(this.f10085a, j3);
            final TLRPC.TL_inputInvoiceStarGift tL_inputInvoiceStarGift = new TLRPC.TL_inputInvoiceStarGift();
            tL_inputInvoiceStarGift.hide_name = z10;
            tL_inputInvoiceStarGift.peer = np.u1(this.f10085a).l1(j3);
            tL_inputInvoiceStarGift.gift_id = starGift.f28663id;
            tL_inputInvoiceStarGift.include_upgrade = z11;
            if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                tL_inputInvoiceStarGift.flags |= 2;
                tL_inputInvoiceStarGift.message = tL_textWithEntities;
            }
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject u10 = ki.s2.u(I, false);
            if (u10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGift;
            ConnectionsManager.getInstance(this.f10085a).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    final y8 y8Var = y8.this;
                    final bi.o8 o8Var2 = o8Var;
                    final TLRPC.TL_inputInvoiceStarGift tL_inputInvoiceStarGift2 = tL_inputInvoiceStarGift;
                    final Context context3 = context2;
                    final org.telegram.ui.ActionBar.h6 h6Var = I;
                    final String str = l10;
                    final TL_stars.StarGift starGift2 = starGift;
                    final boolean z12 = z10;
                    final boolean z13 = z11;
                    final long j10 = j3;
                    final TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_textWithEntities;
                    org.telegram.messenger.g0.g3(new Runnable() {
                        @Override
                        public final void run() {
                            String str2;
                            TLObject tLObject2 = tLObject;
                            boolean z14 = tLObject2 instanceof TLRPC.TL_payments_paymentFormStarGift;
                            final bi.o8 o8Var3 = o8Var2;
                            if (!z14) {
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    str2 = "NO_PAYMENT_FORM";
                                } else {
                                    str2 = tL_error2.text;
                                }
                                y8.e(str2);
                                o8Var3.a(Boolean.FALSE, null);
                                return;
                            }
                            TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) tLObject2;
                            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                            tL_payments_sendStarsForm.form_id = tL_payments_paymentFormStarGift.form_id;
                            tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGift2;
                            ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStarGift.invoice.prices;
                            int size = arrayList.size();
                            int i7 = 0;
                            final long j11 = 0;
                            while (i7 < size) {
                                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i7);
                                i7++;
                                j11 += tL_labeledPrice.amount;
                            }
                            final y8 y8Var2 = y8.this;
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(y8Var2.f10085a);
                            final Context context4 = context3;
                            final org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
                            final String str3 = str;
                            final TL_stars.StarGift starGift3 = starGift2;
                            final boolean z15 = z12;
                            final boolean z16 = z13;
                            final long j12 = j10;
                            final TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_textWithEntities2;
                            connectionsManager.sendRequest(tL_payments_sendStarsForm, new RequestDelegate() {
                                @Override
                                public final void run(final TLObject tLObject3, final TLRPC.TL_error tL_error3) {
                                    final y8 y8Var3 = y8.this;
                                    final bi.o8 o8Var4 = o8Var3;
                                    final Context context5 = context4;
                                    final org.telegram.ui.ActionBar.h6 h6Var3 = h6Var2;
                                    final long j13 = j11;
                                    final String str4 = str3;
                                    final TL_stars.StarGift starGift4 = starGift3;
                                    final boolean z17 = z15;
                                    final boolean z18 = z16;
                                    final long j14 = j12;
                                    final TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_textWithEntities3;
                                    org.telegram.messenger.g0.g3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            org.telegram.ui.Components.lc Y;
                                            String str5;
                                            SpannableStringBuilder spannableStringBuilder;
                                            u80 u80Var;
                                            ?? r52;
                                            String str6;
                                            y8 y8Var4 = y8.this;
                                            TLObject tLObject4 = tLObject3;
                                            TLRPC.TL_error tL_error4 = tL_error3;
                                            bi.o8 o8Var5 = o8Var4;
                                            Context context6 = context5;
                                            org.telegram.ui.ActionBar.h6 h6Var4 = h6Var3;
                                            long j15 = j13;
                                            String str7 = str4;
                                            TL_stars.StarGift starGift5 = starGift4;
                                            boolean z19 = z17;
                                            boolean z20 = z18;
                                            long j16 = j14;
                                            TLRPC.TL_textWithEntities tL_textWithEntities5 = tL_textWithEntities4;
                                            org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                                            if (Q != null && Q.visibleDialog == null) {
                                                Y = org.telegram.ui.Components.lc.b0(Q);
                                            } else {
                                                Y = org.telegram.ui.Components.lc.Y();
                                            }
                                            if (!(tLObject4 instanceof TLRPC.TL_payments_paymentResult)) {
                                                if (tL_error4 != null && "BALANCE_TOO_LOW".equals(tL_error4.text)) {
                                                    if (np.u1(y8Var4.f10085a).f25906m7) {
                                                        o8Var5.a(Boolean.FALSE, null);
                                                        y8.c0(context6, h6Var4);
                                                        return;
                                                    }
                                                    boolean[] zArr = {false};
                                                    fb fbVar = new fb(context6, h6Var4, j15, 6, str7, new r7(y8Var4, zArr, starGift5, z19, z20, j16, tL_textWithEntities5, o8Var5), 0L);
                                                    fbVar.setOnDismissListener(new u1(o8Var5, zArr, 2));
                                                    fbVar.show();
                                                    return;
                                                } else if (tL_error4 != null && "STARGIFT_USAGE_LIMITED".equals(tL_error4.text)) {
                                                    o8Var5.a(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                                                    return;
                                                } else if (tL_error4 != null && "STARGIFT_USER_USAGE_LIMITED".equals(tL_error4.text)) {
                                                    o8Var5.a(Boolean.FALSE, "STARGIFT_USER_USAGE_LIMITED");
                                                    return;
                                                } else {
                                                    o8Var5.a(Boolean.FALSE, null);
                                                    if (tL_error4 != null) {
                                                        str6 = tL_error4.text;
                                                    } else {
                                                        str6 = "FAILED_SEND_STARS";
                                                    }
                                                    Y.Q(2131624012, 36, hd.a0(null, null, 2131743633, str6)).j();
                                                    return;
                                                }
                                            }
                                            Utilities.d.c(new l7(y8Var4, (TLRPC.TL_payments_paymentResult) tLObject4, 2));
                                            y8Var4.D = false;
                                            y8Var4.E = true;
                                            y8Var4.G = 0L;
                                            y8Var4.T();
                                            y8Var4.O(j16);
                                            y8Var4.R(true);
                                            o8Var5.a(Boolean.TRUE, null);
                                            org.telegram.messenger.t1 b10 = org.telegram.messenger.v1.a(y8Var4.f10085a).b();
                                            if (b10 != null && b10.a(j16)) {
                                                np.u1(y8Var4.f10085a).h7.edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j16, false).apply();
                                            }
                                            if (starGift5 != null && starGift5.limited_per_user) {
                                                int i10 = starGift5.per_user_remains - 1;
                                                starGift5.per_user_remains = i10;
                                                str5 = str7;
                                                spannableStringBuilder = org.telegram.messenger.g0.W2(hd.H(',', "Gift2SentRemainsLimit", Math.max(0, i10)));
                                            } else {
                                                str5 = str7;
                                                spannableStringBuilder = null;
                                            }
                                            if (j16 < 0) {
                                                long j17 = -j16;
                                                TLRPC.ChatFull P0 = np.u1(y8Var4.f10085a).P0(j17);
                                                if (P0 != null) {
                                                    P0.stargifts_count++;
                                                    P0.flags2 |= 262144;
                                                    np.u1(y8Var4.f10085a).Y3(P0);
                                                }
                                                if (Q instanceof ProfileActivity) {
                                                    ProfileActivity profileActivity = (ProfileActivity) Q;
                                                    if (profileActivity.a() == j16) {
                                                        vv0 vv0Var = profileActivity.O;
                                                        if (vv0Var != null) {
                                                            vv0Var.P1(true);
                                                            profileActivity.O.k1(14);
                                                            r52 = 0;
                                                            profileActivity.X4(false);
                                                        } else {
                                                            r52 = 0;
                                                        }
                                                        org.telegram.ui.Components.lc b02 = org.telegram.ui.Components.lc.b0(Q);
                                                        TLRPC.Document document = starGift5.sticker;
                                                        String N0 = hd.N0(2131744866, null);
                                                        if (spannableStringBuilder == null) {
                                                            Object[] objArr = new Object[1];
                                                            objArr[r52] = str5;
                                                            spannableStringBuilder = org.telegram.messenger.g0.W2(hd.G((int) j15, "StarsGiftCompletedChannelText", objArr));
                                                        }
                                                        b02.s(document, N0, spannableStringBuilder).k(r52);
                                                    }
                                                }
                                                Bundle bundle = new Bundle();
                                                bundle.putLong("chat_id", j17);
                                                bundle.putBoolean("open_gifts", true);
                                                ProfileActivity profileActivity2 = new ProfileActivity(bundle, null);
                                                profileActivity2.whenFullyVisible(new bi.o2(profileActivity2, starGift5, spannableStringBuilder, j15, str5, 5));
                                                Q.presentFragment(profileActivity2);
                                            } else if ((Q instanceof bn) && ((bn) Q).a() == j16) {
                                                org.telegram.ui.Components.lc b03 = org.telegram.ui.Components.lc.b0(Q);
                                                TLRPC.Document document2 = starGift5.sticker;
                                                String N02 = hd.N0(2131744866, null);
                                                if (spannableStringBuilder == null) {
                                                    spannableStringBuilder = org.telegram.messenger.g0.W2(hd.G((int) j15, "StarsGiftCompletedText", new Object[0]));
                                                }
                                                b03.s(document2, N02, spannableStringBuilder).k(true);
                                            } else {
                                                ls f10 = ls.f(y8Var4.f10085a);
                                                int i11 = ls.v;
                                                Long valueOf = Long.valueOf(j16);
                                                Boolean bool = Boolean.FALSE;
                                                f10.k(i11, valueOf, bool);
                                                ls.f(y8Var4.f10085a).k(ls.f25391u, Long.valueOf(j16), bool);
                                                bn ua2 = bn.ua(j16);
                                                ua2.whenFullyVisible(new j2(ua2, starGift5, spannableStringBuilder, j15, 4));
                                                Q.presentFragment(ua2);
                                            }
                                            np.u1(y8Var4.f10085a).h7.edit().putBoolean("show_gift_for_" + j16, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j16, true).apply();
                                            LaunchActivity launchActivity = LaunchActivity.H1;
                                            if (launchActivity != null && (u80Var = launchActivity.f43153w0) != null) {
                                                u80Var.c(true);
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

    public final void i0(TL_stars.StarsAmount starsAmount) {
        boolean equals = this.f10089f.equals(starsAmount);
        int i7 = ls.A3;
        int i10 = this.f10085a;
        if (!equals) {
            this.f10089f = starsAmount;
            this.f10090g = 0L;
            ls.f(i10).k(i7, new Object[0]);
        } else if (this.f10090g != 0) {
            this.f10090g = 0L;
            ls.f(i10).k(i7, new Object[0]);
        }
    }

    public final boolean j() {
        if (this.f10086b) {
            org.telegram.messenger.t0.u();
            if (!org.telegram.messenger.s2.a()) {
                org.telegram.messenger.t0.r();
                TL_stars.StarsAmount p10 = p();
                if (p10.nanos == 0 && p10.amount == 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final void j0(final gj gjVar, final long j3, final Runnable runnable, final boolean z10) {
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia;
        if (gjVar == null) {
            runnable.run();
            return;
        }
        final long B0 = gj.B0(gjVar.f24213k);
        final int e12 = gjVar.e1();
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia2 = (TLRPC.TL_messageMediaPaidMedia) gjVar.f24213k.media;
        TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
        int i7 = this.f10085a;
        tL_messages_editMessage.peer = np.u1(i7).l1(B0);
        int i10 = tL_messages_editMessage.flags;
        tL_messages_editMessage.flags = 32768 | i10;
        tL_messages_editMessage.schedule_date = gjVar.f24213k.date;
        tL_messages_editMessage.f28518id = e12;
        tL_messages_editMessage.flags = i10 | 49152;
        TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia = new TLRPC.TL_inputMediaPaidMedia();
        tL_inputMediaPaidMedia.stars_amount = j3;
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
                tL_inputPhoto.f28453id = photo.f28458id;
                tL_inputPhoto.access_hash = photo.access_hash;
                tL_inputPhoto.file_reference = photo.file_reference;
                tL_inputMediaPhoto.f28497id = tL_inputPhoto;
                tL_inputMediaPaidMedia.extended_media.add(tL_inputMediaPhoto);
            } else {
                tL_messageMediaPaidMedia = tL_messageMediaPaidMedia2;
                if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument = new TLRPC.TL_inputMediaDocument();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) messageMedia).document;
                    tL_inputDocument.f28446id = document.f28440id;
                    tL_inputDocument.access_hash = document.access_hash;
                    tL_inputDocument.file_reference = document.file_reference;
                    tL_inputMediaDocument.f28495id = tL_inputDocument;
                    tL_inputMediaPaidMedia.extended_media.add(tL_inputMediaDocument);
                }
            }
            i11++;
            tL_messageMediaPaidMedia2 = tL_messageMediaPaidMedia;
        }
        tL_messages_editMessage.media = tL_inputMediaPaidMedia;
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_editMessage, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                org.telegram.messenger.g0.g3(new j8(y8.this, tLObject, runnable, tL_error, z10, B0, e12, gjVar, j3));
            }
        });
    }

    public final TL_stars.SavedStarGift n(long j3) {
        TL_stars.StarGift starGift;
        int i7 = 0;
        while (true) {
            LongSparseArray longSparseArray = this.L;
            if (i7 < longSparseArray.size()) {
                p8 p8Var = (p8) longSparseArray.valueAt(i7);
                for (int i10 = 0; i10 < p8Var.f9552l.size(); i10++) {
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) p8Var.f9552l.get(i10);
                    if (savedStarGift != null && (starGift = savedStarGift.gift) != null && starGift.f28663id == j3) {
                        return savedStarGift;
                    }
                }
                i7++;
            } else {
                return null;
            }
        }
    }

    public final TL_stars.StarsAmount p() {
        return q(null, true, false);
    }

    public final TL_stars.StarsAmount q(Runnable runnable, boolean z10, boolean z11) {
        if (((!this.f10088e || System.currentTimeMillis() - this.f10087c > 60000) && !this.d) || z11) {
            this.d = true;
            TL_stars.TL_payments_getStarsStatus tL_payments_getStarsStatus = new TL_stars.TL_payments_getStarsStatus();
            tL_payments_getStarsStatus.ton = this.f10086b;
            tL_payments_getStarsStatus.peer = new TLRPC.TL_inputPeerSelf();
            ConnectionsManager.getInstance(this.f10085a).sendRequest(tL_payments_getStarsStatus, new bi.o1(10, this, runnable));
        }
        if (z10 && this.f10090g > 0) {
            cg.a n10 = cg.a.n(this.f10089f);
            return cg.a.h(Math.max(0L, n10.a() - this.f10090g), n10.f5303a).q();
        }
        return this.f10089f;
    }

    public final void r(Runnable runnable) {
        q(runnable, true, false);
    }

    public final cg.a s() {
        cg.b bVar;
        cg.a m10 = cg.a.m(p());
        if (m10 == null) {
            if (this.f10086b) {
                bVar = cg.b.f5306b;
            } else {
                bVar = cg.b.f5305a;
            }
            return cg.a.j(0L, bVar);
        }
        return m10;
    }

    public final ArrayList u() {
        if (!this.f10093k && !this.f10094l) {
            this.f10093k = true;
            ConnectionsManager.getInstance(this.f10085a).sendRequest(new TL_stars.TL_payments_getStarsGiftOptions(), new s7(this, 3));
            return this.f10095m;
        }
        return this.f10095m;
    }

    public final ArrayList v() {
        if (!this.f10096n && !this.f10097o) {
            this.f10096n = true;
            ConnectionsManager.getInstance(this.f10085a).sendRequest(new TL_stars.TL_payments_getStarsGiveawayOptions(), new s7(this, 4));
            return this.f10098p;
        }
        return this.f10098p;
    }

    public final ArrayList z() {
        if (!this.h && !this.f10091i) {
            this.h = true;
            ConnectionsManager.getInstance(this.f10085a).sendRequest(new TL_stars.TL_payments_getStarsTopupOptions(), new s7(this, 2));
            return this.f10092j;
        }
        return this.f10092j;
    }
}
