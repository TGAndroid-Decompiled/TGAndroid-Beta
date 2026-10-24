package ai;

import android.content.Context;
import android.text.Layout;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.tl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.n01;
import org.telegram.ui.Components.s40;
public final class l6 {
    public final TL_stars.TL_starGiftUnique f1695a;
    public final Context f1696b;
    public final int f1697c;
    public final long d;
    public final String e;
    public final boolean f1698f;
    public final org.telegram.ui.ActionBar.g6 f1699g;
    public final org.telegram.ui.ActionBar.c2 h;
    public final s40 f1700i;
    public final TextView f1701j;
    public c f1702k;
    public TextView f1703l;
    public FrameLayout f1704m;
    public pf.c f1705n;
    public final HashMap f1706o;
    public final HashSet f1707p;
    public ag.b f1708q;
    public ei.x3 f1709r;

    public l6(Context context, org.telegram.ui.ActionBar.g6 g6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, i6 i6Var, int i10, long j10, String str, boolean z10, Utilities.Callback2 callback2) {
        TLObject chat;
        HashMap hashMap = new HashMap();
        this.f1706o = hashMap;
        this.f1707p = new HashSet();
        this.f1696b = context;
        this.f1695a = tL_starGiftUnique;
        this.d = j10;
        this.f1697c = i10;
        ag.b bVar = i6Var.f1477a;
        this.f1708q = bVar;
        hashMap.put(bVar, i6Var);
        this.f1699g = g6Var;
        this.e = str;
        boolean z11 = tL_starGiftUnique.resale_ton_only;
        this.f1698f = !z11;
        if (j10 >= 0) {
            chat = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
        } else {
            chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
        }
        LinearLayout e = tl.e(context, 1);
        k6 k6Var = new k6(this, context);
        k6Var.addView(e, w7.z5.c(-2.0f, -1));
        if (!z11) {
            s40 s40Var = new s40(context, g6Var);
            this.f1700i = s40Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.Gift2BuyInStars));
            arrayList.add(LocaleController.getString(R.string.Gift2BuyInTON));
            s40Var.b(arrayList, new w0(this, 2));
            e.addView(s40Var, w7.z5.t(-2, -2, 1, 18, 0, 18, 12));
        } else {
            this.f1700i = null;
            TextView textView = new TextView(context);
            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21572y6, g6Var);
            textView.setTextSize(1, 14.0f);
            tl.m(R.string.Gift2BuyPriceOnlyTON, textView, 17);
            e.addView(textView, w7.z5.t(-2, -2, 17, 24, 4, 24, 4));
        }
        e.addView(new g6(context, tL_starGiftUnique, chat), w7.z5.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView2 = new TextView(context);
        this.f1701j = textView2;
        org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.f21290j5, g6Var);
        textView2.setTextSize(1, 16.0f);
        e.addView(textView2, w7.z5.t(-1, -2, 48, 24, 4, 24, 4));
        if (z10) {
            n01 n01Var = new n01(context, g6Var);
            l7.H1(n01Var, ha.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
            l7.H1(n01Var, ha.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
            l7.H1(n01Var, ha.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
            if (!TextUtils.isEmpty(tL_starGiftUnique.slug) && (tL_starGiftUnique.flags & 256) != 0) {
                n01Var.c(LocaleController.getString(R.string.GiftValue2), si.o0.h("~", BillingController.getInstance().formatCurrency(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency, BillingController.getInstance().getCurrencyExp(tL_starGiftUnique.value_currency), true)), null, null);
            }
            e.addView(n01Var, w7.z5.t(-1, -2, 48, 23, 16, 23, 4));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
        alertDialog$Builder.o(k6Var);
        alertDialog$Builder.k("_", new j6(this, i10, context, g6Var, callback2, 0));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        this.h = alertDialog$Builder.f20679a;
    }

    public final void a(boolean z10) {
        float f7;
        boolean z11;
        boolean z12;
        boolean z13;
        String formatString;
        String formatPluralStringComma;
        ei.x3 x3Var;
        int i10;
        ag.b bVar = this.f1708q;
        i6 i6Var = (i6) this.f1706o.get(bVar);
        TextView textView = this.f1701j;
        ViewPropertyAnimator animate = textView.animate();
        if (i6Var != null) {
            f7 = 1.0f;
        } else {
            f7 = 0.25f;
        }
        animate.alpha(f7).start();
        if (i6Var != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        textView.setEnabled(z11);
        TextView textView2 = this.f1703l;
        if (i6Var != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        textView2.setEnabled(z12);
        c cVar = this.f1702k;
        if (cVar.e != bVar) {
            cVar.e = bVar;
            cVar.a();
        }
        ag.b bVar2 = ag.b.f634b;
        s40 s40Var = this.f1700i;
        if (s40Var != null) {
            if (bVar == bVar2) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            s40Var.a(i10, z10);
        }
        if (bVar == bVar2 && (x3Var = this.f1709r) != null && x3Var.V) {
            x3Var.e(true);
        }
        c cVar2 = this.f1702k;
        ag.b bVar3 = ag.b.f633a;
        if (cVar2 != null) {
            if (bVar == bVar3) {
                cVar2.setOnClickListener(new ah.g0(this, 7));
            } else {
                cVar2.setOnClickListener(new ah.f(22));
            }
        }
        pf.c cVar3 = this.f1705n;
        if (cVar3 != null) {
            cVar3.a(false);
            this.f1705n = null;
        }
        int i11 = this.f1697c;
        long j10 = this.d;
        if (i6Var != null) {
            ag.b bVar4 = i6Var.f1477a;
            ag.a aVar = i6Var.f1479c;
            if (j10 == UserConfig.getInstance(i11).getClientUserId()) {
                z13 = true;
            } else {
                z13 = false;
            }
            String str = this.e;
            if (bVar4 == bVar3) {
                this.f1703l.setText(nd.R0(LocaleController.formatPluralStringComma("Gift2BuyDoPrice2", (int) aVar.a())));
                if (z13) {
                    formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2BuyPriceSelfText", (int) aVar.a(), str);
                } else {
                    formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2BuyPriceText", (int) aVar.a(), str, DialogObject.getShortName(j10));
                }
                textView.setText(AndroidUtilities.replaceTags(formatPluralStringComma));
            }
            if (bVar4 == bVar2) {
                this.f1703l.setText(nd.T0(LocaleController.formatString(R.string.Gift2BuyDoPrice2TON, aVar.d()), true));
                if (z13) {
                    formatString = LocaleController.formatString(R.string.Gift2BuyPriceSelfTextTON, aVar.d(), str);
                } else {
                    formatString = LocaleController.formatString(R.string.Gift2BuyPriceTextTON, aVar.d(), str, DialogObject.getShortName(j10));
                }
                textView.setText(AndroidUtilities.replaceTags(formatString));
                return;
            }
            return;
        }
        pf.c h = this.h.h(-1, false, false);
        this.f1705n = h;
        h.d();
        if (this.f1707p.add(bVar)) {
            ha.x(i11, bVar).H(this.f1695a, j10, null, true, new o2(4, this, bVar));
        }
    }

    public final void b() {
        org.telegram.ui.ActionBar.c2 c2Var = this.h;
        c2Var.Z0 = true;
        c2Var.show();
        this.f1703l = (TextView) c2Var.d(-1);
        this.f1702k = c2Var.f20748b1;
        FrameLayout frameLayout = c2Var.f20745a1;
        this.f1704m = frameLayout;
        if (frameLayout != null && this.f1698f) {
            ei.x3 x3Var = new ei.x3(this.f1696b, 3);
            x3Var.p(true);
            x3Var.K = Layout.Alignment.ALIGN_NORMAL;
            x3Var.d = 5000L;
            x3Var.s(LocaleController.getString(R.string.Gift2BuyPricePayHintTON));
            x3Var.u();
            this.f1709r = x3Var;
            x3Var.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
            this.f1704m.addView(this.f1709r, w7.z5.d(-2, 100.0f, 48, 0.0f, 26.0f, 0.0f, 0.0f));
        }
        a(false);
    }
}
