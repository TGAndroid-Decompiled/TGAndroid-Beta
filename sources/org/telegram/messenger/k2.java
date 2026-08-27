package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.util.Pair;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import org.json.JSONObject;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lt;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.ln;
import org.telegram.ui.ol0;
import org.telegram.ui.pn;

public final class k2 implements org.telegram.ui.ActionBar.a2, ResultCallback {

    public final int f20727a = 0;

    public final boolean f20728b;

    public final int f20729c;
    public final Object d;

    public final Object f20730e;

    public final Object f20731f;

    public k2(FactCheckController factCheckController, lt ltVar, int i10, MessageObject messageObject, boolean z10) {
        this.d = factCheckController;
        this.f20730e = ltVar;
        this.f20729c = i10;
        this.f20731f = messageObject;
        this.f20728b = z10;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f20727a) {
            case 0:
                ((FactCheckController) this.d).lambda$openFactCheckEditor$8((lt) this.f20730e, this.f20729c, (MessageObject) this.f20731f, this.f20728b, b2Var, i10);
                break;
            default:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.d;
                String[] strArr = (String[]) this.f20730e;
                org.telegram.ui.web.w0 w0Var = (org.telegram.ui.web.w0) this.f20731f;
                strArr[0] = null;
                b2Var.dismiss();
                boolean z10 = this.f20728b;
                int i11 = this.f20729c;
                if (z10) {
                    MessagesController.getInstance(z0Var.I).unblockPeer(z0Var.Q.f22527id, new ol0(z0Var, i11, w0Var, 11));
                } else {
                    SendMessagesHelper.getInstance(z0Var.I).sendMessage(SendMessagesHelper.SendMessageParams.of(UserConfig.getInstance(z0Var.I).getCurrentUser(), z0Var.Q.f22527id, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", "sent");
                        org.telegram.ui.web.z0.u(i11, w0Var, "phone_requested", jSONObject);
                    } catch (Exception e9) {
                        FileLog.e(e9);
                    }
                }
                break;
        }
    }

    @Override
    public void onComplete(Object obj) {
        pn pnVar = (pn) this.d;
        org.telegram.ui.ActionBar.b4 b4Var = (org.telegram.ui.ActionBar.b4) this.f20730e;
        nb0 nb0Var = (nb0) this.f20731f;
        Pair pair = (Pair) obj;
        if (pair == null) {
            return;
        }
        long jLongValue = ((Long) pair.first).longValue();
        Bitmap bitmap = ((mf.a) pair.second).f18037b;
        org.telegram.ui.ActionBar.b4 b4Var2 = pnVar.f41395f;
        if (b4Var2 == null || jLongValue != b4Var2.i(pnVar.C ? 1 : 0) || bitmap == null) {
            return;
        }
        ValueAnimator valueAnimator = pnVar.f41397r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i10 = b4Var.k(this.f20728b ? 1 : 0).settings.intensity;
        List list = ((mf.a) pair.second).f18038c;
        nb0Var.R = list;
        long j10 = pnVar.R.Ma;
        if (list != null) {
            nb0Var.S = new Random(j10).nextInt(nb0Var.R.size());
        }
        nb0Var.t(bitmap, i10);
        nb0Var.u(this.f20729c);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        pnVar.f41397r = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ln(nb0Var, 2));
        pnVar.f41397r.setDuration(250L);
        pnVar.f41397r.start();
    }

    @Override
    public void onError(Throwable th) {
        org.telegram.tgnet.k.a(this, th);
    }

    public k2(pn pnVar, org.telegram.ui.ActionBar.b4 b4Var, boolean z10, nb0 nb0Var, int i10) {
        this.d = pnVar;
        this.f20730e = b4Var;
        this.f20728b = z10;
        this.f20731f = nb0Var;
        this.f20729c = i10;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }

    public k2(org.telegram.ui.web.z0 z0Var, String[] strArr, boolean z10, int i10, org.telegram.ui.web.w0 w0Var) {
        this.d = z0Var;
        this.f20730e = strArr;
        this.f20728b = z10;
        this.f20729c = i10;
        this.f20731f = w0Var;
    }
}
