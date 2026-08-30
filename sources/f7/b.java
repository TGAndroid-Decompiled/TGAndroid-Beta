package f7;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Rect;
import android.graphics.Shader;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import g5.o0;
import j$.util.DesugarCollections;
import j3.k1;
import j3.l1;
import j3.n1;
import j3.p1;
import j3.q1;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import k7.oa;
import n7.qa;
import r0.j0;
import r0.m0;
import r0.m1;
public final class b implements com.google.android.gms.common.api.internal.s, g5.l, SuccessContinuation, o4.z, o3.m, od.b, r0.o, o0 {
    public final int f6011a;
    public Object f6012b;
    public Object f6013c;

    public b(char c3, int i10) {
        this.f6011a = i10;
    }

    private final void p(n3.f fVar) {
        synchronized (fVar) {
        }
        Handler handler = (Handler) this.f6012b;
        if (handler != null) {
            handler.post(new i5.w(this, fVar, 0));
        }
    }

    @Override
    public m1 N0(View view, m1 m1Var) {
        m2.h hVar = (m2.h) this.f6013c;
        m1 h = j0.h(view, m1Var);
        if (h.f43130a.n()) {
            return h;
        }
        Rect rect = (Rect) this.f6012b;
        rect.left = h.b();
        rect.top = h.d();
        rect.right = h.c();
        rect.bottom = h.a();
        int childCount = hVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            m1 b10 = j0.b(hVar.getChildAt(i10), h);
            rect.left = Math.min(b10.b(), rect.left);
            rect.top = Math.min(b10.d(), rect.top);
            rect.right = Math.min(b10.c(), rect.right);
            rect.bottom = Math.min(b10.a(), rect.bottom);
        }
        return h.f(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override
    public void a(int i10, o4.v vVar, o4.j jVar, o4.r rVar) {
        Pair s6 = s(i10, vVar);
        if (s6 != null) {
            ((q1) this.f6013c).f8798i.c(new k1(this, s6, jVar, rVar, 0));
        }
    }

    @Override
    public void accept(java.lang.Object r53, java.lang.Object r54) {
        throw new UnsupportedOperationException("Method not decompiled: f7.b.accept(java.lang.Object, java.lang.Object):void");
    }

    @Override
    public void b(int i10, o4.v vVar) {
        Pair s6 = s(i10, vVar);
        if (s6 != null) {
            ((q1) this.f6013c).f8798i.c(new l1(this, s6, 0));
        }
    }

    @Override
    public void c(int i10, o4.v vVar, int i11) {
        Pair s6 = s(i10, vVar);
        if (s6 != null) {
            ((q1) this.f6013c).f8798i.c(new ah.a(this, s6, i11, 5));
        }
    }

    @Override
    public g5.m createDataSource() {
        return new g5.t((Context) this.f6012b, ((g5.u) this.f6013c).createDataSource());
    }

    @Override
    public void d(int i10, o4.v vVar, o4.j jVar, o4.r rVar) {
        Pair s6 = s(i10, vVar);
        if (s6 != null) {
            ((q1) this.f6013c).f8798i.c(new k1(this, s6, jVar, rVar, 2));
        }
    }

    @Override
    public void e(int i10, o4.v vVar, Exception exc) {
        Pair s6 = s(i10, vVar);
        if (s6 != null) {
            ((q1) this.f6013c).f8798i.c(new androidx.car.app.utils.b(this, s6, exc, 13));
        }
    }

    @Override
    public void f(int i10, o4.v vVar, o4.r rVar) {
        Pair s6 = s(i10, vVar);
        if (s6 != null) {
            ((q1) this.f6013c).f8798i.c(new j3.m1(this, s6, rVar, 0));
        }
    }

    @Override
    public void g(int i10, o4.v vVar, o4.j jVar, o4.r rVar, IOException iOException, boolean z4) {
        Pair s6 = s(i10, vVar);
        if (s6 != null) {
            ((q1) this.f6013c).f8798i.c(new n1(this, s6, jVar, rVar, iOException, z4, 0));
        }
    }

    @Override
    public void h(int i10, o4.v vVar, o4.j jVar, o4.r rVar) {
        Pair s6 = s(i10, vVar);
        if (s6 != null) {
            ((q1) this.f6013c).f8798i.c(new k1(this, s6, jVar, rVar, 1));
        }
    }

    @Override
    public void i(int i10, o4.v vVar, o4.r rVar) {
        Pair s6 = s(i10, vVar);
        if (s6 != null) {
            ((q1) this.f6013c).f8798i.c(new j3.m1(this, s6, rVar, 1));
        }
    }

    @Override
    public void j(int i10, o4.v vVar) {
        Pair s6 = s(i10, vVar);
        if (s6 != null) {
            ((q1) this.f6013c).f8798i.c(new l1(this, s6, 2));
        }
    }

    @Override
    public void k(int i10, o4.v vVar) {
        Pair s6 = s(i10, vVar);
        if (s6 != null) {
            ((q1) this.f6013c).f8798i.c(new l1(this, s6, 1));
        }
    }

    public void l() {
        this.f6012b = null;
        this.f6013c = null;
    }

    public boolean m(int i10) {
        return ((h5.g) this.f6012b).f6955a.get(i10);
    }

    public void n() {
        String str = (String) this.f6012b;
        try {
            n9.b bVar = (n9.b) this.f6013c;
            bVar.getClass();
            new File(bVar.f14862b, str).createNewFile();
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e);
        }
    }

