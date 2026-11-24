package defpackage;

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
import java.util.concurrent.Executor;
public final class pf3 {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;
    public final Serializable f;
    public final Object g;
    public Object h;

    public pf3(AssetManager assetManager, Executor executor, ft8 ft8Var, String str, File file) {
        this.a = false;
        this.b = executor;
        this.c = ft8Var;
        this.g = str;
        this.f = file;
        int i = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i >= 24 && i <= 34) {
            switch (i) {
                case 24:
                case 25:
                    bArr = ked.e;
                    break;
                case 26:
                    bArr = ked.d;
                    break;
                case 27:
                    bArr = ked.c;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = ked.b;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = ked.a;
                    break;
            }
        }
        this.d = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message != null && message.contains("compressed")) {
                ((ft8) this.c).D();
                return null;
            }
            return null;
        }
    }

    public final void b(int i, Serializable serializable) {
        ((Executor) this.b).execute(new ob4(this, i, serializable, (byte) 1));
    }

    public final void c() {
        boolean f;
        int i;
        wz4 wz4Var = (wz4) this.c;
        PackageManager packageManager = (PackageManager) this.e;
        ArrayList arrayList = (ArrayList) this.f;
        if (this.a) {
            ArrayList arrayList2 = new ArrayList();
            if (Build.VERSION.SDK_INT >= 30) {
                Intent intent = new Intent("android.media.MediaRoute2ProviderService");
                ArrayList arrayList3 = new ArrayList();
                for (ResolveInfo resolveInfo : packageManager.queryIntentServices(intent, 0)) {
                    arrayList3.add(resolveInfo.serviceInfo);
                }
                arrayList2 = arrayList3;
            }
            int i2 = 0;
            for (ResolveInfo resolveInfo2 : packageManager.queryIntentServices(new Intent("android.media.MediaRouteProviderService"), 0)) {
                ServiceInfo serviceInfo = resolveInfo2.serviceInfo;
                if (serviceInfo != null) {
                    if (gw6.c == null) {
                        f = false;
                    } else {
                        f = gw6.c().f();
                    }
                    if (f && !arrayList2.isEmpty()) {
                        int size = arrayList2.size();
                        int i3 = 0;
                        while (i3 < size) {
                            Object obj = arrayList2.get(i3);
                            i3++;
                            ServiceInfo serviceInfo2 = (ServiceInfo) obj;
                            if (!serviceInfo.packageName.equals(serviceInfo2.packageName) || !serviceInfo.name.equals(serviceInfo2.name)) {
                            }
                        }
                    }
                    String str = serviceInfo.packageName;
                    String str2 = serviceInfo.name;
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 < size2) {
                            ComponentName componentName = ((u79) arrayList.get(i4)).r;
                            if (componentName.getPackageName().equals(str) && componentName.getClassName().equals(str2)) {
                                break;
                            }
                            i4++;
                        } else {
                            i4 = -1;
                            break;
                        }
                    }
                    if (i4 < 0) {
                        u79 u79Var = new u79((Context) this.b, new ComponentName(serviceInfo.packageName, serviceInfo.name));
                        u79Var.G = new h68(this, u79Var);
                        if (!u79Var.x) {
                            u79Var.x = true;
                            u79Var.r();
                        }
                        i = i2 + 1;
                        arrayList.add(i2, u79Var);
                        wz4Var.a(u79Var, false);
                    } else if (i4 >= i2) {
                        u79 u79Var2 = (u79) arrayList.get(i4);
                        if (!u79Var2.x) {
                            u79Var2.x = true;
                            u79Var2.r();
                        }
                        if (u79Var2.E == null && u79Var2.x && (((bv6) u79Var2.h) != null || !u79Var2.w.isEmpty())) {
                            u79Var2.q();
                            u79Var2.n();
                        }
                        i = i2 + 1;
                        Collections.swap(arrayList, i4, i2);
                    }
                    i2 = i;
                }
            }
            if (i2 < arrayList.size()) {
                for (int size3 = arrayList.size() - 1; size3 >= i2; size3--) {
                    u79 u79Var3 = (u79) arrayList.get(size3);
                    dw6 d = wz4Var.d(u79Var3);
                    if (d != null) {
                        u79Var3.getClass();
                        gw6.b();
                        u79Var3.f = null;
                        u79Var3.h(null);
                        wz4Var.m(d, null);
                        wz4Var.a.b(514, d);
                        wz4Var.l.remove(d);
                    }
                    arrayList.remove(u79Var3);
                    u79Var3.G = null;
                    if (u79Var3.x) {
                        u79Var3.x = false;
                        u79Var3.r();
                    }
                }
            }
        }
    }

    public pf3(Context context, wz4 wz4Var) {
        this.f = new ArrayList();
        this.g = new zk(this, (byte) 11);
        this.h = new ei7(this, (byte) 15);
        this.b = context;
        this.c = wz4Var;
        this.d = new Handler();
        this.e = context.getPackageManager();
    }
}
