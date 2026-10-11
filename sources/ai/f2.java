package ai;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.File;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.video.VideoAds;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.dx0;
import org.telegram.ui.Components.jw;
import org.telegram.ui.Components.q80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ab1;
import org.telegram.ui.ae;
import org.telegram.ui.je;
import org.telegram.ui.rd;
import org.telegram.ui.sd;
import org.telegram.ui.t70;
import org.telegram.ui.uy0;
import org.telegram.ui.zn;
public final class f2 implements View.OnClickListener {
    public final int f935a;
    public final Object f936b;
    public final Object f937c;

    public f2(int i10, Object obj, Object obj2) {
        this.f935a = i10;
        this.f936b = obj;
        this.f937c = obj2;
    }

    @Override
    public final void onClick(View view) {
        Integer num;
        y5 y5Var;
        CharSequence charSequence;
        String str;
        String str2;
        Bitmap bitmap;
        String str3;
        String str4;
        String str5;
        String str6;
        boolean z10;
        switch (this.f935a) {
            case 0:
                d2 d2Var = (d2) this.f936b;
                Context context = (Context) this.f937c;
                if (d2Var != null) {
                    int i10 = d2Var.f809e;
                    if (i10 != UserConfig.selectedAccount) {
                        LaunchActivity launchActivity = LaunchActivity.G1;
                        if (launchActivity != null) {
                            launchActivity.K0(i10);
                        } else {
                            return;
                        }
                    }
                    org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                    if (U != null) {
                        TL_stories.StoryItem u10 = MessagesController.getInstance(i10).getStoriesController().u(d2Var.f808c, d2Var.f807b);
                        if (u10 == null) {
                            u10 = d2Var.f806a;
                        }
                        if (u10 != null) {
                            U.getOrCreateStoryViewer().A(i10, context, u10, null);
                            AndroidUtilities.runOnUIThread(new f(2), 200L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                f6 f6Var = (f6) this.f936b;
                ta taVar = (ta) this.f937c;
                kc kcVar = f6Var.J0;
                if (taVar.f1754b != null) {
                    Bundle bundle = new Bundle();
                    if (taVar.f1754b.longValue() >= 0) {
                        bundle.putLong("user_id", taVar.f1754b.longValue());
                    } else {
                        bundle.putLong("chat_id", -taVar.f1754b.longValue());
                    }
                    if (taVar.f1756e && (num = taVar.d) != null) {
                        bundle.putInt("message_id", num.intValue());
                        kcVar.H(new zn(bundle));
                        return;
                    }
                    kcVar.H(new ProfileActivity(bundle, null));
                    return;
                }
                org.telegram.ui.Components.sc Q = new ad(f6Var.f955c1, f6Var.B0).Q(R.raw.error, 36, LocaleController.getString(R.string.StoryHidAccount));
                Q.f30704a = 3;
                Q.k(true);
                return;
            case 2:
                f6 f6Var2 = (f6) this.f936b;
                ((bc) f6Var2.Q1).h(new rg.y0(f6Var2.J0.f1267f, 14, false));
                ((org.telegram.ui.ActionBar.e3) this.f937c).dismiss();
                return;
            case 3:
                f6 f6Var3 = ((w5) this.f936b).f1860l;
                jw alert = ((eb) this.f937c).getAlert();
                if (alert != null && (y5Var = f6Var3.Q1) != null) {
                    ((bc) y5Var).h(alert);
                    f6Var3.f1006t1.a();
                    return;
                }
                return;
            case 4:
                ci.v3 v3Var = (ci.v3) this.f936b;
                v3Var.e((MediaController.AlbumEntry) this.f937c, false);
                v3Var.F.n();
                return;
            case 5:
                ci.u8 u8Var = (ci.u8) this.f936b;
                ca caVar = (ca) this.f937c;
                org.telegram.ui.Cells.j3 j3Var = u8Var.Y;
                try {
                    charSequence = ((ClipboardManager) u8Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(u8Var.getContext());
                } catch (Exception e7) {
                    FileLog.e(e7);
                    charSequence = null;
                }
                if (charSequence != null) {
                    j3Var.f22289b.setText(charSequence.toString());
                    org.telegram.ui.Cells.h3 h3Var = j3Var.f22289b;
                    h3Var.setSelection(0, h3Var.getText().length());
                }
                caVar.run();
                return;
            case 6:
                ci.lc lcVar = (ci.lc) this.f936b;
                new ci.f9((Context) this.f937c, lcVar.f5464c, true, lcVar.f5533x0, new ci.ia(lcVar, 20), lcVar.f5457a).show();
                return;
            case 7:
                ei.l.y0((ei.l) this.f936b, (Context) this.f937c);
                return;
            case 8:
                ei.k3 k3Var = (ei.k3) this.f936b;
                ei.k0 k0Var = (ei.k0) this.f937c;
                if (k0Var.c()) {
                    k0Var.a();
                } else {
                    File file = k0Var.d;
                    if (file != null && file.exists()) {
                        File file2 = k0Var.d;
                        AndroidUtilities.openForView(file2, file2.getName(), null, LaunchActivity.G1, null, true);
                    }
                }
                q80 q80Var = k3Var.K0;
                if (q80Var != null) {
                    q80Var.u();
                    k3Var.K0 = null;
                    return;
                }
                return;
            case 9:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.f937c;
                ((org.telegram.ui.ActionBar.e3) this.f936b).dismiss();
                org.telegram.ui.ActionBar.m2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(ProfileActivity.m4(connectedbotstarref.bot_id));
                    return;
                }
                return;
            case 10:
                AndroidUtilities.addToClipboard(((TL_account.TL_businessChatLink) this.f936b).link);
                ad.a0((zn) this.f937c).k(false).j();
                return;
            case 11:
                hg.l0.R((hg.l0) this.f936b, (TL_account.TL_connectedBot) this.f937c);
                return;
            case 12:
                hi.c cVar = (hi.c) this.f936b;
                cVar.getClass();
                ((Runnable) this.f937c).run();
                cVar.dismiss();
                return;
            case 13:
                ii.e2.Y((ii.e2) this.f936b, (Context) this.f937c, view);
                return;
            case 14:
                ((VideoAds) this.f936b).lambda$show$2((VideoAds.CloseDrawable) this.f937c, view);
                return;
            case 15:
                ((VideoAds) this.f936b).lambda$show$18((TLRPC.TL_sponsoredMessage) this.f937c, view);
                return;
            case 16:
                org.telegram.ui.ActionBar.u0 u0Var = (org.telegram.ui.ActionBar.u0) this.f936b;
                org.telegram.ui.ActionBar.t0 t0Var = (org.telegram.ui.ActionBar.t0) this.f937c;
                int indexOf = u0Var.f21544g0.indexOf(t0Var.getFilter());
                if (u0Var.f21545h0 != indexOf) {
                    u0Var.f21545h0 = indexOf;
                    u0Var.y();
                    return;
                } else if (t0Var.getFilter().h) {
                    if (!t0Var.f21489a.f16366f) {
                        t0Var.setSelectedForDelete(true);
                        return;
                    }
                    gg.p0 filter = t0Var.getFilter();
                    u0Var.C(filter);
                    org.telegram.ui.ActionBar.e5 e5Var = u0Var.H;
                    if (e5Var != null) {
                        e5Var.o(filter);
                        u0Var.H.q(u0Var.f21540e);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 17:
                org.telegram.ui.ActionBar.s0 s0Var = (org.telegram.ui.ActionBar.s0) this.f936b;
                org.telegram.ui.ActionBar.u0 u0Var2 = (org.telegram.ui.ActionBar.u0) this.f937c;
                org.telegram.ui.ActionBar.m1 m1Var = u0Var2.d;
                if (m1Var != null && m1Var.isShowing() && s0Var.f21472f) {
                    if (!u0Var2.T) {
                        u0Var2.T = true;
                        u0Var2.d.d(u0Var2.R);
                    } else {
                        return;
                    }
                }
                org.telegram.ui.ActionBar.y yVar = u0Var2.f21537c;
                if (yVar != null) {
                    yVar.o(((Integer) view.getTag()).intValue());
                    return;
                }
                org.telegram.ui.ActionBar.q0 q0Var = u0Var2.P;
                if (q0Var != null) {
                    q0Var.m(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
            case 18:
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) this.f936b;
                if (!((org.telegram.ui.ActionBar.v1) this.f937c).f21210a) {
                    org.telegram.ui.ActionBar.z1 z1Var = a2Var.m0;
                    if (z1Var != null) {
                        z1Var.f(a2Var, -1);
                    }
                    if (a2Var.f20391h0) {
                        a2Var.dismiss();
                        return;
                    }
                    return;
                }
                return;
            case 19:
                org.telegram.ui.ActionBar.a2 a2Var2 = (org.telegram.ui.ActionBar.a2) this.f936b;
                if (!((org.telegram.ui.ActionBar.v1) this.f937c).f21210a) {
                    org.telegram.ui.ActionBar.z1 z1Var2 = a2Var2.f20398o0;
                    if (z1Var2 != null) {
                        z1Var2.f(a2Var2, -2);
                    }
                    if (a2Var2.f20391h0) {
                        a2Var2.cancel();
                        return;
                    }
                    return;
                }
                return;
            case 20:
                org.telegram.ui.ActionBar.a2 a2Var3 = (org.telegram.ui.ActionBar.a2) this.f936b;
                if (!((org.telegram.ui.ActionBar.v1) this.f937c).f21210a) {
                    org.telegram.ui.ActionBar.z1 z1Var3 = a2Var3.f20404s0;
                    if (z1Var3 != null) {
                        z1Var3.f(a2Var3, -2);
                    }
                    if (a2Var3.f20391h0) {
                        a2Var3.dismiss();
                        return;
                    }
                    return;
                }
                return;
            case 21:
                org.telegram.ui.ActionBar.a2 a2Var4 = (org.telegram.ui.ActionBar.a2) this.f936b;
                if (!((org.telegram.ui.ActionBar.v1) this.f937c).f21210a) {
                    ii.g4 g4Var = a2Var4.f20400q0;
                    if (g4Var != null) {
                        g4Var.f(a2Var4, -2);
                    }
                    if (a2Var4.f20391h0) {
                        a2Var4.cancel();
                        return;
                    }
                    return;
                }
                return;
            case 22:
                org.telegram.ui.h4 h4Var = (org.telegram.ui.h4) this.f936b;
                Activity activity = (Activity) this.f937c;
                org.telegram.ui.u3 u3Var = h4Var.K;
                if (!h4Var.f38273h0.A0) {
                    org.telegram.ui.l3 l3Var = h4Var.f38285u0[0];
                    if (l3Var.f()) {
                        if (l3Var.getWebView() != null && !h4Var.f38273h0.W) {
                            if (h4Var.f38274i0 != null) {
                                org.telegram.ui.web.y0 webView = l3Var.getWebView();
                                if (webView != null) {
                                    str = webView.getTitle();
                                } else {
                                    str = null;
                                }
                                if (webView != null) {
                                    str2 = webView.getUrl();
                                } else {
                                    str2 = null;
                                }
                                String u11 = org.telegram.ui.web.b1.u(str2);
                                org.telegram.ui.web.k kVar = h4Var.f38274i0;
                                if (webView != null) {
                                    bitmap = webView.getFavicon();
                                } else {
                                    bitmap = null;
                                }
                                if (TextUtils.isEmpty(str)) {
                                    str = LocaleController.getString(R.string.WebEmpty);
                                }
                                if (TextUtils.isEmpty(u11)) {
                                    str3 = "about:blank";
                                } else {
                                    str3 = u11;
                                }
                                org.telegram.ui.x xVar = new org.telegram.ui.x(h4Var, u11, 0);
                                org.telegram.ui.y yVar2 = new org.telegram.ui.y(h4Var, l3Var, activity, 0);
                                org.telegram.ui.r rVar = new org.telegram.ui.r(h4Var, 1);
                                org.telegram.ui.r rVar2 = new org.telegram.ui.r(h4Var, 2);
                                org.telegram.ui.z zVar = new org.telegram.ui.z(h4Var, u11, l3Var, 0);
                                org.telegram.ui.web.c cVar2 = kVar.f43562w;
                                ImageView imageView = kVar.f43558f;
                                if (bitmap == null) {
                                    imageView.setImageResource(R.drawable.msg_language);
                                    str4 = str3;
                                    imageView.setColorFilter(new PorterDuffColorFilter(kVar.H, PorterDuff.Mode.SRC_IN));
                                } else {
                                    str4 = str3;
                                    imageView.setImageDrawable(new BitmapDrawable(kVar.getContext().getResources(), bitmap));
                                    imageView.setColorFilter((ColorFilter) null);
                                }
                                TextView textView = kVar.f43560r;
                                textView.setText(Emoji.replaceEmoji(str, textView.getPaint().getFontMetricsInt(), false));
                                try {
                                    Uri parse = Uri.parse(str4);
                                    str5 = of.f.v(parse, null, null, of.f.a(parse.getHost()), null);
                                } catch (Exception e10) {
                                    try {
                                        FileLog.e((Throwable) e10, false);
                                        str5 = str4;
                                    } catch (Exception e11) {
                                        e = e11;
                                        str5 = str4;
                                        FileLog.e(e);
                                        str6 = str5;
                                        TextView textView2 = kVar.f43561s;
                                        textView2.setText(Emoji.replaceEmoji(str6, textView2.getPaint().getFontMetricsInt(), false));
                                        kVar.L = yVar2;
                                        kVar.M = rVar;
                                        kVar.N = rVar2;
                                        kVar.f43557e.setOnClickListener(new uy0(18, kVar, xVar));
                                        kVar.f43559n.setOnClickListener(zVar);
                                        kVar.f43555b = false;
                                        kVar.setInput(null);
                                        cVar2.W2.N(true);
                                        cVar2.u0(0);
                                        org.telegram.ui.k0 k0Var2 = h4Var.f38273h0;
                                        h3 h3Var2 = new h3(28, l3Var, activity);
                                        fi.o oVar = k0Var2.f43667b0;
                                        oVar.setText("");
                                        oVar.setSelection(0, oVar.getText().length());
                                        oVar.setScrollX(0);
                                        k0Var2.f43692v0 = h3Var2;
                                        k0Var2.k(true);
                                        return;
                                    }
                                }
                                try {
                                    str6 = URLDecoder.decode(str5.replaceAll("\\+", "%2b"), "UTF-8");
                                } catch (Exception e12) {
                                    e = e12;
                                    FileLog.e(e);
                                    str6 = str5;
                                    TextView textView22 = kVar.f43561s;
                                    textView22.setText(Emoji.replaceEmoji(str6, textView22.getPaint().getFontMetricsInt(), false));
                                    kVar.L = yVar2;
                                    kVar.M = rVar;
                                    kVar.N = rVar2;
                                    kVar.f43557e.setOnClickListener(new uy0(18, kVar, xVar));
                                    kVar.f43559n.setOnClickListener(zVar);
                                    kVar.f43555b = false;
                                    kVar.setInput(null);
                                    cVar2.W2.N(true);
                                    cVar2.u0(0);
                                    org.telegram.ui.k0 k0Var22 = h4Var.f38273h0;
                                    h3 h3Var22 = new h3(28, l3Var, activity);
                                    fi.o oVar2 = k0Var22.f43667b0;
                                    oVar2.setText("");
                                    oVar2.setSelection(0, oVar2.getText().length());
                                    oVar2.setScrollX(0);
                                    k0Var22.f43692v0 = h3Var22;
                                    k0Var22.k(true);
                                    return;
                                }
                                TextView textView222 = kVar.f43561s;
                                textView222.setText(Emoji.replaceEmoji(str6, textView222.getPaint().getFontMetricsInt(), false));
                                kVar.L = yVar2;
                                kVar.M = rVar;
                                kVar.N = rVar2;
                                kVar.f43557e.setOnClickListener(new uy0(18, kVar, xVar));
                                kVar.f43559n.setOnClickListener(zVar);
                                kVar.f43555b = false;
                                kVar.setInput(null);
                                cVar2.W2.N(true);
                                cVar2.u0(0);
                            }
                            org.telegram.ui.k0 k0Var222 = h4Var.f38273h0;
                            h3 h3Var222 = new h3(28, l3Var, activity);
                            fi.o oVar22 = k0Var222.f43667b0;
                            oVar22.setText("");
                            oVar22.setSelection(0, oVar22.getText().length());
                            oVar22.setScrollX(0);
                            k0Var222.f43692v0 = h3Var222;
                            k0Var222.k(true);
                            return;
                        }
                        return;
                    } else if (u3Var != null) {
                        dx0 dx0Var = new dx0(activity);
                        dx0Var.f47917a = 1;
                        dx0Var.f25748s = -AndroidUtilities.dp(32.0f);
                        l3Var.d.w0(dx0Var);
                        return;
                    } else {
                        l3Var.f39496b.x0(0);
                        return;
                    }
                }
                return;
            case 23:
                org.telegram.ui.c1 c1Var = (org.telegram.ui.c1) this.f936b;
                t70 t70Var = (t70) this.f937c;
                if (c1Var.f36494f == 0) {
                    c1Var.a(1, true);
                    int i11 = ((org.telegram.ui.h4) t70Var).X;
                    TLRPC.Chat chat = t70Var.f42101n;
                    TLRPC.TL_channels_joinChannel tL_channels_joinChannel = new TLRPC.TL_channels_joinChannel();
                    tL_channels_joinChannel.channel = MessagesController.getInputChannel(chat);
                    ConnectionsManager.getInstance(i11).sendRequestTyped(tL_channels_joinChannel, new ei.h1(c1Var, i11, tL_channels_joinChannel, chat));
                    return;
                }
                return;
            case 24:
                org.telegram.ui.b5 b5Var = (org.telegram.ui.b5) this.f936b;
                b5Var.b(false);
                b5Var.f36268e.b((org.telegram.ui.c5) this.f937c);
                return;
            case 25:
                ((org.telegram.ui.v6) this.f936b).f42879e.u0((org.telegram.ui.Cells.a2) this.f937c);
                return;
            case 26:
                org.telegram.ui.c7 c7Var = (org.telegram.ui.c7) this.f936b;
                org.telegram.ui.k7 k7Var = (org.telegram.ui.k7) this.f937c;
                org.telegram.ui.g7 g7Var = c7Var.d.v;
                if (g7Var != null) {
                    g7Var.y0(k7Var.f39216c, k7Var.d, true);
                }
                org.telegram.ui.ActionBar.m1 m1Var2 = c7Var.f36581a;
                if (m1Var2 != null) {
                    m1Var2.d(true);
                    return;
                }
                return;
            case 27:
                org.telegram.ui.i9 i9Var = (org.telegram.ui.i9) this.f936b;
                org.telegram.ui.e9 e9Var = (org.telegram.ui.e9) this.f937c;
                ArrayList arrayList = e9Var.f37240b;
                if (arrayList.size() == 1) {
                    TLRPC.User user = (TLRPC.User) arrayList.get(0);
                    TLRPC.UserFull userFull = i9Var.getMessagesController().getUserFull(user.f20179id);
                    i9Var.P = user;
                    boolean z11 = e9Var.f37242e;
                    if (!z11 && (userFull == null || !userFull.video_calls_available)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    org.telegram.ui.Components.voip.g2.m(user, z11, z10, i9Var.getParentActivity(), null, i9Var.getAccountInstance());
                    return;
                }
                boolean z12 = e9Var.f37242e;
                HashSet hashSet = new HashSet();
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList.get(i12);
                    i12++;
                    hashSet.add(Long.valueOf(((TLRPC.User) obj).f20179id));
                }
                TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) e9Var.f37241c.get(0)).f20053id;
                org.telegram.ui.ActionBar.a2 a2Var5 = new org.telegram.ui.ActionBar.a2(i9Var.getParentActivity(), 3, null);
                TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                getgroupcall.call = tL_inputGroupCallInviteMessage;
                getgroupcall.limit = i9Var.getMessagesController().conferenceCallSizeLimit;
                a2Var5.setOnCancelListener(new org.telegram.ui.n8(i9Var, i9Var.getConnectionsManager().sendRequest(getgroupcall, new org.telegram.ui.m8(i9Var, a2Var5, hashSet, tL_inputGroupCallInviteMessage, z12, 1)), 1));
                a2Var5.q(600L);
                return;
            case 28:
                je jeVar = (je) this.f936b;
                ab1 ab1Var = (ab1) this.f937c;
                ci.d dVar = jeVar.K0;
                if (view.isEnabled() && !dVar.N) {
                    ae aeVar = jeVar.Q0;
                    if (aeVar == null || !aeVar.N) {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        rd rdVar = new rd(jeVar, twoStepVerificationActivity, 0);
                        twoStepVerificationActivity.Z = 1;
                        twoStepVerificationActivity.f34601b0 = rdVar;
                        dVar.setLoading(true);
                        twoStepVerificationActivity.s0(new sd(jeVar, ab1Var, twoStepVerificationActivity, 0));
                        return;
                    }
                    return;
                }
                return;
            default:
                of.f.s((Context) this.f937c, ((TL_stats.TL_broadcastRevenueTransactionWithdrawal) this.f936b).transaction_url);
                return;
        }
    }

    public f2(Context context, TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal) {
        this.f935a = 29;
        this.f937c = context;
        this.f936b = tL_broadcastRevenueTransactionWithdrawal;
    }
}
