package bi;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.ja;
import di.l8;
import di.lb;
import fi.i9;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.bj;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.ou;
import org.telegram.messenger.qe;
import org.telegram.messenger.r10;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.c8;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ja0;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.l70;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.m70;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.t70;
import org.telegram.ui.Components.u80;
import org.telegram.ui.an;
import org.telegram.ui.ax0;
import org.telegram.ui.bg0;
import org.telegram.ui.fx0;
import org.telegram.ui.jg0;
import org.telegram.ui.kd0;
import org.telegram.ui.qy0;
public final class f4 implements View.OnClickListener {
    public final int f3517a;
    public final Object f3518b;
    public final Object f3519c;
    public final Object d;
    public final Object f3520e;

    public f4(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f3517a = i7;
        this.f3518b = obj;
        this.f3519c = obj2;
        this.d = obj3;
        this.f3520e = obj4;
    }

    @Override
    public final void onClick(View view) {
        TL_stars.SavedStarGift savedStarGift;
        FrameLayout frameLayout;
        float f10;
        int i7 = this.f3517a;
        boolean z10 = true;
        Object obj = this.f3520e;
        Object obj2 = this.d;
        Object obj3 = this.f3519c;
        Object obj4 = this.f3518b;
        switch (i7) {
            case 0:
                h4 h4Var = (h4) obj4;
                l8 l8Var = (l8) obj3;
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                r10 r10Var = (r10) obj;
                ArrayList i10 = l8Var.i();
                int i11 = 0;
                while (true) {
                    if (i11 < i10.size()) {
                        if (((TL_stars.SavedStarGift) i10.get(i11)).gift.f28280id == h4Var.f3568m1) {
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
                    ArrayList arrayList = l8Var.f9001l;
                    arrayList.removeAll(i10);
                    if (l8Var.f8995e && !l8Var.f8994c) {
                        Collections.sort(arrayList, new a3.c(16));
                    }
                    arrayList.addAll(0, i10);
                    ns.f(l8Var.f8992a).k(230, Long.valueOf(l8Var.f8993b), l8Var);
                    l8Var.n();
                    h4Var.dismiss();
                    ((cc) r10Var.run()).I(2131624055, hd.a0(null, null, 2131750031, di.c6.A1(savedStarGift2.gift)), hd.a0(null, null, 2131750032, di.c6.A1(savedStarGift.gift))).j();
                    return;
                }
                return;
            case 1:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                i9 i9Var = (i9) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                fi.b4 b4Var = ((fi.t3) obj4).f12360x;
                fi.t3 t3Var = b4Var.f11466d1;
                if (t3Var != null) {
                    t3Var.a();
                }
                storyItem.dialogId = b4Var.l1;
                storyItem.messageId = storyItem.f28290id;
                gj gjVar = new gj(b4Var.f11497m2, storyItem);
                gjVar.r0(false);
                i9Var.N(new jg0(chat.f28051id, gjVar, false));
                return;
            case 2:
                ki.m mVar = (ki.m) obj4;
                an anVar = (an) obj3;
                gj gjVar2 = (gj) obj2;
                String str = (String) obj;
                if (anVar != null) {
                    mVar.getClass();
                    anVar.ma(gjVar2, false, false);
                }
                vf.c.s(mVar.getContext(), Uri.parse(str), true, false, false, null, null, false, np.s1(m10.f24940t0).f25272e6, false, false);
                return;
            case 3:
                String[] strArr = (String[]) obj4;
                ArrayList arrayList2 = (ArrayList) obj2;
                hi.d dVar = (hi.d) obj;
                strArr[0] = ((ki.m1) obj3).f18447a;
                int size = arrayList2.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj5 = arrayList2.get(i12);
                    i12++;
                    ki.l1 l1Var = (ki.l1) obj5;
                    l1Var.f18424b.a(TextUtils.equals(l1Var.f18423a, strArr[0]), true);
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
                org.telegram.ui.ActionBar.u2 u2Var = (org.telegram.ui.ActionBar.u2) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    vVar.a(strArr2[0]);
                }
                u2Var.dismiss();
                return;
            case 5:
                ((VideoAds) obj4).lambda$show$7((m60) obj3, (TLRPC.TL_sponsoredMessage) obj2, (Context) obj, view);
                return;
            case 6:
                m60 F = m60.F(((org.telegram.ui.ActionBar.u2) obj4).f29685c, (org.telegram.ui.ActionBar.e6) obj3, (ImageView) obj2);
                F.c(2131231842, hd.M0(2131749477, null), (u2) obj, false);
                F.Y = true;
                F.a0(0.0f, -org.telegram.messenger.g0.L(6.0f));
                F.f37111s = 0;
                F.Z();
                return;
            case 7:
                ((org.telegram.ui.Components.r4) obj2).L(((int[]) obj4)[((org.telegram.ui.Components.h4) obj3).getValue()] * 60, 0, true);
                ((org.telegram.ui.ActionBar.u2) ((ou) obj).f25806b).f29724y0.run();
                return;
            case 8:
                ax0 ax0Var = (ax0) obj2;
                fx0.Z(ax0Var.f45531a, ax0Var.f45532b, ((org.telegram.ui.Components.e4) obj4).getValue() + 1, (((org.telegram.ui.Components.f4) obj3).getValue() + 1) * 60);
                ((org.telegram.ui.ActionBar.u2) ((ou) obj).f25806b).f29724y0.run();
                return;
            case 9:
                ((org.telegram.ui.Components.r4) obj2).L(((int[]) obj4)[((org.telegram.ui.Components.c4) obj3).getValue()], 0, true);
                ((org.telegram.ui.ActionBar.u2) ((ou) obj).f25806b).f29724y0.run();
                return;
            case 10:
                ((qe) obj4).m();
                org.telegram.ui.Components.t4.k((Context) obj3, (org.telegram.ui.ActionBar.e6) obj2, new org.telegram.ui.Components.s((c8) obj, 13));
                return;
            case 11:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                ArrayList arrayList3 = (ArrayList) obj3;
                ja0 ja0Var = (ja0) obj2;
                bg0 bg0Var = (bg0) obj;
                chatActivityEnterView.f32244m6 = !chatActivityEnterView.f32244m6;
                for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                    ((gj) arrayList3.get(i13)).f23819k.invert_media = chatActivityEnterView.f32244m6;
                }
                ja0Var.a(!chatActivityEnterView.f32244m6, true);
                if (!arrayList3.isEmpty()) {
                    bg0Var.f((gj) arrayList3.get(0));
                }
                bg0Var.n(!chatActivityEnterView.f32244m6);
                return;
            case 12:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj4;
                bj bjVar = (bj) obj3;
                gj gjVar3 = (gj) obj2;
                bg0 bg0Var2 = (bg0) obj;
                int i14 = ChatActivityEnterView.N6;
                chatActivityEnterView2.getClass();
                if (bjVar != null) {
                    ArrayList arrayList4 = bjVar.d;
                    int size2 = arrayList4.size();
                    int i15 = 0;
                    while (i15 < size2) {
                        Object obj6 = arrayList4.get(i15);
                        i15++;
                        ((gj) obj6).f23819k.invert_media = chatActivityEnterView2.f32244m6;
                    }
                    bjVar.a();
                } else {
                    gjVar3.f23819k.invert_media = chatActivityEnterView2.f32244m6;
                }
                chatActivityEnterView2.j0();
                bg0Var2.h(true);
                chatActivityEnterView2.f32244m6 = false;
                return;
            case 13:
                ki kiVar = (ki) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) obj2;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = kiVar.f36435e2;
                if (chatAttachAlertPhotoLayout != null) {
                    lb.j1(context, chatAttachAlertPhotoLayout.getStarsPrice(), true, new e4(13, kiVar, z0Var), e6Var);
                    return;
                }
                return;
            case 14:
                t70 t70Var = (t70) obj4;
                Context context2 = (Context) obj3;
                org.telegram.ui.ActionBar.u2 u2Var2 = (org.telegram.ui.ActionBar.u2) obj2;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) obj;
                float[] fArr = t70Var.J;
                FrameLayout frameLayout2 = t70Var.f39579n;
                if (t70Var.f39581s == null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context2, null);
                    if (!t70Var.f39584y && t70Var.H) {
                        org.telegram.ui.ActionBar.z0 z0Var2 = new org.telegram.ui.ActionBar.z0(context2, true, false);
                        z0Var2.j(hd.M0(2131751335, null), 2131232117, null);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(z0Var2, ja.o(-1, 48));
                        z0Var2.setOnClickListener(new m70(t70Var, 1));
                    }
                    org.telegram.ui.ActionBar.z0 z0Var3 = new org.telegram.ui.ActionBar.z0(context2, true, false);
                    z0Var3.j(hd.M0(2131750472, null), 2131232321, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(z0Var3, ja.o(-1, 48));
                    z0Var3.setOnClickListener(new m70(t70Var, 2));
                    if (!t70Var.G) {
                        org.telegram.ui.ActionBar.z0 z0Var4 = new org.telegram.ui.ActionBar.z0(context2, false, true);
                        z0Var4.j(hd.M0(2131746023, null), 2131232109, null);
                        int i16 = org.telegram.ui.ActionBar.j6.f29070p7;
                        z0Var4.d(org.telegram.ui.ActionBar.j6.x0(null, i16, false), org.telegram.ui.ActionBar.j6.x0(null, i16, false));
                        z0Var4.setOnClickListener(new m70(t70Var, 3));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(z0Var4, ja.o(-1, 48));
                    }
                    if (u2Var2 == null) {
                        frameLayout = e2Var.getParentLayout().getOverlayContainerView();
                    } else {
                        frameLayout = u2Var2.f29685c;
                    }
                    if (frameLayout != null) {
                        t70.a(frameLayout2, frameLayout, fArr);
                        float f11 = fArr[1];
                        hi.n5 n5Var = new hi.n5(t70Var, context2, frameLayout, 8);
                        org.telegram.ui.ActionBar.h1 h1Var = new org.telegram.ui.ActionBar.h1(n5Var, 4);
                        frameLayout.getViewTreeObserver().addOnPreDrawListener(h1Var);
                        frameLayout.addView(n5Var, ja.c(-1.0f, -1));
                        n5Var.setAlpha(0.0f);
                        n5Var.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(frameLayout.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(frameLayout.getMeasuredHeight(), 0));
                        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        t70Var.f39581s = g1Var;
                        g1Var.setOnDismissListener(new p70(t70Var, n5Var, frameLayout, h1Var, 0));
                        t70Var.f39581s.setOutsideTouchable(true);
                        t70Var.f39581s.setFocusable(true);
                        t70Var.f39581s.setBackgroundDrawable(new ColorDrawable(0));
                        t70Var.f39581s.setAnimationStyle(2131755192);
                        t70Var.f39581s.setInputMethodMode(2);
                        t70Var.f39581s.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new l70(t70Var, 2));
                        if (org.telegram.messenger.g0.Q1()) {
                            f11 += frameLayout.getPaddingTop();
                            f10 = 0.0f - frameLayout.getPaddingLeft();
                        } else {
                            f10 = 0.0f;
                        }
                        t70Var.f39581s.showAtLocation(frameLayout, 0, (int) (frameLayout.getX() + ((frameLayout.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - org.telegram.messenger.g0.L(16.0f)) + f10), (int) (frameLayout.getY() + f11 + frameLayout2.getMeasuredHeight()));
                        return;
                    }
                    return;
                }
                return;
            case 15:
                kd0 kd0Var = (kd0) obj4;
                m60 H = m60.H(kd0Var.f48641w, kd0Var.f48633a);
                H.c(2131232183, hd.M0(2131745479, null), new u80(kd0Var, (String) obj3, (String) obj2, (String) obj, 24), false);
                H.V(5);
                H.Z();
                return;
            default:
                m60 G = m60.G(((qy0) obj4).f29685c, (org.telegram.ui.ActionBar.e6) obj2, (ImageView) obj, true);
                G.V(5);
                G.f37112t = false;
                G.a0(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(-32.0f));
                ((z10) obj3).a(G);
                return;
        }
    }

    public f4(qe qeVar, Context context, int i7, org.telegram.ui.ActionBar.e6 e6Var, c8 c8Var) {
        this.f3517a = 10;
        this.f3518b = qeVar;
        this.f3519c = context;
        this.d = e6Var;
        this.f3520e = c8Var;
    }
}
