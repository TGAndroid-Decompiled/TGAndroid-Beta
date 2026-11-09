package org.telegram.messenger;

import android.appwidget.AppWidgetManager;
import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
public final class k implements Runnable {
    public final int f23637a;
    public final ArrayList f23638b;

    public k(int i7, ArrayList arrayList) {
        this.f23637a = i7;
        this.f23638b = arrayList;
    }

    @Override
    public final void run() {
        q5 q5Var;
        int i7 = 0;
        switch (this.f23637a) {
            case 0:
                ArrayList arrayList = this.f23638b;
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
                Utilities.f21336e.c(new k(0, this.f23638b));
                return;
            case 2:
                ArrayList arrayList2 = this.f23638b;
                r5 r5Var = r5.f25248k;
                r5Var.getClass();
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    Runnable runnable = (Runnable) arrayList2.get(i10);
                    if (runnable != null) {
                        if (!r5Var.f25253c.isEmpty() && (r5Var.f25256g / 2 <= r5Var.f25253c.size() || (r5Var.f25251a.isEmpty() && r5Var.f25254e >= r5Var.d))) {
                            q5Var = (q5) r5Var.f25253c.remove(0);
                        } else if (r5Var.f25251a.isEmpty()) {
                            q5Var = new q5("DispatchQueuePoolThreadSafety_" + r5Var.f25255f + "_" + Utilities.f21334b.nextInt(), true);
                            q5Var.setPriority(10);
                            r5Var.f25254e = r5Var.f25254e + 1;
                        } else {
                            q5Var = (q5) r5Var.f25251a.remove(0);
                        }
                        if (!r5Var.h) {
                            Utilities.f21336e.d(r5Var.f25257i, 30000L);
                            r5Var.h = true;
                        }
                        r5Var.f25256g++;
                        r5Var.f25253c.add(q5Var);
                        r5Var.f25252b.put(q5Var.index, r5Var.f25252b.get(q5Var.index, 0) + 1);
                        if (ch.e0.f6230b) {
                            q5Var.setPriority(1);
                        } else if (q5Var.getPriority() != 10) {
                            q5Var.setPriority(10);
                        }
                        q5Var.postRunnable(new ng(r5Var, runnable, q5Var, 17));
                    }
                }
                arrayList2.clear();
                g0.h3(new k(3, arrayList2));
                return;
            case 3:
                r5.f25249l.add(this.f23638b);
                return;
            case 4:
                ArrayList arrayList3 = this.f23638b;
                AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(t0.f25566b);
                while (i7 < arrayList3.size()) {
                    appWidgetManager.notifyAppWidgetViewDataChanged(((Integer) arrayList3.get(i7)).intValue(), 2131296476);
                    i7++;
                }
                return;
            default:
                qs.e().k(255, this.f23638b);
                return;
        }
    }
}
