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
    public ArrayList f24049a;
    public Context f24050b;
    public int f24051c;
    public c d;
    public Paint f24052e;
    public RectF f24053f;
    public a0.h f24054g;
    public a0.h h;
    public boolean f24055i;

    @Override
    public final int getCount() {
        if (this.f24055i) {
            return 1;
        }
        return this.f24049a.size() + 1;
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
        ArrayList arrayList = this.f24049a;
        arrayList.clear();
        a0.h hVar = this.h;
        hVar.b();
        c cVar = this.d;
        if (cVar != null) {
            int i7 = cVar.f23166a;
            if (k10.i(i7).p()) {
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                a0.h hVar2 = new a0.h();
                ur a02 = ur.a0(i7);
                int i10 = this.f24051c;
                a0.h hVar3 = this.f24054g;
                CountDownLatch countDownLatch = new CountDownLatch(1);
                a02.f27214a.c(new bg.c(a02, i10, arrayList, 0, hVar3, hVar2, arrayList3, arrayList2, countDownLatch));
                try {
                    countDownLatch.await();
                } catch (Exception e10) {
                    a02.o(e10, true);
                }
                np.u1(i7).f4(arrayList2, true);
                np.u1(i7).Z3(arrayList3, true);
                hVar.b();
                int m10 = hVar2.m();
                for (int i11 = 0; i11 < m10; i11++) {
                    hVar.k(new gj(cVar.f23166a, (TLRPC.Message) hVar2.n(i11), (a0.h) null, (a0.h) null, false, true), hVar2.j(i11));
                }
            }
        }
    }

    @Override
    public final void onDestroy() {
    }
}
