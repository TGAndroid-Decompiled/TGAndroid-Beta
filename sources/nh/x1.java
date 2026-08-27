package nh;

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
import h7.z5;
import java.io.File;
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
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.f6;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.w4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.c5;
import org.telegram.ui.d5;
import org.telegram.ui.d70;
import org.telegram.ui.dq;
import org.telegram.ui.e7;
import org.telegram.ui.f9;
import org.telegram.ui.fe;
import org.telegram.ui.i7;
import org.telegram.ui.j9;
import org.telegram.ui.jo;
import org.telegram.ui.m7;
import org.telegram.ui.o8;
import org.telegram.ui.od;
import org.telegram.ui.p8;
import org.telegram.ui.pd;
import org.telegram.ui.q91;
import org.telegram.ui.rn;
import org.telegram.ui.wd;
import org.telegram.ui.x6;

public final class x1 implements View.OnClickListener {

    public final int f19044a;

    public final Object f19045b;

    public final Object f19046c;

    public x1(int i10, Object obj, Object obj2) {
        this.f19044a = i10;
        this.f19045b = obj;
        this.f19046c = obj2;
    }

    @Override
    public final void onClick(View view) {
        String strDecode;
        int i10 = this.f19044a;
        int i11 = 0;
        int i12 = 1;
        Object obj = this.f19046c;
        Object obj2 = this.f19045b;
        switch (i10) {
            case 0:
                b3 b3Var = (b3) obj2;
                i0 i0Var = (i0) obj;
                if (i0Var.c()) {
                    i0Var.a();
                } else {
                    File file = i0Var.d;
                    if (file != null && file.exists()) {
                        File file2 = i0Var.d;
                        AndroidUtilities.openForView(file2, file2.getName(), null, LaunchActivity.C1, null, true);
                    }
                }
                b70 b70Var = b3Var.G0;
                if (b70Var != null) {
                    b70Var.u();
                    b3Var.G0 = null;
                }
                break;
            case 1:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
                ((org.telegram.ui.ActionBar.e3) obj2).dismiss();
                org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                if (n2VarU != null) {
                    n2VarU.presentFragment(ProfileActivity.m4(connectedbotstarref.bot_id));
                }
                break;
            case 2:
                ((VideoAds) obj2).lambda$show$2((VideoAds.CloseDrawable) obj, view);
                break;
            case 3:
                ((VideoAds) obj2).lambda$show$18((TLRPC.TL_sponsoredMessage) obj, view);
                break;
            case 4:
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) obj2;
                org.telegram.ui.ActionBar.u0 u0Var = (org.telegram.ui.ActionBar.u0) obj;
                int iIndexOf = v0Var.f23857c0.indexOf(u0Var.getFilter());
                if (v0Var.f23858d0 != iIndexOf) {
                    v0Var.f23858d0 = iIndexOf;
                    v0Var.y();
                } else if (u0Var.getFilter().h) {
                    if (u0Var.f23813a.f48498f) {
                        pf.e0 filter = u0Var.getFilter();
                        v0Var.C(filter);
                        e5 e5Var = v0Var.D;
                        if (e5Var != null) {
                            e5Var.o(filter);
                            v0Var.D.q(v0Var.f23859e);
                        }
                    } else {
                        u0Var.setSelectedForDelete(true);
                    }
                }
                break;
            case 5:
                org.telegram.ui.ActionBar.t0 t0Var = (org.telegram.ui.ActionBar.t0) obj2;
                org.telegram.ui.ActionBar.v0 v0Var2 = (org.telegram.ui.ActionBar.v0) obj;
                org.telegram.ui.ActionBar.n1 n1Var = v0Var2.d;
                if (n1Var != null && n1Var.isShowing() && t0Var.f23772f) {
                    if (!v0Var2.P) {
                        v0Var2.P = true;
                        v0Var2.d.d(v0Var2.N);
                    }
                }
                org.telegram.ui.ActionBar.z zVar = v0Var2.f23856c;
                if (zVar != null) {
                    zVar.o(((Integer) view.getTag()).intValue());
                } else {
                    org.telegram.ui.ActionBar.r0 r0Var = v0Var2.L;
                    if (r0Var != null) {
                        r0Var.h(((Integer) view.getTag()).intValue());
                    }
                }
                break;
            case 6:
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj2;
                if (!((org.telegram.ui.ActionBar.w1) obj).f23510a) {
                    org.telegram.ui.ActionBar.a2 a2Var = b2Var.f22755i0;
                    if (a2Var != null) {
                        a2Var.f(b2Var, -1);
                    }
                    if (b2Var.f22748d0) {
                        b2Var.dismiss();
                    }
                    break;
                }
                break;
            case 7:
                org.telegram.ui.ActionBar.b2 b2Var2 = (org.telegram.ui.ActionBar.b2) obj2;
                if (!((org.telegram.ui.ActionBar.w1) obj).f23510a) {
                    org.telegram.ui.ActionBar.a2 a2Var2 = b2Var2.f22757k0;
                    if (a2Var2 != null) {
                        a2Var2.f(b2Var2, -2);
                    }
                    if (b2Var2.f22748d0) {
                        b2Var2.cancel();
                    }
                    break;
                }
                break;
            case 8:
                org.telegram.ui.ActionBar.b2 b2Var3 = (org.telegram.ui.ActionBar.b2) obj2;
                if (!((org.telegram.ui.ActionBar.w1) obj).f23510a) {
                    org.telegram.ui.ActionBar.a2 a2Var3 = b2Var3.f22761o0;
                    if (a2Var3 != null) {
                        a2Var3.f(b2Var3, -2);
                    }
                    if (b2Var3.f22748d0) {
                        b2Var3.dismiss();
                    }
                    break;
                }
                break;
            case 9:
                org.telegram.ui.ActionBar.b2 b2Var4 = (org.telegram.ui.ActionBar.b2) obj2;
                if (!((org.telegram.ui.ActionBar.w1) obj).f23510a) {
                    rh.w3 w3Var = b2Var4.m0;
                    if (w3Var != null) {
                        w3Var.f(b2Var4, -2);
                    }
                    if (b2Var4.f22748d0) {
                        b2Var4.cancel();
                    }
                    break;
                }
                break;
            case 10:
                org.telegram.ui.m4 m4Var = (org.telegram.ui.m4) obj2;
                Activity activity = (Activity) obj;
                org.telegram.ui.z3 z3Var = m4Var.G;
                if (!m4Var.f40335d0.f43987w0) {
                    org.telegram.ui.q3 q3Var = m4Var.f40347q0[0];
                    if (!q3Var.f()) {
                        if (z3Var != null) {
                            iv0 iv0Var = new iv0(activity);
                            iv0Var.f5731a = 1;
                            iv0Var.f29501s = -AndroidUtilities.dp(32.0f);
                            q3Var.d.w0(iv0Var);
                        } else {
                            q3Var.f41496b.x0(0);
                        }
                        break;
                    } else if (q3Var.getWebView() != null && !m4Var.f40335d0.S) {
                        if (m4Var.f40336e0 != null) {
                            org.telegram.ui.web.w0 webView = q3Var.getWebView();
                            String title = webView != null ? webView.getTitle() : null;
                            String strS = org.telegram.ui.web.z0.s(webView != null ? webView.getUrl() : null);
                            org.telegram.ui.web.l lVar = m4Var.f40336e0;
                            Bitmap favicon = webView != null ? webView.getFavicon() : null;
                            if (TextUtils.isEmpty(title)) {
                                title = LocaleController.getString(R.string.WebEmpty);
                            }
                            String strV = TextUtils.isEmpty(strS) ? "about:blank" : strS;
                            org.telegram.ui.a0 a0Var = new org.telegram.ui.a0(m4Var, strS, i11);
                            org.telegram.ui.b0 b0Var = new org.telegram.ui.b0(m4Var, q3Var, activity, i11);
                            org.telegram.ui.s sVar = new org.telegram.ui.s(m4Var, i12);
                            org.telegram.ui.s sVar2 = new org.telegram.ui.s(m4Var, 2);
                            org.telegram.ui.c0 c0Var = new org.telegram.ui.c0(m4Var, strS, q3Var, i11);
                            org.telegram.ui.web.d dVar = lVar.f43900w;
                            ImageView imageView = lVar.f43896f;
                            if (favicon == null) {
                                imageView.setImageResource(R.drawable.msg_language);
                                imageView.setColorFilter(new PorterDuffColorFilter(lVar.D, PorterDuff.Mode.SRC_IN));
                            } else {
                                imageView.setImageDrawable(new BitmapDrawable(lVar.getContext().getResources(), favicon));
                                imageView.setColorFilter((ColorFilter) null);
                            }
                            TextView textView = lVar.f43898r;
                            textView.setText(Emoji.replaceEmoji(title, textView.getPaint().getFontMetricsInt(), false));
                            try {
                                try {
                                    Uri uri = Uri.parse(strV);
                                    strV = we.e.v(uri, null, null, we.e.a(uri.getHost()), null);
                                } catch (Exception e9) {
                                    FileLog.e((Throwable) e9, false);
                                }
                                strDecode = URLDecoder.decode(strV.replaceAll("\\+", "%2b"), "UTF-8");
                            } catch (Exception e10) {
                                FileLog.e(e10);
                                strDecode = strV;
                            }
                            TextView textView2 = lVar.f43899s;
                            textView2.setText(Emoji.replaceEmoji(strDecode, textView2.getPaint().getFontMetricsInt(), false));
                            lVar.H = b0Var;
                            lVar.I = sVar;
                            lVar.J = sVar2;
                            lVar.f43895e.setOnClickListener(new org.telegram.ui.web.c(0, lVar, a0Var));
                            lVar.f43897n.setOnClickListener(c0Var);
                            lVar.f43893b = false;
                            lVar.setInput(null);
                            dVar.U2.N(true);
                            dVar.u0(0);
                        }
                        org.telegram.ui.o0 o0Var = m4Var.f40335d0;
                        gh.d1 d1Var = new gh.d1(29, q3Var, activity);
                        hh.o oVar = o0Var.U;
                        oVar.setText("");
                        oVar.setSelection(0, oVar.getText().length());
                        oVar.setScrollX(0);
                        o0Var.f43980r0 = d1Var;
                        o0Var.k(true);
                        break;
                    }
                }
                break;
            case 11:
                org.telegram.ui.g1 g1Var = (org.telegram.ui.g1) obj2;
                d70 d70Var = (d70) obj;
                if (g1Var.f38265f == 0) {
                    g1Var.a(1, true);
                    int i13 = ((org.telegram.ui.m4) d70Var).T;
                    TLRPC.Chat chat = d70Var.f37289n;
                    TLRPC.TL_channels_joinChannel tL_channels_joinChannel = new TLRPC.TL_channels_joinChannel();
                    tL_channels_joinChannel.channel = MessagesController.getInputChannel(chat);
                    ConnectionsManager.getInstance(i13).sendRequestTyped(tL_channels_joinChannel, new hh.j0(g1Var, i13, tL_channels_joinChannel, chat));
                    break;
                }
                break;
            case 12:
                c5 c5Var = (c5) obj2;
                c5Var.b(false);
                c5Var.f36951e.b((d5) obj);
                break;
            case 13:
                ((x6) obj2).f44289e.u0((org.telegram.ui.Cells.y1) obj);
                break;
            case 14:
                e7 e7Var = (e7) obj2;
                m7 m7Var = (m7) obj;
                i7 i7Var = e7Var.d.v;
                if (i7Var != null) {
                    i7Var.J(m7Var.f40384c, m7Var.d, true);
                }
                org.telegram.ui.ActionBar.n1 n1Var2 = e7Var.f37641a;
                if (n1Var2 != null) {
                    n1Var2.d(true);
                }
                break;
            case 15:
                j9 j9Var = (j9) obj2;
                f9 f9Var = (f9) obj;
                ArrayList arrayList = f9Var.f38008b;
                if (arrayList.size() == 1) {
                    TLRPC.User user = (TLRPC.User) arrayList.get(0);
                    TLRPC.UserFull userFull = j9Var.getMessagesController().getUserFull(user.f22527id);
                    j9Var.L = user;
                    boolean z10 = f9Var.f38010e;
                    org.telegram.ui.Components.voip.e2.n(user, z10, z10 || (userFull != null && userFull.video_calls_available), j9Var.getParentActivity(), null, j9Var.getAccountInstance());
                } else {
                    boolean z11 = f9Var.f38010e;
                    HashSet hashSet = new HashSet();
                    int size = arrayList.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj3 = arrayList.get(i14);
                        i14++;
                        hashSet.add(Long.valueOf(((TLRPC.User) obj3).f22527id));
                    }
                    TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                    tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) f9Var.f38009c.get(0)).f22401id;
                    org.telegram.ui.ActionBar.b2 b2Var5 = new org.telegram.ui.ActionBar.b2(j9Var.getParentActivity(), 3, null);
                    TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                    getgroupcall.call = tL_inputGroupCallInviteMessage;
                    getgroupcall.limit = j9Var.getMessagesController().conferenceCallSizeLimit;
                    b2Var5.setOnCancelListener(new p8(j9Var, j9Var.getConnectionsManager().sendRequest(getgroupcall, new o8(j9Var, b2Var5, hashSet, tL_inputGroupCallInviteMessage, z11, 1)), i12));
                    b2Var5.q(600L);
                }
                break;
            case 16:
                fe feVar = (fe) obj2;
                q91 q91Var = (q91) obj;
                lh.d dVar2 = feVar.G0;
                if (view.isEnabled() && !dVar2.J) {
                    wd wdVar = feVar.M0;
                    if (wdVar == null || !wdVar.J) {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        od odVar = new od(feVar, twoStepVerificationActivity, i11);
                        twoStepVerificationActivity.V = 1;
                        twoStepVerificationActivity.X = odVar;
                        dVar2.setLoading(true);
                        twoStepVerificationActivity.s0(new pd(feVar, q91Var, twoStepVerificationActivity, i11));
                    }
                    break;
                }
                break;
            case 17:
                we.e.s((Context) obj2, ((TL_stats.TL_broadcastRevenueTransactionWithdrawal) obj).transaction_url);
                break;
            case 18:
                rn rnVar = (rn) obj2;
                if (rnVar.getMediaDataController().saveToRingtones(((MessageObject) obj).getDocument())) {
                    rnVar.Q7();
                    UndoView undoView = rnVar.f42229u3;
                    if (undoView != null) {
                        long j10 = rnVar.P5;
                        int i15 = UndoView.f26571a0;
                        undoView.j(83, j10, new c5.b(rnVar, 1));
                    }
                }
                rnVar.A7(true);
                break;
            case 19:
                rn.I0((rn) obj2, (String) obj);
                break;
            case 20:
                rn.y1((rn) obj2, (b70) obj);
                break;
            case 21:
                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) obj2;
                boolean z12 = !y1Var.b();
                y1Var.c(z12, true);
                ((AtomicBoolean) obj).set(z12);
                break;
            case 22:
                rn.z1((rn) obj2, (Context) obj);
                break;
            case 23:
                jo joVar = (jo) obj2;
                Context context = (Context) obj;
                org.telegram.ui.ActionBar.z2 z2Var = new org.telegram.ui.ActionBar.z2(context, null);
                org.telegram.ui.ActionBar.e3 e3Var = z2Var.f23994a;
                e3Var.applyTopPadding = false;
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.j4 j4Var = new org.telegram.ui.Cells.j4(context, g6.f23233n5, 23, 15, false, null);
                j4Var.setHeight(47);
                j4Var.setText(LocaleController.getString("ChatHistory", R.string.ChatHistory));
                linearLayout.addView(j4Var);
                LinearLayout linearLayoutG = org.telegram.messenger.y1.g(context, 1);
                linearLayout.addView(linearLayoutG, z5.n(-1, -2));
                f6[] f6VarArr = new f6[2];
                int i16 = 0;
                for (int i17 = 2; i16 < i17; i17 = 2) {
                    f6 f6Var = new f6(context, true);
                    f6VarArr[i16] = f6Var;
                    f6Var.setTag(Integer.valueOf(i16));
                    f6VarArr[i16].setBackgroundDrawable(g6.K0(false));
                    if (i16 == 0) {
                        f6VarArr[i16].b(LocaleController.getString("ChatHistoryVisible", R.string.ChatHistoryVisible), LocaleController.getString("ChatHistoryVisibleInfo", R.string.ChatHistoryVisibleInfo), true, !joVar.F0);
                    } else if (ChatObject.isChannel(joVar.f39429t0)) {
                        f6VarArr[i16].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo", R.string.ChatHistoryHiddenInfo), false, joVar.F0);
                    } else {
                        f6VarArr[i16].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo2", R.string.ChatHistoryHiddenInfo2), false, joVar.F0);
                    }
                    linearLayoutG.addView(f6VarArr[i16], z5.n(-1, -2));
                    f6VarArr[i16].setOnClickListener(new org.telegram.ui.c0(joVar, f6VarArr, z2Var, 8));
                    i16++;
                }
                z2Var.b(linearLayout);
                joVar.showDialog(e3Var);
                break;
            case 24:
                jo.U((jo) obj2, (FrameLayout) obj, view);
                break;
            case 25:
                dq.V((dq) obj2, (org.telegram.ui.ActionBar.z2) obj, view);
                break;
            case 26:
                new ag.g2(((org.telegram.ui.Components.e0) obj2).getContext(), 42, (c6) obj).show();
                break;
            case 27:
                org.telegram.ui.Components.y.Q((org.telegram.ui.Components.y) obj2, (c6) obj);
                break;
            case 28:
                ((Utilities.Callback) obj2).run((TL_aicompose.AiComposeTone) obj);
                break;
            default:
                org.telegram.ui.ActionBar.v0 v0Var3 = (org.telegram.ui.ActionBar.v0) obj2;
                w4 w4Var = (w4) obj;
                v0Var3.M(null, null);
                v0Var3.G(w4Var.d, false);
                v0Var3.setupPopupRadialSelectors(w4Var.f34107f);
                v0Var3.B(w4Var.f34106e);
                break;
        }
    }
}
