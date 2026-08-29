package l3;

import android.content.ClipDescription;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.Editable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.Choreographer;
import bg.t1;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.tasks.TaskCompletionSource;
import h7.s7;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;
import lh.q2;
import nh.a6;
import nh.b6;
import nh.e6;
import nh.f6;
import nh.g9;
import nh.n7;
import nh.o7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.cz0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.jk;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.qz;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.x61;
import org.telegram.ui.yp0;
import org.xmlpull.v1.XmlPullParserException;
public final class g0 implements t9.a, u61, com.google.android.gms.common.api.internal.s, ek0, yp0, t0.h {
    public final int f14095a;
    public Object f14096b;
    public Object f14097c;
    public Object d;

    public g0(int i10, boolean z10) {
        this.f14095a = i10;
    }

    public static void C(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e("AtomicFile", "Failed to delete file which is a directory " + file2);
        }
        if (!file.renameTo(file2)) {
            Log.e("AtomicFile", "Failed to rename " + file + " to " + file2);
        }
    }

    public static final URL m(g0 g0Var) {
        Uri.Builder appendPath = new Uri.Builder().scheme("https").authority((String) g0Var.d).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        ja.b bVar = (ja.b) g0Var.f14096b;
        Uri.Builder appendPath2 = appendPath.appendPath(bVar.f11299a).appendPath("settings");
        ja.a aVar = bVar.f11300b;
        return new URL(appendPath2.appendQueryParameter("build_version", aVar.f11295c).appendQueryParameter("display_version", aVar.f11294b).build().toString());
    }

    public static Object[] n(Object[] objArr, int[] iArr) {
        int length = objArr.length;
        Class<?> componentType = objArr.getClass().getComponentType();
        oy0 oy0Var = cz0.N;
        int i10 = -1;
        for (int i11 : iArr) {
            i10 = Math.max(i10, i11);
        }
        Object[] objArr2 = (Object[]) Array.newInstance(componentType, i10 + 1);
        for (int i12 = 0; i12 < length; i12++) {
            objArr2[iArr[i12]] = objArr[i12];
        }
        return objArr2;
    }

    public static g0 z(Context context, AttributeSet attributeSet, int[] iArr, int i10) {
        return new g0(context, context.obtainStyledAttributes(attributeSet, iArr, i10, 0));
    }

    public void A(mb.i iVar, Object obj) {
        if (((EnumMap) this.d) == null) {
            this.d = new EnumMap(mb.i.class);
        }
        ((EnumMap) this.d).put((EnumMap) iVar, (mb.i) obj);
    }

    public void B() {
        ((TypedArray) this.f14097c).recycle();
    }

    public FileOutputStream D() {
        File file = (File) this.f14097c;
        File file2 = (File) this.d;
        if (file2.exists()) {
            C(file2, (File) this.f14096b);
        }
        try {
            return new FileOutputStream(file);
        } catch (FileNotFoundException unused) {
            if (file.getParentFile().mkdirs()) {
                try {
                    return new FileOutputStream(file);
                } catch (FileNotFoundException e10) {
                    throw new IOException("Failed to create new file " + file, e10);
                }
            }
            throw new IOException("Failed to create directory for " + file);
        }
    }

    public void E(int i10, String str, String str2) {
        ((HashMap) this.f14096b).put(str, str2);
        ((HashMap) this.f14097c).put(str2, str);
        ((HashMap) this.d).put(str, Integer.valueOf(i10));
    }

    @Override
    public boolean O() {
        return false;
    }

    @Override
    public void Q(android.view.View r13, kg.q0 r14, boolean r15, boolean r16) {
        throw new UnsupportedOperationException("Method not decompiled: l3.g0.Q(android.view.View, kg.q0, boolean, boolean):void");
    }

    @Override
    public void accept(Object obj, Object obj2) {
        boolean z10;
        o5.e0 e0Var = (o5.e0) this.f14096b;
        String str = (String) this.f14097c;
        o5.i iVar = (o5.i) this.d;
        s5.x xVar = (s5.x) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        if (e0Var.F == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        z5.l.j("Not connected to device", z10);
        s5.f fVar = (s5.f) xVar.u();
        Parcel M0 = fVar.M0();
        M0.writeString(str);
        com.google.android.gms.internal.cast.u.c(M0, iVar);
        fVar.R0(M0, 13);
        synchronized (e0Var.f19259r) {
            try {
                if (e0Var.f19256o != null) {
                    e0Var.i(2477);
                }
                e0Var.f19256o = taskCompletionSource;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public Uri c() {
        return (Uri) this.f14096b;
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public Uri f() {
        return (Uri) this.d;
    }

    @Override
    public void g() {
        ((jk) this.d).M.x();
    }

    @Override
    public ClipDescription getDescription() {
        return (ClipDescription) this.f14097c;
    }

    @Override
    public void h(int i10, boolean z10, boolean z11) {
        String str;
        if (!z10) {
            jk jkVar = (jk) this.d;
            HashMap hashMap = (HashMap) this.f14096b;
            ArrayList arrayList = (ArrayList) this.f14097c;
            ni niVar = jkVar.f28403b;
            if (!hashMap.isEmpty() && jkVar.M != null && !jkVar.G) {
                jkVar.G = true;
                ArrayList arrayList2 = new ArrayList();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    Object obj = hashMap.get(arrayList.get(i11));
                    SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                    arrayList2.add(sendingMediaInfo);
                    if (obj instanceof MediaController.PhotoEntry) {
                        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                        String str2 = photoEntry.imagePath;
                        if (str2 != null) {
                            sendingMediaInfo.path = str2;
                        } else {
                            sendingMediaInfo.path = photoEntry.path;
                        }
                        sendingMediaInfo.thumbPath = photoEntry.thumbPath;
                        sendingMediaInfo.coverPath = photoEntry.coverPath;
                        sendingMediaInfo.videoEditedInfo = photoEntry.editedInfo;
                        sendingMediaInfo.isVideo = photoEntry.isVideo;
                        CharSequence charSequence = photoEntry.caption;
                        if (charSequence != null) {
                            str = charSequence.toString();
                        } else {
                            str = null;
                        }
                        sendingMediaInfo.caption = str;
                        sendingMediaInfo.entities = photoEntry.entities;
                        sendingMediaInfo.masks = photoEntry.stickers;
                        sendingMediaInfo.ttl = photoEntry.ttl;
                    }
                }
                c5.a0(niVar.F1, niVar.j1() + arrayList2.size(), niVar.n1(), new q2(i10, 1, jkVar, arrayList2, z11));
            }
        }
    }

    @Override
    public t9.a i(Class cls, s9.d dVar) {
        ((HashMap) this.f14096b).put(cls, dVar);
        ((HashMap) this.f14097c).remove(cls);
        return this;
    }

    @Override
    public boolean j() {
        return true;
    }

    @Override
    public Object k() {
        return null;
    }

    public Object o(Bitmap bitmap) {
        rg.a aVar = (rg.a) this.f14096b;
        if (aVar.a(bitmap)) {
            this.d = ((rg.b) this.f14097c).a(bitmap);
            aVar.b(bitmap);
        }
        return this.d;
    }

    @Override
    public void onError(x61 x61Var, Exception exc) {
        g9 g9Var = ((f6) this.d).J;
        if (g9Var != null) {
            g9Var.run();
        }
    }

    @Override
    public void onRenderedFirstFrame(k3.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        f6 f6Var = (f6) this.d;
        a6 a6Var = f6Var.G;
        x61 x61Var = f6Var.f17651e;
        if (x61Var == null) {
            return;
        }
        if (x61Var.z()) {
            AndroidUtilities.runOnUIThread(a6Var);
        } else {
            AndroidUtilities.cancelRunOnUIThread(a6Var);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((f6) this.d).i();
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f9) {
        f6 f6Var = (f6) this.d;
        o7 o7Var = (o7) this.f14096b;
        if (o7Var != null) {
            n7 r6 = f6Var.f17651e.r(o7Var.f18264d1);
            o7Var.f18264d1 = r6;
            l61 l61Var = f6Var.f17661n;
            if (l61Var != null) {
                l61Var.setHDRInfo(r6);
            }
        }
        int i13 = (int) (i10 * f9);
        f6Var.f17653f = i13;
        int i14 = (int) (i11 * f9);
        f6Var.h = i14;
        if (o7Var != null && (o7Var.f18278k0 != i13 || o7Var.f18280l0 != i14)) {
            o7Var.f18278k0 = i13;
            o7Var.f18280l0 = i14;
            o7Var.A();
        }
        f6Var.b();
        l61 l61Var2 = f6Var.f17661n;
        if (l61Var2 != null) {
            int i15 = f6Var.f17653f;
            int i16 = f6Var.h;
            l61Var2.d = i15;
            l61Var2.f30237e = i16;
            qz qzVar = l61Var2.f30235b;
            if (qzVar != null) {
                qzVar.postRunnable(new mz(qzVar, i15, i16, 0));
            }
        }
    }

    public ColorStateList p(int i10) {
        int resourceId;
        ColorStateList a2;
        TypedArray typedArray = (TypedArray) this.f14097c;
        if (typedArray.hasValue(i10) && (resourceId = typedArray.getResourceId(i10, 0)) != 0 && (a2 = s7.a((Context) this.f14096b, resourceId)) != null) {
            return a2;
        }
        return typedArray.getColorStateList(i10);
    }

    public Drawable q(int i10) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f14097c;
        if (typedArray.hasValue(i10) && (resourceId = typedArray.getResourceId(i10, 0)) != 0) {
            return s7.b((Context) this.f14096b, resourceId);
        }
        return typedArray.getDrawable(i10);
    }

    public Drawable r(int i10) {
        int resourceId;
        Drawable f9;
        if (((TypedArray) this.f14097c).hasValue(i10) && (resourceId = ((TypedArray) this.f14097c).getResourceId(i10, 0)) != 0) {
            m.r a2 = m.r.a();
            Context context = (Context) this.f14096b;
            synchronized (a2) {
                f9 = a2.f16663a.f(resourceId, context, true);
            }
            return f9;
        }
        return null;
    }

    public Typeface s(int i10, int i11, f5.b0 b0Var) {
        f5.b0 b0Var2;
        XmlPullParserException xmlPullParserException;
        IOException iOException;
        int resourceId = ((TypedArray) this.f14097c).getResourceId(i10, 0);
        if (resourceId != 0) {
            if (((TypedValue) this.d) == null) {
                this.d = new TypedValue();
            }
            Context context = (Context) this.f14096b;
            TypedValue typedValue = (TypedValue) this.d;
            ThreadLocal threadLocal = h0.k.f7490a;
            if (!context.isRestricted()) {
                Resources resources = context.getResources();
                resources.getValue(resourceId, typedValue, true);
                CharSequence charSequence = typedValue.string;
                if (charSequence != null) {
                    String charSequence2 = charSequence.toString();
                    if (!charSequence2.startsWith("res/")) {
                        b0Var.a();
                        return null;
                    }
                    int i12 = typedValue.assetCookie;
                    a0.j jVar = i0.e.f8193b;
                    Typeface typeface = (Typeface) jVar.a(i0.e.b(resources, resourceId, charSequence2, i12, i11));
                    if (typeface != null) {
                        new Handler(Looper.getMainLooper()).post(new ef.c(16, b0Var, typeface));
                        return typeface;
                    }
                    try {
                        if (charSequence2.toLowerCase().endsWith(".xml")) {
                            h0.d g10 = h0.b.g(resources.getXml(resourceId), resources);
                            if (g10 == null) {
                                try {
                                    Log.e("ResourcesCompat", "Failed to find font-family tag");
                                    b0Var.a();
                                    return null;
                                } catch (IOException e10) {
                                    iOException = e10;
                                    b0Var2 = b0Var;
                                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                                    b0Var2.a();
                                    return null;
                                } catch (XmlPullParserException e11) {
                                    xmlPullParserException = e11;
                                    b0Var2 = b0Var;
                                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                                    b0Var2.a();
                                    return null;
                                }
                            }
                            try {
                                return i0.e.a(context, g10, resources, resourceId, charSequence2, typedValue.assetCookie, i11, b0Var);
                            } catch (IOException e12) {
                                e = e12;
                                b0Var2 = b0Var;
                                iOException = e;
                                Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                                b0Var2.a();
                                return null;
                            } catch (XmlPullParserException e13) {
                                e = e13;
                                b0Var2 = b0Var;
                                xmlPullParserException = e;
                                Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                                b0Var2.a();
                                return null;
                            }
                        }
                        b0Var2 = b0Var;
                        try {
                            int i13 = typedValue.assetCookie;
                            Typeface e14 = i0.e.f8192a.e(context, resources, resourceId, charSequence2, i11);
                            if (e14 != null) {
                                jVar.b(i0.e.b(resources, resourceId, charSequence2, i13, i11), e14);
                            }
                            if (e14 != null) {
                                new Handler(Looper.getMainLooper()).post(new ef.c(16, b0Var2, e14));
                            } else {
                                b0Var2.a();
                            }
                            return e14;
                        } catch (IOException e15) {
                            e = e15;
                            iOException = e;
                            Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                            b0Var2.a();
                            return null;
                        } catch (XmlPullParserException e16) {
                            e = e16;
                            xmlPullParserException = e;
                            Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                            b0Var2.a();
                            return null;
                        }
                    } catch (IOException e17) {
                        e = e17;
                        b0Var2 = b0Var;
                    } catch (XmlPullParserException e18) {
                        e = e18;
                        b0Var2 = b0Var;
                    }
                } else {
                    throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(resourceId) + "\" (" + Integer.toHexString(resourceId) + ") is not a Font: " + typedValue);
                }
            }
        }
        return null;
    }

    public void t(t7.f fVar) {
        try {
            u7.g gVar = (u7.g) this.f14097c;
            t7.i iVar = new t7.i(fVar);
            Parcel M0 = gVar.M0();
            e7.b.c(M0, iVar);
            gVar.Q0(M0, 9);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public String toString() {
        switch (this.f14095a) {
            case 9:
                return (String) this.f14096b;
            case 28:
                StringBuilder sb2 = new StringBuilder();
                ArrayList arrayList = (ArrayList) this.f14096b;
                int size = arrayList.size();
                tb.f fVar = null;
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    tb.f fVar2 = (tb.f) obj;
                    if (fVar != null) {
                        sb2.append(",");
                    }
                    sb2.append(fVar2.toString());
                    fVar = fVar2;
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public int u(rb.e eVar) {
        ArrayList arrayList = (ArrayList) this.f14096b;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            tb.f fVar = (tb.f) obj;
            int i12 = fVar.d;
            rb.d dVar = fVar.f48206a;
            int a2 = dVar.a(eVar);
            int i13 = a2 + 4;
            int ordinal = dVar.ordinal();
            int i14 = 4;
            if (ordinal != 1) {
                int i15 = 6;
                if (ordinal != 2) {
                    if (ordinal != 4) {
                        if (ordinal != 5) {
                            if (ordinal == 6) {
                                i13 += i12 * 13;
                            }
                        } else {
                            i13 = a2 + 12;
                        }
                    } else {
                        i13 += fVar.a() * 8;
                    }
                } else {
                    int i16 = ((i12 / 2) * 11) + i13;
                    if (i12 % 2 != 1) {
                        i15 = 0;
                    }
                    i13 = i16 + i15;
                }
            } else {
                int i17 = ((i12 / 3) * 10) + i13;
                int i18 = i12 % 3;
                if (i18 != 1) {
                    if (i18 == 2) {
                        i14 = 7;
                    } else {
                        i14 = 0;
                    }
                }
                i13 = i17 + i14;
            }
            i10 += i13;
        }
        return i10;
    }

    public boolean v() {
        String trim;
        ArrayDeque arrayDeque = (ArrayDeque) this.f14097c;
        if (((String) this.d) != null) {
            return true;
        }
        if (!arrayDeque.isEmpty()) {
            String str = (String) arrayDeque.poll();
            str.getClass();
            this.d = str;
            return true;
        }
        do {
            String readLine = ((BufferedReader) this.f14096b).readLine();
            this.d = readLine;
            if (readLine != null) {
                trim = readLine.trim();
                this.d = trim;
            } else {
                return false;
            }
        } while (trim.isEmpty());
        return true;
    }

    @Override
    public boolean w() {
        return false;
    }

    public void x(com.google.android.exoplayer2.upstream.m r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, l4.r0 r15) {
        throw new UnsupportedOperationException("Method not decompiled: l3.g0.x(com.google.android.exoplayer2.upstream.m, android.net.Uri, java.util.Map, long, long, l4.r0):void");
    }

    public String y() {
        if (v()) {
            String str = (String) this.d;
            this.d = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    public g0(Object obj, Object obj2, Object obj3, int i10) {
        this.f14095a = i10;
        this.d = obj;
        this.f14096b = obj2;
        this.f14097c = obj3;
    }

    @Override
    public void onRenderedFirstFrame() {
        o7 o7Var = (o7) this.f14096b;
        Runnable[] runnableArr = (Runnable[]) this.f14097c;
        f6 f6Var = (f6) this.d;
        e6 e6Var = f6Var.D;
        if (e6Var != null && e6Var.f17598g) {
            int i10 = f6Var.f17653f;
            int i11 = f6Var.h;
            e6Var.d = true;
            e6Var.f17596e = i10;
            e6Var.f17597f = i11;
            t1 t1Var = e6Var.f17595c;
            if (t1Var != null) {
                t1Var.run(Integer.valueOf(i10), Integer.valueOf(e6Var.f17597f));
            }
        }
        Runnable runnable = runnableArr[0];
        if (runnable != null) {
            f6Var.post(runnable);
            runnableArr[0] = null;
            Bitmap bitmap = f6Var.f17644a;
            if (bitmap != null) {
                bitmap.recycle();
                if (o7Var.M0 == f6Var.f17644a) {
                    o7Var.M0 = null;
                }
                f6Var.f17644a = null;
                f6Var.invalidate();
                return;
            }
            return;
        }
        l61 l61Var = f6Var.f17661n;
        if (l61Var != null) {
            if (e6Var == null || !e6Var.f17598g) {
                l61Var.animate().alpha(1.0f).setDuration(180L).withEndAction(new b6(2, this, o7Var)).start();
            }
        }
    }

    public g0(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f14095a = i10;
        this.f14096b = obj;
        this.f14097c = obj2;
        this.d = obj3;
    }

    public g0(int i10) {
        this.f14095a = i10;
        switch (i10) {
            case 14:
                this.f14096b = new HashMap();
                this.f14097c = new HashMap();
                this.d = new HashMap();
                return;
            default:
                this.f14096b = new HashMap();
                this.f14097c = new HashMap();
                this.d = l7.x.f15034c;
                return;
        }
    }

    public g0(CastDevice castDevice, p5.d0 d0Var) {
        this.f14095a = 12;
        z5.l.i(castDevice, "CastDevice parameter cannot be null");
        this.f14096b = castDevice;
        this.f14097c = d0Var;
    }

    public g0(q5.h hVar) {
        this.f14095a = 22;
        this.d = hVar;
        this.f14097c = new AtomicLong((s5.a.f47579b.nextLong() & 65535) * 10000);
    }

    public g0(t7.d dVar, u7.g gVar) {
        this.f14095a = 27;
        this.f14097c = gVar;
        z5.l.h(dVar);
        this.f14096b = dVar;
    }

    public g0(rg.b bVar) {
        this.f14095a = 25;
        this.f14096b = new rg.a();
        this.f14097c = bVar;
    }

    public g0(ja.b bVar, sc.h hVar) {
        this.f14095a = 7;
        this.f14096b = bVar;
        this.f14097c = hVar;
        this.d = "firebase-settings.crashlytics.com";
    }

    public g0(String str, mb.j[] jVarArr) {
        this.f14095a = 9;
        System.currentTimeMillis();
        this.f14096b = str;
        this.f14097c = jVarArr;
        this.d = null;
    }

    @Override
    public void H() {
    }

    @Override
    public void a() {
    }

    @Override
    public void d() {
    }

    @Override
    public void l() {
    }

    public g0(o3.i iVar) {
        this.f14095a = 1;
        this.f14096b = iVar;
    }

    @Override
    public void b(Editable editable) {
    }

    @Override
    public void onSeekFinished(k3.a aVar) {
    }

    @Override
    public void onSeekStarted(k3.a aVar) {
    }

    public g0(File file) {
        this.f14095a = 21;
        this.f14096b = file;
        this.f14097c = new File(file.getPath() + ".new");
        this.d = new File(file.getPath() + ".bak");
    }

    public g0(Runnable runnable) {
        this.f14095a = 23;
        this.f14097c = new CopyOnWriteArrayList();
        this.d = new HashMap();
        this.f14096b = runnable;
    }

    public g0(Context context, TypedArray typedArray) {
        this.f14095a = 8;
        this.f14096b = context;
        this.f14097c = typedArray;
    }

    public g0(j[] jVarArr) {
        this.f14095a = 0;
        r0 r0Var = new r0();
        ?? obj = new Object();
        obj.f14197c = 1.0f;
        obj.d = 1.0f;
        h hVar = h.f14098e;
        obj.f14198e = hVar;
        obj.f14199f = hVar;
        obj.f14200g = hVar;
        obj.h = hVar;
        ByteBuffer byteBuffer = j.f14106a;
        obj.f14203k = byteBuffer;
        obj.f14204l = byteBuffer.asShortBuffer();
        obj.f14205m = byteBuffer;
        obj.f14196b = -1;
        j[] jVarArr2 = new j[jVarArr.length + 2];
        this.f14096b = jVarArr2;
        System.arraycopy(jVarArr, 0, jVarArr2, 0, jVarArr.length);
        this.f14097c = r0Var;
        this.d = obj;
        jVarArr2[jVarArr.length] = r0Var;
        jVarArr2[jVarArr.length + 1] = obj;
    }

    public g0(o1.a aVar) {
        this.f14095a = 11;
        this.f14095a = 11;
        this.f14096b = aVar;
        this.f14097c = Choreographer.getInstance();
        this.d = new o1.b(this, 0);
    }

    public g0(ab.m mVar, rb.e eVar, tb.e eVar2) {
        rb.d dVar;
        int i10;
        int i11;
        this.f14095a = 28;
        this.d = mVar;
        this.f14096b = new ArrayList();
        tb.e eVar3 = eVar2;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            dVar = rb.d.ECI;
            if (eVar3 == null) {
                break;
            }
            int i14 = eVar3.f48203c;
            int i15 = i12 + eVar3.d;
            tb.e eVar4 = eVar3.f48204e;
            int i16 = i13;
            rb.d dVar2 = eVar3.f48201a;
            boolean z10 = (dVar2 == rb.d.BYTE && eVar4 == null && i14 != 0) || !(eVar4 == null || i14 == eVar4.f48203c);
            i10 = z10 ? 1 : i16;
            if (eVar4 == null || eVar4.f48201a != dVar2 || z10) {
                ((ArrayList) this.f14096b).add(0, new tb.f(this, dVar2, eVar3.f48202b, i14, i15));
                i11 = 0;
            } else {
                i11 = i15;
            }
            if (z10) {
                ((ArrayList) this.f14096b).add(0, new tb.f(this, dVar, eVar3.f48202b, eVar3.f48203c, 0));
            }
            i13 = i10;
            eVar3 = eVar4;
            i12 = i11;
        }
        int i17 = i13;
        boolean z11 = mVar.f324a;
        rb.b bVar = (rb.b) mVar.d;
        if (z11) {
            tb.f fVar = (tb.f) ((ArrayList) this.f14096b).get(0);
            if (fVar != null && fVar.f48206a != dVar && i17 != 0) {
                ((ArrayList) this.f14096b).add(0, new tb.f(this, dVar, 0, 0, 0));
            }
            ((ArrayList) this.f14096b).add(((tb.f) ((ArrayList) this.f14096b).get(0)).f48206a == dVar ? 1 : 0, new tb.f(this, rb.d.FNC1_FIRST_POSITION, 0, 0, 0));
        }
        int i18 = eVar.f47109a;
        int i19 = 26;
        int b10 = m1.j.b(i18 <= 9 ? 1 : i18 <= 26 ? 2 : 3);
        if (b10 == 0) {
            i19 = 9;
        } else if (b10 != 1) {
            i10 = 27;
            i19 = 40;
        } else {
            i10 = 10;
        }
        int u10 = u(eVar);
        while (i18 < i19 && !tb.c.c(u10, rb.e.c(i18), bVar)) {
            i18++;
        }
        while (i18 > i10 && tb.c.c(u10, rb.e.c(i18 - 1), bVar)) {
            i18--;
        }
        this.f14097c = rb.e.c(i18);
    }

    public g0(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.f14095a = 24;
        this.f14097c = arrayDeque;
        this.f14096b = bufferedReader;
    }

    public g0(Object[] objArr, Object[] objArr2) {
        this.f14095a = 18;
        int length = objArr.length;
        int[] iArr = new int[length];
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = objArr[i10];
            Integer num = (Integer) hashMap.get(obj);
            if (num == null) {
                num = Integer.valueOf(hashMap.size());
                hashMap.put(obj, num);
            }
            iArr[i10] = num.intValue();
        }
        this.f14096b = iArr;
        this.f14097c = n(objArr, iArr);
        this.d = n(objArr2, iArr);
    }

    @Override
    public void G(Canvas canvas, RectF rectF, float f9, float f10, float f11, int i10, boolean z10) {
    }
}
