package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.video.VideoAds;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.ProfileActivity;
public final class cg implements View.OnClickListener {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public cg(guc gucVar, Context context, int i, vnb vnbVar, a70 a70Var) {
        this.a = (byte) 3;
        this.c = gucVar;
        this.d = context;
        this.e = vnbVar;
        this.b = a70Var;
    }

    @Override
    public final void onClick(View view) {
        FrameLayout frameLayout;
        float f;
        TL_stars.SavedStarGift savedStarGift;
        float f2;
        int i = -1;
        boolean z = false;
        switch (this.a) {
            case 0:
                uu8 uu8Var = (uu8) this.e;
                uu8Var.a.m0(((ti) this.c).getValue() + 1, (((ui) this.d).getValue() + 1) * 60, uu8Var.b);
                ((nx0) ((z8d) this.b).b).y0.run();
                return;
            case 1:
                ((hj) this.e).y(((int[]) this.c)[((qi) this.d).getValue()], 0, true);
                ((nx0) ((z8d) this.b).b).y0.run();
                return;
            case 2:
                ((hj) this.e).y(((int[]) this.c)[((wi) this.d).getValue()] * 60, 0, true);
                ((nx0) ((z8d) this.b).b).y0.run();
                return;
            case 3:
                ((guc) this.c).o();
                jj.k((Context) this.d, (vnb) this.e, new m0((a70) this.b, (byte) 25));
                return;
            case 4:
                ((zu1) this.d).Z9((r47) this.e, false, false);
                m01.t(((no0) this.c).getContext(), Uri.parse((String) this.b), true, false, false, null, null, false, uc7.s1(yac.t0).l4.I2.f, false, false);
                return;
            case 5:
                String[] strArr = (String[]) this.c;
                ArrayList arrayList = (ArrayList) this.e;
                c51 c51Var = (c51) this.b;
                strArr[0] = ((nt0) this.d).a;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    mt0 mt0Var = (mt0) obj;
                    mt0Var.b.a(TextUtils.equals(mt0Var.a, strArr[0]), true);
                }
                if (strArr[0] != null) {
                    z = true;
                }
                c51Var.setEnabled(z);
                return;
            case 6:
                boolean[] zArr = (boolean[]) this.c;
                hu0 hu0Var = (hu0) this.d;
                String[] strArr2 = (String[]) this.e;
                nx0 nx0Var = (nx0) this.b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    hu0Var.a(strArr2[0]);
                }
                nx0Var.dismiss();
                return;
            case 7:
                fu5 G = fu5.G(((nx0) this.c).c, (vnb) this.d, (ImageView) this.e);
                G.b(2131231846, ob6.M0(2131749231, null), (st) this.b, false);
                G.e0 = true;
                G.b0(0.0f, -hl.L(6.0f));
                G.s = (short) 0;
                G.a0();
                return;
            case 8:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                r57 r57Var = (r57) this.e;
                q67 q67Var = (q67) this.b;
                int i3 = ChatActivityEnterView.X7;
                chatActivityEnterView.n7 = !chatActivityEnterView.n7;
                for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                    ((r47) arrayList2.get(i4)).k.invert_media = chatActivityEnterView.n7;
                }
                r57Var.a(!chatActivityEnterView.n7, true);
                if (!arrayList2.isEmpty()) {
                    q67Var.d((r47) arrayList2.get(0));
                }
                q67Var.n(!chatActivityEnterView.n7);
                return;
            case 9:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) this.c;
                m47 m47Var = (m47) this.d;
                r47 r47Var = (r47) this.e;
                q67 q67Var2 = (q67) this.b;
                int i5 = ChatActivityEnterView.X7;
                if (m47Var != null) {
                    ArrayList arrayList3 = m47Var.d;
                    int size2 = arrayList3.size();
                    int i6 = 0;
                    while (i6 < size2) {
                        Object obj2 = arrayList3.get(i6);
                        i6++;
                        ((r47) obj2).k.invert_media = chatActivityEnterView2.n7;
                    }
                    m47Var.a();
                } else {
                    r47Var.k.invert_media = chatActivityEnterView2.n7;
                }
                chatActivityEnterView2.w0();
                q67Var2.f(true);
                chatActivityEnterView2.n7 = false;
                return;
            case 10:
                n12 n12Var = (n12) this.c;
                Context context = (Context) this.d;
                b8 b8Var = (b8) this.e;
                vnb vnbVar = (vnb) this.b;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = n12Var.d2;
                if (chatAttachAlertPhotoLayout != null) {
                    nza.k1(context, chatAttachAlertPhotoLayout.getStarsPrice(), true, new qe2(n12Var, b8Var, (byte) 9), vnbVar);
                    return;
                }
                return;
            case 11:
                i56 i56Var = (i56) this.c;
                Context context2 = (Context) this.d;
                nx0 nx0Var2 = (nx0) this.e;
                e eVar = (e) this.b;
                float[] fArr = i56Var.J;
                FrameLayout frameLayout2 = i56Var.n;
                if (i56Var.s == null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context2, null);
                    if (!i56Var.y && i56Var.H) {
                        b8 b8Var2 = new b8(context2, true, false);
                        b8Var2.j(ob6.M0(2131751300, null), 2131232121, null);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(b8Var2, tre.o(-1, 48));
                        b8Var2.setOnClickListener(new c56(i56Var, (byte) 1));
                    }
                    b8 b8Var3 = new b8(context2, true, false);
                    b8Var3.j(ob6.M0(2131750433, null), 2131232325, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(b8Var3, tre.o(-1, 48));
                    b8Var3.setOnClickListener(new c56(i56Var, (byte) 2));
                    if (!i56Var.G) {
                        b8 b8Var4 = new b8(context2, false, true);
                        b8Var4.j(ob6.M0(2131745750, null), 2131232113, null);
                        int i7 = aob.p7;
                        b8Var4.d(aob.w0(null, i7, false), aob.w0(null, i7, false));
                        b8Var4.setOnClickListener(new c56(i56Var, (byte) 3));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(b8Var4, tre.o(-1, 48));
                    }
                    if (nx0Var2 == null) {
                        frameLayout = eVar.getParentLayout().getOverlayContainerView();
                    } else {
                        frameLayout = nx0Var2.c;
                    }
                    FrameLayout frameLayout3 = frameLayout;
                    if (frameLayout3 != null) {
                        i56.a(frameLayout2, frameLayout3, fArr);
                        float f3 = fArr[1];
                        a81 a81Var = new a81(i56Var, context2, frameLayout3, (byte) 13);
                        gb gbVar = new gb(a81Var, (byte) 6);
                        frameLayout3.getViewTreeObserver().addOnPreDrawListener(gbVar);
                        frameLayout3.addView(a81Var, tre.c(-1.0f, -1));
                        a81Var.setAlpha(0.0f);
                        a81Var.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(frameLayout3.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(frameLayout3.getMeasuredHeight(), 0));
                        n8 n8Var = new n8(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        i56Var.s = n8Var;
                        n8Var.setOnDismissListener(new ae4(i56Var, a81Var, frameLayout3, gbVar, (byte) 1));
                        i56Var.s.setOutsideTouchable(true);
                        i56Var.s.setFocusable(true);
                        i56Var.s.setBackgroundDrawable(new ColorDrawable(0));
                        i56Var.s.setAnimationStyle(2131755192);
                        i56Var.s.setInputMethodMode(2);
                        i56Var.s.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new b56(i56Var, (byte) 2));
                        if (hl.O1()) {
                            f3 += frameLayout3.getPaddingTop();
                            f = 0.0f - frameLayout3.getPaddingLeft();
                        } else {
                            f = 0.0f;
                        }
                        i56Var.s.showAtLocation(frameLayout3, 0, (int) (frameLayout3.getX() + ((frameLayout3.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - hl.L(16.0f)) + f), (int) (frameLayout3.getY() + f3 + frameLayout2.getMeasuredHeight()));
                        return;
                    }
                    return;
                }
                return;
            case 12:
                zg6 zg6Var = (zg6) this.c;
                String str = (String) this.d;
                String str2 = (String) this.e;
                String str3 = (String) this.b;
                fu5 I = fu5.I(zg6Var.w, zg6Var.a);
                I.b(2131232187, ob6.M0(2131745207, null), new g65(zg6Var, str, str2, str3, (byte) 19), false);
                I.W(5);
                I.a0();
                return;
            case 13:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.d;
                lcb lcbVar = (lcb) this.e;
                TLRPC.Chat chat = (TLRPC.Chat) this.b;
                o68 o68Var = ((j68) this.c).x;
                j68 j68Var = o68Var.d1;
                if (j68Var != null) {
                    j68Var.a();
                }
                storyItem.dialogId = o68Var.l1;
                storyItem.messageId = storyItem.id;
                r47 r47Var2 = new r47(o68Var.m2, storyItem);
                r47Var2.r0(false);
                lcbVar.L(new z67(chat.id, r47Var2, false));
                return;
            case 14:
                RectF rectF = ProfileActivity.Z6;
                ((ProfileActivity) this.c).K2((TLRPC.EmojiStatus) this.d, (TLRPC.User) this.e, (ns1) this.b);
                return;
            case 15:
                du8 du8Var = (du8) this.c;
                axa axaVar = (axa) this.d;
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) this.e;
                hcc hccVar = (hcc) this.b;
                ArrayList i8 = axaVar.i();
                int i9 = 0;
                while (true) {
                    if (i9 < i8.size()) {
                        if (((TL_stars.SavedStarGift) i8.get(i9)).gift.id == du8Var.l1) {
                            savedStarGift = (TL_stars.SavedStarGift) i8.get(i9);
                            i = i9;
                        } else {
                            i9++;
                        }
                    } else {
                        savedStarGift = null;
                    }
                }
                if (savedStarGift != null) {
                    savedStarGift.pinned_to_top = false;
                    i8.set(i, savedStarGift2);
                    savedStarGift2.pinned_to_top = true;
                    ArrayList arrayList4 = axaVar.l;
                    arrayList4.removeAll(i8);
                    if (axaVar.e && !axaVar.c) {
                        Collections.sort(arrayList4, new fna((byte) 2));
                    }
                    arrayList4.addAll(0, i8);
                    jn7.f(axaVar.a).k(233, Long.valueOf(axaVar.b), axaVar);
                    axaVar.p();
                    du8Var.dismiss();
                    ((d31) hccVar.run()).I(2131624055, ob6.a0(null, null, 2131749989, wua.u1(savedStarGift2.gift)), ob6.a0(null, null, 2131749990, wua.u1(savedStarGift.gift))).j();
                    return;
                }
                return;
            case 16:
                fu5 H = fu5.H(((qe9) this.c).c, (vnb) this.e, (ImageView) this.b, true);
                H.W(5);
                H.t = false;
                H.b0(hl.L(12.0f), hl.L(-32.0f));
                ((y0) this.d).a(H);
                return;
            case 17:
                ((VideoAds) this.c).lambda$show$7((fu5) this.d, (TLRPC.TL_sponsoredMessage) this.e, (Context) this.b, view);
                return;
            case 18:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, (vnb) this.d, (Activity) this.c);
                alertDialog$Builder.a.S = ob6.M0(2131742789, null);
                alertDialog$Builder.a.U = ob6.M0(2131742790, null);
                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                alertDialog$Builder.j(ob6.M0(2131751563, null), new yw9((slc) this.e, (nx0) this.b, (byte) 25));
                alertDialog$Builder.c(-1);
                alertDialog$Builder.o();
                return;
            case 19:
                c51 c51Var2 = (c51) this.c;
                c51Var2.setLoading(true);
                ((pcc) this.d).a(new gpc(c51Var2, (nx0) this.e, (vnb) this.b, (byte) 1));
                return;
            case 20:
                ktc ktcVar = (ktc) this.c;
                vnb vnbVar2 = (vnb) this.d;
                Runnable runnable = (Runnable) this.e;
                Runnable runnable2 = (Runnable) this.b;
                vnb vnbVar3 = ktcVar.a;
                if (!TextUtils.isEmpty(ktcVar.s) && ktcVar.r != null) {
                    id[] idVarArr = new id[1];
                    LinearLayout linearLayout = new LinearLayout(ktcVar.getContext());
                    linearLayout.setOrientation(1);
                    linearLayout.setPadding(hl.L(18.0f), 0, hl.L(18.0f), 0);
                    TLRPC.User user = ktcVar.r;
                    if (user != null) {
                        String l = lbc.l(user);
                        f2 = 4.0f;
                        LinearLayout linearLayout2 = new LinearLayout(ktcVar.getContext());
                        linearLayout2.setOrientation(0);
                        linearLayout2.setPadding(hl.L(4.0f), 0, hl.L(4.0f), 0);
                        de0 de0Var = new de0(ktcVar.getContext());
                        de0Var.setRoundRadius(hl.L(15.0f));
                        rb0 rb0Var = new rb0((vnb) null);
                        rb0Var.q(ktcVar.r);
                        de0Var.f(ktcVar.r, rb0Var);
                        linearLayout2.addView(de0Var, tre.r(30, 30, 16));
                        TextView textView = new TextView(ktcVar.getContext());
                        int i10 = aob.G6;
                        yob.X(textView, i10, vnbVar2);
                        textView.setTextSize(1, 20.0f);
                        textView.setText(ob6.a0(null, null, 2131742595, l));
                        textView.setTypeface(hl.o());
                        textView.setPadding(hl.L(4.0f), 0, hl.L(4.0f), 0);
                        linearLayout2.addView(textView, tre.t(-1, -2, 16, 9, 0, 0, 0));
                        linearLayout.addView(linearLayout2, tre.r(-1, -2, 55));
                        p66 p66Var = new p66(ktcVar.getContext(), null);
                        yob.X(p66Var, i10, vnbVar2);
                        yob.G(p66Var, aob.Xc, vnbVar2);
                        p66Var.setTextSize(1, 16.0f);
                        p66Var.setPadding(hl.L(4.0f), 0, hl.L(4.0f), 0);
                        p66Var.setText(hl.N2(ob6.a0(null, null, 2131742850, lbc.r(ktcVar.r)), -1, 0, new slc(idVarArr, runnable, (byte) 24), null));
                        linearLayout.addView(p66Var, tre.t(-1, -2, 55, 0, 14, 0, 0));
                    } else {
                        f2 = 4.0f;
                    }
                    FrameLayout frameLayout4 = new FrameLayout(ktcVar.getContext());
                    frameLayout4.setPadding(hl.L(f2), 0, hl.L(f2), 0);
                    TextView textView2 = new TextView(ktcVar.getContext());
                    textView2.setTextSize(1, 14.0f);
                    yob.X(textView2, aob.G6, vnbVar2);
                    textView2.setText(atc.Z(ktcVar.s));
                    textView2.setPadding(hl.L(10.0f), hl.L(12.0f), hl.L(10.0f), hl.L(12.0f));
                    textView2.setTypeface(hl.n1("fonts/rmono.ttf"));
                    int i11 = aob.a7;
                    int v0 = aob.v0(i11, vnbVar3);
                    int v02 = aob.v0(i11, vnbVar3);
                    int i12 = aob.i6;
                    hf0 Z = aob.Z(v0, aob.v(v02, aob.v0(i12, vnbVar3)), 10, 10);
                    uob M = yob.M(i11);
                    uob p = yob.p(i11, i12);
                    textView2.setBackground(Z);
                    yob.j(textView2, Z, M, p, vnbVar2);
                    textView2.setGravity(17);
                    frameLayout4.addView(textView2, tre.d(-1, -2.0f, 7, 0.0f, 0.0f, 0.0f, 0.0f));
                    linearLayout.addView(frameLayout4, tre.t(-1, -2, 55, 0, 14, 0, 0));
                    iye.b(textView2, 0.02f, 1.2f);
                    textView2.setOnClickListener(new lw4(ktcVar, idVarArr, runnable2, (byte) 28));
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, vnbVar2, ktcVar.getContext());
                    alertDialog$Builder2.n(linearLayout);
                    alertDialog$Builder2.j(ob6.M0(2131747558, null), null);
                    idVarArr[0] = alertDialog$Builder2.o();
                    return;
                }
                return;
            default:
                c51 c51Var3 = (c51) this.c;
                ku9 ku9Var = (ku9) this.d;
                kl7 kl7Var = (kl7) this.e;
                vnb vnbVar4 = (vnb) this.b;
                if (!c51Var3.R) {
                    c51Var3.setLoading(true);
                    ku9Var.a(new w58(c51Var3, kl7Var, vnbVar4, (byte) 17));
                    return;
                }
                return;
        }
    }

    public cg(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = obj4;
    }
}
