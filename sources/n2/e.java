package n2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import android.widget.TextView;
import androidx.lifecycle.t0;
import androidx.lifecycle.z;
import b2.u0;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import e2.m0;
import e9.l0;
import e9.n0;
import ei.zb;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Cells.e3;
import org.telegram.ui.Cells.z1;
import org.telegram.ui.Components.eu;
import org.telegram.ui.Components.fp0;
import org.telegram.ui.Components.g81;
import org.telegram.ui.Components.gu;
import org.telegram.ui.Components.hg0;
import org.telegram.ui.Components.j81;
import org.telegram.ui.Components.la;
import org.telegram.ui.Components.wb0;
import org.telegram.ui.Components.yy0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.hm0;
import org.telegram.ui.l7;
import org.telegram.ui.lv0;
import org.telegram.ui.m31;
import org.telegram.ui.m5;
import org.telegram.ui.n4;
import org.telegram.ui.nj0;
import org.telegram.ui.nm0;
import org.telegram.ui.v6;
import org.telegram.ui.xu;
import org.telegram.ui.yu;
import org.telegram.ui.zm0;
import qg.j0;
import s4.b1;
import s4.i1;
import u2.e1;
import w7.pa;
public final class e implements fp0, eu, zb, l7, nm0, gh.a, g81, p2.u, ne.d, com.google.android.gms.common.api.internal.r, SuccessContinuation {
    public final int f17101a;
    public Object f17102b;
    public Object f17103c;

    public e(int i10, Object obj, Object obj2) {
        this.f17101a = i10;
        this.f17102b = obj;
        this.f17103c = obj2;
    }

    public static n2.e f(android.content.Context r5) {
        throw new UnsupportedOperationException("Method not decompiled: n2.e.f(android.content.Context):n2.e");
    }

    public String E(String str) {
        Resources resources = (Resources) this.f17102b;
        int identifier = resources.getIdentifier(str, "string", (String) this.f17103c);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public void G(sa.a aVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", aVar.f46578a);
            jSONObject.put("Status", m1.j.c(aVar.f46579b));
            jSONObject.put("AuthToken", aVar.f46580c);
            jSONObject.put("RefreshToken", aVar.d);
            jSONObject.put("TokenCreationEpochInSecs", aVar.f46581f);
            jSONObject.put("ExpiresInSecs", aVar.e);
            jSONObject.put("FisError", aVar.f46582g);
            l9.h hVar = (l9.h) this.f17103c;
            hVar.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", hVar.f16030a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!createTempFile.renameTo(x())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    @Override
    public void H(float r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: n2.e.H(float, int):void");
    }

    @Override
    public y2.n J() {
        return new mi.q(21, ((p2.u) this.f17102b).J(), (List) this.f17103c);
    }

    @Override
    public void L(float f7, boolean z10) {
        ((TextView) this.f17102b).setText("Alpha " + m5.e);
        m5.e = f7;
        ((m5) this.f17103c).f39442b.L();
    }

    public void M(Exception exc, boolean z10) {
        int i10;
        this.f17103c = null;
        HashSet hashSet = (HashSet) this.f17102b;
        n0 u10 = n0.u(hashSet);
        hashSet.clear();
        l0 listIterator = u10.listIterator(0);
        while (listIterator.hasNext()) {
            b bVar = (b) listIterator.next();
            bVar.getClass();
            if (z10) {
                i10 = 1;
            } else {
                i10 = 3;
            }
            bVar.l(i10, exc);
        }
    }

    public void N(o0.f fVar) {
        androidx.biometric.o oVar = (androidx.biometric.o) this.f17103c;
        a6.i iVar = (a6.i) this.f17102b;
        int i10 = fVar.f17585b;
        if (i10 == 0) {
            oVar.execute(new j9.u(20, iVar, fVar.f17584a));
        } else {
            oVar.execute(new androidx.activity.i(iVar, i10));
        }
    }

    public u0 O(b1 b1Var, int i10) {
        i1 i1Var;
        u0 u0Var;
        a0.f fVar = (a0.f) this.f17102b;
        int c10 = fVar.c(b1Var);
        if (c10 >= 0 && (i1Var = (i1) fVar.h(c10)) != null) {
            int i11 = i1Var.f46399a;
            if ((i11 & i10) != 0) {
                int i12 = i11 & (~i10);
                i1Var.f46399a = i12;
                if (i10 == 4) {
                    u0Var = i1Var.f46400b;
                } else if (i10 == 8) {
                    u0Var = i1Var.f46401c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i12 & 12) == 0) {
                    fVar.f(c10);
                    i1Var.f46399a = 0;
                    i1Var.f46400b = null;
                    i1Var.f46401c = null;
                    i1.d.w(i1Var);
                }
                return u0Var;
            }
        }
        return null;
    }

    public void P(b bVar) {
        ((HashSet) this.f17102b).add(bVar);
        if (((b) this.f17103c) != null) {
            return;
        }
        this.f17103c = bVar;
        q o10 = bVar.f17077b.o();
        bVar.f17097z = o10;
        android.support.v4.media.session.f fVar = bVar.f17091s;
        String str = m0.f8259a;
        o10.getClass();
        fVar.getClass();
        fVar.obtainMessage(1, new a(u2.v.f47897g.getAndIncrement(), true, SystemClock.elapsedRealtime(), o10)).sendToTarget();
    }

    public sa.a Q() {
        JSONObject jSONObject;
        String str;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(x());
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
                return new sa.a(optString, i10, optString2, optString3, optLong2, optLong, optString4);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
        throw new NullPointerException("Null registrationStatus");
    }

    public void R() {
        try {
            ((FileLock) this.f17103c).release();
            ((FileChannel) this.f17102b).close();
        } catch (IOException e) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
        }
    }

