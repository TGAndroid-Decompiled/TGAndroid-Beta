package mh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.TextView;
import g7.e6;
import ih.h6;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLParseException;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.mf0;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.ue0;
import org.telegram.ui.Components.z41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.eo;
import org.telegram.ui.web.HttpGetFileTask;
public final class m2 implements Runnable {
    public final int f17985a;
    public final Object f17986b;

    public m2(Object obj, int i9) {
        this.f17985a = i9;
        this.f17986b = obj;
    }

    @Override
    public final void run() {
        long j10;
        switch (this.f17985a) {
            case 0:
                ((AnimationNotificationsLocker) this.f17986b).unlock();
                return;
            case 1:
                f4 f4Var = (f4) this.f17986b;
                f4Var.M = f4Var.f17843r;
                return;
            case 2:
                ((n5.a0) this.f17986b).g();
                return;
            case 3:
                h6 h6Var = ((of.j1) this.f17986b).f19384y;
                if (h6Var != null) {
                    h6Var.p(3, true);
                    return;
                }
                return;
            case 4:
                TLParseException.lambda$doThrowOrLog$0((TLParseException) this.f17986b);
                return;
            case 5:
                org.telegram.ui.Components.voip.k0 k0Var = (org.telegram.ui.Components.voip.k0) this.f17986b;
                k0Var.L0 = null;
                k0Var.setVisibleParticipant(true);
                return;
            case 6:
                org.telegram.ui.Components.voip.g1 g1Var = (org.telegram.ui.Components.voip.g1) this.f17986b;
                g1Var.G = false;
                g1Var.o(false);
                g1Var.S = false;
                return;
            case 7:
                org.telegram.ui.Components.voip.g1 g1Var2 = (org.telegram.ui.Components.voip.g1) ((mf0) this.f17986b).f30809b;
                g1Var2.f33520e.invalidate();
                if (!g1Var2.f33520e.isInLayout()) {
                    g1Var2.f33520e.requestLayout();
                    g1Var2.d.requestLayout();
                    g1Var2.f33521f.requestLayout();
                    return;
                }
                return;
            case 8:
                ((org.telegram.ui.Components.voip.f1) this.f17986b).f33505a.i(false);
                return;
            case 9:
                org.telegram.ui.Components.voip.g2 g2Var = (org.telegram.ui.Components.voip.g2) this.f17986b;
                g2Var.f33531e = false;
                HashMap hashMap = g2Var.f33528a;
                ArrayList arrayList = g2Var.f33530c;
                ArrayList arrayList2 = g2Var.f33529b;
                if (!arrayList2.isEmpty() || !arrayList.isEmpty()) {
                    if (g2Var.getParent() != null) {
                        TransitionManager.beginDelayedTransition(g2Var, g2Var.d);
                    }
                    int i9 = 0;
                    while (i9 < arrayList2.size()) {
                        org.telegram.ui.Components.voip.f2 f2Var = (org.telegram.ui.Components.voip.f2) arrayList2.get(i9);
                        int i10 = 0;
                        while (true) {
                            if (i10 >= arrayList.size()) {
                                break;
                            } else if (f2Var.f33506a.equals(((org.telegram.ui.Components.voip.f2) arrayList.get(i10)).f33506a)) {
                                arrayList2.remove(i9);
                                arrayList.remove(i10);
                                i9--;
                            } else {
                                i10++;
                            }
                        }
                        i9++;
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        g2Var.addView((View) arrayList2.get(i11), e6.t(-2, -2, 1, 4, 0, 0, 4));
                    }
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        g2Var.removeView((View) arrayList.get(i12));
                    }
                    hashMap.clear();
                    for (int i13 = 0; i13 < g2Var.getChildCount(); i13++) {
                        org.telegram.ui.Components.voip.f2 f2Var2 = (org.telegram.ui.Components.voip.f2) g2Var.getChildAt(i13);
                        hashMap.put(f2Var2.f33506a, f2Var2);
                    }
                    arrayList2.clear();
                    arrayList.clear();
                    g2Var.f33531e = true;
                    AndroidUtilities.runOnUIThread(new m2(g2Var, 9), 700L);
                    Runnable runnable = g2Var.h;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                TextView[] textViewArr = ((org.telegram.ui.Components.voip.o2) this.f17986b).f33733a;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 11:
                TextView[] textViewArr2 = ((org.telegram.ui.Components.voip.o2) ((of.h0) this.f17986b).f19361e).f33733a;
                TextView textView2 = textViewArr2[0];
                textViewArr2[0] = textViewArr2[1];
                textViewArr2[1] = textView2;
                return;
            case 12:
                org.telegram.ui.Components.voip.s2 s2Var = (org.telegram.ui.Components.voip.s2) this.f17986b;
                if (s2Var.getVisibility() == 0) {
                    s2Var.a();
                    return;
                }
                return;
            case 13:
                org.telegram.ui.Components.voip.w2 w2Var = (org.telegram.ui.Components.voip.w2) this.f17986b;
                w2Var.f33927e = Bitmap.createBitmap(w2Var.getMeasuredWidth(), w2Var.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                new Canvas(w2Var.f33927e).drawText(w2Var.d, w2Var.getMeasuredWidth() / 2, (int) ((w2Var.getMeasuredHeight() / 2) - ((w2Var.f33924a.ascent() + w2Var.f33924a.descent()) / 2.0f)), w2Var.f33924a);
                w2Var.postInvalidate();
                return;
            case 14:
                ((org.telegram.ui.web.k) this.f17986b).f43913w.U2.N(true);
                return;
            case 15:
                org.telegram.ui.web.i iVar = ((org.telegram.ui.web.n) this.f17986b).h.f43942e;
                if (iVar != null) {
                    iVar.d();
                    return;
                }
                return;
            case 16:
                ((mt) this.f17986b).requestFocus();
                return;
            case 17:
                ve.e.s(((org.telegram.ui.web.r0) this.f17986b).f44006b.f44015e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 18:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) this.f17986b;
                Utilities.searchQueue.postRunnable(new ue0(b1Var, new ArrayList(b1Var.h.f43819e), b1Var.h.f43821n));
                return;
            case 19:
                HttpGetFileTask.a((HttpGetFileTask) this.f17986b);
                return;
            case 20:
                ((org.telegram.ui.Cells.n1) this.f17986b).invalidateSelf();
                return;
            case 21:
                org.telegram.ui.web.u1 u1Var = (org.telegram.ui.web.u1) this.f17986b;
                File databasePath = ApplicationLoader.applicationContext.getDatabasePath("webview.db");
                long j11 = 0;
                if (databasePath != null && databasePath.exists()) {
                    j10 = databasePath.length();
                } else {
                    j10 = 0;
                }
                File databasePath2 = ApplicationLoader.applicationContext.getDatabasePath("webviewCache.db");
                if (databasePath2 != null && databasePath2.exists()) {
                    j10 += databasePath2.length();
                }
                File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                if (file.exists()) {
                    j10 += org.telegram.ui.web.u1.Y(file, Boolean.FALSE);
                }
                File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                if (file2.exists()) {
                    j10 += org.telegram.ui.web.u1.Y(file2, null);
                }
                File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                if (file3.exists()) {
                    j11 = org.telegram.ui.web.u1.Y(file3, Boolean.TRUE);
                }
                AndroidUtilities.runOnUIThread(new eo(u1Var, j10, j11, 1));
                return;
            case 22:
                ((boolean[]) this.f17986b)[0] = true;
                return;
            case 23:
                pf.d dVar = (pf.d) this.f17986b;
                dVar.f45594c.U2.N(true);
                dVar.U(true);
                return;
            case 24:
                AndroidUtilities.addToClipboard(((TL_account.TL_businessChatLink) this.f17986b).link);
                oc.a0(LaunchActivity.R()).k(false).j();
                return;
            case 25:
                pf.g0 g0Var = (pf.g0) this.f17986b;
                z41 z41Var = g0Var.Z;
                if (z41Var != null) {
                    z41Var.N(true);
                }
                g0Var.S(true);
                return;
            case 26:
                pf.m0 m0Var = (pf.m0) ((n2.p) this.f17986b).f18343b;
                m0Var.f45702c.U2.N(true);
                m0Var.a0();
                return;
            case 27:
                pf.o0 o0Var = (pf.o0) this.f17986b;
                o0Var.f45732c.U2.N(true);
                o0Var.U(true);
                return;
            case 28:
                pf.y0 y0Var = (pf.y0) this.f17986b;
                y0Var.f45828a.U2.N(true);
                y0Var.X(true);
                return;
            default:
                ((bg.j1) this.f17986b).run(Boolean.FALSE);
                return;
        }
    }
}
