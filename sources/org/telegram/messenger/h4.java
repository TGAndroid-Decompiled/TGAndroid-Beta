package org.telegram.messenger;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class h4 implements RemoteViewsService.RemoteViewsFactory {
    public ArrayList f16015a;
    public Context f16016b;
    public int f16017c;
    public c d;
    public Paint e;
    public RectF f16018f;
    public a0.h f16019g;
    public a0.h h;
    public boolean f16020i;

    @Override
    public final int getCount() {
        if (this.f16020i) {
            return 1;
        }
        return this.f16015a.size() + 1;
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
    public final android.widget.RemoteViews getViewAt(int r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.h4.getViewAt(int):android.widget.RemoteViews");
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
        ArrayList arrayList = this.f16015a;
        arrayList.clear();
        a0.h hVar = this.h;
        hVar.b();
        c cVar = this.d;
        if (cVar != null) {
            int i10 = cVar.f15043a;
            if (e20.i(i10).p()) {
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                a0.h hVar2 = new a0.h();
                is a02 = is.a0(i10);
                int i11 = this.f16017c;
                a0.h hVar3 = this.f16019g;
                CountDownLatch countDownLatch = new CountDownLatch(1);
                a02.f16331a.c(new sr(a02, i11, arrayList, 0, hVar3, hVar2, arrayList3, arrayList2, countDownLatch));
                try {
                    countDownLatch.await();
                } catch (Exception e) {
                    a02.o(e, true);
                }
                wp.r1(i10).V3(arrayList2, true);
                wp.r1(i10).P3(arrayList3, true);
                hVar.b();
                int m10 = hVar2.m();
                for (int i12 = 0; i12 < m10; i12++) {
                    hVar.k(new kj(cVar.f15043a, (TLRPC.Message) hVar2.n(i12), (a0.h) null, (a0.h) null, false, true), hVar2.j(i12));
                }
            }
        }
    }

    @Override
    public final void onDestroy() {
    }
}
