package bi;

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
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.w40;
import org.telegram.ui.Components.x01;
public final class g6 {
    public final TL_stars.TL_starGiftUnique f4661a;
    public final Context f4662b;
    public final int f4663c;
    public final long d;
    public final String e;
    public final boolean f4664f;
    public final org.telegram.ui.ActionBar.u6 f4665g;
    public final org.telegram.ui.ActionBar.e2 h;
    public final w40 f4666i;
    public final TextView f4667j;
    public c f4668k;
    public TextView f4669l;
    public FrameLayout f4670m;
    public qf.c f4671n;
    public final HashMap f4672o;
    public final HashSet f4673p;
    public bg.b f4674q;
    public fi.v3 f4675r;

    public g6(Context context, org.telegram.ui.ActionBar.u6 u6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, d6 d6Var, int i10, long j10, String str, boolean z10, Utilities.Callback2 callback2) {
        TLObject chat;
        HashMap hashMap = new HashMap();
        this.f4672o = hashMap;
        this.f4673p = new HashSet();
        this.f4662b = context;
        this.f4661a = tL_starGiftUnique;
        this.d = j10;
        this.f4663c = i10;
        bg.b bVar = d6Var.f4492a;
        this.f4674q = bVar;
        hashMap.put(bVar, d6Var);
        this.f4665g = u6Var;
        this.e = str;
        boolean z11 = tL_starGiftUnique.resale_ton_only;
        this.f4664f = !z11;
        if (j10 >= 0) {
            chat = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
        } else {
            chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
        }
        LinearLayout d = wh.d(context, 1);
        f6 f6Var = new f6(this, context);
        f6Var.addView(d, kb1.g(-2.0f, -1));
        if (!z11) {
            w40 w40Var = new w40(context, u6Var);
            this.f4666i = w40Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.Gift2BuyInStars));
            arrayList.add(LocaleController.getString(R.string.Gift2BuyInTON));
            w40Var.b(arrayList, new x0(this, 2));
            d.addView(w40Var, kb1.x(-2, -2, 1, 18, 0, 18, 12));
        } else {
            this.f4666i = null;
            TextView textView = new TextView(context);
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23749y6, u6Var);
            textView.setTextSize(1, 14.0f);
            wh.k(R.string.Gift2BuyPriceOnlyTON, textView, 17);
            d.addView(textView, kb1.x(-2, -2, 17, 24, 4, 24, 4));
        }
        d.addView(new b6(context, tL_starGiftUnique, chat), kb1.x(-1, -2, 48, 0, -4, 0, 0));
        TextView textView2 = new TextView(context);
        this.f4667j = textView2;
        org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.f23465j5, u6Var);
        textView2.setTextSize(1, 16.0f);
        d.addView(textView2, kb1.x(-1, -2, 48, 24, 4, 24, 4));
        if (z10) {
            x01 x01Var = new x01(context, u6Var);
            h7.H1(x01Var, ca.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
            h7.H1(x01Var, ca.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
            h7.H1(x01Var, ca.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
            if (!TextUtils.isEmpty(tL_starGiftUnique.slug) && (tL_starGiftUnique.flags & 256) != 0) {
                x01Var.c(LocaleController.getString(R.string.GiftValue2), b10.j("~", BillingController.getInstance().formatCurrency(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency, BillingController.getInstance().getCurrencyExp(tL_starGiftUnique.value_currency), true)), null, null);
            }
            d.addView(x01Var, kb1.x(-1, -2, 48, 23, 16, 23, 4));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, u6Var);
        alertDialog$Builder.o(f6Var);
        alertDialog$Builder.k("_", new e6(this, i10, context, u6Var, callback2, 0));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        this.h = alertDialog$Builder.f22369a;
    }

    public final void a(boolean z10) {
        float f7;
        boolean z11;
        boolean z12;
        boolean z13;
        String formatString;
        String formatPluralStringComma;
        fi.v3 v3Var;
        int i10;
        bg.b bVar = this.f4674q;
        d6 d6Var = (d6) this.f4672o.get(bVar);
        TextView textView = this.f4667j;
        ViewPropertyAnimator animate = textView.animate();
        if (d6Var != null) {
            f7 = 1.0f;
        } else {
            f7 = 0.25f;
        }
        animate.alpha(f7).start();
        if (d6Var != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        textView.setEnabled(z11);
        TextView textView2 = this.f4669l;
        if (d6Var != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        textView2.setEnabled(z12);
        c cVar = this.f4668k;
        if (cVar.e != bVar) {
            cVar.e = bVar;
            cVar.a();
        }
        bg.b bVar2 = bg.b.f3981b;
        w40 w40Var = this.f4666i;
        if (w40Var != null) {
            if (bVar == bVar2) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            w40Var.a(i10, z10);
        }
        if (bVar == bVar2 && (v3Var = this.f4675r) != null && v3Var.V) {
            v3Var.e(true);
        }
        c cVar2 = this.f4668k;
        bg.b bVar3 = bg.b.f3980a;
        if (cVar2 != null) {
            if (bVar == bVar3) {
                cVar2.setOnClickListener(new ai.s(this, 9));
            } else {
                cVar2.setOnClickListener(new bh.f(22));
            }
        }
        qf.c cVar3 = this.f4671n;
        if (cVar3 != null) {
            cVar3.a(false);
            this.f4671n = null;
        }
        int i11 = this.f4663c;
        long j10 = this.d;
        if (d6Var != null) {
            bg.b bVar4 = d6Var.f4492a;
            bg.a aVar = d6Var.f4494c;
            if (j10 == UserConfig.getInstance(i11).getClientUserId()) {
                z13 = true;
            } else {
                z13 = false;
            }
            String str = this.e;
            if (bVar4 == bVar3) {
                this.f4669l.setText(dd.P0(LocaleController.formatPluralStringComma("Gift2BuyDoPrice2", (int) aVar.a())));
                if (z13) {
                    formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2BuyPriceSelfText", (int) aVar.a(), str);
                } else {
                    formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2BuyPriceText", (int) aVar.a(), str, DialogObject.getShortName(j10));
                }
                textView.setText(AndroidUtilities.replaceTags(formatPluralStringComma));
            }
            if (bVar4 == bVar2) {
                this.f4669l.setText(dd.R0(LocaleController.formatString(R.string.Gift2BuyDoPrice2TON, aVar.d()), true));
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
        qf.c h = this.h.h(-1, false, false);
        this.f4671n = h;
        h.d();
        if (this.f4673p.add(bVar)) {
            ca.x(i11, bVar).H(this.f4661a, j10, null, true, new ai.n1(5, this, bVar));
        }
    }

    public final void b() {
        org.telegram.ui.ActionBar.e2 e2Var = this.h;
        e2Var.Z0 = true;
        e2Var.show();
        this.f4669l = (TextView) e2Var.d(-1);
        this.f4668k = e2Var.f22561b1;
        FrameLayout frameLayout = e2Var.f22558a1;
        this.f4670m = frameLayout;
        if (frameLayout != null && this.f4664f) {
            fi.v3 v3Var = new fi.v3(this.f4662b, 3);
            v3Var.p(true);
            v3Var.K = Layout.Alignment.ALIGN_NORMAL;
            v3Var.d = 5000L;
            v3Var.s(LocaleController.getString(R.string.Gift2BuyPricePayHintTON));
            v3Var.u();
            this.f4675r = v3Var;
            v3Var.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
            this.f4670m.addView(this.f4675r, kb1.h(-2, 100.0f, 48, 0.0f, 26.0f, 0.0f, 0.0f));
        }
        a(false);
    }
}
