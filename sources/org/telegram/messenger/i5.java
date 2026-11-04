package org.telegram.messenger;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
public final class i5 implements RemoteViewsService.RemoteViewsFactory {
    public ArrayList f23440a;
    public Context f23441b;
    public int f23442c;
    public c d;
    public Paint f23443e;
    public RectF f23444f;
    public a0.h f23445g;
    public boolean h;

    @Override
    public final int getCount() {
        if (this.h) {
            return 1;
        }
        return ((int) Math.ceil(this.f23440a.size() / 2.0f)) + 1;
    }

    @Override
    public final long getItemId(int i3) {
        return i3;
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
        ArrayList arrayList = this.f23440a;
        arrayList.clear();
        c cVar = this.d;
        if (cVar != null) {
            int i3 = cVar.f21919a;
            if (h10.i(i3).p()) {
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                a0.h hVar = new a0.h();
                qr a02 = qr.a0(i3);
                int i10 = this.f23442c;
                a0.h hVar2 = this.f23445g;
                CountDownLatch countDownLatch = new CountDownLatch(1);
                a02.f24934a.c(new cg.c(a02, i10, arrayList, 1, hVar2, hVar, arrayList3, arrayList2, countDownLatch));
                try {
                    countDownLatch.await();
                } catch (Exception e10) {
                    a02.o(e10, true);
                }
                hp.s1(i3).Y3(arrayList2, true);
                hp.s1(i3).S3(arrayList3, true);
            }
        }
    }

    @Override
    public final void onDestroy() {
    }
}
