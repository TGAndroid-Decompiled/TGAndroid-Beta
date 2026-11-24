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
public final class y35 implements View.OnClickListener {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object h;
    public final Object n;

    public y35(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, byte b) {
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
                h75 h75Var = (h75) obj7;
                hn7 hn7Var = (hn7) obj6;
                t55 t55Var = (t55) obj5;
                u55 u55Var = (u55) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                j5 j5Var = (j5) obj2;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                h75Var.Q2 = ofFloat;
                ofFloat.setDuration(600L);
                h75Var.Q2.addUpdateListener(new ni4(h75Var, (byte) 3));
                h75Var.Q2.addListener(new w55(h75Var));
                h75Var.Q2.start();
                boolean W = hc2.W(h75Var.S2);
                v45 v45Var = h75Var.X2;
                if (W) {
                    v45Var.b(k96.M0(2131743205, null), true);
                } else {
                    v45Var.b(k96.M0(2131743064, null), true);
                }
                Calendar calendar = Calendar.getInstance();
                boolean g = ij.g(null, null, 0L, 604800L, 3, hn7Var, t55Var, u55Var);
                calendar.setTimeInMillis((hn7Var.getValue() * 86400000) + System.currentTimeMillis());
                calendar.set(11, t55Var.getValue());
                calendar.set(12, u55Var.getValue());
                if (g) {
                    calendar.set(13, 0);
                }
                h75Var.c4 = (int) (calendar.getTimeInMillis() / 1000);
                h75Var.J1(false);
                TL_phone.createGroupCall creategroupcall = new TL_phone.createGroupCall();
                creategroupcall.peer = na7.j1(chat);
                creategroupcall.random_id = Utilities.b.nextInt();
                creategroupcall.schedule_date = h75Var.c4;
                creategroupcall.flags |= 2;
                ConnectionsManager.getInstance(j5Var.a).sendRequest(creategroupcall, new en0(h75Var, chat, inputPeer, (byte) 28), 2);
                return;
            case 1:
                ((VideoAds) obj7).lambda$show$17((m21) obj6, (TLRPC.TL_sponsoredMessage) obj5, (Context) obj4, (wjb) obj3, (VideoAds.AdLayout) obj2, (eac) obj, view);
                return;
            default:
                u41 u41Var = (u41) obj7;
                mlc mlcVar = (mlc) obj6;
                k8c k8cVar = (k8c) obj5;
                String[] strArr = (String[]) obj4;
                boolean[] zArr = (boolean[]) obj3;
                cj7[] cj7VarArr = (cj7[]) obj2;
                wjb wjbVar = (wjb) obj;
                if (!u41Var.R) {
                    if (mlcVar != null && mlcVar.getText().toString().getBytes(StandardCharsets.UTF_8).length > 960) {
                        gl.C3(mlcVar);
                        return;
                    }
                    u41Var.setLoading(true);
                    k8cVar.a(strArr[0], Boolean.valueOf(zArr[0]), new f28(u41Var, cj7VarArr, wjbVar, (byte) 13));
                    return;
                }
                return;
        }
    }
}
