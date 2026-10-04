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
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.uw0;
import org.telegram.ui.Components.wv;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ce;
import org.telegram.ui.me;
import org.telegram.ui.py0;
import org.telegram.ui.t70;
import org.telegram.ui.ud;
import org.telegram.ui.va1;
import org.telegram.ui.vd;
import org.telegram.ui.yn;
public final class f2 implements View.OnClickListener {
    public final int f937a;
    public final Object f938b;
    public final Object f939c;

    public f2(int i10, Object obj, Object obj2) {
        this.f937a = i10;
        this.f938b = obj;
        this.f939c = obj2;
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
        switch (this.f937a) {
            case 0:
                d2 d2Var = (d2) this.f938b;
                Context context = (Context) this.f939c;
                if (d2Var != null) {
                    int i10 = d2Var.f756e;
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
                        TL_stories.StoryItem u10 = MessagesController.getInstance(i10).getStoriesController().u(d2Var.f755c, d2Var.f754b);
                        if (u10 == null) {
                            u10 = d2Var.f753a;
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
                e6 e6Var = (e6) this.f938b;
                sa saVar = (sa) this.f939c;
                jc jcVar = e6Var.J0;
                if (saVar.f1647b != null) {
                    Bundle bundle = new Bundle();
                    if (saVar.f1647b.longValue() >= 0) {
                        bundle.putLong("user_id", saVar.f1647b.longValue());
                    } else {
                        bundle.putLong("chat_id", -saVar.f1647b.longValue());
                    }
                    if (saVar.f1649e && (num = saVar.d) != null) {
                        bundle.putInt("message_id", num.intValue());
                        jcVar.H(new yn(bundle));
                        return;
                    }
                    jcVar.H(new ProfileActivity(bundle, null));
                    return;
                }
                org.telegram.ui.Components.rc Q = new yc(e6Var.f844c1, e6Var.B0).Q(R.raw.error, 36, LocaleController.getString(R.string.StoryHidAccount));
                Q.f30338a = 3;
                Q.k(true);
                return;
            case 2:
                e6 e6Var2 = (e6) this.f938b;
                ((ac) e6Var2.Q1).h(new rg.y0(e6Var2.J0.f1158f, 14, false));
                ((org.telegram.ui.ActionBar.f3) this.f939c).dismiss();
                return;
            case 3:
                e6 e6Var3 = ((v5) this.f938b).f1756l;
                wv alert = ((db) this.f939c).getAlert();
                if (alert != null && (x5Var = e6Var3.Q1) != null) {
                    ((ac) x5Var).h(alert);
                    e6Var3.f895t1.a();
                    return;
                }
                return;
            case 4:
                ci.w3 w3Var = (ci.w3) this.f938b;
                w3Var.e((MediaController.AlbumEntry) this.f939c, false);
                w3Var.F.n();
                return;
            case 5:
                ci.t8 t8Var = (ci.t8) this.f938b;
                ba baVar = (ba) this.f939c;
                org.telegram.ui.Cells.j3 j3Var = t8Var.Y;
                try {
                    charSequence = ((ClipboardManager) t8Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(t8Var.getContext());
                } catch (Exception e7) {
                    FileLog.e(e7);
                    charSequence = null;
                }
                if (charSequence != null) {
                    j3Var.f22311b.setText(charSequence.toString());
                    org.telegram.ui.Cells.h3 h3Var = j3Var.f22311b;
                    h3Var.setSelection(0, h3Var.getText().length());
                }
                baVar.run();
                return;
            case 6:
                ci.kc kcVar = (ci.kc) this.f938b;
                new ci.e9((Context) this.f939c, kcVar.f5381c, true, kcVar.f5450x0, new ci.ha(kcVar, 20), kcVar.f5374a).show();
                return;
            case 7:
                ei.m.C0((ei.m) this.f938b, (Context) this.f939c);
                return;
            case 8:
                ei.l3 l3Var = (ei.l3) this.f938b;
                ei.l0 l0Var = (ei.l0) this.f939c;
                if (l0Var.c()) {
                    l0Var.a();
                } else {
                    File file = l0Var.d;
                    if (file != null && file.exists()) {
                        File file2 = l0Var.d;
                        AndroidUtilities.openForView(file2, file2.getName(), null, LaunchActivity.G1, null, true);
                    }
                }
                b80 b80Var = l3Var.K0;
                if (b80Var != null) {
                    b80Var.u();
                    l3Var.K0 = null;
                    return;
                }
                return;
            case 9:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.f939c;
                ((org.telegram.ui.ActionBar.f3) this.f938b).dismiss();
                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(ProfileActivity.m4(connectedbotstarref.bot_id));
                    return;
                }
                return;
            case 10:
                AndroidUtilities.addToClipboard(((TL_account.TL_businessChatLink) this.f938b).link);
                yc.a0((yn) this.f939c).k(false).j();
                return;
            case 11:
                hg.l0.O((hg.l0) this.f938b, (TL_account.TL_connectedBot) this.f939c);
                return;
            case 12:
                hi.c cVar = (hi.c) this.f938b;
                cVar.getClass();
                ((Runnable) this.f939c).run();
                cVar.dismiss();
                return;
            case 13:
                ii.e2.X((ii.e2) this.f938b, (Context) this.f939c, view);
                return;
            case 14:
                ((VideoAds) this.f938b).lambda$show$2((VideoAds.CloseDrawable) this.f939c, view);
                return;
            case 15:
                ((VideoAds) this.f938b).lambda$show$18((TLRPC.TL_sponsoredMessage) this.f939c, view);
                return;
            case 16:
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) this.f938b;
                org.telegram.ui.ActionBar.u0 u0Var = (org.telegram.ui.ActionBar.u0) this.f939c;
                int indexOf = v0Var.f21584g0.indexOf(u0Var.getFilter());
                if (v0Var.f21585h0 != indexOf) {
                    v0Var.f21585h0 = indexOf;
                    v0Var.y();
                    return;
                } else if (u0Var.getFilter().h) {
                    if (!u0Var.f21529a.f15437f) {
                        u0Var.setSelectedForDelete(true);
                        return;
                    }
                    gg.q0 filter = u0Var.getFilter();
                    v0Var.C(filter);
                    org.telegram.ui.ActionBar.f5 f5Var = v0Var.H;
                    if (f5Var != null) {
                        f5Var.o(filter);
                        v0Var.H.q(v0Var.f21580e);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 17:
                org.telegram.ui.ActionBar.t0 t0Var = (org.telegram.ui.ActionBar.t0) this.f938b;
                org.telegram.ui.ActionBar.v0 v0Var2 = (org.telegram.ui.ActionBar.v0) this.f939c;
                org.telegram.ui.ActionBar.n1 n1Var = v0Var2.d;
                if (n1Var != null && n1Var.isShowing() && t0Var.f21513f) {
                    if (!v0Var2.T) {
                        v0Var2.T = true;
                        v0Var2.d.d(v0Var2.R);
                    } else {
                        return;
                    }
                }
                org.telegram.ui.ActionBar.z zVar = v0Var2.f21577c;
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
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.f938b;
                if (!((org.telegram.ui.ActionBar.w1) this.f939c).f21248a) {
                    org.telegram.ui.ActionBar.a2 a2Var = b2Var.m0;
                    if (a2Var != null) {
                        a2Var.g(b2Var, -1);
                    }
                    if (b2Var.f20428h0) {
                        b2Var.dismiss();
                        return;
                    }
                    return;
                }
                return;
            case 19:
                org.telegram.ui.ActionBar.b2 b2Var2 = (org.telegram.ui.ActionBar.b2) this.f938b;
                if (!((org.telegram.ui.ActionBar.w1) this.f939c).f21248a) {
                    org.telegram.ui.ActionBar.a2 a2Var2 = b2Var2.f20435o0;
                    if (a2Var2 != null) {
                        a2Var2.g(b2Var2, -2);
                    }
                    if (b2Var2.f20428h0) {
                        b2Var2.cancel();
                        return;
                    }
                    return;
                }
                return;
            case 20:
                org.telegram.ui.ActionBar.b2 b2Var3 = (org.telegram.ui.ActionBar.b2) this.f938b;
                if (!((org.telegram.ui.ActionBar.w1) this.f939c).f21248a) {
                    org.telegram.ui.ActionBar.a2 a2Var3 = b2Var3.f20441s0;
                    if (a2Var3 != null) {
                        a2Var3.g(b2Var3, -2);
                    }
                    if (b2Var3.f20428h0) {
                        b2Var3.dismiss();
                        return;
                    }
                    return;
                }
                return;
            case 21:
                org.telegram.ui.ActionBar.b2 b2Var4 = (org.telegram.ui.ActionBar.b2) this.f938b;
                if (!((org.telegram.ui.ActionBar.w1) this.f939c).f21248a) {
                    ii.f4 f4Var = b2Var4.f20437q0;
                    if (f4Var != null) {
                        f4Var.g(b2Var4, -2);
                    }
                    if (b2Var4.f20428h0) {
                        b2Var4.cancel();
                        return;
                    }
                    return;
                }
                return;
            case 22:
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) this.f938b;
                Activity activity = (Activity) this.f939c;
                org.telegram.ui.v3 v3Var = i4Var.K;
                if (!i4Var.f37268h0.A0) {
                    org.telegram.ui.m3 m3Var = i4Var.f37280u0[0];
                    if (m3Var.f()) {
                        if (m3Var.getWebView() != null && !i4Var.f37268h0.W) {
                            if (i4Var.f37269i0 != null) {
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
                                String v = org.telegram.ui.web.c1.v(str2);
                                org.telegram.ui.web.k kVar = i4Var.f37269i0;
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
                                org.telegram.ui.s sVar = new org.telegram.ui.s(i4Var, 1);
                                org.telegram.ui.s sVar2 = new org.telegram.ui.s(i4Var, 2);
                                org.telegram.ui.a0 a0Var = new org.telegram.ui.a0(i4Var, v, m3Var, 0);
                                org.telegram.ui.web.c cVar2 = kVar.f42259w;
                                ImageView imageView = kVar.f42255f;
                                if (bitmap == null) {
                                    imageView.setImageResource(R.drawable.msg_language);
                                    str4 = str3;
                                    imageView.setColorFilter(new PorterDuffColorFilter(kVar.H, PorterDuff.Mode.SRC_IN));
                                } else {
                                    str4 = str3;
                                    imageView.setImageDrawable(new BitmapDrawable(kVar.getContext().getResources(), bitmap));
                                    imageView.setColorFilter((ColorFilter) null);
                                }
                                TextView textView = kVar.f42257r;
                                textView.setText(Emoji.replaceEmoji(str, textView.getPaint().getFontMetricsInt(), false));
                                try {
                                    Uri parse = Uri.parse(str4);
                                    str5 = nf.f.v(parse, null, null, nf.f.a(parse.getHost()), null);
                                } catch (Exception e10) {
                                    try {
                                        FileLog.e((Throwable) e10, false);
                                        str5 = str4;
                                    } catch (Exception e11) {
                                        e = e11;
                                        str5 = str4;
                                        FileLog.e(e);
                                        str6 = str5;
                                        TextView textView2 = kVar.f42258s;
                                        textView2.setText(Emoji.replaceEmoji(str6, textView2.getPaint().getFontMetricsInt(), false));
                                        kVar.L = zVar2;
                                        kVar.M = sVar;
                                        kVar.N = sVar2;
                                        kVar.f42254e.setOnClickListener(new py0(12, kVar, yVar));
                                        kVar.f42256n.setOnClickListener(a0Var);
                                        kVar.f42252b = false;
                                        kVar.setInput(null);
                                        cVar2.f25250f3.N(true);
                                        cVar2.v0(0);
                                        org.telegram.ui.l0 l0Var2 = i4Var.f37268h0;
                                        g3 g3Var = new g3(28, m3Var, activity);
                                        fi.o oVar = l0Var2.f42375b0;
                                        oVar.setText("");
                                        oVar.setSelection(0, oVar.getText().length());
                                        oVar.setScrollX(0);
                                        l0Var2.f42400v0 = g3Var;
                                        l0Var2.k(true);
                                        return;
                                    }
                                }
                                try {
                                    str6 = URLDecoder.decode(str5.replaceAll("\\+", "%2b"), "UTF-8");
                                } catch (Exception e12) {
                                    e = e12;
                                    FileLog.e(e);
                                    str6 = str5;
                                    TextView textView22 = kVar.f42258s;
                                    textView22.setText(Emoji.replaceEmoji(str6, textView22.getPaint().getFontMetricsInt(), false));
                                    kVar.L = zVar2;
                                    kVar.M = sVar;
                                    kVar.N = sVar2;
                                    kVar.f42254e.setOnClickListener(new py0(12, kVar, yVar));
                                    kVar.f42256n.setOnClickListener(a0Var);
                                    kVar.f42252b = false;
                                    kVar.setInput(null);
                                    cVar2.f25250f3.N(true);
                                    cVar2.v0(0);
                                    org.telegram.ui.l0 l0Var22 = i4Var.f37268h0;
                                    g3 g3Var2 = new g3(28, m3Var, activity);
                                    fi.o oVar2 = l0Var22.f42375b0;
                                    oVar2.setText("");
                                    oVar2.setSelection(0, oVar2.getText().length());
                                    oVar2.setScrollX(0);
                                    l0Var22.f42400v0 = g3Var2;
                                    l0Var22.k(true);
                                    return;
                                }
                                TextView textView222 = kVar.f42258s;
                                textView222.setText(Emoji.replaceEmoji(str6, textView222.getPaint().getFontMetricsInt(), false));
                                kVar.L = zVar2;
                                kVar.M = sVar;
                                kVar.N = sVar2;
                                kVar.f42254e.setOnClickListener(new py0(12, kVar, yVar));
                                kVar.f42256n.setOnClickListener(a0Var);
                                kVar.f42252b = false;
                                kVar.setInput(null);
                                cVar2.f25250f3.N(true);
                                cVar2.v0(0);
                            }
                            org.telegram.ui.l0 l0Var222 = i4Var.f37268h0;
                            g3 g3Var22 = new g3(28, m3Var, activity);
                            fi.o oVar22 = l0Var222.f42375b0;
                            oVar22.setText("");
                            oVar22.setSelection(0, oVar22.getText().length());
                            oVar22.setScrollX(0);
                            l0Var222.f42400v0 = g3Var22;
                            l0Var222.k(true);
                            return;
                        }
                        return;
                    } else if (v3Var != null) {
                        uw0 uw0Var = new uw0(activity);
                        uw0Var.f46699a = 1;
                        uw0Var.f31458s = -AndroidUtilities.dp(32.0f);
                        m3Var.d.w0(uw0Var);
                        return;
                    } else {
                        m3Var.f38399b.y0(0);
                        return;
                    }
                }
                return;
            case 23:
                org.telegram.ui.d1 d1Var = (org.telegram.ui.d1) this.f938b;
                t70 t70Var = (t70) this.f939c;
                if (d1Var.f35598f == 0) {
                    d1Var.a(1, true);
                    int i11 = ((org.telegram.ui.i4) t70Var).X;
                    TLRPC.Chat chat = t70Var.f40713n;
                    TLRPC.TL_channels_joinChannel tL_channels_joinChannel = new TLRPC.TL_channels_joinChannel();
                    tL_channels_joinChannel.channel = MessagesController.getInputChannel(chat);
                    ConnectionsManager.getInstance(i11).sendRequestTyped(tL_channels_joinChannel, new ei.i1(d1Var, i11, tL_channels_joinChannel, chat));
                    return;
                }
                return;
            case 24:
                org.telegram.ui.d5 d5Var = (org.telegram.ui.d5) this.f938b;
                d5Var.b(false);
                d5Var.f35647e.b((org.telegram.ui.e5) this.f939c);
                return;
            case 25:
                ((org.telegram.ui.y6) this.f938b).f43075e.s0((org.telegram.ui.Cells.a2) this.f939c);
                return;
            case 26:
                org.telegram.ui.f7 f7Var = (org.telegram.ui.f7) this.f938b;
                org.telegram.ui.o7 o7Var = (org.telegram.ui.o7) this.f939c;
                org.telegram.ui.k7 k7Var = f7Var.f36212f.E;
                if (k7Var != null) {
                    k7Var.f(o7Var.f39120c, o7Var.d, true);
                }
                org.telegram.ui.ActionBar.n1 n1Var2 = f7Var.f36208a;
                if (n1Var2 != null) {
                    n1Var2.d(true);
                    return;
                }
                return;
            case 27:
                org.telegram.ui.m9 m9Var = (org.telegram.ui.m9) this.f938b;
                org.telegram.ui.i9 i9Var = (org.telegram.ui.i9) this.f939c;
                ArrayList arrayList = i9Var.f37321b;
                if (arrayList.size() == 1) {
                    TLRPC.User user = (TLRPC.User) arrayList.get(0);
                    TLRPC.UserFull userFull = m9Var.getMessagesController().getUserFull(user.f20189id);
                    m9Var.O = user;
                    boolean z11 = i9Var.f37323e;
                    if (!z11 && (userFull == null || !userFull.video_calls_available)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    org.telegram.ui.Components.voip.g2.m(user, z11, z10, m9Var.getParentActivity(), null, m9Var.getAccountInstance());
                    return;
                }
                boolean z12 = i9Var.f37323e;
                HashSet hashSet = new HashSet();
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList.get(i12);
                    i12++;
                    hashSet.add(Long.valueOf(((TLRPC.User) obj).f20189id));
                }
                TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) i9Var.f37322c.get(0)).f20063id;
                org.telegram.ui.ActionBar.b2 b2Var5 = new org.telegram.ui.ActionBar.b2(m9Var.getParentActivity(), 3, null);
                TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                getgroupcall.call = tL_inputGroupCallInviteMessage;
                getgroupcall.limit = m9Var.getMessagesController().conferenceCallSizeLimit;
                b2Var5.setOnCancelListener(new org.telegram.ui.r8(m9Var, m9Var.getConnectionsManager().sendRequest(getgroupcall, new org.telegram.ui.q8(m9Var, b2Var5, hashSet, tL_inputGroupCallInviteMessage, z12, 1)), 1));
                b2Var5.q(600L);
                return;
            case 28:
                me meVar = (me) this.f938b;
                va1 va1Var = (va1) this.f939c;
                ci.d dVar = meVar.D1;
                if (view.isEnabled() && !dVar.N) {
                    ce ceVar = meVar.J1;
                    if (ceVar == null || !ceVar.N) {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        ud udVar = new ud(meVar, twoStepVerificationActivity, 0);
                        twoStepVerificationActivity.Z = 1;
                        twoStepVerificationActivity.f34570b0 = udVar;
                        dVar.setLoading(true);
                        twoStepVerificationActivity.s0(new vd(meVar, va1Var, twoStepVerificationActivity, 0));
                        return;
                    }
                    return;
                }
                return;
            default:
                nf.f.s((Context) this.f939c, ((TL_stats.TL_broadcastRevenueTransactionWithdrawal) this.f938b).transaction_url);
                return;
        }
    }

    public f2(Context context, TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal) {
        this.f937a = 29;
        this.f939c = context;
        this.f938b = tL_broadcastRevenueTransactionWithdrawal;
    }
}
