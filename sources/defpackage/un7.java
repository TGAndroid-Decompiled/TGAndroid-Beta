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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.o;
public abstract class un7 {
    public static fx0 a;

    public static u21 a() {
        Context context;
        Context context2;
        d S = LaunchActivity.S();
        HashSet hashSet = ow0.b1;
        if (!hashSet.isEmpty()) {
            Iterator it = hashSet.iterator();
            ow0 ow0Var = null;
            while (it.hasNext()) {
                ow0 ow0Var2 = (ow0) it.next();
                if (ow0Var2.a1) {
                    ow0Var = ow0Var2;
                }
            }
            if (ow0Var != null) {
                if (S != null && S.getParentActivity() != null) {
                    context2 = S.getParentActivity();
                } else {
                    context2 = LaunchActivity.H1;
                    if (context2 == null) {
                        context2 = a.b;
                    }
                }
                return new u21(f11.a(context2), null);
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
                return new u21(f11.a(context), null);
            }
        }
        if (S != null && S.getLastSheet() != null && S.getLastSheet().j() != null) {
            return S.getLastSheet().j();
        }
        return u21.b0(S);
    }

    public static void b(boolean z, int i, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, TLRPC.UrlAuthResult urlAuthResult, String str, TLRPC.UrlAuthResult urlAuthResult2, String str2, boolean z2, hv0 hv0Var) {
        final Context context;
        wjb wjbVar;
        String str3;
        boolean z3;
        ?? r8;
        boolean z4;
        ahb ahbVar;
        String str4;
        u41 u41Var;
        u41 u41Var2;
        ArrayList arrayList;
        d S;
        String str5;
        d S2;
        Context context2;
        if (urlAuthResult instanceof TLRPC.TL_urlAuthResultAccepted) {
            TLRPC.TL_urlAuthResultAccepted tL_urlAuthResultAccepted = (TLRPC.TL_urlAuthResultAccepted) urlAuthResult;
            if (hv0Var == null || (!TextUtils.isEmpty(tL_messages_requestUrlAuth.in_app_origin) && TextUtils.equals(hv0Var.getOriginHost(), tL_messages_requestUrlAuth.in_app_origin))) {
                if (!TextUtils.isEmpty(tL_urlAuthResultAccepted.url)) {
                    if (hv0Var != null) {
                        hv0Var.v("oauth_result_confirmed", hv0.x(tL_urlAuthResultAccepted.url, "result_url"));
                        return;
                    }
                    d S3 = LaunchActivity.S();
                    if (S3 != null) {
                        d01.v(S3.getContext(), tL_urlAuthResultAccepted.url, true);
                        return;
                    }
                    return;
                }
                boolean z5 = urlAuthResult2 instanceof TLRPC.TL_urlAuthResultRequest;
                if (z5) {
                    TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) urlAuthResult2;
                    if (tL_urlAuthResultRequest.is_app) {
                        str5 = !TextUtils.isEmpty(tL_urlAuthResultRequest.verified_app_name) ? tL_urlAuthResultRequest.verified_app_name : k96.M0(2131743586, null);
                    } else {
                        str5 = tL_urlAuthResultRequest.domain;
                    }
                } else {
                    str5 = null;
                }
                if (!TextUtils.isEmpty(str5)) {
                    a().I(2131623990, k96.M0(2131753123, null), gl.L2(bkb.w0(null, bkb.wj, false), k96.a0(null, null, z5 && ((TLRPC.TL_urlAuthResultRequest) urlAuthResult2).request_phone_number && !z2 ? 2131753122 : 2131753124, str5))).j();
                }
                if (hv0Var != null) {
                    hv0Var.v("oauth_result_confirmed", hv0.x(null, "result_url"));
                } else if (z && (S2 = LaunchActivity.S()) != null && (context2 = S2.getContext()) != null) {
                    gl.d3(new vf1(context2, (byte) 5), 800L);
                }
            }
        } else if (urlAuthResult instanceof TLRPC.TL_urlAuthResultDefault) {
            if (hv0Var != null) {
                return;
            }
            if (!TextUtils.isEmpty(tL_messages_requestUrlAuth.url)) {
                d S4 = LaunchActivity.S();
                if (S4 != null) {
                    ij.n0(S4, tL_messages_requestUrlAuth.url, false, urlAuthResult2 == null);
                }
            } else if (!TextUtils.isEmpty(str) && (S = LaunchActivity.S()) != null) {
                ij.n0(S, str, false, urlAuthResult2 == null);
            }
        } else if (urlAuthResult instanceof TLRPC.TL_urlAuthResultRequest) {
            final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest2 = (TLRPC.TL_urlAuthResultRequest) urlAuthResult;
            final d S5 = LaunchActivity.S();
            if (S5 == null || (context = S5.getContext()) == null) {
                return;
            }
            wjb resourceProvider = S5.getResourceProvider();
            fx0 h = de9.h(1, S5.getResourceProvider(), context, false);
            FrameLayout frameLayout = new FrameLayout(context);
            h.O = frameLayout;
            ArrayList arrayList2 = new ArrayList();
            boolean isTestBackend = ConnectionsManager.getInstance(i).isTestBackend();
            arrayList2.clear();
            for (int i2 = 0; i2 < 4; i2++) {
                if (y6c.h(i2).o() && ConnectionsManager.getInstance(i2).isTestBackend() == isTestBackend) {
                    arrayList2.add(Integer.valueOf(i2));
                }
            }
            Collections.sort(arrayList2, new el6((byte) 27));
            boolean z6 = tL_messages_requestUrlAuth.peer != null;
            boolean z7 = tL_urlAuthResultRequest2.is_app;
            FrameLayout frameLayout2 = new FrameLayout(context);
            FrameLayout frameLayout3 = new FrameLayout(context);
            int L = gl.L(14.0f);
            int i3 = bkb.h5;
            Drawable b0 = bkb.b0(L, S5.getThemedColor(i3));
            vkb M = zkb.M(i3);
            frameLayout3.setBackground(b0);
            zkb.j(frameLayout3, b0, M, null, resourceProvider);
            be0 be0Var = new be0(context);
            be0Var.setRoundRadius(gl.L(14.0f));
            be0Var.getImageReceiver().B0 = true;
            pb0 pb0Var = new pb0((wjb) null);
            final int[] iArr = {i};
            TLRPC.User f = y6c.h(iArr[0]).f();
            pb0Var.q(f);
            be0Var.f(f, pb0Var);
            frameLayout3.addView(be0Var, nme.e(28, 28, 115));
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int i4 = bkb.q5;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            zkb.s(imageView, i4, resourceProvider, mode);
            imageView.setImageResource(2131230873);
            frameLayout3.addView(imageView, nme.d(18, 18.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
            frameLayout2.addView(frameLayout3, nme.e(52, 28, 17));
            ArrayList arrayList3 = arrayList2;
            frameLayout2.setPadding(gl.L(8.0f), gl.L(4.0f), gl.L(8.0f), 0);
            frameLayout.addView(frameLayout2, nme.q(-2, -2, 0.0f, 51, 6, 4, 6, 0));
            ote.a(frameLayout2);
            if (arrayList3.size() <= 1 || tL_messages_requestUrlAuth.peer != null) {
                frameLayout2.setVisibility(8);
            }
            LinearLayout j = de9.j(context, 1);
            frameLayout.addView(j, nme.e(-1, -1, 119));
            be0 be0Var2 = new be0(context);
            be0Var2.setRoundRadius(gl.L(40.0f));
            pb0 pb0Var2 = new pb0((wjb) null);
            pb0Var2.q(tL_urlAuthResultRequest2.bot);
            be0Var2.f(tL_urlAuthResultRequest2.bot, pb0Var2);
            j.addView(be0Var2, nme.t(80, 80, 49, 0, 21, 0, 16));
            if (tL_urlAuthResultRequest2.is_app) {
                if (TextUtils.isEmpty(tL_urlAuthResultRequest2.verified_app_name)) {
                    wjbVar = null;
                    str3 = k96.M0(2131743586, null);
                } else {
                    str3 = tL_urlAuthResultRequest2.verified_app_name;
                    wjbVar = null;
                }
            } else {
                wjbVar = null;
                str3 = tL_urlAuthResultRequest2.domain;
            }
            int i5 = bkb.i5;
            TextView b = hve.b(context, 20.0f, i5, true, wjbVar);
            b.setGravity(17);
            final String str6 = str3;
            b.setText(gl.M2(k96.a0(null, null, 2131753110, str3), bkb.Ei, S5.getResourceProvider(), null, false));
            j.addView(b, nme.s(-1, -2, 49, 32.0f, 0.0f, 32.0f, 9.66f));
            TextView b2 = hve.b(context, 14.0f, i5, false, null);
            b2.setGravity(17);
            b2.setText(gl.S2(k96.M0(z7 ? 2131753131 : z6 ? 2131753129 : 2131753111, null)));
            j.addView(b2, nme.t(-1, -2, 49, 32, 0, 32, 24));
            if (TextUtils.isEmpty(tL_urlAuthResultRequest2.platform) && TextUtils.isEmpty(tL_urlAuthResultRequest2.browser) && TextUtils.isEmpty(tL_urlAuthResultRequest2.region) && TextUtils.isEmpty(tL_urlAuthResultRequest2.ip)) {
                z3 = z7;
            } else {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setClipToPadding(false);
                linearLayout.setClipChildren(false);
                linearLayout.setOrientation(1);
                int L2 = gl.L(16.0f);
                int i6 = bkb.c6;
                Drawable d0 = bkb.d0(L2, S5.getThemedColor(i6));
                vkb M2 = zkb.M(i6);
                linearLayout.setBackground(d0);
                zkb.j(linearLayout, d0, M2, null, resourceProvider);
                j.addView(linearLayout, nme.t(-1, -2, 55, 9, -3, 9, -3));
                if (TextUtils.isEmpty(tL_urlAuthResultRequest2.platform) && TextUtils.isEmpty(tL_urlAuthResultRequest2.browser)) {
                    z3 = z7;
                } else {
                    LinearLayout j2 = de9.j(context, 0);
                    ImageView imageView2 = new ImageView(context);
                    imageView2.setImageResource(2131232028);
                    zkb.s(imageView2, i5, resourceProvider, mode);
                    j2.addView(imageView2, nme.t(24, 24, 19, 17, 0, 20, 0));
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.setOrientation(1);
                    j2.addView(linearLayout2, nme.s(-1, -2, 55, 0.0f, 10.66f, 20.0f, 11.0f));
                    TextView b3 = hve.b(context, 16.0f, i5, false, null);
                    b3.setText(TextUtils.isEmpty(tL_urlAuthResultRequest2.platform) ? "—" : tL_urlAuthResultRequest2.platform);
                    linearLayout2.addView(b3, nme.s(-1, -2, 55, 0.0f, 0.0f, 0.0f, 4.33f));
                    TextView b4 = hve.b(context, 13.0f, bkb.x6, false, null);
                    b4.setText(TextUtils.isEmpty(tL_urlAuthResultRequest2.browser) ? "—" : tL_urlAuthResultRequest2.browser);
                    z3 = z7;
                    linearLayout2.addView(b4, nme.r(-1, -2, 55));
                    linearLayout.addView(j2, nme.o(-1, -2));
                }
                if (TextUtils.isEmpty(tL_urlAuthResultRequest2.region) && TextUtils.isEmpty(tL_urlAuthResultRequest2.ip)) {
                    r8 = 0;
                    z4 = false;
                } else {
                    LinearLayout j3 = de9.j(context, 0);
                    ImageView imageView3 = new ImageView(context);
                    imageView3.setImageResource(2131232034);
                    zkb.s(imageView3, i5, resourceProvider, mode);
                    j3.addView(imageView3, nme.t(24, 24, 19, 17, 0, 20, 0));
                    LinearLayout linearLayout3 = new LinearLayout(context);
                    linearLayout3.setOrientation(1);
                    j3.addView(linearLayout3, nme.s(-1, -2, 55, 0.0f, 10.66f, 20.0f, 11.0f));
                    TextView b5 = hve.b(context, 16.0f, i5, false, null);
                    b5.setText(TextUtils.isEmpty(tL_urlAuthResultRequest2.region) ? "—" : tL_urlAuthResultRequest2.region);
                    linearLayout3.addView(b5, nme.s(-1, -2, 55, 0.0f, 0.0f, 0.0f, 4.33f));
                    r8 = 0;
                    z4 = false;
                    TextView b6 = hve.b(context, 13.0f, bkb.x6, false, null);
                    b6.setText(TextUtils.isEmpty(tL_urlAuthResultRequest2.ip) ? "—" : k96.a0(null, null, 2131753130, tL_urlAuthResultRequest2.ip));
                    linearLayout3.addView(b6, nme.r(-1, -2, 55));
                    linearLayout.addView(j3, nme.o(-1, -2));
                }
                TextView b7 = hve.b(context, 14.0f, bkb.x6, z4, r8);
                b7.setText(k96.M0(2131753128, r8));
                j.addView(b7, nme.t(-1, -2, 55, 22, 5, 22, 20));
            }
            if (tL_urlAuthResultRequest2.request_write_access) {
                FrameLayout frameLayout4 = new FrameLayout(context);
                int L3 = gl.L(16.0f);
                int i7 = bkb.c6;
                InsetDrawable d02 = bkb.d0(L3, S5.getThemedColor(i7));
                vkb M3 = zkb.M(i7);
                frameLayout4.setBackground(d02);
                zkb.j(frameLayout4, d02, M3, null, resourceProvider);
                ahb ahbVar2 = new ahb(context, S5.getResourceProvider());
                ahbVar2.f(k96.M0(2131753133, null), true, false);
                int themedColor = S5.getThemedColor(i7);
                int i8 = bkb.h6;
                ff0 Z = bkb.Z(themedColor, S5.getThemedColor(i8), 16, 16);
                vkb M4 = zkb.M(i7);
                vkb M5 = zkb.M(i8);
                ahbVar2.setBackground(Z);
                zkb.j(ahbVar2, Z, M4, M5, resourceProvider);
                ahbVar2.setOnClickListener(new b95(ahbVar2, (byte) 29));
                frameLayout4.addView(ahbVar2, nme.e(-1, -1, 119));
                j.addView(frameLayout4, nme.t(-1, -2, 7, 9, -3, 9, -3));
                TextView b8 = hve.b(context, 14.0f, bkb.x6, false, null);
                b8.setText(k96.a0(null, null, 2131753132, l7c.r(tL_urlAuthResultRequest2.bot)));
                j.addView(b8, nme.t(-1, -2, 55, 22, 6, 22, 20));
                ahbVar = ahbVar2;
            } else {
                ahbVar = null;
            }
            LinearLayout j4 = de9.j(context, 0);
            u41 u41Var3 = new u41(S5.getResourceProvider(), context, true);
            u41Var3.setRoundRadius(24);
            int i9 = bkb.o7;
            u41Var3.setColor(S5.getThemedColor(i9));
            if (u41Var3.getBackground() != null) {
                Drawable background = u41Var3.getBackground();
                vkb M6 = zkb.M(i9);
                u41Var3.setBackground(background);
                str4 = null;
                zkb.j(u41Var3, background, M6, null, resourceProvider);
            } else {
                str4 = null;
            }
            u41Var3.setText(k96.M0(2131751592, str4));
            j4.addView(u41Var3, nme.q(-1, 48, 1.0f, 119, 0, 0, 5, 0));
            u41 u41Var4 = new u41(S5.getResourceProvider(), context, true);
            u41Var4.setRoundRadius(24);
            u41Var4.setText(k96.M0(2131753121, null));
            j4.addView(u41Var4, nme.q(-1, 48, 1.0f, 119, 5, 0, 0, 0));
            j.addView(j4, nme.t(-1, -2, 7, 12, 12, 12, 8));
            h.z0 = new tn7(u41Var4);
            boolean[] zArr = {false};
            fx0[] fx0VarArr = {null};
            TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = {null};
            h.t0(bkb.Z6);
            String[] strArr = {str2};
            ahb ahbVar3 = ahbVar;
            rn7 rn7Var = new rn7(iArr, u41Var4, u41Var3, tL_messages_requestUrlAuth, h, z, str, urlAuthResult2, strArr, z2, hv0Var, str6, resourceProvider);
            u41 u41Var5 = u41Var4;
            u41 u41Var6 = u41Var3;
            if (tL_urlAuthResultRequest2.user_id_hint != 0 && y6c.h(i).e() != tL_urlAuthResultRequest2.user_id_hint) {
                int size = arrayList3.size();
                int i10 = 0;
                while (i10 < size) {
                    arrayList = arrayList3;
                    Object obj = arrayList.get(i10);
                    i10++;
                    Integer num = (Integer) obj;
                    u41Var = u41Var5;
                    u41Var2 = u41Var6;
                    if (y6c.h(num.intValue()).e() == tL_urlAuthResultRequest2.user_id_hint) {
                        rn7Var.a(num);
                        break;
                    }
                    u41Var6 = u41Var2;
                    u41Var5 = u41Var;
                    arrayList3 = arrayList;
                }
            }
            u41Var = u41Var5;
            u41Var2 = u41Var6;
            arrayList = arrayList3;
            frameLayout2.setOnClickListener(new og(h, frameLayout3, arrayList, iArr, rn7Var, (byte) 10));
            boolean[] zArr2 = new boolean[1];
            final u41 u41Var7 = u41Var2;
            final u41 u41Var8 = u41Var;
            u41Var7.setOnClickListener(new t53(u41Var8, tL_messages_requestUrlAuth, zArr2, h, u41Var7, hv0Var, i));
            final boolean[] zArr3 = new boolean[1];
            final jf jfVar = new jf(tL_urlAuthResultRequest2, strArr, context, i, new sn7(u41Var8, u41Var7, tL_urlAuthResultRequest2, inputtonconnectoauthsessionArr, tL_messages_requestUrlAuth, strArr, ahbVar3, zArr3, zArr, iArr, zArr2, h, str6, resourceProvider, z, str, hv0Var), S5, (byte) 7);
            final boolean z8 = z6;
            final boolean z9 = z3;
            u41Var8.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    String str7;
                    if (!u41.this.R && !u41Var7.R) {
                        TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest3 = tL_urlAuthResultRequest2;
                        boolean z10 = tL_urlAuthResultRequest3.request_phone_number;
                        final jf jfVar2 = jfVar;
                        if (z10) {
                            TLRPC.User f2 = y6c.h(iArr[0]).f();
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, S5.getResourceProvider(), context);
                            String M0 = k96.M0(2131753117, null);
                            hd hdVar = alertDialog$Builder.a;
                            hdVar.S = M0;
                            if (z8 && !z9) {
                                str7 = l7c.r(tL_urlAuthResultRequest3.bot);
                            } else {
                                str7 = str6;
                            }
                            p38 f3 = p38.f();
                            hdVar.U = gl.S2(k96.a0(null, null, 2131753114, str7, f3.e("+" + f2.phone).replaceAll(" ", " ")));
                            String M02 = k96.M0(2131753115, null);
                            final boolean[] zArr4 = zArr3;
                            alertDialog$Builder.g(M02, new ed() {
                                @Override
                                public final void u(hd hdVar2, int i11) {
                                    byte b9 = r3;
                                    jf jfVar3 = jfVar2;
                                    boolean[] zArr5 = zArr4;
                                    switch (b9) {
                                        case 0:
                                            zArr5[0] = false;
                                            jfVar3.run();
                                            return;
                                        default:
                                            zArr5[0] = true;
                                            jfVar3.run();
                                            return;
                                    }
                                }
                            });
                            alertDialog$Builder.j(k96.M0(2131753116, null), new ed() {
                                @Override
                                public final void u(hd hdVar2, int i11) {
                                    byte b9 = r3;
                                    jf jfVar3 = jfVar2;
                                    boolean[] zArr5 = zArr4;
                                    switch (b9) {
                                        case 0:
                                            zArr5[0] = false;
                                            jfVar3.run();
                                            return;
                                        default:
                                            zArr5[0] = true;
                                            jfVar3.run();
                                            return;
                                    }
                                }
                            });
                            alertDialog$Builder.c(-2);
                            alertDialog$Builder.o();
                            return;
                        }
                        jfVar2.run();
                    }
                }
            });
            h.setOnDismissListener(new cu0(zArr, inputtonconnectoauthsessionArr, fx0VarArr, new fx0[1]));
            fx0 fx0Var = a;
            if (fx0Var != null) {
                fx0Var.dismiss();
                a = null;
            }
            r15 r15Var = new r15(tL_urlAuthResultRequest2, h, fx0VarArr, context, iArr, resourceProvider, zArr, inputtonconnectoauthsessionArr, jfVar);
            if (tL_urlAuthResultRequest2.match_codes_first && !tL_urlAuthResultRequest2.match_codes.isEmpty() && TextUtils.isEmpty(strArr[0])) {
                a = c(context, i, tL_urlAuthResultRequest2.match_codes, str6, new qn7(context, strArr, tL_messages_requestUrlAuth, i, r15Var, str6, resourceProvider), false, new q76(zArr2, hv0Var, tL_messages_requestUrlAuth, i, (byte) 13), S5.getResourceProvider());
            } else {
                r15Var.run();
            }
        }
    }

    public static fx0 c(Context context, int i, ArrayList arrayList, String str, p8c p8cVar, boolean z, Runnable runnable, wjb wjbVar) {
        int i2;
        int i3;
        qa1 qa1Var;
        int i4;
        fx0[] fx0VarArr = new fx0[1];
        fx0 h = de9.h(1, null, context, false);
        LinearLayout j = de9.j(context, 1);
        h.O = j;
        TextView textView = new TextView(context);
        textView.setTypeface(gl.o());
        textView.setGravity(17);
        textView.setTextSize(1, 18.0f);
        zkb.X(textView, bkb.F6, wjbVar);
        j.addView(textView, nme.t(-1, -2, 1, 0, 25, 0, 19));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setPadding(0, gl.L(19.0f), 0, gl.L(19.0f));
        j.addView(linearLayout, nme.t(-1, -2, 1, 0, 0, 0, 0));
        if (ConnectionsManager.getInstance(i).isTestBackend()) {
            i2 = 0;
            while (i2 < 4) {
                if (y6c.h(i2).o() && !ConnectionsManager.getInstance(i2).isTestBackend()) {
                    break;
                }
                i2++;
            }
        }
        i2 = i;
        be0[] be0VarArr = new be0[arrayList.size()];
        boolean z2 = true;
        int i5 = 0;
        while (i5 < arrayList.size()) {
            String str2 = (String) arrayList.get(i5);
            FrameLayout frameLayout = new FrameLayout(context);
            int L = gl.L(70.0f);
            int i6 = bkb.F6;
            fx0 fx0Var = h;
            int i7 = i5;
            ShapeDrawable K = bkb.K(L, bkb.p1(0.05f, bkb.v0(i6, wjbVar)));
            vkb K2 = zkb.K(0.05f, i6);
            frameLayout.setBackground(K);
            zkb.j(frameLayout, K, K2, null, wjbVar);
            ru3 f = vu3.f(str2);
            if (f == null) {
                qa1Var = new qa1(new tgb(str2, 30.0f, gl.o()), wjbVar, (byte) 3);
                z2 = false;
            } else {
                qa1Var = f;
            }
            be0 be0Var = new be0(context);
            be0VarArr[i7] = be0Var;
            be0Var.getImageReceiver().d = i2;
            be0Var.j(null, null, null, null, qa1Var, null);
            kk7.i(be0Var);
            frameLayout.addView(be0Var, nme.e(40, 40, 17));
            if (i7 == 0) {
                i4 = 0;
            } else {
                i4 = 24;
            }
            linearLayout.addView(frameLayout, nme.t(70, 70, 16, i4, 0, 0, 0));
            ote.a(frameLayout);
            frameLayout.setOnClickListener(new hu4(fx0VarArr, p8cVar, str2, (byte) 9));
            i5 = i7 + 1;
            h = fx0Var;
        }
        fx0 fx0Var2 = h;
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
        hq6.d0(i2).m0(tL_inputStickerSetShortName, null, false, false, new x15(arrayList, be0VarArr, (byte) 10));
        if (z2) {
            i3 = 2131753112;
        } else {
            i3 = 2131753113;
        }
        textView.setText(k96.M0(i3, null));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setTextSize(1, 12.0f);
        zkb.X(textView2, bkb.x6, wjbVar);
        textView2.setText(gl.M2(k96.a0(null, null, 2131753120, str), bkb.Ei, null, null, false));
        j.addView(textView2, nme.t(-1, -2, 1, 0, 23, 0, 11));
        u41 i8 = yjb.i(24, wjbVar, context, true);
        if (z) {
            i8.e();
            i8.setText(k96.M0(2131752577, null));
        } else {
            int i9 = bkb.o7;
            i8.setColor(bkb.v0(i9, wjbVar));
            if (i8.getBackground() != null) {
                Drawable background = i8.getBackground();
                vkb M = zkb.M(i9);
                i8.setBackground(background);
                zkb.j(i8, background, M, null, wjbVar);
            }
            i8.setText(k96.M0(2131751592, null));
        }
        j.addView(i8, nme.t(-1, 48, 7, 12, 12, 12, 12));
        i8.setOnClickListener(new hu4(i8, fx0VarArr, runnable, (byte) 10));
        fx0Var2.show();
        fx0VarArr[0] = fx0Var2;
        return fx0Var2;
    }
}
