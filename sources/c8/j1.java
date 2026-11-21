package c8;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;
public abstract class j1 {
    public static Context f4863a;
    public static l8.d f4864b;

    public static l8.d a(Context context) {
        Class cls;
        Class cls2;
        l8.d aVar;
        q6.m.h(context);
        Log.d("j1", "preferredRenderer: ".concat("null"));
        l8.d dVar = f4864b;
        if (dVar == null) {
            AtomicBoolean atomicBoolean = n6.g.f21461a;
            int b10 = n6.g.b(context, 13400000);
            if (b10 == 0) {
                Log.i("j1", "Making Creator dynamically");
                ClassLoader classLoader = b(context).getClassLoader();
                try {
                    q6.m.h(classLoader);
                    try {
                        try {
                            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.maps.internal.CreatorImpl").newInstance();
                            if (iBinder == null) {
                                aVar = 0;
                            } else {
                                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
                                if (queryLocalInterface instanceof l8.d) {
                                    aVar = (l8.d) queryLocalInterface;
                                } else {
                                    aVar = new a8.a(iBinder, "com.google.android.gms.maps.internal.ICreator", 11);
                                }
                            }
                            f4864b = aVar;
                            try {
                                Context b11 = b(context);
                                b11.getClass();
                                a7.b bVar = new a7.b(b11.getResources());
                                Parcel p12 = aVar.p1();
                                v7.b.c(p12, bVar);
                                p12.writeInt(12451000);
                                aVar.t1(p12, 6);
                                return f4864b;
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
            throw new n6.f(b10);
        }
        return dVar;
    }

    public static Context b(Context context) {
        Context context2;
        Context context3 = f4863a;
        if (context3 == null) {
            context.getApplicationContext();
            try {
                context2 = b7.f.c(context, b7.f.f2958b, "com.google.android.gms.maps_dynamite").f2968a;
            } catch (Exception e10) {
                try {
                    if (!"com.google.android.gms.maps_dynamite".equals("com.google.android.gms.maps_dynamite")) {
                        try {
                            Log.d("j1", "Attempting to load maps_dynamite again.");
                            context2 = b7.f.c(context, b7.f.f2958b, "com.google.android.gms.maps_dynamite").f2968a;
                        } catch (Exception e11) {
                            Log.e("j1", "Failed to load maps module, use pre-Chimera", e11);
                            AtomicBoolean atomicBoolean = n6.g.f21461a;
                            context2 = context.createPackageContext("com.google.android.gms", 3);
                        }
                    } else {
                        Log.e("j1", "Failed to load maps module, use pre-Chimera", e10);
                        AtomicBoolean atomicBoolean2 = n6.g.f21461a;
                        context2 = context.createPackageContext("com.google.android.gms", 3);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    context2 = null;
                }
            }
            f4863a = context2;
            return context2;
        }
        return context3;
    }
}
