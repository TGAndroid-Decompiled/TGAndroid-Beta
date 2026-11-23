package bi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StrikethroughSpan;
import di.pb;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.messenger.r10;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ey0;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.oc;
public abstract class x4 {
    public static final int[] f4247a = {3000, 3000, 4000, 5000, 10000, 15000, 30000, 60000};
    public static final int[] f4248b = {5000, 10000, 15000, 30000, 60000, 120000, 180000, 300000};

    public static void a(s3 s3Var, String str, TL_stars.StarGiftAttribute starGiftAttribute) {
        if (starGiftAttribute == null) {
            return;
        }
        Integer[] numArr = new Integer[1];
        String L1 = di.f6.L1(starGiftAttribute.rarity, numArr);
        ey0 ey0Var = s3Var.Z1;
        String str2 = starGiftAttribute.name;
        if (TextUtils.isEmpty(L1)) {
            L1 = null;
        }
        ey0Var.d(str, str2, L1, null, numArr[0]);
    }

    public static void b(s3 s3Var, TL_stars.StarGift starGift) {
        a(s3Var, hd.N0(2131750370, null), (TL_stars.starGiftAttributeModel) di.y8.l(starGift.attributes, TL_stars.starGiftAttributeModel.class));
        a(s3Var, hd.N0(2131750363, null), (TL_stars.starGiftAttributePattern) di.y8.l(starGift.attributes, TL_stars.starGiftAttributePattern.class));
        a(s3Var, hd.N0(2131750371, null), (TL_stars.starGiftAttributeBackdrop) di.y8.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class));
    }

    public static void c(s3 s3Var, long j3, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        ey0 ey0Var = s3Var.Z1;
        if (i7 < 0) {
            return;
        }
        if (i7 > 0) {
            ey0Var.e(hd.N0(2131749574, null), TextUtils.concat(i(n(i7, j3)), " ", oc.b(g(i7), null, h6Var, null)), null, null);
        }
        ey0Var.e(hd.N0(2131749531, null), i(j3 - n(i7, j3)), null, null);
    }

    public static void d(final Context context, final int i7, final TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, final TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, final org.telegram.ui.ActionBar.h6 h6Var, ai.y1 y1Var, lc lcVar, final c1.a aVar, final di.f2 f2Var) {
        final long j10;
        TLRPC.InputPeer inputPeer;
        if (!TextUtils.isEmpty(tL_starGiftUnique.slug)) {
            final long e10 = k10.i(i7).e();
            if (j3 != 0 && j3 != e10) {
                j10 = j3;
            } else {
                j10 = 0;
            }
            int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i10 != 0) {
                inputPeer = np.u1(i7).l1(j10);
            } else {
                inputPeer = null;
            }
            if (i10 == 0 || inputPeer != null) {
                final long j11 = tL_starGiftUnique.getResellAmount(cg.b.f5306b).f5304b;
                long A = org.telegram.ui.Wallet.u0.D(i7).A();
                if (A < j11 && ii.n.c(i7)) {
                    y1Var.a(Boolean.TRUE);
                    u4 u4Var = new u4(y1Var, A, j11, context, i7, h6Var, tL_starGiftUnique, j3, tL_textWithEntities, z10, lcVar, aVar, f2Var);
                    boolean z11 = org.telegram.messenger.s2.f26730a;
                    hi.d7 d7Var = new hi.d7(u4Var, 3);
                    TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
                    tL_payments_getStarsRevenueStats.ton = true;
                    tL_payments_getStarsRevenueStats.peer = new TLRPC.TL_inputPeerSelf();
                    ConnectionsManager.getInstance(i7).sendRequest(tL_payments_getStarsRevenueStats, new ai.g1(d7Var, 13));
                } else if (!s3.e1(context, i7, h6Var, j11, 2131749613)) {
                } else {
                    TL_stars.buyStarGiftOnchain buystargiftonchain = new TL_stars.buyStarGiftOnchain();
                    buystargiftonchain.slug = tL_starGiftUnique.slug;
                    buystargiftonchain.expected_amount = j11;
                    buystargiftonchain.peer = inputPeer;
                    buystargiftonchain.message = tL_textWithEntities;
                    buystargiftonchain.show_name = z10;
                    final String h = h(tL_starGiftUnique);
                    o(context, i7, buystargiftonchain, Boolean.valueOf(tL_starGiftUnique.fixed_sale), h6Var, y1Var, lcVar, new r10() {
                        @Override
                        public final void a(Object obj, Object obj2) {
                            int i11;
                            String str;
                            org.telegram.ui.Wallet.p0 p0Var = (org.telegram.ui.Wallet.p0) obj;
                            Boolean bool = (Boolean) obj2;
                            boolean booleanValue = bool.booleanValue();
                            long j12 = j11;
                            Context context2 = context;
                            org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
                            if (!booleanValue && p0Var.f44776b != j12) {
                                x4.p(context2, h6Var2, hd.N0(x4.e(bool, 2131749639, 2131749638, 2131749638), null), bool);
                                return;
                            }
                            p0Var.h = new TL_wallet.walletOnchainGiftActionBuy();
                            long j13 = p0Var.f44776b;
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = tL_starGiftUnique;
                            p0Var.f44781i = tL_starGiftUnique2;
                            int i12 = i7;
                            s3 s3Var = new s3(i12, context2, tL_starGiftUnique2, h6Var2);
                            String N0 = hd.N0(2131749657, null);
                            if (bool.booleanValue()) {
                                i11 = 2131749658;
                            } else {
                                i11 = 2131749659;
                            }
                            String a02 = hd.a0(null, null, 2131749618, cg.a.j(j12, cg.b.f5306b).d());
                            String str2 = h;
                            s3Var.k1(org.telegram.messenger.g0.W2(hd.a0(null, null, i11, str2, a02)), N0);
                            String N02 = hd.N0(2131749534, null);
                            SpannableStringBuilder l10 = x4.l(j12);
                            ey0 ey0Var = s3Var.Z1;
                            ey0Var.e(N02, l10, null, null);
                            if (j13 > j12) {
                                ey0Var.e(hd.N0(2131749539, null), x4.i(j13 - j12), null, null);
                            }
                            long j14 = j10;
                            if (j14 != 0) {
                                ey0Var.e(hd.N0(2131742774, null), org.telegram.messenger.n5.l(i12, j14), null, null);
                                TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_textWithEntities;
                                if (tL_textWithEntities2 != null && !TextUtils.isEmpty(tL_textWithEntities2.text)) {
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities2.text);
                                    gj.b(spannableStringBuilder, tL_textWithEntities2.entities, false, false, false, false, 0);
                                    str = null;
                                    ey0Var.e(hd.N0(2131748410, null), org.telegram.messenger.j6.m(spannableStringBuilder, null, false, null, 0), null, null);
                                } else {
                                    str = null;
                                }
                            } else {
                                str = null;
                                ey0Var.e(hd.N0(2131749531, null), str2, null, null);
                            }
                            x4.b(s3Var, tL_starGiftUnique2);
                            s3Var.d2.i(hd.N0(2131749660, str), false, true);
                            s3Var.f4080q2 = 2131749613;
                            s3Var.j1(p0Var);
                            s3Var.i1(new e0(aVar, tL_starGiftUnique2, j14, str2, i12), new l4(tL_starGiftUnique2, str2, f2Var, i12, j14, e10), new k4(context2, i12, h6Var2, s3Var, bool, 1));
                            s3Var.show();
                        }
                    });
                }
            }
        }
    }

    public static int e(Boolean bool, int i7, int i10, int i11) {
        if (bool == null) {
            return i11;
        }
        if (bool.booleanValue()) {
            return i10;
        }
        return i7;
    }

    public static int f(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i7;
        if (tL_starGiftUnique != null && (tL_starGiftUnique.flags & 1048576) != 0 && (i7 = tL_starGiftUnique.fee_bps) >= 0) {
            return i7;
        }
        return -1;
    }

    public static String g(int i7) {
        BigDecimal stripTrailingZeros;
        StringBuilder sb2 = new StringBuilder();
        BigDecimal movePointLeft = new BigDecimal(i7).movePointLeft(2);
        if (movePointLeft.signum() == 0) {
            stripTrailingZeros = new BigDecimal(BigInteger.ZERO, 0);
        } else {
            stripTrailingZeros = movePointLeft.stripTrailingZeros();
        }
        sb2.append(stripTrailingZeros.toPlainString());
        sb2.append("%");
        return sb2.toString();
    }

    public static String h(TL_stars.StarGift starGift) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(starGift.title);
        sb2.append(" #");
        return i5.c.l(starGift.num, ',', sb2);
    }

    public static SpannableStringBuilder i(long j3) {
        return pb.b1(true, "⭐️ " + cg.a.j(j3, cg.b.f5306b).d(), 0.8f, null);
    }

    public static SpannableStringBuilder j(long j3) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(i(j3));
        spannableStringBuilder.setSpan(new StrikethroughSpan(), TextUtils.indexOf((CharSequence) spannableStringBuilder, ' ') + 1, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static String k(long j3) {
        return hd.a0(null, null, 2131749618, org.telegram.ui.Wallet.u0.t(j3, false));
    }

    public static SpannableStringBuilder l(long j3) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(i(j3));
        String t6 = t(j3);
        if (t6 != null) {
            spannableStringBuilder.append((CharSequence) " (~").append((CharSequence) t6).append((CharSequence) ")");
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

    public static long n(int i7, long j3) {
        if (j3 <= 0 || i7 <= 0) {
            return 0L;
        }
        long j10 = i7;
        return (((j3 % 10000) * j10) / 10000) + ((j3 / 10000) * j10);
    }

    public static void o(Context context, int i7, TLMethod tLMethod, Boolean bool, org.telegram.ui.ActionBar.h6 h6Var, y10 y10Var, lc lcVar, r10 r10Var) {
        y10Var.a(Boolean.TRUE);
        ConnectionsManager.getInstance(i7).sendRequestTyped(tLMethod, new d3.b(1), new m4(y10Var, context, i7, h6Var, lcVar, bool, r10Var));
    }

    public static void p(Context context, org.telegram.ui.ActionBar.h6 h6Var, String str, Boolean bool) {
        int i7;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var);
        if (bool == null) {
            i7 = 2131689472;
        } else if (bool.booleanValue()) {
            i7 = 2131749625;
        } else {
            i7 = 2131749626;
        }
        String N0 = hd.N0(i7, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
        t1Var.S = N0;
        t1Var.U = str;
        org.telegram.messenger.f3.m(null, 2131747637, alertDialog$Builder, null);
    }

    public static void q(Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var, lc lcVar, String str, Boolean bool) {
        String N0;
        str.getClass();
        boolean z10 = true;
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1717805896:
                if (str.equals("STARGIFT_ONCHAIN_OFFER_INTENT_CONFLICT")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1626727958:
                if (str.equals("STARGIFT_ONCHAIN_OFFER_ALREADY_ACTIVE")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1550281532:
                if (str.equals("STARGIFT_ONCHAIN_ITEM_NOT_FOUND")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1397183452:
                if (str.equals("STARGIFT_ONCHAIN_SALE_ACTIVE")) {
                    c10 = 3;
                    break;
                }
                break;
            case -1031391897:
                if (str.equals("STARGIFT_ONCHAIN_PRICE_INVALID")) {
                    c10 = 4;
                    break;
                }
                break;
            case -982862327:
                if (str.equals("STARGIFT_ONCHAIN_SALE_INACTIVE")) {
                    c10 = 5;
                    break;
                }
                break;
            case -783781934:
                if (str.equals("WALLET_UNLOCK_FAILED")) {
                    c10 = 6;
                    break;
                }
                break;
            case -736586726:
                if (str.equals("STARGIFT_ONCHAIN_SALE_DISABLED")) {
                    c10 = 7;
                    break;
                }
                break;
            case -456249281:
                if (str.equals("WALLET_CREATING")) {
                    c10 = '\b';
                    break;
                }
                break;
            case -351457906:
                if (str.equals("WALLET_SEND_FAILED")) {
                    c10 = '\t';
                    break;
                }
                break;
            case -53543396:
                if (str.equals("TRANSACTION_CREATION_FAILED")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 39400720:
                if (str.equals("LOCAL_STORAGE_ERROR")) {
                    c10 = 11;
                    break;
                }
                break;
            case 86960902:
                if (str.equals("WALLET_TRANSFER_SEND_FAILED")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 185207802:
                if (str.equals("PEER_INVALID")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 239979146:
                if (str.equals("WALLET_UNSUPPORTED_SEND_MODE")) {
                    c10 = 14;
                    break;
                }
                break;
            case 295652781:
                if (str.equals("STARGIFT_ONCHAIN_NOT_OWNER")) {
                    c10 = 15;
                    break;
                }
                break;
            case 435284510:
                if (str.equals("PASSCODE_FAILED")) {
                    c10 = 16;
                    break;
                }
                break;
            case 505128103:
                if (str.equals("STARGIFT_ONCHAIN_NOT_MINTED")) {
                    c10 = 17;
                    break;
                }
                break;
            case 762477967:
                if (str.equals("STARGIFT_ONCHAIN_OFFER_NOT_ACTIVE")) {
                    c10 = 18;
                    break;
                }
                break;
            case 1055614266:
                if (str.equals("STARGIFT_ONCHAIN_SELF_PURCHASE")) {
                    c10 = 19;
                    break;
                }
                break;
            case 1149363434:
                if (str.equals("WALLET_UNAVAILABLE")) {
                    c10 = 20;
                    break;
                }
                break;
            case 1860388416:
                if (str.equals("WALLET_SEND_CANCELLED")) {
                    c10 = 21;
                    break;
                }
                break;
            case 1937178819:
                if (str.equals("STARGIFT_ONCHAIN_NOT_FOR_SALE")) {
                    c10 = 22;
                    break;
                }
                break;
            case 2042734116:
                if (str.equals("STARGIFT_ONCHAIN_PRICE_CHANGED")) {
                    c10 = 23;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                N0 = hd.N0(2131749597, null);
                break;
            case 1:
                N0 = hd.N0(2131749599, null);
                break;
            case 2:
            case 22:
                N0 = hd.N0(e(bool, 2131749646, 2131749645, 2131749645), null);
                break;
            case 3:
                N0 = hd.N0(e(bool, 2131749635, 2131749634, 2131749634), null);
                break;
            case 4:
                org.telegram.messenger.p0 p0Var = np.u1(i7).A7;
                long j3 = ((org.telegram.messenger.l0) p0Var.f26242r.f14030b).f25176c;
                long j10 = ((org.telegram.messenger.l0) p0Var.f26244s.f14030b).f25176c;
                if (j3 > 0 && j10 > j3) {
                    N0 = hd.a0(null, null, 2131749636, k(j3), k(j10));
                } else {
                    N0 = hd.N0(2131749637, null);
                }
                z10 = false;
                break;
            case 5:
                N0 = hd.N0(e(bool, 2131749631, 2131749630, 2131749630), null);
                break;
            case 6:
            case 11:
                N0 = hd.N0(2131742877, null);
                break;
            case 7:
                N0 = hd.N0(e(bool, 2131749633, 2131749632, 2131749632), null);
                z10 = false;
                break;
            case '\b':
                N0 = hd.N0(2131749622, null);
                break;
            case '\t':
            case '\f':
                N0 = hd.N0(2131749627, null);
                z10 = false;
                break;
            case '\n':
                N0 = hd.N0(2131749624, null);
                break;
            case '\r':
                N0 = hd.N0(e(bool, 2131749648, 2131749647, 2131749647), null);
                z10 = false;
                break;
            case 14:
                N0 = hd.N0(2131749623, null);
                z10 = false;
                break;
            case 15:
                N0 = hd.N0(e(bool, 2131749642, 2131749641, 2131749642), null);
                z10 = false;
                break;
            case 16:
            case 21:
                return;
            case 17:
                N0 = hd.N0(e(bool, 2131749644, 2131749643, 2131749643), null);
                z10 = false;
                break;
            case 18:
                N0 = hd.N0(2131749640, null);
                break;
            case 19:
                N0 = hd.N0(e(bool, 2131749629, 2131749628, 2131749628), null);
                z10 = false;
                break;
            case 20:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var);
                String N02 = hd.N0(2131749508, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
                t1Var.S = N02;
                t1Var.U = hd.N0(e(bool, 2131749621, 2131749620, 2131749620), null);
                alertDialog$Builder.h(hd.N0(2131752577, null), null);
                alertDialog$Builder.k(hd.N0(2131749543, null), new a3.l(20));
                alertDialog$Builder.p();
                return;
            case 23:
                N0 = hd.N0(e(bool, 2131749639, 2131749638, 2131749638), null);
                z10 = false;
                break;
            default:
                if (lcVar != null) {
                    lcVar.f0(str, false);
                    return;
                } else {
                    lc.c0(str);
                    return;
                }
        }
        if (z10 && lcVar != null) {
            lcVar.t(N0, h6Var).j();
        } else {
            p(context, h6Var, N0, bool);
        }
    }

    public static void r(Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var, lc lcVar, TLRPC.TL_error tL_error, Boolean bool) {
        q(context, i7, h6Var, lcVar, (tL_error == null || (r10 = tL_error.text) == null) ? "NULL_ERROR" : "NULL_ERROR", bool);
    }

    public static void s(TL_stars.StarGift starGift, String str) {
        org.telegram.messenger.g0.g3(new a1.e(27, starGift, str));
    }

    public static String t(long j3) {
        double f10 = cg.a.j(j3, cg.b.f5306b).f();
        if (f10 <= 0.0d) {
            return null;
        }
        org.telegram.messenger.r1.i().getClass();
        return org.telegram.messenger.r1.g("USD", 2, (long) (f10 * 100.0d), false);
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
