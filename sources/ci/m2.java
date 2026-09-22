package ci;

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
import org.telegram.messenger.vl;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.hq0;
import org.telegram.ui.LaunchActivity;
public final class m2 implements Utilities.Callback {
    public final int f5031a;
    public final Object f5032b;
    public final Object f5033c;

    public m2(int i10, Object obj, Object obj2) {
        this.f5031a = i10;
        this.f5032b = obj;
        this.f5033c = obj2;
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
        org.telegram.ui.h4 h4Var = (org.telegram.ui.h4) this.f5032b;
        Activity activity = (Activity) this.f5033c;
        Integer num = (Integer) obj;
        org.telegram.ui.u3 u3Var = h4Var.K;
        org.telegram.ui.j0[] j0VarArr = h4Var.S0;
        if ((!h4Var.f34090u0[0].c() || h4Var.f34090u0[0].f35308c.E != null) && h4Var.L != null) {
            if (num.intValue() == 1) {
                org.telegram.ui.k0 k0Var = h4Var.f34078h0;
                int dp = AndroidUtilities.dp(56.0f);
                h4Var.I0 = dp;
                k0Var.setHeight(dp);
                h4Var.f34078h0.h(true);
                return;
            }
            org.telegram.ui.a0 a0Var = null;
            ai.d dVar = null;
            org.telegram.ui.a0 a0Var2 = null;
            if (num.intValue() == 2) {
                if (h4Var.f34090u0[0].f()) {
                    if (h4Var.f34090u0[0].getWebView() != null) {
                        str4 = h4Var.f34090u0[0].getWebView().getUrl();
                    } else {
                        return;
                    }
                } else {
                    TLRPC.WebPage webPage = h4Var.f34090u0[0].f35308c.E;
                    if (webPage != null) {
                        str4 = webPage.url;
                    } else {
                        return;
                    }
                }
                String v = org.telegram.ui.web.d1.v(str4);
                Activity activity2 = h4Var.L;
                if (AndroidUtilities.computePerceivedBrightness(h4Var.f34078h0.getBackgroundColor()) < 0.721f) {
                    dVar = new ai.d();
                }
                h4Var.a0(new hq0(activity2, null, v, false, v, false, dVar));
            } else if (num.intValue() == 6) {
                if (h4Var.f34090u0[0].f()) {
                    if (h4Var.f34090u0[0].getWebView() != null) {
                        str3 = h4Var.f34090u0[0].getWebView().getUrl();
                        frameLayout = h4Var.f34090u0[0].f35309f;
                    } else {
                        return;
                    }
                } else {
                    org.telegram.ui.l3 l3Var = h4Var.f34090u0[0];
                    TLRPC.WebPage webPage2 = l3Var.f35308c.E;
                    if (webPage2 != null) {
                        str3 = webPage2.url;
                        frameLayout = l3Var;
                    } else {
                        return;
                    }
                }
                org.telegram.ui.h4.f(str3, h4Var.X, frameLayout, u3Var, null);
            } else if (num.intValue() == 7) {
                ?? obj2 = new Object();
                obj2.f19364a = true;
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != 0) {
                    if (u3Var != null) {
                        a0Var2 = new org.telegram.ui.a0(h4Var, 5);
                    }
                    U.showAsSheet(new org.telegram.ui.web.p(a0Var2, new org.telegram.ui.r(h4Var, 2)), obj2);
                }
            } else if (num.intValue() == 8) {
                ?? obj3 = new Object();
                obj3.f19364a = true;
                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                if (U2 != 0) {
                    if (u3Var != null) {
                        a0Var = new org.telegram.ui.a0(h4Var, 6);
                    }
                    U2.showAsSheet(new org.telegram.ui.web.h1(a0Var, new org.telegram.ui.r(h4Var, 3)), obj3);
                }
            } else if (num.intValue() == 9) {
                if (h4Var.f34090u0[0].getWebView() != null) {
                    h4Var.f34090u0[0].getWebView().goForward();
                }
            } else if (num.intValue() == 3) {
                if (h4Var.f34090u0[0].f()) {
                    if (h4Var.f34090u0[0].getWebView() != null) {
                        str = h4Var.f34090u0[0].getWebView().getUrl();
                        str2 = h4Var.f34090u0[0].getWebView().getOpenURL();
                        file = null;
                    } else {
                        return;
                    }
                } else {
                    TLRPC.WebPage webPage3 = h4Var.f34090u0[0].f35308c.E;
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
                Activity activity3 = h4Var.L;
                if (activity3 != null && !activity3.isFinishing()) {
                    if (file != null) {
                        AndroidUtilities.openForView(file, null, "text/markdown", h4Var.L, null, true);
                    } else if (str != null) {
                        String hostAuthority = AndroidUtilities.getHostAuthority(str2, true);
                        String hostAuthority2 = AndroidUtilities.getHostAuthority(str, true);
                        org.telegram.ui.x xVar = new org.telegram.ui.x(h4Var, str, 1);
                        org.telegram.ui.y yVar = new org.telegram.ui.y(h4Var, hostAuthority2, hostAuthority, 1);
                        if (h4Var.f34090u0[0].f() && MessagesController.getInstance(h4Var.X).isWebBrowserOpenInApp(hostAuthority2) && !MessagesController.getInstance(h4Var.X).isWebBrowserExceptionsLimitReached(true)) {
                            org.telegram.ui.Components.c5.o0(activity, null, str, true, new ai.m0(4, yVar, xVar));
                        } else {
                            xVar.run();
                        }
                    }
                }
            } else if (num.intValue() == 4) {
                if (h4Var.f34090u0[0].f()) {
                    org.telegram.ui.ActionBar.n2 U3 = LaunchActivity.U();
                    if (U3 != 0) {
                        ?? obj4 = new Object();
                        obj4.f19364a = true;
                        U3.showAsSheet(new org.telegram.ui.web.z1(new org.telegram.ui.r(h4Var, 3)), obj4);
                        return;
                    }
                    return;
                }
                org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) h4Var.L, (org.telegram.ui.ActionBar.e6) null, false);
                f3Var.fixNavigationBar();
                f3Var.applyTopPadding = false;
                LinearLayout linearLayout = new LinearLayout(h4Var.L);
                linearLayout.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(h4Var.L, (org.telegram.ui.ActionBar.e6) null);
                m4Var.setText(LocaleController.getString(R.string.FontSize));
                linearLayout.addView(m4Var, w7.x5.t(-2, -2, 51, 3, 1, 3, 0));
                linearLayout.addView(new org.telegram.ui.d4(h4Var, h4Var.L), w7.x5.t(-1, -2, 51, 3, 0, 3, 0));
                org.telegram.ui.Cells.m4 m4Var2 = new org.telegram.ui.Cells.m4(h4Var.L, (org.telegram.ui.ActionBar.e6) null);
                m4Var2.setText(LocaleController.getString(R.string.FontType));
                linearLayout.addView(m4Var2, w7.x5.t(-2, -2, 51, 3, 4, 3, 2));
                int i16 = 0;
                for (int i17 = 2; i16 < i17; i17 = 2) {
                    Activity activity4 = h4Var.L;
                    org.telegram.ui.j0 j0Var = new org.telegram.ui.j0(activity4);
                    j0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.f0(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18923i6, false), i17, -1));
                    RadioButton radioButton = new RadioButton(activity4);
                    j0Var.f34740b = radioButton;
                    radioButton.setSize(AndroidUtilities.dp(20.0f));
                    radioButton.b(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.D5, false), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.E5, false));
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
                    j0Var.addView(radioButton, w7.x5.d(22, 22.0f, i18, f7, 13.0f, i12, 0.0f));
                    TextView textView = new TextView(activity4);
                    vl.s(textView, org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.G6, false), 1, 16.0f, 1);
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
                    j0Var.addView(textView, w7.x5.d(-1, -1.0f, i19, f10, 0.0f, i20, 0.0f));
                    j0VarArr[i16] = j0Var;
                    if (i16 != 0) {
                        if (i16 == 1) {
                            Typeface typeface = Typeface.SERIF;
                            textView.setText("Serif");
                            textView.setTypeface(typeface);
                            j0Var.setContentDescription("Serif");
                            j0Var.invalidate();
                        }
                    } else {
                        String string = LocaleController.getString(R.string.Default);
                        Typeface typeface2 = Typeface.DEFAULT;
                        textView.setText(string);
                        textView.setTypeface(typeface2);
                        j0Var.setContentDescription(string);
                        j0Var.invalidate();
                    }
                    org.telegram.ui.j0 j0Var2 = j0VarArr[i16];
                    if (i16 == h4Var.f37825a) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ((RadioButton) j0Var2.f34740b).a(z10, false);
                    j0VarArr[i16].setTag(Integer.valueOf(i16));
                    j0VarArr[i16].setOnClickListener(new org.telegram.ui.s(h4Var, 4));
                    linearLayout.addView(j0VarArr[i16], w7.x5.n(-1, 50));
                    i16++;
                }
                f3Var.customView = linearLayout;
                h4Var.I = f3Var;
                h4Var.a0(f3Var);
            } else if (num.intValue() == 5) {
                if (h4Var.f34090u0[0].f() && h4Var.f34090u0[0].getWebView() != null) {
                    h4Var.f34090u0[0].getWebView().reload();
                }
            } else if (num.intValue() == 10 && (g2Var = h4Var.f34090u0[0].f35315y) != null && g2Var.b() != null) {
                h4Var.h(g2Var.b(), null, 1);
            }
        }
    }

    @Override
    public final void run(java.lang.Object r26) {
        throw new UnsupportedOperationException("Method not decompiled: ci.m2.run(java.lang.Object):void");
    }
}
