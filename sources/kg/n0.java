package kg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import ci.r4;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.bd;
import org.telegram.messenger.g5;
import org.telegram.messenger.h10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.tj0;
public final class n0 extends tj0 implements z5 {
    public static final l0[] f17105k3 = {new l0(2131232686, 2131745417, new TLRPC.TL_inputMessagesFilterPhotoVideo(), 0), new l0(2131232685, 2131745420, new TLRPC.TL_inputMessagesFilterUrl(), 2), new l0(2131232684, 2131745424, new TLRPC.TL_inputMessagesFilterDocument(), 1), new l0(2131232687, 2131745415, new TLRPC.TL_inputMessagesFilterMusic(), 3), new l0(2131232689, 2131745412, new TLRPC.TL_inputMessagesFilterRoundVoice(), 5)};
    public static final Pattern f17106l3 = Pattern.compile("20[0-9]{1,2}");
    public static final Pattern f17107m3 = Pattern.compile("(\\w{3,}) ([0-9]{0,4})");
    public static final Pattern f17108n3 = Pattern.compile("([0-9]{0,4}) (\\w{2,})");
    public static final Pattern f17109o3 = Pattern.compile("^([0-9]{1,4})(\\.| |/|\\-)([0-9]{1,4})$");
    public static final Pattern f17110p3 = Pattern.compile("^([0-9]{1,2})(\\.| |/|\\-)([0-9]{1,2})(\\.| |/|\\-)([0-9]{1,4})$");
    public static final int[] f17111q3 = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public final ArrayList f17112f3;
    public final ArrayList f17113g3;
    public final f0 f17114h3;
    public boolean i3;
    public final i0 f17115j3;

    public n0(Context context, e6 e6Var) {
        super(context, e6Var);
        this.f17112f3 = new ArrayList();
        this.f17113g3 = new ArrayList();
        this.i3 = true;
        this.f17115j3 = new i0(this);
        f0 f0Var = new f0((Object) this, 0);
        this.f17114h3 = f0Var;
        f0Var.j1(0);
        setLayoutManager(f0Var);
        setAdapter(new r4(this, 1));
        i(new ei.l(3));
        setItemAnimator(new u4.k());
        setWillNotDraw(false);
        setHideIfEmpty(false);
        setSelectorRadius(org.telegram.messenger.g0.L(28.0f));
        r6.m(this, 20, k6.f27972i6, e6Var);
    }

