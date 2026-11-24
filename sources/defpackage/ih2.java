package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;
public final class ih2 implements RemoteViewsService.RemoteViewsFactory {
    public ArrayList a;
    public Context b;
    public int c;
    public j5 d;
    public Paint e;
    public RectF f;
    public vh6 g;
    public vh6 h;
    public boolean i;

    @Override
    public final int getCount() {
        if (this.i) {
            return 1;
        }
        return this.a.size() + 1;
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
    public final android.widget.RemoteViews getViewAt(int r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ih2.getViewAt(int):android.widget.RemoteViews");
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
        vh6 vh6Var = this.h;
        vh6Var.b();
        j5 j5Var = this.d;
        if (j5Var != null) {
            int i = j5Var.a;
            if (z8c.h(i).o()) {
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                vh6 vh6Var2 = new vh6();
                cf7 Y = cf7.Y(i);
                int i2 = this.c;
                vh6 vh6Var3 = this.g;
                CountDownLatch countDownLatch = new CountDownLatch(1);
                Y.a.c(new le7(Y, i2, arrayList, 0, vh6Var3, vh6Var2, arrayList3, arrayList2, countDownLatch));
                try {
                    countDownLatch.await();
                } catch (Exception e) {
                    Y.n(e, true);
                }
                oc7.r1(i).d4(arrayList2, true);
                oc7.r1(i).X3(arrayList3, true);
                vh6Var.b();
                int m = vh6Var2.m();
                for (int i3 = 0; i3 < m; i3++) {
                    vh6Var.k(new k47(j5Var.a, (TLRPC.Message) vh6Var2.n(i3), (vh6) null, (vh6) null, false, true), vh6Var2.j(i3));
                }
            }
        }
    }

    @Override
    public final void onDestroy() {
    }
}
