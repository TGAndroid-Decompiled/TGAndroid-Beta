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
import k2.w0;
import n4.v;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.a2;
import org.telegram.ui.Cells.f3;
import org.telegram.ui.Components.c81;
import org.telegram.ui.Components.cp0;
import org.telegram.ui.Components.eg0;
import org.telegram.ui.Components.gu;
import org.telegram.ui.Components.iu;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.rc0;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.Components.z71;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.ck0;
import org.telegram.ui.em0;
import org.telegram.ui.j31;
import org.telegram.ui.jv0;
import org.telegram.ui.km0;
import org.telegram.ui.l7;
import org.telegram.ui.n5;
import org.telegram.ui.o4;
import org.telegram.ui.uu;
import org.telegram.ui.v6;
import org.telegram.ui.vm0;
import org.telegram.ui.vu;
import s4.g1;
import s4.h1;
public class q implements ne.f, d6, cp0, gu, zb, l7, km0, gh.a, z71, n5.b, y2.n, SuccessContinuation {
    public final int f16972a;
    public Object f16973b;
    public Object f16974c;

    public q(int i10, byte b10) {
        this.f16972a = i10;
    }

    @Override
    public void A(float f7, boolean z10) {
        rc0 rc0Var = (rc0) this.f16973b;
        eg0 eg0Var = (eg0) this.f16974c;
        c81 c81Var = eg0Var.d;
        if (c81Var != null) {
            long p5 = c81Var.p();
            float max = 2.8f / ((float) Math.max(60L, p5));
            long j10 = (((f7 / (1.0f - max)) * max) + f7) * ((float) p5);
            eg0Var.e = j10;
            eg0Var.d.L(j10, !z10);
            if (!z10) {
                AndroidUtilities.cancelRunOnUIThread(rc0Var);
                AndroidUtilities.runOnUIThread(rc0Var, 120L);
            }
        }
    }

    @Override
    public void B(int i10, int i11) {
        switch (this.f16972a) {
            case 7:
                return;
            default:
                d6 d6Var = (d6) this.f16974c;
                if (d6Var != null) {
                    d6Var.B(i10, i11);
                    return;
                }
                return;
        }
    }

    @Override
    public void E() {
        ((iu) this.f16973b).getText();
        ((f3) this.f16974c).b();
    }

    @Override
    public void F() {
        ((ne.k) this.f16973b).e((ne.l) this.f16974c);
    }

    @Override
    public int G(int i10) {
        switch (this.f16972a) {
            case 7:
                return ((SparseIntArray) this.f16973b).get(i10);
            default:
                d6 d6Var = (d6) this.f16974c;
                if (d6Var == null) {
                    return h6.x0(null, i10, false);
                }
                return d6Var.G(i10);
        }
    }

    public void H(Object obj, String str) {
        ((ArrayList) this.f16973b).add(a1.g.C(str, "=", String.valueOf(obj)));
    }

    @Override
    public void L(float f7, boolean z10) {
        ((TextView) this.f16973b).setText("Alpha " + n5.e);
        n5.e = f7;
        ((n5) this.f16974c).f39413b.M();
    }

