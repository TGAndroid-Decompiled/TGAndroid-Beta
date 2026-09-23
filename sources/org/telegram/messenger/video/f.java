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
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.tc0;
import org.telegram.ui.aa;
import org.telegram.ui.c3;
import org.telegram.ui.f60;
import org.telegram.ui.k40;
import org.telegram.ui.l40;
import org.telegram.ui.n40;
import org.telegram.ui.p30;
public final class f implements View.OnClickListener {
    public final int f17552a;
    public final Object f17553b;
    public final Object f17554c;
    public final Object d;
    public final Object e;
    public final Object f17555f;
    public final Object h;
    public final Object f17556n;

    public f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.f17552a = i10;
        this.f17553b = obj;
        this.f17554c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f17555f = obj5;
        this.h = obj6;
        this.f17556n = obj7;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f17552a;
        Object obj = this.f17556n;
        Object obj2 = this.h;
        Object obj3 = this.f17555f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.f17554c;
        Object obj7 = this.f17553b;
        switch (i10) {
            case 0:
                ((VideoAds) obj7).lambda$show$17((qc) obj6, (TLRPC.TL_sponsoredMessage) obj5, (Context) obj4, (d6) obj3, (VideoAds.AdLayout) obj2, (e) obj, view);
                return;
            default:
                f60 f60Var = (f60) obj7;
                tc0 tc0Var = (tc0) obj6;
                k40 k40Var = (k40) obj5;
                l40 l40Var = (l40) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                AccountInstance accountInstance = (AccountInstance) obj2;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                p30 p30Var = f60Var.f33116e1;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                f60Var.X0 = ofFloat;
                ofFloat.setDuration(600L);
                f60Var.X0.addUpdateListener(new c3(f60Var, 15));
                f60Var.X0.addListener(new n40(f60Var));
                f60Var.X0.start();
                if (ChatObject.isChannelOrGiga(f60Var.Z0)) {
                    p30Var.b(LocaleController.getString(R.string.VoipChannelVoiceChat), true);
                } else {
                    p30Var.b(LocaleController.getString(R.string.VoipGroupVoiceChat), true);
                }
                Calendar calendar = Calendar.getInstance();
                boolean g10 = e5.g(null, null, 0L, 604800L, 3, tc0Var, k40Var, l40Var);
                calendar.setTimeInMillis((tc0Var.getValue() * 86400000) + System.currentTimeMillis());
                calendar.set(11, k40Var.getValue());
                calendar.set(12, l40Var.getValue());
                if (g10) {
                    calendar.set(13, 0);
                }
                f60Var.f33141k2 = (int) (calendar.getTimeInMillis() / 1000);
                f60Var.L1(false);
                TL_phone.createGroupCall creategroupcall = new TL_phone.createGroupCall();
                creategroupcall.peer = MessagesController.getInputPeer(chat);
                creategroupcall.random_id = Utilities.random.nextInt();
                creategroupcall.schedule_date = f60Var.f33141k2;
                creategroupcall.flags |= 2;
                accountInstance.getConnectionsManager().sendRequest(creategroupcall, new aa(f60Var, chat, inputPeer, 11), 2);
                return;
        }
    }
}
