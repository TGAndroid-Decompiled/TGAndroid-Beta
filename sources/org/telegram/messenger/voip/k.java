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
import org.telegram.messenger.ez;
import org.telegram.messenger.fp;
import org.telegram.messenger.gp;
import org.telegram.messenger.gz;
import org.telegram.messenger.h2;
import org.telegram.messenger.hw;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.iz;
import org.telegram.messenger.k5;
import org.telegram.messenger.m5;
import org.telegram.messenger.nj;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d3;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.i3;
import org.telegram.ui.ActionBar.k3;
import org.telegram.ui.ActionBar.l3;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.fe;
import org.telegram.ui.Components.fx;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.gx;
import org.telegram.ui.Components.gy;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.mo0;
import org.telegram.ui.Components.n80;
import org.telegram.ui.Components.nu;
import org.telegram.ui.Components.ou;
import org.telegram.ui.Components.ro;
import org.telegram.ui.Components.te;
import org.telegram.ui.Components.u4;
import org.telegram.ui.Components.ve;
import org.telegram.ui.Components.vh;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.a7;
import org.telegram.ui.b3;
import org.telegram.ui.c4;
import org.telegram.ui.cn;
import org.telegram.ui.fn;
import org.telegram.ui.g4;
import org.telegram.ui.hc;
import org.telegram.ui.ic;
import org.telegram.ui.ld;
import org.telegram.ui.nm;
import org.telegram.ui.oe;
import org.telegram.ui.rc;
import org.telegram.ui.sj;
import org.telegram.ui.t3;
import org.telegram.ui.ui;
import org.telegram.ui.vl;
import org.telegram.ui.web.f1;
import org.telegram.ui.web.o1;
import org.telegram.ui.web.u0;
import org.telegram.ui.web.u1;
import org.telegram.ui.web.x0;
import org.telegram.ui.web.z0;
import org.telegram.ui.wy0;
import org.telegram.ui.zd;
public final class k implements c20 {
    public final int f26138a;
    public final Object f26139b;
    public final Object f26140c;

    public k(int i7, Object obj, Object obj2) {
        this.f26138a = i7;
        this.f26139b = obj;
        this.f26140c = obj2;
    }

