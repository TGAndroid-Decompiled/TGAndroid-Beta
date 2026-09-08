package bi;

import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import di.pc;
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
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.fg0;
import org.telegram.ui.Components.rn0;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.zt;
import org.telegram.ui.co;
import org.telegram.ui.ey;
import org.telegram.ui.uy;
public final class o1 implements Utilities.Callback {
    public final int f3420a;
    public final Object f3421b;

    public o1(Object obj, int i10) {
        this.f3420a = i10;
        this.f3421b = obj;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        float f7;
        v51 v51Var;
        boolean z10;
        TL_account.TL_connectedBot tL_connectedBot;
        TLRPC.User user;
        TL_account.TL_businessBotRights makeDefault;
        boolean z11;
        boolean z12;
        v51 v51Var2;
        Editable editable;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = null;
        ji.a aVar = null;
        int i11 = 0;
        boolean z13 = false;
        switch (this.f3420a) {
            case 0:
                t1 t1Var = (t1) this.f3421b;
                if (((Boolean) obj).booleanValue() && !t1Var.f3750w) {
                    t1Var.f3747n = true;
                    t1Var.I = true;
                    t1Var.u(false);
                    t1.W = t1Var;
                    t1Var.J = NativeInstance.createVideoCapturer(t1Var.H, t1Var.I ? 1 : 0);
                    if (t1Var.E != null) {
                        DispatchQueue dispatchQueue = Utilities.globalQueue;
                        NativeInstance nativeInstance = t1Var.E;
                        Objects.requireNonNull(nativeInstance);
                        dispatchQueue.postRunnable(new org.telegram.messenger.voip.r0(nativeInstance, 3));
                        t1Var.M.clear();
                        t1Var.E = null;
                    }
                    t1Var.c();
                    t1Var.k();
                    NotificationCenter.getInstance(t1Var.f3745e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(t1Var.f3746f.f19913id));
                    return;
                }
                return;
            case 1:
                o5 o5Var = (o5) this.f3421b;
                o5Var.L3 = ((Long) obj).longValue();
                n3 n3Var = o5Var.f3433b2;
                if (n3Var != null) {
                    n3Var.K(true);
                    o5Var.f3433b2.R1();
                }
                o5Var.r0(true);
                return;
            case 2:
                pb pbVar = (pb) this.f3421b;
                Boolean bool = (Boolean) obj;
                pbVar.f3584k1 = false;
                pbVar.P();
                return;
            case 3:
                u8 u8Var = (u8) this.f3421b;
                l8 l8Var = (l8) obj;
                HashMap hashMap = u8Var.H;
                int i12 = l8Var.f3299e;
                int i13 = l8Var.f3300f;
                long j3 = l8Var.d;
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
                HashMap hashMap3 = u8Var.G[i12];
                if (hashMap3 != null) {
                    hashMap3.remove(Long.valueOf(j3));
                    return;
                }
                return;
            case 4:
                ci.y yVar = (ci.y) this.f3421b;
                String str = (String) obj;
                ArrayList arrayList = yVar.h;
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                    yVar.i(true);
                }
                AndroidUtilities.runOnUIThread(new s8(18, yVar, str), 120L);
                return;
            case 5:
                ((di.m) this.f3421b).x(((Integer) obj).intValue());
                return;
            case 6:
                di.e0 e0Var = (di.e0) this.f3421b;
                e0Var.f7161j0.f7064n.P = ((Float) obj).floatValue();
                di.d0 d0Var = e0Var.f7161j0;
                di.c0 c0Var = d0Var.d;
                if (c0Var != null) {
                    c0Var.setVolume(d0Var.f7064n.P);
                    return;
                }
                return;
            case 7:
                di.r0 r0Var = (di.r0) this.f3421b;
                VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
                MessageObject messageObject = r0Var.f8080c;
                if (messageObject != null) {
                    messageObject.videoEditedInfo = videoEditedInfo;
                    MediaController.getInstance().scheduleVideoConvert(r0Var.f8080c);
                    return;
                }
                return;
            case 8:
                di.y2 y2Var = (di.y2) this.f3421b;
                y2Var.h(-1.0f);
                AndroidUtilities.runOnUIThread(new s8(25, y2Var, (Runnable) obj), 80L);
                return;
            case 9:
                ((di.x3) this.f3421b).f8406s.animate().translationY(((-((Integer) obj).intValue()) / 2.0f) + AndroidUtilities.dp(80.0f)).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.p1.f21302w).start();
                return;
            case 10:
                di.rb rbVar = (di.rb) ((di.q6) this.f3421b);
                pc pcVar = rbVar.A2;
                pcVar.X0.q((MessageObject) obj);
                di.o8 o8Var = pcVar.K1;
                if (o8Var != null && pcVar.O1 != 1) {
                    boolean isEmpty = TextUtils.isEmpty(o8Var.f7817y);
                    boolean z14 = !isEmpty;
                    ((fg0) pcVar.f7901j1.f8097c).a(!pcVar.X0.k(), false);
                    pcVar.f7901j1.setVisibility(0);
                    ViewPropertyAnimator animate = pcVar.f7901j1.animate();
                    if (!isEmpty) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    animate.alpha(f7).withEndAction(new ah.u(6, rbVar, z14)).start();
                }
                if (pcVar.A0.j()) {
                    ArrayList arrayList2 = pcVar.A0.h;
                    int size = arrayList2.size();
                    while (true) {
                        if (i11 < size) {
                            Object obj2 = arrayList2.get(i11);
                            i11++;
                            di.o8 o8Var2 = ((di.d0) obj2).f7064n;
                            if (o8Var2 != null && o8Var2.K) {
                                if (!TextUtils.isEmpty(pcVar.K1.f7817y)) {
                                    i10 = 2;
                                }
                            }
                        }
                    }
                }
                i10 = -1;
                pcVar.l0(i10, true, true);
                return;
            case 11:
                di.n8 n8Var = (di.n8) obj;
                u61 u61Var = ((di.d7) this.f3421b).f7113n;
                if (u61Var != null) {
                    u61Var.setHDRInfo(n8Var);
                    return;
                }
                return;
            case 12:
                di.x8 x8Var = (di.x8) this.f3421b;
                rg.p0 p0Var = (rg.p0) obj;
                if (p0Var == null) {
                    x8Var.U();
                    return;
                }
                x8Var.f8436o0 = p0Var.f45438e;
                x8Var.f8435n0 = p0Var.f45439f;
                return;
            case 13:
                ((di.x9) this.f3421b).f8439n.W.H = ((Integer) obj).intValue();
                return;
            case 14:
                ((di.jb) this.f3421b).g((Utilities.Callback) obj);
                return;
            case 15:
                fi.u uVar = (fi.u) this.f3421b;
                ArrayList arrayList3 = uVar.f10014b;
                arrayList3.clear();
                arrayList3.addAll((ArrayList) obj);
                d61 d61Var = uVar.f10013a;
                if (d61Var != null && (v51Var = d61Var.Y2) != null) {
                    v51Var.N(true);
                    return;
                }
                return;
            case 16:
                gi.f fVar = (gi.f) this.f3421b;
                ArrayList arrayList4 = (ArrayList) obj;
                ArrayList arrayList5 = fVar.h;
                z13 = (arrayList5 == null || arrayList5.isEmpty()) ? true : true;
                fVar.h = arrayList4;
                d61 d61Var2 = fVar.f10710e;
                if (d61Var2 != null) {
                    d61Var2.Y2.N(z13);
                    return;
                }
                return;
            case 17:
                ((hg.m) this.f3421b).L((TLRPC.User) obj);
                return;
            case 18:
                TLRPC.User user2 = (TLRPC.User) obj;
                rn0 rn0Var = (rn0) ((hg.i0) this.f3421b);
                ey eyVar = rn0Var.K0;
                if (user2 != null) {
                    uy uyVar = eyVar.J0;
                    if (uyVar != null) {
                        uyVar.K3();
                    }
                    MessagesController.getInstance(eyVar.H0).openApp(user2, 0);
                    rn0Var.R(user2.f20043id, user2);
                    return;
                }
                return;
            case 19:
                ig.m mVar = (ig.m) this.f3421b;
                if (((Integer) obj).intValue() > AndroidUtilities.dp(20.0f)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (mVar.F != z10) {
                    mVar.F = z10;
                    if (!z10) {
                        mVar.f32876a.x0(0);
                        return;
                    }
                    return;
                }
                return;
            case 20:
                Object[] objArr = (Object[]) obj;
                AndroidUtilities.forEachViews((RecyclerView) ((ig.i0) this.f3421b).f12119s, (e2.h) new f(3));
                return;
            case 21:
                ig.u0 u0Var = (ig.u0) this.f3421b;
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
                ig.a0 a0Var = u0Var.v;
                if (a0Var != null) {
                    if (tL_connectedBot3 != null) {
                        tL_businessBotRecipients = tL_connectedBot3.recipients;
                    }
                    a0Var.i(tL_businessBotRecipients);
                }
                d61 d61Var3 = u0Var.f12255c;
                if (d61Var3 != null && (v51Var2 = d61Var3.Y2) != null) {
                    z12 = true;
                    v51Var2.N(true);
                } else {
                    z12 = true;
                }
                u0Var.Y(z12);
                u0Var.T = z12;
                return;
            case 22:
                ig.w0 w0Var = (ig.w0) this.f3421b;
                w0Var.f12291w = w0Var.f12286e[((Integer) obj).intValue()];
                w0Var.V(true);
                return;
            case 23:
                ig.y1 y1Var = (ig.y1) this.f3421b;
                y1Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt("chatMode", 5);
                bundle.putLong("user_id", y1Var.getUserConfig().getClientUserId());
                bundle.putString("quick_reply", (String) obj);
                co coVar = new co(bundle);
                coVar.C9 = true;
                y1Var.presentFragment(coVar);
                return;
            case 24:
                AndroidUtilities.hideKeyboard((ig.r1) this.f3421b);
                AndroidUtilities.runOnUIThread((Runnable) obj, 80L);
                return;
            case 25:
                ji.m3 m3Var = (ji.m3) this.f3421b;
                TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj;
                int i14 = m3Var.f14086b;
                int i15 = m3Var.f14085a;
                ji.v3 v3Var = m3Var.f14088e;
                if (richMessage != null) {
                    ArrayList arrayList6 = v3Var.f14282l3;
                    ArrayList arrayList7 = v3Var.f14282l3;
                    if (i15 < arrayList6.size() && i14 < arrayList7.size()) {
                        ji.g2 g2Var = v3Var.J3;
                        if (g2Var != null) {
                            g2Var.d();
                        }
                        ji.i3 i3Var = v3Var.f14285n3;
                        if (i3Var != null) {
                            i3Var.f(false);
                        }
                        ji.a aVar2 = (ji.a) arrayList7.get(i15);
                        ji.a aVar3 = (ji.a) arrayList7.get(i14);
                        CharSequence charSequence = "";
                        if (!ji.v3.z3(aVar2.f13758b)) {
                            editable = "";
                        } else {
                            editable = v3Var.L4(aVar2);
                        }
                        if (ji.v3.z3(aVar3.f13758b)) {
                            charSequence = v3Var.L4(aVar3);
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(editable.subSequence(0, Math.max(0, Math.min(m3Var.f14087c, editable.length()))));
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence.subSequence(Math.max(0, Math.min(m3Var.d, charSequence.length())), charSequence.length()));
                        ArrayList arrayList8 = new ArrayList();
                        ji.v3.V2(arrayList8, richMessage.blocks, null);
                        if (arrayList8.isEmpty()) {
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder);
                            spannableStringBuilder3.append((CharSequence) spannableStringBuilder2);
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            ji.g6.e(pageblockparagraph, spannableStringBuilder3);
                            arrayList8.add(new ji.a(pageblockparagraph, aVar2.f13759c, aVar2.d));
                        } else {
                            if (spannableStringBuilder.length() > 0) {
                                ji.a aVar4 = (ji.a) arrayList8.get(0);
                                if (ji.v3.z3(aVar4.f13758b)) {
                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(spannableStringBuilder);
                                    spannableStringBuilder4.append((CharSequence) ji.g6.A(aVar4.f13758b));
                                    ji.g6.e(aVar4.f13758b, spannableStringBuilder4);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                    ji.g6.e(pageblockparagraph2, spannableStringBuilder);
                                    arrayList8.add(0, new ji.a(pageblockparagraph2, aVar2.f13759c, aVar2.d));
                                }
                            }
                            if (spannableStringBuilder2.length() > 0) {
                                ji.a aVar5 = (ji.a) i2.g.h(1, arrayList8);
                                if (ji.v3.z3(aVar5.f13758b)) {
                                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(ji.g6.A(aVar5.f13758b));
                                    spannableStringBuilder5.append((CharSequence) spannableStringBuilder2);
                                    ji.g6.e(aVar5.f13758b, spannableStringBuilder5);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph3 = new TL_iv.pageBlockParagraph();
                                    ji.g6.e(pageblockparagraph3, spannableStringBuilder2);
                                    arrayList8.add(new ji.a(pageblockparagraph3, aVar3.f13759c, aVar3.d));
                                }
                            }
                        }
                        TL_iv.RichMessage richMessage2 = v3Var.f14280k3;
                        if (richMessage2 == null) {
                            v3Var.f14280k3 = richMessage;
                        } else {
                            ArrayList<TLRPC.Photo> arrayList9 = richMessage.photos;
                            if (arrayList9 != null) {
                                richMessage2.photos.addAll(arrayList9);
                            }
                            ArrayList<TLRPC.Document> arrayList10 = richMessage.documents;
                            if (arrayList10 != null) {
                                v3Var.f14280k3.documents.addAll(arrayList10);
                            }
                        }
                        for (int i16 = 0; i16 < arrayList8.size(); i16++) {
                            v3Var.u4((ji.a) arrayList8.get(i16));
                        }
                        while (i14 >= i15) {
                            arrayList7.remove(i14);
                            i14--;
                        }
                        arrayList7.addAll(i15, arrayList8);
                        v3Var.r4();
                        v3Var.Y2.N(false);
                        ji.g2 g2Var2 = v3Var.J3;
                        if (g2Var2 != null) {
                            g2Var2.h();
                        }
                        v3Var.f14275h3.onContentChanged();
                        if (!arrayList8.isEmpty()) {
                            aVar = (ji.a) i2.g.h(1, arrayList8);
                        }
                        v3Var.post(new fi.j4(29, m3Var, aVar));
                        return;
                    }
                    return;
                }
                return;
            case 26:
                ((ji.m) this.f3421b).f14074a.f14159r.T1((TL_iv.RichMessage) obj);
                return;
            case 27:
                ((ji.c2) this.f3421b).P.T1((TL_iv.RichMessage) obj);
                return;
            case 28:
                ji.v3 v3Var2 = (ji.v3) this.f3421b;
                String str2 = (String) obj;
                v3Var2.getClass();
                if (!TextUtils.isEmpty(str2)) {
                    TL_iv.pageBlockMath pageblockmath = new TL_iv.pageBlockMath();
                    pageblockmath.source = str2;
                    v3Var2.Q1(pageblockmath);
                    return;
                }
                return;
            default:
                AndroidUtilities.hideKeyboard((zt) this.f3421b);
                AndroidUtilities.runOnUIThread((Runnable) obj, 80L);
                return;
        }
    }
}
