package c2;

import ag.q1;
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
public final class b1 {
    public boolean f2791a;
    public final Object f2792b;
    public final Object f2793c;
    public final Object d;
    public final Object f2794e;
    public final Serializable f2795f;
    public Object f2796g;
    public Object h;

    public b1(Context context, e eVar) {
        this.f2795f = new ArrayList();
        this.f2796g = new af.c(this, 2);
        this.h = new q1(this, 11);
        this.f2792b = context;
        this.f2793c = eVar;
        this.d = new Handler();
        this.f2794e = context.getPackageManager();
    }

    public FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e10) {
            String message = e10.getMessage();
            if (message != null && message.contains("compressed")) {
                ((e2.c) this.f2793c).h0();
                return null;
            }
            return null;
        }
    }

    public void b(int i10, Serializable serializable) {
        ((Executor) this.f2792b).execute(new ag.v0(this, i10, serializable, 2));
    }

    public void c() {
        boolean f9;
        int i10;
        e eVar = (e) this.f2793c;
        PackageManager packageManager = (PackageManager) this.f2794e;
        ArrayList arrayList = (ArrayList) this.f2795f;
        if (this.f2791a) {
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
                boolean z10 = true;
                if (!it.hasNext()) {
                    break;
                }
                ServiceInfo serviceInfo = it.next().serviceInfo;
                if (serviceInfo != null) {
                    if (d0.f2801c == null) {
                        f9 = false;
                    } else {
                        f9 = d0.c().f();
                    }
                    if (f9 && !arrayList2.isEmpty()) {
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
                            ComponentName componentName = ((a1) arrayList.get(i13)).f2763r;
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
                        a1 a1Var = new a1((Context) this.f2792b, new ComponentName(serviceInfo.packageName, serviceInfo.name));
                        a1Var.B = new a1.c(this, a1Var);
                        if (!a1Var.f2765w) {
                            a1Var.f2765w = true;
                            a1Var.r();
                        }
                        i10 = i11 + 1;
                        arrayList.add(i11, a1Var);
                        eVar.a(a1Var, false);
                    } else if (i13 >= i11) {
                        a1 a1Var2 = (a1) arrayList.get(i13);
                        if (!a1Var2.f2765w) {
                            a1Var2.f2765w = true;
                            a1Var2.r();
                        }
                        if (a1Var2.f2767y == null) {
                            if (!a1Var2.f2765w || (((o) a1Var2.h) == null && a1Var2.v.isEmpty())) {
                                z10 = false;
                            }
                            if (z10) {
                                a1Var2.q();
                                a1Var2.n();
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
                    a1 a1Var3 = (a1) arrayList.get(size3);
                    a0 d = eVar.d(a1Var3);
                    if (d != null) {
                        a1Var3.getClass();
                        d0.b();
                        a1Var3.f2901f = null;
                        a1Var3.h(null);
                        eVar.m(d, null);
                        eVar.f2804a.b(514, d);
                        eVar.f2813l.remove(d);
                    }
                    arrayList.remove(a1Var3);
                    a1Var3.B = null;
                    if (a1Var3.f2765w) {
                        a1Var3.f2765w = false;
                        a1Var3.r();
                    }
                }
            }
        }
    }

    public b1(AssetManager assetManager, Executor executor, e2.c cVar, String str, File file) {
        this.f2791a = false;
        this.f2792b = executor;
        this.f2793c = cVar;
        this.f2795f = str;
        this.f2794e = file;
        int i10 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i10 >= 24 && i10 <= 34) {
            switch (i10) {
                case 24:
                case 25:
                    bArr = e2.d.h;
                    break;
                case 26:
                    bArr = e2.d.f5784g;
                    break;
                case 27:
                    bArr = e2.d.f5783f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = e2.d.f5782e;
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
