package fi;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ma;
import di.xa;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.a60;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.rb0;
import org.telegram.ui.Components.tb0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ff0;
import org.telegram.ui.k90;
import org.telegram.ui.nb0;
import org.telegram.ui.se0;
import org.telegram.ui.y00;
public final class g4 implements qj0 {
    public final int f12052a;
    public final Object f12053b;
    public final Object f12054c;

    public g4(int i7, Object obj, Object obj2) {
        this.f12052a = i7;
        this.f12053b = obj;
        this.f12054c = obj2;
    }

    private final void a(int r9, android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: fi.g4.a(int, android.view.View):void");
    }

    private final void b(int i7, View view) {
        ff0 ff0Var = (ff0) this.f12053b;
        Context context = (Context) this.f12054c;
        HashMap hashMap = ff0Var.f47701l0;
        if (i7 == ff0Var.R) {
            TLRPC.User user = (TLRPC.User) hashMap.get(Long.valueOf(ff0Var.f47692e.admin_id));
            if (user != null) {
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user.f28580id);
                mp.u1(j10.f24798t0).e4(user, false, false);
                ff0Var.presentFragment(new ProfileActivity(bundle, null));
            }
        } else if (i7 == ff0Var.f47715y) {
            k90 k90Var = new k90(0, ff0Var.f47702n);
            k90Var.T = ff0Var.f47711t0;
            ff0Var.presentFragment(k90Var);
        } else {
            int i10 = ff0Var.E;
            if (i7 >= i10 && i7 < ff0Var.F) {
                a60 a60Var = new a60(context, (TLRPC.TL_chatInviteExported) ff0Var.f47699j0.get(i7 - i10), ff0Var.d, hashMap, ff0Var, ff0Var.f47702n, false, ff0Var.h);
                ff0Var.m0 = a60Var;
                a60Var.f33317f2 = ff0Var.f47706q0;
                a60Var.show();
                return;
            }
            int i11 = ff0Var.I;
            if (i7 >= i11 && i7 < ff0Var.J) {
                a60 a60Var2 = new a60(context, (TLRPC.TL_chatInviteExported) ff0Var.f47700k0.get(i7 - i11), ff0Var.d, hashMap, ff0Var, ff0Var.f47702n, false, ff0Var.h);
                ff0Var.m0 = a60Var2;
                a60Var2.show();
            } else if (i7 == ff0Var.O) {
                if (!ff0Var.f47691d0) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ff0Var.getParentActivity());
                    String N0 = gd.N0(2131751563, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28774a;
                    t1Var.S = N0;
                    t1Var.U = gd.N0(2131751564, null);
                    alertDialog$Builder.k(gd.N0(2131751586, null), new se0(ff0Var));
                    alertDialog$Builder.h(gd.N0(2131752577, null), null);
                    ff0Var.showDialog(t1Var);
                }
            } else {
                int i12 = ff0Var.V;
                if (i7 >= i12 && i7 < ff0Var.W) {
                    TLRPC.TL_chatAdminWithInvites tL_chatAdminWithInvites = (TLRPC.TL_chatAdminWithInvites) ff0Var.f47703n0.get(i7 - i12);
                    if (hashMap.containsKey(Long.valueOf(tL_chatAdminWithInvites.admin_id))) {
                        ff0Var.getMessagesController().e4((TLRPC.User) hashMap.get(Long.valueOf(tL_chatAdminWithInvites.admin_id)), false, false);
                    }
                    ff0 ff0Var2 = new ff0(ff0Var.f47702n, tL_chatAdminWithInvites.invites_count, tL_chatAdminWithInvites.admin_id);
                    ff0Var2.m0(ff0Var.d, null);
                    ff0Var.presentFragment(ff0Var2);
                }
            }
        }
    }

    private final void d(int i7, View view) {
        org.telegram.ui.Components.f4 f4Var;
        boolean z10;
        sg.h0 h0Var;
        boolean z11;
        wg.a0 a0Var = (wg.a0) this.f12053b;
        org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.f12054c;
        ArrayList arrayList = a0Var.Z1;
        wg.t tVar = a0Var.f59753u2;
        if (view instanceof yg.y) {
            yg.y yVar = (yg.y) view;
            int type = yVar.getType();
            boolean z12 = yVar.f31811e.h;
            boolean z13 = !z12;
            yVar.setChecked(z13);
            int i10 = yg.y.M;
            if (type == 0) {
                a0Var.f59752t2 = z13;
                a0Var.l1(false, false);
            } else if (type == 1) {
                yVar.setDivider(z13);
                a0Var.f59751s2 = z13;
                a0Var.l1(false, false);
                xg.b bVar = a0Var.f59736c2;
                int i11 = 0;
                while (true) {
                    if (i11 >= bVar.f60514e.size()) {
                        break;
                    }
                    xg.a aVar = (xg.a) bVar.f60514e.get(i11);
                    if (aVar.f56630a == 15) {
                        int i12 = aVar.f60512l;
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
                a0Var.f59736c2.G();
                if (!a0Var.f59751s2) {
                    org.telegram.messenger.g0.h3(tVar, 250L);
                } else {
                    org.telegram.messenger.g0.r(tVar);
                }
            }
        }
        if (view instanceof yg.c) {
            if (view instanceof yg.d) {
                int selectedType = ((yg.d) view).getSelectedType();
                int i14 = yg.d.f61270w;
                if (selectedType != 2 && selectedType != 3) {
                    if (selectedType == 1) {
                        sg.h0 h0Var2 = a0Var.f59746n2;
                        if (h0Var2 != null) {
                            ((wg.w0) h0Var2.f57257b).i1(1, arrayList);
                            ((wg.l) h0Var2.f57258c).f59827m1.A(1);
                        }
                    } else {
                        a0Var.f59737e2 = selectedType;
                        a0Var.l1(true, true);
                        a0Var.k1(true);
                        a0Var.c1();
                    }
                } else if (selectedType == 2 && a0Var.d2 == selectedType) {
                    sg.h0 h0Var3 = a0Var.f59746n2;
                    if (h0Var3 != null) {
                        ((wg.w0) h0Var3.f57257b).i1(1, arrayList);
                        ((wg.l) h0Var3.f57258c).f59827m1.A(1);
                        return;
                    }
                    return;
                } else {
                    a0Var.d2 = selectedType;
                    a0Var.l1(true, true);
                    a0Var.k1(true);
                    a0Var.c1();
                }
            } else {
                yg.c cVar = (yg.c) view;
                ek0 ek0Var = a0Var.f39539o1;
                if (cVar.b()) {
                    for (int i15 = 0; i15 < ek0Var.getChildCount(); i15++) {
                        View childAt = ek0Var.getChildAt(i15);
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
            if (a0Var.f59738f2 == selectedType2 && (h0Var = a0Var.f59746n2) != null) {
                ((wg.w0) h0Var.f57257b).i1(3, a0Var.f59734a2);
                ((wg.l) h0Var.f57258c).f59827m1.A(1);
            }
            a0Var.f59738f2 = selectedType2;
            a0Var.l1(false, false);
        } else if (view instanceof yg.i) {
            a0Var.f59740h2 = ((TLRPC.TL_premiumGiftCodeOption) ((yg.i) view).getGifCode()).months;
            a0Var.l1(false, false);
            a0Var.f59736c2.G();
        } else if (view instanceof yg.h) {
            Context context = g2Var.getContext();
            long j3 = a0Var.f59741i2;
            wg.u uVar = new wg.u(a0Var);
            org.telegram.ui.ActionBar.h6 h6Var = a0Var.J0;
            org.telegram.ui.Components.z4 z4Var = new org.telegram.ui.Components.z4(h6Var);
            hi.w4 w4Var = new hi.w4(context, h6Var);
            ((org.telegram.ui.ActionBar.w2) w4Var.f15705b).f30211w0 = false;
            tb0 tb0Var = new tb0(context, h6Var);
            int i16 = z4Var.f42667a;
            tb0Var.setTextColor(i16);
            tb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
            tb0Var.setItemCount(5);
            ?? tb0Var2 = new tb0(context, h6Var);
            tb0Var2.setWrapSelectorWheel(true);
            tb0Var2.setAllItemsCount(24);
            tb0Var2.setItemCount(5);
            tb0Var2.setTextColor(i16);
            tb0Var2.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
            tb0Var2.setTag("HOUR");
            ?? tb0Var3 = new tb0(context, h6Var);
            tb0Var3.setWrapSelectorWheel(true);
            tb0Var3.setAllItemsCount(60);
            tb0Var3.setItemCount(5);
            tb0Var3.setTextColor(i16);
            tb0Var3.setTextOffset(-org.telegram.messenger.g0.L(34.0f));
            org.telegram.ui.Components.f4 f4Var2 = new org.telegram.ui.Components.f4(context, z4Var, tb0Var, (wg.f) tb0Var2, (wg.g) tb0Var3);
            f4Var2.setOrientation(1);
            FrameLayout frameLayout = new FrameLayout(context);
            f4Var2.addView(frameLayout, ma.t(-1, -2, 51, 22, 0, 0, 4));
            TextView textView = new TextView(context);
            textView.setText(gd.N0(2131753284, "BoostingSelectDateTime"));
            textView.setTextColor(i16);
            i5.c.x(textView, 1, 20.0f);
            frameLayout.addView(textView, ma.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
            textView.setOnTouchListener(new gi.a(2));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setWeightSum(1.0f);
            f4Var2.addView(linearLayout, ma.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
            long currentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            int i17 = calendar.get(1);
            nb0 nb0Var = new nb0(context, 5);
            long j10 = mp.u1(j10.f24798t0).f25754p0 * 1000;
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(j10);
            int i18 = calendar2.get(6);
            calendar2.setTimeInMillis(System.currentTimeMillis());
            calendar2.add(14, (int) j10);
            int i19 = calendar2.get(11);
            int i20 = calendar.get(12);
            linearLayout.addView(tb0Var, ma.l(0.5f, 0, 270));
            tb0Var.setMinValue(0);
            tb0Var.setMaxValue(i18 - 1);
            tb0Var.setWrapSelectorWheel(false);
            tb0Var.setTag("DAY");
            tb0Var.setFormatter(new y00(currentTimeMillis, calendar, i17, 1));
            rb0 v3Var = new ki.v3(f4Var2, (wg.f) tb0Var2, (wg.g) tb0Var3, i19, i20, tb0Var);
            tb0Var.setOnValueChangedListener(v3Var);
            tb0Var2.setMinValue(0);
            tb0Var2.setMaxValue(23);
            linearLayout.addView((View) tb0Var2, ma.l(0.2f, 0, 270));
            tb0Var2.setFormatter(new ug.x(18));
            tb0Var2.setOnValueChangedListener(v3Var);
            tb0Var3.setMinValue(0);
            tb0Var3.setMaxValue(11);
            tb0Var3.setValue(0);
            tb0Var3.setFormatter(new ug.x(19));
            linearLayout.addView((View) tb0Var3, ma.l(0.3f, 0, 270));
            tb0Var3.setOnValueChangedListener(v3Var);
            if (j3 > 0) {
                f4Var = f4Var2;
                calendar.setTimeInMillis(System.currentTimeMillis());
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                calendar.set(11, 0);
                calendar.setTimeInMillis(j3);
                tb0Var3.setValue(calendar.get(12) / 5);
                tb0Var2.setValue(calendar.get(11));
                tb0Var.setValue((int) ((j3 - calendar.getTimeInMillis()) / 86400000));
                tb0Var.getValue();
                v3Var.n(tb0Var, tb0Var.getValue());
                tb0Var2.getValue();
                v3Var.n(tb0Var2, tb0Var2.getValue());
            } else {
                f4Var = f4Var2;
            }
            nb0Var.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
            nb0Var.setGravity(17);
            nb0Var.setTextColor(z4Var.f42672g);
            nb0Var.setTextSize(1, 14.0f);
            nb0Var.setTypeface(org.telegram.messenger.g0.o());
            nb0Var.setBackground(org.telegram.ui.ActionBar.a6.e(z4Var.h, 8.0f));
            nb0Var.setText(gd.N0(2131753540, "BoostingConfirm"));
            f4Var.addView(nb0Var, ma.t(-1, 48, 83, 16, 15, 16, 16));
            nb0Var.setOnClickListener(new org.telegram.ui.Components.w1(calendar, tb0Var, tb0Var2, tb0Var3, uVar, w4Var));
            org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) w4Var.f15705b;
            w2Var.O = f4Var;
            w2Var.show();
            int i21 = z4Var.f42668b;
            w2Var.v0(i21);
            w2Var.P(i21);
            if (i0.a.h(i21) > 0.699999988079071d) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.messenger.g0.p3(w2Var, z10);
        } else if (view instanceof yg.b) {
            sg.h0 h0Var4 = a0Var.f59746n2;
            if (h0Var4 != null) {
                ((wg.w0) h0Var4.f57257b).i1(2, a0Var.Y1);
                ((wg.l) h0Var4.f57258c).f59827m1.A(1);
            }
        } else if (view instanceof yg.w) {
            TL_stars.TL_starsGiveawayOption option = ((yg.w) view).getOption();
            if (option != null) {
                a0Var.f59744l2 = option.stars;
                a0Var.l1(true, true);
                a0Var.k1(true);
                a0Var.c1();
            }
        } else if (view instanceof xa) {
            a0Var.f59739g2 = true;
            a0Var.l1(true, true);
        }
    }

    @Override
    public final void c(int r31, android.view.View r32) {
        throw new UnsupportedOperationException("Method not decompiled: fi.g4.c(int, android.view.View):void");
    }
}
