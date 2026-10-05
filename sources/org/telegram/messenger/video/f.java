package org.telegram.messenger.video;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import java.util.Calendar;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.video.VideoAds;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.gd0;
import org.telegram.ui.Components.rc;
import org.telegram.ui.c3;
import org.telegram.ui.ca;
import org.telegram.ui.h60;
import org.telegram.ui.n40;
import org.telegram.ui.o40;
import org.telegram.ui.q40;
import org.telegram.ui.s30;
public final class f implements View.OnClickListener {
    public final int f19460a;
    public final Object f19461b;
    public final Object f19462c;
    public final Object d;
    public final Object f19463e;
    public final Object f19464f;
    public final Object h;
    public final Object f19465n;

    public f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.f19460a = i10;
        this.f19461b = obj;
        this.f19462c = obj2;
        this.d = obj3;
        this.f19463e = obj4;
        this.f19464f = obj5;
        this.h = obj6;
        this.f19465n = obj7;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f19460a;
        Object obj = this.f19465n;
        Object obj2 = this.h;
        Object obj3 = this.f19464f;
        Object obj4 = this.f19463e;
        Object obj5 = this.d;
        Object obj6 = this.f19462c;
        Object obj7 = this.f19461b;
        switch (i10) {
            case 0:
                ((VideoAds) obj7).lambda$show$17((rc) obj6, (TLRPC.TL_sponsoredMessage) obj5, (Context) obj4, (d6) obj3, (VideoAds.AdLayout) obj2, (e) obj, view);
                return;
            default:
                h60 h60Var = (h60) obj7;
                gd0 gd0Var = (gd0) obj6;
                n40 n40Var = (n40) obj5;
                o40 o40Var = (o40) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                AccountInstance accountInstance = (AccountInstance) obj2;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                s30 s30Var = h60Var.f36924e1;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                h60Var.X0 = ofFloat;
                ofFloat.setDuration(600L);
                h60Var.X0.addUpdateListener(new c3(h60Var, 14));
                h60Var.X0.addListener(new q40(h60Var));
                h60Var.X0.start();
                if (ChatObject.isChannelOrGiga(h60Var.Z0)) {
                    s30Var.b(LocaleController.getString(R.string.VoipChannelVoiceChat), true);
                } else {
                    s30Var.b(LocaleController.getString(R.string.VoipGroupVoiceChat), true);
                }
                Calendar calendar = Calendar.getInstance();
                boolean g10 = e5.g(null, null, 0L, 604800L, 3, gd0Var, n40Var, o40Var);
                calendar.setTimeInMillis((gd0Var.getValue() * 86400000) + System.currentTimeMillis());
                calendar.set(11, n40Var.getValue());
                calendar.set(12, o40Var.getValue());
                if (g10) {
                    calendar.set(13, 0);
                }
                h60Var.f36949k2 = (int) (calendar.getTimeInMillis() / 1000);
                h60Var.L1(false);
                TL_phone.createGroupCall creategroupcall = new TL_phone.createGroupCall();
                creategroupcall.peer = MessagesController.getInputPeer(chat);
                creategroupcall.random_id = Utilities.random.nextInt();
                creategroupcall.schedule_date = h60Var.f36949k2;
                creategroupcall.flags |= 2;
                accountInstance.getConnectionsManager().sendRequest(creategroupcall, new ca(h60Var, chat, inputPeer, 11), 2);
                return;
        }
    }
}
