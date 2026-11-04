package org.telegram.messenger.video;

import ai.h4;
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
import b8.mf;
import ci.s;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import kg.l0;
import mi.c4;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.messenger.hp;
import org.telegram.messenger.i6;
import org.telegram.messenger.k5;
import org.telegram.messenger.n10;
import org.telegram.messenger.t3;
import org.telegram.messenger.u10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.f1;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.l1;
import org.telegram.ui.ActionBar.m0;
import org.telegram.ui.ActionBar.o0;
import org.telegram.ui.ActionBar.p0;
import org.telegram.ui.ActionBar.p1;
import org.telegram.ui.ActionBar.q0;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.s1;
import org.telegram.ui.ActionBar.t2;
import org.telegram.ui.ActionBar.x;
import org.telegram.ui.Cells.c2;
import org.telegram.ui.Cells.g6;
import org.telegram.ui.Cells.k3;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.e0;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.q4;
import org.telegram.ui.Components.voip.n1;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.zt0;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.a0;
import org.telegram.ui.b1;
import org.telegram.ui.d5;
import org.telegram.ui.e5;
import org.telegram.ui.e7;
import org.telegram.ui.e9;
import org.telegram.ui.h9;
import org.telegram.ui.hd;
import org.telegram.ui.i4;
import org.telegram.ui.i50;
import org.telegram.ui.id;
import org.telegram.ui.ip;
import org.telegram.ui.j7;
import org.telegram.ui.k4;
import org.telegram.ui.l3;
import org.telegram.ui.ln;
import org.telegram.ui.n7;
import org.telegram.ui.n8;
import org.telegram.ui.nd;
import org.telegram.ui.o8;
import org.telegram.ui.r41;
import org.telegram.ui.rn;
import org.telegram.ui.u3;
import org.telegram.ui.web.t0;
import org.telegram.ui.web.w0;
import org.telegram.ui.wm;
import org.telegram.ui.ws;
import org.telegram.ui.x6;
import org.telegram.ui.xd;
import org.telegram.ui.y;
import org.telegram.ui.z;
import org.telegram.ui.z6;
import vg.v0;
public final class g implements View.OnClickListener {
    public final int f25914a;
    public final Object f25915b;
    public final Object f25916c;

    public g(int i3, Object obj, Object obj2) {
        this.f25914a = i3;
        this.f25915b = obj;
        this.f25916c = obj2;
    }

