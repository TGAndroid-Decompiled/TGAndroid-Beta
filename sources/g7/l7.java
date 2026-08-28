package g7;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;
public abstract class l7 {
    public static Context f7292a;
    public static s7.e f7293b;

    public static s7.e a(Context context) {
        Class cls;
        Class cls2;
        s7.e aVar;
        x5.l.h(context);
        Log.d("l7", "preferredRenderer: ".concat("null"));
        s7.e eVar = f7293b;
        if (eVar == null) {
            AtomicBoolean atomicBoolean = u5.g.f48112a;
            int b10 = u5.g.b(context, 13400000);
            if (b10 == 0) {
                Log.i("l7", "Making Creator dynamically");
                ClassLoader classLoader = b(context).getClassLoader();
                try {
                    x5.l.h(classLoader);
                    try {
                        IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.maps.internal.CreatorImpl").newInstance();
                        if (iBinder == null) {
                            aVar = 0;
                        } else {
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
                            if (queryLocalInterface instanceof s7.e) {
                                aVar = (s7.e) queryLocalInterface;
                            } else {
                                aVar = new b7.a(iBinder, "com.google.android.gms.maps.internal.ICreator", 1);
                            }
                        }
                        f7293b = aVar;
                        try {
                            Context b11 = b(context);
                            b11.getClass();
                            h6.b bVar = new h6.b(b11.getResources());
                            Parcel M0 = aVar.M0();
                            c7.b.c(M0, bVar);
                            M0.writeInt(12451000);
                            aVar.Q0(M0, 6);
                            return f7293b;
                        } catch (RemoteException e10) {
                            throw new RuntimeException(e10);
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
            throw new u5.f(b10);
        }
        return eVar;
    }

    public static Context b(Context context) {
        Context context2;
        Context context3 = f7292a;
        if (context3 == null) {
            context.getApplicationContext();
            try {
                context2 = i6.e.c(context, i6.e.f10927b, "com.google.android.gms.maps_dynamite").f10937a;
            } catch (Exception e10) {
                try {
                    if (!"com.google.android.gms.maps_dynamite".equals("com.google.android.gms.maps_dynamite")) {
                        try {
                            Log.d("l7", "Attempting to load maps_dynamite again.");
                            context2 = i6.e.c(context, i6.e.f10927b, "com.google.android.gms.maps_dynamite").f10937a;
                        } catch (Exception e11) {
                            Log.e("l7", "Failed to load maps module, use pre-Chimera", e11);
                            AtomicBoolean atomicBoolean = u5.g.f48112a;
                            context2 = context.createPackageContext("com.google.android.gms", 3);
                        }
                    } else {
                        Log.e("l7", "Failed to load maps module, use pre-Chimera", e10);
                        AtomicBoolean atomicBoolean2 = u5.g.f48112a;
                        context2 = context.createPackageContext("com.google.android.gms", 3);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    context2 = null;
                }
            }
            f7292a = context2;
            return context2;
        }
        return context3;
    }
}
