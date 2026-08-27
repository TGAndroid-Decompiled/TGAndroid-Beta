package j9;

import a0.j;
import a9.p;
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
import android.view.View;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.internal.cast.t;
import com.google.android.gms.internal.clearcut.a1;
import com.google.android.gms.tasks.TaskCompletionSource;
import d5.e0;
import d5.u;
import g7.o7;
import h0.d;
import h0.k;
import i0.f;
import ia.b;
import ig.o0;
import ig.q0;
import ig.r0;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.net.URL;
import java.net.URLEncoder;
import java.security.Signature;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.net.ssl.HttpsURLConnection;
import jh.r2;
import lh.m6;
import lh.p6;
import lh.q6;
import lh.s9;
import lh.y7;
import lh.z7;
import m.r;
import m5.f0;
import o5.h;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Cells.a0;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Cells.v0;
import org.telegram.ui.Components.a61;
import org.telegram.ui.Components.bk;
import org.telegram.ui.Components.fy0;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.jz;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.ty0;
import org.telegram.ui.Components.vj0;
import org.telegram.ui.Components.wj0;
import org.telegram.ui.Components.y4;
import org.telegram.ui.rn;
import org.telegram.ui.zp0;
import org.xmlpull.v1.XmlPullParserException;
import qb.e;
import r5.x;
import s3.c;
import t0.i;
import t7.g;
import y5.l;
import zf.w0;

public final class a implements s9.a, j61, s, vj0, zp0, i {

    public final int f12862a;

    public Object f12863b;

    public Object f12864c;
    public Object d;

    public a(int i10, boolean z10) {
        this.f12862a = i10;
    }

    public static a G(Context context, AttributeSet attributeSet, int[] iArr, int i10) {
        return new a(context, context.obtainStyledAttributes(attributeSet, iArr, i10, 0));
    }

