package defpackage;

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
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class jxa {
    public static volatile jxa[][] S = (jxa[][]) Array.newInstance(jxa.class, 2, 4);
    public static final Object[][] T = (Object[][]) Array.newInstance(Object.class, 2, 4);
    public boolean A;
    public hxa B;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public long G;
    public exa N;
    public final int a;
    public final boolean b;
    public long c;
    public boolean d;
    public boolean e;
    public long g;
    public boolean h;
    public boolean i;
    public ArrayList j;
    public boolean k;
    public boolean l;
    public ArrayList m;
    public boolean n;
    public boolean o;
    public ArrayList p;
    public String w;
    public boolean x;
    public boolean y;
    public TL_stars.StarsAmount f = TL_stars.StarsAmount.ofStars(0);
    public final ArrayList[] q = {new ArrayList(), new ArrayList(), new ArrayList()};
    public final boolean[] r = new boolean[3];
    public final String[] s = new String[3];
    public final boolean[] t = new boolean[3];
    public final boolean[] u = new boolean[3];
    public final ArrayList v = new ArrayList();
    public final ArrayList z = new ArrayList();
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
        for (int i = 0; i < 2; i++) {
            for (int i2 = 0; i2 < 4; i2++) {
                T[i][i2] = new Object();
            }
        }
    }

    public jxa(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public static vnb F() {
        e S2 = LaunchActivity.S();
        if (S2 != null) {
            return S2.getResourceProvider();
        }
        return null;
    }

    public static jxa I(int i) {
        return v(i, true);
    }

    public static boolean R(int i, oj ojVar) {
        if (ojVar == null || u(i, ojVar.a).p().b >= ojVar.b) {
            return true;
        }
        return false;
    }

    public static void c(String str) {
        d31 Y;
        e Q = LaunchActivity.Q();
        if (Q != null && Q.visibleDialog == null) {
            Y = d31.b0(Q);
        } else {
            Y = d31.Y();
        }
        Y.Q(2131624012, 36, d31.W(str)).j();
    }

    public static void d0(Context context, vnb vnbVar) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, context);
        String M0 = ob6.M0(2131744717, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        idVar.U = ob6.M0(2131744718, null);
        c00.u(null, 2131747558, alertDialog$Builder, null);
    }

    public static boolean h(TL_stars.SavedStarGift savedStarGift, TL_stars.SavedStarGift savedStarGift2) {
        int i = savedStarGift.flags;
        if ((i & 2048) == 0 || (savedStarGift2.flags & 2048) == 0 || savedStarGift.saved_id != savedStarGift2.saved_id) {
            if ((i & 8) != 0 && (savedStarGift2.flags & 8) != 0 && savedStarGift.msg_id == savedStarGift2.msg_id) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static TL_stars.StarGiftAttribute i(ArrayList arrayList, Class cls) {
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                TL_stars.StarGiftAttribute starGiftAttribute = (TL_stars.StarGiftAttribute) obj;
                if (cls.isInstance(starGiftAttribute)) {
                    return (TL_stars.StarGiftAttribute) cls.cast(starGiftAttribute);
                }
            }
            return null;
        }
        return null;
    }

    public static ArrayList j(ArrayList arrayList, Class cls) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            TL_stars.StarGiftAttribute starGiftAttribute = (TL_stars.StarGiftAttribute) obj;
            if (cls.isInstance(starGiftAttribute)) {
                arrayList2.add((TL_stars.StarGiftAttribute) cls.cast(starGiftAttribute));
            }
        }
        return arrayList2;
    }

    public static long l(TLObject tLObject) {
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
            return tL_messages_forwardMessages.allow_paid_stars / tL_messages_forwardMessages.id.size();
        } else if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
            return ((TLRPC.TL_messages_sendMedia) tLObject).allow_paid_stars;
        } else {
            return 0L;
        }
    }

    public static Context q(e eVar) {
        if (eVar != null && eVar.getContext() != null) {
            return eVar.getContext();
        }
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null && !launchActivity.isFinishing()) {
            return LaunchActivity.H1;
        }
        if (a.b != null) {
            return a.b;
        }
        return null;
    }

    public static jxa t(int i) {
        return v(i, false);
    }

    public static jxa u(int i, pj pjVar) {
        boolean z;
        if (pjVar == pj.b) {
            z = true;
        } else {
            z = false;
        }
        return v(i, z);
    }

    public static jxa v(int i, boolean z) {
        jxa jxaVar;
        jxa jxaVar2 = S[z ? 1 : 0][i];
        if (jxaVar2 == null) {
            synchronized (T[z ? 1 : 0][i]) {
                jxaVar = S[z ? 1 : 0][i];
                if (jxaVar == null) {
                    jxa[] jxaVarArr = S[z ? 1 : 0];
                    jxa jxaVar3 = new jxa(i, z);
                    jxaVarArr[i] = jxaVar3;
                    jxaVar = jxaVar3;
                }
            }
            return jxaVar;
        }
        return jxaVar2;
    }

    public final long A(int i, long j) {
        hxa hxaVar = this.B;
        if (hxaVar != null) {
            cxa cxaVar = hxaVar.a;
            if (cxaVar.a == j && cxaVar.b == i && hxaVar.l) {
                return hxaVar.h;
            }
            return 0L;
        }
        return 0L;
    }

    public final long B(r47 r47Var) {
        TLRPC.Message message;
        if (r47Var != null && (message = r47Var.k) != null) {
            if ((message.isThreadMessage || r47Var.k3()) && r47Var.k.fwd_from != null) {
                return A(r47Var.k.fwd_from.saved_from_msg_id, r47Var.Z0());
            }
            return A(r47Var.e1(), r47.B0(r47Var.k));
        }
        return 0L;
    }

    public final zwa C(long j, boolean z) {
        LongSparseArray longSparseArray = this.K;
        zwa zwaVar = (zwa) longSparseArray.get(j);
        if (zwaVar == null && z) {
            zwa zwaVar2 = new zwa(this.a, j);
            longSparseArray.put(j, zwaVar2);
            return zwaVar2;
        }
        return zwaVar;
    }

    public final axa D(long j, boolean z) {
        LongSparseArray longSparseArray = this.L;
        axa axaVar = (axa) longSparseArray.get(j);
        if (axaVar == null && z) {
            axa axaVar2 = new axa(this.a, j, true);
            longSparseArray.put(j, axaVar2);
            return axaVar2;
        }
        return axaVar;
    }

    public final void E(TL_stars.StarGift starGift, long j, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z, pcc pccVar) {
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = a.b;
        }
        vnb F = F();
        if (starGift != null && context != null) {
            if (!this.e) {
                o(new us0(this, pccVar, starGift, j, tL_textWithEntities, z, (byte) 8));
                return;
            }
            TLRPC.TL_inputInvoiceStarGiftResale tL_inputInvoiceStarGiftResale = new TLRPC.TL_inputInvoiceStarGiftResale();
            tL_inputInvoiceStarGiftResale.slug = starGift.slug;
            tL_inputInvoiceStarGiftResale.to_id = uc7.s1(this.a).j1(j);
            tL_inputInvoiceStarGiftResale.ton = this.b;
            tL_inputInvoiceStarGiftResale.message = tL_textWithEntities;
            tL_inputInvoiceStarGiftResale.show_name = !z;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject u = xw0.u(F, false);
            if (u != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftResale;
            ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new isa(this, pccVar, (byte) 3));
        }
    }

    public final TL_stars.StarGift G(long j) {
        U();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i < arrayList.size()) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList.get(i);
                if (starGift.id == j) {
                    return starGift;
                }
                i++;
            } else {
                return null;
            }
        }
    }

    public final void H(long j, pcc pccVar) {
        TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) this.M.get(Long.valueOf(j));
        if (stargiftupgradepreview != null) {
            pccVar.a(stargiftupgradepreview);
            return;
        }
        TL_stars.getStarGiftUpgradePreview getstargiftupgradepreview = new TL_stars.getStarGiftUpgradePreview();
        getstargiftupgradepreview.gift_id = j;
        ConnectionsManager.getInstance(this.a).sendRequest(getstargiftupgradepreview, new p87(this, j, pccVar, (byte) 17));
    }

    public final void J(TL_stars.InputSavedStarGift inputSavedStarGift, pcc pccVar) {
        id idVar = new id(3, null, a.b);
        idVar.q(200L);
        TL_stars.getSavedStarGift getsavedstargift = new TL_stars.getSavedStarGift();
        getsavedstargift.stargift.add(inputSavedStarGift);
        ConnectionsManager.getInstance(this.a).sendRequest(getsavedstargift, new au0(this, idVar, inputSavedStarGift, pccVar, (byte) 21));
    }

    public final boolean K(int i) {
        if (this.e && !this.q[i].isEmpty()) {
            return true;
        }
        return false;
    }

    public final void L() {
        this.e = false;
        m();
        this.e = true;
    }

    public final void M(long j) {
        axa D = D(j, false);
        if (D != null) {
            D.k(false);
        }
        zwa zwaVar = (zwa) this.K.get(j);
        if (zwaVar != null) {
            zwaVar.g();
        }
    }

    public final void N(TLRPC.UserFull userFull) {
        if (userFull != null) {
            long j = userFull.id;
            axa D = D(j, false);
            if (D != null && D.n != userFull.stargifts_count) {
                D.k(false);
            }
            zwa zwaVar = (zwa) this.K.get(j);
            if (zwaVar != null) {
                zwaVar.g();
            }
        }
    }

    public final void O(String str) {
        boolean z;
        if (!TextUtils.isEmpty(str)) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (true) {
                LongSparseArray longSparseArray = this.L;
                if (i >= longSparseArray.size()) {
                    break;
                }
                if (((axa) longSparseArray.valueAt(i)).j(str)) {
                    arrayList.add(Long.valueOf(longSparseArray.keyAt(i)));
                }
                i++;
            }
            int i2 = 0;
            while (true) {
                LongSparseArray longSparseArray2 = this.K;
                if (i2 >= longSparseArray2.size()) {
                    break;
                }
                zwa zwaVar = (zwa) longSparseArray2.valueAt(i2);
                axa axaVar = zwaVar.g;
                if (axaVar != null && axaVar.j(str)) {
                    z = true;
                } else {
                    z = false;
                }
                for (axa axaVar2 : zwaVar.h.values()) {
                    if (!z && !axaVar2.j(str)) {
                        z = false;
                    } else {
                        z = true;
                    }
                }
                if (z && !arrayList.contains(Long.valueOf(longSparseArray2.keyAt(i2)))) {
                    arrayList.add(Long.valueOf(longSparseArray2.keyAt(i2)));
                }
                i2++;
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                M(((Long) arrayList.get(i3)).longValue());
            }
        }
    }

    public final void P() {
        if (this.x) {
            return;
        }
        this.v.clear();
        this.w = null;
        this.x = false;
        this.y = false;
        V();
    }

    public final void Q(boolean z) {
        for (int i = 0; i < 3; i++) {
            boolean[] zArr = this.t;
            if (!zArr[i]) {
                this.q[i].clear();
                this.s[i] = null;
                zArr[i] = false;
                this.u[i] = false;
                if (z) {
                    W(i);
                }
            }
        }
    }

    public final void S(ArrayList arrayList, Integer num, Long l, ArrayList arrayList2, ArrayList arrayList3) {
        int i = this.a;
        uc7.s1(i).j4(arrayList2, true);
        uc7.s1(i).c4(arrayList3, true);
        this.E = true;
        ArrayList arrayList4 = this.H;
        arrayList4.clear();
        arrayList4.addAll(arrayList);
        ArrayList arrayList5 = this.J;
        arrayList5.clear();
        arrayList5.addAll(arrayList4);
        Collections.sort(arrayList5, Comparator$EL.thenComparingInt(Comparator$CC.comparingInt(new nm((byte) 14)), new nm((byte) 15)));
        ArrayList arrayList6 = this.I;
        arrayList6.clear();
        arrayList6.addAll(arrayList4);
        Collections.sort(arrayList6, Comparator$CC.comparingInt(new nm((byte) 16)));
        this.F = num.intValue();
        this.G = l.longValue();
        this.C = false;
        jn7.f(i).k(jn7.H3, new Object[0]);
        U();
    }

    public final void T(TL_stars.StarGifts starGifts) {
        this.C = false;
        this.D = true;
        boolean z = starGifts instanceof TL_stars.TL_starGifts;
        int i = this.a;
        ArrayList arrayList = this.H;
        if (z) {
            TL_stars.TL_starGifts tL_starGifts = (TL_stars.TL_starGifts) starGifts;
            uc7.s1(i).j4(tL_starGifts.users, false);
            uc7.s1(i).c4(tL_starGifts.chats, false);
            kf7.a0(i).n1(tL_starGifts.users, tL_starGifts.chats, true, true);
            arrayList.clear();
            arrayList.addAll(tL_starGifts.gifts);
            ArrayList arrayList2 = this.J;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            Collections.sort(arrayList2, Comparator$EL.thenComparingInt(Comparator$CC.comparingInt(new nm((byte) 17)), new nm((byte) 18)));
            ArrayList arrayList3 = this.I;
            arrayList3.clear();
            arrayList3.addAll(arrayList);
            Collections.sort(arrayList3, Comparator$CC.comparingInt(new nm((byte) 19)));
            this.F = tL_starGifts.hash;
            this.G = System.currentTimeMillis();
            jn7.f(i).k(jn7.H3, new Object[0]);
            ArrayList<TL_stars.StarGift> arrayList4 = tL_starGifts.gifts;
            int i2 = this.F;
            long j = this.G;
            kf7 a0 = kf7.a0(i);
            a0.a.c(new td7(a0, arrayList4, i2, j));
        } else if (starGifts instanceof TL_stars.TL_starGiftsNotModified) {
            int i3 = this.F;
            long currentTimeMillis = System.currentTimeMillis();
            this.G = currentTimeMillis;
            kf7 a02 = kf7.a0(i);
            a02.a.c(new td7(a02, arrayList, i3, currentTimeMillis));
        }
    }

    public final void U() {
        if (!this.C) {
            if (!this.D || System.currentTimeMillis() - this.G >= 60000) {
                this.C = true;
                boolean z = this.E;
                int i = this.a;
                if (!z) {
                    hja hjaVar = new hja(this, (byte) 6);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    kf7 a0 = kf7.a0(i);
                    a0.a.c(new cp7((Object) a0, (Object) arrayList3, (Object) arrayList2, (Object) arrayList, (Object) hjaVar, (byte) 28));
                    return;
                }
                int i2 = this.F;
                sh9 sh9Var = new sh9(this, (byte) 10);
                TL_stars.getStarGifts getstargifts = new TL_stars.getStarGifts();
                getstargifts.hash = i2;
                ConnectionsManager.getInstance(i).sendRequest(getstargifts, new yp9(sh9Var, (byte) 3));
            }
        }
    }

    public final void V() {
        if (!this.b && !this.x && !this.y) {
            this.x = true;
            TL_stars.TL_getStarsSubscriptions tL_getStarsSubscriptions = new TL_stars.TL_getStarsSubscriptions();
            tL_getStarsSubscriptions.peer = new TLRPC.TL_inputPeerSelf();
            String str = this.w;
            tL_getStarsSubscriptions.offset = str;
            if (str == null) {
                tL_getStarsSubscriptions.offset = "";
            }
            ConnectionsManager.getInstance(this.a).sendRequest(tL_getStarsSubscriptions, new lwa(this, (byte) 0));
        }
    }

    public final void W(int i) {
        boolean z;
        boolean[] zArr = this.t;
        if (!zArr[i] && !this.u[i]) {
            boolean z2 = true;
            zArr[i] = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
            tL_payments_getStarsTransactions.ton = this.b;
            tL_payments_getStarsTransactions.peer = new TLRPC.TL_inputPeerSelf();
            if (i == 1) {
                z = true;
            } else {
                z = false;
            }
            tL_payments_getStarsTransactions.inbound = z;
            if (i != 2) {
                z2 = false;
            }
            tL_payments_getStarsTransactions.outbound = z2;
            String str = this.s[i];
            tL_payments_getStarsTransactions.offset = str;
            if (str == null) {
                tL_payments_getStarsTransactions.offset = "";
            }
            ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getStarsTransactions, new b22(this, i, (byte) 6));
        }
    }

    public final void X(defpackage.r47 r38, org.telegram.tgnet.TLRPC.InputInvoice r39, org.telegram.tgnet.TLRPC.TL_payments_paymentFormStars r40, java.lang.Runnable r41, defpackage.pcc r42) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jxa.X(r47, org.telegram.tgnet.TLRPC$InputInvoice, org.telegram.tgnet.TLRPC$TL_payments_paymentFormStars, java.lang.Runnable, pcc):void");
    }

    public final void Y(final r47 r47Var, final TLRPC.InputInvoice inputInvoice, final TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, final pcc pccVar) {
        long j;
        String str;
        TLRPC.User X1;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        if (tL_payments_paymentFormStars != null) {
            final Context context = a.b;
            final vnb F = F();
            if (context == null) {
                return;
            }
            ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStars.invoice.prices;
            int size = arrayList.size();
            final long j2 = 0;
            int i = 0;
            while (i < size) {
                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i);
                i++;
                j2 += tL_labeledPrice.amount;
            }
            if (r47Var != null) {
                TLRPC.Message message = r47Var.k;
                if (message != null && (messageFwdHeader = message.fwd_from) != null && (peer = messageFwdHeader.from_id) != null) {
                    j = wf3.n(peer);
                } else {
                    j = r47.B0(message);
                }
                if (j < 0 && r47Var.Z0() > 0 && (X1 = uc7.s1(this.a).X1(Long.valueOf(r47Var.Z0()))) != null && X1.bot) {
                    j = X1.id;
                }
            } else {
                j = tL_payments_paymentFormStars.bot_id;
            }
            final long j3 = j;
            int i2 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
            int i3 = this.a;
            if (i2 >= 0) {
                str = lbc.r(uc7.s1(i3).X1(Long.valueOf(j3)));
            } else {
                TLRPC.Chat M0 = uc7.s1(i3).M0(Long.valueOf(-j3));
                if (M0 == null) {
                    str = "";
                } else {
                    str = M0.title;
                }
            }
            final String str2 = str;
            final String str3 = tL_payments_paymentFormStars.title;
            final int i4 = tL_payments_paymentFormStars.invoice.subscription_period;
            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
            tL_payments_sendStarsForm.form_id = tL_payments_paymentFormStars.form_id;
            tL_payments_sendStarsForm.invoice = inputInvoice;
            ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_sendStarsForm, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    final jxa jxaVar = jxa.this;
                    final pcc pccVar2 = pccVar;
                    final r47 r47Var2 = r47Var;
                    final Context context2 = context;
                    final long j4 = j2;
                    final String str4 = str2;
                    final int i5 = i4;
                    final String str5 = str3;
                    final TLRPC.InputInvoice inputInvoice2 = inputInvoice;
                    final long j5 = j3;
                    final vnb vnbVar = F;
                    final TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars2 = tL_payments_paymentFormStars;
                    hl.c3(new Runnable() {
                        @Override
                        public final void run() {
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.yva.run():void");
                        }
                    });
                }
            });
        }
    }

    public final void Z(String str, TLRPC.ChatInvite chatInvite, icc iccVar) {
        if (chatInvite != null && chatInvite.subscription_pricing != null) {
            Context context = a.b;
            vnb F = F();
            if (context != null) {
                long j = chatInvite.subscription_pricing.amount;
                String str2 = chatInvite.title;
                TLRPC.TL_inputInvoiceChatInviteSubscription tL_inputInvoiceChatInviteSubscription = new TLRPC.TL_inputInvoiceChatInviteSubscription();
                tL_inputInvoiceChatInviteSubscription.hash = str;
                TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                tL_payments_sendStarsForm.form_id = chatInvite.subscription_form_id;
                tL_payments_sendStarsForm.invoice = tL_inputInvoiceChatInviteSubscription;
                ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_sendStarsForm, new p97(this, iccVar, j, str2, context, F, chatInvite, str));
            }
        }
    }

    public final boolean a(TLObject tLObject, ArrayList arrayList, Runnable runnable) {
        if (arrayList == null || arrayList.isEmpty() || l(tLObject) <= 0) {
            return true;
        }
        HashSet hashSet = new HashSet();
        int size = arrayList.size();
        boolean z = false;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            int e1 = ((r47) obj).e1();
            hashSet.add(Integer.valueOf(e1));
            if (this.Q.remove(Integer.valueOf(e1))) {
                this.R.put(Integer.valueOf(e1), new pwa(this, hashSet, runnable, (byte) 0));
                z = true;
            }
        }
        return !z;
    }

    public final void a0(long j, long j2, boolean z) {
        int i = this.a;
        qyb qybVar = uc7.s1(i).h4;
        TLRPC.TL_forumTopic f = qybVar.f(j, j2);
        if (f != null) {
            f.nopaid_messages_exception = z;
            zh6 zh6Var = qybVar.a;
            if (((ArrayList) zh6Var.f(j)) != null) {
                qybVar.getMessagesStorage().D1(qybVar.getConnectionsManager().getCurrentTime(), -j, (List) zh6Var.f(j), true);
            }
            jn7.f(i).k(jn7.Q3, Long.valueOf(j2));
        }
    }

    public final void b(defpackage.r47 r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jxa.b(r47):void");
    }

    public final void b0(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        if (tL_starGiftUnique != null && !TextUtils.isEmpty(tL_starGiftUnique.slug)) {
            int i = 0;
            int i2 = 0;
            while (true) {
                LongSparseArray longSparseArray = this.L;
                if (i2 >= longSparseArray.size()) {
                    break;
                }
                ((axa) longSparseArray.valueAt(i2)).o(tL_starGiftUnique);
                i2++;
            }
            while (true) {
                LongSparseArray longSparseArray2 = this.K;
                if (i < longSparseArray2.size()) {
                    zwa zwaVar = (zwa) longSparseArray2.valueAt(i);
                    axa axaVar = zwaVar.g;
                    if (axaVar != null) {
                        axaVar.o(tL_starGiftUnique);
                    }
                    for (axa axaVar2 : zwaVar.h.values()) {
                        axaVar2.o(tL_starGiftUnique);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final defpackage.hxa c0(final defpackage.r47 r20, final defpackage.zu1 r21, final long r22, boolean r24, boolean r25, final java.lang.Long r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jxa.c0(r47, zu1, long, boolean, boolean, java.lang.Long):hxa");
    }

    public final void d(Activity activity, TL_stars.TL_starsTopupOption tL_starsTopupOption, icc iccVar, TLRPC.InputPeer inputPeer) {
        boolean z;
        int i = this.a;
        if (activity == null) {
            return;
        }
        if (!uc7.s1(i).i5()) {
            e Q = LaunchActivity.Q();
            if (Q != null && Q.getContext() != null) {
                d0(Q.getContext(), Q.getResourceProvider());
                return;
            } else {
                d0(activity, null);
                return;
            }
        }
        if (uc7.s1(this.a).l4.t0.f && inputPeer != null) {
            z = true;
        } else {
            z = false;
        }
        if ((f11.b() || !di0.h().j()) && !z) {
            TLRPC.TL_inputStorePaymentStarsTopup tL_inputStorePaymentStarsTopup = new TLRPC.TL_inputStorePaymentStarsTopup();
            tL_inputStorePaymentStarsTopup.stars = tL_starsTopupOption.stars;
            tL_inputStorePaymentStarsTopup.amount = tL_starsTopupOption.amount;
            tL_inputStorePaymentStarsTopup.currency = tL_starsTopupOption.currency;
            tL_inputStorePaymentStarsTopup.spend_purpose_peer = inputPeer;
            TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
            tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsTopup;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject u = xw0.u(F(), false);
            if (u != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
            ConnectionsManager.getInstance(i).sendRequest(tL_payments_getPaymentForm, new qn8(this, iccVar, tL_inputInvoiceStars, (byte) 17));
        } else if (!di0.h().j()) {
            iccVar.a(Boolean.FALSE, "INVOICE DISABLED");
        } else {
            TLRPC.TL_inputStorePaymentStarsTopup tL_inputStorePaymentStarsTopup2 = new TLRPC.TL_inputStorePaymentStarsTopup();
            tL_inputStorePaymentStarsTopup2.stars = tL_starsTopupOption.stars;
            tL_inputStorePaymentStarsTopup2.currency = tL_starsTopupOption.currency;
            tL_inputStorePaymentStarsTopup2.amount = tL_starsTopupOption.amount;
            ?? obj = new Object();
            obj.b = "inapp";
            obj.a = tL_starsTopupOption.store_product;
            k09 a = obj.a();
            cc4.b("StarsController.buy starts queryProductDetails");
            di0.h().o(Arrays.asList(a), new pt(iccVar, tL_inputStorePaymentStarsTopup2, tL_starsTopupOption, activity, (byte) 25));
        }
    }

    public final void e(final long j, final TLObject tLObject, final TLRPC.TL_textWithEntities tL_textWithEntities, final icc iccVar) {
        int i;
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = a.b;
        }
        final Context context2 = context;
        final vnb F = F();
        boolean z = tLObject instanceof TLRPC.TL_premiumGiftOption;
        if ((z || (tLObject instanceof TLRPC.TL_premiumGiftCodeOption)) && context2 != null) {
            if (!this.e) {
                o(new da7(this, iccVar, j, tLObject, tL_textWithEntities, (byte) 18));
                return;
            }
            if (z) {
                i = ((TLRPC.TL_premiumGiftOption) tLObject).months;
            } else if (tLObject instanceof TLRPC.TL_premiumGiftCodeOption) {
                i = ((TLRPC.TL_premiumGiftCodeOption) tLObject).months;
            } else {
                return;
            }
            final String k = wf3.k(this.a, j);
            final TLRPC.TL_inputInvoicePremiumGiftStars tL_inputInvoicePremiumGiftStars = new TLRPC.TL_inputInvoicePremiumGiftStars();
            tL_inputInvoicePremiumGiftStars.user_id = uc7.s1(this.a).o1(j);
            tL_inputInvoicePremiumGiftStars.months = i;
            if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                tL_inputInvoicePremiumGiftStars.flags |= 1;
                tL_inputInvoicePremiumGiftStars.message = tL_textWithEntities;
            }
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject u = xw0.u(F, false);
            if (u != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoicePremiumGiftStars;
            ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                    final jxa jxaVar = jxa.this;
                    final icc iccVar2 = iccVar;
                    final TLRPC.TL_inputInvoicePremiumGiftStars tL_inputInvoicePremiumGiftStars2 = tL_inputInvoicePremiumGiftStars;
                    final Context context3 = context2;
                    final vnb vnbVar = F;
                    final String str = k;
                    final long j2 = j;
                    final TLObject tLObject3 = tLObject;
                    final TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_textWithEntities;
                    hl.c3(new Runnable() {
                        @Override
                        public final void run() {
                            String str2;
                            TLObject tLObject4 = tLObject2;
                            boolean z2 = tLObject4 instanceof TLRPC.TL_payments_paymentFormStars;
                            final icc iccVar3 = iccVar2;
                            if (!z2) {
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    str2 = "NO_PAYMENT_FORM";
                                } else {
                                    str2 = tL_error2.text;
                                }
                                jxa.c(str2);
                                iccVar3.a(Boolean.FALSE, null);
                                return;
                            }
                            TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = (TLRPC.TL_payments_paymentFormStars) tLObject4;
                            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                            tL_payments_sendStarsForm.form_id = tL_payments_paymentFormStars.form_id;
                            tL_payments_sendStarsForm.invoice = tL_inputInvoicePremiumGiftStars2;
                            ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStars.invoice.prices;
                            int size = arrayList.size();
                            int i2 = 0;
                            final long j3 = 0;
                            while (i2 < size) {
                                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i2);
                                i2++;
                                j3 += tL_labeledPrice.amount;
                            }
                            final jxa jxaVar2 = jxa.this;
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(jxaVar2.a);
                            final Context context4 = context3;
                            final vnb vnbVar2 = vnbVar;
                            final String str3 = str;
                            final long j4 = j2;
                            final TLObject tLObject5 = tLObject3;
                            final TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_textWithEntities2;
                            connectionsManager.sendRequest(tL_payments_sendStarsForm, new RequestDelegate() {
                                @Override
                                public final void run(final TLObject tLObject6, final TLRPC.TL_error tL_error3) {
                                    final jxa jxaVar3 = jxa.this;
                                    final icc iccVar4 = iccVar3;
                                    final Context context5 = context4;
                                    final vnb vnbVar3 = vnbVar2;
                                    final long j5 = j3;
                                    final String str4 = str3;
                                    final long j6 = j4;
                                    final TLObject tLObject7 = tLObject5;
                                    final TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_textWithEntities3;
                                    hl.c3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            d31 Y;
                                            y16 y16Var;
                                            int i3;
                                            String str5;
                                            jxa jxaVar4 = jxa.this;
                                            TLObject tLObject8 = tLObject6;
                                            TLRPC.TL_error tL_error4 = tL_error3;
                                            icc iccVar5 = iccVar4;
                                            Context context6 = context5;
                                            vnb vnbVar4 = vnbVar3;
                                            long j7 = j5;
                                            String str6 = str4;
                                            long j8 = j6;
                                            TLObject tLObject9 = tLObject7;
                                            TLRPC.TL_textWithEntities tL_textWithEntities5 = tL_textWithEntities4;
                                            e Q = LaunchActivity.Q();
                                            if (Q != null && Q.visibleDialog == null) {
                                                Y = d31.b0(Q);
                                            } else {
                                                Y = d31.Y();
                                            }
                                            if (!(tLObject8 instanceof TLRPC.TL_payments_paymentResult)) {
                                                if (tL_error4 != null) {
                                                    if ("BALANCE_TOO_LOW".equals(tL_error4.text)) {
                                                        if (!uc7.s1(jxaVar4.a).i5()) {
                                                            iccVar5.a(Boolean.FALSE, null);
                                                            jxa.d0(context6, vnbVar4);
                                                            return;
                                                        }
                                                        boolean[] zArr = {false};
                                                        dza dzaVar = new dza(context6, vnbVar4, j7, 6, str6, new nm1(jxaVar4, zArr, j8, tLObject9, tL_textWithEntities5, iccVar5, (byte) 4), 0L);
                                                        dzaVar.setOnDismissListener(new gwa((byte) 1, iccVar5, zArr));
                                                        dzaVar.show();
                                                        return;
                                                    }
                                                    i3 = 1;
                                                    if ("STARGIFT_USAGE_LIMITED".equals(tL_error4.text)) {
                                                        iccVar5.a(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                                                        return;
                                                    }
                                                } else {
                                                    i3 = 1;
                                                }
                                                iccVar5.a(Boolean.FALSE, null);
                                                if (tL_error4 != null) {
                                                    str5 = tL_error4.text;
                                                } else {
                                                    str5 = "FAILED_SEND_STARS";
                                                }
                                                Object[] objArr = new Object[i3];
                                                objArr[0] = str5;
                                                Y.Q(2131624012, 36, ob6.a0(null, null, 2131743533, objArr)).j();
                                                return;
                                            }
                                            Utilities.d.c(new fwa(jxaVar4, (TLRPC.TL_payments_paymentResult) tLObject8, (byte) 3));
                                            jxaVar4.Q(true);
                                            iccVar5.a(Boolean.TRUE, null);
                                            nj0 b = pj0.a(jxaVar4.a).b();
                                            if (b != null && b.a(j8)) {
                                                uc7.s1(jxaVar4.a).Y3.edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j8, false).apply();
                                            }
                                            uc7.s1(jxaVar4.a).Y3.edit().putBoolean("show_gift_for_" + j8, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j8, true).apply();
                                            LaunchActivity launchActivity = LaunchActivity.H1;
                                            if (launchActivity != null && (y16Var = launchActivity.w0) != null) {
                                                y16Var.c(true);
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

    public final void e0(List list) {
        if (list != null && !list.isEmpty()) {
            r47 r47Var = (r47) list.get(0);
            long B0 = r47.B0(r47Var.k);
            int i = (B0 > 0L ? 1 : (B0 == 0L ? 0 : -1));
            int i2 = this.a;
            if (i >= 0) {
                uc7.s1(i2).f3(uc7.s1(i2).X1(Long.valueOf(B0)), 0, true, null);
            } else {
                uc7.s1(i2).e3(0, -B0, true);
            }
            d31.b0(LaunchActivity.S()).Q(2131624012, 36, nza.T0(TextUtils.concat(ob6.G((int) r47Var.k.errorAllowedPriceStars, "PaidMessagesSendErrorToast1", new Object[0]), " ", ob6.G((int) r47Var.k.errorNewPriceStars, "PaidMessagesSendErrorToast2", new Object[0])))).j();
        }
    }

    public final void f(final TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, final TL_stars.StarGift starGift, final long j, final TLRPC.TL_textWithEntities tL_textWithEntities, final boolean z, final icc iccVar) {
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = a.b;
        }
        final Context context2 = context;
        final vnb F = F();
        if (context2 == null) {
            return;
        }
        if (!this.e) {
            o(new ss0(this, iccVar, tL_payments_paymentFormStarGift, starGift, j, tL_textWithEntities, z));
            return;
        }
        final String k = wf3.k(this.a, j);
        TLRPC.TL_inputInvoiceStarGiftResale tL_inputInvoiceStarGiftResale = new TLRPC.TL_inputInvoiceStarGiftResale();
        tL_inputInvoiceStarGiftResale.slug = starGift.slug;
        tL_inputInvoiceStarGiftResale.to_id = uc7.s1(this.a).j1(j);
        tL_inputInvoiceStarGiftResale.ton = this.b;
        tL_inputInvoiceStarGiftResale.message = tL_textWithEntities;
        tL_inputInvoiceStarGiftResale.show_name = !z;
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        JSONObject u = xw0.u(F, false);
        if (u != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = u.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftResale;
        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
        tL_payments_sendStarsForm.form_id = tL_payments_paymentFormStarGift.form_id;
        tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftResale;
        ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStarGift.invoice.prices;
        int size = arrayList.size();
        long j2 = 0;
        for (int i = 0; i < size; i++) {
            j2 += arrayList.get(i).amount;
            context2 = context2;
        }
        final long j3 = j2;
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_sendStarsForm, new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final jxa jxaVar = jxa.this;
                final icc iccVar2 = iccVar;
                final Context context3 = context2;
                final vnb vnbVar = F;
                final long j4 = j3;
                final String str = k;
                final TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift2 = tL_payments_paymentFormStarGift;
                final TL_stars.StarGift starGift2 = starGift;
                final long j5 = j;
                final TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_textWithEntities;
                final boolean z2 = z;
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        d31 Y;
                        y16 y16Var;
                        String str2;
                        final jxa jxaVar2 = jxa.this;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        final icc iccVar3 = iccVar2;
                        Context context4 = context3;
                        vnb vnbVar2 = vnbVar;
                        long j6 = j4;
                        String str3 = str;
                        final TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift3 = tL_payments_paymentFormStarGift2;
                        final TL_stars.StarGift starGift3 = starGift2;
                        final long j7 = j5;
                        final TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_textWithEntities2;
                        final boolean z3 = z2;
                        e Q = LaunchActivity.Q();
                        if (Q != null && Q.visibleDialog == null) {
                            Y = d31.b0(Q);
                        } else {
                            Y = d31.Y();
                        }
                        if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                            if (tL_error2 != null) {
                                if ("BALANCE_TOO_LOW".equals(tL_error2.text)) {
                                    if (!uc7.s1(jxaVar2.a).i5()) {
                                        iccVar3.a(Boolean.FALSE, null);
                                        jxa.d0(context4, vnbVar2);
                                        return;
                                    }
                                    final boolean[] zArr = {false};
                                    dza dzaVar = new dza(context4, vnbVar2, j6, 6, str3, new Runnable() {
                                        @Override
                                        public final void run() {
                                            zArr[0] = true;
                                            jxa.this.f(tL_payments_paymentFormStarGift3, starGift3, j7, tL_textWithEntities3, z3, iccVar3);
                                        }
                                    }, 0L);
                                    dzaVar.setOnDismissListener(new gwa((byte) 2, iccVar3, zArr));
                                    dzaVar.show();
                                    return;
                                } else if ("STARGIFT_USAGE_LIMITED".equals(tL_error2.text)) {
                                    iccVar3.a(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                                    return;
                                }
                            }
                            iccVar3.a(Boolean.FALSE, null);
                            if (tL_error2 != null) {
                                str2 = tL_error2.text;
                            } else {
                                str2 = "FAILED_SEND_STARS";
                            }
                            Y.Q(2131624012, 36, ob6.a0(null, null, 2131743533, str2)).j();
                            return;
                        }
                        Utilities.d.c(new fwa(jxaVar2, (TLRPC.TL_payments_paymentResult) tLObject2, (byte) 4));
                        jxaVar2.D = false;
                        jxaVar2.E = true;
                        jxaVar2.G = 0L;
                        jxaVar2.U();
                        jxaVar2.M(j7);
                        jxaVar2.Q(true);
                        iccVar3.a(Boolean.TRUE, null);
                        nj0 b = pj0.a(jxaVar2.a).b();
                        if (b != null && b.a(j7)) {
                            SharedPreferences.Editor edit = uc7.s1(jxaVar2.a).Y3.edit();
                            edit.putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j7, false).apply();
                        }
                        SharedPreferences.Editor edit2 = uc7.s1(jxaVar2.a).Y3.edit();
                        SharedPreferences.Editor putBoolean = edit2.putBoolean("show_gift_for_" + j7, true);
                        putBoolean.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j7, true).apply();
                        LaunchActivity launchActivity = LaunchActivity.H1;
                        if (launchActivity != null && (y16Var = launchActivity.w0) != null) {
                            y16Var.c(true);
                        }
                    }
                });
            }
        });
    }

    public final void f0(LaunchActivity launchActivity, long j, String str) {
        if (!this.e) {
            o(new z09(this, launchActivity, j, str, (byte) 8));
        } else {
            g0(launchActivity, j, str);
        }
    }

    public final void g(final TL_stars.StarGift starGift, final boolean z, final boolean z2, final long j, final TLRPC.TL_textWithEntities tL_textWithEntities, final p4a p4aVar) {
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = a.b;
        }
        final Context context2 = context;
        final vnb F = F();
        if (starGift != null && context2 != null) {
            if (!this.e) {
                o(new Runnable() {
                    @Override
                    public final void run() {
                        jxa jxaVar = jxa.this;
                        boolean z3 = jxaVar.e;
                        p4a p4aVar2 = p4aVar;
                        if (!z3) {
                            jxa.c("NO_BALANCE");
                            p4aVar2.a(Boolean.FALSE, null);
                            return;
                        }
                        jxaVar.g(starGift, z, z2, j, tL_textWithEntities, p4aVar2);
                    }
                });
                return;
            }
            final String k = wf3.k(this.a, j);
            final TLRPC.TL_inputInvoiceStarGift tL_inputInvoiceStarGift = new TLRPC.TL_inputInvoiceStarGift();
            tL_inputInvoiceStarGift.hide_name = z;
            tL_inputInvoiceStarGift.peer = uc7.s1(this.a).j1(j);
            tL_inputInvoiceStarGift.gift_id = starGift.id;
            tL_inputInvoiceStarGift.include_upgrade = z2;
            if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                tL_inputInvoiceStarGift.flags |= 2;
                tL_inputInvoiceStarGift.message = tL_textWithEntities;
            }
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject u = xw0.u(F, false);
            if (u != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGift;
            ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    final jxa jxaVar = jxa.this;
                    final p4a p4aVar2 = p4aVar;
                    final TLRPC.TL_inputInvoiceStarGift tL_inputInvoiceStarGift2 = tL_inputInvoiceStarGift;
                    final Context context3 = context2;
                    final vnb vnbVar = F;
                    final String str = k;
                    final TL_stars.StarGift starGift2 = starGift;
                    final boolean z3 = z;
                    final boolean z4 = z2;
                    final long j2 = j;
                    final TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_textWithEntities;
                    hl.c3(new Runnable() {
                        @Override
                        public final void run() {
                            String str2;
                            TLObject tLObject2 = tLObject;
                            boolean z5 = tLObject2 instanceof TLRPC.TL_payments_paymentFormStarGift;
                            final p4a p4aVar3 = p4aVar2;
                            if (!z5) {
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    str2 = "NO_PAYMENT_FORM";
                                } else {
                                    str2 = tL_error2.text;
                                }
                                jxa.c(str2);
                                p4aVar3.a(Boolean.FALSE, null);
                                return;
                            }
                            TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) tLObject2;
                            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                            tL_payments_sendStarsForm.form_id = tL_payments_paymentFormStarGift.form_id;
                            tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGift2;
                            ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStarGift.invoice.prices;
                            int size = arrayList.size();
                            int i = 0;
                            final long j3 = 0;
                            while (i < size) {
                                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i);
                                i++;
                                j3 += tL_labeledPrice.amount;
                            }
                            final jxa jxaVar2 = jxa.this;
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(jxaVar2.a);
                            final Context context4 = context3;
                            final vnb vnbVar2 = vnbVar;
                            final String str3 = str;
                            final TL_stars.StarGift starGift3 = starGift2;
                            final boolean z6 = z3;
                            final boolean z7 = z4;
                            final long j4 = j2;
                            final TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_textWithEntities2;
                            connectionsManager.sendRequest(tL_payments_sendStarsForm, new RequestDelegate() {
                                @Override
                                public final void run(final TLObject tLObject3, final TLRPC.TL_error tL_error3) {
                                    final jxa jxaVar3 = jxa.this;
                                    final p4a p4aVar4 = p4aVar3;
                                    final Context context5 = context4;
                                    final vnb vnbVar3 = vnbVar2;
                                    final long j5 = j3;
                                    final String str4 = str3;
                                    final TL_stars.StarGift starGift4 = starGift3;
                                    final boolean z8 = z6;
                                    final boolean z9 = z7;
                                    final long j6 = j4;
                                    final TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_textWithEntities3;
                                    hl.c3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            d31 Y;
                                            String str5;
                                            SpannableStringBuilder spannableStringBuilder;
                                            y16 y16Var;
                                            ?? r10;
                                            String str6;
                                            jxa jxaVar4 = jxa.this;
                                            TLObject tLObject4 = tLObject3;
                                            TLRPC.TL_error tL_error4 = tL_error3;
                                            p4a p4aVar5 = p4aVar4;
                                            Context context6 = context5;
                                            vnb vnbVar4 = vnbVar3;
                                            long j7 = j5;
                                            String str7 = str4;
                                            TL_stars.StarGift starGift5 = starGift4;
                                            boolean z10 = z8;
                                            boolean z11 = z9;
                                            long j8 = j6;
                                            TLRPC.TL_textWithEntities tL_textWithEntities5 = tL_textWithEntities4;
                                            e Q = LaunchActivity.Q();
                                            if (Q != null && Q.visibleDialog == null) {
                                                Y = d31.b0(Q);
                                            } else {
                                                Y = d31.Y();
                                            }
                                            if (!(tLObject4 instanceof TLRPC.TL_payments_paymentResult)) {
                                                if (tL_error4 != null) {
                                                    if ("BALANCE_TOO_LOW".equals(tL_error4.text)) {
                                                        if (!uc7.s1(jxaVar4.a).i5()) {
                                                            p4aVar5.a(Boolean.FALSE, null);
                                                            jxa.d0(context6, vnbVar4);
                                                            return;
                                                        }
                                                        boolean[] zArr = {false};
                                                        dza dzaVar = new dza(context6, vnbVar4, j7, 6, str7, new kwa(jxaVar4, zArr, starGift5, z10, z11, j8, tL_textWithEntities5, p4aVar5), 0L);
                                                        dzaVar.setOnDismissListener(new gf(p4aVar5, zArr, (byte) 16));
                                                        dzaVar.show();
                                                        return;
                                                    } else if ("STARGIFT_USAGE_LIMITED".equals(tL_error4.text)) {
                                                        p4aVar5.a(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                                                        return;
                                                    } else if ("STARGIFT_USER_USAGE_LIMITED".equals(tL_error4.text)) {
                                                        p4aVar5.a(Boolean.FALSE, "STARGIFT_USER_USAGE_LIMITED");
                                                        return;
                                                    }
                                                }
                                                p4aVar5.a(Boolean.FALSE, null);
                                                if (tL_error4 != null) {
                                                    str6 = tL_error4.text;
                                                } else {
                                                    str6 = "FAILED_SEND_STARS";
                                                }
                                                Y.Q(2131624012, 36, ob6.a0(null, null, 2131743533, str6)).j();
                                                return;
                                            }
                                            Utilities.d.c(new fwa(jxaVar4, (TLRPC.TL_payments_paymentResult) tLObject4, (byte) 2));
                                            jxaVar4.D = false;
                                            jxaVar4.E = true;
                                            jxaVar4.G = 0L;
                                            jxaVar4.U();
                                            jxaVar4.M(j8);
                                            jxaVar4.Q(true);
                                            p4aVar5.a(Boolean.TRUE, null);
                                            nj0 b = pj0.a(jxaVar4.a).b();
                                            if (b != null && b.a(j8)) {
                                                uc7.s1(jxaVar4.a).Y3.edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j8, false).apply();
                                            }
                                            if (starGift5 != null && starGift5.limited_per_user) {
                                                int i2 = starGift5.per_user_remains - 1;
                                                starGift5.per_user_remains = i2;
                                                spannableStringBuilder = hl.S2(ob6.H(',', "Gift2SentRemainsLimit", Math.max(0, i2)));
                                                str5 = str7;
                                            } else {
                                                str5 = str7;
                                                spannableStringBuilder = null;
                                            }
                                            if (j8 < 0) {
                                                long j9 = -j8;
                                                TLRPC.ChatFull N0 = uc7.s1(jxaVar4.a).N0(j9);
                                                if (N0 != null) {
                                                    N0.stargifts_count++;
                                                    N0.flags2 |= 262144;
                                                    uc7.s1(jxaVar4.a).b4(N0);
                                                }
                                                if (Q instanceof ProfileActivity) {
                                                    ProfileActivity profileActivity = (ProfileActivity) Q;
                                                    if (profileActivity.a() == j8) {
                                                        gr8 gr8Var = profileActivity.O;
                                                        if (gr8Var != null) {
                                                            gr8Var.N1(true);
                                                            profileActivity.O.f1(14);
                                                            r10 = 0;
                                                            profileActivity.k3(false);
                                                        } else {
                                                            r10 = 0;
                                                        }
                                                        d31 b0 = d31.b0(Q);
                                                        TLRPC.Document document = starGift5.sticker;
                                                        String M0 = ob6.M0(2131744766, null);
                                                        if (spannableStringBuilder == null) {
                                                            Object[] objArr = new Object[1];
                                                            objArr[r10] = str5;
                                                            spannableStringBuilder = hl.S2(ob6.G((int) j7, "StarsGiftCompletedChannelText", objArr));
                                                        }
                                                        b0.s(document, M0, spannableStringBuilder).k(r10);
                                                    }
                                                }
                                                Bundle bundle = new Bundle();
                                                bundle.putLong("chat_id", j9);
                                                bundle.putBoolean("open_gifts", true);
                                                ProfileActivity profileActivity2 = new ProfileActivity(bundle, null);
                                                profileActivity2.whenFullyVisible(new da7(profileActivity2, starGift5, spannableStringBuilder, j7, str5, (byte) 19));
                                                Q.presentFragment(profileActivity2);
                                            } else if ((Q instanceof zu1) && ((zu1) Q).a() == j8) {
                                                d31 b02 = d31.b0(Q);
                                                TLRPC.Document document2 = starGift5.sticker;
                                                String M02 = ob6.M0(2131744766, null);
                                                if (spannableStringBuilder == null) {
                                                    spannableStringBuilder = hl.S2(ob6.G((int) j7, "StarsGiftCompletedText", new Object[0]));
                                                }
                                                b02.s(document2, M02, spannableStringBuilder).k(true);
                                            } else {
                                                jn7 f = jn7.f(jxaVar4.a);
                                                int i3 = jn7.u;
                                                Long valueOf = Long.valueOf(j8);
                                                Boolean bool = Boolean.FALSE;
                                                f.k(i3, valueOf, bool);
                                                jn7.f(jxaVar4.a).k(jn7.t, Long.valueOf(j8), bool);
                                                zu1 ha = zu1.ha(j8);
                                                ha.whenFullyVisible(new z09(ha, starGift5, spannableStringBuilder, j7, (byte) 7));
                                                Q.presentFragment(ha);
                                            }
                                            uc7.s1(jxaVar4.a).Y3.edit().putBoolean("show_gift_for_" + j8, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j8, true).apply();
                                            LaunchActivity launchActivity = LaunchActivity.H1;
                                            if (launchActivity != null && (y16Var = launchActivity.w0) != null) {
                                                y16Var.c(true);
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

    public final void g0(LaunchActivity launchActivity, long j, String str) {
        if (m().amount < j && j > 0) {
            new dza(launchActivity, null, j, 4, str, new kc((byte) 10), 0L).show();
            return;
        }
        e S2 = LaunchActivity.S();
        if (S2 == null) {
            return;
        }
        v21 K = d31.b0(S2).K(2131624221, ob6.M0(2131744621, null), ob6.M0(2131744620, null), new osa((byte) 2));
        K.j = 5000;
        K.k(true);
    }

    public final void h0(final long j, final long j2, boolean z, final boolean z2) {
        TL_account.toggleNoPaidMessagesException togglenopaidmessagesexception = new TL_account.toggleNoPaidMessagesException();
        int i = this.a;
        togglenopaidmessagesexception.user_id = uc7.s1(i).o1(j);
        if (j2 != 0) {
            togglenopaidmessagesexception.parent_peer = uc7.s1(i).j1(j2);
        }
        togglenopaidmessagesexception.refund_charged = z;
        togglenopaidmessagesexception.require_payment = !z2;
        ConnectionsManager.getInstance(i).sendRequest(togglenopaidmessagesexception, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                hl.c3(new vd7(jxa.this, tLObject, j2, j, z2));
            }
        });
    }

    public final void i0(String str, TLRPC.ChatInvite chatInvite, icc iccVar) {
        String str2;
        if (chatInvite != null && chatInvite.subscription_pricing != null) {
            Context context = LaunchActivity.H1;
            if (context == null) {
                context = a.b;
            }
            Context context2 = context;
            vnb F = F();
            long j = chatInvite.subscription_pricing.amount;
            if (context2 != null) {
                int i = yac.t0;
                boolean[] zArr = {false};
                wwa wwaVar = new wwa(this, j, i, zArr, iccVar, context2, F, chatInvite, str);
                kba kbaVar = new kba(this, zArr, iccVar);
                nx0 h = uh9.h(1, F, context2, false);
                LinearLayout j2 = uh9.j(context2, 1);
                j2.setPadding(hl.L(16.0f), 0, hl.L(16.0f), hl.L(8.0f));
                FrameLayout frameLayout = new FrameLayout(context2);
                frameLayout.addView(new uya(context2, 40, 0), tre.c(-1.0f, -1));
                de0 de0Var = new de0(context2);
                de0Var.setRoundRadius(hl.L(80.0f));
                rb0 rb0Var = new rb0((vnb) null);
                rb0Var.r(chatInvite.color);
                String str3 = chatInvite.title;
                rb0Var.A = true;
                rb0Var.n = (byte) 0;
                rb0Var.m = false;
                rb0.a(str3, null, null, rb0Var.q);
                TLRPC.Photo photo = chatInvite.photo;
                if (photo != null) {
                    de0Var.m(jn5.i(xb4.w(photo.sizes, hl.L(80.0f), false, null, false), chatInvite.photo), "80_80", rb0Var, chatInvite);
                } else {
                    de0Var.setImageDrawable(rb0Var);
                }
                frameLayout.addView(de0Var, tre.e(80, 80, 17));
                Drawable drawable = context2.getResources().getDrawable(2131232776);
                int i2 = aob.h5;
                yob.x(frameLayout, drawable, i2, F, PorterDuff.Mode.SRC_IN);
                Drawable drawable2 = context2.getResources().getDrawable(2131232775);
                ImageView imageView = new ImageView(context2);
                imageView.setImageDrawable(drawable);
                frameLayout.addView(imageView, tre.e(26, 26, 17));
                imageView.setTranslationX(hl.L(26.0f));
                imageView.setTranslationY(hl.L(26.0f));
                imageView.setScaleX(1.2f);
                imageView.setScaleY(1.2f);
                ImageView imageView2 = new ImageView(context2);
                imageView2.setImageDrawable(drawable2);
                frameLayout.addView(imageView2, tre.e(26, 26, 17));
                imageView2.setTranslationX(hl.L(26.0f));
                imageView2.setTranslationY(hl.L(26.0f));
                cza czaVar = new cza(i, F, context2);
                iye.a(czaVar);
                czaVar.setOnClickListener(new jya(czaVar, (byte) 0));
                frameLayout.addView(czaVar, tre.d(-2, -2.0f, 53, 0.0f, 0.0f, -8.0f, 0.0f));
                j2.addView(frameLayout, tre.r(-1, 117, 7));
                TextView textView = new TextView(context2);
                textView.setTextSize(1, 20.0f);
                textView.setTypeface(hl.o());
                int i3 = aob.j5;
                ik8.x(textView, i3, F, null, 2131744669);
                textView.setGravity(17);
                TextView m = ik8.m(j2, textView, tre.t(-2, -2, 1, 0, 8, 0, 0), context2);
                m.setTextSize(1, 14.0f);
                yob.X(m, i3, F);
                TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                int i4 = tL_starsSubscriptionPricing.period;
                if (i4 == 2592000) {
                    m.setText(hl.S2(ob6.G((int) tL_starsSubscriptionPricing.amount, "StarsSubscribeText", chatInvite.title)));
                } else {
                    if (i4 == 300) {
                        str2 = "5 minutes";
                    } else {
                        str2 = "a minute";
                    }
                    m.setText(hl.S2(ob6.G((int) tL_starsSubscriptionPricing.amount, "StarsSubscribeTextTest", chatInvite.title, str2)));
                }
                m.setMaxWidth(kg5.a(m.getText(), m.getPaint()));
                m.setGravity(17);
                j2.addView(m, tre.t(-2, -2, 1, 0, 6, 0, 22));
                if (!TextUtils.isEmpty(chatInvite.about)) {
                    TextView textView2 = new TextView(context2);
                    textView2.setTextSize(1, 14.0f);
                    yob.X(textView2, i3, F);
                    textView2.setText(pv3.m(chatInvite.about, textView2.getPaint().getFontMetricsInt(), false, null, 0));
                    textView2.setGravity(17);
                    j2.addView(textView2, tre.t(-2, -2, 1, 0, 6, 0, 22));
                }
                c51 c51Var = new c51(F, context2, true);
                c51Var.i(ob6.M0(2131744678, null), false, true);
                j2.addView(c51Var, tre.o(-1, 48));
                p66 p66Var = new p66(context2, F);
                p66Var.setText(hl.N2(ob6.M0(2131744677, null), -1, 0, new xf1(context2, (byte) 19), null));
                p66Var.setGravity(17);
                p66Var.setTextSize(1, 13.0f);
                yob.X(p66Var, aob.B6, F);
                yob.G(p66Var, aob.Xc, F);
                j2.addView(p66Var, tre.t(-1, -2, 49, 14, 14, 14, 6));
                h.O = j2;
                c51Var.setOnClickListener(new lw4(wwaVar, h, c51Var, (byte) 22));
                h.setOnDismissListener(new dl8(kbaVar, (byte) 8));
                h.L(i2);
                e S2 = LaunchActivity.S();
                if (!hl.O1() && S2 != null && !hl.s1(S2)) {
                    h.X(S2);
                }
                h.show();
            }
        }
    }

    public final void j0(TL_stars.StarsAmount starsAmount) {
        boolean equals = this.f.equals(starsAmount);
        int i = jn7.A3;
        int i2 = this.a;
        if (!equals) {
            this.f = starsAmount;
            this.g = 0L;
            jn7.f(i2).k(i, new Object[0]);
        } else if (this.g != 0) {
            this.g = 0L;
            jn7.f(i2).k(i, new Object[0]);
        }
    }

    public final TL_stars.SavedStarGift k(long j) {
        TL_stars.StarGift starGift;
        int i = 0;
        while (true) {
            LongSparseArray longSparseArray = this.L;
            if (i < longSparseArray.size()) {
                axa axaVar = (axa) longSparseArray.valueAt(i);
                for (int i2 = 0; i2 < axaVar.l.size(); i2++) {
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) axaVar.l.get(i2);
                    if (savedStarGift != null && (starGift = savedStarGift.gift) != null && starGift.id == j) {
                        return savedStarGift;
                    }
                }
                i++;
            } else {
                return null;
            }
        }
    }

    public final void k0(final r47 r47Var, final long j, final Runnable runnable, final boolean z) {
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia;
        if (r47Var == null) {
            runnable.run();
            return;
        }
        final long B0 = r47.B0(r47Var.k);
        final int e1 = r47Var.e1();
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia2 = (TLRPC.TL_messageMediaPaidMedia) r47Var.k.media;
        TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
        int i = this.a;
        tL_messages_editMessage.peer = uc7.s1(i).j1(B0);
        int i2 = tL_messages_editMessage.flags;
        tL_messages_editMessage.flags = 32768 | i2;
        tL_messages_editMessage.schedule_date = r47Var.k.date;
        tL_messages_editMessage.id = e1;
        tL_messages_editMessage.flags = i2 | 49152;
        TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia = new TLRPC.TL_inputMediaPaidMedia();
        tL_inputMediaPaidMedia.stars_amount = j;
        int i3 = 0;
        while (i3 < tL_messageMediaPaidMedia2.extended_media.size()) {
            TLRPC.MessageExtendedMedia messageExtendedMedia = tL_messageMediaPaidMedia2.extended_media.get(i3);
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
                tL_inputPhoto.id = photo.id;
                tL_inputPhoto.access_hash = photo.access_hash;
                tL_inputPhoto.file_reference = photo.file_reference;
                tL_inputMediaPhoto.id = tL_inputPhoto;
                tL_inputMediaPaidMedia.extended_media.add(tL_inputMediaPhoto);
            } else {
                tL_messageMediaPaidMedia = tL_messageMediaPaidMedia2;
                if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument = new TLRPC.TL_inputMediaDocument();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) messageMedia).document;
                    tL_inputDocument.id = document.id;
                    tL_inputDocument.access_hash = document.access_hash;
                    tL_inputDocument.file_reference = document.file_reference;
                    tL_inputMediaDocument.id = tL_inputDocument;
                    tL_inputMediaPaidMedia.extended_media.add(tL_inputMediaDocument);
                }
            }
            i3++;
            tL_messageMediaPaidMedia2 = tL_messageMediaPaidMedia;
        }
        tL_messages_editMessage.media = tL_inputMediaPaidMedia;
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_editMessage, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                hl.c3(new zc7(jxa.this, tLObject, runnable, tL_error, z, B0, e1, r47Var, j));
            }
        });
    }

    public final TL_stars.StarsAmount m() {
        return n(null, true, false);
    }

    public final TL_stars.StarsAmount n(Runnable runnable, boolean z, boolean z2) {
        if (((!this.e || System.currentTimeMillis() - this.c > 60000) && !this.d) || z2) {
            this.d = true;
            TL_stars.TL_payments_getStarsStatus tL_payments_getStarsStatus = new TL_stars.TL_payments_getStarsStatus();
            tL_payments_getStarsStatus.ton = this.b;
            tL_payments_getStarsStatus.peer = new TLRPC.TL_inputPeerSelf();
            ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getStarsStatus, new isa(this, runnable, (byte) 2));
        }
        if (z && this.g > 0) {
            oj n = oj.n(this.f);
            return oj.h(Math.max(0L, n.a() - this.g), n.a).q();
        }
        return this.f;
    }

    public final void o(Runnable runnable) {
        n(runnable, true, false);
    }

    public final oj p() {
        pj pjVar;
        oj m = oj.m(m());
        if (m == null) {
            if (this.b) {
                pjVar = pj.b;
            } else {
                pjVar = pj.a;
            }
            return oj.j(0L, pjVar);
        }
        return m;
    }

    public final ArrayList r() {
        if (!this.k && !this.l) {
            this.k = true;
            ConnectionsManager.getInstance(this.a).sendRequest(new TL_stars.TL_payments_getStarsGiftOptions(), new lwa(this, (byte) 3));
            return this.m;
        }
        return this.m;
    }

    public final ArrayList s() {
        if (!this.n && !this.o) {
            this.n = true;
            ConnectionsManager.getInstance(this.a).sendRequest(new TL_stars.TL_payments_getStarsGiveawayOptions(), new lwa(this, (byte) 4));
            return this.p;
        }
        return this.p;
    }

    public final ArrayList w() {
        if (!this.h && !this.i) {
            this.h = true;
            ConnectionsManager.getInstance(this.a).sendRequest(new TL_stars.TL_payments_getStarsTopupOptions(), new lwa(this, (byte) 1));
            return this.j;
        }
        return this.j;
    }

    public final long x(r47 r47Var) {
        Long z1;
        Long l;
        hxa hxaVar = this.B;
        if (hxaVar != null && hxaVar.a.equals(cxa.b(r47Var)) && (l = this.B.n) != null) {
            return l.longValue();
        }
        if (r47Var == null) {
            z1 = null;
        } else {
            z1 = r47Var.z1();
        }
        if (z1 != null) {
            return z1.longValue();
        }
        Long x1 = uc7.s1(this.a).x1();
        if (x1 != null) {
            return x1.longValue();
        }
        return 0L;
    }

    public final long y(cxa cxaVar, TLRPC.TL_messageReactions tL_messageReactions) {
        ArrayList<TLRPC.MessageReactor> arrayList;
        Long l;
        hxa hxaVar = this.B;
        if (hxaVar != null && hxaVar.a.equals(cxaVar) && (l = this.B.n) != null) {
            return l.longValue();
        }
        Long l2 = null;
        if (tL_messageReactions != null && (arrayList = tL_messageReactions.top_reactors) != null) {
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                TLRPC.MessageReactor messageReactor = arrayList.get(i);
                i++;
                TLRPC.MessageReactor messageReactor2 = messageReactor;
                if (messageReactor2 != null && messageReactor2.my) {
                    if (messageReactor2.anonymous) {
                        l2 = 2666000L;
                        break;
                    }
                    TLRPC.Peer peer = messageReactor2.peer_id;
                    if (peer != null) {
                        l2 = Long.valueOf(wf3.n(peer));
                        break;
                    }
                }
            }
        }
        if (l2 != null) {
            return l2.longValue();
        }
        Long x1 = uc7.s1(this.a).x1();
        if (x1 != null) {
            return x1.longValue();
        }
        return 0L;
    }

    public final void z(long j, long j2, pcc pccVar) {
        TL_account.getPaidMessagesRevenue getpaidmessagesrevenue = new TL_account.getPaidMessagesRevenue();
        int i = this.a;
        getpaidmessagesrevenue.user_id = uc7.s1(i).o1(j);
        if (j2 != 0) {
            getpaidmessagesrevenue.parent_peer = uc7.s1(i).j1(j2);
        }
        ConnectionsManager.getInstance(i).sendRequest(getpaidmessagesrevenue, new ug1(pccVar, (byte) 2));
    }
}
