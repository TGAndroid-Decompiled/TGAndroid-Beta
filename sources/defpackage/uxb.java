package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.google.android.gms.tasks.OnSuccessListener;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.c;
import org.telegram.utils.twidget.w;
public final class uxb implements rt8, h59, ee, g59, i59, yeb, OnSuccessListener, yxc {
    public final byte a;
    public final Object b;
    public final Object c;

    public uxb(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final boolean mo14d(float f, float f2, int i, View view) {
        pac pacVar = (pac) this.c;
        c6c G = ((q7c) this.b).g3.G(i);
        if (G == null) {
            return false;
        }
        return ((Boolean) pacVar.b(G, view, Integer.valueOf(i), Float.valueOf(f), Float.valueOf(f2))).booleanValue();
    }

    @Override
    public final Object e() {
        byte b = this.a;
        Object obj = this.c;
        za0 za0Var = (za0) this.b;
        switch (b) {
            case 5:
                Iterable iterable = (Iterable) obj;
                mq9 mq9Var = (mq9) za0Var.c;
                mq9Var.getClass();
                if (iterable.iterator().hasNext()) {
                    mq9Var.a().compileStatement("DELETE FROM events WHERE _id in ".concat(mq9.g(iterable))).execute();
                }
                return null;
            default:
                for (Map.Entry entry : ((HashMap) obj).entrySet()) {
                    ((mq9) za0Var.i).e(((Integer) entry.getValue()).intValue(), wd6.INVALID_PAYLOD, (String) entry.getKey());
                }
                return null;
        }
    }

    @Override
    public final void f(zo7 zo7Var) {
        zxb zxbVar = ((wxb) this.b).a;
        zxbVar.e.add(Integer.valueOf(((TLRPC.TL_forumTopic) this.c).id));
        zxbVar.a0();
    }

    @Override
    public final boolean g(int i, View view) {
        mzb mzbVar;
        bt1 bt1Var = (bt1) this.c;
        TLRPC.TL_forumTopic tL_forumTopic = ((kyb) ((oyb) this.b).s.c.get(i)).a;
        if (tL_forumTopic != null && (mzbVar = bt1Var.a.g2) != null && mzbVar.l(tL_forumTopic, view, true)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onSuccess(Object obj) {
        Integer num = (Integer) obj;
        fc4.b("wear-auth: /token delivered to " + ((String) ((sm2) this.b).e));
        ((b61) this.c).setLoading(false);
        auc.d = null;
        my0 my0Var = auc.c;
        if (my0Var != null) {
            my0Var.dismiss();
            auc.c = null;
        }
    }

    @Override
    public final void r(he heVar, int i) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 2:
                ((p5c) obj2).y0((byte[]) obj);
                return;
            case 3:
            case 4:
            case 5:
            case 6:
            default:
                l11.r((Activity) obj2, Uri.parse((String) obj), true, false);
                return;
            case 7:
                iic iicVar = (iic) obj2;
                ((boolean[]) obj)[0] = true;
                iicVar.p0 = 17;
                Intent intent = new Intent(iicVar.b, VoIPService.class);
                intent.putExtra("user_id", iicVar.d.id);
                intent.putExtra("is_outgoing", true);
                intent.putExtra("start_incall_activity", false);
                intent.putExtra("video_call", false);
                intent.putExtra("can_video_call", false);
                intent.putExtra("account", iicVar.a);
                try {
                    iicVar.b.startService(intent);
                    return;
                } catch (Throwable th) {
                    fc4.g(th, true);
                    return;
                }
            case 8:
                Activity activity = (Activity) obj2;
                Intent intent2 = new Intent(activity, LaunchActivity.class);
                intent2.setAction("android.intent.action.SEND");
                intent2.putExtra("android.intent.extra.STREAM", Uri.fromFile((File) obj));
                activity.startActivity(intent2);
                return;
            case 9:
                heVar.dismiss();
                pqc pqcVar = new pqc();
                pqcVar.r = !((Boolean) obj).booleanValue();
                ((vqc) obj2).presentFragment(pqcVar);
                return;
            case 10:
                ((qhc) obj2).run();
                ((my0) obj).dismiss();
                return;
            case 11:
                c cVar = (c) obj;
                k11 g = heVar.g(i, true, true);
                g.d();
                sqc sqcVar = new sqc((vqc) obj2, g, (byte) 1);
                c.O("disableBackupWithoutUpdatingPhrase");
                cVar.x0(new bb1((Object) cVar, (Object) new qy1(cVar, sqcVar, (byte) 29), true, false, (byte) 3));
                return;
        }
    }

    @Override
    public final Object run() {
        w wVar = (w) this.b;
        byte[] bArr = (byte[]) this.c;
        synchronized (wVar) {
            if (bArr != null) {
                if (wVar.d.size() + bArr.length <= 16777216) {
                    wVar.d.write(bArr, 0, bArr.length);
                }
            }
            wVar.d.reset();
            throw new IllegalStateException("Widget engine: argument too large");
        }
        return null;
    }

    @Override
    public final boolean u(View view) {
        return false;
    }

    @Override
    public final void i() {
    }

    @Override
    public final void k(float f) {
    }

    @Override
    public final void v() {
    }

    @Override
    public final void d(float f, float f2, int i, View view) {
        oac oacVar = (oac) this.c;
        c6c G = ((q7c) this.b).g3.G(i);
        if (G == null) {
            return;
        }
        oacVar.k(G, view, Integer.valueOf(i), Float.valueOf(f), Float.valueOf(f2));
    }

    @Override
    public final void p(View view, float f, float f2) {
    }
}
