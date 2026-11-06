package org.telegram.messenger.video;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import java.nio.charset.StandardCharsets;
import java.util.Calendar;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.qp;
import org.telegram.messenger.t3;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.hb0;
import org.telegram.ui.Components.v4;
import org.telegram.ui.Wallet.a3;
import org.telegram.ui.Wallet.c5;
import org.telegram.ui.c40;
import org.telegram.ui.m20;
import org.telegram.ui.n20;
import org.telegram.ui.p20;
import org.telegram.ui.r10;
import org.telegram.ui.z9;
public final class f implements View.OnClickListener {
    public final int f26000a;
    public final Object f26001b;
    public final Object f26002c;
    public final Object d;
    public final Object f26003e;
    public final Object f26004f;
    public final Object h;
    public final Object f26005n;

    public f(fi.d dVar, c5 c5Var, x10 x10Var, String[] strArr, boolean[] zArr, a3[] a3VarArr, f6 f6Var) {
        this.f26000a = 2;
        this.f26001b = dVar;
        this.f26002c = c5Var;
        this.d = x10Var;
        this.f26003e = strArr;
        this.h = zArr;
        this.f26005n = a3VarArr;
        this.f26004f = f6Var;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f26000a;
        Object obj = this.f26004f;
        Object obj2 = this.f26005n;
        Object obj3 = this.h;
        Object obj4 = this.f26003e;
        Object obj5 = this.d;
        Object obj6 = this.f26002c;
        Object obj7 = this.f26001b;
        switch (i7) {
            case 0:
                ((VideoAds) obj7).lambda$show$17((cc) obj6, (TLRPC.TL_sponsoredMessage) obj5, (Context) obj4, (f6) obj, (VideoAds.AdLayout) obj3, (e) obj2, view);
                return;
            case 1:
                c40 c40Var = (c40) obj7;
                hb0 hb0Var = (hb0) obj6;
                m20 m20Var = (m20) obj5;
                n20 n20Var = (n20) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                org.telegram.messenger.c cVar = (org.telegram.messenger.c) obj3;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
                r10 r10Var = c40Var.V2;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                c40Var.O2 = ofFloat;
                ofFloat.setDuration(600L);
                c40Var.O2.addUpdateListener(new org.telegram.ui.a3(c40Var, 12));
                c40Var.O2.addListener(new p20(c40Var));
                c40Var.O2.start();
                if (t3.W(c40Var.Q2)) {
                    r10Var.b(hd.M0(2131743448, null), true);
                } else {
                    r10Var.b(hd.M0(2131743307, null), true);
                }
                Calendar calendar = Calendar.getInstance();
                boolean g10 = v4.g(null, null, 0L, 604800L, 3, hb0Var, m20Var, n20Var);
                calendar.setTimeInMillis((hb0Var.getValue() * 86400000) + System.currentTimeMillis());
                calendar.set(11, m20Var.getValue());
                calendar.set(12, n20Var.getValue());
                if (g10) {
                    calendar.set(13, 0);
                }
                c40Var.f44552b4 = (int) (calendar.getTimeInMillis() / 1000);
                c40Var.R1(false);
                TL_phone.createGroupCall creategroupcall = new TL_phone.createGroupCall();
                creategroupcall.peer = qp.l1(chat);
                creategroupcall.random_id = Utilities.f21331b.nextInt();
                creategroupcall.schedule_date = c40Var.f44552b4;
                creategroupcall.flags |= 2;
                ConnectionsManager.getInstance(cVar.f21723a).sendRequest(creategroupcall, new z9(c40Var, chat, inputPeer, 11), 2);
                return;
            default:
                fi.d dVar = (fi.d) obj7;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj6;
                x10 x10Var = (x10) obj5;
                String[] strArr = (String[]) obj4;
                boolean[] zArr = (boolean[]) obj3;
                a3[] a3VarArr = (a3[]) obj2;
                f6 f6Var = (f6) obj;
                if (!dVar.Q) {
                    if (editTextBoldCursor != null && editTextBoldCursor.getText().toString().getBytes(StandardCharsets.UTF_8).length > 960) {
                        g0.H3(editTextBoldCursor);
                        return;
                    }
                    dVar.setLoading(true);
                    x10Var.a(strArr[0], Boolean.valueOf(zArr[0]), new org.telegram.ui.Wallet.m(dVar, a3VarArr, f6Var, 5));
                    return;
                }
                return;
        }
    }

    public f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i7) {
        this.f26000a = i7;
        this.f26001b = obj;
        this.f26002c = obj2;
        this.d = obj3;
        this.f26003e = obj4;
        this.f26004f = obj5;
        this.h = obj6;
        this.f26005n = obj7;
    }
}
