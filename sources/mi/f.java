package mi;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.net.Uri;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b8.kg;
import b8.mf;
import gi.g6;
import java.io.File;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.ej;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.l10;
import org.telegram.messenger.u10;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.messenger.w7;
import org.telegram.messenger.wo;
import org.telegram.messenger.wy;
import org.telegram.messenger.xo;
import org.telegram.messenger.yy;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.ee;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.oo0;
import org.telegram.ui.Components.se;
import org.telegram.ui.Components.ue;
import org.telegram.ui.Components.uh;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.b7;
import org.telegram.ui.fc;
import org.telegram.ui.gc;
import org.telegram.ui.hm;
import org.telegram.ui.iy0;
import org.telegram.ui.mj;
import org.telegram.ui.oi;
import org.telegram.ui.pc;
import org.telegram.ui.pl;
import org.telegram.ui.sc;
import org.telegram.ui.wm;
import org.telegram.ui.xd;
import org.telegram.ui.zm;
public final class f implements u10 {
    public final int f19587a;
    public final Object f19588b;
    public final Object f19589c;

    public f(int i3, Object obj, Object obj2) {
        this.f19587a = i3;
        this.f19588b = obj;
        this.f19589c = obj2;
    }

    @Override
    public final void a(Object obj) {
        r a10;
        int i3;
        float f10;
        String p10;
        wm wmVar;
        mj mjVar;
        org.telegram.ui.web.s1 s1Var;
        String str;
        String str2;
        File file;
        String str3;
        FrameLayout frameLayout;
        String str4;
        Uri uri;
        int i10;
        zi threadMessage;
        int i11 = this.f19587a;
        String str5 = null;
        int i12 = 0;
        Object obj2 = this.f19589c;
        Object obj3 = this.f19588b;
        switch (i11) {
            case 0:
                TL_iv.pageBlockMath pageblockmath = (TL_iv.pageBlockMath) obj2;
                String str6 = (String) obj;
                t3 t3Var = ((p) obj3).f19793r;
                if (pageblockmath != null) {
                    pageblockmath.source = str6;
                    t3Var.f35594g3.O(false);
                    return;
                }
                TL_iv.pageBlockMath pageblockmath2 = new TL_iv.pageBlockMath();
                pageblockmath2.source = str6;
                t3Var.V1(pageblockmath2);
                return;
            case 1:
                h1 h1Var = (h1) obj3;
                r rVar = (r) obj2;
                String str7 = (String) obj;
                h1Var.getClass();
                if (TextUtils.isEmpty(str7)) {
                    return;
                }
                Editable text = h1Var.getText();
                int spanStart = text.getSpanStart(rVar);
                int spanEnd = text.getSpanEnd(rVar);
                if (spanStart < 0 || spanEnd < 0 || (a10 = r.a(str7, h1Var.getCurrentTextColor(), org.telegram.messenger.g0.L(az.W0 + 4))) == null) {
                    return;
                }
                boolean z10 = h1Var.f19652h2;
                if (z10) {
                    h1Var.setLocked(false);
                }
                SpannableString spannableString = new SpannableString(" ");
                spannableString.setSpan(a10, 0, 1, 33);
                int max = Math.max(0, Math.min(spanStart, h1Var.length()));
                text.replace(max, Math.max(max, Math.min(spanEnd, h1Var.length())), spannableString);
                h1Var.setSelection(Math.min(max + 1, h1Var.length()));
                if (z10) {
                    h1Var.setLocked(true);
                    return;
                }
                return;
            case 2:
                c2 c2Var = (c2) obj3;
                TL_iv.pageBlockMath pageblockmath3 = (TL_iv.pageBlockMath) obj2;
                String str8 = (String) obj;
                c2Var.getClass();
                if (pageblockmath3 != null) {
                    pageblockmath3.source = str8;
                    c2Var.Q.f35594g3.O(false);
                    return;
                }
                TL_iv.pageBlockMath pageblockmath4 = new TL_iv.pageBlockMath();
                pageblockmath4.source = str8;
                c2Var.Q.V1(pageblockmath4);
                return;
            case 3:
                t3 t3Var2 = (t3) obj3;
                TL_iv.pageBlockMath pageblockmath5 = (TL_iv.pageBlockMath) obj2;
                String str9 = (String) obj;
                t3Var2.getClass();
                if (TextUtils.equals(str9, pageblockmath5.source)) {
                    return;
                }
                g2 g2Var = t3Var2.R3;
                if (g2Var != null) {
                    g2Var.d();
                }
                pageblockmath5.source = str9;
                t3Var2.f35594g3.O(false);
                g2 g2Var2 = t3Var2.R3;
                if (g2Var2 != null) {
                    g2Var2.h();
                }
                t3Var2.f19916p3.onContentChanged();
                return;
            case 4:
                VoIPDebugToSend.b((VoIPDebugToSend) obj3, (TL_phone.saveCallDebug) obj2, (TLRPC.InputFile) obj);
                return;
            case 5:
                org.telegram.ui.ActionBar.b3 b3Var = (org.telegram.ui.ActionBar.b3) obj3;
                org.telegram.ui.ActionBar.a3 a3Var = (org.telegram.ui.ActionBar.a3) obj2;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj;
                if (d2Var == null) {
                    return;
                }
                if ((d2Var instanceof wm) && (mjVar = (wmVar = (wm) d2Var).f51237a0) != null) {
                    mjVar.L();
                    wmVar.f51237a0.k0(true, false, true);
                }
                if (d2Var.getContext() == null || d2Var.getParentActivity() == null) {
                    return;
                }
                ii.a3 a3Var2 = new ii.a3(d2Var.getContext(), d2Var.getResourceProvider());
                a3Var2.m0 = d2Var.getParentActivity();
                if (a3Var == null || a3Var.f27351a == null) {
                    return;
                }
                a3Var2.G0 = true;
                boolean z11 = a3Var.f27363o;
                a3Var2.X = z11;
                if (z11) {
                    a3Var2.A(a3Var.f27366r, false);
                }
                if (a3Var.f27362n) {
                    i3 = a3Var.f27365q;
                } else {
                    int i13 = a3Var.f27364p;
                    if (i13 < 0) {
                        i13 = k6.f27878d6;
                    }
                    i3 = k6.w0(i13, a3Var2.G);
                }
                a3Var2.y(i3, a3Var.f27362n, false);
                a3Var2.D(a3Var.f27367s, false);
                a3Var2.H0 = a3Var.f27358j;
                a3Var2.I0 = a3Var.f27359k;
                boolean z12 = a3Var.f27369u;
                a3Var2.f14827y0 = z12;
                ii.s2 s2Var = a3Var2.E;
                s2Var.setIsBackButtonVisible(z12);
                a3Var2.f14824x.setAllowSwipes(a3Var.f27360l);
                org.telegram.messenger.g0.R3(a3Var2.Y.getBackButton(), a3Var2.f14827y0 ? 2131231240 : 2131231269);
                org.telegram.messenger.h2 h2Var = a3Var2.f14812o0;
                if (h2Var != null) {
                    boolean z13 = a3Var2.f14827y0;
                    h2Var.L = z13;
                    h2Var.M.d(z13);
                    h2Var.invalidate();
                }
                a3Var2.f14819t0 = a3Var.f27372y;
                a3Var2.B0 = Boolean.valueOf(a3Var.B);
                a3Var2.C0 = a3Var.C;
                ii.w0 w0Var = a3Var.K;
                a3Var2.D0 = w0Var;
                if (w0Var != null) {
                    ii.u0 u0Var = w0Var.f15299r;
                    SensorManager sensorManager = w0Var.f15284a;
                    f10 = 0.721f;
                    if (w0Var.f15293l) {
                        w0Var.f15293l = false;
                        if (sensorManager != null) {
                            Sensor sensor = w0Var.f15285b;
                            if (sensor != null) {
                                sensorManager.registerListener(w0Var.f15295n, sensor, ii.w0.a(w0Var.f15286c));
                            }
                            Sensor sensor2 = w0Var.d;
                            if (sensor2 != null) {
                                sensorManager.registerListener(w0Var.f15297p, sensor2, ii.w0.a(w0Var.f15287e));
                            }
                            Sensor sensor3 = w0Var.f15289g;
                            if (sensor3 != null) {
                                sensorManager.registerListener(u0Var, sensor3, ii.w0.a(w0Var.h));
                            }
                            Sensor sensor4 = w0Var.f15288f;
                            if (sensor4 != null) {
                                sensorManager.registerListener(u0Var, sensor4, ii.w0.a(w0Var.h));
                            }
                            Sensor sensor5 = w0Var.f15290i;
                            if (sensor5 != null) {
                                sensorManager.registerListener(w0Var.f15301t, sensor5, ii.w0.a(w0Var.f15291j));
                            }
                        }
                    }
                } else {
                    f10 = 0.721f;
                }
                kg kgVar = a3Var.f27370w;
                if (kgVar != null) {
                    ii.w2 w2Var = a3Var2.f14811n0;
                    int totalHeight = w2Var.getTotalHeight();
                    w2Var.f15261e = kgVar;
                    ii.t[] tVarArr = w2Var.f15262f;
                    ii.v.b(tVarArr[0].f15230l, (ii.u) kgVar.f2723c, false);
                    ii.v.b(tVarArr[1].f15230l, (ii.u) kgVar.d, false);
                    w2Var.invalidate();
                    if (totalHeight != w2Var.getTotalHeight() && w2Var.f15264r != null) {
                        if (totalHeight < w2Var.getTotalHeight()) {
                            org.telegram.messenger.g0.i3(w2Var.f15264r, 200L);
                        } else {
                            w2Var.f15264r.run();
                        }
                    }
                    int i14 = kgVar.f2722b;
                    Paint paint = w2Var.f15258a;
                    w2Var.f15261e.f2722b = i14;
                    paint.setColor(i14);
                    w2Var.d.a(i14, true);
                }
                a3Var2.C(a3Var.f27373z, false, a3Var.A);
                ii.q4 q4Var = a3Var.f27351a;
                a3Var2.I = q4Var != null ? q4Var.f15164a : h10.f22829t0;
                org.telegram.ui.web.t0 t0Var = a3Var.f27352b;
                if (t0Var != null) {
                    t0Var.onResume();
                    s2Var.N(a3Var2.I, a3Var.f27352b, a3Var.d, a3Var.f27355f, a3Var.f27354e);
                    boolean z14 = a3Var.f27368t || a3Var.f27352b.f51022b;
                    String str10 = a3Var.f27371x;
                    s2Var.g("setState(" + z14 + ", " + str10 + ")");
                    s2Var.O = z14;
                    s2Var.f51062b = str10;
                    if (k6.I.q() != a3Var.D) {
                        s2Var.z();
                    }
                } else {
                    q4Var.f15178q = null;
                    q4Var.f15179r = 0L;
                }
                a3Var2.x(d2Var, a3Var.f27351a);
                a3Var2.f14799d0 = a3Var.v;
                if (a3Var.G) {
                    a3Var2.X0 = true;
                    a3Var2.m();
                    org.telegram.ui.c3 c3Var = a3Var2.Z0;
                    if (a3Var2.q()) {
                        p10 = a3Var2.f14825x0.f15167e;
                    } else {
                        p10 = l10.p(hp.s1(a3Var2.I).a2(Long.valueOf(a3Var2.J)));
                    }
                    String str11 = a3Var.H;
                    a3Var2.Y0 = str11;
                    c3Var.a(p10, str11);
                    org.telegram.ui.c3 c3Var2 = a3Var2.Z0;
                    Paint paint2 = a3Var2.R;
                    c3Var2.b(org.telegram.messenger.g0.B(paint2.getColor()) <= f10, false);
                    a3Var2.Z0.setBackgroundColor(paint2.getColor());
                    a3Var2.Z0.setVisibility(0);
                    a3Var2.Z0.setAlpha(1.0f);
                }
                a3Var2.t(a3Var.L);
                b3Var.h(b3Var.f27408x, a3Var, false);
                a3Var2.show();
                return;
            case 6:
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) obj2;
                ((org.telegram.ui.ActionBar.a3) obj3).f27361m = (Bitmap) obj;
                g3Var.mo25d().setDrawingFromOverlay(false);
                g3Var.release();
                return;
            case 7:
                org.telegram.ui.ActionBar.i3 i3Var = (org.telegram.ui.ActionBar.i3) obj2;
                org.telegram.ui.ActionBar.j3 j3Var = (org.telegram.ui.ActionBar.j3) ((g6) obj3).f12836q;
                if (((Boolean) obj).booleanValue()) {
                    i3Var.a(1.0f);
                    if (j3Var.f27653a.getTabs().isEmpty()) {
                        j3Var.a(false);
                        return;
                    }
                    return;
                }
                i3Var.a(0.0f);
                return;
            case 8:
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) obj3;
                Activity activity = (Activity) obj2;
                Integer num = (Integer) obj;
                org.telegram.ui.u3 u3Var = i4Var.L;
                org.telegram.ui.l0[] l0VarArr = i4Var.U0;
                if ((i4Var.f46100v0[0].c() && i4Var.f46100v0[0].f47084c.F == null) || i4Var.M == null) {
                    return;
                }
                if (num.intValue() == 1) {
                    org.telegram.ui.m0 m0Var = i4Var.f46088i0;
                    int L = org.telegram.messenger.g0.L(56.0f);
                    i4Var.K0 = L;
                    m0Var.setHeight(L);
                    i4Var.f46088i0.h(true);
                    return;
                } else if (num.intValue() == 2) {
                    if (i4Var.f46100v0[0].f()) {
                        if (i4Var.f46100v0[0].getWebView() == null) {
                            return;
                        }
                        str4 = i4Var.f46100v0[0].getWebView().getUrl();
                    } else {
                        TLRPC.WebPage webPage = i4Var.f46100v0[0].f47084c.F;
                        if (webPage == null) {
                            return;
                        }
                        str4 = webPage.url;
                    }
                    String u10 = org.telegram.ui.web.w0.u(str4);
                    i4Var.Y(new oo0(i4Var.M, null, u10, false, u10, false, org.telegram.messenger.g0.B(i4Var.f46088i0.getBackgroundColor()) < 0.721f ? new ei.b() : null));
                    return;
                } else if (num.intValue() == 6) {
                    if (i4Var.f46100v0[0].f()) {
                        if (i4Var.f46100v0[0].getWebView() == null) {
                            return;
                        }
                        str3 = i4Var.f46100v0[0].getWebView().getUrl();
                        frameLayout = i4Var.f46100v0[0].f47086f;
                    } else {
                        org.telegram.ui.l3 l3Var = i4Var.f46100v0[0];
                        TLRPC.WebPage webPage2 = l3Var.f47084c.F;
                        if (webPage2 == null) {
                            return;
                        }
                        str3 = webPage2.url;
                        frameLayout = l3Var;
                    }
                    org.telegram.ui.i4.d(str3, i4Var.Y, frameLayout, u3Var, null);
                    return;
                } else if (num.intValue() == 7) {
                    ?? obj4 = new Object();
                    obj4.f27395a = true;
                    org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                    if (T != 0) {
                        T.showAsSheet(new org.telegram.ui.web.n(u3Var != null ? new org.telegram.ui.b0(i4Var, 6) : null, new org.telegram.ui.q(i4Var, 2)), obj4);
                        return;
                    }
                    return;
                } else if (num.intValue() == 8) {
                    ?? obj5 = new Object();
                    obj5.f27395a = true;
                    org.telegram.ui.ActionBar.d2 T2 = LaunchActivity.T();
                    if (T2 != 0) {
                        T2.showAsSheet(new org.telegram.ui.web.y0(u3Var != null ? new org.telegram.ui.b0(i4Var, 7) : null, new org.telegram.ui.q(i4Var, 3)), obj5);
                        return;
                    }
                    return;
                } else if (num.intValue() == 9) {
                    if (i4Var.f46100v0[0].getWebView() != null) {
                        i4Var.f46100v0[0].getWebView().goForward();
                        return;
                    }
                    return;
                } else if (num.intValue() == 3) {
                    if (i4Var.f46100v0[0].f()) {
                        if (i4Var.f46100v0[0].getWebView() == null) {
                            return;
                        }
                        str = i4Var.f46100v0[0].getWebView().getUrl();
                        str2 = i4Var.f46100v0[0].getWebView().getOpenURL();
                        file = null;
                    } else {
                        TLRPC.WebPage webPage3 = i4Var.f46100v0[0].f47084c.F;
                        if (webPage3 == null) {
                            return;
                        }
                        String str12 = webPage3.url;
                        TL_iv.Page page = webPage3.cached_page;
                        if (page != null) {
                            file = page.local;
                            str = str12;
                            str2 = null;
                        } else {
                            str = str12;
                            str2 = null;
                            file = null;
                        }
                    }
                    Activity activity2 = i4Var.M;
                    if (activity2 == null || activity2.isFinishing()) {
                        return;
                    }
                    if (file != null) {
                        String D = w7.D(file);
                        Pattern pattern = k80.f35339a;
                        org.telegram.messenger.g0.t2(file, null, ("diff".equalsIgnoreCase(D) || "patch".equalsIgnoreCase(D)) ? "text/x-diff" : "text/markdown", i4Var.M, null, true);
                        return;
                    } else if (str == null) {
                        return;
                    } else {
                        String K0 = org.telegram.messenger.g0.K0(str2, true);
                        String K02 = org.telegram.messenger.g0.K0(str, true);
                        org.telegram.ui.y yVar = new org.telegram.ui.y(i4Var, str, 1);
                        org.telegram.ui.z zVar = new org.telegram.ui.z(i4Var, K02, K0, 1);
                        if (i4Var.f46100v0[0].f() && hp.s1(i4Var.Y).N2(K02) && !hp.s1(i4Var.Y).L2(true)) {
                            org.telegram.ui.Components.t4.n0(activity, null, str, true, new ai.q4(9, zVar, yVar));
                            return;
                        } else {
                            yVar.run();
                            return;
                        }
                    }
                } else if (num.intValue() == 4) {
                    if (i4Var.f46100v0[0].f()) {
                        org.telegram.ui.ActionBar.d2 T3 = LaunchActivity.T();
                        if (T3 != 0) {
                            ?? obj6 = new Object();
                            obj6.f27395a = true;
                            T3.showAsSheet(new org.telegram.ui.web.m1(new org.telegram.ui.q(i4Var, 3)), obj6);
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.ActionBar.t2 h = org.telegram.messenger.camera.q.h(i4Var.M, false, 1, null);
                    h.f28619v0 = false;
                    LinearLayout linearLayout = new LinearLayout(i4Var.M);
                    linearLayout.setPadding(0, 0, 0, org.telegram.messenger.g0.L(4.0f));
                    linearLayout.setOrientation(1);
                    org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(i4Var.M, (org.telegram.ui.ActionBar.e6) null);
                    n4Var.setText(bd.M0(2131750610, null));
                    linearLayout.addView(n4Var, mf.t(-2, -2, 51, 3, 1, 3, 0));
                    linearLayout.addView(new org.telegram.ui.d4(i4Var, i4Var.M), mf.t(-1, -2, 51, 3, 0, 3, 0));
                    org.telegram.ui.Cells.n4 n4Var2 = new org.telegram.ui.Cells.n4(i4Var.M, (org.telegram.ui.ActionBar.e6) null);
                    n4Var2.setText(bd.M0(2131750605, null));
                    linearLayout.addView(n4Var2, mf.t(-2, -2, 51, 3, 4, 3, 2));
                    int i15 = 0;
                    for (int i16 = 2; i15 < i16; i16 = 2) {
                        Activity activity3 = i4Var.M;
                        org.telegram.ui.l0 l0Var = new org.telegram.ui.l0(activity3, 1);
                        int i17 = k6.f27972i6;
                        org.telegram.ui.Cells.y h02 = k6.h0(k6.x0(null, i17, false), i16, -1);
                        n6 N = r6.N(i17);
                        l0Var.setBackground(h02);
                        r6.k(l0Var, h02, null, N, null);
                        RadioButton radioButton = new RadioButton(activity3);
                        l0Var.f47060b = radioButton;
                        radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
                        r6.P(radioButton, k6.D5, k6.E5, null);
                        boolean z15 = bd.f21784a0;
                        l0Var.addView(radioButton, mf.d(22, 22.0f, (z15 ? 5 : 3) | 48, z15 ? 0 : 22, 13.0f, z15 ? 22 : 0, 0.0f));
                        TextView textView = new TextView(activity3);
                        r6.V(textView, k6.G6, null);
                        org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
                        textView.setSingleLine(true);
                        textView.setGravity((bd.f21784a0 ? 5 : 3) | 16);
                        boolean z16 = bd.f21784a0;
                        l0Var.addView(textView, mf.d(-1, -1.0f, (z16 ? 5 : 3) | 48, z16 ? 17 : 62, 0.0f, z16 ? 62 : 17, 0.0f));
                        l0VarArr[i15] = l0Var;
                        if (i15 == 0) {
                            String M0 = bd.M0(2131751601, null);
                            Typeface typeface = Typeface.DEFAULT;
                            textView.setText(M0);
                            textView.setTypeface(typeface);
                            l0Var.setContentDescription(M0);
                            l0Var.invalidate();
                        } else if (i15 == 1) {
                            Typeface typeface2 = Typeface.SERIF;
                            textView.setText("Serif");
                            textView.setTypeface(typeface2);
                            l0Var.setContentDescription("Serif");
                            l0Var.invalidate();
                        }
                        ((RadioButton) l0VarArr[i15].f47060b).a(i15 == i4Var.f46110a, false);
                        l0VarArr[i15].setTag(Integer.valueOf(i15));
                        l0VarArr[i15].setOnClickListener(new org.telegram.ui.r(i4Var, 4));
                        linearLayout.addView(l0VarArr[i15], mf.o(-1, 50));
                        i15++;
                    }
                    h.O = linearLayout;
                    i4Var.J = h;
                    i4Var.Y(h);
                    return;
                } else if (num.intValue() == 5) {
                    if (!i4Var.f46100v0[0].f() || i4Var.f46100v0[0].getWebView() == null) {
                        return;
                    }
                    i4Var.f46100v0[0].getWebView().reload();
                    return;
                } else if (num.intValue() != 10 || (s1Var = i4Var.f46100v0[0].F) == null || s1Var.b() == null) {
                    return;
                } else {
                    i4Var.f(s1Var.b(), null, 1);
                    return;
                }
            case 9:
                org.telegram.ui.l3 l3Var2 = (org.telegram.ui.l3) obj3;
                Activity activity4 = (Activity) obj2;
                String str13 = (String) obj;
                if (TextUtils.isEmpty(str13) || l3Var2.getWebView() == null) {
                    return;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str13.trim());
                org.telegram.messenger.g0.c(spannableStringBuilder, 1, false, true);
                URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                int length = spannableStringBuilder.length();
                int i18 = 0;
                while (i12 < uRLSpanArr.length) {
                    length = Math.min(spannableStringBuilder.getSpanStart(uRLSpanArr[i12]), length);
                    i18 = Math.max(spannableStringBuilder.getSpanEnd(uRLSpanArr[i12]), i18);
                    i12++;
                }
                Pattern pattern2 = Utilities.f21384a;
                try {
                    uri = Uri.parse(str13);
                } catch (Exception unused) {
                    uri = null;
                }
                if (uri == null || !TextUtils.equals(uri.getScheme(), "javascript")) {
                    if ((uRLSpanArr.length > 0 && length == 0 && i18 > 0) || (uri != null && uri.getScheme() != null)) {
                        if (uri != null && uri.getScheme() == null && uri.getHost() == null && uri.getPath() != null) {
                            str13 = sf.c.w(uri, "https", null, uri.getEncodedPath(), "/");
                        }
                        l3Var2.getWebView().loadUrl(str13);
                        return;
                    }
                    org.telegram.ui.web.l.b(activity4, str13);
                    org.telegram.ui.web.t0 webView = l3Var2.getWebView();
                    String str14 = org.telegram.ui.web.d1.a().f50830b;
                    if (str14 != null) {
                        StringBuilder l10 = com.google.android.recaptcha.internal.a.l(str14);
                        l10.append(URLEncoder.encode(str13));
                        str5 = l10.toString();
                    }
                    webView.loadUrl(str5);
                    return;
                }
                return;
            case 10:
                pc pcVar = (pc) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                pcVar.f48514c = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    int i19 = tL_premium_boostsStatus.level;
                    pcVar.f48512b = i19;
                    if (chat != null) {
                        chat.flags |= 1024;
                        chat.level = i19;
                    }
                }
                pcVar.e1(true);
                gi.d dVar = pcVar.Q;
                if (dVar != null) {
                    dVar.setLoading(false);
                    return;
                }
                return;
            case 11:
                gc gcVar = (gc) obj3;
                xo xoVar = (xo) obj2;
                View view = (View) obj;
                if (view instanceof fc) {
                    fc fcVar = (fc) view;
                    fcVar.setBackgroundColor(k6.w0(k6.f27878d6, gcVar.f45628a));
                    gcVar.f45629b.getClass();
                    int R = RecyclerView.R(view);
                    if (xoVar != null) {
                        ArrayList arrayList = xoVar.f26419c;
                        if (R >= 0 && R < arrayList.size()) {
                            fcVar.a((wo) arrayList.get(R));
                        }
                    }
                    view.invalidate();
                    return;
                }
                return;
            case 12:
                vg.i0 i0Var = (vg.i0) obj2;
                i0Var.A1((org.telegram.messenger.e3) obj);
                ((xd) obj3).f51925n0.showDialog(i0Var);
                return;
            case 13:
                wm wmVar2 = (wm) obj3;
                Long l11 = (Long) obj;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = new TLRPC.TL_messages_sendQuickReplyMessages();
                tL_messages_sendQuickReplyMessages.peer = wmVar2.getMessagesController().j1(wmVar2.f51376k6);
                tL_messages_sendQuickReplyMessages.shortcut_id = ((lg.t1) obj2).f18473a;
                wmVar2.getConnectionsManager().sendRequest(tL_messages_sendQuickReplyMessages, null);
                mj mjVar2 = wmVar2.f51237a0;
                if (mjVar2 != null) {
                    mjVar2.setFieldText(null);
                    return;
                }
                return;
            case 14:
                wm wmVar3 = (wm) obj3;
                wy b10 = wy.b((String) obj2, wmVar3.f51376k6, wmVar3.E5, wmVar3.f51397m4, null, false, null, null, null, true, 0, 0, null, false);
                b10.K = wmVar3.W8();
                b10.Q = ((Long) obj).longValue();
                b10.R = wmVar3.h9();
                b10.T = wmVar3.f51540x5;
                wmVar3.getSendMessagesHelper().r0(b10);
                wmVar3.f51237a0.setFieldText("");
                wmVar3.B9(false);
                return;
            case 15:
                wm wmVar4 = (wm) obj3;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj2;
                Long l12 = (Long) obj;
                if (wmVar4.f51325g4 == 1) {
                    org.telegram.ui.Components.t4.L(wmVar4.getParentActivity(), wmVar4.f51376k6, new b7(wmVar4, botInlineResult, l12, 2), wmVar4.f51557ya);
                    return;
                } else {
                    wmVar4.Db(botInlineResult, true, 0, l12.longValue());
                    return;
                }
            case 16:
                Boolean bool = (Boolean) obj;
                ((wm) obj3).Gb = true;
                ((sc) obj2).run();
                return;
            case 17:
                wm.g0((wm) obj3, (iy0[]) obj2, (f60) obj);
                return;
            case 18:
                wm wmVar5 = (wm) obj3;
                org.telegram.ui.ActionBar.s1[] s1VarArr = (org.telegram.ui.ActionBar.s1[]) obj2;
                TL_stats.TL_statsPollStats tL_statsPollStats = (TL_stats.TL_statsPollStats) obj;
                try {
                    s1VarArr[0].dismiss();
                } catch (Throwable unused2) {
                }
                s1VarArr[0] = null;
                if (tL_statsPollStats != null) {
                    if (tL_statsPollStats.votes_graph instanceof TL_stats.TL_statsGraphError) {
                        org.telegram.messenger.k5.o(null, 2131747165, org.telegram.ui.Components.fc.a0(wmVar5), 2131624292, 24);
                        return;
                    } else {
                        new wh.i(wmVar5.getParentActivity(), wmVar5.f51557ya, tL_statsPollStats).show();
                        return;
                    }
                }
                return;
            case 19:
                wm wmVar6 = (wm) obj3;
                zi ziVar = (zi) obj2;
                wmVar6.getClass();
                TLRPC.SuggestedPost c2 = ((ej) obj).c();
                if (ziVar == null || ziVar.f26868k == null) {
                    return;
                }
                wmVar6.getMessagesController().h(ziVar, c2);
                return;
            case 20:
                lg.t1 t1Var = (lg.t1) obj2;
                String str15 = (String) obj;
                wm wmVar7 = ((oi) obj3).f48298b;
                if (t1Var != null) {
                    i10 = ((org.telegram.ui.ActionBar.d2) wmVar7).currentAccount;
                    lg.u1.f(i10).k(t1Var.f18473a, str15);
                }
                wmVar7.f51311f4 = str15;
                wmVar7.f51433p1.setTitle(str15);
                return;
            case 21:
                zi ziVar2 = (zi) obj2;
                Long l13 = (Long) obj;
                wm wmVar8 = ((hm) obj3).f45934a;
                if (wmVar8.t7()) {
                    wy b11 = wy.b(ziVar2.C0(), wmVar8.f51376k6, wmVar8.E5, wmVar8.f51397m4, null, false, null, null, null, true, 0, 0, null, false);
                    b11.K = wmVar8.W8();
                    b11.W = l13.longValue();
                    wmVar8.getSendMessagesHelper().r0(b11);
                    return;
                }
                return;
            case 22:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj2;
                wm wmVar9 = ((hm) obj3).f45934a;
                if (((Boolean) obj).booleanValue()) {
                    while (i12 < wmVar9.A0.getChildCount()) {
                        View childAt = wmVar9.A0.getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.q1) {
                            org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt;
                            if (q1Var2.getMessageObject() != null && q1Var2.getMessageObject().q4()) {
                                q1Var2.F3();
                            }
                        }
                        i12++;
                    }
                    return;
                }
                if (q1Var.getMessageObject() != null) {
                    q1Var.getMessageObject().f26896r2 = Boolean.FALSE;
                }
                q1Var.F3();
                return;
            case 23:
                hm hmVar = (hm) obj3;
                f fVar = (f) obj2;
                wm wmVar10 = hmVar.f45934a;
                if (!((Boolean) obj).booleanValue()) {
                    org.telegram.ui.Components.fc.a0(wmVar10).I(2131624011, bd.M0(2131754311, null), bd.M0(2131754312, null)).j();
                    return;
                }
                wmVar10.getMessagesController().F4(true);
                org.telegram.ui.Components.fc.a0(wmVar10).P(2131623981, org.telegram.messenger.g0.H2(org.telegram.messenger.g0.x2(bd.M0(2131745584, null), new pl(hmVar, 8)), true)).k(true);
                fVar.a(Boolean.TRUE);
                return;
            case 24:
                TLRPC.Message message = (TLRPC.Message) obj2;
                ((hm) obj3).f45934a.getMessagesController().v(message.f27022id, -1, org.telegram.messenger.m5.o(message.peer_id), (String) obj, true);
                return;
            case 25:
                zm zmVar = (zm) obj3;
                zmVar.f52710f.s(((hg.a) obj).f14399a, ((TLRPC.WallPaper) obj2).settings.intensity);
                View view2 = zmVar.f52707b;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 26:
                Long l14 = (Long) obj;
                ChatActivityEnterView chatActivityEnterView = ((ue) obj3).f38730a;
                long j10 = chatActivityEnterView.R2;
                zi ziVar3 = chatActivityEnterView.U2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                wy b12 = wy.b((String) obj2, j10, ziVar3, threadMessage, null, false, null, null, null, true, 0, 0, null, false);
                wm wmVar11 = chatActivityEnterView.Q2;
                b12.K = wmVar11 != null ? wmVar11.W8() : null;
                b12.O = chatActivityEnterView.T4;
                b12.Q = l14.longValue();
                b12.R = chatActivityEnterView.getSendMonoForumPeerId();
                b12.T = chatActivityEnterView.getSendMessageSuggestionParams();
                yy.C(chatActivityEnterView.R).r0(b12);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.f31162n0.c();
                ee eeVar = chatActivityEnterView.K0;
                chatActivityEnterView.T4 = 0L;
                eeVar.setEffect(0L);
                return;
            case 27:
                bi biVar = (bi) obj3;
                uh uhVar = (uh) obj2;
                Boolean bool2 = (Boolean) obj;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i20 = biVar.E3;
                tL_messages_toggleBotInAttachMenu.bot = hp.s1(i20).o1(uhVar.f38747c.bot_id);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i20).sendRequest(tL_messages_toggleBotInAttachMenu, new h6(15, biVar, uhVar), 66);
                return;
            case 28:
                bi biVar2 = (bi) obj3;
                ((wm) obj2).f51540x5 = (ej) obj;
                boolean u12 = biVar2.u1(true, 0, 0, biVar2.I2, biVar2.f1());
                se seVar = biVar2.Z1;
                if (seVar != null) {
                    seVar.g(!u12);
                    biVar2.Z1 = null;
                    return;
                }
                return;
            default:
                ((ii.d4) obj3).getWebViewContainer().F((String) obj2, (String) obj, false);
                return;
        }
    }
}
