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
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Executor;
public final class a1 {
    public boolean f2110a;
    public final Object f2111b;
    public final Object f2112c;
    public final Object d;
    public final Object f2113e;
    public final Serializable f2114f;
    public Object f2115g;
    public Object h;

    public a1(Context context, e eVar) {
        this.f2114f = new ArrayList();
        this.f2115g = new androidx.mediarouter.app.h(this, 1);
        this.h = new androidx.activity.i(this, 10);
        this.f2111b = context;
        this.f2112c = eVar;
        this.d = new Handler();
        this.f2113e = context.getPackageManager();
    }

    public FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e10) {
            String message = e10.getMessage();
            if (message != null && message.contains("compressed")) {
                ((e2.d) this.f2112c).e();
                return null;
            }
            return null;
        }
    }

    public void b(int i9, Serializable serializable) {
        ((Executor) this.f2111b).execute(new d5.i(this, i9, serializable, 1));
    }

    public void c() {
        boolean f10;
        int i9;
        e eVar = (e) this.f2112c;
        PackageManager packageManager = (PackageManager) this.f2113e;
        ArrayList arrayList = (ArrayList) this.f2114f;
        if (this.f2110a) {
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
            int i10 = 0;
            while (true) {
                boolean z10 = true;
                if (!it.hasNext()) {
                    break;
                }
                ServiceInfo serviceInfo = it.next().serviceInfo;
                if (serviceInfo != null) {
                    if (c0.f2126c == null) {
                        f10 = false;
                    } else {
                        f10 = c0.c().f();
                    }
                    if (f10 && !arrayList2.isEmpty()) {
                        int size = arrayList2.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayList2.get(i11);
                            i11++;
                            ServiceInfo serviceInfo2 = (ServiceInfo) obj;
                            if (!serviceInfo.packageName.equals(serviceInfo2.packageName) || !serviceInfo.name.equals(serviceInfo2.name)) {
                            }
                        }
                    }
                    String str = serviceInfo.packageName;
                    String str2 = serviceInfo.name;
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 < size2) {
                            ComponentName componentName = ((z0) arrayList.get(i12)).f2273r;
                            if (componentName.getPackageName().equals(str) && componentName.getClassName().equals(str2)) {
                                break;
                            }
                            i12++;
                        } else {
                            i12 = -1;
                            break;
                        }
                    }
                    if (i12 < 0) {
                        z0 z0Var = new z0((Context) this.f2111b, new ComponentName(serviceInfo.packageName, serviceInfo.name));
                        z0Var.B = new a1.c(this, z0Var);
                        if (!z0Var.f2275w) {
                            z0Var.f2275w = true;
                            z0Var.r();
                        }
                        i9 = i10 + 1;
                        arrayList.add(i10, z0Var);
                        eVar.a(z0Var, false);
                    } else if (i12 >= i10) {
                        z0 z0Var2 = (z0) arrayList.get(i12);
                        if (!z0Var2.f2275w) {
                            z0Var2.f2275w = true;
                            z0Var2.r();
                        }
                        if (z0Var2.f2277y == null) {
                            if (!z0Var2.f2275w || (((o) z0Var2.h) == null && z0Var2.v.isEmpty())) {
                                z10 = false;
                            }
                            if (z10) {
                                z0Var2.q();
                                z0Var2.n();
                            }
                        }
                        i9 = i10 + 1;
                        Collections.swap(arrayList, i12, i10);
                    }
                    i10 = i9;
                }
            }
            if (i10 < arrayList.size()) {
                for (int size3 = arrayList.size() - 1; size3 >= i10; size3--) {
                    z0 z0Var3 = (z0) arrayList.get(size3);
                    z d = eVar.d(z0Var3);
                    if (d != null) {
                        z0Var3.getClass();
                        c0.b();
                        z0Var3.f2223f = null;
                        z0Var3.h(null);
                        eVar.m(d, null);
                        eVar.f2134a.b(514, d);
                        eVar.f2143l.remove(d);
                    }
                    arrayList.remove(z0Var3);
                    z0Var3.B = null;
                    if (z0Var3.f2275w) {
                        z0Var3.f2275w = false;
                        z0Var3.r();
                    }
                }
            }
        }
    }

    public a1(AssetManager assetManager, Executor executor, e2.d dVar, String str, File file) {
        this.f2110a = false;
        this.f2111b = executor;
        this.f2112c = dVar;
        this.f2114f = str;
        this.f2113e = file;
        int i9 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i9 >= 24 && i9 <= 34) {
            switch (i9) {
                case 24:
                case 25:
                    bArr = e2.e.h;
                    break;
                case 26:
                    bArr = e2.e.f4814g;
                    break;
                case 27:
                    bArr = e2.e.f4813f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = e2.e.f4812e;
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
