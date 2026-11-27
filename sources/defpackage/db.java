package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
public final class db implements fn7 {
    public final int b;
    public final Runnable c;
    public final String d;
    public boolean f;
    public boolean h;
    public boolean n;
    public final ArrayList a = new ArrayList();
    public final int e = ConnectionsManager.generateClassGuid();

    public db(String str, int i, Runnable runnable) {
        this.b = i;
        this.d = str;
        this.c = runnable;
    }

    public final void a() {
        if (!this.h) {
            this.h = true;
            int i = this.b;
            jn7.f(i).b(this, jn7.V);
            jn7.f(i).b(this, jn7.H1);
            if (TextUtils.isEmpty(this.d)) {
                d();
            }
        }
    }

    public final void b(ArrayList arrayList) {
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.a;
            if (i < arrayList2.size()) {
                if (arrayList.contains(Integer.valueOf(((r47) arrayList2.get(i)).e1()))) {
                    arrayList2.remove(i);
                    i--;
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final void c() {
        if (!this.h) {
            return;
        }
        this.h = false;
        int i = this.b;
        jn7.f(i).n(this, jn7.V);
        jn7.f(i).n(this, jn7.H1);
        ConnectionsManager.getInstance(i).cancelRequestsForGuid(this.e);
        this.n = false;
    }

    public final void d() {
        ArrayList arrayList;
        int i;
        if (!this.n && !this.f) {
            this.n = true;
            int i2 = this.b;
            long e = yac.h(i2).e();
            int i3 = 0;
            int i4 = Integer.MAX_VALUE;
            while (true) {
                arrayList = this.a;
                if (i3 >= arrayList.size()) {
                    break;
                }
                i4 = Math.min(i4, ((r47) arrayList.get(i3)).e1());
                i3++;
            }
            ls6 d0 = ls6.d0(i2);
            if (arrayList.isEmpty()) {
                i = 30;
            } else {
                i = 50;
            }
            if (i4 == Integer.MAX_VALUE) {
                i4 = 0;
            }
            d0.P0(e, i, i4, 0, 3, 0L, 1, this.e, 0, null, this.d);
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = jn7.V;
        ArrayList arrayList = this.a;
        if (i == i3) {
            if (((Integer) objArr[3]).intValue() == this.e) {
                this.n = false;
                this.f = ((Boolean) objArr[5]).booleanValue();
                arrayList.addAll((ArrayList) objArr[2]);
                this.c.run();
            }
        } else if (i == jn7.H1) {
            arrayList.add(0, (r47) objArr[0]);
        }
    }
}
