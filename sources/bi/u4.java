package bi;

import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import org.telegram.messenger.c20;
import org.telegram.messenger.qp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class u4 implements c20 {
    public final int f4799a = 1;
    public final int f4800b;
    public final int f4801c;
    public final int d;
    public final KeyEvent.Callback f4802e;
    public final Object f4803f;
    public final Object f4804g;

    public u4(int i7, int i10, org.telegram.ui.Components.o3 o3Var, org.telegram.ui.Components.q3 q3Var, int i11, org.telegram.ui.Components.p3 p3Var) {
        this.f4800b = i7;
        this.f4801c = i10;
        this.f4802e = o3Var;
        this.f4803f = q3Var;
        this.d = i11;
        this.f4804g = p3Var;
    }

    @Override
    public final void a(Object obj) {
        ?? r32;
        AlertDialog$Builder alertDialog$Builder;
        int i7;
        int i10;
        int i11;
        int L;
        boolean z9;
        int i12;
        String str;
        AlertDialog$Builder alertDialog$Builder2;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        int i13;
        int i14;
        int i15 = this.f4799a;
        Object obj2 = this.f4804g;
        int i16 = this.d;
        Object obj3 = this.f4803f;
        KeyEvent.Callback callback = this.f4802e;
        int i17 = this.f4801c;
        int i18 = this.f4800b;
        int i19 = 0;
        switch (i15) {
            case 0:
                final k7 k7Var = (k7) callback;
                final wg.f1[] f1VarArr = (wg.f1[]) obj3;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj2;
                Long l10 = (Long) obj;
                if (l10.longValue() != -99 && l10.longValue() != -98) {
                    aa.s sVar = new aa.s(k7Var, l10, f1VarArr, 8);
                    if (l10.longValue() < 0) {
                        TLRPC.ChatFull N0 = qp.s1(k7Var.f28616a).N0(-l10.longValue());
                        if (N0 == null) {
                            TLRPC.TL_channels_getFullChannel tL_channels_getFullChannel = new TLRPC.TL_channels_getFullChannel();
                            tL_channels_getFullChannel.channel = qp.s1(k7Var.f28616a).h1(-l10.longValue());
                            ConnectionsManager.getInstance(k7Var.f28616a).sendRequest(tL_channels_getFullChannel, new j(3, k7Var, sVar));
                            return;
                        } else if (!N0.stargifts_available) {
                            alertDialog$Builder2 = new AlertDialog$Builder(0, k7Var.getContext(), k7Var.I0);
                            String M0 = org.telegram.messenger.id.M0(2131750263, null);
                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder2.f27296a;
                            u1Var.R = M0;
                            u1Var.T = org.telegram.messenger.id.M0(2131750264, null);
                        }
                    } else if (l10.longValue() >= 0) {
                        TLRPC.User a22 = qp.s1(k7Var.f28616a).a2(l10);
                        TLRPC.UserFull b22 = qp.s1(k7Var.f28616a).b2(l10.longValue());
                        if (b22 != null && (disallowedGiftsSettings = b22.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_unique_stargifts) {
                            org.telegram.messenger.camera.q.s(org.telegram.messenger.id.a0(null, null, 2131743745, org.telegram.messenger.m5.t(l10.longValue())), new org.telegram.ui.Components.hc(f1VarArr[0].f28622c, k7Var.I0), 2131624011, 36);
                            return;
                        } else if (b22 == null && a22 != null) {
                            TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                            tL_users_getFullUser.f27098id = qp.s1(k7Var.f28616a).q1(a22);
                            ConnectionsManager.getInstance(k7Var.f28616a).sendRequest(tL_users_getFullUser, new g2(k7Var, f1VarArr, l10, sVar, 0));
                            return;
                        }
                    }
                    sVar.run();
                    return;
                } else if (i18 < i17) {
                    alertDialog$Builder2 = new AlertDialog$Builder(0, k7Var.getContext(), k7Var.I0);
                    String M02 = org.telegram.messenger.id.M0(2131750208, null);
                    org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27296a;
                    u1Var2.R = M02;
                    u1Var2.T = org.telegram.messenger.id.G(Math.max(1, i16), "Gift2ExportTONUnlocksAlertText", new Object[0]);
                } else {
                    if (l10.longValue() == -98) {
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, k7Var.getContext(), k7Var.I0);
                        String M03 = org.telegram.messenger.id.M0(2131750105, null);
                        org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder3.f27296a;
                        u1Var3.R = M03;
                        u1Var3.T = org.telegram.messenger.id.M0(2131750104, null);
                        String t6 = org.telegram.ui.Wallet.m0.x(k7Var.f28616a).t();
                        LinearLayout linearLayout = new LinearLayout(k7Var.getContext());
                        linearLayout.setOrientation(1);
                        if (!TextUtils.isEmpty(t6)) {
                            TextView textView = new TextView(k7Var.getContext());
                            textView.setTypeface(org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
                            textView.setTextSize(1, 16.5f);
                            textView.setLetterSpacing(0.01818182f);
                            i7 = 3;
                            textView.setLineSpacing(org.telegram.messenger.g0.L(23.0f) - textView.getPaint().getFontMetricsInt(null), 1.0f);
                            textView.setIncludeFontPadding(false);
                            textView.setGravity(17);
                            textView.setPadding(0, org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f));
                            int i20 = org.telegram.ui.ActionBar.k6.f27960j5;
                            int w02 = org.telegram.ui.ActionBar.k6.w0(i20, k7Var.I0);
                            ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(20.0f), org.telegram.ui.ActionBar.k6.r1(0.045f, w02));
                            org.telegram.ui.ActionBar.n6 L2 = org.telegram.ui.ActionBar.r6.L(0.045f, i20);
                            org.telegram.ui.ActionBar.f6 f6Var = k7Var.I0;
                            textView.setBackground(d02);
                            org.telegram.ui.ActionBar.r6.k(textView, d02, L2, null, f6Var);
                            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28110r5, k7Var.I0);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            int length = (t6.length() + 3) / 4;
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
                                spannableStringBuilder.append((CharSequence) t6, i22, Math.min(t6.length(), i22 + 4));
                                if (((i21 / 4) + (i21 % 4)) % 2 == 0) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                if (z9) {
                                    i12 = w02;
                                } else {
                                    i12 = w03;
                                }
                                spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), length2, spannableStringBuilder.length(), 33);
                            }
                            textView.setText(spannableStringBuilder);
                            linearLayout.addView(textView, c8.ha.k(20.0f, 0.0f, 20.0f, 14.0f, -1, -2));
                        } else {
                            i7 = 3;
                        }
                        TextView textView2 = new TextView(k7Var.getContext());
                        textView2.setTextSize(1, 15.0f);
                        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f27960j5, k7Var.I0);
                        org.telegram.messenger.k5.m(textView2, 17, null, 2131750109);
                        linearLayout.addView(textView2, c8.ha.k(24.0f, 0.0f, 24.0f, 0.0f, -1, -2));
                        LinearLayout linearLayout2 = new LinearLayout(k7Var.getContext());
                        linearLayout2.setOrientation(0);
                        linearLayout2.setGravity(16);
                        int i23 = org.telegram.ui.ActionBar.k6.f28110r5;
                        k7Var.l1(linearLayout2, 2131232360, 14, i23, org.telegram.messenger.id.M0(2131745498, null), true);
                        k7Var.l1(linearLayout2, 2131231954, 15, org.telegram.ui.ActionBar.k6.Ci, org.telegram.messenger.id.M0(2131743197, null), true);
                        k7Var.l1(linearLayout2, 2131231827, 14, i23, org.telegram.messenger.id.M0(2131743173, null), false);
                        linearLayout.addView(linearLayout2, c8.ha.t(-2, -2, 1, 0, 7, 0, 3));
                        k7Var.f4193p3 = true;
                        org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, k7Var.getContext(), k7Var.I0);
                        int i24 = org.telegram.ui.ActionBar.k6.f27944i6;
                        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i24, k7Var.I0), 7, org.telegram.messenger.g0.L(12.0f));
                        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i24);
                        org.telegram.ui.ActionBar.f6 f6Var2 = k7Var.I0;
                        c2Var.setBackground(h02);
                        org.telegram.ui.ActionBar.r6.k(c2Var, h02, null, N, f6Var2);
                        c2Var.setMultiline(true);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c2Var.getCheckBoxView().getLayoutParams();
                        layoutParams.topMargin = 0;
                        if (org.telegram.messenger.id.f23157a0) {
                            i10 = 5;
                        } else {
                            i10 = i7;
                        }
                        layoutParams.gravity = 16 | i10;
                        c2Var.getCheckBoxView().setLayoutParams(layoutParams);
                        c2Var.e(org.telegram.messenger.id.M0(2131750139, null), "", true, false, false);
                        if (org.telegram.messenger.id.f23157a0) {
                            i11 = org.telegram.messenger.g0.L(4.0f);
                        } else {
                            i11 = 0;
                        }
                        int L3 = org.telegram.messenger.g0.L(12.0f);
                        if (org.telegram.messenger.id.f23157a0) {
                            L = 0;
                        } else {
                            L = org.telegram.messenger.g0.L(4.0f);
                        }
                        c2Var.setPadding(i11, L3, L, org.telegram.messenger.g0.L(12.0f));
                        c2Var.setOnClickListener(new r(5, k7Var, c2Var));
                        linearLayout.addView(c2Var, c8.ha.k(8.0f, 4.0f, 8.0f, 0.0f, -1, -2));
                        alertDialog$Builder3.o(linearLayout);
                        u1Var3.G = 20;
                        r32 = 0;
                        alertDialog$Builder3.k(org.telegram.messenger.id.M0(2131750110, null), new org.telegram.ui.ActionBar.r1() {
                            @Override
                            public final void g(org.telegram.ui.ActionBar.u1 u1Var4, int i25) {
                                switch (r3) {
                                    case 0:
                                        vf.b h = u1Var4.h(i25, true, true);
                                        wg.f1 f1Var = f1VarArr[0];
                                        Objects.requireNonNull(f1Var);
                                        k7Var.r2(true, u1Var4, h, new wg.x0(f1Var, 11));
                                        return;
                                    default:
                                        vf.b h7 = u1Var4.h(i25, true, true);
                                        wg.f1 f1Var2 = f1VarArr[0];
                                        Objects.requireNonNull(f1Var2);
                                        k7Var.r2(false, u1Var4, h7, new wg.x0(f1Var2, 11));
                                        return;
                                }
                            }
                        });
                        alertDialog$Builder = alertDialog$Builder3;
                    } else {
                        LinearLayout linearLayout3 = new LinearLayout(k7Var.getContext());
                        linearLayout3.setOrientation(1);
                        linearLayout3.addView(new f6(k7Var.getContext(), tL_starGiftUnique), c8.ha.t(-1, -2, 48, 0, -4, 0, 0));
                        TextView textView3 = new TextView(k7Var.getContext());
                        int i25 = org.telegram.ui.ActionBar.k6.f27960j5;
                        org.telegram.messenger.k5.n(textView3, i25, k7Var.I0, 1, 20.0f);
                        textView3.setText(org.telegram.messenger.id.M0(2131750213, null));
                        linearLayout3.addView(textView3, c8.ha.t(-1, -2, 48, 24, 4, 24, 14));
                        TextView textView4 = new TextView(k7Var.getContext());
                        org.telegram.ui.ActionBar.r6.V(textView4, i25, k7Var.I0);
                        textView4.setTextSize(1, 16.0f);
                        org.telegram.messenger.k5.r(null, null, 2131750214, new Object[]{k7Var.z1()}, textView4);
                        linearLayout3.addView(textView4, c8.ha.t(-1, -2, 48, 24, 0, 24, 4));
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, k7Var.getContext(), k7Var.I0);
                        alertDialog$Builder4.o(linearLayout3);
                        r32 = 0;
                        alertDialog$Builder4.k(org.telegram.messenger.id.M0(2131750215, null), new org.telegram.ui.ActionBar.r1() {
                            @Override
                            public final void g(org.telegram.ui.ActionBar.u1 u1Var4, int i252) {
                                switch (r3) {
                                    case 0:
                                        vf.b h = u1Var4.h(i252, true, true);
                                        wg.f1 f1Var = f1VarArr[0];
                                        Objects.requireNonNull(f1Var);
                                        k7Var.r2(true, u1Var4, h, new wg.x0(f1Var, 11));
                                        return;
                                    default:
                                        vf.b h7 = u1Var4.h(i252, true, true);
                                        wg.f1 f1Var2 = f1VarArr[0];
                                        Objects.requireNonNull(f1Var2);
                                        k7Var.r2(false, u1Var4, h7, new wg.x0(f1Var2, 11));
                                        return;
                                }
                            }
                        });
                        alertDialog$Builder = alertDialog$Builder4;
                    }
                    jg.g.w(r32, 2131752589, alertDialog$Builder, r32);
                    return;
                }
                jg.g.C(null, 2131747832, alertDialog$Builder2, null);
                return;
            default:
                org.telegram.ui.Components.o3 o3Var = (org.telegram.ui.Components.o3) callback;
                org.telegram.ui.Components.q3 q3Var = (org.telegram.ui.Components.q3) obj3;
                org.telegram.ui.Components.p3 p3Var = (org.telegram.ui.Components.p3) obj2;
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
                    i14 = o3Var.getValue();
                    i13 = q3Var.getValue();
                } else {
                    i13 = i16 % 60;
                    i14 = (i16 - i13) / 60;
                    if (i14 == 24) {
                        i14--;
                        i13 = 59;
                    }
                }
                o3Var.setMinValue(i27);
                o3Var.setMaxValue(i29);
                if (i14 > i29) {
                    o3Var.setValue(i29);
                    i14 = i29;
                } else if (i14 < i27) {
                    o3Var.setValue(i27);
                    i14 = i27;
                }
                if (i14 <= i27) {
                    q3Var.setMinValue(i26);
                    if (i27 == i29) {
                        i30 = i28;
                    }
                    q3Var.setMaxValue(i30);
                } else if (i14 >= i29) {
                    if (i27 == i29) {
                        i19 = i26;
                    }
                    q3Var.setMinValue(i19);
                    q3Var.setMaxValue(i28);
                } else if (i27 == i29) {
                    q3Var.setMinValue(i26);
                    q3Var.setMaxValue(i28);
                } else {
                    q3Var.setMinValue(0);
                    q3Var.setMaxValue(59);
                }
                if (i13 > q3Var.getMaxValue()) {
                    i13 = q3Var.getMaxValue();
                    q3Var.setValue(i13);
                } else if (i13 < q3Var.getMinValue()) {
                    i13 = q3Var.getMinValue();
                    q3Var.setValue(i13);
                }
                if (!bool.booleanValue()) {
                    o3Var.setValue(i14);
                    q3Var.setValue(i13);
                }
                p3Var.invalidate();
                return;
        }
    }

    public u4(k7 k7Var, int i7, int i10, int i11, wg.f1[] f1VarArr, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.f4802e = k7Var;
        this.f4800b = i7;
        this.f4801c = i10;
        this.d = i11;
        this.f4803f = f1VarArr;
        this.f4804g = tL_starGiftUnique;
    }
}
