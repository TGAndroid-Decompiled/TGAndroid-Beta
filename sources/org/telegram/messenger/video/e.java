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
import bi.v3;
import c8.ja;
import di.k0;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import jg.o0;
import li.v;
import oi.z3;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.j6;
import org.telegram.messenger.k5;
import org.telegram.messenger.np;
import org.telegram.messenger.ou;
import org.telegram.messenger.s10;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.g1;
import org.telegram.ui.ActionBar.l0;
import org.telegram.ui.ActionBar.m0;
import org.telegram.ui.ActionBar.m1;
import org.telegram.ui.ActionBar.p0;
import org.telegram.ui.ActionBar.q0;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.ActionBar.u2;
import org.telegram.ui.ActionBar.y;
import org.telegram.ui.Cells.c2;
import org.telegram.ui.Cells.g6;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.bu0;
import org.telegram.ui.Components.d0;
import org.telegram.ui.Components.fp;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.q4;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.a1;
import org.telegram.ui.an;
import org.telegram.ui.b5;
import org.telegram.ui.bt;
import org.telegram.ui.c5;
import org.telegram.ui.d7;
import org.telegram.ui.f9;
import org.telegram.ui.g4;
import org.telegram.ui.i4;
import org.telegram.ui.i7;
import org.telegram.ui.i9;
import org.telegram.ui.id;
import org.telegram.ui.k3;
import org.telegram.ui.m7;
import org.telegram.ui.mp;
import org.telegram.ui.n50;
import org.telegram.ui.n8;
import org.telegram.ui.nd;
import org.telegram.ui.o8;
import org.telegram.ui.qn;
import org.telegram.ui.sc1;
import org.telegram.ui.t3;
import org.telegram.ui.w;
import org.telegram.ui.w6;
import org.telegram.ui.web.s0;
import org.telegram.ui.web.v0;
import org.telegram.ui.wn;
import org.telegram.ui.x;
import org.telegram.ui.xd;
import org.telegram.ui.y6;
import org.telegram.ui.z41;
import ug.x0;
public final class e implements View.OnClickListener {
    public final int f27005a;
    public final Object f27006b;
    public final Object f27007c;

