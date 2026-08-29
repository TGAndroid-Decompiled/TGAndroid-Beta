package j8;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.List;
public abstract class k extends Service implements c {
    public static final String BIND_LISTENER_INTENT_ACTION = "com.google.android.gms.wearable.BIND_LISTENER";
    private ComponentName zza;
    private p zzb;
    private IBinder zzc;
    private Intent zzd;
    private Looper zze;
    private boolean zzg;
    private final Object zzf = new Object();
    private k8.d zzh = new k8.d(new m5.i((Object) this, 19));

    public static k8.d zzd(k kVar) {
        return kVar.zzh;
    }

    public Looper getLooper() {
        if (this.zze == null) {
            HandlerThread handlerThread = new HandlerThread("WearableListenerService");
            handlerThread.start();
            this.zze = handlerThread.getLooper();
        }
        return this.zze;
    }

    @Override
    public final android.os.IBinder onBind(android.content.Intent r5) {
        throw new UnsupportedOperationException("Method not decompiled: j8.k.onBind(android.content.Intent):android.os.IBinder");
    }

    @Override
    public void onChannelClosed(b bVar, int i10, int i11) {
    }

    @Override
    public void onChannelOpened(b bVar) {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        this.zza = new ComponentName(this, getClass().getName());
        if (Log.isLoggable("WearableLS", 3)) {
            Log.d("WearableLS", "onCreate: ".concat(String.valueOf(this.zza)));
        }
        this.zzb = new p(this, getLooper());
        Intent intent = new Intent("com.google.android.gms.wearable.BIND_LISTENER");
        this.zzd = intent;
        intent.setComponent(this.zza);
        this.zzc = new m(this);
    }

    @Override
    public void onDestroy() {
        if (Log.isLoggable("WearableLS", 3)) {
            Log.d("WearableLS", "onDestroy: ".concat(String.valueOf(this.zza)));
        }
        synchronized (this.zzf) {
            this.zzg = true;
            p pVar = this.zzb;
            if (pVar != null) {
                pVar.getLooper().quit();
                pVar.a("quit");
            } else {
                throw new IllegalStateException("onDestroy: mServiceHandler not set, did you override onCreate() but forget to call super.onCreate()? component=".concat(String.valueOf(this.zza)));
            }
        }
        super.onDestroy();
    }

    @Override
    public void onInputClosed(b bVar, int i10, int i11) {
    }

    public abstract void onMessageReceived(g gVar);

    @Override
    public void onOutputClosed(b bVar, int i10, int i11) {
    }

    public Task<byte[]> onRequest(String str, String str2, byte[] bArr) {
        return null;
    }

    public void onChannelClosed(d dVar, int i10, int i11) {
    }

    public void onChannelOpened(d dVar) {
    }

    public void onInputClosed(d dVar, int i10, int i11) {
    }

    public void onOutputClosed(d dVar, int i10, int i11) {
    }

    public void onCapabilityChanged(a aVar) {
    }

    public void onConnectedNodes(List<h> list) {
    }

    public void onDataChanged(e eVar) {
    }

    public void onEntityUpdate(l lVar) {
    }

    public void onNotificationReceived(n nVar) {
    }

    public void onPeerConnected(h hVar) {
    }

    public void onPeerDisconnected(h hVar) {
    }
}
