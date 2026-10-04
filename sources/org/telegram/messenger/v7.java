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
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.y51;
import org.telegram.ui.cv;
import org.telegram.ui.dv;
import org.telegram.ui.fv;
import org.telegram.ui.yn;
public final class v7 implements Runnable {
    public final int f19390a = 0;
    public final boolean f19391b;
    public final int f19392c;
    public final int d;
    public final Object f19393e;
    public final Object f19394f;
    public final Object h;

    public v7(MediaDataController mediaDataController, int i10, TLObject tLObject, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, int i11) {
        this.f19393e = mediaDataController;
        this.f19392c = i10;
        this.f19394f = tLObject;
        this.h = n2Var;
        this.f19391b = z10;
        this.d = i11;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.rc rcVar;
        int i10;
        int i11;
        int i12;
        Activity activity;
        kj0 kj0Var;
        float f7;
        int i13 = this.f19390a;
        boolean z10 = this.f19391b;
        int i14 = this.d;
        int i15 = this.f19392c;
        Window window = null;
        Object obj = this.h;
        Object obj2 = this.f19394f;
        Object obj3 = this.f19393e;
        switch (i13) {
            case 0:
                ((MediaDataController) obj3).lambda$toggleStickerSets$118(this.f19392c, (TLObject) obj2, (org.telegram.ui.ActionBar.n2) obj, this.f19391b, this.d);
                return;
            case 1:
                ((SendMessagesHelper) obj3).lambda$performSendMessageRequest$99(this.f19391b, (TLRPC.Message) obj2, this.f19392c, (ArrayList) obj, this.d);
                return;
            case 2:
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                yn ynVar = ((org.telegram.ui.jl) obj3).f37716b;
                if (z10) {
                    i10 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
                    MessagesController.getNotificationsSettings(i10).edit().remove("pin_" + ynVar.R5).commit();
                    ynVar.xc(0, true);
                    rcVar = null;
                } else {
                    rcVar = null;
                    ynVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(ynVar.R5), arrayList, Boolean.TRUE, arrayList2, null, 0, Integer.valueOf(i15), Boolean.valueOf(ynVar.Q4));
                }
                if (i14 == ynVar.A3) {
                    ynVar.y3 = rcVar;
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.pa paVar = (org.telegram.ui.Components.pa) obj3;
                Bitmap bitmap = (Bitmap) obj2;
                String str = (String) obj;
                Paint paint = paVar.f29579c;
                int i16 = paVar.d;
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
                    AndroidUtilities.runOnUIThread(new ci.u1(paVar, str, createBitmap, this.f19391b, bitmap));
                    return;
                }
                return;
            default:
                dv dvVar = (dv) obj3;
                Context context = (Context) obj2;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                fv fvVar = dvVar.f35842c;
                fvVar.b();
                org.telegram.ui.Cells.r8 r8Var = fvVar.f36400e;
                fvVar.d();
                int w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.q6, false);
                kj0 kj0Var2 = fvVar.d;
                kj0Var2.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new y51(dvVar, i15, w02));
                ofFloat.addListener(new org.telegram.ui.u0(dvVar, w02, 1));
                ofFloat.setDuration(350L);
                ofFloat.start();
                int w03 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20762a7, false);
                if (context instanceof Activity) {
                    activity = (Activity) context;
                } else {
                    activity = null;
                }
                if (activity != null) {
                    window = activity.getWindow();
                }
                if (window != null) {
                    ValueAnimator valueAnimator = fvVar.h;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        fvVar.h.cancel();
                    }
                    ValueAnimator valueAnimator2 = fvVar.h;
                    if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                        i14 = fvVar.f36402n;
                    }
                    int i20 = i14;
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    fvVar.h = ofFloat2;
                    if (z10) {
                        f7 = 50.0f;
                    } else {
                        f7 = 200.0f;
                    }
                    kj0Var = kj0Var2;
                    ofFloat2.addUpdateListener(new cv(dvVar, f7, i20, w03, activity));
                    fvVar.h.addListener(new org.telegram.ui.u0(activity, w03, 2));
                    fvVar.h.setDuration(350L);
                    fvVar.h.start();
                } else {
                    kj0Var = kj0Var2;
                }
                if (org.telegram.ui.ActionBar.i6.f1()) {
                    r8Var.n(LocaleController.getString(R.string.SettingsSwitchToNightMode), kj0Var, true);
                } else {
                    r8Var.n(LocaleController.getString(R.string.SettingsSwitchToDayMode), kj0Var, true);
                }
                org.telegram.ui.ActionBar.i6.F1(n2Var);
                return;
        }
    }

    public v7(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.Message message, int i10, ArrayList arrayList, int i11) {
        this.f19393e = sendMessagesHelper;
        this.f19391b = z10;
        this.f19394f = message;
        this.f19392c = i10;
        this.h = arrayList;
        this.d = i11;
    }

    public v7(org.telegram.ui.jl jlVar, boolean z10, ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        this.f19393e = jlVar;
        this.f19391b = z10;
        this.f19394f = arrayList;
        this.h = arrayList2;
        this.f19392c = i10;
        this.d = i11;
    }

    public v7(org.telegram.ui.Components.pa paVar, Bitmap bitmap, int i10, int i11, String str, boolean z10) {
        this.f19393e = paVar;
        this.f19394f = bitmap;
        this.f19392c = i10;
        this.d = i11;
        this.h = str;
        this.f19391b = z10;
    }

    public v7(dv dvVar, int i10, Context context, int i11, boolean z10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f19393e = dvVar;
        this.f19392c = i10;
        this.f19394f = context;
        this.d = i11;
        this.f19391b = z10;
        this.h = n2Var;
    }
}
