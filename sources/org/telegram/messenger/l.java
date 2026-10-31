package org.telegram.messenger;

import android.appwidget.AppWidgetManager;
import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
public final class l implements Runnable {
    public final int f16654a;
    public final ArrayList f16655b;

    public l(int i10, ArrayList arrayList) {
        this.f16654a = i10;
        this.f16655b = arrayList;
    }

    @Override
    public final void run() {
        s5 s5Var;
        int i10 = 0;
        switch (this.f16654a) {
            case 0:
                ArrayList arrayList = this.f16655b;
                while (i10 < arrayList.size()) {
                    Bitmap bitmap = (Bitmap) ((WeakReference) arrayList.get(i10)).get();
                    ((WeakReference) arrayList.get(i10)).clear();
                    if (bitmap != null && !bitmap.isRecycled()) {
                        try {
                            bitmap.recycle();
                        } catch (Exception e) {
                            f8.g(e, true);
                        }
                    }
                    i10++;
                }
                return;
            case 1:
                Utilities.e.c(new l(0, this.f16655b));
                return;
            case 2:
                ArrayList arrayList2 = this.f16655b;
                t5 t5Var = t5.f18011k;
                t5Var.getClass();
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    Runnable runnable = (Runnable) arrayList2.get(i11);
                    if (runnable != null) {
                        if (!t5Var.f18016c.isEmpty() && (t5Var.f18018g / 2 <= t5Var.f18016c.size() || (t5Var.f18014a.isEmpty() && t5Var.e >= t5Var.d))) {
                            s5Var = (s5) t5Var.f18016c.remove(0);
                        } else if (t5Var.f18014a.isEmpty()) {
                            s5Var = new s5("DispatchQueuePoolThreadSafety_" + t5Var.f18017f + "_" + Utilities.f14519b.nextInt(), true);
                            s5Var.setPriority(10);
                            t5Var.e = t5Var.e + 1;
                        } else {
                            s5Var = (s5) t5Var.f18014a.remove(0);
                        }
                        if (!t5Var.h) {
                            Utilities.e.d(t5Var.f18019i, 30000L);
                            t5Var.h = true;
                        }
                        t5Var.f18018g++;
                        t5Var.f18016c.add(s5Var);
                        t5Var.f18015b.put(s5Var.index, t5Var.f18015b.get(s5Var.index, 0) + 1);
                        if (sg.e0.f48320b) {
                            s5Var.setPriority(1);
                        } else if (s5Var.getPriority() != 10) {
                            s5Var.setPriority(10);
                        }
                        s5Var.postRunnable(new mg(t5Var, runnable, s5Var, 17));
                    }
                }
                arrayList2.clear();
                i0.g3(new l(3, arrayList2));
                return;
            case 3:
                t5.f18012l.add(this.f16655b);
                return;
            case 4:
                ArrayList arrayList3 = this.f16655b;
                AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(w0.f19025b);
                while (i10 < arrayList3.size()) {
                    appWidgetManager.notifyAppWidgetViewDataChanged(((Integer) arrayList3.get(i10)).intValue(), 2131296476);
                    i10++;
                }
                return;
            default:
                zs.e().k(255, this.f16655b);
                return;
        }
    }
}
