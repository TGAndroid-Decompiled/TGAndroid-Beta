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
import org.telegram.ui.Components.d41;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.qn;
import org.telegram.ui.ru;
import org.telegram.ui.su;
import org.telegram.ui.tu;
public final class v7 implements Runnable {
    public final int f21734a = 0;
    public final boolean f21735b;
    public final int f21736c;
    public final int d;
    public final Object f21737e;
    public final Object f21738f;
    public final Object h;

    public v7(MediaDataController mediaDataController, int i9, TLObject tLObject, org.telegram.ui.ActionBar.o2 o2Var, boolean z10, int i10) {
        this.f21737e = mediaDataController;
        this.f21736c = i9;
        this.f21738f = tLObject;
        this.h = o2Var;
        this.f21735b = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.gc gcVar;
        int i9;
        int i10;
        int i11;
        Activity activity;
        mi0 mi0Var;
        float f10;
        int i12 = this.f21734a;
        boolean z10 = this.f21735b;
        int i13 = this.d;
        int i14 = this.f21736c;
        Window window = null;
        Object obj = this.h;
        Object obj2 = this.f21738f;
        Object obj3 = this.f21737e;
        switch (i12) {
            case 0:
                ((MediaDataController) obj3).lambda$toggleStickerSets$118(this.f21736c, (TLObject) obj2, (org.telegram.ui.ActionBar.o2) obj, this.f21735b, this.d);
                return;
            case 1:
                ((SendMessagesHelper) obj3).lambda$performSendMessageRequest$99(this.f21735b, (TLRPC.Message) obj2, this.f21736c, (ArrayList) obj, this.d);
                return;
            case 2:
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                qn qnVar = ((org.telegram.ui.bl) obj3).f36901b;
                if (z10) {
                    i9 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
                    MessagesController.getNotificationsSettings(i9).edit().remove("pin_" + qnVar.P5).commit();
                    qnVar.yc(0, true);
                    gcVar = null;
                } else {
                    gcVar = null;
                    qnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(qnVar.P5), arrayList, Boolean.TRUE, arrayList2, null, 0, Integer.valueOf(i14), Boolean.valueOf(qnVar.O4));
                }
                if (i13 == qnVar.f42144y3) {
                    qnVar.f42117w3 = gcVar;
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.ga gaVar = (org.telegram.ui.Components.ga) obj3;
                Bitmap bitmap = (Bitmap) obj2;
                String str = (String) obj;
                Paint paint = gaVar.f28713c;
                int i15 = gaVar.d;
                if (bitmap != null && !bitmap.isRecycled()) {
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    int round = (int) Math.round(Math.sqrt(width * 324.0f));
                    int round2 = (int) Math.round(Math.sqrt(324.0f / width));
                    if (i14 != 90 && i14 != 270) {
                        i11 = round2;
                        i10 = round;
                    } else {
                        i10 = round2;
                        i11 = round;
                    }
                    int i16 = i15 * 2;
                    Bitmap createBitmap = Bitmap.createBitmap(i16 + i10, i16 + i11, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                    int i17 = i15 + round;
                    int i18 = i15 + round2;
                    Rect rect2 = new Rect(i15, i15, i17, i18);
                    float f11 = i15;
                    canvas.translate((i10 / 2.0f) + f11, (i11 / 2.0f) + f11);
                    if (i13 == 1) {
                        canvas.scale(-1.0f, 1.0f);
                    } else if (i13 == 2) {
                        canvas.scale(1.0f, -1.0f);
                    }
                    canvas.rotate(i14);
                    float f12 = -i15;
                    canvas.translate(f12 - (round / 2.0f), f12 - (round2 / 2.0f));
                    try {
                        canvas.drawBitmap(bitmap, rect, rect2, (Paint) null);
                    } catch (Exception unused) {
                    }
                    Utilities.stackBlurBitmap(createBitmap, 6);
                    if (i15 > 0) {
                        float f13 = i17;
                        canvas.drawRect(0.0f, 0.0f, f13, f11, paint);
                        float f14 = i18;
                        canvas.drawRect(0.0f, f11, f11, f14, paint);
                        float f15 = i17 + i15;
                        canvas.drawRect(f13, f11, f15, f14, paint);
                        canvas.drawRect(0.0f, f14, f15, i18 + i15, paint);
                    }
                    AndroidUtilities.runOnUIThread(new bg.m(gaVar, str, createBitmap, this.f21735b, bitmap, 14));
                    return;
                }
                return;
            default:
                su suVar = (su) obj3;
                Context context = (Context) obj2;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
                tu tuVar = suVar.f42768c;
                tuVar.b();
                org.telegram.ui.Cells.p8 p8Var = tuVar.f43064e;
                tuVar.d();
                int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23229q6, false);
                mi0 mi0Var2 = tuVar.d;
                mi0Var2.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new d41(suVar, i14, w02));
                ofFloat.addListener(new org.telegram.ui.w0(suVar, w02, 1));
                ofFloat.setDuration(350L);
                ofFloat.start();
                int w03 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f22947a7, false);
                if (context instanceof Activity) {
                    activity = (Activity) context;
                } else {
                    activity = null;
                }
                if (activity != null) {
                    window = activity.getWindow();
                }
                if (window != null) {
                    ValueAnimator valueAnimator = tuVar.h;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        tuVar.h.cancel();
                    }
                    ValueAnimator valueAnimator2 = tuVar.h;
                    if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                        i13 = tuVar.f43066n;
                    }
                    int i19 = i13;
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    tuVar.h = ofFloat2;
                    if (z10) {
                        f10 = 50.0f;
                    } else {
                        f10 = 200.0f;
                    }
                    mi0Var = mi0Var2;
                    ofFloat2.addUpdateListener(new ru(suVar, f10, i19, w03, activity));
                    tuVar.h.addListener(new org.telegram.ui.w0(activity, w03, 2));
                    tuVar.h.setDuration(350L);
                    tuVar.h.start();
                } else {
                    mi0Var = mi0Var2;
                }
                if (org.telegram.ui.ActionBar.f6.f1()) {
                    p8Var.n(LocaleController.getString(R.string.SettingsSwitchToNightMode), mi0Var, true);
                } else {
                    p8Var.n(LocaleController.getString(R.string.SettingsSwitchToDayMode), mi0Var, true);
                }
                org.telegram.ui.ActionBar.f6.F1(o2Var);
                return;
        }
    }

    public v7(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.Message message, int i9, ArrayList arrayList, int i10) {
        this.f21737e = sendMessagesHelper;
        this.f21735b = z10;
        this.f21738f = message;
        this.f21736c = i9;
        this.h = arrayList;
        this.d = i10;
    }

    public v7(org.telegram.ui.bl blVar, boolean z10, ArrayList arrayList, ArrayList arrayList2, int i9, int i10) {
        this.f21737e = blVar;
        this.f21735b = z10;
        this.f21738f = arrayList;
        this.h = arrayList2;
        this.f21736c = i9;
        this.d = i10;
    }

    public v7(org.telegram.ui.Components.ga gaVar, Bitmap bitmap, int i9, int i10, String str, boolean z10) {
        this.f21737e = gaVar;
        this.f21738f = bitmap;
        this.f21736c = i9;
        this.d = i10;
        this.h = str;
        this.f21735b = z10;
    }

    public v7(su suVar, int i9, Context context, int i10, boolean z10, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f21737e = suVar;
        this.f21736c = i9;
        this.f21738f = context;
        this.d = i10;
        this.f21735b = z10;
        this.h = o2Var;
    }
}
