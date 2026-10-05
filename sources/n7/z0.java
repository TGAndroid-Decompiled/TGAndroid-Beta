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
import ci.oc;
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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.g3;
import org.telegram.ui.Cells.s2;
import org.telegram.ui.Components.b81;
import org.telegram.ui.Components.cu;
import org.telegram.ui.Components.e81;
import org.telegram.ui.Components.eu;
import org.telegram.ui.Components.lc0;
import org.telegram.ui.Components.pl0;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.wf0;
import org.telegram.ui.Components.yo0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.j5;
import org.telegram.ui.ky;
import org.telegram.ui.l4;
import org.telegram.ui.o41;
import org.telegram.ui.ty;
import org.telegram.ui.uy;
import org.telegram.ui.wx0;
import w7.pa;
public final class z0 implements d6, yo0, cu, oc, pl0, fh.a, b81, p2.s, r2.k, y2.n, SuccessContinuation {
    public final int f16855a;
    public Object f16856b;
    public Object f16857c;

    public z0(int i10) {
        this.f16855a = i10;
    }

    public static n7.z0 e(android.content.Context r5) {
        throw new UnsupportedOperationException("Method not decompiled: n7.z0.e(android.content.Context):n7.z0");
    }

    public static z0 n(View view) {
        return new z0(view);
    }

    public void D(s4.c1 c1Var) {
        s4.i1 i1Var = (s4.i1) ((a0.f) this.f16856b).get(c1Var);
        if (i1Var == null) {
            return;
        }
        i1Var.f46600a &= -2;
    }

    public void E(s4.c1 c1Var) {
        a0.f fVar = (a0.f) this.f16856b;
        a0.i iVar = (a0.i) this.f16857c;
        int m10 = iVar.m() - 1;
        while (true) {
            if (m10 < 0) {
                break;
            } else if (c1Var == iVar.n(m10)) {
                Object[] objArr = iVar.f21c;
                Object obj = objArr[m10];
                Object obj2 = a0.j.f22a;
                if (obj != obj2) {
                    objArr[m10] = obj2;
                    iVar.f19a = true;
                }
            } else {
                m10--;
            }
        }
        s4.i1 i1Var = (s4.i1) fVar.get(c1Var);
        if (i1Var != null) {
            fVar.remove(c1Var);
            i1Var.f46600a = 0;
            i1Var.f46601b = null;
            i1Var.f46602c = null;
            s4.i1.d.i(i1Var);
        }
    }

    @Override
    public Paint H(String str) {
        return i6.S0(str);
    }

