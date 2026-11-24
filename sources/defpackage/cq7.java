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
public abstract class cq7 {
    public static final int[] a = {3000, 3000, 4000, 5000, 10000, 15000, 30000, 60000};
    public static final int[] b = {5000, 10000, 15000, 30000, 60000, 120000, 180000, 300000};

    public static void a(mp7 mp7Var, String str, TL_stars.StarGiftAttribute starGiftAttribute) {
        if (starGiftAttribute == null) {
            return;
        }
        Integer[] numArr = new Integer[1];
        String z1 = vqa.z1(starGiftAttribute.rarity, numArr);
        mfb mfbVar = mp7Var.Y1;
        String str2 = starGiftAttribute.name;
        if (TextUtils.isEmpty(z1)) {
            z1 = null;
        }
        mfbVar.e(str, str2, z1, null, numArr[0]);
    }

    public static void b(mp7 mp7Var, TL_stars.StarGift starGift) {
        a(mp7Var, k96.M0(2131750371, null), (TL_stars.starGiftAttributeModel) gta.i(starGift.attributes, TL_stars.starGiftAttributeModel.class));
        a(mp7Var, k96.M0(2131750364, null), (TL_stars.starGiftAttributePattern) gta.i(starGift.attributes, TL_stars.starGiftAttributePattern.class));
        a(mp7Var, k96.M0(2131750372, null), (TL_stars.starGiftAttributeBackdrop) gta.i(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class));
    }

    public static void c(mp7 mp7Var, long j, int i, wjb wjbVar) {
        mfb mfbVar = mp7Var.Y1;
        if (i < 0) {
            return;
        }
        if (i > 0) {
            mfbVar.f(k96.M0(2131749575, null), TextUtils.concat(i(n(i, j)), " ", r41.b(g(i), null, wjbVar, null)), null, null);
        }
        mfbVar.f(k96.M0(2131749532, null), i(j - n(i, j)), null, null);
    }

