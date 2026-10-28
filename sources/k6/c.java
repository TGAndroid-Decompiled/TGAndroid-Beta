package k6;

import a8.ed;
import a8.kc;
import a8.me;
import a8.yb;
import aa.b0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.session.v;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.Choreographer;
import android.view.View;
import b2.h0;
import b2.p0;
import b2.s0;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.q;
import di.x2;
import e2.j0;
import e2.q0;
import f9.g2;
import f9.l0;
import f9.t0;
import g2.o;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledFuture;
import java.util.zip.InflaterInputStream;
import k9.y;
import li.e3;
import m.r3;
import m5.t;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Components.d01;
import org.telegram.ui.Components.f81;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.nk;
import org.telegram.ui.Components.r01;
import org.telegram.ui.Components.ti;
import org.telegram.ui.sq0;
import org.xmlpull.v1.XmlPullParserException;
import u7.s;
public class c implements OnCompleteListener, o5.b, fl0, sq0 {
    public final int f16404a;
    public Object f16405b;
    public Object f16406c;
    public Object d;

    public c(int i10, Object obj, Object obj2) {
        this.f16404a = i10;
        this.d = obj;
        this.f16405b = obj2;
    }

    public static c D(Context context, AttributeSet attributeSet, int[] iArr, int i10) {
        return new c(context, context.obtainStyledAttributes(attributeSet, iArr, i10, 0));
    }

