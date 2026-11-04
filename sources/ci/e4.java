package ci;

import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import j$.util.Objects;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.u10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class e4 implements u10 {
    public final int f5006a = 1;
    public final int f5007b;
    public final int f5008c;
    public final int d;
    public final KeyEvent.Callback f5009e;
    public final Object f5010f;
    public final Object f5011g;

    public e4(int i3, int i10, org.telegram.ui.Components.m3 m3Var, org.telegram.ui.Components.o3 o3Var, int i11, org.telegram.ui.Components.n3 n3Var) {
        this.f5007b = i3;
        this.f5008c = i10;
        this.f5009e = m3Var;
        this.f5010f = o3Var;
        this.d = i11;
        this.f5011g = n3Var;
    }

    @Override
    public final void a(Object obj) {
        ?? r32;
        AlertDialog$Builder alertDialog$Builder;
        int i3;
        int i10;
        int L;
        boolean z10;
        int i11;
        String str;
        AlertDialog$Builder alertDialog$Builder2;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        int i12;
        int i13;
        int i14 = this.f5006a;
        Object obj2 = this.f5011g;
        int i15 = this.d;
        Object obj3 = this.f5010f;
        KeyEvent.Callback callback = this.f5009e;
        int i16 = this.f5008c;
        int i17 = this.f5007b;
        int i18 = 0;
        switch (i14) {
            case 0:
                final l6 l6Var = (l6) callback;
                final xg.e1[] e1VarArr = (xg.e1[]) obj3;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj2;
                Long l10 = (Long) obj;
                if (l10.longValue() != -99 && l10.longValue() != -98) {
                    ai.k3 k3Var = new ai.k3(l6Var, l10, e1VarArr, 11);
                    if (l10.longValue() < 0) {
                        TLRPC.ChatFull N0 = hp.s1(l6Var.f28583a).N0(-l10.longValue());
                        if (N0 == null) {
                            TLRPC.TL_channels_getFullChannel tL_channels_getFullChannel = new TLRPC.TL_channels_getFullChannel();
                            tL_channels_getFullChannel.channel = hp.s1(l6Var.f28583a).h1(-l10.longValue());
                            ConnectionsManager.getInstance(l6Var.f28583a).sendRequest(tL_channels_getFullChannel, new ai.f3(5, l6Var, k3Var));
                            return;
                        } else if (!N0.stargifts_available) {
                            alertDialog$Builder2 = new AlertDialog$Builder(0, l6Var.getContext(), l6Var.J0);
                            String M0 = bd.M0(2131750270, null);
                            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder2.f27343a;
                            s1Var.S = M0;
                            s1Var.U = bd.M0(2131750271, null);
                        }
                    } else if (l10.longValue() >= 0) {
                        TLRPC.User a22 = hp.s1(l6Var.f28583a).a2(l10);
                        TLRPC.UserFull b22 = hp.s1(l6Var.f28583a).b2(l10.longValue());
                        if (b22 != null && (disallowedGiftsSettings = b22.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_unique_stargifts) {
                            org.telegram.messenger.camera.q.s(bd.a0(null, null, 2131743752, org.telegram.messenger.m5.t(l10.longValue())), new org.telegram.ui.Components.fc(e1VarArr[0].f28589c, l6Var.J0), 2131624011, 36);
                            return;
                        } else if (b22 == null && a22 != null) {
                            TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                            tL_users_getFullUser.f27143id = hp.s1(l6Var.f28583a).q1(a22);
                            ConnectionsManager.getInstance(l6Var.f28583a).sendRequest(tL_users_getFullUser, new ai.q1(l6Var, e1VarArr, l10, k3Var, 1));
                            return;
                        }
                    }
                    k3Var.run();
                    return;
                } else if (i17 < i16) {
                    alertDialog$Builder2 = new AlertDialog$Builder(0, l6Var.getContext(), l6Var.J0);
                    String M02 = bd.M0(2131750215, null);
                    org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.f27343a;
                    s1Var2.S = M02;
                    s1Var2.U = bd.G(Math.max(1, i15), "Gift2ExportTONUnlocksAlertText", new Object[0]);
                } else {
                    if (l10.longValue() == -98) {
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, l6Var.getContext(), l6Var.J0);
                        String M03 = bd.M0(2131750112, null);
                        org.telegram.ui.ActionBar.s1 s1Var3 = alertDialog$Builder3.f27343a;
                        s1Var3.S = M03;
                        s1Var3.U = bd.M0(2131750111, null);
                        String t10 = org.telegram.ui.Wallet.k0.x(l6Var.f28583a).t();
                        LinearLayout linearLayout = new LinearLayout(l6Var.getContext());
                        linearLayout.setOrientation(1);
                        if (!TextUtils.isEmpty(t10)) {
                            TextView textView = new TextView(l6Var.getContext());
                            textView.setTypeface(org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
                            textView.setTextSize(1, 16.5f);
                            textView.setLetterSpacing(0.01818182f);
                            textView.setLineSpacing(org.telegram.messenger.g0.L(23.0f) - textView.getPaint().getFontMetricsInt(null), 1.0f);
                            textView.setIncludeFontPadding(false);
                            textView.setGravity(17);
                            textView.setPadding(0, org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f));
                            int i19 = org.telegram.ui.ActionBar.k6.f27988j5;
                            int w02 = org.telegram.ui.ActionBar.k6.w0(i19, l6Var.J0);
                            ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(20.0f), org.telegram.ui.ActionBar.k6.r1(0.045f, w02));
                            org.telegram.ui.ActionBar.n6 L2 = org.telegram.ui.ActionBar.r6.L(0.045f, i19);
                            org.telegram.ui.ActionBar.e6 e6Var = l6Var.J0;
                            textView.setBackground(d02);
                            org.telegram.ui.ActionBar.r6.k(textView, d02, L2, null, e6Var);
                            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.r5, l6Var.J0);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            int length = (t10.length() + 3) / 4;
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
                                spannableStringBuilder.append((CharSequence) t10, i21, Math.min(t10.length(), i21 + 4));
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
                            linearLayout.addView(textView, mf.k(20.0f, 0.0f, 20.0f, 14.0f, -1, -2));
                        }
                        TextView textView2 = new TextView(l6Var.getContext());
                        textView2.setTextSize(1, 15.0f);
                        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f27988j5, l6Var.J0);
                        org.telegram.messenger.k5.m(textView2, 17, null, 2131750116);
                        linearLayout.addView(textView2, mf.k(24.0f, 0.0f, 24.0f, 0.0f, -1, -2));
                        LinearLayout linearLayout2 = new LinearLayout(l6Var.getContext());
                        linearLayout2.setOrientation(0);
                        linearLayout2.setGravity(16);
                        int i22 = org.telegram.ui.ActionBar.k6.r5;
                        l6Var.l1(linearLayout2, 2131232360, 14, i22, bd.M0(2131745505, null), true);
                        l6Var.l1(linearLayout2, 2131231954, 15, org.telegram.ui.ActionBar.k6.Ci, bd.M0(2131743204, null), true);
                        l6Var.l1(linearLayout2, 2131231827, 14, i22, bd.M0(2131743180, null), false);
                        linearLayout.addView(linearLayout2, mf.t(-2, -2, 1, 0, 7, 0, 3));
                        l6Var.f5477q3 = true;
                        org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, l6Var.getContext(), l6Var.J0);
                        int i23 = org.telegram.ui.ActionBar.k6.f27972i6;
                        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i23, l6Var.J0), 7, org.telegram.messenger.g0.L(12.0f));
                        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i23);
                        org.telegram.ui.ActionBar.e6 e6Var2 = l6Var.J0;
                        c2Var.setBackground(h02);
                        org.telegram.ui.ActionBar.r6.k(c2Var, h02, null, N, e6Var2);
                        c2Var.setMultiline(true);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c2Var.getCheckBoxView().getLayoutParams();
                        layoutParams.topMargin = 0;
                        if (bd.f21784a0) {
                            i3 = 5;
                        } else {
                            i3 = 3;
                        }
                        layoutParams.gravity = 16 | i3;
                        c2Var.getCheckBoxView().setLayoutParams(layoutParams);
                        c2Var.e(bd.M0(2131750146, null), "", true, false, false);
                        if (bd.f21784a0) {
                            i10 = org.telegram.messenger.g0.L(4.0f);
                        } else {
                            i10 = 0;
                        }
                        int L3 = org.telegram.messenger.g0.L(12.0f);
                        if (bd.f21784a0) {
                            L = 0;
                        } else {
                            L = org.telegram.messenger.g0.L(4.0f);
                        }
                        c2Var.setPadding(i10, L3, L, org.telegram.messenger.g0.L(12.0f));
                        c2Var.setOnClickListener(new ai.d(10, l6Var, c2Var));
                        linearLayout.addView(c2Var, mf.k(8.0f, 4.0f, 8.0f, 0.0f, -1, -2));
                        alertDialog$Builder3.o(linearLayout);
                        s1Var3.H = 20;
                        r32 = 0;
                        alertDialog$Builder3.k(bd.M0(2131750117, null), new org.telegram.ui.ActionBar.p1() {
                            @Override
                            public final void g(org.telegram.ui.ActionBar.s1 s1Var4, int i24) {
                                switch (r3) {
                                    case 0:
                                        sf.b h = s1Var4.h(i24, true, true);
                                        xg.e1 e1Var = e1VarArr[0];
                                        Objects.requireNonNull(e1Var);
                                        l6Var.r2(true, s1Var4, h, new xg.x0(e1Var, 11));
                                        return;
                                    default:
                                        sf.b h7 = s1Var4.h(i24, true, true);
                                        xg.e1 e1Var2 = e1VarArr[0];
                                        Objects.requireNonNull(e1Var2);
                                        l6Var.r2(false, s1Var4, h7, new xg.x0(e1Var2, 11));
                                        return;
                                }
                            }
                        });
                        alertDialog$Builder = alertDialog$Builder3;
                    } else {
                        LinearLayout linearLayout3 = new LinearLayout(l6Var.getContext());
                        linearLayout3.setOrientation(1);
                        linearLayout3.addView(new j5(l6Var.getContext(), tL_starGiftUnique), mf.t(-1, -2, 48, 0, -4, 0, 0));
                        TextView textView3 = new TextView(l6Var.getContext());
                        int i24 = org.telegram.ui.ActionBar.k6.f27988j5;
                        org.telegram.messenger.k5.n(textView3, i24, l6Var.J0, 1, 20.0f);
                        textView3.setText(bd.M0(2131750220, null));
                        linearLayout3.addView(textView3, mf.t(-1, -2, 48, 24, 4, 24, 14));
                        TextView textView4 = new TextView(l6Var.getContext());
                        org.telegram.ui.ActionBar.r6.V(textView4, i24, l6Var.J0);
                        textView4.setTextSize(1, 16.0f);
                        org.telegram.messenger.k5.r(null, null, 2131750221, new Object[]{l6Var.z1()}, textView4);
                        linearLayout3.addView(textView4, mf.t(-1, -2, 48, 24, 0, 24, 4));
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, l6Var.getContext(), l6Var.J0);
                        alertDialog$Builder4.o(linearLayout3);
                        r32 = 0;
                        alertDialog$Builder4.k(bd.M0(2131750222, null), new org.telegram.ui.ActionBar.p1() {
                            @Override
                            public final void g(org.telegram.ui.ActionBar.s1 s1Var4, int i242) {
                                switch (r3) {
                                    case 0:
                                        sf.b h = s1Var4.h(i242, true, true);
                                        xg.e1 e1Var = e1VarArr[0];
                                        Objects.requireNonNull(e1Var);
                                        l6Var.r2(true, s1Var4, h, new xg.x0(e1Var, 11));
                                        return;
                                    default:
                                        sf.b h7 = s1Var4.h(i242, true, true);
                                        xg.e1 e1Var2 = e1VarArr[0];
                                        Objects.requireNonNull(e1Var2);
                                        l6Var.r2(false, s1Var4, h7, new xg.x0(e1Var2, 11));
                                        return;
                                }
                            }
                        });
                        alertDialog$Builder = alertDialog$Builder4;
                    }
                    k2.p1.v(r32, 2131752589, alertDialog$Builder, r32);
                    return;
                }
                k2.p1.B(null, 2131747839, alertDialog$Builder2, null);
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

    public e4(l6 l6Var, int i3, int i10, int i11, xg.e1[] e1VarArr, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.f5009e = l6Var;
        this.f5007b = i3;
        this.f5008c = i10;
        this.d = i11;
        this.f5010f = e1VarArr;
        this.f5011g = tL_starGiftUnique;
    }
}
