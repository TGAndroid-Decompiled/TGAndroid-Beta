package org.telegram.messenger;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class e4 implements RemoteViewsService.RemoteViewsFactory {
    public ArrayList f22151a;
    public Context f22152b;
    public int f22153c;
    public c d;
    public Paint f22154e;
    public RectF f22155f;
    public a0.h f22156g;
    public a0.h h;
    public boolean f22157i;

    @Override
    public final int getCount() {
        if (this.f22157i) {
            return 1;
        }
        return this.f22151a.size() + 1;
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
    public final android.widget.RemoteViews getViewAt(int r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.e4.getViewAt(int):android.widget.RemoteViews");
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
        ArrayList arrayList = this.f22151a;
        arrayList.clear();
        a0.h hVar = this.h;
        hVar.b();
        c cVar = this.d;
        if (cVar != null) {
            int i7 = cVar.f21723a;
            if (p10.i(i7).p()) {
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                a0.h hVar2 = new a0.h();
                yr a02 = yr.a0(i7);
                int i10 = this.f22153c;
                a0.h hVar3 = this.f22156g;
                CountDownLatch countDownLatch = new CountDownLatch(1);
                a02.f26688a.c(new bg.c(a02, i10, arrayList, 0, hVar3, hVar2, arrayList3, arrayList2, countDownLatch));
                try {
                    countDownLatch.await();
                } catch (Exception e10) {
                    a02.o(e10, true);
                }
                qp.s1(i7).Y3(arrayList2, true);
                qp.s1(i7).S3(arrayList3, true);
                hVar.b();
                int m10 = hVar2.m();
                for (int i11 = 0; i11 < m10; i11++) {
                    hVar.k(new ij(cVar.f21723a, (TLRPC.Message) hVar2.n(i11), (a0.h) null, (a0.h) null, false, true), hVar2.j(i11));
                }
            }
        }
    }

    @Override
    public final void onDestroy() {
    }
}
