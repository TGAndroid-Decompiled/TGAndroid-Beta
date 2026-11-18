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
import org.telegram.messenger.aj;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.p10;
import org.telegram.messenger.pe;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.e80;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.n20;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.ta0;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.x70;
import org.telegram.ui.Components.y60;
import org.telegram.ui.bn;
import org.telegram.ui.ex0;
import org.telegram.ui.fg0;
import org.telegram.ui.jx0;
import org.telegram.ui.md0;
import org.telegram.ui.og0;
import org.telegram.ui.uy0;
public final class m6 implements View.OnClickListener {
    public final int f3855a;
    public final Object f3856b;
    public final Object f3857c;
    public final Object d;
    public final Object f3858e;

    public m6(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f3855a = i7;
        this.f3856b = obj;
        this.f3857c = obj2;
        this.d = obj3;
        this.f3858e = obj4;
    }

    @Override
    public final void onClick(View view) {
        TL_stars.SavedStarGift savedStarGift;
        FrameLayout frameLayout;
        float f10;
        int i7 = this.f3855a;
        boolean z10 = true;
        Object obj = this.f3858e;
        Object obj2 = this.d;
        Object obj3 = this.f3857c;
        Object obj4 = this.f3856b;
        switch (i7) {
            case 0:
                o6 o6Var = (o6) obj4;
                di.o8 o8Var = (di.o8) obj3;
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                p10 p10Var = (p10) obj;
                ArrayList i10 = o8Var.i();
                int i11 = 0;
                while (true) {
                    if (i11 < i10.size()) {
                        if (((TL_stars.SavedStarGift) i10.get(i11)).gift.f28632id == o6Var.f3920m1) {
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
                    ArrayList arrayList = o8Var.f9467l;
                    arrayList.removeAll(i10);
                    if (o8Var.f9461e && !o8Var.f9460c) {
                        Collections.sort(arrayList, new a3.c(16));
                    }
                    arrayList.addAll(0, i10);
                    ks.f(o8Var.f9458a).k(232, Long.valueOf(o8Var.f9459b), o8Var);
                    o8Var.p();
                    o6Var.dismiss();
                    ((lc) p10Var.run()).I(2131624055, gd.a0(null, null, 2131750015, di.f6.F1(savedStarGift2.gift)), gd.a0(null, null, 2131750016, di.f6.F1(savedStarGift.gift))).j();
                    return;
                }
                return;
            case 1:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                f9 f9Var = (f9) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                fi.z3 z3Var = ((fi.r3) obj4).f12498x;
                fi.r3 r3Var = z3Var.f12816d1;
                if (r3Var != null) {
                    r3Var.a();
                }
                storyItem.dialogId = z3Var.l1;
                storyItem.messageId = storyItem.f28642id;
                fj fjVar = new fj(z3Var.f12847m2, storyItem);
                fjVar.r0(false);
                f9Var.N(new og0(chat.f28403id, fjVar, false));
                return;
            case 2:
                ki.m mVar = (ki.m) obj4;
                bn bnVar = (bn) obj3;
                fj fjVar2 = (fj) obj2;
                String str = (String) obj;
                if (bnVar != null) {
                    mVar.getClass();
                    bnVar.ma(fjVar2, false, false);
                }
                vf.c.s(mVar.getContext(), Uri.parse(str), true, false, false, null, null, false, mp.u1(j10.f24770t0).f25657g6, false, false);
                return;
            case 3:
                String[] strArr = (String[]) obj4;
                ArrayList arrayList2 = (ArrayList) obj2;
                hi.d dVar = (hi.d) obj;
                strArr[0] = ((ki.k1) obj3).f18748a;
                int size = arrayList2.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj5 = arrayList2.get(i12);
                    i12++;
                    ki.j1 j1Var = (ki.j1) obj5;
                    j1Var.f18725b.a(TextUtils.equals(j1Var.f18724a, strArr[0]), true);
                }
                if (strArr[0] == null) {
                    z10 = false;
                }
                dVar.setEnabled(z10);
                return;
            case 4:
                boolean[] zArr = (boolean[]) obj4;
                org.telegram.ui.web.v vVar = (org.telegram.ui.web.v) obj3;
                String[] strArr2 = (String[]) obj2;
                org.telegram.ui.ActionBar.x2 x2Var = (org.telegram.ui.ActionBar.x2) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    vVar.a(strArr2[0]);
                }
                x2Var.dismiss();
                return;
            case 5:
                ((VideoAds) obj4).lambda$show$7((y60) obj3, (TLRPC.TL_sponsoredMessage) obj2, (Context) obj, view);
                return;
            case 6:
                y60 G = y60.G(((org.telegram.ui.ActionBar.x2) obj4).f30193c, (org.telegram.ui.ActionBar.i6) obj3, (ImageView) obj2);
                G.c(2131231843, gd.M0(2131749285, null), (c5) obj, false);
                G.f42345b0 = true;
                G.b0(0.0f, -org.telegram.messenger.g0.L(6.0f));
                G.f42375s = 0;
                G.a0();
                return;
            case 7:
                ((org.telegram.ui.Components.z4) obj2).O(((int[]) obj4)[((org.telegram.ui.Components.p4) obj3).getValue()] * 60, 0, true);
                ((org.telegram.ui.ActionBar.x2) ((hi.w4) obj).f15642b).f30232y0.run();
                return;
            case 8:
                ex0 ex0Var = (ex0) obj2;
                jx0.Z(ex0Var.f47336a, ex0Var.f47337b, ((org.telegram.ui.Components.m4) obj4).getValue() + 1, (((org.telegram.ui.Components.n4) obj3).getValue() + 1) * 60);
                ((org.telegram.ui.ActionBar.x2) ((hi.w4) obj).f15642b).f30232y0.run();
                return;
            case 9:
                ((org.telegram.ui.Components.z4) obj2).O(((int[]) obj4)[((org.telegram.ui.Components.k4) obj3).getValue()], 0, true);
                ((org.telegram.ui.ActionBar.x2) ((hi.w4) obj).f15642b).f30232y0.run();
                return;
            case 10:
                ((pe) obj4).m();
                org.telegram.ui.Components.b5.k((Context) obj3, (org.telegram.ui.ActionBar.i6) obj2, new org.telegram.ui.Components.b0((org.telegram.ui.Components.k8) obj, 12));
                return;
            case 11:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                ArrayList arrayList3 = (ArrayList) obj3;
                ta0 ta0Var = (ta0) obj2;
                fg0 fg0Var = (fg0) obj;
                chatActivityEnterView.M6 = !chatActivityEnterView.M6;
                for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                    ((fj) arrayList3.get(i13)).f23965k.invert_media = chatActivityEnterView.M6;
                }
                ta0Var.a(!chatActivityEnterView.M6, true);
                if (!arrayList3.isEmpty()) {
                    fg0Var.f((fj) arrayList3.get(0));
                }
                fg0Var.n(!chatActivityEnterView.M6);
                return;
            case 12:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj4;
                aj ajVar = (aj) obj3;
                fj fjVar3 = (fj) obj2;
                fg0 fg0Var2 = (fg0) obj;
                int i14 = ChatActivityEnterView.f32538n7;
                chatActivityEnterView2.getClass();
                if (ajVar != null) {
                    ArrayList arrayList4 = ajVar.d;
                    int size2 = arrayList4.size();
                    int i15 = 0;
                    while (i15 < size2) {
                        Object obj6 = arrayList4.get(i15);
                        i15++;
                        ((fj) obj6).f23965k.invert_media = chatActivityEnterView2.M6;
                    }
                    ajVar.a();
                } else {
                    fjVar3.f23965k.invert_media = chatActivityEnterView2.M6;
                }
                chatActivityEnterView2.q0();
                fg0Var2.h(true);
                chatActivityEnterView2.M6 = false;
                return;
            case 13:
                si siVar = (si) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) obj2;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = siVar.f39670e2;
                if (chatAttachAlertPhotoLayout != null) {
                    pb.k1(context, chatAttachAlertPhotoLayout.getStarsPrice(), true, new l6(17, siVar, z0Var), i6Var);
                    return;
                }
                return;
            case 14:
                e80 e80Var = (e80) obj4;
                Context context2 = (Context) obj3;
                org.telegram.ui.ActionBar.x2 x2Var2 = (org.telegram.ui.ActionBar.x2) obj2;
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) obj;
                float[] fArr = e80Var.J;
                FrameLayout frameLayout2 = e80Var.f34644n;
                if (e80Var.f34646s == null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context2, null);
                    if (!e80Var.f34649y && e80Var.H) {
                        org.telegram.ui.ActionBar.z0 z0Var2 = new org.telegram.ui.ActionBar.z0(context2, true, false);
                        z0Var2.j(gd.M0(2131751324, null), 2131232118, null);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(z0Var2, ma.o(-1, 48));
                        z0Var2.setOnClickListener(new x70(e80Var, 1));
                    }
                    org.telegram.ui.ActionBar.z0 z0Var3 = new org.telegram.ui.ActionBar.z0(context2, true, false);
                    z0Var3.j(gd.M0(2131750456, null), 2131232322, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(z0Var3, ma.o(-1, 48));
                    z0Var3.setOnClickListener(new x70(e80Var, 2));
                    if (!e80Var.G) {
                        org.telegram.ui.ActionBar.z0 z0Var4 = new org.telegram.ui.ActionBar.z0(context2, false, true);
                        z0Var4.j(gd.M0(2131745828, null), 2131232110, null);
                        int i16 = org.telegram.ui.ActionBar.n6.f29615p7;
                        z0Var4.d(org.telegram.ui.ActionBar.n6.x0(null, i16, false), org.telegram.ui.ActionBar.n6.x0(null, i16, false));
                        z0Var4.setOnClickListener(new x70(e80Var, 3));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(z0Var4, ma.o(-1, 48));
                    }
                    if (x2Var2 == null) {
                        frameLayout = h2Var.getParentLayout().getOverlayContainerView();
                    } else {
                        frameLayout = x2Var2.f30193c;
                    }
                    if (frameLayout != null) {
                        e80.a(frameLayout2, frameLayout, fArr);
                        float f11 = fArr[1];
                        hi.m5 m5Var = new hi.m5(e80Var, context2, frameLayout, 8);
                        org.telegram.ui.ActionBar.i1 i1Var = new org.telegram.ui.ActionBar.i1(m5Var, 4);
                        frameLayout.getViewTreeObserver().addOnPreDrawListener(i1Var);
                        frameLayout.addView(m5Var, ma.c(-1.0f, -1));
                        m5Var.setAlpha(0.0f);
                        m5Var.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(frameLayout.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(frameLayout.getMeasuredHeight(), 0));
                        org.telegram.ui.ActionBar.h1 h1Var = new org.telegram.ui.ActionBar.h1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        e80Var.f34646s = h1Var;
                        h1Var.setOnDismissListener(new a80(e80Var, m5Var, frameLayout, i1Var, 0));
                        e80Var.f34646s.setOutsideTouchable(true);
                        e80Var.f34646s.setFocusable(true);
                        e80Var.f34646s.setBackgroundDrawable(new ColorDrawable(0));
                        e80Var.f34646s.setAnimationStyle(2131755192);
                        e80Var.f34646s.setInputMethodMode(2);
                        e80Var.f34646s.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new w70(e80Var, 2));
                        if (org.telegram.messenger.g0.Q1()) {
                            f11 += frameLayout.getPaddingTop();
                            f10 = 0.0f - frameLayout.getPaddingLeft();
                        } else {
                            f10 = 0.0f;
                        }
                        e80Var.f34646s.showAtLocation(frameLayout, 0, (int) (frameLayout.getX() + ((frameLayout.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - org.telegram.messenger.g0.L(16.0f)) + f10), (int) (frameLayout.getY() + f11 + frameLayout2.getMeasuredHeight()));
                        return;
                    }
                    return;
                }
                return;
            case 15:
                md0 md0Var = (md0) obj4;
                y60 I = y60.I(md0Var.f49816w, md0Var.f49808a);
                I.c(2131232184, gd.M0(2131745284, null), new n20(md0Var, (String) obj3, (String) obj2, (String) obj, 27), false);
                I.W(5);
                I.a0();
                return;
            default:
                y60 H = y60.H(((uy0) obj4).f30193c, (org.telegram.ui.ActionBar.i6) obj2, (ImageView) obj, true);
                H.W(5);
                H.f42377t = false;
                H.b0(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(-32.0f));
                ((x10) obj3).a(H);
                return;
        }
    }

    public m6(pe peVar, Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.Components.k8 k8Var) {
        this.f3855a = 10;
        this.f3856b = peVar;
        this.f3857c = context;
        this.d = i6Var;
        this.f3858e = k8Var;
    }
}
