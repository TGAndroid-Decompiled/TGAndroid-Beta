package org.telegram.messenger;

import android.appwidget.AppWidgetManager;
import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
public final class k implements Runnable {
    public final int f24959a;
    public final ArrayList f24960b;

    public k(int i7, ArrayList arrayList) {
        this.f24959a = i7;
        this.f24960b = arrayList;
    }

    @Override
    public final void run() {
        r5 r5Var;
        int i7 = 0;
        switch (this.f24959a) {
            case 0:
                ArrayList arrayList = this.f24960b;
                while (i7 < arrayList.size()) {
                    Bitmap bitmap = (Bitmap) ((WeakReference) arrayList.get(i7)).get();
                    ((WeakReference) arrayList.get(i7)).clear();
                    if (bitmap != null && !bitmap.isRecycled()) {
                        try {
                            bitmap.recycle();
                        } catch (Exception e10) {
                            a8.g(e10, true);
                        }
                    }
                    i7++;
                }
                return;
            case 1:
                Utilities.f22782e.c(new k(0, this.f24960b));
                return;
            case 2:
                ArrayList arrayList2 = this.f24960b;
                s5 s5Var = s5.f26738k;
                s5Var.getClass();
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    Runnable runnable = (Runnable) arrayList2.get(i10);
                    if (runnable != null) {
                        if (!s5Var.f26743c.isEmpty() && (s5Var.f26746g / 2 <= s5Var.f26743c.size() || (s5Var.f26741a.isEmpty() && s5Var.f26744e >= s5Var.d))) {
                            r5Var = (r5) s5Var.f26743c.remove(0);
                        } else if (s5Var.f26741a.isEmpty()) {
                            r5Var = new r5("DispatchQueuePoolThreadSafety_" + s5Var.f26745f + "_" + Utilities.f22780b.nextInt(), true);
                            r5Var.setPriority(10);
                            s5Var.f26744e = s5Var.f26744e + 1;
                        } else {
                            r5Var = (r5) s5Var.f26741a.remove(0);
                        }
                        if (!s5Var.h) {
                            Utilities.f22782e.d(s5Var.f26747i, 30000L);
                            s5Var.h = true;
                        }
                        s5Var.f26746g++;
                        s5Var.f26743c.add(r5Var);
                        s5Var.f26742b.put(r5Var.index, s5Var.f26742b.get(r5Var.index, 0) + 1);
                        if (ch.f0.f5354b) {
                            r5Var.setPriority(1);
                        } else if (r5Var.getPriority() != 10) {
                            r5Var.setPriority(10);
                        }
                        r5Var.postRunnable(new yf(s5Var, runnable, r5Var, 17));
                    }
                }
                arrayList2.clear();
                g0.g3(new k(3, arrayList2));
                return;
            case 3:
                s5.f26739l.add(this.f24960b);
                return;
            case 4:
                ArrayList arrayList3 = this.f24960b;
                AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(t0.f26915b);
                while (i7 < arrayList3.size()) {
                    appWidgetManager.notifyAppWidgetViewDataChanged(((Integer) arrayList3.get(i7)).intValue(), 2131296476);
                    i7++;
                }
                return;
            default:
                ks.e().k(257, this.f24960b);
                return;
        }
    }
}
