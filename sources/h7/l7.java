package h7;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class l7 {

    public static Context f8462a;

    public static t7.e f8463b;

    public static t7.e a(Context context) throws v5.f {
        t7.e eVar;
        y5.l.h(context);
        Log.d("l7", "preferredRenderer: ".concat("null"));
        t7.e eVar2 = f8463b;
        if (eVar2 != null) {
            return eVar2;
        }
        AtomicBoolean atomicBoolean = v5.g.f48797a;
        int iB = v5.g.b(context, 13400000);
        if (iB != 0) {
            throw new v5.f(iB);
        }
        Log.i("l7", "Making Creator dynamically");
        ClassLoader classLoader = b(context).getClassLoader();
        try {
            y5.l.h(classLoader);
            Class<?> clsLoadClass = classLoader.loadClass("com.google.android.gms.maps.internal.CreatorImpl");
            try {
                IBinder iBinder = (IBinder) clsLoadClass.newInstance();
                if (iBinder == null) {
                    eVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
                    eVar = iInterfaceQueryLocalInterface instanceof t7.e ? (t7.e) iInterfaceQueryLocalInterface : new t7.e(iBinder, "com.google.android.gms.maps.internal.ICreator", 4);
                }
                f8463b = eVar;
                try {
                    Context contextB = b(context);
                    contextB.getClass();
                    i6.b bVar = new i6.b(contextB.getResources());
                    Parcel parcelM0 = eVar.M0();
                    d7.b.c(parcelM0, bVar);
                    parcelM0.writeInt(12451000);
                    eVar.Q0(parcelM0, 6);
                    return f8463b;
                } catch (RemoteException e9) {
                    throw new a7.c(e9);
                }
            } catch (IllegalAccessException unused) {
                throw new IllegalStateException("Unable to call the default constructor of ".concat(clsLoadClass.getName()));
            } catch (InstantiationException unused2) {
                throw new IllegalStateException("Unable to instantiate the dynamic class ".concat(clsLoadClass.getName()));
            }
        } catch (ClassNotFoundException unused3) {
            throw new IllegalStateException("Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl");
        }
    }

    public static Context b(Context context) {
        Context contextCreatePackageContext;
        Context context2 = f8462a;
        if (context2 != null) {
            return context2;
        }
        context.getApplicationContext();
        try {
            contextCreatePackageContext = j6.e.c(context, j6.e.f12727b, "com.google.android.gms.maps_dynamite").f12737a;
        } catch (Exception e9) {
            try {
                if ("com.google.android.gms.maps_dynamite".equals("com.google.android.gms.maps_dynamite")) {
                    Log.e("l7", "Failed to load maps module, use pre-Chimera", e9);
                    AtomicBoolean atomicBoolean = v5.g.f48797a;
                    contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
                } else {
                    try {
                        Log.d("l7", "Attempting to load maps_dynamite again.");
                        contextCreatePackageContext = j6.e.c(context, j6.e.f12727b, "com.google.android.gms.maps_dynamite").f12737a;
                    } catch (Exception e10) {
                        Log.e("l7", "Failed to load maps module, use pre-Chimera", e10);
                        AtomicBoolean atomicBoolean2 = v5.g.f48797a;
                        contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
                contextCreatePackageContext = null;
            }
        }
        f8462a = contextCreatePackageContext;
        return contextCreatePackageContext;
    }
}
