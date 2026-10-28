package li;

import a8.ng;
import android.app.Activity;
import android.content.Context;
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
import java.io.File;
import java.net.URLEncoder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessageChatArguments;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.messenger.wh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.b7;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.fj;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.mf;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.of;
import org.telegram.ui.Components.pl;
import org.telegram.ui.Components.rl;
import org.telegram.ui.Components.sl;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.wv;
import org.telegram.ui.Components.xe;
import org.telegram.ui.Components.xv;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bd;
import org.telegram.ui.c31;
import org.telegram.ui.e7;
import org.telegram.ui.ed;
import org.telegram.ui.hn;
import org.telegram.ui.jj;
import org.telegram.ui.jk;
import org.telegram.ui.ke;
import org.telegram.ui.rc;
import org.telegram.ui.sc;
import org.telegram.ui.sm;
import org.telegram.ui.wn;
import org.telegram.ui.z7;
import org.telegram.ui.zn;
public final class s2 implements Utilities.Callback {
    public final int f17465a;
    public final Object f17466b;
    public final Object f17467c;

    public s2(int i10, Object obj, Object obj2) {
        this.f17465a = i10;
        this.f17466b = obj;
        this.f17467c = obj2;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        int i11;
        int i12;
        String userName;
        boolean z10;
        wn wnVar;
        jk jkVar;
        org.telegram.ui.web.f2 f2Var;
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
        FrameLayout frameLayout;
        String str4;
        int i19;
        MessageObject threadMessage;
        SendMessageChatArguments sendMessageChatArguments;
        TLRPC.User user;
        switch (this.f17465a) {
            case 0:
                v3 v3Var = (v3) this.f17466b;
                TL_iv.pageBlockMath pageblockmath = (TL_iv.pageBlockMath) this.f17467c;
                String str5 = (String) obj;
                v3Var.getClass();
                if (!TextUtils.equals(str5, pageblockmath.source)) {
                    f2 f2Var2 = v3Var.R3;
                    if (f2Var2 != null) {
                        f2Var2.d();
                    }
                    pageblockmath.source = str5;
                    v3Var.f32504g3.O(false);
                    f2 f2Var3 = v3Var.R3;
                    if (f2Var3 != null) {
                        f2Var3.h();
                    }
                    v3Var.f17556p3.onContentChanged();
                    return;
                }
                return;
            case 1:
                ((VoIPDebugToSend) this.f17466b).lambda$done$0((TL_phone.saveCallDebug) this.f17467c, (TLRPC.InputFile) obj);
                return;
            case 2:
                org.telegram.ui.ActionBar.s3 s3Var = (org.telegram.ui.ActionBar.s3) this.f17466b;
                org.telegram.ui.ActionBar.r3 r3Var = (org.telegram.ui.ActionBar.r3) this.f17467c;
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) obj;
                if (r2Var != null) {
                    boolean z12 = true;
                    if ((r2Var instanceof wn) && (jkVar = (wnVar = (wn) r2Var).Y) != null) {
                        jkVar.L();
                        wnVar.Y.j0(true, false, true);
                    }
                    if (r2Var.getContext() != null && r2Var.getParentActivity() != null) {
                        hi.m3 m3Var = new hi.m3(r2Var.getContext(), r2Var.getResourceProvider());
                        m3Var.f13115l0 = r2Var.getParentActivity();
                        if (r3Var != null && r3Var.f23005a != null) {
                            m3Var.F0 = true;
                            boolean z13 = r3Var.f23016o;
                            m3Var.W = z13;
                            if (z13) {
                                m3Var.w(r3Var.f23019r, false);
                            }
                            if (!r3Var.f23015n) {
                                int i20 = r3Var.f23017p;
                                if (i20 < 0) {
                                    i20 = y6.f23357d6;
                                }
                                i10 = y6.w0(i20, m3Var.F);
                            } else {
                                i10 = r3Var.f23018q;
                            }
                            m3Var.u(i10, r3Var.f23015n, false);
                            m3Var.z(r3Var.f23020s, false);
                            m3Var.G0 = r3Var.f23011j;
                            m3Var.H0 = r3Var.f23012k;
                            boolean z14 = r3Var.f23022u;
                            m3Var.f13131x0 = z14;
                            hi.e3 e3Var = m3Var.f13132y;
                            e3Var.setIsBackButtonVisible(z14);
                            m3Var.f13128w.setAllowSwipes(r3Var.f23013l);
                            ImageView backButton = m3Var.X.getBackButton();
                            if (m3Var.f13131x0) {
                                i11 = R.drawable.ic_ab_back;
                            } else {
                                i11 = R.drawable.ic_close_white;
                            }
                            AndroidUtilities.updateImageViewImageAnimated(backButton, i11);
                            BotFullscreenButtons botFullscreenButtons = m3Var.f13117n0;
                            if (botFullscreenButtons != null) {
                                botFullscreenButtons.setBack(m3Var.f13131x0, false);
                            }
                            m3Var.f13124s0 = r3Var.f23025y;
                            m3Var.A0 = Boolean.valueOf(r3Var.B);
                            m3Var.B0 = r3Var.C;
                            hi.f1 f1Var = r3Var.K;
                            m3Var.C0 = f1Var;
                            if (f1Var != null) {
                                hi.d1 d1Var = f1Var.f12977r;
                                SensorManager sensorManager = f1Var.f12963a;
                                if (f1Var.f12971l) {
                                    f1Var.f12971l = false;
                                    if (sensorManager != null) {
                                        Sensor sensor = f1Var.f12964b;
                                        if (sensor != null) {
                                            sensorManager.registerListener(f1Var.f12973n, sensor, hi.f1.a(f1Var.f12965c));
                                        }
                                        Sensor sensor2 = f1Var.d;
                                        if (sensor2 != null) {
                                            sensorManager.registerListener(f1Var.f12975p, sensor2, hi.f1.a(f1Var.e));
                                        }
                                        Sensor sensor3 = f1Var.f12967g;
                                        if (sensor3 != null) {
                                            sensorManager.registerListener(d1Var, sensor3, hi.f1.a(f1Var.h));
                                        }
                                        Sensor sensor4 = f1Var.f12966f;
                                        if (sensor4 != null) {
                                            sensorManager.registerListener(d1Var, sensor4, hi.f1.a(f1Var.h));
                                        }
                                        Sensor sensor5 = f1Var.f12968i;
                                        if (sensor5 != null) {
                                            sensorManager.registerListener(f1Var.f12979t, sensor5, hi.f1.a(f1Var.f12969j));
                                        }
                                    }
                                }
                            }
                            ng ngVar = r3Var.f23023w;
                            if (ngVar != null) {
                                hi.i3 i3Var = m3Var.m0;
                                int totalHeight = i3Var.getTotalHeight();
                                i3Var.e = ngVar;
                                hi.b0[] b0VarArr = i3Var.f12934f;
                                hi.d0.b(b0VarArr[0].f12878l, (hi.c0) ngVar.f640c, false);
                                hi.d0.b(b0VarArr[1].f12878l, (hi.c0) ngVar.d, false);
                                i3Var.invalidate();
                                if (totalHeight != i3Var.getTotalHeight() && i3Var.f12936r != null) {
                                    if (totalHeight < i3Var.getTotalHeight()) {
                                        AndroidUtilities.runOnUIThread(i3Var.f12936r, 200L);
                                    } else {
                                        i3Var.f12936r.run();
                                    }
                                }
                                int i21 = ngVar.f639b;
                                Paint paint = i3Var.f12931a;
                                i3Var.e.f639b = i21;
                                paint.setColor(i21);
                                i3Var.d.a(i21, true);
                            }
                            m3Var.y(r3Var.f23026z, false, r3Var.A);
                            hi.c5 c5Var = r3Var.f23005a;
                            if (c5Var != null) {
                                i12 = c5Var.f12914a;
                            } else {
                                i12 = UserConfig.selectedAccount;
                            }
                            m3Var.H = i12;
                            org.telegram.ui.web.x0 x0Var = r3Var.f23006b;
                            if (x0Var != null) {
                                x0Var.onResume();
                                e3Var.N(m3Var.H, r3Var.f23006b, r3Var.d, r3Var.f23008f, r3Var.e);
                                if (!r3Var.f23021t && !r3Var.f23006b.f44954b) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                String str6 = r3Var.f23024x;
                                e3Var.g("setState(" + z10 + ", " + str6 + ")");
                                e3Var.N = z10;
                                e3Var.f44667b = str6;
                                if (y6.I.q() != r3Var.D) {
                                    e3Var.z();
                                }
                            } else {
                                c5Var.f12927q = null;
                                c5Var.f12928r = 0L;
                            }
                            m3Var.t(r2Var, r3Var.f23005a);
                            m3Var.f13105c0 = r3Var.v;
                            if (r3Var.G) {
                                m3Var.W0 = true;
                                m3Var.i();
                                org.telegram.ui.c3 c3Var = m3Var.Y0;
                                if (m3Var.m()) {
                                    userName = m3Var.f13129w0.e;
                                } else {
                                    userName = UserObject.getUserName(MessagesController.getInstance(m3Var.H).getUser(Long.valueOf(m3Var.I)));
                                }
                                String str7 = r3Var.H;
                                m3Var.X0 = str7;
                                c3Var.a(userName, str7);
                                org.telegram.ui.c3 c3Var2 = m3Var.Y0;
                                Paint paint2 = m3Var.Q;
                                if (AndroidUtilities.computePerceivedBrightness(paint2.getColor()) > 0.721f) {
                                    z12 = false;
                                }
                                c3Var2.b(z12, false);
                                m3Var.Y0.setBackgroundColor(paint2.getColor());
                                m3Var.Y0.setVisibility(0);
                                m3Var.Y0.setAlpha(1.0f);
                            }
                            m3Var.p(r3Var.L);
                            s3Var.h(s3Var.f23080w, r3Var, false);
                            m3Var.show();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 3:
                org.telegram.ui.ActionBar.y3 y3Var = (org.telegram.ui.ActionBar.y3) this.f17467c;
                ((org.telegram.ui.ActionBar.r3) this.f17466b).f23014m = (Bitmap) obj;
                y3Var.mo36getWindowView().setDrawingFromOverlay(false);
                y3Var.release();
                return;
            case 4:
                org.telegram.ui.ActionBar.a4 a4Var = (org.telegram.ui.ActionBar.a4) this.f17467c;
                org.telegram.ui.ActionBar.b4 b4Var = ((org.telegram.ui.ActionBar.x3) this.f17466b).f23245p;
                if (((Boolean) obj).booleanValue()) {
                    a4Var.a(1.0f);
                    if (b4Var.f22431a.getTabs().isEmpty()) {
                        b4Var.a(false);
                        return;
                    }
                    return;
                }
                a4Var.a(0.0f);
                return;
            case 5:
                org.telegram.ui.j4 j4Var = (org.telegram.ui.j4) this.f17466b;
                Activity activity = (Activity) this.f17467c;
                Integer num = (Integer) obj;
                org.telegram.ui.v3 v3Var2 = j4Var.K;
                org.telegram.ui.k0[] k0VarArr = j4Var.T0;
                if ((!j4Var.f40414u0[0].c() || j4Var.f40414u0[0].f41313c.E != null) && j4Var.L != null) {
                    if (num.intValue() == 1) {
                        org.telegram.ui.l0 l0Var = j4Var.f40402h0;
                        int dp = AndroidUtilities.dp(56.0f);
                        j4Var.J0 = dp;
                        l0Var.setHeight(dp);
                        j4Var.f40402h0.h(true);
                        return;
                    }
                    org.telegram.ui.a0 a0Var = null;
                    di.b bVar = null;
                    org.telegram.ui.a0 a0Var2 = null;
                    if (num.intValue() == 2) {
                        if (j4Var.f40414u0[0].f()) {
                            if (j4Var.f40414u0[0].getWebView() != null) {
                                str4 = j4Var.f40414u0[0].getWebView().getUrl();
                            } else {
                                return;
                            }
                        } else {
                            TLRPC.WebPage webPage = j4Var.f40414u0[0].f41313c.E;
                            if (webPage != null) {
                                str4 = webPage.url;
                            } else {
                                return;
                            }
                        }
                        String u10 = org.telegram.ui.web.a1.u(str4);
                        Activity activity2 = j4Var.L;
                        if (AndroidUtilities.computePerceivedBrightness(j4Var.f40402h0.getBackgroundColor()) < 0.721f) {
                            bVar = new di.b();
                        }
                        j4Var.a0(new nr0(activity2, null, u10, false, u10, false, bVar));
                        return;
                    } else if (num.intValue() == 6) {
                        if (j4Var.f40414u0[0].f()) {
                            if (j4Var.f40414u0[0].getWebView() != null) {
                                str3 = j4Var.f40414u0[0].getWebView().getUrl();
                                frameLayout = j4Var.f40414u0[0].f41314f;
                            } else {
                                return;
                            }
                        } else {
                            org.telegram.ui.m3 m3Var2 = j4Var.f40414u0[0];
                            TLRPC.WebPage webPage2 = m3Var2.f41313c.E;
                            if (webPage2 != null) {
                                str3 = webPage2.url;
                                frameLayout = m3Var2;
                            } else {
                                return;
                            }
                        }
                        org.telegram.ui.j4.f(str3, j4Var.X, frameLayout, v3Var2, null);
                        return;
                    } else if (num.intValue() == 7) {
                        ?? obj2 = new Object();
                        obj2.f22929a = true;
                        org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                        if (U != 0) {
                            if (v3Var2 != null) {
                                a0Var2 = new org.telegram.ui.a0(j4Var, 5);
                            }
                            U.showAsSheet(new org.telegram.ui.web.p(a0Var2, new org.telegram.ui.q(j4Var, 2)), obj2);
                            return;
                        }
                        return;
                    } else if (num.intValue() == 8) {
                        ?? obj3 = new Object();
                        obj3.f22929a = true;
                        org.telegram.ui.ActionBar.r2 U2 = LaunchActivity.U();
                        if (U2 != 0) {
                            if (v3Var2 != null) {
                                a0Var = new org.telegram.ui.a0(j4Var, 6);
                            }
                            U2.showAsSheet(new org.telegram.ui.web.f1(a0Var, new org.telegram.ui.q(j4Var, 3)), obj3);
                            return;
                        }
                        return;
                    } else if (num.intValue() == 9) {
                        if (j4Var.f40414u0[0].getWebView() != null) {
                            j4Var.f40414u0[0].getWebView().goForward();
                            return;
                        }
                        return;
                    } else if (num.intValue() == 3) {
                        if (j4Var.f40414u0[0].f()) {
                            if (j4Var.f40414u0[0].getWebView() != null) {
                                str = j4Var.f40414u0[0].getWebView().getUrl();
                                str2 = j4Var.f40414u0[0].getWebView().getOpenURL();
                                file = null;
                            } else {
                                return;
                            }
                        } else {
                            TLRPC.WebPage webPage3 = j4Var.f40414u0[0].f41313c.E;
                            if (webPage3 != null) {
                                String str8 = webPage3.url;
                                TL_iv.Page page = webPage3.cached_page;
                                if (page != null) {
                                    file = page.local;
                                    str = str8;
                                    str2 = null;
                                } else {
                                    str = str8;
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
                                return;
                            } else if (str != null) {
                                String hostAuthority = AndroidUtilities.getHostAuthority(str2, true);
                                String hostAuthority2 = AndroidUtilities.getHostAuthority(str, true);
                                org.telegram.ui.x xVar = new org.telegram.ui.x(j4Var, str, 1);
                                org.telegram.ui.y yVar = new org.telegram.ui.y(j4Var, hostAuthority2, hostAuthority, 1);
                                if (j4Var.f40414u0[0].f() && MessagesController.getInstance(j4Var.X).isWebBrowserOpenInApp(hostAuthority2) && !MessagesController.getInstance(j4Var.X).isWebBrowserExceptionsLimitReached(true)) {
                                    org.telegram.ui.Components.g5.n0(activity, null, str, true, new bi.m5(8, yVar, xVar));
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
                        if (j4Var.f40414u0[0].f()) {
                            org.telegram.ui.ActionBar.r2 U3 = LaunchActivity.U();
                            if (U3 != 0) {
                                ?? obj4 = new Object();
                                obj4.f22929a = true;
                                U3.showAsSheet(new org.telegram.ui.web.y1(new org.telegram.ui.q(j4Var, 3)), obj4);
                                return;
                            }
                            return;
                        }
                        org.telegram.ui.ActionBar.k3 k3Var = new org.telegram.ui.ActionBar.k3(1, (Context) j4Var.L, (u6) null, false);
                        k3Var.fixNavigationBar();
                        k3Var.applyTopPadding = false;
                        LinearLayout linearLayout = new LinearLayout(j4Var.L);
                        linearLayout.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
                        linearLayout.setOrientation(1);
                        org.telegram.ui.Cells.q4 q4Var = new org.telegram.ui.Cells.q4(j4Var.L, (u6) null);
                        q4Var.setText(LocaleController.getString(R.string.FontSize));
                        linearLayout.addView(q4Var, kb1.x(-2, -2, 51, 3, 1, 3, 0));
                        linearLayout.addView(new org.telegram.ui.e4(j4Var, j4Var.L), kb1.x(-1, -2, 51, 3, 0, 3, 0));
                        org.telegram.ui.Cells.q4 q4Var2 = new org.telegram.ui.Cells.q4(j4Var.L, (u6) null);
                        q4Var2.setText(LocaleController.getString(R.string.FontType));
                        linearLayout.addView(q4Var2, kb1.x(-2, -2, 51, 3, 4, 3, 2));
                        int i22 = 0;
                        for (int i23 = 2; i22 < i23; i23 = 2) {
                            Activity activity4 = j4Var.L;
                            org.telegram.ui.k0 k0Var = new org.telegram.ui.k0(activity4);
                            int i24 = y6.f23449i6;
                            org.telegram.ui.Cells.y g02 = y6.g0(y6.x0(null, i24, false), i23, -1);
                            b7 N = f7.N(i24);
                            k0Var.setBackground(g02);
                            f7.k(k0Var, g02, null, N, null);
                            RadioButton radioButton = new RadioButton(activity4);
                            k0Var.f40640b = radioButton;
                            radioButton.setSize(AndroidUtilities.dp(20.0f));
                            f7.P(radioButton, y6.D5, y6.E5, null);
                            boolean z15 = LocaleController.isRTL;
                            if (z15) {
                                i13 = 5;
                            } else {
                                i13 = 3;
                            }
                            int i25 = i13 | 48;
                            if (z15) {
                                i14 = 0;
                            } else {
                                i14 = 22;
                            }
                            float f7 = i14;
                            if (z15) {
                                i15 = 22;
                            } else {
                                i15 = 0;
                            }
                            k0Var.addView(radioButton, kb1.h(22, 22.0f, i25, f7, 13.0f, i15, 0.0f));
                            TextView textView = new TextView(activity4);
                            f7.V(textView, y6.G6, null);
                            wh.r(textView, 1, 16.0f, 1, 1);
                            textView.setSingleLine(true);
                            if (LocaleController.isRTL) {
                                i16 = 5;
                            } else {
                                i16 = 3;
                            }
                            textView.setGravity(i16 | 16);
                            boolean z16 = LocaleController.isRTL;
                            if (z16) {
                                i17 = 5;
                            } else {
                                i17 = 3;
                            }
                            int i26 = i17 | 48;
                            int i27 = 17;
                            if (z16) {
                                i18 = 17;
                            } else {
                                i18 = 62;
                            }
                            float f10 = i18;
                            if (z16) {
                                i27 = 62;
                            }
                            k0Var.addView(textView, kb1.h(-1, -1.0f, i26, f10, 0.0f, i27, 0.0f));
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
                                String string = LocaleController.getString(R.string.Default);
                                Typeface typeface2 = Typeface.DEFAULT;
                                textView.setText(string);
                                textView.setTypeface(typeface2);
                                k0Var.setContentDescription(string);
                                k0Var.invalidate();
                            }
                            org.telegram.ui.k0 k0Var2 = k0VarArr[i22];
                            if (i22 == j4Var.f40448a) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            ((RadioButton) k0Var2.f40640b).a(z11, false);
                            k0VarArr[i22].setTag(Integer.valueOf(i22));
                            k0VarArr[i22].setOnClickListener(new org.telegram.ui.r(j4Var, 4));
                            linearLayout.addView(k0VarArr[i22], kb1.r(-1, 50));
                            i22++;
                        }
                        k3Var.customView = linearLayout;
                        j4Var.I = k3Var;
                        j4Var.a0(k3Var);
                        return;
                    } else if (num.intValue() == 5) {
                        if (j4Var.f40414u0[0].f() && j4Var.f40414u0[0].getWebView() != null) {
                            j4Var.f40414u0[0].getWebView().reload();
                            return;
                        }
                        return;
                    } else if (num.intValue() == 10 && (f2Var = j4Var.f40414u0[0].E) != null && f2Var.b() != null) {
                        j4Var.h(f2Var.b(), null, 1);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 6:
                org.telegram.ui.m3 m3Var3 = (org.telegram.ui.m3) this.f17466b;
                Activity activity5 = (Activity) this.f17467c;
                String str9 = (String) obj;
                if (!TextUtils.isEmpty(str9) && m3Var3.getWebView() != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str9.trim());
                    AndroidUtilities.addLinksSafe(spannableStringBuilder, 1, false, true);
                    URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                    int length = spannableStringBuilder.length();
                    int i28 = 0;
                    for (int i29 = 0; i29 < uRLSpanArr.length; i29++) {
                        length = Math.min(spannableStringBuilder.getSpanStart(uRLSpanArr[i29]), length);
                        i28 = Math.max(spannableStringBuilder.getSpanEnd(uRLSpanArr[i29]), i28);
                    }
                    Uri uriParseSafe = Utilities.uriParseSafe(str9);
                    if (uriParseSafe == null || !TextUtils.equals(uriParseSafe.getScheme(), "javascript")) {
                        String str10 = null;
                        if ((uRLSpanArr.length > 0 && length == 0 && i28 > 0) || (uriParseSafe != null && uriParseSafe.getScheme() != null)) {
                            if (uriParseSafe != null && uriParseSafe.getScheme() == null && uriParseSafe.getHost() == null && uriParseSafe.getPath() != null) {
                                str9 = qf.d.u(uriParseSafe, "https", null, uriParseSafe.getPath(), "/");
                            }
                            m3Var3.getWebView().loadUrl(str9);
                            return;
                        }
                        org.telegram.ui.web.l.b(activity5, str9);
                        org.telegram.ui.web.x0 webView = m3Var3.getWebView();
                        String str11 = org.telegram.ui.web.n1.a().f44844b;
                        if (str11 != null) {
                            StringBuilder u11 = a1.g.u(str11);
                            u11.append(URLEncoder.encode(str9));
                            str10 = u11.toString();
                        }
                        webView.loadUrl(str10);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                bd bdVar = (bd) this.f17466b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f17467c;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                bdVar.f37981c = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    int i30 = tL_premium_boostsStatus.level;
                    bdVar.f37979b = i30;
                    if (chat != null) {
                        chat.flags |= 1024;
                        chat.level = i30;
                    }
                }
                bdVar.a1(true);
                fi.d dVar = bdVar.P;
                if (dVar != null) {
                    dVar.setLoading(false);
                    return;
                }
                return;
            case 8:
                sc scVar = (sc) this.f17466b;
                MessagesController.PeerColors peerColors = (MessagesController.PeerColors) this.f17467c;
                View view = (View) obj;
                if (view instanceof rc) {
                    rc rcVar = (rc) view;
                    rcVar.setBackgroundColor(y6.w0(y6.f23357d6, scVar.f43292a));
                    scVar.f43293b.getClass();
                    int R = RecyclerView.R(view);
                    if (peerColors != null && R >= 0 && R < peerColors.colors.size()) {
                        rcVar.a(peerColors.colors.get(R));
                    }
                    view.invalidate();
                    return;
                }
                return;
            case 9:
                tg.j0 j0Var = (tg.j0) this.f17467c;
                j0Var.K1((ChannelBoostsController.CanApplyBoost) obj);
                ((ke) this.f17466b).m0.showDialog(j0Var);
                return;
            case 10:
                wn wnVar2 = (wn) this.f17466b;
                Long l4 = (Long) obj;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = new TLRPC.TL_messages_sendQuickReplyMessages();
                tL_messages_sendQuickReplyMessages.peer = wnVar2.getMessagesController().getInputPeer(wnVar2.f45168j6);
                tL_messages_sendQuickReplyMessages.shortcut_id = ((jg.b2) this.f17467c).f15639a;
                wnVar2.getConnectionsManager().sendRequest(tL_messages_sendQuickReplyMessages, null);
                jk jkVar2 = wnVar2.Y;
                if (jkVar2 != null) {
                    jkVar2.setFieldText(null);
                    return;
                }
                return;
            case 11:
                wn wnVar3 = (wn) this.f17466b;
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of((String) this.f17467c, wnVar3.f45168j6, wnVar3.D5, wnVar3.f45166j4, null, false, null, null, null, true, 0, 0, null, false);
                of2.sendMessageChatArguments = wnVar3.O8();
                of2.payStars = ((Long) obj).longValue();
                of2.monoForumPeer = wnVar3.a9();
                of2.suggestionParams = wnVar3.f45330w5;
                wnVar3.getSendMessagesHelper().sendMessage(of2);
                wnVar3.Y.setFieldText("");
                wnVar3.r9(false);
                return;
            case 12:
                wn wnVar4 = (wn) this.f17466b;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.f17467c;
                Long l10 = (Long) obj;
                if (wnVar4.f45091d4 == 1) {
                    org.telegram.ui.Components.g5.L(wnVar4.getParentActivity(), wnVar4.f45168j6, new e7(wnVar4, botInlineResult, l10, 2), wnVar4.f45309ua);
                    return;
                } else {
                    wnVar4.qb(botInlineResult, true, 0, l10.longValue());
                    return;
                }
            case 13:
                wn.v1((wn) this.f17466b, (c31[]) this.f17467c, (l80) obj);
                return;
            case 14:
                Boolean bool = (Boolean) obj;
                ((wn) this.f17466b).Jb = true;
                ((ed) this.f17467c).run();
                return;
            case 15:
                wn wnVar5 = (wn) this.f17466b;
                org.telegram.ui.ActionBar.e2[] e2VarArr = (org.telegram.ui.ActionBar.e2[]) this.f17467c;
                TL_stats.TL_statsPollStats tL_statsPollStats = (TL_stats.TL_statsPollStats) obj;
                try {
                    e2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                e2VarArr[0] = null;
                if (tL_statsPollStats != null) {
                    if (tL_statsPollStats.votes_graph instanceof TL_stats.TL_statsGraphError) {
                        org.telegram.messenger.t.q(R.string.PollStatsWillLater, wc.b0(wnVar5), R.raw.timer_toast, 24);
                        return;
                    } else {
                        new vh.g(wnVar5.getParentActivity(), wnVar5.f45309ua, tL_statsPollStats).show();
                        return;
                    }
                }
                return;
            case 16:
                wn wnVar6 = (wn) this.f17466b;
                MessageObject messageObject = (MessageObject) this.f17467c;
                wnVar6.getClass();
                TLRPC.SuggestedPost tl = ((MessageSuggestionParams) obj).toTl();
                if (messageObject != null && messageObject.messageOwner != null && tl != null) {
                    wnVar6.getMessagesController().addOfferToSuggestedMessage(messageObject, tl);
                    return;
                }
                return;
            case 17:
                jg.b2 b2Var = (jg.b2) this.f17467c;
                String str12 = (String) obj;
                wn wnVar7 = ((jj) this.f17466b).f40550b;
                if (b2Var != null) {
                    i19 = ((org.telegram.ui.ActionBar.r2) wnVar7).currentAccount;
                    jg.c2.f(i19).k(b2Var.f15639a, str12);
                }
                wnVar7.f45077c4 = str12;
                wnVar7.f45198m1.setTitle(str12);
                return;
            case 18:
                MessageObject messageObject2 = (MessageObject) this.f17467c;
                Long l11 = (Long) obj;
                wn wnVar8 = ((hn) this.f17466b).f39938a;
                if (wnVar8.o7()) {
                    SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of(messageObject2.getDiceEmoji(), wnVar8.f45168j6, wnVar8.D5, wnVar8.f45166j4, null, false, null, null, null, true, 0, 0, null, false);
                    of3.sendMessageChatArguments = wnVar8.O8();
                    of3.dice_stake = l11.longValue();
                    wnVar8.getSendMessagesHelper().sendMessage(of3);
                    return;
                }
                return;
            case 19:
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.f17467c;
                wn wnVar9 = ((hn) this.f17466b).f39938a;
                if (((Boolean) obj).booleanValue()) {
                    for (int i31 = 0; i31 < wnVar9.f45339x0.getChildCount(); i31++) {
                        View childAt = wnVar9.f45339x0.getChildAt(i31);
                        if (childAt instanceof org.telegram.ui.Cells.s1) {
                            org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) childAt;
                            if (s1Var2.getMessageObject() != null && s1Var2.getMessageObject().isSensitive()) {
                                s1Var2.j4();
                            }
                        }
                    }
                    return;
                }
                if (s1Var.getMessageObject() != null) {
                    s1Var.getMessageObject().isSensitiveCached = Boolean.FALSE;
                }
                s1Var.j4();
                return;
            case 20:
                hn hnVar = (hn) this.f17466b;
                s2 s2Var = (s2) this.f17467c;
                wn wnVar10 = hnVar.f39938a;
                if (!((Boolean) obj).booleanValue()) {
                    wc.b0(wnVar10).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    return;
                }
                wnVar10.getMessagesController().setContentSettings(true);
                wc.b0(wnVar10).Q(R.raw.chats_infotip, AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.SensitiveContentSettingsToast), new sm(hnVar, 8)), true)).k(true);
                s2Var.run(Boolean.TRUE);
                return;
            case 21:
                TLRPC.Message message = (TLRPC.Message) this.f17467c;
                ((hn) this.f17466b).f39938a.getMessagesController().rejectSuggestedMessage(DialogObject.getPeerDialogId(message.peer_id), message.f22049id, (String) obj);
                return;
            case 22:
                zn znVar = (zn) this.f17466b;
                znVar.f46317f.s(((fg.a) obj).f10467b, ((TLRPC.WallPaper) this.f17467c).settings.intensity);
                View view2 = znVar.f46315b;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 23:
                String str13 = (String) this.f17467c;
                Long l12 = (Long) obj;
                ChatActivityEnterView chatActivityEnterView = ((of) this.f17466b).f31281a;
                long j10 = chatActivityEnterView.Q2;
                MessageObject messageObject3 = chatActivityEnterView.T2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                SendMessagesHelper.SendMessageParams of4 = SendMessagesHelper.SendMessageParams.of(str13, j10, messageObject3, threadMessage, null, false, null, null, null, true, 0, 0, null, false);
                wn wnVar11 = chatActivityEnterView.P2;
                if (wnVar11 != null) {
                    sendMessageChatArguments = wnVar11.O8();
                } else {
                    sendMessageChatArguments = null;
                }
                of4.sendMessageChatArguments = sendMessageChatArguments;
                of4.effect_id = chatActivityEnterView.S4;
                of4.payStars = l12.longValue();
                of4.monoForumPeer = chatActivityEnterView.getSendMonoForumPeerId();
                of4.suggestionParams = chatActivityEnterView.getSendMessageSuggestionParams();
                SendMessagesHelper.getInstance(chatActivityEnterView.Q).sendMessage(of4);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.m0.c();
                xe xeVar = chatActivityEnterView.J0;
                chatActivityEnterView.S4 = 0L;
                xeVar.setEffect(0L);
                return;
            case 24:
                ti tiVar = (ti) this.f17466b;
                mi miVar = (mi) this.f17467c;
                Boolean bool2 = (Boolean) obj;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i32 = tiVar.M1;
                tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i32).getInputUser(miVar.f30544c.bot_id);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i32).sendRequest(tL_messages_toggleBotInAttachMenu, new z7(14, tiVar, miVar), 66);
                return;
            case 25:
                ti tiVar2 = (ti) this.f17466b;
                ((wn) this.f17467c).f45330w5 = (MessageSuggestionParams) obj;
                boolean N1 = tiVar2.N1(0, true, 0, tiVar2.x1(), tiVar2.Q0);
                mf mfVar = tiVar2.f32996h0;
                if (mfVar != null) {
                    mfVar.g(!N1);
                    tiVar2.f32996h0 = null;
                    return;
                }
                return;
            case 26:
                ((hi.o4) this.f17466b).getWebViewContainer().F((String) this.f17467c, (String) obj, false);
                return;
            case 27:
                fj fjVar = (fj) this.f17466b;
                MessagesController messagesController = (MessagesController) this.f17467c;
                Long l13 = (Long) obj;
                boolean z17 = false;
                fjVar.f28184i0 = false;
                if (l13 == null) {
                    user = null;
                } else {
                    user = messagesController.getUser(l13);
                }
                fjVar.f28183h0 = user;
                if (user == null) {
                    z17 = true;
                }
                fjVar.f28185j0 = z17;
                if (user != null) {
                    fjVar.R();
                    return;
                }
                return;
            case 28:
                sl slVar = ((pl) this.f17466b).f31637b;
                slVar.f32636u0.d(((rl) this.f17467c).f32273c, slVar.f32637v0, true, 0, ((Long) obj).longValue());
                slVar.f30254b.dismiss(true);
                return;
            default:
                xv xvVar = (xv) this.f17466b;
                boolean[] zArr = (boolean[]) this.f17467c;
                if (((TLRPC.TL_messages_stickerSet) obj) == null && !zArr[0]) {
                    zArr[0] = true;
                    AndroidUtilities.runOnUIThread(new wv(xvVar, 1));
                    return;
                }
                return;
        }
    }
}
