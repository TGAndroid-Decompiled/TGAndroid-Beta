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
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.i61;
import org.telegram.ui.av;
import org.telegram.ui.bv;
import org.telegram.ui.dv;
import org.telegram.ui.zn;
public final class v7 implements Runnable {
    public final int f19440a = 0;
    public final boolean f19441b;
    public final int f19442c;
    public final int d;
    public final Object f19443e;
    public final Object f19444f;
    public final Object h;

    public v7(MediaDataController mediaDataController, int i10, TLObject tLObject, org.telegram.ui.ActionBar.m2 m2Var, boolean z10, int i11) {
        this.f19443e = mediaDataController;
        this.f19442c = i10;
        this.f19444f = tLObject;
        this.h = m2Var;
        this.f19441b = z10;
        this.d = i11;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.sc scVar;
        int i10;
        int i11;
        int i12;
        Activity activity;
        dk0 dk0Var;
        float f7;
        int i13 = this.f19440a;
        boolean z10 = this.f19441b;
        int i14 = this.d;
        int i15 = this.f19442c;
        Window window = null;
        Object obj = this.h;
        Object obj2 = this.f19444f;
        Object obj3 = this.f19443e;
        switch (i13) {
            case 0:
                ((MediaDataController) obj3).lambda$toggleStickerSets$118(this.f19442c, (TLObject) obj2, (org.telegram.ui.ActionBar.m2) obj, this.f19441b, this.d);
                return;
            case 1:
                ((SendMessagesHelper) obj3).lambda$performSendMessageRequest$102(this.f19441b, (TLRPC.Message) obj2, this.f19442c, (ArrayList) obj, this.d);
                return;
            case 2:
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                zn znVar = ((org.telegram.ui.ol) obj3).f40597b;
                if (z10) {
                    i10 = ((org.telegram.ui.ActionBar.m2) znVar).currentAccount;
                    MessagesController.getNotificationsSettings(i10).edit().remove("pin_" + znVar.T5).commit();
                    znVar.Cc(0, true);
                    scVar = null;
                } else {
                    scVar = null;
                    znVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(znVar.T5), arrayList, Boolean.TRUE, arrayList2, null, 0, Integer.valueOf(i15), Boolean.valueOf(znVar.S4));
                }
                if (i14 == znVar.C3) {
                    znVar.A3 = scVar;
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.qa qaVar = (org.telegram.ui.Components.qa) obj3;
                Bitmap bitmap = (Bitmap) obj2;
                String str = (String) obj;
                Paint paint = qaVar.f30217c;
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
                    AndroidUtilities.runOnUIThread(new ci.t1(qaVar, str, createBitmap, this.f19441b, bitmap));
                    return;
                }
                return;
            default:
                bv bvVar = (bv) obj3;
                Context context = (Context) obj2;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj;
                dv dvVar = bvVar.f36496c;
                dvVar.b();
                org.telegram.ui.Cells.r8 r8Var = dvVar.f37141e;
                dvVar.d();
                int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q6, false);
                dk0 dk0Var2 = dvVar.d;
                dk0Var2.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new i61(bvVar, i15, x02));
                ofFloat.addListener(new org.telegram.ui.t0(bvVar, x02, 1));
                ofFloat.setDuration(350L);
                ofFloat.start();
                int x03 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20766a7, false);
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
                        i14 = dvVar.f37143n;
                    }
                    int i20 = i14;
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    dvVar.h = ofFloat2;
                    if (z10) {
                        f7 = 50.0f;
                    } else {
                        f7 = 200.0f;
                    }
                    float f15 = f7;
                    dk0Var = dk0Var2;
                    ofFloat2.addUpdateListener(new av(bvVar, f15, i20, x03, activity));
                    dvVar.h.addListener(new org.telegram.ui.t0(activity, x03, 2));
                    dvVar.h.setDuration(350L);
                    dvVar.h.start();
                } else {
                    dk0Var = dk0Var2;
                }
                if (org.telegram.ui.ActionBar.h6.g1()) {
                    r8Var.n(LocaleController.getString(R.string.SettingsSwitchToNightMode), dk0Var, true);
                } else {
                    r8Var.n(LocaleController.getString(R.string.SettingsSwitchToDayMode), dk0Var, true);
                }
                org.telegram.ui.ActionBar.h6.G1(m2Var);
                return;
        }
    }

    public v7(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.Message message, int i10, ArrayList arrayList, int i11) {
        this.f19443e = sendMessagesHelper;
        this.f19441b = z10;
        this.f19444f = message;
        this.f19442c = i10;
        this.h = arrayList;
        this.d = i11;
    }

    public v7(org.telegram.ui.ol olVar, boolean z10, ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        this.f19443e = olVar;
        this.f19441b = z10;
        this.f19444f = arrayList;
        this.h = arrayList2;
        this.f19442c = i10;
        this.d = i11;
    }

    public v7(org.telegram.ui.Components.qa qaVar, Bitmap bitmap, int i10, int i11, String str, boolean z10) {
        this.f19443e = qaVar;
        this.f19444f = bitmap;
        this.f19442c = i10;
        this.d = i11;
        this.h = str;
        this.f19441b = z10;
    }

    public v7(bv bvVar, int i10, Context context, int i11, boolean z10, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f19443e = bvVar;
        this.f19442c = i10;
        this.f19444f = context;
        this.d = i11;
        this.f19441b = z10;
        this.h = m2Var;
    }
}
