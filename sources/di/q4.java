package di;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.kc;
import c8.ha;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.fb0;
import org.telegram.ui.Components.hb0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.pb0;
import org.telegram.ui.vh0;
import org.telegram.ui.w00;
public final class q4 implements bj0 {
    public final int f9579a;
    public final Object f9580b;
    public final Object f9581c;

    public q4(int i7, Object obj, Object obj2) {
        this.f9579a = i7;
        this.f9580b = obj;
        this.f9581c = obj2;
    }

    private final void a(int r9, android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: di.q4.a(int, android.view.View):void");
    }

    private final void b(int i7, View view) {
        vh0.Z((vh0) this.f9580b, (Context) this.f9581c, view, i7);
    }

    private final void d(int i7, View view) {
        PrivacySettingsActivity.a0((PrivacySettingsActivity) this.f9580b, (Context) this.f9581c, view, i7);
    }

    private final void e(int i7, View view) {
        UsersSelectActivity.Z((UsersSelectActivity) this.f9580b, (Context) this.f9581c, view, i7);
    }

    private final void f(int i7, View view) {
        org.telegram.ui.Components.x3 x3Var;
        boolean z9;
        sg.i0 i0Var;
        boolean z10;
        wg.z zVar = (wg.z) this.f9580b;
        org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.f9581c;
        ArrayList arrayList = zVar.Y1;
        wg.s sVar = zVar.f57859t2;
        if (view instanceof yg.y) {
            yg.y yVar = (yg.y) view;
            int type = yVar.getType();
            boolean z11 = yVar.f30225e.h;
            boolean z12 = !z11;
            yVar.setChecked(z12);
            int i10 = yg.y.L;
            if (type == 0) {
                zVar.f57858s2 = z12;
                zVar.k1(false, false);
            } else if (type == 1) {
                yVar.setDivider(z12);
                zVar.f57857r2 = z12;
                zVar.k1(false, false);
                xg.c cVar = zVar.f57842b2;
                int i11 = 0;
                while (true) {
                    if (i11 >= cVar.f58721e.size()) {
                        break;
                    }
                    xg.b bVar = (xg.b) cVar.f58721e.get(i11);
                    if (bVar.f54543a == 15) {
                        int i12 = bVar.f58719l;
                        int i13 = yg.y.L;
                        if (i12 == 1) {
                            if (!z11) {
                                cVar.i(i11 + 1);
                            } else {
                                cVar.s(i11 + 1);
                            }
                        }
                    }
                    i11++;
                }
                zVar.f57842b2.G();
                if (!zVar.f57857r2) {
                    org.telegram.messenger.g0.i3(sVar, 250L);
                } else {
                    org.telegram.messenger.g0.r(sVar);
                }
            }
        }
        if (view instanceof yg.c) {
            if (view instanceof yg.d) {
                int selectedType = ((yg.d) view).getSelectedType();
                int i14 = yg.d.f59457w;
                if (selectedType != 2 && selectedType != 3) {
                    if (selectedType == 1) {
                        sg.i0 i0Var2 = zVar.f57852m2;
                        if (i0Var2 != null) {
                            ((wg.w0) i0Var2.f55091b).h1(1, arrayList);
                            ((wg.l) i0Var2.f55092c).l1.E(1);
                        }
                    } else {
                        zVar.d2 = selectedType;
                        zVar.k1(true, true);
                        zVar.j1(true);
                        zVar.b1();
                    }
                } else if (selectedType == 2 && zVar.f57843c2 == selectedType) {
                    sg.i0 i0Var3 = zVar.f57852m2;
                    if (i0Var3 != null) {
                        ((wg.w0) i0Var3.f55091b).h1(1, arrayList);
                        ((wg.l) i0Var3.f55092c).l1.E(1);
                        return;
                    }
                    return;
                } else {
                    zVar.f57843c2 = selectedType;
                    zVar.k1(true, true);
                    zVar.j1(true);
                    zVar.b1();
                }
            } else {
                yg.c cVar2 = (yg.c) view;
                pj0 pj0Var = zVar.n1;
                if (cVar2.b()) {
                    for (int i15 = 0; i15 < pj0Var.getChildCount(); i15++) {
                        View childAt = pj0Var.getChildAt(i15);
                        if (childAt.getClass().isInstance(cVar2)) {
                            yg.c cVar3 = (yg.c) childAt;
                            if (childAt == cVar2) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            cVar3.c(z10, true);
                        }
                    }
                }
            }
        }
        if (view instanceof yg.u) {
            int selectedType2 = ((yg.u) view).getSelectedType();
            if (zVar.f57844e2 == selectedType2 && (i0Var = zVar.f57852m2) != null) {
                ((wg.w0) i0Var.f55091b).h1(3, zVar.Z1);
                ((wg.l) i0Var.f55092c).l1.E(1);
            }
            zVar.f57844e2 = selectedType2;
            zVar.k1(false, false);
        } else if (view instanceof yg.i) {
            zVar.f57846g2 = ((TLRPC.TL_premiumGiftCodeOption) ((yg.i) view).getGifCode()).months;
            zVar.k1(false, false);
            zVar.f57842b2.G();
        } else if (view instanceof yg.h) {
            Context context = f2Var.getContext();
            long j3 = zVar.f57847h2;
            wg.t tVar = new wg.t(zVar);
            org.telegram.ui.ActionBar.h6 h6Var = zVar.I0;
            org.telegram.ui.Components.r4 r4Var = new org.telegram.ui.Components.r4(h6Var);
            h9.f1 f1Var = new h9.f1(context, h6Var);
            ((org.telegram.ui.ActionBar.w2) f1Var.f14325b).f28707v0 = false;
            hb0 hb0Var = new hb0(context, h6Var);
            int i16 = r4Var.f37489a;
            hb0Var.setTextColor(i16);
            hb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
            hb0Var.setItemCount(5);
            ?? hb0Var2 = new hb0(context, h6Var);
            hb0Var2.setWrapSelectorWheel(true);
            hb0Var2.setAllItemsCount(24);
            hb0Var2.setItemCount(5);
            hb0Var2.setTextColor(i16);
            hb0Var2.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
            hb0Var2.setTag("HOUR");
            ?? hb0Var3 = new hb0(context, h6Var);
            hb0Var3.setWrapSelectorWheel(true);
            hb0Var3.setAllItemsCount(60);
            hb0Var3.setItemCount(5);
            hb0Var3.setTextColor(i16);
            hb0Var3.setTextOffset(-org.telegram.messenger.g0.L(34.0f));
            org.telegram.ui.Components.x3 x3Var2 = new org.telegram.ui.Components.x3(context, r4Var, hb0Var, (wg.f) hb0Var2, (wg.g) hb0Var3);
            x3Var2.setOrientation(1);
            FrameLayout frameLayout = new FrameLayout(context);
            x3Var2.addView(frameLayout, ha.t(-1, -2, 51, 22, 0, 0, 4));
            TextView textView = new TextView(context);
            textView.setText(id.M0(2131753287, "BoostingSelectDateTime"));
            textView.setTextColor(i16);
            com.google.android.recaptcha.internal.a.q(textView, 1, 20.0f);
            frameLayout.addView(textView, ha.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
            textView.setOnTouchListener(new ei.b(2));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setWeightSum(1.0f);
            x3Var2.addView(linearLayout, ha.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
            long currentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            int i17 = calendar.get(1);
            pb0 pb0Var = new pb0(context, 5);
            long j10 = qp.s1(p10.f24474s0).f24857o0 * 1000;
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(j10);
            int i18 = calendar2.get(6);
            calendar2.setTimeInMillis(System.currentTimeMillis());
            calendar2.add(14, (int) j10);
            int i19 = calendar2.get(11);
            int i20 = calendar.get(12);
            linearLayout.addView(hb0Var, ha.l(0.5f, 0, 270));
            hb0Var.setMinValue(0);
            hb0Var.setMaxValue(i18 - 1);
            hb0Var.setWrapSelectorWheel(false);
            hb0Var.setTag("DAY");
            hb0Var.setFormatter(new w00(currentTimeMillis, calendar, i17, 1));
            fb0 g4Var = new hi.g4(x3Var2, (wg.f) hb0Var2, (wg.g) hb0Var3, i19, i20, hb0Var);
            hb0Var.setOnValueChangedListener(g4Var);
            hb0Var2.setMinValue(0);
            hb0Var2.setMaxValue(23);
            linearLayout.addView((View) hb0Var2, ha.l(0.2f, 0, 270));
            hb0Var2.setFormatter(new v0.j(16));
            hb0Var2.setOnValueChangedListener(g4Var);
            hb0Var3.setMinValue(0);
            hb0Var3.setMaxValue(11);
            hb0Var3.setValue(0);
            hb0Var3.setFormatter(new v0.j(17));
            linearLayout.addView((View) hb0Var3, ha.l(0.3f, 0, 270));
            hb0Var3.setOnValueChangedListener(g4Var);
            if (j3 > 0) {
                x3Var = x3Var2;
                calendar.setTimeInMillis(System.currentTimeMillis());
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                calendar.set(11, 0);
                calendar.setTimeInMillis(j3);
                hb0Var3.setValue(calendar.get(12) / 5);
                hb0Var2.setValue(calendar.get(11));
                hb0Var.setValue((int) ((j3 - calendar.getTimeInMillis()) / 86400000));
                hb0Var.getValue();
                g4Var.n(hb0Var, hb0Var.getValue());
                hb0Var2.getValue();
                g4Var.n(hb0Var2, hb0Var2.getValue());
            } else {
                x3Var = x3Var2;
            }
            pb0Var.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
            pb0Var.setGravity(17);
            pb0Var.setTextColor(r4Var.f37494g);
            pb0Var.setTextSize(1, 14.0f);
            pb0Var.setTypeface(org.telegram.messenger.g0.o());
            pb0Var.setBackground(org.telegram.ui.ActionBar.b6.e(r4Var.h, 8.0f));
            pb0Var.setText(id.M0(2131753543, "BoostingConfirm"));
            x3Var.addView(pb0Var, ha.t(-1, 48, 83, 16, 15, 16, 16));
            pb0Var.setOnClickListener(new org.telegram.ui.Components.m1(calendar, hb0Var, hb0Var2, hb0Var3, tVar, f1Var));
            org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) f1Var.f14325b;
            w2Var.N = x3Var;
            w2Var.show();
            int i21 = r4Var.f37490b;
            w2Var.v0(i21);
            w2Var.O(i21);
            if (i0.a.h(i21) > 0.699999988079071d) {
                z9 = true;
            } else {
                z9 = false;
            }
            org.telegram.messenger.g0.q3(w2Var, z9);
        } else if (view instanceof yg.b) {
            sg.i0 i0Var4 = zVar.f57852m2;
            if (i0Var4 != null) {
                ((wg.w0) i0Var4.f55091b).h1(2, zVar.X1);
                ((wg.l) i0Var4.f55092c).l1.E(1);
            }
        } else if (view instanceof yg.w) {
            TL_stars.TL_starsGiveawayOption option = ((yg.w) view).getOption();
            if (option != null) {
                zVar.f57850k2 = option.stars;
                zVar.k1(true, true);
                zVar.j1(true);
                zVar.b1();
            }
        } else if (view instanceof kc) {
            zVar.f57845f2 = true;
            zVar.k1(true, true);
        }
    }

    @Override
    public final void c(int r36, android.view.View r37) {
        throw new UnsupportedOperationException("Method not decompiled: di.q4.c(int, android.view.View):void");
    }
}