    public static void d(final Context context, final int i, final TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, final TLRPC.TL_textWithEntities tL_textWithEntities, boolean z, final wjb wjbVar, nu9 nu9Var, u21 u21Var, final t7a t7aVar, final t7a t7aVar2) {
        final long j2;
        TLRPC.InputPeer inputPeer;
        if (!TextUtils.isEmpty(tL_starGiftUnique.slug)) {
            final long e = y6c.h(i).e();
            if (j != 0 && j != e) {
                j2 = j;
            } else {
                j2 = 0;
            }
            int i2 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
            if (i2 != 0) {
                inputPeer = na7.q1(i).h1(j2);
            } else {
                inputPeer = null;
            }
            if (i2 == 0 || inputPeer != null) {
                final long j3 = tL_starGiftUnique.getResellAmount(oj.b).b;
                long z2 = c.C(i).z();
                if (z2 < j3 && uz4.c(i)) {
                    nu9Var.a(Boolean.TRUE);
                    aq7 aq7Var = new aq7(nu9Var, z2, j3, context, i, wjbVar, tL_starGiftUnique, j, tL_textWithEntities, z, u21Var, t7aVar, t7aVar2);
                    boolean z3 = w01.a;
                    ur4 ur4Var = new ur4(aq7Var, (byte) 4);
                    TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
                    tL_payments_getStarsRevenueStats.ton = true;
                    tL_payments_getStarsRevenueStats.peer = new TLRPC.TL_inputPeerSelf();
                    ConnectionsManager.getInstance(i).sendRequest(tL_payments_getStarsRevenueStats, new uf(ur4Var, (byte) 28));
                } else if (!mp7.Y0(context, i, wjbVar, j3, 2131749614)) {
                } else {
                    TL_stars.buyStarGiftOnchain buystargiftonchain = new TL_stars.buyStarGiftOnchain();
                    buystargiftonchain.slug = tL_starGiftUnique.slug;
                    buystargiftonchain.expected_amount = j3;
                    buystargiftonchain.peer = inputPeer;
                    buystargiftonchain.message = tL_textWithEntities;
                    buystargiftonchain.show_name = z;
                    final String h = h(tL_starGiftUnique);
                    o(context, i, buystargiftonchain, Boolean.valueOf(tL_starGiftUnique.fixed_sale), wjbVar, nu9Var, u21Var, new i8c() {
                        @Override
                        public final void a(Object obj, Object obj2) {
                            int i3;
                            String str;
                            w05 w05Var = (w05) obj;
                            Boolean bool = (Boolean) obj2;
                            boolean booleanValue = bool.booleanValue();
                            long j4 = j3;
                            Context context2 = context;
                            wjb wjbVar2 = wjbVar;
                            if (!booleanValue && w05Var.b != j4) {
                                cq7.p(context2, wjbVar2, k96.M0(cq7.e(bool, 2131749640, 2131749639, 2131749639), null), bool);
                                return;
                            }
                            w05Var.h = new TL_wallet.walletOnchainGiftActionBuy();
                            long j5 = w05Var.b;
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = tL_starGiftUnique;
                            w05Var.i = tL_starGiftUnique2;
                            int i4 = i;
                            mp7 mp7Var = new mp7(context2, i4, tL_starGiftUnique2, wjbVar2);
                            String M0 = k96.M0(2131749658, null);
                            if (bool.booleanValue()) {
                                i3 = 2131749659;
                            } else {
                                i3 = 2131749660;
                            }
                            String a0 = k96.a0(null, null, 2131749619, nj.j(j4, oj.b).d());
                            String str2 = h;
                            mp7Var.e1(gl.T2(k96.a0(null, null, i3, str2, a0)), M0);
                            String M02 = k96.M0(2131749535, null);
                            SpannableStringBuilder l = cq7.l(j4);
                            mfb mfbVar = mp7Var.Y1;
                            mfbVar.f(M02, l, null, null);
                            if (j5 > j4) {
                                mfbVar.f(k96.M0(2131749540, null), cq7.i(j5 - j4), null, null);
                            }
                            long j6 = j2;
                            if (j6 != 0) {
                                mfbVar.f(k96.M0(2131742777, null), cf3.k(i4, j6), null, null);
                                TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_textWithEntities;
                                if (tL_textWithEntities2 != null && !TextUtils.isEmpty(tL_textWithEntities2.text)) {
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities2.text);
                                    k27.b(spannableStringBuilder, tL_textWithEntities2.entities, false, false, false, false, 0);
                                    str = null;
                                    mfbVar.f(k96.M0(2131748411, null), vu3.m(spannableStringBuilder, null, false, null, 0), null, null);
                                } else {
                                    str = null;
                                }
                            } else {
                                str = null;
                                mfbVar.f(k96.M0(2131749532, null), str2, null, null);
                            }
                            cq7.b(mp7Var, tL_starGiftUnique2);
                            mp7Var.c2.i(k96.M0(2131749661, str), false, true);
                            mp7Var.p2 = 2131749614;
                            mp7Var.d1(w05Var);
                            mp7Var.c1(new wy(t7aVar, tL_starGiftUnique2, j6, str2, i4), new rb2(tL_starGiftUnique2, str2, t7aVar2, i4, j6, e), new xp7(context2, i4, wjbVar2, mp7Var, bool, (byte) 1));
                            mp7Var.show();
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
        return ls6.m(starGift.num, ',', sb);
    }

    public static SpannableStringBuilder i(long j) {
        return jva.a1(true, "⭐️ ".concat(nj.j(j, oj.b).d()), 0.8f, null);
    }

    public static SpannableStringBuilder j(long j) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(i(j));
        spannableStringBuilder.setSpan(new StrikethroughSpan(), TextUtils.indexOf((CharSequence) spannableStringBuilder, ' ') + 1, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static String k(long j) {
        return k96.a0(null, null, 2131749619, c.s(j, false));
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

    public static void o(Context context, int i, TLMethod tLMethod, Boolean bool, wjb wjbVar, p8c p8cVar, u21 u21Var, i8c i8cVar) {
        p8cVar.a(Boolean.TRUE);
        ConnectionsManager.getInstance(i).sendRequestTyped(tLMethod, new hc((byte) 0), new ah4(p8cVar, context, i, wjbVar, u21Var, bool, i8cVar));
    }

    public static void p(Context context, wjb wjbVar, String str, Boolean bool) {
        int i;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, context);
        if (bool == null) {
            i = 2131689472;
        } else if (bool.booleanValue()) {
            i = 2131749626;
        } else {
            i = 2131749627;
        }
        String M0 = k96.M0(i, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        hdVar.U = str;
        b00.t(null, 2131747638, alertDialog$Builder, null);
    }

    public static void q(Context context, int i, wjb wjbVar, u21 u21Var, String str, Boolean bool) {
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
                M0 = k96.M0(2131749598, null);
                break;
            case 1:
                M0 = k96.M0(2131749600, null);
                break;
            case 2:
            case 22:
                M0 = k96.M0(e(bool, 2131749647, 2131749646, 2131749646), null);
                break;
            case 3:
                M0 = k96.M0(e(bool, 2131749636, 2131749635, 2131749635), null);
                break;
            case 4:
                gr grVar = na7.q1(i).k4;
                long f = grVar.q.f();
                long f2 = grVar.r.f();
                if (f > 0 && f2 > f) {
                    M0 = k96.a0(null, null, 2131749637, k(f), k(f2));
                } else {
                    M0 = k96.M0(2131749638, null);
                }
                z = false;
                break;
            case 5:
                M0 = k96.M0(e(bool, 2131749632, 2131749631, 2131749631), null);
                break;
            case 6:
            case 11:
                M0 = k96.M0(2131742880, null);
                break;
            case 7:
                M0 = k96.M0(e(bool, 2131749634, 2131749633, 2131749633), null);
                z = false;
                break;
            case '\b':
                M0 = k96.M0(2131749623, null);
                break;
            case '\t':
            case '\f':
                M0 = k96.M0(2131749628, null);
                z = false;
                break;
            case '\n':
                M0 = k96.M0(2131749625, null);
                break;
            case '\r':
                M0 = k96.M0(e(bool, 2131749649, 2131749648, 2131749648), null);
                z = false;
                break;
            case 14:
                M0 = k96.M0(2131749624, null);
                z = false;
                break;
            case 15:
                M0 = k96.M0(e(bool, 2131749643, 2131749642, 2131749643), null);
                z = false;
                break;
            case 16:
            case 21:
                return;
            case 17:
                M0 = k96.M0(e(bool, 2131749645, 2131749644, 2131749644), null);
                z = false;
                break;
            case 18:
                M0 = k96.M0(2131749641, null);
                break;
            case 19:
                M0 = k96.M0(e(bool, 2131749630, 2131749629, 2131749629), null);
                z = false;
                break;
            case 20:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, context);
                String M02 = k96.M0(2131749509, null);
                hd hdVar = alertDialog$Builder.a;
                hdVar.S = M02;
                hdVar.U = k96.M0(e(bool, 2131749622, 2131749621, 2131749621), null);
                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                alertDialog$Builder.j(k96.M0(2131749544, null), new fi7((byte) 5));
                alertDialog$Builder.o();
                return;
            case 23:
                M0 = k96.M0(e(bool, 2131749640, 2131749639, 2131749639), null);
                z = false;
                break;
            default:
                if (u21Var != null) {
                    u21Var.f0(str, false);
                    return;
                } else {
                    u21.c0(str);
                    return;
                }
        }
        if (z && u21Var != null) {
            u21Var.t(M0, wjbVar).j();
        } else {
            p(context, wjbVar, M0, bool);
        }
    }

    public static void r(Context context, int i, wjb wjbVar, u21 u21Var, TLRPC.TL_error tL_error, Boolean bool) {
        q(context, i, wjbVar, u21Var, (tL_error == null || (r10 = tL_error.text) == null) ? "NULL_ERROR" : "NULL_ERROR", bool);
    }

    public static void s(TL_stars.StarGift starGift, String str) {
        gl.d3(new bj7(starGift, str, (byte) 12));
    }

    public static String t(long j) {
        double f = nj.j(j, oj.b).f();
        if (f <= 0.0d) {
            return null;
        }
        ci0.h();
        return ci0.f("USD", 2, (long) (f * 100.0d), false);
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
