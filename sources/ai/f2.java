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
import org.telegram.ui.Components.bx0;
import org.telegram.ui.Components.iw;
import org.telegram.ui.Components.p80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bb1;
import org.telegram.ui.be;
import org.telegram.ui.ke;
import org.telegram.ui.sd;
import org.telegram.ui.t70;
import org.telegram.ui.td;
import org.telegram.ui.vy0;
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
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
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
                org.telegram.ui.Components.tc Q = new ad(f6Var.f955c1, f6Var.B0).Q(R.raw.error, 36, LocaleController.getString(R.string.StoryHidAccount));
                Q.f31123a = 3;
                Q.k(true);
                return;
            case 2:
                f6 f6Var2 = (f6) this.f936b;
                ((bc) f6Var2.Q1).h(new rg.y0(f6Var2.J0.f1267f, 14, false));
                ((org.telegram.ui.ActionBar.f3) this.f937c).dismiss();
                return;
            case 3:
                f6 f6Var3 = ((w5) this.f936b).f1860l;
                iw alert = ((eb) this.f937c).getAlert();
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
                    j3Var.f22297b.setText(charSequence.toString());
                    org.telegram.ui.Cells.h3 h3Var = j3Var.f22297b;
                    h3Var.setSelection(0, h3Var.getText().length());
                }
                caVar.run();
                return;
            case 6:
                ci.lc lcVar = (ci.lc) this.f936b;
                new ci.f9((Context) this.f937c, lcVar.f5465c, true, lcVar.f5534x0, new ci.ia(lcVar, 20), lcVar.f5458a).show();
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
                p80 p80Var = k3Var.K0;
                if (p80Var != null) {
                    p80Var.u();
                    k3Var.K0 = null;
                    return;
                }
                return;
            case 9:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.f937c;
                ((org.telegram.ui.ActionBar.f3) this.f936b).dismiss();
                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
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
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) this.f936b;
                org.telegram.ui.ActionBar.u0 u0Var = (org.telegram.ui.ActionBar.u0) this.f937c;
                int indexOf = v0Var.f21588g0.indexOf(u0Var.getFilter());
                if (v0Var.f21589h0 != indexOf) {
                    v0Var.f21589h0 = indexOf;
                    v0Var.y();
                    return;
                } else if (u0Var.getFilter().h) {
                    if (!u0Var.f21537a.f16338f) {
                        u0Var.setSelectedForDelete(true);
                        return;
                    }
                    gg.p0 filter = u0Var.getFilter();
                    v0Var.C(filter);
                    org.telegram.ui.ActionBar.g5 g5Var = v0Var.H;
                    if (g5Var != null) {
                        g5Var.o(filter);
                        v0Var.H.q(v0Var.f21584e);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 17:
                org.telegram.ui.ActionBar.t0 t0Var = (org.telegram.ui.ActionBar.t0) this.f936b;
                org.telegram.ui.ActionBar.v0 v0Var2 = (org.telegram.ui.ActionBar.v0) this.f937c;
                org.telegram.ui.ActionBar.n1 n1Var = v0Var2.d;
                if (n1Var != null && n1Var.isShowing() && t0Var.f21518f) {
                    if (!v0Var2.T) {
                        v0Var2.T = true;
                        v0Var2.d.d(v0Var2.R);
                    } else {
                        return;
                    }
                }
                org.telegram.ui.ActionBar.z zVar = v0Var2.f21581c;
                if (zVar != null) {
                    zVar.o(((Integer) view.getTag()).intValue());
                    return;
                }
                org.telegram.ui.ActionBar.r0 r0Var = v0Var2.P;
                if (r0Var != null) {
                    r0Var.m(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
            case 18:
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.f936b;
                if (!((org.telegram.ui.ActionBar.w1) this.f937c).f21338a) {
                    org.telegram.ui.ActionBar.a2 a2Var = b2Var.m0;
                    if (a2Var != null) {
                        a2Var.f(b2Var, -1);
                    }
                    if (b2Var.f20421h0) {
                        b2Var.dismiss();
                        return;
                    }
                    return;
                }
                return;
            case 19:
                org.telegram.ui.ActionBar.b2 b2Var2 = (org.telegram.ui.ActionBar.b2) this.f936b;
                if (!((org.telegram.ui.ActionBar.w1) this.f937c).f21338a) {
                    org.telegram.ui.ActionBar.a2 a2Var2 = b2Var2.f20428o0;
                    if (a2Var2 != null) {
                        a2Var2.f(b2Var2, -2);
                    }
                    if (b2Var2.f20421h0) {
                        b2Var2.cancel();
                        return;
                    }
                    return;
                }
                return;
            case 20:
                org.telegram.ui.ActionBar.b2 b2Var3 = (org.telegram.ui.ActionBar.b2) this.f936b;
                if (!((org.telegram.ui.ActionBar.w1) this.f937c).f21338a) {
                    org.telegram.ui.ActionBar.a2 a2Var3 = b2Var3.f20434s0;
                    if (a2Var3 != null) {
                        a2Var3.f(b2Var3, -2);
                    }
                    if (b2Var3.f20421h0) {
                        b2Var3.dismiss();
                        return;
                    }
                    return;
                }
                return;
            case 21:
                org.telegram.ui.ActionBar.b2 b2Var4 = (org.telegram.ui.ActionBar.b2) this.f936b;
                if (!((org.telegram.ui.ActionBar.w1) this.f937c).f21338a) {
                    ii.g4 g4Var = b2Var4.f20430q0;
                    if (g4Var != null) {
                        g4Var.f(b2Var4, -2);
                    }
                    if (b2Var4.f20421h0) {
                        b2Var4.cancel();
                        return;
                    }
                    return;
                }
                return;
            case 22:
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) this.f936b;
                Activity activity = (Activity) this.f937c;
                org.telegram.ui.v3 v3Var2 = i4Var.K;
                if (!i4Var.f38503h0.A0) {
                    org.telegram.ui.m3 m3Var = i4Var.f38515u0[0];
                    if (m3Var.f()) {
                        if (m3Var.getWebView() != null && !i4Var.f38503h0.W) {
                            if (i4Var.f38504i0 != null) {
                                org.telegram.ui.web.y0 webView = m3Var.getWebView();
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
                                org.telegram.ui.web.k kVar = i4Var.f38504i0;
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
                                org.telegram.ui.y yVar = new org.telegram.ui.y(i4Var, u11, 0);
                                org.telegram.ui.z zVar2 = new org.telegram.ui.z(i4Var, m3Var, activity, 0);
                                org.telegram.ui.s sVar = new org.telegram.ui.s(i4Var, 1);
                                org.telegram.ui.s sVar2 = new org.telegram.ui.s(i4Var, 2);
                                org.telegram.ui.a0 a0Var = new org.telegram.ui.a0(i4Var, u11, m3Var, 0);
                                org.telegram.ui.web.c cVar2 = kVar.f43374w;
                                ImageView imageView = kVar.f43370f;
                                if (bitmap == null) {
                                    imageView.setImageResource(R.drawable.msg_language);
                                    str4 = str3;
                                    imageView.setColorFilter(new PorterDuffColorFilter(kVar.H, PorterDuff.Mode.SRC_IN));
                                } else {
                                    str4 = str3;
                                    imageView.setImageDrawable(new BitmapDrawable(kVar.getContext().getResources(), bitmap));
                                    imageView.setColorFilter((ColorFilter) null);
                                }
                                TextView textView = kVar.f43372r;
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
                                        TextView textView2 = kVar.f43373s;
                                        textView2.setText(Emoji.replaceEmoji(str6, textView2.getPaint().getFontMetricsInt(), false));
                                        kVar.L = zVar2;
                                        kVar.M = sVar;
                                        kVar.N = sVar2;
                                        kVar.f43369e.setOnClickListener(new vy0(18, kVar, yVar));
                                        kVar.f43371n.setOnClickListener(a0Var);
                                        kVar.f43367b = false;
                                        kVar.setInput(null);
                                        cVar2.W2.N(true);
                                        cVar2.u0(0);
                                        org.telegram.ui.l0 l0Var = i4Var.f38503h0;
                                        h3 h3Var2 = new h3(28, m3Var, activity);
                                        fi.o oVar = l0Var.f43479b0;
                                        oVar.setText("");
                                        oVar.setSelection(0, oVar.getText().length());
                                        oVar.setScrollX(0);
                                        l0Var.f43504v0 = h3Var2;
                                        l0Var.k(true);
                                        return;
                                    }
                                }
                                try {
                                    str6 = URLDecoder.decode(str5.replaceAll("\\+", "%2b"), "UTF-8");
                                } catch (Exception e12) {
                                    e = e12;
                                    FileLog.e(e);
                                    str6 = str5;
                                    TextView textView22 = kVar.f43373s;
                                    textView22.setText(Emoji.replaceEmoji(str6, textView22.getPaint().getFontMetricsInt(), false));
                                    kVar.L = zVar2;
                                    kVar.M = sVar;
                                    kVar.N = sVar2;
                                    kVar.f43369e.setOnClickListener(new vy0(18, kVar, yVar));
                                    kVar.f43371n.setOnClickListener(a0Var);
                                    kVar.f43367b = false;
                                    kVar.setInput(null);
                                    cVar2.W2.N(true);
                                    cVar2.u0(0);
                                    org.telegram.ui.l0 l0Var2 = i4Var.f38503h0;
                                    h3 h3Var22 = new h3(28, m3Var, activity);
                                    fi.o oVar2 = l0Var2.f43479b0;
                                    oVar2.setText("");
                                    oVar2.setSelection(0, oVar2.getText().length());
                                    oVar2.setScrollX(0);
                                    l0Var2.f43504v0 = h3Var22;
                                    l0Var2.k(true);
                                    return;
                                }
                                TextView textView222 = kVar.f43373s;
                                textView222.setText(Emoji.replaceEmoji(str6, textView222.getPaint().getFontMetricsInt(), false));
                                kVar.L = zVar2;
                                kVar.M = sVar;
                                kVar.N = sVar2;
                                kVar.f43369e.setOnClickListener(new vy0(18, kVar, yVar));
                                kVar.f43371n.setOnClickListener(a0Var);
                                kVar.f43367b = false;
                                kVar.setInput(null);
                                cVar2.W2.N(true);
                                cVar2.u0(0);
                            }
                            org.telegram.ui.l0 l0Var22 = i4Var.f38503h0;
                            h3 h3Var222 = new h3(28, m3Var, activity);
                            fi.o oVar22 = l0Var22.f43479b0;
                            oVar22.setText("");
                            oVar22.setSelection(0, oVar22.getText().length());
                            oVar22.setScrollX(0);
                            l0Var22.f43504v0 = h3Var222;
                            l0Var22.k(true);
                            return;
                        }
                        return;
                    } else if (v3Var2 != null) {
                        bx0 bx0Var = new bx0(activity);
                        bx0Var.f47827a = 1;
                        bx0Var.f25180s = -AndroidUtilities.dp(32.0f);
                        m3Var.d.w0(bx0Var);
                        return;
                    } else {
                        m3Var.f39752b.x0(0);
                        return;
                    }
                }
                return;
            case 23:
                org.telegram.ui.d1 d1Var = (org.telegram.ui.d1) this.f936b;
                t70 t70Var = (t70) this.f937c;
                if (d1Var.f36778f == 0) {
                    d1Var.a(1, true);
                    int i11 = ((org.telegram.ui.i4) t70Var).X;
                    TLRPC.Chat chat = t70Var.f41889n;
                    TLRPC.TL_channels_joinChannel tL_channels_joinChannel = new TLRPC.TL_channels_joinChannel();
                    tL_channels_joinChannel.channel = MessagesController.getInputChannel(chat);
                    ConnectionsManager.getInstance(i11).sendRequestTyped(tL_channels_joinChannel, new ei.h1(d1Var, i11, tL_channels_joinChannel, chat));
                    return;
                }
                return;
            case 24:
                org.telegram.ui.c5 c5Var = (org.telegram.ui.c5) this.f936b;
                c5Var.b(false);
                c5Var.f36522e.b((org.telegram.ui.d5) this.f937c);
                return;
            case 25:
                ((org.telegram.ui.w6) this.f936b).f43094e.u0((org.telegram.ui.Cells.a2) this.f937c);
                return;
            case 26:
                org.telegram.ui.d7 d7Var = (org.telegram.ui.d7) this.f936b;
                org.telegram.ui.l7 l7Var = (org.telegram.ui.l7) this.f937c;
                org.telegram.ui.h7 h7Var = d7Var.d.v;
                if (h7Var != null) {
                    h7Var.y0(l7Var.f39448c, l7Var.d, true);
                }
                org.telegram.ui.ActionBar.n1 n1Var2 = d7Var.f36874a;
                if (n1Var2 != null) {
                    n1Var2.d(true);
                    return;
                }
                return;
            case 27:
                org.telegram.ui.j9 j9Var = (org.telegram.ui.j9) this.f936b;
                org.telegram.ui.f9 f9Var = (org.telegram.ui.f9) this.f937c;
                ArrayList arrayList = f9Var.f37487b;
                if (arrayList.size() == 1) {
                    TLRPC.User user = (TLRPC.User) arrayList.get(0);
                    TLRPC.UserFull userFull = j9Var.getMessagesController().getUserFull(user.f20185id);
                    j9Var.P = user;
                    boolean z11 = f9Var.f37489e;
                    if (!z11 && (userFull == null || !userFull.video_calls_available)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    org.telegram.ui.Components.voip.f2.m(user, z11, z10, j9Var.getParentActivity(), null, j9Var.getAccountInstance());
                    return;
                }
                boolean z12 = f9Var.f37489e;
                HashSet hashSet = new HashSet();
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList.get(i12);
                    i12++;
                    hashSet.add(Long.valueOf(((TLRPC.User) obj).f20185id));
                }
                TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) f9Var.f37488c.get(0)).f20059id;
                org.telegram.ui.ActionBar.b2 b2Var5 = new org.telegram.ui.ActionBar.b2(j9Var.getParentActivity(), 3, null);
                TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                getgroupcall.call = tL_inputGroupCallInviteMessage;
                getgroupcall.limit = j9Var.getMessagesController().conferenceCallSizeLimit;
                b2Var5.setOnCancelListener(new org.telegram.ui.o8(j9Var, j9Var.getConnectionsManager().sendRequest(getgroupcall, new org.telegram.ui.n8(j9Var, b2Var5, hashSet, tL_inputGroupCallInviteMessage, z12, 1)), 1));
                b2Var5.q(600L);
                return;
            case 28:
                ke keVar = (ke) this.f936b;
                bb1 bb1Var = (bb1) this.f937c;
                ci.d dVar = keVar.K0;
                if (view.isEnabled() && !dVar.N) {
                    be beVar = keVar.Q0;
                    if (beVar == null || !beVar.N) {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        sd sdVar = new sd(keVar, twoStepVerificationActivity, 0);
                        twoStepVerificationActivity.Z = 1;
                        twoStepVerificationActivity.f34573b0 = sdVar;
                        dVar.setLoading(true);
                        twoStepVerificationActivity.s0(new td(keVar, bb1Var, twoStepVerificationActivity, 0));
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
