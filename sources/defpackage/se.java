package defpackage;

import android.appwidget.AppWidgetManager;
import android.graphics.Bitmap;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
public final class se implements Runnable {
    public final byte a;
    public final ArrayList b;

    public se(ArrayList arrayList, byte b) {
        this.a = b;
        this.b = arrayList;
    }

    @Override
    public final void run() {
        e Q;
        uo3 uo3Var;
        byte b = this.a;
        int i = 0;
        ArrayList arrayList = this.b;
        switch (b) {
            case 0:
                if (arrayList != null && (Q = LaunchActivity.Q()) != 0) {
                    ?? obj = new Object();
                    obj.a = true;
                    Q.showAsSheet(new PrivacyControlActivity(11, false), obj);
                    return;
                }
                return;
            case 1:
                break;
            case 2:
                Utilities.e.c(new se(arrayList, (byte) 1));
                return;
            case 3:
                int size = arrayList.size();
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    ((Bitmap) obj2).recycle();
                }
                return;
            case 4:
                vo3 vo3Var = vo3.k;
                vo3Var.getClass();
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    Runnable runnable = (Runnable) arrayList.get(i2);
                    if (runnable != null) {
                        if (!vo3Var.c.isEmpty() && (vo3Var.g / 2 <= vo3Var.c.size() || (vo3Var.a.isEmpty() && vo3Var.e >= vo3Var.d))) {
                            uo3Var = (uo3) vo3Var.c.remove(0);
                        } else if (vo3Var.a.isEmpty()) {
                            uo3Var = new uo3("DispatchQueuePoolThreadSafety_" + vo3Var.f + "_" + Utilities.b.nextInt(), true);
                            uo3Var.setPriority(10);
                            vo3Var.e = vo3Var.e + 1;
                        } else {
                            uo3Var = (uo3) vo3Var.a.remove(0);
                        }
                        if (!vo3Var.h) {
                            Utilities.e.d(vo3Var.i, 30000L);
                            vo3Var.h = true;
                        }
                        vo3Var.g++;
                        vo3Var.c.add(uo3Var);
                        vo3Var.b.put(uo3Var.index, vo3Var.b.get(uo3Var.index, 0) + 1);
                        if (ri5.b) {
                            uo3Var.setPriority(1);
                        } else if (uo3Var.getPriority() != 10) {
                            uo3Var.setPriority(10);
                        }
                        uo3Var.postRunnable(new cv2(vo3Var, runnable, uo3Var, (byte) 13));
                    }
                }
                arrayList.clear();
                hl.c3(new se(arrayList, (byte) 5));
                return;
            case 5:
                vo3.l.add(arrayList);
                return;
            case 6:
                jn7.e().k(259, arrayList);
                return;
            case 7:
                AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(a.b);
                while (i < arrayList.size()) {
                    appWidgetManager.notifyAppWidgetViewDataChanged(((Integer) arrayList.get(i)).intValue(), 2131296478);
                    i++;
                }
                return;
            case 8:
                xv7.h = arrayList;
                xv7.i = false;
                jn7.e().k(335, new Object[0]);
                return;
            default:
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    ((View) arrayList.get(i3)).setVisibility(8);
                    if (arrayList.get(i3) instanceof wb2) {
                        ((wb2) arrayList.get(i3)).m3(false, false);
                        ((wb2) arrayList.get(i3)).o3(false, false, false);
                    }
                }
                return;
        }
        while (i < arrayList.size()) {
            Bitmap bitmap = (Bitmap) ((WeakReference) arrayList.get(i)).get();
            ((WeakReference) arrayList.get(i)).clear();
            if (bitmap != null && !bitmap.isRecycled()) {
                try {
                    bitmap.recycle();
                } catch (Exception e) {
                    cc4.g(e, true);
                }
            }
            i++;
        }
    }
}
