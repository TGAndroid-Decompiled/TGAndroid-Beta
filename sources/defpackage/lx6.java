package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseIntArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.d;
public final class lx6 implements cx9, wk0, ue7, ah9, y73, l81, ou3, cx7, im4 {
    public static p0d e;
    public final byte a;
    public Object b;
    public Object c;
    public static final Object d = new Object();
    public static final Status f = new Status(8, "The connection to Google Play services was lost", null, null);

    public lx6(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        bx6 bx6Var;
        int i;
        this.a = (byte) 0;
        ComponentName componentName2 = null;
        if (!TextUtils.isEmpty(str)) {
            if (componentName == null) {
                int i2 = g07.b;
                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                intent.setPackage(context.getPackageName());
                List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
                if (queryBroadcastReceivers.size() == 1) {
                    ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
                    componentName2 = new ComponentName(activityInfo.packageName, activityInfo.name);
                } else if (queryBroadcastReceivers.size() > 1) {
                    ncd.f("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
                }
                componentName = componentName2;
                if (componentName == null) {
                    ncd.e("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
                }
            }
            if (componentName != null && pendingIntent == null) {
                Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
                intent2.setComponent(componentName);
                if (Build.VERSION.SDK_INT >= 31) {
                    i = 33554432;
                } else {
                    i = 0;
                }
                pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, i);
            }
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 37) {
                bx6Var = new bx6(context, str, bundle);
                this.b = bx6Var;
            } else if (i3 >= 29) {
                bx6Var = new bx6(context, str, bundle);
                this.b = bx6Var;
            } else if (i3 >= 28) {
                bx6Var = new bx6(context, str, bundle);
                this.b = bx6Var;
            } else {
                bx6Var = new bx6(context, str, bundle);
                this.b = bx6Var;
            }
            Looper myLooper = Looper.myLooper();
            M(new yw6((byte) 0), new Handler(myLooper == null ? Looper.getMainLooper() : myLooper));
            bx6Var.a.setMediaButtonReceiver(pendingIntent);
            kx6 kx6Var = ((bx6) this.b).c;
            ?? obj = new Object();
            DesugarCollections.synchronizedSet(new HashSet());
            if (Build.VERSION.SDK_INT >= 29) {
                obj.a = new to6(context, kx6Var);
            } else {
                obj.a = new to6(context, kx6Var);
            }
            this.c = obj;
            return;
        }
        u36.j("tag must not be null or empty");
        throw null;
    }

