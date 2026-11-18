package ni;

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
import bi.c6;
import c8.ma;
import di.j0;
import hi.w4;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import li.d;
import oi.z1;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a8;
import org.telegram.messenger.f3;
import org.telegram.messenger.fj;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.j6;
import org.telegram.messenger.mp;
import org.telegram.messenger.q10;
import org.telegram.messenger.v3;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.h1;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r0;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.x2;
import org.telegram.ui.Cells.d2;
import org.telegram.ui.Cells.l3;
import org.telegram.ui.Cells.o4;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.g8;
import org.telegram.ui.Components.h0;
import org.telegram.ui.Components.j30;
import org.telegram.ui.Components.ju0;
import org.telegram.ui.Components.m0;
import org.telegram.ui.Components.voip.b2;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.y60;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.a1;
import org.telegram.ui.b5;
import org.telegram.ui.bn;
import org.telegram.ui.c5;
import org.telegram.ui.c51;
import org.telegram.ui.c7;
import org.telegram.ui.cd0;
import org.telegram.ui.dt;
import org.telegram.ui.f9;
import org.telegram.ui.g4;
import org.telegram.ui.h7;
import org.telegram.ui.hd;
import org.telegram.ui.i4;
import org.telegram.ui.i9;
import org.telegram.ui.id;
import org.telegram.ui.k3;
import org.telegram.ui.l0;
import org.telegram.ui.l7;
import org.telegram.ui.n8;
import org.telegram.ui.nd;
import org.telegram.ui.np;
import org.telegram.ui.o8;
import org.telegram.ui.p50;
import org.telegram.ui.q;
import org.telegram.ui.rn;
import org.telegram.ui.t3;
import org.telegram.ui.v6;
import org.telegram.ui.w;
import org.telegram.ui.web.k;
import org.telegram.ui.web.s0;
import org.telegram.ui.web.v0;
import org.telegram.ui.x;
import org.telegram.ui.x6;
import org.telegram.ui.xd;
import org.telegram.ui.y;
import org.telegram.ui.yn;
import ug.z0;
public final class b implements View.OnClickListener {
    public final int f21542a;
    public final Object f21543b;
    public final Object f21544c;