    public void S(b1 b1Var) {
        i1 i1Var = (i1) ((a0.f) this.f17102b).get(b1Var);
        if (i1Var == null) {
            return;
        }
        i1Var.f46399a &= -2;
    }

    public void T(b1 b1Var) {
        a0.f fVar = (a0.f) this.f17102b;
        a0.h hVar = (a0.h) this.f17103c;
        int m10 = hVar.m() - 1;
        while (true) {
            if (m10 < 0) {
                break;
            } else if (b1Var == hVar.n(m10)) {
                Object[] objArr = hVar.f16c;
                Object obj = objArr[m10];
                Object obj2 = a0.i.f17a;
                if (obj != obj2) {
                    objArr[m10] = obj2;
                    hVar.f14a = true;
                }
            } else {
                m10--;
            }
        }
        i1 i1Var = (i1) fVar.get(b1Var);
        if (i1Var != null) {
            fVar.remove(b1Var);
            i1Var.f46399a = 0;
            i1Var.f46400b = null;
            i1Var.f46401c = null;
            i1.d.w(i1Var);
        }
    }

    @Override
    public y2.n U(p2.q qVar, p2.n nVar) {
        return new mi.q(21, ((p2.u) this.f17102b).U(qVar, nVar), (List) this.f17103c);
    }

    public c3.l0 V(int i10) {
        int i11 = 0;
        while (true) {
            int[] iArr = (int[]) this.f17102b;
            if (i11 < iArr.length) {
                if (i10 == iArr[i11]) {
                    return ((e1[]) this.f17103c)[i11];
                }
                i11++;
            } else {
                e2.a.c("BaseMediaChunkOutput", "Unmatched track of type: " + i10);
                return new c3.p();
            }
        }
    }

    @Override
    public int Y() {
        return 0;
    }

    @Override
    public void a(String str, String str2) {
        zm0 zm0Var = ((hm0) this.f17103c).f37903a;
        if ("PHONE_VERIFICATION_NEEDED".equals(str)) {
            zm0Var.N1(true, str2, (nj0) this.f17102b, this, zm0Var.B1);
        } else {
            zm0Var.M1(true, false);
        }
    }

    @Override
    public void accept(java.lang.Object r53, java.lang.Object r54) {
        throw new UnsupportedOperationException("Method not decompiled: n2.e.accept(java.lang.Object, java.lang.Object):void");
    }

    @Override
    public dh.d d() {
        if (Build.VERSION.SDK_INT >= 29) {
            dh.e eVar = new dh.e(this);
            ((PhotoViewer) this.f17103c).Z.add(eVar);
            return eVar;
        }
        return new dh.f(this);
    }

