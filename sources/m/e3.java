package m;

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
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
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
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.gk;
import org.telegram.ui.Components.iz0;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.Components.tk;
import org.telegram.ui.Components.wz0;
import org.telegram.ui.Components.yi;
import org.telegram.ui.ar0;
import org.xmlpull.v1.XmlPullParserException;
import v7.v7;
import v7.y7;
import w7.i6;
public class e3 implements ok0, ar0, n5.b, t0.h, ja.a {
    public final int f13000a;
    public Object f13001b;
    public Object f13002c;
    public Object d;

    public e3(int i10, boolean z10) {
        this.f13000a = i10;
    }

    public static e3 P(Context context, AttributeSet attributeSet, int[] iArr, int i10) {
        return new e3(context, context.obtainStyledAttributes(attributeSet, iArr, i10, 0));
    }

    public static void T(File file, File file2) {
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

    public static n2.e x(b2.c0 c0Var) {
        String uri;
        boolean z10;
        boolean z11;
        g2.o oVar = new g2.o();
        byte[] bArr = null;
        oVar.f8522c = null;
        Uri uri2 = c0Var.f1645b;
        if (uri2 == null) {
            uri = null;
        } else {
            uri = uri2.toString();
        }
        boolean z12 = c0Var.f1647f;
        ?? obj = new Object();
        if (z12 && TextUtils.isEmpty(uri)) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.b(z10);
        obj.f6101b = oVar;
        obj.f6102c = uri;
        obj.f6100a = z12;
        obj.d = new HashMap();
        e9.k0 k0Var = c0Var.f1646c;
        e9.m0 m0Var = k0Var.f7392a;
        if (m0Var == null) {
            m0Var = k0Var.b();
            k0Var.f7392a = m0Var;
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
        UUID uuid = b2.i.f1710a;
        rb.a aVar = new rb.a(26);
        UUID uuid2 = c0Var.f1644a;
        uuid2.getClass();
        boolean z13 = c0Var.d;
        boolean z14 = c0Var.e;
        int[] f7 = y7.f(c0Var.f1648g);
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
        e2.d.g(eVar.f13725w.isEmpty());
        eVar.K = bArr;
        return eVar;
    }

    public View A(int i10) {
        return ((gh.h) this.f13001b).f9143a.getChildAt(I(i10));
    }

    public int B() {
        return ((gh.h) this.f13001b).f9143a.getChildCount() - ((ArrayList) this.d).size();
    }

    public ColorStateList C(int i10) {
        int resourceId;
        ColorStateList a2;
        TypedArray typedArray = (TypedArray) this.f13002c;
        if (typedArray.hasValue(i10) && (resourceId = typedArray.getResourceId(i10, 0)) != 0 && (a2 = v7.a((Context) this.f13001b, resourceId)) != null) {
            return a2;
        }
        return typedArray.getColorStateList(i10);
    }

    public long D() {
        c3.l lVar = (c3.l) this.d;
        if (lVar != null) {
            return lVar.d;
        }
        return -1L;
    }

    public Drawable E(int i10) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f13002c;
        if (typedArray.hasValue(i10) && (resourceId = typedArray.getResourceId(i10, 0)) != 0) {
            return v7.b((Context) this.f13001b, resourceId);
        }
        return typedArray.getDrawable(i10);
    }

    public Drawable F(int i10) {
        int resourceId;
        Drawable f7;
        if (((TypedArray) this.f13002c).hasValue(i10) && (resourceId = ((TypedArray) this.f13002c).getResourceId(i10, 0)) != 0) {
            q a2 = q.a();
            Context context = (Context) this.f13001b;
            synchronized (a2) {
                f7 = a2.f13114a.f(resourceId, context, true);
            }
            return f7;
        }
        return null;
    }

    public Typeface G(int i10, int i11, e2.a0 a0Var) {
        e2.a0 a0Var2;
        XmlPullParserException xmlPullParserException;
        IOException iOException;
        int resourceId = ((TypedArray) this.f13002c).getResourceId(i10, 0);
        if (resourceId != 0) {
            if (((TypedValue) this.d) == null) {
                this.d = new TypedValue();
            }
            Context context = (Context) this.f13001b;
            TypedValue typedValue = (TypedValue) this.d;
            ThreadLocal threadLocal = h0.k.f9181a;
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
                    a0.k kVar = i0.f.f10081b;
                    Typeface typeface = (Typeface) kVar.a(i0.f.b(resources, resourceId, charSequence2, i12, i11));
                    if (typeface != null) {
                        new Handler(Looper.getMainLooper()).post(new fg.s1(9, a0Var, typeface));
                        return typeface;
                    }
                    try {
                        if (charSequence2.toLowerCase().endsWith(".xml")) {
                            h0.d g10 = h0.b.g(resources.getXml(resourceId), resources);
                            if (g10 == null) {
                                try {
                                    Log.e("ResourcesCompat", "Failed to find font-family tag");
                                    a0Var.b();
                                    return null;
                                } catch (IOException e) {
                                    iOException = e;
                                    a0Var2 = a0Var;
                                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                                    a0Var2.b();
                                    return null;
                                } catch (XmlPullParserException e7) {
                                    xmlPullParserException = e7;
                                    a0Var2 = a0Var;
                                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                                    a0Var2.b();
                                    return null;
                                }
                            }
                            try {
                                return i0.f.a(context, g10, resources, resourceId, charSequence2, typedValue.assetCookie, i11, a0Var);
                            } catch (IOException e10) {
                                e = e10;
                                a0Var2 = a0Var;
                                iOException = e;
                                Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                                a0Var2.b();
                                return null;
                            } catch (XmlPullParserException e11) {
                                e = e11;
                                a0Var2 = a0Var;
                                xmlPullParserException = e;
                                Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                                a0Var2.b();
                                return null;
                            }
                        }
                        a0Var2 = a0Var;
                        try {
                            int i13 = typedValue.assetCookie;
                            Typeface e12 = i0.f.f10080a.e(context, resources, resourceId, charSequence2, i11);
                            if (e12 != null) {
                                kVar.b(i0.f.b(resources, resourceId, charSequence2, i13, i11), e12);
                            }
                            if (e12 != null) {
                                new Handler(Looper.getMainLooper()).post(new fg.s1(9, a0Var2, e12));
                            } else {
                                a0Var2.b();
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
                    } catch (IOException e15) {
                        e = e15;
                        a0Var2 = a0Var;
                    } catch (XmlPullParserException e16) {
                        e = e16;
                        a0Var2 = a0Var;
                    }
                } else {
                    throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(resourceId) + "\" (" + Integer.toHexString(resourceId) + ") is not a Font: " + typedValue);
                }
            }
        }
        return null;
    }

