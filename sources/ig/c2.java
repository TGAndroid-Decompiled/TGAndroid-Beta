package ig;

import ai.ta;
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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k3;
import org.telegram.ui.ActionBar.m3;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ActionBar.n3;
import org.telegram.ui.Cells.ka;
import org.telegram.ui.Cells.ma;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.ff;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.k8;
import org.telegram.ui.Components.lg;
import org.telegram.ui.Components.ng;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.qp0;
import org.telegram.ui.Components.zv0;
import org.telegram.ui.Wallet.l5;
import org.telegram.ui.sn;
public final class c2 implements Runnable {
    public final int f12861a;
    public final Object f12862b;
    public final Object f12863c;
    public final Object d;

    public c2(Object obj, Object obj2, Object obj3, int i10) {
        this.f12861a = i10;
        this.f12862b = obj;
        this.f12863c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        int i10 = 0;
        switch (this.f12861a) {
            case 0:
                d2 d2Var = (d2) this.f12862b;
                TLObject tLObject = (TLObject) this.f12863c;
                SharedPreferences sharedPreferences = (SharedPreferences) this.d;
                ArrayList arrayList = d2Var.d;
                if (tLObject instanceof TLRPC.TL_help_timezonesList) {
                    arrayList.clear();
                    arrayList.addAll(((TLRPC.TL_help_timezonesList) tLObject).timezones);
                    SerializedData serializedData = new SerializedData(tLObject.getObjectSize());
                    tLObject.serializeToStream(serializedData);
                    sharedPreferences.edit().putString("timezones", Utilities.bytesToHex(serializedData.toByteArray())).apply();
                    NotificationCenter.getInstance(d2Var.f12874a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.timezonesUpdated, new Object[0]);
                }
                d2Var.f12876c = true;
                d2Var.f12875b = false;
                return;
            case 1:
                String str = e2.m0.f8254a;
                j2.f fVar = ((i2.a0) ((k2.u) ((qf.b) this.f12862b).f44466c)).f12309a.f12408s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1009, new j2.e(p5, (b2.w) this.f12863c, (i2.e) this.d, 4));
                return;
            case 2:
                AudioTrack audioTrack = (AudioTrack) this.f12862b;
                Handler handler = (Handler) this.f12863c;
                e2.r rVar = (e2.r) this.d;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new bc(rVar, 27));
                    }
                    synchronized (k2.i0.f14687t) {
                        try {
                            int i11 = k2.i0.v - 1;
                            k2.i0.v = i11;
                            if (i11 == 0) {
                                ScheduledExecutorService scheduledExecutorService = k2.i0.f14688u;
                                scheduledExecutorService.getClass();
                                scheduledExecutorService.shutdown();
                                k2.i0.f14688u = null;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new bc(rVar, 27));
                    }
                    synchronized (k2.i0.f14687t) {
                        try {
                            int i12 = k2.i0.v - 1;
                            k2.i0.v = i12;
                            if (i12 == 0) {
                                ScheduledExecutorService scheduledExecutorService2 = k2.i0.f14688u;
                                scheduledExecutorService2.getClass();
                                scheduledExecutorService2.shutdown();
                                k2.i0.f14688u = null;
                            }
                            throw th2;
                        } finally {
                        }
                    }
                }
            case 3:
                w3 w3Var = (w3) this.f12862b;
                i80 i80Var = (i80) this.f12863c;
                o5 o5Var = (o5) this.d;
                if (w3Var.f15591h4 == i80Var) {
                    w3Var.f15591h4 = null;
                    if (w3Var.A3 && w3Var.f15589g4 == o5Var && !o5Var.H.isEmpty()) {
                        w3Var.N2();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                w3 w3Var2 = (w3) this.f12862b;
                ki.a aVar = (ki.a) this.f12863c;
                ki.a aVar2 = (ki.a) this.d;
                ArrayList arrayList2 = w3Var2.f15602n4;
                j3 j3Var = w3Var2.f15598l3;
                if (j3Var != null && aVar != null && aVar2 != null) {
                    int indexOf = arrayList2.indexOf(aVar);
                    int indexOf2 = arrayList2.indexOf(aVar2);
                    if (indexOf >= 0 && indexOf2 >= 0) {
                        while (i10 < arrayList2.size()) {
                            ki.a aVar3 = (ki.a) arrayList2.get(i10);
                            long j10 = aVar3.f15104t;
                            if (j10 != 0) {
                                j3Var.X(i10, e6.l((TL_iv.RichText) w3Var2.f15596k3.get(Long.valueOf(j10))));
                            } else {
                                j3Var.X(i10, c6.z(aVar3.f15089b));
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
                ((w3) this.f12862b).a5((String) this.d, (ki.a) this.f12863c);
                return;
            case 6:
                ki.a aVar4 = (ki.a) this.f12863c;
                b6 b6Var = (b6) this.d;
                z5 z5Var = ((w5) this.f12862b).f15621a.f15182y;
                if (z5Var != null) {
                    ((e3) z5Var).d(aVar4, b6Var.f15152a, b6Var.f15153b, b6Var.f15154c, b6Var.d, b6Var.e);
                    return;
                }
                return;
            case 7:
                li.m mVar = (li.m) this.f12862b;
                ArrayList arrayList3 = (ArrayList) this.f12863c;
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
                li.m mVar2 = (li.m) this.f12862b;
                View view = (View) this.f12863c;
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
                m4.b0 b0Var = (m4.b0) this.f12862b;
                m4.v vVar = (m4.v) this.f12863c;
                KeyEvent keyEvent = (KeyEvent) this.d;
                m4.f0 f0Var = b0Var.f16479b;
                if (f0Var.i(vVar)) {
                    f0Var.b(keyEvent, false, false);
                } else {
                    m4.p0 p0Var = f0Var.h;
                    n4.t tVar = vVar.f16752a;
                    tVar.getClass();
                    p0Var.getClass();
                    p0Var.H(1, new m4.i0(p0Var, 9), tVar, true);
                }
                b0Var.f16478a = null;
                return;
            case 10:
                m4.f0 f0Var2 = (m4.f0) this.f12862b;
                m4.v0 v0Var = (m4.v0) this.f12863c;
                m4.w wVar = (m4.w) this.d;
                if (!f0Var2.j()) {
                    m4.m1 m1Var = f0Var2.f16528t;
                    v0Var.getClass();
                    w7.v.b(m1Var, wVar);
                    return;
                }
                return;
            case 11:
                SpannableString spannableString = (SpannableString) this.f12862b;
                mi.k.a(spannableString, spannableString.length(), (com.google.android.gms.internal.play_billing.s0) ((mi.q) this.f12863c).f16967b);
                ((ta) this.d).run(spannableString);
                return;
            case 12:
                n2.k kVar = (n2.k) this.f12862b;
                this.f12863c.b(kVar.f17053a, kVar.f17054b, (Exception) this.d);
                return;
            case 13:
                n2.k kVar2 = (n2.k) this.f12862b;
                this.f12863c.c(kVar2.f17053a, kVar2.f17054b, (oa.d) this.d);
                return;
            case 14:
                ((VideoAds) this.f12862b).lambda$show$3((qc) this.f12863c, (TLRPC.TL_sponsoredMessage) this.d);
                return;
            case 15:
                ((VideoAds) this.f12862b).lambda$show$5((qc) this.f12863c, (boolean[]) this.d);
                return;
            case 16:
                ((VideoPlayerHolderBase) this.f12862b).lambda$release$3((TLRPC.Document) this.f12863c, (Runnable) this.d);
                return;
            case 17:
                ((Utilities.Callback2) this.f12862b).run((TLObject) this.f12863c, (TLRPC.TL_error) this.d);
                return;
            case 18:
                ((Utilities.Callback2) this.f12862b).run((TLRPC.Updates) this.f12863c, (TLRPC.TL_error) this.d);
                return;
            case 19:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f12862b;
                n2 n2Var = (n2) this.f12863c;
                n2 n2Var2 = (n2) this.d;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarLayout.J;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (viewGroup = (ViewGroup) actionBarPopupWindow$ActionBarPopupWindowLayout.getParent()) != null) {
                    viewGroup.removeView(actionBarLayout.J);
                }
                if (!actionBarLayout.h && !actionBarLayout.f20543a0) {
                    actionBarLayout.v.setTranslationX(0.0f);
                } else {
                    actionBarLayout.v.setScaleX(1.0f);
                    actionBarLayout.v.setScaleY(1.0f);
                    actionBarLayout.h = false;
                    actionBarLayout.J = null;
                    actionBarLayout.f20543a0 = false;
                }
                actionBarLayout.m(n2Var);
                n2Var.setRemovingFromStack(false);
                n2Var.onTransitionAnimationEnd(false, true);
                n2Var2.onTransitionAnimationEnd(true, true);
                n2Var2.onBecomeFullyVisible();
                return;
            case 20:
                ((n2) this.f12863c).presentFragment((sn) this.d);
                ((n3) this.f12862b).f21611c = false;
                return;
            case 21:
                n3 n3Var = (n3) this.f12862b;
                ArrayList arrayList5 = (ArrayList) this.f12863c;
                m3 m3Var = (m3) this.d;
                n3Var.getClass();
                while (i10 < arrayList5.size()) {
                    if (((k3) arrayList5.get(i10)).f21520a == m3Var) {
                        arrayList5.remove(i10);
                        i10--;
                    }
                    i10++;
                }
                n3Var.invalidate();
                return;
            case 22:
                g6 g6Var = (g6) this.f12862b;
                TLObject tLObject2 = (TLObject) this.f12863c;
                g6 g6Var2 = (g6) this.d;
                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                    g6Var.f20887g0 = FileLoader.getAttachFileName(tL_wallPaper.document);
                    NotificationCenter.getInstance(g6Var.E).addObserver(g6Var, NotificationCenter.fileLoaded);
                    NotificationCenter.getInstance(g6Var.E).addObserver(g6Var, NotificationCenter.fileLoadFailed);
                    FileLoader.getInstance(g6Var2.E).loadFile(tL_wallPaper.document, tL_wallPaper, 1, 1);
                    return;
                }
                g6Var.s();
                return;
            case 23:
                org.telegram.ui.Cells.x0 x0Var = (org.telegram.ui.Cells.x0) this.f12862b;
                l5.z0(x0Var.getContext(), x0Var.H, (TL_wallet.walletTransaction) this.f12863c, null, null, null, (org.telegram.ui.Cells.p0) this.d, x0Var.f23732g1);
                return;
            case 24:
                org.telegram.ui.Cells.x0 x0Var2 = (org.telegram.ui.Cells.x0) this.f12862b;
                x0Var2.f23729f1.C1(x0Var2, (TLRPC.TL_premiumGiftOption) this.f12863c, (String) this.d);
                return;
            case 25:
                g6 g6Var3 = (g6) this.f12863c;
                g6Var3.f20885f = true ^ g6Var3.d((File) this.d, g6Var3.f20881c);
                AndroidUtilities.runOnUIThread(new ka(8, (ma) this.f12862b, g6Var3));
                return;
            case 26:
                org.telegram.ui.Components.e0 e0Var = (org.telegram.ui.Components.e0) this.f12862b;
                f5.L((Context) this.f12863c, e0Var.f25744l0, new k0.b(e0Var, 12), (d6) this.d);
                return;
            case 27:
                k8.p((k8) this.f12862b, (org.telegram.ui.ActionBar.b2) this.d, (TLObject) this.f12863c);
                return;
            case 28:
                ff ffVar = (ff) this.f12862b;
                ffVar.getClass();
                ((zv0) this.f12863c).getViewTreeObserver().removeOnDrawListener(ffVar);
                ((qp0) this.d).f29720a.setHideAvatar(true);
                return;
            default:
                ng ngVar = (ng) this.f12862b;
                Uri uri = (Uri) this.f12863c;
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

    public c2(k8 k8Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject) {
        this.f12861a = 27;
        this.f12862b = k8Var;
        this.d = b2Var;
        this.f12863c = tLObject;
    }
}
