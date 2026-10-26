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
import org.telegram.messenger.vh;
import org.telegram.messenger.voip.VoIPDebugToSend;
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
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.mf;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.mr0;
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
import org.telegram.ui.a31;
import org.telegram.ui.bd;
import org.telegram.ui.e7;
import org.telegram.ui.ed;
import org.telegram.ui.fn;
import org.telegram.ui.gj;
import org.telegram.ui.hk;
import org.telegram.ui.ke;
import org.telegram.ui.qm;
import org.telegram.ui.rc;
import org.telegram.ui.sc;
import org.telegram.ui.un;
import org.telegram.ui.xn;
import org.telegram.ui.z7;
public final class s2 implements Utilities.Callback {
    public final int f17466a;
    public final Object f17467b;
    public final Object f17468c;

    public s2(int i10, Object obj, Object obj2) {
        this.f17466a = i10;
        this.f17467b = obj;
        this.f17468c = obj2;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        int i11;
        int i12;
        String userName;
        boolean z10;
        un unVar;
        hk hkVar;
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
        switch (this.f17466a) {
            case 0:
                v3 v3Var = (v3) this.f17467b;
                TL_iv.pageBlockMath pageblockmath = (TL_iv.pageBlockMath) this.f17468c;
                String str5 = (String) obj;
                v3Var.getClass();
                if (!TextUtils.equals(str5, pageblockmath.source)) {
                    f2 f2Var2 = v3Var.R3;
                    if (f2Var2 != null) {
                        f2Var2.d();
                    }
                    pageblockmath.source = str5;
                    v3Var.f32152g3.O(false);
                    f2 f2Var3 = v3Var.R3;
                    if (f2Var3 != null) {
                        f2Var3.h();
                    }
                    v3Var.f17557p3.onContentChanged();
                    return;
                }
                return;
            case 1:
                ((VoIPDebugToSend) this.f17467b).lambda$done$0((TL_phone.saveCallDebug) this.f17468c, (TLRPC.InputFile) obj);
                return;
            case 2:
                org.telegram.ui.ActionBar.s3 s3Var = (org.telegram.ui.ActionBar.s3) this.f17467b;
                org.telegram.ui.ActionBar.r3 r3Var = (org.telegram.ui.ActionBar.r3) this.f17468c;
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) obj;
                if (r2Var != null) {
                    boolean z12 = true;
                    if ((r2Var instanceof un) && (hkVar = (unVar = (un) r2Var).Y) != null) {
                        hkVar.M();
                        unVar.Y.k0(true, false, true);
                    }
                    if (r2Var.getContext() != null && r2Var.getParentActivity() != null) {
                        hi.m3 m3Var = new hi.m3(r2Var.getContext(), r2Var.getResourceProvider());
                        m3Var.f13116l0 = r2Var.getParentActivity();
                        if (r3Var != null && r3Var.f23004a != null) {
                            m3Var.F0 = true;
                            boolean z13 = r3Var.f23015o;
                            m3Var.W = z13;
                            if (z13) {
                                m3Var.w(r3Var.f23018r, false);
                            }
                            if (!r3Var.f23014n) {
                                int i20 = r3Var.f23016p;
                                if (i20 < 0) {
                                    i20 = y6.f23356d6;
                                }
                                i10 = y6.w0(i20, m3Var.F);
                            } else {
                                i10 = r3Var.f23017q;
                            }
                            m3Var.u(i10, r3Var.f23014n, false);
                            m3Var.z(r3Var.f23019s, false);
                            m3Var.G0 = r3Var.f23010j;
                            m3Var.H0 = r3Var.f23011k;
                            boolean z14 = r3Var.f23021u;
                            m3Var.f13132x0 = z14;
                            hi.e3 e3Var = m3Var.f13133y;
                            e3Var.setIsBackButtonVisible(z14);
                            m3Var.f13129w.setAllowSwipes(r3Var.f23012l);
                            ImageView backButton = m3Var.X.getBackButton();
                            if (m3Var.f13132x0) {
                                i11 = R.drawable.ic_ab_back;
                            } else {
                                i11 = R.drawable.ic_close_white;
                            }
                            AndroidUtilities.updateImageViewImageAnimated(backButton, i11);
                            BotFullscreenButtons botFullscreenButtons = m3Var.f13118n0;
                            if (botFullscreenButtons != null) {
                                botFullscreenButtons.setBack(m3Var.f13132x0, false);
                            }
                            m3Var.f13125s0 = r3Var.f23024y;
                            m3Var.A0 = Boolean.valueOf(r3Var.B);
                            m3Var.B0 = r3Var.C;
                            hi.f1 f1Var = r3Var.K;
                            m3Var.C0 = f1Var;
                            if (f1Var != null) {
                                hi.d1 d1Var = f1Var.f12978r;
                                SensorManager sensorManager = f1Var.f12964a;
                                if (f1Var.f12972l) {
                                    f1Var.f12972l = false;
                                    if (sensorManager != null) {
                                        Sensor sensor = f1Var.f12965b;
                                        if (sensor != null) {
                                            sensorManager.registerListener(f1Var.f12974n, sensor, hi.f1.a(f1Var.f12966c));
                                        }
                                        Sensor sensor2 = f1Var.d;
                                        if (sensor2 != null) {
                                            sensorManager.registerListener(f1Var.f12976p, sensor2, hi.f1.a(f1Var.e));
                                        }
                                        Sensor sensor3 = f1Var.f12968g;
                                        if (sensor3 != null) {
                                            sensorManager.registerListener(d1Var, sensor3, hi.f1.a(f1Var.h));
                                        }
                                        Sensor sensor4 = f1Var.f12967f;
                                        if (sensor4 != null) {
                                            sensorManager.registerListener(d1Var, sensor4, hi.f1.a(f1Var.h));
                                        }
                                        Sensor sensor5 = f1Var.f12969i;
                                        if (sensor5 != null) {
                                            sensorManager.registerListener(f1Var.f12980t, sensor5, hi.f1.a(f1Var.f12970j));
                                        }
                                    }
                                }
                            }
                            ng ngVar = r3Var.f23022w;
                            if (ngVar != null) {
                                hi.i3 i3Var = m3Var.m0;
                                int totalHeight = i3Var.getTotalHeight();
                                i3Var.e = ngVar;
                                hi.b0[] b0VarArr = i3Var.f12935f;
                                hi.d0.b(b0VarArr[0].f12879l, (hi.c0) ngVar.f640c, false);
                                hi.d0.b(b0VarArr[1].f12879l, (hi.c0) ngVar.d, false);
                                i3Var.invalidate();
                                if (totalHeight != i3Var.getTotalHeight() && i3Var.f12937r != null) {
                                    if (totalHeight < i3Var.getTotalHeight()) {
                                        AndroidUtilities.runOnUIThread(i3Var.f12937r, 200L);
                                    } else {
                                        i3Var.f12937r.run();
                                    }
                                }
                                int i21 = ngVar.f639b;
                                Paint paint = i3Var.f12932a;
                                i3Var.e.f639b = i21;
                                paint.setColor(i21);
                                i3Var.d.a(i21, true);
                            }
                            m3Var.y(r3Var.f23025z, false, r3Var.A);
                            hi.c5 c5Var = r3Var.f23004a;
                            if (c5Var != null) {
                                i12 = c5Var.f12915a;
                            } else {
                                i12 = UserConfig.selectedAccount;
                            }
                            m3Var.H = i12;
                            org.telegram.ui.web.x0 x0Var = r3Var.f23005b;
                            if (x0Var != null) {
                                x0Var.onResume();
                                e3Var.N(m3Var.H, r3Var.f23005b, r3Var.d, r3Var.f23007f, r3Var.e);
                                if (!r3Var.f23020t && !r3Var.f23005b.f45443b) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                String str6 = r3Var.f23023x;
                                e3Var.g("setState(" + z10 + ", " + str6 + ")");
                                e3Var.N = z10;
                                e3Var.f45156b = str6;
                                if (y6.I.q() != r3Var.D) {
                                    e3Var.z();
                                }
                            } else {
                                c5Var.f12928q = null;
                                c5Var.f12929r = 0L;
                            }
                            m3Var.t(r2Var, r3Var.f23004a);
                            m3Var.f13106c0 = r3Var.v;
                            if (r3Var.G) {
                                m3Var.W0 = true;
                                m3Var.i();
                                org.telegram.ui.c3 c3Var = m3Var.Y0;
                                if (m3Var.m()) {
                                    userName = m3Var.f13130w0.e;
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
                            s3Var.h(s3Var.f23079w, r3Var, false);
                            m3Var.show();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 3:
                org.telegram.ui.ActionBar.y3 y3Var = (org.telegram.ui.ActionBar.y3) this.f17468c;
                ((org.telegram.ui.ActionBar.r3) this.f17467b).f23013m = (Bitmap) obj;
                y3Var.mo36getWindowView().setDrawingFromOverlay(false);
                y3Var.release();
                return;
            case 4:
                org.telegram.ui.ActionBar.a4 a4Var = (org.telegram.ui.ActionBar.a4) this.f17468c;
                org.telegram.ui.ActionBar.b4 b4Var = ((org.telegram.ui.ActionBar.x3) this.f17467b).f23244p;
                if (((Boolean) obj).booleanValue()) {
                    a4Var.a(1.0f);
                    if (b4Var.f22430a.getTabs().isEmpty()) {
                        b4Var.a(false);
                        return;
                    }
                    return;
                }
                a4Var.a(0.0f);
                return;
            case 5:
                org.telegram.ui.j4 j4Var = (org.telegram.ui.j4) this.f17467b;
                Activity activity = (Activity) this.f17468c;
                Integer num = (Integer) obj;
                org.telegram.ui.v3 v3Var2 = j4Var.K;
                org.telegram.ui.k0[] k0VarArr = j4Var.T0;
                if ((!j4Var.f40449u0[0].c() || j4Var.f40449u0[0].f41444c.E != null) && j4Var.L != null) {
                    if (num.intValue() == 1) {
                        org.telegram.ui.l0 l0Var = j4Var.f40437h0;
                        int dp = AndroidUtilities.dp(56.0f);
                        j4Var.J0 = dp;
                        l0Var.setHeight(dp);
                        j4Var.f40437h0.h(true);
                        return;
                    }
                    org.telegram.ui.a0 a0Var = null;
                    di.b bVar = null;
                    org.telegram.ui.a0 a0Var2 = null;
                    if (num.intValue() == 2) {
                        if (j4Var.f40449u0[0].f()) {
                            if (j4Var.f40449u0[0].getWebView() != null) {
                                str4 = j4Var.f40449u0[0].getWebView().getUrl();
                            } else {
                                return;
                            }
                        } else {
                            TLRPC.WebPage webPage = j4Var.f40449u0[0].f41444c.E;
                            if (webPage != null) {
                                str4 = webPage.url;
                            } else {
                                return;
                            }
                        }
                        String u10 = org.telegram.ui.web.a1.u(str4);
                        Activity activity2 = j4Var.L;
                        if (AndroidUtilities.computePerceivedBrightness(j4Var.f40437h0.getBackgroundColor()) < 0.721f) {
                            bVar = new di.b();
                        }
                        j4Var.a0(new mr0(activity2, null, u10, false, u10, false, bVar));
                        return;
                    } else if (num.intValue() == 6) {
                        if (j4Var.f40449u0[0].f()) {
                            if (j4Var.f40449u0[0].getWebView() != null) {
                                str3 = j4Var.f40449u0[0].getWebView().getUrl();
                                frameLayout = j4Var.f40449u0[0].f41445f;
                            } else {
                                return;
                            }
                        } else {
                            org.telegram.ui.m3 m3Var2 = j4Var.f40449u0[0];
                            TLRPC.WebPage webPage2 = m3Var2.f41444c.E;
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
                        obj2.f22928a = true;
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
                        obj3.f22928a = true;
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
                        if (j4Var.f40449u0[0].getWebView() != null) {
                            j4Var.f40449u0[0].getWebView().goForward();
                            return;
                        }
                        return;
                    } else if (num.intValue() == 3) {
                        if (j4Var.f40449u0[0].f()) {
                            if (j4Var.f40449u0[0].getWebView() != null) {
                                str = j4Var.f40449u0[0].getWebView().getUrl();
                                str2 = j4Var.f40449u0[0].getWebView().getOpenURL();
                                file = null;
                            } else {
                                return;
                            }
                        } else {
                            TLRPC.WebPage webPage3 = j4Var.f40449u0[0].f41444c.E;
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
                                if (j4Var.f40449u0[0].f() && MessagesController.getInstance(j4Var.X).isWebBrowserOpenInApp(hostAuthority2) && !MessagesController.getInstance(j4Var.X).isWebBrowserExceptionsLimitReached(true)) {
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
                        if (j4Var.f40449u0[0].f()) {
                            org.telegram.ui.ActionBar.r2 U3 = LaunchActivity.U();
                            if (U3 != 0) {
                                ?? obj4 = new Object();
                                obj4.f22928a = true;
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
                        linearLayout.addView(q4Var, gb1.x(-2, -2, 51, 3, 1, 3, 0));
                        linearLayout.addView(new org.telegram.ui.e4(j4Var, j4Var.L), gb1.x(-1, -2, 51, 3, 0, 3, 0));
                        org.telegram.ui.Cells.q4 q4Var2 = new org.telegram.ui.Cells.q4(j4Var.L, (u6) null);
                        q4Var2.setText(LocaleController.getString(R.string.FontType));
                        linearLayout.addView(q4Var2, gb1.x(-2, -2, 51, 3, 4, 3, 2));
                        int i22 = 0;
                        for (int i23 = 2; i22 < i23; i23 = 2) {
                            Activity activity4 = j4Var.L;
                            org.telegram.ui.k0 k0Var = new org.telegram.ui.k0(activity4);
                            int i24 = y6.f23448i6;
                            org.telegram.ui.Cells.y g02 = y6.g0(y6.x0(null, i24, false), i23, -1);
                            b7 N = f7.N(i24);
                            k0Var.setBackground(g02);
                            f7.k(k0Var, g02, null, N, null);
                            RadioButton radioButton = new RadioButton(activity4);
                            k0Var.f40772b = radioButton;
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
                            k0Var.addView(radioButton, gb1.h(22, 22.0f, i25, f7, 13.0f, i15, 0.0f));
                            TextView textView = new TextView(activity4);
                            f7.V(textView, y6.G6, null);
                            vh.r(textView, 1, 16.0f, 1, 1);
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
                            k0Var.addView(textView, gb1.h(-1, -1.0f, i26, f10, 0.0f, i27, 0.0f));
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
                            if (i22 == j4Var.f39919a) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            ((RadioButton) k0Var2.f40772b).a(z11, false);
                            k0VarArr[i22].setTag(Integer.valueOf(i22));
                            k0VarArr[i22].setOnClickListener(new org.telegram.ui.r(j4Var, 4));
                            linearLayout.addView(k0VarArr[i22], gb1.r(-1, 50));
                            i22++;
                        }
                        k3Var.customView = linearLayout;
                        j4Var.I = k3Var;
                        j4Var.a0(k3Var);
                        return;
                    } else if (num.intValue() == 5) {
                        if (j4Var.f40449u0[0].f() && j4Var.f40449u0[0].getWebView() != null) {
                            j4Var.f40449u0[0].getWebView().reload();
                            return;
                        }
                        return;
                    } else if (num.intValue() == 10 && (f2Var = j4Var.f40449u0[0].E) != null && f2Var.b() != null) {
                        j4Var.h(f2Var.b(), null, 1);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 6:
                org.telegram.ui.m3 m3Var3 = (org.telegram.ui.m3) this.f17467b;
                Activity activity5 = (Activity) this.f17468c;
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
                        String str11 = org.telegram.ui.web.n1.a().f45333b;
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
                bd bdVar = (bd) this.f17467b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f17468c;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                bdVar.f38039c = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    int i30 = tL_premium_boostsStatus.level;
                    bdVar.f38037b = i30;
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
                sc scVar = (sc) this.f17467b;
                MessagesController.PeerColors peerColors = (MessagesController.PeerColors) this.f17468c;
                View view = (View) obj;
                if (view instanceof rc) {
                    rc rcVar = (rc) view;
                    rcVar.setBackgroundColor(y6.w0(y6.f23356d6, scVar.f43465a));
                    scVar.f43466b.getClass();
                    int R = RecyclerView.R(view);
                    if (peerColors != null && R >= 0 && R < peerColors.colors.size()) {
                        rcVar.a(peerColors.colors.get(R));
                    }
                    view.invalidate();
                    return;
                }
                return;
            case 9:
                tg.j0 j0Var = (tg.j0) this.f17468c;
                j0Var.K1((ChannelBoostsController.CanApplyBoost) obj);
                ((ke) this.f17467b).m0.showDialog(j0Var);
                return;
            case 10:
                un unVar2 = (un) this.f17467b;
                Long l4 = (Long) obj;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = new TLRPC.TL_messages_sendQuickReplyMessages();
                tL_messages_sendQuickReplyMessages.peer = unVar2.getMessagesController().getInputPeer(unVar2.f44252f6);
                tL_messages_sendQuickReplyMessages.shortcut_id = ((jg.b2) this.f17468c).f15640a;
                unVar2.getConnectionsManager().sendRequest(tL_messages_sendQuickReplyMessages, null);
                hk hkVar2 = unVar2.Y;
                if (hkVar2 != null) {
                    hkVar2.setFieldText(null);
                    return;
                }
                return;
            case 11:
                un unVar3 = (un) this.f17467b;
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of((String) this.f17468c, unVar3.f44252f6, unVar3.f44501z5, unVar3.f44298j4, null, false, null, null, null, true, 0, 0, null, false);
                of2.sendMessageChatArguments = unVar3.L8();
                of2.payStars = ((Long) obj).longValue();
                of2.monoForumPeer = unVar3.X8();
                of2.suggestionParams = unVar3.f44410s5;
                unVar3.getSendMessagesHelper().sendMessage(of2);
                unVar3.Y.setFieldText("");
                unVar3.o9(false);
                return;
            case 12:
                un unVar4 = (un) this.f17467b;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.f17468c;
                Long l10 = (Long) obj;
                if (unVar4.f44224d4 == 1) {
                    org.telegram.ui.Components.g5.L(unVar4.getParentActivity(), unVar4.f44252f6, new e7(unVar4, botInlineResult, l10, 2), unVar4.f44388qa);
                    return;
                } else {
                    unVar4.mb(botInlineResult, true, 0, l10.longValue());
                    return;
                }
            case 13:
                un.y1((un) this.f17467b, (a31[]) this.f17468c, (k80) obj);
                return;
            case 14:
                Boolean bool = (Boolean) obj;
                ((un) this.f17467b).Fb = true;
                ((ed) this.f17468c).run();
                return;
            case 15:
                un unVar5 = (un) this.f17467b;
                org.telegram.ui.ActionBar.e2[] e2VarArr = (org.telegram.ui.ActionBar.e2[]) this.f17468c;
                TL_stats.TL_statsPollStats tL_statsPollStats = (TL_stats.TL_statsPollStats) obj;
                try {
                    e2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                e2VarArr[0] = null;
                if (tL_statsPollStats != null) {
                    if (tL_statsPollStats.votes_graph instanceof TL_stats.TL_statsGraphError) {
                        org.telegram.messenger.t.q(R.string.PollStatsWillLater, wc.b0(unVar5), R.raw.timer_toast, 24);
                        return;
                    } else {
                        new vh.g(unVar5.getParentActivity(), unVar5.f44388qa, tL_statsPollStats).show();
                        return;
                    }
                }
                return;
            case 16:
                un unVar6 = (un) this.f17467b;
                MessageObject messageObject = (MessageObject) this.f17468c;
                unVar6.getClass();
                TLRPC.SuggestedPost tl = ((MessageSuggestionParams) obj).toTl();
                if (messageObject != null && messageObject.messageOwner != null && tl != null) {
                    unVar6.getMessagesController().addOfferToSuggestedMessage(messageObject, tl);
                    return;
                }
                return;
            case 17:
                jg.b2 b2Var = (jg.b2) this.f17468c;
                String str12 = (String) obj;
                un unVar7 = ((gj) this.f17467b).f39709b;
                if (b2Var != null) {
                    i19 = ((org.telegram.ui.ActionBar.r2) unVar7).currentAccount;
                    jg.c2.f(i19).k(b2Var.f15640a, str12);
                }
                unVar7.f44211c4 = str12;
                unVar7.f44330m1.setTitle(str12);
                return;
            case 18:
                MessageObject messageObject2 = (MessageObject) this.f17468c;
                Long l11 = (Long) obj;
                un unVar8 = ((fn) this.f17467b).f39423a;
                if (unVar8.m7()) {
                    SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of(messageObject2.getDiceEmoji(), unVar8.f44252f6, unVar8.f44501z5, unVar8.f44298j4, null, false, null, null, null, true, 0, 0, null, false);
                    of3.sendMessageChatArguments = unVar8.L8();
                    of3.dice_stake = l11.longValue();
                    unVar8.getSendMessagesHelper().sendMessage(of3);
                    return;
                }
                return;
            case 19:
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.f17468c;
                un unVar9 = ((fn) this.f17467b).f39423a;
                if (((Boolean) obj).booleanValue()) {
                    for (int i31 = 0; i31 < unVar9.f44471x0.getChildCount(); i31++) {
                        View childAt = unVar9.f44471x0.getChildAt(i31);
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
                fn fnVar = (fn) this.f17467b;
                s2 s2Var = (s2) this.f17468c;
                un unVar10 = fnVar.f39423a;
                if (!((Boolean) obj).booleanValue()) {
                    wc.b0(unVar10).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    return;
                }
                unVar10.getMessagesController().setContentSettings(true);
                wc.b0(unVar10).Q(R.raw.chats_infotip, AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.SensitiveContentSettingsToast), new qm(fnVar, 8)), true)).k(true);
                s2Var.run(Boolean.TRUE);
                return;
            case 21:
                TLRPC.Message message = (TLRPC.Message) this.f17468c;
                ((fn) this.f17467b).f39423a.getMessagesController().rejectSuggestedMessage(DialogObject.getPeerDialogId(message.peer_id), message.f22048id, (String) obj);
                return;
            case 22:
                xn xnVar = (xn) this.f17467b;
                xnVar.f45813f.s(((fg.a) obj).f10468b, ((TLRPC.WallPaper) this.f17468c).settings.intensity);
                View view2 = xnVar.f45811b;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 23:
                String str13 = (String) this.f17468c;
                Long l12 = (Long) obj;
                ChatActivityEnterView chatActivityEnterView = ((of) this.f17467b).f31283a;
                long j10 = chatActivityEnterView.Q2;
                MessageObject messageObject3 = chatActivityEnterView.T2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                SendMessagesHelper.SendMessageParams of4 = SendMessagesHelper.SendMessageParams.of(str13, j10, messageObject3, threadMessage, null, false, null, null, null, true, 0, 0, null, false);
                un unVar11 = chatActivityEnterView.P2;
                if (unVar11 != null) {
                    sendMessageChatArguments = unVar11.L8();
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
                ti tiVar = (ti) this.f17467b;
                mi miVar = (mi) this.f17468c;
                Boolean bool2 = (Boolean) obj;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i32 = tiVar.M1;
                tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i32).getInputUser(miVar.f30591c.bot_id);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i32).sendRequest(tL_messages_toggleBotInAttachMenu, new z7(14, tiVar, miVar), 66);
                return;
            case 25:
                ti tiVar2 = (ti) this.f17467b;
                ((un) this.f17468c).f44410s5 = (MessageSuggestionParams) obj;
                boolean M1 = tiVar2.M1(0, true, 0, tiVar2.w1(), tiVar2.Q0);
                mf mfVar = tiVar2.f33027h0;
                if (mfVar != null) {
                    mfVar.g(!M1);
                    tiVar2.f33027h0 = null;
                    return;
                }
                return;
            case 26:
                ((hi.o4) this.f17467b).getWebViewContainer().F((String) this.f17468c, (String) obj, false);
                return;
            case 27:
                fj fjVar = (fj) this.f17467b;
                MessagesController messagesController = (MessagesController) this.f17468c;
                Long l13 = (Long) obj;
                boolean z17 = false;
                fjVar.f28203i0 = false;
                if (l13 == null) {
                    user = null;
                } else {
                    user = messagesController.getUser(l13);
                }
                fjVar.f28202h0 = user;
                if (user == null) {
                    z17 = true;
                }
                fjVar.f28204j0 = z17;
                if (user != null) {
                    fjVar.R();
                    return;
                }
                return;
            case 28:
                sl slVar = ((pl) this.f17467b).f31595b;
                slVar.f32615u0.d(((rl) this.f17468c).f32266c, slVar.f32616v0, true, 0, ((Long) obj).longValue());
                slVar.f30215b.dismiss(true);
                return;
            default:
                xv xvVar = (xv) this.f17467b;
                boolean[] zArr = (boolean[]) this.f17468c;
                if (((TLRPC.TL_messages_stickerSet) obj) == null && !zArr[0]) {
                    zArr[0] = true;
                    AndroidUtilities.runOnUIThread(new wv(xvVar, 1));
                    return;
                }
                return;
        }
    }
}