    @Override
    public void dismiss() {
        ((yu) this.f17103c).dismiss();
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public void h() {
        ((e3) this.f17103c).b(((gu) this.f17102b).getText());
    }

    public void l(b1 b1Var, u0 u0Var) {
        a0.f fVar = (a0.f) this.f17102b;
        i1 i1Var = (i1) fVar.get(b1Var);
        if (i1Var == null) {
            i1Var = i1.a();
            fVar.put(b1Var, i1Var);
        }
        i1Var.f46401c = u0Var;
        i1Var.f46399a |= 8;
    }

    @Override
    public void o(int i10, float f7, float f10, ne.e eVar) {
        qh.i iVar = (qh.i) this.f17103c;
        iVar.f45153c.a(f7);
        iVar.d.a(f7);
        iVar.f45152b.a(f7);
        ((Runnable) this.f17102b).run();
    }

    @Override
    public void onError(j81 j81Var, Exception exc) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f17103c;
        int i10 = secretMediaViewer.f34091b0;
        if (i10 > 0) {
            secretMediaViewer.f34091b0 = i10 - 1;
            AndroidUtilities.runOnUIThread(new lv0(28, this, (File) this.f17102b), 100L);
            return;
        }
        FileLog.e(exc);
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f17103c;
        m31 m31Var = secretMediaViewer.f34108i1;
        if (secretMediaViewer.f34141y != null && secretMediaViewer.f34105h0 != null) {
            AndroidUtilities.cancelRunOnUIThread(m31Var);
            AndroidUtilities.runOnUIThread(m31Var);
            if (i10 != 4 && i10 != 1) {
                try {
                    secretMediaViewer.f34090b.getWindow().addFlags(128);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            } else {
                try {
                    secretMediaViewer.f34090b.getWindow().clearFlags(128);
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
            if (i10 == 3 && secretMediaViewer.f34136w.getVisibility() != 0) {
                secretMediaViewer.f34136w.setVisibility(0);
            }
            if (secretMediaViewer.f34141y.y() && i10 != 4) {
                if (!secretMediaViewer.E) {
                    secretMediaViewer.E = true;
                }
            } else if (secretMediaViewer.E) {
                secretMediaViewer.E = false;
                if (i10 == 4) {
                    secretMediaViewer.H = true;
                    if (secretMediaViewer.I) {
                        secretMediaViewer.e(true, !secretMediaViewer.f34123q1);
                        return;
                    }
                    secretMediaViewer.f34141y.L(0L, false);
                    secretMediaViewer.f34141y.C();
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
        n4 n4Var = ((SecretMediaViewer) this.f17103c).f34136w;
        if (n4Var != null) {
            if (i11 == 0) {
                f10 = 1.0f;
            } else {
                f10 = (i10 * f7) / i11;
            }
            n4Var.a(f10, 0);
        }
    }

    @Override
    public void q(float f7, boolean z10) {
        wb0 wb0Var = (wb0) this.f17102b;
        hg0 hg0Var = (hg0) this.f17103c;
        j81 j81Var = hg0Var.d;
        if (j81Var != null) {
            long p5 = j81Var.p();
            float max = 2.8f / ((float) Math.max(60L, p5));
            long j10 = (((f7 / (1.0f - max)) * max) + f7) * ((float) p5);
            hg0Var.e = j10;
            hg0Var.d.L(j10, !z10);
            if (!z10) {
                AndroidUtilities.cancelRunOnUIThread(wb0Var);
                AndroidUtilities.runOnUIThread(wb0Var, 120L);
            }
        }
    }

    public void r(String str, PrintWriter printWriter) {
        boolean z10;
        w1.b bVar = (w1.b) this.f17103c;
        if (bVar.d.f30c > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            int i10 = 0;
            while (true) {
                a0.m mVar = bVar.d;
                if (i10 < mVar.f30c) {
                    w1.a aVar = (w1.a) mVar.f29b[i10];
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(bVar.d.f28a[i10]);
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
                    printWriter.println(aVar.f48901l);
                    a6.d dVar = aVar.f48901l;
                    String str3 = str2 + "  ";
                    dVar.getClass();
                    printWriter.print(str3);
                    printWriter.print("mId=");
                    printWriter.print(0);
                    printWriter.print(" mListener=");
                    printWriter.println(dVar.f294a);
                    if (dVar.f295b || dVar.e) {
                        printWriter.print(str3);
                        printWriter.print("mStarted=");
                        printWriter.print(dVar.f295b);
                        printWriter.print(" mContentChanged=");
                        printWriter.print(dVar.e);
                        printWriter.print(" mProcessingChange=");
                        printWriter.println(false);
                    }
                    if (dVar.f296c || dVar.d) {
                        printWriter.print(str3);
                        printWriter.print("mAbandoned=");
                        printWriter.print(dVar.f296c);
                        printWriter.print(" mReset=");
                        printWriter.println(dVar.d);
                    }
                    if (dVar.f298g != null) {
                        printWriter.print(str3);
                        printWriter.print("mTask=");
                        printWriter.print(dVar.f298g);
                        printWriter.print(" waiting=");
                        dVar.f298g.getClass();
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
                    if (aVar.f48903n != null) {
                        printWriter.print(str2);
                        printWriter.print("mCallbacks=");
                        printWriter.println(aVar.f48903n);
                        b2.t tVar = aVar.f48903n;
                        tVar.getClass();
                        printWriter.print(str2 + "  ");
                        printWriter.print("mDeliveredData=");
                        printWriter.println(tVar.f4012b);
                    }
                    printWriter.print(str2);
                    printWriter.print("mData=");
                    a6.d dVar2 = aVar.f48901l;
                    Object obj2 = aVar.e;
                    if (obj2 != z.f3386k) {
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
                    if (aVar.f3389c > 0) {
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
    public void s0(v6 v6Var, bi.b bVar, boolean z10) {
        yu yuVar = (yu) this.f17103c;
        xu xuVar = yuVar.X;
        if (bVar != null) {
            ((bi.c) this.f17102b).i(bVar);
            yuVar.f43957e0.d();
            bi.c cVar = yuVar.f43959g0;
            yy0[] yy0VarArr = yuVar.f43954b0;
            z1[] z1VarArr = yuVar.f43955c0;
            z1 z1Var = z1VarArr[0];
            if (z1Var != null) {
                yy0 yy0Var = yy0VarArr[0];
                boolean z11 = cVar.f4442m;
                yy0Var.f33088c = z11;
                z1Var.c(z11, true);
            }
            z1 z1Var2 = z1VarArr[1];
            if (z1Var2 != null) {
                yy0 yy0Var2 = yy0VarArr[1];
                boolean z12 = cVar.f4443n;
                yy0Var2.f33088c = z12;
                z1Var2.c(z12, true);
            }
            z1 z1Var3 = z1VarArr[2];
            if (z1Var3 != null) {
                yy0 yy0Var3 = yy0VarArr[2];
                boolean z13 = cVar.f4444o;
                yy0Var3.f33088c = z13;
                z1Var3.c(z13, true);
            }
            z1 z1Var4 = z1VarArr[3];
            if (z1Var4 != null) {
                yy0 yy0Var4 = yy0VarArr[3];
                boolean z14 = cVar.f4445p;
                yy0Var4.f33088c = z14;
                z1Var4.c(z14, true);
            }
            z1 z1Var5 = z1VarArr[4];
            if (z1Var5 != null) {
                yy0 yy0Var5 = yy0VarArr[4];
                boolean z15 = cVar.f4446q;
                yy0Var5.f33088c = z15;
                z1Var5.c(z15, true);
            }
            yuVar.f43953a0.a(xuVar.d(), true);
            xuVar.c(true);
        }
    }

    @Override
    public Task then(Object obj) {
        switch (this.f17101a) {
            case 25:
                ea.a aVar = (ea.a) obj;
                x9.m mVar = ((x9.k) this.f17103c).e;
                if (aVar == null) {
                    Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
                    return Tasks.forResult(null);
                }
                return Tasks.whenAll(x9.m.b(mVar), mVar.f50149m.v((Executor) this.f17102b, null));
            default:
                return ((x9.m) this.f17103c).e.w(new u4.f(1, this, (Boolean) obj));
        }
    }

    public String toString() {
        switch (this.f17101a) {
            case 21:
                StringBuilder sb2 = new StringBuilder(128);
                sb2.append("LoaderManager{");
                sb2.append(Integer.toHexString(System.identityHashCode(this)));
                sb2.append(" in ");
                Class<?> cls = ((androidx.lifecycle.t) this.f17102b).getClass();
                sb2.append(cls.getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(cls)));
                sb2.append("}}");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public byte[] u(n3.a aVar) {
        DataOutputStream dataOutputStream = (DataOutputStream) this.f17103c;
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.f17102b;
        byteArrayOutputStream.reset();
        try {
            dataOutputStream.writeBytes(aVar.f17144a);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeBytes(aVar.f17145b);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(aVar.f17146c);
            dataOutputStream.writeLong(aVar.d);
            dataOutputStream.write(aVar.e);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public File x() {
        if (((File) this.f17102b) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f17102b) == null) {
                        l9.h hVar = (l9.h) this.f17103c;
                        hVar.a();
                        File filesDir = hVar.f16030a.getFilesDir();
                        this.f17102b = new File(filesDir, "PersistedInstallation." + ((l9.h) this.f17103c).d() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.f17102b;
    }

    @Override
    public void y(Canvas canvas, float f7, float f10, float f11, float f12) {
        canvas.save();
        canvas.clipRect(f7, f10, f11, f12);
        ((PhotoViewer) this.f17103c).V0(canvas, (la) this.f17102b, -14277082, 855638016, false, true, true);
        canvas.drawColor(637534208);
        canvas.restore();
    }

    public e(int i10, boolean z10) {
        this.f17101a = i10;
    }

    @Override
    public void onRenderedFirstFrame() {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f17103c;
        if (secretMediaViewer.f34094c0) {
            return;
        }
        secretMediaViewer.f34094c0 = true;
        secretMediaViewer.e.invalidate();
    }

    public e(Object obj, Object obj2, boolean z10, int i10) {
        this.f17101a = i10;
        this.f17103c = obj;
        this.f17102b = obj2;
    }

    public e(Context context) {
        this.f17101a = 2;
        n6.l.h(context);
        Resources resources = context.getResources();
        this.f17102b = resources;
        this.f17103c = resources.getResourcePackageName(2131689566);
    }

    public e(u2.c cVar) {
        this.f17101a = 22;
        this.f17103c = new Object();
        this.f17102b = cVar;
        pa.b();
    }

    public e(androidx.lifecycle.t tVar, t0 t0Var) {
        this.f17101a = 21;
        this.f17102b = tVar;
        this.f17103c = (w1.b) new androidx.biometric.e(t0Var, w1.b.f48904f).j(w1.b.class);
    }

    public e(j0 j0Var) {
        this.f17101a = 13;
        this.f17102b = j0Var;
    }

    public e(hg0 hg0Var) {
        this.f17101a = 7;
        this.f17103c = hg0Var;
        this.f17102b = new wb0(this, 10);
    }

    public e(l9.h hVar) {
        this.f17101a = 18;
        this.f17103c = hVar;
    }

    public e(x9.k kVar, Executor executor, String str) {
        this.f17101a = 25;
        this.f17103c = kVar;
        this.f17102b = executor;
    }

    public e(int i10) {
        this.f17101a = i10;
        switch (i10) {
            case 1:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.f17102b = byteArrayOutputStream;
                this.f17103c = new DataOutputStream(byteArrayOutputStream);
                return;
            case 17:
                this.f17102b = new a0.l(0);
                this.f17103c = new a0.h();
                return;
            case 27:
                this.f17102b = new AtomicInteger();
                this.f17103c = new AtomicInteger();
                return;
            default:
                this.f17102b = new HashSet();
                return;
        }
    }

    @Override
    public void D() {
    }

    @Override
    public void W0() {
    }

    @Override
    public void b() {
    }

    @Override
    public void clear() {
    }

    @Override
    public void j() {
    }

    @Override
    public void v() {
    }

    @Override
    public void A(float f7) {
    }

    @Override
    public void C(float f7) {
    }

    @Override
    public void F(float f7) {
    }

    @Override
    public void K(long j10) {
    }

    @Override
    public void c(int i10) {
    }

    @Override
    public void e(float f7) {
    }

    @Override
    public void g(float f7) {
    }

    @Override
    public void k(float f7) {
    }

    @Override
    public void m(boolean z10) {
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
    public void p(float f7) {
    }

    @Override
    public void s(long j10) {
    }

    @Override
    public void t(boolean z10) {
    }

    @Override
    public void z(float f7) {
    }

    public e(PhotoViewer photoViewer) {
        this.f17101a = 10;
        this.f17103c = photoViewer;
        this.f17102b = new la(photoViewer.f33554b0, photoViewer.f33582e0, 0, false);
    }

    @Override
    public void B(float f7, int i10) {
    }

    @Override
    public void I(int i10, long j10) {
    }

    @Override
    public void i(long j10, boolean z10) {
    }

    @Override
    public void n(float f7, int i10) {
    }

    @Override
    public void w(float f7, int i10) {
    }
}
