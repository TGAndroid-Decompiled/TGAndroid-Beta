package defpackage;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.c;
public final class jt7 {
    public final byte a;
    public final int b;
    public final boolean c;
    public final int d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public long i;
    public final int j;
    public boolean k;
    public final String l;
    public final int m;

    public jt7(int i, int i2, boolean z, int i3, long j, long j2, long j3, long j4, int i4, String str, int i5) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = i3;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
        this.j = i4;
        this.l = TextUtils.isEmpty(str) ? null : str;
        this.m = i5;
    }

    public static String a(TL_wallet.WalletOnchainGiftAction walletOnchainGiftAction) {
        if (walletOnchainGiftAction instanceof TL_wallet.walletOnchainGiftActionOfferCreate) {
            return ((TL_wallet.walletOnchainGiftActionOfferCreate) walletOnchainGiftAction).counterparty_address;
        }
        if (walletOnchainGiftAction instanceof TL_wallet.walletOnchainGiftActionOfferAccept) {
            return ((TL_wallet.walletOnchainGiftActionOfferAccept) walletOnchainGiftAction).counterparty_address;
        }
        if (walletOnchainGiftAction instanceof TL_wallet.walletOnchainGiftActionOfferCancel) {
            return ((TL_wallet.walletOnchainGiftActionOfferCancel) walletOnchainGiftAction).counterparty_address;
        }
        if (walletOnchainGiftAction instanceof TL_wallet.walletOnchainGiftActionOfferDecline) {
            return ((TL_wallet.walletOnchainGiftActionOfferDecline) walletOnchainGiftAction).counterparty_address;
        }
        if (walletOnchainGiftAction instanceof TL_wallet.walletOnchainGiftActionOfferExpire) {
            return ((TL_wallet.walletOnchainGiftActionOfferExpire) walletOnchainGiftAction).counterparty_address;
        }
        return null;
    }

    public static defpackage.jt7 c(org.telegram.tgnet.tl.TL_wallet.walletTransaction r33) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jt7.c(org.telegram.tgnet.tl.TL_wallet$walletTransaction):jt7");
    }

    public static jt7 d(int i, TL_wallet.walletTransaction wallettransaction, long j, long j2, long j3, String str) {
        long j4;
        long j5 = wallettransaction.amount;
        if (j5 != 0) {
            j4 = Math.abs(j5);
        } else {
            j4 = j;
        }
        return new jt7(i, 2131232866, true, 0, j4, j2, 0L, j3, 0, str, 2131742671);
    }

    public static SpannableStringBuilder f(int i, long j) {
        return nza.b1(true, ob6.a0(null, null, i, "⭐️ " + c.s(j, false)), 0.7f, null);
    }

    public final CharSequence b() {
        byte b = this.a;
        long j = this.e;
        long j2 = this.f;
        switch (b) {
            case 0:
                if (j2 == 0) {
                    j2 = Math.abs(j);
                }
                return f(2131742711, j2);
            case 1:
                if (j != 0) {
                    j2 = Math.abs(j);
                }
                return f(2131742700, j2);
            case 2:
                return f(2131742710, Math.abs(j));
            case 3:
                if (j2 != 0) {
                    return f(2131742704, j2);
                }
                return ob6.M0(2131742705, null);
            case 4:
                return ob6.M0(2131742703, null);
            case 5:
                return ob6.M0(2131742706, null);
            case 6:
                return ob6.M0(2131742709, null);
            case 7:
                return ob6.M0(2131742708, null);
            case 8:
                return ob6.M0(2131742707, null);
            case 9:
                return f(2131742702, j2);
            default:
                return "";
        }
    }

    public final String e() {
        switch (this.a) {
            case 0:
                return ob6.M0(2131742697, null);
            case 1:
                return ob6.M0(2131742694, null);
            case 2:
                return ob6.M0(2131742699, null);
            case 3:
                return ob6.M0(2131742696, null);
            case 4:
                return ob6.M0(2131742695, null);
            case 5:
                return ob6.M0(2131742706, null);
            case 6:
                return ob6.M0(2131742709, null);
            case 7:
                return ob6.M0(2131742708, null);
            case 8:
                return ob6.M0(2131742707, null);
            case 9:
                return ob6.M0(2131742698, null);
            default:
                return "";
        }
    }
}
