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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.cf;
import org.telegram.ui.Components.ef;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.lq0;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.oe;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ao;
import org.telegram.ui.d7;
import org.telegram.ui.jj;
import org.telegram.ui.jk;
import org.telegram.ui.jn;
import org.telegram.ui.p31;
import org.telegram.ui.um;
import org.telegram.ui.xn;
public final class a1 implements Utilities.Callback {
    public final int f10457a;
    public final Object f10458b;
    public final Object f10459c;

    public a1(int i10, Object obj, Object obj2) {
        this.f10457a = i10;
        this.f10458b = obj;
        this.f10459c = obj2;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        int i11;
        float f10;
        int i12;
        boolean z4;
        boolean z10;
        xn xnVar;
        jk jkVar;
        org.telegram.ui.web.e2 e2Var;
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
        int i20 = this.f10457a;
        org.telegram.ui.c0 c0Var = null;
        SendMessageChatArguments sendMessageChatArguments = null;
        String str5 = null;
        nh.b bVar = null;
        org.telegram.ui.c0 c0Var2 = null;
        int i21 = 0;
        boolean z12 = true;
        Object obj2 = this.f10459c;
        Object obj3 = this.f10458b;
        switch (i20) {
            case 0:
                h2 h2Var = (h2) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                Boolean bool = (Boolean) obj;
                h2Var.getClass();
                if (callback != null) {
                    callback.run(bool);
                }
                if (bool.booleanValue()) {
                    h2Var.skipDismissAnimation();
                }
                h2Var.dismiss();
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
                int i23 = j7Var.f12670a;
                updatestargiftcollection.peer = MessagesController.getInstance(i23).getInputPeer(j7Var.f12671b);
                updatestargiftcollection.collection_id = i22;
                updatestargiftcollection.flags |= 1;
                updatestargiftcollection.title = str6;
                ConnectionsManager.getInstance(i23).sendRequest(updatestargiftcollection, null);
                tL_starGiftCollection.title = str6;
                or0Var.f(true);
                return;
            case 3:
                e6 e6Var = (e6) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                Void r12 = (Void) obj;
                long j10 = e6Var.W;
                Runnable runnable = e6Var.f10568d0;
                if (runnable != null) {
                    runnable.run();
                }
                e6Var.dismiss();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.giftsToUserSent, new Object[0]);
                AndroidUtilities.runOnUIThread(new v5(0, user), 250L);
                MessagesController.getInstance(e6Var.V).getMainSettings().edit().putBoolean("show_gift_for_" + j10, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j10, true).apply();
                return;
            case 4:
                lh.g5 g5Var = (lh.g5) obj3;
                String str7 = (String) obj2;
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                lh.c5 c5Var = g5Var.f12468b0;
                rh.j[] jVarArr = g5Var.f12492p0;
                ph.d dVar = g5Var.f12478g0;
                if (stargiftupgradepreview != null) {
                    c5Var.setPreviewingAttributes(stargiftupgradepreview.sample_attributes);
                    g5Var.q2(1, false, null);
                    c5Var.i(1, LocaleController.getString(R.string.Gift2LearnMoreTitle), LocaleController.formatString(R.string.Gift2LearnMoreText, str7), null);
                    jVarArr[0].setText(LocaleController.getString(R.string.Gift2UpgradeFeature1TextLearn));
                    jVarArr[1].setText(LocaleController.getString(R.string.Gift2UpgradeFeature2TextLearn));
                    jVarArr[2].setText(LocaleController.getString(R.string.Gift2UpgradeFeature3TextLearn));
                    g5Var.f12494r0.setVisibility(8);
                    g5Var.f12493q0.setVisibility(8);
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
                mf.b bVar2 = (mf.b) obj2;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) obj;
                af.f fVar = k4Var.f12714n;
                if (fVar != null && bVar2 == k4Var.f12717q) {
                    fVar.c(false);
                }
                k4Var.f12716p.remove(bVar2);
                if (tL_payments_paymentFormStarGift != null) {
                    k4Var.f12715o.put(bVar2, new lh.i4(bVar2, tL_payments_paymentFormStarGift));
                    k4Var.a(true);
                    return;
                }
                return;
            case 8:
                ((Utilities.Callback2) obj3).run((mf.a) obj, new lh.b((lh.w0[]) obj2, 14));
                return;
            case 9:
                VoIPDebugToSend.b((VoIPDebugToSend) obj3, (TL_phone.saveCallDebug) obj2, (TLRPC.InputFile) obj);
                return;
            case 10:
                org.telegram.ui.ActionBar.n3 n3Var = (org.telegram.ui.ActionBar.n3) obj3;
                org.telegram.ui.ActionBar.m3 m3Var = (org.telegram.ui.ActionBar.m3) obj2;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj;
                if (p2Var != null) {
                    if ((p2Var instanceof xn) && (jkVar = (xnVar = (xn) p2Var).V) != null) {
                        jkVar.P();
                        xnVar.V.n0(true, false, true);
                    }
                    if (p2Var.getContext() != null && p2Var.getParentActivity() != null) {
                        rh.q2 q2Var = new rh.q2(p2Var.getContext(), p2Var.getResourceProvider());
                        q2Var.f43689h0 = p2Var.getParentActivity();
                        if (m3Var != null && m3Var.f20448a != null) {
                            q2Var.B0 = true;
                            boolean z13 = m3Var.f20457m;
                            q2Var.S = z13;
                            if (z13) {
                                q2Var.v(m3Var.f20460p, false);
                            }
                            if (!m3Var.f20456l) {
                                int i24 = m3Var.f20458n;
                                if (i24 < 0) {
                                    i24 = j6.f19906d6;
                                }
                                i10 = j6.v0(i24, q2Var.B);
                            } else {
                                i10 = m3Var.f20459o;
                            }
                            q2Var.t(i10, m3Var.f20456l, false);
                            q2Var.y(m3Var.f20461q, false);
                            q2Var.C0 = m3Var.h;
                            q2Var.D0 = m3Var.f20453i;
                            boolean z14 = m3Var.f20463s;
                            q2Var.f43703t0 = z14;
                            rh.i2 i2Var = q2Var.f43708x;
                            i2Var.setIsBackButtonVisible(z14);
                            q2Var.v.setAllowSwipes(m3Var.f20454j);
                            ImageView backButton = q2Var.T.getBackButton();
                            if (q2Var.f43703t0) {
                                i11 = R.drawable.ic_ab_back;
                            } else {
                                i11 = R.drawable.ic_close_white;
                            }
                            AndroidUtilities.updateImageViewImageAnimated(backButton, i11);
                            BotFullscreenButtons botFullscreenButtons = q2Var.f43691j0;
                            if (botFullscreenButtons != null) {
                                botFullscreenButtons.setBack(q2Var.f43703t0, false);
                            }
                            q2Var.f43696o0 = m3Var.f20466w;
                            q2Var.f43707w0 = Boolean.valueOf(m3Var.f20469z);
                            q2Var.f43709x0 = m3Var.A;
                            rh.v0 v0Var = m3Var.I;
                            q2Var.f43711y0 = v0Var;
                            if (v0Var != null) {
                                rh.t0 t0Var = v0Var.f43806r;
                                SensorManager sensorManager = v0Var.f43792a;
                                f10 = 0.721f;
                                if (v0Var.f43800l) {
                                    v0Var.f43800l = false;
                                    if (sensorManager != null) {
                                        Sensor sensor = v0Var.f43793b;
                                        if (sensor != null) {
                                            sensorManager.registerListener(v0Var.f43802n, sensor, rh.v0.a(v0Var.f43794c));
                                        }
                                        Sensor sensor2 = v0Var.d;
                                        if (sensor2 != null) {
                                            sensorManager.registerListener(v0Var.f43804p, sensor2, rh.v0.a(v0Var.e));
                                        }
                                        Sensor sensor3 = v0Var.f43796g;
                                        if (sensor3 != null) {
                                            sensorManager.registerListener(t0Var, sensor3, rh.v0.a(v0Var.h));
                                        }
                                        Sensor sensor4 = v0Var.f43795f;
                                        if (sensor4 != null) {
                                            sensorManager.registerListener(t0Var, sensor4, rh.v0.a(v0Var.h));
                                        }
                                        Sensor sensor5 = v0Var.f43797i;
                                        if (sensor5 != null) {
                                            sensorManager.registerListener(v0Var.f43808t, sensor5, rh.v0.a(v0Var.f43798j));
                                        }
                                    }
                                }
                            } else {
                                f10 = 0.721f;
                            }
                            b4.e0 e0Var = m3Var.f20465u;
                            if (e0Var != null) {
                                rh.m2 m2Var = q2Var.f43690i0;
                                int totalHeight = m2Var.getTotalHeight();
                                m2Var.e = e0Var;
                                rh.t[] tVarArr = m2Var.f43789f;
                                rh.v.b(tVarArr[0].f43757l, (rh.u) e0Var.f1368c, false);
                                rh.v.b(tVarArr[1].f43757l, (rh.u) e0Var.d, false);
                                m2Var.invalidate();
                                if (totalHeight != m2Var.getTotalHeight() && m2Var.f43791r != null) {
                                    if (totalHeight < m2Var.getTotalHeight()) {
                                        AndroidUtilities.runOnUIThread(m2Var.f43791r, 200L);
                                    } else {
                                        m2Var.f43791r.run();
                                    }
                                }
                                int i25 = e0Var.f1367b;
                                Paint paint = m2Var.f43786a;
                                m2Var.e.f1367b = i25;
                                paint.setColor(i25);
                                m2Var.d.a(i25, true);
                            }
                            q2Var.x(m3Var.f20467x, false, m3Var.f20468y);
                            rh.z3 z3Var = m3Var.f20448a;
                            if (z3Var != null) {
                                i12 = z3Var.f43867a;
                            } else {
                                i12 = UserConfig.selectedAccount;
                            }
                            q2Var.D = i12;
                            org.telegram.ui.web.w0 w0Var = m3Var.f20449b;
                            if (w0Var != null) {
                                w0Var.onResume();
                                int i26 = q2Var.D;
                                org.telegram.ui.web.w0 w0Var2 = m3Var.f20449b;
                                Object obj4 = m3Var.d;
                                i2Var.J = i26;
                                i2Var.Q(w0Var2, obj4);
                                if (i2Var.f39435l0) {
                                    i2Var.v("visibility_changed", org.telegram.ui.web.a1.x(Boolean.TRUE, "is_visible"));
                                }
                                if (!m3Var.f20462r && !m3Var.f20449b.f39683b) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                String str8 = m3Var.v;
                                i2Var.g("setState(" + z10 + ", " + str8 + ")");
                                i2Var.K = z10;
                                i2Var.f39422b = str8;
                                if (j6.I.q() != m3Var.B) {
                                    i2Var.w();
                                }
                            } else {
                                z3Var.f43880q = null;
                                z3Var.f43881r = 0L;
                            }
                            q2Var.s(p2Var, m3Var.f20448a);
                            q2Var.Y = m3Var.f20464t;
                            if (m3Var.E) {
                                q2Var.P0 = true;
                                q2Var.i();
                                org.telegram.ui.f3 f3Var = q2Var.R0;
                                String userName = UserObject.getUserName(MessagesController.getInstance(q2Var.D).getUser(Long.valueOf(q2Var.E)));
                                String str9 = m3Var.F;
                                q2Var.Q0 = str9;
                                f3Var.a(userName, str9);
                                org.telegram.ui.f3 f3Var2 = q2Var.R0;
                                Paint paint2 = q2Var.M;
                                if (AndroidUtilities.computePerceivedBrightness(paint2.getColor()) > f10) {
                                    z12 = false;
                                }
                                z4 = false;
                                f3Var2.b(z12, false);
                                q2Var.R0.setBackgroundColor(paint2.getColor());
                                q2Var.R0.setVisibility(0);
                                q2Var.R0.setAlpha(1.0f);
                            } else {
                                z4 = false;
                            }
                            q2Var.o(m3Var.J);
                            n3Var.h(n3Var.f20488w, m3Var, z4);
                            q2Var.show();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 11:
                org.telegram.ui.ActionBar.t3 t3Var = (org.telegram.ui.ActionBar.t3) obj2;
                ((org.telegram.ui.ActionBar.m3) obj3).f20455k = (Bitmap) obj;
                t3Var.mo37getWindowView().setDrawingFromOverlay(false);
                t3Var.release();
                return;
            case 12:
                org.telegram.ui.ActionBar.v3 v3Var = (org.telegram.ui.ActionBar.v3) obj2;
                org.telegram.ui.ActionBar.w3 w3Var = ((org.telegram.ui.ActionBar.s3) obj3).f20575p;
                if (((Boolean) obj).booleanValue()) {
                    v3Var.a(1.0f);
                    if (w3Var.f20679a.getTabs().isEmpty()) {
                        w3Var.a(false);
                        return;
                    }
                    return;
                }
                v3Var.a(0.0f);
                return;
            case 13:
                org.telegram.ui.l4 l4Var = (org.telegram.ui.l4) obj3;
                Activity activity = (Activity) obj2;
                Integer num = (Integer) obj;
                org.telegram.ui.y3 y3Var = l4Var.H;
                org.telegram.ui.l0[] l0VarArr = l4Var.P0;
                if ((!l4Var.f35945r0[0].c() || l4Var.f35945r0[0].f37160c.B != null) && l4Var.I != null) {
                    if (num.intValue() == 1) {
                        org.telegram.ui.m0 m0Var = l4Var.f35933e0;
                        int dp = AndroidUtilities.dp(56.0f);
                        l4Var.F0 = dp;
                        m0Var.setHeight(dp);
                        l4Var.f35933e0.h(true);
                        return;
                    } else if (num.intValue() == 2) {
                        if (l4Var.f35945r0[0].f()) {
                            if (l4Var.f35945r0[0].getWebView() != null) {
                                str4 = l4Var.f35945r0[0].getWebView().getUrl();
                            } else {
                                return;
                            }
                        } else {
                            TLRPC.WebPage webPage = l4Var.f35945r0[0].f37160c.B;
                            if (webPage != null) {
                                str4 = webPage.url;
                            } else {
                                return;
                            }
                        }
                        String s6 = org.telegram.ui.web.a1.s(str4);
                        Activity activity2 = l4Var.I;
                        if (AndroidUtilities.computePerceivedBrightness(l4Var.f35933e0.getBackgroundColor()) < 0.721f) {
                            bVar = new nh.b();
                        }
                        l4Var.a0(new lq0(activity2, null, s6, false, s6, false, bVar));
                        return;
                    } else if (num.intValue() == 6) {
                        if (l4Var.f35945r0[0].f()) {
                            if (l4Var.f35945r0[0].getWebView() != null) {
                                str3 = l4Var.f35945r0[0].getWebView().getUrl();
                                frameLayout = l4Var.f35945r0[0].f37161f;
                            } else {
                                return;
                            }
                        } else {
                            org.telegram.ui.p3 p3Var = l4Var.f35945r0[0];
                            TLRPC.WebPage webPage2 = p3Var.f37160c.B;
                            if (webPage2 != null) {
                                str3 = webPage2.url;
                                frameLayout = p3Var;
                            } else {
                                return;
                            }
                        }
                        org.telegram.ui.l4.f(str3, l4Var.U, frameLayout, y3Var, null);
                        return;
                    } else if (num.intValue() == 7) {
                        ?? obj5 = new Object();
                        obj5.f20478a = true;
                        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                        if (U != 0) {
                            if (y3Var != null) {
                                c0Var2 = new org.telegram.ui.c0(l4Var, 5);
                            }
                            U.showAsSheet(new org.telegram.ui.web.p(c0Var2, new org.telegram.ui.t(l4Var, 2)), obj5);
                            return;
                        }
                        return;
                    } else if (num.intValue() == 8) {
                        ?? obj6 = new Object();
                        obj6.f20478a = true;
                        org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                        if (U2 != 0) {
                            if (y3Var != null) {
                                c0Var = new org.telegram.ui.c0(l4Var, 6);
                            }
                            U2.showAsSheet(new org.telegram.ui.web.e1(c0Var, new org.telegram.ui.t(l4Var, 3)), obj6);
                            return;
                        }
                        return;
                    } else if (num.intValue() == 9) {
                        if (l4Var.f35945r0[0].getWebView() != null) {
                            l4Var.f35945r0[0].getWebView().goForward();
                            return;
                        }
                        return;
                    } else if (num.intValue() == 3) {
                        if (l4Var.f35945r0[0].f()) {
                            if (l4Var.f35945r0[0].getWebView() != null) {
                                str = l4Var.f35945r0[0].getWebView().getUrl();
                                str2 = l4Var.f35945r0[0].getWebView().getOpenURL();
                                file = null;
                            } else {
                                return;
                            }
                        } else {
                            TLRPC.WebPage webPage3 = l4Var.f35945r0[0].f37160c.B;
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
                        Activity activity3 = l4Var.I;
                        if (activity3 != null && !activity3.isFinishing()) {
                            if (file != null) {
                                AndroidUtilities.openForView(file, null, "text/markdown", l4Var.I, null, true);
                                return;
                            } else if (str != null) {
                                String hostAuthority = AndroidUtilities.getHostAuthority(str2, true);
                                String hostAuthority2 = AndroidUtilities.getHostAuthority(str, true);
                                org.telegram.ui.z zVar = new org.telegram.ui.z(l4Var, str, 1);
                                org.telegram.ui.a0 a0Var = new org.telegram.ui.a0(l4Var, hostAuthority2, hostAuthority, 1);
                                if (l4Var.f35945r0[0].f() && MessagesController.getInstance(l4Var.U).isWebBrowserOpenInApp(hostAuthority2) && !MessagesController.getInstance(l4Var.U).isWebBrowserExceptionsLimitReached(true)) {
                                    org.telegram.ui.Components.z4.o0(activity, null, str, true, new dh.v(9, a0Var, zVar));
                                    return;
                                } else {
                                    zVar.run();
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        return;
                    } else if (num.intValue() == 4) {
                        if (l4Var.f35945r0[0].f()) {
                            org.telegram.ui.ActionBar.p2 U3 = LaunchActivity.U();
                            if (U3 != 0) {
                                ?? obj7 = new Object();
                                obj7.f20478a = true;
                                U3.showAsSheet(new org.telegram.ui.web.x1(new org.telegram.ui.t(l4Var, 3)), obj7);
                                return;
                            }
                            return;
                        }
                        org.telegram.ui.ActionBar.g3 g3Var = new org.telegram.ui.ActionBar.g3(l4Var.I, null, false, false);
                        g3Var.fixNavigationBar();
                        g3Var.applyTopPadding = false;
                        LinearLayout linearLayout = new LinearLayout(l4Var.I);
                        linearLayout.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
                        linearLayout.setOrientation(1);
                        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(l4Var.I, (org.telegram.ui.ActionBar.f6) null);
                        m4Var.setText(LocaleController.getString(R.string.FontSize));
                        linearLayout.addView(m4Var, k7.b6.t(-2, -2, 51, 3, 1, 3, 0));
                        linearLayout.addView(new org.telegram.ui.h4(l4Var, l4Var.I), k7.b6.t(-1, -2, 51, 3, 0, 3, 0));
                        org.telegram.ui.Cells.m4 m4Var2 = new org.telegram.ui.Cells.m4(l4Var.I, (org.telegram.ui.ActionBar.f6) null);
                        m4Var2.setText(LocaleController.getString(R.string.FontType));
                        linearLayout.addView(m4Var2, k7.b6.t(-2, -2, 51, 3, 4, 3, 2));
                        int i27 = 0;
                        for (int i28 = 2; i27 < i28; i28 = 2) {
                            Activity activity4 = l4Var.I;
                            org.telegram.ui.l0 l0Var = new org.telegram.ui.l0(activity4);
                            l0Var.setBackgroundDrawable(j6.f0(j6.w0(null, j6.f19996i6, false), i28, -1));
                            RadioButton radioButton = new RadioButton(activity4);
                            l0Var.f35859b = radioButton;
                            radioButton.setSize(AndroidUtilities.dp(20.0f));
                            radioButton.b(j6.w0(null, j6.D5, false), j6.w0(null, j6.E5, false));
                            boolean z15 = LocaleController.isRTL;
                            if (z15) {
                                i13 = 5;
                            } else {
                                i13 = 3;
                            }
                            int i29 = i13 | 48;
                            if (z15) {
                                i14 = 0;
                            } else {
                                i14 = 22;
                            }
                            float f11 = i14;
                            if (z15) {
                                i15 = 22;
                            } else {
                                i15 = 0;
                            }
                            l0Var.addView(radioButton, k7.b6.d(22, 22.0f, i29, f11, 13.0f, i15, 0.0f));
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
                            boolean z16 = LocaleController.isRTL;
                            if (z16) {
                                i17 = 5;
                            } else {
                                i17 = 3;
                            }
                            int i30 = i17 | 48;
                            int i31 = 17;
                            if (z16) {
                                i18 = 17;
                            } else {
                                i18 = 62;
                            }
                            float f12 = i18;
                            if (z16) {
                                i31 = 62;
                            }
                            l0Var.addView(textView, k7.b6.d(-1, -1.0f, i30, f12, 0.0f, i31, 0.0f));
                            l0VarArr[i27] = l0Var;
                            if (i27 != 0) {
                                if (i27 == 1) {
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
                            org.telegram.ui.l0 l0Var2 = l0VarArr[i27];
                            if (i27 == l4Var.f36475a) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            ((RadioButton) l0Var2.f35859b).a(z11, false);
                            l0VarArr[i27].setTag(Integer.valueOf(i27));
                            l0VarArr[i27].setOnClickListener(new org.telegram.ui.u(l4Var, 4));
                            linearLayout.addView(l0VarArr[i27], k7.b6.n(-1, 50));
                            i27++;
                        }
                        g3Var.customView = linearLayout;
                        l4Var.F = g3Var;
                        l4Var.a0(g3Var);
                        return;
                    } else if (num.intValue() == 5) {
                        if (l4Var.f35945r0[0].f() && l4Var.f35945r0[0].getWebView() != null) {
                            l4Var.f35945r0[0].getWebView().reload();
                            return;
                        }
                        return;
                    } else if (num.intValue() == 10 && (e2Var = l4Var.f35945r0[0].f37167y) != null && e2Var.b() != null) {
                        l4Var.h(e2Var.b(), null, 1);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 14:
                org.telegram.ui.p3 p3Var2 = (org.telegram.ui.p3) obj3;
                Activity activity5 = (Activity) obj2;
                String str11 = (String) obj;
                if (!TextUtils.isEmpty(str11) && p3Var2.getWebView() != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str11.trim());
                    AndroidUtilities.addLinksSafe(spannableStringBuilder, 1, false, true);
                    URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                    int length = spannableStringBuilder.length();
                    int i32 = 0;
                    while (i21 < uRLSpanArr.length) {
                        length = Math.min(spannableStringBuilder.getSpanStart(uRLSpanArr[i21]), length);
                        i32 = Math.max(spannableStringBuilder.getSpanEnd(uRLSpanArr[i21]), i32);
                        i21++;
                    }
                    Uri uriParseSafe = Utilities.uriParseSafe(str11);
                    if (uriParseSafe == null || !TextUtils.equals(uriParseSafe.getScheme(), "javascript")) {
                        if ((uRLSpanArr.length > 0 && length == 0 && i32 > 0) || (uriParseSafe != null && uriParseSafe.getScheme() != null)) {
                            if (uriParseSafe != null && uriParseSafe.getScheme() == null && uriParseSafe.getHost() == null && uriParseSafe.getPath() != null) {
                                str11 = af.g.v(uriParseSafe, "https", null, uriParseSafe.getPath(), "/");
                            }
                            p3Var2.getWebView().loadUrl(str11);
                            return;
                        }
                        org.telegram.ui.web.k.b(activity5, str11);
                        org.telegram.ui.web.w0 webView = p3Var2.getWebView();
                        String str12 = org.telegram.ui.web.l1.a().f39571b;
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
                xn xnVar2 = (xn) obj3;
                Long l11 = (Long) obj;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = new TLRPC.TL_messages_sendQuickReplyMessages();
                tL_messages_sendQuickReplyMessages.peer = xnVar2.getMessagesController().getInputPeer(xnVar2.Q5);
                tL_messages_sendQuickReplyMessages.shortcut_id = ((uf.o1) obj2).f45407a;
                xnVar2.getConnectionsManager().sendRequest(tL_messages_sendQuickReplyMessages, null);
                jk jkVar2 = xnVar2.V;
                if (jkVar2 != null) {
                    jkVar2.setFieldText(null);
                    return;
                }
                return;
            case 16:
                xn xnVar3 = (xn) obj3;
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of((String) obj2, xnVar3.Q5, xnVar3.f40076k5, xnVar3.U3, null, false, null, null, null, true, 0, 0, null, false);
                of2.sendMessageChatArguments = xnVar3.C8();
                of2.payStars = ((Long) obj).longValue();
                of2.monoForumPeer = xnVar3.N8();
                of2.suggestionParams = xnVar3.f39989d5;
                xnVar3.getSendMessagesHelper().sendMessage(of2);
                xnVar3.V.setFieldText("");
                xnVar3.e9(false);
                return;
            case 17:
                xn xnVar4 = (xn) obj3;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj2;
                Long l12 = (Long) obj;
                if (xnVar4.O3 == 1) {
                    org.telegram.ui.Components.z4.M(xnVar4.getParentActivity(), xnVar4.Q5, new d7(xnVar4, botInlineResult, l12, 2), xnVar4.f39968ba);
                    return;
                } else {
                    xnVar4.cb(botInlineResult, true, 0, l12.longValue());
                    return;
                }
            case 18:
                xn.q1((xn) obj3, (p31[]) obj2, (o70) obj);
                return;
            case 19:
                xn xnVar5 = (xn) obj3;
                org.telegram.ui.ActionBar.d2[] d2VarArr = (org.telegram.ui.ActionBar.d2[]) obj2;
                TL_stats.TL_statsPollStats tL_statsPollStats = (TL_stats.TL_statsPollStats) obj;
                try {
                    d2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                d2VarArr[0] = null;
                if (tL_statsPollStats != null) {
                    if (tL_statsPollStats.votes_graph instanceof TL_stats.TL_statsGraphError) {
                        a2.v(R.string.PollStatsWillLater, qc.a0(xnVar5), R.raw.timer_toast, 24);
                        return;
                    } else {
                        new gh.g(xnVar5.getParentActivity(), xnVar5.f39968ba, tL_statsPollStats).show();
                        return;
                    }
                }
                return;
            case 20:
                xn xnVar6 = (xn) obj3;
                MessageObject messageObject = (MessageObject) obj2;
                xnVar6.getClass();
                TLRPC.SuggestedPost tl = ((MessageSuggestionParams) obj).toTl();
                if (messageObject != null && messageObject.messageOwner != null && tl != null) {
                    xnVar6.getMessagesController().addOfferToSuggestedMessage(messageObject, tl);
                    return;
                }
                return;
            case 21:
                uf.o1 o1Var = (uf.o1) obj2;
                String str13 = (String) obj;
                xn xnVar7 = ((jj) obj3).f35363b;
                if (o1Var != null) {
                    i19 = ((org.telegram.ui.ActionBar.p2) xnVar7).currentAccount;
                    uf.p1.f(i19).k(o1Var.f45407a, str13);
                }
                xnVar7.N3 = str13;
                xnVar7.X0.setTitle(str13);
                return;
            case 22:
                MessageObject messageObject2 = (MessageObject) obj2;
                Long l13 = (Long) obj;
                xn xnVar8 = ((jn) obj3).f35381a;
                if (xnVar8.f7()) {
                    SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of(messageObject2.getDiceEmoji(), xnVar8.Q5, xnVar8.f40076k5, xnVar8.U3, null, false, null, null, null, true, 0, 0, null, false);
                    of3.sendMessageChatArguments = xnVar8.C8();
                    of3.dice_stake = l13.longValue();
                    xnVar8.getSendMessagesHelper().sendMessage(of3);
                    return;
                }
                return;
            case 23:
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) obj2;
                xn xnVar9 = ((jn) obj3).f35381a;
                if (((Boolean) obj).booleanValue()) {
                    while (i21 < xnVar9.f40193u0.getChildCount()) {
                        View childAt = xnVar9.f40193u0.getChildAt(i21);
                        if (childAt instanceof org.telegram.ui.Cells.t1) {
                            org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) childAt;
                            if (t1Var2.getMessageObject() != null && t1Var2.getMessageObject().isSensitive()) {
                                t1Var2.h4();
                            }
                        }
                        i21++;
                    }
                    return;
                }
                if (t1Var.getMessageObject() != null) {
                    t1Var.getMessageObject().isSensitiveCached = Boolean.FALSE;
                }
                t1Var.h4();
                return;
            case 24:
                jn jnVar = (jn) obj3;
                a1 a1Var = (a1) obj2;
                xn xnVar10 = jnVar.f35381a;
                if (!((Boolean) obj).booleanValue()) {
                    qc.a0(xnVar10).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    return;
                }
                xnVar10.getMessagesController().setContentSettings(true);
                qc.a0(xnVar10).P(R.raw.chats_infotip, AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.SensitiveContentSettingsToast), new um(jnVar, 8)), true)).k(true);
                a1Var.run(Boolean.TRUE);
                return;
            case 25:
                TLRPC.Message message = (TLRPC.Message) obj2;
                ((jn) obj3).f35381a.getMessagesController().rejectSuggestedMessage(DialogObject.getPeerDialogId(message.peer_id), message.f19205id, (String) obj);
                return;
            case 26:
                ao aoVar = (ao) obj3;
                aoVar.f32677f.t(((qf.a) obj).f43051b, ((TLRPC.WallPaper) obj2).settings.intensity);
                View view = aoVar.f32675b;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 27:
                Long l14 = (Long) obj;
                ChatActivityEnterView chatActivityEnterView = ((ef) obj3).f24562a;
                long j11 = chatActivityEnterView.M2;
                MessageObject messageObject3 = chatActivityEnterView.P2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                SendMessagesHelper.SendMessageParams of4 = SendMessagesHelper.SendMessageParams.of((String) obj2, j11, messageObject3, threadMessage, null, false, null, null, null, true, 0, 0, null, false);
                xn xnVar11 = chatActivityEnterView.L2;
                if (xnVar11 != null) {
                    sendMessageChatArguments = xnVar11.C8();
                }
                of4.sendMessageChatArguments = sendMessageChatArguments;
                of4.effect_id = chatActivityEnterView.O4;
                of4.payStars = l14.longValue();
                of4.monoForumPeer = chatActivityEnterView.getSendMonoForumPeerId();
                of4.suggestionParams = chatActivityEnterView.getSendMessageSuggestionParams();
                SendMessagesHelper.getInstance(chatActivityEnterView.N).sendMessage(of4);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.f22786j0.c();
                oe oeVar = chatActivityEnterView.G0;
                chatActivityEnterView.O4 = 0L;
                oeVar.setEffect(0L);
                return;
            case 28:
                li liVar = (li) obj3;
                ((xn) obj2).f39989d5 = (MessageSuggestionParams) obj;
                boolean G1 = liVar.G1(0, true, 0, liVar.s1(), liVar.K0);
                cf cfVar = liVar.f26695e0;
                if (cfVar != null) {
                    cfVar.h(!G1);
                    liVar.f26695e0 = null;
                    return;
                }
                return;
            default:
                ((rh.o3) obj3).getWebViewContainer().C((String) obj2, (String) obj, false);
                return;
        }
    }
}
