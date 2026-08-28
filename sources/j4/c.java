package j4;

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
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.tasks.TaskCompletionSource;
import f7.t7;
import ih.j7;
import ih.s2;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.net.URL;
import java.security.Signature;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import kh.a8;
import kh.o6;
import kh.q6;
import kh.r6;
import kh.v9;
import kh.z7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Components.dy0;
import org.telegram.ui.Components.dz;
import org.telegram.ui.Components.fk;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.hz;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.ry0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.y51;
import org.telegram.ui.yp0;
import org.xmlpull.v1.XmlPullParserException;
public final class c implements r9.a, h61, com.google.android.gms.common.api.internal.s, tj0, yp0, t0.i {
    public final int f13430a;
    public Object f13431b;
    public Object f13432c;
    public Object d;

    public c(int i9, boolean z10) {
        this.f13430a = i9;
    }

    public static c E(Context context, AttributeSet attributeSet, int[] iArr, int i9) {
        return new c(context, context.obtainStyledAttributes(attributeSet, iArr, i9, 0));
    }

    public static void H(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e("AtomicFile", "Failed to delete file which is a directory " + file2);
        }
        if (!file.renameTo(file2)) {
            Log.e("AtomicFile", "Failed to rename " + file + " to " + file2);
        }
    }

    public static final URL o(c cVar) {
        Uri.Builder appendPath = new Uri.Builder().scheme("https").authority((String) cVar.d).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        ha.b bVar = (ha.b) cVar.f13431b;
        Uri.Builder appendPath2 = appendPath.appendPath(bVar.f10264a).appendPath("settings");
        ha.a aVar = bVar.f10265b;
        return new URL(appendPath2.appendQueryParameter("build_version", aVar.f10260c).appendQueryParameter("display_version", aVar.f10259b).build().toString());
    }

    public static Object[] q(Object[] objArr, int[] iArr) {
        int length = objArr.length;
        Class<?> componentType = objArr.getClass().getComponentType();
        dy0 dy0Var = ry0.N;
        int i9 = -1;
        for (int i10 : iArr) {
            i9 = Math.max(i9, i10);
        }
        Object[] objArr2 = (Object[]) Array.newInstance(componentType, i9 + 1);
        for (int i11 = 0; i11 < length; i11++) {
            objArr2[iArr[i11]] = objArr[i11];
        }
        return objArr2;
    }

    public int A(pb.e eVar) {
        ArrayList arrayList = (ArrayList) this.f13431b;
        int size = arrayList.size();
        int i9 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            rb.f fVar = (rb.f) obj;
            int i11 = fVar.d;
            pb.d dVar = fVar.f47123a;
            int a2 = dVar.a(eVar);
            int i12 = a2 + 4;
            int ordinal = dVar.ordinal();
            int i13 = 4;
            if (ordinal != 1) {
                int i14 = 6;
                if (ordinal != 2) {
                    if (ordinal != 4) {
                        if (ordinal != 5) {
                            if (ordinal == 6) {
                                i12 += i11 * 13;
                            }
                        } else {
                            i12 = a2 + 12;
                        }
                    } else {
                        i12 += fVar.a() * 8;
                    }
                } else {
                    int i15 = ((i11 / 2) * 11) + i12;
                    if (i11 % 2 != 1) {
                        i14 = 0;
                    }
                    i12 = i15 + i14;
                }
            } else {
                int i16 = ((i11 / 3) * 10) + i12;
                int i17 = i11 % 3;
                if (i17 != 1) {
                    if (i17 == 2) {
                        i13 = 7;
                    } else {
                        i13 = 0;
                    }
                }
                i12 = i16 + i13;
            }
            i9 += i12;
        }
        return i9;
    }

    public boolean B() {
        String trim;
        ArrayDeque arrayDeque = (ArrayDeque) this.f13432c;
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
            String readLine = ((BufferedReader) this.f13431b).readLine();
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

    public void C(com.google.android.exoplayer2.upstream.m r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, j4.s0 r15) {
        throw new UnsupportedOperationException("Method not decompiled: j4.c.C(com.google.android.exoplayer2.upstream.m, android.net.Uri, java.util.Map, long, long, j4.s0):void");
    }

    public String D() {
        if (B()) {
            String str = (String) this.d;
            this.d = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    public void F(kb.i iVar, Object obj) {
        if (((EnumMap) this.d) == null) {
            this.d = new EnumMap(kb.i.class);
        }
        ((EnumMap) this.d).put((EnumMap) iVar, (kb.i) obj);
    }

    public void G() {
        ((TypedArray) this.f13432c).recycle();
    }

    public FileOutputStream I() {
        File file = (File) this.f13432c;
        File file2 = (File) this.d;
        if (file2.exists()) {
            H(file2, (File) this.f13431b);
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

    public void J(int i9, String str, String str2) {
        ((HashMap) this.f13431b).put(str, str2);
        ((HashMap) this.f13432c).put(str2, str);
        ((HashMap) this.d).put(str, Integer.valueOf(i9));
    }

    @Override
    public void accept(Object obj, Object obj2) {
        boolean z10;
        m5.f0 f0Var = (m5.f0) this.f13431b;
        String str = (String) this.f13432c;
        m5.i iVar = (m5.i) this.d;
        q5.x xVar = (q5.x) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        if (f0Var.F == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        x5.l.j("Not connected to device", z10);
        q5.f fVar = (q5.f) xVar.u();
        Parcel M0 = fVar.M0();
        M0.writeString(str);
        com.google.android.gms.internal.cast.u.c(M0, iVar);
        fVar.R0(M0, 13);
        synchronized (f0Var.f17400r) {
            try {
                if (f0Var.f17397o != null) {
                    f0Var.i(2477);
                }
                f0Var.f17397o = taskCompletionSource;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public Uri c() {
        return (Uri) this.f13431b;
    }

    @Override
    public void d(android.view.View r13, hg.r0 r14, boolean r15, boolean r16) {
        throw new UnsupportedOperationException("Method not decompiled: j4.c.d(android.view.View, hg.r0, boolean, boolean):void");
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public Uri g() {
        return (Uri) this.d;
    }

    @Override
    public void h() {
        ((fk) this.d).M.x();
    }

    @Override
    public void i(int i9, boolean z10, boolean z11) {
        String str;
        if (!z10) {
            fk fkVar = (fk) this.d;
            HashMap hashMap = (HashMap) this.f13431b;
            ArrayList arrayList = (ArrayList) this.f13432c;
            ki kiVar = fkVar.f27493b;
            if (!hashMap.isEmpty() && fkVar.M != null && !fkVar.G) {
                fkVar.G = true;
                ArrayList arrayList2 = new ArrayList();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    Object obj = hashMap.get(arrayList.get(i10));
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
                y4.a0(kiVar.F1, kiVar.j1() + arrayList2.size(), kiVar.n1(), new s2(i9, 1, fkVar, arrayList2, z11));
            }
        }
    }

    @Override
    public ClipDescription j() {
        return (ClipDescription) this.f13432c;
    }

    @Override
    public Object k() {
        return null;
    }

    @Override
    public r9.a l(Class cls, q9.d dVar) {
        ((HashMap) this.f13431b).put(cls, dVar);
        ((HashMap) this.f13432c).remove(cls);
        return this;
    }

    @Override
    public boolean n() {
        return true;
    }

    @Override
    public void onError(k61 k61Var, Exception exc) {
        v9 v9Var = ((r6) this.d).J;
        if (v9Var != null) {
            v9Var.run();
        }
    }

    @Override
    public void onRenderedFirstFrame(i3.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i9) {
        r6 r6Var = (r6) this.d;
        o6 o6Var = r6Var.G;
        k61 k61Var = r6Var.f15936e;
        if (k61Var == null) {
            return;
        }
        if (k61Var.z()) {
            AndroidUtilities.runOnUIThread(o6Var);
        } else {
            AndroidUtilities.cancelRunOnUIThread(o6Var);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((r6) this.d).i();
    }

    @Override
    public void onVideoSizeChanged(int i9, int i10, int i11, float f10) {
        r6 r6Var = (r6) this.d;
        a8 a8Var = (a8) this.f13431b;
        if (a8Var != null) {
            z7 r10 = r6Var.f15936e.r(a8Var.f14911d1);
            a8Var.f14911d1 = r10;
            y51 y51Var = r6Var.f15946n;
            if (y51Var != null) {
                y51Var.setHDRInfo(r10);
            }
        }
        int i12 = (int) (i9 * f10);
        r6Var.f15938f = i12;
        int i13 = (int) (i10 * f10);
        r6Var.h = i13;
        if (a8Var != null && (a8Var.f14925k0 != i12 || a8Var.f14927l0 != i13)) {
            a8Var.f14925k0 = i12;
            a8Var.f14927l0 = i13;
            a8Var.A();
        }
        r6Var.b();
        y51 y51Var2 = r6Var.f15946n;
        if (y51Var2 != null) {
            int i14 = r6Var.f15938f;
            int i15 = r6Var.h;
            y51Var2.d = i14;
            y51Var2.f34864e = i15;
            hz hzVar = y51Var2.f34862b;
            if (hzVar != null) {
                hzVar.postRunnable(new dz(hzVar, i14, i15, 0));
            }
        }
    }

    @Override
    public boolean p() {
        return false;
    }

    public Object r(Bitmap bitmap) {
        og.a aVar = (og.a) this.f13431b;
        if (aVar.a(bitmap)) {
            this.d = ((og.b) this.f13432c).a(bitmap);
            aVar.b(bitmap);
        }
        return this.d;
    }

    public String toString() {
        switch (this.f13430a) {
            case 8:
                return (String) this.f13431b;
            case 27:
                StringBuilder sb2 = new StringBuilder();
                ArrayList arrayList = (ArrayList) this.f13431b;
                int size = arrayList.size();
                rb.f fVar = null;
                int i9 = 0;
                while (i9 < size) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    rb.f fVar2 = (rb.f) obj;
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

    @Override
    public boolean u() {
        return false;
    }

    public ColorStateList v(int i9) {
        int resourceId;
        ColorStateList a2;
        TypedArray typedArray = (TypedArray) this.f13432c;
        if (typedArray.hasValue(i9) && (resourceId = typedArray.getResourceId(i9, 0)) != 0 && (a2 = t7.a((Context) this.f13431b, resourceId)) != null) {
            return a2;
        }
        return typedArray.getColorStateList(i9);
    }

    public Drawable w(int i9) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f13432c;
        if (typedArray.hasValue(i9) && (resourceId = typedArray.getResourceId(i9, 0)) != 0) {
            return t7.b((Context) this.f13431b, resourceId);
        }
        return typedArray.getDrawable(i9);
    }

    public Drawable x(int i9) {
        int resourceId;
        Drawable f10;
        if (((TypedArray) this.f13432c).hasValue(i9) && (resourceId = ((TypedArray) this.f13432c).getResourceId(i9, 0)) != 0) {
            m.r a2 = m.r.a();
            Context context = (Context) this.f13431b;
            synchronized (a2) {
                f10 = a2.f17064a.f(resourceId, context, true);
            }
            return f10;
        }
        return null;
    }

    public Typeface y(int i9, int i10, d5.d0 d0Var) {
        d5.d0 d0Var2;
        XmlPullParserException xmlPullParserException;
        IOException iOException;
        int resourceId = ((TypedArray) this.f13432c).getResourceId(i9, 0);
        if (resourceId != 0) {
            if (((TypedValue) this.d) == null) {
                this.d = new TypedValue();
            }
            Context context = (Context) this.f13431b;
            TypedValue typedValue = (TypedValue) this.d;
            ThreadLocal threadLocal = h0.k.f9296a;
            if (!context.isRestricted()) {
                Resources resources = context.getResources();
                resources.getValue(resourceId, typedValue, true);
                CharSequence charSequence = typedValue.string;
                if (charSequence != null) {
                    String charSequence2 = charSequence.toString();
                    if (!charSequence2.startsWith("res/")) {
                        d0Var.a();
                        return null;
                    }
                    int i11 = typedValue.assetCookie;
                    a0.j jVar = i0.e.f10855b;
                    Typeface typeface = (Typeface) jVar.a(i0.e.b(resources, resourceId, charSequence2, i11, i10));
                    if (typeface != null) {
                        new Handler(Looper.getMainLooper()).post(new e5.u(28, d0Var, typeface));
                        return typeface;
                    }
                    try {
                        if (charSequence2.toLowerCase().endsWith(".xml")) {
                            h0.d g10 = h0.b.g(resources.getXml(resourceId), resources);
                            if (g10 == null) {
                                try {
                                    Log.e("ResourcesCompat", "Failed to find font-family tag");
                                    d0Var.a();
                                    return null;
                                } catch (IOException e10) {
                                    iOException = e10;
                                    d0Var2 = d0Var;
                                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                                    d0Var2.a();
                                    return null;
                                } catch (XmlPullParserException e11) {
                                    xmlPullParserException = e11;
                                    d0Var2 = d0Var;
                                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                                    d0Var2.a();
                                    return null;
                                }
                            }
                            try {
                                return i0.e.a(context, g10, resources, resourceId, charSequence2, typedValue.assetCookie, i10, d0Var);
                            } catch (IOException e12) {
                                e = e12;
                                d0Var2 = d0Var;
                                iOException = e;
                                Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                                d0Var2.a();
                                return null;
                            } catch (XmlPullParserException e13) {
                                e = e13;
                                d0Var2 = d0Var;
                                xmlPullParserException = e;
                                Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                                d0Var2.a();
                                return null;
                            }
                        }
                        d0Var2 = d0Var;
                        try {
                            int i12 = typedValue.assetCookie;
                            Typeface e14 = i0.e.f10854a.e(context, resources, resourceId, charSequence2, i10);
                            if (e14 != null) {
                                jVar.b(i0.e.b(resources, resourceId, charSequence2, i12, i10), e14);
                            }
                            if (e14 != null) {
                                new Handler(Looper.getMainLooper()).post(new e5.u(28, d0Var2, e14));
                            } else {
                                d0Var2.a();
                            }
                            return e14;
                        } catch (IOException e15) {
                            e = e15;
                            iOException = e;
                            Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                            d0Var2.a();
                            return null;
                        } catch (XmlPullParserException e16) {
                            e = e16;
                            xmlPullParserException = e;
                            Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                            d0Var2.a();
                            return null;
                        }
                    } catch (IOException e17) {
                        e = e17;
                        d0Var2 = d0Var;
                    } catch (XmlPullParserException e18) {
                        e = e18;
                        d0Var2 = d0Var;
                    }
                } else {
                    throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(resourceId) + "\" (" + Integer.toHexString(resourceId) + ") is not a Font: " + typedValue);
                }
            }
        }
        return null;
    }

    public void z(r7.f fVar) {
        try {
            s7.g gVar = (s7.g) this.f13432c;
            r7.i iVar = new r7.i(fVar);
            Parcel M0 = gVar.M0();
            c7.b.c(M0, iVar);
            gVar.Q0(M0, 9);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public c(Object obj, Object obj2, Object obj3, int i9) {
        this.f13430a = i9;
        this.d = obj;
        this.f13431b = obj2;
        this.f13432c = obj3;
    }

    @Override
    public void onRenderedFirstFrame() {
        a8 a8Var = (a8) this.f13431b;
        Runnable[] runnableArr = (Runnable[]) this.f13432c;
        r6 r6Var = (r6) this.d;
        q6 q6Var = r6Var.D;
        if (q6Var != null && q6Var.f15884g) {
            int i9 = r6Var.f15938f;
            int i10 = r6Var.h;
            q6Var.d = true;
            q6Var.f15882e = i9;
            q6Var.f15883f = i10;
            yf.w0 w0Var = q6Var.f15881c;
            if (w0Var != null) {
                w0Var.run(Integer.valueOf(i9), Integer.valueOf(q6Var.f15883f));
            }
        }
        Runnable runnable = runnableArr[0];
        if (runnable != null) {
            r6Var.post(runnable);
            runnableArr[0] = null;
            Bitmap bitmap = r6Var.f15929a;
            if (bitmap != null) {
                bitmap.recycle();
                if (a8Var.M0 == r6Var.f15929a) {
                    a8Var.M0 = null;
                }
                r6Var.f15929a = null;
                r6Var.invalidate();
                return;
            }
            return;
        }
        y51 y51Var = r6Var.f15946n;
        if (y51Var != null) {
            if (q6Var == null || !q6Var.f15884g) {
                y51Var.animate().alpha(1.0f).setDuration(180L).withEndAction(new j7(19, this, a8Var)).start();
            }
        }
    }

    public c(Object obj, Object obj2, Object obj3, boolean z10, int i9) {
        this.f13430a = i9;
        this.f13431b = obj;
        this.f13432c = obj2;
        this.d = obj3;
    }

    public c(int i9) {
        this.f13430a = i9;
        switch (i9) {
            case 13:
                this.f13431b = new HashMap();
                this.f13432c = new HashMap();
                this.d = new HashMap();
                return;
            default:
                this.f13431b = new HashMap();
                this.f13432c = new HashMap();
                this.d = j7.x.f14175c;
                return;
        }
    }

    public c(CastDevice castDevice, n5.f0 f0Var) {
        this.f13430a = 11;
        x5.l.i(castDevice, "CastDevice parameter cannot be null");
        this.f13431b = castDevice;
        this.f13432c = f0Var;
    }

    public c(o5.h hVar) {
        this.f13430a = 15;
        this.d = hVar;
        this.f13432c = new AtomicLong((q5.a.f46008b.nextLong() & 65535) * 10000);
    }

    public c(r7.d dVar, s7.g gVar) {
        this.f13430a = 26;
        this.f13432c = gVar;
        x5.l.h(dVar);
        this.f13431b = dVar;
    }

    public c(og.b bVar) {
        this.f13430a = 16;
        this.f13431b = new og.a();
        this.f13432c = bVar;
    }

    public c(ha.b bVar, qc.h hVar) {
        this.f13430a = 6;
        this.f13431b = bVar;
        this.f13432c = hVar;
        this.d = "firebase-settings.crashlytics.com";
    }

    public c(String str, kb.j[] jVarArr) {
        this.f13430a = 8;
        System.currentTimeMillis();
        this.f13431b = str;
        this.f13432c = jVarArr;
        this.d = null;
    }

    @Override
    public void a() {
    }

    @Override
    public void f() {
    }

    @Override
    public void m() {
    }

    @Override
    public void t() {
    }

    public c(m3.i iVar) {
        this.f13430a = 0;
        this.f13431b = iVar;
    }

    @Override
    public void b(Editable editable) {
    }

    @Override
    public void onSeekFinished(i3.a aVar) {
    }

    @Override
    public void onSeekStarted(i3.a aVar) {
    }

    public c(File file) {
        this.f13430a = 24;
        this.f13431b = file;
        this.f13432c = new File(file.getPath() + ".new");
        this.d = new File(file.getPath() + ".bak");
    }

    public c(Runnable runnable) {
        this.f13430a = 25;
        this.f13432c = new CopyOnWriteArrayList();
        this.d = new HashMap();
        this.f13431b = runnable;
    }

    public c(Context context, TypedArray typedArray) {
        this.f13430a = 10;
        this.f13431b = context;
        this.f13432c = typedArray;
    }

    public c(Signature signature) {
        this.f13430a = 7;
        this.f13431b = signature;
        this.f13432c = null;
        this.d = null;
    }

    public c(m5.c0 c0Var) {
        this.f13430a = 14;
        this.f13430a = 14;
        this.f13431b = c0Var;
        this.f13432c = Choreographer.getInstance();
        this.d = new o1.a(this, 0);
    }

    public c(Cipher cipher) {
        this.f13430a = 7;
        this.f13432c = cipher;
        this.f13431b = null;
        this.d = null;
    }

    public c(Mac mac) {
        this.f13430a = 7;
        this.d = mac;
        this.f13432c = null;
        this.f13431b = null;
    }

    public c(com.google.firebase.messaging.l lVar, pb.e eVar, rb.e eVar2) {
        pb.d dVar;
        int i9;
        int i10;
        this.f13430a = 27;
        this.d = lVar;
        this.f13431b = new ArrayList();
        rb.e eVar3 = eVar2;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            dVar = pb.d.ECI;
            if (eVar3 == null) {
                break;
            }
            int i13 = eVar3.f47120c;
            int i14 = i11 + eVar3.d;
            rb.e eVar4 = eVar3.f47121e;
            int i15 = i12;
            pb.d dVar2 = eVar3.f47118a;
            boolean z10 = (dVar2 == pb.d.BYTE && eVar4 == null && i13 != 0) || !(eVar4 == null || i13 == eVar4.f47120c);
            i9 = z10 ? 1 : i15;
            if (eVar4 == null || eVar4.f47118a != dVar2 || z10) {
                ((ArrayList) this.f13431b).add(0, new rb.f(this, dVar2, eVar3.f47119b, i13, i14));
                i10 = 0;
            } else {
                i10 = i14;
            }
            if (z10) {
                ((ArrayList) this.f13431b).add(0, new rb.f(this, dVar, eVar3.f47119b, eVar3.f47120c, 0));
            }
            i12 = i9;
            eVar3 = eVar4;
            i11 = i10;
        }
        int i16 = i12;
        boolean z11 = lVar.f4157a;
        pb.b bVar = (pb.b) lVar.d;
        if (z11) {
            rb.f fVar = (rb.f) ((ArrayList) this.f13431b).get(0);
            if (fVar != null && fVar.f47123a != dVar && i16 != 0) {
                ((ArrayList) this.f13431b).add(0, new rb.f(this, dVar, 0, 0, 0));
            }
            ((ArrayList) this.f13431b).add(((rb.f) ((ArrayList) this.f13431b).get(0)).f47123a == dVar ? 1 : 0, new rb.f(this, pb.d.FNC1_FIRST_POSITION, 0, 0, 0));
        }
        int i17 = eVar.f45528a;
        int i18 = 26;
        int b10 = m1.j.b(i17 <= 9 ? 1 : i17 <= 26 ? 2 : 3);
        if (b10 == 0) {
            i18 = 9;
        } else if (b10 != 1) {
            i9 = 27;
            i18 = 40;
        } else {
            i9 = 10;
        }
        int A = A(eVar);
        while (i17 < i18 && !rb.c.c(A, pb.e.c(i17), bVar)) {
            i17++;
        }
        while (i17 > i9 && rb.c.c(A, pb.e.c(i17 - 1), bVar)) {
            i17--;
        }
        this.f13432c = pb.e.c(i17);
    }

    public c(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.f13430a = 23;
        this.f13432c = arrayDeque;
        this.f13431b = bufferedReader;
    }

    public c(Object[] objArr, Object[] objArr2) {
        this.f13430a = 20;
        int length = objArr.length;
        int[] iArr = new int[length];
        HashMap hashMap = new HashMap();
        for (int i9 = 0; i9 < length; i9++) {
            Object obj = objArr[i9];
            Integer num = (Integer) hashMap.get(obj);
            if (num == null) {
                num = Integer.valueOf(hashMap.size());
                hashMap.put(obj, num);
            }
            iArr[i9] = num.intValue();
        }
        this.f13431b = iArr;
        this.f13432c = q(objArr, iArr);
        this.d = q(objArr2, iArr);
    }

    @Override
    public void s(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i9, boolean z10) {
    }
}