    public static void J(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e("AtomicFile", "Failed to delete file which is a directory " + file2);
        }
        if (file.renameTo(file2)) {
            return;
        }
        Log.e("AtomicFile", "Failed to rename " + file + " to " + file2);
    }

    public static final URL p(a aVar) {
        Uri.Builder builderAppendPath = new Uri.Builder().scheme("https").authority((String) aVar.f12863b).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        b bVar = (b) aVar.f12864c;
        Uri.Builder builderAppendPath2 = builderAppendPath.appendPath(bVar.f10973a).appendPath("settings");
        ia.a aVar2 = bVar.f10974b;
        return new URL(builderAppendPath2.appendQueryParameter("build_version", aVar2.f10968c).appendQueryParameter("display_version", aVar2.f10967b).build().toString());
    }

    public static Object[] q(Object[] objArr, int[] iArr) {
        int length = objArr.length;
        Class<?> componentType = objArr.getClass().getComponentType();
        fy0 fy0Var = ty0.N;
        int iMax = -1;
        for (int i10 : iArr) {
            iMax = Math.max(iMax, i10);
        }
        Object[] objArr2 = (Object[]) Array.newInstance(componentType, iMax + 1);
        for (int i11 = 0; i11 < length; i11++) {
            objArr2[iArr[i11]] = objArr[i11];
        }
        return objArr2;
    }

    public static String u(String str, HashMap map) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = map.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb2.append((String) entry.getKey());
        sb2.append("=");
        sb2.append(entry.getValue() != null ? URLEncoder.encode((String) entry.getValue(), "UTF-8") : "");
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb2.append("&");
            sb2.append((String) entry2.getKey());
            sb2.append("=");
            sb2.append(entry2.getValue() != null ? URLEncoder.encode((String) entry2.getValue(), "UTF-8") : "");
        }
        String string = sb2.toString();
        if (string.isEmpty()) {
            return str;
        }
        if (!str.contains("?")) {
            return p.w(str, "?", string);
        }
        if (!str.endsWith("&")) {
            string = "&".concat(string);
        }
        return c.l(str, string);
    }

    public Typeface A(int i10, int i11, e0 e0Var) {
        e0 e0Var2;
        XmlPullParserException xmlPullParserException;
        IOException iOException;
        int resourceId = ((TypedArray) this.f12864c).getResourceId(i10, 0);
        if (resourceId != 0) {
            if (((TypedValue) this.d) == null) {
                this.d = new TypedValue();
            }
            Context context = (Context) this.f12863b;
            TypedValue typedValue = (TypedValue) this.d;
            ThreadLocal threadLocal = k.f7728a;
            if (!context.isRestricted()) {
                Resources resources = context.getResources();
                resources.getValue(resourceId, typedValue, true);
                CharSequence charSequence = typedValue.string;
                if (charSequence == null) {
                    throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(resourceId) + "\" (" + Integer.toHexString(resourceId) + ") is not a Font: " + typedValue);
                }
                String string = charSequence.toString();
                if (!string.startsWith("res/")) {
                    e0Var.a();
                    return null;
                }
                int i12 = typedValue.assetCookie;
                j jVar = f.f10496b;
                Typeface typeface = (Typeface) jVar.a(f.b(resources, resourceId, string, i12, i11));
                int i13 = 15;
                if (typeface != null) {
                    new Handler(Looper.getMainLooper()).post(new u(i13, e0Var, typeface));
                    return typeface;
                }
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        d dVarG = h0.b.g(resources.getXml(resourceId), resources);
                        if (dVarG == null) {
                            try {
                                Log.e("ResourcesCompat", "Failed to find font-family tag");
                                e0Var.a();
                                return null;
                            } catch (IOException e9) {
                                iOException = e9;
                                e0Var2 = e0Var;
                            } catch (XmlPullParserException e10) {
                                xmlPullParserException = e10;
                                e0Var2 = e0Var;
                                Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), xmlPullParserException);
                                e0Var2.a();
                                return null;
                            }
                        } else {
                            try {
                                return f.a(context, dVarG, resources, resourceId, string, typedValue.assetCookie, i11, e0Var);
                            } catch (IOException e11) {
                                e = e11;
                                e0Var2 = e0Var;
                            } catch (XmlPullParserException e12) {
                                e = e12;
                                e0Var2 = e0Var;
                                xmlPullParserException = e;
                                Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), xmlPullParserException);
                                e0Var2.a();
                                return null;
                            }
                        }
                        iOException = e;
                        Log.e("ResourcesCompat", "Failed to read xml resource ".concat(string), iOException);
                    } else {
                        e0Var2 = e0Var;
                        try {
                            int i14 = typedValue.assetCookie;
                            Typeface typefaceE = f.f10495a.e(context, resources, resourceId, string, i11);
                            if (typefaceE != null) {
                                jVar.b(f.b(resources, resourceId, string, i14, i11), typefaceE);
                            }
                            if (typefaceE != null) {
                                new Handler(Looper.getMainLooper()).post(new u(i13, e0Var2, typefaceE));
                            } else {
                                e0Var2.a();
                            }
                            return typefaceE;
                        } catch (IOException e13) {
                            e = e13;
                        } catch (XmlPullParserException e14) {
                            e = e14;
                            xmlPullParserException = e;
                            Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), xmlPullParserException);
                            e0Var2.a();
                            return null;
                        }
                    }
                } catch (IOException e15) {
                    e = e15;
                    e0Var2 = e0Var;
                } catch (XmlPullParserException e16) {
                    e = e16;
                    e0Var2 = e0Var;
                }
                e0Var2.a();
                return null;
            }
        }
        return null;
    }

    public void B(s7.f fVar) {
        try {
            g gVar = (g) this.f12864c;
            s7.i iVar = new s7.i(fVar);
            Parcel parcelM0 = gVar.M0();
            d7.b.c(parcelM0, iVar);
            gVar.Q0(parcelM0, 9);
        } catch (RemoteException e9) {
            throw new a7.c(e9);
        }
    }

    public int C(e eVar) {
        ArrayList arrayList = (ArrayList) this.f12863b;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            sb.f fVar = (sb.f) obj;
            int i12 = fVar.d;
            qb.d dVar = fVar.f47843a;
            int iA = dVar.a(eVar);
            int iA2 = iA + 4;
            int iOrdinal = dVar.ordinal();
            int i13 = 4;
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    iA2 = ((i12 / 2) * 11) + iA2 + (i12 % 2 != 1 ? 0 : 6);
                } else if (iOrdinal == 4) {
                    iA2 += fVar.a() * 8;
                } else if (iOrdinal == 5) {
                    iA2 = iA + 12;
                } else if (iOrdinal == 6) {
                    iA2 += i12 * 13;
                }
            } else {
                int i14 = ((i12 / 3) * 10) + iA2;
                int i15 = i12 % 3;
                if (i15 != 1) {
                    i13 = i15 == 2 ? 7 : 0;
                }
                iA2 = i14 + i13;
            }
            i10 += iA2;
        }
        return i10;
    }

    public boolean D() throws IOException {
        String strTrim;
        ArrayDeque arrayDeque = (ArrayDeque) this.d;
        if (((String) this.f12863b) == null) {
            if (!arrayDeque.isEmpty()) {
                String str = (String) arrayDeque.poll();
                str.getClass();
                this.f12863b = str;
                return true;
            }
            do {
                String line = ((BufferedReader) this.f12864c).readLine();
                this.f12863b = line;
                if (line == null) {
                    return false;
                }
                strTrim = line.trim();
                this.f12863b = strTrim;
            } while (strTrim.isEmpty());
        }
        return true;
    }

    public void E(String str, String str2) {
        ((HashMap) this.d).put(str, str2);
    }

    public String F() {
        if (!D()) {
            throw new NoSuchElementException();
        }
        String str = (String) this.f12863b;
        this.f12863b = null;
        return str;
    }

    public void H(lb.i iVar, Object obj) {
        if (((EnumMap) this.d) == null) {
            this.d = new EnumMap(lb.i.class);
        }
        ((EnumMap) this.d).put(iVar, obj);
    }

    public void I() {
        ((TypedArray) this.f12864c).recycle();
    }

    public FileOutputStream K() throws IOException {
        File file = (File) this.f12864c;
        File file2 = (File) this.d;
        if (file2.exists()) {
            J(file2, (File) this.f12863b);
        }
        try {
            return new FileOutputStream(file);
        } catch (FileNotFoundException unused) {
            if (!file.getParentFile().mkdirs()) {
                throw new IOException("Failed to create directory for " + file);
            }
            try {
                return new FileOutputStream(file);
            } catch (FileNotFoundException e9) {
                throw new IOException("Failed to create new file " + file, e9);
            }
        }
    }

    public void L(int i10, String str, String str2) {
        ((HashMap) this.f12864c).put(str, str2);
        ((HashMap) this.d).put(str2, str);
        ((HashMap) this.f12863b).put(str, Integer.valueOf(i10));
    }

    @Override
    public void accept(Object obj, Object obj2) {
        f0 f0Var = (f0) this.f12864c;
        String str = (String) this.f12863b;
        m5.i iVar = (m5.i) this.d;
        x xVar = (x) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        l.j("Not connected to device", f0Var.F == 2);
        r5.f fVar = (r5.f) xVar.u();
        Parcel parcelM0 = fVar.M0();
        parcelM0.writeString(str);
        t.c(parcelM0, iVar);
        fVar.R0(parcelM0, 13);
        synchronized (f0Var.f17777r) {
            try {
                if (f0Var.f17774o != null) {
                    f0Var.i(2477);
                }
                f0Var.f17774o = taskCompletionSource;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public Uri c() {
        return (Uri) this.f12863b;
    }

    @Override
    public s9.a d(Class cls, r9.d dVar) {
        ((HashMap) this.f12864c).put(cls, dVar);
        ((HashMap) this.d).remove(cls);
        return this;
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
        ((bk) this.d).M.y();
    }

    @Override
    public void i(int i10, boolean z10, boolean z11) {
        if (z10) {
            return;
        }
        bk bkVar = (bk) this.d;
        HashMap map = (HashMap) this.f12864c;
        ArrayList arrayList = (ArrayList) this.f12863b;
        gi giVar = bkVar.f34900b;
        if (map.isEmpty() || bkVar.M == null || bkVar.G) {
            return;
        }
        bkVar.G = true;
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            Object obj = map.get(arrayList.get(i11));
            SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
            arrayList2.add(sendingMediaInfo);
            if (obj instanceof MediaController.PhotoEntry) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                String str = photoEntry.imagePath;
                if (str != null) {
                    sendingMediaInfo.path = str;
                } else {
                    sendingMediaInfo.path = photoEntry.path;
                }
                sendingMediaInfo.thumbPath = photoEntry.thumbPath;
                sendingMediaInfo.coverPath = photoEntry.coverPath;
                sendingMediaInfo.videoEditedInfo = photoEntry.editedInfo;
                sendingMediaInfo.isVideo = photoEntry.isVideo;
                CharSequence charSequence = photoEntry.caption;
                sendingMediaInfo.caption = charSequence != null ? charSequence.toString() : null;
                sendingMediaInfo.entities = photoEntry.entities;
                sendingMediaInfo.masks = photoEntry.stickers;
                sendingMediaInfo.ttl = photoEntry.ttl;
            }
        }
        y4.a0(giVar.F1, giVar.j1() + arrayList2.size(), giVar.n1(), new r2(i10, 1, bkVar, arrayList2, z11));
    }

    @Override
    public boolean j() {
        return true;
    }

    @Override
    public ClipDescription k() {
        return (ClipDescription) this.f12864c;
    }

    @Override
    public Object l() {
        return null;
    }

    @Override
    public boolean m() {
        return false;
    }

    @Override
    public void n(View view, q0 q0Var, boolean z10, boolean z11) {
        float f10;
        r0 r0Var;
        o0 o0VarL;
        float f11;
        int i10;
        boolean z12;
        float f12;
        rn rnVar = (rn) this.d;
        a0 a0VarQ8 = rnVar.q8(((MessageObject) this.f12863b).getId(), true);
        float f13 = 0.0f;
        if (!(a0VarQ8 instanceof s1)) {
            if (!(a0VarQ8 instanceof v0) || (o0VarL = (r0Var = ((v0) a0VarQ8).f25785y0).l(q0Var)) == null) {
                f10 = 0.0f;
            } else {
                f13 = r0Var.f11420c + o0VarL.f11404x + (o0VarL.A / 2.0f);
                f11 = r0Var.d + o0VarL.f11405y;
                i10 = o0VarL.B;
            }
            if (q0Var == null) {
                z12 = z10;
            } else {
                z12 = z10;
            }
            rnVar.ab(a0VarQ8, (MessageObject) this.f12863b, (wj0) this.f12864c, view, f13, f10, q0Var, false, z12, z11, false);
        }
        r0 r0Var2 = ((s1) a0VarQ8).J;
        o0 o0VarL2 = r0Var2.l(q0Var);
        if (o0VarL2 != null) {
            f13 = r0Var2.f11420c + o0VarL2.f11404x + (o0VarL2.A / 2.0f);
            f11 = r0Var2.d + o0VarL2.f11405y;
            i10 = o0VarL2.B;
        } else {
            f12 = 0.0f;
        }
        f10 = f12;
        if (q0Var == null && q0Var.f11408a) {
            z12 = true;
        } else {
            z12 = z10;
        }
        rnVar.ab(a0VarQ8, (MessageObject) this.f12863b, (wj0) this.f12864c, view, f13, f10, q0Var, false, z12, z11, false);
        f12 = f11 + (i10 / 2.0f);
        f10 = f12;
        if (q0Var == null) {
            z12 = z10;
        } else {
            z12 = z10;
        }
        rnVar.ab(a0VarQ8, (MessageObject) this.f12863b, (wj0) this.f12864c, view, f13, f10, q0Var, false, z12, z11, false);
    }

    @Override
    public void onError(m61 m61Var, Exception exc) {
        s9 s9Var = ((q6) this.d).J;
        if (s9Var != null) {
            s9Var.run();
        }
    }

    @Override
    public void onRenderedFirstFrame(i3.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        q6 q6Var = (q6) this.d;
        m6 m6Var = q6Var.G;
        m61 m61Var = q6Var.f16565e;
        if (m61Var == null) {
            return;
        }
        if (m61Var.z()) {
            AndroidUtilities.runOnUIThread(m6Var);
        } else {
            AndroidUtilities.cancelRunOnUIThread(m6Var);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((q6) this.d).i();
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
        q6 q6Var = (q6) this.d;
        z7 z7Var = (z7) this.f12863b;
        if (z7Var != null) {
            y7 y7VarR = q6Var.f16565e.r(z7Var.f17203d1);
            z7Var.f17203d1 = y7VarR;
            a61 a61Var = q6Var.f16575n;
            if (a61Var != null) {
                a61Var.setHDRInfo(y7VarR);
            }
        }
        int i13 = (int) (i10 * f10);
        q6Var.f16567f = i13;
        int i14 = (int) (i11 * f10);
        q6Var.h = i14;
        if (z7Var != null && (z7Var.f17217k0 != i13 || z7Var.f17219l0 != i14)) {
            z7Var.f17217k0 = i13;
            z7Var.f17219l0 = i14;
            z7Var.A();
        }
        q6Var.b();
        a61 a61Var2 = q6Var.f16575n;
        if (a61Var2 != null) {
            int i15 = q6Var.f16567f;
            int i16 = q6Var.h;
            a61Var2.d = i15;
            a61Var2.f26646e = i16;
            jz jzVar = a61Var2.f26644b;
            if (jzVar == null) {
                return;
            }
            jzVar.postRunnable(new fz(jzVar, i15, i16, 0));
        }
    }

    @Override
    public boolean t() {
        return false;
    }

    public String toString() {
        switch (this.f12862a) {
            case 8:
                return (String) this.f12863b;
            case 27:
                StringBuilder sb2 = new StringBuilder();
                ArrayList arrayList = (ArrayList) this.f12863b;
                int size = arrayList.size();
                sb.f fVar = null;
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    sb.f fVar2 = (sb.f) obj;
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

    public a1 v() throws Throwable {
        Throwable th;
        HttpsURLConnection httpsURLConnection;
        InputStream inputStream = null;
        String string = null;
        inputStream = null;
        try {
            try {
                String strU = u((String) this.f12863b, (HashMap) this.f12864c);
                String str = "GET Request URL: " + strU;
                try {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", str, null);
                    }
                    httpsURLConnection = (HttpsURLConnection) new URL(strU).openConnection();
                    try {
                        httpsURLConnection.setReadTimeout(10000);
                        httpsURLConnection.setConnectTimeout(10000);
                        httpsURLConnection.setRequestMethod("GET");
                        for (Map.Entry entry : ((HashMap) this.d).entrySet()) {
                            httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                        }
                        httpsURLConnection.connect();
                        int responseCode = httpsURLConnection.getResponseCode();
                        InputStream inputStream2 = httpsURLConnection.getInputStream();
                        if (inputStream2 != null) {
                            try {
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream2, "UTF-8"));
                                char[] cArr = new char[8192];
                                StringBuilder sb2 = new StringBuilder();
                                while (true) {
                                    int i10 = bufferedReader.read(cArr);
                                    if (i10 == -1) {
                                        break;
                                    }
                                    sb2.append(cArr, 0, i10);
                                }
                                string = sb2.toString();
                            } catch (Throwable th2) {
                                th = th2;
                                inputStream = inputStream2;
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                if (httpsURLConnection != null) {
                                    httpsURLConnection.disconnect();
                                }
                                throw th;
                            }
                        }
                        if (inputStream2 != null) {
                            inputStream2.close();
                        }
                        httpsURLConnection.disconnect();
                        return new a1(responseCode, string);
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    th = th;
                    httpsURLConnection = null;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    if (httpsURLConnection != null) {
                        httpsURLConnection.disconnect();
                    }
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                httpsURLConnection = null;
                if (inputStream != null) {
                    inputStream.close();
                }
                if (httpsURLConnection != null) {
                    httpsURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    public Object w(Bitmap bitmap) {
        pg.a aVar = (pg.a) this.f12863b;
        if (aVar.a(bitmap)) {
            this.d = ((pg.b) this.f12864c).a(bitmap);
            aVar.b(bitmap);
        }
        return this.d;
    }

    public ColorStateList x(int i10) {
        int resourceId;
        ColorStateList colorStateListA;
        TypedArray typedArray = (TypedArray) this.f12864c;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (colorStateListA = o7.a((Context) this.f12863b, resourceId)) == null) ? typedArray.getColorStateList(i10) : colorStateListA;
    }

    public Drawable y(int i10) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f12864c;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0) ? typedArray.getDrawable(i10) : o7.b((Context) this.f12863b, resourceId);
    }

    public Drawable z(int i10) {
        int resourceId;
        Drawable drawableF;
        if (!((TypedArray) this.f12864c).hasValue(i10) || (resourceId = ((TypedArray) this.f12864c).getResourceId(i10, 0)) == 0) {
            return null;
        }
        r rVarA = r.a();
        Context context = (Context) this.f12863b;
        synchronized (rVarA) {
            drawableF = rVarA.f17439a.f(resourceId, context, true);
        }
        return drawableF;
    }

    public a(Object obj, Object obj2, Object obj3, int i10) {
        this.f12862a = i10;
        this.d = obj;
        this.f12863b = obj2;
        this.f12864c = obj3;
    }

    @Override
    public void onRenderedFirstFrame() {
        z7 z7Var = (z7) this.f12863b;
        Runnable[] runnableArr = (Runnable[]) this.f12864c;
        q6 q6Var = (q6) this.d;
        p6 p6Var = q6Var.D;
        if (p6Var != null && p6Var.f16531g) {
            int i10 = q6Var.f16567f;
            int i11 = q6Var.h;
            p6Var.d = true;
            p6Var.f16529e = i10;
            p6Var.f16530f = i11;
            w0 w0Var = p6Var.f16528c;
            if (w0Var != null) {
                w0Var.run(Integer.valueOf(i10), Integer.valueOf(p6Var.f16530f));
            }
        }
        Runnable runnable = runnableArr[0];
        if (runnable == null) {
            a61 a61Var = q6Var.f16575n;
            if (a61Var != null) {
                if (p6Var == null || !p6Var.f16531g) {
                    a61Var.animate().alpha(1.0f).setDuration(180L).withEndAction(new jh.p6(25, this, z7Var)).start();
                    return;
                }
                return;
            }
            return;
        }
        q6Var.post(runnable);
        runnableArr[0] = null;
        Bitmap bitmap = q6Var.f16558a;
        if (bitmap != null) {
            bitmap.recycle();
            if (z7Var.M0 == q6Var.f16558a) {
                z7Var.M0 = null;
            }
            q6Var.f16558a = null;
            q6Var.invalidate();
        }
    }

    public a(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f12862a = i10;
        this.f12863b = obj;
        this.f12864c = obj2;
        this.d = obj3;
    }

    public a(f0 f0Var, String str, m5.i iVar) {
        this.f12862a = 12;
        this.f12864c = f0Var;
        this.f12863b = str;
        this.d = iVar;
    }

    public a(int i10) {
        this.f12862a = i10;
        switch (i10) {
            case 13:
                this.f12864c = new HashMap();
                this.d = new HashMap();
                this.f12863b = new HashMap();
                break;
            default:
                this.f12864c = new HashMap();
                this.d = new HashMap();
                this.f12863b = k7.x.f15029c;
                break;
        }
    }

    public a(CastDevice castDevice, n5.e0 e0Var) {
        this.f12862a = 11;
        l.i(castDevice, "CastDevice parameter cannot be null");
        this.f12863b = castDevice;
        this.f12864c = e0Var;
    }

    public a(h hVar) {
        this.f12862a = 15;
        this.d = hVar;
        this.f12864c = new AtomicLong((r5.a.f46767b.nextLong() & 65535) * 10000);
    }

    public a(s7.d dVar, g gVar) {
        this.f12862a = 26;
        this.f12864c = gVar;
        l.h(dVar);
        this.f12863b = dVar;
    }

    public a(pg.b bVar) {
        this.f12862a = 23;
        this.f12863b = new pg.a();
        this.f12864c = bVar;
    }

    public a(b bVar, rc.h hVar) {
        this.f12862a = 7;
        this.f12864c = bVar;
        this.d = hVar;
        this.f12863b = "firebase-settings.crashlytics.com";
    }

    public a(String str, HashMap map) {
        this.f12862a = 0;
        this.f12863b = str;
        this.f12864c = map;
        this.d = new HashMap();
    }

    @Override
    public void a() {
    }

    @Override
    public void f() {
    }

    @Override
    public void o() {
    }

    @Override
    public void s() {
    }

    public a(String str, lb.j[] jVarArr) {
        this.f12862a = 8;
        System.currentTimeMillis();
        this.f12863b = str;
        this.f12864c = jVarArr;
        this.d = null;
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

    public a(File file) {
        this.f12862a = 24;
        this.f12863b = file;
        this.f12864c = new File(file.getPath() + ".new");
        this.d = new File(file.getPath() + ".bak");
    }

    public a(Runnable runnable) {
        this.f12862a = 25;
        this.d = new CopyOnWriteArrayList();
        this.f12864c = new HashMap();
        this.f12863b = runnable;
    }

    public a(Context context, TypedArray typedArray) {
        this.f12862a = 10;
        this.f12863b = context;
        this.f12864c = typedArray;
    }

    public a(Signature signature) {
        this.f12862a = 1;
        this.f12863b = signature;
        this.f12864c = null;
        this.d = null;
    }

    public a(n1.d dVar) {
        this.f12862a = 14;
        this.f12862a = 14;
        this.f12863b = dVar;
        this.f12864c = Choreographer.getInstance();
        this.d = new o1.a(this, 0);
    }

    public a(Cipher cipher) {
        this.f12862a = 1;
        this.f12864c = cipher;
        this.f12863b = null;
        this.d = null;
    }

    public a(Mac mac) {
        this.f12862a = 1;
        this.d = mac;
        this.f12864c = null;
        this.f12863b = null;
    }

    public a(bk bkVar, HashMap map, ArrayList arrayList) {
        this.f12862a = 18;
        this.d = bkVar;
        this.f12864c = map;
        this.f12863b = arrayList;
    }

    public a(com.google.firebase.messaging.l lVar, e eVar, sb.e eVar2) {
        qb.d dVar;
        int i10;
        int i11;
        this.f12862a = 27;
        this.d = lVar;
        this.f12863b = new ArrayList();
        sb.e eVar3 = eVar2;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            dVar = qb.d.ECI;
            i10 = 1;
            if (eVar3 == null) {
                break;
            }
            int i14 = eVar3.f47840c;
            int i15 = i12 + eVar3.d;
            sb.e eVar4 = eVar3.f47841e;
            int i16 = i13;
            qb.d dVar2 = eVar3.f47838a;
            boolean z10 = (dVar2 == qb.d.BYTE && eVar4 == null && i14 != 0) || !(eVar4 == null || i14 == eVar4.f47840c);
            i10 = z10 ? 1 : i16;
            if (eVar4 == null || eVar4.f47838a != dVar2 || z10) {
                ((ArrayList) this.f12863b).add(0, new sb.f(this, dVar2, eVar3.f47839b, i14, i15));
                i11 = 0;
            } else {
                i11 = i15;
            }
            if (z10) {
                ((ArrayList) this.f12863b).add(0, new sb.f(this, dVar, eVar3.f47839b, eVar3.f47840c, 0));
            }
            i13 = i10;
            eVar3 = eVar4;
            i12 = i11;
        }
        int i17 = i13;
        boolean z11 = lVar.f4599a;
        qb.b bVar = (qb.b) lVar.d;
        if (z11) {
            sb.f fVar = (sb.f) ((ArrayList) this.f12863b).get(0);
            if (fVar != null && fVar.f47843a != dVar && i17 != 0) {
                ((ArrayList) this.f12863b).add(0, new sb.f(this, dVar, 0, 0, 0));
            }
            ((ArrayList) this.f12863b).add(((sb.f) ((ArrayList) this.f12863b).get(0)).f47843a == dVar ? 1 : 0, new sb.f(this, qb.d.FNC1_FIRST_POSITION, 0, 0, 0));
        }
        int i18 = eVar.f46198a;
        int i19 = 26;
        int iB = m1.j.b(i18 <= 9 ? 1 : i18 <= 26 ? 2 : 3);
        if (iB == 0) {
            i19 = 9;
        } else if (iB != 1) {
            i10 = 27;
            i19 = 40;
        } else {
            i10 = 10;
        }
        int iC = C(eVar);
        while (i18 < i19 && !sb.c.c(iC, e.c(i18), bVar)) {
            i18++;
        }
        while (i18 > i10 && sb.c.c(iC, e.c(i18 - 1), bVar)) {
            i18--;
        }
        this.f12864c = e.c(i18);
    }

    public a(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.f12862a = 22;
        this.d = arrayDeque;
        this.f12864c = bufferedReader;
    }

    public a(Object[] objArr, Object[] objArr2) {
        this.f12862a = 19;
        int length = objArr.length;
        int[] iArr = new int[length];
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = objArr[i10];
            Integer numValueOf = (Integer) map.get(obj);
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(map.size());
                map.put(obj, numValueOf);
            }
            iArr[i10] = numValueOf.intValue();
        }
        this.f12863b = iArr;
        this.f12864c = q(objArr, iArr);
        this.d = q(objArr2, iArr);
    }

    @Override
    public void r(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i10, boolean z10) {
    }
}
