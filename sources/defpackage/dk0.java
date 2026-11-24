package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
public final class dk0 {
    public final Context a;

    public dk0(Context context, byte b) {
        switch (b) {
            case 1:
                context.getClass();
                this.a = context;
                return;
            default:
                this.a = context.getApplicationContext();
                return;
        }
    }

    public static d33 a(dk0 dk0Var, Object obj) {
        if (obj.equals("androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            return dk0Var.b();
        }
        if (obj instanceof xu4) {
            for (c33 c33Var : ((xu4) obj).a) {
                if (c33Var instanceof zu4) {
                    return dk0Var.b();
                }
            }
        }
        Context context = dk0Var.a;
        context.getClass();
        if (!context.getPackageManager().hasSystemFeature("android.software.leanback") && !context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            int i = Build.VERSION.SDK_INT;
            r33 r33Var = null;
            if (i >= 34) {
                r33 r33Var2 = new r33(context);
                if (r33Var2.isAvailableOnDevice()) {
                    r33Var = r33Var2;
                }
                if (r33Var == null) {
                    return dk0Var.b();
                }
                return r33Var;
            } else if (i > 33) {
                return null;
            } else {
                return dk0Var.b();
            }
        }
        return dk0Var.b();
    }

    public final d33 b() {
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
        List<String> k = km2.k(arrayList);
        if (k.isEmpty()) {
            return null;
        }
        d33 d33Var = null;
        for (String str : k) {
            try {
                Object newInstance = Class.forName(str).getConstructor(Context.class).newInstance(context);
                newInstance.getClass();
                d33 d33Var2 = (d33) newInstance;
                if (!d33Var2.isAvailableOnDevice()) {
                    continue;
                } else if (d33Var != null) {
                    Log.i("CredProviderFactory", "Only one active OEM CredentialProvider allowed");
                    return null;
                } else {
                    d33Var = d33Var2;
                }
            } catch (Throwable unused) {
            }
        }
        return d33Var;
    }
}
