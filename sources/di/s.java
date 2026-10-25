package di;

import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.dd;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.u91;
import org.telegram.ui.Components.w01;
import org.telegram.ui.Components.xa;
import org.telegram.ui.Components.zq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.zc1;
public final class s implements Utilities.Callback {
    public final int f9130a = 1;
    public final int f9131b;
    public final Object f9132c;
    public final View d;
    public final Object e;
    public final Object f9133f;
    public final Object f9134g;
    public final ViewGroup h;
    public final Object f9135i;
    public final Object f9136j;
    public final Object f9137k;
    public final Object f9138l;

    public s(LinearLayout linearLayout, org.telegram.ui.Wallet.n4 n4Var, org.telegram.ui.ActionBar.u6 u6Var, int i10, TextView textView, org.telegram.ui.Wallet.j2[] j2VarArr, w01 w01Var, Utilities.Callback3 callback3, Context context, TextView[] textViewArr, SpannableString[] spannableStringArr) {
        this.f9132c = linearLayout;
        this.d = n4Var;
        this.e = u6Var;
        this.f9131b = i10;
        this.f9133f = textView;
        this.f9134g = j2VarArr;
        this.h = w01Var;
        this.f9135i = callback3;
        this.f9136j = context;
        this.f9137k = textViewArr;
        this.f9138l = spannableStringArr;
    }

