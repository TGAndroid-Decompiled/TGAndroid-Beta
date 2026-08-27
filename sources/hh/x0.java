package hh;

import android.content.Context;
import android.text.InputFilter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AppGlobalConfig;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.rl;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.jc0;

public final class x0 extends org.telegram.ui.ActionBar.e3 {
    public hf.a A;
    public int B;

    public final jc0 f10315b;

    public final EditTextBoldCursor f10316c;
    public final TextView d;

    public final org.telegram.ui.Components.j6 f10317e;

    public final lh.d f10318f;
    public final org.telegram.ui.Components.j6 h;

    public final org.telegram.ui.Cells.q8 f10319n;

    public final ImageView f10320r;

    public final ImageView f10321s;
    public final hf.a v;

    public final hf.a f10322w;

    public final hf.a f10323x;

    public final hf.a f10324y;

    public x0(Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10, hf.a aVar, gh.d1 d1Var) {
        super(context, c6Var, true, false);
        this.currentAccount = i10;
        this.smoothKeyboardAnimationEnabled = true;
        this.waitingKeyboard = true;
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(i10).config;
        long jMax = Math.max(appGlobalConfig.tonStarGiftResaleAmountMin.get(), 10000000L);
        hf.b bVar = hf.b.f8922b;
        this.f10323x = hf.a.i(jMax, bVar);
        this.f10324y = hf.a.i(appGlobalConfig.tonStarGiftResaleAmountMax.get(), bVar);
        long j10 = appGlobalConfig.starsStarGiftResaleAmountMin.get();
        hf.b bVar2 = hf.b.f8921a;
        this.v = hf.a.g(j10, bVar2);
        this.f10322w = hf.a.g(appGlobalConfig.starsStarGiftResaleAmountMax.get(), bVar2);
        fixNavigationBar(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23124h5, c6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout linearLayoutG = org.telegram.messenger.y1.g(context, 0);
        linearLayout.addView(linearLayoutG, h7.z5.t(-1, 56, 55, 0, 0, 0, 0));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, false, false);
        this.f10317e = j6Var;
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        j6Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        j6Var.setTextSize(AndroidUtilities.dp(20.0f));
        j6Var.setGravity(8388627);
        j6Var.setTypeface(AndroidUtilities.bold());
        linearLayoutG.addView(j6Var, h7.z5.p(-1, -1, 1.0f, 119, 22, 0, 22, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, h7.z5.l(1.0f, -1, -2));
        jc0 jc0Var = new jc0(context, null);
        this.f10315b = jc0Var;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f10316c = editTextBoldCursor;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        editTextBoldCursor.requestFocus();
        jc0Var.setLeftPadding(AndroidUtilities.dp(28.0f));
        jc0Var.e(editTextBoldCursor);
        jc0Var.b(1.0f, aVar != null && !aVar.k() ? 1.0f : 0.0f, false);
        jc0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new j(this, 3));
        jc0Var.addView(editTextBoldCursor, h7.z5.e(-1, -2, 48));
        linearLayout2.addView(jc0Var, h7.z5.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView = new ImageView(context);
        this.f10320r = imageView;
        imageView.setImageResource(R.drawable.star_small_inner);
        jc0Var.addView(imageView, h7.z5.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f10321s = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_72);
        imageView2.setColorFilter(-13397548);
        jc0Var.addView(imageView2, h7.z5.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.j6 j6Var2 = new org.telegram.ui.Components.j6(context, false, false, false);
        this.h = j6Var2;
        int i12 = org.telegram.ui.ActionBar.g6.f23423y6;
        j6Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        j6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        j6Var2.setGravity(5);
        jc0Var.addView(j6Var2, h7.z5.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        textView.setTextSize(1, 13.0f);
        linearLayout2.addView(textView, h7.z5.t(-1, -2, 55, 33, 4, 33, 0));
        org.telegram.ui.Cells.q8 q8Var = new org.telegram.ui.Cells.q8(context);
        this.f10319n = q8Var;
        q8Var.f25080c.setLayoutParams(h7.z5.d(20, 20.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 22.0f, 22.0f, 0.0f));
        q8Var.b(LocaleController.getString(R.string.ResellGiftPriceOnlyTON), LocaleController.getString(R.string.ResellGiftPriceHintOnlyTON), true, false);
        q8Var.setOnClickListener(new ag.w0(this, 12));
        linearLayout2.addView(q8Var, h7.z5.t(-1, -2, 55, 0, 16, 0, 16));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        linearLayout.addView(linearLayout3, h7.z5.q(-1, -2, 80));
        lh.d dVarG = rl.g(24, context, c6Var, true);
        this.f10318f = dVarG;
        dVarG.setOnClickListener(new ag.q0(15, this, d1Var));
        dVarG.g(LocaleController.getString(R.string.ResellGiftButton), false, true);
        linearLayout3.addView(dVarG, h7.z5.k(18.0f, 0.0f, 18.0f, 8.0f, -1, 48));
        if (aVar != null) {
            n(hf.a.i(aVar.f8920b, aVar.f8919a), !aVar.k(), true, false);
        } else {
            n(hf.a.i(0L, bVar2), false, true, false);
        }
        setCustomView(linearLayout);
        editTextBoldCursor.addTextChangedListener(new w0(this));
    }

    public final hf.a m() {
        return this.A.f8919a == hf.b.f8922b ? this.f10324y : this.f10322w;
    }

    public final void n(hf.a aVar, boolean z10, boolean z11, boolean z12) {
        long j10;
        char c10;
        hf.a aVar2 = this.A;
        int i10 = this.B;
        this.B = 0;
        if (aVar != null) {
            this.A = aVar;
        } else {
            this.A = hf.a.i(0L, aVar2.f8919a);
            this.B |= 1;
        }
        long j11 = m().f8920b;
        hf.a aVar3 = this.A;
        if (j11 < aVar3.f8920b) {
            this.B |= 4;
        }
        boolean zK = aVar3.k();
        hf.a aVar4 = this.v;
        hf.a aVar5 = this.f10323x;
        hf.b bVar = hf.b.f8922b;
        if (zK) {
            j10 = 0;
        } else {
            hf.a aVar6 = this.A;
            j10 = 0;
            if ((aVar6.f8919a == bVar ? aVar5 : aVar4).f8920b > aVar6.f8920b) {
                this.B |= 2;
            }
        }
        boolean z13 = z11 || aVar2.f8919a != this.A.f8919a;
        boolean z14 = z11 || aVar2.f8920b != this.A.f8920b;
        boolean z15 = z11 || i10 != this.B;
        jc0 jc0Var = this.f10315b;
        if (z15) {
            jc0Var.a((this.B & (-9)) == 0 ? 0.0f : 1.0f);
        }
        hf.b bVar2 = hf.b.f8921a;
        long j12 = j10;
        EditTextBoldCursor editTextBoldCursor = this.f10316c;
        if (z13) {
            c10 = 0;
            hf.b bVar3 = this.A.f8919a;
            org.telegram.ui.Components.j6 j6Var = this.f10317e;
            if (bVar3 == bVar2) {
                j6Var.c(LocaleController.getString(R.string.ResellGiftTitle), z12, true);
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(m().a()).length())});
            } else if (bVar3 == bVar) {
                j6Var.c(LocaleController.getString(R.string.ResellGiftTitleTON), z12, true);
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(m().a()).length() + 3)});
            }
            this.f10319n.f25080c.a(this.A.f8919a == bVar, z12);
            ImageView imageView = this.f10321s;
            ImageView imageView2 = this.f10320r;
            if (z12) {
                imageView2.animate().alpha(this.A.f8919a == bVar2 ? 1.0f : 0.0f).scaleX(this.A.f8919a == bVar2 ? 1.0f : 0.0f).scaleY(this.A.f8919a == bVar2 ? 1.0f : 0.0f).setDuration(180L).start();
                imageView.animate().alpha(this.A.f8919a == bVar ? 1.0f : 0.0f).scaleX(this.A.f8919a == bVar ? 1.0f : 0.0f).scaleY(this.A.f8919a == bVar ? 1.0f : 0.0f).setDuration(180L).start();
            } else {
                imageView2.setAlpha(this.A.f8919a == bVar2 ? 1.0f : 0.0f);
                imageView.setAlpha(this.A.f8919a == bVar ? 1.0f : 0.0f);
            }
        } else {
            c10 = 0;
        }
        if (z13 || z15) {
            int i11 = this.B;
            if ((i11 & 4) != 0) {
                int i12 = R.string.ResellGiftPriceTooMuch;
                Object[] objArr = new Object[1];
                objArr[c10] = m().f();
                jc0Var.setText(LocaleController.formatString(i12, objArr));
            } else if ((i11 & 2) != 0) {
                int i13 = R.string.ResellGiftPriceTooSmall;
                String strF = (this.A.f8919a == bVar ? aVar5 : aVar4).f();
                Object[] objArr2 = new Object[1];
                objArr2[c10] = strF;
                jc0Var.setText(LocaleController.formatString(i13, objArr2));
            } else {
                jc0Var.setText(LocaleController.getString(this.A.f8919a == bVar2 ? R.string.ResellGiftPriceTitle : R.string.ResellGiftPriceTitleTON));
            }
        }
        if (z13 || z14 || z15) {
            boolean z16 = this.B == 0 && this.A.f8920b > j12;
            lh.d dVar = this.f10318f;
            if (dVar.S != z16) {
                dVar.setEnabled(z16);
                dVar.setClickable(z16);
                if (z12) {
                    dVar.animate().alpha(z16 ? 1.0f : 0.6f).setDuration(180L).start();
                } else {
                    dVar.setAlpha(z16 ? 1.0f : 0.6f);
                }
            }
        }
        if (z13 || z14) {
            AppGlobalConfig appGlobalConfig = MessagesController.getInstance(this.currentAccount).config;
            hf.a aVar7 = this.A;
            hf.b bVar4 = aVar7.f8919a;
            hf.b bVar5 = aVar7.f8919a;
            long j13 = aVar7.f8920b;
            TextView textView = this.d;
            if (bVar4 == bVar2) {
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("ResellGiftInfo", (int) hf.a.i((j13 * ((long) appGlobalConfig.starsStarGiftResaleCommissionPermille.get())) / 1000, bVar5).a(), new Object[0])));
            } else if (bVar4 == bVar) {
                rl.n(R.string.ResellGiftInfoTON, new Object[]{hf.a.i((j13 * ((long) appGlobalConfig.tonStarGiftResaleCommissionPermille.get())) / 1000, bVar5).b()}, textView);
            }
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            sb2.append(BillingController.getInstance().formatCurrency((long) (this.A.c() * (this.A.f8919a == bVar ? MessagesController.getInstance(this.currentAccount).config.tonUsdRate.get() : ((double) MessagesController.getInstance(this.currentAccount).starsUsdWithdrawRate1000) * 1.0E-5d) * 100.0d), "USD", 2));
            this.h.c(sb2, z12, true);
        }
        if (z10 && z14) {
            String strB = this.A.b();
            editTextBoldCursor.setText(strB);
            editTextBoldCursor.setSelection(strB.length());
        }
    }

    @Override
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new f2.r(this, 20), 50L);
    }
}
