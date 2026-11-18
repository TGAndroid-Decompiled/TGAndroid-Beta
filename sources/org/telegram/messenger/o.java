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
import org.telegram.ui.xg0;
public final class o implements org.telegram.ui.ActionBar.r1, RequestTimeDelegate, xo, xg0, QuickAckDelegate {
    public final int f26010a;
    public final Object f26011b;
    public final Object f26012c;

    public o(int i7, Object obj, Object obj2) {
        this.f26010a = i7;
        this.f26011b = obj;
        this.f26012c = obj2;
    }

    @Override
    public void a(Canvas canvas) {
        dv dvVar = ((wu) this.f26011b).X;
        AtomicReference atomicReference = dvVar.E;
        StaticLayout staticLayout = dvVar.f23577b;
        ArrayList arrayList = dvVar.f23585x;
        xh.f.g((View) this.f26012c, false, -1, 0, atomicReference, 0, staticLayout, arrayList, canvas, false);
        org.telegram.ui.Components.x5.drawAnimatedEmojis(canvas, dvVar.f23577b, dvVar.F, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f);
    }

    @Override
    public boolean e(TLRPC.TL_error tL_error) {
        q0.a aVar = (q0.a) this.f26011b;
        TLRPC.User user = (TLRPC.User) this.f26012c;
        if (aVar != null) {
            aVar.accept(user);
        }
        if (tL_error != null && "USER_PRIVACY_RESTRICTED".equals(tL_error.text)) {
            return false;
        }
        return true;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f26010a) {
            case 0:
                String str = (String) this.f26011b;
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) this.f26012c;
                try {
                    h2Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str)), 500);
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                ((SharedPreferences) this.f26011b).edit().putBoolean("proxycheckstatusip", true).apply();
                ((yf) this.f26012c).run();
                return;
        }
    }

    @Override
    public void run(long j3) {
        g0.g3(new d4((boolean[]) this.f26011b, j3, (org.telegram.ui.Components.nc[]) this.f26012c, 10));
    }

    @Override
    public void run() {
        TLRPC.Message message = (TLRPC.Message) this.f26012c;
        g0.g3(new pw((zy) this.f26011b, message, message.f28424id, 1));
    }
}
