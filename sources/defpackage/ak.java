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
public final class ak extends BroadcastReceiver {
    public final byte a;
    public final Object b;

    public ak(Object obj, byte b) {
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
                bk bkVar = (bk) this.b;
                bkVar.c.execute(new zj(bkVar, (byte) 2));
                return;
            case 1:
                ((zo) this.b).k();
                return;
            case 2:
                vz vzVar = (vz) this.b;
                if (!isInitialStickyBroadcast()) {
                    vzVar.k(sz.b(context, intent, (oz) vzVar.w, (AudioDeviceInfo) vzVar.s, vzVar.j()));
                    return;
                }
                return;
            case 3:
                go1 go1Var = new go1(this, (byte) 21);
                if ("android.intent.action.MEDIA_UNMOUNTED".equals(intent.getAction())) {
                    ((u32) this.b).r.postDelayed(go1Var, 1000L);
                    return;
                } else {
                    go1Var.run();
                    return;
                }
            case 4:
                ((lq3) this.b).g();
                return;
            case 5:
                if (f11.a) {
                    cc4.b("file system changed");
                }
                ea5 ea5Var = new ea5(this, (byte) 11);
                if ("android.intent.action.MEDIA_UNMOUNTED".equals(intent.getAction())) {
                    hl.d3(ea5Var, 1000L);
                    return;
                } else {
                    ea5Var.run();
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
                hl.c3(new ls5(this, str, str2, (byte) 11));
                return;
            case 7:
                a.d.post(new z96(this, (byte) 2));
                return;
            case 8:
                if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                    ((ou6) this.b).dismiss();
                    return;
                }
                return;
            case 9:
                if (Objects.equals(intent.getAction(), "android.intent.action.MEDIA_BUTTON") && (a = rhe.a(intent)) != null) {
                    ((xo6) ((kj4) ((qy6) this.b).p.c).b).a.dispatchMediaButtonEvent(a);
                    return;
                }
                return;
            case 10:
                ((Executor) ((yv2) this.b).b).execute(new t87(this, context, (byte) 27));
                return;
            case 11:
                ((ye3) this.b).c();
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
                    ygb ygbVar = (ygb) this.b;
                    me8 me8Var = ygbVar.f;
                    if (me8Var == null) {
                        me8Var = ygbVar.e;
                    }
                    if (me8Var != null) {
                        me8Var.a.G0(intent.getIntExtra("action_id", -1));
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
