package bi;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.ma;
import di.pb;
import fi.f9;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.bj;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.q10;
import org.telegram.messenger.qe;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.c80;
import org.telegram.ui.Components.g80;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.q20;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.va0;
import org.telegram.ui.Components.y70;
import org.telegram.ui.Components.z70;
import org.telegram.ui.bn;
import org.telegram.ui.eg0;
import org.telegram.ui.ex0;
import org.telegram.ui.jx0;
import org.telegram.ui.ld0;
import org.telegram.ui.og0;
import org.telegram.ui.uy0;
public final class p6 implements View.OnClickListener {
    public final int f4007a;
    public final Object f4008b;
    public final Object f4009c;
    public final Object d;
    public final Object f4010e;

    public p6(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f4007a = i7;
        this.f4008b = obj;
        this.f4009c = obj2;
        this.d = obj3;
        this.f4010e = obj4;
    }

    @Override
    public final void onClick(View view) {
        TL_stars.SavedStarGift savedStarGift;
        FrameLayout frameLayout;
        float f10;
        int i7 = this.f4007a;
        boolean z10 = true;
        Object obj = this.f4010e;
        Object obj2 = this.d;
        Object obj3 = this.f4009c;
        Object obj4 = this.f4008b;
        switch (i7) {
            case 0:
                r6 r6Var = (r6) obj4;
                di.p8 p8Var = (di.p8) obj3;
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                q10 q10Var = (q10) obj;
                ArrayList i10 = p8Var.i();
                int i11 = 0;
                while (true) {
                    if (i11 < i10.size()) {
                        if (((TL_stars.SavedStarGift) i10.get(i11)).gift.f28663id == r6Var.f4055m1) {
                            savedStarGift = (TL_stars.SavedStarGift) i10.get(i11);
                        } else {
                            i11++;
                        }
                    } else {
                        i11 = -1;
                        savedStarGift = null;
                    }
                }
                if (savedStarGift != null) {
                    savedStarGift.pinned_to_top = false;
                    i10.set(i11, savedStarGift2);
                    savedStarGift2.pinned_to_top = true;
                    ArrayList arrayList = p8Var.f9552l;
                    arrayList.removeAll(i10);
                    if (p8Var.f9546e && !p8Var.f9545c) {
                        Collections.sort(arrayList, new a3.c(16));
                    }
                    arrayList.addAll(0, i10);
                    ls.f(p8Var.f9543a).k(232, Long.valueOf(p8Var.f9544b), p8Var);
                    p8Var.p();
                    r6Var.dismiss();
                    ((lc) q10Var.run()).I(2131624055, hd.a0(null, null, 2131750014, di.f6.F1(savedStarGift2.gift)), hd.a0(null, null, 2131750015, di.f6.F1(savedStarGift.gift))).j();
                    return;
                }
                return;
            case 1:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                f9 f9Var = (f9) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                fi.z3 z3Var = ((fi.r3) obj4).f12532x;
                fi.r3 r3Var = z3Var.f12860d1;
                if (r3Var != null) {
                    r3Var.a();
                }
                storyItem.dialogId = z3Var.l1;
                storyItem.messageId = storyItem.f28673id;
                gj gjVar = new gj(z3Var.f12891m2, storyItem);
                gjVar.r0(false);
                f9Var.N(new og0(chat.f28434id, gjVar, false));
                return;
            case 2:
                ki.l lVar = (ki.l) obj4;
                bn bnVar = (bn) obj3;
                gj gjVar2 = (gj) obj2;
                String str = (String) obj;
                if (bnVar != null) {
                    lVar.getClass();
                    bnVar.ma(gjVar2, false, false);
                }
                vf.c.s(lVar.getContext(), Uri.parse(str), true, false, false, null, null, false, np.u1(k10.f24968t0).f25856g6, false, false);
                return;
            case 3:
                String[] strArr = (String[]) obj4;
                ArrayList arrayList2 = (ArrayList) obj2;
                hi.e eVar = (hi.e) obj;
                strArr[0] = ((ki.j1) obj3).f18761a;
                int size = arrayList2.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj5 = arrayList2.get(i12);
                    i12++;
                    ki.i1 i1Var = (ki.i1) obj5;
                    i1Var.f18738b.a(TextUtils.equals(i1Var.f18737a, strArr[0]), true);
                }
                if (strArr[0] == null) {
                    z10 = false;
                }
                eVar.setEnabled(z10);
                return;
            case 4:
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
            case 5:
                ((VideoAds) obj4).lambda$show$7((a70) obj3, (TLRPC.TL_sponsoredMessage) obj2, (Context) obj, view);
                return;
            case 6:
                a70 G = a70.G(((org.telegram.ui.ActionBar.w2) obj4).f30179c, (org.telegram.ui.ActionBar.h6) obj3, (ImageView) obj2);
                G.c(2131231843, hd.N0(2131749284, null), (f5) obj, false);
                G.f33367b0 = true;
                G.b0(0.0f, -org.telegram.messenger.g0.L(6.0f));
                G.f33397s = 0;
                G.a0();
                return;
            case 7:
                ((org.telegram.ui.Components.a5) obj2).O(((int[]) obj4)[((org.telegram.ui.Components.q4) obj3).getValue()] * 60, 0, true);
                ((org.telegram.ui.ActionBar.w2) ((hi.w4) obj).f15708b).f30218y0.run();
                return;
            case 8:
                ex0 ex0Var = (ex0) obj2;
                jx0.Z(ex0Var.f47409a, ex0Var.f47410b, ((org.telegram.ui.Components.n4) obj4).getValue() + 1, (((org.telegram.ui.Components.o4) obj3).getValue() + 1) * 60);
                ((org.telegram.ui.ActionBar.w2) ((hi.w4) obj).f15708b).f30218y0.run();
                return;
            case 9:
                ((org.telegram.ui.Components.a5) obj2).O(((int[]) obj4)[((org.telegram.ui.Components.l4) obj3).getValue()], 0, true);
                ((org.telegram.ui.ActionBar.w2) ((hi.w4) obj).f15708b).f30218y0.run();
                return;
            case 10:
                ((qe) obj4).m();
                org.telegram.ui.Components.c5.k((Context) obj3, (org.telegram.ui.ActionBar.h6) obj2, new org.telegram.ui.Components.c0((org.telegram.ui.Components.j8) obj, 12));
                return;
            case 11:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                ArrayList arrayList3 = (ArrayList) obj3;
                va0 va0Var = (va0) obj2;
                eg0 eg0Var = (eg0) obj;
                chatActivityEnterView.O6 = !chatActivityEnterView.O6;
                for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                    ((gj) arrayList3.get(i13)).f24213k.invert_media = chatActivityEnterView.O6;
                }
                va0Var.a(!chatActivityEnterView.O6, true);
                if (!arrayList3.isEmpty()) {
                    eg0Var.f((gj) arrayList3.get(0));
                }
                eg0Var.n(!chatActivityEnterView.O6);
                return;
            case 12:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj4;
                bj bjVar = (bj) obj3;
                gj gjVar3 = (gj) obj2;
                eg0 eg0Var2 = (eg0) obj;
                int i14 = ChatActivityEnterView.f32569s7;
                chatActivityEnterView2.getClass();
                if (bjVar != null) {
                    ArrayList arrayList4 = bjVar.d;
                    int size2 = arrayList4.size();
                    int i15 = 0;
                    while (i15 < size2) {
                        Object obj6 = arrayList4.get(i15);
                        i15++;
                        ((gj) obj6).f24213k.invert_media = chatActivityEnterView2.O6;
                    }
                    bjVar.a();
                } else {
                    gjVar3.f24213k.invert_media = chatActivityEnterView2.O6;
                }
                chatActivityEnterView2.u0();
                eg0Var2.h(true);
                chatActivityEnterView2.O6 = false;
                return;
            case 13:
                ui uiVar = (ui) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.y0 y0Var = (org.telegram.ui.ActionBar.y0) obj2;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = uiVar.f40378e2;
                if (chatAttachAlertPhotoLayout != null) {
                    pb.k1(context, chatAttachAlertPhotoLayout.getStarsPrice(), true, new o6(17, uiVar, y0Var), h6Var);
                    return;
                }
                return;
            case 14:
                g80 g80Var = (g80) obj4;
                Context context2 = (Context) obj3;
                org.telegram.ui.ActionBar.w2 w2Var2 = (org.telegram.ui.ActionBar.w2) obj2;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) obj;
                float[] fArr = g80Var.J;
                FrameLayout frameLayout2 = g80Var.f35472n;
                if (g80Var.f35474s == null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context2, null);
                    if (!g80Var.f35477y && g80Var.H) {
                        org.telegram.ui.ActionBar.y0 y0Var2 = new org.telegram.ui.ActionBar.y0(context2, true, false);
                        y0Var2.j(hd.N0(2131751323, null), 2131232118, null);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(y0Var2, ma.o(-1, 48));
                        y0Var2.setOnClickListener(new z70(g80Var, 1));
                    }
                    org.telegram.ui.ActionBar.y0 y0Var3 = new org.telegram.ui.ActionBar.y0(context2, true, false);
                    y0Var3.j(hd.N0(2131750455, null), 2131232322, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(y0Var3, ma.o(-1, 48));
                    y0Var3.setOnClickListener(new z70(g80Var, 2));
                    if (!g80Var.G) {
                        org.telegram.ui.ActionBar.y0 y0Var4 = new org.telegram.ui.ActionBar.y0(context2, false, true);
                        y0Var4.j(hd.N0(2131745827, null), 2131232110, null);
                        int i16 = org.telegram.ui.ActionBar.m6.f29602p7;
                        y0Var4.d(org.telegram.ui.ActionBar.m6.x0(null, i16, false), org.telegram.ui.ActionBar.m6.x0(null, i16, false));
                        y0Var4.setOnClickListener(new z70(g80Var, 3));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(y0Var4, ma.o(-1, 48));
                    }
                    if (w2Var2 == null) {
                        frameLayout = g2Var.getParentLayout().getOverlayContainerView();
                    } else {
                        frameLayout = w2Var2.f30179c;
                    }
                    if (frameLayout != null) {
                        g80.a(frameLayout2, frameLayout, fArr);
                        float f11 = fArr[1];
                        hi.l5 l5Var = new hi.l5(g80Var, context2, frameLayout, 8);
                        org.telegram.ui.ActionBar.h1 h1Var = new org.telegram.ui.ActionBar.h1(l5Var, 4);
                        frameLayout.getViewTreeObserver().addOnPreDrawListener(h1Var);
                        frameLayout.addView(l5Var, ma.c(-1.0f, -1));
                        l5Var.setAlpha(0.0f);
                        l5Var.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(frameLayout.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(frameLayout.getMeasuredHeight(), 0));
                        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        g80Var.f35474s = g1Var;
                        g1Var.setOnDismissListener(new c80(g80Var, l5Var, frameLayout, h1Var, 0));
                        g80Var.f35474s.setOutsideTouchable(true);
                        g80Var.f35474s.setFocusable(true);
                        g80Var.f35474s.setBackgroundDrawable(new ColorDrawable(0));
                        g80Var.f35474s.setAnimationStyle(2131755192);
                        g80Var.f35474s.setInputMethodMode(2);
                        g80Var.f35474s.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new y70(g80Var, 2));
                        if (org.telegram.messenger.g0.Q1()) {
                            f11 += frameLayout.getPaddingTop();
                            f10 = 0.0f - frameLayout.getPaddingLeft();
                        } else {
                            f10 = 0.0f;
                        }
                        g80Var.f35474s.showAtLocation(frameLayout, 0, (int) (frameLayout.getX() + ((frameLayout.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - org.telegram.messenger.g0.L(16.0f)) + f10), (int) (frameLayout.getY() + f11 + frameLayout2.getMeasuredHeight()));
                        return;
                    }
                    return;
                }
                return;
            case 15:
                ld0 ld0Var = (ld0) obj4;
                a70 I = a70.I(ld0Var.f49601w, ld0Var.f49593a);
                I.c(2131232184, hd.N0(2131745283, null), new q20(ld0Var, (String) obj3, (String) obj2, (String) obj, 27), false);
                I.W(5);
                I.a0();
                return;
            default:
                a70 H = a70.H(((uy0) obj4).f30179c, (org.telegram.ui.ActionBar.h6) obj2, (ImageView) obj, true);
                H.W(5);
                H.f33399t = false;
                H.b0(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(-32.0f));
                ((y10) obj3).a(H);
                return;
        }
    }

    public p6(qe qeVar, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.Components.j8 j8Var) {
        this.f4007a = 10;
        this.f4008b = qeVar;
        this.f4009c = context;
        this.d = h6Var;
        this.f4010e = j8Var;
    }
}
