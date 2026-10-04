package la;

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
import c3.l;
import c3.r;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import e2.a0;
import e9.k0;
import e9.m0;
import e9.o1;
import g2.o;
import gg.x1;
import h0.k;
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
import m.q;
import n2.n;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.rk;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.rz0;
import org.telegram.ui.Components.xi;
import org.telegram.ui.vq0;
import org.xmlpull.v1.XmlPullParserException;
import r0.i0;
import s4.c1;
import s4.h0;
import s4.y;
import v7.v7;
import v7.y7;
import w7.h6;
public class h implements rk0, vq0, n5.b, t0.h {
    public final int f15398a;
    public Object f15399b;
    public Object f15400c;
    public Object d;

    public h(int i10, boolean z10) {
        this.f15398a = i10;
    }

    public static h Q(Context context, AttributeSet attributeSet, int[] iArr, int i10) {
        return new h(context, context.obtainStyledAttributes(attributeSet, iArr, i10, 0));
    }

    public static void U(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e("AtomicFile", "Failed to delete file which is a directory " + file2);
        }
        if (!file.renameTo(file2)) {
            Log.e("AtomicFile", "Failed to rename " + file + " to " + file2);
        }
    }

    public static Object[] v(Object[] objArr, int[] iArr) {
        int length = objArr.length;
        Class<?> componentType = objArr.getClass().getComponentType();
        rz0 rz0Var = f01.R;
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

    public static n2.f w(c0 c0Var) {
        String uri;
        boolean z10;
        boolean z11;
        o oVar = new o();
        byte[] bArr = null;
        oVar.f10210c = null;
        Uri uri2 = c0Var.f3179b;
        if (uri2 == null) {
            uri = null;
        } else {
            uri = uri2.toString();
        }
        boolean z12 = c0Var.f3182f;
        ?? obj = new Object();
        if (z12 && TextUtils.isEmpty(uri)) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.b(z10);
        obj.f7903b = oVar;
        obj.f7904c = uri;
        obj.f7902a = z12;
        obj.d = new HashMap();
        k0 k0Var = c0Var.f3180c;
        m0 m0Var = k0Var.f8767a;
        if (m0Var == null) {
            m0Var = k0Var.b();
            k0Var.f8767a = m0Var;
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
        UUID uuid = b2.i.f3254a;
        qb.b bVar = new qb.b(26);
        UUID uuid2 = c0Var.f3178a;
        uuid2.getClass();
        boolean z13 = c0Var.d;
        boolean z14 = c0Var.f3181e;
        int[] f7 = y7.f(c0Var.f3183g);
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
        e2.d.g(fVar.f16539w.isEmpty());
        fVar.K = bArr;
        return fVar;
    }

    public n A(b2.k0 k0Var) {
        n2.f fVar;
        k0Var.f3321b.getClass();
        c0 c0Var = k0Var.f3321b.f3228c;
        if (c0Var == null) {
            return n.f16552z;
        }
        synchronized (this.f15399b) {
            try {
                if (!c0Var.equals((c0) this.f15400c)) {
                    this.f15400c = c0Var;
                    this.d = w(c0Var);
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
        return ((hh.h) this.f15399b).f11463a.getChildAt(J(i10));
    }

    public int C() {
        return ((hh.h) this.f15399b).f11463a.getChildCount() - ((ArrayList) this.d).size();
    }

    public ColorStateList D(int i10) {
        int resourceId;
        ColorStateList a2;
        TypedArray typedArray = (TypedArray) this.f15400c;
        if (typedArray.hasValue(i10) && (resourceId = typedArray.getResourceId(i10, 0)) != 0 && (a2 = v7.a((Context) this.f15399b, resourceId)) != null) {
            return a2;
        }
        return typedArray.getColorStateList(i10);
    }

    public long E() {
        l lVar = (l) this.d;
        if (lVar != null) {
            return lVar.d;
        }
        return -1L;
    }

    public Drawable F(int i10) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f15400c;
        if (typedArray.hasValue(i10) && (resourceId = typedArray.getResourceId(i10, 0)) != 0) {
            return v7.b((Context) this.f15399b, resourceId);
        }
        return typedArray.getDrawable(i10);
    }

    public Drawable G(int i10) {
        int resourceId;
        Drawable f7;
        if (((TypedArray) this.f15400c).hasValue(i10) && (resourceId = ((TypedArray) this.f15400c).getResourceId(i10, 0)) != 0) {
            q a2 = q.a();
            Context context = (Context) this.f15399b;
            synchronized (a2) {
                f7 = a2.f15861a.f(resourceId, context, true);
            }
            return f7;
        }
        return null;
    }

    public Typeface H(int i10, int i11, a0 a0Var) {
        a0 a0Var2;
        XmlPullParserException xmlPullParserException;
        IOException iOException;
        int resourceId = ((TypedArray) this.f15400c).getResourceId(i10, 0);
        if (resourceId != 0) {
            if (((TypedValue) this.d) == null) {
                this.d = new TypedValue();
            }
            Context context = (Context) this.f15399b;
            TypedValue typedValue = (TypedValue) this.d;
            ThreadLocal threadLocal = k.f10948a;
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
                    a0.k kVar = i0.e.f11533b;
                    Typeface typeface = (Typeface) kVar.a(i0.e.b(resources, resourceId, charSequence2, i12, i11));
                    if (typeface != null) {
                        new Handler(Looper.getMainLooper()).post(new x1(1, a0Var, typeface));
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
                        Typeface e13 = i0.e.f11532a.e(context, resources, resourceId, charSequence2, i11);
                        if (e13 != null) {
                            kVar.b(i0.e.b(resources, resourceId, charSequence2, i13, i11), e13);
                        }
                        if (e13 != null) {
                            new Handler(Looper.getMainLooper()).post(new x1(1, a0Var, e13));
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
        return (ByteBuffer) this.f15400c;
    }

    public int J(int i10) {
        e6.n nVar = (e6.n) this.f15400c;
        if (i10 < 0) {
            return -1;
        }
        int childCount = ((hh.h) this.f15399b).f11463a.getChildCount();
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
        return ((hh.h) this.f15399b).f11463a.getChildAt(i10);
    }

    public int L() {
        return ((hh.h) this.f15399b).f11463a.getChildCount();
    }

    public boolean M() {
        String trim;
        ArrayDeque arrayDeque = (ArrayDeque) this.f15400c;
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
            String readLine = ((BufferedReader) this.f15399b).readLine();
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
        hh.h hVar = (hh.h) this.f15399b;
        c1 U = RecyclerView.U(view);
        if (U != null) {
            View view2 = U.f46531a;
            RecyclerView recyclerView = hVar.f11463a;
            int i10 = U.f46547s;
            if (i10 != -1) {
                U.f46546r = i10;
            } else {
                WeakHashMap weakHashMap = i0.f45603a;
                U.f46546r = view2.getImportantForAccessibility();
            }
            if (recyclerView.c0()) {
                U.f46547s = 4;
                recyclerView.J0.add(U);
                return;
            }
            WeakHashMap weakHashMap2 = i0.f45603a;
            view2.setImportantForAccessibility(4);
        }
    }

    public void O(g2.h r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, u2.v0 r15) {
        throw new UnsupportedOperationException("Method not decompiled: la.h.O(g2.h, android.net.Uri, java.util.Map, long, long, u2.v0):void");
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
        ((TypedArray) this.f15400c).recycle();
    }

    public void S() {
        int i10;
        RecyclerView recyclerView = ((hh.h) this.f15399b).f11463a;
        ((e6.n) this.f15400c).B();
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            c1 U = RecyclerView.U((View) arrayList.get(size));
            if (U != null) {
                int i11 = U.f46546r;
                if (recyclerView.c0()) {
                    U.f46547s = i11;
                    recyclerView.J0.add(U);
                } else {
                    View view = U.f46531a;
                    WeakHashMap weakHashMap = i0.f45603a;
                    view.setImportantForAccessibility(i11);
                }
                U.f46546r = 0;
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

    public void T(of.g gVar) {
        if (((of.d) this.f15399b) != null) {
            for (int i10 = 0; i10 < gVar.f17186a.size(); i10++) {
                of.d dVar = (of.d) this.f15399b;
                dVar.h.remove(gVar.a(i10).d);
                dVar.h();
            }
        }
    }

    public void V(l5.i iVar, int i10, boolean z10) {
        Long l4;
        char c10;
        r5.a aVar = (r5.a) this.d;
        Context context = (Context) this.f15399b;
        ComponentName componentName = new ComponentName(context, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = iVar.f15347a;
        String str2 = iVar.f15347a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        i5.d dVar = iVar.f15349c;
        adler32.update(allocate.putInt(v5.a.a(dVar)).array());
        byte[] bArr = iVar.f15348b;
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
        Cursor rawQuery = ((s5.g) ((s5.d) this.f15400c)).a().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str2, String.valueOf(v5.a.a(dVar))});
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
            Set set = ((r5.b) aVar.f45822b.get(dVar)).f45825c;
            if (set.contains(r5.c.f45826a)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(r5.c.f45828c)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(r5.c.f45827b)) {
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

    public void W(of.a aVar) {
        of.g gVar;
        of.g gVar2 = (of.g) this.f15400c;
        if (gVar2 != null && ((of.a) this.d) == null && aVar != null) {
            q(gVar2);
        }
        if (((of.a) this.d) != null && (gVar = (of.g) this.f15400c) != null && aVar == null) {
            T(gVar);
        }
        of.a aVar2 = (of.a) this.d;
        if (aVar2 != null) {
            e6.h hVar = aVar2.f17155a;
            n6.l.e("Must be called from the main thread.");
            hVar.f8683i.remove(aVar2);
        }
        if (aVar != null) {
            aVar.f17155a.p(aVar);
            of.g gVar3 = (of.g) this.f15400c;
            if (gVar3 != null) {
                aVar.d = gVar3;
                aVar.f17160g = 0;
                aVar.h = 0;
                aVar.p();
            }
        }
        this.d = aVar;
    }

    public FileOutputStream X() {
        File file = (File) this.f15400c;
        File file2 = (File) this.d;
        if (file2.exists()) {
            U(file2, (File) this.f15399b);
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
            hh.h hVar = (hh.h) this.f15399b;
            c1 U = RecyclerView.U(view);
            if (U != null) {
                RecyclerView recyclerView = hVar.f11463a;
                int i10 = U.f46546r;
                if (recyclerView.c0()) {
                    U.f46547s = i10;
                    recyclerView.J0.add(U);
                } else {
                    View view2 = U.f46531a;
                    WeakHashMap weakHashMap = i0.f45603a;
                    view2.setImportantForAccessibility(i10);
                }
                U.f46546r = 0;
            }
        }
    }

    public void Z(Object obj, String str) {
        h hVar = new h(8, false);
        ((h) this.d).d = hVar;
        this.d = hVar;
        hVar.f15400c = obj;
        hVar.f15399b = str;
    }

    @Override
    public Uri c() {
        return (Uri) this.f15399b;
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
        ((rk) this.d).Q.w();
    }

    @Override
    public Object mo28get() {
        return new h((Context) ((fd.a) this.f15399b).mo28get(), (s5.d) ((fd.a) this.f15400c).mo28get(), (r5.a) ((qb.b) this.d).mo28get(), 25);
    }

    @Override
    public ClipDescription getDescription() {
        return (ClipDescription) this.f15400c;
    }

    @Override
    public void h(android.view.View r13, zg.o0 r14, boolean r15, boolean r16) {
        throw new UnsupportedOperationException("Method not decompiled: la.h.h(android.view.View, zg.o0, boolean, boolean):void");
    }

    @Override
    public void i(int i10, boolean z10, boolean z11) {
        String str;
        if (!z10) {
            rk rkVar = (rk) this.d;
            HashMap hashMap = (HashMap) this.f15399b;
            ArrayList arrayList = (ArrayList) this.f15400c;
            xi xiVar = rkVar.f29648b;
            if (!hashMap.isEmpty() && rkVar.Q != null && !rkVar.K) {
                rkVar.K = true;
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
                e5.a0(xiVar.J1, xiVar.j1() + arrayList2.size(), xiVar.n1(), new d4(i10, 2, rkVar, arrayList2, z11));
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
    public boolean p() {
        return false;
    }

    public void q(of.g gVar) {
        if (((of.d) this.f15399b) == null) {
            this.f15399b = new of.d();
        }
        for (int i10 = 0; i10 < gVar.f17186a.size(); i10++) {
            of.d dVar = (of.d) this.f15399b;
            of.f a2 = gVar.a(i10);
            dVar.h.put(a2.d, a2);
            dVar.h();
        }
    }

    public void r(View view, int i10, boolean z10) {
        int J;
        RecyclerView recyclerView = ((hh.h) this.f15399b).f11463a;
        if (i10 < 0) {
            J = recyclerView.getChildCount();
        } else {
            J = J(i10);
        }
        ((e6.n) this.f15400c).z(J, z10);
        if (z10) {
            N(view);
        }
        recyclerView.addView(view, J);
        c1 U = RecyclerView.U(view);
        recyclerView.g0(view);
        h0 h0Var = recyclerView.f3088w;
        if (h0Var != null && U != null) {
            h0Var.y(U);
        }
        ArrayList arrayList = recyclerView.P;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((y) recyclerView.P.get(size)).getClass();
            }
        }
    }

    public void s(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        int J;
        RecyclerView recyclerView = ((hh.h) this.f15399b).f11463a;
        if (i10 < 0) {
            J = recyclerView.getChildCount();
        } else {
            J = J(i10);
        }
        ((e6.n) this.f15400c).z(J, z10);
        if (z10) {
            N(view);
        }
        c1 U = RecyclerView.U(view);
        if (U != null) {
            if (!U.l() && !U.r()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + U + recyclerView.C());
            }
            U.f46540l &= -257;
        }
        RecyclerView.c(recyclerView, view, J, layoutParams);
    }

    public String t(int i10, String str, long j3, long j10) {
        ArrayList arrayList = (ArrayList) this.f15399b;
        ArrayList arrayList2 = (ArrayList) this.d;
        ArrayList arrayList3 = (ArrayList) this.f15400c;
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
        switch (this.f15398a) {
            case 1:
                StringBuilder sb2 = new StringBuilder("id3v2tag[pos=");
                mf.a aVar = (mf.a) this.f15399b;
                sb2.append(aVar.f7877b);
                sb2.append(", ");
                sb2.append(aVar.e());
                sb2.append(" left]");
                return sb2.toString();
            case 9:
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append((String) this.f15399b);
                sb3.append('{');
                h hVar = (h) ((h) this.f15400c).d;
                String str = "";
                while (hVar != null) {
                    Object obj = hVar.f15400c;
                    sb3.append(str);
                    String str2 = (String) hVar.f15399b;
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
            case 26:
                return ((e6.n) this.f15400c).toString() + ", hidden list:" + ((ArrayList) this.d).size();
            default:
                return super.toString();
        }
    }

    public void u() {
        b0 b0Var = (b0) this.f15399b;
        if (b0Var != null) {
            int i10 = ((p4.e) this.d).f44165n.d;
            v vVar = b0Var.f1994a;
            vVar.getClass();
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(i10);
            vVar.f2018a.setPlaybackToLocal(builder.build());
            this.f15400c = null;
        }
    }

    public void x(int i10) {
        c1 U;
        int J = J(i10);
        ((e6.n) this.f15400c).A(J);
        RecyclerView recyclerView = ((hh.h) this.f15399b).f11463a;
        View childAt = recyclerView.getChildAt(J);
        if (childAt != null && (U = RecyclerView.U(childAt)) != null) {
            if (U.l() && !U.r()) {
                throw new IllegalArgumentException("called detach on an already detached child " + U + recyclerView.C());
            }
            U.a(256);
        }
        RecyclerView.d(recyclerView, J);
    }

    public void y(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = (HashMap) this.f15399b;
        f fVar = new f(byteArrayOutputStream, hashMap, (HashMap) this.f15400c, (ia.d) this.d);
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

    public lf.e z(lf.f fVar) {
        InflaterInputStream inflaterInputStream;
        int i10 = fVar.f15483c;
        InputStream inputStream = (mf.a) this.f15399b;
        if (fVar.d) {
            l2.g gVar = (l2.g) this.d;
            gVar.getClass();
            byte[] bArr = new byte[i10];
            int i11 = 0;
            while (i11 < i10) {
                int read = ((com.google.firebase.messaging.d) gVar.f15268b).read(bArr, i11, i10 - i11);
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
        if (!fVar.f15485f) {
            if (fVar.f15484e) {
                i10 = fVar.f15486g;
                inflaterInputStream = new InflaterInputStream(inputStream);
            } else {
                inflaterInputStream = inputStream;
            }
            return new lf.e(inflaterInputStream, fVar.f15482b, i10, (lf.i) this.f15400c, fVar);
        }
        throw new Exception("Frame encryption is not supported");
    }

    public h(Object obj, Object obj2, Object obj3, int i10) {
        this.f15398a = i10;
        this.f15399b = obj;
        this.f15400c = obj2;
        this.d = obj3;
    }

    public h(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f15398a = i10;
        this.d = obj;
        this.f15399b = obj2;
        this.f15400c = obj3;
    }

    public h(String str) {
        this.f15398a = 9;
        h hVar = new h(8, false);
        this.f15400c = hVar;
        this.d = hVar;
        this.f15399b = str;
    }

    public h(InputStream inputStream, long j3, int i10, lf.i iVar) {
        this.f15398a = 1;
        mf.a aVar = new mf.a(inputStream, j3, i10);
        this.f15399b = aVar;
        this.d = new l2.g(aVar, 1);
        this.f15400c = iVar;
    }

    public h(String str, Boolean bool, uc.a aVar, String str2) {
        this.f15398a = 29;
        this.f15399b = str;
        this.f15400c = str2;
        this.d = aVar;
    }

    public h(int i10) {
        this.f15398a = i10;
        switch (i10) {
            case 22:
                this.f15399b = new Object();
                this.f15400c = null;
                this.d = null;
                return;
            default:
                this.f15399b = new Object();
                return;
        }
    }

    public h(hh.h hVar) {
        this.f15398a = 26;
        this.f15399b = hVar;
        this.f15400c = new e6.n(6);
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
    public void o() {
    }

    public h(File file) {
        this.f15398a = 20;
        this.f15399b = file;
        this.f15400c = new File(file.getPath() + ".new");
        this.d = new File(file.getPath() + ".bak");
    }

    @Override
    public void b(Editable editable) {
    }

    public h(r rVar) {
        this.f15398a = 28;
        this.f15399b = rVar;
    }

    public h(Runnable runnable) {
        this.f15398a = 24;
        this.d = new CopyOnWriteArrayList();
        this.f15399b = new HashMap();
        this.f15400c = runnable;
    }

    public h(Context context, TypedArray typedArray) {
        this.f15398a = 2;
        this.f15399b = context;
        this.f15400c = typedArray;
    }

    public h(byte[] bArr, w wVar) {
        this.f15398a = 4;
        this.f15399b = bArr;
        this.f15400c = null;
        this.d = wVar;
    }

    public h(Uri uri, w wVar) {
        this.f15398a = 4;
        this.f15399b = null;
        this.f15400c = uri;
        this.d = wVar;
    }

    public h(k2.e eVar) {
        this.f15398a = 10;
        this.f15398a = 10;
        this.f15399b = eVar;
        this.f15400c = Choreographer.getInstance();
        this.d = new o1.a(this, 0);
    }

    public h(String str, String str2) {
        this.f15398a = 23;
        this.f15399b = str;
        this.f15400c = str2;
        this.d = str2.isEmpty() ? str : a4.a.D(str, "/", str2);
    }

    public h(p4.e eVar, b0 b0Var) {
        this.f15398a = 19;
        this.d = eVar;
        this.f15399b = b0Var;
    }

    public h(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.f15398a = 18;
        this.f15400c = arrayDeque;
        this.f15399b = bufferedReader;
    }

    public h(Object[] objArr, Object[] objArr2) {
        this.f15398a = 15;
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
        this.f15399b = iArr;
        this.f15400c = v(objArr, iArr);
        this.d = v(objArr2, iArr);
    }

    @Override
    public void n(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
