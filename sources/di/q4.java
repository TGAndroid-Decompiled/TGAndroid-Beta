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
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.gb0;
import org.telegram.ui.Components.ib0;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.ob0;
import org.telegram.ui.uh0;
import org.telegram.ui.v00;
public final class q4 implements cj0 {
    public final int f9574a;
    public final Object f9575b;
    public final Object f9576c;

    public q4(int i7, Object obj, Object obj2) {
        this.f9574a = i7;
        this.f9575b = obj;
        this.f9576c = obj2;
    }

    private final void a(int r9, android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: di.q4.a(int, android.view.View):void");
    }

    private final void b(int i7, View view) {
        uh0.Z((uh0) this.f9575b, (Context) this.f9576c, view, i7);
    }

    private final void d(int i7, View view) {
        PrivacySettingsActivity.a0((PrivacySettingsActivity) this.f9575b, (Context) this.f9576c, view, i7);
    }

    private final void e(int i7, View view) {
        UsersSelectActivity.Z((UsersSelectActivity) this.f9575b, (Context) this.f9576c, view, i7);
    }

    private final void f(int i7, View view) {
        org.telegram.ui.Components.y3 y3Var;
        boolean z9;
        sg.i0 i0Var;
        boolean z10;
        wg.z zVar = (wg.z) this.f9575b;
        org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.f9576c;
        ArrayList arrayList = zVar.V1;
        wg.s sVar = zVar.f57855q2;
        if (view instanceof yg.y) {
            yg.y yVar = (yg.y) view;
            int type = yVar.getType();
            boolean z11 = yVar.f30214e.h;
            boolean z12 = !z11;
            yVar.setChecked(z12);
            int i10 = yg.y.L;
            if (type == 0) {
                zVar.f57854p2 = z12;
                zVar.k1(false, false);
            } else if (type == 1) {
                yVar.setDivider(z12);
                zVar.f57853o2 = z12;
                zVar.k1(false, false);
                xg.c cVar = zVar.Y1;
                int i11 = 0;
                while (true) {
                    if (i11 >= cVar.f58723e.size()) {
                        break;
                    }
                    xg.b bVar = (xg.b) cVar.f58723e.get(i11);
                    if (bVar.f54544a == 15) {
                        int i12 = bVar.f58721l;
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
                zVar.Y1.G();
                if (!zVar.f57853o2) {
                    org.telegram.messenger.g0.i3(sVar, 250L);
                } else {
                    org.telegram.messenger.g0.r(sVar);
                }
            }
        }
        if (view instanceof yg.c) {
            if (view instanceof yg.d) {
                int selectedType = ((yg.d) view).getSelectedType();
                int i14 = yg.d.f59459w;
                if (selectedType != 2 && selectedType != 3) {
                    if (selectedType == 1) {
                        sg.i0 i0Var2 = zVar.f57848j2;
                        if (i0Var2 != null) {
                            ((wg.w0) i0Var2.f55092b).h1(1, arrayList);
                            ((wg.l) i0Var2.f55093c).f57770i1.E(1);
                        }
                    } else {
                        zVar.f57840a2 = selectedType;
                        zVar.k1(true, true);
                        zVar.j1(true);
                        zVar.b1();
                    }
                } else if (selectedType == 2 && zVar.Z1 == selectedType) {
                    sg.i0 i0Var3 = zVar.f57848j2;
                    if (i0Var3 != null) {
                        ((wg.w0) i0Var3.f55092b).h1(1, arrayList);
                        ((wg.l) i0Var3.f55093c).f57770i1.E(1);
                        return;
                    }
                    return;
                } else {
                    zVar.Z1 = selectedType;
                    zVar.k1(true, true);
                    zVar.j1(true);
                    zVar.b1();
                }
            } else {
                yg.c cVar2 = (yg.c) view;
                qj0 qj0Var = zVar.f36303k1;
                if (cVar2.b()) {
                    for (int i15 = 0; i15 < qj0Var.getChildCount(); i15++) {
                        View childAt = qj0Var.getChildAt(i15);
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
            if (zVar.f57841b2 == selectedType2 && (i0Var = zVar.f57848j2) != null) {
                ((wg.w0) i0Var.f55092b).h1(3, zVar.W1);
                ((wg.l) i0Var.f55093c).f57770i1.E(1);
            }
            zVar.f57841b2 = selectedType2;
            zVar.k1(false, false);
        } else if (view instanceof yg.i) {
            zVar.d2 = ((TLRPC.TL_premiumGiftCodeOption) ((yg.i) view).getGifCode()).months;
            zVar.k1(false, false);
            zVar.Y1.G();
        } else if (view instanceof yg.h) {
            Context context = f2Var.getContext();
            long j3 = zVar.f57843e2;
            wg.t tVar = new wg.t(zVar);
            org.telegram.ui.ActionBar.g6 g6Var = zVar.I0;
            org.telegram.ui.Components.s4 s4Var = new org.telegram.ui.Components.s4(g6Var);
            h9.f1 f1Var = new h9.f1(context, g6Var);
            ((org.telegram.ui.ActionBar.v2) f1Var.f14323b).f28656v0 = false;
            ib0 ib0Var = new ib0(context, g6Var);
            int i16 = s4Var.f37900a;
            ib0Var.setTextColor(i16);
            ib0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
            ib0Var.setItemCount(5);
            ?? ib0Var2 = new ib0(context, g6Var);
            ib0Var2.setWrapSelectorWheel(true);
            ib0Var2.setAllItemsCount(24);
            ib0Var2.setItemCount(5);
            ib0Var2.setTextColor(i16);
            ib0Var2.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
            ib0Var2.setTag("HOUR");
            ?? ib0Var3 = new ib0(context, g6Var);
            ib0Var3.setWrapSelectorWheel(true);
            ib0Var3.setAllItemsCount(60);
            ib0Var3.setItemCount(5);
            ib0Var3.setTextColor(i16);
            ib0Var3.setTextOffset(-org.telegram.messenger.g0.L(34.0f));
            org.telegram.ui.Components.y3 y3Var2 = new org.telegram.ui.Components.y3(context, s4Var, ib0Var, (wg.f) ib0Var2, (wg.g) ib0Var3);
            y3Var2.setOrientation(1);
            FrameLayout frameLayout = new FrameLayout(context);
            y3Var2.addView(frameLayout, ha.t(-1, -2, 51, 22, 0, 0, 4));
            TextView textView = new TextView(context);
            textView.setText(id.M0(2131753287, "BoostingSelectDateTime"));
            textView.setTextColor(i16);
            com.google.android.recaptcha.internal.a.q(textView, 1, 20.0f);
            frameLayout.addView(textView, ha.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
            textView.setOnTouchListener(new ei.b(2));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setWeightSum(1.0f);
            y3Var2.addView(linearLayout, ha.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
            long currentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            int i17 = calendar.get(1);
            ob0 ob0Var = new ob0(context, 5);
            long j10 = qp.s1(p10.f24470s0).f24853o0 * 1000;
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(j10);
            int i18 = calendar2.get(6);
            calendar2.setTimeInMillis(System.currentTimeMillis());
            calendar2.add(14, (int) j10);
            int i19 = calendar2.get(11);
            int i20 = calendar.get(12);
            linearLayout.addView(ib0Var, ha.l(0.5f, 0, 270));
            ib0Var.setMinValue(0);
            ib0Var.setMaxValue(i18 - 1);
            ib0Var.setWrapSelectorWheel(false);
            ib0Var.setTag("DAY");
            ib0Var.setFormatter(new v00(currentTimeMillis, calendar, i17, 1));
            gb0 g4Var = new hi.g4(y3Var2, (wg.f) ib0Var2, (wg.g) ib0Var3, i19, i20, ib0Var);
            ib0Var.setOnValueChangedListener(g4Var);
            ib0Var2.setMinValue(0);
            ib0Var2.setMaxValue(23);
            linearLayout.addView((View) ib0Var2, ha.l(0.2f, 0, 270));
            ib0Var2.setFormatter(new v0.j(16));
            ib0Var2.setOnValueChangedListener(g4Var);
            ib0Var3.setMinValue(0);
            ib0Var3.setMaxValue(11);
            ib0Var3.setValue(0);
            ib0Var3.setFormatter(new v0.j(17));
            linearLayout.addView((View) ib0Var3, ha.l(0.3f, 0, 270));
            ib0Var3.setOnValueChangedListener(g4Var);
            if (j3 > 0) {
                y3Var = y3Var2;
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
                g4Var.n(ib0Var, ib0Var.getValue());
                ib0Var2.getValue();
                g4Var.n(ib0Var2, ib0Var2.getValue());
            } else {
                y3Var = y3Var2;
            }
            ob0Var.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
            ob0Var.setGravity(17);
            ob0Var.setTextColor(s4Var.f37905g);
            ob0Var.setTextSize(1, 14.0f);
            ob0Var.setTypeface(org.telegram.messenger.g0.o());
            ob0Var.setBackground(org.telegram.ui.ActionBar.a6.e(s4Var.h, 8.0f));
            ob0Var.setText(id.M0(2131753543, "BoostingConfirm"));
            y3Var.addView(ob0Var, ha.t(-1, 48, 83, 16, 15, 16, 16));
            ob0Var.setOnClickListener(new org.telegram.ui.Components.n1(calendar, ib0Var, ib0Var2, ib0Var3, tVar, f1Var));
            org.telegram.ui.ActionBar.v2 v2Var = (org.telegram.ui.ActionBar.v2) f1Var.f14323b;
            v2Var.N = y3Var;
            v2Var.show();
            int i21 = s4Var.f37901b;
            v2Var.v0(i21);
            v2Var.O(i21);
            if (i0.a.h(i21) > 0.699999988079071d) {
                z9 = true;
            } else {
                z9 = false;
            }
            org.telegram.messenger.g0.q3(v2Var, z9);
        } else if (view instanceof yg.b) {
            sg.i0 i0Var4 = zVar.f57848j2;
            if (i0Var4 != null) {
                ((wg.w0) i0Var4.f55092b).h1(2, zVar.U1);
                ((wg.l) i0Var4.f55093c).f57770i1.E(1);
            }
        } else if (view instanceof yg.w) {
            TL_stars.TL_starsGiveawayOption option = ((yg.w) view).getOption();
            if (option != null) {
                zVar.f57846h2 = option.stars;
                zVar.k1(true, true);
                zVar.j1(true);
                zVar.b1();
            }
        } else if (view instanceof kc) {
            zVar.f57842c2 = true;
            zVar.k1(true, true);
        }
    }

    @Override
    public final void c(int r36, android.view.View r37) {
        throw new UnsupportedOperationException("Method not decompiled: di.q4.c(int, android.view.View):void");
    }
}
