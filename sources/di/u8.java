package di;

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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gj;
import org.telegram.messenger.h00;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.messenger.s10;
import org.telegram.messenger.vr;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.z70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.an;
import org.telegram.ui.r80;
import org.telegram.ui.uv0;
public final class u8 {
    public static volatile u8[][] S = (u8[][]) Array.newInstance(u8.class, 2, 4);
    public static final Object[][] T = (Object[][]) Array.newInstance(Object.class, 2, 4);
    public boolean A;
    public s8 B;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public long G;
    public p8 N;
    public final int f9529a;
    public final boolean f9530b;
    public long f9531c;
    public boolean d;
    public boolean f9532e;
    public long f9534g;
    public boolean h;
    public boolean f9535i;
    public ArrayList f9536j;
    public boolean f9537k;
    public boolean f9538l;
    public ArrayList f9539m;
    public boolean f9540n;
    public boolean f9541o;
    public ArrayList f9542p;
    public String f9548w;
    public boolean f9549x;
    public boolean f9550y;
    public TL_stars.StarsAmount f9533f = TL_stars.StarsAmount.ofStars(0);
    public final ArrayList[] f9543q = {new ArrayList(), new ArrayList(), new ArrayList()};
    public final boolean[] f9544r = new boolean[3];
    public final String[] f9545s = new String[3];
    public final boolean[] f9546t = new boolean[3];
    public final boolean[] f9547u = new boolean[3];
    public final ArrayList v = new ArrayList();
    public final ArrayList f9551z = new ArrayList();
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

    public u8(int i7, boolean z10) {
        this.f9529a = i7;
        this.f9530b = z10;
    }

    public static org.telegram.ui.ActionBar.e6 I() {
        org.telegram.ui.ActionBar.e2 T2 = LaunchActivity.T();
        if (T2 != null) {
            return T2.getResourceProvider();
        }
        return null;
    }

    public static u8 L(int i7) {
        return y(i7, true);
    }

    public static boolean T(int i7, cg.a aVar) {
        if (aVar == null || x(i7, aVar.f4988a).s().f4989b >= aVar.f4989b) {
            return true;
        }
        return false;
    }

    public static void a(u8 u8Var, TL_stars.StarGifts starGifts) {
        ArrayList arrayList = u8Var.I;
        ArrayList arrayList2 = u8Var.J;
        int i7 = u8Var.f9529a;
        ArrayList arrayList3 = u8Var.H;
        u8Var.C = false;
        u8Var.D = true;
        if (starGifts instanceof TL_stars.TL_starGifts) {
            TL_stars.TL_starGifts tL_starGifts = (TL_stars.TL_starGifts) starGifts;
            np.s1(i7).Y3(tL_starGifts.users, false);
            np.s1(i7).S3(tL_starGifts.chats, false);
            vr.a0(i7).m1(tL_starGifts.users, tL_starGifts.chats, true, true);
            arrayList3.clear();
            arrayList3.addAll(tL_starGifts.gifts);
            arrayList2.clear();
            arrayList2.addAll(arrayList3);
            Collections.sort(arrayList2, Comparator$EL.thenComparingInt(Comparator$CC.comparingInt(new bg.d(4)), new bg.d(5)));
            arrayList.clear();
            arrayList.addAll(arrayList3);
            Collections.sort(arrayList, Comparator$CC.comparingInt(new bg.d(6)));
            u8Var.F = tL_starGifts.hash;
            u8Var.G = System.currentTimeMillis();
            ns.f(i7).k(ns.F3, new Object[0]);
            ArrayList<TL_stars.StarGift> arrayList4 = tL_starGifts.gifts;
            int i10 = u8Var.F;
            long j3 = u8Var.G;
            vr a02 = vr.a0(i7);
            a02.f27219a.c(new w7(i10, 0, j3, a02, arrayList4));
        } else if (starGifts instanceof TL_stars.TL_starGiftsNotModified) {
            int i11 = u8Var.F;
            long currentTimeMillis = System.currentTimeMillis();
            u8Var.G = currentTimeMillis;
            vr a03 = vr.a0(i7);
            a03.f27219a.c(new w7(i11, 0, currentTimeMillis, a03, arrayList3));
        }
    }

    public static void b(u8 u8Var, ArrayList arrayList, Integer num, Long l10, ArrayList arrayList2, ArrayList arrayList3) {
        int i7 = u8Var.f9529a;
        np.s1(i7).Y3(arrayList2, true);
        np.s1(i7).S3(arrayList3, true);
        u8Var.E = true;
        ArrayList arrayList4 = u8Var.H;
        arrayList4.clear();
        arrayList4.addAll(arrayList);
        ArrayList arrayList5 = u8Var.J;
        arrayList5.clear();
        arrayList5.addAll(arrayList4);
        Collections.sort(arrayList5, Comparator$EL.thenComparingInt(Comparator$CC.comparingInt(new bg.d(1)), new bg.d(2)));
        ArrayList arrayList6 = u8Var.I;
        arrayList6.clear();
        arrayList6.addAll(arrayList4);
        Collections.sort(arrayList6, Comparator$CC.comparingInt(new bg.d(3)));
        u8Var.F = num.intValue();
        u8Var.G = l10.longValue();
        u8Var.C = false;
        ns.f(i7).k(ns.F3, new Object[0]);
        u8Var.U();
    }

    public static void c0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
        String M0 = hd.M0(2131745060, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
        t1Var.S = M0;
        t1Var.U = hd.M0(2131745061, null);
        i5.c.C(null, 2131747831, alertDialog$Builder, null);
    }

