package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
public abstract class u0f {
    public static Context a;
    public static itd b;

    public static itd a(Context context) {
        Class cls;
        Class cls2;
        itd itdVar;
        fre.h(context);
        Log.d("u0f", "preferredRenderer: null");
        itd itdVar2 = b;
        if (itdVar2 == null) {
            int i = yy4.e;
            int c = yy4.c(context, 13400000);
            if (c == 0) {
                Log.i("u0f", "Making Creator dynamically");
                ClassLoader classLoader = b(context).getClassLoader();
                try {
                    fre.h(classLoader);
                    try {
                        try {
                            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.maps.internal.CreatorImpl").newInstance();
                            if (iBinder == null) {
                                itdVar = 0;
                            } else {
                                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
                                if (queryLocalInterface instanceof itd) {
                                    itdVar = (itd) queryLocalInterface;
                                } else {
                                    itdVar = new ezc(iBinder, "com.google.android.gms.maps.internal.ICreator", (byte) 6);
                                }
                            }
                            b = itdVar;
                            try {
                                Context b2 = b(context);
                                b2.getClass();
                                bo7 bo7Var = new bo7(b2.getResources());
                                Parcel R = itdVar.R();
                                sgd.c(R, bo7Var);
                                R.writeInt(12451000);
                                itdVar.V(R, 6);
                                return b;
                            } catch (RemoteException e) {
                                fvc.g(e);
                                return null;
                            }
                        } catch (InstantiationException unused) {
                            throw new IllegalStateException("Unable to instantiate the dynamic class ".concat(cls2.getName()));
                        }
                    } catch (IllegalAccessException unused2) {
                        throw new IllegalStateException("Unable to call the default constructor of ".concat(cls.getName()));
                    }
                } catch (ClassNotFoundException unused3) {
                    sc8.j("Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl");
                    return null;
                }
            }
            throw new xy4(c);
        }
        return itdVar2;
    }

    public static Context b(Context context) {
        Context context2;
        Context context3 = a;
        if (context3 == null) {
            context.getApplicationContext();
            try {
                context2 = ds3.c(context, ds3.b, "com.google.android.gms.maps_dynamite").a;
            } catch (Exception e) {
                try {
                    if (!"com.google.android.gms.maps_dynamite".equals("com.google.android.gms.maps_dynamite")) {
                        try {
                            Log.d("u0f", "Attempting to load maps_dynamite again.");
                            context2 = ds3.c(context, ds3.b, "com.google.android.gms.maps_dynamite").a;
                        } catch (Exception e2) {
                            Log.e("u0f", "Failed to load maps module, use pre-Chimera", e2);
                            int i = yy4.e;
                            context2 = context.createPackageContext("com.google.android.gms", 3);
                        }
                    } else {
                        Log.e("u0f", "Failed to load maps module, use pre-Chimera", e);
                        int i2 = yy4.e;
                        context2 = context.createPackageContext("com.google.android.gms", 3);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    context2 = null;
                }
            }
            a = context2;
            return context2;
        }
        return context3;
    }
}