    public b(int i7, Object obj, Object obj2) {
        this.f21542a = i7;
        this.f21543b = obj;
        this.f21544c = obj2;
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
        int i7 = this.f21542a;
        int i10 = -1;
        int i11 = 2;
        ?? r72 = 0;
        Object obj = this.f21544c;
        Object obj2 = this.f21543b;
        switch (i7) {
            case 0:
                c cVar = (c) obj2;
                cVar.getClass();
                ((Runnable) obj).run();
                cVar.dismiss();
                return;
            case 1:
                z1.c0((z1) obj2, (Context) obj, view);
                return;
            case 2:
                ((VideoAds) obj2).lambda$show$2((VideoAds.CloseDrawable) obj, view);
                return;
            case 3:
                ((VideoAds) obj2).lambda$show$18((TLRPC.TL_sponsoredMessage) obj, view);
                return;
            case 4:
                g4 g4Var = (g4) obj2;
                Activity activity = (Activity) obj;
                t3 t3Var = g4Var.L;
                if (!g4Var.f47887i0.B0) {
                    k3 k3Var = g4Var.f47899v0[0];
                    if (k3Var.f()) {
                        if (k3Var.getWebView() != null && !g4Var.f47887i0.f53128a0) {
                            if (g4Var.f47888j0 != null) {
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
                                k kVar = g4Var.f47888j0;
                                if (webView != null) {
                                    bitmap = webView.getFavicon();
                                } else {
                                    bitmap = null;
                                }
                                if (TextUtils.isEmpty(str)) {
                                    str = gd.M0(2131742668, null);
                                }
                                if (TextUtils.isEmpty(u10)) {
                                    str3 = "about:blank";
                                } else {
                                    str3 = u10;
                                }
                                w wVar = new w(g4Var, u10, 0);
                                x xVar = new x(g4Var, k3Var, activity, 0);
                                q qVar = new q(g4Var, 1);
                                q qVar2 = new q(g4Var, 2);
                                y yVar = new y(g4Var, u10, k3Var, 0);
                                c6 c6Var = kVar.f53172x;
                                ImageView imageView = kVar.f53167f;
                                if (bitmap == null) {
                                    imageView.setImageResource(2131232196);
                                    imageView.setColorFilter(new PorterDuffColorFilter(kVar.I, PorterDuff.Mode.SRC_IN));
                                    r12 = 0;
                                } else {
                                    imageView.setImageDrawable(new BitmapDrawable(kVar.getContext().getResources(), bitmap));
                                    r12 = 0;
                                    imageView.setColorFilter((ColorFilter) null);
                                }
                                TextView textView = kVar.f53169r;
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
                                TextView textView2 = kVar.f53170s;
                                textView2.setText(j6.m(str4, textView2.getPaint().getFontMetricsInt(), false, null, 0));
                                kVar.M = xVar;
                                kVar.N = qVar;
                                kVar.O = qVar2;
                                kVar.f53166e.setOnClickListener(new cd0(26, kVar, wVar));
                                kVar.f53168n.setOnClickListener(yVar);
                                kVar.f53164b = false;
                                kVar.setInput(null);
                                c6Var.f34607g3.O(true);
                                c6Var.v0(0);
                            }
                            l0 l0Var = g4Var.f47887i0;
                            d dVar = new d(9, k3Var, activity);
                            di.q qVar3 = l0Var.f53132c0;
                            qVar3.setText("");
                            qVar3.setSelection(0, qVar3.getText().length());
                            qVar3.setScrollX(0);
                            l0Var.f53157w0 = dVar;
                            l0Var.k(true);
                            return;
                        }
                        return;
                    } else if (t3Var != null) {
                        ju0 ju0Var = new ju0(activity);
                        ju0Var.f59067a = 1;
                        ju0Var.f36535s = -g0.L(32.0f);
                        k3Var.d.w0(ju0Var);
                        return;
                    } else {
                        k3Var.f49135b.y0(0);
                        return;
                    }
                }
                return;
            case 5:
                a1 a1Var = (a1) obj2;
                p50 p50Var = (p50) obj;
                if (a1Var.h == 0) {
                    a1Var.a(1, true);
                    int i12 = ((g4) p50Var).Y;
                    TLRPC.Chat chat = p50Var.f50711n;
                    TLRPC.TL_channels_joinChannel tL_channels_joinChannel = new TLRPC.TL_channels_joinChannel();
                    tL_channels_joinChannel.channel = mp.k1(chat);
                    ConnectionsManager.getInstance(i12).sendRequestTyped(tL_channels_joinChannel, new j0(a1Var, i12, tL_channels_joinChannel, chat, 4));
                    return;
                }
                return;
            case 6:
                b5 b5Var = (b5) obj2;
                b5Var.b(false);
                b5Var.f45749e.c((c5) obj);
                return;
            case 7:
                ((x6) ((v6) obj2).f52690f).x0((d2) obj);
                return;
            case 8:
                c7 c7Var = (c7) obj2;
                l7 l7Var = (l7) obj;
                h7 h7Var = c7Var.f46441f.G;
                if (h7Var != null) {
                    h7Var.m(l7Var.f49468c, l7Var.d, true);
                }
                h1 h1Var = c7Var.f46437a;
                if (h1Var != null) {
                    h1Var.d(true);
                    return;
                }
                return;
            case 9:
                i9 i9Var = (i9) obj2;
                f9 f9Var = (f9) obj;
                ArrayList arrayList = f9Var.f47573b;
                if (arrayList.size() == 1) {
                    TLRPC.User user = (TLRPC.User) arrayList.get(0);
                    TLRPC.UserFull d2 = i9Var.getMessagesController().d2(user.f28552id);
                    i9Var.L = user;
                    boolean z11 = f9Var.f47575e;
                    if (!z11 && (d2 == null || !d2.video_calls_available)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    b2.m(user, z11, z10, i9Var.getParentActivity(), null, i9Var.getAccountInstance());
                    return;
                }
                boolean z12 = f9Var.f47575e;
                HashSet hashSet = new HashSet();
                int size = arrayList.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj3 = arrayList.get(i13);
                    i13++;
                    hashSet.add(Long.valueOf(((TLRPC.User) obj3).f28552id));
                }
                TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) f9Var.f47574c.get(0)).f28424id;
                u1 u1Var = new u1(3, i9Var.getParentActivity(), null);
                TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                getgroupcall.call = tL_inputGroupCallInviteMessage;
                getgroupcall.limit = i9Var.getMessagesController().S6;
                u1Var.setOnCancelListener(new o8(i9Var, i9Var.getConnectionsManager().sendRequest(getgroupcall, new n8(i9Var, u1Var, hashSet, tL_inputGroupCallInviteMessage, z12, 1)), 1));
                u1Var.r(600L);
                return;
            case 10:
                xd xdVar = (xd) obj2;
                c51 c51Var = (c51) obj;
                hi.d dVar2 = xdVar.B0;
                if (view.isEnabled() && !dVar2.R) {
                    nd ndVar = xdVar.H0;
                    if (ndVar == null || !ndVar.R) {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        hd hdVar = new hd(xdVar, twoStepVerificationActivity, 0);
                        twoStepVerificationActivity.f43872a0 = 1;
                        twoStepVerificationActivity.f43876c0 = hdVar;
                        dVar2.setLoading(true);
                        twoStepVerificationActivity.x0(new id(xdVar, c51Var, twoStepVerificationActivity, 0));
                        return;
                    }
                    return;
                }
                return;
            case 11:
                vf.c.t((Context) obj2, ((TL_stats.TL_broadcastRevenueTransactionWithdrawal) obj).transaction_url);
                return;
            case 12:
                bn bnVar = (bn) obj2;
                if (bnVar.getMediaDataController().a2(((fj) obj).F0())) {
                    bnVar.h8();
                    UndoView undoView = bnVar.N3;
                    if (undoView != null) {
                        long j3 = bnVar.f46076l6;
                        int i14 = UndoView.f33171j0;
                        undoView.j(83, j3, new i4(bnVar, 1));
                    }
                }
                bnVar.P7(true);
                return;
            case 13:
                bn.C1((bn) obj2, (String) obj);
                return;
            case 14:
                bn.p1((bn) obj2, (y60) obj);
                return;
            case 15:
                d2 d2Var = (d2) obj2;
                boolean z13 = !d2Var.b();
                d2Var.c(z13, true);
                ((AtomicBoolean) obj).set(z13);
                return;
            case 16:
                bn.s1((bn) obj2, (Context) obj);
                return;
            case 17:
                rn rnVar = (rn) obj2;
                Context context = (Context) obj;
                w4 w4Var = new w4(context, (i6) null);
                ((x2) w4Var.f15642b).f30226v0 = false;
                LinearLayout g10 = f3.g(context, 1);
                o4 o4Var = new o4(context, n6.f29575n5, 23, 15, false, null);
                o4Var.setHeight(47);
                o4Var.setText(gd.M0(2131752222, "ChatHistory"));
                g10.addView(o4Var);
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                g10.addView(linearLayout, ma.o(-1, -2));
                org.telegram.ui.Cells.i6[] i6VarArr = new org.telegram.ui.Cells.i6[2];
                int i15 = 0;
                while (i15 < i11) {
                    org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(context, true);
                    i6VarArr[i15] = i6Var;
                    i6Var.setTag(Integer.valueOf(i15));
                    u6.Q(i6VarArr[i15], n6.N0(false), r72, u6.M(n6.f29486i6), r72);
                    if (i15 == 0) {
                        i6VarArr[i15].b(gd.M0(2131752217, "ChatHistoryVisible"), gd.M0(2131752216, "ChatHistoryVisibleInfo"), true, !rnVar.K0);
                    } else if (v3.T(rnVar.f51696x0)) {
                        i6VarArr[i15].b(gd.M0(2131752221, "ChatHistoryHidden"), gd.M0(2131752220, "ChatHistoryHiddenInfo"), false, rnVar.K0);
                    } else {
                        i6VarArr[i15].b(gd.M0(2131752221, "ChatHistoryHidden"), gd.M0(2131752219, "ChatHistoryHiddenInfo2"), false, rnVar.K0);
                    }
                    linearLayout.addView(i6VarArr[i15], ma.o(-1, -2));
                    i6VarArr[i15].setOnClickListener(new y(rnVar, i6VarArr, w4Var, 8));
                    i15++;
                    i11 = 2;
                    r72 = 0;
                }
                x2 x2Var = (x2) w4Var.f15642b;
                x2Var.O = g10;
                rnVar.showDialog(x2Var);
                return;
            case 18:
                rn.Z((rn) obj2, (FrameLayout) obj, view);
                return;
            case 19:
                np.a0((np) obj2, (w4) obj, view);
                return;
            case 20:
                new z0(42, ((m0) obj2).getContext(), (i6) obj).show();
                return;
            case 21:
                final h0 h0Var = (h0) obj2;
                final i6 i6Var2 = (i6) obj;
                l3 l3Var = h0Var.X1;
                l3 l3Var2 = h0Var.W1;
                org.telegram.ui.Components.mp mpVar = h0Var.Z1;
                hi.d dVar3 = h0Var.f35674c2;
                if (!dVar3.R) {
                    if (!dVar3.f14339e0) {
                        if (h0Var.d2 == null) {
                            h0Var.e1();
                            return;
                        }
                        return;
                    }
                    dVar3.setLoading(true);
                    if (h0Var.f35676f2 != null) {
                        TL_aicompose.updateTone updatetone = new TL_aicompose.updateTone();
                        updatetone.flags |= 1;
                        updatetone.display_author = mpVar.f37598a.f32838q;
                        updatetone.tone = TL_aicompose.InputAiComposeTone.from(h0Var.f35676f2);
                        updatetone.flags |= 2;
                        updatetone.emoji_id = h0Var.d2.longValue();
                        updatetone.flags |= 4;
                        updatetone.title = l3Var2.getText().toString();
                        updatetone.flags |= 8;
                        updatetone.prompt = l3Var.getText().toString();
                        ConnectionsManager.getInstance(h0Var.f30187a).sendRequestTyped(updatetone, new d3.b(1), new q10() {
                            @Override
                            public final void a(Object obj4, Object obj5) {
                                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj4;
                                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj5;
                                switch (r3) {
                                    case 0:
                                        h0 h0Var2 = h0Var;
                                        h0Var2.f35674c2.setLoading(false);
                                        if (aiComposeTone != null) {
                                            f fVar = h0Var2.f35678h2;
                                            if (fVar != null) {
                                                fVar.a(aiComposeTone);
                                            }
                                            h0Var2.dismiss();
                                            return;
                                        } else if (tL_error != null) {
                                            org.telegram.ui.Cells.c0.t(h0Var2.f35673b2, i6Var2, tL_error, false);
                                            return;
                                        } else {
                                            return;
                                        }
                                    default:
                                        h0 h0Var3 = h0Var;
                                        FrameLayout frameLayout = h0Var3.f35673b2;
                                        h0Var3.f35674c2.setLoading(false);
                                        if (aiComposeTone != null) {
                                            h0Var3.dismiss();
                                            f fVar2 = h0Var3.f35677g2;
                                            if (fVar2 != null) {
                                                fVar2.a(aiComposeTone);
                                                return;
                                            }
                                            return;
                                        } else if (tL_error != null) {
                                            boolean equalsIgnoreCase = "TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error.text);
                                            org.telegram.ui.ActionBar.i6 i6Var3 = i6Var2;
                                            if (equalsIgnoreCase) {
                                                m0.z1(new lc(frameLayout, i6Var3), h0Var3.f30187a);
                                                return;
                                            } else {
                                                org.telegram.ui.Cells.c0.t(frameLayout, i6Var3, tL_error, false);
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
                    createtone.display_author = mpVar.f37598a.f32838q;
                    createtone.emoji_id = h0Var.d2.longValue();
                    createtone.title = l3Var2.getText().toString();
                    createtone.prompt = l3Var.getText().toString();
                    ConnectionsManager.getInstance(h0Var.f30187a).sendRequestTyped(createtone, new d3.b(1), new q10() {
                        @Override
                        public final void a(Object obj4, Object obj5) {
                            TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj4;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj5;
                            switch (r3) {
                                case 0:
                                    h0 h0Var2 = h0Var;
                                    h0Var2.f35674c2.setLoading(false);
                                    if (aiComposeTone != null) {
                                        f fVar = h0Var2.f35678h2;
                                        if (fVar != null) {
                                            fVar.a(aiComposeTone);
                                        }
                                        h0Var2.dismiss();
                                        return;
                                    } else if (tL_error != null) {
                                        org.telegram.ui.Cells.c0.t(h0Var2.f35673b2, i6Var2, tL_error, false);
                                        return;
                                    } else {
                                        return;
                                    }
                                default:
                                    h0 h0Var3 = h0Var;
                                    FrameLayout frameLayout = h0Var3.f35673b2;
                                    h0Var3.f35674c2.setLoading(false);
                                    if (aiComposeTone != null) {
                                        h0Var3.dismiss();
                                        f fVar2 = h0Var3.f35677g2;
                                        if (fVar2 != null) {
                                            fVar2.a(aiComposeTone);
                                            return;
                                        }
                                        return;
                                    } else if (tL_error != null) {
                                        boolean equalsIgnoreCase = "TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error.text);
                                        org.telegram.ui.ActionBar.i6 i6Var3 = i6Var2;
                                        if (equalsIgnoreCase) {
                                            m0.z1(new lc(frameLayout, i6Var3), h0Var3.f30187a);
                                            return;
                                        } else {
                                            org.telegram.ui.Cells.c0.t(frameLayout, i6Var3, tL_error, false);
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
            case 22:
                ((x10) obj2).a((TL_aicompose.AiComposeTone) obj);
                return;
            case 23:
                r0 r0Var = (r0) obj2;
                y4 y4Var = (y4) obj;
                r0Var.V(null, null);
                r0Var.P(y4Var.d, false);
                r0Var.setupPopupRadialSelectors(y4Var.f42292f);
                r0Var.I(y4Var.f42291e);
                return;
            case 24:
                boolean[] zArr = (boolean[]) obj2;
                boolean z14 = !zArr[0];
                zArr[0] = z14;
                ((d2) view).c(z14, true);
                ((yn) obj).run();
                return;
            case 25:
                int intValue = ((Integer) view.getTag()).intValue();
                ((AlertDialog$Builder) obj2).f28744a.M0.run();
                ((dt) obj).onClick(null, intValue);
                return;
            case 26:
                ((x2) ((w4) obj2).f15642b).f30232y0.run();
                ((x10) obj).a(null);
                return;
            case 27:
                ((boolean[]) obj2)[0] = true;
                ((Runnable) obj).run();
                return;
            case 28:
                g8 g8Var = (g8) obj2;
                float[] fArr = (float[]) obj;
                float f10 = MediaController.B().f22731r0;
                int i16 = 0;
                while (true) {
                    if (i16 < 3) {
                        if (f10 - 0.1f <= fArr[i16]) {
                            i10 = i16;
                        } else {
                            i16++;
                        }
                    }
                }
                int i17 = i10 + 1;
                if (i17 >= 3) {
                    i17 = 0;
                }
                MediaController.B().m0(true, fArr[i17]);
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - g8Var.K2 > 300) {
                    int i18 = mp.h1().getInt("speedhint", 0) + 1;
                    if (i18 > 2) {
                        i18 = -10;
                    }
                    mp.h1().edit().putInt("speedhint", i18).apply();
                    if (i18 >= 0 && g8Var.f30190b != null) {
                        ?? j30Var = new j30(5, g8Var.getContext(), null, false);
                        g8Var.J2 = j30Var;
                        j30Var.setExtraTranslationY(g0.L(6.0f));
                        g8Var.J2.setText(gd.M0(2131745034, null));
                        g8Var.f35420y1.addView(g8Var.J2, ma.d(-2, -2.0f, 48, 0.0f, 0.0f, 6.0f, 0.0f));
                        g8Var.J2.c(g8Var.P1);
                    }
                }
                g8Var.K2 = currentTimeMillis;
                return;
            default:
                g8 g8Var2 = (g8) obj2;
                g8Var2.getClass();
                ((y60) obj).v();
                g8Var2.Q0(6);
                return;
        }
    }
}
