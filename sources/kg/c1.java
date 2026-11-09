package kg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import c8.ha;
import di.r4;
import j$.time.DayOfWeek;
import j$.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.id;
import org.telegram.messenger.k5;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.Cells.h5;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.y31;
public final class c1 extends f2 implements ls {
    public r41 f17329a;
    public b5 f17330b;
    public boolean f17331c;
    public boolean d;
    public ArrayList[] f17332e;
    public ArrayList[] f17333f;
    public String h;
    public String f17334n;

    public c1() {
        super(null);
        this.f17332e = null;
        this.f17333f = new ArrayList[]{new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList()};
    }

    public static void Z(c1 c1Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error != null) {
            c1Var.f17330b.b(false);
            hc.d0(tL_error);
        } else if (tLObject instanceof TLRPC.TL_boolFalse) {
            if (c1Var.getParentActivity() != null) {
                c1Var.f17330b.b(false);
                k5.p(null, 2131743879, hc.a0(c1Var), null);
            }
        } else if (!c1Var.isFinished && !c1Var.finishing) {
            c1Var.finishFragment();
        }
    }

    public static void a0(c1 c1Var, ArrayList arrayList) {
        String M0 = id.M0(2131752764, null);
        String M02 = id.M0(2131752749, null);
        y31 y31Var = new y31(2);
        y31Var.f40568l = M0;
        y31Var.f40571o = M02;
        y31Var.f40567k = 2131623939;
        arrayList.add(y31Var);
        y31 i7 = y31.i(-1, id.M0(2131752729, null));
        i7.L(c1Var.d);
        arrayList.add(i7);
        arrayList.add(y31.B(-100, null));
        if (c1Var.d) {
            arrayList.add(y31.u(id.M0(2131752764, null)));
            int i10 = 0;
            while (true) {
                ArrayList[] arrayListArr = c1Var.f17333f;
                if (i10 < arrayListArr.length) {
                    if (arrayListArr[i10] == null) {
                        arrayListArr[i10] = new ArrayList();
                    }
                    String displayName = DayOfWeek.values()[i10].getDisplayName(TextStyle.FULL, id.E0().f23185y);
                    String f02 = f0(c1Var.f17333f[i10]);
                    y31 y31Var2 = new y31(5);
                    y31Var2.d = i10;
                    y31Var2.f40568l = displayName.substring(0, 1).toUpperCase() + displayName.substring(1);
                    y31Var2.f40569m = f02;
                    y31Var2.L(!c1Var.f17333f[i10].isEmpty());
                    arrayList.add(y31Var2);
                    i10++;
                } else {
                    arrayList.add(y31.B(-101, null));
                    arrayList.add(y31.f(id.M0(2131752728, null), x1.b(c1Var.currentAccount).d(c1Var.f17334n, false), -2));
                    arrayList.add(y31.B(-102, null));
                    return;
                }
            }
        }
    }

    public static void b0(c1 c1Var, View view, String str) {
        x1 b10 = x1.b(c1Var.currentAccount);
        c1Var.f17334n = str;
        ((m8) view).w(b10.d(str, false), true);
        c1Var.d0(true);
    }

    public static ArrayList[] e0(ArrayList arrayList) {
        int i7;
        ArrayList[] arrayListArr = new ArrayList[7];
        for (int i10 = 0; i10 < 7; i10++) {
            arrayListArr[i10] = new ArrayList();
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen = (TL_account.TL_businessWeeklyOpen) arrayList.get(i11);
            int i12 = tL_businessWeeklyOpen.start_minute;
            int i13 = i12 % 1440;
            arrayListArr[(i12 / 1440) % 7].add(new b1(i13, (tL_businessWeeklyOpen.end_minute - i12) + i13));
        }
        int i14 = 0;
        while (i14 < 7) {
            int i15 = i14 * 1440;
            int i16 = i14 + 1;
            int i17 = i16 * 1440;
            int i18 = i15;
            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen2 = (TL_account.TL_businessWeeklyOpen) arrayList.get(i19);
                if (tL_businessWeeklyOpen2.start_minute <= i18 && (i7 = tL_businessWeeklyOpen2.end_minute) >= i18) {
                    i18 = i7 + 1;
                }
            }
            if (i18 >= i17) {
                int i20 = (i14 + 6) % 7;
                if (!arrayListArr[i20].isEmpty() && ((b1) jg.g.i(1, arrayListArr[i20])).f17317b >= 1440) {
                    ((b1) jg.g.i(1, arrayListArr[i20])).f17317b = 1439;
                }
                int min = Math.min((i18 - i15) - 1, 2879);
                ArrayList arrayList2 = arrayListArr[(i14 + 8) % 7];
                if (min >= 1440 && !arrayList2.isEmpty() && ((b1) arrayList2.get(0)).f17316a < min - 1440) {
                    min = ((b1) arrayList2.get(0)).f17316a + 1439;
                }
                arrayListArr[i14].clear();
                arrayListArr[i14].add(new b1(0, min));
            } else {
                int i21 = i16 % 7;
                if (!arrayListArr[i14].isEmpty() && !arrayListArr[i21].isEmpty()) {
                    b1 b1Var = (b1) jg.g.i(1, arrayListArr[i14]);
                    b1 b1Var2 = (b1) arrayListArr[i21].get(0);
                    int i22 = b1Var.f17317b;
                    if (i22 > 1440 && i22 - 1439 == b1Var2.f17316a) {
                        b1Var.f17317b = 1439;
                        b1Var2.f17316a = 0;
                    }
                }
            }
            i14 = i16;
        }
        return arrayListArr;
    }

    public static String f0(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return id.M0(2131752755, null);
        }
        if (h0(arrayList)) {
            return id.M0(2131752754, null);
        }
        String str = "";
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            b1 b1Var = (b1) arrayList.get(i7);
            if (i7 > 0) {
                str = rf.b.r(str, "\n");
            }
            StringBuilder m10 = com.google.android.recaptcha.internal.a.m(str);
            m10.append(b1.a(b1Var.f17316a));
            m10.append(" - ");
            m10.append(b1.a(b1Var.f17317b));
            str = m10.toString();
        }
        return str;
    }

    public static boolean h0(ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        int i7 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            b1 b1Var = (b1) arrayList.get(i10);
            if (i7 < b1Var.f17316a) {
                return false;
            }
            i7 = b1Var.f17317b;
        }
        if (i7 != 1439 && i7 != 1440) {
            return false;
        }
        return true;
    }

    public static String k0(int i7, TLRPC.User user, TL_account.TL_businessWorkHours tL_businessWorkHours) {
        int i10;
        if (tL_businessWorkHours == null) {
            return null;
        }
        ArrayList[] e02 = e0(tL_businessWorkHours.weekly_open);
        StringBuilder sb2 = new StringBuilder();
        if (user != null) {
            sb2.append(id.a0(null, null, 2131752759, t10.p(user)));
            sb2.append("\n");
        }
        for (int i11 = 0; i11 < 7; i11++) {
            ArrayList arrayList = e02[i11];
            String displayName = DayOfWeek.values()[i11].getDisplayName(TextStyle.FULL, id.E0().f23185y);
            sb2.append(displayName.substring(0, 1).toUpperCase() + displayName.substring(1));
            sb2.append(": ");
            if (h0(arrayList)) {
                sb2.append(id.M0(2131752741, null));
            } else if (arrayList.isEmpty()) {
                sb2.append(id.M0(2131752745, null));
            } else {
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    if (i12 > 0) {
                        sb2.append(", ");
                    }
                    b1 b1Var = (b1) arrayList.get(i12);
                    sb2.append(b1.a(b1Var.f17316a));
                    sb2.append(" - ");
                    sb2.append(b1.a(b1Var.f17317b));
                }
            }
            sb2.append("\n");
        }
        TLRPC.TL_timezone a10 = x1.b(i7).a(tL_businessWorkHours.timezone_id);
        int rawOffset = Calendar.getInstance().getTimeZone().getRawOffset() / 1000;
        if (a10 == null) {
            i10 = 0;
        } else {
            i10 = a10.utc_offset;
        }
        if ((rawOffset - i10) / 60 != 0 && a10 != null) {
            x1.b(i7);
            sb2.append(id.a0(null, null, 2131752760, x1.e(a10, true)));
        }
        return sb2.toString();
    }

    public final void c0(int i7) {
        b1 b1Var;
        b1 b1Var2 = null;
        if (this.f17333f[i7].isEmpty()) {
            b1Var = null;
        } else {
            b1Var = (b1) jg.g.i(1, this.f17333f[i7]);
        }
        if (b1Var != null) {
            int i10 = (i7 + 6) % 7;
            if (!this.f17333f[i10].isEmpty()) {
                b1Var2 = (b1) jg.g.i(1, this.f17333f[i10]);
            }
            if (b1Var2 != null && b1Var2.f17317b > 1439) {
                b1Var2.f17317b = 1439;
                if (b1Var2.f17316a >= 1439) {
                    this.f17333f[i10].remove(b1Var2);
                }
                View B1 = this.f17329a.B1(i10);
                if (B1 instanceof h5) {
                    ((h5) B1).setValue(f0(this.f17333f[i10]));
                } else {
                    this.f17329a.f37556f3.O(true);
                }
            }
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(id.M0(2131752764, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.s(this, 16));
        this.f17330b = this.simpleActionBar.o(id.M0(2131745946, null));
        d0(false);
        FrameLayout frameLayout = new FrameLayout(context);
        r41 r41Var = new r41(this, new hi.u1(this, 11), new r4(this, 24), null);
        this.f17329a = r41Var;
        r41Var.r1();
        r41 r41Var2 = this.f17329a;
        r41Var2.f37556f3.f35945r = false;
        r41Var2.setSectionsDrawBackground(true);
        frameLayout.addView(this.f17329a, ha.c(-1.0f, -1));
        j0();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0(boolean z9) {
        if (this.f17330b == null) {
            return;
        }
        this.f17330b.a(g0(), z9);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        m41 m41Var;
        if (i7 == qs.E0) {
            j0();
        } else if (i7 == qs.f25067r3) {
            if (this.f17332e == null) {
                this.f17334n = x1.b(this.currentAccount).c();
            }
            r41 r41Var = this.f17329a;
            if (r41Var != null && (m41Var = r41Var.f37556f3) != null) {
                m41Var.O(true);
            }
        }
    }

    public final boolean g0() {
        throw new UnsupportedOperationException("Method not decompiled: kg.c1.g0():boolean");
    }

    @Override
    public final qj0 getListViewForSimpleGlass() {
        return this.f17329a;
    }

    public final void i0() {
        if (this.f17330b.f27360y.f55500f) {
            return;
        }
        if (!g0()) {
            finishFragment();
            return;
        }
        this.f17330b.b(true);
        TLRPC.UserFull b22 = getMessagesController().b2(getUserConfig().e());
        TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
        ArrayList[] arrayListArr = this.f17333f;
        ArrayList arrayList = new ArrayList();
        if (arrayListArr != null) {
            for (int i7 = 0; i7 < arrayListArr.length; i7++) {
                if (arrayListArr[i7] != null) {
                    for (int i10 = 0; i10 < arrayListArr[i7].size(); i10++) {
                        b1 b1Var = (b1) arrayListArr[i7].get(i10);
                        TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen = new TL_account.TL_businessWeeklyOpen();
                        int i11 = i7 * 1440;
                        tL_businessWeeklyOpen.start_minute = b1Var.f17316a + i11;
                        tL_businessWeeklyOpen.end_minute = i11 + b1Var.f17317b;
                        arrayList.add(tL_businessWeeklyOpen);
                    }
                }
            }
        }
        if (this.d && !arrayList.isEmpty()) {
            TL_account.TL_businessWorkHours tL_businessWorkHours = new TL_account.TL_businessWorkHours();
            tL_businessWorkHours.timezone_id = this.f17334n;
            tL_businessWorkHours.weekly_open.addAll(arrayList);
            updatebusinessworkhours.flags |= 1;
            updatebusinessworkhours.business_work_hours = tL_businessWorkHours;
            if (b22 != null) {
                b22.flags2 = 1 | b22.flags2;
                b22.business_work_hours = tL_businessWorkHours;
            }
        } else if (b22 != null) {
            b22.flags2 &= -2;
            b22.business_work_hours = null;
        }
        getConnectionsManager().sendRequest(updatebusinessworkhours, new bi.j0(this, 18));
        getMessagesStorage().j2(b22, false);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        boolean z9;
        m41 m41Var;
        if (this.f17331c) {
            return;
        }
        TLRPC.UserFull b22 = getMessagesController().b2(getUserConfig().e());
        if (b22 == null) {
            getMessagesController().g3(getUserConfig().f(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessWorkHours tL_businessWorkHours = b22.business_work_hours;
        if (tL_businessWorkHours != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.d = z9;
        if (z9) {
            String str = tL_businessWorkHours.timezone_id;
            this.f17334n = str;
            this.h = str;
            this.f17332e = e0(tL_businessWorkHours.weekly_open);
            this.f17333f = e0(b22.business_work_hours.weekly_open);
        } else {
            String c10 = x1.b(this.currentAccount).c();
            this.f17334n = c10;
            this.h = c10;
            this.f17332e = null;
            this.f17333f = new ArrayList[7];
            int i7 = 0;
            while (true) {
                ArrayList[] arrayListArr = this.f17333f;
                if (i7 >= arrayListArr.length) {
                    break;
                }
                arrayListArr[i7] = new ArrayList();
                if (i7 >= 0 && i7 < 5) {
                    this.f17333f[i7].add(new b1(0, 1439));
                }
                i7++;
            }
        }
        r41 r41Var = this.f17329a;
        if (r41Var != null && (m41Var = r41Var.f37556f3) != null) {
            m41Var.O(true);
        }
        d0(false);
        this.f17331c = true;
    }

    @Override
    public final boolean onFragmentCreate() {
        x1.b(this.currentAccount).g();
        this.f17334n = x1.b(this.currentAccount).c();
        getNotificationCenter().c(this, qs.E0);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, qs.E0);
        super.onFragmentDestroy();
        i0();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
