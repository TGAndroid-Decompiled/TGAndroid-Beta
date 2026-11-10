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
public final class o implements org.telegram.ui.ActionBar.r1, RequestTimeDelegate, bp, vg0, QuickAckDelegate {
    public final int f24265a;
    public final Object f24266b;
    public final Object f24267c;

    public o(int i7, Object obj, Object obj2) {
        this.f24265a = i7;
        this.f24266b = obj;
        this.f24267c = obj2;
    }

    @Override
    public boolean a(TLRPC.TL_error tL_error) {
        q0.a aVar = (q0.a) this.f24266b;
        TLRPC.User user = (TLRPC.User) this.f24267c;
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
        jv jvVar = ((cv) this.f24266b).W;
        AtomicReference atomicReference = jvVar.D;
        StaticLayout staticLayout = jvVar.f23609b;
        ArrayList arrayList = jvVar.f23617x;
        xh.f.g((View) this.f24267c, false, -1, 0, atomicReference, 0, staticLayout, arrayList, canvas, false);
        org.telegram.ui.Components.q5.drawAnimatedEmojis(canvas, jvVar.f23609b, jvVar.E, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f24265a) {
            case 0:
                String str = (String) this.f24266b;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.f24267c;
                try {
                    f2Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str)), 500);
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                ((SharedPreferences) this.f24266b).edit().putBoolean("proxycheckstatusip", true).apply();
                ((ng) this.f24267c).run();
                return;
        }
    }

    @Override
    public void run(long j3) {
        g0.h3(new a4((boolean[]) this.f24266b, j3, (org.telegram.ui.Components.ic[]) this.f24267c, 10));
    }

    @Override
    public void run() {
        TLRPC.Message message = (TLRPC.Message) this.f24267c;
        g0.h3(new ww((gz) this.f24266b, message, message.f26981id, 1));
    }
}
