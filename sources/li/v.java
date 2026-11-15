package li;

import a8.xa;
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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bi.e4;
import c8.ja;
import hi.e6;
import java.io.File;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.regex.Pattern;
import kg.u1;
import kg.v1;
import ki.k4;
import ki.p2;
import ki.t2;
import ki.u0;
import ki.w0;
import ki.x2;
import oi.d2;
import oi.e1;
import oi.q3;
import oi.z1;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cp;
import org.telegram.messenger.cz;
import org.telegram.messenger.dp;
import org.telegram.messenger.e3;
import org.telegram.messenger.ez;
import org.telegram.messenger.fw;
import org.telegram.messenger.gj;
import org.telegram.messenger.gz;
import org.telegram.messenger.h2;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.k5;
import org.telegram.messenger.lj;
import org.telegram.messenger.m10;
import org.telegram.messenger.m5;
import org.telegram.messenger.np;
import org.telegram.messenger.q10;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.messenger.w7;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.b3;
import org.telegram.ui.ActionBar.c3;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.i3;
import org.telegram.ui.ActionBar.j3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u2;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.he;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.po0;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.ue;
import org.telegram.ui.Components.we;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.a7;
import org.telegram.ui.an;
import org.telegram.ui.c4;
import org.telegram.ui.dn;
import org.telegram.ui.g4;
import org.telegram.ui.gc;
import org.telegram.ui.hc;
import org.telegram.ui.k3;
import org.telegram.ui.lm;
import org.telegram.ui.qc;
import org.telegram.ui.qj;
import org.telegram.ui.qy0;
import org.telegram.ui.si;
import org.telegram.ui.t3;
import org.telegram.ui.tl;
import org.telegram.ui.u5;
import org.telegram.ui.v7;
import org.telegram.ui.web.d1;
import org.telegram.ui.web.n1;
import org.telegram.ui.web.s0;
import org.telegram.ui.web.t1;
import org.telegram.ui.web.v0;
import org.telegram.ui.web.x0;
import org.telegram.ui.xd;
public final class v implements z10 {
    public final int f19640a;
    public final Object f19641b;
    public final Object f19642c;

    public v(int i7, Object obj, Object obj2) {
        this.f19640a = i7;
        this.f19641b = obj;
        this.f19642c = obj2;
    }

