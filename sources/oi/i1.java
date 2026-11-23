package oi;

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
import bi.i6;
import c8.na;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a8;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.j6;
import org.telegram.messenger.mp;
import org.telegram.messenger.p10;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.w10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.h6;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.b90;
import org.telegram.ui.Components.e8;
import org.telegram.ui.Components.j30;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.lu0;
import org.telegram.ui.Components.w7;
import org.telegram.ui.Components.x60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.b51;
import org.telegram.ui.bn;
import org.telegram.ui.bx;
import org.telegram.ui.ct;
import org.telegram.ui.d7;
import org.telegram.ui.g9;
import org.telegram.ui.hd;
import org.telegram.ui.i7;
import org.telegram.ui.id;
import org.telegram.ui.ig0;
import org.telegram.ui.j9;
import org.telegram.ui.jw;
import org.telegram.ui.m7;
import org.telegram.ui.nd;
import org.telegram.ui.np;
import org.telegram.ui.o8;
import org.telegram.ui.p50;
import org.telegram.ui.p8;
import org.telegram.ui.rn;
import org.telegram.ui.w6;
import org.telegram.ui.xd;
import org.telegram.ui.xn;
import org.telegram.ui.y6;
public final class i1 implements View.OnClickListener {
    public final int f22239a;
    public final Object f22240b;
    public final Object f22241c;

    public i1(int i7, Object obj, Object obj2) {
        this.f22239a = i7;
        this.f22240b = obj;
        this.f22241c = obj2;
    }

