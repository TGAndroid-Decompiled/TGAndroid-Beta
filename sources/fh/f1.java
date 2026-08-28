package fh;

import android.app.Activity;
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
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.rp0;
import org.telegram.ui.LaunchActivity;
public final class f1 implements Utilities.Callback {
    public final int f6435a;
    public final Object f6436b;
    public final Object f6437c;

    public f1(int i9, Object obj, Object obj2) {
        this.f6435a = i9;
        this.f6436b = obj;
        this.f6437c = obj2;
    }

    private final void a(Object obj) {
        org.telegram.ui.web.b2 b2Var;
        int i9;
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
        FrameLayout frameLayout;
        String str4;
        org.telegram.ui.l4 l4Var = (org.telegram.ui.l4) this.f6436b;
        Activity activity = (Activity) this.f6437c;
        Integer num = (Integer) obj;
        org.telegram.ui.y3 y3Var = l4Var.G;
        org.telegram.ui.m0[] m0VarArr = l4Var.O0;
        if ((!l4Var.f40026q0[0].c() || l4Var.f40026q0[0].f41321c.A != null) && l4Var.H != null) {
            if (num.intValue() == 1) {
                org.telegram.ui.n0 n0Var = l4Var.f40014d0;
                int dp = AndroidUtilities.dp(56.0f);
                l4Var.E0 = dp;
                n0Var.setHeight(dp);
                l4Var.f40014d0.h(true);
                return;
            }
            org.telegram.ui.c0 c0Var = null;
            ih.b bVar = null;
            org.telegram.ui.c0 c0Var2 = null;
            if (num.intValue() == 2) {
                if (l4Var.f40026q0[0].f()) {
                    if (l4Var.f40026q0[0].getWebView() != null) {
                        str4 = l4Var.f40026q0[0].getWebView().getUrl();
                    } else {
                        return;
                    }
                } else {
                    TLRPC.WebPage webPage = l4Var.f40026q0[0].f41321c.A;
                    if (webPage != null) {
                        str4 = webPage.url;
                    } else {
                        return;
                    }
                }
                String s10 = org.telegram.ui.web.y0.s(str4);
                Activity activity2 = l4Var.H;
                if (AndroidUtilities.computePerceivedBrightness(l4Var.f40014d0.getBackgroundColor()) < 0.721f) {
                    bVar = new ih.b();
                }
                l4Var.a0(new rp0(activity2, null, s10, false, s10, false, bVar));
            } else if (num.intValue() == 6) {
                if (l4Var.f40026q0[0].f()) {
                    if (l4Var.f40026q0[0].getWebView() != null) {
                        str3 = l4Var.f40026q0[0].getWebView().getUrl();
                        frameLayout = l4Var.f40026q0[0].f41323f;
                    } else {
                        return;
                    }
                } else {
                    org.telegram.ui.p3 p3Var = l4Var.f40026q0[0];
                    TLRPC.WebPage webPage2 = p3Var.f41321c.A;
                    if (webPage2 != null) {
                        str3 = webPage2.url;
                        frameLayout = p3Var;
                    } else {
                        return;
                    }
                }
                org.telegram.ui.l4.f(str3, l4Var.T, frameLayout, y3Var, null);
            } else if (num.intValue() == 7) {
                ?? obj2 = new Object();
                obj2.f23653a = true;
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != 0) {
                    if (y3Var != null) {
                        c0Var2 = new org.telegram.ui.c0(l4Var, 5);
                    }
                    U.showAsSheet(new org.telegram.ui.web.o(c0Var2, new org.telegram.ui.r(l4Var, 2)), obj2);
                }
            } else if (num.intValue() == 8) {
                ?? obj3 = new Object();
                obj3.f23653a = true;
                org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                if (U2 != 0) {
                    if (y3Var != null) {
                        c0Var = new org.telegram.ui.c0(l4Var, 6);
                    }
                    U2.showAsSheet(new org.telegram.ui.web.c1(c0Var, new org.telegram.ui.r(l4Var, 3)), obj3);
                }
            } else if (num.intValue() == 9) {
                if (l4Var.f40026q0[0].getWebView() != null) {
                    l4Var.f40026q0[0].getWebView().goForward();
                }
            } else if (num.intValue() == 3) {
                if (l4Var.f40026q0[0].f()) {
                    if (l4Var.f40026q0[0].getWebView() != null) {
                        str = l4Var.f40026q0[0].getWebView().getUrl();
                        str2 = l4Var.f40026q0[0].getWebView().getOpenURL();
                        file = null;
                    } else {
                        return;
                    }
                } else {
                    TLRPC.WebPage webPage3 = l4Var.f40026q0[0].f41321c.A;
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
                Activity activity3 = l4Var.H;
                if (activity3 != null && !activity3.isFinishing()) {
                    if (file != null) {
                        AndroidUtilities.openForView(file, null, "text/markdown", l4Var.H, null, true);
                    } else if (str != null) {
                        String hostAuthority = AndroidUtilities.getHostAuthority(str2, true);
                        String hostAuthority2 = AndroidUtilities.getHostAuthority(str, true);
                        org.telegram.ui.z zVar = new org.telegram.ui.z(l4Var, str, 1);
                        org.telegram.ui.a0 a0Var = new org.telegram.ui.a0(l4Var, hostAuthority2, hostAuthority, 1);
                        if (l4Var.f40026q0[0].f() && MessagesController.getInstance(l4Var.T).isWebBrowserOpenInApp(hostAuthority2) && !MessagesController.getInstance(l4Var.T).isWebBrowserExceptionsLimitReached(true)) {
                            org.telegram.ui.Components.y4.o0(activity, null, str, true, new bg.y0(10, a0Var, zVar));
                        } else {
                            zVar.run();
                        }
                    }
                }
            } else if (num.intValue() == 4) {
                if (l4Var.f40026q0[0].f()) {
                    org.telegram.ui.ActionBar.o2 U3 = LaunchActivity.U();
                    if (U3 != 0) {
                        ?? obj4 = new Object();
                        obj4.f23653a = true;
                        U3.showAsSheet(new org.telegram.ui.web.u1(new org.telegram.ui.r(l4Var, 3)), obj4);
                        return;
                    }
                    return;
                }
                org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(l4Var.H, null, false, false);
                f3Var.fixNavigationBar();
                f3Var.applyTopPadding = false;
                LinearLayout linearLayout = new LinearLayout(l4Var.H);
                linearLayout.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(l4Var.H, (org.telegram.ui.ActionBar.b6) null);
                m4Var.setText(LocaleController.getString(R.string.FontSize));
                linearLayout.addView(m4Var, g7.e6.t(-2, -2, 51, 3, 1, 3, 0));
                linearLayout.addView(new org.telegram.ui.h4(l4Var, l4Var.H), g7.e6.t(-1, -2, 51, 3, 0, 3, 0));
                org.telegram.ui.Cells.m4 m4Var2 = new org.telegram.ui.Cells.m4(l4Var.H, (org.telegram.ui.ActionBar.b6) null);
                m4Var2.setText(LocaleController.getString(R.string.FontType));
                linearLayout.addView(m4Var2, g7.e6.t(-2, -2, 51, 3, 4, 3, 2));
                int i15 = 0;
                for (int i16 = 2; i15 < i16; i16 = 2) {
                    Activity activity4 = l4Var.H;
                    org.telegram.ui.m0 m0Var = new org.telegram.ui.m0(activity4);
                    m0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23092i6, false), i16, -1));
                    RadioButton radioButton = new RadioButton(activity4);
                    m0Var.f40272b = radioButton;
                    radioButton.setSize(AndroidUtilities.dp(20.0f));
                    radioButton.b(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.D5, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.E5, false));
                    boolean z11 = LocaleController.isRTL;
                    if (z11) {
                        i9 = 5;
                    } else {
                        i9 = 3;
                    }
                    int i17 = i9 | 48;
                    if (z11) {
                        i10 = 0;
                    } else {
                        i10 = 22;
                    }
                    float f10 = i10;
                    if (z11) {
                        i11 = 22;
                    } else {
                        i11 = 0;
                    }
                    m0Var.addView(radioButton, g7.e6.d(22, 22.0f, i17, f10, 13.0f, i11, 0.0f));
                    TextView textView = new TextView(activity4);
                    ll.s(textView, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false), 1, 16.0f, 1);
                    textView.setMaxLines(1);
                    textView.setSingleLine(true);
                    if (LocaleController.isRTL) {
                        i12 = 5;
                    } else {
                        i12 = 3;
                    }
                    textView.setGravity(i12 | 16);
                    boolean z12 = LocaleController.isRTL;
                    if (z12) {
                        i13 = 5;
                    } else {
                        i13 = 3;
                    }
                    int i18 = i13 | 48;
                    int i19 = 17;
                    if (z12) {
                        i14 = 17;
                    } else {
                        i14 = 62;
                    }
                    float f11 = i14;
                    if (z12) {
                        i19 = 62;
                    }
                    m0Var.addView(textView, g7.e6.d(-1, -1.0f, i18, f11, 0.0f, i19, 0.0f));
                    m0VarArr[i15] = m0Var;
                    if (i15 != 0) {
                        if (i15 == 1) {
                            Typeface typeface = Typeface.SERIF;
                            textView.setText("Serif");
                            textView.setTypeface(typeface);
                            m0Var.setContentDescription("Serif");
                            m0Var.invalidate();
                        }
                    } else {
                        String string = LocaleController.getString(R.string.Default);
                        Typeface typeface2 = Typeface.DEFAULT;
                        textView.setText(string);
                        textView.setTypeface(typeface2);
                        m0Var.setContentDescription(string);
                        m0Var.invalidate();
                    }
                    org.telegram.ui.m0 m0Var2 = m0VarArr[i15];
                    if (i15 == l4Var.f36373a) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ((RadioButton) m0Var2.f40272b).a(z10, false);
                    m0VarArr[i15].setTag(Integer.valueOf(i15));
                    m0VarArr[i15].setOnClickListener(new org.telegram.ui.s(l4Var, 4));
                    linearLayout.addView(m0VarArr[i15], g7.e6.n(-1, 50));
                    i15++;
                }
                f3Var.customView = linearLayout;
                l4Var.E = f3Var;
                l4Var.a0(f3Var);
            } else if (num.intValue() == 5) {
                if (l4Var.f40026q0[0].f() && l4Var.f40026q0[0].getWebView() != null) {
                    l4Var.f40026q0[0].getWebView().reload();
                }
            } else if (num.intValue() == 10 && (b2Var = l4Var.f40026q0[0].f41329y) != null && b2Var.b() != null) {
                l4Var.h(b2Var.b(), null, 1);
            }
        }
    }

    @Override
    public final void run(java.lang.Object r21) {
        throw new UnsupportedOperationException("Method not decompiled: fh.f1.run(java.lang.Object):void");
    }
}
