package m;

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
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
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
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Components.aj;
import org.telegram.ui.Components.b81;
import org.telegram.ui.Components.d01;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.r01;
import org.telegram.ui.Components.uk;
import org.telegram.ui.cr0;
import org.xmlpull.v1.XmlPullParserException;
import v7.s7;
import v7.v7;
import w7.h6;
public class f3 implements ml0, cr0, n5.b, t0.h {
    public final int f15422a;
    public Object f15423b;
    public Object f15424c;
    public Object d;

    public f3(int i10, boolean z10) {
        this.f15422a = i10;
    }

    public static f3 Q(Context context, AttributeSet attributeSet, int[] iArr, int i10) {
        return new f3(context, context.obtainStyledAttributes(attributeSet, iArr, i10, 0));
    }

    public static void U(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e("AtomicFile", "Failed to delete file which is a directory " + file2);
        }
        if (!file.renameTo(file2)) {
            Log.e("AtomicFile", "Failed to rename " + file + " to " + file2);
        }
    }

    public static f3 s(View view) {
        return new f3(view);
    }

    public static Object[] w(Object[] objArr, int[] iArr) {
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

    public static n2.e x(b2.c0 c0Var) {
        String uri;
        boolean z10;
        boolean z11;
        g2.o oVar = new g2.o();
        byte[] bArr = null;
        oVar.f10281c = null;
        Uri uri2 = c0Var.f3256b;
        if (uri2 == null) {
            uri = null;
        } else {
            uri = uri2.toString();
        }
        boolean z12 = c0Var.f3259f;
        ?? obj = new Object();
        if (z12 && TextUtils.isEmpty(uri)) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.b(z10);
        obj.f7948b = oVar;
        obj.f7949c = uri;
        obj.f7947a = z12;
        obj.d = new HashMap();
        e9.k0 k0Var = c0Var.f3257c;
        e9.m0 m0Var = k0Var.f8758a;
        if (m0Var == null) {
            m0Var = k0Var.b();
            k0Var.f8758a = m0Var;
        }
        e9.o1 it = m0Var.iterator();
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
        UUID uuid = b2.i.f3331a;
        ?? obj2 = new Object();
        UUID uuid2 = c0Var.f3255a;
        uuid2.getClass();
        boolean z13 = c0Var.d;
        boolean z14 = c0Var.f3258e;
        int[] f7 = v7.f(c0Var.f3260g);
        for (int i10 : f7) {
            if (i10 != 2 && i10 != 1) {
                z11 = false;
            } else {
                z11 = true;
            }
            e2.d.b(z11);
        }
        n2.e eVar = new n2.e(uuid2, obj, hashMap, z13, (int[]) f7.clone(), z14, obj2);
        byte[] bArr2 = c0Var.h;
        if (bArr2 != null) {
            bArr = Arrays.copyOf(bArr2, bArr2.length);
        }
        e2.d.g(eVar.f16257w.isEmpty());
        eVar.K = bArr;
        return eVar;
    }

    public n2.m A(b2.k0 k0Var) {
        n2.e eVar;
        k0Var.f3398b.getClass();
        b2.c0 c0Var = k0Var.f3398b.f3305c;
        if (c0Var == null) {
            return n2.m.f16270z;
        }
        synchronized (this.f15423b) {
            try {
                if (!c0Var.equals((b2.c0) this.f15424c)) {
                    this.f15424c = c0Var;
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

    public View B(int i10) {
        return ((RecyclerView) ((k2.g0) this.f15423b).f14466b).getChildAt(J(i10));
    }

    public int C() {
        return ((RecyclerView) ((k2.g0) this.f15423b).f14466b).getChildCount() - ((ArrayList) this.d).size();
    }

    public ColorStateList D(int i10) {
        int resourceId;
        ColorStateList a2;
        TypedArray typedArray = (TypedArray) this.f15424c;
        if (typedArray.hasValue(i10) && (resourceId = typedArray.getResourceId(i10, 0)) != 0 && (a2 = s7.a((Context) this.f15423b, resourceId)) != null) {
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
        TypedArray typedArray = (TypedArray) this.f15424c;
        if (typedArray.hasValue(i10) && (resourceId = typedArray.getResourceId(i10, 0)) != 0) {
            return s7.b((Context) this.f15423b, resourceId);
        }
        return typedArray.getDrawable(i10);
    }

    public Drawable G(int i10) {
        int resourceId;
        Drawable f7;
        if (((TypedArray) this.f15424c).hasValue(i10) && (resourceId = ((TypedArray) this.f15424c).getResourceId(i10, 0)) != 0) {
            q a2 = q.a();
            Context context = (Context) this.f15423b;
            synchronized (a2) {
                f7 = a2.f15538a.f(resourceId, context, true);
            }
            return f7;
        }
        return null;
    }

    public Typeface H(int i10, int i11, e2.a0 a0Var) {
        e2.a0 a0Var2;
        XmlPullParserException xmlPullParserException;
        IOException iOException;
        int resourceId = ((TypedArray) this.f15424c).getResourceId(i10, 0);
        if (resourceId != 0) {
            if (((TypedValue) this.d) == null) {
                this.d = new TypedValue();
            }
            Context context = (Context) this.f15423b;
            TypedValue typedValue = (TypedValue) this.d;
            ThreadLocal threadLocal = h0.j.f10951a;
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
                    a0.k kVar = i0.e.f11581b;
                    Typeface typeface = (Typeface) kVar.a(i0.e.b(resources, resourceId, charSequence2, i12, i11));
                    if (typeface != null) {
                        new Handler(Looper.getMainLooper()).post(new gg.w1(1, a0Var, typeface));
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
                        Typeface e13 = i0.e.f11580a.e(context, resources, resourceId, charSequence2, i11);
                        if (e13 != null) {
                            kVar.b(i0.e.b(resources, resourceId, charSequence2, i13, i11), e13);
                        }
                        if (e13 != null) {
                            new Handler(Looper.getMainLooper()).post(new gg.w1(1, a0Var, e13));
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
        return (ByteBuffer) this.f15424c;
    }

    public int J(int i10) {
        e6.n nVar = (e6.n) this.f15424c;
        if (i10 < 0) {
            return -1;
        }
        int childCount = ((RecyclerView) ((k2.g0) this.f15423b).f14466b).getChildCount();
        int i11 = i10;
        while (i11 < childCount) {
            int v = i10 - (i11 - nVar.v(i11));
            if (v == 0) {
                while (nVar.y(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += v;
        }
        return -1;
    }

    public View K(int i10) {
        return ((RecyclerView) ((k2.g0) this.f15423b).f14466b).getChildAt(i10);
    }

    public int L() {
        return ((RecyclerView) ((k2.g0) this.f15423b).f14466b).getChildCount();
    }

    public boolean M() {
        String trim;
        ArrayDeque arrayDeque = (ArrayDeque) this.f15424c;
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
            String readLine = ((BufferedReader) this.f15423b).readLine();
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
        k2.g0 g0Var = (k2.g0) this.f15423b;
        s4.d1 U = RecyclerView.U(view);
        if (U != null) {
            View view2 = U.f47889a;
            RecyclerView recyclerView = (RecyclerView) g0Var.f14466b;
            int i10 = U.f47905s;
            if (i10 != -1) {
                U.f47904r = i10;
            } else {
                WeakHashMap weakHashMap = r0.i0.f46981a;
                U.f47904r = view2.getImportantForAccessibility();
            }
            if (recyclerView.b0()) {
                U.f47905s = 4;
                recyclerView.K0.add(U);
                return;
            }
            WeakHashMap weakHashMap2 = r0.i0.f46981a;
            view2.setImportantForAccessibility(4);
        }
    }

    public void O(g2.h r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, u2.t0 r15) {
        throw new UnsupportedOperationException("Method not decompiled: m.f3.O(g2.h, android.net.Uri, java.util.Map, long, long, u2.t0):void");
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
        ((TypedArray) this.f15424c).recycle();
    }

    public void S() {
        int i10;
        RecyclerView recyclerView = (RecyclerView) ((k2.g0) this.f15423b).f14466b;
        ((e6.n) this.f15424c).B();
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            s4.d1 U = RecyclerView.U((View) arrayList.get(size));
            if (U != null) {
                int i11 = U.f47904r;
                if (recyclerView.b0()) {
                    U.f47905s = i11;
                    recyclerView.K0.add(U);
                } else {
                    View view = U.f47889a;
                    WeakHashMap weakHashMap = r0.i0.f46981a;
                    view.setImportantForAccessibility(i11);
                }
                U.f47904r = 0;
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

    public void T(pf.g gVar) {
        if (((pf.d) this.f15423b) != null) {
            for (int i10 = 0; i10 < gVar.f45467a.size(); i10++) {
                pf.d dVar = (pf.d) this.f15423b;
                dVar.h.remove(gVar.a(i10).d);
                dVar.h();
            }
        }
    }

    public void V(l5.i iVar, int i10, boolean z10) {
        Long l4;
        char c10;
        r5.a aVar = (r5.a) this.d;
        Context context = (Context) this.f15423b;
        ComponentName componentName = new ComponentName(context, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = iVar.f15159a;
        String str2 = iVar.f15159a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        i5.d dVar = iVar.f15161c;
        adler32.update(allocate.putInt(v5.a.a(dVar)).array());
        byte[] bArr = iVar.f15160b;
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
                        h6.a(iVar, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                        return;
                    }
                }
            }
        }
        Cursor rawQuery = ((s5.g) ((s5.d) this.f15424c)).a().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str2, String.valueOf(v5.a.a(dVar))});
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
            Set set = ((r5.b) aVar.f47193b.get(dVar)).f47196c;
            if (set.contains(r5.c.f47197a)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(r5.c.f47199c)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(r5.c.f47198b)) {
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
            String c11 = h6.c("JobInfoScheduler");
            if (Log.isLoggable(c11, 3)) {
                Log.d(c11, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th2) {
            rawQuery.close();
            throw th2;
        }
    }

    public void W(pf.a aVar) {
        pf.g gVar;
        pf.g gVar2 = (pf.g) this.f15424c;
        if (gVar2 != null && ((pf.a) this.d) == null && aVar != null) {
            n(gVar2);
        }
        if (((pf.a) this.d) != null && (gVar = (pf.g) this.f15424c) != null && aVar == null) {
            T(gVar);
        }
        pf.a aVar2 = (pf.a) this.d;
        if (aVar2 != null) {
            e6.h hVar = aVar2.f45436a;
            n6.m.e("Must be called from the main thread.");
            hVar.f8674i.remove(aVar2);
        }
        if (aVar != null) {
            aVar.f45436a.p(aVar);
            pf.g gVar3 = (pf.g) this.f15424c;
            if (gVar3 != null) {
                aVar.d = gVar3;
                aVar.f45441g = 0;
                aVar.h = 0;
                aVar.p();
            }
        }
        this.d = aVar;
    }

    public FileOutputStream X() {
        File file = (File) this.f15424c;
        File file2 = (File) this.d;
        if (file2.exists()) {
            U(file2, (File) this.f15423b);
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

    public void Y(View view) {
        if (((ArrayList) this.d).remove(view)) {
            k2.g0 g0Var = (k2.g0) this.f15423b;
            s4.d1 U = RecyclerView.U(view);
            if (U != null) {
                RecyclerView recyclerView = (RecyclerView) g0Var.f14466b;
                int i10 = U.f47904r;
                if (recyclerView.b0()) {
                    U.f47905s = i10;
                    recyclerView.K0.add(U);
                } else {
                    View view2 = U.f47889a;
                    WeakHashMap weakHashMap = r0.i0.f46981a;
                    view2.setImportantForAccessibility(i10);
                }
                U.f47904r = 0;
            }
        }
    }

    public void Z(Object obj, String str) {
        f3 f3Var = new f3(7, false);
        ((f3) this.d).d = f3Var;
        this.d = f3Var;
        f3Var.f15424c = obj;
        f3Var.f15423b = str;
    }

    @Override
    public Uri c() {
        return (Uri) this.f15423b;
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
        ((uk) this.d).Q.x();
    }

    @Override
    public Object mo27get() {
        return new f3((Context) ((gd.a) this.f15423b).mo27get(), (s5.d) ((gd.a) this.f15424c).mo27get(), (r5.a) ((rb.a) this.d).mo27get(), 26);
    }

    @Override
    public ClipDescription getDescription() {
        return (ClipDescription) this.f15424c;
    }

    @Override
    public void h(android.view.View r13, zg.n0 r14, boolean r15, boolean r16) {
        throw new UnsupportedOperationException("Method not decompiled: m.f3.h(android.view.View, zg.n0, boolean, boolean):void");
    }

    @Override
    public void i(int i10, boolean z10, boolean z11) {
        String str;
        if (!z10) {
            uk ukVar = (uk) this.d;
            HashMap hashMap = (HashMap) this.f15423b;
            ArrayList arrayList = (ArrayList) this.f15424c;
            aj ajVar = ukVar.f30574b;
            if (!hashMap.isEmpty() && ukVar.Q != null && !ukVar.K) {
                ukVar.K = true;
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
                g5.Z(ajVar.M1, ajVar.l1() + arrayList2.size(), ajVar.p1(), new e4(i10, 2, ukVar, arrayList2, z11));
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

    public void n(pf.g gVar) {
        if (((pf.d) this.f15423b) == null) {
            this.f15423b = new pf.d();
        }
        for (int i10 = 0; i10 < gVar.f45467a.size(); i10++) {
            pf.d dVar = (pf.d) this.f15423b;
            pf.f a2 = gVar.a(i10);
            dVar.h.put(a2.d, a2);
            dVar.h();
        }
    }

    @Override
    public boolean q() {
        return false;
    }

    public void r(View view, int i10, boolean z10) {
        int J;
        RecyclerView recyclerView = (RecyclerView) ((k2.g0) this.f15423b).f14466b;
        if (i10 < 0) {
            J = recyclerView.getChildCount();
        } else {
            J = J(i10);
        }
        ((e6.n) this.f15424c).z(J, z10);
        if (z10) {
            N(view);
        }
        recyclerView.addView(view, J);
        s4.d1 U = RecyclerView.U(view);
        recyclerView.f0(view);
        s4.i0 i0Var = recyclerView.f3165w;
        if (i0Var != null && U != null) {
            i0Var.y(U);
        }
        ArrayList arrayList = recyclerView.P;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((s4.z) recyclerView.P.get(size)).getClass();
            }
        }
    }

    public void t(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        int J;
        RecyclerView recyclerView = (RecyclerView) ((k2.g0) this.f15423b).f14466b;
        if (i10 < 0) {
            J = recyclerView.getChildCount();
        } else {
            J = J(i10);
        }
        ((e6.n) this.f15424c).z(J, z10);
        if (z10) {
            N(view);
        }
        s4.d1 U = RecyclerView.U(view);
        if (U != null) {
            if (!U.l() && !U.r()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + U + recyclerView.C());
            }
            U.f47898l &= -257;
        }
        RecyclerView.c(recyclerView, view, J, layoutParams);
    }

    public String toString() {
        switch (this.f15422a) {
            case 4:
                StringBuilder sb2 = new StringBuilder("id3v2tag[pos=");
                nf.a aVar = (nf.a) this.f15423b;
                sb2.append(aVar.f7923b);
                sb2.append(", ");
                sb2.append(aVar.e());
                sb2.append(" left]");
                return sb2.toString();
            case 8:
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append((String) this.f15423b);
                sb3.append('{');
                f3 f3Var = (f3) ((f3) this.f15424c).d;
                String str = "";
                while (f3Var != null) {
                    Object obj = f3Var.f15424c;
                    sb3.append(str);
                    String str2 = (String) f3Var.f15423b;
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
                    f3Var = (f3) f3Var.d;
                    str = ", ";
                }
                sb3.append('}');
                return sb3.toString();
            case 27:
                return ((e6.n) this.f15424c).toString() + ", hidden list:" + ((ArrayList) this.d).size();
            default:
                return super.toString();
        }
    }

    public String u(int i10, String str, long j3, long j10) {
        ArrayList arrayList = (ArrayList) this.f15423b;
        ArrayList arrayList2 = (ArrayList) this.d;
        ArrayList arrayList3 = (ArrayList) this.f15424c;
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
        android.support.v4.media.session.a0 a0Var = (android.support.v4.media.session.a0) this.f15423b;
        if (a0Var != null) {
            int i10 = ((p4.e) this.d).f45225n.d;
            android.support.v4.media.session.v vVar = a0Var.f2069a;
            vVar.getClass();
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(i10);
            vVar.f2093a.setPlaybackToLocal(builder.build());
            this.f15424c = null;
        }
    }

    public void y(int i10) {
        s4.d1 U;
        int J = J(i10);
        ((e6.n) this.f15424c).A(J);
        RecyclerView recyclerView = (RecyclerView) ((k2.g0) this.f15423b).f14466b;
        View childAt = recyclerView.getChildAt(J);
        if (childAt != null && (U = RecyclerView.U(childAt)) != null) {
            if (U.l() && !U.r()) {
                throw new IllegalArgumentException("called detach on an already detached child " + U + recyclerView.C());
            }
            U.a(256);
        }
        RecyclerView.d(recyclerView, J);
    }

    public mf.e z(mf.f fVar) {
        InflaterInputStream inflaterInputStream;
        int i10 = fVar.f16134c;
        InputStream inputStream = (nf.a) this.f15423b;
        if (fVar.d) {
            l2.g gVar = (l2.g) this.d;
            gVar.getClass();
            byte[] bArr = new byte[i10];
            int i11 = 0;
            while (i11 < i10) {
                int read = ((com.google.firebase.messaging.d) gVar.f15080b).read(bArr, i11, i10 - i11);
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
        if (!fVar.f16136f) {
            if (fVar.f16135e) {
                i10 = fVar.f16137g;
                inflaterInputStream = new InflaterInputStream(inputStream);
            } else {
                inflaterInputStream = inputStream;
            }
            return new mf.e(inflaterInputStream, fVar.f16133b, i10, (mf.h) this.f15424c, fVar);
        }
        throw new Exception("Frame encryption is not supported");
    }

    public f3(Object obj, Object obj2, Object obj3, int i10) {
        this.f15422a = i10;
        this.f15423b = obj;
        this.f15424c = obj2;
        this.d = obj3;
    }

    public f3(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f15422a = i10;
        this.d = obj;
        this.f15423b = obj2;
        this.f15424c = obj3;
    }

    public f3(String str) {
        this.f15422a = 8;
        f3 f3Var = new f3(7, false);
        this.f15424c = f3Var;
        this.d = f3Var;
        this.f15423b = str;
    }

    public f3(InputStream inputStream, long j3, int i10, mf.h hVar) {
        this.f15422a = 4;
        nf.a aVar = new nf.a(inputStream, j3, i10);
        this.f15423b = aVar;
        this.d = new l2.g(aVar, 3);
        this.f15424c = hVar;
    }

    public f3(View view) {
        this.f15422a = 15;
        this.d = view;
        b81 b81Var = new b81(this, view);
        this.f15423b = b81Var;
        view.addOnLayoutChangeListener(b81Var);
    }

    public f3(int i10) {
        this.f15422a = i10;
        switch (i10) {
            case 23:
                this.f15423b = new Object();
                this.f15424c = null;
                this.d = null;
                return;
            default:
                this.f15423b = new Object();
                return;
        }
    }

    public f3(k2.g0 g0Var, char c10) {
        this.f15422a = 27;
        this.f15423b = g0Var;
        this.f15424c = new e6.n(6);
        this.d = new ArrayList();
    }

    @Override
    public void a() {
    }

    @Override
    public void d() {
    }

    @Override
    public void m() {
    }

    @Override
    public void p() {
    }

    public f3(File file) {
        this.f15422a = 21;
        this.f15423b = file;
        this.f15424c = new File(file.getPath() + ".new");
        this.d = new File(file.getPath() + ".bak");
    }

    @Override
    public void b(Editable editable) {
    }

    public f3(c3.r rVar) {
        this.f15422a = 29;
        this.f15423b = rVar;
    }

    public f3(Runnable runnable) {
        this.f15422a = 25;
        this.f15424c = new CopyOnWriteArrayList();
        this.d = new HashMap();
        this.f15423b = runnable;
    }

    public f3(Context context, TypedArray typedArray) {
        this.f15422a = 0;
        this.f15423b = context;
        this.f15424c = typedArray;
    }

    public f3(byte[] bArr, i9.w wVar) {
        this.f15422a = 2;
        this.f15423b = bArr;
        this.f15424c = null;
        this.d = wVar;
    }

    public f3(Uri uri, i9.w wVar) {
        this.f15422a = 2;
        this.f15423b = null;
        this.f15424c = uri;
        this.d = wVar;
    }

    public f3(k2.g0 g0Var) {
        this.f15422a = 9;
        this.f15422a = 9;
        this.f15423b = g0Var;
        this.f15424c = Choreographer.getInstance();
        this.d = new o1.a(this, 0);
    }

    public f3(String str, String str2) {
        this.f15422a = 10;
        this.f15423b = str;
        this.f15424c = str2;
        this.d = str2.isEmpty() ? str : a1.g.D(str, "/", str2);
    }

    public f3(p4.e eVar, android.support.v4.media.session.a0 a0Var) {
        this.f15422a = 19;
        this.d = eVar;
        this.f15423b = a0Var;
    }

    public f3(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.f15422a = 18;
        this.f15424c = arrayDeque;
        this.f15423b = bufferedReader;
    }

    public f3(Object[] objArr, Object[] objArr2) {
        this.f15422a = 14;
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
        this.f15423b = iArr;
        this.f15424c = w(objArr, iArr);
        this.d = w(objArr2, iArr);
    }

    @Override
    public void o(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