    public ByteBuffer H() {
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
        return (ByteBuffer) this.f13002c;
    }

    public int I(int i10) {
        e6.n nVar = (e6.n) this.f13002c;
        if (i10 < 0) {
            return -1;
        }
        int childCount = ((gh.h) this.f13001b).f9143a.getChildCount();
        int i11 = i10;
        while (i11 < childCount) {
            int v = i10 - (i11 - nVar.v(i11));
            if (v == 0) {
                while (nVar.z(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += v;
        }
        return -1;
    }

    public View J(int i10) {
        return ((gh.h) this.f13001b).f9143a.getChildAt(i10);
    }

    public int K() {
        return ((gh.h) this.f13001b).f9143a.getChildCount();
    }

    public boolean L() {
        String trim;
        ArrayDeque arrayDeque = (ArrayDeque) this.f13002c;
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
            String readLine = ((BufferedReader) this.f13001b).readLine();
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

    public void M(View view) {
        ((ArrayList) this.d).add(view);
        gh.h hVar = (gh.h) this.f13001b;
        s4.c1 U = RecyclerView.U(view);
        if (U != null) {
            View view2 = U.f41610a;
            RecyclerView recyclerView = hVar.f9143a;
            int i10 = U.f41625s;
            if (i10 != -1) {
                U.f41624r = i10;
            } else {
                WeakHashMap weakHashMap = r0.i0.f41062a;
                U.f41624r = view2.getImportantForAccessibility();
            }
            if (recyclerView.b0()) {
                U.f41625s = 4;
                recyclerView.J0.add(U);
                return;
            }
            WeakHashMap weakHashMap2 = r0.i0.f41062a;
            view2.setImportantForAccessibility(4);
        }
    }

    public void N(g2.h r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, u2.w0 r15) {
        throw new UnsupportedOperationException("Method not decompiled: m.e3.N(g2.h, android.net.Uri, java.util.Map, long, long, u2.w0):void");
    }

    public String O() {
        if (L()) {
            String str = (String) this.d;
            this.d = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    public void Q() {
        ((TypedArray) this.f13002c).recycle();
    }

    public void R() {
        int i10;
        RecyclerView recyclerView = ((gh.h) this.f13001b).f9143a;
        ((e6.n) this.f13002c).D();
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            s4.c1 U = RecyclerView.U((View) arrayList.get(size));
            if (U != null) {
                int i11 = U.f41624r;
                if (recyclerView.b0()) {
                    U.f41625s = i11;
                    recyclerView.J0.add(U);
                } else {
                    View view = U.f41610a;
                    WeakHashMap weakHashMap = r0.i0.f41062a;
                    view.setImportantForAccessibility(i11);
                }
                U.f41624r = 0;
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

    public void S(of.g gVar) {
        if (((of.d) this.f13001b) != null) {
            for (int i10 = 0; i10 < gVar.f14315a.size(); i10++) {
                of.d dVar = (of.d) this.f13001b;
                dVar.h.remove(gVar.a(i10).d);
                dVar.h();
            }
        }
    }

    public void U(l5.i iVar, int i10, boolean z10) {
        Long l4;
        char c10;
        r5.a aVar = (r5.a) this.d;
        Context context = (Context) this.f13001b;
        ComponentName componentName = new ComponentName(context, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = iVar.f12793a;
        String str2 = iVar.f12793a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        i5.d dVar = iVar.f12795c;
        adler32.update(allocate.putInt(v5.a.a(dVar)).array());
        byte[] bArr = iVar.f12794b;
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
        Cursor rawQuery = ((s5.g) ((s5.d) this.f13002c)).a().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str2, String.valueOf(v5.a.a(dVar))});
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
            Set set = ((r5.b) aVar.f41260b.get(dVar)).f41263c;
            if (set.contains(r5.c.f41264a)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(r5.c.f41266c)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(r5.c.f41265b)) {
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

    public void V(of.a aVar) {
        of.g gVar;
        of.g gVar2 = (of.g) this.f13002c;
        if (gVar2 != null && ((of.a) this.d) == null && aVar != null) {
            o(gVar2);
        }
        if (((of.a) this.d) != null && (gVar = (of.g) this.f13002c) != null && aVar == null) {
            S(gVar);
        }
        of.a aVar2 = (of.a) this.d;
        if (aVar2 != null) {
            e6.h hVar = aVar2.f14288a;
            n6.l.e("Must be called from the main thread.");
            hVar.f7319i.remove(aVar2);
        }
        if (aVar != null) {
            aVar.f14288a.p(aVar);
            of.g gVar3 = (of.g) this.f13002c;
            if (gVar3 != null) {
                aVar.d = gVar3;
                aVar.f14292g = 0;
                aVar.h = 0;
                aVar.p();
            }
        }
        this.d = aVar;
    }

    public FileOutputStream W() {
        File file = (File) this.f13002c;
        File file2 = (File) this.d;
        if (file2.exists()) {
            T(file2, (File) this.f13001b);
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
            gh.h hVar = (gh.h) this.f13001b;
            s4.c1 U = RecyclerView.U(view);
            if (U != null) {
                RecyclerView recyclerView = hVar.f9143a;
                int i10 = U.f41624r;
                if (recyclerView.b0()) {
                    U.f41625s = i10;
                    recyclerView.J0.add(U);
                } else {
                    View view2 = U.f41610a;
                    WeakHashMap weakHashMap = r0.i0.f41062a;
                    view2.setImportantForAccessibility(i10);
                }
                U.f41624r = 0;
            }
        }
    }

    public void Y(Object obj, String str) {
        e3 e3Var = new e3(6, false);
        ((e3) this.d).d = e3Var;
        this.d = e3Var;
        e3Var.f13002c = obj;
        e3Var.f13001b = str;
    }

    @Override
    public Uri c() {
        return (Uri) this.f13001b;
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
        ((tk) this.d).Q.w();
    }

    @Override
    public Object mo28get() {
        return new e3((Context) ((fd.a) this.f13001b).mo28get(), (s5.d) ((fd.a) this.f13002c).mo28get(), (r5.a) ((qb.b) this.d).mo28get(), 22);
    }

    @Override
    public ClipDescription getDescription() {
        return (ClipDescription) this.f13002c;
    }

    @Override
    public void h(int i10, boolean z10, boolean z11) {
        String str;
        if (!z10) {
            tk tkVar = (tk) this.d;
            HashMap hashMap = (HashMap) this.f13001b;
            ArrayList arrayList = (ArrayList) this.f13002c;
            yi yiVar = tkVar.f26422b;
            if (!hashMap.isEmpty() && tkVar.Q != null && !tkVar.K) {
                tkVar.K = true;
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
                d5.a0(yiVar.J1, yiVar.j1() + arrayList2.size(), yiVar.n1(), new gk(i10, 0, tkVar, arrayList2, z11));
            }
        }
    }

    @Override
    public Object i() {
        return null;
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
    public void l(android.view.View r13, yg.p0 r14, boolean r15, boolean r16) {
        throw new UnsupportedOperationException("Method not decompiled: m.e3.l(android.view.View, yg.p0, boolean, boolean):void");
    }

    @Override
    public ja.a m(Class cls, ia.d dVar) {
        ((HashMap) this.f13001b).put(cls, dVar);
        ((HashMap) this.f13002c).remove(cls);
        return this;
    }

    public void o(of.g gVar) {
        if (((of.d) this.f13001b) == null) {
            this.f13001b = new of.d();
        }
        for (int i10 = 0; i10 < gVar.f14315a.size(); i10++) {
            of.d dVar = (of.d) this.f13001b;
            of.f a2 = gVar.a(i10);
            dVar.h.put(a2.d, a2);
            dVar.h();
        }
    }

    public void p(View view, int i10, boolean z10) {
        int I;
        RecyclerView recyclerView = ((gh.h) this.f13001b).f9143a;
        if (i10 < 0) {
            I = recyclerView.getChildCount();
        } else {
            I = I(i10);
        }
        ((e6.n) this.f13002c).A(I, z10);
        if (z10) {
            M(view);
        }
        recyclerView.addView(view, I);
        s4.c1 U = RecyclerView.U(view);
        recyclerView.f0(view);
        s4.h0 h0Var = recyclerView.f1558w;
        if (h0Var != null && U != null) {
            h0Var.y(U);
        }
        ArrayList arrayList = recyclerView.P;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((s4.y) recyclerView.P.get(size)).getClass();
            }
        }
    }

    public void q(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        int I;
        RecyclerView recyclerView = ((gh.h) this.f13001b).f9143a;
        if (i10 < 0) {
            I = recyclerView.getChildCount();
        } else {
            I = I(i10);
        }
        ((e6.n) this.f13002c).A(I, z10);
        if (z10) {
            M(view);
        }
        s4.c1 U = RecyclerView.U(view);
        if (U != null) {
            if (!U.l() && !U.r()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + U + recyclerView.C());
            }
            U.f41618l &= -257;
        }
        RecyclerView.b(recyclerView, view, I, layoutParams);
    }

    @Override
    public boolean t() {
        return false;
    }

    public String toString() {
        String str = "";
        switch (this.f13000a) {
            case 7:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.f13001b);
                sb2.append('{');
                e3 e3Var = (e3) ((e3) this.f13002c).d;
                while (e3Var != null) {
                    Object obj = e3Var.f13002c;
                    sb2.append(str);
                    String str2 = (String) e3Var.f13001b;
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
                    e3Var = (e3) e3Var.d;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            case 23:
                return ((e6.n) this.f13002c).toString() + ", hidden list:" + ((ArrayList) this.d).size();
            case 29:
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append((String) this.f13001b);
                sb3.append('{');
                e3 e3Var2 = (e3) ((e3) this.f13002c).d;
                while (e3Var2 != null) {
                    Object obj2 = e3Var2.f13002c;
                    sb3.append(str);
                    String str3 = (String) e3Var2.f13001b;
                    if (str3 != null) {
                        sb3.append(str3);
                        sb3.append('=');
                    }
                    if (obj2 != null && obj2.getClass().isArray()) {
                        String deepToString2 = Arrays.deepToString(new Object[]{obj2});
                        sb3.append((CharSequence) deepToString2, 1, deepToString2.length() - 1);
                    } else {
                        sb3.append(obj2);
                    }
                    e3Var2 = (e3) e3Var2.d;
                    str = ", ";
                }
                sb3.append('}');
                return sb3.toString();
            default:
                return super.toString();
        }
    }

    public String u(int i10, String str, long j3, long j10) {
        ArrayList arrayList = (ArrayList) this.f13001b;
        ArrayList arrayList2 = (ArrayList) this.d;
        ArrayList arrayList3 = (ArrayList) this.f13002c;
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
        android.support.v4.media.session.b0 b0Var = (android.support.v4.media.session.b0) this.f13001b;
        if (b0Var != null) {
            int i10 = ((p4.e) this.d).f39687n.d;
            android.support.v4.media.session.v vVar = b0Var.f519a;
            vVar.getClass();
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(i10);
            vVar.f541a.setPlaybackToLocal(builder.build());
            this.f13002c = null;
        }
    }

    public void y(int i10) {
        s4.c1 U;
        int I = I(i10);
        ((e6.n) this.f13002c).C(I);
        RecyclerView recyclerView = ((gh.h) this.f13001b).f9143a;
        View childAt = recyclerView.getChildAt(I);
        if (childAt != null && (U = RecyclerView.U(childAt)) != null) {
            if (U.l() && !U.r()) {
                throw new IllegalArgumentException("called detach on an already detached child " + U + recyclerView.C());
            }
            U.a(256);
        }
        RecyclerView.c(recyclerView, I);
    }

    public n2.n z(b2.k0 k0Var) {
        n2.e eVar;
        k0Var.f1771b.getClass();
        b2.c0 c0Var = k0Var.f1771b.f1688c;
        if (c0Var == null) {
            return n2.n.f13739z;
        }
        synchronized (this.f13001b) {
            try {
                if (!c0Var.equals((b2.c0) this.f13002c)) {
                    this.f13002c = c0Var;
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

    public e3(Object obj, Object obj2, Object obj3, int i10) {
        this.f13000a = i10;
        this.f13001b = obj;
        this.f13002c = obj2;
        this.d = obj3;
    }

    public e3(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f13000a = i10;
        this.d = obj;
        this.f13001b = obj2;
        this.f13002c = obj3;
    }

    public e3(String str, int i10) {
        this.f13000a = i10;
        switch (i10) {
            case 29:
                e3 e3Var = new e3(28, false);
                this.f13002c = e3Var;
                this.d = e3Var;
                this.f13001b = str;
                return;
            default:
                e3 e3Var2 = new e3(6, false);
                this.f13002c = e3Var2;
                this.d = e3Var2;
                this.f13001b = str;
                return;
        }
    }

    public e3(String str, Boolean bool, uc.a aVar, String str2) {
        this.f13000a = 26;
        this.f13001b = str;
        this.f13002c = str2;
        this.d = aVar;
    }

    public e3(int i10) {
        this.f13000a = i10;
        switch (i10) {
            case 20:
                this.f13001b = new Object();
                this.f13002c = null;
                this.d = null;
                return;
            case 27:
                this.f13001b = new HashMap();
                this.f13002c = new HashMap();
                this.d = v7.i.f43020c;
                return;
            default:
                this.f13001b = new Object();
                return;
        }
    }

    public e3(gh.h hVar) {
        this.f13000a = 23;
        this.f13001b = hVar;
        this.f13002c = new e6.n(6);
        this.d = new ArrayList();
    }

    @Override
    public void a() {
    }

    @Override
    public void d() {
    }

    @Override
    public void n() {
    }

    @Override
    public void s() {
    }

    public e3(File file) {
        this.f13000a = 18;
        this.f13001b = file;
        this.f13002c = new File(file.getPath() + ".new");
        this.d = new File(file.getPath() + ".bak");
    }

    @Override
    public void b(Editable editable) {
    }

    public e3(c3.r rVar) {
        this.f13000a = 25;
        this.f13001b = rVar;
    }

    public e3(Runnable runnable) {
        this.f13000a = 21;
        this.f13002c = new CopyOnWriteArrayList();
        this.d = new HashMap();
        this.f13001b = runnable;
    }

    public e3(Context context, TypedArray typedArray) {
        this.f13000a = 0;
        this.f13001b = context;
        this.f13002c = typedArray;
    }

    public e3(byte[] bArr, i9.w wVar) {
        this.f13000a = 2;
        this.f13001b = bArr;
        this.f13002c = null;
        this.d = wVar;
    }

    public e3(Uri uri, i9.w wVar) {
        this.f13000a = 2;
        this.f13001b = null;
        this.f13002c = uri;
        this.d = wVar;
    }

    public e3(l2.g gVar) {
        this.f13000a = 8;
        this.f13000a = 8;
        this.f13001b = gVar;
        this.f13002c = Choreographer.getInstance();
        this.d = new o1.a(this, 0);
    }

    public e3(p4.e eVar, android.support.v4.media.session.b0 b0Var) {
        this.f13000a = 17;
        this.d = eVar;
        this.f13001b = b0Var;
    }

    public e3(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.f13000a = 16;
        this.f13002c = arrayDeque;
        this.f13001b = bufferedReader;
    }

    public e3(Object[] objArr, Object[] objArr2) {
        this.f13000a = 13;
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
        this.f13001b = iArr;
        this.f13002c = w(objArr, iArr);
        this.d = w(objArr2, iArr);
    }

    @Override
    public void r(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
