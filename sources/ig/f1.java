package ig;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import j$.time.DayOfWeek;
import j$.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.kk;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.i5;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.as;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.xc;
import w7.z5;
public final class f1 extends n2 implements NotificationCenter.NotificationCenterDelegate {
    public a71 f12892a;
    public as f12893b;
    public org.telegram.ui.ActionBar.u0 f12894c;
    public boolean d;
    public boolean e;
    public ArrayList[] f12895f;
    public ArrayList[] h;
    public String f12896n;
    public String f12897r;

    public f1() {
        super(null);
        this.f12895f = null;
        this.h = new ArrayList[]{new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList()};
    }

    public static void U(f1 f1Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error != null) {
            f1Var.f12893b.a(0.0f);
            xc.d0(tL_error);
        } else if (tLObject instanceof TLRPC.TL_boolFalse) {
            if (f1Var.getParentActivity() != null) {
                f1Var.f12893b.a(0.0f);
                kk.q(R.string.UnknownError, xc.a0(f1Var), null);
            }
        } else if (!f1Var.isFinished && !f1Var.finishing) {
            f1Var.finishFragment();
        }
    }

    public static void V(f1 f1Var, ArrayList arrayList) {
        String string = LocaleController.getString(R.string.BusinessHours);
        String string2 = LocaleController.getString(R.string.BusinessHoursInfo);
        int i10 = R.raw.biz_clock;
        f61 f61Var = new f61(2);
        f61Var.f26147l = string;
        f61Var.f26150o = string2;
        f61Var.f26146k = i10;
        arrayList.add(f61Var);
        f61 i11 = f61.i(-1, LocaleController.getString(R.string.BusinessHoursShow));
        i11.K(f1Var.e);
        arrayList.add(i11);
        arrayList.add(f61.A(-100, null));
        if (f1Var.e) {
            i2.d.p(R.string.BusinessHours, arrayList);
            int i12 = 0;
            while (true) {
                ArrayList[] arrayListArr = f1Var.h;
                if (i12 < arrayListArr.length) {
                    if (arrayListArr[i12] == null) {
                        arrayListArr[i12] = new ArrayList();
                    }
                    String displayName = DayOfWeek.values()[i12].getDisplayName(TextStyle.FULL, LocaleController.getInstance().getCurrentLocale());
                    String a02 = a0(f1Var.h[i12]);
                    f61 f61Var2 = new f61(5);
                    f61Var2.d = i12;
                    f61Var2.f26147l = displayName.substring(0, 1).toUpperCase() + displayName.substring(1);
                    f61Var2.f26148m = a02;
                    f61Var2.K(!f1Var.h[i12].isEmpty());
                    arrayList.add(f61Var2);
                    i12++;
                } else {
                    arrayList.add(f61.A(-101, null));
                    arrayList.add(f61.f(LocaleController.getString(R.string.BusinessHoursTimezone), f2.b(f1Var.currentAccount).d(f1Var.f12897r, false), -2));
                    arrayList.add(f61.A(-102, null));
                    return;
                }
            }
        }
    }

    public static void W(f1 f1Var, View view, String str) {
        f2 b10 = f2.b(f1Var.currentAccount);
        f1Var.f12897r = str;
        ((q8) view).u(b10.d(str, false), true);
        f1Var.Y(true);
    }

    public static ArrayList[] Z(ArrayList arrayList) {
        int i10;
        ArrayList[] arrayListArr = new ArrayList[7];
        for (int i11 = 0; i11 < 7; i11++) {
            arrayListArr[i11] = new ArrayList();
        }
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen = (TL_account.TL_businessWeeklyOpen) arrayList.get(i12);
            int i13 = tL_businessWeeklyOpen.start_minute;
            int i14 = i13 % 1440;
            arrayListArr[(i13 / 1440) % 7].add(new e1(i14, (tL_businessWeeklyOpen.end_minute - i13) + i14));
        }
        int i15 = 0;
        while (i15 < 7) {
            int i16 = i15 * 1440;
            int i17 = i15 + 1;
            int i18 = i17 * 1440;
            int i19 = i16;
            for (int i20 = 0; i20 < arrayList.size(); i20++) {
                TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen2 = (TL_account.TL_businessWeeklyOpen) arrayList.get(i20);
                if (tL_businessWeeklyOpen2.start_minute <= i19 && (i10 = tL_businessWeeklyOpen2.end_minute) >= i19) {
                    i19 = i10 + 1;
                }
            }
            if (i19 >= i18) {
                int i21 = (i15 + 6) % 7;
                if (!arrayListArr[i21].isEmpty() && ((e1) i2.d.h(1, arrayListArr[i21])).f12880b >= 1440) {
                    ((e1) i2.d.h(1, arrayListArr[i21])).f12880b = 1439;
                }
                int min = Math.min((i19 - i16) - 1, 2879);
                ArrayList arrayList2 = arrayListArr[(i15 + 8) % 7];
                if (min >= 1440 && !arrayList2.isEmpty() && ((e1) arrayList2.get(0)).f12879a < min - 1440) {
                    min = ((e1) arrayList2.get(0)).f12879a + 1439;
                }
                arrayListArr[i15].clear();
                arrayListArr[i15].add(new e1(0, min));
            } else {
                int i22 = i17 % 7;
                if (!arrayListArr[i15].isEmpty() && !arrayListArr[i22].isEmpty()) {
                    e1 e1Var = (e1) i2.d.h(1, arrayListArr[i15]);
                    e1 e1Var2 = (e1) arrayListArr[i22].get(0);
                    int i23 = e1Var.f12880b;
                    if (i23 > 1440 && i23 - 1439 == e1Var2.f12879a) {
                        e1Var.f12880b = 1439;
                        e1Var2.f12879a = 0;
                    }
                }
            }
            i15 = i17;
        }
        return arrayListArr;
    }

    public static String a0(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return LocaleController.getString(R.string.BusinessHoursDayClosed);
        }
        if (c0(arrayList)) {
            return LocaleController.getString(R.string.BusinessHoursDayFullOpened);
        }
        String str = "";
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            e1 e1Var = (e1) arrayList.get(i10);
            if (i10 > 0) {
                str = r4.c.u(str, "\n");
            }
            StringBuilder u10 = a1.g.u(str);
            u10.append(e1.a(e1Var.f12879a));
            u10.append(" - ");
            u10.append(e1.a(e1Var.f12880b));
            str = u10.toString();
        }
        return str;
    }

    public static boolean c0(ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            e1 e1Var = (e1) arrayList.get(i11);
            if (i10 < e1Var.f12879a) {
                return false;
            }
            i10 = e1Var.f12880b;
        }
        if (i10 != 1439 && i10 != 1440) {
            return false;
        }
        return true;
    }

    public static String f0(int i10, TLRPC.User user, TL_account.TL_businessWorkHours tL_businessWorkHours) {
        int i11;
        if (tL_businessWorkHours == null) {
            return null;
        }
        ArrayList[] Z = Z(tL_businessWorkHours.weekly_open);
        StringBuilder sb2 = new StringBuilder();
        if (user != null) {
            sb2.append(LocaleController.formatString(R.string.BusinessHoursCopyHeader, UserObject.getUserName(user)));
            sb2.append("\n");
        }
        for (int i12 = 0; i12 < 7; i12++) {
            ArrayList arrayList = Z[i12];
            String displayName = DayOfWeek.values()[i12].getDisplayName(TextStyle.FULL, LocaleController.getInstance().getCurrentLocale());
            sb2.append(displayName.substring(0, 1).toUpperCase() + displayName.substring(1));
            sb2.append(": ");
            if (c0(arrayList)) {
                sb2.append(LocaleController.getString(R.string.BusinessHoursProfileOpen));
            } else if (arrayList.isEmpty()) {
                sb2.append(LocaleController.getString(R.string.BusinessHoursProfileClose));
            } else {
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    if (i13 > 0) {
                        sb2.append(", ");
                    }
                    e1 e1Var = (e1) arrayList.get(i13);
                    sb2.append(e1.a(e1Var.f12879a));
                    sb2.append(" - ");
                    sb2.append(e1.a(e1Var.f12880b));
                }
            }
            sb2.append("\n");
        }
        TLRPC.TL_timezone a2 = f2.b(i10).a(tL_businessWorkHours.timezone_id);
        int rawOffset = Calendar.getInstance().getTimeZone().getRawOffset() / 1000;
        if (a2 == null) {
            i11 = 0;
        } else {
            i11 = a2.utc_offset;
        }
        if ((rawOffset - i11) / 60 != 0 && a2 != null) {
            int i14 = R.string.BusinessHoursCopyFooter;
            f2.b(i10);
            sb2.append(LocaleController.formatString(i14, f2.e(a2, true)));
        }
        return sb2.toString();
    }

    public final void X(int i10) {
        e1 e1Var;
        e1 e1Var2 = null;
        if (this.h[i10].isEmpty()) {
            e1Var = null;
        } else {
            e1Var = (e1) i2.d.h(1, this.h[i10]);
        }
        if (e1Var != null) {
            int i11 = (i10 + 6) % 7;
            if (!this.h[i11].isEmpty()) {
                e1Var2 = (e1) i2.d.h(1, this.h[i11]);
            }
            if (e1Var2 != null && e1Var2.f12880b > 1439) {
                e1Var2.f12880b = 1439;
                if (e1Var2.f12879a >= 1439) {
                    this.h[i11].remove(e1Var2);
                }
                View z12 = this.f12892a.z1(i11);
                if (z12 instanceof i5) {
                    ((i5) z12).setValue(a0(this.h[i11]));
                } else {
                    this.f12892a.W2.N(true);
                }
            }
        }
    }

    public final void Y(boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        if (this.f12894c == null) {
            return;
        }
        boolean b02 = b0();
        this.f12894c.setEnabled(b02);
        float f13 = 0.0f;
        if (z10) {
            ViewPropertyAnimator animate = this.f12894c.animate();
            if (b02) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f11);
            if (b02) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f12);
            if (b02) {
                f13 = 1.0f;
            }
            scaleX.scaleY(f13).setDuration(180L).start();
            return;
        }
        org.telegram.ui.ActionBar.u0 u0Var = this.f12894c;
        if (b02) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        u0Var.setAlpha(f7);
        org.telegram.ui.ActionBar.u0 u0Var2 = this.f12894c;
        if (b02) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        u0Var2.setScaleX(f10);
        org.telegram.ui.ActionBar.u0 u0Var3 = this.f12894c;
        if (b02) {
            f13 = 1.0f;
        }
        u0Var3.setScaleY(f13);
    }

    public final boolean b0() {
        throw new UnsupportedOperationException("Method not decompiled: ig.f1.b0():boolean");
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessHours));
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 16));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = h6.f21328v8;
        mutate.setColorFilter(new PorterDuffColorFilter(h6.x0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.f12893b = new as(mutate, new dq(h6.x0(null, i10, false)));
        this.f12894c = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f12893b);
        Y(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(h6.x0(null, h6.f20935a7, false));
        a71 a71Var = new a71(this, new hg.o(this, 8), new e1.c(this, 20), null);
        this.f12892a = a71Var;
        a71Var.p1();
        a71 a71Var2 = this.f12892a;
        a71Var2.W2.f30207r = false;
        frameLayout.addView(a71Var2, z5.d(-1.0f, -1));
        this.actionBar.A(this.f12892a, true);
        e0();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0() {
        if (this.f12893b.f24710c > 0.0f) {
            return;
        }
        if (!b0()) {
            finishFragment();
            return;
        }
        this.f12893b.a(1.0f);
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
        ArrayList[] arrayListArr = this.h;
        ArrayList arrayList = new ArrayList();
        if (arrayListArr != null) {
            for (int i10 = 0; i10 < arrayListArr.length; i10++) {
                if (arrayListArr[i10] != null) {
                    for (int i11 = 0; i11 < arrayListArr[i10].size(); i11++) {
                        e1 e1Var = (e1) arrayListArr[i10].get(i11);
                        TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen = new TL_account.TL_businessWeeklyOpen();
                        int i12 = i10 * 1440;
                        tL_businessWeeklyOpen.start_minute = e1Var.f12879a + i12;
                        tL_businessWeeklyOpen.end_minute = i12 + e1Var.f12880b;
                        arrayList.add(tL_businessWeeklyOpen);
                    }
                }
            }
        }
        if (this.e && !arrayList.isEmpty()) {
            TL_account.TL_businessWorkHours tL_businessWorkHours = new TL_account.TL_businessWorkHours();
            tL_businessWorkHours.timezone_id = this.f12897r;
            tL_businessWorkHours.weekly_open.addAll(arrayList);
            updatebusinessworkhours.flags |= 1;
            updatebusinessworkhours.business_work_hours = tL_businessWorkHours;
            if (userFull != null) {
                userFull.flags2 |= 1;
                userFull.business_work_hours = tL_businessWorkHours;
            }
        } else if (userFull != null) {
            userFull.flags2 &= -2;
            userFull.business_work_hours = null;
        }
        getConnectionsManager().sendRequest(updatebusinessworkhours, new ai.h(this, 20));
        getMessagesStorage().updateUserInfo(userFull, false);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        s61 s61Var;
        if (i10 == NotificationCenter.userInfoDidLoad) {
            e0();
        } else if (i10 == NotificationCenter.timezonesUpdated) {
            if (this.f12895f == null) {
                this.f12897r = f2.b(this.currentAccount).c();
            }
            a71 a71Var = this.f12892a;
            if (a71Var != null && (s61Var = a71Var.W2) != null) {
                s61Var.N(true);
            }
        }
    }

    public final void e0() {
        boolean z10;
        s61 s61Var;
        if (this.d) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessWorkHours tL_businessWorkHours = userFull.business_work_hours;
        if (tL_businessWorkHours != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.e = z10;
        if (z10) {
            String str = tL_businessWorkHours.timezone_id;
            this.f12897r = str;
            this.f12896n = str;
            this.f12895f = Z(tL_businessWorkHours.weekly_open);
            this.h = Z(userFull.business_work_hours.weekly_open);
        } else {
            String c10 = f2.b(this.currentAccount).c();
            this.f12897r = c10;
            this.f12896n = c10;
            this.f12895f = null;
            this.h = new ArrayList[7];
            int i10 = 0;
            while (true) {
                ArrayList[] arrayListArr = this.h;
                if (i10 >= arrayListArr.length) {
                    break;
                }
                arrayListArr[i10] = new ArrayList();
                if (i10 >= 0 && i10 < 5) {
                    this.h[i10].add(new e1(0, 1439));
                }
                i10++;
            }
        }
        a71 a71Var = this.f12892a;
        if (a71Var != null && (s61Var = a71Var.W2) != null) {
            s61Var.N(true);
        }
        Y(false);
        this.d = true;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        f2.b(this.currentAccount).g();
        this.f12897r = f2.b(this.currentAccount).c();
        getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        super.onFragmentDestroy();
        d0();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f12892a.setPadding(0, 0, 0, i13);
        this.f12892a.setClipToPadding(false);
    }
}
