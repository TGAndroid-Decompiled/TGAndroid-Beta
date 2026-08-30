package l7;

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
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.Choreographer;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Components.f71;
import org.telegram.ui.Components.hk;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.nz0;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.vz;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.zy0;
import org.telegram.ui.eq0;
import org.telegram.ui.kg1;
import org.xmlpull.v1.XmlPullParserException;
public class w0 implements v9.a, ok0, eq0, f71, com.google.android.gms.common.api.internal.s {
    public final int f11675a;
    public Object f11676b;
    public Object f11677c;
    public Object d;

    public w0(int i10, boolean z4) {
        this.f11675a = i10;
    }

    public static void B(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e("AtomicFile", "Failed to delete file which is a directory " + file2);
        }
        if (!file.renameTo(file2)) {
            Log.e("AtomicFile", "Failed to rename " + file + " to " + file2);
        }
    }

    public static final URL g(w0 w0Var) {
        Uri.Builder appendPath = new Uri.Builder().scheme("https").authority((String) w0Var.d).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        la.b bVar = (la.b) w0Var.f11676b;
        Uri.Builder appendPath2 = appendPath.appendPath(bVar.f11736a).appendPath("settings");
        la.a aVar = bVar.f11737b;
        return new URL(appendPath2.appendQueryParameter("build_version", aVar.f11732c).appendQueryParameter("display_version", aVar.f11731b).build().toString());
    }

    public static Object[] k(Object[] objArr, int[] iArr) {
        int length = objArr.length;
        Class<?> componentType = objArr.getClass().getComponentType();
        zy0 zy0Var = nz0.O;
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

    public static o3.e l(j3.w0 w0Var) {
        String uri;
        boolean z4;
        boolean z10;
        g5.u uVar = new g5.u();
        byte[] bArr = null;
        uVar.f6454c = null;
        Uri uri2 = w0Var.f8868b;
        if (uri2 == null) {
            uri = null;
        } else {
            uri = uri2.toString();
        }
        boolean z11 = w0Var.f8870f;
        ?? obj = new Object();
        if (z11 && TextUtils.isEmpty(uri)) {
            z4 = false;
        } else {
            z4 = true;
        }
        h5.a.f(z4);
        obj.f2233b = uVar;
        obj.f2234c = uri;
        obj.f2232a = z11;
        obj.d = new HashMap();
        s8.u0 it = w0Var.f8869c.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            str.getClass();
            str2.getClass();
            synchronized (((HashMap) obj.d)) {
                ((HashMap) obj.d).put(str, str2);
            }
        }
        HashMap hashMap = new HashMap();
        UUID uuid = j3.h.f8593a;
        ab.a aVar = new ab.a(7);
        UUID uuid2 = w0Var.f8867a;
        uuid2.getClass();
        boolean z12 = w0Var.d;
        boolean z13 = w0Var.e;
        int[] d = k7.y7.d(w0Var.h);
        for (int i10 : d) {
            if (i10 != 2 && i10 != 1) {
                z10 = false;
            } else {
                z10 = true;
            }
            h5.a.f(z10);
        }
        o3.e eVar = new o3.e(uuid2, obj, hashMap, z12, (int[]) d.clone(), z13, aVar);
        byte[] bArr2 = w0Var.f8871n;
        if (bArr2 != null) {
            bArr = Arrays.copyOf(bArr2, bArr2.length);
        }
        h5.a.i(eVar.f16254w.isEmpty());
        eVar.H = bArr;
        return eVar;
    }

    public static String m(String str, HashMap hashMap) {
        String str2;
        String str3;
        StringBuilder sb = new StringBuilder();
        Iterator it = hashMap.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb.append((String) entry.getKey());
        sb.append("=");
        if (entry.getValue() == null) {
            str2 = "";
        } else {
            str2 = URLEncoder.encode((String) entry.getValue(), "UTF-8");
        }
        sb.append(str2);
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb.append("&");
            sb.append((String) entry2.getKey());
            sb.append("=");
            if (entry2.getValue() == null) {
                str3 = "";
            } else {
                str3 = URLEncoder.encode((String) entry2.getValue(), "UTF-8");
            }
            sb.append(str3);
        }
        String sb2 = sb.toString();
        if (sb2.isEmpty()) {
            return str;
        }
        if (str.contains("?")) {
            if (!str.endsWith("&")) {
                sb2 = "&".concat(sb2);
            }
            return vh.v2.k(str, sb2);
        }
        return android.support.v4.media.a.z(str, "?", sb2);
    }

    public static w0 y(Context context, AttributeSet attributeSet, int[] iArr, int i10) {
        return new w0(context, context.obtainStyledAttributes(attributeSet, iArr, i10, 0));
    }

    public void A() {
        ((TypedArray) this.f11677c).recycle();
    }

    public FileOutputStream C() {
        File file = (File) this.f11677c;
        File file2 = (File) this.d;
        if (file2.exists()) {
            B(file2, (File) this.f11676b);
        }
        try {
            return new FileOutputStream(file);
        } catch (FileNotFoundException unused) {
            if (file.getParentFile().mkdirs()) {
                try {
                    return new FileOutputStream(file);
                } catch (FileNotFoundException e) {
                    throw new IOException("Failed to create new file " + file, e);
                }
            }
            throw new IOException("Failed to create directory for " + file);
        }
    }

    public void D(int i10, String str, String str2) {
        ((HashMap) this.f11676b).put(str, str2);
        ((HashMap) this.f11677c).put(str2, str);
        ((HashMap) this.d).put(str, Integer.valueOf(i10));
    }

    @Override
    public void accept(Object obj, Object obj2) {
        boolean z4;
        q5.e0 e0Var = (q5.e0) this.f11676b;
        String str = (String) this.f11677c;
        q5.i iVar = (q5.i) this.d;
        u5.x xVar = (u5.x) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        if (e0Var.F == 2) {
            z4 = true;
        } else {
            z4 = false;
        }
        b6.m.j("Not connected to device", z4);
        u5.f fVar = (u5.f) xVar.u();
        Parcel M0 = fVar.M0();
        M0.writeString(str);
        com.google.android.gms.internal.cast.t.c(M0, iVar);
        fVar.R0(M0, 13);
        synchronized (e0Var.f42796r) {
            try {
                if (e0Var.f42793o != null) {
                    e0Var.i(2477);
                }
                e0Var.f42793o = taskCompletionSource;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public void c() {
        ((hk) this.d).N.x();
    }

    @Override
    public v9.a d(Class cls, u9.d dVar) {
        ((HashMap) this.f11676b).put(cls, dVar);
        ((HashMap) this.f11677c).remove(cls);
        return this;
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public void f(int i10, boolean z4, boolean z10) {
        String str;
        if (!z4) {
            hk hkVar = (hk) this.d;
            HashMap hashMap = (HashMap) this.f11676b;
            ArrayList arrayList = (ArrayList) this.f11677c;
            li liVar = hkVar.f24278b;
            if (!hashMap.isEmpty() && hkVar.N != null && !hkVar.H) {
                hkVar.H = true;
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
                org.telegram.ui.Components.z4.a0(liVar.G1, liVar.j1() + arrayList2.size(), liVar.n1(), new nh.r2(i10, 1, hkVar, arrayList2, z10));
            }
        }
    }

    @Override
    public boolean h() {
        return true;
    }

    @Override
    public void i(android.view.View r13, mg.q0 r14, boolean r15, boolean r16) {
        throw new UnsupportedOperationException("Method not decompiled: l7.w0.i(android.view.View, mg.q0, boolean, boolean):void");
    }

    @Override
    public boolean j() {
        return false;
    }

    @Override
    public void onError(i71 i71Var, Exception exc) {
        ph.h8 h8Var = ((ph.l5) this.d).K;
        if (h8Var != null) {
            h8Var.run();
        }
    }

    @Override
    public void onRenderedFirstFrame(k3.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z4, int i10) {
        ph.l5 l5Var = (ph.l5) this.d;
        ph.i5 i5Var = l5Var.H;
        i71 i71Var = l5Var.e;
        if (i71Var == null) {
            return;
        }
        if (i71Var.y()) {
            AndroidUtilities.runOnUIThread(i5Var);
        } else {
            AndroidUtilities.cancelRunOnUIThread(i5Var);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((ph.l5) this.d).i();
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
        ph.l5 l5Var = (ph.l5) this.d;
        ph.u6 u6Var = (ph.u6) this.f11676b;
        if (u6Var != null) {
            ph.t6 q10 = l5Var.e.q(u6Var.f42408d1);
            u6Var.f42408d1 = q10;
            w61 w61Var = l5Var.f41894n;
            if (w61Var != null) {
                w61Var.setHDRInfo(q10);
            }
        }
        int i13 = (int) (i10 * f10);
        l5Var.f41886f = i13;
        int i14 = (int) (i11 * f10);
        l5Var.h = i14;
        if (u6Var != null && (u6Var.f42421k0 != i13 || u6Var.f42423l0 != i14)) {
            u6Var.f42421k0 = i13;
            u6Var.f42423l0 = i14;
            u6Var.A();
        }
        l5Var.b();
        w61 w61Var2 = l5Var.f41894n;
        if (w61Var2 != null) {
            int i15 = l5Var.f41886f;
            int i16 = l5Var.h;
            w61Var2.d = i15;
            w61Var2.e = i16;
            vz vzVar = w61Var2.f30249b;
            if (vzVar != null) {
                vzVar.postRunnable(new rz(vzVar, i15, i16, 0));
            }
        }
    }

    public com.google.android.gms.internal.clearcut.z0 p() {
        throw new UnsupportedOperationException("Method not decompiled: l7.w0.p():com.google.android.gms.internal.clearcut.z0");
    }

    public o3.o q(j3.c1 c1Var) {
        o3.e eVar;
        c1Var.f8449b.getClass();
        j3.w0 w0Var = c1Var.f8449b.f8891c;
        if (w0Var != null && h5.d0.f6937a >= 18) {
            synchronized (this.f11676b) {
                try {
                    if (!w0Var.equals((j3.w0) this.f11677c)) {
                        this.f11677c = w0Var;
                        this.d = l(w0Var);
                    }
                    eVar = (o3.e) this.d;
                    eVar.getClass();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return eVar;
        }
        return o3.o.f16273k;
    }

    public ColorStateList r(int i10) {
        int resourceId;
        ColorStateList a2;
        TypedArray typedArray = (TypedArray) this.f11677c;
        if (typedArray.hasValue(i10) && (resourceId = typedArray.getResourceId(i10, 0)) != 0 && (a2 = j7.r7.a((Context) this.f11676b, resourceId)) != null) {
            return a2;
        }
        return typedArray.getColorStateList(i10);
    }

    @Override
    public boolean s() {
        return false;
    }

    public Drawable t(int i10) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f11677c;
        if (typedArray.hasValue(i10) && (resourceId = typedArray.getResourceId(i10, 0)) != 0) {
            return j7.r7.b((Context) this.f11676b, resourceId);
        }
        return typedArray.getDrawable(i10);
    }

    public String toString() {
        switch (this.f11675a) {
            case 5:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.f11676b);
                sb.append('{');
                w0 w0Var = (w0) ((w0) this.f11677c).d;
                String str = "";
                while (w0Var != null) {
                    Object obj = w0Var.f11677c;
                    sb.append(str);
                    String str2 = (String) w0Var.f11676b;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    if (obj != null && obj.getClass().isArray()) {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    } else {
                        sb.append(obj);
                    }
                    w0Var = (w0) w0Var.d;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            case 17:
                return (String) this.f11676b;
            default:
                return super.toString();
        }
    }

    public Drawable u(int i10) {
        int resourceId;
        Drawable f10;
        if (((TypedArray) this.f11677c).hasValue(i10) && (resourceId = ((TypedArray) this.f11677c).getResourceId(i10, 0)) != 0) {
            m.q a2 = m.q.a();
            Context context = (Context) this.f11676b;
            synchronized (a2) {
                f10 = a2.f13604a.f(resourceId, context, true);
            }
            return f10;
        }
        return null;
    }

    public Typeface v(int i10, int i11, h5.b0 b0Var) {
        h5.b0 b0Var2;
        XmlPullParserException xmlPullParserException;
        IOException iOException;
        int resourceId = ((TypedArray) this.f11677c).getResourceId(i10, 0);
        if (resourceId != 0) {
            if (((TypedValue) this.d) == null) {
                this.d = new TypedValue();
            }
            Context context = (Context) this.f11676b;
            TypedValue typedValue = (TypedValue) this.d;
            ThreadLocal threadLocal = h0.k.f6873a;
            if (!context.isRestricted()) {
                Resources resources = context.getResources();
                resources.getValue(resourceId, typedValue, true);
                CharSequence charSequence = typedValue.string;
                if (charSequence != null) {
                    String charSequence2 = charSequence.toString();
                    if (!charSequence2.startsWith("res/")) {
                        b0Var.b();
                        return null;
                    }
                    int i12 = typedValue.assetCookie;
                    a0.j jVar = i0.e.f7220b;
                    Typeface typeface = (Typeface) jVar.a(i0.e.b(resources, resourceId, charSequence2, i12, i11));
                    if (typeface != null) {
                        new Handler(Looper.getMainLooper()).post(new gf.c(10, b0Var, typeface));
                        return typeface;
                    }
                    try {
                        if (charSequence2.toLowerCase().endsWith(".xml")) {
                            h0.d g10 = h0.b.g(resources.getXml(resourceId), resources);
                            if (g10 == null) {
                                try {
                                    Log.e("ResourcesCompat", "Failed to find font-family tag");
                                    b0Var.b();
                                    return null;
                                } catch (IOException e) {
                                    iOException = e;
                                    b0Var2 = b0Var;
                                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                                    b0Var2.b();
                                    return null;
                                } catch (XmlPullParserException e6) {
                                    xmlPullParserException = e6;
                                    b0Var2 = b0Var;
                                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                                    b0Var2.b();
                                    return null;
                                }
                            }
                            try {
                                return i0.e.a(context, g10, resources, resourceId, charSequence2, typedValue.assetCookie, i11, b0Var);
                            } catch (IOException e10) {
                                e = e10;
                                b0Var2 = b0Var;
                                iOException = e;
                                Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                                b0Var2.b();
                                return null;
                            } catch (XmlPullParserException e11) {
                                e = e11;
                                b0Var2 = b0Var;
                                xmlPullParserException = e;
                                Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                                b0Var2.b();
                                return null;
                            }
                        }
                        b0Var2 = b0Var;
                        try {
                            int i13 = typedValue.assetCookie;
                            Typeface e12 = i0.e.f7219a.e(context, resources, resourceId, charSequence2, i11);
                            if (e12 != null) {
                                jVar.b(i0.e.b(resources, resourceId, charSequence2, i13, i11), e12);
                            }
                            if (e12 != null) {
                                new Handler(Looper.getMainLooper()).post(new gf.c(10, b0Var2, e12));
                            } else {
                                b0Var2.b();
                            }
                            return e12;
                        } catch (IOException e13) {
                            e = e13;
                            iOException = e;
                            Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                            b0Var2.b();
                            return null;
                        } catch (XmlPullParserException e14) {
                            e = e14;
                            xmlPullParserException = e;
                            Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                            b0Var2.b();
                            return null;
                        }
                    } catch (IOException e15) {
                        e = e15;
                        b0Var2 = b0Var;
                    } catch (XmlPullParserException e16) {
                        e = e16;
                        b0Var2 = b0Var;
                    }
                } else {
                    throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(resourceId) + "\" (" + Integer.toHexString(resourceId) + ") is not a Font: " + typedValue);
                }
            }
        }
        return null;
    }

    public void w(String str, String str2) {
        ((HashMap) this.d).put(str, str2);
    }

    public void x(g5.m r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, o4.e0 r15) {
        throw new UnsupportedOperationException("Method not decompiled: l7.w0.x(g5.m, android.net.Uri, java.util.Map, long, long, o4.e0):void");
    }

    public void z(ob.i iVar, Object obj) {
        if (((EnumMap) this.d) == null) {
            this.d = new EnumMap(ob.i.class);
        }
        ((EnumMap) this.d).put((EnumMap) iVar, (ob.i) obj);
    }

    public w0(Object obj, Object obj2, Object obj3, int i10) {
        this.f11675a = i10;
        this.d = obj;
        this.f11676b = obj2;
        this.f11677c = obj3;
    }

    @Override
    public void onRenderedFirstFrame() {
        ph.u6 u6Var = (ph.u6) this.f11676b;
        Runnable[] runnableArr = (Runnable[]) this.f11677c;
        ph.l5 l5Var = (ph.l5) this.d;
        ph.k5 k5Var = l5Var.E;
        if (k5Var != null && k5Var.f41859g) {
            int i10 = l5Var.f41886f;
            int i11 = l5Var.h;
            k5Var.d = true;
            k5Var.e = i10;
            k5Var.f41858f = i11;
            dg.r1 r1Var = k5Var.f41857c;
            if (r1Var != null) {
                r1Var.run(Integer.valueOf(i10), Integer.valueOf(k5Var.f41858f));
            }
        }
        Runnable runnable = runnableArr[0];
        if (runnable != null) {
            l5Var.post(runnable);
            runnableArr[0] = null;
            Bitmap bitmap = l5Var.f41878a;
            if (bitmap != null) {
                bitmap.recycle();
                if (u6Var.M0 == l5Var.f41878a) {
                    u6Var.M0 = null;
                }
                l5Var.f41878a = null;
                l5Var.invalidate();
                return;
            }
            return;
        }
        w61 w61Var = l5Var.f41894n;
        if (w61Var != null) {
            if (k5Var == null || !k5Var.f41859g) {
                w61Var.animate().alpha(1.0f).setDuration(180L).withEndAction(new kg1(25, this, u6Var)).start();
            }
        }
    }

    public w0(q5.e0 e0Var, String str, q5.i iVar) {
        this.f11675a = 27;
        this.f11676b = e0Var;
        this.f11677c = str;
        this.d = iVar;
    }

    public w0(int i10) {
        this.f11675a = i10;
        switch (i10) {
            case 14:
                this.f11676b = new Object();
                return;
            case 28:
                this.f11676b = new HashMap();
                this.f11677c = new HashMap();
                this.d = new HashMap();
                return;
            default:
                this.f11676b = new HashMap();
                this.f11677c = new HashMap();
                this.d = n7.x.f14785c;
                return;
        }
    }

    public w0(CastDevice castDevice, r5.e0 e0Var) {
        this.f11675a = 26;
        b6.m.i(castDevice, "CastDevice parameter cannot be null");
        this.f11676b = castDevice;
        this.f11677c = e0Var;
    }

    public w0(String str) {
        this.f11675a = 5;
        w0 w0Var = new w0(4, false);
        this.f11677c = w0Var;
        this.d = w0Var;
        this.f11676b = str;
    }

    public w0(la.b bVar, uc.h hVar) {
        this.f11675a = 12;
        this.f11676b = bVar;
        this.f11677c = hVar;
        this.d = "firebase-settings.crashlytics.com";
    }

    public w0(String str, HashMap hashMap) {
        this.f11675a = 6;
        this.f11676b = str;
        this.f11677c = hashMap;
        this.d = new HashMap();
    }

    public w0(String str, ob.j[] jVarArr) {
        this.f11675a = 17;
        System.currentTimeMillis();
        this.f11676b = str;
        this.f11677c = jVarArr;
        this.d = null;
    }

    @Override
    public void a() {
    }

    @Override
    public void o() {
    }

    public w0(File file) {
        this.f11675a = 25;
        this.f11676b = file;
        this.f11677c = new File(file.getPath() + ".new");
        this.d = new File(file.getPath() + ".bak");
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

    public w0(r3.i iVar, int i10) {
        this.f11675a = i10;
        switch (i10) {
            case 16:
                this.f11676b = new HashMap();
                new HashSet();
                this.f11677c = new HashMap();
                return;
            default:
                this.f11676b = iVar;
                return;
        }
    }

    public w0(Runnable runnable) {
        this.f11675a = 29;
        this.f11677c = new CopyOnWriteArrayList();
        this.d = new HashMap();
        this.f11676b = runnable;
    }

    public w0(Context context, TypedArray typedArray) {
        this.f11675a = 3;
        this.f11676b = context;
        this.f11677c = typedArray;
    }

    public w0(androidx.biometric.f0 f0Var) {
        this.f11675a = 13;
        this.f11675a = 13;
        this.f11676b = f0Var;
        this.f11677c = Choreographer.getInstance();
        this.d = new o1.a(this, 0);
    }

    public w0(Object[] objArr, Object[] objArr2) {
        this.f11675a = 21;
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
        this.f11676b = iArr;
        this.f11677c = k(objArr, iArr);
        this.d = k(objArr2, iArr);
    }

    @Override
    public void n(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i10, boolean z4) {
    }
}
