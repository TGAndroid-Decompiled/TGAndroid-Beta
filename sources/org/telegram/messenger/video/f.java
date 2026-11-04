package org.telegram.messenger.video;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import java.nio.charset.StandardCharsets;
import java.util.Calendar;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.messenger.hp;
import org.telegram.messenger.p10;
import org.telegram.messenger.t3;
import org.telegram.messenger.video.VideoAds;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Wallet.a5;
import org.telegram.ui.Wallet.y2;
import org.telegram.ui.b3;
import org.telegram.ui.h20;
import org.telegram.ui.i20;
import org.telegram.ui.k20;
import org.telegram.ui.m10;
import org.telegram.ui.x30;
import org.telegram.ui.y9;
public final class f implements View.OnClickListener {
    public final int f25908a;
    public final Object f25909b;
    public final Object f25910c;
    public final Object d;
    public final Object f25911e;
    public final Object f25912f;
    public final Object h;
    public final Object f25913n;

    public f(gi.d dVar, a5 a5Var, p10 p10Var, String[] strArr, boolean[] zArr, y2[] y2VarArr, e6 e6Var) {
        this.f25908a = 2;
        this.f25909b = dVar;
        this.f25910c = a5Var;
        this.d = p10Var;
        this.f25911e = strArr;
        this.h = zArr;
        this.f25913n = y2VarArr;
        this.f25912f = e6Var;
    }

    @Override
    public final void onClick(View view) {
        int i3 = this.f25908a;
        Object obj = this.f25912f;
        Object obj2 = this.f25913n;
        Object obj3 = this.h;
        Object obj4 = this.f25911e;
        Object obj5 = this.d;
        Object obj6 = this.f25910c;
        Object obj7 = this.f25909b;
        switch (i3) {
            case 0:
                ((VideoAds) obj7).lambda$show$17((ac) obj6, (TLRPC.TL_sponsoredMessage) obj5, (Context) obj4, (e6) obj, (VideoAds.AdLayout) obj3, (e) obj2, view);
                return;
            case 1:
                x30 x30Var = (x30) obj7;
                cb0 cb0Var = (cb0) obj6;
                h20 h20Var = (h20) obj5;
                i20 i20Var = (i20) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                org.telegram.messenger.c cVar = (org.telegram.messenger.c) obj3;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
                m10 m10Var = x30Var.W2;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                x30Var.P2 = ofFloat;
                ofFloat.setDuration(600L);
                x30Var.P2.addUpdateListener(new b3(x30Var, 12));
                x30Var.P2.addListener(new k20(x30Var));
                x30Var.P2.start();
                if (t3.W(x30Var.R2)) {
                    m10Var.b(bd.M0(2131743457, null), true);
                } else {
                    m10Var.b(bd.M0(2131743316, null), true);
                }
                Calendar calendar = Calendar.getInstance();
                boolean g7 = t4.g(null, null, 0L, 604800L, 3, cb0Var, h20Var, i20Var);
                calendar.setTimeInMillis((cb0Var.getValue() * 86400000) + System.currentTimeMillis());
                calendar.set(11, h20Var.getValue());
                calendar.set(12, i20Var.getValue());
                if (g7) {
                    calendar.set(13, 0);
                }
                x30Var.f51725c4 = (int) (calendar.getTimeInMillis() / 1000);
                x30Var.O1(false);
                TL_phone.createGroupCall creategroupcall = new TL_phone.createGroupCall();
                creategroupcall.peer = hp.l1(chat);
                creategroupcall.random_id = Utilities.f21385b.nextInt();
                creategroupcall.schedule_date = x30Var.f51725c4;
                creategroupcall.flags |= 2;
                ConnectionsManager.getInstance(cVar.f21919a).sendRequest(creategroupcall, new y9(x30Var, chat, inputPeer, 11), 2);
                return;
            default:
                gi.d dVar = (gi.d) obj7;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj6;
                p10 p10Var = (p10) obj5;
                String[] strArr = (String[]) obj4;
                boolean[] zArr = (boolean[]) obj3;
                y2[] y2VarArr = (y2[]) obj2;
                e6 e6Var = (e6) obj;
                if (!dVar.R) {
                    if (editTextBoldCursor != null && editTextBoldCursor.getText().toString().getBytes(StandardCharsets.UTF_8).length > 960) {
                        g0.H3(editTextBoldCursor);
                        return;
                    }
                    dVar.setLoading(true);
                    p10Var.a(strArr[0], Boolean.valueOf(zArr[0]), new org.telegram.ui.Wallet.m(dVar, y2VarArr, e6Var, 5));
                    return;
                }
                return;
        }
    }

    public f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i3) {
        this.f25908a = i3;
        this.f25909b = obj;
        this.f25910c = obj2;
        this.d = obj3;
        this.f25911e = obj4;
        this.f25912f = obj5;
        this.h = obj6;
        this.f25913n = obj7;
    }
}
