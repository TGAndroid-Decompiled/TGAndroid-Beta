package ag;

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
import bi.d4;
import java.io.File;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a30;
import org.telegram.messenger.b8;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.i20;
import org.telegram.messenger.is;
import org.telegram.messenger.kj;
import org.telegram.messenger.lp;
import org.telegram.messenger.m5;
import org.telegram.messenger.mp;
import org.telegram.messenger.o5;
import org.telegram.messenger.pj;
import org.telegram.messenger.pz;
import org.telegram.messenger.r20;
import org.telegram.messenger.rz;
import org.telegram.messenger.tw;
import org.telegram.messenger.uz;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p3;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.q3;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.w6;
import org.telegram.ui.Cells.p4;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.be;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.pp0;
import org.telegram.ui.Components.re;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.z60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fn;
import org.telegram.ui.g01;
import org.telegram.ui.h4;
import org.telegram.ui.le;
import org.telegram.ui.mk;
import org.telegram.ui.nj;
import org.telegram.ui.pc;
import org.telegram.ui.pm;
import org.telegram.ui.qc;
import org.telegram.ui.u3;
import org.telegram.ui.un;
import org.telegram.ui.xn;
import org.telegram.ui.zc;
import w7.b6;
import xh.t3;
public final class e0 implements r20 {
    public final int f490a;
    public final Object f491b;
    public final Object f492c;

    public e0(int i10, Object obj, Object obj2) {
        this.f490a = i10;
        this.f491b = obj;
        this.f492c = obj2;
    }

