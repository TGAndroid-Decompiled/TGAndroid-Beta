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
import org.telegram.ui.Components.eo0;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.qg0;
import org.telegram.ui.Components.t61;
import org.telegram.ui.ey;
import org.telegram.ui.uy;
import org.telegram.ui.zn;
public final class y1 implements Utilities.Callback {
    public final int f1744a;
    public final Object f1745b;

    public y1(Object obj, int i10) {
        this.f1744a = i10;
        this.f1745b = obj;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        float f7;
        l61 l61Var;
        boolean z10;
        TL_account.TL_connectedBot tL_connectedBot;
        TLRPC.User user;
        TL_account.TL_businessBotRights makeDefault;
        boolean z11;
        boolean z12;
        l61 l61Var2;
        Editable editable;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = null;
        ii.a aVar = null;
        int i11 = 0;
        boolean z13 = false;
        switch (this.f1744a) {
            case 0:
                d2 d2Var = (d2) this.f1745b;
                if (((Boolean) obj).booleanValue() && !d2Var.f695w) {
                    d2Var.f692n = true;
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
                    NotificationCenter.getInstance(d2Var.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(d2Var.f691f.f18313id));
                    return;
                }
                return;
            case 1:
                f6 f6Var = (f6) this.f1745b;
                f6Var.L3 = ((Long) obj).longValue();
                a4 a4Var = f6Var.f800b2;
                if (a4Var != null) {
                    a4Var.K(true);
                    f6Var.f800b2.R1();
                }
                f6Var.r0(true);
                return;
            case 2:
                jc jcVar = (jc) this.f1745b;
                Boolean bool = (Boolean) obj;
                jcVar.f1092k1 = false;
                jcVar.P();
                return;
            case 3:
                l9 l9Var = (l9) this.f1745b;
                d9 d9Var = (d9) obj;
                HashMap hashMap = l9Var.H;
                int i12 = d9Var.e;
                int i13 = d9Var.f719f;
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
                bi.z zVar = (bi.z) this.f1745b;
                String str = (String) obj;
                ArrayList arrayList = zVar.h;
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                    zVar.i(true);
                }
                AndroidUtilities.runOnUIThread(new ba(7, zVar, str), 120L);
                return;
            case 5:
                ((ci.m) this.f1745b).x(((Integer) obj).intValue());
                return;
            case 6:
                ci.e0 e0Var = (ci.e0) this.f1745b;
                e0Var.f4567j0.f4474n.P = ((Float) obj).floatValue();
                ci.d0 d0Var = e0Var.f4567j0;
                ci.c0 c0Var = d0Var.d;
                if (c0Var != null) {
                    c0Var.setVolume(d0Var.f4474n.P);
                    return;
                }
                return;
            case 7:
                ci.r0 r0Var = (ci.r0) this.f1745b;
                VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
                MessageObject messageObject = r0Var.f5396c;
                if (messageObject != null) {
                    messageObject.videoEditedInfo = videoEditedInfo;
                    MediaController.getInstance().scheduleVideoConvert(r0Var.f5396c);
                    return;
                }
                return;
            case 8:
                ci.y2 y2Var = (ci.y2) this.f1745b;
                y2Var.h(-1.0f);
                AndroidUtilities.runOnUIThread(new ba(16, y2Var, (Runnable) obj), 80L);
                return;
            case 9:
                ((ci.x3) this.f1745b).f5748s.animate().translationY(((-((Integer) obj).intValue()) / 2.0f) + AndroidUtilities.dp(80.0f)).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.p1.f19667w).start();
                return;
            case 10:
                ci.qb qbVar = (ci.qb) ((ci.r6) this.f1745b);
                ci.oc ocVar = qbVar.A2;
                ocVar.X0.q((MessageObject) obj);
                ci.o8 o8Var = ocVar.K1;
                if (o8Var != null && ocVar.O1 != 1) {
                    boolean isEmpty = TextUtils.isEmpty(o8Var.f5190y);
                    boolean z14 = !isEmpty;
                    ((qg0) ocVar.f5235j1.f5517c).a(!ocVar.X0.k(), false);
                    ocVar.f5235j1.setVisibility(0);
                    ViewPropertyAnimator animate = ocVar.f5235j1.animate();
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
                            ci.o8 o8Var2 = ((ci.d0) obj2).f4474n;
                            if (o8Var2 != null && o8Var2.K) {
                                if (!TextUtils.isEmpty(ocVar.K1.f5190y)) {
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
                j71 j71Var = ((ci.d7) this.f1745b).f4520n;
                if (j71Var != null) {
                    j71Var.setHDRInfo(n8Var);
                    return;
                }
                return;
            case 12:
                ci.x8 x8Var = (ci.x8) this.f1745b;
                qg.n0 n0Var = (qg.n0) obj;
                if (n0Var == null) {
                    x8Var.U();
                    return;
                }
                x8Var.f5776o0 = n0Var.e;
                x8Var.f5775n0 = n0Var.f41808f;
                return;
            case 13:
                ((ci.x9) this.f1745b).f5778n.W.H = ((Integer) obj).intValue();
                return;
            case 14:
                ((ci.jb) this.f1745b).g((Utilities.Callback) obj);
                return;
            case 15:
                ei.u uVar = (ei.u) this.f1745b;
                ArrayList arrayList3 = uVar.f8637b;
                arrayList3.clear();
                arrayList3.addAll((ArrayList) obj);
                t61 t61Var = uVar.f8636a;
                if (t61Var != null && (l61Var = t61Var.Y2) != null) {
                    l61Var.N(true);
                    return;
                }
                return;
            case 16:
                fi.f fVar = (fi.f) this.f1745b;
                ArrayList arrayList4 = (ArrayList) obj;
                ArrayList arrayList5 = fVar.h;
                z13 = (arrayList5 == null || arrayList5.isEmpty()) ? true : true;
                fVar.h = arrayList4;
                t61 t61Var2 = fVar.e;
                if (t61Var2 != null) {
                    t61Var2.Y2.N(z13);
                    return;
                }
                return;
            case 17:
                ((gg.m) this.f1745b).L((TLRPC.User) obj);
                return;
            case 18:
                TLRPC.User user2 = (TLRPC.User) obj;
                eo0 eo0Var = (eo0) ((gg.i0) this.f1745b);
                ey eyVar = eo0Var.K0;
                if (user2 != null) {
                    uy uyVar = eyVar.K0;
                    if (uyVar != null) {
                        uyVar.K3();
                    }
                    MessagesController.getInstance(eyVar.I0).openApp(user2, 0);
                    eo0Var.R(user2.f18443id, user2);
                    return;
                }
                return;
            case 19:
                hg.m mVar = (hg.m) this.f1745b;
                if (((Integer) obj).intValue() > AndroidUtilities.dp(20.0f)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (mVar.G != z10) {
                    mVar.G = z10;
                    if (!z10) {
                        mVar.f26891a.y0(0);
                        return;
                    }
                    return;
                }
                return;
            case 20:
                Object[] objArr = (Object[]) obj;
                AndroidUtilities.forEachViews((RecyclerView) ((hg.i0) this.f1745b).f10312s, (e2.h) new i(3));
                return;
            case 21:
                hg.u0 u0Var = (hg.u0) this.f1745b;
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
                    z11 = tL_connectedBot3.recipients.exclude_selected;
                } else {
                    z11 = true;
                }
                u0Var.I = z11;
                hg.a0 a0Var = u0Var.v;
                if (a0Var != null) {
                    if (tL_connectedBot3 != null) {
                        tL_businessBotRecipients = tL_connectedBot3.recipients;
                    }
                    a0Var.i(tL_businessBotRecipients);
                }
                t61 t61Var3 = u0Var.f10434c;
                if (t61Var3 != null && (l61Var2 = t61Var3.Y2) != null) {
                    z12 = true;
                    l61Var2.N(true);
                } else {
                    z12 = true;
                }
                u0Var.Y(z12);
                u0Var.T = z12;
                return;
            case 22:
                hg.w0 w0Var = (hg.w0) this.f1745b;
                w0Var.f10466w = w0Var.e[((Integer) obj).intValue()];
                w0Var.V(true);
                return;
            case 23:
                hg.y1 y1Var = (hg.y1) this.f1745b;
                y1Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt("chatMode", 5);
                bundle.putLong("user_id", y1Var.getUserConfig().getClientUserId());
                bundle.putString("quick_reply", (String) obj);
                zn znVar = new zn(bundle);
                znVar.C9 = true;
                y1Var.presentFragment(znVar);
                return;
            case 24:
                AndroidUtilities.hideKeyboard((hg.r1) this.f1745b);
                AndroidUtilities.runOnUIThread((Runnable) obj, 80L);
                return;
            case 25:
                ii.n3 n3Var = (ii.n3) this.f1745b;
                TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj;
                int i14 = n3Var.f11519b;
                int i15 = n3Var.f11518a;
                ii.w3 w3Var = n3Var.e;
                if (richMessage != null) {
                    ArrayList arrayList6 = w3Var.f11721l3;
                    ArrayList arrayList7 = w3Var.f11721l3;
                    if (i15 < arrayList6.size() && i14 < arrayList7.size()) {
                        ii.h2 h2Var = w3Var.J3;
                        if (h2Var != null) {
                            h2Var.d();
                        }
                        ii.j3 j3Var = w3Var.f11724n3;
                        if (j3Var != null) {
                            j3Var.f(false);
                        }
                        ii.a aVar2 = (ii.a) arrayList7.get(i15);
                        ii.a aVar3 = (ii.a) arrayList7.get(i14);
                        CharSequence charSequence = "";
                        if (!ii.w3.B3(aVar2.f11204b)) {
                            editable = "";
                        } else {
                            editable = w3Var.N4(aVar2);
                        }
                        if (ii.w3.B3(aVar3.f11204b)) {
                            charSequence = w3Var.N4(aVar3);
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(editable.subSequence(0, Math.max(0, Math.min(n3Var.f11520c, editable.length()))));
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence.subSequence(Math.max(0, Math.min(n3Var.d, charSequence.length())), charSequence.length()));
                        ArrayList arrayList8 = new ArrayList();
                        ii.w3.X2(arrayList8, richMessage.blocks, null);
                        if (arrayList8.isEmpty()) {
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder);
                            spannableStringBuilder3.append((CharSequence) spannableStringBuilder2);
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            ii.d6.d(pageblockparagraph, spannableStringBuilder3);
                            arrayList8.add(new ii.a(pageblockparagraph, aVar2.f11205c, aVar2.d));
                        } else {
                            if (spannableStringBuilder.length() > 0) {
                                ii.a aVar4 = (ii.a) arrayList8.get(0);
                                if (ii.w3.B3(aVar4.f11204b)) {
                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(spannableStringBuilder);
                                    spannableStringBuilder4.append((CharSequence) ii.d6.A(aVar4.f11204b));
                                    ii.d6.d(aVar4.f11204b, spannableStringBuilder4);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                    ii.d6.d(pageblockparagraph2, spannableStringBuilder);
                                    arrayList8.add(0, new ii.a(pageblockparagraph2, aVar2.f11205c, aVar2.d));
                                }
                            }
                            if (spannableStringBuilder2.length() > 0) {
                                ii.a aVar5 = (ii.a) hg.k0.g(1, arrayList8);
                                if (ii.w3.B3(aVar5.f11204b)) {
                                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(ii.d6.A(aVar5.f11204b));
                                    spannableStringBuilder5.append((CharSequence) spannableStringBuilder2);
                                    ii.d6.d(aVar5.f11204b, spannableStringBuilder5);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph3 = new TL_iv.pageBlockParagraph();
                                    ii.d6.d(pageblockparagraph3, spannableStringBuilder2);
                                    arrayList8.add(new ii.a(pageblockparagraph3, aVar3.f11205c, aVar3.d));
                                }
                            }
                        }
                        TL_iv.RichMessage richMessage2 = w3Var.f11719k3;
                        if (richMessage2 == null) {
                            w3Var.f11719k3 = richMessage;
                        } else {
                            ArrayList<TLRPC.Photo> arrayList9 = richMessage.photos;
                            if (arrayList9 != null) {
                                richMessage2.photos.addAll(arrayList9);
                            }
                            ArrayList<TLRPC.Document> arrayList10 = richMessage.documents;
                            if (arrayList10 != null) {
                                w3Var.f11719k3.documents.addAll(arrayList10);
                            }
                        }
                        for (int i16 = 0; i16 < arrayList8.size(); i16++) {
                            w3Var.w4((ii.a) arrayList8.get(i16));
                        }
                        while (i14 >= i15) {
                            arrayList7.remove(i14);
                            i14--;
                        }
                        arrayList7.addAll(i15, arrayList8);
                        w3Var.t4();
                        w3Var.Y2.N(false);
                        ii.h2 h2Var2 = w3Var.J3;
                        if (h2Var2 != null) {
                            h2Var2.h();
                        }
                        w3Var.f11714h3.onContentChanged();
                        if (!arrayList8.isEmpty()) {
                            aVar = (ii.a) hg.k0.g(1, arrayList8);
                        }
                        w3Var.post(new gg.x1(16, n3Var, aVar));
                        return;
                    }
                    return;
                }
                return;
            case 26:
                ((ii.m) this.f1745b).f11496a.f11591r.V1((TL_iv.RichMessage) obj);
                return;
            case 27:
                ((ii.d2) this.f1745b).P.V1((TL_iv.RichMessage) obj);
                return;
            case 28:
                ii.w3 w3Var2 = (ii.w3) this.f1745b;
                String str2 = (String) obj;
                w3Var2.getClass();
                if (!TextUtils.isEmpty(str2)) {
                    TL_iv.pageBlockMath pageblockmath = new TL_iv.pageBlockMath();
                    pageblockmath.source = str2;
                    w3Var2.S1(pageblockmath);
                    return;
                }
                return;
            default:
                AndroidUtilities.hideKeyboard((bu) this.f1745b);
                AndroidUtilities.runOnUIThread((Runnable) obj, 80L);
                return;
        }
    }
}
