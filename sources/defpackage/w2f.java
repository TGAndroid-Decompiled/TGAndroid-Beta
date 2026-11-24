package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
public abstract class w2f {
    public static Context a;
    public static lvd b;

    public static lvd a(Context context) {
        Class cls;
        Class cls2;
        lvd lvdVar;
        ite.h(context);
        Log.d("w2f", "preferredRenderer: null");
        lvd lvdVar2 = b;
        if (lvdVar2 == null) {
            int i = x05.e;
            int c = x05.c(context, 13400000);
            if (c == 0) {
                Log.i("w2f", "Making Creator dynamically");
                ClassLoader classLoader = b(context).getClassLoader();
                try {
                    ite.h(classLoader);
                    try {
                        try {
                            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.maps.internal.CreatorImpl").newInstance();
                            if (iBinder == null) {
                                lvdVar = 0;
                            } else {
                                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
                                if (queryLocalInterface instanceof lvd) {
                                    lvdVar = (lvd) queryLocalInterface;
                                } else {
                                    lvdVar = new f1d(iBinder, "com.google.android.gms.maps.internal.ICreator", (byte) 6);
                                }
                            }
                            b = lvdVar;
                            try {
                                Context b2 = b(context);
                                b2.getClass();
                                eq7 eq7Var = new eq7(b2.getResources());
                                Parcel R = lvdVar.R();
                                tid.c(R, eq7Var);
                                R.writeInt(12451000);
                                lvdVar.V(R, 6);
                                return b;
                            } catch (RemoteException e) {
                                i2d.h(e);
                                return null;
                            }
                        } catch (InstantiationException unused) {
                            throw new IllegalStateException("Unable to instantiate the dynamic class ".concat(cls2.getName()));
                        }
                    } catch (IllegalAccessException unused2) {
                        throw new IllegalStateException("Unable to call the default constructor of ".concat(cls.getName()));
                    }
                } catch (ClassNotFoundException unused3) {
                    dq9.m("Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl");
                    return null;
                }
            }
            throw new w05(c);
        }
        return lvdVar2;
    }

    public static Context b(Context context) {
        Context context2;
        Context context3 = a;
        if (context3 == null) {
            context.getApplicationContext();
            try {
                context2 = nt3.c(context, nt3.b, "com.google.android.gms.maps_dynamite").a;
            } catch (Exception e) {
                try {
                    if (!"com.google.android.gms.maps_dynamite".equals("com.google.android.gms.maps_dynamite")) {
                        try {
                            Log.d("w2f", "Attempting to load maps_dynamite again.");
                            context2 = nt3.c(context, nt3.b, "com.google.android.gms.maps_dynamite").a;
                        } catch (Exception e2) {
                            Log.e("w2f", "Failed to load maps module, use pre-Chimera", e2);
                            int i = x05.e;
                            context2 = context.createPackageContext("com.google.android.gms", 3);
                        }
                    } else {
                        Log.e("w2f", "Failed to load maps module, use pre-Chimera", e);
                        int i2 = x05.e;
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
