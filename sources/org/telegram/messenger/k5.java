package org.telegram.messenger;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
public final class k5 implements RemoteViewsService.RemoteViewsFactory {
    public ArrayList f16559a;
    public Context f16560b;
    public int f16561c;
    public c d;
    public Paint e;
    public RectF f16562f;
    public a0.h f16563g;
    public boolean h;

    @Override
    public final int getCount() {
        if (this.h) {
            return 1;
        }
        return ((int) Math.ceil(this.f16559a.size() / 2.0f)) + 1;
    }

    @Override
    public final long getItemId(int i10) {
        return i10;
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
        w0.w();
    }

    @Override
    public final void onDataSetChanged() {
        ArrayList arrayList = this.f16559a;
        arrayList.clear();
        c cVar = this.d;
        if (cVar != null) {
            int i10 = cVar.f15043a;
            if (e20.i(i10).p()) {
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                a0.h hVar = new a0.h();
                is a02 = is.a0(i10);
                int i11 = this.f16561c;
                a0.h hVar2 = this.f16563g;
                CountDownLatch countDownLatch = new CountDownLatch(1);
                a02.f16331a.c(new sr(a02, i11, arrayList, 1, hVar2, hVar, arrayList3, arrayList2, countDownLatch));
                try {
                    countDownLatch.await();
                } catch (Exception e) {
                    a02.o(e, true);
                }
                wp.r1(i10).V3(arrayList2, true);
                wp.r1(i10).P3(arrayList3, true);
            }
        }
    }

    @Override
    public final void onDestroy() {
    }
}
