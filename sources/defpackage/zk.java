package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.media.AudioDeviceInfo;
import android.view.KeyEvent;
import j$.util.Objects;
import java.util.concurrent.Executor;
import org.telegram.messenger.a;
public final class zk extends BroadcastReceiver {
    public final byte a;
    public final Object b;

    public zk(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        String str;
        String str2;
        KeyEvent a;
        switch (this.a) {
            case 0:
                al alVar = (al) this.b;
                alVar.c.execute(new yk(alVar, (byte) 2));
                return;
            case 1:
                ((yp) this.b).k();
                return;
            case 2:
                u00 u00Var = (u00) this.b;
                if (!isInitialStickyBroadcast()) {
                    u00Var.k(r00.b(context, intent, (o00) u00Var.w, (AudioDeviceInfo) u00Var.s, u00Var.j()));
                    return;
                }
                return;
            case 3:
                fo1 fo1Var = new fo1(this, (byte) 20);
                if ("android.intent.action.MEDIA_UNMOUNTED".equals(intent.getAction())) {
                    ((p42) this.b).r.postDelayed(fo1Var, 1000L);
                    return;
                } else {
                    fo1Var.run();
                    return;
                }
            case 4:
                ((er3) this.b).g();
                return;
            case 5:
                if (e21.a) {
                    fc4.b("file system changed");
                }
                kg5 kg5Var = new kg5(this, (byte) 3);
                if ("android.intent.action.MEDIA_UNMOUNTED".equals(intent.getAction())) {
                    gm.d3(kg5Var, 1000L);
                    return;
                } else {
                    kg5Var.run();
                    return;
                }
            case 6:
                if (intent.getStringExtra("mode") != null) {
                    str = intent.getStringExtra("mode");
                } else {
                    str = "toggle";
                }
                if (intent.getStringExtra("style") != null) {
                    str2 = intent.getStringExtra("style");
                } else {
                    str2 = "reveal";
                }
                gm.c3(new dt5(this, str, str2, (byte) 8));
                return;
            case 7:
                a.d.post(new kg5(this, (byte) 24));
                return;
            case 8:
                if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                    ((ku6) this.b).dismiss();
                    return;
                }
                return;
            case 9:
                if (Objects.equals(intent.getAction(), "android.intent.action.MEDIA_BUTTON") && (a = bfe.a(intent)) != null) {
                    ((to6) ((lj4) ((ly6) this.b).p.c).a).a.dispatchMediaButtonEvent(a);
                    return;
                }
                return;
            case 10:
                ((Executor) ((ow2) this.b).b).execute(new bl7(this, context, (byte) 1));
                return;
            case 11:
                ((pf3) this.b).c();
                return;
            case 12:
                try {
                    ((IntentSender) this.b).sendIntent(context, 0, null, null, null);
                    return;
                } catch (IntentSender.SendIntentException unused) {
                    return;
                }
            default:
                if ("org.telegram.utils.pip.ACTION".equals(intent.getAction())) {
                    efb efbVar = (efb) this.b;
                    ad8 ad8Var = efbVar.f;
                    if (ad8Var == null) {
                        ad8Var = efbVar.e;
                    }
                    if (ad8Var != null) {
                        ad8Var.a.B0(intent.getIntExtra("action_id", -1));
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
