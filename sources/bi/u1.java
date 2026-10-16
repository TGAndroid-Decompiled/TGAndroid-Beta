package bi;

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
import di.kc;
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
import org.telegram.ui.Components.ew;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.xw0;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bz0;
import org.telegram.ui.fo;
import org.telegram.ui.hb1;
import org.telegram.ui.he;
import org.telegram.ui.qe;
import org.telegram.ui.yd;
import org.telegram.ui.z70;
import org.telegram.ui.zd;
public final class u1 implements View.OnClickListener {
    public final int f3777a;
    public final Object f3778b;
    public final Object f3779c;

    public u1(int i10, Object obj, Object obj2) {
        this.f3777a = i10;
        this.f3778b = obj;
        this.f3779c = obj2;
    }

    @Override
    public final void onClick(View view) {
        Integer num;
        j5 j5Var;
        CharSequence charSequence;
        String str;
        String str2;
        Bitmap bitmap;
        String str3;
        String str4;
        String str5;
        String str6;
        boolean z10;
        switch (this.f3777a) {
            case 0:
                t1 t1Var = (t1) this.f3778b;
                Context context = (Context) this.f3779c;
                if (t1Var != null) {
                    int i10 = t1Var.e;
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
                        TL_stories.StoryItem u10 = MessagesController.getInstance(i10).getStoriesController().u(t1Var.f3726c, t1Var.f3725b);
                        if (u10 == null) {
                            u10 = t1Var.f3724a;
                        }
                        if (u10 != null) {
                            U.getOrCreateStoryViewer().A(i10, context, u10, null);
                            AndroidUtilities.runOnUIThread(new ah.j(3), 200L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                q5 q5Var = (q5) this.f3778b;
                ca caVar = (ca) this.f3779c;
                sb sbVar = q5Var.J0;
                if (caVar.f2920b != null) {
                    Bundle bundle = new Bundle();
                    if (caVar.f2920b.longValue() >= 0) {
                        bundle.putLong("user_id", caVar.f2920b.longValue());
                    } else {
                        bundle.putLong("chat_id", -caVar.f2920b.longValue());
                    }
                    if (caVar.e && (num = caVar.d) != null) {
                        bundle.putInt("message_id", num.intValue());
                        sbVar.H(new fo(bundle));
                        return;
                    }
                    sbVar.H(new ProfileActivity(bundle, null));
                    return;
                }
                sc Q = new zc(q5Var.f3515c1, q5Var.B0).Q(R.raw.error, 36, LocaleController.getString(R.string.StoryHidAccount));
                Q.f28799a = 3;
                Q.k(true);
                return;
            case 2:
                q5 q5Var2 = (q5) this.f3778b;
                ((jb) q5Var2.Q1).h(new sg.y0(q5Var2.J0.f3677f, 14, false));
                ((org.telegram.ui.ActionBar.e3) this.f3779c).dismiss();
                return;
            case 3:
                q5 q5Var3 = ((h5) this.f3778b).f3126l;
                ew alert = ((na) this.f3779c).getAlert();
                if (alert != null && (j5Var = q5Var3.Q1) != null) {
                    ((jb) j5Var).h(alert);
                    q5Var3.f3567t1.a();
                    return;
                }
                return;
            case 4:
                di.v3 v3Var = (di.v3) this.f3778b;
                v3Var.e((MediaController.AlbumEntry) this.f3779c, false);
                v3Var.F.n();
                return;
            case 5:
                di.t8 t8Var = (di.t8) this.f3778b;
                di.y6 y6Var = (di.y6) this.f3779c;
                org.telegram.ui.Cells.j3 j3Var = t8Var.Y;
                try {
                    charSequence = ((ClipboardManager) t8Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(t8Var.getContext());
                } catch (Exception e) {
                    FileLog.e(e);
                    charSequence = null;
                }
                if (charSequence != null) {
                    j3Var.f21083b.setText(charSequence.toString());
                    org.telegram.ui.Cells.h3 h3Var = j3Var.f21083b;
                    h3Var.setSelection(0, h3Var.getText().length());
                }
                y6Var.run();
                return;
            case 6:
                kc kcVar = (kc) this.f3778b;
                new di.e9((Context) this.f3779c, kcVar.f7244c, true, kcVar.f7312x0, new di.ha(kcVar, 20), kcVar.f7237a).show();
                return;
            case 7:
                fi.l.y0((fi.l) this.f3778b, (Context) this.f3779c);
                return;
            case 8:
                fi.k3 k3Var = (fi.k3) this.f3778b;
                fi.j0 j0Var = (fi.j0) this.f3779c;
                if (j0Var.c()) {
                    j0Var.a();
                } else {
                    File file = j0Var.d;
                    if (file != null && file.exists()) {
                        File file2 = j0Var.d;
                        AndroidUtilities.openForView(file2, file2.getName(), null, LaunchActivity.G1, null, true);
                    }
                }
                l80 l80Var = k3Var.K0;
                if (l80Var != null) {
                    l80Var.u();
                    k3Var.K0 = null;
                    return;
                }
                return;
            case 9:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.f3779c;
                ((org.telegram.ui.ActionBar.e3) this.f3778b).dismiss();
                org.telegram.ui.ActionBar.m2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(ProfileActivity.m4(connectedbotstarref.bot_id));
                    return;
                }
                return;
            case 10:
                AndroidUtilities.addToClipboard(((TL_account.TL_businessChatLink) this.f3778b).link);
                zc.a0((fo) this.f3779c).k(false).j();
                return;
            case 11:
                ig.k0.R((ig.k0) this.f3778b, (TL_account.TL_connectedBot) this.f3779c);
                return;
            case 12:
                ii.c cVar = (ii.c) this.f3778b;
                cVar.getClass();
                ((Runnable) this.f3779c).run();
                cVar.dismiss();
                return;
            case 13:
                ji.d2.Y((ji.d2) this.f3778b, (Context) this.f3779c, view);
                return;
            case 14:
                ((VideoAds) this.f3778b).lambda$show$2((VideoAds.CloseDrawable) this.f3779c, view);
                return;
            case 15:
                ((VideoAds) this.f3778b).lambda$show$18((TLRPC.TL_sponsoredMessage) this.f3779c, view);
                return;
            case 16:
                org.telegram.ui.ActionBar.u0 u0Var = (org.telegram.ui.ActionBar.u0) this.f3778b;
                org.telegram.ui.ActionBar.t0 t0Var = (org.telegram.ui.ActionBar.t0) this.f3779c;
                int indexOf = u0Var.f20383g0.indexOf(t0Var.getFilter());
                if (u0Var.f20384h0 != indexOf) {
                    u0Var.f20384h0 = indexOf;
                    u0Var.y();
                    return;
                } else if (t0Var.getFilter().h) {
                    if (!t0Var.f20333a.f16004f) {
                        t0Var.setSelectedForDelete(true);
                        return;
                    }
                    hg.p0 filter = t0Var.getFilter();
                    u0Var.C(filter);
                    org.telegram.ui.ActionBar.e5 e5Var = u0Var.H;
                    if (e5Var != null) {
                        e5Var.o(filter);
                        u0Var.H.q(u0Var.e);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 17:
                org.telegram.ui.ActionBar.s0 s0Var = (org.telegram.ui.ActionBar.s0) this.f3778b;
                org.telegram.ui.ActionBar.u0 u0Var2 = (org.telegram.ui.ActionBar.u0) this.f3779c;
                org.telegram.ui.ActionBar.m1 m1Var = u0Var2.d;
                if (m1Var != null && m1Var.isShowing() && s0Var.f20317f) {
                    if (!u0Var2.T) {
                        u0Var2.T = true;
                        u0Var2.d.d(u0Var2.R);
                    } else {
                        return;
                    }
                }
                org.telegram.ui.ActionBar.y yVar = u0Var2.f20377c;
                if (yVar != null) {
                    yVar.o(((Integer) view.getTag()).intValue());
                    return;
                }
                org.telegram.ui.ActionBar.q0 q0Var = u0Var2.P;
                if (q0Var != null) {
                    q0Var.k(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
            case 18:
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) this.f3778b;
                if (!((org.telegram.ui.ActionBar.v1) this.f3779c).f20069a) {
                    org.telegram.ui.ActionBar.z1 z1Var = a2Var.m0;
                    if (z1Var != null) {
                        z1Var.g(a2Var, -1);
                    }
                    if (a2Var.f19270h0) {
                        a2Var.dismiss();
                        return;
                    }
                    return;
                }
                return;
            case 19:
                org.telegram.ui.ActionBar.a2 a2Var2 = (org.telegram.ui.ActionBar.a2) this.f3778b;
                if (!((org.telegram.ui.ActionBar.v1) this.f3779c).f20069a) {
                    org.telegram.ui.ActionBar.z1 z1Var2 = a2Var2.f19277o0;
                    if (z1Var2 != null) {
                        z1Var2.g(a2Var2, -2);
                    }
                    if (a2Var2.f19270h0) {
                        a2Var2.cancel();
                        return;
                    }
                    return;
                }
                return;
            case 20:
                org.telegram.ui.ActionBar.a2 a2Var3 = (org.telegram.ui.ActionBar.a2) this.f3778b;
                if (!((org.telegram.ui.ActionBar.v1) this.f3779c).f20069a) {
                    org.telegram.ui.ActionBar.z1 z1Var3 = a2Var3.f19283s0;
                    if (z1Var3 != null) {
                        z1Var3.g(a2Var3, -2);
                    }
                    if (a2Var3.f19270h0) {
                        a2Var3.dismiss();
                        return;
                    }
                    return;
                }
                return;
            case 21:
                org.telegram.ui.ActionBar.a2 a2Var4 = (org.telegram.ui.ActionBar.a2) this.f3778b;
                if (!((org.telegram.ui.ActionBar.v1) this.f3779c).f20069a) {
                    ji.g4 g4Var = a2Var4.f19279q0;
                    if (g4Var != null) {
                        g4Var.g(a2Var4, -2);
                    }
                    if (a2Var4.f19270h0) {
                        a2Var4.cancel();
                        return;
                    }
                    return;
                }
                return;
            case 22:
                org.telegram.ui.k4 k4Var = (org.telegram.ui.k4) this.f3778b;
                Activity activity = (Activity) this.f3779c;
                org.telegram.ui.x3 x3Var = k4Var.K;
                if (!k4Var.f37266h0.A0) {
                    org.telegram.ui.o3 o3Var = k4Var.f37278u0[0];
                    if (o3Var.f()) {
                        if (o3Var.getWebView() != null && !k4Var.f37266h0.W) {
                            if (k4Var.f37267i0 != null) {
                                org.telegram.ui.web.z0 webView = o3Var.getWebView();
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
                                String u11 = org.telegram.ui.web.c1.u(str2);
                                org.telegram.ui.web.k kVar = k4Var.f37267i0;
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
                                org.telegram.ui.y yVar2 = new org.telegram.ui.y(k4Var, u11, 0);
                                org.telegram.ui.z zVar = new org.telegram.ui.z(k4Var, o3Var, activity, 0);
                                org.telegram.ui.r rVar = new org.telegram.ui.r(k4Var, 1);
                                org.telegram.ui.r rVar2 = new org.telegram.ui.r(k4Var, 2);
                                org.telegram.ui.a0 a0Var = new org.telegram.ui.a0(k4Var, u11, o3Var, 0);
                                org.telegram.ui.web.c cVar2 = kVar.f41099w;
                                ImageView imageView = kVar.f41095f;
                                if (bitmap == null) {
                                    imageView.setImageResource(R.drawable.msg_language);
                                    str4 = str3;
                                    imageView.setColorFilter(new PorterDuffColorFilter(kVar.H, PorterDuff.Mode.SRC_IN));
                                } else {
                                    str4 = str3;
                                    imageView.setImageDrawable(new BitmapDrawable(kVar.getContext().getResources(), bitmap));
                                    imageView.setColorFilter((ColorFilter) null);
                                }
                                TextView textView = kVar.f41097r;
                                textView.setText(Emoji.replaceEmoji(str, textView.getPaint().getFontMetricsInt(), false));
                                try {
                                    Uri parse = Uri.parse(str4);
                                    str5 = pf.d.u(parse, null, null, pf.d.a(parse.getHost()), null);
                                } catch (Exception e7) {
                                    try {
                                        FileLog.e((Throwable) e7, false);
                                        str5 = str4;
                                    } catch (Exception e10) {
                                        e = e10;
                                        str5 = str4;
                                        FileLog.e(e);
                                        str6 = str5;
                                        TextView textView2 = kVar.f41098s;
                                        textView2.setText(Emoji.replaceEmoji(str6, textView2.getPaint().getFontMetricsInt(), false));
                                        kVar.L = zVar;
                                        kVar.M = rVar;
                                        kVar.N = rVar2;
                                        kVar.e.setOnClickListener(new bz0(18, kVar, yVar2));
                                        kVar.f41096n.setOnClickListener(a0Var);
                                        kVar.f41093b = false;
                                        kVar.setInput(null);
                                        cVar2.W2.N(true);
                                        cVar2.u0(0);
                                        org.telegram.ui.m0 m0Var = k4Var.f37266h0;
                                        v2 v2Var = new v2(28, o3Var, activity);
                                        gi.o oVar = m0Var.f41204b0;
                                        oVar.setText("");
                                        oVar.setSelection(0, oVar.getText().length());
                                        oVar.setScrollX(0);
                                        m0Var.f41228v0 = v2Var;
                                        m0Var.k(true);
                                        return;
                                    }
                                }
                                try {
                                    str6 = URLDecoder.decode(str5.replaceAll("\\+", "%2b"), "UTF-8");
                                } catch (Exception e11) {
                                    e = e11;
                                    FileLog.e(e);
                                    str6 = str5;
                                    TextView textView22 = kVar.f41098s;
                                    textView22.setText(Emoji.replaceEmoji(str6, textView22.getPaint().getFontMetricsInt(), false));
                                    kVar.L = zVar;
                                    kVar.M = rVar;
                                    kVar.N = rVar2;
                                    kVar.e.setOnClickListener(new bz0(18, kVar, yVar2));
                                    kVar.f41096n.setOnClickListener(a0Var);
                                    kVar.f41093b = false;
                                    kVar.setInput(null);
                                    cVar2.W2.N(true);
                                    cVar2.u0(0);
                                    org.telegram.ui.m0 m0Var2 = k4Var.f37266h0;
                                    v2 v2Var2 = new v2(28, o3Var, activity);
                                    gi.o oVar2 = m0Var2.f41204b0;
                                    oVar2.setText("");
                                    oVar2.setSelection(0, oVar2.getText().length());
                                    oVar2.setScrollX(0);
                                    m0Var2.f41228v0 = v2Var2;
                                    m0Var2.k(true);
                                    return;
                                }
                                TextView textView222 = kVar.f41098s;
                                textView222.setText(Emoji.replaceEmoji(str6, textView222.getPaint().getFontMetricsInt(), false));
                                kVar.L = zVar;
                                kVar.M = rVar;
                                kVar.N = rVar2;
                                kVar.e.setOnClickListener(new bz0(18, kVar, yVar2));
                                kVar.f41096n.setOnClickListener(a0Var);
                                kVar.f41093b = false;
                                kVar.setInput(null);
                                cVar2.W2.N(true);
                                cVar2.u0(0);
                            }
                            org.telegram.ui.m0 m0Var22 = k4Var.f37266h0;
                            v2 v2Var22 = new v2(28, o3Var, activity);
                            gi.o oVar22 = m0Var22.f41204b0;
                            oVar22.setText("");
                            oVar22.setSelection(0, oVar22.getText().length());
                            oVar22.setScrollX(0);
                            m0Var22.f41228v0 = v2Var22;
                            m0Var22.k(true);
                            return;
                        }
                        return;
                    } else if (x3Var != null) {
                        xw0 xw0Var = new xw0(activity);
                        xw0Var.f44979a = 1;
                        xw0Var.f31083s = -AndroidUtilities.dp(32.0f);
                        o3Var.d.w0(xw0Var);
                        return;
                    } else {
                        o3Var.f38529b.x0(0);
                        return;
                    }
                }
                return;
            case 23:
                org.telegram.ui.f1 f1Var = (org.telegram.ui.f1) this.f3778b;
                z70 z70Var = (z70) this.f3779c;
                if (f1Var.f35416f == 0) {
                    f1Var.a(1, true);
                    int i11 = ((org.telegram.ui.k4) z70Var).X;
                    TLRPC.Chat chat = z70Var.f42178n;
                    TLRPC.TL_channels_joinChannel tL_channels_joinChannel = new TLRPC.TL_channels_joinChannel();
                    tL_channels_joinChannel.channel = MessagesController.getInputChannel(chat);
                    ConnectionsManager.getInstance(i11).sendRequestTyped(tL_channels_joinChannel, new fi.g1(f1Var, i11, tL_channels_joinChannel, chat));
                    return;
                }
                return;
            case 24:
                org.telegram.ui.g5 g5Var = (org.telegram.ui.g5) this.f3778b;
                g5Var.b(false);
                g5Var.e.b((org.telegram.ui.h5) this.f3779c);
                return;
            case 25:
                ((org.telegram.ui.b7) this.f3778b).e.u0((org.telegram.ui.Cells.a2) this.f3779c);
                return;
            case 26:
                org.telegram.ui.i7 i7Var = (org.telegram.ui.i7) this.f3778b;
                org.telegram.ui.q7 q7Var = (org.telegram.ui.q7) this.f3779c;
                org.telegram.ui.m7 m7Var = i7Var.d.v;
                if (m7Var != null) {
                    m7Var.j1(q7Var.f39071c, q7Var.d, true);
                }
                org.telegram.ui.ActionBar.m1 m1Var2 = i7Var.f36737a;
                if (m1Var2 != null) {
                    m1Var2.d(true);
                    return;
                }
                return;
            case 27:
                org.telegram.ui.n9 n9Var = (org.telegram.ui.n9) this.f3778b;
                org.telegram.ui.j9 j9Var = (org.telegram.ui.j9) this.f3779c;
                ArrayList arrayList = j9Var.f36989b;
                if (arrayList.size() == 1) {
                    TLRPC.User user = (TLRPC.User) arrayList.get(0);
                    TLRPC.UserFull userFull = n9Var.getMessagesController().getUserFull(user.f19063id);
                    n9Var.P = user;
                    boolean z11 = j9Var.e;
                    if (!z11 && (userFull == null || !userFull.video_calls_available)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    org.telegram.ui.Components.voip.d2.m(user, z11, z10, n9Var.getParentActivity(), null, n9Var.getAccountInstance());
                    return;
                }
                boolean z12 = j9Var.e;
                HashSet hashSet = new HashSet();
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList.get(i12);
                    i12++;
                    hashSet.add(Long.valueOf(((TLRPC.User) obj).f19063id));
                }
                TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) j9Var.f36990c.get(0)).f18937id;
                org.telegram.ui.ActionBar.a2 a2Var5 = new org.telegram.ui.ActionBar.a2(n9Var.getParentActivity(), 3, null);
                TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                getgroupcall.call = tL_inputGroupCallInviteMessage;
                getgroupcall.limit = n9Var.getMessagesController().conferenceCallSizeLimit;
                a2Var5.setOnCancelListener(new org.telegram.ui.s8(n9Var, n9Var.getConnectionsManager().sendRequest(getgroupcall, new org.telegram.ui.r8(n9Var, a2Var5, hashSet, tL_inputGroupCallInviteMessage, z12, 1)), 1));
                a2Var5.q(600L);
                return;
            case 28:
                qe qeVar = (qe) this.f3778b;
                hb1 hb1Var = (hb1) this.f3779c;
                di.d dVar = qeVar.K0;
                if (view.isEnabled() && !dVar.N) {
                    he heVar = qeVar.Q0;
                    if (heVar == null || !heVar.N) {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        yd ydVar = new yd(qeVar, twoStepVerificationActivity, 0);
                        twoStepVerificationActivity.Z = 1;
                        twoStepVerificationActivity.f32584b0 = ydVar;
                        dVar.setLoading(true);
                        twoStepVerificationActivity.s0(new zd(qeVar, hb1Var, twoStepVerificationActivity, 0));
                        return;
                    }
                    return;
                }
                return;
            default:
                pf.d.r((Context) this.f3779c, ((TL_stats.TL_broadcastRevenueTransactionWithdrawal) this.f3778b).transaction_url);
                return;
        }
    }

    public u1(Context context, TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal) {
        this.f3777a = 29;
        this.f3779c = context;
        this.f3778b = tL_broadcastRevenueTransactionWithdrawal;
    }
}
