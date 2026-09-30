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
import org.telegram.ui.Components.ho0;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.sg0;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.y51;
import org.telegram.ui.qy;
import org.telegram.ui.wn;
import org.telegram.ui.zx;
public final class y1 implements Utilities.Callback {
    public final int f1746a;
    public final Object f1747b;

    public y1(Object obj, int i10) {
        this.f1746a = i10;
        this.f1747b = obj;
    }

    @Override
    public final void run(Object obj) {
        String str;
        boolean z10;
        int i10;
        float f7;
        m61 m61Var;
        boolean z11;
        TL_account.TL_connectedBot tL_connectedBot;
        TLRPC.User user;
        TL_account.TL_businessBotRights makeDefault;
        boolean z12;
        boolean z13;
        m61 m61Var2;
        Editable editable;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = null;
        ii.a aVar = null;
        int i11 = 0;
        boolean z14 = false;
        int i12 = 0;
        switch (this.f1746a) {
            case 0:
                d2 d2Var = (d2) this.f1747b;
                if (((Boolean) obj).booleanValue() && !d2Var.f701w) {
                    d2Var.f698n = true;
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
                    NotificationCenter.getInstance(d2Var.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(d2Var.f697f.f18369id));
                    return;
                }
                return;
            case 1:
                jc jcVar = (jc) this.f1747b;
                Boolean bool = (Boolean) obj;
                jcVar.f1085k1 = false;
                jcVar.P();
                return;
            case 2:
                k7 k7Var = (k7) obj;
                s7 s7Var = ((p7) this.f1747b).e;
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
                sa saVar = (sa) this.f1747b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                saVar.f1529p = true;
                if (storyItem != null && (str = storyItem.caption) != null) {
                    saVar.f1526m = true;
                    saVar.f1525l = str;
                    saVar.f1520f = TextUtils.isEmpty(str);
                    View view = saVar.f1531r;
                    if (view != null) {
                        view.invalidate();
                    }
                    Runnable runnable = saVar.f1532s;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                bi.z zVar = (bi.z) this.f1747b;
                String str2 = (String) obj;
                ArrayList arrayList2 = zVar.h;
                if (!arrayList2.contains(str2)) {
                    arrayList2.add(str2);
                    zVar.i(true);
                }
                AndroidUtilities.runOnUIThread(new ba(7, zVar, str2), 120L);
                return;
            case 5:
                ((ci.m) this.f1747b).x(((Integer) obj).intValue());
                return;
            case 6:
                ci.e0 e0Var = (ci.e0) this.f1747b;
                e0Var.f4580j0.f4495n.P = ((Float) obj).floatValue();
                ci.d0 d0Var = e0Var.f4580j0;
                ci.c0 c0Var = d0Var.d;
                if (c0Var != null) {
                    c0Var.setVolume(d0Var.f4495n.P);
                    return;
                }
                return;
            case 7:
                ci.r0 r0Var = (ci.r0) this.f1747b;
                VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
                MessageObject messageObject = r0Var.f5431c;
                if (messageObject != null) {
                    messageObject.videoEditedInfo = videoEditedInfo;
                    MediaController.getInstance().scheduleVideoConvert(r0Var.f5431c);
                    return;
                }
                return;
            case 8:
                ci.x2 x2Var = (ci.x2) this.f1747b;
                x2Var.h(-1.0f);
                AndroidUtilities.runOnUIThread(new ba(16, x2Var, (Runnable) obj), 80L);
                return;
            case 9:
                ((ci.w3) this.f1747b).f5731s.animate().translationY(((-((Integer) obj).intValue()) / 2.0f) + AndroidUtilities.dp(80.0f)).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.o1.f19685w).start();
                return;
            case 10:
                ci.t4 t4Var = (ci.t4) this.f1747b;
                View view2 = (View) obj;
                ci.o4 o4Var = t4Var.f5544b;
                if (view2 instanceof ci.s4) {
                    o4Var.getClass();
                    int R = RecyclerView.R(view2);
                    y51 G = o4Var.f28778f3.G(R);
                    if (G != null) {
                        ci.s4 s4Var = (ci.s4) view2;
                        s4Var.setPosition(t4Var.b(R));
                        if (t4Var.f5546f == G.d) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        s4Var.b(z10, true);
                        boolean contains = t4Var.e.contains(Integer.valueOf(G.d));
                        if (s4Var.f5495f != contains) {
                            s4Var.f5495f = contains;
                            s4Var.invalidate();
                        }
                        view2.setPressed(false);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                ci.o4 o4Var2 = (ci.o4) this.f1747b;
                View view3 = (View) obj;
                if (view3 instanceof ci.s4) {
                    ci.cb cbVar = o4Var2.f5246m3;
                    cbVar.f5544b.getClass();
                    ((ci.s4) view3).setPosition(cbVar.b(RecyclerView.R(view3)));
                    view3.setPressed(false);
                    return;
                }
                return;
            case 12:
                ci.nb nbVar = (ci.nb) ((ci.q6) this.f1747b);
                ci.lc lcVar = nbVar.A2;
                lcVar.X0.q((MessageObject) obj);
                ci.l8 l8Var = lcVar.K1;
                if (l8Var != null && lcVar.O1 != 1) {
                    boolean isEmpty = TextUtils.isEmpty(l8Var.f5019y);
                    boolean z15 = !isEmpty;
                    ((sg0) lcVar.f5064j1.f5467c).a(!lcVar.X0.k(), false);
                    lcVar.f5064j1.setVisibility(0);
                    ViewPropertyAnimator animate = lcVar.f5064j1.animate();
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
                            ci.l8 l8Var2 = ((ci.d0) obj2).f4495n;
                            if (l8Var2 != null && l8Var2.K) {
                                if (!TextUtils.isEmpty(lcVar.K1.f5019y)) {
                                    i10 = 2;
                                }
                            }
                        }
                    }
                }
                i10 = -1;
                lcVar.l0(i10, true, true);
                return;
            case 13:
                ci.k8 k8Var = (ci.k8) obj;
                l71 l71Var = ((ci.b7) this.f1747b).f4400n;
                if (l71Var != null) {
                    l71Var.setHDRInfo(k8Var);
                    return;
                }
                return;
            case 14:
                ci.d8.S((ci.d8) this.f1747b, (Long) obj);
                return;
            case 15:
                ci.u8 u8Var = (ci.u8) this.f1747b;
                qg.o0 o0Var = (qg.o0) obj;
                if (o0Var == null) {
                    u8Var.U();
                    return;
                }
                u8Var.f5639o0 = o0Var.e;
                u8Var.f5638n0 = o0Var.f41942f;
                return;
            case 16:
                ((ci.u9) this.f1747b).f5641n.W.H = ((Integer) obj).intValue();
                return;
            case 17:
                ((ci.gb) this.f1747b).g((Utilities.Callback) obj);
                return;
            case 18:
                ei.u uVar = (ei.u) this.f1747b;
                ArrayList arrayList4 = uVar.f8632b;
                arrayList4.clear();
                arrayList4.addAll((ArrayList) obj);
                u61 u61Var = uVar.f8631a;
                if (u61Var != null && (m61Var = u61Var.f28778f3) != null) {
                    m61Var.N(true);
                    return;
                }
                return;
            case 19:
                fi.f fVar = (fi.f) this.f1747b;
                ArrayList arrayList5 = (ArrayList) obj;
                ArrayList arrayList6 = fVar.h;
                z14 = (arrayList6 == null || arrayList6.isEmpty()) ? true : true;
                fVar.h = arrayList5;
                u61 u61Var2 = fVar.e;
                if (u61Var2 != null) {
                    u61Var2.f28778f3.N(z14);
                    return;
                }
                return;
            case 20:
                ((gg.m) this.f1747b).L((TLRPC.User) obj);
                return;
            case 21:
                TLRPC.User user2 = (TLRPC.User) obj;
                ho0 ho0Var = (ho0) ((gg.i0) this.f1747b);
                zx zxVar = ho0Var.K0;
                if (user2 != null) {
                    qy qyVar = zxVar.J0;
                    if (qyVar != null) {
                        qyVar.K3();
                    }
                    MessagesController.getInstance(zxVar.H0).openApp(user2, 0);
                    ho0Var.R(user2.f18499id, user2);
                    return;
                }
                return;
            case 22:
                hg.n nVar = (hg.n) this.f1747b;
                if (((Integer) obj).intValue() > AndroidUtilities.dp(20.0f)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (nVar.F != z11) {
                    nVar.F = z11;
                    if (!z11) {
                        nVar.f27258a.y0(0);
                        return;
                    }
                    return;
                }
                return;
            case 23:
                Object[] objArr = (Object[]) obj;
                AndroidUtilities.forEachViews((RecyclerView) ((hg.k0) this.f1747b).f10326s, (Utilities.Callback<View>) new i(3));
                return;
            case 24:
                hg.v0 v0Var = (hg.v0) this.f1747b;
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                v0Var.G = connectedbots;
                if (connectedbots != null && !connectedbots.connected_bots.isEmpty()) {
                    tL_connectedBot = v0Var.G.connected_bots.get(0);
                } else {
                    tL_connectedBot = null;
                }
                v0Var.H = tL_connectedBot;
                if (tL_connectedBot == null) {
                    user = null;
                } else {
                    user = v0Var.getMessagesController().getUser(Long.valueOf(v0Var.H.bot_id));
                }
                v0Var.M = user;
                TL_account.TL_connectedBot tL_connectedBot2 = v0Var.H;
                if (tL_connectedBot2 != null) {
                    makeDefault = TL_account.TL_businessBotRights.clone(tL_connectedBot2.rights);
                } else {
                    makeDefault = TL_account.TL_businessBotRights.makeDefault();
                }
                v0Var.J = makeDefault;
                TL_account.TL_connectedBot tL_connectedBot3 = v0Var.H;
                if (tL_connectedBot3 != null) {
                    z12 = tL_connectedBot3.recipients.exclude_selected;
                } else {
                    z12 = true;
                }
                v0Var.I = z12;
                hg.c0 c0Var2 = v0Var.v;
                if (c0Var2 != null) {
                    if (tL_connectedBot3 != null) {
                        tL_businessBotRecipients = tL_connectedBot3.recipients;
                    }
                    c0Var2.i(tL_businessBotRecipients);
                }
                u61 u61Var3 = v0Var.f10439c;
                if (u61Var3 != null && (m61Var2 = u61Var3.f28778f3) != null) {
                    z13 = true;
                    m61Var2.N(true);
                } else {
                    z13 = true;
                }
                v0Var.Y(z13);
                v0Var.T = z13;
                return;
            case 25:
                hg.x0 x0Var = (hg.x0) this.f1747b;
                x0Var.f10469w = x0Var.e[((Integer) obj).intValue()];
                x0Var.V(true);
                return;
            case 26:
                hg.z1 z1Var = (hg.z1) this.f1747b;
                z1Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt("chatMode", 5);
                bundle.putLong("user_id", z1Var.getUserConfig().getClientUserId());
                bundle.putString("quick_reply", (String) obj);
                wn wnVar = new wn(bundle);
                wnVar.C9 = true;
                z1Var.presentFragment(wnVar);
                return;
            case 27:
                AndroidUtilities.hideKeyboard((hg.s1) this.f1747b);
                AndroidUtilities.runOnUIThread((Runnable) obj, 80L);
                return;
            case 28:
                ii.o3 o3Var = (ii.o3) this.f1747b;
                TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj;
                int i13 = o3Var.f11543b;
                int i14 = o3Var.f11542a;
                ii.x3 x3Var = o3Var.e;
                if (richMessage != null) {
                    ArrayList arrayList7 = x3Var.f11756s3;
                    ArrayList arrayList8 = x3Var.f11756s3;
                    if (i14 < arrayList7.size() && i13 < arrayList8.size()) {
                        ii.i2 i2Var = x3Var.Q3;
                        if (i2Var != null) {
                            i2Var.d();
                        }
                        ii.k3 k3Var = x3Var.f11760u3;
                        if (k3Var != null) {
                            k3Var.f(false);
                        }
                        ii.a aVar2 = (ii.a) arrayList8.get(i14);
                        ii.a aVar3 = (ii.a) arrayList8.get(i13);
                        CharSequence charSequence = "";
                        if (!ii.x3.C3(aVar2.f11205b)) {
                            editable = "";
                        } else {
                            editable = x3Var.O4(aVar2);
                        }
                        if (ii.x3.C3(aVar3.f11205b)) {
                            charSequence = x3Var.O4(aVar3);
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(editable.subSequence(0, Math.max(0, Math.min(o3Var.f11544c, editable.length()))));
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence.subSequence(Math.max(0, Math.min(o3Var.d, charSequence.length())), charSequence.length()));
                        ArrayList arrayList9 = new ArrayList();
                        ii.x3.Y2(arrayList9, richMessage.blocks, null);
                        if (arrayList9.isEmpty()) {
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder);
                            spannableStringBuilder3.append((CharSequence) spannableStringBuilder2);
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            ii.e6.d(pageblockparagraph, spannableStringBuilder3);
                            arrayList9.add(new ii.a(pageblockparagraph, aVar2.f11206c, aVar2.d));
                        } else {
                            if (spannableStringBuilder.length() > 0) {
                                ii.a aVar4 = (ii.a) arrayList9.get(0);
                                if (ii.x3.C3(aVar4.f11205b)) {
                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(spannableStringBuilder);
                                    spannableStringBuilder4.append((CharSequence) ii.e6.A(aVar4.f11205b));
                                    ii.e6.d(aVar4.f11205b, spannableStringBuilder4);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                    ii.e6.d(pageblockparagraph2, spannableStringBuilder);
                                    arrayList9.add(0, new ii.a(pageblockparagraph2, aVar2.f11206c, aVar2.d));
                                }
                            }
                            if (spannableStringBuilder2.length() > 0) {
                                ii.a aVar5 = (ii.a) hg.c.g(1, arrayList9);
                                if (ii.x3.C3(aVar5.f11205b)) {
                                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(ii.e6.A(aVar5.f11205b));
                                    spannableStringBuilder5.append((CharSequence) spannableStringBuilder2);
                                    ii.e6.d(aVar5.f11205b, spannableStringBuilder5);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph3 = new TL_iv.pageBlockParagraph();
                                    ii.e6.d(pageblockparagraph3, spannableStringBuilder2);
                                    arrayList9.add(new ii.a(pageblockparagraph3, aVar3.f11206c, aVar3.d));
                                }
                            }
                        }
                        TL_iv.RichMessage richMessage2 = x3Var.f11754r3;
                        if (richMessage2 == null) {
                            x3Var.f11754r3 = richMessage;
                        } else {
                            ArrayList<TLRPC.Photo> arrayList10 = richMessage.photos;
                            if (arrayList10 != null) {
                                richMessage2.photos.addAll(arrayList10);
                            }
                            ArrayList<TLRPC.Document> arrayList11 = richMessage.documents;
                            if (arrayList11 != null) {
                                x3Var.f11754r3.documents.addAll(arrayList11);
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
                        x3Var.f28778f3.N(false);
                        ii.i2 i2Var2 = x3Var.Q3;
                        if (i2Var2 != null) {
                            i2Var2.h();
                        }
                        x3Var.f11748o3.onContentChanged();
                        if (!arrayList9.isEmpty()) {
                            aVar = (ii.a) hg.c.g(1, arrayList9);
                        }
                        x3Var.post(new gg.x1(16, o3Var, aVar));
                        return;
                    }
                    return;
                }
                return;
            default:
                ((ii.m) this.f1747b).f11507a.f11586r.W1((TL_iv.RichMessage) obj);
                return;
        }
    }
}
