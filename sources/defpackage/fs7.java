package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StrikethroughSpan;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Wallet.c;
public abstract class fs7 {
    public static final int[] a = {3000, 3000, 4000, 5000, 10000, 15000, 30000, 60000};
    public static final int[] b = {5000, 10000, 15000, 30000, 60000, 120000, 180000, 300000};

    public static void a(pr7 pr7Var, String str, TL_stars.StarGiftAttribute starGiftAttribute) {
        if (starGiftAttribute == null) {
            return;
        }
        Integer[] numArr = new Integer[1];
        String z1 = wsa.z1(starGiftAttribute.rarity, numArr);
        mhb mhbVar = pr7Var.Y1;
        String str2 = starGiftAttribute.name;
        if (TextUtils.isEmpty(z1)) {
            z1 = null;
        }
        mhbVar.e(str, str2, z1, null, numArr[0]);
    }

    public static void b(pr7 pr7Var, TL_stars.StarGift starGift) {
        a(pr7Var, jb6.M0(2131750320, null), (TL_stars.starGiftAttributeModel) jva.i(starGift.attributes, TL_stars.starGiftAttributeModel.class));
        a(pr7Var, jb6.M0(2131750313, null), (TL_stars.starGiftAttributePattern) jva.i(starGift.attributes, TL_stars.starGiftAttributePattern.class));
        a(pr7Var, jb6.M0(2131750321, null), (TL_stars.starGiftAttributeBackdrop) jva.i(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class));
    }

    public static void c(pr7 pr7Var, long j, int i, ylb ylbVar) {
        mhb mhbVar = pr7Var.Y1;
        if (i < 0) {
            return;
        }
        if (i > 0) {
            mhbVar.f(jb6.M0(2131749524, null), TextUtils.concat(i(n(i, j)), " ", y51.b(g(i), null, ylbVar, null)), null, null);
        }
        mhbVar.f(jb6.M0(2131749481, null), i(j - n(i, j)), null, null);
    }

