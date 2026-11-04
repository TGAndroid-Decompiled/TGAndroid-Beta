package ai;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import b8.mf;
import ci.v8;
import ci.wb;
import ei.r9;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.m10;
import org.telegram.messenger.u10;
import org.telegram.messenger.ui;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.d8;
import org.telegram.ui.Components.e70;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.f70;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.i70;
import org.telegram.ui.Components.m70;
import org.telegram.ui.Components.v60;
import org.telegram.ui.dg0;
import org.telegram.ui.id0;
import org.telegram.ui.iy0;
import org.telegram.ui.tw0;
import org.telegram.ui.vf0;
import org.telegram.ui.wm;
import org.telegram.ui.yw0;
public final class r4 implements View.OnClickListener {
    public final int f945a;
    public final Object f946b;
    public final Object f947c;
    public final Object d;
    public final Object f948e;

    public r4(Object obj, Object obj2, Object obj3, Object obj4, int i3) {
        this.f945a = i3;
        this.f946b = obj;
        this.f947c = obj2;
        this.d = obj3;
        this.f948e = obj4;
    }

    @Override
    public final void onClick(View view) {
        TL_stars.SavedStarGift savedStarGift;
        int i3;
        FrameLayout frameLayout;
        float f10;
        int i10 = this.f945a;
        boolean z10 = true;
        Object obj = this.f948e;
        Object obj2 = this.d;
        Object obj3 = this.f947c;
        Object obj4 = this.f946b;
        switch (i10) {
            case 0:
                t4 t4Var = (t4) obj4;
                v8 v8Var = (v8) obj3;
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                m10 m10Var = (m10) obj;
                ArrayList i11 = v8Var.i();
                int i12 = 0;
                while (true) {
                    if (i12 < i11.size()) {
                        if (((TL_stars.SavedStarGift) i11.get(i12)).gift.f27230id == t4Var.f987j1) {
                            savedStarGift = (TL_stars.SavedStarGift) i11.get(i12);
                            i3 = i12;
                        } else {
                            i12++;
                        }
                    } else {
                        savedStarGift = null;
                        i3 = -1;
                    }
                }
                if (savedStarGift != null) {
                    savedStarGift.pinned_to_top = false;
                    i11.set(i3, savedStarGift2);
                    savedStarGift2.pinned_to_top = true;
                    ArrayList arrayList = v8Var.f6203l;
                    arrayList.removeAll(i11);
                    if (v8Var.f6197e && !v8Var.f6196c) {
                        Collections.sort(arrayList, new a3.u(4));
                    }
                    arrayList.addAll(0, i11);
                    hs.f(v8Var.f6194a).k(230, Long.valueOf(v8Var.f6195b), v8Var);
                    v8Var.n();
                    t4Var.dismiss();
                    ((fc) m10Var.run()).I(2131624054, bd.a0(null, null, 2131750039, ci.l6.A1(savedStarGift2.gift)), bd.a0(null, null, 2131750040, ci.l6.A1(savedStarGift.gift))).j();
                    return;
                }
                return;
            case 1:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                r9 r9Var = (r9) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                ei.j4 j4Var = ((ei.b4) obj4).f10126x;
                ei.b4 b4Var = j4Var.f10449d1;
                if (b4Var != null) {
                    b4Var.a();
                }
                storyItem.dialogId = j4Var.f10477l1;
                storyItem.messageId = storyItem.f27240id;
                zi ziVar = new zi(j4Var.f10480m2, storyItem);
                ziVar.r0(false);
                r9Var.V(new dg0(chat.f27001id, ziVar, false));
                return;
            case 2:
                ii.n nVar = (ii.n) obj4;
                wm wmVar = (wm) obj3;
                zi ziVar2 = (zi) obj2;
                String str = (String) obj;
                if (wmVar != null) {
                    nVar.getClass();
                    wmVar.ja(ziVar2, false, false);
                }
                sf.c.s(nVar.getContext(), Uri.parse(str), true, false, false, null, null, false, hp.s1(h10.f22829t0).f22988d6, false, false);
                return;
            case 3:
                String[] strArr = (String[]) obj4;
                ArrayList arrayList2 = (ArrayList) obj2;
                gi.d dVar = (gi.d) obj;
                strArr[0] = ((ii.m1) obj3).f15073a;
                int size = arrayList2.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj5 = arrayList2.get(i13);
                    i13++;
                    ii.l1 l1Var = (ii.l1) obj5;
                    l1Var.f15055b.a(TextUtils.equals(l1Var.f15054a, strArr[0]), true);
                }
                if (strArr[0] == null) {
                    z10 = false;
                }
                dVar.setEnabled(z10);
                return;
            case 4:
                boolean[] zArr = (boolean[]) obj4;
                org.telegram.ui.web.w wVar = (org.telegram.ui.web.w) obj3;
                String[] strArr2 = (String[]) obj2;
                org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    wVar.a(strArr2[0]);
                }
                t2Var.dismiss();
                return;
            case 5:
                ((VideoAds) obj4).lambda$show$7((f60) obj3, (TLRPC.TL_sponsoredMessage) obj2, (Context) obj, view);
                return;
            case 6:
                f60 F = f60.F(((org.telegram.ui.ActionBar.t2) obj4).f28589c, (org.telegram.ui.ActionBar.e6) obj3, (ImageView) obj2);
                F.c(2131231842, bd.M0(2131749485, null), (d3) obj, false);
                F.Y = true;
                F.a0(0.0f, -org.telegram.messenger.g0.L(6.0f));
                F.f33747s = 0;
                F.Z();
                return;
            case 7:
                ((org.telegram.ui.Components.r4) obj2).L(((int[]) obj4)[((org.telegram.ui.Components.h4) obj3).getValue()] * 60, 0, true);
                ((org.telegram.ui.ActionBar.t2) ((hi.d) obj).f14429b).f28625y0.run();
                return;
            case 8:
                tw0 tw0Var = (tw0) obj2;
                yw0.Z(tw0Var.f49908a, tw0Var.f49909b, ((org.telegram.ui.Components.e4) obj4).getValue() + 1, (((org.telegram.ui.Components.f4) obj3).getValue() + 1) * 60);
                ((org.telegram.ui.ActionBar.t2) ((hi.d) obj).f14429b).f28625y0.run();
                return;
            case 9:
                ((org.telegram.ui.Components.r4) obj2).L(((int[]) obj4)[((org.telegram.ui.Components.c4) obj3).getValue()], 0, true);
                ((org.telegram.ui.ActionBar.t2) ((hi.d) obj).f14429b).f28625y0.run();
                return;
            case 10:
                ((o4.m0) obj4).l();
                org.telegram.ui.Components.t4.k((Context) obj3, (org.telegram.ui.ActionBar.e6) obj2, new org.telegram.ui.Components.t((d8) obj, 13));
                return;
            case 11:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                ArrayList arrayList3 = (ArrayList) obj3;
                ca0 ca0Var = (ca0) obj2;
                vf0 vf0Var = (vf0) obj;
                chatActivityEnterView.S4 = !chatActivityEnterView.S4;
                for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                    ((zi) arrayList3.get(i14)).f26868k.invert_media = chatActivityEnterView.S4;
                }
                ca0Var.a(!chatActivityEnterView.S4, true);
                if (!arrayList3.isEmpty()) {
                    vf0Var.e((zi) arrayList3.get(0));
                }
                vf0Var.m(!chatActivityEnterView.S4);
                return;
            case 12:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj4;
                ui uiVar = (ui) obj3;
                zi ziVar3 = (zi) obj2;
                vf0 vf0Var2 = (vf0) obj;
                int i15 = ChatActivityEnterView.f31082t5;
                chatActivityEnterView2.getClass();
                if (uiVar != null) {
                    ArrayList arrayList4 = uiVar.d;
                    int size2 = arrayList4.size();
                    int i16 = 0;
                    while (i16 < size2) {
                        Object obj6 = arrayList4.get(i16);
                        i16++;
                        ((zi) obj6).f26868k.invert_media = chatActivityEnterView2.S4;
                    }
                    uiVar.a();
                } else {
                    ziVar3.f26868k.invert_media = chatActivityEnterView2.S4;
                }
                chatActivityEnterView2.a0();
                vf0Var2.g(true);
                chatActivityEnterView2.S4 = false;
                return;
            case 13:
                bi biVar = (bi) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.y0 y0Var = (org.telegram.ui.ActionBar.y0) obj2;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = biVar.f32215b2;
                if (chatAttachAlertPhotoLayout != null) {
                    wb.j1(context, chatAttachAlertPhotoLayout.getStarsPrice(), true, new q4(13, biVar, y0Var), e6Var);
                    return;
                }
                return;
            case 14:
                m70 m70Var = (m70) obj4;
                Context context2 = (Context) obj3;
                org.telegram.ui.ActionBar.t2 t2Var2 = (org.telegram.ui.ActionBar.t2) obj2;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj;
                float[] fArr = m70Var.J;
                FrameLayout frameLayout2 = m70Var.f36060n;
                if (m70Var.f36062s == null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context2, null);
                    if (!m70Var.f36065y && m70Var.H) {
                        org.telegram.ui.ActionBar.y0 y0Var2 = new org.telegram.ui.ActionBar.y0(context2, true, false);
                        y0Var2.j(bd.M0(2131751336, null), 2131232116, null);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(y0Var2, mf.o(-1, 48));
                        y0Var2.setOnClickListener(new f70(m70Var, 1));
                    }
                    org.telegram.ui.ActionBar.y0 y0Var3 = new org.telegram.ui.ActionBar.y0(context2, true, false);
                    y0Var3.j(bd.M0(2131750480, null), 2131232320, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(y0Var3, mf.o(-1, 48));
                    y0Var3.setOnClickListener(new f70(m70Var, 2));
                    if (!m70Var.G) {
                        org.telegram.ui.ActionBar.y0 y0Var4 = new org.telegram.ui.ActionBar.y0(context2, false, true);
                        y0Var4.j(bd.M0(2131746033, null), 2131232108, null);
                        int i17 = org.telegram.ui.ActionBar.k6.f28102p7;
                        y0Var4.d(org.telegram.ui.ActionBar.k6.x0(null, i17, false), org.telegram.ui.ActionBar.k6.x0(null, i17, false));
                        y0Var4.setOnClickListener(new f70(m70Var, 3));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(y0Var4, mf.o(-1, 48));
                    }
                    if (t2Var2 == null) {
                        frameLayout = d2Var.getParentLayout().getOverlayContainerView();
                    } else {
                        frameLayout = t2Var2.f28589c;
                    }
                    if (frameLayout != null) {
                        m70.a(frameLayout2, frameLayout, fArr);
                        float f11 = fArr[1];
                        gi.n5 n5Var = new gi.n5(m70Var, context2, frameLayout, 8);
                        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(n5Var, 4);
                        frameLayout.getViewTreeObserver().addOnPreDrawListener(g1Var);
                        frameLayout.addView(n5Var, mf.c(-1.0f, -1));
                        n5Var.setAlpha(0.0f);
                        n5Var.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(frameLayout.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(frameLayout.getMeasuredHeight(), 0));
                        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        m70Var.f36062s = f1Var;
                        f1Var.setOnDismissListener(new i70(m70Var, n5Var, frameLayout, g1Var, 0));
                        m70Var.f36062s.setOutsideTouchable(true);
                        m70Var.f36062s.setFocusable(true);
                        m70Var.f36062s.setBackgroundDrawable(new ColorDrawable(0));
                        m70Var.f36062s.setAnimationStyle(2131755192);
                        m70Var.f36062s.setInputMethodMode(2);
                        m70Var.f36062s.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new e70(m70Var, 2));
                        if (org.telegram.messenger.g0.Q1()) {
                            f11 += frameLayout.getPaddingTop();
                            f10 = 0.0f - frameLayout.getPaddingLeft();
                        } else {
                            f10 = 0.0f;
                        }
                        m70Var.f36062s.showAtLocation(frameLayout, 0, (int) (frameLayout.getX() + ((frameLayout.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - org.telegram.messenger.g0.L(16.0f)) + f10), (int) (frameLayout.getY() + f11 + frameLayout2.getMeasuredHeight()));
                        return;
                    }
                    return;
                }
                return;
            case 15:
                id0 id0Var = (id0) obj4;
                f60 H = f60.H(id0Var.f46252w, id0Var.f46244a);
                H.c(2131232182, bd.M0(2131745489, null), new v60(id0Var, (String) obj3, (String) obj2, (String) obj, 26), false);
                H.V(5);
                H.Z();
                return;
            default:
                f60 G = f60.G(((iy0) obj4).f28589c, (org.telegram.ui.ActionBar.e6) obj2, (ImageView) obj, true);
                G.V(5);
                G.f33748t = false;
                G.a0(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(-32.0f));
                ((u10) obj3).a(G);
                return;
        }
    }

    public r4(o4.m0 m0Var, Context context, int i3, org.telegram.ui.ActionBar.e6 e6Var, d8 d8Var) {
        this.f945a = 10;
        this.f946b = m0Var;
        this.f947c = context;
        this.d = e6Var;
        this.f948e = d8Var;
    }
}
