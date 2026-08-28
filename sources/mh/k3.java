package mh;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import g7.e6;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ll;
import org.telegram.messenger.video.VideoAds;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.i6;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.gv0;
import org.telegram.ui.Components.w4;
import org.telegram.ui.Components.x60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.a70;
import org.telegram.ui.b5;
import org.telegram.ui.bq;
import org.telegram.ui.c5;
import org.telegram.ui.d7;
import org.telegram.ui.e9;
import org.telegram.ui.fe;
import org.telegram.ui.h7;
import org.telegram.ui.ho;
import org.telegram.ui.i9;
import org.telegram.ui.l7;
import org.telegram.ui.n8;
import org.telegram.ui.o8;
import org.telegram.ui.od;
import org.telegram.ui.pd;
import org.telegram.ui.qn;
import org.telegram.ui.s91;
import org.telegram.ui.v80;
import org.telegram.ui.w6;
import org.telegram.ui.wd;
public final class k3 implements View.OnClickListener {
    public final int f17952a;
    public final Object f17953b;
    public final Object f17954c;

    public k3(int i9, Object obj, Object obj2) {
        this.f17952a = i9;
        this.f17953b = obj;
        this.f17954c = obj2;
    }

    @Override
    public final void onClick(View view) {
        int i9;
        String str;
        String str2;
        Bitmap bitmap;
        String str3;
        String str4;
        boolean z10;
        int i10 = this.f17952a;
        Object obj = this.f17954c;
        Object obj2 = this.f17953b;
        switch (i10) {
            case 0:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
                ((org.telegram.ui.ActionBar.f3) obj2).dismiss();
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.m4(connectedbotstarref.bot_id));
                    return;
                }
                return;
            case 1:
                ((VideoAds) obj2).lambda$show$2((VideoAds.CloseDrawable) obj, view);
                return;
            case 2:
                ((VideoAds) obj2).lambda$show$18((TLRPC.TL_sponsoredMessage) obj, view);
                return;
            case 3:
                org.telegram.ui.ActionBar.w0 w0Var = (org.telegram.ui.ActionBar.w0) obj2;
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) obj;
                int indexOf = w0Var.f23904c0.indexOf(v0Var.getFilter());
                if (w0Var.f23905d0 != indexOf) {
                    w0Var.f23905d0 = indexOf;
                    w0Var.y();
                    return;
                } else if (v0Var.getFilter().h) {
                    if (!v0Var.f23839a.f47776f) {
                        v0Var.setSelectedForDelete(true);
                        return;
                    }
                    of.m0 filter = v0Var.getFilter();
                    w0Var.C(filter);
                    e5 e5Var = w0Var.D;
                    if (e5Var != null) {
                        e5Var.o(filter);
                        w0Var.D.q(w0Var.f23906e);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 4:
                org.telegram.ui.ActionBar.u0 u0Var = (org.telegram.ui.ActionBar.u0) obj2;
                org.telegram.ui.ActionBar.w0 w0Var2 = (org.telegram.ui.ActionBar.w0) obj;
                org.telegram.ui.ActionBar.o1 o1Var = w0Var2.d;
                if (o1Var != null && o1Var.isShowing() && u0Var.f23806f) {
                    if (!w0Var2.P) {
                        w0Var2.P = true;
                        w0Var2.d.d(w0Var2.N);
                    } else {
                        return;
                    }
                }
                org.telegram.ui.ActionBar.z zVar = w0Var2.f23903c;
                if (zVar != null) {
                    zVar.o(((Integer) view.getTag()).intValue());
                    return;
                }
                org.telegram.ui.ActionBar.s0 s0Var = w0Var2.L;
                if (s0Var != null) {
                    s0Var.i(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
            case 5:
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj2;
                if (!((org.telegram.ui.ActionBar.x1) obj).f23519a) {
                    org.telegram.ui.ActionBar.b2 b2Var = c2Var.f22774i0;
                    if (b2Var != null) {
                        b2Var.f(c2Var, -1);
                    }
                    if (c2Var.f22767d0) {
                        c2Var.dismiss();
                        return;
                    }
                    return;
                }
                return;
            case 6:
                org.telegram.ui.ActionBar.c2 c2Var2 = (org.telegram.ui.ActionBar.c2) obj2;
                if (!((org.telegram.ui.ActionBar.x1) obj).f23519a) {
                    org.telegram.ui.ActionBar.b2 b2Var2 = c2Var2.f22776k0;
                    if (b2Var2 != null) {
                        b2Var2.f(c2Var2, -2);
                    }
                    if (c2Var2.f22767d0) {
                        c2Var2.cancel();
                        return;
                    }
                    return;
                }
                return;
            case 7:
                org.telegram.ui.ActionBar.c2 c2Var3 = (org.telegram.ui.ActionBar.c2) obj2;
                if (!((org.telegram.ui.ActionBar.x1) obj).f23519a) {
                    org.telegram.ui.ActionBar.b2 b2Var3 = c2Var3.f22780o0;
                    if (b2Var3 != null) {
                        b2Var3.f(c2Var3, -2);
                    }
                    if (c2Var3.f22767d0) {
                        c2Var3.dismiss();
                        return;
                    }
                    return;
                }
                return;
            case 8:
                org.telegram.ui.ActionBar.c2 c2Var4 = (org.telegram.ui.ActionBar.c2) obj2;
                if (!((org.telegram.ui.ActionBar.x1) obj).f23519a) {
                    qh.v3 v3Var = c2Var4.m0;
                    if (v3Var != null) {
                        v3Var.f(c2Var4, -2);
                    }
                    if (c2Var4.f22767d0) {
                        c2Var4.cancel();
                        return;
                    }
                    return;
                }
                return;
            case 9:
                org.telegram.ui.l4 l4Var = (org.telegram.ui.l4) obj2;
                Activity activity = (Activity) obj;
                org.telegram.ui.y3 y3Var = l4Var.G;
                if (!l4Var.f40014d0.f44000w0) {
                    org.telegram.ui.p3 p3Var = l4Var.f40026q0[0];
                    if (p3Var.f()) {
                        if (p3Var.getWebView() != null && !l4Var.f40014d0.S) {
                            if (l4Var.f40015e0 != null) {
                                org.telegram.ui.web.v0 webView = p3Var.getWebView();
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
                                String s10 = org.telegram.ui.web.y0.s(str2);
                                org.telegram.ui.web.k kVar = l4Var.f40015e0;
                                if (webView != null) {
                                    bitmap = webView.getFavicon();
                                } else {
                                    bitmap = null;
                                }
                                if (TextUtils.isEmpty(str)) {
                                    str = LocaleController.getString(R.string.WebEmpty);
                                }
                                if (TextUtils.isEmpty(s10)) {
                                    str3 = "about:blank";
                                } else {
                                    str3 = s10;
                                }
                                org.telegram.ui.z zVar2 = new org.telegram.ui.z(l4Var, s10, 0);
                                org.telegram.ui.a0 a0Var = new org.telegram.ui.a0(l4Var, p3Var, activity, 0);
                                org.telegram.ui.r rVar = new org.telegram.ui.r(l4Var, 1);
                                org.telegram.ui.r rVar2 = new org.telegram.ui.r(l4Var, 2);
                                org.telegram.ui.b0 b0Var = new org.telegram.ui.b0(l4Var, s10, p3Var, 0);
                                org.telegram.ui.web.c cVar = kVar.f43913w;
                                ImageView imageView = kVar.f43909f;
                                if (bitmap == null) {
                                    imageView.setImageResource(R.drawable.msg_language);
                                    imageView.setColorFilter(new PorterDuffColorFilter(kVar.D, PorterDuff.Mode.SRC_IN));
                                } else {
                                    imageView.setImageDrawable(new BitmapDrawable(kVar.getContext().getResources(), bitmap));
                                    imageView.setColorFilter((ColorFilter) null);
                                }
                                TextView textView = kVar.f43911r;
                                textView.setText(Emoji.replaceEmoji(str, textView.getPaint().getFontMetricsInt(), false));
                                try {
                                    try {
                                        Uri parse = Uri.parse(str3);
                                        str3 = ve.e.v(parse, null, null, ve.e.a(parse.getHost()), null);
                                    } catch (Exception e10) {
                                        FileLog.e((Throwable) e10, false);
                                    }
                                    str4 = URLDecoder.decode(str3.replaceAll("\\+", "%2b"), "UTF-8");
                                } catch (Exception e11) {
                                    FileLog.e(e11);
                                    str4 = str3;
                                }
                                TextView textView2 = kVar.f43912s;
                                i9 = 0;
                                textView2.setText(Emoji.replaceEmoji(str4, textView2.getPaint().getFontMetricsInt(), false));
                                kVar.H = a0Var;
                                kVar.I = rVar;
                                kVar.J = rVar2;
                                kVar.f43908e.setOnClickListener(new v80(29, kVar, zVar2));
                                kVar.f43910n.setOnClickListener(b0Var);
                                kVar.f43906b = false;
                                kVar.setInput(null);
                                cVar.U2.N(true);
                                cVar.u0(0);
                            } else {
                                i9 = 0;
                            }
                            org.telegram.ui.n0 n0Var = l4Var.f40014d0;
                            fh.f1 f1Var = new fh.f1(29, p3Var, activity);
                            gh.o oVar = n0Var.U;
                            oVar.setText("");
                            oVar.setSelection(i9, oVar.getText().length());
                            oVar.setScrollX(i9);
                            n0Var.f43993r0 = f1Var;
                            n0Var.k(true);
                            return;
                        }
                        return;
                    } else if (y3Var != null) {
                        gv0 gv0Var = new gv0(activity);
                        gv0Var.f5443a = 1;
                        gv0Var.f28880s = -AndroidUtilities.dp(32.0f);
                        p3Var.d.w0(gv0Var);
                        return;
                    } else {
                        p3Var.f41320b.x0(0);
                        return;
                    }
                }
                return;
            case 10:
                org.telegram.ui.f1 f1Var2 = (org.telegram.ui.f1) obj2;
                a70 a70Var = (a70) obj;
                if (f1Var2.f38077f == 0) {
                    f1Var2.a(1, true);
                    int i11 = ((org.telegram.ui.l4) a70Var).T;
                    TLRPC.Chat chat = a70Var.f36378n;
                    TLRPC.TL_channels_joinChannel tL_channels_joinChannel = new TLRPC.TL_channels_joinChannel();
                    tL_channels_joinChannel.channel = MessagesController.getInputChannel(chat);
                    ConnectionsManager.getInstance(i11).sendRequestTyped(tL_channels_joinChannel, new gh.j0(f1Var2, i11, tL_channels_joinChannel, chat));
                    return;
                }
                return;
            case 11:
                b5 b5Var = (b5) obj2;
                b5Var.b(false);
                b5Var.f36637e.b((c5) obj);
                return;
            case 12:
                ((w6) obj2).f43679e.t0((org.telegram.ui.Cells.z1) obj);
                return;
            case 13:
                d7 d7Var = (d7) obj2;
                l7 l7Var = (l7) obj;
                h7 h7Var = d7Var.d.v;
                if (h7Var != null) {
                    h7Var.o1(l7Var.f40070c, l7Var.d, true);
                }
                org.telegram.ui.ActionBar.o1 o1Var2 = d7Var.f37425a;
                if (o1Var2 != null) {
                    o1Var2.d(true);
                    return;
                }
                return;
            case 14:
                i9 i9Var = (i9) obj2;
                e9 e9Var = (e9) obj;
                ArrayList arrayList = e9Var.f37857b;
                if (arrayList.size() == 1) {
                    TLRPC.User user = (TLRPC.User) arrayList.get(0);
                    TLRPC.UserFull userFull = i9Var.getMessagesController().getUserFull(user.f22527id);
                    i9Var.L = user;
                    boolean z11 = e9Var.f37859e;
                    if (!z11 && (userFull == null || !userFull.video_calls_available)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    org.telegram.ui.Components.voip.e2.n(user, z11, z10, i9Var.getParentActivity(), null, i9Var.getAccountInstance());
                    return;
                }
                boolean z12 = e9Var.f37859e;
                HashSet hashSet = new HashSet();
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj3 = arrayList.get(i12);
                    i12++;
                    hashSet.add(Long.valueOf(((TLRPC.User) obj3).f22527id));
                }
                TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) e9Var.f37858c.get(0)).f22401id;
                org.telegram.ui.ActionBar.c2 c2Var5 = new org.telegram.ui.ActionBar.c2(i9Var.getParentActivity(), 3, null);
                TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                getgroupcall.call = tL_inputGroupCallInviteMessage;
                getgroupcall.limit = i9Var.getMessagesController().conferenceCallSizeLimit;
                c2Var5.setOnCancelListener(new o8(i9Var, i9Var.getConnectionsManager().sendRequest(getgroupcall, new n8(i9Var, c2Var5, hashSet, tL_inputGroupCallInviteMessage, z12, 1)), 1));
                c2Var5.q(600L);
                return;
            case 15:
                fe feVar = (fe) obj2;
                s91 s91Var = (s91) obj;
                kh.d dVar = feVar.G0;
                if (view.isEnabled() && !dVar.J) {
                    wd wdVar = feVar.M0;
                    if (wdVar == null || !wdVar.J) {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        od odVar = new od(feVar, twoStepVerificationActivity, 0);
                        twoStepVerificationActivity.V = 1;
                        twoStepVerificationActivity.X = odVar;
                        dVar.setLoading(true);
                        twoStepVerificationActivity.r0(new pd(feVar, s91Var, twoStepVerificationActivity, 0));
                        return;
                    }
                    return;
                }
                return;
            case 16:
                ve.e.s((Context) obj2, ((TL_stats.TL_broadcastRevenueTransactionWithdrawal) obj).transaction_url);
                return;
            case 17:
                qn qnVar = (qn) obj2;
                if (qnVar.getMediaDataController().saveToRingtones(((MessageObject) obj).getDocument())) {
                    qnVar.Q7();
                    UndoView undoView = qnVar.f42093u3;
                    if (undoView != null) {
                        long j10 = qnVar.P5;
                        int i13 = UndoView.f26575a0;
                        undoView.j(83, j10, new c5.b(qnVar, 1));
                    }
                }
                qnVar.A7(true);
                return;
            case 18:
                qn.H0((qn) obj2, (String) obj);
                return;
            case 19:
                qn.y1((qn) obj2, (x60) obj);
                return;
            case 20:
                org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) obj2;
                boolean z13 = !z1Var.b();
                z1Var.c(z13, true);
                ((AtomicBoolean) obj).set(z13);
                return;
            case 21:
                qn.z1((qn) obj2, (Context) obj);
                return;
            case 22:
                ho hoVar = (ho) obj2;
                Context context = (Context) obj;
                org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(context, null);
                org.telegram.ui.ActionBar.f3 f3Var = a3Var.f22713a;
                f3Var.applyTopPadding = false;
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, f6.f23178n5, 23, 15, false, null);
                m4Var.setHeight(47);
                m4Var.setText(LocaleController.getString("ChatHistory", R.string.ChatHistory));
                linearLayout.addView(m4Var);
                LinearLayout f10 = ll.f(context, 1);
                linearLayout.addView(f10, e6.n(-1, -2));
                i6[] i6VarArr = new i6[2];
                int i14 = 0;
                for (int i15 = 2; i14 < i15; i15 = 2) {
                    i6 i6Var = new i6(context, true);
                    i6VarArr[i14] = i6Var;
                    i6Var.setTag(Integer.valueOf(i14));
                    i6VarArr[i14].setBackgroundDrawable(f6.K0(false));
                    if (i14 == 0) {
                        i6VarArr[i14].b(LocaleController.getString("ChatHistoryVisible", R.string.ChatHistoryVisible), LocaleController.getString("ChatHistoryVisibleInfo", R.string.ChatHistoryVisibleInfo), true, !hoVar.F0);
                    } else if (ChatObject.isChannel(hoVar.f38861t0)) {
                        i6VarArr[i14].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo", R.string.ChatHistoryHiddenInfo), false, hoVar.F0);
                    } else {
                        i6VarArr[i14].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo2", R.string.ChatHistoryHiddenInfo2), false, hoVar.F0);
                    }
                    f10.addView(i6VarArr[i14], e6.n(-1, -2));
                    i6VarArr[i14].setOnClickListener(new org.telegram.ui.b0(hoVar, i6VarArr, a3Var, 8));
                    i14++;
                }
                a3Var.b(linearLayout);
                hoVar.showDialog(f3Var);
                return;
            case 23:
                ho.T((ho) obj2, (FrameLayout) obj, view);
                return;
            case 24:
                bq.U((bq) obj2, (org.telegram.ui.ActionBar.a3) obj, view);
                return;
            case 25:
                new zf.x0(((org.telegram.ui.Components.e0) obj2).getContext(), 42, (b6) obj).show();
                return;
            case 26:
                org.telegram.ui.Components.y.P((org.telegram.ui.Components.y) obj2, (b6) obj);
                return;
            case 27:
                ((Utilities.Callback) obj2).run((TL_aicompose.AiComposeTone) obj);
                return;
            case 28:
                org.telegram.ui.ActionBar.w0 w0Var3 = (org.telegram.ui.ActionBar.w0) obj2;
                w4 w4Var = (w4) obj;
                w0Var3.M(null, null);
                w0Var3.G(w4Var.d, false);
                w0Var3.setupPopupRadialSelectors(w4Var.f34096f);
                w0Var3.B(w4Var.f34095e);
                return;
            default:
                boolean[] zArr = (boolean[]) obj2;
                boolean z14 = !zArr[0];
                zArr[0] = z14;
                ((org.telegram.ui.Cells.z1) view).c(z14, true);
                ((bg.d) obj).run();
                return;
        }
    }
}
