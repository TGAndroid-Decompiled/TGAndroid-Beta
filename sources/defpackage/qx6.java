package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import j$.util.DesugarCollections;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.telegram.messenger.MediaController;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
public final class qx6 implements ty9, nc2, ep2, SuccessContinuation, u69, nh5, tw8, mm4 {
    public static e3d e;
    public final byte a;
    public Object b;
    public Object c;
    public static final Object d = new Object();
    public static final Status f = new Status(8, "The connection to Google Play services was lost", null, null);

    public qx6(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        gx6 gx6Var;
        int i;
        this.a = (byte) 0;
        ComponentName componentName2 = null;
        if (!TextUtils.isEmpty(str)) {
            if (componentName == null) {
                int i2 = n07.b;
                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                intent.setPackage(context.getPackageName());
                List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
                if (queryBroadcastReceivers.size() == 1) {
                    ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
                    componentName2 = new ComponentName(activityInfo.packageName, activityInfo.name);
                } else if (queryBroadcastReceivers.size() > 1) {
                    efd.f("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
                }
                componentName = componentName2;
                if (componentName == null) {
                    efd.e("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
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
                gx6Var = new gx6(context, str, bundle);
                this.b = gx6Var;
            } else if (i3 >= 29) {
                gx6Var = new gx6(context, str, bundle);
                this.b = gx6Var;
            } else if (i3 >= 28) {
                gx6Var = new gx6(context, str, bundle);
                this.b = gx6Var;
            } else {
                gx6Var = new gx6(context, str, bundle);
                this.b = gx6Var;
            }
            Looper myLooper = Looper.myLooper();
            K(new dx6((byte) 0), new Handler(myLooper == null ? Looper.getMainLooper() : myLooper));
            gx6Var.a.setMediaButtonReceiver(pendingIntent);
            this.c = new kj4(context, this);
            return;
        }
        lq5.j("tag must not be null or empty");
        throw null;
    }

    public static void b(ArrayList arrayList, int i, int[] iArr, int[] iArr2, int i2) {
        arrayList.add(r63.a[i]);
        if (i2 != 0) {
            iArr2[0] = iArr2[0] + 1;
        }
        iArr[0] = (i * iArr2[0]) + iArr[0];
    }

    public static Task e(Context context, Intent intent, boolean z) {
        e3d e3dVar;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (d) {
            e3dVar = e;
            if (e3dVar == null) {
                e3dVar = new e3d(context);
                e = e3dVar;
            }
        }
        if (z) {
            if (u8a.v().x(context)) {
                cid.c(context, e3dVar, intent);
            } else {
                e3dVar.b(intent);
            }
            return Tasks.forResult(-1);
        }
        return e3dVar.b(intent).continueWith(new ic((byte) 1), new su3((byte) 20));
    }

    public static boolean j(int r7, int r8, java.lang.CharSequence r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qx6.j(int, int, java.lang.CharSequence):boolean");
    }

    public static boolean r(Editable editable, KeyEvent keyEvent, boolean z) {
        x7c[] x7cVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (x7cVarArr = (x7c[]) editable.getSpans(selectionStart, selectionEnd, x7c.class)) != null && x7cVarArr.length > 0) {
                for (x7c x7cVar : x7cVarArr) {
                    int spanStart = editable.getSpanStart(x7cVar);
                    int spanEnd = editable.getSpanEnd(x7cVar);
                    if (z) {
                        if (spanStart == selectionStart) {
                            editable.delete(spanStart, spanEnd);
                            return true;
                        }
                        if (selectionStart <= spanStart && selectionStart < spanEnd) {
                            editable.delete(spanStart, spanEnd);
                            return true;
                        }
                    } else {
                        if (spanEnd == selectionStart) {
                            editable.delete(spanStart, spanEnd);
                            return true;
                        }
                        if (selectionStart <= spanStart) {
                        }
                    }
                }
            }
        }
        return false;
    }

    public static boolean v(defpackage.lx3 r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qx6.v(lx3, android.text.Editable, int, int, boolean):boolean");
    }

    public final void C(long j, byte[] bArr) {
        File file;
        v20 v20Var = (v20) this.c;
        if (v20Var.g) {
            v20Var.g = false;
            v20Var.b.h();
            return;
        }
        i30 i30Var = v20Var.b;
        i30Var.getClass();
        i30.q();
        g30 g30Var = i30Var.z;
        if (i30Var.G == 5 && g30Var != null) {
            file = g30Var.b;
        } else {
            file = null;
        }
        sn6 sn6Var = (sn6) this.b;
        if (file == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Preview file is unavailable");
            MediaController mediaController = sn6Var.a;
            String[] strArr = MediaController.W1;
            cc4.e("AudioRecorderV2 failed", illegalStateException);
            jn7.f(mediaController.i1).k(jn7.m2, Integer.valueOf(mediaController.h1));
            mediaController.u(false);
            return;
        }
        MediaController mediaController2 = sn6Var.a;
        mediaController2.k1 = file;
        mediaController2.l1 = j;
        mediaController2.K0(file, j, bArr);
        ls6.d0(mediaController2.i1).D1(mediaController2.n1, mediaController2.o1, gs6.a(mediaController2, file.getAbsolutePath(), mediaController2.K1));
        jn7.f(mediaController2.i1).k(jn7.o2, new Object[0]);
        jn7.f(mediaController2.i1).k(jn7.s2, Integer.valueOf(mediaController2.h1), mediaController2.g1, file.getAbsolutePath());
        mediaController2.b0(false);
        MediaController.l0(false);
    }

    public final void E(Exception exc, boolean z) {
        int i;
        this.c = null;
        HashSet hashSet = (HashSet) this.b;
        po5 q = po5.q(hashSet);
        hashSet.clear();
        no5 listIterator = q.listIterator(0);
        while (listIterator.hasNext()) {
            ta3 ta3Var = (ta3) listIterator.next();
            ta3Var.getClass();
            if (z) {
                i = 1;
            } else {
                i = 3;
            }
            ta3Var.l(i, exc);
        }
    }

    public final void F(zn4 zn4Var) {
        zi0 zi0Var = (zi0) this.c;
        ve9 ve9Var = (ve9) this.b;
        int i = zn4Var.b;
        if (i == 0) {
            zi0Var.execute(new iqd(ve9Var, zn4Var.a, (byte) 3));
        } else {
            zi0Var.execute(new tv(ve9Var, i));
        }
    }

    public final void G(Object obj) {
        Runnable runnable = (Runnable) this.c;
        if (runnable != null && obj.equals(this.b)) {
            this.c = null;
            runnable.run();
        }
    }

    public final Task H(Intent intent) {
        boolean z;
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        boolean z2 = false;
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        Context context = (Context) this.b;
        ic icVar = (ic) this.c;
        if (rve.a() && context.getApplicationInfo().targetSdkVersion >= 26) {
            z = true;
        } else {
            z = false;
        }
        if ((intent.getFlags() & 268435456) != 0) {
            z2 = true;
        }
        if (z && !z2) {
            return e(context, intent, z2);
        }
        return Tasks.call(icVar, new i73(context, intent, (byte) 4)).continueWithTask(icVar, new bh(context, intent, z2, (byte) 7));
    }

    @Override
    public final void I(long j) {
        ((e) this.b).presentFragment(zu1.ha(j));
        ((xo2) this.c).dismiss();
    }

    public final void J(ta3 ta3Var) {
        ((HashSet) this.b).add(ta3Var);
        if (((ta3) this.c) != null) {
            return;
        }
        this.c = ta3Var;
        c64 d2 = ta3Var.b.d();
        ta3Var.z = d2;
        ra3 ra3Var = ta3Var.s;
        String str = gcc.a;
        d2.getClass();
        ra3Var.getClass();
        ra3Var.obtainMessage(1, new sa3(ja6.h.getAndIncrement(), true, SystemClock.elapsedRealtime(), d2)).sendToTarget();
    }

    public final void K(dx6 dx6Var, Handler handler) {
        gx6 gx6Var = (gx6) this.b;
        synchronized (gx6Var.d) {
            gx6Var.l = dx6Var;
            gx6Var.a.setCallback((cx6) dx6Var.e, handler);
            dx6Var.d0(gx6Var, handler);
        }
    }

    public final void L(boolean z) {
        bz3 bz3Var = (bz3) ((lh2) ((ri6) this.c).b).c;
        if (bz3Var.c != z) {
            if (bz3Var.b != null) {
                gx3 a = gx3.a();
                az3 az3Var = bz3Var.b;
                a.getClass();
                ewe.a(az3Var, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a.a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a.b.remove(az3Var);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            bz3Var.c = z;
            if (z) {
                bz3.a(bz3Var.a, gx3.a().b());
            }
        }
    }

    public final void M(pt6 pt6Var) {
        gx6 gx6Var = (gx6) this.b;
        gx6Var.i = pt6Var;
        MediaSession mediaSession = gx6Var.a;
        Bundle bundle = pt6Var.a;
        MediaMetadata mediaMetadata = pt6Var.b;
        if (mediaMetadata == null) {
            MediaMetadata.Builder builder = new MediaMetadata.Builder();
            try {
                for (String str : bundle.keySet()) {
                    Integer num = (Integer) pt6.c.get(str);
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
                efd.g("MediaMetadata", "Failed to convert MediaMetadataCompat to MediaMetadata", e2);
            }
            mediaMetadata = builder.build();
            pt6Var.b = mediaMetadata;
        }
        mediaSession.setMetadata(mediaMetadata);
    }

    public final void N(sf8 sf8Var) {
        RemoteCallbackList remoteCallbackList;
        gx6 gx6Var = (gx6) this.b;
        gx6Var.g = sf8Var;
        synchronized (gx6Var.d) {
            int beginBroadcast = gx6Var.f.beginBroadcast() - 1;
            while (true) {
                remoteCallbackList = gx6Var.f;
                if (beginBroadcast < 0) {
                    break;
                }
                try {
                    ((jk5) remoteCallbackList.getBroadcastItem(beginBroadcast)).j(sf8Var);
                } catch (RemoteException | SecurityException e2) {
                    efd.d("MediaSessionCompat", "Dead object in setPlaybackState.", e2);
                }
                beginBroadcast--;
            }
            remoteCallbackList.finishBroadcast();
        }
        MediaSession mediaSession = gx6Var.a;
        PlaybackState playbackState = sf8Var.x;
        if (playbackState == null) {
            PlaybackState.Builder builder = new PlaybackState.Builder();
            builder.setState(sf8Var.a, sf8Var.b, sf8Var.d, sf8Var.n);
            builder.setBufferedPosition(sf8Var.c);
            builder.setActions(sf8Var.e);
            builder.setErrorMessage(sf8Var.h);
            for (rf8 rf8Var : sf8Var.r) {
                rf8Var.getClass();
                PlaybackState.CustomAction.Builder builder2 = new PlaybackState.CustomAction.Builder(rf8Var.a, rf8Var.b, rf8Var.c);
                builder2.setExtras(rf8Var.d);
                PlaybackState.CustomAction build = builder2.build();
                if (build != null) {
                    builder.addCustomAction(build);
                }
            }
            builder.setActiveQueueItemId(sf8Var.s);
            builder.setExtras(sf8Var.w);
            playbackState = builder.build();
            sf8Var.x = playbackState;
        }
        mediaSession.setPlaybackState(playbackState);
    }

    public final void O(wo8 wo8Var) {
        this.b = wo8Var;
        if (wo8Var.a() != null) {
            wo8Var.a().getClass();
            String str = wo8Var.a().d;
            if (str != null) {
                this.c = str;
            }
        }
    }

    public final void P(ArrayList arrayList) {
        int i = 0;
        if (arrayList != null) {
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                long j = ((ox6) obj).b;
                if (hashSet.contains(Long.valueOf(j))) {
                    efd.d("MediaSessionCompat", qu6.n(j, "Found duplicate queue id: "), new IllegalArgumentException("id of each queue item should be unique"));
                }
                hashSet.add(Long.valueOf(j));
            }
        }
        gx6 gx6Var = (gx6) this.b;
        MediaSession mediaSession = gx6Var.a;
        gx6Var.h = arrayList;
        if (arrayList == null) {
            mediaSession.setQueue(null);
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj2 = arrayList.get(i);
            i++;
            ox6 ox6Var = (ox6) obj2;
            MediaSession.QueueItem queueItem = ox6Var.c;
            if (queueItem == null) {
                MediaSession.QueueItem queueItem2 = new MediaSession.QueueItem(ox6Var.a.a(), ox6Var.b);
                ox6Var.c = queueItem2;
                queueItem = queueItem2;
            }
            arrayList2.add(queueItem);
        }
        mediaSession.setQueue(arrayList2);
    }

    public final void Q(ArrayList arrayList) {
        fr7 fr7Var;
        for (int i = 0; i < arrayList.size(); i++) {
            if (((er7) arrayList.get(i)).a == 1) {
                try {
                    fr7Var = new fr7((er7) arrayList.get(i));
                } catch (dr7 unused) {
                    fr7Var = null;
                }
                this.c = fr7Var;
            }
        }
    }

    public final void R() {
        BasePendingResult[] basePendingResultArr;
        boolean f2;
        Set set = (Set) this.b;
        for (BasePendingResult basePendingResult : (BasePendingResult[]) set.toArray(new BasePendingResult[0])) {
            basePendingResult.g.set(null);
            synchronized (basePendingResult.a) {
                if (((m05) basePendingResult.c.get()) == null || !basePendingResult.m) {
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
    public final void W() {
        xo2 xo2Var = (xo2) this.c;
        xo2Var.v1.d.g3.O(true);
        xo2Var.u1.d.g3.O(true);
    }

    @Override
    public final iy7 a(jh5 jh5Var, fh5 fh5Var) {
        ((z3f) this.b).getClass();
        return new lh2(new mh5(jh5Var, fh5Var), (List) this.c, (byte) 28);
    }

    @Override
    public final iy7 c() {
        return new lh2(((z3f) this.b).c(), (List) this.c, (byte) 28);
    }

    @Override
    public final void close() {
        ((xo2) this.c).n1.F(0);
    }

    @Override
    public final boolean mo8d(float f2, float f3, int i, View view) {
        switch (this.a) {
            case 22:
                uj3 uj3Var = (uj3) this.c;
                if (view instanceof of3) {
                    of3 of3Var = (of3) view;
                    if (of3Var.o2) {
                        uj3Var.i5(of3Var.getDialogId(), view);
                        return true;
                    }
                }
                ij3 ij3Var = uj3Var.A0;
                if (ij3Var != null && ij3Var.getVisibility() == 0 && uj3Var.A0.n) {
                    return false;
                }
                return uj3Var.D4(view, i, f2, ((tj3) this.b).d);
            default:
                Rect rect = (Rect) this.b;
                ru3 ru3Var = (ru3) this.c;
                if (ru3Var.getParentActivity() != null && (view instanceof bd5)) {
                    ((ImageView) view.getTag(2131296587)).getHitRect(rect);
                    if (!rect.contains((int) f2, (int) f3)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ru3Var.getParentActivity());
                        alertDialog$Builder.e(new CharSequence[]{ob6.M0(2131751563, null)}, new mu3(this, i, (byte) 0));
                        ru3Var.showDialog(alertDialog$Builder.a);
                        return true;
                    }
                }
                return false;
        }
    }

    @Override
    public final void dismiss() {
        ((fu5) this.b).u();
    }

    @Override
    public final void f() {
        switch (this.a) {
            case 22:
                Point point = hl.q;
                if (point.x > point.y) {
                    ((uj3) this.c).finishPreviewFragment();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final ei0 g() {
        if (((wo8) this.b) != null) {
            return new ei0(this);
        }
        p3d.h("ProductDetails is required for constructing ProductDetailsParams.");
        return null;
    }

    @Override
    public final Object mo21get() {
        Context context = (Context) ((aj3) this.b).b;
        mx2 mx2Var = (mx2) ((aj3) this.c).b;
        context.getClass();
        mx2Var.getClass();
        return ij4.a(sjf.d, new j09(new nx2((byte) 1), (byte) 3), xde.a(mx2Var), new hj4(context, (byte) 0));
    }

    @Override
    public final CharSequence getContentDescription() {
        return null;
    }

    @Override
    public final void h(float f2) {
        switch (this.a) {
            case 22:
                Point point = hl.q;
                if (point.x > point.y) {
                    ((uj3) this.c).movePreviewFragment(f2);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final int i0() {
        return 0;
    }

    @Override
    public final java.lang.Object k(defpackage.nm4 r7, defpackage.zw2 r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qx6.k(nm4, zw2):java.lang.Object");
    }

    @Override
    public final void l() {
        ((fu5) this.b).u();
        zu1 zu1Var = (zu1) this.c;
        zu1Var.Hc(true);
        d31.A(zu1Var, zu1Var.getMessagesController().p2(zu1Var.l6, zu1Var.c(), null), zu1Var.Ba).j();
    }

    @Override
    public final void m() {
        ((fu5) this.b).u();
        zu1 zu1Var = (zu1) this.c;
        if (zu1Var.l6 != 0 && zu1Var.g4 != 3) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", zu1Var.l6);
            if (zu1Var.c() != 0) {
                bundle.putLong("topic_id", zu1Var.c());
            }
            zu1Var.presentFragment(new zu8(bundle, zu1Var.Ba));
        }
    }

    public final boolean n(int i) {
        return ((lk4) this.b).a.get(i);
    }

    @Override
    public final void o(boolean z, float f2) {
        yk0.m1 = f2;
        ((TextView) this.b).setText("Saturation " + (f2 * 5.0f));
        wma wmaVar = ((yk0) this.c).l1;
        wmaVar.M();
        wmaVar.K();
    }

    @Override
    public final void p() {
        int i;
        ((fu5) this.b).u();
        zu1 zu1Var = (zu1) this.c;
        i = ((e) zu1Var).currentAccount;
        SharedPreferences sharedPreferences = uc7.s1(i).X3;
        boolean z = sharedPreferences.getBoolean("sound_enabled_" + ip7.p(zu1Var.l6, zu1Var.c(), false), true);
        boolean z2 = !z ? 1 : 0;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("sound_enabled_" + ip7.p(zu1Var.l6, zu1Var.c(), false), z2).apply();
        if (d31.a(zu1Var)) {
            d31.S(z ? 1 : 0, zu1Var.getResourceProvider(), zu1Var).j();
        }
        zu1Var.yd(false);
    }

    @Override
    public final void q(int i) {
        ((fu5) this.b).u();
        zu1 zu1Var = (zu1) this.c;
        if (i == 0) {
            if (zu1Var.getMessagesController().p2(zu1Var.l6, zu1Var.c(), null)) {
                zu1Var.Hc(true);
            }
            if (d31.a(zu1Var)) {
                d31.z(zu1Var, 4, i, zu1Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        zu1Var.getNotificationsController().H(zu1Var.l6, i, zu1Var.c());
        if (d31.a(zu1Var)) {
            d31.z(zu1Var, 5, i, zu1Var.getResourceProvider()).j();
        }
    }

    public final int s(int i, int i2, CharSequence charSequence) {
        boolean z;
        int i3;
        int i4;
        int i5;
        boolean z2;
        int i6;
        int i7;
        int i8;
        int i9;
        String str;
        int i10 = ((int[][]) this.b)[ik8.F(i)][i2];
        if (i10 > 0) {
            return i10;
        }
        int i11 = i2 + 1;
        if (i11 >= charSequence.length()) {
            z = true;
        } else {
            z = false;
        }
        int[] iArr = {1, 2};
        int i12 = 0;
        int i13 = Integer.MAX_VALUE;
        int i14 = 5;
        for (int i15 = 1; i12 <= i15; i15 = 1) {
            if (j(iArr[i12], i2, charSequence)) {
                int i16 = iArr[i12];
                if (i != i16) {
                    z2 = z;
                    if (i16 != i15) {
                        if (i16 != 2) {
                            if (i16 != 3) {
                                i6 = 4;
                                if (i16 == 4) {
                                    str = "NONE";
                                } else {
                                    throw null;
                                }
                            } else {
                                i6 = 4;
                                str = "C";
                            }
                        } else {
                            i6 = 4;
                            str = "B";
                        }
                    } else {
                        i6 = 4;
                        str = "A";
                    }
                    if (str.equals("A")) {
                        i8 = 1;
                    } else if (str.equals("B")) {
                        i8 = 2;
                    } else if (str.equals("C")) {
                        i8 = 3;
                    } else if (str.equals("SHIFT")) {
                        i8 = i6;
                    } else if (str.equals("NONE")) {
                        i8 = 5;
                    } else {
                        lq5.j("No enum constant com.google.zxing.oned.Code128Writer.MinimalEncoder.Latch.".concat(str));
                        i8 = 0;
                    }
                    i7 = 2;
                } else {
                    z2 = z;
                    i6 = 4;
                    i7 = 1;
                    i8 = 5;
                }
                if (!z2) {
                    i7 += s(iArr[i12], i11, charSequence);
                }
                if (i7 < i13) {
                    i13 = i7;
                    i14 = i8;
                }
                if (i == iArr[(i12 + 1) % 2]) {
                    if (!z2) {
                        i9 = s(i, i11, charSequence) + 2;
                    } else {
                        i9 = 2;
                    }
                    if (i9 < i13) {
                        i13 = i9;
                        i14 = i6;
                    }
                }
            } else {
                z2 = z;
            }
            i12++;
            z = z2;
        }
        if (j(3, i2, charSequence)) {
            if (i != 3) {
                i4 = 3;
                i3 = 2;
            } else {
                i3 = 1;
                i4 = 5;
            }
            if (charSequence.charAt(i2) == 241) {
                i5 = 1;
            } else {
                i5 = 2;
            }
            int i17 = i2 + i5;
            if (i17 < charSequence.length()) {
                i3 += s(3, i17, charSequence);
            }
            if (i3 < i13) {
                i13 = i3;
                i14 = i4;
            }
        }
        if (i13 != Integer.MAX_VALUE) {
            ((int[][]) this.b)[ik8.F(i)][i2] = i13;
            ((int[][]) this.c)[ik8.F(i)][i2] = i14;
            return i13;
        }
        xi4.g(charSequence.charAt(i2), "Bad character in input: ASCII value=");
        return 0;
    }

    public final byte[] t(f54 f54Var) {
        DataOutputStream dataOutputStream = (DataOutputStream) this.c;
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.b;
        byteArrayOutputStream.reset();
        try {
            dataOutputStream.writeBytes(f54Var.a);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeBytes(f54Var.b);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(f54Var.c);
            dataOutputStream.writeLong(f54Var.d);
            dataOutputStream.write(f54Var.e);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e2) {
            grb.m(e2);
            return null;
        }
    }

    @Override
    public final Task then(Object obj) {
        Boolean bool = (Boolean) obj;
        yy2 yy2Var = (yy2) this.c;
        if (!bool.booleanValue()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
            }
            gd4 gd4Var = yy2Var.g;
            for (File file : gd4.e(((File) gd4Var.c).listFiles(yy2.r))) {
                file.delete();
            }
            gd4 gd4Var2 = yy2Var.m.b.b;
            g03.b(gd4.e(((File) gd4Var2.e).listFiles()));
            g03.b(gd4.e(((File) gd4Var2.f).listFiles()));
            g03.b(gd4.e(((File) gd4Var2.g).listFiles()));
            yy2Var.q.trySetResult(null);
            return Tasks.forResult(null);
        }
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
        }
        boolean booleanValue = bool.booleanValue();
        p63 p63Var = yy2Var.b;
        if (booleanValue) {
            p63Var.h.trySetResult(null);
            return ((Task) this.b).onSuccessTask((i03) yy2Var.e.b, new ri6(this, (byte) 21));
        }
        grb.i("An invalid data collection token was used.");
        return null;
    }

    public final KeyListener u(KeyListener keyListener) {
        if (!(keyListener instanceof NumberKeyListener)) {
            if (keyListener instanceof ox3) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            if (keyListener instanceof NumberKeyListener) {
                return keyListener;
            }
            return new ox3(keyListener);
        }
        return keyListener;
    }

    public final boolean w(CharSequence charSequence, int i, int i2, px3 px3Var) {
        byte b;
        if (px3Var.c == 0) {
            eb3 eb3Var = (eb3) this.c;
            yf7 b2 = px3Var.b();
            int a = b2.a(8);
            if (a != 0) {
                b2.b.getShort(a + b2.a);
            }
            eb3Var.getClass();
            ThreadLocal threadLocal = eb3.b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = eb3Var.a;
            String sb2 = sb.toString();
            int i3 = hv7.a;
            if (textPaint.hasGlyph(sb2)) {
                b = 2;
            } else {
                b = 1;
            }
            px3Var.c = b;
        }
        if (px3Var.c != 2) {
            return false;
        }
        return true;
    }

    public final void y(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = ((EditText) this.b).getContext().obtainStyledAttributes(attributeSet, w19.i, i, 0);
        try {
            boolean z = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            L(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final lx3 z(InputConnection inputConnection, EditorInfo editorInfo) {
        InputConnection inputConnection2;
        ri6 ri6Var = (ri6) this.c;
        if (inputConnection == null) {
            inputConnection2 = null;
        } else {
            lh2 lh2Var = (lh2) ri6Var.b;
            if (!(inputConnection instanceof lx3)) {
                inputConnection = new lx3((EditText) lh2Var.b, inputConnection, editorInfo);
            }
            inputConnection2 = inputConnection;
        }
        return (lx3) inputConnection2;
    }

    private final void A() {
    }

    @Override
    public final void i() {
    }

    @Override
    public final void x() {
    }

    private final void B(float f2) {
    }

    public qx6(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public qx6(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public qx6(byte b) {
        this.a = b;
        switch (b) {
            case 6:
                this.b = ByteBuffer.allocateDirect(500);
                return;
            case 19:
                this.b = new HashSet();
                return;
            case 25:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.b = byteArrayOutputStream;
                this.c = new DataOutputStream(byteArrayOutputStream);
                return;
            default:
                this.b = DesugarCollections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
                this.c = new b7d(this);
                return;
        }
    }

    public qx6(EditText editText) {
        this.a = (byte) 4;
        this.b = editText;
        this.c = new ri6(editText);
    }

    public qx6(Context context, byte b) {
        this.a = b;
        switch (b) {
            case 21:
                this.b = context;
                this.c = null;
                return;
            default:
                this.b = context;
                this.c = new ic((byte) 1);
                return;
        }
    }

    public qx6(f73 f73Var) {
        this.a = (byte) 18;
        n31 n31Var = new n31((byte) 0);
        n31Var.c = new uif((byte) 17);
        this.c = n31Var;
        this.b = f73Var;
    }

    public qx6(lk4 lk4Var, SparseArray sparseArray) {
        this.a = (byte) 3;
        this.b = lk4Var;
        SparseBooleanArray sparseBooleanArray = lk4Var.a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i = 0; i < sparseBooleanArray.size(); i++) {
            int a = lk4Var.a(i);
            uj ujVar = (uj) sparseArray.get(a);
            ujVar.getClass();
            sparseArray2.append(a, ujVar);
        }
        this.c = sparseArray2;
    }

    public qx6(u8a u8aVar, rj2 rj2Var, eb3 eb3Var) {
        this.a = (byte) 24;
        this.b = u8aVar;
        this.c = eb3Var;
    }

    public qx6(pd3 pd3Var) {
        this.a = (byte) 20;
        this.c = pd3Var;
    }

    public qx6(byte b, boolean z) {
        this.a = b;
    }

    public qx6(ru3 ru3Var) {
        this.a = (byte) 23;
        this.c = ru3Var;
        this.b = new Rect();
    }
}
