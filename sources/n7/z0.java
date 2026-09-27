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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.g3;
import org.telegram.ui.Cells.s2;
import org.telegram.ui.Components.bu;
import org.telegram.ui.Components.du;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.jc0;
import org.telegram.ui.Components.pl0;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.so0;
import org.telegram.ui.Components.u71;
import org.telegram.ui.Components.uf0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.by0;
import org.telegram.ui.iy;
import org.telegram.ui.k5;
import org.telegram.ui.m4;
import org.telegram.ui.q41;
import org.telegram.ui.sy;
import org.telegram.ui.ty;
import w7.pa;
public final class z0 implements e6, so0, bu, oc, pl0, fh.a, r71, p2.s, r2.k, y2.n, SuccessContinuation {
    public final int f15444a;
    public Object f15445b;
    public Object f15446c;

    public z0(int i10) {
        this.f15444a = i10;
    }

    public static n7.z0 f(android.content.Context r5) {
        throw new UnsupportedOperationException("Method not decompiled: n7.z0.f(android.content.Context):n7.z0");
    }

    public static z0 k(View view) {
        return new z0(view);
    }

    public b2.q0 C(s4.c1 c1Var, int i10) {
        s4.i1 i1Var;
        b2.q0 q0Var;
        a0.f fVar = (a0.f) this.f15445b;
        int c10 = fVar.c(c1Var);
        if (c10 >= 0 && (i1Var = (s4.i1) fVar.h(c10)) != null) {
            int i11 = i1Var.f43059a;
            if ((i11 & i10) != 0) {
                int i12 = i11 & (~i10);
                i1Var.f43059a = i12;
                if (i10 == 4) {
                    q0Var = i1Var.f43060b;
                } else if (i10 == 8) {
                    q0Var = i1Var.f43061c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i12 & 12) == 0) {
                    fVar.f(c10);
                    i1Var.f43059a = 0;
                    i1Var.f43060b = null;
                    i1Var.f43061c = null;
                    s4.i1.d.i(i1Var);
                }
                return q0Var;
            }
        }
        return null;
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
    public void F(float f7, boolean z10) {
        jc0 jc0Var = (jc0) this.f15445b;
        uf0 uf0Var = (uf0) this.f15446c;
        u71 u71Var = uf0Var.d;
        if (u71Var != null) {
            long p5 = u71Var.p();
            float max = 2.8f / ((float) Math.max(60L, p5));
            long j3 = (((f7 / (1.0f - max)) * max) + f7) * ((float) p5);
            uf0Var.e = j3;
            uf0Var.d.L(j3, !z10);
            if (!z10) {
                AndroidUtilities.cancelRunOnUIThread(jc0Var);
                AndroidUtilities.runOnUIThread(jc0Var, 120L);
            }
        }
    }

    @Override
    public Paint G(String str) {
        return i6.S0(str);
    }

