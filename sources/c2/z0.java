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
public final class z0 {
    public boolean f2046a;
    public final Object f2047b;
    public final Object f2048c;
    public final Object d;
    public final Object e;
    public final Object f2049f;
    public Object f2050g;
    public Object h;

    public z0(Context context, e eVar) {
        this.f2049f = new ArrayList();
        this.f2050g = new androidx.mediarouter.app.h(this, 1);
        this.h = new androidx.activity.i(this, 8);
        this.f2047b = context;
        this.f2048c = eVar;
        this.d = new Handler();
        this.e = context.getPackageManager();
    }

    public static void a(z0 z0Var, l3.g gVar) {
        boolean z4;
        if (z0Var.f2046a && !gVar.equals((l3.g) z0Var.h)) {
            z0Var.h = gVar;
            l3.k0 k0Var = (l3.k0) ((gg.f) z0Var.f2048c).f6618b;
            if (k0Var.f11175f0 == Looper.myLooper()) {
                z4 = true;
            } else {
                z4 = false;
            }
            h5.a.i(z4);
            if (!gVar.equals(k0Var.f())) {
                k0Var.f11190w = gVar;
                l3.t tVar = k0Var.f11186r;
                if (tVar != null) {
                    tVar.q();
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
                ((e2.d) this.f2048c).l();
                return null;
            }
            return null;
        }
    }

    public void c(int i10, Serializable serializable) {
        ((Executor) this.f2047b).execute(new ah.a(this, i10, serializable, 3));
    }

    public void d() {
        boolean f10;
        int i10;
        e eVar = (e) this.f2048c;
        PackageManager packageManager = (PackageManager) this.e;
        ArrayList arrayList = (ArrayList) this.f2049f;
        if (this.f2046a) {
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
                    if (c0.f1905c == null) {
                        f10 = false;
                    } else {
                        f10 = c0.c().f();
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
                            ComponentName componentName = ((y0) arrayList.get(i13)).f2038r;
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
                        y0 y0Var = new y0((Context) this.f2047b, new ComponentName(serviceInfo.packageName, serviceInfo.name));
                        y0Var.C = new a1.c(this, y0Var);
                        if (!y0Var.f2040w) {
                            y0Var.f2040w = true;
                            y0Var.r();
                        }
                        i10 = i11 + 1;
                        arrayList.add(i11, y0Var);
                        eVar.a(y0Var, false);
                    } else if (i13 >= i11) {
                        y0 y0Var2 = (y0) arrayList.get(i13);
                        if (!y0Var2.f2040w) {
                            y0Var2.f2040w = true;
                            y0Var2.r();
                        }
                        if (y0Var2.f2042y == null) {
                            if (!y0Var2.f2040w || (((o) y0Var2.h) == null && y0Var2.v.isEmpty())) {
                                z4 = false;
                            }
                            if (z4) {
                                y0Var2.q();
                                y0Var2.n();
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
                    y0 y0Var3 = (y0) arrayList.get(size3);
                    z d = eVar.d(y0Var3);
                    if (d != null) {
                        y0Var3.getClass();
                        c0.b();
                        y0Var3.f2003f = null;
                        y0Var3.h(null);
                        eVar.m(d, null);
                        eVar.f1911a.b(514, d);
                        eVar.f1919l.remove(d);
                    }
                    arrayList.remove(y0Var3);
                    y0Var3.C = null;
                    if (y0Var3.f2040w) {
                        y0Var3.f2040w = false;
                        y0Var3.r();
                    }
                }
            }
        }
    }

    public z0(android.content.Context r5, gg.f r6) {
        throw new UnsupportedOperationException("Method not decompiled: c2.z0.<init>(android.content.Context, gg.f):void");
    }

    public z0(AssetManager assetManager, Executor executor, e2.d dVar, String str, File file) {
        this.f2046a = false;
        this.f2047b = executor;
        this.f2048c = dVar;
        this.f2049f = str;
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
                    bArr = e2.e.f5064g;
                    break;
                case 27:
                    bArr = e2.e.f5063f;
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
