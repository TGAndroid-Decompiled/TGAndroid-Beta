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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.xc0;
import org.telegram.ui.Components.z4;
import org.telegram.ui.da;
import org.telegram.ui.e60;
import org.telegram.ui.g3;
import org.telegram.ui.k40;
import org.telegram.ui.l40;
import org.telegram.ui.n40;
import org.telegram.ui.p30;
public final class f implements View.OnClickListener {
    public final int f18685a;
    public final Object f18686b;
    public final Object f18687c;
    public final Object d;
    public final Object e;
    public final Object f18688f;
    public final Object h;
    public final Object f18689n;

    public f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.f18685a = i10;
        this.f18686b = obj;
        this.f18687c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f18688f = obj5;
        this.h = obj6;
        this.f18689n = obj7;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f18685a;
        Object obj = this.f18689n;
        Object obj2 = this.h;
        Object obj3 = this.f18688f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.f18687c;
        Object obj7 = this.f18686b;
        switch (i10) {
            case 0:
                ((VideoAds) obj7).lambda$show$17((ic) obj6, (TLRPC.TL_sponsoredMessage) obj5, (Context) obj4, (f6) obj3, (VideoAds.AdLayout) obj2, (e) obj, view);
                return;
            default:
                e60 e60Var = (e60) obj7;
                xc0 xc0Var = (xc0) obj6;
                k40 k40Var = (k40) obj5;
                l40 l40Var = (l40) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                AccountInstance accountInstance = (AccountInstance) obj2;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                p30 p30Var = e60Var.f33622b1;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                e60Var.U0 = ofFloat;
                ofFloat.setDuration(600L);
                e60Var.U0.addUpdateListener(new g3(e60Var, 15));
                e60Var.U0.addListener(new n40(e60Var));
                e60Var.U0.start();
                if (ChatObject.isChannelOrGiga(e60Var.W0)) {
                    p30Var.b(LocaleController.getString(R.string.VoipChannelVoiceChat), true);
                } else {
                    p30Var.b(LocaleController.getString(R.string.VoipGroupVoiceChat), true);
                }
                Calendar calendar = Calendar.getInstance();
                boolean g10 = z4.g(null, null, 0L, 604800L, 3, xc0Var, k40Var, l40Var);
                calendar.setTimeInMillis((xc0Var.getValue() * 86400000) + System.currentTimeMillis());
                calendar.set(11, k40Var.getValue());
                calendar.set(12, l40Var.getValue());
                if (g10) {
                    calendar.set(13, 0);
                }
                e60Var.f33648h2 = (int) (calendar.getTimeInMillis() / 1000);
                e60Var.L1(false);
                TL_phone.createGroupCall creategroupcall = new TL_phone.createGroupCall();
                creategroupcall.peer = MessagesController.getInputPeer(chat);
                creategroupcall.random_id = Utilities.random.nextInt();
                creategroupcall.schedule_date = e60Var.f33648h2;
                creategroupcall.flags |= 2;
                accountInstance.getConnectionsManager().sendRequest(creategroupcall, new da(e60Var, chat, inputPeer, 11), 2);
                return;
        }
    }
}
