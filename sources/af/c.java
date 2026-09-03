package af;

import a4.k;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.media.MediaCodec;
import android.media.session.MediaController;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.l;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.Animation;
import androidx.emoji2.text.v;
import androidx.fragment.app.j0;
import androidx.fragment.app.s;
import b4.b0;
import b4.c0;
import b4.f0;
import b4.h0;
import b4.x;
import b4.y;
import b6.m;
import c2.g0;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.internal.cast.d1;
import com.google.android.gms.internal.cast.d2;
import com.google.android.gms.internal.cast.o;
import com.google.android.gms.internal.cast.p;
import com.google.android.gms.internal.cast.t;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.r;
import f2.l1;
import f2.p1;
import f2.q1;
import h5.d0;
import h5.w;
import h7.u;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.qc;
import org.telegram.ui.PhotoViewer;
public final class c implements r5.h, v4.f, r3.e, b0, xd.b, OnCompleteListener, com.google.android.gms.internal.clearcut.h, d4.j, a3.b {
    public static volatile c d;
    public final int f155a;
    public Object f156b;
    public Object f157c;

    public c(char c3, int i10) {
        this.f155a = i10;
    }

    public static c O() {
        c cVar;
        c cVar2 = d;
        if (cVar2 == null) {
            synchronized (c.class) {
                try {
                    cVar = d;
                    if (cVar == null) {
                        cVar = new c(0, (byte) 0);
                        d = cVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return cVar;
        }
        return cVar2;
    }

    public static af.c p(android.content.Context r5) {
        throw new UnsupportedOperationException("Method not decompiled: af.c.p(android.content.Context):af.c");
    }

    public static boolean v(Editable editable, KeyEvent keyEvent, boolean z4) {
        v[] vVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (vVarArr = (v[]) editable.getSpans(selectionStart, selectionEnd, v.class)) != null && vVarArr.length > 0) {
                for (v vVar : vVarArr) {
                    int spanStart = editable.getSpanStart(vVar);
                    int spanEnd = editable.getSpanEnd(vVar);
                    if ((z4 && spanStart == selectionStart) || ((!z4 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void A(s f10, boolean z4) {
        kotlin.jvm.internal.j.e(f10, "f");
        s sVar = ((j0) this.f156b).f886y;
        if (sVar != null) {
            sVar.p().f877o.A(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f157c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z4) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void B(s f10, boolean z4) {
        kotlin.jvm.internal.j.e(f10, "f");
        s sVar = ((j0) this.f156b).f886y;
        if (sVar != null) {
            sVar.p().f877o.B(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f157c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z4) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void C(s f10, boolean z4) {
        kotlin.jvm.internal.j.e(f10, "f");
        s sVar = ((j0) this.f156b).f886y;
        if (sVar != null) {
            sVar.p().f877o.C(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f157c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z4) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void D(s f10, boolean z4) {
        kotlin.jvm.internal.j.e(f10, "f");
        s sVar = ((j0) this.f156b).f886y;
        if (sVar != null) {
            sVar.p().f877o.D(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f157c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z4) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void E(s f10, boolean z4) {
        kotlin.jvm.internal.j.e(f10, "f");
        j0 j0Var = (j0) this.f156b;
        androidx.fragment.app.v vVar = j0Var.f884w.f970b;
        s sVar = j0Var.f886y;
        if (sVar != null) {
            sVar.p().f877o.E(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f157c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z4) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void F(s f10, boolean z4) {
        kotlin.jvm.internal.j.e(f10, "f");
        s sVar = ((j0) this.f156b).f886y;
        if (sVar != null) {
            sVar.p().f877o.F(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f157c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z4) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void G(s f10, boolean z4) {
        kotlin.jvm.internal.j.e(f10, "f");
        s sVar = ((j0) this.f156b).f886y;
        if (sVar != null) {
            sVar.p().f877o.G(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f157c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z4) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void H(s f10, Bundle bundle, boolean z4) {
        kotlin.jvm.internal.j.e(f10, "f");
        s sVar = ((j0) this.f156b).f886y;
        if (sVar != null) {
            sVar.p().f877o.H(f10, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f157c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z4) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void I(s f10, boolean z4) {
        kotlin.jvm.internal.j.e(f10, "f");
        s sVar = ((j0) this.f156b).f886y;
        if (sVar != null) {
            sVar.p().f877o.I(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f157c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z4) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void J(s f10, boolean z4) {
        kotlin.jvm.internal.j.e(f10, "f");
        s sVar = ((j0) this.f156b).f886y;
        if (sVar != null) {
            sVar.p().f877o.J(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f157c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z4) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void K(s f10, boolean z4) {
        kotlin.jvm.internal.j.e(f10, "f");
        s sVar = ((j0) this.f156b).f886y;
        if (sVar != null) {
            sVar.p().f877o.K(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f157c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z4) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    @Override
    public void L(int i10, float f10, float f11, xd.c cVar) {
        ch.i iVar = (ch.i) this.f157c;
        iVar.f2591c.a(f10);
        iVar.d.a(f10);
        iVar.f2590b.a(f10);
        ((Runnable) this.f156b).run();
    }

    public View M(int i10, int i11, int i12, int i13) {
        int i14;
        a5.b bVar = (a5.b) this.f157c;
        p1 p1Var = (p1) this.f156b;
        int j10 = p1Var.j();
        int s6 = p1Var.s();
        if (i11 > i10) {
            i14 = 1;
        } else {
            i14 = -1;
        }
        View view = null;
        while (i10 != i11) {
            View B = p1Var.B(i10);
            int f10 = p1Var.f(B);
            int E = p1Var.E(B);
            bVar.f99b = j10;
            bVar.f100c = s6;
            bVar.d = f10;
            bVar.e = E;
            if (i12 != 0) {
                bVar.f98a = i12;
                if (bVar.a()) {
                    return B;
                }
            }
            if (i13 != 0) {
                bVar.f98a = i13;
                if (bVar.a()) {
                    view = B;
                }
            }
            i10 += i14;
        }
        return view;
    }

    public File N() {
        if (((File) this.f156b) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f156b) == null) {
                        w8.g gVar = (w8.g) this.f157c;
                        gVar.a();
                        File filesDir = gVar.f46560a.getFilesDir();
                        this.f156b = new File(filesDir, "PersistedInstallation." + ((w8.g) this.f157c).d() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.f156b;
    }

    public PlaybackStateCompat P() {
        android.support.v4.media.session.h hVar = (android.support.v4.media.session.h) this.f156b;
        MediaSessionCompat$Token mediaSessionCompat$Token = hVar.e;
        if (mediaSessionCompat$Token.a() != null) {
            try {
                return mediaSessionCompat$Token.a().c();
            } catch (RemoteException e) {
                Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", e);
            }
        }
        PlaybackState playbackState = hVar.f275a.getPlaybackState();
        if (playbackState != null) {
            return PlaybackStateCompat.a(playbackState);
        }
        return null;
    }

    public String Q(String str) {
        Resources resources = (Resources) this.f156b;
        int identifier = resources.getIdentifier(str, "string", (String) this.f157c);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public l R() {
        MediaController.TransportControls transportControls = ((android.support.v4.media.session.h) this.f156b).f275a.getTransportControls();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            return new l(transportControls);
        }
        if (i10 >= 24) {
            return new l(transportControls);
        }
        if (i10 >= 23) {
            return new l(transportControls);
        }
        return new l(transportControls);
    }

    public boolean S(java.lang.CharSequence r10, int r11, int r12, androidx.emoji2.text.o r13) {
        throw new UnsupportedOperationException("Method not decompiled: af.c.S(java.lang.CharSequence, int, int, androidx.emoji2.text.o):boolean");
    }

    public void T(da.b bVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", bVar.f4287a);
            jSONObject.put("Status", m1.j.c(bVar.f4288b));
            jSONObject.put("AuthToken", bVar.f4289c);
            jSONObject.put("RefreshToken", bVar.d);
            jSONObject.put("TokenCreationEpochInSecs", bVar.f4290f);
            jSONObject.put("ExpiresInSecs", bVar.e);
            jSONObject.put("FisError", bVar.f4291g);
            w8.g gVar = (w8.g) this.f157c;
            gVar.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", gVar.f46560a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!createTempFile.renameTo(N())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public boolean U() {
        if (((b) ((d) this.f156b).d) != null) {
            return true;
        }
        return false;
    }

    public boolean W(View view) {
        a5.b bVar = (a5.b) this.f157c;
        p1 p1Var = (p1) this.f156b;
        int j10 = p1Var.j();
        int s6 = p1Var.s();
        int f10 = p1Var.f(view);
        int E = p1Var.E(view);
        bVar.f99b = j10;
        bVar.f100c = s6;
        bVar.d = f10;
        bVar.e = E;
        bVar.f98a = 24579;
        return bVar.a();
    }

    public c5.e X(l1 l1Var, int i10) {
        q1 q1Var;
        c5.e eVar;
        a0.f fVar = (a0.f) this.f156b;
        int c3 = fVar.c(l1Var);
        if (c3 >= 0 && (q1Var = (q1) fVar.h(c3)) != null) {
            int i11 = q1Var.f5813a;
            if ((i11 & i10) != 0) {
                int i12 = i11 & (~i10);
                q1Var.f5813a = i12;
                if (i10 == 4) {
                    eVar = q1Var.f5814b;
                } else if (i10 == 8) {
                    eVar = q1Var.f5815c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i12 & 12) == 0) {
                    fVar.f(c3);
                    q1Var.f5813a = 0;
                    q1Var.f5814b = null;
                    q1Var.f5815c = null;
                    q1.d.j(q1Var);
                }
                return eVar;
            }
        }
        return null;
    }

    public da.b Y() {
        JSONObject jSONObject;
        String str;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(N());
            while (true) {
                int read = fileInputStream.read(bArr, 0, 16384);
                if (read < 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String optString = jSONObject.optString("Fid", null);
        int optInt = jSONObject.optInt("Status", 0);
        String optString2 = jSONObject.optString("AuthToken", null);
        String optString3 = jSONObject.optString("RefreshToken", null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String optString4 = jSONObject.optString("FisError", null);
        int i10 = m1.j.d(5)[optInt];
        if (i10 != 0) {
            if (i10 == 0) {
                str = " registrationStatus";
            } else {
                str = "";
            }
            if (str.isEmpty()) {
                return new da.b(optString, i10, optString2, optString3, optLong2, optLong, optString4);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
        throw new NullPointerException("Null registrationStatus");
    }

    public void Z(androidx.mediarouter.app.s sVar) {
        if (sVar != null) {
            if (((ConcurrentHashMap) this.f157c).putIfAbsent(sVar, Boolean.TRUE) != null) {
                Log.w("MediaControllerCompat", "the callback has already been registered");
                return;
            }
            Handler handler = new Handler();
            sVar.f(handler);
            android.support.v4.media.session.h hVar = (android.support.v4.media.session.h) this.f156b;
            hVar.f275a.registerCallback(sVar.f1187a, handler);
            synchronized (hVar.f276b) {
                if (hVar.e.a() != null) {
                    android.support.v4.media.session.g gVar = new android.support.v4.media.session.g(sVar);
                    hVar.d.put(sVar, gVar);
                    sVar.f1189c = gVar;
                    try {
                        hVar.e.a().j(gVar);
                        sVar.e(13, null, null);
                    } catch (RemoteException e) {
                        Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                    }
                } else {
                    sVar.f1189c = null;
                    hVar.f277c.add(sVar);
                }
            }
            return;
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    @Override
    public void a(w wVar) {
        f0 f0Var = (f0) this.f157c;
        SparseArray sparseArray = f0Var.f1385f;
        h5.v vVar = (h5.v) this.f156b;
        if (wVar.u() == 0 && (wVar.u() & 128) != 0) {
            wVar.G(6);
            int a2 = wVar.a() / 4;
            for (int i10 = 0; i10 < a2; i10++) {
                wVar.e(0, 4, vVar.f6984b);
                vVar.p(0);
                int i11 = vVar.i(16);
                vVar.s(3);
                if (i11 == 0) {
                    vVar.s(13);
                } else {
                    int i12 = vVar.i(13);
                    if (sparseArray.get(i12) == null) {
                        sparseArray.put(i12, new c0(new k(f0Var, i12)));
                        f0Var.f1390l++;
                    }
                }
            }
            if (f0Var.f1382a != 2) {
                sparseArray.remove(0);
            }
        }
    }

    public void a0() {
        try {
            ((FileLock) this.f157c).release();
            ((FileChannel) this.f156b).close();
        } catch (IOException e) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
        }
    }

    @Override
    public r3.d b(r3.l lVar, long j10) {
        long position = lVar.getPosition();
        int min = (int) Math.min(20000L, lVar.getLength() - position);
        w wVar = (w) this.f157c;
        wVar.C(min);
        lVar.b(0, min, wVar.f6987a);
        int i10 = -1;
        long j11 = -9223372036854775807L;
        int i11 = -1;
        while (wVar.a() >= 4) {
            if (x.a(wVar.f6988b, wVar.f6987a) != 442) {
                wVar.G(1);
            } else {
                wVar.G(4);
                long c3 = y.c(wVar);
                if (c3 != -9223372036854775807L) {
                    long b10 = ((h5.c0) this.f156b).b(c3);
                    if (b10 > j10) {
                        if (j11 == -9223372036854775807L) {
                            return new r3.d(-1, b10, position);
                        }
                        return new r3.d(0, -9223372036854775807L, position + i11);
                    } else if (b10 + 100000 > j10) {
                        return new r3.d(0, -9223372036854775807L, position + wVar.f6988b);
                    } else {
                        j11 = b10;
                        i11 = wVar.f6988b;
                    }
                }
                int i12 = wVar.f6989c;
                if (wVar.a() < 10) {
                    wVar.F(i12);
                } else {
                    wVar.G(9);
                    int u10 = wVar.u() & 7;
                    if (wVar.a() < u10) {
                        wVar.F(i12);
                    } else {
                        wVar.G(u10);
                        if (wVar.a() < 4) {
                            wVar.F(i12);
                        } else {
                            if (x.a(wVar.f6988b, wVar.f6987a) == 443) {
                                wVar.G(4);
                                int z4 = wVar.z();
                                if (wVar.a() < z4) {
                                    wVar.F(i12);
                                } else {
                                    wVar.G(z4);
                                }
                            }
                            while (true) {
                                if (wVar.a() < 4) {
                                    break;
                                }
                                int a2 = x.a(wVar.f6988b, wVar.f6987a);
                                if (a2 == 442 || a2 == 441 || (a2 >>> 8) != 1) {
                                    break;
                                }
                                wVar.G(4);
                                if (wVar.a() < 2) {
                                    wVar.F(i12);
                                    break;
                                }
                                wVar.F(Math.min(wVar.f6989c, wVar.f6988b + wVar.z()));
                            }
                        }
                    }
                }
                i10 = wVar.f6988b;
            }
        }
        if (j11 != -9223372036854775807L) {
            return new r3.d(-2, j11, position + i10);
        }
        return r3.d.d;
    }

    public void b0(l1 l1Var) {
        q1 q1Var = (q1) ((a0.f) this.f156b).get(l1Var);
        if (q1Var == null) {
            return;
        }
        q1Var.f5813a &= -2;
    }

    public void c0(l1 l1Var) {
        a0.f fVar = (a0.f) this.f156b;
        a0.h hVar = (a0.h) this.f157c;
        int m9 = hVar.m() - 1;
        while (true) {
            if (m9 < 0) {
                break;
            } else if (l1Var == hVar.n(m9)) {
                Object[] objArr = hVar.f16c;
                Object obj = objArr[m9];
                Object obj2 = a0.i.f17a;
                if (obj != obj2) {
                    objArr[m9] = obj2;
                    hVar.f14a = true;
                }
            } else {
                m9--;
            }
        }
        q1 q1Var = (q1) fVar.get(l1Var);
        if (q1Var != null) {
            fVar.remove(l1Var);
            q1Var.f5813a = 0;
            q1Var.f5814b = null;
            q1Var.f5815c = null;
            q1.d.j(q1Var);
        }
    }

    @Override
    public void d(r5.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionResumeFailed " + ((r5.c) fVar).a() + " " + i10);
    }

    public void d0(j jVar) {
        g gVar;
        j jVar2;
        Log.d("CAST_CONTROLLER", "set current media");
        d dVar = (d) this.f156b;
        j jVar3 = (j) dVar.f160c;
        if (d1.f.u()) {
            if (jVar3 != null || jVar != null) {
                if (jVar3 != null) {
                    ArrayList arrayList = jVar3.f182a;
                    if (jVar != null && arrayList.size() == jVar.f182a.size()) {
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            i a2 = jVar3.a(i10);
                            i a10 = jVar.a(i10);
                            if ((a2 == null && a10 == null) || (a2 != null && a10 != null && Objects.equals(a2.f178a, a10.f178a) && Objects.equals(a2.f179b, a10.f179b) && Objects.equals(a2.f180c, a10.f180c) && Objects.equals(a2.d, a10.d) && a2.e == a10.e && a2.f181f == a10.f181f)) {
                            }
                        }
                        return;
                    }
                }
            } else {
                return;
            }
        }
        if (((b) dVar.d) != null && jVar != null) {
            dVar.d(jVar);
        }
        if (((b) dVar.d) != null && (jVar2 = (j) dVar.f160c) != null) {
            dVar.z(jVar2);
        }
        if (jVar != null && jVar.f182a.size() > 0 && !jVar.a(0).f178a.startsWith("audio/") && (gVar = (g) dVar.f159b) != null) {
            gVar.l(null, null);
        }
        b bVar = (b) dVar.d;
        if (bVar != null && jVar != null) {
            bVar.d = jVar;
            bVar.f154g = 0;
            bVar.h = 0;
            bVar.p();
        }
        dVar.f160c = jVar;
    }

    @Override
    public int e(long j10) {
        int i10;
        switch (this.f155a) {
            case 2:
                ArrayList arrayList = (ArrayList) this.f157c;
                Long valueOf = Long.valueOf(j10);
                int i11 = d0.f6924a;
                int binarySearch = Collections.binarySearch(arrayList, valueOf);
                if (binarySearch < 0) {
                    i10 = ~binarySearch;
                } else {
                    int size = arrayList.size();
                    do {
                        binarySearch++;
                        if (binarySearch < size) {
                        }
                        i10 = binarySearch;
                    } while (((Comparable) arrayList.get(binarySearch)).compareTo(valueOf) == 0);
                    i10 = binarySearch;
                }
                if (i10 >= arrayList.size()) {
                    return -1;
                }
                return i10;
            default:
                long[] jArr = (long[]) this.f157c;
                int b10 = d0.b(jArr, j10, false);
                if (b10 >= jArr.length) {
                    return -1;
                }
                return b10;
        }
    }

    public void e0(r5.c cVar) {
        String str;
        String string;
        d dVar = (d) this.f156b;
        if (cVar != null) {
            m.e("Must be called from the main thread.");
            s5.h hVar = cVar.f43383j;
            String a2 = cVar.a();
            if (!TextUtils.isEmpty(a2) && hVar != null) {
                b bVar = (b) dVar.d;
                if (bVar == null || !TextUtils.equals(bVar.f152c.a(), a2)) {
                    dVar.B(new b(cVar, (r5.g) this.f157c, hVar));
                    m.e("Must be called from the main thread.");
                    CastDevice castDevice = cVar.f43384k;
                    if (castDevice != null) {
                        str = castDevice.d;
                    } else {
                        str = null;
                    }
                    PhotoViewer t12 = PhotoViewer.t1();
                    g.i();
                    if (t12.B != null && t12.f31679b0 != null && t12.Q1()) {
                        qc qcVar = new qc(t12.f31679b0, new nh.b());
                        int i10 = R.raw.forward;
                        if (!TextUtils.isEmpty(str)) {
                            string = LocaleController.formatString(R.string.ChromecastStartedTo, str);
                        } else {
                            string = LocaleController.getString(R.string.ChromecastStarted);
                        }
                        qcVar.Q(i10, 36, string).j();
                    }
                }
            }
        }
    }

    @Override
    public void f(r5.f fVar, String str) {
        r5.c cVar = (r5.c) fVar;
        Log.d("CAST_SESSION", "onSessionStarted " + cVar.a() + " " + str);
        e0(cVar);
    }

    public void f0(androidx.mediarouter.app.s sVar) {
        if (sVar != null) {
            if (((ConcurrentHashMap) this.f157c).remove(sVar) == null) {
                Log.w("MediaControllerCompat", "the callback has never been registered");
                return;
            }
            try {
                ((android.support.v4.media.session.h) this.f156b).b(sVar);
                return;
            } finally {
                sVar.f(null);
            }
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    @Override
    public void g(r5.f fVar, boolean z4) {
        Log.d("CAST_SESSION", "onSessionResumed " + ((r5.c) fVar).a() + " " + z4);
    }

    public int g0(Context context, com.google.android.gms.common.api.c cVar) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.f156b;
        m.h(context);
        m.h(cVar);
        int i10 = 0;
        if (!cVar.j()) {
            return 0;
        }
        int k10 = cVar.k();
        int i11 = sparseIntArray.get(k10, -1);
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        while (true) {
            if (i12 < sparseIntArray.size()) {
                int keyAt = sparseIntArray.keyAt(i12);
                if (keyAt > k10 && sparseIntArray.get(keyAt) == 0) {
                    break;
                }
                i12++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 == -1) {
            i10 = ((y5.e) this.f157c).d(context, k10);
        }
        sparseIntArray.put(k10, i10);
        return i10;
    }

    @Override
    public Object mo28get() {
        u uVar = new u(7);
        db.a aVar = new db.a(7);
        Object mo28get = ((rc.a) this.f156b).mo28get();
        rc.a aVar2 = (rc.a) this.f157c;
        return new f3.h(uVar, aVar, f3.a.f5862f, (f3.j) mo28get, aVar2);
    }

    @Override
    public long h(int i10) {
        boolean z4;
        boolean z10;
        switch (this.f155a) {
            case 2:
                ArrayList arrayList = (ArrayList) this.f157c;
                boolean z11 = false;
                if (i10 >= 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                h5.a.f(z4);
                if (i10 < arrayList.size()) {
                    z11 = true;
                }
                h5.a.f(z11);
                return ((Long) arrayList.get(i10)).longValue();
            default:
                long[] jArr = (long[]) this.f157c;
                boolean z12 = false;
                if (i10 >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                h5.a.f(z10);
                if (i10 < jArr.length) {
                    z12 = true;
                }
                h5.a.f(z12);
                return jArr[i10];
        }
    }

    @Override
    public void i(r5.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionStartSuspended " + ((r5.c) fVar).a() + " " + i10);
    }

    @Override
    public void j(r5.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionStartFailed " + ((r5.c) fVar).a() + " " + i10);
    }

    @Override
    public void k(r5.f fVar) {
        r5.c cVar = (r5.c) fVar;
        Log.d("CAST_SESSION", "onSessionStarting " + cVar.a());
        e0(cVar);
    }

    @Override
    public void l(r5.f fVar, String str) {
        Log.d("CAST_SESSION", "onSessionResuming " + ((r5.c) fVar).a() + " " + str);
    }

    @Override
    public void m(r5.f fVar) {
        Log.d("CAST_SESSION", "onSessionEnding " + ((r5.c) fVar).a());
    }

    @Override
    public void n() {
        w wVar = (w) this.f157c;
        byte[] bArr = d0.f6927f;
        wVar.getClass();
        wVar.D(bArr.length, bArr);
    }

    @Override
    public void o(r5.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionEnded " + ((r5.c) fVar).a() + " " + i10);
        ((d) this.f156b).B(null);
    }

    @Override
    public void onComplete(Task task) {
        boolean z4;
        boolean z10;
        r5.b bVar;
        boolean z11;
        String str;
        p pVar = (p) this.f156b;
        r5.b bVar2 = (r5.b) this.f157c;
        c2.d0 d0Var = pVar.f3107c;
        u5.b bVar3 = p.f3106j;
        if (task.isSuccessful()) {
            Bundle bundle = (Bundle) task.getResult();
            if (bundle != null && bundle.containsKey("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED")) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (true != z11) {
                str = "not existed";
            } else {
                str = "existed";
            }
            bVar3.b("The module-to-client output switcher flag %s", str);
            if (z11) {
                z4 = bundle.getBoolean("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
                Log.i(bVar3.f45160a, bVar3.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z4), Boolean.valueOf(bVar2.f43375x)));
                if (!z4 && bVar2.f43375x) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (d0Var == null && (bVar = pVar.d) != null) {
                    boolean z12 = bVar.v;
                    boolean z13 = bVar.f43373s;
                    c2.f0 f0Var = new c2.f0();
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 30) {
                        f0Var.f1966b = z10;
                    }
                    if (i10 >= 30) {
                        f0Var.d = z12;
                    }
                    if (i10 >= 30) {
                        f0Var.f1967c = z13;
                    }
                    c2.d0.i(new g0(f0Var));
                    Log.i(bVar3.f45160a, bVar3.d("media transfer = %b, session transfer = %b, transfer to local = %b, in-app output switcher = %b", Boolean.valueOf(pVar.f3109i), Boolean.valueOf(z10), Boolean.valueOf(z12), Boolean.valueOf(z13)));
                    if (z12) {
                        com.google.android.gms.internal.cast.s sVar = pVar.f3108f;
                        m.h(sVar);
                        o oVar = new o(sVar);
                        c2.d0.b();
                        c2.d0.c().f1941f = oVar;
                        d2.a(d1.CAST_TRANSFER_TO_LOCAL_ENABLED);
                        return;
                    }
                    return;
                }
            }
        }
        z4 = true;
        Log.i(bVar3.f45160a, bVar3.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z4), Boolean.valueOf(bVar2.f43375x)));
        if (!z4) {
        }
        z10 = false;
        if (d0Var == null) {
        }
    }

    @Override
    public List q(long j10) {
        v4.b bVar;
        switch (this.f155a) {
            case 2:
                int c3 = d0.c((ArrayList) this.f157c, Long.valueOf(j10), false);
                if (c3 == -1) {
                    return Collections.EMPTY_LIST;
                }
                return (List) ((ArrayList) this.f156b).get(c3);
            default:
                int e = d0.e((long[]) this.f157c, j10, false);
                if (e != -1 && (bVar = ((v4.b[]) this.f156b)[e]) != v4.b.E) {
                    return Collections.singletonList(bVar);
                }
                return Collections.EMPTY_LIST;
        }
    }

    @Override
    public int r() {
        switch (this.f155a) {
            case 2:
                return ((ArrayList) this.f157c).size();
            default:
                return ((long[]) this.f157c).length;
        }
    }

    public void s(Object obj, String str) {
        ((ArrayList) this.f156b).add(android.support.v4.media.a.z(str, "=", String.valueOf(obj)));
    }

    public void t(l1 l1Var, c5.e eVar) {
        a0.f fVar = (a0.f) this.f156b;
        q1 q1Var = (q1) fVar.get(l1Var);
        if (q1Var == null) {
            q1Var = q1.a();
            fVar.put(l1Var, q1Var);
        }
        q1Var.f5815c = eVar;
        q1Var.f5813a |= 8;
    }

    public String toString() {
        switch (this.f155a) {
            case 12:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.f157c.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.f156b;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    sb.append((String) arrayList.get(i10));
                    if (i10 < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override
    public d4.c V(d4.i iVar) {
        MediaCodec mediaCodec;
        String str = iVar.f4141a.f4145a;
        d4.c cVar = null;
        try {
            h5.a.c("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                d4.c cVar2 = new d4.c(mediaCodec, (HandlerThread) ((d4.b) this.f156b).get(), (HandlerThread) ((d4.b) this.f157c).get());
                try {
                    h5.a.q();
                    d4.c.i(cVar2, iVar.f4142b, iVar.d, iVar.e);
                    return cVar2;
                } catch (Exception e) {
                    e = e;
                    cVar = cVar2;
                    if (cVar == null) {
                        if (mediaCodec != null) {
                            mediaCodec.release();
                        }
                    } else {
                        cVar.release();
                    }
                    throw e;
                }
            } catch (Exception e6) {
                e = e6;
            }
        } catch (Exception e10) {
            e = e10;
            mediaCodec = null;
        }
    }

    public ArrayList w() {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        Context context = (Context) this.f156b;
        Class cls = ((c9.e) this.f157c).f2178a;
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
            arrayList2.add(new c9.d(str2, 0));
        }
        return arrayList2;
    }

    public void x(s f10, boolean z4) {
        kotlin.jvm.internal.j.e(f10, "f");
        s sVar = ((j0) this.f156b).f886y;
        if (sVar != null) {
            sVar.p().f877o.x(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f157c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z4) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void y(s f10, boolean z4) {
        kotlin.jvm.internal.j.e(f10, "f");
        j0 j0Var = (j0) this.f156b;
        androidx.fragment.app.v vVar = j0Var.f884w.f970b;
        s sVar = j0Var.f886y;
        if (sVar != null) {
            sVar.p().f877o.y(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f157c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z4) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    @Override
    public void z(float r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: af.c.z(float, int):void");
    }

    @Override
    public Object zzp() {
        boolean z4;
        Map map;
        com.google.android.gms.internal.clearcut.d dVar = (com.google.android.gms.internal.clearcut.d) this.f156b;
        com.google.android.gms.internal.clearcut.b bVar = (com.google.android.gms.internal.clearcut.b) this.f157c;
        bVar.getClass();
        if (com.google.android.gms.internal.clearcut.d.e()) {
            z4 = ((Boolean) com.google.android.gms.internal.clearcut.d.c(new com.google.android.gms.internal.clearcut.e("gms:phenotype:phenotype_flag:debug_disable_caching"))).booleanValue();
        } else {
            z4 = false;
        }
        if (z4) {
            map = bVar.b();
        } else {
            map = bVar.e;
        }
        if (map == null) {
            synchronized (bVar.d) {
                try {
                    Map map2 = bVar.e;
                    map = map2;
                    if (map2 == null) {
                        HashMap b10 = bVar.b();
                        bVar.e = b10;
                        map = b10;
                    }
                } finally {
                }
            }
        }
        if (map == null) {
            map = Collections.EMPTY_MAP;
        }
        return (String) map.get(dVar.f3267b);
    }

    public c(int i10, Object obj, Object obj2) {
        this.f155a = i10;
        this.f156b = obj;
        this.f157c = obj2;
    }

    public c(Object obj, int i10) {
        this.f155a = i10;
        this.f156b = obj;
    }

    public c(Object obj, Object obj2, boolean z4, int i10) {
        this.f155a = i10;
        this.f157c = obj;
        this.f156b = obj2;
    }

    public c(Context context) {
        this.f155a = 13;
        m.h(context);
        Resources resources = context.getResources();
        this.f156b = resources;
        this.f157c = resources.getResourcePackageName(2131689566);
    }

    public c(Object obj) {
        this.f155a = 12;
        this.f157c = obj;
        this.f156b = new ArrayList();
    }

    public c(y5.e eVar) {
        this.f155a = 14;
        this.f156b = new SparseIntArray();
        m.h(eVar);
        this.f157c = eVar;
    }

    public c(j0 j0Var) {
        this.f155a = 7;
        this.f156b = j0Var;
        this.f157c = new CopyOnWriteArrayList();
    }

    public c(int i10, byte b10) {
        this.f155a = i10;
        switch (i10) {
            case 24:
                this.f156b = new ConcurrentHashMap(16, 0.75f, 10);
                this.f157c = new ReferenceQueue();
                return;
            case 28:
                this.f156b = new a0.k(0);
                this.f157c = new a0.h();
                return;
            default:
                r5.a c3 = r5.a.c(ApplicationLoader.applicationContext);
                a aVar = new a(0);
                c3.getClass();
                m.e("Must be called from the main thread.");
                r5.g gVar = c3.f43360c;
                gVar.getClass();
                try {
                    r5.y yVar = gVar.f43393a;
                    r5.j jVar = new r5.j(aVar);
                    Parcel M0 = yVar.M0();
                    t.d(M0, jVar);
                    yVar.Q0(M0, 4);
                } catch (RemoteException e) {
                    r5.g.f43392c.a(e, "Unable to call %s on %s.", "addCastStateListener", r5.y.class.getSimpleName());
                }
                this.f156b = new d(0, false);
                r5.g b11 = c3.b();
                this.f157c = b11;
                b11.a(this);
                e0(b11.c());
                return;
        }
    }

    public c(h5.c0 c0Var) {
        this.f155a = 9;
        this.f156b = c0Var;
        this.f157c = new w();
    }

    public c(int i10) {
        this.f155a = 25;
        d4.b bVar = new d4.b(i10, 0);
        d4.b bVar2 = new d4.b(i10, 1);
        this.f156b = bVar;
        this.f157c = bVar2;
    }

    public c(w8.g gVar) {
        this.f155a = 26;
        this.f157c = gVar;
    }

    public c(r rVar, z9.d dVar, androidx.emoji2.text.d dVar2) {
        this.f155a = 5;
        this.f156b = rVar;
        this.f157c = dVar2;
    }

    public c(p1 p1Var) {
        this.f155a = 27;
        this.f156b = p1Var;
        ?? obj = new Object();
        obj.f98a = 0;
        this.f157c = obj;
    }

    public c(Animation animation) {
        this.f155a = 6;
        this.f156b = animation;
        this.f157c = null;
    }

    public c(Animator animator) {
        this.f155a = 6;
        this.f156b = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.f157c = animatorSet;
        animatorSet.play(animator);
    }

    public c(Context context, android.support.v4.media.session.c0 c0Var) {
        this.f155a = 3;
        this.f157c = new ConcurrentHashMap();
        MediaSessionCompat$Token mediaSessionCompat$Token = c0Var.f261a.f284b;
        if (Build.VERSION.SDK_INT >= 29) {
            this.f156b = new android.support.v4.media.session.h(context, mediaSessionCompat$Token);
        } else {
            this.f156b = new android.support.v4.media.session.h(context, mediaSessionCompat$Token);
        }
    }

    public c(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.f155a = 3;
        this.f157c = new ConcurrentHashMap();
        if (mediaSessionCompat$Token != null) {
            this.f156b = new android.support.v4.media.session.h(context, mediaSessionCompat$Token);
            return;
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }

    @Override
    public void c(h5.c0 c0Var, r3.m mVar, h0 h0Var) {
    }

    public c(f0 f0Var) {
        this.f155a = 10;
        this.f157c = f0Var;
        this.f156b = new h5.v(new byte[4], 4);
    }
}
