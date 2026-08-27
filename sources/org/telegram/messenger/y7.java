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
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.rn;
import org.telegram.ui.uu;
import org.telegram.ui.vu;
import org.telegram.ui.wu;

public final class y7 implements Runnable {

    public final int f22205a = 0;

    public final boolean f22206b;

    public final int f22207c;
    public final int d;

    public final Object f22208e;

    public final Object f22209f;
    public final Object h;

    public y7(MediaDataController mediaDataController, int i10, TLObject tLObject, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, int i11) {
        this.f22208e = mediaDataController;
        this.f22207c = i10;
        this.f22209f = tLObject;
        this.h = n2Var;
        this.f22206b = z10;
        this.d = i11;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.ec ecVar;
        int i10;
        int i11;
        int i12 = this.f22205a;
        boolean z10 = this.f22206b;
        int i13 = this.d;
        int i14 = this.f22207c;
        int i15 = 2;
        int i16 = 1;
        Object obj = this.h;
        Object obj2 = this.f22209f;
        Object obj3 = this.f22208e;
        switch (i12) {
            case 0:
                ((MediaDataController) obj3).lambda$toggleStickerSets$118(this.f22207c, (TLObject) obj2, (org.telegram.ui.ActionBar.n2) obj, this.f22206b, this.d);
                break;
            case 1:
                ((SendMessagesHelper) obj3).lambda$performSendMessageRequest$99(this.f22206b, (TLRPC.Message) obj2, this.f22207c, (ArrayList) obj, this.d);
                break;
            case 2:
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                rn rnVar = ((org.telegram.ui.dl) obj3).f37436b;
                if (z10) {
                    MessagesController.getNotificationsSettings(((org.telegram.ui.ActionBar.n2) rnVar).currentAccount).edit().remove("pin_" + rnVar.P5).commit();
                    rnVar.yc(0, true);
                    ecVar = null;
                } else {
                    ecVar = null;
                    rnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(rnVar.P5), arrayList, Boolean.TRUE, arrayList2, null, 0, Integer.valueOf(i14), Boolean.valueOf(rnVar.O4));
                }
                if (i13 == rnVar.f42280y3) {
                    rnVar.f42255w3 = ecVar;
                }
                break;
            case 3:
                org.telegram.ui.Components.ea eaVar = (org.telegram.ui.Components.ea) obj3;
                Bitmap bitmap = (Bitmap) obj2;
                String str = (String) obj;
                Paint paint = eaVar.f28000c;
                int i17 = eaVar.d;
                if (bitmap != null && !bitmap.isRecycled()) {
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    int iRound = (int) Math.round(Math.sqrt(width * 324.0f));
                    int iRound2 = (int) Math.round(Math.sqrt(324.0f / width));
                    if (i14 == 90 || i14 == 270) {
                        i10 = iRound2;
                        i11 = iRound;
                    } else {
                        i11 = iRound2;
                        i10 = iRound;
                    }
                    int i18 = i17 * 2;
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i18 + i10, i18 + i11, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                    int i19 = i17 + iRound;
                    int i20 = i17 + iRound2;
                    Rect rect2 = new Rect(i17, i17, i19, i20);
                    float f10 = i17;
                    canvas.translate((i10 / 2.0f) + f10, (i11 / 2.0f) + f10);
                    if (i13 == 1) {
                        canvas.scale(-1.0f, 1.0f);
                    } else if (i13 == 2) {
                        canvas.scale(1.0f, -1.0f);
                    }
                    canvas.rotate(i14);
                    float f11 = -i17;
                    canvas.translate(f11 - (iRound / 2.0f), f11 - (iRound2 / 2.0f));
                    try {
                        canvas.drawBitmap(bitmap, rect, rect2, (Paint) null);
                        break;
                    } catch (Exception unused) {
                    }
                    Utilities.stackBlurBitmap(bitmapCreateBitmap, 6);
                    if (i17 > 0) {
                        float f12 = i19;
                        canvas.drawRect(0.0f, 0.0f, f12, f10, paint);
                        float f13 = i20;
                        canvas.drawRect(0.0f, f10, f10, f13, paint);
                        float f14 = i19 + i17;
                        canvas.drawRect(f12, f10, f14, f13, paint);
                        canvas.drawRect(0.0f, f13, f14, i20 + i17, paint);
                    }
                    AndroidUtilities.runOnUIThread(new cg.j(eaVar, str, bitmapCreateBitmap, this.f22206b, bitmap, 14));
                    break;
                }
                break;
            default:
                vu vuVar = (vu) obj3;
                Context context = (Context) obj2;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                wu wuVar = vuVar.f43524c;
                wuVar.b();
                org.telegram.ui.Cells.l8 l8Var = wuVar.f44191e;
                wuVar.d();
                int iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q6, false);
                oi0 oi0Var = wuVar.d;
                oi0Var.setColorFilter(new PorterDuffColorFilter(iW0, PorterDuff.Mode.SRC_IN));
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.addUpdateListener(new f41(vuVar, i14, iW0));
                valueAnimatorOfFloat.addListener(new org.telegram.ui.x0(vuVar, iW0, i16));
                valueAnimatorOfFloat.setDuration(350L);
                valueAnimatorOfFloat.start();
                int iW1 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f22999a7, false);
                Activity activity = context instanceof Activity ? (Activity) context : null;
                if ((activity != null ? activity.getWindow() : null) != null) {
                    ValueAnimator valueAnimator = wuVar.h;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        wuVar.h.cancel();
                    }
                    ValueAnimator valueAnimator2 = wuVar.h;
                    if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                        i13 = wuVar.f44193n;
                    }
                    int i21 = i13;
                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    wuVar.h = valueAnimatorOfFloat2;
                    valueAnimatorOfFloat2.addUpdateListener(new uu(vuVar, z10 ? 50.0f : 200.0f, i21, iW1, activity));
                    wuVar.h.addListener(new org.telegram.ui.x0(activity, iW1, i15));
                    wuVar.h.setDuration(350L);
                    wuVar.h.start();
                }
                if (org.telegram.ui.ActionBar.g6.f1()) {
                    l8Var.n(LocaleController.getString(R.string.SettingsSwitchToNightMode), oi0Var, true);
                } else {
                    l8Var.n(LocaleController.getString(R.string.SettingsSwitchToDayMode), oi0Var, true);
                }
                org.telegram.ui.ActionBar.g6.F1(n2Var);
                break;
        }
    }

    public y7(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.Message message, int i10, ArrayList arrayList, int i11) {
        this.f22208e = sendMessagesHelper;
        this.f22206b = z10;
        this.f22209f = message;
        this.f22207c = i10;
        this.h = arrayList;
        this.d = i11;
    }

    public y7(org.telegram.ui.dl dlVar, boolean z10, ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        this.f22208e = dlVar;
        this.f22206b = z10;
        this.f22209f = arrayList;
        this.h = arrayList2;
        this.f22207c = i10;
        this.d = i11;
    }

    public y7(org.telegram.ui.Components.ea eaVar, Bitmap bitmap, int i10, int i11, String str, boolean z10) {
        this.f22208e = eaVar;
        this.f22209f = bitmap;
        this.f22207c = i10;
        this.d = i11;
        this.h = str;
        this.f22206b = z10;
    }

    public y7(vu vuVar, int i10, Context context, int i11, boolean z10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f22208e = vuVar;
        this.f22207c = i10;
        this.f22209f = context;
        this.d = i11;
        this.f22206b = z10;
        this.h = n2Var;
    }
}
