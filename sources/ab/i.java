package ab;

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
public final class i implements Callable {
    public final int f938a;
    public final Object f939b;
    public final Object f940c;

    public i(int i7, Object obj, Object obj2) {
        this.f938a = i7;
        this.f939b = obj;
        this.f940c = obj2;
    }

    @Override
    public final Object call() {
        String str;
        ServiceInfo serviceInfo;
        String str2;
        int i7;
        ComponentName startService;
        String lambda$scheduleLogRecordingConfigurationsTask$0;
        switch (this.f938a) {
            case 0:
                Context context = (Context) this.f939b;
                Intent intent = (Intent) this.f940c;
                c0 v = c0.v();
                v.getClass();
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                ((ArrayDeque) v.f910e).offer(intent);
                Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent2.setPackage(context.getPackageName());
                synchronized (v) {
                    try {
                        str = (String) v.f908b;
                        if (str == null) {
                            ResolveInfo resolveService = context.getPackageManager().resolveService(intent2, 0);
                            if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
                                if (context.getPackageName().equals(serviceInfo.packageName) && (str2 = serviceInfo.name) != null) {
                                    if (str2.startsWith(".")) {
                                        v.f908b = context.getPackageName() + serviceInfo.name;
                                    } else {
                                        v.f908b = serviceInfo.name;
                                    }
                                    str = (String) v.f908b;
                                }
                                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                                str = null;
                            }
                            Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                            str = null;
                        }
                    } finally {
                    }
                }
                if (str != null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Restricting intent to a specific service: ".concat(str));
                    }
                    intent2.setClassName(context.getPackageName(), str);
                }
                try {
                    if (v.A(context)) {
                        startService = m0.d(context, intent2);
                    } else {
                        startService = context.startService(intent2);
                        Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                    }
                    if (startService == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i7 = 404;
                    } else {
                        i7 = -1;
                    }
                } catch (IllegalStateException e10) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: " + e10);
                    i7 = 402;
                } catch (SecurityException e11) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e11);
                    i7 = 401;
                }
                return Integer.valueOf(i7);
            case 1:
                return DictationLid.a((byte[]) this.f939b, (int[]) this.f940c);
            case 2:
                j2.i iVar = (j2.i) this.f939b;
                byte[] bArr = (byte[]) this.f940c;
                boolean z10 = iVar.d;
                Bitmap b10 = bg.o0.b(bArr.length, iVar.f17263c, bArr);
                if (z10) {
                    return bg.o0.e(b10);
                }
                return b10;
            case 3:
                j2.i iVar2 = (j2.i) this.f939b;
                Uri uri = (Uri) this.f940c;
                j2.h createDataSource = iVar2.f17262b.createDataSource();
                int i10 = iVar2.f17263c;
                boolean z11 = iVar2.d;
                try {
                    j2.m mVar = new j2.m(0L, uri);
                    j2.n nVar = (j2.n) createDataSource;
                    nVar.open(mVar);
                    byte[] bArr2 = new byte[1024];
                    int i11 = 0;
                    int i12 = 0;
                    while (i11 != -1) {
                        if (i12 == bArr2.length) {
                            bArr2 = Arrays.copyOf(bArr2, bArr2.length * 2);
                        }
                        i11 = nVar.read(bArr2, i12, bArr2.length - i12);
                        if (i11 != -1) {
                            i12 += i11;
                        }
                    }
                    byte[] copyOf = Arrays.copyOf(bArr2, i12);
                    Bitmap b11 = bg.o0.b(copyOf.length, i10, copyOf);
                    if (z11) {
                        b11 = bg.o0.e(b11);
                    }
                    nVar.close();
                    return b11;
                } catch (Throwable th2) {
                    ((j2.n) createDataSource).close();
                    throw th2;
                }
            default:
                lambda$scheduleLogRecordingConfigurationsTask$0 = ((WebRtcAudioRecord) this.f939b).lambda$scheduleLogRecordingConfigurationsTask$0((AudioRecord) this.f940c);
                return lambda$scheduleLogRecordingConfigurationsTask$0;
        }
    }
}
