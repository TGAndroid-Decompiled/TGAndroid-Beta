package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.text.SpannableString;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n92 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;

    public n92(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        g06 g06Var = (g06) this.b;
        mt8 mt8Var = (mt8) this.c;
        synchronized (g06Var) {
            if (g06Var.b == null) {
                g06Var.a.add(mt8Var);
            } else {
                g06Var.b.add(mt8Var.get());
            }
        }
    }

    @Override
    public final void run() {
        yc3 yc3Var;
        mqc mqcVar = null;
        switch (this.a) {
            case 0:
                ((x92) this.b).Y((hd[]) this.c);
                return;
            case 1:
                x92 x92Var = (x92) this.b;
                TLObject tLObject = (TLObject) this.c;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject;
                    x92Var.getMessagesController().U3(messages_chats.chats, false);
                    ArrayList<TLRPC.Chat> arrayList = messages_chats.chats;
                    x92Var.w = arrayList;
                    Iterator<TLRPC.Chat> it = arrayList.iterator();
                    while (it.hasNext()) {
                        TLRPC.Chat next = it.next();
                        if (hc2.c0(next) || hc2.p0(next)) {
                            it.remove();
                        }
                    }
                }
                x92Var.x = false;
                x92Var.y = true;
                x92Var.f0();
                return;
            case 2:
                ((t92) this.b).y.d.Q = false;
                ((hu5) this.c).run();
                return;
            case 3:
                ((t92) this.b).y.d.P = false;
                ((iu5) this.c).run();
                return;
            case 4:
                x92 x92Var2 = ((t92) this.b).y.d;
                x92Var2.P = false;
                x92Var2.Q = false;
                ((Runnable) this.c).run();
                return;
            case 5:
                t92 t92Var = (t92) this.b;
                ((TLRPC.Chat) this.c).join_request = true;
                t92Var.h = true;
                t92Var.c.setChecked(true);
                return;
            case 6:
                gb2 gb2Var = (gb2) this.b;
                k27 k27Var = (k27) this.c;
                if (gb2Var.Q5 == k27Var && gb2Var.B8 && gb2Var.eb != null) {
                    if (((bb8) gb8.b.get(Long.valueOf(k27Var.F0().id))) != null) {
                        gb2Var.G8 = gb2Var.F8;
                        gb2Var.E8 = true;
                        gb2Var.eb.C1(gb2Var, false);
                        return;
                    }
                    gb2Var.eb.M0(gb2Var, false);
                    return;
                }
                return;
            case 7:
                ((gb2) this.b).Q0.draw((Canvas) this.c);
                return;
            case 8:
                ((gb2) this.b).post(new sa2((gb2) this.c, (byte) 7));
                return;
            case 9:
                ((qb2) this.b).a.getMessagesController().M1().k.j((ArrayList) this.c);
                return;
            case 10:
                ((td2) this.b).b.L0((ArrayList) this.c);
                return;
            case 11:
                ((ud2) this.b).b.L0((ArrayList) this.c);
                return;
            case 12:
                it0 it0Var = (it0) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                if (bitmap != null) {
                    mqcVar = new mqc(bitmap, 0, null);
                }
                it0Var.a(mqcVar);
                return;
            case 13:
                ((ResultCallback) this.b).onError((TLRPC.TL_error) this.c);
                return;
            case 14:
                ((ud2) this.b).onError((TLRPC.TL_error) this.c);
                return;
            case 15:
                ie2 ie2Var = ((je2) this.b).f;
                ie2Var.b = System.currentTimeMillis();
                ie2Var.c = true;
                ((ud2) this.c).onComplete(null);
                return;
            case 16:
                ((kf2) this.b).getMessagesController().X2(0, ((TLRPC.Updates) this.c).chats.get(0).id, true);
                return;
            case 17:
                TLRPC.User user = (TLRPC.User) this.c;
                kf2 kf2Var = ((af2) this.b).a;
                if (u21.a(kf2Var)) {
                    u21.C(user.first_name, kf2Var).j();
                    return;
                }
                return;
            case 18:
                mf2 mf2Var = (mf2) this.b;
                p31.a(mf2Var.a).b();
                ((on7) this.c).run();
                mf2Var.dismiss();
                return;
            case 19:
                ((uf2) this.b).b0((TLObject) this.c);
                return;
            case 20:
                hi2 hi2Var = (hi2) this.b;
                View view = (View) this.c;
                gi2 gi2Var = (gi2) hi2Var.d;
                if ((hi2Var.a & 2) != 0) {
                    boolean K0 = gi2Var.K0(view, hi2Var.b, hi2Var.c);
                    int i = hi2Var.a;
                    if (K0) {
                        hi2Var.a = i & (-3);
                        hi2Var.e = null;
                        view.performHapticFeedback(0);
                        hi2Var.a = (hi2Var.a | 4) & (-11);
                        hi2Var.e = null;
                        return;
                    }
                    hi2Var.a = i | 8;
                    return;
                }
                return;
            case 21:
                ((go2) this.b).a((SpannableString) this.c);
                return;
            case 22:
                pn2 pn2Var = (pn2) this.b;
                pn2Var.getClass();
                pn2Var.presentFragment(mu1.U9(((kn2) this.c).b.id));
                return;
            case 23:
                ((eo2) this.b).t1.presentFragment(mu1.U9(((kn2) this.c).b.id));
                return;
            case 24:
                vq7 vq7Var = (vq7) this.b;
                mt8 mt8Var = (mt8) this.c;
                if (vq7Var.b == vq7.d) {
                    synchronized (vq7Var) {
                        yc3Var = vq7Var.a;
                        vq7Var.a = null;
                        vq7Var.b = mt8Var;
                    }
                    yc3Var.h(mt8Var);
                    return;
                }
                sc8.j("provide() can be called only once.");
                return;
            case 25:
                a();
                return;
            case 26:
                ((ConferenceCall) this.b).lambda$processUpdates$4((TLRPC.Updates) this.c);
                return;
            case 27:
                ((mv6) this.b).D((bs2) this.c);
                return;
            case 28:
                ((qu2) this.b).j(((Long) this.c).longValue());
                return;
            default:
                qu2 qu2Var = (qu2) this.b;
                for (Map.Entry entry : ((HashMap) this.c).entrySet()) {
                    TLRPC.User user2 = (TLRPC.User) entry.getKey();
                    TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) entry.getValue();
                    user2.contact = true;
                    qu2Var.f0.add(tL_contact);
                    qu2Var.g0.put(Long.valueOf(user2.id), tL_contact);
                }
                qu2Var.d(true);
                kk7 notificationCenter = qu2Var.getNotificationCenter();
                int i2 = na7.q5;
                notificationCenter.k(2, 1);
                qu2Var.getNotificationCenter().k(25, new Object[0]);
                return;
        }
    }
}