    public static void G(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e("AtomicFile", "Failed to delete file which is a directory " + file2);
        }
        if (!file.renameTo(file2)) {
            Log.e("AtomicFile", "Failed to rename " + file + " to " + file2);
        }
    }

    public static c h(View view) {
        return new c(view);
    }

    public static Object[] q(Object[] objArr, int[] iArr) {
        int length = objArr.length;
        Class<?> componentType = objArr.getClass().getComponentType();
        d01 d01Var = r01.R;
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

    public static n2.e r(h0 h0Var) {
        String uri;
        boolean z10;
        boolean z11;
        o oVar = new o();
        byte[] bArr = null;
        oVar.f12271c = null;
        Uri uri2 = h0Var.f3222b;
        if (uri2 == null) {
            uri = null;
        } else {
            uri = uri2.toString();
        }
        boolean z12 = h0Var.f3224f;
        ?? obj = new Object();
        if (z12 && TextUtils.isEmpty(uri)) {
            z10 = false;
        } else {
            z10 = true;
        }
        yb.g(z10);
        obj.f5930b = oVar;
        obj.f5931c = uri;
        obj.f5929a = z12;
        obj.d = new HashMap();
        l0 l0Var = h0Var.f3223c;
        t0 t0Var = l0Var.f10296a;
        if (t0Var == null) {
            t0Var = l0Var.b();
            l0Var.f10296a = t0Var;
        }
        g2 it = t0Var.iterator();
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
        int i10 = b2.n.f3283a;
        s sVar = new s(26);
        UUID uuid = h0Var.f3221a;
        uuid.getClass();
        boolean z13 = h0Var.d;
        boolean z14 = h0Var.e;
        int[] f7 = ed.f(h0Var.f3225g);
        for (int i11 : f7) {
            if (i11 != 2 && i11 != 1) {
                z11 = false;
            } else {
                z11 = true;
            }
            yb.g(z11);
        }
        n2.e eVar = new n2.e(uuid, obj, hashMap, z13, (int[]) f7.clone(), z14, sVar);
        byte[] bArr2 = h0Var.h;
        if (bArr2 != null) {
            bArr = Arrays.copyOf(bArr2, bArr2.length);
        }
        yb.p(eVar.f18615w.isEmpty());
        eVar.K = bArr;
        return eVar;
    }

    public int A(jc.f fVar) {
        ArrayList arrayList = (ArrayList) this.f16405b;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            lc.f fVar2 = (lc.f) obj;
            int i12 = fVar2.d;
            jc.e eVar = fVar2.f16980a;
            int a2 = eVar.a(fVar);
            int i13 = a2 + 4;
            int ordinal = eVar.ordinal();
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
                        i13 += fVar2.a() * 8;
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

    public boolean B() {
        String trim;
        ArrayDeque arrayDeque = (ArrayDeque) this.d;
        if (((String) this.f16406c) != null) {
            return true;
        }
        if (!arrayDeque.isEmpty()) {
            String str = (String) arrayDeque.poll();
            str.getClass();
            this.f16406c = str;
            return true;
        }
        do {
            String readLine = ((BufferedReader) this.f16405b).readLine();
            this.f16406c = readLine;
            if (readLine != null) {
                trim = readLine.trim();
                this.f16406c = trim;
            } else {
                return false;
            }
        } while (trim.isEmpty());
        return true;
    }

    public String C() {
        if (B()) {
            String str = (String) this.f16406c;
            this.f16406c = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    public void E() {
        ((TypedArray) this.f16406c).recycle();
    }

    public void F(rf.g gVar) {
        if (((rf.d) this.f16405b) != null) {
            for (int i10 = 0; i10 < gVar.f47391a.size(); i10++) {
                rf.d dVar = (rf.d) this.f16405b;
                dVar.h.remove(gVar.a(i10).d);
                dVar.h();
            }
        }
    }

    public void H(String str) {
        if (str != null) {
            this.f16406c = str;
            return;
        }
        throw new NullPointerException("Null backendName");
    }

    public void I(rf.a aVar) {
        rf.g gVar;
        rf.g gVar2 = (rf.g) this.f16406c;
        if (gVar2 != null && ((rf.a) this.d) == null && aVar != null) {
            g(gVar2);
        }
        if (((rf.a) this.d) != null && (gVar = (rf.g) this.f16406c) != null && aVar == null) {
            F(gVar);
        }
        rf.a aVar2 = (rf.a) this.d;
        if (aVar2 != null) {
            f6.h hVar = aVar2.f47364a;
            o6.l.e("Must be called from the main thread.");
            hVar.f10218i.remove(aVar2);
        }
        if (aVar != null) {
            aVar.f47364a.p(aVar);
            rf.g gVar3 = (rf.g) this.f16406c;
            if (gVar3 != null) {
                aVar.d = gVar3;
                aVar.f47368g = 0;
                aVar.h = 0;
                aVar.p();
            }
        }
        this.d = aVar;
    }

    public FileOutputStream J() {
        File file = (File) this.f16406c;
        File file2 = (File) this.d;
        if (file2.exists()) {
            G(file2, (File) this.f16405b);
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

    public void K(Object obj, String str) {
        c cVar = new c(13, false);
        ((c) this.d).d = cVar;
        this.d = cVar;
        cVar.f16405b = obj;
        cVar.f16406c = str;
    }

    @Override
    public void c() {
        ((nk) this.d).Q.x();
    }

    @Override
    public void d(int i10, boolean z10, boolean z11) {
        String str;
        if (!z10) {
            nk nkVar = (nk) this.d;
            HashMap hashMap = (HashMap) this.f16405b;
            ArrayList arrayList = (ArrayList) this.f16406c;
            ti tiVar = nkVar.f30254b;
            if (!hashMap.isEmpty() && nkVar.Q != null && !nkVar.K) {
                nkVar.K = true;
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
                g5.Z(tiVar.M1, tiVar.p1() + arrayList2.size(), tiVar.t1(), new x2(i10, 2, nkVar, arrayList2, z11));
            }
        }
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public boolean f() {
        return true;
    }

    public void g(rf.g gVar) {
        if (((rf.d) this.f16405b) == null) {
            this.f16405b = new rf.d();
        }
        for (int i10 = 0; i10 < gVar.f47391a.size(); i10++) {
            rf.d dVar = (rf.d) this.f16405b;
            rf.f a2 = gVar.a(i10);
            dVar.h.put(a2.d, a2);
            dVar.h();
        }
    }

    @Override
    public Object mo27get() {
        switch (this.f16404a) {
            case 7:
                return new t(new Object(), new s(24), (r5.b) ((me) this.f16405b).mo27get(), (b0) ((r3) this.f16406c).mo27get(), (q) ((ti.e) this.d).mo27get());
            default:
                return new s4.d((Context) ((id.a) this.f16405b).mo27get(), (t5.d) ((id.a) this.f16406c).mo27get(), (s5.a) ((s) this.d).mo27get(), 1);
        }
    }

    @Override
    public boolean i() {
        return false;
    }

    public m5.i j() {
        String str;
        if (((String) this.f16406c) == null) {
            str = " backendName";
        } else {
            str = "";
        }
        if (((j5.d) this.d) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new m5.i((String) this.f16406c, (byte[]) this.f16405b, (j5.d) this.d);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public String k(int i10, String str, long j10, long j11) {
        ArrayList arrayList = (ArrayList) this.f16405b;
        ArrayList arrayList2 = (ArrayList) this.d;
        ArrayList arrayList3 = (ArrayList) this.f16406c;
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < arrayList3.size(); i11++) {
            sb2.append((String) arrayList.get(i11));
            if (((Integer) arrayList3.get(i11)).intValue() == 1) {
                sb2.append(str);
            } else if (((Integer) arrayList3.get(i11)).intValue() == 2) {
                sb2.append(String.format(Locale.US, (String) arrayList2.get(i11), Long.valueOf(j10)));
            } else if (((Integer) arrayList3.get(i11)).intValue() == 3) {
                sb2.append(String.format(Locale.US, (String) arrayList2.get(i11), Integer.valueOf(i10)));
            } else if (((Integer) arrayList3.get(i11)).intValue() == 4) {
                sb2.append(String.format(Locale.US, (String) arrayList2.get(i11), Long.valueOf(j11)));
            }
        }
        sb2.append((String) arrayList.get(arrayList3.size()));
        return sb2.toString();
    }

    public void n() {
        android.support.v4.media.session.b0 b0Var = (android.support.v4.media.session.b0) this.f16405b;
        if (b0Var != null) {
            int i10 = ((p4.e) this.d).f46703n.d;
            v vVar = b0Var.f2051a;
            vVar.getClass();
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(i10);
            vVar.f2073a.setPlaybackToLocal(builder.build());
            this.f16406c = null;
        }
    }

    @Override
    public boolean o() {
        return false;
    }

    @Override
    public void onComplete(Task task) {
        a aVar = (a) this.f16405b;
        String str = (String) this.f16406c;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.d;
        synchronized (aVar.f16397a) {
            aVar.f16397a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    @Override
    public void p(android.view.View r13, bh.x0 r14, boolean r15, boolean r16) {
        throw new UnsupportedOperationException("Method not decompiled: k6.c.p(android.view.View, bh.x0, boolean, boolean):void");
    }

    public void s(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = (HashMap) this.f16405b;
        na.e eVar = new na.e(byteArrayOutputStream, hashMap, (HashMap) this.f16406c, (ka.d) this.d);
        if (obj == null) {
            return;
        }
        ka.d dVar = (ka.d) hashMap.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, eVar);
            return;
        }
        throw new RuntimeException("No encoder for " + obj.getClass());
    }

    public of.e t(of.f fVar) {
        InflaterInputStream inflaterInputStream;
        int i10 = fVar.f19366c;
        InputStream inputStream = (pf.a) this.f16405b;
        if (fVar.d) {
            e3 e3Var = (e3) this.d;
            e3Var.getClass();
            byte[] bArr = new byte[i10];
            int i11 = 0;
            while (i11 < i10) {
                int read = ((com.google.firebase.messaging.d) e3Var.f17209b).read(bArr, i11, i10 - i11);
                if (read > 0) {
                    i11 += read;
                } else {
                    throw new EOFException();
                }
            }
            int i12 = 0;
            boolean z10 = false;
            for (int i13 = 0; i13 < i10; i13++) {
                byte b10 = bArr[i13];
                if (!z10 || b10 != 0) {
                    bArr[i12] = b10;
                    i12++;
                }
                if (b10 == -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            inputStream = new ByteArrayInputStream(bArr, 0, i12);
            i10 = i12;
        }
        if (!fVar.f19367f) {
            if (fVar.e) {
                i10 = fVar.f19368g;
                inflaterInputStream = new InflaterInputStream(inputStream);
            } else {
                inflaterInputStream = inputStream;
            }
            return new of.e(inflaterInputStream, fVar.f19365b, i10, (of.h) this.f16406c, fVar);
        }
        throw new Exception("Frame encryption is not supported");
    }

    public String toString() {
        int i10 = 0;
        switch (this.f16404a) {
            case 1:
                StringBuilder sb2 = new StringBuilder();
                ArrayList arrayList = (ArrayList) this.f16405b;
                int size = arrayList.size();
                lc.f fVar = null;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    lc.f fVar2 = (lc.f) obj;
                    if (fVar != null) {
                        sb2.append(",");
                    }
                    sb2.append(fVar2.toString());
                    fVar = fVar2;
                }
                return sb2.toString();
            case 14:
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append((String) this.f16406c);
                sb3.append('{');
                c cVar = (c) ((c) this.f16405b).d;
                String str = "";
                while (cVar != null) {
                    Object obj2 = cVar.f16405b;
                    sb3.append(str);
                    String str2 = (String) cVar.f16406c;
                    if (str2 != null) {
                        sb3.append(str2);
                        sb3.append('=');
                    }
                    if (obj2 != null && obj2.getClass().isArray()) {
                        String deepToString = Arrays.deepToString(new Object[]{obj2});
                        sb3.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    } else {
                        sb3.append(obj2);
                    }
                    cVar = (c) cVar.d;
                    str = ", ";
                }
                sb3.append('}');
                return sb3.toString();
            case 15:
                StringBuilder sb4 = new StringBuilder("id3v2tag[pos=");
                pf.a aVar = (pf.a) this.f16405b;
                sb4.append(aVar.f7735b);
                sb4.append(", ");
                sb4.append(aVar.e());
                sb4.append(" left]");
                return sb4.toString();
            default:
                return super.toString();
        }
    }

    public n2.m u(p0 p0Var) {
        n2.e eVar;
        p0Var.f3345b.getClass();
        h0 h0Var = p0Var.f3345b.f3257c;
        if (h0Var == null) {
            return n2.m.f18628z;
        }
        synchronized (this.f16405b) {
            try {
                if (!h0Var.equals((h0) this.f16406c)) {
                    this.f16406c = h0Var;
                    this.d = r(h0Var);
                }
                eVar = (n2.e) this.d;
                eVar.getClass();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
    }

    public ColorStateList v(int i10) {
        int resourceId;
        ColorStateList a2;
        TypedArray typedArray = (TypedArray) this.f16406c;
        if (typedArray.hasValue(i10) && (resourceId = typedArray.getResourceId(i10, 0)) != 0 && (a2 = kc.a((Context) this.f16405b, resourceId)) != null) {
            return a2;
        }
        return typedArray.getColorStateList(i10);
    }

    public Drawable w(int i10) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f16406c;
        if (typedArray.hasValue(i10) && (resourceId = typedArray.getResourceId(i10, 0)) != 0) {
            return kc.b((Context) this.f16405b, resourceId);
        }
        return typedArray.getDrawable(i10);
    }

    public Drawable x(int i10) {
        int resourceId;
        Drawable f7;
        if (((TypedArray) this.f16406c).hasValue(i10) && (resourceId = ((TypedArray) this.f16406c).getResourceId(i10, 0)) != 0) {
            m.q a2 = m.q.a();
            Context context = (Context) this.f16405b;
            synchronized (a2) {
                f7 = a2.f17820a.f(resourceId, context, true);
            }
            return f7;
        }
        return null;
    }

    public Typeface y(int i10, int i11, j0 j0Var) {
        j0 j0Var2;
        XmlPullParserException xmlPullParserException;
        IOException iOException;
        int resourceId = ((TypedArray) this.f16406c).getResourceId(i10, 0);
        if (resourceId != 0) {
            if (((TypedValue) this.d) == null) {
                this.d = new TypedValue();
            }
            Context context = (Context) this.f16405b;
            TypedValue typedValue = (TypedValue) this.d;
            ThreadLocal threadLocal = h0.j.f12542a;
            if (!context.isRestricted()) {
                Resources resources = context.getResources();
                resources.getValue(resourceId, typedValue, true);
                CharSequence charSequence = typedValue.string;
                if (charSequence != null) {
                    String charSequence2 = charSequence.toString();
                    if (!charSequence2.startsWith("res/")) {
                        j0Var.b();
                        return null;
                    }
                    int i12 = typedValue.assetCookie;
                    a0.j jVar = i0.e.f13456b;
                    Typeface typeface = (Typeface) jVar.a(i0.e.b(resources, resourceId, charSequence2, i12, i11));
                    if (typeface != null) {
                        new Handler(Looper.getMainLooper()).post(new q0(25, j0Var, typeface));
                        return typeface;
                    }
                    try {
                        if (charSequence2.toLowerCase().endsWith(".xml")) {
                            h0.d g7 = h0.b.g(resources.getXml(resourceId), resources);
                            if (g7 == null) {
                                try {
                                    Log.e("ResourcesCompat", "Failed to find font-family tag");
                                    j0Var.b();
                                    return null;
                                } catch (IOException e) {
                                    iOException = e;
                                    j0Var2 = j0Var;
                                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                                    j0Var2.b();
                                    return null;
                                } catch (XmlPullParserException e10) {
                                    xmlPullParserException = e10;
                                    j0Var2 = j0Var;
                                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                                    j0Var2.b();
                                    return null;
                                }
                            }
                            try {
                                return i0.e.a(context, g7, resources, resourceId, charSequence2, typedValue.assetCookie, i11, j0Var);
                            } catch (IOException e11) {
                                e = e11;
                                j0Var2 = j0Var;
                                iOException = e;
                                Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                                j0Var2.b();
                                return null;
                            } catch (XmlPullParserException e12) {
                                e = e12;
                                j0Var2 = j0Var;
                                xmlPullParserException = e;
                                Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                                j0Var2.b();
                                return null;
                            }
                        }
                        j0Var2 = j0Var;
                        try {
                            int i13 = typedValue.assetCookie;
                            Typeface e13 = i0.e.f13455a.e(context, resources, resourceId, charSequence2, i11);
                            if (e13 != null) {
                                jVar.b(i0.e.b(resources, resourceId, charSequence2, i13, i11), e13);
                            }
                            if (e13 != null) {
                                new Handler(Looper.getMainLooper()).post(new q0(25, j0Var2, e13));
                            } else {
                                j0Var2.b();
                            }
                            return e13;
                        } catch (IOException e14) {
                            e = e14;
                            iOException = e;
                            Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                            j0Var2.b();
                            return null;
                        } catch (XmlPullParserException e15) {
                            e = e15;
                            xmlPullParserException = e;
                            Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                            j0Var2.b();
                            return null;
                        }
                    } catch (IOException e16) {
                        e = e16;
                        j0Var2 = j0Var;
                    } catch (XmlPullParserException e17) {
                        e = e17;
                        j0Var2 = j0Var;
                    }
                } else {
                    throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(resourceId) + "\" (" + Integer.toHexString(resourceId) + ") is not a Font: " + typedValue);
                }
            }
        }
        return null;
    }

    public ByteBuffer z() {
        Bitmap bitmap = (Bitmap) this.d;
        if (bitmap != null) {
            if (bitmap == null) {
                return null;
            }
            int width = bitmap.getWidth();
            int height = ((Bitmap) this.d).getHeight();
            int i10 = width * height;
            int[] iArr = new int[i10];
            ((Bitmap) this.d).getPixels(iArr, 0, width, 0, 0, width, height);
            byte[] bArr = new byte[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                bArr[i11] = (byte) ((Color.blue(iArr[i11]) * 0.114f) + (Color.green(iArr[i11]) * 0.587f) + (Color.red(iArr[i11]) * 0.299f));
            }
            return ByteBuffer.wrap(bArr);
        }
        return (ByteBuffer) this.f16406c;
    }

    public c(int i10, boolean z10) {
        this.f16404a = i10;
    }

    public c(Object obj, Object obj2, Object obj3, int i10) {
        this.f16404a = i10;
        this.f16405b = obj;
        this.f16406c = obj2;
        this.d = obj3;
    }

    public c(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f16404a = i10;
        this.d = obj;
        this.f16405b = obj2;
        this.f16406c = obj3;
    }

    public c(String str) {
        this.f16404a = 14;
        c cVar = new c(13, false);
        this.f16405b = cVar;
        this.d = cVar;
        this.f16406c = str;
    }

    public c(InputStream inputStream, long j10, int i10, of.h hVar) {
        this.f16404a = 15;
        pf.a aVar = new pf.a(inputStream, j10, i10);
        this.f16405b = aVar;
        this.d = new e3(aVar, 6);
        this.f16406c = hVar;
    }

    public c(View view) {
        this.f16404a = 20;
        this.d = view;
        f81 f81Var = new f81(this, view);
        this.f16405b = f81Var;
        view.addOnLayoutChangeListener(f81Var);
    }

    public c(int i10) {
        this.f16404a = i10;
        switch (i10) {
            case 28:
                this.f16405b = new Object();
                this.f16406c = null;
                this.d = null;
                return;
            default:
                this.f16405b = new Object();
                return;
        }
    }

    public c(File file) {
        this.f16404a = 25;
        this.f16405b = file;
        this.f16406c = new File(file.getPath() + ".new");
        this.d = new File(file.getPath() + ".bak");
    }

    @Override
    public void a() {
    }

    @Override
    public void m() {
    }

    public c(Runnable runnable) {
        this.f16404a = 26;
        this.f16406c = new CopyOnWriteArrayList();
        this.d = new HashMap();
        this.f16405b = runnable;
    }

    @Override
    public void b(Editable editable) {
    }

    public c(Context context, TypedArray typedArray) {
        this.f16404a = 3;
        this.f16405b = context;
        this.f16406c = typedArray;
    }

    public c(byte[] bArr, y yVar) {
        this.f16404a = 5;
        this.f16405b = bArr;
        this.f16406c = null;
        this.d = yVar;
    }

    public c(s0 s0Var, y yVar) {
        this.f16404a = 5;
        this.f16405b = s0Var.f3417k;
        this.f16406c = s0Var.f3420n;
        this.d = yVar;
    }

    public c(jg.s0 s0Var) {
        this.f16404a = 11;
        this.f16404a = 11;
        this.f16405b = s0Var;
        this.f16406c = Choreographer.getInstance();
        this.d = new o1.a(this, 0);
    }

    public c(c2.b bVar, jc.f fVar, lc.e eVar) {
        jc.e eVar2;
        int i10;
        int i11;
        this.f16404a = 1;
        this.d = bVar;
        this.f16405b = new ArrayList();
        lc.e eVar3 = eVar;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            eVar2 = jc.e.ECI;
            if (eVar3 == null) {
                break;
            }
            int i14 = eVar3.f16978c;
            int i15 = i12 + eVar3.d;
            lc.e eVar4 = eVar3.e;
            int i16 = i13;
            jc.e eVar5 = eVar3.f16976a;
            boolean z10 = (eVar5 == jc.e.BYTE && eVar4 == null && i14 != 0) || !(eVar4 == null || i14 == eVar4.f16978c);
            i10 = z10 ? 1 : i16;
            if (eVar4 == null || eVar4.f16976a != eVar5 || z10) {
                ((ArrayList) this.f16405b).add(0, new lc.f(this, eVar5, eVar3.f16977b, i14, i15));
                i11 = 0;
            } else {
                i11 = i15;
            }
            if (z10) {
                ((ArrayList) this.f16405b).add(0, new lc.f(this, eVar2, eVar3.f16977b, eVar3.f16978c, 0));
            }
            i13 = i10;
            eVar3 = eVar4;
            i12 = i11;
        }
        int i17 = i13;
        boolean z11 = bVar.f5929a;
        jc.c cVar = (jc.c) bVar.d;
        if (z11) {
            lc.f fVar2 = (lc.f) ((ArrayList) this.f16405b).get(0);
            if (fVar2 != null && fVar2.f16980a != eVar2 && i17 != 0) {
                ((ArrayList) this.f16405b).add(0, new lc.f(this, eVar2, 0, 0, 0));
            }
            ((ArrayList) this.f16405b).add(((lc.f) ((ArrayList) this.f16405b).get(0)).f16980a == eVar2 ? 1 : 0, new lc.f(this, jc.e.FNC1_FIRST_POSITION, 0, 0, 0));
        }
        int i18 = fVar.f15566a;
        int i19 = 26;
        int c10 = m1.j.c(i18 <= 9 ? 1 : i18 <= 26 ? 2 : 3);
        if (c10 == 0) {
            i19 = 9;
        } else if (c10 != 1) {
            i10 = 27;
            i19 = 40;
        } else {
            i10 = 10;
        }
        int A = A(fVar);
        while (i18 < i19 && !lc.c.d(A, jc.f.c(i18), cVar)) {
            i18++;
        }
        while (i18 > i10 && lc.c.d(A, jc.f.c(i18 - 1), cVar)) {
            i18--;
        }
        this.f16406c = jc.f.c(i18);
    }

    public c(Object[] objArr, Object[] objArr2) {
        this.f16404a = 19;
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
        this.f16405b = iArr;
        this.f16406c = q(objArr, iArr);
        this.d = q(objArr2, iArr);
    }

    @Override
    public void l(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
