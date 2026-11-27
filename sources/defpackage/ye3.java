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
public final class ye3 {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;
    public final Serializable f;
    public final Object g;
    public Object h;

    public ye3(AssetManager assetManager, Executor executor, mu8 mu8Var, String str, File file) {
        this.a = false;
        this.b = executor;
        this.c = mu8Var;
        this.g = str;
        this.f = file;
        int i = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i >= 24 && i <= 34) {
            switch (i) {
                case 24:
                case 25:
                    bArr = bhd.e;
                    break;
                case 26:
                    bArr = bhd.d;
                    break;
                case 27:
                    bArr = bhd.c;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = bhd.b;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = bhd.a;
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
                ((mu8) this.c).I();
                return null;
            }
            return null;
        }
    }

    public final void b(int i, Serializable serializable) {
        ((Executor) this.b).execute(new sb4(this, i, serializable, (byte) 1));
    }

    public final void c() {
        boolean f;
        int i;
        a05 a05Var = (a05) this.c;
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
                    if (lw6.c == null) {
                        f = false;
                    } else {
                        f = lw6.c().f();
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
                            ComponentName componentName = ((f99) arrayList.get(i4)).r;
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
                        f99 f99Var = new f99((Context) this.b, new ComponentName(serviceInfo.packageName, serviceInfo.name));
                        f99Var.G = new jz7(this, f99Var);
                        if (!f99Var.x) {
                            f99Var.x = true;
                            f99Var.r();
                        }
                        i = i2 + 1;
                        arrayList.add(i2, f99Var);
                        a05Var.a(f99Var, false);
                    } else if (i4 >= i2) {
                        f99 f99Var2 = (f99) arrayList.get(i4);
                        if (!f99Var2.x) {
                            f99Var2.x = true;
                            f99Var2.r();
                        }
                        if (f99Var2.E == null && f99Var2.x && (((gv6) f99Var2.h) != null || !f99Var2.w.isEmpty())) {
                            f99Var2.q();
                            f99Var2.n();
                        }
                        i = i2 + 1;
                        Collections.swap(arrayList, i4, i2);
                    }
                    i2 = i;
                }
            }
            if (i2 < arrayList.size()) {
                for (int size3 = arrayList.size() - 1; size3 >= i2; size3--) {
                    f99 f99Var3 = (f99) arrayList.get(size3);
                    iw6 d = a05Var.d(f99Var3);
                    if (d != null) {
                        f99Var3.getClass();
                        lw6.b();
                        f99Var3.f = null;
                        f99Var3.h(null);
                        a05Var.m(d, null);
                        a05Var.a.b(514, d);
                        a05Var.l.remove(d);
                    }
                    arrayList.remove(f99Var3);
                    f99Var3.G = null;
                    if (f99Var3.x) {
                        f99Var3.x = false;
                        f99Var3.r();
                    }
                }
            }
        }
    }

    public ye3(Context context, a05 a05Var) {
        this.f = new ArrayList();
        this.g = new ak(this, (byte) 11);
        this.h = new ki7(this, (byte) 15);
        this.b = context;
        this.c = a05Var;
        this.d = new Handler();
        this.e = context.getPackageManager();
    }
}
