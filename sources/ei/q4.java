package ei;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import ci.eb;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ab0;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.fj0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.jb0;
import org.telegram.ui.ph0;
import org.telegram.ui.r00;
public final class q4 implements fj0 {
    public final int f10803a;
    public final Object f10804b;
    public final Object f10805c;

    public q4(int i3, Object obj, Object obj2) {
        this.f10803a = i3;
        this.f10804b = obj;
        this.f10805c = obj2;
    }

    private final void a(int r9, android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: ei.q4.a(int, android.view.View):void");
    }

    private final void b(int i3, View view) {
        ph0.Z((ph0) this.f10804b, (Context) this.f10805c, view, i3);
    }

    private final void c(int i3, View view) {
        PrivacySettingsActivity.a0((PrivacySettingsActivity) this.f10804b, (Context) this.f10805c, view, i3);
    }

    private final void d(int i3, View view) {
        UsersSelectActivity.Z((UsersSelectActivity) this.f10804b, (Context) this.f10805c, view, i3);
    }

    private final void e(int i3, View view) {
        org.telegram.ui.Components.w3 w3Var;
        boolean z10;
        ua.b bVar;
        boolean z11;
        xg.a0 a0Var = (xg.a0) this.f10804b;
        org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.f10805c;
        ArrayList arrayList = a0Var.W1;
        xg.t tVar = a0Var.f58648r2;
        if (view instanceof zg.y) {
            zg.y yVar = (zg.y) view;
            int type = yVar.getType();
            boolean z12 = yVar.f30234e.h;
            boolean z13 = !z12;
            yVar.setChecked(z13);
            int i10 = zg.y.M;
            if (type == 0) {
                a0Var.f58647q2 = z13;
                a0Var.k1(false, false);
            } else if (type == 1) {
                yVar.setDivider(z13);
                a0Var.f58646p2 = z13;
                a0Var.k1(false, false);
                yg.b bVar2 = a0Var.Z1;
                int i11 = 0;
                while (true) {
                    if (i11 >= bVar2.f59431e.size()) {
                        break;
                    }
                    yg.a aVar = (yg.a) bVar2.f59431e.get(i11);
                    if (aVar.f54715a == 15) {
                        int i12 = aVar.f59429l;
                        int i13 = zg.y.M;
                        if (i12 == 1) {
                            if (!z12) {
                                bVar2.i(i11 + 1);
                            } else {
                                bVar2.s(i11 + 1);
                            }
                        }
                    }
                    i11++;
                }
                a0Var.Z1.G();
                if (!a0Var.f58646p2) {
                    org.telegram.messenger.g0.i3(tVar, 250L);
                } else {
                    org.telegram.messenger.g0.r(tVar);
                }
            }
        }
        if (view instanceof zg.c) {
            if (view instanceof zg.d) {
                int selectedType = ((zg.d) view).getSelectedType();
                int i14 = zg.d.f60490w;
                if (selectedType != 2 && selectedType != 3) {
                    if (selectedType == 1) {
                        ua.b bVar3 = a0Var.f58641k2;
                        if (bVar3 != null) {
                            ((xg.w0) bVar3.f55783b).h1(1, arrayList);
                            ((xg.n) bVar3.f55784c).f58731j1.D(1);
                        }
                    } else {
                        a0Var.f58633b2 = selectedType;
                        a0Var.k1(true, true);
                        a0Var.j1(true);
                        a0Var.b1();
                    }
                } else if (selectedType == 2 && a0Var.f58632a2 == selectedType) {
                    ua.b bVar4 = a0Var.f58641k2;
                    if (bVar4 != null) {
                        ((xg.w0) bVar4.f55783b).h1(1, arrayList);
                        ((xg.n) bVar4.f55784c).f58731j1.D(1);
                        return;
                    }
                    return;
                } else {
                    a0Var.f58632a2 = selectedType;
                    a0Var.k1(true, true);
                    a0Var.j1(true);
                    a0Var.b1();
                }
            } else {
                zg.c cVar = (zg.c) view;
                tj0 tj0Var = a0Var.f36102l1;
                if (cVar.b()) {
                    for (int i15 = 0; i15 < tj0Var.getChildCount(); i15++) {
                        View childAt = tj0Var.getChildAt(i15);
                        if (childAt.getClass().isInstance(cVar)) {
                            zg.c cVar2 = (zg.c) childAt;
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
        if (view instanceof zg.u) {
            int selectedType2 = ((zg.u) view).getSelectedType();
            if (a0Var.c2 == selectedType2 && (bVar = a0Var.f58641k2) != null) {
                ((xg.w0) bVar.f55783b).h1(3, a0Var.X1);
                ((xg.n) bVar.f55784c).f58731j1.D(1);
            }
            a0Var.c2 = selectedType2;
            a0Var.k1(false, false);
        } else if (view instanceof zg.i) {
            a0Var.f58635e2 = ((TLRPC.TL_premiumGiftCodeOption) ((zg.i) view).getGifCode()).months;
            a0Var.k1(false, false);
            a0Var.Z1.G();
        } else if (view instanceof zg.h) {
            Context context = d2Var.getContext();
            long j10 = a0Var.f58636f2;
            xg.u uVar = new xg.u(a0Var);
            org.telegram.ui.ActionBar.e6 e6Var = a0Var.J0;
            org.telegram.ui.Components.q4 q4Var = new org.telegram.ui.Components.q4(e6Var);
            hi.d dVar = new hi.d(context, e6Var);
            ((org.telegram.ui.ActionBar.t2) dVar.f14429b).f28621w0 = false;
            cb0 cb0Var = new cb0(context, e6Var);
            int i16 = q4Var.f37335a;
            cb0Var.setTextColor(i16);
            cb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
            cb0Var.setItemCount(5);
            ?? cb0Var2 = new cb0(context, e6Var);
            cb0Var2.setWrapSelectorWheel(true);
            cb0Var2.setAllItemsCount(24);
            cb0Var2.setItemCount(5);
            cb0Var2.setTextColor(i16);
            cb0Var2.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
            cb0Var2.setTag("HOUR");
            ?? cb0Var3 = new cb0(context, e6Var);
            cb0Var3.setWrapSelectorWheel(true);
            cb0Var3.setAllItemsCount(60);
            cb0Var3.setItemCount(5);
            cb0Var3.setTextColor(i16);
            cb0Var3.setTextOffset(-org.telegram.messenger.g0.L(34.0f));
            org.telegram.ui.Components.w3 w3Var2 = new org.telegram.ui.Components.w3(context, q4Var, cb0Var, (xg.h) cb0Var2, (xg.i) cb0Var3);
            w3Var2.setOrientation(1);
            FrameLayout frameLayout = new FrameLayout(context);
            w3Var2.addView(frameLayout, mf.t(-1, -2, 51, 22, 0, 0, 4));
            TextView textView = new TextView(context);
            textView.setText(bd.M0(2131753287, "BoostingSelectDateTime"));
            textView.setTextColor(i16);
            k2.p1.t(textView, 1, 20.0f);
            frameLayout.addView(textView, mf.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
            textView.setOnTouchListener(new fi.a(2));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setWeightSum(1.0f);
            w3Var2.addView(linearLayout, mf.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
            long currentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            int i17 = calendar.get(1);
            jb0 jb0Var = new jb0(context, 5);
            long j11 = hp.s1(h10.f22829t0).f23086p0 * 1000;
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(j11);
            int i18 = calendar2.get(6);
            calendar2.setTimeInMillis(System.currentTimeMillis());
            calendar2.add(14, (int) j11);
            int i19 = calendar2.get(11);
            int i20 = calendar.get(12);
            linearLayout.addView(cb0Var, mf.l(0.5f, 0, 270));
            cb0Var.setMinValue(0);
            cb0Var.setMaxValue(i18 - 1);
            cb0Var.setWrapSelectorWheel(false);
            cb0Var.setTag("DAY");
            cb0Var.setFormatter(new r00(currentTimeMillis, calendar, i17, 1));
            ab0 g4Var = new ii.g4(w3Var2, (xg.h) cb0Var2, (xg.i) cb0Var3, i19, i20, cb0Var);
            cb0Var.setOnValueChangedListener(g4Var);
            cb0Var2.setMinValue(0);
            cb0Var2.setMaxValue(23);
            linearLayout.addView((View) cb0Var2, mf.l(0.2f, 0, 270));
            cb0Var2.setFormatter(new u9.j(21));
            cb0Var2.setOnValueChangedListener(g4Var);
            cb0Var3.setMinValue(0);
            cb0Var3.setMaxValue(11);
            cb0Var3.setValue(0);
            cb0Var3.setFormatter(new u9.j(22));
            linearLayout.addView((View) cb0Var3, mf.l(0.3f, 0, 270));
            cb0Var3.setOnValueChangedListener(g4Var);
            if (j10 > 0) {
                w3Var = w3Var2;
                calendar.setTimeInMillis(System.currentTimeMillis());
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                calendar.set(11, 0);
                calendar.setTimeInMillis(j10);
                cb0Var3.setValue(calendar.get(12) / 5);
                cb0Var2.setValue(calendar.get(11));
                cb0Var.setValue((int) ((j10 - calendar.getTimeInMillis()) / 86400000));
                cb0Var.getValue();
                g4Var.l(cb0Var, cb0Var.getValue());
                cb0Var2.getValue();
                g4Var.l(cb0Var2, cb0Var2.getValue());
            } else {
                w3Var = w3Var2;
            }
            jb0Var.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
            jb0Var.setGravity(17);
            jb0Var.setTextColor(q4Var.f37340g);
            jb0Var.setTextSize(1, 14.0f);
            jb0Var.setTypeface(org.telegram.messenger.g0.o());
            jb0Var.setBackground(org.telegram.ui.ActionBar.y5.e(q4Var.h, 8.0f));
            jb0Var.setText(bd.M0(2131753543, "BoostingConfirm"));
            w3Var.addView(jb0Var, mf.t(-1, 48, 83, 16, 15, 16, 16));
            jb0Var.setOnClickListener(new org.telegram.ui.Components.m1(calendar, cb0Var, cb0Var2, cb0Var3, uVar, dVar));
            org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) dVar.f14429b;
            t2Var.O = w3Var;
            t2Var.show();
            int i21 = q4Var.f37336b;
            t2Var.v0(i21);
            t2Var.O(i21);
            if (i0.a.h(i21) > 0.699999988079071d) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.messenger.g0.q3(t2Var, z10);
        } else if (view instanceof zg.b) {
            ua.b bVar5 = a0Var.f58641k2;
            if (bVar5 != null) {
                ((xg.w0) bVar5.f55783b).h1(2, a0Var.V1);
                ((xg.n) bVar5.f55784c).f58731j1.D(1);
            }
        } else if (view instanceof zg.w) {
            TL_stars.TL_starsGiveawayOption option = ((zg.w) view).getOption();
            if (option != null) {
                a0Var.f58639i2 = option.stars;
                a0Var.k1(true, true);
                a0Var.j1(true);
                a0Var.b1();
            }
        } else if (view instanceof eb) {
            a0Var.f58634d2 = true;
            a0Var.k1(true, true);
        }
    }

    @Override
    public final void f(int r36, android.view.View r37) {
        throw new UnsupportedOperationException("Method not decompiled: ei.q4.f(int, android.view.View):void");
    }
}
