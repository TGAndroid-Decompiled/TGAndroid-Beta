package li;

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
import bi.t3;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import e9.m2;
import e9.y0;
import fi.q3;
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
import ji.d4;
import ji.h5;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.h01;
import org.telegram.ui.Components.pk;
import org.telegram.ui.Components.t71;
import org.telegram.ui.Components.tz0;
import org.telegram.ui.Components.vi;
import org.telegram.ui.gr0;
import org.xmlpull.v1.XmlPullParserException;
import s4.b1;
import v7.b8;
import v7.q7;
import v7.u6;
import w7.l6;
public class k implements fl0, gr0, n5.b, t0.i {
    public final int f14819a;
    public Object f14820b;
    public Object f14821c;
    public Object d;

    public k(int i10, boolean z10) {
        this.f14819a = i10;
    }

    public static k P(Context context, AttributeSet attributeSet, int[] iArr, int i10) {
        return new k(context, context.obtainStyledAttributes(attributeSet, iArr, i10, 0));
    }

    public static void T(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e("AtomicFile", "Failed to delete file which is a directory " + file2);
        }
        if (!file.renameTo(file2)) {
            Log.e("AtomicFile", "Failed to rename " + file + " to " + file2);
        }
    }

    public static k o(View view) {
        return new k(view);
    }

    public static Object[] t(Object[] objArr, int[] iArr) {
        int length = objArr.length;
        Class<?> componentType = objArr.getClass().getComponentType();
        tz0 tz0Var = h01.R;
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

    public static n2.e u(b2.h0 h0Var) {
        String uri;
        boolean z10;
        boolean z11;
        g2.o oVar = new g2.o();
        byte[] bArr = null;
        oVar.f9897c = null;
        Uri uri2 = h0Var.f2155b;
        if (uri2 == null) {
            uri = null;
        } else {
            uri = uri2.toString();
        }
        boolean z12 = h0Var.f2157f;
        ?? obj = new Object();
        if (z12 && TextUtils.isEmpty(uri)) {
            z10 = false;
        } else {
            z10 = true;
        }
        u6.g(z10);
        obj.f4119b = oVar;
        obj.f4120c = uri;
        obj.f4118a = z12;
        obj.d = new HashMap();
        e9.q0 q0Var = h0Var.f2156c;
        y0 y0Var = q0Var.f8604a;
        if (y0Var == null) {
            y0Var = q0Var.b();
            q0Var.f8604a = y0Var;
        }
        m2 it = y0Var.iterator();
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
        int i10 = b2.n.f2216a;
        oa.d dVar = new oa.d(27);
        UUID uuid = h0Var.f2154a;
        uuid.getClass();
        boolean z13 = h0Var.d;
        boolean z14 = h0Var.e;
        int[] f7 = b8.f(h0Var.f2158g);
        for (int i11 : f7) {
            if (i11 != 2 && i11 != 1) {
                z11 = false;
            } else {
                z11 = true;
            }
            u6.g(z11);
        }
        n2.e eVar = new n2.e(uuid, obj, hashMap, z13, (int[]) f7.clone(), z14, dVar);
        byte[] bArr2 = h0Var.h;
        if (bArr2 != null) {
            bArr = Arrays.copyOf(bArr2, bArr2.length);
        }
        u6.p(eVar.f15951w.isEmpty());
        eVar.K = bArr;
        return eVar;
    }

    public n2.n A(b2.p0 p0Var) {
        n2.e eVar;
        p0Var.f2278b.getClass();
        b2.h0 h0Var = p0Var.f2278b.f2190c;
        if (h0Var == null) {
            return n2.n.f15967z;
        }
        synchronized (this.f14820b) {
            try {
                if (!h0Var.equals((b2.h0) this.f14821c)) {
                    this.f14821c = h0Var;
                    this.d = u(h0Var);
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
        return ((RecyclerView) ((h5) this.f14820b).f13312b).getChildAt(J(i10));
    }

    public int C() {
        return ((RecyclerView) ((h5) this.f14820b).f13312b).getChildCount() - ((ArrayList) this.d).size();
    }

    @Override
    public boolean D() {
        return false;
    }

    public ColorStateList E(int i10) {
        int resourceId;
        ColorStateList a2;
        TypedArray typedArray = (TypedArray) this.f14821c;
        if (typedArray.hasValue(i10) && (resourceId = typedArray.getResourceId(i10, 0)) != 0 && (a2 = q7.a((Context) this.f14820b, resourceId)) != null) {
            return a2;
        }
        return typedArray.getColorStateList(i10);
    }

    public Drawable F(int i10) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f14821c;
        if (typedArray.hasValue(i10) && (resourceId = typedArray.getResourceId(i10, 0)) != 0) {
            return q7.b((Context) this.f14820b, resourceId);
        }
        return typedArray.getDrawable(i10);
    }

    public Drawable G(int i10) {
        int resourceId;
        Drawable f7;
        if (((TypedArray) this.f14821c).hasValue(i10) && (resourceId = ((TypedArray) this.f14821c).getResourceId(i10, 0)) != 0) {
            m.q a2 = m.q.a();
            Context context = (Context) this.f14820b;
            synchronized (a2) {
                f7 = a2.f15215a.f(resourceId, context, true);
            }
            return f7;
        }
        return null;
    }

    public Typeface H(int i10, int i11, e2.j0 j0Var) {
        e2.j0 j0Var2;
        XmlPullParserException xmlPullParserException;
        IOException iOException;
        int resourceId = ((TypedArray) this.f14821c).getResourceId(i10, 0);
        if (resourceId != 0) {
            if (((TypedValue) this.d) == null) {
                this.d = new TypedValue();
            }
            Context context = (Context) this.f14820b;
            TypedValue typedValue = (TypedValue) this.d;
            ThreadLocal threadLocal = h0.j.f10297a;
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
                    a0.j jVar = i0.e.f10895b;
                    Typeface typeface = (Typeface) jVar.a(i0.e.b(resources, resourceId, charSequence2, i12, i11));
                    if (typeface != null) {
                        new Handler(Looper.getMainLooper()).post(new q3(5, j0Var, typeface));
                        return typeface;
                    }
                    try {
                        if (charSequence2.toLowerCase().endsWith(".xml")) {
                            h0.d g10 = h0.b.g(resources.getXml(resourceId), resources);
                            if (g10 == null) {
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
                                } catch (XmlPullParserException e7) {
                                    xmlPullParserException = e7;
                                    j0Var2 = j0Var;
                                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                                    j0Var2.b();
                                    return null;
                                }
                            }
                            try {
                                return i0.e.a(context, g10, resources, resourceId, charSequence2, typedValue.assetCookie, i11, j0Var);
                            } catch (IOException e10) {
                                e = e10;
                                j0Var2 = j0Var;
                                iOException = e;
                                Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                                j0Var2.b();
                                return null;
                            } catch (XmlPullParserException e11) {
                                e = e11;
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
                            Typeface e12 = i0.e.f10894a.e(context, resources, resourceId, charSequence2, i11);
                            if (e12 != null) {
                                jVar.b(i0.e.b(resources, resourceId, charSequence2, i13, i11), e12);
                            }
                            if (e12 != null) {
                                new Handler(Looper.getMainLooper()).post(new q3(5, j0Var2, e12));
                            } else {
                                j0Var2.b();
                            }
                            return e12;
                        } catch (IOException e13) {
                            e = e13;
                            iOException = e;
                            Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                            j0Var2.b();
                            return null;
                        } catch (XmlPullParserException e14) {
                            e = e14;
                            xmlPullParserException = e;
                            Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                            j0Var2.b();
                            return null;
                        }
                    } catch (IOException e15) {
                        e = e15;
                        j0Var2 = j0Var;
                    } catch (XmlPullParserException e16) {
                        e = e16;
                        j0Var2 = j0Var;
                    }
                } else {
                    throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(resourceId) + "\" (" + Integer.toHexString(resourceId) + ") is not a Font: " + typedValue);
                }
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
        return (ByteBuffer) this.f14821c;
    }

    public int J(int i10) {
        ad.d dVar = (ad.d) this.f14821c;
        if (i10 < 0) {
            return -1;
        }
        int childCount = ((RecyclerView) ((h5) this.f14820b).f13312b).getChildCount();
        int i11 = i10;
        while (i11 < childCount) {
            int A = i10 - (i11 - dVar.A(i11));
            if (A == 0) {
                while (dVar.E(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += A;
        }
        return -1;
    }

    public View K(int i10) {
        return ((RecyclerView) ((h5) this.f14820b).f13312b).getChildAt(i10);
    }

    public int L() {
        return ((RecyclerView) ((h5) this.f14820b).f13312b).getChildCount();
    }

    public boolean M() {
        String trim;
        ArrayDeque arrayDeque = (ArrayDeque) this.f14821c;
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
            String readLine = ((BufferedReader) this.f14820b).readLine();
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
        h5 h5Var = (h5) this.f14820b;
        b1 U = RecyclerView.U(view);
        if (U != null) {
            View view2 = U.f44838a;
            RecyclerView recyclerView = (RecyclerView) h5Var.f13312b;
            int i10 = U.f44853s;
            if (i10 != -1) {
                U.f44852r = i10;
            } else {
                WeakHashMap weakHashMap = r0.j0.f43732a;
                U.f44852r = view2.getImportantForAccessibility();
            }
            if (recyclerView.b0()) {
                U.f44853s = 4;
                recyclerView.K0.add(U);
                return;
            }
            WeakHashMap weakHashMap2 = r0.j0.f43732a;
            view2.setImportantForAccessibility(4);
        }
    }

    public String O() {
        if (M()) {
            String str = (String) this.d;
            this.d = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    public void Q() {
        ((TypedArray) this.f14821c).recycle();
    }

    public void R() {
        int i10;
        RecyclerView recyclerView = (RecyclerView) ((h5) this.f14820b).f13312b;
        ((ad.d) this.f14821c).H();
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            b1 U = RecyclerView.U((View) arrayList.get(size));
            if (U != null) {
                int i11 = U.f44852r;
                if (recyclerView.b0()) {
                    U.f44853s = i11;
                    recyclerView.K0.add(U);
                } else {
                    View view = U.f44838a;
                    WeakHashMap weakHashMap = r0.j0.f43732a;
                    view.setImportantForAccessibility(i11);
                }
                U.f44852r = 0;
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

    public void S(qf.g gVar) {
        if (((qf.d) this.f14820b) != null) {
            for (int i10 = 0; i10 < gVar.f43376a.size(); i10++) {
                qf.d dVar = (qf.d) this.f14820b;
                dVar.h.remove(gVar.a(i10).d);
                dVar.h();
            }
        }
    }

    public void U(l5.i iVar, int i10, boolean z10) {
        Long l4;
        char c10;
        r5.a aVar = (r5.a) this.d;
        Context context = (Context) this.f14820b;
        ComponentName componentName = new ComponentName(context, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = iVar.f14580a;
        String str2 = iVar.f14580a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        i5.d dVar = iVar.f14582c;
        adler32.update(allocate.putInt(v5.a.a(dVar)).array());
        byte[] bArr = iVar.f14581b;
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
                        l6.a(iVar, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                        return;
                    }
                }
            }
        }
        Cursor rawQuery = ((s5.g) ((s5.d) this.f14821c)).a().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str2, String.valueOf(v5.a.a(dVar))});
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
            Set set = ((r5.b) aVar.f43923b.get(dVar)).f43926c;
            if (set.contains(r5.c.f43927a)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(r5.c.f43929c)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(r5.c.f43928b)) {
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
            String c11 = l6.c("JobInfoScheduler");
            if (Log.isLoggable(c11, 3)) {
                Log.d(c11, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th2) {
            rawQuery.close();
            throw th2;
        }
    }

    public void V(qf.a aVar) {
        qf.g gVar;
        qf.g gVar2 = (qf.g) this.f14821c;
        if (gVar2 != null && ((qf.a) this.d) == null && aVar != null) {
            l(gVar2);
        }
        if (((qf.a) this.d) != null && (gVar = (qf.g) this.f14821c) != null && aVar == null) {
            S(gVar);
        }
        qf.a aVar2 = (qf.a) this.d;
        if (aVar2 != null) {
            e6.h hVar = aVar2.f43349a;
            n6.l.e("Must be called from the main thread.");
            hVar.f8494i.remove(aVar2);
        }
        if (aVar != null) {
            aVar.f43349a.p(aVar);
            qf.g gVar3 = (qf.g) this.f14821c;
            if (gVar3 != null) {
                aVar.d = gVar3;
                aVar.f43353g = 0;
                aVar.h = 0;
                aVar.p();
            }
        }
        this.d = aVar;
    }

    public FileOutputStream W() {
        File file = (File) this.f14821c;
        File file2 = (File) this.d;
        if (file2.exists()) {
            T(file2, (File) this.f14820b);
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

    public void X(View view) {
        if (((ArrayList) this.d).remove(view)) {
            h5 h5Var = (h5) this.f14820b;
            b1 U = RecyclerView.U(view);
            if (U != null) {
                RecyclerView recyclerView = (RecyclerView) h5Var.f13312b;
                int i10 = U.f44852r;
                if (recyclerView.b0()) {
                    U.f44853s = i10;
                    recyclerView.K0.add(U);
                } else {
                    View view2 = U.f44838a;
                    WeakHashMap weakHashMap = r0.j0.f43732a;
                    view2.setImportantForAccessibility(i10);
                }
                U.f44852r = 0;
            }
        }
    }

    public void Y(Object obj, String str) {
        k kVar = new k(8, false);
        ((k) this.d).d = kVar;
        this.d = kVar;
        kVar.f14821c = obj;
        kVar.f14820b = str;
    }

    @Override
    public Uri c() {
        return (Uri) this.f14820b;
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
        ((pk) this.d).Q.y();
    }

    @Override
    public Object mo27get() {
        return new k((Context) ((hd.a) this.f14820b).mo27get(), (s5.d) ((hd.a) this.f14821c).mo27get(), (r5.a) ((oa.d) this.d).mo27get(), 27);
    }

    @Override
    public ClipDescription getDescription() {
        return (ClipDescription) this.f14821c;
    }

    @Override
    public void h(int i10, boolean z10, boolean z11) {
        String str;
        if (!z10) {
            pk pkVar = (pk) this.d;
            HashMap hashMap = (HashMap) this.f14820b;
            ArrayList arrayList = (ArrayList) this.f14821c;
            vi viVar = pkVar.f27671b;
            if (!hashMap.isEmpty() && pkVar.Q != null && !pkVar.K) {
                pkVar.K = true;
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
                g5.Z(viVar.M1, viVar.l1() + arrayList2.size(), viVar.p1(), new t3(i10, 2, pkVar, arrayList2, z11));
            }
        }
    }

    @Override
    public boolean i() {
        return true;
    }

    @Override
    public Object j() {
        return null;
    }

    public void l(qf.g gVar) {
        if (((qf.d) this.f14820b) == null) {
            this.f14820b = new qf.d();
        }
        for (int i10 = 0; i10 < gVar.f43376a.size(); i10++) {
            qf.d dVar = (qf.d) this.f14820b;
            qf.f a2 = gVar.a(i10);
            dVar.h.put(a2.d, a2);
            dVar.h();
        }
    }

    public void m(View view, int i10, boolean z10) {
        int J;
        RecyclerView recyclerView = (RecyclerView) ((h5) this.f14820b).f13312b;
        if (i10 < 0) {
            J = recyclerView.getChildCount();
        } else {
            J = J(i10);
        }
        ((ad.d) this.f14821c).F(J, z10);
        if (z10) {
            N(view);
        }
        recyclerView.addView(view, J);
        b1 U = RecyclerView.U(view);
        recyclerView.f0(view);
        s4.g0 g0Var = recyclerView.f2015w;
        if (g0Var != null && U != null) {
            g0Var.y(U);
        }
        ArrayList arrayList = recyclerView.P;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((s4.y) recyclerView.P.get(size)).getClass();
            }
        }
    }

    @Override
    public boolean n() {
        return false;
    }

    public void p(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        int J;
        RecyclerView recyclerView = (RecyclerView) ((h5) this.f14820b).f13312b;
        if (i10 < 0) {
            J = recyclerView.getChildCount();
        } else {
            J = J(i10);
        }
        ((ad.d) this.f14821c).F(J, z10);
        if (z10) {
            N(view);
        }
        b1 U = RecyclerView.U(view);
        if (U != null) {
            if (!U.l() && !U.r()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + U + recyclerView.C());
            }
            U.f44846l &= -257;
        }
        RecyclerView.b(recyclerView, view, J, layoutParams);
    }

    public String q(int i10, String str, long j10, long j11) {
        ArrayList arrayList = (ArrayList) this.f14820b;
        ArrayList arrayList2 = (ArrayList) this.d;
        ArrayList arrayList3 = (ArrayList) this.f14821c;
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

    @Override
    public void r(android.view.View r13, ah.i1 r14, boolean r15, boolean r16) {
        throw new UnsupportedOperationException("Method not decompiled: li.k.r(android.view.View, ah.i1, boolean, boolean):void");
    }

    public void s() {
        android.support.v4.media.session.b0 b0Var = (android.support.v4.media.session.b0) this.f14820b;
        if (b0Var != null) {
            int i10 = ((p4.e) this.d).f43018n.d;
            android.support.v4.media.session.v vVar = b0Var.f977a;
            vVar.getClass();
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(i10);
            vVar.f999a.setPlaybackToLocal(builder.build());
            this.f14821c = null;
        }
    }

    public String toString() {
        switch (this.f14819a) {
            case 9:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.f14820b);
                sb2.append('{');
                k kVar = (k) ((k) this.f14821c).d;
                String str = "";
                while (kVar != null) {
                    Object obj = kVar.f14821c;
                    sb2.append(str);
                    String str2 = (String) kVar.f14820b;
                    if (str2 != null) {
                        sb2.append(str2);
                        sb2.append('=');
                    }
                    if (obj != null && obj.getClass().isArray()) {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb2.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    } else {
                        sb2.append(obj);
                    }
                    kVar = (k) kVar.d;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            case 10:
                StringBuilder sb3 = new StringBuilder("id3v2tag[pos=");
                of.a aVar = (of.a) this.f14820b;
                sb3.append(aVar.f6169b);
                sb3.append(", ");
                sb3.append(aVar.e());
                sb3.append(" left]");
                return sb3.toString();
            case 28:
                return ((ad.d) this.f14821c).toString() + ", hidden list:" + ((ArrayList) this.d).size();
            default:
                return super.toString();
        }
    }

    public void v(int i10) {
        b1 U;
        int J = J(i10);
        ((ad.d) this.f14821c).G(J);
        RecyclerView recyclerView = (RecyclerView) ((h5) this.f14820b).f13312b;
        View childAt = recyclerView.getChildAt(J);
        if (childAt != null && (U = RecyclerView.U(childAt)) != null) {
            if (U.l() && !U.r()) {
                throw new IllegalArgumentException("called detach on an already detached child " + U + recyclerView.C());
            }
            U.a(256);
        }
        RecyclerView.c(recyclerView, J);
    }

    public void x(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = (HashMap) this.f14820b;
        ma.f fVar = new ma.f(byteArrayOutputStream, hashMap, (HashMap) this.f14821c, (ja.d) this.d);
        if (obj == null) {
            return;
        }
        ja.d dVar = (ja.d) hashMap.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, fVar);
            return;
        }
        throw new RuntimeException("No encoder for " + obj.getClass());
    }

    public nf.e z(nf.f fVar) {
        InflaterInputStream inflaterInputStream;
        int i10 = fVar.f16332c;
        InputStream inputStream = (of.a) this.f14820b;
        if (fVar.d) {
            d4 d4Var = (d4) this.d;
            d4Var.getClass();
            byte[] bArr = new byte[i10];
            int i11 = 0;
            while (i11 < i10) {
                int read = ((com.google.firebase.messaging.d) d4Var.f13233b).read(bArr, i11, i10 - i11);
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
        if (!fVar.f16333f) {
            if (fVar.e) {
                i10 = fVar.f16334g;
                inflaterInputStream = new InflaterInputStream(inputStream);
            } else {
                inflaterInputStream = inputStream;
            }
            return new nf.e(inflaterInputStream, fVar.f16331b, i10, (nf.h) this.f14821c, fVar);
        }
        throw new Exception("Frame encryption is not supported");
    }

    public k(Object obj, Object obj2, Object obj3, int i10) {
        this.f14819a = i10;
        this.f14820b = obj;
        this.f14821c = obj2;
        this.d = obj3;
    }

    public k(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f14819a = i10;
        this.d = obj;
        this.f14820b = obj2;
        this.f14821c = obj3;
    }

    public k(String str) {
        this.f14819a = 9;
        k kVar = new k(8, false);
        this.f14821c = kVar;
        this.d = kVar;
        this.f14820b = str;
    }

    public k(InputStream inputStream, long j10, int i10, nf.h hVar) {
        this.f14819a = 10;
        of.a aVar = new of.a(inputStream, j10, i10);
        this.f14820b = aVar;
        this.d = new d4(aVar, 7);
        this.f14821c = hVar;
    }

    public k(View view) {
        this.f14819a = 16;
        this.d = view;
        t71 t71Var = new t71(this, view);
        this.f14820b = t71Var;
        view.addOnLayoutChangeListener(t71Var);
    }

    public k(int i10) {
        this.f14819a = i10;
        switch (i10) {
            case 23:
                this.f14820b = new Object();
                this.f14821c = null;
                this.d = null;
                return;
            default:
                this.f14820b = new Object();
                return;
        }
    }

    public k(h5 h5Var) {
        this.f14819a = 28;
        this.f14820b = h5Var;
        this.f14821c = new ad.d(7);
        this.d = new ArrayList();
    }

    public k(File file) {
        this.f14819a = 21;
        this.f14820b = file;
        this.f14821c = new File(file.getPath() + ".new");
        this.d = new File(file.getPath() + ".bak");
    }

    public k(Runnable runnable) {
        this.f14819a = 26;
        this.f14821c = new CopyOnWriteArrayList();
        this.d = new HashMap();
        this.f14820b = runnable;
    }

    public k(Context context, TypedArray typedArray) {
        this.f14819a = 1;
        this.f14820b = context;
        this.f14821c = typedArray;
    }

    public k(byte[] bArr, j9.y yVar) {
        this.f14819a = 3;
        this.f14820b = bArr;
        this.f14821c = null;
        this.d = yVar;
    }

    public k(b2.s0 s0Var, j9.y yVar) {
        this.f14819a = 3;
        this.f14820b = s0Var.f2350k;
        this.f14821c = s0Var.f2353n;
        this.d = yVar;
    }

    public k(d4 d4Var) {
        this.f14819a = 11;
        this.f14819a = 11;
        this.f14820b = d4Var;
        this.f14821c = Choreographer.getInstance();
        this.d = new o1.a(this, 0);
    }

    public k(String str, String str2) {
        this.f14819a = 25;
        this.f14820b = str;
        this.f14821c = str2;
        this.d = str2.isEmpty() ? str : a1.g.D(str, "/", str2);
    }

    public k(p4.e eVar, android.support.v4.media.session.b0 b0Var) {
        this.f14819a = 20;
        this.d = eVar;
        this.f14820b = b0Var;
    }

    public k(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.f14819a = 19;
        this.f14821c = arrayDeque;
        this.f14820b = bufferedReader;
    }

    public k(Object[] objArr, Object[] objArr2) {
        this.f14819a = 15;
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
        this.f14820b = iArr;
        this.f14821c = t(objArr, iArr);
        this.d = t(objArr2, iArr);
    }

    @Override
    public void a() {
    }

    @Override
    public void d() {
    }

    @Override
    public void k() {
    }

    @Override
    public void y() {
    }

    @Override
    public void b(Editable editable) {
    }

    @Override
    public void w(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
