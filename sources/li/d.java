package li;

import android.app.Activity;
import android.graphics.Typeface;
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
import bi.r6;
import c8.na;
import java.io.File;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.regex.Pattern;
import kg.v1;
import kg.w1;
import oi.a2;
import oi.e1;
import oi.e2;
import oi.s3;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.az;
import org.telegram.messenger.cp;
import org.telegram.messenger.cw;
import org.telegram.messenger.cz;
import org.telegram.messenger.dp;
import org.telegram.messenger.f3;
import org.telegram.messenger.g3;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.j6;
import org.telegram.messenger.lj;
import org.telegram.messenger.n5;
import org.telegram.messenger.np;
import org.telegram.messenger.o10;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.messenger.w7;
import org.telegram.messenger.y10;
import org.telegram.messenger.yy;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.w2;
import org.telegram.ui.Cells.o4;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.ap0;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.df;
import org.telegram.ui.Components.ff;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.re;
import org.telegram.ui.Components.ui;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
import org.telegram.ui.c4;
import org.telegram.ui.en;
import org.telegram.ui.g4;
import org.telegram.ui.gc;
import org.telegram.ui.hc;
import org.telegram.ui.k3;
import org.telegram.ui.k9;
import org.telegram.ui.mm;
import org.telegram.ui.qc;
import org.telegram.ui.rj;
import org.telegram.ui.t3;
import org.telegram.ui.ti;
import org.telegram.ui.u7;
import org.telegram.ui.ul;
import org.telegram.ui.uy0;
import org.telegram.ui.web.d1;
import org.telegram.ui.web.n1;
import org.telegram.ui.web.s0;
import org.telegram.ui.web.t1;
import org.telegram.ui.web.v0;
import org.telegram.ui.web.x0;
import org.telegram.ui.xd;
import org.telegram.ui.z6;
public final class d implements y10 {
    public final int f19895a;
    public final Object f19896b;
    public final Object f19897c;

    public d(int i7, Object obj, Object obj2) {
        this.f19895a = i7;
        this.f19896b = obj;
        this.f19897c = obj2;
    }

