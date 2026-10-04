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
import org.telegram.ui.Components.a81;
import org.telegram.ui.Components.cu;
import org.telegram.ui.Components.d81;
import org.telegram.ui.Components.eu;
import org.telegram.ui.Components.lc0;
import org.telegram.ui.Components.pl0;
import org.telegram.ui.Components.q71;
import org.telegram.ui.Components.wf0;
import org.telegram.ui.Components.xo0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.j5;
import org.telegram.ui.ky;
import org.telegram.ui.l4;
import org.telegram.ui.q41;
import org.telegram.ui.ty;
import org.telegram.ui.uy;
import org.telegram.ui.wx0;
import w7.pa;
public final class z0 implements d6, xo0, cu, oc, pl0, fh.a, a81, p2.s, r2.k, y2.n, SuccessContinuation {
    public final int f16845a;
    public Object f16846b;
    public Object f16847c;

    public z0(int i10) {
        this.f16845a = i10;
    }

    public static n7.z0 e(android.content.Context r5) {
        throw new UnsupportedOperationException("Method not decompiled: n7.z0.e(android.content.Context):n7.z0");
    }

    public static z0 n(View view) {
        return new z0(view);
    }

    public void D() {
        try {
            ((FileLock) this.f16847c).release();
            ((FileChannel) this.f16846b).close();
        } catch (IOException e7) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e7);
        }
    }

    public void E(s4.c1 c1Var) {
        s4.i1 i1Var = (s4.i1) ((a0.f) this.f16846b).get(c1Var);
        if (i1Var == null) {
            return;
        }
        i1Var.f46585a &= -2;
    }

    public void F(s4.c1 c1Var) {
        a0.f fVar = (a0.f) this.f16846b;
        a0.i iVar = (a0.i) this.f16847c;
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
            i1Var.f46585a = 0;
            i1Var.f46586b = null;
            i1Var.f46587c = null;
            s4.i1.d.i(i1Var);
        }
    }

    @Override
    public Paint H(String str) {
        return i6.S0(str);
    }

    @Override
    public int H0(int i10) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.f16846b;
        int indexOfKey = sparseIntArray.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        return i6.w0(null, i10, false);
    }

    @Override
    public y2.n K() {
        return new z0(17, ((p2.s) this.f16846b).K(), (List) this.f16847c);
    }

    @Override
    public void O(float f7, boolean z10) {
        lc0 lc0Var = (lc0) this.f16846b;
        wf0 wf0Var = (wf0) this.f16847c;
        d81 d81Var = wf0Var.d;
        if (d81Var != null) {
            long p5 = d81Var.p();
            float max = 2.8f / ((float) Math.max(60L, p5));
            long j3 = (((f7 / (1.0f - max)) * max) + f7) * ((float) p5);
            wf0Var.f32527e = j3;
            wf0Var.d.L(j3, !z10);
            if (!z10) {
                AndroidUtilities.cancelRunOnUIThread(lc0Var);
                AndroidUtilities.runOnUIThread(lc0Var, 120L);
            }
        }
    }

    @Override
    public y2.n V(p2.o oVar, p2.l lVar) {
        return new z0(17, ((p2.s) this.f16846b).V(oVar, lVar), (List) this.f16847c);
    }

    @Override
    public void Y(float f7, boolean z10) {
        ((TextView) this.f16846b).setText("Alpha " + j5.f37579e);
        j5.f37579e = f7;
        ((j5) this.f16847c).f37580b.M();
    }

    @Override
    public boolean a() {
        return i6.I.q();
    }

    @Override
    public boolean mo18c(float f7, float f10, int i10, View view) {
        uy uyVar = (uy) this.f16847c;
        if (view instanceof s2) {
            s2 s2Var = (s2) view;
            if (s2Var.f22833n2) {
                uyVar.W4(s2Var.getDialogId(), view);
                return true;
            }
        }
        ky kyVar = uyVar.f41495z0;
        if (kyVar != null && kyVar.getVisibility() == 0 && uyVar.f41495z0.f28780n) {
            return false;
        }
        return uyVar.x4(view, i10, f7, ((ty) this.f16846b).d);
    }

    @Override
    public ch.d f() {
        return new ch.f(this);
    }

    public void g(s4.c1 c1Var, b2.q0 q0Var) {
        a0.f fVar = (a0.f) this.f16846b;
        s4.i1 i1Var = (s4.i1) fVar.get(c1Var);
        if (i1Var == null) {
            i1Var = s4.i1.a();
            fVar.put(c1Var, i1Var);
        }
        i1Var.f46587c = q0Var;
        i1Var.f46585a |= 8;
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
            ((uy) this.f16847c).finishPreviewFragment();
        }
    }

    @Override
    public void j() {
        ((eu) this.f16846b).getText();
        ((g3) this.f16847c).b();
    }

    @Override
    public int j0(int i10) {
        return H0(i10);
    }

    @Override
    public int j1(int i10) {
        return ((SparseIntArray) this.f16846b).get(i10);
    }

    @Override
    public void m(float f7, float f10, int i10, int i11) {
        i6.q(f7, f10, i10, i11);
    }

    @Override
    public Object n2(Uri uri, g2.k kVar) {
        t2.a aVar = (t2.a) ((y2.n) this.f16846b).n2(uri, kVar);
        List list = (List) this.f16847c;
        if (list != null && !list.isEmpty()) {
            return (t2.a) aVar.a(list);
        }
        return aVar;
    }

    public void o() {
        String str = (String) this.f16846b;
        try {
            ba.c cVar = (ba.c) this.f16847c;
            cVar.getClass();
            new File(cVar.f3721b, str).createNewFile();
        } catch (IOException e7) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e7);
        }
    }

    @Override
    public void onError(d81 d81Var, Exception exc) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f16847c;
        int i10 = secretMediaViewer.f34406b0;
        if (i10 > 0) {
            secretMediaViewer.f34406b0 = i10 - 1;
            AndroidUtilities.runOnUIThread(new wx0(25, this, (File) this.f16846b), 100L);
            return;
        }
        FileLog.e(exc);
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f16847c;
        q41 q41Var = secretMediaViewer.f34424i1;
        if (secretMediaViewer.f34457y != null && secretMediaViewer.f34421h0 != null) {
            AndroidUtilities.cancelRunOnUIThread(q41Var);
            AndroidUtilities.runOnUIThread(q41Var);
            if (i10 != 4 && i10 != 1) {
                try {
                    secretMediaViewer.f34405b.getWindow().addFlags(128);
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            } else {
                try {
                    secretMediaViewer.f34405b.getWindow().clearFlags(128);
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            if (i10 == 3 && secretMediaViewer.f34452w.getVisibility() != 0) {
                secretMediaViewer.f34452w.setVisibility(0);
            }
            if (secretMediaViewer.f34457y.y() && i10 != 4) {
                if (!secretMediaViewer.E) {
                    secretMediaViewer.E = true;
                }
            } else if (secretMediaViewer.E) {
                secretMediaViewer.E = false;
                if (i10 == 4) {
                    secretMediaViewer.H = true;
                    if (secretMediaViewer.I) {
                        secretMediaViewer.e(true, !secretMediaViewer.f34439q1);
                        return;
                    }
                    secretMediaViewer.f34457y.L(0L, false);
                    secretMediaViewer.f34457y.C();
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
        l4 l4Var = ((SecretMediaViewer) this.f16847c).f34452w;
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
        String str = ((r2.o) nVar.f7904a).f45729a;
        r2.c cVar = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                r2.c cVar2 = new r2.c(mediaCodec, (HandlerThread) ((r2.b) this.f16846b).get(), new r2.e(mediaCodec, (HandlerThread) ((r2.b) this.f16847c).get()), (r2.j) nVar.f7908f);
                try {
                    Trace.endSection();
                    Surface surface = (Surface) nVar.d;
                    if (surface == null && ((r2.o) nVar.f7904a).h && Build.VERSION.SDK_INT >= 35) {
                        i10 = 8;
                    } else {
                        i10 = 0;
                    }
                    r2.c.l(cVar2, (MediaFormat) nVar.f7905b, surface, (MediaCrypto) nVar.f7907e, i10);
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
            ((uy) this.f16847c).movePreviewFragment(f7);
        }
    }

    public void r(String str, PrintWriter printWriter) {
        boolean z10;
        w1.b bVar = (w1.b) this.f16847c;
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
                    printWriter.println(aVar.f48452l);
                    a6.d dVar = aVar.f48452l;
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
                    if (aVar.f48454n != null) {
                        printWriter.print(str2);
                        printWriter.print("mCallbacks=");
                        printWriter.println(aVar.f48454n);
                        b2.p pVar = aVar.f48454n;
                        pVar.getClass();
                        printWriter.print(str2 + "  ");
                        printWriter.print("mDeliveredData=");
                        printWriter.println(pVar.f3426b);
                    }
                    printWriter.print(str2);
                    printWriter.print("mData=");
                    a6.d dVar2 = aVar.f48452l;
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

    public File s() {
        if (((File) this.f16846b) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f16846b) == null) {
                        k9.h hVar = (k9.h) this.f16847c;
                        hVar.a();
                        File filesDir = hVar.f14714a.getFilesDir();
                        this.f16846b = new File(filesDir, "PersistedInstallation." + ((k9.h) this.f16847c).d() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.f16846b;
    }

    public void t(ra.b bVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", bVar.f45967a);
            jSONObject.put("Status", m1.j.c(bVar.f45968b));
            jSONObject.put("AuthToken", bVar.f45969c);
            jSONObject.put("RefreshToken", bVar.d);
            jSONObject.put("TokenCreationEpochInSecs", bVar.f45971f);
            jSONObject.put("ExpiresInSecs", bVar.f45970e);
            jSONObject.put("FisError", bVar.f45972g);
            k9.h hVar = (k9.h) this.f16847c;
            hVar.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", hVar.f14714a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!createTempFile.renameTo(s())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    @Override
    public Task then(Object obj) {
        da.a aVar = (da.a) obj;
        u4.g gVar = (u4.g) this.f16847c;
        if (aVar == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return Tasks.forResult(null);
        }
        o0.a aVar2 = (o0.a) gVar.f47537c;
        w9.n.b((w9.n) ((o0.a) gVar.f47537c).f16928c);
        ((w9.n) aVar2.f16928c).f48958m.y((Executor) this.f16846b, null);
        ((w9.n) aVar2.f16928c).f48962q.trySetResult(null);
        return Tasks.forResult(null);
    }

    public String toString() {
        switch (this.f16845a) {
            case 21:
                StringBuilder sb2 = new StringBuilder(128);
                sb2.append("LoaderManager{");
                sb2.append(Integer.toHexString(System.identityHashCode(this)));
                sb2.append(" in ");
                Class<?> cls = ((androidx.lifecycle.t) this.f16846b).getClass();
                sb2.append(cls.getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(cls)));
                sb2.append("}}");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public b2.q0 w(s4.c1 c1Var, int i10) {
        s4.i1 i1Var;
        b2.q0 q0Var;
        a0.f fVar = (a0.f) this.f16846b;
        int c10 = fVar.c(c1Var);
        if (c10 >= 0 && (i1Var = (s4.i1) fVar.h(c10)) != null) {
            int i11 = i1Var.f46585a;
            if ((i11 & i10) != 0) {
                int i12 = i11 & (~i10);
                i1Var.f46585a = i12;
                if (i10 == 4) {
                    q0Var = i1Var.f46586b;
                } else if (i10 == 8) {
                    q0Var = i1Var.f46587c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i12 & 12) == 0) {
                    fVar.f(c10);
                    i1Var.f46585a = 0;
                    i1Var.f46586b = null;
                    i1Var.f46587c = null;
                    s4.i1.d.i(i1Var);
                }
                return q0Var;
            }
        }
        return null;
    }

    @Override
    public ColorFilter x() {
        return i6.f21149v3;
    }

    @Override
    public void y(Canvas canvas, float f7, float f10, float f11, float f12) {
        Paint paint = (Paint) this.f16846b;
        PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f16847c;
        rg.a1 a1Var = premiumPreviewFragment.m0;
        if (premiumPreviewFragment.f34127h0) {
            paint.setColor(premiumPreviewFragment.getThemedColor(i6.f20761a7));
            canvas.drawRect(f7, f10, f11, f12, paint);
            return;
        }
        a1Var.d(0, (-premiumPreviewFragment.f34121d0.getMeasuredWidth()) * 0.1f * premiumPreviewFragment.f34118b0, 0, premiumPreviewFragment.f34121d0.getMeasuredWidth(), 0.0f, premiumPreviewFragment.f34121d0.getMeasuredHeight());
        canvas.drawRect(f7, f10, f11, f12, a1Var.f46037f);
    }

    public ra.b z() {
        JSONObject jSONObject;
        String str;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(s());
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

    public z0(int i10, Object obj, Object obj2) {
        this.f16845a = i10;
        this.f16846b = obj;
        this.f16847c = obj2;
    }

    @Override
    public void onRenderedFirstFrame() {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f16847c;
        if (secretMediaViewer.f34409c0) {
            return;
        }
        secretMediaViewer.f34409c0 = true;
        secretMediaViewer.f34413e.invalidate();
    }

    public z0(Object obj, Object obj2, boolean z10, int i10) {
        this.f16845a = i10;
        this.f16847c = obj;
        this.f16846b = obj2;
    }

    public z0(v7.k kVar) {
        this.f16845a = 22;
        this.f16847c = new Object();
        this.f16846b = kVar;
        pa.b();
    }

    public z0(Context context) {
        this.f16845a = 18;
        this.f16846b = context;
        this.f16847c = null;
    }

    public z0() {
        this.f16845a = 16;
        this.f16846b = new a0.m(0);
        this.f16847c = new a0.i();
    }

    public z0(View view) {
        this.f16845a = 5;
        q71 q71Var = new q71(this, view);
        this.f16846b = q71Var;
        view.addOnLayoutChangeListener(q71Var);
    }

    public z0(androidx.lifecycle.t tVar, androidx.lifecycle.t0 t0Var) {
        this.f16845a = 21;
        this.f16846b = tVar;
        this.f16847c = (w1.b) new aa.a(t0Var, w1.b.f48455f).j(w1.b.class);
    }

    public z0(wf0 wf0Var) {
        this.f16845a = 4;
        this.f16847c = wf0Var;
        this.f16846b = new lc0(this, 10);
    }

    public z0(k9.h hVar) {
        this.f16845a = 15;
        this.f16847c = hVar;
    }

    @Override
    public void B() {
    }

    @Override
    public void b() {
    }

    @Override
    public void m0() {
    }

    @Override
    public void u() {
    }

    public z0(String str, String str2) {
        this.f16845a = 19;
        this.f16846b = str;
        this.f16847c = str2;
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
        this.f16845a = 12;
        this.f16846b = editText;
        q1.i iVar = new q1.i(editText);
        this.f16847c = iVar;
        editText.addTextChangedListener(iVar);
        if (q1.a.f44730b == null) {
            synchronized (q1.a.f44729a) {
                try {
                    if (q1.a.f44730b == null) {
                        ?? factory = new Editable.Factory();
                        try {
                            q1.a.f44731c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, q1.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        q1.a.f44730b = factory;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(q1.a.f44730b);
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
        this.f16845a = 8;
        this.f16847c = premiumPreviewFragment;
        this.f16846b = new Paint();
    }
}