    @Override
    public final void onClick(View view) {
        int i7;
        String str;
        String str2;
        Bitmap bitmap;
        String str3;
        ?? r12;
        String str4;
        boolean z10;
        int i10;
        int i11;
        int L;
        int i12 = this.f22239a;
        int i13 = -1;
        int i14 = 2;
        ?? r82 = 0;
        boolean z11 = true;
        Object obj = this.f22241c;
        Object obj2 = this.f22240b;
        switch (i12) {
            case 0:
                b2.c0((b2) obj2, (Context) obj, view);
                return;
            case 1:
                ((VideoAds) obj2).lambda$show$2((VideoAds.CloseDrawable) obj, view);
                return;
            case 2:
                ((VideoAds) obj2).lambda$show$18((TLRPC.TL_sponsoredMessage) obj, view);
                return;
            case 3:
                org.telegram.ui.g4 g4Var = (org.telegram.ui.g4) obj2;
                Activity activity = (Activity) obj;
                org.telegram.ui.t3 t3Var = g4Var.L;
                if (!g4Var.f48072i0.B0) {
                    org.telegram.ui.k3 k3Var = g4Var.f48084v0[0];
                    if (k3Var.f()) {
                        if (k3Var.getWebView() != null && !g4Var.f48072i0.f53410a0) {
                            if (g4Var.f48073j0 != null) {
                                org.telegram.ui.web.s0 webView = k3Var.getWebView();
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
                                String u10 = org.telegram.ui.web.v0.u(str2);
                                org.telegram.ui.web.k kVar = g4Var.f48073j0;
                                if (webView != null) {
                                    bitmap = webView.getFavicon();
                                } else {
                                    bitmap = null;
                                }
                                if (TextUtils.isEmpty(str)) {
                                    str = gd.N0(2131742655, null);
                                }
                                if (TextUtils.isEmpty(u10)) {
                                    str3 = "about:blank";
                                } else {
                                    str3 = u10;
                                }
                                org.telegram.ui.w wVar = new org.telegram.ui.w(g4Var, u10, 0);
                                org.telegram.ui.x xVar = new org.telegram.ui.x(g4Var, k3Var, activity, 0);
                                org.telegram.ui.q qVar = new org.telegram.ui.q(g4Var, 1);
                                org.telegram.ui.q qVar2 = new org.telegram.ui.q(g4Var, 2);
                                org.telegram.ui.y yVar = new org.telegram.ui.y(g4Var, u10, k3Var, 0);
                                i6 i6Var = kVar.f53454x;
                                ImageView imageView = kVar.f53449f;
                                if (bitmap == null) {
                                    imageView.setImageResource(2131232199);
                                    imageView.setColorFilter(new PorterDuffColorFilter(kVar.I, PorterDuff.Mode.SRC_IN));
                                    r12 = 0;
                                } else {
                                    imageView.setImageDrawable(new BitmapDrawable(kVar.getContext().getResources(), bitmap));
                                    r12 = 0;
                                    imageView.setColorFilter((ColorFilter) null);
                                }
                                TextView textView = kVar.f53451r;
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
                                TextView textView2 = kVar.f53452s;
                                textView2.setText(j6.m(str4, textView2.getPaint().getFontMetricsInt(), false, null, 0));
                                kVar.M = xVar;
                                kVar.N = qVar;
                                kVar.O = qVar2;
                                kVar.f53448e.setOnClickListener(new ig0(24, kVar, wVar));
                                kVar.f53450n.setOnClickListener(yVar);
                                i7 = 0;
                                kVar.f53446b = false;
                                kVar.setInput(null);
                                i6Var.f35323g3.O(true);
                                i6Var.v0(0);
                            } else {
                                i7 = 0;
                            }
                            org.telegram.ui.l0 l0Var = g4Var.f48072i0;
                            ki.n2 n2Var = new ki.n2(10, k3Var, activity);
                            di.q qVar3 = l0Var.f53414c0;
                            qVar3.setText("");
                            qVar3.setSelection(i7, qVar3.getText().length());
                            qVar3.setScrollX(i7);
                            l0Var.f53439w0 = n2Var;
                            l0Var.k(true);
                            return;
                        }
                        return;
                    } else if (t3Var != null) {
                        lu0 lu0Var = new lu0(activity);
                        lu0Var.f59190a = 1;
                        lu0Var.f37227s = -org.telegram.messenger.g0.L(32.0f);
                        k3Var.d.w0(lu0Var);
                        return;
                    } else {
                        k3Var.f49288b.y0(0);
                        return;
                    }
                }
                return;
            case 4:
                org.telegram.ui.a1 a1Var = (org.telegram.ui.a1) obj2;
                p50 p50Var = (p50) obj;
                if (a1Var.h == 0) {
                    a1Var.a(1, true);
                    int i15 = ((org.telegram.ui.g4) p50Var).Y;
                    TLRPC.Chat chat = p50Var.f50843n;
                    TLRPC.TL_channels_joinChannel tL_channels_joinChannel = new TLRPC.TL_channels_joinChannel();
                    tL_channels_joinChannel.channel = mp.k1(chat);
                    ConnectionsManager.getInstance(i15).sendRequestTyped(tL_channels_joinChannel, new di.j0(a1Var, i15, tL_channels_joinChannel, chat, 4));
                    return;
                }
                return;
            case 5:
                org.telegram.ui.b5 b5Var = (org.telegram.ui.b5) obj2;
                b5Var.b(false);
                b5Var.f45915e.c((org.telegram.ui.c5) obj);
                return;
            case 6:
                ((y6) ((w6) obj2).f53147f).x0((org.telegram.ui.Cells.d2) obj);
                return;
            case 7:
                d7 d7Var = (d7) obj2;
                m7 m7Var = (m7) obj;
                i7 i7Var = d7Var.f46964f.G;
                if (i7Var != null) {
                    i7Var.O(m7Var.f49973c, m7Var.d, true);
                }
                org.telegram.ui.ActionBar.g1 g1Var = d7Var.f46960a;
                if (g1Var != null) {
                    g1Var.d(true);
                    return;
                }
                return;
            case 8:
                j9 j9Var = (j9) obj2;
                g9 g9Var = (g9) obj;
                ArrayList arrayList = g9Var.f48188b;
                if (arrayList.size() == 1) {
                    TLRPC.User user = (TLRPC.User) arrayList.get(0);
                    TLRPC.UserFull d2 = j9Var.getMessagesController().d2(user.f28641id);
                    j9Var.L = user;
                    boolean z12 = g9Var.f48190e;
                    if (!z12 && (d2 == null || !d2.video_calls_available)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    org.telegram.ui.Components.voip.c2.m(user, z12, z10, j9Var.getParentActivity(), null, j9Var.getAccountInstance());
                    return;
                }
                boolean z13 = g9Var.f48190e;
                HashSet hashSet = new HashSet();
                int size = arrayList.size();
                int i16 = 0;
                while (i16 < size) {
                    Object obj3 = arrayList.get(i16);
                    i16++;
                    hashSet.add(Long.valueOf(((TLRPC.User) obj3).f28641id));
                }
                TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) g9Var.f48189c.get(0)).f28513id;
                org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, j9Var.getParentActivity(), null);
                TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                getgroupcall.call = tL_inputGroupCallInviteMessage;
                getgroupcall.limit = j9Var.getMessagesController().S6;
                t1Var.setOnCancelListener(new p8(j9Var, j9Var.getConnectionsManager().sendRequest(getgroupcall, new o8(j9Var, t1Var, hashSet, tL_inputGroupCallInviteMessage, z13, 1)), 1));
                t1Var.r(600L);
                return;
            case 9:
                xd xdVar = (xd) obj2;
                b51 b51Var = (b51) obj;
                hi.e eVar = xdVar.B0;
                if (view.isEnabled() && !eVar.R) {
                    nd ndVar = xdVar.H0;
                    if (ndVar == null || !ndVar.R) {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        hd hdVar = new hd(xdVar, twoStepVerificationActivity, 0);
                        twoStepVerificationActivity.f43998a0 = 1;
                        twoStepVerificationActivity.f44002c0 = hdVar;
                        eVar.setLoading(true);
                        twoStepVerificationActivity.x0(new id(xdVar, b51Var, twoStepVerificationActivity, 0));
                        return;
                    }
                    return;
                }
                return;
            case 10:
                vf.c.t((Context) obj, ((TL_stats.TL_broadcastRevenueTransactionWithdrawal) obj2).transaction_url);
                return;
            case 11:
                bn bnVar = (bn) obj2;
                if (bnVar.getMediaDataController().a2(((fj) obj).F0())) {
                    bnVar.h8();
                    UndoView undoView = bnVar.N3;
                    if (undoView != null) {
                        long j3 = bnVar.f46271l6;
                        int i17 = UndoView.f33271j0;
                        undoView.j(83, j3, new org.telegram.ui.i4(bnVar, 1));
                    }
                }
                bnVar.P7(true);
                return;
            case 12:
                bn.C1((bn) obj2, (String) obj);
                return;
            case 13:
                bn.p1((bn) obj2, (x60) obj);
                return;
            case 14:
                org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) obj2;
                boolean z14 = !d2Var.b();
                d2Var.c(z14, true);
                ((AtomicBoolean) obj).set(z14);
                return;
            case 15:
                bn.s1((bn) obj2, (Context) obj);
                return;
            case 16:
                rn rnVar = (rn) obj2;
                Context context = (Context) obj;
                h6.o oVar = new h6.o(context, (org.telegram.ui.ActionBar.i6) null);
                ((org.telegram.ui.ActionBar.w2) oVar.f13936b).f30262v0 = false;
                LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
                org.telegram.ui.Cells.o4 o4Var = new org.telegram.ui.Cells.o4(context, n6.f29632n5, 23, 15, false, null);
                o4Var.setHeight(47);
                o4Var.setText(gd.N0(2131752221, "ChatHistory"));
                g10.addView(o4Var);
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                g10.addView(linearLayout, na.o(-1, -2));
                h6[] h6VarArr = new h6[2];
                int i18 = 0;
                while (i18 < i14) {
                    h6 h6Var = new h6(context, true);
                    h6VarArr[i18] = h6Var;
                    h6Var.setTag(Integer.valueOf(i18));
                    u6.Q(h6VarArr[i18], n6.N0(false), r82, u6.M(n6.f29543i6), r82);
                    if (i18 == 0) {
                        h6VarArr[i18].b(gd.N0(2131752216, "ChatHistoryVisible"), gd.N0(2131752215, "ChatHistoryVisibleInfo"), true, !rnVar.K0);
                    } else if (org.telegram.messenger.v3.T(rnVar.f51796x0)) {
                        h6VarArr[i18].b(gd.N0(2131752220, "ChatHistoryHidden"), gd.N0(2131752219, "ChatHistoryHiddenInfo"), false, rnVar.K0);
                    } else {
                        h6VarArr[i18].b(gd.N0(2131752220, "ChatHistoryHidden"), gd.N0(2131752218, "ChatHistoryHiddenInfo2"), false, rnVar.K0);
                    }
                    linearLayout.addView(h6VarArr[i18], na.o(-1, -2));
                    h6VarArr[i18].setOnClickListener(new org.telegram.ui.y(rnVar, h6VarArr, oVar, 8));
                    i18++;
                    i14 = 2;
                    r82 = 0;
                }
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) oVar.f13936b;
                w2Var.O = g10;
                rnVar.showDialog(w2Var);
                return;
            case 17:
                rn.Z((rn) obj2, (FrameLayout) obj, view);
                return;
            case 18:
                np.a0((np) obj2, (h6.o) obj, view);
                return;
            case 19:
                new ug.y0(42, ((org.telegram.ui.Components.m0) obj2).getContext(), (org.telegram.ui.ActionBar.i6) obj).show();
                return;
            case 20:
                final org.telegram.ui.Components.h0 h0Var = (org.telegram.ui.Components.h0) obj2;
                final org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) obj;
                org.telegram.ui.Cells.l3 l3Var = h0Var.X1;
                org.telegram.ui.Cells.l3 l3Var2 = h0Var.W1;
                lp lpVar = h0Var.Z1;
                hi.e eVar2 = h0Var.f35584c2;
                if (!eVar2.R) {
                    if (!eVar2.f14340e0) {
                        if (h0Var.d2 == null) {
                            h0Var.e1();
                            return;
                        }
                        return;
                    }
                    eVar2.setLoading(true);
                    if (h0Var.f35586f2 != null) {
                        TL_aicompose.updateTone updatetone = new TL_aicompose.updateTone();
                        updatetone.flags |= 1;
                        updatetone.display_author = lpVar.f37189a.f32938q;
                        updatetone.tone = TL_aicompose.InputAiComposeTone.from(h0Var.f35586f2);
                        updatetone.flags |= 2;
                        updatetone.emoji_id = h0Var.d2.longValue();
                        updatetone.flags |= 4;
                        updatetone.title = l3Var2.getText().toString();
                        updatetone.flags |= 8;
                        updatetone.prompt = l3Var.getText().toString();
                        ConnectionsManager.getInstance(h0Var.f30223a).sendRequestTyped(updatetone, new d3.b(1), new p10() {
                            @Override
                            public final void a(Object obj4, Object obj5) {
                                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj4;
                                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj5;
                                switch (r3) {
                                    case 0:
                                        h0 h0Var2 = h0Var;
                                        h0Var2.f35584c2.setLoading(false);
                                        if (aiComposeTone != null) {
                                            f fVar = h0Var2.f35588h2;
                                            if (fVar != null) {
                                                fVar.a(aiComposeTone);
                                            }
                                            h0Var2.dismiss();
                                            return;
                                        } else if (tL_error != null) {
                                            org.telegram.ui.Cells.c0.t(h0Var2.f35583b2, i6Var2, tL_error, false);
                                            return;
                                        } else {
                                            return;
                                        }
                                    default:
                                        h0 h0Var3 = h0Var;
                                        FrameLayout frameLayout = h0Var3.f35583b2;
                                        h0Var3.f35584c2.setLoading(false);
                                        if (aiComposeTone != null) {
                                            h0Var3.dismiss();
                                            f fVar2 = h0Var3.f35587g2;
                                            if (fVar2 != null) {
                                                fVar2.a(aiComposeTone);
                                                return;
                                            }
                                            return;
                                        } else if (tL_error != null) {
                                            boolean equalsIgnoreCase = "TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error.text);
                                            org.telegram.ui.ActionBar.i6 i6Var3 = i6Var2;
                                            if (equalsIgnoreCase) {
                                                m0.z1(new kc(frameLayout, i6Var3), h0Var3.f30223a);
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
                    createtone.display_author = lpVar.f37189a.f32938q;
                    createtone.emoji_id = h0Var.d2.longValue();
                    createtone.title = l3Var2.getText().toString();
                    createtone.prompt = l3Var.getText().toString();
                    ConnectionsManager.getInstance(h0Var.f30223a).sendRequestTyped(createtone, new d3.b(1), new p10() {
                        @Override
                        public final void a(Object obj4, Object obj5) {
                            TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj4;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj5;
                            switch (r3) {
                                case 0:
                                    h0 h0Var2 = h0Var;
                                    h0Var2.f35584c2.setLoading(false);
                                    if (aiComposeTone != null) {
                                        f fVar = h0Var2.f35588h2;
                                        if (fVar != null) {
                                            fVar.a(aiComposeTone);
                                        }
                                        h0Var2.dismiss();
                                        return;
                                    } else if (tL_error != null) {
                                        org.telegram.ui.Cells.c0.t(h0Var2.f35583b2, i6Var2, tL_error, false);
                                        return;
                                    } else {
                                        return;
                                    }
                                default:
                                    h0 h0Var3 = h0Var;
                                    FrameLayout frameLayout = h0Var3.f35583b2;
                                    h0Var3.f35584c2.setLoading(false);
                                    if (aiComposeTone != null) {
                                        h0Var3.dismiss();
                                        f fVar2 = h0Var3.f35587g2;
                                        if (fVar2 != null) {
                                            fVar2.a(aiComposeTone);
                                            return;
                                        }
                                        return;
                                    } else if (tL_error != null) {
                                        boolean equalsIgnoreCase = "TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error.text);
                                        org.telegram.ui.ActionBar.i6 i6Var3 = i6Var2;
                                        if (equalsIgnoreCase) {
                                            m0.z1(new kc(frameLayout, i6Var3), h0Var3.f30223a);
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
            case 21:
                ((w10) obj2).a((TL_aicompose.AiComposeTone) obj);
                return;
            case 22:
                org.telegram.ui.ActionBar.q0 q0Var = (org.telegram.ui.ActionBar.q0) obj2;
                org.telegram.ui.Components.y4 y4Var = (org.telegram.ui.Components.y4) obj;
                q0Var.V(null, null);
                q0Var.P(y4Var.d, false);
                q0Var.setupPopupRadialSelectors(y4Var.f42320f);
                q0Var.I(y4Var.f42319e);
                return;
            case 23:
                boolean[] zArr = (boolean[]) obj2;
                boolean z15 = !zArr[0];
                zArr[0] = z15;
                ((org.telegram.ui.Cells.d2) view).c(z15, true);
                ((xn) obj).run();
                return;
            case 24:
                int intValue = ((Integer) view.getTag()).intValue();
                ((AlertDialog$Builder) obj2).f28835a.M0.run();
                ((ct) obj).onClick(null, intValue);
                return;
            case 25:
                ((org.telegram.ui.ActionBar.w2) ((h6.o) obj2).f13936b).f30268y0.run();
                ((w10) obj).a(null);
                return;
            case 26:
                ((boolean[]) obj2)[0] = true;
                ((Runnable) obj).run();
                return;
            case 27:
                e8 e8Var = (e8) obj2;
                float[] fArr = (float[]) obj;
                float f10 = MediaController.B().f22829r0;
                int i19 = 0;
                while (true) {
                    if (i19 < 3) {
                        if (f10 - 0.1f <= fArr[i19]) {
                            i13 = i19;
                        } else {
                            i19++;
                        }
                    }
                }
                int i20 = i13 + 1;
                if (i20 >= 3) {
                    i20 = 0;
                }
                MediaController.B().m0(true, fArr[i20]);
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - e8Var.K2 > 300) {
                    int i21 = mp.h1().getInt("speedhint", 0) + 1;
                    if (i21 > 2) {
                        i21 = -10;
                    }
                    mp.h1().edit().putInt("speedhint", i21).apply();
                    if (i21 >= 0 && e8Var.f30226b != null) {
                        ?? j30Var = new j30(5, e8Var.getContext(), null, false);
                        e8Var.J2 = j30Var;
                        j30Var.setExtraTranslationY(org.telegram.messenger.g0.L(6.0f));
                        e8Var.J2.setText(gd.N0(2131745028, null));
                        e8Var.f34626y1.addView(e8Var.J2, na.d(-2, -2.0f, 48, 0.0f, 0.0f, 6.0f, 0.0f));
                        e8Var.J2.c(e8Var.P1);
                    }
                }
                e8Var.K2 = currentTimeMillis;
                return;
            case 28:
                e8 e8Var2 = (e8) obj2;
                e8Var2.getClass();
                ((x60) obj).v();
                e8Var2.Q0(6);
                return;
            default:
                b90 b90Var = (b90) obj;
                e8 e8Var3 = (e8) ((w7) obj2).G;
                int i22 = e8Var3.f30223a;
                LaunchActivity launchActivity = e8Var3.A2;
                ArrayList arrayList2 = (ArrayList) mp.u1(i22).f25884w.get(0);
                if (arrayList2 != null) {
                    i10 = arrayList2.size();
                } else {
                    i10 = 0;
                }
                if (i10 > 10 && !TextUtils.isEmpty(b90Var.getText().toString())) {
                    String charSequence = b90Var.getText().toString();
                    if (launchActivity.M().getLastFragment() instanceof bx) {
                        bx bxVar = (bx) launchActivity.M().getLastFragment();
                        ArrayList arrayList3 = (ArrayList) bxVar.getMessagesController().f25884w.get(0);
                        if (arrayList3 != null) {
                            i11 = arrayList3.size();
                        } else {
                            i11 = 0;
                        }
                        if (!bxVar.f46588n2 && (i11 > 10 || bxVar.L)) {
                            z11 = false;
                        }
                        if (!z11) {
                            if (!bxVar.f46579l2) {
                                bxVar.f46644y = 3;
                                bxVar.Y.f33883r.setText(charSequence);
                                bxVar.Y.f33883r.setSelection(charSequence.length());
                            } else {
                                bxVar.Y.f33883r.setText(charSequence);
                                bxVar.Y.f33883r.setSelection(charSequence.length());
                                jw jwVar = bxVar.D0;
                                if (jwVar != null && (L = jwVar.L(3)) >= 0 && bxVar.D0.getTabsView().getCurrentTabId() != L) {
                                    bxVar.D0.getTabsView().e(L, L);
                                }
                            }
                            e8Var3.dismiss();
                            return;
                        }
                    }
                    bx bxVar2 = new bx(null);
                    bxVar2.f46597p2 = charSequence;
                    bxVar2.f46644y = 3;
                    launchActivity.u0(bxVar2, false, false);
                    e8Var3.dismiss();
                    return;
                }
                return;
        }
    }

    public i1(Context context, TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal) {
        this.f22239a = 10;
        this.f22241c = context;
        this.f22240b = tL_broadcastRevenueTransactionWithdrawal;
    }
}
