package defpackage;

import android.appwidget.AppWidgetManager;
import android.graphics.Bitmap;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.ui.ActionBar.d;
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
        d Q;
        do3 do3Var;
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
                eo3 eo3Var = eo3.k;
                eo3Var.getClass();
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    Runnable runnable = (Runnable) arrayList.get(i2);
                    if (runnable != null) {
                        if (!eo3Var.c.isEmpty() && (eo3Var.g / 2 <= eo3Var.c.size() || (eo3Var.a.isEmpty() && eo3Var.e >= eo3Var.d))) {
                            do3Var = (do3) eo3Var.c.remove(0);
                        } else if (eo3Var.a.isEmpty()) {
                            do3Var = new do3("DispatchQueuePoolThreadSafety_" + eo3Var.f + "_" + Utilities.b.nextInt(), true);
                            do3Var.setPriority(10);
                            eo3Var.e = eo3Var.e + 1;
                        } else {
                            do3Var = (do3) eo3Var.a.remove(0);
                        }
                        if (!eo3Var.h) {
                            Utilities.e.d(eo3Var.i, 30000L);
                            eo3Var.h = true;
                        }
                        eo3Var.g++;
                        eo3Var.c.add(do3Var);
                        eo3Var.b.put(do3Var.index, eo3Var.b.get(do3Var.index, 0) + 1);
                        if (pg5.b) {
                            do3Var.setPriority(1);
                        } else if (do3Var.getPriority() != 10) {
                            do3Var.setPriority(10);
                        }
                        do3Var.postRunnable(new mg3(eo3Var, runnable, do3Var, (byte) 9));
                    }
                }
                arrayList.clear();
                gl.d3(new se(arrayList, (byte) 5));
                return;
            case 5:
                eo3.l.add(arrayList);
                return;
            case 6:
                AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(a.b);
                while (i < arrayList.size()) {
                    appWidgetManager.notifyAppWidgetViewDataChanged(((Integer) arrayList.get(i)).intValue(), 2131296478);
                    i++;
                }
                return;
            case 7:
                kk7.e().k(258, arrayList);
                return;
            case 8:
                qs7.h = arrayList;
                qs7.i = false;
                kk7.e().k(334, new Object[0]);
                return;
            default:
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    ((View) arrayList.get(i3)).setVisibility(8);
                    if (arrayList.get(i3) instanceof gb2) {
                        ((gb2) arrayList.get(i3)).m3(false, false);
                        ((gb2) arrayList.get(i3)).o3(false, false, false);
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
                    fa4.g(e, true);
                }
            }
            i++;
        }
    }
}
