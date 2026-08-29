package nh;

import android.app.Activity;
import android.content.ClipboardManager;
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
import org.telegram.messenger.video.VideoAds;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.d70;
import org.telegram.ui.de;
import org.telegram.ui.dq;
import org.telegram.ui.ko;
import org.telegram.ui.nd;
import org.telegram.ui.od;
import org.telegram.ui.t91;
import org.telegram.ui.tn;
import org.telegram.ui.ud;
public final class r7 implements View.OnClickListener {
    public final int f18527a;
    public final Object f18528b;
    public final Object f18529c;

    public r7(int i10, Object obj, Object obj2) {
        this.f18527a = i10;
        this.f18528b = obj;
        this.f18529c = obj2;
    }

    @Override
    public final void onClick(View view) {
        CharSequence charSequence;
        String str;
        String str2;
        Bitmap bitmap;
        String str3;
        String str4;
        boolean z10;
        int i10 = this.f18527a;
        Object obj = this.f18529c;
        Object obj2 = this.f18528b;
        switch (i10) {
            case 0:
                y7 y7Var = (y7) obj2;
                b6 b6Var = (b6) obj;
                org.telegram.ui.Cells.g3 g3Var = y7Var.U;
                try {
                    charSequence = ((ClipboardManager) y7Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(y7Var.getContext());
                } catch (Exception e10) {
                    FileLog.e(e10);
                    charSequence = null;
                }
                if (charSequence != null) {
                    g3Var.f24387b.setText(charSequence.toString());
                    org.telegram.ui.Cells.e3 e3Var = g3Var.f24387b;
                    e3Var.setSelection(0, e3Var.getText().length());
                }
                b6Var.run();
                return;
            case 1:
                gb gbVar = (gb) obj2;
                new h8((Context) obj, gbVar.f17743c, true, gbVar.f17798t0, new h9(gbVar, 20), gbVar.f17736a).show();
                return;
            case 2:
                ((VideoAds) obj2).lambda$show$2((VideoAds.CloseDrawable) obj, view);
                return;
            case 3:
                ((VideoAds) obj2).lambda$show$18((TLRPC.TL_sponsoredMessage) obj, view);
                return;
            case 4:
                org.telegram.ui.ActionBar.w0 w0Var = (org.telegram.ui.ActionBar.w0) obj2;
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) obj;
                int indexOf = w0Var.f23918c0.indexOf(v0Var.getFilter());
                if (w0Var.f23919d0 != indexOf) {
                    w0Var.f23919d0 = indexOf;
                    w0Var.y();
                    return;
                } else if (v0Var.getFilter().h) {
                    if (!v0Var.f23859a.f49506f) {
                        v0Var.setSelectedForDelete(true);
                        return;
                    }
                    rf.f0 filter = v0Var.getFilter();
                    w0Var.C(filter);
                    org.telegram.ui.ActionBar.e5 e5Var = w0Var.D;
                    if (e5Var != null) {
                        e5Var.o(filter);
                        w0Var.D.q(w0Var.f23920e);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 5:
                org.telegram.ui.ActionBar.u0 u0Var = (org.telegram.ui.ActionBar.u0) obj2;
                org.telegram.ui.ActionBar.w0 w0Var2 = (org.telegram.ui.ActionBar.w0) obj;
                org.telegram.ui.ActionBar.o1 o1Var = w0Var2.d;
                if (o1Var != null && o1Var.isShowing() && u0Var.f23824f) {
                    if (!w0Var2.P) {
                        w0Var2.P = true;
                        w0Var2.d.d(w0Var2.N);
                    } else {
                        return;
                    }
                }
                org.telegram.ui.ActionBar.a0 a0Var = w0Var2.f23917c;
                if (a0Var != null) {
                    a0Var.o(((Integer) view.getTag()).intValue());
                    return;
                }
                org.telegram.ui.ActionBar.s0 s0Var = w0Var2.L;
                if (s0Var != null) {
                    s0Var.i(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
            case 6:
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj2;
                if (!((org.telegram.ui.ActionBar.x1) obj).f23529a) {
                    org.telegram.ui.ActionBar.b2 b2Var = c2Var.f22791i0;
                    if (b2Var != null) {
                        b2Var.g(c2Var, -1);
                    }
                    if (c2Var.f22784d0) {
                        c2Var.dismiss();
                        return;
                    }
                    return;
                }
                return;
            case 7:
                org.telegram.ui.ActionBar.c2 c2Var2 = (org.telegram.ui.ActionBar.c2) obj2;
                if (!((org.telegram.ui.ActionBar.x1) obj).f23529a) {
                    org.telegram.ui.ActionBar.b2 b2Var2 = c2Var2.f22793k0;
                    if (b2Var2 != null) {
                        b2Var2.g(c2Var2, -2);
                    }
                    if (c2Var2.f22784d0) {
                        c2Var2.cancel();
                        return;
                    }
                    return;
                }
                return;
            case 8:
                org.telegram.ui.ActionBar.c2 c2Var3 = (org.telegram.ui.ActionBar.c2) obj2;
                if (!((org.telegram.ui.ActionBar.x1) obj).f23529a) {
                    org.telegram.ui.ActionBar.b2 b2Var3 = c2Var3.f22797o0;
                    if (b2Var3 != null) {
                        b2Var3.g(c2Var3, -2);
                    }
                    if (c2Var3.f22784d0) {
                        c2Var3.dismiss();
                        return;
                    }
                    return;
                }
                return;
            case 9:
                org.telegram.ui.ActionBar.c2 c2Var4 = (org.telegram.ui.ActionBar.c2) obj2;
                if (!((org.telegram.ui.ActionBar.x1) obj).f23529a) {
                    th.w3 w3Var = c2Var4.m0;
                    if (w3Var != null) {
                        w3Var.g(c2Var4, -2);
                    }
                    if (c2Var4.f22784d0) {
                        c2Var4.cancel();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                org.telegram.ui.m4 m4Var = (org.telegram.ui.m4) obj2;
                Activity activity = (Activity) obj;
                org.telegram.ui.z3 z3Var = m4Var.G;
                if (!m4Var.f40392d0.f44190w0) {
                    org.telegram.ui.q3 q3Var = m4Var.f40404q0[0];
                    if (q3Var.f()) {
                        if (q3Var.getWebView() != null && !m4Var.f40392d0.S) {
                            if (m4Var.f40393e0 != null) {
                                org.telegram.ui.web.w0 webView = q3Var.getWebView();
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
                                String s10 = org.telegram.ui.web.z0.s(str2);
                                org.telegram.ui.web.l lVar = m4Var.f40393e0;
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
                                org.telegram.ui.a0 a0Var2 = new org.telegram.ui.a0(m4Var, s10, 0);
                                org.telegram.ui.b0 b0Var = new org.telegram.ui.b0(m4Var, q3Var, activity, 0);
                                org.telegram.ui.t tVar = new org.telegram.ui.t(m4Var, 1);
                                org.telegram.ui.t tVar2 = new org.telegram.ui.t(m4Var, 2);
                                org.telegram.ui.c0 c0Var = new org.telegram.ui.c0(m4Var, s10, q3Var, 0);
                                org.telegram.ui.web.d dVar = lVar.f44103w;
                                ImageView imageView = lVar.f44099f;
                                if (bitmap == null) {
                                    imageView.setImageResource(R.drawable.msg_language);
                                    imageView.setColorFilter(new PorterDuffColorFilter(lVar.D, PorterDuff.Mode.SRC_IN));
                                } else {
                                    imageView.setImageDrawable(new BitmapDrawable(lVar.getContext().getResources(), bitmap));
                                    imageView.setColorFilter((ColorFilter) null);
                                }
                                TextView textView = lVar.f44101r;
                                textView.setText(Emoji.replaceEmoji(str, textView.getPaint().getFontMetricsInt(), false));
                                try {
                                    try {
                                        Uri parse = Uri.parse(str3);
                                        str3 = ye.d.v(parse, null, null, ye.d.a(parse.getHost()), null);
                                    } catch (Exception e11) {
                                        FileLog.e((Throwable) e11, false);
                                    }
                                    str4 = URLDecoder.decode(str3.replaceAll("\\+", "%2b"), "UTF-8");
                                } catch (Exception e12) {
                                    FileLog.e(e12);
                                    str4 = str3;
                                }
                                TextView textView2 = lVar.f44102s;
                                textView2.setText(Emoji.replaceEmoji(str4, textView2.getPaint().getFontMetricsInt(), false));
                                lVar.H = b0Var;
                                lVar.I = tVar;
                                lVar.J = tVar2;
                                lVar.f44098e.setOnClickListener(new org.telegram.ui.web.c(0, lVar, a0Var2));
                                lVar.f44100n.setOnClickListener(c0Var);
                                lVar.f44096b = false;
                                lVar.setInput(null);
                                dVar.U2.N(true);
                                dVar.u0(0);
                            }
                            org.telegram.ui.o0 o0Var = m4Var.f40392d0;
                            ih.b1 b1Var = new ih.b1(22, q3Var, activity);
                            jh.m mVar = o0Var.U;
                            mVar.setText("");
                            mVar.setSelection(0, mVar.getText().length());
                            mVar.setScrollX(0);
                            o0Var.f44183r0 = b1Var;
                            o0Var.k(true);
                            return;
                        }
                        return;
                    } else if (z3Var != null) {
                        qv0 qv0Var = new qv0(activity);
                        qv0Var.f6373a = 1;
                        qv0Var.f32115s = -AndroidUtilities.dp(32.0f);
                        q3Var.d.w0(qv0Var);
                        return;
                    } else {
                        q3Var.f41513b.x0(0);
                        return;
                    }
                }
                return;
            case 11:
                org.telegram.ui.g1 g1Var = (org.telegram.ui.g1) obj2;
                d70 d70Var = (d70) obj;
                if (g1Var.f38423f == 0) {
                    g1Var.a(1, true);
                    int i11 = ((org.telegram.ui.m4) d70Var).T;
                    TLRPC.Chat chat = d70Var.f37384n;
                    TLRPC.TL_channels_joinChannel tL_channels_joinChannel = new TLRPC.TL_channels_joinChannel();
                    tL_channels_joinChannel.channel = MessagesController.getInputChannel(chat);
                    ConnectionsManager.getInstance(i11).sendRequestTyped(tL_channels_joinChannel, new jh.i0(g1Var, i11, tL_channels_joinChannel, chat));
                    return;
                }
                return;
            case 12:
                org.telegram.ui.c5 c5Var = (org.telegram.ui.c5) obj2;
                c5Var.b(false);
                c5Var.f36994e.c((org.telegram.ui.d5) obj);
                return;
            case 13:
                ((org.telegram.ui.v6) obj2).f43438e.u0((org.telegram.ui.Cells.y1) obj);
                return;
            case 14:
                org.telegram.ui.c7 c7Var = (org.telegram.ui.c7) obj2;
                org.telegram.ui.k7 k7Var = (org.telegram.ui.k7) obj;
                org.telegram.ui.g7 g7Var = c7Var.d.v;
                if (g7Var != null) {
                    g7Var.O0(k7Var.f39771c, k7Var.d, true);
                }
                org.telegram.ui.ActionBar.o1 o1Var2 = c7Var.f37009a;
                if (o1Var2 != null) {
                    o1Var2.d(true);
                    return;
                }
                return;
            case 15:
                org.telegram.ui.h9 h9Var = (org.telegram.ui.h9) obj2;
                org.telegram.ui.d9 d9Var = (org.telegram.ui.d9) obj;
                ArrayList arrayList = d9Var.f37411b;
                if (arrayList.size() == 1) {
                    TLRPC.User user = (TLRPC.User) arrayList.get(0);
                    TLRPC.UserFull userFull = h9Var.getMessagesController().getUserFull(user.f22539id);
                    h9Var.L = user;
                    boolean z11 = d9Var.f37413e;
                    if (!z11 && (userFull == null || !userFull.video_calls_available)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    org.telegram.ui.Components.voip.h2.n(user, z11, z10, h9Var.getParentActivity(), null, h9Var.getAccountInstance());
                    return;
                }
                boolean z12 = d9Var.f37413e;
                HashSet hashSet = new HashSet();
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj3 = arrayList.get(i12);
                    i12++;
                    hashSet.add(Long.valueOf(((TLRPC.User) obj3).f22539id));
                }
                TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) d9Var.f37412c.get(0)).f22413id;
                org.telegram.ui.ActionBar.c2 c2Var5 = new org.telegram.ui.ActionBar.c2(h9Var.getParentActivity(), 3, null);
                TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                getgroupcall.call = tL_inputGroupCallInviteMessage;
                getgroupcall.limit = h9Var.getMessagesController().conferenceCallSizeLimit;
                c2Var5.setOnCancelListener(new org.telegram.ui.n8(h9Var, h9Var.getConnectionsManager().sendRequest(getgroupcall, new org.telegram.ui.m8(h9Var, c2Var5, hashSet, tL_inputGroupCallInviteMessage, z12, 1)), 1));
                c2Var5.q(600L);
                return;
            case 16:
                de deVar = (de) obj2;
                t91 t91Var = (t91) obj;
                d dVar2 = deVar.G0;
                if (view.isEnabled() && !dVar2.J) {
                    ud udVar = deVar.M0;
                    if (udVar == null || !udVar.J) {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        nd ndVar = new nd(deVar, twoStepVerificationActivity, 0);
                        twoStepVerificationActivity.V = 1;
                        twoStepVerificationActivity.X = ndVar;
                        dVar2.setLoading(true);
                        twoStepVerificationActivity.s0(new od(deVar, t91Var, twoStepVerificationActivity, 0));
                        return;
                    }
                    return;
                }
                return;
            case 17:
                ye.d.s((Context) obj2, ((TL_stats.TL_broadcastRevenueTransactionWithdrawal) obj).transaction_url);
                return;
            case 18:
                tn tnVar = (tn) obj2;
                if (tnVar.getMediaDataController().saveToRingtones(((MessageObject) obj).getDocument())) {
                    tnVar.Q7();
                    UndoView undoView = tnVar.f42989u3;
                    if (undoView != null) {
                        long j10 = tnVar.P5;
                        int i13 = UndoView.f26586a0;
                        undoView.j(83, j10, new e5.b(tnVar, 1));
                    }
                }
                tnVar.A7(true);
                return;
            case 19:
                tn.I0((tn) obj2, (String) obj);
                return;
            case 20:
                tn.y1((tn) obj2, (j70) obj);
                return;
            case 21:
                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) obj2;
                boolean z13 = !y1Var.b();
                y1Var.c(z13, true);
                ((AtomicBoolean) obj).set(z13);
                return;
            case 22:
                tn.z1((tn) obj2, (Context) obj);
                return;
            case 23:
                ko koVar = (ko) obj2;
                Context context = (Context) obj;
                org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(context, null);
                org.telegram.ui.ActionBar.f3 f3Var = a3Var.f22729a;
                f3Var.applyTopPadding = false;
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.k4 k4Var = new org.telegram.ui.Cells.k4(context, org.telegram.ui.ActionBar.g6.f23240n5, 23, 15, false, null);
                k4Var.setHeight(47);
                k4Var.setText(LocaleController.getString("ChatHistory", R.string.ChatHistory));
                linearLayout.addView(k4Var);
                LinearLayout g10 = org.telegram.messenger.x3.g(context, 1);
                linearLayout.addView(g10, i7.f6.n(-1, -2));
                org.telegram.ui.Cells.g6[] g6VarArr = new org.telegram.ui.Cells.g6[2];
                int i14 = 0;
                for (int i15 = 2; i14 < i15; i15 = 2) {
                    org.telegram.ui.Cells.g6 g6Var = new org.telegram.ui.Cells.g6(context, true);
                    g6VarArr[i14] = g6Var;
                    g6Var.setTag(Integer.valueOf(i14));
                    g6VarArr[i14].setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
                    if (i14 == 0) {
                        g6VarArr[i14].b(LocaleController.getString("ChatHistoryVisible", R.string.ChatHistoryVisible), LocaleController.getString("ChatHistoryVisibleInfo", R.string.ChatHistoryVisibleInfo), true, !koVar.F0);
                    } else if (ChatObject.isChannel(koVar.f39964t0)) {
                        g6VarArr[i14].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo", R.string.ChatHistoryHiddenInfo), false, koVar.F0);
                    } else {
                        g6VarArr[i14].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo2", R.string.ChatHistoryHiddenInfo2), false, koVar.F0);
                    }
                    g10.addView(g6VarArr[i14], i7.f6.n(-1, -2));
                    g6VarArr[i14].setOnClickListener(new org.telegram.ui.c0(koVar, g6VarArr, a3Var, 8));
                    i14++;
                }
                a3Var.b(linearLayout);
                koVar.showDialog(f3Var);
                return;
            case 24:
                ko.U((ko) obj2, (FrameLayout) obj, view);
                return;
            case 25:
                dq.V((dq) obj2, (org.telegram.ui.ActionBar.a3) obj, view);
                return;
            case 26:
                new cg.p1(((org.telegram.ui.Components.g0) obj2).getContext(), 42, (org.telegram.ui.ActionBar.c6) obj).show();
                return;
            case 27:
                org.telegram.ui.Components.a0.Q((org.telegram.ui.Components.a0) obj2, (org.telegram.ui.ActionBar.c6) obj);
                return;
            case 28:
                ((Utilities.Callback) obj2).run((TL_aicompose.AiComposeTone) obj);
                return;
            default:
                org.telegram.ui.ActionBar.w0 w0Var3 = (org.telegram.ui.ActionBar.w0) obj2;
                org.telegram.ui.Components.a5 a5Var = (org.telegram.ui.Components.a5) obj;
                w0Var3.M(null, null);
                w0Var3.G(a5Var.d, false);
                w0Var3.setupPopupRadialSelectors(a5Var.f26669f);
                w0Var3.B(a5Var.f26668e);
                return;
        }
    }
}
