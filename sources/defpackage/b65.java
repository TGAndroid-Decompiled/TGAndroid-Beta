package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import java.nio.charset.StandardCharsets;
import java.util.Calendar;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.video.VideoAds;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class b65 implements View.OnClickListener {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object h;
    public final Object n;

    public b65(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.h = obj6;
        this.n = obj7;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        Object obj = this.n;
        Object obj2 = this.h;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        Object obj7 = this.b;
        switch (b) {
            case 0:
                j95 j95Var = (j95) obj7;
                hq7 hq7Var = (hq7) obj6;
                v75 v75Var = (v75) obj5;
                w75 w75Var = (w75) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                k5 k5Var = (k5) obj2;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                j95Var.Q2 = ofFloat;
                ofFloat.setDuration(600L);
                j95Var.Q2.addUpdateListener(new ch4(j95Var, (byte) 5));
                j95Var.Q2.addListener(new y75(j95Var));
                j95Var.Q2.start();
                boolean W = xc2.W(j95Var.S2);
                x65 x65Var = j95Var.X2;
                if (W) {
                    x65Var.b(ob6.M0(2131743099, null), true);
                } else {
                    x65Var.b(ob6.M0(2131742958, null), true);
                }
                Calendar calendar = Calendar.getInstance();
                boolean g = jj.g(null, null, 0L, 604800L, 3, hq7Var, v75Var, w75Var);
                calendar.setTimeInMillis((hq7Var.getValue() * 86400000) + System.currentTimeMillis());
                calendar.set(11, v75Var.getValue());
                calendar.set(12, w75Var.getValue());
                if (g) {
                    calendar.set(13, 0);
                }
                j95Var.c4 = (int) (calendar.getTimeInMillis() / 1000);
                j95Var.K1(false);
                TL_phone.createGroupCall creategroupcall = new TL_phone.createGroupCall();
                creategroupcall.peer = uc7.l1(chat);
                creategroupcall.random_id = Utilities.b.nextInt();
                creategroupcall.schedule_date = j95Var.c4;
                creategroupcall.flags |= 2;
                ConnectionsManager.getInstance(k5Var.a).sendRequest(creategroupcall, new fn0(j95Var, chat, inputPeer, (byte) 28), 2);
                return;
            case 1:
                ((VideoAds) obj7).lambda$show$17((v21) obj6, (TLRPC.TL_sponsoredMessage) obj5, (Context) obj4, (vnb) obj3, (VideoAds.AdLayout) obj2, (eec) obj, view);
                return;
            default:
                c51 c51Var = (c51) obj7;
                zpc zpcVar = (zpc) obj6;
                kcc kccVar = (kcc) obj5;
                String[] strArr = (String[]) obj4;
                boolean[] zArr = (boolean[]) obj3;
                jl7[] jl7VarArr = (jl7[]) obj2;
                vnb vnbVar = (vnb) obj;
                if (!c51Var.R) {
                    if (zpcVar != null && zpcVar.getText().toString().getBytes(StandardCharsets.UTF_8).length > 960) {
                        hl.B3(zpcVar);
                        return;
                    }
                    c51Var.setLoading(true);
                    kccVar.a(strArr[0], Boolean.valueOf(zArr[0]), new v58(c51Var, jl7VarArr, vnbVar, (byte) 13));
                    return;
                }
                return;
        }
    }
}
