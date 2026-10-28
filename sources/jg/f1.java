package jg;

import a8.ie;
import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioTrack;
import android.os.Handler;
import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import bi.ua;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;
import li.a6;
import li.c6;
import li.d3;
import li.d6;
import li.f6;
import li.h5;
import li.j3;
import li.p5;
import li.v3;
import li.x5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.p3;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.r3;
import org.telegram.ui.ActionBar.s3;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.x6;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Cells.ra;
import org.telegram.ui.Components.bq0;
import org.telegram.ui.Components.ff;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.m8;
import org.telegram.ui.Components.nw0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Wallet.m5;
import org.telegram.ui.wn;
public final class f1 implements Runnable {
    public final int f15700a;
    public final Object f15701b;
    public final Object f15702c;
    public final Object d;

    public f1(Object obj, Object obj2, Object obj3, int i10) {
        this.f15700a = i10;
        this.f15702c = obj;
        this.d = obj2;
        this.f15701b = obj3;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        int i10 = 0;
        switch (this.f15700a) {
            case 0:
                h1.V((h1) this.f15702c, (TLRPC.TL_error) this.d, (TLObject) this.f15701b);
                return;
            case 1:
                g2 g2Var = (g2) this.f15702c;
                TLObject tLObject = (TLObject) this.f15701b;
                SharedPreferences sharedPreferences = (SharedPreferences) this.d;
                ArrayList arrayList = g2Var.d;
                if (tLObject instanceof TLRPC.TL_help_timezonesList) {
                    arrayList.clear();
                    arrayList.addAll(((TLRPC.TL_help_timezonesList) tLObject).timezones);
                    SerializedData serializedData = new SerializedData(tLObject.getObjectSize());
                    tLObject.serializeToStream(serializedData);
                    sharedPreferences.edit().putString("timezones", Utilities.bytesToHex(serializedData.toByteArray())).apply();
                    NotificationCenter.getInstance(g2Var.f15715a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.timezonesUpdated, new Object[0]);
                }
                g2Var.f15717c = true;
                g2Var.f15716b = false;
                return;
            case 2:
                String str = e2.n0.f9691a;
                j2.e eVar = ((i2.d0) ((k2.v) ((rf.b) this.f15702c).f47371c)).f13508a.f13613s;
                j2.a p10 = eVar.p();
                eVar.q(p10, 1009, new j2.d(p10, (b2.x) this.d, (i2.f) this.f15701b, 6));
                return;
            case 3:
                AudioTrack audioTrack = (AudioTrack) this.f15702c;
                Handler handler = (Handler) this.d;
                e2.r rVar = (e2.r) this.f15701b;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new k2.c(rVar, 1));
                    }
                    synchronized (k2.j0.f16174t) {
                        try {
                            int i11 = k2.j0.v - 1;
                            k2.j0.v = i11;
                            if (i11 == 0) {
                                ScheduledExecutorService scheduledExecutorService = k2.j0.f16175u;
                                scheduledExecutorService.getClass();
                                scheduledExecutorService.shutdown();
                                k2.j0.f16175u = null;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new k2.c(rVar, 1));
                    }
                    synchronized (k2.j0.f16174t) {
                        try {
                            int i12 = k2.j0.v - 1;
                            k2.j0.v = i12;
                            if (i12 == 0) {
                                ScheduledExecutorService scheduledExecutorService2 = k2.j0.f16175u;
                                scheduledExecutorService2.getClass();
                                scheduledExecutorService2.shutdown();
                                k2.j0.f16175u = null;
                            }
                            throw th2;
                        } finally {
                        }
                    }
                }
            case 4:
                v3 v3Var = (v3) this.f15702c;
                l80 l80Var = (l80) this.d;
                p5 p5Var = (p5) this.f15701b;
                if (v3Var.f17561r4 == l80Var) {
                    v3Var.f17561r4 = null;
                    if (v3Var.K3 && v3Var.f17559q4 == p5Var && !p5Var.H.isEmpty()) {
                        v3Var.S2();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                v3 v3Var2 = (v3) this.f15702c;
                li.a aVar = (li.a) this.d;
                li.a aVar2 = (li.a) this.f15701b;
                ArrayList arrayList2 = v3Var2.f17573x4;
                j3 j3Var = v3Var2.f17568v3;
                if (j3Var != null && aVar != null && aVar2 != null) {
                    int indexOf = arrayList2.indexOf(aVar);
                    int indexOf2 = arrayList2.indexOf(aVar2);
                    if (indexOf >= 0 && indexOf2 >= 0) {
                        while (i10 < arrayList2.size()) {
                            li.a aVar3 = (li.a) arrayList2.get(i10);
                            long j10 = aVar3.f17068t;
                            if (j10 != 0) {
                                j3Var.X(i10, f6.l((TL_iv.RichText) v3Var2.f17566u3.get(Long.valueOf(j10))));
                            } else {
                                j3Var.X(i10, d6.y(aVar3.f17053b));
                            }
                            i10++;
                        }
                        j3Var.i0(Math.min(indexOf, indexOf2), Math.max(indexOf, indexOf2));
                        return;
                    }
                    return;
                }
                return;
            case 6:
                ((v3) this.f15702c).f5((String) this.f15701b, (li.a) this.d);
                return;
            case 7:
                li.a aVar4 = (li.a) this.d;
                c6 c6Var = (c6) this.f15701b;
                a6 a6Var = ((x5) this.f15702c).f17626a.f17202y;
                if (a6Var != null) {
                    ((d3) a6Var).d(aVar4, c6Var.f17175a, c6Var.f17176b, c6Var.f17177c, c6Var.d, c6Var.e);
                    return;
                }
                return;
            case 8:
                m4.b0 b0Var = (m4.b0) this.f15702c;
                m4.w wVar = (m4.w) this.d;
                KeyEvent keyEvent = (KeyEvent) this.f15701b;
                m4.f0 f0Var = b0Var.f18006b;
                if (f0Var.i(wVar)) {
                    f0Var.b(keyEvent, false, false);
                } else {
                    m4.p0 p0Var = f0Var.h;
                    n4.t tVar = wVar.f18285a;
                    tVar.getClass();
                    p0Var.getClass();
                    p0Var.H(1, new m4.i0(p0Var, 9), tVar, true);
                }
                b0Var.f18005a = null;
                return;
            case 9:
                m4.f0 f0Var2 = (m4.f0) this.f15702c;
                m4.x0 x0Var = (m4.x0) this.d;
                m4.x xVar = (m4.x) this.f15701b;
                if (!f0Var2.j()) {
                    m4.n1 n1Var = f0Var2.f18056t;
                    x0Var.getClass();
                    ie.b(n1Var, xVar);
                    return;
                }
                return;
            case 10:
                mi.m mVar = (mi.m) this.f15702c;
                ArrayList arrayList3 = (ArrayList) this.d;
                ArrayList arrayList4 = (ArrayList) this.f15701b;
                mVar.getClass();
                for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                    ((View) arrayList3.get(i13)).setVisibility(0);
                }
                if (mVar.A.removeAll(arrayList4)) {
                    while (i10 < arrayList4.size()) {
                        mVar.d((s4.e1) arrayList4.get(i10));
                        i10++;
                    }
                    mVar.G();
                }
                mVar.K.removeAll(arrayList3);
                return;
            case 11:
                mi.m mVar2 = (mi.m) this.f15702c;
                View view = (View) this.d;
                s4.e1 e1Var = (s4.e1) this.f15701b;
                mVar2.getClass();
                view.setVisibility(0);
                if (mVar2.A.remove(e1Var)) {
                    mVar2.d(e1Var);
                    mVar2.G();
                }
                mVar2.K.remove(view);
                return;
            case 12:
                n2.j jVar = (n2.j) this.f15702c;
                this.d.b(jVar.f18624a, jVar.f18625b, (Exception) this.f15701b);
                return;
            case 13:
                n2.j jVar2 = (n2.j) this.f15702c;
                this.d.k(jVar2.f18624a, jVar2.f18625b, (pa.d) this.f15701b);
                return;
            case 14:
                SpannableString spannableString = (SpannableString) this.f15702c;
                ni.k.a(spannableString, spannableString.length(), (com.google.android.gms.internal.play_billing.s0) ((m4.c) this.d).f18008b);
                ((ua) this.f15701b).run(spannableString);
                return;
            case 15:
                ((VideoAds) this.f15702c).lambda$show$3((qc) this.d, (TLRPC.TL_sponsoredMessage) this.f15701b);
                return;
            case 16:
                ((VideoAds) this.f15702c).lambda$show$5((qc) this.d, (boolean[]) this.f15701b);
                return;
            case 17:
                ((VideoPlayerHolderBase) this.f15702c).lambda$release$3((TLRPC.Document) this.d, (Runnable) this.f15701b);
                return;
            case 18:
                ((Utilities.Callback2) this.f15702c).run((TLObject) this.f15701b, (TLRPC.TL_error) this.d);
                return;
            case 19:
                ((Utilities.Callback2) this.f15702c).run((TLRPC.Updates) this.f15701b, (TLRPC.TL_error) this.d);
                return;
            case 20:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f15702c;
                r2 r2Var = (r2) this.d;
                r2 r2Var2 = (r2) this.f15701b;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarLayout.J;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (viewGroup = (ViewGroup) actionBarPopupWindow$ActionBarPopupWindowLayout.getParent()) != null) {
                    viewGroup.removeView(actionBarLayout.J);
                }
                if (!actionBarLayout.h && !actionBarLayout.f22305a0) {
                    actionBarLayout.v.setTranslationX(0.0f);
                } else {
                    actionBarLayout.v.setScaleX(1.0f);
                    actionBarLayout.v.setScaleY(1.0f);
                    actionBarLayout.h = false;
                    actionBarLayout.J = null;
                    actionBarLayout.f22305a0 = false;
                }
                actionBarLayout.m(r2Var);
                r2Var.setRemovingFromStack(false);
                r2Var.onTransitionAnimationEnd(false, true);
                r2Var2.onTransitionAnimationEnd(true, true);
                r2Var2.onBecomeFullyVisible();
                return;
            case 21:
                ((r2) this.d).presentFragment((wn) this.f15701b);
                ((s3) this.f15702c).f23075c = false;
                return;
            case 22:
                s3 s3Var = (s3) this.f15702c;
                ArrayList arrayList5 = (ArrayList) this.d;
                r3 r3Var = (r3) this.f15701b;
                s3Var.getClass();
                while (i10 < arrayList5.size()) {
                    if (((p3) arrayList5.get(i10)).f22932a == r3Var) {
                        arrayList5.remove(i10);
                        i10--;
                    }
                    i10++;
                }
                s3Var.invalidate();
                return;
            case 23:
                x6 x6Var = (x6) this.f15702c;
                TLObject tLObject2 = (TLObject) this.f15701b;
                x6 x6Var2 = (x6) this.d;
                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                    x6Var.f23262g0 = FileLoader.getAttachFileName(tL_wallPaper.document);
                    NotificationCenter.getInstance(x6Var.E).addObserver(x6Var, NotificationCenter.fileLoaded);
                    NotificationCenter.getInstance(x6Var.E).addObserver(x6Var, NotificationCenter.fileLoadFailed);
                    FileLoader.getInstance(x6Var2.E).loadFile(tL_wallPaper.document, tL_wallPaper, 1, 1);
                    return;
                }
                x6Var.s();
                return;
            case 24:
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) this.f15702c;
                m5.C0(v0Var.getContext(), v0Var.H, (TL_wallet.walletTransaction) this.d, null, null, null, (org.telegram.ui.Cells.o0) this.f15701b, v0Var.f25521g1);
                return;
            case 25:
                org.telegram.ui.Cells.v0 v0Var2 = (org.telegram.ui.Cells.v0) this.f15702c;
                v0Var2.f25518f1.v0(v0Var2, (TLRPC.TL_premiumGiftOption) this.d, (String) this.f15701b);
                return;
            case 26:
                x6 x6Var3 = (x6) this.d;
                x6Var3.f23260f = !x6Var3.d((File) this.f15701b, x6Var3.f23256c);
                AndroidUtilities.runOnUIThread(new pa(8, (ra) this.f15702c, x6Var3));
                return;
            case 27:
                org.telegram.ui.Components.e0 e0Var = (org.telegram.ui.Components.e0) this.f15702c;
                g5.L((Context) this.d, e0Var.f27621l0, new h5(e0Var), (u6) this.f15701b);
                return;
            case 28:
                m8.q((m8) this.f15702c, (org.telegram.ui.ActionBar.e2) this.d, (TLObject) this.f15701b);
                return;
            default:
                ff ffVar = (ff) this.f15702c;
                ffVar.getClass();
                ((nw0) this.d).getViewTreeObserver().removeOnDrawListener(ffVar);
                ((bq0) this.f15701b).f26892a.setHideAvatar(true);
                return;
        }
    }

    public f1(Object obj, TLObject tLObject, Object obj2, int i10) {
        this.f15700a = i10;
        this.f15702c = obj;
        this.f15701b = tLObject;
        this.d = obj2;
    }
}
