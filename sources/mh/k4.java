package mh;

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
import org.telegram.ui.Components.p40;
import org.telegram.ui.Components.sz0;
import org.telegram.ui.yh;
public final class k4 {
    public final TL_stars.TL_starGiftUnique f14335a;
    public final Context f14336b;
    public final int f14337c;
    public final long d;
    public final String f14338e;
    public final boolean f14339f;
    public final org.telegram.ui.ActionBar.g6 f14340g;
    public final org.telegram.ui.ActionBar.d2 h;
    public final p40 f14341i;
    public final TextView f14342j;
    public b f14343k;
    public TextView f14344l;
    public FrameLayout f14345m;
    public af.f f14346n;
    public final HashMap f14347o;
    public final HashSet f14348p;
    public mf.b f14349q;
    public qh.e3 f14350r;

    public k4(Context context, org.telegram.ui.ActionBar.g6 g6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, i4 i4Var, int i10, long j10, String str, boolean z4, Utilities.Callback2 callback2) {
        TLObject chat;
        HashMap hashMap = new HashMap();
        this.f14347o = hashMap;
        this.f14348p = new HashSet();
        this.f14336b = context;
        this.f14335a = tL_starGiftUnique;
        this.d = j10;
        this.f14337c = i10;
        mf.b bVar = i4Var.f14233a;
        this.f14349q = bVar;
        hashMap.put(bVar, i4Var);
        this.f14340g = g6Var;
        this.f14338e = str;
        boolean z10 = tL_starGiftUnique.resale_ton_only;
        this.f14339f = !z10;
        if (j10 >= 0) {
            chat = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
        } else {
            chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
        }
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        j4 j4Var = new j4(this, context);
        j4Var.addView(f10, k7.c6.c(-2.0f, -1));
        if (!z10) {
            p40 p40Var = new p40(context, g6Var);
            this.f14341i = p40Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.Gift2BuyInStars));
            arrayList.add(LocaleController.getString(R.string.Gift2BuyInTON));
            p40Var.b(arrayList, new i0(this, 2));
            f10.addView(p40Var, k7.c6.t(-2, -2, 1, 18, 0, 18, 12));
        } else {
            this.f14341i = null;
            TextView textView = new TextView(context);
            org.telegram.ui.b.l(org.telegram.ui.ActionBar.k6.f22038y6, g6Var, textView, 1, 14.0f);
            org.telegram.messenger.y3.r(R.string.Gift2BuyPriceOnlyTON, textView, 17);
            f10.addView(textView, k7.c6.t(-2, -2, 17, 24, 4, 24, 4));
        }
        f10.addView(new h4(context, tL_starGiftUnique, chat), k7.c6.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView2 = new TextView(context);
        this.f14342j = textView2;
        org.telegram.ui.b.l(org.telegram.ui.ActionBar.k6.f21768j5, g6Var, textView2, 1, 16.0f);
        f10.addView(textView2, k7.c6.t(-1, -2, 48, 24, 4, 24, 4));
        if (z4) {
            sz0 sz0Var = new sz0(context, g6Var);
            g5.q1(sz0Var, t7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
            g5.q1(sz0Var, t7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
            g5.q1(sz0Var, t7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
            if (!TextUtils.isEmpty(tL_starGiftUnique.slug) && (tL_starGiftUnique.flags & 256) != 0) {
                sz0Var.c(LocaleController.getString(R.string.GiftValue2), yh.k("~", BillingController.getInstance().formatCurrency(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency, BillingController.getInstance().getCurrencyExp(tL_starGiftUnique.value_currency), true)), null, null);
            }
            f10.addView(sz0Var, k7.c6.t(-1, -2, 48, 23, 16, 23, 4));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
        alertDialog$Builder.n(j4Var);
        alertDialog$Builder.k("_", new eg.j3(this, i10, context, g6Var, callback2, 2));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        this.h = alertDialog$Builder.f21168a;
    }

    public final void a(boolean z4) {
        float f10;
        boolean z10;
        boolean z11;
        boolean z12;
        String formatString;
        String formatPluralStringComma;
        qh.e3 e3Var;
        int i10;
        mf.b bVar = this.f14349q;
        i4 i4Var = (i4) this.f14347o.get(bVar);
        TextView textView = this.f14342j;
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
        TextView textView2 = this.f14344l;
        if (i4Var != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        textView2.setEnabled(z11);
        b bVar2 = this.f14343k;
        if (bVar2.f13721e != bVar) {
            bVar2.f13721e = bVar;
            bVar2.a();
        }
        mf.b bVar3 = mf.b.f13654b;
        p40 p40Var = this.f14341i;
        if (p40Var != null) {
            if (bVar == bVar3) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            p40Var.a(i10, z4);
        }
        if (bVar == bVar3 && (e3Var = this.f14350r) != null && e3Var.S) {
            e3Var.e(true);
        }
        b bVar4 = this.f14343k;
        mf.b bVar5 = mf.b.f13653a;
        if (bVar4 != null) {
            if (bVar == bVar5) {
                bVar4.setOnClickListener(new androidx.mediarouter.app.c(this, 20));
            } else {
                bVar4.setOnClickListener(new eg.m(22));
            }
        }
        af.f fVar = this.f14346n;
        if (fVar != null) {
            fVar.a(false);
            this.f14346n = null;
        }
        int i11 = this.f14337c;
        long j10 = this.d;
        if (i4Var != null) {
            mf.b bVar6 = i4Var.f14233a;
            mf.a aVar = i4Var.f14235c;
            if (j10 == UserConfig.getInstance(i11).getClientUserId()) {
                z12 = true;
            } else {
                z12 = false;
            }
            String str = this.f14338e;
            if (bVar6 == bVar5) {
                this.f14344l.setText(ja.Q0(LocaleController.formatPluralStringComma("Gift2BuyDoPrice2", (int) aVar.a())));
                if (z12) {
                    formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2BuyPriceSelfText", (int) aVar.a(), str);
                } else {
                    formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2BuyPriceText", (int) aVar.a(), str, DialogObject.getShortName(j10));
                }
                textView.setText(AndroidUtilities.replaceTags(formatPluralStringComma));
            }
            if (bVar6 == bVar3) {
                this.f14344l.setText(ja.S0(LocaleController.formatString(R.string.Gift2BuyDoPrice2TON, aVar.d()), true));
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
        af.f g10 = this.h.g(-1, false, false);
        this.f14346n = g10;
        g10.d();
        if (this.f14348p.add(bVar)) {
            t7.x(i11, bVar).H(this.f14335a, j10, null, true, new lh.a1(7, this, bVar));
        }
    }

    public final void b() {
        org.telegram.ui.ActionBar.d2 d2Var = this.h;
        d2Var.U0 = true;
        d2Var.show();
        this.f14344l = (TextView) d2Var.d(-1);
        this.f14343k = d2Var.W0;
        FrameLayout frameLayout = d2Var.V0;
        this.f14345m = frameLayout;
        if (frameLayout != null && this.f14339f) {
            qh.e3 e3Var = new qh.e3(this.f14336b, 3);
            e3Var.p(true);
            e3Var.H = Layout.Alignment.ALIGN_NORMAL;
            e3Var.d = 5000L;
            e3Var.s(LocaleController.getString(R.string.Gift2BuyPricePayHintTON));
            e3Var.u();
            this.f14350r = e3Var;
            e3Var.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
            this.f14345m.addView(this.f14350r, k7.c6.d(-2, 100.0f, 48, 0.0f, 26.0f, 0.0f, 0.0f));
        }
        a(false);
    }
}
