package gh;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.net.Uri;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import hh.k7;
import hh.m7;
import java.io.File;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import lh.cc;
import lh.k9;
import lh.ma;
import lh.oa;
import lh.pc;
import lh.q9;
import lh.qc;
import lh.r9;
import lh.rb;
import lh.sb;
import lh.t9;
import lh.u6;
import lh.va;
import lh.wb;
import lh.xb;
import lh.z7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.rl;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.sp0;
import org.telegram.ui.Components.wq0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ck;
import org.telegram.ui.rn;

public final class d1 implements Utilities.Callback {

    public final int f7191a;

    public final Object f7192b;

    public final Object f7193c;

    public d1(int i10, Object obj, Object obj2) {
        this.f7191a = i10;
        this.f7192b = obj;
        this.f7193c = obj2;
    }

    private final void a(Object obj) {
        org.telegram.ui.web.c2 c2Var;
        String url;
        String openURL;
        File file;
        String url2;
        FrameLayout frameLayout;
        String url3;
        org.telegram.ui.m4 m4Var = (org.telegram.ui.m4) this.f7192b;
        Activity activity = (Activity) this.f7193c;
        Integer num = (Integer) obj;
        org.telegram.ui.z3 z3Var = m4Var.G;
        org.telegram.ui.n0[] n0VarArr = m4Var.O0;
        if ((m4Var.f40347q0[0].c() && m4Var.f40347q0[0].f41497c.A == null) || m4Var.H == null) {
            return;
        }
        if (num.intValue() == 1) {
            org.telegram.ui.o0 o0Var = m4Var.f40335d0;
            int iDp = AndroidUtilities.dp(56.0f);
            m4Var.E0 = iDp;
            o0Var.setHeight(iDp);
            m4Var.f40335d0.h(true);
            return;
        }
        if (num.intValue() == 2) {
            if (!m4Var.f40347q0[0].f()) {
                TLRPC.WebPage webPage = m4Var.f40347q0[0].f41497c.A;
                if (webPage == null) {
                    return;
                } else {
                    url3 = webPage.url;
                }
            } else if (m4Var.f40347q0[0].getWebView() == null) {
                return;
            } else {
                url3 = m4Var.f40347q0[0].getWebView().getUrl();
            }
            String strS = org.telegram.ui.web.z0.s(url3);
            m4Var.a0(new sp0(m4Var.H, null, strS, false, strS, false, AndroidUtilities.computePerceivedBrightness(m4Var.f40335d0.getBackgroundColor()) < 0.721f ? new jh.b() : null));
            return;
        }
        if (num.intValue() == 6) {
            if (!m4Var.f40347q0[0].f()) {
                org.telegram.ui.q3 q3Var = m4Var.f40347q0[0];
                TLRPC.WebPage webPage2 = q3Var.f41497c.A;
                if (webPage2 == null) {
                    return;
                }
                url2 = webPage2.url;
                frameLayout = q3Var;
            } else {
                if (m4Var.f40347q0[0].getWebView() == null) {
                    return;
                }
                url2 = m4Var.f40347q0[0].getWebView().getUrl();
                frameLayout = m4Var.f40347q0[0].f41499f;
            }
            org.telegram.ui.m4.f(url2, m4Var.T, frameLayout, z3Var, null);
            return;
        }
        if (num.intValue() == 7) {
            org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
            l2Var.f23619a = true;
            org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
            if (n2VarU != null) {
                n2VarU.showAsSheet(new org.telegram.ui.web.p(z3Var != null ? new org.telegram.ui.d0(m4Var, 5) : null, new org.telegram.ui.s(m4Var, 2)), l2Var);
                return;
            }
            return;
        }
        if (num.intValue() == 8) {
            org.telegram.ui.ActionBar.l2 l2Var2 = new org.telegram.ui.ActionBar.l2();
            l2Var2.f23619a = true;
            org.telegram.ui.ActionBar.n2 n2VarU2 = LaunchActivity.U();
            if (n2VarU2 != null) {
                n2VarU2.showAsSheet(new org.telegram.ui.web.d1(z3Var != null ? new org.telegram.ui.d0(m4Var, 6) : null, new org.telegram.ui.s(m4Var, 3)), l2Var2);
                return;
            }
            return;
        }
        if (num.intValue() == 9) {
            if (m4Var.f40347q0[0].getWebView() != null) {
                m4Var.f40347q0[0].getWebView().goForward();
                return;
            }
            return;
        }
        if (num.intValue() == 3) {
            if (!m4Var.f40347q0[0].f()) {
                TLRPC.WebPage webPage3 = m4Var.f40347q0[0].f41497c.A;
                if (webPage3 == null) {
                    return;
                }
                String str = webPage3.url;
                TL_iv.Page page = webPage3.cached_page;
                if (page != null) {
                    file = page.local;
                    url = str;
                    openURL = null;
                } else {
                    url = str;
                    openURL = null;
                    file = null;
                }
            } else {
                if (m4Var.f40347q0[0].getWebView() == null) {
                    return;
                }
                url = m4Var.f40347q0[0].getWebView().getUrl();
                openURL = m4Var.f40347q0[0].getWebView().getOpenURL();
                file = null;
            }
            Activity activity2 = m4Var.H;
            if (activity2 == null || activity2.isFinishing()) {
                return;
            }
            if (file != null) {
                AndroidUtilities.openForView(file, null, "text/markdown", m4Var.H, null, true);
                return;
            }
            if (url == null) {
                return;
            }
            String hostAuthority = AndroidUtilities.getHostAuthority(openURL, true);
            String hostAuthority2 = AndroidUtilities.getHostAuthority(url, true);
            org.telegram.ui.a0 a0Var = new org.telegram.ui.a0(m4Var, url, 1);
            org.telegram.ui.b0 b0Var = new org.telegram.ui.b0(m4Var, hostAuthority2, hostAuthority, 1);
            if (m4Var.f40347q0[0].f() && MessagesController.getInstance(m4Var.T).isWebBrowserOpenInApp(hostAuthority2) && !MessagesController.getInstance(m4Var.T).isWebBrowserExceptionsLimitReached(true)) {
                org.telegram.ui.Components.y4.o0(activity, null, url, true, new cg.u0(10, b0Var, a0Var));
                return;
            } else {
                a0Var.run();
                return;
            }
        }
        if (num.intValue() != 4) {
            if (num.intValue() == 5) {
                if (!m4Var.f40347q0[0].f() || m4Var.f40347q0[0].getWebView() == null) {
                    return;
                }
                m4Var.f40347q0[0].getWebView().reload();
                return;
            }
            if (num.intValue() != 10 || (c2Var = m4Var.f40347q0[0].f41505y) == null || c2Var.b() == null) {
                return;
            }
            m4Var.h(c2Var.b(), null, 1);
            return;
        }
        if (m4Var.f40347q0[0].f()) {
            org.telegram.ui.ActionBar.n2 n2VarU3 = LaunchActivity.U();
            if (n2VarU3 != null) {
                org.telegram.ui.ActionBar.l2 l2Var3 = new org.telegram.ui.ActionBar.l2();
                l2Var3.f23619a = true;
                n2VarU3.showAsSheet(new org.telegram.ui.web.v1(new org.telegram.ui.s(m4Var, 3)), l2Var3);
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(m4Var.H, null, false, false);
        e3Var.fixNavigationBar();
        e3Var.applyTopPadding = false;
        LinearLayout linearLayout = new LinearLayout(m4Var.H);
        linearLayout.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
        linearLayout.setOrientation(1);
        org.telegram.ui.Cells.j4 j4Var = new org.telegram.ui.Cells.j4(m4Var.H, (org.telegram.ui.ActionBar.c6) null);
        j4Var.setText(LocaleController.getString(R.string.FontSize));
        linearLayout.addView(j4Var, h7.z5.t(-2, -2, 51, 3, 1, 3, 0));
        linearLayout.addView(new org.telegram.ui.i4(m4Var, m4Var.H), h7.z5.t(-1, -2, 51, 3, 0, 3, 0));
        org.telegram.ui.Cells.j4 j4Var2 = new org.telegram.ui.Cells.j4(m4Var.H, (org.telegram.ui.ActionBar.c6) null);
        j4Var2.setText(LocaleController.getString(R.string.FontType));
        linearLayout.addView(j4Var2, h7.z5.t(-2, -2, 51, 3, 4, 3, 2));
        int i10 = 0;
        for (int i11 = 2; i10 < i11; i11 = 2) {
            Activity activity3 = m4Var.H;
            org.telegram.ui.n0 n0Var = new org.telegram.ui.n0(activity3);
            n0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23144i6, false), i11, -1));
            RadioButton radioButton = new RadioButton(activity3);
            n0Var.f40617b = radioButton;
            radioButton.setSize(AndroidUtilities.dp(20.0f));
            radioButton.b(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.D5, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E5, false));
            boolean z10 = LocaleController.isRTL;
            n0Var.addView(radioButton, h7.z5.d(22, 22.0f, (z10 ? 5 : 3) | 48, z10 ? 0 : 22, 13.0f, z10 ? 22 : 0, 0.0f));
            TextView textView = new TextView(activity3);
            rl.p(textView, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false), 1, 16.0f, 1);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            boolean z11 = LocaleController.isRTL;
            n0Var.addView(textView, h7.z5.d(-1, -1.0f, (z11 ? 5 : 3) | 48, z11 ? 17 : 62, 0.0f, z11 ? 62 : 17, 0.0f));
            n0VarArr[i10] = n0Var;
            if (i10 == 0) {
                String string = LocaleController.getString(R.string.Default);
                Typeface typeface = Typeface.DEFAULT;
                textView.setText(string);
                textView.setTypeface(typeface);
                n0Var.setContentDescription(string);
                n0Var.invalidate();
            } else if (i10 == 1) {
                Typeface typeface2 = Typeface.SERIF;
                textView.setText("Serif");
                textView.setTypeface(typeface2);
                n0Var.setContentDescription("Serif");
                n0Var.invalidate();
            }
            ((RadioButton) n0VarArr[i10].f40617b).a(i10 == m4Var.f37284a, false);
            n0VarArr[i10].setTag(Integer.valueOf(i10));
            n0VarArr[i10].setOnClickListener(new org.telegram.ui.t(m4Var, 4));
            linearLayout.addView(n0VarArr[i10], h7.z5.n(-1, 50));
            i10++;
        }
        e3Var.customView = linearLayout;
        m4Var.E = e3Var;
        m4Var.a0(e3Var);
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        int i10;
        int i11;
        int iV0;
        rn rnVar;
        ck ckVar;
        int i12 = this.f7191a;
        int i13 = 2;
        String string = null;
        int i14 = 0;
        Object obj2 = this.f7193c;
        Object obj3 = this.f7192b;
        switch (i12) {
            case 0:
                k2 k2Var = (k2) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                Boolean bool = (Boolean) obj;
                k2Var.getClass();
                if (callback != null) {
                    callback.run(bool);
                }
                if (bool.booleanValue()) {
                    k2Var.skipDismissAnimation();
                }
                k2Var.dismiss();
                break;
            case 1:
                k1 k1Var = (k1) obj2;
                if (((Object[]) obj)[1] == ((m7) obj3)) {
                    k1Var.run();
                }
                break;
            case 2:
                wq0 wq0Var = (wq0) obj3;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj2;
                String str = (String) obj;
                k7 k7Var = wq0Var.f7200e;
                int i15 = tL_starGiftCollection.collection_id;
                k7Var.getClass();
                TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
                int i16 = k7Var.f9611a;
                updatestargiftcollection.peer = MessagesController.getInstance(i16).getInputPeer(k7Var.f9612b);
                updatestargiftcollection.collection_id = i15;
                updatestargiftcollection.flags |= 1;
                updatestargiftcollection.title = str;
                ConnectionsManager.getInstance(i16).sendRequest(updatestargiftcollection, null);
                tL_starGiftCollection.title = str;
                wq0Var.f(true);
                break;
            case 3:
                m6 m6Var = (m6) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                long j10 = m6Var.V;
                Runnable runnable = m6Var.f7440c0;
                if (runnable != null) {
                    runnable.run();
                }
                m6Var.dismiss();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.giftsToUserSent, new Object[0]);
                AndroidUtilities.runOnUIThread(new d6(i14, user), 250L);
                MessagesController.getInstance(m6Var.U).getMainSettings().edit().putBoolean("show_gift_for_" + j10, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j10, true).apply();
                break;
            case 4:
                hh.i5 i5Var = (hh.i5) obj3;
                String str2 = (String) obj2;
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                hh.e5 e5Var = i5Var.f9451a0;
                nh.j[] jVarArr = i5Var.f9475o0;
                lh.d dVar = i5Var.f9461f0;
                if (stargiftupgradepreview != null) {
                    e5Var.setPreviewingAttributes(stargiftupgradepreview.sample_attributes);
                    i5Var.q2(1, false, null);
                    e5Var.i(1, LocaleController.getString(R.string.Gift2LearnMoreTitle), LocaleController.formatString(R.string.Gift2LearnMoreText, str2), null);
                    jVarArr[0].setText(LocaleController.getString(R.string.Gift2UpgradeFeature1TextLearn));
                    jVarArr[1].setText(LocaleController.getString(R.string.Gift2UpgradeFeature2TextLearn));
                    jVarArr[2].setText(LocaleController.getString(R.string.Gift2UpgradeFeature3TextLearn));
                    i5Var.f9477q0.setVisibility(8);
                    i5Var.f9476p0.setVisibility(8);
                    dVar.setFilled(true);
                    dVar.g(LocaleController.getString(R.string.OK), false, true);
                    dVar.f(null, false);
                    dVar.setOnClickListener(new hh.n1(i5Var, 4));
                    i5Var.show();
                    break;
                }
                break;
            case 5:
                hh.i5.m0((hh.i5) obj3, (org.telegram.ui.ActionBar.b2) obj2, (TL_stars.SavedStarGift) obj);
                break;
            case 6:
                hh.g4 g4Var = (hh.g4) obj3;
                g4Var.getClass();
                ((hh.e4) obj2).a((TL_stars.StarGift) obj, true);
                g4Var.d(true);
                break;
            case 7:
                hh.m4 m4Var = (hh.m4) obj3;
                hf.b bVar = (hf.b) obj2;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) obj;
                we.d dVar2 = m4Var.f9725n;
                if (dVar2 != null && bVar == m4Var.f9728q) {
                    dVar2.c(false);
                }
                m4Var.f9727p.remove(bVar);
                if (tL_payments_paymentFormStarGift != null) {
                    m4Var.f9726o.put(bVar, new hh.k4(bVar, tL_payments_paymentFormStarGift));
                    m4Var.a(true);
                }
                break;
            case 8:
                ((Utilities.Callback2) obj3).run((hf.a) obj, new f2.r((hh.x0[]) obj2, 29));
                break;
            case 9:
                lh.j2 j2Var = (lh.j2) obj3;
                pc pcVar = (pc) obj;
                j2Var.getClass();
                lh.g2 g2Var = ((lh.g2[]) obj2)[0];
                StringBuilder sb2 = new StringBuilder();
                sb2.append(pcVar == null ? "🌤" : pcVar.f16550c);
                sb2.append(" ");
                sb2.append(pcVar == null ? qc.b() ? "24°C" : "72°F" : pcVar.a());
                CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(sb2.toString(), j2Var.f16169b.getFontMetricsInt(), false);
                lh.j2 j2Var2 = g2Var.f16030o;
                StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(charSequenceReplaceEmoji, j2Var2.f16169b, AndroidUtilities.displaySize.x * 0.8f, TextUtils.TruncateAt.END), j2Var2.f16169b, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                g2Var.f16026k = staticLayout;
                g2Var.f16027l = staticLayout.getLineCount() > 0 ? g2Var.f16026k.getLineWidth(0) : 0.0f;
                g2Var.f16028m = g2Var.f16026k.getLineCount() > 0 ? g2Var.f16026k.getLineLeft(0) : 0.0f;
                g2Var.f15950b = AndroidUtilities.dpf2(17.6f) + g2Var.f16027l;
                g2Var.f15951c = AndroidUtilities.dpf2(36.0f);
                j2Var.invalidate();
                j2Var.requestLayout();
                break;
            case 10:
                va vaVar = (va) obj3;
                rb rbVar = (rb) obj2;
                int iMax = Math.max(0, Math.max(((Integer) obj).intValue() - rbVar.getBottomPadding2(), vaVar.f15987p2 - rbVar.getPaddingUnderContainer()));
                vaVar.S();
                if (iMax > 0) {
                    zf.j jVar = vaVar.F0;
                    if ((jVar instanceof zf.v2) && ((zf.v2) jVar).getEditText().isFocused()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                }
                AnimatorSet animatorSet = vaVar.J1;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                vaVar.J1 = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                zf.w1 w1Var = vaVar.Z0;
                Property property = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(w1Var, (Property<zf.w1, Float>) property, iMax > 0 ? Math.min(0.0f, ((-iMax) / 2.0f) - AndroidUtilities.dp(8.0f)) : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(vaVar.P0, (Property<lh.b6, Float>) property, iMax > 0 ? Math.min(0, AndroidUtilities.dp(40.0f) + (-iMax)) : 0));
                lh.m5 m5Var = vaVar.S0;
                Property property2 = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(m5Var, (Property<lh.m5, Float>) property2, z10 ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(vaVar.f16001x0, (Property<zf.j1, Float>) property2, (!z10 || vaVar.f16002x1) ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(vaVar.f15999w0, (Property<zf.f1, Float>) property2, (!z10 || vaVar.f16002x1) ? 1.0f : 0.0f));
                vaVar.T0();
                vaVar.J1.playTogether(arrayList);
                if (z10) {
                    vaVar.J1.setDuration(250L);
                    vaVar.J1.setInterpolator(org.telegram.ui.ActionBar.p1.f23706w);
                } else {
                    vaVar.J1.setDuration(350L);
                    vaVar.J1.setInterpolator(er.h);
                }
                vaVar.J1.start();
                for (int i17 = 0; i17 < arrayList.size(); i17++) {
                    ((Animator) arrayList.get(i17)).setDuration(z10 ? 350L : 250L);
                    ((Animator) arrayList.get(i17)).setInterpolator(z10 ? er.h : org.telegram.ui.ActionBar.p1.f23706w);
                    ((Animator) arrayList.get(i17)).start();
                }
                if (!z10) {
                    vaVar.P0(false);
                }
                if (vaVar.f15964d2 != z10) {
                    vaVar.g0();
                }
                vaVar.f15964d2 = z10;
                break;
            case 11:
                lh.f6 f6Var = (lh.f6) obj3;
                lh.o5 o5Var = (lh.o5) obj2;
                pc pcVar2 = (pc) obj;
                if (pcVar2 != null) {
                    o5Var.dismiss();
                    f6Var.z0(false);
                    f6Var.d0(f6Var.p0(pcVar2));
                }
                break;
            case 12:
                lh.f6 f6Var2 = (lh.f6) obj3;
                zf.p0 p0Var = (zf.p0) obj2;
                zf.m0 m0Var = (zf.m0) obj;
                if (p0Var != null) {
                    int i18 = f6Var2.B1;
                    p0Var.f50658q0 = m0Var;
                    p0Var.m0.b(i18, m0Var, false);
                    p0Var.m();
                    f6Var2.d0(p0Var);
                } else {
                    f6Var2.d0(f6Var2.i0(m0Var));
                }
                break;
            case 13:
                k9 k9Var = (k9) obj3;
                ((b70) obj2).u();
                k9Var.g(true);
                q9 q9Var = k9Var.S;
                t9 t9Var = q9Var.T;
                if (t9Var != null) {
                    t9Var.run(new HashSet(q9Var.v));
                }
                break;
            case 14:
                k9 k9Var2 = (k9) obj3;
                k9Var2.S.C = true;
                ((ar[]) obj2)[0].dismiss();
                k9Var2.g(true);
                break;
            case 15:
                oa oaVar = (oa) obj3;
                Utilities.Callback callback2 = (Utilities.Callback) obj2;
                Integer num = (Integer) obj;
                sb sbVar = oaVar.f16494a;
                boolean zQ0 = sbVar.q0();
                int i19 = sbVar.f16749c;
                if (zQ0) {
                    try {
                        sbVar.f16783n.performHapticFeedback(3, 1);
                        break;
                    } catch (Exception unused) {
                    }
                }
                sbVar.L1 = false;
                u6 u6Var = sbVar.f16822y0;
                if (u6Var != null) {
                    u6Var.c(false);
                }
                if (sbVar.C1 != null) {
                    try {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(sbVar.C1.getAbsolutePath(), options);
                        i10 = options.outWidth;
                        try {
                            i11 = options.outHeight;
                        } catch (Exception unused2) {
                            i11 = -1;
                        }
                    } catch (Exception unused3) {
                        i10 = -1;
                    }
                    int i20 = num.intValue() == -1 ? 0 : 90;
                    if (num.intValue() == -1) {
                        if (i10 > i11) {
                            i20 = 270;
                        }
                    } else if (i11 > i10 && i20 != 0) {
                        i20 = 0;
                    }
                    z7 z7VarM = z7.m(i20, sbVar.C1);
                    z7VarM.J0 = sbVar.f16797r0;
                    z7VarM.K0 = sbVar.f16801s0;
                    if (sbVar.f16814w0.j()) {
                        sbVar.C1 = null;
                        if (sbVar.f16814w0.l(z7VarM)) {
                            z7 z7VarA = z7.a(sbVar.f16814w0.getLayout(), sbVar.f16814w0.getContent());
                            sbVar.G1 = z7VarA;
                            r9.a(i19, z7VarA);
                            sbVar.H1 = false;
                            if (callback2 != null) {
                                callback2.run(null);
                            }
                        } else if (callback2 != null) {
                            callback2.run(null);
                        }
                        sbVar.m0(true);
                    } else {
                        sbVar.G1 = z7VarM;
                        r9.a(i19, z7VarM);
                        sbVar.H1 = false;
                        if (callback2 != null) {
                            callback2.run(new ma(oaVar, i13));
                        } else {
                            sbVar.K(1, true);
                        }
                    }
                    break;
                }
                break;
            case 16:
                xb xbVar = (xb) obj2;
                Float f10 = (Float) obj;
                xbVar.f17062i = f10.floatValue();
                wb wbVar = ((cc) obj3).f15764a;
                if (wbVar != null) {
                    wbVar.P0(f10.floatValue(), xbVar.f17056a);
                }
                break;
            case 17:
                nh.t0 t0Var = (nh.t0) obj3;
                org.telegram.ui.web.s sVar = (org.telegram.ui.web.s) obj2;
                int[] iArr = (int[]) obj;
                t0Var.getClass();
                boolean z11 = false;
                while (i14 < iArr.length) {
                    if (iArr[i14] == 0) {
                        z11 = true;
                    }
                    i14++;
                }
                t0Var.d = true;
                t0Var.f18967e = true;
                t0Var.l();
                Iterator it = t0Var.f18968f.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                sVar.run(Boolean.TRUE, Boolean.valueOf(z11));
                break;
            case 18:
                nh.t0 t0Var2 = (nh.t0) obj3;
                Runnable runnable2 = (Runnable) obj2;
                int[] iArr2 = (int[]) obj;
                t0Var2.getClass();
                boolean z12 = false;
                while (i14 < iArr2.length) {
                    if (iArr2[i14] == 0) {
                        z12 = true;
                    }
                    i14++;
                }
                t0Var2.d = z12;
                t0Var2.f18967e = z12;
                t0Var2.l();
                Iterator it2 = t0Var2.f18968f.iterator();
                while (it2.hasNext()) {
                    ((Runnable) it2.next()).run();
                }
                if (runnable2 != null) {
                    runnable2.run();
                }
                break;
            case 19:
                ((File[]) obj3)[0] = (File) obj;
                ((nh.c1) obj2).run();
                break;
            case 20:
                ((nh.w2) obj3).d.f18599x.C((String) obj2, (String) obj, false);
                break;
            case 21:
                oh.f fVar = (oh.f) obj3;
                fVar.getClass();
                fVar.W(((TLRPC.Chat) obj2).f22380id, ((Boolean) obj).booleanValue());
                break;
            case 22:
                oh.f fVar2 = (oh.f) obj3;
                fVar2.getClass();
                fVar2.V((String) obj2, ((Boolean) obj).booleanValue());
                break;
            case 23:
                oh.j0 j0Var = (oh.j0) obj3;
                j0Var.V((TLRPC.Chat) obj2, j0Var.f19500e, ((Boolean) obj).booleanValue());
                break;
            case 24:
                ((VoIPDebugToSend) obj3).lambda$done$0((TL_phone.saveCallDebug) obj2, (TLRPC.InputFile) obj);
                break;
            case 25:
                org.telegram.ui.ActionBar.m3 m3Var = (org.telegram.ui.ActionBar.m3) obj3;
                org.telegram.ui.ActionBar.l3 l3Var = (org.telegram.ui.ActionBar.l3) obj2;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                if (n2Var != null) {
                    if ((n2Var instanceof rn) && (ckVar = (rnVar = (rn) n2Var).U) != null) {
                        ckVar.P();
                        rnVar.U.n0(true, false, true);
                    }
                    if (n2Var.getContext() != null && n2Var.getParentActivity() != null) {
                        nh.b3 b3Var = new nh.b3(n2Var.getContext(), n2Var.getResourceProvider());
                        b3Var.f18579g0 = n2Var.getParentActivity();
                        if (l3Var != null && l3Var.f23623a != null) {
                            b3Var.A0 = true;
                            boolean z13 = l3Var.f23633m;
                            b3Var.R = z13;
                            if (z13) {
                                b3Var.v(l3Var.f23636p, false);
                            }
                            if (l3Var.f23632l) {
                                iV0 = l3Var.f23635o;
                            } else {
                                int i21 = l3Var.f23634n;
                                if (i21 < 0) {
                                    i21 = org.telegram.ui.ActionBar.g6.f23053d6;
                                }
                                iV0 = org.telegram.ui.ActionBar.g6.v0(i21, b3Var.A);
                            }
                            b3Var.t(iV0, l3Var.f23632l, false);
                            b3Var.y(l3Var.f23637q, false);
                            b3Var.B0 = l3Var.h;
                            b3Var.C0 = l3Var.f23629i;
                            boolean z14 = l3Var.f23639s;
                            b3Var.f18593s0 = z14;
                            nh.t2 t2Var = b3Var.f18599x;
                            t2Var.setIsBackButtonVisible(z14);
                            b3Var.v.setAllowSwipes(l3Var.f23630j);
                            AndroidUtilities.updateImageViewImageAnimated(b3Var.S.getBackButton(), b3Var.f18593s0 ? R.drawable.ic_ab_back : R.drawable.ic_close_white);
                            BotFullscreenButtons botFullscreenButtons = b3Var.f18581i0;
                            if (botFullscreenButtons != null) {
                                botFullscreenButtons.setBack(b3Var.f18593s0, false);
                            }
                            b3Var.f18586n0 = l3Var.f23642w;
                            b3Var.f18596v0 = Boolean.valueOf(l3Var.f23645z);
                            b3Var.f18598w0 = l3Var.A;
                            nh.x0 x0Var = l3Var.I;
                            b3Var.f18600x0 = x0Var;
                            if (x0Var != null) {
                                nh.v0 v0Var = x0Var.f19041r;
                                SensorManager sensorManager = x0Var.f19026a;
                                if (x0Var.f19035l) {
                                    x0Var.f19035l = false;
                                    if (sensorManager != null) {
                                        Sensor sensor = x0Var.f19027b;
                                        if (sensor != null) {
                                            sensorManager.registerListener(x0Var.f19037n, sensor, nh.x0.a(x0Var.f19028c));
                                        }
                                        Sensor sensor2 = x0Var.d;
                                        if (sensor2 != null) {
                                            sensorManager.registerListener(x0Var.f19039p, sensor2, nh.x0.a(x0Var.f19029e));
                                        }
                                        Sensor sensor3 = x0Var.f19031g;
                                        if (sensor3 != null) {
                                            sensorManager.registerListener(v0Var, sensor3, nh.x0.a(x0Var.h));
                                        }
                                        Sensor sensor4 = x0Var.f19030f;
                                        if (sensor4 != null) {
                                            sensorManager.registerListener(v0Var, sensor4, nh.x0.a(x0Var.h));
                                        }
                                        Sensor sensor5 = x0Var.f19032i;
                                        if (sensor5 != null) {
                                            sensorManager.registerListener(x0Var.f19043t, sensor5, nh.x0.a(x0Var.f19033j));
                                        }
                                    }
                                }
                            }
                            b6.a aVar = l3Var.f23641u;
                            if (aVar != null) {
                                nh.x2 x2Var = b3Var.f18580h0;
                                int totalHeight = x2Var.getTotalHeight();
                                x2Var.f18994e = aVar;
                                nh.t[] tVarArr = x2Var.f18995f;
                                nh.v.b(tVarArr[0].f18958l, (nh.u) aVar.f2033b, false);
                                nh.v.b(tVarArr[1].f18958l, (nh.u) aVar.d, false);
                                x2Var.invalidate();
                                if (totalHeight != x2Var.getTotalHeight() && x2Var.f18997r != null) {
                                    if (totalHeight < x2Var.getTotalHeight()) {
                                        AndroidUtilities.runOnUIThread(x2Var.f18997r, 200L);
                                    } else {
                                        x2Var.f18997r.run();
                                    }
                                }
                                int i22 = aVar.f2034c;
                                Paint paint = x2Var.f18991a;
                                x2Var.f18994e.f2034c = i22;
                                paint.setColor(i22);
                                x2Var.d.a(i22, true);
                            }
                            b3Var.x(l3Var.f23643x, false, l3Var.f23644y);
                            nh.q4 q4Var = l3Var.f23623a;
                            b3Var.C = q4Var != null ? q4Var.f18905a : UserConfig.selectedAccount;
                            org.telegram.ui.web.w0 w0Var = l3Var.f23624b;
                            if (w0Var != null) {
                                w0Var.onResume();
                                int i23 = b3Var.C;
                                org.telegram.ui.web.w0 w0Var2 = l3Var.f23624b;
                                Object obj4 = l3Var.d;
                                t2Var.I = i23;
                                t2Var.Q(w0Var2, obj4);
                                if (t2Var.f44072k0) {
                                    t2Var.v("visibility_changed", org.telegram.ui.web.z0.x(Boolean.TRUE, "is_visible"));
                                }
                                boolean z15 = l3Var.f23638r || l3Var.f23624b.f44024b;
                                String str3 = l3Var.v;
                                t2Var.g("setState(" + z15 + ", " + str3 + ")");
                                t2Var.J = z15;
                                t2Var.f44059b = str3;
                                if (org.telegram.ui.ActionBar.g6.I.q() != l3Var.B) {
                                    t2Var.w();
                                }
                            } else {
                                q4Var.f18919q = null;
                                q4Var.f18920r = 0L;
                            }
                            b3Var.s(n2Var, l3Var.f23623a);
                            b3Var.X = l3Var.f23640t;
                            if (l3Var.E) {
                                b3Var.O0 = true;
                                b3Var.i();
                                org.telegram.ui.h3 h3Var = b3Var.Q0;
                                String userName = UserObject.getUserName(MessagesController.getInstance(b3Var.C).getUser(Long.valueOf(b3Var.D)));
                                String str4 = l3Var.F;
                                b3Var.P0 = str4;
                                h3Var.a(userName, str4);
                                org.telegram.ui.h3 h3Var2 = b3Var.Q0;
                                Paint paint2 = b3Var.L;
                                h3Var2.b(AndroidUtilities.computePerceivedBrightness(paint2.getColor()) <= 0.721f, false);
                                b3Var.Q0.setBackgroundColor(paint2.getColor());
                                b3Var.Q0.setVisibility(0);
                                b3Var.Q0.setAlpha(1.0f);
                            }
                            b3Var.o(l3Var.J);
                            m3Var.h(m3Var.f23665w, l3Var, false);
                            b3Var.show();
                            break;
                        }
                    }
                }
                break;
            case 26:
                org.telegram.ui.ActionBar.s3 s3Var = (org.telegram.ui.ActionBar.s3) obj2;
                ((org.telegram.ui.ActionBar.l3) obj3).f23631k = (Bitmap) obj;
                s3Var.mo37getWindowView().setDrawingFromOverlay(false);
                s3Var.release();
                break;
            case 27:
                org.telegram.ui.ActionBar.u3 u3Var = (org.telegram.ui.ActionBar.u3) obj2;
                org.telegram.ui.ActionBar.v3 v3Var = ((org.telegram.ui.ActionBar.r3) obj3).f23751p;
                if (((Boolean) obj).booleanValue()) {
                    u3Var.a(1.0f);
                    if (v3Var.f23883a.getTabs().isEmpty()) {
                        v3Var.a(false);
                    }
                } else {
                    u3Var.a(0.0f);
                }
                break;
            case 28:
                a(obj);
                break;
            default:
                org.telegram.ui.q3 q3Var = (org.telegram.ui.q3) obj3;
                Activity activity = (Activity) obj2;
                String strV = (String) obj;
                if (!TextUtils.isEmpty(strV) && q3Var.getWebView() != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strV.trim());
                    AndroidUtilities.addLinksSafe(spannableStringBuilder, 1, false, true);
                    URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                    int length = spannableStringBuilder.length();
                    int iMax2 = 0;
                    while (i14 < uRLSpanArr.length) {
                        length = Math.min(spannableStringBuilder.getSpanStart(uRLSpanArr[i14]), length);
                        iMax2 = Math.max(spannableStringBuilder.getSpanEnd(uRLSpanArr[i14]), iMax2);
                        i14++;
                    }
                    Uri uriUriParseSafe = Utilities.uriParseSafe(strV);
                    if (uriUriParseSafe == null || !TextUtils.equals(uriUriParseSafe.getScheme(), "javascript")) {
                        if ((uRLSpanArr.length <= 0 || length != 0 || iMax2 <= 0) && (uriUriParseSafe == null || uriUriParseSafe.getScheme() == null)) {
                            org.telegram.ui.web.l.b(activity, strV);
                            org.telegram.ui.web.w0 webView = q3Var.getWebView();
                            String str5 = org.telegram.ui.web.k1.a().f43890b;
                            if (str5 != null) {
                                StringBuilder sbO = com.google.android.recaptcha.internal.a.o(str5);
                                sbO.append(URLEncoder.encode(strV));
                                string = sbO.toString();
                            }
                            webView.loadUrl(string);
                        } else {
                            if (uriUriParseSafe != null && uriUriParseSafe.getScheme() == null && uriUriParseSafe.getHost() == null && uriUriParseSafe.getPath() != null) {
                                strV = we.e.v(uriUriParseSafe, "https", null, uriUriParseSafe.getPath(), "/");
                            }
                            q3Var.getWebView().loadUrl(strV);
                        }
                    }
                }
                break;
        }
    }
}
