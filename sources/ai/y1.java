package ai;

import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.hh0;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.wo0;
import org.telegram.ui.Components.z71;
import org.telegram.ui.dy;
import org.telegram.ui.ty;
import org.telegram.ui.zn;
public final class y1 implements Utilities.Callback {
    public final int f1932a;
    public final Object f1933b;

    public y1(Object obj, int i10) {
        this.f1932a = i10;
        this.f1933b = obj;
    }

    @Override
    public final void run(Object obj) {
        String str;
        boolean z10;
        int i10;
        float f7;
        c71 c71Var;
        boolean z11;
        TL_account.TL_connectedBot tL_connectedBot;
        TLRPC.User user;
        TL_account.TL_businessBotRights makeDefault;
        boolean z12;
        boolean z13;
        c71 c71Var2;
        Editable editable;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = null;
        ii.a aVar = null;
        int i11 = 0;
        boolean z14 = false;
        int i12 = 0;
        switch (this.f1932a) {
            case 0:
                d2 d2Var = (d2) this.f1933b;
                if (((Boolean) obj).booleanValue() && !d2Var.f814w) {
                    d2Var.f811n = true;
                    d2Var.I = true;
                    d2Var.u(false);
                    d2.W = d2Var;
                    d2Var.J = NativeInstance.createVideoCapturer(d2Var.H, d2Var.I ? 1 : 0);
                    if (d2Var.E != null) {
                        DispatchQueue dispatchQueue = Utilities.globalQueue;
                        NativeInstance nativeInstance = d2Var.E;
                        Objects.requireNonNull(nativeInstance);
                        dispatchQueue.postRunnable(new org.telegram.messenger.voip.t0(nativeInstance, 3));
                        d2Var.M.clear();
                        d2Var.E = null;
                    }
                    d2Var.c();
                    d2Var.k();
                    NotificationCenter.getInstance(d2Var.f809e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(d2Var.f810f.f20055id));
                    return;
                }
                return;
            case 1:
                kc kcVar = (kc) this.f1933b;
                Boolean bool = (Boolean) obj;
                kcVar.f1279k1 = false;
                kcVar.P();
                return;
            case 2:
                l7 l7Var = (l7) obj;
                t7 t7Var = ((q7) this.f1933b).f1620e;
                while (true) {
                    ArrayList arrayList = t7Var.G;
                    if (i11 < arrayList.size()) {
                        if (l7Var != arrayList.get(i11)) {
                            ((l7) arrayList.get(i11)).getClass();
                        }
                        i11++;
                    } else {
                        return;
                    }
                }
            case 3:
                ta taVar = (ta) this.f1933b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                taVar.f1766p = true;
                if (storyItem != null && (str = storyItem.caption) != null) {
                    taVar.f1763m = true;
                    taVar.f1762l = str;
                    taVar.f1757f = TextUtils.isEmpty(str);
                    View view = taVar.f1768r;
                    if (view != null) {
                        view.invalidate();
                    }
                    Runnable runnable = taVar.f1769s;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                bi.z zVar = (bi.z) this.f1933b;
                String str2 = (String) obj;
                ArrayList arrayList2 = zVar.h;
                if (!arrayList2.contains(str2)) {
                    arrayList2.add(str2);
                    zVar.i(true);
                }
                AndroidUtilities.runOnUIThread(new ca(7, zVar, str2), 120L);
                return;
            case 5:
                ((ci.m) this.f1933b).x(((Integer) obj).intValue());
                return;
            case 6:
                ci.e0 e0Var = (ci.e0) this.f1933b;
                e0Var.f5003j0.f4890n.P = ((Float) obj).floatValue();
                ci.d0 d0Var = e0Var.f5003j0;
                ci.c0 c0Var = d0Var.d;
                if (c0Var != null) {
                    c0Var.setVolume(d0Var.f4890n.P);
                    return;
                }
                return;
            case 7:
                ci.q0 q0Var = (ci.q0) this.f1933b;
                VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
                MessageObject messageObject = q0Var.f5753c;
                if (messageObject != null) {
                    messageObject.videoEditedInfo = videoEditedInfo;
                    MediaController.getInstance().scheduleVideoConvert(q0Var.f5753c);
                    return;
                }
                return;
            case 8:
                ci.w2 w2Var = (ci.w2) this.f1933b;
                w2Var.h(-1.0f);
                AndroidUtilities.runOnUIThread(new ca(16, w2Var, (Runnable) obj), 80L);
                return;
            case 9:
                ((ci.v3) this.f1933b).f6144s.animate().translationY(((-((Integer) obj).intValue()) / 2.0f) + AndroidUtilities.dp(80.0f)).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.p1.f21455w).start();
                return;
            case 10:
                ci.s4 s4Var = (ci.s4) this.f1933b;
                View view2 = (View) obj;
                ci.n4 n4Var = s4Var.f5942b;
                if (view2 instanceof ci.r4) {
                    n4Var.getClass();
                    int R = RecyclerView.R(view2);
                    p61 G = n4Var.W2.G(R);
                    if (G != null) {
                        ci.r4 r4Var = (ci.r4) view2;
                        r4Var.setPosition(s4Var.b(R));
                        if (s4Var.f5945f == G.d) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        r4Var.b(z10, true);
                        boolean contains = s4Var.f5944e.contains(Integer.valueOf(G.d));
                        if (r4Var.f5898f != contains) {
                            r4Var.f5898f = contains;
                            r4Var.invalidate();
                        }
                        view2.setPressed(false);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                ci.n4 n4Var2 = (ci.n4) this.f1933b;
                View view3 = (View) obj;
                if (view3 instanceof ci.r4) {
                    ci.cb cbVar = n4Var2.f5633d3;
                    cbVar.f5942b.getClass();
                    ((ci.r4) view3).setPosition(cbVar.b(RecyclerView.R(view3)));
                    view3.setPressed(false);
                    return;
                }
                return;
            case 12:
                ci.nb nbVar = (ci.nb) ((ci.q6) this.f1933b);
                ci.lc lcVar = nbVar.A2;
                lcVar.X0.q((MessageObject) obj);
                ci.l8 l8Var = lcVar.K1;
                if (l8Var != null && lcVar.O1 != 1) {
                    boolean isEmpty = TextUtils.isEmpty(l8Var.f5443y);
                    boolean z15 = !isEmpty;
                    ((hh0) lcVar.f5490j1.f5908c).a(!lcVar.X0.k(), false);
                    lcVar.f5490j1.setVisibility(0);
                    ViewPropertyAnimator animate = lcVar.f5490j1.animate();
                    if (!isEmpty) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    animate.alpha(f7).withEndAction(new bi.f(5, nbVar, z15)).start();
                }
                if (lcVar.A0.j()) {
                    ArrayList arrayList3 = lcVar.A0.h;
                    int size = arrayList3.size();
                    while (true) {
                        if (i12 < size) {
                            Object obj2 = arrayList3.get(i12);
                            i12++;
                            ci.l8 l8Var2 = ((ci.d0) obj2).f4890n;
                            if (l8Var2 != null && l8Var2.K) {
                                if (!TextUtils.isEmpty(lcVar.K1.f5443y)) {
                                    i10 = 2;
                                }
                            }
                        }
                    }
                }
                i10 = -1;
                lcVar.k0(i10, true, true);
                return;
            case 13:
                ci.k8 k8Var = (ci.k8) obj;
                z71 z71Var = ((ci.b7) this.f1933b).f4773n;
                if (z71Var != null) {
                    z71Var.setHDRInfo(k8Var);
                    return;
                }
                return;
            case 14:
                ci.d8.T((ci.d8) this.f1933b, (Long) obj);
                return;
            case 15:
                ci.u8 u8Var = (ci.u8) this.f1933b;
                qg.n0 n0Var = (qg.n0) obj;
                if (n0Var == null) {
                    u8Var.V();
                    return;
                }
                u8Var.f6092o0 = n0Var.f46423e;
                u8Var.f6091n0 = n0Var.f46424f;
                return;
            case 16:
                ((ci.u9) this.f1933b).f6095n.W.H = ((Integer) obj).intValue();
                return;
            case 17:
                ((ci.gb) this.f1933b).h((Utilities.Callback) obj);
                return;
            case 18:
                ei.u uVar = (ei.u) this.f1933b;
                ArrayList arrayList4 = uVar.f9384b;
                arrayList4.clear();
                arrayList4.addAll((ArrayList) obj);
                k71 k71Var = uVar.f9383a;
                if (k71Var != null && (c71Var = k71Var.W2) != null) {
                    c71Var.N(true);
                    return;
                }
                return;
            case 19:
                fi.f fVar = (fi.f) this.f1933b;
                ArrayList arrayList5 = (ArrayList) obj;
                ArrayList arrayList6 = fVar.h;
                z14 = (arrayList6 == null || arrayList6.isEmpty()) ? true : true;
                fVar.h = arrayList5;
                k71 k71Var2 = fVar.f9963e;
                if (k71Var2 != null) {
                    k71Var2.W2.N(z14);
                    return;
                }
                return;
            case 20:
                ((gg.m) this.f1933b).L((TLRPC.User) obj);
                return;
            case 21:
                TLRPC.User user2 = (TLRPC.User) obj;
                wo0 wo0Var = (wo0) ((gg.h0) this.f1933b);
                dy dyVar = wo0Var.K0;
                if (user2 != null) {
                    ty tyVar = dyVar.J0;
                    if (tyVar != null) {
                        tyVar.H3();
                    }
                    MessagesController.getInstance(dyVar.H0).openApp(user2, 0);
                    wo0Var.R(user2.f20185id, user2);
                    return;
                }
                return;
            case 22:
                hg.n nVar = (hg.n) this.f1933b;
                if (((Integer) obj).intValue() > AndroidUtilities.dp(20.0f)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (nVar.F != z11) {
                    nVar.F = z11;
                    if (!z11) {
                        nVar.f26290a.x0(0);
                        return;
                    }
                    return;
                }
                return;
            case 23:
                Object[] objArr = (Object[]) obj;
                AndroidUtilities.forEachViews((RecyclerView) ((hg.j0) this.f1933b).f11276s, (Utilities.Callback<View>) new i(3));
                return;
            case 24:
                hg.u0 u0Var = (hg.u0) this.f1933b;
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                u0Var.G = connectedbots;
                if (connectedbots != null && !connectedbots.connected_bots.isEmpty()) {
                    tL_connectedBot = u0Var.G.connected_bots.get(0);
                } else {
                    tL_connectedBot = null;
                }
                u0Var.H = tL_connectedBot;
                if (tL_connectedBot == null) {
                    user = null;
                } else {
                    user = u0Var.getMessagesController().getUser(Long.valueOf(u0Var.H.bot_id));
                }
                u0Var.M = user;
                TL_account.TL_connectedBot tL_connectedBot2 = u0Var.H;
                if (tL_connectedBot2 != null) {
                    makeDefault = TL_account.TL_businessBotRights.clone(tL_connectedBot2.rights);
                } else {
                    makeDefault = TL_account.TL_businessBotRights.makeDefault();
                }
                u0Var.J = makeDefault;
                TL_account.TL_connectedBot tL_connectedBot3 = u0Var.H;
                if (tL_connectedBot3 != null) {
                    z12 = tL_connectedBot3.recipients.exclude_selected;
                } else {
                    z12 = true;
                }
                u0Var.I = z12;
                hg.b0 b0Var = u0Var.v;
                if (b0Var != null) {
                    if (tL_connectedBot3 != null) {
                        tL_businessBotRecipients = tL_connectedBot3.recipients;
                    }
                    b0Var.i(tL_businessBotRecipients);
                }
                k71 k71Var3 = u0Var.f11401c;
                if (k71Var3 != null && (c71Var2 = k71Var3.W2) != null) {
                    z13 = true;
                    c71Var2.N(true);
                } else {
                    z13 = true;
                }
                u0Var.Y(z13);
                u0Var.T = z13;
                return;
            case 25:
                hg.w0 w0Var = (hg.w0) this.f1933b;
                w0Var.f11429w = w0Var.f11424e[((Integer) obj).intValue()];
                w0Var.V(true);
                return;
            case 26:
                hg.z1 z1Var = (hg.z1) this.f1933b;
                z1Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt("chatMode", 5);
                bundle.putLong("user_id", z1Var.getUserConfig().getClientUserId());
                bundle.putString("quick_reply", (String) obj);
                zn znVar = new zn(bundle);
                znVar.C9 = true;
                z1Var.presentFragment(znVar);
                return;
            case 27:
                AndroidUtilities.hideKeyboard((hg.s1) this.f1933b);
                AndroidUtilities.runOnUIThread((Runnable) obj, 80L);
                return;
            case 28:
                ii.o3 o3Var = (ii.o3) this.f1933b;
                TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj;
                int i13 = o3Var.f12605b;
                int i14 = o3Var.f12604a;
                ii.x3 x3Var = o3Var.f12607e;
                if (richMessage != null) {
                    ArrayList arrayList7 = x3Var.j3;
                    ArrayList arrayList8 = x3Var.j3;
                    if (i14 < arrayList7.size() && i13 < arrayList8.size()) {
                        ii.i2 i2Var = x3Var.H3;
                        if (i2Var != null) {
                            i2Var.d();
                        }
                        ii.k3 k3Var = x3Var.f12820l3;
                        if (k3Var != null) {
                            k3Var.f(false);
                        }
                        ii.a aVar2 = (ii.a) arrayList8.get(i14);
                        ii.a aVar3 = (ii.a) arrayList8.get(i13);
                        CharSequence charSequence = "";
                        if (!ii.x3.B3(aVar2.f12234b)) {
                            editable = "";
                        } else {
                            editable = x3Var.N4(aVar2);
                        }
                        if (ii.x3.B3(aVar3.f12234b)) {
                            charSequence = x3Var.N4(aVar3);
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(editable.subSequence(0, Math.max(0, Math.min(o3Var.f12606c, editable.length()))));
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence.subSequence(Math.max(0, Math.min(o3Var.d, charSequence.length())), charSequence.length()));
                        ArrayList arrayList9 = new ArrayList();
                        ii.x3.X2(arrayList9, richMessage.blocks, null);
                        if (arrayList9.isEmpty()) {
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder);
                            spannableStringBuilder3.append((CharSequence) spannableStringBuilder2);
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            ii.f6.d(pageblockparagraph, spannableStringBuilder3);
                            arrayList9.add(new ii.a(pageblockparagraph, aVar2.f12235c, aVar2.d));
                        } else {
                            if (spannableStringBuilder.length() > 0) {
                                ii.a aVar4 = (ii.a) arrayList9.get(0);
                                if (ii.x3.B3(aVar4.f12234b)) {
                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(spannableStringBuilder);
                                    spannableStringBuilder4.append((CharSequence) ii.f6.A(aVar4.f12234b));
                                    ii.f6.d(aVar4.f12234b, spannableStringBuilder4);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                    ii.f6.d(pageblockparagraph2, spannableStringBuilder);
                                    arrayList9.add(0, new ii.a(pageblockparagraph2, aVar2.f12235c, aVar2.d));
                                }
                            }
                            if (spannableStringBuilder2.length() > 0) {
                                ii.a aVar5 = (ii.a) hg.c.g(1, arrayList9);
                                if (ii.x3.B3(aVar5.f12234b)) {
                                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(ii.f6.A(aVar5.f12234b));
                                    spannableStringBuilder5.append((CharSequence) spannableStringBuilder2);
                                    ii.f6.d(aVar5.f12234b, spannableStringBuilder5);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph3 = new TL_iv.pageBlockParagraph();
                                    ii.f6.d(pageblockparagraph3, spannableStringBuilder2);
                                    arrayList9.add(new ii.a(pageblockparagraph3, aVar3.f12235c, aVar3.d));
                                }
                            }
                        }
                        TL_iv.RichMessage richMessage2 = x3Var.f12815i3;
                        if (richMessage2 == null) {
                            x3Var.f12815i3 = richMessage;
                        } else {
                            ArrayList<TLRPC.Photo> arrayList10 = richMessage.photos;
                            if (arrayList10 != null) {
                                richMessage2.photos.addAll(arrayList10);
                            }
                            ArrayList<TLRPC.Document> arrayList11 = richMessage.documents;
                            if (arrayList11 != null) {
                                x3Var.f12815i3.documents.addAll(arrayList11);
                            }
                        }
                        for (int i15 = 0; i15 < arrayList9.size(); i15++) {
                            x3Var.w4((ii.a) arrayList9.get(i15));
                        }
                        while (i13 >= i14) {
                            arrayList8.remove(i13);
                            i13--;
                        }
                        arrayList8.addAll(i14, arrayList9);
                        x3Var.t4();
                        x3Var.W2.N(false);
                        ii.i2 i2Var2 = x3Var.H3;
                        if (i2Var2 != null) {
                            i2Var2.h();
                        }
                        x3Var.f12809f3.onContentChanged();
                        if (!arrayList9.isEmpty()) {
                            aVar = (ii.a) hg.c.g(1, arrayList9);
                        }
                        x3Var.post(new gg.w1(16, o3Var, aVar));
                        return;
                    }
                    return;
                }
                return;
            default:
                ((ii.m) this.f1933b).f12561a.f12650r.V1((TL_iv.RichMessage) obj);
                return;
        }
    }
}
