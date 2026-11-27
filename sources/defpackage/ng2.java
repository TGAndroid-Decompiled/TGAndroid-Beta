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
public final class ng2 implements RemoteViewsService.RemoteViewsFactory {
    public ArrayList a;
    public Context b;
    public int c;
    public k5 d;
    public Paint e;
    public RectF f;
    public zh6 g;
    public zh6 h;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ng2.getViewAt(int):android.widget.RemoteViews");
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
        zh6 zh6Var = this.h;
        zh6Var.b();
        k5 k5Var = this.d;
        if (k5Var != null) {
            int i = k5Var.a;
            if (yac.h(i).o()) {
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                zh6 zh6Var2 = new zh6();
                kf7 a0 = kf7.a0(i);
                int i2 = this.c;
                zh6 zh6Var3 = this.g;
                CountDownLatch countDownLatch = new CountDownLatch(1);
                a0.a.c(new se7(a0, i2, arrayList, 0, zh6Var3, zh6Var2, arrayList3, arrayList2, countDownLatch));
                try {
                    countDownLatch.await();
                } catch (Exception e) {
                    a0.p(e, true);
                }
                uc7.s1(i).j4(arrayList2, true);
                uc7.s1(i).c4(arrayList3, true);
                zh6Var.b();
                int m = zh6Var2.m();
                for (int i3 = 0; i3 < m; i3++) {
                    zh6Var.k(zh6Var2.j(i3), new r47(k5Var.a, (TLRPC.Message) zh6Var2.n(i3), (zh6) null, (zh6) null, false, true));
                }
            }
        }
    }

    @Override
    public final void onDestroy() {
    }
}
