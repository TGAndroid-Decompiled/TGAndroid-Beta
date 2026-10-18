package mi;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import ei.zb;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import n4.v;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.a2;
import org.telegram.ui.Cells.f3;
import org.telegram.ui.Components.a81;
import org.telegram.ui.Components.bp0;
import org.telegram.ui.Components.dg0;
import org.telegram.ui.Components.gu;
import org.telegram.ui.Components.iu;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.rc0;
import org.telegram.ui.Components.uy0;
import org.telegram.ui.Components.x71;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.ek0;
import org.telegram.ui.gm0;
import org.telegram.ui.l31;
import org.telegram.ui.l7;
import org.telegram.ui.lv0;
import org.telegram.ui.mm0;
import org.telegram.ui.n5;
import org.telegram.ui.o4;
import org.telegram.ui.v6;
import org.telegram.ui.wu;
import org.telegram.ui.xm0;
import org.telegram.ui.xu;
import s4.g1;
import s4.h1;
public class q implements ne.f, d6, bp0, gu, zb, l7, mm0, gh.a, x71, n5.b, y2.n, SuccessContinuation {
    public final int f16973a;
    public Object f16974b;
    public Object f16975c;

    public q(int i10, byte b10) {
        this.f16973a = i10;
    }

    @Override
    public void A(float f7, boolean z10) {
        rc0 rc0Var = (rc0) this.f16974b;
        dg0 dg0Var = (dg0) this.f16975c;
        a81 a81Var = dg0Var.d;
        if (a81Var != null) {
            long p5 = a81Var.p();
            float max = 2.8f / ((float) Math.max(60L, p5));
            long j10 = (((f7 / (1.0f - max)) * max) + f7) * ((float) p5);
            dg0Var.e = j10;
            dg0Var.d.L(j10, !z10);
            if (!z10) {
                AndroidUtilities.cancelRunOnUIThread(rc0Var);
                AndroidUtilities.runOnUIThread(rc0Var, 120L);
            }
        }
    }

    @Override
    public void B(int i10, int i11) {
        switch (this.f16973a) {
            case 7:
                return;
            default:
                d6 d6Var = (d6) this.f16975c;
                if (d6Var != null) {
                    d6Var.B(i10, i11);
                    return;
                }
                return;
        }
    }

    @Override
    public void D() {
        ((ne.k) this.f16974b).e((ne.l) this.f16975c);
    }

    @Override
    public void F() {
        ((iu) this.f16974b).getText();
        ((f3) this.f16975c).b();
    }

    public void H(Object obj, String str) {
        ((ArrayList) this.f16974b).add(a1.g.C(str, "=", String.valueOf(obj)));
    }

    @Override
    public int I(int i10) {
        switch (this.f16973a) {
            case 7:
                return ((SparseIntArray) this.f16974b).get(i10);
            default:
                d6 d6Var = (d6) this.f16975c;
                if (d6Var == null) {
                    return h6.x0(null, i10, false);
                }
                return d6Var.I(i10);
        }
    }

    @Override
    public void L(float f7, boolean z10) {
        ((TextView) this.f16974b).setText("Alpha " + n5.e);
        n5.e = f7;
        ((n5) this.f16975c).f39337b.M();
    }

