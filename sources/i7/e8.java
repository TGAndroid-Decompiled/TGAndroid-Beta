package i7;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
public abstract class e8 {
    public static Context f8308a;
    public static u7.e f8309b;

    public static u7.e a(Context context) {
        Class cls;
        Class cls2;
        u7.e aVar;
        z5.l.h(context);
        Log.d("e8", "preferredRenderer: ".concat("null"));
        u7.e eVar = f8309b;
        if (eVar == null) {
            int i10 = w5.g.f49774e;
            int b10 = w5.g.b(context, 13400000);
            if (b10 == 0) {
                Log.i("e8", "Making Creator dynamically");
                ClassLoader classLoader = b(context).getClassLoader();
                try {
                    z5.l.h(classLoader);
                    try {
                        try {
                            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.maps.internal.CreatorImpl").newInstance();
                            if (iBinder == null) {
                                aVar = 0;
                            } else {
                                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
                                if (queryLocalInterface instanceof u7.e) {
                                    aVar = (u7.e) queryLocalInterface;
                                } else {
                                    aVar = new com.google.android.gms.internal.cast.a(iBinder, "com.google.android.gms.maps.internal.ICreator", 4);
                                }
                            }
                            f8309b = aVar;
                            try {
                                Context b11 = b(context);
                                b11.getClass();
                                j6.b bVar = new j6.b(b11.getResources());
                                Parcel M0 = aVar.M0();
                                e7.b.c(M0, bVar);
                                M0.writeInt(12451000);
                                aVar.Q0(M0, 6);
                                return f8309b;
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
            throw new w5.f(b10);
        }
        return eVar;
    }

    public static Context b(Context context) {
        Context context2;
        Context context3 = f8308a;
        if (context3 == null) {
            context.getApplicationContext();
            try {
                context2 = k6.e.c(context, k6.e.f13450b, "com.google.android.gms.maps_dynamite").f13460a;
            } catch (Exception e10) {
                try {
                    if (!"com.google.android.gms.maps_dynamite".equals("com.google.android.gms.maps_dynamite")) {
                        try {
                            Log.d("e8", "Attempting to load maps_dynamite again.");
                            context2 = k6.e.c(context, k6.e.f13450b, "com.google.android.gms.maps_dynamite").f13460a;
                        } catch (Exception e11) {
                            Log.e("e8", "Failed to load maps module, use pre-Chimera", e11);
                            int i10 = w5.g.f49774e;
                            context2 = context.createPackageContext("com.google.android.gms", 3);
                        }
                    } else {
                        Log.e("e8", "Failed to load maps module, use pre-Chimera", e10);
                        int i11 = w5.g.f49774e;
                        context2 = context.createPackageContext("com.google.android.gms", 3);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    context2 = null;
                }
            }
            f8308a = context2;
            return context2;
        }
        return context3;
    }
}
