package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import j$.time.DayOfWeek;
import j$.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.d;
public final class qq7 extends d implements gk7 {
    public q5c a;
    public sha b;
    public boolean c;
    public boolean d;
    public ArrayList[] e;
    public ArrayList[] f;
    public String h;
    public String n;

    public qq7() {
        super(null);
        this.e = null;
        this.f = new ArrayList[]{new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList()};
    }

    public static ArrayList[] b0(ArrayList arrayList) {
        int i;
        ArrayList[] arrayListArr = new ArrayList[7];
        for (int i2 = 0; i2 < 7; i2++) {
            arrayListArr[i2] = new ArrayList();
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen = (TL_account.TL_businessWeeklyOpen) arrayList.get(i3);
            int i4 = tL_businessWeeklyOpen.start_minute;
            int i5 = i4 % 1440;
            arrayListArr[(i4 / 1440) % 7].add(new pq7(i5, (tL_businessWeeklyOpen.end_minute - i4) + i5));
        }
        int i6 = 0;
        while (i6 < 7) {
            int i7 = i6 * 1440;
            int i8 = i6 + 1;
            int i9 = i8 * 1440;
            int i10 = i7;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen2 = (TL_account.TL_businessWeeklyOpen) arrayList.get(i11);
                if (tL_businessWeeklyOpen2.start_minute <= i10 && (i = tL_businessWeeklyOpen2.end_minute) >= i10) {
                    i10 = i + 1;
                }
            }
            if (i10 >= i9) {
                int i12 = (i6 + 6) % 7;
                if (!arrayListArr[i12].isEmpty() && ((pq7) b00.f(1, arrayListArr[i12])).b >= 1440) {
                    ((pq7) b00.f(1, arrayListArr[i12])).b = 1439;
                }
                int min = Math.min((i10 - i7) - 1, 2879);
                ArrayList arrayList2 = arrayListArr[(i6 + 8) % 7];
                if (min >= 1440 && !arrayList2.isEmpty() && ((pq7) arrayList2.get(0)).a < min - 1440) {
                    min = ((pq7) arrayList2.get(0)).a + 1439;
                }
                arrayListArr[i6].clear();
                arrayListArr[i6].add(new pq7(0, min));
            } else {
                int i13 = i8 % 7;
                if (!arrayListArr[i6].isEmpty() && !arrayListArr[i13].isEmpty()) {
                    pq7 pq7Var = (pq7) b00.f(1, arrayListArr[i6]);
                    pq7 pq7Var2 = (pq7) arrayListArr[i13].get(0);
                    int i14 = pq7Var.b;
                    if (i14 > 1440 && i14 - 1439 == pq7Var2.a) {
                        pq7Var.b = 1439;
                        pq7Var2.a = 0;
                    }
                }
            }
            i6 = i8;
        }
        return arrayListArr;
    }

    public static String c0(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return k96.M0(2131752743, null);
        }
        if (e0(arrayList)) {
            return k96.M0(2131752742, null);
        }
        String str = "";
        for (int i = 0; i < arrayList.size(); i++) {
            pq7 pq7Var = (pq7) arrayList.get(i);
            if (i > 0) {
                str = str.concat("\n");
            }
            str = str + pq7.a(pq7Var.a) + " - " + pq7.a(pq7Var.b);
        }
        return str;
    }

    public static boolean e0(ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            pq7 pq7Var = (pq7) arrayList.get(i2);
            if (i < pq7Var.a) {
                return false;
            }
            i = pq7Var.b;
        }
        if (i != 1439 && i != 1440) {
            return false;
        }
        return true;
    }

    public static String j0(int i, TLRPC.User user, TL_account.TL_businessWorkHours tL_businessWorkHours) {
        int i2;
        if (tL_businessWorkHours == null) {
            return null;
        }
        ArrayList[] b0 = b0(tL_businessWorkHours.weekly_open);
        StringBuilder sb = new StringBuilder();
        if (user != null) {
            sb.append(k96.a0(null, null, 2131752747, l7c.q(user)));
            sb.append("\n");
        }
        for (int i3 = 0; i3 < 7; i3++) {
            ArrayList arrayList = b0[i3];
            String displayName = DayOfWeek.values()[i3].getDisplayName(TextStyle.FULL, k96.D0().y);
            sb.append(displayName.substring(0, 1).toUpperCase() + displayName.substring(1));
            sb.append(": ");
            if (e0(arrayList)) {
                sb.append(k96.M0(2131752729, null));
            } else if (arrayList.isEmpty()) {
                sb.append(k96.M0(2131752733, null));
            } else {
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    if (i4 > 0) {
                        sb.append(", ");
                    }
                    pq7 pq7Var = (pq7) arrayList.get(i4);
                    sb.append(pq7.a(pq7Var.a));
                    sb.append(" - ");
                    sb.append(pq7.a(pq7Var.b));
                }
            }
            sb.append("\n");
        }
        TLRPC.TL_timezone a = wob.b(i).a(tL_businessWorkHours.timezone_id);
        int rawOffset = Calendar.getInstance().getTimeZone().getRawOffset() / 1000;
        if (a == null) {
            i2 = 0;
        } else {
            i2 = a.utc_offset;
        }
        if ((rawOffset - i2) / 60 != 0 && a != null) {
            wob.b(i);
            sb.append(k96.a0(null, null, 2131752748, wob.e(a, true)));
        }
        return sb.toString();
    }

    public final void Y(int i) {
        pq7 pq7Var;
        pq7 pq7Var2 = null;
        if (this.f[i].isEmpty()) {
            pq7Var = null;
        } else {
            pq7Var = (pq7) b00.f(1, this.f[i]);
        }
        if (pq7Var != null) {
            int i2 = (i + 6) % 7;
            if (!this.f[i2].isEmpty()) {
                pq7Var2 = (pq7) b00.f(1, this.f[i2]);
            }
            if (pq7Var2 != null && pq7Var2.b > 1439) {
                pq7Var2.b = 1439;
                if (pq7Var2.a >= 1439) {
                    this.f[i2].remove(pq7Var2);
                }
                View B1 = this.a.B1(i2);
                if (B1 instanceof vl7) {
                    ((vl7) B1).setValue(c0(this.f[i2]));
                } else {
                    this.a.g3.O(true);
                }
            }
        }
    }

    public final void Z(boolean z) {
        if (this.b == null) {
            return;
        }
        this.b.a(d0(), z);
    }

    public final void a0(ArrayList arrayList) {
        String M0 = k96.M0(2131752752, null);
        String M02 = k96.M0(2131752737, null);
        c4c c4cVar = new c4c(2);
        c4cVar.m = M0;
        c4cVar.p = M02;
        c4cVar.k = 2131623939;
        arrayList.add(c4cVar);
        c4c i = c4c.i(-1, k96.M0(2131752717, null));
        i.L(this.d);
        arrayList.add(i);
        arrayList.add(c4c.B(-100, null));
        if (this.d) {
            oo1.o(2131752752, null, arrayList);
            int i2 = 0;
            while (true) {
                ArrayList[] arrayListArr = this.f;
                if (i2 < arrayListArr.length) {
                    if (arrayListArr[i2] == null) {
                        arrayListArr[i2] = new ArrayList();
                    }
                    String displayName = DayOfWeek.values()[i2].getDisplayName(TextStyle.FULL, k96.D0().y);
                    String c0 = c0(this.f[i2]);
                    c4c c4cVar2 = new c4c(5);
                    c4cVar2.d = i2;
                    c4cVar2.m = displayName.substring(0, 1).toUpperCase() + displayName.substring(1);
                    c4cVar2.n = c0;
                    c4cVar2.L(!this.f[i2].isEmpty());
                    arrayList.add(c4cVar2);
                    i2++;
                } else {
                    arrayList.add(c4c.B(-101, null));
                    arrayList.add(c4c.f(k96.M0(2131752716, null), wob.b(this.currentAccount).d(this.n, false), -2));
                    arrayList.add(c4c.B(-102, null));
                    return;
                }
            }
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231243);
        this.simpleActionBar.setTitle(k96.M0(2131752752, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bq5(this, (byte) 13));
        this.b = this.simpleActionBar.s(k96.M0(2131745754, null));
        Z(false);
        FrameLayout frameLayout = new FrameLayout(context);
        q5c q5cVar = new q5c(this, new ur4(this, (byte) 23), new im6(this, (byte) 18), null);
        this.a = q5cVar;
        q5cVar.r1();
        q5c q5cVar2 = this.a;
        q5cVar2.g3.r = false;
        q5cVar2.setSectionsDrawBackground(true);
        frameLayout.addView(this.a, nme.c(-1.0f, -1));
        i0();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final boolean d0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qq7.d0():boolean");
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        l5c l5cVar;
        if (i == kk7.D0) {
            i0();
        } else if (i == kk7.s3) {
            if (this.e == null) {
                this.n = wob.b(this.currentAccount).c();
            }
            q5c q5cVar = this.a;
            if (q5cVar != null && (l5cVar = q5cVar.g3) != null) {
                l5cVar.O(true);
            }
        }
    }

    public final void f0(View view, String str) {
        wob b = wob.b(this.currentAccount);
        this.n = str;
        ((wgb) view).w(b.d(str, false), true);
        Z(true);
    }

    public final void g0(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            this.b.b(false);
            u21.e0(tL_error);
        } else if (tLObject instanceof TLRPC.TL_boolFalse) {
            if (getParentActivity() != null) {
                this.b.b(false);
                yjb.x(null, 2131743640, u21.b0(this), null);
            }
        } else if (!this.isFinished && !this.finishing) {
            finishFragment();
        }
    }

    @Override
    public final o39 getListViewForSimpleGlass() {
        return this.a;
    }

    public final void h0() {
        if (this.b.y.f) {
            return;
        }
        if (!d0()) {
            finishFragment();
            return;
        }
        this.b.b(true);
        TLRPC.UserFull W1 = getMessagesController().W1(getUserConfig().e());
        TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
        ArrayList[] arrayListArr = this.f;
        ArrayList arrayList = new ArrayList();
        if (arrayListArr != null) {
            for (int i = 0; i < arrayListArr.length; i++) {
                if (arrayListArr[i] != null) {
                    for (int i2 = 0; i2 < arrayListArr[i].size(); i2++) {
                        pq7 pq7Var = (pq7) arrayListArr[i].get(i2);
                        TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen = new TL_account.TL_businessWeeklyOpen();
                        int i3 = i * 1440;
                        tL_businessWeeklyOpen.start_minute = pq7Var.a + i3;
                        tL_businessWeeklyOpen.end_minute = i3 + pq7Var.b;
                        arrayList.add(tL_businessWeeklyOpen);
                    }
                }
            }
        }
        if (this.d && !arrayList.isEmpty()) {
            TL_account.TL_businessWorkHours tL_businessWorkHours = new TL_account.TL_businessWorkHours();
            tL_businessWorkHours.timezone_id = this.n;
            tL_businessWorkHours.weekly_open.addAll(arrayList);
            updatebusinessworkhours.flags |= 1;
            updatebusinessworkhours.business_work_hours = tL_businessWorkHours;
            if (W1 != null) {
                W1.flags2 |= 1;
                W1.business_work_hours = tL_businessWorkHours;
            }
        } else if (W1 != null) {
            W1.flags2 &= -2;
            W1.business_work_hours = null;
        }
        getConnectionsManager().sendRequest(updatebusinessworkhours, new n35(this, (byte) 15));
        getMessagesStorage().g2(W1, false);
    }

    public final void i0() {
        boolean z;
        l5c l5cVar;
        if (this.c) {
            return;
        }
        TLRPC.UserFull W1 = getMessagesController().W1(getUserConfig().e());
        if (W1 == null) {
            getMessagesController().h3(getClassGuid(), getUserConfig().f(), true);
            return;
        }
        TL_account.TL_businessWorkHours tL_businessWorkHours = W1.business_work_hours;
        if (tL_businessWorkHours != null) {
            z = true;
        } else {
            z = false;
        }
        this.d = z;
        if (z) {
            String str = tL_businessWorkHours.timezone_id;
            this.n = str;
            this.h = str;
            this.e = b0(tL_businessWorkHours.weekly_open);
            this.f = b0(W1.business_work_hours.weekly_open);
        } else {
            String c = wob.b(this.currentAccount).c();
            this.n = c;
            this.h = c;
            this.e = null;
            this.f = new ArrayList[7];
            int i = 0;
            while (true) {
                ArrayList[] arrayListArr = this.f;
                if (i >= arrayListArr.length) {
                    break;
                }
                arrayListArr[i] = new ArrayList();
                if (i >= 0 && i < 5) {
                    this.f[i].add(new pq7(0, 1439));
                }
                i++;
            }
        }
        q5c q5cVar = this.a;
        if (q5cVar != null && (l5cVar = q5cVar.g3) != null) {
            l5cVar.O(true);
        }
        Z(false);
        this.c = true;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        wob.b(this.currentAccount).g();
        this.n = wob.b(this.currentAccount).c();
        getNotificationCenter().b(this, kk7.D0);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, kk7.D0);
        super.onFragmentDestroy();
        h0();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
