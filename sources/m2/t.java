package m2;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ClipDescription;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.RectF;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.PersistableBundle;
import android.support.v4.media.session.v;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import b2.c0;
import bi.q3;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import e9.k0;
import e9.m0;
import e9.o1;
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
import k2.g0;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.jz0;
import org.telegram.ui.Components.ok;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.vy0;
import org.telegram.ui.ar0;
import org.telegram.ui.co;
import r0.i0;
import s4.c1;
import s4.h0;
import s4.y;
import v7.x7;
import w7.f6;
public class t implements ek0, ar0, n5.b, t0.i, ja.a {
    public final int f15843a;
    public Object f15844b;
    public Object f15845c;
    public Object d;

    public t(int i10, boolean z10) {
        this.f15843a = i10;
    }

    public static void N(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e("AtomicFile", "Failed to delete file which is a directory " + file2);
        }
        if (!file.renameTo(file2)) {
            Log.e("AtomicFile", "Failed to rename " + file + " to " + file2);
        }
    }

    public static Object[] r(Object[] objArr, int[] iArr) {
        int length = objArr.length;
        Class<?> componentType = objArr.getClass().getComponentType();
        vy0 vy0Var = jz0.R;
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

    public static n2.e s(c0 c0Var) {
        String uri;
        boolean z10;
        boolean z11;
        g2.o oVar = new g2.o();
        byte[] bArr = null;
        oVar.f10374c = null;
        Uri uri2 = c0Var.f2012b;
        if (uri2 == null) {
            uri = null;
        } else {
            uri = uri2.toString();
        }
        boolean z12 = c0Var.f2015f;
        ?? obj = new Object();
        if (z12 && TextUtils.isEmpty(uri)) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.b(z10);
        obj.f6399b = oVar;
        obj.f6400c = uri;
        obj.f6398a = z12;
        obj.d = new HashMap();
        k0 k0Var = c0Var.f2013c;
        m0 m0Var = k0Var.f8994a;
        if (m0Var == null) {
            m0Var = k0Var.b();
            k0Var.f8994a = m0Var;
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
        UUID uuid = b2.i.f2087a;
        rb.a aVar = new rb.a(26);
        UUID uuid2 = c0Var.f2011a;
        uuid2.getClass();
        boolean z13 = c0Var.d;
        boolean z14 = c0Var.f2014e;
        int[] f7 = x7.f(c0Var.f2016g);
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
        e2.d.g(eVar.f16418w.isEmpty());
        eVar.K = bArr;
        return eVar;
    }

    public ByteBuffer A() {
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
        return (ByteBuffer) this.f15845c;
    }

    @Override
    public void B(android.view.View r13, ah.j1 r14, boolean r15, boolean r16) {
        throw new UnsupportedOperationException("Method not decompiled: m2.t.B(android.view.View, ah.j1, boolean, boolean):void");
    }

    public int C(int i10) {
        e6.n nVar = (e6.n) this.d;
        if (i10 < 0) {
            return -1;
        }
        int childCount = ((RecyclerView) ((l.d) this.f15845c).f15098b).getChildCount();
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

    public View D(int i10) {
        return ((RecyclerView) ((l.d) this.f15845c).f15098b).getChildAt(i10);
    }

    public int E() {
        return ((RecyclerView) ((l.d) this.f15845c).f15098b).getChildCount();
    }

    public boolean F() {
        String trim;
        ArrayDeque arrayDeque = (ArrayDeque) this.f15845c;
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
            String readLine = ((BufferedReader) this.f15844b).readLine();
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

    public void G(View view) {
        ((ArrayList) this.f15844b).add(view);
        l.d dVar = (l.d) this.f15845c;
        c1 U = RecyclerView.U(view);
        if (U != null) {
            View view2 = U.f45766a;
            RecyclerView recyclerView = (RecyclerView) dVar.f15098b;
            int i10 = U.f45782s;
            if (i10 != -1) {
                U.f45781r = i10;
            } else {
                WeakHashMap weakHashMap = i0.f44725a;
                U.f45781r = view2.getImportantForAccessibility();
            }
            if (recyclerView.b0()) {
                U.f45782s = 4;
                recyclerView.J0.add(U);
                return;
            }
            WeakHashMap weakHashMap2 = i0.f44725a;
            view2.setImportantForAccessibility(4);
        }
    }

    public void H(g2.h r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, u2.u0 r15) {
        throw new UnsupportedOperationException("Method not decompiled: m2.t.H(g2.h, android.net.Uri, java.util.Map, long, long, u2.u0):void");
    }

    public String K() {
        if (F()) {
            String str = (String) this.d;
            this.d = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    public void L() {
        int i10;
        RecyclerView recyclerView = (RecyclerView) ((l.d) this.f15845c).f15098b;
        ((e6.n) this.d).G();
        ArrayList arrayList = (ArrayList) this.f15844b;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            c1 U = RecyclerView.U((View) arrayList.get(size));
            if (U != null) {
                int i11 = U.f45781r;
                if (recyclerView.b0()) {
                    U.f45782s = i11;
                    recyclerView.J0.add(U);
                } else {
                    View view = U.f45766a;
                    WeakHashMap weakHashMap = i0.f44725a;
                    view.setImportantForAccessibility(i11);
                }
                U.f45781r = 0;
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

    public void M(pf.g gVar) {
        if (((pf.d) this.f15844b) != null) {
            for (int i10 = 0; i10 < gVar.f44097a.size(); i10++) {
                pf.d dVar = (pf.d) this.f15844b;
                dVar.h.remove(gVar.a(i10).d);
                dVar.h();
            }
        }
    }

    public void O(l5.i iVar, int i10, boolean z10) {
        Long l4;
        char c10;
        r5.a aVar = (r5.a) this.d;
        Context context = (Context) this.f15844b;
        ComponentName componentName = new ComponentName(context, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = iVar.f15310a;
        String str2 = iVar.f15310a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        i5.d dVar = iVar.f15312c;
        adler32.update(allocate.putInt(v5.a.a(dVar)).array());
        byte[] bArr = iVar.f15311b;
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
                        f6.a(iVar, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                        return;
                    }
                }
            }
        }
        Cursor rawQuery = ((s5.g) ((s5.d) this.f15845c)).a().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str2, String.valueOf(v5.a.a(dVar))});
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
            Set set = ((r5.b) aVar.f44942b.get(dVar)).f44945c;
            if (set.contains(r5.c.f44946a)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(r5.c.f44948c)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(r5.c.f44947b)) {
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
            String c11 = f6.c("JobInfoScheduler");
            if (Log.isLoggable(c11, 3)) {
                Log.d(c11, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th2) {
            rawQuery.close();
            throw th2;
        }
    }

    public void P(pf.a aVar) {
        pf.g gVar;
        pf.g gVar2 = (pf.g) this.f15845c;
        if (gVar2 != null && ((pf.a) this.d) == null && aVar != null) {
            l(gVar2);
        }
        if (((pf.a) this.d) != null && (gVar = (pf.g) this.f15845c) != null && aVar == null) {
            M(gVar);
        }
        pf.a aVar2 = (pf.a) this.d;
        if (aVar2 != null) {
            e6.h hVar = aVar2.f44066a;
            n6.l.e("Must be called from the main thread.");
            hVar.f8910i.remove(aVar2);
        }
        if (aVar != null) {
            aVar.f44066a.p(aVar);
            pf.g gVar3 = (pf.g) this.f15845c;
            if (gVar3 != null) {
                aVar.d = gVar3;
                aVar.f44071g = 0;
                aVar.h = 0;
                aVar.p();
            }
        }
        this.d = aVar;
    }

    public FileOutputStream Q() {
        File file = (File) this.f15845c;
        File file2 = (File) this.d;
        if (file2.exists()) {
            N(file2, (File) this.f15844b);
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

    public void R(View view) {
        if (((ArrayList) this.f15844b).remove(view)) {
            l.d dVar = (l.d) this.f15845c;
            c1 U = RecyclerView.U(view);
            if (U != null) {
                RecyclerView recyclerView = (RecyclerView) dVar.f15098b;
                int i10 = U.f45781r;
                if (recyclerView.b0()) {
                    U.f45782s = i10;
                    recyclerView.J0.add(U);
                } else {
                    View view2 = U.f45766a;
                    WeakHashMap weakHashMap = i0.f44725a;
                    view2.setImportantForAccessibility(i10);
                }
                U.f45781r = 0;
            }
        }
    }

    @Override
    public boolean S() {
        return false;
    }

    public void T(Object obj, String str) {
        t tVar = new t(6, false);
        ((t) this.d).d = tVar;
        this.d = tVar;
        tVar.f15845c = obj;
        tVar.f15844b = str;
    }

    @Override
    public Uri c() {
        return (Uri) this.f15844b;
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
        return new t((Context) ((fd.a) this.f15844b).mo28get(), (s5.d) ((fd.a) this.f15845c).mo28get(), (r5.a) ((rb.a) this.d).mo28get(), 22);
    }

    @Override
    public ClipDescription getDescription() {
        return (ClipDescription) this.f15845c;
    }

    @Override
    public void h(int i10, boolean z10, boolean z11) {
        String str;
        if (!z10) {
            ok okVar = (ok) this.d;
            HashMap hashMap = (HashMap) this.f15845c;
            ArrayList arrayList = (ArrayList) this.f15844b;
            vi viVar = okVar.f28780b;
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
                e5.a0(viVar.J1, viVar.j1() + arrayList2.size(), viVar.n1(), new q3(i10, 1, okVar, arrayList2, z11));
            }
        }
    }

    @Override
    public Object i() {
        return null;
    }

    @Override
    public ja.a j(Class cls, ia.d dVar) {
        ((HashMap) this.f15844b).put(cls, dVar);
        ((HashMap) this.f15845c).remove(cls);
        return this;
    }

    public void l(pf.g gVar) {
        if (((pf.d) this.f15844b) == null) {
            this.f15844b = new pf.d();
        }
        for (int i10 = 0; i10 < gVar.f44097a.size(); i10++) {
            pf.d dVar = (pf.d) this.f15844b;
            pf.f a2 = gVar.a(i10);
            dVar.h.put(a2.d, a2);
            dVar.h();
        }
    }

    public void m(View view, int i10, boolean z10) {
        int C;
        RecyclerView recyclerView = (RecyclerView) ((l.d) this.f15845c).f15098b;
        if (i10 < 0) {
            C = recyclerView.getChildCount();
        } else {
            C = C(i10);
        }
        ((e6.n) this.d).E(C, z10);
        if (z10) {
            G(view);
        }
        recyclerView.addView(view, C);
        c1 U = RecyclerView.U(view);
        recyclerView.f0(view);
        h0 h0Var = recyclerView.f1921w;
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

    @Override
    public boolean n() {
        return true;
    }

    public void o(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        int C;
        RecyclerView recyclerView = (RecyclerView) ((l.d) this.f15845c).f15098b;
        if (i10 < 0) {
            C = recyclerView.getChildCount();
        } else {
            C = C(i10);
        }
        ((e6.n) this.d).E(C, z10);
        if (z10) {
            G(view);
        }
        c1 U = RecyclerView.U(view);
        if (U != null) {
            if (!U.l() && !U.r()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + U + recyclerView.C());
            }
            U.f45775l &= -257;
        }
        RecyclerView.b(recyclerView, view, C, layoutParams);
    }

    public String p(int i10, String str, long j3, long j10) {
        ArrayList arrayList = (ArrayList) this.f15844b;
        ArrayList arrayList2 = (ArrayList) this.d;
        ArrayList arrayList3 = (ArrayList) this.f15845c;
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

    public void q() {
        android.support.v4.media.session.c0 c0Var = (android.support.v4.media.session.c0) this.f15844b;
        if (c0Var != null) {
            int i10 = ((p4.e) this.d).f43843n.d;
            v vVar = c0Var.f819a;
            vVar.getClass();
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(i10);
            vVar.f842a.setPlaybackToLocal(builder.build());
            this.f15845c = null;
        }
    }

    @Override
    public boolean t() {
        return false;
    }

    public String toString() {
        String str = "";
        switch (this.f15843a) {
            case 3:
                StringBuilder sb2 = new StringBuilder("id3v2tag[pos=");
                nf.a aVar = (nf.a) this.f15844b;
                sb2.append(aVar.f6374b);
                sb2.append(", ");
                sb2.append(aVar.e());
                sb2.append(" left]");
                return sb2.toString();
            case 7:
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append((String) this.f15844b);
                sb3.append('{');
                t tVar = (t) ((t) this.f15845c).d;
                while (tVar != null) {
                    Object obj = tVar.f15845c;
                    sb3.append(str);
                    String str2 = (String) tVar.f15844b;
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
                    tVar = (t) tVar.d;
                    str = ", ";
                }
                sb3.append('}');
                return sb3.toString();
            case 23:
                return ((e6.n) this.d).toString() + ", hidden list:" + ((ArrayList) this.f15844b).size();
            case 29:
                StringBuilder sb4 = new StringBuilder(32);
                sb4.append((String) this.f15844b);
                sb4.append('{');
                t tVar2 = (t) ((t) this.f15845c).d;
                while (tVar2 != null) {
                    Object obj2 = tVar2.f15845c;
                    sb4.append(str);
                    String str3 = (String) tVar2.f15844b;
                    if (str3 != null) {
                        sb4.append(str3);
                        sb4.append('=');
                    }
                    if (obj2 != null && obj2.getClass().isArray()) {
                        String deepToString2 = Arrays.deepToString(new Object[]{obj2});
                        sb4.append((CharSequence) deepToString2, 1, deepToString2.length() - 1);
                    } else {
                        sb4.append(obj2);
                    }
                    tVar2 = (t) tVar2.d;
                    str = ", ";
                }
                sb4.append('}');
                return sb4.toString();
            default:
                return super.toString();
        }
    }

    public void u(int i10) {
        c1 U;
        int C = C(i10);
        ((e6.n) this.d).F(C);
        RecyclerView recyclerView = (RecyclerView) ((l.d) this.f15845c).f15098b;
        View childAt = recyclerView.getChildAt(C);
        if (childAt != null && (U = RecyclerView.U(childAt)) != null) {
            if (U.l() && !U.r()) {
                throw new IllegalArgumentException("called detach on an already detached child " + U + recyclerView.C());
            }
            U.a(256);
        }
        RecyclerView.c(recyclerView, C);
    }

    public mf.e v(mf.f fVar) {
        InflaterInputStream inflaterInputStream;
        int i10 = fVar.f16238c;
        InputStream inputStream = (nf.a) this.f15844b;
        if (fVar.d) {
            l.d dVar = (l.d) this.d;
            dVar.getClass();
            byte[] bArr = new byte[i10];
            int i11 = 0;
            while (i11 < i10) {
                int read = ((com.google.firebase.messaging.d) dVar.f15098b).read(bArr, i11, i10 - i11);
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
        if (!fVar.f16240f) {
            if (fVar.f16239e) {
                i10 = fVar.f16241g;
                inflaterInputStream = new InflaterInputStream(inputStream);
            } else {
                inflaterInputStream = inputStream;
            }
            return new mf.e(inflaterInputStream, fVar.f16237b, i10, (mf.h) this.f15845c, fVar);
        }
        throw new Exception("Frame encryption is not supported");
    }

    public n2.m w(b2.k0 k0Var) {
        n2.e eVar;
        k0Var.f2154b.getClass();
        c0 c0Var = k0Var.f2154b.f2061c;
        if (c0Var == null) {
            return n2.m.f16431z;
        }
        synchronized (this.f15844b) {
            try {
                if (!c0Var.equals((c0) this.f15845c)) {
                    this.f15845c = c0Var;
                    this.d = s(c0Var);
                }
                eVar = (n2.e) this.d;
                eVar.getClass();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
    }

    public View x(int i10) {
        return ((RecyclerView) ((l.d) this.f15845c).f15098b).getChildAt(C(i10));
    }

    public int y() {
        return ((RecyclerView) ((l.d) this.f15845c).f15098b).getChildCount() - ((ArrayList) this.f15844b).size();
    }

    public long z() {
        c3.l lVar = (c3.l) this.d;
        if (lVar != null) {
            return lVar.d;
        }
        return -1L;
    }

    public t(Object obj, Object obj2, Object obj3, int i10) {
        this.f15843a = i10;
        this.f15844b = obj;
        this.f15845c = obj2;
        this.d = obj3;
    }

    public t(String str, int i10) {
        this.f15843a = i10;
        switch (i10) {
            case 29:
                t tVar = new t(28, false);
                this.f15845c = tVar;
                this.d = tVar;
                this.f15844b = str;
                return;
            default:
                t tVar2 = new t(6, false);
                this.f15845c = tVar2;
                this.d = tVar2;
                this.f15844b = str;
                return;
        }
    }

    public t(InputStream inputStream, long j3, int i10, mf.h hVar) {
        this.f15843a = 3;
        nf.a aVar = new nf.a(inputStream, j3, i10);
        this.f15844b = aVar;
        this.d = new l.d(aVar, 4);
        this.f15845c = hVar;
    }

    public t(String str, Boolean bool, uc.a aVar, String str2) {
        this.f15843a = 26;
        this.f15844b = str;
        this.f15845c = str2;
        this.d = aVar;
    }

    public t(int i10) {
        this.f15843a = i10;
        switch (i10) {
            case 20:
                this.f15844b = new Object();
                this.f15845c = null;
                this.d = null;
                return;
            case 27:
                this.f15844b = new HashMap();
                this.f15845c = new HashMap();
                this.d = v7.i.f47497c;
                return;
            default:
                this.f15844b = new Object();
                return;
        }
    }

    @Override
    public void J() {
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

    public t(l.d dVar) {
        this.f15843a = 23;
        this.f15845c = dVar;
        this.d = new e6.n(6);
        this.f15844b = new ArrayList();
    }

    @Override
    public void b(Editable editable) {
    }

    public t(File file) {
        this.f15843a = 18;
        this.f15844b = file;
        this.f15845c = new File(file.getPath() + ".new");
        this.d = new File(file.getPath() + ".bak");
    }

    public t(c3.r rVar) {
        this.f15843a = 25;
        this.f15844b = rVar;
    }

    public t(Runnable runnable) {
        this.f15843a = 21;
        this.f15845c = new CopyOnWriteArrayList();
        this.d = new HashMap();
        this.f15844b = runnable;
    }

    public t(byte[] bArr, w wVar) {
        this.f15843a = 1;
        this.f15844b = bArr;
        this.f15845c = null;
        this.d = wVar;
    }

    public t(Uri uri, w wVar) {
        this.f15843a = 1;
        this.f15844b = null;
        this.f15845c = uri;
        this.d = wVar;
    }

    public t(g0 g0Var) {
        this.f15843a = 8;
        this.f15843a = 8;
        this.f15844b = g0Var;
        this.f15845c = Choreographer.getInstance();
        this.d = new o1.a(this, 0);
    }

    public t(ok okVar, HashMap hashMap, ArrayList arrayList) {
        this.f15843a = 11;
        this.d = okVar;
        this.f15845c = hashMap;
        this.f15844b = arrayList;
    }

    public t(p4.e eVar, android.support.v4.media.session.c0 c0Var) {
        this.f15843a = 16;
        this.d = eVar;
        this.f15844b = c0Var;
    }

    public t(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.f15843a = 15;
        this.f15845c = arrayDeque;
        this.f15844b = bufferedReader;
    }

    public t(Object[] objArr, Object[] objArr2) {
        this.f15843a = 12;
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
        this.f15844b = iArr;
        this.f15845c = r(objArr, iArr);
        this.d = r(objArr2, iArr);
    }

    public t(co coVar, MessageObject messageObject, fk0 fk0Var) {
        this.f15843a = 10;
        this.d = coVar;
        this.f15844b = messageObject;
        this.f15845c = fk0Var;
    }

    @Override
    public void I(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
