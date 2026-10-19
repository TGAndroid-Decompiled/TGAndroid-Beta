package ki;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.tgnet.TLParseException;
import org.telegram.ui.Components.by0;
import org.telegram.ui.Components.iu;
import org.telegram.ui.eo;
import org.telegram.ui.qn;
import org.telegram.ui.re1;
import org.telegram.ui.web.HttpGetFileTask;
public final class u implements Runnable {
    public final int f15533a;
    public final Object f15534b;

    public u(Object obj, int i10) {
        this.f15533a = i10;
        this.f15534b = obj;
    }

    @Override
    public final void run() {
        long j10;
        switch (this.f15533a) {
            case 0:
                AndroidUtilities.showKeyboard(((x) this.f15534b).f15632e0.f22399b);
                return;
            case 1:
                ((d0) this.f15534b).invalidate();
                return;
            case 2:
                m.s3 s3Var = (m.s3) this.f15534b;
                s3Var.f16336c = null;
                s3Var.d = null;
                s3Var.e = null;
                s3Var.f16337f = null;
                s3Var.e(null);
                return;
            case 3:
                ((a2) this.f15534b).invalidateSelf();
                return;
            case 4:
                ((h2) this.f15534b).c();
                return;
            case 5:
                ((lh.b) this.f15534b).invalidate();
                return;
            case 6:
                mh.c cVar = (mh.c) this.f15534b;
                GroupCallMessage groupCallMessage = cVar.H;
                if (groupCallMessage != null) {
                    cVar.f16927a.a(groupCallMessage.isSendDelayed(), true);
                    cVar.f16928b.a(cVar.H.isSendError(), true);
                    return;
                }
                return;
            case 7:
                n2.d dVar = (n2.d) this.f15534b;
                if (!dVar.f17037c) {
                    n2.h hVar = dVar.f17036b;
                    if (hVar != null) {
                        hVar.a(dVar.f17035a);
                    }
                    dVar.d.f17049x.remove(dVar);
                    dVar.f17037c = true;
                    return;
                }
                return;
            case 8:
                ((n2.b) this.f15534b).a(null);
                return;
            case 9:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, (org.telegram.ui.ActionBar.g6) this.f15534b, Boolean.TRUE, null, -1);
                return;
            case 10:
                ((le.b) this.f15534b).d();
                return;
            case 11:
                re1 re1Var = (re1) this.f15534b;
                if (re1Var.getParentLayout() != null) {
                    re1Var.H = true;
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", re1Var.f41142a);
                    qn qnVar = new qn(bundle);
                    qnVar.f40728ja = true;
                    re1Var.presentFragment(qnVar);
                    return;
                }
                return;
            case 12:
                TLParseException.lambda$doThrowOrLog$0((TLParseException) this.f15534b);
                return;
            case 13:
                org.telegram.ui.Components.voip.l0 l0Var = (org.telegram.ui.Components.voip.l0) this.f15534b;
                l0Var.P0 = null;
                l0Var.setVisibleParticipant(true);
                return;
            case 14:
                org.telegram.ui.Components.voip.h1 h1Var = (org.telegram.ui.Components.voip.h1) this.f15534b;
                h1Var.K = false;
                h1Var.o(false);
                h1Var.W = false;
                return;
            case 15:
                org.telegram.ui.Components.voip.h1 h1Var2 = (org.telegram.ui.Components.voip.h1) ((mg.b) this.f15534b).f16858b;
                h1Var2.e.invalidate();
                if (!h1Var2.e.isInLayout()) {
                    h1Var2.e.requestLayout();
                    h1Var2.d.requestLayout();
                    h1Var2.f31494f.requestLayout();
                    return;
                }
                return;
            case 16:
                ((org.telegram.ui.Components.voip.g1) this.f15534b).f31470a.i(false);
                return;
            case 17:
                org.telegram.ui.Components.voip.f2 f2Var = (org.telegram.ui.Components.voip.f2) this.f15534b;
                f2Var.e = false;
                HashMap hashMap = f2Var.f31457a;
                ArrayList arrayList = f2Var.f31459c;
                ArrayList arrayList2 = f2Var.f31458b;
                if (!arrayList2.isEmpty() || !arrayList.isEmpty()) {
                    if (f2Var.getParent() != null) {
                        TransitionManager.beginDelayedTransition(f2Var, f2Var.d);
                    }
                    int i10 = 0;
                    while (i10 < arrayList2.size()) {
                        org.telegram.ui.Components.voip.e2 e2Var = (org.telegram.ui.Components.voip.e2) arrayList2.get(i10);
                        int i11 = 0;
                        while (true) {
                            if (i11 >= arrayList.size()) {
                                break;
                            } else if (e2Var.f31445a.equals(((org.telegram.ui.Components.voip.e2) arrayList.get(i11)).f31445a)) {
                                arrayList2.remove(i10);
                                arrayList.remove(i11);
                                i10--;
                            } else {
                                i11++;
                            }
                        }
                        i10++;
                    }
                    for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                        f2Var.addView((View) arrayList2.get(i12), w7.z5.t(-2, -2, 1, 4, 0, 0, 4));
                    }
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        f2Var.removeView((View) arrayList.get(i13));
                    }
                    hashMap.clear();
                    for (int i14 = 0; i14 < f2Var.getChildCount(); i14++) {
                        org.telegram.ui.Components.voip.e2 e2Var2 = (org.telegram.ui.Components.voip.e2) f2Var.getChildAt(i14);
                        hashMap.put(e2Var2.f31445a, e2Var2);
                    }
                    arrayList2.clear();
                    arrayList.clear();
                    f2Var.e = true;
                    AndroidUtilities.runOnUIThread(new u(f2Var, 17), 700L);
                    Runnable runnable = f2Var.h;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 18:
                TextView[] textViewArr = ((org.telegram.ui.Components.voip.n2) this.f15534b).f31632a;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 19:
                TextView[] textViewArr2 = ((org.telegram.ui.Components.voip.n2) ((hg.j0) this.f15534b).e).f31632a;
                TextView textView2 = textViewArr2[0];
                textViewArr2[0] = textViewArr2[1];
                textViewArr2[1] = textView2;
                return;
            case 20:
                org.telegram.ui.Components.voip.r2 r2Var = (org.telegram.ui.Components.voip.r2) this.f15534b;
                if (r2Var.getVisibility() == 0) {
                    r2Var.a();
                    return;
                }
                return;
            case 21:
                org.telegram.ui.Components.voip.v2 v2Var = (org.telegram.ui.Components.voip.v2) this.f15534b;
                v2Var.e = Bitmap.createBitmap(v2Var.getMeasuredWidth(), v2Var.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                new Canvas(v2Var.e).drawText(v2Var.d, v2Var.getMeasuredWidth() / 2, (int) ((v2Var.getMeasuredHeight() / 2) - ((v2Var.f31844a.ascent() + v2Var.f31844a.descent()) / 2.0f)), v2Var.f31844a);
                v2Var.postInvalidate();
                return;
            case 22:
                ((org.telegram.ui.web.k) this.f15534b).f42695w.W2.N(true);
                return;
            case 23:
                org.telegram.ui.web.i iVar = ((org.telegram.ui.web.o) this.f15534b).f42733s.e;
                if (iVar != null) {
                    iVar.d();
                    return;
                }
                return;
            case 24:
                ((iu) this.f15534b).requestFocus();
                return;
            case 25:
                pf.d.r(((org.telegram.ui.web.t0) this.f15534b).f42778b.e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 26:
                org.telegram.ui.web.e1 e1Var = (org.telegram.ui.web.e1) this.f15534b;
                Utilities.searchQueue.postRunnable(new by0(e1Var, new ArrayList(e1Var.f42621s.e), e1Var.f42621s.f42628n));
                return;
            case 27:
                HttpGetFileTask.a((HttpGetFileTask) this.f15534b);
                return;
            case 28:
                ((org.telegram.ui.Cells.o1) this.f15534b).invalidateSelf();
                return;
            default:
                org.telegram.ui.web.x1 x1Var = (org.telegram.ui.web.x1) this.f15534b;
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
                    j10 += org.telegram.ui.web.x1.Z(file, Boolean.FALSE);
                }
                File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                if (file2.exists()) {
                    j10 += org.telegram.ui.web.x1.Z(file2, null);
                }
                File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                if (file3.exists()) {
                    j11 = org.telegram.ui.web.x1.Z(file3, Boolean.TRUE);
                }
                AndroidUtilities.runOnUIThread(new eo(x1Var, j10, j11, 1));
                return;
        }
    }
}
