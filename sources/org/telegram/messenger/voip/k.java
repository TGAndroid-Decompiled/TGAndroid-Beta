package org.telegram.messenger.voip;

import a8.wa;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bi.p5;
import c8.ha;
import fi.f6;
import hi.a3;
import hi.q4;
import hi.s2;
import hi.v0;
import hi.w2;
import java.io.File;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.regex.Pattern;
import kg.s1;
import kg.t1;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.c20;
import org.telegram.messenger.e3;
import org.telegram.messenger.ez;
import org.telegram.messenger.fp;
import org.telegram.messenger.gp;
import org.telegram.messenger.gz;
import org.telegram.messenger.h2;
import org.telegram.messenger.hd;
import org.telegram.messenger.hw;
import org.telegram.messenger.ij;
import org.telegram.messenger.iz;
import org.telegram.messenger.k5;
import org.telegram.messenger.m5;
import org.telegram.messenger.nj;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.messenger.ui;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.c3;
import org.telegram.ui.ActionBar.d3;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.j3;
import org.telegram.ui.ActionBar.k3;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.v2;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.fx;
import org.telegram.ui.Components.ge;
import org.telegram.ui.Components.gx;
import org.telegram.ui.Components.gy;
import org.telegram.ui.Components.hr;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.mo0;
import org.telegram.ui.Components.n80;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.nu;
import org.telegram.ui.Components.ou;
import org.telegram.ui.Components.ue;
import org.telegram.ui.Components.v4;
import org.telegram.ui.Components.we;
import org.telegram.ui.Components.wh;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.a7;
import org.telegram.ui.an;
import org.telegram.ui.b3;
import org.telegram.ui.c4;
import org.telegram.ui.dn;
import org.telegram.ui.g4;
import org.telegram.ui.hc;
import org.telegram.ui.ic;
import org.telegram.ui.ld;
import org.telegram.ui.lm;
import org.telegram.ui.qf;
import org.telegram.ui.qj;
import org.telegram.ui.rc;
import org.telegram.ui.si;
import org.telegram.ui.sy0;
import org.telegram.ui.t3;
import org.telegram.ui.tl;
import org.telegram.ui.web.f1;
import org.telegram.ui.web.o1;
import org.telegram.ui.web.u0;
import org.telegram.ui.web.u1;
import org.telegram.ui.web.x0;
import org.telegram.ui.web.z0;
import org.telegram.ui.zd;
public final class k implements c20 {
    public final int f26120a;
    public final Object f26121b;
    public final Object f26122c;

    public k(int i7, Object obj, Object obj2) {
        this.f26120a = i7;
        this.f26121b = obj;
        this.f26122c = obj2;
    }

