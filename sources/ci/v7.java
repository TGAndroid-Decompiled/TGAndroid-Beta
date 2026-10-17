package ci;

import android.content.Context;
import android.content.IntentFilter;
import android.database.SQLException;
import android.graphics.Bitmap;
import android.location.Address;
import android.location.Geocoder;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.u90;
import org.telegram.ui.Components.y90;
import org.telegram.ui.Components.yc;
public final class v7 implements Runnable {
    public final int f6083a;
    public final Object f6084b;
    public final Object f6085c;

    public v7(int i10, Object obj, Object obj2) {
        this.f6083a = i10;
        this.f6084b = obj;
        this.f6085c = obj2;
    }

    @Override
    public final void run() {
        r3 r3Var;
        p4 p4Var;
        PowerManager.WakeLock wakeLock;
        int i10 = 2;
        int i11 = 0;
        switch (this.f6083a) {
            case 0:
                ((w7) this.f6084b).j((ArrayList) this.f6085c);
                return;
            case 1:
                ((i6) this.f6084b).f5492b.f5496f = (LongSparseIntArray) this.f6085c;
                return;
            case 2:
                Runnable runnable = (Runnable) this.f6085c;
                if (!((z7) this.f6084b).f6257b) {
                    runnable.run();
                    return;
                }
                return;
            case 3:
                z7 z7Var = (z7) this.f6085c;
                ((Runnable[]) this.f6084b)[0] = null;
                ((v7) z7Var.d).run();
                x7 x7Var = (x7) z7Var.e;
                if (x7Var != null) {
                    x7Var.onDetachedFromWindow();
                    return;
                }
                return;
            case 4:
                y7 y7Var = (y7) this.f6084b;
                View view = (View) this.f6085c;
                y7Var.getClass();
                try {
                    view.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                yc ycVar = y7Var.H;
                if (ycVar != null) {
                    ycVar.c(false);
                }
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).requestDisallowInterceptTouchEvent(false);
                }
                y7Var.N = false;
                y7Var.e();
                return;
            case 5:
                q8 q8Var = (q8) this.f6084b;
                y90 y90Var = (y90) this.f6085c;
                y90 y90Var2 = q8Var.f5850a;
                if (y90Var == y90Var2 && y90Var2 != null) {
                    CharacterStyle characterStyle = y90Var2.f32586i;
                    if (characterStyle instanceof URLSpan) {
                        r8 r8Var = q8Var.v;
                        u90 u90Var = q8Var.f5852c;
                        Objects.requireNonNull(u90Var);
                        r8Var.J.H((URLSpan) characterStyle, r8Var, new androidx.fragment.app.d(u90Var, 22));
                        q8Var.f5850a = null;
                        return;
                    }
                    return;
                }
                return;
            case 6:
                e9 e9Var = (e9) this.f6084b;
                ei.x3 x3Var = (ei.x3) this.f6085c;
                e9Var.d.removeView(x3Var);
                if (x3Var == e9Var.f5364c) {
                    e9Var.f5363b = null;
                    e9Var.invalidate();
                    e9Var.b(false);
                    return;
                }
                return;
            case 7:
                z9 z9Var = (z9) this.f6085c;
                aa aaVar = ((r9) this.f6084b).d;
                q4 currentPeerView = aaVar.f5205n0.getCurrentPeerView();
                if (currentPeerView != null && (r3Var = currentPeerView.f5771c1) != null && (p4Var = aaVar.G0) != null && ((z9) p4Var.f5729c) == z9Var) {
                    r3Var.invalidate();
                    return;
                }
                return;
            case 8:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f6084b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f6085c;
                a6.i iVar = FirebaseMessaging.f7592l;
                firebaseMessaging.getClass();
                try {
                    taskCompletionSource.setResult(firebaseMessaging.a());
                    return;
                } catch (Exception e) {
                    taskCompletionSource.setException(e);
                    return;
                }
            case 9:
                com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) this.f6084b;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.f6085c;
                try {
                    taskCompletionSource2.setResult(mVar.a());
                    return;
                } catch (Exception e7) {
                    taskCompletionSource2.setException(e7);
                    return;
                }
            case 10:
                v0.f fVar = (v0.f) this.f6085c;
                v0.i iVar2 = ((d1.e) this.f6084b).f7730f;
                if (iVar2 != null) {
                    iVar2.onResult(fVar);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            case 11:
                da.c cVar = (da.c) this.f6084b;
                CountDownLatch countDownLatch = (CountDownLatch) this.f6085c;
                try {
                    l5.t.a().d.e(cVar.h.f15933a.b(i5.d.f12714c), 1);
                } catch (SQLException unused2) {
                }
                countDownLatch.countDown();
                return;
            case 12:
                di.v vVar = (di.v) this.f6084b;
                String str = (String) this.f6085c;
                ArrayList arrayList = vVar.f8073f;
                while (true) {
                    if (i11 < arrayList.size()) {
                        if (!TextUtils.equals(((t6) arrayList.get(i11)).E, str)) {
                            i11++;
                        }
                    } else {
                        i11 = -1;
                    }
                }
                if (i11 >= 0) {
                    vVar.f8075r.d(str.hashCode(), i11 + 1);
                    return;
                }
                return;
            case 13:
                ((v0.i) this.f6084b).onError((w0.d) this.f6085c);
                return;
            case 14:
                ((v0.i) this.f6084b).onResult((v0.f) this.f6085c);
                return;
            case 15:
                v0.c cVar2 = (v0.c) this.f6085c;
                v0.i iVar3 = ((e1.e) this.f6084b).f8185f;
                if (iVar3 != null) {
                    iVar3.onResult(cVar2);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            case 16:
                e2.c cVar3 = (e2.c) this.f6084b;
                Object apply = ((i2.u) this.f6085c).apply(cVar3.f8207f);
                cVar3.f8207f = apply;
                e2.b bVar = new e2.b(cVar3, apply, 1);
                e2.i0 i0Var = (e2.i0) cVar3.f8206c;
                if (i0Var.f8239a.getLooper().getThread().isAlive()) {
                    i0Var.d(bVar);
                    return;
                }
                return;
            case 17:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                ((Context) this.f6085c).registerReceiver(new androidx.mediarouter.app.f((e2.w) this.f6084b, 2), intentFilter);
                return;
            case 18:
                Context context = (Context) this.f6085c;
                e2.w wVar = (e2.w) ((androidx.mediarouter.app.f) this.f6084b).f3489b;
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null) {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            int type = activeNetworkInfo.getType();
                            if (type != 0) {
                                if (type != 1) {
                                    if (type != 4 && type != 5) {
                                        if (type != 6) {
                                            i10 = type != 9 ? 8 : 7;
                                        }
                                        i10 = 5;
                                    }
                                }
                            }
                            switch (activeNetworkInfo.getSubtype()) {
                                case 1:
                                case 2:
                                    i10 = 3;
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 14:
                                case 15:
                                case 17:
                                    i10 = 4;
                                    break;
                                case 13:
                                    i10 = 5;
                                    break;
                                case 16:
                                case 19:
                                default:
                                    i10 = 6;
                                    break;
                                case 18:
                                    break;
                                case 20:
                                    if (Build.VERSION.SDK_INT >= 29) {
                                        i10 = 9;
                                        break;
                                    }
                                    break;
                            }
                        } else {
                            i10 = 1;
                        }
                    } catch (SecurityException unused3) {
                    }
                    if (Build.VERSION.SDK_INT < 31 && i10 == 5) {
                        e2.u.a(context, wVar);
                        return;
                    } else {
                        wVar.c(i10);
                        return;
                    }
                }
                i10 = 0;
                if (Build.VERSION.SDK_INT < 31) {
                }
                wVar.c(i10);
                return;
            case 19:
                j9.y yVar = (j9.y) this.f6085c;
                if (((j9.e0) this.f6084b).f14346a instanceof j9.a) {
                    yVar.cancel(false);
                    return;
                }
                return;
            case 20:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f6085c;
                qf.b bVar2 = (qf.b) ((ac.a) this.f6084b).f482c;
                bVar2.getClass();
                if (atomicBoolean.get()) {
                    new Thread(new v7(21, bVar2, atomicBoolean), "ExoPlayer:WakeLockManager").start();
                    return;
                }
                return;
            case 21:
                qf.b bVar3 = (qf.b) this.f6084b;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.f6085c;
                synchronized (bVar3) {
                    if (atomicBoolean2.get() && (wakeLock = (PowerManager.WakeLock) bVar3.f44466c) != null) {
                        wakeLock.release();
                    }
                }
                return;
            case 22:
                ei.d dVar = (ei.d) this.f6084b;
                org.telegram.ui.Cells.g gVar = (org.telegram.ui.Cells.g) this.f6085c;
                int i12 = dVar.F - 1;
                dVar.F = i12;
                dVar.b(i12, true);
                if (dVar.F > 0) {
                    AndroidUtilities.runOnUIThread(dVar.G, 1000L);
                    return;
                }
                dVar.setClickable(true);
                gVar.run();
                return;
            case 23:
                ((Utilities.Callback) this.f6084b).run((ArrayList) this.f6085c);
                return;
            case 24:
                ei.t1 t1Var = (ei.t1) this.f6084b;
                TLObject tLObject = (TLObject) this.f6085c;
                ei.v1 v1Var = t1Var.f9844s;
                if (tLObject instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                    ei.n2 n2Var = v1Var.f9932r;
                    MessagesController.getInstance(ei.n2.F(n2Var)).putUsers(tL_contacts_resolvedPeer.users, false);
                    MessagesController.getInstance(ei.n2.G(n2Var)).putChats(tL_contacts_resolvedPeer.chats, false);
                    MessagesStorage.getInstance(ei.n2.I(n2Var)).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                }
                t1Var.f9842n = true;
                t1Var.G();
                return;
            case 25:
                ((ei.s2) this.f6084b).e(0.0f, 240L, (Runnable) this.f6085c);
                return;
            case 26:
                ei.f6 f6Var = (ei.f6) this.f6084b;
                View view2 = (View) this.f6085c;
                f6Var.getClass();
                if (view2 instanceof rg.j) {
                    rg.j jVar = (rg.j) view2;
                    jVar.m();
                    f6Var.C0(jVar, true);
                    return;
                }
                return;
            case 27:
                TLRPC.MessageMedia messageMedia = (TLRPC.MessageMedia) this.f6084b;
                TL_stories.TL_mediaAreaGeoPoint tL_mediaAreaGeoPoint = (TL_stories.TL_mediaAreaGeoPoint) this.f6085c;
                try {
                    List<Address> fromLocationName = new Geocoder(ApplicationLoader.applicationContext, LocaleController.getInstance().getCurrentLocale()).getFromLocationName(messageMedia.title, 1);
                    if (fromLocationName.size() > 0) {
                        tL_mediaAreaGeoPoint.geo.lat = fromLocationName.get(0).getLatitude();
                        tL_mediaAreaGeoPoint.geo._long = fromLocationName.get(0).getLongitude();
                        return;
                    }
                    return;
                } catch (Exception unused4) {
                    return;
                }
            case 28:
                ((Utilities.Callback) this.f6084b).run((Bitmap) this.f6085c);
                return;
            default:
                ei.r6.a((ei.r6) this.f6084b, (ei.a8) this.f6085c);
                return;
        }
    }
}