    @Override
    public final void run(Object obj) {
        String formatString;
        boolean z10;
        boolean z11;
        SpannableString[] spannableStringArr;
        long j10;
        boolean z12;
        org.telegram.ui.Wallet.j2 j2Var;
        xa xaVar;
        String str;
        org.telegram.ui.Wallet.j2 j2Var2;
        xa xaVar2;
        w01 w01Var;
        int i10;
        int i11;
        int i12;
        org.telegram.ui.Wallet.b4 b4Var;
        int i13;
        boolean z13;
        boolean z14;
        char c10;
        String str2;
        String str3;
        int i14;
        int i15;
        zc1 zc1Var;
        int i16;
        String str4;
        int i17;
        char c11;
        org.telegram.ui.Wallet.j2 j2Var3;
        xa xaVar3;
        CharSequence a2;
        int i18;
        int i19;
        int i20 = this.f9130a;
        Object obj2 = this.f9138l;
        Object obj3 = this.f9137k;
        Object obj4 = this.f9136j;
        Object obj5 = this.f9135i;
        ViewGroup viewGroup = this.h;
        Object obj6 = this.f9134g;
        Object obj7 = this.f9133f;
        Object obj8 = this.e;
        View view = this.d;
        Object obj9 = this.f9132c;
        switch (i20) {
            case 0:
                long[] jArr = (long[]) obj9;
                v0 v0Var = (v0) obj7;
                bh.r rVar = (bh.r) viewGroup;
                bh.r rVar2 = (bh.r) obj5;
                bh.r rVar3 = (bh.r) obj4;
                t tVar = (t) obj3;
                boolean[] zArr = (boolean[]) obj2;
                Integer num = (Integer) obj;
                long intValue = num.intValue();
                jArr[0] = intValue;
                ((fi.d) view).i(dd.U0(false, LocaleController.formatString(R.string.StarsAddHighlightedMessage, LocaleController.formatNumber(intValue, ',')), (zq[]) obj8), true, true);
                v0Var.f9242g = jArr[0];
                ((q0) obj6).set(v0Var);
                int intValue2 = num.intValue();
                int i21 = this.f9131b;
                int b10 = u.b(i21, intValue2, 0);
                int b11 = u.b(i21, num.intValue(), 1);
                int b12 = u.b(i21, num.intValue(), 2);
                if (b10 >= 60) {
                    formatString = LocaleController.formatString(R.string.SlowmodeMinutes, Integer.valueOf(b10 / 60));
                } else {
                    formatString = LocaleController.formatString(R.string.SlowmodeSeconds, Integer.valueOf(b10));
                }
                ((org.telegram.ui.Components.s6) rVar.f4113b).c(formatString, true, true);
                ((org.telegram.ui.Components.s6) rVar2.f4113b).c(LocaleController.formatNumber(b11, ','), true, true);
                ((org.telegram.ui.Components.s6) rVar3.f4113b).c(LocaleController.formatNumber(b12, ','), true, true);
                tVar.f(u.b(i21, num.intValue(), 3), u.b(i21, num.intValue(), 4), true ^ zArr[0]);
                zArr[0] = false;
                return;
            default:
                LinearLayout linearLayout = (LinearLayout) obj9;
                org.telegram.ui.Wallet.n4 n4Var = (org.telegram.ui.Wallet.n4) view;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) obj8;
                TextView textView = (TextView) obj7;
                final org.telegram.ui.Wallet.j2[] j2VarArr = (org.telegram.ui.Wallet.j2[]) obj6;
                w01 w01Var2 = (w01) viewGroup;
                Utilities.Callback3 callback3 = (Utilities.Callback3) obj5;
                Context context = (Context) obj4;
                TextView[] textViewArr = (TextView[]) obj3;
                SpannableString[] spannableStringArr2 = (SpannableString[]) obj2;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                long abs = Math.abs(wallettransaction.amount);
                boolean z15 = wallettransaction.incoming;
                long abs2 = Math.abs(wallettransaction.fee);
                if (!wallettransaction.pending && !wallettransaction.failed) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if ((linearLayout.getParent() instanceof View) && (linearLayout.getParent().getParent() instanceof u91) && ((u91) linearLayout.getParent().getParent()).getViewPages()[0] != linearLayout.getParent()) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                boolean z16 = wallettransaction.key_change;
                boolean z17 = z11;
                int i22 = this.f9131b;
                if (!z16 && wallettransaction.nft == null) {
                    if (z10) {
                        i16 = org.telegram.ui.ActionBar.y6.f23765z6;
                    } else {
                        i16 = org.telegram.ui.ActionBar.y6.Oh;
                    }
                    org.telegram.ui.ActionBar.f7.V(n4Var, i16, u6Var);
                    SpannableStringBuilder p10 = org.telegram.ui.Wallet.l0.p(org.telegram.ui.Wallet.l0.n(abs, false), 0.75f);
                    if (z15) {
                        str4 = "+";
                    } else {
                        str4 = "–";
                    }
                    spannableStringArr = spannableStringArr2;
                    p10.insert(0, (CharSequence) str4);
                    if (!z10) {
                        if (z15) {
                            i19 = org.telegram.ui.ActionBar.y6.uj;
                        } else {
                            i19 = org.telegram.ui.ActionBar.y6.G6;
                        }
                        j10 = abs2;
                        p10.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.y6.w0(i19, u6Var)), 0, p10.length(), 33);
                    } else {
                        j10 = abs2;
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) org.telegram.ui.Wallet.l0.k("Grams", p10, R.string.Grams_other));
                    int indexOf = TextUtils.indexOf(spannableStringBuilder, p10);
                    int length = p10.length() + indexOf;
                    if (indexOf > 0) {
                        z12 = z15;
                        i17 = 33;
                        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.75f), 0, indexOf, 33);
                    } else {
                        z12 = z15;
                        i17 = 33;
                    }
                    if (indexOf >= 0 && length < spannableStringBuilder.length()) {
                        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.75f), length, spannableStringBuilder.length(), i17);
                    }
                    n4Var.setText(spannableStringBuilder);
                    CharSequence l4 = org.telegram.ui.Wallet.l0.w(i22).l(abs, false);
                    if (z10) {
                        if (wallettransaction.failed) {
                            a2 = LocaleController.getString(R.string.WalletFailed);
                        } else {
                            a2 = ea.a(textView, LocaleController.getString(R.string.WalletSending));
                        }
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(a2);
                        if (wallettransaction.failed) {
                            i18 = org.telegram.ui.ActionBar.y6.f23579p7;
                        } else {
                            i18 = org.telegram.ui.ActionBar.y6.f23538n6;
                        }
                        c11 = 0;
                        spannableStringBuilder2.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.y6.w0(i18, u6Var)), 0, spannableStringBuilder2.length(), 33);
                        textView.setText(LocaleController.formatSpannable(R.string.WalletTransactionAmountStatus, l4, spannableStringBuilder2));
                    } else {
                        c11 = 0;
                        textView.setText(l4);
                    }
                    if (z17 && (j2Var3 = j2VarArr[c11]) != null && (xaVar3 = j2Var3.e) != null) {
                        xaVar3.setTitle(org.telegram.ui.Wallet.l0.k("Grams", p10, R.string.Grams_other));
                    }
                } else {
                    spannableStringArr = spannableStringArr2;
                    j10 = abs2;
                    z12 = z15;
                    if (z16) {
                        if (z17 && (j2Var2 = j2VarArr[0]) != null && (xaVar2 = j2Var2.e) != null) {
                            xaVar2.setTitle(org.telegram.ui.Wallet.l0.k("Grams", org.telegram.ui.Wallet.l0.p(org.telegram.ui.Wallet.l0.n(abs, false), 0.75f), R.string.Grams_other));
                        }
                    } else {
                        TL_wallet.nftItem nftitem = wallettransaction.nft;
                        if (nftitem != null && z17 && (j2Var = j2VarArr[0]) != null && (xaVar = j2Var.e) != null) {
                            if (TextUtils.isEmpty(nftitem.name)) {
                                str = LocaleController.getString(R.string.WalletCollectible);
                            } else {
                                str = wallettransaction.nft.name;
                            }
                            xaVar.setTitle(str);
                        }
                    }
                }
                w01Var2.removeAllViews();
                final TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction.peer;
                if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerUser) {
                    TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = (TL_wallet.walletTransactionPeerUser) walletTransactionPeer;
                    TLRPC.User user = MessagesController.getInstance(i22).getUser(Long.valueOf(wallettransactionpeeruser.user_id));
                    if (user != null && !UserObject.isService(user.f22174id)) {
                        if (z12) {
                            i15 = R.string.WalletSender;
                        } else {
                            i15 = R.string.WalletRecipient;
                        }
                        String string = LocaleController.getString(i15);
                        long j11 = wallettransactionpeeruser.user_id;
                        org.telegram.ui.Wallet.h hVar = new org.telegram.ui.Wallet.h(callback3, j2VarArr, wallettransactionpeeruser, 9);
                        String string2 = LocaleController.getString(R.string.WalletSend);
                        if (callback3 != null) {
                            zc1Var = null;
                        } else {
                            zc1Var = new zc1(24, j2VarArr, user);
                        }
                        w01Var2.m(string, i22, j11, hVar, string2, zc1Var);
                    }
                    w01Var = w01Var2;
                    if (!TextUtils.isEmpty(wallettransactionpeeruser.domain) && !TextUtils.isEmpty(wallettransactionpeeruser.address)) {
                        w01Var.i(LocaleController.getString(R.string.WalletDomain), wallettransactionpeeruser.domain, new org.telegram.ui.Wallet.h(j2VarArr, user, wallettransactionpeeruser, 10));
                    }
                    i10 = i22;
                } else {
                    w01Var = w01Var2;
                    if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerChannel) {
                        if (MessagesController.getInstance(i22).getChat(Long.valueOf(walletTransactionPeer.channel_id)) != null) {
                            if (z12) {
                                i13 = R.string.WalletSender;
                            } else {
                                i13 = R.string.WalletRecipient;
                            }
                            w01Var.n(LocaleController.getString(i13), i22, -walletTransactionPeer.channel_id, new org.telegram.ui.Wallet.h(callback3, j2VarArr, walletTransactionPeer, 11));
                        }
                        i10 = i22;
                        if (!TextUtils.isEmpty(walletTransactionPeer.domain) && !TextUtils.isEmpty(walletTransactionPeer.address)) {
                            w01Var.i(LocaleController.getString(R.string.WalletDomain), walletTransactionPeer.domain, new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            j2[] j2VarArr2 = j2VarArr;
                                            j2 j2Var4 = j2VarArr2[0];
                                            final TL_wallet.WalletTransactionPeer walletTransactionPeer2 = walletTransactionPeer;
                                            j2Var4.setOnDismissListener(new DialogInterface.OnDismissListener() {
                                                @Override
                                                public final void onDismiss(DialogInterface dialogInterface) {
                                                    switch (r2) {
                                                        case 0:
                                                            org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                                                            if (U != null) {
                                                                U.presentFragment(new i9(walletTransactionPeer2.address));
                                                                return;
                                                            }
                                                            return;
                                                        default:
                                                            org.telegram.ui.ActionBar.r2 U2 = LaunchActivity.U();
                                                            if (U2 != null) {
                                                                TL_wallet.WalletTransactionPeer walletTransactionPeer3 = walletTransactionPeer2;
                                                                i9 i9Var = new i9(walletTransactionPeer3.address);
                                                                i9Var.w0(walletTransactionPeer3.domain);
                                                                U2.presentFragment(i9Var);
                                                                return;
                                                            }
                                                            return;
                                                    }
                                                }
                                            });
                                            j2VarArr2[0].dismiss();
                                            return;
                                        default:
                                            j2[] j2VarArr3 = j2VarArr;
                                            j2 j2Var5 = j2VarArr3[0];
                                            final TL_wallet.WalletTransactionPeer walletTransactionPeer3 = walletTransactionPeer;
                                            j2Var5.setOnDismissListener(new DialogInterface.OnDismissListener() {
                                                @Override
                                                public final void onDismiss(DialogInterface dialogInterface) {
                                                    switch (r2) {
                                                        case 0:
                                                            org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                                                            if (U != null) {
                                                                U.presentFragment(new i9(walletTransactionPeer3.address));
                                                                return;
                                                            }
                                                            return;
                                                        default:
                                                            org.telegram.ui.ActionBar.r2 U2 = LaunchActivity.U();
                                                            if (U2 != null) {
                                                                TL_wallet.WalletTransactionPeer walletTransactionPeer32 = walletTransactionPeer3;
                                                                i9 i9Var = new i9(walletTransactionPeer32.address);
                                                                i9Var.w0(walletTransactionPeer32.domain);
                                                                U2.presentFragment(i9Var);
                                                                return;
                                                            }
                                                            return;
                                                    }
                                                }
                                            });
                                            j2VarArr3[0].dismiss();
                                            return;
                                    }
                                }
                            });
                        }
                    } else {
                        i10 = i22;
                        if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerAddress) {
                            final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress = (TL_wallet.walletTransactionPeerAddress) walletTransactionPeer;
                            if (!TextUtils.isEmpty(wallettransactionpeeraddress.domain)) {
                                if (!TextUtils.isEmpty(wallettransactionpeeraddress.address)) {
                                    if (z12) {
                                        i12 = R.string.WalletSender;
                                    } else {
                                        i12 = R.string.WalletRecipient;
                                    }
                                    String string3 = LocaleController.getString(i12);
                                    String str5 = wallettransactionpeeraddress.domain;
                                    Runnable runnable = new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    j2[] j2VarArr2 = j2VarArr;
                                                    j2 j2Var4 = j2VarArr2[0];
                                                    final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress2 = wallettransactionpeeraddress;
                                                    j2Var4.setOnDismissListener(new DialogInterface.OnDismissListener() {
                                                        @Override
                                                        public final void onDismiss(DialogInterface dialogInterface) {
                                                            switch (r2) {
                                                                case 0:
                                                                    org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                                                                    if (U != null) {
                                                                        TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress3 = wallettransactionpeeraddress2;
                                                                        i9 i9Var = new i9(wallettransactionpeeraddress3.address);
                                                                        i9Var.w0(wallettransactionpeeraddress3.domain);
                                                                        U.presentFragment(i9Var);
                                                                        return;
                                                                    }
                                                                    return;
                                                                default:
                                                                    org.telegram.ui.ActionBar.r2 U2 = LaunchActivity.U();
                                                                    if (U2 != null) {
                                                                        TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress4 = wallettransactionpeeraddress2;
                                                                        i9 i9Var2 = new i9(wallettransactionpeeraddress4.address);
                                                                        i9Var2.w0(wallettransactionpeeraddress4.domain);
                                                                        U2.presentFragment(i9Var2);
                                                                        return;
                                                                    }
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    j2VarArr2[0].dismiss();
                                                    return;
                                                default:
                                                    j2[] j2VarArr3 = j2VarArr;
                                                    j2 j2Var5 = j2VarArr3[0];
                                                    final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress3 = wallettransactionpeeraddress;
                                                    j2Var5.setOnDismissListener(new DialogInterface.OnDismissListener() {
                                                        @Override
                                                        public final void onDismiss(DialogInterface dialogInterface) {
                                                            switch (r2) {
                                                                case 0:
                                                                    org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                                                                    if (U != null) {
                                                                        TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress32 = wallettransactionpeeraddress3;
                                                                        i9 i9Var = new i9(wallettransactionpeeraddress32.address);
                                                                        i9Var.w0(wallettransactionpeeraddress32.domain);
                                                                        U.presentFragment(i9Var);
                                                                        return;
                                                                    }
                                                                    return;
                                                                default:
                                                                    org.telegram.ui.ActionBar.r2 U2 = LaunchActivity.U();
                                                                    if (U2 != null) {
                                                                        TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress4 = wallettransactionpeeraddress3;
                                                                        i9 i9Var2 = new i9(wallettransactionpeeraddress4.address);
                                                                        i9Var2.w0(wallettransactionpeeraddress4.domain);
                                                                        U2.presentFragment(i9Var2);
                                                                        return;
                                                                    }
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    j2VarArr3[0].dismiss();
                                                    return;
                                            }
                                        }
                                    };
                                    String string4 = LocaleController.getString(R.string.WalletSend);
                                    if (callback3 != null) {
                                        b4Var = 0;
                                    } else {
                                        b4Var = new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r3) {
                                                    case 0:
                                                        j2[] j2VarArr2 = j2VarArr;
                                                        j2 j2Var4 = j2VarArr2[0];
                                                        final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress2 = wallettransactionpeeraddress;
                                                        j2Var4.setOnDismissListener(new DialogInterface.OnDismissListener() {
                                                            @Override
                                                            public final void onDismiss(DialogInterface dialogInterface) {
                                                                switch (r2) {
                                                                    case 0:
                                                                        org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                                                                        if (U != null) {
                                                                            TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress32 = wallettransactionpeeraddress2;
                                                                            i9 i9Var = new i9(wallettransactionpeeraddress32.address);
                                                                            i9Var.w0(wallettransactionpeeraddress32.domain);
                                                                            U.presentFragment(i9Var);
                                                                            return;
                                                                        }
                                                                        return;
                                                                    default:
                                                                        org.telegram.ui.ActionBar.r2 U2 = LaunchActivity.U();
                                                                        if (U2 != null) {
                                                                            TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress4 = wallettransactionpeeraddress2;
                                                                            i9 i9Var2 = new i9(wallettransactionpeeraddress4.address);
                                                                            i9Var2.w0(wallettransactionpeeraddress4.domain);
                                                                            U2.presentFragment(i9Var2);
                                                                            return;
                                                                        }
                                                                        return;
                                                                }
                                                            }
                                                        });
                                                        j2VarArr2[0].dismiss();
                                                        return;
                                                    default:
                                                        j2[] j2VarArr3 = j2VarArr;
                                                        j2 j2Var5 = j2VarArr3[0];
                                                        final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress3 = wallettransactionpeeraddress;
                                                        j2Var5.setOnDismissListener(new DialogInterface.OnDismissListener() {
                                                            @Override
                                                            public final void onDismiss(DialogInterface dialogInterface) {
                                                                switch (r2) {
                                                                    case 0:
                                                                        org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                                                                        if (U != null) {
                                                                            TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress32 = wallettransactionpeeraddress3;
                                                                            i9 i9Var = new i9(wallettransactionpeeraddress32.address);
                                                                            i9Var.w0(wallettransactionpeeraddress32.domain);
                                                                            U.presentFragment(i9Var);
                                                                            return;
                                                                        }
                                                                        return;
                                                                    default:
                                                                        org.telegram.ui.ActionBar.r2 U2 = LaunchActivity.U();
                                                                        if (U2 != null) {
                                                                            TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress4 = wallettransactionpeeraddress3;
                                                                            i9 i9Var2 = new i9(wallettransactionpeeraddress4.address);
                                                                            i9Var2.w0(wallettransactionpeeraddress4.domain);
                                                                            U2.presentFragment(i9Var2);
                                                                            return;
                                                                        }
                                                                        return;
                                                                }
                                                            }
                                                        });
                                                        j2VarArr3[0].dismiss();
                                                        return;
                                                }
                                            }
                                        };
                                    }
                                    w01Var.h(string3, str5, runnable, string4, b4Var);
                                    w01Var = w01Var;
                                } else {
                                    if (z12) {
                                        i11 = R.string.WalletSender;
                                    } else {
                                        i11 = R.string.WalletRecipient;
                                    }
                                    w01Var.i(LocaleController.getString(i11), wallettransactionpeeraddress.domain, new ag.c(25));
                                }
                            }
                        }
                    }
                }
                final TL_wallet.WalletTransactionPeer walletTransactionPeer2 = wallettransaction.peer;
                boolean z18 = walletTransactionPeer2 instanceof TL_wallet.walletTransactionPeerUser;
                if (z18 || (walletTransactionPeer2 instanceof TL_wallet.walletTransactionPeerChannel) || (walletTransactionPeer2 instanceof TL_wallet.walletTransactionPeerAddress)) {
                    if (z18 && MessagesController.getInstance(i10).getUser(Long.valueOf(walletTransactionPeer2.user_id)) != null && !UserObject.isService(walletTransactionPeer2.user_id)) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (callback3 == null && !z13 && TextUtils.isEmpty(walletTransactionPeer2.domain) && !TextUtils.isEmpty(walletTransactionPeer2.address)) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    String string5 = LocaleController.getString(R.string.WalletAddress);
                    String str6 = walletTransactionPeer2.address;
                    zc1 zc1Var2 = new zc1(25, j2VarArr, u6Var);
                    if (TextUtils.isEmpty(str6)) {
                        str2 = LocaleController.getString(R.string.WalletUnknown);
                    } else {
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                        for (int i23 = 0; i23 < str6.length(); i23++) {
                            if (i23 > 0 && i23 % 4 == 0) {
                                if (i23 % 16 == 0) {
                                    c10 = '\n';
                                } else {
                                    c10 = ' ';
                                }
                                spannableStringBuilder3.append(c10);
                                spannableStringBuilder3.length();
                            }
                            spannableStringBuilder3.append(str6.charAt(i23));
                            if (i23 % 4 == 3) {
                                spannableStringBuilder3.length();
                            }
                        }
                        spannableStringBuilder3.setSpan(new org.telegram.ui.Cells.i(str6, zc1Var2, 9), 0, spannableStringBuilder3.length(), 33);
                        str2 = spannableStringBuilder3;
                    }
                    CharSequence charSequence = str2;
                    if (z14) {
                        str3 = LocaleController.getString(R.string.WalletSend);
                    } else {
                        str3 = null;
                    }
                    w01Var.j(string5, charSequence, 14, null, str3, new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    j2[] j2VarArr2 = j2VarArr;
                                    j2 j2Var4 = j2VarArr2[0];
                                    final TL_wallet.WalletTransactionPeer walletTransactionPeer22 = walletTransactionPeer2;
                                    j2Var4.setOnDismissListener(new DialogInterface.OnDismissListener() {
                                        @Override
                                        public final void onDismiss(DialogInterface dialogInterface) {
                                            switch (r2) {
                                                case 0:
                                                    org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                                                    if (U != null) {
                                                        U.presentFragment(new i9(walletTransactionPeer22.address));
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    org.telegram.ui.ActionBar.r2 U2 = LaunchActivity.U();
                                                    if (U2 != null) {
                                                        TL_wallet.WalletTransactionPeer walletTransactionPeer32 = walletTransactionPeer22;
                                                        i9 i9Var = new i9(walletTransactionPeer32.address);
                                                        i9Var.w0(walletTransactionPeer32.domain);
                                                        U2.presentFragment(i9Var);
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                    j2VarArr2[0].dismiss();
                                    return;
                                default:
                                    j2[] j2VarArr3 = j2VarArr;
                                    j2 j2Var5 = j2VarArr3[0];
                                    final TL_wallet.WalletTransactionPeer walletTransactionPeer3 = walletTransactionPeer2;
                                    j2Var5.setOnDismissListener(new DialogInterface.OnDismissListener() {
                                        @Override
                                        public final void onDismiss(DialogInterface dialogInterface) {
                                            switch (r2) {
                                                case 0:
                                                    org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                                                    if (U != null) {
                                                        U.presentFragment(new i9(walletTransactionPeer3.address));
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    org.telegram.ui.ActionBar.r2 U2 = LaunchActivity.U();
                                                    if (U2 != null) {
                                                        TL_wallet.WalletTransactionPeer walletTransactionPeer32 = walletTransactionPeer3;
                                                        i9 i9Var = new i9(walletTransactionPeer32.address);
                                                        i9Var.w0(walletTransactionPeer32.domain);
                                                        U2.presentFragment(i9Var);
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                    j2VarArr3[0].dismiss();
                                    return;
                            }
                        }
                    });
                }
                int i24 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                if (i24 > 0 && wallettransaction.gasless) {
                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder("x ");
                    zq zqVar = new zq(R.drawable.wallet_gram_small, 2);
                    zqVar.recolorDrawable = false;
                    zqVar.setSize(AndroidUtilities.dp(16.0f));
                    zqVar.translate(0.0f, AndroidUtilities.dp(1.0f));
                    spannableStringBuilder4.setSpan(zqVar, 0, 1, 33);
                    spannableStringBuilder4.append((CharSequence) LocaleController.getString(R.string.WalletFeePaidByTelegram));
                    w01Var.e(LocaleController.getString(R.string.WalletFee), spannableStringBuilder4, "?", new bi.da(context, u6Var, i10, j10, 19), null);
                } else {
                    int i25 = i10;
                    long j12 = j10;
                    if (i24 > 0 || wallettransaction.nft != null || wallettransaction.preview) {
                        TextView textView2 = new TextView(context);
                        textViewArr[0] = textView2;
                        textView2.setGravity(16);
                        textViewArr[0].setIncludeFontPadding(false);
                        textViewArr[0].setTextSize(1, 14.0f);
                        TextView textView3 = textViewArr[0];
                        if (z10) {
                            i14 = org.telegram.ui.ActionBar.y6.f23765z6;
                        } else {
                            i14 = org.telegram.ui.ActionBar.y6.G6;
                        }
                        org.telegram.ui.ActionBar.f7.V(textView3, i14, u6Var);
                        if (wallettransaction.preview && i24 <= 0) {
                            if (spannableStringArr[0] == null) {
                                SpannableString spannableString = new SpannableString(LocaleController.getString(R.string.Loading));
                                spannableStringArr[0] = spannableString;
                                spannableString.setSpan(new ea0(AndroidUtilities.dp(150.0f), textViewArr[0]), 0, spannableStringArr[0].length(), 33);
                            }
                            textViewArr[0].setText(spannableStringArr[0]);
                        } else {
                            textViewArr[0].setText(org.telegram.ui.Wallet.m5.s0(i25, j12, u6Var));
                        }
                        w01Var.f(textViewArr[0], LocaleController.getString(R.string.WalletFee));
                    }
                }
                if (wallettransaction.date != 0) {
                    w01Var.c(LocaleController.getString(R.string.WalletDate), LocaleController.formatShortDateTime(wallettransaction.date), null, null);
                    return;
                }
                return;
        }
    }

    public s(long[] jArr, fi.d dVar, zq[] zqVarArr, v0 v0Var, q0 q0Var, int i10, bh.r rVar, bh.r rVar2, bh.r rVar3, t tVar, boolean[] zArr) {
        this.f9132c = jArr;
        this.d = dVar;
        this.e = zqVarArr;
        this.f9133f = v0Var;
        this.f9134g = q0Var;
        this.f9131b = i10;
        this.h = rVar;
        this.f9135i = rVar2;
        this.f9136j = rVar3;
        this.f9137k = tVar;
        this.f9138l = zArr;
    }
}
