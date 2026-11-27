package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.o;
public abstract class uq7 {
    public static nx0 a;

    public static d31 a() {
        Context context;
        Context context2;
        e S = LaunchActivity.S();
        HashSet hashSet = xw0.b1;
        if (!hashSet.isEmpty()) {
            Iterator it = hashSet.iterator();
            xw0 xw0Var = null;
            while (it.hasNext()) {
                xw0 xw0Var2 = (xw0) it.next();
                if (xw0Var2.a1) {
                    xw0Var = xw0Var2;
                }
            }
            if (xw0Var != null) {
                if (S != null && S.getParentActivity() != null) {
                    context2 = S.getParentActivity();
                } else {
                    context2 = LaunchActivity.H1;
                    if (context2 == null) {
                        context2 = a.b;
                    }
                }
                return new d31(o11.a(context2), null);
            }
        }
        HashSet hashSet2 = o.d1;
        if (!hashSet2.isEmpty()) {
            Iterator it2 = hashSet2.iterator();
            o oVar = null;
            while (it2.hasNext()) {
                o oVar2 = (o) it2.next();
                if (oVar2.W) {
                    oVar = oVar2;
                }
            }
            if (oVar != null) {
                if (S != null && S.getParentActivity() != null) {
                    context = S.getParentActivity();
                } else {
                    context = LaunchActivity.H1;
                    if (context == null) {
                        context = a.b;
                    }
                }
                return new d31(o11.a(context), null);
            }
        }
        if (S != null && S.getLastSheet() != null && S.getLastSheet().j() != null) {
            return S.getLastSheet().j();
        }
        return d31.b0(S);
    }

