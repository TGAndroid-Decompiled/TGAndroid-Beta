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
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.qb0;
import org.telegram.ui.Components.sb0;
import org.telegram.ui.Components.x50;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.gf0;
import org.telegram.ui.k90;
import org.telegram.ui.nb0;
import org.telegram.ui.se0;
import org.telegram.ui.y00;
public final class g4 implements oj0 {
    public final int f12011a;
    public final Object f12012b;
    public final Object f12013c;

    public g4(int i7, Object obj, Object obj2) {
        this.f12011a = i7;
        this.f12012b = obj;
        this.f12013c = obj2;
    }

    private final void a(int r9, android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: fi.g4.a(int, android.view.View):void");
    }

    private final void b(int i7, View view) {
        gf0 gf0Var = (gf0) this.f12012b;
        Context context = (Context) this.f12013c;
        HashMap hashMap = gf0Var.f48014l0;
        if (i7 == gf0Var.R) {
            TLRPC.User user = (TLRPC.User) hashMap.get(Long.valueOf(gf0Var.f48005e.admin_id));
            if (user != null) {
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user.f28552id);
                mp.u1(j10.f24770t0).e4(user, false, false);
                gf0Var.presentFragment(new ProfileActivity(bundle, null));
            }
        } else if (i7 == gf0Var.f48028y) {
            k90 k90Var = new k90(0, gf0Var.f48015n);
            k90Var.T = gf0Var.f48024t0;
            gf0Var.presentFragment(k90Var);
        } else {
            int i10 = gf0Var.E;
            if (i7 >= i10 && i7 < gf0Var.F) {
                x50 x50Var = new x50(context, (TLRPC.TL_chatInviteExported) gf0Var.f48012j0.get(i7 - i10), gf0Var.d, hashMap, gf0Var, gf0Var.f48015n, false, gf0Var.h);
                gf0Var.m0 = x50Var;
                x50Var.f41891f2 = gf0Var.f48019q0;
                x50Var.show();
                return;
            }
            int i11 = gf0Var.I;
            if (i7 >= i11 && i7 < gf0Var.J) {
                x50 x50Var2 = new x50(context, (TLRPC.TL_chatInviteExported) gf0Var.f48013k0.get(i7 - i11), gf0Var.d, hashMap, gf0Var, gf0Var.f48015n, false, gf0Var.h);
                gf0Var.m0 = x50Var2;
                x50Var2.show();
            } else if (i7 == gf0Var.O) {
                if (!gf0Var.f48004d0) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gf0Var.getParentActivity());
                    String M0 = gd.M0(2131751564, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
                    u1Var.S = M0;
                    u1Var.U = gd.M0(2131751565, null);
                    alertDialog$Builder.k(gd.M0(2131751587, null), new se0(gf0Var));
                    alertDialog$Builder.h(gd.M0(2131752578, null), null);
                    gf0Var.showDialog(u1Var);
                }
            } else {
                int i12 = gf0Var.V;
                if (i7 >= i12 && i7 < gf0Var.W) {
                    TLRPC.TL_chatAdminWithInvites tL_chatAdminWithInvites = (TLRPC.TL_chatAdminWithInvites) gf0Var.f48016n0.get(i7 - i12);
                    if (hashMap.containsKey(Long.valueOf(tL_chatAdminWithInvites.admin_id))) {
                        gf0Var.getMessagesController().e4((TLRPC.User) hashMap.get(Long.valueOf(tL_chatAdminWithInvites.admin_id)), false, false);
                    }
                    gf0 gf0Var2 = new gf0(gf0Var.f48015n, tL_chatAdminWithInvites.invites_count, tL_chatAdminWithInvites.admin_id);
                    gf0Var2.m0(gf0Var.d, null);
                    gf0Var.presentFragment(gf0Var2);
                }
            }
        }
    }

    private final void d(int i7, View view) {
        org.telegram.ui.Components.e4 e4Var;
        boolean z10;
        sg.h0 h0Var;
        boolean z11;
        wg.a0 a0Var = (wg.a0) this.f12012b;
        org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) this.f12013c;
        ArrayList arrayList = a0Var.Z1;
        wg.t tVar = a0Var.f59715u2;
        if (view instanceof yg.y) {
            yg.y yVar = (yg.y) view;
            int type = yVar.getType();
            boolean z12 = yVar.f31783e.h;
            boolean z13 = !z12;
            yVar.setChecked(z13);
            int i10 = yg.y.M;
            if (type == 0) {
                a0Var.f59714t2 = z13;
                a0Var.l1(false, false);
            } else if (type == 1) {
                yVar.setDivider(z13);
                a0Var.f59713s2 = z13;
                a0Var.l1(false, false);
                xg.b bVar = a0Var.f59698c2;
                int i11 = 0;
                while (true) {
                    if (i11 >= bVar.f60473e.size()) {
                        break;
                    }
                    xg.a aVar = (xg.a) bVar.f60473e.get(i11);
                    if (aVar.f56589a == 15) {
                        int i12 = aVar.f60471l;
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
                a0Var.f59698c2.G();
                if (!a0Var.f59713s2) {
                    org.telegram.messenger.g0.h3(tVar, 250L);
                } else {
                    org.telegram.messenger.g0.r(tVar);
                }
            }
        }
        if (view instanceof yg.c) {
            if (view instanceof yg.d) {
                int selectedType = ((yg.d) view).getSelectedType();
                int i14 = yg.d.f61229w;
                if (selectedType != 2 && selectedType != 3) {
                    if (selectedType == 1) {
                        sg.h0 h0Var2 = a0Var.f59708n2;
                        if (h0Var2 != null) {
                            ((wg.w0) h0Var2.f57216b).i1(1, arrayList);
                            ((wg.l) h0Var2.f57217c).f59786m1.A(1);
                        }
                    } else {
                        a0Var.f59699e2 = selectedType;
                        a0Var.l1(true, true);
                        a0Var.k1(true);
                        a0Var.c1();
                    }
                } else if (selectedType == 2 && a0Var.d2 == selectedType) {
                    sg.h0 h0Var3 = a0Var.f59708n2;
                    if (h0Var3 != null) {
                        ((wg.w0) h0Var3.f57216b).i1(1, arrayList);
                        ((wg.l) h0Var3.f57217c).f59786m1.A(1);
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
                ck0 ck0Var = a0Var.f39534o1;
                if (cVar.b()) {
                    for (int i15 = 0; i15 < ck0Var.getChildCount(); i15++) {
                        View childAt = ck0Var.getChildAt(i15);
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
            if (a0Var.f59700f2 == selectedType2 && (h0Var = a0Var.f59708n2) != null) {
                ((wg.w0) h0Var.f57216b).i1(3, a0Var.f59696a2);
                ((wg.l) h0Var.f57217c).f59786m1.A(1);
            }
            a0Var.f59700f2 = selectedType2;
            a0Var.l1(false, false);
        } else if (view instanceof yg.i) {
            a0Var.f59702h2 = ((TLRPC.TL_premiumGiftCodeOption) ((yg.i) view).getGifCode()).months;
            a0Var.l1(false, false);
            a0Var.f59698c2.G();
        } else if (view instanceof yg.h) {
            Context context = h2Var.getContext();
            long j3 = a0Var.f59703i2;
            wg.u uVar = new wg.u(a0Var);
            org.telegram.ui.ActionBar.i6 i6Var = a0Var.J0;
            org.telegram.ui.Components.y4 y4Var = new org.telegram.ui.Components.y4(i6Var);
            hi.w4 w4Var = new hi.w4(context, i6Var);
            ((org.telegram.ui.ActionBar.x2) w4Var.f15642b).f30228w0 = false;
            sb0 sb0Var = new sb0(context, i6Var);
            int i16 = y4Var.f42288a;
            sb0Var.setTextColor(i16);
            sb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
            sb0Var.setItemCount(5);
            ?? sb0Var2 = new sb0(context, i6Var);
            sb0Var2.setWrapSelectorWheel(true);
            sb0Var2.setAllItemsCount(24);
            sb0Var2.setItemCount(5);
            sb0Var2.setTextColor(i16);
            sb0Var2.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
            sb0Var2.setTag("HOUR");
            ?? sb0Var3 = new sb0(context, i6Var);
            sb0Var3.setWrapSelectorWheel(true);
            sb0Var3.setAllItemsCount(60);
            sb0Var3.setItemCount(5);
            sb0Var3.setTextColor(i16);
            sb0Var3.setTextOffset(-org.telegram.messenger.g0.L(34.0f));
            org.telegram.ui.Components.e4 e4Var2 = new org.telegram.ui.Components.e4(context, y4Var, sb0Var, (wg.f) sb0Var2, (wg.g) sb0Var3);
            e4Var2.setOrientation(1);
            FrameLayout frameLayout = new FrameLayout(context);
            e4Var2.addView(frameLayout, ma.t(-1, -2, 51, 22, 0, 0, 4));
            TextView textView = new TextView(context);
            textView.setText(gd.M0(2131753285, "BoostingSelectDateTime"));
            textView.setTextColor(i16);
            i5.c.x(textView, 1, 20.0f);
            frameLayout.addView(textView, ma.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
            textView.setOnTouchListener(new gi.a(2));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setWeightSum(1.0f);
            e4Var2.addView(linearLayout, ma.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
            long currentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            int i17 = calendar.get(1);
            nb0 nb0Var = new nb0(context, 5);
            long j10 = mp.u1(j10.f24770t0).f25726p0 * 1000;
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(j10);
            int i18 = calendar2.get(6);
            calendar2.setTimeInMillis(System.currentTimeMillis());
            calendar2.add(14, (int) j10);
            int i19 = calendar2.get(11);
            int i20 = calendar.get(12);
            linearLayout.addView(sb0Var, ma.l(0.5f, 0, 270));
            sb0Var.setMinValue(0);
            sb0Var.setMaxValue(i18 - 1);
            sb0Var.setWrapSelectorWheel(false);
            sb0Var.setTag("DAY");
            sb0Var.setFormatter(new y00(currentTimeMillis, calendar, i17, 1));
            qb0 w3Var = new ki.w3(e4Var2, (wg.f) sb0Var2, (wg.g) sb0Var3, i19, i20, sb0Var);
            sb0Var.setOnValueChangedListener(w3Var);
            sb0Var2.setMinValue(0);
            sb0Var2.setMaxValue(23);
            linearLayout.addView((View) sb0Var2, ma.l(0.2f, 0, 270));
            sb0Var2.setFormatter(new ug.x(18));
            sb0Var2.setOnValueChangedListener(w3Var);
            sb0Var3.setMinValue(0);
            sb0Var3.setMaxValue(11);
            sb0Var3.setValue(0);
            sb0Var3.setFormatter(new ug.x(19));
            linearLayout.addView((View) sb0Var3, ma.l(0.3f, 0, 270));
            sb0Var3.setOnValueChangedListener(w3Var);
            if (j3 > 0) {
                e4Var = e4Var2;
                calendar.setTimeInMillis(System.currentTimeMillis());
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                calendar.set(11, 0);
                calendar.setTimeInMillis(j3);
                sb0Var3.setValue(calendar.get(12) / 5);
                sb0Var2.setValue(calendar.get(11));
                sb0Var.setValue((int) ((j3 - calendar.getTimeInMillis()) / 86400000));
                sb0Var.getValue();
                w3Var.n(sb0Var, sb0Var.getValue());
                sb0Var2.getValue();
                w3Var.n(sb0Var2, sb0Var2.getValue());
            } else {
                e4Var = e4Var2;
            }
            nb0Var.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
            nb0Var.setGravity(17);
            nb0Var.setTextColor(y4Var.f42293g);
            nb0Var.setTextSize(1, 14.0f);
            nb0Var.setTypeface(org.telegram.messenger.g0.o());
            nb0Var.setBackground(org.telegram.ui.ActionBar.b6.e(y4Var.h, 8.0f));
            nb0Var.setText(gd.M0(2131753541, "BoostingConfirm"));
            e4Var.addView(nb0Var, ma.t(-1, 48, 83, 16, 15, 16, 16));
            nb0Var.setOnClickListener(new org.telegram.ui.Components.v1(calendar, sb0Var, sb0Var2, sb0Var3, uVar, w4Var));
            org.telegram.ui.ActionBar.x2 x2Var = (org.telegram.ui.ActionBar.x2) w4Var.f15642b;
            x2Var.O = e4Var;
            x2Var.show();
            int i21 = y4Var.f42289b;
            x2Var.v0(i21);
            x2Var.P(i21);
            if (i0.a.h(i21) > 0.699999988079071d) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.messenger.g0.p3(x2Var, z10);
        } else if (view instanceof yg.b) {
            sg.h0 h0Var4 = a0Var.f59708n2;
            if (h0Var4 != null) {
                ((wg.w0) h0Var4.f57216b).i1(2, a0Var.Y1);
                ((wg.l) h0Var4.f57217c).f59786m1.A(1);
            }
        } else if (view instanceof yg.w) {
            TL_stars.TL_starsGiveawayOption option = ((yg.w) view).getOption();
            if (option != null) {
                a0Var.f59706l2 = option.stars;
                a0Var.l1(true, true);
                a0Var.k1(true);
                a0Var.c1();
            }
        } else if (view instanceof xa) {
            a0Var.f59701g2 = true;
            a0Var.l1(true, true);
        }
    }

    @Override
    public final void c(int r31, android.view.View r32) {
        throw new UnsupportedOperationException("Method not decompiled: fi.g4.c(int, android.view.View):void");
    }
}
