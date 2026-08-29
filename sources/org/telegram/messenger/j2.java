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
import org.telegram.ui.Components.st;
import org.telegram.ui.Components.yb0;
import org.telegram.ui.ll0;
import org.telegram.ui.nn;
import org.telegram.ui.rn;
public final class j2 implements org.telegram.ui.ActionBar.b2, ResultCallback {
    public final int f20622a = 0;
    public final boolean f20623b;
    public final int f20624c;
    public final Object d;
    public final Object f20625e;
    public final Object f20626f;

    public j2(FactCheckController factCheckController, st stVar, int i10, MessageObject messageObject, boolean z10) {
        this.d = factCheckController;
        this.f20625e = stVar;
        this.f20624c = i10;
        this.f20626f = messageObject;
        this.f20623b = z10;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f20622a) {
            case 0:
                boolean z10 = this.f20623b;
                ((FactCheckController) this.d).lambda$openFactCheckEditor$8((st) this.f20625e, this.f20624c, (MessageObject) this.f20626f, z10, c2Var, i10);
                return;
            default:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.d;
                org.telegram.ui.web.w0 w0Var = (org.telegram.ui.web.w0) this.f20626f;
                ((String[]) this.f20625e)[0] = null;
                c2Var.dismiss();
                boolean z11 = this.f20623b;
                int i11 = this.f20624c;
                if (z11) {
                    MessagesController.getInstance(z0Var.I).unblockPeer(z0Var.Q.f22539id, new ll0(z0Var, i11, w0Var, 11));
                    return;
                }
                SendMessagesHelper.getInstance(z0Var.I).sendMessage(SendMessagesHelper.SendMessageParams.of(UserConfig.getInstance(z0Var.I).getCurrentUser(), z0Var.Q.f22539id, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("status", "sent");
                    org.telegram.ui.web.z0.u(i11, w0Var, "phone_requested", jSONObject);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }

    @Override
    public void onComplete(Object obj) {
        rn rnVar = (rn) this.d;
        org.telegram.ui.ActionBar.b4 b4Var = (org.telegram.ui.ActionBar.b4) this.f20625e;
        yb0 yb0Var = (yb0) this.f20626f;
        Pair pair = (Pair) obj;
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = ((of.a) pair.second).f19547b;
            org.telegram.ui.ActionBar.b4 b4Var2 = rnVar.f42156f;
            if (b4Var2 != null && longValue == b4Var2.i(rnVar.C ? 1 : 0) && bitmap != null) {
                ValueAnimator valueAnimator = rnVar.f42158r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                int i10 = b4Var.k(this.f20623b ? 1 : 0).settings.intensity;
                List list = ((of.a) pair.second).f19548c;
                yb0Var.R = list;
                long j10 = rnVar.R.Ma;
                if (list != null) {
                    yb0Var.S = new Random(j10).nextInt(yb0Var.R.size());
                }
                yb0Var.t(bitmap, i10);
                yb0Var.u(this.f20624c);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                rnVar.f42158r = ofFloat;
                ofFloat.addUpdateListener(new nn(yb0Var, 2));
                rnVar.f42158r.setDuration(250L);
                rnVar.f42158r.start();
            }
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    public j2(rn rnVar, org.telegram.ui.ActionBar.b4 b4Var, boolean z10, yb0 yb0Var, int i10) {
        this.d = rnVar;
        this.f20625e = b4Var;
        this.f20623b = z10;
        this.f20626f = yb0Var;
        this.f20624c = i10;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }

    public j2(org.telegram.ui.web.z0 z0Var, String[] strArr, boolean z10, int i10, org.telegram.ui.web.w0 w0Var) {
        this.d = z0Var;
        this.f20625e = strArr;
        this.f20623b = z10;
        this.f20624c = i10;
        this.f20626f = w0Var;
    }
}
