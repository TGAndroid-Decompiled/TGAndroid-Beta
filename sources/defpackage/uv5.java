package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.p;
public final class uv5 implements View.OnClickListener {
    public final byte a;
    public final Object b;
    public final Object c;

    public uv5(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    private final void a(View view) {
        int i;
        int i2;
        PhotoViewer photoViewer = (PhotoViewer) this.b;
        Activity activity = (Activity) this.c;
        Drawable[] drawableArr = PhotoViewer.d9;
        if (!photoViewer.K0() && !photoViewer.r) {
            int i3 = photoViewer.O4;
            if (i3 >= 0 && i3 < photoViewer.f7.size()) {
                Object obj = photoViewer.f7.get(photoViewer.O4);
                if (obj instanceof no6) {
                    no6 no6Var = (no6) obj;
                    if (!no6Var.b || no6Var.d()) {
                        no6Var.z = Boolean.valueOf(!no6Var.c());
                        photoViewer.k1.setPhotoState(no6Var.c());
                        boolean c = no6Var.c();
                        kg5 kg5Var = photoViewer.l1;
                        if (kg5Var != null) {
                            kg5Var.f(true);
                            photoViewer.l1 = null;
                        }
                        if (photoViewer.F != null) {
                            photoViewer.l1 = new kg5(photoViewer.F, 3);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                            if (c) {
                                i = 2131746988;
                            } else {
                                i = 2131746987;
                            }
                            SpannableStringBuilder append = spannableStringBuilder.append((CharSequence) ob6.M0(i, null));
                            if (c) {
                                i2 = 2131231871;
                            } else {
                                i2 = 2131231873;
                            }
                            append.setSpan(new wm2(i2, 0), 0, 1, 33);
                            photoViewer.l1.t(append);
                            photoViewer.f0.addView(photoViewer.l1, tre.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 48.0f));
                            photoViewer.l1.setTranslationY(photoViewer.Q0.getTranslationY());
                            photoViewer.l1.o(0.0f, (photoViewer.k1.getWidth() / 2.0f) + photoViewer.k1.getX() + photoViewer.I0.getX());
                            kg5 kg5Var2 = photoViewer.l1;
                            kg5Var2.r0 = new ug(kg5Var2, (byte) 6);
                            kg5Var2.d = 3500L;
                            kg5Var2.v();
                        }
                        xea.d1 = no6Var.c();
                        a.b.getSharedPreferences("mainconfig", 0).edit().putBoolean("photoHighQualityDefault", xea.d1).apply();
                        return;
                    }
                }
            }
            if (photoViewer.k1.getTag() == null) {
                if (photoViewer.p8) {
                    kxb kxbVar = photoViewer.n1;
                    kxb kxbVar2 = kxbVar;
                    if (kxbVar == null) {
                        ad8 ad8Var = photoViewer.f0;
                        ?? textView = new TextView(activity);
                        textView.d = new s8b(textView, (byte) 27);
                        textView.setBackgroundDrawable(aob.b0(hl.L(3.0f), -871296751));
                        textView.setTextColor(-1);
                        textView.setTextSize(1, 14.0f);
                        textView.setPadding(hl.L(8.0f), hl.L(7.0f), hl.L(8.0f), hl.L(7.0f));
                        textView.setGravity(16);
                        ad8Var.addView((View) textView, tre.d(-2, -2.0f, 51, 5.0f, 0.0f, 5.0f, 3.0f));
                        textView.setVisibility(8);
                        photoViewer.n1 = textView;
                        kxbVar2 = textView;
                    }
                    kxbVar2.setText(ob6.M0(2131743238, "VideoQualityIsTooLow"));
                    kxb kxbVar3 = photoViewer.n1;
                    iec iecVar = photoViewer.k1;
                    s8b s8bVar = kxbVar3.d;
                    if (iecVar != null) {
                        kxbVar3.a = iecVar;
                        kxbVar3.a();
                        kxbVar3.c = true;
                        hl.r(s8bVar);
                        hl.d3(s8bVar, 2000L);
                        ViewPropertyAnimator viewPropertyAnimator = kxbVar3.b;
                        if (viewPropertyAnimator != null) {
                            viewPropertyAnimator.setListener(null);
                            kxbVar3.b.cancel();
                            kxbVar3.b = null;
                        }
                        if (kxbVar3.getVisibility() != 0) {
                            kxbVar3.setAlpha(0.0f);
                            kxbVar3.setVisibility(0);
                            ViewPropertyAnimator listener = kxbVar3.animate().setDuration(300L).alpha(1.0f).setListener(null);
                            kxbVar3.b = listener;
                            listener.start();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            photoViewer.h2(true);
            photoViewer.x1(1);
        }
    }

    private final void b(View view) {
        boolean z;
        bx8 bx8Var = (bx8) this.b;
        u34 u34Var = (u34) this.c;
        if (bx8Var.K.getTag() == null) {
            int max = (int) Math.max(1.0f, bx8Var.getValue());
            uc6 uc6Var = (uc6) u34Var.b;
            TLRPC.User user = (TLRPC.User) u34Var.c;
            if (uc6Var.getLocationController().h(uc6Var.m0) == null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(uc6Var.getParentActivity());
                String M0 = ob6.M0(2131745181, null);
                id idVar = alertDialog$Builder.a;
                idVar.S = M0;
                idVar.U = ob6.M0(2131745182, null);
                alertDialog$Builder.j(ob6.M0(2131745183, null), new bf(uc6Var, user, max, (byte) 8));
                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                uc6Var.showDialog(idVar);
                z = false;
            } else {
                uc6Var.O.M = true;
                uc6Var.c.setImageResource(2131232216);
                uc6Var.q0().k(0L, 24, Integer.valueOf(max), user, null, null);
                uc6Var.getLocationController().o(max, uc6Var.m0, true);
                z = true;
            }
            if (z) {
                bx8Var.a();
            }
        }
    }

    @Override
    public final void onClick(View view) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        char c;
        char c2;
        String a0;
        int i3;
        int i4;
        TLRPC.TL_auth_sentCode tL_auth_sentCode;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        Integer num;
        k68 k68Var;
        StringBuilder sb;
        long j;
        int i10;
        long j2;
        int i11;
        String str;
        String str2 = "";
        TLRPC.TL_chatBannedRights tL_chatBannedRights = null;
        boolean z3 = false;
        int i12 = 1;
        switch (this.a) {
            case 0:
                bw5 bw5Var = (bw5) this.b;
                zv5 zv5Var = (zv5) this.c;
                TLRPC.InputPeer j1 = uc7.s1(bw5Var.a).j1(r47.B1(bw5Var.w1));
                if (bw5Var.v1 == 2) {
                    if (bw5Var.w1 != bw5Var.x1) {
                        if (bw5Var.s1.size() > 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        zv5Var.a(j1, z, false, false);
                    }
                } else {
                    bw5Var.y1 = j1;
                }
                bw5Var.dismiss();
                return;
            case 1:
                ox5 ox5Var = (ox5) this.b;
                e eVar = (e) this.c;
                ox5Var.R.dismiss();
                if (ox5Var.g0.isEmpty()) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("checkCanWrite", false);
                    int i13 = ox5Var.d0;
                    if (i13 == 1) {
                        bundle.putInt("dialogsType", 6);
                    } else if (i13 == 2) {
                        bundle.putInt("dialogsType", 5);
                    } else {
                        bundle.putInt("dialogsType", 4);
                    }
                    bundle.putBoolean("allowGlobalSearch", false);
                    uj3 uj3Var = new uj3(bundle);
                    uj3Var.E2 = new u34(ox5Var, uj3Var, (byte) 9);
                    eVar.presentFragment(uj3Var);
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putInt("type", ox5Var.d0);
                d61 d61Var = new d61(bundle2);
                d61Var.d = ox5Var.g0;
                d61Var.Y();
                eVar.presentFragment(d61Var);
                return;
            case 2:
                cz5[] cz5VarArr = (cz5[]) this.c;
                String str3 = LaunchActivity.C1;
                Integer num2 = (Integer) view.getTag();
                ((mb6[]) this.b)[0] = ((cz5) view).getCurrentLocale();
                for (int i14 = 0; i14 < 2; i14++) {
                    cz5 cz5Var = cz5VarArr[i14];
                    if (i14 == num2.intValue()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    cz5Var.a.a(z2, true);
                }
                return;
            case 3:
                l46 l46Var = (l46) this.b;
                Context context = (Context) this.c;
                e eVar2 = l46Var.F2;
                int i15 = l46Var.c2;
                if (i15 != 11 && i15 != 34) {
                    if (i15 != 19 && i15 != 32 && !l46Var.k1()) {
                        if (i15 != 18 && i15 != 20 && i15 != 24 && i15 != 25 && i15 != 26 && i15 != 29 && i15 != 22 && i15 != 23 && i15 != 21 && i15 != 27 && i15 != 28 && i15 != 30 && i15 != 35) {
                            if (!yac.h(l46Var.a).p() && !uc7.s1(l46Var.a).M3() && !l46Var.I2) {
                                if (eVar2 != null) {
                                    if (eVar2.getVisibleDialog() != null) {
                                        eVar2.getVisibleDialog().dismiss();
                                    }
                                    eVar2.presentFragment(new PremiumPreviewFragment(0, l46.m1(i15)));
                                    l46Var.dismiss();
                                    return;
                                }
                                return;
                            }
                            l46Var.dismiss();
                            return;
                        }
                        hl.g(l46Var.c1());
                        l46Var.dismiss();
                        return;
                    }
                    wg1 wg1Var = l46Var.X1;
                    if (wg1Var.b) {
                        if (yac.h(l46Var.a).p() && on0.k()) {
                            ym0.i(l46Var.V1, l46Var);
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, l46Var.J0, context);
                        alertDialog$Builder.a.S = ob6.M0(2131746761, null);
                        if (l46Var.j1()) {
                            i = 2131746759;
                        } else {
                            i = 2131746760;
                        }
                        alertDialog$Builder.a.U = hl.S2(ob6.M0(i, null));
                        alertDialog$Builder.j(ob6.M0(2131752117, null), new x36(l46Var, (byte) 0));
                        alertDialog$Builder.g(ob6.M0(2131752570, null), new lq5((byte) 10));
                        alertDialog$Builder.o();
                        return;
                    } else if (wg1Var.a) {
                        if (wg1Var.c == 0) {
                            if (wg1Var.e && on0.k()) {
                                l46Var.a2 = true;
                                l46Var.s2.e0 = false;
                                e eVar3 = l46Var.r1;
                                wg1 wg1Var2 = l46Var.X1;
                                j59 j59Var = new j59(eVar3, wg1Var2.h, wg1Var2.k);
                                j59Var.show();
                                j59Var.I0 = new o1(l46Var, (byte) 24);
                                return;
                            }
                            l46Var.a1();
                            return;
                        }
                        ?? frameLayout = new FrameLayout(l46Var.getContext());
                        de0 de0Var = new de0(l46Var.getContext());
                        de0Var.setRoundRadius(hl.L(30.0f));
                        frameLayout.addView(de0Var, tre.c(60.0f, 60));
                        frameLayout.setClipChildren(false);
                        Paint paint = new Paint(1);
                        paint.setColor(aob.w0(null, aob.h5, false));
                        frameLayout.addView(new a81(l46Var.getContext(), paint, l46Var.getContext().getDrawable(2131231129)), tre.d(28, 28.0f, 0, 34.0f, 34.0f, 0.0f, 0.0f));
                        ImageView imageView = new ImageView(l46Var.getContext());
                        imageView.setImageResource(2131232061);
                        yob.s(imageView, aob.m6, null, PorterDuff.Mode.SRC_ATOP);
                        frameLayout.addView(imageView, tre.e(24, 24, 17));
                        de0 de0Var2 = new de0(l46Var.getContext());
                        de0Var2.setRoundRadius(hl.L(30.0f));
                        frameLayout.addView(de0Var2, tre.d(60, 60.0f, 0, 96.0f, 0.0f, 0.0f, 0.0f));
                        ?? frameLayout2 = new FrameLayout(l46Var.getContext());
                        frameLayout2.addView(frameLayout, tre.e(-2, 60, 1));
                        frameLayout2.setClipChildren(false);
                        TextView textView = new TextView(context);
                        textView.setLetterSpacing(0.025f);
                        yob.X(textView, aob.j5, null);
                        textView.setTextSize(1, 16.0f);
                        frameLayout2.addView(textView, tre.t(-1, -2, 0, 24, 80, 24, 0));
                        rb0 rb0Var = new rb0((vnb) null);
                        TLRPC.Chat M0 = uc7.s1(l46Var.a).M0(Long.valueOf(-l46Var.X1.c));
                        rb0Var.p(M0);
                        de0Var.f(M0, rb0Var);
                        rb0 rb0Var2 = new rb0((vnb) null);
                        TLRPC.Chat M02 = uc7.s1(l46Var.a).M0(Long.valueOf(-l46Var.V1));
                        rb0Var2.p(M02);
                        de0Var2.f(M02, rb0Var2);
                        ?? alertDialog$Builder2 = new AlertDialog$Builder(context);
                        alertDialog$Builder2.n(frameLayout2);
                        uh9.r("ReplaceBoostChannelDescription", null, 2131745997, new Object[]{M0.title, M02.title}, textView);
                        alertDialog$Builder2.j(ob6.M0(2131745999, null), new x36(l46Var, (byte) 1));
                        alertDialog$Builder2.g(ob6.M0(2131752570, null), new lq5((byte) 11));
                        alertDialog$Builder2.o();
                        return;
                    } else {
                        int i16 = wg1Var.f;
                        if (i16 != 0) {
                            ym0.g(i16);
                            return;
                        }
                        return;
                    }
                }
                return;
            case 4:
                jj.x((Context) this.c, ob6.M0(2131750842, null), ob6.M0(2131745238, null), -1L, new l56((v56) this.b, (byte) 0));
                return;
            case 5:
                v56 v56Var = (v56) this.b;
                Runnable[] runnableArr = (Runnable[]) this.c;
                if (v56Var.e == null) {
                    s56 s56Var = v56Var.f;
                    if (s56Var.e.h) {
                        int i17 = -v56Var.N;
                        v56Var.N = i17;
                        hl.A3(i17, s56Var, null);
                        return;
                    }
                    wkb wkbVar = (wkb) view;
                    Switch r3 = wkbVar.e;
                    wkbVar.setChecked(!r3.h);
                    t56 t56Var = v56Var.r;
                    if (r3.h) {
                        i2 = 0;
                    } else {
                        i2 = 8;
                    }
                    t56Var.setVisibility(i2);
                    hl.r(runnableArr[0]);
                    boolean z4 = r3.h;
                    s56 s56Var2 = v56Var.f;
                    if (z4) {
                        s56Var2.setChecked(false);
                        v56Var.f.setCheckBoxIcon(2131232529);
                        v56Var.h.setText(ob6.M0(2131754194, null));
                        o56 o56Var = new o56(v56Var, (byte) 1);
                        runnableArr[0] = o56Var;
                        hl.d3(o56Var, 60L);
                        return;
                    }
                    s56Var2.setCheckBoxIcon(0);
                    v56Var.h.setText(ob6.M0(2131754195, null));
                    o56 o56Var2 = new o56(v56Var, (byte) 2);
                    runnableArr[0] = o56Var2;
                    hl.c3(o56Var2);
                    return;
                }
                return;
            case 6:
                uc6 uc6Var = (uc6) this.b;
                uc6Var.B0((pc6) this.c);
                oc6 oc6Var = uc6Var.P0;
                if (oc6Var != null) {
                    oc6Var.dismiss();
                    return;
                }
                return;
            case 7:
                df6 df6Var = (df6) this.b;
                Context context2 = (Context) this.c;
                String string = df6Var.E.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    ?? obj = new Object();
                    obj.a |= 256;
                    obj.b = indexOf;
                    int i18 = lastIndexOf + 1;
                    obj.c = i18;
                    spannableStringBuilder.setSpan(new smb(obj, 0), indexOf, i18, 0);
                }
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context2);
                alertDialog$Builder3.a.S = ob6.M0(2131748482, null);
                SpannableStringBuilder S2 = hl.S2(ob6.M0(2131748486, null));
                int i19 = df6Var.H;
                int i20 = i19 / 86400;
                int i21 = i19 % 86400;
                int i22 = i21 / 3600;
                int i23 = (i21 % 3600) / 60;
                if (i20 == 0 && i22 == 0) {
                    i23 = Math.max(1, i23);
                }
                if (i20 != 0 && i22 != 0) {
                    c = 0;
                    a0 = ob6.a0(null, null, 2131748489, ob6.G(i20, "Days", new Object[0]), ob6.G(i22, "Hours", new Object[0]));
                    c2 = 1;
                } else {
                    c = 0;
                    if (i22 != 0 && i23 != 0) {
                        c2 = 1;
                        a0 = ob6.a0(null, null, 2131748489, ob6.G(i22, "Hours", new Object[0]), ob6.G(i23, "Minutes", new Object[0]));
                    } else {
                        c2 = 1;
                        if (i20 != 0) {
                            a0 = ob6.a0(null, null, 2131748488, ob6.G(i20, "Days", new Object[0]));
                        } else if (i22 != 0) {
                            a0 = ob6.a0(null, null, 2131748488, ob6.G(i20, "Hours", new Object[0]));
                        } else {
                            a0 = ob6.a0(null, null, 2131748488, ob6.G(i23, "Minutes", new Object[0]));
                        }
                    }
                }
                CharSequence[] charSequenceArr = new CharSequence[2];
                charSequenceArr[c] = spannableStringBuilder;
                charSequenceArr[c2] = a0;
                alertDialog$Builder3.a.U = hl.m0(S2, charSequenceArr);
                alertDialog$Builder3.j(ob6.M0(2131748490, null), new e05(df6Var, (byte) 26));
                alertDialog$Builder3.g(ob6.M0(2131752570, null), null);
                alertDialog$Builder3.o();
                return;
            case 8:
                lf6 lf6Var = (lf6) this.b;
                Context context3 = (Context) this.c;
                qh6 qh6Var = lf6Var.E;
                if (qh6Var.W.getTag() == null) {
                    if (lf6Var.n.has_recovery) {
                        qh6Var.B1(0, true);
                        TLRPC.TL_auth_requestPasswordRecovery tL_auth_requestPasswordRecovery = new TLRPC.TL_auth_requestPasswordRecovery();
                        i3 = ((e) qh6Var).currentAccount;
                        ConnectionsManager.getInstance(i3).sendRequest(tL_auth_requestPasswordRecovery, new jf6(lf6Var, (byte) 1), 10);
                        return;
                    }
                    hl.t1(lf6Var.a);
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(context3);
                    alertDialog$Builder4.a.S = ob6.M0(2131745798, null);
                    alertDialog$Builder4.a.U = ob6.M0(2131745800, null);
                    alertDialog$Builder4.j(ob6.M0(2131752006, null), null);
                    alertDialog$Builder4.g(ob6.M0(2131745844, null), new e05(lf6Var, (byte) 27));
                    alertDialog$Builder4.o();
                    return;
                }
                return;
            case 9:
                tg6 tg6Var = (tg6) this.b;
                Context context4 = (Context) this.c;
                Bundle bundle3 = tg6Var.r0;
                if (bundle3 != null && (tL_auth_sentCode = tg6Var.s0) != null) {
                    tg6Var.v0.q1(bundle3, tL_auth_sentCode, true);
                    return;
                } else if (!tg6Var.g0) {
                    rg6 rg6Var = tg6Var.w;
                    if ((rg6Var == null || rg6Var.getVisibility() == 8) && !tg6Var.l0) {
                        if (tg6Var.j0 == 0) {
                            TLRPC.TL_auth_reportMissingCode tL_auth_reportMissingCode = new TLRPC.TL_auth_reportMissingCode();
                            tL_auth_reportMissingCode.phone_number = tg6Var.d;
                            tL_auth_reportMissingCode.phone_code_hash = tg6Var.c;
                            tL_auth_reportMissingCode.mnc = "";
                            try {
                                String networkOperator = ((TelephonyManager) a.b.getSystemService("phone")).getNetworkOperator();
                                if (!TextUtils.isEmpty(networkOperator)) {
                                    networkOperator.substring(0, 3);
                                    tL_auth_reportMissingCode.mnc = networkOperator.substring(3);
                                }
                                i4 = 1;
                            } catch (Exception e) {
                                i4 = 1;
                                cc4.g(e, true);
                            }
                            tg6Var.v0.getConnectionsManager().sendRequest(tL_auth_reportMissingCode, null, 8);
                            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(context4);
                            alertDialog$Builder5.a.S = ob6.M0(2131745798, null);
                            Object[] objArr = new Object[i4];
                            objArr[0] = tg6Var.b;
                            alertDialog$Builder5.a.U = hl.S2(ob6.a0(null, null, 2131751410, objArr));
                            alertDialog$Builder5.h(ob6.M0(2131751411, null), new u34(tg6Var, context4, (byte) 26));
                            alertDialog$Builder5.j(ob6.M0(2131752006, null), null);
                            alertDialog$Builder5.g(ob6.M0(2131751413, null), new ig6(tg6Var, (byte) 1));
                            alertDialog$Builder5.o();
                            return;
                        } else if (tg6Var.v0.W.getTag() == null) {
                            tg6Var.v();
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                } else {
                    return;
                }
            case 10:
                ph6 ph6Var = (ph6) this.b;
                Context context5 = (Context) this.c;
                Toast toast = ph6Var.R;
                if (toast != null) {
                    toast.cancel();
                    ph6Var.R = null;
                }
                long currentTimeMillis = System.currentTimeMillis();
                int i24 = ph6Var.P;
                if (i24 > 0 && currentTimeMillis - ph6Var.Q > 1500) {
                    i5 = 0;
                    ph6Var.P = 0;
                    i6 = 0;
                } else {
                    i5 = 0;
                    i6 = i24;
                }
                int i25 = i6 + 1;
                ph6Var.P = i25;
                ph6Var.Q = currentTimeMillis;
                if (i25 >= 5) {
                    ph6Var.P = i5;
                    ph6Var.Q = 0L;
                    AlertDialog$Builder alertDialog$Builder6 = new AlertDialog$Builder(ph6Var.getContext());
                    alertDialog$Builder6.a.S = ob6.M0(2131745214, null);
                    if (f11.a) {
                        i7 = 2131751604;
                    } else {
                        i7 = 2131751596;
                    }
                    alertDialog$Builder6.e(new String[]{ob6.M0(i7, null), ob6.M0(2131751578, null)}, new s20(ph6Var, (byte) 2));
                    alertDialog$Builder6.o();
                    return;
                } else if (i25 > 1) {
                    Toast makeText = Toast.makeText(context5, ob6.G(5 - i25, "DebugMenuLoginToast", new Object[0]), 0);
                    ph6Var.R = makeText;
                    makeText.show();
                    return;
                } else {
                    return;
                }
            case 11:
                r47 r47Var = (r47) this.c;
                z67 z67Var = ((x67) this.b).d;
                if (!z67Var.c0(r47Var)) {
                    z67Var.getOrCreateStoryViewer().J(z67Var.getParentActivity(), r47Var.l, l6b.a(z67Var.f));
                    return;
                }
                return;
            case 12:
                iz0 iz0Var = (iz0) this.c;
                if (!((ms7) this.b).g2) {
                    iz0Var.run();
                    return;
                }
                return;
            case 13:
                pt7 pt7Var = (pt7) this.b;
                pcc pccVar = (pcc) this.c;
                c51 c51Var = pt7Var.q1;
                if (c51Var.e0 && !c51Var.R) {
                    hl.t1(pt7Var.n1);
                    pccVar.a(Long.valueOf(pt7Var.s1));
                    return;
                }
                return;
            case 14:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                atomicBoolean.set(!atomicBoolean.get());
                int selectionStart = passcodeActivity.h.getSelectionStart();
                int selectionEnd = passcodeActivity.h.getSelectionEnd();
                EditTextBoldCursor editTextBoldCursor = passcodeActivity.h;
                if (atomicBoolean.get()) {
                    i8 = 144;
                } else {
                    i8 = 128;
                }
                editTextBoldCursor.setInputType(i8 | 1);
                passcodeActivity.h.setSelection(selectionStart, selectionEnd);
                ImageView imageView2 = passcodeActivity.s;
                if (atomicBoolean.get()) {
                    i9 = aob.l6;
                } else {
                    i9 = aob.H6;
                }
                yob.s(imageView2, i9, null, PorterDuff.Mode.SRC_ATOP);
                return;
            case 15:
                ((p) this.b).n0(view, (String) this.c);
                return;
            case 16:
                o68 o68Var = (o68) this.b;
                ((ccb) o68Var.A1).h(new xk8(o68Var.t0.f, 14, false));
                ((nx0) this.c).dismiss();
                return;
            case 17:
                o68 o68Var2 = (o68) this.b;
                b7b b7bVar = (b7b) this.c;
                lcb lcbVar = o68Var2.t0;
                if (b7bVar.b != null) {
                    Bundle bundle4 = new Bundle();
                    int i26 = (b7bVar.b.longValue() > 0L ? 1 : (b7bVar.b.longValue() == 0L ? 0 : -1));
                    Long l = b7bVar.b;
                    if (i26 >= 0) {
                        bundle4.putLong("user_id", l.longValue());
                    } else {
                        bundle4.putLong("chat_id", -l.longValue());
                    }
                    if (b7bVar.e && (num = b7bVar.d) != null) {
                        bundle4.putInt("message_id", num.intValue());
                        lcbVar.L(new zu1(bundle4));
                        return;
                    }
                    lcbVar.L(new ProfileActivity(bundle4, null));
                    return;
                }
                v21 Q = new d31(o68Var2.M0, o68Var2.l0).Q(2131624012, 36, ob6.M0(2131744318, null));
                Q.a = 3;
                Q.k(true);
                return;
            case 18:
                o68 o68Var3 = ((j68) this.b).x;
                ly3 alert = ((u7b) this.c).getAlert();
                if (alert != null && (k68Var = o68Var3.A1) != null) {
                    ((ccb) k68Var).h(alert);
                    o68Var3.d1.a();
                    return;
                }
                return;
            case 19:
                r78 r78Var = (r78) this.b;
                vnb vnbVar = (vnb) this.c;
                ArrayList arrayList = r78Var.F1;
                ArrayList arrayList2 = r78Var.G1;
                e eVar4 = r78Var.s1;
                TLRPC.TL_userContact_old2 tL_userContact_old2 = r78Var.H1;
                if (r78Var.D1) {
                    AlertDialog$Builder alertDialog$Builder7 = new AlertDialog$Builder(r78Var.getContext());
                    alertDialog$Builder7.a.S = ob6.M0(2131754437, null);
                    alertDialog$Builder7.g(ob6.M0(2131752570, null), null);
                    alertDialog$Builder7.e(new CharSequence[]{ob6.M0(2131751682, null), ob6.M0(2131754368, null)}, new n78(r78Var));
                    alertDialog$Builder7.o();
                    return;
                }
                if (!tL_userContact_old2.restriction_reason.isEmpty()) {
                    sb = new StringBuilder(tL_userContact_old2.restriction_reason.get(0).text);
                    j = 0;
                } else {
                    j = 0;
                    sb = new StringBuilder(String.format(Locale.US, "BEGIN:VCARD\nVERSION:3.0\nFN:%1$s\nEND:VCARD", lv2.m(0, tL_userContact_old2.first_name, tL_userContact_old2.last_name)));
                }
                int lastIndexOf2 = sb.lastIndexOf("END:VCARD");
                if (lastIndexOf2 >= 0) {
                    tL_userContact_old2.phone = null;
                    int size = arrayList2.size() - 1;
                    while (size >= 0) {
                        gl glVar = (gl) arrayList2.get(size);
                        boolean z5 = glVar.d;
                        int i27 = i12;
                        ?? r8 = glVar.a;
                        if (z5) {
                            if (tL_userContact_old2.phone == null) {
                                tL_userContact_old2.phone = glVar.c(z3);
                            }
                            for (int i28 = z3; i28 < r8.size(); i28++) {
                                sb.insert(lastIndexOf2, ((String) r8.get(i28)) + "\n");
                            }
                        }
                        size--;
                        i12 = i27;
                        z3 = false;
                    }
                    i10 = i12;
                    for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                        gl glVar2 = (gl) arrayList.get(size2);
                        boolean z6 = glVar2.d;
                        ArrayList arrayList3 = glVar2.a;
                        if (z6) {
                            for (int size3 = arrayList3.size() - 1; size3 >= 0; size3 += -1) {
                                sb.insert(lastIndexOf2, ((String) arrayList3.get(size3)) + "\n");
                            }
                        }
                    }
                    tL_userContact_old2.restriction_reason.clear();
                    TLRPC.RestrictionReason restrictionReason = new TLRPC.RestrictionReason();
                    restrictionReason.text = sb.toString();
                    restrictionReason.reason = "";
                    restrictionReason.platform = "";
                    tL_userContact_old2.restriction_reason.add(restrictionReason);
                } else {
                    i10 = 1;
                }
                boolean z7 = eVar4 instanceof zu1;
                if (z7) {
                    zu1 zu1Var = (zu1) eVar4;
                    if (zu1Var.X7()) {
                        jj.J(r78Var.getContext(), zu1Var.a(), new h78(r78Var), vnbVar);
                        return;
                    }
                }
                if (z7) {
                    j2 = ((zu1) eVar4).a();
                } else {
                    j2 = j;
                }
                jj.X(r78Var.a, j2, i10, new ii7(r78Var, (byte) 14));
                return;
            case 20:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                fu5 fu5Var = (fu5) this.c;
                Drawable[] drawableArr = PhotoViewer.d9;
                if (photoViewer.S4 != null) {
                    fu5Var.u();
                    e eVar5 = photoViewer.l4;
                    if (eVar5 instanceof zu1) {
                        ((zu1) eVar5).Z9(photoViewer.S4, false, true);
                    }
                    m01.t(photoViewer.F, Uri.parse(photoViewer.S4.T0), true, false, false, null, null, false, uc7.s1(photoViewer.U).k4.I2.f, false, false);
                    return;
                }
                return;
            case 21:
                a(view);
                return;
            case 22:
                a72.f0((zu1) this.c, 41026, new ii7((xg8) this.b, (byte) 15), null);
                return;
            case 23:
                ((fu5) this.b).L((fu5) this.c);
                return;
            case 24:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                privacySettingsActivity.getClass();
                ((AlertDialog$Builder) this.c).a.M0.run();
                Integer num3 = (Integer) view.getTag();
                if (num3.intValue() == 0) {
                    i11 = 30;
                } else if (num3.intValue() == 1) {
                    i11 = 90;
                } else if (num3.intValue() == 2) {
                    i11 = 182;
                } else if (num3.intValue() == 3) {
                    i11 = 365;
                } else if (num3.intValue() == 4) {
                    i11 = 548;
                } else if (num3.intValue() == 5) {
                    i11 = 730;
                } else {
                    i11 = 0;
                }
                id idVar = new id(3, null, privacySettingsActivity.getParentActivity());
                idVar.j0 = false;
                idVar.show();
                TL_account.setAccountTTL setaccountttl = new TL_account.setAccountTTL();
                TLRPC.TL_accountDaysTTL tL_accountDaysTTL = new TLRPC.TL_accountDaysTTL();
                setaccountttl.ttl = tL_accountDaysTTL;
                tL_accountDaysTTL.days = i11;
                privacySettingsActivity.getConnectionsManager().sendRequest(setaccountttl, new qn8(privacySettingsActivity, idVar, setaccountttl, (byte) 0));
                return;
            case 25:
                zn8 zn8Var = (zn8) this.b;
                b29 b29Var = (b29) this.c;
                boolean z8 = zn8Var.w;
                zn8Var.w = !z8;
                if (!z8) {
                    b29Var.H(36);
                    b29Var.K(69);
                } else {
                    b29Var.H(69);
                    b29Var.K(99);
                }
                b29Var.start();
                return;
            case 26:
                RectF rectF = ProfileActivity.Z6;
                v21.e();
                m01.u(((ProfileActivity) this.b).getParentActivity(), ((TL_fragment.TL_collectibleInfo) this.c).url);
                return;
            case 27:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                RectF rectF2 = ProfileActivity.Z6;
                long j3 = profileActivity.e1;
                long j4 = profileActivity.E1;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = chat.default_banned_rights;
                TLRPC.ChannelParticipant channelParticipant = profileActivity.H2;
                if (channelParticipant != null) {
                    tL_chatBannedRights = channelParticipant.banned_rights;
                }
                pd2 pd2Var = new pd2(j3, j4, null, tL_chatBannedRights2, tL_chatBannedRights, "", 1, true, false, null);
                pd2Var.Y0 = new gq8(profileActivity, chat, pd2Var);
                profileActivity.presentFragment(pd2Var);
                return;
            case 28:
                b(view);
                return;
            default:
                ox8 ox8Var = (ox8) this.b;
                Context context6 = (Context) this.c;
                StringBuilder sb2 = new StringBuilder();
                String obj2 = ox8Var.a[0].getText().toString();
                String obj3 = ox8Var.a[3].getText().toString();
                String obj4 = ox8Var.a[2].getText().toString();
                String obj5 = ox8Var.a[1].getText().toString();
                String obj6 = ox8Var.a[4].getText().toString();
                try {
                    if (ox8Var.w == 3) {
                        m66 a = jx8.a();
                        a.o(ox8Var.w);
                        if (obj2 == null) {
                            obj2 = "";
                        }
                        a.c = obj2;
                        if (obj6 != null) {
                            str2 = obj6;
                        }
                        a.f = str2;
                        ox8Var.a0(context6, a.c().e());
                        return;
                    }
                    if (!TextUtils.isEmpty(obj2)) {
                        sb2.append("server=");
                        sb2.append(URLEncoder.encode(obj2, "UTF-8"));
                    }
                    if (!TextUtils.isEmpty(obj5)) {
                        if (sb2.length() != 0) {
                            sb2.append("&");
                        }
                        sb2.append("port=");
                        sb2.append(URLEncoder.encode(obj5, "UTF-8"));
                    }
                    if (ox8Var.w == 2) {
                        str = "https://t.me/proxy?";
                        if (sb2.length() != 0) {
                            sb2.append("&");
                        }
                        sb2.append("secret=");
                        sb2.append(URLEncoder.encode(obj6, "UTF-8"));
                    } else {
                        str = "https://t.me/socks?";
                        if (!TextUtils.isEmpty(obj4)) {
                            if (sb2.length() != 0) {
                                sb2.append("&");
                            }
                            sb2.append("user=");
                            sb2.append(URLEncoder.encode(obj4, "UTF-8"));
                        }
                        if (!TextUtils.isEmpty(obj3)) {
                            if (sb2.length() != 0) {
                                sb2.append("&");
                            }
                            sb2.append("pass=");
                            sb2.append(URLEncoder.encode(obj3, "UTF-8"));
                        }
                    }
                    if (sb2.length() != 0) {
                        ox8Var.a0(context6, str.concat(sb2.toString()));
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
        }
    }
}
