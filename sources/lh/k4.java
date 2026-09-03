package lh;

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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.o40;
import org.telegram.ui.Components.sz0;
public final class k4 {
    public final TL_stars.TL_starGiftUnique f12688a;
    public final Context f12689b;
    public final int f12690c;
    public final long d;
    public final String e;
    public final boolean f12691f;
    public final org.telegram.ui.ActionBar.f6 f12692g;
    public final org.telegram.ui.ActionBar.d2 h;
    public final o40 f12693i;
    public final TextView f12694j;
    public c f12695k;
    public TextView f12696l;
    public FrameLayout f12697m;
    public ze.c f12698n;
    public final HashMap f12699o;
    public final HashSet f12700p;
    public lf.b f12701q;
    public ph.f3 f12702r;

    public k4(Context context, org.telegram.ui.ActionBar.f6 f6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, i4 i4Var, int i10, long j10, String str, boolean z4, Utilities.Callback2 callback2) {
        TLObject chat;
        HashMap hashMap = new HashMap();
        this.f12699o = hashMap;
        this.f12700p = new HashSet();
        this.f12689b = context;
        this.f12688a = tL_starGiftUnique;
        this.d = j10;
        this.f12690c = i10;
        lf.b bVar = i4Var.f12569a;
        this.f12701q = bVar;
        hashMap.put(bVar, i4Var);
        this.f12692g = f6Var;
        this.e = str;
        boolean z10 = tL_starGiftUnique.resale_ton_only;
        this.f12691f = !z10;
        if (j10 >= 0) {
            chat = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
        } else {
            chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
        }
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        j4 j4Var = new j4(this, context);
        j4Var.addView(f10, k7.b6.c(-2.0f, -1));
        if (!z10) {
            o40 o40Var = new o40(context, f6Var);
            this.f12693i = o40Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.Gift2BuyInStars));
            arrayList.add(LocaleController.getString(R.string.Gift2BuyInTON));
            o40Var.b(arrayList, new j0(this, 2));
            f10.addView(o40Var, k7.b6.t(-2, -2, 1, 18, 0, 18, 12));
        } else {
            this.f12693i = null;
            TextView textView = new TextView(context);
            org.telegram.ui.b.l(org.telegram.ui.ActionBar.j6.f20256y6, f6Var, textView, 1, 14.0f);
            org.telegram.messenger.y3.r(R.string.Gift2BuyPriceOnlyTON, textView, 17);
            f10.addView(textView, k7.b6.t(-2, -2, 17, 24, 4, 24, 4));
        }
        f10.addView(new h4(context, tL_starGiftUnique, chat), k7.b6.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView2 = new TextView(context);
        this.f12694j = textView2;
        org.telegram.ui.b.l(org.telegram.ui.ActionBar.j6.f19987j5, f6Var, textView2, 1, 16.0f);
        f10.addView(textView2, k7.b6.t(-1, -2, 48, 24, 4, 24, 4));
        if (z4) {
            sz0 sz0Var = new sz0(context, f6Var);
            g5.q1(sz0Var, t7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
            g5.q1(sz0Var, t7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
            g5.q1(sz0Var, t7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
            if (!TextUtils.isEmpty(tL_starGiftUnique.slug) && (tL_starGiftUnique.flags & 256) != 0) {
                sz0Var.c(LocaleController.getString(R.string.GiftValue2), vh.w2.e("~", BillingController.getInstance().formatCurrency(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency, BillingController.getInstance().getCurrencyExp(tL_starGiftUnique.value_currency), true)), null, null);
            }
            f10.addView(sz0Var, k7.b6.t(-1, -2, 48, 23, 16, 23, 4));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        alertDialog$Builder.n(j4Var);
        alertDialog$Builder.k("_", new dg.l3(this, i10, context, f6Var, callback2, 2));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        this.h = alertDialog$Builder.f19478a;
    }

    public final void a(boolean z4) {
        float f10;
        boolean z10;
        boolean z11;
        boolean z12;
        String formatString;
        String formatPluralStringComma;
        ph.f3 f3Var;
        int i10;
        lf.b bVar = this.f12701q;
        i4 i4Var = (i4) this.f12699o.get(bVar);
        TextView textView = this.f12694j;
        ViewPropertyAnimator animate = textView.animate();
        if (i4Var != null) {
            f10 = 1.0f;
        } else {
            f10 = 0.25f;
        }
        animate.alpha(f10).start();
        if (i4Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        textView.setEnabled(z10);
        TextView textView2 = this.f12696l;
        if (i4Var != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        textView2.setEnabled(z11);
        c cVar = this.f12695k;
        if (cVar.e != bVar) {
            cVar.e = bVar;
            cVar.a();
        }
        lf.b bVar2 = lf.b.f12057b;
        o40 o40Var = this.f12693i;
        if (o40Var != null) {
            if (bVar == bVar2) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            o40Var.a(i10, z4);
        }
        if (bVar == bVar2 && (f3Var = this.f12702r) != null && f3Var.S) {
            f3Var.e(true);
        }
        c cVar2 = this.f12695k;
        lf.b bVar3 = lf.b.f12056a;
        if (cVar2 != null) {
            if (bVar == bVar3) {
                cVar2.setOnClickListener(new androidx.mediarouter.app.c(this, 20));
            } else {
                cVar2.setOnClickListener(new dg.m(22));
            }
        }
        ze.c cVar3 = this.f12698n;
        if (cVar3 != null) {
            cVar3.a(false);
            this.f12698n = null;
        }
        int i11 = this.f12690c;
        long j10 = this.d;
        if (i4Var != null) {
            lf.b bVar4 = i4Var.f12569a;
            lf.a aVar = i4Var.f12571c;
            if (j10 == UserConfig.getInstance(i11).getClientUserId()) {
                z12 = true;
            } else {
                z12 = false;
            }
            String str = this.e;
            if (bVar4 == bVar3) {
                this.f12696l.setText(ja.Q0(LocaleController.formatPluralStringComma("Gift2BuyDoPrice2", (int) aVar.a())));
                if (z12) {
                    formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2BuyPriceSelfText", (int) aVar.a(), str);
                } else {
                    formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2BuyPriceText", (int) aVar.a(), str, DialogObject.getShortName(j10));
                }
                textView.setText(AndroidUtilities.replaceTags(formatPluralStringComma));
            }
            if (bVar4 == bVar2) {
                this.f12696l.setText(ja.S0(LocaleController.formatString(R.string.Gift2BuyDoPrice2TON, aVar.d()), true));
                if (z12) {
                    formatString = LocaleController.formatString(R.string.Gift2BuyPriceSelfTextTON, aVar.d(), str);
                } else {
                    formatString = LocaleController.formatString(R.string.Gift2BuyPriceTextTON, aVar.d(), str, DialogObject.getShortName(j10));
                }
                textView.setText(AndroidUtilities.replaceTags(formatString));
                return;
            }
            return;
        }
        ze.c g10 = this.h.g(-1, false, false);
        this.f12698n = g10;
        g10.d();
        if (this.f12700p.add(bVar)) {
            t7.x(i11, bVar).H(this.f12688a, j10, null, true, new kh.a1(7, this, bVar));
        }
    }

    public final void b() {
        org.telegram.ui.ActionBar.d2 d2Var = this.h;
        d2Var.U0 = true;
        d2Var.show();
        this.f12696l = (TextView) d2Var.d(-1);
        this.f12695k = d2Var.W0;
        FrameLayout frameLayout = d2Var.V0;
        this.f12697m = frameLayout;
        if (frameLayout != null && this.f12691f) {
            ph.f3 f3Var = new ph.f3(this.f12689b, 3);
            f3Var.p(true);
            f3Var.H = Layout.Alignment.ALIGN_NORMAL;
            f3Var.d = 5000L;
            f3Var.s(LocaleController.getString(R.string.Gift2BuyPricePayHintTON));
            f3Var.u();
            this.f12702r = f3Var;
            f3Var.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
            this.f12697m.addView(this.f12702r, k7.b6.d(-2, 100.0f, 48, 0.0f, 26.0f, 0.0f, 0.0f));
        }
        a(false);
    }
}
