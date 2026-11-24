package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
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
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.p;
public final class v16 implements View.OnClickListener {
    public final byte a;
    public final Object b;
    public final Object c;

    public v16(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    private final void a(View view) {
        boolean z;
        st8 st8Var = (st8) this.c;
        h45 h45Var = (h45) this.b;
        if (st8Var.K.getTag() == null) {
            int max = (int) Math.max(1.0f, st8Var.getValue());
            qa6 qa6Var = (qa6) h45Var.b;
            TLRPC.User user = (TLRPC.User) h45Var.c;
            if (qa6Var.getLocationController().h(qa6Var.m0) == null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qa6Var.getParentActivity());
                String M0 = k96.M0(2131745261, null);
                hd hdVar = alertDialog$Builder.a;
                hdVar.S = M0;
                hdVar.U = k96.M0(2131745262, null);
                alertDialog$Builder.j(k96.M0(2131745263, null), new yf(qa6Var, user, max, (byte) 7));
                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                qa6Var.showDialog(hdVar);
                z = false;
            } else {
                qa6Var.O.M = true;
                qa6Var.c.setImageResource(2131232216);
                qa6Var.q0().k(0L, 24, Integer.valueOf(max), user, null, null);
                qa6Var.getLocationController().o(max, qa6Var.m0, true);
                z = true;
            }
            if (z) {
                st8Var.a();
            }
        }
    }

    private final void b(View view) {
        String str;
        fu8 fu8Var = (fu8) this.c;
        Context context = (Context) this.b;
        StringBuilder sb = new StringBuilder();
        String obj = fu8Var.a[0].getText().toString();
        String obj2 = fu8Var.a[3].getText().toString();
        String obj3 = fu8Var.a[2].getText().toString();
        String obj4 = fu8Var.a[1].getText().toString();
        String obj5 = fu8Var.a[4].getText().toString();
        try {
            if (fu8Var.w == 3) {
                i46 a = au8.a();
                a.o(fu8Var.w);
                if (obj == null) {
                    obj = "";
                }
                a.c = obj;
                if (obj5 == null) {
                    obj5 = "";
                }
                a.f = obj5;
                fu8Var.a0(context, a.c().e());
                return;
            }
            if (!TextUtils.isEmpty(obj)) {
                sb.append("server=");
                sb.append(URLEncoder.encode(obj, "UTF-8"));
            }
            if (!TextUtils.isEmpty(obj4)) {
                if (sb.length() != 0) {
                    sb.append("&");
                }
                sb.append("port=");
                sb.append(URLEncoder.encode(obj4, "UTF-8"));
            }
            if (fu8Var.w == 2) {
                str = "https://t.me/proxy?";
                if (sb.length() != 0) {
                    sb.append("&");
                }
                sb.append("secret=");
                sb.append(URLEncoder.encode(obj5, "UTF-8"));
            } else {
                str = "https://t.me/socks?";
                if (!TextUtils.isEmpty(obj3)) {
                    if (sb.length() != 0) {
                        sb.append("&");
                    }
                    sb.append("user=");
                    sb.append(URLEncoder.encode(obj3, "UTF-8"));
                }
                if (!TextUtils.isEmpty(obj2)) {
                    if (sb.length() != 0) {
                        sb.append("&");
                    }
                    sb.append("pass=");
                    sb.append(URLEncoder.encode(obj2, "UTF-8"));
                }
            }
            if (sb.length() != 0) {
                fu8Var.a0(context, str.concat(sb.toString()));
            }
        } catch (Exception unused) {
        }
    }

