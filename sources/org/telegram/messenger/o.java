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
import org.telegram.ui.wg0;
public final class o implements org.telegram.ui.ActionBar.r1, RequestTimeDelegate, xo, wg0, QuickAckDelegate {
    public final int f26012a;
    public final Object f26013b;
    public final Object f26014c;

    public o(int i7, Object obj, Object obj2) {
        this.f26012a = i7;
        this.f26013b = obj;
        this.f26014c = obj2;
    }

    @Override
    public void a(Canvas canvas) {
        dv dvVar = ((wu) this.f26013b).X;
        AtomicReference atomicReference = dvVar.E;
        StaticLayout staticLayout = dvVar.f23580b;
        ArrayList arrayList = dvVar.f23588x;
        xh.f.g((View) this.f26014c, false, -1, 0, atomicReference, 0, staticLayout, arrayList, canvas, false);
        org.telegram.ui.Components.x5.drawAnimatedEmojis(canvas, dvVar.f23580b, dvVar.F, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f);
    }

    @Override
    public boolean e(TLRPC.TL_error tL_error) {
        q0.a aVar = (q0.a) this.f26013b;
        TLRPC.User user = (TLRPC.User) this.f26014c;
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
        switch (this.f26012a) {
            case 0:
                String str = (String) this.f26013b;
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) this.f26014c;
                try {
                    h2Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str)), 500);
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                ((SharedPreferences) this.f26013b).edit().putBoolean("proxycheckstatusip", true).apply();
                ((yf) this.f26014c).run();
                return;
        }
    }

    @Override
    public void run(long j3) {
        g0.g3(new d4((boolean[]) this.f26013b, j3, (org.telegram.ui.Components.nc[]) this.f26014c, 10));
    }

    @Override
    public void run() {
        TLRPC.Message message = (TLRPC.Message) this.f26014c;
        g0.g3(new pw((zy) this.f26013b, message, message.f28426id, 1));
    }
}
