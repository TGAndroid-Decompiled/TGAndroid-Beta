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
import org.telegram.ui.Components.wc0;
import org.telegram.ui.Components.z4;
import org.telegram.ui.ba;
import org.telegram.ui.c60;
import org.telegram.ui.e3;
import org.telegram.ui.i40;
import org.telegram.ui.j40;
import org.telegram.ui.l40;
import org.telegram.ui.n30;
public final class f implements View.OnClickListener {
    public final int f18703a;
    public final Object f18704b;
    public final Object f18705c;
    public final Object d;
    public final Object e;
    public final Object f18706f;
    public final Object h;
    public final Object f18707n;

    public f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.f18703a = i10;
        this.f18704b = obj;
        this.f18705c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f18706f = obj5;
        this.h = obj6;
        this.f18707n = obj7;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f18703a;
        Object obj = this.f18707n;
        Object obj2 = this.h;
        Object obj3 = this.f18706f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.f18705c;
        Object obj7 = this.f18704b;
        switch (i10) {
            case 0:
                ((VideoAds) obj7).lambda$show$17((ic) obj6, (TLRPC.TL_sponsoredMessage) obj5, (Context) obj4, (f6) obj3, (VideoAds.AdLayout) obj2, (e) obj, view);
                return;
            default:
                c60 c60Var = (c60) obj7;
                wc0 wc0Var = (wc0) obj6;
                i40 i40Var = (i40) obj5;
                j40 j40Var = (j40) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                AccountInstance accountInstance = (AccountInstance) obj2;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                n30 n30Var = c60Var.f33103b1;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                c60Var.U0 = ofFloat;
                ofFloat.setDuration(600L);
                c60Var.U0.addUpdateListener(new e3(c60Var, 15));
                c60Var.U0.addListener(new l40(c60Var));
                c60Var.U0.start();
                if (ChatObject.isChannelOrGiga(c60Var.W0)) {
                    n30Var.b(LocaleController.getString(R.string.VoipChannelVoiceChat), true);
                } else {
                    n30Var.b(LocaleController.getString(R.string.VoipGroupVoiceChat), true);
                }
                Calendar calendar = Calendar.getInstance();
                boolean g10 = z4.g(null, null, 0L, 604800L, 3, wc0Var, i40Var, j40Var);
                calendar.setTimeInMillis((wc0Var.getValue() * 86400000) + System.currentTimeMillis());
                calendar.set(11, i40Var.getValue());
                calendar.set(12, j40Var.getValue());
                if (g10) {
                    calendar.set(13, 0);
                }
                c60Var.f33129h2 = (int) (calendar.getTimeInMillis() / 1000);
                c60Var.L1(false);
                TL_phone.createGroupCall creategroupcall = new TL_phone.createGroupCall();
                creategroupcall.peer = MessagesController.getInputPeer(chat);
                creategroupcall.random_id = Utilities.random.nextInt();
                creategroupcall.schedule_date = c60Var.f33129h2;
                creategroupcall.flags |= 2;
                accountInstance.getConnectionsManager().sendRequest(creategroupcall, new ba(c60Var, chat, inputPeer, 11), 2);
                return;
        }
    }
}