    @Override
    public final void a(Object obj) {
        int i7;
        int i10;
        float f10;
        int i11;
        String p10;
        boolean z9;
        an anVar;
        qj qjVar;
        u1 u1Var;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z10;
        String str;
        String str2;
        File file;
        String str3;
        String str4;
        FrameLayout frameLayout;
        String str5;
        Uri uri;
        int i18;
        ij threadMessage;
        boolean z11;
        int i19 = this.f26120a;
        org.telegram.ui.a0 a0Var = null;
        TLRPC.User user = null;
        hw hwVar = null;
        String str6 = null;
        di.b bVar = null;
        org.telegram.ui.a0 a0Var2 = null;
        boolean z12 = false;
        boolean z13 = true;
        Object obj2 = this.f26122c;
        Object obj3 = this.f26121b;
        switch (i19) {
            case 0:
                VoIPDebugToSend.b((VoIPDebugToSend) obj3, (TL_phone.saveCallDebug) obj2, (TLRPC.InputFile) obj);
                return;
            case 1:
                d3 d3Var = (d3) obj3;
                c3 c3Var = (c3) obj2;
                f2 f2Var = (f2) obj;
                if (f2Var != null) {
                    if ((f2Var instanceof an) && (qjVar = (anVar = (an) f2Var).Z) != null) {
                        qjVar.L();
                        anVar.Z.l0(true, false, true);
                    }
                    if (f2Var.getContext() != null && f2Var.getParentActivity() != null) {
                        a3 a3Var = new a3(f2Var.getContext(), f2Var.getResourceProvider());
                        a3Var.f14526l0 = f2Var.getParentActivity();
                        if (c3Var != null && c3Var.f27370a != null) {
                            a3Var.F0 = true;
                            boolean z14 = c3Var.f27382o;
                            a3Var.W = z14;
                            if (z14) {
                                a3Var.A(c3Var.f27385r, false);
                            }
                            if (!c3Var.f27381n) {
                                int i20 = c3Var.f27383p;
                                if (i20 < 0) {
                                    i20 = k6.f27848d6;
                                }
                                i7 = k6.w0(i20, a3Var.F);
                            } else {
                                i7 = c3Var.f27384q;
                            }
                            a3Var.y(i7, c3Var.f27381n, false);
                            a3Var.D(c3Var.f27386s, false);
                            a3Var.G0 = c3Var.f27377j;
                            a3Var.H0 = c3Var.f27378k;
                            boolean z15 = c3Var.f27388u;
                            a3Var.f14542x0 = z15;
                            s2 s2Var = a3Var.D;
                            s2Var.setIsBackButtonVisible(z15);
                            a3Var.f14541x.setAllowSwipes(c3Var.f27379l);
                            ImageView backButton = a3Var.X.getBackButton();
                            if (a3Var.f14542x0) {
                                i10 = 2131231240;
                            } else {
                                i10 = 2131231269;
                            }
                            org.telegram.messenger.g0.R3(backButton, i10);
                            h2 h2Var = a3Var.f14528n0;
                            if (h2Var != null) {
                                boolean z16 = a3Var.f14542x0;
                                h2Var.K = z16;
                                h2Var.L.d(z16);
                                h2Var.invalidate();
                            }
                            a3Var.f14535s0 = c3Var.f27391y;
                            a3Var.A0 = Boolean.valueOf(c3Var.B);
                            a3Var.B0 = c3Var.C;
                            v0 v0Var = c3Var.K;
                            a3Var.C0 = v0Var;
                            if (v0Var != null) {
                                hi.t0 t0Var = v0Var.f14994r;
                                SensorManager sensorManager = v0Var.f14979a;
                                f10 = 0.721f;
                                if (v0Var.f14988l) {
                                    v0Var.f14988l = false;
                                    if (sensorManager != null) {
                                        Sensor sensor = v0Var.f14980b;
                                        if (sensor != null) {
                                            sensorManager.registerListener(v0Var.f14990n, sensor, v0.a(v0Var.f14981c));
                                        }
                                        Sensor sensor2 = v0Var.d;
                                        if (sensor2 != null) {
                                            sensorManager.registerListener(v0Var.f14992p, sensor2, v0.a(v0Var.f14982e));
                                        }
                                        Sensor sensor3 = v0Var.f14984g;
                                        if (sensor3 != null) {
                                            sensorManager.registerListener(t0Var, sensor3, v0.a(v0Var.h));
                                        }
                                        Sensor sensor4 = v0Var.f14983f;
                                        if (sensor4 != null) {
                                            sensorManager.registerListener(t0Var, sensor4, v0.a(v0Var.h));
                                        }
                                        Sensor sensor5 = v0Var.f14985i;
                                        if (sensor5 != null) {
                                            sensorManager.registerListener(v0Var.f14996t, sensor5, v0.a(v0Var.f14986j));
                                        }
                                    }
                                }
                            } else {
                                f10 = 0.721f;
                            }
                            wa waVar = c3Var.f27389w;
                            if (waVar != null) {
                                w2 w2Var = a3Var.m0;
                                int totalHeight = w2Var.getTotalHeight();
                                w2Var.f14948e = waVar;
                                hi.r[] rVarArr = w2Var.f14949f;
                                hi.t.b(rVarArr[0].f14911l, (hi.s) waVar.f701c, false);
                                hi.t.b(rVarArr[1].f14911l, (hi.s) waVar.d, false);
                                w2Var.invalidate();
                                if (totalHeight != w2Var.getTotalHeight() && w2Var.f14951r != null) {
                                    if (totalHeight < w2Var.getTotalHeight()) {
                                        org.telegram.messenger.g0.i3(w2Var.f14951r, 200L);
                                    } else {
                                        w2Var.f14951r.run();
                                    }
                                }
                                int i21 = waVar.f700b;
                                Paint paint = w2Var.f14945a;
                                w2Var.f14948e.f700b = i21;
                                paint.setColor(i21);
                                w2Var.d.a(i21, true);
                            }
                            a3Var.C(c3Var.f27392z, false, c3Var.A);
                            q4 q4Var = c3Var.f27370a;
                            if (q4Var != null) {
                                i11 = q4Var.f14886a;
                            } else {
                                i11 = p10.f24459s0;
                            }
                            a3Var.H = i11;
                            u0 u0Var = c3Var.f27371b;
                            if (u0Var != null) {
                                u0Var.onResume();
                                s2Var.O(a3Var.H, c3Var.f27371b, c3Var.d, c3Var.f27374f, c3Var.f27373e);
                                if (!c3Var.f27387t && !c3Var.f27371b.f51304b) {
                                    z9 = false;
                                } else {
                                    z9 = true;
                                }
                                String str7 = c3Var.f27390x;
                                s2Var.g("setState(" + z9 + ", " + str7 + ")");
                                s2Var.N = z9;
                                s2Var.f51350b = str7;
                                if (k6.I.q() != c3Var.D) {
                                    s2Var.z();
                                }
                            } else {
                                q4Var.f14900q = null;
                                q4Var.f14901r = 0L;
                            }
                            a3Var.x(f2Var, c3Var.f27370a);
                            a3Var.f14515c0 = c3Var.v;
                            if (c3Var.G) {
                                a3Var.W0 = true;
                                a3Var.m();
                                b3 b3Var = a3Var.Y0;
                                if (a3Var.q()) {
                                    p10 = a3Var.f14540w0.f14889e;
                                } else {
                                    p10 = t10.p(qp.s1(a3Var.H).a2(Long.valueOf(a3Var.I)));
                                }
                                String str8 = c3Var.H;
                                a3Var.X0 = str8;
                                b3Var.a(p10, str8);
                                b3 b3Var2 = a3Var.Y0;
                                Paint paint2 = a3Var.Q;
                                if (org.telegram.messenger.g0.B(paint2.getColor()) > f10) {
                                    z13 = false;
                                }
                                b3Var2.b(z13, false);
                                a3Var.Y0.setBackgroundColor(paint2.getColor());
                                a3Var.Y0.setVisibility(0);
                                a3Var.Y0.setAlpha(1.0f);
                            }
                            a3Var.t(c3Var.L);
                            d3Var.h(d3Var.f27433x, c3Var, false);
                            a3Var.show();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 2:
                h3 h3Var = (h3) obj2;
                ((c3) obj3).f27380m = (Bitmap) obj;
                h3Var.mo25d().setDrawingFromOverlay(false);
                h3Var.release();
                return;
            case 3:
                j3 j3Var = (j3) obj2;
                k3 k3Var = (k3) ((f6) obj3).f11984q;
                if (((Boolean) obj).booleanValue()) {
                    j3Var.a(1.0f);
                    if (k3Var.f27711a.getTabs().isEmpty()) {
                        k3Var.a(false);
                        return;
                    }
                    return;
                }
                j3Var.a(0.0f);
                return;
            case 4:
                g4 g4Var = (g4) obj3;
                Activity activity = (Activity) obj2;
                Integer num = (Integer) obj;
                t3 t3Var = g4Var.K;
                org.telegram.ui.k0[] k0VarArr = g4Var.T0;
                if ((!g4Var.f45816u0[0].c() || g4Var.f45816u0[0].f47066c.E != null) && g4Var.L != null) {
                    if (num.intValue() == 1) {
                        org.telegram.ui.l0 l0Var = g4Var.f45804h0;
                        int L = org.telegram.messenger.g0.L(56.0f);
                        g4Var.J0 = L;
                        l0Var.setHeight(L);
                        g4Var.f45804h0.h(true);
                        return;
                    } else if (num.intValue() == 2) {
                        if (g4Var.f45816u0[0].f()) {
                            if (g4Var.f45816u0[0].getWebView() != null) {
                                str5 = g4Var.f45816u0[0].getWebView().getUrl();
                            } else {
                                return;
                            }
                        } else {
                            TLRPC.WebPage webPage = g4Var.f45816u0[0].f47066c.E;
                            if (webPage != null) {
                                str5 = webPage.url;
                            } else {
                                return;
                            }
                        }
                        String u10 = x0.u(str5);
                        Activity activity2 = g4Var.L;
                        if (org.telegram.messenger.g0.B(g4Var.f45804h0.getBackgroundColor()) < 0.721f) {
                            bVar = new di.b();
                        }
                        g4Var.Y(new mo0(activity2, null, u10, false, u10, false, bVar));
                        return;
                    } else if (num.intValue() == 6) {
                        if (g4Var.f45816u0[0].f()) {
                            if (g4Var.f45816u0[0].getWebView() != null) {
                                str4 = g4Var.f45816u0[0].getWebView().getUrl();
                                frameLayout = g4Var.f45816u0[0].f47068f;
                            } else {
                                return;
                            }
                        } else {
                            org.telegram.ui.k3 k3Var2 = g4Var.f45816u0[0];
                            TLRPC.WebPage webPage2 = k3Var2.f47066c.E;
                            if (webPage2 != null) {
                                str4 = webPage2.url;
                                frameLayout = k3Var2;
                            } else {
                                return;
                            }
                        }
                        g4.d(str4, g4Var.X, frameLayout, t3Var, null);
                        return;
                    } else if (num.intValue() == 7) {
                        ?? obj4 = new Object();
                        obj4.f27420a = true;
                        f2 T = LaunchActivity.T();
                        if (T != 0) {
                            if (t3Var != null) {
                                a0Var2 = new org.telegram.ui.a0(g4Var, 6);
                            }
                            T.showAsSheet(new org.telegram.ui.web.l(a0Var2, new org.telegram.ui.q(g4Var, 2)), obj4);
                            return;
                        }
                        return;
                    } else if (num.intValue() == 8) {
                        ?? obj5 = new Object();
                        obj5.f27420a = true;
                        f2 T2 = LaunchActivity.T();
                        if (T2 != 0) {
                            if (t3Var != null) {
                                a0Var = new org.telegram.ui.a0(g4Var, 7);
                            }
                            T2.showAsSheet(new z0(a0Var, new org.telegram.ui.q(g4Var, 3)), obj5);
                            return;
                        }
                        return;
                    } else if (num.intValue() == 9) {
                        if (g4Var.f45816u0[0].getWebView() != null) {
                            g4Var.f45816u0[0].getWebView().goForward();
                            return;
                        }
                        return;
                    } else if (num.intValue() == 3) {
                        if (g4Var.f45816u0[0].f()) {
                            if (g4Var.f45816u0[0].getWebView() != null) {
                                str = g4Var.f45816u0[0].getWebView().getUrl();
                                str2 = g4Var.f45816u0[0].getWebView().getOpenURL();
                                file = null;
                            } else {
                                return;
                            }
                        } else {
                            TLRPC.WebPage webPage3 = g4Var.f45816u0[0].f47066c.E;
                            if (webPage3 != null) {
                                String str9 = webPage3.url;
                                TL_iv.Page page = webPage3.cached_page;
                                if (page != null) {
                                    file = page.local;
                                    str = str9;
                                    str2 = null;
                                } else {
                                    str = str9;
                                    str2 = null;
                                    file = null;
                                }
                            } else {
                                return;
                            }
                        }
                        Activity activity3 = g4Var.L;
                        if (activity3 != null && !activity3.isFinishing()) {
                            if (file != null) {
                                String D = w7.D(file);
                                Pattern pattern = n80.f36316a;
                                if (!"diff".equalsIgnoreCase(D) && !"patch".equalsIgnoreCase(D)) {
                                    str3 = "text/markdown";
                                } else {
                                    str3 = "text/x-diff";
                                }
                                org.telegram.messenger.g0.t2(file, null, str3, g4Var.L, null, true);
                                return;
                            } else if (str != null) {
                                String K0 = org.telegram.messenger.g0.K0(str2, true);
                                String K02 = org.telegram.messenger.g0.K0(str, true);
                                org.telegram.ui.x xVar = new org.telegram.ui.x(g4Var, str, 1);
                                org.telegram.ui.y yVar = new org.telegram.ui.y(g4Var, K02, K0, 1);
                                if (g4Var.f45816u0[0].f() && qp.s1(g4Var.X).N2(K02) && !qp.s1(g4Var.X).L2(true)) {
                                    v4.l0(activity, null, str, true, new p5(8, yVar, xVar));
                                    return;
                                } else {
                                    xVar.run();
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        return;
                    } else if (num.intValue() == 4) {
                        if (g4Var.f45816u0[0].f()) {
                            f2 T3 = LaunchActivity.T();
                            if (T3 != 0) {
                                ?? obj6 = new Object();
                                obj6.f27420a = true;
                                T3.showAsSheet(new o1(new org.telegram.ui.q(g4Var, 3)), obj6);
                                return;
                            }
                            return;
                        }
                        v2 h = org.telegram.messenger.camera.q.h(g4Var.L, false, 1, null);
                        h.f28646u0 = false;
                        LinearLayout linearLayout = new LinearLayout(g4Var.L);
                        linearLayout.setPadding(0, 0, 0, org.telegram.messenger.g0.L(4.0f));
                        linearLayout.setOrientation(1);
                        n4 n4Var = new n4(g4Var.L, (org.telegram.ui.ActionBar.f6) null);
                        n4Var.setText(hd.M0(2131750610, null));
                        linearLayout.addView(n4Var, ha.t(-2, -2, 51, 3, 1, 3, 0));
                        linearLayout.addView(new c4(g4Var, g4Var.L), ha.t(-1, -2, 51, 3, 0, 3, 0));
                        n4 n4Var2 = new n4(g4Var.L, (org.telegram.ui.ActionBar.f6) null);
                        n4Var2.setText(hd.M0(2131750605, null));
                        linearLayout.addView(n4Var2, ha.t(-2, -2, 51, 3, 4, 3, 2));
                        int i22 = 0;
                        for (int i23 = 2; i22 < i23; i23 = 2) {
                            Activity activity4 = g4Var.L;
                            org.telegram.ui.k0 k0Var = new org.telegram.ui.k0(activity4, 1);
                            int i24 = k6.f27940i6;
                            org.telegram.ui.Cells.y h02 = k6.h0(k6.x0(null, i24, false), i23, -1);
                            n6 N = r6.N(i24);
                            k0Var.setBackground(h02);
                            r6.k(k0Var, h02, null, N, null);
                            RadioButton radioButton = new RadioButton(activity4);
                            k0Var.f47048b = radioButton;
                            radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
                            r6.P(radioButton, k6.D5, k6.E5, null);
                            boolean z17 = hd.f22871a0;
                            if (z17) {
                                i12 = 5;
                            } else {
                                i12 = 3;
                            }
                            int i25 = i12 | 48;
                            if (z17) {
                                i13 = 0;
                            } else {
                                i13 = 22;
                            }
                            float f11 = i13;
                            if (z17) {
                                i14 = 22;
                            } else {
                                i14 = 0;
                            }
                            k0Var.addView(radioButton, ha.d(22, 22.0f, i25, f11, 13.0f, i14, 0.0f));
                            TextView textView = new TextView(activity4);
                            r6.V(textView, k6.G6, null);
                            org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
                            textView.setSingleLine(true);
                            if (hd.f22871a0) {
                                i15 = 5;
                            } else {
                                i15 = 3;
                            }
                            textView.setGravity(i15 | 16);
                            boolean z18 = hd.f22871a0;
                            if (z18) {
                                i16 = 5;
                            } else {
                                i16 = 3;
                            }
                            int i26 = i16 | 48;
                            int i27 = 17;
                            if (z18) {
                                i17 = 17;
                            } else {
                                i17 = 62;
                            }
                            float f12 = i17;
                            if (z18) {
                                i27 = 62;
                            }
                            k0Var.addView(textView, ha.d(-1, -1.0f, i26, f12, 0.0f, i27, 0.0f));
                            k0VarArr[i22] = k0Var;
                            if (i22 != 0) {
                                if (i22 == 1) {
                                    Typeface typeface = Typeface.SERIF;
                                    textView.setText("Serif");
                                    textView.setTypeface(typeface);
                                    k0Var.setContentDescription("Serif");
                                    k0Var.invalidate();
                                }
                            } else {
                                String M0 = hd.M0(2131751601, null);
                                Typeface typeface2 = Typeface.DEFAULT;
                                textView.setText(M0);
                                textView.setTypeface(typeface2);
                                k0Var.setContentDescription(M0);
                                k0Var.invalidate();
                            }
                            org.telegram.ui.k0 k0Var2 = k0VarArr[i22];
                            if (i22 == g4Var.f48238a) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            ((RadioButton) k0Var2.f47048b).a(z10, false);
                            k0VarArr[i22].setTag(Integer.valueOf(i22));
                            k0VarArr[i22].setOnClickListener(new org.telegram.ui.r(g4Var, 4));
                            linearLayout.addView(k0VarArr[i22], ha.o(-1, 50));
                            i22++;
                        }
                        h.N = linearLayout;
                        g4Var.I = h;
                        g4Var.Y(h);
                        return;
                    } else if (num.intValue() == 5) {
                        if (g4Var.f45816u0[0].f() && g4Var.f45816u0[0].getWebView() != null) {
                            g4Var.f45816u0[0].getWebView().reload();
                            return;
                        }
                        return;
                    } else if (num.intValue() == 10 && (u1Var = g4Var.f45816u0[0].E) != null && u1Var.b() != null) {
                        g4Var.f(u1Var.b(), null, 1);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 5:
                org.telegram.ui.k3 k3Var3 = (org.telegram.ui.k3) obj3;
                Activity activity5 = (Activity) obj2;
                String str10 = (String) obj;
                if (!TextUtils.isEmpty(str10) && k3Var3.getWebView() != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str10.trim());
                    org.telegram.messenger.g0.c(spannableStringBuilder, 1, false, true);
                    URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                    int length = spannableStringBuilder.length();
                    int i28 = 0;
                    for (int i29 = 0; i29 < uRLSpanArr.length; i29++) {
                        length = Math.min(spannableStringBuilder.getSpanStart(uRLSpanArr[i29]), length);
                        i28 = Math.max(spannableStringBuilder.getSpanEnd(uRLSpanArr[i29]), i28);
                    }
                    Pattern pattern2 = Utilities.f21330a;
                    try {
                        uri = Uri.parse(str10);
                    } catch (Exception unused) {
                        uri = null;
                    }
                    if (uri == null || !TextUtils.equals(uri.getScheme(), "javascript")) {
                        if ((uRLSpanArr.length > 0 && length == 0 && i28 > 0) || (uri != null && uri.getScheme() != null)) {
                            if (uri != null && uri.getScheme() == null && uri.getHost() == null && uri.getPath() != null) {
                                str10 = vf.c.w(uri, "https", null, uri.getEncodedPath(), "/");
                            }
                            k3Var3.getWebView().loadUrl(str10);
                            return;
                        }
                        org.telegram.ui.web.j.b(activity5, str10);
                        u0 webView = k3Var3.getWebView();
                        String str11 = f1.a().f51118b;
                        if (str11 != null) {
                            StringBuilder m10 = com.google.android.recaptcha.internal.a.m(str11);
                            m10.append(URLEncoder.encode(str10));
                            str6 = m10.toString();
                        }
                        webView.loadUrl(str6);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                rc rcVar = (rc) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                rcVar.f49431c = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    int i30 = tL_premium_boostsStatus.level;
                    rcVar.f49429b = i30;
                    if (chat != null) {
                        chat.flags |= 1024;
                        chat.level = i30;
                    }
                }
                rcVar.e1(true);
                fi.d dVar = rcVar.P;
                if (dVar != null) {
                    dVar.setLoading(false);
                    return;
                }
                return;
            case 7:
                ic icVar = (ic) obj3;
                gp gpVar = (gp) obj2;
                View view = (View) obj;
                if (view instanceof hc) {
                    hc hcVar = (hc) view;
                    hcVar.setBackgroundColor(k6.w0(k6.f27848d6, icVar.f46632a));
                    icVar.f46633b.getClass();
                    int R = RecyclerView.R(view);
                    if (gpVar != null) {
                        ArrayList arrayList = gpVar.f22677c;
                        if (R >= 0 && R < arrayList.size()) {
                            hcVar.a((fp) arrayList.get(R));
                        }
                    }
                    view.invalidate();
                    return;
                }
                return;
            case 8:
                ug.i0 i0Var = (ug.i0) obj2;
                i0Var.A1((e3) obj);
                ((zd) obj3).m0.showDialog(i0Var);
                return;
            case 9:
                an anVar2 = (an) obj3;
                Long l10 = (Long) obj;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = new TLRPC.TL_messages_sendQuickReplyMessages();
                tL_messages_sendQuickReplyMessages.peer = anVar2.getMessagesController().j1(anVar2.f43818j6);
                tL_messages_sendQuickReplyMessages.shortcut_id = ((s1) obj2).f17529a;
                anVar2.getConnectionsManager().sendRequest(tL_messages_sendQuickReplyMessages, null);
                qj qjVar2 = anVar2.Z;
                if (qjVar2 != null) {
                    qjVar2.setFieldText(null);
                    return;
                }
                return;
            case 10:
                an anVar3 = (an) obj3;
                ez b10 = ez.b((String) obj2, anVar3.f43818j6, anVar3.D5, anVar3.f43840l4, null, false, null, null, null, true, 0, 0, null, false);
                b10.K = anVar3.W8();
                b10.Q = ((Long) obj).longValue();
                b10.R = anVar3.h9();
                b10.T = anVar3.f43980w5;
                anVar3.getSendMessagesHelper().r0(b10);
                anVar3.Z.setFieldText("");
                anVar3.B9(false);
                return;
            case 11:
                an anVar4 = (an) obj3;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj2;
                Long l11 = (Long) obj;
                if (anVar4.f43766f4 == 1) {
                    v4.J(anVar4.getParentActivity(), anVar4.f43818j6, new a7(anVar4, botInlineResult, l11, 2), anVar4.f43998xa);
                    return;
                } else {
                    anVar4.Db(botInlineResult, true, 0, l11.longValue());
                    return;
                }
            case 12:
                Boolean bool = (Boolean) obj;
                ((an) obj3).Fb = true;
                ((qf) obj2).run();
                return;
            case 13:
                an.g0((an) obj3, (sy0[]) obj2, (k60) obj);
                return;
            case 14:
                an anVar5 = (an) obj3;
                org.telegram.ui.ActionBar.u1[] u1VarArr = (org.telegram.ui.ActionBar.u1[]) obj2;
                TL_stats.TL_statsPollStats tL_statsPollStats = (TL_stats.TL_statsPollStats) obj;
                try {
                    u1VarArr[0].dismiss();
                } catch (Throwable unused2) {
                }
                u1VarArr[0] = null;
                if (tL_statsPollStats != null) {
                    if (tL_statsPollStats.votes_graph instanceof TL_stats.TL_statsGraphError) {
                        k5.o(null, 2131747156, org.telegram.ui.Components.hc.a0(anVar5), 2131624292, 24);
                        return;
                    } else {
                        new vh.h(anVar5.getParentActivity(), anVar5.f43998xa, tL_statsPollStats).show();
                        return;
                    }
                }
                return;
            case 15:
                an anVar6 = (an) obj3;
                ij ijVar = (ij) obj2;
                anVar6.getClass();
                TLRPC.SuggestedPost c10 = ((nj) obj).c();
                if (ijVar != null && ijVar.f23237k != null) {
                    anVar6.getMessagesController().h(ijVar, c10);
                    return;
                }
                return;
            case 16:
                s1 s1Var = (s1) obj2;
                String str12 = (String) obj;
                an anVar7 = ((si) obj3).f49758b;
                if (s1Var != null) {
                    i18 = ((f2) anVar7).currentAccount;
                    t1.f(i18).k(s1Var.f17529a, str12);
                }
                anVar7.f43752e4 = str12;
                anVar7.f43873o1.setTitle(str12);
                return;
            case 17:
                ij ijVar2 = (ij) obj2;
                Long l12 = (Long) obj;
                an anVar8 = ((lm) obj3).f47534a;
                if (anVar8.t7()) {
                    ez b11 = ez.b(ijVar2.C0(), anVar8.f43818j6, anVar8.D5, anVar8.f43840l4, null, false, null, null, null, true, 0, 0, null, false);
                    b11.K = anVar8.W8();
                    b11.W = l12.longValue();
                    anVar8.getSendMessagesHelper().r0(b11);
                    return;
                }
                return;
            case 18:
                q1 q1Var = (q1) obj2;
                an anVar9 = ((lm) obj3).f47534a;
                if (((Boolean) obj).booleanValue()) {
                    for (int i31 = 0; i31 < anVar9.f44013z0.getChildCount(); i31++) {
                        View childAt = anVar9.f44013z0.getChildAt(i31);
                        if (childAt instanceof q1) {
                            q1 q1Var2 = (q1) childAt;
                            if (q1Var2.getMessageObject() != null && q1Var2.getMessageObject().q4()) {
                                q1Var2.G3();
                            }
                        }
                    }
                    return;
                }
                if (q1Var.getMessageObject() != null) {
                    q1Var.getMessageObject().f23265r2 = Boolean.FALSE;
                }
                q1Var.G3();
                return;
            case 19:
                lm lmVar = (lm) obj3;
                k kVar = (k) obj2;
                an anVar10 = lmVar.f47534a;
                if (!((Boolean) obj).booleanValue()) {
                    org.telegram.ui.Components.hc.a0(anVar10).I(2131624011, hd.M0(2131754311, null), hd.M0(2131754312, null)).j();
                    return;
                }
                anVar10.getMessagesController().F4(true);
                org.telegram.ui.Components.hc.a0(anVar10).P(2131623981, org.telegram.messenger.g0.H2(org.telegram.messenger.g0.x2(hd.M0(2131745575, null), new tl(lmVar, 8)), true)).k(true);
                kVar.a(Boolean.TRUE);
                return;
            case 20:
                TLRPC.Message message = (TLRPC.Message) obj2;
                ((lm) obj3).f47534a.getMessagesController().v(message.f26973id, -1, m5.o(message.peer_id), (String) obj, true);
                return;
            case 21:
                dn dnVar = (dn) obj3;
                dnVar.f45090f.s(((gg.a) obj).f13953a, ((TLRPC.WallPaper) obj2).settings.intensity);
                View view2 = dnVar.f45087b;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 22:
                Long l13 = (Long) obj;
                ChatActivityEnterView chatActivityEnterView = ((we) obj3).f39948a;
                long j3 = chatActivityEnterView.Q2;
                ij ijVar3 = chatActivityEnterView.T2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                ez b12 = ez.b((String) obj2, j3, ijVar3, threadMessage, null, false, null, null, null, true, 0, 0, null, false);
                an anVar11 = chatActivityEnterView.P2;
                if (anVar11 != null) {
                    hwVar = anVar11.W8();
                }
                b12.K = hwVar;
                b12.O = chatActivityEnterView.S4;
                b12.Q = l13.longValue();
                b12.R = chatActivityEnterView.getSendMonoForumPeerId();
                b12.T = chatActivityEnterView.getSendMessageSuggestionParams();
                gz.C(chatActivityEnterView.Q).r0(b12);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.m0.c();
                ge geVar = chatActivityEnterView.J0;
                chatActivityEnterView.S4 = 0L;
                geVar.setEffect(0L);
                return;
            case 23:
                di diVar = (di) obj3;
                wh whVar = (wh) obj2;
                Boolean bool2 = (Boolean) obj;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i32 = diVar.D3;
                tL_messages_toggleBotInAttachMenu.bot = qp.s1(i32).o1(whVar.f39962c.bot_id);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i32).sendRequest(tL_messages_toggleBotInAttachMenu, new ld(12, diVar, whVar), 66);
                return;
            case 24:
                di diVar2 = (di) obj3;
                ((an) obj2).f43980w5 = (nj) obj;
                boolean u12 = diVar2.u1(true, 0, 0, diVar2.H2, diVar2.f1());
                ue ueVar = diVar2.Y1;
                if (ueVar != null) {
                    ueVar.g(!u12);
                    diVar2.Y1 = null;
                    return;
                }
                return;
            case 25:
                ((hi.c4) obj3).getWebViewContainer().G((String) obj2, (String) obj, false);
                return;
            case 26:
                ni niVar = (ni) obj3;
                qp qpVar = (qp) obj2;
                Long l14 = (Long) obj;
                niVar.f36409i0 = false;
                if (l14 != null) {
                    user = qpVar.a2(l14);
                }
                niVar.f36408h0 = user;
                if (user == null) {
                    z12 = true;
                }
                niVar.f36410j0 = z12;
                if (user != null) {
                    niVar.S();
                    return;
                }
                return;
            case 27:
                ou ouVar = (ou) obj3;
                boolean[] zArr = (boolean[]) obj2;
                if (((TLRPC.TL_messages_stickerSet) obj) == null && !zArr[0]) {
                    zArr[0] = true;
                    org.telegram.messenger.g0.h3(new nu(ouVar, 1));
                    return;
                }
                return;
            case 28:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj3;
                fq fqVar = (fq) obj2;
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    linkedHashSet.addAll(tL_emojiList.document_id);
                }
                fqVar.run();
                return;
            default:
                fx fxVar = (fx) obj3;
                gx gxVar = fxVar.f33708a;
                gy gyVar = gxVar.F;
                ui b02 = ui.b0(gyVar.f34076c1);
                String[] strArr = gyVar.W0;
                String str13 = gxVar.f34061w;
                hr hrVar = new hr(fxVar, (String) obj2, (Runnable) obj, 1);
                if (!iz.F && !p10.i(gyVar.f34076c1).q()) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                b02.V(strArr, str13, false, hrVar, z11, false, true, false, 25);
                return;
        }
    }
}