    @Override
    public int H0(int i10) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.f16856b;
        int indexOfKey = sparseIntArray.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        return i6.w0(null, i10, false);
    }

    @Override
    public y2.n K() {
        return new z0(17, ((p2.s) this.f16856b).K(), (List) this.f16857c);
    }

    @Override
    public void O(float f7, boolean z10) {
        lc0 lc0Var = (lc0) this.f16856b;
        wf0 wf0Var = (wf0) this.f16857c;
        e81 e81Var = wf0Var.d;
        if (e81Var != null) {
            long p5 = e81Var.p();
            float max = 2.8f / ((float) Math.max(60L, p5));
            long j3 = (((f7 / (1.0f - max)) * max) + f7) * ((float) p5);
            wf0Var.f32616e = j3;
            wf0Var.d.L(j3, !z10);
            if (!z10) {
                AndroidUtilities.cancelRunOnUIThread(lc0Var);
                AndroidUtilities.runOnUIThread(lc0Var, 120L);
            }
        }
    }

    @Override
    public y2.n V(p2.o oVar, p2.l lVar) {
        return new z0(17, ((p2.s) this.f16856b).V(oVar, lVar), (List) this.f16857c);
    }

    @Override
    public void Y(float f7, boolean z10) {
        ((TextView) this.f16856b).setText("Alpha " + j5.f37572e);
        j5.f37572e = f7;
        ((j5) this.f16857c).f37573b.M();
    }

    @Override
    public boolean a() {
        return i6.I.q();
    }

    @Override
    public ch.d b() {
        return new ch.f(this);
    }

    @Override
    public boolean mo18c(float f7, float f10, int i10, View view) {
        uy uyVar = (uy) this.f16857c;
        if (view instanceof s2) {
            s2 s2Var = (s2) view;
            if (s2Var.f22841n2) {
                uyVar.W4(s2Var.getDialogId(), view);
                return true;
            }
        }
        ky kyVar = uyVar.f41538z0;
        if (kyVar != null && kyVar.getVisibility() == 0 && uyVar.f41538z0.f28891n) {
            return false;
        }
        return uyVar.x4(view, i10, f7, ((ty) this.f16856b).d);
    }

    public void g(s4.c1 c1Var, b2.q0 q0Var) {
        a0.f fVar = (a0.f) this.f16856b;
        s4.i1 i1Var = (s4.i1) fVar.get(c1Var);
        if (i1Var == null) {
            i1Var = s4.i1.a();
            fVar.put(c1Var, i1Var);
        }
        i1Var.f46602c = q0Var;
        i1Var.f46600a |= 8;
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
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((uy) this.f16857c).finishPreviewFragment();
        }
    }

    @Override
    public void j() {
        ((eu) this.f16856b).getText();
        ((g3) this.f16857c).b();
    }

    @Override
    public int j0(int i10) {
        return H0(i10);
    }

    @Override
    public int j1(int i10) {
        return ((SparseIntArray) this.f16856b).get(i10);
    }

    @Override
    public void m(float f7, float f10, int i10, int i11) {
        i6.q(f7, f10, i10, i11);
    }

    @Override
    public Object n2(Uri uri, g2.k kVar) {
        t2.a aVar = (t2.a) ((y2.n) this.f16856b).n2(uri, kVar);
        List list = (List) this.f16857c;
        if (list != null && !list.isEmpty()) {
            return (t2.a) aVar.a(list);
        }
        return aVar;
    }

    public void o() {
        String str = (String) this.f16856b;
        try {
            ba.c cVar = (ba.c) this.f16857c;
            cVar.getClass();
            new File(cVar.f3721b, str).createNewFile();
        } catch (IOException e7) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e7);
        }
    }

    @Override
    public void onError(e81 e81Var, Exception exc) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f16857c;
        int i10 = secretMediaViewer.f34426b0;
        if (i10 > 0) {
            secretMediaViewer.f34426b0 = i10 - 1;
            AndroidUtilities.runOnUIThread(new wx0(25, this, (File) this.f16856b), 100L);
            return;
        }
        FileLog.e(exc);
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f16857c;
        o41 o41Var = secretMediaViewer.f34444i1;
        if (secretMediaViewer.f34477y != null && secretMediaViewer.f34441h0 != null) {
            AndroidUtilities.cancelRunOnUIThread(o41Var);
            AndroidUtilities.runOnUIThread(o41Var);
            if (i10 != 4 && i10 != 1) {
                try {
                    secretMediaViewer.f34425b.getWindow().addFlags(128);
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            } else {
                try {
                    secretMediaViewer.f34425b.getWindow().clearFlags(128);
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            if (i10 == 3 && secretMediaViewer.f34472w.getVisibility() != 0) {
                secretMediaViewer.f34472w.setVisibility(0);
            }
            if (secretMediaViewer.f34477y.y() && i10 != 4) {
                if (!secretMediaViewer.E) {
                    secretMediaViewer.E = true;
                }
            } else if (secretMediaViewer.E) {
                secretMediaViewer.E = false;
                if (i10 == 4) {
                    secretMediaViewer.H = true;
                    if (secretMediaViewer.I) {
                        secretMediaViewer.e(true, !secretMediaViewer.f34459q1);
                        return;
                    }
                    secretMediaViewer.f34477y.L(0L, false);
                    secretMediaViewer.f34477y.C();
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
        l4 l4Var = ((SecretMediaViewer) this.f16857c).f34472w;
        if (l4Var != null) {
            if (i11 == 0) {
                f10 = 1.0f;
            } else {
                f10 = (i10 * f7) / i11;
            }
            l4Var.a(f10, 0);
        }
    }

    @Override
    public r2.c f(com.google.firebase.messaging.n nVar) {
        MediaCodec mediaCodec;
        int i10;
        String str = ((r2.o) nVar.f7905a).f45744a;
        r2.c cVar = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                r2.c cVar2 = new r2.c(mediaCodec, (HandlerThread) ((r2.b) this.f16856b).get(), new r2.e(mediaCodec, (HandlerThread) ((r2.b) this.f16857c).get()), (r2.j) nVar.f7909f);
                try {
                    Trace.endSection();
                    Surface surface = (Surface) nVar.d;
                    if (surface == null && ((r2.o) nVar.f7905a).h && Build.VERSION.SDK_INT >= 35) {
                        i10 = 8;
                    } else {
                        i10 = 0;
                    }
                    r2.c.l(cVar2, (MediaFormat) nVar.f7906b, surface, (MediaCrypto) nVar.f7908e, i10);
                    return cVar2;
                } catch (Exception e7) {
                    e = e7;
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
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Exception e11) {
            e = e11;
            mediaCodec = null;
        }
    }

    @Override
    public int p0() {
        return 0;
    }

    @Override
    public void q(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((uy) this.f16857c).movePreviewFragment(f7);
        }
    }

    public void r(String str, PrintWriter printWriter) {
        boolean z10;
        w1.b bVar = (w1.b) this.f16857c;
        if (bVar.d.f36c > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            int i10 = 0;
            while (true) {
                a0.n nVar = bVar.d;
                if (i10 < nVar.f36c) {
                    w1.a aVar = (w1.a) nVar.f35b[i10];
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(bVar.d.f34a[i10]);
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
                    printWriter.println(aVar.f48468l);
                    a6.d dVar = aVar.f48468l;
                    String str3 = str2 + "  ";
                    dVar.getClass();
                    printWriter.print(str3);
                    printWriter.print("mId=");
                    printWriter.print(0);
                    printWriter.print(" mListener=");
                    printWriter.println(dVar.f312a);
                    if (dVar.f313b || dVar.f315e) {
                        printWriter.print(str3);
                        printWriter.print("mStarted=");
                        printWriter.print(dVar.f313b);
                        printWriter.print(" mContentChanged=");
                        printWriter.print(dVar.f315e);
                        printWriter.print(" mProcessingChange=");
                        printWriter.println(false);
                    }
                    if (dVar.f314c || dVar.d) {
                        printWriter.print(str3);
                        printWriter.print("mAbandoned=");
                        printWriter.print(dVar.f314c);
                        printWriter.print(" mReset=");
                        printWriter.println(dVar.d);
                    }
                    if (dVar.f317g != null) {
                        printWriter.print(str3);
                        printWriter.print("mTask=");
                        printWriter.print(dVar.f317g);
                        printWriter.print(" waiting=");
                        dVar.f317g.getClass();
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
                    if (aVar.f48470n != null) {
                        printWriter.print(str2);
                        printWriter.print("mCallbacks=");
                        printWriter.println(aVar.f48470n);
                        b2.p pVar = aVar.f48470n;
                        pVar.getClass();
                        printWriter.print(str2 + "  ");
                        printWriter.print("mDeliveredData=");
                        printWriter.println(pVar.f3426b);
                    }
                    printWriter.print(str2);
                    printWriter.print("mData=");
                    a6.d dVar2 = aVar.f48468l;
                    Object obj2 = aVar.f2830e;
                    if (obj2 != androidx.lifecycle.z.f2826k) {
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
                    if (aVar.f2829c > 0) {
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

    @Override
    public boolean r0() {
        return false;
    }

    public File t() {
        if (((File) this.f16856b) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f16856b) == null) {
                        k9.h hVar = (k9.h) this.f16857c;
                        hVar.a();
                        File filesDir = hVar.f14715a.getFilesDir();
                        this.f16856b = new File(filesDir, "PersistedInstallation." + ((k9.h) this.f16857c).d() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.f16856b;
    }

    @Override
    public Task then(Object obj) {
        da.a aVar = (da.a) obj;
        u4.g gVar = (u4.g) this.f16857c;
        if (aVar == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return Tasks.forResult(null);
        }
        o0.a aVar2 = (o0.a) gVar.f47553c;
        w9.n.b((w9.n) ((o0.a) gVar.f47553c).f16938c);
        ((w9.n) aVar2.f16938c).f48974m.y((Executor) this.f16856b, null);
        ((w9.n) aVar2.f16938c).f48978q.trySetResult(null);
        return Tasks.forResult(null);
    }

    public String toString() {
        switch (this.f16855a) {
            case 21:
                StringBuilder sb2 = new StringBuilder(128);
                sb2.append("LoaderManager{");
                sb2.append(Integer.toHexString(System.identityHashCode(this)));
                sb2.append(" in ");
                Class<?> cls = ((androidx.lifecycle.t) this.f16856b).getClass();
                sb2.append(cls.getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(cls)));
                sb2.append("}}");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public void u(ra.b bVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", bVar.f45982a);
            jSONObject.put("Status", m1.j.c(bVar.f45983b));
            jSONObject.put("AuthToken", bVar.f45984c);
            jSONObject.put("RefreshToken", bVar.d);
            jSONObject.put("TokenCreationEpochInSecs", bVar.f45986f);
            jSONObject.put("ExpiresInSecs", bVar.f45985e);
            jSONObject.put("FisError", bVar.f45987g);
            k9.h hVar = (k9.h) this.f16857c;
            hVar.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", hVar.f14715a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!createTempFile.renameTo(t())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    @Override
    public void v(Canvas canvas, float f7, float f10, float f11, float f12) {
        Paint paint = (Paint) this.f16856b;
        PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f16857c;
        rg.a1 a1Var = premiumPreviewFragment.m0;
        if (premiumPreviewFragment.f34147h0) {
            paint.setColor(premiumPreviewFragment.getThemedColor(i6.f20771a7));
            canvas.drawRect(f7, f10, f11, f12, paint);
            return;
        }
        a1Var.d(0, (-premiumPreviewFragment.f34141d0.getMeasuredWidth()) * 0.1f * premiumPreviewFragment.f34138b0, 0, premiumPreviewFragment.f34141d0.getMeasuredWidth(), 0.0f, premiumPreviewFragment.f34141d0.getMeasuredHeight());
        canvas.drawRect(f7, f10, f11, f12, a1Var.f46052f);
    }

    public b2.q0 w(s4.c1 c1Var, int i10) {
        s4.i1 i1Var;
        b2.q0 q0Var;
        a0.f fVar = (a0.f) this.f16856b;
        int c10 = fVar.c(c1Var);
        if (c10 >= 0 && (i1Var = (s4.i1) fVar.h(c10)) != null) {
            int i11 = i1Var.f46600a;
            if ((i11 & i10) != 0) {
                int i12 = i11 & (~i10);
                i1Var.f46600a = i12;
                if (i10 == 4) {
                    q0Var = i1Var.f46601b;
                } else if (i10 == 8) {
                    q0Var = i1Var.f46602c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i12 & 12) == 0) {
                    fVar.f(c10);
                    i1Var.f46600a = 0;
                    i1Var.f46601b = null;
                    i1Var.f46602c = null;
                    s4.i1.d.i(i1Var);
                }
                return q0Var;
            }
        }
        return null;
    }

    @Override
    public ColorFilter x() {
        return i6.f21159v3;
    }

    public ra.b y() {
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

    public void z() {
        try {
            ((FileLock) this.f16857c).release();
            ((FileChannel) this.f16856b).close();
        } catch (IOException e7) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e7);
        }
    }

    public z0(int i10, Object obj, Object obj2) {
        this.f16855a = i10;
        this.f16856b = obj;
        this.f16857c = obj2;
    }

    @Override
    public void onRenderedFirstFrame() {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f16857c;
        if (secretMediaViewer.f34429c0) {
            return;
        }
        secretMediaViewer.f34429c0 = true;
        secretMediaViewer.f34433e.invalidate();
    }

    public z0(Object obj, Object obj2, boolean z10, int i10) {
        this.f16855a = i10;
        this.f16857c = obj;
        this.f16856b = obj2;
    }

    public z0(v7.k kVar) {
        this.f16855a = 22;
        this.f16857c = new Object();
        this.f16856b = kVar;
        pa.b();
    }

    public z0(Context context) {
        this.f16855a = 18;
        this.f16856b = context;
        this.f16857c = null;
    }

    public z0() {
        this.f16855a = 16;
        this.f16856b = new a0.m(0);
        this.f16857c = new a0.i();
    }

    public z0(View view) {
        this.f16855a = 5;
        r71 r71Var = new r71(this, view);
        this.f16856b = r71Var;
        view.addOnLayoutChangeListener(r71Var);
    }

    public z0(androidx.lifecycle.t tVar, androidx.lifecycle.t0 t0Var) {
        this.f16855a = 21;
        this.f16856b = tVar;
        this.f16857c = (w1.b) new aa.a(t0Var, w1.b.f48471f).j(w1.b.class);
    }

    public z0(wf0 wf0Var) {
        this.f16855a = 4;
        this.f16857c = wf0Var;
        this.f16856b = new lc0(this, 10);
    }

    public z0(k9.h hVar) {
        this.f16855a = 15;
        this.f16857c = hVar;
    }

    @Override
    public void B() {
    }

    @Override
    public void m0() {
    }

    @Override
    public void s() {
    }

    public z0(String str, String str2) {
        this.f16855a = 19;
        this.f16856b = str;
        this.f16857c = str2;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("userId should not be empty");
        }
    }

    @Override
    public void A(float f7) {
    }

    @Override
    public void C(boolean z10) {
    }

    @Override
    public void L(float f7) {
    }

    @Override
    public void U(long j3) {
    }

    @Override
    public void X(boolean z10) {
    }

    @Override
    public void c0(float f7) {
    }

    @Override
    public void d(int i10) {
    }

    @Override
    public void h(float f7) {
    }

    @Override
    public void h0(float f7) {
    }

    @Override
    public void k(float f7) {
    }

    @Override
    public void l0(float f7) {
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
    public void s0(float f7) {
    }

    @Override
    public void u0(long j3) {
    }

    public z0(EditText editText) {
        this.f16855a = 12;
        this.f16856b = editText;
        q1.i iVar = new q1.i(editText);
        this.f16857c = iVar;
        editText.addTextChangedListener(iVar);
        if (q1.a.f44745b == null) {
            synchronized (q1.a.f44744a) {
                try {
                    if (q1.a.f44745b == null) {
                        ?? factory = new Editable.Factory();
                        try {
                            q1.a.f44746c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, q1.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        q1.a.f44745b = factory;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(q1.a.f44745b);
    }

    @Override
    public void I(float f7, int i10) {
    }

    @Override
    public void L0(int i10, int i11) {
    }

    @Override
    public void b0(float f7, int i10) {
    }

    @Override
    public void k0(float f7, int i10) {
    }

    @Override
    public void l(long j3, boolean z10) {
    }

    @Override
    public void t0(int i10, long j3) {
    }

    public z0(PremiumPreviewFragment premiumPreviewFragment) {
        this.f16855a = 8;
        this.f16857c = premiumPreviewFragment;
        this.f16856b = new Paint();
    }
}
