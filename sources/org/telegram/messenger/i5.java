package org.telegram.messenger;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
public final class i5 implements RemoteViewsService.RemoteViewsFactory {
    public ArrayList f24283a;
    public Context f24284b;
    public int f24285c;
    public c d;
    public Paint f24286e;
    public RectF f24287f;
    public a0.h f24288g;
    public boolean h;

    @Override
    public final int getCount() {
        if (this.h) {
            return 1;
        }
        return ((int) Math.ceil(this.f24283a.size() / 2.0f)) + 1;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.i5.getViewAt(int):android.widget.RemoteViews");
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
        ArrayList arrayList = this.f24283a;
        arrayList.clear();
        c cVar = this.d;
        if (cVar != null) {
            int i7 = cVar.f22782a;
            if (m10.i(i7).p()) {
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                a0.h hVar = new a0.h();
                vr a02 = vr.a0(i7);
                int i10 = this.f24285c;
                a0.h hVar2 = this.f24288g;
                CountDownLatch countDownLatch = new CountDownLatch(1);
                a02.f27219a.c(new bg.c(a02, i10, arrayList, 1, hVar2, hVar, arrayList3, arrayList2, countDownLatch));
                try {
                    countDownLatch.await();
                } catch (Exception e10) {
                    a02.o(e10, true);
                }
                np.s1(i7).Y3(arrayList2, true);
                np.s1(i7).S3(arrayList3, true);
            }
        }
    }

    @Override
    public final void onDestroy() {
    }
}
