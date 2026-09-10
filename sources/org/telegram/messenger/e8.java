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
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.n51;
import org.telegram.ui.eo;
import org.telegram.ui.ev;
import org.telegram.ui.fv;
import org.telegram.ui.hv;
public final class e8 implements Runnable {
    public final int f15064a = 0;
    public final boolean f15065b;
    public final int f15066c;
    public final int d;
    public final Object e;
    public final Object f15067f;
    public final Object h;

    public e8(MediaDataController mediaDataController, int i10, TLObject tLObject, org.telegram.ui.ActionBar.p2 p2Var, boolean z10, int i11) {
        this.e = mediaDataController;
        this.f15066c = i10;
        this.f15067f = tLObject;
        this.h = p2Var;
        this.f15065b = z10;
        this.d = i11;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.pc pcVar;
        int i10;
        int i11;
        int i12;
        Activity activity;
        hj0 hj0Var;
        float f7;
        int i13 = this.f15064a;
        boolean z10 = this.f15065b;
        int i14 = this.d;
        int i15 = this.f15066c;
        Window window = null;
        Object obj = this.h;
        Object obj2 = this.f15067f;
        Object obj3 = this.e;
        switch (i13) {
            case 0:
                ((MediaDataController) obj3).lambda$toggleStickerSets$118(this.f15066c, (TLObject) obj2, (org.telegram.ui.ActionBar.p2) obj, this.f15065b, this.d);
                return;
            case 1:
                ((SendMessagesHelper) obj3).lambda$performSendMessageRequest$99(this.f15065b, (TLRPC.Message) obj2, this.f15066c, (ArrayList) obj, this.d);
                return;
            case 2:
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                eo eoVar = ((org.telegram.ui.pl) obj3).f35862b;
                if (z10) {
                    i10 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
                    MessagesController.getNotificationsSettings(i10).edit().remove("pin_" + eoVar.T5).commit();
                    eoVar.yc(0, true);
                    pcVar = null;
                } else {
                    pcVar = null;
                    eoVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(eoVar.T5), arrayList, Boolean.TRUE, arrayList2, null, 0, Integer.valueOf(i15), Boolean.valueOf(eoVar.S4));
                }
                if (i14 == eoVar.C3) {
                    eoVar.A3 = pcVar;
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.na naVar = (org.telegram.ui.Components.na) obj3;
                Bitmap bitmap = (Bitmap) obj2;
                String str = (String) obj;
                Paint paint = naVar.f25480c;
                int i16 = naVar.d;
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
                    AndroidUtilities.runOnUIThread(new bi.e2(naVar, str, createBitmap, this.f15065b, bitmap));
                    return;
                }
                return;
            default:
                fv fvVar = (fv) obj3;
                Context context = (Context) obj2;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj;
                hv hvVar = fvVar.f32923c;
                hvVar.b();
                org.telegram.ui.Cells.s8 s8Var = hvVar.e;
                hvVar.d();
                int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q6, false);
                hj0 hj0Var2 = hvVar.d;
                hj0Var2.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new n51(fvVar, i15, w02));
                ofFloat.addListener(new org.telegram.ui.u0(fvVar, w02, 1));
                ofFloat.setDuration(350L);
                ofFloat.start();
                int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17872a7, false);
                if (context instanceof Activity) {
                    activity = (Activity) context;
                } else {
                    activity = null;
                }
                if (activity != null) {
                    window = activity.getWindow();
                }
                if (window != null) {
                    ValueAnimator valueAnimator = hvVar.h;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        hvVar.h.cancel();
                    }
                    ValueAnimator valueAnimator2 = hvVar.h;
                    if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                        i14 = hvVar.f33467n;
                    }
                    int i20 = i14;
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    hvVar.h = ofFloat2;
                    if (z10) {
                        f7 = 50.0f;
                    } else {
                        f7 = 200.0f;
                    }
                    hj0Var = hj0Var2;
                    ofFloat2.addUpdateListener(new ev(fvVar, f7, i20, w03, activity));
                    hvVar.h.addListener(new org.telegram.ui.u0(activity, w03, 2));
                    hvVar.h.setDuration(350L);
                    hvVar.h.start();
                } else {
                    hj0Var = hj0Var2;
                }
                if (org.telegram.ui.ActionBar.j6.f1()) {
                    s8Var.n(LocaleController.getString(R.string.SettingsSwitchToNightMode), hj0Var, true);
                } else {
                    s8Var.n(LocaleController.getString(R.string.SettingsSwitchToDayMode), hj0Var, true);
                }
                org.telegram.ui.ActionBar.j6.F1(p2Var);
                return;
        }
    }

    public e8(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.Message message, int i10, ArrayList arrayList, int i11) {
        this.e = sendMessagesHelper;
        this.f15065b = z10;
        this.f15067f = message;
        this.f15066c = i10;
        this.h = arrayList;
        this.d = i11;
    }

    public e8(org.telegram.ui.pl plVar, boolean z10, ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        this.e = plVar;
        this.f15065b = z10;
        this.f15067f = arrayList;
        this.h = arrayList2;
        this.f15066c = i10;
        this.d = i11;
    }

    public e8(org.telegram.ui.Components.na naVar, Bitmap bitmap, int i10, int i11, String str, boolean z10) {
        this.e = naVar;
        this.f15067f = bitmap;
        this.f15066c = i10;
        this.d = i11;
        this.h = str;
        this.f15065b = z10;
    }

    public e8(fv fvVar, int i10, Context context, int i11, boolean z10, org.telegram.ui.ActionBar.p2 p2Var) {
        this.e = fvVar;
        this.f15066c = i10;
        this.f15067f = context;
        this.d = i11;
        this.f15065b = z10;
        this.h = p2Var;
    }
}
