package org.telegram.messenger;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
public final class k5 implements RemoteViewsService.RemoteViewsFactory {
    public ArrayList f25011a;
    public Context f25012b;
    public int f25013c;
    public c d;
    public Paint f25014e;
    public RectF f25015f;
    public a0.h f25016g;
    public boolean h;

    @Override
    public final int getCount() {
        if (this.h) {
            return 1;
        }
        return ((int) Math.ceil(this.f25011a.size() / 2.0f)) + 1;
    }

    @Override
    public final long getItemId(int i7) {
        return i7;
    }

    @Override
    public final RemoteViews getLoadingView() {
        return null;
    }

    @Override
    public final android.widget.RemoteViews getViewAt(int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.k5.getViewAt(int):android.widget.RemoteViews");
    }

    @Override
    public final int getViewTypeCount() {
        return 2;
    }

    @Override
    public final boolean hasStableIds() {
        return true;
    }

    @Override
    public final void onCreate() {
        t0.w();
    }

    @Override
    public final void onDataSetChanged() {
        ArrayList arrayList = this.f25011a;
        arrayList.clear();
        c cVar = this.d;
        if (cVar != null) {
            int i7 = cVar.f23202a;
            if (k10.i(i7).p()) {
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                a0.h hVar = new a0.h();
                ur a02 = ur.a0(i7);
                int i10 = this.f25013c;
                a0.h hVar2 = this.f25016g;
                CountDownLatch countDownLatch = new CountDownLatch(1);
                a02.f27250a.c(new bg.c(a02, i10, arrayList, 1, hVar2, hVar, arrayList3, arrayList2, countDownLatch));
                try {
                    countDownLatch.await();
                } catch (Exception e10) {
                    a02.o(e10, true);
                }
                np.u1(i7).f4(arrayList2, true);
                np.u1(i7).Z3(arrayList3, true);
            }
        }
    }

    @Override
    public final void onDestroy() {
    }
}
