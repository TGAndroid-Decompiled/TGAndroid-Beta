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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class gta {
    public static volatile gta[][] S = (gta[][]) Array.newInstance(gta.class, 2, 4);
    public static final Object[][] T = (Object[][]) Array.newInstance(Object.class, 2, 4);
    public boolean A;
    public eta B;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public long G;
    public bta N;
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

    public gta(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public static wjb F() {
        d S2 = LaunchActivity.S();
        if (S2 != null) {
            return S2.getResourceProvider();
        }
        return null;
    }

    public static gta I(int i) {
        return v(i, true);
    }

    public static boolean Q(int i, nj njVar) {
        if (njVar == null || u(i, njVar.a).p().b >= njVar.b) {
            return true;
        }
        return false;
    }

    public static void c(String str) {
        u21 Y;
        d Q = LaunchActivity.Q();
        if (Q != null && Q.visibleDialog == null) {
            Y = u21.b0(Q);
        } else {
            Y = u21.Y();
        }
        Y.Q(2131624012, 36, u21.W(str)).j();
    }

    public static void c0(Context context, wjb wjbVar) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, context);
        String M0 = k96.M0(2131744823, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        hdVar.U = k96.M0(2131744824, null);
        b00.t(null, 2131747638, alertDialog$Builder, null);
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

    public static Context q(d dVar) {
        if (dVar != null && dVar.getContext() != null) {
            return dVar.getContext();
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

    public static gta t(int i) {
        return v(i, false);
    }

    public static gta u(int i, oj ojVar) {
        boolean z;
        if (ojVar == oj.b) {
            z = true;
        } else {
            z = false;
        }
        return v(i, z);
    }

    public static gta v(int i, boolean z) {
        gta gtaVar;
        gta gtaVar2 = S[z ? 1 : 0][i];
        if (gtaVar2 == null) {
            synchronized (T[z ? 1 : 0][i]) {
                gtaVar = S[z ? 1 : 0][i];
                if (gtaVar == null) {
                    gta[] gtaVarArr = S[z ? 1 : 0];
                    gta gtaVar3 = new gta(i, z);
                    gtaVarArr[i] = gtaVar3;
                    gtaVar = gtaVar3;
                }
            }
            return gtaVar;
        }
        return gtaVar2;
    }

    public final long A(int i, long j) {
        eta etaVar = this.B;
        if (etaVar != null) {
            zsa zsaVar = etaVar.a;
            if (zsaVar.a == j && zsaVar.b == i && etaVar.l) {
                return etaVar.h;
            }
            return 0L;
        }
        return 0L;
    }

    public final long B(k27 k27Var) {
        TLRPC.Message message;
        if (k27Var != null && (message = k27Var.k) != null) {
            if ((message.isThreadMessage || k27Var.k3()) && k27Var.k.fwd_from != null) {
                return A(k27Var.k.fwd_from.saved_from_msg_id, k27Var.Z0());
            }
            return A(k27Var.e1(), k27.B0(k27Var.k));
        }
        return 0L;
    }

    public final wsa C(long j, boolean z) {
        LongSparseArray longSparseArray = this.K;
        wsa wsaVar = (wsa) longSparseArray.get(j);
        if (wsaVar == null && z) {
            wsa wsaVar2 = new wsa(this.a, j);
            longSparseArray.put(j, wsaVar2);
            return wsaVar2;
        }
        return wsaVar;
    }

    public final xsa D(long j, boolean z) {
        LongSparseArray longSparseArray = this.L;
        xsa xsaVar = (xsa) longSparseArray.get(j);
        if (xsaVar == null && z) {
            xsa xsaVar2 = new xsa(this.a, j, true);
            longSparseArray.put(j, xsaVar2);
            return xsaVar2;
        }
        return xsaVar;
    }

    public final void E(TL_stars.StarGift starGift, long j, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z, p8c p8cVar) {
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = a.b;
        }
        wjb F = F();
        if (starGift != null && context != null) {
            if (!this.e) {
                o(new ms0(this, p8cVar, starGift, j, tL_textWithEntities, z, (byte) 7));
                return;
            }
            TLRPC.TL_inputInvoiceStarGiftResale tL_inputInvoiceStarGiftResale = new TLRPC.TL_inputInvoiceStarGiftResale();
            tL_inputInvoiceStarGiftResale.slug = starGift.slug;
            tL_inputInvoiceStarGiftResale.to_id = na7.q1(this.a).h1(j);
            tL_inputInvoiceStarGiftResale.ton = this.b;
            tL_inputInvoiceStarGiftResale.message = tL_textWithEntities;
            tL_inputInvoiceStarGiftResale.show_name = !z;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject u = ow0.u(F, false);
            if (u != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftResale;
            ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new apa(this, p8cVar, (byte) 1));
        }
    }

    public final TL_stars.StarGift G(long j) {
        T();
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

    public final void H(long j, p8c p8cVar) {
        TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) this.M.get(Long.valueOf(j));
        if (stargiftupgradepreview != null) {
            p8cVar.a(stargiftupgradepreview);
            return;
        }
        TL_stars.getStarGiftUpgradePreview getstargiftupgradepreview = new TL_stars.getStarGiftUpgradePreview();
        getstargiftupgradepreview.gift_id = j;
        ConnectionsManager.getInstance(this.a).sendRequest(getstargiftupgradepreview, new w47(this, j, p8cVar, (byte) 16));
    }

    public final void J(TL_stars.InputSavedStarGift inputSavedStarGift, p8c p8cVar) {
        hd hdVar = new hd(3, null, a.b);
        hdVar.q(200L);
        TL_stars.getSavedStarGift getsavedstargift = new TL_stars.getSavedStarGift();
        getsavedstargift.stargift.add(inputSavedStarGift);
        ConnectionsManager.getInstance(this.a).sendRequest(getsavedstargift, new rt0(this, hdVar, inputSavedStarGift, p8cVar, (byte) 22));
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
        xsa D = D(j, false);
        if (D != null) {
            D.k(false);
        }
        wsa wsaVar = (wsa) this.K.get(j);
        if (wsaVar != null) {
            wsaVar.g();
        }
    }

    public final void N(TLRPC.UserFull userFull) {
        if (userFull != null) {
            long j = userFull.id;
            xsa D = D(j, false);
            if (D != null && D.n != userFull.stargifts_count) {
                D.k(false);
            }
            wsa wsaVar = (wsa) this.K.get(j);
            if (wsaVar != null) {
                wsaVar.g();
            }
        }
    }

    public final void O() {
        if (this.x) {
            return;
        }
        this.v.clear();
        this.w = null;
        this.x = false;
        this.y = false;
        U();
    }

    public final void P(boolean z) {
        for (int i = 0; i < 3; i++) {
            boolean[] zArr = this.t;
            if (!zArr[i]) {
                this.q[i].clear();
                this.s[i] = null;
                zArr[i] = false;
                this.u[i] = false;
                if (z) {
                    V(i);
                }
            }
        }
    }

    public final void R(ArrayList arrayList, Integer num, Long l, ArrayList arrayList2, ArrayList arrayList3) {
        int i = this.a;
        na7.q1(i).a4(arrayList2, true);
        na7.q1(i).U3(arrayList3, true);
        this.E = true;
        ArrayList arrayList4 = this.H;
        arrayList4.clear();
        arrayList4.addAll(arrayList);
        ArrayList arrayList5 = this.J;
        arrayList5.clear();
        arrayList5.addAll(arrayList4);
        Collections.sort(arrayList5, Comparator$EL.thenComparingInt(Comparator$CC.comparingInt(new mm((byte) 14)), new mm((byte) 15)));
        ArrayList arrayList6 = this.I;
        arrayList6.clear();
        arrayList6.addAll(arrayList4);
        Collections.sort(arrayList6, Comparator$CC.comparingInt(new mm((byte) 16)));
        this.F = num.intValue();
        this.G = l.longValue();
        this.C = false;
        kk7.f(i).k(kk7.G3, new Object[0]);
        T();
    }

    public final void S(TL_stars.StarGifts starGifts) {
        this.C = false;
        this.D = true;
        boolean z = starGifts instanceof TL_stars.TL_starGifts;
        int i = this.a;
        ArrayList arrayList = this.H;
        if (z) {
            TL_stars.TL_starGifts tL_starGifts = (TL_stars.TL_starGifts) starGifts;
            na7.q1(i).a4(tL_starGifts.users, false);
            na7.q1(i).U3(tL_starGifts.chats, false);
            ad7.Y(i).j1(tL_starGifts.users, tL_starGifts.chats, true, true);
            arrayList.clear();
            arrayList.addAll(tL_starGifts.gifts);
            ArrayList arrayList2 = this.J;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            Collections.sort(arrayList2, Comparator$EL.thenComparingInt(Comparator$CC.comparingInt(new mm((byte) 17)), new mm((byte) 18)));
            ArrayList arrayList3 = this.I;
            arrayList3.clear();
            arrayList3.addAll(arrayList);
            Collections.sort(arrayList3, Comparator$CC.comparingInt(new mm((byte) 19)));
            this.F = tL_starGifts.hash;
            this.G = System.currentTimeMillis();
            kk7.f(i).k(kk7.G3, new Object[0]);
            ArrayList<TL_stars.StarGift> arrayList4 = tL_starGifts.gifts;
            int i2 = this.F;
            long j = this.G;
            ad7 Y = ad7.Y(i);
            Y.a.c(new lb7(Y, arrayList4, i2, j));
        } else if (starGifts instanceof TL_stars.TL_starGiftsNotModified) {
            int i3 = this.F;
            long currentTimeMillis = System.currentTimeMillis();
            this.G = currentTimeMillis;
            ad7 Y2 = ad7.Y(i);
            Y2.a.c(new lb7(Y2, arrayList, i3, currentTimeMillis));
        }
    }

    public final void T() {
        if (!this.C) {
            if (!this.D || System.currentTimeMillis() - this.G >= 60000) {
                this.C = true;
                boolean z = this.E;
                int i = this.a;
                if (!z) {
                    wh9 wh9Var = new wh9(this, (byte) 23);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    ad7 Y = ad7.Y(i);
                    Y.a.c(new ex7(Y, arrayList3, arrayList2, arrayList, wh9Var, (byte) 26));
                    return;
                }
                int i2 = this.F;
                ae9 ae9Var = new ae9(this, (byte) 10);
                TL_stars.getStarGifts getstargifts = new TL_stars.getStarGifts();
                getstargifts.hash = i2;
                ConnectionsManager.getInstance(i).sendRequest(getstargifts, new wx9(ae9Var, (byte) 2));
            }
        }
    }

    public final void U() {
        if (!this.b && !this.x && !this.y) {
            this.x = true;
            TL_stars.TL_getStarsSubscriptions tL_getStarsSubscriptions = new TL_stars.TL_getStarsSubscriptions();
            tL_getStarsSubscriptions.peer = new TLRPC.TL_inputPeerSelf();
            String str = this.w;
            tL_getStarsSubscriptions.offset = str;
            if (str == null) {
                tL_getStarsSubscriptions.offset = "";
            }
            ConnectionsManager.getInstance(this.a).sendRequest(tL_getStarsSubscriptions, new hsa(this, (byte) 1));
        }
    }

    public final void V(int i) {
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
            ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getStarsTransactions, new l12(this, i, (byte) 6));
        }
    }

    public final void W(defpackage.k27 r38, org.telegram.tgnet.TLRPC.InputInvoice r39, org.telegram.tgnet.TLRPC.TL_payments_paymentFormStars r40, java.lang.Runnable r41, defpackage.p8c r42) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gta.W(k27, org.telegram.tgnet.TLRPC$InputInvoice, org.telegram.tgnet.TLRPC$TL_payments_paymentFormStars, java.lang.Runnable, p8c):void");
    }

    public final void X(final k27 k27Var, final TLRPC.InputInvoice inputInvoice, final TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, final p8c p8cVar) {
        long j;
        String str;
        TLRPC.User V1;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        if (tL_payments_paymentFormStars != null) {
            final Context context = a.b;
            final wjb F = F();
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
            if (k27Var != null) {
                TLRPC.Message message = k27Var.k;
                if (message != null && (messageFwdHeader = message.fwd_from) != null && (peer = messageFwdHeader.from_id) != null) {
                    j = cf3.n(peer);
                } else {
                    j = k27.B0(message);
                }
                if (j < 0 && k27Var.Z0() > 0 && (V1 = na7.q1(this.a).V1(Long.valueOf(k27Var.Z0()))) != null && V1.bot) {
                    j = V1.id;
                }
            } else {
                j = tL_payments_paymentFormStars.bot_id;
            }
            final long j3 = j;
            int i2 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
            int i3 = this.a;
            if (i2 >= 0) {
                str = l7c.q(na7.q1(i3).V1(Long.valueOf(j3)));
            } else {
                TLRPC.Chat K0 = na7.q1(i3).K0(Long.valueOf(-j3));
                if (K0 == null) {
                    str = "";
                } else {
                    str = K0.title;
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
                    final gta gtaVar = gta.this;
                    final p8c p8cVar2 = p8cVar;
                    final k27 k27Var2 = k27Var;
                    final Context context2 = context;
                    final long j4 = j2;
                    final String str4 = str2;
                    final int i5 = i4;
                    final String str5 = str3;
                    final TLRPC.InputInvoice inputInvoice2 = inputInvoice;
                    final long j5 = j3;
                    final wjb wjbVar = F;
                    final TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars2 = tL_payments_paymentFormStars;
                    gl.d3(new Runnable() {
                        @Override
                        public final void run() {
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.wra.run():void");
                        }
                    });
                }
            });
        }
    }

    public final void Y(String str, TLRPC.ChatInvite chatInvite, i8c i8cVar) {
        if (chatInvite != null && chatInvite.subscription_pricing != null) {
            Context context = a.b;
            wjb F = F();
            if (context != null) {
                long j = chatInvite.subscription_pricing.amount;
                String str2 = chatInvite.title;
                TLRPC.TL_inputInvoiceChatInviteSubscription tL_inputInvoiceChatInviteSubscription = new TLRPC.TL_inputInvoiceChatInviteSubscription();
                tL_inputInvoiceChatInviteSubscription.hash = str;
                TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                tL_payments_sendStarsForm.form_id = chatInvite.subscription_form_id;
                tL_payments_sendStarsForm.invoice = tL_inputInvoiceChatInviteSubscription;
                ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_sendStarsForm, new j77(this, i8cVar, j, str2, context, F, chatInvite, str));
            }
        }
    }

    public final void Z(long j, long j2, boolean z) {
        int i = this.a;
        pub pubVar = na7.q1(i).g4;
        TLRPC.TL_forumTopic f = pubVar.f(j, j2);
        if (f != null) {
            f.nopaid_messages_exception = z;
            vf6 vf6Var = pubVar.a;
            if (((ArrayList) vf6Var.f(j)) != null) {
                pubVar.getMessagesStorage().z1(pubVar.getConnectionsManager().getCurrentTime(), -j, (List) vf6Var.f(j), true);
            }
            kk7.f(i).k(kk7.P3, Long.valueOf(j2));
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
            int e1 = ((k27) obj).e1();
            hashSet.add(Integer.valueOf(e1));
            if (this.Q.remove(Integer.valueOf(e1))) {
                this.R.put(Integer.valueOf(e1), new q3a(this, hashSet, runnable, (byte) 21));
                z = true;
            }
        }
        return !z;
    }

    public final void a0(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        if (tL_starGiftUnique != null && !TextUtils.isEmpty(tL_starGiftUnique.slug)) {
            int i = 0;
            int i2 = 0;
            while (true) {
                LongSparseArray longSparseArray = this.L;
                if (i2 >= longSparseArray.size()) {
                    break;
                }
                ((xsa) longSparseArray.valueAt(i2)).o(tL_starGiftUnique);
                i2++;
            }
            while (true) {
                LongSparseArray longSparseArray2 = this.K;
                if (i < longSparseArray2.size()) {
                    wsa wsaVar = (wsa) longSparseArray2.valueAt(i);
                    xsa xsaVar = wsaVar.g;
                    if (xsaVar != null) {
                        xsaVar.o(tL_starGiftUnique);
                    }
                    for (xsa xsaVar2 : wsaVar.h.values()) {
                        xsaVar2.o(tL_starGiftUnique);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void b(defpackage.k27 r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gta.b(k27):void");
    }

    public final defpackage.eta b0(final defpackage.k27 r20, final defpackage.mu1 r21, final long r22, boolean r24, boolean r25, final java.lang.Long r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gta.b0(k27, mu1, long, boolean, boolean, java.lang.Long):eta");
    }

    public final void d(Activity activity, TL_stars.TL_starsTopupOption tL_starsTopupOption, i8c i8cVar, TLRPC.InputPeer inputPeer) {
        boolean z;
        int i = this.a;
        if (activity == null) {
            return;
        }
        if (!na7.q1(i).Z4()) {
            d Q = LaunchActivity.Q();
            if (Q != null && Q.getContext() != null) {
                c0(Q.getContext(), Q.getResourceProvider());
                return;
            } else {
                c0(activity, null);
                return;
            }
        }
        if (na7.q1(this.a).k4.l0.f && inputPeer != null) {
            z = true;
        } else {
            z = false;
        }
        if ((w01.b() || !ci0.h().j()) && !z) {
            TLRPC.TL_inputStorePaymentStarsTopup tL_inputStorePaymentStarsTopup = new TLRPC.TL_inputStorePaymentStarsTopup();
            tL_inputStorePaymentStarsTopup.stars = tL_starsTopupOption.stars;
            tL_inputStorePaymentStarsTopup.amount = tL_starsTopupOption.amount;
            tL_inputStorePaymentStarsTopup.currency = tL_starsTopupOption.currency;
            tL_inputStorePaymentStarsTopup.spend_purpose_peer = inputPeer;
            TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
            tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsTopup;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject u = ow0.u(F(), false);
            if (u != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
            ConnectionsManager.getInstance(i).sendRequest(tL_payments_getPaymentForm, new ck8(this, i8cVar, tL_inputInvoiceStars, (byte) 17));
        } else if (!ci0.h().j()) {
            i8cVar.a(Boolean.FALSE, "INVOICE DISABLED");
        } else {
            TLRPC.TL_inputStorePaymentStarsTopup tL_inputStorePaymentStarsTopup2 = new TLRPC.TL_inputStorePaymentStarsTopup();
            tL_inputStorePaymentStarsTopup2.stars = tL_starsTopupOption.stars;
            tL_inputStorePaymentStarsTopup2.currency = tL_starsTopupOption.currency;
            tL_inputStorePaymentStarsTopup2.amount = tL_starsTopupOption.amount;
            ?? obj = new Object();
            obj.b = "inapp";
            obj.a = tL_starsTopupOption.store_product;
            yw8 a = obj.a();
            fa4.b("StarsController.buy starts queryProductDetails");
            ci0.h().o(Arrays.asList(a), new lt(i8cVar, tL_inputStorePaymentStarsTopup2, tL_starsTopupOption, activity, (byte) 22));
        }
    }

    public final void d0(List list) {
        if (list != null && !list.isEmpty()) {
            k27 k27Var = (k27) list.get(0);
            long B0 = k27.B0(k27Var.k);
            int i = (B0 > 0L ? 1 : (B0 == 0L ? 0 : -1));
            int i2 = this.a;
            if (i >= 0) {
                na7.q1(i2).Y2(na7.q1(i2).V1(Long.valueOf(B0)), 0, true, null);
            } else {
                na7.q1(i2).X2(0, -B0, true);
            }
            u21.b0(LaunchActivity.S()).Q(2131624012, 36, jva.S0(TextUtils.concat(k96.G((int) k27Var.k.errorAllowedPriceStars, "PaidMessagesSendErrorToast1", new Object[0]), " ", k96.G((int) k27Var.k.errorNewPriceStars, "PaidMessagesSendErrorToast2", new Object[0])))).j();
        }
    }

    public final void e(final long j, final TLObject tLObject, final TLRPC.TL_textWithEntities tL_textWithEntities, final i8c i8cVar) {
        int i;
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = a.b;
        }
        final Context context2 = context;
        final wjb F = F();
        boolean z = tLObject instanceof TLRPC.TL_premiumGiftOption;
        if ((z || (tLObject instanceof TLRPC.TL_premiumGiftCodeOption)) && context2 != null) {
            if (!this.e) {
                o(new o77(this, i8cVar, j, tLObject, tL_textWithEntities, (byte) 17));
                return;
            }
            if (z) {
                i = ((TLRPC.TL_premiumGiftOption) tLObject).months;
            } else if (tLObject instanceof TLRPC.TL_premiumGiftCodeOption) {
                i = ((TLRPC.TL_premiumGiftCodeOption) tLObject).months;
            } else {
                return;
            }
            final String k = cf3.k(this.a, j);
            final TLRPC.TL_inputInvoicePremiumGiftStars tL_inputInvoicePremiumGiftStars = new TLRPC.TL_inputInvoicePremiumGiftStars();
            tL_inputInvoicePremiumGiftStars.user_id = na7.q1(this.a).m1(j);
            tL_inputInvoicePremiumGiftStars.months = i;
            if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                tL_inputInvoicePremiumGiftStars.flags |= 1;
                tL_inputInvoicePremiumGiftStars.message = tL_textWithEntities;
            }
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject u = ow0.u(F, false);
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
                    final gta gtaVar = gta.this;
                    final i8c i8cVar2 = i8cVar;
                    final TLRPC.TL_inputInvoicePremiumGiftStars tL_inputInvoicePremiumGiftStars2 = tL_inputInvoicePremiumGiftStars;
                    final Context context3 = context2;
                    final wjb wjbVar = F;
                    final String str = k;
                    final long j2 = j;
                    final TLObject tLObject3 = tLObject;
                    final TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_textWithEntities;
                    gl.d3(new Runnable() {
                        @Override
                        public final void run() {
                            String str2;
                            TLObject tLObject4 = tLObject2;
                            boolean z2 = tLObject4 instanceof TLRPC.TL_payments_paymentFormStars;
                            final i8c i8cVar3 = i8cVar2;
                            if (!z2) {
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    str2 = "NO_PAYMENT_FORM";
                                } else {
                                    str2 = tL_error2.text;
                                }
                                gta.c(str2);
                                i8cVar3.a(Boolean.FALSE, null);
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
                            final gta gtaVar2 = gta.this;
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(gtaVar2.a);
                            final Context context4 = context3;
                            final wjb wjbVar2 = wjbVar;
                            final String str3 = str;
                            final long j4 = j2;
                            final TLObject tLObject5 = tLObject3;
                            final TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_textWithEntities2;
                            connectionsManager.sendRequest(tL_payments_sendStarsForm, new RequestDelegate() {
                                @Override
                                public final void run(final TLObject tLObject6, final TLRPC.TL_error tL_error3) {
                                    final gta gtaVar3 = gta.this;
                                    final i8c i8cVar4 = i8cVar3;
                                    final Context context5 = context4;
                                    final wjb wjbVar3 = wjbVar2;
                                    final long j5 = j3;
                                    final String str4 = str3;
                                    final long j6 = j4;
                                    final TLObject tLObject7 = tLObject5;
                                    final TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_textWithEntities3;
                                    gl.d3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            u21 Y;
                                            vz5 vz5Var;
                                            int i3;
                                            String str5;
                                            gta gtaVar4 = gta.this;
                                            TLObject tLObject8 = tLObject6;
                                            TLRPC.TL_error tL_error4 = tL_error3;
                                            i8c i8cVar5 = i8cVar4;
                                            Context context6 = context5;
                                            wjb wjbVar4 = wjbVar3;
                                            long j7 = j5;
                                            String str6 = str4;
                                            long j8 = j6;
                                            TLObject tLObject9 = tLObject7;
                                            TLRPC.TL_textWithEntities tL_textWithEntities5 = tL_textWithEntities4;
                                            d Q = LaunchActivity.Q();
                                            if (Q != null && Q.visibleDialog == null) {
                                                Y = u21.b0(Q);
                                            } else {
                                                Y = u21.Y();
                                            }
                                            if (!(tLObject8 instanceof TLRPC.TL_payments_paymentResult)) {
                                                if (tL_error4 != null) {
                                                    if ("BALANCE_TOO_LOW".equals(tL_error4.text)) {
                                                        if (!na7.q1(gtaVar4.a).Z4()) {
                                                            i8cVar5.a(Boolean.FALSE, null);
                                                            gta.c0(context6, wjbVar4);
                                                            return;
                                                        }
                                                        boolean[] zArr = {false};
                                                        zua zuaVar = new zua(context6, wjbVar4, j7, 6, str6, new fl1(gtaVar4, zArr, j8, tLObject9, tL_textWithEntities5, i8cVar5, (byte) 4), 0L);
                                                        zuaVar.setOnDismissListener(new csa((byte) 1, i8cVar5, zArr));
                                                        zuaVar.show();
                                                        return;
                                                    }
                                                    i3 = 1;
                                                    if ("STARGIFT_USAGE_LIMITED".equals(tL_error4.text)) {
                                                        i8cVar5.a(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                                                        return;
                                                    }
                                                } else {
                                                    i3 = 1;
                                                }
                                                i8cVar5.a(Boolean.FALSE, null);
                                                if (tL_error4 != null) {
                                                    str5 = tL_error4.text;
                                                } else {
                                                    str5 = "FAILED_SEND_STARS";
                                                }
                                                Object[] objArr = new Object[i3];
                                                objArr[0] = str5;
                                                Y.Q(2131624012, 36, k96.a0(null, null, 2131743639, objArr)).j();
                                                return;
                                            }
                                            Utilities.d.c(new bsa(gtaVar4, (TLRPC.TL_payments_paymentResult) tLObject8, (byte) 3));
                                            gtaVar4.P(true);
                                            i8cVar5.a(Boolean.TRUE, null);
                                            mj0 b = oj0.a(gtaVar4.a).b();
                                            if (b != null && b.a(j8)) {
                                                na7.q1(gtaVar4.a).X3.edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j8, false).apply();
                                            }
                                            na7.q1(gtaVar4.a).X3.edit().putBoolean("show_gift_for_" + j8, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j8, true).apply();
                                            LaunchActivity launchActivity = LaunchActivity.H1;
                                            if (launchActivity != null && (vz5Var = launchActivity.w0) != null) {
                                                vz5Var.c(true);
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

    public final void e0(LaunchActivity launchActivity, long j, String str) {
        if (!this.e) {
            o(new mx8(this, launchActivity, j, str, (byte) 8));
        } else {
            f0(launchActivity, j, str);
        }
    }

    public final void f(final TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, final TL_stars.StarGift starGift, final long j, final TLRPC.TL_textWithEntities tL_textWithEntities, final boolean z, final i8c i8cVar) {
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = a.b;
        }
        final Context context2 = context;
        final wjb F = F();
        if (context2 == null) {
            return;
        }
        if (!this.e) {
            o(new ks0(this, i8cVar, tL_payments_paymentFormStarGift, starGift, j, tL_textWithEntities, z));
            return;
        }
        final String k = cf3.k(this.a, j);
        TLRPC.TL_inputInvoiceStarGiftResale tL_inputInvoiceStarGiftResale = new TLRPC.TL_inputInvoiceStarGiftResale();
        tL_inputInvoiceStarGiftResale.slug = starGift.slug;
        tL_inputInvoiceStarGiftResale.to_id = na7.q1(this.a).h1(j);
        tL_inputInvoiceStarGiftResale.ton = this.b;
        tL_inputInvoiceStarGiftResale.message = tL_textWithEntities;
        tL_inputInvoiceStarGiftResale.show_name = !z;
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        JSONObject u = ow0.u(F, false);
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
                final gta gtaVar = gta.this;
                final i8c i8cVar2 = i8cVar;
                final Context context3 = context2;
                final wjb wjbVar = F;
                final long j4 = j3;
                final String str = k;
                final TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift2 = tL_payments_paymentFormStarGift;
                final TL_stars.StarGift starGift2 = starGift;
                final long j5 = j;
                final TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_textWithEntities;
                final boolean z2 = z;
                gl.d3(new Runnable() {
                    @Override
                    public final void run() {
                        u21 Y;
                        vz5 vz5Var;
                        String str2;
                        final gta gtaVar2 = gta.this;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        final i8c i8cVar3 = i8cVar2;
                        Context context4 = context3;
                        wjb wjbVar2 = wjbVar;
                        long j6 = j4;
                        String str3 = str;
                        final TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift3 = tL_payments_paymentFormStarGift2;
                        final TL_stars.StarGift starGift3 = starGift2;
                        final long j7 = j5;
                        final TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_textWithEntities2;
                        final boolean z3 = z2;
                        d Q = LaunchActivity.Q();
                        if (Q != null && Q.visibleDialog == null) {
                            Y = u21.b0(Q);
                        } else {
                            Y = u21.Y();
                        }
                        if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                            if (tL_error2 != null) {
                                if ("BALANCE_TOO_LOW".equals(tL_error2.text)) {
                                    if (!na7.q1(gtaVar2.a).Z4()) {
                                        i8cVar3.a(Boolean.FALSE, null);
                                        gta.c0(context4, wjbVar2);
                                        return;
                                    }
                                    final boolean[] zArr = {false};
                                    zua zuaVar = new zua(context4, wjbVar2, j6, 6, str3, new Runnable() {
                                        @Override
                                        public final void run() {
                                            zArr[0] = true;
                                            gta.this.f(tL_payments_paymentFormStarGift3, starGift3, j7, tL_textWithEntities3, z3, i8cVar3);
                                        }
                                    }, 0L);
                                    zuaVar.setOnDismissListener(new csa((byte) 2, i8cVar3, zArr));
                                    zuaVar.show();
                                    return;
                                } else if ("STARGIFT_USAGE_LIMITED".equals(tL_error2.text)) {
                                    i8cVar3.a(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                                    return;
                                }
                            }
                            i8cVar3.a(Boolean.FALSE, null);
                            if (tL_error2 != null) {
                                str2 = tL_error2.text;
                            } else {
                                str2 = "FAILED_SEND_STARS";
                            }
                            Y.Q(2131624012, 36, k96.a0(null, null, 2131743639, str2)).j();
                            return;
                        }
                        Utilities.d.c(new bsa(gtaVar2, (TLRPC.TL_payments_paymentResult) tLObject2, (byte) 4));
                        gtaVar2.D = false;
                        gtaVar2.E = true;
                        gtaVar2.G = 0L;
                        gtaVar2.T();
                        gtaVar2.M(j7);
                        gtaVar2.P(true);
                        i8cVar3.a(Boolean.TRUE, null);
                        mj0 b = oj0.a(gtaVar2.a).b();
                        if (b != null && b.a(j7)) {
                            SharedPreferences.Editor edit = na7.q1(gtaVar2.a).X3.edit();
                            edit.putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j7, false).apply();
                        }
                        SharedPreferences.Editor edit2 = na7.q1(gtaVar2.a).X3.edit();
                        SharedPreferences.Editor putBoolean = edit2.putBoolean("show_gift_for_" + j7, true);
                        putBoolean.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j7, true).apply();
                        LaunchActivity launchActivity = LaunchActivity.H1;
                        if (launchActivity != null && (vz5Var = launchActivity.w0) != null) {
                            vz5Var.c(true);
                        }
                    }
                });
            }
        });
    }

    public final void f0(LaunchActivity launchActivity, long j, String str) {
        if (m().amount < j && j > 0) {
            new zua(launchActivity, null, j, 4, str, new jc((byte) 10), 0L).show();
            return;
        }
        d S2 = LaunchActivity.S();
        if (S2 == null) {
            return;
        }
        m21 K = u21.b0(S2).K(2131624222, k96.M0(2131744727, null), k96.M0(2131744726, null), new am6((byte) 29));
        K.j = 5000;
        K.k(true);
    }

    public final void g(final TL_stars.StarGift starGift, final boolean z, final boolean z2, final long j, final TLRPC.TL_textWithEntities tL_textWithEntities, final w0a w0aVar) {
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = a.b;
        }
        final Context context2 = context;
        final wjb F = F();
        if (starGift != null && context2 != null) {
            if (!this.e) {
                o(new Runnable() {
                    @Override
                    public final void run() {
                        gta gtaVar = gta.this;
                        boolean z3 = gtaVar.e;
                        w0a w0aVar2 = w0aVar;
                        if (!z3) {
                            gta.c("NO_BALANCE");
                            w0aVar2.a(Boolean.FALSE, null);
                            return;
                        }
                        gtaVar.g(starGift, z, z2, j, tL_textWithEntities, w0aVar2);
                    }
                });
                return;
            }
            final String k = cf3.k(this.a, j);
            final TLRPC.TL_inputInvoiceStarGift tL_inputInvoiceStarGift = new TLRPC.TL_inputInvoiceStarGift();
            tL_inputInvoiceStarGift.hide_name = z;
            tL_inputInvoiceStarGift.peer = na7.q1(this.a).h1(j);
            tL_inputInvoiceStarGift.gift_id = starGift.id;
            tL_inputInvoiceStarGift.include_upgrade = z2;
            if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                tL_inputInvoiceStarGift.flags |= 2;
                tL_inputInvoiceStarGift.message = tL_textWithEntities;
            }
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject u = ow0.u(F, false);
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
                    final gta gtaVar = gta.this;
                    final w0a w0aVar2 = w0aVar;
                    final TLRPC.TL_inputInvoiceStarGift tL_inputInvoiceStarGift2 = tL_inputInvoiceStarGift;
                    final Context context3 = context2;
                    final wjb wjbVar = F;
                    final String str = k;
                    final TL_stars.StarGift starGift2 = starGift;
                    final boolean z3 = z;
                    final boolean z4 = z2;
                    final long j2 = j;
                    final TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_textWithEntities;
                    gl.d3(new Runnable() {
                        @Override
                        public final void run() {
                            String str2;
                            TLObject tLObject2 = tLObject;
                            boolean z5 = tLObject2 instanceof TLRPC.TL_payments_paymentFormStarGift;
                            final w0a w0aVar3 = w0aVar2;
                            if (!z5) {
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    str2 = "NO_PAYMENT_FORM";
                                } else {
                                    str2 = tL_error2.text;
                                }
                                gta.c(str2);
                                w0aVar3.a(Boolean.FALSE, null);
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
                            final gta gtaVar2 = gta.this;
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(gtaVar2.a);
                            final Context context4 = context3;
                            final wjb wjbVar2 = wjbVar;
                            final String str3 = str;
                            final TL_stars.StarGift starGift3 = starGift2;
                            final boolean z6 = z3;
                            final boolean z7 = z4;
                            final long j4 = j2;
                            final TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_textWithEntities2;
                            connectionsManager.sendRequest(tL_payments_sendStarsForm, new RequestDelegate() {
                                @Override
                                public final void run(final TLObject tLObject3, final TLRPC.TL_error tL_error3) {
                                    final gta gtaVar3 = gta.this;
                                    final w0a w0aVar4 = w0aVar3;
                                    final Context context5 = context4;
                                    final wjb wjbVar3 = wjbVar2;
                                    final long j5 = j3;
                                    final String str4 = str3;
                                    final TL_stars.StarGift starGift4 = starGift3;
                                    final boolean z8 = z6;
                                    final boolean z9 = z7;
                                    final long j6 = j4;
                                    final TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_textWithEntities3;
                                    gl.d3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            u21 Y;
                                            String str5;
                                            SpannableStringBuilder spannableStringBuilder;
                                            vz5 vz5Var;
                                            ?? r10;
                                            String str6;
                                            gta gtaVar4 = gta.this;
                                            TLObject tLObject4 = tLObject3;
                                            TLRPC.TL_error tL_error4 = tL_error3;
                                            w0a w0aVar5 = w0aVar4;
                                            Context context6 = context5;
                                            wjb wjbVar4 = wjbVar3;
                                            long j7 = j5;
                                            String str7 = str4;
                                            TL_stars.StarGift starGift5 = starGift4;
                                            boolean z10 = z8;
                                            boolean z11 = z9;
                                            long j8 = j6;
                                            TLRPC.TL_textWithEntities tL_textWithEntities5 = tL_textWithEntities4;
                                            d Q = LaunchActivity.Q();
                                            if (Q != null && Q.visibleDialog == null) {
                                                Y = u21.b0(Q);
                                            } else {
                                                Y = u21.Y();
                                            }
                                            if (!(tLObject4 instanceof TLRPC.TL_payments_paymentResult)) {
                                                if (tL_error4 != null) {
                                                    if ("BALANCE_TOO_LOW".equals(tL_error4.text)) {
                                                        if (!na7.q1(gtaVar4.a).Z4()) {
                                                            w0aVar5.a(Boolean.FALSE, null);
                                                            gta.c0(context6, wjbVar4);
                                                            return;
                                                        }
                                                        boolean[] zArr = {false};
                                                        zua zuaVar = new zua(context6, wjbVar4, j7, 6, str7, new gsa(gtaVar4, zArr, starGift5, z10, z11, j8, tL_textWithEntities5, w0aVar5), 0L);
                                                        zuaVar.setOnDismissListener(new cf(w0aVar5, zArr, (byte) 16));
                                                        zuaVar.show();
                                                        return;
                                                    } else if ("STARGIFT_USAGE_LIMITED".equals(tL_error4.text)) {
                                                        w0aVar5.a(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                                                        return;
                                                    } else if ("STARGIFT_USER_USAGE_LIMITED".equals(tL_error4.text)) {
                                                        w0aVar5.a(Boolean.FALSE, "STARGIFT_USER_USAGE_LIMITED");
                                                        return;
                                                    }
                                                }
                                                w0aVar5.a(Boolean.FALSE, null);
                                                if (tL_error4 != null) {
                                                    str6 = tL_error4.text;
                                                } else {
                                                    str6 = "FAILED_SEND_STARS";
                                                }
                                                Y.Q(2131624012, 36, k96.a0(null, null, 2131743639, str6)).j();
                                                return;
                                            }
                                            Utilities.d.c(new bsa(gtaVar4, (TLRPC.TL_payments_paymentResult) tLObject4, (byte) 2));
                                            gtaVar4.D = false;
                                            gtaVar4.E = true;
                                            gtaVar4.G = 0L;
                                            gtaVar4.T();
                                            gtaVar4.M(j8);
                                            gtaVar4.P(true);
                                            w0aVar5.a(Boolean.TRUE, null);
                                            mj0 b = oj0.a(gtaVar4.a).b();
                                            if (b != null && b.a(j8)) {
                                                na7.q1(gtaVar4.a).X3.edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j8, false).apply();
                                            }
                                            if (starGift5 != null && starGift5.limited_per_user) {
                                                int i2 = starGift5.per_user_remains - 1;
                                                starGift5.per_user_remains = i2;
                                                spannableStringBuilder = gl.T2(k96.H(',', "Gift2SentRemainsLimit", Math.max(0, i2)));
                                                str5 = str7;
                                            } else {
                                                str5 = str7;
                                                spannableStringBuilder = null;
                                            }
                                            if (j8 < 0) {
                                                long j9 = -j8;
                                                TLRPC.ChatFull L0 = na7.q1(gtaVar4.a).L0(j9);
                                                if (L0 != null) {
                                                    L0.stargifts_count++;
                                                    L0.flags2 |= 262144;
                                                    na7.q1(gtaVar4.a).T3(L0);
                                                }
                                                if (Q instanceof ProfileActivity) {
                                                    ProfileActivity profileActivity = (ProfileActivity) Q;
                                                    if (profileActivity.a() == j8) {
                                                        vn8 vn8Var = profileActivity.O;
                                                        if (vn8Var != null) {
                                                            vn8Var.N1(true);
                                                            profileActivity.O.f1(14);
                                                            r10 = 0;
                                                            profileActivity.j3(false);
                                                        } else {
                                                            r10 = 0;
                                                        }
                                                        u21 b0 = u21.b0(Q);
                                                        TLRPC.Document document = starGift5.sticker;
                                                        String M0 = k96.M0(2131744872, null);
                                                        if (spannableStringBuilder == null) {
                                                            Object[] objArr = new Object[1];
                                                            objArr[r10] = str5;
                                                            spannableStringBuilder = gl.T2(k96.G((int) j7, "StarsGiftCompletedChannelText", objArr));
                                                        }
                                                        b0.s(document, M0, spannableStringBuilder).k(r10);
                                                    }
                                                }
                                                Bundle bundle = new Bundle();
                                                bundle.putLong("chat_id", j9);
                                                bundle.putBoolean("open_gifts", true);
                                                ProfileActivity profileActivity2 = new ProfileActivity(bundle, null);
                                                profileActivity2.whenFullyVisible(new o77(profileActivity2, starGift5, spannableStringBuilder, j7, str5, (byte) 18));
                                                Q.presentFragment(profileActivity2);
                                            } else if ((Q instanceof mu1) && ((mu1) Q).a() == j8) {
                                                u21 b02 = u21.b0(Q);
                                                TLRPC.Document document2 = starGift5.sticker;
                                                String M02 = k96.M0(2131744872, null);
                                                if (spannableStringBuilder == null) {
                                                    spannableStringBuilder = gl.T2(k96.G((int) j7, "StarsGiftCompletedText", new Object[0]));
                                                }
                                                b02.s(document2, M02, spannableStringBuilder).k(true);
                                            } else {
                                                kk7 f = kk7.f(gtaVar4.a);
                                                int i3 = kk7.u;
                                                Long valueOf = Long.valueOf(j8);
                                                Boolean bool = Boolean.FALSE;
                                                f.k(i3, valueOf, bool);
                                                kk7.f(gtaVar4.a).k(kk7.t, Long.valueOf(j8), bool);
                                                mu1 U9 = mu1.U9(j8);
                                                U9.whenFullyVisible(new mx8(U9, starGift5, spannableStringBuilder, j7, (byte) 7));
                                                Q.presentFragment(U9);
                                            }
                                            na7.q1(gtaVar4.a).X3.edit().putBoolean("show_gift_for_" + j8, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j8, true).apply();
                                            LaunchActivity launchActivity = LaunchActivity.H1;
                                            if (launchActivity != null && (vz5Var = launchActivity.w0) != null) {
                                                vz5Var.c(true);
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

    public final void g0(final long j, final long j2, boolean z, final boolean z2) {
        TL_account.toggleNoPaidMessagesException togglenopaidmessagesexception = new TL_account.toggleNoPaidMessagesException();
        int i = this.a;
        togglenopaidmessagesexception.user_id = na7.q1(i).m1(j);
        if (j2 != 0) {
            togglenopaidmessagesexception.parent_peer = na7.q1(i).h1(j2);
        }
        togglenopaidmessagesexception.refund_charged = z;
        togglenopaidmessagesexception.require_payment = !z2;
        ConnectionsManager.getInstance(i).sendRequest(togglenopaidmessagesexception, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                gl.d3(new nb7(gta.this, tLObject, j2, j, z2));
            }
        });
    }

    public final void h0(String str, TLRPC.ChatInvite chatInvite, i8c i8cVar) {
        String str2;
        if (chatInvite != null && chatInvite.subscription_pricing != null) {
            Context context = LaunchActivity.H1;
            if (context == null) {
                context = a.b;
            }
            Context context2 = context;
            wjb F = F();
            long j = chatInvite.subscription_pricing.amount;
            if (context2 != null) {
                int i = y6c.t0;
                boolean[] zArr = {false};
                ssa ssaVar = new ssa(this, j, i, zArr, i8cVar, context2, F, chatInvite, str);
                t7a t7aVar = new t7a(this, zArr, i8cVar);
                fx0 h = de9.h(1, F, context2, false);
                LinearLayout j2 = de9.j(context2, 1);
                j2.setPadding(gl.L(16.0f), 0, gl.L(16.0f), gl.L(8.0f));
                FrameLayout frameLayout = new FrameLayout(context2);
                frameLayout.addView(new qua(context2, 40, 0), nme.c(-1.0f, -1));
                be0 be0Var = new be0(context2);
                be0Var.setRoundRadius(gl.L(80.0f));
                pb0 pb0Var = new pb0((wjb) null);
                pb0Var.r(chatInvite.color);
                String str3 = chatInvite.title;
                pb0Var.A = true;
                pb0Var.n = (byte) 0;
                pb0Var.m = false;
                pb0.a(str3, null, null, pb0Var.q);
                TLRPC.Photo photo = chatInvite.photo;
                if (photo != null) {
                    be0Var.m(gl5.i(ba4.w(photo.sizes, gl.L(80.0f), false, null, false), chatInvite.photo), "80_80", pb0Var, chatInvite);
                } else {
                    be0Var.setImageDrawable(pb0Var);
                }
                frameLayout.addView(be0Var, nme.e(80, 80, 17));
                Drawable drawable = context2.getResources().getDrawable(2131232758);
                int i2 = bkb.g5;
                zkb.x(frameLayout, drawable, i2, F, PorterDuff.Mode.SRC_IN);
                Drawable drawable2 = context2.getResources().getDrawable(2131232757);
                ImageView imageView = new ImageView(context2);
                imageView.setImageDrawable(drawable);
                frameLayout.addView(imageView, nme.e(26, 26, 17));
                imageView.setTranslationX(gl.L(26.0f));
                imageView.setTranslationY(gl.L(26.0f));
                imageView.setScaleX(1.2f);
                imageView.setScaleY(1.2f);
                ImageView imageView2 = new ImageView(context2);
                imageView2.setImageDrawable(drawable2);
                frameLayout.addView(imageView2, nme.e(26, 26, 17));
                imageView2.setTranslationX(gl.L(26.0f));
                imageView2.setTranslationY(gl.L(26.0f));
                yua yuaVar = new yua(i, F, context2);
                ote.a(yuaVar);
                yuaVar.setOnClickListener(new fua(yuaVar, (byte) 0));
                frameLayout.addView(yuaVar, nme.d(-2, -2.0f, 53, 0.0f, 0.0f, -8.0f, 0.0f));
                j2.addView(frameLayout, nme.r(-1, 117, 7));
                TextView textView = new TextView(context2);
                textView.setTextSize(1, 20.0f);
                textView.setTypeface(gl.o());
                int i3 = bkb.i5;
                ug8.x(textView, i3, F, null, 2131744775);
                textView.setGravity(17);
                TextView m = ug8.m(j2, textView, nme.t(-2, -2, 1, 0, 8, 0, 0), context2);
                m.setTextSize(1, 14.0f);
                zkb.X(m, i3, F);
                TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                int i4 = tL_starsSubscriptionPricing.period;
                if (i4 == 2592000) {
                    m.setText(gl.T2(k96.G((int) tL_starsSubscriptionPricing.amount, "StarsSubscribeText", chatInvite.title)));
                } else {
                    if (i4 == 300) {
                        str2 = "5 minutes";
                    } else {
                        str2 = "a minute";
                    }
                    m.setText(gl.T2(k96.G((int) tL_starsSubscriptionPricing.amount, "StarsSubscribeTextTest", chatInvite.title, str2)));
                }
                m.setMaxWidth(je5.a(m.getText(), m.getPaint()));
                m.setGravity(17);
                j2.addView(m, nme.t(-2, -2, 1, 0, 6, 0, 22));
                if (!TextUtils.isEmpty(chatInvite.about)) {
                    TextView textView2 = new TextView(context2);
                    textView2.setTextSize(1, 14.0f);
                    zkb.X(textView2, i3, F);
                    textView2.setText(vu3.m(chatInvite.about, textView2.getPaint().getFontMetricsInt(), false, null, 0));
                    textView2.setGravity(17);
                    j2.addView(textView2, nme.t(-2, -2, 1, 0, 6, 0, 22));
                }
                u41 u41Var = new u41(F, context2, true);
                u41Var.i(k96.M0(2131744784, null), false, true);
                j2.addView(u41Var, nme.o(-1, 48));
                l46 l46Var = new l46(context2, F);
                l46Var.setText(gl.O2(k96.M0(2131744783, null), -1, 0, new vf1(context2, (byte) 19), null));
                l46Var.setGravity(17);
                l46Var.setTextSize(1, 13.0f);
                zkb.X(l46Var, bkb.A6, F);
                zkb.G(l46Var, bkb.Wc, F);
                j2.addView(l46Var, nme.t(-1, -2, 49, 14, 14, 14, 6));
                h.O = j2;
                u41Var.setOnClickListener(new hu4(ssaVar, h, u41Var, (byte) 22));
                h.setOnDismissListener(new ph8(t7aVar, (byte) 8));
                h.M(i2);
                d S2 = LaunchActivity.S();
                if (!gl.O1() && S2 != null && !gl.s1(S2)) {
                    h.X(S2);
                }
                h.show();
            }
        }
    }

    public final void i0(TL_stars.StarsAmount starsAmount) {
        boolean equals = this.f.equals(starsAmount);
        int i = kk7.z3;
        int i2 = this.a;
        if (!equals) {
            this.f = starsAmount;
            this.g = 0L;
            kk7.f(i2).k(i, new Object[0]);
        } else if (this.g != 0) {
            this.g = 0L;
            kk7.f(i2).k(i, new Object[0]);
        }
    }

    public final void j0(final k27 k27Var, final long j, final Runnable runnable, final boolean z) {
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia;
        if (k27Var == null) {
            runnable.run();
            return;
        }
        final long B0 = k27.B0(k27Var.k);
        final int e1 = k27Var.e1();
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia2 = (TLRPC.TL_messageMediaPaidMedia) k27Var.k.media;
        TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
        int i = this.a;
        tL_messages_editMessage.peer = na7.q1(i).h1(B0);
        int i2 = tL_messages_editMessage.flags;
        tL_messages_editMessage.flags = 32768 | i2;
        tL_messages_editMessage.schedule_date = k27Var.k.date;
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
                gl.d3(new xa7(gta.this, tLObject, runnable, tL_error, z, B0, e1, k27Var, j));
            }
        });
    }

    public final TL_stars.SavedStarGift k(long j) {
        TL_stars.StarGift starGift;
        int i = 0;
        while (true) {
            LongSparseArray longSparseArray = this.L;
            if (i < longSparseArray.size()) {
                xsa xsaVar = (xsa) longSparseArray.valueAt(i);
                for (int i2 = 0; i2 < xsaVar.l.size(); i2++) {
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) xsaVar.l.get(i2);
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

    public final TL_stars.StarsAmount m() {
        return n(null, true, false);
    }

    public final TL_stars.StarsAmount n(Runnable runnable, boolean z, boolean z2) {
        if (((!this.e || System.currentTimeMillis() - this.c > 60000) && !this.d) || z2) {
            this.d = true;
            TL_stars.TL_payments_getStarsStatus tL_payments_getStarsStatus = new TL_stars.TL_payments_getStarsStatus();
            tL_payments_getStarsStatus.ton = this.b;
            tL_payments_getStarsStatus.peer = new TLRPC.TL_inputPeerSelf();
            ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getStarsStatus, new apa(this, runnable, (byte) 2));
        }
        if (z && this.g > 0) {
            nj n = nj.n(this.f);
            return nj.h(Math.max(0L, n.a() - this.g), n.a).q();
        }
        return this.f;
    }

    public final void o(Runnable runnable) {
        n(runnable, true, false);
    }

    public final nj p() {
        oj ojVar;
        nj m = nj.m(m());
        if (m == null) {
            if (this.b) {
                ojVar = oj.b;
            } else {
                ojVar = oj.a;
            }
            return nj.j(0L, ojVar);
        }
        return m;
    }

    public final ArrayList r() {
        if (!this.k && !this.l) {
            this.k = true;
            ConnectionsManager.getInstance(this.a).sendRequest(new TL_stars.TL_payments_getStarsGiftOptions(), new hsa(this, (byte) 3));
            return this.m;
        }
        return this.m;
    }

    public final ArrayList s() {
        if (!this.n && !this.o) {
            this.n = true;
            ConnectionsManager.getInstance(this.a).sendRequest(new TL_stars.TL_payments_getStarsGiveawayOptions(), new hsa(this, (byte) 4));
            return this.p;
        }
        return this.p;
    }

    public final ArrayList w() {
        if (!this.h && !this.i) {
            this.h = true;
            ConnectionsManager.getInstance(this.a).sendRequest(new TL_stars.TL_payments_getStarsTopupOptions(), new hsa(this, (byte) 2));
            return this.j;
        }
        return this.j;
    }

    public final long x(k27 k27Var) {
        Long z1;
        Long l;
        eta etaVar = this.B;
        if (etaVar != null && etaVar.a.equals(zsa.b(k27Var)) && (l = this.B.n) != null) {
            return l.longValue();
        }
        if (k27Var == null) {
            z1 = null;
        } else {
            z1 = k27Var.z1();
        }
        if (z1 != null) {
            return z1.longValue();
        }
        Long v1 = na7.q1(this.a).v1();
        if (v1 != null) {
            return v1.longValue();
        }
        return 0L;
    }

    public final long y(zsa zsaVar, TLRPC.TL_messageReactions tL_messageReactions) {
        ArrayList<TLRPC.MessageReactor> arrayList;
        Long l;
        eta etaVar = this.B;
        if (etaVar != null && etaVar.a.equals(zsaVar) && (l = this.B.n) != null) {
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
                        l2 = Long.valueOf(cf3.n(peer));
                        break;
                    }
                }
            }
        }
        if (l2 != null) {
            return l2.longValue();
        }
        Long v1 = na7.q1(this.a).v1();
        if (v1 != null) {
            return v1.longValue();
        }
        return 0L;
    }

    public final void z(long j, long j2, p8c p8cVar) {
        TL_account.getPaidMessagesRevenue getpaidmessagesrevenue = new TL_account.getPaidMessagesRevenue();
        int i = this.a;
        getpaidmessagesrevenue.user_id = na7.q1(i).m1(j);
        if (j2 != 0) {
            getpaidmessagesrevenue.parent_peer = na7.q1(i).h1(j2);
        }
        ConnectionsManager.getInstance(i).sendRequest(getpaidmessagesrevenue, new lg1(p8cVar, (byte) 2));
    }
}
