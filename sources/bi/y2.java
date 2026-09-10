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
import org.telegram.messenger.em;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.sq0;
import org.telegram.ui.LaunchActivity;
public final class y2 implements Utilities.Callback {
    public final int f3962a;
    public final Object f3963b;
    public final Object f3964c;

    public y2(int i10, Object obj, Object obj2) {
        this.f3962a = i10;
        this.f3963b = obj;
        this.f3964c = obj2;
    }

    private final void a(Object obj) {
        org.telegram.ui.web.i2 i2Var;
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
        org.telegram.ui.j4 j4Var = (org.telegram.ui.j4) this.f3963b;
        Activity activity = (Activity) this.f3964c;
        Integer num = (Integer) obj;
        org.telegram.ui.w3 w3Var = j4Var.K;
        org.telegram.ui.k0[] k0VarArr = j4Var.S0;
        if ((!j4Var.f33920u0[0].c() || j4Var.f33920u0[0].f35103c.E != null) && j4Var.L != null) {
            if (num.intValue() == 1) {
                org.telegram.ui.l0 l0Var = j4Var.f33908h0;
                int dp = AndroidUtilities.dp(56.0f);
                j4Var.I0 = dp;
                l0Var.setHeight(dp);
                j4Var.f33908h0.h(true);
                return;
            }
            org.telegram.ui.b0 b0Var = null;
            zh.b bVar = null;
            org.telegram.ui.b0 b0Var2 = null;
            if (num.intValue() == 2) {
                if (j4Var.f33920u0[0].f()) {
                    if (j4Var.f33920u0[0].getWebView() != null) {
                        str4 = j4Var.f33920u0[0].getWebView().getUrl();
                    } else {
                        return;
                    }
                } else {
                    TLRPC.WebPage webPage = j4Var.f33920u0[0].f35103c.E;
                    if (webPage != null) {
                        str4 = webPage.url;
                    } else {
                        return;
                    }
                }
                String v = org.telegram.ui.web.c1.v(str4);
                Activity activity2 = j4Var.L;
                if (AndroidUtilities.computePerceivedBrightness(j4Var.f33908h0.getBackgroundColor()) < 0.721f) {
                    bVar = new zh.b();
                }
                j4Var.a0(new sq0(activity2, null, v, false, v, false, bVar));
            } else if (num.intValue() == 6) {
                if (j4Var.f33920u0[0].f()) {
                    if (j4Var.f33920u0[0].getWebView() != null) {
                        str3 = j4Var.f33920u0[0].getWebView().getUrl();
                        frameLayout = j4Var.f33920u0[0].f35104f;
                    } else {
                        return;
                    }
                } else {
                    org.telegram.ui.n3 n3Var = j4Var.f33920u0[0];
                    TLRPC.WebPage webPage2 = n3Var.f35103c.E;
                    if (webPage2 != null) {
                        str3 = webPage2.url;
                        frameLayout = n3Var;
                    } else {
                        return;
                    }
                }
                org.telegram.ui.j4.f(str3, j4Var.X, frameLayout, w3Var, null);
            } else if (num.intValue() == 7) {
                ?? obj2 = new Object();
                obj2.f18485a = true;
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != 0) {
                    if (w3Var != null) {
                        b0Var2 = new org.telegram.ui.b0(j4Var, 5);
                    }
                    U.showAsSheet(new org.telegram.ui.web.p(b0Var2, new org.telegram.ui.s(j4Var, 2)), obj2);
                }
            } else if (num.intValue() == 8) {
                ?? obj3 = new Object();
                obj3.f18485a = true;
                org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                if (U2 != 0) {
                    if (w3Var != null) {
                        b0Var = new org.telegram.ui.b0(j4Var, 6);
                    }
                    U2.showAsSheet(new org.telegram.ui.web.h1(b0Var, new org.telegram.ui.s(j4Var, 3)), obj3);
                }
            } else if (num.intValue() == 9) {
                if (j4Var.f33920u0[0].getWebView() != null) {
                    j4Var.f33920u0[0].getWebView().goForward();
                }
            } else if (num.intValue() == 3) {
                if (j4Var.f33920u0[0].f()) {
                    if (j4Var.f33920u0[0].getWebView() != null) {
                        str = j4Var.f33920u0[0].getWebView().getUrl();
                        str2 = j4Var.f33920u0[0].getWebView().getOpenURL();
                        file = null;
                    } else {
                        return;
                    }
                } else {
                    TLRPC.WebPage webPage3 = j4Var.f33920u0[0].f35103c.E;
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
                Activity activity3 = j4Var.L;
                if (activity3 != null && !activity3.isFinishing()) {
                    if (file != null) {
                        AndroidUtilities.openForView(file, null, "text/markdown", j4Var.L, null, true);
                    } else if (str != null) {
                        String hostAuthority = AndroidUtilities.getHostAuthority(str2, true);
                        String hostAuthority2 = AndroidUtilities.getHostAuthority(str, true);
                        org.telegram.ui.y yVar = new org.telegram.ui.y(j4Var, str, 1);
                        org.telegram.ui.z zVar = new org.telegram.ui.z(j4Var, hostAuthority2, hostAuthority, 1);
                        if (j4Var.f33920u0[0].f() && MessagesController.getInstance(j4Var.X).isWebBrowserOpenInApp(hostAuthority2) && !MessagesController.getInstance(j4Var.X).isWebBrowserExceptionsLimitReached(true)) {
                            org.telegram.ui.Components.d5.o0(activity, null, str, true, new k6(2, zVar, yVar));
                        } else {
                            yVar.run();
                        }
                    }
                }
            } else if (num.intValue() == 4) {
                if (j4Var.f33920u0[0].f()) {
                    org.telegram.ui.ActionBar.p2 U3 = LaunchActivity.U();
                    if (U3 != 0) {
                        ?? obj4 = new Object();
                        obj4.f18485a = true;
                        U3.showAsSheet(new org.telegram.ui.web.b2(new org.telegram.ui.s(j4Var, 3)), obj4);
                        return;
                    }
                    return;
                }
                org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, (Context) j4Var.L, (org.telegram.ui.ActionBar.f6) null, false);
                h3Var.fixNavigationBar();
                h3Var.applyTopPadding = false;
                LinearLayout linearLayout = new LinearLayout(j4Var.L);
                linearLayout.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(j4Var.L, (org.telegram.ui.ActionBar.f6) null);
                m4Var.setText(LocaleController.getString(R.string.FontSize));
                linearLayout.addView(m4Var, w7.a6.t(-2, -2, 51, 3, 1, 3, 0));
                linearLayout.addView(new org.telegram.ui.f4(j4Var, j4Var.L), w7.a6.t(-1, -2, 51, 3, 0, 3, 0));
                org.telegram.ui.Cells.m4 m4Var2 = new org.telegram.ui.Cells.m4(j4Var.L, (org.telegram.ui.ActionBar.f6) null);
                m4Var2.setText(LocaleController.getString(R.string.FontType));
                linearLayout.addView(m4Var2, w7.a6.t(-2, -2, 51, 3, 4, 3, 2));
                int i16 = 0;
                for (int i17 = 2; i16 < i17; i17 = 2) {
                    Activity activity4 = j4Var.L;
                    org.telegram.ui.k0 k0Var = new org.telegram.ui.k0(activity4);
                    k0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18017i6, false), i17, -1));
                    RadioButton radioButton = new RadioButton(activity4);
                    k0Var.f34181b = radioButton;
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
                    k0Var.addView(radioButton, w7.a6.d(22, 22.0f, i18, f7, 13.0f, i12, 0.0f));
                    TextView textView = new TextView(activity4);
                    em.r(textView, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false), 1, 16.0f, 1);
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
                    k0Var.addView(textView, w7.a6.d(-1, -1.0f, i19, f10, 0.0f, i20, 0.0f));
                    k0VarArr[i16] = k0Var;
                    if (i16 != 0) {
                        if (i16 == 1) {
                            Typeface typeface = Typeface.SERIF;
                            textView.setText("Serif");
                            textView.setTypeface(typeface);
                            k0Var.setContentDescription("Serif");
                            k0Var.invalidate();
                        }
                    } else {
                        String string = LocaleController.getString(R.string.Default);
                        Typeface typeface2 = Typeface.DEFAULT;
                        textView.setText(string);
                        textView.setTypeface(typeface2);
                        k0Var.setContentDescription(string);
                        k0Var.invalidate();
                    }
                    org.telegram.ui.k0 k0Var2 = k0VarArr[i16];
                    if (i16 == j4Var.f36854a) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ((RadioButton) k0Var2.f34181b).a(z10, false);
                    k0VarArr[i16].setTag(Integer.valueOf(i16));
                    k0VarArr[i16].setOnClickListener(new org.telegram.ui.t(j4Var, 4));
                    linearLayout.addView(k0VarArr[i16], w7.a6.n(-1, 50));
                    i16++;
                }
                h3Var.customView = linearLayout;
                j4Var.I = h3Var;
                j4Var.a0(h3Var);
            } else if (num.intValue() == 5) {
                if (j4Var.f33920u0[0].f() && j4Var.f33920u0[0].getWebView() != null) {
                    j4Var.f33920u0[0].getWebView().reload();
                }
            } else if (num.intValue() == 10 && (i2Var = j4Var.f33920u0[0].f35110y) != null && i2Var.b() != null) {
                j4Var.h(i2Var.b(), null, 1);
            }
        }
    }

    @Override
    public final void run(java.lang.Object r26) {
        throw new UnsupportedOperationException("Method not decompiled: bi.y2.run(java.lang.Object):void");
    }
}
