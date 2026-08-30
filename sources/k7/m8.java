package k7;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;
public abstract class m8 {
    public static Context f9939a;
    public static w7.e f9940b;

    public static w7.e a(Context context) {
        Class cls;
        Class cls2;
        w7.e aVar;
        b6.m.h(context);
        Log.d("m8", "preferredRenderer: ".concat("null"));
        w7.e eVar = f9940b;
        if (eVar == null) {
            AtomicBoolean atomicBoolean = y5.g.f47084a;
            int b10 = y5.g.b(context, 13400000);
            if (b10 == 0) {
                Log.i("m8", "Making Creator dynamically");
                ClassLoader classLoader = b(context).getClassLoader();
                try {
                    b6.m.h(classLoader);
                    try {
                        try {
                            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.maps.internal.CreatorImpl").newInstance();
                            if (iBinder == null) {
                                aVar = 0;
                            } else {
                                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
                                if (queryLocalInterface instanceof w7.e) {
                                    aVar = (w7.e) queryLocalInterface;
                                } else {
                                    aVar = new a7.a(iBinder, "com.google.android.gms.maps.internal.ICreator", 5);
                                }
                            }
                            f9940b = aVar;
                            try {
                                Context b11 = b(context);
                                b11.getClass();
                                l6.b bVar = new l6.b(b11.getResources());
                                Parcel M0 = aVar.M0();
                                g7.b.c(M0, bVar);
                                M0.writeInt(12451000);
                                aVar.Q0(M0, 6);
                                return f9940b;
                            } catch (RemoteException e) {
                                throw new RuntimeException(e);
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
            throw new y5.f(b10);
        }
        return eVar;
    }

    public static Context b(Context context) {
        Context context2;
        Context context3 = f9939a;
        if (context3 == null) {
            context.getApplicationContext();
            try {
                context2 = m6.e.c(context, m6.e.f13755b, "com.google.android.gms.maps_dynamite").f13764a;
            } catch (Exception e) {
                try {
                    if (!"com.google.android.gms.maps_dynamite".equals("com.google.android.gms.maps_dynamite")) {
                        try {
                            Log.d("m8", "Attempting to load maps_dynamite again.");
                            context2 = m6.e.c(context, m6.e.f13755b, "com.google.android.gms.maps_dynamite").f13764a;
                        } catch (Exception e6) {
                            Log.e("m8", "Failed to load maps module, use pre-Chimera", e6);
                            AtomicBoolean atomicBoolean = y5.g.f47084a;
                            context2 = context.createPackageContext("com.google.android.gms", 3);
                        }
                    } else {
                        Log.e("m8", "Failed to load maps module, use pre-Chimera", e);
                        AtomicBoolean atomicBoolean2 = y5.g.f47084a;
                        context2 = context.createPackageContext("com.google.android.gms", 3);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    context2 = null;
                }
            }
            f9939a = context2;
            return context2;
        }
        return context3;
    }
}
