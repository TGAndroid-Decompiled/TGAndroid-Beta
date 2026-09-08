package n7;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
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
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Trace;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import di.tc;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.f3;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Components.cc0;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.eo0;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.kf0;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.xt;
import org.telegram.ui.Components.zt;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.i5;
import org.telegram.ui.l4;
import org.telegram.ui.rx0;
import org.telegram.ui.sw;
import org.telegram.ui.ty;
import org.telegram.ui.uy;
import org.telegram.ui.w41;
public final class z0 implements f6, eo0, xt, tc, cl0, gh.a, d71, p2.s, le.d, r2.k, y2.o, SuccessContinuation {
    public final int f16729a;
    public Object f16730b;
    public Object f16731c;

    public z0(int i10, Object obj, Object obj2) {
        this.f16729a = i10;
        this.f16730b = obj;
        this.f16731c = obj2;
    }

    public static z0 g(View view) {
        return new z0(view);
    }

    public void A(ra.b bVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", bVar.f45096a);
            jSONObject.put("Status", m1.j.c(bVar.f45097b));
            jSONObject.put("AuthToken", bVar.f45098c);
            jSONObject.put("RefreshToken", bVar.d);
            jSONObject.put("TokenCreationEpochInSecs", bVar.f45100f);
            jSONObject.put("ExpiresInSecs", bVar.f45099e);
            jSONObject.put("FisError", bVar.f45101g);
            k9.h hVar = (k9.h) this.f16731c;
            hVar.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", hVar.f14882a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!createTempFile.renameTo(w())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    @Override
    public void C(float f7, boolean z10) {
        cc0 cc0Var = (cc0) this.f16730b;
        kf0 kf0Var = (kf0) this.f16731c;
        g71 g71Var = kf0Var.d;
        if (g71Var != null) {
            long p5 = g71Var.p();
            float max = 2.8f / ((float) Math.max(60L, p5));
            long j3 = (((f7 / (1.0f - max)) * max) + f7) * ((float) p5);
            kf0Var.f27844e = j3;
            kf0Var.d.L(j3, !z10);
            if (!z10) {
                AndroidUtilities.cancelRunOnUIThread(cc0Var);
                AndroidUtilities.runOnUIThread(cc0Var, 120L);
            }
        }
    }

    public b2.q0 D(s4.c1 c1Var, int i10) {
        s4.i1 i1Var;
        b2.q0 q0Var;
        a0.f fVar = (a0.f) this.f16730b;
        int c10 = fVar.c(c1Var);
        if (c10 >= 0 && (i1Var = (s4.i1) fVar.h(c10)) != null) {
            int i11 = i1Var.f45828a;
            if ((i11 & i10) != 0) {
                int i12 = i11 & (~i10);
                i1Var.f45828a = i12;
                if (i10 == 4) {
                    q0Var = i1Var.f45829b;
                } else if (i10 == 8) {
                    q0Var = i1Var.f45830c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i12 & 12) == 0) {
                    fVar.f(c10);
                    i1Var.f45828a = 0;
                    i1Var.f45829b = null;
                    i1Var.f45830c = null;
                    s4.i1.d.i(i1Var);
                }
                return q0Var;
            }
        }
        return null;
    }

    @Override
    public void E(int i10, float f7, float f10, le.e eVar) {
        qh.i iVar = (qh.i) this.f16731c;
        iVar.f44679c.a(f7);
        iVar.d.a(f7);
        iVar.f44678b.a(f7);
        ((Runnable) this.f16730b).run();
    }

    public ra.b F() {
        JSONObject jSONObject;
        String str;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(w());
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
        SparseIntArray sparseIntArray = (SparseIntArray) this.f16730b;
        int indexOfKey = sparseIntArray.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        return j6.w0(null, i10, false);
    }

    public void H(s4.c1 c1Var) {
        s4.i1 i1Var = (s4.i1) ((a0.f) this.f16730b).get(c1Var);
        if (i1Var == null) {
            return;
        }
        i1Var.f45828a &= -2;
    }

