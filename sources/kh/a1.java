package kh;

import android.app.Activity;
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
import java.io.File;
import java.net.URLEncoder;
import java.util.Calendar;
import lh.j7;
import lh.l7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessageChatArguments;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.cf;
import org.telegram.ui.Components.ef;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.lq0;
import org.telegram.ui.Components.oe;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.qc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.co;
import org.telegram.ui.f7;
import org.telegram.ui.lj;
import org.telegram.ui.lk;
import org.telegram.ui.ln;
import org.telegram.ui.w31;
import org.telegram.ui.wm;
import org.telegram.ui.zn;
public final class a1 implements Utilities.Callback {
    public final int f10567a;
    public final Object f10568b;
    public final Object f10569c;

    public a1(int i10, Object obj, Object obj2) {
        this.f10567a = i10;
        this.f10568b = obj;
        this.f10569c = obj2;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        int i11;
        float f10;
        int i12;
        boolean z4;
        zn znVar;
        lk lkVar;
        org.telegram.ui.web.f2 f2Var;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z10;
        String str;
        String str2;
        File file;
        String str3;
        FrameLayout frameLayout;
        String str4;
        int i19;
        MessageObject threadMessage;
        int i20 = this.f10567a;
        org.telegram.ui.d0 d0Var = null;
        SendMessageChatArguments sendMessageChatArguments = null;
        String str5 = null;
        nh.b bVar = null;
        org.telegram.ui.d0 d0Var2 = null;
        int i21 = 0;
        boolean z11 = true;
        Object obj2 = this.f10569c;
        Object obj3 = this.f10568b;
        switch (i20) {
            case 0:
                g2 g2Var = (g2) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                Boolean bool = (Boolean) obj;
                g2Var.getClass();
                if (callback != null) {
                    callback.run(bool);
                }
                if (bool.booleanValue()) {
                    g2Var.skipDismissAnimation();
                }
                g2Var.dismiss();
                return;
            case 1:
                g1 g1Var = (g1) obj2;
                if (((Object[]) obj)[1] == ((l7) obj3)) {
                    g1Var.run();
                    return;
                }
                return;
            case 2:
                or0 or0Var = (or0) obj3;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj2;
                String str6 = (String) obj;
                j7 j7Var = or0Var.e;
                int i22 = tL_starGiftCollection.collection_id;
                j7Var.getClass();
                TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
                int i23 = j7Var.f12654a;
                updatestargiftcollection.peer = MessagesController.getInstance(i23).getInputPeer(j7Var.f12655b);
                updatestargiftcollection.collection_id = i22;
                updatestargiftcollection.flags |= 1;
                updatestargiftcollection.title = str6;
                ConnectionsManager.getInstance(i23).sendRequest(updatestargiftcollection, null);
                tL_starGiftCollection.title = str6;
                or0Var.f(true);
                return;
            case 3:
                d6 d6Var = (d6) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                Void r12 = (Void) obj;
                long j10 = d6Var.W;
                Runnable runnable = d6Var.f10658d0;
                if (runnable != null) {
                    runnable.run();
                }
                d6Var.dismiss();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.giftsToUserSent, new Object[0]);
                AndroidUtilities.runOnUIThread(new u5(0, user), 250L);
                MessagesController.getInstance(d6Var.V).getMainSettings().edit().putBoolean("show_gift_for_" + j10, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j10, true).apply();
                return;
            case 4:
                lh.g5 g5Var = (lh.g5) obj3;
                String str7 = (String) obj2;
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                lh.c5 c5Var = g5Var.f12452b0;
                rh.i[] iVarArr = g5Var.f12476p0;
                ph.d dVar = g5Var.f12462g0;
                if (stargiftupgradepreview != null) {
                    c5Var.setPreviewingAttributes(stargiftupgradepreview.sample_attributes);
                    g5Var.q2(1, false, null);
                    c5Var.i(1, LocaleController.getString(R.string.Gift2LearnMoreTitle), LocaleController.formatString(R.string.Gift2LearnMoreText, str7), null);
                    iVarArr[0].setText(LocaleController.getString(R.string.Gift2UpgradeFeature1TextLearn));
                    iVarArr[1].setText(LocaleController.getString(R.string.Gift2UpgradeFeature2TextLearn));
                    iVarArr[2].setText(LocaleController.getString(R.string.Gift2UpgradeFeature3TextLearn));
                    g5Var.f12478r0.setVisibility(8);
                    g5Var.f12477q0.setVisibility(8);
                    dVar.setFilled(true);
                    dVar.g(LocaleController.getString(R.string.OK), false, true);
                    dVar.f(null, false);
                    dVar.setOnClickListener(new lh.l1(g5Var, 4));
                    g5Var.show();
                    return;
                }
                return;
            case 5:
                lh.g5.m0((lh.g5) obj3, (org.telegram.ui.ActionBar.d2) obj2, (TL_stars.SavedStarGift) obj);
                return;
            case 6:
                lh.f4 f4Var = (lh.f4) obj3;
                f4Var.getClass();
                ((lh.d4) obj2).a((TL_stars.StarGift) obj, true);
                f4Var.d(true);
                return;
            case 7:
                lh.k4 k4Var = (lh.k4) obj3;
                lf.b bVar2 = (lf.b) obj2;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) obj;
                ze.c cVar = k4Var.f12698n;
                if (cVar != null && bVar2 == k4Var.f12701q) {
                    cVar.c(false);
                }
                k4Var.f12700p.remove(bVar2);
                if (tL_payments_paymentFormStarGift != null) {
                    k4Var.f12699o.put(bVar2, new lh.i4(bVar2, tL_payments_paymentFormStarGift));
                    k4Var.a(true);
                    return;
                }
                return;
            case 8:
                ((Utilities.Callback2) obj3).run((lf.a) obj, new lh.b((lh.w0[]) obj2, 14));
                return;
            case 9:
                VoIPDebugToSend.b((VoIPDebugToSend) obj3, (TL_phone.saveCallDebug) obj2, (TLRPC.InputFile) obj);
                return;
            case 10:
                org.telegram.ui.ActionBar.n3 n3Var = (org.telegram.ui.ActionBar.n3) obj3;
                org.telegram.ui.ActionBar.m3 m3Var = (org.telegram.ui.ActionBar.m3) obj2;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj;
                if (p2Var != null) {
                    if ((p2Var instanceof zn) && (lkVar = (znVar = (zn) p2Var).V) != null) {
                        lkVar.P();
                        znVar.V.n0(true, false, true);
                    }
                    if (p2Var.getContext() != null && p2Var.getParentActivity() != null) {
                        rh.p2 p2Var2 = new rh.p2(p2Var.getContext(), p2Var.getResourceProvider());
                        p2Var2.f43741h0 = p2Var.getParentActivity();
                        if (m3Var != null && m3Var.f20423a != null) {
                            p2Var2.B0 = true;
                            boolean z12 = m3Var.f20434o;
                            p2Var2.S = z12;
                            if (z12) {
                                p2Var2.v(m3Var.f20437r, false);
                            }
                            if (!m3Var.f20433n) {
                                int i24 = m3Var.f20435p;
                                if (i24 < 0) {
                                    i24 = j6.f19881d6;
                                }
                                i10 = j6.v0(i24, p2Var2.B);
                            } else {
                                i10 = m3Var.f20436q;
                            }
                            p2Var2.t(i10, m3Var.f20433n, false);
                            p2Var2.y(m3Var.f20438s, false);
                            p2Var2.C0 = m3Var.f20429j;
                            p2Var2.D0 = m3Var.f20430k;
                            boolean z13 = m3Var.f20440u;
                            p2Var2.f43755t0 = z13;
                            rh.h2 h2Var = p2Var2.f43760x;
                            h2Var.setIsBackButtonVisible(z13);
                            p2Var2.v.setAllowSwipes(m3Var.f20431l);
                            ImageView backButton = p2Var2.T.getBackButton();
                            if (p2Var2.f43755t0) {
                                i11 = R.drawable.ic_ab_back;
                            } else {
                                i11 = R.drawable.ic_close_white;
                            }
                            AndroidUtilities.updateImageViewImageAnimated(backButton, i11);
                            BotFullscreenButtons botFullscreenButtons = p2Var2.f43743j0;
                            if (botFullscreenButtons != null) {
                                botFullscreenButtons.setBack(p2Var2.f43755t0, false);
                            }
                            p2Var2.f43748o0 = m3Var.f20443y;
                            p2Var2.f43759w0 = Boolean.valueOf(m3Var.B);
                            p2Var2.f43761x0 = m3Var.C;
                            rh.u0 u0Var = m3Var.K;
                            p2Var2.f43763y0 = u0Var;
                            if (u0Var != null) {
                                rh.s0 s0Var = u0Var.f43858r;
                                SensorManager sensorManager = u0Var.f43844a;
                                f10 = 0.721f;
                                if (u0Var.f43852l) {
                                    u0Var.f43852l = false;
                                    if (sensorManager != null) {
                                        Sensor sensor = u0Var.f43845b;
                                        if (sensor != null) {
                                            sensorManager.registerListener(u0Var.f43854n, sensor, rh.u0.a(u0Var.f43846c));
                                        }
                                        Sensor sensor2 = u0Var.d;
                                        if (sensor2 != null) {
                                            sensorManager.registerListener(u0Var.f43856p, sensor2, rh.u0.a(u0Var.e));
                                        }
                                        Sensor sensor3 = u0Var.f43848g;
                                        if (sensor3 != null) {
                                            sensorManager.registerListener(s0Var, sensor3, rh.u0.a(u0Var.h));
                                        }
                                        Sensor sensor4 = u0Var.f43847f;
                                        if (sensor4 != null) {
                                            sensorManager.registerListener(s0Var, sensor4, rh.u0.a(u0Var.h));
                                        }
                                        Sensor sensor5 = u0Var.f43849i;
                                        if (sensor5 != null) {
                                            sensorManager.registerListener(u0Var.f43860t, sensor5, rh.u0.a(u0Var.f43850j));
                                        }
                                    }
                                }
                            } else {
                                f10 = 0.721f;
                            }
                            b4.e0 e0Var = m3Var.f20441w;
                            if (e0Var != null) {
                                rh.l2 l2Var = p2Var2.f43742i0;
                                int totalHeight = l2Var.getTotalHeight();
                                l2Var.e = e0Var;
                                rh.s[] sVarArr = l2Var.f43841f;
                                rh.u.b(sVarArr[0].f43809l, (rh.t) e0Var.f1379c, false);
                                rh.u.b(sVarArr[1].f43809l, (rh.t) e0Var.d, false);
                                l2Var.invalidate();
                                if (totalHeight != l2Var.getTotalHeight() && l2Var.f43843r != null) {
                                    if (totalHeight < l2Var.getTotalHeight()) {
                                        AndroidUtilities.runOnUIThread(l2Var.f43843r, 200L);
                                    } else {
                                        l2Var.f43843r.run();
                                    }
                                }
                                int i25 = e0Var.f1378b;
                                Paint paint = l2Var.f43838a;
                                l2Var.e.f1378b = i25;
                                paint.setColor(i25);
                                l2Var.d.a(i25, true);
                            }
                            p2Var2.x(m3Var.f20444z, false, m3Var.A);
                            rh.y3 y3Var = m3Var.f20423a;
                            if (y3Var != null) {
                                i12 = y3Var.f43919a;
                            } else {
                                i12 = UserConfig.selectedAccount;
                            }
                            p2Var2.D = i12;
                            org.telegram.ui.web.y0 y0Var = m3Var.f20424b;
                            if (y0Var != null) {
                                y0Var.onResume();
                                h2Var.O(p2Var2.D, m3Var.f20424b, m3Var.d, m3Var.f20426f, m3Var.e);
                                if (!m3Var.f20439t && !m3Var.f20424b.f39652b) {
                                    z4 = false;
                                } else {
                                    z4 = true;
                                }
                                String str8 = m3Var.f20442x;
                                h2Var.h("setState(" + z4 + ", " + str8 + ")");
                                h2Var.K = z4;
                                h2Var.f39383b = str8;
                                if (j6.I.q() != m3Var.D) {
                                    h2Var.A();
                                }
                            } else {
                                y3Var.f43932q = null;
                                y3Var.f43933r = 0L;
                            }
                            p2Var2.s(p2Var, m3Var.f20423a);
                            p2Var2.Y = m3Var.v;
                            if (m3Var.G) {
                                p2Var2.P0 = true;
                                p2Var2.i();
                                org.telegram.ui.h3 h3Var = p2Var2.R0;
                                String userName = UserObject.getUserName(MessagesController.getInstance(p2Var2.D).getUser(Long.valueOf(p2Var2.E)));
                                String str9 = m3Var.H;
                                p2Var2.Q0 = str9;
                                h3Var.a(userName, str9);
                                org.telegram.ui.h3 h3Var2 = p2Var2.R0;
                                Paint paint2 = p2Var2.M;
                                if (AndroidUtilities.computePerceivedBrightness(paint2.getColor()) > f10) {
                                    z11 = false;
                                }
                                h3Var2.b(z11, false);
                                p2Var2.R0.setBackgroundColor(paint2.getColor());
                                p2Var2.R0.setVisibility(0);
                                p2Var2.R0.setAlpha(1.0f);
                            }
                            p2Var2.o(m3Var.L);
                            n3Var.h(n3Var.f20463w, m3Var, false);
                            p2Var2.show();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 11:
                org.telegram.ui.ActionBar.t3 t3Var = (org.telegram.ui.ActionBar.t3) obj2;
                ((org.telegram.ui.ActionBar.m3) obj3).f20432m = (Bitmap) obj;
                t3Var.mo37getWindowView().setDrawingFromOverlay(false);
                t3Var.release();
                return;
            case 12:
                org.telegram.ui.ActionBar.v3 v3Var = (org.telegram.ui.ActionBar.v3) obj2;
                org.telegram.ui.ActionBar.w3 w3Var = ((org.telegram.ui.ActionBar.s3) obj3).f20550p;
                if (((Boolean) obj).booleanValue()) {
                    v3Var.a(1.0f);
                    if (w3Var.f20654a.getTabs().isEmpty()) {
                        w3Var.a(false);
                        return;
                    }
                    return;
                }
                v3Var.a(0.0f);
                return;
            case 13:
                org.telegram.ui.n4 n4Var = (org.telegram.ui.n4) obj3;
                Activity activity = (Activity) obj2;
                Integer num = (Integer) obj;
                org.telegram.ui.a4 a4Var = n4Var.H;
                org.telegram.ui.n0[] n0VarArr = n4Var.P0;
                if ((!n4Var.f36375r0[0].c() || n4Var.f36375r0[0].f37685c.B != null) && n4Var.I != null) {
                    if (num.intValue() == 1) {
                        org.telegram.ui.o0 o0Var = n4Var.f36363e0;
                        int dp = AndroidUtilities.dp(56.0f);
                        n4Var.F0 = dp;
                        o0Var.setHeight(dp);
                        n4Var.f36363e0.h(true);
                        return;
                    } else if (num.intValue() == 2) {
                        if (n4Var.f36375r0[0].f()) {
                            if (n4Var.f36375r0[0].getWebView() != null) {
                                str4 = n4Var.f36375r0[0].getWebView().getUrl();
                            } else {
                                return;
                            }
                        } else {
                            TLRPC.WebPage webPage = n4Var.f36375r0[0].f37685c.B;
                            if (webPage != null) {
                                str4 = webPage.url;
                            } else {
                                return;
                            }
                        }
                        String v = org.telegram.ui.web.c1.v(str4);
                        Activity activity2 = n4Var.I;
                        if (AndroidUtilities.computePerceivedBrightness(n4Var.f36363e0.getBackgroundColor()) < 0.721f) {
                            bVar = new nh.b();
                        }
                        n4Var.a0(new lq0(activity2, null, v, false, v, false, bVar));
                        return;
                    } else if (num.intValue() == 6) {
                        if (n4Var.f36375r0[0].f()) {
                            if (n4Var.f36375r0[0].getWebView() != null) {
                                str3 = n4Var.f36375r0[0].getWebView().getUrl();
                                frameLayout = n4Var.f36375r0[0].f37686f;
                            } else {
                                return;
                            }
                        } else {
                            org.telegram.ui.r3 r3Var = n4Var.f36375r0[0];
                            TLRPC.WebPage webPage2 = r3Var.f37685c.B;
                            if (webPage2 != null) {
                                str3 = webPage2.url;
                                frameLayout = r3Var;
                            } else {
                                return;
                            }
                        }
                        org.telegram.ui.n4.f(str3, n4Var.U, frameLayout, a4Var, null);
                        return;
                    } else if (num.intValue() == 7) {
                        ?? obj4 = new Object();
                        obj4.f20453a = true;
                        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                        if (U != 0) {
                            if (a4Var != null) {
                                d0Var2 = new org.telegram.ui.d0(n4Var, 5);
                            }
                            U.showAsSheet(new org.telegram.ui.web.p(d0Var2, new org.telegram.ui.t(n4Var, 2)), obj4);
                            return;
                        }
                        return;
                    } else if (num.intValue() == 8) {
                        ?? obj5 = new Object();
                        obj5.f20453a = true;
                        org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                        if (U2 != 0) {
                            if (a4Var != null) {
                                d0Var = new org.telegram.ui.d0(n4Var, 6);
                            }
                            U2.showAsSheet(new org.telegram.ui.web.g1(d0Var, new org.telegram.ui.t(n4Var, 3)), obj5);
                            return;
                        }
                        return;
                    } else if (num.intValue() == 9) {
                        if (n4Var.f36375r0[0].getWebView() != null) {
                            n4Var.f36375r0[0].getWebView().goForward();
                            return;
                        }
                        return;
                    } else if (num.intValue() == 3) {
                        if (n4Var.f36375r0[0].f()) {
                            if (n4Var.f36375r0[0].getWebView() != null) {
                                str = n4Var.f36375r0[0].getWebView().getUrl();
                                str2 = n4Var.f36375r0[0].getWebView().getOpenURL();
                                file = null;
                            } else {
                                return;
                            }
                        } else {
                            TLRPC.WebPage webPage3 = n4Var.f36375r0[0].f37685c.B;
                            if (webPage3 != null) {
                                String str10 = webPage3.url;
                                TL_iv.Page page = webPage3.cached_page;
                                if (page != null) {
                                    file = page.local;
                                    str = str10;
                                    str2 = null;
                                } else {
                                    str = str10;
                                    str2 = null;
                                    file = null;
                                }
                            } else {
                                return;
                            }
                        }
                        Activity activity3 = n4Var.I;
                        if (activity3 != null && !activity3.isFinishing()) {
                            if (file != null) {
                                AndroidUtilities.openForView(file, null, "text/markdown", n4Var.I, null, true);
                                return;
                            } else if (str != null) {
                                String hostAuthority = AndroidUtilities.getHostAuthority(str2, true);
                                String hostAuthority2 = AndroidUtilities.getHostAuthority(str, true);
                                org.telegram.ui.a0 a0Var = new org.telegram.ui.a0(n4Var, str, 1);
                                org.telegram.ui.b0 b0Var = new org.telegram.ui.b0(n4Var, hostAuthority2, hostAuthority, 1);
                                if (n4Var.f36375r0[0].f() && MessagesController.getInstance(n4Var.U).isWebBrowserOpenInApp(hostAuthority2) && !MessagesController.getInstance(n4Var.U).isWebBrowserExceptionsLimitReached(true)) {
                                    org.telegram.ui.Components.z4.o0(activity, null, str, true, new dh.v(9, b0Var, a0Var));
                                    return;
                                } else {
                                    a0Var.run();
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        return;
                    } else if (num.intValue() == 4) {
                        if (n4Var.f36375r0[0].f()) {
                            org.telegram.ui.ActionBar.p2 U3 = LaunchActivity.U();
                            if (U3 != 0) {
                                ?? obj6 = new Object();
                                obj6.f20453a = true;
                                U3.showAsSheet(new org.telegram.ui.web.y1(new org.telegram.ui.t(n4Var, 3)), obj6);
                                return;
                            }
                            return;
                        }
                        org.telegram.ui.ActionBar.g3 g3Var = new org.telegram.ui.ActionBar.g3(n4Var.I, null, false, false);
                        g3Var.fixNavigationBar();
                        g3Var.applyTopPadding = false;
                        LinearLayout linearLayout = new LinearLayout(n4Var.I);
                        linearLayout.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
                        linearLayout.setOrientation(1);
                        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(n4Var.I, (f6) null);
                        l4Var.setText(LocaleController.getString(R.string.FontSize));
                        linearLayout.addView(l4Var, k7.b6.t(-2, -2, 51, 3, 1, 3, 0));
                        linearLayout.addView(new org.telegram.ui.j4(n4Var, n4Var.I), k7.b6.t(-1, -2, 51, 3, 0, 3, 0));
                        org.telegram.ui.Cells.l4 l4Var2 = new org.telegram.ui.Cells.l4(n4Var.I, (f6) null);
                        l4Var2.setText(LocaleController.getString(R.string.FontType));
                        linearLayout.addView(l4Var2, k7.b6.t(-2, -2, 51, 3, 4, 3, 2));
                        int i26 = 0;
                        for (int i27 = 2; i26 < i27; i27 = 2) {
                            Activity activity4 = n4Var.I;
                            org.telegram.ui.n0 n0Var = new org.telegram.ui.n0(activity4);
                            n0Var.setBackgroundDrawable(j6.f0(j6.w0(null, j6.f19971i6, false), i27, -1));
                            RadioButton radioButton = new RadioButton(activity4);
                            n0Var.f36297b = radioButton;
                            radioButton.setSize(AndroidUtilities.dp(20.0f));
                            radioButton.b(j6.w0(null, j6.D5, false), j6.w0(null, j6.E5, false));
                            boolean z14 = LocaleController.isRTL;
                            if (z14) {
                                i13 = 5;
                            } else {
                                i13 = 3;
                            }
                            int i28 = i13 | 48;
                            if (z14) {
                                i14 = 0;
                            } else {
                                i14 = 22;
                            }
                            float f11 = i14;
                            if (z14) {
                                i15 = 22;
                            } else {
                                i15 = 0;
                            }
                            n0Var.addView(radioButton, k7.b6.d(22, 22.0f, i28, f11, 13.0f, i15, 0.0f));
                            TextView textView = new TextView(activity4);
                            org.telegram.ui.b.q(textView, j6.w0(null, j6.G6, false), 1, 16.0f, 1);
                            textView.setMaxLines(1);
                            textView.setSingleLine(true);
                            if (LocaleController.isRTL) {
                                i16 = 5;
                            } else {
                                i16 = 3;
                            }
                            textView.setGravity(i16 | 16);
                            boolean z15 = LocaleController.isRTL;
                            if (z15) {
                                i17 = 5;
                            } else {
                                i17 = 3;
                            }
                            int i29 = i17 | 48;
                            int i30 = 17;
                            if (z15) {
                                i18 = 17;
                            } else {
                                i18 = 62;
                            }
                            float f12 = i18;
                            if (z15) {
                                i30 = 62;
                            }
                            n0Var.addView(textView, k7.b6.d(-1, -1.0f, i29, f12, 0.0f, i30, 0.0f));
                            n0VarArr[i26] = n0Var;
                            if (i26 != 0) {
                                if (i26 == 1) {
                                    Typeface typeface = Typeface.SERIF;
                                    textView.setText("Serif");
                                    textView.setTypeface(typeface);
                                    n0Var.setContentDescription("Serif");
                                    n0Var.invalidate();
                                }
                            } else {
                                String string = LocaleController.getString(R.string.Default);
                                Typeface typeface2 = Typeface.DEFAULT;
                                textView.setText(string);
                                textView.setTypeface(typeface2);
                                n0Var.setContentDescription(string);
                                n0Var.invalidate();
                            }
                            org.telegram.ui.n0 n0Var2 = n0VarArr[i26];
                            if (i26 == n4Var.f36980a) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            ((RadioButton) n0Var2.f36297b).a(z10, false);
                            n0VarArr[i26].setTag(Integer.valueOf(i26));
                            n0VarArr[i26].setOnClickListener(new org.telegram.ui.u(n4Var, 4));
                            linearLayout.addView(n0VarArr[i26], k7.b6.n(-1, 50));
                            i26++;
                        }
                        g3Var.customView = linearLayout;
                        n4Var.F = g3Var;
                        n4Var.a0(g3Var);
                        return;
                    } else if (num.intValue() == 5) {
                        if (n4Var.f36375r0[0].f() && n4Var.f36375r0[0].getWebView() != null) {
                            n4Var.f36375r0[0].getWebView().reload();
                            return;
                        }
                        return;
                    } else if (num.intValue() == 10 && (f2Var = n4Var.f36375r0[0].f37692y) != null && f2Var.b() != null) {
                        n4Var.h(f2Var.b(), null, 1);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 14:
                org.telegram.ui.r3 r3Var2 = (org.telegram.ui.r3) obj3;
                Activity activity5 = (Activity) obj2;
                String str11 = (String) obj;
                if (!TextUtils.isEmpty(str11) && r3Var2.getWebView() != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str11.trim());
                    AndroidUtilities.addLinksSafe(spannableStringBuilder, 1, false, true);
                    URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                    int length = spannableStringBuilder.length();
                    int i31 = 0;
                    while (i21 < uRLSpanArr.length) {
                        length = Math.min(spannableStringBuilder.getSpanStart(uRLSpanArr[i21]), length);
                        i31 = Math.max(spannableStringBuilder.getSpanEnd(uRLSpanArr[i21]), i31);
                        i21++;
                    }
                    Uri uriParseSafe = Utilities.uriParseSafe(str11);
                    if (uriParseSafe == null || !TextUtils.equals(uriParseSafe.getScheme(), "javascript")) {
                        if ((uRLSpanArr.length > 0 && length == 0 && i31 > 0) || (uriParseSafe != null && uriParseSafe.getScheme() != null)) {
                            if (uriParseSafe != null && uriParseSafe.getScheme() == null && uriParseSafe.getHost() == null && uriParseSafe.getPath() != null) {
                                str11 = ze.d.v(uriParseSafe, "https", null, uriParseSafe.getPath(), "/");
                            }
                            r3Var2.getWebView().loadUrl(str11);
                            return;
                        }
                        org.telegram.ui.web.k.b(activity5, str11);
                        org.telegram.ui.web.y0 webView = r3Var2.getWebView();
                        String str12 = org.telegram.ui.web.n1.a().f39537b;
                        if (str12 != null) {
                            StringBuilder l10 = e2.c.l(str12);
                            l10.append(URLEncoder.encode(str11));
                            str5 = l10.toString();
                        }
                        webView.loadUrl(str5);
                        return;
                    }
                    return;
                }
                return;
            case 15:
                zn znVar2 = (zn) obj3;
                Long l11 = (Long) obj;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = new TLRPC.TL_messages_sendQuickReplyMessages();
                tL_messages_sendQuickReplyMessages.peer = znVar2.getMessagesController().getInputPeer(znVar2.Q5);
                tL_messages_sendQuickReplyMessages.shortcut_id = ((uf.o1) obj2).f45471a;
                znVar2.getConnectionsManager().sendRequest(tL_messages_sendQuickReplyMessages, null);
                lk lkVar2 = znVar2.V;
                if (lkVar2 != null) {
                    lkVar2.setFieldText(null);
                    return;
                }
                return;
            case 16:
                zn znVar3 = (zn) obj3;
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of((String) obj2, znVar3.Q5, znVar3.f40642k5, znVar3.U3, null, false, null, null, null, true, 0, 0, null, false);
                of2.sendMessageChatArguments = znVar3.C8();
                of2.payStars = ((Long) obj).longValue();
                of2.monoForumPeer = znVar3.N8();
                of2.suggestionParams = znVar3.f40555d5;
                znVar3.getSendMessagesHelper().sendMessage(of2);
                znVar3.V.setFieldText("");
                znVar3.e9(false);
                return;
            case 17:
                zn znVar4 = (zn) obj3;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj2;
                Long l12 = (Long) obj;
                if (znVar4.O3 == 1) {
                    org.telegram.ui.Components.z4.M(znVar4.getParentActivity(), znVar4.Q5, new f7(znVar4, botInlineResult, l12, 2), znVar4.f40534ba);
                    return;
                } else {
                    znVar4.cb(botInlineResult, true, 0, l12.longValue());
                    return;
                }
            case 18:
                zn.q1((zn) obj3, (w31[]) obj2, (p70) obj);
                return;
            case 19:
                zn znVar5 = (zn) obj3;
                org.telegram.ui.ActionBar.d2[] d2VarArr = (org.telegram.ui.ActionBar.d2[]) obj2;
                TL_stats.TL_statsPollStats tL_statsPollStats = (TL_stats.TL_statsPollStats) obj;
                try {
                    d2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                d2VarArr[0] = null;
                if (tL_statsPollStats != null) {
                    if (tL_statsPollStats.votes_graph instanceof TL_stats.TL_statsGraphError) {
                        kf.k0.v(R.string.PollStatsWillLater, qc.a0(znVar5), R.raw.timer_toast, 24);
                        return;
                    } else {
                        new gh.g(znVar5.getParentActivity(), znVar5.f40534ba, tL_statsPollStats).show();
                        return;
                    }
                }
                return;
            case 20:
                zn znVar6 = (zn) obj3;
                MessageObject messageObject = (MessageObject) obj2;
                znVar6.getClass();
                TLRPC.SuggestedPost tl = ((MessageSuggestionParams) obj).toTl();
                if (messageObject != null && messageObject.messageOwner != null && tl != null) {
                    znVar6.getMessagesController().addOfferToSuggestedMessage(messageObject, tl);
                    return;
                }
                return;
            case 21:
                uf.o1 o1Var = (uf.o1) obj2;
                String str13 = (String) obj;
                zn znVar7 = ((lj) obj3).f35790b;
                if (o1Var != null) {
                    i19 = ((org.telegram.ui.ActionBar.p2) znVar7).currentAccount;
                    uf.p1.f(i19).k(o1Var.f45471a, str13);
                }
                znVar7.N3 = str13;
                znVar7.X0.setTitle(str13);
                return;
            case 22:
                MessageObject messageObject2 = (MessageObject) obj2;
                Long l13 = (Long) obj;
                zn znVar8 = ((ln) obj3).f35808a;
                if (znVar8.f7()) {
                    SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of(messageObject2.getDiceEmoji(), znVar8.Q5, znVar8.f40642k5, znVar8.U3, null, false, null, null, null, true, 0, 0, null, false);
                    of3.sendMessageChatArguments = znVar8.C8();
                    of3.dice_stake = l13.longValue();
                    znVar8.getSendMessagesHelper().sendMessage(of3);
                    return;
                }
                return;
            case 23:
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) obj2;
                zn znVar9 = ((ln) obj3).f35808a;
                if (((Boolean) obj).booleanValue()) {
                    while (i21 < znVar9.f40759u0.getChildCount()) {
                        View childAt = znVar9.f40759u0.getChildAt(i21);
                        if (childAt instanceof org.telegram.ui.Cells.s1) {
                            org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) childAt;
                            if (s1Var2.getMessageObject() != null && s1Var2.getMessageObject().isSensitive()) {
                                s1Var2.h4();
                            }
                        }
                        i21++;
                    }
                    return;
                }
                if (s1Var.getMessageObject() != null) {
                    s1Var.getMessageObject().isSensitiveCached = Boolean.FALSE;
                }
                s1Var.h4();
                return;
            case 24:
                ln lnVar = (ln) obj3;
                a1 a1Var = (a1) obj2;
                zn znVar10 = lnVar.f35808a;
                if (!((Boolean) obj).booleanValue()) {
                    qc.a0(znVar10).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    return;
                }
                znVar10.getMessagesController().setContentSettings(true);
                qc.a0(znVar10).P(R.raw.chats_infotip, AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.SensitiveContentSettingsToast), new wm(lnVar, 8)), true)).k(true);
                a1Var.run(Boolean.TRUE);
                return;
            case 25:
                TLRPC.Message message = (TLRPC.Message) obj2;
                ((ln) obj3).f35808a.getMessagesController().rejectSuggestedMessage(DialogObject.getPeerDialogId(message.peer_id), message.f19180id, (String) obj);
                return;
            case 26:
                co coVar = (co) obj3;
                coVar.f33199f.t(((pf.a) obj).f41225b, ((TLRPC.WallPaper) obj2).settings.intensity);
                View view = coVar.f33197b;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 27:
                Long l14 = (Long) obj;
                ChatActivityEnterView chatActivityEnterView = ((ef) obj3).f24607a;
                long j11 = chatActivityEnterView.M2;
                MessageObject messageObject3 = chatActivityEnterView.P2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                SendMessagesHelper.SendMessageParams of4 = SendMessagesHelper.SendMessageParams.of((String) obj2, j11, messageObject3, threadMessage, null, false, null, null, null, true, 0, 0, null, false);
                zn znVar11 = chatActivityEnterView.L2;
                if (znVar11 != null) {
                    sendMessageChatArguments = znVar11.C8();
                }
                of4.sendMessageChatArguments = sendMessageChatArguments;
                of4.effect_id = chatActivityEnterView.O4;
                of4.payStars = l14.longValue();
                of4.monoForumPeer = chatActivityEnterView.getSendMonoForumPeerId();
                of4.suggestionParams = chatActivityEnterView.getSendMessageSuggestionParams();
                SendMessagesHelper.getInstance(chatActivityEnterView.N).sendMessage(of4);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.f22759j0.c();
                oe oeVar = chatActivityEnterView.G0;
                chatActivityEnterView.O4 = 0L;
                oeVar.setEffect(0L);
                return;
            case 28:
                li liVar = (li) obj3;
                ((zn) obj2).f40555d5 = (MessageSuggestionParams) obj;
                boolean G1 = liVar.G1(0, true, 0, liVar.s1(), liVar.K0);
                cf cfVar = liVar.f26691e0;
                if (cfVar != null) {
                    cfVar.h(!G1);
                    liVar.f26691e0 = null;
                    return;
                }
                return;
            default:
                ((rh.n3) obj3).getWebViewContainer().G((String) obj2, (String) obj, false);
                return;
        }
    }
}
