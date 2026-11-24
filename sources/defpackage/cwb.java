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
public final class cwb implements e39, ed, d39, f39, xcb, OnSuccessListener, xvc {
    public final byte a;
    public final Object b;
    public final Object c;

    public cwb(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final boolean d(int i, View view) {
        kxb kxbVar;
        or1 or1Var = (or1) this.c;
        TLRPC.TL_forumTopic tL_forumTopic = ((hwb) ((lwb) this.b).s.c.get(i)).a;
        if (tL_forumTopic != null && (kxbVar = or1Var.a.g2) != null && kxbVar.l(tL_forumTopic, view, true)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean mo8e(float f, float f2, int i, View view) {
        o8c o8cVar = (o8c) this.c;
        c4c G = ((q5c) this.b).g3.G(i);
        if (G == null) {
            return false;
        }
        return o8cVar.d(G, view, Integer.valueOf(i), Float.valueOf(f), Float.valueOf(f2)).booleanValue();
    }

    @Override
    public final Object m() {
        byte b = this.a;
        Object obj = this.c;
        z90 z90Var = (z90) this.b;
        switch (b) {
            case 4:
                Iterable iterable = (Iterable) obj;
                lo9 lo9Var = (lo9) z90Var.c;
                lo9Var.getClass();
                if (iterable.iterator().hasNext()) {
                    lo9Var.a().compileStatement("DELETE FROM events WHERE _id in ".concat(lo9.g(iterable))).execute();
                }
                return null;
            default:
                for (Map.Entry entry : ((HashMap) obj).entrySet()) {
                    ((lo9) z90Var.i).e(((Integer) entry.getValue()).intValue(), xb6.INVALID_PAYLOD, (String) entry.getKey());
                }
                return null;
        }
    }

    @Override
    public final void onSuccess(Object obj) {
        Integer num = (Integer) obj;
        fa4.b("wear-auth: /token delivered to " + ((String) ((gl2) this.b).e));
        ((u41) this.c).setLoading(false);
        xrc.d = null;
        fx0 fx0Var = xrc.c;
        if (fx0Var != null) {
            fx0Var.dismiss();
            xrc.c = null;
        }
    }

    @Override
    public final boolean q(View view) {
        return false;
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
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 1:
                ((p3c) obj2).x0((byte[]) obj);
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            default:
                d01.q((Activity) obj2, Uri.parse((String) obj), true, false);
                return;
            case 6:
                hgc hgcVar = (hgc) obj2;
                ((boolean[]) obj)[0] = true;
                hgcVar.p0 = 17;
                Intent intent = new Intent(hgcVar.b, VoIPService.class);
                intent.putExtra("user_id", hgcVar.d.id);
                intent.putExtra("is_outgoing", true);
                intent.putExtra("start_incall_activity", false);
                intent.putExtra("video_call", false);
                intent.putExtra("can_video_call", false);
                intent.putExtra("account", hgcVar.a);
                try {
                    hgcVar.b.startService(intent);
                    return;
                } catch (Throwable th) {
                    fa4.g(th, true);
                    return;
                }
            case 7:
                Activity activity = (Activity) obj2;
                Intent intent2 = new Intent(activity, LaunchActivity.class);
                intent2.setAction("android.intent.action.SEND");
                intent2.putExtra("android.intent.extra.STREAM", Uri.fromFile((File) obj));
                activity.startActivity(intent2);
                return;
            case 8:
                hdVar.dismiss();
                noc nocVar = new noc();
                nocVar.r = !((Boolean) obj).booleanValue();
                ((toc) obj2).presentFragment(nocVar);
                return;
            case 9:
                ((mhc) obj2).run();
                ((fx0) obj).dismiss();
                return;
            case 10:
                c cVar = (c) obj;
                c01 g = hdVar.g(i, true, true);
                g.d();
                qoc qocVar = new qoc((toc) obj2, g, (byte) 1);
                c.O("disableBackupWithoutUpdatingPhrase");
                cVar.x0(new s91((Object) cVar, (Object) new pz1(cVar, qocVar, (byte) 28), true, false, (byte) 3));
                return;
        }
    }

    @Override
    public final void f() {
    }

    @Override
    public final void g(float f) {
    }

    @Override
    public final void e(float f, float f2, int i, View view) {
        n8c n8cVar = (n8c) this.c;
        c4c G = ((q5c) this.b).g3.G(i);
        if (G == null) {
            return;
        }
        n8cVar.j(G, view, Integer.valueOf(i), Float.valueOf(f), Float.valueOf(f2));
    }

    @Override
    public final void l(View view, float f, float f2) {
    }
}
