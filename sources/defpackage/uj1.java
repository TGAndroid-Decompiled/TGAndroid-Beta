package defpackage;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.VelocityTracker;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.ProfileActivity;
public final class uj1 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;

    public uj1(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final void run() {
        jlb jlbVar;
        int[] iArr;
        hg5 hg5Var;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        String str;
        String a0;
        TLRPC.Chat L0;
        px1 px1Var;
        byte b = this.a;
        k47 k47Var = null;
        boolean z = true;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((ik1) obj2).E((TLRPC.TL_payments_starsRevenueStats) obj);
                return;
            case 1:
                lk1 lk1Var = (lk1) obj2;
                kk1 kk1Var = (kk1) obj;
                rc2 rc2Var = lk1Var.a;
                kk1 kk1Var2 = lk1Var.E;
                if (kk1Var == kk1Var2) {
                    kk1Var2.n.c(false);
                    kk1 kk1Var3 = lk1Var.E;
                    if (kk1Var3.g) {
                        if (rc2Var.getDelegate() != null) {
                            rc2Var.getDelegate().o2();
                        }
                    } else {
                        TLObject tLObject = kk1Var3.o;
                        rc2 rc2Var2 = lk1Var.a;
                        if (rc2Var2.getDelegate() != null) {
                            rc2Var2.getDelegate().I1(rc2Var2, tLObject, true);
                        }
                    }
                }
                lk1Var.E = null;
                lk1Var.F = null;
                lk1Var.A = false;
                lk1Var.z = false;
                lk1Var.x.c(false);
                VelocityTracker velocityTracker = lk1Var.C;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    lk1Var.C = null;
                    return;
                }
                return;
            case 2:
                cm1 cm1Var = (cm1) obj2;
                cm1Var.g1.l(cm1Var, ((TLRPC.TL_messageActionGiftCode) obj).slug);
                return;
            case 3:
                cm1 cm1Var2 = (cm1) obj2;
                TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
                tL_resolveStarGiftOffer.offer_msg_id = cm1Var2.getMessageObject().e1();
                tL_resolveStarGiftOffer.decline = true;
                ConnectionsManager.getInstance(cm1Var2.I).sendRequestTyped(tL_resolveStarGiftOffer, new lf2(cm1Var2, (d) obj, (byte) 6));
                return;
            case 4:
                c41.b0((d) obj2).g0((TLRPC.TL_error) obj, false);
                return;
            case 5:
                yv1 yv1Var = (yv1) obj2;
                jlb[] jlbVarArr = (jlb[]) obj;
                if (!yv1Var.Wb && (jlbVar = jlbVarArr[0]) != null) {
                    jlbVarArr[0] = null;
                    if (yv1Var.y0 == jlbVar) {
                        yv1Var.y0 = null;
                    }
                    gm.B2(jlbVar);
                    return;
                }
                return;
            case 6:
                ((yv1) obj2).Da((bu5) obj);
                return;
            case 7:
                ((hv0) obj2).a((TLRPC.User) obj);
                return;
            case 8:
                yv1 yv1Var2 = (yv1) obj2;
                rc2 rc2Var3 = (rc2) obj;
                rc2Var3.getLocationInWindow(new int[2]);
                yv1Var2.O1.setTranslationY(rc2Var3.getTimeY() + ((iArr[1] - hg5Var.getTop()) - gm.L(120.0f)));
                yv1Var2.O1.o(0.0f, ((((-gm.L(16.0f)) + iArr[0]) + rc2Var3.O9) + rc2Var3.M9) - (rc2Var3.P9 / 2.0f));
                yv1Var2.O1.v();
                return;
            case 9:
                ((yv1) obj2).q9((TLRPC.TL_inlineBotWebView) obj);
                return;
            case 10:
                yv1 yv1Var3 = (yv1) obj2;
                yv1Var3.getClass();
                yv1Var3.presentFragment(ProfileActivity.S2(((TLRPC.User[]) obj)[0].id));
                return;
            case 11:
                yv1 yv1Var4 = (yv1) obj2;
                int[] iArr2 = (int[]) obj;
                if (iArr2[0] != 0) {
                    yv1Var4.getConnectionsManager().cancelRequest(iArr2[0], true);
                    iArr2[0] = 0;
                    return;
                }
                return;
            case 12:
                ((yv1) obj2).z6((so1) obj);
                return;
            case 13:
                yv1 yv1Var5 = (yv1) obj2;
                Activity parentActivity = yv1Var5.getParentActivity();
                String str2 = ((TLRPC.TL_bankCardOpenUrl) obj).url;
                if (yv1Var5.x8 != 0) {
                    z = false;
                }
                l11.r(parentActivity, Uri.parse(str2), z, false);
                return;
            case 14:
                ((yv1) obj2).Aa((TLRPC.Chat) obj);
                return;
            case 15:
                ((yv1) obj2).v9((TLRPC.TL_messages_sendScheduledMessages) obj);
                return;
            case 16:
                yv1 yv1Var6 = (yv1) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                yv1Var6.getClass();
                if (tL_error.text.startsWith("SLOWMODE_WAIT_")) {
                    ik.t0(jb6.M0(2131745036, null), yv1Var6);
                    return;
                } else if (tL_error.text.equals("CHAT_SEND_MEDIA_FORBIDDEN")) {
                    ik.t0(jb6.M0(2131753920, null), yv1Var6);
                    return;
                } else {
                    ik.t0(tL_error.text, yv1Var6);
                    return;
                }
            case 17:
                vh6 vh6Var = (vh6) obj2;
                p pVar = (p) obj;
                if (vh6Var.m() == 1 && vh6Var.n(0) != null && ((ArrayList) vh6Var.n(0)).size() == 1) {
                    k47Var = (k47) ((ArrayList) vh6Var.n(0)).get(0);
                }
                if (k47Var != null && (message = k47Var.k) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null && webPage.attributes != null) {
                    for (int i = 0; i < k47Var.k.media.webpage.attributes.size(); i++) {
                        TLRPC.WebPageAttribute webPageAttribute = k47Var.k.media.webpage.attributes.get(i);
                        if ((webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) && ((TLRPC.TL_webPageAttributeStory) webPageAttribute).storyItem != null) {
                            gm.c3(new uj1(pVar, k47Var.k.media.webpage, (byte) 18));
                            return;
                        }
                    }
                }
                gm.c3(new fo1(pVar, (byte) 1));
                return;
            case 18:
                ((p) obj2).a(Boolean.TRUE, (TLRPC.WebPage) obj);
                return;
            case 19:
                yv1 yv1Var7 = (yv1) obj2;
                View view = (View) obj;
                if (yv1Var7.getParentActivity() != null) {
                    yv1Var7.Z0.setPadding(gm.L(7.33f), 0, gm.L(7.33f), 0);
                    yv1Var7.Z0.k(yv1Var7.L);
                    yv1Var7.Z0.q(16.0f);
                    yv1Var7.Z0.p(true);
                    yv1Var7.Z0.t(jb6.M0(2131753067, null));
                    yv1Var7.Z0.n(0.0f, 96.0f);
                    yv1Var7.Z0.setTranslationY(gm.L(10.0f) + ((view.getTop() - yv1Var7.Xa) - yv1Var7.m1.getHeight()));
                    yv1Var7.m1.addView(yv1Var7.Z0, qoe.e(-1, 100, 87));
                    hg5 hg5Var2 = yv1Var7.Z0;
                    hg5Var2.r0 = new mz(yv1Var7, (byte) 10);
                    hg5Var2.v();
                    jg5.x.b();
                    return;
                }
                return;
            case 20:
                ((yv1) obj2).m1.removeView((ft1) obj);
                return;
            case 21:
                k47 k47Var2 = (k47) obj;
                yv1 yv1Var8 = ((xq1) obj2).s;
                SparseArray[] sparseArrayArr = yv1Var8.G6;
                k47 k47Var3 = (k47) sparseArrayArr[0].get(k47Var2.e1());
                if (k47Var3 != null && k47Var3 != k47Var2) {
                    k47 k47Var4 = (k47) sparseArrayArr[0].get(k47Var2.e1());
                    k47Var4.k.reactions = k47Var2.k.reactions;
                    k47Var2 = k47Var4;
                }
                yv1Var8.Yc(k47Var2, true);
                g39.f();
                return;
            case 22:
                cm1 cm1Var3 = (cm1) obj;
                yv1 yv1Var9 = ((cu1) ((bv1) obj2).f).a.R;
                int i2 = yv1.xd;
                yv1Var9.gb();
                cm1Var3.getMessageObject().r = false;
                cm1Var3.invalidate();
                return;
            case 23:
                hg5 hg5Var3 = (hg5) obj;
                yv1 yv1Var10 = ((iv1) obj2).a;
                yv1Var10.m1.removeView(hg5Var3);
                if (hg5Var3 == yv1Var10.P1) {
                    yv1Var10.P1 = null;
                    return;
                }
                return;
            case 24:
                Long l = (Long) obj;
                yv1 yv1Var11 = ((cv1) obj2).V2.a;
                if (l.longValue() < 0 && (L0 = yv1Var11.getMessagesController().L0(Long.valueOf(-l.longValue()))) != null) {
                    str = L0.title;
                } else {
                    str = "";
                }
                c41 b0 = c41.b0(yv1Var11);
                if (TextUtils.isEmpty(str)) {
                    a0 = jb6.M0(2131745915, null);
                } else {
                    a0 = jb6.a0(null, null, 2131745916, str);
                }
                b10.u(a0, b0, 2131623990, 36);
                return;
            case 25:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj2;
                int i3 = ChatActivityEnterView.z7;
                ((mw1) obj).run();
                ewe.c(chatActivityEnterView.R, chatActivityEnterView.G3);
                return;
            case 26:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj2;
                int i4 = ChatActivityEnterView.z7;
                ik.J(chatActivityEnterView2.E3, chatActivityEnterView2.F3.a(), new k6d((qw1) obj, (byte) 18), chatActivityEnterView2.L4);
                return;
            case 27:
                int i5 = ChatActivityEnterView.z7;
                ((ChatActivityEnterView) obj2).removeView((hg5) obj);
                return;
            case 28:
                ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) obj2;
                TLRPC.TL_document tL_document = (TLRPC.TL_document) obj;
                int i6 = ChatActivityEnterView.z7;
                if (chatActivityEnterView3.R3 == tL_document && (px1Var = chatActivityEnterView3.f1) != null && px1Var.getVisibility() == 0) {
                    chatActivityEnterView3.x5 = true;
                    chatActivityEnterView3.t1();
                    chatActivityEnterView3.x5 = false;
                    return;
                }
                return;
            default:
                ChatActivityEnterView chatActivityEnterView4 = (ChatActivityEnterView) obj2;
                bu5 bu5Var = (bu5) obj;
                int i7 = ChatActivityEnterView.z7;
                if (chatActivityEnterView4.c7 == bu5Var) {
                    chatActivityEnterView4.c7 = null;
                    return;
                }
                return;
        }
    }
}
