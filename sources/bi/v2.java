package bi;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.sk;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.ir0;
import org.telegram.ui.LaunchActivity;
public final class v2 implements Utilities.Callback {
    public final int f3856a;
    public final Object f3857b;
    public final Object f3858c;

    public v2(int i10, Object obj, Object obj2) {
        this.f3856a = i10;
        this.f3857b = obj;
        this.f3858c = obj2;
    }

    private final void a(Object obj) {
        org.telegram.ui.web.g2 g2Var;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z10;
        String str;
        String str2;
        File file;
        String str3;
        FrameLayout frameLayout;
        String str4;
        org.telegram.ui.k4 k4Var = (org.telegram.ui.k4) this.f3857b;
        Activity activity = (Activity) this.f3858c;
        Integer num = (Integer) obj;
        org.telegram.ui.x3 x3Var = k4Var.K;
        org.telegram.ui.l0[] l0VarArr = k4Var.S0;
        if ((!k4Var.f37278u0[0].c() || k4Var.f37278u0[0].f38530c.E != null) && k4Var.L != null) {
            if (num.intValue() == 1) {
                org.telegram.ui.m0 m0Var = k4Var.f37266h0;
                int dp = AndroidUtilities.dp(56.0f);
                k4Var.I0 = dp;
                m0Var.setHeight(dp);
                k4Var.f37266h0.h(true);
                return;
            }
            org.telegram.ui.b0 b0Var = null;
            b bVar = null;
            org.telegram.ui.b0 b0Var2 = null;
            if (num.intValue() == 2) {
                if (k4Var.f37278u0[0].f()) {
                    if (k4Var.f37278u0[0].getWebView() != null) {
                        str4 = k4Var.f37278u0[0].getWebView().getUrl();
                    } else {
                        return;
                    }
                } else {
                    TLRPC.WebPage webPage = k4Var.f37278u0[0].f38530c.E;
                    if (webPage != null) {
                        str4 = webPage.url;
                    } else {
                        return;
                    }
                }
                String u10 = org.telegram.ui.web.c1.u(str4);
                Activity activity2 = k4Var.L;
                if (AndroidUtilities.computePerceivedBrightness(k4Var.f37266h0.getBackgroundColor()) < 0.721f) {
                    bVar = new b();
                }
                k4Var.a0(new ir0(activity2, null, u10, false, u10, false, bVar));
            } else if (num.intValue() == 6) {
                if (k4Var.f37278u0[0].f()) {
                    if (k4Var.f37278u0[0].getWebView() != null) {
                        str3 = k4Var.f37278u0[0].getWebView().getUrl();
                        frameLayout = k4Var.f37278u0[0].f38531f;
                    } else {
                        return;
                    }
                } else {
                    org.telegram.ui.o3 o3Var = k4Var.f37278u0[0];
                    TLRPC.WebPage webPage2 = o3Var.f38530c.E;
                    if (webPage2 != null) {
                        str3 = webPage2.url;
                        frameLayout = o3Var;
                    } else {
                        return;
                    }
                }
                org.telegram.ui.k4.f(str3, k4Var.X, frameLayout, x3Var, null);
            } else if (num.intValue() == 7) {
                ?? obj2 = new Object();
                obj2.f20169a = true;
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != 0) {
                    if (x3Var != null) {
                        b0Var2 = new org.telegram.ui.b0(k4Var, 5);
                    }
                    U.showAsSheet(new org.telegram.ui.web.o(b0Var2, new org.telegram.ui.r(k4Var, 2)), obj2);
                }
            } else if (num.intValue() == 8) {
                ?? obj3 = new Object();
                obj3.f20169a = true;
                org.telegram.ui.ActionBar.m2 U2 = LaunchActivity.U();
                if (U2 != 0) {
                    if (x3Var != null) {
                        b0Var = new org.telegram.ui.b0(k4Var, 6);
                    }
                    U2.showAsSheet(new org.telegram.ui.web.h1(b0Var, new org.telegram.ui.r(k4Var, 3)), obj3);
                }
            } else if (num.intValue() == 9) {
                if (k4Var.f37278u0[0].getWebView() != null) {
                    k4Var.f37278u0[0].getWebView().goForward();
                }
            } else if (num.intValue() == 3) {
                if (k4Var.f37278u0[0].f()) {
                    if (k4Var.f37278u0[0].getWebView() != null) {
                        str = k4Var.f37278u0[0].getWebView().getUrl();
                        str2 = k4Var.f37278u0[0].getWebView().getOpenURL();
                        file = null;
                    } else {
                        return;
                    }
                } else {
                    TLRPC.WebPage webPage3 = k4Var.f37278u0[0].f38530c.E;
                    if (webPage3 != null) {
                        String str5 = webPage3.url;
                        TL_iv.Page page = webPage3.cached_page;
                        if (page != null) {
                            file = page.local;
                            str = str5;
                            str2 = null;
                        } else {
                            str = str5;
                            str2 = null;
                            file = null;
                        }
                    } else {
                        return;
                    }
                }
                Activity activity3 = k4Var.L;
                if (activity3 != null && !activity3.isFinishing()) {
                    if (file != null) {
                        AndroidUtilities.openForView(file, null, "text/markdown", k4Var.L, null, true);
                    } else if (str != null) {
                        String hostAuthority = AndroidUtilities.getHostAuthority(str2, true);
                        String hostAuthority2 = AndroidUtilities.getHostAuthority(str, true);
                        org.telegram.ui.y yVar = new org.telegram.ui.y(k4Var, str, 1);
                        org.telegram.ui.z zVar = new org.telegram.ui.z(k4Var, hostAuthority2, hostAuthority, 1);
                        if (k4Var.f37278u0[0].f() && MessagesController.getInstance(k4Var.X).isWebBrowserOpenInApp(hostAuthority2) && !MessagesController.getInstance(k4Var.X).isWebBrowserExceptionsLimitReached(true)) {
                            org.telegram.ui.Components.g5.n0(activity, null, str, true, new f0(4, zVar, yVar));
                        } else {
                            yVar.run();
                        }
                    }
                }
            } else if (num.intValue() == 4) {
                if (k4Var.f37278u0[0].f()) {
                    org.telegram.ui.ActionBar.m2 U3 = LaunchActivity.U();
                    if (U3 != 0) {
                        ?? obj4 = new Object();
                        obj4.f20169a = true;
                        U3.showAsSheet(new org.telegram.ui.web.z1(new org.telegram.ui.r(k4Var, 3)), obj4);
                        return;
                    }
                    return;
                }
                org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(1, (Context) k4Var.L, (org.telegram.ui.ActionBar.c6) null, false);
                e3Var.fixNavigationBar();
                e3Var.applyTopPadding = false;
                LinearLayout linearLayout = new LinearLayout(k4Var.L);
                linearLayout.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(k4Var.L, (org.telegram.ui.ActionBar.c6) null);
                m4Var.setText(LocaleController.getString(R.string.FontSize));
                linearLayout.addView(m4Var, w7.z5.t(-2, -2, 51, 3, 1, 3, 0));
                linearLayout.addView(new org.telegram.ui.g4(k4Var, k4Var.L), w7.z5.t(-1, -2, 51, 3, 0, 3, 0));
                org.telegram.ui.Cells.m4 m4Var2 = new org.telegram.ui.Cells.m4(k4Var.L, (org.telegram.ui.ActionBar.c6) null);
                m4Var2.setText(LocaleController.getString(R.string.FontType));
                linearLayout.addView(m4Var2, w7.z5.t(-2, -2, 51, 3, 4, 3, 2));
                int i16 = 0;
                for (int i17 = 2; i16 < i17; i17 = 2) {
                    Activity activity4 = k4Var.L;
                    org.telegram.ui.l0 l0Var = new org.telegram.ui.l0(activity4);
                    l0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19690i6, false), i17, -1));
                    RadioButton radioButton = new RadioButton(activity4);
                    l0Var.f37564b = radioButton;
                    radioButton.setSize(AndroidUtilities.dp(20.0f));
                    radioButton.b(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.D5, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.E5, false));
                    boolean z11 = LocaleController.isRTL;
                    if (z11) {
                        i10 = 5;
                    } else {
                        i10 = 3;
                    }
                    int i18 = i10 | 48;
                    if (z11) {
                        i11 = 0;
                    } else {
                        i11 = 22;
                    }
                    float f7 = i11;
                    if (z11) {
                        i12 = 22;
                    } else {
                        i12 = 0;
                    }
                    l0Var.addView(radioButton, w7.z5.a(22.0f, f7, 13.0f, i12, 0.0f, 22, i18));
                    TextView textView = new TextView(activity4);
                    sk.u(textView, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.G6, false), 1, 16.0f, 1);
                    textView.setMaxLines(1);
                    textView.setSingleLine(true);
                    if (LocaleController.isRTL) {
                        i13 = 5;
                    } else {
                        i13 = 3;
                    }
                    textView.setGravity(i13 | 16);
                    boolean z12 = LocaleController.isRTL;
                    if (z12) {
                        i14 = 5;
                    } else {
                        i14 = 3;
                    }
                    int i19 = i14 | 48;
                    int i20 = 17;
                    if (z12) {
                        i15 = 17;
                    } else {
                        i15 = 62;
                    }
                    float f10 = i15;
                    if (z12) {
                        i20 = 62;
                    }
                    l0Var.addView(textView, w7.z5.a(-1.0f, f10, 0.0f, i20, 0.0f, -1, i19));
                    l0VarArr[i16] = l0Var;
                    if (i16 != 0) {
                        if (i16 == 1) {
                            Typeface typeface = Typeface.SERIF;
                            textView.setText("Serif");
                            textView.setTypeface(typeface);
                            l0Var.setContentDescription("Serif");
                            l0Var.invalidate();
                        }
                    } else {
                        String string = LocaleController.getString(R.string.Default);
                        Typeface typeface2 = Typeface.DEFAULT;
                        textView.setText(string);
                        textView.setTypeface(typeface2);
                        l0Var.setContentDescription(string);
                        l0Var.invalidate();
                    }
                    org.telegram.ui.l0 l0Var2 = l0VarArr[i16];
                    if (i16 == k4Var.f42174a) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ((RadioButton) l0Var2.f37564b).a(z10, false);
                    l0VarArr[i16].setTag(Integer.valueOf(i16));
                    l0VarArr[i16].setOnClickListener(new org.telegram.ui.s(k4Var, 4));
                    linearLayout.addView(l0VarArr[i16], w7.z5.n(-1, 50));
                    i16++;
                }
                e3Var.customView = linearLayout;
                k4Var.I = e3Var;
                k4Var.a0(e3Var);
            } else if (num.intValue() == 5) {
                if (k4Var.f37278u0[0].f() && k4Var.f37278u0[0].getWebView() != null) {
                    k4Var.f37278u0[0].getWebView().reload();
                }
            } else if (num.intValue() == 10 && (g2Var = k4Var.f37278u0[0].f38537y) != null && g2Var.b() != null) {
                k4Var.h(g2Var.b(), null, 1);
            }
        }
    }

    @Override
    public final void run(java.lang.Object r19) {
        throw new UnsupportedOperationException("Method not decompiled: bi.v2.run(java.lang.Object):void");
    }
}
