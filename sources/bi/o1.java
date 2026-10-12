package bi;

import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import di.kc;
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
import org.telegram.ui.Components.gh0;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.so0;
import org.telegram.ui.Components.x71;
import org.telegram.ui.Components.z61;
import org.telegram.ui.fo;
import org.telegram.ui.iy;
import org.telegram.ui.yy;
public final class o1 implements Utilities.Callback {
    public final int f3400a;
    public final Object f3401b;

    public o1(Object obj, int i10) {
        this.f3400a = i10;
        this.f3401b = obj;
    }

    @Override
    public final void run(Object obj) {
        String str;
        boolean z10;
        int i10;
        float f7;
        z61 z61Var;
        boolean z11;
        TL_account.TL_connectedBot tL_connectedBot;
        TLRPC.User user;
        TL_account.TL_businessBotRights makeDefault;
        boolean z12;
        boolean z13;
        z61 z61Var2;
        Editable editable;
        int i11;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = null;
        ji.a aVar = null;
        int i12 = 0;
        boolean z14 = false;
        int i13 = 0;
        switch (this.f3400a) {
            case 0:
                t1 t1Var = (t1) this.f3401b;
                if (((Boolean) obj).booleanValue() && !t1Var.f3727w) {
                    t1Var.f3724n = true;
                    t1Var.I = true;
                    t1Var.u(false);
                    t1.W = t1Var;
                    t1Var.J = NativeInstance.createVideoCapturer(t1Var.H, t1Var.I ? 1 : 0);
                    if (t1Var.E != null) {
                        DispatchQueue dispatchQueue = Utilities.globalQueue;
                        NativeInstance nativeInstance = t1Var.E;
                        Objects.requireNonNull(nativeInstance);
                        dispatchQueue.postRunnable(new org.telegram.messenger.voip.t0(nativeInstance, 3));
                        t1Var.M.clear();
                        t1Var.E = null;
                    }
                    t1Var.c();
                    t1Var.k();
                    NotificationCenter.getInstance(t1Var.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(t1Var.f3723f.f19233id));
                    return;
                }
                return;
            case 1:
                sb sbVar = (sb) this.f3401b;
                Boolean bool = (Boolean) obj;
                sbVar.f3685k1 = false;
                sbVar.P();
                return;
            case 2:
                w6 w6Var = (w6) obj;
                e7 e7Var = ((b7) this.f3401b).e;
                while (true) {
                    ArrayList arrayList = e7Var.G;
                    if (i12 < arrayList.size()) {
                        if (w6Var != arrayList.get(i12)) {
                            ((w6) arrayList.get(i12)).getClass();
                        }
                        i12++;
                    } else {
                        return;
                    }
                }
            case 3:
                ca caVar = (ca) this.f3401b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                caVar.f2927p = true;
                if (storyItem != null && (str = storyItem.caption) != null) {
                    caVar.f2924m = true;
                    caVar.f2923l = str;
                    caVar.f2918f = TextUtils.isEmpty(str);
                    View view = caVar.f2929r;
                    if (view != null) {
                        view.invalidate();
                    }
                    Runnable runnable = caVar.f2930s;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ci.y yVar = (ci.y) this.f3401b;
                String str2 = (String) obj;
                ArrayList arrayList2 = yVar.h;
                if (!arrayList2.contains(str2)) {
                    arrayList2.add(str2);
                    yVar.i(true);
                }
                AndroidUtilities.runOnUIThread(new u8(19, yVar, str2), 120L);
                return;
            case 5:
                ((di.m) this.f3401b).x(((Integer) obj).intValue());
                return;
            case 6:
                di.e0 e0Var = (di.e0) this.f3401b;
                e0Var.f6867j0.f6775n.P = ((Float) obj).floatValue();
                di.d0 d0Var = e0Var.f6867j0;
                di.c0 c0Var = d0Var.d;
                if (c0Var != null) {
                    c0Var.setVolume(d0Var.f6775n.P);
                    return;
                }
                return;
            case 7:
                di.q0 q0Var = (di.q0) this.f3401b;
                VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
                MessageObject messageObject = q0Var.f7613c;
                if (messageObject != null) {
                    messageObject.videoEditedInfo = videoEditedInfo;
                    MediaController.getInstance().scheduleVideoConvert(q0Var.f7613c);
                    return;
                }
                return;
            case 8:
                di.w2 w2Var = (di.w2) this.f3401b;
                w2Var.h(-1.0f);
                AndroidUtilities.runOnUIThread(new u8(27, w2Var, (Runnable) obj), 80L);
                return;
            case 9:
                ((di.v3) this.f3401b).f7992s.animate().translationY(((-((Integer) obj).intValue()) / 2.0f) + AndroidUtilities.dp(80.0f)).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.o1.f20554w).start();
                return;
            case 10:
                di.s4 s4Var = (di.s4) this.f3401b;
                View view2 = (View) obj;
                di.n4 n4Var = s4Var.f7753b;
                if (view2 instanceof di.r4) {
                    n4Var.getClass();
                    int R = RecyclerView.R(view2);
                    l61 G = n4Var.W2.G(R);
                    if (G != null) {
                        di.r4 r4Var = (di.r4) view2;
                        r4Var.setPosition(s4Var.b(R));
                        if (s4Var.f7755f == G.d) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        r4Var.b(z10, true);
                        boolean contains = s4Var.e.contains(Integer.valueOf(G.d));
                        if (r4Var.f7702f != contains) {
                            r4Var.f7702f = contains;
                            r4Var.invalidate();
                        }
                        view2.setPressed(false);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                di.n4 n4Var2 = (di.n4) this.f3401b;
                View view3 = (View) obj;
                if (view3 instanceof di.r4) {
                    di.bb bbVar = n4Var2.f7452d3;
                    bbVar.f7753b.getClass();
                    ((di.r4) view3).setPosition(bbVar.b(RecyclerView.R(view3)));
                    view3.setPressed(false);
                    return;
                }
                return;
            case 12:
                di.mb mbVar = (di.mb) ((di.o6) this.f3401b);
                kc kcVar = mbVar.A2;
                kcVar.X0.q((MessageObject) obj);
                di.k8 k8Var = kcVar.K1;
                if (k8Var != null && kcVar.O1 != 1) {
                    boolean isEmpty = TextUtils.isEmpty(k8Var.f7220y);
                    boolean z15 = !isEmpty;
                    ((gh0) kcVar.f7265j1.f7588c).a(!kcVar.X0.k(), false);
                    kcVar.f7265j1.setVisibility(0);
                    ViewPropertyAnimator animate = kcVar.f7265j1.animate();
                    if (!isEmpty) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    animate.alpha(f7).withEndAction(new ah.t(6, mbVar, z15)).start();
                }
                if (kcVar.A0.j()) {
                    ArrayList arrayList3 = kcVar.A0.h;
                    int size = arrayList3.size();
                    while (true) {
                        if (i13 < size) {
                            Object obj2 = arrayList3.get(i13);
                            i13++;
                            di.k8 k8Var2 = ((di.d0) obj2).f6775n;
                            if (k8Var2 != null && k8Var2.K) {
                                if (!TextUtils.isEmpty(kcVar.K1.f7220y)) {
                                    i10 = 2;
                                }
                            }
                        }
                    }
                }
                i10 = -1;
                kcVar.k0(i10, true, true);
                return;
            case 13:
                di.j8 j8Var = (di.j8) obj;
                x71 x71Var = ((di.a7) this.f3401b).f6609n;
                if (x71Var != null) {
                    x71Var.setHDRInfo(j8Var);
                    return;
                }
                return;
            case 14:
                di.c8.T((di.c8) this.f3401b, (Long) obj);
                return;
            case 15:
                di.t8 t8Var = (di.t8) this.f3401b;
                rg.p0 p0Var = (rg.p0) obj;
                if (p0Var == null) {
                    t8Var.V();
                    return;
                }
                t8Var.f7851o0 = p0Var.e;
                t8Var.f7850n0 = p0Var.f44448f;
                return;
            case 16:
                ((di.t9) this.f3401b).f7853n.W.H = ((Integer) obj).intValue();
                return;
            case 17:
                ((di.fb) this.f3401b).h((Utilities.Callback) obj);
                return;
            case 18:
                fi.t tVar = (fi.t) this.f3401b;
                ArrayList arrayList4 = tVar.f9541b;
                arrayList4.clear();
                arrayList4.addAll((ArrayList) obj);
                h71 h71Var = tVar.f9540a;
                if (h71Var != null && (z61Var = h71Var.W2) != null) {
                    z61Var.N(true);
                    return;
                }
                return;
            case 19:
                gi.f fVar = (gi.f) this.f3401b;
                ArrayList arrayList5 = (ArrayList) obj;
                ArrayList arrayList6 = fVar.h;
                z14 = (arrayList6 == null || arrayList6.isEmpty()) ? true : true;
                fVar.h = arrayList5;
                h71 h71Var2 = fVar.e;
                if (h71Var2 != null) {
                    h71Var2.W2.N(z14);
                    return;
                }
                return;
            case 20:
                ((hg.m) this.f3401b).L((TLRPC.User) obj);
                return;
            case 21:
                TLRPC.User user2 = (TLRPC.User) obj;
                so0 so0Var = (so0) ((hg.h0) this.f3401b);
                iy iyVar = so0Var.K0;
                if (user2 != null) {
                    yy yyVar = iyVar.J0;
                    if (yyVar != null) {
                        yyVar.H3();
                    }
                    MessagesController.getInstance(iyVar.H0).openApp(user2, 0);
                    so0Var.R(user2.f19363id, user2);
                    return;
                }
                return;
            case 22:
                ig.m mVar = (ig.m) this.f3401b;
                if (((Integer) obj).intValue() > AndroidUtilities.dp(20.0f)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (mVar.F != z11) {
                    mVar.F = z11;
                    if (!z11) {
                        mVar.f23964a.x0(0);
                        return;
                    }
                    return;
                }
                return;
            case 23:
                Object[] objArr = (Object[]) obj;
                AndroidUtilities.forEachViews((RecyclerView) ((ig.i0) this.f3401b).f11525s, (Utilities.Callback<View>) new f(3));
                return;
            case 24:
                ig.u0 u0Var = (ig.u0) this.f3401b;
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
                ig.a0 a0Var = u0Var.v;
                if (a0Var != null) {
                    if (tL_connectedBot3 != null) {
                        tL_businessBotRecipients = tL_connectedBot3.recipients;
                    }
                    a0Var.i(tL_businessBotRecipients);
                }
                h71 h71Var3 = u0Var.f11649c;
                if (h71Var3 != null && (z61Var2 = h71Var3.W2) != null) {
                    z13 = true;
                    z61Var2.N(true);
                } else {
                    z13 = true;
                }
                u0Var.Y(z13);
                u0Var.T = z13;
                return;
            case 25:
                ig.w0 w0Var = (ig.w0) this.f3401b;
                w0Var.f11681w = w0Var.e[((Integer) obj).intValue()];
                w0Var.V(true);
                return;
            case 26:
                ig.y1 y1Var = (ig.y1) this.f3401b;
                y1Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt("chatMode", 5);
                bundle.putLong("user_id", y1Var.getUserConfig().getClientUserId());
                bundle.putString("quick_reply", (String) obj);
                fo foVar = new fo(bundle);
                foVar.C9 = true;
                y1Var.presentFragment(foVar);
                return;
            case 27:
                AndroidUtilities.hideKeyboard((ig.r1) this.f3401b);
                AndroidUtilities.runOnUIThread((Runnable) obj, 80L);
                return;
            case 28:
                ji.o3 o3Var = (ji.o3) this.f3401b;
                TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj;
                int i14 = o3Var.f13451b;
                int i15 = o3Var.f13450a;
                ji.x3 x3Var = o3Var.e;
                if (richMessage != null) {
                    ArrayList arrayList7 = x3Var.f13635j3;
                    ArrayList arrayList8 = x3Var.f13635j3;
                    if (i15 < arrayList7.size() && i14 < arrayList8.size()) {
                        ji.h2 h2Var = x3Var.H3;
                        if (h2Var != null) {
                            h2Var.d();
                        }
                        ji.k3 k3Var = x3Var.f13639l3;
                        if (k3Var != null) {
                            k3Var.f(false);
                        }
                        ji.a aVar2 = (ji.a) arrayList8.get(i15);
                        ji.a aVar3 = (ji.a) arrayList8.get(i14);
                        CharSequence charSequence = "";
                        if (!ji.x3.B3(aVar2.f13103b)) {
                            editable = "";
                        } else {
                            editable = x3Var.N4(aVar2);
                        }
                        if (ji.x3.B3(aVar3.f13103b)) {
                            charSequence = x3Var.N4(aVar3);
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(editable.subSequence(0, Math.max(0, Math.min(o3Var.f13452c, editable.length()))));
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence.subSequence(Math.max(0, Math.min(o3Var.d, charSequence.length())), charSequence.length()));
                        ArrayList arrayList9 = new ArrayList();
                        ji.x3.X2(arrayList9, richMessage.blocks, null);
                        if (arrayList9.isEmpty()) {
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder);
                            spannableStringBuilder3.append((CharSequence) spannableStringBuilder2);
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            ji.i6.e(pageblockparagraph, spannableStringBuilder3);
                            arrayList9.add(new ji.a(pageblockparagraph, aVar2.f13104c, aVar2.d));
                        } else {
                            if (spannableStringBuilder.length() > 0) {
                                ji.a aVar4 = (ji.a) arrayList9.get(0);
                                if (ji.x3.B3(aVar4.f13103b)) {
                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(spannableStringBuilder);
                                    spannableStringBuilder4.append((CharSequence) ji.i6.A(aVar4.f13103b));
                                    ji.i6.e(aVar4.f13103b, spannableStringBuilder4);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                    ji.i6.e(pageblockparagraph2, spannableStringBuilder);
                                    arrayList9.add(0, new ji.a(pageblockparagraph2, aVar2.f13104c, aVar2.d));
                                }
                            }
                            if (spannableStringBuilder2.length() > 0) {
                                ji.a aVar5 = (ji.a) i2.d.g(1, arrayList9);
                                if (ji.x3.B3(aVar5.f13103b)) {
                                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(ji.i6.A(aVar5.f13103b));
                                    spannableStringBuilder5.append((CharSequence) spannableStringBuilder2);
                                    ji.i6.e(aVar5.f13103b, spannableStringBuilder5);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph3 = new TL_iv.pageBlockParagraph();
                                    ji.i6.e(pageblockparagraph3, spannableStringBuilder2);
                                    arrayList9.add(new ji.a(pageblockparagraph3, aVar3.f13104c, aVar3.d));
                                }
                            }
                        }
                        TL_iv.RichMessage richMessage2 = x3Var.f13633i3;
                        if (richMessage2 == null) {
                            x3Var.f13633i3 = richMessage;
                        } else {
                            ArrayList<TLRPC.Photo> arrayList10 = richMessage.photos;
                            if (arrayList10 != null) {
                                richMessage2.photos.addAll(arrayList10);
                            }
                            ArrayList<TLRPC.Document> arrayList11 = richMessage.documents;
                            if (arrayList11 != null) {
                                x3Var.f13633i3.documents.addAll(arrayList11);
                            }
                        }
                        for (int i16 = 0; i16 < arrayList9.size(); i16++) {
                            x3Var.w4((ji.a) arrayList9.get(i16));
                        }
                        while (i14 >= i15) {
                            arrayList8.remove(i14);
                            i14--;
                        }
                        arrayList8.addAll(i15, arrayList9);
                        x3Var.t4();
                        x3Var.W2.N(false);
                        ji.h2 h2Var2 = x3Var.H3;
                        if (h2Var2 != null) {
                            h2Var2.h();
                        }
                        x3Var.f13627f3.onContentChanged();
                        if (arrayList9.isEmpty()) {
                            i11 = 1;
                        } else {
                            i11 = 1;
                            aVar = (ji.a) i2.d.g(1, arrayList9);
                        }
                        x3Var.post(new ji.v2(i11, o3Var, aVar));
                        return;
                    }
                    return;
                }
                return;
            default:
                ((ji.m) this.f3401b).f13395a.f13483r.V1((TL_iv.RichMessage) obj);
                return;
        }
    }
}
