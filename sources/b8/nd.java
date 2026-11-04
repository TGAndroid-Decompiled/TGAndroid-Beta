package b8;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
public abstract class nd {
    public static Context f2847a;
    public static k8.d f2848b;

    public static k8.d a(Context context) {
        Class cls;
        Class cls2;
        k8.d aVar;
        p6.m.g(context);
        Log.d("nd", "preferredRenderer: ".concat("null"));
        k8.d dVar = f2848b;
        if (dVar == null) {
            int i3 = m6.g.f19194e;
            int b10 = m6.g.b(context, 13400000);
            if (b10 == 0) {
                Log.i("nd", "Making Creator dynamically");
                ClassLoader classLoader = b(context).getClassLoader();
                try {
                    p6.m.g(classLoader);
                    try {
                        try {
                            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.maps.internal.CreatorImpl").newInstance();
                            if (iBinder == null) {
                                aVar = 0;
                            } else {
                                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
                                if (queryLocalInterface instanceof k8.d) {
                                    aVar = (k8.d) queryLocalInterface;
                                } else {
                                    aVar = new a(iBinder, "com.google.android.gms.maps.internal.ICreator", 10);
                                }
                            }
                            f2848b = aVar;
                            try {
                                Context b11 = b(context);
                                b11.getClass();
                                z6.b bVar = new z6.b(b11.getResources());
                                Parcel P0 = aVar.P0();
                                u7.b.c(P0, bVar);
                                P0.writeInt(12451000);
                                aVar.T0(P0, 6);
                                return f2848b;
                            } catch (RemoteException e10) {
                                throw new RuntimeException(e10);
                            }
                        } catch (InstantiationException unused) {
                            throw new IllegalStateException("Unable to instantiate the dynamic class ".concat(cls2.getName()));
                        }
                    } catch (IllegalAccessException unused2) {
                        throw new IllegalStateException("Unable to call the default constructor of ".concat(cls.getName()));
                    }
                } catch (ClassNotFoundException unused3) {
                    throw new IllegalStateException("Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl");
                }
            }
            throw new m6.f(b10);
        }
        return dVar;
    }

    public static Context b(Context context) {
        Context context2;
        Context context3 = f2847a;
        if (context3 == null) {
            context.getApplicationContext();
            try {
                context2 = a7.f.c(context, a7.f.f141b, "com.google.android.gms.maps_dynamite").f151a;
            } catch (Exception e10) {
                try {
                    if (!"com.google.android.gms.maps_dynamite".equals("com.google.android.gms.maps_dynamite")) {
                        try {
                            Log.d("nd", "Attempting to load maps_dynamite again.");
                            context2 = a7.f.c(context, a7.f.f141b, "com.google.android.gms.maps_dynamite").f151a;
                        } catch (Exception e11) {
                            Log.e("nd", "Failed to load maps module, use pre-Chimera", e11);
                            int i3 = m6.g.f19194e;
                            context2 = context.createPackageContext("com.google.android.gms", 3);
                        }
                    } else {
                        Log.e("nd", "Failed to load maps module, use pre-Chimera", e10);
                        int i10 = m6.g.f19194e;
                        context2 = context.createPackageContext("com.google.android.gms", 3);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    context2 = null;
                }
            }
            f2847a = context2;
            return context2;
        }
        return context3;
    }
}
