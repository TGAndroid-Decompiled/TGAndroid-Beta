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
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.np;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class v3 implements z10 {
    public final int f9590a = 1;
    public final int f9591b;
    public final int f9592c;
    public final int d;
    public final KeyEvent.Callback f9593e;
    public final Object f9594f;
    public final Object f9595g;

    public v3(int i7, int i10, org.telegram.ui.Components.m3 m3Var, org.telegram.ui.Components.o3 o3Var, int i11, org.telegram.ui.Components.n3 n3Var) {
        this.f9591b = i7;
        this.f9592c = i10;
        this.f9593e = m3Var;
        this.f9594f = o3Var;
        this.d = i11;
        this.f9595g = n3Var;
    }

    @Override
    public final void a(Object obj) {
        ?? r32;
        AlertDialog$Builder alertDialog$Builder;
        int i7;
        int i10;
        int L;
        boolean z10;
        int i11;
        String str;
        AlertDialog$Builder alertDialog$Builder2;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        int i12;
        int i13;
        int i14 = this.f9590a;
        Object obj2 = this.f9595g;
        int i15 = this.d;
        Object obj3 = this.f9594f;
        KeyEvent.Callback callback = this.f9593e;
        int i16 = this.f9592c;
        int i17 = this.f9591b;
        int i18 = 0;
        switch (i14) {
            case 0:
                final c6 c6Var = (c6) callback;
                final wg.c1[] c1VarArr = (wg.c1[]) obj3;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj2;
                Long l10 = (Long) obj;
                if (l10.longValue() != -99 && l10.longValue() != -98) {
                    aa.r rVar = new aa.r(c6Var, l10, c1VarArr, 14);
                    if (l10.longValue() < 0) {
                        TLRPC.ChatFull N0 = np.s1(c6Var.f29679a).N0(-l10.longValue());
                        if (N0 == null) {
                            TLRPC.TL_channels_getFullChannel tL_channels_getFullChannel = new TLRPC.TL_channels_getFullChannel();
                            tL_channels_getFullChannel.channel = np.s1(c6Var.f29679a).h1(-l10.longValue());
                            ConnectionsManager.getInstance(c6Var.f29679a).sendRequest(tL_channels_getFullChannel, new bi.v2(5, c6Var, rVar));
                            return;
                        } else if (!N0.stargifts_available) {
                            alertDialog$Builder2 = new AlertDialog$Builder(0, c6Var.getContext(), c6Var.J0);
                            String M0 = hd.M0(2131750262, null);
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder2.f28392a;
                            t1Var.S = M0;
                            t1Var.U = hd.M0(2131750263, null);
                        }
                    } else if (l10.longValue() >= 0) {
                        TLRPC.User a22 = np.s1(c6Var.f29679a).a2(l10);
                        TLRPC.UserFull b22 = np.s1(c6Var.f29679a).b2(l10.longValue());
                        if (b22 != null && (disallowedGiftsSettings = b22.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_unique_stargifts) {
                            i20.t(hd.a0(null, null, 2131743742, org.telegram.messenger.m5.t(l10.longValue())), new org.telegram.ui.Components.cc(c1VarArr[0].f29685c, c6Var.J0), 2131624012, 36);
                            return;
                        } else if (b22 == null && a22 != null) {
                            TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                            tL_users_getFullUser.f28193id = np.s1(c6Var.f29679a).q1(a22);
                            ConnectionsManager.getInstance(c6Var.f29679a).sendRequest(tL_users_getFullUser, new bi.l1(c6Var, c1VarArr, l10, rVar, 1));
                            return;
                        }
                    }
                    rVar.run();
                    return;
                } else if (i17 < i16) {
                    alertDialog$Builder2 = new AlertDialog$Builder(0, c6Var.getContext(), c6Var.J0);
                    String M02 = hd.M0(2131750207, null);
                    org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28392a;
                    t1Var2.S = M02;
                    t1Var2.U = hd.G(Math.max(1, i15), "Gift2ExportTONUnlocksAlertText", new Object[0]);
                } else {
                    if (l10.longValue() == -98) {
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, c6Var.getContext(), c6Var.J0);
                        String M03 = hd.M0(2131750104, null);
                        org.telegram.ui.ActionBar.t1 t1Var3 = alertDialog$Builder3.f28392a;
                        t1Var3.S = M03;
                        t1Var3.U = hd.M0(2131750103, null);
                        String t6 = org.telegram.ui.Wallet.l0.x(c6Var.f29679a).t();
                        LinearLayout linearLayout = new LinearLayout(c6Var.getContext());
                        linearLayout.setOrientation(1);
                        if (!TextUtils.isEmpty(t6)) {
                            TextView textView = new TextView(c6Var.getContext());
                            textView.setTypeface(org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
                            textView.setTextSize(1, 16.5f);
                            textView.setLetterSpacing(0.01818182f);
                            textView.setLineSpacing(org.telegram.messenger.g0.L(23.0f) - textView.getPaint().getFontMetricsInt(null), 1.0f);
                            textView.setIncludeFontPadding(false);
                            textView.setGravity(17);
                            textView.setPadding(0, org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f));
                            int i19 = org.telegram.ui.ActionBar.j6.f28957j5;
                            int w02 = org.telegram.ui.ActionBar.j6.w0(i19, c6Var.J0);
                            ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(20.0f), org.telegram.ui.ActionBar.j6.r1(0.045f, w02));
                            org.telegram.ui.ActionBar.m6 K = org.telegram.ui.ActionBar.q6.K(0.045f, i19);
                            org.telegram.ui.ActionBar.e6 e6Var = c6Var.J0;
                            textView.setBackground(d02);
                            org.telegram.ui.ActionBar.q6.j(textView, d02, K, null, e6Var);
                            int w03 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29107r5, c6Var.J0);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            int length = (t6.length() + 3) / 4;
                            for (int i20 = 0; i20 < length; i20++) {
                                if (i20 > 0) {
                                    if (i20 % 4 == 0) {
                                        str = "\n";
                                    } else {
                                        str = " ";
                                    }
                                    spannableStringBuilder.append((CharSequence) str);
                                }
                                int length2 = spannableStringBuilder.length();
                                int i21 = i20 * 4;
                                spannableStringBuilder.append((CharSequence) t6, i21, Math.min(t6.length(), i21 + 4));
                                if (((i20 / 4) + (i20 % 4)) % 2 == 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    i11 = w02;
                                } else {
                                    i11 = w03;
                                }
                                spannableStringBuilder.setSpan(new ForegroundColorSpan(i11), length2, spannableStringBuilder.length(), 33);
                            }
                            textView.setText(spannableStringBuilder);
                            linearLayout.addView(textView, c8.ja.k(20.0f, 0.0f, 20.0f, 14.0f, -1, -2));
                        }
                        TextView textView2 = new TextView(c6Var.getContext());
                        textView2.setTextSize(1, 15.0f);
                        org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.f28957j5, c6Var.J0);
                        org.telegram.messenger.k5.l(textView2, 17, null, 2131750108);
                        linearLayout.addView(textView2, c8.ja.k(24.0f, 0.0f, 24.0f, 0.0f, -1, -2));
                        LinearLayout linearLayout2 = new LinearLayout(c6Var.getContext());
                        linearLayout2.setOrientation(0);
                        linearLayout2.setGravity(16);
                        int i22 = org.telegram.ui.ActionBar.j6.f29107r5;
                        c6Var.l1(linearLayout2, 2131232361, 14, i22, hd.M0(2131745495, null), true);
                        c6Var.l1(linearLayout2, 2131231954, 15, org.telegram.ui.ActionBar.j6.Fi, hd.M0(2131743194, null), true);
                        c6Var.l1(linearLayout2, 2131231827, 14, i22, hd.M0(2131743170, null), false);
                        linearLayout.addView(linearLayout2, c8.ja.t(-2, -2, 1, 0, 7, 0, 3));
                        c6Var.f8345t3 = true;
                        org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, c6Var.getContext(), c6Var.J0);
                        int i23 = org.telegram.ui.ActionBar.j6.f28941i6;
                        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i23, c6Var.J0), 7, org.telegram.messenger.g0.L(12.0f));
                        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i23);
                        org.telegram.ui.ActionBar.e6 e6Var2 = c6Var.J0;
                        c2Var.setBackground(h02);
                        org.telegram.ui.ActionBar.q6.j(c2Var, h02, null, M, e6Var2);
                        c2Var.setMultiline(true);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c2Var.getCheckBoxView().getLayoutParams();
                        layoutParams.topMargin = 0;
                        if (hd.f24104a0) {
                            i7 = 5;
                        } else {
                            i7 = 3;
                        }
                        layoutParams.gravity = 16 | i7;
                        c2Var.getCheckBoxView().setLayoutParams(layoutParams);
                        c2Var.e(hd.M0(2131750138, null), "", true, false, false);
                        if (hd.f24104a0) {
                            i10 = org.telegram.messenger.g0.L(4.0f);
                        } else {
                            i10 = 0;
                        }
                        int L2 = org.telegram.messenger.g0.L(12.0f);
                        if (hd.f24104a0) {
                            L = 0;
                        } else {
                            L = org.telegram.messenger.g0.L(4.0f);
                        }
                        c2Var.setPadding(i10, L2, L, org.telegram.messenger.g0.L(12.0f));
                        c2Var.setOnClickListener(new ai.v2(12, c6Var, c2Var));
                        linearLayout.addView(c2Var, c8.ja.k(8.0f, 4.0f, 8.0f, 0.0f, -1, -2));
                        alertDialog$Builder3.o(linearLayout);
                        t1Var3.H = 20;
                        r32 = 0;
                        alertDialog$Builder3.k(hd.M0(2131750109, null), new org.telegram.ui.ActionBar.q1() {
                            @Override
                            public final void h(org.telegram.ui.ActionBar.t1 t1Var4, int i24) {
                                switch (r3) {
                                    case 0:
                                        vf.b h = t1Var4.h(i24, true, true);
                                        wg.c1 c1Var = c1VarArr[0];
                                        Objects.requireNonNull(c1Var);
                                        c6Var.s2(true, t1Var4, h, new wg.v0(c1Var, 11));
                                        return;
                                    default:
                                        vf.b h7 = t1Var4.h(i24, true, true);
                                        wg.c1 c1Var2 = c1VarArr[0];
                                        Objects.requireNonNull(c1Var2);
                                        c6Var.s2(false, t1Var4, h7, new wg.v0(c1Var2, 11));
                                        return;
                                }
                            }
                        });
                        alertDialog$Builder = alertDialog$Builder3;
                    } else {
                        LinearLayout linearLayout3 = new LinearLayout(c6Var.getContext());
                        linearLayout3.setOrientation(1);
                        linearLayout3.addView(new a5(c6Var.getContext(), tL_starGiftUnique), c8.ja.t(-1, -2, 48, 0, -4, 0, 0));
                        TextView textView3 = new TextView(c6Var.getContext());
                        int i24 = org.telegram.ui.ActionBar.j6.f28957j5;
                        org.telegram.messenger.k5.m(textView3, i24, c6Var.J0, 1, 20.0f);
                        textView3.setText(hd.M0(2131750212, null));
                        linearLayout3.addView(textView3, c8.ja.t(-1, -2, 48, 24, 4, 24, 14));
                        TextView textView4 = new TextView(c6Var.getContext());
                        org.telegram.ui.ActionBar.q6.U(textView4, i24, c6Var.J0);
                        textView4.setTextSize(1, 16.0f);
                        org.telegram.messenger.k5.q(null, null, 2131750213, new Object[]{c6Var.z1()}, textView4);
                        linearLayout3.addView(textView4, c8.ja.t(-1, -2, 48, 24, 0, 24, 4));
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, c6Var.getContext(), c6Var.J0);
                        alertDialog$Builder4.o(linearLayout3);
                        r32 = 0;
                        alertDialog$Builder4.k(hd.M0(2131750214, null), new org.telegram.ui.ActionBar.q1() {
                            @Override
                            public final void h(org.telegram.ui.ActionBar.t1 t1Var4, int i242) {
                                switch (r3) {
                                    case 0:
                                        vf.b h = t1Var4.h(i242, true, true);
                                        wg.c1 c1Var = c1VarArr[0];
                                        Objects.requireNonNull(c1Var);
                                        c6Var.s2(true, t1Var4, h, new wg.v0(c1Var, 11));
                                        return;
                                    default:
                                        vf.b h7 = t1Var4.h(i242, true, true);
                                        wg.c1 c1Var2 = c1VarArr[0];
                                        Objects.requireNonNull(c1Var2);
                                        c6Var.s2(false, t1Var4, h7, new wg.v0(c1Var2, 11));
                                        return;
                                }
                            }
                        });
                        alertDialog$Builder = alertDialog$Builder4;
                    }
                    i5.c.x(r32, 2131752589, alertDialog$Builder, r32);
                    return;
                }
                i5.c.C(null, 2131747831, alertDialog$Builder2, null);
                return;
            default:
                org.telegram.ui.Components.m3 m3Var = (org.telegram.ui.Components.m3) callback;
                org.telegram.ui.Components.o3 o3Var = (org.telegram.ui.Components.o3) obj3;
                org.telegram.ui.Components.n3 n3Var = (org.telegram.ui.Components.n3) obj2;
                Boolean bool = (Boolean) obj;
                int i25 = i17 % 60;
                int i26 = (i17 - i25) / 60;
                int i27 = i16 % 60;
                int i28 = (i16 - i27) / 60;
                int i29 = 59;
                if (i27 == 0 && i28 > 0) {
                    i28--;
                    i27 = 59;
                }
                if (bool.booleanValue()) {
                    i13 = m3Var.getValue();
                    i12 = o3Var.getValue();
                } else {
                    i12 = i15 % 60;
                    i13 = (i15 - i12) / 60;
                    if (i13 == 24) {
                        i13--;
                        i12 = 59;
                    }
                }
                m3Var.setMinValue(i26);
                m3Var.setMaxValue(i28);
                if (i13 > i28) {
                    m3Var.setValue(i28);
                    i13 = i28;
                } else if (i13 < i26) {
                    m3Var.setValue(i26);
                    i13 = i26;
                }
                if (i13 <= i26) {
                    o3Var.setMinValue(i25);
                    if (i26 == i28) {
                        i29 = i27;
                    }
                    o3Var.setMaxValue(i29);
                } else if (i13 >= i28) {
                    if (i26 == i28) {
                        i18 = i25;
                    }
                    o3Var.setMinValue(i18);
                    o3Var.setMaxValue(i27);
                } else if (i26 == i28) {
                    o3Var.setMinValue(i25);
                    o3Var.setMaxValue(i27);
                } else {
                    o3Var.setMinValue(0);
                    o3Var.setMaxValue(59);
                }
                if (i12 > o3Var.getMaxValue()) {
                    i12 = o3Var.getMaxValue();
                    o3Var.setValue(i12);
                } else if (i12 < o3Var.getMinValue()) {
                    i12 = o3Var.getMinValue();
                    o3Var.setValue(i12);
                }
                if (!bool.booleanValue()) {
                    m3Var.setValue(i13);
                    o3Var.setValue(i12);
                }
                n3Var.invalidate();
                return;
        }
    }

    public v3(c6 c6Var, int i7, int i10, int i11, wg.c1[] c1VarArr, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.f9593e = c6Var;
        this.f9591b = i7;
        this.f9592c = i10;
        this.d = i11;
        this.f9594f = c1VarArr;
        this.f9595g = tL_starGiftUnique;
    }
}
