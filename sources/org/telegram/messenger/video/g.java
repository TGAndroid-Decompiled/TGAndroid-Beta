package org.telegram.messenger.video;

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
import dg.t0;
import fg.n1;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import k7.c6;
import mh.h0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.c3;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.i5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p1;
import org.telegram.ui.ActionBar.s0;
import org.telegram.ui.ActionBar.u0;
import org.telegram.ui.ActionBar.v0;
import org.telegram.ui.ActionBar.w0;
import org.telegram.ui.ActionBar.y1;
import org.telegram.ui.ActionBar.z;
import org.telegram.ui.Cells.i6;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Cells.z1;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.f0;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.voip.g2;
import org.telegram.ui.Components.x4;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.a0;
import org.telegram.ui.b0;
import org.telegram.ui.be;
import org.telegram.ui.e1;
import org.telegram.ui.e5;
import org.telegram.ui.f5;
import org.telegram.ui.g7;
import org.telegram.ui.h9;
import org.telegram.ui.ha1;
import org.telegram.ui.hb0;
import org.telegram.ui.k7;
import org.telegram.ui.ke;
import org.telegram.ui.kq;
import org.telegram.ui.l4;
import org.telegram.ui.l9;
import org.telegram.ui.lu;
import org.telegram.ui.m0;
import org.telegram.ui.n4;
import org.telegram.ui.o7;
import org.telegram.ui.o70;
import org.telegram.ui.p3;
import org.telegram.ui.po;
import org.telegram.ui.q8;
import org.telegram.ui.r8;
import org.telegram.ui.t;
import org.telegram.ui.td;
import org.telegram.ui.ud;
import org.telegram.ui.web.a1;
import org.telegram.ui.web.x0;
import org.telegram.ui.xn;
import org.telegram.ui.z6;
import uf.e0;
import wh.y3;
public final class g implements View.OnClickListener {
    public final int f20332a;
    public final Object f20333b;
    public final Object f20334c;

    public g(int i10, Object obj, Object obj2) {
        this.f20332a = i10;
        this.f20333b = obj;
        this.f20334c = obj2;
    }

