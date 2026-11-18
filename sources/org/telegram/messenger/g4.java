package org.telegram.messenger;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class g4 implements RemoteViewsService.RemoteViewsFactory {
    public ArrayList f24163a;
    public Context f24164b;
    public int f24165c;
    public c d;
    public Paint f24166e;
    public RectF f24167f;
    public a0.h f24168g;
    public a0.h h;
    public boolean f24169i;

    @Override
    public final int getCount() {
        if (this.f24169i) {
            return 1;
        }
        return this.f24163a.size() + 1;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.g4.getViewAt(int):android.widget.RemoteViews");
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
        ArrayList arrayList = this.f24163a;
        arrayList.clear();
        a0.h hVar = this.h;
        hVar.b();
        c cVar = this.d;
        if (cVar != null) {
            int i7 = cVar.f23218a;
            if (j10.i(i7).p()) {
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                a0.h hVar2 = new a0.h();
                tr a02 = tr.a0(i7);
                int i10 = this.f24165c;
                a0.h hVar3 = this.f24168g;
                CountDownLatch countDownLatch = new CountDownLatch(1);
                a02.f27052a.c(new bg.c(a02, i10, arrayList, 0, hVar3, hVar2, arrayList3, arrayList2, countDownLatch));
                try {
                    countDownLatch.await();
                } catch (Exception e10) {
                    a02.o(e10, true);
                }
                mp.u1(i7).f4(arrayList2, true);
                mp.u1(i7).Z3(arrayList3, true);
                hVar.b();
                int m10 = hVar2.m();
                for (int i11 = 0; i11 < m10; i11++) {
                    hVar.k(new fj(cVar.f23218a, (TLRPC.Message) hVar2.n(i11), (a0.h) null, (a0.h) null, false, true), hVar2.j(i11));
                }
            }
        }
    }

    @Override
    public final void onDestroy() {
    }
}
