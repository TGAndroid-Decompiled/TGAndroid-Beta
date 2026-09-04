package di;

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
import org.telegram.messenger.wl;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.hq0;
import org.telegram.ui.LaunchActivity;
public final class m2 implements Utilities.Callback {
    public final int f7633a;
    public final Object f7634b;
    public final Object f7635c;

    public m2(int i10, Object obj, Object obj2) {
        this.f7633a = i10;
        this.f7634b = obj;
        this.f7635c = obj2;
    }

    private final void a(Object obj) {
        org.telegram.ui.web.h2 h2Var;
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
        org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) this.f7634b;
        Activity activity = (Activity) this.f7635c;
        Integer num = (Integer) obj;
        org.telegram.ui.v3 v3Var = i4Var.K;
        org.telegram.ui.j0[] j0VarArr = i4Var.S0;
        if ((!i4Var.f37232u0[0].c() || i4Var.f37232u0[0].f38552c.E != null) && i4Var.L != null) {
            if (num.intValue() == 1) {
                org.telegram.ui.k0 k0Var = i4Var.f37220h0;
                int dp = AndroidUtilities.dp(56.0f);
                i4Var.I0 = dp;
                k0Var.setHeight(dp);
                i4Var.f37220h0.h(true);
                return;
            }
            org.telegram.ui.a0 a0Var = null;
            bi.b bVar = null;
            org.telegram.ui.a0 a0Var2 = null;
            if (num.intValue() == 2) {
                if (i4Var.f37232u0[0].f()) {
                    if (i4Var.f37232u0[0].getWebView() != null) {
                        str4 = i4Var.f37232u0[0].getWebView().getUrl();
                    } else {
                        return;
                    }
                } else {
                    TLRPC.WebPage webPage = i4Var.f37232u0[0].f38552c.E;
                    if (webPage != null) {
                        str4 = webPage.url;
                    } else {
                        return;
                    }
                }
                String v = org.telegram.ui.web.d1.v(str4);
                Activity activity2 = i4Var.L;
                if (AndroidUtilities.computePerceivedBrightness(i4Var.f37220h0.getBackgroundColor()) < 0.721f) {
                    bVar = new bi.b();
                }
                i4Var.a0(new hq0(activity2, null, v, false, v, false, bVar));
            } else if (num.intValue() == 6) {
                if (i4Var.f37232u0[0].f()) {
                    if (i4Var.f37232u0[0].getWebView() != null) {
                        str3 = i4Var.f37232u0[0].getWebView().getUrl();
                        frameLayout = i4Var.f37232u0[0].f38554f;
                    } else {
                        return;
                    }
                } else {
                    org.telegram.ui.m3 m3Var = i4Var.f37232u0[0];
                    TLRPC.WebPage webPage2 = m3Var.f38552c.E;
                    if (webPage2 != null) {
                        str3 = webPage2.url;
                        frameLayout = m3Var;
                    } else {
                        return;
                    }
                }
                org.telegram.ui.i4.f(str3, i4Var.X, frameLayout, v3Var, null);
            } else if (num.intValue() == 7) {
                ?? obj2 = new Object();
                obj2.f21142a = true;
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != 0) {
                    if (v3Var != null) {
                        a0Var2 = new org.telegram.ui.a0(i4Var, 5);
                    }
                    U.showAsSheet(new org.telegram.ui.web.q(a0Var2, new org.telegram.ui.r(i4Var, 2)), obj2);
                }
            } else if (num.intValue() == 8) {
                ?? obj3 = new Object();
                obj3.f21142a = true;
                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                if (U2 != 0) {
                    if (v3Var != null) {
                        a0Var = new org.telegram.ui.a0(i4Var, 6);
                    }
                    U2.showAsSheet(new org.telegram.ui.web.i1(a0Var, new org.telegram.ui.r(i4Var, 3)), obj3);
                }
            } else if (num.intValue() == 9) {
                if (i4Var.f37232u0[0].getWebView() != null) {
                    i4Var.f37232u0[0].getWebView().goForward();
                }
            } else if (num.intValue() == 3) {
                if (i4Var.f37232u0[0].f()) {
                    if (i4Var.f37232u0[0].getWebView() != null) {
                        str = i4Var.f37232u0[0].getWebView().getUrl();
                        str2 = i4Var.f37232u0[0].getWebView().getOpenURL();
                        file = null;
                    } else {
                        return;
                    }
                } else {
                    TLRPC.WebPage webPage3 = i4Var.f37232u0[0].f38552c.E;
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
                Activity activity3 = i4Var.L;
                if (activity3 != null && !activity3.isFinishing()) {
                    if (file != null) {
                        AndroidUtilities.openForView(file, null, "text/markdown", i4Var.L, null, true);
                    } else if (str != null) {
                        String hostAuthority = AndroidUtilities.getHostAuthority(str2, true);
                        String hostAuthority2 = AndroidUtilities.getHostAuthority(str, true);
                        org.telegram.ui.x xVar = new org.telegram.ui.x(i4Var, str, 1);
                        org.telegram.ui.y yVar = new org.telegram.ui.y(i4Var, hostAuthority2, hostAuthority, 1);
                        if (i4Var.f37232u0[0].f() && MessagesController.getInstance(i4Var.X).isWebBrowserOpenInApp(hostAuthority2) && !MessagesController.getInstance(i4Var.X).isWebBrowserExceptionsLimitReached(true)) {
                            org.telegram.ui.Components.e5.o0(activity, null, str, true, new bi.f0(4, yVar, xVar));
                        } else {
                            xVar.run();
                        }
                    }
                }
            } else if (num.intValue() == 4) {
                if (i4Var.f37232u0[0].f()) {
                    org.telegram.ui.ActionBar.n2 U3 = LaunchActivity.U();
                    if (U3 != 0) {
                        ?? obj4 = new Object();
                        obj4.f21142a = true;
                        U3.showAsSheet(new org.telegram.ui.web.a2(new org.telegram.ui.r(i4Var, 3)), obj4);
                        return;
                    }
                    return;
                }
                org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) i4Var.L, (org.telegram.ui.ActionBar.f6) null, false);
                f3Var.fixNavigationBar();
                f3Var.applyTopPadding = false;
                LinearLayout linearLayout = new LinearLayout(i4Var.L);
                linearLayout.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(i4Var.L, (org.telegram.ui.ActionBar.f6) null);
                l4Var.setText(LocaleController.getString(R.string.FontSize));
                linearLayout.addView(l4Var, w7.x5.t(-2, -2, 51, 3, 1, 3, 0));
                linearLayout.addView(new org.telegram.ui.e4(i4Var, i4Var.L), w7.x5.t(-1, -2, 51, 3, 0, 3, 0));
                org.telegram.ui.Cells.l4 l4Var2 = new org.telegram.ui.Cells.l4(i4Var.L, (org.telegram.ui.ActionBar.f6) null);
                l4Var2.setText(LocaleController.getString(R.string.FontType));
                linearLayout.addView(l4Var2, w7.x5.t(-2, -2, 51, 3, 4, 3, 2));
                int i16 = 0;
                for (int i17 = 2; i16 < i17; i17 = 2) {
                    Activity activity4 = i4Var.L;
                    org.telegram.ui.j0 j0Var = new org.telegram.ui.j0(activity4);
                    j0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20753i6, false), i17, -1));
                    RadioButton radioButton = new RadioButton(activity4);
                    j0Var.f37461b = radioButton;
                    radioButton.setSize(AndroidUtilities.dp(20.0f));
                    radioButton.b(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.D5, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E5, false));
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
                    wl.r(textView, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false), 1, 16.0f, 1);
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
                    if (i16 == i4Var.f41433a) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ((RadioButton) j0Var2.f37461b).a(z10, false);
                    j0VarArr[i16].setTag(Integer.valueOf(i16));
                    j0VarArr[i16].setOnClickListener(new org.telegram.ui.s(i4Var, 4));
                    linearLayout.addView(j0VarArr[i16], w7.x5.n(-1, 50));
                    i16++;
                }
                f3Var.customView = linearLayout;
                i4Var.I = f3Var;
                i4Var.a0(f3Var);
            } else if (num.intValue() == 5) {
                if (i4Var.f37232u0[0].f() && i4Var.f37232u0[0].getWebView() != null) {
                    i4Var.f37232u0[0].getWebView().reload();
                }
            } else if (num.intValue() == 10 && (h2Var = i4Var.f37232u0[0].f38560y) != null && h2Var.b() != null) {
                i4Var.h(h2Var.b(), null, 1);
            }
        }
    }

    @Override
    public final void run(java.lang.Object r26) {
        throw new UnsupportedOperationException("Method not decompiled: di.m2.run(java.lang.Object):void");
    }
}
