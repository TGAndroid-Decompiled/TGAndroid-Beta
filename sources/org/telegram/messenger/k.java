package org.telegram.messenger;

import android.appwidget.AppWidgetManager;
import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
public final class k implements Runnable {
    public final int f23778a;
    public final ArrayList f23779b;

    public k(int i3, ArrayList arrayList) {
        this.f23778a = i3;
        this.f23779b = arrayList;
    }

    @Override
    public final void run() {
        q5 q5Var;
        int i3 = 0;
        switch (this.f23778a) {
            case 0:
                ArrayList arrayList = this.f23779b;
                while (i3 < arrayList.size()) {
                    Bitmap bitmap = (Bitmap) ((WeakReference) arrayList.get(i3)).get();
                    ((WeakReference) arrayList.get(i3)).clear();
                    if (bitmap != null && !bitmap.isRecycled()) {
                        try {
                            bitmap.recycle();
                        } catch (Exception e10) {
                            a8.g(e10, true);
                        }
                    }
                    i3++;
                }
                return;
            case 1:
                Utilities.f21387e.c(new k(0, this.f23779b));
                return;
            case 2:
                ArrayList arrayList2 = this.f23779b;
                r5 r5Var = r5.f25074k;
                r5Var.getClass();
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    Runnable runnable = (Runnable) arrayList2.get(i10);
                    if (runnable != null) {
                        if (!r5Var.f25079c.isEmpty() && (r5Var.f25082g / 2 <= r5Var.f25079c.size() || (r5Var.f25077a.isEmpty() && r5Var.f25080e >= r5Var.d))) {
                            q5Var = (q5) r5Var.f25079c.remove(0);
                        } else if (r5Var.f25077a.isEmpty()) {
                            q5Var = new q5("DispatchQueuePoolThreadSafety_" + r5Var.f25081f + "_" + Utilities.f21385b.nextInt(), true);
                            q5Var.setPriority(10);
                            r5Var.f25080e = r5Var.f25080e + 1;
                        } else {
                            q5Var = (q5) r5Var.f25077a.remove(0);
                        }
                        if (!r5Var.h) {
                            Utilities.f21387e.e(r5Var.f25083i, 30000L);
                            r5Var.h = true;
                        }
                        r5Var.f25082g++;
                        r5Var.f25079c.add(q5Var);
                        r5Var.f25078b.put(q5Var.index, r5Var.f25078b.get(q5Var.index, 0) + 1);
                        if (dh.d0.f8983b) {
                            q5Var.setPriority(1);
                        } else if (q5Var.getPriority() != 10) {
                            q5Var.setPriority(10);
                        }
                        q5Var.postRunnable(new fg(r5Var, runnable, q5Var, 17));
                    }
                }
                arrayList2.clear();
                g0.h3(new k(3, arrayList2));
                return;
            case 3:
                r5.f25075l.add(this.f23779b);
                return;
            case 4:
                ArrayList arrayList3 = this.f23779b;
                AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(t0.f25457b);
                while (i3 < arrayList3.size()) {
                    appWidgetManager.notifyAppWidgetViewDataChanged(((Integer) arrayList3.get(i3)).intValue(), 2131296476);
                    i3++;
                }
                return;
            default:
                hs.e().k(255, this.f23779b);
                return;
        }
    }
}
