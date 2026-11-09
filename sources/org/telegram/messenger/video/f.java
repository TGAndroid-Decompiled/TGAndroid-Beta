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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ib0;
import org.telegram.ui.Components.v4;
import org.telegram.ui.Wallet.a5;
import org.telegram.ui.Wallet.y2;
import org.telegram.ui.a3;
import org.telegram.ui.e40;
import org.telegram.ui.o20;
import org.telegram.ui.p20;
import org.telegram.ui.r20;
import org.telegram.ui.t10;
import org.telegram.ui.z9;
public final class f implements View.OnClickListener {
    public final int f26011a;
    public final Object f26012b;
    public final Object f26013c;
    public final Object d;
    public final Object f26014e;
    public final Object f26015f;
    public final Object h;
    public final Object f26016n;

    public f(fi.d dVar, a5 a5Var, x10 x10Var, String[] strArr, boolean[] zArr, y2[] y2VarArr, g6 g6Var) {
        this.f26011a = 2;
        this.f26012b = dVar;
        this.f26013c = a5Var;
        this.d = x10Var;
        this.f26014e = strArr;
        this.h = zArr;
        this.f26016n = y2VarArr;
        this.f26015f = g6Var;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f26011a;
        Object obj = this.f26015f;
        Object obj2 = this.f26016n;
        Object obj3 = this.h;
        Object obj4 = this.f26014e;
        Object obj5 = this.d;
        Object obj6 = this.f26013c;
        Object obj7 = this.f26012b;
        switch (i7) {
            case 0:
                ((VideoAds) obj7).lambda$show$17((cc) obj6, (TLRPC.TL_sponsoredMessage) obj5, (Context) obj4, (g6) obj, (VideoAds.AdLayout) obj3, (e) obj2, view);
                return;
            case 1:
                e40 e40Var = (e40) obj7;
                ib0 ib0Var = (ib0) obj6;
                o20 o20Var = (o20) obj5;
                p20 p20Var = (p20) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                org.telegram.messenger.c cVar = (org.telegram.messenger.c) obj3;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
                t10 t10Var = e40Var.V2;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                e40Var.O2 = ofFloat;
                ofFloat.setDuration(600L);
                e40Var.O2.addUpdateListener(new a3(e40Var, 12));
                e40Var.O2.addListener(new r20(e40Var));
                e40Var.O2.start();
                if (t3.W(e40Var.Q2)) {
                    t10Var.b(id.M0(2131743447, null), true);
                } else {
                    t10Var.b(id.M0(2131743306, null), true);
                }
                Calendar calendar = Calendar.getInstance();
                boolean g10 = v4.g(null, null, 0L, 604800L, 3, ib0Var, o20Var, p20Var);
                calendar.setTimeInMillis((ib0Var.getValue() * 86400000) + System.currentTimeMillis());
                calendar.set(11, o20Var.getValue());
                calendar.set(12, p20Var.getValue());
                if (g10) {
                    calendar.set(13, 0);
                }
                e40Var.f45194b4 = (int) (calendar.getTimeInMillis() / 1000);
                e40Var.R1(false);
                TL_phone.createGroupCall creategroupcall = new TL_phone.createGroupCall();
                creategroupcall.peer = qp.l1(chat);
                creategroupcall.random_id = Utilities.f21334b.nextInt();
                creategroupcall.schedule_date = e40Var.f45194b4;
                creategroupcall.flags |= 2;
                ConnectionsManager.getInstance(cVar.f21765a).sendRequest(creategroupcall, new z9(e40Var, chat, inputPeer, 11), 2);
                return;
            default:
                fi.d dVar = (fi.d) obj7;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj6;
                x10 x10Var = (x10) obj5;
                String[] strArr = (String[]) obj4;
                boolean[] zArr = (boolean[]) obj3;
                y2[] y2VarArr = (y2[]) obj2;
                g6 g6Var = (g6) obj;
                if (!dVar.Q) {
                    if (editTextBoldCursor != null && editTextBoldCursor.getText().toString().getBytes(StandardCharsets.UTF_8).length > 960) {
                        g0.H3(editTextBoldCursor);
                        return;
                    }
                    dVar.setLoading(true);
                    x10Var.a(strArr[0], Boolean.valueOf(zArr[0]), new org.telegram.ui.Wallet.m(dVar, y2VarArr, g6Var, 5));
                    return;
                }
                return;
        }
    }

    public f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i7) {
        this.f26011a = i7;
        this.f26012b = obj;
        this.f26013c = obj2;
        this.d = obj3;
        this.f26014e = obj4;
        this.f26015f = obj5;
        this.h = obj6;
        this.f26016n = obj7;
    }
}
