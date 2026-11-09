package di;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bi.dd;
import c8.ha;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.c20;
import org.telegram.messenger.dj;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.re;
import org.telegram.messenger.u10;
import org.telegram.messenger.video.VideoAds;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.k70;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.ln0;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.r70;
import org.telegram.ui.cn;
import org.telegram.ui.dg0;
import org.telegram.ui.fx0;
import org.telegram.ui.kx0;
import org.telegram.ui.lg0;
import org.telegram.ui.nd0;
import org.telegram.ui.vy0;
public final class v3 implements View.OnClickListener {
    public final int f9858a;
    public final Object f9859b;
    public final Object f9860c;
    public final Object d;
    public final Object f9861e;

    public v3(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f9858a = i7;
        this.f9859b = obj;
        this.f9860c = obj2;
        this.d = obj3;
        this.f9861e = obj4;
    }

    @Override
    public final void onClick(View view) {
        FrameLayout frameLayout;
        TL_stars.SavedStarGift savedStarGift;
        int i7;
        int i10 = this.f9858a;
        float f10 = 0.0f;
        boolean z9 = true;
        Object obj = this.f9861e;
        Object obj2 = this.d;
        Object obj3 = this.f9860c;
        Object obj4 = this.f9859b;
        switch (i10) {
            case 0:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                q9 q9Var = (q9) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                j4 j4Var = ((a4) obj4).f8808x;
                a4 a4Var = j4Var.f9168c1;
                if (a4Var != null) {
                    a4Var.a();
                }
                storyItem.dialogId = j4Var.f9196k1;
                storyItem.messageId = storyItem.f27195id;
                ij ijVar = new ij(j4Var.f9200l2, storyItem);
                ijVar.r0(false);
                q9Var.N(new lg0(chat.f26956id, ijVar, false));
                return;
            case 1:
                hi.l lVar = (hi.l) obj4;
                cn cnVar = (cn) obj3;
                ij ijVar2 = (ij) obj2;
                String str = (String) obj;
                if (cnVar != null) {
                    lVar.getClass();
                    cnVar.la(ijVar2, false, false);
                }
                vf.c.s(lVar.getContext(), Uri.parse(str), true, false, false, null, null, false, qp.s1(p10.f24470s0).f24763d6, false, false);
                return;
            case 2:
                String[] strArr = (String[]) obj4;
                ArrayList arrayList = (ArrayList) obj2;
                fi.d dVar = (fi.d) obj;
                strArr[0] = ((hi.l1) obj3).f14778a;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj5 = arrayList.get(i11);
                    i11++;
                    hi.k1 k1Var = (hi.k1) obj5;
                    k1Var.f14763b.a(TextUtils.equals(k1Var.f14762a, strArr[0]), true);
                }
                if (strArr[0] == null) {
                    z9 = false;
                }
                dVar.setEnabled(z9);
                return;
            case 3:
                boolean[] zArr = (boolean[]) obj4;
                org.telegram.ui.web.v vVar = (org.telegram.ui.web.v) obj3;
                String[] strArr2 = (String[]) obj2;
                org.telegram.ui.ActionBar.v2 v2Var = (org.telegram.ui.ActionBar.v2) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    vVar.a(strArr2[0]);
                }
                v2Var.dismiss();
                return;
            case 4:
                ((VideoAds) obj4).lambda$show$7((l60) obj3, (TLRPC.TL_sponsoredMessage) obj2, (Context) obj, view);
                return;
            case 5:
                l60 F = l60.F(((org.telegram.ui.ActionBar.v2) obj4).f28627c, (org.telegram.ui.ActionBar.g6) obj3, (ImageView) obj2);
                F.c(2131231842, id.M0(2131749477, null), (jg.c1) obj, false);
                F.Y = true;
                F.a0(0.0f, -org.telegram.messenger.g0.L(6.0f));
                F.f35617s = 0;
                F.Z();
                return;
            case 6:
                ((org.telegram.ui.Components.t4) obj2).L(((int[]) obj4)[((org.telegram.ui.Components.j4) obj3).getValue()] * 60, 0, true);
                ((org.telegram.ui.ActionBar.v2) ((h9.f1) obj).f14323b).f28660x0.run();
                return;
            case 7:
                fx0 fx0Var = (fx0) obj2;
                kx0.Z(fx0Var.f45806a, fx0Var.f45807b, ((org.telegram.ui.Components.g4) obj4).getValue() + 1, (((org.telegram.ui.Components.h4) obj3).getValue() + 1) * 60);
                ((org.telegram.ui.ActionBar.v2) ((h9.f1) obj).f14323b).f28660x0.run();
                return;
            case 8:
                ((org.telegram.ui.Components.t4) obj2).L(((int[]) obj4)[((org.telegram.ui.Components.e4) obj3).getValue()], 0, true);
                ((org.telegram.ui.ActionBar.v2) ((h9.f1) obj).f14323b).f28660x0.run();
                return;
            case 9:
                ((re) obj4).m();
                org.telegram.ui.Components.v4.k((Context) obj3, (org.telegram.ui.ActionBar.g6) obj2, new org.telegram.ui.Components.u((org.telegram.ui.Components.f8) obj, 13));
                return;
            case 10:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                ArrayList arrayList2 = (ArrayList) obj3;
                ia0 ia0Var = (ia0) obj2;
                dg0 dg0Var = (dg0) obj;
                chatActivityEnterView.R4 = !chatActivityEnterView.R4;
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    ((ij) arrayList2.get(i12)).f23262k.invert_media = chatActivityEnterView.R4;
                }
                ia0Var.a(!chatActivityEnterView.R4, true);
                if (!arrayList2.isEmpty()) {
                    dg0Var.e((ij) arrayList2.get(0));
                }
                dg0Var.m(!chatActivityEnterView.R4);
                return;
            case 11:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj4;
                dj djVar = (dj) obj3;
                ij ijVar3 = (ij) obj2;
                dg0 dg0Var2 = (dg0) obj;
                int i13 = ChatActivityEnterView.s5;
                chatActivityEnterView2.getClass();
                if (djVar != null) {
                    ArrayList arrayList3 = djVar.d;
                    int size2 = arrayList3.size();
                    int i14 = 0;
                    while (i14 < size2) {
                        Object obj6 = arrayList3.get(i14);
                        i14++;
                        ((ij) obj6).f23262k.invert_media = chatActivityEnterView2.R4;
                    }
                    djVar.a();
                } else {
                    ijVar3.f23262k.invert_media = chatActivityEnterView2.R4;
                }
                chatActivityEnterView2.a0();
                dg0Var2.g(true);
                chatActivityEnterView2.R4 = false;
                return;
            case 12:
                di diVar = (di) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) obj2;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = diVar.f32987a2;
                if (chatAttachAlertPhotoLayout != null) {
                    dd.j1(context, chatAttachAlertPhotoLayout.getStarsPrice(), true, new bi.p5(12, diVar, z0Var), g6Var);
                    return;
                }
                return;
            case 13:
                r70 r70Var = (r70) obj4;
                Context context2 = (Context) obj3;
                org.telegram.ui.ActionBar.v2 v2Var2 = (org.telegram.ui.ActionBar.v2) obj2;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj;
                float[] fArr = r70Var.I;
                FrameLayout frameLayout2 = r70Var.f37569n;
                if (r70Var.f37571s == null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context2, null);
                    if (!r70Var.f37574y && r70Var.G) {
                        org.telegram.ui.ActionBar.z0 z0Var2 = new org.telegram.ui.ActionBar.z0(context2, true, false);
                        z0Var2.j(id.M0(2131751335, null), 2131232116, null);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(z0Var2, ha.o(-1, 48));
                        z0Var2.setOnClickListener(new k70(r70Var, 1));
                    }
                    org.telegram.ui.ActionBar.z0 z0Var3 = new org.telegram.ui.ActionBar.z0(context2, true, false);
                    z0Var3.j(id.M0(2131750472, null), 2131232320, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(z0Var3, ha.o(-1, 48));
                    z0Var3.setOnClickListener(new k70(r70Var, 2));
                    if (!r70Var.F) {
                        org.telegram.ui.ActionBar.z0 z0Var4 = new org.telegram.ui.ActionBar.z0(context2, false, true);
                        z0Var4.j(id.M0(2131746023, null), 2131232108, null);
                        int i15 = org.telegram.ui.ActionBar.l6.f28086p7;
                        z0Var4.d(org.telegram.ui.ActionBar.l6.x0(null, i15, false), org.telegram.ui.ActionBar.l6.x0(null, i15, false));
                        z0Var4.setOnClickListener(new k70(r70Var, 3));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(z0Var4, ha.o(-1, 48));
                    }
                    if (v2Var2 == null) {
                        frameLayout = f2Var.getParentLayout().getOverlayContainerView();
                    } else {
                        frameLayout = v2Var2.f28627c;
                    }
                    if (frameLayout != null) {
                        r70.a(frameLayout2, frameLayout, fArr);
                        float f11 = fArr[1];
                        fi.p5 p5Var = new fi.p5(r70Var, context2, frameLayout, 8);
                        org.telegram.ui.ActionBar.h1 h1Var = new org.telegram.ui.ActionBar.h1(p5Var, 4);
                        frameLayout.getViewTreeObserver().addOnPreDrawListener(h1Var);
                        frameLayout.addView(p5Var, ha.c(-1.0f, -1));
                        p5Var.setAlpha(0.0f);
                        p5Var.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(frameLayout.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(frameLayout.getMeasuredHeight(), 0));
                        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        r70Var.f37571s = g1Var;
                        g1Var.setOnDismissListener(new n70(r70Var, p5Var, frameLayout, h1Var, 0));
                        r70Var.f37571s.setOutsideTouchable(true);
                        r70Var.f37571s.setFocusable(true);
                        r70Var.f37571s.setBackgroundDrawable(new ColorDrawable(0));
                        r70Var.f37571s.setAnimationStyle(2131755192);
                        r70Var.f37571s.setInputMethodMode(2);
                        r70Var.f37571s.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new j70(r70Var, 2));
                        if (org.telegram.messenger.g0.Q1()) {
                            f11 += frameLayout.getPaddingTop();
                            f10 = 0.0f - frameLayout.getPaddingLeft();
                        }
                        r70Var.f37571s.showAtLocation(frameLayout, 0, (int) (frameLayout.getX() + ((frameLayout.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - org.telegram.messenger.g0.L(16.0f)) + f10), (int) (frameLayout.getY() + f11 + frameLayout2.getMeasuredHeight()));
                        return;
                    }
                    return;
                }
                return;
            case 14:
                nd0 nd0Var = (nd0) obj4;
                l60 H = l60.H(nd0Var.f48173w, nd0Var.f48165a);
                H.c(2131232182, id.M0(2131745479, null), new ln0(nd0Var, (String) obj3, (String) obj2, (String) obj, 20), false);
                H.V(5);
                H.Z();
                return;
            case 15:
                l60 G = l60.G(((vy0) obj4).f28627c, (org.telegram.ui.ActionBar.g6) obj2, (ImageView) obj, true);
                G.V(5);
                G.f35618t = false;
                G.a0(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(-32.0f));
                ((c20) obj3).a(G);
                return;
            default:
                zh.c2 c2Var = (zh.c2) obj4;
                bi.v9 v9Var = (bi.v9) obj3;
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                u10 u10Var = (u10) obj;
                ArrayList i16 = v9Var.i();
                int i17 = 0;
                while (true) {
                    if (i17 < i16.size()) {
                        if (((TL_stars.SavedStarGift) i16.get(i17)).gift.f27185id == c2Var.f60260i1) {
                            savedStarGift = (TL_stars.SavedStarGift) i16.get(i17);
                            i7 = i17;
                        } else {
                            i17++;
                        }
                    } else {
                        savedStarGift = null;
                        i7 = -1;
                    }
                }
                if (savedStarGift != null) {
                    savedStarGift.pinned_to_top = false;
                    i16.set(i7, savedStarGift2);
                    savedStarGift2.pinned_to_top = true;
                    ArrayList arrayList4 = v9Var.f4913l;
                    arrayList4.removeAll(i16);
                    if (v9Var.f4907e && !v9Var.f4906c) {
                        Collections.sort(arrayList4, new a3.c(13));
                    }
                    arrayList4.addAll(0, i16);
                    qs.f(v9Var.f4904a).k(230, Long.valueOf(v9Var.f4905b), v9Var);
                    v9Var.n();
                    c2Var.dismiss();
                    ((hc) u10Var.run()).I(2131624054, id.a0(null, null, 2131750031, bi.k7.z1(savedStarGift2.gift)), id.a0(null, null, 2131750032, bi.k7.z1(savedStarGift.gift))).j();
                    return;
                }
                return;
        }
    }

    public v3(re reVar, Context context, int i7, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.Components.f8 f8Var) {
        this.f9858a = 9;
        this.f9859b = reVar;
        this.f9860c = context;
        this.d = g6Var;
        this.f9861e = f8Var;
    }
}
