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
public final class jg implements pcc {
    public final byte a = 0;
    public final int b;
    public final int c;
    public final int d;
    public final KeyEvent.Callback e;
    public final Object f;
    public final Object g;

    public jg(int i, int i2, zh zhVar, bi biVar, int i3, ai aiVar) {
        this.b = i;
        this.c = i2;
        this.e = zhVar;
        this.f = biVar;
        this.d = i3;
        this.g = aiVar;
    }

    @Override
    public final void a(Object obj) {
        int i;
        int i2;
        ?? r10;
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
                zh zhVar = (zh) callback;
                bi biVar = (bi) obj3;
                ai aiVar = (ai) obj2;
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
                    i2 = zhVar.getValue();
                    i = biVar.getValue();
                } else {
                    i = i5 % 60;
                    i2 = (i5 - i) / 60;
                    if (i2 == 24) {
                        i2--;
                        i = 59;
                    }
                }
                zhVar.setMinValue(i9);
                zhVar.setMaxValue(i11);
                if (i2 > i11) {
                    zhVar.setValue(i11);
                    i2 = i11;
                } else if (i2 < i9) {
                    zhVar.setValue(i9);
                    i2 = i9;
                }
                if (i2 <= i9) {
                    biVar.setMinValue(i8);
                    if (i9 == i11) {
                        i12 = i10;
                    }
                    biVar.setMaxValue(i12);
                } else if (i2 >= i11) {
                    if (i9 != i11) {
                        i8 = 0;
                    }
                    biVar.setMinValue(i8);
                    biVar.setMaxValue(i10);
                } else if (i9 == i11) {
                    biVar.setMinValue(i8);
                    biVar.setMaxValue(i10);
                } else {
                    biVar.setMinValue(0);
                    biVar.setMaxValue(59);
                }
                if (i > biVar.getMaxValue()) {
                    i = biVar.getMaxValue();
                    biVar.setValue(i);
                } else if (i < biVar.getMinValue()) {
                    i = biVar.getMinValue();
                    biVar.setValue(i);
                }
                if (!bool.booleanValue()) {
                    zhVar.setValue(i2);
                    biVar.setValue(i);
                }
                aiVar.invalidate();
                return;
            default:
                final wua wuaVar = (wua) callback;
                final bx4[] bx4VarArr = (bx4[]) obj3;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj2;
                Long l = (Long) obj;
                if (l.longValue() != -99 && l.longValue() != -98) {
                    jr9 jr9Var = new jr9(wuaVar, l, bx4VarArr, (byte) 20);
                    if (l.longValue() < 0) {
                        TLRPC.ChatFull N0 = uc7.s1(wuaVar.a).N0(-l.longValue());
                        if (N0 == null) {
                            TLRPC.TL_channels_getFullChannel tL_channels_getFullChannel = new TLRPC.TL_channels_getFullChannel();
                            tL_channels_getFullChannel.channel = uc7.s1(wuaVar.a).h1(-l.longValue());
                            ConnectionsManager.getInstance(wuaVar.a).sendRequest(tL_channels_getFullChannel, new ol7(wuaVar, jr9Var, (byte) 29));
                            return;
                        } else if (!N0.stargifts_available) {
                            alertDialog$Builder2 = new AlertDialog$Builder(0, wuaVar.J0, wuaVar.getContext());
                            String M0 = ob6.M0(2131750221, null);
                            id idVar = alertDialog$Builder2.a;
                            idVar.S = M0;
                            idVar.U = ob6.M0(2131750222, null);
                        }
                    } else if (l.longValue() >= 0) {
                        TLRPC.User X1 = uc7.s1(wuaVar.a).X1(l);
                        TLRPC.UserFull Y1 = uc7.s1(wuaVar.a).Y1(l.longValue());
                        if (Y1 != null && (disallowedGiftsSettings = Y1.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_unique_stargifts) {
                            c00.v(ob6.a0(null, null, 2131743397, wf3.s(l.longValue())), new d31(bx4VarArr[0].c, wuaVar.J0), 2131624012, 36);
                            return;
                        } else if (Y1 == null && X1 != null) {
                            TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                            tL_users_getFullUser.id = uc7.s1(wuaVar.a).q1(X1);
                            ConnectionsManager.getInstance(wuaVar.a).sendRequest(tL_users_getFullUser, new au0(wuaVar, bx4VarArr, l, jr9Var, (byte) 19));
                            return;
                        }
                    }
                    jr9Var.run();
                    return;
                } else if (i7 < i6) {
                    alertDialog$Builder2 = new AlertDialog$Builder(0, wuaVar.J0, wuaVar.getContext());
                    String M02 = ob6.M0(2131750166, null);
                    id idVar2 = alertDialog$Builder2.a;
                    idVar2.S = M02;
                    idVar2.U = ob6.G(Math.max(1, i5), "Gift2ExportTONUnlocksAlertText", new Object[0]);
                } else {
                    if (l.longValue() == -98) {
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, wuaVar.J0, wuaVar.getContext());
                        String M03 = ob6.M0(2131750063, null);
                        id idVar3 = alertDialog$Builder3.a;
                        idVar3.S = M03;
                        idVar3.U = ob6.M0(2131750062, null);
                        String x = c.C(wuaVar.a).x();
                        LinearLayout linearLayout = new LinearLayout(wuaVar.getContext());
                        linearLayout.setOrientation(1);
                        int i13 = 3;
                        if (!TextUtils.isEmpty(x)) {
                            TextView textView = new TextView(wuaVar.getContext());
                            textView.setTypeface(hl.n1("fonts/rmono.ttf"));
                            textView.setTextSize(1, 16.5f);
                            textView.setLetterSpacing(0.01818182f);
                            textView.setLineSpacing(hl.L(23.0f) - textView.getPaint().getFontMetricsInt(null), 1.0f);
                            textView.setIncludeFontPadding(false);
                            textView.setGravity(17);
                            textView.setPadding(0, hl.L(14.0f), 0, hl.L(14.0f));
                            int i14 = aob.j5;
                            int v0 = aob.v0(i14, wuaVar.J0);
                            ShapeDrawable b0 = aob.b0(hl.L(20.0f), aob.p1(0.045f, v0));
                            uob K = yob.K(0.045f, i14);
                            vnb vnbVar = wuaVar.J0;
                            textView.setBackground(b0);
                            yob.j(textView, b0, K, null, vnbVar);
                            int v02 = aob.v0(aob.r5, wuaVar.J0);
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
                            linearLayout.addView(textView, tre.k(20.0f, 0.0f, 20.0f, 14.0f, -1, -2));
                        }
                        TextView textView2 = new TextView(wuaVar.getContext());
                        textView2.setTextSize(1, 15.0f);
                        yob.X(textView2, aob.j5, wuaVar.J0);
                        uh9.q(textView2, 17, null, 2131750067);
                        linearLayout.addView(textView2, tre.k(24.0f, 0.0f, 24.0f, 0.0f, -1, -2));
                        LinearLayout linearLayout2 = new LinearLayout(wuaVar.getContext());
                        linearLayout2.setOrientation(0);
                        linearLayout2.setGravity(16);
                        int i17 = aob.r5;
                        wuaVar.c1(linearLayout2, 2131232365, 14, i17, ob6.M0(2131745223, null), true);
                        wuaVar.c1(linearLayout2, 2131231958, 15, aob.Fi, ob6.M0(2131742845, null), true);
                        wuaVar.c1(linearLayout2, 2131231831, 14, i17, ob6.M0(2131742821, null), false);
                        linearLayout.addView(linearLayout2, tre.t(-2, -2, 1, 0, 7, 0, 3));
                        wuaVar.v3 = true;
                        sg2 sg2Var = new sg2(1, wuaVar.J0, wuaVar.getContext());
                        int i18 = aob.i6;
                        hf0 f0 = aob.f0(aob.v0(i18, wuaVar.J0), 7, hl.L(12.0f));
                        uob M = yob.M(i18);
                        vnb vnbVar2 = wuaVar.J0;
                        sg2Var.setBackground(f0);
                        yob.j(sg2Var, f0, null, M, vnbVar2);
                        sg2Var.setMultiline(true);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) sg2Var.getCheckBoxView().getLayoutParams();
                        layoutParams.topMargin = 0;
                        if (ob6.a0) {
                            i13 = 5;
                        }
                        layoutParams.gravity = i13 | 16;
                        sg2Var.getCheckBoxView().setLayoutParams(layoutParams);
                        sg2Var.e(ob6.M0(2131750097, null), "", true, false, false);
                        if (ob6.a0) {
                            i3 = hl.L(4.0f);
                        } else {
                            i3 = 0;
                        }
                        int L2 = hl.L(12.0f);
                        if (ob6.a0) {
                            L = 0;
                        } else {
                            L = hl.L(4.0f);
                        }
                        sg2Var.setPadding(i3, L2, L, hl.L(12.0f));
                        sg2Var.setOnClickListener(new jy8(wuaVar, sg2Var, (byte) 16));
                        linearLayout.addView(sg2Var, tre.k(8.0f, 4.0f, 8.0f, 0.0f, -1, -2));
                        alertDialog$Builder3.n(linearLayout);
                        idVar3.H = (byte) 20;
                        r10 = 0;
                        alertDialog$Builder3.j(ob6.M0(2131750068, null), new fd() {
                            @Override
                            public final void w(id idVar4, int i19) {
                                byte b2 = r3;
                                bx4[] bx4VarArr2 = bx4VarArr;
                                wua wuaVar2 = wuaVar;
                                switch (b2) {
                                    case 0:
                                        l01 g = idVar4.g(i19, true, true);
                                        bx4 bx4Var = bx4VarArr2[0];
                                        Objects.requireNonNull(bx4Var);
                                        wuaVar2.z2(true, idVar4, g, new qw4(bx4Var, (byte) 1));
                                        return;
                                    default:
                                        l01 g2 = idVar4.g(i19, true, true);
                                        bx4 bx4Var2 = bx4VarArr2[0];
                                        Objects.requireNonNull(bx4Var2);
                                        wuaVar2.z2(false, idVar4, g2, new qw4(bx4Var2, (byte) 1));
                                        return;
                                }
                            }
                        });
                        alertDialog$Builder = alertDialog$Builder3;
                    } else {
                        LinearLayout linearLayout3 = new LinearLayout(wuaVar.getContext());
                        linearLayout3.setOrientation(1);
                        linearLayout3.addView(new xta(wuaVar.getContext(), tL_starGiftUnique), tre.t(-1, -2, 48, 0, -4, 0, 0));
                        TextView textView3 = new TextView(wuaVar.getContext());
                        int i19 = aob.j5;
                        qd4.w(textView3, i19, wuaVar.J0, 1, 20.0f);
                        textView3.setText(ob6.M0(2131750171, null));
                        linearLayout3.addView(textView3, tre.t(-1, -2, 48, 24, 4, 24, 14));
                        TextView textView4 = new TextView(wuaVar.getContext());
                        yob.X(textView4, i19, wuaVar.J0);
                        textView4.setTextSize(1, 16.0f);
                        uh9.r(null, null, 2131750172, new Object[]{wuaVar.t1()}, textView4);
                        linearLayout3.addView(textView4, tre.t(-1, -2, 48, 24, 0, 24, 4));
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, wuaVar.J0, wuaVar.getContext());
                        alertDialog$Builder4.n(linearLayout3);
                        r10 = 0;
                        alertDialog$Builder4.j(ob6.M0(2131750173, null), new fd() {
                            @Override
                            public final void w(id idVar4, int i192) {
                                byte b2 = r3;
                                bx4[] bx4VarArr2 = bx4VarArr;
                                wua wuaVar2 = wuaVar;
                                switch (b2) {
                                    case 0:
                                        l01 g = idVar4.g(i192, true, true);
                                        bx4 bx4Var = bx4VarArr2[0];
                                        Objects.requireNonNull(bx4Var);
                                        wuaVar2.z2(true, idVar4, g, new qw4(bx4Var, (byte) 1));
                                        return;
                                    default:
                                        l01 g2 = idVar4.g(i192, true, true);
                                        bx4 bx4Var2 = bx4VarArr2[0];
                                        Objects.requireNonNull(bx4Var2);
                                        wuaVar2.z2(false, idVar4, g2, new qw4(bx4Var2, (byte) 1));
                                        return;
                                }
                            }
                        });
                        alertDialog$Builder = alertDialog$Builder4;
                    }
                    ik8.y(r10, 2131752570, alertDialog$Builder, r10);
                    return;
                }
                c00.u(null, 2131747558, alertDialog$Builder2, null);
                return;
        }
    }

    public jg(wua wuaVar, int i, int i2, int i3, bx4[] bx4VarArr, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.e = wuaVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.f = bx4VarArr;
        this.g = tL_starGiftUnique;
    }
}
