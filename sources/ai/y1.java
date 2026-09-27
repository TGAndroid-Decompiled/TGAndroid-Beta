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
import org.telegram.ui.Components.fo0;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.sg0;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.x51;
import org.telegram.ui.ay;
import org.telegram.ui.ty;
import org.telegram.ui.xn;
public final class y1 implements Utilities.Callback {
    public final int f1741a;
    public final Object f1742b;

    public y1(Object obj, int i10) {
        this.f1741a = i10;
        this.f1742b = obj;
    }

    @Override
    public final void run(Object obj) {
        String str;
        boolean z10;
        int i10;
        float f7;
        l61 l61Var;
        boolean z11;
        TL_account.TL_connectedBot tL_connectedBot;
        TLRPC.User user;
        TL_account.TL_businessBotRights makeDefault;
        boolean z12;
        boolean z13;
        l61 l61Var2;
        Editable editable;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = null;
        ii.a aVar = null;
        int i11 = 0;
        boolean z14 = false;
        int i12 = 0;
        switch (this.f1741a) {
            case 0:
                d2 d2Var = (d2) this.f1742b;
                if (((Boolean) obj).booleanValue() && !d2Var.f704w) {
                    d2Var.f701n = true;
                    d2Var.I = true;
                    d2Var.u(false);
                    d2.W = d2Var;
                    d2Var.J = NativeInstance.createVideoCapturer(d2Var.H, d2Var.I ? 1 : 0);
                    if (d2Var.E != null) {
                        DispatchQueue dispatchQueue = Utilities.globalQueue;
                        NativeInstance nativeInstance = d2Var.E;
                        Objects.requireNonNull(nativeInstance);
                        dispatchQueue.postRunnable(new org.telegram.messenger.voip.r0(nativeInstance, 3));
                        d2Var.M.clear();
                        d2Var.E = null;
                    }
                    d2Var.c();
                    d2Var.k();
                    NotificationCenter.getInstance(d2Var.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(d2Var.f700f.f18346id));
                    return;
                }
                return;
            case 1:
                jc jcVar = (jc) this.f1742b;
                Boolean bool = (Boolean) obj;
                jcVar.f1085k1 = false;
                jcVar.P();
                return;
            case 2:
                k7 k7Var = (k7) obj;
                s7 s7Var = ((p7) this.f1742b).e;
                while (true) {
                    ArrayList arrayList = s7Var.G;
                    if (i11 < arrayList.size()) {
                        if (k7Var != arrayList.get(i11)) {
                            ((k7) arrayList.get(i11)).getClass();
                        }
                        i11++;
                    } else {
                        return;
                    }
                }
            case 3:
                sa saVar = (sa) this.f1742b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                saVar.f1526p = true;
                if (storyItem != null && (str = storyItem.caption) != null) {
                    saVar.f1523m = true;
                    saVar.f1522l = str;
                    saVar.f1517f = TextUtils.isEmpty(str);
                    View view = saVar.f1528r;
                    if (view != null) {
                        view.invalidate();
                    }
                    Runnable runnable = saVar.f1529s;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                bi.z zVar = (bi.z) this.f1742b;
                String str2 = (String) obj;
                ArrayList arrayList2 = zVar.h;
                if (!arrayList2.contains(str2)) {
                    arrayList2.add(str2);
                    zVar.i(true);
                }
                AndroidUtilities.runOnUIThread(new ba(7, zVar, str2), 120L);
                return;
            case 5:
                ((ci.m) this.f1742b).x(((Integer) obj).intValue());
                return;
            case 6:
                ci.e0 e0Var = (ci.e0) this.f1742b;
                e0Var.f4583j0.f4515n.P = ((Float) obj).floatValue();
                ci.d0 d0Var = e0Var.f4583j0;
                ci.c0 c0Var = d0Var.d;
                if (c0Var != null) {
                    c0Var.setVolume(d0Var.f4515n.P);
                    return;
                }
                return;
            case 7:
                ci.r0 r0Var = (ci.r0) this.f1742b;
                VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
                MessageObject messageObject = r0Var.f5419c;
                if (messageObject != null) {
                    messageObject.videoEditedInfo = videoEditedInfo;
                    MediaController.getInstance().scheduleVideoConvert(r0Var.f5419c);
                    return;
                }
                return;
            case 8:
                ci.x2 x2Var = (ci.x2) this.f1742b;
                x2Var.h(-1.0f);
                AndroidUtilities.runOnUIThread(new ba(16, x2Var, (Runnable) obj), 80L);
                return;
            case 9:
                ((ci.w3) this.f1742b).f5778s.animate().translationY(((-((Integer) obj).intValue()) / 2.0f) + AndroidUtilities.dp(80.0f)).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.q1.f19718w).start();
                return;
            case 10:
                ci.t4 t4Var = (ci.t4) this.f1742b;
                View view2 = (View) obj;
                ci.o4 o4Var = t4Var.f5542b;
                if (view2 instanceof ci.s4) {
                    o4Var.getClass();
                    int S = RecyclerView.S(view2);
                    x51 G = o4Var.Y2.G(S);
                    if (G != null) {
                        ci.s4 s4Var = (ci.s4) view2;
                        s4Var.setPosition(t4Var.b(S));
                        if (t4Var.f5544f == G.d) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        s4Var.b(z10, true);
                        boolean contains = t4Var.e.contains(Integer.valueOf(G.d));
                        if (s4Var.f5490f != contains) {
                            s4Var.f5490f = contains;
                            s4Var.invalidate();
                        }
                        view2.setPressed(false);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                ci.o4 o4Var2 = (ci.o4) this.f1742b;
                View view3 = (View) obj;
                if (view3 instanceof ci.s4) {
                    ci.bb bbVar = o4Var2.f5249f3;
                    bbVar.f5542b.getClass();
                    ((ci.s4) view3).setPosition(bbVar.b(RecyclerView.S(view3)));
                    view3.setPressed(false);
                    return;
                }
                return;
            case 12:
                ci.mb mbVar = (ci.mb) ((ci.q6) this.f1742b);
                ci.kc kcVar = mbVar.A2;
                kcVar.X0.q((MessageObject) obj);
                ci.k8 k8Var = kcVar.K1;
                if (k8Var != null && kcVar.O1 != 1) {
                    boolean isEmpty = TextUtils.isEmpty(k8Var.f4968y);
                    boolean z15 = !isEmpty;
                    ((sg0) kcVar.f5013j1.f5455c).a(!kcVar.X0.k(), false);
                    kcVar.f5013j1.setVisibility(0);
                    ViewPropertyAnimator animate = kcVar.f5013j1.animate();
                    if (!isEmpty) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    animate.alpha(f7).withEndAction(new bi.f(5, mbVar, z15)).start();
                }
                if (kcVar.A0.j()) {
                    ArrayList arrayList3 = kcVar.A0.h;
                    int size = arrayList3.size();
                    while (true) {
                        if (i12 < size) {
                            Object obj2 = arrayList3.get(i12);
                            i12++;
                            ci.k8 k8Var2 = ((ci.d0) obj2).f4515n;
                            if (k8Var2 != null && k8Var2.K) {
                                if (!TextUtils.isEmpty(kcVar.K1.f4968y)) {
                                    i10 = 2;
                                }
                            }
                        }
                    }
                }
                i10 = -1;
                kcVar.l0(i10, true, true);
                return;
            case 13:
                ci.j8 j8Var = (ci.j8) obj;
                k71 k71Var = ((ci.b7) this.f1742b).f4397n;
                if (k71Var != null) {
                    k71Var.setHDRInfo(j8Var);
                    return;
                }
                return;
            case 14:
                ci.c8.P((ci.c8) this.f1742b, (Long) obj);
                return;
            case 15:
                ci.t8 t8Var = (ci.t8) this.f1742b;
                qg.n0 n0Var = (qg.n0) obj;
                if (n0Var == null) {
                    t8Var.U();
                    return;
                }
                t8Var.f5586o0 = n0Var.e;
                t8Var.f5585n0 = n0Var.f41842f;
                return;
            case 16:
                ((ci.t9) this.f1742b).f5588n.W.H = ((Integer) obj).intValue();
                return;
            case 17:
                ((ci.fb) this.f1742b).g((Utilities.Callback) obj);
                return;
            case 18:
                ei.u uVar = (ei.u) this.f1742b;
                ArrayList arrayList4 = uVar.f8623b;
                arrayList4.clear();
                arrayList4.addAll((ArrayList) obj);
                t61 t61Var = uVar.f8622a;
                if (t61Var != null && (l61Var = t61Var.Y2) != null) {
                    l61Var.N(true);
                    return;
                }
                return;
            case 19:
                fi.f fVar = (fi.f) this.f1742b;
                ArrayList arrayList5 = (ArrayList) obj;
                ArrayList arrayList6 = fVar.h;
                z14 = (arrayList6 == null || arrayList6.isEmpty()) ? true : true;
                fVar.h = arrayList5;
                t61 t61Var2 = fVar.e;
                if (t61Var2 != null) {
                    t61Var2.Y2.N(z14);
                    return;
                }
                return;
            case 20:
                ((gg.m) this.f1742b).L((TLRPC.User) obj);
                return;
            case 21:
                TLRPC.User user2 = (TLRPC.User) obj;
                fo0 fo0Var = (fo0) ((gg.i0) this.f1742b);
                ay ayVar = fo0Var.K0;
                if (user2 != null) {
                    ty tyVar = ayVar.K0;
                    if (tyVar != null) {
                        tyVar.T3();
                    }
                    MessagesController.getInstance(ayVar.I0).openApp(user2, 0);
                    fo0Var.R(user2.f18476id, user2);
                    return;
                }
                return;
            case 22:
                hg.m mVar = (hg.m) this.f1742b;
                if (((Integer) obj).intValue() > AndroidUtilities.dp(20.0f)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (mVar.G != z11) {
                    mVar.G = z11;
                    if (!z11) {
                        mVar.f27008a.y0(0);
                        return;
                    }
                    return;
                }
                return;
            case 23:
                Object[] objArr = (Object[]) obj;
                AndroidUtilities.forEachViews((RecyclerView) ((hg.i0) this.f1742b).f10300s, (Utilities.Callback<View>) new i(3));
                return;
            case 24:
                hg.u0 u0Var = (hg.u0) this.f1742b;
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
                hg.a0 a0Var = u0Var.v;
                if (a0Var != null) {
                    if (tL_connectedBot3 != null) {
                        tL_businessBotRecipients = tL_connectedBot3.recipients;
                    }
                    a0Var.i(tL_businessBotRecipients);
                }
                t61 t61Var3 = u0Var.f10422c;
                if (t61Var3 != null && (l61Var2 = t61Var3.Y2) != null) {
                    z13 = true;
                    l61Var2.N(true);
                } else {
                    z13 = true;
                }
                u0Var.Y(z13);
                u0Var.T = z13;
                return;
            case 25:
                hg.w0 w0Var = (hg.w0) this.f1742b;
                w0Var.f10454w = w0Var.e[((Integer) obj).intValue()];
                w0Var.V(true);
                return;
            case 26:
                hg.y1 y1Var = (hg.y1) this.f1742b;
                y1Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt("chatMode", 5);
                bundle.putLong("user_id", y1Var.getUserConfig().getClientUserId());
                bundle.putString("quick_reply", (String) obj);
                xn xnVar = new xn(bundle);
                xnVar.C9 = true;
                y1Var.presentFragment(xnVar);
                return;
            case 27:
                AndroidUtilities.hideKeyboard((hg.r1) this.f1742b);
                AndroidUtilities.runOnUIThread((Runnable) obj, 80L);
                return;
            case 28:
                ii.o3 o3Var = (ii.o3) this.f1742b;
                TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj;
                int i13 = o3Var.f11532b;
                int i14 = o3Var.f11531a;
                ii.x3 x3Var = o3Var.e;
                if (richMessage != null) {
                    ArrayList arrayList7 = x3Var.f11738l3;
                    ArrayList arrayList8 = x3Var.f11738l3;
                    if (i14 < arrayList7.size() && i13 < arrayList8.size()) {
                        ii.i2 i2Var = x3Var.J3;
                        if (i2Var != null) {
                            i2Var.d();
                        }
                        ii.k3 k3Var = x3Var.f11741n3;
                        if (k3Var != null) {
                            k3Var.f(false);
                        }
                        ii.a aVar2 = (ii.a) arrayList8.get(i14);
                        ii.a aVar3 = (ii.a) arrayList8.get(i13);
                        CharSequence charSequence = "";
                        if (!ii.x3.B3(aVar2.f11194b)) {
                            editable = "";
                        } else {
                            editable = x3Var.N4(aVar2);
                        }
                        if (ii.x3.B3(aVar3.f11194b)) {
                            charSequence = x3Var.N4(aVar3);
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(editable.subSequence(0, Math.max(0, Math.min(o3Var.f11533c, editable.length()))));
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence.subSequence(Math.max(0, Math.min(o3Var.d, charSequence.length())), charSequence.length()));
                        ArrayList arrayList9 = new ArrayList();
                        ii.x3.X2(arrayList9, richMessage.blocks, null);
                        if (arrayList9.isEmpty()) {
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder);
                            spannableStringBuilder3.append((CharSequence) spannableStringBuilder2);
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            ii.e6.d(pageblockparagraph, spannableStringBuilder3);
                            arrayList9.add(new ii.a(pageblockparagraph, aVar2.f11195c, aVar2.d));
                        } else {
                            if (spannableStringBuilder.length() > 0) {
                                ii.a aVar4 = (ii.a) arrayList9.get(0);
                                if (ii.x3.B3(aVar4.f11194b)) {
                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(spannableStringBuilder);
                                    spannableStringBuilder4.append((CharSequence) ii.e6.A(aVar4.f11194b));
                                    ii.e6.d(aVar4.f11194b, spannableStringBuilder4);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                    ii.e6.d(pageblockparagraph2, spannableStringBuilder);
                                    arrayList9.add(0, new ii.a(pageblockparagraph2, aVar2.f11195c, aVar2.d));
                                }
                            }
                            if (spannableStringBuilder2.length() > 0) {
                                ii.a aVar5 = (ii.a) hg.k0.g(1, arrayList9);
                                if (ii.x3.B3(aVar5.f11194b)) {
                                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(ii.e6.A(aVar5.f11194b));
                                    spannableStringBuilder5.append((CharSequence) spannableStringBuilder2);
                                    ii.e6.d(aVar5.f11194b, spannableStringBuilder5);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph3 = new TL_iv.pageBlockParagraph();
                                    ii.e6.d(pageblockparagraph3, spannableStringBuilder2);
                                    arrayList9.add(new ii.a(pageblockparagraph3, aVar3.f11195c, aVar3.d));
                                }
                            }
                        }
                        TL_iv.RichMessage richMessage2 = x3Var.f11736k3;
                        if (richMessage2 == null) {
                            x3Var.f11736k3 = richMessage;
                        } else {
                            ArrayList<TLRPC.Photo> arrayList10 = richMessage.photos;
                            if (arrayList10 != null) {
                                richMessage2.photos.addAll(arrayList10);
                            }
                            ArrayList<TLRPC.Document> arrayList11 = richMessage.documents;
                            if (arrayList11 != null) {
                                x3Var.f11736k3.documents.addAll(arrayList11);
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
                        x3Var.Y2.N(false);
                        ii.i2 i2Var2 = x3Var.J3;
                        if (i2Var2 != null) {
                            i2Var2.h();
                        }
                        x3Var.f11731h3.onContentChanged();
                        if (!arrayList9.isEmpty()) {
                            aVar = (ii.a) hg.k0.g(1, arrayList9);
                        }
                        x3Var.post(new gg.x1(16, o3Var, aVar));
                        return;
                    }
                    return;
                }
                return;
            default:
                ((ii.m) this.f1742b).f11496a.f11575r.V1((TL_iv.RichMessage) obj);
                return;
        }
    }
}
