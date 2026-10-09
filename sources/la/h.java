package la;

import a0.k;
import ai.e4;
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
import c3.l;
import c3.r;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import e2.a0;
import e6.n;
import e9.k0;
import e9.m0;
import e9.o1;
import g2.o;
import gg.w1;
import h0.j;
import i9.w;
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
import k2.g0;
import m.f3;
import m.q;
import n2.m;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.l01;
import org.telegram.ui.Components.sk;
import org.telegram.ui.Components.w71;
import org.telegram.ui.Components.xz0;
import org.telegram.ui.Components.yi;
import org.telegram.ui.ar0;
import org.xmlpull.v1.XmlPullParserException;
import r0.i0;
import s4.d1;
import s4.z;
import v7.s7;
import v7.v7;
import w7.i6;
public class h implements jl0, ar0, n5.b, t0.h {
    public final int f15461a;
    public Object f15462b;
    public Object f15463c;
    public Object d;

    public h(int i10, boolean z10) {
        this.f15461a = i10;
    }

    public static h R(Context context, AttributeSet attributeSet, int[] iArr, int i10) {
        return new h(context, context.obtainStyledAttributes(attributeSet, iArr, i10, 0));
    }

    public static void V(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e("AtomicFile", "Failed to delete file which is a directory " + file2);
        }
        if (!file.renameTo(file2)) {
            Log.e("AtomicFile", "Failed to rename " + file + " to " + file2);
        }
    }

    public static h n(View view) {
        return new h(view);
    }

    public static Object[] w(Object[] objArr, int[] iArr) {
        int length = objArr.length;
        Class<?> componentType = objArr.getClass().getComponentType();
        xz0 xz0Var = l01.R;
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

    public static n2.e x(c0 c0Var) {
        String uri;
        boolean z10;
        boolean z11;
        o oVar = new o();
        byte[] bArr = null;
        oVar.f10283c = null;
        Uri uri2 = c0Var.f3258b;
        if (uri2 == null) {
            uri = null;
        } else {
            uri = uri2.toString();
        }
        boolean z12 = c0Var.f3261f;
        ?? obj = new Object();
        if (z12 && TextUtils.isEmpty(uri)) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.b(z10);
        obj.f7952b = oVar;
        obj.f7953c = uri;
        obj.f7951a = z12;
        obj.d = new HashMap();
        k0 k0Var = c0Var.f3259c;
        m0 m0Var = k0Var.f8761a;
        if (m0Var == null) {
            m0Var = k0Var.b();
            k0Var.f8761a = m0Var;
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
        UUID uuid = b2.i.f3333a;
        rb.a aVar = new rb.a(26);
        UUID uuid2 = c0Var.f3257a;
        uuid2.getClass();
        boolean z13 = c0Var.d;
        boolean z14 = c0Var.f3260e;
        int[] f7 = v7.f(c0Var.f3262g);
        for (int i10 : f7) {
            if (i10 != 2 && i10 != 1) {
                z11 = false;
            } else {
                z11 = true;
            }
            e2.d.b(z11);
        }
        n2.e eVar = new n2.e(uuid2, obj, hashMap, z13, (int[]) f7.clone(), z14, aVar);
        byte[] bArr2 = c0Var.h;
        if (bArr2 != null) {
            bArr = Arrays.copyOf(bArr2, bArr2.length);
        }
        e2.d.g(eVar.f16509w.isEmpty());
        eVar.K = bArr;
        return eVar;
    }

    public mf.e A(mf.f fVar) {
        InflaterInputStream inflaterInputStream;
        int i10 = fVar.f16384c;
        InputStream inputStream = (nf.a) this.f15462b;
        if (fVar.d) {
            g0 g0Var = (g0) this.d;
            g0Var.getClass();
            byte[] bArr = new byte[i10];
            int i11 = 0;
            while (i11 < i10) {
                int read = ((com.google.firebase.messaging.d) g0Var.f14470b).read(bArr, i11, i10 - i11);
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
        if (!fVar.f16386f) {
            if (fVar.f16385e) {
                i10 = fVar.f16387g;
                inflaterInputStream = new InflaterInputStream(inputStream);
            } else {
                inflaterInputStream = inputStream;
            }
            return new mf.e(inflaterInputStream, fVar.f16383b, i10, (mf.i) this.f15463c, fVar);
        }
        throw new Exception("Frame encryption is not supported");
    }

    public m B(b2.k0 k0Var) {
        n2.e eVar;
        k0Var.f3400b.getClass();
        c0 c0Var = k0Var.f3400b.f3307c;
        if (c0Var == null) {
            return m.f16522z;
        }
        synchronized (this.f15462b) {
            try {
                if (!c0Var.equals((c0) this.f15463c)) {
                    this.f15463c = c0Var;
                    this.d = x(c0Var);
                }
                eVar = (n2.e) this.d;
                eVar.getClass();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
    }

    public View C(int i10) {
        return ((RecyclerView) ((g0) this.f15462b).f14470b).getChildAt(K(i10));
    }

    public int D() {
        return ((RecyclerView) ((g0) this.f15462b).f14470b).getChildCount() - ((ArrayList) this.d).size();
    }

    public ColorStateList E(int i10) {
        int resourceId;
        ColorStateList a2;
        TypedArray typedArray = (TypedArray) this.f15463c;
        if (typedArray.hasValue(i10) && (resourceId = typedArray.getResourceId(i10, 0)) != 0 && (a2 = s7.a((Context) this.f15462b, resourceId)) != null) {
            return a2;
        }
        return typedArray.getColorStateList(i10);
    }

    public long F() {
        l lVar = (l) this.d;
        if (lVar != null) {
            return lVar.d;
        }
        return -1L;
    }

    public Drawable G(int i10) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f15463c;
        if (typedArray.hasValue(i10) && (resourceId = typedArray.getResourceId(i10, 0)) != 0) {
            return s7.b((Context) this.f15462b, resourceId);
        }
        return typedArray.getDrawable(i10);
    }

    public Drawable H(int i10) {
        int resourceId;
        Drawable f7;
        if (((TypedArray) this.f15463c).hasValue(i10) && (resourceId = ((TypedArray) this.f15463c).getResourceId(i10, 0)) != 0) {
            q a2 = q.a();
            Context context = (Context) this.f15462b;
            synchronized (a2) {
                f7 = a2.f15791a.f(resourceId, context, true);
            }
            return f7;
        }
        return null;
    }

    public Typeface I(int i10, int i11, a0 a0Var) {
        a0 a0Var2;
        XmlPullParserException xmlPullParserException;
        IOException iOException;
        int resourceId = ((TypedArray) this.f15463c).getResourceId(i10, 0);
        if (resourceId != 0) {
            if (((TypedValue) this.d) == null) {
                this.d = new TypedValue();
            }
            Context context = (Context) this.f15462b;
            TypedValue typedValue = (TypedValue) this.d;
            ThreadLocal threadLocal = j.f10953a;
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
                    k kVar = i0.e.f11583b;
                    Typeface typeface = (Typeface) kVar.a(i0.e.b(resources, resourceId, charSequence2, i12, i11));
                    if (typeface != null) {
                        new Handler(Looper.getMainLooper()).post(new w1(1, a0Var, typeface));
                        return typeface;
                    }
                    try {
                    } catch (IOException e7) {
                        e = e7;
                        a0Var2 = a0Var;
                    } catch (XmlPullParserException e10) {
                        e = e10;
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
                                } catch (IOException e11) {
                                    iOException = e11;
                                    a0Var2 = a0Var;
                                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                                    a0Var2.b();
                                    return null;
                                } catch (XmlPullParserException e12) {
                                    xmlPullParserException = e12;
                                    a0Var2 = a0Var;
                                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                                    a0Var2.b();
                                    return null;
                                }
                            }
                            return i0.e.a(context, g10, resources, resourceId, charSequence2, typedValue.assetCookie, i11, a0Var);
                        }
                        int i13 = typedValue.assetCookie;
                        Typeface e13 = i0.e.f11582a.e(context, resources, resourceId, charSequence2, i11);
                        if (e13 != null) {
                            kVar.b(i0.e.b(resources, resourceId, charSequence2, i13, i11), e13);
                        }
                        if (e13 != null) {
                            new Handler(Looper.getMainLooper()).post(new w1(1, a0Var, e13));
                        } else {
                            a0Var.b();
                        }
                        return e13;
                    } catch (IOException e14) {
                        e = e14;
                        iOException = e;
                        Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                        a0Var2.b();
                        return null;
                    } catch (XmlPullParserException e15) {
                        e = e15;
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

    public ByteBuffer J() {
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
        return (ByteBuffer) this.f15463c;
    }

    public int K(int i10) {
        n nVar = (n) this.f15463c;
        if (i10 < 0) {
            return -1;
        }
        int childCount = ((RecyclerView) ((g0) this.f15462b).f14470b).getChildCount();
        int i11 = i10;
        while (i11 < childCount) {
            int A = i10 - (i11 - nVar.A(i11));
            if (A == 0) {
                while (nVar.D(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += A;
        }
        return -1;
    }

    public View L(int i10) {
        return ((RecyclerView) ((g0) this.f15462b).f14470b).getChildAt(i10);
    }

    public int M() {
        return ((RecyclerView) ((g0) this.f15462b).f14470b).getChildCount();
    }

    public boolean N() {
        String trim;
        ArrayDeque arrayDeque = (ArrayDeque) this.f15463c;
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
            String readLine = ((BufferedReader) this.f15462b).readLine();
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

    public void O(View view) {
        ((ArrayList) this.d).add(view);
        g0 g0Var = (g0) this.f15462b;
        d1 U = RecyclerView.U(view);
        if (U != null) {
            View view2 = U.f47658a;
            RecyclerView recyclerView = (RecyclerView) g0Var.f14470b;
            int i10 = U.f47674s;
            if (i10 != -1) {
                U.f47673r = i10;
            } else {
                WeakHashMap weakHashMap = i0.f46766a;
                U.f47673r = view2.getImportantForAccessibility();
            }
            if (recyclerView.b0()) {
                U.f47674s = 4;
                recyclerView.K0.add(U);
                return;
            }
            WeakHashMap weakHashMap2 = i0.f46766a;
            view2.setImportantForAccessibility(4);
        }
    }

    public void P(g2.h r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, u2.u0 r15) {
        throw new UnsupportedOperationException("Method not decompiled: la.h.P(g2.h, android.net.Uri, java.util.Map, long, long, u2.u0):void");
    }

    public String Q() {
        if (N()) {
            String str = (String) this.d;
            this.d = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    public void S() {
        ((TypedArray) this.f15463c).recycle();
    }

    public void T() {
        int i10;
        RecyclerView recyclerView = (RecyclerView) ((g0) this.f15462b).f14470b;
        ((n) this.f15463c).G();
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            d1 U = RecyclerView.U((View) arrayList.get(size));
            if (U != null) {
                int i11 = U.f47673r;
                if (recyclerView.b0()) {
                    U.f47674s = i11;
                    recyclerView.K0.add(U);
                } else {
                    View view = U.f47658a;
                    WeakHashMap weakHashMap = i0.f46766a;
                    view.setImportantForAccessibility(i11);
                }
                U.f47673r = 0;
            }
            arrayList.remove(size);
        }
        int childCount = recyclerView.getChildCount();
        for (i10 = 0; i10 < childCount; i10++) {
            View childAt = recyclerView.getChildAt(i10);
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
    }

    public void U(pf.g gVar) {
        if (((pf.d) this.f15462b) != null) {
            for (int i10 = 0; i10 < gVar.f45582a.size(); i10++) {
                pf.d dVar = (pf.d) this.f15462b;
                dVar.h.remove(gVar.a(i10).d);
                dVar.h();
            }
        }
    }

    public void W(l5.i iVar, int i10, boolean z10) {
        Long l4;
        char c10;
        r5.a aVar = (r5.a) this.d;
        Context context = (Context) this.f15462b;
        ComponentName componentName = new ComponentName(context, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = iVar.f15411a;
        String str2 = iVar.f15411a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        i5.d dVar = iVar.f15413c;
        adler32.update(allocate.putInt(v5.a.a(dVar)).array());
        byte[] bArr = iVar.f15412b;
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
                        i6.a(iVar, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                        return;
                    }
                }
            }
        }
        Cursor rawQuery = ((s5.g) ((s5.d) this.f15463c)).a().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str2, String.valueOf(v5.a.a(dVar))});
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
            Set set = ((r5.b) aVar.f46979b.get(dVar)).f46982c;
            if (set.contains(r5.c.f46983a)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(r5.c.f46985c)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(r5.c.f46984b)) {
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
            String c11 = i6.c("JobInfoScheduler");
            if (Log.isLoggable(c11, 3)) {
                Log.d(c11, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th2) {
            rawQuery.close();
            throw th2;
        }
    }

    public void X(pf.a aVar) {
        pf.g gVar;
        pf.g gVar2 = (pf.g) this.f15463c;
        if (gVar2 != null && ((pf.a) this.d) == null && aVar != null) {
            k(gVar2);
        }
        if (((pf.a) this.d) != null && (gVar = (pf.g) this.f15463c) != null && aVar == null) {
            U(gVar);
        }
        pf.a aVar2 = (pf.a) this.d;
        if (aVar2 != null) {
            e6.h hVar = aVar2.f45551a;
            n6.l.e("Must be called from the main thread.");
            hVar.f8677i.remove(aVar2);
        }
        if (aVar != null) {
            aVar.f45551a.p(aVar);
            pf.g gVar3 = (pf.g) this.f15463c;
            if (gVar3 != null) {
                aVar.d = gVar3;
                aVar.f45556g = 0;
                aVar.h = 0;
                aVar.p();
            }
        }
        this.d = aVar;
    }

    public FileOutputStream Y() {
        File file = (File) this.f15463c;
        File file2 = (File) this.d;
        if (file2.exists()) {
            V(file2, (File) this.f15462b);
        }
        try {
            return new FileOutputStream(file);
        } catch (FileNotFoundException unused) {
            if (file.getParentFile().mkdirs()) {
                try {
                    return new FileOutputStream(file);
                } catch (FileNotFoundException e7) {
                    throw new IOException("Failed to create new file " + file, e7);
                }
            }
            throw new IOException("Failed to create directory for " + file);
        }
    }

    public void Z(View view) {
        if (((ArrayList) this.d).remove(view)) {
            g0 g0Var = (g0) this.f15462b;
            d1 U = RecyclerView.U(view);
            if (U != null) {
                RecyclerView recyclerView = (RecyclerView) g0Var.f14470b;
                int i10 = U.f47673r;
                if (recyclerView.b0()) {
                    U.f47674s = i10;
                    recyclerView.K0.add(U);
                } else {
                    View view2 = U.f47658a;
                    WeakHashMap weakHashMap = i0.f46766a;
                    view2.setImportantForAccessibility(i10);
                }
                U.f47673r = 0;
            }
        }
    }

    public void a0(Object obj, String str) {
        h hVar = new h(8, false);
        ((h) this.d).d = hVar;
        this.d = hVar;
        hVar.f15463c = obj;
        hVar.f15462b = str;
    }

    @Override
    public Uri c() {
        return (Uri) this.f15462b;
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
        ((sk) this.d).Q.x();
    }

    @Override
    public Object mo27get() {
        return new h((Context) ((gd.a) this.f15462b).mo27get(), (s5.d) ((gd.a) this.f15463c).mo27get(), (r5.a) ((qb.b) this.d).mo27get(), 26);
    }

    @Override
    public ClipDescription getDescription() {
        return (ClipDescription) this.f15463c;
    }

    @Override
    public void h(int i10, boolean z10, boolean z11) {
        String str;
        if (!z10) {
            sk skVar = (sk) this.d;
            HashMap hashMap = (HashMap) this.f15462b;
            ArrayList arrayList = (ArrayList) this.f15463c;
            yi yiVar = skVar.f30173b;
            if (!hashMap.isEmpty() && skVar.Q != null && !skVar.K) {
                skVar.K = true;
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
                g5.Z(yiVar.M1, yiVar.l1() + arrayList2.size(), yiVar.p1(), new e4(i10, 2, skVar, arrayList2, z11));
            }
        }
    }

    @Override
    public Object i() {
        return null;
    }

    public void k(pf.g gVar) {
        if (((pf.d) this.f15462b) == null) {
            this.f15462b = new pf.d();
        }
        for (int i10 = 0; i10 < gVar.f45582a.size(); i10++) {
            pf.d dVar = (pf.d) this.f15462b;
            pf.f a2 = gVar.a(i10);
            dVar.h.put(a2.d, a2);
            dVar.h();
        }
    }

    public void l(View view, int i10, boolean z10) {
        int K;
        RecyclerView recyclerView = (RecyclerView) ((g0) this.f15462b).f14470b;
        if (i10 < 0) {
            K = recyclerView.getChildCount();
        } else {
            K = K(i10);
        }
        ((n) this.f15463c).E(K, z10);
        if (z10) {
            O(view);
        }
        recyclerView.addView(view, K);
        d1 U = RecyclerView.U(view);
        recyclerView.f0(view);
        s4.i0 i0Var = recyclerView.f3167w;
        if (i0Var != null && U != null) {
            i0Var.y(U);
        }
        ArrayList arrayList = recyclerView.P;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((z) recyclerView.P.get(size)).getClass();
            }
        }
    }

    @Override
    public void m(android.view.View r13, zg.n0 r14, boolean r15, boolean r16) {
        throw new UnsupportedOperationException("Method not decompiled: la.h.m(android.view.View, zg.n0, boolean, boolean):void");
    }

    @Override
    public boolean o() {
        return true;
    }

    public void p(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        int K;
        RecyclerView recyclerView = (RecyclerView) ((g0) this.f15462b).f14470b;
        if (i10 < 0) {
            K = recyclerView.getChildCount();
        } else {
            K = K(i10);
        }
        ((n) this.f15463c).E(K, z10);
        if (z10) {
            O(view);
        }
        d1 U = RecyclerView.U(view);
        if (U != null) {
            if (!U.l() && !U.r()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + U + recyclerView.C());
            }
            U.f47667l &= -257;
        }
        RecyclerView.c(recyclerView, view, K, layoutParams);
    }

    @Override
    public boolean q() {
        return false;
    }

    public String t(int i10, String str, long j3, long j10) {
        ArrayList arrayList = (ArrayList) this.f15462b;
        ArrayList arrayList2 = (ArrayList) this.d;
        ArrayList arrayList3 = (ArrayList) this.f15463c;
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

    public String toString() {
        switch (this.f15461a) {
            case 5:
                StringBuilder sb2 = new StringBuilder("id3v2tag[pos=");
                nf.a aVar = (nf.a) this.f15462b;
                sb2.append(aVar.f7926b);
                sb2.append(", ");
                sb2.append(aVar.e());
                sb2.append(" left]");
                return sb2.toString();
            case 9:
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append((String) this.f15462b);
                sb3.append('{');
                h hVar = (h) ((h) this.f15463c).d;
                String str = "";
                while (hVar != null) {
                    Object obj = hVar.f15463c;
                    sb3.append(str);
                    String str2 = (String) hVar.f15462b;
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
                    hVar = (h) hVar.d;
                    str = ", ";
                }
                sb3.append('}');
                return sb3.toString();
            case 27:
                return ((n) this.f15463c).toString() + ", hidden list:" + ((ArrayList) this.d).size();
            default:
                return super.toString();
        }
    }

    public void u() {
        android.support.v4.media.session.a0 a0Var = (android.support.v4.media.session.a0) this.f15462b;
        if (a0Var != null) {
            int i10 = ((p4.e) this.d).f45338n.d;
            v vVar = a0Var.f2071a;
            vVar.getClass();
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(i10);
            vVar.f2095a.setPlaybackToLocal(builder.build());
            this.f15463c = null;
        }
    }

    @Override
    public boolean v() {
        return false;
    }

    public void y(int i10) {
        d1 U;
        int K = K(i10);
        ((n) this.f15463c).F(K);
        RecyclerView recyclerView = (RecyclerView) ((g0) this.f15462b).f14470b;
        View childAt = recyclerView.getChildAt(K);
        if (childAt != null && (U = RecyclerView.U(childAt)) != null) {
            if (U.l() && !U.r()) {
                throw new IllegalArgumentException("called detach on an already detached child " + U + recyclerView.C());
            }
            U.a(256);
        }
        RecyclerView.d(recyclerView, K);
    }

    public void z(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = (HashMap) this.f15462b;
        f fVar = new f(byteArrayOutputStream, hashMap, (HashMap) this.f15463c, (ia.d) this.d);
        if (obj == null) {
            return;
        }
        ia.d dVar = (ia.d) hashMap.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, fVar);
            return;
        }
        throw new RuntimeException("No encoder for " + obj.getClass());
    }

    public h(Object obj, Object obj2, Object obj3, int i10) {
        this.f15461a = i10;
        this.f15462b = obj;
        this.f15463c = obj2;
        this.d = obj3;
    }

    public h(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f15461a = i10;
        this.d = obj;
        this.f15462b = obj2;
        this.f15463c = obj3;
    }

    public h(String str) {
        this.f15461a = 9;
        h hVar = new h(8, false);
        this.f15463c = hVar;
        this.d = hVar;
        this.f15462b = str;
    }

    public h(InputStream inputStream, long j3, int i10, mf.i iVar) {
        this.f15461a = 5;
        nf.a aVar = new nf.a(inputStream, j3, i10);
        this.f15462b = aVar;
        this.d = new g0(aVar, 5);
        this.f15463c = iVar;
    }

    public h(View view) {
        this.f15461a = 16;
        this.d = view;
        w71 w71Var = new w71(this, view);
        this.f15462b = w71Var;
        view.addOnLayoutChangeListener(w71Var);
    }

    public h(int i10) {
        this.f15461a = i10;
        switch (i10) {
            case 24:
                this.f15462b = new Object();
                this.f15463c = null;
                this.d = null;
                return;
            default:
                this.f15462b = new Object();
                return;
        }
    }

    public h(g0 g0Var) {
        this.f15461a = 27;
        this.f15462b = g0Var;
        this.f15463c = new n(6);
        this.d = new ArrayList();
    }

    @Override
    public void a() {
    }

    @Override
    public void d() {
    }

    @Override
    public void j() {
    }

    @Override
    public void s() {
    }

    public h(File file) {
        this.f15461a = 22;
        this.f15462b = file;
        this.f15463c = new File(file.getPath() + ".new");
        this.d = new File(file.getPath() + ".bak");
    }

    @Override
    public void b(Editable editable) {
    }

    public h(r rVar) {
        this.f15461a = 29;
        this.f15462b = rVar;
    }

    public h(Runnable runnable) {
        this.f15461a = 25;
        this.d = new CopyOnWriteArrayList();
        this.f15462b = new HashMap();
        this.f15463c = runnable;
    }

    public h(Context context, TypedArray typedArray) {
        this.f15461a = 1;
        this.f15462b = context;
        this.f15463c = typedArray;
    }

    public h(byte[] bArr, w wVar) {
        this.f15461a = 3;
        this.f15462b = bArr;
        this.f15463c = null;
        this.d = wVar;
    }

    public h(Uri uri, w wVar) {
        this.f15461a = 3;
        this.f15462b = null;
        this.f15463c = uri;
        this.d = wVar;
    }

    public h(f3 f3Var) {
        this.f15461a = 10;
        this.f15461a = 10;
        this.f15462b = f3Var;
        this.f15463c = Choreographer.getInstance();
        this.d = new o1.a(this, 0);
    }

    public h(String str, String str2) {
        this.f15461a = 11;
        this.f15462b = str;
        this.f15463c = str2;
        this.d = str2.isEmpty() ? str : a1.g.D(str, "/", str2);
    }

    public h(p4.e eVar, android.support.v4.media.session.a0 a0Var) {
        this.f15461a = 20;
        this.d = eVar;
        this.f15462b = a0Var;
    }

    public h(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.f15461a = 19;
        this.f15463c = arrayDeque;
        this.f15462b = bufferedReader;
    }

    public h(Object[] objArr, Object[] objArr2) {
        this.f15461a = 15;
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
        this.f15462b = iArr;
        this.f15463c = w(objArr, iArr);
        this.d = w(objArr2, iArr);
    }

    @Override
    public void r(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
