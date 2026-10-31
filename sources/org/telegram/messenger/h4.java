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
    public ArrayList f15829a;
    public Context f15830b;
    public int f15831c;
    public c d;
    public Paint e;
    public RectF f15832f;
    public a0.h f15833g;
    public a0.h h;
    public boolean f15834i;

    @Override
    public final int getCount() {
        if (this.f15834i) {
            return 1;
        }
        return this.f15829a.size() + 1;
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
        ArrayList arrayList = this.f15829a;
        arrayList.clear();
        a0.h hVar = this.h;
        hVar.b();
        c cVar = this.d;
        if (cVar != null) {
            int i10 = cVar.f14863a;
            if (d20.i(i10).p()) {
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                a0.h hVar2 = new a0.h();
                hs a02 = hs.a0(i10);
                int i11 = this.f15831c;
                a0.h hVar3 = this.f15833g;
                CountDownLatch countDownLatch = new CountDownLatch(1);
                a02.f15938a.c(new rr(a02, i11, arrayList, 0, hVar3, hVar2, arrayList3, arrayList2, countDownLatch));
                try {
                    countDownLatch.await();
                } catch (Exception e) {
                    a02.o(e, true);
                }
                vp.r1(i10).V3(arrayList2, true);
                vp.r1(i10).P3(arrayList3, true);
                hVar.b();
                int m10 = hVar2.m();
                for (int i12 = 0; i12 < m10; i12++) {
                    hVar.k(new jj(cVar.f14863a, (TLRPC.Message) hVar2.n(i12), (a0.h) null, (a0.h) null, false, true), hVar2.j(i12));
                }
            }
        }
    }

    @Override
    public final void onDestroy() {
    }
}
