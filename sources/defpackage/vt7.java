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
import org.telegram.ui.ActionBar.e;
public final class vt7 extends e implements fn7 {
    public q9c a;
    public nla b;
    public boolean c;
    public boolean d;
    public ArrayList[] e;
    public ArrayList[] f;
    public String h;
    public String n;

    public vt7() {
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
            arrayListArr[(i4 / 1440) % 7].add(new ut7(i5, (tL_businessWeeklyOpen.end_minute - i4) + i5));
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
                if (!arrayListArr[i12].isEmpty() && ((ut7) c00.g(1, arrayListArr[i12])).b >= 1440) {
                    ((ut7) c00.g(1, arrayListArr[i12])).b = 1439;
                }
                int min = Math.min((i10 - i7) - 1, 2879);
                ArrayList arrayList2 = arrayListArr[(i6 + 8) % 7];
                if (min >= 1440 && !arrayList2.isEmpty() && ((ut7) arrayList2.get(0)).a < min - 1440) {
                    min = ((ut7) arrayList2.get(0)).a + 1439;
                }
                arrayListArr[i6].clear();
                arrayListArr[i6].add(new ut7(0, min));
            } else {
                int i13 = i8 % 7;
                if (!arrayListArr[i6].isEmpty() && !arrayListArr[i13].isEmpty()) {
                    ut7 ut7Var = (ut7) c00.g(1, arrayListArr[i6]);
                    ut7 ut7Var2 = (ut7) arrayListArr[i13].get(0);
                    int i14 = ut7Var.b;
                    if (i14 > 1440 && i14 - 1439 == ut7Var2.a) {
                        ut7Var.b = 1439;
                        ut7Var2.a = 0;
                    }
                }
            }
            i6 = i8;
        }
        return arrayListArr;
    }

    public static String c0(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return ob6.M0(2131752736, null);
        }
        if (e0(arrayList)) {
            return ob6.M0(2131752735, null);
        }
        String str = "";
        for (int i = 0; i < arrayList.size(); i++) {
            ut7 ut7Var = (ut7) arrayList.get(i);
            if (i > 0) {
                str = str.concat("\n");
            }
            str = str + ut7.a(ut7Var.a) + " - " + ut7.a(ut7Var.b);
        }
        return str;
    }

    public static boolean e0(ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ut7 ut7Var = (ut7) arrayList.get(i2);
            if (i < ut7Var.a) {
                return false;
            }
            i = ut7Var.b;
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
            sb.append(ob6.a0(null, null, 2131752740, lbc.r(user)));
            sb.append("\n");
        }
        for (int i3 = 0; i3 < 7; i3++) {
            ArrayList arrayList = b0[i3];
            String displayName = DayOfWeek.values()[i3].getDisplayName(TextStyle.FULL, ob6.D0().y);
            sb.append(displayName.substring(0, 1).toUpperCase() + displayName.substring(1));
            sb.append(": ");
            if (e0(arrayList)) {
                sb.append(ob6.M0(2131752722, null));
            } else if (arrayList.isEmpty()) {
                sb.append(ob6.M0(2131752726, null));
            } else {
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    if (i4 > 0) {
                        sb.append(", ");
                    }
                    ut7 ut7Var = (ut7) arrayList.get(i4);
                    sb.append(ut7.a(ut7Var.a));
                    sb.append(" - ");
                    sb.append(ut7.a(ut7Var.b));
                }
            }
            sb.append("\n");
        }
        TLRPC.TL_timezone a = wsb.b(i).a(tL_businessWorkHours.timezone_id);
        int rawOffset = Calendar.getInstance().getTimeZone().getRawOffset() / 1000;
        if (a == null) {
            i2 = 0;
        } else {
            i2 = a.utc_offset;
        }
        if ((rawOffset - i2) / 60 != 0 && a != null) {
            wsb.b(i);
            sb.append(ob6.a0(null, null, 2131752741, wsb.e(a, true)));
        }
        return sb.toString();
    }

    public final void Y(int i) {
        ut7 ut7Var;
        ut7 ut7Var2 = null;
        if (this.f[i].isEmpty()) {
            ut7Var = null;
        } else {
            ut7Var = (ut7) c00.g(1, this.f[i]);
        }
        if (ut7Var != null) {
            int i2 = (i + 6) % 7;
            if (!this.f[i2].isEmpty()) {
                ut7Var2 = (ut7) c00.g(1, this.f[i2]);
            }
            if (ut7Var2 != null && ut7Var2.b > 1439) {
                ut7Var2.b = 1439;
                if (ut7Var2.a >= 1439) {
                    this.f[i2].remove(ut7Var2);
                }
                View C1 = this.a.C1(i2);
                if (C1 instanceof uo7) {
                    ((uo7) C1).setValue(c0(this.f[i2]));
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
        String M0 = ob6.M0(2131752745, null);
        String M02 = ob6.M0(2131752730, null);
        b8c b8cVar = new b8c(2);
        b8cVar.m = M0;
        b8cVar.p = M02;
        b8cVar.k = 2131623939;
        arrayList.add(b8cVar);
        b8c i = b8c.i(-1, ob6.M0(2131752710, null));
        i.L(this.d);
        arrayList.add(i);
        arrayList.add(b8c.B(-100, null));
        if (this.d) {
            bp1.o(2131752745, null, arrayList);
            int i2 = 0;
            while (true) {
                ArrayList[] arrayListArr = this.f;
                if (i2 < arrayListArr.length) {
                    if (arrayListArr[i2] == null) {
                        arrayListArr[i2] = new ArrayList();
                    }
                    String displayName = DayOfWeek.values()[i2].getDisplayName(TextStyle.FULL, ob6.D0().y);
                    String c0 = c0(this.f[i2]);
                    b8c b8cVar2 = new b8c(5);
                    b8cVar2.d = i2;
                    b8cVar2.m = displayName.substring(0, 1).toUpperCase() + displayName.substring(1);
                    b8cVar2.n = c0;
                    b8cVar2.L(!this.f[i2].isEmpty());
                    arrayList.add(b8cVar2);
                    i2++;
                } else {
                    arrayList.add(b8c.B(-101, null));
                    arrayList.add(b8c.f(ob6.M0(2131752709, null), wsb.b(this.currentAccount).d(this.n, false), -2));
                    arrayList.add(b8c.B(-102, null));
                    return;
                }
            }
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231243);
        this.simpleActionBar.setTitle(ob6.M0(2131752745, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new zl5(this, (byte) 15));
        this.b = this.simpleActionBar.u(ob6.M0(2131745674, null));
        Z(false);
        FrameLayout frameLayout = new FrameLayout(context);
        q9c q9cVar = new q9c(this, new yt4(this, (byte) 23), new bm6(this, (byte) 23), null);
        this.a = q9cVar;
        q9cVar.s1();
        q9c q9cVar2 = this.a;
        q9cVar2.g3.r = false;
        q9cVar2.setSectionsDrawBackground(true);
        frameLayout.addView(this.a, tre.c(-1.0f, -1));
        i0();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final boolean d0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vt7.d0():boolean");
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        l9c l9cVar;
        if (i == jn7.E0) {
            i0();
        } else if (i == jn7.t3) {
            if (this.e == null) {
                this.n = wsb.b(this.currentAccount).c();
            }
            q9c q9cVar = this.a;
            if (q9cVar != null && (l9cVar = q9cVar.g3) != null) {
                l9cVar.O(true);
            }
        }
    }

    public final void f0(View view, String str) {
        wsb b = wsb.b(this.currentAccount);
        this.n = str;
        ((skb) view).w(b.d(str, false), true);
        Z(true);
    }

    public final void g0(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            this.b.b(false);
            d31.e0(tL_error);
        } else if (tLObject instanceof TLRPC.TL_boolFalse) {
            if (getParentActivity() != null) {
                this.b.b(false);
                xnb.x(null, 2131743534, d31.b0(this), null);
            }
        } else if (!this.isFinished && !this.finishing) {
            finishFragment();
        }
    }

    @Override
    public final d79 getListViewForSimpleGlass() {
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
        TLRPC.UserFull Y1 = getMessagesController().Y1(getUserConfig().e());
        TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
        ArrayList[] arrayListArr = this.f;
        ArrayList arrayList = new ArrayList();
        if (arrayListArr != null) {
            for (int i = 0; i < arrayListArr.length; i++) {
                if (arrayListArr[i] != null) {
                    for (int i2 = 0; i2 < arrayListArr[i].size(); i2++) {
                        ut7 ut7Var = (ut7) arrayListArr[i].get(i2);
                        TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen = new TL_account.TL_businessWeeklyOpen();
                        int i3 = i * 1440;
                        tL_businessWeeklyOpen.start_minute = ut7Var.a + i3;
                        tL_businessWeeklyOpen.end_minute = i3 + ut7Var.b;
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
            if (Y1 != null) {
                Y1.flags2 |= 1;
                Y1.business_work_hours = tL_businessWorkHours;
            }
        } else if (Y1 != null) {
            Y1.flags2 &= -2;
            Y1.business_work_hours = null;
        }
        getConnectionsManager().sendRequest(updatebusinessworkhours, new w15(this, (byte) 16));
        getMessagesStorage().g2(Y1, false);
    }

    public final void i0() {
        boolean z;
        l9c l9cVar;
        if (this.c) {
            return;
        }
        TLRPC.UserFull Y1 = getMessagesController().Y1(getUserConfig().e());
        if (Y1 == null) {
            getMessagesController().o3(getClassGuid(), getUserConfig().f(), true);
            return;
        }
        TL_account.TL_businessWorkHours tL_businessWorkHours = Y1.business_work_hours;
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
            this.f = b0(Y1.business_work_hours.weekly_open);
        } else {
            String c = wsb.b(this.currentAccount).c();
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
                    this.f[i].add(new ut7(0, 1439));
                }
                i++;
            }
        }
        q9c q9cVar = this.a;
        if (q9cVar != null && (l9cVar = q9cVar.g3) != null) {
            l9cVar.O(true);
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
        wsb.b(this.currentAccount).g();
        this.n = wsb.b(this.currentAccount).c();
        getNotificationCenter().b(this, jn7.E0);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, jn7.E0);
        super.onFragmentDestroy();
        h0();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
