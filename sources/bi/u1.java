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
import di.pc;
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
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.rv;
import org.telegram.ui.Components.xv0;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bb1;
import org.telegram.ui.be;
import org.telegram.ui.co;
import org.telegram.ui.ke;
import org.telegram.ui.sd;
import org.telegram.ui.td;
import org.telegram.ui.v70;
import org.telegram.ui.wy0;
public final class u1 implements View.OnClickListener {
    public final int f3783a;
    public final Object f3784b;
    public final Object f3785c;

    public u1(int i10, Object obj, Object obj2) {
        this.f3783a = i10;
        this.f3784b = obj;
        this.f3785c = obj2;
    }

    @Override
    public final void onClick(View view) {
        Integer num;
        h5 h5Var;
        CharSequence charSequence;
        String str;
        String str2;
        Bitmap bitmap;
        String str3;
        String str4;
        String str5;
        String str6;
        boolean z10;
        switch (this.f3783a) {
            case 0:
                t1 t1Var = (t1) this.f3784b;
                Context context = (Context) this.f3785c;
                if (t1Var != null) {
                    int i10 = t1Var.f3718e;
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
                        TL_stories.StoryItem u10 = MessagesController.getInstance(i10).getStoriesController().u(t1Var.f3717c, t1Var.f3716b);
                        if (u10 == null) {
                            u10 = t1Var.f3715a;
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
                o5 o5Var = (o5) this.f3784b;
                z9 z9Var = (z9) this.f3785c;
                pb pbVar = o5Var.J0;
                if (z9Var.f4075b != null) {
                    Bundle bundle = new Bundle();
                    if (z9Var.f4075b.longValue() >= 0) {
                        bundle.putLong("user_id", z9Var.f4075b.longValue());
                    } else {
                        bundle.putLong("chat_id", -z9Var.f4075b.longValue());
                    }
                    if (z9Var.f4077e && (num = z9Var.d) != null) {
                        bundle.putInt("message_id", num.intValue());
                        pbVar.H(new co(bundle));
                        return;
                    }
                    pbVar.H(new ProfileActivity(bundle, null));
                    return;
                }
                qc Q = new yc(o5Var.f3409c1, o5Var.B0).Q(R.raw.error, 36, LocaleController.getString(R.string.StoryHidAccount));
                Q.f29672a = 3;
                Q.k(true);
                return;
            case 2:
                o5 o5Var2 = (o5) this.f3784b;
                ((gb) o5Var2.Q1).h(new sg.a1(o5Var2.J0.f3545f, 14, false));
                ((org.telegram.ui.ActionBar.f3) this.f3785c).dismiss();
                return;
            case 3:
                o5 o5Var3 = ((f5) this.f3784b).f2972l;
                rv alert = ((ja) this.f3785c).getAlert();
                if (alert != null && (h5Var = o5Var3.Q1) != null) {
                    ((gb) h5Var).h(alert);
                    o5Var3.f3460t1.a();
                    return;
                }
                return;
            case 4:
                di.x3 x3Var = (di.x3) this.f3784b;
                x3Var.e((MediaController.AlbumEntry) this.f3785c, false);
                x3Var.F.n();
                return;
            case 5:
                di.x8 x8Var = (di.x8) this.f3784b;
                di.b7 b7Var = (di.b7) this.f3785c;
                org.telegram.ui.Cells.i3 i3Var = x8Var.Y;
                try {
                    charSequence = ((ClipboardManager) x8Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(x8Var.getContext());
                } catch (Exception e7) {
                    FileLog.e(e7);
                    charSequence = null;
                }
                if (charSequence != null) {
                    i3Var.f22074b.setText(charSequence.toString());
                    org.telegram.ui.Cells.g3 g3Var = i3Var.f22074b;
                    g3Var.setSelection(0, g3Var.getText().length());
                }
                b7Var.run();
                return;
            case 6:
                pc pcVar = (pc) this.f3784b;
                new di.h9((Context) this.f3785c, pcVar.f7848c, true, pcVar.f7917x0, new di.la(pcVar, 20), pcVar.f7841a).show();
                return;
            case 7:
                fi.m.x0((fi.m) this.f3784b, (Context) this.f3785c);
                return;
            case 8:
                fi.k3 k3Var = (fi.k3) this.f3784b;
                fi.k0 k0Var = (fi.k0) this.f3785c;
                if (k0Var.c()) {
                    k0Var.a();
                } else {
                    File file = k0Var.d;
                    if (file != null && file.exists()) {
                        File file2 = k0Var.d;
                        AndroidUtilities.openForView(file2, file2.getName(), null, LaunchActivity.G1, null, true);
                    }
                }
                n70 n70Var = k3Var.K0;
                if (n70Var != null) {
                    n70Var.u();
                    k3Var.K0 = null;
                    return;
                }
                return;
            case 9:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.f3785c;
                ((org.telegram.ui.ActionBar.f3) this.f3784b).dismiss();
                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(ProfileActivity.m4(connectedbotstarref.bot_id));
                    return;
                }
                return;
            case 10:
                AndroidUtilities.addToClipboard(((TL_account.TL_businessChatLink) this.f3784b).link);
                yc.a0((co) this.f3785c).k(false).j();
                return;
            case 11:
                ig.k0.Q((ig.k0) this.f3784b, (TL_account.TL_connectedBot) this.f3785c);
                return;
            case 12:
                ii.c cVar = (ii.c) this.f3784b;
                cVar.getClass();
                ((Runnable) this.f3785c).run();
                cVar.dismiss();
                return;
            case 13:
                ji.c2.Y((ji.c2) this.f3784b, (Context) this.f3785c, view);
                return;
            case 14:
                ((VideoAds) this.f3784b).lambda$show$2((VideoAds.CloseDrawable) this.f3785c, view);
                return;
            case 15:
                ((VideoAds) this.f3784b).lambda$show$18((TLRPC.TL_sponsoredMessage) this.f3785c, view);
                return;
            case 16:
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) this.f3784b;
                org.telegram.ui.ActionBar.u0 u0Var = (org.telegram.ui.ActionBar.u0) this.f3785c;
                int indexOf = v0Var.f21387g0.indexOf(u0Var.getFilter());
                if (v0Var.f21388h0 != indexOf) {
                    v0Var.f21388h0 = indexOf;
                    v0Var.y();
                    return;
                } else if (u0Var.getFilter().h) {
                    if (!u0Var.f21355a.f15369f) {
                        u0Var.setSelectedForDelete(true);
                        return;
                    }
                    hg.q0 filter = u0Var.getFilter();
                    v0Var.C(filter);
                    org.telegram.ui.ActionBar.g5 g5Var = v0Var.H;
                    if (g5Var != null) {
                        g5Var.o(filter);
                        v0Var.H.q(v0Var.f21383e);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 17:
                org.telegram.ui.ActionBar.t0 t0Var = (org.telegram.ui.ActionBar.t0) this.f3784b;
                org.telegram.ui.ActionBar.v0 v0Var2 = (org.telegram.ui.ActionBar.v0) this.f3785c;
                org.telegram.ui.ActionBar.n1 n1Var = v0Var2.d;
                if (n1Var != null && n1Var.isShowing() && t0Var.f21338f) {
                    if (!v0Var2.T) {
                        v0Var2.T = true;
                        v0Var2.d.d(v0Var2.R);
                    } else {
                        return;
                    }
                }
                org.telegram.ui.ActionBar.z zVar = v0Var2.f21380c;
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
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.f3784b;
                if (!((org.telegram.ui.ActionBar.w1) this.f3785c).f21136a) {
                    org.telegram.ui.ActionBar.a2 a2Var = b2Var.m0;
                    if (a2Var != null) {
                        a2Var.g(b2Var, -1);
                    }
                    if (b2Var.f20238h0) {
                        b2Var.dismiss();
                        return;
                    }
                    return;
                }
                return;
            case 19:
                org.telegram.ui.ActionBar.b2 b2Var2 = (org.telegram.ui.ActionBar.b2) this.f3784b;
                if (!((org.telegram.ui.ActionBar.w1) this.f3785c).f21136a) {
                    org.telegram.ui.ActionBar.a2 a2Var2 = b2Var2.f20245o0;
                    if (a2Var2 != null) {
                        a2Var2.g(b2Var2, -2);
                    }
                    if (b2Var2.f20238h0) {
                        b2Var2.cancel();
                        return;
                    }
                    return;
                }
                return;
            case 20:
                org.telegram.ui.ActionBar.b2 b2Var3 = (org.telegram.ui.ActionBar.b2) this.f3784b;
                if (!((org.telegram.ui.ActionBar.w1) this.f3785c).f21136a) {
                    org.telegram.ui.ActionBar.a2 a2Var3 = b2Var3.f20251s0;
                    if (a2Var3 != null) {
                        a2Var3.g(b2Var3, -2);
                    }
                    if (b2Var3.f20238h0) {
                        b2Var3.dismiss();
                        return;
                    }
                    return;
                }
                return;
            case 21:
                org.telegram.ui.ActionBar.b2 b2Var4 = (org.telegram.ui.ActionBar.b2) this.f3784b;
                if (!((org.telegram.ui.ActionBar.w1) this.f3785c).f21136a) {
                    ji.e4 e4Var = b2Var4.f20247q0;
                    if (e4Var != null) {
                        e4Var.g(b2Var4, -2);
                    }
                    if (b2Var4.f20238h0) {
                        b2Var4.cancel();
                        return;
                    }
                    return;
                }
                return;
            case 22:
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) this.f3784b;
                Activity activity = (Activity) this.f3785c;
                org.telegram.ui.v3 v3Var = i4Var.K;
                if (!i4Var.f37220h0.A0) {
                    org.telegram.ui.m3 m3Var = i4Var.f37232u0[0];
                    if (m3Var.f()) {
                        if (m3Var.getWebView() != null && !i4Var.f37220h0.W) {
                            if (i4Var.f37221i0 != null) {
                                org.telegram.ui.web.z0 webView = m3Var.getWebView();
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
                                org.telegram.ui.web.l lVar = i4Var.f37221i0;
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
                                org.telegram.ui.x xVar = new org.telegram.ui.x(i4Var, v, 0);
                                org.telegram.ui.y yVar = new org.telegram.ui.y(i4Var, m3Var, activity, 0);
                                org.telegram.ui.r rVar = new org.telegram.ui.r(i4Var, 1);
                                org.telegram.ui.r rVar2 = new org.telegram.ui.r(i4Var, 2);
                                org.telegram.ui.z zVar2 = new org.telegram.ui.z(i4Var, v, m3Var, 0);
                                org.telegram.ui.web.d dVar = lVar.f42166w;
                                ImageView imageView = lVar.f42162f;
                                if (bitmap == null) {
                                    imageView.setImageResource(R.drawable.msg_language);
                                    str4 = str3;
                                    imageView.setColorFilter(new PorterDuffColorFilter(lVar.H, PorterDuff.Mode.SRC_IN));
                                } else {
                                    str4 = str3;
                                    imageView.setImageDrawable(new BitmapDrawable(lVar.getContext().getResources(), bitmap));
                                    imageView.setColorFilter((ColorFilter) null);
                                }
                                TextView textView = lVar.f42164r;
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
                                        TextView textView2 = lVar.f42165s;
                                        textView2.setText(Emoji.replaceEmoji(str6, textView2.getPaint().getFontMetricsInt(), false));
                                        lVar.L = yVar;
                                        lVar.M = rVar;
                                        lVar.N = rVar2;
                                        lVar.f42161e.setOnClickListener(new wy0(12, lVar, xVar));
                                        lVar.f42163n.setOnClickListener(zVar2);
                                        lVar.f42159b = false;
                                        lVar.setInput(null);
                                        dVar.Y2.N(true);
                                        dVar.u0(0);
                                        org.telegram.ui.k0 k0Var2 = i4Var.f37220h0;
                                        di.m2 m2Var = new di.m2(27, m3Var, activity);
                                        gi.o oVar = k0Var2.f42277b0;
                                        oVar.setText("");
                                        oVar.setSelection(0, oVar.getText().length());
                                        oVar.setScrollX(0);
                                        k0Var2.f42302v0 = m2Var;
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
                                    TextView textView22 = lVar.f42165s;
                                    textView22.setText(Emoji.replaceEmoji(str6, textView22.getPaint().getFontMetricsInt(), false));
                                    lVar.L = yVar;
                                    lVar.M = rVar;
                                    lVar.N = rVar2;
                                    lVar.f42161e.setOnClickListener(new wy0(12, lVar, xVar));
                                    lVar.f42163n.setOnClickListener(zVar2);
                                    lVar.f42159b = false;
                                    lVar.setInput(null);
                                    dVar.Y2.N(true);
                                    dVar.u0(0);
                                    org.telegram.ui.k0 k0Var22 = i4Var.f37220h0;
                                    di.m2 m2Var2 = new di.m2(27, m3Var, activity);
                                    gi.o oVar2 = k0Var22.f42277b0;
                                    oVar2.setText("");
                                    oVar2.setSelection(0, oVar2.getText().length());
                                    oVar2.setScrollX(0);
                                    k0Var22.f42302v0 = m2Var2;
                                    k0Var22.k(true);
                                    return;
                                }
                                TextView textView222 = lVar.f42165s;
                                textView222.setText(Emoji.replaceEmoji(str6, textView222.getPaint().getFontMetricsInt(), false));
                                lVar.L = yVar;
                                lVar.M = rVar;
                                lVar.N = rVar2;
                                lVar.f42161e.setOnClickListener(new wy0(12, lVar, xVar));
                                lVar.f42163n.setOnClickListener(zVar2);
                                lVar.f42159b = false;
                                lVar.setInput(null);
                                dVar.Y2.N(true);
                                dVar.u0(0);
                            }
                            org.telegram.ui.k0 k0Var222 = i4Var.f37220h0;
                            di.m2 m2Var22 = new di.m2(27, m3Var, activity);
                            gi.o oVar22 = k0Var222.f42277b0;
                            oVar22.setText("");
                            oVar22.setSelection(0, oVar22.getText().length());
                            oVar22.setScrollX(0);
                            k0Var222.f42302v0 = m2Var22;
                            k0Var222.k(true);
                            return;
                        }
                        return;
                    } else if (v3Var != null) {
                        xv0 xv0Var = new xv0(activity);
                        xv0Var.f45906a = 1;
                        xv0Var.f32750s = -AndroidUtilities.dp(32.0f);
                        m3Var.d.w0(xv0Var);
                        return;
                    } else {
                        m3Var.f38551b.x0(0);
                        return;
                    }
                }
                return;
            case 23:
                org.telegram.ui.d1 d1Var = (org.telegram.ui.d1) this.f3784b;
                v70 v70Var = (v70) this.f3785c;
                if (d1Var.f35593f == 0) {
                    d1Var.a(1, true);
                    int i11 = ((org.telegram.ui.i4) v70Var).X;
                    TLRPC.Chat chat = v70Var.f41438n;
                    TLRPC.TL_channels_joinChannel tL_channels_joinChannel = new TLRPC.TL_channels_joinChannel();
                    tL_channels_joinChannel.channel = MessagesController.getInputChannel(chat);
                    ConnectionsManager.getInstance(i11).sendRequestTyped(tL_channels_joinChannel, new fi.h1(d1Var, i11, tL_channels_joinChannel, chat));
                    return;
                }
                return;
            case 24:
                org.telegram.ui.c5 c5Var = (org.telegram.ui.c5) this.f3784b;
                c5Var.b(false);
                c5Var.f34997e.b((org.telegram.ui.d5) this.f3785c);
                return;
            case 25:
                ((org.telegram.ui.x6) this.f3784b).f42597e.u0((org.telegram.ui.Cells.z1) this.f3785c);
                return;
            case 26:
                org.telegram.ui.e7 e7Var = (org.telegram.ui.e7) this.f3784b;
                org.telegram.ui.m7 m7Var = (org.telegram.ui.m7) this.f3785c;
                org.telegram.ui.i7 i7Var = e7Var.d.v;
                if (i7Var != null) {
                    i7Var.k1(m7Var.f38586c, m7Var.d, true);
                }
                org.telegram.ui.ActionBar.n1 n1Var2 = e7Var.f35953a;
                if (n1Var2 != null) {
                    n1Var2.d(true);
                    return;
                }
                return;
            case 27:
                org.telegram.ui.k9 k9Var = (org.telegram.ui.k9) this.f3784b;
                org.telegram.ui.g9 g9Var = (org.telegram.ui.g9) this.f3785c;
                ArrayList arrayList = g9Var.f36601b;
                if (arrayList.size() == 1) {
                    TLRPC.User user = (TLRPC.User) arrayList.get(0);
                    TLRPC.UserFull userFull = k9Var.getMessagesController().getUserFull(user.f20016id);
                    k9Var.P = user;
                    boolean z11 = g9Var.f36603e;
                    if (!z11 && (userFull == null || !userFull.video_calls_available)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    org.telegram.ui.Components.voip.d2.m(user, z11, z10, k9Var.getParentActivity(), null, k9Var.getAccountInstance());
                    return;
                }
                boolean z12 = g9Var.f36603e;
                HashSet hashSet = new HashSet();
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList.get(i12);
                    i12++;
                    hashSet.add(Long.valueOf(((TLRPC.User) obj).f20016id));
                }
                TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) g9Var.f36602c.get(0)).f19890id;
                org.telegram.ui.ActionBar.b2 b2Var5 = new org.telegram.ui.ActionBar.b2(k9Var.getParentActivity(), 3, null);
                TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                getgroupcall.call = tL_inputGroupCallInviteMessage;
                getgroupcall.limit = k9Var.getMessagesController().conferenceCallSizeLimit;
                b2Var5.setOnCancelListener(new org.telegram.ui.p8(k9Var, k9Var.getConnectionsManager().sendRequest(getgroupcall, new org.telegram.ui.o8(k9Var, b2Var5, hashSet, tL_inputGroupCallInviteMessage, z12, 1)), 1));
                b2Var5.q(600L);
                return;
            case 28:
                ke keVar = (ke) this.f3784b;
                bb1 bb1Var = (bb1) this.f3785c;
                di.d dVar2 = keVar.K0;
                if (view.isEnabled() && !dVar2.N) {
                    be beVar = keVar.Q0;
                    if (beVar == null || !beVar.N) {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        sd sdVar = new sd(keVar, twoStepVerificationActivity, 0);
                        twoStepVerificationActivity.Z = 1;
                        twoStepVerificationActivity.f34218b0 = sdVar;
                        dVar2.setLoading(true);
                        twoStepVerificationActivity.s0(new td(keVar, bb1Var, twoStepVerificationActivity, 0));
                        return;
                    }
                    return;
                }
                return;
            default:
                of.f.s((Context) this.f3785c, ((TL_stats.TL_broadcastRevenueTransactionWithdrawal) this.f3784b).transaction_url);
                return;
        }
    }

    public u1(Context context, TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal) {
        this.f3783a = 29;
        this.f3785c = context;
        this.f3784b = tL_broadcastRevenueTransactionWithdrawal;
    }
}
