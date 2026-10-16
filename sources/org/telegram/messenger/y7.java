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
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.fo;
import org.telegram.ui.hv;
import org.telegram.ui.iv;
import org.telegram.ui.kv;
public final class y7 implements Runnable {
    public final int f18773a = 0;
    public final boolean f18774b;
    public final int f18775c;
    public final int d;
    public final Object e;
    public final Object f18776f;
    public final Object h;

    public y7(MediaDataController mediaDataController, int i10, TLObject tLObject, org.telegram.ui.ActionBar.m2 m2Var, boolean z10, int i11) {
        this.e = mediaDataController;
        this.f18775c = i10;
        this.f18776f = tLObject;
        this.h = m2Var;
        this.f18774b = z10;
        this.d = i11;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.sc scVar;
        int i10;
        int i11;
        int i12;
        Activity activity;
        yj0 yj0Var;
        float f7;
        int i13 = this.f18773a;
        boolean z10 = this.f18774b;
        int i14 = this.d;
        int i15 = this.f18775c;
        Window window = null;
        Object obj = this.h;
        Object obj2 = this.f18776f;
        Object obj3 = this.e;
        switch (i13) {
            case 0:
                ((MediaDataController) obj3).lambda$toggleStickerSets$118(this.f18775c, (TLObject) obj2, (org.telegram.ui.ActionBar.m2) obj, this.f18774b, this.d);
                return;
            case 1:
                ((SendMessagesHelper) obj3).lambda$performSendMessageRequest$102(this.f18774b, (TLRPC.Message) obj2, this.f18775c, (ArrayList) obj, this.d);
                return;
            case 2:
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                fo foVar = ((org.telegram.ui.sl) obj3).f39844b;
                if (z10) {
                    i10 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
                    MessagesController.getNotificationsSettings(i10).edit().remove("pin_" + foVar.T5).commit();
                    foVar.Cc(0, true);
                    scVar = null;
                } else {
                    scVar = null;
                    foVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(foVar.T5), arrayList, Boolean.TRUE, arrayList2, null, 0, Integer.valueOf(i15), Boolean.valueOf(foVar.S4));
                }
                if (i14 == foVar.C3) {
                    foVar.A3 = scVar;
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.qa qaVar = (org.telegram.ui.Components.qa) obj3;
                Bitmap bitmap = (Bitmap) obj2;
                String str = (String) obj;
                Paint paint = qaVar.f28253c;
                int i16 = qaVar.d;
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
                    AndroidUtilities.runOnUIThread(new di.t1(qaVar, str, createBitmap, this.f18774b, bitmap));
                    return;
                }
                return;
            default:
                iv ivVar = (iv) obj3;
                Context context = (Context) obj2;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj;
                kv kvVar = ivVar.f36873c;
                kvVar.b();
                org.telegram.ui.Cells.r8 r8Var = kvVar.e;
                kvVar.d();
                int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.q6, false);
                yj0 yj0Var2 = kvVar.d;
                yj0Var2.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new e61(ivVar, i15, x02));
                ofFloat.addListener(new org.telegram.ui.w0(ivVar, x02, 1));
                ofFloat.setDuration(350L);
                ofFloat.start();
                int x03 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19543a7, false);
                if (context instanceof Activity) {
                    activity = (Activity) context;
                } else {
                    activity = null;
                }
                if (activity != null) {
                    window = activity.getWindow();
                }
                if (window != null) {
                    ValueAnimator valueAnimator = kvVar.h;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        kvVar.h.cancel();
                    }
                    ValueAnimator valueAnimator2 = kvVar.h;
                    if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                        i14 = kvVar.f37531n;
                    }
                    int i20 = i14;
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    kvVar.h = ofFloat2;
                    if (z10) {
                        f7 = 50.0f;
                    } else {
                        f7 = 200.0f;
                    }
                    float f15 = f7;
                    yj0Var = yj0Var2;
                    ofFloat2.addUpdateListener(new hv(ivVar, f15, i20, x03, activity));
                    kvVar.h.addListener(new org.telegram.ui.w0(activity, x03, 2));
                    kvVar.h.setDuration(350L);
                    kvVar.h.start();
                } else {
                    yj0Var = yj0Var2;
                }
                if (org.telegram.ui.ActionBar.g6.g1()) {
                    r8Var.n(LocaleController.getString(R.string.SettingsSwitchToNightMode), yj0Var, true);
                } else {
                    r8Var.n(LocaleController.getString(R.string.SettingsSwitchToDayMode), yj0Var, true);
                }
                org.telegram.ui.ActionBar.g6.G1(m2Var);
                return;
        }
    }

    public y7(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.Message message, int i10, ArrayList arrayList, int i11) {
        this.e = sendMessagesHelper;
        this.f18774b = z10;
        this.f18776f = message;
        this.f18775c = i10;
        this.h = arrayList;
        this.d = i11;
    }

    public y7(org.telegram.ui.sl slVar, boolean z10, ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        this.e = slVar;
        this.f18774b = z10;
        this.f18776f = arrayList;
        this.h = arrayList2;
        this.f18775c = i10;
        this.d = i11;
    }

    public y7(org.telegram.ui.Components.qa qaVar, Bitmap bitmap, int i10, int i11, String str, boolean z10) {
        this.e = qaVar;
        this.f18776f = bitmap;
        this.f18775c = i10;
        this.d = i11;
        this.h = str;
        this.f18774b = z10;
    }

    public y7(iv ivVar, int i10, Context context, int i11, boolean z10, org.telegram.ui.ActionBar.m2 m2Var) {
        this.e = ivVar;
        this.f18775c = i10;
        this.f18776f = context;
        this.d = i11;
        this.f18774b = z10;
        this.h = m2Var;
    }
}
