package m;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
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
import ei.p6;
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
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Components.bl0;
import org.telegram.ui.Components.d01;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.nk;
import org.telegram.ui.Components.pz0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.kq0;
import org.xmlpull.v1.XmlPullParserException;
import v7.b8;
import v7.q7;
import v7.u6;
import w7.l6;
public class g3 implements bl0, kq0, n5.b {
    public final int f16202a;
    public Object f16203b;
    public Object f16204c;
    public Object d;

    public g3(int i10, boolean z10) {
        this.f16202a = i10;
    }

    public static g3 K(Context context, AttributeSet attributeSet, int[] iArr, int i10) {
        return new g3(context, context.obtainStyledAttributes(attributeSet, iArr, i10, 0));
    }

    public static void O(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e("AtomicFile", "Failed to delete file which is a directory " + file2);
        }
        if (!file.renameTo(file2)) {
            Log.e("AtomicFile", "Failed to rename " + file + " to " + file2);
        }
    }

    public static g3 i(View view) {
        return new g3(view);
    }

    public static Object[] p(Object[] objArr, int[] iArr) {
        int length = objArr.length;
        Class<?> componentType = objArr.getClass().getComponentType();
        pz0 pz0Var = d01.R;
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

    public static n2.f s(b2.g0 g0Var) {
        String uri;
        boolean z10;
        boolean z11;
        g2.o oVar = new g2.o();
        byte[] bArr = null;
        oVar.f10808c = null;
        Uri uri2 = g0Var.f3768b;
        if (uri2 == null) {
            uri = null;
        } else {
            uri = uri2.toString();
        }
        boolean z12 = g0Var.f3770f;
        ?? obj = new Object();
        if (z12 && TextUtils.isEmpty(uri)) {
            z10 = false;
        } else {
            z10 = true;
        }
        u6.g(z10);
        obj.f4494b = oVar;
        obj.f4495c = uri;
        obj.f4493a = z12;
        obj.d = new HashMap();
        e9.q0 q0Var = g0Var.f3769c;
        e9.y0 y0Var = q0Var.f8489a;
        if (y0Var == null) {
            y0Var = q0Var.b();
            q0Var.f8489a = y0Var;
        }
        e9.m2 it = y0Var.iterator();
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
        int i10 = b2.m.f3829a;
        oa.d dVar = new oa.d(27);
        UUID uuid = g0Var.f3767a;
        uuid.getClass();
        boolean z13 = g0Var.d;
        boolean z14 = g0Var.e;
        int[] f7 = b8.f(g0Var.f3771g);
        for (int i11 : f7) {
            if (i11 != 2 && i11 != 1) {
                z11 = false;
            } else {
                z11 = true;
            }
            u6.g(z11);
        }
        n2.f fVar = new n2.f(uuid, obj, hashMap, z13, (int[]) f7.clone(), z14, dVar);
        byte[] bArr2 = g0Var.h;
        if (bArr2 != null) {
            bArr = Arrays.copyOf(bArr2, bArr2.length);
        }
        u6.p(fVar.f17051w.isEmpty());
        fVar.K = bArr;
        return fVar;
    }

    public Drawable A(int i10) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f16204c;
        if (typedArray.hasValue(i10) && (resourceId = typedArray.getResourceId(i10, 0)) != 0) {
            return q7.b((Context) this.f16203b, resourceId);
        }
        return typedArray.getDrawable(i10);
    }

    public Drawable B(int i10) {
        int resourceId;
        Drawable f7;
        if (((TypedArray) this.f16204c).hasValue(i10) && (resourceId = ((TypedArray) this.f16204c).getResourceId(i10, 0)) != 0) {
            r a2 = r.a();
            Context context = (Context) this.f16203b;
            synchronized (a2) {
                f7 = a2.f16312a.f(resourceId, context, true);
            }
            return f7;
        }
        return null;
    }

    public Typeface C(int i10, int i11, e2.j0 j0Var) {
        e2.j0 j0Var2;
        XmlPullParserException xmlPullParserException;
        IOException iOException;
        int resourceId = ((TypedArray) this.f16204c).getResourceId(i10, 0);
        if (resourceId != 0) {
            if (((TypedValue) this.d) == null) {
                this.d = new TypedValue();
            }
            Context context = (Context) this.f16203b;
            TypedValue typedValue = (TypedValue) this.d;
            ThreadLocal threadLocal = h0.j.f11608a;
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
                    a0.j jVar = i0.e.f12293b;
                    Typeface typeface = (Typeface) jVar.a(i0.e.b(resources, resourceId, charSequence2, i12, i11));
                    if (typeface != null) {
                        new Handler(Looper.getMainLooper()).post(new p6(22, j0Var, typeface));
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
                            Typeface e12 = i0.e.f12292a.e(context, resources, resourceId, charSequence2, i11);
                            if (e12 != null) {
                                jVar.b(i0.e.b(resources, resourceId, charSequence2, i13, i11), e12);
                            }
                            if (e12 != null) {
                                new Handler(Looper.getMainLooper()).post(new p6(22, j0Var2, e12));
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

    public ByteBuffer D() {
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
        return (ByteBuffer) this.f16204c;
    }

    public int E(int i10) {
        ad.d dVar = (ad.d) this.f16204c;
        if (i10 < 0) {
            return -1;
        }
        int childCount = ((ih.g) this.f16203b).f13141a.getChildCount();
        int i11 = i10;
        while (i11 < childCount) {
            int A = i10 - (i11 - dVar.A(i11));
            if (A == 0) {
                while (dVar.D(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += A;
        }
        return -1;
    }

    public View F(int i10) {
        return ((ih.g) this.f16203b).f13141a.getChildAt(i10);
    }

    public int G() {
        return ((ih.g) this.f16203b).f13141a.getChildCount();
    }

    public boolean H() {
        String trim;
        ArrayDeque arrayDeque = (ArrayDeque) this.f16204c;
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
            String readLine = ((BufferedReader) this.f16203b).readLine();
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

    public void I(View view) {
        ((ArrayList) this.d).add(view);
        ih.g gVar = (ih.g) this.f16203b;
        s4.b1 U = RecyclerView.U(view);
        if (U != null) {
            View view2 = U.f45958a;
            RecyclerView recyclerView = gVar.f13141a;
            int i10 = U.f45973s;
            if (i10 != -1) {
                U.f45972r = i10;
            } else {
                WeakHashMap weakHashMap = r0.i0.f44864a;
                U.f45972r = view2.getImportantForAccessibility();
            }
            if (recyclerView.b0()) {
                U.f45973s = 4;
                recyclerView.K0.add(U);
                return;
            }
            WeakHashMap weakHashMap2 = r0.i0.f44864a;
            view2.setImportantForAccessibility(4);
        }
    }

    public String J() {
        if (H()) {
            String str = (String) this.d;
            this.d = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    public void L() {
        ((TypedArray) this.f16204c).recycle();
    }

    public void M() {
        int i10;
        RecyclerView recyclerView = ((ih.g) this.f16203b).f13141a;
        ((ad.d) this.f16204c).G();
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            s4.b1 U = RecyclerView.U((View) arrayList.get(size));
            if (U != null) {
                int i11 = U.f45972r;
                if (recyclerView.b0()) {
                    U.f45973s = i11;
                    recyclerView.K0.add(U);
                } else {
                    View view = U.f45958a;
                    WeakHashMap weakHashMap = r0.i0.f44864a;
                    view.setImportantForAccessibility(i11);
                }
                U.f45972r = 0;
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

    public void N(qf.g gVar) {
        if (((qf.d) this.f16203b) != null) {
            for (int i10 = 0; i10 < gVar.f44506a.size(); i10++) {
                qf.d dVar = (qf.d) this.f16203b;
                dVar.h.remove(gVar.a(i10).d);
                dVar.h();
            }
        }
    }

    public void P(l5.i iVar, int i10, boolean z10) {
        Long l4;
        char c10;
        r5.a aVar = (r5.a) this.d;
        Context context = (Context) this.f16203b;
        ComponentName componentName = new ComponentName(context, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = iVar.f15921a;
        String str2 = iVar.f15921a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        i5.d dVar = iVar.f15923c;
        adler32.update(allocate.putInt(v5.a.a(dVar)).array());
        byte[] bArr = iVar.f15922b;
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
        Cursor rawQuery = ((s5.g) ((s5.d) this.f16204c)).a().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str2, String.valueOf(v5.a.a(dVar))});
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
            Set set = ((r5.b) aVar.f45058b.get(dVar)).f45061c;
            if (set.contains(r5.c.f45062a)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(r5.c.f45064c)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(r5.c.f45063b)) {
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

    public void Q(qf.a aVar) {
        qf.g gVar;
        qf.g gVar2 = (qf.g) this.f16204c;
        if (gVar2 != null && ((qf.a) this.d) == null && aVar != null) {
            f(gVar2);
        }
        if (((qf.a) this.d) != null && (gVar = (qf.g) this.f16204c) != null && aVar == null) {
            N(gVar);
        }
        qf.a aVar2 = (qf.a) this.d;
        if (aVar2 != null) {
            e6.h hVar = aVar2.f44479a;
            n6.l.e("Must be called from the main thread.");
            hVar.f8377i.remove(aVar2);
        }
        if (aVar != null) {
            aVar.f44479a.p(aVar);
            qf.g gVar3 = (qf.g) this.f16204c;
            if (gVar3 != null) {
                aVar.d = gVar3;
                aVar.f44483g = 0;
                aVar.h = 0;
                aVar.p();
            }
        }
        this.d = aVar;
    }

    public FileOutputStream R() {
        File file = (File) this.f16204c;
        File file2 = (File) this.d;
        if (file2.exists()) {
            O(file2, (File) this.f16203b);
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

    public void S(View view) {
        if (((ArrayList) this.d).remove(view)) {
            ih.g gVar = (ih.g) this.f16203b;
            s4.b1 U = RecyclerView.U(view);
            if (U != null) {
                RecyclerView recyclerView = gVar.f13141a;
                int i10 = U.f45972r;
                if (recyclerView.b0()) {
                    U.f45973s = i10;
                    recyclerView.K0.add(U);
                } else {
                    View view2 = U.f45958a;
                    WeakHashMap weakHashMap = r0.i0.f44864a;
                    view2.setImportantForAccessibility(i10);
                }
                U.f45972r = 0;
            }
        }
    }

    public void T(Object obj, String str) {
        g3 g3Var = new g3(7, false);
        ((g3) this.d).d = g3Var;
        this.d = g3Var;
        g3Var.f16204c = obj;
        g3Var.f16203b = str;
    }

    @Override
    public void c() {
        ((nk) this.d).Q.y();
    }

    @Override
    public void d(int i10, boolean z10, boolean z11) {
        String str;
        if (!z10) {
            nk nkVar = (nk) this.d;
            HashMap hashMap = (HashMap) this.f16203b;
            ArrayList arrayList = (ArrayList) this.f16204c;
            ti tiVar = nkVar.f28245b;
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
                f5.Z(tiVar.M1, tiVar.l1() + arrayList2.size(), tiVar.p1(), new ci.y2(i10, 2, nkVar, arrayList2, z11));
            }
        }
    }

    @Override
    public boolean e() {
        return true;
    }

    public void f(qf.g gVar) {
        if (((qf.d) this.f16203b) == null) {
            this.f16203b = new qf.d();
        }
        for (int i10 = 0; i10 < gVar.f44506a.size(); i10++) {
            qf.d dVar = (qf.d) this.f16203b;
            qf.f a2 = gVar.a(i10);
            dVar.h.put(a2.d, a2);
            dVar.h();
        }
    }

    public void g(View view, int i10, boolean z10) {
        int E;
        RecyclerView recyclerView = ((ih.g) this.f16203b).f13141a;
        if (i10 < 0) {
            E = recyclerView.getChildCount();
        } else {
            E = E(i10);
        }
        ((ad.d) this.f16204c).E(E, z10);
        if (z10) {
            I(view);
        }
        recyclerView.addView(view, E);
        s4.b1 U = RecyclerView.U(view);
        recyclerView.f0(view);
        s4.g0 g0Var = recyclerView.f3633w;
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
    public Object mo27get() {
        return new g3((Context) ((hd.a) this.f16203b).mo27get(), (s5.d) ((hd.a) this.f16204c).mo27get(), (r5.a) ((oa.d) this.d).mo27get(), 27);
    }

    @Override
    public boolean h() {
        return true;
    }

    public void j(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        int E;
        RecyclerView recyclerView = ((ih.g) this.f16203b).f13141a;
        if (i10 < 0) {
            E = recyclerView.getChildCount();
        } else {
            E = E(i10);
        }
        ((ad.d) this.f16204c).E(E, z10);
        if (z10) {
            I(view);
        }
        s4.b1 U = RecyclerView.U(view);
        if (U != null) {
            if (!U.l() && !U.r()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + U + recyclerView.C());
            }
            U.f45966l &= -257;
        }
        recyclerView.attachViewToParent(view, E, layoutParams);
    }

    @Override
    public boolean k() {
        return false;
    }

    @Override
    public void l(android.view.View r13, ah.i1 r14, boolean r15, boolean r16) {
        throw new UnsupportedOperationException("Method not decompiled: m.g3.l(android.view.View, ah.i1, boolean, boolean):void");
    }

    public String n(int i10, String str, long j10, long j11) {
        ArrayList arrayList = (ArrayList) this.f16203b;
        ArrayList arrayList2 = (ArrayList) this.d;
        ArrayList arrayList3 = (ArrayList) this.f16204c;
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

    public void o() {
        android.support.v4.media.session.b0 b0Var = (android.support.v4.media.session.b0) this.f16203b;
        if (b0Var != null) {
            int i10 = ((p4.e) this.d).f44145n.d;
            android.support.v4.media.session.v vVar = b0Var.f2600a;
            vVar.getClass();
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(i10);
            vVar.f2622a.setPlaybackToLocal(builder.build());
            this.f16204c = null;
        }
    }

    @Override
    public boolean r() {
        return false;
    }

    public void t(int i10) {
        s4.b1 U;
        int E = E(i10);
        ((ad.d) this.f16204c).F(E);
        RecyclerView recyclerView = ((ih.g) this.f16203b).f13141a;
        View childAt = recyclerView.getChildAt(E);
        if (childAt != null && (U = RecyclerView.U(childAt)) != null) {
            if (U.l() && !U.r()) {
                throw new IllegalArgumentException("called detach on an already detached child " + U + recyclerView.C());
            }
            U.a(256);
        }
        recyclerView.detachViewFromParent(E);
    }

    public String toString() {
        switch (this.f16202a) {
            case 8:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.f16203b);
                sb2.append('{');
                g3 g3Var = (g3) ((g3) this.f16204c).d;
                String str = "";
                while (g3Var != null) {
                    Object obj = g3Var.f16204c;
                    sb2.append(str);
                    String str2 = (String) g3Var.f16203b;
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
                    g3Var = (g3) g3Var.d;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            case 9:
                StringBuilder sb3 = new StringBuilder("id3v2tag[pos=");
                of.a aVar = (of.a) this.f16203b;
                sb3.append(aVar.f7629b);
                sb3.append(", ");
                sb3.append(aVar.e());
                sb3.append(" left]");
                return sb3.toString();
            case 28:
                return ((ad.d) this.f16204c).toString() + ", hidden list:" + ((ArrayList) this.d).size();
            default:
                return super.toString();
        }
    }

    public void u(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = (HashMap) this.f16203b;
        ma.f fVar = new ma.f(byteArrayOutputStream, hashMap, (HashMap) this.f16204c, (ja.d) this.d);
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

    public nf.e v(nf.f fVar) {
        InflaterInputStream inflaterInputStream;
        int i10 = fVar.f17426c;
        InputStream inputStream = (of.a) this.f16203b;
        if (fVar.d) {
            k0.b bVar = (k0.b) this.d;
            bVar.getClass();
            byte[] bArr = new byte[i10];
            int i11 = 0;
            while (i11 < i10) {
                int read = ((com.google.firebase.messaging.d) bVar.f14566b).read(bArr, i11, i10 - i11);
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
        if (!fVar.f17427f) {
            if (fVar.e) {
                i10 = fVar.f17428g;
                inflaterInputStream = new InflaterInputStream(inputStream);
            } else {
                inflaterInputStream = inputStream;
            }
            return new nf.e(inflaterInputStream, fVar.f17425b, i10, (nf.h) this.f16204c, fVar);
        }
        throw new Exception("Frame encryption is not supported");
    }

    public n2.n w(b2.o0 o0Var) {
        n2.f fVar;
        o0Var.f3891b.getClass();
        b2.g0 g0Var = o0Var.f3891b.f3803c;
        if (g0Var == null) {
            return n2.n.f17064z;
        }
        synchronized (this.f16203b) {
            try {
                if (!g0Var.equals((b2.g0) this.f16204c)) {
                    this.f16204c = g0Var;
                    this.d = s(g0Var);
                }
                fVar = (n2.f) this.d;
                fVar.getClass();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }

    public View x(int i10) {
        return ((ih.g) this.f16203b).f13141a.getChildAt(E(i10));
    }

    public int y() {
        return ((ih.g) this.f16203b).f13141a.getChildCount() - ((ArrayList) this.d).size();
    }

    public ColorStateList z(int i10) {
        int resourceId;
        ColorStateList a2;
        TypedArray typedArray = (TypedArray) this.f16204c;
        if (typedArray.hasValue(i10) && (resourceId = typedArray.getResourceId(i10, 0)) != 0 && (a2 = q7.a((Context) this.f16203b, resourceId)) != null) {
            return a2;
        }
        return typedArray.getColorStateList(i10);
    }

    public g3(Object obj, Object obj2, Object obj3, int i10) {
        this.f16202a = i10;
        this.f16203b = obj;
        this.f16204c = obj2;
        this.d = obj3;
    }

    public g3(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f16202a = i10;
        this.d = obj;
        this.f16203b = obj2;
        this.f16204c = obj3;
    }

    public g3(String str) {
        this.f16202a = 8;
        g3 g3Var = new g3(7, false);
        this.f16204c = g3Var;
        this.d = g3Var;
        this.f16203b = str;
    }

    public g3(InputStream inputStream, long j10, int i10, nf.h hVar) {
        this.f16202a = 9;
        of.a aVar = new of.a(inputStream, j10, i10);
        this.f16203b = aVar;
        this.d = new k0.b(aVar, 9);
        this.f16204c = hVar;
    }

    public g3(View view) {
        this.f16202a = 15;
        this.d = view;
        m71 m71Var = new m71(this, view);
        this.f16203b = m71Var;
        view.addOnLayoutChangeListener(m71Var);
    }

    public g3(int i10) {
        this.f16202a = i10;
        switch (i10) {
            case 23:
                this.f16203b = new Object();
                this.f16204c = null;
                this.d = null;
                return;
            default:
                this.f16203b = new Object();
                return;
        }
    }

    public g3(ih.g gVar) {
        this.f16202a = 28;
        this.f16203b = gVar;
        this.f16204c = new ad.d(7);
        this.d = new ArrayList();
    }

    @Override
    public void a() {
    }

    @Override
    public void q() {
    }

    public g3(File file) {
        this.f16202a = 21;
        this.f16203b = file;
        this.f16204c = new File(file.getPath() + ".new");
        this.d = new File(file.getPath() + ".bak");
    }

    @Override
    public void b(Editable editable) {
    }

    public g3(Runnable runnable) {
        this.f16202a = 26;
        this.f16204c = new CopyOnWriteArrayList();
        this.d = new HashMap();
        this.f16203b = runnable;
    }

    public g3(Context context, TypedArray typedArray) {
        this.f16202a = 0;
        this.f16203b = context;
        this.f16204c = typedArray;
    }

    public g3(byte[] bArr, j9.y yVar) {
        this.f16202a = 2;
        this.f16203b = bArr;
        this.f16204c = null;
        this.d = yVar;
    }

    public g3(b2.r0 r0Var, j9.y yVar) {
        this.f16202a = 2;
        this.f16203b = r0Var.f3963k;
        this.f16204c = r0Var.f3966n;
        this.d = yVar;
    }

    public g3(k0.b bVar) {
        this.f16202a = 10;
        this.f16202a = 10;
        this.f16203b = bVar;
        this.f16204c = Choreographer.getInstance();
        this.d = new o1.a(this, 0);
    }

    public g3(String str, String str2) {
        this.f16202a = 25;
        this.f16203b = str;
        this.f16204c = str2;
        this.d = str2.isEmpty() ? str : a1.g.C(str, "/", str2);
    }

    public g3(p4.e eVar, android.support.v4.media.session.b0 b0Var) {
        this.f16202a = 20;
        this.d = eVar;
        this.f16203b = b0Var;
    }

    public g3(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.f16202a = 19;
        this.f16204c = arrayDeque;
        this.f16203b = bufferedReader;
    }

    public g3(Object[] objArr, Object[] objArr2) {
        this.f16202a = 14;
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
        this.f16203b = iArr;
        this.f16204c = p(objArr, iArr);
        this.d = p(objArr2, iArr);
    }

    @Override
    public void m(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
