package bi;

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
import org.telegram.messenger.c20;
import org.telegram.messenger.ij;
import org.telegram.messenger.k00;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.messenger.v10;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.w70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cn;
import org.telegram.ui.u80;
import org.telegram.ui.yv0;
public final class ea {
    public static volatile ea[][] S = (ea[][]) Array.newInstance(ea.class, 2, 4);
    public static final Object[][] T = (Object[][]) Array.newInstance(Object.class, 2, 4);
    public boolean A;
    public ca B;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public long G;
    public z9 N;
    public final int f3804a;
    public final boolean f3805b;
    public long f3806c;
    public boolean d;
    public boolean f3807e;
    public long f3809g;
    public boolean h;
    public boolean f3810i;
    public ArrayList f3811j;
    public boolean f3812k;
    public boolean f3813l;
    public ArrayList f3814m;
    public boolean f3815n;
    public boolean f3816o;
    public ArrayList f3817p;
    public String f3823w;
    public boolean f3824x;
    public boolean f3825y;
    public TL_stars.StarsAmount f3808f = TL_stars.StarsAmount.ofStars(0);
    public final ArrayList[] f3818q = {new ArrayList(), new ArrayList(), new ArrayList()};
    public final boolean[] f3819r = new boolean[3];
    public final String[] f3820s = new String[3];
    public final boolean[] f3821t = new boolean[3];
    public final boolean[] f3822u = new boolean[3];
    public final ArrayList v = new ArrayList();
    public final ArrayList f3826z = new ArrayList();
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

    public ea(int i7, boolean z9) {
        this.f3804a = i7;
        this.f3805b = z9;
    }

    public static org.telegram.ui.ActionBar.h6 I() {
        org.telegram.ui.ActionBar.f2 T2 = LaunchActivity.T();
        if (T2 != null) {
            return T2.getResourceProvider();
        }
        return null;
    }

    public static ea L(int i7) {
        return y(i7, true);
    }

    public static boolean T(int i7, cg.a aVar) {
        if (aVar == null || x(i7, aVar.f6163a).s().f6164b >= aVar.f6164b) {
            return true;
        }
        return false;
    }

    public static void a(ea eaVar, TL_stars.StarGifts starGifts) {
        ArrayList arrayList = eaVar.I;
        ArrayList arrayList2 = eaVar.J;
        int i7 = eaVar.f3804a;
        ArrayList arrayList3 = eaVar.H;
        eaVar.C = false;
        eaVar.D = true;
        if (starGifts instanceof TL_stars.TL_starGifts) {
            TL_stars.TL_starGifts tL_starGifts = (TL_stars.TL_starGifts) starGifts;
            qp.s1(i7).Y3(tL_starGifts.users, false);
            qp.s1(i7).S3(tL_starGifts.chats, false);
            yr.a0(i7).m1(tL_starGifts.users, tL_starGifts.chats, true, true);
            arrayList3.clear();
            arrayList3.addAll(tL_starGifts.gifts);
            arrayList2.clear();
            arrayList2.addAll(arrayList3);
            Collections.sort(arrayList2, Comparator$EL.thenComparingInt(Comparator$CC.comparingInt(new bg.d(4)), new bg.d(5)));
            arrayList.clear();
            arrayList.addAll(arrayList3);
            Collections.sort(arrayList, Comparator$CC.comparingInt(new bg.d(6)));
            eaVar.F = tL_starGifts.hash;
            eaVar.G = System.currentTimeMillis();
            qs.f(i7).k(qs.F3, new Object[0]);
            ArrayList<TL_stars.StarGift> arrayList4 = tL_starGifts.gifts;
            int i10 = eaVar.F;
            long j3 = eaVar.G;
            yr a02 = yr.a0(i7);
            a02.f26723a.c(new f9(i10, 0, j3, a02, arrayList4));
        } else if (starGifts instanceof TL_stars.TL_starGiftsNotModified) {
            int i11 = eaVar.F;
            long currentTimeMillis = System.currentTimeMillis();
            eaVar.G = currentTimeMillis;
            yr a03 = yr.a0(i7);
            a03.f26723a.c(new f9(i11, 0, currentTimeMillis, a03, arrayList3));
        }
    }

    public static void b(ea eaVar, ArrayList arrayList, Integer num, Long l10, ArrayList arrayList2, ArrayList arrayList3) {
        int i7 = eaVar.f3804a;
        qp.s1(i7).Y3(arrayList2, true);
        qp.s1(i7).S3(arrayList3, true);
        eaVar.E = true;
        ArrayList arrayList4 = eaVar.H;
        arrayList4.clear();
        arrayList4.addAll(arrayList);
        ArrayList arrayList5 = eaVar.J;
        arrayList5.clear();
        arrayList5.addAll(arrayList4);
        Collections.sort(arrayList5, Comparator$EL.thenComparingInt(Comparator$CC.comparingInt(new bg.d(1)), new bg.d(2)));
        ArrayList arrayList6 = eaVar.I;
        arrayList6.clear();
        arrayList6.addAll(arrayList4);
        Collections.sort(arrayList6, Comparator$CC.comparingInt(new bg.d(3)));
        eaVar.F = num.intValue();
        eaVar.G = l10.longValue();
        eaVar.C = false;
        qs.f(i7).k(qs.F3, new Object[0]);
        eaVar.U();
    }

    public static void c0(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var);
        String M0 = org.telegram.messenger.id.M0(2131745060, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.id.M0(2131745061, null);
        jg.g.C(null, 2131747831, alertDialog$Builder, null);
    }

