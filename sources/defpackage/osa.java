package defpackage;

import android.content.SharedPreferences;
import android.os.Debug;
import android.util.Log;
import org.telegram.messenger.voip.VoIPPreNotificationService;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.utils.twidget.WidgetEngineService;
import org.telegram.utils.twidget.z;
public final class osa implements Runnable {
    public final byte a;

    @Override
    public final void run() {
        d31 Y;
        e b0;
        switch (this.a) {
            case 0:
                e S = LaunchActivity.S();
                if ((S instanceof iic) && (b0 = ((iic) S).b0()) != null) {
                    S = b0;
                }
                if (S != null) {
                    Y = d31.b0(S);
                } else {
                    Y = d31.Y();
                }
                v21 Q = Y.Q(2131624052, 36, ob6.M0(2131750175, null));
                Q.u = true;
                Q.j();
                return;
            case 1:
                yw0.APP_ERROR.a();
                return;
            case 2:
                e S2 = LaunchActivity.S();
                if (S2 != null) {
                    S2.presentFragment(new nza());
                    return;
                }
                return;
            case 3:
                jn7.f(yac.t0).m(218, new Object[0]);
                return;
            case 4:
                uc7.e1().edit().putInt("storydualhint", uc7.e1().getInt("storydualhint", 0) + 1).apply();
                return;
            case 5:
                ggb.y = null;
                return;
            case 6:
                SharedPreferences.Editor edit = uc7.e1().edit();
                hnb.f = Boolean.TRUE;
                edit.putBoolean("nothanos", true).apply();
                return;
            case 7:
                SharedPreferences.Editor edit2 = uc7.e1().edit();
                hnb.f = Boolean.TRUE;
                edit2.putBoolean("nothanos", true).apply();
                return;
            case 8:
                aob.N = false;
                aob.E(false);
                return;
            case 9:
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    return;
                }
                return;
            case 10:
                dlc.b();
                return;
            case 11:
                elc.c();
                return;
            case 12:
                VoIPPreNotificationService.d();
                return;
            case 13:
                VoIPService.lambda$startConferenceGroupCall$38();
                return;
            case 14:
                VoIPService.lambda$startOutgoingCall$6();
                return;
            case 15:
                VoIPService.lambda$startGroupCall$27();
                return;
            case 16:
                VoIPService.lambda$onDestroy$94();
                return;
            case 17:
                VoIPService.lambda$configureDeviceForCall$107();
                return;
            case 18:
                VoIPService.lambda$acceptIncomingCall$97();
                return;
            case 19:
                PhotoViewer.q0().A(false, false);
                return;
            case 20:
                return;
            case 21:
                break;
            case 22:
                k0d.i();
                return;
            default:
                if (z.a()) {
                    k0d.f.clear();
                    for (h0d h0dVar : k0d.a.values()) {
                        q0d q0dVar = h0dVar.v;
                        if (q0dVar != null && q0dVar.e != null) {
                            q0dVar.n();
                        }
                    }
                    return;
                }
                return;
        }
        while (true) {
            try {
                synchronized (gid.a) {
                    while (gid.b == 0) {
                        gid.a.wait();
                    }
                }
                long nativeHeapAllocatedSize = Debug.getNativeHeapAllocatedSize();
                if (nativeHeapAllocatedSize > 419430400) {
                    Log.e("WidgetEngine", "native heap " + (nativeHeapAllocatedSize >> 20) + " MB, over 400 MB: the engine stops");
                    WidgetEngineService.exitNow(1);
                }
                Thread.sleep(500L);
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    public osa(byte b) {
        this.a = b;
    }

    private final void a() {
    }
}
