package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
public final class uj0 implements rzc {
    public final Context a;

    public uj0(Context context, byte b) {
        switch (b) {
            case 1:
                context.getClass();
                this.a = context;
                return;
            default:
                context.getClass();
                this.a = context;
                return;
        }
    }

    public static s13 b(uj0 uj0Var, Object obj) {
        if (obj.equals("androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            return uj0Var.d();
        }
        if (obj instanceof ws4) {
            for (r13 r13Var : ((ws4) obj).a) {
                if (r13Var instanceof ys4) {
                    return uj0Var.d();
                }
            }
        }
        Context context = uj0Var.a;
        context.getClass();
        if (!context.getPackageManager().hasSystemFeature("android.software.leanback") && !context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            int i = Build.VERSION.SDK_INT;
            g23 g23Var = null;
            if (i >= 34) {
                g23 g23Var2 = new g23(context);
                if (g23Var2.isAvailableOnDevice()) {
                    g23Var = g23Var2;
                }
                if (g23Var == null) {
                    return uj0Var.d();
                }
                return g23Var;
            } else if (i > 33) {
                return null;
            } else {
                return uj0Var.d();
            }
        }
        return uj0Var.d();
    }

    public static int c(defpackage.fm4 r5) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uj0.c(fm4):int");
    }

    @Override
    public final Object a() {
        return this.a;
    }

    public final s13 d() {
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
        List<String> k = yk2.k(arrayList);
        if (k.isEmpty()) {
            return null;
        }
        s13 s13Var = null;
        for (String str : k) {
            try {
                Object newInstance = Class.forName(str).getConstructor(Context.class).newInstance(context);
                newInstance.getClass();
                s13 s13Var2 = (s13) newInstance;
                if (!s13Var2.isAvailableOnDevice()) {
                    continue;
                } else if (s13Var != null) {
                    Log.i("CredProviderFactory", "Only one active OEM CredentialProvider allowed");
                    return null;
                } else {
                    s13Var = s13Var2;
                }
            } catch (Throwable unused) {
            }
        }
        return s13Var;
    }

    public uj0(Context context, char c) {
        this.a = context;
    }
}
