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
import org.telegram.ui.Components.yi0;
import org.telegram.ui.Components.z41;
import org.telegram.ui.av;
import org.telegram.ui.cv;
import org.telegram.ui.xn;
import org.telegram.ui.zu;
public final class y7 implements Runnable {
    public final int f17939a = 0;
    public final boolean f17940b;
    public final int f17941c;
    public final int d;
    public final Object e;
    public final Object f17942f;
    public final Object h;

    public y7(MediaDataController mediaDataController, int i10, TLObject tLObject, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, int i11) {
        this.e = mediaDataController;
        this.f17941c = i10;
        this.f17942f = tLObject;
        this.h = n2Var;
        this.f17940b = z10;
        this.d = i11;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.qc qcVar;
        int i10;
        int i11;
        int i12;
        Activity activity;
        yi0 yi0Var;
        float f7;
        int i13 = this.f17939a;
        boolean z10 = this.f17940b;
        int i14 = this.d;
        int i15 = this.f17941c;
        Window window = null;
        Object obj = this.h;
        Object obj2 = this.f17942f;
        Object obj3 = this.e;
        switch (i13) {
            case 0:
                ((MediaDataController) obj3).lambda$toggleStickerSets$118(this.f17941c, (TLObject) obj2, (org.telegram.ui.ActionBar.n2) obj, this.f17940b, this.d);
                return;
            case 1:
                ((SendMessagesHelper) obj3).lambda$performSendMessageRequest$99(this.f17940b, (TLRPC.Message) obj2, this.f17941c, (ArrayList) obj, this.d);
                return;
            case 2:
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                xn xnVar = ((org.telegram.ui.kl) obj3).f34744b;
                if (z10) {
                    i10 = ((org.telegram.ui.ActionBar.n2) xnVar).currentAccount;
                    MessagesController.getNotificationsSettings(i10).edit().remove("pin_" + xnVar.T5).commit();
                    xnVar.yc(0, true);
                    qcVar = null;
                } else {
                    qcVar = null;
                    xnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(xnVar.T5), arrayList, Boolean.TRUE, arrayList2, null, 0, Integer.valueOf(i15), Boolean.valueOf(xnVar.S4));
                }
                if (i14 == xnVar.C3) {
                    xnVar.A3 = qcVar;
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.oa oaVar = (org.telegram.ui.Components.oa) obj3;
                Bitmap bitmap = (Bitmap) obj2;
                String str = (String) obj;
                Paint paint = oaVar.f26691c;
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
                    AndroidUtilities.runOnUIThread(new ci.u1(oaVar, str, createBitmap, this.f17940b, bitmap));
                    return;
                }
                return;
            default:
                av avVar = (av) obj3;
                Context context = (Context) obj2;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                cv cvVar = avVar.f31890c;
                cvVar.b();
                org.telegram.ui.Cells.s8 s8Var = cvVar.e;
                cvVar.d();
                int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.q6, false);
                yi0 yi0Var2 = cvVar.d;
                yi0Var2.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new z41(avVar, i15, w02));
                ofFloat.addListener(new org.telegram.ui.u0(avVar, w02, 1));
                ofFloat.setDuration(350L);
                ofFloat.start();
                int w03 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18733a7, false);
                if (context instanceof Activity) {
                    activity = (Activity) context;
                } else {
                    activity = null;
                }
                if (activity != null) {
                    window = activity.getWindow();
                }
                if (window != null) {
                    ValueAnimator valueAnimator = cvVar.h;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        cvVar.h.cancel();
                    }
                    ValueAnimator valueAnimator2 = cvVar.h;
                    if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                        i14 = cvVar.f32420n;
                    }
                    int i20 = i14;
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    cvVar.h = ofFloat2;
                    if (z10) {
                        f7 = 50.0f;
                    } else {
                        f7 = 200.0f;
                    }
                    yi0Var = yi0Var2;
                    ofFloat2.addUpdateListener(new zu(avVar, f7, i20, w03, activity));
                    cvVar.h.addListener(new org.telegram.ui.u0(activity, w03, 2));
                    cvVar.h.setDuration(350L);
                    cvVar.h.start();
                } else {
                    yi0Var = yi0Var2;
                }
                if (org.telegram.ui.ActionBar.h6.f1()) {
                    s8Var.n(LocaleController.getString(R.string.SettingsSwitchToNightMode), yi0Var, true);
                } else {
                    s8Var.n(LocaleController.getString(R.string.SettingsSwitchToDayMode), yi0Var, true);
                }
                org.telegram.ui.ActionBar.h6.F1(n2Var);
                return;
        }
    }

    public y7(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.Message message, int i10, ArrayList arrayList, int i11) {
        this.e = sendMessagesHelper;
        this.f17940b = z10;
        this.f17942f = message;
        this.f17941c = i10;
        this.h = arrayList;
        this.d = i11;
    }

    public y7(org.telegram.ui.kl klVar, boolean z10, ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        this.e = klVar;
        this.f17940b = z10;
        this.f17942f = arrayList;
        this.h = arrayList2;
        this.f17941c = i10;
        this.d = i11;
    }

    public y7(org.telegram.ui.Components.oa oaVar, Bitmap bitmap, int i10, int i11, String str, boolean z10) {
        this.e = oaVar;
        this.f17942f = bitmap;
        this.f17941c = i10;
        this.d = i11;
        this.h = str;
        this.f17940b = z10;
    }

    public y7(av avVar, int i10, Context context, int i11, boolean z10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.e = avVar;
        this.f17941c = i10;
        this.f17942f = context;
        this.d = i11;
        this.f17940b = z10;
        this.h = n2Var;
    }
}
