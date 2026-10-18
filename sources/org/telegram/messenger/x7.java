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
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.x51;
import org.telegram.ui.qu;
import org.telegram.ui.ru;
import org.telegram.ui.sn;
import org.telegram.ui.tu;
public final class x7 implements Runnable {
    public final int f20049a = 0;
    public final boolean f20050b;
    public final int f20051c;
    public final int d;
    public final Object e;
    public final Object f20052f;
    public final Object h;

    public x7(MediaDataController mediaDataController, int i10, TLObject tLObject, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, int i11) {
        this.e = mediaDataController;
        this.f20051c = i10;
        this.f20052f = tLObject;
        this.h = n2Var;
        this.f20050b = z10;
        this.d = i11;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.qc qcVar;
        int i10;
        int i11;
        int i12;
        Activity activity;
        uj0 uj0Var;
        float f7;
        int i13 = this.f20049a;
        boolean z10 = this.f20050b;
        int i14 = this.d;
        int i15 = this.f20051c;
        Window window = null;
        Object obj = this.h;
        Object obj2 = this.f20052f;
        Object obj3 = this.e;
        switch (i13) {
            case 0:
                ((MediaDataController) obj3).lambda$toggleStickerSets$118(this.f20051c, (TLObject) obj2, (org.telegram.ui.ActionBar.n2) obj, this.f20050b, this.d);
                return;
            case 1:
                ((SendMessagesHelper) obj3).lambda$performSendMessageRequest$102(this.f20050b, (TLRPC.Message) obj2, this.f20051c, (ArrayList) obj, this.d);
                return;
            case 2:
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                sn snVar = ((org.telegram.ui.hl) obj3).f37554b;
                if (z10) {
                    i10 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
                    MessagesController.getNotificationsSettings(i10).edit().remove("pin_" + snVar.T5).commit();
                    snVar.Cc(0, true);
                    qcVar = null;
                } else {
                    qcVar = null;
                    snVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(snVar.T5), arrayList, Boolean.TRUE, arrayList2, null, 0, Integer.valueOf(i15), Boolean.valueOf(snVar.S4));
                }
                if (i14 == snVar.C3) {
                    snVar.A3 = qcVar;
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.oa oaVar = (org.telegram.ui.Components.oa) obj3;
                Bitmap bitmap = (Bitmap) obj2;
                String str = (String) obj;
                Paint paint = oaVar.f28904c;
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
                    AndroidUtilities.runOnUIThread(new ei.s1(oaVar, str, createBitmap, this.f20050b, bitmap));
                    return;
                }
                return;
            default:
                ru ruVar = (ru) obj3;
                Context context = (Context) obj2;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                tu tuVar = ruVar.f40797c;
                tuVar.b();
                org.telegram.ui.Cells.q8 q8Var = tuVar.e;
                tuVar.d();
                int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q6, false);
                uj0 uj0Var2 = tuVar.d;
                uj0Var2.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new x51(ruVar, i15, x02));
                ofFloat.addListener(new org.telegram.ui.w0(ruVar, x02, 1));
                ofFloat.setDuration(350L);
                ofFloat.start();
                int x03 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20928a7, false);
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
                        i14 = tuVar.f41801n;
                    }
                    int i20 = i14;
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    tuVar.h = ofFloat2;
                    if (z10) {
                        f7 = 50.0f;
                    } else {
                        f7 = 200.0f;
                    }
                    float f15 = f7;
                    uj0Var = uj0Var2;
                    ofFloat2.addUpdateListener(new qu(ruVar, f15, i20, x03, activity));
                    tuVar.h.addListener(new org.telegram.ui.w0(activity, x03, 2));
                    tuVar.h.setDuration(350L);
                    tuVar.h.start();
                } else {
                    uj0Var = uj0Var2;
                }
                if (org.telegram.ui.ActionBar.h6.g1()) {
                    q8Var.n(LocaleController.getString(R.string.SettingsSwitchToNightMode), uj0Var, true);
                } else {
                    q8Var.n(LocaleController.getString(R.string.SettingsSwitchToDayMode), uj0Var, true);
                }
                org.telegram.ui.ActionBar.h6.G1(n2Var);
                return;
        }
    }

    public x7(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.Message message, int i10, ArrayList arrayList, int i11) {
        this.e = sendMessagesHelper;
        this.f20050b = z10;
        this.f20052f = message;
        this.f20051c = i10;
        this.h = arrayList;
        this.d = i11;
    }

    public x7(org.telegram.ui.hl hlVar, boolean z10, ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        this.e = hlVar;
        this.f20050b = z10;
        this.f20052f = arrayList;
        this.h = arrayList2;
        this.f20051c = i10;
        this.d = i11;
    }

    public x7(org.telegram.ui.Components.oa oaVar, Bitmap bitmap, int i10, int i11, String str, boolean z10) {
        this.e = oaVar;
        this.f20052f = bitmap;
        this.f20051c = i10;
        this.d = i11;
        this.h = str;
        this.f20050b = z10;
    }

    public x7(ru ruVar, int i10, Context context, int i11, boolean z10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.e = ruVar;
        this.f20051c = i10;
        this.f20052f = context;
        this.d = i11;
        this.f20050b = z10;
        this.h = n2Var;
    }
}
