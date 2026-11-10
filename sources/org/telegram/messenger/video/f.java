package org.telegram.messenger.video;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import java.nio.charset.StandardCharsets;
import java.util.Calendar;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.messenger.qp;
import org.telegram.messenger.t3;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.hb0;
import org.telegram.ui.Components.u4;
import org.telegram.ui.Wallet.d5;
import org.telegram.ui.Wallet.y2;
import org.telegram.ui.a3;
import org.telegram.ui.f40;
import org.telegram.ui.p20;
import org.telegram.ui.q20;
import org.telegram.ui.s20;
import org.telegram.ui.u10;
import org.telegram.ui.z9;
public final class f implements View.OnClickListener {
    public final int f26015a;
    public final Object f26016b;
    public final Object f26017c;
    public final Object d;
    public final Object f26018e;
    public final Object f26019f;
    public final Object h;
    public final Object f26020n;

    public f(fi.d dVar, d5 d5Var, x10 x10Var, String[] strArr, boolean[] zArr, y2[] y2VarArr, h6 h6Var) {
        this.f26015a = 2;
        this.f26016b = dVar;
        this.f26017c = d5Var;
        this.d = x10Var;
        this.f26018e = strArr;
        this.h = zArr;
        this.f26020n = y2VarArr;
        this.f26019f = h6Var;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f26015a;
        Object obj = this.f26019f;
        Object obj2 = this.f26020n;
        Object obj3 = this.h;
        Object obj4 = this.f26018e;
        Object obj5 = this.d;
        Object obj6 = this.f26017c;
        Object obj7 = this.f26016b;
        switch (i7) {
            case 0:
                ((VideoAds) obj7).lambda$show$17((bc) obj6, (TLRPC.TL_sponsoredMessage) obj5, (Context) obj4, (h6) obj, (VideoAds.AdLayout) obj3, (e) obj2, view);
                return;
            case 1:
                f40 f40Var = (f40) obj7;
                hb0 hb0Var = (hb0) obj6;
                p20 p20Var = (p20) obj5;
                q20 q20Var = (q20) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                org.telegram.messenger.c cVar = (org.telegram.messenger.c) obj3;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
                u10 u10Var = f40Var.Y2;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                f40Var.R2 = ofFloat;
                ofFloat.setDuration(600L);
                f40Var.R2.addUpdateListener(new a3(f40Var, 12));
                f40Var.R2.addListener(new s20(f40Var));
                f40Var.R2.start();
                if (t3.W(f40Var.T2)) {
                    u10Var.b(id.M0(2131743447, null), true);
                } else {
                    u10Var.b(id.M0(2131743306, null), true);
                }
                Calendar calendar = Calendar.getInstance();
                boolean g10 = u4.g(null, null, 0L, 604800L, 3, hb0Var, p20Var, q20Var);
                calendar.setTimeInMillis((hb0Var.getValue() * 86400000) + System.currentTimeMillis());
                calendar.set(11, p20Var.getValue());
                calendar.set(12, q20Var.getValue());
                if (g10) {
                    calendar.set(13, 0);
                }
                f40Var.f45521e4 = (int) (calendar.getTimeInMillis() / 1000);
                f40Var.R1(false);
                TL_phone.createGroupCall creategroupcall = new TL_phone.createGroupCall();
                creategroupcall.peer = qp.l1(chat);
                creategroupcall.random_id = Utilities.f21339b.nextInt();
                creategroupcall.schedule_date = f40Var.f45521e4;
                creategroupcall.flags |= 2;
                ConnectionsManager.getInstance(cVar.f21770a).sendRequest(creategroupcall, new z9(f40Var, chat, inputPeer, 11), 2);
                return;
            default:
                fi.d dVar = (fi.d) obj7;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj6;
                x10 x10Var = (x10) obj5;
                String[] strArr = (String[]) obj4;
                boolean[] zArr = (boolean[]) obj3;
                y2[] y2VarArr = (y2[]) obj2;
                h6 h6Var = (h6) obj;
                if (!dVar.Q) {
                    if (editTextBoldCursor != null && editTextBoldCursor.getText().toString().getBytes(StandardCharsets.UTF_8).length > 960) {
                        g0.H3(editTextBoldCursor);
                        return;
                    }
                    dVar.setLoading(true);
                    x10Var.a(strArr[0], Boolean.valueOf(zArr[0]), new org.telegram.ui.Wallet.m(dVar, y2VarArr, h6Var, 5));
                    return;
                }
                return;
        }
    }

    public f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i7) {
        this.f26015a = i7;
        this.f26016b = obj;
        this.f26017c = obj2;
        this.d = obj3;
        this.f26018e = obj4;
        this.f26019f = obj5;
        this.h = obj6;
        this.f26020n = obj7;
    }
}
