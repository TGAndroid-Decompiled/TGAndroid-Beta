package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StrikethroughSpan;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Wallet.c;
public abstract class it7 {
    public static final HashMap a = new HashMap();
    public static final int[] b = {3000, 3000, 4000, 5000, 10000, 15000, 30000, 60000};
    public static final int[] c = {5000, 10000, 15000, 30000, 60000, 120000, 180000, 300000};

    public static void a(ms7 ms7Var, String str, TL_stars.StarGiftAttribute starGiftAttribute) {
        if (starGiftAttribute == null) {
            return;
        }
        Integer[] numArr = new Integer[1];
        String A1 = wua.A1(starGiftAttribute.rarity, numArr);
        hjb hjbVar = ms7Var.Y1;
        String str2 = starGiftAttribute.name;
        if (TextUtils.isEmpty(A1)) {
            A1 = null;
        }
        hjbVar.e(str, str2, A1, null, numArr[0]);
    }

    public static void b(ms7 ms7Var, TL_stars.StarGift starGift) {
        a(ms7Var, ob6.M0(2131750348, null), (TL_stars.starGiftAttributeModel) jxa.i(starGift.attributes, TL_stars.starGiftAttributeModel.class));
        a(ms7Var, ob6.M0(2131750341, null), (TL_stars.starGiftAttributePattern) jxa.i(starGift.attributes, TL_stars.starGiftAttributePattern.class));
        a(ms7Var, ob6.M0(2131750349, null), (TL_stars.starGiftAttributeBackdrop) jxa.i(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class));
    }

    public static void c(ms7 ms7Var, long j, int i, vnb vnbVar) {
        hjb hjbVar = ms7Var.Y1;
        if (i < 0) {
            return;
        }
        if (i > 0) {
            hjbVar.f(ob6.M0(2131749536, null), TextUtils.concat(j(p(i, j)), " ", z41.b(h(i), null, vnbVar, null)), null, null);
        }
        hjbVar.f(ob6.M0(2131749493, null), j(j - p(i, j)), null, null);
    }

