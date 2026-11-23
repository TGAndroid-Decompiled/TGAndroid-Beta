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
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.j6;
import org.telegram.messenger.np;
import org.telegram.messenger.r10;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.e90;
import org.telegram.ui.Components.f8;
import org.telegram.ui.Components.m30;
import org.telegram.ui.Components.mu0;
import org.telegram.ui.Components.op;
import org.telegram.ui.Components.x7;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bn;
import org.telegram.ui.c51;
import org.telegram.ui.c7;
import org.telegram.ui.cx;
import org.telegram.ui.dt;
import org.telegram.ui.f9;
import org.telegram.ui.h7;
import org.telegram.ui.i9;
import org.telegram.ui.id;
import org.telegram.ui.jg0;
import org.telegram.ui.kw;
import org.telegram.ui.l7;
import org.telegram.ui.n8;
import org.telegram.ui.nd;
import org.telegram.ui.o8;
import org.telegram.ui.p50;
import org.telegram.ui.rn;
import org.telegram.ui.v6;
import org.telegram.ui.x6;
import org.telegram.ui.xd;
import org.telegram.ui.xn;
public final class h1 implements View.OnClickListener {
    public final int f22109a;
    public final Object f22110b;
    public final Object f22111c;

    public h1(int i7, Object obj, Object obj2) {
        this.f22109a = i7;
        this.f22110b = obj;
        this.f22111c = obj2;
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
        int i7;
        int i10;
        int J;
        int i11 = this.f22109a;
        int i12 = -1;
        int i13 = 2;
        ?? r72 = 0;
        boolean z11 = true;
        Object obj = this.f22111c;
        Object obj2 = this.f22110b;
        switch (i11) {
            case 0:
                a2.c0((a2) obj2, (Context) obj, view);
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
                if (!g4Var.f47908i0.B0) {
                    org.telegram.ui.k3 k3Var = g4Var.f47920v0[0];
                    if (k3Var.f()) {
                        if (k3Var.getWebView() != null && !g4Var.f47908i0.f53139a0) {
                            if (g4Var.f47909j0 != null) {
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
                                org.telegram.ui.web.k kVar = g4Var.f47909j0;
                                if (webView != null) {
                                    bitmap = webView.getFavicon();
                                } else {
                                    bitmap = null;
                                }
                                if (TextUtils.isEmpty(str)) {
                                    str = hd.N0(2131742662, null);
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
                                i6 i6Var = kVar.f53183x;
                                ImageView imageView = kVar.f53178f;
                                if (bitmap == null) {
                                    imageView.setImageResource(2131232196);
                                    imageView.setColorFilter(new PorterDuffColorFilter(kVar.I, PorterDuff.Mode.SRC_IN));
                                    r12 = 0;
                                } else {
                                    imageView.setImageDrawable(new BitmapDrawable(kVar.getContext().getResources(), bitmap));
                                    r12 = 0;
                                    imageView.setColorFilter((ColorFilter) null);
                                }
                                TextView textView = kVar.f53180r;
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
                                TextView textView2 = kVar.f53181s;
                                textView2.setText(j6.m(str4, textView2.getPaint().getFontMetricsInt(), false, null, 0));
                                kVar.M = xVar;
                                kVar.N = qVar;
                                kVar.O = qVar2;
                                kVar.f53177e.setOnClickListener(new jg0(24, kVar, wVar));
                                kVar.f53179n.setOnClickListener(yVar);
                                kVar.f53175b = false;
                                kVar.setInput(null);
                                i6Var.f35742g3.O(true);
                                i6Var.v0(0);
                            }
                            org.telegram.ui.l0 l0Var = g4Var.f47908i0;
                            li.d dVar = new li.d(9, k3Var, activity);
                            di.q qVar3 = l0Var.f53143c0;
                            qVar3.setText("");
                            qVar3.setSelection(0, qVar3.getText().length());
                            qVar3.setScrollX(0);
                            l0Var.f53168w0 = dVar;
                            l0Var.k(true);
                            return;
                        }
                        return;
                    } else if (t3Var != null) {
                        mu0 mu0Var = new mu0(activity);
                        mu0Var.f59055a = 1;
                        mu0Var.f37599s = -org.telegram.messenger.g0.L(32.0f);
                        k3Var.d.w0(mu0Var);
                        return;
                    } else {
                        k3Var.f49136b.y0(0);
                        return;
                    }
                }
                return;
            case 4:
                org.telegram.ui.a1 a1Var = (org.telegram.ui.a1) obj2;
                p50 p50Var = (p50) obj;
                if (a1Var.h == 0) {
                    a1Var.a(1, true);
                    int i14 = ((org.telegram.ui.g4) p50Var).Y;
                    TLRPC.Chat chat = p50Var.f50729n;
                    TLRPC.TL_channels_joinChannel tL_channels_joinChannel = new TLRPC.TL_channels_joinChannel();
                    tL_channels_joinChannel.channel = np.k1(chat);
                    ConnectionsManager.getInstance(i14).sendRequestTyped(tL_channels_joinChannel, new di.j0(a1Var, i14, tL_channels_joinChannel, chat, 4));
                    return;
                }
                return;
            case 5:
                org.telegram.ui.b5 b5Var = (org.telegram.ui.b5) obj2;
                b5Var.b(false);
                b5Var.f45733e.c((org.telegram.ui.c5) obj);
                return;
            case 6:
                ((x6) ((v6) obj2).f52715f).x0((org.telegram.ui.Cells.d2) obj);
                return;
            case 7:
                c7 c7Var = (c7) obj2;
                l7 l7Var = (l7) obj;
                h7 h7Var = c7Var.f46460f.G;
                if (h7Var != null) {
                    h7Var.m(l7Var.f49488c, l7Var.d, true);
                }
                org.telegram.ui.ActionBar.g1 g1Var = c7Var.f46456a;
                if (g1Var != null) {
                    g1Var.d(true);
                    return;
                }
                return;
            case 8:
                i9 i9Var = (i9) obj2;
                f9 f9Var = (f9) obj;
                ArrayList arrayList = f9Var.f47607b;
                if (arrayList.size() == 1) {
                    TLRPC.User user = (TLRPC.User) arrayList.get(0);
                    TLRPC.UserFull d2 = i9Var.getMessagesController().d2(user.f28547id);
                    i9Var.L = user;
                    boolean z12 = f9Var.f47609e;
                    if (!z12 && (d2 == null || !d2.video_calls_available)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    org.telegram.ui.Components.voip.b2.m(user, z12, z10, i9Var.getParentActivity(), null, i9Var.getAccountInstance());
                    return;
                }
                boolean z13 = f9Var.f47609e;
                HashSet hashSet = new HashSet();
                int size = arrayList.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj3 = arrayList.get(i15);
                    i15++;
                    hashSet.add(Long.valueOf(((TLRPC.User) obj3).f28547id));
                }
                TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) f9Var.f47608c.get(0)).f28419id;
                org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, i9Var.getParentActivity(), null);
                TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                getgroupcall.call = tL_inputGroupCallInviteMessage;
                getgroupcall.limit = i9Var.getMessagesController().S6;
                t1Var.setOnCancelListener(new o8(i9Var, i9Var.getConnectionsManager().sendRequest(getgroupcall, new n8(i9Var, t1Var, hashSet, tL_inputGroupCallInviteMessage, z13, 1)), 1));
                t1Var.r(600L);
                return;
            case 9:
                xd xdVar = (xd) obj2;
                c51 c51Var = (c51) obj;
                hi.d dVar2 = xdVar.B0;
                if (view.isEnabled() && !dVar2.R) {
                    nd ndVar = xdVar.H0;
                    if (ndVar == null || !ndVar.R) {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        org.telegram.ui.hd hdVar = new org.telegram.ui.hd(xdVar, twoStepVerificationActivity, 0);
                        twoStepVerificationActivity.f43882a0 = 1;
                        twoStepVerificationActivity.f43886c0 = hdVar;
                        dVar2.setLoading(true);
                        twoStepVerificationActivity.x0(new id(xdVar, c51Var, twoStepVerificationActivity, 0));
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
                if (bnVar.getMediaDataController().a2(((gj) obj).F0())) {
                    bnVar.h8();
                    UndoView undoView = bnVar.N3;
                    if (undoView != null) {
                        long j3 = bnVar.f46056l6;
                        int i16 = UndoView.f33173j0;
                        undoView.j(83, j3, new org.telegram.ui.i4(bnVar, 1));
                    }
                }
                bnVar.P7(true);
                return;
            case 12:
                bn.C1((bn) obj2, (String) obj);
                return;
            case 13:
                bn.p1((bn) obj2, (a70) obj);
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
                hi.x4 x4Var = new hi.x4(context, (h6) null);
                ((org.telegram.ui.ActionBar.w2) x4Var.f15680b).f30178v0 = false;
                LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
                org.telegram.ui.Cells.o4 o4Var = new org.telegram.ui.Cells.o4(context, m6.f29528n5, 23, 15, false, null);
                o4Var.setHeight(47);
                o4Var.setText(hd.N0(2131752221, "ChatHistory"));
                g10.addView(o4Var);
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                g10.addView(linearLayout, na.o(-1, -2));
                org.telegram.ui.Cells.i6[] i6VarArr = new org.telegram.ui.Cells.i6[2];
                int i17 = 0;
                while (i17 < i13) {
                    org.telegram.ui.Cells.i6 i6Var2 = new org.telegram.ui.Cells.i6(context, true);
                    i6VarArr[i17] = i6Var2;
                    i6Var2.setTag(Integer.valueOf(i17));
                    t6.Q(i6VarArr[i17], m6.N0(false), r72, t6.M(m6.f29439i6), r72);
                    if (i17 == 0) {
                        i6VarArr[i17].b(hd.N0(2131752216, "ChatHistoryVisible"), hd.N0(2131752215, "ChatHistoryVisibleInfo"), true, !rnVar.K0);
                    } else if (org.telegram.messenger.v3.T(rnVar.f51707x0)) {
                        i6VarArr[i17].b(hd.N0(2131752220, "ChatHistoryHidden"), hd.N0(2131752219, "ChatHistoryHiddenInfo"), false, rnVar.K0);
                    } else {
                        i6VarArr[i17].b(hd.N0(2131752220, "ChatHistoryHidden"), hd.N0(2131752218, "ChatHistoryHiddenInfo2"), false, rnVar.K0);
                    }
                    linearLayout.addView(i6VarArr[i17], na.o(-1, -2));
                    i6VarArr[i17].setOnClickListener(new org.telegram.ui.y(rnVar, i6VarArr, x4Var, 8));
                    i17++;
                    i13 = 2;
                    r72 = 0;
                }
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) x4Var.f15680b;
                w2Var.O = g10;
                rnVar.showDialog(w2Var);
                return;
            case 17:
                rn.Z((rn) obj2, (FrameLayout) obj, view);
                return;
            case 18:
                org.telegram.ui.np.a0((org.telegram.ui.np) obj2, (hi.x4) obj, view);
                return;
            case 19:
                new ug.y0(42, ((org.telegram.ui.Components.n0) obj2).getContext(), (h6) obj).show();
                return;
            case 20:
                final org.telegram.ui.Components.i0 i0Var = (org.telegram.ui.Components.i0) obj2;
                final h6 h6Var = (h6) obj;
                org.telegram.ui.Cells.l3 l3Var = i0Var.X1;
                org.telegram.ui.Cells.l3 l3Var2 = i0Var.W1;
                op opVar = i0Var.Z1;
                hi.d dVar3 = i0Var.f36014c2;
                if (!dVar3.R) {
                    if (!dVar3.f14303e0) {
                        if (i0Var.d2 == null) {
                            i0Var.e1();
                            return;
                        }
                        return;
                    }
                    dVar3.setLoading(true);
                    if (i0Var.f36016f2 != null) {
                        TL_aicompose.updateTone updatetone = new TL_aicompose.updateTone();
                        updatetone.flags |= 1;
                        updatetone.display_author = opVar.f38291a.f32840q;
                        updatetone.tone = TL_aicompose.InputAiComposeTone.from(i0Var.f36016f2);
                        updatetone.flags |= 2;
                        updatetone.emoji_id = i0Var.d2.longValue();
                        updatetone.flags |= 4;
                        updatetone.title = l3Var2.getText().toString();
                        updatetone.flags |= 8;
                        updatetone.prompt = l3Var.getText().toString();
                        ConnectionsManager.getInstance(i0Var.f30139a).sendRequestTyped(updatetone, new d3.b(1), new r10() {
                            @Override
                            public final void a(Object obj4, Object obj5) {
                                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj4;
                                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj5;
                                switch (r3) {
                                    case 0:
                                        i0 i0Var2 = i0Var;
                                        i0Var2.f36014c2.setLoading(false);
                                        if (aiComposeTone != null) {
                                            f fVar = i0Var2.f36018h2;
                                            if (fVar != null) {
                                                fVar.a(aiComposeTone);
                                            }
                                            i0Var2.dismiss();
                                            return;
                                        } else if (tL_error != null) {
                                            org.telegram.ui.Cells.c0.t(i0Var2.f36013b2, h6Var, tL_error, false);
                                            return;
                                        } else {
                                            return;
                                        }
                                    default:
                                        i0 i0Var3 = i0Var;
                                        FrameLayout frameLayout = i0Var3.f36013b2;
                                        i0Var3.f36014c2.setLoading(false);
                                        if (aiComposeTone != null) {
                                            i0Var3.dismiss();
                                            f fVar2 = i0Var3.f36017g2;
                                            if (fVar2 != null) {
                                                fVar2.a(aiComposeTone);
                                                return;
                                            }
                                            return;
                                        } else if (tL_error != null) {
                                            boolean equalsIgnoreCase = "TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error.text);
                                            org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
                                            if (equalsIgnoreCase) {
                                                n0.z1(new lc(frameLayout, h6Var2), i0Var3.f30139a);
                                                return;
                                            } else {
                                                org.telegram.ui.Cells.c0.t(frameLayout, h6Var2, tL_error, false);
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
                    createtone.display_author = opVar.f38291a.f32840q;
                    createtone.emoji_id = i0Var.d2.longValue();
                    createtone.title = l3Var2.getText().toString();
                    createtone.prompt = l3Var.getText().toString();
                    ConnectionsManager.getInstance(i0Var.f30139a).sendRequestTyped(createtone, new d3.b(1), new r10() {
                        @Override
                        public final void a(Object obj4, Object obj5) {
                            TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj4;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj5;
                            switch (r3) {
                                case 0:
                                    i0 i0Var2 = i0Var;
                                    i0Var2.f36014c2.setLoading(false);
                                    if (aiComposeTone != null) {
                                        f fVar = i0Var2.f36018h2;
                                        if (fVar != null) {
                                            fVar.a(aiComposeTone);
                                        }
                                        i0Var2.dismiss();
                                        return;
                                    } else if (tL_error != null) {
                                        org.telegram.ui.Cells.c0.t(i0Var2.f36013b2, h6Var, tL_error, false);
                                        return;
                                    } else {
                                        return;
                                    }
                                default:
                                    i0 i0Var3 = i0Var;
                                    FrameLayout frameLayout = i0Var3.f36013b2;
                                    i0Var3.f36014c2.setLoading(false);
                                    if (aiComposeTone != null) {
                                        i0Var3.dismiss();
                                        f fVar2 = i0Var3.f36017g2;
                                        if (fVar2 != null) {
                                            fVar2.a(aiComposeTone);
                                            return;
                                        }
                                        return;
                                    } else if (tL_error != null) {
                                        boolean equalsIgnoreCase = "TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error.text);
                                        org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
                                        if (equalsIgnoreCase) {
                                            n0.z1(new lc(frameLayout, h6Var2), i0Var3.f30139a);
                                            return;
                                        } else {
                                            org.telegram.ui.Cells.c0.t(frameLayout, h6Var2, tL_error, false);
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
                ((y10) obj2).a((TL_aicompose.AiComposeTone) obj);
                return;
            case 22:
                org.telegram.ui.ActionBar.q0 q0Var = (org.telegram.ui.ActionBar.q0) obj2;
                org.telegram.ui.Components.z4 z4Var = (org.telegram.ui.Components.z4) obj;
                q0Var.V(null, null);
                q0Var.P(z4Var.d, false);
                q0Var.setupPopupRadialSelectors(z4Var.f42632f);
                q0Var.I(z4Var.f42631e);
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
                ((AlertDialog$Builder) obj2).f28743a.M0.run();
                ((dt) obj).onClick(null, intValue);
                return;
            case 25:
                ((org.telegram.ui.ActionBar.w2) ((hi.x4) obj2).f15680b).f30184y0.run();
                ((y10) obj).a(null);
                return;
            case 26:
                ((boolean[]) obj2)[0] = true;
                ((Runnable) obj).run();
                return;
            case 27:
                f8 f8Var = (f8) obj2;
                float[] fArr = (float[]) obj;
                float f10 = MediaController.B().f22726r0;
                int i18 = 0;
                while (true) {
                    if (i18 < 3) {
                        if (f10 - 0.1f <= fArr[i18]) {
                            i12 = i18;
                        } else {
                            i18++;
                        }
                    }
                }
                int i19 = i12 + 1;
                if (i19 >= 3) {
                    i19 = 0;
                }
                MediaController.B().m0(true, fArr[i19]);
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - f8Var.K2 > 300) {
                    int i20 = np.h1().getInt("speedhint", 0) + 1;
                    if (i20 > 2) {
                        i20 = -10;
                    }
                    np.h1().edit().putInt("speedhint", i20).apply();
                    if (i20 >= 0 && f8Var.f30142b != null) {
                        ?? m30Var = new m30(5, f8Var.getContext(), null, false);
                        f8Var.J2 = m30Var;
                        m30Var.setExtraTranslationY(org.telegram.messenger.g0.L(6.0f));
                        f8Var.J2.setText(hd.N0(2131745028, null));
                        f8Var.f35120y1.addView(f8Var.J2, na.d(-2, -2.0f, 48, 0.0f, 0.0f, 6.0f, 0.0f));
                        f8Var.J2.c(f8Var.P1);
                    }
                }
                f8Var.K2 = currentTimeMillis;
                return;
            case 28:
                f8 f8Var2 = (f8) obj2;
                f8Var2.getClass();
                ((a70) obj).v();
                f8Var2.Q0(6);
                return;
            default:
                e90 e90Var = (e90) obj;
                f8 f8Var3 = (f8) ((x7) obj2).G;
                int i21 = f8Var3.f30139a;
                LaunchActivity launchActivity = f8Var3.A2;
                ArrayList arrayList2 = (ArrayList) np.u1(i21).f25952w.get(0);
                if (arrayList2 != null) {
                    i7 = arrayList2.size();
                } else {
                    i7 = 0;
                }
                if (i7 > 10 && !TextUtils.isEmpty(e90Var.getText().toString())) {
                    String charSequence = e90Var.getText().toString();
                    if (launchActivity.M().getLastFragment() instanceof cx) {
                        cx cxVar = (cx) launchActivity.M().getLastFragment();
                        ArrayList arrayList3 = (ArrayList) cxVar.getMessagesController().f25952w.get(0);
                        if (arrayList3 != null) {
                            i10 = arrayList3.size();
                        } else {
                            i10 = 0;
                        }
                        if (!cxVar.f46722n2 && (i10 > 10 || cxVar.L)) {
                            z11 = false;
                        }
                        if (!z11) {
                            if (!cxVar.f46713l2) {
                                cxVar.f46778y = 3;
                                cxVar.Y.f34632r.setText(charSequence);
                                cxVar.Y.f34632r.setSelection(charSequence.length());
                            } else {
                                cxVar.Y.f34632r.setText(charSequence);
                                cxVar.Y.f34632r.setSelection(charSequence.length());
                                kw kwVar = cxVar.D0;
                                if (kwVar != null && (J = kwVar.J(3)) >= 0 && cxVar.D0.getTabsView().getCurrentTabId() != J) {
                                    cxVar.D0.getTabsView().e(J, J);
                                }
                            }
                            f8Var3.dismiss();
                            return;
                        }
                    }
                    cx cxVar2 = new cx(null);
                    cxVar2.f46731p2 = charSequence;
                    cxVar2.f46778y = 3;
                    launchActivity.u0(cxVar2, false, false);
                    f8Var3.dismiss();
                    return;
                }
                return;
        }
    }

    public h1(Context context, TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal) {
        this.f22109a = 10;
        this.f22111c = context;
        this.f22110b = tL_broadcastRevenueTransactionWithdrawal;
    }
}