    public static void e(String str) {
        org.telegram.ui.Components.cc X;
        org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
        if (Q != null && Q.visibleDialog == null) {
            X = org.telegram.ui.Components.cc.a0(Q);
        } else {
            X = org.telegram.ui.Components.cc.X();
        }
        X.Q(2131624012, 36, hd.a0(null, null, 2131743878, str)).j();
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
            return tL_messages_forwardMessages.allow_paid_stars / tL_messages_forwardMessages.f28139id.size();
        } else if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
            return ((TLRPC.TL_messages_sendMedia) tLObject).allow_paid_stars;
        } else {
            return 0L;
        }
    }

    public static Context t(org.telegram.ui.ActionBar.e2 e2Var) {
        if (e2Var != null && e2Var.getContext() != null) {
            return e2Var.getContext();
        }
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null && !launchActivity.isFinishing()) {
            return LaunchActivity.H1;
        }
        if (org.telegram.messenger.t0.f26609b != null) {
            return org.telegram.messenger.t0.f26609b;
        }
        return null;
    }

    public static u8 w(int i7) {
        return y(i7, false);
    }

    public static u8 x(int i7, cg.b bVar) {
        boolean z10;
        if (bVar == cg.b.f4991b) {
            z10 = true;
        } else {
            z10 = false;
        }
        return y(i7, z10);
    }

    public static u8 y(int i7, boolean z10) {
        u8 u8Var;
        u8 u8Var2 = S[z10 ? 1 : 0][i7];
        if (u8Var2 == null) {
            synchronized (T[z10 ? 1 : 0][i7]) {
                try {
                    u8Var = S[z10 ? 1 : 0][i7];
                    if (u8Var == null) {
                        u8[] u8VarArr = S[z10 ? 1 : 0];
                        u8 u8Var3 = new u8(i7, z10);
                        u8VarArr[i7] = u8Var3;
                        u8Var = u8Var3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return u8Var;
        }
        return u8Var2;
    }

    public final long A(n8 n8Var, TLRPC.TL_messageReactions tL_messageReactions) {
        ArrayList<TLRPC.MessageReactor> arrayList;
        Long l10;
        s8 s8Var = this.B;
        if (s8Var != null && s8Var.f9389a.equals(n8Var) && (l10 = this.B.f9400n) != null) {
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
                        l11 = Long.valueOf(org.telegram.messenger.m5.o(peer));
                        break;
                    }
                }
            }
        }
        if (l11 != null) {
            return l11.longValue();
        }
        Long y12 = np.s1(this.f9529a).y1();
        if (y12 != null) {
            return y12.longValue();
        }
        return 0L;
    }

    public final long B(gj gjVar) {
        Long z12;
        Long l10;
        s8 s8Var = this.B;
        if (s8Var != null && s8Var.f9389a.equals(n8.b(gjVar)) && (l10 = this.B.f9400n) != null) {
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
        Long y12 = np.s1(this.f9529a).y1();
        if (y12 != null) {
            return y12.longValue();
        }
        return 0L;
    }

    public final void C(long j3, long j10, z10 z10Var) {
        TL_account.getPaidMessagesRevenue getpaidmessagesrevenue = new TL_account.getPaidMessagesRevenue();
        int i7 = this.f9529a;
        getpaidmessagesrevenue.user_id = np.s1(i7).o1(j3);
        if (j10 != 0) {
            getpaidmessagesrevenue.parent_peer = np.s1(i7).j1(j10);
        }
        ConnectionsManager.getInstance(i7).sendRequest(getpaidmessagesrevenue, new v7(z10Var, 0));
    }

    public final long D(int i7, long j3) {
        s8 s8Var = this.B;
        if (s8Var != null) {
            n8 n8Var = s8Var.f9389a;
            if (n8Var.f9113a == j3 && n8Var.f9114b == i7 && s8Var.f9398l) {
                return s8Var.h;
            }
            return 0L;
        }
        return 0L;
    }

    public final long E(gj gjVar) {
        TLRPC.Message message;
        if (gjVar != null && (message = gjVar.f23819k) != null) {
            if ((message.isThreadMessage || gjVar.k3()) && gjVar.f23819k.fwd_from != null) {
                return D(gjVar.f23819k.fwd_from.saved_from_msg_id, gjVar.Z0());
            }
            return D(gjVar.e1(), gj.B0(gjVar.f23819k));
        }
        return 0L;
    }

    public final j8 F(long j3, boolean z10) {
        LongSparseArray longSparseArray = this.K;
        j8 j8Var = (j8) longSparseArray.get(j3);
        if (j8Var == null && z10) {
            j8 j8Var2 = new j8(this.f9529a, j3);
            longSparseArray.put(j3, j8Var2);
            return j8Var2;
        }
        return j8Var;
    }

    public final l8 G(long j3, boolean z10) {
        LongSparseArray longSparseArray = this.L;
        l8 l8Var = (l8) longSparseArray.get(j3);
        if (l8Var == null && z10) {
            l8 l8Var2 = new l8(this.f9529a, j3, true);
            longSparseArray.put(j3, l8Var2);
            return l8Var2;
        }
        return l8Var;
    }

    public final void H(TL_stars.StarGift starGift, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, z10 z10Var) {
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = org.telegram.messenger.t0.f26609b;
        }
        org.telegram.ui.ActionBar.e6 I = I();
        if (starGift != null && context != null) {
            if (!this.f9532e) {
                r(new f2(this, z10Var, starGift, j3));
                return;
            }
            TLRPC.TL_inputInvoiceStarGiftResale tL_inputInvoiceStarGiftResale = new TLRPC.TL_inputInvoiceStarGiftResale();
            tL_inputInvoiceStarGiftResale.slug = starGift.slug;
            tL_inputInvoiceStarGiftResale.to_id = np.s1(this.f9529a).j1(j3);
            tL_inputInvoiceStarGiftResale.ton = this.f9530b;
            tL_inputInvoiceStarGiftResale.message = tL_textWithEntities;
            tL_inputInvoiceStarGiftResale.show_name = !z10;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject u10 = ki.x2.u(I, false);
            if (u10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftResale;
            ConnectionsManager.getInstance(this.f9529a).sendRequest(tL_payments_getPaymentForm, new bi.v2(8, this, z10Var));
        }
    }

    public final TL_stars.StarGift J(long j3) {
        U();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i7 < arrayList.size()) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList.get(i7);
                if (starGift.f28280id == j3) {
                    return starGift;
                }
                i7++;
            } else {
                return null;
            }
        }
    }

    public final void K(long j3, z10 z10Var) {
        TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) this.M.get(Long.valueOf(j3));
        if (stargiftupgradepreview != null) {
            z10Var.a(stargiftupgradepreview);
            return;
        }
        TL_stars.getStarGiftUpgradePreview getstargiftupgradepreview = new TL_stars.getStarGiftUpgradePreview();
        getstargiftupgradepreview.gift_id = j3;
        ConnectionsManager.getInstance(this.f9529a).sendRequest(getstargiftupgradepreview, new o2(this, j3, z10Var, 1));
    }

    public final void M(TL_stars.InputSavedStarGift inputSavedStarGift, z10 z10Var) {
        org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, org.telegram.messenger.t0.f26609b, null);
        t1Var.r(200L);
        TL_stars.getSavedStarGift getsavedstargift = new TL_stars.getSavedStarGift();
        getsavedstargift.stargift.add(inputSavedStarGift);
        ConnectionsManager.getInstance(this.f9529a).sendRequest(getsavedstargift, new bi.l1(this, t1Var, inputSavedStarGift, z10Var, 4));
    }

    public final boolean N(int i7) {
        if (this.f9532e && !this.f9543q[i7].isEmpty()) {
            return true;
        }
        return false;
    }

    public final void O() {
        this.f9532e = false;
        p();
        this.f9532e = true;
    }

    public final void P(long j3) {
        l8 G = G(j3, false);
        if (G != null) {
            G.j(false);
        }
        j8 j8Var = (j8) this.K.get(j3);
        if (j8Var != null) {
            j8Var.g();
        }
    }

    public final void Q(TLRPC.UserFull userFull) {
        if (userFull != null) {
            long j3 = userFull.f28201id;
            l8 G = G(j3, false);
            if (G != null && G.f9003n != userFull.stargifts_count) {
                G.j(false);
            }
            j8 j8Var = (j8) this.K.get(j3);
            if (j8Var != null) {
                j8Var.g();
            }
        }
    }

    public final void R() {
        if (this.f9549x) {
            return;
        }
        this.v.clear();
        this.f9548w = null;
        this.f9549x = false;
        this.f9550y = false;
        V();
    }

    public final void S(boolean z10) {
        for (int i7 = 0; i7 < 3; i7++) {
            boolean[] zArr = this.f9546t;
            if (!zArr[i7]) {
                this.f9543q[i7].clear();
                this.f9545s[i7] = null;
                zArr[i7] = false;
                this.f9547u[i7] = false;
                if (z10) {
                    W(i7);
                }
            }
        }
    }

    public final void U() {
        if (!this.C) {
            if (!this.D || System.currentTimeMillis() - this.G >= 60000) {
                this.C = true;
                boolean z10 = this.E;
                int i7 = this.f9529a;
                if (!z10) {
                    a1.c cVar = new a1.c(this, 27);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    vr a02 = vr.a0(i7);
                    a02.f27219a.c(new ai.b(a02, arrayList3, arrayList2, arrayList, cVar, 5));
                    return;
                }
                int i10 = this.F;
                ai.g0 g0Var = new ai.g0(this, 11);
                TL_stars.getStarGifts getstargifts = new TL_stars.getStarGifts();
                getstargifts.hash = i10;
                ConnectionsManager.getInstance(i7).sendRequest(getstargifts, new ai.e1(g0Var, 3));
            }
        }
    }

    public final void V() {
        if (!this.f9530b && !this.f9549x && !this.f9550y) {
            this.f9549x = true;
            TL_stars.TL_getStarsSubscriptions tL_getStarsSubscriptions = new TL_stars.TL_getStarsSubscriptions();
            tL_getStarsSubscriptions.peer = new TLRPC.TL_inputPeerSelf();
            String str = this.f9548w;
            tL_getStarsSubscriptions.offset = str;
            if (str == null) {
                tL_getStarsSubscriptions.offset = "";
            }
            ConnectionsManager.getInstance(this.f9529a).sendRequest(tL_getStarsSubscriptions, new p7(this, 1));
        }
    }

    public final void W(int i7) {
        boolean z10;
        boolean[] zArr = this.f9546t;
        if (!zArr[i7] && !this.f9547u[i7]) {
            boolean z11 = true;
            zArr[i7] = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
            tL_payments_getStarsTransactions.ton = this.f9530b;
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
            String str = this.f9545s[i7];
            tL_payments_getStarsTransactions.offset = str;
            if (str == null) {
                tL_payments_getStarsTransactions.offset = "";
            }
            ConnectionsManager.getInstance(this.f9529a).sendRequest(tL_payments_getStarsTransactions, new u1(this, i7, 1));
        }
    }

    public final void X(org.telegram.messenger.gj r39, org.telegram.tgnet.TLRPC.InputInvoice r40, org.telegram.tgnet.TLRPC.TL_payments_paymentFormStars r41, java.lang.Runnable r42, org.telegram.messenger.z10 r43) {
        throw new UnsupportedOperationException("Method not decompiled: di.u8.X(org.telegram.messenger.gj, org.telegram.tgnet.TLRPC$InputInvoice, org.telegram.tgnet.TLRPC$TL_payments_paymentFormStars, java.lang.Runnable, org.telegram.messenger.z10):void");
    }

    public final void Y(String str, TLRPC.ChatInvite chatInvite, s10 s10Var) {
        if (chatInvite != null && chatInvite.subscription_pricing != null) {
            Context context = org.telegram.messenger.t0.f26609b;
            org.telegram.ui.ActionBar.e6 I = I();
            if (context != null) {
                long j3 = chatInvite.subscription_pricing.amount;
                String str2 = chatInvite.title;
                TLRPC.TL_inputInvoiceChatInviteSubscription tL_inputInvoiceChatInviteSubscription = new TLRPC.TL_inputInvoiceChatInviteSubscription();
                tL_inputInvoiceChatInviteSubscription.hash = str;
                TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                tL_payments_sendStarsForm.form_id = chatInvite.subscription_form_id;
                tL_payments_sendStarsForm.invoice = tL_inputInvoiceChatInviteSubscription;
                ConnectionsManager.getInstance(this.f9529a).sendRequest(tL_payments_sendStarsForm, new p6(this, s10Var, j3, str2, context, I, chatInvite, str));
            }
        }
    }

    public final void Z(final gj gjVar, final TLRPC.InputInvoice inputInvoice, final TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, final z10 z10Var) {
        long j3;
        String str;
        TLRPC.User a22;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        if (tL_payments_paymentFormStars != null) {
            final Context context = org.telegram.messenger.t0.f26609b;
            final org.telegram.ui.ActionBar.e6 I = I();
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
                TLRPC.Message message = gjVar.f23819k;
                if (message != null && (messageFwdHeader = message.fwd_from) != null && (peer = messageFwdHeader.from_id) != null) {
                    j3 = org.telegram.messenger.m5.o(peer);
                } else {
                    j3 = gj.B0(message);
                }
                if (j3 < 0 && gjVar.Z0() > 0 && (a22 = np.s1(this.f9529a).a2(Long.valueOf(gjVar.Z0()))) != null && a22.bot) {
                    j3 = a22.f28200id;
                }
            } else {
                j3 = tL_payments_paymentFormStars.bot_id;
            }
            final long j11 = j3;
            if (j11 >= 0) {
                str = q10.p(np.s1(this.f9529a).a2(Long.valueOf(j11)));
            } else {
                TLRPC.Chat M0 = np.s1(this.f9529a).M0(Long.valueOf(-j11));
                if (M0 == null) {
                    str = "";
                } else {
                    str = M0.title;
                }
            }
            final String str2 = str;
            final String str3 = tL_payments_paymentFormStars.title;
            final int i10 = tL_payments_paymentFormStars.invoice.subscription_period;
            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
            tL_payments_sendStarsForm.form_id = tL_payments_paymentFormStars.form_id;
            tL_payments_sendStarsForm.invoice = inputInvoice;
            ConnectionsManager.getInstance(this.f9529a).sendRequest(tL_payments_sendStarsForm, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    final u8 u8Var = u8.this;
                    final z10 z10Var2 = z10Var;
                    final gj gjVar2 = gjVar;
                    final Context context2 = context;
                    final long j12 = j10;
                    final String str4 = str2;
                    final int i11 = i10;
                    final String str5 = str3;
                    final TLRPC.InputInvoice inputInvoice2 = inputInvoice;
                    final long j13 = j11;
                    final org.telegram.ui.ActionBar.e6 e6Var = I;
                    final TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars2 = tL_payments_paymentFormStars;
                    org.telegram.messenger.g0.h3(new Runnable() {
                        @Override
                        public final void run() {
                            throw new UnsupportedOperationException("Method not decompiled: di.c7.run():void");
                        }
                    });
                }
            });
        }
    }

    public final void a0(long j3, long j10, boolean z10) {
        int i7 = this.f9529a;
        h00 h00Var = np.s1(i7).f25386r7;
        TLRPC.TL_forumTopic f10 = h00Var.f(j3, j10);
        if (f10 != null) {
            f10.nopaid_messages_exception = z10;
            a0.h hVar = h00Var.f24011a;
            if (((ArrayList) hVar.f(j3)) != null) {
                h00Var.getMessagesStorage().C1(h00Var.getConnectionsManager().getCurrentTime(), -j3, (List) hVar.f(j3), true);
            }
            ns.f(i7).k(ns.N3, Long.valueOf(j10));
        }
    }

    public final di.s8 b0(final org.telegram.messenger.gj r21, final org.telegram.ui.an r22, final long r23, boolean r25, boolean r26, final java.lang.Long r27) {
        throw new UnsupportedOperationException("Method not decompiled: di.u8.b0(org.telegram.messenger.gj, org.telegram.ui.an, long, boolean, boolean, java.lang.Long):di.s8");
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
                this.R.put(Integer.valueOf(e12), new aa.r(this, hashSet, runnable, 25));
                z10 = true;
            }
        }
        return !z10;
    }

    public final void d(org.telegram.messenger.gj r15) {
        throw new UnsupportedOperationException("Method not decompiled: di.u8.d(org.telegram.messenger.gj):void");
    }

    public final void d0(List list) {
        if (list != null && !list.isEmpty()) {
            gj gjVar = (gj) list.get(0);
            long B0 = gj.B0(gjVar.f23819k);
            int i7 = (B0 > 0L ? 1 : (B0 == 0L ? 0 : -1));
            int i10 = this.f9529a;
            if (i7 >= 0) {
                np.s1(i10).W2(np.s1(i10).a2(Long.valueOf(B0)), 0, true, null);
            } else {
                np.s1(i10).V2(0, -B0, true);
            }
            org.telegram.ui.Components.cc.a0(LaunchActivity.T()).Q(2131624012, 36, lb.T0(TextUtils.concat(hd.G((int) gjVar.f23819k.errorAllowedPriceStars, "PaidMessagesSendErrorToast1", new Object[0]), " ", hd.G((int) gjVar.f23819k.errorNewPriceStars, "PaidMessagesSendErrorToast2", new Object[0])))).j();
        }
    }

    public final void e0(LaunchActivity launchActivity, long j3, String str) {
        if (!this.f9532e) {
            r(new f2(this, (Object) launchActivity, j3, (Object) str, 6));
        } else {
            f0(launchActivity, j3, str);
        }
    }

    public final void f(Activity activity, TL_stars.TL_starsTopupOption tL_starsTopupOption, s10 s10Var, TLRPC.InputPeer inputPeer) {
        boolean z10;
        if (activity == null) {
            return;
        }
        int i7 = this.f9529a;
        if (np.s1(i7).f25325k7) {
            org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
            if (Q != null && Q.getContext() != null) {
                c0(Q.getContext(), Q.getResourceProvider());
                return;
            } else {
                c0(activity, null);
                return;
            }
        }
        if (((org.telegram.messenger.h0) np.s1(i7).f25451y7.f25850h0.f14544b).f24009c && inputPeer != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((org.telegram.messenger.r2.b() || !org.telegram.messenger.r1.i().k()) && !z10) {
            TLRPC.TL_inputStorePaymentStarsTopup tL_inputStorePaymentStarsTopup = new TLRPC.TL_inputStorePaymentStarsTopup();
            tL_inputStorePaymentStarsTopup.stars = tL_starsTopupOption.stars;
            tL_inputStorePaymentStarsTopup.amount = tL_starsTopupOption.amount;
            tL_inputStorePaymentStarsTopup.currency = tL_starsTopupOption.currency;
            tL_inputStorePaymentStarsTopup.spend_purpose_peer = inputPeer;
            TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
            tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsTopup;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject u10 = ki.x2.u(I(), false);
            if (u10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
            ConnectionsManager.getInstance(i7).sendRequest(tL_payments_getPaymentForm, new bi.j6(this, s10Var, tL_inputInvoiceStars, 3));
        } else if (!org.telegram.messenger.r1.i().k()) {
            s10Var.a(Boolean.FALSE, "INVOICE DISABLED");
        } else {
            TLRPC.TL_inputStorePaymentStarsTopup tL_inputStorePaymentStarsTopup2 = new TLRPC.TL_inputStorePaymentStarsTopup();
            tL_inputStorePaymentStarsTopup2.stars = tL_starsTopupOption.stars;
            tL_inputStorePaymentStarsTopup2.currency = tL_starsTopupOption.currency;
            tL_inputStorePaymentStarsTopup2.amount = tL_starsTopupOption.amount;
            f5.a aVar = new f5.a();
            aVar.f10926c = "inapp";
            aVar.f10925b = tL_starsTopupOption.store_product;
            f5.p a10 = aVar.a();
            org.telegram.messenger.a8.b("StarsController.buy starts queryProductDetails");
            org.telegram.messenger.r1.i().o(Arrays.asList(a10), new a1.d(s10Var, tL_inputStorePaymentStarsTopup2, tL_starsTopupOption, activity, 2));
        }
    }

    public final void f0(LaunchActivity launchActivity, long j3, String str) {
        if (p().amount < j3 && j3 > 0) {
            new bb(launchActivity, null, j3, 4, str, new ai.o(10), 0L).show();
            return;
        }
        org.telegram.ui.ActionBar.e2 T2 = LaunchActivity.T();
        if (T2 == null) {
            return;
        }
        org.telegram.ui.Components.xb K = org.telegram.ui.Components.cc.a0(T2).K(2131624227, hd.M0(2131744964, null), hd.M0(2131744963, null), new ai.o(9));
        K.f41635j = 5000;
        K.k(true);
    }

    public final void g(final long j3, final TLObject tLObject, final TLRPC.TL_textWithEntities tL_textWithEntities, final s10 s10Var) {
        int i7;
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = org.telegram.messenger.t0.f26609b;
        }
        final Context context2 = context;
        final org.telegram.ui.ActionBar.e6 I = I();
        boolean z10 = tLObject instanceof TLRPC.TL_premiumGiftOption;
        if ((z10 || (tLObject instanceof TLRPC.TL_premiumGiftCodeOption)) && context2 != null) {
            if (!this.f9532e) {
                r(new bi.r1(this, s10Var, j3, tLObject, tL_textWithEntities, 4));
                return;
            }
            if (z10) {
                i7 = ((TLRPC.TL_premiumGiftOption) tLObject).months;
            } else if (tLObject instanceof TLRPC.TL_premiumGiftCodeOption) {
                i7 = ((TLRPC.TL_premiumGiftCodeOption) tLObject).months;
            } else {
                return;
            }
            final String l10 = org.telegram.messenger.m5.l(this.f9529a, j3);
            final TLRPC.TL_inputInvoicePremiumGiftStars tL_inputInvoicePremiumGiftStars = new TLRPC.TL_inputInvoicePremiumGiftStars();
            tL_inputInvoicePremiumGiftStars.user_id = np.s1(this.f9529a).o1(j3);
            tL_inputInvoicePremiumGiftStars.months = i7;
            if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                tL_inputInvoicePremiumGiftStars.flags |= 1;
                tL_inputInvoicePremiumGiftStars.message = tL_textWithEntities;
            }
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject u10 = ki.x2.u(I, false);
            if (u10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoicePremiumGiftStars;
            ConnectionsManager.getInstance(this.f9529a).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                    final u8 u8Var = u8.this;
                    final s10 s10Var2 = s10Var;
                    final TLRPC.TL_inputInvoicePremiumGiftStars tL_inputInvoicePremiumGiftStars2 = tL_inputInvoicePremiumGiftStars;
                    final Context context3 = context2;
                    final org.telegram.ui.ActionBar.e6 e6Var = I;
                    final String str = l10;
                    final long j10 = j3;
                    final TLObject tLObject3 = tLObject;
                    final TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_textWithEntities;
                    org.telegram.messenger.g0.h3(new Runnable() {
                        @Override
                        public final void run() {
                            String str2;
                            TLObject tLObject4 = tLObject2;
                            boolean z11 = tLObject4 instanceof TLRPC.TL_payments_paymentFormStars;
                            s10 s10Var3 = s10Var2;
                            if (!z11) {
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    str2 = "NO_PAYMENT_FORM";
                                } else {
                                    str2 = tL_error2.text;
                                }
                                u8.e(str2);
                                s10Var3.a(Boolean.FALSE, null);
                                return;
                            }
                            TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = (TLRPC.TL_payments_paymentFormStars) tLObject4;
                            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                            tL_payments_sendStarsForm.form_id = tL_payments_paymentFormStars.form_id;
                            tL_payments_sendStarsForm.invoice = tL_inputInvoicePremiumGiftStars2;
                            ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStars.invoice.prices;
                            int size = arrayList.size();
                            int i10 = 0;
                            long j11 = 0;
                            while (i10 < size) {
                                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i10);
                                i10++;
                                j11 += tL_labeledPrice.amount;
                            }
                            u8 u8Var2 = u8.this;
                            ConnectionsManager.getInstance(u8Var2.f9529a).sendRequest(tL_payments_sendStarsForm, new h7(u8Var2, s10Var3, context3, e6Var, j11, str, j10, tLObject3, tL_textWithEntities2));
                        }
                    });
                }
            });
        }
    }

    public final void g0(final long j3, final long j10, boolean z10, final boolean z11) {
        TL_account.toggleNoPaidMessagesException togglenopaidmessagesexception = new TL_account.toggleNoPaidMessagesException();
        int i7 = this.f9529a;
        togglenopaidmessagesexception.user_id = np.s1(i7).o1(j3);
        if (j10 != 0) {
            togglenopaidmessagesexception.parent_peer = np.s1(i7).j1(j10);
        }
        togglenopaidmessagesexception.refund_charged = z10;
        togglenopaidmessagesexception.require_payment = !z11;
        ConnectionsManager.getInstance(i7).sendRequest(togglenopaidmessagesexception, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                org.telegram.messenger.g0.h3(new y7(u8.this, tLObject, j10, j3, z11));
            }
        });
    }

    public final void h(TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, s10 s10Var) {
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = org.telegram.messenger.t0.f26609b;
        }
        Context context2 = context;
        org.telegram.ui.ActionBar.e6 I = I();
        if (starGift != null && context2 != null) {
            if (!this.f9532e) {
                r(new bi.r1(this, s10Var, tL_payments_paymentFormStarGift, starGift, j3, 5));
                return;
            }
            String l10 = org.telegram.messenger.m5.l(this.f9529a, j3);
            TLRPC.TL_inputInvoiceStarGiftResale tL_inputInvoiceStarGiftResale = new TLRPC.TL_inputInvoiceStarGiftResale();
            tL_inputInvoiceStarGiftResale.slug = starGift.slug;
            tL_inputInvoiceStarGiftResale.to_id = np.s1(this.f9529a).j1(j3);
            tL_inputInvoiceStarGiftResale.ton = this.f9530b;
            tL_inputInvoiceStarGiftResale.message = tL_textWithEntities;
            tL_inputInvoiceStarGiftResale.show_name = !z10;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            int i7 = 0;
            JSONObject u10 = ki.x2.u(I, false);
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
            while (i7 < size) {
                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i7);
                i7++;
                j10 += tL_labeledPrice.amount;
                size = size;
                context2 = context2;
            }
            ConnectionsManager.getInstance(this.f9529a).sendRequest(tL_payments_sendStarsForm, new h7(this, s10Var, context2, I, j10, l10, tL_payments_paymentFormStarGift, starGift, j3));
        }
    }

    public final void h0(String str, TLRPC.ChatInvite chatInvite, s10 s10Var) {
        String str2;
        if (chatInvite != null && chatInvite.subscription_pricing != null) {
            Context context = LaunchActivity.H1;
            if (context == null) {
                context = org.telegram.messenger.t0.f26609b;
            }
            Context context2 = context;
            org.telegram.ui.ActionBar.e6 I = I();
            long j3 = chatInvite.subscription_pricing.amount;
            if (context2 != null) {
                int i7 = m10.f24940t0;
                boolean[] zArr = {false};
                e8 e8Var = new e8(this, j3, i7, zArr, s10Var, context2, I, chatInvite, str);
                s2 s2Var = new s2(this, zArr, s10Var);
                org.telegram.ui.ActionBar.u2 k10 = org.telegram.messenger.k5.k(1, context2, I, false);
                LinearLayout f10 = org.telegram.messenger.k5.f(context2, 1);
                f10.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
                FrameLayout frameLayout = new FrameLayout(context2);
                frameLayout.addView(new qa(context2, 40, 0, 0), c8.ja.c(-1.0f, -1));
                org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context2);
                i9Var.setRoundRadius(org.telegram.messenger.g0.L(80.0f));
                org.telegram.ui.Components.t8 t8Var = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
                t8Var.s(chatInvite.color);
                String str3 = chatInvite.title;
                t8Var.A = true;
                t8Var.f39596n = 0;
                t8Var.f39595m = false;
                org.telegram.ui.Components.t8.a(str3, null, null, t8Var.f39599q);
                TLRPC.Photo photo = chatInvite.photo;
                if (photo != null) {
                    i9Var.j(org.telegram.messenger.gc.i(org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.g0.L(80.0f), false, null, false), chatInvite.photo), "80_80", t8Var, chatInvite);
                } else {
                    i9Var.setImageDrawable(t8Var);
                }
                frameLayout.addView(i9Var, c8.ja.e(80, 80, 17));
                Drawable drawable = context2.getResources().getDrawable(2131232754);
                int i10 = org.telegram.ui.ActionBar.j6.f28922h5;
                org.telegram.ui.ActionBar.q6.x(frameLayout, drawable, i10, I, PorterDuff.Mode.SRC_IN);
                Drawable drawable2 = context2.getResources().getDrawable(2131232753);
                ImageView imageView = new ImageView(context2);
                imageView.setImageDrawable(drawable);
                frameLayout.addView(imageView, c8.ja.e(26, 26, 17));
                imageView.setTranslationX(org.telegram.messenger.g0.L(26.0f));
                imageView.setTranslationY(org.telegram.messenger.g0.L(26.0f));
                imageView.setScaleX(1.2f);
                imageView.setScaleY(1.2f);
                ImageView imageView2 = new ImageView(context2);
                imageView2.setImageDrawable(drawable2);
                frameLayout.addView(imageView2, c8.ja.e(26, 26, 17));
                imageView2.setTranslationX(org.telegram.messenger.g0.L(26.0f));
                imageView2.setTranslationY(org.telegram.messenger.g0.L(26.0f));
                ab abVar = new ab(i7, context2, I);
                c8.na.a(abVar);
                abVar.setOnClickListener(new fa(abVar, 0));
                frameLayout.addView(abVar, c8.ja.d(-2, -2.0f, 53, 0.0f, 0.0f, -8.0f, 0.0f));
                f10.addView(frameLayout, c8.ja.r(-1, 117, 7));
                TextView g10 = org.telegram.messenger.k5.g(context2, 1, 20.0f);
                g10.setTypeface(org.telegram.messenger.g0.o());
                int i11 = org.telegram.ui.ActionBar.j6.f28957j5;
                i20.q(g10, i11, I, null, 2131745012);
                g10.setGravity(17);
                TextView f11 = i20.f(f10, g10, c8.ja.t(-2, -2, 1, 0, 8, 0, 0), context2);
                f11.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.q6.U(f11, i11, I);
                TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                int i12 = tL_starsSubscriptionPricing.period;
                if (i12 == 2592000) {
                    f11.setText(org.telegram.messenger.g0.X2(hd.G((int) tL_starsSubscriptionPricing.amount, "StarsSubscribeText", chatInvite.title)));
                } else {
                    if (i12 == 300) {
                        str2 = "5 minutes";
                    } else {
                        str2 = "a minute";
                    }
                    f11.setText(org.telegram.messenger.g0.X2(hd.G((int) tL_starsSubscriptionPricing.amount, "StarsSubscribeTextTest", chatInvite.title, str2)));
                }
                f11.setMaxWidth(hi.l3.a(f11.getText(), f11.getPaint()));
                f11.setGravity(17);
                f10.addView(f11, c8.ja.t(-2, -2, 1, 0, 6, 0, 22));
                if (!TextUtils.isEmpty(chatInvite.about)) {
                    TextView textView = new TextView(context2);
                    textView.setTextSize(1, 14.0f);
                    org.telegram.ui.ActionBar.q6.U(textView, i11, I);
                    textView.setText(org.telegram.messenger.j6.m(chatInvite.about, textView.getPaint().getFontMetricsInt(), false, null, 0));
                    textView.setGravity(17);
                    f10.addView(textView, c8.ja.t(-2, -2, 1, 0, 6, 0, 22));
                }
                hi.d dVar = new hi.d(context2, I, true);
                dVar.i(hd.M0(2131745021, null), false, true);
                f10.addView(dVar, c8.ja.o(-1, 48));
                z70 z70Var = new z70(context2, I);
                z70Var.setText(org.telegram.messenger.g0.U2(hd.M0(2131745020, null), new ai.a(context2, 6)));
                z70Var.setGravity(17);
                z70Var.setTextSize(1, 13.0f);
                org.telegram.ui.ActionBar.q6.U(z70Var, org.telegram.ui.ActionBar.j6.B6, I);
                org.telegram.ui.ActionBar.q6.G(z70Var, org.telegram.ui.ActionBar.j6.Xc, I);
                f10.addView(z70Var, c8.ja.t(-1, -2, 49, 14, 14, 14, 6));
                k10.O = f10;
                dVar.setOnClickListener(new ah.g(e8Var, k10, dVar, 7));
                k10.setOnDismissListener(new q9(s2Var, 1));
                k10.Q(i10);
                org.telegram.ui.ActionBar.e2 T2 = LaunchActivity.T();
                if (!org.telegram.messenger.g0.Q1() && T2 != null && !org.telegram.messenger.g0.u1(T2)) {
                    k10.a0(T2);
                }
                k10.show();
            }
        }
    }

    public final void i(final TL_stars.StarGift starGift, final boolean z10, final boolean z11, final long j3, final TLRPC.TL_textWithEntities tL_textWithEntities, final bi.f6 f6Var) {
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = org.telegram.messenger.t0.f26609b;
        }
        final Context context2 = context;
        final org.telegram.ui.ActionBar.e6 I = I();
        if (starGift != null && context2 != null) {
            if (!this.f9532e) {
                r(new Runnable() {
                    @Override
                    public final void run() {
                        u8 u8Var = u8.this;
                        boolean z12 = u8Var.f9532e;
                        bi.f6 f6Var2 = f6Var;
                        if (!z12) {
                            u8.e("NO_BALANCE");
                            f6Var2.a(Boolean.FALSE, null);
                            return;
                        }
                        u8Var.i(starGift, z10, z11, j3, tL_textWithEntities, f6Var2);
                    }
                });
                return;
            }
            final String l10 = org.telegram.messenger.m5.l(this.f9529a, j3);
            final TLRPC.TL_inputInvoiceStarGift tL_inputInvoiceStarGift = new TLRPC.TL_inputInvoiceStarGift();
            tL_inputInvoiceStarGift.hide_name = z10;
            tL_inputInvoiceStarGift.peer = np.s1(this.f9529a).j1(j3);
            tL_inputInvoiceStarGift.gift_id = starGift.f28280id;
            tL_inputInvoiceStarGift.include_upgrade = z11;
            if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                tL_inputInvoiceStarGift.flags |= 2;
                tL_inputInvoiceStarGift.message = tL_textWithEntities;
            }
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject u10 = ki.x2.u(I, false);
            if (u10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGift;
            ConnectionsManager.getInstance(this.f9529a).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    final u8 u8Var = u8.this;
                    final bi.f6 f6Var2 = f6Var;
                    final TLRPC.TL_inputInvoiceStarGift tL_inputInvoiceStarGift2 = tL_inputInvoiceStarGift;
                    final Context context3 = context2;
                    final org.telegram.ui.ActionBar.e6 e6Var = I;
                    final String str = l10;
                    final TL_stars.StarGift starGift2 = starGift;
                    final boolean z12 = z10;
                    final boolean z13 = z11;
                    final long j10 = j3;
                    final TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_textWithEntities;
                    org.telegram.messenger.g0.h3(new Runnable() {
                        @Override
                        public final void run() {
                            String str2;
                            TLObject tLObject2 = tLObject;
                            boolean z14 = tLObject2 instanceof TLRPC.TL_payments_paymentFormStarGift;
                            final bi.f6 f6Var3 = f6Var2;
                            if (!z14) {
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    str2 = "NO_PAYMENT_FORM";
                                } else {
                                    str2 = tL_error2.text;
                                }
                                u8.e(str2);
                                f6Var3.a(Boolean.FALSE, null);
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
                            final u8 u8Var2 = u8.this;
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(u8Var2.f9529a);
                            final Context context4 = context3;
                            final org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                            final String str3 = str;
                            final TL_stars.StarGift starGift3 = starGift2;
                            final boolean z15 = z12;
                            final boolean z16 = z13;
                            final long j12 = j10;
                            final TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_textWithEntities2;
                            connectionsManager.sendRequest(tL_payments_sendStarsForm, new RequestDelegate() {
                                @Override
                                public final void run(final TLObject tLObject3, final TLRPC.TL_error tL_error3) {
                                    final u8 u8Var3 = u8.this;
                                    final bi.f6 f6Var4 = f6Var3;
                                    final Context context5 = context4;
                                    final org.telegram.ui.ActionBar.e6 e6Var3 = e6Var2;
                                    final long j13 = j11;
                                    final String str4 = str3;
                                    final TL_stars.StarGift starGift4 = starGift3;
                                    final boolean z17 = z15;
                                    final boolean z18 = z16;
                                    final long j14 = j12;
                                    final TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_textWithEntities3;
                                    org.telegram.messenger.g0.h3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            org.telegram.ui.Components.cc X;
                                            String str5;
                                            SpannableStringBuilder spannableStringBuilder;
                                            r80 r80Var;
                                            ?? r11;
                                            String str6;
                                            u8 u8Var4 = u8.this;
                                            TLObject tLObject4 = tLObject3;
                                            TLRPC.TL_error tL_error4 = tL_error3;
                                            bi.f6 f6Var5 = f6Var4;
                                            Context context6 = context5;
                                            org.telegram.ui.ActionBar.e6 e6Var4 = e6Var3;
                                            long j15 = j13;
                                            String str7 = str4;
                                            TL_stars.StarGift starGift5 = starGift4;
                                            boolean z19 = z17;
                                            boolean z20 = z18;
                                            long j16 = j14;
                                            TLRPC.TL_textWithEntities tL_textWithEntities5 = tL_textWithEntities4;
                                            org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
                                            if (Q != null && Q.visibleDialog == null) {
                                                X = org.telegram.ui.Components.cc.a0(Q);
                                            } else {
                                                X = org.telegram.ui.Components.cc.X();
                                            }
                                            if (!(tLObject4 instanceof TLRPC.TL_payments_paymentResult)) {
                                                if (tL_error4 != null && "BALANCE_TOO_LOW".equals(tL_error4.text)) {
                                                    if (np.s1(u8Var4.f9529a).f25325k7) {
                                                        f6Var5.a(Boolean.FALSE, null);
                                                        u8.c0(context6, e6Var4);
                                                        return;
                                                    }
                                                    boolean[] zArr = {false};
                                                    bb bbVar = new bb(context6, e6Var4, j15, 6, str7, new o7(u8Var4, zArr, starGift5, z19, z20, j16, tL_textWithEntities5, f6Var5), 0L);
                                                    bbVar.setOnDismissListener(new a3(f6Var5, zArr, 1));
                                                    bbVar.show();
                                                    return;
                                                } else if (tL_error4 != null && "STARGIFT_USAGE_LIMITED".equals(tL_error4.text)) {
                                                    f6Var5.a(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                                                    return;
                                                } else if (tL_error4 != null && "STARGIFT_USER_USAGE_LIMITED".equals(tL_error4.text)) {
                                                    f6Var5.a(Boolean.FALSE, "STARGIFT_USER_USAGE_LIMITED");
                                                    return;
                                                } else {
                                                    f6Var5.a(Boolean.FALSE, null);
                                                    if (tL_error4 != null) {
                                                        str6 = tL_error4.text;
                                                    } else {
                                                        str6 = "FAILED_SEND_STARS";
                                                    }
                                                    X.Q(2131624012, 36, hd.a0(null, null, 2131743878, str6)).j();
                                                    return;
                                                }
                                            }
                                            Utilities.d.c(new i7(u8Var4, (TLRPC.TL_payments_paymentResult) tLObject4, 2));
                                            u8Var4.D = false;
                                            u8Var4.E = true;
                                            u8Var4.G = 0L;
                                            u8Var4.U();
                                            u8Var4.P(j16);
                                            u8Var4.S(true);
                                            f6Var5.a(Boolean.TRUE, null);
                                            org.telegram.messenger.t1 b10 = org.telegram.messenger.v1.a(u8Var4.f9529a).b();
                                            if (b10 != null && b10.a(j16)) {
                                                np.s1(u8Var4.f9529a).f25283f7.edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j16, false).apply();
                                            }
                                            if (starGift5 != null && starGift5.limited_per_user) {
                                                int i10 = starGift5.per_user_remains - 1;
                                                starGift5.per_user_remains = i10;
                                                spannableStringBuilder = org.telegram.messenger.g0.X2(hd.H(',', "Gift2SentRemainsLimit", Math.max(0, i10)));
                                                str5 = str7;
                                            } else {
                                                str5 = str7;
                                                spannableStringBuilder = null;
                                            }
                                            if (j16 < 0) {
                                                long j17 = -j16;
                                                TLRPC.ChatFull N0 = np.s1(u8Var4.f9529a).N0(j17);
                                                if (N0 != null) {
                                                    N0.stargifts_count++;
                                                    N0.flags2 |= 262144;
                                                    np.s1(u8Var4.f9529a).R3(N0);
                                                }
                                                if (Q instanceof ProfileActivity) {
                                                    ProfileActivity profileActivity = (ProfileActivity) Q;
                                                    if (profileActivity.a() == j16) {
                                                        uv0 uv0Var = profileActivity.O;
                                                        if (uv0Var != null) {
                                                            uv0Var.P1(true);
                                                            profileActivity.O.k1(14);
                                                            r11 = 0;
                                                            profileActivity.W4(false);
                                                        } else {
                                                            r11 = 0;
                                                        }
                                                        org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(Q);
                                                        TLRPC.Document document = starGift5.sticker;
                                                        String M0 = hd.M0(2131745109, null);
                                                        if (spannableStringBuilder == null) {
                                                            Object[] objArr = new Object[1];
                                                            objArr[r11] = str5;
                                                            spannableStringBuilder = org.telegram.messenger.g0.X2(hd.G((int) j15, "StarsGiftCompletedChannelText", objArr));
                                                        }
                                                        a02.s(document, M0, spannableStringBuilder).k(r11);
                                                    }
                                                }
                                                Bundle bundle = new Bundle();
                                                bundle.putLong("chat_id", j17);
                                                bundle.putBoolean("open_gifts", true);
                                                ProfileActivity profileActivity2 = new ProfileActivity(bundle, null);
                                                profileActivity2.whenFullyVisible(new bi.r1(profileActivity2, starGift5, spannableStringBuilder, j15, str5, 6));
                                                Q.presentFragment(profileActivity2);
                                            } else if ((Q instanceof an) && ((an) Q).a() == j16) {
                                                org.telegram.ui.Components.cc a03 = org.telegram.ui.Components.cc.a0(Q);
                                                TLRPC.Document document2 = starGift5.sticker;
                                                String M02 = hd.M0(2131745109, null);
                                                if (spannableStringBuilder == null) {
                                                    spannableStringBuilder = org.telegram.messenger.g0.X2(hd.G((int) j15, "StarsGiftCompletedText", new Object[0]));
                                                }
                                                a03.s(document2, M02, spannableStringBuilder).k(true);
                                            } else {
                                                ns f10 = ns.f(u8Var4.f9529a);
                                                int i11 = ns.v;
                                                Long valueOf = Long.valueOf(j16);
                                                Boolean bool = Boolean.FALSE;
                                                f10.k(i11, valueOf, bool);
                                                ns.f(u8Var4.f9529a).k(ns.f25580u, Long.valueOf(j16), bool);
                                                an ua2 = an.ua(j16);
                                                ua2.whenFullyVisible(new f2(ua2, starGift5, spannableStringBuilder, j15, 5));
                                                Q.presentFragment(ua2);
                                            }
                                            np.s1(u8Var4.f9529a).f25283f7.edit().putBoolean("show_gift_for_" + j16, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j16, true).apply();
                                            LaunchActivity launchActivity = LaunchActivity.H1;
                                            if (launchActivity != null && (r80Var = launchActivity.f42663w0) != null) {
                                                r80Var.c(true);
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
        boolean equals = this.f9533f.equals(starsAmount);
        int i7 = ns.f25611y3;
        int i10 = this.f9529a;
        if (!equals) {
            this.f9533f = starsAmount;
            this.f9534g = 0L;
            ns.f(i10).k(i7, new Object[0]);
        } else if (this.f9534g != 0) {
            this.f9534g = 0L;
            ns.f(i10).k(i7, new Object[0]);
        }
    }

    public final boolean j() {
        if (this.f9530b) {
            org.telegram.messenger.t0.u();
            if (!org.telegram.messenger.r2.a()) {
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
        final long B0 = gj.B0(gjVar.f23819k);
        final int e12 = gjVar.e1();
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia2 = (TLRPC.TL_messageMediaPaidMedia) gjVar.f23819k.media;
        TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
        int i7 = this.f9529a;
        tL_messages_editMessage.peer = np.s1(i7).j1(B0);
        int i10 = tL_messages_editMessage.flags;
        tL_messages_editMessage.flags = 32768 | i10;
        tL_messages_editMessage.schedule_date = gjVar.f23819k.date;
        tL_messages_editMessage.f28135id = e12;
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
                tL_inputPhoto.f28070id = photo.f28075id;
                tL_inputPhoto.access_hash = photo.access_hash;
                tL_inputPhoto.file_reference = photo.file_reference;
                tL_inputMediaPhoto.f28114id = tL_inputPhoto;
                tL_inputMediaPaidMedia.extended_media.add(tL_inputMediaPhoto);
            } else {
                tL_messageMediaPaidMedia = tL_messageMediaPaidMedia2;
                if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument = new TLRPC.TL_inputMediaDocument();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) messageMedia).document;
                    tL_inputDocument.f28063id = document.f28057id;
                    tL_inputDocument.access_hash = document.access_hash;
                    tL_inputDocument.file_reference = document.file_reference;
                    tL_inputMediaDocument.f28112id = tL_inputDocument;
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
                org.telegram.messenger.g0.h3(new f8(u8.this, tLObject, runnable, tL_error, z10, B0, e12, gjVar, j3));
            }
        });
    }

    public final TL_stars.SavedStarGift n(long j3) {
        TL_stars.StarGift starGift;
        int i7 = 0;
        while (true) {
            LongSparseArray longSparseArray = this.L;
            if (i7 < longSparseArray.size()) {
                l8 l8Var = (l8) longSparseArray.valueAt(i7);
                for (int i10 = 0; i10 < l8Var.f9001l.size(); i10++) {
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) l8Var.f9001l.get(i10);
                    if (savedStarGift != null && (starGift = savedStarGift.gift) != null && starGift.f28280id == j3) {
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
        if (((!this.f9532e || System.currentTimeMillis() - this.f9531c > 60000) && !this.d) || z11) {
            this.d = true;
            TL_stars.TL_payments_getStarsStatus tL_payments_getStarsStatus = new TL_stars.TL_payments_getStarsStatus();
            tL_payments_getStarsStatus.ton = this.f9530b;
            tL_payments_getStarsStatus.peer = new TLRPC.TL_inputPeerSelf();
            ConnectionsManager.getInstance(this.f9529a).sendRequest(tL_payments_getStarsStatus, new bi.v2(9, this, runnable));
        }
        if (z10 && this.f9534g > 0) {
            cg.a m10 = cg.a.m(this.f9533f);
            return cg.a.g(Math.max(0L, m10.a() - this.f9534g), m10.f4988a).o();
        }
        return this.f9533f;
    }

    public final void r(Runnable runnable) {
        q(runnable, true, false);
    }

    public final cg.a s() {
        cg.b bVar;
        cg.a l10 = cg.a.l(p());
        if (l10 == null) {
            if (this.f9530b) {
                bVar = cg.b.f4991b;
            } else {
                bVar = cg.b.f4990a;
            }
            return cg.a.i(0L, bVar);
        }
        return l10;
    }

    public final ArrayList u() {
        if (!this.f9537k && !this.f9538l) {
            this.f9537k = true;
            ConnectionsManager.getInstance(this.f9529a).sendRequest(new TL_stars.TL_payments_getStarsGiftOptions(), new p7(this, 3));
            return this.f9539m;
        }
        return this.f9539m;
    }

    public final ArrayList v() {
        if (!this.f9540n && !this.f9541o) {
            this.f9540n = true;
            ConnectionsManager.getInstance(this.f9529a).sendRequest(new TL_stars.TL_payments_getStarsGiveawayOptions(), new p7(this, 4));
            return this.f9542p;
        }
        return this.f9542p;
    }

    public final ArrayList z() {
        if (!this.h && !this.f9535i) {
            this.h = true;
            ConnectionsManager.getInstance(this.f9529a).sendRequest(new TL_stars.TL_payments_getStarsTopupOptions(), new p7(this, 2));
            return this.f9536j;
        }
        return this.f9536j;
    }
}
