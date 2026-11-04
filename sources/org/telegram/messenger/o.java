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
import org.telegram.ui.mg0;
public final class o implements org.telegram.ui.ActionBar.p1, RequestTimeDelegate, so, mg0, QuickAckDelegate {
    public final int f24465a;
    public final Object f24466b;
    public final Object f24467c;

    public o(int i3, Object obj, Object obj2) {
        this.f24465a = i3;
        this.f24466b = obj;
        this.f24467c = obj2;
    }

    @Override
    public boolean a(TLRPC.TL_error tL_error) {
        q0.a aVar = (q0.a) this.f24466b;
        TLRPC.User user = (TLRPC.User) this.f24467c;
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
        bv bvVar = ((uu) this.f24466b).X;
        AtomicReference atomicReference = bvVar.E;
        StaticLayout staticLayout = bvVar.f21888b;
        ArrayList arrayList = bvVar.f21896x;
        yh.f.g((View) this.f24467c, false, -1, 0, atomicReference, 0, staticLayout, arrayList, canvas, false);
        org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, bvVar.f21888b, bvVar.F, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.f24465a) {
            case 0:
                String str = (String) this.f24466b;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.f24467c;
                try {
                    d2Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str)), 500);
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                ((SharedPreferences) this.f24466b).edit().putBoolean("proxycheckstatusip", true).apply();
                ((fg) this.f24467c).run();
                return;
        }
    }

    @Override
    public void run(long j10) {
        g0.h3(new a4((boolean[]) this.f24466b, j10, (org.telegram.ui.Components.hc[]) this.f24467c, 10));
    }

    @Override
    public void run() {
        TLRPC.Message message = (TLRPC.Message) this.f24467c;
        g0.h3(new pw((yy) this.f24466b, message, message.f27022id, 1));
    }
}
