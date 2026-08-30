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
import org.telegram.ui.Components.n40;
import org.telegram.ui.Components.sz0;
public final class k4 {
    public final TL_stars.TL_starGiftUnique f12704a;
    public final Context f12705b;
    public final int f12706c;
    public final long d;
    public final String e;
    public final boolean f12707f;
    public final org.telegram.ui.ActionBar.f6 f12708g;
    public final org.telegram.ui.ActionBar.d2 h;
    public final n40 f12709i;
    public final TextView f12710j;
    public c f12711k;
    public TextView f12712l;
    public FrameLayout f12713m;
    public af.f f12714n;
    public final HashMap f12715o;
    public final HashSet f12716p;
    public mf.b f12717q;
    public ph.f3 f12718r;

    public k4(Context context, org.telegram.ui.ActionBar.f6 f6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, i4 i4Var, int i10, long j10, String str, boolean z4, Utilities.Callback2 callback2) {
        TLObject chat;
        HashMap hashMap = new HashMap();
        this.f12715o = hashMap;
        this.f12716p = new HashSet();
        this.f12705b = context;
        this.f12704a = tL_starGiftUnique;
        this.d = j10;
        this.f12706c = i10;
        mf.b bVar = i4Var.f12585a;
        this.f12717q = bVar;
        hashMap.put(bVar, i4Var);
        this.f12708g = f6Var;
        this.e = str;
        boolean z10 = tL_starGiftUnique.resale_ton_only;
        this.f12707f = !z10;
        if (j10 >= 0) {
            chat = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
        } else {
            chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
        }
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        j4 j4Var = new j4(this, context);
        j4Var.addView(f10, k7.b6.c(-2.0f, -1));
        if (!z10) {
            n40 n40Var = new n40(context, f6Var);
            this.f12709i = n40Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.Gift2BuyInStars));
            arrayList.add(LocaleController.getString(R.string.Gift2BuyInTON));
            n40Var.b(arrayList, new j0(this, 2));
            f10.addView(n40Var, k7.b6.t(-2, -2, 1, 18, 0, 18, 12));
        } else {
            this.f12709i = null;
            TextView textView = new TextView(context);
            org.telegram.ui.b.l(org.telegram.ui.ActionBar.j6.f20281y6, f6Var, textView, 1, 14.0f);
            org.telegram.messenger.y3.r(R.string.Gift2BuyPriceOnlyTON, textView, 17);
            f10.addView(textView, k7.b6.t(-2, -2, 17, 24, 4, 24, 4));
        }
        f10.addView(new h4(context, tL_starGiftUnique, chat), k7.b6.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView2 = new TextView(context);
        this.f12710j = textView2;
        org.telegram.ui.b.l(org.telegram.ui.ActionBar.j6.f20012j5, f6Var, textView2, 1, 16.0f);
        f10.addView(textView2, k7.b6.t(-1, -2, 48, 24, 4, 24, 4));
        if (z4) {
            sz0 sz0Var = new sz0(context, f6Var);
            g5.q1(sz0Var, t7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
            g5.q1(sz0Var, t7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
            g5.q1(sz0Var, t7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
            if (!TextUtils.isEmpty(tL_starGiftUnique.slug) && (tL_starGiftUnique.flags & 256) != 0) {
                sz0Var.c(LocaleController.getString(R.string.GiftValue2), vh.v2.e("~", BillingController.getInstance().formatCurrency(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency, BillingController.getInstance().getCurrencyExp(tL_starGiftUnique.value_currency), true)), null, null);
            }
            f10.addView(sz0Var, k7.b6.t(-1, -2, 48, 23, 16, 23, 4));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        alertDialog$Builder.n(j4Var);
        alertDialog$Builder.k("_", new dg.l3(this, i10, context, f6Var, callback2, 2));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        this.h = alertDialog$Builder.f19503a;
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
        mf.b bVar = this.f12717q;
        i4 i4Var = (i4) this.f12715o.get(bVar);
        TextView textView = this.f12710j;
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
        TextView textView2 = this.f12712l;
        if (i4Var != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        textView2.setEnabled(z11);
        c cVar = this.f12711k;
        if (cVar.e != bVar) {
            cVar.e = bVar;
            cVar.a();
        }
        mf.b bVar2 = mf.b.f13931b;
        n40 n40Var = this.f12709i;
        if (n40Var != null) {
            if (bVar == bVar2) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            n40Var.a(i10, z4);
        }
        if (bVar == bVar2 && (f3Var = this.f12718r) != null && f3Var.S) {
            f3Var.e(true);
        }
        c cVar2 = this.f12711k;
        mf.b bVar3 = mf.b.f13930a;
        if (cVar2 != null) {
            if (bVar == bVar3) {
                cVar2.setOnClickListener(new androidx.mediarouter.app.c(this, 20));
            } else {
                cVar2.setOnClickListener(new dg.m(22));
            }
        }
        af.f fVar = this.f12714n;
        if (fVar != null) {
            fVar.a(false);
            this.f12714n = null;
        }
        int i11 = this.f12706c;
        long j10 = this.d;
        if (i4Var != null) {
            mf.b bVar4 = i4Var.f12585a;
            mf.a aVar = i4Var.f12587c;
            if (j10 == UserConfig.getInstance(i11).getClientUserId()) {
                z12 = true;
            } else {
                z12 = false;
            }
            String str = this.e;
            if (bVar4 == bVar3) {
                this.f12712l.setText(ja.Q0(LocaleController.formatPluralStringComma("Gift2BuyDoPrice2", (int) aVar.a())));
                if (z12) {
                    formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2BuyPriceSelfText", (int) aVar.a(), str);
                } else {
                    formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2BuyPriceText", (int) aVar.a(), str, DialogObject.getShortName(j10));
                }
                textView.setText(AndroidUtilities.replaceTags(formatPluralStringComma));
            }
            if (bVar4 == bVar2) {
                this.f12712l.setText(ja.S0(LocaleController.formatString(R.string.Gift2BuyDoPrice2TON, aVar.d()), true));
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
        this.f12714n = g10;
        g10.d();
        if (this.f12716p.add(bVar)) {
            t7.x(i11, bVar).H(this.f12704a, j10, null, true, new kh.a1(7, this, bVar));
        }
    }

    public final void b() {
        org.telegram.ui.ActionBar.d2 d2Var = this.h;
        d2Var.U0 = true;
        d2Var.show();
        this.f12712l = (TextView) d2Var.d(-1);
        this.f12711k = d2Var.W0;
        FrameLayout frameLayout = d2Var.V0;
        this.f12713m = frameLayout;
        if (frameLayout != null && this.f12707f) {
            ph.f3 f3Var = new ph.f3(this.f12705b, 3);
            f3Var.q(true);
            f3Var.H = Layout.Alignment.ALIGN_NORMAL;
            f3Var.d = 5000L;
            f3Var.t(LocaleController.getString(R.string.Gift2BuyPricePayHintTON));
            f3Var.v();
            this.f12718r = f3Var;
            f3Var.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
            this.f12713m.addView(this.f12718r, k7.b6.d(-2, 100.0f, 48, 0.0f, 26.0f, 0.0f, 0.0f));
        }
        a(false);
    }
}
