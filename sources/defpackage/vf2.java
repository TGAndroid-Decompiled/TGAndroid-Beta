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
public final class vf2 implements RemoteViewsService.RemoteViewsFactory {
    public ArrayList a;
    public Context b;
    public int c;
    public j5 d;
    public Paint e;
    public RectF f;
    public vf6 g;
    public vf6 h;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vf2.getViewAt(int):android.widget.RemoteViews");
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
        vf6 vf6Var = this.h;
        vf6Var.b();
        j5 j5Var = this.d;
        if (j5Var != null) {
            int i = j5Var.a;
            if (y6c.h(i).o()) {
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                vf6 vf6Var2 = new vf6();
                ad7 Y = ad7.Y(i);
                int i2 = this.c;
                vf6 vf6Var3 = this.g;
                CountDownLatch countDownLatch = new CountDownLatch(1);
                Y.a.c(new ic7(Y, i2, arrayList, 0, vf6Var3, vf6Var2, arrayList3, arrayList2, countDownLatch));
                try {
                    countDownLatch.await();
                } catch (Exception e) {
                    Y.n(e, true);
                }
                na7.q1(i).a4(arrayList2, true);
                na7.q1(i).U3(arrayList3, true);
                vf6Var.b();
                int m = vf6Var2.m();
                for (int i3 = 0; i3 < m; i3++) {
                    vf6Var.k(new k27(j5Var.a, (TLRPC.Message) vf6Var2.n(i3), (vf6) null, (vf6) null, false, true), vf6Var2.j(i3));
                }
            }
        }
    }

    @Override
    public final void onDestroy() {
    }
}
