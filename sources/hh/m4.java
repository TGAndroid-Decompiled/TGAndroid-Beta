package hh;

import android.content.Context;
import android.text.Layout;
import android.text.TextUtils;
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
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.a40;
import org.telegram.ui.Components.yy0;

public final class m4 {

    public final TL_stars.TL_starGiftUnique f9714a;

    public final Context f9715b;

    public final int f9716c;
    public final long d;

    public final String f9717e;

    public final boolean f9718f;

    public final org.telegram.ui.ActionBar.c6 f9719g;
    public final org.telegram.ui.ActionBar.b2 h;

    public final a40 f9720i;

    public final TextView f9721j;

    public b f9722k;

    public TextView f9723l;

    public FrameLayout f9724m;

    public we.d f9725n;

    public final HashMap f9726o;

    public final HashSet f9727p;

    public hf.b f9728q;

    public lh.w3 f9729r;

    public m4(Context context, org.telegram.ui.ActionBar.c6 c6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, k4 k4Var, int i10, long j10, String str, boolean z10, Utilities.Callback2 callback2) {
        HashMap map = new HashMap();
        this.f9726o = map;
        this.f9727p = new HashSet();
        this.f9715b = context;
        this.f9714a = tL_starGiftUnique;
        this.d = j10;
        this.f9716c = i10;
        hf.b bVar = k4Var.f9578a;
        this.f9728q = bVar;
        map.put(bVar, k4Var);
        this.f9719g = c6Var;
        this.f9717e = str;
        boolean z11 = tL_starGiftUnique.resale_ton_only;
        this.f9718f = !z11;
        TLObject user = j10 >= 0 ? MessagesController.getInstance(i10).getUser(Long.valueOf(j10)) : MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
        LinearLayout linearLayoutG = org.telegram.messenger.y1.g(context, 1);
        l4 l4Var = new l4(this, context);
        l4Var.addView(linearLayoutG, h7.z5.c(-2.0f, -1));
        if (z11) {
            this.f9720i = null;
            TextView textView = new TextView(context);
            rl.l(org.telegram.ui.ActionBar.g6.f23423y6, c6Var, textView, 1, 14.0f);
            rl.i(R.string.Gift2BuyPriceOnlyTON, textView, 17);
            linearLayoutG.addView(textView, h7.z5.t(-2, -2, 17, 24, 4, 24, 4));
        } else {
            a40 a40Var = new a40(context, c6Var);
            this.f9720i = a40Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.Gift2BuyInStars));
            arrayList.add(LocaleController.getString(R.string.Gift2BuyInTON));
            a40Var.b(arrayList, new k0(this, 2));
            linearLayoutG.addView(a40Var, h7.z5.t(-2, -2, 1, 18, 0, 18, 12));
        }
        linearLayoutG.addView(new i4(context, tL_starGiftUnique, user), h7.z5.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView2 = new TextView(context);
        this.f9721j = textView2;
        rl.l(org.telegram.ui.ActionBar.g6.f23161j5, c6Var, textView2, 1, 16.0f);
        linearLayoutG.addView(textView2, h7.z5.t(-1, -2, 48, 24, 4, 24, 4));
        if (z10) {
            yy0 yy0Var = new yy0(context, c6Var);
            i5.q1(yy0Var, u7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
            i5.q1(yy0Var, u7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
            i5.q1(yy0Var, u7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
            if (!TextUtils.isEmpty(tL_starGiftUnique.slug) && (tL_starGiftUnique.flags & 256) != 0) {
                yy0Var.c(LocaleController.getString(R.string.GiftValue2), s3.c.e("~", BillingController.getInstance().formatCurrency(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency, BillingController.getInstance().getCurrencyExp(tL_starGiftUnique.value_currency), true)), null, null);
            }
            linearLayoutG.addView(yy0Var, h7.z5.t(-1, -2, 48, 23, 16, 23, 4));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        alertDialog$Builder.n(l4Var);
        alertDialog$Builder.k("_", new gh.u2(this, i10, context, c6Var, callback2));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        this.h = alertDialog$Builder.f22702a;
    }

    public final void a(boolean z10) {
        lh.w3 w3Var;
        hf.b bVar = this.f9728q;
        k4 k4Var = (k4) this.f9726o.get(bVar);
        TextView textView = this.f9721j;
        textView.animate().alpha(k4Var != null ? 1.0f : 0.25f).start();
        textView.setEnabled(k4Var != null);
        this.f9723l.setEnabled(k4Var != null);
        b bVar2 = this.f9722k;
        if (bVar2.f8981e != bVar) {
            bVar2.f8981e = bVar;
            bVar2.a();
        }
        hf.b bVar3 = hf.b.f8922b;
        a40 a40Var = this.f9720i;
        if (a40Var != null) {
            a40Var.a(bVar == bVar3 ? 1 : 0, z10);
        }
        if (bVar == bVar3 && (w3Var = this.f9729r) != null && w3Var.R) {
            w3Var.e(true);
        }
        b bVar4 = this.f9722k;
        hf.b bVar5 = hf.b.f8921a;
        if (bVar4 != null) {
            if (bVar == bVar5) {
                bVar4.setOnClickListener(new ag.w0(this, 16));
            } else {
                bVar4.setOnClickListener(new ag.l2(24));
            }
        }
        we.d dVar = this.f9725n;
        if (dVar != null) {
            dVar.a(false);
            this.f9725n = null;
        }
        int i10 = this.f9716c;
        long j10 = this.d;
        if (k4Var == null) {
            we.d dVarG = this.h.g(-1, false, false);
            this.f9725n = dVarG;
            dVarG.d();
            if (this.f9727p.add(bVar)) {
                u7.x(i10, bVar).H(this.f9714a, j10, null, true, new gh.d1(7, this, bVar));
                return;
            }
            return;
        }
        hf.b bVar6 = k4Var.f9578a;
        hf.a aVar = k4Var.f9580c;
        boolean z11 = j10 == UserConfig.getInstance(i10).getClientUserId();
        String str = this.f9717e;
        if (bVar6 == bVar5) {
            this.f9723l.setText(oa.Q0(LocaleController.formatPluralStringComma("Gift2BuyDoPrice2", (int) aVar.a())));
            textView.setText(AndroidUtilities.replaceTags(z11 ? LocaleController.formatPluralStringComma("Gift2BuyPriceSelfText", (int) aVar.a(), str) : LocaleController.formatPluralStringComma("Gift2BuyPriceText", (int) aVar.a(), str, DialogObject.getShortName(j10))));
        }
        if (bVar6 == bVar3) {
            this.f9723l.setText(oa.S0(LocaleController.formatString(R.string.Gift2BuyDoPrice2TON, aVar.d()), true));
            textView.setText(AndroidUtilities.replaceTags(z11 ? LocaleController.formatString(R.string.Gift2BuyPriceSelfTextTON, aVar.d(), str) : LocaleController.formatString(R.string.Gift2BuyPriceTextTON, aVar.d(), str, DialogObject.getShortName(j10))));
        }
    }

    public final void b() {
        org.telegram.ui.ActionBar.b2 b2Var = this.h;
        b2Var.T0 = true;
        b2Var.show();
        this.f9723l = (TextView) b2Var.d(-1);
        this.f9722k = b2Var.V0;
        FrameLayout frameLayout = b2Var.U0;
        this.f9724m = frameLayout;
        if (frameLayout != null && this.f9718f) {
            lh.w3 w3Var = new lh.w3(this.f9715b, 3);
            w3Var.q(true);
            w3Var.G = Layout.Alignment.ALIGN_NORMAL;
            w3Var.d = 5000L;
            w3Var.t(LocaleController.getString(R.string.Gift2BuyPricePayHintTON));
            w3Var.v();
            this.f9729r = w3Var;
            w3Var.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
            this.f9724m.addView(this.f9729r, h7.z5.d(-2, 100.0f, 48, 0.0f, 26.0f, 0.0f, 0.0f));
        }
        a(false);
    }
}
