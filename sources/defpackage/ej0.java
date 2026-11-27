package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
public final class ej0 implements i4d {
    public final Context a;

    public ej0(Context context, byte b) {
        switch (b) {
            case 1:
                context.getClass();
                this.a = context;
                return;
            case 2:
                this.a = context;
                return;
            default:
                this.a = context.getApplicationContext();
                return;
        }
    }

    public static k23 b(ej0 ej0Var, Object obj) {
        if (obj.equals("androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            return ej0Var.c();
        }
        if (obj instanceof av4) {
            for (j23 j23Var : ((av4) obj).a) {
                if (j23Var instanceof cv4) {
                    return ej0Var.c();
                }
            }
        }
        Context context = ej0Var.a;
        context.getClass();
        if (!context.getPackageManager().hasSystemFeature("android.software.leanback") && !context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            int i = Build.VERSION.SDK_INT;
            y23 y23Var = null;
            if (i >= 34) {
                y23 y23Var2 = new y23(context);
                if (y23Var2.isAvailableOnDevice()) {
                    y23Var = y23Var2;
                }
                if (y23Var == null) {
                    return ej0Var.c();
                }
                return y23Var;
            } else if (i > 33) {
                return null;
            } else {
                return ej0Var.c();
            }
        }
        return ej0Var.c();
    }

    @Override
    public final Object a() {
        return this.a;
    }

    public final k23 c() {
        String string;
        Context context = this.a;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 132);
        ArrayList arrayList = new ArrayList();
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                Bundle bundle = serviceInfo.metaData;
                if (bundle != null && (string = bundle.getString("androidx.credentials.CREDENTIAL_PROVIDER_KEY")) != null) {
                    arrayList.add(string);
                }
            }
        }
        List<String> k = sl2.k(arrayList);
        if (k.isEmpty()) {
            return null;
        }
        k23 k23Var = null;
        for (String str : k) {
            try {
                Object newInstance = Class.forName(str).getConstructor(Context.class).newInstance(context);
                newInstance.getClass();
                k23 k23Var2 = (k23) newInstance;
                if (!k23Var2.isAvailableOnDevice()) {
                    continue;
                } else if (k23Var != null) {
                    Log.i("CredProviderFactory", "Only one active OEM CredentialProvider allowed");
                    return null;
                } else {
                    k23Var = k23Var2;
                }
            } catch (Throwable unused) {
            }
        }
        return k23Var;
    }
}
