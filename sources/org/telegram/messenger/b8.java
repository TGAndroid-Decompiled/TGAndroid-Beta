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
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.cv;
import org.telegram.ui.dv;
import org.telegram.ui.ev;
import org.telegram.ui.zn;
public final class b8 implements Runnable {
    public final int f16813a = 0;
    public final boolean f16814b;
    public final int f16815c;
    public final int d;
    public final Object e;
    public final Object f16816f;
    public final Object h;

    public b8(MediaDataController mediaDataController, int i10, TLObject tLObject, org.telegram.ui.ActionBar.p2 p2Var, boolean z4, int i11) {
        this.e = mediaDataController;
        this.f16815c = i10;
        this.f16816f = tLObject;
        this.h = p2Var;
        this.f16814b = z4;
        this.d = i11;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.ic icVar;
        int i10;
        int i11;
        int i12;
        Activity activity;
        gj0 gj0Var;
        float f10;
        int i13 = this.f16813a;
        boolean z4 = this.f16814b;
        int i14 = this.d;
        int i15 = this.f16815c;
        Window window = null;
        Object obj = this.h;
        Object obj2 = this.f16816f;
        Object obj3 = this.e;
        switch (i13) {
            case 0:
                ((MediaDataController) obj3).lambda$toggleStickerSets$118(this.f16815c, (TLObject) obj2, (org.telegram.ui.ActionBar.p2) obj, this.f16814b, this.d);
                return;
            case 1:
                ((SendMessagesHelper) obj3).lambda$performSendMessageRequest$99(this.f16814b, (TLRPC.Message) obj2, this.f16815c, (ArrayList) obj, this.d);
                return;
            case 2:
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                zn znVar = ((org.telegram.ui.ml) obj3).f36130b;
                if (z4) {
                    i10 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
                    MessagesController.getNotificationsSettings(i10).edit().remove("pin_" + znVar.Q5).commit();
                    znVar.yc(0, true);
                    icVar = null;
                } else {
                    icVar = null;
                    znVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(znVar.Q5), arrayList, Boolean.TRUE, arrayList2, null, 0, Integer.valueOf(i15), Boolean.valueOf(znVar.P4));
                }
                if (i14 == znVar.f40830z3) {
                    znVar.f40803x3 = icVar;
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.ga gaVar = (org.telegram.ui.Components.ga) obj3;
                Bitmap bitmap = (Bitmap) obj2;
                String str = (String) obj;
                Paint paint = gaVar.f25110c;
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
                    AndroidUtilities.runOnUIThread(new gg.j(gaVar, str, createBitmap, this.f16814b, bitmap, 12));
                    return;
                }
                return;
            default:
                dv dvVar = (dv) obj3;
                Context context = (Context) obj2;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj;
                ev evVar = dvVar.f33536c;
                evVar.b();
                org.telegram.ui.Cells.n8 n8Var = evVar.e;
                evVar.d();
                int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20115q6, false);
                gj0 gj0Var2 = evVar.d;
                gj0Var2.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new a51(dvVar, i15, w02));
                ofFloat.addListener(new org.telegram.ui.x0(dvVar, w02, 1));
                ofFloat.setDuration(350L);
                ofFloat.start();
                int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19827a7, false);
                if (context instanceof Activity) {
                    activity = (Activity) context;
                } else {
                    activity = null;
                }
                if (activity != null) {
                    window = activity.getWindow();
                }
                if (window != null) {
                    ValueAnimator valueAnimator = evVar.h;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        evVar.h.cancel();
                    }
                    ValueAnimator valueAnimator2 = evVar.h;
                    if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                        i14 = evVar.f33862n;
                    }
                    int i20 = i14;
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    evVar.h = ofFloat2;
                    if (z4) {
                        f10 = 50.0f;
                    } else {
                        f10 = 200.0f;
                    }
                    gj0Var = gj0Var2;
                    ofFloat2.addUpdateListener(new cv(dvVar, f10, i20, w03, activity));
                    evVar.h.addListener(new org.telegram.ui.x0(activity, w03, 2));
                    evVar.h.setDuration(350L);
                    evVar.h.start();
                } else {
                    gj0Var = gj0Var2;
                }
                if (org.telegram.ui.ActionBar.j6.f1()) {
                    n8Var.n(LocaleController.getString(R.string.SettingsSwitchToNightMode), gj0Var, true);
                } else {
                    n8Var.n(LocaleController.getString(R.string.SettingsSwitchToDayMode), gj0Var, true);
                }
                org.telegram.ui.ActionBar.j6.F1(p2Var);
                return;
        }
    }

    public b8(SendMessagesHelper sendMessagesHelper, boolean z4, TLRPC.Message message, int i10, ArrayList arrayList, int i11) {
        this.e = sendMessagesHelper;
        this.f16814b = z4;
        this.f16816f = message;
        this.f16815c = i10;
        this.h = arrayList;
        this.d = i11;
    }

    public b8(org.telegram.ui.ml mlVar, boolean z4, ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        this.e = mlVar;
        this.f16814b = z4;
        this.f16816f = arrayList;
        this.h = arrayList2;
        this.f16815c = i10;
        this.d = i11;
    }

    public b8(org.telegram.ui.Components.ga gaVar, Bitmap bitmap, int i10, int i11, String str, boolean z4) {
        this.e = gaVar;
        this.f16816f = bitmap;
        this.f16815c = i10;
        this.d = i11;
        this.h = str;
        this.f16814b = z4;
    }

    public b8(dv dvVar, int i10, Context context, int i11, boolean z4, org.telegram.ui.ActionBar.p2 p2Var) {
        this.e = dvVar;
        this.f16815c = i10;
        this.f16816f = context;
        this.d = i11;
        this.f16814b = z4;
        this.h = p2Var;
    }
}
