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
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.tv;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.yv0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ae;
import org.telegram.ui.je;
import org.telegram.ui.py0;
import org.telegram.ui.r70;
import org.telegram.ui.ra1;
import org.telegram.ui.rd;
import org.telegram.ui.sd;
import org.telegram.ui.xn;
public final class f2 implements View.OnClickListener {
    public final int f868a;
    public final Object f869b;
    public final Object f870c;

    public f2(int i10, Object obj, Object obj2) {
        this.f868a = i10;
        this.f869b = obj;
        this.f870c = obj2;
    }

    @Override
    public final void onClick(View view) {
        Integer num;
        x5 x5Var;
        CharSequence charSequence;
        String str;
        String str2;
        Bitmap bitmap;
        String str3;
        String str4;
        String str5;
        String str6;
        boolean z10;
        switch (this.f868a) {
            case 0:
                d2 d2Var = (d2) this.f869b;
                Context context = (Context) this.f870c;
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
                        TL_stories.StoryItem u10 = MessagesController.getInstance(i10).getStoriesController().u(d2Var.f696c, d2Var.f695b);
                        if (u10 == null) {
                            u10 = d2Var.f694a;
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
                e6 e6Var = (e6) this.f869b;
                sa saVar = (sa) this.f870c;
                jc jcVar = e6Var.J0;
                if (saVar.f1513b != null) {
                    Bundle bundle = new Bundle();
                    if (saVar.f1513b.longValue() >= 0) {
                        bundle.putLong("user_id", saVar.f1513b.longValue());
                    } else {
                        bundle.putLong("chat_id", -saVar.f1513b.longValue());
                    }
                    if (saVar.e && (num = saVar.d) != null) {
                        bundle.putInt("message_id", num.intValue());
                        jcVar.H(new xn(bundle));
                        return;
                    }
                    jcVar.H(new ProfileActivity(bundle, null));
                    return;
                }
                org.telegram.ui.Components.qc Q = new xc(e6Var.f776c1, e6Var.B0).Q(R.raw.error, 36, LocaleController.getString(R.string.StoryHidAccount));
                Q.f27300a = 3;
                Q.k(true);
                return;
            case 2:
                e6 e6Var2 = (e6) this.f869b;
                ((ac) e6Var2.Q1).h(new rg.x0(e6Var2.J0.f1071f, 14, false));
                ((org.telegram.ui.ActionBar.f3) this.f870c).dismiss();
                return;
            case 3:
                e6 e6Var3 = ((v5) this.f869b).f1612l;
                tv alert = ((db) this.f870c).getAlert();
                if (alert != null && (x5Var = e6Var3.Q1) != null) {
                    ((ac) x5Var).h(alert);
                    e6Var3.f827t1.a();
                    return;
                }
                return;
            case 4:
                ci.w3 w3Var = (ci.w3) this.f869b;
                w3Var.e((MediaController.AlbumEntry) this.f870c, false);
                w3Var.F.n();
                return;
            case 5:
                ci.u8 u8Var = (ci.u8) this.f869b;
                ba baVar = (ba) this.f870c;
                org.telegram.ui.Cells.i3 i3Var = u8Var.Y;
                try {
                    charSequence = ((ClipboardManager) u8Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(u8Var.getContext());
                } catch (Exception e) {
                    FileLog.e(e);
                    charSequence = null;
                }
                if (charSequence != null) {
                    i3Var.f20177b.setText(charSequence.toString());
                    org.telegram.ui.Cells.g3 g3Var = i3Var.f20177b;
                    g3Var.setSelection(0, g3Var.getText().length());
                }
                baVar.run();
                return;
            case 6:
                ci.lc lcVar = (ci.lc) this.f869b;
                new ci.f9((Context) this.f870c, lcVar.f5033c, true, lcVar.f5101x0, new ci.ia(lcVar, 20), lcVar.f5026a).show();
                return;
            case 7:
                ei.l.x0((ei.l) this.f869b, (Context) this.f870c);
                return;
            case 8:
                ei.k3 k3Var = (ei.k3) this.f869b;
                ei.k0 k0Var = (ei.k0) this.f870c;
                if (k0Var.c()) {
                    k0Var.a();
                } else {
                    File file = k0Var.d;
                    if (file != null && file.exists()) {
                        File file2 = k0Var.d;
                        AndroidUtilities.openForView(file2, file2.getName(), null, LaunchActivity.G1, null, true);
                    }
                }
                o70 o70Var = k3Var.K0;
                if (o70Var != null) {
                    o70Var.u();
                    k3Var.K0 = null;
                    return;
                }
                return;
            case 9:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.f870c;
                ((org.telegram.ui.ActionBar.f3) this.f869b).dismiss();
                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(ProfileActivity.m4(connectedbotstarref.bot_id));
                    return;
                }
                return;
            case 10:
                AndroidUtilities.addToClipboard(((TL_account.TL_businessChatLink) this.f869b).link);
                xc.a0((xn) this.f870c).k(false).j();
                return;
            case 11:
                hg.m0.Q((hg.m0) this.f869b, (TL_account.TL_connectedBot) this.f870c);
                return;
            case 12:
                hi.c cVar = (hi.c) this.f869b;
                cVar.getClass();
                ((Runnable) this.f870c).run();
                cVar.dismiss();
                return;
            case 13:
                ii.e2.Y((ii.e2) this.f869b, (Context) this.f870c, view);
                return;
            case 14:
                ((VideoAds) this.f869b).lambda$show$2((VideoAds.CloseDrawable) this.f870c, view);
                return;
            case 15:
                ((VideoAds) this.f869b).lambda$show$18((TLRPC.TL_sponsoredMessage) this.f870c, view);
                return;
            case 16:
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) this.f869b;
                org.telegram.ui.ActionBar.u0 u0Var = (org.telegram.ui.ActionBar.u0) this.f870c;
                int indexOf = v0Var.f19569g0.indexOf(u0Var.getFilter());
                if (v0Var.f19570h0 != indexOf) {
                    v0Var.f19570h0 = indexOf;
                    v0Var.y();
                    return;
                } else if (u0Var.getFilter().h) {
                    if (!u0Var.f19519a.f13963f) {
                        u0Var.setSelectedForDelete(true);
                        return;
                    }
                    gg.q0 filter = u0Var.getFilter();
                    v0Var.C(filter);
                    org.telegram.ui.ActionBar.f5 f5Var = v0Var.H;
                    if (f5Var != null) {
                        f5Var.o(filter);
                        v0Var.H.q(v0Var.e);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 17:
                org.telegram.ui.ActionBar.t0 t0Var = (org.telegram.ui.ActionBar.t0) this.f869b;
                org.telegram.ui.ActionBar.v0 v0Var2 = (org.telegram.ui.ActionBar.v0) this.f870c;
                org.telegram.ui.ActionBar.n1 n1Var = v0Var2.d;
                if (n1Var != null && n1Var.isShowing() && t0Var.f19504f) {
                    if (!v0Var2.T) {
                        v0Var2.T = true;
                        v0Var2.d.d(v0Var2.R);
                    } else {
                        return;
                    }
                }
                org.telegram.ui.ActionBar.z zVar = v0Var2.f19563c;
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
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.f869b;
                if (!((org.telegram.ui.ActionBar.w1) this.f870c).f19252a) {
                    org.telegram.ui.ActionBar.a2 a2Var = b2Var.m0;
                    if (a2Var != null) {
                        a2Var.f(b2Var, -1);
                    }
                    if (b2Var.f18460h0) {
                        b2Var.dismiss();
                        return;
                    }
                    return;
                }
                return;
            case 19:
                org.telegram.ui.ActionBar.b2 b2Var2 = (org.telegram.ui.ActionBar.b2) this.f869b;
                if (!((org.telegram.ui.ActionBar.w1) this.f870c).f19252a) {
                    org.telegram.ui.ActionBar.a2 a2Var2 = b2Var2.f18467o0;
                    if (a2Var2 != null) {
                        a2Var2.f(b2Var2, -2);
                    }
                    if (b2Var2.f18460h0) {
                        b2Var2.cancel();
                        return;
                    }
                    return;
                }
                return;
            case 20:
                org.telegram.ui.ActionBar.b2 b2Var3 = (org.telegram.ui.ActionBar.b2) this.f869b;
                if (!((org.telegram.ui.ActionBar.w1) this.f870c).f19252a) {
                    org.telegram.ui.ActionBar.a2 a2Var3 = b2Var3.f18473s0;
                    if (a2Var3 != null) {
                        a2Var3.f(b2Var3, -2);
                    }
                    if (b2Var3.f18460h0) {
                        b2Var3.dismiss();
                        return;
                    }
                    return;
                }
                return;
            case 21:
                org.telegram.ui.ActionBar.b2 b2Var4 = (org.telegram.ui.ActionBar.b2) this.f869b;
                if (!((org.telegram.ui.ActionBar.w1) this.f870c).f19252a) {
                    ii.f4 f4Var = b2Var4.f18469q0;
                    if (f4Var != null) {
                        f4Var.f(b2Var4, -2);
                    }
                    if (b2Var4.f18460h0) {
                        b2Var4.cancel();
                        return;
                    }
                    return;
                }
                return;
            case 22:
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) this.f869b;
                Activity activity = (Activity) this.f870c;
                org.telegram.ui.v3 v3Var = i4Var.K;
                if (!i4Var.f34009h0.A0) {
                    org.telegram.ui.m3 m3Var = i4Var.f34021u0[0];
                    if (m3Var.f()) {
                        if (m3Var.getWebView() != null && !i4Var.f34009h0.W) {
                            if (i4Var.f34010i0 != null) {
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
                                String v = org.telegram.ui.web.b1.v(str2);
                                org.telegram.ui.web.k kVar = i4Var.f34010i0;
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
                                org.telegram.ui.y yVar = new org.telegram.ui.y(i4Var, v, 0);
                                org.telegram.ui.z zVar2 = new org.telegram.ui.z(i4Var, m3Var, activity, 0);
                                org.telegram.ui.r rVar = new org.telegram.ui.r(i4Var, 1);
                                org.telegram.ui.r rVar2 = new org.telegram.ui.r(i4Var, 2);
                                org.telegram.ui.a0 a0Var = new org.telegram.ui.a0(i4Var, v, m3Var, 0);
                                org.telegram.ui.web.c cVar2 = kVar.f38755w;
                                ImageView imageView = kVar.f38751f;
                                if (bitmap == null) {
                                    imageView.setImageResource(R.drawable.msg_language);
                                    str4 = str3;
                                    imageView.setColorFilter(new PorterDuffColorFilter(kVar.H, PorterDuff.Mode.SRC_IN));
                                } else {
                                    str4 = str3;
                                    imageView.setImageDrawable(new BitmapDrawable(kVar.getContext().getResources(), bitmap));
                                    imageView.setColorFilter((ColorFilter) null);
                                }
                                TextView textView = kVar.f38753r;
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
                                        TextView textView2 = kVar.f38754s;
                                        textView2.setText(Emoji.replaceEmoji(str6, textView2.getPaint().getFontMetricsInt(), false));
                                        kVar.L = zVar2;
                                        kVar.M = rVar;
                                        kVar.N = rVar2;
                                        kVar.e.setOnClickListener(new py0(12, kVar, yVar));
                                        kVar.f38752n.setOnClickListener(a0Var);
                                        kVar.f38749b = false;
                                        kVar.setInput(null);
                                        cVar2.Y2.N(true);
                                        cVar2.u0(0);
                                        org.telegram.ui.l0 l0Var = i4Var.f34009h0;
                                        g3 g3Var2 = new g3(28, m3Var, activity);
                                        fi.o oVar = l0Var.f38848b0;
                                        oVar.setText("");
                                        oVar.setSelection(0, oVar.getText().length());
                                        oVar.setScrollX(0);
                                        l0Var.f38872v0 = g3Var2;
                                        l0Var.k(true);
                                        return;
                                    }
                                }
                                try {
                                    str6 = URLDecoder.decode(str5.replaceAll("\\+", "%2b"), "UTF-8");
                                } catch (Exception e11) {
                                    e = e11;
                                    FileLog.e(e);
                                    str6 = str5;
                                    TextView textView22 = kVar.f38754s;
                                    textView22.setText(Emoji.replaceEmoji(str6, textView22.getPaint().getFontMetricsInt(), false));
                                    kVar.L = zVar2;
                                    kVar.M = rVar;
                                    kVar.N = rVar2;
                                    kVar.e.setOnClickListener(new py0(12, kVar, yVar));
                                    kVar.f38752n.setOnClickListener(a0Var);
                                    kVar.f38749b = false;
                                    kVar.setInput(null);
                                    cVar2.Y2.N(true);
                                    cVar2.u0(0);
                                    org.telegram.ui.l0 l0Var2 = i4Var.f34009h0;
                                    g3 g3Var22 = new g3(28, m3Var, activity);
                                    fi.o oVar2 = l0Var2.f38848b0;
                                    oVar2.setText("");
                                    oVar2.setSelection(0, oVar2.getText().length());
                                    oVar2.setScrollX(0);
                                    l0Var2.f38872v0 = g3Var22;
                                    l0Var2.k(true);
                                    return;
                                }
                                TextView textView222 = kVar.f38754s;
                                textView222.setText(Emoji.replaceEmoji(str6, textView222.getPaint().getFontMetricsInt(), false));
                                kVar.L = zVar2;
                                kVar.M = rVar;
                                kVar.N = rVar2;
                                kVar.e.setOnClickListener(new py0(12, kVar, yVar));
                                kVar.f38752n.setOnClickListener(a0Var);
                                kVar.f38749b = false;
                                kVar.setInput(null);
                                cVar2.Y2.N(true);
                                cVar2.u0(0);
                            }
                            org.telegram.ui.l0 l0Var22 = i4Var.f34009h0;
                            g3 g3Var222 = new g3(28, m3Var, activity);
                            fi.o oVar22 = l0Var22.f38848b0;
                            oVar22.setText("");
                            oVar22.setSelection(0, oVar22.getText().length());
                            oVar22.setScrollX(0);
                            l0Var22.f38872v0 = g3Var222;
                            l0Var22.k(true);
                            return;
                        }
                        return;
                    } else if (v3Var != null) {
                        yv0 yv0Var = new yv0(activity);
                        yv0Var.f42777a = 1;
                        yv0Var.f30463s = -AndroidUtilities.dp(32.0f);
                        m3Var.d.w0(yv0Var);
                        return;
                    } else {
                        m3Var.f35130b.x0(0);
                        return;
                    }
                }
                return;
            case 23:
                org.telegram.ui.d1 d1Var = (org.telegram.ui.d1) this.f869b;
                r70 r70Var = (r70) this.f870c;
                if (d1Var.f32469f == 0) {
                    d1Var.a(1, true);
                    int i11 = ((org.telegram.ui.i4) r70Var).X;
                    TLRPC.Chat chat = r70Var.f36713n;
                    TLRPC.TL_channels_joinChannel tL_channels_joinChannel = new TLRPC.TL_channels_joinChannel();
                    tL_channels_joinChannel.channel = MessagesController.getInputChannel(chat);
                    ConnectionsManager.getInstance(i11).sendRequestTyped(tL_channels_joinChannel, new ei.h1(d1Var, i11, tL_channels_joinChannel, chat));
                    return;
                }
                return;
            case 24:
                org.telegram.ui.d5 d5Var = (org.telegram.ui.d5) this.f869b;
                d5Var.b(false);
                d5Var.e.b((org.telegram.ui.e5) this.f870c);
                return;
            case 25:
                ((org.telegram.ui.x6) this.f869b).e.u0((org.telegram.ui.Cells.z1) this.f870c);
                return;
            case 26:
                org.telegram.ui.e7 e7Var = (org.telegram.ui.e7) this.f869b;
                org.telegram.ui.m7 m7Var = (org.telegram.ui.m7) this.f870c;
                org.telegram.ui.i7 i7Var = e7Var.d.v;
                if (i7Var != null) {
                    i7Var.H0(m7Var.f35165c, m7Var.d, true);
                }
                org.telegram.ui.ActionBar.n1 n1Var2 = e7Var.f32830a;
                if (n1Var2 != null) {
                    n1Var2.d(true);
                    return;
                }
                return;
            case 27:
                org.telegram.ui.k9 k9Var = (org.telegram.ui.k9) this.f869b;
                org.telegram.ui.g9 g9Var = (org.telegram.ui.g9) this.f870c;
                ArrayList arrayList = g9Var.f33489b;
                if (arrayList.size() == 1) {
                    TLRPC.User user = (TLRPC.User) arrayList.get(0);
                    TLRPC.UserFull userFull = k9Var.getMessagesController().getUserFull(user.f18230id);
                    k9Var.P = user;
                    boolean z11 = g9Var.e;
                    if (!z11 && (userFull == null || !userFull.video_calls_available)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    org.telegram.ui.Components.voip.f2.m(user, z11, z10, k9Var.getParentActivity(), null, k9Var.getAccountInstance());
                    return;
                }
                boolean z12 = g9Var.e;
                HashSet hashSet = new HashSet();
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList.get(i12);
                    i12++;
                    hashSet.add(Long.valueOf(((TLRPC.User) obj).f18230id));
                }
                TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) g9Var.f33490c.get(0)).f18104id;
                org.telegram.ui.ActionBar.b2 b2Var5 = new org.telegram.ui.ActionBar.b2(k9Var.getParentActivity(), 3, null);
                TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                getgroupcall.call = tL_inputGroupCallInviteMessage;
                getgroupcall.limit = k9Var.getMessagesController().conferenceCallSizeLimit;
                b2Var5.setOnCancelListener(new org.telegram.ui.p8(k9Var, k9Var.getConnectionsManager().sendRequest(getgroupcall, new org.telegram.ui.o8(k9Var, b2Var5, hashSet, tL_inputGroupCallInviteMessage, z12, 1)), 1));
                b2Var5.q(600L);
                return;
            case 28:
                je jeVar = (je) this.f869b;
                ra1 ra1Var = (ra1) this.f870c;
                ci.d dVar = jeVar.K0;
                if (view.isEnabled() && !dVar.N) {
                    ae aeVar = jeVar.Q0;
                    if (aeVar == null || !aeVar.N) {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        rd rdVar = new rd(jeVar, twoStepVerificationActivity, 0);
                        twoStepVerificationActivity.Z = 1;
                        twoStepVerificationActivity.f31562b0 = rdVar;
                        dVar.setLoading(true);
                        twoStepVerificationActivity.s0(new sd(jeVar, ra1Var, twoStepVerificationActivity, 0));
                        return;
                    }
                    return;
                }
                return;
            default:
                nf.f.s((Context) this.f870c, ((TL_stats.TL_broadcastRevenueTransactionWithdrawal) this.f869b).transaction_url);
                return;
        }
    }

    public f2(Context context, TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal) {
        this.f868a = 29;
        this.f870c = context;
        this.f869b = tL_broadcastRevenueTransactionWithdrawal;
    }
}