    public void o(n3.f fVar) {
        switch (this.f6011a) {
            case 10:
                p(fVar);
                return;
            default:
                synchronized (fVar) {
                }
                Handler handler = (Handler) this.f6012b;
                if (handler != null) {
                    handler.post(new l3.p(this, fVar, 1));
                    return;
                }
                return;
        }
    }

    public byte[] q(g4.a aVar) {
        DataOutputStream dataOutputStream = (DataOutputStream) this.f6013c;
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.f6012b;
        byteArrayOutputStream.reset();
        try {
            dataOutputStream.writeBytes(aVar.f6353a);
            dataOutputStream.writeByte(0);
            String str = aVar.f6354b;
            if (str == null) {
                str = "";
            }
            dataOutputStream.writeBytes(str);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(aVar.f6355c);
            dataOutputStream.writeLong(aVar.d);
            dataOutputStream.write(aVar.e);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Object r(Uri uri, g5.o oVar) {
        n4.a aVar = (n4.a) ((o0) this.f6012b).r(uri, oVar);
        List list = (List) this.f6013c;
        if (list != null && !list.isEmpty()) {
            return (n4.a) aVar.a(list);
        }
        return aVar;
    }

    public Pair s(int i10, o4.v vVar) {
        o4.v vVar2;
        p1 p1Var = (p1) this.f6012b;
        o4.v vVar3 = null;
        if (vVar != null) {
            int i11 = 0;
            while (true) {
                if (i11 < p1Var.f8785c.size()) {
                    if (((o4.v) p1Var.f8785c.get(i11)).d == vVar.d) {
                        Object obj = vVar.f16424a;
                        Object obj2 = p1Var.f8784b;
                        int i12 = j3.a.d;
                        vVar2 = vVar.b(Pair.create(obj2, obj));
                        break;
                    }
                    i11++;
                } else {
                    vVar2 = null;
                    break;
                }
            }
            if (vVar2 == null) {
                return null;
            }
            vVar3 = vVar2;
        }
        return Pair.create(Integer.valueOf(i10 + p1Var.d), vVar3);
    }

    public synchronized Map t() {
        try {
            if (((Map) this.f6013c) == null) {
                this.f6013c = DesugarCollections.unmodifiableMap(new HashMap((HashMap) this.f6012b));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (Map) this.f6013c;
    }

    @Override
    public Task then(Object obj) {
        switch (this.f6011a) {
            case 11:
                p9.a aVar = (p9.a) obj;
                i9.n nVar = ((i9.l) this.f6013c).e;
                if (aVar == null) {
                    Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
                    return Tasks.forResult(null);
                }
                return Tasks.whenAll(i9.n.b(nVar), nVar.f7409m.v((Executor) this.f6012b, null));
            case 12:
                p9.a aVar2 = (p9.a) obj;
                h2.g gVar = (h2.g) this.f6013c;
                if (aVar2 == null) {
                    Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
                    return Tasks.forResult(null);
                }
                b bVar = (b) gVar.f6906c;
                i9.n.b((i9.n) ((b) gVar.f6906c).f6013c);
                ((i9.n) bVar.f6013c).f7409m.v((Executor) this.f6012b, null);
                ((i9.n) bVar.f6013c).f7413q.trySetResult(null);
                return Tasks.forResult(null);
            default:
                return ((i9.n) this.f6013c).e.W(new h2.g(1, this, (Boolean) obj));
        }
    }

    public void u(k.a aVar) {
        com.google.firebase.messaging.r rVar = (com.google.firebase.messaging.r) this.f6012b;
        ((ActionMode.Callback) rVar.f4028b).onDestroyActionMode(rVar.w(aVar));
        g.q qVar = (g.q) this.f6013c;
        if (qVar.B != null) {
            qVar.f6300f.getDecorView().removeCallbacks(qVar.C);
        }
        if (qVar.f6313y != null) {
            m0 m0Var = qVar.D;
            if (m0Var != null) {
                m0Var.b();
            }
            m0 a2 = j0.a(qVar.f6313y);
            a2.a(0.0f);
            qVar.D = a2;
            a2.d(new g.i(this, 2));
        }
        qVar.f6312x = null;
        ViewGroup viewGroup = qVar.G;
        WeakHashMap weakHashMap = j0.f43118a;
        r0.z.c(viewGroup);
        qVar.y();
    }

    public boolean v(k.a aVar, Menu menu) {
        ViewGroup viewGroup = ((g.q) this.f6013c).G;
        WeakHashMap weakHashMap = j0.f43118a;
        r0.z.c(viewGroup);
        com.google.firebase.messaging.r rVar = (com.google.firebase.messaging.r) this.f6012b;
        ActionMode.Callback callback = (ActionMode.Callback) rVar.f4028b;
        k.e w10 = rVar.w(aVar);
        a0.k kVar = (a0.k) rVar.e;
        Menu menu2 = (Menu) kVar.get(menu);
        if (menu2 == null) {
            menu2 = new l.a0((Context) rVar.f4029c, (l.k) menu);
            kVar.put(menu, menu2);
        }
        return callback.onPrepareActionMode(w10, menu2);
    }

    public void w(i5.y yVar) {
        Handler handler = (Handler) this.f6012b;
        if (handler != null) {
            handler.post(new gf.c(13, this, yVar));
        }
    }

    @Override
    public Object z(od.c cVar, wc.c cVar2) {
        Object z4 = ((qa) this.f6012b).z(new k1.s(cVar, (la.z) this.f6013c), cVar2);
        if (z4 == vc.a.f45663a) {
            return z4;
        }
        return sc.i.f44253a;
    }

    public b(int i10, Object obj, Object obj2) {
        this.f6011a = i10;
        this.f6012b = obj;
        this.f6013c = obj2;
    }

    public b(Object obj, Object obj2, boolean z4, int i10) {
        this.f6011a = i10;
        this.f6013c = obj;
        this.f6012b = obj2;
    }

    public b(androidx.biometric.e eVar) {
        this.f6011a = 21;
        this.f6013c = new Object();
        this.f6012b = eVar;
        oa.b();
    }

    public b(Context context, int i10) {
        this.f6011a = i10;
        switch (i10) {
            case 4:
                g5.u uVar = new g5.u();
                this.f6012b = context.getApplicationContext();
                this.f6013c = uVar;
                return;
            default:
                this.f6012b = context;
                this.f6013c = null;
                return;
        }
    }

    public b(int i10, byte b10) {
        this.f6011a = i10;
        switch (i10) {
            case 5:
                this.f6012b = new HashMap();
                return;
            case 15:
                this.f6012b = new AtomicInteger();
                this.f6013c = new AtomicInteger();
                return;
            default:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.f6012b = byteArrayOutputStream;
                this.f6013c = new DataOutputStream(byteArrayOutputStream);
                return;
        }
    }

    public b(h5.g gVar, SparseArray sparseArray) {
        this.f6011a = 19;
        this.f6012b = gVar;
        SparseBooleanArray sparseBooleanArray = gVar.f6955a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i10 = 0; i10 < sparseBooleanArray.size(); i10++) {
            int a2 = gVar.a(i10);
            k3.a aVar = (k3.a) sparseArray.get(a2);
            aVar.getClass();
            sparseArray2.append(a2, aVar);
        }
        this.f6013c = sparseArray2;
    }

    public b(Handler handler, l3.q qVar) {
        this.f6011a = 23;
        if (qVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.f6012b = handler;
        this.f6013c = qVar;
    }

    public b(int i10) {
        this.f6011a = 16;
        Bitmap createBitmap = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
        this.f6012b = createBitmap;
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        this.f6013c = new BitmapShader(createBitmap, tileMode, tileMode);
    }

    public b(ArrayList arrayList, ArrayList arrayList2) {
        this.f6011a = 7;
        int size = arrayList.size();
        this.f6012b = new int[size];
        this.f6013c = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            ((int[]) this.f6012b)[i10] = ((Integer) arrayList.get(i10)).intValue();
            ((float[]) this.f6013c)[i10] = ((Float) arrayList2.get(i10)).floatValue();
        }
    }

    public b(int i10, int i11) {
        this.f6011a = 7;
        this.f6012b = new int[]{i10, i11};
        this.f6013c = new float[]{0.0f, 1.0f};
    }

    public b(int i10, int i11, int i12) {
        this.f6011a = 7;
        this.f6012b = new int[]{i10, i11, i12};
        this.f6013c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public b(i9.l lVar, Executor executor, String str) {
        this.f6011a = 11;
        this.f6013c = lVar;
        this.f6012b = executor;
    }

    public b(m2.h hVar) {
        this.f6011a = 27;
        this.f6013c = hVar;
        this.f6012b = new Rect();
    }
}
