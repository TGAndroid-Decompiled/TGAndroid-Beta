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
import android.net.Uri;
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
import org.telegram.ui.ActionBar.d;
public final class lv6 implements zu9, xb2, lo2, SuccessContinuation, f39, bv7, hk4 {
    public static oyc e;
    public final byte a;
    public Object b;
    public Object c;
    public static final Object d = new Object();
    public static final Status f = new Status(8, "The connection to Google Play services was lost", null, null);

    public lv6(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        bv6 bv6Var;
        int i;
        this.a = (byte) 0;
        ComponentName componentName2 = null;
        if (!TextUtils.isEmpty(str)) {
            if (componentName == null) {
                int i2 = gy6.b;
                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                intent.setPackage(context.getPackageName());
                List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
                if (queryBroadcastReceivers.size() == 1) {
                    ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
                    componentName2 = new ComponentName(activityInfo.packageName, activityInfo.name);
                } else if (queryBroadcastReceivers.size() > 1) {
                    lad.f("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
                }
                componentName = componentName2;
                if (componentName == null) {
                    lad.e("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
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
                bv6Var = new bv6(context, str, bundle);
                this.b = bv6Var;
            } else if (i3 >= 29) {
                bv6Var = new bv6(context, str, bundle);
                this.b = bv6Var;
            } else if (i3 >= 28) {
                bv6Var = new bv6(context, str, bundle);
                this.b = bv6Var;
            } else {
                bv6Var = new bv6(context, str, bundle);
                this.b = bv6Var;
            }
            Looper myLooper = Looper.myLooper();
            H(new yu6((byte) 0), new Handler(myLooper == null ? Looper.getMainLooper() : myLooper));
            bv6Var.a.setMediaButtonReceiver(pendingIntent);
            kv6 kv6Var = ((bv6) this.b).c;
            ?? obj = new Object();
            DesugarCollections.synchronizedSet(new HashSet());
            if (Build.VERSION.SDK_INT >= 29) {
                obj.a = new tm6(context, kv6Var);
            } else {
                obj.a = new tm6(context, kv6Var);
            }
            this.c = obj;
            return;
        }
        w26.j("tag must not be null or empty");
        throw null;
    }

    public static void b(ArrayList arrayList, int i, int[] iArr, int[] iArr2, int i2) {
        arrayList.add(y53.a[i]);
        if (i2 != 0) {
            iArr2[0] = iArr2[0] + 1;
        }
        iArr[0] = (i * iArr2[0]) + iArr[0];
    }

    public static Task c(Context context, Intent intent, boolean z) {
        oyc oycVar;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (d) {
            oycVar = e;
            if (oycVar == null) {
                oycVar = new oyc(context);
                e = oycVar;
            }
        }
        if (z) {
            if (c5a.t().z(context)) {
                kdd.c(context, oycVar, intent);
            } else {
                oycVar.b(intent);
            }
            return Tasks.forResult(-1);
        }
        return oycVar.b(intent).continueWith(new hc((byte) 1), new w44((byte) 9));
    }

    public static boolean k(int r7, int r8, java.lang.CharSequence r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lv6.k(int, int, java.lang.CharSequence):boolean");
    }

    public static boolean o(Editable editable, KeyEvent keyEvent, boolean z) {
        y3c[] y3cVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (y3cVarArr = (y3c[]) editable.getSpans(selectionStart, selectionEnd, y3c.class)) != null && y3cVarArr.length > 0) {
                for (y3c y3cVar : y3cVarArr) {
                    int spanStart = editable.getSpanStart(y3cVar);
                    int spanEnd = editable.getSpanEnd(y3cVar);
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

    public static boolean t(defpackage.qw3 r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lv6.t(qw3, android.text.Editable, int, int, boolean):boolean");
    }

    public final void B(long j, byte[] bArr) {
        File file;
        u20 u20Var = (u20) this.c;
        if (u20Var.a) {
            u20Var.a = false;
            ((h30) u20Var.e).h();
            return;
        }
        h30 h30Var = (h30) u20Var.e;
        h30Var.getClass();
        h30.q();
        f30 f30Var = h30Var.z;
        if (h30Var.G == 5 && f30Var != null) {
            file = f30Var.b;
        } else {
            file = null;
        }
        ml6 ml6Var = (ml6) this.b;
        if (file == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Preview file is unavailable");
            MediaController mediaController = ml6Var.a;
            String[] strArr = MediaController.W1;
            fa4.e("AudioRecorderV2 failed", illegalStateException);
            kk7.f(mediaController.i1).k(kk7.l2, Integer.valueOf(mediaController.h1));
            mediaController.s(false);
            return;
        }
        MediaController mediaController2 = ml6Var.a;
        mediaController2.k1 = file;
        mediaController2.l1 = j;
        mediaController2.F0(file, j, bArr);
        hq6.d0(mediaController2.i1).D1(mediaController2.n1, mediaController2.o1, cq6.a(mediaController2, file.getAbsolutePath(), mediaController2.K1));
        kk7.f(mediaController2.i1).k(kk7.n2, new Object[0]);
        kk7.f(mediaController2.i1).k(kk7.r2, Integer.valueOf(mediaController2.h1), mediaController2.g1, file.getAbsolutePath());
        mediaController2.X(false);
        MediaController.i0(false);
    }

    public final void D(Exception exc, boolean z) {
        int i;
        this.c = null;
        HashSet hashSet = (HashSet) this.b;
        mm5 q = mm5.q(hashSet);
        hashSet.clear();
        km5 listIterator = q.listIterator(0);
        while (listIterator.hasNext()) {
            aa3 aa3Var = (aa3) listIterator.next();
            aa3Var.getClass();
            if (z) {
                i = 1;
            } else {
                i = 3;
            }
            aa3Var.l(i, exc);
        }
    }

    public final void E(ul4 ul4Var) {
        yi0 yi0Var = (yi0) this.c;
        u39 u39Var = (u39) this.b;
        int i = ul4Var.b;
        if (i == 0) {
            yi0Var.execute(new rld(u39Var, ul4Var.a, (byte) 3));
        } else {
            yi0Var.execute(new sv(u39Var, i));
        }
    }

    public final Task F(Intent intent) {
        boolean z;
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        boolean z2 = false;
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        Context context = (Context) this.b;
        hc hcVar = (hc) this.c;
        if (xqe.a() && context.getApplicationInfo().targetSdkVersion >= 26) {
            z = true;
        } else {
            z = false;
        }
        if ((intent.getFlags() & 268435456) != 0) {
            z2 = true;
        }
        if (z && !z2) {
            return c(context, intent, z2);
        }
        return Tasks.call(hcVar, new p63(context, intent, (byte) 3)).continueWithTask(hcVar, new ch(context, intent, z2, (byte) 7));
    }

    public final void G(aa3 aa3Var) {
        ((HashSet) this.b).add(aa3Var);
        if (((aa3) this.c) != null) {
            return;
        }
        this.c = aa3Var;
        h54 c = aa3Var.b.c();
        aa3Var.z = c;
        y93 y93Var = aa3Var.s;
        String str = g8c.a;
        c.getClass();
        y93Var.getClass();
        y93Var.obtainMessage(1, new z93(f86.h.getAndIncrement(), true, SystemClock.elapsedRealtime(), c)).sendToTarget();
    }

    public final void H(yu6 yu6Var, Handler handler) {
        bv6 bv6Var = (bv6) this.b;
        synchronized (bv6Var.d) {
            bv6Var.l = yu6Var;
            bv6Var.a.setCallback((xu6) yu6Var.e, handler);
            yu6Var.d0(bv6Var, handler);
        }
    }

    public final void I(boolean z) {
        gy3 gy3Var = (gy3) ((tg2) ((qx4) this.c).a).c;
        if (gy3Var.c != z) {
            if (gy3Var.b != null) {
                lw3 a = lw3.a();
                fy3 fy3Var = gy3Var.b;
                a.getClass();
                kre.a(fy3Var, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a.a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a.b.remove(fy3Var);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            gy3Var.c = z;
            if (z) {
                gy3.a(gy3Var.a, lw3.a().b());
            }
        }
    }

    public final void J(kr6 kr6Var) {
        bv6 bv6Var = (bv6) this.b;
        bv6Var.i = kr6Var;
        MediaSession mediaSession = bv6Var.a;
        Bundle bundle = kr6Var.a;
        MediaMetadata mediaMetadata = kr6Var.b;
        if (mediaMetadata == null) {
            MediaMetadata.Builder builder = new MediaMetadata.Builder();
            try {
                for (String str : bundle.keySet()) {
                    Integer num = (Integer) kr6.c.get(str);
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
                lad.g("MediaMetadata", "Failed to convert MediaMetadataCompat to MediaMetadata", e2);
            }
            mediaMetadata = builder.build();
            kr6Var.b = mediaMetadata;
        }
        mediaSession.setMetadata(mediaMetadata);
    }

    public final void K(dc8 dc8Var) {
        RemoteCallbackList remoteCallbackList;
        bv6 bv6Var = (bv6) this.b;
        bv6Var.g = dc8Var;
        synchronized (bv6Var.d) {
            int beginBroadcast = bv6Var.f.beginBroadcast() - 1;
            while (true) {
                remoteCallbackList = bv6Var.f;
                if (beginBroadcast < 0) {
                    break;
                }
                try {
                    ((hi5) remoteCallbackList.getBroadcastItem(beginBroadcast)).j(dc8Var);
                } catch (RemoteException | SecurityException e2) {
                    lad.d("MediaSessionCompat", "Dead object in setPlaybackState.", e2);
                }
                beginBroadcast--;
            }
            remoteCallbackList.finishBroadcast();
        }
        MediaSession mediaSession = bv6Var.a;
        PlaybackState playbackState = dc8Var.x;
        if (playbackState == null) {
            PlaybackState.Builder builder = new PlaybackState.Builder();
            builder.setState(dc8Var.a, dc8Var.b, dc8Var.d, dc8Var.n);
            builder.setBufferedPosition(dc8Var.c);
            builder.setActions(dc8Var.e);
            builder.setErrorMessage(dc8Var.h);
            for (cc8 cc8Var : dc8Var.r) {
                cc8Var.getClass();
                PlaybackState.CustomAction.Builder builder2 = new PlaybackState.CustomAction.Builder(cc8Var.a, cc8Var.b, cc8Var.c);
                builder2.setExtras(cc8Var.d);
                PlaybackState.CustomAction build = builder2.build();
                if (build != null) {
                    builder.addCustomAction(build);
                }
            }
            builder.setActiveQueueItemId(dc8Var.s);
            builder.setExtras(dc8Var.w);
            playbackState = builder.build();
            dc8Var.x = playbackState;
        }
        mediaSession.setPlaybackState(playbackState);
    }

    public final void L(kl8 kl8Var) {
        this.b = kl8Var;
        if (kl8Var.a() != null) {
            kl8Var.a().getClass();
            String str = kl8Var.a().d;
            if (str != null) {
                this.c = str;
            }
        }
    }

    public final void M(ArrayList arrayList) {
        int i = 0;
        if (arrayList != null) {
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                long j = ((jv6) obj).b;
                if (hashSet.contains(Long.valueOf(j))) {
                    lad.d("MediaSessionCompat", ls6.n(j, "Found duplicate queue id: "), new IllegalArgumentException("id of each queue item should be unique"));
                }
                hashSet.add(Long.valueOf(j));
            }
        }
        bv6 bv6Var = (bv6) this.b;
        MediaSession mediaSession = bv6Var.a;
        bv6Var.h = arrayList;
        if (arrayList == null) {
            mediaSession.setQueue(null);
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj2 = arrayList.get(i);
            i++;
            jv6 jv6Var = (jv6) obj2;
            MediaSession.QueueItem queueItem = jv6Var.c;
            if (queueItem == null) {
                MediaSession.QueueItem queueItem2 = new MediaSession.QueueItem(jv6Var.a.a(), jv6Var.b);
                jv6Var.c = queueItem2;
                queueItem = queueItem2;
            }
            arrayList2.add(queueItem);
        }
        mediaSession.setQueue(arrayList2);
    }

    public final void N(ArrayList arrayList) {
        fo7 fo7Var;
        for (int i = 0; i < arrayList.size(); i++) {
            if (((eo7) arrayList.get(i)).a == 1) {
                try {
                    fo7Var = new fo7((eo7) arrayList.get(i));
                } catch (do7 unused) {
                    fo7Var = null;
                }
                this.c = fo7Var;
            }
        }
    }

    public final void O() {
        BasePendingResult[] basePendingResultArr;
        boolean f2;
        Set set = (Set) this.b;
        for (BasePendingResult basePendingResult : (BasePendingResult[]) set.toArray(new BasePendingResult[0])) {
            basePendingResult.g.set(null);
            synchronized (basePendingResult.a) {
                if (((gy4) basePendingResult.c.get()) == null || !basePendingResult.m) {
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
    public final void U0() {
        eo2 eo2Var = (eo2) this.c;
        eo2Var.v1.d.g3.O(true);
        eo2Var.u1.d.g3.O(true);
    }

    @Override
    public final int a0() {
        return 0;
    }

    @Override
    public final void close() {
        ((eo2) this.c).n1.E(0);
    }

    public final di0 d() {
        if (((kl8) this.b) != null) {
            return new di0(this);
        }
        fvc.f("ProductDetails is required for constructing ProductDetailsParams.");
        return null;
    }

    @Override
    public final void dismiss() {
        ((cs5) this.b).u();
    }

    @Override
    public final boolean mo8e(float f2, float f3, int i, View view) {
        switch (this.a) {
            case 22:
                cj3 cj3Var = (cj3) this.c;
                if (view instanceof ue3) {
                    ue3 ue3Var = (ue3) view;
                    if (ue3Var.o2) {
                        cj3Var.e5(ue3Var.getDialogId(), view);
                        return true;
                    }
                }
                qi3 qi3Var = cj3Var.A0;
                if (qi3Var != null && qi3Var.getVisibility() == 0 && cj3Var.A0.n) {
                    return false;
                }
                return cj3Var.z4(view, i, f2, ((bj3) this.b).d);
            default:
                Rect rect = (Rect) this.b;
                zt3 zt3Var = (zt3) this.c;
                if (zt3Var.getParentActivity() != null && (view instanceof za5)) {
                    ((ImageView) view.getTag(2131296587)).getHitRect(rect);
                    if (!rect.contains((int) f2, (int) f3)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zt3Var.getParentActivity());
                        alertDialog$Builder.e(new CharSequence[]{k96.M0(2131751586, null)}, new ut3(this, i, (byte) 0));
                        zt3Var.showDialog(alertDialog$Builder.a);
                        return true;
                    }
                }
                return false;
        }
    }

    @Override
    public final void f() {
        switch (this.a) {
            case 22:
                Point point = gl.q;
                if (point.x > point.y) {
                    ((cj3) this.c).finishPreviewFragment();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void g(float f2) {
        switch (this.a) {
            case 22:
                Point point = gl.q;
                if (point.x > point.y) {
                    ((cj3) this.c).movePreviewFragment(f2);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final CharSequence getContentDescription() {
        return null;
    }

    @Override
    public final java.lang.Object h(defpackage.ik4 r7, defpackage.fw2 r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lv6.h(ik4, fw2):java.lang.Object");
    }

    @Override
    public final void h0(long j) {
        ((d) this.b).presentFragment(mu1.W9(j));
        ((eo2) this.c).dismiss();
    }

    @Override
    public final void i() {
        ((cs5) this.b).u();
        mu1 mu1Var = (mu1) this.c;
        mu1Var.vc(true);
        u21.A(mu1Var, mu1Var.getMessagesController().n2(mu1Var.l6, mu1Var.d(), null), mu1Var.Ba).j();
    }

    @Override
    public final void j(boolean z, float f2) {
        xk0.m1 = f2;
        ((TextView) this.b).setText("Saturation " + (f2 * 5.0f));
        cja cjaVar = ((xk0) this.c).l1;
        cjaVar.M();
        cjaVar.K();
    }

    @Override
    public final void l() {
        ((cs5) this.b).u();
        mu1 mu1Var = (mu1) this.c;
        if (mu1Var.l6 != 0 && mu1Var.g4 != 3) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", mu1Var.l6);
            if (mu1Var.d() != 0) {
                bundle.putLong("topic_id", mu1Var.d());
            }
            mu1Var.presentFragment(new pr8(bundle, mu1Var.Ba));
        }
    }

    public final boolean m(int i) {
        return ((gi4) this.b).a.get(i);
    }

    @Override
    public final void n() {
        ((cs5) this.b).u();
        mu1 mu1Var = (mu1) this.c;
        SharedPreferences sharedPreferences = na7.q1(mu1.N0(mu1Var)).W3;
        boolean z = sharedPreferences.getBoolean("sound_enabled_" + im7.p(mu1Var.l6, mu1Var.d(), false), true);
        boolean z2 = !z ? 1 : 0;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("sound_enabled_" + im7.p(mu1Var.l6, mu1Var.d(), false), z2).apply();
        if (u21.a(mu1Var)) {
            u21.S(z ? 1 : 0, mu1Var.getResourceProvider(), mu1Var).j();
        }
        mu1Var.md(false);
    }

    @Override
    public final void p(int i) {
        ((cs5) this.b).u();
        mu1 mu1Var = (mu1) this.c;
        if (i == 0) {
            if (mu1Var.getMessagesController().n2(mu1Var.l6, mu1Var.d(), null)) {
                mu1Var.vc(true);
            }
            if (u21.a(mu1Var)) {
                u21.z(mu1Var, 4, i, mu1Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        mu1Var.getNotificationsController().H(mu1Var.l6, i, mu1Var.d());
        if (u21.a(mu1Var)) {
            u21.z(mu1Var, 5, i, mu1Var.getResourceProvider()).j();
        }
    }

    public final int q(int i, int i2, CharSequence charSequence) {
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
        int i10 = ((int[][]) this.b)[ug8.F(i)][i2];
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
            if (k(iArr[i12], i2, charSequence)) {
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
                        w26.j("No enum constant com.google.zxing.oned.Code128Writer.MinimalEncoder.Latch.".concat(str));
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
                    i7 += q(iArr[i12], i11, charSequence);
                }
                if (i7 < i13) {
                    i13 = i7;
                    i14 = i8;
                }
                if (i == iArr[(i12 + 1) % 2]) {
                    if (!z2) {
                        i9 = q(i, i11, charSequence) + 2;
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
        if (k(3, i2, charSequence)) {
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
                i3 += q(3, i17, charSequence);
            }
            if (i3 < i13) {
                i13 = i3;
                i14 = i4;
            }
        }
        if (i13 != Integer.MAX_VALUE) {
            ((int[][]) this.b)[ug8.F(i)][i2] = i13;
            ((int[][]) this.c)[ug8.F(i)][i2] = i14;
            return i13;
        }
        wn4.g(charSequence.charAt(i2), "Bad character in input: ASCII value=");
        return 0;
    }

    public final byte[] r(j44 j44Var) {
        DataOutputStream dataOutputStream = (DataOutputStream) this.c;
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.b;
        byteArrayOutputStream.reset();
        try {
            dataOutputStream.writeBytes(j44Var.a);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeBytes(j44Var.b);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(j44Var.c);
            dataOutputStream.writeLong(j44Var.d);
            dataOutputStream.write(j44Var.e);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e2) {
            sdb.b(e2);
            return null;
        }
    }

    public final KeyListener s(KeyListener keyListener) {
        if (!(keyListener instanceof NumberKeyListener)) {
            if (keyListener instanceof tw3) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            if (keyListener instanceof NumberKeyListener) {
                return keyListener;
            }
            return new tw3(keyListener);
        }
        return keyListener;
    }

    @Override
    public final Task then(Object obj) {
        Boolean bool = (Boolean) obj;
        dy2 dy2Var = (dy2) this.c;
        if (!bool.booleanValue()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
            }
            jb4 jb4Var = dy2Var.g;
            for (File file : jb4.e(((File) jb4Var.c).listFiles(dy2.r))) {
                file.delete();
            }
            jb4 jb4Var2 = dy2Var.m.b.b;
            nz2.b(jb4.e(((File) jb4Var2.e).listFiles()));
            nz2.b(jb4.e(((File) jb4Var2.f).listFiles()));
            nz2.b(jb4.e(((File) jb4Var2.g).listFiles()));
            dy2Var.q.trySetResult(null);
            return Tasks.forResult(null);
        }
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
        }
        boolean booleanValue = bool.booleanValue();
        w53 w53Var = dy2Var.b;
        if (booleanValue) {
            w53Var.h.trySetResult(null);
            return ((Task) this.b).onSuccessTask((pz2) dy2Var.e.b, new qx4(this));
        }
        sc8.j("An invalid data collection token was used.");
        return null;
    }

    public final boolean u(CharSequence charSequence, int i, int i2, uw3 uw3Var) {
        byte b;
        if (uw3Var.c == 0) {
            la3 la3Var = (la3) this.c;
            od7 b2 = uw3Var.b();
            int a = b2.a(8);
            if (a != 0) {
                b2.b.getShort(a + b2.a);
            }
            la3Var.getClass();
            ThreadLocal threadLocal = la3.b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = la3Var.a;
            String sb2 = sb.toString();
            int i3 = bs7.a;
            if (textPaint.hasGlyph(sb2)) {
                b = 2;
            } else {
                b = 1;
            }
            uw3Var.c = b;
        }
        if (uw3Var.c != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final Object v(Uri uri, s63 s63Var) {
        ie4 ie4Var = (ie4) ((bv7) this.b).v(uri, s63Var);
        List list = (List) this.c;
        if (list != null && !list.isEmpty()) {
            return (ie4) ie4Var.a(list);
        }
        return ie4Var;
    }

    public final void w(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = ((EditText) this.b).getContext().obtainStyledAttributes(attributeSet, jy8.i, i, 0);
        try {
            boolean z = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            I(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final qw3 x(InputConnection inputConnection, EditorInfo editorInfo) {
        InputConnection inputConnection2;
        qx4 qx4Var = (qx4) this.c;
        if (inputConnection == null) {
            inputConnection2 = null;
        } else {
            tg2 tg2Var = (tg2) qx4Var.a;
            if (!(inputConnection instanceof qw3)) {
                inputConnection = new qw3((EditText) tg2Var.b, inputConnection, editorInfo);
            }
            inputConnection2 = inputConnection;
        }
        return (qw3) inputConnection2;
    }

    private final void z() {
    }

    @Override
    public final void a() {
    }

    @Override
    public final void y() {
    }

    private final void A(float f2) {
    }

    public lv6(Object obj, byte b) {
        this.a = b;
        this.b = obj;
        this.c = null;
    }

    public lv6(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public lv6(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public lv6(byte b) {
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
                this.c = new k2d(this);
                return;
        }
    }

    public lv6(EditText editText) {
        this.a = (byte) 4;
        this.b = editText;
        this.c = new qx4(editText);
    }

    public lv6(Context context) {
        this.a = (byte) 1;
        this.b = context;
        this.c = new hc((byte) 1);
    }

    public lv6(m63 m63Var) {
        this.a = (byte) 18;
        e31 e31Var = new e31((byte) 0);
        e31Var.c = new eef((byte) 17);
        this.c = e31Var;
        this.b = m63Var;
    }

    public lv6(gi4 gi4Var, SparseArray sparseArray) {
        this.a = (byte) 3;
        this.b = gi4Var;
        SparseBooleanArray sparseBooleanArray = gi4Var.a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i = 0; i < sparseBooleanArray.size(); i++) {
            int a = gi4Var.a(i);
            tj tjVar = (tj) sparseArray.get(a);
            tjVar.getClass();
            sparseArray2.append(a, tjVar);
        }
        this.c = sparseArray2;
    }

    public lv6(wtc wtcVar, vi2 vi2Var, la3 la3Var) {
        this.a = (byte) 24;
        this.b = wtcVar;
        this.c = la3Var;
    }

    public lv6(xc3 xc3Var) {
        this.a = (byte) 20;
        this.c = xc3Var;
    }

    public lv6(byte b, boolean z) {
        this.a = b;
    }

    public lv6(zt3 zt3Var) {
        this.a = (byte) 23;
        this.c = zt3Var;
        this.b = new Rect();
    }
}
