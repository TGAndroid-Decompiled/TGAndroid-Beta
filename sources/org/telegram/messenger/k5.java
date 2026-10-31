package org.telegram.messenger;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
public final class k5 implements RemoteViewsService.RemoteViewsFactory {
    public ArrayList f16525a;
    public Context f16526b;
    public int f16527c;
    public c d;
    public Paint e;
    public RectF f16528f;
    public a0.h f16529g;
    public boolean h;

    @Override
    public final int getCount() {
        if (this.h) {
            return 1;
        }
        return ((int) Math.ceil(this.f16525a.size() / 2.0f)) + 1;
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
        ArrayList arrayList = this.f16525a;
        arrayList.clear();
        c cVar = this.d;
        if (cVar != null) {
            int i10 = cVar.f14863a;
            if (d20.i(i10).p()) {
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                a0.h hVar = new a0.h();
                hs a02 = hs.a0(i10);
                int i11 = this.f16527c;
                a0.h hVar2 = this.f16529g;
                CountDownLatch countDownLatch = new CountDownLatch(1);
                a02.f15938a.c(new rr(a02, i11, arrayList, 1, hVar2, hVar, arrayList3, arrayList2, countDownLatch));
                try {
                    countDownLatch.await();
                } catch (Exception e) {
                    a02.o(e, true);
                }
                vp.r1(i10).V3(arrayList2, true);
                vp.r1(i10).P3(arrayList3, true);
            }
        }
    }

    @Override
    public final void onDestroy() {
    }
}
