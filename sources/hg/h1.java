package hg;

import ai.n8;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import ei.d5;
import j$.time.DayOfWeek;
import j$.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.ok;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Cells.j5;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.up;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.xc;
import w7.y5;
public final class h1 extends m2 implements NotificationCenter.NotificationCenterDelegate {
    public r61 f10288a;
    public qr f10289b;
    public org.telegram.ui.ActionBar.u0 f10290c;
    public boolean d;
    public boolean e;
    public ArrayList[] f10291f;
    public ArrayList[] h;
    public String f10292n;
    public String f10293r;

    public h1() {
        super(null);
        this.f10291f = null;
        this.h = new ArrayList[]{new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList()};
    }

    public static void U(h1 h1Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error != null) {
            h1Var.f10289b.a(0.0f);
            xc.b0(tL_error);
        } else if (tLObject instanceof TLRPC.TL_boolFalse) {
            if (h1Var.getParentActivity() != null) {
                h1Var.f10289b.a(0.0f);
                ok.p(R.string.UnknownError, xc.a0(h1Var), null);
            }
        } else if (!h1Var.isFinished && !h1Var.finishing) {
            h1Var.finishFragment();
        }
    }

    public static void V(h1 h1Var, ArrayList arrayList) {
        String string = LocaleController.getString(R.string.BusinessHours);
        String string2 = LocaleController.getString(R.string.BusinessHoursInfo);
        int i10 = R.raw.biz_clock;
        v51 v51Var = new v51(2);
        v51Var.f29048l = string;
        v51Var.f29051o = string2;
        v51Var.f29047k = i10;
        arrayList.add(v51Var);
        v51 i11 = v51.i(-1, LocaleController.getString(R.string.BusinessHoursShow));
        i11.K(h1Var.e);
        arrayList.add(i11);
        arrayList.add(v51.A(-100, null));
        if (h1Var.e) {
            com.google.android.gms.internal.vision.e2.n(R.string.BusinessHours, arrayList);
            int i12 = 0;
            while (true) {
                ArrayList[] arrayListArr = h1Var.h;
                if (i12 < arrayListArr.length) {
                    if (arrayListArr[i12] == null) {
                        arrayListArr[i12] = new ArrayList();
                    }
                    String displayName = DayOfWeek.values()[i12].getDisplayName(TextStyle.FULL, LocaleController.getInstance().getCurrentLocale());
                    String a02 = a0(h1Var.h[i12]);
                    v51 v51Var2 = new v51(5);
                    v51Var2.d = i12;
                    v51Var2.f29048l = displayName.substring(0, 1).toUpperCase() + displayName.substring(1);
                    v51Var2.f29049m = a02;
                    v51Var2.K(!h1Var.h[i12].isEmpty());
                    arrayList.add(v51Var2);
                    i12++;
                } else {
                    arrayList.add(v51.A(-101, null));
                    arrayList.add(v51.f(LocaleController.getString(R.string.BusinessHoursTimezone), g2.b(h1Var.currentAccount).d(h1Var.f10293r, false), -2));
                    arrayList.add(v51.A(-102, null));
                    return;
                }
            }
        }
    }

    public static void W(h1 h1Var, View view, String str) {
        g2 b10 = g2.b(h1Var.currentAccount);
        h1Var.f10293r = str;
        ((r8) view).u(b10.d(str, false), true);
        h1Var.Y(true);
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
            arrayListArr[(i13 / 1440) % 7].add(new g1(i14, (tL_businessWeeklyOpen.end_minute - i13) + i14));
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
                if (!arrayListArr[i21].isEmpty() && ((g1) c.g(1, arrayListArr[i21])).f10278b >= 1440) {
                    ((g1) c.g(1, arrayListArr[i21])).f10278b = 1439;
                }
                int min = Math.min((i19 - i16) - 1, 2879);
                ArrayList arrayList2 = arrayListArr[(i15 + 8) % 7];
                if (min >= 1440 && !arrayList2.isEmpty() && ((g1) arrayList2.get(0)).f10277a < min - 1440) {
                    min = ((g1) arrayList2.get(0)).f10277a + 1439;
                }
                arrayListArr[i15].clear();
                arrayListArr[i15].add(new g1(0, min));
            } else {
                int i22 = i17 % 7;
                if (!arrayListArr[i15].isEmpty() && !arrayListArr[i22].isEmpty()) {
                    g1 g1Var = (g1) c.g(1, arrayListArr[i15]);
                    g1 g1Var2 = (g1) arrayListArr[i22].get(0);
                    int i23 = g1Var.f10278b;
                    if (i23 > 1440 && i23 - 1439 == g1Var2.f10277a) {
                        g1Var.f10278b = 1439;
                        g1Var2.f10277a = 0;
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
            g1 g1Var = (g1) arrayList.get(i10);
            if (i10 > 0) {
                str = v7.j.t(str, "\n");
            }
            StringBuilder v = a4.a.v(str);
            v.append(g1.a(g1Var.f10277a));
            v.append(" - ");
            v.append(g1.a(g1Var.f10278b));
            str = v.toString();
        }
        return str;
    }

    public static boolean c0(ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            g1 g1Var = (g1) arrayList.get(i11);
            if (i10 < g1Var.f10277a) {
                return false;
            }
            i10 = g1Var.f10278b;
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
                    g1 g1Var = (g1) arrayList.get(i13);
                    sb2.append(g1.a(g1Var.f10277a));
                    sb2.append(" - ");
                    sb2.append(g1.a(g1Var.f10278b));
                }
            }
            sb2.append("\n");
        }
        TLRPC.TL_timezone a2 = g2.b(i10).a(tL_businessWorkHours.timezone_id);
        int rawOffset = Calendar.getInstance().getTimeZone().getRawOffset() / 1000;
        if (a2 == null) {
            i11 = 0;
        } else {
            i11 = a2.utc_offset;
        }
        if ((rawOffset - i11) / 60 != 0 && a2 != null) {
            int i14 = R.string.BusinessHoursCopyFooter;
            g2.b(i10);
            sb2.append(LocaleController.formatString(i14, g2.e(a2, true)));
        }
        return sb2.toString();
    }

    public final void X(int i10) {
        g1 g1Var;
        g1 g1Var2 = null;
        if (this.h[i10].isEmpty()) {
            g1Var = null;
        } else {
            g1Var = (g1) c.g(1, this.h[i10]);
        }
        if (g1Var != null) {
            int i11 = (i10 + 6) % 7;
            if (!this.h[i11].isEmpty()) {
                g1Var2 = (g1) c.g(1, this.h[i11]);
            }
            if (g1Var2 != null && g1Var2.f10278b > 1439) {
                g1Var2.f10278b = 1439;
                if (g1Var2.f10277a >= 1439) {
                    this.h[i11].remove(g1Var2);
                }
                View y12 = this.f10288a.y1(i11);
                if (y12 instanceof j5) {
                    ((j5) y12).setValue(a0(this.h[i11]));
                } else {
                    this.f10288a.Y2.N(true);
                }
            }
        }
    }

    public final void Y(boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        if (this.f10290c == null) {
            return;
        }
        boolean b02 = b0();
        this.f10290c.setEnabled(b02);
        float f13 = 0.0f;
        if (z10) {
            ViewPropertyAnimator animate = this.f10290c.animate();
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
        org.telegram.ui.ActionBar.u0 u0Var = this.f10290c;
        if (b02) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        u0Var.setAlpha(f7);
        org.telegram.ui.ActionBar.u0 u0Var2 = this.f10290c;
        if (b02) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        u0Var2.setScaleX(f10);
        org.telegram.ui.ActionBar.u0 u0Var3 = this.f10290c;
        if (b02) {
            f13 = 1.0f;
        }
        u0Var3.setScaleY(f13);
    }

    public final boolean b0() {
        throw new UnsupportedOperationException("Method not decompiled: hg.h1.b0():boolean");
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessHours));
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 14));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = h6.f19392v8;
        mutate.setColorFilter(new PorterDuffColorFilter(h6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.f10289b = new qr(mutate, new up(h6.w0(null, i10, false)));
        this.f10290c = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f10289b);
        Y(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(h6.w0(null, h6.f19003a7, false));
        r61 r61Var = new r61(this, new bi.v(this, 27), new d5(this, 3), null);
        this.f10288a = r61Var;
        r61Var.p1();
        r61 r61Var2 = this.f10288a;
        r61Var2.Y2.f25290r = false;
        frameLayout.addView(r61Var2, y5.c(-1.0f, -1));
        this.actionBar.z(this.f10288a, true);
        e0();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0() {
        if (this.f10289b.f27751c > 0.0f) {
            return;
        }
        if (!b0()) {
            finishFragment();
            return;
        }
        this.f10289b.a(1.0f);
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
        ArrayList[] arrayListArr = this.h;
        ArrayList arrayList = new ArrayList();
        if (arrayListArr != null) {
            for (int i10 = 0; i10 < arrayListArr.length; i10++) {
                if (arrayListArr[i10] != null) {
                    for (int i11 = 0; i11 < arrayListArr[i10].size(); i11++) {
                        g1 g1Var = (g1) arrayListArr[i10].get(i11);
                        TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen = new TL_account.TL_businessWeeklyOpen();
                        int i12 = i10 * 1440;
                        tL_businessWeeklyOpen.start_minute = g1Var.f10277a + i12;
                        tL_businessWeeklyOpen.end_minute = i12 + g1Var.f10278b;
                        arrayList.add(tL_businessWeeklyOpen);
                    }
                }
            }
        }
        if (this.e && !arrayList.isEmpty()) {
            TL_account.TL_businessWorkHours tL_businessWorkHours = new TL_account.TL_businessWorkHours();
            tL_businessWorkHours.timezone_id = this.f10293r;
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
        getConnectionsManager().sendRequest(updatebusinessworkhours, new n8(this, 14));
        getMessagesStorage().updateUserInfo(userFull, false);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        j61 j61Var;
        if (i10 == NotificationCenter.userInfoDidLoad) {
            e0();
        } else if (i10 == NotificationCenter.timezonesUpdated) {
            if (this.f10291f == null) {
                this.f10293r = g2.b(this.currentAccount).c();
            }
            r61 r61Var = this.f10288a;
            if (r61Var != null && (j61Var = r61Var.Y2) != null) {
                j61Var.N(true);
            }
        }
    }

    public final void e0() {
        boolean z10;
        j61 j61Var;
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
            this.f10293r = str;
            this.f10292n = str;
            this.f10291f = Z(tL_businessWorkHours.weekly_open);
            this.h = Z(userFull.business_work_hours.weekly_open);
        } else {
            String c10 = g2.b(this.currentAccount).c();
            this.f10293r = c10;
            this.f10292n = c10;
            this.f10291f = null;
            this.h = new ArrayList[7];
            int i10 = 0;
            while (true) {
                ArrayList[] arrayListArr = this.h;
                if (i10 >= arrayListArr.length) {
                    break;
                }
                arrayListArr[i10] = new ArrayList();
                if (i10 >= 0 && i10 < 5) {
                    this.h[i10].add(new g1(0, 1439));
                }
                i10++;
            }
        }
        r61 r61Var = this.f10288a;
        if (r61Var != null && (j61Var = r61Var.Y2) != null) {
            j61Var.N(true);
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
        g2.b(this.currentAccount).g();
        this.f10293r = g2.b(this.currentAccount).c();
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
        this.f10288a.setPadding(0, 0, 0, i13);
        this.f10288a.setClipToPadding(false);
    }
}
