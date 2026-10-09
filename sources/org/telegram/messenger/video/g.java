package org.telegram.messenger.video;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import java.nio.charset.StandardCharsets;
import java.util.Calendar;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.video.VideoAds;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.ud0;
import org.telegram.ui.Wallet.d4;
import org.telegram.ui.Wallet.i2;
import org.telegram.ui.ba;
import org.telegram.ui.c3;
import org.telegram.ui.g60;
import org.telegram.ui.l40;
import org.telegram.ui.m40;
import org.telegram.ui.o40;
import org.telegram.ui.q30;
public final class g implements View.OnClickListener {
    public final int f19469a;
    public final Object f19470b;
    public final Object f19471c;
    public final Object d;
    public final Object f19472e;
    public final Object f19473f;
    public final Object h;
    public final Object f19474n;

    public g(ci.d dVar, d4 d4Var, Utilities.Callback3 callback3, String[] strArr, boolean[] zArr, i2[] i2VarArr, e6 e6Var) {
        this.f19469a = 2;
        this.f19470b = dVar;
        this.f19471c = d4Var;
        this.d = callback3;
        this.f19472e = strArr;
        this.h = zArr;
        this.f19474n = i2VarArr;
        this.f19473f = e6Var;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f19469a;
        Object obj = this.f19473f;
        Object obj2 = this.f19474n;
        Object obj3 = this.h;
        Object obj4 = this.f19472e;
        Object obj5 = this.d;
        Object obj6 = this.f19471c;
        Object obj7 = this.f19470b;
        switch (i10) {
            case 0:
                ((VideoAds) obj7).lambda$show$17((tc) obj6, (TLRPC.TL_sponsoredMessage) obj5, (Context) obj4, (e6) obj, (VideoAds.AdLayout) obj3, (e) obj2, view);
                return;
            case 1:
                g60 g60Var = (g60) obj7;
                ud0 ud0Var = (ud0) obj6;
                l40 l40Var = (l40) obj5;
                m40 m40Var = (m40) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                AccountInstance accountInstance = (AccountInstance) obj3;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
                q30 q30Var = g60Var.f37805e1;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                g60Var.X0 = ofFloat;
                ofFloat.setDuration(600L);
                g60Var.X0.addUpdateListener(new c3(g60Var, 15));
                g60Var.X0.addListener(new o40(g60Var));
                g60Var.X0.start();
                if (ChatObject.isChannelOrGiga(g60Var.Z0)) {
                    q30Var.b(LocaleController.getString(R.string.VoipChannelVoiceChat), true);
                } else {
                    q30Var.b(LocaleController.getString(R.string.VoipGroupVoiceChat), true);
                }
                Calendar calendar = Calendar.getInstance();
                boolean f7 = g5.f(null, null, 0L, 604800L, 3, ud0Var, l40Var, m40Var);
                calendar.setTimeInMillis((ud0Var.getValue() * 86400000) + System.currentTimeMillis());
                calendar.set(11, l40Var.getValue());
                calendar.set(12, m40Var.getValue());
                if (f7) {
                    calendar.set(13, 0);
                }
                g60Var.f37830k2 = (int) (calendar.getTimeInMillis() / 1000);
                g60Var.M1(false);
                TL_phone.createGroupCall creategroupcall = new TL_phone.createGroupCall();
                creategroupcall.peer = MessagesController.getInputPeer(chat);
                creategroupcall.random_id = Utilities.random.nextInt();
                creategroupcall.schedule_date = g60Var.f37830k2;
                creategroupcall.flags |= 2;
                accountInstance.getConnectionsManager().sendRequest(creategroupcall, new ba(g60Var, chat, inputPeer, 11), 2);
                return;
            default:
                ci.d dVar = (ci.d) obj7;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj6;
                Utilities.Callback3 callback3 = (Utilities.Callback3) obj5;
                String[] strArr = (String[]) obj4;
                boolean[] zArr = (boolean[]) obj3;
                i2[] i2VarArr = (i2[]) obj2;
                e6 e6Var = (e6) obj;
                if (!dVar.N) {
                    if (editTextBoldCursor != null && editTextBoldCursor.getText().toString().getBytes(StandardCharsets.UTF_8).length > 960) {
                        AndroidUtilities.shakeViewSpring(editTextBoldCursor);
                        return;
                    }
                    dVar.setLoading(true);
                    callback3.run(strArr[0], Boolean.valueOf(zArr[0]), new org.telegram.ui.Wallet.o(dVar, i2VarArr, e6Var, 5));
                    return;
                }
                return;
        }
    }

    public g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.f19469a = i10;
        this.f19470b = obj;
        this.f19471c = obj2;
        this.d = obj3;
        this.f19472e = obj4;
        this.f19473f = obj5;
        this.h = obj6;
        this.f19474n = obj7;
    }
}