    public e(int i7, Object obj, Object obj2) {
        this.f27005a = i7;
        this.f27006b = obj;
        this.f27007c = obj2;
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
        int i7 = this.f27005a;
        int i10 = 2;
        ?? r72 = 0;
        Object obj = this.f27007c;
        Object obj2 = this.f27006b;
        switch (i7) {
            case 0:
                ((VideoAds) obj2).lambda$show$2((VideoAds.CloseDrawable) obj, view);
                return;
            case 1:
                ((VideoAds) obj2).lambda$show$18((TLRPC.TL_sponsoredMessage) obj, view);
                return;
            case 2:
                q0 q0Var = (q0) obj2;
                p0 p0Var = (p0) obj;
                int indexOf = q0Var.f29507h0.indexOf(p0Var.getFilter());
                if (q0Var.f29508i0 != indexOf) {
                    q0Var.f29508i0 = indexOf;
                    q0Var.E();
                    return;
                } else if (p0Var.getFilter().h) {
                    if (!p0Var.f29454a.f57082f) {
                        p0Var.setSelectedForDelete(true);
                        return;
                    }
                    o0 filter = p0Var.getFilter();
                    q0Var.J(filter);
                    m0 m0Var = q0Var.I;
                    if (m0Var != null) {
                        m0Var.j(filter);
                        q0Var.I.l(q0Var.f29502e);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 3:
                org.telegram.ui.ActionBar.o0 o0Var = (org.telegram.ui.ActionBar.o0) obj2;
                q0 q0Var2 = (q0) obj;
                if (q0Var2.y() && o0Var.f29426f) {
                    if (!q0Var2.U) {
                        q0Var2.U = true;
                        q0Var2.r();
                    } else {
                        return;
                    }
                }
                y yVar = q0Var2.f29499c;
                if (yVar != null) {
                    yVar.o(((Integer) view.getTag()).intValue());
                    return;
                }
                l0 l0Var = q0Var2.Q;
                if (l0Var != null) {
                    l0Var.g(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
            case 4:
                t1 t1Var = (t1) obj2;
                if (!((m1) obj).f29340a) {
                    q1 q1Var = t1Var.f29642n0;
                    if (q1Var != null) {
                        q1Var.h(t1Var, -1);
                    }
                    if (t1Var.f29639k0) {
                        t1Var.dismiss();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                t1 t1Var2 = (t1) obj2;
                if (!((m1) obj).f29340a) {
                    q1 q1Var2 = t1Var2.f29644p0;
                    if (q1Var2 != null) {
                        q1Var2.h(t1Var2, -2);
                    }
                    if (t1Var2.f29639k0) {
                        t1Var2.cancel();
                        return;
                    }
                    return;
                }
                return;
            case 6:
                t1 t1Var3 = (t1) obj2;
                if (!((m1) obj).f29340a) {
                    q1 q1Var3 = t1Var3.f29650t0;
                    if (q1Var3 != null) {
                        q1Var3.h(t1Var3, -2);
                    }
                    if (t1Var3.f29639k0) {
                        t1Var3.dismiss();
                        return;
                    }
                    return;
                }
                return;
            case 7:
                t1 t1Var4 = (t1) obj2;
                if (!((m1) obj).f29340a) {
                    z3 z3Var = t1Var4.f29647r0;
                    if (z3Var != null) {
                        z3Var.h(t1Var4, -2);
                    }
                    if (t1Var4.f29639k0) {
                        t1Var4.cancel();
                        return;
                    }
                    return;
                }
                return;
            case 8:
                g4 g4Var = (g4) obj2;
                Activity activity = (Activity) obj;
                t3 t3Var = g4Var.L;
                if (!g4Var.f47324i0.B0) {
                    k3 k3Var = g4Var.f47336v0[0];
                    if (k3Var.f()) {
                        if (k3Var.getWebView() != null && !g4Var.f47324i0.f52645a0) {
                            if (g4Var.f47325j0 != null) {
                                s0 webView = k3Var.getWebView();
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
                                String u10 = v0.u(str2);
                                org.telegram.ui.web.k kVar = g4Var.f47325j0;
                                if (webView != null) {
                                    bitmap = webView.getFavicon();
                                } else {
                                    bitmap = null;
                                }
                                if (TextUtils.isEmpty(str)) {
                                    str = hd.M0(2131742926, null);
                                }
                                if (TextUtils.isEmpty(u10)) {
                                    str3 = "about:blank";
                                } else {
                                    str3 = u10;
                                }
                                w wVar = new w(g4Var, u10, 0);
                                x xVar = new x(g4Var, k3Var, activity, 0);
                                org.telegram.ui.q qVar = new org.telegram.ui.q(g4Var, 1);
                                org.telegram.ui.q qVar2 = new org.telegram.ui.q(g4Var, 2);
                                org.telegram.ui.y yVar2 = new org.telegram.ui.y(g4Var, u10, k3Var, 0);
                                v3 v3Var = kVar.f52689x;
                                ImageView imageView = kVar.f52684f;
                                if (bitmap == null) {
                                    imageView.setImageResource(2131232195);
                                    imageView.setColorFilter(new PorterDuffColorFilter(kVar.I, PorterDuff.Mode.SRC_IN));
                                    r12 = 0;
                                } else {
                                    imageView.setImageDrawable(new BitmapDrawable(kVar.getContext().getResources(), bitmap));
                                    r12 = 0;
                                    imageView.setColorFilter((ColorFilter) null);
                                }
                                TextView textView = kVar.f52686r;
                                textView.setText(j6.m(str, textView.getPaint().getFontMetricsInt(), false, r12, 0));
                                try {
                                    try {
                                        Uri parse = Uri.parse(str3);
                                        str3 = vf.c.w(parse, r12, r12, vf.c.a(parse.getHost()), r12);
                                    } catch (Exception e10) {
                                        a8.g(e10, false);
                                    }
                                    str4 = URLDecoder.decode(str3.replaceAll("\\+", "%2b"), "UTF-8");
                                } catch (Exception e11) {
                                    a8.g(e11, true);
                                    str4 = str3;
                                }
                                TextView textView2 = kVar.f52687s;
                                textView2.setText(j6.m(str4, textView2.getPaint().getFontMetricsInt(), false, null, 0));
                                kVar.M = xVar;
                                kVar.N = qVar;
                                kVar.O = qVar2;
                                kVar.f52683e.setOnClickListener(new sc1(1, kVar, wVar));
                                kVar.f52685n.setOnClickListener(yVar2);
                                kVar.f52681b = false;
                                kVar.setInput(null);
                                v3Var.f39895g3.O(true);
                                v3Var.v0(0);
                            }
                            org.telegram.ui.l0 l0Var2 = g4Var.f47324i0;
                            v vVar = new v(10, k3Var, activity);
                            di.q qVar3 = l0Var2.f52649c0;
                            qVar3.setText("");
                            qVar3.setSelection(0, qVar3.getText().length());
                            qVar3.setScrollX(0);
                            l0Var2.f52674w0 = vVar;
                            l0Var2.k(true);
                            return;
                        }
                        return;
                    } else if (t3Var != null) {
                        bu0 bu0Var = new bu0(activity);
                        bu0Var.f58480a = 1;
                        bu0Var.f33390s = -g0.L(32.0f);
                        k3Var.d.w0(bu0Var);
                        return;
                    } else {
                        k3Var.f48549b.y0(0);
                        return;
                    }
                }
                return;
            case 9:
                a1 a1Var = (a1) obj2;
                n50 n50Var = (n50) obj;
                if (a1Var.h == 0) {
                    a1Var.a(1, true);
                    int i11 = ((g4) n50Var).Y;
                    TLRPC.Chat chat = n50Var.f49453n;
                    TLRPC.TL_channels_joinChannel tL_channels_joinChannel = new TLRPC.TL_channels_joinChannel();
                    tL_channels_joinChannel.channel = np.i1(chat);
                    ConnectionsManager.getInstance(i11).sendRequestTyped(tL_channels_joinChannel, new k0(a1Var, i11, tL_channels_joinChannel, chat, 4));
                    return;
                }
                return;
            case 10:
                b5 b5Var = (b5) obj2;
                b5Var.b(false);
                b5Var.f45587e.c((c5) obj);
                return;
            case 11:
                ((y6) ((w6) obj2).f52441f).x0((c2) obj);
                return;
            case 12:
                d7 d7Var = (d7) obj2;
                m7 m7Var = (m7) obj;
                i7 i7Var = d7Var.f46326f.G;
                if (i7Var != null) {
                    i7Var.N(m7Var.f49146c, m7Var.d, true);
                }
                g1 g1Var = d7Var.f46322a;
                if (g1Var != null) {
                    g1Var.d(true);
                    return;
                }
                return;
            case 13:
                i9 i9Var = (i9) obj2;
                f9 f9Var = (f9) obj;
                ArrayList arrayList = f9Var.f47090b;
                if (arrayList.size() == 1) {
                    TLRPC.User user = (TLRPC.User) arrayList.get(0);
                    TLRPC.UserFull b22 = i9Var.getMessagesController().b2(user.f28200id);
                    i9Var.M = user;
                    boolean z11 = f9Var.f47092e;
                    if (!z11 && (b22 == null || !b22.video_calls_available)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    org.telegram.ui.Components.voip.c2.m(user, z11, z10, i9Var.getParentActivity(), null, i9Var.getAccountInstance());
                    return;
                }
                boolean z12 = f9Var.f47092e;
                HashSet hashSet = new HashSet();
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj3 = arrayList.get(i12);
                    i12++;
                    hashSet.add(Long.valueOf(((TLRPC.User) obj3).f28200id));
                }
                TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) f9Var.f47091c.get(0)).f28072id;
                t1 t1Var5 = new t1(3, i9Var.getParentActivity(), null);
                TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                getgroupcall.call = tL_inputGroupCallInviteMessage;
                getgroupcall.limit = i9Var.getMessagesController().Q6;
                t1Var5.setOnCancelListener(new o8(i9Var, i9Var.getConnectionsManager().sendRequest(getgroupcall, new n8(i9Var, t1Var5, hashSet, tL_inputGroupCallInviteMessage, z12, 1)), 1));
                t1Var5.r(600L);
                return;
            case 14:
                xd xdVar = (xd) obj2;
                z41 z41Var = (z41) obj;
                hi.d dVar = xdVar.B0;
                if (view.isEnabled() && !dVar.R) {
                    nd ndVar = xdVar.H0;
                    if (ndVar == null || !ndVar.R) {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        org.telegram.ui.hd hdVar = new org.telegram.ui.hd(xdVar, twoStepVerificationActivity, 0);
                        twoStepVerificationActivity.f43426a0 = 1;
                        twoStepVerificationActivity.f43430c0 = hdVar;
                        dVar.setLoading(true);
                        twoStepVerificationActivity.x0(new id(xdVar, z41Var, twoStepVerificationActivity, 0));
                        return;
                    }
                    return;
                }
                return;
            case 15:
                vf.c.t((Context) obj2, ((TL_stats.TL_broadcastRevenueTransactionWithdrawal) obj).transaction_url);
                return;
            case 16:
                an anVar = (an) obj2;
                if (anVar.getMediaDataController().V1(((gj) obj).F0())) {
                    anVar.h8();
                    UndoView undoView = anVar.N3;
                    if (undoView != null) {
                        long j3 = anVar.f45259k6;
                        int i13 = UndoView.f32774j0;
                        undoView.j(83, j3, new i4(anVar, 1));
                    }
                }
                anVar.P7(true);
                return;
            case 17:
                an.C1((an) obj2, (String) obj);
                return;
            case 18:
                an.p1((an) obj2, (m60) obj);
                return;
            case 19:
                c2 c2Var = (c2) obj2;
                boolean z13 = !c2Var.b();
                c2Var.c(z13, true);
                ((AtomicBoolean) obj).set(z13);
                return;
            case 20:
                an.s1((an) obj2, (Context) obj);
                return;
            case 21:
                qn qnVar = (qn) obj2;
                Context context = (Context) obj;
                ou ouVar = new ou(context, (e6) null);
                ((u2) ouVar.f25804b).f29718v0 = false;
                LinearLayout f10 = k5.f(context, 1);
                n4 n4Var = new n4(context, org.telegram.ui.ActionBar.j6.f29030n5, 23, 15, false, null);
                n4Var.setHeight(47);
                n4Var.setText(hd.M0(2131752233, "ChatHistory"));
                f10.addView(n4Var);
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                f10.addView(linearLayout, ja.o(-1, -2));
                g6[] g6VarArr = new g6[2];
                int i14 = 0;
                while (i14 < i10) {
                    g6 g6Var = new g6(context, true);
                    g6VarArr[i14] = g6Var;
                    g6Var.setTag(Integer.valueOf(i14));
                    q6.Q(g6VarArr[i14], org.telegram.ui.ActionBar.j6.N0(false), r72, q6.M(org.telegram.ui.ActionBar.j6.f28941i6), r72);
                    if (i14 == 0) {
                        g6VarArr[i14].b(hd.M0(2131752228, "ChatHistoryVisible"), hd.M0(2131752227, "ChatHistoryVisibleInfo"), true, !qnVar.K0);
                    } else if (org.telegram.messenger.t3.T(qnVar.f50693x0)) {
                        g6VarArr[i14].b(hd.M0(2131752232, "ChatHistoryHidden"), hd.M0(2131752231, "ChatHistoryHiddenInfo"), false, qnVar.K0);
                    } else {
                        g6VarArr[i14].b(hd.M0(2131752232, "ChatHistoryHidden"), hd.M0(2131752230, "ChatHistoryHiddenInfo2"), false, qnVar.K0);
                    }
                    linearLayout.addView(g6VarArr[i14], ja.o(-1, -2));
                    g6VarArr[i14].setOnClickListener(new org.telegram.ui.y(qnVar, g6VarArr, ouVar, 8));
                    i14++;
                    i10 = 2;
                    r72 = 0;
                }
                u2 u2Var = (u2) ouVar.f25804b;
                u2Var.O = f10;
                qnVar.showDialog(u2Var);
                return;
            case 22:
                qn.Z((qn) obj2, (FrameLayout) obj, view);
                return;
            case 23:
                mp.a0((mp) obj2, (ou) obj, view);
                return;
            case 24:
                new x0(42, ((d0) obj2).getContext(), (e6) obj).show();
                return;
            case 25:
                final org.telegram.ui.Components.y yVar3 = (org.telegram.ui.Components.y) obj2;
                final e6 e6Var = (e6) obj;
                org.telegram.ui.Cells.k3 k3Var2 = yVar3.X1;
                org.telegram.ui.Cells.k3 k3Var3 = yVar3.W1;
                fp fpVar = yVar3.Z1;
                hi.d dVar2 = yVar3.f41820c2;
                if (!dVar2.R) {
                    if (!dVar2.f14056d0) {
                        if (yVar3.d2 == null) {
                            yVar3.d1();
                            return;
                        }
                        return;
                    }
                    dVar2.setLoading(true);
                    if (yVar3.f41822f2 != null) {
                        TL_aicompose.updateTone updatetone = new TL_aicompose.updateTone();
                        updatetone.flags |= 1;
                        updatetone.display_author = fpVar.f34663a.f32441q;
                        updatetone.tone = TL_aicompose.InputAiComposeTone.from(yVar3.f41822f2);
                        updatetone.flags |= 2;
                        updatetone.emoji_id = yVar3.d2.longValue();
                        updatetone.flags |= 4;
                        updatetone.title = k3Var3.getText().toString();
                        updatetone.flags |= 8;
                        updatetone.prompt = k3Var2.getText().toString();
                        ConnectionsManager.getInstance(yVar3.f29679a).sendRequestTyped(updatetone, new d3.b(1), new s10() {
                            @Override
                            public final void a(Object obj4, Object obj5) {
                                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj4;
                                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj5;
                                switch (r3) {
                                    case 0:
                                        y yVar4 = yVar3;
                                        yVar4.f41820c2.setLoading(false);
                                        if (aiComposeTone != null) {
                                            f fVar = yVar4.f41824h2;
                                            if (fVar != null) {
                                                fVar.a(aiComposeTone);
                                            }
                                            yVar4.dismiss();
                                            return;
                                        } else if (tL_error != null) {
                                            org.telegram.ui.Cells.y0.q(yVar4.f41819b2, e6Var, tL_error, false);
                                            return;
                                        } else {
                                            return;
                                        }
                                    default:
                                        y yVar5 = yVar3;
                                        FrameLayout frameLayout = yVar5.f41819b2;
                                        yVar5.f41820c2.setLoading(false);
                                        if (aiComposeTone != null) {
                                            yVar5.dismiss();
                                            f fVar2 = yVar5.f41823g2;
                                            if (fVar2 != null) {
                                                fVar2.a(aiComposeTone);
                                                return;
                                            }
                                            return;
                                        } else if (tL_error != null) {
                                            boolean equalsIgnoreCase = "TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error.text);
                                            org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                                            if (equalsIgnoreCase) {
                                                d0.t1(new cc(frameLayout, e6Var2), yVar5.f29679a);
                                                return;
                                            } else {
                                                org.telegram.ui.Cells.y0.q(frameLayout, e6Var2, tL_error, false);
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
                    createtone.display_author = fpVar.f34663a.f32441q;
                    createtone.emoji_id = yVar3.d2.longValue();
                    createtone.title = k3Var3.getText().toString();
                    createtone.prompt = k3Var2.getText().toString();
                    ConnectionsManager.getInstance(yVar3.f29679a).sendRequestTyped(createtone, new d3.b(1), new s10() {
                        @Override
                        public final void a(Object obj4, Object obj5) {
                            TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj4;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj5;
                            switch (r3) {
                                case 0:
                                    y yVar4 = yVar3;
                                    yVar4.f41820c2.setLoading(false);
                                    if (aiComposeTone != null) {
                                        f fVar = yVar4.f41824h2;
                                        if (fVar != null) {
                                            fVar.a(aiComposeTone);
                                        }
                                        yVar4.dismiss();
                                        return;
                                    } else if (tL_error != null) {
                                        org.telegram.ui.Cells.y0.q(yVar4.f41819b2, e6Var, tL_error, false);
                                        return;
                                    } else {
                                        return;
                                    }
                                default:
                                    y yVar5 = yVar3;
                                    FrameLayout frameLayout = yVar5.f41819b2;
                                    yVar5.f41820c2.setLoading(false);
                                    if (aiComposeTone != null) {
                                        yVar5.dismiss();
                                        f fVar2 = yVar5.f41823g2;
                                        if (fVar2 != null) {
                                            fVar2.a(aiComposeTone);
                                            return;
                                        }
                                        return;
                                    } else if (tL_error != null) {
                                        boolean equalsIgnoreCase = "TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error.text);
                                        org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                                        if (equalsIgnoreCase) {
                                            d0.t1(new cc(frameLayout, e6Var2), yVar5.f29679a);
                                            return;
                                        } else {
                                            org.telegram.ui.Cells.y0.q(frameLayout, e6Var2, tL_error, false);
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
            case 26:
                ((z10) obj2).a((TL_aicompose.AiComposeTone) obj);
                return;
            case 27:
                q0 q0Var3 = (q0) obj2;
                q4 q4Var = (q4) obj;
                q0Var3.V(null, null);
                q0Var3.P(q4Var.d, false);
                q0Var3.setupPopupRadialSelectors(q4Var.f38484f);
                q0Var3.I(q4Var.f38483e);
                return;
            case 28:
                boolean[] zArr = (boolean[]) obj2;
                boolean z14 = !zArr[0];
                zArr[0] = z14;
                ((c2) view).c(z14, true);
                ((wn) obj).run();
                return;
            default:
                int intValue = ((Integer) view.getTag()).intValue();
                ((AlertDialog$Builder) obj2).f28392a.M0.run();
                ((bt) obj).onClick(null, intValue);
                return;
        }
    }
}
