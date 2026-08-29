package jh;

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
import org.telegram.ui.Components.hz0;
import org.telegram.ui.Components.j40;
public final class l4 {
    public final TL_stars.TL_starGiftUnique f12413a;
    public final Context f12414b;
    public final int f12415c;
    public final long d;
    public final String f12416e;
    public final boolean f12417f;
    public final org.telegram.ui.ActionBar.c6 f12418g;
    public final org.telegram.ui.ActionBar.c2 h;
    public final j40 f12419i;
    public final TextView f12420j;
    public b f12421k;
    public TextView f12422l;
    public FrameLayout f12423m;
    public ye.c f12424n;
    public final HashMap f12425o;
    public final HashSet f12426p;
    public kf.b f12427q;
    public nh.t3 f12428r;

    public l4(Context context, org.telegram.ui.ActionBar.c6 c6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, j4 j4Var, int i10, long j10, String str, boolean z10, Utilities.Callback2 callback2) {
        TLObject chat;
        HashMap hashMap = new HashMap();
        this.f12425o = hashMap;
        this.f12426p = new HashSet();
        this.f12414b = context;
        this.f12413a = tL_starGiftUnique;
        this.d = j10;
        this.f12415c = i10;
        kf.b bVar = j4Var.f12313a;
        this.f12427q = bVar;
        hashMap.put(bVar, j4Var);
        this.f12418g = c6Var;
        this.f12416e = str;
        boolean z11 = tL_starGiftUnique.resale_ton_only;
        this.f12417f = !z11;
        if (j10 >= 0) {
            chat = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
        } else {
            chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
        }
        LinearLayout g10 = org.telegram.messenger.x3.g(context, 1);
        k4 k4Var = new k4(this, context);
        k4Var.addView(g10, i7.f6.c(-2.0f, -1));
        if (!z11) {
            j40 j40Var = new j40(context, c6Var);
            this.f12419i = j40Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.Gift2BuyInStars));
            arrayList.add(LocaleController.getString(R.string.Gift2BuyInTON));
            j40Var.b(arrayList, new j0(this, 2));
            g10.addView(j40Var, i7.f6.t(-2, -2, 1, 18, 0, 18, 12));
        } else {
            this.f12419i = null;
            TextView textView = new TextView(context);
            org.telegram.ui.b.m(org.telegram.ui.ActionBar.g6.f23433y6, c6Var, textView, 1, 14.0f);
            org.telegram.ui.b.i(R.string.Gift2BuyPriceOnlyTON, textView, 17);
            g10.addView(textView, i7.f6.t(-2, -2, 17, 24, 4, 24, 4));
        }
        g10.addView(new i4(context, tL_starGiftUnique, chat), i7.f6.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView2 = new TextView(context);
        this.f12420j = textView2;
        org.telegram.ui.b.m(org.telegram.ui.ActionBar.g6.f23169j5, c6Var, textView2, 1, 16.0f);
        g10.addView(textView2, i7.f6.t(-1, -2, 48, 24, 4, 24, 4));
        if (z10) {
            hz0 hz0Var = new hz0(context, c6Var);
            h5.q1(hz0Var, s7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
            h5.q1(hz0Var, s7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
            h5.q1(hz0Var, s7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
            if (!TextUtils.isEmpty(tL_starGiftUnique.slug) && (tL_starGiftUnique.flags & 256) != 0) {
                hz0Var.c(LocaleController.getString(R.string.GiftValue2), u3.c.e("~", BillingController.getInstance().formatCurrency(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency, BillingController.getInstance().getCurrencyExp(tL_starGiftUnique.value_currency), true)), null, null);
            }
            g10.addView(hz0Var, i7.f6.t(-1, -2, 48, 23, 16, 23, 4));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        alertDialog$Builder.n(k4Var);
        alertDialog$Builder.k("_", new bg.p3(this, i10, context, c6Var, callback2, 2));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        this.h = alertDialog$Builder.f22714a;
    }

    public final void a(boolean z10) {
        float f9;
        boolean z11;
        boolean z12;
        boolean z13;
        String formatString;
        String formatPluralStringComma;
        nh.t3 t3Var;
        int i10;
        kf.b bVar = this.f12427q;
        j4 j4Var = (j4) this.f12425o.get(bVar);
        TextView textView = this.f12420j;
        ViewPropertyAnimator animate = textView.animate();
        if (j4Var != null) {
            f9 = 1.0f;
        } else {
            f9 = 0.25f;
        }
        animate.alpha(f9).start();
        if (j4Var != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        textView.setEnabled(z11);
        TextView textView2 = this.f12422l;
        if (j4Var != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        textView2.setEnabled(z12);
        b bVar2 = this.f12421k;
        if (bVar2.f11770e != bVar) {
            bVar2.f11770e = bVar;
            bVar2.a();
        }
        kf.b bVar3 = kf.b.f13636b;
        j40 j40Var = this.f12419i;
        if (j40Var != null) {
            if (bVar == bVar3) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            j40Var.a(i10, z10);
        }
        if (bVar == bVar3 && (t3Var = this.f12428r) != null && t3Var.R) {
            t3Var.e(true);
        }
        b bVar4 = this.f12421k;
        kf.b bVar5 = kf.b.f13635a;
        if (bVar4 != null) {
            if (bVar == bVar5) {
                bVar4.setOnClickListener(new ag.o(this, 20));
            } else {
                bVar4.setOnClickListener(new bg.n(24));
            }
        }
        ye.c cVar = this.f12424n;
        if (cVar != null) {
            cVar.a(false);
            this.f12424n = null;
        }
        int i11 = this.f12415c;
        long j10 = this.d;
        if (j4Var != null) {
            kf.b bVar6 = j4Var.f12313a;
            kf.a aVar = j4Var.f12315c;
            if (j10 == UserConfig.getInstance(i11).getClientUserId()) {
                z13 = true;
            } else {
                z13 = false;
            }
            String str = this.f12416e;
            if (bVar6 == bVar5) {
                this.f12422l.setText(ia.Q0(LocaleController.formatPluralStringComma("Gift2BuyDoPrice2", (int) aVar.a())));
                if (z13) {
                    formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2BuyPriceSelfText", (int) aVar.a(), str);
                } else {
                    formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2BuyPriceText", (int) aVar.a(), str, DialogObject.getShortName(j10));
                }
                textView.setText(AndroidUtilities.replaceTags(formatPluralStringComma));
            }
            if (bVar6 == bVar3) {
                this.f12422l.setText(ia.S0(LocaleController.formatString(R.string.Gift2BuyDoPrice2TON, aVar.d()), true));
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
        ye.c g10 = this.h.g(-1, false, false);
        this.f12424n = g10;
        g10.d();
        if (this.f12426p.add(bVar)) {
            s7.x(i11, bVar).H(this.f12413a, j10, null, true, new ih.b1(7, this, bVar));
        }
    }

    public final void b() {
        org.telegram.ui.ActionBar.c2 c2Var = this.h;
        c2Var.T0 = true;
        c2Var.show();
        this.f12422l = (TextView) c2Var.d(-1);
        this.f12421k = c2Var.V0;
        FrameLayout frameLayout = c2Var.U0;
        this.f12423m = frameLayout;
        if (frameLayout != null && this.f12417f) {
            nh.t3 t3Var = new nh.t3(this.f12414b, 3);
            t3Var.q(true);
            t3Var.G = Layout.Alignment.ALIGN_NORMAL;
            t3Var.d = 5000L;
            t3Var.t(LocaleController.getString(R.string.Gift2BuyPricePayHintTON));
            t3Var.v();
            this.f12428r = t3Var;
            t3Var.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
            this.f12423m.addView(this.f12428r, i7.f6.d(-2, 100.0f, 48, 0.0f, 26.0f, 0.0f, 0.0f));
        }
        a(false);
    }
}
