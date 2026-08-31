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
import org.telegram.ui.Components.az0;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.jk;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.oz0;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.xz;
import org.telegram.ui.Components.y61;
import org.telegram.ui.gq0;
import org.telegram.ui.mg1;
import org.xmlpull.v1.XmlPullParserException;
public class w0 implements v9.a, qk0, gq0, com.google.android.gms.common.api.internal.s, h71 {
    public final int f12079a;
    public Object f12080b;
    public Object f12081c;
    public Object d;

    public w0(int i10, boolean z4) {
        this.f12079a = i10;
    }

    public static void B(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e("AtomicFile", "Failed to delete file which is a directory " + file2);
        }
        if (!file.renameTo(file2)) {
            Log.e("AtomicFile", "Failed to rename " + file + " to " + file2);
        }
    }

    public static final URL i(w0 w0Var) {
        Uri.Builder appendPath = new Uri.Builder().scheme("https").authority((String) w0Var.d).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        la.b bVar = (la.b) w0Var.f12080b;
        Uri.Builder appendPath2 = appendPath.appendPath(bVar.f12144a).appendPath("settings");
        la.a aVar = bVar.f12145b;
        return new URL(appendPath2.appendQueryParameter("build_version", aVar.f12139c).appendQueryParameter("display_version", aVar.f12138b).build().toString());
    }

    public static Object[] k(Object[] objArr, int[] iArr) {
        int length = objArr.length;
        Class<?> componentType = objArr.getClass().getComponentType();
        az0 az0Var = oz0.O;
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
        uVar.f6945c = null;
        Uri uri2 = w0Var.f9464b;
        if (uri2 == null) {
            uri = null;
        } else {
            uri = uri2.toString();
        }
        boolean z11 = w0Var.f9467f;
        ?? obj = new Object();
        if (z11 && TextUtils.isEmpty(uri)) {
            z4 = false;
        } else {
            z4 = true;
        }
        h5.a.f(z4);
        obj.f2425b = uVar;
        obj.f2426c = uri;
        obj.f2424a = z11;
        obj.d = new HashMap();
        s8.u0 it = w0Var.f9465c.entrySet().iterator();
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
        UUID uuid = j3.h.f9162a;
        ab.a aVar = new ab.a(7);
        UUID uuid2 = w0Var.f9463a;
        uuid2.getClass();
        boolean z12 = w0Var.d;
        boolean z13 = w0Var.f9466e;
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
        byte[] bArr2 = w0Var.f9468n;
        if (bArr2 != null) {
            bArr = Arrays.copyOf(bArr2, bArr2.length);
        }
        h5.a.i(eVar.f16394w.isEmpty());
        eVar.H = bArr;
        return eVar;
    }

    public static String n(String str, HashMap hashMap) {
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
            return w.c.e(str, sb2);
        }
        return android.support.v4.media.a.z(str, "?", sb2);
    }

    public static w0 y(Context context, AttributeSet attributeSet, int[] iArr, int i10) {
        return new w0(context, context.obtainStyledAttributes(attributeSet, iArr, i10, 0));
    }

    public void A() {
        ((TypedArray) this.f12081c).recycle();
    }

    public FileOutputStream C() {
        File file = (File) this.f12081c;
        File file2 = (File) this.d;
        if (file2.exists()) {
            B(file2, (File) this.f12080b);
        }
        try {
            return new FileOutputStream(file);
        } catch (FileNotFoundException unused) {
            if (file.getParentFile().mkdirs()) {
                try {
                    return new FileOutputStream(file);
                } catch (FileNotFoundException e6) {
                    throw new IOException("Failed to create new file " + file, e6);
                }
            }
            throw new IOException("Failed to create directory for " + file);
        }
    }

    public void D(int i10, String str, String str2) {
        ((HashMap) this.f12080b).put(str, str2);
        ((HashMap) this.f12081c).put(str2, str);
        ((HashMap) this.d).put(str, Integer.valueOf(i10));
    }

    @Override
    public void accept(Object obj, Object obj2) {
        boolean z4;
        q5.e0 e0Var = (q5.e0) this.f12080b;
        String str = (String) this.f12081c;
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
        com.google.android.gms.internal.cast.s.c(M0, iVar);
        fVar.R0(M0, 13);
        synchronized (e0Var.f44547r) {
            try {
                if (e0Var.f44544o != null) {
                    e0Var.i(2477);
                }
                e0Var.f44544o = taskCompletionSource;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public v9.a b(Class cls, u9.d dVar) {
        ((HashMap) this.f12080b).put(cls, dVar);
        ((HashMap) this.f12081c).remove(cls);
        return this;
    }

    @Override
    public void d() {
        ((jk) this.d).N.x();
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public void f(int i10, boolean z4, boolean z10) {
        String str;
        if (!z4) {
            jk jkVar = (jk) this.d;
            HashMap hashMap = (HashMap) this.f12080b;
            ArrayList arrayList = (ArrayList) this.f12081c;
            mi miVar = jkVar.f26546b;
            if (!hashMap.isEmpty() && jkVar.N != null && !jkVar.H) {
                jkVar.H = true;
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
                org.telegram.ui.Components.z4.a0(miVar.G1, miVar.j1() + arrayList2.size(), miVar.n1(), new oh.s2(i10, 1, jkVar, arrayList2, z10));
            }
        }
    }

    @Override
    public boolean g() {
        return true;
    }

    @Override
    public boolean h() {
        return false;
    }

    @Override
    public void o(android.view.View r13, ng.q0 r14, boolean r15, boolean r16) {
        throw new UnsupportedOperationException("Method not decompiled: l7.w0.o(android.view.View, ng.q0, boolean, boolean):void");
    }

    @Override
    public void onError(k71 k71Var, Exception exc) {
        qh.g8 g8Var = ((qh.j5) this.d).K;
        if (g8Var != null) {
            g8Var.run();
        }
    }

    @Override
    public void onRenderedFirstFrame(k3.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z4, int i10) {
        qh.j5 j5Var = (qh.j5) this.d;
        qh.h5 h5Var = j5Var.H;
        k71 k71Var = j5Var.f45469e;
        if (k71Var == null) {
            return;
        }
        if (k71Var.y()) {
            AndroidUtilities.runOnUIThread(h5Var);
        } else {
            AndroidUtilities.cancelRunOnUIThread(h5Var);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((qh.j5) this.d).i();
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
        qh.j5 j5Var = (qh.j5) this.d;
        qh.s6 s6Var = (qh.s6) this.f12080b;
        if (s6Var != null) {
            qh.r6 q10 = j5Var.f45469e.q(s6Var.f46051d1);
            s6Var.f46051d1 = q10;
            y61 y61Var = j5Var.f45479n;
            if (y61Var != null) {
                y61Var.setHDRInfo(q10);
            }
        }
        int i13 = (int) (i10 * f10);
        j5Var.f45471f = i13;
        int i14 = (int) (i11 * f10);
        j5Var.h = i14;
        if (s6Var != null && (s6Var.f46065k0 != i13 || s6Var.f46067l0 != i14)) {
            s6Var.f46065k0 = i13;
            s6Var.f46067l0 = i14;
            s6Var.A();
        }
        j5Var.b();
        y61 y61Var2 = j5Var.f45479n;
        if (y61Var2 != null) {
            int i15 = j5Var.f45471f;
            int i16 = j5Var.h;
            y61Var2.d = i15;
            y61Var2.f33386e = i16;
            xz xzVar = y61Var2.f33384b;
            if (xzVar != null) {
                xzVar.postRunnable(new tz(xzVar, i15, i16, 0));
            }
        }
    }

    public com.google.android.gms.internal.clearcut.z0 p() {
        throw new UnsupportedOperationException("Method not decompiled: l7.w0.p():com.google.android.gms.internal.clearcut.z0");
    }

    public o3.o q(j3.c1 c1Var) {
        o3.e eVar;
        c1Var.f9008b.getClass();
        j3.w0 w0Var = c1Var.f9008b.f9489c;
        if (w0Var != null && h5.d0.f7237a >= 18) {
            synchronized (this.f12080b) {
                try {
                    if (!w0Var.equals((j3.w0) this.f12081c)) {
                        this.f12081c = w0Var;
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
        return o3.o.f16414k;
    }

    public ColorStateList r(int i10) {
        int resourceId;
        ColorStateList a2;
        TypedArray typedArray = (TypedArray) this.f12081c;
        if (typedArray.hasValue(i10) && (resourceId = typedArray.getResourceId(i10, 0)) != 0 && (a2 = j7.s7.a((Context) this.f12080b, resourceId)) != null) {
            return a2;
        }
        return typedArray.getColorStateList(i10);
    }

    public Drawable s(int i10) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f12081c;
        if (typedArray.hasValue(i10) && (resourceId = typedArray.getResourceId(i10, 0)) != 0) {
            return j7.s7.b((Context) this.f12080b, resourceId);
        }
        return typedArray.getDrawable(i10);
    }

    @Override
    public boolean t() {
        return false;
    }

    public String toString() {
        switch (this.f12079a) {
            case 5:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.f12080b);
                sb.append('{');
                w0 w0Var = (w0) ((w0) this.f12081c).d;
                String str = "";
                while (w0Var != null) {
                    Object obj = w0Var.f12081c;
                    sb.append(str);
                    String str2 = (String) w0Var.f12080b;
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
                return (String) this.f12080b;
            default:
                return super.toString();
        }
    }

    public Drawable u(int i10) {
        int resourceId;
        Drawable f10;
        if (((TypedArray) this.f12081c).hasValue(i10) && (resourceId = ((TypedArray) this.f12081c).getResourceId(i10, 0)) != 0) {
            m.q a2 = m.q.a();
            Context context = (Context) this.f12080b;
            synchronized (a2) {
                f10 = a2.f13302a.f(resourceId, context, true);
            }
            return f10;
        }
        return null;
    }

    public Typeface v(int i10, int i11, h5.b0 b0Var) {
        h5.b0 b0Var2;
        XmlPullParserException xmlPullParserException;
        IOException iOException;
        int resourceId = ((TypedArray) this.f12081c).getResourceId(i10, 0);
        if (resourceId != 0) {
            if (((TypedValue) this.d) == null) {
                this.d = new TypedValue();
            }
            Context context = (Context) this.f12080b;
            TypedValue typedValue = (TypedValue) this.d;
            ThreadLocal threadLocal = h0.k.f7169a;
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
                    a0.j jVar = i0.e.f7764b;
                    Typeface typeface = (Typeface) jVar.a(i0.e.b(resources, resourceId, charSequence2, i12, i11));
                    if (typeface != null) {
                        new Handler(Looper.getMainLooper()).post(new gf.c(3, b0Var, typeface));
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
                                } catch (IOException e6) {
                                    iOException = e6;
                                    b0Var2 = b0Var;
                                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                                    b0Var2.b();
                                    return null;
                                } catch (XmlPullParserException e10) {
                                    xmlPullParserException = e10;
                                    b0Var2 = b0Var;
                                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                                    b0Var2.b();
                                    return null;
                                }
                            }
                            try {
                                return i0.e.a(context, g10, resources, resourceId, charSequence2, typedValue.assetCookie, i11, b0Var);
                            } catch (IOException e11) {
                                e = e11;
                                b0Var2 = b0Var;
                                iOException = e;
                                Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                                b0Var2.b();
                                return null;
                            } catch (XmlPullParserException e12) {
                                e = e12;
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
                            Typeface e13 = i0.e.f7763a.e(context, resources, resourceId, charSequence2, i11);
                            if (e13 != null) {
                                jVar.b(i0.e.b(resources, resourceId, charSequence2, i13, i11), e13);
                            }
                            if (e13 != null) {
                                new Handler(Looper.getMainLooper()).post(new gf.c(3, b0Var2, e13));
                            } else {
                                b0Var2.b();
                            }
                            return e13;
                        } catch (IOException e14) {
                            e = e14;
                            iOException = e;
                            Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                            b0Var2.b();
                            return null;
                        } catch (XmlPullParserException e15) {
                            e = e15;
                            xmlPullParserException = e;
                            Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                            b0Var2.b();
                            return null;
                        }
                    } catch (IOException e16) {
                        e = e16;
                        b0Var2 = b0Var;
                    } catch (XmlPullParserException e17) {
                        e = e17;
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
        this.f12079a = i10;
        this.d = obj;
        this.f12080b = obj2;
        this.f12081c = obj3;
    }

    @Override
    public void onRenderedFirstFrame() {
        qh.s6 s6Var = (qh.s6) this.f12080b;
        Runnable[] runnableArr = (Runnable[]) this.f12081c;
        qh.j5 j5Var = (qh.j5) this.d;
        qh.i5 i5Var = j5Var.E;
        if (i5Var != null && i5Var.f45427g) {
            int i10 = j5Var.f45471f;
            int i11 = j5Var.h;
            i5Var.d = true;
            i5Var.f45425e = i10;
            i5Var.f45426f = i11;
            eg.p1 p1Var = i5Var.f45424c;
            if (p1Var != null) {
                p1Var.run(Integer.valueOf(i10), Integer.valueOf(i5Var.f45426f));
            }
        }
        Runnable runnable = runnableArr[0];
        if (runnable != null) {
            j5Var.post(runnable);
            runnableArr[0] = null;
            Bitmap bitmap = j5Var.f45462a;
            if (bitmap != null) {
                bitmap.recycle();
                if (s6Var.M0 == j5Var.f45462a) {
                    s6Var.M0 = null;
                }
                j5Var.f45462a = null;
                j5Var.invalidate();
                return;
            }
            return;
        }
        y61 y61Var = j5Var.f45479n;
        if (y61Var != null) {
            if (i5Var == null || !i5Var.f45427g) {
                y61Var.animate().alpha(1.0f).setDuration(180L).withEndAction(new mg1(25, this, s6Var)).start();
            }
        }
    }

    public w0(q5.e0 e0Var, String str, q5.i iVar) {
        this.f12079a = 26;
        this.f12080b = e0Var;
        this.f12081c = str;
        this.d = iVar;
    }

    public w0(int i10) {
        this.f12079a = i10;
        switch (i10) {
            case 14:
                this.f12080b = new Object();
                return;
            case 27:
                this.f12080b = new HashMap();
                this.f12081c = new HashMap();
                this.d = new HashMap();
                return;
            default:
                this.f12080b = new HashMap();
                this.f12081c = new HashMap();
                this.d = n7.x.f15788c;
                return;
        }
    }

    public w0(CastDevice castDevice, r5.e0 e0Var) {
        this.f12079a = 25;
        b6.m.i(castDevice, "CastDevice parameter cannot be null");
        this.f12080b = castDevice;
        this.f12081c = e0Var;
    }

    public w0(String str) {
        this.f12079a = 5;
        w0 w0Var = new w0(4, false);
        this.f12081c = w0Var;
        this.d = w0Var;
        this.f12080b = str;
    }

    public w0(la.b bVar, uc.h hVar) {
        this.f12079a = 12;
        this.f12080b = bVar;
        this.f12081c = hVar;
        this.d = "firebase-settings.crashlytics.com";
    }

    public w0(String str, HashMap hashMap) {
        this.f12079a = 6;
        this.f12080b = str;
        this.f12081c = hashMap;
        this.d = new HashMap();
    }

    public w0(String str, ob.j[] jVarArr) {
        this.f12079a = 17;
        System.currentTimeMillis();
        this.f12080b = str;
        this.f12081c = jVarArr;
        this.d = null;
    }

    @Override
    public void a() {
    }

    @Override
    public void m() {
    }

    public w0(File file) {
        this.f12079a = 24;
        this.f12080b = file;
        this.f12081c = new File(file.getPath() + ".new");
        this.d = new File(file.getPath() + ".bak");
    }

    @Override
    public void c(Editable editable) {
    }

    @Override
    public void onSeekFinished(k3.a aVar) {
    }

    @Override
    public void onSeekStarted(k3.a aVar) {
    }

    public w0(r3.i iVar, int i10) {
        this.f12079a = i10;
        switch (i10) {
            case 16:
                this.f12080b = new HashMap();
                new HashSet();
                this.f12081c = new HashMap();
                return;
            default:
                this.f12080b = iVar;
                return;
        }
    }

    public w0(Runnable runnable) {
        this.f12079a = 29;
        this.f12081c = new CopyOnWriteArrayList();
        this.d = new HashMap();
        this.f12080b = runnable;
    }

    public w0(Context context, TypedArray typedArray) {
        this.f12079a = 3;
        this.f12080b = context;
        this.f12081c = typedArray;
    }

    public w0(ja.c cVar) {
        this.f12079a = 13;
        this.f12079a = 13;
        this.f12080b = cVar;
        this.f12081c = Choreographer.getInstance();
        this.d = new o1.a(this, 0);
    }

    public w0(Object[] objArr, Object[] objArr2) {
        this.f12079a = 21;
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
        this.f12080b = iArr;
        this.f12081c = k(objArr, iArr);
        this.d = k(objArr2, iArr);
    }

    @Override
    public void j(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i10, boolean z4) {
    }
}