    @Override
    public final void a(Object obj) {
        int i7;
        int i10;
        float f10;
        int i11;
        String p10;
        boolean z9;
        cn cnVar;
        sj sjVar;
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
        int i19 = this.f26138a;
        org.telegram.ui.a0 a0Var = null;
        TLRPC.User user = null;
        hw hwVar = null;
        String str6 = null;
        di.b bVar = null;
        org.telegram.ui.a0 a0Var2 = null;
        boolean z12 = false;
        boolean z13 = true;
        Object obj2 = this.f26140c;
        Object obj3 = this.f26139b;
        switch (i19) {
            case 0:
                VoIPDebugToSend.b((VoIPDebugToSend) obj3, (TL_phone.saveCallDebug) obj2, (TLRPC.InputFile) obj);
                return;
            case 1:
                e3 e3Var = (e3) obj3;
                d3 d3Var = (d3) obj2;
                f2 f2Var = (f2) obj;
                if (f2Var != null) {
                    if ((f2Var instanceof cn) && (sjVar = (cnVar = (cn) f2Var).Z) != null) {
                        sjVar.L();
                        cnVar.Z.l0(true, false, true);
                    }
                    if (f2Var.getContext() != null && f2Var.getParentActivity() != null) {
                        a3 a3Var = new a3(f2Var.getContext(), f2Var.getResourceProvider());
                        a3Var.f14528l0 = f2Var.getParentActivity();
                        if (d3Var != null && d3Var.f27392a != null) {
                            a3Var.F0 = true;
                            boolean z14 = d3Var.f27404o;
                            a3Var.W = z14;
                            if (z14) {
                                a3Var.A(d3Var.f27407r, false);
                            }
                            if (!d3Var.f27403n) {
                                int i20 = d3Var.f27405p;
                                if (i20 < 0) {
                                    i20 = m6.f27890d6;
                                }
                                i7 = m6.w0(i20, a3Var.F);
                            } else {
                                i7 = d3Var.f27406q;
                            }
                            a3Var.y(i7, d3Var.f27403n, false);
                            a3Var.D(d3Var.f27408s, false);
                            a3Var.G0 = d3Var.f27399j;
                            a3Var.H0 = d3Var.f27400k;
                            boolean z15 = d3Var.f27410u;
                            a3Var.f14544x0 = z15;
                            s2 s2Var = a3Var.D;
                            s2Var.setIsBackButtonVisible(z15);
                            a3Var.f14543x.setAllowSwipes(d3Var.f27401l);
                            ImageView backButton = a3Var.X.getBackButton();
                            if (a3Var.f14544x0) {
                                i10 = 2131231240;
                            } else {
                                i10 = 2131231269;
                            }
                            org.telegram.messenger.g0.R3(backButton, i10);
                            h2 h2Var = a3Var.f14530n0;
                            if (h2Var != null) {
                                boolean z16 = a3Var.f14544x0;
                                h2Var.K = z16;
                                h2Var.L.d(z16);
                                h2Var.invalidate();
                            }
                            a3Var.f14537s0 = d3Var.f27413y;
                            a3Var.A0 = Boolean.valueOf(d3Var.B);
                            a3Var.B0 = d3Var.C;
                            v0 v0Var = d3Var.K;
                            a3Var.C0 = v0Var;
                            if (v0Var != null) {
                                hi.t0 t0Var = v0Var.f14999r;
                                SensorManager sensorManager = v0Var.f14984a;
                                f10 = 0.721f;
                                if (v0Var.f14993l) {
                                    v0Var.f14993l = false;
                                    if (sensorManager != null) {
                                        Sensor sensor = v0Var.f14985b;
                                        if (sensor != null) {
                                            sensorManager.registerListener(v0Var.f14995n, sensor, v0.a(v0Var.f14986c));
                                        }
                                        Sensor sensor2 = v0Var.d;
                                        if (sensor2 != null) {
                                            sensorManager.registerListener(v0Var.f14997p, sensor2, v0.a(v0Var.f14987e));
                                        }
                                        Sensor sensor3 = v0Var.f14989g;
                                        if (sensor3 != null) {
                                            sensorManager.registerListener(t0Var, sensor3, v0.a(v0Var.h));
                                        }
                                        Sensor sensor4 = v0Var.f14988f;
                                        if (sensor4 != null) {
                                            sensorManager.registerListener(t0Var, sensor4, v0.a(v0Var.h));
                                        }
                                        Sensor sensor5 = v0Var.f14990i;
                                        if (sensor5 != null) {
                                            sensorManager.registerListener(v0Var.f15001t, sensor5, v0.a(v0Var.f14991j));
                                        }
                                    }
                                }
                            } else {
                                f10 = 0.721f;
                            }
                            wa waVar = d3Var.f27411w;
                            if (waVar != null) {
                                w2 w2Var = a3Var.m0;
                                int totalHeight = w2Var.getTotalHeight();
                                w2Var.f14953e = waVar;
                                hi.r[] rVarArr = w2Var.f14954f;
                                hi.t.b(rVarArr[0].f14916l, (hi.s) waVar.f701c, false);
                                hi.t.b(rVarArr[1].f14916l, (hi.s) waVar.d, false);
                                w2Var.invalidate();
                                if (totalHeight != w2Var.getTotalHeight() && w2Var.f14956r != null) {
                                    if (totalHeight < w2Var.getTotalHeight()) {
                                        org.telegram.messenger.g0.i3(w2Var.f14956r, 200L);
                                    } else {
                                        w2Var.f14956r.run();
                                    }
                                }
                                int i21 = waVar.f700b;
                                Paint paint = w2Var.f14950a;
                                w2Var.f14953e.f700b = i21;
                                paint.setColor(i21);
                                w2Var.d.a(i21, true);
                            }
                            a3Var.C(d3Var.f27414z, false, d3Var.A);
                            q4 q4Var = d3Var.f27392a;
                            if (q4Var != null) {
                                i11 = q4Var.f14891a;
                            } else {
                                i11 = p10.f24474s0;
                            }
                            a3Var.H = i11;
                            u0 u0Var = d3Var.f27393b;
                            if (u0Var != null) {
                                u0Var.onResume();
                                s2Var.O(a3Var.H, d3Var.f27393b, d3Var.d, d3Var.f27396f, d3Var.f27395e);
                                if (!d3Var.f27409t && !d3Var.f27393b.f51249b) {
                                    z9 = false;
                                } else {
                                    z9 = true;
                                }
                                String str7 = d3Var.f27412x;
                                s2Var.g("setState(" + z9 + ", " + str7 + ")");
                                s2Var.N = z9;
                                s2Var.f51297b = str7;
                                if (m6.I.q() != d3Var.D) {
                                    s2Var.z();
                                }
                            } else {
                                q4Var.f14905q = null;
                                q4Var.f14906r = 0L;
                            }
                            a3Var.x(f2Var, d3Var.f27392a);
                            a3Var.f14517c0 = d3Var.v;
                            if (d3Var.G) {
                                a3Var.W0 = true;
                                a3Var.m();
                                b3 b3Var = a3Var.Y0;
                                if (a3Var.q()) {
                                    p10 = a3Var.f14542w0.f14894e;
                                } else {
                                    p10 = t10.p(qp.s1(a3Var.H).a2(Long.valueOf(a3Var.I)));
                                }
                                String str8 = d3Var.H;
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
                            a3Var.t(d3Var.L);
                            e3Var.h(e3Var.f27441x, d3Var, false);
                            a3Var.show();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 2:
                i3 i3Var = (i3) obj2;
                ((d3) obj3).f27402m = (Bitmap) obj;
                i3Var.mo25d().setDrawingFromOverlay(false);
                i3Var.release();
                return;
            case 3:
                k3 k3Var = (k3) obj2;
                l3 l3Var = (l3) ((f6) obj3).f11988q;
                if (((Boolean) obj).booleanValue()) {
                    k3Var.a(1.0f);
                    if (l3Var.f27728a.getTabs().isEmpty()) {
                        l3Var.a(false);
                        return;
                    }
                    return;
                }
                k3Var.a(0.0f);
                return;
            case 4:
                g4 g4Var = (g4) obj3;
                Activity activity = (Activity) obj2;
                Integer num = (Integer) obj;
                t3 t3Var = g4Var.K;
                org.telegram.ui.k0[] k0VarArr = g4Var.T0;
                if ((!g4Var.f45971u0[0].c() || g4Var.f45971u0[0].f47143c.E != null) && g4Var.L != null) {
                    if (num.intValue() == 1) {
                        org.telegram.ui.l0 l0Var = g4Var.f45959h0;
                        int L = org.telegram.messenger.g0.L(56.0f);
                        g4Var.J0 = L;
                        l0Var.setHeight(L);
                        g4Var.f45959h0.h(true);
                        return;
                    } else if (num.intValue() == 2) {
                        if (g4Var.f45971u0[0].f()) {
                            if (g4Var.f45971u0[0].getWebView() != null) {
                                str5 = g4Var.f45971u0[0].getWebView().getUrl();
                            } else {
                                return;
                            }
                        } else {
                            TLRPC.WebPage webPage = g4Var.f45971u0[0].f47143c.E;
                            if (webPage != null) {
                                str5 = webPage.url;
                            } else {
                                return;
                            }
                        }
                        String u10 = x0.u(str5);
                        Activity activity2 = g4Var.L;
                        if (org.telegram.messenger.g0.B(g4Var.f45959h0.getBackgroundColor()) < 0.721f) {
                            bVar = new di.b();
                        }
                        g4Var.Y(new mo0(activity2, null, u10, false, u10, false, bVar));
                        return;
                    } else if (num.intValue() == 6) {
                        if (g4Var.f45971u0[0].f()) {
                            if (g4Var.f45971u0[0].getWebView() != null) {
                                str4 = g4Var.f45971u0[0].getWebView().getUrl();
                                frameLayout = g4Var.f45971u0[0].f47145f;
                            } else {
                                return;
                            }
                        } else {
                            org.telegram.ui.k3 k3Var2 = g4Var.f45971u0[0];
                            TLRPC.WebPage webPage2 = k3Var2.f47143c.E;
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
                        obj4.f27388a = true;
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
                        obj5.f27388a = true;
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
                        if (g4Var.f45971u0[0].getWebView() != null) {
                            g4Var.f45971u0[0].getWebView().goForward();
                            return;
                        }
                        return;
                    } else if (num.intValue() == 3) {
                        if (g4Var.f45971u0[0].f()) {
                            if (g4Var.f45971u0[0].getWebView() != null) {
                                str = g4Var.f45971u0[0].getWebView().getUrl();
                                str2 = g4Var.f45971u0[0].getWebView().getOpenURL();
                                file = null;
                            } else {
                                return;
                            }
                        } else {
                            TLRPC.WebPage webPage3 = g4Var.f45971u0[0].f47143c.E;
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
                                Pattern pattern = n80.f36259a;
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
                                if (g4Var.f45971u0[0].f() && qp.s1(g4Var.X).N2(K02) && !qp.s1(g4Var.X).L2(true)) {
                                    u4.l0(activity, null, str, true, new p5(8, yVar, xVar));
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
                        if (g4Var.f45971u0[0].f()) {
                            f2 T3 = LaunchActivity.T();
                            if (T3 != 0) {
                                ?? obj6 = new Object();
                                obj6.f27388a = true;
                                T3.showAsSheet(new o1(new org.telegram.ui.q(g4Var, 3)), obj6);
                                return;
                            }
                            return;
                        }
                        org.telegram.ui.ActionBar.w2 h = org.telegram.messenger.camera.q.h(g4Var.L, false, 1, null);
                        h.f28706u0 = false;
                        LinearLayout linearLayout = new LinearLayout(g4Var.L);
                        linearLayout.setPadding(0, 0, 0, org.telegram.messenger.g0.L(4.0f));
                        linearLayout.setOrientation(1);
                        n4 n4Var = new n4(g4Var.L, (h6) null);
                        n4Var.setText(id.M0(2131750609, null));
                        linearLayout.addView(n4Var, ha.t(-2, -2, 51, 3, 1, 3, 0));
                        linearLayout.addView(new c4(g4Var, g4Var.L), ha.t(-1, -2, 51, 3, 0, 3, 0));
                        n4 n4Var2 = new n4(g4Var.L, (h6) null);
                        n4Var2.setText(id.M0(2131750604, null));
                        linearLayout.addView(n4Var2, ha.t(-2, -2, 51, 3, 4, 3, 2));
                        int i22 = 0;
                        for (int i23 = 2; i22 < i23; i23 = 2) {
                            Activity activity4 = g4Var.L;
                            org.telegram.ui.k0 k0Var = new org.telegram.ui.k0(activity4, 1);
                            int i24 = m6.f27982i6;
                            org.telegram.ui.Cells.y h02 = m6.h0(m6.x0(null, i24, false), i23, -1);
                            p6 M = t6.M(i24);
                            k0Var.setBackground(h02);
                            t6.j(k0Var, h02, null, M, null);
                            RadioButton radioButton = new RadioButton(activity4);
                            k0Var.f47127b = radioButton;
                            radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
                            t6.O(radioButton, m6.D5, m6.E5, null);
                            boolean z17 = id.f23161a0;
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
                            t6.U(textView, m6.G6, null);
                            org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
                            textView.setSingleLine(true);
                            if (id.f23161a0) {
                                i15 = 5;
                            } else {
                                i15 = 3;
                            }
                            textView.setGravity(i15 | 16);
                            boolean z18 = id.f23161a0;
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
                                String M0 = id.M0(2131751600, null);
                                Typeface typeface2 = Typeface.DEFAULT;
                                textView.setText(M0);
                                textView.setTypeface(typeface2);
                                k0Var.setContentDescription(M0);
                                k0Var.invalidate();
                            }
                            org.telegram.ui.k0 k0Var2 = k0VarArr[i22];
                            if (i22 == g4Var.f49249a) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            ((RadioButton) k0Var2.f47127b).a(z10, false);
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
                        if (g4Var.f45971u0[0].f() && g4Var.f45971u0[0].getWebView() != null) {
                            g4Var.f45971u0[0].getWebView().reload();
                            return;
                        }
                        return;
                    } else if (num.intValue() == 10 && (u1Var = g4Var.f45971u0[0].E) != null && u1Var.b() != null) {
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
                    Pattern pattern2 = Utilities.f21338a;
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
                        String str11 = f1.a().f51065b;
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
                rcVar.f49355c = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    int i30 = tL_premium_boostsStatus.level;
                    rcVar.f49353b = i30;
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
                    hcVar.setBackgroundColor(m6.w0(m6.f27890d6, icVar.f46609a));
                    icVar.f46610b.getClass();
                    int R = RecyclerView.R(view);
                    if (gpVar != null) {
                        ArrayList arrayList = gpVar.f22710c;
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
                i0Var.A1((org.telegram.messenger.e3) obj);
                ((zd) obj3).m0.showDialog(i0Var);
                return;
            case 9:
                cn cnVar2 = (cn) obj3;
                Long l10 = (Long) obj;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = new TLRPC.TL_messages_sendQuickReplyMessages();
                tL_messages_sendQuickReplyMessages.peer = cnVar2.getMessagesController().j1(cnVar2.f44545j6);
                tL_messages_sendQuickReplyMessages.shortcut_id = ((s1) obj2).f17535a;
                cnVar2.getConnectionsManager().sendRequest(tL_messages_sendQuickReplyMessages, null);
                sj sjVar2 = cnVar2.Z;
                if (sjVar2 != null) {
                    sjVar2.setFieldText(null);
                    return;
                }
                return;
            case 10:
                cn cnVar3 = (cn) obj3;
                ez b10 = ez.b((String) obj2, cnVar3.f44545j6, cnVar3.D5, cnVar3.f44568l4, null, false, null, null, null, true, 0, 0, null, false);
                b10.K = cnVar3.X8();
                b10.Q = ((Long) obj).longValue();
                b10.R = cnVar3.i9();
                b10.T = cnVar3.f44708w5;
                cnVar3.getSendMessagesHelper().r0(b10);
                cnVar3.Z.setFieldText("");
                cnVar3.C9(false);
                return;
            case 11:
                cn cnVar4 = (cn) obj3;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj2;
                Long l11 = (Long) obj;
                if (cnVar4.f44492f4 == 1) {
                    u4.J(cnVar4.getParentActivity(), cnVar4.f44545j6, new a7(cnVar4, botInlineResult, l11, 2), cnVar4.f44750za);
                    return;
                } else {
                    cnVar4.Gb(botInlineResult, true, 0, l11.longValue());
                    return;
                }
            case 12:
                Boolean bool = (Boolean) obj;
                ((cn) obj3).Hb = true;
                ((oe) obj2).run();
                return;
            case 13:
                cn.h0((cn) obj3, (wy0[]) obj2, (k60) obj);
                return;
            case 14:
                cn cnVar5 = (cn) obj3;
                org.telegram.ui.ActionBar.u1[] u1VarArr = (org.telegram.ui.ActionBar.u1[]) obj2;
                TL_stats.TL_statsPollStats tL_statsPollStats = (TL_stats.TL_statsPollStats) obj;
                try {
                    u1VarArr[0].dismiss();
                } catch (Throwable unused2) {
                }
                u1VarArr[0] = null;
                if (tL_statsPollStats != null) {
                    if (tL_statsPollStats.votes_graph instanceof TL_stats.TL_statsGraphError) {
                        k5.o(null, 2131747157, gc.a0(cnVar5), 2131624292, 24);
                        return;
                    } else {
                        new vh.h(cnVar5.getParentActivity(), cnVar5.f44750za, tL_statsPollStats).show();
                        return;
                    }
                }
                return;
            case 15:
                cn cnVar6 = (cn) obj3;
                ij ijVar = (ij) obj2;
                cnVar6.getClass();
                TLRPC.SuggestedPost c10 = ((nj) obj).c();
                if (ijVar != null && ijVar.f23266k != null) {
                    cnVar6.getMessagesController().h(ijVar, c10);
                    return;
                }
                return;
            case 16:
                s1 s1Var = (s1) obj2;
                String str12 = (String) obj;
                cn cnVar7 = ((ui) obj3).f50508b;
                if (s1Var != null) {
                    i18 = ((f2) cnVar7).currentAccount;
                    t1.f(i18).k(s1Var.f17535a, str12);
                }
                cnVar7.f44478e4 = str12;
                cnVar7.f44601o1.setTitle(str12);
                return;
            case 17:
                ij ijVar2 = (ij) obj2;
                Long l12 = (Long) obj;
                cn cnVar8 = ((nm) obj3).f48227a;
                if (cnVar8.u7()) {
                    ez b11 = ez.b(ijVar2.C0(), cnVar8.f44545j6, cnVar8.D5, cnVar8.f44568l4, null, false, null, null, null, true, 0, 0, null, false);
                    b11.K = cnVar8.X8();
                    b11.W = l12.longValue();
                    cnVar8.getSendMessagesHelper().r0(b11);
                    return;
                }
                return;
            case 18:
                q1 q1Var = (q1) obj2;
                cn cnVar9 = ((nm) obj3).f48227a;
                if (((Boolean) obj).booleanValue()) {
                    for (int i31 = 0; i31 < cnVar9.f44741z0.getChildCount(); i31++) {
                        View childAt = cnVar9.f44741z0.getChildAt(i31);
                        if (childAt instanceof q1) {
                            q1 q1Var2 = (q1) childAt;
                            if (q1Var2.getMessageObject() != null && q1Var2.getMessageObject().p4()) {
                                q1Var2.H3();
                            }
                        }
                    }
                    return;
                }
                if (q1Var.getMessageObject() != null) {
                    q1Var.getMessageObject().f23294r2 = Boolean.FALSE;
                }
                q1Var.H3();
                return;
            case 19:
                nm nmVar = (nm) obj3;
                k kVar = (k) obj2;
                cn cnVar10 = nmVar.f48227a;
                if (!((Boolean) obj).booleanValue()) {
                    gc.a0(cnVar10).I(2131624011, id.M0(2131754311, null), id.M0(2131754312, null)).j();
                    return;
                }
                cnVar10.getMessagesController().F4(true);
                gc.a0(cnVar10).P(2131623981, org.telegram.messenger.g0.H2(org.telegram.messenger.g0.x2(id.M0(2131745574, null), new vl(nmVar, 8)), true)).k(true);
                kVar.a(Boolean.TRUE);
                return;
            case 20:
                TLRPC.Message message = (TLRPC.Message) obj2;
                ((nm) obj3).f48227a.getMessagesController().v(message.f26981id, -1, m5.o(message.peer_id), (String) obj, true);
                return;
            case 21:
                fn fnVar = (fn) obj3;
                fnVar.f45808f.s(((TLRPC.WallPaper) obj2).settings.intensity, ((gg.a) obj).f13955a);
                View view2 = fnVar.f45805b;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 22:
                Long l13 = (Long) obj;
                ChatActivityEnterView chatActivityEnterView = ((ve) obj3).f38989a;
                long j3 = chatActivityEnterView.Q2;
                ij ijVar3 = chatActivityEnterView.T2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                ez b12 = ez.b((String) obj2, j3, ijVar3, threadMessage, null, false, null, null, null, true, 0, 0, null, false);
                cn cnVar11 = chatActivityEnterView.P2;
                if (cnVar11 != null) {
                    hwVar = cnVar11.X8();
                }
                b12.K = hwVar;
                b12.O = chatActivityEnterView.S4;
                b12.Q = l13.longValue();
                b12.R = chatActivityEnterView.getSendMonoForumPeerId();
                b12.T = chatActivityEnterView.getSendMessageSuggestionParams();
                gz.C(chatActivityEnterView.Q).r0(b12);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.m0.c();
                fe feVar = chatActivityEnterView.J0;
                chatActivityEnterView.S4 = 0L;
                feVar.setEffect(0L);
                return;
            case 23:
                ci ciVar = (ci) obj3;
                vh vhVar = (vh) obj2;
                Boolean bool2 = (Boolean) obj;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i32 = ciVar.G3;
                tL_messages_toggleBotInAttachMenu.bot = qp.s1(i32).o1(vhVar.f39007c.bot_id);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i32).sendRequest(tL_messages_toggleBotInAttachMenu, new ld(12, ciVar, vhVar), 66);
                return;
            case 24:
                ci ciVar2 = (ci) obj3;
                ((cn) obj2).f44708w5 = (nj) obj;
                boolean u12 = ciVar2.u1(true, 0, 0, ciVar2.K2, ciVar2.f1());
                te teVar = ciVar2.f32594b2;
                if (teVar != null) {
                    teVar.g(!u12);
                    ciVar2.f32594b2 = null;
                    return;
                }
                return;
            case 25:
                ((hi.c4) obj3).getWebViewContainer().G((String) obj2, (String) obj, false);
                return;
            case 26:
                mi miVar = (mi) obj3;
                qp qpVar = (qp) obj2;
                Long l14 = (Long) obj;
                miVar.f35969i0 = false;
                if (l14 != null) {
                    user = qpVar.a2(l14);
                }
                miVar.f35968h0 = user;
                if (user == null) {
                    z12 = true;
                }
                miVar.f35970j0 = z12;
                if (user != null) {
                    miVar.S();
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
                ro roVar = (ro) obj2;
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    linkedHashSet.addAll(tL_emojiList.document_id);
                }
                roVar.run();
                return;
            default:
                fx fxVar = (fx) obj3;
                gx gxVar = fxVar.f33663a;
                gy gyVar = gxVar.F;
                org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(gyVar.f34016c1);
                String[] strArr = gyVar.W0;
                String str13 = gxVar.f34001w;
                gr grVar = new gr(fxVar, (String) obj2, (Runnable) obj, 1);
                if (!iz.F && !p10.i(gyVar.f34016c1).q()) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                b02.V(strArr, str13, false, grVar, z11, false, true, false, 25);
                return;
        }
    }
}
