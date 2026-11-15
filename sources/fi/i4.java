package fi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ja;
import di.ua;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ou;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.gb0;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.ib0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.mb0;
import org.telegram.ui.uh0;
import org.telegram.ui.v00;
public final class i4 implements gj0 {
    public final int f11815a;
    public final Object f11816b;
    public final Object f11817c;

    public i4(int i7, Object obj, Object obj2) {
        this.f11815a = i7;
        this.f11816b = obj;
        this.f11817c = obj2;
    }

    private final void a(int r9, android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: fi.i4.a(int, android.view.View):void");
    }

    private final void c(int i7, View view) {
        uh0.Z((uh0) this.f11816b, (Context) this.f11817c, view, i7);
    }

    private final void d(int i7, View view) {
        PrivacySettingsActivity.a0((PrivacySettingsActivity) this.f11816b, (Context) this.f11817c, view, i7);
    }

    private final void e(int i7, View view) {
        UsersSelectActivity.Z((UsersSelectActivity) this.f11816b, (Context) this.f11817c, view, i7);
    }

    private final void f(int i7, View view) {
        org.telegram.ui.Components.w3 w3Var;
        boolean z10;
        sg.h0 h0Var;
        boolean z11;
        wg.y yVar = (wg.y) this.f11816b;
        org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.f11817c;
        ArrayList arrayList = yVar.Z1;
        wg.r rVar = yVar.f59292u2;
        if (view instanceof yg.y) {
            yg.y yVar2 = (yg.y) view;
            int type = yVar2.getType();
            boolean z12 = yVar2.f31310e.h;
            boolean z13 = !z12;
            yVar2.setChecked(z13);
            int i10 = yg.y.M;
            if (type == 0) {
                yVar.f59291t2 = z13;
                yVar.k1(false, false);
            } else if (type == 1) {
                yVar2.setDivider(z13);
                yVar.f59290s2 = z13;
                yVar.k1(false, false);
                xg.b bVar = yVar.f59275c2;
                int i11 = 0;
                while (true) {
                    if (i11 >= bVar.f59903e.size()) {
                        break;
                    }
                    xg.a aVar = (xg.a) bVar.f59903e.get(i11);
                    if (aVar.f56015a == 15) {
                        int i12 = aVar.f59901l;
                        int i13 = yg.y.M;
                        if (i12 == 1) {
                            if (!z12) {
                                bVar.i(i11 + 1);
                            } else {
                                bVar.s(i11 + 1);
                            }
                        }
                    }
                    i11++;
                }
                yVar.f59275c2.G();
                if (!yVar.f59290s2) {
                    org.telegram.messenger.g0.i3(rVar, 250L);
                } else {
                    org.telegram.messenger.g0.r(rVar);
                }
            }
        }
        if (view instanceof yg.c) {
            if (view instanceof yg.d) {
                int selectedType = ((yg.d) view).getSelectedType();
                int i14 = yg.d.f60661w;
                if (selectedType != 2 && selectedType != 3) {
                    if (selectedType == 1) {
                        sg.h0 h0Var2 = yVar.f59285n2;
                        if (h0Var2 != null) {
                            ((wg.u0) h0Var2.f56642b).h1(1, arrayList);
                            ((wg.l) h0Var2.f56643c).f59203m1.C(1);
                        }
                    } else {
                        yVar.f59276e2 = selectedType;
                        yVar.k1(true, true);
                        yVar.j1(true);
                        yVar.b1();
                    }
                } else if (selectedType == 2 && yVar.d2 == selectedType) {
                    sg.h0 h0Var3 = yVar.f59285n2;
                    if (h0Var3 != null) {
                        ((wg.u0) h0Var3.f56642b).h1(1, arrayList);
                        ((wg.l) h0Var3.f56643c).f59203m1.C(1);
                        return;
                    }
                    return;
                } else {
                    yVar.d2 = selectedType;
                    yVar.k1(true, true);
                    yVar.j1(true);
                    yVar.b1();
                }
            } else {
                yg.c cVar = (yg.c) view;
                uj0 uj0Var = yVar.f35936o1;
                if (cVar.b()) {
                    for (int i15 = 0; i15 < uj0Var.getChildCount(); i15++) {
                        View childAt = uj0Var.getChildAt(i15);
                        if (childAt.getClass().isInstance(cVar)) {
                            yg.c cVar2 = (yg.c) childAt;
                            if (childAt == cVar) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            cVar2.c(z11, true);
                        }
                    }
                }
            }
        }
        if (view instanceof yg.u) {
            int selectedType2 = ((yg.u) view).getSelectedType();
            if (yVar.f59277f2 == selectedType2 && (h0Var = yVar.f59285n2) != null) {
                ((wg.u0) h0Var.f56642b).h1(3, yVar.f59273a2);
                ((wg.l) h0Var.f56643c).f59203m1.C(1);
            }
            yVar.f59277f2 = selectedType2;
            yVar.k1(false, false);
        } else if (view instanceof yg.i) {
            yVar.f59279h2 = ((TLRPC.TL_premiumGiftCodeOption) ((yg.i) view).getGifCode()).months;
            yVar.k1(false, false);
            yVar.f59275c2.G();
        } else if (view instanceof yg.h) {
            Context context = e2Var.getContext();
            long j3 = yVar.f59280i2;
            wg.s sVar = new wg.s(yVar);
            org.telegram.ui.ActionBar.e6 e6Var = yVar.J0;
            org.telegram.ui.Components.q4 q4Var = new org.telegram.ui.Components.q4(e6Var);
            ou ouVar = new ou(context, e6Var);
            ((org.telegram.ui.ActionBar.u2) ouVar.f25804b).f29720w0 = false;
            ib0 ib0Var = new ib0(context, e6Var);
            int i16 = q4Var.f38480a;
            ib0Var.setTextColor(i16);
            ib0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
            ib0Var.setItemCount(5);
            ?? ib0Var2 = new ib0(context, e6Var);
            ib0Var2.setWrapSelectorWheel(true);
            ib0Var2.setAllItemsCount(24);
            ib0Var2.setItemCount(5);
            ib0Var2.setTextColor(i16);
            ib0Var2.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
            ib0Var2.setTag("HOUR");
            ?? ib0Var3 = new ib0(context, e6Var);
            ib0Var3.setWrapSelectorWheel(true);
            ib0Var3.setAllItemsCount(60);
            ib0Var3.setItemCount(5);
            ib0Var3.setTextColor(i16);
            ib0Var3.setTextOffset(-org.telegram.messenger.g0.L(34.0f));
            org.telegram.ui.Components.w3 w3Var2 = new org.telegram.ui.Components.w3(context, q4Var, ib0Var, (wg.f) ib0Var2, (wg.g) ib0Var3);
            w3Var2.setOrientation(1);
            FrameLayout frameLayout = new FrameLayout(context);
            w3Var2.addView(frameLayout, ja.t(-1, -2, 51, 22, 0, 0, 4));
            TextView textView = new TextView(context);
            textView.setText(hd.M0(2131753287, "BoostingSelectDateTime"));
            textView.setTextColor(i16);
            i5.c.v(textView, 1, 20.0f);
            frameLayout.addView(textView, ja.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
            textView.setOnTouchListener(new gi.a(2));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setWeightSum(1.0f);
            w3Var2.addView(linearLayout, ja.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
            long currentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            int i17 = calendar.get(1);
            mb0 mb0Var = new mb0(context, 5);
            long j10 = np.s1(m10.f24934t0).f25357p0 * 1000;
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(j10);
            int i18 = calendar2.get(6);
            calendar2.setTimeInMillis(System.currentTimeMillis());
            calendar2.add(14, (int) j10);
            int i19 = calendar2.get(11);
            int i20 = calendar.get(12);
            linearLayout.addView(ib0Var, ja.l(0.5f, 0, 270));
            ib0Var.setMinValue(0);
            ib0Var.setMaxValue(i18 - 1);
            ib0Var.setWrapSelectorWheel(false);
            ib0Var.setTag("DAY");
            ib0Var.setFormatter(new v00(currentTimeMillis, calendar, i17, 1));
            gb0 b4Var = new ki.b4(w3Var2, (wg.f) ib0Var2, (wg.g) ib0Var3, i19, i20, ib0Var);
            ib0Var.setOnValueChangedListener(b4Var);
            ib0Var2.setMinValue(0);
            ib0Var2.setMaxValue(23);
            linearLayout.addView((View) ib0Var2, ja.l(0.2f, 0, 270));
            ib0Var2.setFormatter(new ug.x(17));
            ib0Var2.setOnValueChangedListener(b4Var);
            ib0Var3.setMinValue(0);
            ib0Var3.setMaxValue(11);
            ib0Var3.setValue(0);
            ib0Var3.setFormatter(new ug.x(18));
            linearLayout.addView((View) ib0Var3, ja.l(0.3f, 0, 270));
            ib0Var3.setOnValueChangedListener(b4Var);
            if (j3 > 0) {
                w3Var = w3Var2;
                calendar.setTimeInMillis(System.currentTimeMillis());
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                calendar.set(11, 0);
                calendar.setTimeInMillis(j3);
                ib0Var3.setValue(calendar.get(12) / 5);
                ib0Var2.setValue(calendar.get(11));
                ib0Var.setValue((int) ((j3 - calendar.getTimeInMillis()) / 86400000));
                ib0Var.getValue();
                b4Var.m(ib0Var, ib0Var.getValue());
                ib0Var2.getValue();
                b4Var.m(ib0Var2, ib0Var2.getValue());
            } else {
                w3Var = w3Var2;
            }
            mb0Var.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
            mb0Var.setGravity(17);
            mb0Var.setTextColor(q4Var.f38485g);
            mb0Var.setTextSize(1, 14.0f);
            mb0Var.setTypeface(org.telegram.messenger.g0.o());
            mb0Var.setBackground(org.telegram.ui.ActionBar.y5.e(q4Var.h, 8.0f));
            mb0Var.setText(hd.M0(2131753543, "BoostingConfirm"));
            w3Var.addView(mb0Var, ja.t(-1, 48, 83, 16, 15, 16, 16));
            mb0Var.setOnClickListener(new org.telegram.ui.Components.l1(calendar, ib0Var, ib0Var2, ib0Var3, sVar, ouVar));
            org.telegram.ui.ActionBar.u2 u2Var = (org.telegram.ui.ActionBar.u2) ouVar.f25804b;
            u2Var.O = w3Var;
            u2Var.show();
            int i21 = q4Var.f38481b;
            u2Var.v0(i21);
            u2Var.P(i21);
            if (i0.a.h(i21) > 0.699999988079071d) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.messenger.g0.q3(u2Var, z10);
        } else if (view instanceof yg.b) {
            sg.h0 h0Var4 = yVar.f59285n2;
            if (h0Var4 != null) {
                ((wg.u0) h0Var4.f56642b).h1(2, yVar.Y1);
                ((wg.l) h0Var4.f56643c).f59203m1.C(1);
            }
        } else if (view instanceof yg.w) {
            TL_stars.TL_starsGiveawayOption option = ((yg.w) view).getOption();
            if (option != null) {
                yVar.f59283l2 = option.stars;
                yVar.k1(true, true);
                yVar.j1(true);
                yVar.b1();
            }
        } else if (view instanceof ua) {
            yVar.f59278g2 = true;
            yVar.k1(true, true);
        }
    }

    @Override
    public final void b(int r25, android.view.View r26) {
        throw new UnsupportedOperationException("Method not decompiled: fi.i4.b(int, android.view.View):void");
    }
}
