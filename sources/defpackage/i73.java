package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.Callable;
import org.telegram.ui.Dictation.DictationLid;
import org.webrtc.EglBase;
import org.webrtc.EglThread;
public final class i73 implements Callable {
    public final byte a;
    public final Object b;
    public final Object c;

    public i73(byte[] bArr, int[] iArr) {
        this.a = (byte) 2;
        this.c = bArr;
        this.b = iArr;
    }

    @Override
    public final Object call() {
        EglBase.EglConnection lambda$create$0;
        String str;
        ServiceInfo serviceInfo;
        String str2;
        String str3;
        int i;
        ComponentName startService;
        int i2 = -1;
        int i3 = 0;
        switch (this.a) {
            case 0:
                byte[] bArr = (byte[]) this.c;
                return zz.f(bArr.length, ((j73) this.b).c, bArr);
            case 1:
                j73 j73Var = (j73) this.b;
                Uri uri = (Uri) this.c;
                h73 createDataSource = j73Var.b.createDataSource();
                int i4 = j73Var.c;
                try {
                    n73 n73Var = new n73(0L, uri);
                    qa3 qa3Var = (qa3) createDataSource;
                    qa3Var.open(n73Var);
                    byte[] bArr2 = new byte[1024];
                    int i5 = 0;
                    while (i3 != -1) {
                        if (i5 == bArr2.length) {
                            bArr2 = Arrays.copyOf(bArr2, bArr2.length << 1);
                        }
                        i3 = qa3Var.read(bArr2, i5, bArr2.length - i5);
                        if (i3 != -1) {
                            i5 += i3;
                        }
                    }
                    byte[] copyOf = Arrays.copyOf(bArr2, i5);
                    Bitmap f = zz.f(copyOf.length, i4, copyOf);
                    qa3Var.close();
                    return f;
                } catch (Throwable th) {
                    ((qa3) createDataSource).close();
                    throw th;
                }
            case 2:
                return DictationLid.e((byte[]) this.c, (int[]) this.b);
            case 3:
                lambda$create$0 = EglThread.lambda$create$0((EglBase.Context) this.b, (int[]) this.c);
                return lambda$create$0;
            default:
                Context context = (Context) this.b;
                Intent intent = (Intent) this.c;
                u8a v = u8a.v();
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                ((ArrayDeque) v.d).offer(intent);
                Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent2.setPackage(context.getPackageName());
                synchronized (v) {
                    str = (String) v.a;
                    if (str == null) {
                        ResolveInfo resolveService = context.getPackageManager().resolveService(intent2, 0);
                        str = null;
                        if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
                            if (context.getPackageName().equals(serviceInfo.packageName) && (str2 = serviceInfo.name) != null) {
                                if (str2.startsWith(".")) {
                                    str3 = context.getPackageName() + serviceInfo.name;
                                    v.a = str3;
                                } else {
                                    str3 = serviceInfo.name;
                                    v.a = str3;
                                }
                                str = str3;
                            } else {
                                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                            }
                        } else {
                            Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                        }
                    }
                }
                if (str != null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Restricting intent to a specific service: ".concat(str));
                    }
                    intent2.setClassName(context.getPackageName(), str);
                }
                try {
                    if (v.x(context)) {
                        startService = cid.d(context, intent2);
                    } else {
                        startService = context.startService(intent2);
                        Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                    }
                    if (startService == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i2 = 404;
                    }
                } catch (IllegalStateException e) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: " + e);
                    i = 402;
                    i2 = i;
                    return Integer.valueOf(i2);
                } catch (SecurityException e2) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e2);
                    i = 401;
                    i2 = i;
                    return Integer.valueOf(i2);
                }
                return Integer.valueOf(i2);
        }
    }

    public i73(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
