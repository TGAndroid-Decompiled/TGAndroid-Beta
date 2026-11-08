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
import org.telegram.ui.mb0;
import org.telegram.ui.sh0;
import org.telegram.ui.t00;
public final class p4 implements bj0 {
    public final int f9509a;
    public final Object f9510b;
    public final Object f9511c;

    public p4(int i7, Object obj, Object obj2) {
        this.f9509a = i7;
        this.f9510b = obj;
        this.f9511c = obj2;
    }

    private final void a(int r9, android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: di.p4.a(int, android.view.View):void");
    }

    private final void b(int i7, View view) {
        sh0.Z((sh0) this.f9510b, (Context) this.f9511c, view, i7);
    }

    private final void d(int i7, View view) {
        PrivacySettingsActivity.a0((PrivacySettingsActivity) this.f9510b, (Context) this.f9511c, view, i7);
    }

    private final void e(int i7, View view) {
        UsersSelectActivity.Z((UsersSelectActivity) this.f9510b, (Context) this.f9511c, view, i7);
    }

    private final void f(int i7, View view) {
        org.telegram.ui.Components.y3 y3Var;
        boolean z9;
        sg.i0 i0Var;
        boolean z10;
        wg.a0 a0Var = (wg.a0) this.f9510b;
        org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.f9511c;
        ArrayList arrayList = a0Var.V1;
        wg.t tVar = a0Var.f57692q2;
        if (view instanceof yg.y) {
            yg.y yVar = (yg.y) view;
            int type = yVar.getType();
            boolean z11 = yVar.f30210e.h;
            boolean z12 = !z11;
            yVar.setChecked(z12);
            int i10 = yg.y.L;
            if (type == 0) {
                a0Var.f57691p2 = z12;
                a0Var.k1(false, false);
            } else if (type == 1) {
                yVar.setDivider(z12);
                a0Var.f57690o2 = z12;
                a0Var.k1(false, false);
                xg.c cVar = a0Var.Y1;
                int i11 = 0;
                while (true) {
                    if (i11 >= cVar.f58713e.size()) {
                        break;
                    }
                    xg.b bVar = (xg.b) cVar.f58713e.get(i11);
                    if (bVar.f54531a == 15) {
                        int i12 = bVar.f58711l;
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
                a0Var.Y1.G();
                if (!a0Var.f57690o2) {
                    org.telegram.messenger.g0.i3(tVar, 250L);
                } else {
                    org.telegram.messenger.g0.r(tVar);
                }
            }
        }
        if (view instanceof yg.c) {
            if (view instanceof yg.d) {
                int selectedType = ((yg.d) view).getSelectedType();
                int i14 = yg.d.f59449w;
                if (selectedType != 2 && selectedType != 3) {
                    if (selectedType == 1) {
                        sg.i0 i0Var2 = a0Var.f57685j2;
                        if (i0Var2 != null) {
                            ((wg.w0) i0Var2.f55067b).h1(1, arrayList);
                            ((wg.l) i0Var2.f55068c).f57771i1.E(1);
                        }
                    } else {
                        a0Var.f57677a2 = selectedType;
                        a0Var.k1(true, true);
                        a0Var.j1(true);
                        a0Var.b1();
                    }
                } else if (selectedType == 2 && a0Var.Z1 == selectedType) {
                    sg.i0 i0Var3 = a0Var.f57685j2;
                    if (i0Var3 != null) {
                        ((wg.w0) i0Var3.f55067b).h1(1, arrayList);
                        ((wg.l) i0Var3.f55068c).f57771i1.E(1);
                        return;
                    }
                    return;
                } else {
                    a0Var.Z1 = selectedType;
                    a0Var.k1(true, true);
                    a0Var.j1(true);
                    a0Var.b1();
                }
            } else {
                yg.c cVar2 = (yg.c) view;
                pj0 pj0Var = a0Var.f36277k1;
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
            if (a0Var.f57678b2 == selectedType2 && (i0Var = a0Var.f57685j2) != null) {
                ((wg.w0) i0Var.f55067b).h1(3, a0Var.W1);
                ((wg.l) i0Var.f55068c).f57771i1.E(1);
            }
            a0Var.f57678b2 = selectedType2;
            a0Var.k1(false, false);
        } else if (view instanceof yg.i) {
            a0Var.d2 = ((TLRPC.TL_premiumGiftCodeOption) ((yg.i) view).getGifCode()).months;
            a0Var.k1(false, false);
            a0Var.Y1.G();
        } else if (view instanceof yg.h) {
            Context context = f2Var.getContext();
            long j3 = a0Var.f57680e2;
            wg.u uVar = new wg.u(a0Var);
            org.telegram.ui.ActionBar.f6 f6Var = a0Var.I0;
            org.telegram.ui.Components.s4 s4Var = new org.telegram.ui.Components.s4(f6Var);
            h9.f1 f1Var = new h9.f1(context, f6Var);
            ((org.telegram.ui.ActionBar.v2) f1Var.f14323b).f28651v0 = false;
            hb0 hb0Var = new hb0(context, f6Var);
            int i16 = s4Var.f37893a;
            hb0Var.setTextColor(i16);
            hb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
            hb0Var.setItemCount(5);
            ?? hb0Var2 = new hb0(context, f6Var);
            hb0Var2.setWrapSelectorWheel(true);
            hb0Var2.setAllItemsCount(24);
            hb0Var2.setItemCount(5);
            hb0Var2.setTextColor(i16);
            hb0Var2.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
            hb0Var2.setTag("HOUR");
            ?? hb0Var3 = new hb0(context, f6Var);
            hb0Var3.setWrapSelectorWheel(true);
            hb0Var3.setAllItemsCount(60);
            hb0Var3.setItemCount(5);
            hb0Var3.setTextColor(i16);
            hb0Var3.setTextOffset(-org.telegram.messenger.g0.L(34.0f));
            org.telegram.ui.Components.y3 y3Var2 = new org.telegram.ui.Components.y3(context, s4Var, hb0Var, (wg.f) hb0Var2, (wg.g) hb0Var3);
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
            mb0 mb0Var = new mb0(context, 5);
            long j10 = qp.s1(p10.f24470s0).f24853o0 * 1000;
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
            hb0Var.setFormatter(new t00(currentTimeMillis, calendar, i17, 1));
            fb0 g4Var = new hi.g4(y3Var2, (wg.f) hb0Var2, (wg.g) hb0Var3, i19, i20, hb0Var);
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
                y3Var = y3Var2;
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
                y3Var = y3Var2;
            }
            mb0Var.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
            mb0Var.setGravity(17);
            mb0Var.setTextColor(s4Var.f37898g);
            mb0Var.setTextSize(1, 14.0f);
            mb0Var.setTypeface(org.telegram.messenger.g0.o());
            mb0Var.setBackground(org.telegram.ui.ActionBar.z5.e(s4Var.h, 8.0f));
            mb0Var.setText(id.M0(2131753543, "BoostingConfirm"));
            y3Var.addView(mb0Var, ha.t(-1, 48, 83, 16, 15, 16, 16));
            mb0Var.setOnClickListener(new org.telegram.ui.Components.n1(calendar, hb0Var, hb0Var2, hb0Var3, uVar, f1Var));
            org.telegram.ui.ActionBar.v2 v2Var = (org.telegram.ui.ActionBar.v2) f1Var.f14323b;
            v2Var.N = y3Var;
            v2Var.show();
            int i21 = s4Var.f37894b;
            v2Var.v0(i21);
            v2Var.O(i21);
            if (i0.a.h(i21) > 0.699999988079071d) {
                z9 = true;
            } else {
                z9 = false;
            }
            org.telegram.messenger.g0.q3(v2Var, z9);
        } else if (view instanceof yg.b) {
            sg.i0 i0Var4 = a0Var.f57685j2;
            if (i0Var4 != null) {
                ((wg.w0) i0Var4.f55067b).h1(2, a0Var.U1);
                ((wg.l) i0Var4.f55068c).f57771i1.E(1);
            }
        } else if (view instanceof yg.w) {
            TL_stars.TL_starsGiveawayOption option = ((yg.w) view).getOption();
            if (option != null) {
                a0Var.f57683h2 = option.stars;
                a0Var.k1(true, true);
                a0Var.j1(true);
                a0Var.b1();
            }
        } else if (view instanceof kc) {
            a0Var.f57679c2 = true;
            a0Var.k1(true, true);
        }
    }

    @Override
    public final void c(int r36, android.view.View r37) {
        throw new UnsupportedOperationException("Method not decompiled: di.p4.c(int, android.view.View):void");
    }
}
