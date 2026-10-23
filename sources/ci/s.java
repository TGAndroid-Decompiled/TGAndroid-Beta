package ci;

import ai.nd;
import ai.yb;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.l91;
import org.telegram.ui.Components.o01;
import org.telegram.ui.Components.xa;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;
public final class s implements Utilities.Callback {
    public final int f5898a = 1;
    public final int f5899b;
    public final Object f5900c;
    public final View d;
    public final Object e;
    public final Object f5901f;
    public final Object f5902g;
    public final ViewGroup h;
    public final Object f5903i;
    public final Object f5904j;
    public final Object f5905k;
    public final Object f5906l;

    public s(LinearLayout linearLayout, org.telegram.ui.Wallet.p4 p4Var, org.telegram.ui.ActionBar.g6 g6Var, int i10, TextView textView, org.telegram.ui.Wallet.j2[] j2VarArr, o01 o01Var, Utilities.Callback3 callback3, Context context, TextView[] textViewArr, SpannableString[] spannableStringArr) {
        this.f5900c = linearLayout;
        this.d = p4Var;
        this.e = g6Var;
        this.f5899b = i10;
        this.f5901f = textView;
        this.f5902g = j2VarArr;
        this.h = o01Var;
        this.f5903i = callback3;
        this.f5904j = context;
        this.f5905k = textViewArr;
        this.f5906l = spannableStringArr;
    }

