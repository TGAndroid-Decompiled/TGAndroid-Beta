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
import org.telegram.ui.Components.ed0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.aa;
import org.telegram.ui.c3;
import org.telegram.ui.d60;
import org.telegram.ui.i40;
import org.telegram.ui.j40;
import org.telegram.ui.l40;
import org.telegram.ui.n30;
public final class f implements View.OnClickListener {
    public final int f17807a;
    public final Object f17808b;
    public final Object f17809c;
    public final Object d;
    public final Object e;
    public final Object f17810f;
    public final Object h;
    public final Object f17811n;

    public f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.f17807a = i10;
        this.f17808b = obj;
        this.f17809c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f17810f = obj5;
        this.h = obj6;
        this.f17811n = obj7;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f17807a;
        Object obj = this.f17811n;
        Object obj2 = this.h;
        Object obj3 = this.f17810f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.f17809c;
        Object obj7 = this.f17808b;
        switch (i10) {
            case 0:
                ((VideoAds) obj7).lambda$show$17((qc) obj6, (TLRPC.TL_sponsoredMessage) obj5, (Context) obj4, (d6) obj3, (VideoAds.AdLayout) obj2, (e) obj, view);
                return;
            default:
                d60 d60Var = (d60) obj7;
                ed0 ed0Var = (ed0) obj6;
                i40 i40Var = (i40) obj5;
                j40 j40Var = (j40) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                AccountInstance accountInstance = (AccountInstance) obj2;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                n30 n30Var = d60Var.f32953e1;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                d60Var.X0 = ofFloat;
                ofFloat.setDuration(600L);
                d60Var.X0.addUpdateListener(new c3(d60Var, 15));
                d60Var.X0.addListener(new l40(d60Var));
                d60Var.X0.start();
                if (ChatObject.isChannelOrGiga(d60Var.Z0)) {
                    n30Var.b(LocaleController.getString(R.string.VoipChannelVoiceChat), true);
                } else {
                    n30Var.b(LocaleController.getString(R.string.VoipGroupVoiceChat), true);
                }
                Calendar calendar = Calendar.getInstance();
                boolean g10 = e5.g(null, null, 0L, 604800L, 3, ed0Var, i40Var, j40Var);
                calendar.setTimeInMillis((ed0Var.getValue() * 86400000) + System.currentTimeMillis());
                calendar.set(11, i40Var.getValue());
                calendar.set(12, j40Var.getValue());
                if (g10) {
                    calendar.set(13, 0);
                }
                d60Var.f32978k2 = (int) (calendar.getTimeInMillis() / 1000);
                d60Var.L1(false);
                TL_phone.createGroupCall creategroupcall = new TL_phone.createGroupCall();
                creategroupcall.peer = MessagesController.getInputPeer(chat);
                creategroupcall.random_id = Utilities.random.nextInt();
                creategroupcall.schedule_date = d60Var.f32978k2;
                creategroupcall.flags |= 2;
                accountInstance.getConnectionsManager().sendRequest(creategroupcall, new aa(d60Var, chat, inputPeer, 11), 2);
                return;
        }
    }
}
