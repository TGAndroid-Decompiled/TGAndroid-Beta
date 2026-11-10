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
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.ha0;
import org.telegram.ui.Components.i70;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.kn0;
import org.telegram.ui.Components.m70;
import org.telegram.ui.Components.q70;
import org.telegram.ui.cn;
import org.telegram.ui.eg0;
import org.telegram.ui.gx0;
import org.telegram.ui.lx0;
import org.telegram.ui.mg0;
import org.telegram.ui.od0;
import org.telegram.ui.wy0;
public final class v3 implements View.OnClickListener {
    public final int f9863a;
    public final Object f9864b;
    public final Object f9865c;
    public final Object d;
    public final Object f9866e;

    public v3(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f9863a = i7;
        this.f9864b = obj;
        this.f9865c = obj2;
        this.d = obj3;
        this.f9866e = obj4;
    }

    @Override
    public final void onClick(View view) {
        FrameLayout frameLayout;
        TL_stars.SavedStarGift savedStarGift;
        int i7;
        int i10 = this.f9863a;
        float f10 = 0.0f;
        boolean z9 = true;
        Object obj = this.f9866e;
        Object obj2 = this.d;
        Object obj3 = this.f9865c;
        Object obj4 = this.f9864b;
        switch (i10) {
            case 0:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                q9 q9Var = (q9) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                j4 j4Var = ((a4) obj4).f8813x;
                a4 a4Var = j4Var.f9173c1;
                if (a4Var != null) {
                    a4Var.a();
                }
                storyItem.dialogId = j4Var.f9201k1;
                storyItem.messageId = storyItem.f27199id;
                ij ijVar = new ij(j4Var.f9205l2, storyItem);
                ijVar.r0(false);
                q9Var.N(new mg0(chat.f26960id, ijVar, false));
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
                vf.c.s(lVar.getContext(), Uri.parse(str), true, false, false, null, null, false, qp.s1(p10.f24474s0).f24767d6, false, false);
                return;
            case 2:
                String[] strArr = (String[]) obj4;
                ArrayList arrayList = (ArrayList) obj2;
                fi.d dVar = (fi.d) obj;
                strArr[0] = ((hi.l1) obj3).f14780a;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj5 = arrayList.get(i11);
                    i11++;
                    hi.k1 k1Var = (hi.k1) obj5;
                    k1Var.f14765b.a(TextUtils.equals(k1Var.f14764a, strArr[0]), true);
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
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    vVar.a(strArr2[0]);
                }
                w2Var.dismiss();
                return;
            case 4:
                ((VideoAds) obj4).lambda$show$7((k60) obj3, (TLRPC.TL_sponsoredMessage) obj2, (Context) obj, view);
                return;
            case 5:
                k60 F = k60.F(((org.telegram.ui.ActionBar.w2) obj4).f28675c, (org.telegram.ui.ActionBar.h6) obj3, (ImageView) obj2);
                F.c(2131231842, id.M0(2131749477, null), (jg.c1) obj, false);
                F.Y = true;
                F.a0(0.0f, -org.telegram.messenger.g0.L(6.0f));
                F.f35219s = 0;
                F.Z();
                return;
            case 6:
                ((org.telegram.ui.Components.s4) obj2).L(((int[]) obj4)[((org.telegram.ui.Components.i4) obj3).getValue()] * 60, 0, true);
                ((org.telegram.ui.ActionBar.w2) ((h9.f1) obj).f14325b).f28711x0.run();
                return;
            case 7:
                gx0 gx0Var = (gx0) obj2;
                lx0.Z(gx0Var.f46173a, gx0Var.f46174b, ((org.telegram.ui.Components.f4) obj4).getValue() + 1, (((org.telegram.ui.Components.g4) obj3).getValue() + 1) * 60);
                ((org.telegram.ui.ActionBar.w2) ((h9.f1) obj).f14325b).f28711x0.run();
                return;
            case 8:
                ((org.telegram.ui.Components.s4) obj2).L(((int[]) obj4)[((org.telegram.ui.Components.d4) obj3).getValue()], 0, true);
                ((org.telegram.ui.ActionBar.w2) ((h9.f1) obj).f14325b).f28711x0.run();
                return;
            case 9:
                ((re) obj4).m();
                org.telegram.ui.Components.u4.k((Context) obj3, (org.telegram.ui.ActionBar.h6) obj2, new org.telegram.ui.Components.t((org.telegram.ui.Components.e8) obj, 13));
                return;
            case 10:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                ArrayList arrayList2 = (ArrayList) obj3;
                ha0 ha0Var = (ha0) obj2;
                eg0 eg0Var = (eg0) obj;
                chatActivityEnterView.R4 = !chatActivityEnterView.R4;
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    ((ij) arrayList2.get(i12)).f23266k.invert_media = chatActivityEnterView.R4;
                }
                ha0Var.a(!chatActivityEnterView.R4, true);
                if (!arrayList2.isEmpty()) {
                    eg0Var.e((ij) arrayList2.get(0));
                }
                eg0Var.m(!chatActivityEnterView.R4);
                return;
            case 11:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj4;
                dj djVar = (dj) obj3;
                ij ijVar3 = (ij) obj2;
                eg0 eg0Var2 = (eg0) obj;
                int i13 = ChatActivityEnterView.s5;
                chatActivityEnterView2.getClass();
                if (djVar != null) {
                    ArrayList arrayList3 = djVar.d;
                    int size2 = arrayList3.size();
                    int i14 = 0;
                    while (i14 < size2) {
                        Object obj6 = arrayList3.get(i14);
                        i14++;
                        ((ij) obj6).f23266k.invert_media = chatActivityEnterView2.R4;
                    }
                    djVar.a();
                } else {
                    ijVar3.f23266k.invert_media = chatActivityEnterView2.R4;
                }
                chatActivityEnterView2.a0();
                eg0Var2.g(true);
                chatActivityEnterView2.R4 = false;
                return;
            case 12:
                ci ciVar = (ci) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) obj2;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ciVar.d2;
                if (chatAttachAlertPhotoLayout != null) {
                    dd.j1(context, chatAttachAlertPhotoLayout.getStarsPrice(), true, new bi.p5(12, ciVar, z0Var), h6Var);
                    return;
                }
                return;
            case 13:
                q70 q70Var = (q70) obj4;
                Context context2 = (Context) obj3;
                org.telegram.ui.ActionBar.w2 w2Var2 = (org.telegram.ui.ActionBar.w2) obj2;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj;
                float[] fArr = q70Var.I;
                FrameLayout frameLayout2 = q70Var.f37160n;
                if (q70Var.f37162s == null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context2, null);
                    if (!q70Var.f37165y && q70Var.G) {
                        org.telegram.ui.ActionBar.z0 z0Var2 = new org.telegram.ui.ActionBar.z0(context2, true, false);
                        z0Var2.j(id.M0(2131751335, null), 2131232116, null);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(z0Var2, ha.o(-1, 48));
                        z0Var2.setOnClickListener(new j70(q70Var, 1));
                    }
                    org.telegram.ui.ActionBar.z0 z0Var3 = new org.telegram.ui.ActionBar.z0(context2, true, false);
                    z0Var3.j(id.M0(2131750472, null), 2131232320, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(z0Var3, ha.o(-1, 48));
                    z0Var3.setOnClickListener(new j70(q70Var, 2));
                    if (!q70Var.F) {
                        org.telegram.ui.ActionBar.z0 z0Var4 = new org.telegram.ui.ActionBar.z0(context2, false, true);
                        z0Var4.j(id.M0(2131746023, null), 2131232108, null);
                        int i15 = org.telegram.ui.ActionBar.m6.f28111p7;
                        z0Var4.d(org.telegram.ui.ActionBar.m6.x0(null, i15, false), org.telegram.ui.ActionBar.m6.x0(null, i15, false));
                        z0Var4.setOnClickListener(new j70(q70Var, 3));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(z0Var4, ha.o(-1, 48));
                    }
                    if (w2Var2 == null) {
                        frameLayout = f2Var.getParentLayout().getOverlayContainerView();
                    } else {
                        frameLayout = w2Var2.f28675c;
                    }
                    if (frameLayout != null) {
                        q70.a(frameLayout2, frameLayout, fArr);
                        float f11 = fArr[1];
                        fi.p5 p5Var = new fi.p5(q70Var, context2, frameLayout, 8);
                        org.telegram.ui.ActionBar.h1 h1Var = new org.telegram.ui.ActionBar.h1(p5Var, 4);
                        frameLayout.getViewTreeObserver().addOnPreDrawListener(h1Var);
                        frameLayout.addView(p5Var, ha.c(-1.0f, -1));
                        p5Var.setAlpha(0.0f);
                        p5Var.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(frameLayout.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(frameLayout.getMeasuredHeight(), 0));
                        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        q70Var.f37162s = g1Var;
                        g1Var.setOnDismissListener(new m70(q70Var, p5Var, frameLayout, h1Var, 0));
                        q70Var.f37162s.setOutsideTouchable(true);
                        q70Var.f37162s.setFocusable(true);
                        q70Var.f37162s.setBackgroundDrawable(new ColorDrawable(0));
                        q70Var.f37162s.setAnimationStyle(2131755192);
                        q70Var.f37162s.setInputMethodMode(2);
                        q70Var.f37162s.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new i70(q70Var, 2));
                        if (org.telegram.messenger.g0.Q1()) {
                            f11 += frameLayout.getPaddingTop();
                            f10 = 0.0f - frameLayout.getPaddingLeft();
                        }
                        q70Var.f37162s.showAtLocation(frameLayout, 0, (int) (frameLayout.getX() + ((frameLayout.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - org.telegram.messenger.g0.L(16.0f)) + f10), (int) (frameLayout.getY() + f11 + frameLayout2.getMeasuredHeight()));
                        return;
                    }
                    return;
                }
                return;
            case 14:
                od0 od0Var = (od0) obj4;
                k60 H = k60.H(od0Var.f48509w, od0Var.f48501a);
                H.c(2131232182, id.M0(2131745479, null), new kn0(od0Var, (String) obj3, (String) obj2, (String) obj, 20), false);
                H.V(5);
                H.Z();
                return;
            case 15:
                k60 G = k60.G(((wy0) obj4).f28675c, (org.telegram.ui.ActionBar.h6) obj2, (ImageView) obj, true);
                G.V(5);
                G.f35220t = false;
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
                        if (((TL_stars.SavedStarGift) i16.get(i17)).gift.f27189id == c2Var.l1) {
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
                    ArrayList arrayList4 = v9Var.f4914l;
                    arrayList4.removeAll(i16);
                    if (v9Var.f4908e && !v9Var.f4907c) {
                        Collections.sort(arrayList4, new a3.c(13));
                    }
                    arrayList4.addAll(0, i16);
                    qs.f(v9Var.f4905a).k(230, Long.valueOf(v9Var.f4906b), v9Var);
                    v9Var.n();
                    c2Var.dismiss();
                    ((gc) u10Var.run()).I(2131624054, id.a0(null, null, 2131750031, bi.k7.z1(savedStarGift2.gift)), id.a0(null, null, 2131750032, bi.k7.z1(savedStarGift.gift))).j();
                    return;
                }
                return;
        }
    }

    public v3(re reVar, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.Components.e8 e8Var) {
        this.f9863a = 9;
        this.f9864b = reVar;
        this.f9865c = context;
        this.d = h6Var;
        this.f9866e = e8Var;
    }
}
