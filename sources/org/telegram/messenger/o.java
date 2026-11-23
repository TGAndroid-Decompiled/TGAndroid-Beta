package org.telegram.messenger;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.net.Uri;
import android.text.StaticLayout;
import android.view.View;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.tgnet.QuickAckDelegate;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.vg0;
public final class o implements org.telegram.ui.ActionBar.q1, RequestTimeDelegate, xo, vg0, QuickAckDelegate {
    public final int f26107a;
    public final Object f26108b;
    public final Object f26109c;

    public o(int i7, Object obj, Object obj2) {
        this.f26107a = i7;
        this.f26108b = obj;
        this.f26109c = obj2;
    }

    @Override
    public void a(Canvas canvas) {
        dv dvVar = ((wu) this.f26108b).X;
        AtomicReference atomicReference = dvVar.E;
        StaticLayout staticLayout = dvVar.f23706b;
        ArrayList arrayList = dvVar.f23714x;
        xh.f.g((View) this.f26109c, false, -1, 0, atomicReference, 0, staticLayout, arrayList, canvas, false);
        org.telegram.ui.Components.x5.drawAnimatedEmojis(canvas, dvVar.f23706b, dvVar.F, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f);
    }

    @Override
    public boolean d(TLRPC.TL_error tL_error) {
        q0.a aVar = (q0.a) this.f26108b;
        TLRPC.User user = (TLRPC.User) this.f26109c;
        if (aVar != null) {
            aVar.accept(user);
        }
        if (tL_error != null && "USER_PRIVACY_RESTRICTED".equals(tL_error.text)) {
            return false;
        }
        return true;
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f26107a) {
            case 0:
                String str = (String) this.f26108b;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.f26109c;
                try {
                    g2Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str)), 500);
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                ((SharedPreferences) this.f26108b).edit().putBoolean("proxycheckstatusip", true).apply();
                ((yf) this.f26109c).run();
                return;
        }
    }

    @Override
    public void run(long j3) {
        g0.g3(new d4((boolean[]) this.f26108b, j3, (org.telegram.ui.Components.mc[]) this.f26109c, 10));
    }

    @Override
    public void run() {
        TLRPC.Message message = (TLRPC.Message) this.f26109c;
        g0.g3(new pw((zy) this.f26108b, message, message.f28513id, 1));
    }
}
