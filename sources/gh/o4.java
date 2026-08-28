package gh;

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
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.v30;
import org.telegram.ui.Components.wy0;
public final class o4 {
    public final TL_stars.TL_starGiftUnique f8668a;
    public final Context f8669b;
    public final int f8670c;
    public final long d;
    public final String f8671e;
    public final boolean f8672f;
    public final org.telegram.ui.ActionBar.b6 f8673g;
    public final org.telegram.ui.ActionBar.c2 h;
    public final v30 f8674i;
    public final TextView f8675j;
    public b f8676k;
    public TextView f8677l;
    public FrameLayout f8678m;
    public ve.d f8679n;
    public final HashMap f8680o;
    public final HashSet f8681p;
    public gf.b f8682q;
    public kh.x3 f8683r;

    public o4(Context context, org.telegram.ui.ActionBar.b6 b6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, m4 m4Var, int i9, long j10, String str, boolean z10, Utilities.Callback2 callback2) {
        TLObject chat;
        HashMap hashMap = new HashMap();
        this.f8680o = hashMap;
        this.f8681p = new HashSet();
        this.f8669b = context;
        this.f8668a = tL_starGiftUnique;
        this.d = j10;
        this.f8670c = i9;
        gf.b bVar = m4Var.f8543a;
        this.f8682q = bVar;
        hashMap.put(bVar, m4Var);
        this.f8673g = b6Var;
        this.f8671e = str;
        boolean z11 = tL_starGiftUnique.resale_ton_only;
        this.f8672f = !z11;
        if (j10 >= 0) {
            chat = MessagesController.getInstance(i9).getUser(Long.valueOf(j10));
        } else {
            chat = MessagesController.getInstance(i9).getChat(Long.valueOf(-j10));
        }
        LinearLayout f10 = ll.f(context, 1);
        n4 n4Var = new n4(this, context);
        n4Var.addView(f10, g7.e6.c(-2.0f, -1));
        if (!z11) {
            v30 v30Var = new v30(context, b6Var);
            this.f8674i = v30Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.Gift2BuyInStars));
            arrayList.add(LocaleController.getString(R.string.Gift2BuyInTON));
            v30Var.b(arrayList, new k0(this, 2));
            f10.addView(v30Var, g7.e6.t(-2, -2, 1, 18, 0, 18, 12));
        } else {
            this.f8674i = null;
            TextView textView = new TextView(context);
            ll.n(org.telegram.ui.ActionBar.f6.f23369y6, b6Var, textView, 1, 14.0f);
            ll.l(R.string.Gift2BuyPriceOnlyTON, textView, 17);
            f10.addView(textView, g7.e6.t(-2, -2, 17, 24, 4, 24, 4));
        }
        f10.addView(new k4(context, tL_starGiftUnique, chat), g7.e6.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView2 = new TextView(context);
        this.f8675j = textView2;
        ll.n(org.telegram.ui.ActionBar.f6.f23108j5, b6Var, textView2, 1, 16.0f);
        f10.addView(textView2, g7.e6.t(-1, -2, 48, 24, 4, 24, 4));
        if (z10) {
            wy0 wy0Var = new wy0(context, b6Var);
            k5.q1(wy0Var, v7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
            k5.q1(wy0Var, v7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
            k5.q1(wy0Var, v7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
            if (!TextUtils.isEmpty(tL_starGiftUnique.slug) && (tL_starGiftUnique.flags & 256) != 0) {
                wy0Var.c(LocaleController.getString(R.string.GiftValue2), ta.b.d("~", BillingController.getInstance().formatCurrency(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency, BillingController.getInstance().getCurrencyExp(tL_starGiftUnique.value_currency), true)), null, null);
            }
            f10.addView(wy0Var, g7.e6.t(-1, -2, 48, 23, 16, 23, 4));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, b6Var);
        alertDialog$Builder.n(n4Var);
        alertDialog$Builder.k("_", new fh.z2(this, i9, context, b6Var, callback2));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        this.h = alertDialog$Builder.f22702a;
    }

    public final void a(boolean z10) {
        float f10;
        boolean z11;
        boolean z12;
        boolean z13;
        String formatString;
        String formatPluralStringComma;
        kh.x3 x3Var;
        int i9;
        gf.b bVar = this.f8682q;
        m4 m4Var = (m4) this.f8680o.get(bVar);
        TextView textView = this.f8675j;
        ViewPropertyAnimator animate = textView.animate();
        if (m4Var != null) {
            f10 = 1.0f;
        } else {
            f10 = 0.25f;
        }
        animate.alpha(f10).start();
        if (m4Var != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        textView.setEnabled(z11);
        TextView textView2 = this.f8677l;
        if (m4Var != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        textView2.setEnabled(z12);
        b bVar2 = this.f8676k;
        if (bVar2.f7823e != bVar) {
            bVar2.f7823e = bVar;
            bVar2.a();
        }
        gf.b bVar3 = gf.b.f7750b;
        v30 v30Var = this.f8674i;
        if (v30Var != null) {
            if (bVar == bVar3) {
                i9 = 1;
            } else {
                i9 = 0;
            }
            v30Var.a(i9, z10);
        }
        if (bVar == bVar3 && (x3Var = this.f8683r) != null && x3Var.R) {
            x3Var.e(true);
        }
        b bVar4 = this.f8676k;
        gf.b bVar5 = gf.b.f7749a;
        if (bVar4 != null) {
            if (bVar == bVar5) {
                bVar4.setOnClickListener(new androidx.mediarouter.app.c(this, 14));
            } else {
                bVar4.setOnClickListener(new fh.n(23));
            }
        }
        ve.d dVar = this.f8679n;
        if (dVar != null) {
            dVar.a(false);
            this.f8679n = null;
        }
        int i10 = this.f8670c;
        long j10 = this.d;
        if (m4Var != null) {
            gf.b bVar6 = m4Var.f8543a;
            gf.a aVar = m4Var.f8545c;
            if (j10 == UserConfig.getInstance(i10).getClientUserId()) {
                z13 = true;
            } else {
                z13 = false;
            }
            String str = this.f8671e;
            if (bVar6 == bVar5) {
                this.f8677l.setText(oa.Q0(LocaleController.formatPluralStringComma("Gift2BuyDoPrice2", (int) aVar.a())));
                if (z13) {
                    formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2BuyPriceSelfText", (int) aVar.a(), str);
                } else {
                    formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2BuyPriceText", (int) aVar.a(), str, DialogObject.getShortName(j10));
                }
                textView.setText(AndroidUtilities.replaceTags(formatPluralStringComma));
            }
            if (bVar6 == bVar3) {
                this.f8677l.setText(oa.S0(LocaleController.formatString(R.string.Gift2BuyDoPrice2TON, aVar.d()), true));
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
        ve.d g10 = this.h.g(-1, false, false);
        this.f8679n = g10;
        g10.d();
        if (this.f8681p.add(bVar)) {
            v7.x(i10, bVar).H(this.f8668a, j10, null, true, new fh.f1(7, this, bVar));
        }
    }

    public final void b() {
        org.telegram.ui.ActionBar.c2 c2Var = this.h;
        c2Var.T0 = true;
        c2Var.show();
        this.f8677l = (TextView) c2Var.d(-1);
        this.f8676k = c2Var.V0;
        FrameLayout frameLayout = c2Var.U0;
        this.f8678m = frameLayout;
        if (frameLayout != null && this.f8672f) {
            kh.x3 x3Var = new kh.x3(this.f8669b, 3);
            x3Var.q(true);
            x3Var.G = Layout.Alignment.ALIGN_NORMAL;
            x3Var.d = 5000L;
            x3Var.t(LocaleController.getString(R.string.Gift2BuyPricePayHintTON));
            x3Var.v();
            this.f8683r = x3Var;
            x3Var.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
            this.f8678m.addView(this.f8683r, g7.e6.d(-2, 100.0f, 48, 0.0f, 26.0f, 0.0f, 0.0f));
        }
        a(false);
    }
}