    public static void A1(int i3, int i10, ArrayList arrayList) {
        int i11 = Calendar.getInstance().get(1);
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        if (i10 >= 2013 && i10 <= i11) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(i10, i3, 1, 0, 0, 0);
            long timeInMillis2 = calendar.getTimeInMillis();
            if (timeInMillis2 <= timeInMillis) {
                calendar.add(2, 1);
                arrayList.add(new j0(timeInMillis2, bd.E0().v0().format(timeInMillis2), calendar.getTimeInMillis() - 1));
            }
        }
    }

    public static void B1(String str, ArrayList arrayList) {
        arrayList.clear();
        if (str != null) {
            String trim = str.trim();
            if (trim.length() >= 3) {
                if (!bd.M0(2131745718, null).toLowerCase().startsWith(trim) && !"today".startsWith(trim)) {
                    if (!bd.M0(2131745717, null).toLowerCase().startsWith(trim) && !"yesterday".startsWith(trim)) {
                        Calendar calendar = Calendar.getInstance();
                        int i3 = -1;
                        if (trim.length() > 3) {
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE", Locale.ENGLISH);
                            for (int i10 = 0; i10 < 7; i10++) {
                                calendar.set(7, i10);
                                if (bd.E0().B0().format(calendar.getTime()).toLowerCase().startsWith(trim) || simpleDateFormat.format(calendar.getTime()).toLowerCase().startsWith(trim)) {
                                    i3 = i10;
                                    break;
                                }
                            }
                        }
                        if (i3 >= 0) {
                            Calendar calendar2 = Calendar.getInstance();
                            long timeInMillis = calendar2.getTimeInMillis();
                            calendar2.set(7, i3);
                            if (calendar2.getTimeInMillis() > timeInMillis) {
                                calendar2.setTimeInMillis(calendar2.getTimeInMillis() - 604800000);
                            }
                            int i11 = calendar2.get(1);
                            int i12 = calendar2.get(2);
                            int i13 = calendar2.get(5);
                            calendar2.set(i11, i12, i13, 0, 0, 0);
                            long timeInMillis2 = calendar2.getTimeInMillis();
                            calendar2.set(i11, i12, i13 + 1, 0, 0, 0);
                            arrayList.add(new j0(timeInMillis2, bd.E0().B0().format(timeInMillis2), calendar2.getTimeInMillis() - 1));
                            return;
                        }
                        Matcher matcher = f17109o3.matcher(trim);
                        if (matcher.matches()) {
                            String group = matcher.group(1);
                            String group2 = matcher.group(3);
                            int parseInt = Integer.parseInt(group);
                            int parseInt2 = Integer.parseInt(group2);
                            if (parseInt > 0 && parseInt <= 31) {
                                if (parseInt2 >= 2013 && parseInt <= 12) {
                                    A1(parseInt - 1, parseInt2, arrayList);
                                    return;
                                } else if (parseInt2 <= 12) {
                                    z1(parseInt - 1, parseInt2 - 1, arrayList);
                                    return;
                                } else {
                                    return;
                                }
                            } else if (parseInt >= 2013 && parseInt2 <= 12) {
                                A1(parseInt2 - 1, parseInt, arrayList);
                                return;
                            } else {
                                return;
                            }
                        }
                        Matcher matcher2 = f17110p3.matcher(trim);
                        if (matcher2.matches()) {
                            String group3 = matcher2.group(1);
                            String group4 = matcher2.group(3);
                            String group5 = matcher2.group(5);
                            if (matcher2.group(2).equals(matcher2.group(4))) {
                                int parseInt3 = Integer.parseInt(group3);
                                int parseInt4 = Integer.parseInt(group4) - 1;
                                int parseInt5 = Integer.parseInt(group5);
                                if (parseInt5 >= 10 && parseInt5 <= 99) {
                                    parseInt5 += 2000;
                                }
                                int i14 = parseInt5;
                                int i15 = Calendar.getInstance().get(1);
                                int i16 = parseInt3 - 1;
                                if (parseInt4 >= 0 && parseInt4 < 12 && i16 >= 0 && i16 < f17111q3[parseInt4] && i14 >= 2013 && i14 <= i15) {
                                    Calendar calendar3 = Calendar.getInstance();
                                    calendar3.set(i14, parseInt4, parseInt3, 0, 0, 0);
                                    long timeInMillis3 = calendar3.getTimeInMillis();
                                    calendar3.set(i14, parseInt4, parseInt3 + 1, 0, 0, 0);
                                    arrayList.add(new j0(timeInMillis3, bd.E0().D0().format(timeInMillis3), calendar3.getTimeInMillis() - 1));
                                    return;
                                }
                                return;
                            }
                            return;
                        } else if (f17106l3.matcher(trim).matches()) {
                            int intValue = Integer.valueOf(trim).intValue();
                            int i17 = Calendar.getInstance().get(1);
                            if (intValue < 2013) {
                                while (i17 >= 2013) {
                                    Calendar calendar4 = Calendar.getInstance();
                                    calendar4.set(i17, 0, 1, 0, 0, 0);
                                    long timeInMillis4 = calendar4.getTimeInMillis();
                                    calendar4.set(i17 + 1, 0, 1, 0, 0, 0);
                                    arrayList.add(new j0(timeInMillis4, Integer.toString(i17), calendar4.getTimeInMillis() - 1));
                                    i17--;
                                }
                                return;
                            } else if (intValue <= i17) {
                                Calendar calendar5 = Calendar.getInstance();
                                calendar5.set(intValue, 0, 1, 0, 0, 0);
                                long timeInMillis5 = calendar5.getTimeInMillis();
                                calendar5.set(intValue + 1, 0, 1, 0, 0, 0);
                                arrayList.add(new j0(timeInMillis5, Integer.toString(intValue), calendar5.getTimeInMillis() - 1));
                                return;
                            } else {
                                return;
                            }
                        } else {
                            Matcher matcher3 = f17107m3.matcher(trim);
                            if (matcher3.matches()) {
                                String group6 = matcher3.group(1);
                                String group7 = matcher3.group(2);
                                int C1 = C1(group6);
                                if (C1 >= 0) {
                                    int intValue2 = Integer.valueOf(group7).intValue();
                                    if (intValue2 > 0 && intValue2 <= 31) {
                                        z1(intValue2 - 1, C1, arrayList);
                                        return;
                                    } else if (intValue2 >= 2013) {
                                        A1(C1, intValue2, arrayList);
                                        return;
                                    }
                                }
                            }
                            Matcher matcher4 = f17108n3.matcher(trim);
                            if (matcher4.matches()) {
                                String group8 = matcher4.group(1);
                                int C12 = C1(matcher4.group(2));
                                if (C12 >= 0) {
                                    int intValue3 = Integer.valueOf(group8).intValue();
                                    if (intValue3 > 0 && intValue3 <= 31) {
                                        z1(intValue3 - 1, C12, arrayList);
                                        return;
                                    } else if (intValue3 >= 2013) {
                                        A1(C12, intValue3, arrayList);
                                    }
                                }
                            }
                            if (!TextUtils.isEmpty(trim) && trim.length() > 2) {
                                int C13 = C1(trim);
                                long timeInMillis6 = Calendar.getInstance().getTimeInMillis();
                                if (C13 >= 0) {
                                    for (int i18 = Calendar.getInstance().get(1); i18 >= 2013; i18--) {
                                        Calendar calendar6 = Calendar.getInstance();
                                        calendar6.set(i18, C13, 1, 0, 0, 0);
                                        long timeInMillis7 = calendar6.getTimeInMillis();
                                        if (timeInMillis7 <= timeInMillis6) {
                                            calendar6.add(2, 1);
                                            arrayList.add(new j0(timeInMillis7, bd.E0().v0().format(timeInMillis7), calendar6.getTimeInMillis() - 1));
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                    Calendar calendar7 = Calendar.getInstance();
                    int i19 = calendar7.get(1);
                    int i20 = calendar7.get(2);
                    int i21 = calendar7.get(5);
                    calendar7.set(i19, i20, i21, 0, 0, 0);
                    calendar7.set(i19, i20, i21 + 1, 0, 0, 0);
                    arrayList.add(new j0(calendar7.getTimeInMillis() - 86400000, bd.M0(2131745717, null), calendar7.getTimeInMillis() - 86400001));
                    return;
                }
                Calendar calendar8 = Calendar.getInstance();
                int i22 = calendar8.get(1);
                int i23 = calendar8.get(2);
                int i24 = calendar8.get(5);
                calendar8.set(i22, i23, i24, 0, 0, 0);
                long timeInMillis8 = calendar8.getTimeInMillis();
                calendar8.set(i22, i23, i24 + 1, 0, 0, 0);
                arrayList.add(new j0(timeInMillis8, bd.M0(2131745718, null), calendar8.getTimeInMillis() - 1));
            }
        }
    }

    public static int C1(String str) {
        String[] strArr = {bd.M0(2131749094, null).toLowerCase(), bd.M0(2131750830, null).toLowerCase(), bd.M0(2131748691, null).toLowerCase(), bd.M0(2131754173, null).toLowerCase(), bd.M0(2131748670, null).toLowerCase(), bd.M0(2131749072, null).toLowerCase(), bd.M0(2131749074, null).toLowerCase(), bd.M0(2131753895, null).toLowerCase(), bd.M0(2131745575, null).toLowerCase(), bd.M0(2131747838, null).toLowerCase(), bd.M0(2131747843, null).toLowerCase(), bd.M0(2131751606, null).toLowerCase()};
        String[] strArr2 = new String[12];
        Calendar calendar = Calendar.getInstance();
        for (int i3 = 1; i3 <= 12; i3++) {
            calendar.set(0, 0, 0, 0, 0, 0);
            calendar.set(2, i3);
            strArr2[i3 - 1] = calendar.getDisplayName(2, 2, Locale.ENGLISH).toLowerCase();
        }
        for (int i10 = 0; i10 < 12; i10++) {
            if (strArr2[i10].startsWith(str) || strArr[i10].startsWith(str)) {
                return i10;
            }
        }
        return -1;
    }

    public static void z1(int i3, int i10, ArrayList arrayList) {
        int i11 = i10;
        if (i11 >= 0 && i11 < 12 && i3 >= 0 && i3 < f17111q3[i11]) {
            int i12 = Calendar.getInstance().get(1);
            long timeInMillis = Calendar.getInstance().getTimeInMillis();
            GregorianCalendar gregorianCalendar = (GregorianCalendar) Calendar.getInstance();
            int i13 = i12;
            while (i13 >= 2013) {
                if (i11 != 1 || i3 != 28 || gregorianCalendar.isLeapYear(i13)) {
                    Calendar calendar = Calendar.getInstance();
                    calendar.set(i13, i11, i3 + 1, 0, 0, 0);
                    long timeInMillis2 = calendar.getTimeInMillis();
                    if (timeInMillis2 <= timeInMillis) {
                        calendar.set(i13, i10, i3 + 2, 0, 0, 0);
                        long timeInMillis3 = calendar.getTimeInMillis() - 1;
                        if (i13 == i12) {
                            arrayList.add(new j0(timeInMillis2, bd.E0().q0().format(timeInMillis2), timeInMillis3));
                        } else {
                            arrayList.add(new j0(timeInMillis2, bd.E0().D0().format(timeInMillis2), timeInMillis3));
                        }
                    }
                }
                i13--;
                i11 = i10;
            }
        }
    }

    public final void D1(ArrayList arrayList, ArrayList arrayList2, boolean z10) {
        String m10;
        ArrayList arrayList3 = this.f17113g3;
        arrayList3.clear();
        ArrayList arrayList4 = this.f17112f3;
        arrayList3.addAll(arrayList4);
        arrayList4.clear();
        if (arrayList != null) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                Object obj = arrayList.get(i3);
                if (obj instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) obj;
                    if (h10.i(h10.f22829t0).f().f27150id == user.f27150id) {
                        m10 = bd.M0(2131745911, null);
                    } else {
                        m10 = g5.m(10, user.first_name, user.last_name);
                    }
                    l0 l0Var = new l0(2131232688, 4, m10);
                    l0Var.f17084f = user;
                    arrayList4.add(l0Var);
                } else if (obj instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) obj;
                    String str = chat.title;
                    if (str.length() > 12) {
                        str = t4.c.q(str.substring(0, 10), "...");
                    }
                    l0 l0Var2 = new l0(2131232688, 4, str);
                    l0Var2.f17084f = chat;
                    arrayList4.add(l0Var2);
                }
            }
        }
        if (arrayList2 != null) {
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                j0 j0Var = (j0) arrayList2.get(i10);
                l0 l0Var3 = new l0(2131232683, 6, j0Var.f17056a);
                l0Var3.f17085g = j0Var;
                arrayList4.add(l0Var3);
            }
        }
        if (z10) {
            arrayList4.add(new l0(2131230993, 2131754150, null, 7));
        }
        if (getAdapter() != null) {
            ba.i iVar = new ba.i(3, getAdapter(), false);
            u4.o.c(this.f17115j3, true).b(iVar);
            if (!arrayList4.isEmpty() && iVar.f3186b) {
                this.f17114h3.h1(0, 0);
            }
        }
    }

    public ArrayList<t6> getThemeDescriptions() {
        ArrayList<t6> arrayList = new ArrayList<>();
        arrayList.add(new t6(this, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (s6) null, k6.f27899e7));
        arrayList.add(new t6(this, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (s6) null, k6.f27918f7));
        return arrayList;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.i3) {
            canvas.drawRect(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), k6.f28002k0);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void updateColors() {
        for (int i3 = 0; i3 < getCachedChildCount(); i3++) {
            View P = P(i3);
            if (P instanceof k0) {
                ((k0) P).updateColors();
            }
        }
        for (int i10 = 0; i10 < getAttachedScrapChildCount(); i10++) {
            View O = O(i10);
            if (O instanceof k0) {
                ((k0) O).updateColors();
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
