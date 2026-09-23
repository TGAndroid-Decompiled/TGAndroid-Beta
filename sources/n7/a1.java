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
import ci.pc;
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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.f3;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Components.ac0;
import org.telegram.ui.Components.au;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.cu;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.eo0;
import org.telegram.ui.Components.f71;
import org.telegram.ui.Components.kf0;
import org.telegram.ui.Components.q61;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.by0;
import org.telegram.ui.j5;
import org.telegram.ui.l4;
import org.telegram.ui.m41;
import org.telegram.ui.pw;
import org.telegram.ui.qy;
import org.telegram.ui.ry;
import v7.r1;
import w7.pa;
public final class a1 implements d6, eo0, au, pc, dl0, fh.a, c71, p2.t, r2.k, y2.o, SuccessContinuation {
    public final int f15082a;
    public Object f15083b;
    public Object f15084c;

    public a1(int i10) {
        this.f15082a = i10;
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
        a0.f fVar = (a0.f) this.f15083b;
        int c10 = fVar.c(c1Var);
        if (c10 >= 0 && (i1Var = (s4.i1) fVar.h(c10)) != null) {
            int i11 = i1Var.f42681a;
            if ((i11 & i10) != 0) {
                int i12 = i11 & (~i10);
                i1Var.f42681a = i12;
                if (i10 == 4) {
                    q0Var = i1Var.f42682b;
                } else if (i10 == 8) {
                    q0Var = i1Var.f42683c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i12 & 12) == 0) {
                    fVar.f(c10);
                    i1Var.f42681a = 0;
                    i1Var.f42682b = null;
                    i1Var.f42683c = null;
                    s4.i1.d.i(i1Var);
                }
                return q0Var;
            }
        }
        return null;
    }

    @Override
    public y2.o D() {
        return new a1(17, ((p2.t) this.f15083b).D(), (List) this.f15084c);
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
        return h6.S0(str);
    }

    @Override
    public int G0(int i10) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.f15083b;
        int indexOfKey = sparseIntArray.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        return h6.w0(null, i10, false);
    }

    @Override
    public void H(float f7, boolean z10) {
        ac0 ac0Var = (ac0) this.f15083b;
        kf0 kf0Var = (kf0) this.f15084c;
        f71 f71Var = kf0Var.d;
        if (f71Var != null) {
            long p5 = f71Var.p();
            float max = 2.8f / ((float) Math.max(60L, p5));
            long j3 = (((f7 / (1.0f - max)) * max) + f7) * ((float) p5);
            kf0Var.e = j3;
            kf0Var.d.L(j3, !z10);
            if (!z10) {
                AndroidUtilities.cancelRunOnUIThread(ac0Var);
                AndroidUtilities.runOnUIThread(ac0Var, 120L);
            }
        }
    }

    public void I() {
        try {
            ((FileLock) this.f15084c).release();
            ((FileChannel) this.f15083b).close();
        } catch (IOException e) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
        }
    }

    public void J(s4.c1 c1Var) {
        s4.i1 i1Var = (s4.i1) ((a0.f) this.f15083b).get(c1Var);
        if (i1Var == null) {
            return;
        }
        i1Var.f42681a &= -2;
    }

    @Override
    public y2.o K(p2.p pVar, p2.m mVar) {
        return new a1(17, ((p2.t) this.f15083b).K(pVar, mVar), (List) this.f15084c);
    }

    public void L(s4.c1 c1Var) {
        a0.f fVar = (a0.f) this.f15083b;
        a0.i iVar = (a0.i) this.f15084c;
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
            i1Var.f42681a = 0;
            i1Var.f42682b = null;
            i1Var.f42683c = null;
            s4.i1.d.i(i1Var);
        }
    }

    @Override
    public void X(float f7, boolean z10) {
        ((TextView) this.f15083b).setText("Alpha " + j5.e);
        j5.e = f7;
        ((j5) this.f15084c).f34326b.M();
    }

    @Override
    public boolean a() {
        return h6.I.q();
    }

    @Override
    public boolean mo18c(float f7, float f10, int i10, View view) {
        ry ryVar = (ry) this.f15084c;
        if (view instanceof r2) {
            r2 r2Var = (r2) view;
            if (r2Var.f20697n2) {
                ryVar.N4(r2Var.getDialogId(), view);
                return true;
            }
        }
        pw pwVar = ryVar.f37082z0;
        if (pwVar != null && pwVar.getVisibility() == 0 && ryVar.f37082z0.f25749n) {
            return false;
        }
        return ryVar.o4(view, i10, f7, ((qy) this.f15083b).d);
    }

    public void f(s4.c1 c1Var, b2.q0 q0Var) {
        a0.f fVar = (a0.f) this.f15083b;
        s4.i1 i1Var = (s4.i1) fVar.get(c1Var);
        if (i1Var == null) {
            i1Var = s4.i1.a();
            fVar.put(c1Var, i1Var);
        }
        i1Var.f42683c = q0Var;
        i1Var.f42681a |= 8;
    }

    @Override
    public void g() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((ry) this.f15084c).finishPreviewFragment();
        }
    }

    @Override
    public int g0(int i10) {
        return G0(i10);
    }

    @Override
    public int g1(int i10) {
        return ((SparseIntArray) this.f15083b).get(i10);
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
        ((cu) this.f15083b).getText();
        ((f3) this.f15084c).b();
    }

    public void k() {
        String str = (String) this.f15083b;
        try {
            ba.c cVar = (ba.c) this.f15084c;
            cVar.getClass();
            new File(cVar.f3444b, str).createNewFile();
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
        h6.q(f7, f10, i10, i11);
    }

    @Override
    public int m0() {
        return 0;
    }

    @Override
    public Object n2(Uri uri, g2.k kVar) {
        t2.a aVar = (t2.a) ((y2.o) this.f15083b).n2(uri, kVar);
        List list = (List) this.f15084c;
        if (list != null && !list.isEmpty()) {
            return (t2.a) aVar.a(list);
        }
        return aVar;
    }

    @Override
    public void onError(f71 f71Var, Exception exc) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f15084c;
        int i10 = secretMediaViewer.f31411b0;
        if (i10 > 0) {
            secretMediaViewer.f31411b0 = i10 - 1;
            AndroidUtilities.runOnUIThread(new by0(22, this, (File) this.f15083b), 100L);
            return;
        }
        FileLog.e(exc);
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f15084c;
        m41 m41Var = secretMediaViewer.f31428i1;
        if (secretMediaViewer.f31461y != null && secretMediaViewer.f31425h0 != null) {
            AndroidUtilities.cancelRunOnUIThread(m41Var);
            AndroidUtilities.runOnUIThread(m41Var);
            if (i10 != 4 && i10 != 1) {
                try {
                    secretMediaViewer.f31410b.getWindow().addFlags(128);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            } else {
                try {
                    secretMediaViewer.f31410b.getWindow().clearFlags(128);
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
            if (i10 == 3 && secretMediaViewer.f31456w.getVisibility() != 0) {
                secretMediaViewer.f31456w.setVisibility(0);
            }
            if (secretMediaViewer.f31461y.y() && i10 != 4) {
                if (!secretMediaViewer.E) {
                    secretMediaViewer.E = true;
                }
            } else if (secretMediaViewer.E) {
                secretMediaViewer.E = false;
                if (i10 == 4) {
                    secretMediaViewer.H = true;
                    if (secretMediaViewer.I) {
                        secretMediaViewer.e(true, !secretMediaViewer.f31443q1);
                        return;
                    }
                    secretMediaViewer.f31461y.L(0L, false);
                    secretMediaViewer.f31461y.C();
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
        l4 l4Var = ((SecretMediaViewer) this.f15084c).f31456w;
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
    public r2.c v(com.google.firebase.messaging.n nVar) {
        MediaCodec mediaCodec;
        int i10;
        String str = ((r2.o) nVar.f7319a).f41915a;
        r2.c cVar = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                r2.c cVar2 = new r2.c(mediaCodec, (HandlerThread) ((r2.b) this.f15083b).get(), new r2.e(mediaCodec, (HandlerThread) ((r2.b) this.f15084c).get()), (r2.j) nVar.f7322f);
                try {
                    Trace.endSection();
                    Surface surface = (Surface) nVar.d;
                    if (surface == null && ((r2.o) nVar.f7319a).h && Build.VERSION.SDK_INT >= 35) {
                        i10 = 8;
                    } else {
                        i10 = 0;
                    }
                    r2.c.l(cVar2, (MediaFormat) nVar.f7320b, surface, (MediaCrypto) nVar.e, i10);
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
            ((ry) this.f15084c).movePreviewFragment(f7);
        }
    }

    public void r(String str, PrintWriter printWriter) {
        boolean z10;
        w1.b bVar = (w1.b) this.f15084c;
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
                    printWriter.println(aVar.f44421l);
                    a6.d dVar = aVar.f44421l;
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
                    if (aVar.f44423n != null) {
                        printWriter.print(str2);
                        printWriter.print("mCallbacks=");
                        printWriter.println(aVar.f44423n);
                        b2.p pVar = aVar.f44423n;
                        pVar.getClass();
                        printWriter.print(str2 + "  ");
                        printWriter.print("mDeliveredData=");
                        printWriter.println(pVar.f3168b);
                    }
                    printWriter.print(str2);
                    printWriter.print("mData=");
                    a6.d dVar2 = aVar.f44421l;
                    Object obj2 = aVar.e;
                    if (obj2 != androidx.lifecycle.z.f2608k) {
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
                    if (aVar.f2611c > 0) {
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
        if (((File) this.f15083b) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f15083b) == null) {
                        k9.h hVar = (k9.h) this.f15084c;
                        hVar.a();
                        File filesDir = hVar.f13536a.getFilesDir();
                        this.f15083b = new File(filesDir, "PersistedInstallation." + ((k9.h) this.f15084c).d() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.f15083b;
    }

    @Override
    public Task then(Object obj) {
        da.a aVar = (da.a) obj;
        u4.g gVar = (u4.g) this.f15084c;
        if (aVar == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return Tasks.forResult(null);
        }
        o0.a aVar2 = (o0.a) gVar.f43568c;
        w9.m.b((w9.m) ((o0.a) gVar.f43568c).f15276c);
        ((w9.m) aVar2.f15276c).f44895m.y((Executor) this.f15083b, null);
        ((w9.m) aVar2.f15276c).f44899q.trySetResult(null);
        return Tasks.forResult(null);
    }

    public String toString() {
        switch (this.f15082a) {
            case 21:
                StringBuilder sb2 = new StringBuilder(128);
                sb2.append("LoaderManager{");
                sb2.append(Integer.toHexString(System.identityHashCode(this)));
                sb2.append(" in ");
                Class<?> cls = ((androidx.lifecycle.t) this.f15083b).getClass();
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
        return h6.f19115v3;
    }

    @Override
    public void y(Canvas canvas, float f7, float f10, float f11, float f12) {
        Paint paint = (Paint) this.f15083b;
        PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f15084c;
        rg.z0 z0Var = premiumPreviewFragment.m0;
        if (premiumPreviewFragment.f31137h0) {
            paint.setColor(premiumPreviewFragment.getThemedColor(h6.f18733a7));
            canvas.drawRect(f7, f10, f11, f12, paint);
            return;
        }
        z0Var.d(0, (-premiumPreviewFragment.f31132d0.getMeasuredWidth()) * 0.1f * premiumPreviewFragment.f31129b0, 0, premiumPreviewFragment.f31132d0.getMeasuredWidth(), 0.0f, premiumPreviewFragment.f31132d0.getMeasuredHeight());
        canvas.drawRect(f7, f10, f11, f12, z0Var.f42507f);
    }

    public void z(ra.b bVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", bVar.f42133a);
            jSONObject.put("Status", m1.j.c(bVar.f42134b));
            jSONObject.put("AuthToken", bVar.f42135c);
            jSONObject.put("RefreshToken", bVar.d);
            jSONObject.put("TokenCreationEpochInSecs", bVar.f42136f);
            jSONObject.put("ExpiresInSecs", bVar.e);
            jSONObject.put("FisError", bVar.f42137g);
            k9.h hVar = (k9.h) this.f15084c;
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

    public a1(int i10, Object obj, Object obj2) {
        this.f15082a = i10;
        this.f15083b = obj;
        this.f15084c = obj2;
    }

    @Override
    public void onRenderedFirstFrame() {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f15084c;
        if (secretMediaViewer.f31414c0) {
            return;
        }
        secretMediaViewer.f31414c0 = true;
        secretMediaViewer.e.invalidate();
    }

    public a1(Object obj, Object obj2, boolean z10, int i10) {
        this.f15082a = i10;
        this.f15084c = obj;
        this.f15083b = obj2;
    }

    public a1(r1 r1Var) {
        this.f15082a = 22;
        this.f15084c = new Object();
        this.f15083b = r1Var;
        pa.b();
    }

    public a1(Context context) {
        this.f15082a = 18;
        this.f15083b = context;
        this.f15084c = null;
    }

    public a1() {
        this.f15082a = 16;
        this.f15083b = new a0.m(0);
        this.f15084c = new a0.i();
    }

    public a1(View view) {
        this.f15082a = 5;
        q61 q61Var = new q61(this, view);
        this.f15083b = q61Var;
        view.addOnLayoutChangeListener(q61Var);
    }

    public a1(androidx.lifecycle.t tVar, androidx.lifecycle.t0 t0Var) {
        this.f15082a = 21;
        this.f15083b = tVar;
        this.f15084c = (w1.b) new aa.a(t0Var, w1.b.f44424f).m(w1.b.class);
    }

    public a1(kf0 kf0Var) {
        this.f15082a = 4;
        this.f15084c = kf0Var;
        this.f15083b = new ac0(this, 9);
    }

    public a1(k9.h hVar) {
        this.f15082a = 15;
        this.f15084c = hVar;
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
        this.f15082a = 19;
        this.f15083b = str;
        this.f15084c = str2;
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
        this.f15082a = 12;
        this.f15083b = editText;
        q1.i iVar = new q1.i(editText);
        this.f15084c = iVar;
        editText.addTextChangedListener(iVar);
        if (q1.a.f41030b == null) {
            synchronized (q1.a.f41029a) {
                try {
                    if (q1.a.f41030b == null) {
                        ?? factory = new Editable.Factory();
                        try {
                            q1.a.f41031c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, q1.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        q1.a.f41030b = factory;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(q1.a.f41030b);
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
        this.f15082a = 8;
        this.f15084c = premiumPreviewFragment;
        this.f15083b = new Paint();
    }
}
