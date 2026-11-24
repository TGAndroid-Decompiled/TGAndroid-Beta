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
public final class x55 implements View.OnClickListener {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object h;
    public final Object n;

    public x55(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, byte b) {
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
                g95 g95Var = (g95) obj7;
                lp7 lp7Var = (lp7) obj6;
                r75 r75Var = (r75) obj5;
                s75 s75Var = (s75) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                j5 j5Var = (j5) obj2;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                g95Var.Q2 = ofFloat;
                ofFloat.setDuration(600L);
                g95Var.Q2.addUpdateListener(new fh4(g95Var, (byte) 5));
                g95Var.Q2.addListener(new u75(g95Var));
                g95Var.Q2.start();
                boolean W = sd2.W(g95Var.S2);
                t65 t65Var = g95Var.X2;
                if (W) {
                    t65Var.b(jb6.M0(2131743131, null), true);
                } else {
                    t65Var.b(jb6.M0(2131742990, null), true);
                }
                Calendar calendar = Calendar.getInstance();
                boolean g = ik.g(null, null, 0L, 604800L, 3, lp7Var, r75Var, s75Var);
                calendar.setTimeInMillis((lp7Var.getValue() * 86400000) + System.currentTimeMillis());
                calendar.set(11, r75Var.getValue());
                calendar.set(12, s75Var.getValue());
                if (g) {
                    calendar.set(13, 0);
                }
                g95Var.c4 = (int) (calendar.getTimeInMillis() / 1000);
                g95Var.J1(false);
                TL_phone.createGroupCall creategroupcall = new TL_phone.createGroupCall();
                creategroupcall.peer = oc7.k1(chat);
                creategroupcall.random_id = Utilities.b.nextInt();
                creategroupcall.schedule_date = g95Var.c4;
                creategroupcall.flags |= 2;
                ConnectionsManager.getInstance(j5Var.a).sendRequest(creategroupcall, new eo0(g95Var, chat, inputPeer, (byte) 28), 2);
                return;
            case 1:
                ((VideoAds) obj7).lambda$show$17((u31) obj6, (TLRPC.TL_sponsoredMessage) obj5, (Context) obj4, (ylb) obj3, (VideoAds.AdLayout) obj2, (fcc) obj, view);
                return;
            default:
                b61 b61Var = (b61) obj7;
                lnc lncVar = (lnc) obj6;
                lac lacVar = (lac) obj5;
                String[] strArr = (String[]) obj4;
                boolean[] zArr = (boolean[]) obj3;
                el7[] el7VarArr = (el7[]) obj2;
                ylb ylbVar = (ylb) obj;
                if (!b61Var.R) {
                    if (lncVar != null && lncVar.getText().toString().getBytes(StandardCharsets.UTF_8).length > 960) {
                        gm.B3(lncVar);
                        return;
                    }
                    b61Var.setLoading(true);
                    lacVar.a(strArr[0], Boolean.valueOf(zArr[0]), new i48(b61Var, el7VarArr, ylbVar, (byte) 13));
                    return;
                }
                return;
        }
    }
}
