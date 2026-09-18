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
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.sv;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.be;
import org.telegram.ui.ke;
import org.telegram.ui.sd;
import org.telegram.ui.td;
import org.telegram.ui.u70;
import org.telegram.ui.vy0;
import org.telegram.ui.za1;
import org.telegram.ui.zn;
public final class f2 implements View.OnClickListener {
    public final int f787a;
    public final Object f788b;
    public final Object f789c;

    public f2(int i10, Object obj, Object obj2) {
        this.f787a = i10;
        this.f788b = obj;
        this.f789c = obj2;
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
        switch (this.f787a) {
            case 0:
                d2 d2Var = (d2) this.f788b;
                Context context = (Context) this.f789c;
                if (d2Var != null) {
                    int i10 = d2Var.e;
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
                        TL_stories.StoryItem u10 = MessagesController.getInstance(i10).getStoriesController().u(d2Var.f690c, d2Var.f689b);
                        if (u10 == null) {
                            u10 = d2Var.f688a;
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
                f6 f6Var = (f6) this.f788b;
                sa saVar = (sa) this.f789c;
                jc jcVar = f6Var.J0;
                if (saVar.f1514b != null) {
                    Bundle bundle = new Bundle();
                    if (saVar.f1514b.longValue() >= 0) {
                        bundle.putLong("user_id", saVar.f1514b.longValue());
                    } else {
                        bundle.putLong("chat_id", -saVar.f1514b.longValue());
                    }
                    if (saVar.e && (num = saVar.d) != null) {
                        bundle.putInt("message_id", num.intValue());
                        jcVar.H(new zn(bundle));
                        return;
                    }
                    jcVar.H(new ProfileActivity(bundle, null));
                    return;
                }
                org.telegram.ui.Components.qc Q = new xc(f6Var.f803c1, f6Var.B0).Q(R.raw.error, 36, LocaleController.getString(R.string.StoryHidAccount));
                Q.f27544a = 3;
                Q.k(true);
                return;
            case 2:
                f6 f6Var2 = (f6) this.f788b;
                ((ac) f6Var2.Q1).h(new rg.x0(f6Var2.J0.f1080f, 14, false));
                ((org.telegram.ui.ActionBar.f3) this.f789c).dismiss();
                return;
            case 3:
                f6 f6Var3 = ((w5) this.f788b).f1658l;
                sv alert = ((db) this.f789c).getAlert();
                if (alert != null && (y5Var = f6Var3.Q1) != null) {
                    ((ac) y5Var).h(alert);
                    f6Var3.f854t1.a();
                    return;
                }
                return;
            case 4:
                ci.x3 x3Var = (ci.x3) this.f788b;
                x3Var.e((MediaController.AlbumEntry) this.f789c, false);
                x3Var.F.n();
                return;
            case 5:
                ci.x8 x8Var = (ci.x8) this.f788b;
                ba baVar = (ba) this.f789c;
                org.telegram.ui.Cells.j3 j3Var = x8Var.Y;
                try {
                    charSequence = ((ClipboardManager) x8Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(x8Var.getContext());
                } catch (Exception e) {
                    FileLog.e(e);
                    charSequence = null;
                }
                if (charSequence != null) {
                    j3Var.f20455b.setText(charSequence.toString());
                    org.telegram.ui.Cells.h3 h3Var = j3Var.f20455b;
                    h3Var.setSelection(0, h3Var.getText().length());
                }
                baVar.run();
                return;
            case 6:
                ci.oc ocVar = (ci.oc) this.f788b;
                new ci.i9((Context) this.f789c, ocVar.f5211c, true, ocVar.f5279x0, new ci.la(ocVar, 20), ocVar.f5204a).show();
                return;
            case 7:
                ei.l.x0((ei.l) this.f788b, (Context) this.f789c);
                return;
            case 8:
                ei.k3 k3Var = (ei.k3) this.f788b;
                ei.k0 k0Var = (ei.k0) this.f789c;
                if (k0Var.c()) {
                    k0Var.a();
                } else {
                    File file = k0Var.d;
                    if (file != null && file.exists()) {
                        File file2 = k0Var.d;
                        AndroidUtilities.openForView(file2, file2.getName(), null, LaunchActivity.G1, null, true);
                    }
                }
                w70 w70Var = k3Var.K0;
                if (w70Var != null) {
                    w70Var.u();
                    k3Var.K0 = null;
                    return;
                }
                return;
            case 9:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.f789c;
                ((org.telegram.ui.ActionBar.f3) this.f788b).dismiss();
                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(ProfileActivity.m4(connectedbotstarref.bot_id));
                    return;
                }
                return;
            case 10:
                AndroidUtilities.addToClipboard(((TL_account.TL_businessChatLink) this.f788b).link);
                xc.a0((zn) this.f789c).k(false).j();
                return;
            case 11:
                hg.l0.Q((hg.l0) this.f788b, (TL_account.TL_connectedBot) this.f789c);
                return;
            case 12:
                hi.c cVar = (hi.c) this.f788b;
                cVar.getClass();
                ((Runnable) this.f789c).run();
                cVar.dismiss();
                return;
            case 13:
                ii.d2.Y((ii.d2) this.f788b, (Context) this.f789c, view);
                return;
            case 14:
                ((VideoAds) this.f788b).lambda$show$2((VideoAds.CloseDrawable) this.f789c, view);
                return;
            case 15:
                ((VideoAds) this.f788b).lambda$show$18((TLRPC.TL_sponsoredMessage) this.f789c, view);
                return;
            case 16:
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) this.f788b;
                org.telegram.ui.ActionBar.u0 u0Var = (org.telegram.ui.ActionBar.u0) this.f789c;
                int indexOf = v0Var.f19773g0.indexOf(u0Var.getFilter());
                if (v0Var.f19774h0 != indexOf) {
                    v0Var.f19774h0 = indexOf;
                    v0Var.y();
                    return;
                } else if (u0Var.getFilter().h) {
                    if (!u0Var.f19745a.f14131f) {
                        u0Var.setSelectedForDelete(true);
                        return;
                    }
                    gg.q0 filter = u0Var.getFilter();
                    v0Var.C(filter);
                    org.telegram.ui.ActionBar.g5 g5Var = v0Var.H;
                    if (g5Var != null) {
                        g5Var.o(filter);
                        v0Var.H.q(v0Var.e);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 17:
                org.telegram.ui.ActionBar.t0 t0Var = (org.telegram.ui.ActionBar.t0) this.f788b;
                org.telegram.ui.ActionBar.v0 v0Var2 = (org.telegram.ui.ActionBar.v0) this.f789c;
                org.telegram.ui.ActionBar.n1 n1Var = v0Var2.d;
                if (n1Var != null && n1Var.isShowing() && t0Var.f19728f) {
                    if (!v0Var2.T) {
                        v0Var2.T = true;
                        v0Var2.d.d(v0Var2.R);
                    } else {
                        return;
                    }
                }
                org.telegram.ui.ActionBar.z zVar = v0Var2.f19767c;
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
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.f788b;
                if (!((org.telegram.ui.ActionBar.w1) this.f789c).f19539a) {
                    org.telegram.ui.ActionBar.a2 a2Var = b2Var.m0;
                    if (a2Var != null) {
                        a2Var.f(b2Var, -1);
                    }
                    if (b2Var.f18659h0) {
                        b2Var.dismiss();
                        return;
                    }
                    return;
                }
                return;
            case 19:
                org.telegram.ui.ActionBar.b2 b2Var2 = (org.telegram.ui.ActionBar.b2) this.f788b;
                if (!((org.telegram.ui.ActionBar.w1) this.f789c).f19539a) {
                    org.telegram.ui.ActionBar.a2 a2Var2 = b2Var2.f18666o0;
                    if (a2Var2 != null) {
                        a2Var2.f(b2Var2, -2);
                    }
                    if (b2Var2.f18659h0) {
                        b2Var2.cancel();
                        return;
                    }
                    return;
                }
                return;
            case 20:
                org.telegram.ui.ActionBar.b2 b2Var3 = (org.telegram.ui.ActionBar.b2) this.f788b;
                if (!((org.telegram.ui.ActionBar.w1) this.f789c).f19539a) {
                    org.telegram.ui.ActionBar.a2 a2Var3 = b2Var3.f18672s0;
                    if (a2Var3 != null) {
                        a2Var3.f(b2Var3, -2);
                    }
                    if (b2Var3.f18659h0) {
                        b2Var3.dismiss();
                        return;
                    }
                    return;
                }
                return;
            case 21:
                org.telegram.ui.ActionBar.b2 b2Var4 = (org.telegram.ui.ActionBar.b2) this.f788b;
                if (!((org.telegram.ui.ActionBar.w1) this.f789c).f19539a) {
                    ii.e4 e4Var = b2Var4.f18668q0;
                    if (e4Var != null) {
                        e4Var.f(b2Var4, -2);
                    }
                    if (b2Var4.f18659h0) {
                        b2Var4.cancel();
                        return;
                    }
                    return;
                }
                return;
            case 22:
                org.telegram.ui.h4 h4Var = (org.telegram.ui.h4) this.f788b;
                Activity activity = (Activity) this.f789c;
                org.telegram.ui.u3 u3Var = h4Var.K;
                if (!h4Var.f34062h0.A0) {
                    org.telegram.ui.l3 l3Var = h4Var.f34074u0[0];
                    if (l3Var.f()) {
                        if (l3Var.getWebView() != null && !h4Var.f34062h0.W) {
                            if (h4Var.f34063i0 != null) {
                                org.telegram.ui.web.z0 webView = l3Var.getWebView();
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
                                String v = org.telegram.ui.web.d1.v(str2);
                                org.telegram.ui.web.k kVar = h4Var.f34063i0;
                                if (webView != null) {
                                    bitmap = webView.getFavicon();
                                } else {
                                    bitmap = null;
                                }
                                if (TextUtils.isEmpty(str)) {
                                    str = LocaleController.getString(R.string.WebEmpty);
                                }
                                if (TextUtils.isEmpty(v)) {
                                    str3 = "about:blank";
                                } else {
                                    str3 = v;
                                }
                                org.telegram.ui.x xVar = new org.telegram.ui.x(h4Var, v, 0);
                                org.telegram.ui.y yVar = new org.telegram.ui.y(h4Var, l3Var, activity, 0);
                                org.telegram.ui.r rVar = new org.telegram.ui.r(h4Var, 1);
                                org.telegram.ui.r rVar2 = new org.telegram.ui.r(h4Var, 2);
                                org.telegram.ui.z zVar2 = new org.telegram.ui.z(h4Var, v, l3Var, 0);
                                org.telegram.ui.web.c cVar2 = kVar.f38963w;
                                ImageView imageView = kVar.f38959f;
                                if (bitmap == null) {
                                    imageView.setImageResource(R.drawable.msg_language);
                                    str4 = str3;
                                    imageView.setColorFilter(new PorterDuffColorFilter(kVar.H, PorterDuff.Mode.SRC_IN));
                                } else {
                                    str4 = str3;
                                    imageView.setImageDrawable(new BitmapDrawable(kVar.getContext().getResources(), bitmap));
                                    imageView.setColorFilter((ColorFilter) null);
                                }
                                TextView textView = kVar.f38961r;
                                textView.setText(Emoji.replaceEmoji(str, textView.getPaint().getFontMetricsInt(), false));
                                try {
                                    Uri parse = Uri.parse(str4);
                                    str5 = nf.f.v(parse, null, null, nf.f.a(parse.getHost()), null);
                                } catch (Exception e7) {
                                    try {
                                        FileLog.e((Throwable) e7, false);
                                        str5 = str4;
                                    } catch (Exception e10) {
                                        e = e10;
                                        str5 = str4;
                                        FileLog.e(e);
                                        str6 = str5;
                                        TextView textView2 = kVar.f38962s;
                                        textView2.setText(Emoji.replaceEmoji(str6, textView2.getPaint().getFontMetricsInt(), false));
                                        kVar.L = yVar;
                                        kVar.M = rVar;
                                        kVar.N = rVar2;
                                        kVar.e.setOnClickListener(new vy0(12, kVar, xVar));
                                        kVar.f38960n.setOnClickListener(zVar2);
                                        kVar.f38957b = false;
                                        kVar.setInput(null);
                                        cVar2.Y2.N(true);
                                        cVar2.v0(0);
                                        org.telegram.ui.k0 k0Var2 = h4Var.f34062h0;
                                        ci.m2 m2Var = new ci.m2(27, l3Var, activity);
                                        fi.o oVar = k0Var2.f39077b0;
                                        oVar.setText("");
                                        oVar.setSelection(0, oVar.getText().length());
                                        oVar.setScrollX(0);
                                        k0Var2.f39101v0 = m2Var;
                                        k0Var2.k(true);
                                        return;
                                    }
                                }
                                try {
                                    str6 = URLDecoder.decode(str5.replaceAll("\\+", "%2b"), "UTF-8");
                                } catch (Exception e11) {
                                    e = e11;
                                    FileLog.e(e);
                                    str6 = str5;
                                    TextView textView22 = kVar.f38962s;
                                    textView22.setText(Emoji.replaceEmoji(str6, textView22.getPaint().getFontMetricsInt(), false));
                                    kVar.L = yVar;
                                    kVar.M = rVar;
                                    kVar.N = rVar2;
                                    kVar.e.setOnClickListener(new vy0(12, kVar, xVar));
                                    kVar.f38960n.setOnClickListener(zVar2);
                                    kVar.f38957b = false;
                                    kVar.setInput(null);
                                    cVar2.Y2.N(true);
                                    cVar2.v0(0);
                                    org.telegram.ui.k0 k0Var22 = h4Var.f34062h0;
                                    ci.m2 m2Var2 = new ci.m2(27, l3Var, activity);
                                    fi.o oVar2 = k0Var22.f39077b0;
                                    oVar2.setText("");
                                    oVar2.setSelection(0, oVar2.getText().length());
                                    oVar2.setScrollX(0);
                                    k0Var22.f39101v0 = m2Var2;
                                    k0Var22.k(true);
                                    return;
                                }
                                TextView textView222 = kVar.f38962s;
                                textView222.setText(Emoji.replaceEmoji(str6, textView222.getPaint().getFontMetricsInt(), false));
                                kVar.L = yVar;
                                kVar.M = rVar;
                                kVar.N = rVar2;
                                kVar.e.setOnClickListener(new vy0(12, kVar, xVar));
                                kVar.f38960n.setOnClickListener(zVar2);
                                kVar.f38957b = false;
                                kVar.setInput(null);
                                cVar2.Y2.N(true);
                                cVar2.v0(0);
                            }
                            org.telegram.ui.k0 k0Var222 = h4Var.f34062h0;
                            ci.m2 m2Var22 = new ci.m2(27, l3Var, activity);
                            fi.o oVar22 = k0Var222.f39077b0;
                            oVar22.setText("");
                            oVar22.setSelection(0, oVar22.getText().length());
                            oVar22.setScrollX(0);
                            k0Var222.f39101v0 = m2Var22;
                            k0Var222.k(true);
                            return;
                        }
                        return;
                    } else if (u3Var != null) {
                        kw0 kw0Var = new kw0(activity);
                        kw0Var.f43079a = 1;
                        kw0Var.f25862s = -AndroidUtilities.dp(32.0f);
                        l3Var.d.w0(kw0Var);
                        return;
                    } else {
                        l3Var.f35224b.y0(0);
                        return;
                    }
                }
                return;
            case 23:
                org.telegram.ui.c1 c1Var = (org.telegram.ui.c1) this.f788b;
                u70 u70Var = (u70) this.f789c;
                if (c1Var.f32493f == 0) {
                    c1Var.a(1, true);
                    int i11 = ((org.telegram.ui.h4) u70Var).X;
                    TLRPC.Chat chat = u70Var.f37899n;
                    TLRPC.TL_channels_joinChannel tL_channels_joinChannel = new TLRPC.TL_channels_joinChannel();
                    tL_channels_joinChannel.channel = MessagesController.getInputChannel(chat);
                    ConnectionsManager.getInstance(i11).sendRequestTyped(tL_channels_joinChannel, new ei.h1(c1Var, i11, tL_channels_joinChannel, chat));
                    return;
                }
                return;
            case 24:
                org.telegram.ui.c5 c5Var = (org.telegram.ui.c5) this.f788b;
                c5Var.b(false);
                c5Var.e.b((org.telegram.ui.d5) this.f789c);
                return;
            case 25:
                ((org.telegram.ui.x6) this.f788b).e.v0((org.telegram.ui.Cells.a2) this.f789c);
                return;
            case 26:
                org.telegram.ui.e7 e7Var = (org.telegram.ui.e7) this.f788b;
                org.telegram.ui.n7 n7Var = (org.telegram.ui.n7) this.f789c;
                org.telegram.ui.j7 j7Var = e7Var.e.E;
                if (j7Var != null) {
                    j7Var.H0(n7Var.f35829c, n7Var.d, true);
                }
                org.telegram.ui.ActionBar.n1 n1Var2 = e7Var.f33187a;
                if (n1Var2 != null) {
                    n1Var2.d(true);
                    return;
                }
                return;
            case 27:
                org.telegram.ui.l9 l9Var = (org.telegram.ui.l9) this.f788b;
                org.telegram.ui.h9 h9Var = (org.telegram.ui.h9) this.f789c;
                ArrayList arrayList = h9Var.f34105b;
                if (arrayList.size() == 1) {
                    TLRPC.User user = (TLRPC.User) arrayList.get(0);
                    TLRPC.UserFull userFull = l9Var.getMessagesController().getUserFull(user.f18443id);
                    l9Var.P = user;
                    boolean z11 = h9Var.e;
                    if (!z11 && (userFull == null || !userFull.video_calls_available)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    org.telegram.ui.Components.voip.f2.m(user, z11, z10, l9Var.getParentActivity(), null, l9Var.getAccountInstance());
                    return;
                }
                boolean z12 = h9Var.e;
                HashSet hashSet = new HashSet();
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList.get(i12);
                    i12++;
                    hashSet.add(Long.valueOf(((TLRPC.User) obj).f18443id));
                }
                TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) h9Var.f34106c.get(0)).f18317id;
                org.telegram.ui.ActionBar.b2 b2Var5 = new org.telegram.ui.ActionBar.b2(l9Var.getParentActivity(), 3, null);
                TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                getgroupcall.call = tL_inputGroupCallInviteMessage;
                getgroupcall.limit = l9Var.getMessagesController().conferenceCallSizeLimit;
                b2Var5.setOnCancelListener(new org.telegram.ui.q8(l9Var, l9Var.getConnectionsManager().sendRequest(getgroupcall, new org.telegram.ui.p8(l9Var, b2Var5, hashSet, tL_inputGroupCallInviteMessage, z12, 1)), 1));
                b2Var5.q(600L);
                return;
            case 28:
                ke keVar = (ke) this.f788b;
                za1 za1Var = (za1) this.f789c;
                ci.d dVar = keVar.K0;
                if (view.isEnabled() && !dVar.N) {
                    be beVar = keVar.Q0;
                    if (beVar == null || !beVar.N) {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        sd sdVar = new sd(keVar, twoStepVerificationActivity, 0);
                        twoStepVerificationActivity.Z = 1;
                        twoStepVerificationActivity.f31835b0 = sdVar;
                        dVar.setLoading(true);
                        twoStepVerificationActivity.s0(new td(keVar, za1Var, twoStepVerificationActivity, 0));
                        return;
                    }
                    return;
                }
                return;
            default:
                nf.f.s((Context) this.f789c, ((TL_stats.TL_broadcastRevenueTransactionWithdrawal) this.f788b).transaction_url);
                return;
        }
    }

    public f2(Context context, TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal) {
        this.f787a = 29;
        this.f789c = context;
        this.f788b = tL_broadcastRevenueTransactionWithdrawal;
    }
}
