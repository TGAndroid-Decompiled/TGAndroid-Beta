package ai;

import android.content.Context;
import android.text.InputFilter;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AppGlobalConfig;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.kk;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.sd0;
import org.telegram.ui.Components.xp;
public final class l1 extends org.telegram.ui.ActionBar.f3 {
    public ag.a E;
    public int F;
    public final sd0 f1738b;
    public final EditTextBoldCursor f1739c;
    public final TextView d;
    public final org.telegram.ui.Components.q6 e;
    public final ei.d f1740f;
    public final org.telegram.ui.Components.q6 h;
    public final org.telegram.ui.Cells.w8 f1741n;
    public final ImageView f1742r;
    public final ImageView f1743s;
    public final ag.a v;
    public final ag.a f1744w;
    public final ag.a f1745x;
    public final ag.a f1746y;

    public l1(Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10, ag.a aVar, o2 o2Var) {
        super(1, context, d6Var, true);
        boolean z10;
        float f7;
        this.currentAccount = i10;
        this.smoothKeyboardAnimationEnabled = true;
        this.waitingKeyboard = true;
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(i10).config;
        long max = Math.max(appGlobalConfig.tonStarGiftResaleAmountMin.get(), 10000000L);
        ag.c cVar = ag.c.f636b;
        this.f1745x = ag.a.i(max, cVar);
        this.f1746y = ag.a.i(appGlobalConfig.tonStarGiftResaleAmountMax.get(), cVar);
        ag.c cVar2 = ag.c.f635a;
        this.v = ag.a.g(appGlobalConfig.starsStarGiftResaleAmountMin.get(), cVar2);
        this.f1744w = ag.a.g(appGlobalConfig.starsStarGiftResaleAmountMax.get(), cVar2);
        fixNavigationBar(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21064h5, d6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout e = kk.e(context, 0);
        linearLayout.addView(e, w7.z5.t(-1, 56, 55, 0, 0, 0, 0));
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(context, false, false, false);
        this.e = q6Var;
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        q6Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        q6Var.setTextSize(AndroidUtilities.dp(20.0f));
        q6Var.setGravity(8388627);
        q6Var.setTypeface(AndroidUtilities.bold());
        e.addView(q6Var, w7.z5.p(-1, -1, 1.0f, 119, 22, 0, 22, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, w7.z5.l(1.0f, -1, -2));
        sd0 sd0Var = new sd0(context, null);
        this.f1738b = sd0Var;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f1739c = editTextBoldCursor;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        editTextBoldCursor.requestFocus();
        sd0Var.setLeftPadding(AndroidUtilities.dp(28.0f));
        sd0Var.e(editTextBoldCursor);
        if (aVar != null && !aVar.k()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        sd0Var.b(1.0f, f7, false);
        sd0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new ah.u0(this, 4));
        sd0Var.addView(editTextBoldCursor, w7.z5.e(-1, -2, 48));
        linearLayout2.addView(sd0Var, w7.z5.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView = new ImageView(context);
        this.f1742r = imageView;
        imageView.setImageResource(R.drawable.star_small_inner);
        sd0Var.addView(imageView, w7.z5.a(22.0f, 14.0f, 0.0f, 0.0f, 0.0f, 22, 19));
        ImageView imageView2 = new ImageView(context);
        this.f1743s = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_72);
        sd0Var.addView(imageView2, w7.z5.a(22.0f, 14.0f, 0.0f, 0.0f, 0.0f, 22, 19));
        org.telegram.ui.Components.q6 q6Var2 = new org.telegram.ui.Components.q6(context, false, false, false);
        this.h = q6Var2;
        int i12 = org.telegram.ui.ActionBar.h6.f21381y6;
        q6Var2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
        q6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        q6Var2.setGravity(5);
        sd0Var.addView(q6Var2, w7.z5.a(-1.0f, 0.0f, 0.0f, 16.0f, 0.0f, -2, 21));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
        textView.setTextSize(1, 13.0f);
        linearLayout2.addView(textView, w7.z5.t(-1, -2, 55, 33, 4, 33, 0));
        org.telegram.ui.Cells.w8 w8Var = new org.telegram.ui.Cells.w8(context);
        this.f1741n = w8Var;
        w8Var.f23775c.setLayoutParams(w7.z5.a(20.0f, 22.0f, 22.0f, 22.0f, 0.0f, 20, (LocaleController.isRTL ? 5 : 3) | 48));
        w8Var.b(LocaleController.getString(R.string.ResellGiftPriceOnlyTON), LocaleController.getString(R.string.ResellGiftPriceHintOnlyTON), true, false);
        w8Var.setOnClickListener(new ah.g0(this, 3));
        linearLayout2.addView(w8Var, w7.z5.t(-1, -2, 55, 0, 16, 0, 16));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        linearLayout.addView(linearLayout3, w7.z5.q(-1, -2, 80));
        ei.d f10 = kk.f(24, context, d6Var, true);
        this.f1740f = f10;
        f10.setOnClickListener(new p(2, this, o2Var));
        f10.g(LocaleController.getString(R.string.ResellGiftButton), false, true);
        linearLayout3.addView(f10, w7.z5.k(18.0f, 0.0f, 18.0f, 8.0f, -1, 48));
        if (aVar != null) {
            o(ag.a.i(aVar.f632b, aVar.f631a), !aVar.k(), true, false);
        } else {
            o(ag.a.i(0L, cVar2), false, true, false);
        }
        setCustomView(linearLayout);
        editTextBoldCursor.addTextChangedListener(new k1(this));
    }

    public final ag.a n() {
        if (this.E.f631a == ag.c.f636b) {
            return this.f1746y;
        }
        return this.f1744w;
    }

    public final void o(ag.a aVar, boolean z10, boolean z11, boolean z12) {
        long j10;
        boolean z13;
        boolean z14;
        boolean z15;
        ag.a aVar2;
        int i10;
        ag.a aVar3;
        boolean z16;
        float f7;
        float f10;
        double d;
        boolean z17;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        ag.a aVar4;
        ag.a aVar5 = this.E;
        int i11 = this.F;
        this.F = 0;
        if (aVar != null) {
            this.E = aVar;
        } else {
            this.E = ag.a.i(0L, aVar5.f631a);
            this.F |= 1;
        }
        long j11 = n().f632b;
        ag.a aVar6 = this.E;
        if (j11 < aVar6.f632b) {
            this.F |= 4;
        }
        boolean k10 = aVar6.k();
        ag.a aVar7 = this.v;
        ag.a aVar8 = this.f1745x;
        ag.c cVar = ag.c.f636b;
        if (!k10) {
            ag.a aVar9 = this.E;
            if (aVar9.f631a == cVar) {
                aVar4 = aVar8;
            } else {
                aVar4 = aVar7;
            }
            j10 = 0;
            if (aVar4.f632b > aVar9.f632b) {
                this.F |= 2;
            }
        } else {
            j10 = 0;
        }
        if (!z11 && aVar5.f631a == this.E.f631a) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (!z11 && aVar5.f632b == this.E.f632b) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (!z11 && i11 == this.F) {
            z15 = false;
        } else {
            z15 = true;
        }
        sd0 sd0Var = this.f1738b;
        if (z15) {
            if ((this.F & (-9)) == 0) {
                f19 = 0.0f;
            } else {
                f19 = 1.0f;
            }
            sd0Var.a(f19);
        }
        ag.c cVar2 = ag.c.f635a;
        long j12 = j10;
        EditTextBoldCursor editTextBoldCursor = this.f1739c;
        if (z13) {
            ag.c cVar3 = this.E.f631a;
            org.telegram.ui.Components.q6 q6Var = this.e;
            if (cVar3 == cVar2) {
                q6Var.c(LocaleController.getString(R.string.ResellGiftTitle), z12, true);
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(n().a()).length())});
            } else if (cVar3 == cVar) {
                q6Var.c(LocaleController.getString(R.string.ResellGiftTitleTON), z12, true);
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(n().a()).length() + 3)});
            }
            xp xpVar = this.f1741n.f23775c;
            if (this.E.f631a == cVar) {
                z17 = true;
            } else {
                z17 = false;
            }
            xpVar.a(z17, z12);
            ImageView imageView = this.f1743s;
            ImageView imageView2 = this.f1742r;
            if (z12) {
                ViewPropertyAnimator animate = imageView2.animate();
                if (this.E.f631a == cVar2) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f13);
                if (this.E.f631a == cVar2) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f14);
                if (this.E.f631a == cVar2) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                aVar2 = aVar7;
                scaleX.scaleY(f15).setDuration(180L).start();
                ViewPropertyAnimator animate2 = imageView.animate();
                if (this.E.f631a == cVar) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f16);
                if (this.E.f631a == cVar) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f17);
                if (this.E.f631a == cVar) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                scaleX2.scaleY(f18).setDuration(180L).start();
            } else {
                aVar2 = aVar7;
                if (this.E.f631a == cVar2) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                imageView2.setAlpha(f11);
                if (this.E.f631a == cVar) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                imageView.setAlpha(f12);
            }
        } else {
            aVar2 = aVar7;
        }
        if (z13 || z15) {
            int i12 = this.F;
            if ((i12 & 4) != 0) {
                sd0Var.setText(LocaleController.formatString(R.string.ResellGiftPriceTooMuch, n().f()));
            } else if ((i12 & 2) != 0) {
                int i13 = R.string.ResellGiftPriceTooSmall;
                if (this.E.f631a == cVar) {
                    aVar3 = aVar8;
                } else {
                    aVar3 = aVar2;
                }
                sd0Var.setText(LocaleController.formatString(i13, aVar3.f()));
            } else {
                if (this.E.f631a == cVar2) {
                    i10 = R.string.ResellGiftPriceTitle;
                } else {
                    i10 = R.string.ResellGiftPriceTitleTON;
                }
                sd0Var.setText(LocaleController.getString(i10));
            }
        }
        if (z13 || z14 || z15) {
            if (this.F == 0 && this.E.f632b > j12) {
                z16 = true;
            } else {
                z16 = false;
            }
            ei.d dVar = this.f1740f;
            if (dVar.W != z16) {
                dVar.setEnabled(z16);
                dVar.setClickable(z16);
                if (z12) {
                    ViewPropertyAnimator animate3 = dVar.animate();
                    if (z16) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.6f;
                    }
                    kk.s(animate3, f10, 180L);
                } else {
                    if (z16) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.6f;
                    }
                    dVar.setAlpha(f7);
                }
            }
        }
        if (z13 || z14) {
            AppGlobalConfig appGlobalConfig = MessagesController.getInstance(this.currentAccount).config;
            ag.a aVar10 = this.E;
            ag.c cVar4 = aVar10.f631a;
            ag.c cVar5 = aVar10.f631a;
            long j13 = aVar10.f632b;
            TextView textView = this.d;
            if (cVar4 == cVar2) {
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("ResellGiftInfo", (int) ag.a.i((j13 * appGlobalConfig.starsStarGiftResaleCommissionPermille.get()) / 1000, cVar5).a(), new Object[0])));
            } else if (cVar4 == cVar) {
                kk.r(R.string.ResellGiftInfoTON, new Object[]{ag.a.i((j13 * appGlobalConfig.tonStarGiftResaleCommissionPermille.get()) / 1000, cVar5).b()}, textView);
            }
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            if (this.E.f631a == cVar) {
                d = MessagesController.getInstance(this.currentAccount).config.tonUsdRate.get();
            } else {
                d = MessagesController.getInstance(this.currentAccount).starsUsdWithdrawRate1000 * 1.0E-5d;
            }
            sb2.append(BillingController.getInstance().formatCurrency((long) (this.E.c() * d * 100.0d), "USD", 2));
            this.h.c(sb2, z12, true);
        }
        if (z10 && z14) {
            String b10 = this.E.b();
            editTextBoldCursor.setText(b10);
            editTextBoldCursor.setSelection(b10.length());
        }
    }

    @Override
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new a3.d(this, 11), 50L);
    }
}
