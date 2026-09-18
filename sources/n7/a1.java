package n7;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Trace;
import android.text.Editable;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import ci.sc;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.f3;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Components.bc0;
import org.telegram.ui.Components.bu;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.fo0;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.kf0;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.zt;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.i5;
import org.telegram.ui.k4;
import org.telegram.ui.ky0;
import org.telegram.ui.uw;
import org.telegram.ui.vy;
import org.telegram.ui.w41;
import org.telegram.ui.wy;
import v7.r1;
import w7.pa;
public final class a1 implements f6, fo0, zt, sc, dl0, fh.a, e71, p2.t, r2.k, y2.o, SuccessContinuation {
    public final int f15117a;
    public Object f15118b;
    public Object f15119c;

    public a1(int i10) {
        this.f15117a = i10;
    }

    public static n7.a1 e(android.content.Context r5) {
        throw new UnsupportedOperationException("Method not decompiled: n7.a1.e(android.content.Context):n7.a1");
    }

    public static a1 j(View view) {
        return new a1(view);
    }

    public b2.q0 A(s4.c1 c1Var, int i10) {
        s4.i1 i1Var;
        b2.q0 q0Var;
        a0.f fVar = (a0.f) this.f15118b;
        int c10 = fVar.c(c1Var);
        if (c10 >= 0 && (i1Var = (s4.i1) fVar.h(c10)) != null) {
            int i11 = i1Var.f42756a;
            if ((i11 & i10) != 0) {
                int i12 = i11 & (~i10);
                i1Var.f42756a = i12;
                if (i10 == 4) {
                    q0Var = i1Var.f42757b;
                } else if (i10 == 8) {
                    q0Var = i1Var.f42758c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i12 & 12) == 0) {
                    fVar.f(c10);
                    i1Var.f42756a = 0;
                    i1Var.f42757b = null;
                    i1Var.f42758c = null;
                    s4.i1.d.i(i1Var);
                }
                return q0Var;
            }
        }
        return null;
    }

    @Override
    public y2.o D() {
        return new a1(17, ((p2.t) this.f15118b).D(), (List) this.f15119c);
    }

    public ra.b E() {
        JSONObject jSONObject;
        String str;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(t());
            while (true) {
                int read = fileInputStream.read(bArr, 0, 16384);
                if (read < 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String optString = jSONObject.optString("Fid", null);
        int optInt = jSONObject.optInt("Status", 0);
        String optString2 = jSONObject.optString("AuthToken", null);
        String optString3 = jSONObject.optString("RefreshToken", null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String optString4 = jSONObject.optString("FisError", null);
        int i10 = m1.j.d(5)[optInt];
        if (i10 != 0) {
            if (i10 == 0) {
                str = " registrationStatus";
            } else {
                str = "";
            }
            if (str.isEmpty()) {
                return new ra.b(optString, i10, optString2, optString3, optLong2, optLong, optString4);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
        throw new NullPointerException("Null registrationStatus");
    }

    @Override
    public Paint G(String str) {
        return j6.S0(str);
    }

    @Override
    public int G0(int i10) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.f15118b;
        int indexOfKey = sparseIntArray.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        return j6.w0(null, i10, false);
    }

    @Override
    public void H(float f7, boolean z10) {
        bc0 bc0Var = (bc0) this.f15118b;
        kf0 kf0Var = (kf0) this.f15119c;
        h71 h71Var = kf0Var.d;
        if (h71Var != null) {
            long p5 = h71Var.p();
            float max = 2.8f / ((float) Math.max(60L, p5));
            long j3 = (((f7 / (1.0f - max)) * max) + f7) * ((float) p5);
            kf0Var.e = j3;
            kf0Var.d.L(j3, !z10);
            if (!z10) {
                AndroidUtilities.cancelRunOnUIThread(bc0Var);
                AndroidUtilities.runOnUIThread(bc0Var, 120L);
            }
        }
    }

    public void I() {
        try {
            ((FileLock) this.f15119c).release();
            ((FileChannel) this.f15118b).close();
        } catch (IOException e) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
        }
    }

    public void J(s4.c1 c1Var) {
        s4.i1 i1Var = (s4.i1) ((a0.f) this.f15118b).get(c1Var);
        if (i1Var == null) {
            return;
        }
        i1Var.f42756a &= -2;
    }

    @Override
    public y2.o K(p2.p pVar, p2.m mVar) {
        return new a1(17, ((p2.t) this.f15118b).K(pVar, mVar), (List) this.f15119c);
    }

    public void L(s4.c1 c1Var) {
        a0.f fVar = (a0.f) this.f15118b;
        a0.i iVar = (a0.i) this.f15119c;
        int m10 = iVar.m() - 1;
        while (true) {
            if (m10 < 0) {
                break;
            } else if (c1Var == iVar.n(m10)) {
                Object[] objArr = iVar.f19c;
                Object obj = objArr[m10];
                Object obj2 = a0.j.f20a;
                if (obj != obj2) {
                    objArr[m10] = obj2;
                    iVar.f17a = true;
                }
            } else {
                m10--;
            }
        }
        s4.i1 i1Var = (s4.i1) fVar.get(c1Var);
        if (i1Var != null) {
            fVar.remove(c1Var);
            i1Var.f42756a = 0;
            i1Var.f42757b = null;
            i1Var.f42758c = null;
            s4.i1.d.i(i1Var);
        }
    }

    @Override
    public void X(float f7, boolean z10) {
        ((TextView) this.f15118b).setText("Alpha " + i5.e);
        i5.e = f7;
        ((i5) this.f15119c).f34437b.M();
    }

    @Override
    public boolean a() {
        return j6.I.q();
    }

    @Override
    public boolean mo18c(float f7, float f10, int i10, View view) {
        wy wyVar = (wy) this.f15119c;
        if (view instanceof r2) {
            r2 r2Var = (r2) view;
            if (r2Var.f20734n2) {
                wyVar.N4(r2Var.getDialogId(), view);
                return true;
            }
        }
        uw uwVar = wyVar.f39325z0;
        if (uwVar != null && uwVar.getVisibility() == 0 && wyVar.f39325z0.f25495n) {
            return false;
        }
        return wyVar.o4(view, i10, f7, ((vy) this.f15118b).d);
    }

    public void f(s4.c1 c1Var, b2.q0 q0Var) {
        a0.f fVar = (a0.f) this.f15118b;
        s4.i1 i1Var = (s4.i1) fVar.get(c1Var);
        if (i1Var == null) {
            i1Var = s4.i1.a();
            fVar.put(c1Var, i1Var);
        }
        i1Var.f42758c = q0Var;
        i1Var.f42756a |= 8;
    }

    @Override
    public void g() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((wy) this.f15119c).finishPreviewFragment();
        }
    }

    @Override
    public int g0(int i10) {
        return G0(i10);
    }

    @Override
    public int g1(int i10) {
        return ((SparseIntArray) this.f15118b).get(i10);
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public Drawable getDrawable(String str) {
        return null;
    }

    @Override
    public void i() {
        ((bu) this.f15118b).getText();
        ((f3) this.f15119c).b();
    }

    public void k() {
        String str = (String) this.f15118b;
        try {
            ba.c cVar = (ba.c) this.f15119c;
            cVar.getClass();
            new File(cVar.f3452b, str).createNewFile();
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e);
        }
    }

    @Override
    public ch.d l() {
        return new ch.f(this);
    }

    @Override
    public void m(float f7, float f10, int i10, int i11) {
        j6.q(f7, f10, i10, i11);
    }

    @Override
    public int m0() {
        return 0;
    }

    @Override
    public Object n2(Uri uri, g2.k kVar) {
        t2.a aVar = (t2.a) ((y2.o) this.f15118b).n2(uri, kVar);
        List list = (List) this.f15119c;
        if (list != null && !list.isEmpty()) {
            return (t2.a) aVar.a(list);
        }
        return aVar;
    }

    @Override
    public void onError(h71 h71Var, Exception exc) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f15119c;
        int i10 = secretMediaViewer.f31457b0;
        if (i10 > 0) {
            secretMediaViewer.f31457b0 = i10 - 1;
            AndroidUtilities.runOnUIThread(new ky0(22, this, (File) this.f15118b), 100L);
            return;
        }
        FileLog.e(exc);
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f15119c;
        w41 w41Var = secretMediaViewer.f31474i1;
        if (secretMediaViewer.f31507y != null && secretMediaViewer.f31471h0 != null) {
            AndroidUtilities.cancelRunOnUIThread(w41Var);
            AndroidUtilities.runOnUIThread(w41Var);
            if (i10 != 4 && i10 != 1) {
                try {
                    secretMediaViewer.f31456b.getWindow().addFlags(128);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            } else {
                try {
                    secretMediaViewer.f31456b.getWindow().clearFlags(128);
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
            if (i10 == 3 && secretMediaViewer.f31502w.getVisibility() != 0) {
                secretMediaViewer.f31502w.setVisibility(0);
            }
            if (secretMediaViewer.f31507y.y() && i10 != 4) {
                if (!secretMediaViewer.E) {
                    secretMediaViewer.E = true;
                }
            } else if (secretMediaViewer.E) {
                secretMediaViewer.E = false;
                if (i10 == 4) {
                    secretMediaViewer.H = true;
                    if (secretMediaViewer.I) {
                        secretMediaViewer.e(true, !secretMediaViewer.f31489q1);
                        return;
                    }
                    secretMediaViewer.f31507y.L(0L, false);
                    secretMediaViewer.f31507y.C();
                }
            }
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        float f10;
        k4 k4Var = ((SecretMediaViewer) this.f15119c).f31502w;
        if (k4Var != null) {
            if (i11 == 0) {
                f10 = 1.0f;
            } else {
                f10 = (i10 * f7) / i11;
            }
            k4Var.a(f10, 0);
        }
    }

    @Override
    public r2.c v(com.google.firebase.messaging.n nVar) {
        MediaCodec mediaCodec;
        int i10;
        String str = ((r2.o) nVar.f7336a).f41990a;
        r2.c cVar = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                r2.c cVar2 = new r2.c(mediaCodec, (HandlerThread) ((r2.b) this.f15118b).get(), new r2.e(mediaCodec, (HandlerThread) ((r2.b) this.f15119c).get()), (r2.j) nVar.f7339f);
                try {
                    Trace.endSection();
                    Surface surface = (Surface) nVar.d;
                    if (surface == null && ((r2.o) nVar.f7336a).h && Build.VERSION.SDK_INT >= 35) {
                        i10 = 8;
                    } else {
                        i10 = 0;
                    }
                    r2.c.l(cVar2, (MediaFormat) nVar.f7337b, surface, (MediaCrypto) nVar.e, i10);
                    return cVar2;
                } catch (Exception e) {
                    e = e;
                    cVar = cVar2;
                    if (cVar == null) {
                        if (mediaCodec != null) {
                            mediaCodec.release();
                        }
                    } else {
                        cVar.release();
                    }
                    throw e;
                }
            } catch (Exception e7) {
                e = e7;
            }
        } catch (Exception e10) {
            e = e10;
            mediaCodec = null;
        }
    }

    @Override
    public boolean p0() {
        return false;
    }

    @Override
    public void q(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((wy) this.f15119c).movePreviewFragment(f7);
        }
    }

    public void r(String str, PrintWriter printWriter) {
        boolean z10;
        w1.b bVar = (w1.b) this.f15119c;
        if (bVar.d.f33c > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            int i10 = 0;
            while (true) {
                a0.n nVar = bVar.d;
                if (i10 < nVar.f33c) {
                    w1.a aVar = (w1.a) nVar.f32b[i10];
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(bVar.d.f31a[i10]);
                    printWriter.print(": ");
                    printWriter.println(aVar.toString());
                    printWriter.print(str2);
                    printWriter.print("mId=");
                    printWriter.print(0);
                    printWriter.print(" mArgs=");
                    Object obj = null;
                    printWriter.println((Object) null);
                    printWriter.print(str2);
                    printWriter.print("mLoader=");
                    printWriter.println(aVar.f44499l);
                    a6.d dVar = aVar.f44499l;
                    String str3 = str2 + "  ";
                    dVar.getClass();
                    printWriter.print(str3);
                    printWriter.print("mId=");
                    printWriter.print(0);
                    printWriter.print(" mListener=");
                    printWriter.println(dVar.f290a);
                    if (dVar.f291b || dVar.e) {
                        printWriter.print(str3);
                        printWriter.print("mStarted=");
                        printWriter.print(dVar.f291b);
                        printWriter.print(" mContentChanged=");
                        printWriter.print(dVar.e);
                        printWriter.print(" mProcessingChange=");
                        printWriter.println(false);
                    }
                    if (dVar.f292c || dVar.d) {
                        printWriter.print(str3);
                        printWriter.print("mAbandoned=");
                        printWriter.print(dVar.f292c);
                        printWriter.print(" mReset=");
                        printWriter.println(dVar.d);
                    }
                    if (dVar.f294g != null) {
                        printWriter.print(str3);
                        printWriter.print("mTask=");
                        printWriter.print(dVar.f294g);
                        printWriter.print(" waiting=");
                        dVar.f294g.getClass();
                        printWriter.println(false);
                    }
                    if (dVar.h != null) {
                        printWriter.print(str3);
                        printWriter.print("mCancellingTask=");
                        printWriter.print(dVar.h);
                        printWriter.print(" waiting=");
                        dVar.h.getClass();
                        printWriter.println(false);
                    }
                    if (aVar.f44501n != null) {
                        printWriter.print(str2);
                        printWriter.print("mCallbacks=");
                        printWriter.println(aVar.f44501n);
                        b2.p pVar = aVar.f44501n;
                        pVar.getClass();
                        printWriter.print(str2 + "  ");
                        printWriter.print("mDeliveredData=");
                        printWriter.println(pVar.f3176b);
                    }
                    printWriter.print(str2);
                    printWriter.print("mData=");
                    a6.d dVar2 = aVar.f44499l;
                    Object obj2 = aVar.e;
                    if (obj2 != androidx.lifecycle.z.f2616k) {
                        obj = obj2;
                    }
                    dVar2.getClass();
                    StringBuilder sb2 = new StringBuilder(64);
                    if (obj == null) {
                        sb2.append("null");
                    } else {
                        Class<?> cls = obj.getClass();
                        sb2.append(cls.getSimpleName());
                        sb2.append("{");
                        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
                        sb2.append("}");
                    }
                    printWriter.println(sb2.toString());
                    printWriter.print(str2);
                    printWriter.print("mStarted=");
                    if (aVar.f2619c > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    printWriter.println(z10);
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public File t() {
        if (((File) this.f15118b) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f15118b) == null) {
                        k9.h hVar = (k9.h) this.f15119c;
                        hVar.a();
                        File filesDir = hVar.f13549a.getFilesDir();
                        this.f15118b = new File(filesDir, "PersistedInstallation." + ((k9.h) this.f15119c).d() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.f15118b;
    }

    @Override
    public Task then(Object obj) {
        da.a aVar = (da.a) obj;
        u4.g gVar = (u4.g) this.f15119c;
        if (aVar == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return Tasks.forResult(null);
        }
        o0.a aVar2 = (o0.a) gVar.f43648c;
        w9.m.b((w9.m) ((o0.a) gVar.f43648c).f15311c);
        ((w9.m) aVar2.f15311c).f44973m.y((Executor) this.f15118b, null);
        ((w9.m) aVar2.f15311c).f44977q.trySetResult(null);
        return Tasks.forResult(null);
    }

    public String toString() {
        switch (this.f15117a) {
            case 21:
                StringBuilder sb2 = new StringBuilder(128);
                sb2.append("LoaderManager{");
                sb2.append(Integer.toHexString(System.identityHashCode(this)));
                sb2.append(" in ");
                Class<?> cls = ((androidx.lifecycle.t) this.f15118b).getClass();
                sb2.append(cls.getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(cls)));
                sb2.append("}}");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    @Override
    public ColorFilter x() {
        return j6.f19190v3;
    }

    @Override
    public void y(Canvas canvas, float f7, float f10, float f11, float f12) {
        Paint paint = (Paint) this.f15118b;
        PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f15119c;
        rg.z0 z0Var = premiumPreviewFragment.m0;
        if (premiumPreviewFragment.f31183h0) {
            paint.setColor(premiumPreviewFragment.getThemedColor(j6.f18807a7));
            canvas.drawRect(f7, f10, f11, f12, paint);
            return;
        }
        z0Var.d(0, (-premiumPreviewFragment.f31178d0.getMeasuredWidth()) * 0.1f * premiumPreviewFragment.f31175b0, 0, premiumPreviewFragment.f31178d0.getMeasuredWidth(), 0.0f, premiumPreviewFragment.f31178d0.getMeasuredHeight());
        canvas.drawRect(f7, f10, f11, f12, z0Var.f42583f);
    }

    public void z(ra.b bVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", bVar.f42209a);
            jSONObject.put("Status", m1.j.c(bVar.f42210b));
            jSONObject.put("AuthToken", bVar.f42211c);
            jSONObject.put("RefreshToken", bVar.d);
            jSONObject.put("TokenCreationEpochInSecs", bVar.f42212f);
            jSONObject.put("ExpiresInSecs", bVar.e);
            jSONObject.put("FisError", bVar.f42213g);
            k9.h hVar = (k9.h) this.f15119c;
            hVar.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", hVar.f13549a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!createTempFile.renameTo(t())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public a1(int i10, Object obj, Object obj2) {
        this.f15117a = i10;
        this.f15118b = obj;
        this.f15119c = obj2;
    }

    @Override
    public void onRenderedFirstFrame() {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f15119c;
        if (secretMediaViewer.f31460c0) {
            return;
        }
        secretMediaViewer.f31460c0 = true;
        secretMediaViewer.e.invalidate();
    }

    public a1(Object obj, Object obj2, boolean z10, int i10) {
        this.f15117a = i10;
        this.f15119c = obj;
        this.f15118b = obj2;
    }

    public a1(r1 r1Var) {
        this.f15117a = 22;
        this.f15119c = new Object();
        this.f15118b = r1Var;
        pa.b();
    }

    public a1(Context context) {
        this.f15117a = 18;
        this.f15118b = context;
        this.f15119c = null;
    }

    public a1() {
        this.f15117a = 16;
        this.f15118b = new a0.m(0);
        this.f15119c = new a0.i();
    }

    public a1(View view) {
        this.f15117a = 5;
        s61 s61Var = new s61(this, view);
        this.f15118b = s61Var;
        view.addOnLayoutChangeListener(s61Var);
    }

    public a1(androidx.lifecycle.t tVar, androidx.lifecycle.t0 t0Var) {
        this.f15117a = 21;
        this.f15118b = tVar;
        this.f15119c = (w1.b) new aa.a(t0Var, w1.b.f44502f).m(w1.b.class);
    }

    public a1(kf0 kf0Var) {
        this.f15117a = 4;
        this.f15119c = kf0Var;
        this.f15118b = new bc0(this, 9);
    }

    public a1(k9.h hVar) {
        this.f15117a = 15;
        this.f15119c = hVar;
    }

    @Override
    public void B() {
    }

    @Override
    public void d() {
    }

    @Override
    public void f0() {
    }

    @Override
    public void s() {
    }

    public a1(String str, String str2) {
        this.f15117a = 19;
        this.f15118b = str;
        this.f15119c = str2;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("userId should not be empty");
        }
    }

    @Override
    public void F(float f7) {
    }

    @Override
    public void O(long j3) {
    }

    @Override
    public void Q(boolean z10) {
    }

    @Override
    public void V(float f7) {
    }

    @Override
    public void Z(float f7) {
    }

    @Override
    public void b(int i10) {
    }

    @Override
    public void e0(float f7) {
    }

    @Override
    public void h(float f7) {
    }

    @Override
    public void i0(float f7) {
    }

    @Override
    public void n(float f7) {
    }

    @Override
    public void o0(long j3) {
    }

    @Override
    public void onSeekFinished(j2.a aVar) {
    }

    @Override
    public void onSeekStarted(j2.a aVar) {
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override
    public void u(float f7) {
    }

    @Override
    public void w(boolean z10) {
    }

    public a1(EditText editText) {
        this.f15117a = 12;
        this.f15118b = editText;
        q1.i iVar = new q1.i(editText);
        this.f15119c = iVar;
        editText.addTextChangedListener(iVar);
        if (q1.a.f41105b == null) {
            synchronized (q1.a.f41104a) {
                try {
                    if (q1.a.f41105b == null) {
                        ?? factory = new Editable.Factory();
                        try {
                            q1.a.f41106c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, q1.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        q1.a.f41105b = factory;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(q1.a.f41105b);
    }

    @Override
    public void C(float f7, int i10) {
    }

    @Override
    public void L0(int i10, int i11) {
    }

    @Override
    public void T(float f7, int i10) {
    }

    @Override
    public void d0(float f7, int i10) {
    }

    @Override
    public void j0(int i10, long j3) {
    }

    @Override
    public void o(long j3, boolean z10) {
    }

    public a1(PremiumPreviewFragment premiumPreviewFragment) {
        this.f15117a = 8;
        this.f15119c = premiumPreviewFragment;
        this.f15118b = new Paint();
    }
}