    public static void d(final Context context, final int i, final TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, final TLRPC.TL_textWithEntities tL_textWithEntities, boolean z, final ylb ylbVar, ts9 ts9Var, c41 c41Var, final e6a e6aVar, final e6a e6aVar2) {
        final long j2;
        TLRPC.InputPeer inputPeer;
        if (!TextUtils.isEmpty(tL_starGiftUnique.slug)) {
            final long e = z8c.h(i).e();
            if (j != 0 && j != e) {
                j2 = j;
            } else {
                j2 = 0;
            }
            int i2 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
            if (i2 != 0) {
                inputPeer = oc7.r1(i).i1(j2);
            } else {
                inputPeer = null;
            }
            if (i2 == 0 || inputPeer != null) {
                final long j3 = tL_starGiftUnique.getResellAmount(ok.b).b;
                long z2 = c.C(i).z();
                if (z2 < j3 && u15.c(i)) {
                    ts9Var.a(Boolean.TRUE);
                    ds7 ds7Var = new ds7(ts9Var, z2, j3, context, i, ylbVar, tL_starGiftUnique, j, tL_textWithEntities, z, c41Var, e6aVar, e6aVar2);
                    boolean z3 = e21.a;
                    vt4 vt4Var = new vt4(ds7Var, (byte) 4);
                    TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
                    tL_payments_getStarsRevenueStats.ton = true;
                    tL_payments_getStarsRevenueStats.peer = new TLRPC.TL_inputPeerSelf();
                    ConnectionsManager.getInstance(i).sendRequest(tL_payments_getStarsRevenueStats, new tg(vt4Var, (byte) 29));
                } else if (!pr7.Y0(context, i, ylbVar, j3, 2131749563)) {
                } else {
                    TL_stars.buyStarGiftOnchain buystargiftonchain = new TL_stars.buyStarGiftOnchain();
                    buystargiftonchain.slug = tL_starGiftUnique.slug;
                    buystargiftonchain.expected_amount = j3;
                    buystargiftonchain.peer = inputPeer;
                    buystargiftonchain.message = tL_textWithEntities;
                    buystargiftonchain.show_name = z;
                    final String h = h(tL_starGiftUnique);
                    o(context, i, buystargiftonchain, Boolean.valueOf(tL_starGiftUnique.fixed_sale), ylbVar, ts9Var, c41Var, new jac() {
                        @Override
                        public final void a(Object obj, Object obj2) {
                            int i3;
                            String str;
                            w25 w25Var = (w25) obj;
                            Boolean bool = (Boolean) obj2;
                            boolean booleanValue = bool.booleanValue();
                            long j4 = j3;
                            Context context2 = context;
                            ylb ylbVar2 = ylbVar;
                            if (!booleanValue && w25Var.b != j4) {
                                fs7.p(context2, ylbVar2, jb6.M0(fs7.e(bool, 2131749589, 2131749588, 2131749588), null), bool);
                                return;
                            }
                            w25Var.h = new TL_wallet.walletOnchainGiftActionBuy();
                            long j5 = w25Var.b;
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = tL_starGiftUnique;
                            w25Var.i = tL_starGiftUnique2;
                            int i4 = i;
                            pr7 pr7Var = new pr7(context2, i4, tL_starGiftUnique2, ylbVar2);
                            String M0 = jb6.M0(2131749607, null);
                            if (bool.booleanValue()) {
                                i3 = 2131749608;
                            } else {
                                i3 = 2131749609;
                            }
                            String a0 = jb6.a0(null, null, 2131749568, nk.j(j4, ok.b).d());
                            String str2 = h;
                            pr7Var.e1(gm.S2(jb6.a0(null, null, i3, str2, a0)), M0);
                            String M02 = jb6.M0(2131749484, null);
                            SpannableStringBuilder l = fs7.l(j4);
                            mhb mhbVar = pr7Var.Y1;
                            mhbVar.f(M02, l, null, null);
                            if (j5 > j4) {
                                mhbVar.f(jb6.M0(2131749489, null), fs7.i(j5 - j4), null, null);
                            }
                            long j6 = j2;
                            if (j6 != 0) {
                                mhbVar.f(jb6.M0(2131742703, null), pg3.k(i4, j6), null, null);
                                TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_textWithEntities;
                                if (tL_textWithEntities2 != null && !TextUtils.isEmpty(tL_textWithEntities2.text)) {
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities2.text);
                                    k47.b(spannableStringBuilder, tL_textWithEntities2.entities, false, false, false, false, 0);
                                    str = null;
                                    mhbVar.f(jb6.M0(2131748360, null), gw3.m(spannableStringBuilder, null, false, null, 0), null, null);
                                } else {
                                    str = null;
                                }
                            } else {
                                str = null;
                                mhbVar.f(jb6.M0(2131749481, null), str2, null, null);
                            }
                            fs7.b(pr7Var, tL_starGiftUnique2);
                            pr7Var.c2.i(jb6.M0(2131749610, str), false, true);
                            pr7Var.p2 = 2131749563;
                            pr7Var.d1(w25Var);
                            pr7Var.c1(new wz(e6aVar, tL_starGiftUnique2, j6, str2, i4), new cd2(tL_starGiftUnique2, str2, e6aVar2, i4, j6, e), new as7(context2, i4, ylbVar2, pr7Var, bool, (byte) 1));
                            pr7Var.show();
                        }
                    });
                }
            }
        }
    }

    public static int e(Boolean bool, int i, int i2, int i3) {
        if (bool == null) {
            return i3;
        }
        if (bool.booleanValue()) {
            return i2;
        }
        return i;
    }

    public static int f(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i;
        if (tL_starGiftUnique != null && (tL_starGiftUnique.flags & 1048576) != 0 && (i = tL_starGiftUnique.fee_bps) >= 0) {
            return i;
        }
        return -1;
    }

    public static String g(int i) {
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

    public static String h(TL_stars.StarGift starGift) {
        StringBuilder sb = new StringBuilder();
        sb.append(starGift.title);
        sb.append(" #");
        return kt6.m(starGift.num, ',', sb);
    }

    public static SpannableStringBuilder i(long j) {
        return nxa.b1(true, "⭐️ ".concat(nk.j(j, ok.b).d()), 0.8f, null);
    }

    public static SpannableStringBuilder j(long j) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(i(j));
        spannableStringBuilder.setSpan(new StrikethroughSpan(), TextUtils.indexOf((CharSequence) spannableStringBuilder, ' ') + 1, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static String k(long j) {
        return jb6.a0(null, null, 2131749568, c.s(j, false));
    }

    public static SpannableStringBuilder l(long j) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(i(j));
        String t = t(j);
        if (t != null) {
            spannableStringBuilder.append((CharSequence) " (~").append((CharSequence) t).append((CharSequence) ")");
        }
        return spannableStringBuilder;
    }

    public static boolean m(TL_stars.StarGift starGift) {
        ArrayList<TL_stars.StarsAmount> arrayList;
        if (u(starGift) && (arrayList = starGift.resell_amount) != null && !arrayList.isEmpty()) {
            return true;
        }
        return false;
    }

    public static long n(int i, long j) {
        if (j <= 0 || i <= 0) {
            return 0L;
        }
        long j2 = i;
        return (((j % 10000) * j2) / 10000) + ((j / 10000) * j2);
    }

    public static void o(Context context, int i, TLMethod tLMethod, Boolean bool, ylb ylbVar, qac qacVar, c41 c41Var, jac jacVar) {
        qacVar.a(Boolean.TRUE);
        ConnectionsManager.getInstance(i).sendRequestTyped(tLMethod, new kc((byte) 0), new cj4(qacVar, context, i, ylbVar, c41Var, bool, jacVar));
    }

    public static void p(Context context, ylb ylbVar, String str, Boolean bool) {
        int i;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, context);
        if (bool == null) {
            i = 2131689472;
        } else if (bool.booleanValue()) {
            i = 2131749575;
        } else {
            i = 2131749576;
        }
        String M0 = jb6.M0(i, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        heVar.U = str;
        b10.t(null, 2131747564, alertDialog$Builder, null);
    }

    public static void q(Context context, int i, ylb ylbVar, c41 c41Var, String str, Boolean bool) {
        String M0;
        str.getClass();
        boolean z = true;
        char c = 65535;
        switch (str.hashCode()) {
            case -1717805896:
                if (str.equals("STARGIFT_ONCHAIN_OFFER_INTENT_CONFLICT")) {
                    c = 0;
                    break;
                }
                break;
            case -1626727958:
                if (str.equals("STARGIFT_ONCHAIN_OFFER_ALREADY_ACTIVE")) {
                    c = 1;
                    break;
                }
                break;
            case -1550281532:
                if (str.equals("STARGIFT_ONCHAIN_ITEM_NOT_FOUND")) {
                    c = 2;
                    break;
                }
                break;
            case -1397183452:
                if (str.equals("STARGIFT_ONCHAIN_SALE_ACTIVE")) {
                    c = 3;
                    break;
                }
                break;
            case -1031391897:
                if (str.equals("STARGIFT_ONCHAIN_PRICE_INVALID")) {
                    c = 4;
                    break;
                }
                break;
            case -982862327:
                if (str.equals("STARGIFT_ONCHAIN_SALE_INACTIVE")) {
                    c = 5;
                    break;
                }
                break;
            case -783781934:
                if (str.equals("WALLET_UNLOCK_FAILED")) {
                    c = 6;
                    break;
                }
                break;
            case -736586726:
                if (str.equals("STARGIFT_ONCHAIN_SALE_DISABLED")) {
                    c = 7;
                    break;
                }
                break;
            case -456249281:
                if (str.equals("WALLET_CREATING")) {
                    c = '\b';
                    break;
                }
                break;
            case -351457906:
                if (str.equals("WALLET_SEND_FAILED")) {
                    c = '\t';
                    break;
                }
                break;
            case -53543396:
                if (str.equals("TRANSACTION_CREATION_FAILED")) {
                    c = '\n';
                    break;
                }
                break;
            case 39400720:
                if (str.equals("LOCAL_STORAGE_ERROR")) {
                    c = 11;
                    break;
                }
                break;
            case 86960902:
                if (str.equals("WALLET_TRANSFER_SEND_FAILED")) {
                    c = '\f';
                    break;
                }
                break;
            case 185207802:
                if (str.equals("PEER_INVALID")) {
                    c = '\r';
                    break;
                }
                break;
            case 239979146:
                if (str.equals("WALLET_UNSUPPORTED_SEND_MODE")) {
                    c = 14;
                    break;
                }
                break;
            case 295652781:
                if (str.equals("STARGIFT_ONCHAIN_NOT_OWNER")) {
                    c = 15;
                    break;
                }
                break;
            case 435284510:
                if (str.equals("PASSCODE_FAILED")) {
                    c = 16;
                    break;
                }
                break;
            case 505128103:
                if (str.equals("STARGIFT_ONCHAIN_NOT_MINTED")) {
                    c = 17;
                    break;
                }
                break;
            case 762477967:
                if (str.equals("STARGIFT_ONCHAIN_OFFER_NOT_ACTIVE")) {
                    c = 18;
                    break;
                }
                break;
            case 1055614266:
                if (str.equals("STARGIFT_ONCHAIN_SELF_PURCHASE")) {
                    c = 19;
                    break;
                }
                break;
            case 1149363434:
                if (str.equals("WALLET_UNAVAILABLE")) {
                    c = 20;
                    break;
                }
                break;
            case 1860388416:
                if (str.equals("WALLET_SEND_CANCELLED")) {
                    c = 21;
                    break;
                }
                break;
            case 1937178819:
                if (str.equals("STARGIFT_ONCHAIN_NOT_FOR_SALE")) {
                    c = 22;
                    break;
                }
                break;
            case 2042734116:
                if (str.equals("STARGIFT_ONCHAIN_PRICE_CHANGED")) {
                    c = 23;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                M0 = jb6.M0(2131749547, null);
                break;
            case 1:
                M0 = jb6.M0(2131749549, null);
                break;
            case 2:
            case 22:
                M0 = jb6.M0(e(bool, 2131749596, 2131749595, 2131749595), null);
                break;
            case 3:
                M0 = jb6.M0(e(bool, 2131749585, 2131749584, 2131749584), null);
                break;
            case 4:
                gs gsVar = oc7.r1(i).l4;
                long f = gsVar.q.f();
                long f2 = gsVar.r.f();
                if (f > 0 && f2 > f) {
                    M0 = jb6.a0(null, null, 2131749586, k(f), k(f2));
                } else {
                    M0 = jb6.M0(2131749587, null);
                }
                z = false;
                break;
            case 5:
                M0 = jb6.M0(e(bool, 2131749581, 2131749580, 2131749580), null);
                break;
            case 6:
            case 11:
                M0 = jb6.M0(2131742806, null);
                break;
            case 7:
                M0 = jb6.M0(e(bool, 2131749583, 2131749582, 2131749582), null);
                z = false;
                break;
            case '\b':
                M0 = jb6.M0(2131749572, null);
                break;
            case '\t':
            case '\f':
                M0 = jb6.M0(2131749577, null);
                z = false;
                break;
            case '\n':
                M0 = jb6.M0(2131749574, null);
                break;
            case '\r':
                M0 = jb6.M0(e(bool, 2131749598, 2131749597, 2131749597), null);
                z = false;
                break;
            case 14:
                M0 = jb6.M0(2131749573, null);
                z = false;
                break;
            case 15:
                M0 = jb6.M0(e(bool, 2131749592, 2131749591, 2131749592), null);
                z = false;
                break;
            case 16:
            case 21:
                return;
            case 17:
                M0 = jb6.M0(e(bool, 2131749594, 2131749593, 2131749593), null);
                z = false;
                break;
            case 18:
                M0 = jb6.M0(2131749590, null);
                break;
            case 19:
                M0 = jb6.M0(e(bool, 2131749579, 2131749578, 2131749578), null);
                z = false;
                break;
            case 20:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, context);
                String M02 = jb6.M0(2131749458, null);
                he heVar = alertDialog$Builder.a;
                heVar.S = M02;
                heVar.U = jb6.M0(e(bool, 2131749571, 2131749570, 2131749570), null);
                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                alertDialog$Builder.j(jb6.M0(2131749493, null), new bh7((byte) 7));
                alertDialog$Builder.o();
                return;
            case 23:
                M0 = jb6.M0(e(bool, 2131749589, 2131749588, 2131749588), null);
                z = false;
                break;
            default:
                if (c41Var != null) {
                    c41Var.f0(str, false);
                    return;
                } else {
                    c41.c0(str);
                    return;
                }
        }
        if (z && c41Var != null) {
            c41Var.t(M0, ylbVar).j();
        } else {
            p(context, ylbVar, M0, bool);
        }
    }

    public static void r(Context context, int i, ylb ylbVar, c41 c41Var, TLRPC.TL_error tL_error, Boolean bool) {
        q(context, i, ylbVar, c41Var, (tL_error == null || (r10 = tL_error.text) == null) ? "NULL_ERROR" : "NULL_ERROR", bool);
    }

    public static void s(TL_stars.StarGift starGift, String str) {
        gm.c3(new bl7(starGift, str, (byte) 13));
    }

    public static String t(long j) {
        double f = nk.j(j, ok.b).f();
        if (f <= 0.0d) {
            return null;
        }
        cj0.h();
        return cj0.f("USD", 2, (long) (f * 100.0d), false);
    }

    public static boolean u(TL_stars.StarGift starGift) {
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
