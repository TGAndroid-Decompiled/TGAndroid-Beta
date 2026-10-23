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
    public final int f6081a;
    public final Object f6082b;
    public final Object f6083c;

    public v7(int i10, Object obj, Object obj2) {
        this.f6081a = i10;
        this.f6082b = obj;
        this.f6083c = obj2;
    }

    @Override
    public final void run() {
        r3 r3Var;
        p4 p4Var;
        PowerManager.WakeLock wakeLock;
        int i10 = 2;
        int i11 = 0;
        switch (this.f6081a) {
            case 0:
                ((w7) this.f6082b).j((ArrayList) this.f6083c);
                return;
            case 1:
                ((i6) this.f6082b).f5490b.f5494f = (LongSparseIntArray) this.f6083c;
                return;
            case 2:
                Runnable runnable = (Runnable) this.f6083c;
                if (!((z7) this.f6082b).f6255b) {
                    runnable.run();
                    return;
                }
                return;
            case 3:
                z7 z7Var = (z7) this.f6083c;
                ((Runnable[]) this.f6082b)[0] = null;
                ((v7) z7Var.d).run();
                x7 x7Var = (x7) z7Var.e;
                if (x7Var != null) {
                    x7Var.onDetachedFromWindow();
                    return;
                }
                return;
            case 4:
                y7 y7Var = (y7) this.f6082b;
                View view = (View) this.f6083c;
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
                q8 q8Var = (q8) this.f6082b;
                y90 y90Var = (y90) this.f6083c;
                y90 y90Var2 = q8Var.f5848a;
                if (y90Var == y90Var2 && y90Var2 != null) {
                    CharacterStyle characterStyle = y90Var2.f32606i;
                    if (characterStyle instanceof URLSpan) {
                        r8 r8Var = q8Var.v;
                        u90 u90Var = q8Var.f5850c;
                        Objects.requireNonNull(u90Var);
                        r8Var.J.H((URLSpan) characterStyle, r8Var, new androidx.fragment.app.d(u90Var, 22));
                        q8Var.f5848a = null;
                        return;
                    }
                    return;
                }
                return;
            case 6:
                e9 e9Var = (e9) this.f6082b;
                ei.x3 x3Var = (ei.x3) this.f6083c;
                e9Var.d.removeView(x3Var);
                if (x3Var == e9Var.f5362c) {
                    e9Var.f5361b = null;
                    e9Var.invalidate();
                    e9Var.b(false);
                    return;
                }
                return;
            case 7:
                z9 z9Var = (z9) this.f6083c;
                aa aaVar = ((r9) this.f6082b).d;
                q4 currentPeerView = aaVar.f5203n0.getCurrentPeerView();
                if (currentPeerView != null && (r3Var = currentPeerView.f5769c1) != null && (p4Var = aaVar.G0) != null && ((z9) p4Var.f5727c) == z9Var) {
                    r3Var.invalidate();
                    return;
                }
                return;
            case 8:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f6082b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f6083c;
                a6.i iVar = FirebaseMessaging.f7590l;
                firebaseMessaging.getClass();
                try {
                    taskCompletionSource.setResult(firebaseMessaging.a());
                    return;
                } catch (Exception e) {
                    taskCompletionSource.setException(e);
                    return;
                }
            case 9:
                com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) this.f6082b;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.f6083c;
                try {
                    taskCompletionSource2.setResult(mVar.a());
                    return;
                } catch (Exception e7) {
                    taskCompletionSource2.setException(e7);
                    return;
                }
            case 10:
                v0.f fVar = (v0.f) this.f6083c;
                v0.i iVar2 = ((d1.e) this.f6082b).f7728f;
                if (iVar2 != null) {
                    iVar2.onResult(fVar);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            case 11:
                da.c cVar = (da.c) this.f6082b;
                CountDownLatch countDownLatch = (CountDownLatch) this.f6083c;
                try {
                    l5.t.a().d.e(cVar.h.f15939a.b(i5.d.f12710c), 1);
                } catch (SQLException unused2) {
                }
                countDownLatch.countDown();
                return;
            case 12:
                di.v vVar = (di.v) this.f6082b;
                String str = (String) this.f6083c;
                ArrayList arrayList = vVar.f8071f;
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
                    vVar.f8073r.d(str.hashCode(), i11 + 1);
                    return;
                }
                return;
            case 13:
                ((v0.i) this.f6082b).onError((w0.d) this.f6083c);
                return;
            case 14:
                ((v0.i) this.f6082b).onResult((v0.f) this.f6083c);
                return;
            case 15:
                v0.c cVar2 = (v0.c) this.f6083c;
                v0.i iVar3 = ((e1.e) this.f6082b).f8183f;
                if (iVar3 != null) {
                    iVar3.onResult(cVar2);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            case 16:
                e2.c cVar3 = (e2.c) this.f6082b;
                Object apply = ((i2.w) this.f6083c).apply(cVar3.f8205f);
                cVar3.f8205f = apply;
                e2.b bVar = new e2.b(cVar3, apply, 1);
                e2.i0 i0Var = (e2.i0) cVar3.f8204c;
                if (i0Var.f8237a.getLooper().getThread().isAlive()) {
                    i0Var.d(bVar);
                    return;
                }
                return;
            case 17:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                ((Context) this.f6083c).registerReceiver(new androidx.mediarouter.app.f((e2.w) this.f6082b, 2), intentFilter);
                return;
            case 18:
                Context context = (Context) this.f6083c;
                e2.w wVar = (e2.w) ((androidx.mediarouter.app.f) this.f6082b).f3486b;
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
                j9.y yVar = (j9.y) this.f6083c;
                if (((j9.e0) this.f6082b).f14351a instanceof j9.a) {
                    yVar.cancel(false);
                    return;
                }
                return;
            case 20:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f6083c;
                qf.b bVar2 = (qf.b) ((ac.a) this.f6082b).f481c;
                bVar2.getClass();
                if (atomicBoolean.get()) {
                    new Thread(new v7(21, bVar2, atomicBoolean), "ExoPlayer:WakeLockManager").start();
                    return;
                }
                return;
            case 21:
                qf.b bVar3 = (qf.b) this.f6082b;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.f6083c;
                synchronized (bVar3) {
                    if (atomicBoolean2.get() && (wakeLock = (PowerManager.WakeLock) bVar3.f44452c) != null) {
                        wakeLock.release();
                    }
                }
                return;
            case 22:
                ei.d dVar = (ei.d) this.f6082b;
                org.telegram.ui.Cells.g gVar = (org.telegram.ui.Cells.g) this.f6083c;
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
                ((Utilities.Callback) this.f6082b).run((ArrayList) this.f6083c);
                return;
            case 24:
                ei.t1 t1Var = (ei.t1) this.f6082b;
                TLObject tLObject = (TLObject) this.f6083c;
                ei.v1 v1Var = t1Var.f9843s;
                if (tLObject instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                    ei.n2 n2Var = v1Var.f9931r;
                    MessagesController.getInstance(ei.n2.E(n2Var)).putUsers(tL_contacts_resolvedPeer.users, false);
                    MessagesController.getInstance(ei.n2.F(n2Var)).putChats(tL_contacts_resolvedPeer.chats, false);
                    MessagesStorage.getInstance(ei.n2.I(n2Var)).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                }
                t1Var.f9841n = true;
                t1Var.G();
                return;
            case 25:
                ((ei.s2) this.f6082b).e(0.0f, 240L, (Runnable) this.f6083c);
                return;
            case 26:
                ei.f6 f6Var = (ei.f6) this.f6082b;
                View view2 = (View) this.f6083c;
                f6Var.getClass();
                if (view2 instanceof rg.j) {
                    rg.j jVar = (rg.j) view2;
                    jVar.m();
                    f6Var.C0(jVar, true);
                    return;
                }
                return;
            case 27:
                TLRPC.MessageMedia messageMedia = (TLRPC.MessageMedia) this.f6082b;
                TL_stories.TL_mediaAreaGeoPoint tL_mediaAreaGeoPoint = (TL_stories.TL_mediaAreaGeoPoint) this.f6083c;
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
                ((Utilities.Callback) this.f6082b).run((Bitmap) this.f6083c);
                return;
            default:
                ei.r6.a((ei.r6) this.f6082b, (ei.a8) this.f6083c);
                return;
        }
    }
}