    @Override
    public final void a(Object obj) {
        oi.q a10;
        int i7;
        int i10;
        float f10;
        int i11;
        String p10;
        boolean z10;
        an anVar;
        qj qjVar;
        t1 t1Var;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z11;
        String str;
        String str2;
        File file;
        String str3;
        String str4;
        FrameLayout frameLayout;
        String str5;
        Uri uri;
        int i18;
        gj threadMessage;
        int i19 = this.f19640a;
        org.telegram.ui.z zVar = null;
        fw fwVar = null;
        String str6 = null;
        fi.b bVar = null;
        org.telegram.ui.z zVar2 = null;
        int i20 = 0;
        boolean z12 = true;
        Object obj2 = this.f19642c;
        Object obj3 = this.f19641b;
        switch (i19) {
            case 0:
                d0 d0Var = (d0) obj3;
                d0Var.K0((TLRPC.Chat) obj2, d0Var.f19542p1, ((Boolean) obj).booleanValue());
                return;
            case 1:
                TL_iv.pageBlockMath pageblockmath = (TL_iv.pageBlockMath) obj2;
                String str7 = (String) obj;
                q3 q3Var = ((oi.o) obj3).f21848r;
                if (pageblockmath != null) {
                    pageblockmath.source = str7;
                    q3Var.f39895g3.O(false);
                    return;
                }
                TL_iv.pageBlockMath pageblockmath2 = new TL_iv.pageBlockMath();
                pageblockmath2.source = str7;
                q3Var.V1(pageblockmath2);
                return;
            case 2:
                e1 e1Var = (e1) obj3;
                oi.q qVar = (oi.q) obj2;
                String str8 = (String) obj;
                e1Var.getClass();
                if (!TextUtils.isEmpty(str8)) {
                    Editable text = e1Var.getText();
                    int spanStart = text.getSpanStart(qVar);
                    int spanEnd = text.getSpanEnd(qVar);
                    if (spanStart >= 0 && spanEnd >= 0 && (a10 = oi.q.a(str8, e1Var.getCurrentTextColor(), org.telegram.messenger.g0.L(gz.W0 + 4))) != null) {
                        boolean z13 = e1Var.f21661m2;
                        if (z13) {
                            e1Var.setLocked(false);
                        }
                        SpannableString spannableString = new SpannableString(" ");
                        spannableString.setSpan(a10, 0, 1, 33);
                        int max = Math.max(0, Math.min(spanStart, e1Var.length()));
                        text.replace(max, Math.max(max, Math.min(spanEnd, e1Var.length())), spannableString);
                        e1Var.setSelection(Math.min(max + 1, e1Var.length()));
                        if (z13) {
                            e1Var.setLocked(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 3:
                z1 z1Var = (z1) obj3;
                TL_iv.pageBlockMath pageblockmath3 = (TL_iv.pageBlockMath) obj2;
                String str9 = (String) obj;
                z1Var.getClass();
                if (pageblockmath3 != null) {
                    pageblockmath3.source = str9;
                    z1Var.Q.f39895g3.O(false);
                    return;
                }
                TL_iv.pageBlockMath pageblockmath4 = new TL_iv.pageBlockMath();
                pageblockmath4.source = str9;
                z1Var.Q.V1(pageblockmath4);
                return;
            case 4:
                q3 q3Var2 = (q3) obj3;
                TL_iv.pageBlockMath pageblockmath5 = (TL_iv.pageBlockMath) obj2;
                String str10 = (String) obj;
                q3Var2.getClass();
                if (!TextUtils.equals(str10, pageblockmath5.source)) {
                    d2 d2Var = q3Var2.R3;
                    if (d2Var != null) {
                        d2Var.d();
                    }
                    pageblockmath5.source = str10;
                    q3Var2.f39895g3.O(false);
                    d2 d2Var2 = q3Var2.R3;
                    if (d2Var2 != null) {
                        d2Var2.h();
                    }
                    q3Var2.f21931p3.onContentChanged();
                    return;
                }
                return;
            case 5:
                VoIPDebugToSend.b((VoIPDebugToSend) obj3, (TL_phone.saveCallDebug) obj2, (TLRPC.InputFile) obj);
                return;
            case 6:
                c3 c3Var = (c3) obj3;
                b3 b3Var = (b3) obj2;
                e2 e2Var = (e2) obj;
                if (e2Var != null) {
                    if ((e2Var instanceof an) && (qjVar = (anVar = (an) e2Var).f45118a0) != null) {
                        qjVar.S();
                        anVar.f45118a0.z0(true, false, true);
                    }
                    if (e2Var.getContext() != null && e2Var.getParentActivity() != null) {
                        x2 x2Var = new x2(e2Var.getContext(), e2Var.getResourceProvider());
                        x2Var.m0 = e2Var.getParentActivity();
                        if (b3Var != null && b3Var.f28424a != null) {
                            x2Var.G0 = true;
                            boolean z14 = b3Var.f28436o;
                            x2Var.X = z14;
                            if (z14) {
                                x2Var.A(b3Var.f28439r, false);
                            }
                            if (!b3Var.f28435n) {
                                int i21 = b3Var.f28437p;
                                if (i21 < 0) {
                                    i21 = j6.f28849d6;
                                }
                                i7 = j6.w0(i21, x2Var.G);
                            } else {
                                i7 = b3Var.f28438q;
                            }
                            x2Var.y(i7, b3Var.f28435n, false);
                            x2Var.D(b3Var.f28440s, false);
                            x2Var.H0 = b3Var.f28431j;
                            x2Var.I0 = b3Var.f28432k;
                            boolean z15 = b3Var.f28442u;
                            x2Var.f18686y0 = z15;
                            p2 p2Var = x2Var.E;
                            p2Var.setIsBackButtonVisible(z15);
                            x2Var.f18683x.setAllowSwipes(b3Var.f28433l);
                            ImageView backButton = x2Var.Y.getBackButton();
                            if (x2Var.f18686y0) {
                                i10 = 2131231240;
                            } else {
                                i10 = 2131231269;
                            }
                            org.telegram.messenger.g0.Q3(backButton, i10);
                            h2 h2Var = x2Var.f18671o0;
                            if (h2Var != null) {
                                boolean z16 = x2Var.f18686y0;
                                h2Var.L = z16;
                                h2Var.M.d(z16);
                                h2Var.invalidate();
                            }
                            x2Var.f18678t0 = b3Var.f28445y;
                            x2Var.B0 = Boolean.valueOf(b3Var.B);
                            x2Var.C0 = b3Var.C;
                            w0 w0Var = b3Var.K;
                            x2Var.D0 = w0Var;
                            if (w0Var != null) {
                                u0 u0Var = w0Var.f18629r;
                                SensorManager sensorManager = w0Var.f18614a;
                                f10 = 0.721f;
                                if (w0Var.f18623l) {
                                    w0Var.f18623l = false;
                                    if (sensorManager != null) {
                                        Sensor sensor = w0Var.f18615b;
                                        if (sensor != null) {
                                            sensorManager.registerListener(w0Var.f18625n, sensor, w0.a(w0Var.f18616c));
                                        }
                                        Sensor sensor2 = w0Var.d;
                                        if (sensor2 != null) {
                                            sensorManager.registerListener(w0Var.f18627p, sensor2, w0.a(w0Var.f18617e));
                                        }
                                        Sensor sensor3 = w0Var.f18619g;
                                        if (sensor3 != null) {
                                            sensorManager.registerListener(u0Var, sensor3, w0.a(w0Var.h));
                                        }
                                        Sensor sensor4 = w0Var.f18618f;
                                        if (sensor4 != null) {
                                            sensorManager.registerListener(u0Var, sensor4, w0.a(w0Var.h));
                                        }
                                        Sensor sensor5 = w0Var.f18620i;
                                        if (sensor5 != null) {
                                            sensorManager.registerListener(w0Var.f18631t, sensor5, w0.a(w0Var.f18621j));
                                        }
                                    }
                                }
                            } else {
                                f10 = 0.721f;
                            }
                            xa xaVar = b3Var.f28443w;
                            if (xaVar != null) {
                                t2 t2Var = x2Var.f18670n0;
                                int totalHeight = t2Var.getTotalHeight();
                                t2Var.f18593e = xaVar;
                                ki.t[] tVarArr = t2Var.f18594f;
                                ki.v.b(tVarArr[0].f18560l, (ki.u) xaVar.f714c, false);
                                ki.v.b(tVarArr[1].f18560l, (ki.u) xaVar.d, false);
                                t2Var.invalidate();
                                if (totalHeight != t2Var.getTotalHeight() && t2Var.f18596r != null) {
                                    if (totalHeight < t2Var.getTotalHeight()) {
                                        org.telegram.messenger.g0.i3(t2Var.f18596r, 200L);
                                    } else {
                                        t2Var.f18596r.run();
                                    }
                                }
                                int i22 = xaVar.f713b;
                                Paint paint = t2Var.f18590a;
                                t2Var.f18593e.f713b = i22;
                                paint.setColor(i22);
                                t2Var.d.a(i22, true);
                            }
                            x2Var.C(b3Var.f28446z, false, b3Var.A);
                            k4 k4Var = b3Var.f28424a;
                            if (k4Var != null) {
                                i11 = k4Var.f18404a;
                            } else {
                                i11 = m10.f24934t0;
                            }
                            x2Var.I = i11;
                            s0 s0Var = b3Var.f28425b;
                            if (s0Var != null) {
                                s0Var.onResume();
                                p2Var.O(x2Var.I, b3Var.f28425b, b3Var.d, b3Var.f28428f, b3Var.f28427e);
                                if (!b3Var.f28441t && !b3Var.f28425b.f52767b) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                String str11 = b3Var.f28444x;
                                p2Var.g("setState(" + z10 + ", " + str11 + ")");
                                p2Var.O = z10;
                                p2Var.f52813b = str11;
                                if (j6.I.q() != b3Var.D) {
                                    p2Var.z();
                                }
                            } else {
                                k4Var.f18418q = null;
                                k4Var.f18419r = 0L;
                            }
                            x2Var.x(e2Var, b3Var.f28424a);
                            x2Var.f18658d0 = b3Var.v;
                            if (b3Var.G) {
                                x2Var.X0 = true;
                                x2Var.m();
                                org.telegram.ui.b3 b3Var2 = x2Var.Z0;
                                if (x2Var.q()) {
                                    p10 = x2Var.f18684x0.f18407e;
                                } else {
                                    p10 = q10.p(np.s1(x2Var.I).a2(Long.valueOf(x2Var.J)));
                                }
                                String str12 = b3Var.H;
                                x2Var.Y0 = str12;
                                b3Var2.a(p10, str12);
                                org.telegram.ui.b3 b3Var3 = x2Var.Z0;
                                Paint paint2 = x2Var.R;
                                if (org.telegram.messenger.g0.B(paint2.getColor()) > f10) {
                                    z12 = false;
                                }
                                b3Var3.b(z12, false);
                                x2Var.Z0.setBackgroundColor(paint2.getColor());
                                x2Var.Z0.setVisibility(0);
                                x2Var.Z0.setAlpha(1.0f);
                            }
                            x2Var.t(b3Var.L);
                            c3Var.h(c3Var.f28489x, b3Var, false);
                            x2Var.show();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 7:
                g3 g3Var = (g3) obj2;
                ((b3) obj3).f28434m = (Bitmap) obj;
                g3Var.mo25d().setDrawingFromOverlay(false);
                g3Var.release();
                return;
            case 8:
                i3 i3Var = (i3) obj2;
                j3 j3Var = (j3) ((e6) obj3).f14244q;
                if (((Boolean) obj).booleanValue()) {
                    i3Var.a(1.0f);
                    if (j3Var.f28725a.getTabs().isEmpty()) {
                        j3Var.a(false);
                        return;
                    }
                    return;
                }
                i3Var.a(0.0f);
                return;
            case 9:
                g4 g4Var = (g4) obj3;
                Activity activity = (Activity) obj2;
                Integer num = (Integer) obj;
                t3 t3Var = g4Var.L;
                org.telegram.ui.k0[] k0VarArr = g4Var.U0;
                if ((!g4Var.f47336v0[0].c() || g4Var.f47336v0[0].f48550c.F != null) && g4Var.M != null) {
                    if (num.intValue() == 1) {
                        org.telegram.ui.l0 l0Var = g4Var.f47324i0;
                        int L = org.telegram.messenger.g0.L(56.0f);
                        g4Var.K0 = L;
                        l0Var.setHeight(L);
                        g4Var.f47324i0.h(true);
                        return;
                    } else if (num.intValue() == 2) {
                        if (g4Var.f47336v0[0].f()) {
                            if (g4Var.f47336v0[0].getWebView() != null) {
                                str5 = g4Var.f47336v0[0].getWebView().getUrl();
                            } else {
                                return;
                            }
                        } else {
                            TLRPC.WebPage webPage = g4Var.f47336v0[0].f48550c.F;
                            if (webPage != null) {
                                str5 = webPage.url;
                            } else {
                                return;
                            }
                        }
                        String u10 = v0.u(str5);
                        Activity activity2 = g4Var.M;
                        if (org.telegram.messenger.g0.B(g4Var.f47324i0.getBackgroundColor()) < 0.721f) {
                            bVar = new fi.b();
                        }
                        g4Var.Y(new po0(activity2, null, u10, false, u10, false, bVar));
                        return;
                    } else if (num.intValue() == 6) {
                        if (g4Var.f47336v0[0].f()) {
                            if (g4Var.f47336v0[0].getWebView() != null) {
                                str4 = g4Var.f47336v0[0].getWebView().getUrl();
                                frameLayout = g4Var.f47336v0[0].f48552f;
                            } else {
                                return;
                            }
                        } else {
                            k3 k3Var = g4Var.f47336v0[0];
                            TLRPC.WebPage webPage2 = k3Var.f48550c.F;
                            if (webPage2 != null) {
                                str4 = webPage2.url;
                                frameLayout = k3Var;
                            } else {
                                return;
                            }
                        }
                        g4.d(str4, g4Var.Y, frameLayout, t3Var, null);
                        return;
                    } else if (num.intValue() == 7) {
                        ?? obj4 = new Object();
                        obj4.f28476a = true;
                        e2 T = LaunchActivity.T();
                        if (T != 0) {
                            if (t3Var != null) {
                                zVar2 = new org.telegram.ui.z(g4Var, 6);
                            }
                            T.showAsSheet(new org.telegram.ui.web.m(zVar2, new org.telegram.ui.q(g4Var, 2)), obj4);
                            return;
                        }
                        return;
                    } else if (num.intValue() == 8) {
                        ?? obj5 = new Object();
                        obj5.f28476a = true;
                        e2 T2 = LaunchActivity.T();
                        if (T2 != 0) {
                            if (t3Var != null) {
                                zVar = new org.telegram.ui.z(g4Var, 7);
                            }
                            T2.showAsSheet(new x0(zVar, new org.telegram.ui.q(g4Var, 3)), obj5);
                            return;
                        }
                        return;
                    } else if (num.intValue() == 9) {
                        if (g4Var.f47336v0[0].getWebView() != null) {
                            g4Var.f47336v0[0].getWebView().goForward();
                            return;
                        }
                        return;
                    } else if (num.intValue() == 3) {
                        if (g4Var.f47336v0[0].f()) {
                            if (g4Var.f47336v0[0].getWebView() != null) {
                                str = g4Var.f47336v0[0].getWebView().getUrl();
                                str2 = g4Var.f47336v0[0].getWebView().getOpenURL();
                                file = null;
                            } else {
                                return;
                            }
                        } else {
                            TLRPC.WebPage webPage3 = g4Var.f47336v0[0].f48550c.F;
                            if (webPage3 != null) {
                                String str13 = webPage3.url;
                                TL_iv.Page page = webPage3.cached_page;
                                if (page != null) {
                                    file = page.local;
                                    str = str13;
                                    str2 = null;
                                } else {
                                    str = str13;
                                    str2 = null;
                                    file = null;
                                }
                            } else {
                                return;
                            }
                        }
                        Activity activity3 = g4Var.M;
                        if (activity3 != null && !activity3.isFinishing()) {
                            if (file != null) {
                                String D = w7.D(file);
                                Pattern pattern = q80.f38576a;
                                if (!"diff".equalsIgnoreCase(D) && !"patch".equalsIgnoreCase(D)) {
                                    str3 = "text/markdown";
                                } else {
                                    str3 = "text/x-diff";
                                }
                                org.telegram.messenger.g0.t2(file, null, str3, g4Var.M, null, true);
                                return;
                            } else if (str != null) {
                                String K0 = org.telegram.messenger.g0.K0(str2, true);
                                String K02 = org.telegram.messenger.g0.K0(str, true);
                                org.telegram.ui.w wVar = new org.telegram.ui.w(g4Var, str, 1);
                                org.telegram.ui.x xVar = new org.telegram.ui.x(g4Var, K02, K0, 1);
                                if (g4Var.f47336v0[0].f() && np.s1(g4Var.Y).N2(K02) && !np.s1(g4Var.Y).L2(true)) {
                                    t4.l0(activity, null, str, true, new e4(9, xVar, wVar));
                                    return;
                                } else {
                                    wVar.run();
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        return;
                    } else if (num.intValue() == 4) {
                        if (g4Var.f47336v0[0].f()) {
                            e2 T3 = LaunchActivity.T();
                            if (T3 != 0) {
                                ?? obj6 = new Object();
                                obj6.f28476a = true;
                                T3.showAsSheet(new n1(new org.telegram.ui.q(g4Var, 3)), obj6);
                                return;
                            }
                            return;
                        }
                        u2 i23 = i20.i(g4Var.M, false, 1, null);
                        i23.f29718v0 = false;
                        LinearLayout linearLayout = new LinearLayout(g4Var.M);
                        linearLayout.setPadding(0, 0, 0, org.telegram.messenger.g0.L(4.0f));
                        linearLayout.setOrientation(1);
                        n4 n4Var = new n4(g4Var.M, (org.telegram.ui.ActionBar.e6) null);
                        n4Var.setText(hd.M0(2131750609, null));
                        linearLayout.addView(n4Var, ja.t(-2, -2, 51, 3, 1, 3, 0));
                        linearLayout.addView(new c4(g4Var, g4Var.M), ja.t(-1, -2, 51, 3, 0, 3, 0));
                        n4 n4Var2 = new n4(g4Var.M, (org.telegram.ui.ActionBar.e6) null);
                        n4Var2.setText(hd.M0(2131750604, null));
                        linearLayout.addView(n4Var2, ja.t(-2, -2, 51, 3, 4, 3, 2));
                        int i24 = 0;
                        for (int i25 = 2; i24 < i25; i25 = 2) {
                            Activity activity4 = g4Var.M;
                            org.telegram.ui.k0 k0Var = new org.telegram.ui.k0(activity4, 1);
                            int i26 = j6.f28941i6;
                            org.telegram.ui.Cells.y h02 = j6.h0(j6.x0(null, i26, false), i25, -1);
                            m6 M = q6.M(i26);
                            k0Var.setBackground(h02);
                            q6.j(k0Var, h02, null, M, null);
                            RadioButton radioButton = new RadioButton(activity4);
                            k0Var.f48534b = radioButton;
                            radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
                            q6.O(radioButton, j6.D5, j6.E5, null);
                            boolean z17 = hd.f24101a0;
                            if (z17) {
                                i12 = 5;
                            } else {
                                i12 = 3;
                            }
                            int i27 = i12 | 48;
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
                            k0Var.addView(radioButton, ja.d(22, 22.0f, i27, f11, 13.0f, i14, 0.0f));
                            TextView textView = new TextView(activity4);
                            q6.U(textView, j6.G6, null);
                            i20.p(textView, 1, 16.0f, 1, 1);
                            textView.setSingleLine(true);
                            if (hd.f24101a0) {
                                i15 = 5;
                            } else {
                                i15 = 3;
                            }
                            textView.setGravity(i15 | 16);
                            boolean z18 = hd.f24101a0;
                            if (z18) {
                                i16 = 5;
                            } else {
                                i16 = 3;
                            }
                            int i28 = i16 | 48;
                            int i29 = 17;
                            if (z18) {
                                i17 = 17;
                            } else {
                                i17 = 62;
                            }
                            float f12 = i17;
                            if (z18) {
                                i29 = 62;
                            }
                            k0Var.addView(textView, ja.d(-1, -1.0f, i28, f12, 0.0f, i29, 0.0f));
                            k0VarArr[i24] = k0Var;
                            if (i24 != 0) {
                                if (i24 == 1) {
                                    Typeface typeface = Typeface.SERIF;
                                    textView.setText("Serif");
                                    textView.setTypeface(typeface);
                                    k0Var.setContentDescription("Serif");
                                    k0Var.invalidate();
                                }
                            } else {
                                String M0 = hd.M0(2131751600, null);
                                Typeface typeface2 = Typeface.DEFAULT;
                                textView.setText(M0);
                                textView.setTypeface(typeface2);
                                k0Var.setContentDescription(M0);
                                k0Var.invalidate();
                            }
                            org.telegram.ui.k0 k0Var2 = k0VarArr[i24];
                            if (i24 == g4Var.f49448a) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            ((RadioButton) k0Var2.f48534b).a(z11, false);
                            k0VarArr[i24].setTag(Integer.valueOf(i24));
                            k0VarArr[i24].setOnClickListener(new org.telegram.ui.r(g4Var, 4));
                            linearLayout.addView(k0VarArr[i24], ja.o(-1, 50));
                            i24++;
                        }
                        i23.O = linearLayout;
                        g4Var.J = i23;
                        g4Var.Y(i23);
                        return;
                    } else if (num.intValue() == 5) {
                        if (g4Var.f47336v0[0].f() && g4Var.f47336v0[0].getWebView() != null) {
                            g4Var.f47336v0[0].getWebView().reload();
                            return;
                        }
                        return;
                    } else if (num.intValue() == 10 && (t1Var = g4Var.f47336v0[0].F) != null && t1Var.b() != null) {
                        g4Var.f(t1Var.b(), null, 1);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 10:
                k3 k3Var2 = (k3) obj3;
                Activity activity5 = (Activity) obj2;
                String str14 = (String) obj;
                if (!TextUtils.isEmpty(str14) && k3Var2.getWebView() != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str14.trim());
                    org.telegram.messenger.g0.c(spannableStringBuilder, 1, false, true);
                    URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                    int length = spannableStringBuilder.length();
                    int i30 = 0;
                    while (i20 < uRLSpanArr.length) {
                        length = Math.min(spannableStringBuilder.getSpanStart(uRLSpanArr[i20]), length);
                        i30 = Math.max(spannableStringBuilder.getSpanEnd(uRLSpanArr[i20]), i30);
                        i20++;
                    }
                    Pattern pattern2 = Utilities.f22413a;
                    try {
                        uri = Uri.parse(str14);
                    } catch (Exception unused) {
                        uri = null;
                    }
                    if (uri == null || !TextUtils.equals(uri.getScheme(), "javascript")) {
                        if ((uRLSpanArr.length > 0 && length == 0 && i30 > 0) || (uri != null && uri.getScheme() != null)) {
                            if (uri != null && uri.getScheme() == null && uri.getHost() == null && uri.getPath() != null) {
                                str14 = vf.c.w(uri, "https", null, uri.getEncodedPath(), "/");
                            }
                            k3Var2.getWebView().loadUrl(str14);
                            return;
                        }
                        org.telegram.ui.web.k.b(activity5, str14);
                        s0 webView = k3Var2.getWebView();
                        String str15 = d1.a().f52587b;
                        if (str15 != null) {
                            StringBuilder m10 = com.google.android.gms.internal.vision.e2.m(str15);
                            m10.append(URLEncoder.encode(str14));
                            str6 = m10.toString();
                        }
                        webView.loadUrl(str6);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                qc qcVar = (qc) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                qcVar.f50556c = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    int i31 = tL_premium_boostsStatus.level;
                    qcVar.f50554b = i31;
                    if (chat != null) {
                        chat.flags |= 1024;
                        chat.level = i31;
                    }
                }
                qcVar.e1(true);
                hi.d dVar = qcVar.Q;
                if (dVar != null) {
                    dVar.setLoading(false);
                    return;
                }
                return;
            case 12:
                hc hcVar = (hc) obj3;
                dp dpVar = (dp) obj2;
                View view = (View) obj;
                if (view instanceof gc) {
                    gc gcVar = (gc) view;
                    gcVar.setBackgroundColor(j6.w0(j6.f28849d6, hcVar.f47666a));
                    hcVar.f47667b.getClass();
                    int R = RecyclerView.R(view);
                    if (dpVar != null) {
                        ArrayList arrayList = dpVar.f23118c;
                        if (R >= 0 && R < arrayList.size()) {
                            gcVar.a((cp) arrayList.get(R));
                        }
                    }
                    view.invalidate();
                    return;
                }
                return;
            case 13:
                ug.j0 j0Var = (ug.j0) obj2;
                j0Var.A1((e3) obj);
                ((xd) obj3).f53190n0.showDialog(j0Var);
                return;
            case 14:
                an anVar2 = (an) obj3;
                Long l10 = (Long) obj;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = new TLRPC.TL_messages_sendQuickReplyMessages();
                tL_messages_sendQuickReplyMessages.peer = anVar2.getMessagesController().j1(anVar2.f45259k6);
                tL_messages_sendQuickReplyMessages.shortcut_id = ((u1) obj2).f18113a;
                anVar2.getConnectionsManager().sendRequest(tL_messages_sendQuickReplyMessages, null);
                qj qjVar2 = anVar2.f45118a0;
                if (qjVar2 != null) {
                    qjVar2.setFieldText(null);
                    return;
                }
                return;
            case 15:
                an anVar3 = (an) obj3;
                cz b10 = cz.b((String) obj2, anVar3.f45259k6, anVar3.E5, anVar3.f45281m4, null, false, null, null, null, true, 0, 0, null, false);
                b10.K = anVar3.Y8();
                b10.Q = ((Long) obj).longValue();
                b10.R = anVar3.j9();
                b10.T = anVar3.f45422x5;
                anVar3.getSendMessagesHelper().r0(b10);
                anVar3.f45118a0.setFieldText("");
                anVar3.D9(false);
                return;
            case 16:
                an anVar4 = (an) obj3;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj2;
                Long l11 = (Long) obj;
                if (anVar4.f45204g4 == 1) {
                    t4.J(anVar4.getParentActivity(), anVar4.f45259k6, new a7(anVar4, botInlineResult, l11, 2), anVar4.Aa);
                    return;
                } else {
                    anVar4.Hb(botInlineResult, true, 0, l11.longValue());
                    return;
                }
            case 17:
                Boolean bool = (Boolean) obj;
                ((an) obj3).Ib = true;
                ((u5) obj2).run();
                return;
            case 18:
                an.h0((an) obj3, (qy0[]) obj2, (m60) obj);
                return;
            case 19:
                an anVar5 = (an) obj3;
                org.telegram.ui.ActionBar.t1[] t1VarArr = (org.telegram.ui.ActionBar.t1[]) obj2;
                TL_stats.TL_statsPollStats tL_statsPollStats = (TL_stats.TL_statsPollStats) obj;
                try {
                    t1VarArr[0].dismiss();
                } catch (Throwable unused2) {
                }
                t1VarArr[0] = null;
                if (tL_statsPollStats != null) {
                    if (tL_statsPollStats.votes_graph instanceof TL_stats.TL_statsGraphError) {
                        k5.n(null, 2131747157, cc.a0(anVar5), 2131624293, 24);
                        return;
                    } else {
                        new vh.i(anVar5.getParentActivity(), anVar5.Aa, tL_statsPollStats).show();
                        return;
                    }
                }
                return;
            case 20:
                an anVar6 = (an) obj3;
                gj gjVar = (gj) obj2;
                anVar6.getClass();
                TLRPC.SuggestedPost c10 = ((lj) obj).c();
                if (gjVar != null && gjVar.f23817k != null) {
                    anVar6.getMessagesController().h(gjVar, c10);
                    return;
                }
                return;
            case 21:
                u1 u1Var = (u1) obj2;
                String str16 = (String) obj;
                an anVar7 = ((si) obj3).f51228b;
                if (u1Var != null) {
                    i18 = ((e2) anVar7).currentAccount;
                    v1.f(i18).k(u1Var.f18113a, str16);
                }
                anVar7.f45192f4 = str16;
                anVar7.f45314p1.setTitle(str16);
                return;
            case 22:
                gj gjVar2 = (gj) obj2;
                Long l12 = (Long) obj;
                an anVar8 = ((lm) obj3).f49005a;
                if (anVar8.u7()) {
                    cz b11 = cz.b(gjVar2.C0(), anVar8.f45259k6, anVar8.E5, anVar8.f45281m4, null, false, null, null, null, true, 0, 0, null, false);
                    b11.K = anVar8.Y8();
                    b11.W = l12.longValue();
                    anVar8.getSendMessagesHelper().r0(b11);
                    return;
                }
                return;
            case 23:
                q1 q1Var = (q1) obj2;
                an anVar9 = ((lm) obj3).f49005a;
                if (((Boolean) obj).booleanValue()) {
                    while (i20 < anVar9.A0.getChildCount()) {
                        View childAt = anVar9.A0.getChildAt(i20);
                        if (childAt instanceof q1) {
                            q1 q1Var2 = (q1) childAt;
                            if (q1Var2.getMessageObject() != null && q1Var2.getMessageObject().p4()) {
                                q1Var2.I3();
                            }
                        }
                        i20++;
                    }
                    return;
                }
                if (q1Var.getMessageObject() != null) {
                    q1Var.getMessageObject().f23855t2 = Boolean.FALSE;
                }
                q1Var.I3();
                return;
            case 24:
                lm lmVar = (lm) obj3;
                v vVar = (v) obj2;
                an anVar10 = lmVar.f49005a;
                if (!((Boolean) obj).booleanValue()) {
                    cc.a0(anVar10).I(2131624012, hd.M0(2131754311, null), hd.M0(2131754312, null)).j();
                    return;
                }
                anVar10.getMessagesController().G4(true);
                cc.a0(anVar10).P(2131623982, org.telegram.messenger.g0.H2(org.telegram.messenger.g0.x2(hd.M0(2131745574, null), new tl(lmVar, 8)), true)).k(true);
                vVar.a(Boolean.TRUE);
                return;
            case 25:
                TLRPC.Message message = (TLRPC.Message) obj2;
                ((lm) obj3).f49005a.getMessagesController().v(message.f28072id, -1, m5.o(message.peer_id), (String) obj, true);
                return;
            case 26:
                dn dnVar = (dn) obj3;
                dnVar.f46439f.s(((TLRPC.WallPaper) obj2).settings.intensity, ((gg.a) obj).f13295a);
                View view2 = dnVar.f46436b;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 27:
                Long l13 = (Long) obj;
                ChatActivityEnterView chatActivityEnterView = ((we) obj3).f41330a;
                long j3 = chatActivityEnterView.f32327y3;
                gj gjVar3 = chatActivityEnterView.B3;
                threadMessage = chatActivityEnterView.getThreadMessage();
                cz b12 = cz.b((String) obj2, j3, gjVar3, threadMessage, null, false, null, null, null, true, 0, 0, null, false);
                an anVar11 = chatActivityEnterView.f32319x3;
                if (anVar11 != null) {
                    fwVar = anVar11.Y8();
                }
                b12.K = fwVar;
                b12.O = chatActivityEnterView.f32251n6;
                b12.Q = l13.longValue();
                b12.R = chatActivityEnterView.getSendMonoForumPeerId();
                b12.T = chatActivityEnterView.getSendMessageSuggestionParams();
                ez.C(chatActivityEnterView.R).r0(b12);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.f32246n0.c();
                he heVar = chatActivityEnterView.K0;
                chatActivityEnterView.f32251n6 = 0L;
                heVar.setEffect(0L);
                return;
            case 28:
                ki kiVar = (ki) obj3;
                di diVar = (di) obj2;
                Boolean bool2 = (Boolean) obj;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i32 = kiVar.H3;
                tL_messages_toggleBotInAttachMenu.bot = np.s1(i32).o1(diVar.f33954c.bot_id);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i32).sendRequest(tL_messages_toggleBotInAttachMenu, new v7(14, kiVar, diVar), 66);
                return;
            default:
                ki kiVar2 = (ki) obj3;
                ((an) obj2).f45422x5 = (lj) obj;
                boolean u12 = kiVar2.u1(true, 0, 0, kiVar2.L2, kiVar2.f1());
                ue ueVar = kiVar2.f36442c2;
                if (ueVar != null) {
                    ueVar.h(!u12);
                    kiVar2.f36442c2 = null;
                    return;
                }
                return;
        }
    }
}