    private final void c(View view) {
        zu8 zu8Var = (zu8) this.c;
        Context context = (Context) this.b;
        Uri B0 = gl.B0(zu8Var.l1, "qr_tmp.png", Bitmap.CompressFormat.PNG);
        if (B0 != null) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("image/*");
            intent.putExtra("android.intent.extra.STREAM", B0);
            try {
                gl.W(context).startActivityForResult(Intent.createChooser(intent, zu8Var.m0.getText()), 500);
            } catch (ActivityNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public final void onClick(View view) {
        int i;
        char c;
        String a0;
        int i2;
        TLRPC.TL_auth_sentCode tL_auth_sentCode;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Integer num;
        t28 t28Var;
        StringBuilder sb;
        long j;
        int i8;
        int i9;
        int i10;
        int i11 = 8;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = null;
        boolean z = false;
        int i12 = 0;
        switch (this.a) {
            case 0:
                h26 h26Var = (h26) this.c;
                Context context = (Context) this.b;
                d dVar = h26Var.F2;
                int i13 = h26Var.c2;
                if (i13 != 11 && i13 != 34) {
                    if (i13 != 19 && i13 != 32 && !h26Var.j1()) {
                        if (i13 != 18 && i13 != 20 && i13 != 24 && i13 != 25 && i13 != 26 && i13 != 29 && i13 != 22 && i13 != 23 && i13 != 21 && i13 != 27 && i13 != 28 && i13 != 30 && i13 != 35) {
                            if (!y6c.h(h26Var.a).p() && !na7.q1(h26Var.a).F3() && !h26Var.I2) {
                                if (dVar != null) {
                                    if (dVar.getVisibleDialog() != null) {
                                        dVar.getVisibleDialog().dismiss();
                                    }
                                    dVar.presentFragment(new PremiumPreviewFragment(0, h26.l1(i13)));
                                    h26Var.dismiss();
                                    return;
                                }
                                return;
                            }
                            h26Var.dismiss();
                            return;
                        }
                        gl.g(h26Var.b1());
                        h26Var.dismiss();
                        return;
                    }
                    ng1 ng1Var = h26Var.X1;
                    if (ng1Var.b) {
                        if (y6c.h(h26Var.a).p() && on0.k()) {
                            ym0.i(h26Var.V1, h26Var);
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, h26Var.J0, context);
                        alertDialog$Builder.a.S = k96.M0(2131746841, null);
                        if (h26Var.i1()) {
                            i = 2131746839;
                        } else {
                            i = 2131746840;
                        }
                        alertDialog$Builder.a.U = gl.S2(k96.M0(i, null));
                        alertDialog$Builder.j(k96.M0(2131752140, null), new t16(h26Var, (byte) 0));
                        alertDialog$Builder.g(k96.M0(2131752577, null), new wn4((byte) 28));
                        alertDialog$Builder.o();
                        return;
                    } else if (ng1Var.a) {
                        if (ng1Var.c == 0) {
                            if (ng1Var.e && on0.k()) {
                                h26Var.a2 = true;
                                h26Var.s2.e0 = false;
                                d dVar2 = h26Var.r1;
                                ng1 ng1Var2 = h26Var.X1;
                                u19 u19Var = new u19(dVar2, ng1Var2.h, ng1Var2.k);
                                u19Var.show();
                                u19Var.I0 = new n1(h26Var, (byte) 24);
                                return;
                            }
                            h26Var.Z0();
                            return;
                        }
                        ?? frameLayout = new FrameLayout(h26Var.getContext());
                        be0 be0Var = new be0(h26Var.getContext());
                        be0Var.setRoundRadius(gl.L(30.0f));
                        frameLayout.addView(be0Var, nme.c(60.0f, 60));
                        frameLayout.setClipChildren(false);
                        Paint paint = new Paint(1);
                        paint.setColor(bkb.w0(null, bkb.g5, false));
                        frameLayout.addView(new s71(h26Var.getContext(), paint, h26Var.getContext().getDrawable(2131231129)), nme.d(28, 28.0f, 0, 34.0f, 34.0f, 0.0f, 0.0f));
                        ImageView imageView = new ImageView(h26Var.getContext());
                        imageView.setImageResource(2131232061);
                        zkb.s(imageView, bkb.l6, null, PorterDuff.Mode.SRC_ATOP);
                        frameLayout.addView(imageView, nme.e(24, 24, 17));
                        be0 be0Var2 = new be0(h26Var.getContext());
                        be0Var2.setRoundRadius(gl.L(30.0f));
                        frameLayout.addView(be0Var2, nme.d(60, 60.0f, 0, 96.0f, 0.0f, 0.0f, 0.0f));
                        ?? frameLayout2 = new FrameLayout(h26Var.getContext());
                        frameLayout2.addView(frameLayout, nme.e(-2, 60, 1));
                        frameLayout2.setClipChildren(false);
                        TextView textView = new TextView(context);
                        textView.setLetterSpacing(0.025f);
                        zkb.X(textView, bkb.i5, null);
                        textView.setTextSize(1, 16.0f);
                        frameLayout2.addView(textView, nme.t(-1, -2, 0, 24, 80, 24, 0));
                        pb0 pb0Var = new pb0((wjb) null);
                        TLRPC.Chat K0 = na7.q1(h26Var.a).K0(Long.valueOf(-h26Var.X1.c));
                        pb0Var.p(K0);
                        be0Var.f(K0, pb0Var);
                        pb0 pb0Var2 = new pb0((wjb) null);
                        TLRPC.Chat K02 = na7.q1(h26Var.a).K0(Long.valueOf(-h26Var.V1));
                        pb0Var2.p(K02);
                        be0Var2.f(K02, pb0Var2);
                        ?? alertDialog$Builder2 = new AlertDialog$Builder(context);
                        alertDialog$Builder2.n(frameLayout2);
                        de9.r("ReplaceBoostChannelDescription", null, 2131746077, new Object[]{K0.title, K02.title}, textView);
                        alertDialog$Builder2.j(k96.M0(2131746079, null), new t16(h26Var, (byte) 1));
                        alertDialog$Builder2.g(k96.M0(2131752577, null), new wn4((byte) 29));
                        alertDialog$Builder2.o();
                        return;
                    } else {
                        int i14 = ng1Var.f;
                        if (i14 != 0) {
                            ym0.g(i14);
                            return;
                        }
                        return;
                    }
                }
                return;
            case 1:
                ij.x((Context) this.b, k96.M0(2131750865, null), k96.M0(2131745318, null), -1L, new i36((s36) this.c, (byte) 0));
                return;
            case 2:
                s36 s36Var = (s36) this.c;
                Runnable[] runnableArr = (Runnable[]) this.b;
                if (s36Var.e == null) {
                    p36 p36Var = s36Var.f;
                    if (p36Var.e.h) {
                        int i15 = -s36Var.N;
                        s36Var.N = i15;
                        gl.A3(i15, p36Var, null);
                        return;
                    }
                    ahb ahbVar = (ahb) view;
                    Switch r5 = ahbVar.e;
                    ahbVar.setChecked(!r5.h);
                    q36 q36Var = s36Var.r;
                    if (r5.h) {
                        i11 = 0;
                    }
                    q36Var.setVisibility(i11);
                    gl.r(runnableArr[0]);
                    boolean z2 = r5.h;
                    p36 p36Var2 = s36Var.f;
                    if (z2) {
                        p36Var2.setChecked(false);
                        s36Var.f.setCheckBoxIcon(2131232518);
                        s36Var.h.setText(k96.M0(2131754198, null));
                        l36 l36Var = new l36(s36Var, (byte) 1);
                        runnableArr[0] = l36Var;
                        gl.d3(l36Var, 60L);
                        return;
                    }
                    p36Var2.setCheckBoxIcon(0);
                    s36Var.h.setText(k96.M0(2131754199, null));
                    l36 l36Var2 = new l36(s36Var, (byte) 2);
                    runnableArr[0] = l36Var2;
                    gl.c3(l36Var2);
                    return;
                }
                return;
            case 3:
                qa6 qa6Var = (qa6) this.c;
                qa6Var.A0((la6) this.b);
                ka6 ka6Var = qa6Var.P0;
                if (ka6Var != null) {
                    ka6Var.dismiss();
                    return;
                }
                return;
            case 4:
                ad6 ad6Var = (ad6) this.c;
                Context context2 = (Context) this.b;
                String string = ad6Var.E.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    ?? obj = new Object();
                    obj.a |= 256;
                    obj.b = indexOf;
                    int i16 = lastIndexOf + 1;
                    obj.c = i16;
                    spannableStringBuilder.setSpan(new wib(obj, 0), indexOf, i16, 0);
                }
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context2);
                alertDialog$Builder3.a.S = k96.M0(2131748536, null);
                SpannableStringBuilder S2 = gl.S2(k96.M0(2131748540, null));
                int i17 = ad6Var.H;
                int i18 = i17 / 86400;
                int i19 = i17 % 86400;
                int i20 = i19 / 3600;
                int i21 = (i19 % 3600) / 60;
                if (i18 == 0 && i20 == 0) {
                    i21 = Math.max(1, i21);
                }
                if (i18 != 0 && i20 != 0) {
                    c = 0;
                    a0 = k96.a0(null, null, 2131748543, k96.G(i18, "Days", new Object[0]), k96.G(i20, "Hours", new Object[0]));
                } else {
                    c = 0;
                    if (i20 != 0 && i21 != 0) {
                        a0 = k96.a0(null, null, 2131748543, k96.G(i20, "Hours", new Object[0]), k96.G(i21, "Minutes", new Object[0]));
                    } else if (i18 != 0) {
                        a0 = k96.a0(null, null, 2131748542, k96.G(i18, "Days", new Object[0]));
                    } else if (i20 != 0) {
                        a0 = k96.a0(null, null, 2131748542, k96.G(i18, "Hours", new Object[0]));
                    } else {
                        a0 = k96.a0(null, null, 2131748542, k96.G(i21, "Minutes", new Object[0]));
                    }
                }
                CharSequence[] charSequenceArr = new CharSequence[2];
                charSequenceArr[c] = spannableStringBuilder;
                charSequenceArr[1] = a0;
                alertDialog$Builder3.a.U = gl.m0(S2, charSequenceArr);
                alertDialog$Builder3.j(k96.M0(2131748544, null), new ry4(ad6Var, (byte) 24));
                alertDialog$Builder3.g(k96.M0(2131752577, null), null);
                alertDialog$Builder3.o();
                return;
            case 5:
                jd6 jd6Var = (jd6) this.c;
                Context context3 = (Context) this.b;
                mf6 mf6Var = jd6Var.E;
                if (mf6Var.W.getTag() == null) {
                    if (jd6Var.n.has_recovery) {
                        mf6Var.A1(0, true);
                        TLRPC.TL_auth_requestPasswordRecovery tL_auth_requestPasswordRecovery = new TLRPC.TL_auth_requestPasswordRecovery();
                        i2 = ((d) mf6Var).currentAccount;
                        ConnectionsManager.getInstance(i2).sendRequest(tL_auth_requestPasswordRecovery, new hd6(jd6Var, (byte) 1), 10);
                        return;
                    }
                    gl.t1(jd6Var.a);
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(context3);
                    alertDialog$Builder4.a.S = k96.M0(2131745878, null);
                    alertDialog$Builder4.a.U = k96.M0(2131745880, null);
                    alertDialog$Builder4.j(k96.M0(2131752029, null), null);
                    alertDialog$Builder4.g(k96.M0(2131745924, null), new ry4(jd6Var, (byte) 25));
                    alertDialog$Builder4.o();
                    return;
                }
                return;
            case 6:
                qe6 qe6Var = (qe6) this.c;
                Context context4 = (Context) this.b;
                Bundle bundle = qe6Var.r0;
                if (bundle != null && (tL_auth_sentCode = qe6Var.s0) != null) {
                    qe6Var.v0.p1(bundle, tL_auth_sentCode, true);
                    return;
                } else if (!qe6Var.g0) {
                    oe6 oe6Var = qe6Var.w;
                    if ((oe6Var == null || oe6Var.getVisibility() == 8) && !qe6Var.l0) {
                        if (qe6Var.j0 == 0) {
                            TLRPC.TL_auth_reportMissingCode tL_auth_reportMissingCode = new TLRPC.TL_auth_reportMissingCode();
                            tL_auth_reportMissingCode.phone_number = qe6Var.d;
                            tL_auth_reportMissingCode.phone_code_hash = qe6Var.c;
                            tL_auth_reportMissingCode.mnc = "";
                            try {
                                String networkOperator = ((TelephonyManager) a.b.getSystemService("phone")).getNetworkOperator();
                                if (!TextUtils.isEmpty(networkOperator)) {
                                    networkOperator.substring(0, 3);
                                    tL_auth_reportMissingCode.mnc = networkOperator.substring(3);
                                }
                            } catch (Exception e) {
                                fa4.g(e, true);
                            }
                            qe6Var.v0.getConnectionsManager().sendRequest(tL_auth_reportMissingCode, null, 8);
                            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(context4);
                            alertDialog$Builder5.a.S = k96.M0(2131745878, null);
                            alertDialog$Builder5.a.U = gl.S2(k96.a0(null, null, 2131751433, qe6Var.b));
                            alertDialog$Builder5.h(k96.M0(2131751434, null), new h45(qe6Var, context4, (byte) 21));
                            alertDialog$Builder5.j(k96.M0(2131752029, null), null);
                            alertDialog$Builder5.g(k96.M0(2131751436, null), new ge6(qe6Var, (byte) 1));
                            alertDialog$Builder5.o();
                            return;
                        } else if (qe6Var.v0.W.getTag() == null) {
                            qe6Var.v();
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                } else {
                    return;
                }
            case 7:
                lf6 lf6Var = (lf6) this.c;
                Context context5 = (Context) this.b;
                Toast toast = lf6Var.R;
                if (toast != null) {
                    toast.cancel();
                    lf6Var.R = null;
                }
                long currentTimeMillis = System.currentTimeMillis();
                int i22 = lf6Var.P;
                if (i22 > 0 && currentTimeMillis - lf6Var.Q > 1500) {
                    i3 = 0;
                    lf6Var.P = 0;
                    i4 = 0;
                } else {
                    i3 = 0;
                    i4 = i22;
                }
                int i23 = i4 + 1;
                lf6Var.P = i23;
                lf6Var.Q = currentTimeMillis;
                if (i23 >= 5) {
                    lf6Var.P = i3;
                    lf6Var.Q = 0L;
                    AlertDialog$Builder alertDialog$Builder6 = new AlertDialog$Builder(lf6Var.getContext());
                    alertDialog$Builder6.a.S = k96.M0(2131745294, null);
                    if (w01.a) {
                        i5 = 2131751627;
                    } else {
                        i5 = 2131751619;
                    }
                    alertDialog$Builder6.e(new String[]{k96.M0(i5, null), k96.M0(2131751601, null)}, new r20(lf6Var, (byte) 2));
                    alertDialog$Builder6.o();
                    return;
                } else if (i23 > 1) {
                    Toast makeText = Toast.makeText(context5, k96.G(5 - i23, "DebugMenuLoginToast", new Object[0]), 0);
                    lf6Var.R = makeText;
                    makeText.show();
                    return;
                } else {
                    return;
                }
            case 8:
                k27 k27Var = (k27) this.b;
                s47 s47Var = ((q47) this.c).d;
                if (!s47Var.c0(k27Var)) {
                    s47Var.getOrCreateStoryViewer().J(s47Var.getParentActivity(), k27Var.l, p2b.a(s47Var.f));
                    return;
                }
                return;
            case 9:
                az0 az0Var = (az0) this.b;
                if (!((mp7) this.c).g2) {
                    az0Var.run();
                    return;
                }
                return;
            case 10:
                jq7 jq7Var = (jq7) this.c;
                p8c p8cVar = (p8c) this.b;
                u41 u41Var = jq7Var.q1;
                if (u41Var.e0 && !u41Var.R) {
                    gl.t1(jq7Var.n1);
                    p8cVar.a(Long.valueOf(jq7Var.s1));
                    return;
                }
                return;
            case 11:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.c;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                atomicBoolean.set(!atomicBoolean.get());
                int selectionStart = passcodeActivity.h.getSelectionStart();
                int selectionEnd = passcodeActivity.h.getSelectionEnd();
                EditTextBoldCursor editTextBoldCursor = passcodeActivity.h;
                if (atomicBoolean.get()) {
                    i6 = 144;
                } else {
                    i6 = 128;
                }
                editTextBoldCursor.setInputType(i6 | 1);
                passcodeActivity.h.setSelection(selectionStart, selectionEnd);
                ImageView imageView2 = passcodeActivity.s;
                if (atomicBoolean.get()) {
                    i7 = bkb.k6;
                } else {
                    i7 = bkb.G6;
                }
                zkb.s(imageView2, i7, null, PorterDuff.Mode.SRC_ATOP);
                return;
            case 12:
                ((p) this.c).n0(view, (String) this.b);
                return;
            case 13:
                y28 y28Var = (y28) this.c;
                f3b f3bVar = (f3b) this.b;
                m8b m8bVar = y28Var.z0;
                if (f3bVar.b != null) {
                    Bundle bundle2 = new Bundle();
                    int i24 = (f3bVar.b.longValue() > 0L ? 1 : (f3bVar.b.longValue() == 0L ? 0 : -1));
                    Long l = f3bVar.b;
                    if (i24 >= 0) {
                        bundle2.putLong("user_id", l.longValue());
                    } else {
                        bundle2.putLong("chat_id", -l.longValue());
                    }
                    if (f3bVar.e && (num = f3bVar.d) != null) {
                        bundle2.putInt("message_id", num.intValue());
                        m8bVar.L(new mu1(bundle2));
                        return;
                    }
                    m8bVar.L(new ProfileActivity(bundle2, null));
                    return;
                }
                m21 Q = new u21(y28Var.S0, y28Var.r0).Q(2131624012, 36, k96.M0(2131744424, null));
                Q.a = (byte) 3;
                Q.k(true);
                return;
            case 14:
                y28 y28Var2 = (y28) this.c;
                ((d8b) y28Var2.G1).h(new jh8(y28Var2.z0.f, 14, false));
                ((fx0) this.b).dismiss();
                return;
            case 15:
                y28 y28Var3 = ((s28) this.c).x;
                qx3 alert = ((x3b) this.b).getAlert();
                if (alert != null && (t28Var = y28Var3.G1) != null) {
                    ((d8b) t28Var).h(alert);
                    y28Var3.j1.a();
                    return;
                }
                return;
            case 16:
                b48 b48Var = (b48) this.c;
                wjb wjbVar = (wjb) this.b;
                ArrayList arrayList = b48Var.F1;
                ArrayList arrayList2 = b48Var.G1;
                d dVar3 = b48Var.s1;
                TLRPC.TL_userContact_old2 tL_userContact_old2 = b48Var.H1;
                if (b48Var.D1) {
                    AlertDialog$Builder alertDialog$Builder7 = new AlertDialog$Builder(b48Var.getContext());
                    alertDialog$Builder7.a.S = k96.M0(2131754441, null);
                    alertDialog$Builder7.g(k96.M0(2131752577, null), null);
                    alertDialog$Builder7.e(new CharSequence[]{k96.M0(2131751705, null), k96.M0(2131754372, null)}, new x38(b48Var));
                    alertDialog$Builder7.o();
                    return;
                }
                if (!tL_userContact_old2.restriction_reason.isEmpty()) {
                    sb = new StringBuilder(tL_userContact_old2.restriction_reason.get(0).text);
                } else {
                    sb = new StringBuilder(String.format(Locale.US, "BEGIN:VCARD\nVERSION:3.0\nFN:%1$s\nEND:VCARD", qu2.m(0, tL_userContact_old2.first_name, tL_userContact_old2.last_name)));
                }
                int lastIndexOf2 = sb.lastIndexOf("END:VCARD");
                if (lastIndexOf2 >= 0) {
                    tL_userContact_old2.phone = null;
                    int size = arrayList2.size() - 1;
                    while (size >= 0) {
                        fl flVar = (fl) arrayList2.get(size);
                        boolean z3 = flVar.d;
                        ?? r15 = flVar.a;
                        if (z3) {
                            if (tL_userContact_old2.phone == null) {
                                tL_userContact_old2.phone = flVar.c(z);
                            }
                            for (int i25 = z; i25 < r15.size(); i25++) {
                                sb.insert(lastIndexOf2, ((String) r15.get(i25)) + "\n");
                            }
                        }
                        size--;
                        z = false;
                    }
                    for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                        fl flVar2 = (fl) arrayList.get(size2);
                        boolean z4 = flVar2.d;
                        ArrayList arrayList3 = flVar2.a;
                        if (z4) {
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
                }
                boolean z5 = dVar3 instanceof mu1;
                if (z5) {
                    mu1 mu1Var = (mu1) dVar3;
                    if (mu1Var.P7()) {
                        ij.J(b48Var.getContext(), mu1Var.a(), new r38(b48Var), wjbVar);
                        return;
                    }
                }
                if (z5) {
                    j = ((mu1) dVar3).a();
                } else {
                    j = 0;
                }
                ij.X(b48Var.a, j, 1, new zf7(b48Var, (byte) 13));
                return;
            case 17:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                cs5 cs5Var = (cs5) this.b;
                Drawable[] drawableArr = PhotoViewer.d9;
                if (photoViewer.S4 != null) {
                    cs5Var.u();
                    d dVar4 = photoViewer.l4;
                    if (dVar4 instanceof mu1) {
                        ((mu1) dVar4).O9(photoViewer.S4, false, true);
                    }
                    d01.s(photoViewer.F, Uri.parse(photoViewer.S4.T0), true, false, false, null, null, false, na7.q1(photoViewer.U).k4.A2.f, false, false);
                    return;
                }
                return;
            case 18:
                PhotoViewer photoViewer2 = (PhotoViewer) this.c;
                Activity activity = (Activity) this.b;
                Drawable[] drawableArr2 = PhotoViewer.d9;
                if (!photoViewer2.K0() && !photoViewer2.r) {
                    int i26 = photoViewer2.O4;
                    if (i26 >= 0 && i26 < photoViewer2.f7.size()) {
                        Object obj2 = photoViewer2.f7.get(photoViewer2.O4);
                        if (obj2 instanceof jm6) {
                            jm6 jm6Var = (jm6) obj2;
                            if (!jm6Var.b || jm6Var.d()) {
                                jm6Var.z = Boolean.valueOf(!jm6Var.c());
                                photoViewer2.k1.setPhotoState(jm6Var.c());
                                boolean c2 = jm6Var.c();
                                je5 je5Var = photoViewer2.l1;
                                if (je5Var != null) {
                                    je5Var.f(true);
                                    photoViewer2.l1 = null;
                                }
                                if (photoViewer2.F != null) {
                                    photoViewer2.l1 = new je5(photoViewer2.F, 3);
                                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x ");
                                    if (c2) {
                                        i8 = 2131747068;
                                    } else {
                                        i8 = 2131747067;
                                    }
                                    SpannableStringBuilder append = spannableStringBuilder2.append((CharSequence) k96.M0(i8, null));
                                    if (c2) {
                                        i9 = 2131231871;
                                    } else {
                                        i9 = 2131231873;
                                    }
                                    append.setSpan(new cm2(i9, 0), 0, 1, 33);
                                    photoViewer2.l1.t(append);
                                    photoViewer2.f0.addView(photoViewer2.l1, nme.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 48.0f));
                                    photoViewer2.l1.setTranslationY(photoViewer2.Q0.getTranslationY());
                                    photoViewer2.l1.o(0.0f, (photoViewer2.k1.getWidth() / 2.0f) + photoViewer2.k1.getX() + photoViewer2.I0.getX());
                                    je5 je5Var2 = photoViewer2.l1;
                                    je5Var2.r0 = new hh(je5Var2, (byte) 6);
                                    je5Var2.d = 3500L;
                                    je5Var2.v();
                                }
                                gba.d1 = jm6Var.c();
                                a.b.getSharedPreferences("mainconfig", 0).edit().putBoolean("photoHighQualityDefault", gba.d1).apply();
                                return;
                            }
                        }
                    }
                    if (photoViewer2.k1.getTag() == null) {
                        if (photoViewer2.p8) {
                            jtb jtbVar = photoViewer2.n1;
                            jtb jtbVar2 = jtbVar;
                            if (jtbVar == null) {
                                ?? r6 = photoViewer2.f0;
                                ?? textView2 = new TextView(activity);
                                textView2.d = new cib(textView2, (byte) 10);
                                textView2.setBackgroundDrawable(bkb.b0(gl.L(3.0f), -871296751));
                                textView2.setTextColor(-1);
                                textView2.setTextSize(1, 14.0f);
                                textView2.setPadding(gl.L(8.0f), gl.L(7.0f), gl.L(8.0f), gl.L(7.0f));
                                textView2.setGravity(16);
                                r6.addView(textView2, nme.d(-2, -2.0f, 51, 5.0f, 0.0f, 5.0f, 3.0f));
                                textView2.setVisibility(8);
                                photoViewer2.n1 = textView2;
                                jtbVar2 = textView2;
                            }
                            jtbVar2.setText(k96.M0(2131743344, "VideoQualityIsTooLow"));
                            jtb jtbVar3 = photoViewer2.n1;
                            iac iacVar = photoViewer2.k1;
                            cib cibVar = jtbVar3.d;
                            if (iacVar != null) {
                                jtbVar3.a = iacVar;
                                jtbVar3.a();
                                jtbVar3.c = true;
                                gl.r(cibVar);
                                gl.d3(cibVar, 2000L);
                                ViewPropertyAnimator viewPropertyAnimator = jtbVar3.b;
                                if (viewPropertyAnimator != null) {
                                    viewPropertyAnimator.setListener(null);
                                    jtbVar3.b.cancel();
                                    jtbVar3.b = null;
                                }
                                if (jtbVar3.getVisibility() != 0) {
                                    jtbVar3.setAlpha(0.0f);
                                    jtbVar3.setVisibility(0);
                                    ViewPropertyAnimator listener = jtbVar3.animate().setDuration(300L).alpha(1.0f).setListener(null);
                                    jtbVar3.b = listener;
                                    listener.start();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    photoViewer2.h2(true);
                    photoViewer2.x1(1);
                    return;
                }
                return;
            case 19:
                k62.g0((mu1) this.b, 41026, new zf7((jd8) this.c, (byte) 14), null);
                return;
            case 20:
                ((cs5) this.c).L((cs5) this.b);
                return;
            case 21:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.c;
                privacySettingsActivity.getClass();
                ((AlertDialog$Builder) this.b).a.M0.run();
                Integer num2 = (Integer) view.getTag();
                if (num2.intValue() == 0) {
                    i10 = 30;
                } else if (num2.intValue() == 1) {
                    i10 = 90;
                } else if (num2.intValue() == 2) {
                    i10 = 182;
                } else if (num2.intValue() == 3) {
                    i10 = 365;
                } else if (num2.intValue() == 4) {
                    i10 = 548;
                } else if (num2.intValue() == 5) {
                    i10 = 730;
                } else {
                    i10 = 0;
                }
                hd hdVar = new hd(3, null, privacySettingsActivity.getParentActivity());
                hdVar.j0 = false;
                hdVar.show();
                TL_account.setAccountTTL setaccountttl = new TL_account.setAccountTTL();
                TLRPC.TL_accountDaysTTL tL_accountDaysTTL = new TLRPC.TL_accountDaysTTL();
                setaccountttl.ttl = tL_accountDaysTTL;
                tL_accountDaysTTL.days = i10;
                privacySettingsActivity.getConnectionsManager().sendRequest(setaccountttl, new ck8(privacySettingsActivity, hdVar, setaccountttl, (byte) 0));
                return;
            case 22:
                mk8 mk8Var = (mk8) this.c;
                oy8 oy8Var = (oy8) this.b;
                boolean z6 = mk8Var.w;
                mk8Var.w = !z6;
                if (!z6) {
                    oy8Var.H(36);
                    oy8Var.K(69);
                } else {
                    oy8Var.H(69);
                    oy8Var.K(99);
                }
                oy8Var.start();
                return;
            case 23:
                RectF rectF = ProfileActivity.Z6;
                m21.e();
                d01.t(((ProfileActivity) this.c).getParentActivity(), ((TL_fragment.TL_collectibleInfo) this.b).url);
                return;
            case 24:
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.b;
                RectF rectF2 = ProfileActivity.Z6;
                long j2 = profileActivity.e1;
                long j3 = profileActivity.E1;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = chat.default_banned_rights;
                TLRPC.ChannelParticipant channelParticipant = profileActivity.H2;
                if (channelParticipant != null) {
                    tL_chatBannedRights = channelParticipant.banned_rights;
                }
                zc2 zc2Var = new zc2(j2, j3, null, tL_chatBannedRights2, tL_chatBannedRights, "", 1, true, false, null);
                zc2Var.Y0 = new vm8(profileActivity, chat, zc2Var);
                profileActivity.presentFragment(zc2Var);
                return;
            case 25:
                a(view);
                return;
            case 26:
                b(view);
                return;
            case 27:
                c(view);
                return;
            case 28:
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TEXT", (String) this.c);
                Intent createChooser = Intent.createChooser(intent, k96.M0(2131745266, null));
                createChooser.setFlags(268435456);
                ((Context) this.b).startActivity(createChooser);
                return;
            default:
                u19 u19Var2 = (u19) this.c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.b;
                ArrayList arrayList4 = u19Var2.S1;
                if (!arrayList4.isEmpty()) {
                    ez4 ez4Var = u19Var2.V1;
                    if (!ez4Var.R) {
                        ez4Var.setLoading(true);
                        ArrayList arrayList5 = new ArrayList();
                        HashSet hashSet = new HashSet();
                        int size4 = arrayList4.size();
                        while (i12 < size4) {
                            Object obj3 = arrayList4.get(i12);
                            i12++;
                            TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) obj3;
                            arrayList5.add(Integer.valueOf(tL_myBoost.slot));
                            hashSet.add(Long.valueOf(cf3.n(tL_myBoost.peer)));
                        }
                        on0.a(chat2.id, arrayList5, new au0(u19Var2, chat2, arrayList5, hashSet, (byte) 17), new zf7(u19Var2, (byte) 27));
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
