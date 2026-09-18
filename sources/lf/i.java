package lf;

import ai.d4;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ClipDescription;
import android.content.ComponentName;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
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
import android.os.PersistableBundle;
import android.support.v4.media.session.b0;
import android.support.v4.media.session.v;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import b2.c0;
import c3.r;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import e2.a0;
import e9.k0;
import e9.m0;
import e9.o1;
import gg.x1;
import i9.w;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.zip.Adler32;
import java.util.zip.InflaterInputStream;
import k2.u;
import m.q;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.iz0;
import org.telegram.ui.Components.ok;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.wz0;
import org.telegram.ui.br0;
import org.xmlpull.v1.XmlPullParserException;
import r0.i0;
import s4.c1;
import s4.h0;
import s4.y;
import v7.v7;
import v7.y7;
import w7.g6;
public class i implements pk0, br0, n5.b, t0.h, ja.a {
    public final int f14178a;
    public Object f14179b;
    public Object f14180c;
    public Object d;

    public i(int i10, boolean z10) {
        this.f14178a = i10;
    }

    public static i Q(Context context, AttributeSet attributeSet, int[] iArr, int i10) {
        return new i(context, context.obtainStyledAttributes(attributeSet, iArr, i10, 0));
    }

    public static void U(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e("AtomicFile", "Failed to delete file which is a directory " + file2);
        }
        if (!file.renameTo(file2)) {
            Log.e("AtomicFile", "Failed to rename " + file + " to " + file2);
        }
    }

    public static Object[] w(Object[] objArr, int[] iArr) {
        int length = objArr.length;
        Class<?> componentType = objArr.getClass().getComponentType();
        iz0 iz0Var = wz0.R;
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

    public static n2.f x(c0 c0Var) {
        String uri;
        boolean z10;
        boolean z11;
        g2.o oVar = new g2.o();
        byte[] bArr = null;
        oVar.f9393c = null;
        Uri uri2 = c0Var.f2952b;
        if (uri2 == null) {
            uri = null;
        } else {
            uri = uri2.toString();
        }
        boolean z12 = c0Var.f2954f;
        ?? obj = new Object();
        if (z12 && TextUtils.isEmpty(uri)) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.b(z10);
        obj.f7327b = oVar;
        obj.f7328c = uri;
        obj.f7326a = z12;
        obj.d = new HashMap();
        k0 k0Var = c0Var.f2953c;
        m0 m0Var = k0Var.f8091a;
        if (m0Var == null) {
            m0Var = k0Var.b();
            k0Var.f8091a = m0Var;
        }
        o1 it = m0Var.iterator();
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
        UUID uuid = b2.i.f3017a;
        qb.b bVar = new qb.b(26);
        UUID uuid2 = c0Var.f2951a;
        uuid2.getClass();
        boolean z13 = c0Var.d;
        boolean z14 = c0Var.e;
        int[] f7 = y7.f(c0Var.f2955g);
        for (int i10 : f7) {
            if (i10 != 2 && i10 != 1) {
                z11 = false;
            } else {
                z11 = true;
            }
            e2.d.b(z11);
        }
        n2.f fVar = new n2.f(uuid2, obj, hashMap, z13, (int[]) f7.clone(), z14, bVar);
        byte[] bArr2 = c0Var.h;
        if (bArr2 != null) {
            bArr = Arrays.copyOf(bArr2, bArr2.length);
        }
        e2.d.g(fVar.f15081w.isEmpty());
        fVar.K = bArr;
        return fVar;
    }

    public n2.n A(b2.k0 k0Var) {
        n2.f fVar;
        k0Var.f3078b.getClass();
        c0 c0Var = k0Var.f3078b.f2995c;
        if (c0Var == null) {
            return n2.n.f15094z;
        }
        synchronized (this.f14179b) {
            try {
                if (!c0Var.equals((c0) this.f14180c)) {
                    this.f14180c = c0Var;
                    this.d = x(c0Var);
                }
                fVar = (n2.f) this.d;
                fVar.getClass();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }

    public View B(int i10) {
        return ((RecyclerView) ((ka.c) this.f14179b).f13565b).getChildAt(J(i10));
    }

    public int C() {
        return ((RecyclerView) ((ka.c) this.f14179b).f13565b).getChildCount() - ((ArrayList) this.d).size();
    }

    public ColorStateList D(int i10) {
        int resourceId;
        ColorStateList a2;
        TypedArray typedArray = (TypedArray) this.f14180c;
        if (typedArray.hasValue(i10) && (resourceId = typedArray.getResourceId(i10, 0)) != 0 && (a2 = v7.a((Context) this.f14179b, resourceId)) != null) {
            return a2;
        }
        return typedArray.getColorStateList(i10);
    }

    public long E() {
        c3.l lVar = (c3.l) this.d;
        if (lVar != null) {
            return lVar.d;
        }
        return -1L;
    }

    public Drawable F(int i10) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f14180c;
        if (typedArray.hasValue(i10) && (resourceId = typedArray.getResourceId(i10, 0)) != 0) {
            return v7.b((Context) this.f14179b, resourceId);
        }
        return typedArray.getDrawable(i10);
    }

    public Drawable G(int i10) {
        int resourceId;
        Drawable f7;
        if (((TypedArray) this.f14180c).hasValue(i10) && (resourceId = ((TypedArray) this.f14180c).getResourceId(i10, 0)) != 0) {
            q a2 = q.a();
            Context context = (Context) this.f14179b;
            synchronized (a2) {
                f7 = a2.f14473a.f(resourceId, context, true);
            }
            return f7;
        }
        return null;
    }

    public Typeface H(int i10, int i11, a0 a0Var) {
        a0 a0Var2;
        XmlPullParserException xmlPullParserException;
        IOException iOException;
        int resourceId = ((TypedArray) this.f14180c).getResourceId(i10, 0);
        if (resourceId != 0) {
            if (((TypedValue) this.d) == null) {
                this.d = new TypedValue();
            }
            Context context = (Context) this.f14179b;
            TypedValue typedValue = (TypedValue) this.d;
            ThreadLocal threadLocal = h0.k.f10067a;
            if (!context.isRestricted()) {
                Resources resources = context.getResources();
                resources.getValue(resourceId, typedValue, true);
                CharSequence charSequence = typedValue.string;
                if (charSequence != null) {
                    String charSequence2 = charSequence.toString();
                    if (!charSequence2.startsWith("res/")) {
                        a0Var.b();
                        return null;
                    }
                    int i12 = typedValue.assetCookie;
                    a0.k kVar = i0.e.f10598b;
                    Typeface typeface = (Typeface) kVar.a(i0.e.b(resources, resourceId, charSequence2, i12, i11));
                    if (typeface != null) {
                        new Handler(Looper.getMainLooper()).post(new x1(1, a0Var, typeface));
                        return typeface;
                    }
                    try {
                    } catch (IOException e) {
                        e = e;
                        a0Var2 = a0Var;
                    } catch (XmlPullParserException e7) {
                        e = e7;
                        a0Var2 = a0Var;
                    }
                    try {
                        if (charSequence2.toLowerCase().endsWith(".xml")) {
                            h0.d g10 = h0.b.g(resources.getXml(resourceId), resources);
                            if (g10 == null) {
                                try {
                                    Log.e("ResourcesCompat", "Failed to find font-family tag");
                                    a0Var.b();
                                    return null;
                                } catch (IOException e10) {
                                    iOException = e10;
                                    a0Var2 = a0Var;
                                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                                    a0Var2.b();
                                    return null;
                                } catch (XmlPullParserException e11) {
                                    xmlPullParserException = e11;
                                    a0Var2 = a0Var;
                                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                                    a0Var2.b();
                                    return null;
                                }
                            }
                            return i0.e.a(context, g10, resources, resourceId, charSequence2, typedValue.assetCookie, i11, a0Var);
                        }
                        int i13 = typedValue.assetCookie;
                        Typeface e12 = i0.e.f10597a.e(context, resources, resourceId, charSequence2, i11);
                        if (e12 != null) {
                            kVar.b(i0.e.b(resources, resourceId, charSequence2, i13, i11), e12);
                        }
                        if (e12 != null) {
                            new Handler(Looper.getMainLooper()).post(new x1(1, a0Var, e12));
                        } else {
                            a0Var.b();
                        }
                        return e12;
                    } catch (IOException e13) {
                        e = e13;
                        iOException = e;
                        Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                        a0Var2.b();
                        return null;
                    } catch (XmlPullParserException e14) {
                        e = e14;
                        xmlPullParserException = e;
                        Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                        a0Var2.b();
                        return null;
                    }
                }
                throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(resourceId) + "\" (" + Integer.toHexString(resourceId) + ") is not a Font: " + typedValue);
            }
        }
        return null;
    }

    public ByteBuffer I() {
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
        return (ByteBuffer) this.f14180c;
    }

    public int J(int i10) {
        e6.n nVar = (e6.n) this.f14180c;
        if (i10 < 0) {
            return -1;
        }
        int childCount = ((RecyclerView) ((ka.c) this.f14179b).f13565b).getChildCount();
        int i11 = i10;
        while (i11 < childCount) {
            int x10 = i10 - (i11 - nVar.x(i11));
            if (x10 == 0) {
                while (nVar.D(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += x10;
        }
        return -1;
    }

    public View K(int i10) {
        return ((RecyclerView) ((ka.c) this.f14179b).f13565b).getChildAt(i10);
    }

    public int L() {
        return ((RecyclerView) ((ka.c) this.f14179b).f13565b).getChildCount();
    }

    public boolean M() {
        String trim;
        ArrayDeque arrayDeque = (ArrayDeque) this.f14180c;
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
            String readLine = ((BufferedReader) this.f14179b).readLine();
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

    public void N(View view) {
        ((ArrayList) this.d).add(view);
        ka.c cVar = (ka.c) this.f14179b;
        c1 V = RecyclerView.V(view);
        if (V != null) {
            View view2 = V.f42929a;
            RecyclerView recyclerView = (RecyclerView) cVar.f13565b;
            int i10 = V.f42944s;
            if (i10 != -1) {
                V.f42943r = i10;
            } else {
                WeakHashMap weakHashMap = i0.f42096a;
                V.f42943r = view2.getImportantForAccessibility();
            }
            if (recyclerView.c0()) {
                V.f42944s = 4;
                recyclerView.J0.add(V);
                return;
            }
            WeakHashMap weakHashMap2 = i0.f42096a;
            view2.setImportantForAccessibility(4);
        }
    }

    public void O(g2.h r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, u2.u0 r15) {
        throw new UnsupportedOperationException("Method not decompiled: lf.i.O(g2.h, android.net.Uri, java.util.Map, long, long, u2.u0):void");
    }

    public String P() {
        if (M()) {
            String str = (String) this.d;
            this.d = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    public void R() {
        ((TypedArray) this.f14180c).recycle();
    }

    public void S() {
        int i10;
        RecyclerView recyclerView = (RecyclerView) ((ka.c) this.f14179b).f13565b;
        ((e6.n) this.f14180c).G();
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            c1 V = RecyclerView.V((View) arrayList.get(size));
            if (V != null) {
                int i11 = V.f42943r;
                if (recyclerView.c0()) {
                    V.f42944s = i11;
                    recyclerView.J0.add(V);
                } else {
                    View view = V.f42929a;
                    WeakHashMap weakHashMap = i0.f42096a;
                    view.setImportantForAccessibility(i11);
                }
                V.f42943r = 0;
            }
            arrayList.remove(size);
        }
        int childCount = recyclerView.getChildCount();
        for (i10 = 0; i10 < childCount; i10++) {
            View childAt = recyclerView.getChildAt(i10);
            recyclerView.s(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
    }

    public void T(of.g gVar) {
        if (((of.d) this.f14179b) != null) {
            for (int i10 = 0; i10 < gVar.f15671a.size(); i10++) {
                of.d dVar = (of.d) this.f14179b;
                dVar.h.remove(gVar.a(i10).d);
                dVar.h();
            }
        }
    }

    public void V(l5.i iVar, int i10, boolean z10) {
        Long l4;
        char c10;
        r5.a aVar = (r5.a) this.d;
        Context context = (Context) this.f14179b;
        ComponentName componentName = new ComponentName(context, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = iVar.f14054a;
        String str2 = iVar.f14054a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        i5.d dVar = iVar.f14056c;
        adler32.update(allocate.putInt(v5.a.a(dVar)).array());
        byte[] bArr = iVar.f14055b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z10) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i11 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i11 >= i10) {
                        g6.a(iVar, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                        return;
                    }
                }
            }
        }
        Cursor rawQuery = ((s5.h) ((s5.d) this.f14180c)).a().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str2, String.valueOf(v5.a.a(dVar))});
        try {
            if (rawQuery.moveToNext()) {
                l4 = Long.valueOf(rawQuery.getLong(0));
            } else {
                l4 = 0L;
            }
            rawQuery.close();
            long longValue = l4.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(aVar.a(dVar, longValue, i10));
            Set set = ((r5.b) aVar.f42296b.get(dVar)).f42299c;
            if (set.contains(r5.c.f42300a)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(r5.c.f42302c)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(r5.c.f42301b)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i10);
            persistableBundle.putString("backendName", str2);
            persistableBundle.putInt("priority", v5.a.a(dVar));
            if (bArr != null) {
                c10 = 0;
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            } else {
                c10 = 0;
            }
            builder.setExtras(persistableBundle);
            Integer valueOf = Integer.valueOf(value);
            Long valueOf2 = Long.valueOf(aVar.a(dVar, longValue, i10));
            Integer valueOf3 = Integer.valueOf(i10);
            Object[] objArr = new Object[5];
            objArr[c10] = iVar;
            objArr[1] = valueOf;
            objArr[2] = valueOf2;
            objArr[3] = l4;
            objArr[4] = valueOf3;
            String c11 = g6.c("JobInfoScheduler");
            if (Log.isLoggable(c11, 3)) {
                Log.d(c11, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th2) {
            rawQuery.close();
            throw th2;
        }
    }

    public void W(of.a aVar) {
        of.g gVar;
        of.g gVar2 = (of.g) this.f14180c;
        if (gVar2 != null && ((of.a) this.d) == null && aVar != null) {
            q(gVar2);
        }
        if (((of.a) this.d) != null && (gVar = (of.g) this.f14180c) != null && aVar == null) {
            T(gVar);
        }
        of.a aVar2 = (of.a) this.d;
        if (aVar2 != null) {
            e6.h hVar = aVar2.f15644a;
            n6.l.e("Must be called from the main thread.");
            hVar.f8018i.remove(aVar2);
        }
        if (aVar != null) {
            aVar.f15644a.p(aVar);
            of.g gVar3 = (of.g) this.f14180c;
            if (gVar3 != null) {
                aVar.d = gVar3;
                aVar.f15648g = 0;
                aVar.h = 0;
                aVar.p();
            }
        }
        this.d = aVar;
    }

    public FileOutputStream X() {
        File file = (File) this.f14180c;
        File file2 = (File) this.d;
        if (file2.exists()) {
            U(file2, (File) this.f14179b);
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

    public void Y(View view) {
        if (((ArrayList) this.d).remove(view)) {
            ka.c cVar = (ka.c) this.f14179b;
            c1 V = RecyclerView.V(view);
            if (V != null) {
                RecyclerView recyclerView = (RecyclerView) cVar.f13565b;
                int i10 = V.f42943r;
                if (recyclerView.c0()) {
                    V.f42944s = i10;
                    recyclerView.J0.add(V);
                } else {
                    View view2 = V.f42929a;
                    WeakHashMap weakHashMap = i0.f42096a;
                    view2.setImportantForAccessibility(i10);
                }
                V.f42943r = 0;
            }
        }
    }

    public void Z(Object obj, String str) {
        i iVar = new i(7, false);
        ((i) this.d).d = iVar;
        this.d = iVar;
        iVar.f14180c = obj;
        iVar.f14179b = str;
    }

    @Override
    public Uri c() {
        return (Uri) this.f14179b;
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
        ((ok) this.d).Q.w();
    }

    @Override
    public Object mo28get() {
        return new i((Context) ((fd.a) this.f14179b).mo28get(), (s5.d) ((fd.a) this.f14180c).mo28get(), (r5.a) ((qb.b) this.d).mo28get(), 24);
    }

    @Override
    public ClipDescription getDescription() {
        return (ClipDescription) this.f14180c;
    }

    @Override
    public void h(android.view.View r13, zg.o0 r14, boolean r15, boolean r16) {
        throw new UnsupportedOperationException("Method not decompiled: lf.i.h(android.view.View, zg.o0, boolean, boolean):void");
    }

    @Override
    public void i(int i10, boolean z10, boolean z11) {
        String str;
        if (!z10) {
            ok okVar = (ok) this.d;
            HashMap hashMap = (HashMap) this.f14179b;
            ArrayList arrayList = (ArrayList) this.f14180c;
            vi viVar = okVar.f26688b;
            if (!hashMap.isEmpty() && okVar.Q != null && !okVar.K) {
                okVar.K = true;
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
                e5.a0(viVar.J1, viVar.j1() + arrayList2.size(), viVar.n1(), new d4(i10, 1, okVar, arrayList2, z11));
            }
        }
    }

    @Override
    public boolean j() {
        return true;
    }

    @Override
    public boolean k() {
        return false;
    }

    @Override
    public Object l() {
        return null;
    }

    @Override
    public ja.a m(Class cls, ia.d dVar) {
        ((HashMap) this.f14179b).put(cls, dVar);
        ((HashMap) this.f14180c).remove(cls);
        return this;
    }

    public void q(of.g gVar) {
        if (((of.d) this.f14179b) == null) {
            this.f14179b = new of.d();
        }
        for (int i10 = 0; i10 < gVar.f15671a.size(); i10++) {
            of.d dVar = (of.d) this.f14179b;
            of.f a2 = gVar.a(i10);
            dVar.h.put(a2.d, a2);
            dVar.h();
        }
    }

    @Override
    public boolean r() {
        return false;
    }

    public void s(View view, int i10, boolean z10) {
        int J;
        RecyclerView recyclerView = (RecyclerView) ((ka.c) this.f14179b).f13565b;
        if (i10 < 0) {
            J = recyclerView.getChildCount();
        } else {
            J = J(i10);
        }
        ((e6.n) this.f14180c).E(J, z10);
        if (z10) {
            N(view);
        }
        recyclerView.addView(view, J);
        c1 V = RecyclerView.V(view);
        recyclerView.g0(view);
        h0 h0Var = recyclerView.f2866w;
        if (h0Var != null && V != null) {
            h0Var.y(V);
        }
        ArrayList arrayList = recyclerView.P;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((y) recyclerView.P.get(size)).getClass();
            }
        }
    }

    public void t(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        int J;
        RecyclerView recyclerView = (RecyclerView) ((ka.c) this.f14179b).f13565b;
        if (i10 < 0) {
            J = recyclerView.getChildCount();
        } else {
            J = J(i10);
        }
        ((e6.n) this.f14180c).E(J, z10);
        if (z10) {
            N(view);
        }
        c1 V = RecyclerView.V(view);
        if (V != null) {
            if (!V.l() && !V.r()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + V + recyclerView.D());
            }
            V.f42937l &= -257;
        }
        RecyclerView.c(recyclerView, view, J, layoutParams);
    }

    public String toString() {
        switch (this.f14178a) {
            case 0:
                StringBuilder sb2 = new StringBuilder("id3v2tag[pos=");
                mf.a aVar = (mf.a) this.f14179b;
                sb2.append(aVar.f7303b);
                sb2.append(", ");
                sb2.append(aVar.e());
                sb2.append(" left]");
                return sb2.toString();
            case 8:
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append((String) this.f14179b);
                sb3.append('{');
                i iVar = (i) ((i) this.f14180c).d;
                String str = "";
                while (iVar != null) {
                    Object obj = iVar.f14180c;
                    sb3.append(str);
                    String str2 = (String) iVar.f14179b;
                    if (str2 != null) {
                        sb3.append(str2);
                        sb3.append('=');
                    }
                    if (obj != null && obj.getClass().isArray()) {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb3.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    } else {
                        sb3.append(obj);
                    }
                    iVar = (i) iVar.d;
                    str = ", ";
                }
                sb3.append('}');
                return sb3.toString();
            case 25:
                return ((e6.n) this.f14180c).toString() + ", hidden list:" + ((ArrayList) this.d).size();
            default:
                return super.toString();
        }
    }

    public String u(int i10, String str, long j3, long j10) {
        ArrayList arrayList = (ArrayList) this.f14179b;
        ArrayList arrayList2 = (ArrayList) this.d;
        ArrayList arrayList3 = (ArrayList) this.f14180c;
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < arrayList3.size(); i11++) {
            sb2.append((String) arrayList.get(i11));
            if (((Integer) arrayList3.get(i11)).intValue() == 1) {
                sb2.append(str);
            } else if (((Integer) arrayList3.get(i11)).intValue() == 2) {
                sb2.append(String.format(Locale.US, (String) arrayList2.get(i11), Long.valueOf(j3)));
            } else if (((Integer) arrayList3.get(i11)).intValue() == 3) {
                sb2.append(String.format(Locale.US, (String) arrayList2.get(i11), Integer.valueOf(i10)));
            } else if (((Integer) arrayList3.get(i11)).intValue() == 4) {
                sb2.append(String.format(Locale.US, (String) arrayList2.get(i11), Long.valueOf(j10)));
            }
        }
        sb2.append((String) arrayList.get(arrayList3.size()));
        return sb2.toString();
    }

    public void v() {
        b0 b0Var = (b0) this.f14179b;
        if (b0Var != null) {
            int i10 = ((p4.e) this.d).f40815n.d;
            v vVar = b0Var.f1838a;
            vVar.getClass();
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(i10);
            vVar.f1860a.setPlaybackToLocal(builder.build());
            this.f14180c = null;
        }
    }

    public void y(int i10) {
        c1 V;
        int J = J(i10);
        ((e6.n) this.f14180c).F(J);
        RecyclerView recyclerView = (RecyclerView) ((ka.c) this.f14179b).f13565b;
        View childAt = recyclerView.getChildAt(J);
        if (childAt != null && (V = RecyclerView.V(childAt)) != null) {
            if (V.l() && !V.r()) {
                throw new IllegalArgumentException("called detach on an already detached child " + V + recyclerView.D());
            }
            V.a(256);
        }
        RecyclerView.d(recyclerView, J);
    }

    public e z(f fVar) {
        InflaterInputStream inflaterInputStream;
        int i10 = fVar.f14170c;
        InputStream inputStream = (mf.a) this.f14179b;
        if (fVar.d) {
            a4.m mVar = (a4.m) this.d;
            mVar.getClass();
            byte[] bArr = new byte[i10];
            int i11 = 0;
            while (i11 < i10) {
                int read = ((com.google.firebase.messaging.d) mVar.f275b).read(bArr, i11, i10 - i11);
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
        if (!fVar.f14171f) {
            if (fVar.e) {
                i10 = fVar.f14172g;
                inflaterInputStream = new InflaterInputStream(inputStream);
            } else {
                inflaterInputStream = inputStream;
            }
            return new e(inflaterInputStream, fVar.f14169b, i10, (j) this.f14180c, fVar);
        }
        throw new Exception("Frame encryption is not supported");
    }

    public i(Object obj, Object obj2, Object obj3, int i10) {
        this.f14178a = i10;
        this.f14179b = obj;
        this.f14180c = obj2;
        this.d = obj3;
    }

    public i(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f14178a = i10;
        this.d = obj;
        this.f14179b = obj2;
        this.f14180c = obj3;
    }

    public i(String str) {
        this.f14178a = 8;
        i iVar = new i(7, false);
        this.f14180c = iVar;
        this.d = iVar;
        this.f14179b = str;
    }

    public i(InputStream inputStream, long j3, int i10, j jVar) {
        this.f14178a = 0;
        mf.a aVar = new mf.a(inputStream, j3, i10);
        this.f14179b = aVar;
        this.d = new a4.m(aVar, 27);
        this.f14180c = jVar;
    }

    public i(String str, Boolean bool, uc.a aVar, String str2) {
        this.f14178a = 28;
        this.f14179b = str;
        this.f14180c = str2;
        this.d = aVar;
    }

    public i(int i10) {
        this.f14178a = i10;
        switch (i10) {
            case 22:
                this.f14179b = new Object();
                this.f14180c = null;
                this.d = null;
                return;
            case 29:
                this.f14179b = new HashMap();
                this.f14180c = new HashMap();
                this.d = v7.i.f44251c;
                return;
            default:
                this.f14179b = new Object();
                return;
        }
    }

    @Override
    public void a() {
    }

    @Override
    public void d() {
    }

    @Override
    public void o() {
    }

    @Override
    public void p() {
    }

    public i(ka.c cVar) {
        this.f14178a = 25;
        this.f14179b = cVar;
        this.f14180c = new e6.n(6);
        this.d = new ArrayList();
    }

    public i(File file) {
        this.f14178a = 20;
        this.f14179b = file;
        this.f14180c = new File(file.getPath() + ".new");
        this.d = new File(file.getPath() + ".bak");
    }

    @Override
    public void b(Editable editable) {
    }

    public i(r rVar) {
        this.f14178a = 27;
        this.f14179b = rVar;
    }

    public i(Runnable runnable) {
        this.f14178a = 23;
        this.f14180c = new CopyOnWriteArrayList();
        this.d = new HashMap();
        this.f14179b = runnable;
    }

    public i(Context context, TypedArray typedArray) {
        this.f14178a = 1;
        this.f14179b = context;
        this.f14180c = typedArray;
    }

    public i(byte[] bArr, w wVar) {
        this.f14178a = 3;
        this.f14179b = bArr;
        this.f14180c = null;
        this.d = wVar;
    }

    public i(Uri uri, w wVar) {
        this.f14178a = 3;
        this.f14179b = null;
        this.f14180c = uri;
        this.d = wVar;
    }

    public i(u uVar) {
        this.f14178a = 9;
        this.f14178a = 9;
        this.f14179b = uVar;
        this.f14180c = Choreographer.getInstance();
        this.d = new o1.a(this, 0);
    }

    public i(String str, String str2) {
        this.f14178a = 11;
        this.f14179b = str;
        this.f14180c = str2;
        this.d = str2.isEmpty() ? str : a4.a.C(str, "/", str2);
    }

    public i(p4.e eVar, b0 b0Var) {
        this.f14178a = 19;
        this.d = eVar;
        this.f14179b = b0Var;
    }

    public i(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.f14178a = 18;
        this.f14180c = arrayDeque;
        this.f14179b = bufferedReader;
    }

    public i(Object[] objArr, Object[] objArr2) {
        this.f14178a = 15;
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
        this.f14179b = iArr;
        this.f14180c = w(objArr, iArr);
        this.d = w(objArr2, iArr);
    }

    @Override
    public void n(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
