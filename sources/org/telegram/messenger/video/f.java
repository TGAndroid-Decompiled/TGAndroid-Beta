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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.yd0;
import org.telegram.ui.Wallet.g4;
import org.telegram.ui.Wallet.k2;
import org.telegram.ui.c3;
import org.telegram.ui.ea;
import org.telegram.ui.i60;
import org.telegram.ui.n40;
import org.telegram.ui.o40;
import org.telegram.ui.q40;
import org.telegram.ui.s30;
public final class f implements View.OnClickListener {
    public final int f19251a;
    public final Object f19252b;
    public final Object f19253c;
    public final Object d;
    public final Object f19254e;
    public final Object f19255f;
    public final Object h;
    public final Object f19256n;

    public f(ci.d dVar, g4 g4Var, Utilities.Callback3 callback3, String[] strArr, boolean[] zArr, k2[] k2VarArr, c6 c6Var) {
        this.f19251a = 2;
        this.f19252b = dVar;
        this.f19253c = g4Var;
        this.d = callback3;
        this.f19254e = strArr;
        this.h = zArr;
        this.f19256n = k2VarArr;
        this.f19255f = c6Var;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f19251a;
        Object obj = this.f19255f;
        Object obj2 = this.f19256n;
        Object obj3 = this.h;
        Object obj4 = this.f19254e;
        Object obj5 = this.d;
        Object obj6 = this.f19253c;
        Object obj7 = this.f19252b;
        switch (i10) {
            case 0:
                ((VideoAds) obj7).lambda$show$17((sc) obj6, (TLRPC.TL_sponsoredMessage) obj5, (Context) obj4, (c6) obj, (VideoAds.AdLayout) obj3, (e) obj2, view);
                return;
            case 1:
                i60 i60Var = (i60) obj7;
                yd0 yd0Var = (yd0) obj6;
                n40 n40Var = (n40) obj5;
                o40 o40Var = (o40) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                AccountInstance accountInstance = (AccountInstance) obj3;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
                s30 s30Var = i60Var.f38699e1;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                i60Var.X0 = ofFloat;
                ofFloat.setDuration(600L);
                i60Var.X0.addUpdateListener(new c3(i60Var, 15));
                i60Var.X0.addListener(new q40(i60Var));
                i60Var.X0.start();
                if (ChatObject.isChannelOrGiga(i60Var.Z0)) {
                    s30Var.b(LocaleController.getString(R.string.VoipChannelVoiceChat), true);
                } else {
                    s30Var.b(LocaleController.getString(R.string.VoipGroupVoiceChat), true);
                }
                Calendar calendar = Calendar.getInstance();
                boolean f7 = g5.f(null, null, 0L, 604800L, 3, yd0Var, n40Var, o40Var);
                calendar.setTimeInMillis((yd0Var.getValue() * 86400000) + System.currentTimeMillis());
                calendar.set(11, n40Var.getValue());
                calendar.set(12, o40Var.getValue());
                if (f7) {
                    calendar.set(13, 0);
                }
                i60Var.f38724k2 = (int) (calendar.getTimeInMillis() / 1000);
                i60Var.M1(false);
                TL_phone.createGroupCall creategroupcall = new TL_phone.createGroupCall();
                creategroupcall.peer = MessagesController.getInputPeer(chat);
                creategroupcall.random_id = Utilities.random.nextInt();
                creategroupcall.schedule_date = i60Var.f38724k2;
                creategroupcall.flags |= 2;
                accountInstance.getConnectionsManager().sendRequest(creategroupcall, new ea(i60Var, chat, inputPeer, 11), 2);
                return;
            default:
                ci.d dVar = (ci.d) obj7;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj6;
                Utilities.Callback3 callback3 = (Utilities.Callback3) obj5;
                String[] strArr = (String[]) obj4;
                boolean[] zArr = (boolean[]) obj3;
                k2[] k2VarArr = (k2[]) obj2;
                c6 c6Var = (c6) obj;
                if (!dVar.N) {
                    if (editTextBoldCursor != null && editTextBoldCursor.getText().toString().getBytes(StandardCharsets.UTF_8).length > 960) {
                        AndroidUtilities.shakeViewSpring(editTextBoldCursor);
                        return;
                    }
                    dVar.setLoading(true);
                    callback3.run(strArr[0], Boolean.valueOf(zArr[0]), new org.telegram.ui.Wallet.p(dVar, k2VarArr, c6Var, 5));
                    return;
                }
                return;
        }
    }

    public f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.f19251a = i10;
        this.f19252b = obj;
        this.f19253c = obj2;
        this.d = obj3;
        this.f19254e = obj4;
        this.f19255f = obj5;
        this.h = obj6;
        this.f19256n = obj7;
    }
}