    @Override
    public int G0(int i10) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.f15445b;
        int indexOfKey = sparseIntArray.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        return i6.w0(null, i10, false);
    }

    @Override
    public y2.n H() {
        return new z0(17, ((p2.s) this.f15445b).H(), (List) this.f15446c);
    }

    public void I() {
        try {
            ((FileLock) this.f15446c).release();
            ((FileChannel) this.f15445b).close();
        } catch (IOException e) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
        }
    }

    @Override
    public y2.n K(p2.o oVar, p2.l lVar) {
        return new z0(17, ((p2.s) this.f15445b).K(oVar, lVar), (List) this.f15446c);
    }

    public void L(s4.c1 c1Var) {
        s4.i1 i1Var = (s4.i1) ((a0.f) this.f15445b).get(c1Var);
        if (i1Var == null) {
            return;
        }
        i1Var.f43059a &= -2;
    }

    public void M(s4.c1 c1Var) {
        a0.f fVar = (a0.f) this.f15445b;
        a0.i iVar = (a0.i) this.f15446c;
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
            i1Var.f43059a = 0;
            i1Var.f43060b = null;
            i1Var.f43061c = null;
            s4.i1.d.i(i1Var);
        }
    }

    @Override
    public void X(float f7, boolean z10) {
        ((TextView) this.f15445b).setText("Alpha " + k5.e);
        k5.e = f7;
        ((k5) this.f15446c).f34910b.M();
    }

    @Override
    public boolean a() {
        return i6.I.q();
    }

    @Override
    public boolean mo18c(float f7, float f10, int i10, View view) {
        ty tyVar = (ty) this.f15446c;
        if (view instanceof s2) {
            s2 s2Var = (s2) view;
            if (s2Var.f20987n2) {
                tyVar.W4(s2Var.getDialogId(), view);
                return true;
            }
        }
        iy iyVar = tyVar.f38079z0;
        if (iyVar != null && iyVar.getVisibility() == 0 && tyVar.f38079z0.f26257n) {
            return false;
        }
        return tyVar.x4(view, i10, f7, ((sy) this.f15445b).d);
    }

    @Override
    public ch.d d() {
        return new ch.f(this);
    }

    @Override
    public void g() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((ty) this.f15446c).finishPreviewFragment();
        }
    }

    @Override
    public int g0(int i10) {
        return G0(i10);
    }

    @Override
    public int g1(int i10) {
        return ((SparseIntArray) this.f15445b).get(i10);
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public Drawable getDrawable(String str) {
        return null;
    }

    public void h(s4.c1 c1Var, b2.q0 q0Var) {
        a0.f fVar = (a0.f) this.f15445b;
        s4.i1 i1Var = (s4.i1) fVar.get(c1Var);
        if (i1Var == null) {
            i1Var = s4.i1.a();
            fVar.put(c1Var, i1Var);
        }
        i1Var.f43061c = q0Var;
        i1Var.f43059a |= 8;
    }

    @Override
    public void j() {
        ((du) this.f15445b).getText();
        ((g3) this.f15446c).b();
    }

    @Override
    public void m(float f7, float f10, int i10, int i11) {
        i6.q(f7, f10, i10, i11);
    }

    @Override
    public int m0() {
        return 0;
    }

    @Override
    public Object n2(Uri uri, g2.k kVar) {
        t2.a aVar = (t2.a) ((y2.n) this.f15445b).n2(uri, kVar);
        List list = (List) this.f15446c;
        if (list != null && !list.isEmpty()) {
            return (t2.a) aVar.a(list);
        }
        return aVar;
    }

    public void o() {
        String str = (String) this.f15445b;
        try {
            ba.c cVar = (ba.c) this.f15446c;
            cVar.getClass();
            new File(cVar.f3446b, str).createNewFile();
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e);
        }
    }

    @Override
    public void onError(u71 u71Var, Exception exc) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f15446c;
        int i10 = secretMediaViewer.f31728b0;
        if (i10 > 0) {
            secretMediaViewer.f31728b0 = i10 - 1;
            AndroidUtilities.runOnUIThread(new by0(23, this, (File) this.f15445b), 100L);
            return;
        }
        FileLog.e(exc);
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f15446c;
        q41 q41Var = secretMediaViewer.f31745i1;
        if (secretMediaViewer.f31778y != null && secretMediaViewer.f31742h0 != null) {
            AndroidUtilities.cancelRunOnUIThread(q41Var);
            AndroidUtilities.runOnUIThread(q41Var);
            if (i10 != 4 && i10 != 1) {
                try {
                    secretMediaViewer.f31727b.getWindow().addFlags(128);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            } else {
                try {
                    secretMediaViewer.f31727b.getWindow().clearFlags(128);
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
            if (i10 == 3 && secretMediaViewer.f31773w.getVisibility() != 0) {
                secretMediaViewer.f31773w.setVisibility(0);
            }
            if (secretMediaViewer.f31778y.y() && i10 != 4) {
                if (!secretMediaViewer.E) {
                    secretMediaViewer.E = true;
                }
            } else if (secretMediaViewer.E) {
                secretMediaViewer.E = false;
                if (i10 == 4) {
                    secretMediaViewer.H = true;
                    if (secretMediaViewer.I) {
                        secretMediaViewer.e(true, !secretMediaViewer.f31760q1);
                        return;
                    }
                    secretMediaViewer.f31778y.L(0L, false);
                    secretMediaViewer.f31778y.C();
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
        m4 m4Var = ((SecretMediaViewer) this.f15446c).f31773w;
        if (m4Var != null) {
            if (i11 == 0) {
                f10 = 1.0f;
            } else {
                f10 = (i10 * f7) / i11;
            }
            m4Var.a(f10, 0);
        }
    }

    @Override
    public r2.c v(com.google.firebase.messaging.n nVar) {
        MediaCodec mediaCodec;
        int i10;
        String str = ((r2.o) nVar.f7320a).f42293a;
        r2.c cVar = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                r2.c cVar2 = new r2.c(mediaCodec, (HandlerThread) ((r2.b) this.f15445b).get(), new r2.e(mediaCodec, (HandlerThread) ((r2.b) this.f15446c).get()), (r2.j) nVar.f7323f);
                try {
                    Trace.endSection();
                    Surface surface = (Surface) nVar.d;
                    if (surface == null && ((r2.o) nVar.f7320a).h && Build.VERSION.SDK_INT >= 35) {
                        i10 = 8;
                    } else {
                        i10 = 0;
                    }
                    r2.c.l(cVar2, (MediaFormat) nVar.f7321b, surface, (MediaCrypto) nVar.e, i10);
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
            ((ty) this.f15446c).movePreviewFragment(f7);
        }
    }

    public void s(String str, PrintWriter printWriter) {
        boolean z10;
        w1.b bVar = (w1.b) this.f15446c;
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
                    printWriter.println(aVar.f44797l);
                    a6.d dVar = aVar.f44797l;
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
                    if (aVar.f44799n != null) {
                        printWriter.print(str2);
                        printWriter.print("mCallbacks=");
                        printWriter.println(aVar.f44799n);
                        b2.p pVar = aVar.f44799n;
                        pVar.getClass();
                        printWriter.print(str2 + "  ");
                        printWriter.print("mDeliveredData=");
                        printWriter.println(pVar.f3170b);
                    }
                    printWriter.print(str2);
                    printWriter.print("mData=");
                    a6.d dVar2 = aVar.f44797l;
                    Object obj2 = aVar.e;
                    if (obj2 != androidx.lifecycle.z.f2610k) {
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
                    if (aVar.f2613c > 0) {
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
        if (((File) this.f15445b) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f15445b) == null) {
                        k9.h hVar = (k9.h) this.f15446c;
                        hVar.a();
                        File filesDir = hVar.f13536a.getFilesDir();
                        this.f15445b = new File(filesDir, "PersistedInstallation." + ((k9.h) this.f15446c).d() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.f15445b;
    }

    @Override
    public Task then(Object obj) {
        da.a aVar = (da.a) obj;
        u4.g gVar = (u4.g) this.f15446c;
        if (aVar == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return Tasks.forResult(null);
        }
        o0.a aVar2 = (o0.a) gVar.f43948c;
        w9.n.b((w9.n) ((o0.a) gVar.f43948c).f15520c);
        ((w9.n) aVar2.f15520c).f45272m.y((Executor) this.f15445b, null);
        ((w9.n) aVar2.f15520c).f45276q.trySetResult(null);
        return Tasks.forResult(null);
    }

    public String toString() {
        switch (this.f15444a) {
            case 21:
                StringBuilder sb2 = new StringBuilder(128);
                sb2.append("LoaderManager{");
                sb2.append(Integer.toHexString(System.identityHashCode(this)));
                sb2.append(" in ");
                Class<?> cls = ((androidx.lifecycle.t) this.f15445b).getClass();
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
        return i6.f19387v3;
    }

    @Override
    public void y(Canvas canvas, float f7, float f10, float f11, float f12) {
        Paint paint = (Paint) this.f15445b;
        PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f15446c;
        rg.z0 z0Var = premiumPreviewFragment.m0;
        if (premiumPreviewFragment.f31454h0) {
            paint.setColor(premiumPreviewFragment.getThemedColor(i6.f19001a7));
            canvas.drawRect(f7, f10, f11, f12, paint);
            return;
        }
        z0Var.d(0, (-premiumPreviewFragment.f31449d0.getMeasuredWidth()) * 0.1f * premiumPreviewFragment.f31446b0, 0, premiumPreviewFragment.f31449d0.getMeasuredWidth(), 0.0f, premiumPreviewFragment.f31449d0.getMeasuredHeight());
        canvas.drawRect(f7, f10, f11, f12, z0Var.f42885f);
    }

    public void z(ra.b bVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", bVar.f42511a);
            jSONObject.put("Status", m1.j.c(bVar.f42512b));
            jSONObject.put("AuthToken", bVar.f42513c);
            jSONObject.put("RefreshToken", bVar.d);
            jSONObject.put("TokenCreationEpochInSecs", bVar.f42514f);
            jSONObject.put("ExpiresInSecs", bVar.e);
            jSONObject.put("FisError", bVar.f42515g);
            k9.h hVar = (k9.h) this.f15446c;
            hVar.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", hVar.f13536a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!createTempFile.renameTo(t())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public z0(int i10, Object obj, Object obj2) {
        this.f15444a = i10;
        this.f15445b = obj;
        this.f15446c = obj2;
    }

    @Override
    public void onRenderedFirstFrame() {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f15446c;
        if (secretMediaViewer.f31731c0) {
            return;
        }
        secretMediaViewer.f31731c0 = true;
        secretMediaViewer.e.invalidate();
    }

    public z0(Object obj, Object obj2, boolean z10, int i10) {
        this.f15444a = i10;
        this.f15446c = obj;
        this.f15445b = obj2;
    }

    public z0(v7.k kVar) {
        this.f15444a = 22;
        this.f15446c = new Object();
        this.f15445b = kVar;
        pa.b();
    }

    public z0(Context context) {
        this.f15444a = 18;
        this.f15445b = context;
        this.f15446c = null;
    }

    public z0() {
        this.f15444a = 16;
        this.f15445b = new a0.m(0);
        this.f15446c = new a0.i();
    }

    public z0(View view) {
        this.f15444a = 5;
        h71 h71Var = new h71(this, view);
        this.f15445b = h71Var;
        view.addOnLayoutChangeListener(h71Var);
    }

    public z0(androidx.lifecycle.t tVar, androidx.lifecycle.t0 t0Var) {
        this.f15444a = 21;
        this.f15445b = tVar;
        this.f15446c = (w1.b) new aa.a(t0Var, w1.b.f44800f).k(w1.b.class);
    }

    public z0(uf0 uf0Var) {
        this.f15444a = 4;
        this.f15446c = uf0Var;
        this.f15445b = new jc0(this, 10);
    }

    public z0(k9.h hVar) {
        this.f15444a = 15;
        this.f15446c = hVar;
    }

    @Override
    public void B() {
    }

    @Override
    public void b() {
    }

    @Override
    public void b0() {
    }

    @Override
    public void r() {
    }

    public z0(String str, String str2) {
        this.f15444a = 19;
        this.f15445b = str;
        this.f15446c = str2;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("userId should not be empty");
        }
    }

    @Override
    public void D(float f7) {
    }

    @Override
    public void J(long j3) {
    }

    @Override
    public void O(boolean z10) {
    }

    @Override
    public void T(float f7) {
    }

    @Override
    public void Y(float f7) {
    }

    @Override
    public void a0(float f7) {
    }

    @Override
    public void e(int i10) {
    }

    @Override
    public void h0(float f7) {
    }

    @Override
    public void i(float f7) {
    }

    @Override
    public void l(float f7) {
    }

    @Override
    public void l0(long j3) {
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

    public z0(EditText editText) {
        this.f15444a = 12;
        this.f15445b = editText;
        q1.i iVar = new q1.i(editText);
        this.f15446c = iVar;
        editText.addTextChangedListener(iVar);
        if (q1.a.f41396b == null) {
            synchronized (q1.a.f41395a) {
                try {
                    if (q1.a.f41396b == null) {
                        ?? factory = new Editable.Factory();
                        try {
                            q1.a.f41397c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, q1.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        q1.a.f41396b = factory;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(q1.a.f41396b);
    }

    @Override
    public void A(float f7, int i10) {
    }

    @Override
    public void L0(int i10, int i11) {
    }

    @Override
    public void R(float f7, int i10) {
    }

    @Override
    public void Z(float f7, int i10) {
    }

    @Override
    public void i0(int i10, long j3) {
    }

    @Override
    public void n(long j3, boolean z10) {
    }

    public z0(PremiumPreviewFragment premiumPreviewFragment) {
        this.f15444a = 8;
        this.f15446c = premiumPreviewFragment;
        this.f15445b = new Paint();
    }
}
