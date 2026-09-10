package gg;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import hi.a6;
import hi.d6;
import hi.f6;
import hi.g6;
import hi.h3;
import hi.i6;
import hi.m3;
import hi.r5;
import hi.z3;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.n3;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.ActionBar.p3;
import org.telegram.ui.ActionBar.q3;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Cells.ra;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.j8;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wc;
import org.telegram.ui.eo;
public final class a0 implements Runnable {
    public final int f8799a;
    public final Object f8800b;
    public final Object f8801c;
    public final Object d;

    public a0(ViewGroup viewGroup, Object obj, String str, int i10) {
        this.f8799a = i10;
        this.f8800b = viewGroup;
        this.d = obj;
        this.f8801c = str;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        int i10 = this.f8799a;
        int i11 = 0;
        Object obj = this.d;
        ?? r82 = this.f8801c;
        Object obj2 = this.f8800b;
        switch (i10) {
            case 0:
                b0 b0Var = (b0) obj2;
                TL_account.deleteBusinessChatLink deletebusinesschatlink = new TL_account.deleteBusinessChatLink();
                deletebusinesschatlink.slug = (String) r82;
                ConnectionsManager.getInstance(b0Var.f8816a).sendRequest(deletebusinesschatlink, new bi.o2(8, b0Var, (TL_account.TL_businessChatLink) obj));
                return;
            case 1:
                p0.P((p0) obj2, (TL_account.TL_connectedBot) r82, (TL_account.TL_businessBotRecipients) obj);
                return;
            case 2:
                a1 a1Var = (a1) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) r82;
                TLObject tLObject = (TLObject) obj;
                if (tL_error != null) {
                    a1Var.f8802a.a(0.0f);
                    wc.b0(tL_error);
                    return;
                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                    a1Var.f8802a.a(0.0f);
                    org.telegram.messenger.a2.p(R.string.UnknownError, wc.a0(a1Var), null);
                    return;
                } else {
                    a1Var.finishFragment();
                    return;
                }
            case 3:
                m1.U((m1) obj2, (TLRPC.TL_error) r82, (TLObject) obj);
                return;
            case 4:
                o2 o2Var = (o2) obj2;
                TLObject tLObject2 = (TLObject) r82;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                ArrayList arrayList = o2Var.d;
                if (tLObject2 instanceof TLRPC.TL_help_timezonesList) {
                    arrayList.clear();
                    arrayList.addAll(((TLRPC.TL_help_timezonesList) tLObject2).timezones);
                    SerializedData serializedData = new SerializedData(tLObject2.getObjectSize());
                    tLObject2.serializeToStream(serializedData);
                    sharedPreferences.edit().putString("timezones", Utilities.bytesToHex(serializedData.toByteArray())).apply();
                    NotificationCenter.getInstance(o2Var.f8988a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.timezonesUpdated, new Object[0]);
                }
                o2Var.f8990c = true;
                o2Var.f8989b = false;
                return;
            case 5:
                z3 z3Var = (z3) obj2;
                r5 r5Var = (r5) obj;
                if (z3Var.f10005j4 == ((w70) r82)) {
                    z3Var.f10005j4 = null;
                    if (z3Var.C3 && z3Var.f10004i4 == r5Var && !r5Var.H.isEmpty()) {
                        z3Var.L2();
                        return;
                    }
                    return;
                }
                return;
            case 6:
                z3 z3Var2 = (z3) obj2;
                hi.a aVar = (hi.a) r82;
                hi.a aVar2 = (hi.a) obj;
                ArrayList arrayList2 = z3Var2.f10016p4;
                m3 m3Var = z3Var2.f10011n3;
                if (m3Var != null && aVar != null && aVar2 != null) {
                    int indexOf = arrayList2.indexOf(aVar);
                    int indexOf2 = arrayList2.indexOf(aVar2);
                    if (indexOf >= 0 && indexOf2 >= 0) {
                        while (i11 < arrayList2.size()) {
                            hi.a aVar3 = (hi.a) arrayList2.get(i11);
                            long j3 = aVar3.f9436t;
                            if (j3 != 0) {
                                m3Var.Y(i11, i6.l((TL_iv.RichText) z3Var2.f10009m3.get(Long.valueOf(j3))));
                            } else {
                                m3Var.Y(i11, g6.z(aVar3.f9421b));
                            }
                            i11++;
                        }
                        m3Var.j0(Math.min(indexOf, indexOf2), Math.max(indexOf, indexOf2));
                        return;
                    }
                    return;
                }
                return;
            case 7:
                ((z3) obj2).Y4((hi.a) obj, (String) r82);
                return;
            case 8:
                hi.a aVar4 = (hi.a) r82;
                f6 f6Var = (f6) obj;
                d6 d6Var = ((a6) obj2).f9461a.f9627y;
                if (d6Var != null) {
                    ((h3) d6Var).d(aVar4, f6Var.f9572a, f6Var.f9573b, f6Var.f9574c, f6Var.d, f6Var.e);
                    return;
                }
                return;
            case 9:
                u2.g0 g0Var = (u2.g0) obj;
                j2.e eVar = ((i2.u0) obj2).f10378c;
                e9.a1 i12 = ((e9.f0) r82).i();
                com.google.firebase.messaging.n nVar = eVar.d;
                b2.b1 b1Var = eVar.h;
                b1Var.getClass();
                nVar.getClass();
                nVar.f6104b = e9.i0.v(i12);
                if (!i12.isEmpty()) {
                    nVar.e = (u2.g0) i12.get(0);
                    g0Var.getClass();
                    nVar.f6106f = g0Var;
                }
                if (((u2.g0) nVar.d) == null) {
                    nVar.d = com.google.firebase.messaging.n.p(b1Var, (e9.i0) nVar.f6104b, (u2.g0) nVar.e, (b2.h1) nVar.f6103a);
                }
                nVar.H(b1Var.w0());
                return;
            case 10:
                Pair pair = (Pair) r82;
                ((i2.b1) obj2).f10110b.h.b(((Integer) pair.first).intValue(), (u2.g0) pair.second, (Exception) obj);
                return;
            case 11:
                ii.n nVar2 = (ii.n) obj2;
                ArrayList arrayList3 = (ArrayList) r82;
                ArrayList arrayList4 = (ArrayList) obj;
                nVar2.getClass();
                for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                    ((View) arrayList3.get(i13)).setVisibility(0);
                }
                if (nVar2.A.removeAll(arrayList4)) {
                    while (i11 < arrayList4.size()) {
                        nVar2.d((s4.c1) arrayList4.get(i11));
                        i11++;
                    }
                    nVar2.G();
                }
                nVar2.K.removeAll(arrayList3);
                return;
            case 12:
                ii.n nVar3 = (ii.n) obj2;
                View view = (View) r82;
                s4.c1 c1Var = (s4.c1) obj;
                nVar3.getClass();
                view.setVisibility(0);
                if (nVar3.A.remove(c1Var)) {
                    nVar3.d(c1Var);
                    nVar3.G();
                }
                nVar3.K.remove(view);
                return;
            case 13:
                String str = e2.d0.f7188a;
                j2.e eVar2 = ((i2.b0) ((k2.j) ((of.b) obj2).f14295c)).f10108a.f10157s;
                j2.a p5 = eVar2.p();
                eVar2.q(p5, 1009, new j2.d(p5, (b2.s) r82, (i2.h) obj, 13));
                return;
            case 14:
                m4.x xVar = (m4.x) obj2;
                m4.r rVar = (m4.r) r82;
                KeyEvent keyEvent = (KeyEvent) obj;
                m4.b0 b0Var2 = xVar.f13554b;
                if (b0Var2.i(rVar)) {
                    b0Var2.b(keyEvent, false, false);
                } else {
                    m4.l0 l0Var = b0Var2.h;
                    n4.a0 a0Var = rVar.f13498a;
                    a0Var.getClass();
                    l0Var.getClass();
                    l0Var.H(1, new m4.c0(l0Var, 7), a0Var, true);
                }
                xVar.f13553a = null;
                return;
            case 15:
                m4.b0 b0Var3 = (m4.b0) obj2;
                j2.h hVar = (j2.h) r82;
                m4.s sVar = (m4.s) obj;
                if (!b0Var3.j()) {
                    m4.l1 l1Var = b0Var3.f13307t;
                    hVar.getClass();
                    w7.u.b(l1Var, sVar);
                    return;
                }
                return;
            case 16:
                n2.j jVar = (n2.j) obj2;
                r82.b(jVar.f13734a, jVar.f13735b, (Exception) obj);
                return;
            case 17:
                ((VideoAds) obj2).lambda$show$3((pc) r82, (TLRPC.TL_sponsoredMessage) obj);
                return;
            case 18:
                ((VideoAds) obj2).lambda$show$5((pc) r82, (boolean[]) obj);
                return;
            case 19:
                ((VideoPlayerHolderBase) obj2).lambda$release$3((TLRPC.Document) r82, (Runnable) obj);
                return;
            case 20:
                ((Utilities.Callback2) obj2).run((TLObject) r82, (TLRPC.TL_error) obj);
                return;
            case 21:
                ((Utilities.Callback2) obj2).run((TLRPC.Updates) r82, (TLRPC.TL_error) obj);
                return;
            case 22:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj2;
                p2 p2Var = (p2) r82;
                p2 p2Var2 = (p2) obj;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarLayout.J;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (viewGroup = (ViewGroup) actionBarPopupWindow$ActionBarPopupWindowLayout.getParent()) != null) {
                    viewGroup.removeView(actionBarLayout.J);
                }
                if (!actionBarLayout.h && !actionBarLayout.f17470a0) {
                    actionBarLayout.v.setTranslationX(0.0f);
                } else {
                    actionBarLayout.v.setScaleX(1.0f);
                    actionBarLayout.v.setScaleY(1.0f);
                    actionBarLayout.h = false;
                    actionBarLayout.J = null;
                    actionBarLayout.f17470a0 = false;
                }
                actionBarLayout.m(p2Var);
                p2Var.setRemovingFromStack(false);
                p2Var.onTransitionAnimationEnd(false, true);
                p2Var2.onTransitionAnimationEnd(true, true);
                p2Var2.onBecomeFullyVisible();
                return;
            case 23:
                ((p2) r82).presentFragment((eo) obj);
                ((q3) obj2).f18576c = false;
                return;
            case 24:
                q3 q3Var = (q3) obj2;
                ArrayList arrayList5 = (ArrayList) r82;
                p3 p3Var = (p3) obj;
                q3Var.getClass();
                while (i11 < arrayList5.size()) {
                    if (((n3) arrayList5.get(i11)).f18488a == p3Var) {
                        arrayList5.remove(i11);
                        i11--;
                    }
                    i11++;
                }
                q3Var.invalidate();
                return;
            case 25:
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj2;
                TLObject tLObject3 = (TLObject) r82;
                org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) obj;
                if (tLObject3 instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject3;
                    i6Var.f17844g0 = FileLoader.getAttachFileName(tL_wallPaper.document);
                    NotificationCenter.getInstance(i6Var.E).addObserver(i6Var, NotificationCenter.fileLoaded);
                    NotificationCenter.getInstance(i6Var.E).addObserver(i6Var, NotificationCenter.fileLoadFailed);
                    FileLoader.getInstance(i6Var2.E).loadFile(tL_wallPaper.document, tL_wallPaper, 1, 1);
                    return;
                }
                i6Var.s();
                return;
            case 26:
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) obj2;
                w0Var.X0.H1(w0Var, (TLRPC.TL_premiumGiftOption) obj, (String) r82);
                return;
            case 27:
                org.telegram.ui.ActionBar.i6 i6Var3 = (org.telegram.ui.ActionBar.i6) r82;
                i6Var3.f17842f = !i6Var3.d((File) obj, i6Var3.f17838c);
                AndroidUtilities.runOnUIThread(new pa(8, (ra) obj2, i6Var3));
                return;
            case 28:
                org.telegram.ui.Components.g0 g0Var2 = (org.telegram.ui.Components.g0) obj2;
                d5.M((Context) r82, g0Var2.f23122l0, new l2.h(g0Var2, 8), (org.telegram.ui.ActionBar.f6) obj);
                return;
            default:
                j8.o((j8) obj2, (org.telegram.ui.ActionBar.d2) r82, (TLObject) obj);
                return;
        }
    }

    public a0(Object obj, Object obj2, Object obj3, int i10) {
        this.f8799a = i10;
        this.f8800b = obj;
        this.f8801c = obj2;
        this.d = obj3;
    }
}
