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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.od0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Wallet.k2;
import org.telegram.ui.Wallet.r4;
import org.telegram.ui.ca;
import org.telegram.ui.e3;
import org.telegram.ui.q50;
import org.telegram.ui.u30;
import org.telegram.ui.v30;
import org.telegram.ui.x30;
import org.telegram.ui.z20;
public final class f implements View.OnClickListener {
    public final int f19785a;
    public final Object f19786b;
    public final Object f19787c;
    public final Object d;
    public final Object e;
    public final Object f19788f;
    public final Object h;
    public final Object f19789n;

    public f(ei.d dVar, r4 r4Var, Utilities.Callback3 callback3, String[] strArr, boolean[] zArr, k2[] k2VarArr, d6 d6Var) {
        this.f19785a = 2;
        this.f19786b = dVar;
        this.f19787c = r4Var;
        this.d = callback3;
        this.e = strArr;
        this.h = zArr;
        this.f19789n = k2VarArr;
        this.f19788f = d6Var;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f19785a;
        Object obj = this.f19788f;
        Object obj2 = this.f19789n;
        Object obj3 = this.h;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.f19787c;
        Object obj7 = this.f19786b;
        switch (i10) {
            case 0:
                ((VideoAds) obj7).lambda$show$17((qc) obj6, (TLRPC.TL_sponsoredMessage) obj5, (Context) obj4, (d6) obj, (VideoAds.AdLayout) obj3, (e) obj2, view);
                return;
            case 1:
                q50 q50Var = (q50) obj7;
                od0 od0Var = (od0) obj6;
                u30 u30Var = (u30) obj5;
                v30 v30Var = (v30) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                AccountInstance accountInstance = (AccountInstance) obj3;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
                z20 z20Var = q50Var.f40392e1;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                q50Var.X0 = ofFloat;
                ofFloat.setDuration(600L);
                q50Var.X0.addUpdateListener(new e3(q50Var, 15));
                q50Var.X0.addListener(new x30(q50Var));
                q50Var.X0.start();
                if (ChatObject.isChannelOrGiga(q50Var.Z0)) {
                    z20Var.b(LocaleController.getString(R.string.VoipChannelVoiceChat), true);
                } else {
                    z20Var.b(LocaleController.getString(R.string.VoipGroupVoiceChat), true);
                }
                Calendar calendar = Calendar.getInstance();
                boolean f7 = f5.f(null, null, 0L, 604800L, 3, od0Var, u30Var, v30Var);
                calendar.setTimeInMillis((od0Var.getValue() * 86400000) + System.currentTimeMillis());
                calendar.set(11, u30Var.getValue());
                calendar.set(12, v30Var.getValue());
                if (f7) {
                    calendar.set(13, 0);
                }
                q50Var.f40418k2 = (int) (calendar.getTimeInMillis() / 1000);
                q50Var.M1(false);
                TL_phone.createGroupCall creategroupcall = new TL_phone.createGroupCall();
                creategroupcall.peer = MessagesController.getInputPeer(chat);
                creategroupcall.random_id = Utilities.random.nextInt();
                creategroupcall.schedule_date = q50Var.f40418k2;
                creategroupcall.flags |= 2;
                accountInstance.getConnectionsManager().sendRequest(creategroupcall, new ca(q50Var, chat, inputPeer, 11), 2);
                return;
            default:
                ei.d dVar = (ei.d) obj7;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj6;
                Utilities.Callback3 callback3 = (Utilities.Callback3) obj5;
                String[] strArr = (String[]) obj4;
                boolean[] zArr = (boolean[]) obj3;
                k2[] k2VarArr = (k2[]) obj2;
                d6 d6Var = (d6) obj;
                if (!dVar.N) {
                    if (editTextBoldCursor != null && editTextBoldCursor.getText().toString().getBytes(StandardCharsets.UTF_8).length > 960) {
                        AndroidUtilities.shakeViewSpring(editTextBoldCursor);
                        return;
                    }
                    dVar.setLoading(true);
                    callback3.run(strArr[0], Boolean.valueOf(zArr[0]), new org.telegram.ui.Wallet.p(dVar, k2VarArr, d6Var, 5));
                    return;
                }
                return;
        }
    }

    public f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.f19785a = i10;
        this.f19786b = obj;
        this.f19787c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f19788f = obj5;
        this.h = obj6;
        this.f19789n = obj7;
    }
}