    public void O() {
        String str = (String) this.f16974b;
        try {
            ca.c cVar = (ca.c) this.f16975c;
            cVar.getClass();
            new File(cVar.f5049b, str).createNewFile();
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e);
        }
    }

    public ArrayList R() {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        Context context = (Context) this.f16974b;
        Class cls = (Class) ((l2.f) this.f16975c).f15844b;
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
            arrayList2.add(new r9.c(str2, 0));
        }
        return arrayList2;
    }

    public View U(int i10, int i11, int i12, int i13) {
        int i14;
        g1 g1Var = (g1) this.f16975c;
        h1 h1Var = (h1) this.f16974b;
        int k10 = h1Var.k();
        int z10 = h1Var.z();
        if (i11 > i10) {
            i14 = 1;
        } else {
            i14 = -1;
        }
        View view = null;
        while (i10 != i11) {
            View L = h1Var.L(i10);
            int d = h1Var.d(L);
            int X = h1Var.X(L);
            g1Var.f46006b = k10;
            g1Var.f46007c = z10;
            g1Var.d = d;
            g1Var.e = X;
            if (i12 != 0) {
                g1Var.f46005a = i12;
                if (g1Var.a()) {
                    return L;
                }
            }
            if (i13 != 0) {
                g1Var.f46005a = i13;
                if (g1Var.a()) {
                    view = L;
                }
            }
            i10 += i14;
        }
        return view;
    }

    public boolean V(v vVar, String str) {
        Context context = (Context) this.f16974b;
        int i10 = vVar.f17132b;
        if (i10 < 0) {
            if (context.getPackageManager().checkPermission(str, vVar.f17131a) == 0) {
                return true;
            }
            return false;
        } else if (context.checkPermission(str, i10, vVar.f17133c) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean X(View view) {
        g1 g1Var = (g1) this.f16975c;
        h1 h1Var = (h1) this.f16974b;
        int k10 = h1Var.k();
        int z10 = h1Var.z();
        int d = h1Var.d(view);
        int X = h1Var.X(view);
        g1Var.f46006b = k10;
        g1Var.f46007c = z10;
        g1Var.d = d;
        g1Var.e = X;
        g1Var.f46005a = 24579;
        return g1Var.a();
    }

    @Override
    public int Y() {
        return 0;
    }

    @Override
    public boolean a() {
        switch (this.f16973a) {
            case 7:
            default:
                return h6.I.q();
        }
    }

    public int a0(Context context, com.google.android.gms.common.api.c cVar) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.f16974b;
        n6.l.h(context);
        n6.l.h(cVar);
        int i10 = 0;
        if (!cVar.k()) {
            return 0;
        }
        int l4 = cVar.l();
        int i11 = sparseIntArray.get(l4, -1);
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        while (true) {
            if (i12 < sparseIntArray.size()) {
                int keyAt = sparseIntArray.keyAt(i12);
                if (keyAt > l4 && sparseIntArray.get(keyAt) == 0) {
                    break;
                }
                i12++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 == -1) {
            i10 = ((k6.e) this.f16975c).d(context, l4);
        }
        sparseIntArray.put(l4, i10);
        return i10;
    }

    @Override
    public void c() {
        ((ne.k) this.f16974b).c();
    }

    @Override
    public void d(float f7, float f10, int i10, int i11) {
        switch (this.f16973a) {
            case 7:
                h6.q(f7, f10, i10, i11);
                return;
            default:
                d6 d6Var = (d6) this.f16975c;
                if (d6Var == null) {
                    h6.q(f7, f10, i10, i11);
                    return;
                } else {
                    d6Var.d(f7, f10, i10, i11);
                    return;
                }
        }
    }

    @Override
    public Object d2(Uri uri, g2.k kVar) {
        t2.a aVar = (t2.a) ((y2.n) this.f16974b).d2(uri, kVar);
        List list = (List) this.f16975c;
        if (list != null && !list.isEmpty()) {
            return (t2.a) aVar.a(list);
        }
        return aVar;
    }

    @Override
    public void dismiss() {
        ((xu) this.f16975c).dismiss();
    }

    @Override
    public dh.d f() {
        if (Build.VERSION.SDK_INT >= 29) {
            dh.e eVar = new dh.e(this);
            ((PhotoViewer) this.f16975c).Z.add(eVar);
            return eVar;
        }
        return new dh.f(this);
    }

    @Override
    public Object mo27get() {
        rb.b bVar = new rb.b(24);
        pb.a aVar = new pb.a(24);
        Object mo27get = ((hd.a) this.f16974b).mo27get();
        hd.a aVar2 = (hd.a) this.f16975c;
        return new s5.g(bVar, aVar, s5.a.f46134f, (s5.i) mo27get, aVar2);
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public Drawable getDrawable(String str) {
        switch (this.f16973a) {
            case 7:
                return null;
            default:
                d6 d6Var = (d6) this.f16975c;
                if (d6Var == null) {
                    return h6.P0(str);
                }
                return d6Var.getDrawable(str);
        }
    }

    @Override
    public boolean i() {
        return false;
    }

    @Override
    public ColorFilter j() {
        switch (this.f16973a) {
            case 7:
                return h6.f21323v3;
            default:
                d6 d6Var = (d6) this.f16975c;
                if (d6Var == null) {
                    return h6.f21323v3;
                }
                return d6Var.j();
        }
    }

    @Override
    public boolean k(float f7) {
        return false;
    }

    @Override
    public Paint n(String str) {
        switch (this.f16973a) {
            case 7:
                return h6.T0(str);
            default:
                d6 d6Var = (d6) this.f16975c;
                if (d6Var == null) {
                    return h6.T0(str);
                }
                return d6Var.n(str);
        }
    }

    @Override
    public void onError(a81 a81Var, Exception exc) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f16975c;
        int i10 = secretMediaViewer.f33780b0;
        if (i10 > 0) {
            secretMediaViewer.f33780b0 = i10 - 1;
            AndroidUtilities.runOnUIThread(new lv0(28, this, (File) this.f16974b), 100L);
            return;
        }
        FileLog.e(exc);
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f16975c;
        l31 l31Var = secretMediaViewer.f33797i1;
        if (secretMediaViewer.f33830y != null && secretMediaViewer.f33794h0 != null) {
            AndroidUtilities.cancelRunOnUIThread(l31Var);
            AndroidUtilities.runOnUIThread(l31Var);
            if (i10 != 4 && i10 != 1) {
                try {
                    secretMediaViewer.f33779b.getWindow().addFlags(128);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            } else {
                try {
                    secretMediaViewer.f33779b.getWindow().clearFlags(128);
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
            if (i10 == 3 && secretMediaViewer.f33825w.getVisibility() != 0) {
                secretMediaViewer.f33825w.setVisibility(0);
            }
            if (secretMediaViewer.f33830y.y() && i10 != 4) {
                if (!secretMediaViewer.E) {
                    secretMediaViewer.E = true;
                }
            } else if (secretMediaViewer.E) {
                secretMediaViewer.E = false;
                if (i10 == 4) {
                    secretMediaViewer.H = true;
                    if (secretMediaViewer.I) {
                        secretMediaViewer.e(true, !secretMediaViewer.f33812q1);
                        return;
                    }
                    secretMediaViewer.f33830y.L(0L, false);
                    secretMediaViewer.f33830y.C();
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
        o4 o4Var = ((SecretMediaViewer) this.f16975c).f33825w;
        if (o4Var != null) {
            if (i11 == 0) {
                f10 = 1.0f;
            } else {
                f10 = (i10 * f7) / i11;
            }
            o4Var.a(f10, 0);
        }
    }

    @Override
    public void p(String str, String str2) {
        xm0 xm0Var = ((gm0) this.f16975c).f37241a;
        if ("PHONE_VERIFICATION_NEEDED".equals(str)) {
            xm0Var.N1(true, str2, (ek0) this.f16974b, this, xm0Var.B1);
        } else {
            xm0Var.M1(true, false);
        }
    }

    @Override
    public int r(int i10) {
        switch (this.f16973a) {
            case 7:
                return u(i10);
            default:
                d6 d6Var = (d6) this.f16975c;
                if (d6Var == null) {
                    return h6.x0(null, i10, false);
                }
                return d6Var.r(i10);
        }
    }

    @Override
    public boolean s() {
        switch (this.f16973a) {
            case 7:
                return false;
            default:
                d6 d6Var = (d6) this.f16975c;
                if (d6Var == null) {
                    return h6.b1();
                }
                return d6Var.s();
        }
    }

    @Override
    public void s0(v6 v6Var, bi.b bVar, boolean z10) {
        xu xuVar = (xu) this.f16975c;
        wu wuVar = xuVar.X;
        if (bVar != null) {
            ((bi.c) this.f16974b).i(bVar);
            xuVar.f43277e0.d();
            bi.c cVar = xuVar.f43279g0;
            uy0[] uy0VarArr = xuVar.f43274b0;
            a2[] a2VarArr = xuVar.f43275c0;
            a2 a2Var = a2VarArr[0];
            if (a2Var != null) {
                uy0 uy0Var = uy0VarArr[0];
                boolean z11 = cVar.f4442m;
                uy0Var.f31114c = z11;
                a2Var.c(z11, true);
            }
            a2 a2Var2 = a2VarArr[1];
            if (a2Var2 != null) {
                uy0 uy0Var2 = uy0VarArr[1];
                boolean z12 = cVar.f4443n;
                uy0Var2.f31114c = z12;
                a2Var2.c(z12, true);
            }
            a2 a2Var3 = a2VarArr[2];
            if (a2Var3 != null) {
                uy0 uy0Var3 = uy0VarArr[2];
                boolean z13 = cVar.f4444o;
                uy0Var3.f31114c = z13;
                a2Var3.c(z13, true);
            }
            a2 a2Var4 = a2VarArr[3];
            if (a2Var4 != null) {
                uy0 uy0Var4 = uy0VarArr[3];
                boolean z14 = cVar.f4445p;
                uy0Var4.f31114c = z14;
                a2Var4.c(z14, true);
            }
            a2 a2Var5 = a2VarArr[4];
            if (a2Var5 != null) {
                uy0 uy0Var5 = uy0VarArr[4];
                boolean z15 = cVar.f4446q;
                uy0Var5.f31114c = z15;
                a2Var5.c(z15, true);
            }
            xuVar.f43273a0.a(wuVar.d(), true);
            wuVar.c(true);
        }
    }

    @Override
    public Task then(Object obj) {
        ea.a aVar = (ea.a) obj;
        u4.f fVar = (u4.f) this.f16975c;
        if (aVar == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return Tasks.forResult(null);
        }
        n2.e eVar = (n2.e) fVar.f47634c;
        x9.m.b((x9.m) ((n2.e) fVar.f47634c).f17043c);
        ((x9.m) eVar.f17043c).f49745m.D((Executor) this.f16974b, null);
        ((x9.m) eVar.f17043c).f49749q.trySetResult(null);
        return Tasks.forResult(null);
    }

    public String toString() {
        switch (this.f16973a) {
            case 3:
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append(this.f16975c.getClass().getSimpleName());
                sb2.append('{');
                ArrayList arrayList = (ArrayList) this.f16974b;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    sb2.append((String) arrayList.get(i10));
                    if (i10 < size - 1) {
                        sb2.append(", ");
                    }
                }
                sb2.append('}');
                return sb2.toString();
            case 18:
                return "Bounds{lower=" + ((i0.b) this.f16974b) + " upper=" + ((i0.b) this.f16975c) + "}";
            default:
                return super.toString();
        }
    }

    @Override
    public int u(int i10) {
        switch (this.f16973a) {
            case 7:
                SparseIntArray sparseIntArray = (SparseIntArray) this.f16974b;
                int indexOfKey = sparseIntArray.indexOfKey(i10);
                if (indexOfKey >= 0) {
                    return sparseIntArray.valueAt(indexOfKey);
                }
                return h6.x0(null, i10, false);
            default:
                SparseIntArray sparseIntArray2 = (SparseIntArray) this.f16974b;
                int indexOfKey2 = sparseIntArray2.indexOfKey(i10);
                if (indexOfKey2 >= 0) {
                    return sparseIntArray2.valueAt(indexOfKey2);
                }
                d6 d6Var = (d6) this.f16975c;
                if (d6Var == null) {
                    return h6.x0(null, i10, false);
                }
                return d6Var.u(i10);
        }
    }

    @Override
    public void y(Canvas canvas, float f7, float f10, float f11, float f12) {
        canvas.save();
        canvas.clipRect(f7, f10, f11, f12);
        ((PhotoViewer) this.f16975c).U0(canvas, (na) this.f16974b, -14277082, 855638016, false, true, true);
        canvas.drawColor(637534208);
        canvas.restore();
    }

    public q(int i10, Object obj, Object obj2) {
        this.f16973a = i10;
        this.f16974b = obj;
        this.f16975c = obj2;
    }

    @Override
    public void onRenderedFirstFrame() {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f16975c;
        if (secretMediaViewer.f33783c0) {
            return;
        }
        secretMediaViewer.f33783c0 = true;
        secretMediaViewer.e.invalidate();
    }

    public q(Object obj, Object obj2, boolean z10, int i10) {
        this.f16973a = i10;
        this.f16975c = obj;
        this.f16974b = obj2;
    }

    public q(Object obj) {
        this.f16973a = 3;
        this.f16975c = obj;
        this.f16974b = new ArrayList();
    }

    public q(k6.e eVar) {
        this.f16973a = 4;
        this.f16974b = new SparseIntArray();
        n6.l.h(eVar);
        this.f16975c = eVar;
    }

    public q(d6 d6Var) {
        this.f16973a = 15;
        this.f16974b = new SparseIntArray();
        this.f16975c = d6Var;
        J();
    }

    public q(Context context) {
        this.f16973a = 23;
        this.f16974b = context;
        this.f16975c = null;
    }

    public q(byte[] bArr) {
        this.f16973a = 1;
        this.f16974b = bArr;
    }

    public q(dg0 dg0Var) {
        this.f16973a = 10;
        this.f16975c = dg0Var;
        this.f16974b = new rc0(this, 9);
    }

    public q(String str, String str2) {
        this.f16973a = 24;
        this.f16974b = str;
        this.f16975c = str2;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("userId should not be empty");
        }
    }

    public q(h1 h1Var) {
        this.f16973a = 20;
        this.f16974b = h1Var;
        ?? obj = new Object();
        obj.f46005a = 0;
        this.f16975c = obj;
    }

    public q(int i10) {
        this.f16973a = 26;
        Bitmap createBitmap = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
        this.f16974b = createBitmap;
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        this.f16975c = new BitmapShader(createBitmap, tileMode, tileMode);
    }

    public q(EditText editText) {
        this.f16973a = 16;
        this.f16974b = editText;
        q1.i iVar = new q1.i(editText);
        this.f16975c = iVar;
        editText.addTextChangedListener(iVar);
        if (q1.a.f44367b == null) {
            synchronized (q1.a.f44366a) {
                try {
                    if (q1.a.f44367b == null) {
                        ?? factory = new Editable.Factory();
                        try {
                            q1.a.f44368c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, q1.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        q1.a.f44367b = factory;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(q1.a.f44367b);
    }

    public q(PhotoViewer photoViewer) {
        this.f16973a = 13;
        this.f16975c = photoViewer;
        this.f16974b = new na(photoViewer.f33245b0, photoViewer.f33273e0, 0, false);
    }

    @Override
    public void C(long j10) {
    }

    @Override
    public void E(boolean z10) {
    }

    public void J() {
    }

    @Override
    public void K(float f7) {
    }

    @Override
    public void M(float f7) {
    }

    @Override
    public void P(float f7) {
    }

    @Override
    public void Q() {
    }

    @Override
    public void S(float f7) {
    }

    @Override
    public void W(long j10) {
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
    public void e(int i10) {
    }

    @Override
    public void g(float f7) {
    }

    @Override
    public void h(boolean z10) {
    }

    @Override
    public void l(float f7) {
    }

    @Override
    public void m() {
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
    public void q() {
    }

    @Override
    public void t(float f7) {
    }

    @Override
    public void v() {
    }

    @Override
    public void w(boolean z10) {
    }

    @Override
    public void z(float f7) {
    }

    private final void Z(int i10, int i11) {
    }

    @Override
    public void G(float f7, int i10) {
    }

    @Override
    public void N(float f7, int i10) {
    }

    @Override
    public void T(int i10, long j10) {
    }

    @Override
    public void o(long j10, boolean z10) {
    }

    @Override
    public void x(float f7, int i10) {
    }
}