    public static void b(boolean z, int i, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, TLRPC.UrlAuthResult urlAuthResult, String str, TLRPC.UrlAuthResult urlAuthResult2, String str2, boolean z2, rv0 rv0Var) {
        final Context context;
        vnb vnbVar;
        String str3;
        boolean z3;
        ?? r8;
        boolean z4;
        wkb wkbVar;
        String str4;
        c51 c51Var;
        c51 c51Var2;
        ArrayList arrayList;
        e S;
        String str5;
        e S2;
        Context context2;
        if (urlAuthResult instanceof TLRPC.TL_urlAuthResultAccepted) {
            TLRPC.TL_urlAuthResultAccepted tL_urlAuthResultAccepted = (TLRPC.TL_urlAuthResultAccepted) urlAuthResult;
            if (rv0Var == null || (!TextUtils.isEmpty(tL_messages_requestUrlAuth.in_app_origin) && TextUtils.equals(rv0Var.getOriginHost(), tL_messages_requestUrlAuth.in_app_origin))) {
                if (!TextUtils.isEmpty(tL_urlAuthResultAccepted.url)) {
                    if (rv0Var != null) {
                        rv0Var.v("oauth_result_confirmed", rv0.x(tL_urlAuthResultAccepted.url, "result_url"));
                        return;
                    }
                    e S3 = LaunchActivity.S();
                    if (S3 != null) {
                        m01.w(S3.getContext(), tL_urlAuthResultAccepted.url, true);
                        return;
                    }
                    return;
                }
                boolean z5 = urlAuthResult2 instanceof TLRPC.TL_urlAuthResultRequest;
                if (z5) {
                    TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) urlAuthResult2;
                    if (tL_urlAuthResultRequest.is_app) {
                        str5 = !TextUtils.isEmpty(tL_urlAuthResultRequest.verified_app_name) ? tL_urlAuthResultRequest.verified_app_name : ob6.M0(2131743480, null);
                    } else {
                        str5 = tL_urlAuthResultRequest.domain;
                    }
                } else {
                    str5 = null;
                }
                if (!TextUtils.isEmpty(str5)) {
                    a().I(2131623990, ob6.M0(2131753119, null), hl.L2(aob.w0(null, aob.xj, false), ob6.a0(null, null, z5 && ((TLRPC.TL_urlAuthResultRequest) urlAuthResult2).request_phone_number && !z2 ? 2131753118 : 2131753120, str5))).j();
                }
                if (rv0Var != null) {
                    rv0Var.v("oauth_result_confirmed", rv0.x(null, "result_url"));
                } else if (z && (S2 = LaunchActivity.S()) != null && (context2 = S2.getContext()) != null) {
                    hl.d3(new xf1(context2, (byte) 5), 800L);
                }
            }
        } else if (urlAuthResult instanceof TLRPC.TL_urlAuthResultDefault) {
            if (rv0Var != null) {
                return;
            }
            if (!TextUtils.isEmpty(tL_messages_requestUrlAuth.url)) {
                e S4 = LaunchActivity.S();
                if (S4 != null) {
                    jj.n0(S4, tL_messages_requestUrlAuth.url, false, urlAuthResult2 == null);
                }
            } else if (!TextUtils.isEmpty(str) && (S = LaunchActivity.S()) != null) {
                jj.n0(S, str, false, urlAuthResult2 == null);
            }
        } else if (urlAuthResult instanceof TLRPC.TL_urlAuthResultRequest) {
            final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest2 = (TLRPC.TL_urlAuthResultRequest) urlAuthResult;
            final e S5 = LaunchActivity.S();
            if (S5 == null || (context = S5.getContext()) == null) {
                return;
            }
            vnb resourceProvider = S5.getResourceProvider();
            nx0 h = uh9.h(1, S5.getResourceProvider(), context, false);
            FrameLayout frameLayout = new FrameLayout(context);
            h.O = frameLayout;
            ArrayList arrayList2 = new ArrayList();
            boolean isTestBackend = ConnectionsManager.getInstance(i).isTestBackend();
            arrayList2.clear();
            for (int i2 = 0; i2 < 4; i2++) {
                if (yac.h(i2).o() && ConnectionsManager.getInstance(i2).isTestBackend() == isTestBackend) {
                    arrayList2.add(Integer.valueOf(i2));
                }
            }
            Collections.sort(arrayList2, new qq7((byte) 0));
            boolean z6 = tL_messages_requestUrlAuth.peer != null;
            boolean z7 = tL_urlAuthResultRequest2.is_app;
            FrameLayout frameLayout2 = new FrameLayout(context);
            FrameLayout frameLayout3 = new FrameLayout(context);
            int L = hl.L(14.0f);
            int i3 = aob.i5;
            Drawable b0 = aob.b0(L, S5.getThemedColor(i3));
            uob M = yob.M(i3);
            frameLayout3.setBackground(b0);
            yob.j(frameLayout3, b0, M, null, resourceProvider);
            de0 de0Var = new de0(context);
            de0Var.setRoundRadius(hl.L(14.0f));
            de0Var.getImageReceiver().B0 = true;
            rb0 rb0Var = new rb0((vnb) null);
            final int[] iArr = {i};
            TLRPC.User f = yac.h(iArr[0]).f();
            rb0Var.q(f);
            de0Var.f(f, rb0Var);
            frameLayout3.addView(de0Var, tre.e(28, 28, 115));
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int i4 = aob.r5;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            yob.s(imageView, i4, resourceProvider, mode);
            imageView.setImageResource(2131230873);
            frameLayout3.addView(imageView, tre.d(18, 18.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
            frameLayout2.addView(frameLayout3, tre.e(52, 28, 17));
            ArrayList arrayList3 = arrayList2;
            frameLayout2.setPadding(hl.L(8.0f), hl.L(4.0f), hl.L(8.0f), 0);
            frameLayout.addView(frameLayout2, tre.q(-2, -2, 0.0f, 51, 6, 4, 6, 0));
            iye.a(frameLayout2);
            if (arrayList3.size() <= 1 || tL_messages_requestUrlAuth.peer != null) {
                frameLayout2.setVisibility(8);
            }
            LinearLayout j = uh9.j(context, 1);
            frameLayout.addView(j, tre.e(-1, -1, 119));
            de0 de0Var2 = new de0(context);
            de0Var2.setRoundRadius(hl.L(40.0f));
            rb0 rb0Var2 = new rb0((vnb) null);
            rb0Var2.q(tL_urlAuthResultRequest2.bot);
            de0Var2.f(tL_urlAuthResultRequest2.bot, rb0Var2);
            j.addView(de0Var2, tre.t(80, 80, 49, 0, 21, 0, 16));
            if (tL_urlAuthResultRequest2.is_app) {
                if (TextUtils.isEmpty(tL_urlAuthResultRequest2.verified_app_name)) {
                    vnbVar = null;
                    str3 = ob6.M0(2131743480, null);
                } else {
                    str3 = tL_urlAuthResultRequest2.verified_app_name;
                    vnbVar = null;
                }
            } else {
                vnbVar = null;
                str3 = tL_urlAuthResultRequest2.domain;
            }
            int i5 = aob.j5;
            TextView b = zze.b(context, 20.0f, i5, true, vnbVar);
            b.setGravity(17);
            final String str6 = str3;
            b.setText(hl.M2(ob6.a0(null, null, 2131753106, str3), aob.Fi, S5.getResourceProvider(), null, false));
            j.addView(b, tre.s(-1, -2, 49, 32.0f, 0.0f, 32.0f, 9.66f));
            TextView b2 = zze.b(context, 14.0f, i5, false, null);
            b2.setGravity(17);
            b2.setText(hl.S2(ob6.M0(z7 ? 2131753127 : z6 ? 2131753125 : 2131753107, null)));
            j.addView(b2, tre.t(-1, -2, 49, 32, 0, 32, 24));
            if (TextUtils.isEmpty(tL_urlAuthResultRequest2.platform) && TextUtils.isEmpty(tL_urlAuthResultRequest2.browser) && TextUtils.isEmpty(tL_urlAuthResultRequest2.region) && TextUtils.isEmpty(tL_urlAuthResultRequest2.ip)) {
                z3 = z7;
            } else {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setClipToPadding(false);
                linearLayout.setClipChildren(false);
                linearLayout.setOrientation(1);
                int L2 = hl.L(16.0f);
                int i6 = aob.d6;
                Drawable d0 = aob.d0(L2, S5.getThemedColor(i6));
                uob M2 = yob.M(i6);
                linearLayout.setBackground(d0);
                yob.j(linearLayout, d0, M2, null, resourceProvider);
                j.addView(linearLayout, tre.t(-1, -2, 55, 9, -3, 9, -3));
                if (TextUtils.isEmpty(tL_urlAuthResultRequest2.platform) && TextUtils.isEmpty(tL_urlAuthResultRequest2.browser)) {
                    z3 = z7;
                } else {
                    LinearLayout j2 = uh9.j(context, 0);
                    ImageView imageView2 = new ImageView(context);
                    imageView2.setImageResource(2131232028);
                    yob.s(imageView2, i5, resourceProvider, mode);
                    j2.addView(imageView2, tre.t(24, 24, 19, 17, 0, 20, 0));
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.setOrientation(1);
                    j2.addView(linearLayout2, tre.s(-1, -2, 55, 0.0f, 10.66f, 20.0f, 11.0f));
                    TextView b3 = zze.b(context, 16.0f, i5, false, null);
                    b3.setText(TextUtils.isEmpty(tL_urlAuthResultRequest2.platform) ? "—" : tL_urlAuthResultRequest2.platform);
                    linearLayout2.addView(b3, tre.s(-1, -2, 55, 0.0f, 0.0f, 0.0f, 4.33f));
                    TextView b4 = zze.b(context, 13.0f, aob.y6, false, null);
                    b4.setText(TextUtils.isEmpty(tL_urlAuthResultRequest2.browser) ? "—" : tL_urlAuthResultRequest2.browser);
                    z3 = z7;
                    linearLayout2.addView(b4, tre.r(-1, -2, 55));
                    linearLayout.addView(j2, tre.o(-1, -2));
                }
                if (TextUtils.isEmpty(tL_urlAuthResultRequest2.region) && TextUtils.isEmpty(tL_urlAuthResultRequest2.ip)) {
                    r8 = 0;
                    z4 = false;
                } else {
                    LinearLayout j3 = uh9.j(context, 0);
                    ImageView imageView3 = new ImageView(context);
                    imageView3.setImageResource(2131232034);
                    yob.s(imageView3, i5, resourceProvider, mode);
                    j3.addView(imageView3, tre.t(24, 24, 19, 17, 0, 20, 0));
                    LinearLayout linearLayout3 = new LinearLayout(context);
                    linearLayout3.setOrientation(1);
                    j3.addView(linearLayout3, tre.s(-1, -2, 55, 0.0f, 10.66f, 20.0f, 11.0f));
                    TextView b5 = zze.b(context, 16.0f, i5, false, null);
                    b5.setText(TextUtils.isEmpty(tL_urlAuthResultRequest2.region) ? "—" : tL_urlAuthResultRequest2.region);
                    linearLayout3.addView(b5, tre.s(-1, -2, 55, 0.0f, 0.0f, 0.0f, 4.33f));
                    r8 = 0;
                    z4 = false;
                    TextView b6 = zze.b(context, 13.0f, aob.y6, false, null);
                    b6.setText(TextUtils.isEmpty(tL_urlAuthResultRequest2.ip) ? "—" : ob6.a0(null, null, 2131753126, tL_urlAuthResultRequest2.ip));
                    linearLayout3.addView(b6, tre.r(-1, -2, 55));
                    linearLayout.addView(j3, tre.o(-1, -2));
                }
                TextView b7 = zze.b(context, 14.0f, aob.y6, z4, r8);
                b7.setText(ob6.M0(2131753124, r8));
                j.addView(b7, tre.t(-1, -2, 55, 22, 5, 22, 20));
            }
            if (tL_urlAuthResultRequest2.request_write_access) {
                FrameLayout frameLayout4 = new FrameLayout(context);
                int L3 = hl.L(16.0f);
                int i7 = aob.d6;
                InsetDrawable d02 = aob.d0(L3, S5.getThemedColor(i7));
                uob M3 = yob.M(i7);
                frameLayout4.setBackground(d02);
                yob.j(frameLayout4, d02, M3, null, resourceProvider);
                wkb wkbVar2 = new wkb(context, S5.getResourceProvider());
                wkbVar2.f(ob6.M0(2131753129, null), true, false);
                int themedColor = S5.getThemedColor(i7);
                int i8 = aob.i6;
                hf0 Z = aob.Z(themedColor, S5.getThemedColor(i8), 16, 16);
                uob M4 = yob.M(i7);
                uob M5 = yob.M(i8);
                wkbVar2.setBackground(Z);
                yob.j(wkbVar2, Z, M4, M5, resourceProvider);
                wkbVar2.setOnClickListener(new am7(wkbVar2, (byte) 1));
                frameLayout4.addView(wkbVar2, tre.e(-1, -1, 119));
                j.addView(frameLayout4, tre.t(-1, -2, 7, 9, -3, 9, -3));
                TextView b8 = zze.b(context, 14.0f, aob.y6, false, null);
                b8.setText(ob6.a0(null, null, 2131753128, lbc.r(tL_urlAuthResultRequest2.bot)));
                j.addView(b8, tre.t(-1, -2, 55, 22, 6, 22, 20));
                wkbVar = wkbVar2;
            } else {
                wkbVar = null;
            }
            LinearLayout j4 = uh9.j(context, 0);
            c51 c51Var3 = new c51(S5.getResourceProvider(), context, true);
            c51Var3.setRoundRadius(24);
            int i9 = aob.p7;
            c51Var3.setColor(S5.getThemedColor(i9));
            if (c51Var3.getBackground() != null) {
                Drawable background = c51Var3.getBackground();
                uob M6 = yob.M(i9);
                c51Var3.setBackground(background);
                str4 = null;
                yob.j(c51Var3, background, M6, null, resourceProvider);
            } else {
                str4 = null;
            }
            c51Var3.setText(ob6.M0(2131751569, str4));
            j4.addView(c51Var3, tre.q(-1, 48, 1.0f, 119, 0, 0, 5, 0));
            c51 c51Var4 = new c51(S5.getResourceProvider(), context, true);
            c51Var4.setRoundRadius(24);
            c51Var4.setText(ob6.M0(2131753117, null));
            j4.addView(c51Var4, tre.q(-1, 48, 1.0f, 119, 5, 0, 0, 0));
            j.addView(j4, tre.t(-1, -2, 7, 12, 12, 12, 8));
            h.z0 = new tq7(c51Var4);
            boolean[] zArr = {false};
            nx0[] nx0VarArr = {null};
            TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = {null};
            h.t0(aob.a7);
            String[] strArr = {str2};
            wkb wkbVar3 = wkbVar;
            rq7 rq7Var = new rq7(iArr, c51Var4, c51Var3, tL_messages_requestUrlAuth, h, z, str, urlAuthResult2, strArr, z2, rv0Var, str6, resourceProvider);
            c51 c51Var5 = c51Var4;
            c51 c51Var6 = c51Var3;
            if (tL_urlAuthResultRequest2.user_id_hint != 0 && yac.h(i).e() != tL_urlAuthResultRequest2.user_id_hint) {
                int size = arrayList3.size();
                int i10 = 0;
                while (i10 < size) {
                    arrayList = arrayList3;
                    Object obj = arrayList.get(i10);
                    i10++;
                    Integer num = (Integer) obj;
                    c51Var = c51Var5;
                    c51Var2 = c51Var6;
                    if (yac.h(num.intValue()).e() == tL_urlAuthResultRequest2.user_id_hint) {
                        rq7Var.a(num);
                        break;
                    }
                    c51Var6 = c51Var2;
                    c51Var5 = c51Var;
                    arrayList3 = arrayList;
                }
            }
            c51Var = c51Var5;
            c51Var2 = c51Var6;
            arrayList = arrayList3;
            frameLayout2.setOnClickListener(new nh(h, frameLayout3, arrayList, iArr, rq7Var, (byte) 10));
            boolean[] zArr2 = new boolean[1];
            final c51 c51Var7 = c51Var2;
            final c51 c51Var8 = c51Var;
            c51Var7.setOnClickListener(new l63(c51Var8, tL_messages_requestUrlAuth, zArr2, h, c51Var7, rv0Var, i));
            final boolean[] zArr3 = new boolean[1];
            final te teVar = new te(tL_urlAuthResultRequest2, strArr, context, i, new sq7(c51Var8, c51Var7, tL_urlAuthResultRequest2, inputtonconnectoauthsessionArr, tL_messages_requestUrlAuth, strArr, wkbVar3, zArr3, zArr, iArr, zArr2, h, str6, resourceProvider, z, str, rv0Var), S5, (byte) 7);
            final boolean z8 = z6;
            final boolean z9 = z3;
            c51Var8.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    String str7;
                    if (!c51.this.R && !c51Var7.R) {
                        TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest3 = tL_urlAuthResultRequest2;
                        boolean z10 = tL_urlAuthResultRequest3.request_phone_number;
                        final te teVar2 = teVar;
                        if (z10) {
                            TLRPC.User f2 = yac.h(iArr[0]).f();
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, S5.getResourceProvider(), context);
                            String M0 = ob6.M0(2131753113, null);
                            id idVar = alertDialog$Builder.a;
                            idVar.S = M0;
                            if (z8 && !z9) {
                                str7 = lbc.r(tL_urlAuthResultRequest3.bot);
                            } else {
                                str7 = str6;
                            }
                            f78 f3 = f78.f();
                            idVar.U = hl.S2(ob6.a0(null, null, 2131753110, str7, f3.e("+" + f2.phone).replaceAll(" ", " ")));
                            String M02 = ob6.M0(2131753111, null);
                            final boolean[] zArr4 = zArr3;
                            alertDialog$Builder.g(M02, new fd() {
                                @Override
                                public final void w(id idVar2, int i11) {
                                    byte b9 = r3;
                                    te teVar3 = teVar2;
                                    boolean[] zArr5 = zArr4;
                                    switch (b9) {
                                        case 0:
                                            zArr5[0] = false;
                                            teVar3.run();
                                            return;
                                        default:
                                            zArr5[0] = true;
                                            teVar3.run();
                                            return;
                                    }
                                }
                            });
                            alertDialog$Builder.j(ob6.M0(2131753112, null), new fd() {
                                @Override
                                public final void w(id idVar2, int i11) {
                                    byte b9 = r3;
                                    te teVar3 = teVar2;
                                    boolean[] zArr5 = zArr4;
                                    switch (b9) {
                                        case 0:
                                            zArr5[0] = false;
                                            teVar3.run();
                                            return;
                                        default:
                                            zArr5[0] = true;
                                            teVar3.run();
                                            return;
                                    }
                                }
                            });
                            alertDialog$Builder.c(-2);
                            alertDialog$Builder.o();
                            return;
                        }
                        teVar2.run();
                    }
                }
            });
            h.setOnDismissListener(new mu0(zArr, inputtonconnectoauthsessionArr, nx0VarArr, new nx0[1]));
            nx0 nx0Var = a;
            if (nx0Var != null) {
                nx0Var.dismiss();
                a = null;
            }
            x35 x35Var = new x35(tL_urlAuthResultRequest2, h, nx0VarArr, context, iArr, resourceProvider, zArr, inputtonconnectoauthsessionArr, teVar);
            if (tL_urlAuthResultRequest2.match_codes_first && !tL_urlAuthResultRequest2.match_codes.isEmpty() && TextUtils.isEmpty(strArr[0])) {
                a = c(context, i, tL_urlAuthResultRequest2.match_codes, str6, new pq7(context, strArr, tL_messages_requestUrlAuth, i, x35Var, str6, resourceProvider), false, new y36(zArr2, rv0Var, tL_messages_requestUrlAuth, i, (byte) 15), S5.getResourceProvider());
            } else {
                x35Var.run();
            }
        }
    }

    public static nx0 c(Context context, int i, ArrayList arrayList, String str, pcc pccVar, boolean z, Runnable runnable, vnb vnbVar) {
        int i2;
        int i3;
        ya1 ya1Var;
        int i4;
        nx0[] nx0VarArr = new nx0[1];
        nx0 h = uh9.h(1, null, context, false);
        LinearLayout j = uh9.j(context, 1);
        h.O = j;
        TextView textView = new TextView(context);
        textView.setTypeface(hl.o());
        textView.setGravity(17);
        textView.setTextSize(1, 18.0f);
        yob.X(textView, aob.G6, vnbVar);
        j.addView(textView, tre.t(-1, -2, 1, 0, 25, 0, 19));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setPadding(0, hl.L(19.0f), 0, hl.L(19.0f));
        j.addView(linearLayout, tre.t(-1, -2, 1, 0, 0, 0, 0));
        if (ConnectionsManager.getInstance(i).isTestBackend()) {
            i2 = 0;
            while (i2 < 4) {
                if (yac.h(i2).o() && !ConnectionsManager.getInstance(i2).isTestBackend()) {
                    break;
                }
                i2++;
            }
        }
        i2 = i;
        de0[] de0VarArr = new de0[arrayList.size()];
        boolean z2 = true;
        int i5 = 0;
        while (i5 < arrayList.size()) {
            String str2 = (String) arrayList.get(i5);
            FrameLayout frameLayout = new FrameLayout(context);
            int L = hl.L(70.0f);
            int i6 = aob.G6;
            nx0 nx0Var = h;
            int i7 = i5;
            ShapeDrawable K = aob.K(L, aob.p1(0.05f, aob.v0(i6, vnbVar)));
            uob K2 = yob.K(0.05f, i6);
            frameLayout.setBackground(K);
            yob.j(frameLayout, K, K2, null, vnbVar);
            lv3 f = pv3.f(str2);
            if (f == null) {
                ya1Var = new ya1(new pkb(str2, 30.0f, hl.o()), vnbVar, (byte) 3);
                z2 = false;
            } else {
                ya1Var = f;
            }
            de0 de0Var = new de0(context);
            de0VarArr[i7] = de0Var;
            de0Var.getImageReceiver().d = i2;
            de0Var.j(null, null, null, null, ya1Var, null);
            jn7.i(de0Var);
            frameLayout.addView(de0Var, tre.e(40, 40, 17));
            if (i7 == 0) {
                i4 = 0;
            } else {
                i4 = 24;
            }
            linearLayout.addView(frameLayout, tre.t(70, 70, 16, i4, 0, 0, 0));
            iye.a(frameLayout);
            frameLayout.setOnClickListener(new lw4(nx0VarArr, pccVar, str2, (byte) 10));
            i5 = i7 + 1;
            h = nx0Var;
        }
        nx0 nx0Var2 = h;
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
        ls6.d0(i2).m0(tL_inputStickerSetShortName, null, false, false, new v35(arrayList, de0VarArr, (byte) 11));
        if (z2) {
            i3 = 2131753108;
        } else {
            i3 = 2131753109;
        }
        textView.setText(ob6.M0(i3, null));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setTextSize(1, 12.0f);
        yob.X(textView2, aob.y6, vnbVar);
        textView2.setText(hl.M2(ob6.a0(null, null, 2131753116, str), aob.Fi, null, null, false));
        j.addView(textView2, tre.t(-1, -2, 1, 0, 23, 0, 11));
        c51 i8 = xnb.i(24, vnbVar, context, true);
        if (z) {
            i8.e();
            i8.setText(ob6.M0(2131752570, null));
        } else {
            int i9 = aob.p7;
            i8.setColor(aob.v0(i9, vnbVar));
            if (i8.getBackground() != null) {
                Drawable background = i8.getBackground();
                uob M = yob.M(i9);
                i8.setBackground(background);
                yob.j(i8, background, M, null, vnbVar);
            }
            i8.setText(ob6.M0(2131751569, null));
        }
        j.addView(i8, tre.t(-1, 48, 7, 12, 12, 12, 12));
        i8.setOnClickListener(new lw4(i8, nx0VarArr, runnable, (byte) 11));
        nx0Var2.show();
        nx0VarArr[0] = nx0Var2;
        return nx0Var2;
    }
}
