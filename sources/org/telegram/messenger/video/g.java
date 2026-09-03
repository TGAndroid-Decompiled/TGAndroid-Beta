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
import eg.o1;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import k7.b6;
import kh.a1;
import lh.i0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.y3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b3;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p1;
import org.telegram.ui.ActionBar.s0;
import org.telegram.ui.ActionBar.u0;
import org.telegram.ui.ActionBar.v0;
import org.telegram.ui.ActionBar.w0;
import org.telegram.ui.ActionBar.y1;
import org.telegram.ui.ActionBar.z;
import org.telegram.ui.Cells.h6;
import org.telegram.ui.Cells.l4;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.f0;
import org.telegram.ui.Components.voip.f2;
import org.telegram.ui.Components.x4;
import org.telegram.ui.Components.zv0;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.a0;
import org.telegram.ui.a4;
import org.telegram.ui.b0;
import org.telegram.ui.b7;
import org.telegram.ui.c0;
import org.telegram.ui.de;
import org.telegram.ui.g1;
import org.telegram.ui.g5;
import org.telegram.ui.i7;
import org.telegram.ui.ib0;
import org.telegram.ui.j9;
import org.telegram.ui.lq;
import org.telegram.ui.m7;
import org.telegram.ui.me;
import org.telegram.ui.mu;
import org.telegram.ui.n4;
import org.telegram.ui.n9;
import org.telegram.ui.o0;
import org.telegram.ui.oa1;
import org.telegram.ui.p4;
import org.telegram.ui.p70;
import org.telegram.ui.q7;
import org.telegram.ui.r3;
import org.telegram.ui.ro;
import org.telegram.ui.s8;
import org.telegram.ui.t;
import org.telegram.ui.t8;
import org.telegram.ui.vd;
import org.telegram.ui.wd;
import org.telegram.ui.web.c1;
import org.telegram.ui.web.y0;
import org.telegram.ui.zn;
import tf.e0;
import vh.z3;
public final class g implements View.OnClickListener {
    public final int f18690a;
    public final Object f18691b;
    public final Object f18692c;

