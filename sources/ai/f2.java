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
import org.telegram.ui.Components.hx0;
import org.telegram.ui.Components.lw;
import org.telegram.ui.Components.s80;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.db1;
import org.telegram.ui.eo;
import org.telegram.ui.fe;
import org.telegram.ui.oe;
import org.telegram.ui.w70;
import org.telegram.ui.wd;
import org.telegram.ui.xd;
import org.telegram.ui.xy0;
public final class f2 implements View.OnClickListener {
    public final int f933a;
    public final Object f934b;
    public final Object f935c;

    public f2(int i10, Object obj, Object obj2) {
        this.f933a = i10;
        this.f934b = obj;
        this.f935c = obj2;
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
        switch (this.f933a) {
            case 0:
                d2 d2Var = (d2) this.f934b;
                Context context = (Context) this.f935c;
                if (d2Var != null) {
                    int i10 = d2Var.f807e;
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
                        TL_stories.StoryItem u10 = MessagesController.getInstance(i10).getStoriesController().u(d2Var.f806c, d2Var.f805b);
                        if (u10 == null) {
                            u10 = d2Var.f804a;
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
                f6 f6Var = (f6) this.f934b;
                ta taVar = (ta) this.f935c;
                kc kcVar = f6Var.J0;
                if (taVar.f1752b != null) {
                    Bundle bundle = new Bundle();
                    if (taVar.f1752b.longValue() >= 0) {
                        bundle.putLong("user_id", taVar.f1752b.longValue());
                    } else {
                        bundle.putLong("chat_id", -taVar.f1752b.longValue());
                    }
                    if (taVar.f1754e && (num = taVar.d) != null) {
                        bundle.putInt("message_id", num.intValue());
                        kcVar.H(new eo(bundle));
                        return;
                    }
                    kcVar.H(new ProfileActivity(bundle, null));
                    return;
                }
                org.telegram.ui.Components.sc Q = new zc(f6Var.f953c1, f6Var.B0).Q(R.raw.error, 36, LocaleController.getString(R.string.StoryHidAccount));
                Q.f30529a = 3;
                Q.k(true);
                return;
            case 2:
                f6 f6Var2 = (f6) this.f934b;
                ((bc) f6Var2.Q1).h(new rg.y0(f6Var2.J0.f1265f, 14, false));
                ((org.telegram.ui.ActionBar.e3) this.f935c).dismiss();
                return;
            case 3:
                f6 f6Var3 = ((w5) this.f934b).f1858l;
                lw alert = ((eb) this.f935c).getAlert();
                if (alert != null && (y5Var = f6Var3.Q1) != null) {
                    ((bc) y5Var).h(alert);
                    f6Var3.f1004t1.a();
                    return;
                }
                return;
            case 4:
                ci.v3 v3Var = (ci.v3) this.f934b;
                v3Var.e((MediaController.AlbumEntry) this.f935c, false);
                v3Var.F.n();
                return;
            case 5:
                ci.u8 u8Var = (ci.u8) this.f934b;
                ca caVar = (ca) this.f935c;
                org.telegram.ui.Cells.j3 j3Var = u8Var.Y;
                try {
                    charSequence = ((ClipboardManager) u8Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(u8Var.getContext());
                } catch (Exception e7) {
                    FileLog.e(e7);
                    charSequence = null;
                }
                if (charSequence != null) {
                    j3Var.f22081b.setText(charSequence.toString());
                    org.telegram.ui.Cells.h3 h3Var = j3Var.f22081b;
                    h3Var.setSelection(0, h3Var.getText().length());
                }
                caVar.run();
                return;
            case 6:
                ci.lc lcVar = (ci.lc) this.f934b;
                new ci.f9((Context) this.f935c, lcVar.f5463c, true, lcVar.f5532x0, new ci.ia(lcVar, 20), lcVar.f5456a).show();
                return;
            case 7:
                ei.l.y0((ei.l) this.f934b, (Context) this.f935c);
                return;
            case 8:
                ei.k3 k3Var = (ei.k3) this.f934b;
                ei.k0 k0Var = (ei.k0) this.f935c;
                if (k0Var.c()) {
                    k0Var.a();
                } else {
                    File file = k0Var.d;
                    if (file != null && file.exists()) {
                        File file2 = k0Var.d;
                        AndroidUtilities.openForView(file2, file2.getName(), null, LaunchActivity.G1, null, true);
                    }
                }
                s80 s80Var = k3Var.K0;
                if (s80Var != null) {
                    s80Var.u();
                    k3Var.K0 = null;
                    return;
                }
                return;
            case 9:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.f935c;
                ((org.telegram.ui.ActionBar.e3) this.f934b).dismiss();
                org.telegram.ui.ActionBar.m2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(ProfileActivity.m4(connectedbotstarref.bot_id));
                    return;
                }
                return;
            case 10:
                AndroidUtilities.addToClipboard(((TL_account.TL_businessChatLink) this.f934b).link);
                zc.a0((eo) this.f935c).k(false).j();
                return;
            case 11:
                hg.l0.R((hg.l0) this.f934b, (TL_account.TL_connectedBot) this.f935c);
                return;
            case 12:
                hi.c cVar = (hi.c) this.f934b;
                cVar.getClass();
                ((Runnable) this.f935c).run();
                cVar.dismiss();
                return;
            case 13:
                ii.e2.Y((ii.e2) this.f934b, (Context) this.f935c, view);
                return;
            case 14:
                ((VideoAds) this.f934b).lambda$show$2((VideoAds.CloseDrawable) this.f935c, view);
                return;
            case 15:
                ((VideoAds) this.f934b).lambda$show$18((TLRPC.TL_sponsoredMessage) this.f935c, view);
                return;
            case 16:
                org.telegram.ui.ActionBar.u0 u0Var = (org.telegram.ui.ActionBar.u0) this.f934b;
                org.telegram.ui.ActionBar.t0 t0Var = (org.telegram.ui.ActionBar.t0) this.f935c;
                int indexOf = u0Var.f21319g0.indexOf(t0Var.getFilter());
                if (u0Var.f21320h0 != indexOf) {
                    u0Var.f21320h0 = indexOf;
                    u0Var.y();
                    return;
                } else if (t0Var.getFilter().h) {
                    if (!t0Var.f21264a.f16089f) {
                        t0Var.setSelectedForDelete(true);
                        return;
                    }
                    gg.p0 filter = t0Var.getFilter();
                    u0Var.C(filter);
                    org.telegram.ui.ActionBar.e5 e5Var = u0Var.H;
                    if (e5Var != null) {
                        e5Var.o(filter);
                        u0Var.H.q(u0Var.f21315e);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 17:
                org.telegram.ui.ActionBar.s0 s0Var = (org.telegram.ui.ActionBar.s0) this.f934b;
                org.telegram.ui.ActionBar.u0 u0Var2 = (org.telegram.ui.ActionBar.u0) this.f935c;
                org.telegram.ui.ActionBar.m1 m1Var = u0Var2.d;
                if (m1Var != null && m1Var.isShowing() && s0Var.f21247f) {
                    if (!u0Var2.T) {
                        u0Var2.T = true;
                        u0Var2.d.d(u0Var2.R);
                    } else {
                        return;
                    }
                }
                org.telegram.ui.ActionBar.y yVar = u0Var2.f21312c;
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
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) this.f934b;
                if (!((org.telegram.ui.ActionBar.v1) this.f935c).f20985a) {
                    org.telegram.ui.ActionBar.z1 z1Var = a2Var.m0;
                    if (z1Var != null) {
                        z1Var.f(a2Var, -1);
                    }
                    if (a2Var.f20165h0) {
                        a2Var.dismiss();
                        return;
                    }
                    return;
                }
                return;
            case 19:
                org.telegram.ui.ActionBar.a2 a2Var2 = (org.telegram.ui.ActionBar.a2) this.f934b;
                if (!((org.telegram.ui.ActionBar.v1) this.f935c).f20985a) {
                    org.telegram.ui.ActionBar.z1 z1Var2 = a2Var2.f20172o0;
                    if (z1Var2 != null) {
                        z1Var2.f(a2Var2, -2);
                    }
                    if (a2Var2.f20165h0) {
                        a2Var2.cancel();
                        return;
                    }
                    return;
                }
                return;
            case 20:
                org.telegram.ui.ActionBar.a2 a2Var3 = (org.telegram.ui.ActionBar.a2) this.f934b;
                if (!((org.telegram.ui.ActionBar.v1) this.f935c).f20985a) {
                    org.telegram.ui.ActionBar.z1 z1Var3 = a2Var3.f20178s0;
                    if (z1Var3 != null) {
                        z1Var3.f(a2Var3, -2);
                    }
                    if (a2Var3.f20165h0) {
                        a2Var3.dismiss();
                        return;
                    }
                    return;
                }
                return;
            case 21:
                org.telegram.ui.ActionBar.a2 a2Var4 = (org.telegram.ui.ActionBar.a2) this.f934b;
                if (!((org.telegram.ui.ActionBar.v1) this.f935c).f20985a) {
                    ii.f4 f4Var = a2Var4.f20174q0;
                    if (f4Var != null) {
                        f4Var.f(a2Var4, -2);
                    }
                    if (a2Var4.f20165h0) {
                        a2Var4.cancel();
                        return;
                    }
                    return;
                }
                return;
            case 22:
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) this.f934b;
                Activity activity = (Activity) this.f935c;
                org.telegram.ui.v3 v3Var2 = i4Var.K;
                if (!i4Var.f38652h0.A0) {
                    org.telegram.ui.m3 m3Var = i4Var.f38664u0[0];
                    if (m3Var.f()) {
                        if (m3Var.getWebView() != null && !i4Var.f38652h0.W) {
                            if (i4Var.f38653i0 != null) {
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
                                org.telegram.ui.web.k kVar = i4Var.f38653i0;
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
                                org.telegram.ui.y yVar2 = new org.telegram.ui.y(i4Var, u11, 0);
                                org.telegram.ui.z zVar = new org.telegram.ui.z(i4Var, m3Var, activity, 0);
                                org.telegram.ui.s sVar = new org.telegram.ui.s(i4Var, 1);
                                org.telegram.ui.s sVar2 = new org.telegram.ui.s(i4Var, 2);
                                org.telegram.ui.a0 a0Var = new org.telegram.ui.a0(i4Var, u11, m3Var, 0);
                                org.telegram.ui.web.c cVar2 = kVar.f43317w;
                                ImageView imageView = kVar.f43313f;
                                if (bitmap == null) {
                                    imageView.setImageResource(R.drawable.msg_language);
                                    str4 = str3;
                                    imageView.setColorFilter(new PorterDuffColorFilter(kVar.H, PorterDuff.Mode.SRC_IN));
                                } else {
                                    str4 = str3;
                                    imageView.setImageDrawable(new BitmapDrawable(kVar.getContext().getResources(), bitmap));
                                    imageView.setColorFilter((ColorFilter) null);
                                }
                                TextView textView = kVar.f43315r;
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
                                        TextView textView2 = kVar.f43316s;
                                        textView2.setText(Emoji.replaceEmoji(str6, textView2.getPaint().getFontMetricsInt(), false));
                                        kVar.L = zVar;
                                        kVar.M = sVar;
                                        kVar.N = sVar2;
                                        kVar.f43312e.setOnClickListener(new xy0(18, kVar, yVar2));
                                        kVar.f43314n.setOnClickListener(a0Var);
                                        kVar.f43310b = false;
                                        kVar.setInput(null);
                                        cVar2.W2.N(true);
                                        cVar2.u0(0);
                                        org.telegram.ui.l0 l0Var = i4Var.f38652h0;
                                        h3 h3Var2 = new h3(28, m3Var, activity);
                                        fi.o oVar = l0Var.f43422b0;
                                        oVar.setText("");
                                        oVar.setSelection(0, oVar.getText().length());
                                        oVar.setScrollX(0);
                                        l0Var.f43447v0 = h3Var2;
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
                                    TextView textView22 = kVar.f43316s;
                                    textView22.setText(Emoji.replaceEmoji(str6, textView22.getPaint().getFontMetricsInt(), false));
                                    kVar.L = zVar;
                                    kVar.M = sVar;
                                    kVar.N = sVar2;
                                    kVar.f43312e.setOnClickListener(new xy0(18, kVar, yVar2));
                                    kVar.f43314n.setOnClickListener(a0Var);
                                    kVar.f43310b = false;
                                    kVar.setInput(null);
                                    cVar2.W2.N(true);
                                    cVar2.u0(0);
                                    org.telegram.ui.l0 l0Var2 = i4Var.f38652h0;
                                    h3 h3Var22 = new h3(28, m3Var, activity);
                                    fi.o oVar2 = l0Var2.f43422b0;
                                    oVar2.setText("");
                                    oVar2.setSelection(0, oVar2.getText().length());
                                    oVar2.setScrollX(0);
                                    l0Var2.f43447v0 = h3Var22;
                                    l0Var2.k(true);
                                    return;
                                }
                                TextView textView222 = kVar.f43316s;
                                textView222.setText(Emoji.replaceEmoji(str6, textView222.getPaint().getFontMetricsInt(), false));
                                kVar.L = zVar;
                                kVar.M = sVar;
                                kVar.N = sVar2;
                                kVar.f43312e.setOnClickListener(new xy0(18, kVar, yVar2));
                                kVar.f43314n.setOnClickListener(a0Var);
                                kVar.f43310b = false;
                                kVar.setInput(null);
                                cVar2.W2.N(true);
                                cVar2.u0(0);
                            }
                            org.telegram.ui.l0 l0Var22 = i4Var.f38652h0;
                            h3 h3Var222 = new h3(28, m3Var, activity);
                            fi.o oVar22 = l0Var22.f43422b0;
                            oVar22.setText("");
                            oVar22.setSelection(0, oVar22.getText().length());
                            oVar22.setScrollX(0);
                            l0Var22.f43447v0 = h3Var222;
                            l0Var22.k(true);
                            return;
                        }
                        return;
                    } else if (v3Var2 != null) {
                        hx0 hx0Var = new hx0(activity);
                        hx0Var.f48066a = 1;
                        hx0Var.f26970s = -AndroidUtilities.dp(32.0f);
                        m3Var.d.w0(hx0Var);
                        return;
                    } else {
                        m3Var.f39895b.x0(0);
                        return;
                    }
                }
                return;
            case 23:
                org.telegram.ui.d1 d1Var = (org.telegram.ui.d1) this.f934b;
                w70 w70Var = (w70) this.f935c;
                if (d1Var.f36598f == 0) {
                    d1Var.a(1, true);
                    int i11 = ((org.telegram.ui.i4) w70Var).X;
                    TLRPC.Chat chat = w70Var.f43073n;
                    TLRPC.TL_channels_joinChannel tL_channels_joinChannel = new TLRPC.TL_channels_joinChannel();
                    tL_channels_joinChannel.channel = MessagesController.getInputChannel(chat);
                    ConnectionsManager.getInstance(i11).sendRequestTyped(tL_channels_joinChannel, new ei.h1(d1Var, i11, tL_channels_joinChannel, chat));
                    return;
                }
                return;
            case 24:
                org.telegram.ui.f5 f5Var = (org.telegram.ui.f5) this.f934b;
                f5Var.b(false);
                f5Var.f37631e.b((org.telegram.ui.g5) this.f935c);
                return;
            case 25:
                ((org.telegram.ui.z6) this.f934b).f44626e.u0((org.telegram.ui.Cells.a2) this.f935c);
                return;
            case 26:
                org.telegram.ui.g7 g7Var = (org.telegram.ui.g7) this.f934b;
                org.telegram.ui.o7 o7Var = (org.telegram.ui.o7) this.f935c;
                org.telegram.ui.k7 k7Var = g7Var.d.v;
                if (k7Var != null) {
                    k7Var.y0(o7Var.f40569c, o7Var.d, true);
                }
                org.telegram.ui.ActionBar.m1 m1Var2 = g7Var.f37959a;
                if (m1Var2 != null) {
                    m1Var2.d(true);
                    return;
                }
                return;
            case 27:
                org.telegram.ui.m9 m9Var = (org.telegram.ui.m9) this.f934b;
                org.telegram.ui.i9 i9Var = (org.telegram.ui.i9) this.f935c;
                ArrayList arrayList = i9Var.f38808b;
                if (arrayList.size() == 1) {
                    TLRPC.User user = (TLRPC.User) arrayList.get(0);
                    TLRPC.UserFull userFull = m9Var.getMessagesController().getUserFull(user.f19950id);
                    m9Var.P = user;
                    boolean z11 = i9Var.f38810e;
                    if (!z11 && (userFull == null || !userFull.video_calls_available)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    org.telegram.ui.Components.voip.g2.m(user, z11, z10, m9Var.getParentActivity(), null, m9Var.getAccountInstance());
                    return;
                }
                boolean z12 = i9Var.f38810e;
                HashSet hashSet = new HashSet();
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList.get(i12);
                    i12++;
                    hashSet.add(Long.valueOf(((TLRPC.User) obj).f19950id));
                }
                TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) i9Var.f38809c.get(0)).f19824id;
                org.telegram.ui.ActionBar.a2 a2Var5 = new org.telegram.ui.ActionBar.a2(m9Var.getParentActivity(), 3, null);
                TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                getgroupcall.call = tL_inputGroupCallInviteMessage;
                getgroupcall.limit = m9Var.getMessagesController().conferenceCallSizeLimit;
                a2Var5.setOnCancelListener(new org.telegram.ui.r8(m9Var, m9Var.getConnectionsManager().sendRequest(getgroupcall, new org.telegram.ui.q8(m9Var, a2Var5, hashSet, tL_inputGroupCallInviteMessage, z12, 1)), 1));
                a2Var5.q(600L);
                return;
            case 28:
                oe oeVar = (oe) this.f934b;
                db1 db1Var = (db1) this.f935c;
                ci.d dVar = oeVar.K0;
                if (view.isEnabled() && !dVar.N) {
                    fe feVar = oeVar.Q0;
                    if (feVar == null || !feVar.N) {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        wd wdVar = new wd(oeVar, twoStepVerificationActivity, 0);
                        twoStepVerificationActivity.Z = 1;
                        twoStepVerificationActivity.f34412b0 = wdVar;
                        dVar.setLoading(true);
                        twoStepVerificationActivity.s0(new xd(oeVar, db1Var, twoStepVerificationActivity, 0));
                        return;
                    }
                    return;
                }
                return;
            default:
                of.f.s((Context) this.f935c, ((TL_stats.TL_broadcastRevenueTransactionWithdrawal) this.f934b).transaction_url);
                return;
        }
    }

    public f2(Context context, TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal) {
        this.f933a = 29;
        this.f935c = context;
        this.f934b = tL_broadcastRevenueTransactionWithdrawal;
    }
}
