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
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.su;
import org.telegram.ui.tn;
import org.telegram.ui.tu;
import org.telegram.ui.uu;
public final class a8 implements Runnable {
    public final int f19680a = 0;
    public final boolean f19681b;
    public final int f19682c;
    public final int d;
    public final Object f19683e;
    public final Object f19684f;
    public final Object h;

    public a8(MediaDataController mediaDataController, int i10, TLObject tLObject, org.telegram.ui.ActionBar.o2 o2Var, boolean z10, int i11) {
        this.f19683e = mediaDataController;
        this.f19682c = i10;
        this.f19684f = tLObject;
        this.h = o2Var;
        this.f19681b = z10;
        this.d = i11;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.mc mcVar;
        int i10;
        int i11;
        int i12;
        Activity activity;
        xi0 xi0Var;
        float f9;
        int i13 = this.f19680a;
        boolean z10 = this.f19681b;
        int i14 = this.d;
        int i15 = this.f19682c;
        Window window = null;
        Object obj = this.h;
        Object obj2 = this.f19684f;
        Object obj3 = this.f19683e;
        switch (i13) {
            case 0:
                ((MediaDataController) obj3).lambda$toggleStickerSets$118(this.f19682c, (TLObject) obj2, (org.telegram.ui.ActionBar.o2) obj, this.f19681b, this.d);
                return;
            case 1:
                ((SendMessagesHelper) obj3).lambda$performSendMessageRequest$99(this.f19681b, (TLRPC.Message) obj2, this.f19682c, (ArrayList) obj, this.d);
                return;
            case 2:
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                tn tnVar = ((org.telegram.ui.el) obj3).f37860b;
                if (z10) {
                    i10 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
                    MessagesController.getNotificationsSettings(i10).edit().remove("pin_" + tnVar.P5).commit();
                    tnVar.yc(0, true);
                    mcVar = null;
                } else {
                    mcVar = null;
                    tnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(tnVar.P5), arrayList, Boolean.TRUE, arrayList2, null, 0, Integer.valueOf(i15), Boolean.valueOf(tnVar.O4));
                }
                if (i14 == tnVar.f43041y3) {
                    tnVar.f43016w3 = mcVar;
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.la laVar = (org.telegram.ui.Components.la) obj3;
                Bitmap bitmap = (Bitmap) obj2;
                String str = (String) obj;
                Paint paint = laVar.f30267c;
                int i16 = laVar.d;
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
                    AndroidUtilities.runOnUIThread(new eg.j(laVar, str, createBitmap, this.f19681b, bitmap, 14));
                    return;
                }
                return;
            default:
                tu tuVar = (tu) obj3;
                Context context = (Context) obj2;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
                uu uuVar = tuVar.f43098c;
                uuVar.b();
                org.telegram.ui.Cells.m8 m8Var = uuVar.f43345e;
                uuVar.d();
                int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q6, false);
                xi0 xi0Var2 = uuVar.d;
                xi0Var2.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new o41(tuVar, i15, w02));
                ofFloat.addListener(new org.telegram.ui.x0(tuVar, w02, 1));
                ofFloat.setDuration(350L);
                ofFloat.start();
                int w03 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23009a7, false);
                if (context instanceof Activity) {
                    activity = (Activity) context;
                } else {
                    activity = null;
                }
                if (activity != null) {
                    window = activity.getWindow();
                }
                if (window != null) {
                    ValueAnimator valueAnimator = uuVar.h;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        uuVar.h.cancel();
                    }
                    ValueAnimator valueAnimator2 = uuVar.h;
                    if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                        i14 = uuVar.f43347n;
                    }
                    int i20 = i14;
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    uuVar.h = ofFloat2;
                    if (z10) {
                        f9 = 50.0f;
                    } else {
                        f9 = 200.0f;
                    }
                    xi0Var = xi0Var2;
                    ofFloat2.addUpdateListener(new su(tuVar, f9, i20, w03, activity));
                    uuVar.h.addListener(new org.telegram.ui.x0(activity, w03, 2));
                    uuVar.h.setDuration(350L);
                    uuVar.h.start();
                } else {
                    xi0Var = xi0Var2;
                }
                if (org.telegram.ui.ActionBar.g6.f1()) {
                    m8Var.n(LocaleController.getString(R.string.SettingsSwitchToNightMode), xi0Var, true);
                } else {
                    m8Var.n(LocaleController.getString(R.string.SettingsSwitchToDayMode), xi0Var, true);
                }
                org.telegram.ui.ActionBar.g6.F1(o2Var);
                return;
        }
    }

    public a8(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.Message message, int i10, ArrayList arrayList, int i11) {
        this.f19683e = sendMessagesHelper;
        this.f19681b = z10;
        this.f19684f = message;
        this.f19682c = i10;
        this.h = arrayList;
        this.d = i11;
    }

    public a8(org.telegram.ui.el elVar, boolean z10, ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        this.f19683e = elVar;
        this.f19681b = z10;
        this.f19684f = arrayList;
        this.h = arrayList2;
        this.f19682c = i10;
        this.d = i11;
    }

    public a8(org.telegram.ui.Components.la laVar, Bitmap bitmap, int i10, int i11, String str, boolean z10) {
        this.f19683e = laVar;
        this.f19684f = bitmap;
        this.f19682c = i10;
        this.d = i11;
        this.h = str;
        this.f19681b = z10;
    }

    public a8(tu tuVar, int i10, Context context, int i11, boolean z10, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f19683e = tuVar;
        this.f19682c = i10;
        this.f19684f = context;
        this.d = i11;
        this.f19681b = z10;
        this.h = o2Var;
    }
}
