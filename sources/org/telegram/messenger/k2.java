package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.util.Pair;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import org.json.JSONObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.vt;
import org.telegram.ui.rn;
import org.telegram.ui.vn;
import org.telegram.ui.zt0;
public final class k2 implements org.telegram.ui.ActionBar.c2, ResultCallback {
    public final int f17622a = 0;
    public final boolean f17623b;
    public final int f17624c;
    public final Object d;
    public final Object e;
    public final Object f17625f;

    public k2(FactCheckController factCheckController, vt vtVar, int i10, MessageObject messageObject, boolean z4) {
        this.d = factCheckController;
        this.e = vtVar;
        this.f17624c = i10;
        this.f17625f = messageObject;
        this.f17623b = z4;
    }

    @Override
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f17622a) {
            case 0:
                boolean z4 = this.f17623b;
                ((FactCheckController) this.d).lambda$openFactCheckEditor$8((vt) this.e, this.f17624c, (MessageObject) this.f17625f, z4, d2Var, i10);
                return;
            default:
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) this.d;
                org.telegram.ui.web.w0 w0Var = (org.telegram.ui.web.w0) this.f17625f;
                ((String[]) this.e)[0] = null;
                d2Var.dismiss();
                boolean z10 = this.f17623b;
                int i11 = this.f17624c;
                if (z10) {
                    MessagesController.getInstance(a1Var.J).unblockPeer(a1Var.R.f19331id, new zt0(a1Var, i11, w0Var, 9));
                    return;
                }
                SendMessagesHelper.getInstance(a1Var.J).sendMessage(SendMessagesHelper.SendMessageParams.of(UserConfig.getInstance(a1Var.J).getCurrentUser(), a1Var.R.f19331id, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("status", "sent");
                    org.telegram.ui.web.a1.u(i11, w0Var, "phone_requested", jSONObject);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
        }
    }

    @Override
    public void onComplete(Object obj) {
        vn vnVar = (vn) this.d;
        org.telegram.ui.ActionBar.e4 e4Var = (org.telegram.ui.ActionBar.e4) this.e;
        dc0 dc0Var = (dc0) this.f17625f;
        Pair pair = (Pair) obj;
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = ((qf.a) pair.second).f43051b;
            org.telegram.ui.ActionBar.e4 e4Var2 = vnVar.f39218f;
            if (e4Var2 != null && longValue == e4Var2.i(vnVar.D ? 1 : 0) && bitmap != null) {
                ValueAnimator valueAnimator = vnVar.f39220r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                int i10 = e4Var.k(this.f17623b ? 1 : 0).settings.intensity;
                List list = ((qf.a) pair.second).f43052c;
                dc0Var.R = list;
                long j10 = vnVar.S.Na;
                if (list != null) {
                    dc0Var.S = new Random(j10).nextInt(dc0Var.R.size());
                }
                dc0Var.t(bitmap, i10);
                dc0Var.u(this.f17624c);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                vnVar.f39220r = ofFloat;
                ofFloat.addUpdateListener(new rn(dc0Var, 2));
                vnVar.f39220r.setDuration(250L);
                vnVar.f39220r.start();
            }
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    public k2(vn vnVar, org.telegram.ui.ActionBar.e4 e4Var, boolean z4, dc0 dc0Var, int i10) {
        this.d = vnVar;
        this.e = e4Var;
        this.f17623b = z4;
        this.f17625f = dc0Var;
        this.f17624c = i10;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }

    public k2(org.telegram.ui.web.a1 a1Var, String[] strArr, boolean z4, int i10, org.telegram.ui.web.w0 w0Var) {
        this.d = a1Var;
        this.e = strArr;
        this.f17623b = z4;
        this.f17624c = i10;
        this.f17625f = w0Var;
    }
}
