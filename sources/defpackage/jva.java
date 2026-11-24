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
public final class jva {
    public static volatile jva[][] S = (jva[][]) Array.newInstance(jva.class, 2, 4);
    public static final Object[][] T = (Object[][]) Array.newInstance(Object.class, 2, 4);
    public boolean A;
    public hva B;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public long G;
    public eva N;
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

    public jva(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public static ylb F() {
        d S2 = LaunchActivity.S();
        if (S2 != null) {
            return S2.getResourceProvider();
        }
        return null;
    }

    public static jva I(int i) {
        return v(i, true);
    }

    public static boolean Q(int i, nk nkVar) {
        if (nkVar == null || u(i, nkVar.a).p().b >= nkVar.b) {
            return true;
        }
        return false;
    }

    public static void c(String str) {
        c41 Y;
        d Q = LaunchActivity.Q();
        if (Q != null && Q.visibleDialog == null) {
            Y = c41.b0(Q);
        } else {
            Y = c41.Y();
        }
        Y.Q(2131624012, 36, c41.W(str)).j();
    }

    public static void c0(Context context, ylb ylbVar) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, context);
        String M0 = jb6.M0(2131744749, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        heVar.U = jb6.M0(2131744750, null);
        b10.t(null, 2131747564, alertDialog$Builder, null);
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

    public static jva t(int i) {
        return v(i, false);
    }

    public static jva u(int i, ok okVar) {
        boolean z;
        if (okVar == ok.b) {
            z = true;
        } else {
            z = false;
        }
        return v(i, z);
    }

    public static jva v(int i, boolean z) {
        jva jvaVar;
        jva jvaVar2 = S[z ? 1 : 0][i];
        if (jvaVar2 == null) {
            synchronized (T[z ? 1 : 0][i]) {
                jvaVar = S[z ? 1 : 0][i];
                if (jvaVar == null) {
                    jva[] jvaVarArr = S[z ? 1 : 0];
                    jva jvaVar3 = new jva(i, z);
                    jvaVarArr[i] = jvaVar3;
                    jvaVar = jvaVar3;
                }
            }
            return jvaVar;
        }
        return jvaVar2;
    }

    public final long A(int i, long j) {
        hva hvaVar = this.B;
        if (hvaVar != null) {
            cva cvaVar = hvaVar.a;
            if (cvaVar.a == j && cvaVar.b == i && hvaVar.l) {
                return hvaVar.h;
            }
            return 0L;
        }
        return 0L;
    }

    public final long B(k47 k47Var) {
        TLRPC.Message message;
        if (k47Var != null && (message = k47Var.k) != null) {
            if ((message.isThreadMessage || k47Var.k3()) && k47Var.k.fwd_from != null) {
                return A(k47Var.k.fwd_from.saved_from_msg_id, k47Var.Z0());
            }
            return A(k47Var.e1(), k47.B0(k47Var.k));
        }
        return 0L;
    }

    public final yua C(long j, boolean z) {
        LongSparseArray longSparseArray = this.K;
        yua yuaVar = (yua) longSparseArray.get(j);
        if (yuaVar == null && z) {
            yua yuaVar2 = new yua(this.a, j);
            longSparseArray.put(j, yuaVar2);
            return yuaVar2;
        }
        return yuaVar;
    }

    public final ava D(long j, boolean z) {
        LongSparseArray longSparseArray = this.L;
        ava avaVar = (ava) longSparseArray.get(j);
        if (avaVar == null && z) {
            ava avaVar2 = new ava(this.a, j, true);
            longSparseArray.put(j, avaVar2);
            return avaVar2;
        }
        return avaVar;
    }

    public final void E(TL_stars.StarGift starGift, long j, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z, qac qacVar) {
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = a.b;
        }
        ylb F = F();
        if (starGift != null && context != null) {
            if (!this.e) {
                o(new ut0(this, qacVar, starGift, j, tL_textWithEntities, z, (byte) 7));
                return;
            }
            TLRPC.TL_inputInvoiceStarGiftResale tL_inputInvoiceStarGiftResale = new TLRPC.TL_inputInvoiceStarGiftResale();
            tL_inputInvoiceStarGiftResale.slug = starGift.slug;
            tL_inputInvoiceStarGiftResale.to_id = oc7.r1(this.a).i1(j);
            tL_inputInvoiceStarGiftResale.ton = this.b;
            tL_inputInvoiceStarGiftResale.message = tL_textWithEntities;
            tL_inputInvoiceStarGiftResale.show_name = !z;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject u = wx0.u(F, false);
            if (u != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftResale;
            ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new ara(this, qacVar, (byte) 1));
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

    public final void H(long j, qac qacVar) {
        TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) this.M.get(Long.valueOf(j));
        if (stargiftupgradepreview != null) {
            qacVar.a(stargiftupgradepreview);
            return;
        }
        TL_stars.getStarGiftUpgradePreview getstargiftupgradepreview = new TL_stars.getStarGiftUpgradePreview();
        getstargiftupgradepreview.gift_id = j;
        ConnectionsManager.getInstance(this.a).sendRequest(getstargiftupgradepreview, new jb7(this, j, qacVar, (byte) 16));
    }

    public final void J(TL_stars.InputSavedStarGift inputSavedStarGift, qac qacVar) {
        he heVar = new he(3, null, a.b);
        heVar.q(200L);
        TL_stars.getSavedStarGift getsavedstargift = new TL_stars.getSavedStarGift();
        getsavedstargift.stargift.add(inputSavedStarGift);
        ConnectionsManager.getInstance(this.a).sendRequest(getsavedstargift, new av0(this, heVar, inputSavedStarGift, qacVar, (byte) 22));
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
        ava D = D(j, false);
        if (D != null) {
            D.k(false);
        }
        yua yuaVar = (yua) this.K.get(j);
        if (yuaVar != null) {
            yuaVar.g();
        }
    }

    public final void N(TLRPC.UserFull userFull) {
        if (userFull != null) {
            long j = userFull.id;
            ava D = D(j, false);
            if (D != null && D.n != userFull.stargifts_count) {
                D.k(false);
            }
            yua yuaVar = (yua) this.K.get(j);
            if (yuaVar != null) {
                yuaVar.g();
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
        oc7.r1(i).d4(arrayList2, true);
        oc7.r1(i).X3(arrayList3, true);
        this.E = true;
        ArrayList arrayList4 = this.H;
        arrayList4.clear();
        arrayList4.addAll(arrayList);
        ArrayList arrayList5 = this.J;
        arrayList5.clear();
        arrayList5.addAll(arrayList4);
        Collections.sort(arrayList5, Comparator$EL.thenComparingInt(Comparator$CC.comparingInt(new mn((byte) 14)), new mn((byte) 15)));
        ArrayList arrayList6 = this.I;
        arrayList6.clear();
        arrayList6.addAll(arrayList4);
        Collections.sort(arrayList6, Comparator$CC.comparingInt(new mn((byte) 16)));
        this.F = num.intValue();
        this.G = l.longValue();
        this.C = false;
        nm7.f(i).k(nm7.H3, new Object[0]);
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
            oc7.r1(i).d4(tL_starGifts.users, false);
            oc7.r1(i).X3(tL_starGifts.chats, false);
            cf7.Y(i).j1(tL_starGifts.users, tL_starGifts.chats, true, true);
            arrayList.clear();
            arrayList.addAll(tL_starGifts.gifts);
            ArrayList arrayList2 = this.J;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            Collections.sort(arrayList2, Comparator$EL.thenComparingInt(Comparator$CC.comparingInt(new mn((byte) 17)), new mn((byte) 18)));
            ArrayList arrayList3 = this.I;
            arrayList3.clear();
            arrayList3.addAll(arrayList);
            Collections.sort(arrayList3, Comparator$CC.comparingInt(new mn((byte) 19)));
            this.F = tL_starGifts.hash;
            this.G = System.currentTimeMillis();
            nm7.f(i).k(nm7.H3, new Object[0]);
            ArrayList<TL_stars.StarGift> arrayList4 = tL_starGifts.gifts;
            int i2 = this.F;
            long j = this.G;
            cf7 Y = cf7.Y(i);
            Y.a.c(new md7(Y, arrayList4, i2, j));
        } else if (starGifts instanceof TL_stars.TL_starGiftsNotModified) {
            int i3 = this.F;
            long currentTimeMillis = System.currentTimeMillis();
            this.G = currentTimeMillis;
            cf7 Y2 = cf7.Y(i);
            Y2.a.c(new md7(Y2, arrayList, i3, currentTimeMillis));
        }
    }

    public final void T() {
        if (!this.C) {
            if (!this.D || System.currentTimeMillis() - this.G >= 60000) {
                this.C = true;
                boolean z = this.E;
                int i = this.a;
                if (!z) {
                    yf9 yf9Var = new yf9(this, (byte) 27);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    cf7 Y = cf7.Y(i);
                    Y.a.c(new hz7(Y, arrayList3, arrayList2, arrayList, yf9Var, (byte) 26));
                    return;
                }
                int i2 = this.F;
                eg9 eg9Var = new eg9(this, (byte) 10);
                TL_stars.getStarGifts getstargifts = new TL_stars.getStarGifts();
                getstargifts.hash = i2;
                ConnectionsManager.getInstance(i).sendRequest(getstargifts, new go9(eg9Var, (byte) 3));
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
            ConnectionsManager.getInstance(this.a).sendRequest(tL_getStarsSubscriptions, new jua(this, (byte) 1));
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
            ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getStarsTransactions, new w22(this, i, (byte) 6));
        }
    }

    public final void W(defpackage.k47 r38, org.telegram.tgnet.TLRPC.InputInvoice r39, org.telegram.tgnet.TLRPC.TL_payments_paymentFormStars r40, java.lang.Runnable r41, defpackage.qac r42) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jva.W(k47, org.telegram.tgnet.TLRPC$InputInvoice, org.telegram.tgnet.TLRPC$TL_payments_paymentFormStars, java.lang.Runnable, qac):void");
    }

    public final void X(final k47 k47Var, final TLRPC.InputInvoice inputInvoice, final TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, final qac qacVar) {
        long j;
        String str;
        TLRPC.User W1;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        if (tL_payments_paymentFormStars != null) {
            final Context context = a.b;
            final ylb F = F();
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
            if (k47Var != null) {
                TLRPC.Message message = k47Var.k;
                if (message != null && (messageFwdHeader = message.fwd_from) != null && (peer = messageFwdHeader.from_id) != null) {
                    j = pg3.n(peer);
                } else {
                    j = k47.B0(message);
                }
                if (j < 0 && k47Var.Z0() > 0 && (W1 = oc7.r1(this.a).W1(Long.valueOf(k47Var.Z0()))) != null && W1.bot) {
                    j = W1.id;
                }
            } else {
                j = tL_payments_paymentFormStars.bot_id;
            }
            final long j3 = j;
            int i2 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
            int i3 = this.a;
            if (i2 >= 0) {
                str = m9c.r(oc7.r1(i3).W1(Long.valueOf(j3)));
            } else {
                TLRPC.Chat L0 = oc7.r1(i3).L0(Long.valueOf(-j3));
                if (L0 == null) {
                    str = "";
                } else {
                    str = L0.title;
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
                    final jva jvaVar = jva.this;
                    final qac qacVar2 = qacVar;
                    final k47 k47Var2 = k47Var;
                    final Context context2 = context;
                    final long j4 = j2;
                    final String str4 = str2;
                    final int i5 = i4;
                    final String str5 = str3;
                    final TLRPC.InputInvoice inputInvoice2 = inputInvoice;
                    final long j5 = j3;
                    final ylb ylbVar = F;
                    final TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars2 = tL_payments_paymentFormStars;
                    gm.c3(new Runnable() {
                        @Override
                        public final void run() {
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.yta.run():void");
                        }
                    });
                }
            });
        }
    }

