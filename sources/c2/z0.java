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

public final class z0 {

    public boolean f2410a;

    public final Object f2411b;

    public final Object f2412c;
    public final Object d;

    public final Object f2413e;

    public final Serializable f2414f;

    public Object f2415g;
    public Object h;

    public z0(Context context, e eVar) {
        this.f2414f = new ArrayList();
        this.f2415g = new androidx.mediarouter.app.f(this, 1);
        this.h = new a8.b(this, 8);
        this.f2411b = context;
        this.f2412c = eVar;
        this.d = new Handler();
        this.f2413e = context.getPackageManager();
    }

    public FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e9) {
            String message = e9.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            ((e2.c) this.f2412c).m();
            return null;
        }
    }

    public void b(int i10, Serializable serializable) {
        ((Executor) this.f2411b).execute(new d5.i(this, i10, serializable, 1));
    }

    public void c() {
        int i10;
        e eVar = (e) this.f2412c;
        PackageManager packageManager = (PackageManager) this.f2413e;
        ArrayList arrayList = (ArrayList) this.f2414f;
        if (this.f2410a) {
            ArrayList arrayList2 = new ArrayList();
            if (Build.VERSION.SDK_INT >= 30) {
                Intent intent = new Intent("android.media.MediaRoute2ProviderService");
                ArrayList arrayList3 = new ArrayList();
                Iterator<ResolveInfo> it = packageManager.queryIntentServices(intent, 0).iterator();
                while (it.hasNext()) {
                    arrayList3.add(it.next().serviceInfo);
                }
                arrayList2 = arrayList3;
            }
            Iterator<ResolveInfo> it2 = packageManager.queryIntentServices(new Intent("android.media.MediaRouteProviderService"), 0).iterator();
            int i11 = 0;
            while (true) {
                boolean z10 = true;
                if (!it2.hasNext()) {
                    break;
                }
                ServiceInfo serviceInfo = it2.next().serviceInfo;
                if (serviceInfo != null) {
                    if ((b0.f2236c == null ? false : b0.c().f()) && !arrayList2.isEmpty()) {
                        int size = arrayList2.size();
                        int i12 = 0;
                        while (true) {
                            if (i12 < size) {
                                Object obj = arrayList2.get(i12);
                                i12++;
                                ServiceInfo serviceInfo2 = (ServiceInfo) obj;
                                if (!serviceInfo.packageName.equals(serviceInfo2.packageName) || !serviceInfo.name.equals(serviceInfo2.name)) {
                                }
                            }
                        }
                    }
                    String str = serviceInfo.packageName;
                    String str2 = serviceInfo.name;
                    int size2 = arrayList.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 >= size2) {
                            i13 = -1;
                            break;
                        }
                        ComponentName componentName = ((y0) arrayList.get(i13)).f2385r;
                        if (componentName.getPackageName().equals(str) && componentName.getClassName().equals(str2)) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                    if (i13 < 0) {
                        y0 y0Var = new y0((Context) this.f2411b, new ComponentName(serviceInfo.packageName, serviceInfo.name));
                        y0Var.B = new a1.c(this, y0Var);
                        if (!y0Var.f2387w) {
                            y0Var.f2387w = true;
                            y0Var.r();
                        }
                        i10 = i11 + 1;
                        arrayList.add(i11, y0Var);
                        eVar.a(y0Var, false);
                    } else if (i13 >= i11) {
                        y0 y0Var2 = (y0) arrayList.get(i13);
                        if (!y0Var2.f2387w) {
                            y0Var2.f2387w = true;
                            y0Var2.r();
                        }
                        if (y0Var2.f2389y == null) {
                            if (!y0Var2.f2387w || (((o) y0Var2.h) == null && y0Var2.v.isEmpty())) {
                                z10 = false;
                            }
                            if (z10) {
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
                    y yVarD = eVar.d(y0Var3);
                    if (yVarD != null) {
                        y0Var3.getClass();
                        b0.b();
                        y0Var3.f2343f = null;
                        y0Var3.h(null);
                        eVar.m(yVarD, null);
                        eVar.f2251a.b(514, yVarD);
                        eVar.f2260l.remove(yVarD);
                    }
                    arrayList.remove(y0Var3);
                    y0Var3.B = null;
                    if (y0Var3.f2387w) {
                        y0Var3.f2387w = false;
                        y0Var3.r();
                    }
                }
            }
        }
    }

    public z0(AssetManager assetManager, Executor executor, e2.c cVar, String str, File file) {
        this.f2410a = false;
        this.f2411b = executor;
        this.f2412c = cVar;
        this.f2414f = str;
        this.f2413e = file;
        int i10 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i10 >= 24 && i10 <= 34) {
            switch (i10) {
                case 24:
                case 25:
                    bArr = e2.d.h;
                    break;
                case 26:
                    bArr = e2.d.f5171g;
                    break;
                case 27:
                    bArr = e2.d.f5170f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = e2.d.f5169e;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = e2.d.d;
                    break;
            }
        }
        this.d = bArr;
    }
}
