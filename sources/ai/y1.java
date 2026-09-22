package ai;

import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
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
import org.telegram.ui.Components.bu;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.fg0;
import org.telegram.ui.Components.rn0;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.w51;
import org.telegram.ui.bo;
import org.telegram.ui.ey;
import org.telegram.ui.uy;
public final class y1 implements Utilities.Callback {
    public final int f1741a;
    public final Object f1742b;

    public y1(Object obj, int i10) {
        this.f1741a = i10;
        this.f1742b = obj;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        float f7;
        w51 w51Var;
        boolean z10;
        TL_account.TL_connectedBot tL_connectedBot;
        TLRPC.User user;
        TL_account.TL_businessBotRights makeDefault;
        boolean z11;
        boolean z12;
        w51 w51Var2;
        Editable editable;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = null;
        ii.a aVar = null;
        int i11 = 0;
        boolean z13 = false;
        switch (this.f1741a) {
            case 0:
                d2 d2Var = (d2) this.f1742b;
                if (((Boolean) obj).booleanValue() && !d2Var.f692w) {
                    d2Var.f689n = true;
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
                    NotificationCenter.getInstance(d2Var.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(d2Var.f688f.f18126id));
                    return;
                }
                return;
            case 1:
                f6 f6Var = (f6) this.f1742b;
                f6Var.L3 = ((Long) obj).longValue();
                a4 a4Var = f6Var.f797b2;
                if (a4Var != null) {
                    a4Var.L(true);
                    f6Var.f797b2.S1();
                }
                f6Var.r0(true);
                return;
            case 2:
                jc jcVar = (jc) this.f1742b;
                Boolean bool = (Boolean) obj;
                jcVar.f1089k1 = false;
                jcVar.P();
                return;
            case 3:
                l9 l9Var = (l9) this.f1742b;
                d9 d9Var = (d9) obj;
                HashMap hashMap = l9Var.H;
                int i12 = d9Var.e;
                int i13 = d9Var.f716f;
                long j3 = d9Var.d;
                if (i12 == 0 && i13 > 0) {
                    HashMap hashMap2 = (HashMap) hashMap.get(Long.valueOf(j3));
                    if (hashMap2 != null) {
                        hashMap2.remove(Integer.valueOf(i13));
                        if (hashMap2.isEmpty()) {
                            hashMap.remove(Long.valueOf(j3));
                            return;
                        }
                        return;
                    }
                    return;
                }
                HashMap hashMap3 = l9Var.G[i12];
                if (hashMap3 != null) {
                    hashMap3.remove(Long.valueOf(j3));
                    return;
                }
                return;
            case 4:
                bi.z zVar = (bi.z) this.f1742b;
                String str = (String) obj;
                ArrayList arrayList = zVar.h;
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                    zVar.i(true);
                }
                AndroidUtilities.runOnUIThread(new ba(7, zVar, str), 120L);
                return;
            case 5:
                ((ci.m) this.f1742b).x(((Integer) obj).intValue());
                return;
            case 6:
                ci.e0 e0Var = (ci.e0) this.f1742b;
                e0Var.f4564j0.f4471n.P = ((Float) obj).floatValue();
                ci.d0 d0Var = e0Var.f4564j0;
                ci.c0 c0Var = d0Var.d;
                if (c0Var != null) {
                    c0Var.setVolume(d0Var.f4471n.P);
                    return;
                }
                return;
            case 7:
                ci.r0 r0Var = (ci.r0) this.f1742b;
                VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
                MessageObject messageObject = r0Var.f5393c;
                if (messageObject != null) {
                    messageObject.videoEditedInfo = videoEditedInfo;
                    MediaController.getInstance().scheduleVideoConvert(r0Var.f5393c);
                    return;
                }
                return;
            case 8:
                ci.y2 y2Var = (ci.y2) this.f1742b;
                y2Var.h(-1.0f);
                AndroidUtilities.runOnUIThread(new ba(16, y2Var, (Runnable) obj), 80L);
                return;
            case 9:
                ((ci.x3) this.f1742b).f5745s.animate().translationY(((-((Integer) obj).intValue()) / 2.0f) + AndroidUtilities.dp(80.0f)).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.p1.f19476w).start();
                return;
            case 10:
                ci.qb qbVar = (ci.qb) ((ci.r6) this.f1742b);
                ci.oc ocVar = qbVar.A2;
                ocVar.X0.q((MessageObject) obj);
                ci.o8 o8Var = ocVar.K1;
                if (o8Var != null && ocVar.O1 != 1) {
                    boolean isEmpty = TextUtils.isEmpty(o8Var.f5187y);
                    boolean z14 = !isEmpty;
                    ((fg0) ocVar.f5232j1.f5514c).a(!ocVar.X0.k(), false);
                    ocVar.f5232j1.setVisibility(0);
                    ViewPropertyAnimator animate = ocVar.f5232j1.animate();
                    if (!isEmpty) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    animate.alpha(f7).withEndAction(new bi.f(5, qbVar, z14)).start();
                }
                if (ocVar.A0.j()) {
                    ArrayList arrayList2 = ocVar.A0.h;
                    int size = arrayList2.size();
                    while (true) {
                        if (i11 < size) {
                            Object obj2 = arrayList2.get(i11);
                            i11++;
                            ci.o8 o8Var2 = ((ci.d0) obj2).f4471n;
                            if (o8Var2 != null && o8Var2.K) {
                                if (!TextUtils.isEmpty(ocVar.K1.f5187y)) {
                                    i10 = 2;
                                }
                            }
                        }
                    }
                }
                i10 = -1;
                ocVar.l0(i10, true, true);
                return;
            case 11:
                ci.n8 n8Var = (ci.n8) obj;
                u61 u61Var = ((ci.d7) this.f1742b).f4517n;
                if (u61Var != null) {
                    u61Var.setHDRInfo(n8Var);
                    return;
                }
                return;
            case 12:
                ci.x8 x8Var = (ci.x8) this.f1742b;
                qg.q0 q0Var = (qg.q0) obj;
                if (q0Var == null) {
                    x8Var.U();
                    return;
                }
                x8Var.f5773o0 = q0Var.e;
                x8Var.f5772n0 = q0Var.f41581f;
                return;
            case 13:
                ((ci.x9) this.f1742b).f5775n.W.H = ((Integer) obj).intValue();
                return;
            case 14:
                ((ci.jb) this.f1742b).g((Utilities.Callback) obj);
                return;
            case 15:
                ei.u uVar = (ei.u) this.f1742b;
                ArrayList arrayList3 = uVar.f8635b;
                arrayList3.clear();
                arrayList3.addAll((ArrayList) obj);
                e61 e61Var = uVar.f8634a;
                if (e61Var != null && (w51Var = e61Var.Y2) != null) {
                    w51Var.N(true);
                    return;
                }
                return;
            case 16:
                fi.f fVar = (fi.f) this.f1742b;
                ArrayList arrayList4 = (ArrayList) obj;
                ArrayList arrayList5 = fVar.h;
                z13 = (arrayList5 == null || arrayList5.isEmpty()) ? true : true;
                fVar.h = arrayList4;
                e61 e61Var2 = fVar.e;
                if (e61Var2 != null) {
                    e61Var2.Y2.N(z13);
                    return;
                }
                return;
            case 17:
                ((gg.m) this.f1742b).L((TLRPC.User) obj);
                return;
            case 18:
                TLRPC.User user2 = (TLRPC.User) obj;
                rn0 rn0Var = (rn0) ((gg.i0) this.f1742b);
                ey eyVar = rn0Var.K0;
                if (user2 != null) {
                    uy uyVar = eyVar.J0;
                    if (uyVar != null) {
                        uyVar.K3();
                    }
                    MessagesController.getInstance(eyVar.H0).openApp(user2, 0);
                    rn0Var.R(user2.f18256id, user2);
                    return;
                }
                return;
            case 19:
                hg.n nVar = (hg.n) this.f1742b;
                if (((Integer) obj).intValue() > AndroidUtilities.dp(20.0f)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (nVar.F != z10) {
                    nVar.F = z10;
                    if (!z10) {
                        nVar.f30482a.x0(0);
                        return;
                    }
                    return;
                }
                return;
            case 20:
                Object[] objArr = (Object[]) obj;
                AndroidUtilities.forEachViews((RecyclerView) ((hg.k0) this.f1742b).f10326s, (e2.h) new i(3));
                return;
            case 21:
                hg.v0 v0Var = (hg.v0) this.f1742b;
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
                    z11 = tL_connectedBot3.recipients.exclude_selected;
                } else {
                    z11 = true;
                }
                v0Var.I = z11;
                hg.c0 c0Var2 = v0Var.v;
                if (c0Var2 != null) {
                    if (tL_connectedBot3 != null) {
                        tL_businessBotRecipients = tL_connectedBot3.recipients;
                    }
                    c0Var2.i(tL_businessBotRecipients);
                }
                e61 e61Var3 = v0Var.f10439c;
                if (e61Var3 != null && (w51Var2 = e61Var3.Y2) != null) {
                    z12 = true;
                    w51Var2.N(true);
                } else {
                    z12 = true;
                }
                v0Var.Y(z12);
                v0Var.T = z12;
                return;
            case 22:
                hg.x0 x0Var = (hg.x0) this.f1742b;
                x0Var.f10469w = x0Var.e[((Integer) obj).intValue()];
                x0Var.V(true);
                return;
            case 23:
                hg.z1 z1Var = (hg.z1) this.f1742b;
                z1Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt("chatMode", 5);
                bundle.putLong("user_id", z1Var.getUserConfig().getClientUserId());
                bundle.putString("quick_reply", (String) obj);
                bo boVar = new bo(bundle);
                boVar.C9 = true;
                z1Var.presentFragment(boVar);
                return;
            case 24:
                AndroidUtilities.hideKeyboard((hg.s1) this.f1742b);
                AndroidUtilities.runOnUIThread((Runnable) obj, 80L);
                return;
            case 25:
                ii.n3 n3Var = (ii.n3) this.f1742b;
                TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj;
                int i14 = n3Var.f11518b;
                int i15 = n3Var.f11517a;
                ii.w3 w3Var = n3Var.e;
                if (richMessage != null) {
                    ArrayList arrayList6 = w3Var.f11720l3;
                    ArrayList arrayList7 = w3Var.f11720l3;
                    if (i15 < arrayList6.size() && i14 < arrayList7.size()) {
                        ii.h2 h2Var = w3Var.J3;
                        if (h2Var != null) {
                            h2Var.d();
                        }
                        ii.j3 j3Var = w3Var.f11723n3;
                        if (j3Var != null) {
                            j3Var.f(false);
                        }
                        ii.a aVar2 = (ii.a) arrayList7.get(i15);
                        ii.a aVar3 = (ii.a) arrayList7.get(i14);
                        CharSequence charSequence = "";
                        if (!ii.w3.A3(aVar2.f11203b)) {
                            editable = "";
                        } else {
                            editable = w3Var.M4(aVar2);
                        }
                        if (ii.w3.A3(aVar3.f11203b)) {
                            charSequence = w3Var.M4(aVar3);
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(editable.subSequence(0, Math.max(0, Math.min(n3Var.f11519c, editable.length()))));
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence.subSequence(Math.max(0, Math.min(n3Var.d, charSequence.length())), charSequence.length()));
                        ArrayList arrayList8 = new ArrayList();
                        ii.w3.W2(arrayList8, richMessage.blocks, null);
                        if (arrayList8.isEmpty()) {
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder);
                            spannableStringBuilder3.append((CharSequence) spannableStringBuilder2);
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            ii.d6.d(pageblockparagraph, spannableStringBuilder3);
                            arrayList8.add(new ii.a(pageblockparagraph, aVar2.f11204c, aVar2.d));
                        } else {
                            if (spannableStringBuilder.length() > 0) {
                                ii.a aVar4 = (ii.a) arrayList8.get(0);
                                if (ii.w3.A3(aVar4.f11203b)) {
                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(spannableStringBuilder);
                                    spannableStringBuilder4.append((CharSequence) ii.d6.A(aVar4.f11203b));
                                    ii.d6.d(aVar4.f11203b, spannableStringBuilder4);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                    ii.d6.d(pageblockparagraph2, spannableStringBuilder);
                                    arrayList8.add(0, new ii.a(pageblockparagraph2, aVar2.f11204c, aVar2.d));
                                }
                            }
                            if (spannableStringBuilder2.length() > 0) {
                                ii.a aVar5 = (ii.a) hg.c.h(1, arrayList8);
                                if (ii.w3.A3(aVar5.f11203b)) {
                                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(ii.d6.A(aVar5.f11203b));
                                    spannableStringBuilder5.append((CharSequence) spannableStringBuilder2);
                                    ii.d6.d(aVar5.f11203b, spannableStringBuilder5);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph3 = new TL_iv.pageBlockParagraph();
                                    ii.d6.d(pageblockparagraph3, spannableStringBuilder2);
                                    arrayList8.add(new ii.a(pageblockparagraph3, aVar3.f11204c, aVar3.d));
                                }
                            }
                        }
                        TL_iv.RichMessage richMessage2 = w3Var.f11718k3;
                        if (richMessage2 == null) {
                            w3Var.f11718k3 = richMessage;
                        } else {
                            ArrayList<TLRPC.Photo> arrayList9 = richMessage.photos;
                            if (arrayList9 != null) {
                                richMessage2.photos.addAll(arrayList9);
                            }
                            ArrayList<TLRPC.Document> arrayList10 = richMessage.documents;
                            if (arrayList10 != null) {
                                w3Var.f11718k3.documents.addAll(arrayList10);
                            }
                        }
                        for (int i16 = 0; i16 < arrayList8.size(); i16++) {
                            w3Var.v4((ii.a) arrayList8.get(i16));
                        }
                        while (i14 >= i15) {
                            arrayList7.remove(i14);
                            i14--;
                        }
                        arrayList7.addAll(i15, arrayList8);
                        w3Var.s4();
                        w3Var.Y2.N(false);
                        ii.h2 h2Var2 = w3Var.J3;
                        if (h2Var2 != null) {
                            h2Var2.h();
                        }
                        w3Var.f11713h3.onContentChanged();
                        if (!arrayList8.isEmpty()) {
                            aVar = (ii.a) hg.c.h(1, arrayList8);
                        }
                        w3Var.post(new gg.x1(16, n3Var, aVar));
                        return;
                    }
                    return;
                }
                return;
            case 26:
                ((ii.m) this.f1742b).f11495a.f11590r.U1((TL_iv.RichMessage) obj);
                return;
            case 27:
                ((ii.d2) this.f1742b).P.U1((TL_iv.RichMessage) obj);
                return;
            case 28:
                ii.w3 w3Var2 = (ii.w3) this.f1742b;
                String str2 = (String) obj;
                w3Var2.getClass();
                if (!TextUtils.isEmpty(str2)) {
                    TL_iv.pageBlockMath pageblockmath = new TL_iv.pageBlockMath();
                    pageblockmath.source = str2;
                    w3Var2.R1(pageblockmath);
                    return;
                }
                return;
            default:
                AndroidUtilities.hideKeyboard((bu) this.f1742b);
                AndroidUtilities.runOnUIThread((Runnable) obj, 80L);
                return;
        }
    }
}
