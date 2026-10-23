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
import org.telegram.ui.Components.v90;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.z90;
public final class u7 implements Runnable {
    public final int f5988a;
    public final Object f5989b;
    public final Object f5990c;

    public u7(int i10, Object obj, Object obj2) {
        this.f5988a = i10;
        this.f5989b = obj;
        this.f5990c = obj2;
    }

    @Override
    public final void run() {
        q3 q3Var;
        o4 o4Var;
        PowerManager.WakeLock wakeLock;
        int i10 = 2;
        int i11 = 0;
        switch (this.f5988a) {
            case 0:
                ((v7) this.f5989b).j((ArrayList) this.f5990c);
                return;
            case 1:
                ((h6) this.f5989b).f5398b.f5402f = (LongSparseIntArray) this.f5990c;
                return;
            case 2:
                Runnable runnable = (Runnable) this.f5990c;
                if (!((y7) this.f5989b).f6163b) {
                    runnable.run();
                    return;
                }
                return;
            case 3:
                y7 y7Var = (y7) this.f5990c;
                ((Runnable[]) this.f5989b)[0] = null;
                ((u7) y7Var.d).run();
                w7 w7Var = (w7) y7Var.e;
                if (w7Var != null) {
                    w7Var.onDetachedFromWindow();
                    return;
                }
                return;
            case 4:
                x7 x7Var = (x7) this.f5989b;
                View view = (View) this.f5990c;
                x7Var.getClass();
                try {
                    view.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                yc ycVar = x7Var.H;
                if (ycVar != null) {
                    ycVar.c(false);
                }
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).requestDisallowInterceptTouchEvent(false);
                }
                x7Var.N = false;
                x7Var.e();
                return;
            case 5:
                p8 p8Var = (p8) this.f5989b;
                z90 z90Var = (z90) this.f5990c;
                z90 z90Var2 = p8Var.f5735a;
                if (z90Var == z90Var2 && z90Var2 != null) {
                    CharacterStyle characterStyle = z90Var2.f33177i;
                    if (characterStyle instanceof URLSpan) {
                        q8 q8Var = p8Var.v;
                        v90 v90Var = p8Var.f5737c;
                        Objects.requireNonNull(v90Var);
                        q8Var.J.H((URLSpan) characterStyle, q8Var, new androidx.fragment.app.d(v90Var, 22));
                        p8Var.f5735a = null;
                        return;
                    }
                    return;
                }
                return;
            case 6:
                d9 d9Var = (d9) this.f5989b;
                ei.x3 x3Var = (ei.x3) this.f5990c;
                d9Var.d.removeView(x3Var);
                if (x3Var == d9Var.f5263c) {
                    d9Var.f5262b = null;
                    d9Var.invalidate();
                    d9Var.b(false);
                    return;
                }
                return;
            case 7:
                y9 y9Var = (y9) this.f5990c;
                z9 z9Var = ((q9) this.f5989b).d;
                p4 currentPeerView = z9Var.f6249n0.getCurrentPeerView();
                if (currentPeerView != null && (q3Var = currentPeerView.f5656c1) != null && (o4Var = z9Var.G0) != null && ((y9) o4Var.f5633c) == y9Var) {
                    q3Var.invalidate();
                    return;
                }
                return;
            case 8:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f5989b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f5990c;
                a6.i iVar = FirebaseMessaging.f7602l;
                firebaseMessaging.getClass();
                try {
                    taskCompletionSource.setResult(firebaseMessaging.a());
                    return;
                } catch (Exception e) {
                    taskCompletionSource.setException(e);
                    return;
                }
            case 9:
                com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) this.f5989b;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.f5990c;
                try {
                    taskCompletionSource2.setResult(mVar.a());
                    return;
                } catch (Exception e7) {
                    taskCompletionSource2.setException(e7);
                    return;
                }
            case 10:
                v0.f fVar = (v0.f) this.f5990c;
                v0.i iVar2 = ((d1.e) this.f5989b).f7740f;
                if (iVar2 != null) {
                    iVar2.onResult(fVar);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            case 11:
                da.c cVar = (da.c) this.f5989b;
                CountDownLatch countDownLatch = (CountDownLatch) this.f5990c;
                try {
                    l5.t.a().d.e(cVar.h.f16002a.b(i5.d.f12742c), 1);
                } catch (SQLException unused2) {
                }
                countDownLatch.countDown();
                return;
            case 12:
                di.v vVar = (di.v) this.f5989b;
                String str = (String) this.f5990c;
                ArrayList arrayList = vVar.f8078f;
                while (true) {
                    if (i11 < arrayList.size()) {
                        if (!TextUtils.equals(((s6) arrayList.get(i11)).E, str)) {
                            i11++;
                        }
                    } else {
                        i11 = -1;
                    }
                }
                if (i11 >= 0) {
                    vVar.f8080r.d(str.hashCode(), i11 + 1);
                    return;
                }
                return;
            case 13:
                ((v0.i) this.f5989b).onError((w0.d) this.f5990c);
                return;
            case 14:
                ((v0.i) this.f5989b).onResult((v0.f) this.f5990c);
                return;
            case 15:
                v0.c cVar2 = (v0.c) this.f5990c;
                v0.i iVar3 = ((e1.e) this.f5989b).f8190f;
                if (iVar3 != null) {
                    iVar3.onResult(cVar2);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            case 16:
                e2.c cVar3 = (e2.c) this.f5989b;
                Object apply = ((i2.v) this.f5990c).apply(cVar3.f8212f);
                cVar3.f8212f = apply;
                e2.b bVar = new e2.b(cVar3, apply, 1);
                e2.i0 i0Var = (e2.i0) cVar3.f8211c;
                if (i0Var.f8244a.getLooper().getThread().isAlive()) {
                    i0Var.d(bVar);
                    return;
                }
                return;
            case 17:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                ((Context) this.f5990c).registerReceiver(new androidx.mediarouter.app.f((e2.w) this.f5989b, 2), intentFilter);
                return;
            case 18:
                Context context = (Context) this.f5990c;
                e2.w wVar = (e2.w) ((androidx.mediarouter.app.f) this.f5989b).f3493b;
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
                j9.y yVar = (j9.y) this.f5990c;
                if (((j9.e0) this.f5989b).f14396a instanceof j9.a) {
                    yVar.cancel(false);
                    return;
                }
                return;
            case 20:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f5990c;
                qf.b bVar2 = (qf.b) ((ac.a) this.f5989b).f481c;
                bVar2.getClass();
                if (atomicBoolean.get()) {
                    new Thread(new u7(21, bVar2, atomicBoolean), "ExoPlayer:WakeLockManager").start();
                    return;
                }
                return;
            case 21:
                qf.b bVar3 = (qf.b) this.f5989b;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.f5990c;
                synchronized (bVar3) {
                    if (atomicBoolean2.get() && (wakeLock = (PowerManager.WakeLock) bVar3.f44865c) != null) {
                        wakeLock.release();
                    }
                }
                return;
            case 22:
                ei.d dVar = (ei.d) this.f5989b;
                org.telegram.ui.Cells.g gVar = (org.telegram.ui.Cells.g) this.f5990c;
                int i12 = dVar.I - 1;
                dVar.I = i12;
                dVar.b(i12, true);
                if (dVar.I > 0) {
                    AndroidUtilities.runOnUIThread(dVar.J, 1000L);
                    return;
                }
                dVar.setClickable(true);
                gVar.run();
                return;
            case 23:
                ((Utilities.Callback) this.f5989b).run((ArrayList) this.f5990c);
                return;
            case 24:
                ei.t1 t1Var = (ei.t1) this.f5989b;
                TLObject tLObject = (TLObject) this.f5990c;
                ei.v1 v1Var = t1Var.f9859s;
                if (tLObject instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                    ei.n2 n2Var = v1Var.f9948r;
                    MessagesController.getInstance(ei.n2.D(n2Var)).putUsers(tL_contacts_resolvedPeer.users, false);
                    MessagesController.getInstance(ei.n2.E(n2Var)).putChats(tL_contacts_resolvedPeer.chats, false);
                    MessagesStorage.getInstance(ei.n2.G(n2Var)).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                }
                t1Var.f9857n = true;
                t1Var.G();
                return;
            case 25:
                ((ei.s2) this.f5989b).e(0.0f, 240L, (Runnable) this.f5990c);
                return;
            case 26:
                ei.f6 f6Var = (ei.f6) this.f5989b;
                View view2 = (View) this.f5990c;
                f6Var.getClass();
                if (view2 instanceof rg.j) {
                    rg.j jVar = (rg.j) view2;
                    jVar.m();
                    f6Var.B0(jVar, true);
                    return;
                }
                return;
            case 27:
                TLRPC.MessageMedia messageMedia = (TLRPC.MessageMedia) this.f5989b;
                TL_stories.TL_mediaAreaGeoPoint tL_mediaAreaGeoPoint = (TL_stories.TL_mediaAreaGeoPoint) this.f5990c;
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
                ((Utilities.Callback) this.f5989b).run((Bitmap) this.f5990c);
                return;
            default:
                ei.r6.a((ei.r6) this.f5989b, (ei.a8) this.f5990c);
                return;
        }
    }
}