    public static void d(final Context context, final int i, final TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, final TLRPC.TL_textWithEntities tL_textWithEntities, boolean z, final vnb vnbVar, vra vraVar, d31 d31Var, final wra wraVar, final xra xraVar) {
        final long j2;
        TLRPC.InputPeer inputPeer;
        if (!TextUtils.isEmpty(tL_starGiftUnique.slug)) {
            final long e = yac.h(i).e();
            if (j != 0 && j != e) {
                j2 = j;
            } else {
                j2 = 0;
            }
            int i2 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
            if (i2 != 0) {
                inputPeer = uc7.s1(i).j1(j2);
            } else {
                inputPeer = null;
            }
            if (i2 == 0 || inputPeer != null) {
                final long j3 = tL_starGiftUnique.getResellAmount(pj.b).b;
                long z2 = c.C(i).z();
                if (z2 < j3 && z15.c(i)) {
                    vraVar.a(Boolean.TRUE);
                    gt7 gt7Var = new gt7(vraVar, z2, j3, context, i, vnbVar, tL_starGiftUnique, j, tL_textWithEntities, z, d31Var, wraVar, xraVar);
                    boolean z3 = f11.a;
                    yt4 yt4Var = new yt4(gt7Var, (byte) 4);
                    TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
                    tL_payments_getStarsRevenueStats.ton = true;
                    tL_payments_getStarsRevenueStats.peer = new TLRPC.TL_inputPeerSelf();
                    ConnectionsManager.getInstance(i).sendRequest(tL_payments_getStarsRevenueStats, new ye(yt4Var, (byte) 29));
                } else if (!ms7.Z0(context, i, vnbVar, j3, 2131749575)) {
                } else {
                    TL_stars.buyStarGiftOnchain buystargiftonchain = new TL_stars.buyStarGiftOnchain();
                    buystargiftonchain.slug = tL_starGiftUnique.slug;
                    buystargiftonchain.expected_amount = j3;
                    buystargiftonchain.peer = inputPeer;
                    buystargiftonchain.message = tL_textWithEntities;
                    buystargiftonchain.show_name = z;
                    final String i3 = i(tL_starGiftUnique);
                    q(context, i, buystargiftonchain, Boolean.valueOf(tL_starGiftUnique.fixed_sale), vnbVar, vraVar, d31Var, new icc() {
                        @Override
                        public final void a(Object obj, Object obj2) {
                            int i4;
                            String str;
                            a35 a35Var = (a35) obj;
                            Boolean bool = (Boolean) obj2;
                            boolean booleanValue = bool.booleanValue();
                            long j4 = j3;
                            Context context2 = context;
                            vnb vnbVar2 = vnbVar;
                            if (!booleanValue && a35Var.b != j4) {
                                it7.s(context2, vnbVar2, ob6.M0(it7.f(bool, 2131749602, 2131749601, 2131749601), null), bool);
                                return;
                            }
                            a35Var.h = new TL_wallet.walletOnchainGiftActionBuy();
                            long j5 = a35Var.b;
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = tL_starGiftUnique;
                            a35Var.i = tL_starGiftUnique2;
                            int i5 = i;
                            ms7 ms7Var = new ms7(context2, i5, tL_starGiftUnique2, vnbVar2);
                            String M0 = ob6.M0(2131749620, null);
                            if (bool.booleanValue()) {
                                i4 = 2131749621;
                            } else {
                                i4 = 2131749622;
                            }
                            String a0 = ob6.a0(null, null, 2131749580, oj.j(j4, pj.b).d());
                            String str2 = i3;
                            ms7Var.h1(hl.S2(ob6.a0(null, null, i4, str2, a0)), M0);
                            String M02 = ob6.M0(2131749496, null);
                            SpannableStringBuilder m = it7.m(j4);
                            hjb hjbVar = ms7Var.Y1;
                            hjbVar.f(M02, m, null, null);
                            if (j5 > j4) {
                                hjbVar.f(ob6.M0(2131749501, null), it7.j(j5 - j4), null, null);
                            }
                            long j6 = j2;
                            if (j6 != 0) {
                                hjbVar.f(ob6.M0(2131742671, null), wf3.k(i5, j6), null, null);
                                TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_textWithEntities;
                                if (tL_textWithEntities2 != null && !TextUtils.isEmpty(tL_textWithEntities2.text)) {
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities2.text);
                                    r47.b(spannableStringBuilder, tL_textWithEntities2.entities, false, false, false, false, 0);
                                    str = null;
                                    hjbVar.f(ob6.M0(2131748357, null), pv3.m(spannableStringBuilder, null, false, null, 0), null, null);
                                } else {
                                    str = null;
                                }
                            } else {
                                str = null;
                                hjbVar.f(ob6.M0(2131749493, null), str2, null, null);
                            }
                            it7.b(ms7Var, tL_starGiftUnique2);
                            ms7Var.e1(ob6.M0(2131749623, str));
                            ms7Var.p2 = 2131749575;
                            ms7Var.f1(a35Var);
                            ms7Var.d1(new wy(wraVar, tL_starGiftUnique2, j6, str2, i5), new hc2(tL_starGiftUnique2, str2, xraVar, i5, j6, e), new xs7(context2, i5, vnbVar2, ms7Var, bool, (byte) 0));
                            ms7Var.show();
                        }
                    });
                }
            }
        }
    }

    public static void e(final Context context, final int i, final TL_stars.TL_starGiftUnique tL_starGiftUnique, final long j, final TLRPC.TL_textWithEntities tL_textWithEntities, final boolean z, final vnb vnbVar, final vra vraVar, final d31 d31Var, final wra wraVar, final xra xraVar) {
        int i2;
        final long j2;
        final TLRPC.InputPeer inputPeer;
        if (!TextUtils.isEmpty(tL_starGiftUnique.slug) && j >= 0) {
            final long e = yac.h(i).e();
            if (i2 != 0 && j != e) {
                j2 = j;
            } else {
                j2 = 0;
            }
            int i3 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
            if (i3 != 0) {
                inputPeer = uc7.s1(i).j1(j2);
            } else {
                inputPeer = null;
            }
            if (i3 == 0 || inputPeer != null) {
                String str = tL_starGiftUnique.slug;
                HashMap hashMap = a;
                Long l = (Long) hashMap.get(i + "_" + str);
                if (l != null) {
                    if (SystemClock.elapsedRealtime() - l.longValue() > 600000) {
                        hashMap.remove(i + "_" + str);
                    } else {
                        s(context, vnbVar, ob6.M0(2131749389, null), null);
                        return;
                    }
                }
                final long a2 = tL_starGiftUnique.getResellAmount(pj.a).a();
                final String i4 = i(tL_starGiftUnique);
                r(i, tL_starGiftUnique, inputPeer, tL_textWithEntities, z, 0L, vraVar, new icc() {
                    @Override
                    public final void a(Object obj, Object obj2) {
                        String str2;
                        String str3;
                        ?? r10;
                        String a0;
                        char c2;
                        String str4;
                        a35 a35Var = (a35) obj;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        final Context context2 = context;
                        final int i5 = i;
                        final vnb vnbVar2 = vnbVar;
                        d31 d31Var2 = d31Var;
                        final long j3 = j2;
                        if (a35Var == null) {
                            it7.w(context2, i5, vnbVar2, d31Var2, tL_error, j3);
                        } else if (!ms7.Z0(context2, i5, vnbVar2, a35Var.b, 2131749575)) {
                        } else {
                            long j4 = a35Var.b;
                            final TL_stars.TL_starGiftUnique tL_starGiftUnique2 = tL_starGiftUnique;
                            final ms7 ms7Var = new ms7(context2, i5, tL_starGiftUnique2, vnbVar2);
                            long j5 = a2;
                            String H = ob6.H(',', "Stars", (int) j5);
                            String a02 = ob6.a0(null, null, 2131749580, oj.j(j4, pj.b).d());
                            String M0 = ob6.M0(2131749393, null);
                            int i6 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                            String str5 = i4;
                            if (i6 != 0) {
                                Object[] objArr = {str5, H, a02, wf3.r(i5, j3)};
                                str2 = a02;
                                str3 = H;
                                r10 = 0;
                                a0 = ob6.a0(null, null, 2131749394, objArr);
                            } else {
                                str2 = a02;
                                str3 = H;
                                r10 = 0;
                                a0 = ob6.a0(null, null, 2131749395, str5, str3, str2);
                            }
                            ms7Var.h1(hl.S2(a0), M0);
                            String M02 = ob6.M0(2131749496, r10);
                            SpannableStringBuilder b1 = nza.b1(false, "⭐️ ".concat(ob6.E(j5, ',')), 0.8f, r10);
                            hjb hjbVar = ms7Var.Y1;
                            hjbVar.f(M02, b1, r10, r10);
                            hjbVar.f(ob6.M0(2131749382, r10), it7.m(j4), r10, r10);
                            TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_textWithEntities;
                            if (i6 != 0) {
                                hjbVar.f(ob6.M0(2131742671, r10), wf3.k(i5, j3), r10, r10);
                                if (tL_textWithEntities2 != null && !TextUtils.isEmpty(tL_textWithEntities2.text)) {
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities2.text);
                                    r47.b(spannableStringBuilder, tL_textWithEntities2.entities, false, false, false, false, 0);
                                    str4 = null;
                                    c2 = 0;
                                    hjbVar.f(ob6.M0(2131748357, null), pv3.m(spannableStringBuilder, null, false, null, 0), null, null);
                                } else {
                                    str4 = null;
                                    c2 = 0;
                                }
                            } else {
                                ?? r12 = r10;
                                c2 = 0;
                                hjbVar.f(ob6.M0(2131749493, r12), str5, r12, r12);
                                str4 = r12;
                            }
                            it7.b(ms7Var, tL_starGiftUnique2);
                            Object[] objArr2 = new Object[1];
                            objArr2[c2] = str3;
                            ms7Var.g1(ob6.a0(str4, str4, 2131749385, objArr2));
                            Object[] objArr3 = new Object[1];
                            objArr3[c2] = str2;
                            ms7Var.e1(ob6.a0(str4, str4, 2131749383, objArr3));
                            ms7Var.p2 = 2131749575;
                            ms7Var.f1(a35Var);
                            TLRPC.InputPeer inputPeer2 = inputPeer;
                            boolean z2 = z;
                            long j6 = j;
                            vra vraVar2 = vraVar;
                            wra wraVar2 = wraVar;
                            xra xraVar2 = xraVar;
                            ms7Var.w2 = new ct7(i5, tL_starGiftUnique2, inputPeer2, tL_textWithEntities2, z2, j4, ms7Var, context2, j6, vnbVar2, vraVar2, d31Var2, wraVar2, xraVar2, j3);
                            final long j7 = e;
                            ms7Var.d1(new ic2(i5, tL_starGiftUnique2, j3, j7, wraVar2, str5, (byte) 6), new zo2(i5, tL_starGiftUnique2, str5, xraVar2), new pcc() {
                                @Override
                                public final void a(Object obj3) {
                                    long j8;
                                    String str6 = (String) obj3;
                                    boolean equals = "WALLET_SEND_UNCERTAIN".equals(str6);
                                    int i7 = i5;
                                    long j9 = j3;
                                    if (equals) {
                                        TL_stars.TL_starGiftUnique tL_starGiftUnique3 = tL_starGiftUnique2;
                                        it7.o(i7, tL_starGiftUnique3.slug, true);
                                        String str7 = tL_starGiftUnique3.slug;
                                        if (j9 != 0) {
                                            j8 = j9;
                                        } else {
                                            j8 = j7;
                                        }
                                        jn7 f = jn7.f(i7);
                                        at7 at7Var = new at7(r0, f);
                                        et7 et7Var = new et7(str7, i7, j8, at7Var);
                                        fn7[] fn7VarArr = {et7Var};
                                        f.a(et7Var, 1);
                                        hl.d3(at7Var, 600000L);
                                    }
                                    it7.w(context2, i7, vnbVar2, ms7Var.j(), str6, j9);
                                }
                            });
                            ms7Var.show();
                        }
                    }
                });
            }
        }
    }

    public static int f(Boolean bool, int i, int i2, int i3) {
        if (bool == null) {
            return i3;
        }
        if (bool.booleanValue()) {
            return i2;
        }
        return i;
    }

    public static int g(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i;
        if (tL_starGiftUnique != null && (tL_starGiftUnique.flags & 1048576) != 0 && (i = tL_starGiftUnique.fee_bps) >= 0) {
            return i;
        }
        return -1;
    }

    public static String h(int i) {
        BigDecimal stripTrailingZeros;
        StringBuilder sb = new StringBuilder();
        BigDecimal movePointLeft = new BigDecimal(i).movePointLeft(2);
        if (movePointLeft.signum() == 0) {
            stripTrailingZeros = new BigDecimal(BigInteger.ZERO, 0);
        } else {
            stripTrailingZeros = movePointLeft.stripTrailingZeros();
        }
        sb.append(stripTrailingZeros.toPlainString());
        sb.append("%");
        return sb.toString();
    }

    public static String i(TL_stars.StarGift starGift) {
        StringBuilder sb = new StringBuilder();
        sb.append(starGift.title);
        sb.append(" #");
        return qu6.m(starGift.num, ',', sb);
    }

    public static SpannableStringBuilder j(long j) {
        return nza.b1(true, "⭐️ ".concat(oj.j(j, pj.b).d()), 0.8f, null);
    }

    public static SpannableStringBuilder k(long j) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(j(j));
        spannableStringBuilder.setSpan(new StrikethroughSpan(), TextUtils.indexOf((CharSequence) spannableStringBuilder, ' ') + 1, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static String l(long j) {
        return ob6.a0(null, null, 2131749580, c.s(j, false));
    }

    public static SpannableStringBuilder m(long j) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(j(j));
        String x = x(j);
        if (x != null) {
            spannableStringBuilder.append((CharSequence) " (~").append((CharSequence) x).append((CharSequence) ")");
        }
        return spannableStringBuilder;
    }

    public static boolean n(TL_stars.StarGift starGift) {
        ArrayList<TL_stars.StarsAmount> arrayList;
        if (y(starGift) && (arrayList = starGift.resell_amount) != null && !arrayList.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void o(int i, String str, boolean z) {
        HashMap hashMap = a;
        if (z) {
            hashMap.put(i + "_" + str, Long.valueOf(SystemClock.elapsedRealtime()));
            return;
        }
        hashMap.remove(i + "_" + str);
    }

    public static long p(int i, long j) {
        if (j <= 0 || i <= 0) {
            return 0L;
        }
        long j2 = i;
        return (((j % 10000) * j2) / 10000) + ((j / 10000) * j2);
    }

    public static void q(Context context, int i, TLMethod tLMethod, Boolean bool, vnb vnbVar, pcc pccVar, d31 d31Var, icc iccVar) {
        pccVar.a(Boolean.TRUE);
        ConnectionsManager.getInstance(i).sendRequestTyped(tLMethod, new ic((byte) 0), new bj4(pccVar, context, i, vnbVar, d31Var, bool, iccVar));
    }

    public static void r(int i, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.InputPeer inputPeer, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z, long j, vra vraVar, icc iccVar) {
        TL_stars.buyStarGiftOnchain buystargiftonchain = new TL_stars.buyStarGiftOnchain();
        buystargiftonchain.slug = tL_starGiftUnique.slug;
        buystargiftonchain.expected_amount = j;
        buystargiftonchain.peer = inputPeer;
        buystargiftonchain.message = tL_textWithEntities;
        buystargiftonchain.show_name = z;
        if (vraVar != null) {
            vraVar.a(Boolean.TRUE);
        }
        ConnectionsManager.getInstance(i).sendRequestTyped(buystargiftonchain, new ic((byte) 0), new p(vraVar, iccVar, tL_starGiftUnique, (byte) 23), 2);
    }

    public static void s(Context context, vnb vnbVar, String str, Boolean bool) {
        int i;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, context);
        if (bool == null) {
            i = 2131689472;
        } else if (bool.booleanValue()) {
            i = 2131749587;
        } else {
            i = 2131749588;
        }
        String M0 = ob6.M0(i, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        idVar.U = str;
        c00.u(null, 2131747558, alertDialog$Builder, null);
    }

    public static void t(Context context, int i, vnb vnbVar, d31 d31Var, String str, Boolean bool) {
        String M0;
        str.getClass();
        boolean z = true;
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1717805896:
                if (str.equals("STARGIFT_ONCHAIN_OFFER_INTENT_CONFLICT")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1626727958:
                if (str.equals("STARGIFT_ONCHAIN_OFFER_ALREADY_ACTIVE")) {
                    c2 = 1;
                    break;
                }
                break;
            case -1550281532:
                if (str.equals("STARGIFT_ONCHAIN_ITEM_NOT_FOUND")) {
                    c2 = 2;
                    break;
                }
                break;
            case -1397183452:
                if (str.equals("STARGIFT_ONCHAIN_SALE_ACTIVE")) {
                    c2 = 3;
                    break;
                }
                break;
            case -1031391897:
                if (str.equals("STARGIFT_ONCHAIN_PRICE_INVALID")) {
                    c2 = 4;
                    break;
                }
                break;
            case -982862327:
                if (str.equals("STARGIFT_ONCHAIN_SALE_INACTIVE")) {
                    c2 = 5;
                    break;
                }
                break;
            case -783781934:
                if (str.equals("WALLET_UNLOCK_FAILED")) {
                    c2 = 6;
                    break;
                }
                break;
            case -736586726:
                if (str.equals("STARGIFT_ONCHAIN_SALE_DISABLED")) {
                    c2 = 7;
                    break;
                }
                break;
            case -530436904:
                if (str.equals("WALLET_SEND_UNCERTAIN")) {
                    c2 = '\b';
                    break;
                }
                break;
            case -456249281:
                if (str.equals("WALLET_CREATING")) {
                    c2 = '\t';
                    break;
                }
                break;
            case -351457906:
                if (str.equals("WALLET_SEND_FAILED")) {
                    c2 = '\n';
                    break;
                }
                break;
            case -53543396:
                if (str.equals("TRANSACTION_CREATION_FAILED")) {
                    c2 = 11;
                    break;
                }
                break;
            case 39400720:
                if (str.equals("LOCAL_STORAGE_ERROR")) {
                    c2 = '\f';
                    break;
                }
                break;
            case 86960902:
                if (str.equals("WALLET_TRANSFER_SEND_FAILED")) {
                    c2 = '\r';
                    break;
                }
                break;
            case 185207802:
                if (str.equals("PEER_INVALID")) {
                    c2 = 14;
                    break;
                }
                break;
            case 239979146:
                if (str.equals("WALLET_UNSUPPORTED_SEND_MODE")) {
                    c2 = 15;
                    break;
                }
                break;
            case 295652781:
                if (str.equals("STARGIFT_ONCHAIN_NOT_OWNER")) {
                    c2 = 16;
                    break;
                }
                break;
            case 435284510:
                if (str.equals("PASSCODE_FAILED")) {
                    c2 = 17;
                    break;
                }
                break;
            case 505128103:
                if (str.equals("STARGIFT_ONCHAIN_NOT_MINTED")) {
                    c2 = 18;
                    break;
                }
                break;
            case 762477967:
                if (str.equals("STARGIFT_ONCHAIN_OFFER_NOT_ACTIVE")) {
                    c2 = 19;
                    break;
                }
                break;
            case 1055614266:
                if (str.equals("STARGIFT_ONCHAIN_SELF_PURCHASE")) {
                    c2 = 20;
                    break;
                }
                break;
            case 1149363434:
                if (str.equals("WALLET_UNAVAILABLE")) {
                    c2 = 21;
                    break;
                }
                break;
            case 1860388416:
                if (str.equals("WALLET_SEND_CANCELLED")) {
                    c2 = 22;
                    break;
                }
                break;
            case 1937178819:
                if (str.equals("STARGIFT_ONCHAIN_NOT_FOR_SALE")) {
                    c2 = 23;
                    break;
                }
                break;
            case 2042734116:
                if (str.equals("STARGIFT_ONCHAIN_PRICE_CHANGED")) {
                    c2 = 24;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                M0 = ob6.M0(2131749559, null);
                break;
            case 1:
                M0 = ob6.M0(2131749561, null);
                break;
            case 2:
            case 23:
                M0 = ob6.M0(f(bool, 2131749609, 2131749608, 2131749608), null);
                break;
            case 3:
                M0 = ob6.M0(f(bool, 2131749598, 2131749597, 2131749597), null);
                break;
            case 4:
                hr hrVar = uc7.s1(i).k4;
                long f = hrVar.q.f();
                long f2 = hrVar.r.f();
                if (f > 0 && f2 > f) {
                    M0 = ob6.a0(null, null, 2131749599, l(f), l(f2));
                } else {
                    M0 = ob6.M0(2131749600, null);
                }
                z = false;
                break;
            case 5:
                M0 = ob6.M0(f(bool, 2131749594, 2131749593, 2131749593), null);
                break;
            case 6:
            case '\f':
                M0 = ob6.M0(2131742774, null);
                break;
            case 7:
                M0 = ob6.M0(f(bool, 2131749596, 2131749595, 2131749595), null);
                z = false;
                break;
            case '\b':
                M0 = ob6.M0(2131749589, null);
                z = false;
                break;
            case '\t':
                M0 = ob6.M0(2131749584, null);
                break;
            case '\n':
            case '\r':
                M0 = ob6.M0(2131749590, null);
                z = false;
                break;
            case 11:
                M0 = ob6.M0(2131749586, null);
                break;
            case 14:
                M0 = ob6.M0(f(bool, 2131749611, 2131749610, 2131749610), null);
                z = false;
                break;
            case 15:
                M0 = ob6.M0(2131749585, null);
                z = false;
                break;
            case 16:
                M0 = ob6.M0(f(bool, 2131749605, 2131749604, 2131749605), null);
                z = false;
                break;
            case 17:
            case 22:
                return;
            case 18:
                M0 = ob6.M0(f(bool, 2131749607, 2131749606, 2131749606), null);
                z = false;
                break;
            case 19:
                M0 = ob6.M0(2131749603, null);
                break;
            case 20:
                M0 = ob6.M0(f(bool, 2131749592, 2131749591, 2131749591), null);
                z = false;
                break;
            case 21:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, context);
                String M02 = ob6.M0(2131749470, null);
                id idVar = alertDialog$Builder.a;
                idVar.S = M02;
                idVar.U = ob6.M0(f(bool, 2131749583, 2131749582, 2131749582), null);
                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                alertDialog$Builder.j(ob6.M0(2131749505, null), new hz6((byte) 23));
                alertDialog$Builder.o();
                return;
            case 24:
                M0 = ob6.M0(f(bool, 2131749602, 2131749601, 2131749601), null);
                z = false;
                break;
            default:
                if (d31Var != null) {
                    d31Var.f0(str, false);
                    return;
                } else {
                    d31.c0(str);
                    return;
                }
        }
        if (z && d31Var != null) {
            d31Var.t(M0, vnbVar).j();
        } else {
            s(context, vnbVar, M0, bool);
        }
    }

    public static void u(Context context, int i, vnb vnbVar, d31 d31Var, TLRPC.TL_error tL_error, Boolean bool) {
        t(context, i, vnbVar, d31Var, (tL_error == null || (r10 = tL_error.text) == null) ? "NULL_ERROR" : "NULL_ERROR", bool);
    }

    public static void v(TL_stars.StarGift starGift, String str) {
        hl.c3(new pl7(starGift, str, (byte) 10));
    }

    public static void w(android.content.Context r8, int r9, defpackage.vnb r10, defpackage.d31 r11, java.lang.Object r12, long r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.it7.w(android.content.Context, int, vnb, d31, java.lang.Object, long):void");
    }

    public static String x(long j) {
        double f = oj.j(j, pj.b).f();
        if (f <= 0.0d) {
            return null;
        }
        di0.h();
        return di0.f("USD", 2, (long) (f * 100.0d), false);
    }

    public static boolean y(TL_stars.StarGift starGift) {
        if (starGift instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
            if (tL_starGiftUnique.onchain_sale || tL_starGiftUnique.fixed_sale) {
                return true;
            }
            return false;
        }
        return false;
    }
}
