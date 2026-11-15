package c8;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;
public abstract class f1 {
    public static Context f4281a;
    public static l8.d f4282b;

    public static l8.d a(Context context) {
        Class cls;
        Class cls2;
        l8.d aVar;
        q6.m.g(context);
        Log.d("f1", "preferredRenderer: ".concat("null"));
        l8.d dVar = f4282b;
        if (dVar == null) {
            AtomicBoolean atomicBoolean = n6.g.f21072a;
            int b10 = n6.g.b(context, 13400000);
            if (b10 == 0) {
                Log.i("f1", "Making Creator dynamically");
                ClassLoader classLoader = b(context).getClassLoader();
                try {
                    q6.m.g(classLoader);
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
                            f4282b = aVar;
                            try {
                                Context b11 = b(context);
                                b11.getClass();
                                a7.b bVar = new a7.b(b11.getResources());
                                Parcel p12 = aVar.p1();
                                v7.b.c(p12, bVar);
                                p12.writeInt(12451000);
                                aVar.t1(p12, 6);
                                return f4282b;
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
        Context context3 = f4281a;
        if (context3 == null) {
            context.getApplicationContext();
            try {
                context2 = b7.f.c(context, b7.f.f2951b, "com.google.android.gms.maps_dynamite").f2961a;
            } catch (Exception e10) {
                try {
                    if (!"com.google.android.gms.maps_dynamite".equals("com.google.android.gms.maps_dynamite")) {
                        try {
                            Log.d("f1", "Attempting to load maps_dynamite again.");
                            context2 = b7.f.c(context, b7.f.f2951b, "com.google.android.gms.maps_dynamite").f2961a;
                        } catch (Exception e11) {
                            Log.e("f1", "Failed to load maps module, use pre-Chimera", e11);
                            AtomicBoolean atomicBoolean = n6.g.f21072a;
                            context2 = context.createPackageContext("com.google.android.gms", 3);
                        }
                    } else {
                        Log.e("f1", "Failed to load maps module, use pre-Chimera", e10);
                        AtomicBoolean atomicBoolean2 = n6.g.f21072a;
                        context2 = context.createPackageContext("com.google.android.gms", 3);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    context2 = null;
                }
            }
            f4281a = context2;
            return context2;
        }
        return context3;
    }
}