    public void R() {
        String str = (String) this.f16973b;
        try {
            ca.c cVar = (ca.c) this.f16974c;
            cVar.getClass();
            new File(cVar.f5046b, str).createNewFile();
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e);
        }
    }

    public ArrayList S() {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        Context context = (Context) this.f16973b;
        Class cls = (Class) ((w0) this.f16974c).f14830b;
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
        g1 g1Var = (g1) this.f16974c;
        h1 h1Var = (h1) this.f16973b;
        int l4 = h1Var.l();
        int r10 = h1Var.r();
        if (i11 > i10) {
            i14 = 1;
        } else {
            i14 = -1;
        }
        View view = null;
        while (i10 != i11) {
            View x10 = h1Var.x(i10);
            int j10 = h1Var.j(x10);
            int B = h1Var.B(x10);
            g1Var.f45965b = l4;
            g1Var.f45966c = r10;
            g1Var.d = j10;
            g1Var.e = B;
            if (i12 != 0) {
                g1Var.f45964a = i12;
                if (g1Var.a()) {
                    return x10;
                }
            }
            if (i13 != 0) {
                g1Var.f45964a = i13;
                if (g1Var.a()) {
                    view = x10;
                }
            }
            i10 += i14;
        }
        return view;
    }

    public boolean W(v vVar, String str) {
        Context context = (Context) this.f16973b;
        int i10 = vVar.f17129b;
        if (i10 < 0) {
            if (context.getPackageManager().checkPermission(str, vVar.f17128a) == 0) {
                return true;
            }
            return false;
        } else if (context.checkPermission(str, i10, vVar.f17130c) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean X(View view) {
        g1 g1Var = (g1) this.f16974c;
        h1 h1Var = (h1) this.f16973b;
        int l4 = h1Var.l();
        int r10 = h1Var.r();
        int j10 = h1Var.j(view);
        int B = h1Var.B(view);
        g1Var.f45965b = l4;
        g1Var.f45966c = r10;
        g1Var.d = j10;
        g1Var.e = B;
        g1Var.f45964a = 24579;
        return g1Var.a();
    }

    @Override
    public int Y() {
        return 0;
    }

    @Override
    public boolean a() {
        switch (this.f16972a) {
            case 7:
            default:
                return h6.I.q();
        }
    }

    public int a0(Context context, com.google.android.gms.common.api.c cVar) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.f16973b;
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
            i10 = ((k6.e) this.f16974c).d(context, l4);
        }
        sparseIntArray.put(l4, i10);
        return i10;
    }

    @Override
    public void c() {
        ((ne.k) this.f16973b).c();
    }

    @Override
    public void d(float f7, float f10, int i10, int i11) {
        switch (this.f16972a) {
            case 7:
                h6.q(f7, f10, i10, i11);
                return;
            default:
                d6 d6Var = (d6) this.f16974c;
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
        t2.a aVar = (t2.a) ((y2.n) this.f16973b).d2(uri, kVar);
        List list = (List) this.f16974c;
        if (list != null && !list.isEmpty()) {
            return (t2.a) aVar.a(list);
        }
        return aVar;
    }

    @Override
    public void dismiss() {
        ((vu) this.f16974c).dismiss();
    }

    @Override
    public dh.d f() {
        if (Build.VERSION.SDK_INT >= 29) {
            dh.e eVar = new dh.e(this);
            ((PhotoViewer) this.f16974c).Z.add(eVar);
            return eVar;
        }
        return new dh.f(this);
    }

    @Override
    public Object mo27get() {
        rb.b bVar = new rb.b(24);
        pb.a aVar = new pb.a(24);
        Object mo27get = ((hd.a) this.f16973b).mo27get();
        hd.a aVar2 = (hd.a) this.f16974c;
        return new s5.g(bVar, aVar, s5.a.f46093f, (s5.i) mo27get, aVar2);
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public Drawable getDrawable(String str) {
        switch (this.f16972a) {
            case 7:
                return null;
            default:
                d6 d6Var = (d6) this.f16974c;
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
        switch (this.f16972a) {
            case 7:
                return h6.f21320v3;
            default:
                d6 d6Var = (d6) this.f16974c;
                if (d6Var == null) {
                    return h6.f21320v3;
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
        switch (this.f16972a) {
            case 7:
                return h6.T0(str);
            default:
                d6 d6Var = (d6) this.f16974c;
                if (d6Var == null) {
                    return h6.T0(str);
                }
                return d6Var.n(str);
        }
    }

    @Override
    public void onError(c81 c81Var, Exception exc) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f16974c;
        int i10 = secretMediaViewer.f33787b0;
        if (i10 > 0) {
            secretMediaViewer.f33787b0 = i10 - 1;
            AndroidUtilities.runOnUIThread(new jv0(28, this, (File) this.f16973b), 100L);
            return;
        }
        FileLog.e(exc);
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f16974c;
        j31 j31Var = secretMediaViewer.f33804i1;
        if (secretMediaViewer.f33837y != null && secretMediaViewer.f33801h0 != null) {
            AndroidUtilities.cancelRunOnUIThread(j31Var);
            AndroidUtilities.runOnUIThread(j31Var);
            if (i10 != 4 && i10 != 1) {
                try {
                    secretMediaViewer.f33786b.getWindow().addFlags(128);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            } else {
                try {
                    secretMediaViewer.f33786b.getWindow().clearFlags(128);
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
            if (i10 == 3 && secretMediaViewer.f33832w.getVisibility() != 0) {
                secretMediaViewer.f33832w.setVisibility(0);
            }
            if (secretMediaViewer.f33837y.y() && i10 != 4) {
                if (!secretMediaViewer.E) {
                    secretMediaViewer.E = true;
                }
            } else if (secretMediaViewer.E) {
                secretMediaViewer.E = false;
                if (i10 == 4) {
                    secretMediaViewer.H = true;
                    if (secretMediaViewer.I) {
                        secretMediaViewer.e(true, !secretMediaViewer.f33819q1);
                        return;
                    }
                    secretMediaViewer.f33837y.L(0L, false);
                    secretMediaViewer.f33837y.C();
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
        o4 o4Var = ((SecretMediaViewer) this.f16974c).f33832w;
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
        vm0 vm0Var = ((em0) this.f16974c).f36686a;
        if ("PHONE_VERIFICATION_NEEDED".equals(str)) {
            vm0Var.N1(true, str2, (ck0) this.f16973b, this, vm0Var.B1);
        } else {
            vm0Var.M1(true, false);
        }
    }

    @Override
    public int r(int i10) {
        switch (this.f16972a) {
            case 7:
                return w(i10);
            default:
                d6 d6Var = (d6) this.f16974c;
                if (d6Var == null) {
                    return h6.x0(null, i10, false);
                }
                return d6Var.r(i10);
        }
    }

    @Override
    public boolean s() {
        switch (this.f16972a) {
            case 7:
                return false;
            default:
                d6 d6Var = (d6) this.f16974c;
                if (d6Var == null) {
                    return h6.b1();
                }
                return d6Var.s();
        }
    }

    @Override
    public void s0(v6 v6Var, bi.b bVar, boolean z10) {
        vu vuVar = (vu) this.f16974c;
        uu uuVar = vuVar.X;
        if (bVar != null) {
            ((bi.c) this.f16973b).i(bVar);
            vuVar.f42375e0.d();
            bi.c cVar = vuVar.f42377g0;
            wy0[] wy0VarArr = vuVar.f42372b0;
            a2[] a2VarArr = vuVar.f42373c0;
            a2 a2Var = a2VarArr[0];
            if (a2Var != null) {
                wy0 wy0Var = wy0VarArr[0];
                boolean z11 = cVar.f4438m;
                wy0Var.f32280c = z11;
                a2Var.c(z11, true);
            }
            a2 a2Var2 = a2VarArr[1];
            if (a2Var2 != null) {
                wy0 wy0Var2 = wy0VarArr[1];
                boolean z12 = cVar.f4439n;
                wy0Var2.f32280c = z12;
                a2Var2.c(z12, true);
            }
            a2 a2Var3 = a2VarArr[2];
            if (a2Var3 != null) {
                wy0 wy0Var3 = wy0VarArr[2];
                boolean z13 = cVar.f4440o;
                wy0Var3.f32280c = z13;
                a2Var3.c(z13, true);
            }
            a2 a2Var4 = a2VarArr[3];
            if (a2Var4 != null) {
                wy0 wy0Var4 = wy0VarArr[3];
                boolean z14 = cVar.f4441p;
                wy0Var4.f32280c = z14;
                a2Var4.c(z14, true);
            }
            a2 a2Var5 = a2VarArr[4];
            if (a2Var5 != null) {
                wy0 wy0Var5 = wy0VarArr[4];
                boolean z15 = cVar.f4442q;
                wy0Var5.f32280c = z15;
                a2Var5.c(z15, true);
            }
            vuVar.f42371a0.a(uuVar.d(), true);
            uuVar.c(true);
        }
    }

    @Override
    public Task then(Object obj) {
        ea.a aVar = (ea.a) obj;
        u4.f fVar = (u4.f) this.f16974c;
        if (aVar == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return Tasks.forResult(null);
        }
        n2.e eVar = (n2.e) fVar.f47598c;
        x9.m.b((x9.m) ((n2.e) fVar.f47598c).f17040c);
        ((x9.m) eVar.f17040c).f49704m.D((Executor) this.f16973b, null);
        ((x9.m) eVar.f17040c).f49708q.trySetResult(null);
        return Tasks.forResult(null);
    }

    public String toString() {
        switch (this.f16972a) {
            case 3:
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append(this.f16974c.getClass().getSimpleName());
                sb2.append('{');
                ArrayList arrayList = (ArrayList) this.f16973b;
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
                return "Bounds{lower=" + ((i0.b) this.f16973b) + " upper=" + ((i0.b) this.f16974c) + "}";
            default:
                return super.toString();
        }
    }

    @Override
    public int w(int i10) {
        switch (this.f16972a) {
            case 7:
                SparseIntArray sparseIntArray = (SparseIntArray) this.f16973b;
                int indexOfKey = sparseIntArray.indexOfKey(i10);
                if (indexOfKey >= 0) {
                    return sparseIntArray.valueAt(indexOfKey);
                }
                return h6.x0(null, i10, false);
            default:
                SparseIntArray sparseIntArray2 = (SparseIntArray) this.f16973b;
                int indexOfKey2 = sparseIntArray2.indexOfKey(i10);
                if (indexOfKey2 >= 0) {
                    return sparseIntArray2.valueAt(indexOfKey2);
                }
                d6 d6Var = (d6) this.f16974c;
                if (d6Var == null) {
                    return h6.x0(null, i10, false);
                }
                return d6Var.w(i10);
        }
    }

    @Override
    public void y(Canvas canvas, float f7, float f10, float f11, float f12) {
        canvas.save();
        canvas.clipRect(f7, f10, f11, f12);
        ((PhotoViewer) this.f16974c).V0(canvas, (na) this.f16973b, -14277082, 855638016, false, true, true);
        canvas.drawColor(637534208);
        canvas.restore();
    }

    public q(int i10, Object obj, Object obj2) {
        this.f16972a = i10;
        this.f16973b = obj;
        this.f16974c = obj2;
    }

    @Override
    public void onRenderedFirstFrame() {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f16974c;
        if (secretMediaViewer.f33790c0) {
            return;
        }
        secretMediaViewer.f33790c0 = true;
        secretMediaViewer.e.invalidate();
    }

    public q(Object obj, Object obj2, boolean z10, int i10) {
        this.f16972a = i10;
        this.f16974c = obj;
        this.f16973b = obj2;
    }

    public q(Object obj) {
        this.f16972a = 3;
        this.f16974c = obj;
        this.f16973b = new ArrayList();
    }

    public q(k6.e eVar) {
        this.f16972a = 4;
        this.f16973b = new SparseIntArray();
        n6.l.h(eVar);
        this.f16974c = eVar;
    }

    public q(d6 d6Var) {
        this.f16972a = 15;
        this.f16973b = new SparseIntArray();
        this.f16974c = d6Var;
        O();
    }

    public q(Context context) {
        this.f16972a = 23;
        this.f16973b = context;
        this.f16974c = null;
    }

    public q(byte[] bArr) {
        this.f16972a = 1;
        this.f16973b = bArr;
    }

    public q(eg0 eg0Var) {
        this.f16972a = 10;
        this.f16974c = eg0Var;
        this.f16973b = new rc0(this, 9);
    }

    public q(String str, String str2) {
        this.f16972a = 24;
        this.f16973b = str;
        this.f16974c = str2;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("userId should not be empty");
        }
    }

    public q(h1 h1Var) {
        this.f16972a = 20;
        this.f16973b = h1Var;
        ?? obj = new Object();
        obj.f45964a = 0;
        this.f16974c = obj;
    }

    public q(int i10) {
        this.f16972a = 26;
        Bitmap createBitmap = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
        this.f16973b = createBitmap;
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        this.f16974c = new BitmapShader(createBitmap, tileMode, tileMode);
    }

    public q(EditText editText) {
        this.f16972a = 16;
        this.f16973b = editText;
        q1.i iVar = new q1.i(editText);
        this.f16974c = iVar;
        editText.addTextChangedListener(iVar);
        if (q1.a.f44329b == null) {
            synchronized (q1.a.f44328a) {
                try {
                    if (q1.a.f44329b == null) {
                        ?? factory = new Editable.Factory();
                        try {
                            q1.a.f44330c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, q1.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        q1.a.f44329b = factory;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(q1.a.f44329b);
    }

    public q(PhotoViewer photoViewer) {
        this.f16972a = 13;
        this.f16974c = photoViewer;
        this.f16973b = new na(photoViewer.f33250b0, photoViewer.f33278e0, 0, false);
    }

    @Override
    public void C(long j10) {
    }

    @Override
    public void D(boolean z10) {
    }

    @Override
    public void J(float f7) {
    }

    @Override
    public void K(float f7) {
    }

    @Override
    public void N(float f7) {
    }

    public void O() {
    }

    @Override
    public void P() {
    }

    @Override
    public void Q(float f7) {
    }

    @Override
    public void V(long j10) {
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
    public void u(boolean z10) {
    }

    @Override
    public void v() {
    }

    @Override
    public void z(float f7) {
    }

    private final void Z(int i10, int i11) {
    }

    @Override
    public void I(float f7, int i10) {
    }

    @Override
    public void M(float f7, int i10) {
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
