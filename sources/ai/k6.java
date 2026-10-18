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
import org.telegram.messenger.kk;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.j01;
import org.telegram.ui.Components.u40;
public final class k6 {
    public final TL_stars.TL_starGiftUnique f1636a;
    public final Context f1637b;
    public final int f1638c;
    public final long d;
    public final String e;
    public final boolean f1639f;
    public final org.telegram.ui.ActionBar.d6 f1640g;
    public final org.telegram.ui.ActionBar.b2 h;
    public final u40 f1641i;
    public final TextView f1642j;
    public c f1643k;
    public TextView f1644l;
    public FrameLayout f1645m;
    public pf.c f1646n;
    public final HashMap f1647o;
    public final HashSet f1648p;
    public ag.c f1649q;
    public ei.x3 f1650r;

    public k6(Context context, org.telegram.ui.ActionBar.d6 d6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, h6 h6Var, int i10, long j10, String str, boolean z10, Utilities.Callback2 callback2) {
        TLObject chat;
        HashMap hashMap = new HashMap();
        this.f1647o = hashMap;
        this.f1648p = new HashSet();
        this.f1637b = context;
        this.f1636a = tL_starGiftUnique;
        this.d = j10;
        this.f1638c = i10;
        ag.c cVar = h6Var.f1411a;
        this.f1649q = cVar;
        hashMap.put(cVar, h6Var);
        this.f1640g = d6Var;
        this.e = str;
        boolean z11 = tL_starGiftUnique.resale_ton_only;
        this.f1639f = !z11;
        if (j10 >= 0) {
            chat = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
        } else {
            chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
        }
        LinearLayout e = kk.e(context, 1);
        j6 j6Var = new j6(this, context);
        j6Var.addView(e, w7.z5.d(-2.0f, -1));
        if (!z11) {
            u40 u40Var = new u40(context, d6Var);
            this.f1641i = u40Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.Gift2BuyInStars));
            arrayList.add(LocaleController.getString(R.string.Gift2BuyInTON));
            u40Var.b(arrayList, new w0(this, 2));
            e.addView(u40Var, w7.z5.t(-2, -2, 1, 18, 0, 18, 12));
        } else {
            this.f1641i = null;
            TextView textView = new TextView(context);
            kk.o(org.telegram.ui.ActionBar.h6.f21381y6, d6Var, textView, 1, 14.0f);
            kk.m(R.string.Gift2BuyPriceOnlyTON, textView, 17);
            e.addView(textView, w7.z5.t(-2, -2, 17, 24, 4, 24, 4));
        }
        e.addView(new f6(context, tL_starGiftUnique, chat), w7.z5.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView2 = new TextView(context);
        this.f1642j = textView2;
        kk.o(org.telegram.ui.ActionBar.h6.f21099j5, d6Var, textView2, 1, 16.0f);
        e.addView(textView2, w7.z5.t(-1, -2, 48, 24, 4, 24, 4));
        if (z10) {
            j01 j01Var = new j01(context, d6Var);
            k7.C1(j01Var, ga.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
            k7.C1(j01Var, ga.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
            k7.C1(j01Var, ga.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
            if (!TextUtils.isEmpty(tL_starGiftUnique.slug) && (tL_starGiftUnique.flags & 256) != 0) {
                j01Var.c(LocaleController.getString(R.string.GiftValue2), r4.c.h("~", BillingController.getInstance().formatCurrency(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency, BillingController.getInstance().getCurrencyExp(tL_starGiftUnique.value_currency), true)), null, null);
            }
            e.addView(j01Var, w7.z5.t(-1, -2, 48, 23, 16, 23, 4));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var);
        alertDialog$Builder.n(j6Var);
        alertDialog$Builder.k("_", new i6(this, i10, context, d6Var, callback2, 0));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        this.h = alertDialog$Builder.f20608a;
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
        ag.c cVar = this.f1649q;
        h6 h6Var = (h6) this.f1647o.get(cVar);
        TextView textView = this.f1642j;
        ViewPropertyAnimator animate = textView.animate();
        if (h6Var != null) {
            f7 = 1.0f;
        } else {
            f7 = 0.25f;
        }
        animate.alpha(f7).start();
        if (h6Var != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        textView.setEnabled(z11);
        TextView textView2 = this.f1644l;
        if (h6Var != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        textView2.setEnabled(z12);
        c cVar2 = this.f1643k;
        if (cVar2.e != cVar) {
            cVar2.e = cVar;
            cVar2.a();
        }
        ag.c cVar3 = ag.c.f636b;
        u40 u40Var = this.f1641i;
        if (u40Var != null) {
            if (cVar == cVar3) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            u40Var.a(i10, z10);
        }
        if (cVar == cVar3 && (x3Var = this.f1650r) != null && x3Var.V) {
            x3Var.e(true);
        }
        c cVar4 = this.f1643k;
        ag.c cVar5 = ag.c.f635a;
        if (cVar4 != null) {
            if (cVar == cVar5) {
                cVar4.setOnClickListener(new ah.g0(this, 7));
            } else {
                cVar4.setOnClickListener(new ah.f(22));
            }
        }
        pf.c cVar6 = this.f1646n;
        if (cVar6 != null) {
            cVar6.a(false);
            this.f1646n = null;
        }
        int i11 = this.f1638c;
        long j10 = this.d;
        if (h6Var != null) {
            ag.c cVar7 = h6Var.f1411a;
            ag.a aVar = h6Var.f1413c;
            if (j10 == UserConfig.getInstance(i11).getClientUserId()) {
                z13 = true;
            } else {
                z13 = false;
            }
            String str = this.e;
            if (cVar7 == cVar5) {
                this.f1644l.setText(md.R0(LocaleController.formatPluralStringComma("Gift2BuyDoPrice2", (int) aVar.a())));
                if (z13) {
                    formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2BuyPriceSelfText", (int) aVar.a(), str);
                } else {
                    formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2BuyPriceText", (int) aVar.a(), str, DialogObject.getShortName(j10));
                }
                textView.setText(AndroidUtilities.replaceTags(formatPluralStringComma));
            }
            if (cVar7 == cVar3) {
                this.f1644l.setText(md.T0(LocaleController.formatString(R.string.Gift2BuyDoPrice2TON, aVar.d()), true));
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
        pf.c g10 = this.h.g(-1, false, false);
        this.f1646n = g10;
        g10.d();
        if (this.f1648p.add(cVar)) {
            ga.x(i11, cVar).H(this.f1636a, j10, null, true, new o2(4, this, cVar));
        }
    }

    public final void b() {
        org.telegram.ui.ActionBar.b2 b2Var = this.h;
        b2Var.X0 = true;
        b2Var.show();
        this.f1644l = (TextView) b2Var.d(-1);
        this.f1643k = b2Var.Z0;
        FrameLayout frameLayout = b2Var.Y0;
        this.f1645m = frameLayout;
        if (frameLayout != null && this.f1639f) {
            ei.x3 x3Var = new ei.x3(this.f1637b, 3);
            x3Var.p(true);
            x3Var.K = Layout.Alignment.ALIGN_NORMAL;
            x3Var.d = 5000L;
            x3Var.s(LocaleController.getString(R.string.Gift2BuyPricePayHintTON));
            x3Var.u();
            this.f1650r = x3Var;
            x3Var.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
            this.f1645m.addView(this.f1650r, w7.z5.a(100.0f, 0.0f, 26.0f, 0.0f, 0.0f, -2, 48));
        }
        a(false);
    }
}
