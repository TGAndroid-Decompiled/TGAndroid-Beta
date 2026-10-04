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
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.jo0;
import org.telegram.ui.Components.sg0;
import org.telegram.ui.Components.t71;
import org.telegram.ui.Components.u61;
import org.telegram.ui.dy;
import org.telegram.ui.uy;
import org.telegram.ui.yn;
public final class y1 implements Utilities.Callback {
    public final int f1892a;
    public final Object f1893b;

    public y1(Object obj, int i10) {
        this.f1892a = i10;
        this.f1893b = obj;
    }

    @Override
    public final void run(Object obj) {
        String str;
        boolean z10;
        int i10;
        float f7;
        u61 u61Var;
        boolean z11;
        TL_account.TL_connectedBot tL_connectedBot;
        TLRPC.User user;
        TL_account.TL_businessBotRights makeDefault;
        boolean z12;
        boolean z13;
        u61 u61Var2;
        Editable editable;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = null;
        ii.a aVar = null;
        int i11 = 0;
        boolean z14 = false;
        int i12 = 0;
        switch (this.f1892a) {
            case 0:
                d2 d2Var = (d2) this.f1893b;
                if (((Boolean) obj).booleanValue() && !d2Var.f761w) {
                    d2Var.f758n = true;
                    d2Var.I = true;
                    d2Var.u(false);
                    d2.W = d2Var;
                    d2Var.J = NativeInstance.createVideoCapturer(d2Var.H, d2Var.I ? 1 : 0);
                    if (d2Var.E != null) {
                        DispatchQueue dispatchQueue = Utilities.globalQueue;
                        NativeInstance nativeInstance = d2Var.E;
                        Objects.requireNonNull(nativeInstance);
                        dispatchQueue.postRunnable(new org.telegram.messenger.voip.s0(nativeInstance, 3));
                        d2Var.M.clear();
                        d2Var.E = null;
                    }
                    d2Var.c();
                    d2Var.k();
                    NotificationCenter.getInstance(d2Var.f756e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(d2Var.f757f.f20055id));
                    return;
                }
                return;
            case 1:
                jc jcVar = (jc) this.f1893b;
                Boolean bool = (Boolean) obj;
                jcVar.f1170k1 = false;
                jcVar.P();
                return;
            case 2:
                k7 k7Var = (k7) obj;
                s7 s7Var = ((p7) this.f1893b).f1511e;
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
                sa saVar = (sa) this.f1893b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                saVar.f1659p = true;
                if (storyItem != null && (str = storyItem.caption) != null) {
                    saVar.f1656m = true;
                    saVar.f1655l = str;
                    saVar.f1650f = TextUtils.isEmpty(str);
                    View view = saVar.f1661r;
                    if (view != null) {
                        view.invalidate();
                    }
                    Runnable runnable = saVar.f1662s;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                bi.z zVar = (bi.z) this.f1893b;
                String str2 = (String) obj;
                ArrayList arrayList2 = zVar.h;
                if (!arrayList2.contains(str2)) {
                    arrayList2.add(str2);
                    zVar.i(true);
                }
                AndroidUtilities.runOnUIThread(new ba(7, zVar, str2), 120L);
                return;
            case 5:
                ((ci.m) this.f1893b).x(((Integer) obj).intValue());
                return;
            case 6:
                ci.e0 e0Var = (ci.e0) this.f1893b;
                e0Var.f4952j0.f4879n.P = ((Float) obj).floatValue();
                ci.d0 d0Var = e0Var.f4952j0;
                ci.c0 c0Var = d0Var.d;
                if (c0Var != null) {
                    c0Var.setVolume(d0Var.f4879n.P);
                    return;
                }
                return;
            case 7:
                ci.r0 r0Var = (ci.r0) this.f1893b;
                VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
                MessageObject messageObject = r0Var.f5829c;
                if (messageObject != null) {
                    messageObject.videoEditedInfo = videoEditedInfo;
                    MediaController.getInstance().scheduleVideoConvert(r0Var.f5829c);
                    return;
                }
                return;
            case 8:
                ci.x2 x2Var = (ci.x2) this.f1893b;
                x2Var.h(-1.0f);
                AndroidUtilities.runOnUIThread(new ba(16, x2Var, (Runnable) obj), 80L);
                return;
            case 9:
                ((ci.w3) this.f1893b).f6223s.animate().translationY(((-((Integer) obj).intValue()) / 2.0f) + AndroidUtilities.dp(80.0f)).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.p1.f21444w).start();
                return;
            case 10:
                ci.t4 t4Var = (ci.t4) this.f1893b;
                View view2 = (View) obj;
                ci.o4 o4Var = t4Var.f5963b;
                if (view2 instanceof ci.s4) {
                    o4Var.getClass();
                    int R = RecyclerView.R(view2);
                    g61 G = o4Var.f25245f3.G(R);
                    if (G != null) {
                        ci.s4 s4Var = (ci.s4) view2;
                        s4Var.setPosition(t4Var.b(R));
                        if (t4Var.f5966f == G.d) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        s4Var.b(z10, true);
                        boolean contains = t4Var.f5965e.contains(Integer.valueOf(G.d));
                        if (s4Var.f5906f != contains) {
                            s4Var.f5906f = contains;
                            s4Var.invalidate();
                        }
                        view2.setPressed(false);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                ci.o4 o4Var2 = (ci.o4) this.f1893b;
                View view3 = (View) obj;
                if (view3 instanceof ci.s4) {
                    ci.bb bbVar = o4Var2.f5651m3;
                    bbVar.f5963b.getClass();
                    ((ci.s4) view3).setPosition(bbVar.b(RecyclerView.R(view3)));
                    view3.setPressed(false);
                    return;
                }
                return;
            case 12:
                ci.mb mbVar = (ci.mb) ((ci.q6) this.f1893b);
                ci.kc kcVar = mbVar.A2;
                kcVar.X0.q((MessageObject) obj);
                ci.k8 k8Var = kcVar.K1;
                if (k8Var != null && kcVar.O1 != 1) {
                    boolean isEmpty = TextUtils.isEmpty(k8Var.f5358y);
                    boolean z15 = !isEmpty;
                    ((sg0) kcVar.f5405j1.f5868c).a(!kcVar.X0.k(), false);
                    kcVar.f5405j1.setVisibility(0);
                    ViewPropertyAnimator animate = kcVar.f5405j1.animate();
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
                            ci.k8 k8Var2 = ((ci.d0) obj2).f4879n;
                            if (k8Var2 != null && k8Var2.K) {
                                if (!TextUtils.isEmpty(kcVar.K1.f5358y)) {
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
                t71 t71Var = ((ci.b7) this.f1893b).f4754n;
                if (t71Var != null) {
                    t71Var.setHDRInfo(j8Var);
                    return;
                }
                return;
            case 14:
                ci.c8.N((ci.c8) this.f1893b, (Long) obj);
                return;
            case 15:
                ci.t8 t8Var = (ci.t8) this.f1893b;
                qg.n0 n0Var = (qg.n0) obj;
                if (n0Var == null) {
                    t8Var.S();
                    return;
                }
                t8Var.f6010o0 = n0Var.f45204e;
                t8Var.f6009n0 = n0Var.f45205f;
                return;
            case 16:
                ((ci.t9) this.f1893b).f6013n.W.H = ((Integer) obj).intValue();
                return;
            case 17:
                ((ci.fb) this.f1893b).g((Utilities.Callback) obj);
                return;
            case 18:
                ei.v vVar = (ei.v) this.f1893b;
                ArrayList arrayList4 = vVar.f9380b;
                arrayList4.clear();
                arrayList4.addAll((ArrayList) obj);
                c71 c71Var = vVar.f9379a;
                if (c71Var != null && (u61Var = c71Var.f25245f3) != null) {
                    u61Var.N(true);
                    return;
                }
                return;
            case 19:
                fi.f fVar = (fi.f) this.f1893b;
                ArrayList arrayList5 = (ArrayList) obj;
                ArrayList arrayList6 = fVar.h;
                z14 = (arrayList6 == null || arrayList6.isEmpty()) ? true : true;
                fVar.h = arrayList5;
                c71 c71Var2 = fVar.f9887e;
                if (c71Var2 != null) {
                    c71Var2.f25245f3.N(z14);
                    return;
                }
                return;
            case 20:
                ((gg.m) this.f1893b).L((TLRPC.User) obj);
                return;
            case 21:
                TLRPC.User user2 = (TLRPC.User) obj;
                jo0 jo0Var = (jo0) ((gg.i0) this.f1893b);
                dy dyVar = jo0Var.K0;
                if (user2 != null) {
                    uy uyVar = dyVar.K0;
                    if (uyVar != null) {
                        uyVar.T3();
                    }
                    MessagesController.getInstance(dyVar.I0).openApp(user2, 0);
                    jo0Var.R(user2.f20185id, user2);
                    return;
                }
                return;
            case 22:
                hg.m mVar = (hg.m) this.f1893b;
                if (((Integer) obj).intValue() > AndroidUtilities.dp(20.0f)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (mVar.G != z11) {
                    mVar.G = z11;
                    if (!z11) {
                        mVar.f32725a.y0(0);
                        return;
                    }
                    return;
                }
                return;
            case 23:
                Object[] objArr = (Object[]) obj;
                AndroidUtilities.forEachViews((RecyclerView) ((hg.i0) this.f1893b).f11216s, (Utilities.Callback<View>) new i(3));
                return;
            case 24:
                hg.u0 u0Var = (hg.u0) this.f1893b;
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
                c71 c71Var3 = u0Var.f11350c;
                if (c71Var3 != null && (u61Var2 = c71Var3.f25245f3) != null) {
                    z13 = true;
                    u61Var2.N(true);
                } else {
                    z13 = true;
                }
                u0Var.X(z13);
                u0Var.T = z13;
                return;
            case 25:
                hg.w0 w0Var = (hg.w0) this.f1893b;
                w0Var.f11387w = w0Var.f11382e[((Integer) obj).intValue()];
                w0Var.T(true);
                return;
            case 26:
                hg.y1 y1Var = (hg.y1) this.f1893b;
                y1Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt("chatMode", 5);
                bundle.putLong("user_id", y1Var.getUserConfig().getClientUserId());
                bundle.putString("quick_reply", (String) obj);
                yn ynVar = new yn(bundle);
                ynVar.A9 = true;
                y1Var.presentFragment(ynVar);
                return;
            case 27:
                AndroidUtilities.hideKeyboard((hg.r1) this.f1893b);
                AndroidUtilities.runOnUIThread((Runnable) obj, 80L);
                return;
            case 28:
                ii.o3 o3Var = (ii.o3) this.f1893b;
                TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj;
                int i13 = o3Var.f12557b;
                int i14 = o3Var.f12556a;
                ii.x3 x3Var = o3Var.f12559e;
                if (richMessage != null) {
                    ArrayList arrayList7 = x3Var.f12777s3;
                    ArrayList arrayList8 = x3Var.f12777s3;
                    if (i14 < arrayList7.size() && i13 < arrayList8.size()) {
                        ii.i2 i2Var = x3Var.Q3;
                        if (i2Var != null) {
                            i2Var.d();
                        }
                        ii.k3 k3Var = x3Var.f12781u3;
                        if (k3Var != null) {
                            k3Var.f(false);
                        }
                        ii.a aVar2 = (ii.a) arrayList8.get(i14);
                        ii.a aVar3 = (ii.a) arrayList8.get(i13);
                        CharSequence charSequence = "";
                        if (!ii.x3.C3(aVar2.f12186b)) {
                            editable = "";
                        } else {
                            editable = x3Var.O4(aVar2);
                        }
                        if (ii.x3.C3(aVar3.f12186b)) {
                            charSequence = x3Var.O4(aVar3);
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(editable.subSequence(0, Math.max(0, Math.min(o3Var.f12558c, editable.length()))));
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence.subSequence(Math.max(0, Math.min(o3Var.d, charSequence.length())), charSequence.length()));
                        ArrayList arrayList9 = new ArrayList();
                        ii.x3.Y2(arrayList9, richMessage.blocks, null);
                        if (arrayList9.isEmpty()) {
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder);
                            spannableStringBuilder3.append((CharSequence) spannableStringBuilder2);
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            ii.f6.d(pageblockparagraph, spannableStringBuilder3);
                            arrayList9.add(new ii.a(pageblockparagraph, aVar2.f12187c, aVar2.d));
                        } else {
                            if (spannableStringBuilder.length() > 0) {
                                ii.a aVar4 = (ii.a) arrayList9.get(0);
                                if (ii.x3.C3(aVar4.f12186b)) {
                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(spannableStringBuilder);
                                    spannableStringBuilder4.append((CharSequence) ii.f6.A(aVar4.f12186b));
                                    ii.f6.d(aVar4.f12186b, spannableStringBuilder4);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                    ii.f6.d(pageblockparagraph2, spannableStringBuilder);
                                    arrayList9.add(0, new ii.a(pageblockparagraph2, aVar2.f12187c, aVar2.d));
                                }
                            }
                            if (spannableStringBuilder2.length() > 0) {
                                ii.a aVar5 = (ii.a) hg.k0.g(1, arrayList9);
                                if (ii.x3.C3(aVar5.f12186b)) {
                                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(ii.f6.A(aVar5.f12186b));
                                    spannableStringBuilder5.append((CharSequence) spannableStringBuilder2);
                                    ii.f6.d(aVar5.f12186b, spannableStringBuilder5);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph3 = new TL_iv.pageBlockParagraph();
                                    ii.f6.d(pageblockparagraph3, spannableStringBuilder2);
                                    arrayList9.add(new ii.a(pageblockparagraph3, aVar3.f12187c, aVar3.d));
                                }
                            }
                        }
                        TL_iv.RichMessage richMessage2 = x3Var.f12775r3;
                        if (richMessage2 == null) {
                            x3Var.f12775r3 = richMessage;
                        } else {
                            ArrayList<TLRPC.Photo> arrayList10 = richMessage.photos;
                            if (arrayList10 != null) {
                                richMessage2.photos.addAll(arrayList10);
                            }
                            ArrayList<TLRPC.Document> arrayList11 = richMessage.documents;
                            if (arrayList11 != null) {
                                x3Var.f12775r3.documents.addAll(arrayList11);
                            }
                        }
                        for (int i15 = 0; i15 < arrayList9.size(); i15++) {
                            x3Var.x4((ii.a) arrayList9.get(i15));
                        }
                        while (i13 >= i14) {
                            arrayList8.remove(i13);
                            i13--;
                        }
                        arrayList8.addAll(i14, arrayList9);
                        x3Var.u4();
                        x3Var.f25245f3.N(false);
                        ii.i2 i2Var2 = x3Var.Q3;
                        if (i2Var2 != null) {
                            i2Var2.h();
                        }
                        x3Var.f12769o3.onContentChanged();
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
                ((ii.m) this.f1893b).f12515a.f12602r.W1((TL_iv.RichMessage) obj);
                return;
        }
    }
}
