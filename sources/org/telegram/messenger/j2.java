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
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.mt;
import org.telegram.ui.jh0;
import org.telegram.ui.kn;
import org.telegram.ui.on;
public final class j2 implements org.telegram.ui.ActionBar.b2, ResultCallback {
    public final int f20640a = 0;
    public final boolean f20641b;
    public final int f20642c;
    public final Object d;
    public final Object f20643e;
    public final Object f20644f;

    public j2(FactCheckController factCheckController, mt mtVar, int i9, MessageObject messageObject, boolean z10) {
        this.d = factCheckController;
        this.f20643e = mtVar;
        this.f20642c = i9;
        this.f20644f = messageObject;
        this.f20641b = z10;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.f20640a) {
            case 0:
                boolean z10 = this.f20641b;
                ((FactCheckController) this.d).lambda$openFactCheckEditor$8((mt) this.f20643e, this.f20642c, (MessageObject) this.f20644f, z10, c2Var, i9);
                return;
            default:
                org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) this.d;
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.f20644f;
                ((String[]) this.f20643e)[0] = null;
                c2Var.dismiss();
                boolean z11 = this.f20641b;
                int i10 = this.f20642c;
                if (z11) {
                    MessagesController.getInstance(y0Var.I).unblockPeer(y0Var.Q.f22527id, new jh0(y0Var, i10, v0Var, 12));
                    return;
                }
                SendMessagesHelper.getInstance(y0Var.I).sendMessage(SendMessagesHelper.SendMessageParams.of(UserConfig.getInstance(y0Var.I).getCurrentUser(), y0Var.Q.f22527id, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("status", "sent");
                    org.telegram.ui.web.y0.u(i10, v0Var, "phone_requested", jSONObject);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }

    @Override
    public void onComplete(Object obj) {
        on onVar = (on) this.d;
        org.telegram.ui.ActionBar.b4 b4Var = (org.telegram.ui.ActionBar.b4) this.f20643e;
        jb0 jb0Var = (jb0) this.f20644f;
        Pair pair = (Pair) obj;
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = ((lf.a) pair.second).f16853b;
            org.telegram.ui.ActionBar.b4 b4Var2 = onVar.f41205f;
            if (b4Var2 != null && longValue == b4Var2.i(onVar.C ? 1 : 0) && bitmap != null) {
                ValueAnimator valueAnimator = onVar.f41207r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                int i9 = b4Var.k(this.f20641b ? 1 : 0).settings.intensity;
                List list = ((lf.a) pair.second).f16854c;
                jb0Var.R = list;
                long j10 = onVar.R.Ma;
                if (list != null) {
                    jb0Var.S = new Random(j10).nextInt(jb0Var.R.size());
                }
                jb0Var.t(bitmap, i9);
                jb0Var.u(this.f20642c);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                onVar.f41207r = ofFloat;
                ofFloat.addUpdateListener(new kn(jb0Var, 2));
                onVar.f41207r.setDuration(250L);
                onVar.f41207r.start();
            }
        }
    }

    @Override
    public void onError(Throwable th) {
        org.telegram.tgnet.k.a(this, th);
    }

    public j2(on onVar, org.telegram.ui.ActionBar.b4 b4Var, boolean z10, jb0 jb0Var, int i9) {
        this.d = onVar;
        this.f20643e = b4Var;
        this.f20641b = z10;
        this.f20644f = jb0Var;
        this.f20642c = i9;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }

    public j2(org.telegram.ui.web.y0 y0Var, String[] strArr, boolean z10, int i9, org.telegram.ui.web.v0 v0Var) {
        this.d = y0Var;
        this.f20643e = strArr;
        this.f20641b = z10;
        this.f20642c = i9;
        this.f20644f = v0Var;
    }
}