    public g(int i10, Object obj, Object obj2) {
        this.f18690a = i10;
        this.f18691b = obj;
        this.f18692c = obj2;
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
        int i10 = this.f18690a;
        Object obj = this.f18692c;
        Object obj2 = this.f18691b;
        switch (i10) {
            case 0:
                ((VideoAds) obj2).lambda$show$18((TLRPC.TL_sponsoredMessage) obj, view);
                return;
            case 1:
                w0 w0Var = (w0) obj2;
                v0 v0Var = (v0) obj;
                int indexOf = w0Var.f20628d0.indexOf(v0Var.getFilter());
                if (w0Var.f20629e0 != indexOf) {
                    w0Var.f20629e0 = indexOf;
                    w0Var.y();
                    return;
                } else if (v0Var.getFilter().h) {
                    if (!v0Var.f20581a.f46961f) {
                        v0Var.setSelectedForDelete(true);
                        return;
                    }
                    e0 filter = v0Var.getFilter();
                    w0Var.C(filter);
                    h5 h5Var = w0Var.E;
                    if (h5Var != null) {
                        h5Var.o(filter);
                        w0Var.E.q(w0Var.e);
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
                if (p1Var != null && p1Var.isShowing() && u0Var.f20565f) {
                    if (!w0Var2.Q) {
                        w0Var2.Q = true;
                        w0Var2.d.d(w0Var2.O);
                    } else {
                        return;
                    }
                }
                z zVar = w0Var2.f20626c;
                if (zVar != null) {
                    zVar.o(((Integer) view.getTag()).intValue());
                    return;
                }
                s0 s0Var = w0Var2.M;
                if (s0Var != null) {
                    s0Var.m(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
            case 3:
                d2 d2Var = (d2) obj2;
                if (!((y1) obj).f20403a) {
                    c2 c2Var = d2Var.f19572j0;
                    if (c2Var != null) {
                        c2Var.l(d2Var, -1);
                    }
                    if (d2Var.f19566e0) {
                        d2Var.dismiss();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                d2 d2Var2 = (d2) obj2;
                if (!((y1) obj).f20403a) {
                    c2 c2Var2 = d2Var2.f19574l0;
                    if (c2Var2 != null) {
                        c2Var2.l(d2Var2, -2);
                    }
                    if (d2Var2.f19566e0) {
                        d2Var2.cancel();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                d2 d2Var3 = (d2) obj2;
                if (!((y1) obj).f20403a) {
                    c2 c2Var3 = d2Var3.f19578p0;
                    if (c2Var3 != null) {
                        c2Var3.l(d2Var3, -2);
                    }
                    if (d2Var3.f19566e0) {
                        d2Var3.dismiss();
                        return;
                    }
                    return;
                }
                return;
            case 6:
                d2 d2Var4 = (d2) obj2;
                if (!((y1) obj).f20403a) {
                    z3 z3Var = d2Var4.f19576n0;
                    if (z3Var != null) {
                        z3Var.l(d2Var4, -2);
                    }
                    if (d2Var4.f19566e0) {
                        d2Var4.cancel();
                        return;
                    }
                    return;
                }
                return;
            case 7:
                n4 n4Var = (n4) obj2;
                Activity activity = (Activity) obj;
                a4 a4Var = n4Var.H;
                if (!n4Var.f36363e0.f39624x0) {
                    r3 r3Var = n4Var.f36375r0[0];
                    if (r3Var.f()) {
                        if (r3Var.getWebView() != null && !n4Var.f36363e0.T) {
                            if (n4Var.f36364f0 != null) {
                                y0 webView = r3Var.getWebView();
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
                                String v = c1.v(str2);
                                org.telegram.ui.web.k kVar = n4Var.f36364f0;
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
                                a0 a0Var = new a0(n4Var, v, 0);
                                b0 b0Var = new b0(n4Var, r3Var, activity, 0);
                                t tVar = new t(n4Var, 1);
                                t tVar2 = new t(n4Var, 2);
                                c0 c0Var = new c0(n4Var, v, r3Var, 0);
                                org.telegram.ui.web.c cVar = kVar.f39503w;
                                ImageView imageView = kVar.f39499f;
                                if (bitmap == null) {
                                    imageView.setImageResource(R.drawable.msg_language);
                                    imageView.setColorFilter(new PorterDuffColorFilter(kVar.E, PorterDuff.Mode.SRC_IN));
                                } else {
                                    imageView.setImageDrawable(new BitmapDrawable(kVar.getContext().getResources(), bitmap));
                                    imageView.setColorFilter((ColorFilter) null);
                                }
                                TextView textView = kVar.f39501r;
                                textView.setText(Emoji.replaceEmoji(str, textView.getPaint().getFontMetricsInt(), false));
                                try {
                                    try {
                                        Uri parse = Uri.parse(str3);
                                        str3 = ze.d.v(parse, null, null, ze.d.a(parse.getHost()), null);
                                    } catch (Exception e) {
                                        FileLog.e((Throwable) e, false);
                                    }
                                    str4 = URLDecoder.decode(str3.replaceAll("\\+", "%2b"), "UTF-8");
                                } catch (Exception e6) {
                                    FileLog.e(e6);
                                    str4 = str3;
                                }
                                TextView textView2 = kVar.f39502s;
                                textView2.setText(Emoji.replaceEmoji(str4, textView2.getPaint().getFontMetricsInt(), false));
                                kVar.I = b0Var;
                                kVar.J = tVar;
                                kVar.K = tVar2;
                                kVar.e.setOnClickListener(new ib0(27, kVar, a0Var));
                                kVar.f39500n.setOnClickListener(c0Var);
                                kVar.f39497b = false;
                                kVar.setInput(null);
                                cVar.V2.N(true);
                                cVar.u0(0);
                            }
                            o0 o0Var = n4Var.f36363e0;
                            a1 a1Var = new a1(14, r3Var, activity);
                            lh.n nVar = o0Var.V;
                            nVar.setText("");
                            nVar.setSelection(0, nVar.getText().length());
                            nVar.setScrollX(0);
                            o0Var.f39617s0 = a1Var;
                            o0Var.k(true);
                            return;
                        }
                        return;
                    } else if (a4Var != null) {
                        zv0 zv0Var = new zv0(activity);
                        zv0Var.f5712a = 1;
                        zv0Var.f31475s = -AndroidUtilities.dp(32.0f);
                        r3Var.d.w0(zv0Var);
                        return;
                    } else {
                        r3Var.f37684b.x0(0);
                        return;
                    }
                }
                return;
            case 8:
                g1 g1Var = (g1) obj2;
                p70 p70Var = (p70) obj;
                if (g1Var.f34271f == 0) {
                    g1Var.a(1, true);
                    int i11 = ((n4) p70Var).U;
                    TLRPC.Chat chat = p70Var.f36984n;
                    TLRPC.TL_channels_joinChannel tL_channels_joinChannel = new TLRPC.TL_channels_joinChannel();
                    tL_channels_joinChannel.channel = MessagesController.getInputChannel(chat);
                    ConnectionsManager.getInstance(i11).sendRequestTyped(tL_channels_joinChannel, new i0(g1Var, i11, tL_channels_joinChannel, chat));
                    return;
                }
                return;
            case 9:
                g5 g5Var = (g5) obj2;
                g5Var.b(false);
                g5Var.e.b((org.telegram.ui.h5) obj);
                return;
            case 10:
                ((b7) obj2).e.u0((org.telegram.ui.Cells.y1) obj);
                return;
            case 11:
                i7 i7Var = (i7) obj2;
                q7 q7Var = (q7) obj;
                m7 m7Var = i7Var.d.v;
                if (m7Var != null) {
                    m7Var.r(q7Var.f37321c, q7Var.d, true);
                }
                p1 p1Var2 = i7Var.f34810a;
                if (p1Var2 != null) {
                    p1Var2.d(true);
                    return;
                }
                return;
            case 12:
                n9 n9Var = (n9) obj2;
                j9 j9Var = (j9) obj;
                ArrayList arrayList = j9Var.f35122b;
                if (arrayList.size() == 1) {
                    TLRPC.User user = (TLRPC.User) arrayList.get(0);
                    TLRPC.UserFull userFull = n9Var.getMessagesController().getUserFull(user.f19306id);
                    n9Var.M = user;
                    boolean z10 = j9Var.e;
                    if (!z10 && (userFull == null || !userFull.video_calls_available)) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    f2.m(user, z10, z4, n9Var.getParentActivity(), null, n9Var.getAccountInstance());
                    return;
                }
                boolean z11 = j9Var.e;
                HashSet hashSet = new HashSet();
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj3 = arrayList.get(i12);
                    i12++;
                    hashSet.add(Long.valueOf(((TLRPC.User) obj3).f19306id));
                }
                TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) j9Var.f35123c.get(0)).f19180id;
                d2 d2Var5 = new d2(n9Var.getParentActivity(), 3, null);
                TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                getgroupcall.call = tL_inputGroupCallInviteMessage;
                getgroupcall.limit = n9Var.getMessagesController().conferenceCallSizeLimit;
                d2Var5.setOnCancelListener(new t8(n9Var, n9Var.getConnectionsManager().sendRequest(getgroupcall, new s8(n9Var, d2Var5, hashSet, tL_inputGroupCallInviteMessage, z11, 1)), 1));
                d2Var5.q(600L);
                return;
            case 13:
                me meVar = (me) obj2;
                oa1 oa1Var = (oa1) obj;
                ph.d dVar = meVar.H0;
                if (view.isEnabled() && !dVar.K) {
                    de deVar = meVar.N0;
                    if (deVar == null || !deVar.K) {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        vd vdVar = new vd(meVar, twoStepVerificationActivity, 0);
                        twoStepVerificationActivity.W = 1;
                        twoStepVerificationActivity.Y = vdVar;
                        dVar.setLoading(true);
                        twoStepVerificationActivity.s0(new wd(meVar, oa1Var, twoStepVerificationActivity, 0));
                        return;
                    }
                    return;
                }
                return;
            case 14:
                ze.d.s((Context) obj2, ((TL_stats.TL_broadcastRevenueTransactionWithdrawal) obj).transaction_url);
                return;
            case 15:
                zn znVar = (zn) obj2;
                if (znVar.getMediaDataController().saveToRingtones(((MessageObject) obj).getDocument())) {
                    znVar.Q7();
                    UndoView undoView = znVar.f40775v3;
                    if (undoView != null) {
                        long j10 = znVar.Q5;
                        int i13 = UndoView.f23185b0;
                        undoView.j(83, j10, new p4(znVar, 1));
                    }
                }
                znVar.A7(true);
                return;
            case 16:
                zn.I0((zn) obj2, (String) obj);
                return;
            case 17:
                zn.y1((zn) obj2, (org.telegram.ui.Components.p70) obj);
                return;
            case 18:
                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) obj2;
                boolean z12 = !y1Var.b();
                y1Var.c(z12, true);
                ((AtomicBoolean) obj).set(z12);
                return;
            case 19:
                zn.z1((zn) obj2, (Context) obj);
                return;
            case 20:
                ro roVar = (ro) obj2;
                Context context = (Context) obj;
                b3 b3Var = new b3(context, null);
                g3 g3Var = b3Var.f19500a;
                g3Var.applyTopPadding = false;
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                l4 l4Var = new l4(context, j6.f20059n5, 23, 15, false, null);
                l4Var.setHeight(47);
                l4Var.setText(LocaleController.getString("ChatHistory", R.string.ChatHistory));
                linearLayout.addView(l4Var);
                LinearLayout f10 = y3.f(context, 1);
                linearLayout.addView(f10, b6.n(-1, -2));
                h6[] h6VarArr = new h6[2];
                int i14 = 0;
                for (int i15 = 2; i14 < i15; i15 = 2) {
                    h6 h6Var = new h6(context, true);
                    h6VarArr[i14] = h6Var;
                    h6Var.setTag(Integer.valueOf(i14));
                    h6VarArr[i14].setBackgroundDrawable(j6.K0(false));
                    if (i14 == 0) {
                        h6VarArr[i14].b(LocaleController.getString("ChatHistoryVisible", R.string.ChatHistoryVisible), LocaleController.getString("ChatHistoryVisibleInfo", R.string.ChatHistoryVisibleInfo), true, !roVar.G0);
                    } else if (ChatObject.isChannel(roVar.f37926u0)) {
                        h6VarArr[i14].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo", R.string.ChatHistoryHiddenInfo), false, roVar.G0);
                    } else {
                        h6VarArr[i14].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo2", R.string.ChatHistoryHiddenInfo2), false, roVar.G0);
                    }
                    f10.addView(h6VarArr[i14], b6.n(-1, -2));
                    h6VarArr[i14].setOnClickListener(new c0(roVar, h6VarArr, b3Var, 8));
                    i14++;
                }
                b3Var.b(linearLayout);
                roVar.showDialog(g3Var);
                return;
            case 21:
                ro.U((ro) obj2, (FrameLayout) obj, view);
                return;
            case 22:
                lq.V((lq) obj2, (b3) obj, view);
                return;
            case 23:
                new o1(((f0) obj2).getContext(), 42, (f6) obj).show();
                return;
            case 24:
                org.telegram.ui.Components.z.Q((org.telegram.ui.Components.z) obj2, (f6) obj);
                return;
            case 25:
                ((Utilities.Callback) obj2).run((TL_aicompose.AiComposeTone) obj);
                return;
            case 26:
                w0 w0Var3 = (w0) obj2;
                x4 x4Var = (x4) obj;
                w0Var3.M(null, null);
                w0Var3.G(x4Var.d, false);
                w0Var3.setupPopupRadialSelectors(x4Var.f30464f);
                w0Var3.B(x4Var.e);
                return;
            case 27:
                boolean[] zArr = (boolean[]) obj2;
                boolean z13 = !zArr[0];
                zArr[0] = z13;
                ((org.telegram.ui.Cells.y1) view).c(z13, true);
                ((cg.u0) obj).run();
                return;
            case 28:
                int intValue = ((Integer) view.getTag()).intValue();
                ((AlertDialog$Builder) obj2).f19478a.I0.run();
                ((mu) obj).onClick(null, intValue);
                return;
            default:
                runnable = ((b3) obj2).f19500a.dismissRunnable;
                runnable.run();
                ((Utilities.Callback) obj).run(null);
                return;
        }
    }
}
