package c2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Executor;
public final class a1 {
    public boolean f1901a;
    public final Object f1902b;
    public final Object f1903c;
    public final Object d;
    public final Object e;
    public final Object f1904f;
    public Object f1905g;
    public Object h;

    public a1(Context context, e eVar) {
        this.f1904f = new ArrayList();
        this.f1905g = new androidx.mediarouter.app.h(this, 2);
        this.h = new androidx.activity.i(this, 8);
        this.f1902b = context;
        this.f1903c = eVar;
        this.d = new Handler();
        this.e = context.getPackageManager();
    }

    public static void a(a1 a1Var, l3.g gVar) {
        boolean z4;
        if (a1Var.f1901a && !gVar.equals((l3.g) a1Var.h)) {
            a1Var.h = gVar;
            l3.k0 k0Var = (l3.k0) ((gg.f) a1Var.f1903c).f6605b;
            if (k0Var.f11285f0 == Looper.myLooper()) {
                z4 = true;
            } else {
                z4 = false;
            }
            h5.a.i(z4);
            if (!gVar.equals(k0Var.f())) {
                k0Var.f11300w = gVar;
                l3.t tVar = k0Var.f11296r;
                if (tVar != null) {
                    tVar.r();
                }
            }
        }
    }

    public FileInputStream b(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message != null && message.contains("compressed")) {
                ((e2.d) this.f1903c).m0();
                return null;
            }
            return null;
        }
    }

    public void c(int i10, Serializable serializable) {
        ((Executor) this.f1902b).execute(new ah.a(this, i10, serializable, 3));
    }

    public void d() {
        boolean f10;
        int i10;
        e eVar = (e) this.f1903c;
        PackageManager packageManager = (PackageManager) this.e;
        ArrayList arrayList = (ArrayList) this.f1904f;
        if (this.f1901a) {
            ArrayList arrayList2 = new ArrayList();
            if (Build.VERSION.SDK_INT >= 30) {
                Intent intent = new Intent("android.media.MediaRoute2ProviderService");
                ArrayList arrayList3 = new ArrayList();
                for (ResolveInfo resolveInfo : packageManager.queryIntentServices(intent, 0)) {
                    arrayList3.add(resolveInfo.serviceInfo);
                }
                arrayList2 = arrayList3;
            }
            Iterator<ResolveInfo> it = packageManager.queryIntentServices(new Intent("android.media.MediaRouteProviderService"), 0).iterator();
            int i11 = 0;
            while (true) {
                boolean z4 = true;
                if (!it.hasNext()) {
                    break;
                }
                ServiceInfo serviceInfo = it.next().serviceInfo;
                if (serviceInfo != null) {
                    if (d0.f1935c == null) {
                        f10 = false;
                    } else {
                        f10 = d0.c().f();
                    }
                    if (f10 && !arrayList2.isEmpty()) {
                        int size = arrayList2.size();
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj = arrayList2.get(i12);
                            i12++;
                            ServiceInfo serviceInfo2 = (ServiceInfo) obj;
                            if (!serviceInfo.packageName.equals(serviceInfo2.packageName) || !serviceInfo.name.equals(serviceInfo2.name)) {
                            }
                        }
                    }
                    String str = serviceInfo.packageName;
                    String str2 = serviceInfo.name;
                    int size2 = arrayList.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 < size2) {
                            ComponentName componentName = ((z0) arrayList.get(i13)).f2069r;
                            if (componentName.getPackageName().equals(str) && componentName.getClassName().equals(str2)) {
                                break;
                            }
                            i13++;
                        } else {
                            i13 = -1;
                            break;
                        }
                    }
                    if (i13 < 0) {
                        z0 z0Var = new z0((Context) this.f1902b, new ComponentName(serviceInfo.packageName, serviceInfo.name));
                        z0Var.C = new a1.c(this, z0Var);
                        if (!z0Var.f2071w) {
                            z0Var.f2071w = true;
                            z0Var.r();
                        }
                        i10 = i11 + 1;
                        arrayList.add(i11, z0Var);
                        eVar.a(z0Var, false);
                    } else if (i13 >= i11) {
                        z0 z0Var2 = (z0) arrayList.get(i13);
                        if (!z0Var2.f2071w) {
                            z0Var2.f2071w = true;
                            z0Var2.r();
                        }
                        if (z0Var2.f2073y == null) {
                            if (!z0Var2.f2071w || (((o) z0Var2.h) == null && z0Var2.v.isEmpty())) {
                                z4 = false;
                            }
                            if (z4) {
                                z0Var2.q();
                                z0Var2.n();
                            }
                        }
                        i10 = i11 + 1;
                        Collections.swap(arrayList, i13, i11);
                    }
                    i11 = i10;
                }
            }
            if (i11 < arrayList.size()) {
                for (int size3 = arrayList.size() - 1; size3 >= i11; size3--) {
                    z0 z0Var3 = (z0) arrayList.get(size3);
                    a0 d = eVar.d(z0Var3);
                    if (d != null) {
                        z0Var3.getClass();
                        d0.b();
                        z0Var3.f2027f = null;
                        z0Var3.h(null);
                        eVar.m(d, null);
                        eVar.f1938a.b(514, d);
                        eVar.f1946l.remove(d);
                    }
                    arrayList.remove(z0Var3);
                    z0Var3.C = null;
                    if (z0Var3.f2071w) {
                        z0Var3.f2071w = false;
                        z0Var3.r();
                    }
                }
            }
        }
    }

    public a1(android.content.Context r5, gg.f r6) {
        throw new UnsupportedOperationException("Method not decompiled: c2.a1.<init>(android.content.Context, gg.f):void");
    }

    public a1(AssetManager assetManager, Executor executor, e2.d dVar, String str, File file) {
        this.f1901a = false;
        this.f1902b = executor;
        this.f1903c = dVar;
        this.f1904f = str;
        this.e = file;
        int i10 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i10 >= 24 && i10 <= 34) {
            switch (i10) {
                case 24:
                case 25:
                    bArr = e2.e.h;
                    break;
                case 26:
                    bArr = e2.e.f5070g;
                    break;
                case 27:
                    bArr = e2.e.f5069f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = e2.e.e;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = e2.e.d;
                    break;
            }
        }
        this.d = bArr;
    }
}