    @Override
    public final void run(Object obj) {
        String formatString;
        boolean z10;
        boolean z11;
        SpannableString[] spannableStringArr;
        boolean z12;
        long j10;
        org.telegram.ui.Wallet.j2 j2Var;
        xa xaVar;
        String str;
        org.telegram.ui.Wallet.j2 j2Var2;
        xa xaVar2;
        o01 o01Var;
        int i10;
        int i11;
        int i12;
        org.telegram.ui.Wallet.c4 c4Var;
        int i13;
        boolean z13;
        boolean z14;
        String str2;
        char c10;
        String str3;
        int i14;
        int i15;
        int i16;
        org.telegram.ui.Wallet.y3 y3Var;
        int i17;
        String str4;
        int i18;
        char c11;
        org.telegram.ui.Wallet.j2 j2Var3;
        xa xaVar3;
        CharSequence a2;
        int i19;
        int i20;
        int i21 = this.f5898a;
        Object obj2 = this.f5906l;
        Object obj3 = this.f5905k;
        Object obj4 = this.f5904j;
        Object obj5 = this.f5903i;
        ViewGroup viewGroup = this.h;
        Object obj6 = this.f5902g;
        Object obj7 = this.f5901f;
        Object obj8 = this.e;
        View view = this.d;
        Object obj9 = this.f5900c;
        switch (i21) {
            case 0:
                long[] jArr = (long[]) obj9;
                v0 v0Var = (v0) obj7;
                ah.x xVar = (ah.x) viewGroup;
                ah.x xVar2 = (ah.x) obj5;
                ah.x xVar3 = (ah.x) obj4;
                t tVar = (t) obj3;
                boolean[] zArr = (boolean[]) obj2;
                Integer num = (Integer) obj;
                long intValue = num.intValue();
                jArr[0] = intValue;
                ((ei.d) view).i(nd.W0(false, LocaleController.formatString(R.string.StarsAddHighlightedMessage, LocaleController.formatNumber(intValue, ',')), (xq[]) obj8), true, true);
                v0Var.f6005g = jArr[0];
                ((q0) obj6).set(v0Var);
                int intValue2 = num.intValue();
                int i22 = this.f5899b;
                int b10 = u.b(i22, intValue2, 0);
                int b11 = u.b(i22, num.intValue(), 1);
                int b12 = u.b(i22, num.intValue(), 2);
                if (b10 >= 60) {
                    formatString = LocaleController.formatString(R.string.SlowmodeMinutes, Integer.valueOf(b10 / 60));
                } else {
                    formatString = LocaleController.formatString(R.string.SlowmodeSeconds, Integer.valueOf(b10));
                }
                ((org.telegram.ui.Components.q6) xVar.f900b).c(formatString, true, true);
                ((org.telegram.ui.Components.q6) xVar2.f900b).c(LocaleController.formatNumber(b11, ','), true, true);
                ((org.telegram.ui.Components.q6) xVar3.f900b).c(LocaleController.formatNumber(b12, ','), true, true);
                tVar.f(u.b(i22, num.intValue(), 3), u.b(i22, num.intValue(), 4), true ^ zArr[0]);
                zArr[0] = false;
                return;
            default:
                LinearLayout linearLayout = (LinearLayout) obj9;
                org.telegram.ui.Wallet.p4 p4Var = (org.telegram.ui.Wallet.p4) view;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj8;
                TextView textView = (TextView) obj7;
                final org.telegram.ui.Wallet.j2[] j2VarArr = (org.telegram.ui.Wallet.j2[]) obj6;
                o01 o01Var2 = (o01) viewGroup;
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
                if ((linearLayout.getParent() instanceof View) && (linearLayout.getParent().getParent() instanceof l91) && ((l91) linearLayout.getParent().getParent()).getViewPages()[0] != linearLayout.getParent()) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                boolean z16 = wallettransaction.key_change;
                boolean z17 = z11;
                int i23 = this.f5899b;
                if (!z16 && wallettransaction.nft == null) {
                    if (z10) {
                        i17 = org.telegram.ui.ActionBar.k6.f21588z6;
                    } else {
                        i17 = org.telegram.ui.ActionBar.k6.Oh;
                    }
                    org.telegram.ui.ActionBar.r6.W(p4Var, i17, g6Var);
                    SpannableStringBuilder p5 = org.telegram.ui.Wallet.l0.p(org.telegram.ui.Wallet.l0.n(abs, false), 0.75f);
                    if (z15) {
                        str4 = "+";
                    } else {
                        str4 = "–";
                    }
                    spannableStringArr = spannableStringArr2;
                    p5.insert(0, (CharSequence) str4);
                    if (!z10) {
                        if (z15) {
                            i20 = org.telegram.ui.ActionBar.k6.uj;
                        } else {
                            i20 = org.telegram.ui.ActionBar.k6.G6;
                        }
                        z12 = z15;
                        j10 = abs2;
                        p5.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.k6.w0(i20, g6Var)), 0, p5.length(), 33);
                    } else {
                        z12 = z15;
                        j10 = abs2;
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) org.telegram.ui.Wallet.l0.k("Grams", p5, R.string.Grams_other));
                    int indexOf = TextUtils.indexOf(spannableStringBuilder, p5);
                    int length = p5.length() + indexOf;
                    if (indexOf > 0) {
                        i18 = 33;
                        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.75f), 0, indexOf, 33);
                    } else {
                        i18 = 33;
                    }
                    if (indexOf >= 0 && length < spannableStringBuilder.length()) {
                        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.75f), length, spannableStringBuilder.length(), i18);
                    }
                    p4Var.setText(spannableStringBuilder);
                    CharSequence l4 = org.telegram.ui.Wallet.l0.w(i23).l(abs, false);
                    if (z10) {
                        if (wallettransaction.failed) {
                            a2 = LocaleController.getString(R.string.WalletFailed);
                        } else {
                            a2 = fa.a(textView, LocaleController.getString(R.string.WalletSending));
                        }
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(a2);
                        if (wallettransaction.failed) {
                            i19 = org.telegram.ui.ActionBar.k6.f21404p7;
                        } else {
                            i19 = org.telegram.ui.ActionBar.k6.f21366n6;
                        }
                        c11 = 0;
                        spannableStringBuilder2.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.k6.w0(i19, g6Var)), 0, spannableStringBuilder2.length(), 33);
                        textView.setText(LocaleController.formatSpannable(R.string.WalletTransactionAmountStatus, l4, spannableStringBuilder2));
                    } else {
                        c11 = 0;
                        textView.setText(l4);
                    }
                    if (z17 && (j2Var3 = j2VarArr[c11]) != null && (xaVar3 = j2Var3.e) != null) {
                        xaVar3.setTitle(org.telegram.ui.Wallet.l0.k("Grams", p5, R.string.Grams_other));
                    }
                } else {
                    spannableStringArr = spannableStringArr2;
                    z12 = z15;
                    j10 = abs2;
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
                o01Var2.removeAllViews();
                final TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction.peer;
                if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerUser) {
                    TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = (TL_wallet.walletTransactionPeerUser) walletTransactionPeer;
                    TLRPC.User user = MessagesController.getInstance(i23).getUser(Long.valueOf(wallettransactionpeeruser.user_id));
                    if (user != null && !UserObject.isService(user.f20490id)) {
                        if (z12) {
                            i16 = R.string.WalletSender;
                        } else {
                            i16 = R.string.WalletRecipient;
                        }
                        String string = LocaleController.getString(i16);
                        long j11 = wallettransactionpeeruser.user_id;
                        org.telegram.ui.Wallet.h hVar = new org.telegram.ui.Wallet.h(callback3, j2VarArr, wallettransactionpeeruser, 9);
                        String string2 = LocaleController.getString(R.string.WalletSend);
                        if (callback3 != null) {
                            y3Var = null;
                        } else {
                            y3Var = new org.telegram.ui.Wallet.y3(4, j2VarArr, user);
                        }
                        i15 = i23;
                        o01Var2.m(string, i15, j11, hVar, string2, y3Var);
                        o01Var = o01Var2;
                    } else {
                        o01Var = o01Var2;
                        i15 = i23;
                    }
                    if (!TextUtils.isEmpty(wallettransactionpeeruser.domain) && !TextUtils.isEmpty(wallettransactionpeeruser.address)) {
                        o01Var.i(LocaleController.getString(R.string.WalletDomain), wallettransactionpeeruser.domain, new org.telegram.ui.Wallet.h(j2VarArr, user, wallettransactionpeeruser, 10));
                    }
                    i10 = i15;
                } else {
                    o01Var = o01Var2;
                    if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerChannel) {
                        if (MessagesController.getInstance(i23).getChat(Long.valueOf(walletTransactionPeer.channel_id)) != null) {
                            if (z12) {
                                i13 = R.string.WalletSender;
                            } else {
                                i13 = R.string.WalletRecipient;
                            }
                            o01Var.n(LocaleController.getString(i13), i23, -walletTransactionPeer.channel_id, new org.telegram.ui.Wallet.h(callback3, j2VarArr, walletTransactionPeer, 11));
                        }
                        i10 = i23;
                        if (!TextUtils.isEmpty(walletTransactionPeer.domain) && !TextUtils.isEmpty(walletTransactionPeer.address)) {
                            o01Var.i(LocaleController.getString(R.string.WalletDomain), walletTransactionPeer.domain, new Runnable() {
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
                                                            org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                                            if (U != null) {
                                                                U.presentFragment(new j9(walletTransactionPeer2.address));
                                                                return;
                                                            }
                                                            return;
                                                        default:
                                                            org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                                                            if (U2 != null) {
                                                                TL_wallet.WalletTransactionPeer walletTransactionPeer3 = walletTransactionPeer2;
                                                                j9 j9Var = new j9(walletTransactionPeer3.address);
                                                                j9Var.v0(walletTransactionPeer3.domain);
                                                                U2.presentFragment(j9Var);
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
                                                            org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                                            if (U != null) {
                                                                U.presentFragment(new j9(walletTransactionPeer3.address));
                                                                return;
                                                            }
                                                            return;
                                                        default:
                                                            org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                                                            if (U2 != null) {
                                                                TL_wallet.WalletTransactionPeer walletTransactionPeer32 = walletTransactionPeer3;
                                                                j9 j9Var = new j9(walletTransactionPeer32.address);
                                                                j9Var.v0(walletTransactionPeer32.domain);
                                                                U2.presentFragment(j9Var);
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
                        i10 = i23;
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
                                                                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                                                    if (U != null) {
                                                                        TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress3 = wallettransactionpeeraddress2;
                                                                        j9 j9Var = new j9(wallettransactionpeeraddress3.address);
                                                                        j9Var.v0(wallettransactionpeeraddress3.domain);
                                                                        U.presentFragment(j9Var);
                                                                        return;
                                                                    }
                                                                    return;
                                                                default:
                                                                    org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                                                                    if (U2 != null) {
                                                                        TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress4 = wallettransactionpeeraddress2;
                                                                        j9 j9Var2 = new j9(wallettransactionpeeraddress4.address);
                                                                        j9Var2.v0(wallettransactionpeeraddress4.domain);
                                                                        U2.presentFragment(j9Var2);
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
                                                                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                                                    if (U != null) {
                                                                        TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress32 = wallettransactionpeeraddress3;
                                                                        j9 j9Var = new j9(wallettransactionpeeraddress32.address);
                                                                        j9Var.v0(wallettransactionpeeraddress32.domain);
                                                                        U.presentFragment(j9Var);
                                                                        return;
                                                                    }
                                                                    return;
                                                                default:
                                                                    org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                                                                    if (U2 != null) {
                                                                        TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress4 = wallettransactionpeeraddress3;
                                                                        j9 j9Var2 = new j9(wallettransactionpeeraddress4.address);
                                                                        j9Var2.v0(wallettransactionpeeraddress4.domain);
                                                                        U2.presentFragment(j9Var2);
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
                                        c4Var = 0;
                                    } else {
                                        c4Var = new Runnable() {
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
                                                                        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                                                        if (U != null) {
                                                                            TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress32 = wallettransactionpeeraddress2;
                                                                            j9 j9Var = new j9(wallettransactionpeeraddress32.address);
                                                                            j9Var.v0(wallettransactionpeeraddress32.domain);
                                                                            U.presentFragment(j9Var);
                                                                            return;
                                                                        }
                                                                        return;
                                                                    default:
                                                                        org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                                                                        if (U2 != null) {
                                                                            TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress4 = wallettransactionpeeraddress2;
                                                                            j9 j9Var2 = new j9(wallettransactionpeeraddress4.address);
                                                                            j9Var2.v0(wallettransactionpeeraddress4.domain);
                                                                            U2.presentFragment(j9Var2);
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
                                                                        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                                                        if (U != null) {
                                                                            TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress32 = wallettransactionpeeraddress3;
                                                                            j9 j9Var = new j9(wallettransactionpeeraddress32.address);
                                                                            j9Var.v0(wallettransactionpeeraddress32.domain);
                                                                            U.presentFragment(j9Var);
                                                                            return;
                                                                        }
                                                                        return;
                                                                    default:
                                                                        org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                                                                        if (U2 != null) {
                                                                            TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress4 = wallettransactionpeeraddress3;
                                                                            j9 j9Var2 = new j9(wallettransactionpeeraddress4.address);
                                                                            j9Var2.v0(wallettransactionpeeraddress4.domain);
                                                                            U2.presentFragment(j9Var2);
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
                                    o01Var.h(string3, str5, runnable, string4, c4Var);
                                    o01Var = o01Var;
                                } else {
                                    if (z12) {
                                        i11 = R.string.WalletSender;
                                    } else {
                                        i11 = R.string.WalletRecipient;
                                    }
                                    o01Var.i(LocaleController.getString(i11), wallettransactionpeeraddress.domain, new ah.j(23));
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
                    org.telegram.ui.Wallet.y3 y3Var2 = new org.telegram.ui.Wallet.y3(5, j2VarArr, g6Var);
                    if (TextUtils.isEmpty(str6)) {
                        str2 = LocaleController.getString(R.string.WalletUnknown);
                    } else {
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                        for (int i24 = 0; i24 < str6.length(); i24++) {
                            if (i24 > 0 && i24 % 4 == 0) {
                                if (i24 % 16 == 0) {
                                    c10 = '\n';
                                } else {
                                    c10 = ' ';
                                }
                                spannableStringBuilder3.append(c10);
                                spannableStringBuilder3.length();
                            }
                            spannableStringBuilder3.append(str6.charAt(i24));
                            if (i24 % 4 == 3) {
                                spannableStringBuilder3.length();
                            }
                        }
                        spannableStringBuilder3.setSpan(new org.telegram.ui.Cells.i(str6, y3Var2, 9), 0, spannableStringBuilder3.length(), 33);
                        str2 = spannableStringBuilder3;
                    }
                    if (z14) {
                        str3 = LocaleController.getString(R.string.WalletSend);
                    } else {
                        str3 = null;
                    }
                    o01Var.j(string5, str2, 14, null, str3, new Runnable() {
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
                                                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                                    if (U != null) {
                                                        U.presentFragment(new j9(walletTransactionPeer22.address));
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                                                    if (U2 != null) {
                                                        TL_wallet.WalletTransactionPeer walletTransactionPeer32 = walletTransactionPeer22;
                                                        j9 j9Var = new j9(walletTransactionPeer32.address);
                                                        j9Var.v0(walletTransactionPeer32.domain);
                                                        U2.presentFragment(j9Var);
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
                                                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                                    if (U != null) {
                                                        U.presentFragment(new j9(walletTransactionPeer3.address));
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                                                    if (U2 != null) {
                                                        TL_wallet.WalletTransactionPeer walletTransactionPeer32 = walletTransactionPeer3;
                                                        j9 j9Var = new j9(walletTransactionPeer32.address);
                                                        j9Var.v0(walletTransactionPeer32.domain);
                                                        U2.presentFragment(j9Var);
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
                int i25 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                if (i25 > 0 && wallettransaction.gasless) {
                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder("x ");
                    xq xqVar = new xq(R.drawable.wallet_gram_small, 2);
                    xqVar.recolorDrawable = false;
                    xqVar.setSize(AndroidUtilities.dp(16.0f));
                    xqVar.translate(0.0f, AndroidUtilities.dp(1.0f));
                    spannableStringBuilder4.setSpan(xqVar, 0, 1, 33);
                    spannableStringBuilder4.append((CharSequence) LocaleController.getString(R.string.WalletFeePaidByTelegram));
                    o01Var.e(LocaleController.getString(R.string.WalletFee), spannableStringBuilder4, "?", new yb(context, g6Var, i10, j10, 18), null);
                } else {
                    int i26 = i10;
                    long j12 = j10;
                    if (i25 > 0 || wallettransaction.nft != null || wallettransaction.preview) {
                        TextView textView2 = new TextView(context);
                        textViewArr[0] = textView2;
                        textView2.setGravity(16);
                        textViewArr[0].setIncludeFontPadding(false);
                        textViewArr[0].setTextSize(1, 14.0f);
                        TextView textView3 = textViewArr[0];
                        if (z10) {
                            i14 = org.telegram.ui.ActionBar.k6.f21588z6;
                        } else {
                            i14 = org.telegram.ui.ActionBar.k6.G6;
                        }
                        org.telegram.ui.ActionBar.r6.W(textView3, i14, g6Var);
                        if (wallettransaction.preview && i25 <= 0) {
                            if (spannableStringArr[0] == null) {
                                SpannableString spannableString = new SpannableString(LocaleController.getString(R.string.Loading));
                                spannableStringArr[0] = spannableString;
                                spannableString.setSpan(new da0(AndroidUtilities.dp(150.0f), textViewArr[0]), 0, spannableStringArr[0].length(), 33);
                            }
                            textViewArr[0].setText(spannableStringArr[0]);
                        } else {
                            textViewArr[0].setText(org.telegram.ui.Wallet.o5.r0(i26, j12, g6Var));
                        }
                        o01Var.f(textViewArr[0], LocaleController.getString(R.string.WalletFee));
                    }
                }
                if (wallettransaction.date != 0) {
                    o01Var.c(LocaleController.getString(R.string.WalletDate), LocaleController.formatShortDateTime(wallettransaction.date), null, null);
                    return;
                }
                return;
        }
    }

    public s(long[] jArr, ei.d dVar, xq[] xqVarArr, v0 v0Var, q0 q0Var, int i10, ah.x xVar, ah.x xVar2, ah.x xVar3, t tVar, boolean[] zArr) {
        this.f5900c = jArr;
        this.d = dVar;
        this.e = xqVarArr;
        this.f5901f = v0Var;
        this.f5902g = q0Var;
        this.f5899b = i10;
        this.h = xVar;
        this.f5903i = xVar2;
        this.f5904j = xVar3;
        this.f5905k = tVar;
        this.f5906l = zArr;
    }
}
