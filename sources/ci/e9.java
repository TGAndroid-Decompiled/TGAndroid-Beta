package ci;

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
import b8.mf;
import b8.pf;
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
import org.telegram.messenger.bd;
import org.telegram.messenger.c00;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.messenger.n10;
import org.telegram.messenger.qr;
import org.telegram.messenger.u10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.s70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.mv0;
import org.telegram.ui.p80;
import org.telegram.ui.wm;
public final class e9 {
    public static volatile e9[][] S = (e9[][]) Array.newInstance(e9.class, 2, 4);
    public static final Object[][] T = (Object[][]) Array.newInstance(Object.class, 2, 4);
    public boolean A;
    public c9 B;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public long G;
    public z8 N;
    public final int f5029a;
    public final boolean f5030b;
    public long f5031c;
    public boolean d;
    public boolean f5032e;
    public long f5034g;
    public boolean h;
    public boolean f5035i;
    public ArrayList f5036j;
    public boolean f5037k;
    public boolean f5038l;
    public ArrayList f5039m;
    public boolean f5040n;
    public boolean f5041o;
    public ArrayList f5042p;
    public String f5048w;
    public boolean f5049x;
    public boolean f5050y;
    public TL_stars.StarsAmount f5033f = TL_stars.StarsAmount.ofStars(0);
    public final ArrayList[] f5043q = {new ArrayList(), new ArrayList(), new ArrayList()};
    public final boolean[] f5044r = new boolean[3];
    public final String[] f5045s = new String[3];
    public final boolean[] f5046t = new boolean[3];
    public final boolean[] f5047u = new boolean[3];
    public final ArrayList v = new ArrayList();
    public final ArrayList f5051z = new ArrayList();
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
        for (int i3 = 0; i3 < 2; i3++) {
            for (int i10 = 0; i10 < 4; i10++) {
                T[i3][i10] = new Object();
            }
        }
    }

    public e9(int i3, boolean z10) {
        this.f5029a = i3;
        this.f5030b = z10;
    }

    public static org.telegram.ui.ActionBar.e6 I() {
        org.telegram.ui.ActionBar.d2 T2 = LaunchActivity.T();
        if (T2 != null) {
            return T2.getResourceProvider();
        }
        return null;
    }

    public static e9 L(int i3) {
        return y(i3, true);
    }

    public static boolean T(int i3, dg.a aVar) {
        if (aVar == null || x(i3, aVar.f8923a).s().f8924b >= aVar.f8924b) {
            return true;
        }
        return false;
    }

    public static void a(e9 e9Var, TL_stars.StarGifts starGifts) {
        ArrayList arrayList = e9Var.I;
        ArrayList arrayList2 = e9Var.J;
        int i3 = e9Var.f5029a;
        ArrayList arrayList3 = e9Var.H;
        e9Var.C = false;
        e9Var.D = true;
        if (starGifts instanceof TL_stars.TL_starGifts) {
            TL_stars.TL_starGifts tL_starGifts = (TL_stars.TL_starGifts) starGifts;
            hp.s1(i3).Y3(tL_starGifts.users, false);
            hp.s1(i3).S3(tL_starGifts.chats, false);
            qr.a0(i3).m1(tL_starGifts.users, tL_starGifts.chats, true, true);
            arrayList3.clear();
            arrayList3.addAll(tL_starGifts.gifts);
            arrayList2.clear();
            arrayList2.addAll(arrayList3);
            Collections.sort(arrayList2, Comparator$EL.thenComparingInt(Comparator$CC.comparingInt(new cg.d(4)), new cg.d(5)));
            arrayList.clear();
            arrayList.addAll(arrayList3);
            Collections.sort(arrayList, Comparator$CC.comparingInt(new cg.d(6)));
            e9Var.F = tL_starGifts.hash;
            e9Var.G = System.currentTimeMillis();
            hs.f(i3).k(hs.F3, new Object[0]);
            ArrayList<TL_stars.StarGift> arrayList4 = tL_starGifts.gifts;
            int i10 = e9Var.F;
            long j10 = e9Var.G;
            qr a02 = qr.a0(i3);
            a02.f24934a.c(new f8(i10, 0, j10, a02, arrayList4));
        } else if (starGifts instanceof TL_stars.TL_starGiftsNotModified) {
            int i11 = e9Var.F;
            long currentTimeMillis = System.currentTimeMillis();
            e9Var.G = currentTimeMillis;
            qr a03 = qr.a0(i3);
            a03.f24934a.c(new f8(i11, 0, currentTimeMillis, a03, arrayList3));
        }
    }

    public static void b(e9 e9Var, ArrayList arrayList, Integer num, Long l10, ArrayList arrayList2, ArrayList arrayList3) {
        int i3 = e9Var.f5029a;
        hp.s1(i3).Y3(arrayList2, true);
        hp.s1(i3).S3(arrayList3, true);
        e9Var.E = true;
        ArrayList arrayList4 = e9Var.H;
        arrayList4.clear();
        arrayList4.addAll(arrayList);
        ArrayList arrayList5 = e9Var.J;
        arrayList5.clear();
        arrayList5.addAll(arrayList4);
        Collections.sort(arrayList5, Comparator$EL.thenComparingInt(Comparator$CC.comparingInt(new cg.d(1)), new cg.d(2)));
        ArrayList arrayList6 = e9Var.I;
        arrayList6.clear();
        arrayList6.addAll(arrayList4);
        Collections.sort(arrayList6, Comparator$CC.comparingInt(new cg.d(3)));
        e9Var.F = num.intValue();
        e9Var.G = l10.longValue();
        e9Var.C = false;
        hs.f(i3).k(hs.F3, new Object[0]);
        e9Var.U();
    }

    public static void c0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
        String M0 = bd.M0(2131745070, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.S = M0;
        s1Var.U = bd.M0(2131745071, null);
        k2.p1.B(null, 2131747839, alertDialog$Builder, null);
    }

    public static void e(String str) {
        org.telegram.ui.Components.fc X;
        org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
        if (Q != null && Q.visibleDialog == null) {
            X = org.telegram.ui.Components.fc.a0(Q);
        } else {
            X = org.telegram.ui.Components.fc.X();
        }
        X.Q(2131624011, 36, bd.a0(null, null, 2131743888, str)).j();
    }

    public static boolean k(TL_stars.SavedStarGift savedStarGift, TL_stars.SavedStarGift savedStarGift2) {
        int i3 = savedStarGift.flags;
        if ((i3 & 2048) == 0 || (savedStarGift2.flags & 2048) == 0 || savedStarGift.saved_id != savedStarGift2.saved_id) {
            if ((i3 & 8) != 0 && (savedStarGift2.flags & 8) != 0 && savedStarGift.msg_id == savedStarGift2.msg_id) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static TL_stars.StarGiftAttribute l(ArrayList arrayList, Class cls) {
        if (arrayList != null) {
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
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
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
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
            return tL_messages_forwardMessages.allow_paid_stars / tL_messages_forwardMessages.f27089id.size();
        } else if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
            return ((TLRPC.TL_messages_sendMedia) tLObject).allow_paid_stars;
        } else {
            return 0L;
        }
    }

    public static Context t(org.telegram.ui.ActionBar.d2 d2Var) {
        if (d2Var != null && d2Var.getContext() != null) {
            return d2Var.getContext();
        }
        LaunchActivity launchActivity = LaunchActivity.K1;
        if (launchActivity != null && !launchActivity.isFinishing()) {
            return LaunchActivity.K1;
        }
        if (org.telegram.messenger.t0.f25457b != null) {
            return org.telegram.messenger.t0.f25457b;
        }
        return null;
    }

    public static e9 w(int i3) {
        return y(i3, false);
    }

    public static e9 x(int i3, dg.b bVar) {
        boolean z10;
        if (bVar == dg.b.f8926b) {
            z10 = true;
        } else {
            z10 = false;
        }
        return y(i3, z10);
    }

    public static e9 y(int i3, boolean z10) {
        e9 e9Var;
        e9 e9Var2 = S[z10 ? 1 : 0][i3];
        if (e9Var2 == null) {
            synchronized (T[z10 ? 1 : 0][i3]) {
                try {
                    e9Var = S[z10 ? 1 : 0][i3];
                    if (e9Var == null) {
                        e9[] e9VarArr = S[z10 ? 1 : 0];
                        e9 e9Var3 = new e9(i3, z10);
                        e9VarArr[i3] = e9Var3;
                        e9Var = e9Var3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return e9Var;
        }
        return e9Var2;
    }

    public final long A(x8 x8Var, TLRPC.TL_messageReactions tL_messageReactions) {
        ArrayList<TLRPC.MessageReactor> arrayList;
        Long l10;
        c9 c9Var = this.B;
        if (c9Var != null && c9Var.f4922a.equals(x8Var) && (l10 = this.B.f4933n) != null) {
            return l10.longValue();
        }
        Long l11 = null;
        if (tL_messageReactions != null && (arrayList = tL_messageReactions.top_reactors) != null) {
            int size = arrayList.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    break;
                }
                TLRPC.MessageReactor messageReactor = arrayList.get(i3);
                i3++;
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
        Long y12 = hp.s1(this.f5029a).y1();
        if (y12 != null) {
            return y12.longValue();
        }
        return 0L;
    }

    public final long B(zi ziVar) {
        Long A1;
        Long l10;
        c9 c9Var = this.B;
        if (c9Var != null && c9Var.f4922a.equals(x8.b(ziVar)) && (l10 = this.B.f4933n) != null) {
            return l10.longValue();
        }
        if (ziVar == null) {
            A1 = null;
        } else {
            A1 = ziVar.A1();
        }
        if (A1 != null) {
            return A1.longValue();
        }
        Long y12 = hp.s1(this.f5029a).y1();
        if (y12 != null) {
            return y12.longValue();
        }
        return 0L;
    }

    public final void C(long j10, long j11, u10 u10Var) {
        TL_account.getPaidMessagesRevenue getpaidmessagesrevenue = new TL_account.getPaidMessagesRevenue();
        int i3 = this.f5029a;
        getpaidmessagesrevenue.user_id = hp.s1(i3).o1(j10);
        if (j11 != 0) {
            getpaidmessagesrevenue.parent_peer = hp.s1(i3).j1(j11);
        }
        ConnectionsManager.getInstance(i3).sendRequest(getpaidmessagesrevenue, new e8(u10Var, 0));
    }

    public final long D(int i3, long j10) {
        c9 c9Var = this.B;
        if (c9Var != null) {
            x8 x8Var = c9Var.f4922a;
            if (x8Var.f6364a == j10 && x8Var.f6365b == i3 && c9Var.f4931l) {
                return c9Var.h;
            }
            return 0L;
        }
        return 0L;
    }

    public final long E(zi ziVar) {
        TLRPC.Message message;
        if (ziVar != null && (message = ziVar.f26868k) != null) {
            if ((message.isThreadMessage || ziVar.l3()) && ziVar.f26868k.fwd_from != null) {
                return D(ziVar.f26868k.fwd_from.saved_from_msg_id, ziVar.Z0());
            }
            return D(ziVar.f1(), zi.B0(ziVar.f26868k));
        }
        return 0L;
    }

    public final s8 F(long j10, boolean z10) {
        LongSparseArray longSparseArray = this.K;
        s8 s8Var = (s8) longSparseArray.get(j10);
        if (s8Var == null && z10) {
            s8 s8Var2 = new s8(this.f5029a, j10);
            longSparseArray.put(j10, s8Var2);
            return s8Var2;
        }
        return s8Var;
    }

    public final v8 G(long j10, boolean z10) {
        LongSparseArray longSparseArray = this.L;
        v8 v8Var = (v8) longSparseArray.get(j10);
        if (v8Var == null && z10) {
            v8 v8Var2 = new v8(this.f5029a, j10, true);
            longSparseArray.put(j10, v8Var2);
            return v8Var2;
        }
        return v8Var;
    }

    public final void H(TL_stars.StarGift starGift, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, u10 u10Var) {
        Context context = LaunchActivity.K1;
        if (context == null) {
            context = org.telegram.messenger.t0.f25457b;
        }
        org.telegram.ui.ActionBar.e6 I = I();
        if (starGift != null && context != null) {
            if (!this.f5032e) {
                r(new l2(this, u10Var, starGift, j10));
                return;
            }
            TLRPC.TL_inputInvoiceStarGiftResale tL_inputInvoiceStarGiftResale = new TLRPC.TL_inputInvoiceStarGiftResale();
            tL_inputInvoiceStarGiftResale.slug = starGift.slug;
            tL_inputInvoiceStarGiftResale.to_id = hp.s1(this.f5029a).j1(j10);
            tL_inputInvoiceStarGiftResale.ton = this.f5030b;
            tL_inputInvoiceStarGiftResale.message = tL_textWithEntities;
            tL_inputInvoiceStarGiftResale.show_name = !z10;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject u10 = ii.a3.u(I, false);
            if (u10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftResale;
            ConnectionsManager.getInstance(this.f5029a).sendRequest(tL_payments_getPaymentForm, new ai.f3(8, this, u10Var));
        }
    }

    public final TL_stars.StarGift J(long j10) {
        U();
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i3 < arrayList.size()) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList.get(i3);
                if (starGift.f27230id == j10) {
                    return starGift;
                }
                i3++;
            } else {
                return null;
            }
        }
    }

    public final void K(long j10, u10 u10Var) {
        TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) this.M.get(Long.valueOf(j10));
        if (stargiftupgradepreview != null) {
            u10Var.a(stargiftupgradepreview);
            return;
        }
        TL_stars.getStarGiftUpgradePreview getstargiftupgradepreview = new TL_stars.getStarGiftUpgradePreview();
        getstargiftupgradepreview.gift_id = j10;
        ConnectionsManager.getInstance(this.f5029a).sendRequest(getstargiftupgradepreview, new u2(this, j10, u10Var, 1));
    }

    public final void M(TL_stars.InputSavedStarGift inputSavedStarGift, u10 u10Var) {
        org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, org.telegram.messenger.t0.f25457b, null);
        s1Var.r(200L);
        TL_stars.getSavedStarGift getsavedstargift = new TL_stars.getSavedStarGift();
        getsavedstargift.stargift.add(inputSavedStarGift);
        ConnectionsManager.getInstance(this.f5029a).sendRequest(getsavedstargift, new ai.q1(this, s1Var, inputSavedStarGift, u10Var, 4));
    }

    public final boolean N(int i3) {
        if (this.f5032e && !this.f5043q[i3].isEmpty()) {
            return true;
        }
        return false;
    }

    public final void O() {
        this.f5032e = false;
        p();
        this.f5032e = true;
    }

    public final void P(long j10) {
        v8 G = G(j10, false);
        if (G != null) {
            G.j(false);
        }
        s8 s8Var = (s8) this.K.get(j10);
        if (s8Var != null) {
            s8Var.g();
        }
    }

    public final void Q(TLRPC.UserFull userFull) {
        if (userFull != null) {
            long j10 = userFull.f27151id;
            v8 G = G(j10, false);
            if (G != null && G.f6205n != userFull.stargifts_count) {
                G.j(false);
            }
            s8 s8Var = (s8) this.K.get(j10);
            if (s8Var != null) {
                s8Var.g();
            }
        }
    }

    public final void R() {
        if (this.f5049x) {
            return;
        }
        this.v.clear();
        this.f5048w = null;
        this.f5049x = false;
        this.f5050y = false;
        V();
    }

    public final void S(boolean z10) {
        for (int i3 = 0; i3 < 3; i3++) {
            boolean[] zArr = this.f5046t;
            if (!zArr[i3]) {
                this.f5043q[i3].clear();
                this.f5045s[i3] = null;
                zArr[i3] = false;
                this.f5047u[i3] = false;
                if (z10) {
                    W(i3);
                }
            }
        }
    }

    public final void U() {
        if (!this.C) {
            if (!this.D || System.currentTimeMillis() - this.G >= 60000) {
                this.C = true;
                boolean z10 = this.E;
                int i3 = this.f5029a;
                if (!z10) {
                    a1.c cVar = new a1.c(this, 16);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    qr a02 = qr.a0(i3);
                    a02.f24934a.c(new ai.t6(a02, arrayList3, arrayList2, arrayList, cVar, 4));
                    return;
                }
                int i10 = this.F;
                ai.v2 v2Var = new ai.v2(this, 11);
                TL_stars.getStarGifts getstargifts = new TL_stars.getStarGifts();
                getstargifts.hash = i10;
                ConnectionsManager.getInstance(i3).sendRequest(getstargifts, new d0(v2Var, 2));
            }
        }
    }

    public final void V() {
        if (!this.f5030b && !this.f5049x && !this.f5050y) {
            this.f5049x = true;
            TL_stars.TL_getStarsSubscriptions tL_getStarsSubscriptions = new TL_stars.TL_getStarsSubscriptions();
            tL_getStarsSubscriptions.peer = new TLRPC.TL_inputPeerSelf();
            String str = this.f5048w;
            tL_getStarsSubscriptions.offset = str;
            if (str == null) {
                tL_getStarsSubscriptions.offset = "";
            }
            ConnectionsManager.getInstance(this.f5029a).sendRequest(tL_getStarsSubscriptions, new x7(this, 1));
        }
    }

    public final void W(int i3) {
        boolean z10;
        boolean[] zArr = this.f5046t;
        if (!zArr[i3] && !this.f5047u[i3]) {
            boolean z11 = true;
            zArr[i3] = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
            tL_payments_getStarsTransactions.ton = this.f5030b;
            tL_payments_getStarsTransactions.peer = new TLRPC.TL_inputPeerSelf();
            if (i3 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            tL_payments_getStarsTransactions.inbound = z10;
            if (i3 != 2) {
                z11 = false;
            }
            tL_payments_getStarsTransactions.outbound = z11;
            String str = this.f5045s[i3];
            tL_payments_getStarsTransactions.offset = str;
            if (str == null) {
                tL_payments_getStarsTransactions.offset = "";
            }
            ConnectionsManager.getInstance(this.f5029a).sendRequest(tL_payments_getStarsTransactions, new a2(this, i3, 1));
        }
    }

    public final void X(org.telegram.messenger.zi r38, org.telegram.tgnet.TLRPC.InputInvoice r39, org.telegram.tgnet.TLRPC.TL_payments_paymentFormStars r40, java.lang.Runnable r41, org.telegram.messenger.u10 r42) {
        throw new UnsupportedOperationException("Method not decompiled: ci.e9.X(org.telegram.messenger.zi, org.telegram.tgnet.TLRPC$InputInvoice, org.telegram.tgnet.TLRPC$TL_payments_paymentFormStars, java.lang.Runnable, org.telegram.messenger.u10):void");
    }

    public final void Y(String str, TLRPC.ChatInvite chatInvite, n10 n10Var) {
        if (chatInvite != null && chatInvite.subscription_pricing != null) {
            Context context = org.telegram.messenger.t0.f25457b;
            org.telegram.ui.ActionBar.e6 I = I();
            if (context != null) {
                long j10 = chatInvite.subscription_pricing.amount;
                String str2 = chatInvite.title;
                TLRPC.TL_inputInvoiceChatInviteSubscription tL_inputInvoiceChatInviteSubscription = new TLRPC.TL_inputInvoiceChatInviteSubscription();
                tL_inputInvoiceChatInviteSubscription.hash = str;
                TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                tL_payments_sendStarsForm.form_id = chatInvite.subscription_form_id;
                tL_payments_sendStarsForm.invoice = tL_inputInvoiceChatInviteSubscription;
                ConnectionsManager.getInstance(this.f5029a).sendRequest(tL_payments_sendStarsForm, new y6(this, n10Var, j10, str2, context, I, chatInvite, str));
            }
        }
    }

    public final void Z(final zi ziVar, final TLRPC.InputInvoice inputInvoice, final TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, final u10 u10Var) {
        long j10;
        String str;
        TLRPC.User a22;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        if (tL_payments_paymentFormStars != null) {
            final Context context = org.telegram.messenger.t0.f25457b;
            final org.telegram.ui.ActionBar.e6 I = I();
            if (context == null) {
                return;
            }
            ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStars.invoice.prices;
            int size = arrayList.size();
            final long j11 = 0;
            int i3 = 0;
            while (i3 < size) {
                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i3);
                i3++;
                j11 += tL_labeledPrice.amount;
            }
            if (ziVar != null) {
                TLRPC.Message message = ziVar.f26868k;
                if (message != null && (messageFwdHeader = message.fwd_from) != null && (peer = messageFwdHeader.from_id) != null) {
                    j10 = org.telegram.messenger.m5.o(peer);
                } else {
                    j10 = zi.B0(message);
                }
                if (j10 < 0 && ziVar.Z0() > 0 && (a22 = hp.s1(this.f5029a).a2(Long.valueOf(ziVar.Z0()))) != null && a22.bot) {
                    j10 = a22.f27150id;
                }
            } else {
                j10 = tL_payments_paymentFormStars.bot_id;
            }
            final long j12 = j10;
            if (j12 >= 0) {
                str = l10.p(hp.s1(this.f5029a).a2(Long.valueOf(j12)));
            } else {
                TLRPC.Chat M0 = hp.s1(this.f5029a).M0(Long.valueOf(-j12));
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
            ConnectionsManager.getInstance(this.f5029a).sendRequest(tL_payments_sendStarsForm, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    final e9 e9Var = e9.this;
                    final u10 u10Var2 = u10Var;
                    final zi ziVar2 = ziVar;
                    final Context context2 = context;
                    final long j13 = j11;
                    final String str4 = str2;
                    final int i11 = i10;
                    final String str5 = str3;
                    final TLRPC.InputInvoice inputInvoice2 = inputInvoice;
                    final long j14 = j12;
                    final org.telegram.ui.ActionBar.e6 e6Var = I;
                    final TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars2 = tL_payments_paymentFormStars;
                    org.telegram.messenger.g0.h3(new Runnable() {
                        @Override
                        public final void run() {
                            throw new UnsupportedOperationException("Method not decompiled: ci.k7.run():void");
                        }
                    });
                }
            });
        }
    }

    public final void a0(long j10, long j11, boolean z10) {
        int i3 = this.f5029a;
        c00 c00Var = hp.s1(i3).f23102q7;
        TLRPC.TL_forumTopic f10 = c00Var.f(j10, j11);
        if (f10 != null) {
            f10.nopaid_messages_exception = z10;
            a0.h hVar = c00Var.f21922a;
            if (((ArrayList) hVar.f(j10)) != null) {
                c00Var.getMessagesStorage().C1(c00Var.getConnectionsManager().getCurrentTime(), -j10, (List) hVar.f(j10), true);
            }
            hs.f(i3).k(hs.N3, Long.valueOf(j11));
        }
    }

    public final ci.c9 b0(final org.telegram.messenger.zi r21, final org.telegram.ui.wm r22, final long r23, boolean r25, boolean r26, final java.lang.Long r27) {
        throw new UnsupportedOperationException("Method not decompiled: ci.e9.b0(org.telegram.messenger.zi, org.telegram.ui.wm, long, boolean, boolean, java.lang.Long):ci.c9");
    }

    public final boolean c(TLObject tLObject, ArrayList arrayList, Runnable runnable) {
        if (arrayList == null || arrayList.isEmpty() || o(tLObject) <= 0) {
            return true;
        }
        HashSet hashSet = new HashSet();
        int size = arrayList.size();
        boolean z10 = false;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            int f12 = ((zi) obj).f1();
            hashSet.add(Integer.valueOf(f12));
            if (this.Q.remove(Integer.valueOf(f12))) {
                this.R.put(Integer.valueOf(f12), new ai.k3(this, hashSet, runnable, 22));
                z10 = true;
            }
        }
        return !z10;
    }

    public final void d(org.telegram.messenger.zi r15) {
        throw new UnsupportedOperationException("Method not decompiled: ci.e9.d(org.telegram.messenger.zi):void");
    }

    public final void d0(List list) {
        if (list != null && !list.isEmpty()) {
            zi ziVar = (zi) list.get(0);
            long B0 = zi.B0(ziVar.f26868k);
            int i3 = (B0 > 0L ? 1 : (B0 == 0L ? 0 : -1));
            int i10 = this.f5029a;
            if (i3 >= 0) {
                hp.s1(i10).W2(hp.s1(i10).a2(Long.valueOf(B0)), 0, true, null);
            } else {
                hp.s1(i10).V2(0, -B0, true);
            }
            org.telegram.ui.Components.fc.a0(LaunchActivity.T()).Q(2131624011, 36, wb.T0(TextUtils.concat(bd.G((int) ziVar.f26868k.errorAllowedPriceStars, "PaidMessagesSendErrorToast1", new Object[0]), " ", bd.G((int) ziVar.f26868k.errorNewPriceStars, "PaidMessagesSendErrorToast2", new Object[0])))).j();
        }
    }

    public final void e0(LaunchActivity launchActivity, long j10, String str) {
        if (!this.f5032e) {
            r(new l2(this, (Object) launchActivity, j10, (Object) str, 6));
        } else {
            f0(launchActivity, j10, str);
        }
    }

    public final void f(Activity activity, TL_stars.TL_starsTopupOption tL_starsTopupOption, n10 n10Var, TLRPC.InputPeer inputPeer) {
        boolean z10;
        if (activity == null) {
            return;
        }
        int i3 = this.f5029a;
        if (hp.s1(i3).f23042j7) {
            org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
            if (Q != null && Q.getContext() != null) {
                c0(Q.getContext(), Q.getResourceProvider());
                return;
            } else {
                c0(activity, null);
                return;
            }
        }
        if (((org.telegram.messenger.h0) hp.s1(i3).f23167x7.f24658h0.f13688b).f22814c && inputPeer != null) {
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
            JSONObject u10 = ii.a3.u(I(), false);
            if (u10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
            ConnectionsManager.getInstance(i3).sendRequest(tL_payments_getPaymentForm, new ai.r6(this, n10Var, tL_inputInvoiceStars, 3));
        } else if (!org.telegram.messenger.r1.i().k()) {
            n10Var.a(Boolean.FALSE, "INVOICE DISABLED");
        } else {
            TLRPC.TL_inputStorePaymentStarsTopup tL_inputStorePaymentStarsTopup2 = new TLRPC.TL_inputStorePaymentStarsTopup();
            tL_inputStorePaymentStarsTopup2.stars = tL_starsTopupOption.stars;
            tL_inputStorePaymentStarsTopup2.currency = tL_starsTopupOption.currency;
            tL_inputStorePaymentStarsTopup2.amount = tL_starsTopupOption.amount;
            e5.a aVar = new e5.a();
            aVar.f9555c = "inapp";
            aVar.f9554b = tL_starsTopupOption.store_product;
            e5.o a10 = aVar.a();
            org.telegram.messenger.a8.b("StarsController.buy starts queryProductDetails");
            org.telegram.messenger.r1.i().o(Arrays.asList(a10), new a1.d(n10Var, tL_inputStorePaymentStarsTopup2, tL_starsTopupOption, activity, 1));
        }
    }

    public final void f0(LaunchActivity launchActivity, long j10, String str) {
        if (p().amount < j10 && j10 > 0) {
            new mb(launchActivity, null, j10, 4, str, new ai.y1(6), 0L).show();
            return;
        }
        org.telegram.ui.ActionBar.d2 T2 = LaunchActivity.T();
        if (T2 == null) {
            return;
        }
        org.telegram.ui.Components.ac K = org.telegram.ui.Components.fc.a0(T2).K(2131624226, bd.M0(2131744974, null), bd.M0(2131744973, null), new ai.y1(5));
        K.f31792j = 5000;
        K.k(true);
    }

    public final void g(final long j10, final TLObject tLObject, final TLRPC.TL_textWithEntities tL_textWithEntities, final n10 n10Var) {
        int i3;
        Context context = LaunchActivity.K1;
        if (context == null) {
            context = org.telegram.messenger.t0.f25457b;
        }
        final Context context2 = context;
        final org.telegram.ui.ActionBar.e6 I = I();
        boolean z10 = tLObject instanceof TLRPC.TL_premiumGiftOption;
        if ((z10 || (tLObject instanceof TLRPC.TL_premiumGiftCodeOption)) && context2 != null) {
            if (!this.f5032e) {
                r(new ai.z1(this, n10Var, j10, tLObject, tL_textWithEntities, 4));
                return;
            }
            if (z10) {
                i3 = ((TLRPC.TL_premiumGiftOption) tLObject).months;
            } else if (tLObject instanceof TLRPC.TL_premiumGiftCodeOption) {
                i3 = ((TLRPC.TL_premiumGiftCodeOption) tLObject).months;
            } else {
                return;
            }
            final String l10 = org.telegram.messenger.m5.l(this.f5029a, j10);
            final TLRPC.TL_inputInvoicePremiumGiftStars tL_inputInvoicePremiumGiftStars = new TLRPC.TL_inputInvoicePremiumGiftStars();
            tL_inputInvoicePremiumGiftStars.user_id = hp.s1(this.f5029a).o1(j10);
            tL_inputInvoicePremiumGiftStars.months = i3;
            if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                tL_inputInvoicePremiumGiftStars.flags |= 1;
                tL_inputInvoicePremiumGiftStars.message = tL_textWithEntities;
            }
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject u10 = ii.a3.u(I, false);
            if (u10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoicePremiumGiftStars;
            ConnectionsManager.getInstance(this.f5029a).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                    final e9 e9Var = e9.this;
                    final n10 n10Var2 = n10Var;
                    final TLRPC.TL_inputInvoicePremiumGiftStars tL_inputInvoicePremiumGiftStars2 = tL_inputInvoicePremiumGiftStars;
                    final Context context3 = context2;
                    final org.telegram.ui.ActionBar.e6 e6Var = I;
                    final String str = l10;
                    final long j11 = j10;
                    final TLObject tLObject3 = tLObject;
                    final TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_textWithEntities;
                    org.telegram.messenger.g0.h3(new Runnable() {
                        @Override
                        public final void run() {
                            String str2;
                            TLObject tLObject4 = tLObject2;
                            boolean z11 = tLObject4 instanceof TLRPC.TL_payments_paymentFormStars;
                            n10 n10Var3 = n10Var2;
                            if (!z11) {
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    str2 = "NO_PAYMENT_FORM";
                                } else {
                                    str2 = tL_error2.text;
                                }
                                e9.e(str2);
                                n10Var3.a(Boolean.FALSE, null);
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
                            e9 e9Var2 = e9.this;
                            ConnectionsManager.getInstance(e9Var2.f5029a).sendRequest(tL_payments_sendStarsForm, new p7(e9Var2, n10Var3, context3, e6Var, j12, str, j11, tLObject3, tL_textWithEntities2));
                        }
                    });
                }
            });
        }
    }

    public final void g0(final long j10, final long j11, boolean z10, final boolean z11) {
        TL_account.toggleNoPaidMessagesException togglenopaidmessagesexception = new TL_account.toggleNoPaidMessagesException();
        int i3 = this.f5029a;
        togglenopaidmessagesexception.user_id = hp.s1(i3).o1(j10);
        if (j11 != 0) {
            togglenopaidmessagesexception.parent_peer = hp.s1(i3).j1(j11);
        }
        togglenopaidmessagesexception.refund_charged = z10;
        togglenopaidmessagesexception.require_payment = !z11;
        ConnectionsManager.getInstance(i3).sendRequest(togglenopaidmessagesexception, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                org.telegram.messenger.g0.h3(new h8(e9.this, tLObject, j11, j10, z11));
            }
        });
    }

    public final void h(TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, n10 n10Var) {
        Context context = LaunchActivity.K1;
        if (context == null) {
            context = org.telegram.messenger.t0.f25457b;
        }
        Context context2 = context;
        org.telegram.ui.ActionBar.e6 I = I();
        if (starGift != null && context2 != null) {
            if (!this.f5032e) {
                r(new ai.z1(this, n10Var, tL_payments_paymentFormStarGift, starGift, j10, 5));
                return;
            }
            String l10 = org.telegram.messenger.m5.l(this.f5029a, j10);
            TLRPC.TL_inputInvoiceStarGiftResale tL_inputInvoiceStarGiftResale = new TLRPC.TL_inputInvoiceStarGiftResale();
            tL_inputInvoiceStarGiftResale.slug = starGift.slug;
            tL_inputInvoiceStarGiftResale.to_id = hp.s1(this.f5029a).j1(j10);
            tL_inputInvoiceStarGiftResale.ton = this.f5030b;
            tL_inputInvoiceStarGiftResale.message = tL_textWithEntities;
            tL_inputInvoiceStarGiftResale.show_name = !z10;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            int i3 = 0;
            JSONObject u10 = ii.a3.u(I, false);
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
            long j11 = 0;
            while (i3 < size) {
                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i3);
                i3++;
                j11 += tL_labeledPrice.amount;
                size = size;
                context2 = context2;
            }
            ConnectionsManager.getInstance(this.f5029a).sendRequest(tL_payments_sendStarsForm, new p7(this, n10Var, context2, I, j11, l10, tL_payments_paymentFormStarGift, starGift, j10));
        }
    }

    public final void h0(String str, TLRPC.ChatInvite chatInvite, n10 n10Var) {
        String str2;
        if (chatInvite != null && chatInvite.subscription_pricing != null) {
            Context context = LaunchActivity.K1;
            if (context == null) {
                context = org.telegram.messenger.t0.f25457b;
            }
            Context context2 = context;
            org.telegram.ui.ActionBar.e6 I = I();
            long j10 = chatInvite.subscription_pricing.amount;
            if (context2 != null) {
                int i3 = h10.f22829t0;
                boolean[] zArr = {false};
                n8 n8Var = new n8(this, j10, i3, zArr, n10Var, context2, I, chatInvite, str);
                e0 e0Var = new e0(this, zArr, n10Var);
                org.telegram.ui.ActionBar.t2 l10 = org.telegram.messenger.k5.l(1, context2, I, false);
                LinearLayout f10 = org.telegram.messenger.k5.f(context2, 1);
                f10.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
                FrameLayout frameLayout = new FrameLayout(context2);
                frameLayout.addView(new bb(context2, 40, 0, 0), mf.c(-1.0f, -1));
                org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context2);
                k9Var.setRoundRadius(org.telegram.messenger.g0.L(80.0f));
                org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
                u8Var.s(chatInvite.color);
                String str3 = chatInvite.title;
                u8Var.A = true;
                u8Var.f38689n = 0;
                u8Var.f38688m = false;
                org.telegram.ui.Components.u8.a(str3, null, null, u8Var.f38692q);
                TLRPC.Photo photo = chatInvite.photo;
                if (photo != null) {
                    k9Var.j(org.telegram.messenger.ac.i(org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.g0.L(80.0f), false, null, false), chatInvite.photo), "80_80", u8Var, chatInvite);
                } else {
                    k9Var.setImageDrawable(u8Var);
                }
                frameLayout.addView(k9Var, mf.e(80, 80, 17));
                Drawable drawable = context2.getResources().getDrawable(2131232751);
                int i10 = org.telegram.ui.ActionBar.k6.f27954h5;
                org.telegram.ui.ActionBar.r6.y(frameLayout, drawable, i10, I, PorterDuff.Mode.SRC_IN);
                Drawable drawable2 = context2.getResources().getDrawable(2131232750);
                ImageView imageView = new ImageView(context2);
                imageView.setImageDrawable(drawable);
                frameLayout.addView(imageView, mf.e(26, 26, 17));
                imageView.setTranslationX(org.telegram.messenger.g0.L(26.0f));
                imageView.setTranslationY(org.telegram.messenger.g0.L(26.0f));
                imageView.setScaleX(1.2f);
                imageView.setScaleY(1.2f);
                ImageView imageView2 = new ImageView(context2);
                imageView2.setImageDrawable(drawable2);
                frameLayout.addView(imageView2, mf.e(26, 26, 17));
                imageView2.setTranslationX(org.telegram.messenger.g0.L(26.0f));
                imageView2.setTranslationY(org.telegram.messenger.g0.L(26.0f));
                lb lbVar = new lb(i3, context2, I);
                pf.a(lbVar);
                lbVar.setOnClickListener(new qa(lbVar, 0));
                frameLayout.addView(lbVar, mf.d(-2, -2.0f, 53, 0.0f, 0.0f, -8.0f, 0.0f));
                f10.addView(frameLayout, mf.r(-1, 117, 7));
                TextView g7 = org.telegram.messenger.k5.g(context2, 1, 20.0f);
                g7.setTypeface(org.telegram.messenger.g0.o());
                int i11 = org.telegram.ui.ActionBar.k6.f27988j5;
                org.telegram.messenger.camera.q.o(g7, i11, I, null, 2131745022);
                g7.setGravity(17);
                TextView f11 = org.telegram.messenger.camera.q.f(f10, g7, mf.t(-2, -2, 1, 0, 8, 0, 0), context2);
                f11.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.r6.V(f11, i11, I);
                TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                int i12 = tL_starsSubscriptionPricing.period;
                if (i12 == 2592000) {
                    f11.setText(org.telegram.messenger.g0.X2(bd.G((int) tL_starsSubscriptionPricing.amount, "StarsSubscribeText", chatInvite.title)));
                } else {
                    if (i12 == 300) {
                        str2 = "5 minutes";
                    } else {
                        str2 = "a minute";
                    }
                    f11.setText(org.telegram.messenger.g0.X2(bd.G((int) tL_starsSubscriptionPricing.amount, "StarsSubscribeTextTest", chatInvite.title, str2)));
                }
                f11.setMaxWidth(gi.l3.a(f11.getText(), f11.getPaint()));
                f11.setGravity(17);
                f10.addView(f11, mf.t(-2, -2, 1, 0, 6, 0, 22));
                if (!TextUtils.isEmpty(chatInvite.about)) {
                    TextView textView = new TextView(context2);
                    textView.setTextSize(1, 14.0f);
                    org.telegram.ui.ActionBar.r6.V(textView, i11, I);
                    textView.setText(org.telegram.messenger.i6.m(chatInvite.about, textView.getPaint().getFontMetricsInt(), false, null, 0));
                    textView.setGravity(17);
                    f10.addView(textView, mf.t(-2, -2, 1, 0, 6, 0, 22));
                }
                gi.d dVar = new gi.d(context2, I, true);
                dVar.i(bd.M0(2131745031, null), false, true);
                f10.addView(dVar, mf.o(-1, 48));
                s70 s70Var = new s70(context2, I);
                s70Var.setText(org.telegram.messenger.g0.U2(bd.M0(2131745030, null), new ai.s1(context2, 5)));
                s70Var.setGravity(17);
                s70Var.setTextSize(1, 13.0f);
                org.telegram.ui.ActionBar.r6.V(s70Var, org.telegram.ui.ActionBar.k6.B6, I);
                org.telegram.ui.ActionBar.r6.H(s70Var, org.telegram.ui.ActionBar.k6.Uc, I);
                f10.addView(s70Var, mf.t(-1, -2, 49, 14, 14, 14, 6));
                l10.O = f10;
                dVar.setOnClickListener(new ai.h(n8Var, l10, dVar, 7));
                l10.setOnDismissListener(new ba(e0Var, 1));
                l10.P(i10);
                org.telegram.ui.ActionBar.d2 T2 = LaunchActivity.T();
                if (!org.telegram.messenger.g0.Q1() && T2 != null && !org.telegram.messenger.g0.u1(T2)) {
                    l10.a0(T2);
                }
                l10.show();
            }
        }
    }

    public final void i(final TL_stars.StarGift starGift, final boolean z10, final boolean z11, final long j10, final TLRPC.TL_textWithEntities tL_textWithEntities, final ai.n6 n6Var) {
        Context context = LaunchActivity.K1;
        if (context == null) {
            context = org.telegram.messenger.t0.f25457b;
        }
        final Context context2 = context;
        final org.telegram.ui.ActionBar.e6 I = I();
        if (starGift != null && context2 != null) {
            if (!this.f5032e) {
                r(new Runnable() {
                    @Override
                    public final void run() {
                        e9 e9Var = e9.this;
                        boolean z12 = e9Var.f5032e;
                        ai.n6 n6Var2 = n6Var;
                        if (!z12) {
                            e9.e("NO_BALANCE");
                            n6Var2.a(Boolean.FALSE, null);
                            return;
                        }
                        e9Var.i(starGift, z10, z11, j10, tL_textWithEntities, n6Var2);
                    }
                });
                return;
            }
            final String l10 = org.telegram.messenger.m5.l(this.f5029a, j10);
            final TLRPC.TL_inputInvoiceStarGift tL_inputInvoiceStarGift = new TLRPC.TL_inputInvoiceStarGift();
            tL_inputInvoiceStarGift.hide_name = z10;
            tL_inputInvoiceStarGift.peer = hp.s1(this.f5029a).j1(j10);
            tL_inputInvoiceStarGift.gift_id = starGift.f27230id;
            tL_inputInvoiceStarGift.include_upgrade = z11;
            if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                tL_inputInvoiceStarGift.flags |= 2;
                tL_inputInvoiceStarGift.message = tL_textWithEntities;
            }
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject u10 = ii.a3.u(I, false);
            if (u10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGift;
            ConnectionsManager.getInstance(this.f5029a).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    final e9 e9Var = e9.this;
                    final ai.n6 n6Var2 = n6Var;
                    final TLRPC.TL_inputInvoiceStarGift tL_inputInvoiceStarGift2 = tL_inputInvoiceStarGift;
                    final Context context3 = context2;
                    final org.telegram.ui.ActionBar.e6 e6Var = I;
                    final String str = l10;
                    final TL_stars.StarGift starGift2 = starGift;
                    final boolean z12 = z10;
                    final boolean z13 = z11;
                    final long j11 = j10;
                    final TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_textWithEntities;
                    org.telegram.messenger.g0.h3(new Runnable() {
                        @Override
                        public final void run() {
                            String str2;
                            TLObject tLObject2 = tLObject;
                            boolean z14 = tLObject2 instanceof TLRPC.TL_payments_paymentFormStarGift;
                            final ai.n6 n6Var3 = n6Var2;
                            if (!z14) {
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    str2 = "NO_PAYMENT_FORM";
                                } else {
                                    str2 = tL_error2.text;
                                }
                                e9.e(str2);
                                n6Var3.a(Boolean.FALSE, null);
                                return;
                            }
                            TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) tLObject2;
                            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                            tL_payments_sendStarsForm.form_id = tL_payments_paymentFormStarGift.form_id;
                            tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGift2;
                            ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStarGift.invoice.prices;
                            int size = arrayList.size();
                            int i3 = 0;
                            final long j12 = 0;
                            while (i3 < size) {
                                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i3);
                                i3++;
                                j12 += tL_labeledPrice.amount;
                            }
                            final e9 e9Var2 = e9.this;
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(e9Var2.f5029a);
                            final Context context4 = context3;
                            final org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                            final String str3 = str;
                            final TL_stars.StarGift starGift3 = starGift2;
                            final boolean z15 = z12;
                            final boolean z16 = z13;
                            final long j13 = j11;
                            final TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_textWithEntities2;
                            connectionsManager.sendRequest(tL_payments_sendStarsForm, new RequestDelegate() {
                                @Override
                                public final void run(final TLObject tLObject3, final TLRPC.TL_error tL_error3) {
                                    final e9 e9Var3 = e9.this;
                                    final ai.n6 n6Var4 = n6Var3;
                                    final Context context5 = context4;
                                    final org.telegram.ui.ActionBar.e6 e6Var3 = e6Var2;
                                    final long j14 = j12;
                                    final String str4 = str3;
                                    final TL_stars.StarGift starGift4 = starGift3;
                                    final boolean z17 = z15;
                                    final boolean z18 = z16;
                                    final long j15 = j13;
                                    final TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_textWithEntities3;
                                    org.telegram.messenger.g0.h3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            org.telegram.ui.Components.fc X;
                                            String str5;
                                            SpannableStringBuilder spannableStringBuilder;
                                            p80 p80Var;
                                            ?? r11;
                                            String str6;
                                            e9 e9Var4 = e9.this;
                                            TLObject tLObject4 = tLObject3;
                                            TLRPC.TL_error tL_error4 = tL_error3;
                                            ai.n6 n6Var5 = n6Var4;
                                            Context context6 = context5;
                                            org.telegram.ui.ActionBar.e6 e6Var4 = e6Var3;
                                            long j16 = j14;
                                            String str7 = str4;
                                            TL_stars.StarGift starGift5 = starGift4;
                                            boolean z19 = z17;
                                            boolean z20 = z18;
                                            long j17 = j15;
                                            TLRPC.TL_textWithEntities tL_textWithEntities5 = tL_textWithEntities4;
                                            org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
                                            if (Q != null && Q.visibleDialog == null) {
                                                X = org.telegram.ui.Components.fc.a0(Q);
                                            } else {
                                                X = org.telegram.ui.Components.fc.X();
                                            }
                                            if (!(tLObject4 instanceof TLRPC.TL_payments_paymentResult)) {
                                                if (tL_error4 != null && "BALANCE_TOO_LOW".equals(tL_error4.text)) {
                                                    if (hp.s1(e9Var4.f5029a).f23042j7) {
                                                        n6Var5.a(Boolean.FALSE, null);
                                                        e9.c0(context6, e6Var4);
                                                        return;
                                                    }
                                                    boolean[] zArr = {false};
                                                    mb mbVar = new mb(context6, e6Var4, j16, 6, str7, new w7(e9Var4, zArr, starGift5, z19, z20, j17, tL_textWithEntities5, n6Var5), 0L);
                                                    mbVar.setOnDismissListener(new h3(n6Var5, zArr, 1));
                                                    mbVar.show();
                                                    return;
                                                } else if (tL_error4 != null && "STARGIFT_USAGE_LIMITED".equals(tL_error4.text)) {
                                                    n6Var5.a(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                                                    return;
                                                } else if (tL_error4 != null && "STARGIFT_USER_USAGE_LIMITED".equals(tL_error4.text)) {
                                                    n6Var5.a(Boolean.FALSE, "STARGIFT_USER_USAGE_LIMITED");
                                                    return;
                                                } else {
                                                    n6Var5.a(Boolean.FALSE, null);
                                                    if (tL_error4 != null) {
                                                        str6 = tL_error4.text;
                                                    } else {
                                                        str6 = "FAILED_SEND_STARS";
                                                    }
                                                    X.Q(2131624011, 36, bd.a0(null, null, 2131743888, str6)).j();
                                                    return;
                                                }
                                            }
                                            Utilities.d.c(new q7(e9Var4, (TLRPC.TL_payments_paymentResult) tLObject4, 2));
                                            e9Var4.D = false;
                                            e9Var4.E = true;
                                            e9Var4.G = 0L;
                                            e9Var4.U();
                                            e9Var4.P(j17);
                                            e9Var4.S(true);
                                            n6Var5.a(Boolean.TRUE, null);
                                            org.telegram.messenger.t1 b10 = org.telegram.messenger.v1.a(e9Var4.f5029a).b();
                                            if (b10 != null && b10.a(j17)) {
                                                hp.s1(e9Var4.f5029a).f22999e7.edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j17, false).apply();
                                            }
                                            if (starGift5 != null && starGift5.limited_per_user) {
                                                int i10 = starGift5.per_user_remains - 1;
                                                starGift5.per_user_remains = i10;
                                                spannableStringBuilder = org.telegram.messenger.g0.X2(bd.H(',', "Gift2SentRemainsLimit", Math.max(0, i10)));
                                                str5 = str7;
                                            } else {
                                                str5 = str7;
                                                spannableStringBuilder = null;
                                            }
                                            if (j17 < 0) {
                                                long j18 = -j17;
                                                TLRPC.ChatFull N0 = hp.s1(e9Var4.f5029a).N0(j18);
                                                if (N0 != null) {
                                                    N0.stargifts_count++;
                                                    N0.flags2 |= 262144;
                                                    hp.s1(e9Var4.f5029a).R3(N0);
                                                }
                                                if (Q instanceof ProfileActivity) {
                                                    ProfileActivity profileActivity = (ProfileActivity) Q;
                                                    if (profileActivity.a() == j17) {
                                                        mv0 mv0Var = profileActivity.O;
                                                        if (mv0Var != null) {
                                                            mv0Var.N1(true);
                                                            profileActivity.O.i1(14);
                                                            r11 = 0;
                                                            profileActivity.U4(false);
                                                        } else {
                                                            r11 = 0;
                                                        }
                                                        org.telegram.ui.Components.fc a02 = org.telegram.ui.Components.fc.a0(Q);
                                                        TLRPC.Document document = starGift5.sticker;
                                                        String M0 = bd.M0(2131745119, null);
                                                        if (spannableStringBuilder == null) {
                                                            Object[] objArr = new Object[1];
                                                            objArr[r11] = str5;
                                                            spannableStringBuilder = org.telegram.messenger.g0.X2(bd.G((int) j16, "StarsGiftCompletedChannelText", objArr));
                                                        }
                                                        a02.s(document, M0, spannableStringBuilder).k(r11);
                                                    }
                                                }
                                                Bundle bundle = new Bundle();
                                                bundle.putLong("chat_id", j18);
                                                bundle.putBoolean("open_gifts", true);
                                                ProfileActivity profileActivity2 = new ProfileActivity(bundle, null);
                                                profileActivity2.whenFullyVisible(new ai.z1(profileActivity2, starGift5, spannableStringBuilder, j16, str5, 6));
                                                Q.presentFragment(profileActivity2);
                                            } else if ((Q instanceof wm) && ((wm) Q).a() == j17) {
                                                org.telegram.ui.Components.fc a03 = org.telegram.ui.Components.fc.a0(Q);
                                                TLRPC.Document document2 = starGift5.sticker;
                                                String M02 = bd.M0(2131745119, null);
                                                if (spannableStringBuilder == null) {
                                                    spannableStringBuilder = org.telegram.messenger.g0.X2(bd.G((int) j16, "StarsGiftCompletedText", new Object[0]));
                                                }
                                                a03.s(document2, M02, spannableStringBuilder).k(true);
                                            } else {
                                                hs f10 = hs.f(e9Var4.f5029a);
                                                int i11 = hs.v;
                                                Long valueOf = Long.valueOf(j17);
                                                Boolean bool = Boolean.FALSE;
                                                f10.k(i11, valueOf, bool);
                                                hs.f(e9Var4.f5029a).k(hs.f23312u, Long.valueOf(j17), bool);
                                                wm ra2 = wm.ra(j17);
                                                ra2.whenFullyVisible(new l2(ra2, starGift5, spannableStringBuilder, j16, 5));
                                                Q.presentFragment(ra2);
                                            }
                                            hp.s1(e9Var4.f5029a).f22999e7.edit().putBoolean("show_gift_for_" + j17, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j17, true).apply();
                                            LaunchActivity launchActivity = LaunchActivity.K1;
                                            if (launchActivity != null && (p80Var = launchActivity.f41328y0) != null) {
                                                p80Var.c(true);
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
        boolean equals = this.f5033f.equals(starsAmount);
        int i3 = hs.f23343y3;
        int i10 = this.f5029a;
        if (!equals) {
            this.f5033f = starsAmount;
            this.f5034g = 0L;
            hs.f(i10).k(i3, new Object[0]);
        } else if (this.f5034g != 0) {
            this.f5034g = 0L;
            hs.f(i10).k(i3, new Object[0]);
        }
    }

    public final boolean j() {
        if (this.f5030b) {
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

    public final void j0(final zi ziVar, final long j10, final Runnable runnable, final boolean z10) {
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia;
        if (ziVar == null) {
            runnable.run();
            return;
        }
        final long B0 = zi.B0(ziVar.f26868k);
        final int f12 = ziVar.f1();
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia2 = (TLRPC.TL_messageMediaPaidMedia) ziVar.f26868k.media;
        TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
        int i3 = this.f5029a;
        tL_messages_editMessage.peer = hp.s1(i3).j1(B0);
        int i10 = tL_messages_editMessage.flags;
        tL_messages_editMessage.flags = 32768 | i10;
        tL_messages_editMessage.schedule_date = ziVar.f26868k.date;
        tL_messages_editMessage.f27085id = f12;
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
                tL_inputPhoto.f27020id = photo.f27025id;
                tL_inputPhoto.access_hash = photo.access_hash;
                tL_inputPhoto.file_reference = photo.file_reference;
                tL_inputMediaPhoto.f27064id = tL_inputPhoto;
                tL_inputMediaPaidMedia.extended_media.add(tL_inputMediaPhoto);
            } else {
                tL_messageMediaPaidMedia = tL_messageMediaPaidMedia2;
                if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument = new TLRPC.TL_inputMediaDocument();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) messageMedia).document;
                    tL_inputDocument.f27013id = document.f27007id;
                    tL_inputDocument.access_hash = document.access_hash;
                    tL_inputDocument.file_reference = document.file_reference;
                    tL_inputMediaDocument.f27062id = tL_inputDocument;
                    tL_inputMediaPaidMedia.extended_media.add(tL_inputMediaDocument);
                }
            }
            i11++;
            tL_messageMediaPaidMedia2 = tL_messageMediaPaidMedia;
        }
        tL_messages_editMessage.media = tL_inputMediaPaidMedia;
        ConnectionsManager.getInstance(i3).sendRequest(tL_messages_editMessage, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                org.telegram.messenger.g0.h3(new o8(e9.this, tLObject, runnable, tL_error, z10, B0, f12, ziVar, j10));
            }
        });
    }

    public final TL_stars.SavedStarGift n(long j10) {
        TL_stars.StarGift starGift;
        int i3 = 0;
        while (true) {
            LongSparseArray longSparseArray = this.L;
            if (i3 < longSparseArray.size()) {
                v8 v8Var = (v8) longSparseArray.valueAt(i3);
                for (int i10 = 0; i10 < v8Var.f6203l.size(); i10++) {
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) v8Var.f6203l.get(i10);
                    if (savedStarGift != null && (starGift = savedStarGift.gift) != null && starGift.f27230id == j10) {
                        return savedStarGift;
                    }
                }
                i3++;
            } else {
                return null;
            }
        }
    }

    public final TL_stars.StarsAmount p() {
        return q(null, true, false);
    }

    public final TL_stars.StarsAmount q(Runnable runnable, boolean z10, boolean z11) {
        if (((!this.f5032e || System.currentTimeMillis() - this.f5031c > 60000) && !this.d) || z11) {
            this.d = true;
            TL_stars.TL_payments_getStarsStatus tL_payments_getStarsStatus = new TL_stars.TL_payments_getStarsStatus();
            tL_payments_getStarsStatus.ton = this.f5030b;
            tL_payments_getStarsStatus.peer = new TLRPC.TL_inputPeerSelf();
            ConnectionsManager.getInstance(this.f5029a).sendRequest(tL_payments_getStarsStatus, new ai.f3(9, this, runnable));
        }
        if (z10 && this.f5034g > 0) {
            dg.a m10 = dg.a.m(this.f5033f);
            return dg.a.g(Math.max(0L, m10.a() - this.f5034g), m10.f8923a).o();
        }
        return this.f5033f;
    }

    public final void r(Runnable runnable) {
        q(runnable, true, false);
    }

    public final dg.a s() {
        dg.b bVar;
        dg.a l10 = dg.a.l(p());
        if (l10 == null) {
            if (this.f5030b) {
                bVar = dg.b.f8926b;
            } else {
                bVar = dg.b.f8925a;
            }
            return dg.a.i(0L, bVar);
        }
        return l10;
    }

    public final ArrayList u() {
        if (!this.f5037k && !this.f5038l) {
            this.f5037k = true;
            ConnectionsManager.getInstance(this.f5029a).sendRequest(new TL_stars.TL_payments_getStarsGiftOptions(), new x7(this, 3));
            return this.f5039m;
        }
        return this.f5039m;
    }

    public final ArrayList v() {
        if (!this.f5040n && !this.f5041o) {
            this.f5040n = true;
            ConnectionsManager.getInstance(this.f5029a).sendRequest(new TL_stars.TL_payments_getStarsGiveawayOptions(), new x7(this, 4));
            return this.f5042p;
        }
        return this.f5042p;
    }

    public final ArrayList z() {
        if (!this.h && !this.f5035i) {
            this.h = true;
            ConnectionsManager.getInstance(this.f5029a).sendRequest(new TL_stars.TL_payments_getStarsTopupOptions(), new x7(this, 2));
            return this.f5036j;
        }
        return this.f5036j;
    }
}
