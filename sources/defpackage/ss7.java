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
public final class ss7 extends d implements jm7 {
    public q7c a;
    public uja b;
    public boolean c;
    public boolean d;
    public ArrayList[] e;
    public ArrayList[] f;
    public String h;
    public String n;

    public ss7() {
        super(null);
        this.e = null;
        this.f = new ArrayList[]{new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList()};
    }

    public static ArrayList[] c0(ArrayList arrayList) {
        int i;
        ArrayList[] arrayListArr = new ArrayList[7];
        for (int i2 = 0; i2 < 7; i2++) {
            arrayListArr[i2] = new ArrayList();
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen = (TL_account.TL_businessWeeklyOpen) arrayList.get(i3);
            int i4 = tL_businessWeeklyOpen.start_minute;
            int i5 = i4 % 1440;
            arrayListArr[(i4 / 1440) % 7].add(new rs7(i5, (tL_businessWeeklyOpen.end_minute - i4) + i5));
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
                if (!arrayListArr[i12].isEmpty() && ((rs7) b10.f(1, arrayListArr[i12])).b >= 1440) {
                    ((rs7) b10.f(1, arrayListArr[i12])).b = 1439;
                }
                int min = Math.min((i10 - i7) - 1, 2879);
                ArrayList arrayList2 = arrayListArr[(i6 + 8) % 7];
                if (min >= 1440 && !arrayList2.isEmpty() && ((rs7) arrayList2.get(0)).a < min - 1440) {
                    min = ((rs7) arrayList2.get(0)).a + 1439;
                }
                arrayListArr[i6].clear();
                arrayListArr[i6].add(new rs7(0, min));
            } else {
                int i13 = i8 % 7;
                if (!arrayListArr[i6].isEmpty() && !arrayListArr[i13].isEmpty()) {
                    rs7 rs7Var = (rs7) b10.f(1, arrayListArr[i6]);
                    rs7 rs7Var2 = (rs7) arrayListArr[i13].get(0);
                    int i14 = rs7Var.b;
                    if (i14 > 1440 && i14 - 1439 == rs7Var2.a) {
                        rs7Var.b = 1439;
                        rs7Var2.a = 0;
                    }
                }
            }
            i6 = i8;
        }
        return arrayListArr;
    }

    public static String d0(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return jb6.M0(2131752708, null);
        }
        if (f0(arrayList)) {
            return jb6.M0(2131752707, null);
        }
        String str = "";
        for (int i = 0; i < arrayList.size(); i++) {
            rs7 rs7Var = (rs7) arrayList.get(i);
            if (i > 0) {
                str = str.concat("\n");
            }
            str = str + rs7.a(rs7Var.a) + " - " + rs7.a(rs7Var.b);
        }
        return str;
    }

    public static boolean f0(ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            rs7 rs7Var = (rs7) arrayList.get(i2);
            if (i < rs7Var.a) {
                return false;
            }
            i = rs7Var.b;
        }
        if (i != 1439 && i != 1440) {
            return false;
        }
        return true;
    }

    public static String k0(int i, TLRPC.User user, TL_account.TL_businessWorkHours tL_businessWorkHours) {
        int i2;
        if (tL_businessWorkHours == null) {
            return null;
        }
        ArrayList[] c0 = c0(tL_businessWorkHours.weekly_open);
        StringBuilder sb = new StringBuilder();
        if (user != null) {
            sb.append(jb6.a0(null, null, 2131752712, m9c.r(user)));
            sb.append("\n");
        }
        for (int i3 = 0; i3 < 7; i3++) {
            ArrayList arrayList = c0[i3];
            String displayName = DayOfWeek.values()[i3].getDisplayName(TextStyle.FULL, jb6.D0().y);
            sb.append(displayName.substring(0, 1).toUpperCase() + displayName.substring(1));
            sb.append(": ");
            if (f0(arrayList)) {
                sb.append(jb6.M0(2131752694, null));
            } else if (arrayList.isEmpty()) {
                sb.append(jb6.M0(2131752698, null));
            } else {
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    if (i4 > 0) {
                        sb.append(", ");
                    }
                    rs7 rs7Var = (rs7) arrayList.get(i4);
                    sb.append(rs7.a(rs7Var.a));
                    sb.append(" - ");
                    sb.append(rs7.a(rs7Var.b));
                }
            }
            sb.append("\n");
        }
        TLRPC.TL_timezone a = xqb.b(i).a(tL_businessWorkHours.timezone_id);
        int rawOffset = Calendar.getInstance().getTimeZone().getRawOffset() / 1000;
        if (a == null) {
            i2 = 0;
        } else {
            i2 = a.utc_offset;
        }
        if ((rawOffset - i2) / 60 != 0 && a != null) {
            xqb.b(i);
            sb.append(jb6.a0(null, null, 2131752713, xqb.e(a, true)));
        }
        return sb.toString();
    }

    public final void Z(int i) {
        rs7 rs7Var;
        rs7 rs7Var2 = null;
        if (this.f[i].isEmpty()) {
            rs7Var = null;
        } else {
            rs7Var = (rs7) b10.f(1, this.f[i]);
        }
        if (rs7Var != null) {
            int i2 = (i + 6) % 7;
            if (!this.f[i2].isEmpty()) {
                rs7Var2 = (rs7) b10.f(1, this.f[i2]);
            }
            if (rs7Var2 != null && rs7Var2.b > 1439) {
                rs7Var2.b = 1439;
                if (rs7Var2.a >= 1439) {
                    this.f[i2].remove(rs7Var2);
                }
                View B1 = this.a.B1(i2);
                if (B1 instanceof yn7) {
                    ((yn7) B1).setValue(d0(this.f[i2]));
                } else {
                    this.a.g3.O(true);
                }
            }
        }
    }

    public final void a0(boolean z) {
        if (this.b == null) {
            return;
        }
        this.b.a(e0(), z);
    }

    public final void b0(ArrayList arrayList) {
        String M0 = jb6.M0(2131752717, null);
        String M02 = jb6.M0(2131752702, null);
        c6c c6cVar = new c6c(2);
        c6cVar.m = M0;
        c6cVar.p = M02;
        c6cVar.k = 2131623939;
        arrayList.add(c6cVar);
        c6c i = c6c.i(-1, jb6.M0(2131752682, null));
        i.L(this.d);
        arrayList.add(i);
        arrayList.add(c6c.B(-100, null));
        if (this.d) {
            aq1.o(2131752717, null, arrayList);
            int i2 = 0;
            while (true) {
                ArrayList[] arrayListArr = this.f;
                if (i2 < arrayListArr.length) {
                    if (arrayListArr[i2] == null) {
                        arrayListArr[i2] = new ArrayList();
                    }
                    String displayName = DayOfWeek.values()[i2].getDisplayName(TextStyle.FULL, jb6.D0().y);
                    String d0 = d0(this.f[i2]);
                    c6c c6cVar2 = new c6c(5);
                    c6cVar2.d = i2;
                    c6cVar2.m = displayName.substring(0, 1).toUpperCase() + displayName.substring(1);
                    c6cVar2.n = d0;
                    c6cVar2.L(!this.f[i2].isEmpty());
                    arrayList.add(c6cVar2);
                    i2++;
                } else {
                    arrayList.add(c6c.B(-101, null));
                    arrayList.add(c6c.f(jb6.M0(2131752681, null), xqb.b(this.currentAccount).d(this.n, false), -2));
                    arrayList.add(c6c.B(-102, null));
                    return;
                }
            }
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231244);
        this.simpleActionBar.setTitle(jb6.M0(2131752717, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new wl5(this, (byte) 14));
        this.b = this.simpleActionBar.s(jb6.M0(2131745680, null));
        a0(false);
        FrameLayout frameLayout = new FrameLayout(context);
        q7c q7cVar = new q7c(this, new vt4(this, (byte) 23), new cj6(this, (byte) 21), null);
        this.a = q7cVar;
        q7cVar.r1();
        q7c q7cVar2 = this.a;
        q7cVar2.g3.r = false;
        q7cVar2.setSectionsDrawBackground(true);
        frameLayout.addView(this.a, qoe.c(-1.0f, -1));
        j0();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        l7c l7cVar;
        if (i == nm7.E0) {
            j0();
        } else if (i == nm7.t3) {
            if (this.e == null) {
                this.n = xqb.b(this.currentAccount).c();
            }
            q7c q7cVar = this.a;
            if (q7cVar != null && (l7cVar = q7cVar.g3) != null) {
                l7cVar.O(true);
            }
        }
    }

    public final boolean e0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ss7.e0():boolean");
    }

    public final void g0(View view, String str) {
        xqb b = xqb.b(this.currentAccount);
        this.n = str;
        ((xib) view).w(b.d(str, false), true);
        a0(true);
    }

    @Override
    public final r59 getListViewForSimpleGlass() {
        return this.a;
    }

    public final void h0(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            this.b.b(false);
            c41.e0(tL_error);
        } else if (tLObject instanceof TLRPC.TL_boolFalse) {
            if (getParentActivity() != null) {
                this.b.b(false);
                mlb.y(null, 2131743566, c41.b0(this), null);
            }
        } else if (!this.isFinished && !this.finishing) {
            finishFragment();
        }
    }

    public final void i0() {
        if (this.b.y.f) {
            return;
        }
        if (!e0()) {
            finishFragment();
            return;
        }
        this.b.b(true);
        TLRPC.UserFull X1 = getMessagesController().X1(getUserConfig().e());
        TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
        ArrayList[] arrayListArr = this.f;
        ArrayList arrayList = new ArrayList();
        if (arrayListArr != null) {
            for (int i = 0; i < arrayListArr.length; i++) {
                if (arrayListArr[i] != null) {
                    for (int i2 = 0; i2 < arrayListArr[i].size(); i2++) {
                        rs7 rs7Var = (rs7) arrayListArr[i].get(i2);
                        TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen = new TL_account.TL_businessWeeklyOpen();
                        int i3 = i * 1440;
                        tL_businessWeeklyOpen.start_minute = rs7Var.a + i3;
                        tL_businessWeeklyOpen.end_minute = i3 + rs7Var.b;
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
            if (X1 != null) {
                X1.flags2 |= 1;
                X1.business_work_hours = tL_businessWorkHours;
            }
        } else if (X1 != null) {
            X1.flags2 &= -2;
            X1.business_work_hours = null;
        }
        getConnectionsManager().sendRequest(updatebusinessworkhours, new r15(this, (byte) 16));
        getMessagesStorage().g2(X1, false);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        boolean z;
        l7c l7cVar;
        if (this.c) {
            return;
        }
        TLRPC.UserFull X1 = getMessagesController().X1(getUserConfig().e());
        if (X1 == null) {
            getMessagesController().k3(getClassGuid(), getUserConfig().f(), true);
            return;
        }
        TL_account.TL_businessWorkHours tL_businessWorkHours = X1.business_work_hours;
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
            this.e = c0(tL_businessWorkHours.weekly_open);
            this.f = c0(X1.business_work_hours.weekly_open);
        } else {
            String c = xqb.b(this.currentAccount).c();
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
                    this.f[i].add(new rs7(0, 1439));
                }
                i++;
            }
        }
        q7c q7cVar = this.a;
        if (q7cVar != null && (l7cVar = q7cVar.g3) != null) {
            l7cVar.O(true);
        }
        a0(false);
        this.c = true;
    }

    @Override
    public final boolean onFragmentCreate() {
        xqb.b(this.currentAccount).g();
        this.n = xqb.b(this.currentAccount).c();
        getNotificationCenter().b(this, nm7.E0);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, nm7.E0);
        super.onFragmentDestroy();
        i0();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
