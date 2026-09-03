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
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.xt;
import org.telegram.ui.gu0;
import org.telegram.ui.rn;
import org.telegram.ui.vn;
public final class k2 implements org.telegram.ui.ActionBar.c2, ResultCallback {
    public final int f19115a = 0;
    public final boolean f19116b;
    public final int f19117c;
    public final Object d;
    public final Object f19118e;
    public final Object f19119f;

    public k2(FactCheckController factCheckController, xt xtVar, int i10, MessageObject messageObject, boolean z4) {
        this.d = factCheckController;
        this.f19118e = xtVar;
        this.f19117c = i10;
        this.f19119f = messageObject;
        this.f19116b = z4;
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f19115a) {
            case 0:
                boolean z4 = this.f19116b;
                ((FactCheckController) this.d).lambda$openFactCheckEditor$8((xt) this.f19118e, this.f19117c, (MessageObject) this.f19119f, z4, d2Var, i10);
                return;
            default:
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) this.d;
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) this.f19119f;
                ((String[]) this.f19118e)[0] = null;
                d2Var.dismiss();
                boolean z10 = this.f19116b;
                int i11 = this.f19117c;
                if (z10) {
                    MessagesController.getInstance(a1Var.J).unblockPeer(a1Var.R.f20992id, new gu0(a1Var, i11, x0Var, 9));
                    return;
                }
                SendMessagesHelper.getInstance(a1Var.J).sendMessage(SendMessagesHelper.SendMessageParams.of(UserConfig.getInstance(a1Var.J).getCurrentUser(), a1Var.R.f20992id, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("status", "sent");
                    org.telegram.ui.web.a1.u(i11, x0Var, "phone_requested", jSONObject);
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
        }
    }

    @Override
    public void onComplete(Object obj) {
        vn vnVar = (vn) this.d;
        org.telegram.ui.ActionBar.f4 f4Var = (org.telegram.ui.ActionBar.f4) this.f19118e;
        fc0 fc0Var = (fc0) this.f19119f;
        Pair pair = (Pair) obj;
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = ((qf.a) pair.second).f44862b;
            org.telegram.ui.ActionBar.f4 f4Var2 = vnVar.f42178f;
            if (f4Var2 != null && longValue == f4Var2.i(vnVar.D ? 1 : 0) && bitmap != null) {
                ValueAnimator valueAnimator = vnVar.f42180r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                int i10 = f4Var.k(this.f19116b ? 1 : 0).settings.intensity;
                List list = ((qf.a) pair.second).f44863c;
                fc0Var.R = list;
                long j10 = vnVar.S.Na;
                if (list != null) {
                    fc0Var.S = new Random(j10).nextInt(fc0Var.R.size());
                }
                fc0Var.t(bitmap, i10);
                fc0Var.u(this.f19117c);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                vnVar.f42180r = ofFloat;
                ofFloat.addUpdateListener(new rn(fc0Var, 2));
                vnVar.f42180r.setDuration(250L);
                vnVar.f42180r.start();
            }
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    public k2(vn vnVar, org.telegram.ui.ActionBar.f4 f4Var, boolean z4, fc0 fc0Var, int i10) {
        this.d = vnVar;
        this.f19118e = f4Var;
        this.f19116b = z4;
        this.f19119f = fc0Var;
        this.f19117c = i10;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }

    public k2(org.telegram.ui.web.a1 a1Var, String[] strArr, boolean z4, int i10, org.telegram.ui.web.x0 x0Var) {
        this.d = a1Var;
        this.f19118e = strArr;
        this.f19116b = z4;
        this.f19117c = i10;
        this.f19119f = x0Var;
    }
}
