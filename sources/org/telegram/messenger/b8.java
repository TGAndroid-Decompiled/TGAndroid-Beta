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
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.bv;
import org.telegram.ui.cv;
import org.telegram.ui.dv;
import org.telegram.ui.xn;
public final class b8 implements Runnable {
    public final int f18237a = 0;
    public final boolean f18238b;
    public final int f18239c;
    public final int d;
    public final Object f18240e;
    public final Object f18241f;
    public final Object h;

    public b8(MediaDataController mediaDataController, int i10, TLObject tLObject, org.telegram.ui.ActionBar.p2 p2Var, boolean z4, int i11) {
        this.f18240e = mediaDataController;
        this.f18239c = i10;
        this.f18241f = tLObject;
        this.h = p2Var;
        this.f18238b = z4;
        this.d = i11;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.ic icVar;
        int i10;
        int i11;
        int i12;
        Activity activity;
        ij0 ij0Var;
        float f10;
        int i13 = this.f18237a;
        boolean z4 = this.f18238b;
        int i14 = this.d;
        int i15 = this.f18239c;
        Window window = null;
        Object obj = this.h;
        Object obj2 = this.f18241f;
        Object obj3 = this.f18240e;
        switch (i13) {
            case 0:
                ((MediaDataController) obj3).lambda$toggleStickerSets$118(this.f18239c, (TLObject) obj2, (org.telegram.ui.ActionBar.p2) obj, this.f18238b, this.d);
                return;
            case 1:
                ((SendMessagesHelper) obj3).lambda$performSendMessageRequest$99(this.f18238b, (TLRPC.Message) obj2, this.f18239c, (ArrayList) obj, this.d);
                return;
            case 2:
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                xn xnVar = ((org.telegram.ui.kl) obj3).f38436b;
                if (z4) {
                    i10 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                    MessagesController.getNotificationsSettings(i10).edit().remove("pin_" + xnVar.Q5).commit();
                    xnVar.yc(0, true);
                    icVar = null;
                } else {
                    icVar = null;
                    xnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(xnVar.Q5), arrayList, Boolean.TRUE, arrayList2, null, 0, Integer.valueOf(i15), Boolean.valueOf(xnVar.P4));
                }
                if (i14 == xnVar.f43433z3) {
                    xnVar.f43406x3 = icVar;
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.ga gaVar = (org.telegram.ui.Components.ga) obj3;
                Bitmap bitmap = (Bitmap) obj2;
                String str = (String) obj;
                Paint paint = gaVar.f27157c;
                int i16 = gaVar.d;
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
                    float f11 = i16;
                    canvas.translate((i11 / 2.0f) + f11, (i12 / 2.0f) + f11);
                    if (i14 == 1) {
                        canvas.scale(-1.0f, 1.0f);
                    } else if (i14 == 2) {
                        canvas.scale(1.0f, -1.0f);
                    }
                    canvas.rotate(i15);
                    float f12 = -i16;
                    canvas.translate(f12 - (round / 2.0f), f12 - (round2 / 2.0f));
                    try {
                        canvas.drawBitmap(bitmap, rect, rect2, (Paint) null);
                    } catch (Exception unused) {
                    }
                    Utilities.stackBlurBitmap(createBitmap, 6);
                    if (i16 > 0) {
                        float f13 = i18;
                        canvas.drawRect(0.0f, 0.0f, f13, f11, paint);
                        float f14 = i19;
                        canvas.drawRect(0.0f, f11, f11, f14, paint);
                        float f15 = i18 + i16;
                        canvas.drawRect(f13, f11, f15, f14, paint);
                        canvas.drawRect(0.0f, f14, f15, i19 + i16, paint);
                    }
                    AndroidUtilities.runOnUIThread(new hg.j(gaVar, str, createBitmap, this.f18238b, bitmap, 12));
                    return;
                }
                return;
            default:
                cv cvVar = (cv) obj3;
                Context context = (Context) obj2;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj;
                dv dvVar = cvVar.f35917c;
                dvVar.b();
                org.telegram.ui.Cells.o8 o8Var = dvVar.f36312e;
                dvVar.d();
                int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21894q6, false);
                ij0 ij0Var2 = dvVar.d;
                ij0Var2.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new b51(cvVar, i15, w02));
                ofFloat.addListener(new org.telegram.ui.v0(cvVar, w02, 1));
                ofFloat.setDuration(350L);
                ofFloat.start();
                int w03 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21605a7, false);
                if (context instanceof Activity) {
                    activity = (Activity) context;
                } else {
                    activity = null;
                }
                if (activity != null) {
                    window = activity.getWindow();
                }
                if (window != null) {
                    ValueAnimator valueAnimator = dvVar.h;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        dvVar.h.cancel();
                    }
                    ValueAnimator valueAnimator2 = dvVar.h;
                    if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                        i14 = dvVar.f36314n;
                    }
                    int i20 = i14;
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    dvVar.h = ofFloat2;
                    if (z4) {
                        f10 = 50.0f;
                    } else {
                        f10 = 200.0f;
                    }
                    ij0Var = ij0Var2;
                    ofFloat2.addUpdateListener(new bv(cvVar, f10, i20, w03, activity));
                    dvVar.h.addListener(new org.telegram.ui.v0(activity, w03, 2));
                    dvVar.h.setDuration(350L);
                    dvVar.h.start();
                } else {
                    ij0Var = ij0Var2;
                }
                if (org.telegram.ui.ActionBar.k6.f1()) {
                    o8Var.n(LocaleController.getString(R.string.SettingsSwitchToNightMode), ij0Var, true);
                } else {
                    o8Var.n(LocaleController.getString(R.string.SettingsSwitchToDayMode), ij0Var, true);
                }
                org.telegram.ui.ActionBar.k6.F1(p2Var);
                return;
        }
    }

    public b8(SendMessagesHelper sendMessagesHelper, boolean z4, TLRPC.Message message, int i10, ArrayList arrayList, int i11) {
        this.f18240e = sendMessagesHelper;
        this.f18238b = z4;
        this.f18241f = message;
        this.f18239c = i10;
        this.h = arrayList;
        this.d = i11;
    }

    public b8(org.telegram.ui.kl klVar, boolean z4, ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        this.f18240e = klVar;
        this.f18238b = z4;
        this.f18241f = arrayList;
        this.h = arrayList2;
        this.f18239c = i10;
        this.d = i11;
    }

    public b8(org.telegram.ui.Components.ga gaVar, Bitmap bitmap, int i10, int i11, String str, boolean z4) {
        this.f18240e = gaVar;
        this.f18241f = bitmap;
        this.f18239c = i10;
        this.d = i11;
        this.h = str;
        this.f18238b = z4;
    }

    public b8(cv cvVar, int i10, Context context, int i11, boolean z4, org.telegram.ui.ActionBar.p2 p2Var) {
        this.f18240e = cvVar;
        this.f18239c = i10;
        this.f18241f = context;
        this.d = i11;
        this.f18238b = z4;
        this.h = p2Var;
    }
}
