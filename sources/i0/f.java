package i0;

import a9.o;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.util.Log;
import androidx.biometric.n;
import com.google.android.gms.common.api.internal.q1;
import d5.e0;
import d5.u;
import g7.l8;
import g7.x7;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import m.i3;
import n2.t;

public abstract class f {

    public static final x7 f10495a;

    public static final a0.j f10496b;

    static {
        l8.a("TypefaceCompat static init");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            f10495a = new k();
        } else if (i10 >= 28) {
            f10495a = new j();
        } else if (i10 >= 26) {
            f10495a = new i();
        } else if (i10 < 24) {
            f10495a = new g();
        } else {
            Method method = h.f10503c;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                f10495a = new h();
            } else {
                f10495a = new g();
            }
        }
        f10496b = new a0.j(16);
        Trace.endSection();
    }

    public static Typeface a(Context context, h0.d dVar, Resources resources, int i10, String str, int i11, int i12, e0 e0Var) {
        Typeface typefaceA;
        Typeface typefaceCreate;
        List listUnmodifiableList;
        int i13 = 15;
        if (dVar instanceof h0.g) {
            h0.g gVar = (h0.g) dVar;
            String str2 = gVar.f7722e;
            typefaceA = null;
            boolean z10 = false;
            if (str2 == null || str2.isEmpty()) {
                typefaceCreate = null;
            } else {
                typefaceCreate = Typeface.create(str2, 0);
                Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
                if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
                    typefaceCreate = null;
                }
            }
            if (typefaceCreate != null) {
                new Handler(Looper.getMainLooper()).post(new u(i13, e0Var, typefaceCreate));
                return typefaceCreate;
            }
            int i14 = 1;
            boolean z11 = gVar.d == 0;
            int i15 = gVar.f7721c;
            Handler handler = new Handler(Looper.getMainLooper());
            a9.i iVar = new a9.i(18, z10);
            iVar.f181b = e0Var;
            o0.e eVar = gVar.f7720b;
            int i16 = 2;
            if (eVar != null) {
                Object[] objArr = {gVar.f7719a, eVar};
                ArrayList arrayList = new ArrayList(2);
                for (int i17 = 0; i17 < 2; i17++) {
                    Object obj = objArr[i17];
                    Objects.requireNonNull(obj);
                    arrayList.add(obj);
                }
                listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList);
            } else {
                Object[] objArr2 = {gVar.f7719a};
                ArrayList arrayList2 = new ArrayList(1);
                Object obj2 = objArr2[0];
                Objects.requireNonNull(obj2);
                arrayList2.add(obj2);
                listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList2);
            }
            n nVar = new n(handler, 4);
            g5.b bVar = new g5.b(27, iVar, nVar);
            int i18 = 29;
            if (!z11) {
                String strA = o0.h.a(i12, listUnmodifiableList);
                Typeface typeface = (Typeface) o0.h.f19104a.a(strA);
                if (typeface != null) {
                    nVar.execute(new o(iVar, typeface, z10, i18));
                    typefaceA = typeface;
                } else {
                    t tVar = new t(bVar, i14);
                    synchronized (o0.h.f19106c) {
                        try {
                            a0.k kVar = o0.h.d;
                            ArrayList arrayList3 = (ArrayList) kVar.get(strA);
                            if (arrayList3 != null) {
                                arrayList3.add(tVar);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(tVar);
                                kVar.put(strA, arrayList4);
                                o0.f fVar = new o0.f(strA, context, listUnmodifiableList, i12, 1);
                                ThreadPoolExecutor threadPoolExecutor = o0.h.f19105b;
                                t tVar2 = new t(strA, i16);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                q1 q1Var = new q1();
                                q1Var.f3336b = fVar;
                                q1Var.f3337c = tVar2;
                                q1Var.d = handler2;
                                threadPoolExecutor.execute(q1Var);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } else {
                if (listUnmodifiableList.size() > 1) {
                    throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
                }
                o0.e eVar2 = (o0.e) listUnmodifiableList.get(0);
                a0.j jVar = o0.h.f19104a;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj3 = new Object[]{eVar2}[0];
                Objects.requireNonNull(obj3);
                arrayList5.add(obj3);
                String strA2 = o0.h.a(i12, DesugarCollections.unmodifiableList(arrayList5));
                Typeface typeface2 = (Typeface) o0.h.f19104a.a(strA2);
                if (typeface2 != null) {
                    nVar.execute(new o(iVar, typeface2, z10, i18));
                    typefaceA = typeface2;
                } else if (i15 == -1) {
                    Object[] objArr3 = {eVar2};
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj4 = objArr3[0];
                    Objects.requireNonNull(obj4);
                    arrayList6.add(obj4);
                    o0.g gVarB = o0.h.b(strA2, context, DesugarCollections.unmodifiableList(arrayList6), i12);
                    bVar.s(gVarB);
                    typefaceA = gVarB.f19102a;
                } else {
                    try {
                        try {
                            try {
                                o0.g gVar2 = (o0.g) o0.h.f19105b.submit(new o0.f(strA2, context, eVar2, i12, 0)).get(i15, TimeUnit.MILLISECONDS);
                                bVar.s(gVar2);
                                typefaceA = gVar2.f19102a;
                            } catch (InterruptedException e9) {
                                throw e9;
                            }
                        } catch (ExecutionException e10) {
                            throw new RuntimeException(e10);
                        } catch (TimeoutException unused) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused2) {
                        ((n) bVar.f6390c).execute(new i3((a9.i) bVar.f6389b, -3));
                    }
                }
            }
        } else {
            typefaceA = f10495a.a(context, (h0.e) dVar, resources, i12);
            if (typefaceA != null) {
                new Handler(Looper.getMainLooper()).post(new u(i13, e0Var, typefaceA));
            } else {
                e0Var.a();
            }
        }
        if (typefaceA != null) {
            f10496b.b(b(resources, i10, str, i11, i12), typefaceA);
        }
        return typefaceA;
    }

    public static String b(Resources resources, int i10, String str, int i11, int i12) {
        return resources.getResourcePackageName(i10) + '-' + str + '-' + i11 + '-' + i10 + '-' + i12;
    }
}