    public static defpackage.lx6 d(android.content.Context r5) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lx6.d(android.content.Context):lx6");
    }

    public static Task i(Context context, Intent intent, boolean z) {
        p0d p0dVar;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (d) {
            p0dVar = e;
            if (p0dVar == null) {
                p0dVar = new p0d(context);
                e = p0dVar;
            }
        }
        if (z) {
            if (e7a.v().x(context)) {
                mfd.c(context, p0dVar, intent);
            } else {
                p0dVar.b(intent);
            }
            return Tasks.forResult(-1);
        }
        return p0dVar.b(intent).continueWith(new kc((byte) 1), new h64((byte) 10));
    }

    public static hl2 l(hl2 hl2Var, List list) {
        hl2Var.getClass();
        Map map = hl2Var.a;
        HashMap hashMap = new HashMap(map);
        HashSet hashSet = new HashSet(list);
        for (String str : map.keySet()) {
            if (!hashSet.contains(str)) {
                hashMap.remove(str);
            }
        }
        return new hl2(hashMap);
    }

    @Override
    public final void A() {
        hh9 hh9Var = ((p82) this.c).s;
        if (hh9Var != null) {
            int i = 0;
            hh9Var.e(false, true);
            int i2 = hh9Var.c0;
            if (i2 != 2) {
                i = i2;
            }
            hh9Var.g(i, true);
        }
    }

    public final void B(f9 f9Var) {
        e7a e7aVar = (e7a) this.b;
        ((ActionMode.Callback) e7aVar.a).onDestroyActionMode(e7aVar.q(f9Var));
        bq bqVar = (bq) this.c;
        if (bqVar.F != null) {
            bqVar.f.getDecorView().removeCallbacks(bqVar.G);
        }
        if (bqVar.E != null) {
            ahc ahcVar = bqVar.H;
            if (ahcVar != null) {
                ahcVar.b();
            }
            ahc a = kfc.a(bqVar.E);
            a.a(0.0f);
            bqVar.H = a;
            a.d(new rp(this, (byte) 2));
        }
        bqVar.y = null;
        ViewGroup viewGroup = bqVar.K;
        WeakHashMap weakHashMap = kfc.a;
        afc.c(viewGroup);
        bqVar.w();
    }

    @Override
    public final bu5 C(View view) {
        p82 p82Var = (p82) this.c;
        bu5 bu5Var = new bu5(p82Var, (ylb) this.b, view, false, false, true);
        p82Var.I = bu5Var;
        return bu5Var;
    }

    @Override
    public final void E() {
        p82 p82Var = (p82) this.c;
        p82Var.c0();
        p82Var.d0();
    }

    @Override
    public final t76 F(jt6 jt6Var) {
        Uri uri;
        byte[] bArr;
        mx6 mx6Var = (mx6) this.c;
        if (mx6Var != null && (((uri = (Uri) mx6Var.c) != null && uri.equals(jt6Var.n)) || ((bArr = (byte[]) mx6Var.b) != null && Arrays.equals(bArr, jt6Var.k)))) {
            t76 t76Var = (t76) ((mx6) this.c).d;
            t76Var.getClass();
            return t76Var;
        }
        t76 F = ((wk0) this.b).F(jt6Var);
        if (F == null) {
            return null;
        }
        this.c = new mx6(jt6Var, F);
        return F;
    }

    public final void G(long j, File file) {
        synchronized (((u30) this.c).f) {
            ((HashMap) ((u30) this.c).g).put(Long.valueOf(j), file);
        }
    }

    public final void H(hl2 hl2Var) {
        for (Map.Entry entry : new HashMap((HashMap) this.b).entrySet()) {
            if (entry.getKey() == null) {
                List list = (List) entry.getValue();
                if (!l(hl2Var, list).equals(l((hl2) this.c, list))) {
                    throw null;
                }
            } else {
                rjb.p();
                return;
            }
        }
        this.c = hl2Var;
    }

    @Override
    public final void I(zg9 zg9Var, View view) {
        p82 p82Var = (p82) this.c;
        bu5 bu5Var = new bu5(p82Var, (ylb) this.b, view, false, false, true);
        bu5Var.T = true;
        p82Var.I = ph9.c(bu5Var, p82Var.b.Z1, p82Var.getContext(), (ylb) this.b, zg9Var, true);
    }

    public final boolean J(f9 f9Var, y17 y17Var) {
        ViewGroup viewGroup = ((bq) this.c).K;
        WeakHashMap weakHashMap = kfc.a;
        afc.c(viewGroup);
        e7a e7aVar = (e7a) this.b;
        ActionMode.Callback callback = (ActionMode.Callback) e7aVar.a;
        vdb q = e7aVar.q(f9Var);
        cka ckaVar = (cka) e7aVar.d;
        Menu menu = (Menu) ckaVar.get(y17Var);
        if (menu == null) {
            menu = new w27((Context) e7aVar.b, y17Var);
            ckaVar.put(y17Var, menu);
        }
        return callback.onPrepareActionMode(q, menu);
    }

    public final Task K(Intent intent) {
        boolean z;
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        boolean z2 = false;
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        Context context = (Context) this.b;
        kc kcVar = (kc) this.c;
        if (ate.a() && context.getApplicationInfo().targetSdkVersion >= 26) {
            z = true;
        } else {
            z = false;
        }
        if ((intent.getFlags() & 268435456) != 0) {
            z2 = true;
        }
        if (z && !z2) {
            return i(context, intent, z2);
        }
        return Tasks.call(kcVar, new b83(context, intent, (byte) 3)).continueWithTask(kcVar, new ci(context, intent, z2, (byte) 7));
    }

    public final void L() {
        try {
            ((FileLock) this.c).release();
            ((FileChannel) this.b).close();
        } catch (IOException e2) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e2);
        }
    }

    public final void M(yw6 yw6Var, Handler handler) {
        bx6 bx6Var = (bx6) this.b;
        synchronized (bx6Var.d) {
            bx6Var.l = yw6Var;
            bx6Var.a.setCallback((xw6) yw6Var.e, handler);
            yw6Var.d0(bx6Var, handler);
        }
    }

    @Override
    public final t76 N(byte[] bArr) {
        byte[] bArr2;
        mx6 mx6Var = (mx6) this.c;
        if (mx6Var != null && (bArr2 = (byte[]) mx6Var.b) != null && Arrays.equals(bArr2, bArr)) {
            t76 t76Var = (t76) ((mx6) this.c).d;
            t76Var.getClass();
            return t76Var;
        }
        t76 N = ((wk0) this.b).N(bArr);
        this.c = new mx6(bArr, N);
        return N;
    }

    public final void O(lt6 lt6Var) {
        bx6 bx6Var = (bx6) this.b;
        bx6Var.i = lt6Var;
        MediaSession mediaSession = bx6Var.a;
        Bundle bundle = lt6Var.a;
        MediaMetadata mediaMetadata = lt6Var.b;
        if (mediaMetadata == null) {
            MediaMetadata.Builder builder = new MediaMetadata.Builder();
            try {
                for (String str : bundle.keySet()) {
                    Integer num = (Integer) lt6.c.get(str);
                    if (num == null) {
                        num = -1;
                    }
                    int intValue = num.intValue();
                    if (intValue != 0) {
                        if (intValue != 1) {
                            if (intValue != 2) {
                                if (intValue != 3) {
                                    Object obj = bundle.get(str);
                                    if (obj != null && !(obj instanceof CharSequence)) {
                                        if (obj instanceof Long) {
                                            builder.putLong(str, ((Long) obj).longValue());
                                        }
                                    } else {
                                        builder.putText(str, (CharSequence) obj);
                                    }
                                } else {
                                    builder.putRating(str, (Rating) bundle.getParcelable(str));
                                }
                            } else {
                                builder.putBitmap(str, (Bitmap) bundle.getParcelable(str));
                            }
                        } else {
                            builder.putText(str, bundle.getCharSequence(str));
                        }
                    } else {
                        builder.putLong(str, bundle.getLong(str));
                    }
                }
            } catch (RuntimeException e2) {
                ncd.g("MediaMetadata", "Failed to convert MediaMetadataCompat to MediaMetadata", e2);
            }
            mediaMetadata = builder.build();
            lt6Var.b = mediaMetadata;
        }
        mediaSession.setMetadata(mediaMetadata);
    }

    public final void P(ge8 ge8Var) {
        RemoteCallbackList remoteCallbackList;
        bx6 bx6Var = (bx6) this.b;
        bx6Var.g = ge8Var;
        synchronized (bx6Var.d) {
            int beginBroadcast = bx6Var.f.beginBroadcast() - 1;
            while (true) {
                remoteCallbackList = bx6Var.f;
                if (beginBroadcast < 0) {
                    break;
                }
                try {
                    ((gk5) remoteCallbackList.getBroadcastItem(beginBroadcast)).j(ge8Var);
                } catch (RemoteException | SecurityException e2) {
                    ncd.d("MediaSessionCompat", "Dead object in setPlaybackState.", e2);
                }
                beginBroadcast--;
            }
            remoteCallbackList.finishBroadcast();
        }
        MediaSession mediaSession = bx6Var.a;
        PlaybackState playbackState = ge8Var.x;
        if (playbackState == null) {
            PlaybackState.Builder builder = new PlaybackState.Builder();
            builder.setState(ge8Var.a, ge8Var.b, ge8Var.d, ge8Var.n);
            builder.setBufferedPosition(ge8Var.c);
            builder.setActions(ge8Var.e);
            builder.setErrorMessage(ge8Var.h);
            for (fe8 fe8Var : ge8Var.r) {
                fe8Var.getClass();
                PlaybackState.CustomAction.Builder builder2 = new PlaybackState.CustomAction.Builder(fe8Var.a, fe8Var.b, fe8Var.c);
                builder2.setExtras(fe8Var.d);
                PlaybackState.CustomAction build = builder2.build();
                if (build != null) {
                    builder.addCustomAction(build);
                }
            }
            builder.setActiveQueueItemId(ge8Var.s);
            builder.setExtras(ge8Var.w);
            playbackState = builder.build();
            ge8Var.x = playbackState;
        }
        mediaSession.setPlaybackState(playbackState);
    }

    public final void Q(ArrayList arrayList) {
        int i = 0;
        if (arrayList != null) {
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                long j = ((jx6) obj).b;
                if (hashSet.contains(Long.valueOf(j))) {
                    ncd.d("MediaSessionCompat", kt6.n(j, "Found duplicate queue id: "), new IllegalArgumentException("id of each queue item should be unique"));
                }
                hashSet.add(Long.valueOf(j));
            }
        }
        bx6 bx6Var = (bx6) this.b;
        MediaSession mediaSession = bx6Var.a;
        bx6Var.h = arrayList;
        if (arrayList == null) {
            mediaSession.setQueue(null);
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj2 = arrayList.get(i);
            i++;
            jx6 jx6Var = (jx6) obj2;
            MediaSession.QueueItem queueItem = jx6Var.c;
            if (queueItem == null) {
                MediaSession.QueueItem queueItem2 = new MediaSession.QueueItem(jx6Var.a.a(), jx6Var.b);
                jx6Var.c = queueItem2;
                queueItem = queueItem2;
            }
            arrayList2.add(queueItem);
        }
        mediaSession.setQueue(arrayList2);
    }

    public final yzb R(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = (int[]) this.b;
            if (i2 < iArr.length) {
                if (i == iArr[i2]) {
                    return ((hr9[]) this.c)[i2];
                }
                i2++;
            } else {
                ncd.c("BaseMediaChunkOutput", "Unmatched track of type: " + i);
                return new ip3();
            }
        }
    }

    public final void S() {
        BasePendingResult[] basePendingResultArr;
        boolean f2;
        Set set = (Set) this.b;
        for (BasePendingResult basePendingResult : (BasePendingResult[]) set.toArray(new BasePendingResult[0])) {
            basePendingResult.g.set(null);
            synchronized (basePendingResult.a) {
                if (((h05) basePendingResult.c.get()) == null || !basePendingResult.m) {
                    basePendingResult.c();
                }
                f2 = basePendingResult.f();
            }
            if (f2) {
                set.remove(basePendingResult);
            }
        }
    }

    @Override
    public final boolean a(float r5) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lx6.a(float):boolean");
    }

    @Override
    public final void b(xk9 xk9Var, String str) {
        p82 p82Var = (p82) this.c;
        pr2 pr2Var = p82Var.w;
        if (pr2Var == null) {
            ylb ylbVar = (ylb) this.b;
            pr2Var = new pr2(new g11(this, ylbVar, (byte) 29), ylbVar);
            p82Var.w = pr2Var;
        }
        pr2Var.z(xk9Var, str);
    }

    @Override
    public final void c(int i) {
        ((p82) this.c).S(74, i);
    }

    @Override
    public final a83 createDataSource() {
        return new jb3((Context) this.b, ((yh4) this.c).createDataSource());
    }

    @Override
    public final void dismiss() {
        ((wf3) this.c).dismiss();
    }

    @Override
    public final void e() {
        int i;
        p82 p82Var = (p82) this.c;
        ch9 ch9Var = p82Var.r;
        hh9 hh9Var = p82Var.s;
        if (hh9Var != null) {
            qg9 qg9Var = ch9Var.v3;
            if (qg9Var != null && qg9Var.w() && ch9Var.E4()) {
                i = 1;
            } else {
                i = 0;
            }
            if (hh9Var.b0 == 2) {
                hh9Var.c0 = i;
            } else {
                hh9Var.g(i, true);
            }
            if (i != 0) {
                p82Var.b0();
            }
        }
        p82Var.e0();
    }

    @Override
    public final void f() {
        hh9 hh9Var = ((p82) this.c).s;
        if (hh9Var != null) {
            int i = hh9Var.b0;
            if (i == 2) {
                i = 0;
            }
            hh9Var.c0 = i;
            hh9Var.e(false, false);
            hh9Var.g(2, true);
        }
    }

    @Override
    public final java.lang.Object g(defpackage.jm4 r7, defpackage.px2 r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lx6.g(jm4, px2):java.lang.Object");
    }

    @Override
    public final CharSequence getContentDescription() {
        return null;
    }

    @Override
    public final void h(s71 s71Var, b81 b81Var, boolean z) {
        wf3 wf3Var = (wf3) this.c;
        vf3 vf3Var = wf3Var.S1;
        if (b81Var != null) {
            ((c81) this.b).i(b81Var);
            wf3Var.Z1.e();
            c81 c81Var = wf3Var.b2;
            f35[] f35VarArr = wf3Var.W1;
            oh2[] oh2VarArr = wf3Var.X1;
            oh2 oh2Var = oh2VarArr[0];
            if (oh2Var != null) {
                f35 f35Var = f35VarArr[0];
                boolean z2 = c81Var.m;
                f35Var.b = z2;
                oh2Var.c(z2, true);
            }
            oh2 oh2Var2 = oh2VarArr[1];
            if (oh2Var2 != null) {
                f35 f35Var2 = f35VarArr[1];
                boolean z3 = c81Var.n;
                f35Var2.b = z3;
                oh2Var2.c(z3, true);
            }
            oh2 oh2Var3 = oh2VarArr[2];
            if (oh2Var3 != null) {
                f35 f35Var3 = f35VarArr[2];
                boolean z4 = c81Var.o;
                f35Var3.b = z4;
                oh2Var3.c(z4, true);
            }
            oh2 oh2Var4 = oh2VarArr[3];
            if (oh2Var4 != null) {
                f35 f35Var4 = f35VarArr[3];
                boolean z5 = c81Var.p;
                f35Var4.b = z5;
                oh2Var4.c(z5, true);
            }
            oh2 oh2Var5 = oh2VarArr[4];
            if (oh2Var5 != null) {
                f35 f35Var5 = f35VarArr[4];
                boolean z6 = c81Var.q;
                f35Var5.b = z6;
                oh2Var5.c(z6, true);
            }
            wf3Var.V1.a(vf3Var.d(), true);
            vf3Var.c(true);
        }
    }

    @Override
    public final void j(ne9 ne9Var, boolean z) {
        ((p82) this.c).b.c1(ne9Var, z);
    }

    @Override
    public final int j0() {
        return 0;
    }

    public final void k() {
        String str = (String) this.b;
        try {
            new File((File) ((jd4) this.c).c, str).createNewFile();
        } catch (IOException e2) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e2);
        }
    }

    @Override
    public final void m() {
        ((gu3) this.c).b(((qu3) this.b).getText());
    }

    @Override
    public final void n(boolean z, float f2) {
        ((TextView) this.b).setText("Alpha " + xl0.o1);
        xl0.o1 = f2;
        ((xl0) this.c).l1.K();
    }

    public final void o(ia3 ia3Var) {
        synchronized (ia3Var) {
        }
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new k40(this, ia3Var, (byte) 0));
        }
    }

    @Override
    public final void onContentChanged() {
        p82 p82Var = (p82) this.c;
        hh9 hh9Var = p82Var.s;
        if (hh9Var != null) {
            hh9Var.setSendLoading(p82Var.r.i3());
        }
        p82Var.Z(true);
        p82Var.d0();
        e82 e82Var = p82Var.Q;
        gm.r(e82Var);
        gm.d3(e82Var, 1000L);
    }

    public final ArrayList p() {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        Context context = (Context) this.b;
        Class cls = (Class) ((ni6) this.c).b;
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, cls), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", cls + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
        }
        for (String str2 : arrayList) {
            arrayList2.add(new kr2(str2, (byte) 0));
        }
        return arrayList2;
    }

    @Override
    public final void q() {
        p82 p82Var = (p82) this.c;
        if (p82Var.getCurrentItemTop() != p82Var.J) {
            p82Var.b.H1(p82Var, 0);
        }
        p82Var.f0();
        p82Var.a0();
    }

    public final oi7 r(int i, long j, boolean z) {
        nl9 nl9Var = (nl9) this.b;
        if (i > 0) {
            i = ((SparseIntArray) this.c).get(i, 0);
        }
        Object obj = null;
        if (i == 0) {
            return null;
        }
        long j2 = i;
        LongSparseArray z0 = nl9Var.z0(j, 0L);
        if (z0 != null) {
            obj = z0.get(j2);
        }
        oi7 oi7Var = (oi7) obj;
        if (oi7Var == null && z) {
            oi7 oi7Var2 = new oi7();
            nl9Var.I0(j, 0L, j2, oi7Var2);
            return oi7Var2;
        }
        return oi7Var;
    }

    public final s84 s(Object... objArr) {
        Constructor b;
        synchronized (((AtomicBoolean) this.c)) {
            if (!((AtomicBoolean) this.c).get()) {
                try {
                    try {
                        b = ((wa3) this.b).b();
                    } catch (Exception e2) {
                        throw new RuntimeException("Error instantiating extension", e2);
                    }
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.c).set(true);
                }
            }
            b = null;
        }
        if (b == null) {
            return null;
        }
        try {
            return (s84) b.newInstance(objArr);
        } catch (Exception e3) {
            wa3.h("Unexpected error creating extractor", e3);
            return null;
        }
    }

    @Override
    public final void t(ll0 ll0Var) {
        p82 p82Var = (p82) this.c;
        i22 i22Var = p82Var.b;
        d dVar = i22Var.Z1;
        if (dVar != null && ll0Var != null && (ll0Var.b instanceof TL_iv.pageBlockMap) && gm.H1(dVar)) {
            i22 i22Var2 = new i22(p82Var.getContext(), i22Var.Z1, false, false, false, null);
            i22Var2.W3 = new Object();
            i22Var2.J1 = true;
            i22Var2.u3.setVisibility(8);
            i22Var2.t4 = new jf(p82Var, ll0Var, i22Var2, (byte) 26);
            i22Var2.Z0();
            i22Var2.show();
        }
    }

    public final String toString() {
        switch (this.a) {
            case 8:
                try {
                    qk0 qk0Var = (qk0) this.c;
                    if (qk0Var == null) {
                        qk0Var = ((mx6) this.b).J();
                        this.c = qk0Var;
                    }
                    return qk0Var.toString();
                } catch (xl7 unused) {
                    return "";
                }
            default:
                return super.toString();
        }
    }

    @Override
    public final void u(int i) {
        p82 p82Var = (p82) this.c;
        p82Var.b.H1(p82Var, i);
        p82Var.f0();
        p82Var.a0();
    }

    @Override
    public final void w(bh9 bh9Var, View view) {
        p82 p82Var = (p82) this.c;
        bu5 bu5Var = new bu5(p82Var, (ylb) this.b, view, false, false, true);
        bu5Var.T = true;
        d dVar = p82Var.b.Z1;
        p82Var.getContext();
        p82Var.I = ph9.b(bu5Var, dVar, bh9Var, true);
    }

    @Override
    public final Object y(Uri uri, e83 e83Var) {
        jg4 jg4Var = (jg4) ((cx7) this.b).y(uri, e83Var);
        List list = (List) this.c;
        if (list != null && !list.isEmpty()) {
            return (jg4) jg4Var.a(list);
        }
        return jg4Var;
    }

    @Override
    public final void z(boolean z) {
        h91 h91Var = ((f91) this.c).b;
        h91Var.y.finishFragment();
        k91 k91Var = h91Var.y;
        ((yv1) this.b).k6(k91Var.Q, k91Var.R + 86400, z);
    }

    @Override
    public final void clear() {
    }

    @Override
    public final void v() {
    }

    @Override
    public final void x() {
    }

    public lx6(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public lx6(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public lx6(byte b) {
        this.a = b;
        switch (b) {
            case 10:
                this.b = new nl9((byte) 10);
                this.c = new SparseIntArray();
                return;
            case 13:
                return;
            case 25:
                this.b = new HashMap();
                this.c = hl2.b;
                return;
            default:
                this.b = DesugarCollections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
                this.c = new m4d(this);
                return;
        }
    }

    public lx6(Context context, byte b) {
        this.a = b;
        switch (b) {
            case 20:
                yh4 yh4Var = new yh4((byte) 5);
                this.b = context.getApplicationContext();
                this.c = yh4Var;
                return;
            default:
                this.b = context;
                this.c = new kc((byte) 1);
                return;
        }
    }

    public lx6(String str) {
        this.a = (byte) 26;
        this.c = null;
        this.b = str;
    }

    public lx6(Handler handler, o40 o40Var) {
        this.a = (byte) 6;
        if (o40Var != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.b = handler;
        this.c = o40Var;
    }

    public lx6(EditText editText) {
        this.a = (byte) 24;
        this.b = editText;
        qz3 qz3Var = new qz3(editText);
        this.c = qz3Var;
        editText.addTextChangedListener(qz3Var);
        if (ay3.b == null) {
            synchronized (ay3.a) {
                if (ay3.b == null) {
                    ?? factory = new Editable.Factory();
                    try {
                        ay3.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, ay3.class.getClassLoader());
                    } catch (Throwable unused) {
                    }
                    ay3.b = factory;
                }
            }
        }
        editText.setEditableFactory(ay3.b);
    }

    public lx6(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public lx6(wa3 wa3Var) {
        this.a = (byte) 21;
        this.b = wa3Var;
        this.c = new AtomicBoolean(false);
    }
}
