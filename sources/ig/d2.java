package ig;

import ai.va;
import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Handler;
import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import ei.bc;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;
import ki.b6;
import ki.c6;
import ki.e3;
import ki.e6;
import ki.j3;
import ki.o5;
import ki.w3;
import ki.w5;
import ki.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n3;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.p3;
import org.telegram.ui.ActionBar.q3;
import org.telegram.ui.Cells.la;
import org.telegram.ui.Cells.na;
import org.telegram.ui.Components.ew0;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.ff;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.k8;
import org.telegram.ui.Components.lg;
import org.telegram.ui.Components.ng;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.sn;
public final class d2 implements Runnable {
    public final int f12894a;
    public final Object f12895b;
    public final Object f12896c;
    public final Object d;

    public d2(Object obj, Object obj2, Object obj3, int i10) {
        this.f12894a = i10;
        this.f12895b = obj;
        this.f12896c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        int i10 = 0;
        switch (this.f12894a) {
            case 0:
                e2 e2Var = (e2) this.f12895b;
                TLObject tLObject = (TLObject) this.f12896c;
                SharedPreferences sharedPreferences = (SharedPreferences) this.d;
                ArrayList arrayList = e2Var.d;
                if (tLObject instanceof TLRPC.TL_help_timezonesList) {
                    arrayList.clear();
                    arrayList.addAll(((TLRPC.TL_help_timezonesList) tLObject).timezones);
                    SerializedData serializedData = new SerializedData(tLObject.getObjectSize());
                    tLObject.serializeToStream(serializedData);
                    sharedPreferences.edit().putString("timezones", Utilities.bytesToHex(serializedData.toByteArray())).apply();
                    NotificationCenter.getInstance(e2Var.f12918a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.timezonesUpdated, new Object[0]);
                }
                e2Var.f12920c = true;
                e2Var.f12919b = false;
                return;
            case 1:
                String str = e2.m0.f8259a;
                j2.e eVar = ((i2.b0) ((k2.v) ((qf.b) this.f12895b).f44865c)).f12353a.f12442s;
                j2.a p5 = eVar.p();
                eVar.q(p5, 1009, new j2.d(p5, (b2.w) this.f12896c, (i2.f) this.d, 8));
                return;
            case 2:
                AudioTrack audioTrack = (AudioTrack) this.f12895b;
                Handler handler = (Handler) this.f12896c;
                e2.r rVar = (e2.r) this.d;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new bc(rVar, 27));
                    }
                    synchronized (k2.i0.f14738t) {
                        try {
                            int i11 = k2.i0.v - 1;
                            k2.i0.v = i11;
                            if (i11 == 0) {
                                ScheduledExecutorService scheduledExecutorService = k2.i0.f14739u;
                                scheduledExecutorService.getClass();
                                scheduledExecutorService.shutdown();
                                k2.i0.f14739u = null;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new bc(rVar, 27));
                    }
                    synchronized (k2.i0.f14738t) {
                        try {
                            int i12 = k2.i0.v - 1;
                            k2.i0.v = i12;
                            if (i12 == 0) {
                                ScheduledExecutorService scheduledExecutorService2 = k2.i0.f14739u;
                                scheduledExecutorService2.getClass();
                                scheduledExecutorService2.shutdown();
                                k2.i0.f14739u = null;
                            }
                            throw th2;
                        } finally {
                        }
                    }
                }
            case 3:
                w3 w3Var = (w3) this.f12895b;
                j80 j80Var = (j80) this.f12896c;
                o5 o5Var = (o5) this.d;
                if (w3Var.f15661k4 == j80Var) {
                    w3Var.f15661k4 = null;
                    if (w3Var.D3 && w3Var.f15659j4 == o5Var && !o5Var.H.isEmpty()) {
                        w3Var.S2();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                w3 w3Var2 = (w3) this.f12895b;
                ki.a aVar = (ki.a) this.f12896c;
                ki.a aVar2 = (ki.a) this.d;
                ArrayList arrayList2 = w3Var2.f15672q4;
                j3 j3Var = w3Var2.f15667o3;
                if (j3Var != null && aVar != null && aVar2 != null) {
                    int indexOf = arrayList2.indexOf(aVar);
                    int indexOf2 = arrayList2.indexOf(aVar2);
                    if (indexOf >= 0 && indexOf2 >= 0) {
                        while (i10 < arrayList2.size()) {
                            ki.a aVar3 = (ki.a) arrayList2.get(i10);
                            long j10 = aVar3.f15156t;
                            if (j10 != 0) {
                                j3Var.X(i10, e6.l((TL_iv.RichText) w3Var2.f15665n3.get(Long.valueOf(j10))));
                            } else {
                                j3Var.X(i10, c6.y(aVar3.f15141b));
                            }
                            i10++;
                        }
                        j3Var.i0(Math.min(indexOf, indexOf2), Math.max(indexOf, indexOf2));
                        return;
                    }
                    return;
                }
                return;
            case 5:
                ((w3) this.f12895b).f5((String) this.d, (ki.a) this.f12896c);
                return;
            case 6:
                ki.a aVar4 = (ki.a) this.f12896c;
                b6 b6Var = (b6) this.d;
                z5 z5Var = ((w5) this.f12895b).f15688a.f15246y;
                if (z5Var != null) {
                    ((e3) z5Var).d(aVar4, b6Var.f15214a, b6Var.f15215b, b6Var.f15216c, b6Var.d, b6Var.e);
                    return;
                }
                return;
            case 7:
                li.m mVar = (li.m) this.f12895b;
                ArrayList arrayList3 = (ArrayList) this.f12896c;
                ArrayList arrayList4 = (ArrayList) this.d;
                mVar.getClass();
                for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                    ((View) arrayList3.get(i13)).setVisibility(0);
                }
                if (mVar.A.removeAll(arrayList4)) {
                    while (i10 < arrayList4.size()) {
                        mVar.d((s4.b1) arrayList4.get(i10));
                        i10++;
                    }
                    mVar.G();
                }
                mVar.K.removeAll(arrayList3);
                return;
            case 8:
                li.m mVar2 = (li.m) this.f12895b;
                View view = (View) this.f12896c;
                s4.b1 b1Var = (s4.b1) this.d;
                mVar2.getClass();
                view.setVisibility(0);
                if (mVar2.A.remove(b1Var)) {
                    mVar2.d(b1Var);
                    mVar2.G();
                }
                mVar2.K.remove(view);
                return;
            case 9:
                m4.b0 b0Var = (m4.b0) this.f12895b;
                m4.v vVar = (m4.v) this.f12896c;
                KeyEvent keyEvent = (KeyEvent) this.d;
                m4.f0 f0Var = b0Var.f16548b;
                if (f0Var.i(vVar)) {
                    f0Var.b(keyEvent, false, false);
                } else {
                    m4.p0 p0Var = f0Var.h;
                    n4.t tVar = vVar.f16821a;
                    tVar.getClass();
                    p0Var.getClass();
                    p0Var.H(1, new m4.i0(p0Var, 9), tVar, true);
                }
                b0Var.f16547a = null;
                return;
            case 10:
                m4.f0 f0Var2 = (m4.f0) this.f12895b;
                m4.v0 v0Var = (m4.v0) this.f12896c;
                m4.w wVar = (m4.w) this.d;
                if (!f0Var2.j()) {
                    m4.m1 m1Var = f0Var2.f16597t;
                    v0Var.getClass();
                    w7.v.b(m1Var, wVar);
                    return;
                }
                return;
            case 11:
                SpannableString spannableString = (SpannableString) this.f12895b;
                mi.k.a(spannableString, spannableString.length(), (com.google.android.gms.internal.play_billing.s0) ((mi.q) this.f12896c).f17036b);
                ((va) this.d).run(spannableString);
                return;
            case 12:
                n2.k kVar = (n2.k) this.f12895b;
                this.f12896c.b(kVar.f17120a, kVar.f17121b, (Exception) this.d);
                return;
            case 13:
                n2.k kVar2 = (n2.k) this.f12895b;
                this.f12896c.c(kVar2.f17120a, kVar2.f17121b, (oa.d) this.d);
                return;
            case 14:
                ((VideoAds) this.f12895b).lambda$show$3((qc) this.f12896c, (TLRPC.TL_sponsoredMessage) this.d);
                return;
            case 15:
                ((VideoAds) this.f12895b).lambda$show$5((qc) this.f12896c, (boolean[]) this.d);
                return;
            case 16:
                ((VideoPlayerHolderBase) this.f12895b).lambda$release$3((TLRPC.Document) this.f12896c, (Runnable) this.d);
                return;
            case 17:
                ((Utilities.Callback2) this.f12895b).run((TLObject) this.f12896c, (TLRPC.TL_error) this.d);
                return;
            case 18:
                ((Utilities.Callback2) this.f12895b).run((TLRPC.Updates) this.f12896c, (TLRPC.TL_error) this.d);
                return;
            case 19:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f12895b;
                o2 o2Var = (o2) this.f12896c;
                o2 o2Var2 = (o2) this.d;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarLayout.J;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (viewGroup = (ViewGroup) actionBarPopupWindow$ActionBarPopupWindowLayout.getParent()) != null) {
                    viewGroup.removeView(actionBarLayout.J);
                }
                if (!actionBarLayout.h && !actionBarLayout.f20614a0) {
                    actionBarLayout.v.setTranslationX(0.0f);
                } else {
                    actionBarLayout.v.setScaleX(1.0f);
                    actionBarLayout.v.setScaleY(1.0f);
                    actionBarLayout.h = false;
                    actionBarLayout.J = null;
                    actionBarLayout.f20614a0 = false;
                }
                actionBarLayout.m(o2Var);
                o2Var.setRemovingFromStack(false);
                o2Var.onTransitionAnimationEnd(false, true);
                o2Var2.onTransitionAnimationEnd(true, true);
                o2Var2.onBecomeFullyVisible();
                return;
            case 20:
                ((o2) this.f12896c).presentFragment((sn) this.d);
                ((q3) this.f12895b).f21789c = false;
                return;
            case 21:
                q3 q3Var = (q3) this.f12895b;
                ArrayList arrayList5 = (ArrayList) this.f12896c;
                p3 p3Var = (p3) this.d;
                q3Var.getClass();
                while (i10 < arrayList5.size()) {
                    if (((n3) arrayList5.get(i10)).f21650a == p3Var) {
                        arrayList5.remove(i10);
                        i10--;
                    }
                    i10++;
                }
                q3Var.invalidate();
                return;
            case 22:
                j6 j6Var = (j6) this.f12895b;
                TLObject tLObject2 = (TLObject) this.f12896c;
                j6 j6Var2 = (j6) this.d;
                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                    j6Var.f21029g0 = FileLoader.getAttachFileName(tL_wallPaper.document);
                    NotificationCenter.getInstance(j6Var.E).addObserver(j6Var, NotificationCenter.fileLoaded);
                    NotificationCenter.getInstance(j6Var.E).addObserver(j6Var, NotificationCenter.fileLoadFailed);
                    FileLoader.getInstance(j6Var2.E).loadFile(tL_wallPaper.document, tL_wallPaper, 1, 1);
                    return;
                }
                j6Var.s();
                return;
            case 23:
                org.telegram.ui.Cells.v0 v0Var2 = (org.telegram.ui.Cells.v0) this.f12895b;
                org.telegram.ui.Wallet.o5.B0(v0Var2.getContext(), v0Var2.H, (TL_wallet.walletTransaction) this.f12896c, null, null, null, (org.telegram.ui.Cells.o0) this.d, v0Var2.f23774g1);
                return;
            case 24:
                org.telegram.ui.Cells.v0 v0Var3 = (org.telegram.ui.Cells.v0) this.f12895b;
                v0Var3.f23771f1.C1(v0Var3, (TLRPC.TL_premiumGiftOption) this.f12896c, (String) this.d);
                return;
            case 25:
                j6 j6Var3 = (j6) this.f12896c;
                j6Var3.f21027f = true ^ j6Var3.d((File) this.d, j6Var3.f21023c);
                AndroidUtilities.runOnUIThread(new la(8, (na) this.f12895b, j6Var3));
                return;
            case 26:
                org.telegram.ui.Components.e0 e0Var = (org.telegram.ui.Components.e0) this.f12895b;
                f5.M((Context) this.f12896c, e0Var.f25775l0, new k2.w0(e0Var, 10), (g6) this.d);
                return;
            case 27:
                k8.r((k8) this.f12895b, (org.telegram.ui.ActionBar.c2) this.d, (TLObject) this.f12896c);
                return;
            case 28:
                ff ffVar = (ff) this.f12895b;
                ffVar.getClass();
                ((ew0) this.f12896c).getViewTreeObserver().removeOnDrawListener(ffVar);
                ((vp0) this.d).f32038a.setHideAvatar(true);
                return;
            default:
                ng ngVar = (ng) this.f12895b;
                Uri uri = (Uri) this.f12896c;
                File file = (File) this.d;
                try {
                    InputStream openInputStream = ngVar.getContext().getContentResolver().openInputStream(uri);
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = openInputStream.read(bArr);
                        if (read > 0) {
                            fileOutputStream.write(bArr, 0, read);
                            fileOutputStream.flush();
                        } else {
                            openInputStream.close();
                            fileOutputStream.close();
                            MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, -1, 0L, file.getAbsolutePath(), 0, false, 0, 0, 0L);
                            ArrayList arrayList6 = new ArrayList();
                            arrayList6.add(photoEntry);
                            AndroidUtilities.runOnUIThread(new lg(ngVar, arrayList6, file, 0));
                            return;
                        }
                    }
                } catch (Throwable th3) {
                    th3.printStackTrace();
                    return;
                }
        }
    }

    public d2(k8 k8Var, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject) {
        this.f12894a = 27;
        this.f12895b = k8Var;
        this.d = c2Var;
        this.f12896c = tLObject;
    }
}
