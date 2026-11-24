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
public abstract class xp7 {
    public static my0 a;

    public static c41 a() {
        Context context;
        Context context2;
        d S = LaunchActivity.S();
        HashSet hashSet = wx0.b1;
        if (!hashSet.isEmpty()) {
            Iterator it = hashSet.iterator();
            wx0 wx0Var = null;
            while (it.hasNext()) {
                wx0 wx0Var2 = (wx0) it.next();
                if (wx0Var2.a1) {
                    wx0Var = wx0Var2;
                }
            }
            if (wx0Var != null) {
                if (S != null && S.getParentActivity() != null) {
                    context2 = S.getParentActivity();
                } else {
                    context2 = LaunchActivity.H1;
                    if (context2 == null) {
                        context2 = a.b;
                    }
                }
                return new c41(n21.a(context2), null);
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
                return new c41(n21.a(context), null);
            }
        }
        if (S != null && S.getLastSheet() != null && S.getLastSheet().j() != null) {
            return S.getLastSheet().j();
        }
        return c41.b0(S);
    }

    public static void b(boolean z, int i, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, TLRPC.UrlAuthResult urlAuthResult, String str, TLRPC.UrlAuthResult urlAuthResult2, String str2, boolean z2, qw0 qw0Var) {
        final Context context;
        ylb ylbVar;
        String str3;
        boolean z3;
        ?? r8;
        boolean z4;
        bjb bjbVar;
        String str4;
        ArrayList arrayList;
        b61 b61Var;
        b61 b61Var2;
        d S;
        String str5;
        d S2;
        Context context2;
        if (urlAuthResult instanceof TLRPC.TL_urlAuthResultAccepted) {
            TLRPC.TL_urlAuthResultAccepted tL_urlAuthResultAccepted = (TLRPC.TL_urlAuthResultAccepted) urlAuthResult;
            if (qw0Var == null || (!TextUtils.isEmpty(tL_messages_requestUrlAuth.in_app_origin) && TextUtils.equals(qw0Var.getOriginHost(), tL_messages_requestUrlAuth.in_app_origin))) {
                if (!TextUtils.isEmpty(tL_urlAuthResultAccepted.url)) {
                    if (qw0Var != null) {
                        qw0Var.v("oauth_result_confirmed", qw0.x(tL_urlAuthResultAccepted.url, "result_url"));
                        return;
                    }
                    d S3 = LaunchActivity.S();
                    if (S3 != null) {
                        l11.w(S3.getContext(), tL_urlAuthResultAccepted.url, true);
                        return;
                    }
                    return;
                }
                boolean z5 = urlAuthResult2 instanceof TLRPC.TL_urlAuthResultRequest;
                if (z5) {
                    TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) urlAuthResult2;
                    if (tL_urlAuthResultRequest.is_app) {
                        str5 = !TextUtils.isEmpty(tL_urlAuthResultRequest.verified_app_name) ? tL_urlAuthResultRequest.verified_app_name : jb6.M0(2131743512, null);
                    } else {
                        str5 = tL_urlAuthResultRequest.domain;
                    }
                } else {
                    str5 = null;
                }
                if (!TextUtils.isEmpty(str5)) {
                    a().I(2131623990, jb6.M0(2131753091, null), gm.L2(cmb.w0(null, cmb.wj, false), jb6.a0(null, null, z5 && ((TLRPC.TL_urlAuthResultRequest) urlAuthResult2).request_phone_number && !z2 ? 2131753090 : 2131753092, str5))).j();
                }
                if (qw0Var != null) {
                    qw0Var.v("oauth_result_confirmed", qw0.x(null, "result_url"));
                } else if (z && (S2 = LaunchActivity.S()) != null && (context2 = S2.getContext()) != null) {
                    gm.d3(new dh1(context2, (byte) 5), 800L);
                }
            }
        } else if (urlAuthResult instanceof TLRPC.TL_urlAuthResultDefault) {
            if (qw0Var != null) {
                return;
            }
            if (!TextUtils.isEmpty(tL_messages_requestUrlAuth.url)) {
                d S4 = LaunchActivity.S();
                if (S4 != null) {
                    ik.n0(S4, tL_messages_requestUrlAuth.url, false, urlAuthResult2 == null);
                }
            } else if (!TextUtils.isEmpty(str) && (S = LaunchActivity.S()) != null) {
                ik.n0(S, str, false, urlAuthResult2 == null);
            }
        } else if (urlAuthResult instanceof TLRPC.TL_urlAuthResultRequest) {
            final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest2 = (TLRPC.TL_urlAuthResultRequest) urlAuthResult;
            final d S5 = LaunchActivity.S();
            if (S5 == null || (context = S5.getContext()) == null) {
                return;
            }
            ylb resourceProvider = S5.getResourceProvider();
            my0 h = hg9.h(1, S5.getResourceProvider(), context, false);
            FrameLayout frameLayout = new FrameLayout(context);
            h.O = frameLayout;
            ArrayList arrayList2 = new ArrayList();
            boolean isTestBackend = ConnectionsManager.getInstance(i).isTestBackend();
            arrayList2.clear();
            for (int i2 = 0; i2 < 4; i2++) {
                if (z8c.h(i2).o() && ConnectionsManager.getInstance(i2).isTestBackend() == isTestBackend) {
                    arrayList2.add(Integer.valueOf(i2));
                }
            }
            Collections.sort(arrayList2, new tk6((byte) 28));
            boolean z6 = tL_messages_requestUrlAuth.peer != null;
            boolean z7 = tL_urlAuthResultRequest2.is_app;
            FrameLayout frameLayout2 = new FrameLayout(context);
            FrameLayout frameLayout3 = new FrameLayout(context);
            int L = gm.L(14.0f);
            int i3 = cmb.h5;
            Drawable b0 = cmb.b0(L, S5.getThemedColor(i3));
            wmb M = anb.M(i3);
            frameLayout3.setBackground(b0);
            anb.j(frameLayout3, b0, M, null, resourceProvider);
            bf0 bf0Var = new bf0(context);
            bf0Var.setRoundRadius(gm.L(14.0f));
            bf0Var.getImageReceiver().B0 = true;
            pc0 pc0Var = new pc0((ylb) null);
            final int[] iArr = {i};
            TLRPC.User f = z8c.h(iArr[0]).f();
            pc0Var.q(f);
            bf0Var.f(f, pc0Var);
            frameLayout3.addView(bf0Var, qoe.e(28, 28, 115));
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int i4 = cmb.q5;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            anb.s(imageView, i4, resourceProvider, mode);
            imageView.setImageResource(2131230874);
            frameLayout3.addView(imageView, qoe.d(18, 18.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
            frameLayout2.addView(frameLayout3, qoe.e(52, 28, 17));
            ArrayList arrayList3 = arrayList2;
            frameLayout2.setPadding(gm.L(8.0f), gm.L(4.0f), gm.L(8.0f), 0);
            frameLayout.addView(frameLayout2, qoe.q(-2, -2, 0.0f, 51, 6, 4, 6, 0));
            rve.a(frameLayout2);
            if (arrayList3.size() <= 1 || tL_messages_requestUrlAuth.peer != null) {
                frameLayout2.setVisibility(8);
            }
            LinearLayout i5 = hg9.i(context, 1);
            frameLayout.addView(i5, qoe.e(-1, -1, 119));
            bf0 bf0Var2 = new bf0(context);
            bf0Var2.setRoundRadius(gm.L(40.0f));
            pc0 pc0Var2 = new pc0((ylb) null);
            pc0Var2.q(tL_urlAuthResultRequest2.bot);
            bf0Var2.f(tL_urlAuthResultRequest2.bot, pc0Var2);
            i5.addView(bf0Var2, qoe.t(80, 80, 49, 0, 21, 0, 16));
            if (tL_urlAuthResultRequest2.is_app) {
                if (TextUtils.isEmpty(tL_urlAuthResultRequest2.verified_app_name)) {
                    ylbVar = null;
                    str3 = jb6.M0(2131743512, null);
                } else {
                    str3 = tL_urlAuthResultRequest2.verified_app_name;
                    ylbVar = null;
                }
            } else {
                ylbVar = null;
                str3 = tL_urlAuthResultRequest2.domain;
            }
            int i6 = cmb.i5;
            TextView b = jxe.b(context, 20.0f, i6, true, ylbVar);
            b.setGravity(17);
            final String str6 = str3;
            b.setText(gm.M2(jb6.a0(null, null, 2131753078, str3), cmb.Ei, S5.getResourceProvider(), null, false));
            i5.addView(b, qoe.s(-1, -2, 49, 32.0f, 0.0f, 32.0f, 9.66f));
            TextView b2 = jxe.b(context, 14.0f, i6, false, null);
            b2.setGravity(17);
            b2.setText(gm.S2(jb6.M0(z7 ? 2131753099 : z6 ? 2131753097 : 2131753079, null)));
            i5.addView(b2, qoe.t(-1, -2, 49, 32, 0, 32, 24));
            if (TextUtils.isEmpty(tL_urlAuthResultRequest2.platform) && TextUtils.isEmpty(tL_urlAuthResultRequest2.browser) && TextUtils.isEmpty(tL_urlAuthResultRequest2.region) && TextUtils.isEmpty(tL_urlAuthResultRequest2.ip)) {
                z3 = z7;
            } else {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setClipToPadding(false);
                linearLayout.setClipChildren(false);
                linearLayout.setOrientation(1);
                int L2 = gm.L(16.0f);
                int i7 = cmb.c6;
                Drawable d0 = cmb.d0(L2, S5.getThemedColor(i7));
                wmb M2 = anb.M(i7);
                linearLayout.setBackground(d0);
                anb.j(linearLayout, d0, M2, null, resourceProvider);
                i5.addView(linearLayout, qoe.t(-1, -2, 55, 9, -3, 9, -3));
                if (TextUtils.isEmpty(tL_urlAuthResultRequest2.platform) && TextUtils.isEmpty(tL_urlAuthResultRequest2.browser)) {
                    z3 = z7;
                } else {
                    LinearLayout i8 = hg9.i(context, 0);
                    ImageView imageView2 = new ImageView(context);
                    imageView2.setImageResource(2131232029);
                    anb.s(imageView2, i6, resourceProvider, mode);
                    i8.addView(imageView2, qoe.t(24, 24, 19, 17, 0, 20, 0));
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.setOrientation(1);
                    i8.addView(linearLayout2, qoe.s(-1, -2, 55, 0.0f, 10.66f, 20.0f, 11.0f));
                    TextView b3 = jxe.b(context, 16.0f, i6, false, null);
                    b3.setText(TextUtils.isEmpty(tL_urlAuthResultRequest2.platform) ? "—" : tL_urlAuthResultRequest2.platform);
                    linearLayout2.addView(b3, qoe.s(-1, -2, 55, 0.0f, 0.0f, 0.0f, 4.33f));
                    TextView b4 = jxe.b(context, 13.0f, cmb.x6, false, null);
                    b4.setText(TextUtils.isEmpty(tL_urlAuthResultRequest2.browser) ? "—" : tL_urlAuthResultRequest2.browser);
                    z3 = z7;
                    linearLayout2.addView(b4, qoe.r(-1, -2, 55));
                    linearLayout.addView(i8, qoe.o(-1, -2));
                }
                if (TextUtils.isEmpty(tL_urlAuthResultRequest2.region) && TextUtils.isEmpty(tL_urlAuthResultRequest2.ip)) {
                    r8 = 0;
                    z4 = false;
                } else {
                    LinearLayout i9 = hg9.i(context, 0);
                    ImageView imageView3 = new ImageView(context);
                    imageView3.setImageResource(2131232035);
                    anb.s(imageView3, i6, resourceProvider, mode);
                    i9.addView(imageView3, qoe.t(24, 24, 19, 17, 0, 20, 0));
                    LinearLayout linearLayout3 = new LinearLayout(context);
                    linearLayout3.setOrientation(1);
                    i9.addView(linearLayout3, qoe.s(-1, -2, 55, 0.0f, 10.66f, 20.0f, 11.0f));
                    TextView b5 = jxe.b(context, 16.0f, i6, false, null);
                    b5.setText(TextUtils.isEmpty(tL_urlAuthResultRequest2.region) ? "—" : tL_urlAuthResultRequest2.region);
                    linearLayout3.addView(b5, qoe.s(-1, -2, 55, 0.0f, 0.0f, 0.0f, 4.33f));
                    r8 = 0;
                    z4 = false;
                    TextView b6 = jxe.b(context, 13.0f, cmb.x6, false, null);
                    b6.setText(TextUtils.isEmpty(tL_urlAuthResultRequest2.ip) ? "—" : jb6.a0(null, null, 2131753098, tL_urlAuthResultRequest2.ip));
                    linearLayout3.addView(b6, qoe.r(-1, -2, 55));
                    linearLayout.addView(i9, qoe.o(-1, -2));
                }
                TextView b7 = jxe.b(context, 14.0f, cmb.x6, z4, r8);
                b7.setText(jb6.M0(2131753096, r8));
                i5.addView(b7, qoe.t(-1, -2, 55, 22, 5, 22, 20));
            }
            if (tL_urlAuthResultRequest2.request_write_access) {
                FrameLayout frameLayout4 = new FrameLayout(context);
                int L3 = gm.L(16.0f);
                int i10 = cmb.c6;
                InsetDrawable d02 = cmb.d0(L3, S5.getThemedColor(i10));
                wmb M3 = anb.M(i10);
                frameLayout4.setBackground(d02);
                anb.j(frameLayout4, d02, M3, null, resourceProvider);
                bjb bjbVar2 = new bjb(context, S5.getResourceProvider());
                bjbVar2.f(jb6.M0(2131753101, null), true, false);
                int themedColor = S5.getThemedColor(i10);
                int i11 = cmb.h6;
                fg0 Z = cmb.Z(themedColor, S5.getThemedColor(i11), 16, 16);
                wmb M4 = anb.M(i10);
                wmb M5 = anb.M(i11);
                bjbVar2.setBackground(Z);
                anb.j(bjbVar2, Z, M4, M5, resourceProvider);
                bjbVar2.setOnClickListener(new m67(bjbVar2, (byte) 2));
                frameLayout4.addView(bjbVar2, qoe.e(-1, -1, 119));
                i5.addView(frameLayout4, qoe.t(-1, -2, 7, 9, -3, 9, -3));
                TextView b8 = jxe.b(context, 14.0f, cmb.x6, false, null);
                b8.setText(jb6.a0(null, null, 2131753100, m9c.r(tL_urlAuthResultRequest2.bot)));
                i5.addView(b8, qoe.t(-1, -2, 55, 22, 6, 22, 20));
                bjbVar = bjbVar2;
            } else {
                bjbVar = null;
            }
            LinearLayout i12 = hg9.i(context, 0);
            b61 b61Var3 = new b61(S5.getResourceProvider(), context, true);
            b61Var3.setRoundRadius(24);
            int i13 = cmb.o7;
            b61Var3.setColor(S5.getThemedColor(i13));
            if (b61Var3.getBackground() != null) {
                Drawable background = b61Var3.getBackground();
                wmb M6 = anb.M(i13);
                b61Var3.setBackground(background);
                str4 = null;
                anb.j(b61Var3, background, M6, null, resourceProvider);
            } else {
                str4 = null;
            }
            b61Var3.setText(jb6.M0(2131751541, str4));
            i12.addView(b61Var3, qoe.q(-1, 48, 1.0f, 119, 0, 0, 5, 0));
            b61 b61Var4 = new b61(S5.getResourceProvider(), context, true);
            b61Var4.setRoundRadius(24);
            b61Var4.setText(jb6.M0(2131753089, null));
            i12.addView(b61Var4, qoe.q(-1, 48, 1.0f, 119, 5, 0, 0, 0));
            i5.addView(i12, qoe.t(-1, -2, 7, 12, 12, 12, 8));
            h.z0 = new wp7(b61Var4);
            boolean[] zArr = {false};
            my0[] my0VarArr = {null};
            TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = {null};
            h.t0(cmb.Z6);
            String[] strArr = {str2};
            bjb bjbVar3 = bjbVar;
            up7 up7Var = new up7(iArr, b61Var4, b61Var3, tL_messages_requestUrlAuth, h, z, str, urlAuthResult2, strArr, z2, qw0Var, str6, resourceProvider);
            b61 b61Var5 = b61Var4;
            b61 b61Var6 = b61Var3;
            if (tL_urlAuthResultRequest2.user_id_hint != 0 && z8c.h(i).e() != tL_urlAuthResultRequest2.user_id_hint) {
                int size = arrayList3.size();
                int i14 = 0;
                while (i14 < size) {
                    arrayList = arrayList3;
                    Object obj = arrayList.get(i14);
                    i14++;
                    Integer num = (Integer) obj;
                    b61Var = b61Var5;
                    b61Var2 = b61Var6;
                    if (z8c.h(num.intValue()).e() == tL_urlAuthResultRequest2.user_id_hint) {
                        up7Var.a(num);
                        break;
                    }
                    b61Var6 = b61Var2;
                    b61Var5 = b61Var;
                    arrayList3 = arrayList;
                }
            }
            arrayList = arrayList3;
            b61Var = b61Var5;
            b61Var2 = b61Var6;
            frameLayout2.setOnClickListener(new oh(h, frameLayout3, arrayList, iArr, up7Var, (byte) 10));
            boolean[] zArr2 = new boolean[1];
            final b61 b61Var7 = b61Var2;
            final b61 b61Var8 = b61Var;
            b61Var7.setOnClickListener(new f73(b61Var8, tL_messages_requestUrlAuth, zArr2, h, b61Var7, qw0Var, i));
            final boolean[] zArr3 = new boolean[1];
            final jg jgVar = new jg(tL_urlAuthResultRequest2, strArr, context, i, new vp7(b61Var8, b61Var7, tL_urlAuthResultRequest2, inputtonconnectoauthsessionArr, tL_messages_requestUrlAuth, strArr, bjbVar3, zArr3, zArr, iArr, zArr2, h, str6, resourceProvider, z, str, qw0Var), S5, (byte) 7);
            final boolean z8 = z6;
            final boolean z9 = z3;
            b61Var8.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    String str7;
                    if (!b61.this.R && !b61Var7.R) {
                        TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest3 = tL_urlAuthResultRequest2;
                        boolean z10 = tL_urlAuthResultRequest3.request_phone_number;
                        final jg jgVar2 = jgVar;
                        if (z10) {
                            TLRPC.User f2 = z8c.h(iArr[0]).f();
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, S5.getResourceProvider(), context);
                            String M0 = jb6.M0(2131753085, null);
                            he heVar = alertDialog$Builder.a;
                            heVar.S = M0;
                            if (z8 && !z9) {
                                str7 = m9c.r(tL_urlAuthResultRequest3.bot);
                            } else {
                                str7 = str6;
                            }
                            r58 f3 = r58.f();
                            heVar.U = gm.S2(jb6.a0(null, null, 2131753082, str7, f3.e("+" + f2.phone).replaceAll(" ", " ")));
                            String M02 = jb6.M0(2131753083, null);
                            final boolean[] zArr4 = zArr3;
                            alertDialog$Builder.g(M02, new ee() {
                                @Override
                                public final void r(he heVar2, int i15) {
                                    byte b9 = r3;
                                    jg jgVar3 = jgVar2;
                                    boolean[] zArr5 = zArr4;
                                    switch (b9) {
                                        case 0:
                                            zArr5[0] = false;
                                            jgVar3.run();
                                            return;
                                        default:
                                            zArr5[0] = true;
                                            jgVar3.run();
                                            return;
                                    }
                                }
                            });
                            alertDialog$Builder.j(jb6.M0(2131753084, null), new ee() {
                                @Override
                                public final void r(he heVar2, int i15) {
                                    byte b9 = r3;
                                    jg jgVar3 = jgVar2;
                                    boolean[] zArr5 = zArr4;
                                    switch (b9) {
                                        case 0:
                                            zArr5[0] = false;
                                            jgVar3.run();
                                            return;
                                        default:
                                            zArr5[0] = true;
                                            jgVar3.run();
                                            return;
                                    }
                                }
                            });
                            alertDialog$Builder.c(-2);
                            alertDialog$Builder.o();
                            return;
                        }
                        jgVar2.run();
                    }
                }
            });
            h.setOnDismissListener(new lv0(zArr, inputtonconnectoauthsessionArr, my0VarArr, new my0[1]));
            my0 my0Var = a;
            if (my0Var != null) {
                my0Var.dismiss();
                a = null;
            }
            r35 r35Var = new r35(tL_urlAuthResultRequest2, h, my0VarArr, context, iArr, resourceProvider, zArr, inputtonconnectoauthsessionArr, jgVar);
            if (tL_urlAuthResultRequest2.match_codes_first && !tL_urlAuthResultRequest2.match_codes.isEmpty() && TextUtils.isEmpty(strArr[0])) {
                a = c(context, i, tL_urlAuthResultRequest2.match_codes, str6, new tp7(context, strArr, tL_messages_requestUrlAuth, i, r35Var, str6, resourceProvider), false, new v36(zArr2, qw0Var, tL_messages_requestUrlAuth, i, (byte) 14), S5.getResourceProvider());
            } else {
                r35Var.run();
            }
        }
    }

    public static my0 c(Context context, int i, ArrayList arrayList, String str, qac qacVar, boolean z, Runnable runnable, ylb ylbVar) {
        int i2;
        int i3;
        yb1 yb1Var;
        int i4;
        my0[] my0VarArr = new my0[1];
        my0 h = hg9.h(1, null, context, false);
        LinearLayout i5 = hg9.i(context, 1);
        h.O = i5;
        TextView textView = new TextView(context);
        textView.setTypeface(gm.o());
        textView.setGravity(17);
        textView.setTextSize(1, 18.0f);
        anb.X(textView, cmb.F6, ylbVar);
        i5.addView(textView, qoe.t(-1, -2, 1, 0, 25, 0, 19));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setPadding(0, gm.L(19.0f), 0, gm.L(19.0f));
        i5.addView(linearLayout, qoe.t(-1, -2, 1, 0, 0, 0, 0));
        if (ConnectionsManager.getInstance(i).isTestBackend()) {
            i2 = 0;
            while (i2 < 4) {
                if (z8c.h(i2).o() && !ConnectionsManager.getInstance(i2).isTestBackend()) {
                    break;
                }
                i2++;
            }
        }
        i2 = i;
        bf0[] bf0VarArr = new bf0[arrayList.size()];
        boolean z2 = true;
        int i6 = 0;
        while (i6 < arrayList.size()) {
            String str2 = (String) arrayList.get(i6);
            FrameLayout frameLayout = new FrameLayout(context);
            int L = gm.L(70.0f);
            int i7 = cmb.F6;
            my0 my0Var = h;
            int i8 = i6;
            ShapeDrawable K = cmb.K(L, cmb.p1(0.05f, cmb.v0(i7, ylbVar)));
            wmb K2 = anb.K(0.05f, i7);
            frameLayout.setBackground(K);
            anb.j(frameLayout, K, K2, null, ylbVar);
            cw3 f = gw3.f(str2);
            if (f == null) {
                yb1Var = new yb1(new uib(str2, 30.0f, gm.o()), ylbVar, (byte) 3);
                z2 = false;
            } else {
                yb1Var = f;
            }
            bf0 bf0Var = new bf0(context);
            bf0VarArr[i8] = bf0Var;
            bf0Var.getImageReceiver().d = i2;
            bf0Var.j(null, null, null, null, yb1Var, null);
            nm7.i(bf0Var);
            frameLayout.addView(bf0Var, qoe.e(40, 40, 17));
            if (i8 == 0) {
                i4 = 0;
            } else {
                i4 = 24;
            }
            linearLayout.addView(frameLayout, qoe.t(70, 70, 16, i4, 0, 0, 0));
            rve.a(frameLayout);
            frameLayout.setOnClickListener(new jw4(my0VarArr, qacVar, str2, (byte) 9));
            i6 = i8 + 1;
            h = my0Var;
        }
        my0 my0Var2 = h;
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
        hs6.d0(i2).m0(tL_inputStickerSetShortName, null, false, false, new u35(arrayList, bf0VarArr, (byte) 11));
        if (z2) {
            i3 = 2131753080;
        } else {
            i3 = 2131753081;
        }
        textView.setText(jb6.M0(i3, null));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setTextSize(1, 12.0f);
        anb.X(textView2, cmb.x6, ylbVar);
        textView2.setText(gm.M2(jb6.a0(null, null, 2131753088, str), cmb.Ei, null, null, false));
        i5.addView(textView2, qoe.t(-1, -2, 1, 0, 23, 0, 11));
        b61 i9 = mlb.i(24, ylbVar, context, true);
        if (z) {
            i9.e();
            i9.setText(jb6.M0(2131752542, null));
        } else {
            int i10 = cmb.o7;
            i9.setColor(cmb.v0(i10, ylbVar));
            if (i9.getBackground() != null) {
                Drawable background = i9.getBackground();
                wmb M = anb.M(i10);
                i9.setBackground(background);
                anb.j(i9, background, M, null, ylbVar);
            }
            i9.setText(jb6.M0(2131751541, null));
        }
        i5.addView(i9, qoe.t(-1, 48, 7, 12, 12, 12, 12));
        i9.setOnClickListener(new jw4(i9, my0VarArr, runnable, (byte) 10));
        my0Var2.show();
        my0VarArr[0] = my0Var2;
        return my0Var2;
    }
}
