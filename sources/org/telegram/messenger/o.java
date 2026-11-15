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
public final class o implements org.telegram.ui.ActionBar.q1, RequestTimeDelegate, yo, sg0, QuickAckDelegate {
    public final int f25685a;
    public final Object f25686b;
    public final Object f25687c;

    public o(int i7, Object obj, Object obj2) {
        this.f25685a = i7;
        this.f25686b = obj;
        this.f25687c = obj2;
    }

    @Override
    public void a(Canvas canvas) {
        hv hvVar = ((av) this.f25686b).X;
        AtomicReference atomicReference = hvVar.E;
        StaticLayout staticLayout = hvVar.f24222b;
        ArrayList arrayList = hvVar.f24230x;
        xh.f.g((View) this.f25687c, false, -1, 0, atomicReference, 0, staticLayout, arrayList, canvas, false);
        org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, hvVar.f24222b, hvVar.F, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f);
    }

    @Override
    public boolean d(TLRPC.TL_error tL_error) {
        q0.a aVar = (q0.a) this.f25686b;
        TLRPC.User user = (TLRPC.User) this.f25687c;
        if (aVar != null) {
            aVar.accept(user);
        }
        if (tL_error != null && "USER_PRIVACY_RESTRICTED".equals(tL_error.text)) {
            return false;
        }
        return true;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f25685a) {
            case 0:
                String str = (String) this.f25686b;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.f25687c;
                try {
                    e2Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str)), 500);
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                ((SharedPreferences) this.f25686b).edit().putBoolean("proxycheckstatusip", true).apply();
                ((mg) this.f25687c).run();
                return;
        }
    }

    @Override
    public void run(long j3) {
        g0.h3(new a4((boolean[]) this.f25686b, j3, (org.telegram.ui.Components.ec[]) this.f25687c, 10));
    }

    @Override
    public void run() {
        TLRPC.Message message = (TLRPC.Message) this.f25687c;
        g0.h3(new uw((ez) this.f25686b, message, message.f28072id, 1));
    }
}
