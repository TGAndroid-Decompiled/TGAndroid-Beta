package defpackage;

import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Wallet.c;
public final class kh implements qac {
    public final byte a = 0;
    public final int b;
    public final int c;
    public final int d;
    public final KeyEvent.Callback e;
    public final Object f;
    public final Object g;

    public kh(int i, int i2, yi yiVar, aj ajVar, int i3, zi ziVar) {
        this.b = i;
        this.c = i2;
        this.e = yiVar;
        this.f = ajVar;
        this.d = i3;
        this.g = ziVar;
    }

    @Override
    public final void a(Object obj) {
        int i;
        int i2;
        ?? r5;
        AlertDialog$Builder alertDialog$Builder;
        int i3;
        int L;
        boolean z;
        int i4;
        String str;
        AlertDialog$Builder alertDialog$Builder2;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        byte b = this.a;
        Object obj2 = this.g;
        Object obj3 = this.f;
        int i5 = this.d;
        int i6 = this.c;
        int i7 = this.b;
        KeyEvent.Callback callback = this.e;
        switch (b) {
            case 0:
                yi yiVar = (yi) callback;
                aj ajVar = (aj) obj3;
                zi ziVar = (zi) obj2;
                Boolean bool = (Boolean) obj;
                int i8 = i7 % 60;
                int i9 = (i7 - i8) / 60;
                int i10 = i6 % 60;
                int i11 = (i6 - i10) / 60;
                int i12 = 59;
                if (i10 == 0 && i11 > 0) {
                    i11--;
                    i10 = 59;
                }
                if (bool.booleanValue()) {
                    i2 = yiVar.getValue();
                    i = ajVar.getValue();
                } else {
                    i = i5 % 60;
                    i2 = (i5 - i) / 60;
                    if (i2 == 24) {
                        i2--;
                        i = 59;
                    }
                }
                yiVar.setMinValue(i9);
                yiVar.setMaxValue(i11);
                if (i2 > i11) {
                    yiVar.setValue(i11);
                    i2 = i11;
                } else if (i2 < i9) {
                    yiVar.setValue(i9);
                    i2 = i9;
                }
                if (i2 <= i9) {
                    ajVar.setMinValue(i8);
                    if (i9 == i11) {
                        i12 = i10;
                    }
                    ajVar.setMaxValue(i12);
                } else if (i2 >= i11) {
                    if (i9 != i11) {
                        i8 = 0;
                    }
                    ajVar.setMinValue(i8);
                    ajVar.setMaxValue(i10);
                } else if (i9 == i11) {
                    ajVar.setMinValue(i8);
                    ajVar.setMaxValue(i10);
                } else {
                    ajVar.setMinValue(0);
                    ajVar.setMaxValue(59);
                }
                if (i > ajVar.getMaxValue()) {
                    i = ajVar.getMaxValue();
                    ajVar.setValue(i);
                } else if (i < ajVar.getMinValue()) {
                    i = ajVar.getMinValue();
                    ajVar.setValue(i);
                }
                if (!bool.booleanValue()) {
                    yiVar.setValue(i2);
                    ajVar.setValue(i);
                }
                ziVar.invalidate();
                return;
            default:
                final wsa wsaVar = (wsa) callback;
                final yw4[] yw4VarArr = (yw4[]) obj3;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj2;
                Long l = (Long) obj;
                if (l.longValue() != -99 && l.longValue() != -98) {
                    hw9 hw9Var = new hw9(wsaVar, l, yw4VarArr, (byte) 14);
                    if (l.longValue() < 0) {
                        TLRPC.ChatFull M0 = oc7.r1(wsaVar.a).M0(-l.longValue());
                        if (M0 == null) {
                            TLRPC.TL_channels_getFullChannel tL_channels_getFullChannel = new TLRPC.TL_channels_getFullChannel();
                            tL_channels_getFullChannel.channel = oc7.r1(wsaVar.a).g1(-l.longValue());
                            ConnectionsManager.getInstance(wsaVar.a).sendRequest(tL_channels_getFullChannel, new jl7(wsaVar, hw9Var, (byte) 28));
                            return;
                        } else if (!M0.stargifts_available) {
                            alertDialog$Builder2 = new AlertDialog$Builder(0, wsaVar.J0, wsaVar.getContext());
                            String M02 = jb6.M0(2131750195, null);
                            he heVar = alertDialog$Builder2.a;
                            heVar.S = M02;
                            heVar.U = jb6.M0(2131750196, null);
                        }
                    } else if (l.longValue() >= 0) {
                        TLRPC.User W1 = oc7.r1(wsaVar.a).W1(l);
                        TLRPC.UserFull X1 = oc7.r1(wsaVar.a).X1(l.longValue());
                        if (X1 != null && (disallowedGiftsSettings = X1.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_unique_stargifts) {
                            b10.u(jb6.a0(null, null, 2131743429, pg3.s(l.longValue())), new c41(yw4VarArr[0].c, wsaVar.J0), 2131624012, 36);
                            return;
                        } else if (X1 == null && W1 != null) {
                            TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                            tL_users_getFullUser.id = oc7.r1(wsaVar.a).p1(W1);
                            ConnectionsManager.getInstance(wsaVar.a).sendRequest(tL_users_getFullUser, new av0(wsaVar, yw4VarArr, l, hw9Var, (byte) 19));
                            return;
                        }
                    }
                    hw9Var.run();
                    return;
                } else if (i7 < i6) {
                    alertDialog$Builder2 = new AlertDialog$Builder(0, wsaVar.J0, wsaVar.getContext());
                    String M03 = jb6.M0(2131750140, null);
                    he heVar2 = alertDialog$Builder2.a;
                    heVar2.S = M03;
                    heVar2.U = jb6.G(Math.max(1, i5), "Gift2ExportTONUnlocksAlertText", new Object[0]);
                } else {
                    if (l.longValue() == -98) {
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, wsaVar.J0, wsaVar.getContext());
                        String M04 = jb6.M0(2131750037, null);
                        he heVar3 = alertDialog$Builder3.a;
                        heVar3.S = M04;
                        heVar3.U = jb6.M0(2131750036, null);
                        String x = c.C(wsaVar.a).x();
                        LinearLayout linearLayout = new LinearLayout(wsaVar.getContext());
                        linearLayout.setOrientation(1);
                        int i13 = 3;
                        if (!TextUtils.isEmpty(x)) {
                            TextView textView = new TextView(wsaVar.getContext());
                            textView.setTypeface(gm.n1("fonts/rmono.ttf"));
                            textView.setTextSize(1, 16.5f);
                            textView.setLetterSpacing(0.01818182f);
                            textView.setLineSpacing(gm.L(23.0f) - textView.getPaint().getFontMetricsInt(null), 1.0f);
                            textView.setIncludeFontPadding(false);
                            textView.setGravity(17);
                            textView.setPadding(0, gm.L(14.0f), 0, gm.L(14.0f));
                            int i14 = cmb.i5;
                            int v0 = cmb.v0(i14, wsaVar.J0);
                            ShapeDrawable b0 = cmb.b0(gm.L(20.0f), cmb.p1(0.045f, v0));
                            wmb K = anb.K(0.045f, i14);
                            ylb ylbVar = wsaVar.J0;
                            textView.setBackground(b0);
                            anb.j(textView, b0, K, null, ylbVar);
                            int v02 = cmb.v0(cmb.q5, wsaVar.J0);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            int length = (x.length() + 3) / 4;
                            for (int i15 = 0; i15 < length; i15++) {
                                if (i15 > 0) {
                                    if (i15 % 4 == 0) {
                                        str = "\n";
                                    } else {
                                        str = " ";
                                    }
                                    spannableStringBuilder.append((CharSequence) str);
                                }
                                int length2 = spannableStringBuilder.length();
                                int i16 = i15 << 2;
                                spannableStringBuilder.append((CharSequence) x, i16, Math.min(x.length(), i16 + 4));
                                if (((i15 / 4) + (i15 % 4)) % 2 == 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    i4 = v0;
                                } else {
                                    i4 = v02;
                                }
                                spannableStringBuilder.setSpan(new ForegroundColorSpan(i4), length2, spannableStringBuilder.length(), 33);
                            }
                            textView.setText(spannableStringBuilder);
                            linearLayout.addView(textView, qoe.k(20.0f, 0.0f, 20.0f, 14.0f, -1, -2));
                        }
                        TextView textView2 = new TextView(wsaVar.getContext());
                        textView2.setTextSize(1, 15.0f);
                        anb.X(textView2, cmb.i5, wsaVar.J0);
                        hg9.p(textView2, 17, null, 2131750041);
                        linearLayout.addView(textView2, qoe.k(24.0f, 0.0f, 24.0f, 0.0f, -1, -2));
                        LinearLayout linearLayout2 = new LinearLayout(wsaVar.getContext());
                        linearLayout2.setOrientation(0);
                        linearLayout2.setGravity(16);
                        int i17 = cmb.q5;
                        wsaVar.b1(linearLayout2, 2131232366, 14, i17, jb6.M0(2131745229, null), true);
                        wsaVar.b1(linearLayout2, 2131231959, 15, cmb.Ei, jb6.M0(2131742877, null), true);
                        wsaVar.b1(linearLayout2, 2131231832, 14, i17, jb6.M0(2131742853, null), false);
                        linearLayout.addView(linearLayout2, qoe.t(-2, -2, 1, 0, 7, 0, 3));
                        wsaVar.v3 = true;
                        oh2 oh2Var = new oh2(1, wsaVar.J0, wsaVar.getContext());
                        int i18 = cmb.h6;
                        fg0 f0 = cmb.f0(cmb.v0(i18, wsaVar.J0), 7, gm.L(12.0f));
                        wmb M = anb.M(i18);
                        ylb ylbVar2 = wsaVar.J0;
                        oh2Var.setBackground(f0);
                        anb.j(oh2Var, f0, null, M, ylbVar2);
                        oh2Var.setMultiline(true);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) oh2Var.getCheckBoxView().getLayoutParams();
                        layoutParams.topMargin = 0;
                        if (jb6.a0) {
                            i13 = 5;
                        }
                        layoutParams.gravity = i13 | 16;
                        oh2Var.getCheckBoxView().setLayoutParams(layoutParams);
                        oh2Var.e(jb6.M0(2131750071, null), "", true, false, false);
                        if (jb6.a0) {
                            i3 = gm.L(4.0f);
                        } else {
                            i3 = 0;
                        }
                        int L2 = gm.L(12.0f);
                        if (jb6.a0) {
                            L = 0;
                        } else {
                            L = gm.L(4.0f);
                        }
                        oh2Var.setPadding(i3, L2, L, gm.L(12.0f));
                        oh2Var.setOnClickListener(new r39(wsaVar, oh2Var, (byte) 14));
                        linearLayout.addView(oh2Var, qoe.k(8.0f, 4.0f, 8.0f, 0.0f, -1, -2));
                        alertDialog$Builder3.n(linearLayout);
                        heVar3.H = (byte) 20;
                        r5 = 0;
                        alertDialog$Builder3.j(jb6.M0(2131750042, null), new ee() {
                            @Override
                            public final void r(he heVar4, int i19) {
                                byte b2 = r3;
                                yw4[] yw4VarArr2 = yw4VarArr;
                                wsa wsaVar2 = wsaVar;
                                switch (b2) {
                                    case 0:
                                        k11 g = heVar4.g(i19, true, true);
                                        yw4 yw4Var = yw4VarArr2[0];
                                        Objects.requireNonNull(yw4Var);
                                        wsaVar2.y2(true, heVar4, g, new ow4(yw4Var, (byte) 1));
                                        return;
                                    default:
                                        k11 g2 = heVar4.g(i19, true, true);
                                        yw4 yw4Var2 = yw4VarArr2[0];
                                        Objects.requireNonNull(yw4Var2);
                                        wsaVar2.y2(false, heVar4, g2, new ow4(yw4Var2, (byte) 1));
                                        return;
                                }
                            }
                        });
                        alertDialog$Builder = alertDialog$Builder3;
                    } else {
                        LinearLayout linearLayout3 = new LinearLayout(wsaVar.getContext());
                        linearLayout3.setOrientation(1);
                        linearLayout3.addView(new wra(wsaVar.getContext(), tL_starGiftUnique), qoe.t(-1, -2, 48, 0, -4, 0, 0));
                        TextView textView3 = new TextView(wsaVar.getContext());
                        int i19 = cmb.i5;
                        td4.x(textView3, i19, wsaVar.J0, 1, 20.0f);
                        textView3.setText(jb6.M0(2131750145, null));
                        linearLayout3.addView(textView3, qoe.t(-1, -2, 48, 24, 4, 24, 14));
                        TextView textView4 = new TextView(wsaVar.getContext());
                        anb.X(textView4, i19, wsaVar.J0);
                        textView4.setTextSize(1, 16.0f);
                        hg9.q(null, null, 2131750146, new Object[]{wsaVar.s1()}, textView4);
                        linearLayout3.addView(textView4, qoe.t(-1, -2, 48, 24, 0, 24, 4));
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, wsaVar.J0, wsaVar.getContext());
                        alertDialog$Builder4.n(linearLayout3);
                        r5 = 0;
                        alertDialog$Builder4.j(jb6.M0(2131750147, null), new ee() {
                            @Override
                            public final void r(he heVar4, int i192) {
                                byte b2 = r3;
                                yw4[] yw4VarArr2 = yw4VarArr;
                                wsa wsaVar2 = wsaVar;
                                switch (b2) {
                                    case 0:
                                        k11 g = heVar4.g(i192, true, true);
                                        yw4 yw4Var = yw4VarArr2[0];
                                        Objects.requireNonNull(yw4Var);
                                        wsaVar2.y2(true, heVar4, g, new ow4(yw4Var, (byte) 1));
                                        return;
                                    default:
                                        k11 g2 = heVar4.g(i192, true, true);
                                        yw4 yw4Var2 = yw4VarArr2[0];
                                        Objects.requireNonNull(yw4Var2);
                                        wsaVar2.y2(false, heVar4, g2, new ow4(yw4Var2, (byte) 1));
                                        return;
                                }
                            }
                        });
                        alertDialog$Builder = alertDialog$Builder4;
                    }
                    wi8.y(r5, 2131752542, alertDialog$Builder, r5);
                    return;
                }
                b10.t(null, 2131747564, alertDialog$Builder2, null);
                return;
        }
    }

    public kh(wsa wsaVar, int i, int i2, int i3, yw4[] yw4VarArr, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.e = wsaVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.f = yw4VarArr;
        this.g = tL_starGiftUnique;
    }
}
