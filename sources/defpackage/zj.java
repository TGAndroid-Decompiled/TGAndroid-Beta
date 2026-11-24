package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.view.KeyEvent;
import j$.util.Objects;
import java.util.concurrent.Executor;
import org.telegram.messenger.a;
public final class zj extends BroadcastReceiver {
    public final byte a;
    public final Object b;

    public zj(Object obj, byte b) {
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
                ak akVar = (ak) this.b;
                akVar.c.execute(new yj(akVar, (byte) 2));
                return;
            case 1:
                ((yo) this.b).k();
                return;
            case 2:
                uz uzVar = (uz) this.b;
                if (!isInitialStickyBroadcast()) {
                    uzVar.b(rz.b(context, intent, uzVar.j, uzVar.i, uzVar.a()));
                    return;
                }
                return;
            case 3:
                hq1 hq1Var = new hq1(this, (byte) 15);
                if ("android.intent.action.MEDIA_UNMOUNTED".equals(intent.getAction())) {
                    ((d32) this.b).r.postDelayed(hq1Var, 1000L);
                    return;
                } else {
                    hq1Var.run();
                    return;
                }
            case 4:
                ((up3) this.b).g();
                return;
            case 5:
                if (w01.a) {
                    fa4.b("file system changed");
                }
                iu4 iu4Var = new iu4(this, (byte) 26);
                if ("android.intent.action.MEDIA_UNMOUNTED".equals(intent.getAction())) {
                    gl.d3(iu4Var, 1000L);
                    return;
                } else {
                    iu4Var.run();
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
                gl.c3(new sx5(this, str, str2, (byte) 6));
                return;
            case 7:
                a.d.post(new tp5(this, (byte) 17));
                return;
            case 8:
                if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                    ((js6) this.b).dismiss();
                    return;
                }
                return;
            case 9:
                if (Objects.equals(intent.getAction(), "android.intent.action.MEDIA_BUTTON") && (a = ade.a(intent)) != null) {
                    ((tm6) ((gi3) ((lw6) this.b).p.c).a).a.dispatchMediaButtonEvent(a);
                    return;
                }
                return;
            case 10:
                ((Executor) ((ev2) this.b).b).execute(new bj7(this, context, (byte) 0));
                return;
            case 11:
                ((ee3) this.b).c();
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
                    ddb ddbVar = (ddb) this.b;
                    xa8 xa8Var = ddbVar.f;
                    if (xa8Var == null) {
                        xa8Var = ddbVar.e;
                    }
                    if (xa8Var != null) {
                        xa8Var.a.G2(intent.getIntExtra("action_id", -1));
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
