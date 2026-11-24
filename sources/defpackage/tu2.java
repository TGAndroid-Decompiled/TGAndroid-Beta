package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.a;
public final class tu2 implements RemoteViewsService.RemoteViewsFactory {
    public ArrayList a;
    public Context b;
    public int c;
    public j5 d;
    public Paint e;
    public RectF f;
    public vf6 g;
    public boolean h;

    @Override
    public final int getCount() {
        if (this.h) {
            return 1;
        }
        return ((int) Math.ceil(this.a.size() / 2.0f)) + 1;
    }

    @Override
    public final long getItemId(int i) {
        return i;
    }

    @Override
    public final RemoteViews getLoadingView() {
        return null;
    }

    @Override
    public final android.widget.RemoteViews getViewAt(int r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tu2.getViewAt(int):android.widget.RemoteViews");
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
        a.v();
    }

    @Override
    public final void onDataSetChanged() {
        ArrayList arrayList = this.a;
        arrayList.clear();
        j5 j5Var = this.d;
        if (j5Var != null) {
            int i = j5Var.a;
            if (y6c.h(i).o()) {
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                vf6 vf6Var = new vf6();
                ad7 Y = ad7.Y(i);
                int i2 = this.c;
                vf6 vf6Var2 = this.g;
                CountDownLatch countDownLatch = new CountDownLatch(1);
                Y.a.c(new ic7(Y, i2, arrayList, 1, vf6Var2, vf6Var, arrayList3, arrayList2, countDownLatch));
                try {
                    countDownLatch.await();
                } catch (Exception e) {
                    Y.n(e, true);
                }
                na7.q1(i).b4(arrayList2, true);
                na7.q1(i).V3(arrayList3, true);
            }
        }
    }

    @Override
    public final void onDestroy() {
    }
}
