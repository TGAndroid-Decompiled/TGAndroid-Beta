package a8;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
public abstract class dd {
    public static Context f408a;
    public static j8.e f409b;

    public static j8.e a(Context context) {
        Class cls;
        Class cls2;
        j8.e aVar;
        o6.l.h(context);
        Log.d("dd", "preferredRenderer: ".concat("null"));
        j8.e eVar = f409b;
        if (eVar == null) {
            int i10 = l6.g.e;
            int b10 = l6.g.b(context, 13400000);
            if (b10 == 0) {
                Log.i("dd", "Making Creator dynamically");
                ClassLoader classLoader = b(context).getClassLoader();
                try {
                    o6.l.h(classLoader);
                    try {
                        IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.maps.internal.CreatorImpl").newInstance();
                        if (iBinder == null) {
                            aVar = 0;
                        } else {
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
                            if (queryLocalInterface instanceof j8.e) {
                                aVar = (j8.e) queryLocalInterface;
                            } else {
                                aVar = new a(iBinder, "com.google.android.gms.maps.internal.ICreator", 10);
                            }
                        }
                        f409b = aVar;
                        try {
                            Context b11 = b(context);
                            b11.getClass();
                            y6.b bVar = new y6.b(b11.getResources());
                            Parcel N0 = aVar.N0();
                            t7.b.c(N0, bVar);
                            N0.writeInt(12451000);
                            aVar.R0(N0, 6);
                            return f409b;
                        } catch (RemoteException e) {
                            throw new RuntimeException(e);
                        }
                    } catch (IllegalAccessException unused) {
                        throw new IllegalStateException("Unable to call the default constructor of ".concat(cls2.getName()));
                    } catch (InstantiationException unused2) {
                        throw new IllegalStateException("Unable to instantiate the dynamic class ".concat(cls.getName()));
                    }
                } catch (ClassNotFoundException unused3) {
                    throw new IllegalStateException("Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl");
                }
            }
            throw new l6.f(b10);
        }
        return eVar;
    }

    public static Context b(Context context) {
        Context context2;
        Context context3 = f408a;
        if (context3 == null) {
            context.getApplicationContext();
            try {
                context2 = z6.e.c(context, z6.e.f52679b, "com.google.android.gms.maps_dynamite").f52688a;
            } catch (Exception e) {
                try {
                    if (!"com.google.android.gms.maps_dynamite".equals("com.google.android.gms.maps_dynamite")) {
                        try {
                            Log.d("dd", "Attempting to load maps_dynamite again.");
                            context2 = z6.e.c(context, z6.e.f52679b, "com.google.android.gms.maps_dynamite").f52688a;
                        } catch (Exception e10) {
                            Log.e("dd", "Failed to load maps module, use pre-Chimera", e10);
                            int i10 = l6.g.e;
                            context2 = context.createPackageContext("com.google.android.gms", 3);
                        }
                    } else {
                        Log.e("dd", "Failed to load maps module, use pre-Chimera", e);
                        int i11 = l6.g.e;
                        context2 = context.createPackageContext("com.google.android.gms", 3);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    context2 = null;
                }
            }
            f408a = context2;
            return context2;
        }
        return context3;
    }
}
