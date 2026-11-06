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
import org.telegram.ui.sg0;
public final class o implements org.telegram.ui.ActionBar.r1, RequestTimeDelegate, bp, sg0, QuickAckDelegate {
    public final int f24244a;
    public final Object f24245b;
    public final Object f24246c;

    public o(int i7, Object obj, Object obj2) {
        this.f24244a = i7;
        this.f24245b = obj;
        this.f24246c = obj2;
    }

    @Override
    public boolean a(TLRPC.TL_error tL_error) {
        q0.a aVar = (q0.a) this.f24245b;
        TLRPC.User user = (TLRPC.User) this.f24246c;
        if (aVar != null) {
            aVar.accept(user);
        }
        if (tL_error != null && "USER_PRIVACY_RESTRICTED".equals(tL_error.text)) {
            return false;
        }
        return true;
    }

    @Override
    public void d(Canvas canvas) {
        jv jvVar = ((cv) this.f24245b).W;
        AtomicReference atomicReference = jvVar.D;
        StaticLayout staticLayout = jvVar.f23586b;
        ArrayList arrayList = jvVar.f23594x;
        xh.f.g((View) this.f24246c, false, -1, 0, atomicReference, 0, staticLayout, arrayList, canvas, false);
        org.telegram.ui.Components.r5.drawAnimatedEmojis(canvas, jvVar.f23586b, jvVar.E, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f24244a) {
            case 0:
                String str = (String) this.f24245b;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.f24246c;
                try {
                    f2Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str)), 500);
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                ((SharedPreferences) this.f24245b).edit().putBoolean("proxycheckstatusip", true).apply();
                ((ng) this.f24246c).run();
                return;
        }
    }

    @Override
    public void run(long j3) {
        g0.h3(new a4((boolean[]) this.f24245b, j3, (org.telegram.ui.Components.jc[]) this.f24246c, 10));
    }

    @Override
    public void run() {
        TLRPC.Message message = (TLRPC.Message) this.f24246c;
        g0.h3(new xw((gz) this.f24245b, message, message.f26973id, 1));
    }
}