    public final void Y(String str, TLRPC.ChatInvite chatInvite, jac jacVar) {
        if (chatInvite != null && chatInvite.subscription_pricing != null) {
            Context context = a.b;
            ylb F = F();
            if (context != null) {
                long j = chatInvite.subscription_pricing.amount;
                String str2 = chatInvite.title;
                TLRPC.TL_inputInvoiceChatInviteSubscription tL_inputInvoiceChatInviteSubscription = new TLRPC.TL_inputInvoiceChatInviteSubscription();
                tL_inputInvoiceChatInviteSubscription.hash = str;
                TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                tL_payments_sendStarsForm.form_id = chatInvite.subscription_form_id;
                tL_payments_sendStarsForm.invoice = tL_inputInvoiceChatInviteSubscription;
                ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_sendStarsForm, new m97(this, jacVar, j, str2, context, F, chatInvite, str));
            }
        }
    }

    public final void Z(long j, long j2, boolean z) {
        int i = this.a;
        qwb qwbVar = oc7.r1(i).g4;
        TLRPC.TL_forumTopic f = qwbVar.f(j, j2);
        if (f != null) {
            f.nopaid_messages_exception = z;
            vh6 vh6Var = qwbVar.a;
            if (((ArrayList) vh6Var.f(j)) != null) {
                qwbVar.getMessagesStorage().z1(qwbVar.getConnectionsManager().getCurrentTime(), -j, (List) vh6Var.f(j), true);
            }
            nm7.f(i).k(nm7.Q3, Long.valueOf(j2));
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
            int e1 = ((k47) obj).e1();
            hashSet.add(Integer.valueOf(e1));
            if (this.Q.remove(Integer.valueOf(e1))) {
                this.R.put(Integer.valueOf(e1), new hw9(this, hashSet, runnable, (byte) 24));
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
                ((ava) longSparseArray.valueAt(i2)).o(tL_starGiftUnique);
                i2++;
            }
            while (true) {
                LongSparseArray longSparseArray2 = this.K;
                if (i < longSparseArray2.size()) {
                    yua yuaVar = (yua) longSparseArray2.valueAt(i);
                    ava avaVar = yuaVar.g;
                    if (avaVar != null) {
                        avaVar.o(tL_starGiftUnique);
                    }
                    for (ava avaVar2 : yuaVar.h.values()) {
                        avaVar2.o(tL_starGiftUnique);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void b(defpackage.k47 r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jva.b(k47):void");
    }

    public final defpackage.hva b0(final defpackage.k47 r20, final defpackage.yv1 r21, final long r22, boolean r24, boolean r25, final java.lang.Long r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jva.b0(k47, yv1, long, boolean, boolean, java.lang.Long):hva");
    }

    public final void d(Activity activity, TL_stars.TL_starsTopupOption tL_starsTopupOption, jac jacVar, TLRPC.InputPeer inputPeer) {
        boolean z;
        int i = this.a;
        if (activity == null) {
            return;
        }
        if (!oc7.r1(i).c5()) {
            d Q = LaunchActivity.Q();
            if (Q != null && Q.getContext() != null) {
                c0(Q.getContext(), Q.getResourceProvider());
                return;
            } else {
                c0(activity, null);
                return;
            }
        }
        if (oc7.r1(this.a).l4.l0.f && inputPeer != null) {
            z = true;
        } else {
            z = false;
        }
        if ((e21.b() || !cj0.h().j()) && !z) {
            TLRPC.TL_inputStorePaymentStarsTopup tL_inputStorePaymentStarsTopup = new TLRPC.TL_inputStorePaymentStarsTopup();
            tL_inputStorePaymentStarsTopup.stars = tL_starsTopupOption.stars;
            tL_inputStorePaymentStarsTopup.amount = tL_starsTopupOption.amount;
            tL_inputStorePaymentStarsTopup.currency = tL_starsTopupOption.currency;
            tL_inputStorePaymentStarsTopup.spend_purpose_peer = inputPeer;
            TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
            tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsTopup;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject u = wx0.u(F(), false);
            if (u != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
            ConnectionsManager.getInstance(i).sendRequest(tL_payments_getPaymentForm, new fm8(this, jacVar, tL_inputInvoiceStars, (byte) 17));
        } else if (!cj0.h().j()) {
            jacVar.a(Boolean.FALSE, "INVOICE DISABLED");
        } else {
            TLRPC.TL_inputStorePaymentStarsTopup tL_inputStorePaymentStarsTopup2 = new TLRPC.TL_inputStorePaymentStarsTopup();
            tL_inputStorePaymentStarsTopup2.stars = tL_starsTopupOption.stars;
            tL_inputStorePaymentStarsTopup2.currency = tL_starsTopupOption.currency;
            tL_inputStorePaymentStarsTopup2.amount = tL_starsTopupOption.amount;
            ?? obj = new Object();
            obj.b = "inapp";
            obj.a = tL_starsTopupOption.store_product;
            zy8 a = obj.a();
            fc4.b("StarsController.buy starts queryProductDetails");
            cj0.h().o(Arrays.asList(a), new lu(jacVar, tL_inputStorePaymentStarsTopup2, tL_starsTopupOption, activity, (byte) 22));
        }
    }

    public final void d0(List list) {
        if (list != null && !list.isEmpty()) {
            k47 k47Var = (k47) list.get(0);
            long B0 = k47.B0(k47Var.k);
            int i = (B0 > 0L ? 1 : (B0 == 0L ? 0 : -1));
            int i2 = this.a;
            if (i >= 0) {
                oc7.r1(i2).b3(oc7.r1(i2).W1(Long.valueOf(B0)), 0, true, null);
            } else {
                oc7.r1(i2).a3(0, -B0, true);
            }
            c41.b0(LaunchActivity.S()).Q(2131624012, 36, nxa.T0(TextUtils.concat(jb6.G((int) k47Var.k.errorAllowedPriceStars, "PaidMessagesSendErrorToast1", new Object[0]), " ", jb6.G((int) k47Var.k.errorNewPriceStars, "PaidMessagesSendErrorToast2", new Object[0])))).j();
        }
    }

    public final void e(final long j, final TLObject tLObject, final TLRPC.TL_textWithEntities tL_textWithEntities, final jac jacVar) {
        int i;
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = a.b;
        }
        final Context context2 = context;
        final ylb F = F();
        boolean z = tLObject instanceof TLRPC.TL_premiumGiftOption;
        if ((z || (tLObject instanceof TLRPC.TL_premiumGiftCodeOption)) && context2 != null) {
            if (!this.e) {
                o(new r97(this, jacVar, j, tLObject, tL_textWithEntities, (byte) 17));
                return;
            }
            if (z) {
                i = ((TLRPC.TL_premiumGiftOption) tLObject).months;
            } else if (tLObject instanceof TLRPC.TL_premiumGiftCodeOption) {
                i = ((TLRPC.TL_premiumGiftCodeOption) tLObject).months;
            } else {
                return;
            }
            final String k = pg3.k(this.a, j);
            final TLRPC.TL_inputInvoicePremiumGiftStars tL_inputInvoicePremiumGiftStars = new TLRPC.TL_inputInvoicePremiumGiftStars();
            tL_inputInvoicePremiumGiftStars.user_id = oc7.r1(this.a).n1(j);
            tL_inputInvoicePremiumGiftStars.months = i;
            if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                tL_inputInvoicePremiumGiftStars.flags |= 1;
                tL_inputInvoicePremiumGiftStars.message = tL_textWithEntities;
            }
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject u = wx0.u(F, false);
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
                    final jva jvaVar = jva.this;
                    final jac jacVar2 = jacVar;
                    final TLRPC.TL_inputInvoicePremiumGiftStars tL_inputInvoicePremiumGiftStars2 = tL_inputInvoicePremiumGiftStars;
                    final Context context3 = context2;
                    final ylb ylbVar = F;
                    final String str = k;
                    final long j2 = j;
                    final TLObject tLObject3 = tLObject;
                    final TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_textWithEntities;
                    gm.c3(new Runnable() {
                        @Override
                        public final void run() {
                            String str2;
                            TLObject tLObject4 = tLObject2;
                            boolean z2 = tLObject4 instanceof TLRPC.TL_payments_paymentFormStars;
                            final jac jacVar3 = jacVar2;
                            if (!z2) {
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    str2 = "NO_PAYMENT_FORM";
                                } else {
                                    str2 = tL_error2.text;
                                }
                                jva.c(str2);
                                jacVar3.a(Boolean.FALSE, null);
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
                            final jva jvaVar2 = jva.this;
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(jvaVar2.a);
                            final Context context4 = context3;
                            final ylb ylbVar2 = ylbVar;
                            final String str3 = str;
                            final long j4 = j2;
                            final TLObject tLObject5 = tLObject3;
                            final TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_textWithEntities2;
                            connectionsManager.sendRequest(tL_payments_sendStarsForm, new RequestDelegate() {
                                @Override
                                public final void run(final TLObject tLObject6, final TLRPC.TL_error tL_error3) {
                                    final jva jvaVar3 = jva.this;
                                    final jac jacVar4 = jacVar3;
                                    final Context context5 = context4;
                                    final ylb ylbVar3 = ylbVar2;
                                    final long j5 = j3;
                                    final String str4 = str3;
                                    final long j6 = j4;
                                    final TLObject tLObject7 = tLObject5;
                                    final TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_textWithEntities3;
                                    gm.c3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            c41 Y;
                                            v16 v16Var;
                                            int i3;
                                            String str5;
                                            jva jvaVar4 = jva.this;
                                            TLObject tLObject8 = tLObject6;
                                            TLRPC.TL_error tL_error4 = tL_error3;
                                            jac jacVar5 = jacVar4;
                                            Context context6 = context5;
                                            ylb ylbVar4 = ylbVar3;
                                            long j7 = j5;
                                            String str6 = str4;
                                            long j8 = j6;
                                            TLObject tLObject9 = tLObject7;
                                            TLRPC.TL_textWithEntities tL_textWithEntities5 = tL_textWithEntities4;
                                            d Q = LaunchActivity.Q();
                                            if (Q != null && Q.visibleDialog == null) {
                                                Y = c41.b0(Q);
                                            } else {
                                                Y = c41.Y();
                                            }
                                            if (!(tLObject8 instanceof TLRPC.TL_payments_paymentResult)) {
                                                if (tL_error4 != null) {
                                                    if ("BALANCE_TOO_LOW".equals(tL_error4.text)) {
                                                        if (!oc7.r1(jvaVar4.a).c5()) {
                                                            jacVar5.a(Boolean.FALSE, null);
                                                            jva.c0(context6, ylbVar4);
                                                            return;
                                                        }
                                                        boolean[] zArr = {false};
                                                        dxa dxaVar = new dxa(context6, ylbVar4, j7, 6, str6, new om1(jvaVar4, zArr, j8, tLObject9, tL_textWithEntities5, jacVar5, (byte) 4), 0L);
                                                        dxaVar.setOnDismissListener(new eua((byte) 1, jacVar5, zArr));
                                                        dxaVar.show();
                                                        return;
                                                    }
                                                    i3 = 1;
                                                    if ("STARGIFT_USAGE_LIMITED".equals(tL_error4.text)) {
                                                        jacVar5.a(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                                                        return;
                                                    }
                                                } else {
                                                    i3 = 1;
                                                }
                                                jacVar5.a(Boolean.FALSE, null);
                                                if (tL_error4 != null) {
                                                    str5 = tL_error4.text;
                                                } else {
                                                    str5 = "FAILED_SEND_STARS";
                                                }
                                                Object[] objArr = new Object[i3];
                                                objArr[0] = str5;
                                                Y.Q(2131624012, 36, jb6.a0(null, null, 2131743565, objArr)).j();
                                                return;
                                            }
                                            Utilities.d.c(new dua(jvaVar4, (TLRPC.TL_payments_paymentResult) tLObject8, (byte) 3));
                                            jvaVar4.P(true);
                                            jacVar5.a(Boolean.TRUE, null);
                                            mk0 b = ok0.a(jvaVar4.a).b();
                                            if (b != null && b.a(j8)) {
                                                oc7.r1(jvaVar4.a).X3.edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j8, false).apply();
                                            }
                                            oc7.r1(jvaVar4.a).X3.edit().putBoolean("show_gift_for_" + j8, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j8, true).apply();
                                            LaunchActivity launchActivity = LaunchActivity.H1;
                                            if (launchActivity != null && (v16Var = launchActivity.w0) != null) {
                                                v16Var.c(true);
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
            o(new nz8(this, launchActivity, j, str, (byte) 8));
        } else {
            f0(launchActivity, j, str);
        }
    }

    public final void f(final TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, final TL_stars.StarGift starGift, final long j, final TLRPC.TL_textWithEntities tL_textWithEntities, final boolean z, final jac jacVar) {
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = a.b;
        }
        final Context context2 = context;
        final ylb F = F();
        if (context2 == null) {
            return;
        }
        if (!this.e) {
            o(new st0(this, jacVar, tL_payments_paymentFormStarGift, starGift, j, tL_textWithEntities, z));
            return;
        }
        final String k = pg3.k(this.a, j);
        TLRPC.TL_inputInvoiceStarGiftResale tL_inputInvoiceStarGiftResale = new TLRPC.TL_inputInvoiceStarGiftResale();
        tL_inputInvoiceStarGiftResale.slug = starGift.slug;
        tL_inputInvoiceStarGiftResale.to_id = oc7.r1(this.a).i1(j);
        tL_inputInvoiceStarGiftResale.ton = this.b;
        tL_inputInvoiceStarGiftResale.message = tL_textWithEntities;
        tL_inputInvoiceStarGiftResale.show_name = !z;
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        JSONObject u = wx0.u(F, false);
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
                final jva jvaVar = jva.this;
                final jac jacVar2 = jacVar;
                final Context context3 = context2;
                final ylb ylbVar = F;
                final long j4 = j3;
                final String str = k;
                final TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift2 = tL_payments_paymentFormStarGift;
                final TL_stars.StarGift starGift2 = starGift;
                final long j5 = j;
                final TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_textWithEntities;
                final boolean z2 = z;
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        c41 Y;
                        v16 v16Var;
                        String str2;
                        final jva jvaVar2 = jva.this;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        final jac jacVar3 = jacVar2;
                        Context context4 = context3;
                        ylb ylbVar2 = ylbVar;
                        long j6 = j4;
                        String str3 = str;
                        final TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift3 = tL_payments_paymentFormStarGift2;
                        final TL_stars.StarGift starGift3 = starGift2;
                        final long j7 = j5;
                        final TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_textWithEntities2;
                        final boolean z3 = z2;
                        d Q = LaunchActivity.Q();
                        if (Q != null && Q.visibleDialog == null) {
                            Y = c41.b0(Q);
                        } else {
                            Y = c41.Y();
                        }
                        if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                            if (tL_error2 != null) {
                                if ("BALANCE_TOO_LOW".equals(tL_error2.text)) {
                                    if (!oc7.r1(jvaVar2.a).c5()) {
                                        jacVar3.a(Boolean.FALSE, null);
                                        jva.c0(context4, ylbVar2);
                                        return;
                                    }
                                    final boolean[] zArr = {false};
                                    dxa dxaVar = new dxa(context4, ylbVar2, j6, 6, str3, new Runnable() {
                                        @Override
                                        public final void run() {
                                            zArr[0] = true;
                                            jva.this.f(tL_payments_paymentFormStarGift3, starGift3, j7, tL_textWithEntities3, z3, jacVar3);
                                        }
                                    }, 0L);
                                    dxaVar.setOnDismissListener(new eua((byte) 2, jacVar3, zArr));
                                    dxaVar.show();
                                    return;
                                } else if ("STARGIFT_USAGE_LIMITED".equals(tL_error2.text)) {
                                    jacVar3.a(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                                    return;
                                }
                            }
                            jacVar3.a(Boolean.FALSE, null);
                            if (tL_error2 != null) {
                                str2 = tL_error2.text;
                            } else {
                                str2 = "FAILED_SEND_STARS";
                            }
                            Y.Q(2131624012, 36, jb6.a0(null, null, 2131743565, str2)).j();
                            return;
                        }
                        Utilities.d.c(new dua(jvaVar2, (TLRPC.TL_payments_paymentResult) tLObject2, (byte) 4));
                        jvaVar2.D = false;
                        jvaVar2.E = true;
                        jvaVar2.G = 0L;
                        jvaVar2.T();
                        jvaVar2.M(j7);
                        jvaVar2.P(true);
                        jacVar3.a(Boolean.TRUE, null);
                        mk0 b = ok0.a(jvaVar2.a).b();
                        if (b != null && b.a(j7)) {
                            SharedPreferences.Editor edit = oc7.r1(jvaVar2.a).X3.edit();
                            edit.putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j7, false).apply();
                        }
                        SharedPreferences.Editor edit2 = oc7.r1(jvaVar2.a).X3.edit();
                        SharedPreferences.Editor putBoolean = edit2.putBoolean("show_gift_for_" + j7, true);
                        putBoolean.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j7, true).apply();
                        LaunchActivity launchActivity = LaunchActivity.H1;
                        if (launchActivity != null && (v16Var = launchActivity.w0) != null) {
                            v16Var.c(true);
                        }
                    }
                });
            }
        });
    }

    public final void f0(LaunchActivity launchActivity, long j, String str) {
        if (m().amount < j && j > 0) {
            new dxa(launchActivity, null, j, 4, str, new jd((byte) 10), 0L).show();
            return;
        }
        d S2 = LaunchActivity.S();
        if (S2 == null) {
            return;
        }
        u31 K = c41.b0(S2).K(2131624221, jb6.M0(2131744653, null), jb6.M0(2131744652, null), new bo6((byte) 29));
        K.j = 5000;
        K.k(true);
    }

    public final void g(final TL_stars.StarGift starGift, final boolean z, final boolean z2, final long j, final TLRPC.TL_textWithEntities tL_textWithEntities, final y2a y2aVar) {
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = a.b;
        }
        final Context context2 = context;
        final ylb F = F();
        if (starGift != null && context2 != null) {
            if (!this.e) {
                o(new Runnable() {
                    @Override
                    public final void run() {
                        jva jvaVar = jva.this;
                        boolean z3 = jvaVar.e;
                        y2a y2aVar2 = y2aVar;
                        if (!z3) {
                            jva.c("NO_BALANCE");
                            y2aVar2.a(Boolean.FALSE, null);
                            return;
                        }
                        jvaVar.g(starGift, z, z2, j, tL_textWithEntities, y2aVar2);
                    }
                });
                return;
            }
            final String k = pg3.k(this.a, j);
            final TLRPC.TL_inputInvoiceStarGift tL_inputInvoiceStarGift = new TLRPC.TL_inputInvoiceStarGift();
            tL_inputInvoiceStarGift.hide_name = z;
            tL_inputInvoiceStarGift.peer = oc7.r1(this.a).i1(j);
            tL_inputInvoiceStarGift.gift_id = starGift.id;
            tL_inputInvoiceStarGift.include_upgrade = z2;
            if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                tL_inputInvoiceStarGift.flags |= 2;
                tL_inputInvoiceStarGift.message = tL_textWithEntities;
            }
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject u = wx0.u(F, false);
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
                    final jva jvaVar = jva.this;
                    final y2a y2aVar2 = y2aVar;
                    final TLRPC.TL_inputInvoiceStarGift tL_inputInvoiceStarGift2 = tL_inputInvoiceStarGift;
                    final Context context3 = context2;
                    final ylb ylbVar = F;
                    final String str = k;
                    final TL_stars.StarGift starGift2 = starGift;
                    final boolean z3 = z;
                    final boolean z4 = z2;
                    final long j2 = j;
                    final TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_textWithEntities;
                    gm.c3(new Runnable() {
                        @Override
                        public final void run() {
                            String str2;
                            TLObject tLObject2 = tLObject;
                            boolean z5 = tLObject2 instanceof TLRPC.TL_payments_paymentFormStarGift;
                            final y2a y2aVar3 = y2aVar2;
                            if (!z5) {
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    str2 = "NO_PAYMENT_FORM";
                                } else {
                                    str2 = tL_error2.text;
                                }
                                jva.c(str2);
                                y2aVar3.a(Boolean.FALSE, null);
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
                            final jva jvaVar2 = jva.this;
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(jvaVar2.a);
                            final Context context4 = context3;
                            final ylb ylbVar2 = ylbVar;
                            final String str3 = str;
                            final TL_stars.StarGift starGift3 = starGift2;
                            final boolean z6 = z3;
                            final boolean z7 = z4;
                            final long j4 = j2;
                            final TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_textWithEntities2;
                            connectionsManager.sendRequest(tL_payments_sendStarsForm, new RequestDelegate() {
                                @Override
                                public final void run(final TLObject tLObject3, final TLRPC.TL_error tL_error3) {
                                    final jva jvaVar3 = jva.this;
                                    final y2a y2aVar4 = y2aVar3;
                                    final Context context5 = context4;
                                    final ylb ylbVar3 = ylbVar2;
                                    final long j5 = j3;
                                    final String str4 = str3;
                                    final TL_stars.StarGift starGift4 = starGift3;
                                    final boolean z8 = z6;
                                    final boolean z9 = z7;
                                    final long j6 = j4;
                                    final TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_textWithEntities3;
                                    gm.c3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            c41 Y;
                                            String str5;
                                            SpannableStringBuilder spannableStringBuilder;
                                            v16 v16Var;
                                            ?? r10;
                                            String str6;
                                            jva jvaVar4 = jva.this;
                                            TLObject tLObject4 = tLObject3;
                                            TLRPC.TL_error tL_error4 = tL_error3;
                                            y2a y2aVar5 = y2aVar4;
                                            Context context6 = context5;
                                            ylb ylbVar4 = ylbVar3;
                                            long j7 = j5;
                                            String str7 = str4;
                                            TL_stars.StarGift starGift5 = starGift4;
                                            boolean z10 = z8;
                                            boolean z11 = z9;
                                            long j8 = j6;
                                            TLRPC.TL_textWithEntities tL_textWithEntities5 = tL_textWithEntities4;
                                            d Q = LaunchActivity.Q();
                                            if (Q != null && Q.visibleDialog == null) {
                                                Y = c41.b0(Q);
                                            } else {
                                                Y = c41.Y();
                                            }
                                            if (!(tLObject4 instanceof TLRPC.TL_payments_paymentResult)) {
                                                if (tL_error4 != null) {
                                                    if ("BALANCE_TOO_LOW".equals(tL_error4.text)) {
                                                        if (!oc7.r1(jvaVar4.a).c5()) {
                                                            y2aVar5.a(Boolean.FALSE, null);
                                                            jva.c0(context6, ylbVar4);
                                                            return;
                                                        }
                                                        boolean[] zArr = {false};
                                                        dxa dxaVar = new dxa(context6, ylbVar4, j7, 6, str7, new iua(jvaVar4, zArr, starGift5, z10, z11, j8, tL_textWithEntities5, y2aVar5), 0L);
                                                        dxaVar.setOnDismissListener(new dg(y2aVar5, zArr, (byte) 16));
                                                        dxaVar.show();
                                                        return;
                                                    } else if ("STARGIFT_USAGE_LIMITED".equals(tL_error4.text)) {
                                                        y2aVar5.a(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                                                        return;
                                                    } else if ("STARGIFT_USER_USAGE_LIMITED".equals(tL_error4.text)) {
                                                        y2aVar5.a(Boolean.FALSE, "STARGIFT_USER_USAGE_LIMITED");
                                                        return;
                                                    }
                                                }
                                                y2aVar5.a(Boolean.FALSE, null);
                                                if (tL_error4 != null) {
                                                    str6 = tL_error4.text;
                                                } else {
                                                    str6 = "FAILED_SEND_STARS";
                                                }
                                                Y.Q(2131624012, 36, jb6.a0(null, null, 2131743565, str6)).j();
                                                return;
                                            }
                                            Utilities.d.c(new dua(jvaVar4, (TLRPC.TL_payments_paymentResult) tLObject4, (byte) 2));
                                            jvaVar4.D = false;
                                            jvaVar4.E = true;
                                            jvaVar4.G = 0L;
                                            jvaVar4.T();
                                            jvaVar4.M(j8);
                                            jvaVar4.P(true);
                                            y2aVar5.a(Boolean.TRUE, null);
                                            mk0 b = ok0.a(jvaVar4.a).b();
                                            if (b != null && b.a(j8)) {
                                                oc7.r1(jvaVar4.a).X3.edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j8, false).apply();
                                            }
                                            if (starGift5 != null && starGift5.limited_per_user) {
                                                int i2 = starGift5.per_user_remains - 1;
                                                starGift5.per_user_remains = i2;
                                                spannableStringBuilder = gm.S2(jb6.H(',', "Gift2SentRemainsLimit", Math.max(0, i2)));
                                                str5 = str7;
                                            } else {
                                                str5 = str7;
                                                spannableStringBuilder = null;
                                            }
                                            if (j8 < 0) {
                                                long j9 = -j8;
                                                TLRPC.ChatFull M0 = oc7.r1(jvaVar4.a).M0(j9);
                                                if (M0 != null) {
                                                    M0.stargifts_count++;
                                                    M0.flags2 |= 262144;
                                                    oc7.r1(jvaVar4.a).W3(M0);
                                                }
                                                if (Q instanceof ProfileActivity) {
                                                    ProfileActivity profileActivity = (ProfileActivity) Q;
                                                    if (profileActivity.a() == j8) {
                                                        wp8 wp8Var = profileActivity.O;
                                                        if (wp8Var != null) {
                                                            wp8Var.N1(true);
                                                            profileActivity.O.f1(14);
                                                            r10 = 0;
                                                            profileActivity.n3(false);
                                                        } else {
                                                            r10 = 0;
                                                        }
                                                        c41 b0 = c41.b0(Q);
                                                        TLRPC.Document document = starGift5.sticker;
                                                        String M02 = jb6.M0(2131744798, null);
                                                        if (spannableStringBuilder == null) {
                                                            Object[] objArr = new Object[1];
                                                            objArr[r10] = str5;
                                                            spannableStringBuilder = gm.S2(jb6.G((int) j7, "StarsGiftCompletedChannelText", objArr));
                                                        }
                                                        b0.s(document, M02, spannableStringBuilder).k(r10);
                                                    }
                                                }
                                                Bundle bundle = new Bundle();
                                                bundle.putLong("chat_id", j9);
                                                bundle.putBoolean("open_gifts", true);
                                                ProfileActivity profileActivity2 = new ProfileActivity(bundle, null);
                                                profileActivity2.whenFullyVisible(new r97(profileActivity2, starGift5, spannableStringBuilder, j7, str5, (byte) 18));
                                                Q.presentFragment(profileActivity2);
                                            } else if ((Q instanceof yv1) && ((yv1) Q).a() == j8) {
                                                c41 b02 = c41.b0(Q);
                                                TLRPC.Document document2 = starGift5.sticker;
                                                String M03 = jb6.M0(2131744798, null);
                                                if (spannableStringBuilder == null) {
                                                    spannableStringBuilder = gm.S2(jb6.G((int) j7, "StarsGiftCompletedText", new Object[0]));
                                                }
                                                b02.s(document2, M03, spannableStringBuilder).k(true);
                                            } else {
                                                nm7 f = nm7.f(jvaVar4.a);
                                                int i3 = nm7.u;
                                                Long valueOf = Long.valueOf(j8);
                                                Boolean bool = Boolean.FALSE;
                                                f.k(i3, valueOf, bool);
                                                nm7.f(jvaVar4.a).k(nm7.t, Long.valueOf(j8), bool);
                                                yv1 ga = yv1.ga(j8);
                                                ga.whenFullyVisible(new nz8(ga, starGift5, spannableStringBuilder, j7, (byte) 7));
                                                Q.presentFragment(ga);
                                            }
                                            oc7.r1(jvaVar4.a).X3.edit().putBoolean("show_gift_for_" + j8, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j8, true).apply();
                                            LaunchActivity launchActivity = LaunchActivity.H1;
                                            if (launchActivity != null && (v16Var = launchActivity.w0) != null) {
                                                v16Var.c(true);
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
        togglenopaidmessagesexception.user_id = oc7.r1(i).n1(j);
        if (j2 != 0) {
            togglenopaidmessagesexception.parent_peer = oc7.r1(i).i1(j2);
        }
        togglenopaidmessagesexception.refund_charged = z;
        togglenopaidmessagesexception.require_payment = !z2;
        ConnectionsManager.getInstance(i).sendRequest(togglenopaidmessagesexception, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                gm.c3(new od7(jva.this, tLObject, j2, j, z2));
            }
        });
    }

    public final void h0(String str, TLRPC.ChatInvite chatInvite, jac jacVar) {
        String str2;
        if (chatInvite != null && chatInvite.subscription_pricing != null) {
            Context context = LaunchActivity.H1;
            if (context == null) {
                context = a.b;
            }
            Context context2 = context;
            ylb F = F();
            long j = chatInvite.subscription_pricing.amount;
            if (context2 != null) {
                int i = z8c.t0;
                boolean[] zArr = {false};
                uua uuaVar = new uua(this, j, i, zArr, jacVar, context2, F, chatInvite, str);
                e6a e6aVar = new e6a(this, zArr, jacVar);
                my0 h = hg9.h(1, F, context2, false);
                LinearLayout i2 = hg9.i(context2, 1);
                i2.setPadding(gm.L(16.0f), 0, gm.L(16.0f), gm.L(8.0f));
                FrameLayout frameLayout = new FrameLayout(context2);
                frameLayout.addView(new uwa(context2, 40, 0), qoe.c(-1.0f, -1));
                bf0 bf0Var = new bf0(context2);
                bf0Var.setRoundRadius(gm.L(80.0f));
                pc0 pc0Var = new pc0((ylb) null);
                pc0Var.r(chatInvite.color);
                String str3 = chatInvite.title;
                pc0Var.A = true;
                pc0Var.n = (byte) 0;
                pc0Var.m = false;
                pc0.a(str3, null, null, pc0Var.q);
                TLRPC.Photo photo = chatInvite.photo;
                if (photo != null) {
                    bf0Var.m(gn5.i(bc4.w(photo.sizes, gm.L(80.0f), false, null, false), chatInvite.photo), "80_80", pc0Var, chatInvite);
                } else {
                    bf0Var.setImageDrawable(pc0Var);
                }
                frameLayout.addView(bf0Var, qoe.e(80, 80, 17));
                Drawable drawable = context2.getResources().getDrawable(2131232770);
                int i3 = cmb.g5;
                anb.x(frameLayout, drawable, i3, F, PorterDuff.Mode.SRC_IN);
                Drawable drawable2 = context2.getResources().getDrawable(2131232769);
                ImageView imageView = new ImageView(context2);
                imageView.setImageDrawable(drawable);
                frameLayout.addView(imageView, qoe.e(26, 26, 17));
                imageView.setTranslationX(gm.L(26.0f));
                imageView.setTranslationY(gm.L(26.0f));
                imageView.setScaleX(1.2f);
                imageView.setScaleY(1.2f);
                ImageView imageView2 = new ImageView(context2);
                imageView2.setImageDrawable(drawable2);
                frameLayout.addView(imageView2, qoe.e(26, 26, 17));
                imageView2.setTranslationX(gm.L(26.0f));
                imageView2.setTranslationY(gm.L(26.0f));
                cxa cxaVar = new cxa(i, F, context2);
                rve.a(cxaVar);
                cxaVar.setOnClickListener(new jwa(cxaVar, (byte) 0));
                frameLayout.addView(cxaVar, qoe.d(-2, -2.0f, 53, 0.0f, 0.0f, -8.0f, 0.0f));
                i2.addView(frameLayout, qoe.r(-1, 117, 7));
                TextView textView = new TextView(context2);
                textView.setTextSize(1, 20.0f);
                textView.setTypeface(gm.o());
                int i4 = cmb.i5;
                wi8.x(textView, i4, F, null, 2131744701);
                textView.setGravity(17);
                TextView m = wi8.m(i2, textView, qoe.t(-2, -2, 1, 0, 8, 0, 0), context2);
                m.setTextSize(1, 14.0f);
                anb.X(m, i4, F);
                TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                int i5 = tL_starsSubscriptionPricing.period;
                if (i5 == 2592000) {
                    m.setText(gm.S2(jb6.G((int) tL_starsSubscriptionPricing.amount, "StarsSubscribeText", chatInvite.title)));
                } else {
                    if (i5 == 300) {
                        str2 = "5 minutes";
                    } else {
                        str2 = "a minute";
                    }
                    m.setText(gm.S2(jb6.G((int) tL_starsSubscriptionPricing.amount, "StarsSubscribeTextTest", chatInvite.title, str2)));
                }
                m.setMaxWidth(hg5.a(m.getText(), m.getPaint()));
                m.setGravity(17);
                i2.addView(m, qoe.t(-2, -2, 1, 0, 6, 0, 22));
                if (!TextUtils.isEmpty(chatInvite.about)) {
                    TextView textView2 = new TextView(context2);
                    textView2.setTextSize(1, 14.0f);
                    anb.X(textView2, i4, F);
                    textView2.setText(gw3.m(chatInvite.about, textView2.getPaint().getFontMetricsInt(), false, null, 0));
                    textView2.setGravity(17);
                    i2.addView(textView2, qoe.t(-2, -2, 1, 0, 6, 0, 22));
                }
                b61 b61Var = new b61(F, context2, true);
                b61Var.i(jb6.M0(2131744710, null), false, true);
                i2.addView(b61Var, qoe.o(-1, 48));
                l66 l66Var = new l66(context2, F);
                l66Var.setText(gm.N2(jb6.M0(2131744709, null), -1, 0, new dh1(context2, (byte) 19), null));
                l66Var.setGravity(17);
                l66Var.setTextSize(1, 13.0f);
                anb.X(l66Var, cmb.A6, F);
                anb.G(l66Var, cmb.Wc, F);
                i2.addView(l66Var, qoe.t(-1, -2, 49, 14, 14, 14, 6));
                h.O = i2;
                b61Var.setOnClickListener(new jw4(uuaVar, h, b61Var, (byte) 21));
                h.setOnDismissListener(new qj8(e6aVar, (byte) 8));
                h.L(i3);
                d S2 = LaunchActivity.S();
                if (!gm.O1() && S2 != null && !gm.s1(S2)) {
                    h.X(S2);
                }
                h.show();
            }
        }
    }

    public final void i0(TL_stars.StarsAmount starsAmount) {
        boolean equals = this.f.equals(starsAmount);
        int i = nm7.A3;
        int i2 = this.a;
        if (!equals) {
            this.f = starsAmount;
            this.g = 0L;
            nm7.f(i2).k(i, new Object[0]);
        } else if (this.g != 0) {
            this.g = 0L;
            nm7.f(i2).k(i, new Object[0]);
        }
    }

    public final void j0(final k47 k47Var, final long j, final Runnable runnable, final boolean z) {
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia;
        if (k47Var == null) {
            runnable.run();
            return;
        }
        final long B0 = k47.B0(k47Var.k);
        final int e1 = k47Var.e1();
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia2 = (TLRPC.TL_messageMediaPaidMedia) k47Var.k.media;
        TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
        int i = this.a;
        tL_messages_editMessage.peer = oc7.r1(i).i1(B0);
        int i2 = tL_messages_editMessage.flags;
        tL_messages_editMessage.flags = 32768 | i2;
        tL_messages_editMessage.schedule_date = k47Var.k.date;
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
                gm.c3(new yc7(jva.this, tLObject, runnable, tL_error, z, B0, e1, k47Var, j));
            }
        });
    }

    public final TL_stars.SavedStarGift k(long j) {
        TL_stars.StarGift starGift;
        int i = 0;
        while (true) {
            LongSparseArray longSparseArray = this.L;
            if (i < longSparseArray.size()) {
                ava avaVar = (ava) longSparseArray.valueAt(i);
                for (int i2 = 0; i2 < avaVar.l.size(); i2++) {
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) avaVar.l.get(i2);
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
            ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getStarsStatus, new ara(this, runnable, (byte) 2));
        }
        if (z && this.g > 0) {
            nk n = nk.n(this.f);
            return nk.h(Math.max(0L, n.a() - this.g), n.a).q();
        }
        return this.f;
    }

    public final void o(Runnable runnable) {
        n(runnable, true, false);
    }

    public final nk p() {
        ok okVar;
        nk m = nk.m(m());
        if (m == null) {
            if (this.b) {
                okVar = ok.b;
            } else {
                okVar = ok.a;
            }
            return nk.j(0L, okVar);
        }
        return m;
    }

    public final ArrayList r() {
        if (!this.k && !this.l) {
            this.k = true;
            ConnectionsManager.getInstance(this.a).sendRequest(new TL_stars.TL_payments_getStarsGiftOptions(), new jua(this, (byte) 3));
            return this.m;
        }
        return this.m;
    }

    public final ArrayList s() {
        if (!this.n && !this.o) {
            this.n = true;
            ConnectionsManager.getInstance(this.a).sendRequest(new TL_stars.TL_payments_getStarsGiveawayOptions(), new jua(this, (byte) 4));
            return this.p;
        }
        return this.p;
    }

    public final ArrayList w() {
        if (!this.h && !this.i) {
            this.h = true;
            ConnectionsManager.getInstance(this.a).sendRequest(new TL_stars.TL_payments_getStarsTopupOptions(), new jua(this, (byte) 2));
            return this.j;
        }
        return this.j;
    }

    public final long x(k47 k47Var) {
        Long z1;
        Long l;
        hva hvaVar = this.B;
        if (hvaVar != null && hvaVar.a.equals(cva.b(k47Var)) && (l = this.B.n) != null) {
            return l.longValue();
        }
        if (k47Var == null) {
            z1 = null;
        } else {
            z1 = k47Var.z1();
        }
        if (z1 != null) {
            return z1.longValue();
        }
        Long w1 = oc7.r1(this.a).w1();
        if (w1 != null) {
            return w1.longValue();
        }
        return 0L;
    }

    public final long y(cva cvaVar, TLRPC.TL_messageReactions tL_messageReactions) {
        ArrayList<TLRPC.MessageReactor> arrayList;
        Long l;
        hva hvaVar = this.B;
        if (hvaVar != null && hvaVar.a.equals(cvaVar) && (l = this.B.n) != null) {
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
                        l2 = Long.valueOf(pg3.n(peer));
                        break;
                    }
                }
            }
        }
        if (l2 != null) {
            return l2.longValue();
        }
        Long w1 = oc7.r1(this.a).w1();
        if (w1 != null) {
            return w1.longValue();
        }
        return 0L;
    }

    public final void z(long j, long j2, qac qacVar) {
        TL_account.getPaidMessagesRevenue getpaidmessagesrevenue = new TL_account.getPaidMessagesRevenue();
        int i = this.a;
        getpaidmessagesrevenue.user_id = oc7.r1(i).n1(j);
        if (j2 != 0) {
            getpaidmessagesrevenue.parent_peer = oc7.r1(i).i1(j2);
        }
        ConnectionsManager.getInstance(i).sendRequest(getpaidmessagesrevenue, new th1(qacVar, (byte) 2));
    }
}
