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
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.lw0;
import org.telegram.ui.Components.uv;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ce;
import org.telegram.ui.me;
import org.telegram.ui.py0;
import org.telegram.ui.ra1;
import org.telegram.ui.s70;
import org.telegram.ui.ud;
import org.telegram.ui.vd;
import org.telegram.ui.xn;
public final class f2 implements View.OnClickListener {
    public final int f871a;
    public final Object f872b;
    public final Object f873c;

    public f2(int i10, Object obj, Object obj2) {
        this.f871a = i10;
        this.f872b = obj;
        this.f873c = obj2;
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
        switch (this.f871a) {
            case 0:
                d2 d2Var = (d2) this.f872b;
                Context context = (Context) this.f873c;
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
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                    if (U != null) {
                        TL_stories.StoryItem u10 = MessagesController.getInstance(i10).getStoriesController().u(d2Var.f699c, d2Var.f698b);
                        if (u10 == null) {
                            u10 = d2Var.f697a;
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
                e6 e6Var = (e6) this.f872b;
                sa saVar = (sa) this.f873c;
                jc jcVar = e6Var.J0;
                if (saVar.f1515b != null) {
                    Bundle bundle = new Bundle();
                    if (saVar.f1515b.longValue() >= 0) {
                        bundle.putLong("user_id", saVar.f1515b.longValue());
                    } else {
                        bundle.putLong("chat_id", -saVar.f1515b.longValue());
                    }
                    if (saVar.e && (num = saVar.d) != null) {
                        bundle.putInt("message_id", num.intValue());
                        jcVar.H(new xn(bundle));
                        return;
                    }
                    jcVar.H(new ProfileActivity(bundle, null));
                    return;
                }
                org.telegram.ui.Components.qc Q = new xc(e6Var.f779c1, e6Var.B0).Q(R.raw.error, 36, LocaleController.getString(R.string.StoryHidAccount));
                Q.f27685a = 3;
                Q.k(true);
                return;
            case 2:
                e6 e6Var2 = (e6) this.f872b;
                ((ac) e6Var2.Q1).h(new rg.x0(e6Var2.J0.f1073f, 14, false));
                ((org.telegram.ui.ActionBar.g3) this.f873c).dismiss();
                return;
            case 3:
                e6 e6Var3 = ((v5) this.f872b).f1614l;
                uv alert = ((db) this.f873c).getAlert();
                if (alert != null && (x5Var = e6Var3.Q1) != null) {
                    ((ac) x5Var).h(alert);
                    e6Var3.f830t1.a();
                    return;
                }
                return;
            case 4:
                ci.w3 w3Var = (ci.w3) this.f872b;
                w3Var.e((MediaController.AlbumEntry) this.f873c, false);
                w3Var.F.n();
                return;
            case 5:
                ci.t8 t8Var = (ci.t8) this.f872b;
                ba baVar = (ba) this.f873c;
                org.telegram.ui.Cells.j3 j3Var = t8Var.Y;
                try {
                    charSequence = ((ClipboardManager) t8Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(t8Var.getContext());
                } catch (Exception e) {
                    FileLog.e(e);
                    charSequence = null;
                }
                if (charSequence != null) {
                    j3Var.f20493b.setText(charSequence.toString());
                    org.telegram.ui.Cells.h3 h3Var = j3Var.f20493b;
                    h3Var.setSelection(0, h3Var.getText().length());
                }
                baVar.run();
                return;
            case 6:
                ci.kc kcVar = (ci.kc) this.f872b;
                new ci.e9((Context) this.f873c, kcVar.f4989c, true, kcVar.f5057x0, new ci.ha(kcVar, 20), kcVar.f4982a).show();
                return;
            case 7:
                ei.l.x0((ei.l) this.f872b, (Context) this.f873c);
                return;
            case 8:
                ei.k3 k3Var = (ei.k3) this.f872b;
                ei.k0 k0Var = (ei.k0) this.f873c;
                if (k0Var.c()) {
                    k0Var.a();
                } else {
                    File file = k0Var.d;
                    if (file != null && file.exists()) {
                        File file2 = k0Var.d;
                        AndroidUtilities.openForView(file2, file2.getName(), null, LaunchActivity.G1, null, true);
                    }
                }
                a80 a80Var = k3Var.K0;
                if (a80Var != null) {
                    a80Var.u();
                    k3Var.K0 = null;
                    return;
                }
                return;
            case 9:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.f873c;
                ((org.telegram.ui.ActionBar.g3) this.f872b).dismiss();
                org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(ProfileActivity.m4(connectedbotstarref.bot_id));
                    return;
                }
                return;
            case 10:
                AndroidUtilities.addToClipboard(((TL_account.TL_businessChatLink) this.f872b).link);
                xc.a0((xn) this.f873c).k(false).j();
                return;
            case 11:
                hg.l0.Q((hg.l0) this.f872b, (TL_account.TL_connectedBot) this.f873c);
                return;
            case 12:
                hi.c cVar = (hi.c) this.f872b;
                cVar.getClass();
                ((Runnable) this.f873c).run();
                cVar.dismiss();
                return;
            case 13:
                ii.e2.Y((ii.e2) this.f872b, (Context) this.f873c, view);
                return;
            case 14:
                ((VideoAds) this.f872b).lambda$show$2((VideoAds.CloseDrawable) this.f873c, view);
                return;
            case 15:
                ((VideoAds) this.f872b).lambda$show$18((TLRPC.TL_sponsoredMessage) this.f873c, view);
                return;
            case 16:
                org.telegram.ui.ActionBar.w0 w0Var = (org.telegram.ui.ActionBar.w0) this.f872b;
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) this.f873c;
                int indexOf = w0Var.f19846g0.indexOf(v0Var.getFilter());
                if (w0Var.f19847h0 != indexOf) {
                    w0Var.f19847h0 = indexOf;
                    w0Var.y();
                    return;
                } else if (v0Var.getFilter().h) {
                    if (!v0Var.f19796a.f14203f) {
                        v0Var.setSelectedForDelete(true);
                        return;
                    }
                    gg.q0 filter = v0Var.getFilter();
                    w0Var.C(filter);
                    org.telegram.ui.ActionBar.g5 g5Var = w0Var.H;
                    if (g5Var != null) {
                        g5Var.o(filter);
                        w0Var.H.q(w0Var.e);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 17:
                org.telegram.ui.ActionBar.u0 u0Var = (org.telegram.ui.ActionBar.u0) this.f872b;
                org.telegram.ui.ActionBar.w0 w0Var2 = (org.telegram.ui.ActionBar.w0) this.f873c;
                org.telegram.ui.ActionBar.o1 o1Var = w0Var2.d;
                if (o1Var != null && o1Var.isShowing() && u0Var.f19781f) {
                    if (!w0Var2.T) {
                        w0Var2.T = true;
                        w0Var2.d.d(w0Var2.R);
                    } else {
                        return;
                    }
                }
                org.telegram.ui.ActionBar.a0 a0Var = w0Var2.f19840c;
                if (a0Var != null) {
                    a0Var.o(((Integer) view.getTag()).intValue());
                    return;
                }
                org.telegram.ui.ActionBar.s0 s0Var = w0Var2.P;
                if (s0Var != null) {
                    s0Var.m(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
            case 18:
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.f872b;
                if (!((org.telegram.ui.ActionBar.x1) this.f873c).f19526a) {
                    org.telegram.ui.ActionBar.b2 b2Var = c2Var.m0;
                    if (b2Var != null) {
                        b2Var.f(c2Var, -1);
                    }
                    if (c2Var.f18730h0) {
                        c2Var.dismiss();
                        return;
                    }
                    return;
                }
                return;
            case 19:
                org.telegram.ui.ActionBar.c2 c2Var2 = (org.telegram.ui.ActionBar.c2) this.f872b;
                if (!((org.telegram.ui.ActionBar.x1) this.f873c).f19526a) {
                    org.telegram.ui.ActionBar.b2 b2Var2 = c2Var2.f18737o0;
                    if (b2Var2 != null) {
                        b2Var2.f(c2Var2, -2);
                    }
                    if (c2Var2.f18730h0) {
                        c2Var2.cancel();
                        return;
                    }
                    return;
                }
                return;
            case 20:
                org.telegram.ui.ActionBar.c2 c2Var3 = (org.telegram.ui.ActionBar.c2) this.f872b;
                if (!((org.telegram.ui.ActionBar.x1) this.f873c).f19526a) {
                    org.telegram.ui.ActionBar.b2 b2Var3 = c2Var3.f18743s0;
                    if (b2Var3 != null) {
                        b2Var3.f(c2Var3, -2);
                    }
                    if (c2Var3.f18730h0) {
                        c2Var3.dismiss();
                        return;
                    }
                    return;
                }
                return;
            case 21:
                org.telegram.ui.ActionBar.c2 c2Var4 = (org.telegram.ui.ActionBar.c2) this.f872b;
                if (!((org.telegram.ui.ActionBar.x1) this.f873c).f19526a) {
                    ii.f4 f4Var = c2Var4.f18739q0;
                    if (f4Var != null) {
                        f4Var.f(c2Var4, -2);
                    }
                    if (c2Var4.f18730h0) {
                        c2Var4.cancel();
                        return;
                    }
                    return;
                }
                return;
            case 22:
                org.telegram.ui.j4 j4Var = (org.telegram.ui.j4) this.f872b;
                Activity activity = (Activity) this.f873c;
                org.telegram.ui.w3 w3Var2 = j4Var.K;
                if (!j4Var.f34615h0.A0) {
                    org.telegram.ui.n3 n3Var = j4Var.f34627u0[0];
                    if (n3Var.f()) {
                        if (n3Var.getWebView() != null && !j4Var.f34615h0.W) {
                            if (j4Var.f34616i0 != null) {
                                org.telegram.ui.web.z0 webView = n3Var.getWebView();
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
                                String v = org.telegram.ui.web.c1.v(str2);
                                org.telegram.ui.web.k kVar = j4Var.f34616i0;
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
                                org.telegram.ui.z zVar = new org.telegram.ui.z(j4Var, v, 0);
                                org.telegram.ui.a0 a0Var2 = new org.telegram.ui.a0(j4Var, n3Var, activity, 0);
                                org.telegram.ui.t tVar = new org.telegram.ui.t(j4Var, 1);
                                org.telegram.ui.t tVar2 = new org.telegram.ui.t(j4Var, 2);
                                org.telegram.ui.b0 b0Var = new org.telegram.ui.b0(j4Var, v, n3Var, 0);
                                org.telegram.ui.web.c cVar2 = kVar.f39077w;
                                ImageView imageView = kVar.f39073f;
                                if (bitmap == null) {
                                    imageView.setImageResource(R.drawable.msg_language);
                                    str4 = str3;
                                    imageView.setColorFilter(new PorterDuffColorFilter(kVar.H, PorterDuff.Mode.SRC_IN));
                                } else {
                                    str4 = str3;
                                    imageView.setImageDrawable(new BitmapDrawable(kVar.getContext().getResources(), bitmap));
                                    imageView.setColorFilter((ColorFilter) null);
                                }
                                TextView textView = kVar.f39075r;
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
                                        TextView textView2 = kVar.f39076s;
                                        textView2.setText(Emoji.replaceEmoji(str6, textView2.getPaint().getFontMetricsInt(), false));
                                        kVar.L = a0Var2;
                                        kVar.M = tVar;
                                        kVar.N = tVar2;
                                        kVar.e.setOnClickListener(new py0(12, kVar, zVar));
                                        kVar.f39074n.setOnClickListener(b0Var);
                                        kVar.f39071b = false;
                                        kVar.setInput(null);
                                        cVar2.Y2.N(true);
                                        cVar2.v0(0);
                                        org.telegram.ui.m0 m0Var = j4Var.f34615h0;
                                        g3 g3Var = new g3(28, n3Var, activity);
                                        fi.o oVar = m0Var.f39184b0;
                                        oVar.setText("");
                                        oVar.setSelection(0, oVar.getText().length());
                                        oVar.setScrollX(0);
                                        m0Var.f39208v0 = g3Var;
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
                                    TextView textView22 = kVar.f39076s;
                                    textView22.setText(Emoji.replaceEmoji(str6, textView22.getPaint().getFontMetricsInt(), false));
                                    kVar.L = a0Var2;
                                    kVar.M = tVar;
                                    kVar.N = tVar2;
                                    kVar.e.setOnClickListener(new py0(12, kVar, zVar));
                                    kVar.f39074n.setOnClickListener(b0Var);
                                    kVar.f39071b = false;
                                    kVar.setInput(null);
                                    cVar2.Y2.N(true);
                                    cVar2.v0(0);
                                    org.telegram.ui.m0 m0Var2 = j4Var.f34615h0;
                                    g3 g3Var2 = new g3(28, n3Var, activity);
                                    fi.o oVar2 = m0Var2.f39184b0;
                                    oVar2.setText("");
                                    oVar2.setSelection(0, oVar2.getText().length());
                                    oVar2.setScrollX(0);
                                    m0Var2.f39208v0 = g3Var2;
                                    m0Var2.k(true);
                                    return;
                                }
                                TextView textView222 = kVar.f39076s;
                                textView222.setText(Emoji.replaceEmoji(str6, textView222.getPaint().getFontMetricsInt(), false));
                                kVar.L = a0Var2;
                                kVar.M = tVar;
                                kVar.N = tVar2;
                                kVar.e.setOnClickListener(new py0(12, kVar, zVar));
                                kVar.f39074n.setOnClickListener(b0Var);
                                kVar.f39071b = false;
                                kVar.setInput(null);
                                cVar2.Y2.N(true);
                                cVar2.v0(0);
                            }
                            org.telegram.ui.m0 m0Var22 = j4Var.f34615h0;
                            g3 g3Var22 = new g3(28, n3Var, activity);
                            fi.o oVar22 = m0Var22.f39184b0;
                            oVar22.setText("");
                            oVar22.setSelection(0, oVar22.getText().length());
                            oVar22.setScrollX(0);
                            m0Var22.f39208v0 = g3Var22;
                            m0Var22.k(true);
                            return;
                        }
                        return;
                    } else if (w3Var2 != null) {
                        lw0 lw0Var = new lw0(activity);
                        lw0Var.f43155a = 1;
                        lw0Var.f26229s = -AndroidUtilities.dp(32.0f);
                        n3Var.d.w0(lw0Var);
                        return;
                    } else {
                        n3Var.f35795b.y0(0);
                        return;
                    }
                }
                return;
            case 23:
                org.telegram.ui.e1 e1Var = (org.telegram.ui.e1) this.f872b;
                s70 s70Var = (s70) this.f873c;
                if (e1Var.f33081f == 0) {
                    e1Var.a(1, true);
                    int i11 = ((org.telegram.ui.j4) s70Var).X;
                    TLRPC.Chat chat = s70Var.f37323n;
                    TLRPC.TL_channels_joinChannel tL_channels_joinChannel = new TLRPC.TL_channels_joinChannel();
                    tL_channels_joinChannel.channel = MessagesController.getInputChannel(chat);
                    ConnectionsManager.getInstance(i11).sendRequestTyped(tL_channels_joinChannel, new ei.h1(e1Var, i11, tL_channels_joinChannel, chat));
                    return;
                }
                return;
            case 24:
                org.telegram.ui.e5 e5Var = (org.telegram.ui.e5) this.f872b;
                e5Var.b(false);
                e5Var.e.b((org.telegram.ui.f5) this.f873c);
                return;
            case 25:
                ((org.telegram.ui.z6) this.f872b).e.v0((org.telegram.ui.Cells.a2) this.f873c);
                return;
            case 26:
                org.telegram.ui.g7 g7Var = (org.telegram.ui.g7) this.f872b;
                org.telegram.ui.p7 p7Var = (org.telegram.ui.p7) this.f873c;
                org.telegram.ui.l7 l7Var = g7Var.e.E;
                if (l7Var != null) {
                    l7Var.H0(p7Var.f36340c, p7Var.d, true);
                }
                org.telegram.ui.ActionBar.o1 o1Var2 = g7Var.f33834a;
                if (o1Var2 != null) {
                    o1Var2.d(true);
                    return;
                }
                return;
            case 27:
                org.telegram.ui.n9 n9Var = (org.telegram.ui.n9) this.f872b;
                org.telegram.ui.j9 j9Var = (org.telegram.ui.j9) this.f873c;
                ArrayList arrayList = j9Var.f34670b;
                if (arrayList.size() == 1) {
                    TLRPC.User user = (TLRPC.User) arrayList.get(0);
                    TLRPC.UserFull userFull = n9Var.getMessagesController().getUserFull(user.f18476id);
                    n9Var.O = user;
                    boolean z11 = j9Var.e;
                    if (!z11 && (userFull == null || !userFull.video_calls_available)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    org.telegram.ui.Components.voip.g2.m(user, z11, z10, n9Var.getParentActivity(), null, n9Var.getAccountInstance());
                    return;
                }
                boolean z12 = j9Var.e;
                HashSet hashSet = new HashSet();
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList.get(i12);
                    i12++;
                    hashSet.add(Long.valueOf(((TLRPC.User) obj).f18476id));
                }
                TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) j9Var.f34671c.get(0)).f18350id;
                org.telegram.ui.ActionBar.c2 c2Var5 = new org.telegram.ui.ActionBar.c2(n9Var.getParentActivity(), 3, null);
                TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                getgroupcall.call = tL_inputGroupCallInviteMessage;
                getgroupcall.limit = n9Var.getMessagesController().conferenceCallSizeLimit;
                c2Var5.setOnCancelListener(new org.telegram.ui.s8(n9Var, n9Var.getConnectionsManager().sendRequest(getgroupcall, new org.telegram.ui.r8(n9Var, c2Var5, hashSet, tL_inputGroupCallInviteMessage, z12, 1)), 1));
                c2Var5.q(600L);
                return;
            case 28:
                me meVar = (me) this.f872b;
                ra1 ra1Var = (ra1) this.f873c;
                ci.d dVar = meVar.K0;
                if (view.isEnabled() && !dVar.N) {
                    ce ceVar = meVar.Q0;
                    if (ceVar == null || !ceVar.N) {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        ud udVar = new ud(meVar, twoStepVerificationActivity, 0);
                        twoStepVerificationActivity.Z = 1;
                        twoStepVerificationActivity.f31879b0 = udVar;
                        dVar.setLoading(true);
                        twoStepVerificationActivity.s0(new vd(meVar, ra1Var, twoStepVerificationActivity, 0));
                        return;
                    }
                    return;
                }
                return;
            default:
                nf.f.s((Context) this.f873c, ((TL_stats.TL_broadcastRevenueTransactionWithdrawal) this.f872b).transaction_url);
                return;
        }
    }

    public f2(Context context, TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal) {
        this.f871a = 29;
        this.f873c = context;
        this.f872b = tL_broadcastRevenueTransactionWithdrawal;
    }
}
