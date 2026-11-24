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
public final class kg implements p8c {
    public final byte a = 0;
    public final int b;
    public final int c;
    public final int d;
    public final KeyEvent.Callback e;
    public final Object f;
    public final Object g;

    public kg(int i, int i2, yh yhVar, ai aiVar, int i3, zh zhVar) {
        this.b = i;
        this.c = i2;
        this.e = yhVar;
        this.f = aiVar;
        this.d = i3;
        this.g = zhVar;
    }

    @Override
    public final void a(Object obj) {
        int i;
        int i2;
        ?? r4;
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
                yh yhVar = (yh) callback;
                ai aiVar = (ai) obj3;
                zh zhVar = (zh) obj2;
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
                    i2 = yhVar.getValue();
                    i = aiVar.getValue();
                } else {
                    i = i5 % 60;
                    i2 = (i5 - i) / 60;
                    if (i2 == 24) {
                        i2--;
                        i = 59;
                    }
                }
                yhVar.setMinValue(i9);
                yhVar.setMaxValue(i11);
                if (i2 > i11) {
                    yhVar.setValue(i11);
                    i2 = i11;
                } else if (i2 < i9) {
                    yhVar.setValue(i9);
                    i2 = i9;
                }
                if (i2 <= i9) {
                    aiVar.setMinValue(i8);
                    if (i9 == i11) {
                        i12 = i10;
                    }
                    aiVar.setMaxValue(i12);
                } else if (i2 >= i11) {
                    if (i9 != i11) {
                        i8 = 0;
                    }
                    aiVar.setMinValue(i8);
                    aiVar.setMaxValue(i10);
                } else if (i9 == i11) {
                    aiVar.setMinValue(i8);
                    aiVar.setMaxValue(i10);
                } else {
                    aiVar.setMinValue(0);
                    aiVar.setMaxValue(59);
                }
                if (i > aiVar.getMaxValue()) {
                    i = aiVar.getMaxValue();
                    aiVar.setValue(i);
                } else if (i < aiVar.getMinValue()) {
                    i = aiVar.getMinValue();
                    aiVar.setValue(i);
                }
                if (!bool.booleanValue()) {
                    yhVar.setValue(i2);
                    aiVar.setValue(i);
                }
                zhVar.invalidate();
                return;
            default:
                final vqa vqaVar = (vqa) callback;
                final xu4[] xu4VarArr = (xu4[]) obj3;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj2;
                Long l = (Long) obj;
                if (l.longValue() != -99 && l.longValue() != -98) {
                    q3a q3aVar = new q3a(vqaVar, l, xu4VarArr, (byte) 11);
                    if (l.longValue() < 0) {
                        TLRPC.ChatFull L0 = na7.q1(vqaVar.a).L0(-l.longValue());
                        if (L0 == null) {
                            TLRPC.TL_channels_getFullChannel tL_channels_getFullChannel = new TLRPC.TL_channels_getFullChannel();
                            tL_channels_getFullChannel.channel = na7.q1(vqaVar.a).f1(-l.longValue());
                            ConnectionsManager.getInstance(vqaVar.a).sendRequest(tL_channels_getFullChannel, new hj7(vqaVar, q3aVar, (byte) 28));
                            return;
                        } else if (!L0.stargifts_available) {
                            alertDialog$Builder2 = new AlertDialog$Builder(0, vqaVar.J0, vqaVar.getContext());
                            String M0 = k96.M0(2131750246, null);
                            hd hdVar = alertDialog$Builder2.a;
                            hdVar.S = M0;
                            hdVar.U = k96.M0(2131750247, null);
                        }
                    } else if (l.longValue() >= 0) {
                        TLRPC.User V1 = na7.q1(vqaVar.a).V1(l);
                        TLRPC.UserFull W1 = na7.q1(vqaVar.a).W1(l.longValue());
                        if (W1 != null && (disallowedGiftsSettings = W1.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_unique_stargifts) {
                            b00.u(k96.a0(null, null, 2131743503, cf3.s(l.longValue())), new u21(xu4VarArr[0].c, vqaVar.J0), 2131624012, 36);
                            return;
                        } else if (W1 == null && V1 != null) {
                            TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                            tL_users_getFullUser.id = na7.q1(vqaVar.a).o1(V1);
                            ConnectionsManager.getInstance(vqaVar.a).sendRequest(tL_users_getFullUser, new rt0(vqaVar, xu4VarArr, l, q3aVar, (byte) 19));
                            return;
                        }
                    }
                    q3aVar.run();
                    return;
                } else if (i7 < i6) {
                    alertDialog$Builder2 = new AlertDialog$Builder(0, vqaVar.J0, vqaVar.getContext());
                    String M02 = k96.M0(2131750191, null);
                    hd hdVar2 = alertDialog$Builder2.a;
                    hdVar2.S = M02;
                    hdVar2.U = k96.G(Math.max(1, i5), "Gift2ExportTONUnlocksAlertText", new Object[0]);
                } else {
                    if (l.longValue() == -98) {
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, vqaVar.J0, vqaVar.getContext());
                        String M03 = k96.M0(2131750088, null);
                        hd hdVar3 = alertDialog$Builder3.a;
                        hdVar3.S = M03;
                        hdVar3.U = k96.M0(2131750087, null);
                        String x = c.C(vqaVar.a).x();
                        LinearLayout linearLayout = new LinearLayout(vqaVar.getContext());
                        linearLayout.setOrientation(1);
                        int i13 = 3;
                        if (!TextUtils.isEmpty(x)) {
                            TextView textView = new TextView(vqaVar.getContext());
                            textView.setTypeface(gl.n1("fonts/rmono.ttf"));
                            textView.setTextSize(1, 16.5f);
                            textView.setLetterSpacing(0.01818182f);
                            textView.setLineSpacing(gl.L(23.0f) - textView.getPaint().getFontMetricsInt(null), 1.0f);
                            textView.setIncludeFontPadding(false);
                            textView.setGravity(17);
                            textView.setPadding(0, gl.L(14.0f), 0, gl.L(14.0f));
                            int i14 = bkb.i5;
                            int v0 = bkb.v0(i14, vqaVar.J0);
                            ShapeDrawable b0 = bkb.b0(gl.L(20.0f), bkb.p1(0.045f, v0));
                            vkb K = zkb.K(0.045f, i14);
                            wjb wjbVar = vqaVar.J0;
                            textView.setBackground(b0);
                            zkb.j(textView, b0, K, null, wjbVar);
                            int v02 = bkb.v0(bkb.q5, vqaVar.J0);
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
                            linearLayout.addView(textView, nme.k(20.0f, 0.0f, 20.0f, 14.0f, -1, -2));
                        }
                        TextView textView2 = new TextView(vqaVar.getContext());
                        textView2.setTextSize(1, 15.0f);
                        zkb.X(textView2, bkb.i5, vqaVar.J0);
                        de9.q(textView2, 17, null, 2131750092);
                        linearLayout.addView(textView2, nme.k(24.0f, 0.0f, 24.0f, 0.0f, -1, -2));
                        LinearLayout linearLayout2 = new LinearLayout(vqaVar.getContext());
                        linearLayout2.setOrientation(0);
                        linearLayout2.setGravity(16);
                        int i17 = bkb.q5;
                        vqaVar.b1(linearLayout2, 2131232365, 14, i17, k96.M0(2131745303, null), true);
                        vqaVar.b1(linearLayout2, 2131231958, 15, bkb.Ei, k96.M0(2131742951, null), true);
                        vqaVar.b1(linearLayout2, 2131231831, 14, i17, k96.M0(2131742927, null), false);
                        linearLayout.addView(linearLayout2, nme.t(-2, -2, 1, 0, 7, 0, 3));
                        vqaVar.v3 = true;
                        ag2 ag2Var = new ag2(1, vqaVar.J0, vqaVar.getContext());
                        int i18 = bkb.h6;
                        ff0 f0 = bkb.f0(bkb.v0(i18, vqaVar.J0), 7, gl.L(12.0f));
                        vkb M = zkb.M(i18);
                        wjb wjbVar2 = vqaVar.J0;
                        ag2Var.setBackground(f0);
                        zkb.j(ag2Var, f0, null, M, wjbVar2);
                        ag2Var.setMultiline(true);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ag2Var.getCheckBoxView().getLayoutParams();
                        layoutParams.topMargin = 0;
                        if (k96.a0) {
                            i13 = 5;
                        }
                        layoutParams.gravity = i13 | 16;
                        ag2Var.getCheckBoxView().setLayoutParams(layoutParams);
                        ag2Var.e(k96.M0(2131750122, null), "", true, false, false);
                        if (k96.a0) {
                            i3 = gl.L(4.0f);
                        } else {
                            i3 = 0;
                        }
                        int L2 = gl.L(12.0f);
                        if (k96.a0) {
                            L = 0;
                        } else {
                            L = gl.L(4.0f);
                        }
                        ag2Var.setPadding(i3, L2, L, gl.L(12.0f));
                        ag2Var.setOnClickListener(new b99(vqaVar, ag2Var, (byte) 13));
                        linearLayout.addView(ag2Var, nme.k(8.0f, 4.0f, 8.0f, 0.0f, -1, -2));
                        alertDialog$Builder3.n(linearLayout);
                        hdVar3.H = (byte) 20;
                        r4 = 0;
                        alertDialog$Builder3.j(k96.M0(2131750093, null), new ed() {
                            @Override
                            public final void u(hd hdVar4, int i19) {
                                byte b2 = r3;
                                xu4[] xu4VarArr2 = xu4VarArr;
                                vqa vqaVar2 = vqaVar;
                                switch (b2) {
                                    case 0:
                                        c01 g = hdVar4.g(i19, true, true);
                                        xu4 xu4Var = xu4VarArr2[0];
                                        Objects.requireNonNull(xu4Var);
                                        vqaVar2.y2(true, hdVar4, g, new nu4(xu4Var, (byte) 1));
                                        return;
                                    default:
                                        c01 g2 = hdVar4.g(i19, true, true);
                                        xu4 xu4Var2 = xu4VarArr2[0];
                                        Objects.requireNonNull(xu4Var2);
                                        vqaVar2.y2(false, hdVar4, g2, new nu4(xu4Var2, (byte) 1));
                                        return;
                                }
                            }
                        });
                        alertDialog$Builder = alertDialog$Builder3;
                    } else {
                        LinearLayout linearLayout3 = new LinearLayout(vqaVar.getContext());
                        linearLayout3.setOrientation(1);
                        linearLayout3.addView(new wpa(vqaVar.getContext(), tL_starGiftUnique), nme.t(-1, -2, 48, 0, -4, 0, 0));
                        TextView textView3 = new TextView(vqaVar.getContext());
                        int i19 = bkb.i5;
                        tb4.w(textView3, i19, vqaVar.J0, 1, 20.0f);
                        textView3.setText(k96.M0(2131750196, null));
                        linearLayout3.addView(textView3, nme.t(-1, -2, 48, 24, 4, 24, 14));
                        TextView textView4 = new TextView(vqaVar.getContext());
                        zkb.X(textView4, i19, vqaVar.J0);
                        textView4.setTextSize(1, 16.0f);
                        de9.r(null, null, 2131750197, new Object[]{vqaVar.s1()}, textView4);
                        linearLayout3.addView(textView4, nme.t(-1, -2, 48, 24, 0, 24, 4));
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, vqaVar.J0, vqaVar.getContext());
                        alertDialog$Builder4.n(linearLayout3);
                        r4 = 0;
                        alertDialog$Builder4.j(k96.M0(2131750198, null), new ed() {
                            @Override
                            public final void u(hd hdVar4, int i192) {
                                byte b2 = r3;
                                xu4[] xu4VarArr2 = xu4VarArr;
                                vqa vqaVar2 = vqaVar;
                                switch (b2) {
                                    case 0:
                                        c01 g = hdVar4.g(i192, true, true);
                                        xu4 xu4Var = xu4VarArr2[0];
                                        Objects.requireNonNull(xu4Var);
                                        vqaVar2.y2(true, hdVar4, g, new nu4(xu4Var, (byte) 1));
                                        return;
                                    default:
                                        c01 g2 = hdVar4.g(i192, true, true);
                                        xu4 xu4Var2 = xu4VarArr2[0];
                                        Objects.requireNonNull(xu4Var2);
                                        vqaVar2.y2(false, hdVar4, g2, new nu4(xu4Var2, (byte) 1));
                                        return;
                                }
                            }
                        });
                        alertDialog$Builder = alertDialog$Builder4;
                    }
                    ug8.y(r4, 2131752577, alertDialog$Builder, r4);
                    return;
                }
                b00.t(null, 2131747638, alertDialog$Builder2, null);
                return;
        }
    }

    public kg(vqa vqaVar, int i, int i2, int i3, xu4[] xu4VarArr, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.e = vqaVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.f = xu4VarArr;
        this.g = tL_starGiftUnique;
    }
}
