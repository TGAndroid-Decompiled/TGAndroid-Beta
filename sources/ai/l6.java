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
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.u40;
public final class l6 {
    public final TL_stars.TL_starGiftUnique f1703a;
    public final Context f1704b;
    public final int f1705c;
    public final long d;
    public final String e;
    public final boolean f1706f;
    public final org.telegram.ui.ActionBar.d6 f1707g;
    public final org.telegram.ui.ActionBar.b2 h;
    public final u40 f1708i;
    public final TextView f1709j;
    public c f1710k;
    public TextView f1711l;
    public FrameLayout f1712m;
    public pf.c f1713n;
    public final HashMap f1714o;
    public final HashSet f1715p;
    public ag.b f1716q;
    public ei.x3 f1717r;

    public l6(Context context, org.telegram.ui.ActionBar.d6 d6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, i6 i6Var, int i10, long j10, String str, boolean z10, Utilities.Callback2 callback2) {
        TLObject chat;
        HashMap hashMap = new HashMap();
        this.f1714o = hashMap;
        this.f1715p = new HashSet();
        this.f1704b = context;
        this.f1703a = tL_starGiftUnique;
        this.d = j10;
        this.f1705c = i10;
        ag.b bVar = i6Var.f1489a;
        this.f1716q = bVar;
        hashMap.put(bVar, i6Var);
        this.f1707g = d6Var;
        this.e = str;
        boolean z11 = tL_starGiftUnique.resale_ton_only;
        this.f1706f = !z11;
        if (j10 >= 0) {
            chat = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
        } else {
            chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
        }
        LinearLayout e = kk.e(context, 1);
        k6 k6Var = new k6(this, context);
        k6Var.addView(e, w7.z5.c(-2.0f, -1));
        if (!z11) {
            u40 u40Var = new u40(context, d6Var);
            this.f1708i = u40Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.Gift2BuyInStars));
            arrayList.add(LocaleController.getString(R.string.Gift2BuyInTON));
            u40Var.b(arrayList, new w0(this, 2));
            e.addView(u40Var, w7.z5.t(-2, -2, 1, 18, 0, 18, 12));
        } else {
            this.f1708i = null;
            TextView textView = new TextView(context);
            kk.o(org.telegram.ui.ActionBar.h6.f21375y6, d6Var, textView, 1, 14.0f);
            kk.m(R.string.Gift2BuyPriceOnlyTON, textView, 17);
            e.addView(textView, w7.z5.t(-2, -2, 17, 24, 4, 24, 4));
        }
        e.addView(new g6(context, tL_starGiftUnique, chat), w7.z5.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView2 = new TextView(context);
        this.f1709j = textView2;
        kk.o(org.telegram.ui.ActionBar.h6.f21093j5, d6Var, textView2, 1, 16.0f);
        e.addView(textView2, w7.z5.t(-1, -2, 48, 24, 4, 24, 4));
        if (z10) {
            k01 k01Var = new k01(context, d6Var);
            l7.I1(k01Var, ga.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
            l7.I1(k01Var, ga.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
            l7.I1(k01Var, ga.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
            if (!TextUtils.isEmpty(tL_starGiftUnique.slug) && (tL_starGiftUnique.flags & 256) != 0) {
                k01Var.c(LocaleController.getString(R.string.GiftValue2), r4.c.h("~", BillingController.getInstance().formatCurrency(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency, BillingController.getInstance().getCurrencyExp(tL_starGiftUnique.value_currency), true)), null, null);
            }
            e.addView(k01Var, w7.z5.t(-1, -2, 48, 23, 16, 23, 4));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var);
        alertDialog$Builder.n(k6Var);
        alertDialog$Builder.k("_", new j6(this, i10, context, d6Var, callback2, 0));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        this.h = alertDialog$Builder.f20602a;
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
        ag.b bVar = this.f1716q;
        i6 i6Var = (i6) this.f1714o.get(bVar);
        TextView textView = this.f1709j;
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
        TextView textView2 = this.f1711l;
        if (i6Var != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        textView2.setEnabled(z12);
        c cVar = this.f1710k;
        if (cVar.e != bVar) {
            cVar.e = bVar;
            cVar.a();
        }
        ag.b bVar2 = ag.b.f634b;
        u40 u40Var = this.f1708i;
        if (u40Var != null) {
            if (bVar == bVar2) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            u40Var.a(i10, z10);
        }
        if (bVar == bVar2 && (x3Var = this.f1717r) != null && x3Var.V) {
            x3Var.e(true);
        }
        c cVar2 = this.f1710k;
        ag.b bVar3 = ag.b.f633a;
        if (cVar2 != null) {
            if (bVar == bVar3) {
                cVar2.setOnClickListener(new ah.g0(this, 7));
            } else {
                cVar2.setOnClickListener(new ah.f(22));
            }
        }
        pf.c cVar3 = this.f1713n;
        if (cVar3 != null) {
            cVar3.a(false);
            this.f1713n = null;
        }
        int i11 = this.f1705c;
        long j10 = this.d;
        if (i6Var != null) {
            ag.b bVar4 = i6Var.f1489a;
            ag.a aVar = i6Var.f1491c;
            if (j10 == UserConfig.getInstance(i11).getClientUserId()) {
                z13 = true;
            } else {
                z13 = false;
            }
            String str = this.e;
            if (bVar4 == bVar3) {
                this.f1711l.setText(md.R0(LocaleController.formatPluralStringComma("Gift2BuyDoPrice2", (int) aVar.a())));
                if (z13) {
                    formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2BuyPriceSelfText", (int) aVar.a(), str);
                } else {
                    formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2BuyPriceText", (int) aVar.a(), str, DialogObject.getShortName(j10));
                }
                textView.setText(AndroidUtilities.replaceTags(formatPluralStringComma));
            }
            if (bVar4 == bVar2) {
                this.f1711l.setText(md.T0(LocaleController.formatString(R.string.Gift2BuyDoPrice2TON, aVar.d()), true));
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
        this.f1713n = h;
        h.d();
        if (this.f1715p.add(bVar)) {
            ga.x(i11, bVar).H(this.f1703a, j10, null, true, new o2(4, this, bVar));
        }
    }

    public final void b() {
        org.telegram.ui.ActionBar.b2 b2Var = this.h;
        b2Var.X0 = true;
        b2Var.show();
        this.f1711l = (TextView) b2Var.d(-1);
        this.f1710k = b2Var.Z0;
        FrameLayout frameLayout = b2Var.Y0;
        this.f1712m = frameLayout;
        if (frameLayout != null && this.f1706f) {
            ei.x3 x3Var = new ei.x3(this.f1704b, 3);
            x3Var.p(true);
            x3Var.K = Layout.Alignment.ALIGN_NORMAL;
            x3Var.d = 5000L;
            x3Var.s(LocaleController.getString(R.string.Gift2BuyPricePayHintTON));
            x3Var.u();
            this.f1717r = x3Var;
            x3Var.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
            this.f1712m.addView(this.f1717r, w7.z5.d(-2, 100.0f, 48, 0.0f, 26.0f, 0.0f, 0.0f));
        }
        a(false);
    }
}
