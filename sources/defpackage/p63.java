package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.media.AudioRecord;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.Callable;
import org.telegram.ui.Dictation.DictationLid;
import org.webrtc.audio.WebRtcAudioRecord;
public final class p63 implements Callable {
    public final byte a;
    public final Object b;
    public final Object c;

    public p63(byte[] bArr, int[] iArr) {
        this.a = (byte) 2;
        this.c = bArr;
        this.b = iArr;
    }

    @Override
    public final Object call() {
        String str;
        ServiceInfo serviceInfo;
        String str2;
        String str3;
        int i;
        ComponentName startService;
        String lambda$scheduleLogRecordingConfigurationsTask$0;
        int i2 = -1;
        int i3 = 0;
        switch (this.a) {
            case 0:
                byte[] bArr = (byte[]) this.c;
                return yz.f(bArr.length, ((q63) this.b).c, bArr);
            case 1:
                q63 q63Var = (q63) this.b;
                Uri uri = (Uri) this.c;
                o63 createDataSource = q63Var.b.createDataSource();
                int i4 = q63Var.c;
                try {
                    u63 u63Var = new u63(0L, uri);
                    x93 x93Var = (x93) createDataSource;
                    x93Var.open(u63Var);
                    byte[] bArr2 = new byte[1024];
                    int i5 = 0;
                    while (i3 != -1) {
                        if (i5 == bArr2.length) {
                            bArr2 = Arrays.copyOf(bArr2, bArr2.length << 1);
                        }
                        i3 = x93Var.read(bArr2, i5, bArr2.length - i5);
                        if (i3 != -1) {
                            i5 += i3;
                        }
                    }
                    byte[] copyOf = Arrays.copyOf(bArr2, i5);
                    Bitmap f = yz.f(copyOf.length, i4, copyOf);
                    x93Var.close();
                    return f;
                } catch (Throwable th) {
                    ((x93) createDataSource).close();
                    throw th;
                }
            case 2:
                return DictationLid.d((byte[]) this.c, (int[]) this.b);
            case 3:
                Context context = (Context) this.b;
                Intent intent = (Intent) this.c;
                c5a t = c5a.t();
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                ((ArrayDeque) t.e).offer(intent);
                Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent2.setPackage(context.getPackageName());
                synchronized (t) {
                    str = (String) t.b;
                    if (str == null) {
                        ResolveInfo resolveService = context.getPackageManager().resolveService(intent2, 0);
                        str = null;
                        if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
                            if (context.getPackageName().equals(serviceInfo.packageName) && (str2 = serviceInfo.name) != null) {
                                if (str2.startsWith(".")) {
                                    str3 = context.getPackageName() + serviceInfo.name;
                                    t.b = str3;
                                } else {
                                    str3 = serviceInfo.name;
                                    t.b = str3;
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
                    if (t.A(context)) {
                        startService = kdd.d(context, intent2);
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
            default:
                lambda$scheduleLogRecordingConfigurationsTask$0 = ((WebRtcAudioRecord) this.b).lambda$scheduleLogRecordingConfigurationsTask$0((AudioRecord) this.c);
                return lambda$scheduleLogRecordingConfigurationsTask$0;
        }
    }

    public p63(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
