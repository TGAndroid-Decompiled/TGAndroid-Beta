package fi;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.na;
import di.xa;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.ob0;
import org.telegram.ui.Components.qb0;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.x50;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ef0;
import org.telegram.ui.j90;
import org.telegram.ui.mb0;
import org.telegram.ui.re0;
import org.telegram.ui.x00;
public final class g4 implements qj0 {
    public final int f12017a;
    public final Object f12018b;
    public final Object f12019c;

    public g4(int i7, Object obj, Object obj2) {
        this.f12017a = i7;
        this.f12018b = obj;
        this.f12019c = obj2;
    }

    private final void a(int r9, android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: fi.g4.a(int, android.view.View):void");
    }

    private final void c(int i7, View view) {
        ef0 ef0Var = (ef0) this.f12018b;
        Context context = (Context) this.f12019c;
        HashMap hashMap = ef0Var.f47532l0;
        if (i7 == ef0Var.R) {
            TLRPC.User user = (TLRPC.User) hashMap.get(Long.valueOf(ef0Var.f47523e.admin_id));
            if (user != null) {
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user.f28641id);
                mp.u1(i10.f24637t0).e4(user, false, false);
                ef0Var.presentFragment(new ProfileActivity(bundle, null));
            }
        } else if (i7 == ef0Var.f47546y) {
            j90 j90Var = new j90(0, ef0Var.f47533n);
            j90Var.T = ef0Var.f47542t0;
            ef0Var.presentFragment(j90Var);
        } else {
            int i10 = ef0Var.E;
            if (i7 >= i10 && i7 < ef0Var.F) {
                x50 x50Var = new x50(context, (TLRPC.TL_chatInviteExported) ef0Var.f47530j0.get(i7 - i10), ef0Var.d, hashMap, ef0Var, ef0Var.f47533n, false, ef0Var.h);
                ef0Var.m0 = x50Var;
                x50Var.f41833f2 = ef0Var.f47537q0;
                x50Var.show();
                return;
            }
            int i11 = ef0Var.I;
            if (i7 >= i11 && i7 < ef0Var.J) {
                x50 x50Var2 = new x50(context, (TLRPC.TL_chatInviteExported) ef0Var.f47531k0.get(i7 - i11), ef0Var.d, hashMap, ef0Var, ef0Var.f47533n, false, ef0Var.h);
                ef0Var.m0 = x50Var2;
                x50Var2.show();
            } else if (i7 == ef0Var.O) {
                if (!ef0Var.f47522d0) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ef0Var.getParentActivity());
                    String N0 = gd.N0(2131751563, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                    t1Var.S = N0;
                    t1Var.U = gd.N0(2131751564, null);
                    alertDialog$Builder.k(gd.N0(2131751586, null), new re0(ef0Var));
                    alertDialog$Builder.h(gd.N0(2131752577, null), null);
                    ef0Var.showDialog(t1Var);
                }
            } else {
                int i12 = ef0Var.V;
                if (i7 >= i12 && i7 < ef0Var.W) {
                    TLRPC.TL_chatAdminWithInvites tL_chatAdminWithInvites = (TLRPC.TL_chatAdminWithInvites) ef0Var.f47534n0.get(i7 - i12);
                    if (hashMap.containsKey(Long.valueOf(tL_chatAdminWithInvites.admin_id))) {
                        ef0Var.getMessagesController().e4((TLRPC.User) hashMap.get(Long.valueOf(tL_chatAdminWithInvites.admin_id)), false, false);
                    }
                    ef0 ef0Var2 = new ef0(ef0Var.f47533n, tL_chatAdminWithInvites.invites_count, tL_chatAdminWithInvites.admin_id);
                    ef0Var2.m0(ef0Var.d, null);
                    ef0Var.presentFragment(ef0Var2);
                }
            }
        }
    }

    private final void d(int i7, View view) {
        org.telegram.ui.Components.e4 e4Var;
        boolean z10;
        s2.e eVar;
        boolean z11;
        wg.z zVar = (wg.z) this.f12018b;
        org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.f12019c;
        ArrayList arrayList = zVar.Z1;
        wg.s sVar = zVar.f59988u2;
        if (view instanceof yg.y) {
            yg.y yVar = (yg.y) view;
            int type = yVar.getType();
            boolean z12 = yVar.f31813e.h;
            boolean z13 = !z12;
            yVar.setChecked(z13);
            int i10 = yg.y.M;
            if (type == 0) {
                zVar.f59987t2 = z13;
                zVar.l1(false, false);
            } else if (type == 1) {
                yVar.setDivider(z13);
                zVar.f59986s2 = z13;
                zVar.l1(false, false);
                xg.b bVar = zVar.f59971c2;
                int i11 = 0;
                while (true) {
                    if (i11 >= bVar.f60601e.size()) {
                        break;
                    }
                    xg.a aVar = (xg.a) bVar.f60601e.get(i11);
                    if (aVar.f56712a == 15) {
                        int i12 = aVar.f60599l;
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
                zVar.f59971c2.G();
                if (!zVar.f59986s2) {
                    org.telegram.messenger.g0.h3(sVar, 250L);
                } else {
                    org.telegram.messenger.g0.r(sVar);
                }
            }
        }
        if (view instanceof yg.c) {
            if (view instanceof yg.d) {
                int selectedType = ((yg.d) view).getSelectedType();
                int i14 = yg.d.f61358w;
                if (selectedType != 2 && selectedType != 3) {
                    if (selectedType == 1) {
                        s2.e eVar2 = zVar.f59981n2;
                        if (eVar2 != null) {
                            ((wg.v0) eVar2.f56892b).i1(1, arrayList);
                            ((wg.l) eVar2.f56893c).f59895m1.C(1);
                        }
                    } else {
                        zVar.f59972e2 = selectedType;
                        zVar.l1(true, true);
                        zVar.k1(true);
                        zVar.c1();
                    }
                } else if (selectedType == 2 && zVar.d2 == selectedType) {
                    s2.e eVar3 = zVar.f59981n2;
                    if (eVar3 != null) {
                        ((wg.v0) eVar3.f56892b).i1(1, arrayList);
                        ((wg.l) eVar3.f56893c).f59895m1.C(1);
                        return;
                    }
                    return;
                } else {
                    zVar.d2 = selectedType;
                    zVar.l1(true, true);
                    zVar.k1(true);
                    zVar.c1();
                }
            } else {
                yg.c cVar = (yg.c) view;
                ek0 ek0Var = zVar.f39246o1;
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
            if (zVar.f59973f2 == selectedType2 && (eVar = zVar.f59981n2) != null) {
                ((wg.v0) eVar.f56892b).i1(3, zVar.f59969a2);
                ((wg.l) eVar.f56893c).f59895m1.C(1);
            }
            zVar.f59973f2 = selectedType2;
            zVar.l1(false, false);
        } else if (view instanceof yg.i) {
            zVar.f59975h2 = ((TLRPC.TL_premiumGiftCodeOption) ((yg.i) view).getGifCode()).months;
            zVar.l1(false, false);
            zVar.f59971c2.G();
        } else if (view instanceof yg.h) {
            Context context = g2Var.getContext();
            long j3 = zVar.f59976i2;
            wg.t tVar = new wg.t(zVar);
            org.telegram.ui.ActionBar.i6 i6Var = zVar.J0;
            org.telegram.ui.Components.y4 y4Var = new org.telegram.ui.Components.y4(i6Var);
            h6.o oVar = new h6.o(context, i6Var);
            ((org.telegram.ui.ActionBar.w2) oVar.f13936b).f30264w0 = false;
            qb0 qb0Var = new qb0(context, i6Var);
            int i16 = y4Var.f42316a;
            qb0Var.setTextColor(i16);
            qb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
            qb0Var.setItemCount(5);
            ?? qb0Var2 = new qb0(context, i6Var);
            qb0Var2.setWrapSelectorWheel(true);
            qb0Var2.setAllItemsCount(24);
            qb0Var2.setItemCount(5);
            qb0Var2.setTextColor(i16);
            qb0Var2.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
            qb0Var2.setTag("HOUR");
            ?? qb0Var3 = new qb0(context, i6Var);
            qb0Var3.setWrapSelectorWheel(true);
            qb0Var3.setAllItemsCount(60);
            qb0Var3.setItemCount(5);
            qb0Var3.setTextColor(i16);
            qb0Var3.setTextOffset(-org.telegram.messenger.g0.L(34.0f));
            org.telegram.ui.Components.e4 e4Var2 = new org.telegram.ui.Components.e4(context, y4Var, qb0Var, (wg.f) qb0Var2, (wg.g) qb0Var3);
            e4Var2.setOrientation(1);
            FrameLayout frameLayout = new FrameLayout(context);
            e4Var2.addView(frameLayout, na.t(-1, -2, 51, 22, 0, 0, 4));
            TextView textView = new TextView(context);
            textView.setText(gd.N0(2131753284, "BoostingSelectDateTime"));
            textView.setTextColor(i16);
            i5.c.x(textView, 1, 20.0f);
            frameLayout.addView(textView, na.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
            textView.setOnTouchListener(new gi.a(2));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setWeightSum(1.0f);
            e4Var2.addView(linearLayout, na.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
            long currentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            int i17 = calendar.get(1);
            mb0 mb0Var = new mb0(context, 5);
            long j10 = mp.u1(i10.f24637t0).f25821p0 * 1000;
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(j10);
            int i18 = calendar2.get(6);
            calendar2.setTimeInMillis(System.currentTimeMillis());
            calendar2.add(14, (int) j10);
            int i19 = calendar2.get(11);
            int i20 = calendar.get(12);
            linearLayout.addView(qb0Var, na.l(0.5f, 0, 270));
            qb0Var.setMinValue(0);
            qb0Var.setMaxValue(i18 - 1);
            qb0Var.setWrapSelectorWheel(false);
            qb0Var.setTag("DAY");
            qb0Var.setFormatter(new x00(currentTimeMillis, calendar, i17, 1));
            ob0 w3Var = new ki.w3(e4Var2, (wg.f) qb0Var2, (wg.g) qb0Var3, i19, i20, qb0Var);
            qb0Var.setOnValueChangedListener(w3Var);
            qb0Var2.setMinValue(0);
            qb0Var2.setMaxValue(23);
            linearLayout.addView((View) qb0Var2, na.l(0.2f, 0, 270));
            qb0Var2.setFormatter(new ug.x(18));
            qb0Var2.setOnValueChangedListener(w3Var);
            qb0Var3.setMinValue(0);
            qb0Var3.setMaxValue(11);
            qb0Var3.setValue(0);
            qb0Var3.setFormatter(new ug.x(19));
            linearLayout.addView((View) qb0Var3, na.l(0.3f, 0, 270));
            qb0Var3.setOnValueChangedListener(w3Var);
            if (j3 > 0) {
                e4Var = e4Var2;
                calendar.setTimeInMillis(System.currentTimeMillis());
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                calendar.set(11, 0);
                calendar.setTimeInMillis(j3);
                qb0Var3.setValue(calendar.get(12) / 5);
                qb0Var2.setValue(calendar.get(11));
                qb0Var.setValue((int) ((j3 - calendar.getTimeInMillis()) / 86400000));
                qb0Var.getValue();
                w3Var.o(qb0Var, qb0Var.getValue());
                qb0Var2.getValue();
                w3Var.o(qb0Var2, qb0Var2.getValue());
            } else {
                e4Var = e4Var2;
            }
            mb0Var.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
            mb0Var.setGravity(17);
            mb0Var.setTextColor(y4Var.f42321g);
            mb0Var.setTextSize(1, 14.0f);
            mb0Var.setTypeface(org.telegram.messenger.g0.o());
            mb0Var.setBackground(org.telegram.ui.ActionBar.b6.e(y4Var.h, 8.0f));
            mb0Var.setText(gd.N0(2131753540, "BoostingConfirm"));
            e4Var.addView(mb0Var, na.t(-1, 48, 83, 16, 15, 16, 16));
            mb0Var.setOnClickListener(new org.telegram.ui.Components.v1(calendar, qb0Var, qb0Var2, qb0Var3, tVar, oVar));
            org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) oVar.f13936b;
            w2Var.O = e4Var;
            w2Var.show();
            int i21 = y4Var.f42317b;
            w2Var.v0(i21);
            w2Var.P(i21);
            if (i0.a.h(i21) > 0.699999988079071d) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.messenger.g0.p3(w2Var, z10);
        } else if (view instanceof yg.b) {
            s2.e eVar4 = zVar.f59981n2;
            if (eVar4 != null) {
                ((wg.v0) eVar4.f56892b).i1(2, zVar.Y1);
                ((wg.l) eVar4.f56893c).f59895m1.C(1);
            }
        } else if (view instanceof yg.w) {
            TL_stars.TL_starsGiveawayOption option = ((yg.w) view).getOption();
            if (option != null) {
                zVar.f59979l2 = option.stars;
                zVar.l1(true, true);
                zVar.k1(true);
                zVar.c1();
            }
        } else if (view instanceof xa) {
            zVar.f59974g2 = true;
            zVar.l1(true, true);
        }
    }

    @Override
    public final void b(int r31, android.view.View r32) {
        throw new UnsupportedOperationException("Method not decompiled: fi.g4.b(int, android.view.View):void");
    }
}