    public void K(s4.c1 c1Var) {
        a0.f fVar = (a0.f) this.f16730b;
        a0.i iVar = (a0.i) this.f16731c;
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
            i1Var.f45828a = 0;
            i1Var.f45829b = null;
            i1Var.f45830c = null;
            s4.i1.d.i(i1Var);
        }
    }

    @Override
    public y2.o U() {
        return new z0(17, ((p2.s) this.f16730b).U(), (List) this.f16731c);
    }

    @Override
    public void X(float f7, boolean z10) {
        ((TextView) this.f16730b).setText("Alpha " + i5.f37268e);
        i5.f37268e = f7;
        ((i5) this.f16731c).f37269b.M();
    }

    @Override
    public boolean a() {
        return j6.I.q();
    }

    @Override
    public boolean mo18d(float f7, float f10, int i10, View view) {
        uy uyVar = (uy) this.f16731c;
        if (view instanceof r2) {
            r2 r2Var = (r2) view;
            if (r2Var.f22625n2) {
                uyVar.N4(r2Var.getDialogId(), view);
                return true;
            }
        }
        sw swVar = uyVar.f41391z0;
        if (swVar != null && swVar.getVisibility() == 0 && uyVar.f41391z0.f27648n) {
            return false;
        }
        return uyVar.o4(view, i10, f7, ((ty) this.f16730b).d);
    }

    public void f(s4.c1 c1Var, b2.q0 q0Var) {
        a0.f fVar = (a0.f) this.f16730b;
        s4.i1 i1Var = (s4.i1) fVar.get(c1Var);
        if (i1Var == null) {
            i1Var = s4.i1.a();
            fVar.put(c1Var, i1Var);
        }
        i1Var.f45830c = q0Var;
        i1Var.f45828a |= 8;
    }

    @Override
    public Object f2(Uri uri, g2.k kVar) {
        t2.a aVar = (t2.a) ((y2.o) this.f16730b).f2(uri, kVar);
        List list = (List) this.f16731c;
        if (list != null && !list.isEmpty()) {
            return (t2.a) aVar.a(list);
        }
        return aVar;
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
    public void h() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((uy) this.f16731c).finishPreviewFragment();
        }
    }

    @Override
    public int h0(int i10) {
        return G0(i10);
    }

    @Override
    public int h1(int i10) {
        return ((SparseIntArray) this.f16730b).get(i10);
    }

    @Override
    public y2.o i0(p2.o oVar, p2.l lVar) {
        return new z0(17, ((p2.s) this.f16730b).i0(oVar, lVar), (List) this.f16731c);
    }

    @Override
    public void j() {
        ((zt) this.f16730b).getText();
        ((f3) this.f16731c).b();
    }

    @Override
    public dh.d k() {
        return new dh.f(this);
    }

    @Override
    public void l(float f7, float f10, int i10, int i11) {
        j6.q(f7, f10, i10, i11);
    }

    @Override
    public int l0() {
        return 0;
    }

    @Override
    public boolean o0() {
        return false;
    }

    @Override
    public void onError(g71 g71Var, Exception exc) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f16731c;
        int i10 = secretMediaViewer.f34088b0;
        if (i10 > 0) {
            secretMediaViewer.f34088b0 = i10 - 1;
            AndroidUtilities.runOnUIThread(new rx0(28, this, (File) this.f16730b), 100L);
            return;
        }
        FileLog.e(exc);
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f16731c;
        w41 w41Var = secretMediaViewer.f34106i1;
        if (secretMediaViewer.f34139y != null && secretMediaViewer.f34103h0 != null) {
            AndroidUtilities.cancelRunOnUIThread(w41Var);
            AndroidUtilities.runOnUIThread(w41Var);
            if (i10 != 4 && i10 != 1) {
                try {
                    secretMediaViewer.f34087b.getWindow().addFlags(128);
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            } else {
                try {
                    secretMediaViewer.f34087b.getWindow().clearFlags(128);
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            if (i10 == 3 && secretMediaViewer.f34134w.getVisibility() != 0) {
                secretMediaViewer.f34134w.setVisibility(0);
            }
            if (secretMediaViewer.f34139y.y() && i10 != 4) {
                if (!secretMediaViewer.E) {
                    secretMediaViewer.E = true;
                }
            } else if (secretMediaViewer.E) {
                secretMediaViewer.E = false;
                if (i10 == 4) {
                    secretMediaViewer.H = true;
                    if (secretMediaViewer.I) {
                        secretMediaViewer.e(true, !secretMediaViewer.f34121q1);
                        return;
                    }
                    secretMediaViewer.f34139y.L(0L, false);
                    secretMediaViewer.f34139y.C();
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
        l4 l4Var = ((SecretMediaViewer) this.f16731c).f34134w;
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
    public void q(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((uy) this.f16731c).movePreviewFragment(f7);
        }
    }

    @Override
    public r2.c p(com.google.firebase.messaging.n nVar) {
        MediaCodec mediaCodec;
        int i10;
        String str = ((r2.o) nVar.f6401a).f44859a;
        r2.c cVar = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                r2.c cVar2 = new r2.c(mediaCodec, (HandlerThread) ((r2.b) this.f16730b).get(), new r2.e(mediaCodec, (HandlerThread) ((r2.b) this.f16731c).get()), (r2.j) nVar.f6405f);
                try {
                    Trace.endSection();
                    Surface surface = (Surface) nVar.d;
                    if (surface == null && ((r2.o) nVar.f6401a).h && Build.VERSION.SDK_INT >= 35) {
                        i10 = 8;
                    } else {
                        i10 = 0;
                    }
                    r2.c.l(cVar2, (MediaFormat) nVar.f6402b, surface, (MediaCrypto) nVar.f6404e, i10);
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
    public Task then(Object obj) {
        switch (this.f16729a) {
            case 22:
                da.a aVar = (da.a) obj;
                w9.m mVar = ((w9.k) this.f16731c).f48427e;
                if (aVar == null) {
                    Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
                    return Tasks.forResult(null);
                }
                return Tasks.whenAll(w9.m.b(mVar), mVar.f48441m.y((Executor) this.f16730b, null));
            default:
                return ((w9.m) this.f16731c).f48434e.i(new u4.g(1, this, (Boolean) obj));
        }
    }

    public ArrayList u() {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        Context context = (Context) this.f16730b;
        Class cls = (Class) ((k2.g0) this.f16731c).f14604b;
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, cls), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", cls + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
        }
        for (String str2 : arrayList) {
            arrayList2.add(new q9.c(str2, 0));
        }
        return arrayList2;
    }

    @Override
    public void v(Canvas canvas, float f7, float f10, float f11, float f12) {
        Paint paint = (Paint) this.f16730b;
        PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f16731c;
        sg.c1 c1Var = premiumPreviewFragment.m0;
        if (premiumPreviewFragment.f33809h0) {
            paint.setColor(premiumPreviewFragment.getThemedColor(j6.f20634a7));
            canvas.drawRect(f7, f10, f11, f12, paint);
            return;
        }
        c1Var.d(0, (-premiumPreviewFragment.f33803d0.getMeasuredWidth()) * 0.1f * premiumPreviewFragment.f33800b0, 0, premiumPreviewFragment.f33803d0.getMeasuredWidth(), 0.0f, premiumPreviewFragment.f33803d0.getMeasuredHeight());
        canvas.drawRect(f7, f10, f11, f12, c1Var.f46063f);
    }

    public File w() {
        if (((File) this.f16730b) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f16730b) == null) {
                        k9.h hVar = (k9.h) this.f16731c;
                        hVar.a();
                        File filesDir = hVar.f14882a.getFilesDir();
                        this.f16730b = new File(filesDir, "PersistedInstallation." + ((k9.h) this.f16731c).d() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.f16730b;
    }

    @Override
    public ColorFilter x() {
        return j6.f21014v3;
    }

    @Override
    public void z(float r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: n7.z0.z(float, int):void");
    }

    public z0(int i10, boolean z10) {
        this.f16729a = i10;
    }

    @Override
    public void onRenderedFirstFrame() {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f16731c;
        if (secretMediaViewer.f34091c0) {
            return;
        }
        secretMediaViewer.f34091c0 = true;
        secretMediaViewer.f34095e.invalidate();
    }

    public z0(Object obj, Object obj2, boolean z10, int i10) {
        this.f16729a = i10;
        this.f16731c = obj;
        this.f16730b = obj2;
    }

    public z0(Context context) {
        this.f16729a = 18;
        this.f16730b = context;
        this.f16731c = null;
    }

    public z0(int i10) {
        this.f16729a = i10;
        switch (i10) {
            case 24:
                this.f16730b = new AtomicInteger();
                this.f16731c = new AtomicInteger();
                return;
            default:
                this.f16730b = new a0.l(0);
                this.f16731c = new a0.i();
                return;
        }
    }

    public z0(View view) {
        this.f16729a = 5;
        r61 r61Var = new r61(this, view);
        this.f16730b = r61Var;
        view.addOnLayoutChangeListener(r61Var);
    }

    public z0(qg.h0 h0Var) {
        this.f16729a = 12;
        this.f16730b = h0Var;
    }

    public z0(kf0 kf0Var) {
        this.f16729a = 4;
        this.f16731c = kf0Var;
        this.f16730b = new cc0(this, 9);
    }

    public z0(k9.h hVar) {
        this.f16729a = 15;
        this.f16731c = hVar;
    }

    public z0(String str, String str2) {
        this.f16729a = 19;
        this.f16730b = str;
        this.f16731c = str2;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("userId should not be empty");
        }
    }

    @Override
    public void B() {
    }

    @Override
    public void V() {
    }

    @Override
    public void e() {
    }

    @Override
    public void n() {
    }

    public z0(w9.k kVar, Executor executor, String str) {
        this.f16729a = 22;
        this.f16731c = kVar;
        this.f16730b = executor;
    }

    public z0(PremiumPreviewFragment premiumPreviewFragment) {
        this.f16729a = 8;
        this.f16731c = premiumPreviewFragment;
        this.f16730b = new Paint();
    }

    @Override
    public void I(long j3) {
    }

    @Override
    public void J(boolean z10) {
    }

    @Override
    public void O(float f7) {
    }

    @Override
    public void R(float f7) {
    }

    @Override
    public void T(float f7) {
    }

    @Override
    public void Z(float f7) {
    }

    @Override
    public void b(int i10) {
    }

    @Override
    public void c(float f7) {
    }

    @Override
    public void d0(long j3) {
    }

    @Override
    public void i(float f7) {
    }

    @Override
    public void o(float f7) {
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
    public void r(boolean z10) {
    }

    @Override
    public void y(float f7) {
    }

    @Override
    public void N(float f7, int i10) {
    }

    @Override
    public void O0(int i10, int i11) {
    }

    @Override
    public void S(float f7, int i10) {
    }

    @Override
    public void a0(int i10, long j3) {
    }

    @Override
    public void m(long j3, boolean z10) {
    }

    @Override
    public void t(float f7, int i10) {
    }
}