    @Override
    public final void a(Object obj) {
        oi.q a10;
        t1 t1Var;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z10;
        String str;
        String str2;
        File file;
        String str3;
        String str4;
        FrameLayout frameLayout;
        String str5;
        Uri uri;
        int i15;
        TLRPC.Document document;
        gj threadMessage;
        int i16 = this.f19895a;
        org.telegram.ui.z zVar = null;
        cw cwVar = null;
        String str6 = null;
        fi.b bVar = null;
        org.telegram.ui.z zVar2 = null;
        int i17 = 0;
        Object obj2 = this.f19897c;
        Object obj3 = this.f19896b;
        switch (i16) {
            case 0:
                g gVar = (g) obj3;
                gVar.getClass();
                gVar.b0(((TLRPC.Chat) obj2).f28398id, ((Boolean) obj).booleanValue());
                return;
            case 1:
                g gVar2 = (g) obj3;
                gVar2.getClass();
                gVar2.a0((String) obj2, ((Boolean) obj).booleanValue());
                return;
            case 2:
                d0 d0Var = (d0) obj3;
                d0Var.L0((TLRPC.Chat) obj2, d0Var.f19900p1, ((Boolean) obj).booleanValue());
                return;
            case 3:
                TL_iv.pageBlockMath pageblockmath = (TL_iv.pageBlockMath) obj2;
                String str7 = (String) obj;
                s3 s3Var = ((oi.o) obj3).f22237r;
                if (pageblockmath != null) {
                    pageblockmath.source = str7;
                    s3Var.f35742g3.O(false);
                    return;
                }
                TL_iv.pageBlockMath pageblockmath2 = new TL_iv.pageBlockMath();
                pageblockmath2.source = str7;
                s3Var.V1(pageblockmath2);
                return;
            case 4:
                e1 e1Var = (e1) obj3;
                oi.q qVar = (oi.q) obj2;
                String str8 = (String) obj;
                e1Var.getClass();
                if (!TextUtils.isEmpty(str8)) {
                    Editable text = e1Var.getText();
                    int spanStart = text.getSpanStart(qVar);
                    int spanEnd = text.getSpanEnd(qVar);
                    if (spanStart >= 0 && spanEnd >= 0 && (a10 = oi.q.a(str8, e1Var.getCurrentTextColor(), org.telegram.messenger.g0.L(cz.W0 + 4))) != null) {
                        boolean z11 = e1Var.f22044m2;
                        if (z11) {
                            e1Var.setLocked(false);
                        }
                        SpannableString spannableString = new SpannableString(" ");
                        spannableString.setSpan(a10, 0, 1, 33);
                        int max = Math.max(0, Math.min(spanStart, e1Var.length()));
                        text.replace(max, Math.max(max, Math.min(spanEnd, e1Var.length())), spannableString);
                        e1Var.setSelection(Math.min(max + 1, e1Var.length()));
                        if (z11) {
                            e1Var.setLocked(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                a2 a2Var = (a2) obj3;
                TL_iv.pageBlockMath pageblockmath3 = (TL_iv.pageBlockMath) obj2;
                String str9 = (String) obj;
                a2Var.getClass();
                if (pageblockmath3 != null) {
                    pageblockmath3.source = str9;
                    a2Var.Q.f35742g3.O(false);
                    return;
                }
                TL_iv.pageBlockMath pageblockmath4 = new TL_iv.pageBlockMath();
                pageblockmath4.source = str9;
                a2Var.Q.V1(pageblockmath4);
                return;
            case 6:
                s3 s3Var2 = (s3) obj3;
                TL_iv.pageBlockMath pageblockmath5 = (TL_iv.pageBlockMath) obj2;
                String str10 = (String) obj;
                s3Var2.getClass();
                if (!TextUtils.equals(str10, pageblockmath5.source)) {
                    e2 e2Var = s3Var2.R3;
                    if (e2Var != null) {
                        e2Var.d();
                    }
                    pageblockmath5.source = str10;
                    s3Var2.f35742g3.O(false);
                    e2 e2Var2 = s3Var2.R3;
                    if (e2Var2 != null) {
                        e2Var2.h();
                    }
                    s3Var2.f22365p3.onContentChanged();
                    return;
                }
                return;
            case 7:
                VoIPDebugToSend.b((VoIPDebugToSend) obj3, (TL_phone.saveCallDebug) obj2, (TLRPC.InputFile) obj);
                return;
            case 8:
                g4 g4Var = (g4) obj3;
                Activity activity = (Activity) obj2;
                Integer num = (Integer) obj;
                t3 t3Var = g4Var.L;
                org.telegram.ui.k0[] k0VarArr = g4Var.U0;
                if ((!g4Var.f47920v0[0].c() || g4Var.f47920v0[0].f49137c.F != null) && g4Var.M != null) {
                    if (num.intValue() == 1) {
                        org.telegram.ui.l0 l0Var = g4Var.f47908i0;
                        int L = org.telegram.messenger.g0.L(56.0f);
                        g4Var.K0 = L;
                        l0Var.setHeight(L);
                        g4Var.f47908i0.h(true);
                        return;
                    } else if (num.intValue() == 2) {
                        if (g4Var.f47920v0[0].f()) {
                            if (g4Var.f47920v0[0].getWebView() != null) {
                                str5 = g4Var.f47920v0[0].getWebView().getUrl();
                            } else {
                                return;
                            }
                        } else {
                            TLRPC.WebPage webPage = g4Var.f47920v0[0].f49137c.F;
                            if (webPage != null) {
                                str5 = webPage.url;
                            } else {
                                return;
                            }
                        }
                        String u10 = v0.u(str5);
                        Activity activity2 = g4Var.M;
                        if (org.telegram.messenger.g0.B(g4Var.f47908i0.getBackgroundColor()) < 0.721f) {
                            bVar = new fi.b();
                        }
                        g4Var.Y(new ap0(activity2, null, u10, false, u10, false, bVar));
                        return;
                    } else if (num.intValue() == 6) {
                        if (g4Var.f47920v0[0].f()) {
                            if (g4Var.f47920v0[0].getWebView() != null) {
                                str4 = g4Var.f47920v0[0].getWebView().getUrl();
                                frameLayout = g4Var.f47920v0[0].f49139f;
                            } else {
                                return;
                            }
                        } else {
                            k3 k3Var = g4Var.f47920v0[0];
                            TLRPC.WebPage webPage2 = k3Var.f49137c.F;
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
                        obj4.f28871a = true;
                        g2 T = LaunchActivity.T();
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
                        obj5.f28871a = true;
                        g2 T2 = LaunchActivity.T();
                        if (T2 != 0) {
                            if (t3Var != null) {
                                zVar = new org.telegram.ui.z(g4Var, 7);
                            }
                            T2.showAsSheet(new x0(zVar, new org.telegram.ui.q(g4Var, 3)), obj5);
                            return;
                        }
                        return;
                    } else if (num.intValue() == 9) {
                        if (g4Var.f47920v0[0].getWebView() != null) {
                            g4Var.f47920v0[0].getWebView().goForward();
                            return;
                        }
                        return;
                    } else if (num.intValue() == 3) {
                        if (g4Var.f47920v0[0].f()) {
                            if (g4Var.f47920v0[0].getWebView() != null) {
                                str = g4Var.f47920v0[0].getWebView().getUrl();
                                str2 = g4Var.f47920v0[0].getWebView().getOpenURL();
                                file = null;
                            } else {
                                return;
                            }
                        } else {
                            TLRPC.WebPage webPage3 = g4Var.f47920v0[0].f49137c.F;
                            if (webPage3 != null) {
                                String str11 = webPage3.url;
                                TL_iv.Page page = webPage3.cached_page;
                                if (page != null) {
                                    file = page.local;
                                    str = str11;
                                    str2 = null;
                                } else {
                                    str = str11;
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
                                Pattern pattern = d90.f34410a;
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
                                if (g4Var.f47920v0[0].f() && np.u1(g4Var.Y).T2(K02) && !np.u1(g4Var.Y).R2(true)) {
                                    c5.l0(activity, null, str, true, new r6(12, xVar, wVar));
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
                        if (g4Var.f47920v0[0].f()) {
                            g2 T3 = LaunchActivity.T();
                            if (T3 != 0) {
                                ?? obj6 = new Object();
                                obj6.f28871a = true;
                                T3.showAsSheet(new n1(new org.telegram.ui.q(g4Var, 3)), obj6);
                                return;
                            }
                            return;
                        }
                        w2 j3 = o10.j(g4Var.M, false, 1, null);
                        j3.f30178v0 = false;
                        LinearLayout linearLayout = new LinearLayout(g4Var.M);
                        linearLayout.setPadding(0, 0, 0, org.telegram.messenger.g0.L(4.0f));
                        linearLayout.setOrientation(1);
                        o4 o4Var = new o4(g4Var.M, (h6) null);
                        o4Var.setText(hd.N0(2131750592, null));
                        linearLayout.addView(o4Var, na.t(-2, -2, 51, 3, 1, 3, 0));
                        linearLayout.addView(new c4(g4Var, g4Var.M), na.t(-1, -2, 51, 3, 0, 3, 0));
                        o4 o4Var2 = new o4(g4Var.M, (h6) null);
                        o4Var2.setText(hd.N0(2131750587, null));
                        linearLayout.addView(o4Var2, na.t(-2, -2, 51, 3, 4, 3, 2));
                        int i18 = 0;
                        for (int i19 = 2; i18 < i19; i19 = 2) {
                            Activity activity4 = g4Var.M;
                            org.telegram.ui.k0 k0Var = new org.telegram.ui.k0(activity4, 1);
                            int i20 = m6.f29439i6;
                            org.telegram.ui.Cells.y h02 = m6.h0(m6.x0(null, i20, false), i19, -1);
                            p6 M = t6.M(i20);
                            k0Var.setBackground(h02);
                            t6.j(k0Var, h02, null, M, null);
                            RadioButton radioButton = new RadioButton(activity4);
                            k0Var.f49119b = radioButton;
                            radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
                            t6.O(radioButton, m6.D5, m6.E5, null);
                            boolean z12 = hd.f24408a0;
                            if (z12) {
                                i7 = 5;
                            } else {
                                i7 = 3;
                            }
                            int i21 = i7 | 48;
                            if (z12) {
                                i10 = 0;
                            } else {
                                i10 = 22;
                            }
                            float f10 = i10;
                            if (z12) {
                                i11 = 22;
                            } else {
                                i11 = 0;
                            }
                            k0Var.addView(radioButton, na.d(22, 22.0f, i21, f10, 13.0f, i11, 0.0f));
                            TextView textView = new TextView(activity4);
                            t6.U(textView, m6.G6, null);
                            o10.q(textView, 1, 16.0f, 1, 1);
                            textView.setSingleLine(true);
                            if (hd.f24408a0) {
                                i12 = 5;
                            } else {
                                i12 = 3;
                            }
                            textView.setGravity(i12 | 16);
                            boolean z13 = hd.f24408a0;
                            if (z13) {
                                i13 = 5;
                            } else {
                                i13 = 3;
                            }
                            int i22 = i13 | 48;
                            int i23 = 17;
                            if (z13) {
                                i14 = 17;
                            } else {
                                i14 = 62;
                            }
                            float f11 = i14;
                            if (z13) {
                                i23 = 62;
                            }
                            k0Var.addView(textView, na.d(-1, -1.0f, i22, f11, 0.0f, i23, 0.0f));
                            k0VarArr[i18] = k0Var;
                            if (i18 != 0) {
                                if (i18 == 1) {
                                    Typeface typeface = Typeface.SERIF;
                                    textView.setText("Serif");
                                    textView.setTypeface(typeface);
                                    k0Var.setContentDescription("Serif");
                                    k0Var.invalidate();
                                }
                            } else {
                                String N0 = hd.N0(2131751588, null);
                                Typeface typeface2 = Typeface.DEFAULT;
                                textView.setText(N0);
                                textView.setTypeface(typeface2);
                                k0Var.setContentDescription(N0);
                                k0Var.invalidate();
                            }
                            org.telegram.ui.k0 k0Var2 = k0VarArr[i18];
                            if (i18 == g4Var.f50724a) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            ((RadioButton) k0Var2.f49119b).a(z10, false);
                            k0VarArr[i18].setTag(Integer.valueOf(i18));
                            k0VarArr[i18].setOnClickListener(new org.telegram.ui.r(g4Var, 4));
                            linearLayout.addView(k0VarArr[i18], na.o(-1, 50));
                            i18++;
                        }
                        j3.O = linearLayout;
                        g4Var.J = j3;
                        g4Var.Y(j3);
                        return;
                    } else if (num.intValue() == 5) {
                        if (g4Var.f47920v0[0].f() && g4Var.f47920v0[0].getWebView() != null) {
                            g4Var.f47920v0[0].getWebView().reload();
                            return;
                        }
                        return;
                    } else if (num.intValue() == 10 && (t1Var = g4Var.f47920v0[0].F) != null && t1Var.b() != null) {
                        g4Var.f(t1Var.b(), null, 1);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 9:
                k3 k3Var2 = (k3) obj3;
                Activity activity5 = (Activity) obj2;
                String str12 = (String) obj;
                if (!TextUtils.isEmpty(str12) && k3Var2.getWebView() != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str12.trim());
                    org.telegram.messenger.g0.c(spannableStringBuilder, 1, false, true);
                    URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                    int length = spannableStringBuilder.length();
                    int i24 = 0;
                    while (i17 < uRLSpanArr.length) {
                        length = Math.min(spannableStringBuilder.getSpanStart(uRLSpanArr[i17]), length);
                        i24 = Math.max(spannableStringBuilder.getSpanEnd(uRLSpanArr[i17]), i24);
                        i17++;
                    }
                    Pattern pattern2 = Utilities.f22771a;
                    try {
                        uri = Uri.parse(str12);
                    } catch (Exception unused) {
                        uri = null;
                    }
                    if (uri == null || !TextUtils.equals(uri.getScheme(), "javascript")) {
                        if ((uRLSpanArr.length > 0 && length == 0 && i24 > 0) || (uri != null && uri.getScheme() != null)) {
                            if (uri != null && uri.getScheme() == null && uri.getHost() == null && uri.getPath() != null) {
                                str12 = vf.c.w(uri, "https", null, uri.getEncodedPath(), "/");
                            }
                            k3Var2.getWebView().loadUrl(str12);
                            return;
                        }
                        org.telegram.ui.web.k.b(activity5, str12);
                        s0 webView = k3Var2.getWebView();
                        String str13 = d1.a().f53082b;
                        if (str13 != null) {
                            StringBuilder m10 = com.google.android.gms.internal.vision.e2.m(str13);
                            m10.append(URLEncoder.encode(str12));
                            str6 = m10.toString();
                        }
                        webView.loadUrl(str6);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                qc qcVar = (qc) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                qcVar.f51144c = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    int i25 = tL_premium_boostsStatus.level;
                    qcVar.f51142b = i25;
                    if (chat != null) {
                        chat.flags |= 1024;
                        chat.level = i25;
                    }
                }
                qcVar.e1(true);
                hi.d dVar = qcVar.Q;
                if (dVar != null) {
                    dVar.setLoading(false);
                    return;
                }
                return;
            case 11:
                hc hcVar = (hc) obj3;
                dp dpVar = (dp) obj2;
                View view = (View) obj;
                if (view instanceof gc) {
                    gc gcVar = (gc) view;
                    gcVar.setBackgroundColor(m6.w0(m6.f29347d6, hcVar.f48279a));
                    hcVar.f48280b.getClass();
                    int R = RecyclerView.R(view);
                    if (dpVar != null) {
                        ArrayList arrayList = dpVar.f23557c;
                        if (R >= 0 && R < arrayList.size()) {
                            gcVar.a((cp) arrayList.get(R));
                        }
                    }
                    view.invalidate();
                    return;
                }
                return;
            case 12:
                ug.k0 k0Var3 = (ug.k0) obj2;
                k0Var3.B1((g3) obj);
                ((xd) obj3).f53765n0.showDialog(k0Var3);
                return;
            case 13:
                bn bnVar = (bn) obj3;
                Long l10 = (Long) obj;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = new TLRPC.TL_messages_sendQuickReplyMessages();
                tL_messages_sendQuickReplyMessages.peer = bnVar.getMessagesController().l1(bnVar.f46056l6);
                tL_messages_sendQuickReplyMessages.shortcut_id = ((v1) obj2).f18505a;
                bnVar.getConnectionsManager().sendRequest(tL_messages_sendQuickReplyMessages, null);
                rj rjVar = bnVar.f45903a0;
                if (rjVar != null) {
                    rjVar.setFieldText(null);
                    return;
                }
                return;
            case 14:
                bn bnVar2 = (bn) obj3;
                yy b10 = yy.b((String) obj2, bnVar2.f46056l6, bnVar2.F5, bnVar2.f46067m4, null, false, null, null, null, true, 0, 0, null, false);
                b10.K = bnVar2.Y8();
                b10.Q = ((Long) obj).longValue();
                b10.R = bnVar2.j9();
                b10.T = bnVar2.f46221y5;
                bnVar2.getSendMessagesHelper().r0(b10);
                bnVar2.f45903a0.setFieldText("");
                bnVar2.D9(false);
                return;
            case 15:
                bn bnVar3 = (bn) obj3;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj2;
                Long l11 = (Long) obj;
                if (bnVar3.f45989g4 == 1) {
                    c5.J(bnVar3.getParentActivity(), bnVar3.f46056l6, new z6(bnVar3, botInlineResult, l11, 2), bnVar3.Ba);
                    return;
                } else {
                    bnVar3.Hb(botInlineResult, true, 0, l11.longValue());
                    return;
                }
            case 16:
                Boolean bool = (Boolean) obj;
                ((bn) obj3).Jb = true;
                ((k9) obj2).run();
                return;
            case 17:
                bn.h0((bn) obj3, (uy0[]) obj2, (a70) obj);
                return;
            case 18:
                bn bnVar4 = (bn) obj3;
                org.telegram.ui.ActionBar.t1[] t1VarArr = (org.telegram.ui.ActionBar.t1[]) obj2;
                TL_stats.TL_statsPollStats tL_statsPollStats = (TL_stats.TL_statsPollStats) obj;
                try {
                    t1VarArr[0].dismiss();
                } catch (Throwable unused2) {
                }
                t1VarArr[0] = null;
                if (tL_statsPollStats != null) {
                    if (tL_statsPollStats.votes_graph instanceof TL_stats.TL_statsGraphError) {
                        f3.n(null, 2131746963, lc.b0(bnVar4), 2131624293, 24);
                        return;
                    } else {
                        new vh.h(bnVar4.getParentActivity(), bnVar4.Ba, tL_statsPollStats).show();
                        return;
                    }
                }
                return;
            case 19:
                bn bnVar5 = (bn) obj3;
                gj gjVar = (gj) obj2;
                bnVar5.getClass();
                TLRPC.SuggestedPost c10 = ((lj) obj).c();
                if (gjVar != null && gjVar.f24177k != null) {
                    bnVar5.getMessagesController().h(gjVar, c10);
                    return;
                }
                return;
            case 20:
                v1 v1Var = (v1) obj2;
                String str14 = (String) obj;
                bn bnVar6 = ((ti) obj3).f52284b;
                if (v1Var != null) {
                    i15 = ((g2) bnVar6).currentAccount;
                    w1.f(i15).k(v1Var.f18505a, str14);
                }
                bnVar6.f45977f4 = str14;
                bnVar6.f46100p1.setTitle(str14);
                return;
            case 21:
                gj gjVar2 = (gj) obj2;
                Long l12 = (Long) obj;
                bn bnVar7 = ((mm) obj3).f49910a;
                if (bnVar7.u7()) {
                    yy b11 = yy.b(gjVar2.C0(), bnVar7.f46056l6, bnVar7.F5, bnVar7.f46067m4, null, false, null, null, null, true, 0, 0, null, false);
                    b11.K = bnVar7.Y8();
                    b11.W = l12.longValue();
                    bnVar7.getSendMessagesHelper().r0(b11);
                    return;
                }
                return;
            case 22:
                r1 r1Var = (r1) obj2;
                bn bnVar8 = ((mm) obj3).f49910a;
                if (((Boolean) obj).booleanValue()) {
                    while (i17 < bnVar8.A0.getChildCount()) {
                        View childAt = bnVar8.A0.getChildAt(i17);
                        if (childAt instanceof r1) {
                            r1 r1Var2 = (r1) childAt;
                            if (r1Var2.getMessageObject() != null && r1Var2.getMessageObject().p4()) {
                                r1Var2.J3();
                            }
                        }
                        i17++;
                    }
                    return;
                }
                if (r1Var.getMessageObject() != null) {
                    r1Var.getMessageObject().f24215t2 = Boolean.FALSE;
                }
                r1Var.J3();
                return;
            case 23:
                mm mmVar = (mm) obj3;
                d dVar2 = (d) obj2;
                bn bnVar9 = mmVar.f49910a;
                if (!((Boolean) obj).booleanValue()) {
                    lc.b0(bnVar9).I(2131624012, hd.N0(2131754308, null), hd.N0(2131754309, null)).j();
                    return;
                }
                bnVar9.getMessagesController().Q4(true);
                lc.b0(bnVar9).P(2131623982, org.telegram.messenger.g0.H2(org.telegram.messenger.g0.x2(hd.N0(2131745378, null), new ul(mmVar, 8)), true)).k(true);
                dVar2.a(Boolean.TRUE);
                return;
            case 24:
                TLRPC.Message message = (TLRPC.Message) obj2;
                ((mm) obj3).f49910a.getMessagesController().v(message.f28419id, -1, n5.o(message.peer_id), (String) obj, true);
                return;
            case 25:
                en enVar = (en) obj3;
                enVar.f47305f.s(((TLRPC.WallPaper) obj2).settings.intensity, ((gg.a) obj).f13602a);
                View view2 = enVar.f47302b;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.l0 l0Var2 = (org.telegram.ui.Components.l0) obj3;
                String str15 = (String) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                l0Var2.getClass();
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                    String replace = str15.replace("️", "");
                    int i26 = 0;
                    while (true) {
                        if (i26 < tL_messages_stickerSet.packs.size()) {
                            if (!tL_messages_stickerSet.packs.get(i26).documents.isEmpty() && TextUtils.equals(tL_messages_stickerSet.packs.get(i26).emoticon.replace("️", ""), replace)) {
                                long longValue = tL_messages_stickerSet.packs.get(i26).documents.get(0).longValue();
                                for (int i27 = 0; i27 < tL_messages_stickerSet.documents.size(); i27++) {
                                    if (tL_messages_stickerSet.documents.get(i27).f28404id == longValue) {
                                        document = tL_messages_stickerSet.documents.get(i27);
                                    }
                                }
                            } else {
                                i26++;
                            }
                        }
                    }
                    document = null;
                    if (document != null) {
                        l0Var2.h.m(org.telegram.messenger.gc.b(document), "24_24", org.telegram.messenger.gc.c(w7.w(document.thumbs, 24, false, null, false), document), "24_24", j6.g(str15), null);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                Long l13 = (Long) obj;
                ChatActivityEnterView chatActivityEnterView = ((ff) obj3).f35192a;
                long j10 = chatActivityEnterView.G3;
                gj gjVar3 = chatActivityEnterView.J3;
                threadMessage = chatActivityEnterView.getThreadMessage();
                yy b12 = yy.b((String) obj2, j10, gjVar3, threadMessage, null, false, null, null, null, true, 0, 0, null, false);
                bn bnVar10 = chatActivityEnterView.F3;
                if (bnVar10 != null) {
                    cwVar = bnVar10.Y8();
                }
                b12.K = cwVar;
                b12.O = chatActivityEnterView.P6;
                b12.Q = l13.longValue();
                b12.R = chatActivityEnterView.getSendMonoForumPeerId();
                b12.T = chatActivityEnterView.getSendMessageSuggestionParams();
                az.C(chatActivityEnterView.R).r0(b12);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.f32640n0.c();
                re reVar = chatActivityEnterView.K0;
                chatActivityEnterView.P6 = 0L;
                reVar.setEffect(0L);
                return;
            case 28:
                ui uiVar = (ui) obj3;
                ni niVar = (ni) obj2;
                Boolean bool2 = (Boolean) obj;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i28 = uiVar.H3;
                tL_messages_toggleBotInAttachMenu.bot = np.u1(i28).q1(niVar.f37839c.bot_id);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i28).sendRequest(tL_messages_toggleBotInAttachMenu, new u7(14, uiVar, niVar), 66);
                return;
            default:
                ui uiVar2 = (ui) obj3;
                ((bn) obj2).f46221y5 = (lj) obj;
                boolean v12 = uiVar2.v1(true, 0, 0, uiVar2.L2, uiVar2.g1());
                df dfVar = uiVar2.f40358c2;
                if (dfVar != null) {
                    dfVar.h(!v12);
                    uiVar2.f40358c2 = null;
                    return;
                }
                return;
        }
    }
}