    @Override
    public final void onClick(View view) {
        String str;
        String str2;
        Bitmap bitmap;
        String str3;
        String str4;
        boolean z4;
        Runnable runnable;
        int i10 = this.f20332a;
        Object obj = this.f20334c;
        Object obj2 = this.f20333b;
        switch (i10) {
            case 0:
                ((VideoAds) obj2).lambda$show$18((TLRPC.TL_sponsoredMessage) obj, view);
                return;
            case 1:
                w0 w0Var = (w0) obj2;
                v0 v0Var = (v0) obj;
                int indexOf = w0Var.f22348d0.indexOf(v0Var.getFilter());
                if (w0Var.f22350e0 != indexOf) {
                    w0Var.f22350e0 = indexOf;
                    w0Var.y();
                    return;
                } else if (v0Var.getFilter().h) {
                    if (!v0Var.f22318a.f50506f) {
                        v0Var.setSelectedForDelete(true);
                        return;
                    }
                    e0 filter = v0Var.getFilter();
                    w0Var.C(filter);
                    i5 i5Var = w0Var.E;
                    if (i5Var != null) {
                        i5Var.o(filter);
                        w0Var.E.q(w0Var.f22349e);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 2:
                u0 u0Var = (u0) obj2;
                w0 w0Var2 = (w0) obj;
                p1 p1Var = w0Var2.d;
                if (p1Var != null && p1Var.isShowing() && u0Var.f22300f) {
                    if (!w0Var2.Q) {
                        w0Var2.Q = true;
                        w0Var2.d.d(w0Var2.O);
                    } else {
                        return;
                    }
                }
                z zVar = w0Var2.f22346c;
                if (zVar != null) {
                    zVar.o(((Integer) view.getTag()).intValue());
                    return;
                }
                s0 s0Var = w0Var2.M;
                if (s0Var != null) {
                    s0Var.h(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
            case 3:
                d2 d2Var = (d2) obj2;
                if (!((y1) obj).f22136a) {
                    c2 c2Var = d2Var.f21249j0;
                    if (c2Var != null) {
                        c2Var.j(d2Var, -1);
                    }
                    if (d2Var.f21243e0) {
                        d2Var.dismiss();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                d2 d2Var2 = (d2) obj2;
                if (!((y1) obj).f22136a) {
                    c2 c2Var2 = d2Var2.f21251l0;
                    if (c2Var2 != null) {
                        c2Var2.j(d2Var2, -2);
                    }
                    if (d2Var2.f21243e0) {
                        d2Var2.cancel();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                d2 d2Var3 = (d2) obj2;
                if (!((y1) obj).f22136a) {
                    c2 c2Var3 = d2Var3.f21255p0;
                    if (c2Var3 != null) {
                        c2Var3.j(d2Var3, -2);
                    }
                    if (d2Var3.f21243e0) {
                        d2Var3.dismiss();
                        return;
                    }
                    return;
                }
                return;
            case 6:
                d2 d2Var4 = (d2) obj2;
                if (!((y1) obj).f22136a) {
                    y3 y3Var = d2Var4.f21253n0;
                    if (y3Var != null) {
                        y3Var.j(d2Var4, -2);
                    }
                    if (d2Var4.f21243e0) {
                        d2Var4.cancel();
                        return;
                    }
                    return;
                }
                return;
            case 7:
                l4 l4Var = (l4) obj2;
                Activity activity = (Activity) obj;
                org.telegram.ui.y3 y3Var2 = l4Var.H;
                if (!l4Var.f38607e0.f42731x0) {
                    p3 p3Var = l4Var.f38619r0[0];
                    if (p3Var.f()) {
                        if (p3Var.getWebView() != null && !l4Var.f38607e0.T) {
                            if (l4Var.f38608f0 != null) {
                                x0 webView = p3Var.getWebView();
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
                                String s6 = a1.s(str2);
                                org.telegram.ui.web.k kVar = l4Var.f38608f0;
                                if (webView != null) {
                                    bitmap = webView.getFavicon();
                                } else {
                                    bitmap = null;
                                }
                                if (TextUtils.isEmpty(str)) {
                                    str = LocaleController.getString(R.string.WebEmpty);
                                }
                                if (TextUtils.isEmpty(s6)) {
                                    str3 = "about:blank";
                                } else {
                                    str3 = s6;
                                }
                                org.telegram.ui.z zVar2 = new org.telegram.ui.z(l4Var, s6, 0);
                                a0 a0Var = new a0(l4Var, p3Var, activity, 0);
                                t tVar = new t(l4Var, 1);
                                t tVar2 = new t(l4Var, 2);
                                b0 b0Var = new b0(l4Var, s6, p3Var, 0);
                                org.telegram.ui.web.c cVar = kVar.f42611w;
                                ImageView imageView = kVar.f42607f;
                                if (bitmap == null) {
                                    imageView.setImageResource(R.drawable.msg_language);
                                    imageView.setColorFilter(new PorterDuffColorFilter(kVar.E, PorterDuff.Mode.SRC_IN));
                                } else {
                                    imageView.setImageDrawable(new BitmapDrawable(kVar.getContext().getResources(), bitmap));
                                    imageView.setColorFilter((ColorFilter) null);
                                }
                                TextView textView = kVar.f42609r;
                                textView.setText(Emoji.replaceEmoji(str, textView.getPaint().getFontMetricsInt(), false));
                                try {
                                    try {
                                        Uri parse = Uri.parse(str3);
                                        str3 = af.g.v(parse, null, null, af.g.a(parse.getHost()), null);
                                    } catch (Exception e6) {
                                        FileLog.e((Throwable) e6, false);
                                    }
                                    str4 = URLDecoder.decode(str3.replaceAll("\\+", "%2b"), "UTF-8");
                                } catch (Exception e10) {
                                    FileLog.e(e10);
                                    str4 = str3;
                                }
                                TextView textView2 = kVar.f42610s;
                                textView2.setText(Emoji.replaceEmoji(str4, textView2.getPaint().getFontMetricsInt(), false));
                                kVar.I = a0Var;
                                kVar.J = tVar;
                                kVar.K = tVar2;
                                kVar.f42606e.setOnClickListener(new hb0(27, kVar, zVar2));
                                kVar.f42608n.setOnClickListener(b0Var);
                                kVar.f42604b = false;
                                kVar.setInput(null);
                                cVar.V2.N(true);
                                cVar.u0(0);
                            }
                            m0 m0Var = l4Var.f38607e0;
                            lh.a1 a1Var = new lh.a1(14, p3Var, activity);
                            mh.m mVar = m0Var.V;
                            mVar.setText("");
                            mVar.setSelection(0, mVar.getText().length());
                            mVar.setScrollX(0);
                            m0Var.f42724s0 = a1Var;
                            m0Var.k(true);
                            return;
                        }
                        return;
                    } else if (y3Var2 != null) {
                        aw0 aw0Var = new aw0(activity);
                        aw0Var.f5805a = 1;
                        aw0Var.f25357s = -AndroidUtilities.dp(32.0f);
                        p3Var.d.w0(aw0Var);
                        return;
                    } else {
                        p3Var.f39904b.x0(0);
                        return;
                    }
                }
                return;
            case 8:
                e1 e1Var = (e1) obj2;
                o70 o70Var = (o70) obj;
                if (e1Var.f36355f == 0) {
                    e1Var.a(1, true);
                    int i11 = ((l4) o70Var).U;
                    TLRPC.Chat chat = o70Var.f39613n;
                    TLRPC.TL_channels_joinChannel tL_channels_joinChannel = new TLRPC.TL_channels_joinChannel();
                    tL_channels_joinChannel.channel = MessagesController.getInputChannel(chat);
                    ConnectionsManager.getInstance(i11).sendRequestTyped(tL_channels_joinChannel, new h0(e1Var, i11, tL_channels_joinChannel, chat));
                    return;
                }
                return;
            case 9:
                e5 e5Var = (e5) obj2;
                e5Var.b(false);
                e5Var.f36399e.b((f5) obj);
                return;
            case 10:
                ((z6) obj2).f43823e.u0((z1) obj);
                return;
            case 11:
                g7 g7Var = (g7) obj2;
                o7 o7Var = (o7) obj;
                k7 k7Var = g7Var.d.v;
                if (k7Var != null) {
                    k7Var.Y(o7Var.f39607c, o7Var.d, true);
                }
                p1 p1Var2 = g7Var.f37105a;
                if (p1Var2 != null) {
                    p1Var2.d(true);
                    return;
                }
                return;
            case 12:
                l9 l9Var = (l9) obj2;
                h9 h9Var = (h9) obj;
                ArrayList arrayList = h9Var.f37369b;
                if (arrayList.size() == 1) {
                    TLRPC.User user = (TLRPC.User) arrayList.get(0);
                    TLRPC.UserFull userFull = l9Var.getMessagesController().getUserFull(user.f20990id);
                    l9Var.M = user;
                    boolean z10 = h9Var.f37371e;
                    if (!z10 && (userFull == null || !userFull.video_calls_available)) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    g2.n(user, z10, z4, l9Var.getParentActivity(), null, l9Var.getAccountInstance());
                    return;
                }
                boolean z11 = h9Var.f37371e;
                HashSet hashSet = new HashSet();
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj3 = arrayList.get(i12);
                    i12++;
                    hashSet.add(Long.valueOf(((TLRPC.User) obj3).f20990id));
                }
                TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) h9Var.f37370c.get(0)).f20864id;
                d2 d2Var5 = new d2(l9Var.getParentActivity(), 3, null);
                TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                getgroupcall.call = tL_inputGroupCallInviteMessage;
                getgroupcall.limit = l9Var.getMessagesController().conferenceCallSizeLimit;
                d2Var5.setOnCancelListener(new r8(l9Var, l9Var.getConnectionsManager().sendRequest(getgroupcall, new q8(l9Var, d2Var5, hashSet, tL_inputGroupCallInviteMessage, z11, 1)), 1));
                d2Var5.q(600L);
                return;
            case 13:
                ke keVar = (ke) obj2;
                ha1 ha1Var = (ha1) obj;
                qh.d dVar = keVar.H0;
                if (view.isEnabled() && !dVar.K) {
                    be beVar = keVar.N0;
                    if (beVar == null || !beVar.K) {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        td tdVar = new td(keVar, twoStepVerificationActivity, 0);
                        twoStepVerificationActivity.W = 1;
                        twoStepVerificationActivity.Y = tdVar;
                        dVar.setLoading(true);
                        twoStepVerificationActivity.s0(new ud(keVar, ha1Var, twoStepVerificationActivity, 0));
                        return;
                    }
                    return;
                }
                return;
            case 14:
                af.g.s((Context) obj2, ((TL_stats.TL_broadcastRevenueTransactionWithdrawal) obj).transaction_url);
                return;
            case 15:
                xn xnVar = (xn) obj2;
                if (xnVar.getMediaDataController().saveToRingtones(((MessageObject) obj).getDocument())) {
                    xnVar.Q7();
                    UndoView undoView = xnVar.f43378v3;
                    if (undoView != null) {
                        long j10 = xnVar.Q5;
                        int i13 = UndoView.f25074b0;
                        undoView.j(83, j10, new n4(xnVar, 1));
                    }
                }
                xnVar.A7(true);
                return;
            case 16:
                xn.I0((xn) obj2, (String) obj);
                return;
            case 17:
                xn.y1((xn) obj2, (q70) obj);
                return;
            case 18:
                z1 z1Var = (z1) obj2;
                boolean z12 = !z1Var.b();
                z1Var.c(z12, true);
                ((AtomicBoolean) obj).set(z12);
                return;
            case 19:
                xn.z1((xn) obj2, (Context) obj);
                return;
            case 20:
                po poVar = (po) obj2;
                Context context = (Context) obj;
                c3 c3Var = new c3(context, null);
                h3 h3Var = c3Var.f21207a;
                h3Var.applyTopPadding = false;
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                m4 m4Var = new m4(context, k6.f21838n5, 23, 15, false, null);
                m4Var.setHeight(47);
                m4Var.setText(LocaleController.getString("ChatHistory", R.string.ChatHistory));
                linearLayout.addView(m4Var);
                LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
                linearLayout.addView(f10, c6.n(-1, -2));
                i6[] i6VarArr = new i6[2];
                int i14 = 0;
                for (int i15 = 2; i14 < i15; i15 = 2) {
                    i6 i6Var = new i6(context, true);
                    i6VarArr[i14] = i6Var;
                    i6Var.setTag(Integer.valueOf(i14));
                    i6VarArr[i14].setBackgroundDrawable(k6.K0(false));
                    if (i14 == 0) {
                        i6VarArr[i14].b(LocaleController.getString("ChatHistoryVisible", R.string.ChatHistoryVisible), LocaleController.getString("ChatHistoryVisibleInfo", R.string.ChatHistoryVisibleInfo), true, !poVar.G0);
                    } else if (ChatObject.isChannel(poVar.f40121u0)) {
                        i6VarArr[i14].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo", R.string.ChatHistoryHiddenInfo), false, poVar.G0);
                    } else {
                        i6VarArr[i14].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo2", R.string.ChatHistoryHiddenInfo2), false, poVar.G0);
                    }
                    f10.addView(i6VarArr[i14], c6.n(-1, -2));
                    i6VarArr[i14].setOnClickListener(new b0(poVar, i6VarArr, c3Var, 8));
                    i14++;
                }
                c3Var.b(linearLayout);
                poVar.showDialog(h3Var);
                return;
            case 21:
                po.U((po) obj2, (FrameLayout) obj, view);
                return;
            case 22:
                kq.V((kq) obj2, (c3) obj, view);
                return;
            case 23:
                new n1(((f0) obj2).getContext(), 42, (g6) obj).show();
                return;
            case 24:
                org.telegram.ui.Components.z.Q((org.telegram.ui.Components.z) obj2, (g6) obj);
                return;
            case 25:
                ((Utilities.Callback) obj2).run((TL_aicompose.AiComposeTone) obj);
                return;
            case 26:
                w0 w0Var3 = (w0) obj2;
                x4 x4Var = (x4) obj;
                w0Var3.M(null, null);
                w0Var3.G(x4Var.d, false);
                w0Var3.setupPopupRadialSelectors(x4Var.f32948f);
                w0Var3.B(x4Var.f32947e);
                return;
            case 27:
                boolean[] zArr = (boolean[]) obj2;
                boolean z13 = !zArr[0];
                zArr[0] = z13;
                ((z1) view).c(z13, true);
                ((t0) obj).run();
                return;
            case 28:
                int intValue = ((Integer) view.getTag()).intValue();
                ((AlertDialog$Builder) obj2).f21166a.I0.run();
                ((lu) obj).onClick(null, intValue);
                return;
            default:
                runnable = ((c3) obj2).f21207a.dismissRunnable;
                runnable.run();
                ((Utilities.Callback) obj).run(null);
                return;
        }
    }
}
