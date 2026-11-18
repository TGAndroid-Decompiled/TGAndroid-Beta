package di;

import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class y3 implements x10 {
    public final int f10061a = 1;
    public final int f10062b;
    public final int f10063c;
    public final int d;
    public final KeyEvent.Callback f10064e;
    public final Object f10065f;
    public final Object f10066g;

    public y3(int i7, int i10, org.telegram.ui.Components.u3 u3Var, org.telegram.ui.Components.w3 w3Var, int i11, org.telegram.ui.Components.v3 v3Var) {
        this.f10062b = i7;
        this.f10063c = i10;
        this.f10064e = u3Var;
        this.f10065f = w3Var;
        this.d = i11;
        this.f10066g = v3Var;
    }

    @Override
    public final void a(Object obj) {
        ?? r32;
        AlertDialog$Builder alertDialog$Builder;
        int i7;
        int i10;
        int i11;
        int L;
        boolean z10;
        int i12;
        String str;
        AlertDialog$Builder alertDialog$Builder2;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        int i13;
        int i14;
        int i15 = this.f10061a;
        Object obj2 = this.f10066g;
        int i16 = this.d;
        Object obj3 = this.f10065f;
        KeyEvent.Callback callback = this.f10064e;
        int i17 = this.f10063c;
        int i18 = this.f10062b;
        int i19 = 0;
        switch (i15) {
            case 0:
                final f6 f6Var = (f6) callback;
                final bi.a2[] a2VarArr = (bi.a2[]) obj3;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj2;
                Long l10 = (Long) obj;
                if (l10.longValue() != -99 && l10.longValue() != -98) {
                    aa.r rVar = new aa.r(f6Var, l10, a2VarArr, 18);
                    if (l10.longValue() < 0) {
                        TLRPC.ChatFull P0 = mp.u1(f6Var.f30187a).P0(-l10.longValue());
                        if (P0 == null) {
                            TLRPC.TL_channels_getFullChannel tL_channels_getFullChannel = new TLRPC.TL_channels_getFullChannel();
                            tL_channels_getFullChannel.channel = mp.u1(f6Var.f30187a).j1(-l10.longValue());
                            ConnectionsManager.getInstance(f6Var.f30187a).sendRequest(tL_channels_getFullChannel, new bi.k1(6, f6Var, rVar));
                            return;
                        } else if (!P0.stargifts_available) {
                            alertDialog$Builder2 = new AlertDialog$Builder(0, f6Var.getContext(), f6Var.J0);
                            String M0 = gd.M0(2131750246, null);
                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder2.f28744a;
                            u1Var.S = M0;
                            u1Var.U = gd.M0(2131750247, null);
                        }
                    } else if (l10.longValue() >= 0) {
                        TLRPC.User c22 = mp.u1(f6Var.f30187a).c2(l10);
                        TLRPC.UserFull d2 = mp.u1(f6Var.f30187a).d2(l10.longValue());
                        if (d2 != null && (disallowedGiftsSettings = d2.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_unique_stargifts) {
                            n10.u(gd.a0(null, null, 2131743505, org.telegram.messenger.n5.t(l10.longValue())), new org.telegram.ui.Components.lc(a2VarArr[0].f30193c, f6Var.J0), 2131624012, 36);
                            return;
                        } else if (d2 == null && c22 != null) {
                            TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                            tL_users_getFullUser.f28545id = mp.u1(f6Var.f30187a).s1(c22);
                            ConnectionsManager.getInstance(f6Var.f30187a).sendRequest(tL_users_getFullUser, new bi.g2(f6Var, a2VarArr, l10, rVar, 1));
                            return;
                        }
                    }
                    rVar.run();
                    return;
                } else if (i18 < i17) {
                    alertDialog$Builder2 = new AlertDialog$Builder(0, f6Var.getContext(), f6Var.J0);
                    String M02 = gd.M0(2131750191, null);
                    org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f28744a;
                    u1Var2.S = M02;
                    u1Var2.U = gd.G(Math.max(1, i16), "Gift2ExportTONUnlocksAlertText", new Object[0]);
                } else {
                    if (l10.longValue() == -98) {
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, f6Var.getContext(), f6Var.J0);
                        String M03 = gd.M0(2131750088, null);
                        org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder3.f28744a;
                        u1Var3.S = M03;
                        u1Var3.U = gd.M0(2131750087, null);
                        String y10 = org.telegram.ui.Wallet.u0.D(f6Var.f30187a).y();
                        LinearLayout linearLayout = new LinearLayout(f6Var.getContext());
                        linearLayout.setOrientation(1);
                        if (!TextUtils.isEmpty(y10)) {
                            TextView textView = new TextView(f6Var.getContext());
                            textView.setTypeface(org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
                            textView.setTextSize(1, 16.5f);
                            textView.setLetterSpacing(0.01818182f);
                            i7 = 3;
                            textView.setLineSpacing(org.telegram.messenger.g0.L(23.0f) - textView.getPaint().getFontMetricsInt(null), 1.0f);
                            textView.setIncludeFontPadding(false);
                            textView.setGravity(17);
                            textView.setPadding(0, org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f));
                            int i20 = org.telegram.ui.ActionBar.n6.f29502j5;
                            int w02 = org.telegram.ui.ActionBar.n6.w0(i20, f6Var.J0);
                            ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(20.0f), org.telegram.ui.ActionBar.n6.r1(0.045f, w02));
                            org.telegram.ui.ActionBar.q6 K = org.telegram.ui.ActionBar.u6.K(0.045f, i20);
                            org.telegram.ui.ActionBar.i6 i6Var = f6Var.J0;
                            textView.setBackground(d02);
                            org.telegram.ui.ActionBar.u6.j(textView, d02, K, null, i6Var);
                            int w03 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29652r5, f6Var.J0);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            int length = (y10.length() + 3) / 4;
                            for (int i21 = 0; i21 < length; i21++) {
                                if (i21 > 0) {
                                    if (i21 % 4 == 0) {
                                        str = "\n";
                                    } else {
                                        str = " ";
                                    }
                                    spannableStringBuilder.append((CharSequence) str);
                                }
                                int length2 = spannableStringBuilder.length();
                                int i22 = i21 * 4;
                                spannableStringBuilder.append((CharSequence) y10, i22, Math.min(y10.length(), i22 + 4));
                                if (((i21 / 4) + (i21 % 4)) % 2 == 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    i12 = w02;
                                } else {
                                    i12 = w03;
                                }
                                spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), length2, spannableStringBuilder.length(), 33);
                            }
                            textView.setText(spannableStringBuilder);
                            linearLayout.addView(textView, c8.ma.k(20.0f, 0.0f, 20.0f, 14.0f, -1, -2));
                        } else {
                            i7 = 3;
                        }
                        TextView textView2 = new TextView(f6Var.getContext());
                        textView2.setTextSize(1, 15.0f);
                        org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.f29502j5, f6Var.J0);
                        org.telegram.messenger.f3.k(textView2, 17, null, 2131750092);
                        linearLayout.addView(textView2, c8.ma.k(24.0f, 0.0f, 24.0f, 0.0f, -1, -2));
                        LinearLayout linearLayout2 = new LinearLayout(f6Var.getContext());
                        linearLayout2.setOrientation(0);
                        linearLayout2.setGravity(16);
                        int i23 = org.telegram.ui.ActionBar.n6.f29652r5;
                        r32 = 0;
                        f6Var.n1(linearLayout2, 2131232362, 14, i23, gd.M0(2131745300, null), true);
                        f6Var.n1(linearLayout2, 2131231955, 15, org.telegram.ui.ActionBar.n6.Fi, gd.M0(2131742956, null), true);
                        f6Var.n1(linearLayout2, 2131231828, 14, i23, gd.M0(2131742932, null), false);
                        linearLayout.addView(linearLayout2, c8.ma.t(-2, -2, 1, 0, 7, 0, 3));
                        f6Var.f8811w3 = true;
                        org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(1, f6Var.getContext(), f6Var.J0);
                        int i24 = org.telegram.ui.ActionBar.n6.f29486i6;
                        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i24, f6Var.J0), 7, org.telegram.messenger.g0.L(12.0f));
                        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i24);
                        org.telegram.ui.ActionBar.i6 i6Var2 = f6Var.J0;
                        d2Var.setBackground(h02);
                        org.telegram.ui.ActionBar.u6.j(d2Var, h02, null, M, i6Var2);
                        d2Var.setMultiline(true);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) d2Var.getCheckBoxView().getLayoutParams();
                        layoutParams.topMargin = 0;
                        if (gd.f24213a0) {
                            i10 = 5;
                        } else {
                            i10 = i7;
                        }
                        layoutParams.gravity = 16 | i10;
                        d2Var.getCheckBoxView().setLayoutParams(layoutParams);
                        d2Var.e(gd.M0(2131750122, null), "", true, false, false);
                        if (gd.f24213a0) {
                            i11 = org.telegram.messenger.g0.L(4.0f);
                        } else {
                            i11 = 0;
                        }
                        int L2 = org.telegram.messenger.g0.L(12.0f);
                        if (gd.f24213a0) {
                            L = 0;
                        } else {
                            L = org.telegram.messenger.g0.L(4.0f);
                        }
                        d2Var.setPadding(i11, L2, L, org.telegram.messenger.g0.L(12.0f));
                        d2Var.setOnClickListener(new ai.v2(14, f6Var, d2Var));
                        linearLayout.addView(d2Var, c8.ma.k(8.0f, 4.0f, 8.0f, 0.0f, -1, -2));
                        alertDialog$Builder3.o(linearLayout);
                        u1Var3.H = 20;
                        alertDialog$Builder3.k(gd.M0(2131750093, null), new org.telegram.ui.ActionBar.r1() {
                            @Override
                            public final void h(org.telegram.ui.ActionBar.u1 u1Var4, int i25) {
                                switch (r3) {
                                    case 0:
                                        vf.b h = u1Var4.h(i25, true, true);
                                        bi.a2 a2Var = a2VarArr[0];
                                        Objects.requireNonNull(a2Var);
                                        f6Var.G2(true, u1Var4, h, new bi.j1(a2Var, 1));
                                        return;
                                    default:
                                        vf.b h7 = u1Var4.h(i25, true, true);
                                        bi.a2 a2Var2 = a2VarArr[0];
                                        Objects.requireNonNull(a2Var2);
                                        f6Var.G2(false, u1Var4, h7, new bi.j1(a2Var2, 1));
                                        return;
                                }
                            }
                        });
                        alertDialog$Builder = alertDialog$Builder3;
                    } else {
                        r32 = 0;
                        LinearLayout linearLayout3 = new LinearLayout(f6Var.getContext());
                        linearLayout3.setOrientation(1);
                        linearLayout3.addView(new d5(f6Var.getContext(), tL_starGiftUnique), c8.ma.t(-1, -2, 48, 0, -4, 0, 0));
                        TextView textView3 = new TextView(f6Var.getContext());
                        int i25 = org.telegram.ui.ActionBar.n6.f29502j5;
                        org.telegram.messenger.f3.l(textView3, i25, f6Var.J0, 1, 20.0f);
                        textView3.setText(gd.M0(2131750196, null));
                        linearLayout3.addView(textView3, c8.ma.t(-1, -2, 48, 24, 4, 24, 14));
                        TextView textView4 = new TextView(f6Var.getContext());
                        org.telegram.ui.ActionBar.u6.U(textView4, i25, f6Var.J0);
                        textView4.setTextSize(1, 16.0f);
                        org.telegram.messenger.f3.q(null, null, 2131750197, new Object[]{f6Var.E1()}, textView4);
                        linearLayout3.addView(textView4, c8.ma.t(-1, -2, 48, 24, 0, 24, 4));
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, f6Var.getContext(), f6Var.J0);
                        alertDialog$Builder4.o(linearLayout3);
                        alertDialog$Builder4.k(gd.M0(2131750198, null), new org.telegram.ui.ActionBar.r1() {
                            @Override
                            public final void h(org.telegram.ui.ActionBar.u1 u1Var4, int i252) {
                                switch (r3) {
                                    case 0:
                                        vf.b h = u1Var4.h(i252, true, true);
                                        bi.a2 a2Var = a2VarArr[0];
                                        Objects.requireNonNull(a2Var);
                                        f6Var.G2(true, u1Var4, h, new bi.j1(a2Var, 1));
                                        return;
                                    default:
                                        vf.b h7 = u1Var4.h(i252, true, true);
                                        bi.a2 a2Var2 = a2VarArr[0];
                                        Objects.requireNonNull(a2Var2);
                                        f6Var.G2(false, u1Var4, h7, new bi.j1(a2Var2, 1));
                                        return;
                                }
                            }
                        });
                        alertDialog$Builder = alertDialog$Builder4;
                    }
                    i5.c.y(r32, 2131752578, alertDialog$Builder, r32);
                    return;
                }
                org.telegram.messenger.f3.m(null, 2131747638, alertDialog$Builder2, null);
                return;
            default:
                org.telegram.ui.Components.u3 u3Var = (org.telegram.ui.Components.u3) callback;
                org.telegram.ui.Components.w3 w3Var = (org.telegram.ui.Components.w3) obj3;
                org.telegram.ui.Components.v3 v3Var = (org.telegram.ui.Components.v3) obj2;
                Boolean bool = (Boolean) obj;
                int i26 = i18 % 60;
                int i27 = (i18 - i26) / 60;
                int i28 = i17 % 60;
                int i29 = (i17 - i28) / 60;
                int i30 = 59;
                if (i28 == 0 && i29 > 0) {
                    i29--;
                    i28 = 59;
                }
                if (bool.booleanValue()) {
                    i14 = u3Var.getValue();
                    i13 = w3Var.getValue();
                } else {
                    i13 = i16 % 60;
                    i14 = (i16 - i13) / 60;
                    if (i14 == 24) {
                        i14--;
                        i13 = 59;
                    }
                }
                u3Var.setMinValue(i27);
                u3Var.setMaxValue(i29);
                if (i14 > i29) {
                    u3Var.setValue(i29);
                    i14 = i29;
                } else if (i14 < i27) {
                    u3Var.setValue(i27);
                    i14 = i27;
                }
                if (i14 <= i27) {
                    w3Var.setMinValue(i26);
                    if (i27 == i29) {
                        i30 = i28;
                    }
                    w3Var.setMaxValue(i30);
                } else if (i14 >= i29) {
                    if (i27 == i29) {
                        i19 = i26;
                    }
                    w3Var.setMinValue(i19);
                    w3Var.setMaxValue(i28);
                } else if (i27 == i29) {
                    w3Var.setMinValue(i26);
                    w3Var.setMaxValue(i28);
                } else {
                    w3Var.setMinValue(0);
                    w3Var.setMaxValue(59);
                }
                if (i13 > w3Var.getMaxValue()) {
                    i13 = w3Var.getMaxValue();
                    w3Var.setValue(i13);
                } else if (i13 < w3Var.getMinValue()) {
                    i13 = w3Var.getMinValue();
                    w3Var.setValue(i13);
                }
                if (!bool.booleanValue()) {
                    u3Var.setValue(i14);
                    w3Var.setValue(i13);
                }
                v3Var.invalidate();
                return;
        }
    }

    public y3(f6 f6Var, int i7, int i10, int i11, bi.a2[] a2VarArr, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.f10064e = f6Var;
        this.f10062b = i7;
        this.f10063c = i10;
        this.d = i11;
        this.f10065f = a2VarArr;
        this.f10066g = tL_starGiftUnique;
    }
}