    @Override
    public final void a(Object obj) {
        bi.v a2;
        int i10;
        int i11;
        float f7;
        int i12;
        String p5;
        boolean z10;
        un unVar;
        mk mkVar;
        org.telegram.ui.web.w1 w1Var;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z11;
        String str;
        String str2;
        File file;
        String str3;
        String str4;
        FrameLayout frameLayout;
        String str5;
        Uri uri;
        int i19;
        kj threadMessage;
        int i20 = this.f490a;
        org.telegram.ui.y yVar = null;
        tw twVar = null;
        String str6 = null;
        th.b bVar = null;
        org.telegram.ui.y yVar2 = null;
        boolean z12 = true;
        int i21 = 0;
        Object obj2 = this.f492c;
        Object obj3 = this.f491b;
        switch (i20) {
            case 0:
                View view = (View) obj3;
                f0 f0Var = (f0) obj2;
                Runnable runnable = (Runnable) obj;
                if (view != null) {
                    view.requestFocus();
                }
                org.telegram.messenger.i0.v1(f0Var);
                org.telegram.messenger.i0.h3(runnable, 80L);
                return;
            case 1:
                h3 h3Var = (h3) obj2;
                Long l4 = (Long) obj;
                i3 f10 = i3.f(e20.f15506s0);
                bi biVar = ((h1) obj3).f30964b;
                long a12 = biVar.a1();
                int i22 = f10.f566a;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = new TLRPC.TL_messages_sendQuickReplyMessages();
                tL_messages_sendQuickReplyMessages.peer = wp.r1(i22).i1(a12);
                tL_messages_sendQuickReplyMessages.shortcut_id = h3Var.f551a;
                is a02 = is.a0(i22);
                a02.f16331a.c(new q0(f10, a02, h3Var, tL_messages_sendQuickReplyMessages, 1));
                biVar.dismiss();
                return;
            case 2:
                h2.b0((h2) obj2, (View) obj3, (String) obj);
                return;
            case 3:
                TL_iv.pageBlockMath pageblockmath = (TL_iv.pageBlockMath) obj2;
                String str7 = (String) obj;
                d4 d4Var = ((bi.t) obj3).f3350r;
                if (pageblockmath != null) {
                    pageblockmath.source = str7;
                    d4Var.f31183f3.O(false);
                    return;
                }
                TL_iv.pageBlockMath pageblockmath2 = new TL_iv.pageBlockMath();
                pageblockmath2.source = str7;
                d4Var.U1(pageblockmath2);
                return;
            case 4:
                bi.n1 n1Var = (bi.n1) obj3;
                bi.v vVar = (bi.v) obj2;
                String str8 = (String) obj;
                n1Var.getClass();
                if (!TextUtils.isEmpty(str8)) {
                    Editable text = n1Var.getText();
                    int spanStart = text.getSpanStart(vVar);
                    int spanEnd = text.getSpanEnd(vVar);
                    if (spanStart >= 0 && spanEnd >= 0 && (a2 = bi.v.a(str8, n1Var.getCurrentTextColor(), org.telegram.messenger.i0.L(uz.W0 + 4))) != null) {
                        boolean z13 = n1Var.f3222g2;
                        if (z13) {
                            n1Var.setLocked(false);
                        }
                        SpannableString spannableString = new SpannableString(" ");
                        spannableString.setSpan(a2, 0, 1, 33);
                        int max = Math.max(0, Math.min(spanStart, n1Var.length()));
                        text.replace(max, Math.max(max, Math.min(spanEnd, n1Var.length())), spannableString);
                        n1Var.setSelection(Math.min(max + 1, n1Var.length()));
                        if (z13) {
                            n1Var.setLocked(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                bi.k2 k2Var = (bi.k2) obj3;
                TL_iv.pageBlockMath pageblockmath3 = (TL_iv.pageBlockMath) obj2;
                String str9 = (String) obj;
                k2Var.getClass();
                if (pageblockmath3 != null) {
                    pageblockmath3.source = str9;
                    k2Var.P.f31183f3.O(false);
                    return;
                }
                TL_iv.pageBlockMath pageblockmath4 = new TL_iv.pageBlockMath();
                pageblockmath4.source = str9;
                k2Var.P.U1(pageblockmath4);
                return;
            case 6:
                d4 d4Var2 = (d4) obj3;
                TL_iv.pageBlockMath pageblockmath5 = (TL_iv.pageBlockMath) obj2;
                String str10 = (String) obj;
                d4Var2.getClass();
                if (!TextUtils.equals(str10, pageblockmath5.source)) {
                    bi.o2 o2Var = d4Var2.Q3;
                    if (o2Var != null) {
                        o2Var.d();
                    }
                    pageblockmath5.source = str10;
                    d4Var2.f31183f3.O(false);
                    bi.o2 o2Var2 = d4Var2.Q3;
                    if (o2Var2 != null) {
                        o2Var2.h();
                    }
                    d4Var2.f2938o3.onContentChanged();
                    return;
                }
                return;
            case 7:
                VoIPDebugToSend.b((VoIPDebugToSend) obj3, (TL_phone.saveCallDebug) obj2, (TLRPC.InputFile) obj);
                return;
            case 8:
                org.telegram.ui.ActionBar.i3 i3Var = (org.telegram.ui.ActionBar.i3) obj3;
                org.telegram.ui.ActionBar.h3 h3Var2 = (org.telegram.ui.ActionBar.h3) obj2;
                org.telegram.ui.ActionBar.k2 k2Var2 = (org.telegram.ui.ActionBar.k2) obj;
                if (k2Var2 != null) {
                    if ((k2Var2 instanceof un) && (mkVar = (unVar = (un) k2Var2).Z) != null) {
                        mkVar.K();
                        unVar.Z.j0(true, false, true);
                    }
                    if (k2Var2.getContext() != null && k2Var2.getParentActivity() != null) {
                        xh.m2 m2Var = new xh.m2(k2Var2.getContext(), k2Var2.getResourceProvider());
                        m2Var.f53906l0 = k2Var2.getParentActivity();
                        if (h3Var2 != null && h3Var2.f20355a != null) {
                            m2Var.F0 = true;
                            boolean z14 = h3Var2.f20366o;
                            m2Var.W = z14;
                            if (z14) {
                                m2Var.A(h3Var2.f20369r, false);
                            }
                            if (!h3Var2.f20365n) {
                                int i23 = h3Var2.f20367p;
                                if (i23 < 0) {
                                    i23 = t6.f20930d6;
                                }
                                i10 = t6.w0(i23, m2Var.F);
                            } else {
                                i10 = h3Var2.f20368q;
                            }
                            m2Var.y(i10, h3Var2.f20365n, false);
                            m2Var.D(h3Var2.f20370s, false);
                            m2Var.G0 = h3Var2.f20361j;
                            m2Var.H0 = h3Var2.f20362k;
                            boolean z15 = h3Var2.f20372u;
                            m2Var.f53922x0 = z15;
                            xh.e2 e2Var = m2Var.D;
                            e2Var.setIsBackButtonVisible(z15);
                            m2Var.f53921x.setAllowSwipes(h3Var2.f20363l);
                            ImageView backButton = m2Var.X.getBackButton();
                            if (m2Var.f53922x0) {
                                i11 = 2131231241;
                            } else {
                                i11 = 2131231270;
                            }
                            org.telegram.messenger.i0.Q3(backButton, i11);
                            org.telegram.messenger.l2 l2Var = m2Var.f53908n0;
                            if (l2Var != null) {
                                boolean z16 = m2Var.f53922x0;
                                l2Var.K = z16;
                                l2Var.L.d(z16);
                                l2Var.invalidate();
                            }
                            m2Var.f53915s0 = h3Var2.f20375y;
                            m2Var.A0 = Boolean.valueOf(h3Var2.B);
                            m2Var.B0 = h3Var2.C;
                            xh.s0 s0Var = h3Var2.K;
                            m2Var.C0 = s0Var;
                            if (s0Var != null) {
                                xh.q0 q0Var = s0Var.f54048r;
                                SensorManager sensorManager = s0Var.f54034a;
                                f7 = 0.721f;
                                if (s0Var.f54042l) {
                                    s0Var.f54042l = false;
                                    if (sensorManager != null) {
                                        Sensor sensor = s0Var.f54035b;
                                        if (sensor != null) {
                                            sensorManager.registerListener(s0Var.f54044n, sensor, xh.s0.a(s0Var.f54036c));
                                        }
                                        Sensor sensor2 = s0Var.d;
                                        if (sensor2 != null) {
                                            sensorManager.registerListener(s0Var.f54046p, sensor2, xh.s0.a(s0Var.e));
                                        }
                                        Sensor sensor3 = s0Var.f54038g;
                                        if (sensor3 != null) {
                                            sensorManager.registerListener(q0Var, sensor3, xh.s0.a(s0Var.h));
                                        }
                                        Sensor sensor4 = s0Var.f54037f;
                                        if (sensor4 != null) {
                                            sensorManager.registerListener(q0Var, sensor4, xh.s0.a(s0Var.h));
                                        }
                                        Sensor sensor5 = s0Var.f54039i;
                                        if (sensor5 != null) {
                                            sensorManager.registerListener(s0Var.f54050t, sensor5, xh.s0.a(s0Var.f54040j));
                                        }
                                    }
                                }
                            } else {
                                f7 = 0.721f;
                            }
                            a5.a aVar = h3Var2.f20373w;
                            if (aVar != null) {
                                xh.i2 i2Var = m2Var.m0;
                                int totalHeight = i2Var.getTotalHeight();
                                i2Var.e = aVar;
                                xh.p[] pVarArr = i2Var.f54017f;
                                xh.r.b(pVarArr[0].f53974l, (xh.q) aVar.f282c, false);
                                xh.r.b(pVarArr[1].f53974l, (xh.q) aVar.d, false);
                                i2Var.invalidate();
                                if (totalHeight != i2Var.getTotalHeight() && i2Var.f54019r != null) {
                                    if (totalHeight < i2Var.getTotalHeight()) {
                                        org.telegram.messenger.i0.h3(i2Var.f54019r, 200L);
                                    } else {
                                        i2Var.f54019r.run();
                                    }
                                }
                                int i24 = aVar.f281b;
                                Paint paint = i2Var.f54014a;
                                i2Var.e.f281b = i24;
                                paint.setColor(i24);
                                i2Var.d.a(i24, true);
                            }
                            m2Var.C(h3Var2.f20376z, false, h3Var2.A);
                            t3 t3Var = h3Var2.f20355a;
                            if (t3Var != null) {
                                i12 = t3Var.f54070a;
                            } else {
                                i12 = e20.f15506s0;
                            }
                            m2Var.H = i12;
                            org.telegram.ui.web.v0 v0Var = h3Var2.f20356b;
                            if (v0Var != null) {
                                v0Var.onResume();
                                e2Var.N(m2Var.H, h3Var2.f20356b, h3Var2.d, h3Var2.f20358f, h3Var2.e);
                                if (!h3Var2.f20371t && !h3Var2.f20356b.f43011b) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                String str11 = h3Var2.f20374x;
                                e2Var.g("setState(" + z10 + ", " + str11 + ")");
                                e2Var.N = z10;
                                e2Var.f43061b = str11;
                                if (t6.I.q() != h3Var2.D) {
                                    e2Var.z();
                                }
                            } else {
                                t3Var.f54083q = null;
                                t3Var.f54084r = 0L;
                            }
                            m2Var.x(k2Var2, h3Var2.f20355a);
                            m2Var.f53896c0 = h3Var2.v;
                            if (h3Var2.G) {
                                m2Var.W0 = true;
                                m2Var.m();
                                org.telegram.ui.b3 b3Var = m2Var.Y0;
                                if (m2Var.q()) {
                                    p5 = m2Var.f53920w0.e;
                                } else {
                                    p5 = i20.p(wp.r1(m2Var.H).Z1(Long.valueOf(m2Var.I)));
                                }
                                String str12 = h3Var2.H;
                                m2Var.X0 = str12;
                                b3Var.a(p5, str12);
                                org.telegram.ui.b3 b3Var2 = m2Var.Y0;
                                Paint paint2 = m2Var.Q;
                                if (org.telegram.messenger.i0.B(paint2.getColor()) > f7) {
                                    z12 = false;
                                }
                                b3Var2.b(z12, false);
                                m2Var.Y0.setBackgroundColor(paint2.getColor());
                                m2Var.Y0.setVisibility(0);
                                m2Var.Y0.setAlpha(1.0f);
                            }
                            m2Var.t(h3Var2.L);
                            i3Var.h(i3Var.f20401x, h3Var2, false);
                            m2Var.show();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 9:
                org.telegram.ui.ActionBar.n3 n3Var = (org.telegram.ui.ActionBar.n3) obj2;
                ((org.telegram.ui.ActionBar.h3) obj3).f20364m = (Bitmap) obj;
                n3Var.mo30d().setDrawingFromOverlay(false);
                n3Var.release();
                return;
            case 10:
                p3 p3Var = (p3) obj2;
                q3 q3Var = (q3) ((org.telegram.ui.ActionBar.m3) obj3).f20585q;
                if (((Boolean) obj).booleanValue()) {
                    p3Var.a(1.0f);
                    if (q3Var.f20662a.getTabs().isEmpty()) {
                        q3Var.a(false);
                        return;
                    }
                    return;
                }
                p3Var.a(0.0f);
                return;
            case 11:
                h4 h4Var = (h4) obj3;
                Activity activity = (Activity) obj2;
                Integer num = (Integer) obj;
                u3 u3Var = h4Var.K;
                org.telegram.ui.l0[] l0VarArr = h4Var.T0;
                if ((!h4Var.f37691u0[0].c() || h4Var.f37691u0[0].f39062c.E != null) && h4Var.L != null) {
                    if (num.intValue() == 1) {
                        org.telegram.ui.m0 m0Var = h4Var.f37679h0;
                        int L = org.telegram.messenger.i0.L(56.0f);
                        h4Var.J0 = L;
                        m0Var.setHeight(L);
                        h4Var.f37679h0.h(true);
                        return;
                    } else if (num.intValue() == 2) {
                        if (h4Var.f37691u0[0].f()) {
                            if (h4Var.f37691u0[0].getWebView() != null) {
                                str5 = h4Var.f37691u0[0].getWebView().getUrl();
                            } else {
                                return;
                            }
                        } else {
                            TLRPC.WebPage webPage = h4Var.f37691u0[0].f39062c.E;
                            if (webPage != null) {
                                str5 = webPage.url;
                            } else {
                                return;
                            }
                        }
                        String u10 = org.telegram.ui.web.z0.u(str5);
                        Activity activity2 = h4Var.L;
                        if (org.telegram.messenger.i0.B(h4Var.f37679h0.getBackgroundColor()) < 0.721f) {
                            bVar = new th.b();
                        }
                        h4Var.Y(new pp0(activity2, null, u10, false, u10, false, bVar));
                        return;
                    } else if (num.intValue() == 6) {
                        if (h4Var.f37691u0[0].f()) {
                            if (h4Var.f37691u0[0].getWebView() != null) {
                                str4 = h4Var.f37691u0[0].getWebView().getUrl();
                                frameLayout = h4Var.f37691u0[0].f39063f;
                            } else {
                                return;
                            }
                        } else {
                            org.telegram.ui.l3 l3Var = h4Var.f37691u0[0];
                            TLRPC.WebPage webPage2 = l3Var.f39062c.E;
                            if (webPage2 != null) {
                                str4 = webPage2.url;
                                frameLayout = l3Var;
                            } else {
                                return;
                            }
                        }
                        h4.d(str4, h4Var.X, frameLayout, u3Var, null);
                        return;
                    } else if (num.intValue() == 7) {
                        ?? obj4 = new Object();
                        obj4.f20390a = true;
                        org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                        if (T != 0) {
                            if (u3Var != null) {
                                yVar2 = new org.telegram.ui.y(h4Var, 6);
                            }
                            T.showAsSheet(new org.telegram.ui.web.m(yVar2, new org.telegram.ui.p(h4Var, 2)), obj4);
                            return;
                        }
                        return;
                    } else if (num.intValue() == 8) {
                        ?? obj5 = new Object();
                        obj5.f20390a = true;
                        org.telegram.ui.ActionBar.k2 T2 = LaunchActivity.T();
                        if (T2 != 0) {
                            if (u3Var != null) {
                                yVar = new org.telegram.ui.y(h4Var, 7);
                            }
                            T2.showAsSheet(new org.telegram.ui.web.b1(yVar, new org.telegram.ui.p(h4Var, 3)), obj5);
                            return;
                        }
                        return;
                    } else if (num.intValue() == 9) {
                        if (h4Var.f37691u0[0].getWebView() != null) {
                            h4Var.f37691u0[0].getWebView().goForward();
                            return;
                        }
                        return;
                    } else if (num.intValue() == 3) {
                        if (h4Var.f37691u0[0].f()) {
                            if (h4Var.f37691u0[0].getWebView() != null) {
                                str = h4Var.f37691u0[0].getWebView().getUrl();
                                str2 = h4Var.f37691u0[0].getWebView().getOpenURL();
                                file = null;
                            } else {
                                return;
                            }
                        } else {
                            TLRPC.WebPage webPage3 = h4Var.f37691u0[0].f39062c.E;
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
                        Activity activity3 = h4Var.L;
                        if (activity3 != null && !activity3.isFinishing()) {
                            if (file != null) {
                                String D = b8.D(file);
                                Pattern pattern = g90.f26367a;
                                if (!"diff".equalsIgnoreCase(D) && !"patch".equalsIgnoreCase(D)) {
                                    str3 = "text/markdown";
                                } else {
                                    str3 = "text/x-diff";
                                }
                                org.telegram.messenger.i0.t2(file, null, str3, h4Var.L, null, true);
                                return;
                            } else if (str != null) {
                                String K0 = org.telegram.messenger.i0.K0(str2, true);
                                String K02 = org.telegram.messenger.i0.K0(str, true);
                                org.telegram.ui.v vVar2 = new org.telegram.ui.v(h4Var, str, 1);
                                org.telegram.ui.w wVar = new org.telegram.ui.w(h4Var, K02, K0, 1);
                                if (h4Var.f37691u0[0].f() && wp.r1(h4Var.X).L2(K02) && !wp.r1(h4Var.X).J2(true)) {
                                    s4.n0(activity, null, str, true, new ih.s(2, wVar, vVar2));
                                    return;
                                } else {
                                    vVar2.run();
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        return;
                    } else if (num.intValue() == 4) {
                        if (h4Var.f37691u0[0].f()) {
                            org.telegram.ui.ActionBar.k2 T3 = LaunchActivity.T();
                            if (T3 != 0) {
                                ?? obj6 = new Object();
                                obj6.f20390a = true;
                                T3.showAsSheet(new org.telegram.ui.web.p1(new org.telegram.ui.p(h4Var, 3)), obj6);
                                return;
                            }
                            return;
                        }
                        org.telegram.ui.ActionBar.z2 h = a30.h(h4Var.L, false, 1, null);
                        h.f21617u0 = false;
                        LinearLayout linearLayout = new LinearLayout(h4Var.L);
                        linearLayout.setPadding(0, 0, 0, org.telegram.messenger.i0.L(4.0f));
                        linearLayout.setOrientation(1);
                        p4 p4Var = new p4(h4Var.L, (p6) null);
                        p4Var.setText(dd.L0(2131750610, null));
                        linearLayout.addView(p4Var, b6.t(-2, -2, 51, 3, 1, 3, 0));
                        linearLayout.addView(new org.telegram.ui.d4(h4Var, h4Var.L), b6.t(-1, -2, 51, 3, 0, 3, 0));
                        p4 p4Var2 = new p4(h4Var.L, (p6) null);
                        p4Var2.setText(dd.L0(2131750605, null));
                        linearLayout.addView(p4Var2, b6.t(-2, -2, 51, 3, 4, 3, 2));
                        int i25 = 0;
                        for (int i26 = 2; i25 < i26; i26 = 2) {
                            Activity activity4 = h4Var.L;
                            org.telegram.ui.l0 l0Var = new org.telegram.ui.l0(activity4, 1);
                            int i27 = t6.f21021i6;
                            org.telegram.ui.Cells.y h02 = t6.h0(t6.x0(null, i27, false), i26, -1);
                            w6 N = a7.N(i27);
                            l0Var.setBackground(h02);
                            a7.k(l0Var, h02, null, N, null);
                            RadioButton radioButton = new RadioButton(activity4);
                            l0Var.f39040b = radioButton;
                            radioButton.setSize(org.telegram.messenger.i0.L(20.0f));
                            a7.P(radioButton, t6.D5, t6.E5, null);
                            boolean z17 = dd.X;
                            if (z17) {
                                i13 = 5;
                            } else {
                                i13 = 3;
                            }
                            int i28 = i13 | 48;
                            if (z17) {
                                i14 = 0;
                            } else {
                                i14 = 22;
                            }
                            float f11 = i14;
                            if (z17) {
                                i15 = 22;
                            } else {
                                i15 = 0;
                            }
                            l0Var.addView(radioButton, b6.d(22, 22.0f, i28, f11, 13.0f, i15, 0.0f));
                            TextView textView = new TextView(activity4);
                            a7.V(textView, t6.G6, null);
                            a30.o(textView, 1, 16.0f, 1, 1);
                            textView.setSingleLine(true);
                            if (dd.X) {
                                i16 = 5;
                            } else {
                                i16 = 3;
                            }
                            textView.setGravity(i16 | 16);
                            boolean z18 = dd.X;
                            if (z18) {
                                i17 = 5;
                            } else {
                                i17 = 3;
                            }
                            int i29 = i17 | 48;
                            int i30 = 17;
                            if (z18) {
                                i18 = 17;
                            } else {
                                i18 = 62;
                            }
                            float f12 = i18;
                            if (z18) {
                                i30 = 62;
                            }
                            l0Var.addView(textView, b6.d(-1, -1.0f, i29, f12, 0.0f, i30, 0.0f));
                            l0VarArr[i25] = l0Var;
                            if (i25 != 0) {
                                if (i25 == 1) {
                                    Typeface typeface = Typeface.SERIF;
                                    textView.setText("Serif");
                                    textView.setTypeface(typeface);
                                    l0Var.setContentDescription("Serif");
                                    l0Var.invalidate();
                                }
                            } else {
                                String L0 = dd.L0(2131751601, null);
                                Typeface typeface2 = Typeface.DEFAULT;
                                textView.setText(L0);
                                textView.setTypeface(typeface2);
                                l0Var.setContentDescription(L0);
                                l0Var.invalidate();
                            }
                            org.telegram.ui.l0 l0Var2 = l0VarArr[i25];
                            if (i25 == h4Var.f39095a) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            ((RadioButton) l0Var2.f39040b).a(z11, false);
                            l0VarArr[i25].setTag(Integer.valueOf(i25));
                            l0VarArr[i25].setOnClickListener(new org.telegram.ui.q(h4Var, 4));
                            linearLayout.addView(l0VarArr[i25], b6.o(-1, 50));
                            i25++;
                        }
                        h.N = linearLayout;
                        h4Var.I = h;
                        h4Var.Y(h);
                        return;
                    } else if (num.intValue() == 5) {
                        if (h4Var.f37691u0[0].f() && h4Var.f37691u0[0].getWebView() != null) {
                            h4Var.f37691u0[0].getWebView().reload();
                            return;
                        }
                        return;
                    } else if (num.intValue() == 10 && (w1Var = h4Var.f37691u0[0].E) != null && w1Var.b() != null) {
                        h4Var.f(w1Var.b(), null, 1);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 12:
                org.telegram.ui.l3 l3Var2 = (org.telegram.ui.l3) obj3;
                Activity activity5 = (Activity) obj2;
                String str14 = (String) obj;
                if (!TextUtils.isEmpty(str14) && l3Var2.getWebView() != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str14.trim());
                    org.telegram.messenger.i0.c(spannableStringBuilder, 1, false, true);
                    URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                    int length = spannableStringBuilder.length();
                    int i31 = 0;
                    while (i21 < uRLSpanArr.length) {
                        length = Math.min(spannableStringBuilder.getSpanStart(uRLSpanArr[i21]), length);
                        i31 = Math.max(spannableStringBuilder.getSpanEnd(uRLSpanArr[i21]), i31);
                        i21++;
                    }
                    Pattern pattern2 = Utilities.f14519a;
                    try {
                        uri = Uri.parse(str14);
                    } catch (Exception unused) {
                        uri = null;
                    }
                    if (uri == null || !TextUtils.equals(uri.getScheme(), "javascript")) {
                        if ((uRLSpanArr.length > 0 && length == 0 && i31 > 0) || (uri != null && uri.getScheme() != null)) {
                            if (uri != null && uri.getScheme() == null && uri.getHost() == null && uri.getPath() != null) {
                                str14 = gf.f.u(uri, "https", null, uri.getPath(), "/");
                            }
                            l3Var2.getWebView().loadUrl(str14);
                            return;
                        }
                        org.telegram.ui.web.j.b(activity5, str14);
                        org.telegram.ui.web.v0 webView = l3Var2.getWebView();
                        String str15 = org.telegram.ui.web.g1.a().f42848b;
                        if (str15 != null) {
                            StringBuilder t10 = a1.g.t(str15);
                            t10.append(URLEncoder.encode(str14));
                            str6 = t10.toString();
                        }
                        webView.loadUrl(str6);
                        return;
                    }
                    return;
                }
                return;
            case 13:
                zc zcVar = (zc) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                zcVar.f43893c = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    int i32 = tL_premium_boostsStatus.level;
                    zcVar.f43891b = i32;
                    if (chat != null) {
                        chat.flags |= 1024;
                        chat.level = i32;
                    }
                }
                zcVar.e1(true);
                vh.d dVar = zcVar.P;
                if (dVar != null) {
                    dVar.setLoading(false);
                    return;
                }
                return;
            case 14:
                qc qcVar = (qc) obj3;
                mp mpVar = (mp) obj2;
                View view2 = (View) obj;
                if (view2 instanceof pc) {
                    pc pcVar = (pc) view2;
                    pcVar.setBackgroundColor(t6.w0(t6.f20930d6, qcVar.f40742a));
                    qcVar.f40743b.getClass();
                    int R = RecyclerView.R(view2);
                    if (mpVar != null) {
                        ArrayList arrayList = mpVar.f17166c;
                        if (R >= 0 && R < arrayList.size()) {
                            pcVar.a((lp) arrayList.get(R));
                        }
                    }
                    view2.invalidate();
                    return;
                }
                return;
            case 15:
                kg.q0 q0Var2 = (kg.q0) obj2;
                q0Var2.A1((org.telegram.messenger.h3) obj);
                ((le) obj3).m0.showDialog(q0Var2);
                return;
            case 16:
                un unVar2 = (un) obj3;
                Long l10 = (Long) obj;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages2 = new TLRPC.TL_messages_sendQuickReplyMessages();
                tL_messages_sendQuickReplyMessages2.peer = unVar2.getMessagesController().i1(unVar2.f42108j6);
                tL_messages_sendQuickReplyMessages2.shortcut_id = ((h3) obj2).f551a;
                unVar2.getConnectionsManager().sendRequest(tL_messages_sendQuickReplyMessages2, null);
                mk mkVar2 = unVar2.Z;
                if (mkVar2 != null) {
                    mkVar2.setFieldText(null);
                    return;
                }
                return;
            case 17:
                un unVar3 = (un) obj3;
                pz b10 = pz.b((String) obj2, unVar3.f42108j6, unVar3.D5, unVar3.l4, null, false, null, null, null, true, 0, 0, null, false);
                b10.K = unVar3.T8();
                b10.Q = ((Long) obj).longValue();
                b10.R = unVar3.e9();
                b10.T = unVar3.f42270w5;
                unVar3.getSendMessagesHelper().r0(b10);
                unVar3.Z.setFieldText("");
                unVar3.w9(false);
                return;
            case 18:
                un unVar4 = (un) obj3;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj2;
                Long l11 = (Long) obj;
                if (unVar4.f42059f4 == 1) {
                    s4.L(unVar4.getParentActivity(), unVar4.f42108j6, new org.telegram.ui.a7(unVar4, botInlineResult, l11, 2), unVar4.f42288xa);
                    return;
                } else {
                    unVar4.yb(botInlineResult, true, 0, l11.longValue());
                    return;
                }
            case 19:
                un.g0((un) obj3, (g01[]) obj2, (z60) obj);
                return;
            case 20:
                Boolean bool = (Boolean) obj;
                ((un) obj3).Fb = true;
                ((org.telegram.ui.h0) obj2).run();
                return;
            case 21:
                un unVar5 = (un) obj3;
                org.telegram.ui.ActionBar.x1[] x1VarArr = (org.telegram.ui.ActionBar.x1[]) obj2;
                TL_stats.TL_statsPollStats tL_statsPollStats = (TL_stats.TL_statsPollStats) obj;
                try {
                    x1VarArr[0].dismiss();
                } catch (Throwable unused2) {
                }
                x1VarArr[0] = null;
                if (tL_statsPollStats != null) {
                    if (tL_statsPollStats.votes_graph instanceof TL_stats.TL_statsGraphError) {
                        m5.n(null, 2131747172, cc.a0(unVar5), 2131624290, 24);
                        return;
                    } else {
                        new lh.h(unVar5.getParentActivity(), unVar5.f42288xa, tL_statsPollStats).show();
                        return;
                    }
                }
                return;
            case 22:
                un unVar6 = (un) obj3;
                kj kjVar = (kj) obj2;
                unVar6.getClass();
                TLRPC.SuggestedPost c10 = ((pj) obj).c();
                if (kjVar != null && kjVar.f16690k != null) {
                    unVar6.getMessagesController().h(kjVar, c10);
                    return;
                }
                return;
            case 23:
                h3 h3Var3 = (h3) obj2;
                String str16 = (String) obj;
                un unVar7 = ((nj) obj3).f39917b;
                if (h3Var3 != null) {
                    i19 = ((org.telegram.ui.ActionBar.k2) unVar7).currentAccount;
                    i3.f(i19).k(h3Var3.f551a, str16);
                }
                unVar7.f42047e4 = str16;
                unVar7.f42166o1.setTitle(str16);
                return;
            case 24:
                kj kjVar2 = (kj) obj2;
                Long l12 = (Long) obj;
                un unVar8 = ((fn) obj3).f37191a;
                if (unVar8.r7()) {
                    pz b11 = pz.b(kjVar2.C0(), unVar8.f42108j6, unVar8.D5, unVar8.l4, null, false, null, null, null, true, 0, 0, null, false);
                    b11.K = unVar8.T8();
                    b11.W = l12.longValue();
                    unVar8.getSendMessagesHelper().r0(b11);
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj2;
                un unVar9 = ((fn) obj3).f37191a;
                if (((Boolean) obj).booleanValue()) {
                    while (i21 < unVar9.f42303z0.getChildCount()) {
                        View childAt = unVar9.f42303z0.getChildAt(i21);
                        if (childAt instanceof org.telegram.ui.Cells.q1) {
                            org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt;
                            if (q1Var2.getMessageObject() != null && q1Var2.getMessageObject().p4()) {
                                q1Var2.D3();
                            }
                        }
                        i21++;
                    }
                    return;
                }
                if (q1Var.getMessageObject() != null) {
                    q1Var.getMessageObject().f16719r2 = Boolean.FALSE;
                }
                q1Var.D3();
                return;
            case 26:
                fn fnVar = (fn) obj3;
                e0 e0Var = (e0) obj2;
                un unVar10 = fnVar.f37191a;
                if (!((Boolean) obj).booleanValue()) {
                    cc.a0(unVar10).I(2131624011, dd.L0(2131754311, null), dd.L0(2131754312, null)).j();
                    return;
                }
                unVar10.getMessagesController().C4(true);
                cc.a0(unVar10).P(2131623981, org.telegram.messenger.i0.G2(org.telegram.messenger.i0.x2(dd.L0(2131745591, null), new pm(fnVar, 8)), true)).k(true);
                e0Var.a(Boolean.TRUE);
                return;
            case 27:
                TLRPC.Message message = (TLRPC.Message) obj2;
                ((fn) obj3).f37191a.getMessagesController().v(message.f19815id, -1, o5.o(message.peer_id), (String) obj, true);
                return;
            case 28:
                xn xnVar = (xn) obj3;
                xnVar.f43413f.s(((wf.a) obj).f52852a, ((TLRPC.WallPaper) obj2).settings.intensity);
                View view3 = xnVar.f43411b;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
            default:
                Long l13 = (Long) obj;
                ChatActivityEnterView chatActivityEnterView = ((re) obj3).f29979a;
                long j10 = chatActivityEnterView.Q2;
                kj kjVar3 = chatActivityEnterView.T2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                pz b12 = pz.b((String) obj2, j10, kjVar3, threadMessage, null, false, null, null, null, true, 0, 0, null, false);
                un unVar11 = chatActivityEnterView.P2;
                if (unVar11 != null) {
                    twVar = unVar11.T8();
                }
                b12.K = twVar;
                b12.O = chatActivityEnterView.S4;
                b12.Q = l13.longValue();
                b12.R = chatActivityEnterView.getSendMonoForumPeerId();
                b12.T = chatActivityEnterView.getSendMessageSuggestionParams();
                rz.C(chatActivityEnterView.Q).r0(b12);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.m0.c();
                be beVar = chatActivityEnterView.J0;
                chatActivityEnterView.S4 = 0L;
                beVar.setEffect(0L);
                return;
        }
    }

    public e0(h2 h2Var, View view) {
        this.f490a = 2;
        this.f492c = h2Var;
        this.f491b = view;
    }
}