    @Override
    public final void onClick(View view) {
        String str;
        String str2;
        Bitmap bitmap;
        String str3;
        ?? r12;
        String str4;
        boolean z10;
        int i3 = this.f25914a;
        int i10 = 2;
        ?? r72 = 0;
        Object obj = this.f25916c;
        Object obj2 = this.f25915b;
        switch (i3) {
            case 0:
                ((VideoAds) obj2).lambda$show$18((TLRPC.TL_sponsoredMessage) obj, view);
                return;
            case 1:
                q0 q0Var = (q0) obj2;
                p0 p0Var = (p0) obj;
                int indexOf = q0Var.f28450h0.indexOf(p0Var.getFilter());
                if (q0Var.f28451i0 != indexOf) {
                    q0Var.f28451i0 = indexOf;
                    q0Var.D();
                    return;
                } else if (p0Var.getFilter().h) {
                    if (!p0Var.f28406a.f53841f) {
                        p0Var.setSelectedForDelete(true);
                        return;
                    }
                    l0 filter = p0Var.getFilter();
                    q0Var.I(filter);
                    m0 m0Var = q0Var.I;
                    if (m0Var != null) {
                        m0Var.j(filter);
                        q0Var.I.l(q0Var.f28445e);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 2:
                o0 o0Var = (o0) obj2;
                q0 q0Var2 = (q0) obj;
                if (q0Var2.x() && o0Var.f28368f) {
                    if (!q0Var2.U) {
                        q0Var2.U = true;
                        q0Var2.q();
                    } else {
                        return;
                    }
                }
                x xVar = q0Var2.f28442c;
                if (xVar != null) {
                    xVar.o(((Integer) view.getTag()).intValue());
                    return;
                }
                org.telegram.ui.ActionBar.l0 l0Var = q0Var2.Q;
                if (l0Var != null) {
                    l0Var.i(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
            case 3:
                s1 s1Var = (s1) obj2;
                if (!((l1) obj).f28311a) {
                    p1 p1Var = s1Var.f28554p0;
                    if (p1Var != null) {
                        p1Var.g(s1Var, -1);
                    }
                    if (s1Var.f28548k0) {
                        s1Var.dismiss();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                s1 s1Var2 = (s1) obj2;
                if (!((l1) obj).f28311a) {
                    p1 p1Var2 = s1Var2.f28557r0;
                    if (p1Var2 != null) {
                        p1Var2.g(s1Var2, -2);
                    }
                    if (s1Var2.f28548k0) {
                        s1Var2.cancel();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                s1 s1Var3 = (s1) obj2;
                if (!((l1) obj).f28311a) {
                    p1 p1Var3 = s1Var3.f28562v0;
                    if (p1Var3 != null) {
                        p1Var3.g(s1Var3, -2);
                    }
                    if (s1Var3.f28548k0) {
                        s1Var3.dismiss();
                        return;
                    }
                    return;
                }
                return;
            case 6:
                s1 s1Var4 = (s1) obj2;
                if (!((l1) obj).f28311a) {
                    c4 c4Var = s1Var4.f28560t0;
                    if (c4Var != null) {
                        c4Var.g(s1Var4, -2);
                    }
                    if (s1Var4.f28548k0) {
                        s1Var4.cancel();
                        return;
                    }
                    return;
                }
                return;
            case 7:
                i4 i4Var = (i4) obj2;
                Activity activity = (Activity) obj;
                u3 u3Var = i4Var.L;
                if (!i4Var.f46088i0.B0) {
                    l3 l3Var = i4Var.f46100v0[0];
                    if (l3Var.f()) {
                        if (l3Var.getWebView() != null && !i4Var.f46088i0.f50871a0) {
                            if (i4Var.f46089j0 != null) {
                                t0 webView = l3Var.getWebView();
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
                                String u10 = w0.u(str2);
                                org.telegram.ui.web.l lVar = i4Var.f46089j0;
                                if (webView != null) {
                                    bitmap = webView.getFavicon();
                                } else {
                                    bitmap = null;
                                }
                                if (TextUtils.isEmpty(str)) {
                                    str = bd.M0(2131742936, null);
                                }
                                if (TextUtils.isEmpty(u10)) {
                                    str3 = "about:blank";
                                } else {
                                    str3 = u10;
                                }
                                y yVar = new y(i4Var, u10, 0);
                                z zVar = new z(i4Var, l3Var, activity, 0);
                                org.telegram.ui.q qVar = new org.telegram.ui.q(i4Var, 1);
                                org.telegram.ui.q qVar2 = new org.telegram.ui.q(i4Var, 2);
                                a0 a0Var = new a0(i4Var, u10, l3Var, 0);
                                h4 h4Var = lVar.f50934x;
                                ImageView imageView = lVar.f50929f;
                                if (bitmap == null) {
                                    imageView.setImageResource(2131232194);
                                    imageView.setColorFilter(new PorterDuffColorFilter(lVar.I, PorterDuff.Mode.SRC_IN));
                                    r12 = 0;
                                } else {
                                    imageView.setImageDrawable(new BitmapDrawable(lVar.getContext().getResources(), bitmap));
                                    r12 = 0;
                                    imageView.setColorFilter((ColorFilter) null);
                                }
                                TextView textView = lVar.f50931r;
                                textView.setText(i6.m(str, textView.getPaint().getFontMetricsInt(), false, r12, 0));
                                try {
                                    try {
                                        Uri parse = Uri.parse(str3);
                                        str3 = sf.c.w(parse, r12, r12, sf.c.a(parse.getHost()), r12);
                                    } catch (Exception e10) {
                                        a8.g(e10, false);
                                    }
                                    str4 = URLDecoder.decode(str3.replaceAll("\\+", "%2b"), "UTF-8");
                                } catch (Exception e11) {
                                    a8.g(e11, true);
                                    str4 = str3;
                                }
                                TextView textView2 = lVar.f50932s;
                                textView2.setText(i6.m(str4, textView2.getPaint().getFontMetricsInt(), false, null, 0));
                                lVar.M = zVar;
                                lVar.N = qVar;
                                lVar.O = qVar2;
                                lVar.f50928e.setOnClickListener(new org.telegram.ui.web.d(0, lVar, yVar));
                                lVar.f50930n.setOnClickListener(a0Var);
                                lVar.f50926b = false;
                                lVar.setInput(null);
                                h4Var.f35594g3.O(true);
                                h4Var.v0(0);
                            }
                            org.telegram.ui.m0 m0Var2 = i4Var.f46088i0;
                            mi.f fVar = new mi.f(9, l3Var, activity);
                            s sVar = m0Var2.f50875c0;
                            sVar.setText("");
                            sVar.setSelection(0, sVar.getText().length());
                            sVar.setScrollX(0);
                            m0Var2.f50900w0 = fVar;
                            m0Var2.k(true);
                            return;
                        }
                        return;
                    } else if (u3Var != null) {
                        zt0 zt0Var = new zt0(activity);
                        zt0Var.f55704a = 1;
                        zt0Var.f41110s = -g0.L(32.0f);
                        l3Var.d.w0(zt0Var);
                        return;
                    } else {
                        l3Var.f47083b.y0(0);
                        return;
                    }
                }
                return;
            case 8:
                b1 b1Var = (b1) obj2;
                i50 i50Var = (i50) obj;
                if (b1Var.h == 0) {
                    b1Var.a(1, true);
                    int i11 = ((i4) i50Var).Y;
                    TLRPC.Chat chat = i50Var.f46115n;
                    TLRPC.TL_channels_joinChannel tL_channels_joinChannel = new TLRPC.TL_channels_joinChannel();
                    tL_channels_joinChannel.channel = hp.i1(chat);
                    ConnectionsManager.getInstance(i11).sendRequestTyped(tL_channels_joinChannel, new ci.o0(b1Var, i11, tL_channels_joinChannel, chat, 4));
                    return;
                }
                return;
            case 9:
                d5 d5Var = (d5) obj2;
                d5Var.b(false);
                d5Var.f44554e.d((e5) obj);
                return;
            case 10:
                ((z6) ((x6) obj2).f51837f).x0((c2) obj);
                return;
            case 11:
                e7 e7Var = (e7) obj2;
                n7 n7Var = (n7) obj;
                j7 j7Var = e7Var.f44913f.G;
                if (j7Var != null) {
                    j7Var.a(n7Var.f47906c, n7Var.d, true);
                }
                f1 f1Var = e7Var.f44909a;
                if (f1Var != null) {
                    f1Var.d(true);
                    return;
                }
                return;
            case 12:
                h9 h9Var = (h9) obj2;
                e9 e9Var = (e9) obj;
                ArrayList arrayList = e9Var.f44927b;
                if (arrayList.size() == 1) {
                    TLRPC.User user = (TLRPC.User) arrayList.get(0);
                    TLRPC.UserFull b22 = h9Var.getMessagesController().b2(user.f27150id);
                    h9Var.M = user;
                    boolean z11 = e9Var.f44929e;
                    if (!z11 && (b22 == null || !b22.video_calls_available)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    n1.m(user, z11, z10, h9Var.getParentActivity(), null, h9Var.getAccountInstance());
                    return;
                }
                boolean z12 = e9Var.f44929e;
                HashSet hashSet = new HashSet();
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj3 = arrayList.get(i12);
                    i12++;
                    hashSet.add(Long.valueOf(((TLRPC.User) obj3).f27150id));
                }
                TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) e9Var.f44928c.get(0)).f27022id;
                s1 s1Var5 = new s1(3, h9Var.getParentActivity(), null);
                TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                getgroupcall.call = tL_inputGroupCallInviteMessage;
                getgroupcall.limit = h9Var.getMessagesController().P6;
                s1Var5.setOnCancelListener(new o8(h9Var, h9Var.getConnectionsManager().sendRequest(getgroupcall, new n8(h9Var, s1Var5, hashSet, tL_inputGroupCallInviteMessage, z12, 1)), 1));
                s1Var5.r(600L);
                return;
            case 13:
                xd xdVar = (xd) obj2;
                r41 r41Var = (r41) obj;
                gi.d dVar = xdVar.B0;
                if (view.isEnabled() && !dVar.R) {
                    nd ndVar = xdVar.H0;
                    if (ndVar == null || !ndVar.R) {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        hd hdVar = new hd(xdVar, twoStepVerificationActivity, 0);
                        twoStepVerificationActivity.f42083a0 = 1;
                        twoStepVerificationActivity.f42087c0 = hdVar;
                        dVar.setLoading(true);
                        twoStepVerificationActivity.x0(new id(xdVar, r41Var, twoStepVerificationActivity, 0));
                        return;
                    }
                    return;
                }
                return;
            case 14:
                sf.c.t((Context) obj2, ((TL_stats.TL_broadcastRevenueTransactionWithdrawal) obj).transaction_url);
                return;
            case 15:
                wm wmVar = (wm) obj2;
                if (wmVar.getMediaDataController().V1(((zi) obj).F0())) {
                    wmVar.f8();
                    UndoView undoView = wmVar.N3;
                    if (undoView != null) {
                        long j10 = wmVar.f51376k6;
                        int i13 = UndoView.f31669j0;
                        undoView.j(83, j10, new k4(wmVar, 1));
                    }
                }
                wmVar.O7(true);
                return;
            case 16:
                wm.y1((wm) obj2, (String) obj);
                return;
            case 17:
                wm.m1((wm) obj2, (f60) obj);
                return;
            case 18:
                c2 c2Var = (c2) obj2;
                boolean z13 = !c2Var.b();
                c2Var.c(z13, true);
                ((AtomicBoolean) obj).set(z13);
                return;
            case 19:
                wm.p1((wm) obj2, (Context) obj);
                return;
            case 20:
                ln lnVar = (ln) obj2;
                Context context = (Context) obj;
                hi.d dVar2 = new hi.d(context, (e6) null);
                ((t2) dVar2.f14429b).f28619v0 = false;
                LinearLayout f10 = k5.f(context, 1);
                n4 n4Var = new n4(context, k6.f28061n5, 23, 15, false, null);
                n4Var.setHeight(47);
                n4Var.setText(bd.M0(2131752233, "ChatHistory"));
                f10.addView(n4Var);
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                f10.addView(linearLayout, mf.o(-1, -2));
                g6[] g6VarArr = new g6[2];
                int i14 = 0;
                while (i14 < i10) {
                    g6 g6Var = new g6(context, true);
                    g6VarArr[i14] = g6Var;
                    g6Var.setTag(Integer.valueOf(i14));
                    r6.R(g6VarArr[i14], k6.N0(false), r72, r6.N(k6.f27972i6), r72);
                    if (i14 == 0) {
                        g6VarArr[i14].b(bd.M0(2131752228, "ChatHistoryVisible"), bd.M0(2131752227, "ChatHistoryVisibleInfo"), true, !lnVar.K0);
                    } else if (t3.T(lnVar.f47396x0)) {
                        g6VarArr[i14].b(bd.M0(2131752232, "ChatHistoryHidden"), bd.M0(2131752231, "ChatHistoryHiddenInfo"), false, lnVar.K0);
                    } else {
                        g6VarArr[i14].b(bd.M0(2131752232, "ChatHistoryHidden"), bd.M0(2131752230, "ChatHistoryHiddenInfo2"), false, lnVar.K0);
                    }
                    linearLayout.addView(g6VarArr[i14], mf.o(-1, -2));
                    g6VarArr[i14].setOnClickListener(new a0(lnVar, g6VarArr, dVar2, 8));
                    i14++;
                    i10 = 2;
                    r72 = 0;
                }
                t2 t2Var = (t2) dVar2.f14429b;
                t2Var.O = f10;
                lnVar.showDialog(t2Var);
                return;
            case 21:
                ln.Z((ln) obj2, (FrameLayout) obj, view);
                return;
            case 22:
                ip.a0((ip) obj2, (hi.d) obj, view);
                return;
            case 23:
                new v0(42, ((e0) obj2).getContext(), (e6) obj).show();
                return;
            case 24:
                final org.telegram.ui.Components.z zVar2 = (org.telegram.ui.Components.z) obj2;
                final e6 e6Var = (e6) obj;
                k3 k3Var = zVar2.U1;
                k3 k3Var2 = zVar2.T1;
                wo woVar = zVar2.W1;
                gi.d dVar3 = zVar2.Z1;
                if (!dVar3.R) {
                    if (!dVar3.f12517d0) {
                        if (zVar2.f40876a2 == null) {
                            zVar2.d1();
                            return;
                        }
                        return;
                    }
                    dVar3.setLoading(true);
                    if (zVar2.c2 != null) {
                        TL_aicompose.updateTone updatetone = new TL_aicompose.updateTone();
                        updatetone.flags |= 1;
                        updatetone.display_author = woVar.f40035a.f31334q;
                        updatetone.tone = TL_aicompose.InputAiComposeTone.from(zVar2.c2);
                        updatetone.flags |= 2;
                        updatetone.emoji_id = zVar2.f40876a2.longValue();
                        updatetone.flags |= 4;
                        updatetone.title = k3Var2.getText().toString();
                        updatetone.flags |= 8;
                        updatetone.prompt = k3Var.getText().toString();
                        ConnectionsManager.getInstance(zVar2.f28583a).sendRequestTyped(updatetone, new c3.b(1), new n10() {
                            @Override
                            public final void a(Object obj4, Object obj5) {
                                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj4;
                                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj5;
                                switch (r3) {
                                    case 0:
                                        z zVar3 = zVar2;
                                        zVar3.Z1.setLoading(false);
                                        if (aiComposeTone != null) {
                                            g gVar = zVar3.f40879e2;
                                            if (gVar != null) {
                                                gVar.a(aiComposeTone);
                                            }
                                            zVar3.dismiss();
                                            return;
                                        } else if (tL_error != null) {
                                            org.telegram.ui.Cells.f1.v(zVar3.Y1, e6Var, tL_error, false);
                                            return;
                                        } else {
                                            return;
                                        }
                                    default:
                                        z zVar4 = zVar2;
                                        FrameLayout frameLayout = zVar4.Y1;
                                        zVar4.Z1.setLoading(false);
                                        if (aiComposeTone != null) {
                                            zVar4.dismiss();
                                            g gVar2 = zVar4.f40878d2;
                                            if (gVar2 != null) {
                                                gVar2.a(aiComposeTone);
                                                return;
                                            }
                                            return;
                                        } else if (tL_error != null) {
                                            boolean equalsIgnoreCase = "TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error.text);
                                            org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                                            if (equalsIgnoreCase) {
                                                e0.t1(new fc(frameLayout, e6Var2), zVar4.f28583a);
                                                return;
                                            } else {
                                                org.telegram.ui.Cells.f1.v(frameLayout, e6Var2, tL_error, false);
                                                return;
                                            }
                                        } else {
                                            return;
                                        }
                                }
                            }
                        });
                        return;
                    }
                    TL_aicompose.createTone createtone = new TL_aicompose.createTone();
                    createtone.display_author = woVar.f40035a.f31334q;
                    createtone.emoji_id = zVar2.f40876a2.longValue();
                    createtone.title = k3Var2.getText().toString();
                    createtone.prompt = k3Var.getText().toString();
                    ConnectionsManager.getInstance(zVar2.f28583a).sendRequestTyped(createtone, new c3.b(1), new n10() {
                        @Override
                        public final void a(Object obj4, Object obj5) {
                            TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj4;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj5;
                            switch (r3) {
                                case 0:
                                    z zVar3 = zVar2;
                                    zVar3.Z1.setLoading(false);
                                    if (aiComposeTone != null) {
                                        g gVar = zVar3.f40879e2;
                                        if (gVar != null) {
                                            gVar.a(aiComposeTone);
                                        }
                                        zVar3.dismiss();
                                        return;
                                    } else if (tL_error != null) {
                                        org.telegram.ui.Cells.f1.v(zVar3.Y1, e6Var, tL_error, false);
                                        return;
                                    } else {
                                        return;
                                    }
                                default:
                                    z zVar4 = zVar2;
                                    FrameLayout frameLayout = zVar4.Y1;
                                    zVar4.Z1.setLoading(false);
                                    if (aiComposeTone != null) {
                                        zVar4.dismiss();
                                        g gVar2 = zVar4.f40878d2;
                                        if (gVar2 != null) {
                                            gVar2.a(aiComposeTone);
                                            return;
                                        }
                                        return;
                                    } else if (tL_error != null) {
                                        boolean equalsIgnoreCase = "TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error.text);
                                        org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                                        if (equalsIgnoreCase) {
                                            e0.t1(new fc(frameLayout, e6Var2), zVar4.f28583a);
                                            return;
                                        } else {
                                            org.telegram.ui.Cells.f1.v(frameLayout, e6Var2, tL_error, false);
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                            }
                        }
                    });
                    return;
                }
                return;
            case 25:
                ((u10) obj2).a((TL_aicompose.AiComposeTone) obj);
                return;
            case 26:
                q0 q0Var3 = (q0) obj2;
                q4 q4Var = (q4) obj;
                q0Var3.U(null, null);
                q0Var3.O(q4Var.d, false);
                q0Var3.setupPopupRadialSelectors(q4Var.f37339f);
                q0Var3.H(q4Var.f37338e);
                return;
            case 27:
                boolean[] zArr = (boolean[]) obj2;
                boolean z14 = !zArr[0];
                zArr[0] = z14;
                ((c2) view).c(z14, true);
                ((rn) obj).run();
                return;
            case 28:
                int intValue = ((Integer) view.getTag()).intValue();
                ((AlertDialog$Builder) obj2).f27343a.O0.run();
                ((ws) obj).onClick(null, intValue);
                return;
            default:
                ((t2) ((hi.d) obj2).f14429b).f28625y0.run();
                ((u10) obj).a(null);
                return;
        }
    }
}