    public static void e(String str) {
        org.telegram.ui.Components.gc X;
        org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
        if (Q != null && Q.visibleDialog == null) {
            X = org.telegram.ui.Components.gc.a0(Q);
        } else {
            X = org.telegram.ui.Components.gc.X();
        }
        X.Q(2131624011, 36, org.telegram.messenger.id.a0(null, null, 2131743878, str)).j();
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
            return tL_messages_forwardMessages.allow_paid_stars / tL_messages_forwardMessages.f27048id.size();
        } else if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
            return ((TLRPC.TL_messages_sendMedia) tLObject).allow_paid_stars;
        } else {
            return 0L;
        }
    }

    public static Context t(org.telegram.ui.ActionBar.f2 f2Var) {
        if (f2Var != null && f2Var.getContext() != null) {
            return f2Var.getContext();
        }
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null && !launchActivity.isFinishing()) {
            return LaunchActivity.G1;
        }
        if (org.telegram.messenger.t0.f25570b != null) {
            return org.telegram.messenger.t0.f25570b;
        }
        return null;
    }

    public static ea w(int i7) {
        return y(i7, false);
    }

    public static ea x(int i7, cg.b bVar) {
        boolean z9;
        if (bVar == cg.b.f6166b) {
            z9 = true;
        } else {
            z9 = false;
        }
        return y(i7, z9);
    }

    public static ea y(int i7, boolean z9) {
        ea eaVar;
        ea eaVar2 = S[z9 ? 1 : 0][i7];
        if (eaVar2 == null) {
            synchronized (T[z9 ? 1 : 0][i7]) {
                try {
                    eaVar = S[z9 ? 1 : 0][i7];
                    if (eaVar == null) {
                        ea[] eaVarArr = S[z9 ? 1 : 0];
                        ea eaVar3 = new ea(i7, z9);
                        eaVarArr[i7] = eaVar3;
                        eaVar = eaVar3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return eaVar;
        }
        return eaVar2;
    }

    public final long A(x9 x9Var, TLRPC.TL_messageReactions tL_messageReactions) {
        ArrayList<TLRPC.MessageReactor> arrayList;
        Long l10;
        ca caVar = this.B;
        if (caVar != null && caVar.f3590a.equals(x9Var) && (l10 = this.B.f3601n) != null) {
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
        Long y12 = qp.s1(this.f3804a).y1();
        if (y12 != null) {
            return y12.longValue();
        }
        return 0L;
    }

    public final long B(ij ijVar) {
        Long z12;
        Long l10;
        ca caVar = this.B;
        if (caVar != null && caVar.f3590a.equals(x9.b(ijVar)) && (l10 = this.B.f3601n) != null) {
            return l10.longValue();
        }
        if (ijVar == null) {
            z12 = null;
        } else {
            z12 = ijVar.z1();
        }
        if (z12 != null) {
            return z12.longValue();
        }
        Long y12 = qp.s1(this.f3804a).y1();
        if (y12 != null) {
            return y12.longValue();
        }
        return 0L;
    }

    public final void C(long j3, long j10, c20 c20Var) {
        TL_account.getPaidMessagesRevenue getpaidmessagesrevenue = new TL_account.getPaidMessagesRevenue();
        int i7 = this.f3804a;
        getpaidmessagesrevenue.user_id = qp.s1(i7).o1(j3);
        if (j10 != 0) {
            getpaidmessagesrevenue.parent_peer = qp.s1(i7).j1(j10);
        }
        ConnectionsManager.getInstance(i7).sendRequest(getpaidmessagesrevenue, new e9(c20Var, 0));
    }

    public final long D(int i7, long j3) {
        ca caVar = this.B;
        if (caVar != null) {
            x9 x9Var = caVar.f3590a;
            if (x9Var.f5045a == j3 && x9Var.f5046b == i7 && caVar.f3599l) {
                return caVar.h;
            }
            return 0L;
        }
        return 0L;
    }

    public final long E(ij ijVar) {
        TLRPC.Message message;
        if (ijVar != null && (message = ijVar.f23266k) != null) {
            if ((message.isThreadMessage || ijVar.k3()) && ijVar.f23266k.fwd_from != null) {
                return D(ijVar.f23266k.fwd_from.saved_from_msg_id, ijVar.Z0());
            }
            return D(ijVar.e1(), ij.B0(ijVar.f23266k));
        }
        return 0L;
    }

    public final t9 F(long j3, boolean z9) {
        LongSparseArray longSparseArray = this.K;
        t9 t9Var = (t9) longSparseArray.get(j3);
        if (t9Var == null && z9) {
            t9 t9Var2 = new t9(this.f3804a, j3);
            longSparseArray.put(j3, t9Var2);
            return t9Var2;
        }
        return t9Var;
    }

    public final v9 G(long j3, boolean z9) {
        LongSparseArray longSparseArray = this.L;
        v9 v9Var = (v9) longSparseArray.get(j3);
        if (v9Var == null && z9) {
            v9 v9Var2 = new v9(this.f3804a, j3, true);
            longSparseArray.put(j3, v9Var2);
            return v9Var2;
        }
        return v9Var;
    }

    public final void H(TL_stars.StarGift starGift, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z9, c20 c20Var) {
        Context context = LaunchActivity.G1;
        if (context == null) {
            context = org.telegram.messenger.t0.f25570b;
        }
        org.telegram.ui.ActionBar.h6 I = I();
        if (starGift != null && context != null) {
            if (!this.f3807e) {
                r(new w2(this, c20Var, starGift, j3));
                return;
            }
            TLRPC.TL_inputInvoiceStarGiftResale tL_inputInvoiceStarGiftResale = new TLRPC.TL_inputInvoiceStarGiftResale();
            tL_inputInvoiceStarGiftResale.slug = starGift.slug;
            tL_inputInvoiceStarGiftResale.to_id = qp.s1(this.f3804a).j1(j3);
            tL_inputInvoiceStarGiftResale.ton = this.f3805b;
            tL_inputInvoiceStarGiftResale.message = tL_textWithEntities;
            tL_inputInvoiceStarGiftResale.show_name = !z9;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject u10 = hi.a3.u(I, false);
            if (u10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftResale;
            ConnectionsManager.getInstance(this.f3804a).sendRequest(tL_payments_getPaymentForm, new j(6, this, c20Var));
        }
    }

    public final TL_stars.StarGift J(long j3) {
        U();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i7 < arrayList.size()) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList.get(i7);
                if (starGift.f27189id == j3) {
                    return starGift;
                }
                i7++;
            } else {
                return null;
            }
        }
    }

    public final void K(long j3, c20 c20Var) {
        TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) this.M.get(Long.valueOf(j3));
        if (stargiftupgradepreview != null) {
            c20Var.a(stargiftupgradepreview);
            return;
        }
        TL_stars.getStarGiftUpgradePreview getstargiftupgradepreview = new TL_stars.getStarGiftUpgradePreview();
        getstargiftupgradepreview.gift_id = j3;
        ConnectionsManager.getInstance(this.f3804a).sendRequest(getstargiftupgradepreview, new h3(this, j3, c20Var, 1));
    }

    public final void M(TL_stars.InputSavedStarGift inputSavedStarGift, c20 c20Var) {
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, org.telegram.messenger.t0.f25570b, null);
        u1Var.r(200L);
        TL_stars.getSavedStarGift getsavedstargift = new TL_stars.getSavedStarGift();
        getsavedstargift.stargift.add(inputSavedStarGift);
        ConnectionsManager.getInstance(this.f3804a).sendRequest(getsavedstargift, new g2(this, u1Var, inputSavedStarGift, c20Var, 3));
    }

    public final boolean N(int i7) {
        if (this.f3807e && !this.f3818q[i7].isEmpty()) {
            return true;
        }
        return false;
    }

    public final void O() {
        this.f3807e = false;
        p();
        this.f3807e = true;
    }

    public final void P(long j3) {
        v9 G = G(j3, false);
        if (G != null) {
            G.j(false);
        }
        t9 t9Var = (t9) this.K.get(j3);
        if (t9Var != null) {
            t9Var.g();
        }
    }

    public final void Q(TLRPC.UserFull userFull) {
        if (userFull != null) {
            long j3 = userFull.f27110id;
            v9 G = G(j3, false);
            if (G != null && G.f4916n != userFull.stargifts_count) {
                G.j(false);
            }
            t9 t9Var = (t9) this.K.get(j3);
            if (t9Var != null) {
                t9Var.g();
            }
        }
    }

    public final void R() {
        if (this.f3824x) {
            return;
        }
        this.v.clear();
        this.f3823w = null;
        this.f3824x = false;
        this.f3825y = false;
        V();
    }

    public final void S(boolean z9) {
        for (int i7 = 0; i7 < 3; i7++) {
            boolean[] zArr = this.f3821t;
            if (!zArr[i7]) {
                this.f3818q[i7].clear();
                this.f3820s[i7] = null;
                zArr[i7] = false;
                this.f3822u[i7] = false;
                if (z9) {
                    W(i7);
                }
            }
        }
    }

    public final void U() {
        if (!this.C) {
            if (!this.D || System.currentTimeMillis() - this.G >= 60000) {
                this.C = true;
                boolean z9 = this.E;
                int i7 = this.f3804a;
                if (!z9) {
                    a1.c cVar = new a1.c(this, 15);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    yr a02 = yr.a0(i7);
                    a02.f26723a.c(new u0(a02, arrayList3, arrayList2, arrayList, cVar, 3));
                    return;
                }
                int i10 = this.F;
                ai.i iVar = new ai.i(this, 7);
                TL_stars.getStarGifts getstargifts = new TL_stars.getStarGifts();
                getstargifts.hash = i10;
                ConnectionsManager.getInstance(i7).sendRequest(getstargifts, new j0(iVar, 2));
            }
        }
    }

    public final void V() {
        if (!this.f3805b && !this.f3824x && !this.f3825y) {
            this.f3824x = true;
            TL_stars.TL_getStarsSubscriptions tL_getStarsSubscriptions = new TL_stars.TL_getStarsSubscriptions();
            tL_getStarsSubscriptions.peer = new TLRPC.TL_inputPeerSelf();
            String str = this.f3823w;
            tL_getStarsSubscriptions.offset = str;
            if (str == null) {
                tL_getStarsSubscriptions.offset = "";
            }
            ConnectionsManager.getInstance(this.f3804a).sendRequest(tL_getStarsSubscriptions, new x8(this, 1));
        }
    }

    public final void W(int i7) {
        boolean z9;
        boolean[] zArr = this.f3821t;
        if (!zArr[i7] && !this.f3822u[i7]) {
            boolean z10 = true;
            zArr[i7] = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
            tL_payments_getStarsTransactions.ton = this.f3805b;
            tL_payments_getStarsTransactions.peer = new TLRPC.TL_inputPeerSelf();
            if (i7 == 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            tL_payments_getStarsTransactions.inbound = z9;
            if (i7 != 2) {
                z10 = false;
            }
            tL_payments_getStarsTransactions.outbound = z10;
            String str = this.f3820s[i7];
            tL_payments_getStarsTransactions.offset = str;
            if (str == null) {
                tL_payments_getStarsTransactions.offset = "";
            }
            ConnectionsManager.getInstance(this.f3804a).sendRequest(tL_payments_getStarsTransactions, new j2(this, i7, 1));
        }
    }

    public final void X(org.telegram.messenger.ij r37, org.telegram.tgnet.TLRPC.InputInvoice r38, org.telegram.tgnet.TLRPC.TL_payments_paymentFormStars r39, java.lang.Runnable r40, org.telegram.messenger.c20 r41) {
        throw new UnsupportedOperationException("Method not decompiled: bi.ea.X(org.telegram.messenger.ij, org.telegram.tgnet.TLRPC$InputInvoice, org.telegram.tgnet.TLRPC$TL_payments_paymentFormStars, java.lang.Runnable, org.telegram.messenger.c20):void");
    }

    public final void Y(String str, TLRPC.ChatInvite chatInvite, v10 v10Var) {
        if (chatInvite != null && chatInvite.subscription_pricing != null) {
            Context context = org.telegram.messenger.t0.f25570b;
            org.telegram.ui.ActionBar.h6 I = I();
            if (context != null) {
                long j3 = chatInvite.subscription_pricing.amount;
                String str2 = chatInvite.title;
                TLRPC.TL_inputInvoiceChatInviteSubscription tL_inputInvoiceChatInviteSubscription = new TLRPC.TL_inputInvoiceChatInviteSubscription();
                tL_inputInvoiceChatInviteSubscription.hash = str;
                TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                tL_payments_sendStarsForm.form_id = chatInvite.subscription_form_id;
                tL_payments_sendStarsForm.invoice = tL_inputInvoiceChatInviteSubscription;
                ConnectionsManager.getInstance(this.f3804a).sendRequest(tL_payments_sendStarsForm, new x7(this, v10Var, j3, str2, context, I, chatInvite, str));
            }
        }
    }

    public final void Z(final ij ijVar, final TLRPC.InputInvoice inputInvoice, final TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, final c20 c20Var) {
        long j3;
        String str;
        TLRPC.User a22;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        if (tL_payments_paymentFormStars != null) {
            final Context context = org.telegram.messenger.t0.f25570b;
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
            if (ijVar != null) {
                TLRPC.Message message = ijVar.f23266k;
                if (message != null && (messageFwdHeader = message.fwd_from) != null && (peer = messageFwdHeader.from_id) != null) {
                    j3 = org.telegram.messenger.m5.o(peer);
                } else {
                    j3 = ij.B0(message);
                }
                if (j3 < 0 && ijVar.Z0() > 0 && (a22 = qp.s1(this.f3804a).a2(Long.valueOf(ijVar.Z0()))) != null && a22.bot) {
                    j3 = a22.f27109id;
                }
            } else {
                j3 = tL_payments_paymentFormStars.bot_id;
            }
            final long j11 = j3;
            if (j11 >= 0) {
                str = t10.p(qp.s1(this.f3804a).a2(Long.valueOf(j11)));
            } else {
                TLRPC.Chat M0 = qp.s1(this.f3804a).M0(Long.valueOf(-j11));
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
            ConnectionsManager.getInstance(this.f3804a).sendRequest(tL_payments_sendStarsForm, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    final ea eaVar = ea.this;
                    final c20 c20Var2 = c20Var;
                    final ij ijVar2 = ijVar;
                    final Context context2 = context;
                    final long j12 = j10;
                    final String str4 = str2;
                    final int i11 = i10;
                    final String str5 = str3;
                    final TLRPC.InputInvoice inputInvoice2 = inputInvoice;
                    final long j13 = j11;
                    final org.telegram.ui.ActionBar.h6 h6Var = I;
                    final TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars2 = tL_payments_paymentFormStars;
                    org.telegram.messenger.g0.h3(new Runnable() {
                        @Override
                        public final void run() {
                            throw new UnsupportedOperationException("Method not decompiled: bi.j8.run():void");
                        }
                    });
                }
            });
        }
    }

    public final void a0(long j3, long j10, boolean z9) {
        int i7 = this.f3804a;
        k00 k00Var = qp.s1(i7).f24881q7;
        TLRPC.TL_forumTopic f10 = k00Var.f(j3, j10);
        if (f10 != null) {
            f10.nopaid_messages_exception = z9;
            a0.h hVar = k00Var.f23644a;
            if (((ArrayList) hVar.f(j3)) != null) {
                k00Var.getMessagesStorage().C1(k00Var.getConnectionsManager().getCurrentTime(), -j3, (List) hVar.f(j3), true);
            }
            qs.f(i7).k(qs.N3, Long.valueOf(j10));
        }
    }

    public final bi.ca b0(final org.telegram.messenger.ij r21, final org.telegram.ui.cn r22, final long r23, boolean r25, boolean r26, final java.lang.Long r27) {
        throw new UnsupportedOperationException("Method not decompiled: bi.ea.b0(org.telegram.messenger.ij, org.telegram.ui.cn, long, boolean, boolean, java.lang.Long):bi.ca");
    }

    public final boolean c(TLObject tLObject, ArrayList arrayList, Runnable runnable) {
        if (arrayList == null || arrayList.isEmpty() || o(tLObject) <= 0) {
            return true;
        }
        HashSet hashSet = new HashSet();
        int size = arrayList.size();
        boolean z9 = false;
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            int e12 = ((ij) obj).e1();
            hashSet.add(Integer.valueOf(e12));
            if (this.Q.remove(Integer.valueOf(e12))) {
                this.R.put(Integer.valueOf(e12), new aa.s(this, hashSet, runnable, 19));
                z9 = true;
            }
        }
        return !z9;
    }

    public final void d(org.telegram.messenger.ij r15) {
        throw new UnsupportedOperationException("Method not decompiled: bi.ea.d(org.telegram.messenger.ij):void");
    }

    public final void d0(List list) {
        if (list != null && !list.isEmpty()) {
            ij ijVar = (ij) list.get(0);
            long B0 = ij.B0(ijVar.f23266k);
            int i7 = (B0 > 0L ? 1 : (B0 == 0L ? 0 : -1));
            int i10 = this.f3804a;
            if (i7 >= 0) {
                qp.s1(i10).W2(qp.s1(i10).a2(Long.valueOf(B0)), 0, true, null);
            } else {
                qp.s1(i10).V2(0, -B0, true);
            }
            org.telegram.ui.Components.gc.a0(LaunchActivity.T()).Q(2131624011, 36, dd.T0(TextUtils.concat(org.telegram.messenger.id.G((int) ijVar.f23266k.errorAllowedPriceStars, "PaidMessagesSendErrorToast1", new Object[0]), " ", org.telegram.messenger.id.G((int) ijVar.f23266k.errorNewPriceStars, "PaidMessagesSendErrorToast2", new Object[0])))).j();
        }
    }

    public final void e0(LaunchActivity launchActivity, long j3, String str) {
        if (!this.f3807e) {
            r(new w2(this, (Object) launchActivity, j3, (Object) str, 6));
        } else {
            f0(launchActivity, j3, str);
        }
    }

    public final void f(Activity activity, TL_stars.TL_starsTopupOption tL_starsTopupOption, v10 v10Var, TLRPC.InputPeer inputPeer) {
        boolean z9;
        if (activity == null) {
            return;
        }
        int i7 = this.f3804a;
        if (qp.s1(i7).f24821j7) {
            org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
            if (Q != null && Q.getContext() != null) {
                c0(Q.getContext(), Q.getResourceProvider());
                return;
            } else {
                c0(activity, null);
                return;
            }
        }
        if (((org.telegram.messenger.h0) qp.s1(i7).f24946x7.f24446h0.f13891b).f22784c && inputPeer != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if ((org.telegram.messenger.r2.b() || !org.telegram.messenger.r1.i().k()) && !z9) {
            TLRPC.TL_inputStorePaymentStarsTopup tL_inputStorePaymentStarsTopup = new TLRPC.TL_inputStorePaymentStarsTopup();
            tL_inputStorePaymentStarsTopup.stars = tL_starsTopupOption.stars;
            tL_inputStorePaymentStarsTopup.amount = tL_starsTopupOption.amount;
            tL_inputStorePaymentStarsTopup.currency = tL_starsTopupOption.currency;
            tL_inputStorePaymentStarsTopup.spend_purpose_peer = inputPeer;
            TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
            tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsTopup;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject u10 = hi.a3.u(I(), false);
            if (u10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
            ConnectionsManager.getInstance(i7).sendRequest(tL_payments_getPaymentForm, new f2(this, v10Var, tL_inputInvoiceStars, 2));
        } else if (!org.telegram.messenger.r1.i().k()) {
            v10Var.a(Boolean.FALSE, "INVOICE DISABLED");
        } else {
            TLRPC.TL_inputStorePaymentStarsTopup tL_inputStorePaymentStarsTopup2 = new TLRPC.TL_inputStorePaymentStarsTopup();
            tL_inputStorePaymentStarsTopup2.stars = tL_starsTopupOption.stars;
            tL_inputStorePaymentStarsTopup2.currency = tL_starsTopupOption.currency;
            tL_inputStorePaymentStarsTopup2.amount = tL_starsTopupOption.amount;
            ?? obj = new Object();
            obj.f11118b = "inapp";
            obj.f11117a = tL_starsTopupOption.store_product;
            f5.o a10 = obj.a();
            org.telegram.messenger.a8.b("StarsController.buy starts queryProductDetails");
            org.telegram.messenger.r1.i().o(Arrays.asList(a10), new a1.d(v10Var, tL_inputStorePaymentStarsTopup2, tL_starsTopupOption, activity, 2));
        }
    }

    public final void f0(LaunchActivity launchActivity, long j3, String str) {
        if (p().amount < j3 && j3 > 0) {
            new tc(launchActivity, null, j3, 4, str, new ai.m0(5), 0L).show();
            return;
        }
        org.telegram.ui.ActionBar.f2 T2 = LaunchActivity.T();
        if (T2 == null) {
            return;
        }
        org.telegram.ui.Components.bc K = org.telegram.ui.Components.gc.a0(T2).K(2131624226, org.telegram.messenger.id.M0(2131744964, null), org.telegram.messenger.id.M0(2131744963, null), new ai.m0(4));
        K.f32203j = 5000;
        K.k(true);
    }

    public final void g(final long j3, final TLObject tLObject, final TLRPC.TL_textWithEntities tL_textWithEntities, final v10 v10Var) {
        int i7;
        Context context = LaunchActivity.G1;
        if (context == null) {
            context = org.telegram.messenger.t0.f25570b;
        }
        final Context context2 = context;
        final org.telegram.ui.ActionBar.h6 I = I();
        boolean z9 = tLObject instanceof TLRPC.TL_premiumGiftOption;
        if ((z9 || (tLObject instanceof TLRPC.TL_premiumGiftCodeOption)) && context2 != null) {
            if (!this.f3807e) {
                r(new i0(this, v10Var, j3, tLObject, tL_textWithEntities, 3));
                return;
            }
            if (z9) {
                i7 = ((TLRPC.TL_premiumGiftOption) tLObject).months;
            } else if (tLObject instanceof TLRPC.TL_premiumGiftCodeOption) {
                i7 = ((TLRPC.TL_premiumGiftCodeOption) tLObject).months;
            } else {
                return;
            }
            final String l10 = org.telegram.messenger.m5.l(this.f3804a, j3);
            final TLRPC.TL_inputInvoicePremiumGiftStars tL_inputInvoicePremiumGiftStars = new TLRPC.TL_inputInvoicePremiumGiftStars();
            tL_inputInvoicePremiumGiftStars.user_id = qp.s1(this.f3804a).o1(j3);
            tL_inputInvoicePremiumGiftStars.months = i7;
            if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                tL_inputInvoicePremiumGiftStars.flags |= 1;
                tL_inputInvoicePremiumGiftStars.message = tL_textWithEntities;
            }
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject u10 = hi.a3.u(I, false);
            if (u10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoicePremiumGiftStars;
            ConnectionsManager.getInstance(this.f3804a).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                    final ea eaVar = ea.this;
                    final v10 v10Var2 = v10Var;
                    final TLRPC.TL_inputInvoicePremiumGiftStars tL_inputInvoicePremiumGiftStars2 = tL_inputInvoicePremiumGiftStars;
                    final Context context3 = context2;
                    final org.telegram.ui.ActionBar.h6 h6Var = I;
                    final String str = l10;
                    final long j10 = j3;
                    final TLObject tLObject3 = tLObject;
                    final TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_textWithEntities;
                    org.telegram.messenger.g0.h3(new Runnable() {
                        @Override
                        public final void run() {
                            String str2;
                            TLObject tLObject4 = tLObject2;
                            boolean z10 = tLObject4 instanceof TLRPC.TL_payments_paymentFormStars;
                            v10 v10Var3 = v10Var2;
                            if (!z10) {
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    str2 = "NO_PAYMENT_FORM";
                                } else {
                                    str2 = tL_error2.text;
                                }
                                ea.e(str2);
                                v10Var3.a(Boolean.FALSE, null);
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
                            ea eaVar2 = ea.this;
                            ConnectionsManager.getInstance(eaVar2.f3804a).sendRequest(tL_payments_sendStarsForm, new o8(eaVar2, v10Var3, context3, h6Var, j11, str, j10, tLObject3, tL_textWithEntities2));
                        }
                    });
                }
            });
        }
    }

    public final void g0(final long j3, final long j10, boolean z9, final boolean z10) {
        TL_account.toggleNoPaidMessagesException togglenopaidmessagesexception = new TL_account.toggleNoPaidMessagesException();
        int i7 = this.f3804a;
        togglenopaidmessagesexception.user_id = qp.s1(i7).o1(j3);
        if (j10 != 0) {
            togglenopaidmessagesexception.parent_peer = qp.s1(i7).j1(j10);
        }
        togglenopaidmessagesexception.refund_charged = z9;
        togglenopaidmessagesexception.require_payment = !z10;
        ConnectionsManager.getInstance(i7).sendRequest(togglenopaidmessagesexception, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                org.telegram.messenger.g0.h3(new h9(ea.this, tLObject, j10, j3, z10));
            }
        });
    }

    public final void h(TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z9, v10 v10Var) {
        Context context = LaunchActivity.G1;
        if (context == null) {
            context = org.telegram.messenger.t0.f25570b;
        }
        Context context2 = context;
        org.telegram.ui.ActionBar.h6 I = I();
        if (starGift != null && context2 != null) {
            if (!this.f3807e) {
                r(new i0(this, v10Var, tL_payments_paymentFormStarGift, starGift, j3, 4));
                return;
            }
            String l10 = org.telegram.messenger.m5.l(this.f3804a, j3);
            TLRPC.TL_inputInvoiceStarGiftResale tL_inputInvoiceStarGiftResale = new TLRPC.TL_inputInvoiceStarGiftResale();
            tL_inputInvoiceStarGiftResale.slug = starGift.slug;
            tL_inputInvoiceStarGiftResale.to_id = qp.s1(this.f3804a).j1(j3);
            tL_inputInvoiceStarGiftResale.ton = this.f3805b;
            tL_inputInvoiceStarGiftResale.message = tL_textWithEntities;
            tL_inputInvoiceStarGiftResale.show_name = !z9;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            int i7 = 0;
            JSONObject u10 = hi.a3.u(I, false);
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
            ConnectionsManager.getInstance(this.f3804a).sendRequest(tL_payments_sendStarsForm, new o8(this, v10Var, context2, I, j10, l10, tL_payments_paymentFormStarGift, starGift, j3));
        }
    }

    public final void h0(String str, TLRPC.ChatInvite chatInvite, v10 v10Var) {
        String str2;
        if (chatInvite != null && chatInvite.subscription_pricing != null) {
            Context context = LaunchActivity.G1;
            if (context == null) {
                context = org.telegram.messenger.t0.f25570b;
            }
            Context context2 = context;
            org.telegram.ui.ActionBar.h6 I = I();
            long j3 = chatInvite.subscription_pricing.amount;
            if (context2 != null) {
                int i7 = p10.f24474s0;
                boolean[] zArr = {false};
                n9 n9Var = new n9(this, j3, i7, zArr, v10Var, context2, I, chatInvite, str);
                a4 a4Var = new a4(this, zArr, v10Var);
                org.telegram.ui.ActionBar.w2 l10 = org.telegram.messenger.k5.l(1, context2, I, false);
                LinearLayout f10 = org.telegram.messenger.k5.f(context2, 1);
                f10.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
                FrameLayout frameLayout = new FrameLayout(context2);
                frameLayout.addView(new gc(context2, 40, 0, 0), c8.ha.c(-1.0f, -1));
                org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context2);
                k9Var.setRoundRadius(org.telegram.messenger.g0.L(80.0f));
                org.telegram.ui.Components.v8 v8Var = new org.telegram.ui.Components.v8((org.telegram.ui.ActionBar.h6) null);
                v8Var.s(chatInvite.color);
                String str3 = chatInvite.title;
                v8Var.A = true;
                v8Var.f38923n = 0;
                v8Var.f38922m = false;
                org.telegram.ui.Components.v8.a(str3, null, null, v8Var.f38926q);
                TLRPC.Photo photo = chatInvite.photo;
                if (photo != null) {
                    k9Var.j(org.telegram.messenger.hc.i(org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.g0.L(80.0f), false, null, false), chatInvite.photo), "80_80", v8Var, chatInvite);
                } else {
                    k9Var.setImageDrawable(v8Var);
                }
                frameLayout.addView(k9Var, c8.ha.e(80, 80, 17));
                Drawable drawable = context2.getResources().getDrawable(2131232753);
                int i10 = org.telegram.ui.ActionBar.m6.f27963h5;
                org.telegram.ui.ActionBar.t6.x(frameLayout, drawable, i10, I, PorterDuff.Mode.SRC_IN);
                Drawable drawable2 = context2.getResources().getDrawable(2131232752);
                ImageView imageView = new ImageView(context2);
                imageView.setImageDrawable(drawable);
                frameLayout.addView(imageView, c8.ha.e(26, 26, 17));
                imageView.setTranslationX(org.telegram.messenger.g0.L(26.0f));
                imageView.setTranslationY(org.telegram.messenger.g0.L(26.0f));
                imageView.setScaleX(1.2f);
                imageView.setScaleY(1.2f);
                ImageView imageView2 = new ImageView(context2);
                imageView2.setImageDrawable(drawable2);
                frameLayout.addView(imageView2, c8.ha.e(26, 26, 17));
                imageView2.setTranslationX(org.telegram.messenger.g0.L(26.0f));
                imageView2.setTranslationY(org.telegram.messenger.g0.L(26.0f));
                sc scVar = new sc(i7, context2, I);
                c8.ka.a(scVar);
                scVar.setOnClickListener(new tb(scVar, 0));
                frameLayout.addView(scVar, c8.ha.d(-2, -2.0f, 53, 0.0f, 0.0f, -8.0f, 0.0f));
                f10.addView(frameLayout, c8.ha.r(-1, 117, 7));
                TextView g10 = org.telegram.messenger.k5.g(context2, 1, 20.0f);
                g10.setTypeface(org.telegram.messenger.g0.o());
                int i11 = org.telegram.ui.ActionBar.m6.f27998j5;
                org.telegram.messenger.camera.q.o(g10, i11, I, null, 2131745012);
                g10.setGravity(17);
                TextView f11 = org.telegram.messenger.camera.q.f(f10, g10, c8.ha.t(-2, -2, 1, 0, 8, 0, 0), context2);
                f11.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.t6.U(f11, i11, I);
                TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                int i12 = tL_starsSubscriptionPricing.period;
                if (i12 == 2592000) {
                    f11.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.G((int) tL_starsSubscriptionPricing.amount, "StarsSubscribeText", chatInvite.title)));
                } else {
                    if (i12 == 300) {
                        str2 = "5 minutes";
                    } else {
                        str2 = "a minute";
                    }
                    f11.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.G((int) tL_starsSubscriptionPricing.amount, "StarsSubscribeTextTest", chatInvite.title, str2)));
                }
                f11.setMaxWidth(fi.m3.a(f11.getText(), f11.getPaint()));
                f11.setGravity(17);
                f10.addView(f11, c8.ha.t(-2, -2, 1, 0, 6, 0, 22));
                if (!TextUtils.isEmpty(chatInvite.about)) {
                    TextView textView = new TextView(context2);
                    textView.setTextSize(1, 14.0f);
                    org.telegram.ui.ActionBar.t6.U(textView, i11, I);
                    textView.setText(org.telegram.messenger.i6.m(chatInvite.about, textView.getPaint().getFontMetricsInt(), false, null, 0));
                    textView.setGravity(17);
                    f10.addView(textView, c8.ha.t(-2, -2, 1, 0, 6, 0, 22));
                }
                fi.d dVar = new fi.d(context2, I, true);
                dVar.i(org.telegram.messenger.id.M0(2131745021, null), false, true);
                f10.addView(dVar, c8.ha.o(-1, 48));
                w70 w70Var = new w70(context2, I);
                w70Var.setText(org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131745020, null), new pa(context2, 4)));
                w70Var.setGravity(17);
                w70Var.setTextSize(1, 13.0f);
                org.telegram.ui.ActionBar.t6.U(w70Var, org.telegram.ui.ActionBar.m6.B6, I);
                org.telegram.ui.ActionBar.t6.G(w70Var, org.telegram.ui.ActionBar.m6.Uc, I);
                f10.addView(w70Var, c8.ha.t(-1, -2, 49, 14, 14, 14, 6));
                l10.N = f10;
                dVar.setOnClickListener(new ah.g(n9Var, l10, dVar, 2));
                l10.setOnDismissListener(new eb(a4Var, 1));
                l10.P(i10);
                org.telegram.ui.ActionBar.f2 T2 = LaunchActivity.T();
                if (!org.telegram.messenger.g0.Q1() && T2 != null && !org.telegram.messenger.g0.u1(T2)) {
                    l10.a0(T2);
                }
                l10.show();
            }
        }
    }

    public final void i(final TL_stars.StarGift starGift, final boolean z9, final boolean z10, final long j3, final TLRPC.TL_textWithEntities tL_textWithEntities, final zh.p3 p3Var) {
        Context context = LaunchActivity.G1;
        if (context == null) {
            context = org.telegram.messenger.t0.f25570b;
        }
        final Context context2 = context;
        final org.telegram.ui.ActionBar.h6 I = I();
        if (starGift != null && context2 != null) {
            if (!this.f3807e) {
                r(new Runnable() {
                    @Override
                    public final void run() {
                        ea eaVar = ea.this;
                        boolean z11 = eaVar.f3807e;
                        zh.p3 p3Var2 = p3Var;
                        if (!z11) {
                            ea.e("NO_BALANCE");
                            p3Var2.a(Boolean.FALSE, null);
                            return;
                        }
                        eaVar.i(starGift, z9, z10, j3, tL_textWithEntities, p3Var2);
                    }
                });
                return;
            }
            final String l10 = org.telegram.messenger.m5.l(this.f3804a, j3);
            final TLRPC.TL_inputInvoiceStarGift tL_inputInvoiceStarGift = new TLRPC.TL_inputInvoiceStarGift();
            tL_inputInvoiceStarGift.hide_name = z9;
            tL_inputInvoiceStarGift.peer = qp.s1(this.f3804a).j1(j3);
            tL_inputInvoiceStarGift.gift_id = starGift.f27189id;
            tL_inputInvoiceStarGift.include_upgrade = z10;
            if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                tL_inputInvoiceStarGift.flags |= 2;
                tL_inputInvoiceStarGift.message = tL_textWithEntities;
            }
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject u10 = hi.a3.u(I, false);
            if (u10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGift;
            ConnectionsManager.getInstance(this.f3804a).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    final ea eaVar = ea.this;
                    final zh.p3 p3Var2 = p3Var;
                    final TLRPC.TL_inputInvoiceStarGift tL_inputInvoiceStarGift2 = tL_inputInvoiceStarGift;
                    final Context context3 = context2;
                    final org.telegram.ui.ActionBar.h6 h6Var = I;
                    final String str = l10;
                    final TL_stars.StarGift starGift2 = starGift;
                    final boolean z11 = z9;
                    final boolean z12 = z10;
                    final long j10 = j3;
                    final TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_textWithEntities;
                    org.telegram.messenger.g0.h3(new Runnable() {
                        @Override
                        public final void run() {
                            String str2;
                            TLObject tLObject2 = tLObject;
                            boolean z13 = tLObject2 instanceof TLRPC.TL_payments_paymentFormStarGift;
                            final zh.p3 p3Var3 = p3Var2;
                            if (!z13) {
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    str2 = "NO_PAYMENT_FORM";
                                } else {
                                    str2 = tL_error2.text;
                                }
                                ea.e(str2);
                                p3Var3.a(Boolean.FALSE, null);
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
                            final ea eaVar2 = ea.this;
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(eaVar2.f3804a);
                            final Context context4 = context3;
                            final org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
                            final String str3 = str;
                            final TL_stars.StarGift starGift3 = starGift2;
                            final boolean z14 = z11;
                            final boolean z15 = z12;
                            final long j12 = j10;
                            final TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_textWithEntities2;
                            connectionsManager.sendRequest(tL_payments_sendStarsForm, new RequestDelegate() {
                                @Override
                                public final void run(final TLObject tLObject3, final TLRPC.TL_error tL_error3) {
                                    final ea eaVar3 = ea.this;
                                    final zh.p3 p3Var4 = p3Var3;
                                    final Context context5 = context4;
                                    final org.telegram.ui.ActionBar.h6 h6Var3 = h6Var2;
                                    final long j13 = j11;
                                    final String str4 = str3;
                                    final TL_stars.StarGift starGift4 = starGift3;
                                    final boolean z16 = z14;
                                    final boolean z17 = z15;
                                    final long j14 = j12;
                                    final TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_textWithEntities3;
                                    org.telegram.messenger.g0.h3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            org.telegram.ui.Components.gc X;
                                            String str5;
                                            SpannableStringBuilder spannableStringBuilder;
                                            u80 u80Var;
                                            ?? r11;
                                            String str6;
                                            ea eaVar4 = ea.this;
                                            TLObject tLObject4 = tLObject3;
                                            TLRPC.TL_error tL_error4 = tL_error3;
                                            zh.p3 p3Var5 = p3Var4;
                                            Context context6 = context5;
                                            org.telegram.ui.ActionBar.h6 h6Var4 = h6Var3;
                                            long j15 = j13;
                                            String str7 = str4;
                                            TL_stars.StarGift starGift5 = starGift4;
                                            boolean z18 = z16;
                                            boolean z19 = z17;
                                            long j16 = j14;
                                            TLRPC.TL_textWithEntities tL_textWithEntities5 = tL_textWithEntities4;
                                            org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                                            if (Q != null && Q.visibleDialog == null) {
                                                X = org.telegram.ui.Components.gc.a0(Q);
                                            } else {
                                                X = org.telegram.ui.Components.gc.X();
                                            }
                                            if (!(tLObject4 instanceof TLRPC.TL_payments_paymentResult)) {
                                                if (tL_error4 != null && "BALANCE_TOO_LOW".equals(tL_error4.text)) {
                                                    if (qp.s1(eaVar4.f3804a).f24821j7) {
                                                        p3Var5.a(Boolean.FALSE, null);
                                                        ea.c0(context6, h6Var4);
                                                        return;
                                                    }
                                                    boolean[] zArr = {false};
                                                    tc tcVar = new tc(context6, h6Var4, j15, 6, str7, new v8(eaVar4, zArr, starGift5, z18, z19, j16, tL_textWithEntities5, p3Var5), 0L);
                                                    tcVar.setOnDismissListener(new u3(p3Var5, zArr, 1));
                                                    tcVar.show();
                                                    return;
                                                } else if (tL_error4 != null && "STARGIFT_USAGE_LIMITED".equals(tL_error4.text)) {
                                                    p3Var5.a(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                                                    return;
                                                } else if (tL_error4 != null && "STARGIFT_USER_USAGE_LIMITED".equals(tL_error4.text)) {
                                                    p3Var5.a(Boolean.FALSE, "STARGIFT_USER_USAGE_LIMITED");
                                                    return;
                                                } else {
                                                    p3Var5.a(Boolean.FALSE, null);
                                                    if (tL_error4 != null) {
                                                        str6 = tL_error4.text;
                                                    } else {
                                                        str6 = "FAILED_SEND_STARS";
                                                    }
                                                    X.Q(2131624011, 36, org.telegram.messenger.id.a0(null, null, 2131743878, str6)).j();
                                                    return;
                                                }
                                            }
                                            Utilities.d.c(new p8(eaVar4, (TLRPC.TL_payments_paymentResult) tLObject4, 2));
                                            eaVar4.D = false;
                                            eaVar4.E = true;
                                            eaVar4.G = 0L;
                                            eaVar4.U();
                                            eaVar4.P(j16);
                                            eaVar4.S(true);
                                            p3Var5.a(Boolean.TRUE, null);
                                            org.telegram.messenger.t1 b10 = org.telegram.messenger.v1.a(eaVar4.f3804a).b();
                                            if (b10 != null && b10.a(j16)) {
                                                qp.s1(eaVar4.f3804a).f24778e7.edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j16, false).apply();
                                            }
                                            if (starGift5 != null && starGift5.limited_per_user) {
                                                int i10 = starGift5.per_user_remains - 1;
                                                starGift5.per_user_remains = i10;
                                                spannableStringBuilder = org.telegram.messenger.g0.X2(org.telegram.messenger.id.H(',', "Gift2SentRemainsLimit", Math.max(0, i10)));
                                                str5 = str7;
                                            } else {
                                                str5 = str7;
                                                spannableStringBuilder = null;
                                            }
                                            if (j16 < 0) {
                                                long j17 = -j16;
                                                TLRPC.ChatFull N0 = qp.s1(eaVar4.f3804a).N0(j17);
                                                if (N0 != null) {
                                                    N0.stargifts_count++;
                                                    N0.flags2 |= 262144;
                                                    qp.s1(eaVar4.f3804a).R3(N0);
                                                }
                                                if (Q instanceof ProfileActivity) {
                                                    ProfileActivity profileActivity = (ProfileActivity) Q;
                                                    if (profileActivity.a() == j16) {
                                                        yv0 yv0Var = profileActivity.N;
                                                        if (yv0Var != null) {
                                                            yv0Var.P1(true);
                                                            profileActivity.N.k1(14);
                                                            r11 = 0;
                                                            profileActivity.X4(false);
                                                        } else {
                                                            r11 = 0;
                                                        }
                                                        org.telegram.ui.Components.gc a02 = org.telegram.ui.Components.gc.a0(Q);
                                                        TLRPC.Document document = starGift5.sticker;
                                                        String M0 = org.telegram.messenger.id.M0(2131745109, null);
                                                        if (spannableStringBuilder == null) {
                                                            Object[] objArr = new Object[1];
                                                            objArr[r11] = str5;
                                                            spannableStringBuilder = org.telegram.messenger.g0.X2(org.telegram.messenger.id.G((int) j15, "StarsGiftCompletedChannelText", objArr));
                                                        }
                                                        a02.s(document, M0, spannableStringBuilder).k(r11);
                                                    }
                                                }
                                                Bundle bundle = new Bundle();
                                                bundle.putLong("chat_id", j17);
                                                bundle.putBoolean("open_gifts", true);
                                                ProfileActivity profileActivity2 = new ProfileActivity(bundle, null);
                                                profileActivity2.whenFullyVisible(new i0(profileActivity2, starGift5, spannableStringBuilder, j15, str5, 5));
                                                Q.presentFragment(profileActivity2);
                                            } else if ((Q instanceof cn) && ((cn) Q).a() == j16) {
                                                org.telegram.ui.Components.gc a03 = org.telegram.ui.Components.gc.a0(Q);
                                                TLRPC.Document document2 = starGift5.sticker;
                                                String M02 = org.telegram.messenger.id.M0(2131745109, null);
                                                if (spannableStringBuilder == null) {
                                                    spannableStringBuilder = org.telegram.messenger.g0.X2(org.telegram.messenger.id.G((int) j15, "StarsGiftCompletedText", new Object[0]));
                                                }
                                                a03.s(document2, M02, spannableStringBuilder).k(true);
                                            } else {
                                                qs f10 = qs.f(eaVar4.f3804a);
                                                int i11 = qs.v;
                                                Long valueOf = Long.valueOf(j16);
                                                Boolean bool = Boolean.FALSE;
                                                f10.k(i11, valueOf, bool);
                                                qs.f(eaVar4.f3804a).k(qs.f25087u, Long.valueOf(j16), bool);
                                                cn ta2 = cn.ta(j16);
                                                ta2.whenFullyVisible(new w2(ta2, starGift5, spannableStringBuilder, j15, 5));
                                                Q.presentFragment(ta2);
                                            }
                                            qp.s1(eaVar4.f3804a).f24778e7.edit().putBoolean("show_gift_for_" + j16, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j16, true).apply();
                                            LaunchActivity launchActivity = LaunchActivity.G1;
                                            if (launchActivity != null && (u80Var = launchActivity.f41291v0) != null) {
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
        boolean equals = this.f3808f.equals(starsAmount);
        int i7 = qs.f25118y3;
        int i10 = this.f3804a;
        if (!equals) {
            this.f3808f = starsAmount;
            this.f3809g = 0L;
            qs.f(i10).k(i7, new Object[0]);
        } else if (this.f3809g != 0) {
            this.f3809g = 0L;
            qs.f(i10).k(i7, new Object[0]);
        }
    }

    public final boolean j() {
        if (this.f3805b) {
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

    public final void j0(final ij ijVar, final long j3, final Runnable runnable, final boolean z9) {
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia;
        if (ijVar == null) {
            runnable.run();
            return;
        }
        final long B0 = ij.B0(ijVar.f23266k);
        final int e12 = ijVar.e1();
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia2 = (TLRPC.TL_messageMediaPaidMedia) ijVar.f23266k.media;
        TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
        int i7 = this.f3804a;
        tL_messages_editMessage.peer = qp.s1(i7).j1(B0);
        int i10 = tL_messages_editMessage.flags;
        tL_messages_editMessage.flags = 32768 | i10;
        tL_messages_editMessage.schedule_date = ijVar.f23266k.date;
        tL_messages_editMessage.f27044id = e12;
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
                tL_inputPhoto.f26979id = photo.f26984id;
                tL_inputPhoto.access_hash = photo.access_hash;
                tL_inputPhoto.file_reference = photo.file_reference;
                tL_inputMediaPhoto.f27023id = tL_inputPhoto;
                tL_inputMediaPaidMedia.extended_media.add(tL_inputMediaPhoto);
            } else {
                tL_messageMediaPaidMedia = tL_messageMediaPaidMedia2;
                if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument = new TLRPC.TL_inputMediaDocument();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) messageMedia).document;
                    tL_inputDocument.f26972id = document.f26966id;
                    tL_inputDocument.access_hash = document.access_hash;
                    tL_inputDocument.file_reference = document.file_reference;
                    tL_inputMediaDocument.f27021id = tL_inputDocument;
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
                org.telegram.messenger.g0.h3(new o9(ea.this, tLObject, runnable, tL_error, z9, B0, e12, ijVar, j3));
            }
        });
    }

    public final TL_stars.SavedStarGift n(long j3) {
        TL_stars.StarGift starGift;
        int i7 = 0;
        while (true) {
            LongSparseArray longSparseArray = this.L;
            if (i7 < longSparseArray.size()) {
                v9 v9Var = (v9) longSparseArray.valueAt(i7);
                for (int i10 = 0; i10 < v9Var.f4914l.size(); i10++) {
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) v9Var.f4914l.get(i10);
                    if (savedStarGift != null && (starGift = savedStarGift.gift) != null && starGift.f27189id == j3) {
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

    public final TL_stars.StarsAmount q(Runnable runnable, boolean z9, boolean z10) {
        if (((!this.f3807e || System.currentTimeMillis() - this.f3806c > 60000) && !this.d) || z10) {
            this.d = true;
            TL_stars.TL_payments_getStarsStatus tL_payments_getStarsStatus = new TL_stars.TL_payments_getStarsStatus();
            tL_payments_getStarsStatus.ton = this.f3805b;
            tL_payments_getStarsStatus.peer = new TLRPC.TL_inputPeerSelf();
            ConnectionsManager.getInstance(this.f3804a).sendRequest(tL_payments_getStarsStatus, new j(7, this, runnable));
        }
        if (z9 && this.f3809g > 0) {
            cg.a m10 = cg.a.m(this.f3808f);
            return cg.a.g(Math.max(0L, m10.a() - this.f3809g), m10.f6163a).o();
        }
        return this.f3808f;
    }

    public final void r(Runnable runnable) {
        q(runnable, true, false);
    }

    public final cg.a s() {
        cg.b bVar;
        cg.a l10 = cg.a.l(p());
        if (l10 == null) {
            if (this.f3805b) {
                bVar = cg.b.f6166b;
            } else {
                bVar = cg.b.f6165a;
            }
            return cg.a.i(0L, bVar);
        }
        return l10;
    }

    public final ArrayList u() {
        if (!this.f3812k && !this.f3813l) {
            this.f3812k = true;
            ConnectionsManager.getInstance(this.f3804a).sendRequest(new TL_stars.TL_payments_getStarsGiftOptions(), new x8(this, 3));
            return this.f3814m;
        }
        return this.f3814m;
    }

    public final ArrayList v() {
        if (!this.f3815n && !this.f3816o) {
            this.f3815n = true;
            ConnectionsManager.getInstance(this.f3804a).sendRequest(new TL_stars.TL_payments_getStarsGiveawayOptions(), new x8(this, 4));
            return this.f3817p;
        }
        return this.f3817p;
    }

    public final ArrayList z() {
        if (!this.h && !this.f3810i) {
            this.h = true;
            ConnectionsManager.getInstance(this.f3804a).sendRequest(new TL_stars.TL_payments_getStarsTopupOptions(), new x8(this, 2));
            return this.f3811j;
        }
        return this.f3811j;
    }
}
