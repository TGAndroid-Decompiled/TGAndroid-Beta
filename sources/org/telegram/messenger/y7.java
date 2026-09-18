package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.Window;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.p51;
import org.telegram.ui.dv;
import org.telegram.ui.ev;
import org.telegram.ui.gv;
import org.telegram.ui.zn;
public final class y7 implements Runnable {
    public final int f18127a = 0;
    public final boolean f18128b;
    public final int f18129c;
    public final int d;
    public final Object e;
    public final Object f18130f;
    public final Object h;

    public y7(MediaDataController mediaDataController, int i10, TLObject tLObject, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, int i11) {
        this.e = mediaDataController;
        this.f18129c = i10;
        this.f18130f = tLObject;
        this.h = n2Var;
        this.f18128b = z10;
        this.d = i11;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.qc qcVar;
        int i10;
        int i11;
        int i12;
        Activity activity;
        ij0 ij0Var;
        float f7;
        int i13 = this.f18127a;
        boolean z10 = this.f18128b;
        int i14 = this.d;
        int i15 = this.f18129c;
        Window window = null;
        Object obj = this.h;
        Object obj2 = this.f18130f;
        Object obj3 = this.e;
        switch (i13) {
            case 0:
                ((MediaDataController) obj3).lambda$toggleStickerSets$118(this.f18129c, (TLObject) obj2, (org.telegram.ui.ActionBar.n2) obj, this.f18128b, this.d);
                return;
            case 1:
                ((SendMessagesHelper) obj3).lambda$performSendMessageRequest$99(this.f18128b, (TLRPC.Message) obj2, this.f18129c, (ArrayList) obj, this.d);
                return;
            case 2:
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                zn znVar = ((org.telegram.ui.kl) obj3).f35143b;
                if (z10) {
                    i10 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                    MessagesController.getNotificationsSettings(i10).edit().remove("pin_" + znVar.T5).commit();
                    znVar.yc(0, true);
                    qcVar = null;
                } else {
                    qcVar = null;
                    znVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(znVar.T5), arrayList, Boolean.TRUE, arrayList2, null, 0, Integer.valueOf(i15), Boolean.valueOf(znVar.S4));
                }
                if (i14 == znVar.C3) {
                    znVar.A3 = qcVar;
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.oa oaVar = (org.telegram.ui.Components.oa) obj3;
                Bitmap bitmap = (Bitmap) obj2;
                String str = (String) obj;
                Paint paint = oaVar.f26904c;
                int i16 = oaVar.d;
                if (bitmap != null && !bitmap.isRecycled()) {
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    int round = (int) Math.round(Math.sqrt(width * 324.0f));
                    int round2 = (int) Math.round(Math.sqrt(324.0f / width));
                    if (i15 != 90 && i15 != 270) {
                        i12 = round2;
                        i11 = round;
                    } else {
                        i11 = round2;
                        i12 = round;
                    }
                    int i17 = i16 * 2;
                    Bitmap createBitmap = Bitmap.createBitmap(i17 + i11, i17 + i12, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                    int i18 = i16 + round;
                    int i19 = i16 + round2;
                    Rect rect2 = new Rect(i16, i16, i18, i19);
                    float f10 = i16;
                    canvas.translate((i11 / 2.0f) + f10, (i12 / 2.0f) + f10);
                    if (i14 == 1) {
                        canvas.scale(-1.0f, 1.0f);
                    } else if (i14 == 2) {
                        canvas.scale(1.0f, -1.0f);
                    }
                    canvas.rotate(i15);
                    float f11 = -i16;
                    canvas.translate(f11 - (round / 2.0f), f11 - (round2 / 2.0f));
                    try {
                        canvas.drawBitmap(bitmap, rect, rect2, (Paint) null);
                    } catch (Exception unused) {
                    }
                    Utilities.stackBlurBitmap(createBitmap, 6);
                    if (i16 > 0) {
                        float f12 = i18;
                        canvas.drawRect(0.0f, 0.0f, f12, f10, paint);
                        float f13 = i19;
                        canvas.drawRect(0.0f, f10, f10, f13, paint);
                        float f14 = i18 + i16;
                        canvas.drawRect(f12, f10, f14, f13, paint);
                        canvas.drawRect(0.0f, f13, f14, i19 + i16, paint);
                    }
                    AndroidUtilities.runOnUIThread(new ci.u1(oaVar, str, createBitmap, this.f18128b, bitmap));
                    return;
                }
                return;
            default:
                ev evVar = (ev) obj3;
                Context context = (Context) obj2;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                gv gvVar = evVar.f33364c;
                gvVar.b();
                org.telegram.ui.Cells.r8 r8Var = gvVar.e;
                gvVar.d();
                int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q6, false);
                ij0 ij0Var2 = gvVar.d;
                ij0Var2.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new p51(evVar, i15, w02));
                ofFloat.addListener(new org.telegram.ui.t0(evVar, w02, 1));
                ofFloat.setDuration(350L);
                ofFloat.start();
                int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19006a7, false);
                if (context instanceof Activity) {
                    activity = (Activity) context;
                } else {
                    activity = null;
                }
                if (activity != null) {
                    window = activity.getWindow();
                }
                if (window != null) {
                    ValueAnimator valueAnimator = gvVar.h;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        gvVar.h.cancel();
                    }
                    ValueAnimator valueAnimator2 = gvVar.h;
                    if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                        i14 = gvVar.f33951n;
                    }
                    int i20 = i14;
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    gvVar.h = ofFloat2;
                    if (z10) {
                        f7 = 50.0f;
                    } else {
                        f7 = 200.0f;
                    }
                    ij0Var = ij0Var2;
                    ofFloat2.addUpdateListener(new dv(evVar, f7, i20, w03, activity));
                    gvVar.h.addListener(new org.telegram.ui.t0(activity, w03, 2));
                    gvVar.h.setDuration(350L);
                    gvVar.h.start();
                } else {
                    ij0Var = ij0Var2;
                }
                if (org.telegram.ui.ActionBar.j6.f1()) {
                    r8Var.n(LocaleController.getString(R.string.SettingsSwitchToNightMode), ij0Var, true);
                } else {
                    r8Var.n(LocaleController.getString(R.string.SettingsSwitchToDayMode), ij0Var, true);
                }
                org.telegram.ui.ActionBar.j6.F1(n2Var);
                return;
        }
    }

    public y7(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.Message message, int i10, ArrayList arrayList, int i11) {
        this.e = sendMessagesHelper;
        this.f18128b = z10;
        this.f18130f = message;
        this.f18129c = i10;
        this.h = arrayList;
        this.d = i11;
    }

    public y7(org.telegram.ui.kl klVar, boolean z10, ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        this.e = klVar;
        this.f18128b = z10;
        this.f18130f = arrayList;
        this.h = arrayList2;
        this.f18129c = i10;
        this.d = i11;
    }

    public y7(org.telegram.ui.Components.oa oaVar, Bitmap bitmap, int i10, int i11, String str, boolean z10) {
        this.e = oaVar;
        this.f18130f = bitmap;
        this.f18129c = i10;
        this.d = i11;
        this.h = str;
        this.f18128b = z10;
    }

    public y7(ev evVar, int i10, Context context, int i11, boolean z10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.e = evVar;
        this.f18129c = i10;
        this.f18130f = context;
        this.d = i11;
        this.f18128b = z10;
        this.h = n2Var;
    }
}
